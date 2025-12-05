//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QBZ191
// Model Creator: 
// Created on: 21.05.2023 - 07:41:04
// Last changed on: 21.05.2023 - 07:41:04

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelQBZ192 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelQBZ192() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[537];
        defaultBarrelModel = new ModelRendererTurbo[36];
        defaultScopeModel = new ModelRendererTurbo[106];
        defaultStockModel = new ModelRendererTurbo[35];
        ammoModel = new ModelRendererTurbo[64];
        extraAmmoModel = new ModelRendererTurbo[64];
        slideModel = new ModelRendererTurbo[9];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initdefaultScopeModel_1();
        initdefaultStockModel_1();
        initammoModel_1();
        initextraAmmoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(113F / 16F, 30.5F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(91F / 16F, 30.5F / 16F, -6.5F / 16F);
        scopeAttachPoint = new Vector3f(17F / 16F, 39F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(68 / 16F, 22.5F / 16F, 0F / 16F);

        gunSlideDistance = 2F;
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

        casingAttachPoint = new Vector3f(1.0F, 1.6F, 0.0F);
        casingAnimDistance = new Vector3f(0.0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0.0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;
        thirdPersonOffset = new Vector3f(-0.1F, -0.04F, 0.0F);

        hasFlash = true;
        flashScale = 4F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        zoomOffsetY = -0.082F;
        zoomOffset = 0.3F;
        gunOffset = 0.5F;
        gunOffsetX = -2F;

        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
        gunModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
        gunModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
        gunModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
        gunModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
        gunModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 6
        gunModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 7
        gunModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 8
        gunModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 9
        gunModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 10
        gunModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 11
        gunModel[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 12
        gunModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 13
        gunModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 14
        gunModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 15
        gunModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 16
        gunModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 17
        gunModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 18
        gunModel[18] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 19
        gunModel[19] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 20
        gunModel[20] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 21
        gunModel[21] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 22
        gunModel[22] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 23
        gunModel[23] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 24
        gunModel[24] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 25
        gunModel[25] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 26
        gunModel[26] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 27
        gunModel[27] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 28
        gunModel[28] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 29
        gunModel[29] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 30
        gunModel[30] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 31
        gunModel[31] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 32
        gunModel[32] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 33
        gunModel[33] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 34
        gunModel[34] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 35
        gunModel[35] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 36
        gunModel[36] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 37
        gunModel[37] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 38
        gunModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
        gunModel[39] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 40
        gunModel[40] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 41
        gunModel[41] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 42
        gunModel[42] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 43
        gunModel[43] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 44
        gunModel[44] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 45
        gunModel[45] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 46
        gunModel[46] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 47
        gunModel[47] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 48
        gunModel[48] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 49
        gunModel[49] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 50
        gunModel[50] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 51
        gunModel[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
        gunModel[52] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 54
        gunModel[53] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 55
        gunModel[54] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 56
        gunModel[55] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 57
        gunModel[56] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 58
        gunModel[57] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 59
        gunModel[58] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 60
        gunModel[59] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 61
        gunModel[60] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 62
        gunModel[61] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 63
        gunModel[62] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 64
        gunModel[63] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 65
        gunModel[64] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 66
        gunModel[65] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 67
        gunModel[66] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 68
        gunModel[67] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 69
        gunModel[68] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 70
        gunModel[69] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 71
        gunModel[70] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 72
        gunModel[71] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 73
        gunModel[72] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 74
        gunModel[73] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 75
        gunModel[74] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 76
        gunModel[75] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 77
        gunModel[76] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 78
        gunModel[77] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 79
        gunModel[78] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 80
        gunModel[79] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 81
        gunModel[80] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 83
        gunModel[81] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 84
        gunModel[82] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 85
        gunModel[83] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 91
        gunModel[84] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 92
        gunModel[85] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 94
        gunModel[86] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 95
        gunModel[87] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 96
        gunModel[88] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 97
        gunModel[89] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 98
        gunModel[90] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 99
        gunModel[91] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 100
        gunModel[92] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 101
        gunModel[93] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 102
        gunModel[94] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 103
        gunModel[95] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 105
        gunModel[96] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 106
        gunModel[97] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 109
        gunModel[98] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 110
        gunModel[99] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 111
        gunModel[100] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 112
        gunModel[101] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 113
        gunModel[102] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 114
        gunModel[103] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 115
        gunModel[104] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 116
        gunModel[105] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 117
        gunModel[106] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 118
        gunModel[107] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 119
        gunModel[108] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 120
        gunModel[109] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 121
        gunModel[110] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 122
        gunModel[111] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 123
        gunModel[112] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 124
        gunModel[113] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 125
        gunModel[114] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 126
        gunModel[115] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 127
        gunModel[116] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 128
        gunModel[117] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 129
        gunModel[118] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 130
        gunModel[119] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 131
        gunModel[120] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 132
        gunModel[121] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 133
        gunModel[122] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 134
        gunModel[123] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 136
        gunModel[124] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 137
        gunModel[125] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 138
        gunModel[126] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 139
        gunModel[127] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 140
        gunModel[128] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 142
        gunModel[129] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 143
        gunModel[130] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 144
        gunModel[131] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 145
        gunModel[132] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 146
        gunModel[133] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 147
        gunModel[134] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 148
        gunModel[135] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 149
        gunModel[136] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 150
        gunModel[137] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 151
        gunModel[138] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 152
        gunModel[139] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 153
        gunModel[140] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 154
        gunModel[141] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 155
        gunModel[142] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 156
        gunModel[143] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 157
        gunModel[144] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 158
        gunModel[145] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 159
        gunModel[146] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 160
        gunModel[147] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 161
        gunModel[148] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 162
        gunModel[149] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 163
        gunModel[150] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 164
        gunModel[151] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 165
        gunModel[152] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 166
        gunModel[153] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 167
        gunModel[154] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 168
        gunModel[155] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 169
        gunModel[156] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 170
        gunModel[157] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 171
        gunModel[158] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 172
        gunModel[159] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 173
        gunModel[160] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 174
        gunModel[161] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 175
        gunModel[162] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 176
        gunModel[163] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 177
        gunModel[164] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 178
        gunModel[165] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 179
        gunModel[166] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 180
        gunModel[167] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 181
        gunModel[168] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 182
        gunModel[169] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 183
        gunModel[170] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 184
        gunModel[171] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 185
        gunModel[172] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 186
        gunModel[173] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 187
        gunModel[174] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 188
        gunModel[175] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 189
        gunModel[176] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 190
        gunModel[177] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 191
        gunModel[178] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 194
        gunModel[179] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 195
        gunModel[180] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 196
        gunModel[181] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 197
        gunModel[182] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 200
        gunModel[183] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 201
        gunModel[184] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 202
        gunModel[185] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 203
        gunModel[186] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 204
        gunModel[187] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 205
        gunModel[188] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 206
        gunModel[189] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 207
        gunModel[190] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 208
        gunModel[191] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 209
        gunModel[192] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 210
        gunModel[193] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 211
        gunModel[194] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 212
        gunModel[195] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 213
        gunModel[196] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 214
        gunModel[197] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 215
        gunModel[198] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 216
        gunModel[199] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 217
        gunModel[200] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 218
        gunModel[201] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 219
        gunModel[202] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 220
        gunModel[203] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 221
        gunModel[204] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 224
        gunModel[205] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 225
        gunModel[206] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 226
        gunModel[207] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 227
        gunModel[208] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 228
        gunModel[209] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 229
        gunModel[210] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 230
        gunModel[211] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 231
        gunModel[212] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 232
        gunModel[213] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 233
        gunModel[214] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 234
        gunModel[215] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 235
        gunModel[216] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 236
        gunModel[217] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 237
        gunModel[218] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 238
        gunModel[219] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 239
        gunModel[220] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 240
        gunModel[221] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 241
        gunModel[222] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 242
        gunModel[223] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 243
        gunModel[224] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 244
        gunModel[225] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 245
        gunModel[226] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 246
        gunModel[227] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 247
        gunModel[228] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 248
        gunModel[229] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 249
        gunModel[230] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 250
        gunModel[231] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 251
        gunModel[232] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 252
        gunModel[233] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 253
        gunModel[234] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 254
        gunModel[235] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 255
        gunModel[236] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 256
        gunModel[237] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 257
        gunModel[238] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 258
        gunModel[239] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 259
        gunModel[240] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 260
        gunModel[241] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 261
        gunModel[242] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 262
        gunModel[243] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 263
        gunModel[244] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 264
        gunModel[245] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 265
        gunModel[246] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 266
        gunModel[247] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 267
        gunModel[248] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 268
        gunModel[249] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 269
        gunModel[250] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 270
        gunModel[251] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 271
        gunModel[252] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 272
        gunModel[253] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 273
        gunModel[254] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 284
        gunModel[255] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 285
        gunModel[256] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 286
        gunModel[257] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 287
        gunModel[258] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 288
        gunModel[259] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 289
        gunModel[260] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 290
        gunModel[261] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 291
        gunModel[262] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 292
        gunModel[263] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 293
        gunModel[264] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 294
        gunModel[265] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 295
        gunModel[266] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 296
        gunModel[267] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 297
        gunModel[268] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 298
        gunModel[269] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 299
        gunModel[270] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 300
        gunModel[271] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 301
        gunModel[272] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 302
        gunModel[273] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 303
        gunModel[274] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 304
        gunModel[275] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 305
        gunModel[276] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 306
        gunModel[277] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 307
        gunModel[278] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 308
        gunModel[279] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 309
        gunModel[280] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 310
        gunModel[281] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 311
        gunModel[282] = new ModelRendererTurbo(this, 1, 370, textureX, textureY); // Box 312
        gunModel[283] = new ModelRendererTurbo(this, 1, 392, textureX, textureY); // Box 313
        gunModel[284] = new ModelRendererTurbo(this, 1, 387, textureX, textureY); // Box 314
        gunModel[285] = new ModelRendererTurbo(this, 1, 382, textureX, textureY); // Box 315
        gunModel[286] = new ModelRendererTurbo(this, 1, 376, textureX, textureY); // Box 316
        gunModel[287] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 317
        gunModel[288] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 318
        gunModel[289] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 319
        gunModel[290] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 320
        gunModel[291] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 321
        gunModel[292] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 322
        gunModel[293] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 323
        gunModel[294] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 328
        gunModel[295] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 329
        gunModel[296] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 330
        gunModel[297] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 331
        gunModel[298] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 332
        gunModel[299] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 333
        gunModel[300] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 334
        gunModel[301] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 335
        gunModel[302] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 336
        gunModel[303] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 337
        gunModel[304] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 338
        gunModel[305] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 339
        gunModel[306] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 362
        gunModel[307] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 363
        gunModel[308] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 366
        gunModel[309] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 367
        gunModel[310] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 368
        gunModel[311] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 371
        gunModel[312] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 372
        gunModel[313] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 373
        gunModel[314] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 376
        gunModel[315] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 377
        gunModel[316] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 378
        gunModel[317] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 381
        gunModel[318] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 382
        gunModel[319] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 383
        gunModel[320] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 386
        gunModel[321] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 387
        gunModel[322] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 388
        gunModel[323] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 391
        gunModel[324] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 392
        gunModel[325] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 393
        gunModel[326] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 396
        gunModel[327] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 397
        gunModel[328] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 398
        gunModel[329] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 401
        gunModel[330] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 402
        gunModel[331] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 403
        gunModel[332] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 406
        gunModel[333] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 407
        gunModel[334] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 410
        gunModel[335] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 411
        gunModel[336] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 414
        gunModel[337] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 415
        gunModel[338] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 418
        gunModel[339] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 419
        gunModel[340] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 422
        gunModel[341] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 423
        gunModel[342] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 426
        gunModel[343] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 427
        gunModel[344] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 430
        gunModel[345] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 431
        gunModel[346] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 434
        gunModel[347] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 435
        gunModel[348] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 438
        gunModel[349] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 439
        gunModel[350] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 442
        gunModel[351] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 443
        gunModel[352] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 446
        gunModel[353] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 447
        gunModel[354] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 448
        gunModel[355] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 449
        gunModel[356] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 450
        gunModel[357] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 451
        gunModel[358] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 452
        gunModel[359] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 453
        gunModel[360] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 454
        gunModel[361] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 455
        gunModel[362] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 456
        gunModel[363] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 457
        gunModel[364] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 458
        gunModel[365] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 459
        gunModel[366] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 460
        gunModel[367] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 461
        gunModel[368] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 462
        gunModel[369] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 463
        gunModel[370] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 464
        gunModel[371] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 465
        gunModel[372] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 466
        gunModel[373] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 467
        gunModel[374] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 468
        gunModel[375] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 469
        gunModel[376] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 470
        gunModel[377] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 471
        gunModel[378] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 472
        gunModel[379] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 473
        gunModel[380] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 474
        gunModel[381] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 475
        gunModel[382] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 476
        gunModel[383] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 477
        gunModel[384] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 478
        gunModel[385] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 502
        gunModel[386] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 503
        gunModel[387] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 504
        gunModel[388] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 505
        gunModel[389] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 558
        gunModel[390] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 559
        gunModel[391] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 585
        gunModel[392] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 586
        gunModel[393] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 587
        gunModel[394] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 226
        gunModel[395] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 226
        gunModel[396] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 227
        gunModel[397] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 226
        gunModel[398] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 226
        gunModel[399] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 227
        gunModel[400] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 226
        gunModel[401] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 226
        gunModel[402] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 227
        gunModel[403] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 226
        gunModel[404] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 226
        gunModel[405] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 227
        gunModel[406] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 226
        gunModel[407] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 226
        gunModel[408] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 227
        gunModel[409] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 226
        gunModel[410] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 226
        gunModel[411] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 227
        gunModel[412] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 226
        gunModel[413] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 226
        gunModel[414] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 227
        gunModel[415] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 226
        gunModel[416] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 226
        gunModel[417] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 227
        gunModel[418] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 226
        gunModel[419] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 226
        gunModel[420] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 227
        gunModel[421] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 226
        gunModel[422] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 41
        gunModel[423] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 42
        gunModel[424] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 46
        gunModel[425] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 47
        gunModel[426] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 48
        gunModel[427] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 49
        gunModel[428] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 50
        gunModel[429] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 54
        gunModel[430] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 226
        gunModel[431] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 227
        gunModel[432] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 226
        gunModel[433] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 226
        gunModel[434] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 227
        gunModel[435] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 226
        gunModel[436] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 226
        gunModel[437] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 227
        gunModel[438] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 226
        gunModel[439] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 226
        gunModel[440] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 227
        gunModel[441] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 226
        gunModel[442] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 226
        gunModel[443] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 227
        gunModel[444] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 226
        gunModel[445] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 226
        gunModel[446] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 227
        gunModel[447] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 226
        gunModel[448] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 226
        gunModel[449] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 227
        gunModel[450] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 226
        gunModel[451] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 226
        gunModel[452] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 227
        gunModel[453] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 226
        gunModel[454] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 226
        gunModel[455] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 227
        gunModel[456] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 226
        gunModel[457] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 226
        gunModel[458] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 227
        gunModel[459] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 226
        gunModel[460] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 109
        gunModel[461] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 63
        gunModel[462] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 287
        gunModel[463] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 287
        gunModel[464] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 6
        gunModel[465] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 6
        gunModel[466] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 6
        gunModel[467] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 201
        gunModel[468] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 227
        gunModel[469] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 226
        gunModel[470] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 227
        gunModel[471] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 226
        gunModel[472] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 227
        gunModel[473] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 226
        gunModel[474] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 227
        gunModel[475] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Box 226
        gunModel[476] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 172
        gunModel[477] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 200
        gunModel[478] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 200
        gunModel[479] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 200
        gunModel[480] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 13
        gunModel[481] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 201
        gunModel[482] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 201
        gunModel[483] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 201
        gunModel[484] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 201
        gunModel[485] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 201
        gunModel[486] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 201
        gunModel[487] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 201
        gunModel[488] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 201
        gunModel[489] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 476
        gunModel[490] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 201
        gunModel[491] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 207
        gunModel[492] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 209
        gunModel[493] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 210
        gunModel[494] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 211
        gunModel[495] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 212
        gunModel[496] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 207
        gunModel[497] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 207
        gunModel[498] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 207
        gunModel[499] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 318

        gunModel[0].addShapeBox(0F, 0F, 0F, 47, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1
        gunModel[0].setRotationPoint(-1F, -39.5F, -2.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
        gunModel[1].setRotationPoint(95F, -39.5F, -2.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
        gunModel[2].setRotationPoint(26F, -39.5F, -2.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
        gunModel[3].setRotationPoint(28F, -39.5F, -2.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
        gunModel[4].setRotationPoint(30F, -39.5F, -2.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 26, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
        gunModel[5].setRotationPoint(-1F, -38.5F, -2F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
        gunModel[6].setRotationPoint(32F, -39.5F, -2.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
        gunModel[7].setRotationPoint(34F, -39.5F, -2.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
        gunModel[8].setRotationPoint(36F, -39.5F, -2.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 10
        gunModel[9].setRotationPoint(38F, -39.5F, -2.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
        gunModel[10].setRotationPoint(40F, -39.5F, -2.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
        gunModel[11].setRotationPoint(42F, -39.5F, -2.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 13
        gunModel[12].setRotationPoint(44F, -39.5F, -2.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
        gunModel[13].setRotationPoint(51F, -39.5F, -2.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
        gunModel[14].setRotationPoint(53F, -39.5F, -2.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
        gunModel[15].setRotationPoint(55F, -39.5F, -2.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
        gunModel[16].setRotationPoint(57F, -39.5F, -2.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 18
        gunModel[17].setRotationPoint(59F, -39.5F, -2.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 19
        gunModel[18].setRotationPoint(61F, -39.5F, -2.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 20
        gunModel[19].setRotationPoint(63F, -39.5F, -2.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
        gunModel[20].setRotationPoint(65F, -39.5F, -2.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
        gunModel[21].setRotationPoint(67F, -39.5F, -2.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23
        gunModel[22].setRotationPoint(69F, -39.5F, -2.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 24
        gunModel[23].setRotationPoint(71F, -39.5F, -2.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
        gunModel[24].setRotationPoint(73F, -39.5F, -2.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
        gunModel[25].setRotationPoint(75F, -39.5F, -2.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
        gunModel[26].setRotationPoint(77F, -39.5F, -2.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
        gunModel[27].setRotationPoint(79F, -39.5F, -2.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
        gunModel[28].setRotationPoint(81F, -39.5F, -2.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
        gunModel[29].setRotationPoint(83F, -39.5F, -2.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
        gunModel[30].setRotationPoint(85F, -39.5F, -2.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
        gunModel[31].setRotationPoint(87F, -39.5F, -2.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
        gunModel[32].setRotationPoint(89F, -39.5F, -2.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
        gunModel[33].setRotationPoint(91F, -39.5F, -2.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
        gunModel[34].setRotationPoint(93F, -39.5F, -2.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 36
        gunModel[35].setRotationPoint(81F, -37F, 2F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 37
        gunModel[36].setRotationPoint(79F, -37F, 2F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 38
        gunModel[37].setRotationPoint(79F, -34.5F, 2F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 39
        gunModel[38].setRotationPoint(88F, -37F, 2F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 40
        gunModel[39].setRotationPoint(88F, -34.5F, 2F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 41
        gunModel[40].setRotationPoint(81F, -34.5F, 2F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 42
        gunModel[41].setRotationPoint(72F, -34.5F, 2F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 43
        gunModel[42].setRotationPoint(53F, -37F, 2F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 44
        gunModel[43].setRotationPoint(53F, -34.5F, 2F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 45
        gunModel[44].setRotationPoint(72F, -37F, 2F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0.25F, 0.25F, -0.15F, 0.25F, 0.25F, -0.15F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F); // Box 46
        gunModel[45].setRotationPoint(79F, -35.5F, 2F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0.25F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0F, 0.2F, 0.25F, 0F, 0.2F); // Box 47
        gunModel[46].setRotationPoint(88F, -35.5F, 2F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.175F, 0F, -0.75F, -0.175F); // Box 48
        gunModel[47].setRotationPoint(79F, -36F, 2F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.175F, 0F, -0.75F, -0.175F); // Box 49
        gunModel[48].setRotationPoint(71F, -36F, 2F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.175F, 0F, -0.75F, -0.175F); // Box 50
        gunModel[49].setRotationPoint(88F, -36F, 2F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 51
        gunModel[50].setRotationPoint(47F, -37F, 2F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Box 52
        gunModel[51].setRotationPoint(47F, -34.5F, 2F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0.25F, 0.25F, -0.15F, 0.25F, 0.25F, -0.15F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F); // Box 54
        gunModel[52].setRotationPoint(71F, -35.5F, 2F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 55
        gunModel[53].setRotationPoint(89F, -37F, 2F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -1.5F, 2F, 0.5F, -1.5F, 2F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Box 56
        gunModel[54].setRotationPoint(89F, -34.5F, 2F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 57
        gunModel[55].setRotationPoint(53F, -30F, 3.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        gunModel[56].setRotationPoint(47F, -32F, 3.5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
        gunModel[57].setRotationPoint(89F, -30F, 3.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 60
        gunModel[58].setRotationPoint(53F, -27F, 3.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
        gunModel[59].setRotationPoint(89F, -27F, 3.5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 62
        gunModel[60].setRotationPoint(47F, -27F, 3.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 63
        gunModel[61].setRotationPoint(47F, -25F, 2.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        gunModel[62].setRotationPoint(47F, -26F, -2.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
        gunModel[63].setRotationPoint(57F, -23F, -2.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
        gunModel[64].setRotationPoint(77F, -23F, -2.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
        gunModel[65].setRotationPoint(75F, -23F, -2.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
        gunModel[66].setRotationPoint(73F, -23F, -2.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 69
        gunModel[67].setRotationPoint(71F, -23F, -2.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 70
        gunModel[68].setRotationPoint(69F, -23F, -2.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 71
        gunModel[69].setRotationPoint(67F, -23F, -2.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
        gunModel[70].setRotationPoint(65F, -23F, -2.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 73
        gunModel[71].setRotationPoint(57F, -23F, -2.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
        gunModel[72].setRotationPoint(63F, -23F, -2.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75
        gunModel[73].setRotationPoint(61F, -23F, -2.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 76
        gunModel[74].setRotationPoint(59F, -23F, -2.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        gunModel[75].setRotationPoint(57F, -24F, -2F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[76].setRotationPoint(81F, -37F, -3F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 79
        gunModel[77].setRotationPoint(79F, -34.5F, -4F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 80
        gunModel[78].setRotationPoint(88F, -37F, -3F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 81
        gunModel[79].setRotationPoint(88F, -34.5F, -4F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 83
        gunModel[80].setRotationPoint(53F, -37F, -3F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 84
        gunModel[81].setRotationPoint(53F, -34.5F, -4F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        gunModel[82].setRotationPoint(72F, -37F, -3F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 91
        gunModel[83].setRotationPoint(47F, -37F, -3F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 92
        gunModel[84].setRotationPoint(47F, -34.5F, -4F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 94
        gunModel[85].setRotationPoint(89F, -37F, -3F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 95
        gunModel[86].setRotationPoint(89F, -34.5F, -4F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 96
        gunModel[87].setRotationPoint(53F, -30F, -5.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 97
        gunModel[88].setRotationPoint(47F, -32F, -5.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 98
        gunModel[89].setRotationPoint(89F, -30F, -5.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F); // Box 99
        gunModel[90].setRotationPoint(53F, -27F, -5.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F); // Box 100
        gunModel[91].setRotationPoint(89F, -27F, -5.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F); // Box 101
        gunModel[92].setRotationPoint(47F, -27F, -5.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 102
        gunModel[93].setRotationPoint(47F, -25F, -4.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 103
        gunModel[94].setRotationPoint(79F, -37F, -3F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 105
        gunModel[95].setRotationPoint(54F, -26F, 4.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 106
        gunModel[96].setRotationPoint(54F, -24F, -2.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 109
        gunModel[97].setRotationPoint(98F, -26F, -2.5F);

        gunModel[98].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 110
        gunModel[98].setRotationPoint(90F, -34.4F, 4.6F);
        gunModel[98].rotateAngleX = 0.29670597F;

        gunModel[99].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 111
        gunModel[99].setRotationPoint(90F, -34.4F, 4.6F);
        gunModel[99].rotateAngleX = 0.29670597F;

        gunModel[100].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 112
        gunModel[100].setRotationPoint(90F, -34.4F, 4.6F);
        gunModel[100].rotateAngleX = 0.29670597F;

        gunModel[101].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 113
        gunModel[101].setRotationPoint(96F, -34.4F, 4.6F);
        gunModel[101].rotateAngleX = 0.29670597F;

        gunModel[102].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 114
        gunModel[102].setRotationPoint(96F, -34.4F, 4.6F);
        gunModel[102].rotateAngleX = 0.29670597F;

        gunModel[103].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 115
        gunModel[103].setRotationPoint(96F, -34.4F, 4.6F);
        gunModel[103].rotateAngleX = 0.29670597F;

        gunModel[104].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 116
        gunModel[104].setRotationPoint(90F, -34.4F, -4.15F);
        gunModel[104].rotateAngleX = -0.29670597F;

        gunModel[105].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 117
        gunModel[105].setRotationPoint(90F, -34.4F, -4.15F);
        gunModel[105].rotateAngleX = -0.29670597F;

        gunModel[106].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 118
        gunModel[106].setRotationPoint(90F, -34.4F, -4.15F);
        gunModel[106].rotateAngleX = -0.29670597F;

        gunModel[107].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 119
        gunModel[107].setRotationPoint(96F, -34.4F, -4.15F);
        gunModel[107].rotateAngleX = -0.29670597F;

        gunModel[108].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 120
        gunModel[108].setRotationPoint(96F, -34.4F, -4.15F);
        gunModel[108].rotateAngleX = -0.29670597F;

        gunModel[109].addShapeBox(0F, -0.5F, -0.75F, 1, 1, 1, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 121
        gunModel[109].setRotationPoint(96F, -34.4F, -4.15F);
        gunModel[109].rotateAngleX = -0.29670597F;

        gunModel[110].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
        gunModel[110].setRotationPoint(84F, -32.5F, 5.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 123
        gunModel[111].setRotationPoint(84F, -32.5F, 5.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 124
        gunModel[112].setRotationPoint(90F, -32.5F, 6.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
        gunModel[113].setRotationPoint(92F, -32.5F, 6.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 126
        gunModel[114].setRotationPoint(94F, -32.5F, 6.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 127
        gunModel[115].setRotationPoint(96F, -32.5F, 6.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
        gunModel[116].setRotationPoint(98F, -32.5F, 6.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 129
        gunModel[117].setRotationPoint(99F, -32.5F, 5.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 130
        gunModel[118].setRotationPoint(99F, -32.5F, 5.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 131
        gunModel[119].setRotationPoint(99F, -32.5F, 6.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 132
        gunModel[120].setRotationPoint(83F, -32.5F, 5.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 133
        gunModel[121].setRotationPoint(83F, -32.5F, 5.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 134
        gunModel[122].setRotationPoint(83F, -32.5F, 6.5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 2F, 0.25F, 2F, 1.5F, 0.25F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1.75F, 0F, -0.5F, 1.75F); // Box 136
        gunModel[123].setRotationPoint(100F, -34.5F, 2F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.25F, 0F, 1F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 137
        gunModel[124].setRotationPoint(100F, -30F, 3.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 138
        gunModel[125].setRotationPoint(100F, -27F, 3.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0.25F, -2F, 0F, 0.25F, -2F); // Box 139
        gunModel[126].setRotationPoint(100F, -25F, 2.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 140
        gunModel[127].setRotationPoint(100F, -26F, -2.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 2F, 1.5F, 0.25F, -2F, 2F, 0.25F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, -0.5F, 1.75F, 0F, -1F, 1.75F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F); // Box 142
        gunModel[128].setRotationPoint(100F, -34.5F, -4F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 1F, 0.25F, 0F, 1.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 143
        gunModel[129].setRotationPoint(100F, -30F, -5.5F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 1F, 0F, -1.5F, 1F); // Box 144
        gunModel[130].setRotationPoint(100F, -27F, -5.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 145
        gunModel[131].setRotationPoint(100F, -25F, -4.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 146
        gunModel[132].setRotationPoint(46F, -32F, 3.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 147
        gunModel[133].setRotationPoint(46F, -27F, 3.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0.25F, -2F, 0F, 0.25F, -2F); // Box 148
        gunModel[134].setRotationPoint(46F, -25F, 2.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 149
        gunModel[135].setRotationPoint(46F, -26F, -2.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 150
        gunModel[136].setRotationPoint(46F, -37F, -3F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1.75F, 0F, -1F, 1.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 151
        gunModel[137].setRotationPoint(46F, -34.5F, -4F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 152
        gunModel[138].setRotationPoint(46F, -32F, -5.5F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 1F, 0F, -1.5F, 1F); // Box 153
        gunModel[139].setRotationPoint(46F, -27F, -5.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 154
        gunModel[140].setRotationPoint(46F, -25F, -4.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 155
        gunModel[141].setRotationPoint(46F, -37F, 2F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1.75F, 0F, -1F, 1.75F); // Box 156
        gunModel[142].setRotationPoint(46F, -34.5F, 2F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 157
        gunModel[143].setRotationPoint(20F, -39.5F, -2.5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
        gunModel[144].setRotationPoint(22F, -39.5F, -2.5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 159
        gunModel[145].setRotationPoint(24F, -39.5F, -2.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
        gunModel[146].setRotationPoint(14F, -39.5F, -2.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 161
        gunModel[147].setRotationPoint(16F, -39.5F, -2.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 162
        gunModel[148].setRotationPoint(18F, -39.5F, -2.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 163
        gunModel[149].setRotationPoint(8F, -39.5F, -2.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
        gunModel[150].setRotationPoint(10F, -39.5F, -2.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 165
        gunModel[151].setRotationPoint(12F, -39.5F, -2.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 166
        gunModel[152].setRotationPoint(-1F, -39.5F, -2.5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 167
        gunModel[153].setRotationPoint(45F, -27F, -4.5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 1F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 168
        gunModel[154].setRotationPoint(45F, -28.5F, -4.5F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 169
        gunModel[155].setRotationPoint(45F, -23.5F, -4.5F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 170
        gunModel[156].setRotationPoint(23F, -23.5F, -4.5F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 21, 1, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 171
        gunModel[157].setRotationPoint(25F, -28.5F, -4.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 24, 7, 8, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 172
        gunModel[158].setRotationPoint(22F, -29F, -4F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 24, 1, 9, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 173
        gunModel[159].setRotationPoint(22F, -22.5F, -4.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, -2F, 0F, -0.25F, 1.5F, -1F, -0.25F, 1.5F, -1F, -0.25F, -2F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 174
        gunModel[160].setRotationPoint(23F, -28.5F, -4.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 24, 1, 9, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 175
        gunModel[161].setRotationPoint(21.5F, -22F, -4.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F, 4F, 0.25F, 0F, 2.75F, 0.25F, 0F, 2.75F, 0.25F, 0F, 4F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 176
        gunModel[162].setRotationPoint(18F, -28.5F, -4F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
        gunModel[163].setRotationPoint(88F, -32.5F, 6.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        gunModel[164].setRotationPoint(84F, -32.5F, -6.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 179
        gunModel[165].setRotationPoint(84F, -32.5F, -6.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 180
        gunModel[166].setRotationPoint(90F, -32.5F, -7.5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 181
        gunModel[167].setRotationPoint(92F, -32.5F, -7.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
        gunModel[168].setRotationPoint(94F, -32.5F, -7.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 183
        gunModel[169].setRotationPoint(96F, -32.5F, -7.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 184
        gunModel[170].setRotationPoint(98F, -32.5F, -7.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 185
        gunModel[171].setRotationPoint(99F, -32.5F, -6.5F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 186
        gunModel[172].setRotationPoint(99F, -32.5F, -6.5F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 187
        gunModel[173].setRotationPoint(99F, -32.5F, -7.5F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 188
        gunModel[174].setRotationPoint(83F, -32.5F, -6.5F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 189
        gunModel[175].setRotationPoint(83F, -32.5F, -6.5F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 190
        gunModel[176].setRotationPoint(83F, -32.5F, -7.5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 191
        gunModel[177].setRotationPoint(88F, -32.5F, -7.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 194
        gunModel[178].setRotationPoint(42F, -32.5F, -4.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 2, 7, 8, 0F, 3F, -1F, -1F, -4F, 0.25F, 0F, -4F, 0.25F, 0F, 3F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 195
        gunModel[179].setRotationPoint(16F, -28.5F, -4F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 22, 7, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
        gunModel[180].setRotationPoint(-6F, -28.5F, -3F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
        gunModel[181].setRotationPoint(-1F, -28.5F, -3F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 200
        gunModel[182].setRotationPoint(15F, -31F, -3.75F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 13, 1, 9, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 201
        gunModel[183].setRotationPoint(25F, -31F, -3.75F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, -1F, 0F, 0.125F, -1F); // Box 202
        gunModel[184].setRotationPoint(25F, -30F, 4.25F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 43, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 203
        gunModel[185].setRotationPoint(-1F, -32.5F, 2.5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 43, 3, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204
        gunModel[186].setRotationPoint(-1F, -35.5F, 2.5F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 4.75F, 0.25F, 0F, 4.75F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 205
        gunModel[187].setRotationPoint(42F, -35.5F, 0.5F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.5F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 206
        gunModel[188].setRotationPoint(37F, -33.5F, 3F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.5F, -0.5F, 1.75F, 0F, -1F, 1.75F, 0F, -1F, -2.75F, -0.5F, -0.5F, -2.75F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 207
        gunModel[189].setRotationPoint(37F, -36.5F, 3F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 208
        gunModel[190].setRotationPoint(25F, -33.5F, 3F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 1.75F, -0.5F, -0.5F, 1.75F, -0.5F, -0.5F, -2.75F, 0F, -1F, -2.75F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F); // Box 209
        gunModel[191].setRotationPoint(25F, -36.5F, 3F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 210
        gunModel[192].setRotationPoint(25.5F, -34F, 3F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 211
        gunModel[193].setRotationPoint(25.5F, -36F, 3F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 212
        gunModel[194].setRotationPoint(24F, -34.5F, 2.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 213
        gunModel[195].setRotationPoint(24F, -36.5F, 2.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F); // Box 214
        gunModel[196].setRotationPoint(27F, -33F, 4.75F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F); // Box 215
        gunModel[197].setRotationPoint(27F, -33F, 4.75F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F); // Box 216
        gunModel[198].setRotationPoint(27F, -33F, 4.75F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F); // Box 217
        gunModel[199].setRotationPoint(35F, -33F, 4.75F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F); // Box 218
        gunModel[200].setRotationPoint(35F, -33F, 4.75F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.25F, -0.875F, -0.5F, 0.25F, -0.875F, -0.5F); // Box 219
        gunModel[201].setRotationPoint(35F, -33F, 4.75F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 220
        gunModel[202].setRotationPoint(-1F, -32.5F, -4.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 26, 3, 2, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 221
        gunModel[203].setRotationPoint(-1F, -35.5F, -4.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 224
        gunModel[204].setRotationPoint(-1F, -31F, -3.75F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F); // Box 225
        gunModel[205].setRotationPoint(-1F, -30F, 3.25F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[206].setRotationPoint(54F, -31F, 5.25F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[207].setRotationPoint(54F, -34F, 4.75F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 228
        gunModel[208].setRotationPoint(54F, -28F, 5.25F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, -0.375F, 0.5F, -0.25F, -0.375F); // Box 229
        gunModel[209].setRotationPoint(21F, -24F, 4F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 230
        gunModel[210].setRotationPoint(20.5F, -25F, 4F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 231
        gunModel[211].setRotationPoint(22.5F, -25F, 4F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, 0.25F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, -0.875F, -0.375F); // Box 232
        gunModel[212].setRotationPoint(20.5F, -25F, 4F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, 0F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.5F, -0.875F, -0.375F, 0F, -0.875F, -0.375F); // Box 233
        gunModel[213].setRotationPoint(22.5F, -25F, 4F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 234
        gunModel[214].setRotationPoint(-7F, -28.5F, -3F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 235
        gunModel[215].setRotationPoint(-9F, -28.5F, -3F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 236
        gunModel[216].setRotationPoint(-6F, -21.5F, -3.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 9, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 237
        gunModel[217].setRotationPoint(3F, -21.5F, -3.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 238
        gunModel[218].setRotationPoint(-6F, -12.5F, -3.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, 0F, 0F, -1.25F); // Box 239
        gunModel[219].setRotationPoint(3F, -12.5F, -3.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F); // Box 240
        gunModel[220].setRotationPoint(-6F, -17.5F, -3.5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 8, 18, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 9F, -1F, -0.25F, -8F, 3F, -0.25F, -8F, 3F, -0.25F, 9F, -1F, -0.25F); // Box 241
        gunModel[221].setRotationPoint(-9F, -12.5F, -3.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 2, 18, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 8F, 3F, -0.25F, -8F, 3F, -1.25F, -8F, 3F, -1.25F, 8F, 3F, -0.25F); // Box 242
        gunModel[222].setRotationPoint(-1F, -12.5F, -3.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0.25F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F); // Box 243
        gunModel[223].setRotationPoint(-8F, -21.5F, -2.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, 0.75F, -3F, 0F, 0.75F, 3F, 0F, -0.25F); // Box 244
        gunModel[224].setRotationPoint(-8F, -17.5F, -2.5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 2, 16, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 8.5F, 0.25F, -0.25F, -9F, 1F, 0.75F, -9F, 1F, 0.75F, 8.5F, 0.25F, -0.25F); // Box 245
        gunModel[225].setRotationPoint(-11F, -12.5F, -2.5F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0.5F, -1.5F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, -1.5F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, -0.5F); // Box 246
        gunModel[226].setRotationPoint(-8F, -23.5F, -2.5F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 247
        gunModel[227].setRotationPoint(-9F, -23.5F, -2.5F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
        gunModel[228].setRotationPoint(-9F, -29.5F, -3F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        gunModel[229].setRotationPoint(-9F, -32F, -4.5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        gunModel[230].setRotationPoint(-5F, -31F, -4.5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
        gunModel[231].setRotationPoint(-5F, -32F, -4.5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 252
        gunModel[232].setRotationPoint(-5F, -35.5F, -3.5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 253
        gunModel[233].setRotationPoint(-9F, -35.5F, -3.5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 254
        gunModel[234].setRotationPoint(-9F, -36.5F, -3F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
        gunModel[235].setRotationPoint(-9F, -36.5F, -3F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 256
        gunModel[236].setRotationPoint(-5F, -36.5F, -3F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
        gunModel[237].setRotationPoint(-5F, -36.5F, -3F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
        gunModel[238].setRotationPoint(-9F, -39.5F, -3F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 259
        gunModel[239].setRotationPoint(-9F, -39.5F, -3F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        gunModel[240].setRotationPoint(-9F, -40.5F, -3F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 261
        gunModel[241].setRotationPoint(-2F, -39.5F, -3F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 262
        gunModel[242].setRotationPoint(-2.5F, -39.5F, -2.5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 263
        gunModel[243].setRotationPoint(-2F, -40F, -3F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.5F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.5F, -0.875F, 0F); // Box 264
        gunModel[244].setRotationPoint(-2F, -39.5F, -3F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 265
        gunModel[245].setRotationPoint(-2.5F, -40F, -3F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, 0F, -0.875F, 0F); // Box 266
        gunModel[246].setRotationPoint(-2.5F, -39.5F, -3F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F); // Box 267
        gunModel[247].setRotationPoint(21.5F, -26.5F, 3.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 268
        gunModel[248].setRotationPoint(20.5F, -27.5F, 3.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 269
        gunModel[249].setRotationPoint(20.5F, -28.5F, 3.5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 270
        gunModel[250].setRotationPoint(20.5F, -28F, 3.5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 271
        gunModel[251].setRotationPoint(20.5F, -27F, 4F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 272
        gunModel[252].setRotationPoint(19.5F, -27.5F, 4F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 273
        gunModel[253].setRotationPoint(19.5F, -27F, 4F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -1F, -1F, -0.25F, 0.75F, -1.5F, -1.25F, 0.75F, -1.5F, -1.25F, -0.5F, -1F, -0.25F, 0F, 3F, -0.25F, 0.5F, 4.25F, -1.25F, 0.5F, 4.25F, -1.25F, 0F, 3F, -0.25F); // Box 284
        gunModel[254].setRotationPoint(-9F, 4.5F, -3.5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
        gunModel[255].setRotationPoint(19F, -21.5F, -3.5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        gunModel[256].setRotationPoint(19F, -21.5F, -2.5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[257].setRotationPoint(17F, -19.5F, -3.5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 288
        gunModel[258].setRotationPoint(18F, -19.5F, -2.5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 289
        gunModel[259].setRotationPoint(21F, -21.5F, -3.5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
        gunModel[260].setRotationPoint(4F, -18.5F, -2.5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
        gunModel[261].setRotationPoint(4F, -20.5F, -2.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 292
        gunModel[262].setRotationPoint(4F, -21.5F, -2.5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 293
        gunModel[263].setRotationPoint(4F, -15.5F, -2.5F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 294
        gunModel[264].setRotationPoint(4F, -13.5F, -2.5F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 0.5F, 0F); // Box 295
        gunModel[265].setRotationPoint(6F, -13.5F, -2.5F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F); // Box 296
        gunModel[266].setRotationPoint(11F, -13.5F, -2.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 98, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        gunModel[267].setRotationPoint(15F, -32F, -2F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 98, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[268].setRotationPoint(15F, -31F, -2F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 98, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 299
        gunModel[269].setRotationPoint(15F, -29F, -1.5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 98, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 300
        gunModel[270].setRotationPoint(15F, -30F, -2F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 98, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[271].setRotationPoint(15F, -33F, -1.5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Box 302
        gunModel[272].setRotationPoint(109F, -32F, -2F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F); // Box 303
        gunModel[273].setRotationPoint(109F, -31F, -2F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 304
        gunModel[274].setRotationPoint(109F, -29F, -1.5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Box 305
        gunModel[275].setRotationPoint(109F, -33F, -1.5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 306
        gunModel[276].setRotationPoint(109F, -30F, -2F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
        gunModel[277].setRotationPoint(46F, -37F, -2F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
        gunModel[278].setRotationPoint(46F, -36F, -2F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 60, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 309
        gunModel[279].setRotationPoint(46F, -34F, -1.5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 310
        gunModel[280].setRotationPoint(46F, -35F, -2F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 60, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
        gunModel[281].setRotationPoint(46F, -38F, -1.5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -2.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2.25F, 0F, -0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 312
        gunModel[282].setRotationPoint(105F, -32F, -2F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 313
        gunModel[283].setRotationPoint(105F, -31F, -2F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -1F, -0.25F, -1F); // Box 314
        gunModel[284].setRotationPoint(105F, -29F, -1.5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -2.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -2.5F, -0.25F, -1F, -2.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.25F, 0F, 0.25F); // Box 315
        gunModel[285].setRotationPoint(105F, -33F, -1.5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 316
        gunModel[286].setRotationPoint(105F, -30F, -2F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 317
        gunModel[287].setRotationPoint(106F, -35.5F, -1F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.125F, 0F, -1F, -0.125F, 0F, -1F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        gunModel[288].setRotationPoint(106F, -37.5F, -1F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.875F, -0.5F, -0.25F, -0.875F, -0.5F, -0.25F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 319
        gunModel[289].setRotationPoint(106F, -38.5F, -1F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, -0.5F, -0.25F, -0.875F, -0.5F, -0.25F, -0.875F, -0.5F, 0F, -0.875F, -0.5F); // Box 320
        gunModel[290].setRotationPoint(106F, -33.5F, -1F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
        gunModel[291].setRotationPoint(107.5F, -33F, -1F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
        gunModel[292].setRotationPoint(109F, -29F, -1F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
        gunModel[293].setRotationPoint(-10F, -40.5F, -3F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        gunModel[294].setRotationPoint(-14F, -29.5F, -3F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 329
        gunModel[295].setRotationPoint(-14F, -32.5F, -4.5F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 330
        gunModel[296].setRotationPoint(-13F, -35.5F, -3F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
        gunModel[297].setRotationPoint(-11F, -39.5F, -3F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
        gunModel[298].setRotationPoint(-13F, -38.5F, -3F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 333
        gunModel[299].setRotationPoint(-15F, -35.5F, -3F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 334
        gunModel[300].setRotationPoint(-16F, -36.5F, -3F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.5F, -1F, -0.5F, 1F, -1F, -0.5F, 1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F); // Box 335
        gunModel[301].setRotationPoint(-15.75F, -36F, -3F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.5F, -1F, -1F, -0.75F, 0.75F, -1F, -0.75F, 0.75F, -1F, -0.5F, -1F, -1F, -0.75F, 0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.75F, 0.5F, 0F); // Box 336
        gunModel[302].setRotationPoint(-13.75F, -38F, -3F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -1F, 0.5F, 0.25F, -1F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0.25F, -1F); // Box 337
        gunModel[303].setRotationPoint(-11F, -40F, -3F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
        gunModel[304].setRotationPoint(-14F, -24.5F, -2F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        gunModel[305].setRotationPoint(-14F, -27.5F, -3F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 362
        gunModel[306].setRotationPoint(57F, -26F, 4.5F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 363
        gunModel[307].setRotationPoint(57F, -24F, -2.5F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 366
        gunModel[308].setRotationPoint(57F, -28F, 5.25F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 367
        gunModel[309].setRotationPoint(60F, -26F, 4.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 368
        gunModel[310].setRotationPoint(60F, -24F, -2.5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 371
        gunModel[311].setRotationPoint(60F, -28F, 5.25F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 372
        gunModel[312].setRotationPoint(63F, -26F, 4.5F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 373
        gunModel[313].setRotationPoint(63F, -24F, -2.5F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 376
        gunModel[314].setRotationPoint(63F, -28F, 5.25F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 377
        gunModel[315].setRotationPoint(66F, -26F, 4.5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 378
        gunModel[316].setRotationPoint(66F, -24F, -2.5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 381
        gunModel[317].setRotationPoint(66F, -28F, 5.25F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 382
        gunModel[318].setRotationPoint(69F, -26F, 4.5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 383
        gunModel[319].setRotationPoint(69F, -24F, -2.5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 386
        gunModel[320].setRotationPoint(69F, -28F, 5.25F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 387
        gunModel[321].setRotationPoint(72F, -26F, 4.5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 388
        gunModel[322].setRotationPoint(72F, -24F, -2.5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 391
        gunModel[323].setRotationPoint(72F, -28F, 5.25F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 392
        gunModel[324].setRotationPoint(75F, -26F, 4.5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 393
        gunModel[325].setRotationPoint(75F, -24F, -2.5F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 396
        gunModel[326].setRotationPoint(75F, -28F, 5.25F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 397
        gunModel[327].setRotationPoint(78F, -26F, 4.5F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 398
        gunModel[328].setRotationPoint(78F, -24F, -2.5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 401
        gunModel[329].setRotationPoint(78F, -28F, 5.25F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 402
        gunModel[330].setRotationPoint(81F, -26F, 4.5F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 403
        gunModel[331].setRotationPoint(81F, -24F, -2.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 406
        gunModel[332].setRotationPoint(81F, -28F, 5.25F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 407
        gunModel[333].setRotationPoint(54F, -26F, -5.5F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 410
        gunModel[334].setRotationPoint(54F, -28F, -6.25F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 411
        gunModel[335].setRotationPoint(57F, -26F, -5.5F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 414
        gunModel[336].setRotationPoint(57F, -28F, -6.25F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 415
        gunModel[337].setRotationPoint(60F, -26F, -5.5F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 418
        gunModel[338].setRotationPoint(60F, -28F, -6.25F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 419
        gunModel[339].setRotationPoint(63F, -26F, -5.5F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 422
        gunModel[340].setRotationPoint(63F, -28F, -6.25F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 423
        gunModel[341].setRotationPoint(66F, -26F, -5.5F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 426
        gunModel[342].setRotationPoint(66F, -28F, -6.25F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 427
        gunModel[343].setRotationPoint(69F, -26F, -5.5F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 430
        gunModel[344].setRotationPoint(69F, -28F, -6.25F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 431
        gunModel[345].setRotationPoint(72F, -26F, -5.5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 434
        gunModel[346].setRotationPoint(72F, -28F, -6.25F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 435
        gunModel[347].setRotationPoint(75F, -26F, -5.5F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 438
        gunModel[348].setRotationPoint(75F, -28F, -6.25F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 439
        gunModel[349].setRotationPoint(78F, -26F, -5.5F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 442
        gunModel[350].setRotationPoint(78F, -28F, -6.25F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 443
        gunModel[351].setRotationPoint(81F, -26F, -5.5F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 446
        gunModel[352].setRotationPoint(81F, -28F, -6.25F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 447
        gunModel[353].setRotationPoint(84F, -26F, 4.5F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 448
        gunModel[354].setRotationPoint(84F, -24F, -2.5F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 449
        gunModel[355].setRotationPoint(84F, -28F, 5.25F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 450
        gunModel[356].setRotationPoint(84F, -26F, -5.5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 451
        gunModel[357].setRotationPoint(84F, -28F, -6.25F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 452
        gunModel[358].setRotationPoint(87F, -26F, 4.5F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 453
        gunModel[359].setRotationPoint(87F, -24F, -2.5F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 454
        gunModel[360].setRotationPoint(87F, -28F, 5.25F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 455
        gunModel[361].setRotationPoint(87F, -26F, -5.5F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 456
        gunModel[362].setRotationPoint(87F, -28F, -6.25F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 457
        gunModel[363].setRotationPoint(90F, -26F, 4.5F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 458
        gunModel[364].setRotationPoint(90F, -24F, -2.5F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 459
        gunModel[365].setRotationPoint(90F, -28F, 5.25F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 460
        gunModel[366].setRotationPoint(90F, -26F, -5.5F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 461
        gunModel[367].setRotationPoint(90F, -28F, -6.25F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 462
        gunModel[368].setRotationPoint(93F, -26F, 4.5F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 463
        gunModel[369].setRotationPoint(93F, -24F, -2.5F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 464
        gunModel[370].setRotationPoint(93F, -28F, 5.25F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 465
        gunModel[371].setRotationPoint(93F, -26F, -5.5F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 466
        gunModel[372].setRotationPoint(93F, -28F, -6.25F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F); // Box 467
        gunModel[373].setRotationPoint(96F, -26F, 4.5F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F); // Box 468
        gunModel[374].setRotationPoint(96F, -24F, -2.5F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F); // Box 469
        gunModel[375].setRotationPoint(96F, -28F, 5.25F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, -3F, -0.125F, 0.25F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 470
        gunModel[376].setRotationPoint(96F, -26F, -5.5F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1.5F, -0.125F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 471
        gunModel[377].setRotationPoint(96F, -28F, -6.25F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
        gunModel[378].setRotationPoint(84F, -29F, -6.25F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
        gunModel[379].setRotationPoint(87F, -29F, -6.25F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 474
        gunModel[380].setRotationPoint(84F, -29F, 5.25F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 475
        gunModel[381].setRotationPoint(87F, -29F, 5.25F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, -2F, 2F, 0F); // Box 476
        gunModel[382].setRotationPoint(7F, -21.5F, -0.5F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
        gunModel[383].setRotationPoint(9F, -17.5F, -1F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0.25F, 0F); // Box 478
        gunModel[384].setRotationPoint(9F, -15.5F, -1F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 502
        gunModel[385].setRotationPoint(86F, -32.5F, 6.5F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 503
        gunModel[386].setRotationPoint(86F, -32.5F, -7.5F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 504
        gunModel[387].setRotationPoint(84F, -32.5F, 6.5F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 505
        gunModel[388].setRotationPoint(84F, -32.5F, -7.5F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
        gunModel[389].setRotationPoint(49F, -39.5F, -2.5F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
        gunModel[390].setRotationPoint(6F, -39.5F, -2.5F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 585
        gunModel[391].setRotationPoint(-8F, -38.5F, -3.5F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 586
        gunModel[392].setRotationPoint(-8F, -39.5F, -3.5F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F); // Box 587
        gunModel[393].setRotationPoint(-8F, -37.5F, -3.5F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[394].setRotationPoint(54F, -33F, 5.25F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[395].setRotationPoint(57F, -31F, 5.25F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[396].setRotationPoint(57F, -34F, 4.75F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[397].setRotationPoint(57F, -33F, 5.25F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[398].setRotationPoint(60F, -31F, 5.25F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[399].setRotationPoint(60F, -34F, 4.75F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[400].setRotationPoint(60F, -33F, 5.25F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[401].setRotationPoint(63F, -31F, 5.25F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[402].setRotationPoint(63F, -34F, 4.75F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[403].setRotationPoint(63F, -33F, 5.25F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[404].setRotationPoint(66F, -31F, 5.25F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[405].setRotationPoint(66F, -34F, 4.75F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[406].setRotationPoint(66F, -33F, 5.25F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[407].setRotationPoint(69F, -31F, 5.25F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[408].setRotationPoint(69F, -34F, 4.75F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[409].setRotationPoint(69F, -33F, 5.25F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[410].setRotationPoint(72F, -31F, 5.25F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[411].setRotationPoint(72F, -34F, 4.75F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[412].setRotationPoint(72F, -33F, 5.25F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[413].setRotationPoint(75F, -31F, 5.25F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[414].setRotationPoint(75F, -34F, 4.75F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[415].setRotationPoint(75F, -33F, 5.25F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[416].setRotationPoint(78F, -31F, 5.25F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[417].setRotationPoint(78F, -34F, 4.75F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[418].setRotationPoint(78F, -33F, 5.25F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 226
        gunModel[419].setRotationPoint(81F, -31F, 5.25F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[420].setRotationPoint(81F, -34F, 4.75F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[421].setRotationPoint(81F, -33F, 5.25F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 41
        gunModel[422].setRotationPoint(81F, -34.5F, -4F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 42
        gunModel[423].setRotationPoint(72F, -34.5F, -4F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0.25F, -0.15F, 0.25F, 0.25F, -0.15F); // Box 46
        gunModel[424].setRotationPoint(79F, -35.5F, -4F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.25F, -0.15F, 0.25F, 0.25F, -0.15F); // Box 47
        gunModel[425].setRotationPoint(88F, -35.5F, -4F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, -0.175F, 0F, -0.75F, -0.175F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 48
        gunModel[426].setRotationPoint(79F, -36F, -4F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, -0.175F, 0F, -0.75F, -0.175F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 49
        gunModel[427].setRotationPoint(71F, -36F, -4F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, -0.175F, 0F, -0.75F, -0.175F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 50
        gunModel[428].setRotationPoint(88F, -36F, -4F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0.25F, -0.15F, 0.25F, 0.25F, -0.15F); // Box 54
        gunModel[429].setRotationPoint(71F, -35.5F, -4F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[430].setRotationPoint(54F, -31F, -6.25F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[431].setRotationPoint(54F, -34F, -5.75F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[432].setRotationPoint(54F, -33F, -6.25F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[433].setRotationPoint(57F, -31F, -6.25F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[434].setRotationPoint(57F, -34F, -5.75F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[435].setRotationPoint(57F, -33F, -6.25F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[436].setRotationPoint(60F, -31F, -6.25F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[437].setRotationPoint(60F, -34F, -5.75F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[438].setRotationPoint(60F, -33F, -6.25F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[439].setRotationPoint(63F, -31F, -6.25F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[440].setRotationPoint(63F, -34F, -5.75F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[441].setRotationPoint(63F, -33F, -6.25F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[442].setRotationPoint(66F, -31F, -6.25F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[443].setRotationPoint(66F, -34F, -5.75F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[444].setRotationPoint(66F, -33F, -6.25F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[445].setRotationPoint(69F, -31F, -6.25F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[446].setRotationPoint(69F, -34F, -5.75F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[447].setRotationPoint(69F, -33F, -6.25F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[448].setRotationPoint(72F, -31F, -6.25F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[449].setRotationPoint(72F, -34F, -5.75F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[450].setRotationPoint(72F, -33F, -6.25F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[451].setRotationPoint(75F, -31F, -6.25F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[452].setRotationPoint(75F, -34F, -5.75F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[453].setRotationPoint(75F, -33F, -6.25F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[454].setRotationPoint(78F, -31F, -6.25F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[455].setRotationPoint(78F, -34F, -5.75F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[456].setRotationPoint(78F, -33F, -6.25F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.125F, 0.125F, -0.75F, -0.125F, 0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[457].setRotationPoint(81F, -31F, -6.25F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[458].setRotationPoint(81F, -34F, -5.75F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[459].setRotationPoint(81F, -33F, -6.25F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 109
        gunModel[460].setRotationPoint(47F, -26F, -2.5F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0.125F, 0.5F, 0F, 0.125F, 0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F); // Box 63
        gunModel[461].setRotationPoint(50.5F, -26.5F, 4.5F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[462].setRotationPoint(17F, -19.5F, 2.5F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 287
        gunModel[463].setRotationPoint(18F, -19.5F, -2.5F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 55, 3, 4, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 6
        gunModel[464].setRotationPoint(42F, -38.5F, -2F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 6
        gunModel[465].setRotationPoint(25F, -38.5F, 1F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 6
        gunModel[466].setRotationPoint(25F, -38.5F, -2F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0.75F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.375F, 0F, 2F, -0.375F, 0F, -0.25F, 0.125F, 0.5F, 0F, 0.125F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 201
        gunModel[467].setRotationPoint(24F, -32F, -5.25F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[468].setRotationPoint(84F, -34F, 4.75F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[469].setRotationPoint(84F, -33F, 5.25F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[470].setRotationPoint(84F, -34F, -5.75F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[471].setRotationPoint(84F, -33F, -6.25F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F); // Box 227
        gunModel[472].setRotationPoint(87F, -34F, 4.75F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // Box 226
        gunModel[473].setRotationPoint(87F, -33F, 5.25F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -1F, -0.25F, -0.375F, -1F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 227
        gunModel[474].setRotationPoint(87F, -34F, -5.75F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.125F, 0F, -1.25F, -0.125F, 0F, -1.25F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[475].setRotationPoint(87F, -33F, -6.25F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 26, 1, 8, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 172
        gunModel[476].setRotationPoint(-1F, -29.75F, -4F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 21, 1, 8, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        gunModel[477].setRotationPoint(25F, -31F, -3.75F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 200
        gunModel[478].setRotationPoint(25F, -30F, 3.25F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F); // Box 200
        gunModel[479].setRotationPoint(15F, -30F, 3.25F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 13
        gunModel[480].setRotationPoint(46F, -39.5F, -2.5F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, -0.25F, 0.125F, 0.5F, 1F, 0.125F, 0.5F, 1F, 0.375F, 0F, 1F, 0.375F, 0F); // Box 201
        gunModel[481].setRotationPoint(23F, -33F, -5.25F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 2.25F, 1F, 0F, 2.25F, 0F, 0.125F, 0.25F, 1F, 0.125F, 0.25F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 201
        gunModel[482].setRotationPoint(22F, -35.5F, -5.25F);

        gunModel[483].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0.25F, 1F, 0.5F, 0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 201
        gunModel[483].setRotationPoint(23F, -36.5F, -3F);

        gunModel[484].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, -1F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 201
        gunModel[484].setRotationPoint(23F, -37.5F, -3F);

        gunModel[485].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.125F, 0.5F, 0F, 0.125F, 0.5F, 0F, 0.875F, 0F, 1F, 0.875F, 0F); // Box 201
        gunModel[485].setRotationPoint(42F, -33F, -4.75F);

        gunModel[486].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2.25F, 1F, 0F, 2.25F, 1F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 1F, 0F, 1F, 1F, 0F); // Box 201
        gunModel[486].setRotationPoint(43F, -35.5F, -4.75F);

        gunModel[487].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        gunModel[487].setRotationPoint(42F, -36.5F, -2.5F);

        gunModel[488].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, 0.125F, -1.25F, 0F, 0.125F, -1.25F); // Box 201
        gunModel[488].setRotationPoint(22F, -35.5F, -5.25F);

        gunModel[489].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 476
        gunModel[489].setRotationPoint(7F, -21.5F, -1F);

        gunModel[490].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        gunModel[490].setRotationPoint(-1F, -30F, -3.2F);

        gunModel[491].addShapeBox(-2F, -0.399999999999999F, -0.1F, 4, 1, 2, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 207
        gunModel[491].setRotationPoint(2F, -25F, 1.75F);
        gunModel[491].rotateAngleZ = 0.78539816F;

        gunModel[492].addShapeBox(-2F, 0.600000000000001F, -0.1F, 4, 1, 2, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.75F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F); // Box 209
        gunModel[492].setRotationPoint(2F, -25F, 1.75F);
        gunModel[492].rotateAngleZ = 0.78539816F;

        gunModel[493].addShapeBox(-1.5F, 1.6F, -0.1F, 3, 1, 2, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -1F, -0.75F, 0.25F, -1F, -0.75F, 0.25F); // Box 210
        gunModel[493].setRotationPoint(2F, -25F, 1.75F);
        gunModel[493].rotateAngleZ = 0.78539816F;

        gunModel[494].addShapeBox(-2F, -1.4F, -0.1F, 4, 1, 2, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.75F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 211
        gunModel[494].setRotationPoint(2F, -25F, 1.75F);
        gunModel[494].rotateAngleZ = 0.78539816F;

        gunModel[495].addShapeBox(-1.5F, -2.4F, -0.1F, 3, 1, 2, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -1F, -0.75F, 0.25F, -1F, -0.75F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F); // Box 212
        gunModel[495].setRotationPoint(2F, -25F, 1.75F);
        gunModel[495].rotateAngleZ = 0.78539816F;

        gunModel[496].addShapeBox(-5F, -0.9F, -0.1F, 3, 2, 2, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // Box 207
        gunModel[496].setRotationPoint(2F, -25F, 1.75F);
        gunModel[496].rotateAngleZ = 0.78539816F;

        gunModel[497].addShapeBox(-2F, -0.9F, -0.1F, 1, 2, 2, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.5F); // Box 207
        gunModel[497].setRotationPoint(2F, -25F, 1.75F);
        gunModel[497].rotateAngleZ = 0.78539816F;

        gunModel[498].addShapeBox(-5.5F, -0.9F, -0.1F, 1, 2, 2, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.5F, -0.5F, -0.75F, 0.5F); // Box 207
        gunModel[498].setRotationPoint(2F, -25F, 1.75F);
        gunModel[498].rotateAngleZ = 0.78539816F;

        gunModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
        gunModel[499].setRotationPoint(108.5F, -38F, -0.5F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 318
        gunModel[501] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 318
        gunModel[502] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 318
        gunModel[503] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 318
        gunModel[504] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 318
        gunModel[505] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 318
        gunModel[506] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 318
        gunModel[507] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Box 328
        gunModel[508] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 329
        gunModel[509] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Box 330
        gunModel[510] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 329
        gunModel[511] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 167
        gunModel[512] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 167
        gunModel[513] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 167
        gunModel[514] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 167
        gunModel[515] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Box 167
        gunModel[516] = new ModelRendererTurbo(this, 457, 257, textureX, textureY); // Box 167
        gunModel[517] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 207
        gunModel[518] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 207
        gunModel[519] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 207
        gunModel[520] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 207
        gunModel[521] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 63
        gunModel[522] = new ModelRendererTurbo(this, 22, 265, textureX, textureY); // Box 6
        gunModel[523] = new ModelRendererTurbo(this, 11, 273, textureX, textureY); // Box 1
        gunModel[524] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 135
        gunModel[525] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 141
        gunModel[526] = new ModelRendererTurbo(this, 23, 356, textureX, textureY); // Box 302
        gunModel[527] = new ModelRendererTurbo(this, 24, 350, textureX, textureY); // Box 303
        gunModel[528] = new ModelRendererTurbo(this, 1, 360, textureX, textureY); // Box 304
        gunModel[529] = new ModelRendererTurbo(this, 1, 354, textureX, textureY); // Box 305
        gunModel[530] = new ModelRendererTurbo(this, 1, 348, textureX, textureY); // Box 306
        gunModel[531] = new ModelRendererTurbo(this, 1, 342, textureX, textureY); // Box 302
        gunModel[532] = new ModelRendererTurbo(this, 1, 336, textureX, textureY); // Box 303
        gunModel[533] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Box 304
        gunModel[534] = new ModelRendererTurbo(this, 1, 331, textureX, textureY); // Box 305
        gunModel[535] = new ModelRendererTurbo(this, 1, 325, textureX, textureY); // Box 306
        gunModel[536] = new ModelRendererTurbo(this, 44, 324, textureX, textureY); // Box 321

        gunModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 318
        gunModel[500].setRotationPoint(107.5F, -36.5F, -0.5F);

        gunModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 318
        gunModel[501].setRotationPoint(108.5F, -36.5F, -0.5F);

        gunModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
        gunModel[502].setRotationPoint(108.5F, -37.5F, -0.5F);

        gunModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 318
        gunModel[503].setRotationPoint(107.5F, -38F, -0.5F);

        gunModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 318
        gunModel[504].setRotationPoint(107F, -38F, -0.5F);

        gunModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 318
        gunModel[505].setRotationPoint(107F, -36.5F, -0.5F);

        gunModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 318
        gunModel[506].setRotationPoint(107F, -37.5F, -0.5F);

        gunModel[507].addShapeBox(0F, 0F, 0F, 36, 2, 4, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        gunModel[507].setRotationPoint(-50F, -29F, -2F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 36, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 329
        gunModel[508].setRotationPoint(-50F, -32F, -3.5F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 36, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 330
        gunModel[509].setRotationPoint(-50F, -34F, -2F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 36, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 329
        gunModel[510].setRotationPoint(-50F, -27.5F, -2F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 167
        gunModel[511].setRotationPoint(45.25F, -25.5F, -4.5F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 167
        gunModel[512].setRotationPoint(45.25F, -25.5F, -4.5F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 167
        gunModel[513].setRotationPoint(45.25F, -25.5F, -4.5F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 167
        gunModel[514].setRotationPoint(19.5F, -21F, -4F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 167
        gunModel[515].setRotationPoint(19.5F, -21F, -4F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F); // Box 167
        gunModel[516].setRotationPoint(19.5F, -21F, -4F);

        gunModel[517].addShapeBox(-2F, -0.399999999999999F, -0.1F, 2, 1, 7, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F); // Box 207
        gunModel[517].setRotationPoint(7F, -25F, -3.25F);

        gunModel[518].addShapeBox(0.75F, -0.399999999999999F, 0.17F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 207
        gunModel[518].setRotationPoint(2F, -25F, 1.75F);
        gunModel[518].rotateAngleZ = 0.78539816F;

        gunModel[519].addShapeBox(0.4F, 0.45F, 0.17F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 207
        gunModel[519].setRotationPoint(2F, -25F, 1.75F);
        gunModel[519].rotateAngleZ = 0.78539816F;

        gunModel[520].addShapeBox(-0.5F, 0.85F, 0.17F, 1, 1, 2, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 207
        gunModel[520].setRotationPoint(2F, -25F, 1.75F);
        gunModel[520].rotateAngleZ = 0.78539816F;

        gunModel[521].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0.125F, 0.5F, 0F, 0.125F, 0.5F); // Box 63
        gunModel[521].setRotationPoint(50.5F, -26.5F, -5.5F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 6
        gunModel[522].setRotationPoint(72F, -36.5F, -2F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1
        gunModel[523].setRotationPoint(46F, -39.5F, -2.5F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, -0.75F, 1F, -1F, -0.75F, 1F, -1F, 0.25F, -1F, 1F, 0.25F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 1.25F, 0F, 0F, 1.25F); // Box 135
        gunModel[524].setRotationPoint(98F, -37F, 2F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, -0.75F, 1F, 1F, -0.75F, 1F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 141
        gunModel[525].setRotationPoint(98F, -37F, -3F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 3F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 3F, 0.25F, -0.25F, 3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 3F, -0.25F, 0.25F); // Box 302
        gunModel[526].setRotationPoint(97F, -37F, -2F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 3F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 3F, 0.25F, 0.25F, 3F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 3F, 0.25F, 0.25F); // Box 303
        gunModel[527].setRotationPoint(97F, -36F, -2F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 3F, -0.25F, 0.25F, 3F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 3F, -0.25F, -0.75F); // Box 304
        gunModel[528].setRotationPoint(97F, -34F, -1.5F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 3F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 3F, -0.25F, -0.75F, 3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 3F, -0.25F, 0.25F); // Box 305
        gunModel[529].setRotationPoint(97F, -38F, -1.5F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 3F, -0.25F, 0.25F, 3F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 3F, 0.25F, -0.25F); // Box 306
        gunModel[530].setRotationPoint(97F, -35F, -2F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F); // Box 302
        gunModel[531].setRotationPoint(87F, -32F, -2F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F, 0F, 0.25F, 0.375F, 0F, 0.25F, 0.375F, 0F, 0.25F, 0.375F, 0F, 0.25F, 0.375F, 0F, 0.25F, 0.375F, 0F, 0.25F, 0.375F, 0F, 0.25F, 0.375F, 0F, 0.25F, 0.375F); // Box 303
        gunModel[532].setRotationPoint(87F, -31F, -2F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F); // Box 304
        gunModel[533].setRotationPoint(87F, -29F, -1.5F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F); // Box 305
        gunModel[534].setRotationPoint(87F, -33F, -1.5F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Box 306
        gunModel[535].setRotationPoint(87F, -30F, -2F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 321
        gunModel[536].setRotationPoint(95.5F, -33F, -1F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 506
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 507
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 508
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 509
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 510
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 511
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 512
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 513
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 514
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 515
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 516
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 517
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 518
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 519
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 520
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 521
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 522
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 523
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 524
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 525
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 526
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 527
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 528
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 529
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 530
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 531
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 532
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 533
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 534
        defaultBarrelModel[29] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 535
        defaultBarrelModel[30] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 536
        defaultBarrelModel[31] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 537
        defaultBarrelModel[32] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 538
        defaultBarrelModel[33] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 539
        defaultBarrelModel[34] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 540
        defaultBarrelModel[35] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 541

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 506
        defaultBarrelModel[0].setRotationPoint(113F, -33F, -3F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 507
        defaultBarrelModel[1].setRotationPoint(113F, -31F, -3F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F); // Box 508
        defaultBarrelModel[2].setRotationPoint(113F, -34F, -1.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 509
        defaultBarrelModel[3].setRotationPoint(113F, -30F, -3F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 510
        defaultBarrelModel[4].setRotationPoint(113F, -28F, -1.5F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 511
        defaultBarrelModel[5].setRotationPoint(116F, -33F, -3F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 512
        defaultBarrelModel[6].setRotationPoint(116F, -31F, -3F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F); // Box 513
        defaultBarrelModel[7].setRotationPoint(116F, -34F, -1.5F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 514
        defaultBarrelModel[8].setRotationPoint(116F, -30F, -3F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 515
        defaultBarrelModel[9].setRotationPoint(116F, -28F, -1.5F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 516
        defaultBarrelModel[10].setRotationPoint(119F, -33F, -3F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 517
        defaultBarrelModel[11].setRotationPoint(119F, -31F, -3F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F); // Box 518
        defaultBarrelModel[12].setRotationPoint(119F, -34F, -1.5F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 519
        defaultBarrelModel[13].setRotationPoint(119F, -30F, -3F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 520
        defaultBarrelModel[14].setRotationPoint(119F, -28F, -1.5F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 521
        defaultBarrelModel[15].setRotationPoint(118F, -33F, -3F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 522
        defaultBarrelModel[16].setRotationPoint(118F, -31F, -3F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F); // Box 523
        defaultBarrelModel[17].setRotationPoint(118F, -34F, -1.5F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F); // Box 524
        defaultBarrelModel[18].setRotationPoint(118F, -30F, -3F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 525
        defaultBarrelModel[19].setRotationPoint(118F, -28F, -1.5F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 526
        defaultBarrelModel[20].setRotationPoint(115F, -33F, -3F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 527
        defaultBarrelModel[21].setRotationPoint(115F, -31F, -3F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F); // Box 528
        defaultBarrelModel[22].setRotationPoint(115F, -34F, -1.5F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F); // Box 529
        defaultBarrelModel[23].setRotationPoint(115F, -30F, -3F);

        defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, 0.375F, 0.625F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 530
        defaultBarrelModel[24].setRotationPoint(115F, -28F, -1.5F);

        defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 531
        defaultBarrelModel[25].setRotationPoint(129F, -31F, -3F);

        defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 532
        defaultBarrelModel[26].setRotationPoint(128F, -33F, -3F);

        defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 533
        defaultBarrelModel[27].setRotationPoint(128F, -30F, -3F);

        defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 534
        defaultBarrelModel[28].setRotationPoint(127.5F, -33F, -3F);

        defaultBarrelModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 535
        defaultBarrelModel[29].setRotationPoint(127.5F, -32F, -3F);

        defaultBarrelModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 536
        defaultBarrelModel[30].setRotationPoint(119.5F, -33F, -3F);

        defaultBarrelModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 537
        defaultBarrelModel[31].setRotationPoint(119.5F, -32F, -3F);

        defaultBarrelModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 538
        defaultBarrelModel[32].setRotationPoint(127.5F, -29F, -3F);

        defaultBarrelModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 539
        defaultBarrelModel[33].setRotationPoint(127.5F, -30F, -3F);

        defaultBarrelModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 540
        defaultBarrelModel[34].setRotationPoint(119.5F, -29F, -3F);

        defaultBarrelModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 541
        defaultBarrelModel[35].setRotationPoint(119.5F, -30F, -3F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 274
        defaultScopeModel[1] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 275
        defaultScopeModel[2] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 276
        defaultScopeModel[3] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 277
        defaultScopeModel[4] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 278
        defaultScopeModel[5] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 279
        defaultScopeModel[6] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 280
        defaultScopeModel[7] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 281
        defaultScopeModel[8] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 282
        defaultScopeModel[9] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 283
        defaultScopeModel[10] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 340
        defaultScopeModel[11] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 341
        defaultScopeModel[12] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 344
        defaultScopeModel[13] = new ModelRendererTurbo(this, 8, 265, textureX, textureY); // Box 350
        defaultScopeModel[14] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 351
        defaultScopeModel[15] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 353
        defaultScopeModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 354
        defaultScopeModel[17] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 355
        defaultScopeModel[18] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 356
        defaultScopeModel[19] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 357
        defaultScopeModel[20] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 358
        defaultScopeModel[21] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 359
        defaultScopeModel[22] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 360
        defaultScopeModel[23] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 361
        defaultScopeModel[24] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 479
        defaultScopeModel[25] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 480
        defaultScopeModel[26] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 481
        defaultScopeModel[27] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 482
        defaultScopeModel[28] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 483
        defaultScopeModel[29] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 484
        defaultScopeModel[30] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 485
        defaultScopeModel[31] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 486
        defaultScopeModel[32] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 487
        defaultScopeModel[33] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 488
        defaultScopeModel[34] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 489
        defaultScopeModel[35] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 490
        defaultScopeModel[36] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 491
        defaultScopeModel[37] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 492
        defaultScopeModel[38] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 493
        defaultScopeModel[39] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 494
        defaultScopeModel[40] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 495
        defaultScopeModel[41] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 496
        defaultScopeModel[42] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 497
        defaultScopeModel[43] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 498
        defaultScopeModel[44] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 499
        defaultScopeModel[45] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 500
        defaultScopeModel[46] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 501
        defaultScopeModel[47] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 551
        defaultScopeModel[48] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 552
        defaultScopeModel[49] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 553
        defaultScopeModel[50] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 554
        defaultScopeModel[51] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 555
        defaultScopeModel[52] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 556
        defaultScopeModel[53] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 557
        defaultScopeModel[54] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 588
        defaultScopeModel[55] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 589
        defaultScopeModel[56] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 590
        defaultScopeModel[57] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 340
        defaultScopeModel[58] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 340
        defaultScopeModel[59] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 340
        defaultScopeModel[60] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 340
        defaultScopeModel[61] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 340
        defaultScopeModel[62] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 340
        defaultScopeModel[63] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 340
        defaultScopeModel[64] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 340
        defaultScopeModel[65] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 340
        defaultScopeModel[66] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 340
        defaultScopeModel[67] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 340
        defaultScopeModel[68] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 588
        defaultScopeModel[69] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 589
        defaultScopeModel[70] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 590
        defaultScopeModel[71] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 340
        defaultScopeModel[72] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 351
        defaultScopeModel[73] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 340
        defaultScopeModel[74] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 340
        defaultScopeModel[75] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 340
        defaultScopeModel[76] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 340
        defaultScopeModel[77] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 340
        defaultScopeModel[78] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 340
        defaultScopeModel[79] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 340
        defaultScopeModel[80] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 340
        defaultScopeModel[81] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 340
        defaultScopeModel[82] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 340
        defaultScopeModel[83] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 340
        defaultScopeModel[84] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 340
        defaultScopeModel[85] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 340
        defaultScopeModel[86] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 340
        defaultScopeModel[87] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 350
        defaultScopeModel[88] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 350
        defaultScopeModel[89] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Box 350
        defaultScopeModel[90] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 479
        defaultScopeModel[91] = new ModelRendererTurbo(this, 6, 278, textureX, textureY); // Box 354
        defaultScopeModel[92] = new ModelRendererTurbo(this, 1, 277, textureX, textureY); // Box 355
        defaultScopeModel[93] = new ModelRendererTurbo(this, 11, 275, textureX, textureY); // Box 354
        defaultScopeModel[94] = new ModelRendererTurbo(this, 6, 275, textureX, textureY); // Box 355
        defaultScopeModel[95] = new ModelRendererTurbo(this, 11, 272, textureX, textureY); // Box 354
        defaultScopeModel[96] = new ModelRendererTurbo(this, 6, 272, textureX, textureY); // Box 355
        defaultScopeModel[97] = new ModelRendererTurbo(this, 11, 269, textureX, textureY); // Box 354
        defaultScopeModel[98] = new ModelRendererTurbo(this, 6, 269, textureX, textureY); // Box 355
        defaultScopeModel[99] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 350
        defaultScopeModel[100] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 351
        defaultScopeModel[101] = new ModelRendererTurbo(this, 1, 269, textureX, textureY); // Box 351
        defaultScopeModel[102] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 350
        defaultScopeModel[103] = new ModelRendererTurbo(this, 15, 265, textureX, textureY); // Box 350
        defaultScopeModel[104] = new ModelRendererTurbo(this, 20, 265, textureX, textureY); // Box 350
        defaultScopeModel[105] = new ModelRendererTurbo(this, 15, 265, textureX, textureY); // Box 350

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 274
        defaultScopeModel[0].setRotationPoint(-4F, -40.5F, -3F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
        defaultScopeModel[1].setRotationPoint(-4F, -41.5F, -3F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Box 276
        defaultScopeModel[2].setRotationPoint(-4F, -42.5F, -3F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 277
        defaultScopeModel[3].setRotationPoint(-4F, -43.5F, -3F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 278
        defaultScopeModel[4].setRotationPoint(-6F, -43.5F, 2F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
        defaultScopeModel[5].setRotationPoint(-6.5F, -42.5F, 2F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 280
        defaultScopeModel[6].setRotationPoint(-6.5F, -41F, 2F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 281
        defaultScopeModel[7].setRotationPoint(-6F, -43.5F, -3F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        defaultScopeModel[8].setRotationPoint(-6.5F, -42.5F, -3F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 283
        defaultScopeModel[9].setRotationPoint(-6.5F, -41F, -3F);

        defaultScopeModel[10].addShapeBox(0F, -3.5F, -1.5F, 1, 4, 3, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 340
        defaultScopeModel[10].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[11].addShapeBox(-0.5F, 0.5F, -1.5F, 1, 1, 3, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
        defaultScopeModel[11].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 344
        defaultScopeModel[12].setRotationPoint(-5.5F, -41F, -2F);

        defaultScopeModel[13].addShapeBox(-1F, -6F, -1F, 1, 1, 2, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 350
        defaultScopeModel[13].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[14].addShapeBox(-1F, -7.75F, 1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 351
        defaultScopeModel[14].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[15].addShapeBox(-1F, -8.25F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 353
        defaultScopeModel[15].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[16].addShapeBox(-1F, -6F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.25F, 0.125F, 0F, 0.25F, 0.125F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 354
        defaultScopeModel[16].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[17].addShapeBox(-1F, -7F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 355
        defaultScopeModel[17].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[18].addShapeBox(-1F, -6F, -1F, 1, 1, 1, 0F, 0F, 0.25F, 0.125F, 0F, 0.25F, 0.125F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F); // Box 356
        defaultScopeModel[18].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[19].addShapeBox(-1F, -7F, -1F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 357
        defaultScopeModel[19].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[20].addShapeBox(-1F, -8.5F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.25F, 0.125F, 0F, 0.25F, 0.125F); // Box 358
        defaultScopeModel[20].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[21].addShapeBox(-1F, -7.5F, 0F, 1, 1, 1, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 359
        defaultScopeModel[21].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[22].addShapeBox(-1F, -8.5F, -1F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0.125F, 0F, 0.25F, 0.125F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 360
        defaultScopeModel[22].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[23].addShapeBox(-1F, -7.5F, -1F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F); // Box 361
        defaultScopeModel[23].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 1F, 0F, -0.125F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 479
        defaultScopeModel[24].setRotationPoint(90.5F, -39F, 2F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 480
        defaultScopeModel[25].setRotationPoint(89.5F, -39F, 2F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1F, -0.125F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -1F, -0.125F); // Box 481
        defaultScopeModel[26].setRotationPoint(89.5F, -39F, -4F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 482
        defaultScopeModel[27].setRotationPoint(90.5F, -39F, -4F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
        defaultScopeModel[28].setRotationPoint(90.5F, -40F, 2F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.625F, 0.5F, 0F, -0.625F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 484
        defaultScopeModel[29].setRotationPoint(90.5F, -41F, 2F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 485
        defaultScopeModel[30].setRotationPoint(90.5F, -40F, 2F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.5F, 0F, -0.625F, -2.5F, 0F, -0.625F, -2.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.625F, 1F, 0F, -0.625F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 486
        defaultScopeModel[31].setRotationPoint(90.5F, -42F, 2F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, -0.625F, 1F, 0F, -0.625F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 487
        defaultScopeModel[32].setRotationPoint(91F, -43F, 2F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 488
        defaultScopeModel[33].setRotationPoint(90.5F, -40F, -4F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 489
        defaultScopeModel[34].setRotationPoint(90.5F, -41F, -3F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 490
        defaultScopeModel[35].setRotationPoint(90.5F, -40F, -3F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 491
        defaultScopeModel[36].setRotationPoint(90.5F, -42F, -3F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 492
        defaultScopeModel[37].setRotationPoint(91F, -43F, -3F);

        defaultScopeModel[38].addShapeBox(-0.5F, -1F, -2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
        defaultScopeModel[38].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[39].addShapeBox(-0.5F, -6F, -1.5F, 3, 4, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
        defaultScopeModel[39].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[40].addShapeBox(-0.5F, -2F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 495
        defaultScopeModel[40].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[41].addShapeBox(0.5F, -9F, -0.5F, 1, 3, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 496
        defaultScopeModel[41].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[42].addShapeBox(-0.5F, -7F, 0.5F, 3, 1, 1, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.625F, 0.5F, 0F, -0.625F, 0.5F); // Box 497
        defaultScopeModel[42].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[43].addShapeBox(-0.5F, -9F, 1.5F, 3, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 498
        defaultScopeModel[43].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[44].addShapeBox(-0.5F, -8F, 1.5F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.375F, -0.5F, 0F, 0.375F, -0.5F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F); // Box 499
        defaultScopeModel[44].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[45].addShapeBox(-0.5F, -11F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 500
        defaultScopeModel[45].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[46].addShapeBox(1.5F, -11F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 501
        defaultScopeModel[46].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[47].addShapeBox(-0.5F, -11F, 0.5F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.625F, 0.5F, 0F, -0.625F, 0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
        defaultScopeModel[47].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[48].addShapeBox(-0.5F, -10F, 1.5F, 3, 1, 1, 0F, 0F, 0.375F, -0.5F, 0F, 0.375F, -0.5F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F); // Box 552
        defaultScopeModel[48].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[49].addShapeBox(-0.5F, -7F, -1.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.625F, 0.5F, 0F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 553
        defaultScopeModel[49].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[50].addShapeBox(-0.5F, -9F, -2.5F, 3, 1, 1, 0F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 554
        defaultScopeModel[50].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[51].addShapeBox(-0.5F, -8F, -2.5F, 3, 1, 1, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, 0F, 0.375F, -0.5F, 0F, 0.375F, -0.5F); // Box 555
        defaultScopeModel[51].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[52].addShapeBox(-0.5F, -11F, -1.5F, 3, 1, 1, 0F, 0F, -0.625F, 0.5F, 0F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 556
        defaultScopeModel[52].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[53].addShapeBox(-0.5F, -10F, -2.5F, 3, 1, 1, 0F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, 0F, 0.375F, -0.5F, 0F, 0.375F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 557
        defaultScopeModel[53].setRotationPoint(91.5F, -40F, 0F);

        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 588
        defaultScopeModel[54].setRotationPoint(-6F, -42F, -3.5F);

        defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 589
        defaultScopeModel[55].setRotationPoint(-6F, -43F, -3.5F);

        defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F); // Box 590
        defaultScopeModel[56].setRotationPoint(-6F, -41F, -3.5F);

        defaultScopeModel[57].addShapeBox(-1F, -0.5F, -1.5F, 1, 1, 3, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
        defaultScopeModel[57].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[58].addShapeBox(-1F, -5.5F, 0.5F, 1, 1, 1, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 340
        defaultScopeModel[58].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[59].addShapeBox(-1F, -4.5F, 0.5F, 1, 4, 1, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340
        defaultScopeModel[59].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[60].addShapeBox(-1F, -4.5F, -1.5F, 1, 4, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 340
        defaultScopeModel[60].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[61].addShapeBox(-1F, -5.5F, 0.5F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340
        defaultScopeModel[61].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[62].addShapeBox(-1F, -5.5F, -1.5F, 1, 1, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 340
        defaultScopeModel[62].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[63].addShapeBox(-1F, -5.5F, -1.5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 340
        defaultScopeModel[63].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[64].addShapeBox(-1F, -0.5F, 0.5F, 1, 1, 1, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 340
        defaultScopeModel[64].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[65].addShapeBox(-1F, -0.5F, 0.5F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 340
        defaultScopeModel[65].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[66].addShapeBox(-1F, -0.5F, -1.5F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 340
        defaultScopeModel[66].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[67].addShapeBox(-1F, -0.5F, -1.5F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 340
        defaultScopeModel[67].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 588
        defaultScopeModel[68].setRotationPoint(-6F, -42F, 1.5F);

        defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 589
        defaultScopeModel[69].setRotationPoint(-6F, -43F, 1.5F);

        defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F); // Box 590
        defaultScopeModel[70].setRotationPoint(-6F, -41F, 1.5F);

        defaultScopeModel[71].addShapeBox(-1F, -4.5F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 340
        defaultScopeModel[71].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[72].addShapeBox(-1F, -7.75F, -2F, 1, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 351
        defaultScopeModel[72].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[73].addShapeBox(-1F, -4.5F, -2.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 340
        defaultScopeModel[73].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[74].addShapeBox(0F, -8.25F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 340
        defaultScopeModel[74].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[75].addShapeBox(0F, -7.25F, -2.5F, 1, 1, 1, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 340
        defaultScopeModel[75].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[76].addShapeBox(0F, -8.25F, -1.5F, 1, 1, 1, 0F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F); // Box 340
        defaultScopeModel[76].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[77].addShapeBox(0F, -6.25F, -2.5F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 340
        defaultScopeModel[77].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[78].addShapeBox(0F, -4.25F, -0.5F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 340
        defaultScopeModel[78].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[79].addShapeBox(0F, -5.25F, -2.5F, 1, 1, 1, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F); // Box 340
        defaultScopeModel[79].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[80].addShapeBox(0F, -4.25F, -1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 340
        defaultScopeModel[80].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[81].addShapeBox(0F, -7.25F, 1.5F, 1, 1, 1, 0F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F); // Box 340
        defaultScopeModel[81].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[82].addShapeBox(0F, -8.25F, 0.5F, 1, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
        defaultScopeModel[82].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[83].addShapeBox(0F, -6.25F, 1.5F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 340
        defaultScopeModel[83].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[84].addShapeBox(0F, -5.25F, 1.5F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, 0F, -0.875F, 0F, 0F, -0.875F, 0F); // Box 340
        defaultScopeModel[84].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[85].addShapeBox(0F, -4.25F, 0.5F, 1, 1, 1, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 340
        defaultScopeModel[85].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[86].addShapeBox(0F, -5F, -1.5F, 1, 1, 3, 0F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.75F, 0.25F, 0F); // Box 340
        defaultScopeModel[86].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[87].addShapeBox(-1.25F, -5.82F, -0.5F, 1, 1, 1, 0F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F); // Box 350
        defaultScopeModel[87].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[88].addShapeBox(-1.25F, -5.82F, -0.5F, 1, 1, 1, 0F, 0F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F); // Box 350
        defaultScopeModel[88].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[89].addShapeBox(-1.25F, -5.82F, -0.5F, 1, 1, 1, 0F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, 0F, -0.625F, -0.125F); // Box 350
        defaultScopeModel[89].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 1F, 0F, 0.125F, 1F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 479
        defaultScopeModel[90].setRotationPoint(97.5F, -39F, -2F);

        defaultScopeModel[91].addShapeBox(-1F, -6.5F, -0.37F, 1, 1, 1, 0F, -0.25F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, 0F, -0.25F, -0.875F, 0F); // Box 354
        defaultScopeModel[91].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[92].addShapeBox(-1F, -7.5F, -0.37F, 1, 1, 1, 0F, -0.25F, -1.125F, -0.75F, 0F, -1.125F, -0.75F, 0F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 355
        defaultScopeModel[92].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[93].addShapeBox(-1F, -8F, -0.37F, 1, 1, 1, 0F, -0.25F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 354
        defaultScopeModel[93].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[94].addShapeBox(-1F, -7F, -0.37F, 1, 1, 1, 0F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -1.125F, -0.75F, 0F, -1.125F, -0.75F, 0F, -1.125F, 0F, -0.25F, -1.125F, 0F); // Box 355
        defaultScopeModel[94].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[95].addShapeBox(-1F, -6.5F, -0.63F, 1, 1, 1, 0F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, -0.875F, -0.25F, 0.125F, -0.875F, -0.25F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F); // Box 354
        defaultScopeModel[95].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[96].addShapeBox(-1F, -7.5F, -0.63F, 1, 1, 1, 0F, -0.25F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.75F, -0.25F, -1.125F, -0.75F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F); // Box 355
        defaultScopeModel[96].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[97].addShapeBox(-1F, -8F, -0.63F, 1, 1, 1, 0F, -0.25F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, -0.875F, -0.25F, 0.125F, -0.875F); // Box 354
        defaultScopeModel[97].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[98].addShapeBox(-1F, -7F, -0.63F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.75F, -0.25F, -1.125F, -0.75F); // Box 355
        defaultScopeModel[98].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[99].addShapeBox(-1F, -6F, -1F, 1, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
        defaultScopeModel[99].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[100].addShapeBox(-1F, -7.75F, -2F, 1, 2, 1, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 351
        defaultScopeModel[100].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[101].addShapeBox(-1F, -7.75F, 1F, 1, 2, 1, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 351
        defaultScopeModel[101].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[102].addShapeBox(-1F, -8.5F, -1F, 1, 1, 2, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 350
        defaultScopeModel[102].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[103].addShapeBox(-0.770000000000003F, -7.25F, 0.25F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 350
        defaultScopeModel[103].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[104].addShapeBox(-0.770000000000003F, -7.25F, -1.25F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 350
        defaultScopeModel[104].setRotationPoint(-5F, -41.5F, 0F);

        defaultScopeModel[105].addShapeBox(0.25F, -8.95F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.325F, -0.325F, -0.5F, -0.325F, -0.325F, -0.5F, -0.325F, -0.325F, -0.2F, -0.325F, -0.325F, -0.1F, -0.325F, -0.325F, -0.5F, -0.325F, -0.325F, -0.5F, -0.325F, -0.325F, -0.1F, -0.325F, -0.325F); // Box 350
        defaultScopeModel[105].setRotationPoint(91.5F, -40F, 0F);
    }

    private void initdefaultStockModel_1() {
        defaultStockModel[0] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 543
        defaultStockModel[1] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 544
        defaultStockModel[2] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 545
        defaultStockModel[3] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 546
        defaultStockModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 547
        defaultStockModel[5] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 548
        defaultStockModel[6] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 549
        defaultStockModel[7] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 550
        defaultStockModel[8] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 560
        defaultStockModel[9] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 561
        defaultStockModel[10] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 562
        defaultStockModel[11] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 563
        defaultStockModel[12] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 564
        defaultStockModel[13] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 565
        defaultStockModel[14] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 566
        defaultStockModel[15] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 567
        defaultStockModel[16] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 568
        defaultStockModel[17] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 569
        defaultStockModel[18] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 570
        defaultStockModel[19] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 571
        defaultStockModel[20] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 572
        defaultStockModel[21] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 573
        defaultStockModel[22] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 574
        defaultStockModel[23] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 575
        defaultStockModel[24] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 576
        defaultStockModel[25] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 577
        defaultStockModel[26] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 578
        defaultStockModel[27] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 579
        defaultStockModel[28] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 580
        defaultStockModel[29] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 581
        defaultStockModel[30] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 582
        defaultStockModel[31] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 583
        defaultStockModel[32] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 584
        defaultStockModel[33] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 581
        defaultStockModel[34] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 548

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 38, 3, 6, 0F, 0F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0.875F, 0F, 1.5F, 0.875F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 543
        defaultStockModel[0].setRotationPoint(-55F, -35.5F, -3F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 38, 1, 4, 0F, 0F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 1F, 0F, 0F, 1F); // Box 544
        defaultStockModel[1].setRotationPoint(-55F, -36F, -2F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 39, 2, 9, 0F, 0F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0F, 0F, 0F); // Box 545
        defaultStockModel[2].setRotationPoint(-55F, -32F, -4.5F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 42, 2, 6, 0F, 0F, 0.5F, 1.5F, -0.125F, 0.5F, 1.5F, -0.125F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Box 546
        defaultStockModel[3].setRotationPoint(-57F, -29.5F, -3F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 42, 3, 6, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Box 547
        defaultStockModel[4].setRotationPoint(-57F, -27.5F, -3F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 39, 2, 4, 0F, 0F, 0F, 1F, -0.125F, 0F, 1F, -0.125F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Box 548
        defaultStockModel[5].setRotationPoint(-54F, -24.5F, -2F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
        defaultStockModel[6].setRotationPoint(-39F, -24.5F, -3F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 550
        defaultStockModel[7].setRotationPoint(-39F, -21.5F, -3F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 560
        defaultStockModel[8].setRotationPoint(-55F, -12.5F, -3F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, 0F, 7F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 7F, 0F); // Box 561
        defaultStockModel[9].setRotationPoint(-48F, -19.5F, -3F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
        defaultStockModel[10].setRotationPoint(-57F, -24.5F, -3F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 563
        defaultStockModel[11].setRotationPoint(-54F, -13.5F, -2F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 1F, -7F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 1F, -7F, 0F, 0.5F, 7F, 1F, 2.5F, 0F, 1F, 2.5F, 0F, 1F, 0.5F, 7F, 1F); // Box 564
        defaultStockModel[12].setRotationPoint(-48.5F, -20.5F, -2F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 565
        defaultStockModel[13].setRotationPoint(-41F, -21.5F, -2F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 1F, -1F, 0F, -3F, 1F, 1F, -3F, 1F, 1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 566
        defaultStockModel[14].setRotationPoint(-41F, -23.5F, -2F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
        defaultStockModel[15].setRotationPoint(-55F, -9.5F, -3F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 568
        defaultStockModel[16].setRotationPoint(-48F, -9.5F, -2F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 2, 15, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 20F, 0F, 1F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 1F); // Box 569
        defaultStockModel[17].setRotationPoint(-28F, -24.5F, -2F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 570
        defaultStockModel[18].setRotationPoint(-48F, -7.5F, -2F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
        defaultStockModel[19].setRotationPoint(-55F, -7.5F, -2F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 572
        defaultStockModel[20].setRotationPoint(-57F, -7.5F, -2F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 573
        defaultStockModel[21].setRotationPoint(-57F, -12.5F, -3F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 574
        defaultStockModel[22].setRotationPoint(-57F, -15.5F, -3F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 1F, -0.5F, 0F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 1F, -0.5F, 0F); // Box 575
        defaultStockModel[23].setRotationPoint(-57F, -30F, -3.5F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 576
        defaultStockModel[24].setRotationPoint(-57F, -32F, -4.5F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0.5F); // Box 577
        defaultStockModel[25].setRotationPoint(-57F, -35F, -4.5F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 0F, 0F, 2F); // Box 578
        defaultStockModel[26].setRotationPoint(-57F, -37F, -3F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 5, 28, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 579
        defaultStockModel[27].setRotationPoint(-62F, -35F, -5F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -0.5F, 0F, 1F, 1.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 1.5F); // Box 580
        defaultStockModel[28].setRotationPoint(-57F, -37F, -3.5F);

        defaultStockModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 581
        defaultStockModel[29].setRotationPoint(-62F, -37F, -3F);

        defaultStockModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
        defaultStockModel[30].setRotationPoint(-59F, -7F, -3F);

        defaultStockModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
        defaultStockModel[31].setRotationPoint(-62F, -7F, -2.5F);

        defaultStockModel[32].addShapeBox(0F, 0F, 0F, 3, 28, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 584
        defaultStockModel[32].setRotationPoint(-65F, -35F, -4.5F);

        defaultStockModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 2F); // Box 581
        defaultStockModel[33].setRotationPoint(-64F, -37F, -2.5F);

        defaultStockModel[34].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
        defaultStockModel[34].setRotationPoint(-51F, -22.5F, -2F);
    }

    private void initextraAmmoModel_1() {
        extraAmmoModel[0] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 688
        extraAmmoModel[1] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 688
        extraAmmoModel[2] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 688
        extraAmmoModel[3] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 688
        extraAmmoModel[4] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 688
        extraAmmoModel[5] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 688
        extraAmmoModel[6] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 688
        extraAmmoModel[7] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 688
        extraAmmoModel[8] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 688
        extraAmmoModel[9] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 688
        extraAmmoModel[10] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 688
        extraAmmoModel[11] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 688
        extraAmmoModel[12] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 688
        extraAmmoModel[13] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 688
        extraAmmoModel[14] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 688
        extraAmmoModel[15] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 688
        extraAmmoModel[16] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 688
        extraAmmoModel[17] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 688
        extraAmmoModel[18] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 688
        extraAmmoModel[19] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 688
        extraAmmoModel[20] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 688
        extraAmmoModel[21] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 688
        extraAmmoModel[22] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Box 688
        extraAmmoModel[23] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 688
        extraAmmoModel[24] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 688
        extraAmmoModel[25] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 688
        extraAmmoModel[26] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 688
        extraAmmoModel[27] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 688
        extraAmmoModel[28] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 688
        extraAmmoModel[29] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 688
        extraAmmoModel[30] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 688
        extraAmmoModel[31] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 688
        extraAmmoModel[32] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 688
        extraAmmoModel[33] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 688
        extraAmmoModel[34] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 688
        extraAmmoModel[35] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 688
        extraAmmoModel[36] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 688
        extraAmmoModel[37] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 688
        extraAmmoModel[38] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 688
        extraAmmoModel[39] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 688
        extraAmmoModel[40] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 688
        extraAmmoModel[41] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 688
        extraAmmoModel[42] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 688
        extraAmmoModel[43] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 688
        extraAmmoModel[44] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Box 688
        extraAmmoModel[45] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 688
        extraAmmoModel[46] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 688
        extraAmmoModel[47] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 688
        extraAmmoModel[48] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 688
        extraAmmoModel[49] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 688
        extraAmmoModel[50] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 688
        extraAmmoModel[51] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 688
        extraAmmoModel[52] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 688
        extraAmmoModel[53] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 688
        extraAmmoModel[54] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 688
        extraAmmoModel[55] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 688
        extraAmmoModel[56] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 688
        extraAmmoModel[57] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 688
        extraAmmoModel[58] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 688
        extraAmmoModel[59] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 688
        extraAmmoModel[60] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 688
        extraAmmoModel[61] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 688
        extraAmmoModel[62] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 688
        extraAmmoModel[63] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 688

        extraAmmoModel[0].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 688
        extraAmmoModel[0].setRotationPoint(41.75F, -31.5F, -1.5F);

        extraAmmoModel[1].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[1].setRotationPoint(36.75F, -31.5F, 1.5F);

        extraAmmoModel[2].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, 0.5F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, -0.5F, 0.5F, -2F, -0.5F, 0F, 3F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -0.5F, 0F, 3F, -0.5F); // Box 688
        extraAmmoModel[2].setRotationPoint(25.75F, -31.5F, 1.5F);

        extraAmmoModel[3].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, 0.5F, -2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 688
        extraAmmoModel[3].setRotationPoint(24.25F, -31.5F, -2F);

        extraAmmoModel[4].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F, 0F, 0.5F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 1F, -1F, -0.25F, 1F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 688
        extraAmmoModel[4].setRotationPoint(36.75F, -24.5F, -2.5F);

        extraAmmoModel[5].addShapeBox(0F, 0F, 0F, 9, 9, 6, 0F, 1F, -3F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, -3F, 0F, -0.25F, 3.25F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.25F, 3.25F, 0F); // Box 688
        extraAmmoModel[5].setRotationPoint(26.75F, -24.5F, -3F);

        extraAmmoModel[6].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F, 1.25F, -3.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, -3.25F, 0F, -0.75F, 4F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.75F, 4F, 0F); // Box 688
        extraAmmoModel[6].setRotationPoint(28.25F, -15.5F, -3F);

        extraAmmoModel[7].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F, 2F, -1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 2F, -1F, -0.25F, 0F, 0F, -0.25F, 0.75F, -1.5F, -0.25F, 0.75F, -1.5F, -0.25F, 0F, 0F, -0.25F); // Box 688
        extraAmmoModel[7].setRotationPoint(38.75F, -16.5F, -2.5F);

        extraAmmoModel[8].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F, 1.25F, -4F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, -4F, 0F, -1.5F, 4.75F, 0F, 3.5F, 1.25F, 0F, 3.5F, 1.25F, 0F, -1.5F, 4.75F, 0F); // Box 688
        extraAmmoModel[8].setRotationPoint(30.25F, -8.5F, -3F);

        extraAmmoModel[9].addShapeBox(0F, 0F, 0F, 6, 7, 5, 0F, 2F, -1.5F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 2F, -1.5F, -0.25F, -0.5F, 2.25F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 2.25F, -0.25F); // Box 688
        extraAmmoModel[9].setRotationPoint(40.75F, -9F, -2.5F);

        extraAmmoModel[10].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 1.5F, -2.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1.5F, -2.25F, -0.25F, -1.5F, 1.75F, -0.25F, 2.5F, -0.5F, -0.25F, 2.5F, -0.5F, -0.25F, -1.5F, 1.75F, -0.25F); // Box 688
        extraAmmoModel[10].setRotationPoint(42.75F, -2F, -2.5F);

        extraAmmoModel[11].addShapeBox(0F, 0F, 0F, 9, 8, 6, 0F, 1.5F, -4.75F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 1.5F, -4.75F, 0F, -2F, 4.25F, 0F, 4F, 0.75F, 0F, 4F, 0.75F, 0F, -2F, 4.25F, 0F); // Box 688
        extraAmmoModel[11].setRotationPoint(33.25F, -1.5F, -3F);

        extraAmmoModel[12].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 1.5F, -2.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 1.5F, -2.25F, -0.25F, -1.5F, 1.75F, -0.25F, 3F, -1.25F, -0.25F, 3F, -2F, -0.25F, -1.5F, 1.75F, -0.25F); // Box 688
        extraAmmoModel[12].setRotationPoint(45.75F, 5F, -2.5F);

        extraAmmoModel[13].addShapeBox(0F, 0F, 0F, 9, 8, 6, 0F, 1.5F, -4.75F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 1.5F, -4.75F, 0F, -3.25F, 5.25F, 0F, 5F, 0.25F, 0F, 5F, 0.25F, 0F, -3.25F, 5.25F, 0F); // Box 688
        extraAmmoModel[13].setRotationPoint(36.75F, 6F, -3F);

        extraAmmoModel[14].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 688
        extraAmmoModel[14].setRotationPoint(36.75F, -31.5F, -2.5F);

        extraAmmoModel[15].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, 0.5F, -2F, -0.5F, 1F, -2F, -0.5F, 1F, -2F, 0F, 0.5F, -2F, 0F, 0F, 3F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, 0F, 0F, 3F, 0F); // Box 688
        extraAmmoModel[15].setRotationPoint(25.75F, -31.5F, -3.5F);

        extraAmmoModel[16].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1.25F, 0.25F, 1F, 1.25F, 0.25F, 1F, -0.5F, 0.5F, 0F); // Box 688
        extraAmmoModel[16].setRotationPoint(24.75F, -21.5F, -2F);

        extraAmmoModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, -0.25F, 0F, -1.25F, 0.25F, 0F, 2F, -0.25F, 1F, 2F, -0.25F, 1F, -1.25F, 0.25F, 0F); // Box 688
        extraAmmoModel[17].setRotationPoint(26F, -12.25F, -2F);

        extraAmmoModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.75F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, -0.5F, 0F, -2F, 0.5F, 0F, 2.75F, -0.25F, 1F, 2.75F, -0.25F, 1F, -2F, 0.5F, 0F); // Box 688
        extraAmmoModel[18].setRotationPoint(28F, -4.5F, -2F);

        extraAmmoModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.75F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, -0.75F, 0F, -2.625F, 0F, 0F, 3.5F, -0.5F, 1F, 3.5F, -0.5F, 1F, -2.625F, 0F, 0F); // Box 688
        extraAmmoModel[19].setRotationPoint(30.75F, 3.25F, -2F);

        extraAmmoModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.875F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.875F, -0.5F, 0F, -4.25F, 2F, 0F, 4.75F, 0.5F, 1F, 4.75F, 0.5F, 1F, -4.25F, 2F, 0F); // Box 688
        extraAmmoModel[20].setRotationPoint(34.25F, 10.75F, -2F);

        extraAmmoModel[21].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F, 0F, -9.5F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -9.5F, 0F, -1F, 9.5F, 0F, 1.625F, -0.25F, 0F, 1.625F, -0.25F, 0F, -1F, 9.5F, 0F); // Box 688
        extraAmmoModel[21].setRotationPoint(38.75F, 10F, -3F);

        extraAmmoModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F, 0.5F, -8.75F, 0.25F, 0.25F, -2.75F, 0.25F, 0.25F, -2.75F, 0.25F, 0.5F, -8.75F, 0.25F, -1F, 9F, 0.25F, 1.5F, 2.75F, 0.25F, 1.5F, 2.75F, 0.25F, -1F, 9F, 0.25F); // Box 688
        extraAmmoModel[22].setRotationPoint(39.75F, 10F, -3.5F);

        extraAmmoModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0.5F, -0.25F, -1.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, 0.5F, -0.25F, -1.25F, -1F, 0.5F, -1.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, -1F, 0.5F, -1.25F); // Box 688
        extraAmmoModel[23].setRotationPoint(37.75F, 19.5F, -3.5F);

        extraAmmoModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 688
        extraAmmoModel[24].setRotationPoint(25.25F, -30.5F, 1.5F);

        extraAmmoModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 688
        extraAmmoModel[25].setRotationPoint(25.25F, -31.5F, 1.5F);

        extraAmmoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F); // Box 688
        extraAmmoModel[26].setRotationPoint(24.25F, -30.5F, 1F);

        extraAmmoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0.5F, 0.25F, 0F); // Box 688
        extraAmmoModel[27].setRotationPoint(24.25F, -31.5F, 1F);

        extraAmmoModel[28].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 688
        extraAmmoModel[28].setRotationPoint(25.25F, -30.5F, -3.5F);

        extraAmmoModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        extraAmmoModel[29].setRotationPoint(25.25F, -31.5F, -3.5F);

        extraAmmoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F); // Box 688
        extraAmmoModel[30].setRotationPoint(24.25F, -30.5F, -2F);

        extraAmmoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0.5F, 0F, 0F); // Box 688
        extraAmmoModel[31].setRotationPoint(24.25F, -31.5F, -2F);

        extraAmmoModel[32].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[32].setRotationPoint(23.75F, -22.25F, 0F);
        extraAmmoModel[32].rotateAngleZ = 0.15707963F;

        extraAmmoModel[33].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        extraAmmoModel[33].setRotationPoint(23.75F, -22.25F, 0F);
        extraAmmoModel[33].rotateAngleZ = 0.15707963F;

        extraAmmoModel[34].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        extraAmmoModel[34].setRotationPoint(23.75F, -22.25F, 0F);
        extraAmmoModel[34].rotateAngleZ = 0.15707963F;

        extraAmmoModel[35].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        extraAmmoModel[35].setRotationPoint(23.75F, -22.25F, 0F);
        extraAmmoModel[35].rotateAngleZ = 0.15707963F;

        extraAmmoModel[36].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[36].setRotationPoint(23.75F, -22.25F, 0F);
        extraAmmoModel[36].rotateAngleZ = 0.15707963F;

        extraAmmoModel[37].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 688
        extraAmmoModel[37].setRotationPoint(23.75F, -22.25F, 0F);
        extraAmmoModel[37].rotateAngleZ = 0.15707963F;

        extraAmmoModel[38].addShapeBox(0F, 2.77555756156289E-17F, 0F, 3, 5, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 688
        extraAmmoModel[38].setRotationPoint(27.5F, -28F, 2.5F);

        extraAmmoModel[39].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[39].setRotationPoint(25F, -13.5F, 0F);
        extraAmmoModel[39].rotateAngleZ = 0.19198622F;

        extraAmmoModel[40].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        extraAmmoModel[40].setRotationPoint(25F, -13.5F, 0F);
        extraAmmoModel[40].rotateAngleZ = 0.19198622F;

        extraAmmoModel[41].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        extraAmmoModel[41].setRotationPoint(25F, -13.5F, 0F);
        extraAmmoModel[41].rotateAngleZ = 0.19198622F;

        extraAmmoModel[42].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        extraAmmoModel[42].setRotationPoint(25F, -13.5F, 0F);
        extraAmmoModel[42].rotateAngleZ = 0.19198622F;

        extraAmmoModel[43].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0.125F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0.125F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[43].setRotationPoint(25F, -13.5F, 0F);
        extraAmmoModel[43].rotateAngleZ = 0.19198622F;

        extraAmmoModel[44].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 688
        extraAmmoModel[44].setRotationPoint(25F, -13.5F, 0F);
        extraAmmoModel[44].rotateAngleZ = 0.19198622F;

        extraAmmoModel[45].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[45].setRotationPoint(26.75F, -4.75F, 0F);
        extraAmmoModel[45].rotateAngleZ = 0.2443461F;

        extraAmmoModel[46].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        extraAmmoModel[46].setRotationPoint(26.75F, -4.75F, 0F);
        extraAmmoModel[46].rotateAngleZ = 0.2443461F;

        extraAmmoModel[47].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        extraAmmoModel[47].setRotationPoint(26.75F, -4.75F, 0F);
        extraAmmoModel[47].rotateAngleZ = 0.2443461F;

        extraAmmoModel[48].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        extraAmmoModel[48].setRotationPoint(26.75F, -4.75F, 0F);
        extraAmmoModel[48].rotateAngleZ = 0.2443461F;

        extraAmmoModel[49].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[49].setRotationPoint(26.75F, -4.75F, 0F);
        extraAmmoModel[49].rotateAngleZ = 0.2443461F;

        extraAmmoModel[50].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F); // Box 688
        extraAmmoModel[50].setRotationPoint(26.75F, -4.75F, 0F);
        extraAmmoModel[50].rotateAngleZ = 0.2443461F;

        extraAmmoModel[51].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[51].setRotationPoint(29.5F, 3.75F, 0F);
        extraAmmoModel[51].rotateAngleZ = 0.33161256F;

        extraAmmoModel[52].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        extraAmmoModel[52].setRotationPoint(29.5F, 3.75F, 0F);
        extraAmmoModel[52].rotateAngleZ = 0.33161256F;

        extraAmmoModel[53].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        extraAmmoModel[53].setRotationPoint(29.5F, 3.75F, 0F);
        extraAmmoModel[53].rotateAngleZ = 0.33161256F;

        extraAmmoModel[54].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        extraAmmoModel[54].setRotationPoint(29.5F, 3.75F, 0F);
        extraAmmoModel[54].rotateAngleZ = 0.33161256F;

        extraAmmoModel[55].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[55].setRotationPoint(29.5F, 3.75F, 0F);
        extraAmmoModel[55].rotateAngleZ = 0.33161256F;

        extraAmmoModel[56].addShapeBox(4F, 1.5F, -3.5F, 3, 8, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.25F, 0.5F, 0F); // Box 688
        extraAmmoModel[56].setRotationPoint(29.5F, 3.75F, 0F);
        extraAmmoModel[56].rotateAngleZ = 0.33161256F;

        extraAmmoModel[57].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[57].setRotationPoint(33.5F, 12.5F, 0F);
        extraAmmoModel[57].rotateAngleZ = 0.40142573F;

        extraAmmoModel[58].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        extraAmmoModel[58].setRotationPoint(33.5F, 12.5F, 0F);
        extraAmmoModel[58].rotateAngleZ = 0.40142573F;

        extraAmmoModel[59].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        extraAmmoModel[59].setRotationPoint(33.5F, 12.5F, 0F);
        extraAmmoModel[59].rotateAngleZ = 0.40142573F;

        extraAmmoModel[60].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        extraAmmoModel[60].setRotationPoint(33.5F, 12.5F, 0F);
        extraAmmoModel[60].rotateAngleZ = 0.40142573F;

        extraAmmoModel[61].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        extraAmmoModel[61].setRotationPoint(33.5F, 12.5F, 0F);
        extraAmmoModel[61].rotateAngleZ = 0.40142573F;

        extraAmmoModel[62].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.25F, 0.5F, 0F); // Box 688
        extraAmmoModel[62].setRotationPoint(33.5F, 12.5F, 0F);
        extraAmmoModel[62].rotateAngleZ = 0.40142573F;

        extraAmmoModel[63].addShapeBox(0F, 2.77555756156289E-17F, 0F, 3, 5, 1, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 688
        extraAmmoModel[63].setRotationPoint(27.5F, -28F, -3.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 688
        ammoModel[1] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 688
        ammoModel[2] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 688
        ammoModel[3] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 688
        ammoModel[4] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 688
        ammoModel[5] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 688
        ammoModel[6] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 688
        ammoModel[7] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 688
        ammoModel[8] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 688
        ammoModel[9] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 688
        ammoModel[10] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 688
        ammoModel[11] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 688
        ammoModel[12] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 688
        ammoModel[13] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 688
        ammoModel[14] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 688
        ammoModel[15] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 688
        ammoModel[16] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 688
        ammoModel[17] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 688
        ammoModel[18] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 688
        ammoModel[19] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 688
        ammoModel[20] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 688
        ammoModel[21] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 688
        ammoModel[22] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Box 688
        ammoModel[23] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 688
        ammoModel[24] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 688
        ammoModel[25] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 688
        ammoModel[26] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 688
        ammoModel[27] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 688
        ammoModel[28] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 688
        ammoModel[29] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 688
        ammoModel[30] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 688
        ammoModel[31] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 688
        ammoModel[32] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 688
        ammoModel[33] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 688
        ammoModel[34] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 688
        ammoModel[35] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 688
        ammoModel[36] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 688
        ammoModel[37] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 688
        ammoModel[38] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 688
        ammoModel[39] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 688
        ammoModel[40] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 688
        ammoModel[41] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 688
        ammoModel[42] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 688
        ammoModel[43] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 688
        ammoModel[44] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Box 688
        ammoModel[45] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 688
        ammoModel[46] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 688
        ammoModel[47] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 688
        ammoModel[48] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 688
        ammoModel[49] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 688
        ammoModel[50] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 688
        ammoModel[51] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 688
        ammoModel[52] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 688
        ammoModel[53] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 688
        ammoModel[54] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 688
        ammoModel[55] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 688
        ammoModel[56] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 688
        ammoModel[57] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 688
        ammoModel[58] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 688
        ammoModel[59] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 688
        ammoModel[60] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 688
        ammoModel[61] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 688
        ammoModel[62] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 688
        ammoModel[63] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 688

        ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 688
        ammoModel[0].setRotationPoint(41.75F, -31.5F, -1.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[1].setRotationPoint(36.75F, -31.5F, 1.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, 0.5F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, -0.5F, 0.5F, -2F, -0.5F, 0F, 3F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -0.5F, 0F, 3F, -0.5F); // Box 688
        ammoModel[2].setRotationPoint(25.75F, -31.5F, 1.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, 0.5F, -2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 688
        ammoModel[3].setRotationPoint(24.25F, -31.5F, -2F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F, 0F, 0.5F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 1F, -1F, -0.25F, 1F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 688
        ammoModel[4].setRotationPoint(36.75F, -24.5F, -2.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 9, 9, 6, 0F, 1F, -3F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, -3F, 0F, -0.25F, 3.25F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.25F, 3.25F, 0F); // Box 688
        ammoModel[5].setRotationPoint(26.75F, -24.5F, -3F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F, 1.25F, -3.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, -3.25F, 0F, -0.75F, 4F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.75F, 4F, 0F); // Box 688
        ammoModel[6].setRotationPoint(28.25F, -15.5F, -3F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F, 2F, -1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 2F, -1F, -0.25F, 0F, 0F, -0.25F, 0.75F, -1.5F, -0.25F, 0.75F, -1.5F, -0.25F, 0F, 0F, -0.25F); // Box 688
        ammoModel[7].setRotationPoint(38.75F, -16.5F, -2.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F, 1.25F, -4F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, -4F, 0F, -1.5F, 4.75F, 0F, 3.5F, 1.25F, 0F, 3.5F, 1.25F, 0F, -1.5F, 4.75F, 0F); // Box 688
        ammoModel[8].setRotationPoint(30.25F, -8.5F, -3F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 6, 7, 5, 0F, 2F, -1.5F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 2F, -1.5F, -0.25F, -0.5F, 2.25F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 2.25F, -0.25F); // Box 688
        ammoModel[9].setRotationPoint(40.75F, -9F, -2.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 1.5F, -2.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1.5F, -2.25F, -0.25F, -1.5F, 1.75F, -0.25F, 2.5F, -0.5F, -0.25F, 2.5F, -0.5F, -0.25F, -1.5F, 1.75F, -0.25F); // Box 688
        ammoModel[10].setRotationPoint(42.75F, -2F, -2.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 9, 8, 6, 0F, 1.5F, -4.75F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 1.5F, -4.75F, 0F, -2F, 4.25F, 0F, 4F, 0.75F, 0F, 4F, 0.75F, 0F, -2F, 4.25F, 0F); // Box 688
        ammoModel[11].setRotationPoint(33.25F, -1.5F, -3F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 1.5F, -2.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 1.5F, -2.25F, -0.25F, -1.5F, 1.75F, -0.25F, 3F, -1.25F, -0.25F, 3F, -2F, -0.25F, -1.5F, 1.75F, -0.25F); // Box 688
        ammoModel[12].setRotationPoint(45.75F, 5F, -2.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 9, 8, 6, 0F, 1.5F, -4.75F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 1.5F, -4.75F, 0F, -3.25F, 5.25F, 0F, 5F, 0.25F, 0F, 5F, 0.25F, 0F, -3.25F, 5.25F, 0F); // Box 688
        ammoModel[13].setRotationPoint(36.75F, 6F, -3F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 688
        ammoModel[14].setRotationPoint(36.75F, -31.5F, -2.5F);

        ammoModel[15].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, 0.5F, -2F, -0.5F, 1F, -2F, -0.5F, 1F, -2F, 0F, 0.5F, -2F, 0F, 0F, 3F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, 0F, 0F, 3F, 0F); // Box 688
        ammoModel[15].setRotationPoint(25.75F, -31.5F, -3.5F);

        ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1.25F, 0.25F, 1F, 1.25F, 0.25F, 1F, -0.5F, 0.5F, 0F); // Box 688
        ammoModel[16].setRotationPoint(24.75F, -21.5F, -2F);

        ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, -0.25F, 0F, -1.25F, 0.25F, 0F, 2F, -0.25F, 1F, 2F, -0.25F, 1F, -1.25F, 0.25F, 0F); // Box 688
        ammoModel[17].setRotationPoint(26F, -12.25F, -2F);

        ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.75F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, -0.5F, 0F, -2F, 0.5F, 0F, 2.75F, -0.25F, 1F, 2.75F, -0.25F, 1F, -2F, 0.5F, 0F); // Box 688
        ammoModel[18].setRotationPoint(28F, -4.5F, -2F);

        ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.75F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, -0.75F, 0F, -2.625F, 0F, 0F, 3.5F, -0.5F, 1F, 3.5F, -0.5F, 1F, -2.625F, 0F, 0F); // Box 688
        ammoModel[19].setRotationPoint(30.75F, 3.25F, -2F);

        ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0.875F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.875F, -0.5F, 0F, -4.25F, 2F, 0F, 4.75F, 0.5F, 1F, 4.75F, 0.5F, 1F, -4.25F, 2F, 0F); // Box 688
        ammoModel[20].setRotationPoint(34.25F, 10.75F, -2F);

        ammoModel[21].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F, 0F, -9.5F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -9.5F, 0F, -1F, 9.5F, 0F, 1.625F, -0.25F, 0F, 1.625F, -0.25F, 0F, -1F, 9.5F, 0F); // Box 688
        ammoModel[21].setRotationPoint(38.75F, 10F, -3F);

        ammoModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F, 0.5F, -8.75F, 0.25F, 0.25F, -2.75F, 0.25F, 0.25F, -2.75F, 0.25F, 0.5F, -8.75F, 0.25F, -1F, 9F, 0.25F, 1.5F, 2.75F, 0.25F, 1.5F, 2.75F, 0.25F, -1F, 9F, 0.25F); // Box 688
        ammoModel[22].setRotationPoint(39.75F, 10F, -3.5F);

        ammoModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0.5F, -0.25F, -1.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, 0.5F, -0.25F, -1.25F, -1F, 0.5F, -1.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, -1F, 0.5F, -1.25F); // Box 688
        ammoModel[23].setRotationPoint(37.75F, 19.5F, -3.5F);

        ammoModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 688
        ammoModel[24].setRotationPoint(25.25F, -30.5F, 1.5F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 688
        ammoModel[25].setRotationPoint(25.25F, -31.5F, 1.5F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F); // Box 688
        ammoModel[26].setRotationPoint(24.25F, -30.5F, 1F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0.5F, 0.25F, 0F); // Box 688
        ammoModel[27].setRotationPoint(24.25F, -31.5F, 1F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 688
        ammoModel[28].setRotationPoint(25.25F, -30.5F, -3.5F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        ammoModel[29].setRotationPoint(25.25F, -31.5F, -3.5F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F); // Box 688
        ammoModel[30].setRotationPoint(24.25F, -30.5F, -2F);

        ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0.5F, 0F, 0F); // Box 688
        ammoModel[31].setRotationPoint(24.25F, -31.5F, -2F);

        ammoModel[32].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[32].setRotationPoint(23.75F, -22.25F, 0F);
        ammoModel[32].rotateAngleZ = 0.15707963F;

        ammoModel[33].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        ammoModel[33].setRotationPoint(23.75F, -22.25F, 0F);
        ammoModel[33].rotateAngleZ = 0.15707963F;

        ammoModel[34].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        ammoModel[34].setRotationPoint(23.75F, -22.25F, 0F);
        ammoModel[34].rotateAngleZ = 0.15707963F;

        ammoModel[35].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        ammoModel[35].setRotationPoint(23.75F, -22.25F, 0F);
        ammoModel[35].rotateAngleZ = 0.15707963F;

        ammoModel[36].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[36].setRotationPoint(23.75F, -22.25F, 0F);
        ammoModel[36].rotateAngleZ = 0.15707963F;

        ammoModel[37].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 688
        ammoModel[37].setRotationPoint(23.75F, -22.25F, 0F);
        ammoModel[37].rotateAngleZ = 0.15707963F;

        ammoModel[38].addShapeBox(0F, 2.77555756156289E-17F, 0F, 3, 5, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 688
        ammoModel[38].setRotationPoint(27.5F, -28F, 2.5F);

        ammoModel[39].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[39].setRotationPoint(25F, -13.5F, 0F);
        ammoModel[39].rotateAngleZ = 0.19198622F;

        ammoModel[40].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        ammoModel[40].setRotationPoint(25F, -13.5F, 0F);
        ammoModel[40].rotateAngleZ = 0.19198622F;

        ammoModel[41].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        ammoModel[41].setRotationPoint(25F, -13.5F, 0F);
        ammoModel[41].rotateAngleZ = 0.19198622F;

        ammoModel[42].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        ammoModel[42].setRotationPoint(25F, -13.5F, 0F);
        ammoModel[42].rotateAngleZ = 0.19198622F;

        ammoModel[43].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0.125F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0.125F, 0.5F, -0.25F); // Box 688
        ammoModel[43].setRotationPoint(25F, -13.5F, 0F);
        ammoModel[43].rotateAngleZ = 0.19198622F;

        ammoModel[44].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 688
        ammoModel[44].setRotationPoint(25F, -13.5F, 0F);
        ammoModel[44].rotateAngleZ = 0.19198622F;

        ammoModel[45].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[45].setRotationPoint(26.75F, -4.75F, 0F);
        ammoModel[45].rotateAngleZ = 0.2443461F;

        ammoModel[46].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        ammoModel[46].setRotationPoint(26.75F, -4.75F, 0F);
        ammoModel[46].rotateAngleZ = 0.2443461F;

        ammoModel[47].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        ammoModel[47].setRotationPoint(26.75F, -4.75F, 0F);
        ammoModel[47].rotateAngleZ = 0.2443461F;

        ammoModel[48].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        ammoModel[48].setRotationPoint(26.75F, -4.75F, 0F);
        ammoModel[48].rotateAngleZ = 0.2443461F;

        ammoModel[49].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[49].setRotationPoint(26.75F, -4.75F, 0F);
        ammoModel[49].rotateAngleZ = 0.2443461F;

        ammoModel[50].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F); // Box 688
        ammoModel[50].setRotationPoint(26.75F, -4.75F, 0F);
        ammoModel[50].rotateAngleZ = 0.2443461F;

        ammoModel[51].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[51].setRotationPoint(29.5F, 3.75F, 0F);
        ammoModel[51].rotateAngleZ = 0.33161256F;

        ammoModel[52].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        ammoModel[52].setRotationPoint(29.5F, 3.75F, 0F);
        ammoModel[52].rotateAngleZ = 0.33161256F;

        ammoModel[53].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        ammoModel[53].setRotationPoint(29.5F, 3.75F, 0F);
        ammoModel[53].rotateAngleZ = 0.33161256F;

        ammoModel[54].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        ammoModel[54].setRotationPoint(29.5F, 3.75F, 0F);
        ammoModel[54].rotateAngleZ = 0.33161256F;

        ammoModel[55].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[55].setRotationPoint(29.5F, 3.75F, 0F);
        ammoModel[55].rotateAngleZ = 0.33161256F;

        ammoModel[56].addShapeBox(4F, 1.5F, -3.5F, 3, 8, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.25F, 0.5F, 0F); // Box 688
        ammoModel[56].setRotationPoint(29.5F, 3.75F, 0F);
        ammoModel[56].rotateAngleZ = 0.33161256F;

        ammoModel[57].addShapeBox(14F, 0F, -3F, 5, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[57].setRotationPoint(33.5F, 12.5F, 0F);
        ammoModel[57].rotateAngleZ = 0.40142573F;

        ammoModel[58].addShapeBox(19F, 0F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 688
        ammoModel[58].setRotationPoint(33.5F, 12.5F, 0F);
        ammoModel[58].rotateAngleZ = 0.40142573F;

        ammoModel[59].addShapeBox(13F, 0F, -3F, 1, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 688
        ammoModel[59].setRotationPoint(33.5F, 12.5F, 0F);
        ammoModel[59].rotateAngleZ = 0.40142573F;

        ammoModel[60].addShapeBox(2F, 0F, -3.5F, 10, 1, 7, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
        ammoModel[60].setRotationPoint(33.5F, 12.5F, 0F);
        ammoModel[60].rotateAngleZ = 0.40142573F;

        ammoModel[61].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F); // Box 688
        ammoModel[61].setRotationPoint(33.5F, 12.5F, 0F);
        ammoModel[61].rotateAngleZ = 0.40142573F;

        ammoModel[62].addShapeBox(4F, 1.5F, -3.5F, 3, 7, 7, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.25F, 0.5F, 0F); // Box 688
        ammoModel[62].setRotationPoint(33.5F, 12.5F, 0F);
        ammoModel[62].rotateAngleZ = 0.40142573F;

        ammoModel[63].addShapeBox(0F, 2.77555756156289E-17F, 0F, 3, 5, 1, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 688
        ammoModel[63].setRotationPoint(27.5F, -28F, -3.5F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 201
        slideModel[1] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 201
        slideModel[2] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 201
        slideModel[3] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 201
        slideModel[4] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 201
        slideModel[5] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 201
        slideModel[6] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 201
        slideModel[7] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 201
        slideModel[8] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 201

        slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        slideModel[0].setRotationPoint(39F, -30F, -10.2F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 201
        slideModel[1].setRotationPoint(38F, -30F, -8.2F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 201
        slideModel[2].setRotationPoint(36F, -30F, -6.2F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        slideModel[3].setRotationPoint(41F, -31F, -10.2F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        slideModel[4].setRotationPoint(41F, -32F, -10.2F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        slideModel[5].setRotationPoint(24F, -35.25F, -3.5F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 201
        slideModel[6].setRotationPoint(24F, -36.25F, -1.5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        slideModel[7].setRotationPoint(24F, -33.25F, -3.5F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 31, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        slideModel[8].setRotationPoint(15F, -30F, -3.2F);
    }
}