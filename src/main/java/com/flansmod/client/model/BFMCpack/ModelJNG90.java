//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: JNG90
// Model Creator: 
// Created on: 28.07.2022 - 14:23:42
// Last changed on: 28.07.2022 - 14:23:42

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelJNG90 extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelJNG90() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[599];
        defaultBarrelModel = new ModelRendererTurbo[43];
        ammoModel = new ModelRendererTurbo[8];
        pumpModel = new ModelRendererTurbo[15];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initammoModel_1();
        initpumpModel_1();

        barrelAttachPoint = new Vector3f(360F / 16F, 69.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(185F / 16F, 69F / 16F, -14F / 16F);
        scopeAttachPoint = new Vector3f(56F / 16F, 85.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(188 / 16F, 50F / 16F, 0F / 16F);

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
        leftHandAmmo = true;
        leftArmPos = new Vector3f(0.17F, -0.5F, 0.0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0.0F);
        rightArmPos = new Vector3f(0.255F, -0.56F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.255F, -0.56F, 0.0F);
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

        translateAll(0F, -16F, 0F);

        //修正模型位移
        Vector3f vec3 = new Vector3f(10F, 10F, 0F);
        translateAll(vec3.x, -vec3.y, vec3.z);
        Vector3f attVec = new Vector3f(vec3.x / 16F, vec3.y / 16F, vec3.z / 16F);
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, attVec, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, attVec, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, attVec, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, attVec, null);
        stockAttachPoint = Vector3f.add(stockAttachPoint, attVec, null);

        ShakeDistance = 0.7F;
        crouchZoom = -0.1F;
        zoomOffset = 0.3F;
        zoomOffsetY = -0.03F;
        gunOffset = -0.75F;
        flipAll();

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        pumpHandlePoint = new Vector3f(0.0F, 79F / 16F, 0.0F);
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Import
        gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Import
        gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Import
        gunModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Import
        gunModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Import
        gunModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Import
        gunModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Import
        gunModel[7] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Import
        gunModel[8] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Import
        gunModel[9] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Import
        gunModel[10] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Import
        gunModel[11] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Import
        gunModel[12] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Import
        gunModel[13] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Import
        gunModel[14] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Import
        gunModel[15] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Import
        gunModel[16] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Import
        gunModel[17] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Import
        gunModel[18] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import Import
        gunModel[19] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import Import
        gunModel[20] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Import Import
        gunModel[21] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Import Import
        gunModel[22] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Import Import
        gunModel[23] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Import Import
        gunModel[24] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Import Import
        gunModel[25] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Import
        gunModel[26] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Import Import
        gunModel[27] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Import Import
        gunModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Import
        gunModel[29] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Import
        gunModel[30] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Import
        gunModel[31] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Import
        gunModel[32] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Import Import
        gunModel[33] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Import Import
        gunModel[34] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Import
        gunModel[35] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Import
        gunModel[36] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Import
        gunModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Import
        gunModel[38] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Import
        gunModel[39] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Import
        gunModel[40] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Import
        gunModel[41] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import Import
        gunModel[42] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Import Import
        gunModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Import
        gunModel[44] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Import Import
        gunModel[45] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import Import
        gunModel[46] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Import Import
        gunModel[47] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Import Import
        gunModel[48] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Import
        gunModel[49] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Import
        gunModel[50] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Import
        gunModel[51] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import Import
        gunModel[52] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Import
        gunModel[53] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Import
        gunModel[54] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Import
        gunModel[55] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Import
        gunModel[56] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Import
        gunModel[57] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Import Import
        gunModel[58] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Import
        gunModel[59] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Import
        gunModel[60] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Import
        gunModel[61] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Import Import
        gunModel[62] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import Import
        gunModel[63] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Import Import
        gunModel[64] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import Import
        gunModel[65] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import Import
        gunModel[66] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Import
        gunModel[67] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Import
        gunModel[68] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Import Import
        gunModel[69] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Import
        gunModel[70] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import Import
        gunModel[71] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Import Import
        gunModel[72] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import Import
        gunModel[73] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Import Import
        gunModel[74] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Import Import
        gunModel[75] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Import Import
        gunModel[76] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Import Import
        gunModel[77] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import Import
        gunModel[78] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Import Import
        gunModel[79] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Import Import
        gunModel[80] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Import Import
        gunModel[81] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Import
        gunModel[82] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Import Import
        gunModel[83] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Import Import
        gunModel[84] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Import Import
        gunModel[85] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Import
        gunModel[86] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import Import
        gunModel[87] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Import Import
        gunModel[88] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import Import
        gunModel[89] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Import Import
        gunModel[90] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Import Import
        gunModel[91] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import Import
        gunModel[92] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import Import
        gunModel[93] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Import Import
        gunModel[94] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Import Import
        gunModel[95] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Import Import
        gunModel[96] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Import Import
        gunModel[97] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Import Import
        gunModel[98] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import Import
        gunModel[99] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Import Import
        gunModel[100] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Import
        gunModel[101] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Import Import
        gunModel[102] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Import Import
        gunModel[103] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Import Import
        gunModel[104] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import Import
        gunModel[105] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Import
        gunModel[106] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Import
        gunModel[107] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import Import
        gunModel[108] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Import Import
        gunModel[109] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import Import
        gunModel[110] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Import
        gunModel[111] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Import
        gunModel[112] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Import
        gunModel[113] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Import
        gunModel[114] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Import
        gunModel[115] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Import Import
        gunModel[116] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Import Import
        gunModel[117] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Import Import
        gunModel[118] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Import Import
        gunModel[119] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Import
        gunModel[120] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Import Import
        gunModel[121] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Import
        gunModel[122] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Import
        gunModel[123] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import Import
        gunModel[124] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Import Import
        gunModel[125] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Import Import
        gunModel[126] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Import Import
        gunModel[127] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Import Import
        gunModel[128] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Import Import
        gunModel[129] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Import
        gunModel[130] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Import
        gunModel[131] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Import
        gunModel[132] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Import Import
        gunModel[133] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Import Import
        gunModel[134] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Import Import
        gunModel[135] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Import
        gunModel[136] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Import
        gunModel[137] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Import Import
        gunModel[138] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Import Import
        gunModel[139] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Import Import
        gunModel[140] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Import
        gunModel[141] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Import
        gunModel[142] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Import
        gunModel[143] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Import
        gunModel[144] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Import Import
        gunModel[145] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Import Import
        gunModel[146] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Import
        gunModel[147] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Import Import
        gunModel[148] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Import Import
        gunModel[149] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Import Import
        gunModel[150] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Import
        gunModel[151] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Import Import
        gunModel[152] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Import Import
        gunModel[153] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Import
        gunModel[154] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Import
        gunModel[155] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Import Import
        gunModel[156] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import Import
        gunModel[157] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import Import
        gunModel[158] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import Import
        gunModel[159] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Import
        gunModel[160] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Import
        gunModel[161] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import Import
        gunModel[162] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Import
        gunModel[163] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Import Import
        gunModel[164] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import Import
        gunModel[165] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Import Import
        gunModel[166] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Import
        gunModel[167] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Import Import
        gunModel[168] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Import Import
        gunModel[169] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Import Import
        gunModel[170] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Import Import
        gunModel[171] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Import
        gunModel[172] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Import Import
        gunModel[173] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Import
        gunModel[174] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Import Import
        gunModel[175] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Import Import
        gunModel[176] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Import Import
        gunModel[177] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Import
        gunModel[178] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Import Import
        gunModel[179] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import Import
        gunModel[180] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Import Import
        gunModel[181] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Import
        gunModel[182] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Import
        gunModel[183] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Import
        gunModel[184] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Import
        gunModel[185] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Import Import
        gunModel[186] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Import Import
        gunModel[187] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Import
        gunModel[188] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Import
        gunModel[189] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Import
        gunModel[190] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Import
        gunModel[191] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Import
        gunModel[192] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Import
        gunModel[193] = new ModelRendererTurbo(this, 633, 209, textureX, textureY); // Import Import
        gunModel[194] = new ModelRendererTurbo(this, 689, 209, textureX, textureY); // Import Import
        gunModel[195] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Import
        gunModel[196] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Import
        gunModel[197] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Import
        gunModel[198] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Import
        gunModel[199] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Import Import
        gunModel[200] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Import
        gunModel[201] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Import Import
        gunModel[202] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Import Import
        gunModel[203] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Import Import
        gunModel[204] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Import Import
        gunModel[205] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Import Import
        gunModel[206] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Import Import
        gunModel[207] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Import Import
        gunModel[208] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Import Import
        gunModel[209] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import Import
        gunModel[210] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Import Import
        gunModel[211] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import Import
        gunModel[212] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Import
        gunModel[213] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Import Import
        gunModel[214] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Import
        gunModel[215] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Import Import
        gunModel[216] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Import Import
        gunModel[217] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Import Import
        gunModel[218] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Import Import
        gunModel[219] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Import
        gunModel[220] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import Import
        gunModel[221] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Import
        gunModel[222] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Import
        gunModel[223] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Import
        gunModel[224] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import Import
        gunModel[225] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import Import
        gunModel[226] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import Import
        gunModel[227] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Import
        gunModel[228] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Import
        gunModel[229] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Import
        gunModel[230] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import Import
        gunModel[231] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import Import
        gunModel[232] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import Import
        gunModel[233] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Import Import
        gunModel[234] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Import Import
        gunModel[235] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Import Import
        gunModel[236] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Import Import
        gunModel[237] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Import
        gunModel[238] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Import
        gunModel[239] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Import Import
        gunModel[240] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Import Import
        gunModel[241] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Import Import
        gunModel[242] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Import Import
        gunModel[243] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Import Import
        gunModel[244] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Import Import
        gunModel[245] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Import Import
        gunModel[246] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Import Import
        gunModel[247] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Import Import
        gunModel[248] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Import Import
        gunModel[249] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Import Import
        gunModel[250] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import Import
        gunModel[251] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import Import
        gunModel[252] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Import Import
        gunModel[253] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import Import
        gunModel[254] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import Import
        gunModel[255] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Import Import
        gunModel[256] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Import Import
        gunModel[257] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import Import
        gunModel[258] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Import Import
        gunModel[259] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Import Import
        gunModel[260] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Import
        gunModel[261] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Import
        gunModel[262] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import Import
        gunModel[263] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import Import
        gunModel[264] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import Import
        gunModel[265] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Import
        gunModel[266] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import Import
        gunModel[267] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Import Import
        gunModel[268] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Import Import
        gunModel[269] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Import
        gunModel[270] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Import
        gunModel[271] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Import
        gunModel[272] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Import
        gunModel[273] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Import
        gunModel[274] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Import
        gunModel[275] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Import
        gunModel[276] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Import
        gunModel[277] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Import
        gunModel[278] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Import
        gunModel[279] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Import Import
        gunModel[280] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import Import
        gunModel[281] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import Import
        gunModel[282] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Import
        gunModel[283] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Import
        gunModel[284] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Import Import
        gunModel[285] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import Import
        gunModel[286] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Import Import
        gunModel[287] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Import Import
        gunModel[288] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Import Import
        gunModel[289] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import Import
        gunModel[290] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import Import
        gunModel[291] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Import Import
        gunModel[292] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Import Import
        gunModel[293] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Import Import
        gunModel[294] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Import
        gunModel[295] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Import Import
        gunModel[296] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Import
        gunModel[297] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import Import
        gunModel[298] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import Import
        gunModel[299] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import Import
        gunModel[300] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Import Import
        gunModel[301] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Import Import
        gunModel[302] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Import Import
        gunModel[303] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import Import
        gunModel[304] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Import Import
        gunModel[305] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Import
        gunModel[306] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Import Import
        gunModel[307] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Import Import
        gunModel[308] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Import Import
        gunModel[309] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Import Import
        gunModel[310] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Import Import
        gunModel[311] = new ModelRendererTurbo(this, 953, 169, textureX, textureY); // Import Import
        gunModel[312] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Import Import
        gunModel[313] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Import
        gunModel[314] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Import Import
        gunModel[315] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Import
        gunModel[316] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Import Import
        gunModel[317] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Import Import
        gunModel[318] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import Import
        gunModel[319] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Import Import
        gunModel[320] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Import Import
        gunModel[321] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Import
        gunModel[322] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Import Import
        gunModel[323] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import Import
        gunModel[324] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Import Import
        gunModel[325] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Import Import
        gunModel[326] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Import Import
        gunModel[327] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Import Import
        gunModel[328] = new ModelRendererTurbo(this, 721, 209, textureX, textureY); // Import Import
        gunModel[329] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Import Import
        gunModel[330] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Import Import
        gunModel[331] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Import Import
        gunModel[332] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Import Import
        gunModel[333] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Import
        gunModel[334] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Import Import
        gunModel[335] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Import Import
        gunModel[336] = new ModelRendererTurbo(this, 809, 209, textureX, textureY); // Import Import
        gunModel[337] = new ModelRendererTurbo(this, 849, 209, textureX, textureY); // Import Import
        gunModel[338] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Import
        gunModel[339] = new ModelRendererTurbo(this, 873, 209, textureX, textureY); // Import Import
        gunModel[340] = new ModelRendererTurbo(this, 913, 209, textureX, textureY); // Import Import
        gunModel[341] = new ModelRendererTurbo(this, 977, 217, textureX, textureY); // Import Import
        gunModel[342] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Import Import
        gunModel[343] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Import Import
        gunModel[344] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Import Import
        gunModel[345] = new ModelRendererTurbo(this, 785, 225, textureX, textureY); // Import Import
        gunModel[346] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Import Import
        gunModel[347] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Import Import
        gunModel[348] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Import Import
        gunModel[349] = new ModelRendererTurbo(this, 897, 233, textureX, textureY); // Import Import
        gunModel[350] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Import Import
        gunModel[351] = new ModelRendererTurbo(this, 521, 241, textureX, textureY); // Import Import
        gunModel[352] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Import Import
        gunModel[353] = new ModelRendererTurbo(this, 577, 241, textureX, textureY); // Import Import
        gunModel[354] = new ModelRendererTurbo(this, 617, 241, textureX, textureY); // Import Import
        gunModel[355] = new ModelRendererTurbo(this, 689, 241, textureX, textureY); // Import Import
        gunModel[356] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Import Import
        gunModel[357] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Import Import
        gunModel[358] = new ModelRendererTurbo(this, 753, 249, textureX, textureY); // Import Import
        gunModel[359] = new ModelRendererTurbo(this, 801, 249, textureX, textureY); // Import Import
        gunModel[360] = new ModelRendererTurbo(this, 841, 249, textureX, textureY); // Import Import
        gunModel[361] = new ModelRendererTurbo(this, 977, 249, textureX, textureY); // Import Import
        gunModel[362] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Import
        gunModel[363] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Import Import
        gunModel[364] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Import Import
        gunModel[365] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Import Import
        gunModel[366] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Import Import
        gunModel[367] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Import Import
        gunModel[368] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Import Import
        gunModel[369] = new ModelRendererTurbo(this, 689, 265, textureX, textureY); // Import Import
        gunModel[370] = new ModelRendererTurbo(this, 865, 265, textureX, textureY); // Import Import
        gunModel[371] = new ModelRendererTurbo(this, 929, 265, textureX, textureY); // Import Import
        gunModel[372] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Import Import
        gunModel[373] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Import Import
        gunModel[374] = new ModelRendererTurbo(this, 737, 273, textureX, textureY); // Import Import
        gunModel[375] = new ModelRendererTurbo(this, 801, 273, textureX, textureY); // Import Import
        gunModel[376] = new ModelRendererTurbo(this, 577, 265, textureX, textureY); // Import Import
        gunModel[377] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Import Import
        gunModel[378] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Import Import
        gunModel[379] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Import Import
        gunModel[380] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Import Import
        gunModel[381] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import Import
        gunModel[382] = new ModelRendererTurbo(this, 977, 281, textureX, textureY); // Import Import
        gunModel[383] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Import Import
        gunModel[384] = new ModelRendererTurbo(this, 577, 289, textureX, textureY); // Import Import
        gunModel[385] = new ModelRendererTurbo(this, 673, 289, textureX, textureY); // Import Import
        gunModel[386] = new ModelRendererTurbo(this, 849, 289, textureX, textureY); // Import Import
        gunModel[387] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Import Import
        gunModel[388] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Import Import
        gunModel[389] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Import Import
        gunModel[390] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Import Import
        gunModel[391] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Import Import
        gunModel[392] = new ModelRendererTurbo(this, 209, 297, textureX, textureY); // Import Import
        gunModel[393] = new ModelRendererTurbo(this, 249, 297, textureX, textureY); // Import Import
        gunModel[394] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Import Import
        gunModel[395] = new ModelRendererTurbo(this, 601, 297, textureX, textureY); // Import Import
        gunModel[396] = new ModelRendererTurbo(this, 649, 297, textureX, textureY); // Import Import
        gunModel[397] = new ModelRendererTurbo(this, 713, 297, textureX, textureY); // Import Import
        gunModel[398] = new ModelRendererTurbo(this, 777, 297, textureX, textureY); // Import Import
        gunModel[399] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Import Import
        gunModel[400] = new ModelRendererTurbo(this, 865, 249, textureX, textureY); // Import Import
        gunModel[401] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Import Import
        gunModel[402] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import Import
        gunModel[403] = new ModelRendererTurbo(this, 929, 297, textureX, textureY); // Import Import
        gunModel[404] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Import Import
        gunModel[405] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Import Import
        gunModel[406] = new ModelRendererTurbo(this, 129, 305, textureX, textureY); // Import Import
        gunModel[407] = new ModelRendererTurbo(this, 817, 225, textureX, textureY); // Import Import
        gunModel[408] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Import Import
        gunModel[409] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Import Import
        gunModel[410] = new ModelRendererTurbo(this, 601, 241, textureX, textureY); // Import Import
        gunModel[411] = new ModelRendererTurbo(this, 673, 241, textureX, textureY); // Import Import
        gunModel[412] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Import Import
        gunModel[413] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Import Import
        gunModel[414] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Import Import
        gunModel[415] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Import
        gunModel[416] = new ModelRendererTurbo(this, 665, 129, textureX, textureY); // Import Import
        gunModel[417] = new ModelRendererTurbo(this, 1009, 185, textureX, textureY); // Import Import
        gunModel[418] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Import Import
        gunModel[419] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Import Import
        gunModel[420] = new ModelRendererTurbo(this, 817, 313, textureX, textureY); // Import Import
        gunModel[421] = new ModelRendererTurbo(this, 361, 321, textureX, textureY); // Import Import
        gunModel[422] = new ModelRendererTurbo(this, 689, 321, textureX, textureY); // Import Import
        gunModel[423] = new ModelRendererTurbo(this, 105, 329, textureX, textureY); // Import Import
        gunModel[424] = new ModelRendererTurbo(this, 785, 249, textureX, textureY); // Import Import
        gunModel[425] = new ModelRendererTurbo(this, 825, 249, textureX, textureY); // Import Import
        gunModel[426] = new ModelRendererTurbo(this, 977, 305, textureX, textureY); // Import Import
        gunModel[427] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Import Import
        gunModel[428] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Import Import
        gunModel[429] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import Import
        gunModel[430] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Import
        gunModel[431] = new ModelRendererTurbo(this, 361, 337, textureX, textureY); // Import Import
        gunModel[432] = new ModelRendererTurbo(this, 513, 337, textureX, textureY); // Import Import
        gunModel[433] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import Import
        gunModel[434] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Import Import
        gunModel[435] = new ModelRendererTurbo(this, 929, 313, textureX, textureY); // Import Import
        gunModel[436] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Import Import
        gunModel[437] = new ModelRendererTurbo(this, 785, 329, textureX, textureY); // Import Import
        gunModel[438] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Import Import
        gunModel[439] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Import Import
        gunModel[440] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import Import
        gunModel[441] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import Import
        gunModel[442] = new ModelRendererTurbo(this, 969, 321, textureX, textureY); // Import Import
        gunModel[443] = new ModelRendererTurbo(this, 649, 337, textureX, textureY); // Import Import
        gunModel[444] = new ModelRendererTurbo(this, 209, 345, textureX, textureY); // Import Import
        gunModel[445] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Import Import
        gunModel[446] = new ModelRendererTurbo(this, 809, 297, textureX, textureY); // Import Import
        gunModel[447] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Import
        gunModel[448] = new ModelRendererTurbo(this, 905, 129, textureX, textureY); // Import Import
        gunModel[449] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Import Import
        gunModel[450] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Import Import
        gunModel[451] = new ModelRendererTurbo(this, 361, 345, textureX, textureY); // Import Import
        gunModel[452] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Import Import
        gunModel[453] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Import Import
        gunModel[454] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Import Import
        gunModel[455] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Import Import
        gunModel[456] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import Import
        gunModel[457] = new ModelRendererTurbo(this, 1001, 273, textureX, textureY); // Import Import
        gunModel[458] = new ModelRendererTurbo(this, 865, 329, textureX, textureY); // Import Import
        gunModel[459] = new ModelRendererTurbo(this, 513, 345, textureX, textureY); // Import Import
        gunModel[460] = new ModelRendererTurbo(this, 729, 345, textureX, textureY); // Import Import
        gunModel[461] = new ModelRendererTurbo(this, 745, 353, textureX, textureY); // Import Import
        gunModel[462] = new ModelRendererTurbo(this, 881, 353, textureX, textureY); // Import Import
        gunModel[463] = new ModelRendererTurbo(this, 105, 353, textureX, textureY); // Import Import
        gunModel[464] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Import Import
        gunModel[465] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Import
        gunModel[466] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import Import
        gunModel[467] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Import
        gunModel[468] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Import Import
        gunModel[469] = new ModelRendererTurbo(this, 361, 361, textureX, textureY); // Import Import
        gunModel[470] = new ModelRendererTurbo(this, 497, 361, textureX, textureY); // Import Import
        gunModel[471] = new ModelRendererTurbo(this, 633, 361, textureX, textureY); // Import Import
        gunModel[472] = new ModelRendererTurbo(this, 769, 361, textureX, textureY); // Import Import
        gunModel[473] = new ModelRendererTurbo(this, 97, 369, textureX, textureY); // Import Import
        gunModel[474] = new ModelRendererTurbo(this, 241, 369, textureX, textureY); // Import Import
        gunModel[475] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Import Import
        gunModel[476] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Import Import
        gunModel[477] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Import Import
        gunModel[478] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Import Import
        gunModel[479] = new ModelRendererTurbo(this, 17, 353, textureX, textureY); // Import Import
        gunModel[480] = new ModelRendererTurbo(this, 913, 361, textureX, textureY); // Import Import
        gunModel[481] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Import Import
        gunModel[482] = new ModelRendererTurbo(this, 137, 257, textureX, textureY); // Import Import
        gunModel[483] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Import Import
        gunModel[484] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import Import
        gunModel[485] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import Import
        gunModel[486] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Import Import
        gunModel[487] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Import Import
        gunModel[488] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Import Import
        gunModel[489] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Import
        gunModel[490] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Import
        gunModel[491] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Import
        gunModel[492] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import Import
        gunModel[493] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Import Import
        gunModel[494] = new ModelRendererTurbo(this, 633, 209, textureX, textureY); // Import Import
        gunModel[495] = new ModelRendererTurbo(this, 689, 209, textureX, textureY); // Import Import
        gunModel[496] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Import Import
        gunModel[497] = new ModelRendererTurbo(this, 105, 313, textureX, textureY); // Import Import
        gunModel[498] = new ModelRendererTurbo(this, 569, 313, textureX, textureY); // Import Import
        gunModel[499] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Import

        gunModel[0].addShapeBox(122F, -17F, -10F, 10, 9, 20, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[0].setRotationPoint(-38F, -24.5F, 0F);

        gunModel[1].addShapeBox(122F, -17F, -10F, 10, 1, 20, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[1].setRotationPoint(-38F, -25.5F, 0F);

        gunModel[2].addShapeBox(122F, -17F, -10F, 10, 1, 20, 0F, 0.0F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[2].setRotationPoint(-38F, -26.5F, 0F);

        gunModel[3].addShapeBox(122F, -17F, -10F, 21, 1, 20, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F); // Import Import
        gunModel[3].setRotationPoint(-38F, -28F, 0F);

        gunModel[4].addShapeBox(122F, -17F, -10F, 18, 21, 20, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[4].setRotationPoint(-56F, -27.5F, 0F);

        gunModel[5].addShapeBox(122F, -17F, -10F, 11, 21, 20, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[5].setRotationPoint(-67F, -27.5F, 0F);

        gunModel[6].addShapeBox(122F, -17F, -10F, 16, 6, 20, 0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import Import
        gunModel[6].setRotationPoint(-83F, -27.5F, 0F);

        gunModel[7].addShapeBox(122F, -17F, -10F, 1, 21, 20, 0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[7].setRotationPoint(-84.25F, -27.5F, 0F);

        gunModel[8].addShapeBox(122F, -17F, -10F, 16, 8, 20, 0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import Import
        gunModel[8].setRotationPoint(-83F, -14.5F, 0F);

        gunModel[9].addShapeBox(122F, -17F, -10F, 2, 3, 20, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[9].setRotationPoint(-69F, -17.5F, 0F);

        gunModel[10].addShapeBox(122F, -17F, -10F, 2, 1, 20, 0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[10].setRotationPoint(-71F, -15.5F, 0F);

        gunModel[11].addShapeBox(122F, -17F, -10F, 2, 3, 20, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[11].setRotationPoint(-83.5F, -17.5F, 0F);

        gunModel[12].addShapeBox(122F, -17F, -10F, 2, 1, 20, 0F, 0.0F, 0.001F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.001F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[12].setRotationPoint(-81.5F, -15.5F, 0F);

        gunModel[13].addShapeBox(122F, -17F, -10F, 2, 3, 20, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[13].setRotationPoint(-83.5F, -21.75F, 0F);

        gunModel[14].addShapeBox(122F, -17F, -10F, 2, 1, 20, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[14].setRotationPoint(-81.5F, -21.75F, 0F);

        gunModel[15].addShapeBox(122F, -17F, -10F, 2, 1, 20, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F); // Import Import
        gunModel[15].setRotationPoint(-71F, -21.75F, 0F);

        gunModel[16].addShapeBox(122F, -17F, -10F, 2, 3, 20, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import Import
        gunModel[16].setRotationPoint(-69F, -21.75F, 0F);

        gunModel[17].addShapeBox(122F, -17F, -10F, 18, 7, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[17].setRotationPoint(-84F, -21.75F, 1.5F);

        gunModel[18].addShapeBox(122F, -17F, -10F, 27, 20, 18, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[18].setRotationPoint(-111.25F, -26.5F, 1F);

        gunModel[19].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[19].setRotationPoint(-110.75F, -24.5F, 0.5F);

        gunModel[20].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[20].setRotationPoint(-110.75F, -23.5F, 0.5F);

        gunModel[21].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[21].setRotationPoint(-110.75F, -25.5F, 0.5F);

        gunModel[22].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[22].setRotationPoint(-87.75F, -24.5F, 0.5F);

        gunModel[23].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[23].setRotationPoint(-87.75F, -23.5F, 0.5F);

        gunModel[24].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[24].setRotationPoint(-87.75F, -25.5F, 0.5F);

        gunModel[25].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[25].setRotationPoint(-110.75F, -8.75F, 0.5F);

        gunModel[26].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[26].setRotationPoint(-110.75F, -7.75F, 0.5F);

        gunModel[27].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[27].setRotationPoint(-110.75F, -9.75F, 0.5F);

        gunModel[28].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[28].setRotationPoint(-87.75F, -8.75F, 0.5F);

        gunModel[29].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[29].setRotationPoint(-87.75F, -7.75F, 0.5F);

        gunModel[30].addShapeBox(122F, -17F, -10F, 3, 1, 19, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[30].setRotationPoint(-87.75F, -9.75F, 0.5F);

        gunModel[31].addShapeBox(122F, -17F, -10F, 62, 1, 19, 0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F); // Import Import
        gunModel[31].setRotationPoint(-83F, -29F, 0.5F);

        gunModel[32].addShapeBox(122F, -17F, -10F, 72, 4, 2, 0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[32].setRotationPoint(-93F, -38F, 0.5F);

        gunModel[33].addShapeBox(122F, -17F, -10F, 72, 5, 1, 0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[33].setRotationPoint(-93F, -34F, 1.5F);

        gunModel[34].addShapeBox(122F, -17F, -10F, 1, 1, 19, 0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 1.0F, 0.0F); // Import Import
        gunModel[34].setRotationPoint(-84.5F, -29F, 0.5F);

        gunModel[35].addShapeBox(122F, -17F, -10F, 10, 3, 19, 0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[35].setRotationPoint(-93.5F, -29F, 0.5F);

        gunModel[36].addShapeBox(122F, -17F, -10F, 19, 12, 2, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[36].setRotationPoint(-112.5F, -38F, 0.5F);

        gunModel[37].addShapeBox(122F, -17F, -10F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[37].setRotationPoint(-93.5F, -34.5F, 0.5F);

        gunModel[38].addShapeBox(122F, -17F, -10F, 2, 1, 1, 0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[38].setRotationPoint(-93.5F, -30F, 0.5F);

        gunModel[39].addShapeBox(122F, -17F, -10F, 4, 12, 2, 0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[39].setRotationPoint(-116.5F, -38F, 0.5F);

        gunModel[40].addShapeBox(122F, -17F, -10F, 1, 12, 2, 0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[40].setRotationPoint(-117.5F, -38F, 0.5F);

        gunModel[41].addShapeBox(122F, -17F, -10F, 6, 5, 19, 0F, 0.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[41].setRotationPoint(-117.5F, -27.5F, 0.5F);

        gunModel[42].addShapeBox(122F, -17F, -10F, 2, 1, 19, 0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[42].setRotationPoint(-112F, -26.5F, 0.5F);

        gunModel[43].addShapeBox(122F, -17F, -10F, 14, 4, 4, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[43].setRotationPoint(-109F, -42F, 0.5F);

        gunModel[44].addShapeBox(122F, -17F, -10F, 2, 1, 19, 0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F); // Import Import
        gunModel[44].setRotationPoint(-23F, -34.5F, 0.5F);

        gunModel[45].addShapeBox(122F, -17F, -10F, 2, 1, 19, 0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F); // Import Import
        gunModel[45].setRotationPoint(-23F, -30F, 0.5F);

        gunModel[46].addShapeBox(122F, -17F, -10F, 4, 11, 19, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[46].setRotationPoint(-21F, -38.5F, 0.5F);

        gunModel[47].addShapeBox(122F, -17F, -10F, 92, 4, 5, 0F, -1.75F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, -1.75F, 0.25F, -1.5F, 0.5F, -0.25F, -3.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Import Import
        gunModel[47].setRotationPoint(-109F, -46F, 12F);

        gunModel[48].addShapeBox(122F, -17F, -10F, 14, 4, 5, 0F, -1.75F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, -1.75F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F); // Import Import
        gunModel[48].setRotationPoint(-109F, -46F, 3F);

        gunModel[49].addShapeBox(122F, -17F, -10F, 14, 1, 4, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[49].setRotationPoint(-109F, -42.5F, 1.5F);

        gunModel[50].addShapeBox(122F, -17F, -10F, 72, 4, 4, 0F, 0.5F, -0.25F, -1.0F, 0.75F, -0.25F, -1.0F, 0.75F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -2.0F, 0.75F, -0.25F, -2.0F, 0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[50].setRotationPoint(-109F, -42F, 15.5F);

        gunModel[51].addShapeBox(122F, -17F, -10F, 92, 1, 4, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[51].setRotationPoint(-109F, -42.5F, 14.5F);

        gunModel[52].addShapeBox(122F, -17F, -10F, 19, 12, 2, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[52].setRotationPoint(-112.5F, -38F, 17.5F);

        gunModel[53].addShapeBox(122F, -17F, -10F, 4, 12, 2, 0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[53].setRotationPoint(-116.5F, -38F, 17.5F);

        gunModel[54].addShapeBox(122F, -17F, -10F, 1, 12, 2, 0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[54].setRotationPoint(-117.5F, -38F, 17.5F);

        gunModel[55].addShapeBox(122F, -17F, -10F, 1, 4, 16, 0F, 0.5F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Import Import
        gunModel[55].setRotationPoint(-105F, -42F, 2F);

        gunModel[56].addShapeBox(122F, -17F, -10F, 1, 4, 10, 0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Import Import
        gunModel[56].setRotationPoint(-105F, -46F, 5F);

        gunModel[57].addShapeBox(122F, -17F, -10F, 88, 4, 5, 0F, 1.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 2.25F, -0.25F, -3.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, 0.5F, 2.25F, -0.25F, 0.5F); // Import Import
        gunModel[57].setRotationPoint(-105F, -50F, 10F);

        gunModel[58].addShapeBox(122F, -17F, -10F, 10, 4, 5, 0F, 1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 1.0F, 0.0F, -3.75F, 2.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 2.25F, -0.25F, -3.5F); // Import Import
        gunModel[58].setRotationPoint(-105F, -50F, 5F);

        gunModel[59].addShapeBox(122F, -17F, -10F, 1, 4, 10, 0F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.5F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F); // Import Import
        gunModel[59].setRotationPoint(-105F, -50F, 5F);

        gunModel[60].addShapeBox(122F, -17F, -10F, 1, 1, 13, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[60].setRotationPoint(-105F, -42.5F, 3.5F);

        gunModel[61].addShapeBox(122F, -17F, -10F, 2, 12, 16, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[61].setRotationPoint(-105.5F, -38.25F, 2F);

        gunModel[62].addShapeBox(122F, -17F, -10F, 1, 20, 14, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[62].setRotationPoint(-112.25F, -26.5F, 2.5F);

        gunModel[63].addShapeBox(122F, -17F, -10F, 6, 10, 16, 0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        gunModel[63].setRotationPoint(-118.25F, -22.5F, 2F);

        gunModel[64].addShapeBox(122F, -17F, -10F, 5, 1, 15, 0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[64].setRotationPoint(-117.25F, -23F, 2F);

        gunModel[65].addShapeBox(122F, -17F, -10F, 30, 12, 16, 0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); // Import Import
        gunModel[65].setRotationPoint(-148.25F, -24.5F, 2F);

        gunModel[66].addShapeBox(122F, -17F, -10F, 38, 2, 16, 0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[66].setRotationPoint(-156.25F, -26.25F, 2F);

        gunModel[67].addShapeBox(122F, -17F, -10F, 71, 3, 16, 0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[67].setRotationPoint(-156.25F, -6.5F, 2F);

        gunModel[68].addShapeBox(122F, -17F, -10F, 44, 7, 16, 0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[68].setRotationPoint(-156.25F, -13.25F, 2F);

        gunModel[69].addShapeBox(122F, -17F, -10F, 1, 2, 15, 0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[69].setRotationPoint(-117.25F, -24.5F, 2F);

        gunModel[70].addShapeBox(122F, -17F, -10F, 44, 1, 15, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[70].setRotationPoint(-156.25F, -12.75F, 2.5F);

        gunModel[71].addShapeBox(122F, -17F, -10F, 71, 1, 13, 0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[71].setRotationPoint(-156.25F, -6.5F, 2.5F);

        gunModel[72].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[72].setRotationPoint(-154.25F, -8.5F, 1.5F);

        gunModel[73].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[73].setRotationPoint(-154.25F, -9.5F, 1.5F);

        gunModel[74].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[74].setRotationPoint(-154.25F, -10.5F, 1.5F);

        gunModel[75].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[75].setRotationPoint(-143.25F, -8.5F, 1.5F);

        gunModel[76].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[76].setRotationPoint(-143.25F, -9.5F, 1.5F);

        gunModel[77].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[77].setRotationPoint(-143.25F, -10.5F, 1.5F);

        gunModel[78].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[78].setRotationPoint(-132.25F, -8.5F, 1.5F);

        gunModel[79].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[79].setRotationPoint(-132.25F, -9.5F, 1.5F);

        gunModel[80].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[80].setRotationPoint(-132.25F, -10.5F, 1.5F);

        gunModel[81].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[81].setRotationPoint(-121.25F, -8.5F, 1.5F);

        gunModel[82].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[82].setRotationPoint(-121.25F, -9.5F, 1.5F);

        gunModel[83].addShapeBox(122F, -17F, -10F, 3, 1, 17, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[83].setRotationPoint(-121.25F, -10.5F, 1.5F);

        gunModel[84].addShapeBox(122F, -17F, -10F, 2, 12, 16, 0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[84].setRotationPoint(-156.25F, -24.5F, 2F);

        gunModel[85].addShapeBox(122F, -17F, -10F, 6, 3, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import Import
        gunModel[85].setRotationPoint(-153.5F, -24.5F, 2F);

        gunModel[86].addShapeBox(122F, -17F, -10F, 6, 4, 16, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[86].setRotationPoint(-153.5F, -16.5F, 2F);

        gunModel[87].addShapeBox(122F, -17F, -10F, 2, 2, 16, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[87].setRotationPoint(-149.5F, -18F, 2F);

        gunModel[88].addShapeBox(122F, -17F, -10F, 2, 2, 16, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[88].setRotationPoint(-153.5F, -18F, 2F);

        gunModel[89].addShapeBox(122F, -17F, -10F, 2, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import Import
        gunModel[89].setRotationPoint(-149.5F, -22F, 2F);

        gunModel[90].addShapeBox(122F, -17F, -10F, 2, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[90].setRotationPoint(-153.5F, -22F, 2F);

        gunModel[91].addShapeBox(122F, -17F, -10F, 6, 6, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[91].setRotationPoint(-153.5F, -22F, 2.5F);

        gunModel[92].addShapeBox(122F, -17F, -10F, 58, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[92].setRotationPoint(33F, -30.25F, -2F);

        gunModel[93].addShapeBox(122F, -17F, -10F, 58, 5, 5, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[93].setRotationPoint(33F, -35.25F, 17F);

        gunModel[94].addShapeBox(122F, -17F, -10F, 58, 5, 4, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[94].setRotationPoint(33F, -40.25F, 17.5F);

        gunModel[95].addShapeBox(122F, -17F, -10F, 19, 3, 17, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[95].setRotationPoint(72F, -45.25F, 1.5F);

        gunModel[96].addShapeBox(122F, -17F, -10F, 96, 2, 4, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[96].setRotationPoint(-5F, -42.25F, 16.5F);

        gunModel[97].addShapeBox(122F, -17F, -10F, 14, 4, 24, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[97].setRotationPoint(-17F, -30.25F, -2F);

        gunModel[98].addShapeBox(122F, -17F, -10F, 14, 5, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[98].setRotationPoint(-17F, -35.25F, -2F);

        gunModel[99].addShapeBox(122F, -17F, -10F, 14, 5, 23, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[99].setRotationPoint(-17F, -40.25F, -1.5F);

        gunModel[100].addShapeBox(122F, -17F, -10F, 8, 3, 17, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[100].setRotationPoint(-17F, -45.25F, 1.5F);

        gunModel[101].addShapeBox(122F, -17F, -10F, 13, 1, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[101].setRotationPoint(-17F, -46.25F, 5F);

        gunModel[102].addShapeBox(122F, -17F, -10F, 8, 2, 21, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[102].setRotationPoint(-17F, -42.25F, -0.5F);

        gunModel[103].addShapeBox(122F, -17F, -10F, 1, 3, 17, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[103].setRotationPoint(-5F, -45.25F, 1.5F);

        gunModel[104].addShapeBox(122F, -17F, -10F, 36, 3, 24, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[104].setRotationPoint(-3F, -29.25F, -2F);

        gunModel[105].addShapeBox(122F, -17F, -10F, 36, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[105].setRotationPoint(-3F, -40.25F, 17.5F);

        gunModel[106].addShapeBox(122F, -17F, -10F, 4, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[106].setRotationPoint(23F, -35.25F, 18F);

        gunModel[107].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F); // Import Import
        gunModel[107].setRotationPoint(31F, -35.25F, -2F);

        gunModel[108].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F); // Import Import
        gunModel[108].setRotationPoint(27F, -35.25F, -2F);

        gunModel[109].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F); // Import Import
        gunModel[109].setRotationPoint(-3F, -35.25F, -2F);

        gunModel[110].addShapeBox(122F, -17F, -10F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[110].setRotationPoint(3F, -30.25F, -2F);

        gunModel[111].addShapeBox(122F, -17F, -10F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[111].setRotationPoint(13F, -30.25F, -2F);

        gunModel[112].addShapeBox(122F, -17F, -10F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[112].setRotationPoint(23F, -30.25F, -2F);

        gunModel[113].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[113].setRotationPoint(31F, -30.25F, -2F);

        gunModel[114].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[114].setRotationPoint(32F, -31.25F, -2F);

        gunModel[115].addShapeBox(122F, -17F, -10F, 2, 1, 24, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[115].setRotationPoint(-3F, -30.25F, -2F);

        gunModel[116].addShapeBox(122F, -17F, -10F, 1, 1, 24, 0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[116].setRotationPoint(-3F, -31.25F, -2F);

        gunModel[117].addShapeBox(122F, -17F, -10F, 52, 6, 2, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[117].setRotationPoint(35F, -38.75F, 20.5F);

        gunModel[118].addShapeBox(122F, -17F, -10F, 121, 4, 17, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import Import
        gunModel[118].setRotationPoint(-30F, -26.25F, 1.5F);

        gunModel[119].addShapeBox(122F, -17F, -10F, 119, 1, 17, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[119].setRotationPoint(-30F, -22.25F, 1.5F);

        gunModel[120].addShapeBox(122F, -17F, -10F, 118, 2, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[120].setRotationPoint(-30F, -21.25F, 3.5F);

        gunModel[121].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[121].setRotationPoint(2F, -45.25F, 14.5F);

        gunModel[122].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -0.5F, -1.99F, 0.0F, -0.5F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[122].setRotationPoint(-4F, -44.25F, 14.5F);

        gunModel[123].addShapeBox(122F, -17F, -10F, 1, 1, 21, 0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[123].setRotationPoint(-6F, -41.25F, -0.5F);

        gunModel[124].addShapeBox(122F, -17F, -10F, 1, 1, 19, 0F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F); // Import Import
        gunModel[124].setRotationPoint(-6F, -43.25F, 0.5F);

        gunModel[125].addShapeBox(122F, -17F, -10F, 1, 1, 21, 0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[125].setRotationPoint(-9F, -41.25F, -0.5F);

        gunModel[126].addShapeBox(122F, -17F, -10F, 1, 1, 19, 0F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[126].setRotationPoint(-9F, -43.25F, 0.5F);

        gunModel[127].addShapeBox(122F, -17F, -10F, 4, 2, 15, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import Import
        gunModel[127].setRotationPoint(-9F, -45.25F, 2.5F);

        gunModel[128].addShapeBox(122F, -17F, -10F, 4, 3, 15, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); // Import Import
        gunModel[128].setRotationPoint(-9F, -43.25F, 2.5F);

        gunModel[129].addShapeBox(122F, -17F, -10F, 7, 3, 5, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F); // Import Import
        gunModel[129].setRotationPoint(-17F, -50F, 5F);

        gunModel[130].addShapeBox(122F, -17F, -10F, 7, 3, 5, 0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F); // Import Import
        gunModel[130].setRotationPoint(-17F, -50F, 10F);

        gunModel[131].addShapeBox(122F, -17F, -10F, 18, 3, 5, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F); // Import Import
        gunModel[131].setRotationPoint(72F, -50F, 5F);

        gunModel[132].addShapeBox(122F, -17F, -10F, 2, 2, 17, 0F, -1.99F, 0.0F, -1.85F, 0F, 0.0F, -1.85F, 0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[132].setRotationPoint(70F, -44.25F, 1.5F);

        gunModel[133].addShapeBox(122F, -17F, -10F, 82, 2, 12, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, -3.4F, 0.0F, -0.25F, -3.4F); // Import Import
        gunModel[133].setRotationPoint(-10F, -50F, 5F);

        gunModel[134].addShapeBox(122F, -17F, -10F, 13, 1, 10, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[134].setRotationPoint(-17F, -47.25F, 5F);

        gunModel[135].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[135].setRotationPoint(2F, -46.25F, 13F);

        gunModel[136].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[136].setRotationPoint(2F, -47.25F, 12F);

        gunModel[137].addShapeBox(122F, -17F, -10F, 18, 1, 10, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[137].setRotationPoint(72F, -46.25F, 5F);

        gunModel[138].addShapeBox(122F, -17F, -10F, 18, 1, 10, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[138].setRotationPoint(72F, -47.25F, 5F);

        gunModel[139].addShapeBox(122F, -17F, -10F, 18, 3, 10, 0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, -3.5F, 0.0F, -0.25F, 0.55F, 0.0F, -0.25F, 0.55F); // Import Import
        gunModel[139].setRotationPoint(72F, -50F, 3F);

        gunModel[140].addShapeBox(122F, -17F, -10F, 4, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[140].setRotationPoint(2F, -48.25F, 5F);

        gunModel[141].addShapeBox(122F, -17F, -10F, 1, 1, 5, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F); // Import Import
        gunModel[141].setRotationPoint(16F, -47.25F, 5F);

        gunModel[142].addShapeBox(122F, -17F, -10F, 2, 1, 14, 0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[142].setRotationPoint(70F, -48.25F, 1F);

        gunModel[143].addShapeBox(122F, -17F, -10F, 1, 1, 14, 0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[143].setRotationPoint(71F, -47.25F, 1F);

        gunModel[144].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F); // Import Import
        gunModel[144].setRotationPoint(0F, -48.25F, 5F);

        gunModel[145].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F); // Import Import
        gunModel[145].setRotationPoint(-4F, -48.25F, 5F);

        gunModel[146].addShapeBox(122F, -17F, -10F, 1, 1, 12, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[146].setRotationPoint(-4F, -47.25F, 5F);

        gunModel[147].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[147].setRotationPoint(6F, -48.25F, 5F);

        gunModel[148].addShapeBox(122F, -17F, -10F, 6, 1, 5, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F); // Import Import
        gunModel[148].setRotationPoint(-10F, -48.25F, 5F);

        gunModel[149].addShapeBox(122F, -17F, -10F, 242, 3, 10, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import Import
        gunModel[149].setRotationPoint(-4F, -38.25F, 5F);

        gunModel[150].addShapeBox(122F, -17F, -10F, 242, 3, 10, 0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F); // Import Import
        gunModel[150].setRotationPoint(-4F, -34.75F, 5F);

        gunModel[151].addShapeBox(122F, -17F, -10F, 242, 3, 10, 0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F); // Import Import
        gunModel[151].setRotationPoint(-4F, -41.75F, 5F);

        gunModel[152].addShapeBox(122F, -17F, -10F, 18, 3, 5, 0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, -3.55F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F); // Import Import
        gunModel[152].setRotationPoint(72F, -50F, 10F);

        gunModel[153].addShapeBox(122F, -17F, -10F, 82, 2, 5, 0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, -3.6F, 0.0F, -0.25F, -3.6F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F); // Import Import
        gunModel[153].setRotationPoint(-10F, -50F, 10F);

        gunModel[154].addShapeBox(122F, -17F, -10F, 4, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[154].setRotationPoint(2F, -48.25F, 10F);

        gunModel[155].addShapeBox(122F, -17F, -10F, 4, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[155].setRotationPoint(22F, -48.25F, 10F);

        gunModel[156].addShapeBox(122F, -17F, -10F, 4, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[156].setRotationPoint(32F, -48.25F, 10F);

        gunModel[157].addShapeBox(122F, -17F, -10F, 4, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[157].setRotationPoint(42F, -48.25F, 10F);

        gunModel[158].addShapeBox(122F, -17F, -10F, 1, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[158].setRotationPoint(16F, -47.25F, 10F);

        gunModel[159].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[159].setRotationPoint(0F, -48.25F, 10F);

        gunModel[160].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[160].setRotationPoint(6F, -47.25F, 8F);

        gunModel[161].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[161].setRotationPoint(-4F, -48.25F, 10F);

        gunModel[162].addShapeBox(122F, -17F, -10F, 1, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[162].setRotationPoint(-4F, -47.25F, 10F);

        gunModel[163].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[163].setRotationPoint(6F, -48.25F, 10F);

        gunModel[164].addShapeBox(122F, -17F, -10F, 6, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[164].setRotationPoint(-10F, -48.25F, 10F);

        gunModel[165].addShapeBox(122F, -17F, -10F, 58, 5, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[165].setRotationPoint(33F, -40.25F, -1.5F);

        gunModel[166].addShapeBox(122F, -17F, -10F, 96, 2, 4, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[166].setRotationPoint(-5F, -42.25F, -0.5F);

        gunModel[167].addShapeBox(122F, -17F, -10F, 58, 5, 5, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[167].setRotationPoint(33F, -35.25F, -2F);

        gunModel[168].addShapeBox(122F, -17F, -10F, 58, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[168].setRotationPoint(33F, -30.25F, 18F);

        gunModel[169].addShapeBox(122F, -17F, -10F, 58, 2, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[169].setRotationPoint(33F, -28.25F, 2F);

        gunModel[170].addShapeBox(122F, -17F, -10F, 58, 2, 3, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[170].setRotationPoint(33F, -30.25F, 15F);

        gunModel[171].addShapeBox(122F, -17F, -10F, 58, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[171].setRotationPoint(33F, -30.25F, 2F);

        gunModel[172].addShapeBox(122F, -17F, -10F, 36, 5, 4, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[172].setRotationPoint(-3F, -40.25F, -1.5F);

        gunModel[173].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[173].setRotationPoint(0F, -44.25F, 1.5F);

        gunModel[174].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -2.0F, 0.0F, -1.85F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[174].setRotationPoint(-4F, -44.25F, 1.5F);

        gunModel[175].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[175].setRotationPoint(2F, -45.25F, 1.5F);

        gunModel[176].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[176].setRotationPoint(27F, -30.25F, -2F);

        gunModel[177].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[177].setRotationPoint(27F, -31.25F, -2F);

        gunModel[178].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, -1.99F, 0.0F, -1.85F, 0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[178].setRotationPoint(6F, -44.25F, 14.5F);

        gunModel[179].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[179].setRotationPoint(6F, -44.25F, 1.5F);

        gunModel[180].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[180].setRotationPoint(31F, -30.25F, 18F);

        gunModel[181].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[181].setRotationPoint(32F, -31.25F, 18F);

        gunModel[182].addShapeBox(122F, -17F, -10F, 4, 5, 4, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[182].setRotationPoint(23F, -35.25F, -2F);

        gunModel[183].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[183].setRotationPoint(27F, -30.25F, 18F);

        gunModel[184].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, 0.6F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[184].setRotationPoint(27F, -31.25F, 19F);

        gunModel[185].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F); // Import Import
        gunModel[185].setRotationPoint(21F, -35.25F, -2F);

        gunModel[186].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F); // Import Import
        gunModel[186].setRotationPoint(17F, -35.25F, -2F);

        gunModel[187].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[187].setRotationPoint(21F, -30.25F, -2F);

        gunModel[188].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[188].setRotationPoint(22F, -31.25F, -2F);

        gunModel[189].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[189].setRotationPoint(17F, -30.25F, -2F);

        gunModel[190].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[190].setRotationPoint(17F, -31.25F, -2F);

        gunModel[191].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[191].setRotationPoint(17F, -30.25F, 18F);

        gunModel[192].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, 0.6F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[192].setRotationPoint(17F, -31.25F, 19F);

        gunModel[193].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F); // Import Import
        gunModel[193].setRotationPoint(11F, -35.25F, -2F);

        gunModel[194].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F); // Import Import
        gunModel[194].setRotationPoint(7F, -35.25F, -2F);

        gunModel[195].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[195].setRotationPoint(11F, -30.25F, -2F);

        gunModel[196].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[196].setRotationPoint(12F, -31.25F, -2F);

        gunModel[197].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[197].setRotationPoint(7F, -30.25F, -2F);

        gunModel[198].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[198].setRotationPoint(7F, -31.25F, -2F);

        gunModel[199].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[199].setRotationPoint(7F, -30.25F, 18F);

        gunModel[200].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, 0.6F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[200].setRotationPoint(7F, -31.25F, 19F);

        gunModel[201].addShapeBox(122F, -17F, -10F, 2, 2, 24, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F); // Import Import
        gunModel[201].setRotationPoint(1F, -35.25F, -2F);

        gunModel[202].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[202].setRotationPoint(1F, -30.25F, -2F);

        gunModel[203].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[203].setRotationPoint(2F, -31.25F, -2F);

        gunModel[204].addShapeBox(122F, -17F, -10F, 4, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[204].setRotationPoint(13F, -35.25F, 18F);

        gunModel[205].addShapeBox(122F, -17F, -10F, 4, 5, 4, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[205].setRotationPoint(13F, -35.25F, -2F);

        gunModel[206].addShapeBox(122F, -17F, -10F, 4, 5, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[206].setRotationPoint(3F, -35.25F, 18F);

        gunModel[207].addShapeBox(122F, -17F, -10F, 4, 5, 4, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[207].setRotationPoint(3F, -35.25F, -2F);

        gunModel[208].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[208].setRotationPoint(21F, -30.25F, 18F);

        gunModel[209].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[209].setRotationPoint(22F, -31.25F, 18F);

        gunModel[210].addShapeBox(122F, -17F, -10F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[210].setRotationPoint(23F, -30.25F, 18.5F);

        gunModel[211].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[211].setRotationPoint(11F, -30.25F, 18F);

        gunModel[212].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[212].setRotationPoint(12F, -31.25F, 18F);

        gunModel[213].addShapeBox(122F, -17F, -10F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[213].setRotationPoint(13F, -30.25F, 18.5F);

        gunModel[214].addShapeBox(122F, -17F, -10F, 2, 1, 4, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[214].setRotationPoint(1F, -30.25F, 18F);

        gunModel[215].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[215].setRotationPoint(2F, -31.25F, 18F);

        gunModel[216].addShapeBox(122F, -17F, -10F, 4, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[216].setRotationPoint(3F, -30.25F, 18.5F);

        gunModel[217].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[217].setRotationPoint(12F, -45.25F, 14.5F);

        gunModel[218].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[218].setRotationPoint(12F, -45.25F, 1.5F);

        gunModel[219].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[219].setRotationPoint(22F, -45.25F, 14.5F);

        gunModel[220].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[220].setRotationPoint(22F, -45.25F, 1.5F);

        gunModel[221].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[221].setRotationPoint(32F, -45.25F, 14.5F);

        gunModel[222].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[222].setRotationPoint(32F, -45.25F, 1.5F);

        gunModel[223].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[223].setRotationPoint(42F, -45.25F, 14.5F);

        gunModel[224].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[224].setRotationPoint(42F, -45.25F, 1.5F);

        gunModel[225].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[225].setRotationPoint(52F, -45.25F, 14.5F);

        gunModel[226].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[226].setRotationPoint(52F, -45.25F, 1.5F);

        gunModel[227].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[227].setRotationPoint(62F, -45.25F, 14.5F);

        gunModel[228].addShapeBox(122F, -17F, -10F, 4, 3, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[228].setRotationPoint(62F, -45.25F, 1.5F);

        gunModel[229].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[229].setRotationPoint(10F, -44.25F, 14.5F);

        gunModel[230].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 1.5F, 0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[230].setRotationPoint(0F, -44.25F, 14.5F);

        gunModel[231].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[231].setRotationPoint(16F, -44.25F, 14.5F);

        gunModel[232].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[232].setRotationPoint(16F, -44.25F, 1.5F);

        gunModel[233].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[233].setRotationPoint(20F, -44.25F, 14.5F);

        gunModel[234].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import Import
        gunModel[234].setRotationPoint(2F, -46.25F, 5F);

        gunModel[235].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[235].setRotationPoint(12F, -46.25F, 13F);

        gunModel[236].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import Import
        gunModel[236].setRotationPoint(12F, -46.25F, 5F);

        gunModel[237].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[237].setRotationPoint(2F, -47.25F, 5F);

        gunModel[238].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[238].setRotationPoint(1F, -47.25F, 8F);

        gunModel[239].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[239].setRotationPoint(30F, -44.25F, 1.5F);

        gunModel[240].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[240].setRotationPoint(30F, -44.25F, 14.5F);

        gunModel[241].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[241].setRotationPoint(40F, -44.25F, 1.5F);

        gunModel[242].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[242].setRotationPoint(40F, -44.25F, 14.5F);

        gunModel[243].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[243].setRotationPoint(12F, -47.25F, 12F);

        gunModel[244].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[244].setRotationPoint(12F, -47.25F, 5F);

        gunModel[245].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F); // Import Import
        gunModel[245].setRotationPoint(11F, -47.25F, 5F);

        gunModel[246].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[246].setRotationPoint(11F, -47.25F, 8F);

        gunModel[247].addShapeBox(122F, -17F, -10F, 4, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[247].setRotationPoint(12F, -48.25F, 5F);

        gunModel[248].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F); // Import Import
        gunModel[248].setRotationPoint(10F, -48.25F, 5F);

        gunModel[249].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[249].setRotationPoint(16F, -48.25F, 5F);

        gunModel[250].addShapeBox(122F, -17F, -10F, 4, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[250].setRotationPoint(12F, -48.25F, 10F);

        gunModel[251].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[251].setRotationPoint(10F, -48.25F, 10F);

        gunModel[252].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[252].setRotationPoint(16F, -48.25F, 10F);

        gunModel[253].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F); // Import Import
        gunModel[253].setRotationPoint(1F, -47.25F, 5F);

        gunModel[254].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F); // Import Import
        gunModel[254].setRotationPoint(6F, -47.25F, 5F);

        gunModel[255].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[255].setRotationPoint(10F, -44.25F, 1.5F);

        gunModel[256].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[256].setRotationPoint(50F, -44.25F, 1.5F);

        gunModel[257].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[257].setRotationPoint(56F, -44.25F, 14.5F);

        gunModel[258].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[258].setRotationPoint(56F, -44.25F, 1.5F);

        gunModel[259].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[259].setRotationPoint(60F, -44.25F, 14.5F);

        gunModel[260].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[260].setRotationPoint(50F, -44.25F, 14.5F);

        gunModel[261].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[261].setRotationPoint(60F, -44.25F, 1.5F);

        gunModel[262].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[262].setRotationPoint(66F, -44.25F, 14.5F);

        gunModel[263].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[263].setRotationPoint(66F, -44.25F, 1.5F);

        gunModel[264].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[264].setRotationPoint(20F, -44.25F, 1.5F);

        gunModel[265].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[265].setRotationPoint(26F, -44.25F, 14.5F);

        gunModel[266].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[266].setRotationPoint(26F, -44.25F, 1.5F);

        gunModel[267].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[267].setRotationPoint(36F, -44.25F, 14.5F);

        gunModel[268].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, -1.99F, 0.0F, 1.5F, 0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[268].setRotationPoint(36F, -44.25F, 1.5F);

        gunModel[269].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[269].setRotationPoint(22F, -46.25F, 13F);

        gunModel[270].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import Import
        gunModel[270].setRotationPoint(22F, -46.25F, 5F);

        gunModel[271].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[271].setRotationPoint(32F, -46.25F, 13F);

        gunModel[272].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import Import
        gunModel[272].setRotationPoint(32F, -46.25F, 5F);

        gunModel[273].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[273].setRotationPoint(42F, -46.25F, 13F);

        gunModel[274].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import Import
        gunModel[274].setRotationPoint(42F, -46.25F, 5F);

        gunModel[275].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[275].setRotationPoint(52F, -46.25F, 13F);

        gunModel[276].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import Import
        gunModel[276].setRotationPoint(52F, -46.25F, 5F);

        gunModel[277].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[277].setRotationPoint(62F, -46.25F, 13F);

        gunModel[278].addShapeBox(122F, -17F, -10F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import Import
        gunModel[278].setRotationPoint(62F, -46.25F, 5F);

        gunModel[279].addShapeBox(122F, -17F, -10F, 4, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[279].setRotationPoint(62F, -48.25F, 5F);

        gunModel[280].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F); // Import Import
        gunModel[280].setRotationPoint(60F, -48.25F, 5F);

        gunModel[281].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[281].setRotationPoint(66F, -48.25F, 5F);

        gunModel[282].addShapeBox(122F, -17F, -10F, 4, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[282].setRotationPoint(62F, -48.25F, 10F);

        gunModel[283].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[283].setRotationPoint(60F, -48.25F, 10F);

        gunModel[284].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[284].setRotationPoint(66F, -47.25F, 8F);

        gunModel[285].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[285].setRotationPoint(66F, -48.25F, 10F);

        gunModel[286].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[286].setRotationPoint(61F, -47.25F, 8F);

        gunModel[287].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F); // Import Import
        gunModel[287].setRotationPoint(61F, -47.25F, 5F);

        gunModel[288].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F); // Import Import
        gunModel[288].setRotationPoint(66F, -47.25F, 5F);

        gunModel[289].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[289].setRotationPoint(22F, -47.25F, 12F);

        gunModel[290].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[290].setRotationPoint(22F, -47.25F, 5F);

        gunModel[291].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[291].setRotationPoint(32F, -47.25F, 12F);

        gunModel[292].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[292].setRotationPoint(32F, -47.25F, 5F);

        gunModel[293].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[293].setRotationPoint(42F, -47.25F, 12F);

        gunModel[294].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[294].setRotationPoint(42F, -47.25F, 5F);

        gunModel[295].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[295].setRotationPoint(52F, -47.25F, 12F);

        gunModel[296].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[296].setRotationPoint(52F, -47.25F, 5F);

        gunModel[297].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[297].setRotationPoint(62F, -47.25F, 12F);

        gunModel[298].addShapeBox(122F, -17F, -10F, 4, 1, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[298].setRotationPoint(62F, -47.25F, 5F);

        gunModel[299].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[299].setRotationPoint(46F, -48.25F, 5F);

        gunModel[300].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[300].setRotationPoint(46F, -47.25F, 8F);

        gunModel[301].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[301].setRotationPoint(46F, -48.25F, 10F);

        gunModel[302].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, 1.5F, -1.99F, 0.0F, 1.5F, -1.99F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[302].setRotationPoint(46F, -44.25F, 14.5F);

        gunModel[303].addShapeBox(122F, -17F, -10F, 2, 2, 4, 0F, 0.0F, 0.0F, -1.85F, -1.99F, 0.0F, -1.85F, -1.99F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import Import
        gunModel[303].setRotationPoint(46F, -44.25F, 1.5F);

        gunModel[304].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F); // Import Import
        gunModel[304].setRotationPoint(46F, -47.25F, 5F);

        gunModel[305].addShapeBox(122F, -17F, -10F, 4, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[305].setRotationPoint(42F, -48.25F, 5F);

        gunModel[306].addShapeBox(122F, -17F, -10F, 4, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[306].setRotationPoint(52F, -48.25F, 10F);

        gunModel[307].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[307].setRotationPoint(56F, -48.25F, 5F);

        gunModel[308].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[308].setRotationPoint(56F, -47.25F, 8F);

        gunModel[309].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[309].setRotationPoint(56F, -48.25F, 10F);

        gunModel[310].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F); // Import Import
        gunModel[310].setRotationPoint(56F, -47.25F, 5F);

        gunModel[311].addShapeBox(122F, -17F, -10F, 4, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[311].setRotationPoint(52F, -48.25F, 5F);

        gunModel[312].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F); // Import Import
        gunModel[312].setRotationPoint(20F, -48.25F, 5F);

        gunModel[313].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[313].setRotationPoint(20F, -48.25F, 10F);

        gunModel[314].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[314].setRotationPoint(21F, -47.25F, 8F);

        gunModel[315].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F); // Import Import
        gunModel[315].setRotationPoint(31F, -47.25F, 5F);

        gunModel[316].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[316].setRotationPoint(31F, -47.25F, 8F);

        gunModel[317].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F); // Import Import
        gunModel[317].setRotationPoint(30F, -48.25F, 5F);

        gunModel[318].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[318].setRotationPoint(30F, -48.25F, 10F);

        gunModel[319].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F); // Import Import
        gunModel[319].setRotationPoint(21F, -47.25F, 5F);

        gunModel[320].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F); // Import Import
        gunModel[320].setRotationPoint(40F, -48.25F, 5F);

        gunModel[321].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[321].setRotationPoint(40F, -48.25F, 10F);

        gunModel[322].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[322].setRotationPoint(41F, -47.25F, 8F);

        gunModel[323].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F); // Import Import
        gunModel[323].setRotationPoint(51F, -47.25F, 5F);

        gunModel[324].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[324].setRotationPoint(51F, -47.25F, 8F);

        gunModel[325].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, -1.0F, 0.0F, -3.45F); // Import Import
        gunModel[325].setRotationPoint(50F, -48.25F, 5F);

        gunModel[326].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -1.0F, 0.0F, -3.55F, 0.0F, 0.0F, -3.55F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F); // Import Import
        gunModel[326].setRotationPoint(50F, -48.25F, 10F);

        gunModel[327].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F); // Import Import
        gunModel[327].setRotationPoint(41F, -47.25F, 5F);

        gunModel[328].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[328].setRotationPoint(36F, -48.25F, 5F);

        gunModel[329].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[329].setRotationPoint(36F, -47.25F, 8F);

        gunModel[330].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[330].setRotationPoint(36F, -48.25F, 10F);

        gunModel[331].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F); // Import Import
        gunModel[331].setRotationPoint(36F, -47.25F, 5F);

        gunModel[332].addShapeBox(122F, -17F, -10F, 2, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[332].setRotationPoint(26F, -48.25F, 5F);

        gunModel[333].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[333].setRotationPoint(26F, -47.25F, 8F);

        gunModel[334].addShapeBox(122F, -17F, -10F, 2, 1, 5, 0F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.55F, -1.0F, 0.0F, -3.55F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[334].setRotationPoint(26F, -48.25F, 10F);

        gunModel[335].addShapeBox(122F, -17F, -10F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F); // Import Import
        gunModel[335].setRotationPoint(26F, -47.25F, 5F);

        gunModel[336].addShapeBox(122F, -17F, -10F, 4, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[336].setRotationPoint(32F, -48.25F, 5F);

        gunModel[337].addShapeBox(122F, -17F, -10F, 4, 1, 12, 0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.45F, 0.0F, 0.0F, -3.45F); // Import Import
        gunModel[337].setRotationPoint(22F, -48.25F, 5F);

        gunModel[338].addShapeBox(122F, -17F, -10F, 76, 19, 16, 0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[338].setRotationPoint(-234.25F, -24.5F, 2F);

        gunModel[339].addShapeBox(122F, -17F, -10F, 1, 19, 15, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[339].setRotationPoint(-157.25F, -24.5F, 2.5F);

        gunModel[340].addShapeBox(122F, -17F, -10F, 23, 2, 16, 0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[340].setRotationPoint(-180.25F, -26.25F, 2F);

        gunModel[341].addShapeBox(122F, -17F, -10F, 1, 2, 15, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F); // Import Import
        gunModel[341].setRotationPoint(-157.25F, -5.5F, 2.5F);

        gunModel[342].addShapeBox(122F, -17F, -10F, 29, 3, 16, 0F, 0.0F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[342].setRotationPoint(-186.25F, -6.5F, 2F);

        gunModel[343].addShapeBox(122F, -17F, -10F, 1, 2, 15, 0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[343].setRotationPoint(-157.25F, -26.5F, 2.5F);

        gunModel[344].addShapeBox(122F, -17F, -10F, 7, 3, 16, 0F, 0.0F, -4.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 4.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 4.0F, -1.0F); // Import Import
        gunModel[344].setRotationPoint(-193.25F, -6.5F, 2F);

        gunModel[345].addShapeBox(122F, -17F, -10F, 6, 3, 16, 0F, 0.0F, -7.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -7.75F, 0.0F, 0.0F, 7.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 7.0F, -1.0F); // Import Import
        gunModel[345].setRotationPoint(-199.25F, -2.5F, 2F);

        gunModel[346].addShapeBox(122F, -17F, -10F, 3, 2, 16, 0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[346].setRotationPoint(-237.25F, -26.25F, 2F);

        gunModel[347].addShapeBox(122F, -17F, -10F, 3, 2, 16, 0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[347].setRotationPoint(-183.25F, -26.25F, 2F);

        gunModel[348].addShapeBox(122F, -17F, -10F, 27, 2, 16, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[348].setRotationPoint(-264.25F, -26.25F, 2F);

        gunModel[349].addShapeBox(122F, -17F, -10F, 30, 8, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[349].setRotationPoint(-264.25F, -24.5F, 2F);

        gunModel[350].addShapeBox(122F, -17F, -10F, 7, 3, 16, 0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 1.75F, 0.0F); // Import Import
        gunModel[350].setRotationPoint(-193.25F, -6.5F, 2F);

        gunModel[351].addShapeBox(122F, -17F, -10F, 10, 48, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[351].setRotationPoint(-264.25F, -17F, 2F);

        gunModel[352].addShapeBox(122F, -17F, -10F, 1, 56, 16, 0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F); // Import Import
        gunModel[352].setRotationPoint(-265.25F, -25F, 2F);

        gunModel[353].addShapeBox(122F, -17F, -10F, 2, 1, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[353].setRotationPoint(-218.25F, 30.75F, 2F);

        gunModel[354].addShapeBox(122F, -17F, -10F, 16, 37, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[354].setRotationPoint(-234.25F, -6F, 2F);

        gunModel[355].addShapeBox(122F, -17F, -10F, 20, 7, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[355].setRotationPoint(-254.25F, 24F, 2F);

        gunModel[356].addShapeBox(122F, -17F, -10F, 46, 1, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[356].setRotationPoint(-264.25F, 30.75F, 2F);

        gunModel[357].addShapeBox(122F, -17F, -10F, 1, 3, 16, 0F, -1.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F); // Import Import
        gunModel[357].setRotationPoint(-265.25F, -27F, 2F);

        gunModel[358].addShapeBox(122F, -17F, -10F, 6, 7, 16, 0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 4.75F, 0.0F); // Import Import
        gunModel[358].setRotationPoint(-199.25F, -6.5F, 2F);

        gunModel[359].addShapeBox(122F, -17F, -10F, 1, 2, 16, 0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, -1.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, -1.0F, -0.75F, -1.0F); // Import Import
        gunModel[359].setRotationPoint(-265.25F, 30.5F, 2F);

        gunModel[360].addShapeBox(122F, -17F, -10F, 2, 1, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[360].setRotationPoint(-216.25F, 31.75F, 2F);

        gunModel[361].addShapeBox(122F, -17F, -10F, 4, 3, 16, 0F, 0.0F, -9.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -9.75F, 0.0F, 0.0F, 9.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 9.0F, -1.0F); // Import Import
        gunModel[361].setRotationPoint(-203.25F, 4.5F, 2F);

        gunModel[362].addShapeBox(122F, -17F, -10F, 4, 14, 16, 0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 6.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 6.75F, 0.0F); // Import Import
        gunModel[362].setRotationPoint(-203.25F, -6.5F, 2F);

        gunModel[363].addShapeBox(122F, -17F, -10F, 15, 20, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[363].setRotationPoint(-218.25F, -6F, 2F);

        gunModel[364].addShapeBox(122F, -17F, -10F, 2, 12, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[364].setRotationPoint(-205.25F, 16.5F, 2F);

        gunModel[365].addShapeBox(122F, -17F, -10F, 2, 4, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F); // Import Import
        gunModel[365].setRotationPoint(-205.25F, 28.5F, 2F);

        gunModel[366].addShapeBox(122F, -17F, -10F, 2, 3, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.25F, 0.0F, 3.0F, 0.25F, -1.0F, 3.0F, 0.25F, -1.0F, -3.0F, 0.25F, 0.0F); // Import Import
        gunModel[366].setRotationPoint(-203.25F, 32.5F, 2F);

        gunModel[367].addShapeBox(122F, -17F, -10F, 2, 1, 16, 0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.45F, 0.0F, 0.25F, -0.45F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[367].setRotationPoint(-205.25F, 15.5F, 2F);

        gunModel[368].addShapeBox(122F, -17F, -10F, 2, 1, 16, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[368].setRotationPoint(-205.25F, 14.25F, 2F);

        gunModel[369].addShapeBox(122F, -17F, -10F, 15, 1, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[369].setRotationPoint(-218.25F, 14.25F, 2F);

        gunModel[370].addShapeBox(122F, -17F, -10F, 15, 1, 16, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[370].setRotationPoint(-218.25F, 15.25F, 2F);

        gunModel[371].addShapeBox(122F, -17F, -10F, 13, 12, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[371].setRotationPoint(-218.25F, 16.25F, 2F);

        gunModel[372].addShapeBox(122F, -17F, -10F, 13, 2, 16, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 1.15F, 0.5F, 0.0F, 1.15F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import Import
        gunModel[372].setRotationPoint(-218.25F, 28.25F, 2F);

        gunModel[373].addShapeBox(122F, -17F, -10F, 13, 1, 16, 0F, 0.0F, -0.5F, 0.0F, 1.15F, -0.5F, 0.0F, 1.15F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 1.65F, 0.5F, 0.0F, 1.65F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F); // Import Import
        gunModel[373].setRotationPoint(-218.25F, 30.25F, 2F);

        gunModel[374].addShapeBox(122F, -17F, -10F, 13, 1, 16, 0F, -1.0F, -0.5F, 0.0F, 0.65F, -0.5F, 0.0F, 0.65F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F); // Import Import
        gunModel[374].setRotationPoint(-217.25F, 31.25F, 2F);

        gunModel[375].addShapeBox(122F, -17F, -10F, 12, 2, 16, 0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, 3.1F, 0.25F, 0.0F, 3.1F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F); // Import Import
        gunModel[375].setRotationPoint(-216.25F, 32.5F, 2F);

        gunModel[376].addShapeBox(122F, -17F, -10F, 1, 4, 16, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F); // Import Import
        gunModel[376].setRotationPoint(-214.25F, 35.75F, 2F);

        gunModel[377].addShapeBox(122F, -17F, -10F, 1, 1, 16, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[377].setRotationPoint(-214.25F, 34.75F, 2F);

        gunModel[378].addShapeBox(122F, -17F, -10F, 14, 1, 16, 0F, 1.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[378].setRotationPoint(-213.25F, 34.75F, 2F);

        gunModel[379].addShapeBox(122F, -17F, -10F, 2, 1, 16, 0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F); // Import Import
        gunModel[379].setRotationPoint(-200.25F, 38.75F, 2F);

        gunModel[380].addShapeBox(122F, -17F, -10F, 13, 3, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); // Import Import
        gunModel[380].setRotationPoint(-213.25F, 35.75F, 2F);

        gunModel[381].addShapeBox(122F, -17F, -10F, 11, 1, 16, 0F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[381].setRotationPoint(-212.25F, 38.75F, 2F);

        gunModel[382].addShapeBox(122F, -17F, -10F, 2, 3, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F); // Import Import
        gunModel[382].setRotationPoint(-200.25F, 35.75F, 2F);

        gunModel[383].addShapeBox(122F, -17F, -10F, 1, 1, 16, 0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F); // Import Import
        gunModel[383].setRotationPoint(-212.5F, 39.75F, 2F);

        gunModel[384].addShapeBox(122F, -17F, -10F, 2, 1, 16, 0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[384].setRotationPoint(-201.75F, 39.75F, 2F);

        gunModel[385].addShapeBox(122F, -17F, -10F, 8, 1, 16, 0F, 2.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import Import
        gunModel[385].setRotationPoint(-209.75F, 39.75F, 2F);

        gunModel[386].addShapeBox(122F, -17F, -10F, 5, 2, 16, 0F, 0.5F, 3.75F, 0.0F, 0.5F, -2F, 0.0F, 0.5F, -2F, 0.0F, 0.5F, 3.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import Import
        gunModel[386].setRotationPoint(-253.75F, 22.25F, 2F);

        gunModel[387].addShapeBox(122F, -17F, -10F, 3, 48, 10, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[387].setRotationPoint(-268.25F, -21F, 4F);

        gunModel[388].addShapeBox(122F, -17F, -10F, 3, 2, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F); // Import Import
        gunModel[388].setRotationPoint(-268.25F, 26.75F, 4F);

        gunModel[389].addShapeBox(122F, -17F, -10F, 3, 2, 10, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[389].setRotationPoint(-268.25F, -22.75F, 4F);

        gunModel[390].addShapeBox(122F, -17F, -10F, 13, 59, 16, 0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 3.75F, 0.0F); // Import Import
        gunModel[390].setRotationPoint(-281.25F, -27F, 2F);

        gunModel[391].addShapeBox(122F, -17F, -10F, 4, 2, 16, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F); // Import Import
        gunModel[391].setRotationPoint(-285.25F, 34F, 2F);

        gunModel[392].addShapeBox(122F, -17F, -10F, 3, 12, 16, 0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        gunModel[392].setRotationPoint(-284.25F, 15F, 2F);

        gunModel[393].addShapeBox(122F, -17F, -10F, 3, 12, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import Import
        gunModel[393].setRotationPoint(-284.25F, -18F, 2F);

        gunModel[394].addShapeBox(122F, -17F, -10F, 4, 12, 16, 0F, 1.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[394].setRotationPoint(-285.25F, -30F, 2F);

        gunModel[395].addShapeBox(122F, -17F, -10F, 4, 7, 16, 0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        gunModel[395].setRotationPoint(-285.25F, 27F, 2F);

        gunModel[396].addShapeBox(122F, -17F, -10F, 3, 21, 16, 0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import Import
        gunModel[396].setRotationPoint(-284.25F, -6F, 2F);

        gunModel[397].addShapeBox(122F, -17F, -10F, 13, 3, 16, 0F, 0.0F, 2.5F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, 2.5F, -3.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F); // Import Import
        gunModel[397].setRotationPoint(-281.25F, -31F, 2F);

        gunModel[398].addShapeBox(122F, -17F, -10F, 6, 3, 16, 0F, -1.5F, 0.75F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, -1.5F, 0.75F, -3.0F, -0.5F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -0.5F, 0.25F, 0.0F); // Import Import
        gunModel[398].setRotationPoint(-287.25F, -33.75F, 2F);

        gunModel[399].addShapeBox(122F, -17F, -10F, 18, 40, 16, 0F, -5F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -5F, 0.0F, 0.0F, 5F, 0.0F, 0.0F, -8F, 0.0F, 0.0F, -8F, 0.0F, 0.0F, 5F, 0.0F, 0.0F); // Import Import
        gunModel[399].setRotationPoint(-144.25F, -4F, 2F);

        gunModel[400].addShapeBox(122F, -17F, -10F, 8, 1, 10, 0F, 0.0F, 6F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0F, 6F, 0.0F, 0.0F, -6F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -6F, 0.0F); // Import Import
        gunModel[400].setRotationPoint(-123.25F, 8.5F, 5F);

        gunModel[401].addShapeBox(122F, -17F, -10F, 3, 1, 10, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[401].setRotationPoint(-115.25F, 9.5F, 5F);

        gunModel[402].addShapeBox(122F, -17F, -10F, 2, 1, 10, 0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F); // Import Import
        gunModel[402].setRotationPoint(-92.25F, 11.5F, 5F);

        gunModel[403].addShapeBox(122F, -17F, -10F, 17, 1, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[403].setRotationPoint(-109.25F, 13F, 5F);

        gunModel[404].addShapeBox(122F, -17F, -10F, 3, 1, 10, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F); // Import Import
        gunModel[404].setRotationPoint(-112.25F, 11.5F, 5F);

        gunModel[405].addShapeBox(122F, -17F, -10F, 1, 6, 10, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        gunModel[405].setRotationPoint(-87.25F, -3.5F, 5F);

        gunModel[406].addShapeBox(122F, -17F, -10F, 2, 6, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[406].setRotationPoint(-86.25F, -3.5F, 5F);

        gunModel[407].addShapeBox(122F, -17F, -10F, 2, 4, 10, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); // Import Import
        gunModel[407].setRotationPoint(-87.25F, 2.5F, 5F);

        gunModel[408].addShapeBox(122F, -17F, -10F, 2, 4, 10, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); // Import Import
        gunModel[408].setRotationPoint(-88.5F, 6.5F, 5F);

        gunModel[409].addShapeBox(122F, -17F, -10F, 2, 2, 10, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import Import
        gunModel[409].setRotationPoint(-90.25F, 10.5F, 5F);

        gunModel[410].addShapeBox(122F, -17F, -10F, 2, 2, 10, 0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import Import
        gunModel[410].setRotationPoint(-90.25F, 11.5F, 5F);

        gunModel[411].addShapeBox(122F, -17F, -10F, 3, 3, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[411].setRotationPoint(-86.25F, -6.5F, 5F);

        gunModel[412].addShapeBox(122F, -17F, -10F, 2, 2, 5, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[412].setRotationPoint(-107.5F, -3.5F, 7.5F);

        gunModel[413].addShapeBox(122F, -17F, -10F, 2, 2, 5, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import Import
        gunModel[413].setRotationPoint(-108F, -1.5F, 7.5F);

        gunModel[414].addShapeBox(122F, -17F, -10F, 2, 2, 5, 0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import Import
        gunModel[414].setRotationPoint(-108F, 0.5F, 7.5F);

        gunModel[415].addShapeBox(122F, -17F, -10F, 2, 3, 5, 0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F); // Import Import
        gunModel[415].setRotationPoint(-108F, 2.5F, 7.5F);

        gunModel[416].addShapeBox(122F, -17F, -10F, 2, 2, 5, 0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F); // Import Import
        gunModel[416].setRotationPoint(-107F, 5.5F, 7.5F);

        gunModel[417].addShapeBox(122F, -17F, -10F, 2, 3, 5, 0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 2.75F, -1.0F, 0.0F, 2.75F, -1.0F, 0.0F, -3.25F, 0.0F, 0.0F); // Import Import
        gunModel[417].setRotationPoint(-105F, 7.5F, 7.5F);

        gunModel[418].addShapeBox(122F, -17F, -10F, 26, 4, 16, 0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F); // Import Import
        gunModel[418].setRotationPoint(-154.25F, 36F, 2F);

        gunModel[419].addShapeBox(122F, -17F, -10F, 26, 4, 5, 0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -7.0F, -4.0F, 0.0F, -7.0F, -4.0F, 0.0F, 8.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F); // Import Import
        gunModel[419].setRotationPoint(-154.25F, 36F, 18F);

        gunModel[420].addShapeBox(122F, -17F, -10F, 26, 4, 5, 0F, -7.0F, -4.0F, 0.0F, -7.0F, -4.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F); // Import Import
        gunModel[420].setRotationPoint(-154.25F, 36F, -3F);

        gunModel[421].addShapeBox(122F, -17F, -10F, 45, 3, 5, 0F, -19.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F); // Import Import
        gunModel[421].setRotationPoint(-166.25F, 40F, -3F);

        gunModel[422].addShapeBox(122F, -17F, -10F, 45, 3, 5, 0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F); // Import Import
        gunModel[422].setRotationPoint(-166.25F, 40F, 18F);

        gunModel[423].addShapeBox(122F, -17F, -10F, 41, 3, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[423].setRotationPoint(-162.25F, 40F, 2F);

        gunModel[424].addShapeBox(122F, -17F, -10F, 7, 10, 2, 0F, 0.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[424].setRotationPoint(-129.5F, -35.5F, 3.5F);

        gunModel[425].addShapeBox(122F, -17F, -10F, 12, 10, 2, 0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[425].setRotationPoint(-129.5F, -36F, 14.5F);

        gunModel[426].addShapeBox(122F, -17F, -10F, 12, 6, 9, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[426].setRotationPoint(-129.5F, -32F, 5.5F);

        gunModel[427].addShapeBox(122F, -17F, -10F, 12, 4, 3, 0F, 0.0F, -1.0F, -2.99F, 0.0F, -1.0F, -2.99F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[427].setRotationPoint(-129.5F, -35.25F, 11.5F);

        gunModel[428].addShapeBox(122F, -17F, -10F, 12, 4, 3, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.99F, 0.0F, -1.0F, -2.99F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[428].setRotationPoint(-129.5F, -35.25F, 5.5F);

        gunModel[429].addShapeBox(122F, -17F, -10F, 1, 10, 3, 0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[429].setRotationPoint(-117.5F, -36F, 14.5F);

        gunModel[430].addShapeBox(122F, -17F, -10F, 1, 10, 3, 0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[430].setRotationPoint(-117.5F, -36F, 2.5F);

        gunModel[431].addShapeBox(122F, -17F, -10F, 72, 4, 2, 0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[431].setRotationPoint(-93F, -38F, 17.5F);

        gunModel[432].addShapeBox(122F, -17F, -10F, 72, 5, 1, 0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[432].setRotationPoint(-93F, -34F, 17.5F);

        gunModel[433].addShapeBox(122F, -17F, -10F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F); // Import Import
        gunModel[433].setRotationPoint(-93.5F, -34.5F, 16.5F);

        gunModel[434].addShapeBox(122F, -17F, -10F, 2, 1, 1, 0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[434].setRotationPoint(-93.5F, -30F, 16.5F);

        gunModel[435].addShapeBox(122F, -17F, -10F, 11, 3, 15, 0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[435].setRotationPoint(-104F, -29F, 2.5F);

        gunModel[436].addShapeBox(122F, -17F, -10F, 32, 4, 4, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[436].setRotationPoint(-49F, -42F, 0.5F);

        gunModel[437].addShapeBox(122F, -17F, -10F, 32, 4, 5, 0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F); // Import Import
        gunModel[437].setRotationPoint(-49F, -46F, 3F);

        gunModel[438].addShapeBox(122F, -17F, -10F, 32, 1, 4, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[438].setRotationPoint(-49F, -42.5F, 1.5F);

        gunModel[439].addShapeBox(122F, -17F, -10F, 31, 2, 5, 0F, 0.0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F); // Import Import
        gunModel[439].setRotationPoint(-80F, -46F, 3F);

        gunModel[440].addShapeBox(122F, -17F, -10F, 1, 4, 16, 0F, 0.5F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Import Import
        gunModel[440].setRotationPoint(-44F, -42F, 2F);

        gunModel[441].addShapeBox(122F, -17F, -10F, 1, 1, 13, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F); // Import Import
        gunModel[441].setRotationPoint(-44F, -42.5F, 3.5F);

        gunModel[442].addShapeBox(122F, -17F, -10F, 2, 12, 16, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[442].setRotationPoint(-44.5F, -38.25F, 2F);

        gunModel[443].addShapeBox(122F, -17F, -10F, 31, 2, 14, 0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F); // Import Import
        gunModel[443].setRotationPoint(-80F, -44.5F, 3F);

        gunModel[444].addShapeBox(122F, -17F, -10F, 24, 2, 14, 0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F); // Import Import
        gunModel[444].setRotationPoint(-104F, -44.5F, 3F);

        gunModel[445].addShapeBox(122F, -17F, -10F, 11, 4, 4, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[445].setRotationPoint(-91F, -42F, 0.5F);

        gunModel[446].addShapeBox(122F, -17F, -10F, 11, 4, 5, 0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F); // Import Import
        gunModel[446].setRotationPoint(-91F, -46F, 3F);

        gunModel[447].addShapeBox(122F, -17F, -10F, 11, 1, 4, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[447].setRotationPoint(-91F, -42.5F, 1.5F);

        gunModel[448].addShapeBox(122F, -17F, -10F, 3, 4, 3, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[448].setRotationPoint(-94.5F, -42F, 1.5F);

        gunModel[449].addShapeBox(122F, -17F, -10F, 3, 4, 4, 0F, 0.5F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F); // Import Import
        gunModel[449].setRotationPoint(-94.5F, -46F, 4F);

        gunModel[450].addShapeBox(122F, -17F, -10F, 3, 1, 3, 0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.5F, -0.25F, -2.0F); // Import Import
        gunModel[450].setRotationPoint(-94.5F, -42.5F, 2.5F);

        gunModel[451].addShapeBox(122F, -17F, -10F, 72, 4, 5, 0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 2.5F, 0.0F, -3.75F, 2.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 2.5F, -0.25F, -3.5F); // Import Import
        gunModel[451].setRotationPoint(-89F, -50F, 5F);

        gunModel[452].addShapeBox(122F, -17F, -10F, 1, 4, 4, 0F, 2.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -3.75F, 2.5F, 0.0F, -3.75F, 2.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -3.5F, 2.5F, -0.25F, -3.5F); // Import Import
        gunModel[452].setRotationPoint(-92.5F, -50F, 6F);

        gunModel[453].addShapeBox(122F, -17F, -10F, 1, 10, 2, 0F, -0.5F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F); // Import Import
        gunModel[453].setRotationPoint(-118.5F, -36F, 3.5F);

        gunModel[454].addShapeBox(122F, -17F, -10F, 5, 3, 2, 0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[454].setRotationPoint(-123F, -29F, 3.5F);

        gunModel[455].addShapeBox(122F, -17F, -10F, 1, 1, 2, 0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import Import
        gunModel[455].setRotationPoint(-118.75F, -28.5F, 3.5F);

        gunModel[456].addShapeBox(122F, -17F, -10F, 1, 1, 2, 0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import Import
        gunModel[456].setRotationPoint(-123.25F, -28.5F, 3.5F);

        gunModel[457].addShapeBox(122F, -17F, -10F, 6, 14, 2, 0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[457].setRotationPoint(-241.25F, -32.5F, 18F);

        gunModel[458].addShapeBox(122F, -17F, -10F, 8, 14, 2, 0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[458].setRotationPoint(-185.25F, -32.5F, 18F);

        gunModel[459].addShapeBox(122F, -17F, -10F, 49, 2, 2, 0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F); // Import Import
        gunModel[459].setRotationPoint(-234.25F, -32.5F, 18F);

        gunModel[460].addShapeBox(122F, -17F, -10F, 65, 3, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[460].setRotationPoint(-241.25F, -35.25F, 18F);

        gunModel[461].addShapeBox(122F, -17F, -10F, 65, 2, 2, 0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[461].setRotationPoint(-241.25F, -37.25F, 17F);

        gunModel[462].addShapeBox(122F, -17F, -10F, 65, 2, 2, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[462].setRotationPoint(-241.25F, -39.25F, 3F);

        gunModel[463].addShapeBox(122F, -17F, -10F, 49, 13, 1, 0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F); // Import Import
        gunModel[463].setRotationPoint(-234.25F, -31.5F, 18F);

        gunModel[464].addShapeBox(122F, -17F, -10F, 1, 11, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[464].setRotationPoint(-186.25F, -29.75F, 19F);

        gunModel[465].addShapeBox(122F, -17F, -10F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[465].setRotationPoint(-186.25F, -30.75F, 19F);

        gunModel[466].addShapeBox(122F, -17F, -10F, 48, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import Import
        gunModel[466].setRotationPoint(-233.5F, -30.75F, 19F);

        gunModel[467].addShapeBox(122F, -17F, -10F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[467].setRotationPoint(-234.5F, -30.75F, 19F);

        gunModel[468].addShapeBox(122F, -17F, -10F, 1, 11, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[468].setRotationPoint(-234.5F, -29.75F, 19F);

        gunModel[469].addShapeBox(122F, -17F, -10F, 65, 2, 2, 0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[469].setRotationPoint(-241.25F, -39.25F, 15F);

        gunModel[470].addShapeBox(122F, -17F, -10F, 65, 3, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[470].setRotationPoint(-241.25F, -35.25F, 0F);

        gunModel[471].addShapeBox(122F, -17F, -10F, 65, 2, 2, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[471].setRotationPoint(-241.25F, -37.25F, 1F);

        gunModel[472].addShapeBox(122F, -17F, -10F, 65, 1, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[472].setRotationPoint(-241.25F, -39.25F, 7F);

        gunModel[473].addShapeBox(122F, -17F, -10F, 65, 1, 6, 0F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[473].setRotationPoint(-241.25F, -40.25F, 7F);

        gunModel[474].addShapeBox(122F, -17F, -10F, 65, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[474].setRotationPoint(-241.25F, -32.25F, 0F);

        gunModel[475].addShapeBox(122F, -17F, -10F, 2, 15, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[475].setRotationPoint(-225.25F, -38.25F, 7F);

        gunModel[476].addShapeBox(122F, -17F, -10F, 2, 15, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[476].setRotationPoint(-227.25F, -38.25F, 7F);

        gunModel[477].addShapeBox(122F, -17F, -10F, 2, 15, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[477].setRotationPoint(-229.25F, -38.25F, 7F);

        gunModel[478].addShapeBox(122F, -17F, -10F, 2, 15, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[478].setRotationPoint(-210.25F, -38.25F, 7F);

        gunModel[479].addShapeBox(122F, -17F, -10F, 2, 15, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[479].setRotationPoint(-212.25F, -38.25F, 7F);

        gunModel[480].addShapeBox(122F, -17F, -10F, 2, 15, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[480].setRotationPoint(-214.25F, -38.25F, 7F);

        gunModel[481].addShapeBox(122F, -17F, -10F, 11, 4, 4, 0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[481].setRotationPoint(-224.25F, -23.5F, -1.5F);

        gunModel[482].addShapeBox(122F, -17F, -10F, 11, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[482].setRotationPoint(-224.25F, -19.5F, -1.5F);

        gunModel[483].addShapeBox(122F, -17F, -10F, 11, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F); // Import Import
        gunModel[483].setRotationPoint(-224.25F, -15.5F, -1.5F);

        gunModel[484].addShapeBox(122F, -17F, -10F, 9, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[484].setRotationPoint(-223.25F, -19F, -3F);

        gunModel[485].addShapeBox(122F, -17F, -10F, 9, 3, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F); // Import Import
        gunModel[485].setRotationPoint(-223.25F, -16F, -3F);

        gunModel[486].addShapeBox(122F, -17F, -10F, 9, 3, 2, 0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[486].setRotationPoint(-223.25F, -22F, -3F);

        gunModel[487].addShapeBox(122F, -17F, -10F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[487].setRotationPoint(-182.25F, -23.5F, 18.5F);

        gunModel[488].addShapeBox(122F, -17F, -10F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[488].setRotationPoint(-182.25F, -24.5F, 18.5F);

        gunModel[489].addShapeBox(122F, -17F, -10F, 3, 1, 2, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[489].setRotationPoint(-182.25F, -25.5F, 18.5F);

        gunModel[490].addShapeBox(122F, -17F, -10F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[490].setRotationPoint(-239.25F, -23.5F, 18.5F);

        gunModel[491].addShapeBox(122F, -17F, -10F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[491].setRotationPoint(-239.25F, -24.5F, 18.5F);

        gunModel[492].addShapeBox(122F, -17F, -10F, 3, 1, 2, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[492].setRotationPoint(-239.25F, -25.5F, 18.5F);

        gunModel[493].addShapeBox(122F, -17F, -10F, 2, 3, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[493].setRotationPoint(-231.75F, 31.75F, 6.5F);

        gunModel[494].addShapeBox(122F, -17F, -10F, 2, 3, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[494].setRotationPoint(-233.75F, 31.75F, 6.5F);

        gunModel[495].addShapeBox(122F, -17F, -10F, 2, 3, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[495].setRotationPoint(-235.75F, 31.75F, 6.5F);

        gunModel[496].addShapeBox(122F, -17F, -10F, 4, 3, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F); // Import Import
        gunModel[496].setRotationPoint(-238.75F, 35.75F, 3.5F);

        gunModel[497].addShapeBox(122F, -17F, -10F, 4, 3, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[497].setRotationPoint(-234.75F, 35.75F, 3.5F);

        gunModel[498].addShapeBox(122F, -17F, -10F, 4, 3, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[498].setRotationPoint(-230.75F, 35.75F, 3.5F);

        gunModel[499].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F); // Import Import
        gunModel[499].setRotationPoint(-231.75F, 40.75F, 6.5F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Import Import
        gunModel[501] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Import Import
        gunModel[502] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Import Import
        gunModel[503] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Import Import
        gunModel[504] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Import Import
        gunModel[505] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Import Import
        gunModel[506] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Import Import
        gunModel[507] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Import Import
        gunModel[508] = new ModelRendererTurbo(this, 945, 169, textureX, textureY); // Import Import
        gunModel[509] = new ModelRendererTurbo(this, 961, 185, textureX, textureY); // Import Import
        gunModel[510] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Import Import
        gunModel[511] = new ModelRendererTurbo(this, 593, 321, textureX, textureY); // Import Import
        gunModel[512] = new ModelRendererTurbo(this, 913, 337, textureX, textureY); // Import Import
        gunModel[513] = new ModelRendererTurbo(this, 609, 345, textureX, textureY); // Import Import
        gunModel[514] = new ModelRendererTurbo(this, 745, 217, textureX, textureY); // Import Import
        gunModel[515] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Import Import
        gunModel[516] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Import Import
        gunModel[517] = new ModelRendererTurbo(this, 913, 265, textureX, textureY); // Import Import
        gunModel[518] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Import Import
        gunModel[519] = new ModelRendererTurbo(this, 785, 273, textureX, textureY); // Import Import
        gunModel[520] = new ModelRendererTurbo(this, 977, 209, textureX, textureY); // Import Import
        gunModel[521] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Import Import
        gunModel[522] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Import
        gunModel[523] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Import
        gunModel[524] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import Import
        gunModel[525] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Import
        gunModel[526] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import Import
        gunModel[527] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Import
        gunModel[528] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import Import
        gunModel[529] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Import
        gunModel[530] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Import
        gunModel[531] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Import
        gunModel[532] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import Import
        gunModel[533] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import Import
        gunModel[534] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Import Import
        gunModel[535] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import Import
        gunModel[536] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Import Import
        gunModel[537] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import Import
        gunModel[538] = new ModelRendererTurbo(this, 937, 361, textureX, textureY); // Import Import
        gunModel[539] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Import Import
        gunModel[540] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Import Import
        gunModel[541] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Import Import
        gunModel[542] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Import Import
        gunModel[543] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Import Import
        gunModel[544] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import Import
        gunModel[545] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import Import
        gunModel[546] = new ModelRendererTurbo(this, 681, 393, textureX, textureY); // Import Import
        gunModel[547] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Import
        gunModel[548] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Import Import
        gunModel[549] = new ModelRendererTurbo(this, 81, 417, textureX, textureY); // Import Import
        gunModel[550] = new ModelRendererTurbo(this, 545, 417, textureX, textureY); // Import Import
        gunModel[551] = new ModelRendererTurbo(this, 225, 409, textureX, textureY); // Import Import
        gunModel[552] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Import Import
        gunModel[553] = new ModelRendererTurbo(this, 601, 433, textureX, textureY); // Import Import
        gunModel[554] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Import Import
        gunModel[555] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import Import
        gunModel[556] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Import Import
        gunModel[557] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import Import
        gunModel[558] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Import Import
        gunModel[559] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import Import
        gunModel[560] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import Import
        gunModel[561] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import Import
        gunModel[562] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import Import
        gunModel[563] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Import Import
        gunModel[564] = new ModelRendererTurbo(this, 137, 441, textureX, textureY); // Import Import
        gunModel[565] = new ModelRendererTurbo(this, 249, 441, textureX, textureY); // Import Import
        gunModel[566] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Import Import
        gunModel[567] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Import Import
        gunModel[568] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Import Import
        gunModel[569] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Import Import
        gunModel[570] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Import Import
        gunModel[571] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Import Import
        gunModel[572] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Import Import
        gunModel[573] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Import Import
        gunModel[574] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Import Import
        gunModel[575] = new ModelRendererTurbo(this, 721, 209, textureX, textureY); // Import Import
        gunModel[576] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Import Import
        gunModel[577] = new ModelRendererTurbo(this, 601, 449, textureX, textureY); // Import Import
        gunModel[578] = new ModelRendererTurbo(this, 841, 369, textureX, textureY); // Import Import
        gunModel[579] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); // Import Import
        gunModel[580] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Import Import
        gunModel[581] = new ModelRendererTurbo(this, 993, 385, textureX, textureY); // Import Import
        gunModel[582] = new ModelRendererTurbo(this, 833, 393, textureX, textureY); // Import Import
        gunModel[583] = new ModelRendererTurbo(this, 33, 401, textureX, textureY); // Import Import
        gunModel[584] = new ModelRendererTurbo(this, 81, 401, textureX, textureY); // Import Import
        gunModel[585] = new ModelRendererTurbo(this, 561, 401, textureX, textureY); // Import Import
        gunModel[586] = new ModelRendererTurbo(this, 713, 401, textureX, textureY); // Import Import
        gunModel[587] = new ModelRendererTurbo(this, 857, 401, textureX, textureY); // Import Import
        gunModel[588] = new ModelRendererTurbo(this, 889, 401, textureX, textureY); // Import Import
        gunModel[589] = new ModelRendererTurbo(this, 921, 401, textureX, textureY); // Import Import
        gunModel[590] = new ModelRendererTurbo(this, 321, 409, textureX, textureY); // Import Import
        gunModel[591] = new ModelRendererTurbo(this, 121, 417, textureX, textureY); // Import Import
        gunModel[592] = new ModelRendererTurbo(this, 393, 417, textureX, textureY); // Import Import
        gunModel[593] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Import Import
        gunModel[594] = new ModelRendererTurbo(this, 33, 425, textureX, textureY); // Import Import
        gunModel[595] = new ModelRendererTurbo(this, 137, 457, textureX, textureY); // Import Import
        gunModel[596] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Import Import
        gunModel[597] = new ModelRendererTurbo(this, 121, 473, textureX, textureY); // Import Import
        gunModel[598] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Import Import

        gunModel[500].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F); // Import Import
        gunModel[500].setRotationPoint(-233.75F, 40.75F, 6.5F);

        gunModel[501].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F); // Import Import
        gunModel[501].setRotationPoint(-235.75F, 40.75F, 6.5F);

        gunModel[502].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F); // Import Import
        gunModel[502].setRotationPoint(-231.75F, 34.75F, 6.5F);

        gunModel[503].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F); // Import Import
        gunModel[503].setRotationPoint(-233.75F, 34.75F, 6.5F);

        gunModel[504].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F); // Import Import
        gunModel[504].setRotationPoint(-235.75F, 34.75F, 6.5F);

        gunModel[505].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[505].setRotationPoint(-231.75F, 39.75F, 6.5F);

        gunModel[506].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[506].setRotationPoint(-233.75F, 39.75F, 6.5F);

        gunModel[507].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[507].setRotationPoint(-235.75F, 39.75F, 6.5F);

        gunModel[508].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[508].setRotationPoint(-231.75F, 38.75F, 6.5F);

        gunModel[509].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[509].setRotationPoint(-233.75F, 38.75F, 6.5F);

        gunModel[510].addShapeBox(122F, -17F, -10F, 2, 1, 6, 0F, 3.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[510].setRotationPoint(-235.75F, 38.75F, 6.5F);

        gunModel[511].addShapeBox(122F, -17F, -10F, 4, 2, 12, 0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F); // Import Import
        gunModel[511].setRotationPoint(-238.75F, 41.75F, 3.5F);

        gunModel[512].addShapeBox(122F, -17F, -10F, 4, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[512].setRotationPoint(-234.75F, 41.75F, 3.5F);

        gunModel[513].addShapeBox(122F, -17F, -10F, 4, 2, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[513].setRotationPoint(-230.75F, 41.75F, 3.5F);

        gunModel[514].addShapeBox(122F, -17F, -10F, 2, 7, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[514].setRotationPoint(-231.75F, 43.75F, 6.5F);

        gunModel[515].addShapeBox(122F, -17F, -10F, 2, 7, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[515].setRotationPoint(-233.75F, 43.75F, 6.5F);

        gunModel[516].addShapeBox(122F, -17F, -10F, 2, 7, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); // Import Import
        gunModel[516].setRotationPoint(-235.75F, 43.75F, 6.5F);

        gunModel[517].addShapeBox(122F, -17F, -10F, 3, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[517].setRotationPoint(-231.25F, 47.75F, 5F);

        gunModel[518].addShapeBox(122F, -17F, -10F, 3, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[518].setRotationPoint(-234.25F, 47.75F, 5F);

        gunModel[519].addShapeBox(122F, -17F, -10F, 3, 2, 9, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F); // Import Import
        gunModel[519].setRotationPoint(-237.25F, 47.75F, 5F);

        gunModel[520].addShapeBox(122F, -17F, -10F, 13, 4, 2, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[520].setRotationPoint(-113.5F, -33.5F, 19.5F);

        gunModel[521].addShapeBox(122F, -17F, -10F, 2, 4, 2, 0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -1.25F, 0.0F); // Import Import
        gunModel[521].setRotationPoint(-115.5F, -33.5F, 19.5F);

        gunModel[522].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[522].setRotationPoint(-113.25F, -31.25F, 21F);

        gunModel[523].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[523].setRotationPoint(-113.25F, -32.25F, 21F);

        gunModel[524].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[524].setRotationPoint(-113.25F, -33.25F, 21F);

        gunModel[525].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[525].setRotationPoint(-104.25F, -31.25F, 21F);

        gunModel[526].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[526].setRotationPoint(-104.25F, -32.25F, 21F);

        gunModel[527].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[527].setRotationPoint(-104.25F, -33.25F, 21F);

        gunModel[528].addShapeBox(122F, -17F, -10F, 4, 4, 2, 0F, -3.0F, 0.25F, 0.0F, 4.5F, 0.25F, 0.0F, 4.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F); // Import Import
        gunModel[528].setRotationPoint(-109.5F, -37.5F, 19F);

        gunModel[529].addShapeBox(122F, -17F, -10F, 6, 1, 2, 0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[529].setRotationPoint(-106.5F, -38.75F, 19F);

        gunModel[530].addShapeBox(122F, -17F, -10F, 5, 1, 2, 0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        gunModel[530].setRotationPoint(-106F, -39.75F, 19F);

        gunModel[531].addShapeBox(122F, -17F, -10F, 5, 1, 2, 0F, -2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F); // Import Import
        gunModel[531].setRotationPoint(-106F, -40.25F, 19F);

        gunModel[532].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        gunModel[532].setRotationPoint(-104.75F, -37.75F, 20.25F);

        gunModel[533].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[533].setRotationPoint(-104.75F, -38.75F, 20.25F);

        gunModel[534].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        gunModel[534].setRotationPoint(-104.75F, -39.75F, 20.25F);

        gunModel[535].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F); // Import Import
        gunModel[535].setRotationPoint(-36.25F, -39.75F, 17.15F);

        gunModel[536].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F); // Import Import
        gunModel[536].setRotationPoint(-36.25F, -40.75F, 17.15F);

        gunModel[537].addShapeBox(122F, -17F, -10F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F); // Import Import
        gunModel[537].setRotationPoint(-36.25F, -41.75F, 17.15F);

        gunModel[538].addShapeBox(122F, -17F, -10F, 15, 4, 4, 0F, 1.25F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 1.25F, -0.25F, -1.0F, 1.25F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F); // Import Import
        gunModel[538].setRotationPoint(-32F, -42F, 15.5F);

        gunModel[539].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, 0.3F, 0.0F, -0.25F, 0.3F); // Import Import
        gunModel[539].setRotationPoint(-36.25F, -41.5F, 15.5F);

        gunModel[540].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, 0.0F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, -0.45F, 0.0F, -0.25F, -0.45F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F); // Import Import
        gunModel[540].setRotationPoint(-36.25F, -40F, 15.5F);

        gunModel[541].addShapeBox(122F, -17F, -10F, 3, 1, 4, 0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import Import
        gunModel[541].setRotationPoint(-36.25F, -39F, 15.5F);

        gunModel[542].addShapeBox(122F, -17F, -10F, 1, 1, 4, 0F, -1.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.45F, -1.0F, -0.25F, -0.45F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F); // Import Import
        gunModel[542].setRotationPoint(-34.25F, -40F, 15.5F);

        gunModel[543].addShapeBox(122F, -17F, -10F, 1, 1, 3, 0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.3F, -1.0F, -0.25F, 0.3F); // Import Import
        gunModel[543].setRotationPoint(-34.25F, -41.5F, 15.5F);

        gunModel[544].addShapeBox(122F, -17F, -10F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F); // Import Import
        gunModel[544].setRotationPoint(-93.5F, -34.5F, 18F);

        gunModel[545].addShapeBox(122F, -17F, -10F, 2, 1, 1, 0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F); // Import Import
        gunModel[545].setRotationPoint(-93.5F, -30F, 18F);

        gunModel[546].addShapeBox(122F, -17F, -10F, 5, 2, 16, 0F, 0.5F, -2F, 0F, 0.5F, 3.75F, 0F, 0.5F, 3.75F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Import
        gunModel[546].setRotationPoint(-239.75F, 22.25F, 2F);

        gunModel[547].addShapeBox(122F, -17F, -10F, 5, 2, 16, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 3.75F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 3.75F, 0F); // Import Import
        gunModel[547].setRotationPoint(-253.75F, -16.75F, 2F);

        gunModel[548].addShapeBox(122F, -17F, -10F, 5, 2, 16, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 3.75F, 0F, 0.5F, 3.75F, 0F, 0.5F, -2F, 0F); // Import Import
        gunModel[548].setRotationPoint(-239.75F, -16.75F, 2F);

        gunModel[549].addShapeBox(122F, -17F, -10F, 9, 40, 16, 0F, -3.6F, 0.0F, 0.0F, 0.6F, 0.0F, -4F, 0.6F, 0.0F, -4F, -3.6F, 0.0F, 0.0F, 5F, 0.0F, 0.0F, -8F, 0.0F, -4F, -8F, 0.0F, -4F, 5F, 0.0F, 0.0F); // Import Import
        gunModel[549].setRotationPoint(-129.25F, -4F, 2F);

        gunModel[550].addShapeBox(122F, -17F, -10F, 8, 40, 16, 0F, -8F, 0F, -4F, 5F, 0F, 0F, 5F, 0F, 0F, -8F, 0F, -4F, 2F, 0F, -4F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, -4F); // Import Import
        gunModel[550].setRotationPoint(-152.25F, -4F, 2F);

        gunModel[551].addShapeBox(122F, -17F, -10F, 52, 10, 1, 0F, 0.0F, -1F, 0F, 0.5F, -1F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); // Import Import
        gunModel[551].setRotationPoint(35F, -40.75F, 22.5F);

        gunModel[552].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[552].setRotationPoint(35F, -40.75F, 24.5F);

        gunModel[553].addShapeBox(122F, -17F, -10F, 196, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Import
        gunModel[553].setRotationPoint(-106F, -51F, 4F);

        gunModel[554].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[554].setRotationPoint(40F, -40.75F, 24.5F);

        gunModel[555].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[555].setRotationPoint(45F, -40.75F, 24.5F);

        gunModel[556].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[556].setRotationPoint(50F, -40.75F, 24.5F);

        gunModel[557].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[557].setRotationPoint(55F, -40.75F, 24.5F);

        gunModel[558].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[558].setRotationPoint(60F, -40.75F, 24.5F);

        gunModel[559].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[559].setRotationPoint(65F, -40.75F, 24.5F);

        gunModel[560].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[560].setRotationPoint(70F, -40.75F, 24.5F);

        gunModel[561].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[561].setRotationPoint(75F, -40.75F, 24.5F);

        gunModel[562].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[562].setRotationPoint(80F, -40.75F, 24.5F);

        gunModel[563].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[563].setRotationPoint(85F, -40.75F, 24.5F);

        gunModel[564].addShapeBox(122F, -17F, -10F, 52, 6, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Import
        gunModel[564].setRotationPoint(35F, -38.75F, -2.5F);

        gunModel[565].addShapeBox(122F, -17F, -10F, 52, 10, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Import
        gunModel[565].setRotationPoint(35F, -40.75F, -3.5F);

        gunModel[566].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[566].setRotationPoint(35F, -40.75F, -5.5F);

        gunModel[567].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[567].setRotationPoint(40F, -40.75F, -5.5F);

        gunModel[568].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[568].setRotationPoint(45F, -40.75F, -5.5F);

        gunModel[569].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[569].setRotationPoint(50F, -40.75F, -5.5F);

        gunModel[570].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[570].setRotationPoint(55F, -40.75F, -5.5F);

        gunModel[571].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[571].setRotationPoint(60F, -40.75F, -5.5F);

        gunModel[572].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[572].setRotationPoint(65F, -40.75F, -5.5F);

        gunModel[573].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[573].setRotationPoint(70F, -40.75F, -5.5F);

        gunModel[574].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[574].setRotationPoint(75F, -40.75F, -5.5F);

        gunModel[575].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[575].setRotationPoint(80F, -40.75F, -5.5F);

        gunModel[576].addShapeBox(122F, -17F, -10F, 2, 10, 1, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Import
        gunModel[576].setRotationPoint(85F, -40.75F, -5.5F);

        gunModel[577].addShapeBox(122F, -17F, -10F, 196, 2, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Import
        gunModel[577].setRotationPoint(-106F, -53F, 4F);

        gunModel[578].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[578].setRotationPoint(-106F, -54F, 4F);

        gunModel[579].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[579].setRotationPoint(-101F, -54F, 4F);

        gunModel[580].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[580].setRotationPoint(-96F, -54F, 4F);

        gunModel[581].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[581].setRotationPoint(-91F, -54F, 4F);

        gunModel[582].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[582].setRotationPoint(-86F, -54F, 4F);

        gunModel[583].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[583].setRotationPoint(-81F, -54F, 4F);

        gunModel[584].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[584].setRotationPoint(-76F, -54F, 4F);

        gunModel[585].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[585].setRotationPoint(-71F, -54F, 4F);

        gunModel[586].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[586].setRotationPoint(-66F, -54F, 4F);

        gunModel[587].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[587].setRotationPoint(-61F, -54F, 4F);

        gunModel[588].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[588].setRotationPoint(-56F, -54F, 4F);

        gunModel[589].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[589].setRotationPoint(-51F, -54F, 4F);

        gunModel[590].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[590].setRotationPoint(-46F, -54F, 4F);

        gunModel[591].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[591].setRotationPoint(-41F, -54F, 4F);

        gunModel[592].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[592].setRotationPoint(-36F, -54F, 4F);

        gunModel[593].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[593].setRotationPoint(-31F, -54F, 4F);

        gunModel[594].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[594].setRotationPoint(-26F, -54F, 4F);

        gunModel[595].addShapeBox(122F, -17F, -10F, 111, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[595].setRotationPoint(-21F, -54F, 4F);

        gunModel[596].addShapeBox(122F, -17F, -10F, 116, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        gunModel[596].setRotationPoint(-28F, -18.5F, 4F);

        gunModel[597].addShapeBox(122F, -17F, -10F, 118, 1, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, -2.25F, 0.0F, 0F, -2.25F, 0.0F, 0F, -2.25F, 0.0F, 0F, -2.25F); // Import Import
        gunModel[597].setRotationPoint(-30F, -19.5F, 3.5F);

        gunModel[598].addShapeBox(122F, -17F, -10F, 116, 2, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Import
        gunModel[598].setRotationPoint(-28F, -17.5F, 4F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 961, 361, textureX, textureY); // Import Import
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 369, 369, textureX, textureY); // Import Import
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Import Import
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Import Import
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 521, 369, textureX, textureY); // Import Import
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 569, 369, textureX, textureY); // Import Import
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 617, 369, textureX, textureY); // Import Import
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 665, 369, textureX, textureY); // Import Import
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 713, 369, textureX, textureY); // Import Import
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 761, 369, textureX, textureY); // Import Import
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 809, 369, textureX, textureY); // Import Import
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 857, 369, textureX, textureY); // Import Import
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Import Import
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Import Import
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 97, 377, textureX, textureY); // Import Import
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); // Import Import
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 505, 369, textureX, textureY); // Import Import
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 137, 377, textureX, textureY); // Import Import
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 553, 369, textureX, textureY); // Import Import
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 601, 369, textureX, textureY); // Import Import
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Import Import
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 993, 361, textureX, textureY); // Import Import
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 649, 369, textureX, textureY); // Import Import
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Import Import
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Import Import
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 513, 225, textureX, textureY); // Import Import
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 553, 225, textureX, textureY); // Import Import
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 577, 225, textureX, textureY); // Import Import
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 609, 225, textureX, textureY); // Import Import
        defaultBarrelModel[29] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Import Import
        defaultBarrelModel[30] = new ModelRendererTurbo(this, 257, 377, textureX, textureY); // Import Import
        defaultBarrelModel[31] = new ModelRendererTurbo(this, 697, 369, textureX, textureY); // Import Import
        defaultBarrelModel[32] = new ModelRendererTurbo(this, 745, 369, textureX, textureY); // Import Import
        defaultBarrelModel[33] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Import Import
        defaultBarrelModel[34] = new ModelRendererTurbo(this, 913, 377, textureX, textureY); // Import Import
        defaultBarrelModel[35] = new ModelRendererTurbo(this, 945, 385, textureX, textureY); // Import Import
        defaultBarrelModel[36] = new ModelRendererTurbo(this, 113, 385, textureX, textureY); // Import Import
        defaultBarrelModel[37] = new ModelRendererTurbo(this, 393, 433, textureX, textureY); // Import Import
        defaultBarrelModel[38] = new ModelRendererTurbo(this, 457, 433, textureX, textureY); // Import Import
        defaultBarrelModel[39] = new ModelRendererTurbo(this, 489, 433, textureX, textureY); // Import Import
        defaultBarrelModel[40] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Import Import
        defaultBarrelModel[41] = new ModelRendererTurbo(this, 345, 441, textureX, textureY); // Import Import
        defaultBarrelModel[42] = new ModelRendererTurbo(this, 25, 441, textureX, textureY); // Import Import

        defaultBarrelModel[0].addShapeBox(122F, -17F, -10F, 5, 5, 18, 0F, 0.0F, -4.75F, -7.25F, -1.0F, -0.5F, -6.0F, -1.0F, -0.5F, -6.0F, 0.0F, -4.75F, -7.25F, 0.0F, 3.25F, -3.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, -3.75F); // Import Import
        defaultBarrelModel[0].setRotationPoint(238F, -46.75F, 1F);

        defaultBarrelModel[1].addShapeBox(122F, -17F, -10F, 5, 3, 12, 0F, 0.0F, 0.25F, -0.75F, 0.0F, 3.0F, 3.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 3.0F, 3.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.25F, -0.75F); // Import Import
        defaultBarrelModel[1].setRotationPoint(238F, -38.25F, 4F);

        defaultBarrelModel[2].addShapeBox(122F, -17F, -10F, 4, 9, 18, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[2].setRotationPoint(259F, -41.25F, 1F);

        defaultBarrelModel[3].addShapeBox(122F, -17F, -10F, 20, 5, 18, 0F, 1.0F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, 1.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[3].setRotationPoint(243F, -46.25F, 1F);

        defaultBarrelModel[4].addShapeBox(122F, -17F, -10F, 4, 5, 18, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, 1.5F, 0.0F, -6.0F, -0.5F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[4].setRotationPoint(259F, -32.25F, 1F);

        defaultBarrelModel[5].addShapeBox(122F, -17F, -10F, 4, 9, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[5].setRotationPoint(266F, -41.25F, 1F);

        defaultBarrelModel[6].addShapeBox(122F, -17F, -10F, 4, 5, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[6].setRotationPoint(266F, -32.25F, 1F);

        defaultBarrelModel[7].addShapeBox(122F, -17F, -10F, 4, 5, 18, 0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[7].setRotationPoint(266F, -46.25F, 1F);

        defaultBarrelModel[8].addShapeBox(122F, -17F, -10F, 4, 9, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[8].setRotationPoint(273F, -41.25F, 1F);

        defaultBarrelModel[9].addShapeBox(122F, -17F, -10F, 4, 5, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[9].setRotationPoint(273F, -32.25F, 1F);

        defaultBarrelModel[10].addShapeBox(122F, -17F, -10F, 4, 5, 18, 0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[10].setRotationPoint(273F, -46.25F, 1F);

        defaultBarrelModel[11].addShapeBox(122F, -17F, -10F, 4, 9, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[11].setRotationPoint(281F, -41.25F, 1F);

        defaultBarrelModel[12].addShapeBox(122F, -17F, -10F, 4, 5, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[12].setRotationPoint(281F, -32.25F, 1F);

        defaultBarrelModel[13].addShapeBox(122F, -17F, -10F, 4, 5, 18, 0F, -2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[13].setRotationPoint(281F, -46.25F, 1F);

        defaultBarrelModel[14].addShapeBox(122F, -17F, -10F, 3, 9, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[14].setRotationPoint(263F, -41.25F, 3.5F);

        defaultBarrelModel[15].addShapeBox(122F, -17F, -10F, 3, 4, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[15].setRotationPoint(263F, -32.25F, 3.5F);

        defaultBarrelModel[16].addShapeBox(122F, -17F, -10F, 3, 4, 13, 0F, -1.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[16].setRotationPoint(263F, -45.25F, 3.5F);

        defaultBarrelModel[17].addShapeBox(122F, -17F, -10F, 3, 9, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[17].setRotationPoint(270F, -41.25F, 3.5F);

        defaultBarrelModel[18].addShapeBox(122F, -17F, -10F, 3, 4, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.5F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[18].setRotationPoint(270F, -32.25F, 3.5F);

        defaultBarrelModel[19].addShapeBox(122F, -17F, -10F, 3, 4, 13, 0F, -1.5F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -6.0F, -1.5F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[19].setRotationPoint(270F, -45.25F, 3.5F);

        defaultBarrelModel[20].addShapeBox(122F, -17F, -10F, 1, 9, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[20].setRotationPoint(280F, -41.25F, 4F);

        defaultBarrelModel[21].addShapeBox(122F, -17F, -10F, 1, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F); // Import Import
        defaultBarrelModel[21].setRotationPoint(280F, -32.25F, 4F);

        defaultBarrelModel[22].addShapeBox(122F, -17F, -10F, 1, 4, 12, 0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[22].setRotationPoint(280F, -45.25F, 4F);

        defaultBarrelModel[23].addShapeBox(122F, -17F, -10F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[23].setRotationPoint(264F, -28.25F, 7F);

        defaultBarrelModel[24].addShapeBox(122F, -17F, -10F, 4, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[24].setRotationPoint(271F, -28.25F, 7F);

        defaultBarrelModel[25].addShapeBox(122F, -17F, -10F, 5, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[25].setRotationPoint(278F, -28.25F, 7F);

        defaultBarrelModel[26].addShapeBox(122F, -17F, -10F, 5, 1, 6, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[26].setRotationPoint(278F, -46.25F, 7F);

        defaultBarrelModel[27].addShapeBox(122F, -17F, -10F, 4, 1, 6, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[27].setRotationPoint(264F, -46.25F, 7F);

        defaultBarrelModel[28].addShapeBox(122F, -17F, -10F, 4, 1, 6, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[28].setRotationPoint(271F, -46.25F, 7F);

        defaultBarrelModel[29].addShapeBox(122F, -17F, -10F, 5, 5, 18, 0F, 0.0F, 3.25F, -3.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.25F, -3.75F, 0.0F, -4.75F, -7.25F, -1.0F, -0.5F, -6.0F, -1.0F, -0.5F, -6.0F, 0.0F, -4.75F, -7.25F); // Import Import
        defaultBarrelModel[29].setRotationPoint(238F, -31.75F, 1F);

        defaultBarrelModel[30].addShapeBox(122F, -17F, -10F, 1, 10, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[30].setRotationPoint(276.5F, -41.75F, 4F);

        defaultBarrelModel[31].addShapeBox(122F, -17F, -10F, 1, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F); // Import Import
        defaultBarrelModel[31].setRotationPoint(276.5F, -32.25F, 4F);

        defaultBarrelModel[32].addShapeBox(122F, -17F, -10F, 1, 4, 12, 0F, -2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -2.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[32].setRotationPoint(276.5F, -45.25F, 4F);

        defaultBarrelModel[33].addShapeBox(122F, -17F, -10F, 15, 9, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[33].setRotationPoint(243F, -41.25F, 1F);

        defaultBarrelModel[34].addShapeBox(122F, -17F, -10F, 3, 5, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 1.0F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[34].setRotationPoint(243F, -32.25F, 1F);

        defaultBarrelModel[35].addShapeBox(122F, -17F, -10F, 12, 5, 18, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F); // Import Import
        defaultBarrelModel[35].setRotationPoint(246F, -32.25F, 1F);

        defaultBarrelModel[36].addShapeBox(122F, -17F, -10F, 1, 7, 18, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); // Import Import
        defaultBarrelModel[36].setRotationPoint(258.5F, -41.25F, 1F);

        defaultBarrelModel[37].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        defaultBarrelModel[37].setRotationPoint(249F, -50.5F, 4F);

        defaultBarrelModel[38].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        defaultBarrelModel[38].setRotationPoint(244F, -50.5F, 4F);

        defaultBarrelModel[39].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        defaultBarrelModel[39].setRotationPoint(259F, -50.5F, 4F);

        defaultBarrelModel[40].addShapeBox(122F, -17F, -10F, 2, 2, 12, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Import
        defaultBarrelModel[40].setRotationPoint(254F, -50.5F, 4F);

        defaultBarrelModel[41].addShapeBox(122F, -17F, -10F, 17, 2, 12, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F); // Import Import
        defaultBarrelModel[41].setRotationPoint(244F, -49.5F, 4F);

        defaultBarrelModel[42].addShapeBox(122F, -17F, -10F, 17, 2, 8, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Import
        defaultBarrelModel[42].setRotationPoint(244F, -47.5F, 6F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); // Import Import
        ammoModel[1] = new ModelRendererTurbo(this, 425, 393, textureX, textureY); // Import Import
        ammoModel[2] = new ModelRendererTurbo(this, 465, 393, textureX, textureY); // Import Import
        ammoModel[3] = new ModelRendererTurbo(this, 521, 393, textureX, textureY); // Import Import
        ammoModel[4] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Import Import
        ammoModel[5] = new ModelRendererTurbo(this, 193, 393, textureX, textureY); // Import Import
        ammoModel[6] = new ModelRendererTurbo(this, 609, 393, textureX, textureY); // Import Import
        ammoModel[7] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // Import Import

        ammoModel[0].addShapeBox(122F, -17F, -10F, 6, 23, 14, 0F, 1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F); // Import Import
        ammoModel[0].setRotationPoint(-51F, -11.5F, 3F);

        ammoModel[1].addShapeBox(122F, -17F, -10F, 5, 26, 14, 0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F); // Import Import
        ammoModel[1].setRotationPoint(-80F, -11.5F, 3F);

        ammoModel[2].addShapeBox(122F, -17F, -10F, 13, 25, 14, 0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F); // Import Import
        ammoModel[2].setRotationPoint(-73F, -11.5F, 3F);

        ammoModel[3].addShapeBox(122F, -17F, -10F, 4, 24, 14, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F); // Import Import
        ammoModel[3].setRotationPoint(-59F, -11.5F, 3F);

        ammoModel[4].addShapeBox(122F, -17F, -10F, 2, 26, 11, 0F, 0.75F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F); // Import Import
        ammoModel[4].setRotationPoint(-75F, -11.5F, 4.5F);

        ammoModel[5].addShapeBox(122F, -17F, -10F, 1, 25, 11, 0F, 0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F); // Import Import
        ammoModel[5].setRotationPoint(-59.75F, -11.5F, 4.5F);

        ammoModel[6].addShapeBox(122F, -17F, -10F, 2, 25, 11, 0F, 0.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.5F, -1.0F, 0.0F, 1.75F, -1.25F, 0.0F, 1.75F, -1.25F, 0.0F, -0.5F, -1.0F, 0.0F); // Import Import
        ammoModel[6].setRotationPoint(-54.25F, -11.5F, 4.5F);

        ammoModel[7].addShapeBox(122F, -17F, -10F, 36, 2, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        ammoModel[7].setRotationPoint(-80F, 14F, 2.5F);
    }

    private void initpumpModel_1() {
        pumpModel[0] = new ModelRendererTurbo(this, 641, 417, textureX, textureY); // Import Import
        pumpModel[1] = new ModelRendererTurbo(this, 833, 417, textureX, textureY); // Import Import
        pumpModel[2] = new ModelRendererTurbo(this, 209, 425, textureX, textureY); // Import Import
        pumpModel[3] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Import Import
        pumpModel[4] = new ModelRendererTurbo(this, 633, 225, textureX, textureY); // Import Import
        pumpModel[5] = new ModelRendererTurbo(this, 641, 393, textureX, textureY); // Import Import
        pumpModel[6] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Import Import
        pumpModel[7] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Import Import
        pumpModel[8] = new ModelRendererTurbo(this, 233, 297, textureX, textureY); // Import Import
        pumpModel[9] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Import Import
        pumpModel[10] = new ModelRendererTurbo(this, 633, 297, textureX, textureY); // Import Import
        pumpModel[11] = new ModelRendererTurbo(this, 761, 297, textureX, textureY); // Import Import
        pumpModel[12] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Import Import
        pumpModel[13] = new ModelRendererTurbo(this, 993, 321, textureX, textureY); // Import Import
        pumpModel[14] = new ModelRendererTurbo(this, 793, 369, textureX, textureY); // Import Import

        pumpModel[0].addShapeBox(122F, -17F, -10F, 86, 3, 9, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        pumpModel[0].setRotationPoint(-128F, -41F, 5.5F);

        pumpModel[1].addShapeBox(122F, -17F, -10F, 86, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        pumpModel[1].setRotationPoint(-128F, -38F, 5.5F);

        pumpModel[2].addShapeBox(122F, -17F, -10F, 86, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); // Import Import
        pumpModel[2].setRotationPoint(-128F, -35F, 5.5F);

        pumpModel[3].addShapeBox(122F, -17F, -10F, 5, 4, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F); // Import Import
        pumpModel[3].setRotationPoint(-123F, -35F, 1.5F);

        pumpModel[4].addShapeBox(122F, -17F, -10F, 5, 3, 4, 0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        pumpModel[4].setRotationPoint(-123F, -38F, 1.5F);

        pumpModel[5].addShapeBox(122F, -17F, -10F, 5, 5, 13, 0F, -1F, -10.5F, 0.0F, -1F, -10.5F, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 8.5F, 0.0F, -1F, 8.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        pumpModel[5].setRotationPoint(-123F, -36F, -11.5F);

        pumpModel[6].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import Import
        pumpModel[6].setRotationPoint(-122F, -25.5F, -20.25F);

        pumpModel[7].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0F, -3F); // Import Import
        pumpModel[7].setRotationPoint(-122F, -22.5F, -20.25F);

        pumpModel[8].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Import
        pumpModel[8].setRotationPoint(-122F, -28.5F, -20.25F);

        pumpModel[9].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0.0F); // Import Import
        pumpModel[9].setRotationPoint(-119F, -25.5F, -20.25F);

        pumpModel[10].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Import
        pumpModel[10].setRotationPoint(-125F, -25.5F, -20.25F);

        pumpModel[11].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0.0F, 0.0F, -3F, 0.0F, -3F, -3F, 0.0F, -3F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, 0.0F, 0.0F); // Import Import
        pumpModel[11].setRotationPoint(-119F, -28.5F, -20.25F);

        pumpModel[12].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Import
        pumpModel[12].setRotationPoint(-125F, -28.5F, -20.25F);

        pumpModel[13].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Import Import
        pumpModel[13].setRotationPoint(-119F, -22.5F, -20.25F);

        pumpModel[14].addShapeBox(122F, -17F, -10F, 3, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F); // Import Import
        pumpModel[14].setRotationPoint(-125F, -22.5F, -20.25F);
    }
}