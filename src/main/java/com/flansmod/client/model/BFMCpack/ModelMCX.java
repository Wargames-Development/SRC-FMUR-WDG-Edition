//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MCX
// Model Creator: 
// Created on: 29.10.2023 - 09:30:42
// Last changed on: 29.10.2023 - 09:30:42

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMCX extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelMCX() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[814];
        defaultBarrelModel = new ModelRendererTurbo[20];
        defaultStockModel = new ModelRendererTurbo[81];
        ammoModel = new ModelRendererTurbo[18];
        extraAmmoModel = new ModelRendererTurbo[18];
        slideModel = new ModelRendererTurbo[6];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initdefaultStockModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(186F / 16F, 52F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(152F / 16F, 51F / 16F, -7.25F / 16F);
        scopeAttachPoint = new Vector3f(20F / 16F, 66F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(112 / 16F, 43F / 16F, 0F / 16F);

        gunSlideDistance = 1.2F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, 0.0F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.63F, 0.0F);
        translateAll(-10.0F, 0.0F, 0.0F);
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = false;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        casingAttachPoint = new Vector3f(1.0F, 1.6F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);

        leftArmPos = new Vector3f(1.7F, 0.5F, -8F);
        leftArmRot = new Vector3f(-80F, -55F, 0.0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        enableNewArm = true;

        rightArmPos = new Vector3f(0.25F, -0.54F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);

        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0.0F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);

        caseScale = 0.2F;
        casingDelay = 0;
        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(2.7F, 0.7F, 0.0F);
        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0.0F);

        flipAll();

        gunOffset = -0.35F;
        zoomOffsetY = -0.05F;
        zoomOffset = 0.3F;
        gunOffsetX = -1F;
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 13
        gunModel[14] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 14
        gunModel[15] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 15
        gunModel[16] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 16
        gunModel[17] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 17
        gunModel[18] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 18
        gunModel[19] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 19
        gunModel[20] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 20
        gunModel[21] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 21
        gunModel[22] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 22
        gunModel[23] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 23
        gunModel[24] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 24
        gunModel[25] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 25
        gunModel[26] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 26
        gunModel[27] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 27
        gunModel[28] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 28
        gunModel[29] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 29
        gunModel[30] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 30
        gunModel[31] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 31
        gunModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
        gunModel[33] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 34
        gunModel[34] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 35
        gunModel[35] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 36
        gunModel[36] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 37
        gunModel[37] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 38
        gunModel[38] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 39
        gunModel[39] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 40
        gunModel[40] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 41
        gunModel[41] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 43
        gunModel[42] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 44
        gunModel[43] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 45
        gunModel[44] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 44
        gunModel[45] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 45
        gunModel[46] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 46
        gunModel[47] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 47
        gunModel[48] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 48
        gunModel[49] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 49
        gunModel[50] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 50
        gunModel[51] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 51
        gunModel[52] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 52
        gunModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
        gunModel[54] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 56
        gunModel[55] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 57
        gunModel[56] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 58
        gunModel[57] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 59
        gunModel[58] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 60
        gunModel[59] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 62
        gunModel[60] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 64
        gunModel[61] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 66
        gunModel[62] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 67
        gunModel[63] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 68
        gunModel[64] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 64
        gunModel[65] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 65
        gunModel[66] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 66
        gunModel[67] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 67
        gunModel[68] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 68
        gunModel[69] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 69
        gunModel[70] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 70
        gunModel[71] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 71
        gunModel[72] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 72
        gunModel[73] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 496
        gunModel[74] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 79
        gunModel[75] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 80
        gunModel[76] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 81
        gunModel[77] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 82
        gunModel[78] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 83
        gunModel[79] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 84
        gunModel[80] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 85
        gunModel[81] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 86
        gunModel[82] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 87
        gunModel[83] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 88
        gunModel[84] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 89
        gunModel[85] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 90
        gunModel[86] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 91
        gunModel[87] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 92
        gunModel[88] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 93
        gunModel[89] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 94
        gunModel[90] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 109
        gunModel[91] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 110
        gunModel[92] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 111
        gunModel[93] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 112
        gunModel[94] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 115
        gunModel[95] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 116
        gunModel[96] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 117
        gunModel[97] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 118
        gunModel[98] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 121
        gunModel[99] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 122
        gunModel[100] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 123
        gunModel[101] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 124
        gunModel[102] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 125
        gunModel[103] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 126
        gunModel[104] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 127
        gunModel[105] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 128
        gunModel[106] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 130
        gunModel[107] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 131
        gunModel[108] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 132
        gunModel[109] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 133
        gunModel[110] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 134
        gunModel[111] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 135
        gunModel[112] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 136
        gunModel[113] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 137
        gunModel[114] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 138
        gunModel[115] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 139
        gunModel[116] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 140
        gunModel[117] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 141
        gunModel[118] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 142
        gunModel[119] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 143
        gunModel[120] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 144
        gunModel[121] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 145
        gunModel[122] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 146
        gunModel[123] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 147
        gunModel[124] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 148
        gunModel[125] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 149
        gunModel[126] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 150
        gunModel[127] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 151
        gunModel[128] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 152
        gunModel[129] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 153
        gunModel[130] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 154
        gunModel[131] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 155
        gunModel[132] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 156
        gunModel[133] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 157
        gunModel[134] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 158
        gunModel[135] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 159
        gunModel[136] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 163
        gunModel[137] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 164
        gunModel[138] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 165
        gunModel[139] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 166
        gunModel[140] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 167
        gunModel[141] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 168
        gunModel[142] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 169
        gunModel[143] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 170
        gunModel[144] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 171
        gunModel[145] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 172
        gunModel[146] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 173
        gunModel[147] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 174
        gunModel[148] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 175
        gunModel[149] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 176
        gunModel[150] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 177
        gunModel[151] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 178
        gunModel[152] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 179
        gunModel[153] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 180
        gunModel[154] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 181
        gunModel[155] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 182
        gunModel[156] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 183
        gunModel[157] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 184
        gunModel[158] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 185
        gunModel[159] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 186
        gunModel[160] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 187
        gunModel[161] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 188
        gunModel[162] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 189
        gunModel[163] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 190
        gunModel[164] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 191
        gunModel[165] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 192
        gunModel[166] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 193
        gunModel[167] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 194
        gunModel[168] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 195
        gunModel[169] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 196
        gunModel[170] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 197
        gunModel[171] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 200
        gunModel[172] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 201
        gunModel[173] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 202
        gunModel[174] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 203
        gunModel[175] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 204
        gunModel[176] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 208
        gunModel[177] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 210
        gunModel[178] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 211
        gunModel[179] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 220
        gunModel[180] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 221
        gunModel[181] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 223
        gunModel[182] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 224
        gunModel[183] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 225
        gunModel[184] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 226
        gunModel[185] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 227
        gunModel[186] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 228
        gunModel[187] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 229
        gunModel[188] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 230
        gunModel[189] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 231
        gunModel[190] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 232
        gunModel[191] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 233
        gunModel[192] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 234
        gunModel[193] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 235
        gunModel[194] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 236
        gunModel[195] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 237
        gunModel[196] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 243
        gunModel[197] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 244
        gunModel[198] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 245
        gunModel[199] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 246
        gunModel[200] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 248
        gunModel[201] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 249
        gunModel[202] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 250
        gunModel[203] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 251
        gunModel[204] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 252
        gunModel[205] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 253
        gunModel[206] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Box 256
        gunModel[207] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 257
        gunModel[208] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 258
        gunModel[209] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 259
        gunModel[210] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 260
        gunModel[211] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 261
        gunModel[212] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 262
        gunModel[213] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 263
        gunModel[214] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 264
        gunModel[215] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 265
        gunModel[216] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 266
        gunModel[217] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 267
        gunModel[218] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 268
        gunModel[219] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 269
        gunModel[220] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 271
        gunModel[221] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 272
        gunModel[222] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 273
        gunModel[223] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 274
        gunModel[224] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 275
        gunModel[225] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 276
        gunModel[226] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 280
        gunModel[227] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 281
        gunModel[228] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 282
        gunModel[229] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 229
        gunModel[230] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 230
        gunModel[231] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 231
        gunModel[232] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 232
        gunModel[233] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 233
        gunModel[234] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 234
        gunModel[235] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 235
        gunModel[236] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 236
        gunModel[237] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 237
        gunModel[238] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 238
        gunModel[239] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 239
        gunModel[240] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 240
        gunModel[241] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 241
        gunModel[242] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 242
        gunModel[243] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 243
        gunModel[244] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 244
        gunModel[245] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 245
        gunModel[246] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 246
        gunModel[247] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 247
        gunModel[248] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 248
        gunModel[249] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 249
        gunModel[250] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 250
        gunModel[251] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 251
        gunModel[252] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 252
        gunModel[253] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 253
        gunModel[254] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 254
        gunModel[255] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 255
        gunModel[256] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 256
        gunModel[257] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 257
        gunModel[258] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 258
        gunModel[259] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 259
        gunModel[260] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 260
        gunModel[261] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 261
        gunModel[262] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 262
        gunModel[263] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 263
        gunModel[264] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 264
        gunModel[265] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 265
        gunModel[266] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 266
        gunModel[267] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 267
        gunModel[268] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 268
        gunModel[269] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 269
        gunModel[270] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 270
        gunModel[271] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 271
        gunModel[272] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 272
        gunModel[273] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 273
        gunModel[274] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 274
        gunModel[275] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 275
        gunModel[276] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 276
        gunModel[277] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 277
        gunModel[278] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 278
        gunModel[279] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 282
        gunModel[280] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 283
        gunModel[281] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 284
        gunModel[282] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 285
        gunModel[283] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 286
        gunModel[284] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 288
        gunModel[285] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 289
        gunModel[286] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 290
        gunModel[287] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 291
        gunModel[288] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 292
        gunModel[289] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 293
        gunModel[290] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 294
        gunModel[291] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 295
        gunModel[292] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 296
        gunModel[293] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 297
        gunModel[294] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 298
        gunModel[295] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 299
        gunModel[296] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 300
        gunModel[297] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 301
        gunModel[298] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 302
        gunModel[299] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 303
        gunModel[300] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 304
        gunModel[301] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 305
        gunModel[302] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 306
        gunModel[303] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 307
        gunModel[304] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 308
        gunModel[305] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 309
        gunModel[306] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 310
        gunModel[307] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 311
        gunModel[308] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 312
        gunModel[309] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 313
        gunModel[310] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 314
        gunModel[311] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 316
        gunModel[312] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 317
        gunModel[313] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 318
        gunModel[314] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 319
        gunModel[315] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 320
        gunModel[316] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 321
        gunModel[317] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 322
        gunModel[318] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 323
        gunModel[319] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 324
        gunModel[320] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 325
        gunModel[321] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 326
        gunModel[322] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 327
        gunModel[323] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 328
        gunModel[324] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 329
        gunModel[325] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 330
        gunModel[326] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 331
        gunModel[327] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 332
        gunModel[328] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 333
        gunModel[329] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 334
        gunModel[330] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 335
        gunModel[331] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 336
        gunModel[332] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 337
        gunModel[333] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 338
        gunModel[334] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 339
        gunModel[335] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 340
        gunModel[336] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 341
        gunModel[337] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 342
        gunModel[338] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 343
        gunModel[339] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 344
        gunModel[340] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 345
        gunModel[341] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 346
        gunModel[342] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 347
        gunModel[343] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 348
        gunModel[344] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 349
        gunModel[345] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 350
        gunModel[346] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 351
        gunModel[347] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 352
        gunModel[348] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 353
        gunModel[349] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 354
        gunModel[350] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 355
        gunModel[351] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 356
        gunModel[352] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 357
        gunModel[353] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 358
        gunModel[354] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 359
        gunModel[355] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 360
        gunModel[356] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 361
        gunModel[357] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 362
        gunModel[358] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 363
        gunModel[359] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 364
        gunModel[360] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 365
        gunModel[361] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 366
        gunModel[362] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 367
        gunModel[363] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 368
        gunModel[364] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 369
        gunModel[365] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 370
        gunModel[366] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 371
        gunModel[367] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 372
        gunModel[368] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 168
        gunModel[369] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 169
        gunModel[370] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 170
        gunModel[371] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 171
        gunModel[372] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 389
        gunModel[373] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 390
        gunModel[374] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 391
        gunModel[375] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 392
        gunModel[376] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 393
        gunModel[377] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 394
        gunModel[378] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 395
        gunModel[379] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 396
        gunModel[380] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 398
        gunModel[381] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 399
        gunModel[382] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 400
        gunModel[383] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 401
        gunModel[384] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 402
        gunModel[385] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 403
        gunModel[386] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 404
        gunModel[387] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 405
        gunModel[388] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 406
        gunModel[389] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 407
        gunModel[390] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 408
        gunModel[391] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 409
        gunModel[392] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 410
        gunModel[393] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 411
        gunModel[394] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 412
        gunModel[395] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 413
        gunModel[396] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 414
        gunModel[397] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 415
        gunModel[398] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 416
        gunModel[399] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 417
        gunModel[400] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 418
        gunModel[401] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 419
        gunModel[402] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 420
        gunModel[403] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 421
        gunModel[404] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 422
        gunModel[405] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 423
        gunModel[406] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 424
        gunModel[407] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box 425
        gunModel[408] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 426
        gunModel[409] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 427
        gunModel[410] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 428
        gunModel[411] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 429
        gunModel[412] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 498
        gunModel[413] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 499
        gunModel[414] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 500
        gunModel[415] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 501
        gunModel[416] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 502
        gunModel[417] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 503
        gunModel[418] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 504
        gunModel[419] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 505
        gunModel[420] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 506
        gunModel[421] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 507
        gunModel[422] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 508
        gunModel[423] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 509
        gunModel[424] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 510
        gunModel[425] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 511
        gunModel[426] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 512
        gunModel[427] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 513
        gunModel[428] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 514
        gunModel[429] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Box 515
        gunModel[430] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 516
        gunModel[431] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 517
        gunModel[432] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 518
        gunModel[433] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 519
        gunModel[434] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Box 520
        gunModel[435] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 521
        gunModel[436] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 522
        gunModel[437] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 523
        gunModel[438] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 524
        gunModel[439] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 525
        gunModel[440] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 526
        gunModel[441] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 527
        gunModel[442] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 528
        gunModel[443] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 529
        gunModel[444] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 530
        gunModel[445] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 531
        gunModel[446] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 532
        gunModel[447] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 533
        gunModel[448] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 534
        gunModel[449] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 535
        gunModel[450] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 536
        gunModel[451] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 537
        gunModel[452] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 538
        gunModel[453] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 539
        gunModel[454] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Box 540
        gunModel[455] = new ModelRendererTurbo(this, 761, 137, textureX, textureY); // Box 541
        gunModel[456] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 542
        gunModel[457] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 543
        gunModel[458] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 544
        gunModel[459] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 545
        gunModel[460] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 546
        gunModel[461] = new ModelRendererTurbo(this, 593, 177, textureX, textureY); // Box 547
        gunModel[462] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 548
        gunModel[463] = new ModelRendererTurbo(this, 761, 177, textureX, textureY); // Box 549
        gunModel[464] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 550
        gunModel[465] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 551
        gunModel[466] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 552
        gunModel[467] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 553
        gunModel[468] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 554
        gunModel[469] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 555
        gunModel[470] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 556
        gunModel[471] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 557
        gunModel[472] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 558
        gunModel[473] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 559
        gunModel[474] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 560
        gunModel[475] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 561
        gunModel[476] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 562
        gunModel[477] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 563
        gunModel[478] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 564
        gunModel[479] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 569
        gunModel[480] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 570
        gunModel[481] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 571
        gunModel[482] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 572
        gunModel[483] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 573
        gunModel[484] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 574
        gunModel[485] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 575
        gunModel[486] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 576
        gunModel[487] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 577
        gunModel[488] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 588
        gunModel[489] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 589
        gunModel[490] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 590
        gunModel[491] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 591
        gunModel[492] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 592
        gunModel[493] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 593
        gunModel[494] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 594
        gunModel[495] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 595
        gunModel[496] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 596
        gunModel[497] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 597
        gunModel[498] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 598
        gunModel[499] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 599

        gunModel[0].addShapeBox(0F, 0F, 0F, 124, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 0
        gunModel[0].setRotationPoint(2F, -66F, -4F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gunModel[1].setRotationPoint(-2F, -67F, -4F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        gunModel[2].setRotationPoint(4F, -67F, -4F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[3].setRotationPoint(8F, -67F, -4F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(12F, -67F, -4F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        gunModel[5].setRotationPoint(16F, -67F, -4F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
        gunModel[6].setRotationPoint(20F, -67F, -4F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        gunModel[7].setRotationPoint(24F, -67F, -4F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        gunModel[8].setRotationPoint(28F, -67F, -4F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        gunModel[9].setRotationPoint(32F, -67F, -4F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        gunModel[10].setRotationPoint(36F, -67F, -4F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        gunModel[11].setRotationPoint(40F, -67F, -4F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        gunModel[12].setRotationPoint(44F, -67F, -4F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        gunModel[13].setRotationPoint(48F, -67F, -4F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        gunModel[14].setRotationPoint(52F, -67F, -4F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        gunModel[15].setRotationPoint(56F, -67F, -4F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        gunModel[16].setRotationPoint(60F, -67F, -4F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        gunModel[17].setRotationPoint(64F, -67F, -4F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        gunModel[18].setRotationPoint(68F, -67F, -4F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        gunModel[19].setRotationPoint(72F, -67F, -4F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
        gunModel[20].setRotationPoint(76F, -67F, -4F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
        gunModel[21].setRotationPoint(80F, -67F, -4F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        gunModel[22].setRotationPoint(84F, -67F, -4F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
        gunModel[23].setRotationPoint(88F, -67F, -4F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        gunModel[24].setRotationPoint(92F, -67F, -4F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        gunModel[25].setRotationPoint(96F, -67F, -4F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        gunModel[26].setRotationPoint(100F, -67F, -4F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        gunModel[27].setRotationPoint(104F, -67F, -4F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        gunModel[28].setRotationPoint(108F, -67F, -4F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        gunModel[29].setRotationPoint(112F, -67F, -4F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        gunModel[30].setRotationPoint(116F, -67F, -4F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        gunModel[31].setRotationPoint(120F, -67F, -4F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        gunModel[32].setRotationPoint(124F, -67F, -4F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
        gunModel[33].setRotationPoint(-2F, -66F, -4F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 86, 1, 6, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 35
        gunModel[34].setRotationPoint(2F, -64F, -3F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 86, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 36
        gunModel[35].setRotationPoint(2F, -63F, -3F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 37
        gunModel[36].setRotationPoint(-7F, -63F, -3.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38
        gunModel[37].setRotationPoint(-7F, -62F, -4F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 1F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0F, -0.5F, 1F); // Box 39
        gunModel[38].setRotationPoint(4.5F, -63F, -3F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, -3.5F, -0.5F, 0F, 3.75F, 0F, -0.75F, 3.75F, 0F, -0.75F, -3.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F); // Box 40
        gunModel[39].setRotationPoint(1F, -62F, -4F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
        gunModel[40].setRotationPoint(-7F, -58F, -4F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 43
        gunModel[41].setRotationPoint(-7F, -57F, -3.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F); // Box 44
        gunModel[42].setRotationPoint(1F, -58F, -4F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0.25F); // Box 45
        gunModel[43].setRotationPoint(1F, -57F, -3.5F);

        gunModel[44].addShapeBox(-32F, 0F, 0F, 33, 4, 6, 0F, -3.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 44
        gunModel[44].setRotationPoint(34F, -62F, -3F);

        gunModel[45].addShapeBox(-32F, 0F, 0F, 33, 1, 6, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 45
        gunModel[45].setRotationPoint(34F, -58F, -3F);

        gunModel[46].addShapeBox(-32F, 0F, 0F, 32, 1, 6, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F); // Box 46
        gunModel[46].setRotationPoint(34F, -57F, -3F);

        gunModel[47].addShapeBox(-32F, 0F, 0F, 39, 5, 6, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 47
        gunModel[47].setRotationPoint(67F, -62F, -3F);

        gunModel[48].addShapeBox(-32F, 0F, 0F, 12, 2, 6, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 48
        gunModel[48].setRotationPoint(106F, -62F, -3F);

        gunModel[49].addShapeBox(-32F, 0F, 0F, 12, 3, 6, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 49
        gunModel[49].setRotationPoint(106F, -60F, -3F);

        gunModel[50].addShapeBox(-32F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 2.5F, -0.25F, -0.25F); // Box 50
        gunModel[50].setRotationPoint(106F, -61.5F, -4F);

        gunModel[51].addShapeBox(-32F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 51
        gunModel[51].setRotationPoint(106F, -62.5F, -4F);

        gunModel[52].addShapeBox(-32F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 52
        gunModel[52].setRotationPoint(104F, -57.75F, -4F);

        gunModel[53].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 55
        gunModel[53].setRotationPoint(105F, -62.5F, -4F);

        gunModel[54].addShapeBox(-32F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 56
        gunModel[54].setRotationPoint(106F, -62.5F, 3F);

        gunModel[55].addShapeBox(-32F, 0F, 0F, 12, 4, 1, 0F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 57
        gunModel[55].setRotationPoint(106F, -61.5F, 3F);

        gunModel[56].addShapeBox(-32F, 0F, 0F, 14, 1, 1, 0F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 58
        gunModel[56].setRotationPoint(104F, -57.75F, 3F);

        gunModel[57].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
        gunModel[57].setRotationPoint(105F, -62.5F, 3F);

        gunModel[58].addShapeBox(-32F, 0F, 0F, 10, 3, 1, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0F, 1F, 0.25F, 0F); // Box 60
        gunModel[58].setRotationPoint(108F, -61F, -5F);

        gunModel[59].addShapeBox(-32F, 0F, 0F, 10, 3, 1, 0F, 1F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 62
        gunModel[59].setRotationPoint(108F, -61F, 4F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 41, 4, 7, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, 2.75F, 0F, -0.25F, 2.75F, 0F, -0.25F, 2.75F); // Box 64
        gunModel[60].setRotationPoint(-7F, -56F, -3.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 33, 8, 13, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 66
        gunModel[61].setRotationPoint(1F, -52F, -6.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 8, 3, 13, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 67
        gunModel[62].setRotationPoint(-7F, -52F, -6.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 34, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        gunModel[63].setRotationPoint(34F, -50F, -6.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.25F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        gunModel[64].setRotationPoint(35F, -52F, -6.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        gunModel[65].setRotationPoint(34F, -52F, -6.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -2.75F, 0F, 0.5F, -2.75F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
        gunModel[66].setRotationPoint(34F, -56F, -6.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 67
        gunModel[67].setRotationPoint(34F, -57F, -3.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 68
        gunModel[68].setRotationPoint(35F, -57F, -3.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -2.75F, 0F, 0.5F, -2.75F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 69
        gunModel[69].setRotationPoint(67F, -56F, -6.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 70
        gunModel[70].setRotationPoint(67F, -57F, -3.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        gunModel[71].setRotationPoint(67F, -52F, -6.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        gunModel[72].setRotationPoint(65F, -52F, -6.5F);

        gunModel[73].addShapeBox(-0.5F, 0F, 0F, 7, 7, 4, 0F, -1F, -1F, 0F, -3F, -1F, 0F, 1.5F, 1F, 0F, -0.75F, 1.25F, 0F, -1F, -0.5F, 0F, -3F, -0.5F, 0F, 0.75F, 1.25F, -0.75F, -0.75F, 1.25F, -0.75F); // Box 496
        gunModel[73].setRotationPoint(27F, -60F, -6F);
        gunModel[73].rotateAngleX = -0.38397244F;

        gunModel[74].addShapeBox(-15F, -1F, -3F, 24, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        gunModel[74].setRotationPoint(24F, -51.75F, -6F);
        gunModel[74].rotateAngleY = 0.31415927F;

        gunModel[75].addShapeBox(-15F, -3F, -3F, 24, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        gunModel[75].setRotationPoint(24F, -51.75F, -6F);
        gunModel[75].rotateAngleY = 0.31415927F;

        gunModel[76].addShapeBox(-15F, 1F, -3F, 24, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 81
        gunModel[76].setRotationPoint(24F, -51.75F, -6F);
        gunModel[76].rotateAngleY = 0.31415927F;

        gunModel[77].addShapeBox(-10F, -1F, -3.5F, 5, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        gunModel[77].setRotationPoint(24F, -51.75F, -6F);
        gunModel[77].rotateAngleY = 0.31415927F;

        gunModel[78].addShapeBox(-10F, -3F, -3.5F, 5, 2, 7, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[78].setRotationPoint(24F, -51.75F, -6F);
        gunModel[78].rotateAngleY = 0.31415927F;

        gunModel[79].addShapeBox(-10F, 1F, -3.5F, 5, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F); // Box 84
        gunModel[79].setRotationPoint(24F, -51.75F, -6F);
        gunModel[79].rotateAngleY = 0.31415927F;

        gunModel[80].addShapeBox(-16F, -3F, -3.5F, 2, 2, 7, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        gunModel[80].setRotationPoint(24F, -51.75F, -6F);
        gunModel[80].rotateAngleY = 0.31415927F;

        gunModel[81].addShapeBox(-16F, -1F, -3.5F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        gunModel[81].setRotationPoint(24F, -51.75F, -6F);
        gunModel[81].rotateAngleY = 0.31415927F;

        gunModel[82].addShapeBox(-16F, 1F, -3.5F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F); // Box 87
        gunModel[82].setRotationPoint(24F, -51.75F, -6F);
        gunModel[82].rotateAngleY = 0.31415927F;

        gunModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 88
        gunModel[83].setRotationPoint(32F, -51F, -7F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 89
        gunModel[84].setRotationPoint(34.5F, -50F, -7F);

        gunModel[85].addShapeBox(0F, -0.5F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 90
        gunModel[85].setRotationPoint(34.5F, -50F, -7F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 91
        gunModel[86].setRotationPoint(55.5F, -50F, -7F);

        gunModel[87].addShapeBox(0F, -0.5F, 0F, 12, 1, 1, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F); // Box 92
        gunModel[87].setRotationPoint(55.5F, -50F, -7F);

        gunModel[88].addShapeBox(0F, -0.5F, 0F, 35, 1, 1, 0F, 0F, -0.25F, -0.6F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 93
        gunModel[88].setRotationPoint(33.5F, -50F, -7.15F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.6F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 94
        gunModel[89].setRotationPoint(33.5F, -50F, -7.15F);

        gunModel[90].addShapeBox(-16.5F, -0.18F, -0.5F, 30, 7, 1, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 109
        gunModel[90].setRotationPoint(52.5F, -49.5F, -6.5F);
        gunModel[90].rotateAngleX = -0.19198622F;

        gunModel[91].addShapeBox(-15F, -0.18F, -0.5F, 2, 4, 1, 0F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, 0.75F, -0.15F, -0.5F, 0.75F, -0.15F, -0.5F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F); // Box 110
        gunModel[91].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[91].rotateAngleX = -0.19198622F;

        gunModel[92].addShapeBox(-7.5F, 3.82F, -0.5F, 2, 2, 1, 0F, -0.25F, -0.75F, -0.15F, -0.5F, -0.75F, -0.15F, -0.5F, -0.75F, -0.15F, -0.25F, -0.75F, -0.15F, -0.25F, 0.25F, -0.15F, 0.5F, 0.25F, -0.15F, 0.5F, 0.25F, -0.15F, -0.25F, 0.25F, -0.15F); // Box 111
        gunModel[92].setRotationPoint(42F, -49.5F, -6.5F);
        gunModel[92].rotateAngleX = -0.19198622F;

        gunModel[93].addShapeBox(-15F, 5.82F, -0.5F, 33, 2, 1, 0F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -1.25F, -0.35F, -0.15F, -1.25F, -0.35F, -0.15F, -1.25F, -0.35F, -0.15F, -1.25F, -0.35F, -0.15F); // Box 112
        gunModel[93].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[93].rotateAngleX = -0.19198622F;

        gunModel[94].addShapeBox(23.5F, 3.82F, -0.5F, 2, 2, 1, 0F, -0.5F, -0.75F, -0.15F, -0.25F, -0.75F, -0.15F, -0.25F, -0.75F, -0.15F, -0.5F, -0.75F, -0.15F, 0.5F, 0.25F, -0.15F, -0.25F, 0.25F, -0.15F, -0.25F, 0.25F, -0.15F, 0.5F, 0.25F, -0.15F); // Box 115
        gunModel[94].setRotationPoint(42F, -49.5F, -6.5F);
        gunModel[94].rotateAngleX = -0.19198622F;

        gunModel[95].addShapeBox(16F, -0.18F, -0.5F, 2, 4, 1, 0F, -0.5F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F, -0.5F, 0.75F, -0.15F); // Box 116
        gunModel[95].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[95].rotateAngleX = -0.19198622F;

        gunModel[96].addShapeBox(6F, 3.82F, -0.5F, 6, 2, 1, 0F, 0.25F, -0.75F, -0.15F, 0.25F, -0.75F, -0.15F, 0.25F, -0.75F, -0.15F, 0.25F, -0.75F, -0.15F, 1.25F, 0.25F, -0.15F, 1.25F, 0.25F, -0.15F, 1.25F, 0.25F, -0.15F, 1.25F, 0.25F, -0.15F); // Box 117
        gunModel[96].setRotationPoint(42F, -49.5F, -6.5F);
        gunModel[96].rotateAngleX = -0.19198622F;

        gunModel[97].addShapeBox(-1.5F, -0.18F, -0.5F, 6, 4, 1, 0F, 0.25F, -0.5F, -0.15F, 0.25F, -0.5F, -0.15F, 0.25F, -0.5F, -0.15F, 0.25F, -0.5F, -0.15F, 0.25F, 0.75F, -0.15F, 0.25F, 0.75F, -0.15F, 0.25F, 0.75F, -0.15F, 0.25F, 0.75F, -0.15F); // Box 118
        gunModel[97].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[97].rotateAngleX = -0.19198622F;

        gunModel[98].addShapeBox(-12.5F, -0.18F, -0.5F, 10, 4, 1, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F, 0F, 0.75F, -0.15F); // Box 121
        gunModel[98].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[98].rotateAngleX = -0.19198622F;

        gunModel[99].addShapeBox(-12.5F, 3.82F, -0.5F, 10, 1, 1, 0F, 0F, -0.75F, -0.15F, -0.25F, -0.75F, -0.15F, -0.25F, -0.75F, -0.15F, 0F, -0.75F, -0.15F, -0.75F, 0.75F, -0.15F, -1F, 0.75F, -0.15F, -1F, 0.75F, -0.15F, -0.75F, 0.75F, -0.15F); // Box 122
        gunModel[99].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[99].rotateAngleX = -0.19198622F;

        gunModel[100].addShapeBox(5.5F, -0.18F, -0.5F, 10, 4, 1, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, 0.75F, -0.15F, 0F, 0.75F, -0.15F, 0F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F); // Box 123
        gunModel[100].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[100].rotateAngleX = -0.19198622F;

        gunModel[101].addShapeBox(5.5F, 3.82F, -0.5F, 10, 1, 1, 0F, -0.25F, -0.75F, -0.15F, 0F, -0.75F, -0.15F, 0F, -0.75F, -0.15F, -0.25F, -0.75F, -0.15F, -1F, 0.75F, -0.15F, -0.75F, 0.75F, -0.15F, -0.75F, 0.75F, -0.15F, -1F, 0.75F, -0.15F); // Box 124
        gunModel[101].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[101].rotateAngleX = -0.19198622F;

        gunModel[102].addShapeBox(0F, 1.32F, -2.3F, 3, 5, 2, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 125
        gunModel[102].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[102].rotateAngleX = -0.19198622F;

        gunModel[103].addShapeBox(1F, 6.32F, -1.3F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 126
        gunModel[103].setRotationPoint(49.5F, -49.5F, -6.5F);
        gunModel[103].rotateAngleX = -0.19198622F;

        gunModel[104].addShapeBox(0F, 0F, 0F, 34, 8, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 127
        gunModel[104].setRotationPoint(34F, -52F, 5.5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 6, 7, 13, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
        gunModel[105].setRotationPoint(68F, -51F, -6.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 130
        gunModel[106].setRotationPoint(68F, -53F, -6.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 131
        gunModel[107].setRotationPoint(74F, -54F, -5.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 132
        gunModel[108].setRotationPoint(68F, -54F, -5.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 18, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 133
        gunModel[109].setRotationPoint(68F, -56F, -5F);

        gunModel[110].addShapeBox(0F, 0F, 2F, 18, 1, 7, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
        gunModel[110].setRotationPoint(68F, -57F, -5.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 12, 7, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 135
        gunModel[111].setRotationPoint(74F, -51F, -5.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 13, 2, 11, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 136
        gunModel[112].setRotationPoint(74.75F, -48.5F, -5.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 137
        gunModel[113].setRotationPoint(74.75F, -46.5F, -5.5F);

        gunModel[114].addShapeBox(-1F, 0F, 0F, 12, 1, 11, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 138
        gunModel[114].setRotationPoint(76.75F, -45.5F, -5.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        gunModel[115].setRotationPoint(75.75F, -47F, -5.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        gunModel[116].setRotationPoint(75.75F, -48F, -5.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 141
        gunModel[117].setRotationPoint(75.75F, -46F, -5.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 142
        gunModel[118].setRotationPoint(80.75F, -46F, -5.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        gunModel[119].setRotationPoint(80.75F, -47F, -5.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        gunModel[120].setRotationPoint(80.75F, -48F, -5.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Box 145
        gunModel[121].setRotationPoint(74F, -44F, -5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.5F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 146
        gunModel[122].setRotationPoint(73F, -44F, -6.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 147
        gunModel[123].setRotationPoint(69F, -42F, -6.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 148
        gunModel[124].setRotationPoint(69F, -43F, -6.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 149
        gunModel[125].setRotationPoint(69F, -41F, -6.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0.5F, -0.75F); // Box 150
        gunModel[126].setRotationPoint(78F, -44F, -5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 151
        gunModel[127].setRotationPoint(73F, -43F, -6.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 152
        gunModel[128].setRotationPoint(73F, -42F, -3F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 153
        gunModel[129].setRotationPoint(73F, -42F, 1F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, -0.25F, 0F, 0.75F, -0.25F); // Box 154
        gunModel[130].setRotationPoint(74F, -43F, -3F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -0.25F, 0.5F, -1.75F, -0.25F, 0.5F, -1.75F, 0F, 0F, 0.75F, 0F); // Box 155
        gunModel[131].setRotationPoint(74F, -43F, 1F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F); // Box 156
        gunModel[132].setRotationPoint(71F, -44F, -3F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F); // Box 157
        gunModel[133].setRotationPoint(71F, -44F, 1F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 158
        gunModel[134].setRotationPoint(69F, -44F, -3F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 159
        gunModel[135].setRotationPoint(69F, -44F, 1F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 163
        gunModel[136].setRotationPoint(68F, -44F, -5.5F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 164
        gunModel[137].setRotationPoint(68F, -41F, -5.5F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 165
        gunModel[138].setRotationPoint(68F, -40F, -5.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 2, 14, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 166
        gunModel[139].setRotationPoint(66F, -44F, -4.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 28, 22, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -7F, -0.25F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 167
        gunModel[140].setRotationPoint(38F, -44F, -6.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 28, 12, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -0.25F, 0F, 0F, -0.25F); // Box 168
        gunModel[141].setRotationPoint(38F, -35F, 4.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 2, 5, 13, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 169
        gunModel[142].setRotationPoint(66F, -44F, -6.5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[143].setRotationPoint(66F, -37F, -6.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
        gunModel[144].setRotationPoint(66F, -39F, -6.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.25F); // Box 172
        gunModel[145].setRotationPoint(66F, -39F, 4.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.25F); // Box 173
        gunModel[146].setRotationPoint(66F, -37F, 4.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 174
        gunModel[147].setRotationPoint(68F, -39F, -6F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F, 0F, 0F, 0.25F, 0F, 7F, 0.25F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -7F, 0.25F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 175
        gunModel[148].setRotationPoint(38F, -22F, -6.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0.25F, 0.75F, 0.75F, -2F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.75F, -0.75F, -2F, 0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 176
        gunModel[149].setRotationPoint(66F, -29F, -6.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, -2F, 0F, 0F, 0.25F); // Box 177
        gunModel[150].setRotationPoint(66F, -29F, 4.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0.25F, 0F, 0F, 0.25F); // Box 178
        gunModel[151].setRotationPoint(38F, -22F, 4.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0.25F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.75F, -0.25F, 0F); // Box 179
        gunModel[152].setRotationPoint(66F, -29F, -4.5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 5, 13, 13, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 180
        gunModel[153].setRotationPoint(33F, -44F, -6.5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3.75F, 0F, -0.25F); // Box 181
        gunModel[154].setRotationPoint(33F, -31F, -6.5F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -1F); // Box 182
        gunModel[155].setRotationPoint(37F, -30F, -6.5F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 183
        gunModel[156].setRotationPoint(37F, -29F, -5.5F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 184
        gunModel[157].setRotationPoint(37F, -29F, -6.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -1F); // Box 185
        gunModel[158].setRotationPoint(37F, -29F, 5.5F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, -1F); // Box 186
        gunModel[159].setRotationPoint(37F, -22F, 5.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 187
        gunModel[160].setRotationPoint(37F, -22F, -6.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 188
        gunModel[161].setRotationPoint(37F, -22F, -5.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 7F, -0.25F, 0F, 7F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -7F, 0.25F, 0F, -7F, -0.75F, 0F, 0F, -0.75F); // Box 189
        gunModel[162].setRotationPoint(38F, -23F, -6.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 7F, -0.75F, 0F, 7F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -7F, -0.75F, 0F, -7F, 0.25F, 0F, 0F, 0.25F); // Box 190
        gunModel[163].setRotationPoint(38F, -23F, 5.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -2F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.75F, -0.75F, -2F, 0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 191
        gunModel[164].setRotationPoint(66F, -30F, -6.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, -2F, 0F, 0F, 0.25F); // Box 192
        gunModel[165].setRotationPoint(66F, -30F, 4.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.75F, -0.25F, 0F); // Box 193
        gunModel[166].setRotationPoint(66F, -30F, -4.5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 194
        gunModel[167].setRotationPoint(37F, -23F, -6.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, -1F); // Box 195
        gunModel[168].setRotationPoint(37F, -23F, 5.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 196
        gunModel[169].setRotationPoint(37F, -23F, -5.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 25, 13, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
        gunModel[170].setRotationPoint(8F, -44F, -4.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 11, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        gunModel[171].setRotationPoint(-3F, -44F, -4.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 201
        gunModel[172].setRotationPoint(-3F, -38F, -4.5F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 202
        gunModel[173].setRotationPoint(2F, -35F, -4.5F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F, -1F, 0F, 0.25F, -1F, -3F, 0.25F, -1F, -3F, 0.25F, -1F, 0F, 0.25F, -1F, -1F, -1.25F, -4F, 0F, -1.25F, -4F, 0F, -1.25F, -1F, -1F, -1.25F); // Box 203
        gunModel[174].setRotationPoint(-4F, -38F, -4.5F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 3F, 0F, -1.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 3F, 0F, -1.25F, 0F, 1.75F, -1.25F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, 0F, 1.75F, -1.25F); // Box 204
        gunModel[175].setRotationPoint(2F, -35F, -4.5F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0F, 2.25F, -1.25F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, 0F, 2.25F, -1.25F, 0F, -2F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, -1.25F); // Box 208
        gunModel[176].setRotationPoint(2F, -29F, -4.5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 12, 6, 9, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 210
        gunModel[177].setRotationPoint(5F, -31F, -4.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -7F, 0F, 0.25F); // Box 211
        gunModel[178].setRotationPoint(5F, -25F, -4.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 3, 24, 9, 0F, 0F, 4F, -1.25F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, 0F, 4F, -1.25F, 12.5F, -1F, -1.25F, -12.5F, 0F, 0.25F, -12.5F, 0F, 0.25F, 12.5F, -1F, -1.25F); // Box 220
        gunModel[179].setRotationPoint(2F, -23F, -4.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 221
        gunModel[180].setRotationPoint(12F, -21F, -4.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 7, 24, 9, 0F, 0F, 0F, 0.25F, 0F, -4F, 0.25F, 0F, -4F, 0.25F, 0F, 0F, 0.25F, 12.5F, 2F, 0.25F, -8.25F, 4.5F, 0.25F, -8.25F, 4.5F, 0.25F, 12.5F, 2F, 0.25F); // Box 223
        gunModel[181].setRotationPoint(5F, -25F, -4.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 3, 24, 9, 0F, 1F, 0F, 0.25F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 1F, 0F, 0.25F, 9.25F, 0.5F, 0.25F, -9F, 1F, -1.25F, -9F, 1F, -1.25F, 9.25F, 0.5F, 0.25F); // Box 224
        gunModel[182].setRotationPoint(13F, -21F, -4.5F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 1F, 0F, 0.25F, 0F, -2.5F, -1.25F, 0F, -2.5F, -1.25F, 1F, 0F, 0.25F, 2.25F, -0.5F, 0.25F, -0.5F, 0.5F, -1.25F, -0.5F, 0.5F, -1.25F, 2.25F, -0.5F, 0.25F); // Box 225
        gunModel[183].setRotationPoint(6F, 0F, -4.5F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 6, 19, 10, 0F, 0F, 0F, 0.25F, 1.5F, -2.5F, 0.25F, 1.5F, -2.5F, 0.25F, 0F, 0F, 0.25F, 8.75F, -0.5F, 0.25F, -5F, 2F, 0.25F, -5F, 2F, 0.25F, 8.75F, -0.5F, 0.25F); // Box 226
        gunModel[184].setRotationPoint(3.5F, -21.5F, -5F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F, 0.75F, 0.5F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0.75F, 0.5F, 0.25F, 0.5F, -0.25F, 0.25F, -1.5F, 1.75F, 0.25F, -1.5F, 1.75F, 0.25F, 0.5F, -0.25F, 0.25F); // Box 227
        gunModel[185].setRotationPoint(-4.5F, -2.5F, -5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F, -1.25F, 0.25F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0.25F, -1.25F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0F, -1F, 0.25F); // Box 228
        gunModel[186].setRotationPoint(3.5F, -22.5F, -5F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, 0F); // Box 229
        gunModel[187].setRotationPoint(17F, -31F, -4F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0F); // Box 230
        gunModel[188].setRotationPoint(17F, -29F, -4F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F); // Box 231
        gunModel[189].setRotationPoint(17F, -23F, -4F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.75F, 0.75F, -1F, 0.75F, 0.75F, -1F, 0F, 0F, -0.75F); // Box 232
        gunModel[190].setRotationPoint(17F, -21F, -4F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0.25F, 0F, 0F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0.25F, -0.25F, 0F); // Box 233
        gunModel[191].setRotationPoint(20F, -21F, -3F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, -1F, -1.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, -1.25F, 0F, 0.75F, -1.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.75F, -1.25F); // Box 234
        gunModel[192].setRotationPoint(26F, -21F, -3F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 2.25F, 0F, -0.25F, 2.25F, -0.25F, -1F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, -0.25F, 0.75F, 0F); // Box 235
        gunModel[193].setRotationPoint(34F, -22F, -3F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 7, 3, 13, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 236
        gunModel[194].setRotationPoint(-6F, -49F, -6.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3.5F, 0F, -0.25F); // Box 237
        gunModel[195].setRotationPoint(-4F, -46F, -6.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 243
        gunModel[196].setRotationPoint(-8F, -62F, -4F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 244
        gunModel[197].setRotationPoint(-9F, -63F, -3.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Box 245
        gunModel[198].setRotationPoint(-18F, -58F, -4F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, 0F, -2.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2.25F, -0.75F, 0F, 1.75F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1.75F, 0.5F); // Box 246
        gunModel[199].setRotationPoint(-17F, -63F, -3.5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F); // Box 248
        gunModel[200].setRotationPoint(-18F, -61F, -3.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F); // Box 249
        gunModel[201].setRotationPoint(-18F, -59F, -3.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 250
        gunModel[202].setRotationPoint(-18F, -57F, -4F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F); // Box 251
        gunModel[203].setRotationPoint(-15F, -56F, -4F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F); // Box 252
        gunModel[204].setRotationPoint(-15F, -53F, -6F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0.25F, -1.75F, 2F, 0.25F, -1.75F, 2F, 0.25F, -1.75F, 0F, 0.25F, -1.75F); // Box 253
        gunModel[205].setRotationPoint(-15F, -49F, -6F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -1.25F, 1.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0.5F, -1.25F, 1.25F); // Box 256
        gunModel[206].setRotationPoint(-18F, -56F, -4F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0.5F, 1.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 1.25F, -0.75F, 0.5F, 1.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 1.25F, -0.75F); // Box 257
        gunModel[207].setRotationPoint(-18F, -53F, -6F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0.5F, -1.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1.25F, -0.75F, 0.5F, 0.25F, -2.25F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0.5F, 0.25F, -2.25F); // Box 258
        gunModel[208].setRotationPoint(-18F, -49F, -6F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, -2.25F, 0F); // Box 259
        gunModel[209].setRotationPoint(-18F, -44F, -3F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0.5F, -0.25F, 0.75F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0.5F, -0.25F, 0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 260
        gunModel[210].setRotationPoint(-18F, -46F, -3F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        gunModel[211].setRotationPoint(-15F, -46F, -3F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 1.5F, -2.25F, 0F, 1.5F, 0F, 0F, 1.25F, -1F, 0.25F, -0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -1F, 0.25F, -0.75F); // Box 262
        gunModel[212].setRotationPoint(-8F, -49F, -5F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 8, 3, 12, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0.25F); // Box 263
        gunModel[213].setRotationPoint(-15F, -52F, -6F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F, -1F, -0.25F, -0.75F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, -1F, -0.25F, -0.75F, -1F, 0F, -1.75F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -1F, 0F, -1.75F); // Box 264
        gunModel[214].setRotationPoint(-8F, -46F, -5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 265
        gunModel[215].setRotationPoint(-14F, -44F, -3F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 266
        gunModel[216].setRotationPoint(-11F, -44F, -3F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 267
        gunModel[217].setRotationPoint(-8F, -44F, -3F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.5F, 0F); // Box 268
        gunModel[218].setRotationPoint(-8F, -47F, -5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        gunModel[219].setRotationPoint(-11F, -47F, -5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 271
        gunModel[220].setRotationPoint(-13F, -47F, -5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.5F, -2.25F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 272
        gunModel[221].setRotationPoint(-9F, -47F, -5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, -0.5F, 0F, -3.5F, -0.5F); // Box 273
        gunModel[222].setRotationPoint(-8F, -47F, 3F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -0.5F, -2.25F, 0F, 0F, -1.25F, 0F); // Box 274
        gunModel[223].setRotationPoint(-9F, -47F, 3F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 275
        gunModel[224].setRotationPoint(-11F, -47F, 3F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.5F, -2.25F, 0F); // Box 276
        gunModel[225].setRotationPoint(-13F, -47F, 3F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 280
        gunModel[226].setRotationPoint(-11.5F, -42F, -5.5F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 281
        gunModel[227].setRotationPoint(-11.5F, -43F, -5.5F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 282
        gunModel[228].setRotationPoint(-11.5F, -44F, -5.5F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 229
        gunModel[229].setRotationPoint(6F, -44F, -5.5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, -1.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 230
        gunModel[230].setRotationPoint(4F, -44F, -5.5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.75F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 231
        gunModel[231].setRotationPoint(8F, -44F, -5.5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 232
        gunModel[232].setRotationPoint(5.5F, -42F, -6.5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 233
        gunModel[233].setRotationPoint(5.5F, -43F, -6.5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 234
        gunModel[234].setRotationPoint(5.5F, -41F, -6.5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Box 235
        gunModel[235].setRotationPoint(5.5F, -43F, -6.5F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F); // Box 236
        gunModel[236].setRotationPoint(5.5F, -41F, -6.5F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Box 237
        gunModel[237].setRotationPoint(5.5F, -42F, -6.5F);

        gunModel[238].addShapeBox(-8F, 0F, 0F, 23, 2, 1, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 238
        gunModel[238].setRotationPoint(7F, -44F, -5.5F);

        gunModel[239].addShapeBox(-8F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 239
        gunModel[239].setRotationPoint(3.5F, -44F, -5.5F);

        gunModel[240].addShapeBox(-8F, 0F, 0F, 34, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 240
        gunModel[240].setRotationPoint(7F, -44F, 4.5F);

        gunModel[241].addShapeBox(-8F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F); // Box 241
        gunModel[241].setRotationPoint(3.5F, -44F, 4.5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 242
        gunModel[242].setRotationPoint(12F, -39F, -5.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 243
        gunModel[243].setRotationPoint(12F, -38F, -5.5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0.5F, 0.25F, -1.25F, 0.5F, 0.25F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F); // Box 244
        gunModel[244].setRotationPoint(12F, -36F, -5.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 245
        gunModel[245].setRotationPoint(13F, -40F, -5.5F);

        gunModel[246].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246
        gunModel[246].setRotationPoint(16F, -41F, -5.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 247
        gunModel[247].setRotationPoint(13.5F, -34.5F, -6.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 248
        gunModel[248].setRotationPoint(13.5F, -32.5F, -6.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 249
        gunModel[249].setRotationPoint(13.5F, -34.5F, -6.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F); // Box 250
        gunModel[250].setRotationPoint(13.5F, -32.5F, -6.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 251
        gunModel[251].setRotationPoint(13.5F, -35.5F, -6.5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 252
        gunModel[252].setRotationPoint(13.5F, -35.5F, -6.5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0.25F, -1.25F, 0.5F, 0.25F); // Box 253
        gunModel[253].setRotationPoint(12F, -36F, 4.5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 254
        gunModel[254].setRotationPoint(12F, -39F, 4.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 255
        gunModel[255].setRotationPoint(12F, -38F, 4.5F);

        gunModel[256].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 256
        gunModel[256].setRotationPoint(16F, -41F, 4.5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 257
        gunModel[257].setRotationPoint(13F, -40F, 4.5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 258
        gunModel[258].setRotationPoint(13.5F, -34.5F, 4.5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F); // Box 259
        gunModel[259].setRotationPoint(13.5F, -32.5F, 4.5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 260
        gunModel[260].setRotationPoint(13.5F, -35.5F, 5.5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 261
        gunModel[261].setRotationPoint(13.5F, -35.5F, 5.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 262
        gunModel[262].setRotationPoint(13.5F, -34.5F, 5.5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 263
        gunModel[263].setRotationPoint(13.5F, -32.5F, 5.5F);

        gunModel[264].addShapeBox(0F, 0F, -1F, 1, 1, 10, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, -0.625F, 0.1F, -0.7F, -0.625F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.625F, -0.25F, 0.1F, -0.625F); // Box 264
        gunModel[264].setRotationPoint(23.4F, -35.8F, -3.7F);

        gunModel[265].addShapeBox(0F, 0F, -1F, 1, 1, 10, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.625F, -0.25F, 0.1F, -0.625F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, -0.625F, 0.1F, -0.7F, -0.625F); // Box 265
        gunModel[265].setRotationPoint(23.4F, -35.8F, -3.7F);

        gunModel[266].addShapeBox(0F, 0F, -1F, 1, 1, 10, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.625F, 0.1F, -0.3F, -0.625F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.625F, 0.1F, -0.3F, -0.625F); // Box 266
        gunModel[266].setRotationPoint(23.4F, -35.8F, -3.7F);

        gunModel[267].addShapeBox(0F, 0F, -1F, 1, 1, 10, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, -0.625F, 0.1F, -0.7F, -0.625F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.625F, -0.25F, 0.1F, -0.625F); // Box 267
        gunModel[267].setRotationPoint(30.8F, -38.3F, -3.7F);

        gunModel[268].addShapeBox(0F, 0F, -1F, 1, 1, 10, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.625F, 0.1F, -0.3F, -0.625F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.625F, 0.1F, -0.3F, -0.625F); // Box 268
        gunModel[268].setRotationPoint(30.8F, -38.3F, -3.7F);

        gunModel[269].addShapeBox(0F, 0F, -1F, 1, 1, 10, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.625F, -0.25F, 0.1F, -0.625F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, -0.625F, 0.1F, -0.7F, -0.625F); // Box 269
        gunModel[269].setRotationPoint(30.8F, -38.3F, -3.7F);

        gunModel[270].addShapeBox(-3F, -0.5F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 270
        gunModel[270].setRotationPoint(33F, -41.5F, -5.5F);
        gunModel[270].rotateAngleZ = 0.31415927F;

        gunModel[271].addShapeBox(-6F, -0.5F, -1F, 3, 1, 2, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 271
        gunModel[271].setRotationPoint(33F, -41.5F, -5.5F);
        gunModel[271].rotateAngleZ = 0.31415927F;

        gunModel[272].addShapeBox(-7F, -0.5F, -1F, 1, 1, 2, 0F, -0.5F, -0.375F, -0.75F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, -0.75F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 272
        gunModel[272].setRotationPoint(33F, -41.5F, -5.5F);
        gunModel[272].rotateAngleZ = 0.31415927F;

        gunModel[273].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F); // Box 273
        gunModel[273].setRotationPoint(34F, -42.75F, -7.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.25F, 0.25F, 1F, -0.25F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F); // Box 274
        gunModel[274].setRotationPoint(34F, -43.75F, -7.5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 0.25F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, -0.25F, 0.25F, 1F, -0.25F, 0.25F); // Box 275
        gunModel[275].setRotationPoint(34F, -40.75F, -7.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F); // Box 276
        gunModel[276].setRotationPoint(39F, -43F, -7.5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -0.75F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0.25F, -0.25F, 0.75F, 0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.25F, -0.25F, 0F, 0.25F); // Box 277
        gunModel[277].setRotationPoint(37.75F, -40F, -7.5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 1F, -0.5F, -0.75F, 1F, -0.5F, -0.25F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0.5F, 0.25F); // Box 278
        gunModel[278].setRotationPoint(40.25F, -42F, -7.5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F); // Box 282
        gunModel[279].setRotationPoint(56F, -41.5F, -7.5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F); // Box 283
        gunModel[280].setRotationPoint(56F, -42.5F, -7.5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F); // Box 284
        gunModel[281].setRotationPoint(56F, -43.5F, -7.5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 285
        gunModel[282].setRotationPoint(69F, -42F, -7.5F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 286
        gunModel[283].setRotationPoint(69F, -43F, -7.5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F); // Box 288
        gunModel[284].setRotationPoint(69F, -41F, -7.5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 289
        gunModel[285].setRotationPoint(68F, -51F, -7F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 34, 4, 1, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, -2.75F, 0F, 0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290
        gunModel[286].setRotationPoint(34F, -56F, 5.5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 291
        gunModel[287].setRotationPoint(34F, -57F, 2.5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 81, 2, 2, 0F, 4.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 292
        gunModel[288].setRotationPoint(-7F, -55F, 4.5F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 81, 2, 2, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 4.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 293
        gunModel[289].setRotationPoint(-7F, -51F, 4.5F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
        gunModel[290].setRotationPoint(40F, -59F, 2.5F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        gunModel[291].setRotationPoint(63F, -59F, 2.5F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
        gunModel[292].setRotationPoint(43F, -59F, 2.5F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        gunModel[293].setRotationPoint(43F, -58F, 2.5F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[294].setRotationPoint(43F, -56F, 2.5F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 299
        gunModel[295].setRotationPoint(40.5F, -58.1F, 4.75F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 300
        gunModel[296].setRotationPoint(40.5F, -57.1F, 4.75F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[297].setRotationPoint(40.5F, -57.6F, 4.75F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        gunModel[298].setRotationPoint(63.5F, -57.6F, 4.75F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
        gunModel[299].setRotationPoint(63.5F, -57.1F, 4.75F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
        gunModel[300].setRotationPoint(63.5F, -58.1F, 4.75F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 80, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 305
        gunModel[301].setRotationPoint(-6F, -53.5F, 4.5F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 306
        gunModel[302].setRotationPoint(58F, -54F, 6.5F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F); // Box 307
        gunModel[303].setRotationPoint(57F, -54F, 6.5F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 308
        gunModel[304].setRotationPoint(60F, -54F, 7.5F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 309
        gunModel[305].setRotationPoint(60.5F, -54F, 8.5F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 310
        gunModel[306].setRotationPoint(60.5F, -51F, 8.5F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 311
        gunModel[307].setRotationPoint(60F, -51F, 7.5F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 312
        gunModel[308].setRotationPoint(60F, -55F, 7.5F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 313
        gunModel[309].setRotationPoint(60.5F, -55F, 6.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 314
        gunModel[310].setRotationPoint(60F, -55F, 8.5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 316
        gunModel[311].setRotationPoint(60F, -50F, 8.5F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 317
        gunModel[312].setRotationPoint(60F, -50F, 7.5F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 318
        gunModel[313].setRotationPoint(60.5F, -50F, 6.5F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
        gunModel[314].setRotationPoint(61.25F, -54F, 9.5F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F); // Box 320
        gunModel[315].setRotationPoint(63.25F, -54F, 9.5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 321
        gunModel[316].setRotationPoint(63.25F, -51F, 9.5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 322
        gunModel[317].setRotationPoint(71F, -55F, 8.5F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 323
        gunModel[318].setRotationPoint(71F, -50F, 8.5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 324
        gunModel[319].setRotationPoint(66.75F, -56F, 8.5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 325
        gunModel[320].setRotationPoint(66.75F, -57F, 8.5F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 326
        gunModel[321].setRotationPoint(66.75F, -54F, 8.5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 327
        gunModel[322].setRotationPoint(69.75F, -54F, 8.5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 328
        gunModel[323].setRotationPoint(67.75F, -54F, 8.5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 329
        gunModel[324].setRotationPoint(67.75F, -51F, 8.5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 330
        gunModel[325].setRotationPoint(68.75F, -52F, 8.5F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 331
        gunModel[326].setRotationPoint(67.75F, -52F, 8.5F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.25F, 0F, -0.5F, 0.25F); // Box 332
        gunModel[327].setRotationPoint(67.75F, -53F, 8.5F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -1F, 0.25F); // Box 333
        gunModel[328].setRotationPoint(68.75F, -53F, 8.5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 334
        gunModel[329].setRotationPoint(68F, -53.5F, 6F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 335
        gunModel[330].setRotationPoint(75F, -53.5F, 6F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 336
        gunModel[331].setRotationPoint(38F, -53F, 5.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 337
        gunModel[332].setRotationPoint(37F, -53F, 5.5F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 338
        gunModel[333].setRotationPoint(35F, -38F, -7.5F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, -2.25F, -0.25F, -0.5F, -2.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 339
        gunModel[334].setRotationPoint(35F, -34F, -7.5F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 340
        gunModel[335].setRotationPoint(35F, -39F, -7.5F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.75F, 0.75F, -0.25F, 0.75F, 0.75F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 341
        gunModel[336].setRotationPoint(44F, -40F, 6F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.75F, 0.75F, -0.25F, 0.75F, 0.75F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 342
        gunModel[337].setRotationPoint(44F, -35.5F, 6F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 28, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 343
        gunModel[338].setRotationPoint(38F, -44F, 4.5F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 344
        gunModel[339].setRotationPoint(48F, -38F, 4.5F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -1F, -0.25F); // Box 345
        gunModel[340].setRotationPoint(47F, -38F, 4.5F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 346
        gunModel[341].setRotationPoint(47F, -36.5F, 4.5F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.625F, 0F, 0F, 0.625F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.625F, 0F, 0.5F, 0.625F); // Box 347
        gunModel[342].setRotationPoint(38F, -38F, 4.5F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.625F, -0.25F, 0F, 0.625F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.625F, -0.25F, 0.5F, 0.625F); // Box 348
        gunModel[343].setRotationPoint(47F, -38F, 4.5F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -0.25F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0.5F, 0.375F, 0F, 0.5F, 0.375F, 0F, 0.5F, -0.125F, -0.25F, 0.5F, -0.125F); // Box 349
        gunModel[344].setRotationPoint(34F, -38.5F, 6.5F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.375F, 0F, -1F, 0.375F, 0F, -1F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.125F, 0F, 0.5F, -0.125F); // Box 350
        gunModel[345].setRotationPoint(39F, -38.5F, 6.5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 351
        gunModel[346].setRotationPoint(33F, -37.5F, 6.5F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.25F, 0.375F, -0.25F, -0.25F, 0.375F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 352
        gunModel[347].setRotationPoint(33F, -38.5F, 6.5F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, 0.375F, -0.25F, -0.25F, 0.375F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); // Box 353
        gunModel[348].setRotationPoint(33F, -34.5F, 6.5F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, -0.125F, 0F, -1F, -0.125F, 0F, -0.5F, 0.375F, 0F, 0.5F, 0.375F, 0F, 0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 354
        gunModel[349].setRotationPoint(33.25F, -38.5F, 6.5F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 35, 4, 1, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 355
        gunModel[350].setRotationPoint(-2F, -49F, 5.5F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 34, 4, 1, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 356
        gunModel[351].setRotationPoint(40F, -49F, 5.5F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F); // Box 357
        gunModel[352].setRotationPoint(38F, -49F, 5.5F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 358
        gunModel[353].setRotationPoint(33F, -49F, 5.5F);

        gunModel[354].addShapeBox(0F, -4.5F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 359
        gunModel[354].setRotationPoint(35F, -44F, 6.5F);
        gunModel[354].rotateAngleX = -0.13962634F;

        gunModel[355].addShapeBox(0F, -5.5F, 0F, 2, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 360
        gunModel[355].setRotationPoint(35.5F, -44F, 6.5F);
        gunModel[355].rotateAngleX = -0.13962634F;

        gunModel[356].addShapeBox(0F, -3.5F, 0F, 3, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 361
        gunModel[356].setRotationPoint(35F, -44F, 6.5F);
        gunModel[356].rotateAngleX = -0.13962634F;

        gunModel[357].addShapeBox(0F, -2.5F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 362
        gunModel[357].setRotationPoint(35F, -44F, 6.5F);
        gunModel[357].rotateAngleX = -0.13962634F;

        gunModel[358].addShapeBox(0F, -1.5F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
        gunModel[358].setRotationPoint(35F, -44F, 6.5F);
        gunModel[358].rotateAngleX = -0.13962634F;

        gunModel[359].addShapeBox(0F, -0.5F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 364
        gunModel[359].setRotationPoint(35F, -44F, 6.5F);
        gunModel[359].rotateAngleX = -0.13962634F;

        gunModel[360].addShapeBox(0.5F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 365
        gunModel[360].setRotationPoint(35F, -44F, 6.5F);
        gunModel[360].rotateAngleX = -0.13962634F;

        gunModel[361].addShapeBox(0.5F, 0F, 0F, 1, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 366
        gunModel[361].setRotationPoint(37.25F, -44F, 6F);

        gunModel[362].addShapeBox(0.5F, 0F, 0F, 1, 5, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 367
        gunModel[362].setRotationPoint(33.75F, -44F, 6F);

        gunModel[363].addShapeBox(-0.5F, 0F, 0F, 3, 2, 1, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); // Box 368
        gunModel[363].setRotationPoint(31.75F, -41F, 6F);

        gunModel[364].addShapeBox(-0.5F, 0F, 0F, 2, 2, 2, 0F, 1.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 1.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Box 369
        gunModel[364].setRotationPoint(31.75F, -41F, 4F);

        gunModel[365].addShapeBox(-0.5F, 0F, 0F, 2, 2, 2, 0F, 1.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 1.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Box 370
        gunModel[365].setRotationPoint(31.75F, -33.25F, 4F);

        gunModel[366].addShapeBox(-0.5F, 0F, 0F, 8, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); // Box 371
        gunModel[366].setRotationPoint(31.75F, -33.25F, 6F);

        gunModel[367].addShapeBox(-0.5F, 0F, 0F, 4, 1, 1, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 372
        gunModel[367].setRotationPoint(35.75F, -34F, 6F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 168
        gunModel[368].setRotationPoint(22.5F, -31.5F, -1F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 169
        gunModel[369].setRotationPoint(21.5F, -29.5F, -1F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 170
        gunModel[370].setRotationPoint(22F, -27.5F, -1F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2.5F, 1F, 0F, 1.25F, 0.75F, 0F, 1.25F, 0.75F, 0F, -2.5F, 1F, 0F); // Box 171
        gunModel[371].setRotationPoint(22F, -25.5F, -1F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 3, 17, 6, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -1.75F, 0F); // Box 389
        gunModel[372].setRotationPoint(-21F, -61F, -3F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 0.5F, 0F, 0.75F); // Box 390
        gunModel[373].setRotationPoint(-22.5F, -60F, -4F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 4, 8, 9, 0F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 391
        gunModel[374].setRotationPoint(-22.5F, -59F, -4.5F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0.5F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 0.5F, 0F, 0.75F, -0.5F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 392
        gunModel[375].setRotationPoint(-22.5F, -51F, -4F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 393
        gunModel[376].setRotationPoint(-25.5F, -58.5F, 6F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 394
        gunModel[377].setRotationPoint(-25.5F, -58.5F, 5F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Box 395
        gunModel[378].setRotationPoint(-25.5F, -58.5F, 7F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 396
        gunModel[379].setRotationPoint(-26.5F, -57.5F, 6F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 398
        gunModel[380].setRotationPoint(-26.5F, -57.5F, 7F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 399
        gunModel[381].setRotationPoint(-26.5F, -57.5F, 4F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, -0.5F, 1F, -1.5F, -0.5F, 1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 400
        gunModel[382].setRotationPoint(-26.5F, -53.5F, 5F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, 1F, -1.5F, -0.5F, 1F); // Box 401
        gunModel[383].setRotationPoint(-26.5F, -53.5F, 7F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 402
        gunModel[384].setRotationPoint(-26.5F, -53.5F, 6F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 403
        gunModel[385].setRotationPoint(-26.5F, -45F, 2F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 404
        gunModel[386].setRotationPoint(-26.5F, -45F, 7F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 405
        gunModel[387].setRotationPoint(-26.5F, -45F, 6F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 406
        gunModel[388].setRotationPoint(-26.5F, -47F, 2F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 407
        gunModel[389].setRotationPoint(-26.5F, -47F, 0F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
        gunModel[390].setRotationPoint(-26.5F, -51F, -3F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 409
        gunModel[391].setRotationPoint(-26.5F, -47F, -3F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 410
        gunModel[392].setRotationPoint(-22.5F, -47F, -3F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
        gunModel[393].setRotationPoint(-25.5F, -58F, -5F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 412
        gunModel[394].setRotationPoint(-24.5F, -59F, -5F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F); // Box 413
        gunModel[395].setRotationPoint(-27.5F, -58F, -5F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
        gunModel[396].setRotationPoint(-25.5F, -59F, -5F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, -0.25F, -2.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -2.25F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F); // Box 415
        gunModel[397].setRotationPoint(-27.5F, -59F, -5F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.875F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -0.875F, -0.5F, 0F); // Box 416
        gunModel[398].setRotationPoint(-24.5F, -58F, -5F);

        gunModel[399].addShapeBox(0F, 0F, -2F, 1, 1, 9, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 417
        gunModel[399].setRotationPoint(-24.6F, -58F, -3F);

        gunModel[400].addShapeBox(0F, 0F, -2F, 5, 1, 9, 0F, -0.125F, -0.5F, 0F, -0.425F, -0.5F, 0F, -0.425F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.425F, 0F, 0F, -0.425F, 0F, 0F, -0.125F, 0F, 0F); // Box 418
        gunModel[400].setRotationPoint(-24.6F, -58F, -3F);

        gunModel[401].addShapeBox(0F, 0F, -2F, 3, 2, 1, 0F, 0.375F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.75F, 0.375F, 0F, -0.75F, 0.375F, -0.5F, 0F, -0.425F, -0.5F, 0F, -0.425F, -0.5F, -0.75F, 0.375F, -0.5F, -0.75F); // Box 419
        gunModel[401].setRotationPoint(-22.6F, -59F, -3F);

        gunModel[402].addShapeBox(0F, 0F, -2F, 5, 1, 9, 0F, -0.125F, 0F, 0F, -0.425F, 0F, 0F, -0.425F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.425F, -0.25F, 0F, -0.425F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Box 420
        gunModel[402].setRotationPoint(-24.6F, -57F, -3F);

        gunModel[403].addShapeBox(0F, 0F, -2F, 5, 1, 9, 0F, -0.125F, 0F, 0F, -0.425F, 0F, 0F, -0.425F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.425F, 0F, 0F, -0.425F, 0F, 0F, -0.125F, 0F, 0F); // Box 421
        gunModel[403].setRotationPoint(-24.6F, -53F, -3F);

        gunModel[404].addShapeBox(0F, 0F, -2F, 2, 3, 9, 0F, -0.125F, 0.25F, 0F, -0.425F, 0.25F, 0F, -0.425F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0F, 0F, -0.425F, 0F, 0F, -0.425F, 0F, 0F, -0.125F, 0F, 0F); // Box 422
        gunModel[404].setRotationPoint(-21.6F, -56F, -3F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 423
        gunModel[405].setRotationPoint(-24.5F, -57F, -4.5F);

        gunModel[406].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 424
        gunModel[406].setRotationPoint(-22.47F, -56F, -3F);

        gunModel[407].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 425
        gunModel[407].setRotationPoint(-22.47F, -54.25F, -3F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 426
        gunModel[408].setRotationPoint(-23.9F, -55.15F, -5.25F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 427
        gunModel[409].setRotationPoint(-23.9F, -56.15F, -5.25F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 428
        gunModel[410].setRotationPoint(-23.9F, -54.15F, -5.25F);

        gunModel[411].addShapeBox(0F, 0F, -2F, 2, 4, 2, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, -1.25F, 0.25F, -1F, -1.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 429
        gunModel[411].setRotationPoint(-25.5F, -51F, -3F);

        gunModel[412].addShapeBox(-32F, 0F, 0F, 8, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 1.25F, -2.25F, 0.25F, 1.25F, -2.25F, 0.25F, -1.25F, 0F, 0.25F, -1.25F); // Box 498
        gunModel[412].setRotationPoint(109F, -60F, -6F);

        gunModel[413].addShapeBox(-32F, 0F, 0F, 42, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 499
        gunModel[413].setRotationPoint(109F, -54F, -7F);

        gunModel[414].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 500
        gunModel[414].setRotationPoint(109F, -52F, -7F);

        gunModel[415].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F); // Box 501
        gunModel[415].setRotationPoint(109F, -51F, -7F);

        gunModel[416].addShapeBox(-32F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Box 502
        gunModel[416].setRotationPoint(111F, -50F, -7F);

        gunModel[417].addShapeBox(-32F, 0F, 0F, 98, 1, 1, 0F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 503
        gunModel[417].setRotationPoint(111F, -49F, -7F);

        gunModel[418].addShapeBox(-32F, 0F, 0F, 4, 1, 1, 0F, -1.5F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 504
        gunModel[418].setRotationPoint(109F, -48F, -7F);

        gunModel[419].addShapeBox(-32F, 0F, 0F, 4, 3, 1, 0F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, -1.5F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 505
        gunModel[419].setRotationPoint(109F, -47F, -7F);

        gunModel[420].addShapeBox(-32F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.75F, 0.75F, 0F, -0.75F, 0.75F); // Box 506
        gunModel[420].setRotationPoint(109F, -44F, -7F);

        gunModel[421].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -1F, 2.25F, 0F, -1F, 2.25F); // Box 507
        gunModel[421].setRotationPoint(109F, -43F, -6F);

        gunModel[422].addShapeBox(-32F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 508
        gunModel[422].setRotationPoint(109F, -41F, -3F);

        gunModel[423].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 2.25F, 0F, -1F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 509
        gunModel[423].setRotationPoint(109F, -43F, 5F);

        gunModel[424].addShapeBox(-32F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, 0.25F, -0.5F, 1F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.75F, -1F, -0.75F, 0.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 510
        gunModel[424].setRotationPoint(109F, -44F, 6F);

        gunModel[425].addShapeBox(-32F, 0F, 0F, 4, 3, 1, 0F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -1F, 0.25F, -1.5F, -1F, 0.25F, -1.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 511
        gunModel[425].setRotationPoint(109F, -47F, 6F);

        gunModel[426].addShapeBox(-32F, 0F, 0F, 4, 1, 1, 0F, -1.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 512
        gunModel[426].setRotationPoint(109F, -48F, 6F);

        gunModel[427].addShapeBox(-32F, 0F, 0F, 98, 1, 1, 0F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F); // Box 513
        gunModel[427].setRotationPoint(111F, -49F, 6F);

        gunModel[428].addShapeBox(-32F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F); // Box 514
        gunModel[428].setRotationPoint(111F, -50F, 6F);

        gunModel[429].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F); // Box 515
        gunModel[429].setRotationPoint(109F, -51F, 6F);

        gunModel[430].addShapeBox(-32F, 0F, 0F, 42, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 516
        gunModel[430].setRotationPoint(109F, -54F, 6F);

        gunModel[431].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 517
        gunModel[431].setRotationPoint(109F, -52F, 6F);

        gunModel[432].addShapeBox(-32F, 0F, 0F, 8, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -1.25F, -2.25F, 0.25F, -1.25F, -2.25F, 0.25F, 1.25F, 0F, 0.25F, 1.25F); // Box 518
        gunModel[432].setRotationPoint(109F, -60F, 5F);

        gunModel[433].addShapeBox(-32F, 0F, 0F, 49, 1, 1, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 519
        gunModel[433].setRotationPoint(109F, -60.5F, -6F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 520
        gunModel[434].setRotationPoint(88F, -64F, -3F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 521
        gunModel[435].setRotationPoint(88F, -63F, -3F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 522
        gunModel[436].setRotationPoint(95.5F, -64F, -3F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 523
        gunModel[437].setRotationPoint(95.5F, -63F, -3F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 524
        gunModel[438].setRotationPoint(88F, -65F, -3F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 525
        gunModel[439].setRotationPoint(102.5F, -63F, -3F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 526
        gunModel[440].setRotationPoint(102.5F, -64F, -3F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 527
        gunModel[441].setRotationPoint(109.5F, -63F, -3F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 528
        gunModel[442].setRotationPoint(109.5F, -64F, -3F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 529
        gunModel[443].setRotationPoint(116.5F, -63F, -3F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 530
        gunModel[444].setRotationPoint(116.5F, -64F, -3F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 531
        gunModel[445].setRotationPoint(123.5F, -63F, -3F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 532
        gunModel[446].setRotationPoint(123.5F, -64F, -3F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 533
        gunModel[447].setRotationPoint(95.5F, -64F, 2F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 534
        gunModel[448].setRotationPoint(88F, -64F, 2F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 535
        gunModel[449].setRotationPoint(88F, -63F, 2F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 536
        gunModel[450].setRotationPoint(95.5F, -63F, 2F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 537
        gunModel[451].setRotationPoint(102.5F, -64F, 2F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 538
        gunModel[452].setRotationPoint(102.5F, -63F, 2F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 539
        gunModel[453].setRotationPoint(109.5F, -64F, 2F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 540
        gunModel[454].setRotationPoint(109.5F, -63F, 2F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 541
        gunModel[455].setRotationPoint(116.5F, -64F, 2F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 542
        gunModel[456].setRotationPoint(116.5F, -63F, 2F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 543
        gunModel[457].setRotationPoint(123.5F, -64F, 2F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 544
        gunModel[458].setRotationPoint(123.5F, -63F, 2F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 545
        gunModel[459].setRotationPoint(88F, -65F, 2F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -1.75F, 0.25F, 0F, -1.75F); // Box 546
        gunModel[460].setRotationPoint(86F, -62F, -3F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 37, 2, 1, 0F, 0.5F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 547
        gunModel[461].setRotationPoint(86F, -61F, -4F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.75F, -1F, 0F, -1.75F, -1F, 0F, 1.25F, 0.25F, 0F, 1.25F); // Box 548
        gunModel[462].setRotationPoint(86F, -62F, 2F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 37, 2, 1, 0F, 0.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 549
        gunModel[463].setRotationPoint(86F, -61F, 3F);

        gunModel[464].addShapeBox(-32F, 0F, 0F, 49, 1, 1, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 550
        gunModel[464].setRotationPoint(109F, -60.5F, 5F);

        gunModel[465].addShapeBox(-32F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 551
        gunModel[465].setRotationPoint(151F, -55F, -7F);

        gunModel[466].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 552
        gunModel[466].setRotationPoint(151F, -60F, -7F);

        gunModel[467].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 553
        gunModel[467].setRotationPoint(157F, -60F, -7F);

        gunModel[468].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.38F, -1F, 0F, 0.38F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 554
        gunModel[468].setRotationPoint(152.25F, -60F, -6F);

        gunModel[469].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0.38F, 0F, 0F, 0.38F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 555
        gunModel[469].setRotationPoint(156F, -60F, -6F);

        gunModel[470].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.28F, -1F, 0F, 0.28F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 556
        gunModel[470].setRotationPoint(156F, -56.5F, -7.25F);

        gunModel[471].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.45F, -1F, 0F, -0.45F, -1F, 0F, 0.28F, 0F, 0F, 0.28F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 557
        gunModel[471].setRotationPoint(152.25F, -56.5F, -7.25F);

        gunModel[472].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 558
        gunModel[472].setRotationPoint(152F, -60F, -7F);

        gunModel[473].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 559
        gunModel[473].setRotationPoint(156.25F, -60F, -7F);

        gunModel[474].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 560
        gunModel[474].setRotationPoint(152.25F, -60F, -6F);

        gunModel[475].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 561
        gunModel[475].setRotationPoint(152.25F, -55.5F, -7F);

        gunModel[476].addShapeBox(-32F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 562
        gunModel[476].setRotationPoint(151F, -55F, 6F);

        gunModel[477].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 1F, 0.25F, -0.5F, 1F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 563
        gunModel[477].setRotationPoint(157F, -60F, 6F);

        gunModel[478].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 1F, 0.25F, -0.5F, 1F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 564
        gunModel[478].setRotationPoint(151F, -60F, 6F);

        gunModel[479].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F); // Box 569
        gunModel[479].setRotationPoint(152.25F, -60F, 5F);

        gunModel[480].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 570
        gunModel[480].setRotationPoint(152F, -60F, 6F);

        gunModel[481].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 571
        gunModel[481].setRotationPoint(156.25F, -60F, 6F);

        gunModel[482].addShapeBox(-32F, 0F, 0F, 5, 1, 1, 0F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F); // Box 572
        gunModel[482].setRotationPoint(152.25F, -55.5F, 6F);

        gunModel[483].addShapeBox(-32F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 573
        gunModel[483].setRotationPoint(109F, -55F, -7F);

        gunModel[484].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, 1.25F, -2.75F, 0.25F, 1.25F, -2.75F, 0.25F, -1.25F, 2.25F, 0.25F, -1.25F); // Box 574
        gunModel[484].setRotationPoint(121F, -60F, -6F);

        gunModel[485].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 575
        gunModel[485].setRotationPoint(118.5F, -55F, -7F);

        gunModel[486].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, 1.25F, -2.75F, 0.25F, 1.25F, -2.75F, 0.25F, -1.25F, 2.25F, 0.25F, -1.25F); // Box 576
        gunModel[486].setRotationPoint(126.5F, -60F, -6F);

        gunModel[487].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 577
        gunModel[487].setRotationPoint(124F, -55F, -7F);

        gunModel[488].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, 1.25F, -2.75F, 0.25F, 1.25F, -2.75F, 0.25F, -1.25F, 2.25F, 0.25F, -1.25F); // Box 588
        gunModel[488].setRotationPoint(132F, -60F, -6F);

        gunModel[489].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 589
        gunModel[489].setRotationPoint(129.5F, -55F, -7F);

        gunModel[490].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, 1.25F, -2.75F, 0.25F, 1.25F, -2.75F, 0.25F, -1.25F, 2.25F, 0.25F, -1.25F); // Box 590
        gunModel[490].setRotationPoint(137.5F, -60F, -6F);

        gunModel[491].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 591
        gunModel[491].setRotationPoint(135F, -55F, -7F);

        gunModel[492].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, 1.25F, -2.75F, 0.25F, 1.25F, -2.75F, 0.25F, -1.25F, 2.25F, 0.25F, -1.25F); // Box 592
        gunModel[492].setRotationPoint(143F, -60F, -6F);

        gunModel[493].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 593
        gunModel[493].setRotationPoint(140.5F, -55F, -7F);

        gunModel[494].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, 1.25F, -2.75F, 0.25F, 1.25F, -2.75F, 0.25F, -1.25F, 2.25F, 0.25F, -1.25F); // Box 594
        gunModel[494].setRotationPoint(148.5F, -60F, -6F);

        gunModel[495].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 595
        gunModel[495].setRotationPoint(146F, -55F, -7F);

        gunModel[496].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, -1.25F, -2.75F, 0.25F, -1.25F, -2.75F, 0.25F, 1.25F, 2.25F, 0.25F, 1.25F); // Box 596
        gunModel[496].setRotationPoint(148.5F, -60F, 5F);

        gunModel[497].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 597
        gunModel[497].setRotationPoint(146F, -55F, 6F);

        gunModel[498].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, -1.25F, -2.75F, 0.25F, -1.25F, -2.75F, 0.25F, 1.25F, 2.25F, 0.25F, 1.25F); // Box 598
        gunModel[498].setRotationPoint(143F, -60F, 5F);

        gunModel[499].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 599
        gunModel[499].setRotationPoint(140.5F, -55F, 6F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 600
        gunModel[501] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 601
        gunModel[502] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 602
        gunModel[503] = new ModelRendererTurbo(this, 785, 169, textureX, textureY); // Box 603
        gunModel[504] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 604
        gunModel[505] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 605
        gunModel[506] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Box 606
        gunModel[507] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 607
        gunModel[508] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 608
        gunModel[509] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 609
        gunModel[510] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 610
        gunModel[511] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 611
        gunModel[512] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 612
        gunModel[513] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 613
        gunModel[514] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 614
        gunModel[515] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 615
        gunModel[516] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 616
        gunModel[517] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 617
        gunModel[518] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 618
        gunModel[519] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 619
        gunModel[520] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 620
        gunModel[521] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 621
        gunModel[522] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 622
        gunModel[523] = new ModelRendererTurbo(this, 921, 161, textureX, textureY); // Box 623
        gunModel[524] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 624
        gunModel[525] = new ModelRendererTurbo(this, 809, 169, textureX, textureY); // Box 626
        gunModel[526] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 627
        gunModel[527] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 628
        gunModel[528] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 629
        gunModel[529] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 630
        gunModel[530] = new ModelRendererTurbo(this, 689, 185, textureX, textureY); // Box 631
        gunModel[531] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 632
        gunModel[532] = new ModelRendererTurbo(this, 921, 185, textureX, textureY); // Box 633
        gunModel[533] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 634
        gunModel[534] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 635
        gunModel[535] = new ModelRendererTurbo(this, 833, 169, textureX, textureY); // Box 636
        gunModel[536] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 637
        gunModel[537] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 638
        gunModel[538] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 639
        gunModel[539] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 640
        gunModel[540] = new ModelRendererTurbo(this, 697, 193, textureX, textureY); // Box 641
        gunModel[541] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Box 642
        gunModel[542] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Box 644
        gunModel[543] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Box 645
        gunModel[544] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 646
        gunModel[545] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 647
        gunModel[546] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 648
        gunModel[547] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 649
        gunModel[548] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 650
        gunModel[549] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 651
        gunModel[550] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 652
        gunModel[551] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 653
        gunModel[552] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 654
        gunModel[553] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 655
        gunModel[554] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 656
        gunModel[555] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 657
        gunModel[556] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 658
        gunModel[557] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 659
        gunModel[558] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 660
        gunModel[559] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 661
        gunModel[560] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 662
        gunModel[561] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 663
        gunModel[562] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 664
        gunModel[563] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 665
        gunModel[564] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 666
        gunModel[565] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 667
        gunModel[566] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 668
        gunModel[567] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 669
        gunModel[568] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 670
        gunModel[569] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 671
        gunModel[570] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 672
        gunModel[571] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 675
        gunModel[572] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 676
        gunModel[573] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 677
        gunModel[574] = new ModelRendererTurbo(this, 785, 185, textureX, textureY); // Box 678
        gunModel[575] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 679
        gunModel[576] = new ModelRendererTurbo(this, 801, 185, textureX, textureY); // Box 680
        gunModel[577] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 683
        gunModel[578] = new ModelRendererTurbo(this, 825, 185, textureX, textureY); // Box 684
        gunModel[579] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 685
        gunModel[580] = new ModelRendererTurbo(this, 1017, 185, textureX, textureY); // Box 686
        gunModel[581] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 687
        gunModel[582] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 688
        gunModel[583] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 689
        gunModel[584] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 690
        gunModel[585] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 691
        gunModel[586] = new ModelRendererTurbo(this, 1017, 193, textureX, textureY); // Box 692
        gunModel[587] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 693
        gunModel[588] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 694
        gunModel[589] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 695
        gunModel[590] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 696
        gunModel[591] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 697
        gunModel[592] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 698
        gunModel[593] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 699
        gunModel[594] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 700
        gunModel[595] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 701
        gunModel[596] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 702
        gunModel[597] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 703
        gunModel[598] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 704
        gunModel[599] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 705
        gunModel[600] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 706
        gunModel[601] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 707
        gunModel[602] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 708
        gunModel[603] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 712
        gunModel[604] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 713
        gunModel[605] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 715
        gunModel[606] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 716
        gunModel[607] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 717
        gunModel[608] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 718
        gunModel[609] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 719
        gunModel[610] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 720
        gunModel[611] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 721
        gunModel[612] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 722
        gunModel[613] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 723
        gunModel[614] = new ModelRendererTurbo(this, 513, 201, textureX, textureY); // Box 724
        gunModel[615] = new ModelRendererTurbo(this, 521, 201, textureX, textureY); // Box 725
        gunModel[616] = new ModelRendererTurbo(this, 529, 201, textureX, textureY); // Box 726
        gunModel[617] = new ModelRendererTurbo(this, 537, 201, textureX, textureY); // Box 727
        gunModel[618] = new ModelRendererTurbo(this, 545, 201, textureX, textureY); // Box 728
        gunModel[619] = new ModelRendererTurbo(this, 553, 201, textureX, textureY); // Box 729
        gunModel[620] = new ModelRendererTurbo(this, 561, 201, textureX, textureY); // Box 730
        gunModel[621] = new ModelRendererTurbo(this, 569, 201, textureX, textureY); // Box 731
        gunModel[622] = new ModelRendererTurbo(this, 577, 201, textureX, textureY); // Box 732
        gunModel[623] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Box 733
        gunModel[624] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); // Box 734
        gunModel[625] = new ModelRendererTurbo(this, 601, 201, textureX, textureY); // Box 735
        gunModel[626] = new ModelRendererTurbo(this, 609, 201, textureX, textureY); // Box 736
        gunModel[627] = new ModelRendererTurbo(this, 617, 201, textureX, textureY); // Box 737
        gunModel[628] = new ModelRendererTurbo(this, 625, 201, textureX, textureY); // Box 738
        gunModel[629] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Box 739
        gunModel[630] = new ModelRendererTurbo(this, 641, 201, textureX, textureY); // Box 740
        gunModel[631] = new ModelRendererTurbo(this, 649, 201, textureX, textureY); // Box 741
        gunModel[632] = new ModelRendererTurbo(this, 657, 201, textureX, textureY); // Box 742
        gunModel[633] = new ModelRendererTurbo(this, 665, 201, textureX, textureY); // Box 743
        gunModel[634] = new ModelRendererTurbo(this, 673, 201, textureX, textureY); // Box 744
        gunModel[635] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Box 745
        gunModel[636] = new ModelRendererTurbo(this, 689, 201, textureX, textureY); // Box 746
        gunModel[637] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 747
        gunModel[638] = new ModelRendererTurbo(this, 705, 201, textureX, textureY); // Box 748
        gunModel[639] = new ModelRendererTurbo(this, 713, 201, textureX, textureY); // Box 749
        gunModel[640] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 750
        gunModel[641] = new ModelRendererTurbo(this, 729, 201, textureX, textureY); // Box 751
        gunModel[642] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 752
        gunModel[643] = new ModelRendererTurbo(this, 745, 201, textureX, textureY); // Box 753
        gunModel[644] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Box 754
        gunModel[645] = new ModelRendererTurbo(this, 761, 201, textureX, textureY); // Box 755
        gunModel[646] = new ModelRendererTurbo(this, 769, 201, textureX, textureY); // Box 756
        gunModel[647] = new ModelRendererTurbo(this, 777, 201, textureX, textureY); // Box 757
        gunModel[648] = new ModelRendererTurbo(this, 785, 201, textureX, textureY); // Box 758
        gunModel[649] = new ModelRendererTurbo(this, 793, 201, textureX, textureY); // Box 759
        gunModel[650] = new ModelRendererTurbo(this, 801, 201, textureX, textureY); // Box 760
        gunModel[651] = new ModelRendererTurbo(this, 809, 201, textureX, textureY); // Box 761
        gunModel[652] = new ModelRendererTurbo(this, 817, 201, textureX, textureY); // Box 762
        gunModel[653] = new ModelRendererTurbo(this, 825, 201, textureX, textureY); // Box 763
        gunModel[654] = new ModelRendererTurbo(this, 833, 201, textureX, textureY); // Box 764
        gunModel[655] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 765
        gunModel[656] = new ModelRendererTurbo(this, 849, 201, textureX, textureY); // Box 766
        gunModel[657] = new ModelRendererTurbo(this, 857, 201, textureX, textureY); // Box 767
        gunModel[658] = new ModelRendererTurbo(this, 865, 201, textureX, textureY); // Box 768
        gunModel[659] = new ModelRendererTurbo(this, 873, 201, textureX, textureY); // Box 769
        gunModel[660] = new ModelRendererTurbo(this, 881, 201, textureX, textureY); // Box 770
        gunModel[661] = new ModelRendererTurbo(this, 889, 201, textureX, textureY); // Box 771
        gunModel[662] = new ModelRendererTurbo(this, 897, 201, textureX, textureY); // Box 772
        gunModel[663] = new ModelRendererTurbo(this, 905, 201, textureX, textureY); // Box 773
        gunModel[664] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 774
        gunModel[665] = new ModelRendererTurbo(this, 921, 201, textureX, textureY); // Box 775
        gunModel[666] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Box 776
        gunModel[667] = new ModelRendererTurbo(this, 937, 201, textureX, textureY); // Box 777
        gunModel[668] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 778
        gunModel[669] = new ModelRendererTurbo(this, 953, 201, textureX, textureY); // Box 779
        gunModel[670] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 780
        gunModel[671] = new ModelRendererTurbo(this, 969, 201, textureX, textureY); // Box 781
        gunModel[672] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 782
        gunModel[673] = new ModelRendererTurbo(this, 985, 201, textureX, textureY); // Box 783
        gunModel[674] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 784
        gunModel[675] = new ModelRendererTurbo(this, 1001, 201, textureX, textureY); // Box 785
        gunModel[676] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Box 786
        gunModel[677] = new ModelRendererTurbo(this, 1017, 201, textureX, textureY); // Box 787
        gunModel[678] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 788
        gunModel[679] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 789
        gunModel[680] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 790
        gunModel[681] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 791
        gunModel[682] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 792
        gunModel[683] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 794
        gunModel[684] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 795
        gunModel[685] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 796
        gunModel[686] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 797
        gunModel[687] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 798
        gunModel[688] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 799
        gunModel[689] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 800
        gunModel[690] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 802
        gunModel[691] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 803
        gunModel[692] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 805
        gunModel[693] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 806
        gunModel[694] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 807
        gunModel[695] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 808
        gunModel[696] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 809
        gunModel[697] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 810
        gunModel[698] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 811
        gunModel[699] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 812
        gunModel[700] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 813
        gunModel[701] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 814
        gunModel[702] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Box 815
        gunModel[703] = new ModelRendererTurbo(this, 537, 209, textureX, textureY); // Box 816
        gunModel[704] = new ModelRendererTurbo(this, 705, 209, textureX, textureY); // Box 817
        gunModel[705] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 819
        gunModel[706] = new ModelRendererTurbo(this, 721, 209, textureX, textureY); // Box 820
        gunModel[707] = new ModelRendererTurbo(this, 729, 209, textureX, textureY); // Box 821
        gunModel[708] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 822
        gunModel[709] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Box 823
        gunModel[710] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 825
        gunModel[711] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 826
        gunModel[712] = new ModelRendererTurbo(this, 769, 209, textureX, textureY); // Box 827
        gunModel[713] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 828
        gunModel[714] = new ModelRendererTurbo(this, 785, 209, textureX, textureY); // Box 829
        gunModel[715] = new ModelRendererTurbo(this, 793, 209, textureX, textureY); // Box 830
        gunModel[716] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Box 831
        gunModel[717] = new ModelRendererTurbo(this, 809, 209, textureX, textureY); // Box 832
        gunModel[718] = new ModelRendererTurbo(this, 817, 209, textureX, textureY); // Box 833
        gunModel[719] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 834
        gunModel[720] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Box 835
        gunModel[721] = new ModelRendererTurbo(this, 841, 209, textureX, textureY); // Box 836
        gunModel[722] = new ModelRendererTurbo(this, 849, 209, textureX, textureY); // Box 837
        gunModel[723] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Box 838
        gunModel[724] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 814
        gunModel[725] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 815
        gunModel[726] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 816
        gunModel[727] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 817
        gunModel[728] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 818
        gunModel[729] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 819
        gunModel[730] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 820
        gunModel[731] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 822
        gunModel[732] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 823
        gunModel[733] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Box 824
        gunModel[734] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 825
        gunModel[735] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 826
        gunModel[736] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 827
        gunModel[737] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 828
        gunModel[738] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 829
        gunModel[739] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 830
        gunModel[740] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 831
        gunModel[741] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 832
        gunModel[742] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 833
        gunModel[743] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 834
        gunModel[744] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 835
        gunModel[745] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 836
        gunModel[746] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 837
        gunModel[747] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 838
        gunModel[748] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 839
        gunModel[749] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 840
        gunModel[750] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 841
        gunModel[751] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 842
        gunModel[752] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 843
        gunModel[753] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 844
        gunModel[754] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 845
        gunModel[755] = new ModelRendererTurbo(this, 513, 209, textureX, textureY); // Box 846
        gunModel[756] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 847
        gunModel[757] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 848
        gunModel[758] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 849
        gunModel[759] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 850
        gunModel[760] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 851
        gunModel[761] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 852
        gunModel[762] = new ModelRendererTurbo(this, 521, 217, textureX, textureY); // Box 853
        gunModel[763] = new ModelRendererTurbo(this, 529, 217, textureX, textureY); // Box 854
        gunModel[764] = new ModelRendererTurbo(this, 537, 217, textureX, textureY); // Box 855
        gunModel[765] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 856
        gunModel[766] = new ModelRendererTurbo(this, 545, 217, textureX, textureY); // Box 857
        gunModel[767] = new ModelRendererTurbo(this, 553, 217, textureX, textureY); // Box 858
        gunModel[768] = new ModelRendererTurbo(this, 561, 217, textureX, textureY); // Box 859
        gunModel[769] = new ModelRendererTurbo(this, 569, 217, textureX, textureY); // Box 860
        gunModel[770] = new ModelRendererTurbo(this, 569, 217, textureX, textureY); // Box 861
        gunModel[771] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 909
        gunModel[772] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Box 910
        gunModel[773] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Box 911
        gunModel[774] = new ModelRendererTurbo(this, 905, 233, textureX, textureY); // Box 912
        gunModel[775] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 913
        gunModel[776] = new ModelRendererTurbo(this, 953, 233, textureX, textureY); // Box 914
        gunModel[777] = new ModelRendererTurbo(this, 977, 233, textureX, textureY); // Box 915
        gunModel[778] = new ModelRendererTurbo(this, 801, 241, textureX, textureY); // Box 916
        gunModel[779] = new ModelRendererTurbo(this, 825, 241, textureX, textureY); // Box 918
        gunModel[780] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 941
        gunModel[781] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 943
        gunModel[782] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 944
        gunModel[783] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 945
        gunModel[784] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 946
        gunModel[785] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 947
        gunModel[786] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 959
        gunModel[787] = new ModelRendererTurbo(this, 729, 257, textureX, textureY); // Box 960
        gunModel[788] = new ModelRendererTurbo(this, 769, 257, textureX, textureY); // Box 961
        gunModel[789] = new ModelRendererTurbo(this, 809, 257, textureX, textureY); // Box 962
        gunModel[790] = new ModelRendererTurbo(this, 849, 257, textureX, textureY); // Box 963
        gunModel[791] = new ModelRendererTurbo(this, 745, 217, textureX, textureY); // Box 965
        gunModel[792] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 966
        gunModel[793] = new ModelRendererTurbo(this, 1009, 217, textureX, textureY); // Box 967
        gunModel[794] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 968
        gunModel[795] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 969
        gunModel[796] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 970
        gunModel[797] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 971
        gunModel[798] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 972
        gunModel[799] = new ModelRendererTurbo(this, 553, 225, textureX, textureY); // Box 973
        gunModel[800] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 974
        gunModel[801] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 975
        gunModel[802] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 976
        gunModel[803] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 977
        gunModel[804] = new ModelRendererTurbo(this, 921, 233, textureX, textureY); // Box 978
        gunModel[805] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 979
        gunModel[806] = new ModelRendererTurbo(this, 945, 233, textureX, textureY); // Box 980
        gunModel[807] = new ModelRendererTurbo(this, 953, 233, textureX, textureY); // Box 981
        gunModel[808] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Box 982
        gunModel[809] = new ModelRendererTurbo(this, 977, 233, textureX, textureY); // Box 983
        gunModel[810] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 984
        gunModel[811] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 986
        gunModel[812] = new ModelRendererTurbo(this, 15, 317, textureX, textureY); // Box 937
        gunModel[813] = new ModelRendererTurbo(this, 15, 317, textureX, textureY); // Box 938

        gunModel[500].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, -1.25F, -2.75F, 0.25F, -1.25F, -2.75F, 0.25F, 1.25F, 2.25F, 0.25F, 1.25F); // Box 600
        gunModel[500].setRotationPoint(137.5F, -60F, 5F);

        gunModel[501].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 601
        gunModel[501].setRotationPoint(135F, -55F, 6F);

        gunModel[502].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 602
        gunModel[502].setRotationPoint(129.5F, -55F, 6F);

        gunModel[503].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, -1.25F, -2.75F, 0.25F, -1.25F, -2.75F, 0.25F, 1.25F, 2.25F, 0.25F, 1.25F); // Box 603
        gunModel[503].setRotationPoint(132F, -60F, 5F);

        gunModel[504].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 604
        gunModel[504].setRotationPoint(124F, -55F, 6F);

        gunModel[505].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, -1.25F, -2.75F, 0.25F, -1.25F, -2.75F, 0.25F, 1.25F, 2.25F, 0.25F, 1.25F); // Box 605
        gunModel[505].setRotationPoint(126.5F, -60F, 5F);

        gunModel[506].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 606
        gunModel[506].setRotationPoint(118.5F, -55F, 6F);

        gunModel[507].addShapeBox(-32F, 0F, 0F, 2, 5, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 2.25F, 0.25F, -1.25F, -2.75F, 0.25F, -1.25F, -2.75F, 0.25F, 1.25F, 2.25F, 0.25F, 1.25F); // Box 607
        gunModel[507].setRotationPoint(121F, -60F, 5F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 51, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 608
        gunModel[508].setRotationPoint(126F, -66F, -4F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
        gunModel[509].setRotationPoint(128F, -67F, -4F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
        gunModel[510].setRotationPoint(132F, -67F, -4F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
        gunModel[511].setRotationPoint(136F, -67F, -4F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
        gunModel[512].setRotationPoint(140F, -67F, -4F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
        gunModel[513].setRotationPoint(144F, -67F, -4F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
        gunModel[514].setRotationPoint(148F, -67F, -4F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
        gunModel[515].setRotationPoint(152F, -67F, -4F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
        gunModel[516].setRotationPoint(156F, -67F, -4F);

        gunModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
        gunModel[517].setRotationPoint(160F, -67F, -4F);

        gunModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
        gunModel[518].setRotationPoint(164F, -67F, -4F);

        gunModel[519].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
        gunModel[519].setRotationPoint(168F, -67F, -4F);

        gunModel[520].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
        gunModel[520].setRotationPoint(172F, -67F, -4F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
        gunModel[521].setRotationPoint(175F, -67F, -4F);

        gunModel[522].addShapeBox(-32F, 0F, 0F, 51, 1, 1, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 622
        gunModel[522].setRotationPoint(158F, -54F, -7F);

        gunModel[523].addShapeBox(-32F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 623
        gunModel[523].setRotationPoint(158F, -55F, -7F);

        gunModel[524].addShapeBox(-32F, 0F, 0F, 46, 1, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 624
        gunModel[524].setRotationPoint(163F, -55F, -7F);

        gunModel[525].addShapeBox(-32F, 0F, 0F, 4, 5, 1, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, -0.25F, 0F, -1.25F); // Box 626
        gunModel[525].setRotationPoint(158F, -60F, -6F);

        gunModel[526].addShapeBox(-32F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.5F, 1.75F, -1.5F, -0.5F, 1.75F, 1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 627
        gunModel[526].setRotationPoint(158F, -60.5F, -6F);

        gunModel[527].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 1.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Box 628
        gunModel[527].setRotationPoint(163F, -62.5F, -5F);

        gunModel[528].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 629
        gunModel[528].setRotationPoint(163F, -60F, -6F);

        gunModel[529].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, 0F, 0F, -0.75F); // Box 630
        gunModel[529].setRotationPoint(164F, -62.5F, -5F);

        gunModel[530].addShapeBox(-32F, 0F, 0F, 44, 1, 1, 0F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 631
        gunModel[530].setRotationPoint(165F, -62.5F, -5F);

        gunModel[531].addShapeBox(-32F, 0F, 0F, 51, 1, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Box 632
        gunModel[531].setRotationPoint(158F, -54F, 6F);

        gunModel[532].addShapeBox(-32F, 0F, 0F, 46, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 633
        gunModel[532].setRotationPoint(163F, -55F, 6F);

        gunModel[533].addShapeBox(-32F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 634
        gunModel[533].setRotationPoint(158F, -55F, 6F);

        gunModel[534].addShapeBox(-32F, 0F, 0F, 4, 5, 1, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -0.25F, 0F, 1.25F); // Box 635
        gunModel[534].setRotationPoint(158F, -60F, 5F);

        gunModel[535].addShapeBox(-32F, 0F, 0F, 1, 5, 1, 0F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 636
        gunModel[535].setRotationPoint(163F, -60F, 5F);

        gunModel[536].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 1.5F, -0.25F, -0.5F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 637
        gunModel[536].setRotationPoint(163F, -62.5F, 4F);

        gunModel[537].addShapeBox(-32F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0F, 0.25F, -0.5F, 1.75F, 1F, -0.5F, 1.75F, -1.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, -0.25F, 0F, 0F); // Box 638
        gunModel[537].setRotationPoint(158F, -60.5F, 5F);

        gunModel[538].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.75F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, 0F, 0F, 0.25F); // Box 639
        gunModel[538].setRotationPoint(164F, -62.5F, 4F);

        gunModel[539].addShapeBox(-32F, 0F, 0F, 44, 1, 1, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 640
        gunModel[539].setRotationPoint(165F, -62.5F, 4F);

        gunModel[540].addShapeBox(-32F, 0F, 0F, 47, 1, 1, 0F, 0.5F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 641
        gunModel[540].setRotationPoint(162F, -62.5F, -5F);

        gunModel[541].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Box 642
        gunModel[541].setRotationPoint(162F, -63.5F, -4F);

        gunModel[542].addShapeBox(-32F, 0F, 0F, 51, 1, 1, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F); // Box 644
        gunModel[542].setRotationPoint(158F, -64.5F, -3F);

        gunModel[543].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 645
        gunModel[543].setRotationPoint(169F, -63.5F, -4F);

        gunModel[544].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 646
        gunModel[544].setRotationPoint(169F, -63.5F, -4F);

        gunModel[545].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 647
        gunModel[545].setRotationPoint(176.5F, -63.5F, -4F);

        gunModel[546].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 648
        gunModel[546].setRotationPoint(176.5F, -63.5F, -4F);

        gunModel[547].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 649
        gunModel[547].setRotationPoint(184F, -63.5F, -4F);

        gunModel[548].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 650
        gunModel[548].setRotationPoint(184F, -63.5F, -4F);

        gunModel[549].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 651
        gunModel[549].setRotationPoint(191F, -63.5F, -4F);

        gunModel[550].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 652
        gunModel[550].setRotationPoint(191F, -63.5F, -4F);

        gunModel[551].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 653
        gunModel[551].setRotationPoint(199F, -63.5F, -4F);

        gunModel[552].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 654
        gunModel[552].setRotationPoint(199F, -63.5F, -4F);

        gunModel[553].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 655
        gunModel[553].setRotationPoint(207F, -63.5F, -4F);

        gunModel[554].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 656
        gunModel[554].setRotationPoint(207F, -63.5F, -4F);

        gunModel[555].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 657
        gunModel[555].setRotationPoint(207F, -63.5F, 3F);

        gunModel[556].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 658
        gunModel[556].setRotationPoint(207F, -63.5F, 3F);

        gunModel[557].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 659
        gunModel[557].setRotationPoint(199F, -63.5F, 3F);

        gunModel[558].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 660
        gunModel[558].setRotationPoint(199F, -63.5F, 3F);

        gunModel[559].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 661
        gunModel[559].setRotationPoint(191F, -63.5F, 3F);

        gunModel[560].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 662
        gunModel[560].setRotationPoint(191F, -63.5F, 3F);

        gunModel[561].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 663
        gunModel[561].setRotationPoint(176.5F, -63.5F, 3F);

        gunModel[562].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 664
        gunModel[562].setRotationPoint(176.5F, -63.5F, 3F);

        gunModel[563].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 665
        gunModel[563].setRotationPoint(169F, -63.5F, 3F);

        gunModel[564].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 666
        gunModel[564].setRotationPoint(169F, -63.5F, 3F);

        gunModel[565].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 667
        gunModel[565].setRotationPoint(184F, -63.5F, 3F);

        gunModel[566].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 668
        gunModel[566].setRotationPoint(184F, -63.5F, 3F);

        gunModel[567].addShapeBox(-32F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -1F, 0.5F, 0.5F, -1F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 669
        gunModel[567].setRotationPoint(158F, -63.5F, 3F);

        gunModel[568].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 670
        gunModel[568].setRotationPoint(162F, -63.5F, 3F);

        gunModel[569].addShapeBox(-32F, 0F, 0F, 47, 1, 1, 0F, 0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F); // Box 671
        gunModel[569].setRotationPoint(162F, -62.5F, 4F);

        gunModel[570].addShapeBox(-32F, 0F, 0F, 51, 1, 1, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 672
        gunModel[570].setRotationPoint(158F, -64.5F, 2F);

        gunModel[571].addShapeBox(-32F, 0F, 0F, 6, 1, 1, 0F, 0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 675
        gunModel[571].setRotationPoint(158F, -63.5F, -4F);

        gunModel[572].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.4F); // Box 676
        gunModel[572].setRotationPoint(169.5F, -61.5F, -5F);

        gunModel[573].addShapeBox(-32F, 0F, 0F, 42, 1, 1, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 677
        gunModel[573].setRotationPoint(166.5F, -58.5F, -6F);

        gunModel[574].addShapeBox(-32F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F); // Box 678
        gunModel[574].setRotationPoint(166.5F, -58F, -6F);

        gunModel[575].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F); // Box 679
        gunModel[575].setRotationPoint(180.25F, -61.5F, -5F);

        gunModel[576].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F); // Box 680
        gunModel[576].setRotationPoint(180.25F, -58F, -6F);

        gunModel[577].addShapeBox(-32F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 683
        gunModel[577].setRotationPoint(166.5F, -61.5F, -5F);

        gunModel[578].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.65F, -1.25F, -0.25F, -0.65F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 684
        gunModel[578].setRotationPoint(169.5F, -59.5F, -6F);

        gunModel[579].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, -0.65F, 0.25F, -0.25F, -0.65F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 685
        gunModel[579].setRotationPoint(178.75F, -59.5F, -6F);

        gunModel[580].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F); // Box 686
        gunModel[580].setRotationPoint(178.75F, -61.5F, -5F);

        gunModel[581].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.63F, -1.25F, -0.25F, -0.63F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 687
        gunModel[581].setRotationPoint(169.5F, -55.75F, -7F);

        gunModel[582].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.38F); // Box 688
        gunModel[582].setRotationPoint(169.5F, -58F, -6F);

        gunModel[583].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, -0.63F, 0.25F, -0.25F, -0.63F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 689
        gunModel[583].setRotationPoint(178.75F, -55.75F, -7F);

        gunModel[584].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.38F); // Box 690
        gunModel[584].setRotationPoint(178.75F, -58F, -6F);

        gunModel[585].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.38F); // Box 691
        gunModel[585].setRotationPoint(182.75F, -58F, -6F);

        gunModel[586].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.63F, -1.25F, -0.25F, -0.63F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 692
        gunModel[586].setRotationPoint(182.75F, -55.75F, -7F);

        gunModel[587].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.65F, -1.25F, -0.25F, -0.65F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 693
        gunModel[587].setRotationPoint(182.75F, -59.5F, -6F);

        gunModel[588].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.4F); // Box 694
        gunModel[588].setRotationPoint(182.75F, -61.5F, -5F);

        gunModel[589].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F); // Box 695
        gunModel[589].setRotationPoint(194.75F, -61.5F, -5F);

        gunModel[590].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F); // Box 696
        gunModel[590].setRotationPoint(194.75F, -58F, -6F);

        gunModel[591].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, -0.65F, 0.25F, -0.25F, -0.65F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 697
        gunModel[591].setRotationPoint(193.25F, -59.5F, -6F);

        gunModel[592].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F); // Box 698
        gunModel[592].setRotationPoint(193.25F, -61.5F, -5F);

        gunModel[593].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.4F); // Box 699
        gunModel[593].setRotationPoint(197.25F, -61.5F, -5F);

        gunModel[594].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.65F, -1.25F, -0.25F, -0.65F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 700
        gunModel[594].setRotationPoint(197.25F, -59.5F, -6F);

        gunModel[595].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.38F); // Box 701
        gunModel[595].setRotationPoint(197.25F, -58F, -6F);

        gunModel[596].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.38F); // Box 702
        gunModel[596].setRotationPoint(193.25F, -58F, -6F);

        gunModel[597].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, -0.63F, 0.25F, -0.25F, -0.63F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 703
        gunModel[597].setRotationPoint(193.25F, -55.75F, -7F);

        gunModel[598].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.63F, -1.25F, -0.25F, -0.63F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 704
        gunModel[598].setRotationPoint(197.25F, -55.75F, -7F);

        gunModel[599].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, -1F, -0.5F, -0.25F, -1F); // Box 705
        gunModel[599].setRotationPoint(206.75F, -61.5F, -5F);

        gunModel[600].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 706
        gunModel[600].setRotationPoint(206.75F, -58F, -6F);

        gunModel[601].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, -0.65F, 0.25F, -0.25F, -0.65F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 707
        gunModel[601].setRotationPoint(206F, -59.5F, -6F);

        gunModel[602].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F); // Box 708
        gunModel[602].setRotationPoint(206F, -61.5F, -5F);

        gunModel[603].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.38F); // Box 712
        gunModel[603].setRotationPoint(206F, -58F, -6F);

        gunModel[604].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, -0.63F, 0.25F, -0.25F, -0.63F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 713
        gunModel[604].setRotationPoint(206F, -55.75F, -7F);

        gunModel[605].addShapeBox(-32F, 0F, 0F, 42, 1, 1, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 715
        gunModel[605].setRotationPoint(166.5F, -58.5F, 5F);

        gunModel[606].addShapeBox(-32F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 716
        gunModel[606].setRotationPoint(166.5F, -61.5F, 4F);

        gunModel[607].addShapeBox(-32F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 717
        gunModel[607].setRotationPoint(166.5F, -58F, 5F);

        gunModel[608].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F); // Box 718
        gunModel[608].setRotationPoint(180.25F, -61.5F, 4F);

        gunModel[609].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 719
        gunModel[609].setRotationPoint(180.25F, -58F, 5F);

        gunModel[610].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F); // Box 720
        gunModel[610].setRotationPoint(194.75F, -61.5F, 4F);

        gunModel[611].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 721
        gunModel[611].setRotationPoint(194.75F, -58F, 5F);

        gunModel[612].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // Box 722
        gunModel[612].setRotationPoint(206.75F, -61.5F, 4F);

        gunModel[613].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 723
        gunModel[613].setRotationPoint(206.75F, -58F, 5F);

        gunModel[614].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -1.25F, -0.25F, -0.65F, 0.25F, -0.25F, -0.65F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Box 724
        gunModel[614].setRotationPoint(169.5F, -59.5F, 5F);

        gunModel[615].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F); // Box 725
        gunModel[615].setRotationPoint(169.5F, -61.5F, 4F);

        gunModel[616].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -1.25F, -0.25F, -0.63F, 0.25F, -0.25F, -0.63F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Box 726
        gunModel[616].setRotationPoint(169.5F, -55.75F, 6F);

        gunModel[617].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.12F); // Box 727
        gunModel[617].setRotationPoint(169.5F, -58F, 5F);

        gunModel[618].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.65F, -1.25F, -0.25F, -0.65F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 728
        gunModel[618].setRotationPoint(178.75F, -59.5F, 5F);

        gunModel[619].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F); // Box 729
        gunModel[619].setRotationPoint(178.75F, -61.5F, 4F);

        gunModel[620].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.12F); // Box 730
        gunModel[620].setRotationPoint(178.75F, -58F, 5F);

        gunModel[621].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.63F, -1.25F, -0.25F, -0.63F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 731
        gunModel[621].setRotationPoint(178.75F, -55.75F, 6F);

        gunModel[622].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -1.25F, -0.25F, -0.63F, 0.25F, -0.25F, -0.63F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Box 732
        gunModel[622].setRotationPoint(182.75F, -55.75F, 6F);

        gunModel[623].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.12F); // Box 733
        gunModel[623].setRotationPoint(182.75F, -58F, 5F);

        gunModel[624].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -1.25F, -0.25F, -0.65F, 0.25F, -0.25F, -0.65F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Box 734
        gunModel[624].setRotationPoint(182.75F, -59.5F, 5F);

        gunModel[625].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F); // Box 735
        gunModel[625].setRotationPoint(182.75F, -61.5F, 4F);

        gunModel[626].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F); // Box 736
        gunModel[626].setRotationPoint(193.25F, -61.5F, 4F);

        gunModel[627].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.65F, -1.25F, -0.25F, -0.65F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 737
        gunModel[627].setRotationPoint(193.25F, -59.5F, 5F);

        gunModel[628].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.12F); // Box 738
        gunModel[628].setRotationPoint(193.25F, -58F, 5F);

        gunModel[629].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.63F, -1.25F, -0.25F, -0.63F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 739
        gunModel[629].setRotationPoint(193.25F, -55.75F, 6F);

        gunModel[630].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -1.25F, -0.25F, -0.63F, 0.25F, -0.25F, -0.63F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Box 740
        gunModel[630].setRotationPoint(197.25F, -55.75F, 6F);

        gunModel[631].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.38F, -1.25F, -0.25F, -0.12F, 0.25F, -0.25F, -0.12F); // Box 741
        gunModel[631].setRotationPoint(197.25F, -58F, 5F);

        gunModel[632].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0.15F, -1.25F, -0.25F, 0.15F, -1.25F, -0.25F, -0.65F, 0.25F, -0.25F, -0.65F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Box 742
        gunModel[632].setRotationPoint(197.25F, -59.5F, 5F);

        gunModel[633].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.4F, -1.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F); // Box 743
        gunModel[633].setRotationPoint(197.25F, -61.5F, 4F);

        gunModel[634].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.4F, 0.25F, -0.25F, -0.1F, -1.25F, -0.25F, -0.1F); // Box 744
        gunModel[634].setRotationPoint(206F, -61.5F, 4F);

        gunModel[635].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.65F, -1.25F, -0.25F, -0.65F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 745
        gunModel[635].setRotationPoint(206F, -59.5F, 5F);

        gunModel[636].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.38F, 0.25F, -0.25F, -0.12F, -1.25F, -0.25F, -0.12F); // Box 746
        gunModel[636].setRotationPoint(206F, -58F, 5F);

        gunModel[637].addShapeBox(-32F, 0F, 0F, 1, 1, 1, 0F, -1.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, -0.63F, -1.25F, -0.25F, -0.63F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 747
        gunModel[637].setRotationPoint(206F, -55.75F, 6F);

        gunModel[638].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 748
        gunModel[638].setRotationPoint(122F, -52F, -7F);

        gunModel[639].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 0.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 749
        gunModel[639].setRotationPoint(122F, -53F, -7F);

        gunModel[640].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Box 750
        gunModel[640].setRotationPoint(122F, -50F, -7F);

        gunModel[641].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 751
        gunModel[641].setRotationPoint(136F, -52F, -7F);

        gunModel[642].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Box 752
        gunModel[642].setRotationPoint(136F, -50F, -7F);

        gunModel[643].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 0.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 753
        gunModel[643].setRotationPoint(136F, -53F, -7F);

        gunModel[644].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 754
        gunModel[644].setRotationPoint(150F, -52F, -7F);

        gunModel[645].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Box 755
        gunModel[645].setRotationPoint(150F, -50F, -7F);

        gunModel[646].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 0.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 756
        gunModel[646].setRotationPoint(150F, -53F, -7F);

        gunModel[647].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 757
        gunModel[647].setRotationPoint(165F, -52F, -7F);

        gunModel[648].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Box 758
        gunModel[648].setRotationPoint(165F, -50F, -7F);

        gunModel[649].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 0.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 759
        gunModel[649].setRotationPoint(165F, -53F, -7F);

        gunModel[650].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 760
        gunModel[650].setRotationPoint(180F, -52F, -7F);

        gunModel[651].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Box 761
        gunModel[651].setRotationPoint(180F, -50F, -7F);

        gunModel[652].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 0.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 762
        gunModel[652].setRotationPoint(180F, -53F, -7F);

        gunModel[653].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 763
        gunModel[653].setRotationPoint(194F, -52F, -7F);

        gunModel[654].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Box 764
        gunModel[654].setRotationPoint(194F, -50F, -7F);

        gunModel[655].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 0.5F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 765
        gunModel[655].setRotationPoint(194F, -53F, -7F);

        gunModel[656].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 766
        gunModel[656].setRotationPoint(207F, -52F, -7F);

        gunModel[657].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 767
        gunModel[657].setRotationPoint(207F, -50F, -7F);

        gunModel[658].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 768
        gunModel[658].setRotationPoint(207F, -53F, -7F);

        gunModel[659].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 769
        gunModel[659].setRotationPoint(136F, -52F, 6F);

        gunModel[660].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.25F, 1F, -0.25F, 0.25F); // Box 770
        gunModel[660].setRotationPoint(122F, -50F, 6F);

        gunModel[661].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 771
        gunModel[661].setRotationPoint(122F, -52F, 6F);

        gunModel[662].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0.5F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F); // Box 772
        gunModel[662].setRotationPoint(122F, -53F, 6F);

        gunModel[663].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.25F, 1F, -0.25F, 0.25F); // Box 773
        gunModel[663].setRotationPoint(136F, -50F, 6F);

        gunModel[664].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0.5F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F); // Box 774
        gunModel[664].setRotationPoint(136F, -53F, 6F);

        gunModel[665].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 775
        gunModel[665].setRotationPoint(150F, -52F, 6F);

        gunModel[666].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0.5F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F); // Box 776
        gunModel[666].setRotationPoint(150F, -53F, 6F);

        gunModel[667].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.25F, 1F, -0.25F, 0.25F); // Box 777
        gunModel[667].setRotationPoint(150F, -50F, 6F);

        gunModel[668].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.25F, 1F, -0.25F, 0.25F); // Box 778
        gunModel[668].setRotationPoint(165F, -50F, 6F);

        gunModel[669].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 779
        gunModel[669].setRotationPoint(165F, -52F, 6F);

        gunModel[670].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0.5F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F); // Box 780
        gunModel[670].setRotationPoint(165F, -53F, 6F);

        gunModel[671].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0.5F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F); // Box 781
        gunModel[671].setRotationPoint(180F, -53F, 6F);

        gunModel[672].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 782
        gunModel[672].setRotationPoint(180F, -52F, 6F);

        gunModel[673].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.25F, 1F, -0.25F, 0.25F); // Box 783
        gunModel[673].setRotationPoint(180F, -50F, 6F);

        gunModel[674].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0.5F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F); // Box 784
        gunModel[674].setRotationPoint(194F, -53F, 6F);

        gunModel[675].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 785
        gunModel[675].setRotationPoint(194F, -52F, 6F);

        gunModel[676].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, 0.25F, 1F, -0.25F, 0.25F); // Box 786
        gunModel[676].setRotationPoint(194F, -50F, 6F);

        gunModel[677].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 787
        gunModel[677].setRotationPoint(207F, -53F, 6F);

        gunModel[678].addShapeBox(-32F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 788
        gunModel[678].setRotationPoint(207F, -52F, 6F);

        gunModel[679].addShapeBox(-32F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F); // Box 789
        gunModel[679].setRotationPoint(207F, -50F, 6F);

        gunModel[680].addShapeBox(-32F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, 1.25F, 0.75F, 0F, 1.25F, 0.75F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 790
        gunModel[680].setRotationPoint(111F, -41F, -3.5F);

        gunModel[681].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1.75F, 0F, -2.25F, -1.25F, 0F, -2.25F, -1.25F, 0F, 2.75F, 1.75F, 0F, 2.75F); // Box 791
        gunModel[681].setRotationPoint(115F, -44F, -7F);

        gunModel[682].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -1.5F, -0.25F, 0.25F, 2F, -0.25F, 0.25F, 2F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 792
        gunModel[682].setRotationPoint(115F, -48F, -7F);

        gunModel[683].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -1.5F, -0.25F, 0.25F, 2F, -0.25F, 0.25F, 2F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 794
        gunModel[683].setRotationPoint(119.5F, -48F, -7F);

        gunModel[684].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1.75F, 0F, -2.25F, -1.25F, 0F, -2.25F, -1.25F, 0F, 2.75F, 1.75F, 0F, 2.75F); // Box 795
        gunModel[684].setRotationPoint(119.5F, -44F, -7F);

        gunModel[685].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -1.25F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 796
        gunModel[685].setRotationPoint(119.5F, -48F, 6F);

        gunModel[686].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1.75F, 0F, 2.75F, -1.25F, 0F, 2.75F, -1.25F, 0F, -2.25F, 1.75F, 0F, -2.25F); // Box 797
        gunModel[686].setRotationPoint(119.5F, -44F, 6F);

        gunModel[687].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -1.25F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 798
        gunModel[687].setRotationPoint(115F, -48F, 6F);

        gunModel[688].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1.75F, 0F, 2.75F, -1.25F, 0F, 2.75F, -1.25F, 0F, -2.25F, 1.75F, 0F, -2.25F); // Box 799
        gunModel[688].setRotationPoint(115F, -44F, 6F);

        gunModel[689].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1.75F, 0F, -2.25F, -1.25F, 0F, -2.25F, -1.25F, 0F, 2.75F, 1.75F, 0F, 2.75F); // Box 800
        gunModel[689].setRotationPoint(124F, -44F, -7F);

        gunModel[690].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -1.5F, -0.25F, 0.25F, 2F, -0.25F, 0.25F, 2F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 802
        gunModel[690].setRotationPoint(124F, -48F, -7F);

        gunModel[691].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 803
        gunModel[691].setRotationPoint(128F, -47F, -7F);

        gunModel[692].addShapeBox(-32F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 805
        gunModel[692].setRotationPoint(128F, -44F, -4F);

        gunModel[693].addShapeBox(-32F, 0F, 0F, 77, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 806
        gunModel[693].setRotationPoint(132F, -44F, -4F);

        gunModel[694].addShapeBox(-32F, 0F, 0F, 77, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 807
        gunModel[694].setRotationPoint(132F, -44F, 1F);

        gunModel[695].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1.75F, 0F, 2.75F, -1.25F, 0F, 2.75F, -1.25F, 0F, -2.25F, 1.75F, 0F, -2.25F); // Box 808
        gunModel[695].setRotationPoint(124F, -44F, 6F);

        gunModel[696].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -1.25F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 809
        gunModel[696].setRotationPoint(124F, -48F, 6F);

        gunModel[697].addShapeBox(-32F, 0F, 0F, 2, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 810
        gunModel[697].setRotationPoint(137F, -44F, -1.5F);

        gunModel[698].addShapeBox(-32F, 0F, 0F, 2, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 811
        gunModel[698].setRotationPoint(150F, -44F, -1.5F);

        gunModel[699].addShapeBox(-32F, 0F, 0F, 2, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 812
        gunModel[699].setRotationPoint(164F, -44F, -1.5F);

        gunModel[700].addShapeBox(-32F, 0F, 0F, 5, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 813
        gunModel[700].setRotationPoint(177F, -44F, -1.5F);

        gunModel[701].addShapeBox(-32F, 0F, 0F, 2, 1, 3, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 814
        gunModel[701].setRotationPoint(193.5F, -44F, -1.5F);

        gunModel[702].addShapeBox(-32F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 815
        gunModel[702].setRotationPoint(206.5F, -44F, -1.5F);

        gunModel[703].addShapeBox(-32F, 0F, 0F, 81, 1, 1, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 816
        gunModel[703].setRotationPoint(128F, -48F, -7F);

        gunModel[704].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -2F, 0F, -2.75F, 3F, 0F, -2.75F, 3F, 0F, 3F, -2F, 0F, 3F); // Box 817
        gunModel[704].setRotationPoint(134F, -47F, -7F);

        gunModel[705].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -2F, 0F, -2.75F, 3F, 0F, -2.75F, 3F, 0F, 3F, -2F, 0F, 3F); // Box 819
        gunModel[705].setRotationPoint(141F, -47F, -7F);

        gunModel[706].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -2F, 0F, -2.75F, 3F, 0F, -2.75F, 3F, 0F, 3F, -2F, 0F, 3F); // Box 820
        gunModel[706].setRotationPoint(149F, -47F, -7F);

        gunModel[707].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -2F, 0F, -2.75F, 3F, 0F, -2.75F, 3F, 0F, 3F, -2F, 0F, 3F); // Box 821
        gunModel[707].setRotationPoint(157F, -47F, -7F);

        gunModel[708].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -2F, 0F, -2.75F, 3F, 0F, -2.75F, 3F, 0F, 3F, -2F, 0F, 3F); // Box 822
        gunModel[708].setRotationPoint(165F, -47F, -7F);

        gunModel[709].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -2F, 0F, -2.75F, 3F, 0F, -2.75F, 3F, 0F, 3F, -2F, 0F, 3F); // Box 823
        gunModel[709].setRotationPoint(173F, -47F, -7F);

        gunModel[710].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 825
        gunModel[710].setRotationPoint(180F, -47F, -7F);

        gunModel[711].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, 3F, 0.25F, 0F, 3F); // Box 826
        gunModel[711].setRotationPoint(194F, -47F, -7F);

        gunModel[712].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 3F, 0.25F, 0F, 3F); // Box 827
        gunModel[712].setRotationPoint(207F, -47F, -7F);

        gunModel[713].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.75F, 0.25F, 0F, -2.75F); // Box 828
        gunModel[713].setRotationPoint(207F, -47F, 6F);

        gunModel[714].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 3F, 0.25F, 0F, 3F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F); // Box 829
        gunModel[714].setRotationPoint(194F, -47F, 6F);

        gunModel[715].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 830
        gunModel[715].setRotationPoint(180F, -47F, 6F);

        gunModel[716].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -2F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 831
        gunModel[716].setRotationPoint(173F, -47F, 6F);

        gunModel[717].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -2F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 832
        gunModel[717].setRotationPoint(165F, -47F, 6F);

        gunModel[718].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -2F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 833
        gunModel[718].setRotationPoint(157F, -47F, 6F);

        gunModel[719].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -2F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 834
        gunModel[719].setRotationPoint(149F, -47F, 6F);

        gunModel[720].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -2F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 835
        gunModel[720].setRotationPoint(141F, -47F, 6F);

        gunModel[721].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -2F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 836
        gunModel[721].setRotationPoint(134F, -47F, 6F);

        gunModel[722].addShapeBox(-32F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 837
        gunModel[722].setRotationPoint(128F, -47F, 6F);

        gunModel[723].addShapeBox(-32F, 0F, 0F, 81, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 838
        gunModel[723].setRotationPoint(128F, -48F, 6F);

        gunModel[724].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -2F, -0.25F, 0.25F, 2F, -0.25F, 0.25F, 2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0F, 0.25F, 2F, 0F, -2.75F, 2F, 0F, 3F, -0.25F, 0F, 0.25F); // Box 814
        gunModel[724].setRotationPoint(125F, -48F, -7F);

        gunModel[725].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0.25F, 2F, 0F, -2.75F, 2F, 0F, 3F, -0.25F, 0F, 0.25F, 1.25F, 0F, -2.25F, -2.25F, 0F, -2.25F, -2.25F, 0F, 2.75F, 1.25F, 0F, 2.75F); // Box 815
        gunModel[725].setRotationPoint(125F, -44F, -7F);

        gunModel[726].addShapeBox(-32F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0.25F, 2F, 0F, 3F, 2F, 0F, -2.75F, -0.25F, 0F, 0.25F, 1.25F, 0F, 2.75F, -2.25F, 0F, 2.75F, -2.25F, 0F, -2.25F, 1.25F, 0F, -2.25F); // Box 816
        gunModel[726].setRotationPoint(125F, -44F, 6F);

        gunModel[727].addShapeBox(-32F, 0F, 0F, 1, 4, 1, 0F, -2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, 2F, 0F, 3F, 2F, 0F, -2.75F, -0.25F, 0F, 0.25F); // Box 817
        gunModel[727].setRotationPoint(125F, -48F, 6F);

        gunModel[728].addShapeBox(-32F, 0F, 0F, 4, 1, 7, 0F, 0.25F, 0F, 1.25F, 0F, 3F, 0.75F, 0F, 3F, 0.75F, 0.25F, 0F, 1.25F, 1F, 0F, 0.25F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0.25F); // Box 818
        gunModel[728].setRotationPoint(124F, -41F, -3.5F);

        gunModel[729].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 819
        gunModel[729].setRotationPoint(-7F, -65F, -3F);

        gunModel[730].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 820
        gunModel[730].setRotationPoint(-7F, -64F, -3F);

        gunModel[731].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 822
        gunModel[731].setRotationPoint(-2F, -65F, -3F);

        gunModel[732].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F); // Box 823
        gunModel[732].setRotationPoint(-7F, -65F, 3F);

        gunModel[733].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F); // Box 824
        gunModel[733].setRotationPoint(-4F, -65F, 5F);

        gunModel[734].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F); // Box 825
        gunModel[734].setRotationPoint(-4F, -64F, 5F);

        gunModel[735].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F); // Box 826
        gunModel[735].setRotationPoint(-7F, -64F, 3F);

        gunModel[736].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 827
        gunModel[736].setRotationPoint(-7F, -65F, -3F);

        gunModel[737].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, -1.25F, -0.75F, 0.25F); // Box 828
        gunModel[737].setRotationPoint(-7F, -65F, 3F);

        gunModel[738].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Box 829
        gunModel[738].setRotationPoint(-4F, -65F, 5F);

        gunModel[739].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F); // Box 830
        gunModel[739].setRotationPoint(-4F, -64F, 5F);

        gunModel[740].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, -1.25F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F); // Box 831
        gunModel[740].setRotationPoint(-7F, -64F, 3F);

        gunModel[741].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -1.25F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -1.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 832
        gunModel[741].setRotationPoint(-4F, -64F, -7F);

        gunModel[742].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -1.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 833
        gunModel[742].setRotationPoint(-7F, -64F, -5F);

        gunModel[743].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -1.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 834
        gunModel[743].setRotationPoint(-7F, -64F, -5F);

        gunModel[744].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -1.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -1.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 835
        gunModel[744].setRotationPoint(-4F, -64F, -7F);

        gunModel[745].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -1.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.25F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 836
        gunModel[745].setRotationPoint(-4F, -65F, -7F);

        gunModel[746].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F, -1.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 837
        gunModel[746].setRotationPoint(-4F, -65F, -7F);

        gunModel[747].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 838
        gunModel[747].setRotationPoint(-7F, -65F, -5F);

        gunModel[748].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, -1.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 839
        gunModel[748].setRotationPoint(-7F, -65F, -5F);

        gunModel[749].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 840
        gunModel[749].setRotationPoint(-7F, -65F, 2F);

        gunModel[750].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 841
        gunModel[750].setRotationPoint(-7F, -65F, -2F);

        gunModel[751].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 842
        gunModel[751].setRotationPoint(-7F, -64F, -1F);

        gunModel[752].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 843
        gunModel[752].setRotationPoint(-4F, -64F, 2F);

        gunModel[753].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 844
        gunModel[753].setRotationPoint(-4F, -64F, -3F);

        gunModel[754].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 845
        gunModel[754].setRotationPoint(-3F, -64F, 1F);

        gunModel[755].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 846
        gunModel[755].setRotationPoint(-3F, -64F, -2F);

        gunModel[756].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, -2.75F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0.25F); // Box 847
        gunModel[756].setRotationPoint(-6.5F, -64F, 3F);

        gunModel[757].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, -0.5F, 0F, 0.15F, 1.75F, 0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -0.6F, -0.5F, 0F, -0.6F, 1.75F); // Box 848
        gunModel[757].setRotationPoint(-3.5F, -64F, 3F);

        gunModel[758].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.15F, 1.75F, 0F, 0.15F, -0.5F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, -0.6F, 1.75F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F); // Box 849
        gunModel[758].setRotationPoint(-3.5F, -64F, -4F);

        gunModel[759].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -2.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -2.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 850
        gunModel[759].setRotationPoint(-6.5F, -64F, -8F);

        gunModel[760].addShapeBox(0F, 0F, 1F, 1, 2, 2, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 851
        gunModel[760].setRotationPoint(-3.5F, -65F, 5F);
        gunModel[760].rotateAngleY = -0.13962634F;

        gunModel[761].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.25F, -0.75F, -0.15F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.4F, -0.5F, -0.75F, -0.15F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 852
        gunModel[761].setRotationPoint(-3.5F, -65F, 5F);
        gunModel[761].rotateAngleY = -0.13962634F;

        gunModel[762].addShapeBox(0F, 0F, 3F, 1, 2, 1, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 853
        gunModel[762].setRotationPoint(-3.5F, -65F, 5F);
        gunModel[762].rotateAngleY = -0.13962634F;

        gunModel[763].addShapeBox(-1F, 0F, 3F, 1, 2, 1, 0F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 854
        gunModel[763].setRotationPoint(-3.5F, -65F, 5F);
        gunModel[763].rotateAngleY = -0.13962634F;

        gunModel[764].addShapeBox(-1F, 0F, 3F, 1, 2, 1, 0F, 0F, -0.25F, -0.4F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.15F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.15F); // Box 855
        gunModel[764].setRotationPoint(-3.5F, -65F, 5F);
        gunModel[764].rotateAngleY = -0.13962634F;

        gunModel[765].addShapeBox(0F, 0F, -3F, 1, 2, 2, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 856
        gunModel[765].setRotationPoint(-3.5F, -65F, -5F);
        gunModel[765].rotateAngleY = 0.13962634F;

        gunModel[766].addShapeBox(0F, 0F, -1F, 1, 2, 1, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, -0.25F, -0.75F, -0.4F, -0.25F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, -0.5F, -0.75F, -0.4F, -0.5F, -0.75F); // Box 857
        gunModel[766].setRotationPoint(-3.5F, -65F, -5F);
        gunModel[766].rotateAngleY = 0.13962634F;

        gunModel[767].addShapeBox(0F, 0F, -4F, 1, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 858
        gunModel[767].setRotationPoint(-3.5F, -65F, -5F);
        gunModel[767].rotateAngleY = 0.13962634F;

        gunModel[768].addShapeBox(-1F, 0F, -4F, 1, 2, 1, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 859
        gunModel[768].setRotationPoint(-3.5F, -65F, -5F);
        gunModel[768].rotateAngleY = 0.13962634F;

        gunModel[769].addShapeBox(-1F, 0F, -4F, 1, 2, 1, 0F, 0F, -0.25F, -0.15F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.4F, 0F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.4F); // Box 860
        gunModel[769].setRotationPoint(-3.5F, -65F, -5F);
        gunModel[769].rotateAngleY = 0.13962634F;

        gunModel[770].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 861
        gunModel[770].setRotationPoint(-3.5F, -65F, -3F);

        gunModel[771].addShapeBox(0F, 0F, 0F, 110, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
        gunModel[771].setRotationPoint(86F, -55F, -3F);

        gunModel[772].addShapeBox(0F, 0F, 0F, 110, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
        gunModel[772].setRotationPoint(86F, -53F, -3F);

        gunModel[773].addShapeBox(0F, 0F, 0F, 110, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 911
        gunModel[773].setRotationPoint(86F, -51F, -3F);

        gunModel[774].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 912
        gunModel[774].setRotationPoint(86F, -56F, -3.5F);

        gunModel[775].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 913
        gunModel[775].setRotationPoint(86F, -51F, -3.5F);

        gunModel[776].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 914
        gunModel[776].setRotationPoint(86F, -53F, -4F);

        gunModel[777].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F); // Box 915
        gunModel[777].setRotationPoint(89F, -56F, -3.5F);

        gunModel[778].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F); // Box 916
        gunModel[778].setRotationPoint(89F, -53F, -4F);

        gunModel[779].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, -2F); // Box 918
        gunModel[779].setRotationPoint(89F, -51F, -3.5F);

        gunModel[780].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 941
        gunModel[780].setRotationPoint(160F, -62F, -2F);

        gunModel[781].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 943
        gunModel[781].setRotationPoint(160F, -63F, -2F);

        gunModel[782].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 944
        gunModel[782].setRotationPoint(160F, -60F, -2F);

        gunModel[783].addShapeBox(0F, 0F, 0F, 91, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 945
        gunModel[783].setRotationPoint(86F, -61.5F, -1.5F);

        gunModel[784].addShapeBox(0F, 0F, 0F, 91, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
        gunModel[784].setRotationPoint(86F, -62.5F, -1.5F);

        gunModel[785].addShapeBox(0F, 0F, 0F, 91, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 947
        gunModel[785].setRotationPoint(86F, -60.5F, -1.5F);

        gunModel[786].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
        gunModel[786].setRotationPoint(161F, -61F, -3F);

        gunModel[787].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
        gunModel[787].setRotationPoint(161F, -59F, -3F);

        gunModel[788].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 961
        gunModel[788].setRotationPoint(161F, -57F, -4F);

        gunModel[789].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
        gunModel[789].setRotationPoint(161F, -55F, -4F);

        gunModel[790].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 963
        gunModel[790].setRotationPoint(161F, -49F, -4F);

        gunModel[791].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
        gunModel[791].setRotationPoint(177F, -63.5F, -1F);

        gunModel[792].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 966
        gunModel[792].setRotationPoint(177F, -62.5F, -2F);

        gunModel[793].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
        gunModel[793].setRotationPoint(177F, -59.5F, -1F);

        gunModel[794].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
        gunModel[794].setRotationPoint(177F, -64.5F, -1F);

        gunModel[795].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 969
        gunModel[795].setRotationPoint(177F, -58.5F, -1F);

        gunModel[796].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
        gunModel[796].setRotationPoint(177F, -62.5F, 1F);

        gunModel[797].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 971
        gunModel[797].setRotationPoint(177F, -62.5F, 0F);

        gunModel[798].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 972
        gunModel[798].setRotationPoint(177F, -62.5F, 0F);

        gunModel[799].addShapeBox(0F, 2F, -1F, 4, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 973
        gunModel[799].setRotationPoint(177F, -62.5F, 0F);

        gunModel[800].addShapeBox(0F, 2F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
        gunModel[800].setRotationPoint(177F, -62.5F, 0F);

        gunModel[801].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 975
        gunModel[801].setRotationPoint(178F, -62F, -2.1F);

        gunModel[802].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 976
        gunModel[802].setRotationPoint(178F, -61F, -2.1F);

        gunModel[803].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
        gunModel[803].setRotationPoint(178F, -61.5F, -2.1F);

        gunModel[804].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 978
        gunModel[804].setRotationPoint(178F, -61F, 1.1F);

        gunModel[805].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
        gunModel[805].setRotationPoint(178F, -61.5F, 1.1F);

        gunModel[806].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 980
        gunModel[806].setRotationPoint(178F, -62F, 1.1F);

        gunModel[807].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0.28F, 0F, 0F, 0.28F, 0F, 0F, -0.45F, -1F, 0F, -0.45F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 981
        gunModel[807].setRotationPoint(156F, -56.5F, 6.25F);

        gunModel[808].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.28F, -1F, 0F, 0.28F, -1F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 982
        gunModel[808].setRotationPoint(152.25F, -56.5F, 6.25F);

        gunModel[809].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.38F, 0F, 0F, 0.38F); // Box 983
        gunModel[809].setRotationPoint(152.25F, -60F, 5F);

        gunModel[810].addShapeBox(-32F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.38F, -1F, 0F, 0.38F); // Box 984
        gunModel[810].setRotationPoint(156F, -60F, 5F);

        gunModel[811].addShapeBox(-32F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 986
        gunModel[811].setRotationPoint(109F, -55F, 6F);

        gunModel[812].addShapeBox(0F, 0F, 0F, 32, 32, 1, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F); // Box 937
        gunModel[812].setRotationPoint(36F, -47F, -6.3F);

        gunModel[813].addShapeBox(0F, 0F, 0F, 32, 32, 1, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F); // Box 938
        gunModel[813].setRotationPoint(36F, -47F, 5.3F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 849, 241, textureX, textureY); // Box 919
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 873, 241, textureX, textureY); // Box 920
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 993, 241, textureX, textureY); // Box 921
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 922
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 905, 217, textureX, textureY); // Box 923
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 924
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 985, 217, textureX, textureY); // Box 925
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 585, 217, textureX, textureY); // Box 926
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 927
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 665, 217, textureX, textureY); // Box 928
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 889, 249, textureX, textureY); // Box 930
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 931
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Box 948
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 569, 233, textureX, textureY); // Box 949
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 953
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 954
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 955
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 905, 249, textureX, textureY); // Box 956
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 929, 249, textureX, textureY); // Box 957
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 945, 249, textureX, textureY); // Box 958

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 919
        defaultBarrelModel[0].setRotationPoint(196F, -53.5F, -3.5F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 920
        defaultBarrelModel[1].setRotationPoint(196F, -50.5F, -3.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
        defaultBarrelModel[2].setRotationPoint(196F, -55.5F, -3.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
        defaultBarrelModel[3].setRotationPoint(199F, -56F, -4F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
        defaultBarrelModel[4].setRotationPoint(199F, -54F, -4F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 924
        defaultBarrelModel[5].setRotationPoint(199F, -50F, -4F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
        defaultBarrelModel[6].setRotationPoint(199F, -54F, 2F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 926
        defaultBarrelModel[7].setRotationPoint(205F, -54F, 2F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 927
        defaultBarrelModel[8].setRotationPoint(205F, -56F, -4F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
        defaultBarrelModel[9].setRotationPoint(205F, -54F, -4F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, -2F); // Box 930
        defaultBarrelModel[10].setRotationPoint(205F, -50F, -4F);

        defaultBarrelModel[11].addShapeBox(0F, -3.5F, -2F, 8, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F); // Box 931
        defaultBarrelModel[11].setRotationPoint(207F, -52F, 0F);

        defaultBarrelModel[12].addShapeBox(0F, -3.5F, -2F, 8, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, 0F, 0.5F, -0.25F); // Box 948
        defaultBarrelModel[12].setRotationPoint(207F, -52F, 0F);

        defaultBarrelModel[13].addShapeBox(0F, -3.5F, 1F, 8, 1, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, 0.5F, 0F); // Box 949
        defaultBarrelModel[13].setRotationPoint(207F, -52F, 0F);

        defaultBarrelModel[14].addShapeBox(0F, -3.5F, -2F, 8, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, 0F, 0.5F, -0.25F); // Box 953
        defaultBarrelModel[14].setRotationPoint(207F, -52F, 0F);
        defaultBarrelModel[14].rotateAngleX = 2.0943951F;

        defaultBarrelModel[15].addShapeBox(0F, -3.5F, 1F, 8, 1, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, 0.5F, 0F); // Box 954
        defaultBarrelModel[15].setRotationPoint(207F, -52F, 0F);
        defaultBarrelModel[15].rotateAngleX = 2.0943951F;

        defaultBarrelModel[16].addShapeBox(0F, -3.5F, -2F, 8, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F); // Box 955
        defaultBarrelModel[16].setRotationPoint(207F, -52F, 0F);
        defaultBarrelModel[16].rotateAngleX = 2.0943951F;

        defaultBarrelModel[17].addShapeBox(0F, -3.5F, -2F, 8, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, 0F, 0.5F, -0.25F); // Box 956
        defaultBarrelModel[17].setRotationPoint(207F, -52F, 0F);
        defaultBarrelModel[17].rotateAngleX = 4.1887902F;

        defaultBarrelModel[18].addShapeBox(0F, -3.5F, 1F, 8, 1, 1, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, 0.5F, 0F); // Box 957
        defaultBarrelModel[18].setRotationPoint(207F, -52F, 0F);
        defaultBarrelModel[18].rotateAngleX = 4.1887902F;

        defaultBarrelModel[19].addShapeBox(0F, -3.5F, -2F, 8, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F); // Box 958
        defaultBarrelModel[19].setRotationPoint(207F, -52F, 0F);
        defaultBarrelModel[19].rotateAngleX = 4.1887902F;
    }

    private void initdefaultStockModel_1() {
        defaultStockModel[0] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 435
        defaultStockModel[1] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 436
        defaultStockModel[2] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 437
        defaultStockModel[3] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 438
        defaultStockModel[4] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 439
        defaultStockModel[5] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 440
        defaultStockModel[6] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 441
        defaultStockModel[7] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 442
        defaultStockModel[8] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 445
        defaultStockModel[9] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 446
        defaultStockModel[10] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 447
        defaultStockModel[11] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 448
        defaultStockModel[12] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 449
        defaultStockModel[13] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 450
        defaultStockModel[14] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 451
        defaultStockModel[15] = new ModelRendererTurbo(this, 761, 137, textureX, textureY); // Box 452
        defaultStockModel[16] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 453
        defaultStockModel[17] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 454
        defaultStockModel[18] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 455
        defaultStockModel[19] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 456
        defaultStockModel[20] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 457
        defaultStockModel[21] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 458
        defaultStockModel[22] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 459
        defaultStockModel[23] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Box 460
        defaultStockModel[24] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 461
        defaultStockModel[25] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 462
        defaultStockModel[26] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 463
        defaultStockModel[27] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 464
        defaultStockModel[28] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 465
        defaultStockModel[29] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 466
        defaultStockModel[30] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 467
        defaultStockModel[31] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 468
        defaultStockModel[32] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 469
        defaultStockModel[33] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 470
        defaultStockModel[34] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 471
        defaultStockModel[35] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 472
        defaultStockModel[36] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 474
        defaultStockModel[37] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 475
        defaultStockModel[38] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 476
        defaultStockModel[39] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 477
        defaultStockModel[40] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 478
        defaultStockModel[41] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 479
        defaultStockModel[42] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 480
        defaultStockModel[43] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 481
        defaultStockModel[44] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 482
        defaultStockModel[45] = new ModelRendererTurbo(this, 841, 153, textureX, textureY); // Box 483
        defaultStockModel[46] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 484
        defaultStockModel[47] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 485
        defaultStockModel[48] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 487
        defaultStockModel[49] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 488
        defaultStockModel[50] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 489
        defaultStockModel[51] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 490
        defaultStockModel[52] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 491
        defaultStockModel[53] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 492
        defaultStockModel[54] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 493
        defaultStockModel[55] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 494
        defaultStockModel[56] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 495
        defaultStockModel[57] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 496
        defaultStockModel[58] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 497
        defaultStockModel[59] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 498
        defaultStockModel[60] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 499
        defaultStockModel[61] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 500
        defaultStockModel[62] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 502
        defaultStockModel[63] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 503
        defaultStockModel[64] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 504
        defaultStockModel[65] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 505
        defaultStockModel[66] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Box 506
        defaultStockModel[67] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 508
        defaultStockModel[68] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 509
        defaultStockModel[69] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 510
        defaultStockModel[70] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 511
        defaultStockModel[71] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 512
        defaultStockModel[72] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 513
        defaultStockModel[73] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 514
        defaultStockModel[74] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 515
        defaultStockModel[75] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 516
        defaultStockModel[76] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 517
        defaultStockModel[77] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 518
        defaultStockModel[78] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 519
        defaultStockModel[79] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Box 520
        defaultStockModel[80] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 985

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 43, 3, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 435
        defaultStockModel[0].setRotationPoint(-77F, -56.5F, -5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 43, 2, 10, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 436
        defaultStockModel[1].setRotationPoint(-77F, -58.5F, -5F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 43, 1, 8, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 437
        defaultStockModel[2].setRotationPoint(-77F, -59.5F, -4F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 43, 2, 10, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 438
        defaultStockModel[3].setRotationPoint(-77F, -53.5F, -5F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 43, 1, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F); // Box 439
        defaultStockModel[4].setRotationPoint(-77F, -51.5F, -4F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F); // Box 440
        defaultStockModel[5].setRotationPoint(-34F, -56.5F, -5F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F, 0F, 0F, -1.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, 0.25F, 0F); // Box 441
        defaultStockModel[6].setRotationPoint(-34F, -58.5F, -5F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 442
        defaultStockModel[7].setRotationPoint(-34F, -59.5F, -4F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, 0.25F, 0F, 0F, 0F, -1.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.25F); // Box 445
        defaultStockModel[8].setRotationPoint(-34F, -53.5F, -5F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0.5F, -2.5F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -2.5F); // Box 446
        defaultStockModel[9].setRotationPoint(-34F, -51.5F, -4F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 447
        defaultStockModel[10].setRotationPoint(-27F, -59.5F, -1F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 57, 2, 10, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
        defaultStockModel[11].setRotationPoint(-92F, -60.5F, -5F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 57, 2, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 449
        defaultStockModel[12].setRotationPoint(-92F, -58.5F, -6F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 57, 2, 12, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 450
        defaultStockModel[13].setRotationPoint(-92F, -56.5F, -6F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 57, 2, 7, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 0F, -5F, 0F, 0F); // Box 451
        defaultStockModel[14].setRotationPoint(-92F, -54.5F, -7F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 57, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 1F, -5F, 0F, 1F); // Box 452
        defaultStockModel[15].setRotationPoint(-92F, -54.5F, 0F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 45, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
        defaultStockModel[16].setRotationPoint(-87F, -52.5F, -8F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 45, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
        defaultStockModel[17].setRotationPoint(-87F, -52.5F, 0F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 57, 1, 7, 0F, -5F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 455
        defaultStockModel[18].setRotationPoint(-92F, -49.5F, -7F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 57, 1, 7, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F); // Box 456
        defaultStockModel[19].setRotationPoint(-92F, -49.5F, 0F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.75F); // Box 457
        defaultStockModel[20].setRotationPoint(-92F, -52.5F, -8F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 57, 1, 14, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.5F); // Box 458
        defaultStockModel[21].setRotationPoint(-92F, -48.5F, -7F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F, 0F, 0F, 0F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Box 459
        defaultStockModel[22].setRotationPoint(-42F, -52.5F, -8F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 57, 1, 12, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.75F); // Box 460
        defaultStockModel[23].setRotationPoint(-92F, -47.5F, -6F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
        defaultStockModel[24].setRotationPoint(-92F, -46.5F, -1.5F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 41, 9, 3, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F); // Box 462
        defaultStockModel[25].setRotationPoint(-80F, -46.5F, -1.5F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 2, 11, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
        defaultStockModel[26].setRotationPoint(-92F, -43.5F, -1.5F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 464
        defaultStockModel[27].setRotationPoint(-87F, -43.5F, -1.5F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 7, 10, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 465
        defaultStockModel[28].setRotationPoint(-87F, -36.5F, -1.5F);

        defaultStockModel[29].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
        defaultStockModel[29].setRotationPoint(-92F, -32.5F, -1.5F);

        defaultStockModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 467
        defaultStockModel[30].setRotationPoint(-92F, -26.5F, -1.5F);

        defaultStockModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 468
        defaultStockModel[31].setRotationPoint(-90F, -43.5F, -1.5F);

        defaultStockModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 469
        defaultStockModel[32].setRotationPoint(-88F, -43.5F, -1.5F);

        defaultStockModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
        defaultStockModel[33].setRotationPoint(-88F, -33.5F, -1.5F);

        defaultStockModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
        defaultStockModel[34].setRotationPoint(-90F, -33.5F, -1.5F);

        defaultStockModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 472
        defaultStockModel[35].setRotationPoint(-90F, -25.5F, -3F);

        defaultStockModel[36].addShapeBox(0F, 0F, 0F, 2, 12, 6, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F); // Box 474
        defaultStockModel[36].setRotationPoint(-87F, -37.5F, -3F);

        defaultStockModel[37].addShapeBox(0F, 0F, 0F, 39, 1, 6, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 475
        defaultStockModel[37].setRotationPoint(-78F, -38.5F, -3F);

        defaultStockModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
        defaultStockModel[38].setRotationPoint(-80F, -38.5F, -3F);

        defaultStockModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F); // Box 477
        defaultStockModel[39].setRotationPoint(-39F, -44.5F, -3F);

        defaultStockModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
        defaultStockModel[40].setRotationPoint(-39F, -46.5F, -3F);

        defaultStockModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
        defaultStockModel[41].setRotationPoint(-93F, -60.5F, -5F);

        defaultStockModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 480
        defaultStockModel[42].setRotationPoint(-93F, -58.5F, -6F);

        defaultStockModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 481
        defaultStockModel[43].setRotationPoint(-93F, -56.5F, -6F);

        defaultStockModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 15, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 482
        defaultStockModel[44].setRotationPoint(-93F, -54.5F, -7.5F);

        defaultStockModel[45].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, 0F, -1.75F, -1F, 0F, -1.75F); // Box 483
        defaultStockModel[45].setRotationPoint(-93F, -48.5F, -7.5F);

        defaultStockModel[46].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 484
        defaultStockModel[46].setRotationPoint(-92F, -30.5F, -5.5F);

        defaultStockModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 485
        defaultStockModel[47].setRotationPoint(-91F, -24.5F, -3.5F);

        defaultStockModel[48].addShapeBox(0F, 0F, 0F, 2, 18, 15, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, 0F, -1.75F, -1F, 0F, -1.75F); // Box 487
        defaultStockModel[48].setRotationPoint(-95F, -48.5F, -7.5F);

        defaultStockModel[49].addShapeBox(0F, 0F, 0F, 2, 6, 15, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 488
        defaultStockModel[49].setRotationPoint(-95F, -54.5F, -7.5F);

        defaultStockModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 489
        defaultStockModel[50].setRotationPoint(-95F, -56.5F, -6F);

        defaultStockModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
        defaultStockModel[51].setRotationPoint(-95F, -60.5F, -5F);

        defaultStockModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 491
        defaultStockModel[52].setRotationPoint(-95F, -58.5F, -6F);

        defaultStockModel[53].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 492
        defaultStockModel[53].setRotationPoint(-94F, -30.5F, -5.5F);

        defaultStockModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 493
        defaultStockModel[54].setRotationPoint(-93F, -24.5F, -3.5F);

        defaultStockModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 15, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 494
        defaultStockModel[55].setRotationPoint(-96F, -54.5F, -7.5F);

        defaultStockModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F); // Box 495
        defaultStockModel[56].setRotationPoint(-96F, -56.5F, -6F);

        defaultStockModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 496
        defaultStockModel[57].setRotationPoint(-96F, -58.5F, -6F);

        defaultStockModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, 0F, -2.75F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 497
        defaultStockModel[58].setRotationPoint(-96F, -60.5F, -5F);

        defaultStockModel[59].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -1F, 0F, -2.25F, 1F, 0F, -1.75F, 1F, 0F, -1.75F, -1F, 0F, -2.25F); // Box 498
        defaultStockModel[59].setRotationPoint(-96F, -48.5F, -7.5F);

        defaultStockModel[60].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -1F, -0.5F, -2F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, -0.5F, -2F); // Box 499
        defaultStockModel[60].setRotationPoint(-95F, -30.5F, -5.5F);

        defaultStockModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2F); // Box 500
        defaultStockModel[61].setRotationPoint(-94F, -24.5F, -3.5F);

        defaultStockModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 502
        defaultStockModel[62].setRotationPoint(-57.5F, -40F, -0.5F);

        defaultStockModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Box 503
        defaultStockModel[63].setRotationPoint(-57.5F, -40F, 0.5F);

        defaultStockModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 504
        defaultStockModel[64].setRotationPoint(-57.5F, -40F, -1.5F);

        defaultStockModel[65].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
        defaultStockModel[65].setRotationPoint(-59F, -46.5F, -1F);

        defaultStockModel[66].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F, -2F, 0F, -0.05F, -2F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.05F, -2F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
        defaultStockModel[66].setRotationPoint(-59F, -46.5F, -3F);

        defaultStockModel[67].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.05F, -2F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.05F, -2F, 0F, -0.05F); // Box 508
        defaultStockModel[67].setRotationPoint(-59F, -46.5F, 1F);

        defaultStockModel[68].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
        defaultStockModel[68].setRotationPoint(-65F, -47.5F, -4.5F);

        defaultStockModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -1F); // Box 510
        defaultStockModel[69].setRotationPoint(-64F, -44.5F, -4.5F);

        defaultStockModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F); // Box 511
        defaultStockModel[70].setRotationPoint(-70F, -44.5F, -4.5F);

        defaultStockModel[71].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 512
        defaultStockModel[71].setRotationPoint(-70F, -46.5F, -4.5F);

        defaultStockModel[72].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 513
        defaultStockModel[72].setRotationPoint(-81F, -46.5F, -4.5F);

        defaultStockModel[73].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 514
        defaultStockModel[73].setRotationPoint(-81F, -44.5F, -4.5F);

        defaultStockModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -1.75F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 1.25F, 0F); // Box 515
        defaultStockModel[74].setRotationPoint(-81F, -44.5F, -5.5F);

        defaultStockModel[75].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, 0F, -0.5F, 0F); // Box 516
        defaultStockModel[75].setRotationPoint(-70F, -44.5F, 2.5F);

        defaultStockModel[76].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
        defaultStockModel[76].setRotationPoint(-70F, -46.5F, 2.5F);

        defaultStockModel[77].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 518
        defaultStockModel[77].setRotationPoint(-81F, -46.5F, 3.5F);

        defaultStockModel[78].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 519
        defaultStockModel[78].setRotationPoint(-81F, -44.5F, 3.5F);

        defaultStockModel[79].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -1.75F, 0.25F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, 1F, 0.25F); // Box 520
        defaultStockModel[79].setRotationPoint(-81F, -44.5F, 4.5F);

        defaultStockModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 985
        defaultStockModel[80].setRotationPoint(-36F, -50.5F, -1.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 593, 217, textureX, textureY); // Box 861
        ammoModel[1] = new ModelRendererTurbo(this, 673, 217, textureX, textureY); // Box 863
        ammoModel[2] = new ModelRendererTurbo(this, 753, 217, textureX, textureY); // Box 884
        ammoModel[3] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 885
        ammoModel[4] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 894
        ammoModel[5] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 895
        ammoModel[6] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 896
        ammoModel[7] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 897
        ammoModel[8] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 898
        ammoModel[9] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 899
        ammoModel[10] = new ModelRendererTurbo(this, 993, 217, textureX, textureY); // Box 900
        ammoModel[11] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 901
        ammoModel[12] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 902
        ammoModel[13] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 903
        ammoModel[14] = new ModelRendererTurbo(this, 537, 225, textureX, textureY); // Box 904
        ammoModel[15] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 905
        ammoModel[16] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 906
        ammoModel[17] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 908

        ammoModel[0].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 861
        ammoModel[0].setRotationPoint(38.5F, -34F, -4F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 863
        ammoModel[1].setRotationPoint(38.5F, -22F, -4F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F); // Box 884
        ammoModel[2].setRotationPoint(39.5F, -10F, -4F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 2.75F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, -2.75F, 2.75F, 0F); // Box 885
        ammoModel[3].setRotationPoint(40.5F, 2F, -4F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 28, 3, 9, 0F, -0.25F, 0F, 0F, 0.25F, 7.25F, 0F, 0.25F, 7.25F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -2.25F, 0F, 0.5F, -2.25F, 0F, -0.375F, 0F, 0F); // Box 894
        ammoModel[4].setRotationPoint(38.5F, -19F, -4.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 29, 3, 9, 0F, -0.8F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -0.8F, -0.25F, 0F, -1.1F, 0.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1.1F, 0.25F, 0F); // Box 895
        ammoModel[5].setRotationPoint(38.5F, -8F, -4.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 29, 3, 9, 0F, -0.6F, -0.5F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.6F, -0.5F, 0F, -1.1F, 0.5F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -1.1F, 0.5F, 0F); // Box 896
        ammoModel[6].setRotationPoint(40F, 3F, -4.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 29, 3, 9, 0F, -0.5F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -1F, 0F, 0F); // Box 897
        ammoModel[7].setRotationPoint(41.5F, 15F, -4.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 29, 1, 9, 0F, -0.5F, 0F, -0.25F, -0.25F, 4.75F, -0.25F, -0.25F, 4.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F); // Box 898
        ammoModel[8].setRotationPoint(41.5F, 14F, -4.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 29, 1, 9, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.5F, 4.5F, -0.5F); // Box 899
        ammoModel[9].setRotationPoint(42.5F, 13F, -4.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F); // Box 900
        ammoModel[10].setRotationPoint(59.5F, -18F, -4.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F); // Box 901
        ammoModel[11].setRotationPoint(46.5F, -17F, -4.5F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0.5F, -0.25F, -0.1F, -0.75F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F); // Box 902
        ammoModel[12].setRotationPoint(60.7F, -7F, -4.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0.5F, -0.25F, -0.1F, -0.75F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, 0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, 0.25F, -0.1F); // Box 903
        ammoModel[13].setRotationPoint(47.7F, -6F, -4.5F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 3, 7, 9, 0F, 0.75F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, 0.75F, -0.25F, -0.1F, -0.5F, 0.25F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 0.25F, -0.1F); // Box 904
        ammoModel[14].setRotationPoint(62.25F, 4F, -4.5F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 905
        ammoModel[15].setRotationPoint(38.5F, -22F, -1F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 906
        ammoModel[16].setRotationPoint(39.5F, -10F, -1F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 2.75F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, -2.25F, 2.75F, 0F); // Box 908
        ammoModel[17].setRotationPoint(40.5F, 2F, -1F);

        extraAmmoModel[0] = new ModelRendererTurbo(this, 593, 217, textureX, textureY); // Box 861
        extraAmmoModel[1] = new ModelRendererTurbo(this, 673, 217, textureX, textureY); // Box 863
        extraAmmoModel[2] = new ModelRendererTurbo(this, 753, 217, textureX, textureY); // Box 884
        extraAmmoModel[3] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 885
        extraAmmoModel[4] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 894
        extraAmmoModel[5] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 895
        extraAmmoModel[6] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 896
        extraAmmoModel[7] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 897
        extraAmmoModel[8] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 898
        extraAmmoModel[9] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 899
        extraAmmoModel[10] = new ModelRendererTurbo(this, 993, 217, textureX, textureY); // Box 900
        extraAmmoModel[11] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 901
        extraAmmoModel[12] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 902
        extraAmmoModel[13] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 903
        extraAmmoModel[14] = new ModelRendererTurbo(this, 537, 225, textureX, textureY); // Box 904
        extraAmmoModel[15] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 905
        extraAmmoModel[16] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 906
        extraAmmoModel[17] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 908

        extraAmmoModel[0].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 861
        extraAmmoModel[0].setRotationPoint(38.5F, -34F, -4F);

        extraAmmoModel[1].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 863
        extraAmmoModel[1].setRotationPoint(38.5F, -22F, -4F);

        extraAmmoModel[2].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F); // Box 884
        extraAmmoModel[2].setRotationPoint(39.5F, -10F, -4F);

        extraAmmoModel[3].addShapeBox(0F, 0F, 0F, 28, 12, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 2.75F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, -2.75F, 2.75F, 0F); // Box 885
        extraAmmoModel[3].setRotationPoint(40.5F, 2F, -4F);

        extraAmmoModel[4].addShapeBox(0F, 0F, 0F, 28, 3, 9, 0F, -0.25F, 0F, 0F, 0.25F, 7.25F, 0F, 0.25F, 7.25F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -2.25F, 0F, 0.5F, -2.25F, 0F, -0.375F, 0F, 0F); // Box 894
        extraAmmoModel[4].setRotationPoint(38.5F, -19F, -4.5F);

        extraAmmoModel[5].addShapeBox(0F, 0F, 0F, 29, 3, 9, 0F, -0.8F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -0.8F, -0.25F, 0F, -1.1F, 0.25F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1.1F, 0.25F, 0F); // Box 895
        extraAmmoModel[5].setRotationPoint(38.5F, -8F, -4.5F);

        extraAmmoModel[6].addShapeBox(0F, 0F, 0F, 29, 3, 9, 0F, -0.6F, -0.5F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.6F, -0.5F, 0F, -1.1F, 0.5F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -1.1F, 0.5F, 0F); // Box 896
        extraAmmoModel[6].setRotationPoint(40F, 3F, -4.5F);

        extraAmmoModel[7].addShapeBox(0F, 0F, 0F, 29, 3, 9, 0F, -0.5F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -1F, 0F, 0F); // Box 897
        extraAmmoModel[7].setRotationPoint(41.5F, 15F, -4.5F);

        extraAmmoModel[8].addShapeBox(0F, 0F, 0F, 29, 1, 9, 0F, -0.5F, 0F, -0.25F, -0.25F, 4.75F, -0.25F, -0.25F, 4.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F); // Box 898
        extraAmmoModel[8].setRotationPoint(41.5F, 14F, -4.5F);

        extraAmmoModel[9].addShapeBox(0F, 0F, 0F, 29, 1, 9, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.5F, 4.5F, -0.5F); // Box 899
        extraAmmoModel[9].setRotationPoint(42.5F, 13F, -4.5F);

        extraAmmoModel[10].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F); // Box 900
        extraAmmoModel[10].setRotationPoint(59.5F, -18F, -4.5F);

        extraAmmoModel[11].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F); // Box 901
        extraAmmoModel[11].setRotationPoint(46.5F, -17F, -4.5F);

        extraAmmoModel[12].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0.5F, -0.25F, -0.1F, -0.75F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F); // Box 902
        extraAmmoModel[12].setRotationPoint(60.7F, -7F, -4.5F);

        extraAmmoModel[13].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0.5F, -0.25F, -0.1F, -0.75F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, 0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -0.5F, 0.25F, -0.1F); // Box 903
        extraAmmoModel[13].setRotationPoint(47.7F, -6F, -4.5F);

        extraAmmoModel[14].addShapeBox(0F, 0F, 0F, 3, 7, 9, 0F, 0.75F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, 0.75F, -0.25F, -0.1F, -0.5F, 0.25F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 0.25F, -0.1F); // Box 904
        extraAmmoModel[14].setRotationPoint(62.25F, 4F, -4.5F);

        extraAmmoModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 905
        extraAmmoModel[15].setRotationPoint(38.5F, -22F, -1F);

        extraAmmoModel[16].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 906
        extraAmmoModel[16].setRotationPoint(39.5F, -10F, -1F);

        extraAmmoModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 2.75F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, 0F, -2.25F, 2.75F, 0F); // Box 908
        extraAmmoModel[17].setRotationPoint(40.5F, 2F, -1F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 378
        slideModel[1] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 379
        slideModel[2] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 380
        slideModel[3] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 381
        slideModel[4] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 382
        slideModel[5] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 384

        slideModel[0].addShapeBox(0F, 0F, 0F, 33, 3, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 378
        slideModel[0].setRotationPoint(34F, -50.5F, -2.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 33, 3, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
        slideModel[1].setRotationPoint(34F, -53.5F, -2.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 33, 3, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 380
        slideModel[2].setRotationPoint(34F, -56.5F, -2.5F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 17, 5, 2, 0F, 0F, -1.125F, 0.25F, 0F, -1.125F, 0.25F, 1.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 1.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381
        slideModel[3].setRotationPoint(33F, -55F, -4F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F, 0F, -1.125F, 0.25F, 0F, -1.125F, 0.25F, 0F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, 1.5F, 0F, 1.5F, 1.5F, 0F); // Box 382
        slideModel[4].setRotationPoint(61F, -55F, -4F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 33, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 384
        slideModel[5].setRotationPoint(34F, -49.5F, -5.5F);
    }
}