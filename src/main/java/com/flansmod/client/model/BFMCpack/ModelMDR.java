//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DTMDR
// Model Creator: 
// Created on: 14.04.2021 - 21:44:19
// Last changed on: 14.04.2021 - 21:44:19

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMDR extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 512;

    public ModelMDR() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[797];
        defaultBarrelModel = new ModelRendererTurbo[24];
        defaultScopeModel = new ModelRendererTurbo[45];
        ammoModel = new ModelRendererTurbo[54];
        slideModel = new ModelRendererTurbo[20];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initdefaultScopeModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(87.5F / 16F, 32F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(71F / 16F, 34F / 16F, -7.5F / 16F);
        scopeAttachPoint = new Vector3f(0F / 16F, 43.5F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(55 / 16F, 24.5F / 16F, 0F / 16F);

        gunSlideDistance = 2F;

        hasArms = true;
        leftArmPos = new Vector3f(0F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.95F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);

        crouchZoom = -0.05F;
        zoomOffset = 0.1F;
        zoomOffsetY = -0.12F;
        gunOffset = 0.4F;
        gunOffsetX = -1F;

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
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 7
        gunModel[6] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 8
        gunModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 9
        gunModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 10
        gunModel[9] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 12
        gunModel[10] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 13
        gunModel[11] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 14
        gunModel[12] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 15
        gunModel[13] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 16
        gunModel[14] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 17
        gunModel[15] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 18
        gunModel[16] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 19
        gunModel[17] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 22
        gunModel[18] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 23
        gunModel[19] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 24
        gunModel[20] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 25
        gunModel[21] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 26
        gunModel[22] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 27
        gunModel[23] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 28
        gunModel[24] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 29
        gunModel[25] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 30
        gunModel[26] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 31
        gunModel[27] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 32
        gunModel[28] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 33
        gunModel[29] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 34
        gunModel[30] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 35
        gunModel[31] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 36
        gunModel[32] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 37
        gunModel[33] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 38
        gunModel[34] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 39
        gunModel[35] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 40
        gunModel[36] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 41
        gunModel[37] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 42
        gunModel[38] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 43
        gunModel[39] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Box 44
        gunModel[40] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 45
        gunModel[41] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 46
        gunModel[42] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 47
        gunModel[43] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 48
        gunModel[44] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 49
        gunModel[45] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 50
        gunModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
        gunModel[47] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 52
        gunModel[48] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 53
        gunModel[49] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 54
        gunModel[50] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 52
        gunModel[51] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 53
        gunModel[52] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 95
        gunModel[53] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 96
        gunModel[54] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 97
        gunModel[55] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 98
        gunModel[56] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 110
        gunModel[57] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 111
        gunModel[58] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 112
        gunModel[59] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 113
        gunModel[60] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 114
        gunModel[61] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 115
        gunModel[62] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 116
        gunModel[63] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 117
        gunModel[64] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 118
        gunModel[65] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 119
        gunModel[66] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 120
        gunModel[67] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 121
        gunModel[68] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 122
        gunModel[69] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 125
        gunModel[70] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 126
        gunModel[71] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 127
        gunModel[72] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 129
        gunModel[73] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 130
        gunModel[74] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 131
        gunModel[75] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 132
        gunModel[76] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 133
        gunModel[77] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 134
        gunModel[78] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 135
        gunModel[79] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 137
        gunModel[80] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 138
        gunModel[81] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 139
        gunModel[82] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 140
        gunModel[83] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 141
        gunModel[84] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 142
        gunModel[85] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 143
        gunModel[86] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 144
        gunModel[87] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 145
        gunModel[88] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 146
        gunModel[89] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 148
        gunModel[90] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 149
        gunModel[91] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 150
        gunModel[92] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 151
        gunModel[93] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 152
        gunModel[94] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 153
        gunModel[95] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 154
        gunModel[96] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 155
        gunModel[97] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 156
        gunModel[98] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 157
        gunModel[99] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 158
        gunModel[100] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 159
        gunModel[101] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 160
        gunModel[102] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 161
        gunModel[103] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 163
        gunModel[104] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 164
        gunModel[105] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 165
        gunModel[106] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 166
        gunModel[107] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 167
        gunModel[108] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 168
        gunModel[109] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 169
        gunModel[110] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 170
        gunModel[111] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 171
        gunModel[112] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 172
        gunModel[113] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 173
        gunModel[114] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 174
        gunModel[115] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 175
        gunModel[116] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 176
        gunModel[117] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 177
        gunModel[118] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 178
        gunModel[119] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 179
        gunModel[120] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 180
        gunModel[121] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 181
        gunModel[122] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 182
        gunModel[123] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 183
        gunModel[124] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 184
        gunModel[125] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 185
        gunModel[126] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 186
        gunModel[127] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 187
        gunModel[128] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 188
        gunModel[129] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 189
        gunModel[130] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 202
        gunModel[131] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 203
        gunModel[132] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 204
        gunModel[133] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 205
        gunModel[134] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 206
        gunModel[135] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 207
        gunModel[136] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 208
        gunModel[137] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 209
        gunModel[138] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 210
        gunModel[139] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 211
        gunModel[140] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 212
        gunModel[141] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 213
        gunModel[142] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 214
        gunModel[143] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 215
        gunModel[144] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 216
        gunModel[145] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 217
        gunModel[146] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 218
        gunModel[147] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 219
        gunModel[148] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 220
        gunModel[149] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 221
        gunModel[150] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 222
        gunModel[151] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 223
        gunModel[152] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 224
        gunModel[153] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 225
        gunModel[154] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 226
        gunModel[155] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 227
        gunModel[156] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 228
        gunModel[157] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 229
        gunModel[158] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 230
        gunModel[159] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 231
        gunModel[160] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 232
        gunModel[161] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 237
        gunModel[162] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 238
        gunModel[163] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 239
        gunModel[164] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 240
        gunModel[165] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 241
        gunModel[166] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 242
        gunModel[167] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 243
        gunModel[168] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 244
        gunModel[169] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 245
        gunModel[170] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 246
        gunModel[171] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 248
        gunModel[172] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 249
        gunModel[173] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 250
        gunModel[174] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 251
        gunModel[175] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 252
        gunModel[176] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 253
        gunModel[177] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 254
        gunModel[178] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 255
        gunModel[179] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 256
        gunModel[180] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 257
        gunModel[181] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 259
        gunModel[182] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 260
        gunModel[183] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 261
        gunModel[184] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 262
        gunModel[185] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 263
        gunModel[186] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 264
        gunModel[187] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 265
        gunModel[188] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 266
        gunModel[189] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 267
        gunModel[190] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box 268
        gunModel[191] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 269
        gunModel[192] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 270
        gunModel[193] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 271
        gunModel[194] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 272
        gunModel[195] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 273
        gunModel[196] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 274
        gunModel[197] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 275
        gunModel[198] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 276
        gunModel[199] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 277
        gunModel[200] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 278
        gunModel[201] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 279
        gunModel[202] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 281
        gunModel[203] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 282
        gunModel[204] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 283
        gunModel[205] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 284
        gunModel[206] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 285
        gunModel[207] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 286
        gunModel[208] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 287
        gunModel[209] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 288
        gunModel[210] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 289
        gunModel[211] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 290
        gunModel[212] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 291
        gunModel[213] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 292
        gunModel[214] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 293
        gunModel[215] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 294
        gunModel[216] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 295
        gunModel[217] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 296
        gunModel[218] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 297
        gunModel[219] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 298
        gunModel[220] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 299
        gunModel[221] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 300
        gunModel[222] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 301
        gunModel[223] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 303
        gunModel[224] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 304
        gunModel[225] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 305
        gunModel[226] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 306
        gunModel[227] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 307
        gunModel[228] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 308
        gunModel[229] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 309
        gunModel[230] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 310
        gunModel[231] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 311
        gunModel[232] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 312
        gunModel[233] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 313
        gunModel[234] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 314
        gunModel[235] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 315
        gunModel[236] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 316
        gunModel[237] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 317
        gunModel[238] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 318
        gunModel[239] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 319
        gunModel[240] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 320
        gunModel[241] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 321
        gunModel[242] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 322
        gunModel[243] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 323
        gunModel[244] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 325
        gunModel[245] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 326
        gunModel[246] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 327
        gunModel[247] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 328
        gunModel[248] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 329
        gunModel[249] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 330
        gunModel[250] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 331
        gunModel[251] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 332
        gunModel[252] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 333
        gunModel[253] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 334
        gunModel[254] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 335
        gunModel[255] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 336
        gunModel[256] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 337
        gunModel[257] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 338
        gunModel[258] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 342
        gunModel[259] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 343
        gunModel[260] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 344
        gunModel[261] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 345
        gunModel[262] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 346
        gunModel[263] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 347
        gunModel[264] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 348
        gunModel[265] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 349
        gunModel[266] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 350
        gunModel[267] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 351
        gunModel[268] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 352
        gunModel[269] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 353
        gunModel[270] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 354
        gunModel[271] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 355
        gunModel[272] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 356
        gunModel[273] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 357
        gunModel[274] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 358
        gunModel[275] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 359
        gunModel[276] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 360
        gunModel[277] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 361
        gunModel[278] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 362
        gunModel[279] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 363
        gunModel[280] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 364
        gunModel[281] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 365
        gunModel[282] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 366
        gunModel[283] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 367
        gunModel[284] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 368
        gunModel[285] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 369
        gunModel[286] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 370
        gunModel[287] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 371
        gunModel[288] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 372
        gunModel[289] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 373
        gunModel[290] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 374
        gunModel[291] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Box 375
        gunModel[292] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 376
        gunModel[293] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 377
        gunModel[294] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 378
        gunModel[295] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 379
        gunModel[296] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 380
        gunModel[297] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); // Box 381
        gunModel[298] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 382
        gunModel[299] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 383
        gunModel[300] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 384
        gunModel[301] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 385
        gunModel[302] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 386
        gunModel[303] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 387
        gunModel[304] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 388
        gunModel[305] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 389
        gunModel[306] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 390
        gunModel[307] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 391
        gunModel[308] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 392
        gunModel[309] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 393
        gunModel[310] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 394
        gunModel[311] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 395
        gunModel[312] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 396
        gunModel[313] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 397
        gunModel[314] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 398
        gunModel[315] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 399
        gunModel[316] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 400
        gunModel[317] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 401
        gunModel[318] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 402
        gunModel[319] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 403
        gunModel[320] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 404
        gunModel[321] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 405
        gunModel[322] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 406
        gunModel[323] = new ModelRendererTurbo(this, 649, 113, textureX, textureY); // Box 407
        gunModel[324] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 408
        gunModel[325] = new ModelRendererTurbo(this, 729, 113, textureX, textureY); // Box 409
        gunModel[326] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 410
        gunModel[327] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 411
        gunModel[328] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 412
        gunModel[329] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 413
        gunModel[330] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 414
        gunModel[331] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 415
        gunModel[332] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 416
        gunModel[333] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 417
        gunModel[334] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 418
        gunModel[335] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 419
        gunModel[336] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 420
        gunModel[337] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 421
        gunModel[338] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 422
        gunModel[339] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 423
        gunModel[340] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 424
        gunModel[341] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 425
        gunModel[342] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 426
        gunModel[343] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Box 427
        gunModel[344] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 428
        gunModel[345] = new ModelRendererTurbo(this, 913, 121, textureX, textureY); // Box 429
        gunModel[346] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 436
        gunModel[347] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 442
        gunModel[348] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 444
        gunModel[349] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 445
        gunModel[350] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 446
        gunModel[351] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 447
        gunModel[352] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 448
        gunModel[353] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 449
        gunModel[354] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 450
        gunModel[355] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 451
        gunModel[356] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 452
        gunModel[357] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 453
        gunModel[358] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 454
        gunModel[359] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 455
        gunModel[360] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Box 456
        gunModel[361] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 457
        gunModel[362] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Box 458
        gunModel[363] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 459
        gunModel[364] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 460
        gunModel[365] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 461
        gunModel[366] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 462
        gunModel[367] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 463
        gunModel[368] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 464
        gunModel[369] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 465
        gunModel[370] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 466
        gunModel[371] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 467
        gunModel[372] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 468
        gunModel[373] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 469
        gunModel[374] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Box 470
        gunModel[375] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 471
        gunModel[376] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 472
        gunModel[377] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 473
        gunModel[378] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 474
        gunModel[379] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 475
        gunModel[380] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 476
        gunModel[381] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 477
        gunModel[382] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 478
        gunModel[383] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 479
        gunModel[384] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 480
        gunModel[385] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 481
        gunModel[386] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 482
        gunModel[387] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 483
        gunModel[388] = new ModelRendererTurbo(this, 809, 137, textureX, textureY); // Box 484
        gunModel[389] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Box 485
        gunModel[390] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 486
        gunModel[391] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 487
        gunModel[392] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 488
        gunModel[393] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 489
        gunModel[394] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 490
        gunModel[395] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 491
        gunModel[396] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 492
        gunModel[397] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 493
        gunModel[398] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Box 494
        gunModel[399] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 495
        gunModel[400] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 496
        gunModel[401] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 497
        gunModel[402] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 498
        gunModel[403] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 499
        gunModel[404] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 500
        gunModel[405] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 501
        gunModel[406] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 502
        gunModel[407] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 503
        gunModel[408] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 504
        gunModel[409] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 505
        gunModel[410] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 506
        gunModel[411] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 507
        gunModel[412] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 508
        gunModel[413] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 510
        gunModel[414] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 511
        gunModel[415] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 512
        gunModel[416] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 513
        gunModel[417] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 514
        gunModel[418] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 515
        gunModel[419] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 516
        gunModel[420] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 517
        gunModel[421] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 518
        gunModel[422] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 519
        gunModel[423] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 520
        gunModel[424] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 521
        gunModel[425] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 522
        gunModel[426] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 523
        gunModel[427] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 524
        gunModel[428] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 525
        gunModel[429] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 526
        gunModel[430] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 527
        gunModel[431] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 528
        gunModel[432] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 529
        gunModel[433] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 530
        gunModel[434] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 531
        gunModel[435] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 532
        gunModel[436] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 533
        gunModel[437] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 534
        gunModel[438] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 535
        gunModel[439] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 536
        gunModel[440] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 537
        gunModel[441] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 538
        gunModel[442] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 539
        gunModel[443] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 540
        gunModel[444] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 541
        gunModel[445] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 542
        gunModel[446] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 543
        gunModel[447] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 544
        gunModel[448] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 545
        gunModel[449] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 546
        gunModel[450] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 547
        gunModel[451] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 548
        gunModel[452] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 549
        gunModel[453] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 550
        gunModel[454] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 573
        gunModel[455] = new ModelRendererTurbo(this, 793, 153, textureX, textureY); // Box 574
        gunModel[456] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 575
        gunModel[457] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 576
        gunModel[458] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 577
        gunModel[459] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 578
        gunModel[460] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 579
        gunModel[461] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 580
        gunModel[462] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 581
        gunModel[463] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 582
        gunModel[464] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 583
        gunModel[465] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 584
        gunModel[466] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 585
        gunModel[467] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 586
        gunModel[468] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 587
        gunModel[469] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 588
        gunModel[470] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 589
        gunModel[471] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 590
        gunModel[472] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 591
        gunModel[473] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 592
        gunModel[474] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 593
        gunModel[475] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 594
        gunModel[476] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 595
        gunModel[477] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 596
        gunModel[478] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Box 597
        gunModel[479] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Box 598
        gunModel[480] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 599
        gunModel[481] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 600
        gunModel[482] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 601
        gunModel[483] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 602
        gunModel[484] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 603
        gunModel[485] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Box 604
        gunModel[486] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 605
        gunModel[487] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 606
        gunModel[488] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 607
        gunModel[489] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 608
        gunModel[490] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 609
        gunModel[491] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 610
        gunModel[492] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 611
        gunModel[493] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 612
        gunModel[494] = new ModelRendererTurbo(this, 945, 169, textureX, textureY); // Box 613
        gunModel[495] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 614
        gunModel[496] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 615
        gunModel[497] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 616
        gunModel[498] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 617
        gunModel[499] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 618

        gunModel[0].addShapeBox(0F, 0F, 0F, 54, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
        gunModel[0].setRotationPoint(-84F, -37F, -5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 125, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gunModel[1].setRotationPoint(-92F, -34F, -5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 47, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
        gunModel[2].setRotationPoint(-14F, -36F, -5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[3].setRotationPoint(23F, -37F, -5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 78, 4, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(-92F, -41F, -5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 64, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        gunModel[5].setRotationPoint(-31F, -43F, -2F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 64, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        gunModel[6].setRotationPoint(-31F, -44F, -2F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 9
        gunModel[7].setRotationPoint(-31F, -44F, -2F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 78, 4, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        gunModel[8].setRotationPoint(-92F, -41F, 4F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 32, 4, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        gunModel[9].setRotationPoint(-11F, -41F, 4F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 32, 4, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        gunModel[10].setRotationPoint(-11F, -41F, -5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 14
        gunModel[11].setRotationPoint(-14F, -41F, 3F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 15
        gunModel[12].setRotationPoint(-14.5F, -38F, 3.25F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F); // Box 16
        gunModel[13].setRotationPoint(-11.5F, -38F, 3.25F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 17
        gunModel[14].setRotationPoint(-14F, -41F, -4F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 18
        gunModel[15].setRotationPoint(-14.5F, -38F, -4.25F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F); // Box 19
        gunModel[16].setRotationPoint(-11.5F, -38F, -4.25F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        gunModel[17].setRotationPoint(25F, -41F, -5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
        gunModel[18].setRotationPoint(25F, -41F, 4F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        gunModel[19].setRotationPoint(21F, -41F, 1.75F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.5F, 1.125F, 0F, 0.5F, 1.125F, 0F, 0.5F, -1.125F, 0F, 0.5F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        gunModel[20].setRotationPoint(21F, -38F, 4F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 26
        gunModel[21].setRotationPoint(20.5F, -40F, 2.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 27
        gunModel[22].setRotationPoint(20.5F, -39F, 3.25F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F); // Box 28
        gunModel[23].setRotationPoint(24.5F, -40F, 2.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 29
        gunModel[24].setRotationPoint(24.5F, -39F, 3.25F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F); // Box 30
        gunModel[25].setRotationPoint(29.5F, -40F, 2.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 31
        gunModel[26].setRotationPoint(29.5F, -39F, 3.25F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        gunModel[27].setRotationPoint(26F, -41F, 1.75F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 33
        gunModel[28].setRotationPoint(25.5F, -40F, 2.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 34
        gunModel[29].setRotationPoint(25.5F, -39F, 3.25F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.5F, 1.125F, 0F, 0.5F, 1.125F, 0F, 0.5F, -1.125F, 0F, 0.5F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
        gunModel[30].setRotationPoint(26F, -38F, 4F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        gunModel[31].setRotationPoint(30F, -41F, 4F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[32].setRotationPoint(21F, -41F, -2.75F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.5F, -1.125F, 0F, 0.5F, -1.125F, 0F, 0.5F, 1.125F, 0F, 0.5F, 1.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
        gunModel[33].setRotationPoint(21F, -38F, -5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 39
        gunModel[34].setRotationPoint(20.5F, -40F, -3.5F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 40
        gunModel[35].setRotationPoint(20.5F, -39F, -4.25F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F); // Box 41
        gunModel[36].setRotationPoint(24.5F, -40F, -3.5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 42
        gunModel[37].setRotationPoint(24.5F, -39F, -4.25F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F); // Box 43
        gunModel[38].setRotationPoint(29.5F, -40F, -3.5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 44
        gunModel[39].setRotationPoint(29.5F, -39F, -4.25F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        gunModel[40].setRotationPoint(26F, -41F, -2.75F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 46
        gunModel[41].setRotationPoint(25.5F, -40F, -3.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F); // Box 47
        gunModel[42].setRotationPoint(25.5F, -39F, -4.25F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.5F, -1.125F, 0F, 0.5F, -1.125F, 0F, 0.5F, 1.125F, 0F, 0.5F, 1.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        gunModel[43].setRotationPoint(26F, -38F, -5F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        gunModel[44].setRotationPoint(30F, -41F, -5F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 118, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        gunModel[45].setRotationPoint(-91F, -33F, -4.5F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 113, 1, 1, 0F, 0.75F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
        gunModel[46].setRotationPoint(-81F, -31F, -5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 47, 3, 10, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        gunModel[47].setRotationPoint(-77F, -30.5F, -5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        gunModel[48].setRotationPoint(31F, -30.5F, -5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[49].setRotationPoint(31F, -29.5F, -5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
        gunModel[50].setRotationPoint(26.5F, -33F, -4.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        gunModel[51].setRotationPoint(26.5F, -32F, -4.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
        gunModel[52].setRotationPoint(23F, -37F, 4F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 125, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96
        gunModel[53].setRotationPoint(-92F, -34F, 4F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 47, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 97
        gunModel[54].setRotationPoint(-14F, -36F, 4F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 114, 1, 1, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 98
        gunModel[55].setRotationPoint(-81F, -31F, 4F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        gunModel[56].setRotationPoint(33F, -43F, -2F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        gunModel[57].setRotationPoint(33F, -44F, -2F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 112
        gunModel[58].setRotationPoint(35F, -44F, -2F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 113
        gunModel[59].setRotationPoint(37F, -44F, -2F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 114
        gunModel[60].setRotationPoint(33F, -44F, -2F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 115
        gunModel[61].setRotationPoint(37F, -43F, -2F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 116
        gunModel[62].setRotationPoint(37F, -43F, -2F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
        gunModel[63].setRotationPoint(34F, -40.5F, -2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 118
        gunModel[64].setRotationPoint(33F, -38F, -2F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
        gunModel[65].setRotationPoint(33.5F, -41F, -2F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
        gunModel[66].setRotationPoint(36.5F, -41F, -2F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
        gunModel[67].setRotationPoint(36.5F, -43.5F, -2F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
        gunModel[68].setRotationPoint(33.5F, -43.5F, -2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
        gunModel[69].setRotationPoint(-15F, -27F, -5.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 36, 1, 11, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
        gunModel[70].setRotationPoint(-15F, -27.5F, -5.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[71].setRotationPoint(-10F, -27F, -5.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 26, 1, 13, 0F, 0F, 0F, -1F, 0F, 4.5F, -0.5F, 0F, 4.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, -1F); // Box 129
        gunModel[72].setRotationPoint(-5F, -20F, -6.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        gunModel[73].setRotationPoint(21F, -24.5F, -7F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 131
        gunModel[74].setRotationPoint(22F, -24.5F, -7F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 132
        gunModel[75].setRotationPoint(23F, -22.5F, -7F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 133
        gunModel[76].setRotationPoint(23F, -19F, -7F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, 0F, 0F, -2.99F, 0F, 0F, -2.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        gunModel[77].setRotationPoint(21F, -27F, -5.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
        gunModel[78].setRotationPoint(23F, -24F, -5.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 30, 1, 11, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 137
        gunModel[79].setRotationPoint(-3F, -19F, -5.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 26, 5, 11, 0F, 0F, -4.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
        gunModel[80].setRotationPoint(-5F, -24F, -5.5F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 5, 11, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        gunModel[81].setRotationPoint(21F, -24F, -5.5F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 140
        gunModel[82].setRotationPoint(-22F, -24F, -5.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 141
        gunModel[83].setRotationPoint(-26F, -22F, -4.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 2F, -2F, -2F, 2F, -2F, 0F, 0F, -2F); // Box 142
        gunModel[84].setRotationPoint(-10F, -22F, -4.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 3F, -1F, -1F, 3F, -1F, 0F, 0F, -1F); // Box 143
        gunModel[85].setRotationPoint(-10F, -24F, -5.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 144
        gunModel[86].setRotationPoint(-6F, -20F, -5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 145
        gunModel[87].setRotationPoint(-24.75F, -24.25F, -5.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.5F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F); // Box 146
        gunModel[88].setRotationPoint(-24.75F, -25.25F, -5.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 148
        gunModel[89].setRotationPoint(-25.75F, -24.25F, -5.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F); // Box 149
        gunModel[90].setRotationPoint(-25.75F, -23.25F, -5.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 150
        gunModel[91].setRotationPoint(-24.75F, -22.25F, -5.5F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, -2F, -2F, 1F, -2F, -2F, 0F, 0F, -2F); // Box 151
        gunModel[92].setRotationPoint(-22.75F, -22.25F, -5.5F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 152
        gunModel[93].setRotationPoint(-21.75F, -24.25F, -5.5F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 153
        gunModel[94].setRotationPoint(-26.75F, -24.25F, -5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, -2F, -2F); // Box 154
        gunModel[95].setRotationPoint(-25.75F, -22.25F, -5.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 155
        gunModel[96].setRotationPoint(-22.75F, -24.25F, -5.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 156
        gunModel[97].setRotationPoint(-22.75F, -23.25F, -5.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
        gunModel[98].setRotationPoint(-24.25F, -23.25F, -5.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        gunModel[99].setRotationPoint(-26F, -27F, -5.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 159
        gunModel[100].setRotationPoint(-26F, -25F, -5.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[101].setRotationPoint(-26F, -25F, -5.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 161
        gunModel[102].setRotationPoint(-22.5F, -25F, -5.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        gunModel[103].setRotationPoint(-25.25F, -25.25F, -5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 164
        gunModel[104].setRotationPoint(-25.25F, -23.25F, -5F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 165
        gunModel[105].setRotationPoint(-24.25F, -25.25F, -5.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -1F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F); // Box 166
        gunModel[106].setRotationPoint(-23.75F, -25.25F, -5.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 167
        gunModel[107].setRotationPoint(-23.75F, -24.25F, -5.5F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -1F, 0F); // Box 168
        gunModel[108].setRotationPoint(-23.75F, -23.25F, -5.5F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 169
        gunModel[109].setRotationPoint(-24.25F, -23.25F, -5.5F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F); // Box 170
        gunModel[110].setRotationPoint(-24.75F, -23.25F, -5.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 171
        gunModel[111].setRotationPoint(-26.01F, -24F, -5.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 172
        gunModel[112].setRotationPoint(-30F, -27F, -5.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1F); // Box 173
        gunModel[113].setRotationPoint(-30.01F, -24F, -5.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 4F, -2F); // Box 174
        gunModel[114].setRotationPoint(-30F, -22F, -4.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 16, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
        gunModel[115].setRotationPoint(5F, -27F, -5.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 15, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
        gunModel[116].setRotationPoint(6F, -26.5F, -5.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 177
        gunModel[117].setRotationPoint(5F, -27F, -5.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F); // Box 178
        gunModel[118].setRotationPoint(4F, -27F, -5.5F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F); // Box 179
        gunModel[119].setRotationPoint(19F, -25.5F, -5.5F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.49F, 0F, -0.5F, -0.49F, 0F, 0F, 0F, 0F); // Box 180
        gunModel[120].setRotationPoint(6F, -26F, -5.5F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, -0.5F, -0.49F, 0F, -0.5F, -0.49F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 181
        gunModel[121].setRotationPoint(6F, -22.5F, -5.5F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 25, 7, 10, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 182
        gunModel[122].setRotationPoint(-5F, -27.5F, -5F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.49F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.49F, 0F); // Box 183
        gunModel[123].setRotationPoint(18.5F, -26F, -5.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.75F, -0.615F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.615F, 0F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.375F, 0F); // Box 184
        gunModel[124].setRotationPoint(18.5F, -24.75F, -5.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F, 0F, 0F, 0F, 0F, -4.99F, 0F, 0F, -4.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        gunModel[125].setRotationPoint(-5F, -25F, -5.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.99F, -0.5F, 0F, -0.99F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 186
        gunModel[126].setRotationPoint(-5F, -27F, -5.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187
        gunModel[127].setRotationPoint(7F, -24F, 4F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 188
        gunModel[128].setRotationPoint(7F, -24.5F, 4F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 189
        gunModel[129].setRotationPoint(7F, -23.5F, 4F);

        gunModel[130].addShapeBox(-4.5F, -1F, 0.5F, 1, 1, 1, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.25F); // Box 202
        gunModel[130].setRotationPoint(0F, -24F, 4.5F);
        gunModel[130].rotateAngleZ = 0.78539816F;

        gunModel[131].addShapeBox(-3.5F, 0F, 0.5F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
        gunModel[131].setRotationPoint(0F, -24F, 4.5F);
        gunModel[131].rotateAngleZ = 0.78539816F;

        gunModel[132].addShapeBox(-3.5F, -1F, 0.5F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 204
        gunModel[132].setRotationPoint(0F, -24F, 4.5F);
        gunModel[132].rotateAngleZ = 0.78539816F;

        gunModel[133].addShapeBox(-1.5F, -1F, 0.5F, 2, 2, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
        gunModel[133].setRotationPoint(0F, -24F, 4.5F);
        gunModel[133].rotateAngleZ = 0.78539816F;

        gunModel[134].addShapeBox(0.5F, -1F, 0.5F, 1, 2, 1, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 206
        gunModel[134].setRotationPoint(0F, -24F, 4.5F);
        gunModel[134].rotateAngleZ = 0.78539816F;

        gunModel[135].addShapeBox(-2F, -0.5F, 0F, 4, 1, 1, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 207
        gunModel[135].setRotationPoint(0F, -24F, 4.5F);
        gunModel[135].rotateAngleZ = 0.78539816F;

        gunModel[136].addShapeBox(1.75F, -0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, -0.365F, -0.75F, -0.125F, -0.49F, 0.25F, 0F, -0.125F, 0.25F, 0F, 0F, -0.75F, 0F, -0.365F, -0.75F, -0.125F, -0.49F, 0.25F, 0F, -0.125F, 0.25F); // Box 208
        gunModel[136].setRotationPoint(0F, -24F, 4.5F);
        gunModel[136].rotateAngleZ = 0.78539816F;

        gunModel[137].addShapeBox(-2F, 0.5F, 0F, 4, 1, 1, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.75F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F); // Box 209
        gunModel[137].setRotationPoint(0F, -24F, 4.5F);
        gunModel[137].rotateAngleZ = 0.78539816F;

        gunModel[138].addShapeBox(-1.5F, 1.5F, 0F, 3, 1, 1, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -1F, -0.75F, 0.25F, -1F, -0.75F, 0.25F); // Box 210
        gunModel[138].setRotationPoint(0F, -24F, 4.5F);
        gunModel[138].rotateAngleZ = 0.78539816F;

        gunModel[139].addShapeBox(-2F, -1.5F, 0F, 4, 1, 1, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.75F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 211
        gunModel[139].setRotationPoint(0F, -24F, 4.5F);
        gunModel[139].rotateAngleZ = 0.78539816F;

        gunModel[140].addShapeBox(-1.5F, -2.5F, 0F, 3, 1, 1, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -1F, -0.75F, 0.25F, -1F, -0.75F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F); // Box 212
        gunModel[140].setRotationPoint(0F, -24F, 4.5F);
        gunModel[140].rotateAngleZ = 0.78539816F;

        gunModel[141].addShapeBox(-4.5F, 0F, 0.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, -0.25F); // Box 213
        gunModel[141].setRotationPoint(0F, -24F, 4.5F);
        gunModel[141].rotateAngleZ = 0.78539816F;

        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0F, -0.125F, 0.375F, 0F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0F, -0.125F, 0.375F); // Box 214
        gunModel[142].setRotationPoint(1.5F, -27F, -5F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.125F, 0.375F, -0.375F, -0.48F, 0.375F, -0.375F, -0.48F, 0.375F, -0.25F, -0.125F, 0.375F, -0.25F, -0.125F, 0.375F, -0.375F, -0.48F, 0.375F, -0.375F, -0.48F, 0.375F, -0.25F, -0.125F, 0.375F); // Box 215
        gunModel[143].setRotationPoint(2.5F, -27F, -5F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.125F, 0.375F, -0.375F, -0.48F, 0.375F, -0.375F, -0.48F, 0.375F, -0.25F, -0.125F, 0.375F, -0.25F, -0.125F, 0.375F, -0.375F, -0.48F, 0.375F, -0.375F, -0.48F, 0.375F, -0.25F, -0.125F, 0.375F); // Box 216
        gunModel[144].setRotationPoint(-2F, -27F, -5F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.5F, -0.125F, 0.375F, 0.5F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.5F, -0.125F, 0.375F); // Box 217
        gunModel[145].setRotationPoint(-3F, -27F, -5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0F, -0.125F, 0.375F, 0F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0.25F, -0.125F, 0.375F, 0F, -0.125F, 0.375F); // Box 218
        gunModel[146].setRotationPoint(2.5F, -24.5F, -5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.125F, 0.375F, -0.375F, -0.48F, 0.375F, -0.375F, -0.48F, 0.375F, -0.25F, -0.125F, 0.375F, -0.25F, -0.125F, 0.375F, -0.375F, -0.48F, 0.375F, -0.375F, -0.48F, 0.375F, -0.25F, -0.125F, 0.375F); // Box 219
        gunModel[147].setRotationPoint(3.5F, -24.5F, -5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 23, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 220
        gunModel[148].setRotationPoint(-53F, -27F, -5.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 221
        gunModel[149].setRotationPoint(-30F, -27F, -5.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -2F, 0F, -0.5F, -2F, 0F, -0.25F, 0F); // Box 222
        gunModel[150].setRotationPoint(-29F, -27F, -5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 23, 4, 2, 0F, -2F, -6.75F, 0F, -2F, -3.25F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 3.75F, 0F, -2F, 0.25F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 223
        gunModel[151].setRotationPoint(-53F, -16F, -7.5F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 23, 4, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -3.25F, 0F, -2F, -6.75F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, -2F, 3.75F, 0F); // Box 224
        gunModel[152].setRotationPoint(-53F, -16F, 5.5F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 23, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 225
        gunModel[153].setRotationPoint(-53F, -27F, 4.5F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 7, 12, 11, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
        gunModel[154].setRotationPoint(-60F, -27F, -5.5F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F); // Box 227
        gunModel[155].setRotationPoint(-60.5F, -21F, -5.5F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 228
        gunModel[156].setRotationPoint(-67.5F, -25F, -5.5F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
        gunModel[157].setRotationPoint(-75.5F, -27F, -5.5F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
        gunModel[158].setRotationPoint(-80.5F, -27F, -5.5F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F, 0.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 231
        gunModel[159].setRotationPoint(-82.5F, -31F, -5.5F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, 0F, 0F); // Box 232
        gunModel[160].setRotationPoint(-90F, -32F, -5.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 19, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F); // Box 237
        gunModel[161].setRotationPoint(-53F, -27F, -4.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 238
        gunModel[162].setRotationPoint(-30F, -27F, 4.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
        gunModel[163].setRotationPoint(-60.5F, -16F, -5.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 2F, 0F, -0.5F); // Box 240
        gunModel[164].setRotationPoint(-68.5F, -14F, -5.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 3, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F); // Box 241
        gunModel[165].setRotationPoint(-73.5F, -25F, -5.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 242
        gunModel[166].setRotationPoint(-74.5F, -25F, -5.5F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 243
        gunModel[167].setRotationPoint(-75F, -25F, -5.5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 8, 6, 11, 0F, 0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, 0F, 0F, 0F, -0.5F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 244
        gunModel[168].setRotationPoint(-90F, -25F, -5.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 15, 1, 11, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 245
        gunModel[169].setRotationPoint(-67.5F, -15F, -5.5F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 1, 19, 11, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 246
        gunModel[170].setRotationPoint(-54F, -27F, -5.5F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
        gunModel[171].setRotationPoint(-32F, -43F, -2F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        gunModel[172].setRotationPoint(-34F, -42F, -2F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.99F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.99F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 250
        gunModel[173].setRotationPoint(-34F, -43F, -2F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.99F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.99F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 251
        gunModel[174].setRotationPoint(-32F, -44F, -2F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
        gunModel[175].setRotationPoint(-36F, -42F, -2F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 253
        gunModel[176].setRotationPoint(-92F, -41F, -2F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 254
        gunModel[177].setRotationPoint(-26.75F, -24.25F, -5.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 2, 5, 11, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F); // Box 255
        gunModel[178].setRotationPoint(-90F, -19F, -5.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, 2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 256
        gunModel[179].setRotationPoint(-89F, -14F, -5.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 257
        gunModel[180].setRotationPoint(-83.5F, -14F, -5.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F, -0.125F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 259
        gunModel[181].setRotationPoint(-89F, -13F, -5.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 260
        gunModel[182].setRotationPoint(-89F, -12F, -5F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 261
        gunModel[183].setRotationPoint(-89F, -10F, -4.5F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 262
        gunModel[184].setRotationPoint(-89F, -8F, -4F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 263
        gunModel[185].setRotationPoint(-88F, -6F, -3.5F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 264
        gunModel[186].setRotationPoint(-88F, -4F, -3F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2.5F, -5F, 0F, -2.5F, -5F, 0F, -2.5F, 5F, 0F, -2.5F); // Box 265
        gunModel[187].setRotationPoint(-70.5F, -12F, -5F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 29, 11, 10, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 266
        gunModel[188].setRotationPoint(-88F, -25F, -5F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 20, 11, 10, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, -2.75F, -5F, 0F, -2.75F, -5F, 0F, -2.75F, -2F, 0F, -2.75F); // Box 267
        gunModel[189].setRotationPoint(-88F, -14F, -5F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 268
        gunModel[190].setRotationPoint(-88F, -2F, -2.5F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 5F, 0F, -2.5F, -6F, 2F, -2.5F, -6F, 2F, -2.5F, 5F, 0F, -2.5F); // Box 269
        gunModel[191].setRotationPoint(-66.5F, -12F, -5F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 270
        gunModel[192].setRotationPoint(-68.5F, -12F, -5F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 271
        gunModel[193].setRotationPoint(26F, -20.5F, -5.5F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 272
        gunModel[194].setRotationPoint(26F, -21F, -5.5F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
        gunModel[195].setRotationPoint(26F, -20F, -5.5F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 274
        gunModel[196].setRotationPoint(24F, -21F, -5.5F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 275
        gunModel[197].setRotationPoint(24F, -20.5F, -5.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        gunModel[198].setRotationPoint(24F, -20F, -5.5F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 277
        gunModel[199].setRotationPoint(24.5F, -21F, -5F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.125F, 5F, -0.5F, -0.25F, 5F, -0.5F, -0.25F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.5F, -0.25F, 5F, -0.5F, -0.25F, 5F, -0.125F, -0.125F, 5F); // Box 278
        gunModel[200].setRotationPoint(24.5F, -20.5F, -0.5F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, -0.625F, 5F, -0.25F, -1F, 5F, -0.25F, -1F, 5F, -0.625F, -0.625F, 5F, -0.125F, 0.125F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F, 5F, -0.125F, 0.125F, 5F); // Box 279
        gunModel[201].setRotationPoint(24.5F, -21.5F, -0.5F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.25F, -0.5F, 5F, -0.25F, -0.5F, 5F, -0.25F, -0.5F, 5F, -0.25F, -0.5F, 5F); // Box 281
        gunModel[202].setRotationPoint(25F, -21F, -0.5F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -1F, 5F, -0.625F, -0.625F, 5F, -0.625F, -0.625F, 5F, -0.25F, -1F, 5F, -0.5F, 0.25F, 5F, -0.125F, 0.125F, 5F, -0.125F, 0.125F, 5F, -0.5F, 0.25F, 5F); // Box 282
        gunModel[203].setRotationPoint(25.5F, -21.5F, -0.5F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.5F, -0.25F, 5F, -0.5F, -0.25F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.5F, -0.25F, 5F); // Box 283
        gunModel[204].setRotationPoint(25.5F, -20.5F, -0.5F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 5F, -0.125F, 0.125F, 5F, -0.125F, 0.125F, 5F, -0.5F, 0.25F, 5F, -0.25F, -1F, 5F, -0.625F, -0.625F, 5F, -0.625F, -0.625F, 5F, -0.25F, -1F, 5F); // Box 284
        gunModel[205].setRotationPoint(25.5F, -19.5F, -0.5F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 5F, -0.25F, -0.5F, 5F, -0.25F, -0.5F, 5F, -0.25F, -0.5F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F, -0.125F, -0.125F, 5F); // Box 285
        gunModel[206].setRotationPoint(25F, -20F, -0.5F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.125F, 5F, -0.5F, 0.25F, 5F, -0.5F, 0.25F, 5F, -0.125F, 0.125F, 5F, -0.625F, -0.625F, 5F, -0.25F, -1F, 5F, -0.25F, -1F, 5F, -0.625F, -0.625F, 5F); // Box 286
        gunModel[207].setRotationPoint(24.5F, -19.5F, -0.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F); // Box 287
        gunModel[208].setRotationPoint(25F, -20.5F, -0.5F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0.5F, 0F, 6F, 0.5F, -0.5F, 6F, 0.5F, 0F, -6.5F, 0.5F, 0F); // Box 288
        gunModel[209].setRotationPoint(20.5F, -27.5F, -5.5F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
        gunModel[210].setRotationPoint(27F, -21F, -5.5F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 290
        gunModel[211].setRotationPoint(27F, -19F, -5.5F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F, 0.5F, 0.125F, -2F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.5F, 0.125F, -2F, 0.5F, -0.125F, -2F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.125F, -2F); // Box 291
        gunModel[212].setRotationPoint(15F, -23.25F, -7F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 292
        gunModel[213].setRotationPoint(19.5F, -22.5F, -6.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 293
        gunModel[214].setRotationPoint(19.5F, -23F, -6.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 294
        gunModel[215].setRotationPoint(19.5F, -20F, -6.5F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 295
        gunModel[216].setRotationPoint(15.5F, -20F, -5.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 296
        gunModel[217].setRotationPoint(15.5F, -20.5F, -5.5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 297
        gunModel[218].setRotationPoint(15.5F, -19.5F, -5.5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 298
        gunModel[219].setRotationPoint(11.5F, -20F, -5.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 299
        gunModel[220].setRotationPoint(11.5F, -20.5F, -5.5F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 300
        gunModel[221].setRotationPoint(11.5F, -21F, -5.5F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 301
        gunModel[222].setRotationPoint(-92F, -33F, -4.5F);

        gunModel[223].addShapeBox(0F, 0F, 0F, 5, 7, 11, 0F, 2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, 2F, 0.5F, -0.25F, 0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0.875F, 0F, -0.25F); // Box 303
        gunModel[223].setRotationPoint(-95F, -32F, -5.5F);

        gunModel[224].addShapeBox(0F, 0F, 0F, 5, 6, 11, 0F, 0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0.875F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 304
        gunModel[224].setRotationPoint(-95F, -25F, -5.5F);

        gunModel[225].addShapeBox(0F, 0F, 0F, 5, 5, 11, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 305
        gunModel[225].setRotationPoint(-95F, -19F, -5.5F);

        gunModel[226].addShapeBox(0F, 0F, 0F, 5, 14, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, -0.25F, -3.5F, 2F, -0.25F, -3.5F, 2F, -0.25F, -3.5F, -2F, -0.25F, -3.5F); // Box 306
        gunModel[226].setRotationPoint(-94F, -14F, -5.5F);

        gunModel[227].addShapeBox(0F, 0F, 0F, 5, 5, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 307
        gunModel[227].setRotationPoint(-97F, -37F, -5.5F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F, 0F, -0.25F, -3.125F, 0F, -0.25F, -3.125F, 0F, -0.25F, -3.125F, 0F, -0.25F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 308
        gunModel[228].setRotationPoint(-97F, -41F, -5.5F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, -0.75F, -3.125F, 0F, -0.25F, -3.125F, 0F, -0.25F, -3.125F, 0F, -0.75F, -3.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 309
        gunModel[229].setRotationPoint(-98F, -41F, -5.5F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F); // Box 310
        gunModel[230].setRotationPoint(-98F, -37F, -5.5F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F, 2F, 0.5F, -0.75F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, 2F, 0.5F, -0.75F, 0.875F, 0F, -0.75F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0.875F, 0F, -0.75F); // Box 311
        gunModel[231].setRotationPoint(-96F, -32F, -5.5F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F, 0.875F, 0F, -0.75F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0.875F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F); // Box 312
        gunModel[232].setRotationPoint(-96F, -25F, -5.5F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.75F, -1F, 0F, -0.75F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.75F); // Box 313
        gunModel[233].setRotationPoint(-96F, -19F, -5.5F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 1, 14, 11, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -2F, -0.75F, -3.5F, 2F, -0.25F, -3.5F, 2F, -0.25F, -3.5F, -2F, -0.75F, -3.5F); // Box 314
        gunModel[234].setRotationPoint(-95F, -14F, -5.5F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F); // Box 315
        gunModel[235].setRotationPoint(-88.5F, -34.75F, -5F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F); // Box 316
        gunModel[236].setRotationPoint(-88.5F, -35.75F, -5F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F); // Box 317
        gunModel[237].setRotationPoint(-88.5F, -36.75F, -5F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 318
        gunModel[238].setRotationPoint(-89F, -36.25F, -5F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F); // Box 319
        gunModel[239].setRotationPoint(-89.5F, -36.75F, -5F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F); // Box 320
        gunModel[240].setRotationPoint(-89.5F, -35.75F, -5F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F); // Box 321
        gunModel[241].setRotationPoint(-89.5F, -34.75F, -5F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 322
        gunModel[242].setRotationPoint(-89F, -35.25F, -5F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 323
        gunModel[243].setRotationPoint(-89F, -35.75F, -5F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[244].setRotationPoint(-87.5F, -35.75F, -5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 326
        gunModel[245].setRotationPoint(-87.5F, -36.25F, -5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 327
        gunModel[246].setRotationPoint(-90F, -36.25F, -5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 328
        gunModel[247].setRotationPoint(-90F, -35.75F, -5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        gunModel[248].setRotationPoint(-90F, -35.25F, -5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 330
        gunModel[249].setRotationPoint(-86F, -35.75F, -5F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 331
        gunModel[250].setRotationPoint(-86F, -36.25F, -5F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F); // Box 332
        gunModel[251].setRotationPoint(-85.5F, -36.75F, -5F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F); // Box 333
        gunModel[252].setRotationPoint(-85.5F, -35.75F, -5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F); // Box 334
        gunModel[253].setRotationPoint(-85.5F, -34.75F, -5F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 335
        gunModel[254].setRotationPoint(-86F, -35.25F, -5F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F); // Box 336
        gunModel[255].setRotationPoint(-86.5F, -34.75F, -5F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F); // Box 337
        gunModel[256].setRotationPoint(-86.5F, -35.75F, -5F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F); // Box 338
        gunModel[257].setRotationPoint(-86.5F, -36.75F, -5F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
        gunModel[258].setRotationPoint(-85F, -35.25F, -5F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 343
        gunModel[259].setRotationPoint(-85F, -35.75F, -5F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 344
        gunModel[260].setRotationPoint(-85F, -36.25F, -5F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 345
        gunModel[261].setRotationPoint(-92F, -37F, 4F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 346
        gunModel[262].setRotationPoint(-92F, -37F, -5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 347
        gunModel[263].setRotationPoint(-90F, -37F, 4F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 348
        gunModel[264].setRotationPoint(-90F, -37F, -5F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
        gunModel[265].setRotationPoint(-90F, -34.5F, -5F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
        gunModel[266].setRotationPoint(-90F, -34.5F, 4F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 351
        gunModel[267].setRotationPoint(-89.5F, -36.25F, -4.5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 352
        gunModel[268].setRotationPoint(-87.5F, -35.25F, -5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F); // Box 353
        gunModel[269].setRotationPoint(-29.5F, -34.75F, -5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F); // Box 354
        gunModel[270].setRotationPoint(-29.5F, -35.75F, -5F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F); // Box 355
        gunModel[271].setRotationPoint(-29.5F, -36.75F, -5F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 356
        gunModel[272].setRotationPoint(-29F, -36.25F, -5F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F); // Box 357
        gunModel[273].setRotationPoint(-28.5F, -36.75F, -5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F); // Box 358
        gunModel[274].setRotationPoint(-28.5F, -35.75F, -5F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F); // Box 359
        gunModel[275].setRotationPoint(-28.5F, -34.75F, -5F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 360
        gunModel[276].setRotationPoint(-29F, -35.25F, -5F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 361
        gunModel[277].setRotationPoint(-29F, -35.75F, -5F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
        gunModel[278].setRotationPoint(-30F, -35.25F, -5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
        gunModel[279].setRotationPoint(-30F, -35.75F, -5F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 364
        gunModel[280].setRotationPoint(-30F, -36.25F, -5F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F); // Box 365
        gunModel[281].setRotationPoint(-17.5F, -34.75F, -5F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F); // Box 366
        gunModel[282].setRotationPoint(-17.5F, -35.75F, -5F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F); // Box 367
        gunModel[283].setRotationPoint(-17.5F, -36.75F, -5F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
        gunModel[284].setRotationPoint(-17F, -36.25F, -5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F); // Box 369
        gunModel[285].setRotationPoint(-16.5F, -36.75F, -5F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F); // Box 370
        gunModel[286].setRotationPoint(-16.5F, -35.75F, -5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F); // Box 371
        gunModel[287].setRotationPoint(-16.5F, -34.75F, -5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 372
        gunModel[288].setRotationPoint(-17F, -35.25F, -5F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 373
        gunModel[289].setRotationPoint(-17F, -35.75F, -5F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
        gunModel[290].setRotationPoint(-16F, -35.25F, -5F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 375
        gunModel[291].setRotationPoint(-16F, -35.75F, -5F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 376
        gunModel[292].setRotationPoint(-16F, -36.25F, -5F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 377
        gunModel[293].setRotationPoint(-28F, -35.75F, -5F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 378
        gunModel[294].setRotationPoint(-28F, -36.25F, -5F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
        gunModel[295].setRotationPoint(-28F, -35.25F, -5F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 380
        gunModel[296].setRotationPoint(-18F, -35.75F, -5F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
        gunModel[297].setRotationPoint(-18F, -36.25F, -5F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
        gunModel[298].setRotationPoint(-18F, -35.25F, -5F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 383
        gunModel[299].setRotationPoint(-30F, -37F, -5F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
        gunModel[300].setRotationPoint(-30F, -34.5F, -5F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 385
        gunModel[301].setRotationPoint(-15F, -37F, -5F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 386
        gunModel[302].setRotationPoint(-27F, -36.5F, -5F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 54, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 387
        gunModel[303].setRotationPoint(-84F, -37F, 4F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 388
        gunModel[304].setRotationPoint(-30F, -37F, 4F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
        gunModel[305].setRotationPoint(-30F, -34.5F, 4F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 390
        gunModel[306].setRotationPoint(-15F, -37F, 4F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 391
        gunModel[307].setRotationPoint(-27F, -36.5F, 4F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 392
        gunModel[308].setRotationPoint(-29.5F, -36.25F, -4.5F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
        gunModel[309].setRotationPoint(-19F, -29.25F, -5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 394
        gunModel[310].setRotationPoint(-19F, -29.75F, -5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 395
        gunModel[311].setRotationPoint(-19F, -30.25F, -5F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 396
        gunModel[312].setRotationPoint(-20F, -30.25F, -5F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F); // Box 397
        gunModel[313].setRotationPoint(-19.5F, -30.75F, -5F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F); // Box 398
        gunModel[314].setRotationPoint(-19.5F, -29.75F, -5F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F); // Box 399
        gunModel[315].setRotationPoint(-19.5F, -28.75F, -5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 400
        gunModel[316].setRotationPoint(-20F, -29.25F, -5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F); // Box 401
        gunModel[317].setRotationPoint(-20.5F, -28.75F, -5F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F); // Box 402
        gunModel[318].setRotationPoint(-20.5F, -29.75F, -5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F); // Box 403
        gunModel[319].setRotationPoint(-20.5F, -30.75F, -5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 404
        gunModel[320].setRotationPoint(-20F, -29.75F, -5F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
        gunModel[321].setRotationPoint(-28F, -29.25F, -5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
        gunModel[322].setRotationPoint(-28F, -29.75F, -5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 407
        gunModel[323].setRotationPoint(-28F, -30.25F, -5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 408
        gunModel[324].setRotationPoint(-29F, -30.25F, -5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F); // Box 409
        gunModel[325].setRotationPoint(-28.5F, -30.75F, -5F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F); // Box 410
        gunModel[326].setRotationPoint(-28.5F, -29.75F, -5F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F); // Box 411
        gunModel[327].setRotationPoint(-28.5F, -28.75F, -5F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 412
        gunModel[328].setRotationPoint(-29F, -29.25F, -5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F); // Box 413
        gunModel[329].setRotationPoint(-29.5F, -28.75F, -5F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.125F, 0F); // Box 414
        gunModel[330].setRotationPoint(-29.5F, -29.75F, -5F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -0.625F, -0.625F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.625F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.125F, 0F); // Box 415
        gunModel[331].setRotationPoint(-29.5F, -30.75F, -5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 416
        gunModel[332].setRotationPoint(-29F, -29.75F, -5F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
        gunModel[333].setRotationPoint(-30F, -29.25F, -5F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 418
        gunModel[334].setRotationPoint(-30F, -29.75F, -5F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 419
        gunModel[335].setRotationPoint(-30F, -30.25F, -5F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
        gunModel[336].setRotationPoint(-21F, -29.25F, -5F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 421
        gunModel[337].setRotationPoint(-21F, -29.75F, -5F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 422
        gunModel[338].setRotationPoint(-21F, -30.25F, -5F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 6, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
        gunModel[339].setRotationPoint(-27F, -30.5F, -5F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 49, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
        gunModel[340].setRotationPoint(-18F, -30.5F, -5F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
        gunModel[341].setRotationPoint(-21F, -28.5F, -5F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 426
        gunModel[342].setRotationPoint(-21F, -30.5F, -5F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 427
        gunModel[343].setRotationPoint(-30F, -30.5F, -5F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
        gunModel[344].setRotationPoint(-30F, -28.5F, -5F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
        gunModel[345].setRotationPoint(-30F, -30.5F, -4F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 436
        gunModel[346].setRotationPoint(-24F, -27.5F, -5.5F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 442
        gunModel[347].setRotationPoint(-24F, -28.5F, -5.5F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 53, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 444
        gunModel[348].setRotationPoint(-77F, -27.5F, -5.5F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 445
        gunModel[349].setRotationPoint(-22.5F, -25F, -5.5F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
        gunModel[350].setRotationPoint(-22F, -26.5F, -5.5F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
        gunModel[351].setRotationPoint(-24F, -26.5F, -5.5F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 448
        gunModel[352].setRotationPoint(-24.5F, -26F, -5.5F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 449
        gunModel[353].setRotationPoint(-22F, -27.5F, -5.5F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F); // Box 450
        gunModel[354].setRotationPoint(-22F, -28.5F, -5.5F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 451
        gunModel[355].setRotationPoint(-23F, -28.5F, -5.5F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F); // Box 452
        gunModel[356].setRotationPoint(-24F, -26.5F, -5.5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 453
        gunModel[357].setRotationPoint(-23F, -26.5F, -5.5F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F); // Box 454
        gunModel[358].setRotationPoint(-22F, -26.5F, -5.5F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 455
        gunModel[359].setRotationPoint(-23F, -27.5F, -5.5F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F); // Box 456
        gunModel[360].setRotationPoint(-16F, -26.5F, -5.5F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 457
        gunModel[361].setRotationPoint(-17F, -26.5F, -5.5F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F); // Box 458
        gunModel[362].setRotationPoint(-18F, -26.5F, -5.5F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 459
        gunModel[363].setRotationPoint(-18F, -27.5F, -5.5F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 460
        gunModel[364].setRotationPoint(-18F, -28.5F, -5.5F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 461
        gunModel[365].setRotationPoint(-17F, -28.5F, -5.5F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0.25F, -1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F); // Box 462
        gunModel[366].setRotationPoint(-16F, -28.5F, -5.5F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 463
        gunModel[367].setRotationPoint(-16F, -27.5F, -5.5F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
        gunModel[368].setRotationPoint(-21F, -27F, -5.5F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
        gunModel[369].setRotationPoint(-21F, -27.5F, -5.5F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
        gunModel[370].setRotationPoint(-16F, -26.5F, -5.5F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
        gunModel[371].setRotationPoint(-18F, -26.5F, -5.5F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 468
        gunModel[372].setRotationPoint(-18F, -25.5F, -5.5F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 469
        gunModel[373].setRotationPoint(-17F, -27.5F, -5.5F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
        gunModel[374].setRotationPoint(-29.5F, -21.5F, -6F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
        gunModel[375].setRotationPoint(-29.5F, -22.5F, -6F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 472
        gunModel[376].setRotationPoint(-29.5F, -20.5F, -6F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 6, 2, 11, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
        gunModel[377].setRotationPoint(-89F, -32F, -5.5F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
        gunModel[378].setRotationPoint(-89F, -29F, -5.5F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 475
        gunModel[379].setRotationPoint(-89F, -27F, -5.5F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 476
        gunModel[380].setRotationPoint(-89F, -28F, -5.5F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 477
        gunModel[381].setRotationPoint(-89F, -30F, -5.5F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 478
        gunModel[382].setRotationPoint(-89F, -29.5F, -5.5F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 479
        gunModel[383].setRotationPoint(-89F, -30.5F, -5.5F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 480
        gunModel[384].setRotationPoint(-84F, -30.5F, -5.5F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 481
        gunModel[385].setRotationPoint(-84F, -29.5F, -5.5F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 482
        gunModel[386].setRotationPoint(-81.5F, -28.5F, -5.5F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 483
        gunModel[387].setRotationPoint(-81.5F, -27.5F, -5.5F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 484
        gunModel[388].setRotationPoint(-86.5F, -28.5F, -5.5F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 485
        gunModel[389].setRotationPoint(-86.5F, -27.5F, -5.5F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 486
        gunModel[390].setRotationPoint(-88.5F, -25F, -6.5F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, -0.5F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 487
        gunModel[391].setRotationPoint(-88.5F, -26F, -6.5F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, -1F, -0.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F); // Box 488
        gunModel[392].setRotationPoint(-88F, -27F, -6.5F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 489
        gunModel[393].setRotationPoint(-87F, -26.5F, -6.5F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.25F, -1.5F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F); // Box 490
        gunModel[394].setRotationPoint(-86F, -27F, -6.5F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 491
        gunModel[395].setRotationPoint(-85.5F, -26F, -6.5F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 492
        gunModel[396].setRotationPoint(-85.5F, -25F, -6.5F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.75F, 0F); // Box 493
        gunModel[397].setRotationPoint(-85.5F, -24F, -6.5F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F, 0.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.25F, -1.5F, 0F); // Box 494
        gunModel[398].setRotationPoint(-86F, -23F, -6.5F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
        gunModel[399].setRotationPoint(-87F, -23.5F, -6.5F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, -1F, -0.5F, 0F); // Box 496
        gunModel[400].setRotationPoint(-88F, -23F, -6.5F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.5F, 0F, 0F); // Box 497
        gunModel[401].setRotationPoint(-88.5F, -24F, -6.5F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 498
        gunModel[402].setRotationPoint(-87.5F, -25.5F, -6.5F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.5F, -1F, 0F, 3.5F, -1F, 0F, -4F, 0F, 0F); // Box 499
        gunModel[403].setRotationPoint(-77F, -37F, -6F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, -5F, 0F, 0F); // Box 500
        gunModel[404].setRotationPoint(-82F, -41F, -6F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 501
        gunModel[405].setRotationPoint(-82F, -43F, -3F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 3.5F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3.5F, -1F, 0F); // Box 502
        gunModel[406].setRotationPoint(-41F, -37F, -6F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -3F, 5F, -0.5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, -0.5F, 0F); // Box 503
        gunModel[407].setRotationPoint(-36F, -41F, -6F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 504
        gunModel[408].setRotationPoint(-36F, -43F, -3F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 30, 1, 12, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
        gunModel[409].setRotationPoint(-73F, -36F, -6F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 37, 2, 12, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F); // Box 506
        gunModel[410].setRotationPoint(-77F, -37.01F, -6F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 45, 4, 12, 0F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, -5F, -0.5F, -0.25F, -5F, -0.5F, -0.25F, -5F, -0.5F, -0.25F, -5F, -0.5F, -0.25F); // Box 507
        gunModel[411].setRotationPoint(-81F, -41F, -6F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 508
        gunModel[412].setRotationPoint(-81F, -43F, -3F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 510
        gunModel[413].setRotationPoint(-30F, -44F, -2F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 511
        gunModel[414].setRotationPoint(-28F, -44F, -2F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 512
        gunModel[415].setRotationPoint(-24F, -44F, -2F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 513
        gunModel[416].setRotationPoint(-26F, -44F, -2F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 514
        gunModel[417].setRotationPoint(-20F, -44F, -2F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 515
        gunModel[418].setRotationPoint(-22F, -44F, -2F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 516
        gunModel[419].setRotationPoint(-16F, -44F, -2F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 517
        gunModel[420].setRotationPoint(-18F, -44F, -2F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 518
        gunModel[421].setRotationPoint(-6F, -44F, -2F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 519
        gunModel[422].setRotationPoint(-8F, -44F, -2F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 520
        gunModel[423].setRotationPoint(-10F, -44F, -2F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 521
        gunModel[424].setRotationPoint(-12F, -44F, -2F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 522
        gunModel[425].setRotationPoint(-14F, -44F, -2F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 523
        gunModel[426].setRotationPoint(4F, -44F, -2F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 524
        gunModel[427].setRotationPoint(2F, -44F, -2F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 525
        gunModel[428].setRotationPoint(0F, -44F, -2F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 526
        gunModel[429].setRotationPoint(-2F, -44F, -2F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 527
        gunModel[430].setRotationPoint(-4F, -44F, -2F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 528
        gunModel[431].setRotationPoint(14F, -44F, -2F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 529
        gunModel[432].setRotationPoint(12F, -44F, -2F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 530
        gunModel[433].setRotationPoint(10F, -44F, -2F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 531
        gunModel[434].setRotationPoint(8F, -44F, -2F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 532
        gunModel[435].setRotationPoint(6F, -44F, -2F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 533
        gunModel[436].setRotationPoint(24F, -44F, -2F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 534
        gunModel[437].setRotationPoint(22F, -44F, -2F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 535
        gunModel[438].setRotationPoint(20F, -44F, -2F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 536
        gunModel[439].setRotationPoint(18F, -44F, -2F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 537
        gunModel[440].setRotationPoint(16F, -44F, -2F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 538
        gunModel[441].setRotationPoint(26F, -44F, -2F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 539
        gunModel[442].setRotationPoint(28F, -44F, -2F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 540
        gunModel[443].setRotationPoint(30F, -44F, -2F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 541
        gunModel[444].setRotationPoint(32F, -44F, -2F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1F, 0F, 0F); // Box 542
        gunModel[445].setRotationPoint(27F, -19F, 2.5F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 543
        gunModel[446].setRotationPoint(27F, -21F, 2.5F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -6.5F, 0.5F, 0F, 6F, 0.5F, 0F, 6F, 0.5F, -0.5F, -6.5F, 0.5F, 0F); // Box 544
        gunModel[447].setRotationPoint(20.5F, -27.5F, 2.5F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 545
        gunModel[448].setRotationPoint(27F, -21F, -2.5F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F); // Box 546
        gunModel[449].setRotationPoint(27F, -19F, -2.5F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0.5F, 0F, 5.75F, 0.5F, 0F, 5.75F, 0.5F, 0F, -6.5F, 0.5F, 0F); // Box 547
        gunModel[450].setRotationPoint(20.5F, -27.5F, -2.5F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 548
        gunModel[451].setRotationPoint(20.5F, -27.5F, -3.5F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
        gunModel[452].setRotationPoint(20.5F, -26.5F, -2.5F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 550
        gunModel[453].setRotationPoint(20.5F, -24.5F, -2.5F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 33, 1, 13, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
        gunModel[454].setRotationPoint(-59F, -27.5F, -6.5F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 18, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 574
        gunModel[455].setRotationPoint(-58F, -20.5F, -6.5F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 7, 2, 13, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
        gunModel[456].setRotationPoint(-36F, -26.5F, -6.5F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F); // Box 576
        gunModel[457].setRotationPoint(-34F, -26.5F, -6.5F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 577
        gunModel[458].setRotationPoint(-59F, -26.5F, -6.5F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 22, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 578
        gunModel[459].setRotationPoint(-58F, -24F, -6.5F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
        gunModel[460].setRotationPoint(-58F, -24.5F, -6.5F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 580
        gunModel[461].setRotationPoint(-58.5F, -26.5F, -6.5F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 581
        gunModel[462].setRotationPoint(-36.5F, -26.5F, -6.5F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3.5F, 0F, 0F); // Box 582
        gunModel[463].setRotationPoint(-39F, -23.5F, -6.5F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F); // Box 583
        gunModel[464].setRotationPoint(-41.5F, -23.5F, -6.5F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
        gunModel[465].setRotationPoint(-57.5F, -21F, -6.5F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 585
        gunModel[466].setRotationPoint(-58F, -23F, -6.5F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Box 586
        gunModel[467].setRotationPoint(-60F, -26.5F, -6.5F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -1F); // Box 587
        gunModel[468].setRotationPoint(-59F, -20.5F, -6.5F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 588
        gunModel[469].setRotationPoint(-57F, -19.5F, -6.5F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, 0F); // Box 589
        gunModel[470].setRotationPoint(-33F, -26.5F, -6.5F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -1F, -2F, 1F, -1F, 1F, 0F, 0F); // Box 590
        gunModel[471].setRotationPoint(-40F, -20.5F, -6.5F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 591
        gunModel[472].setRotationPoint(-57F, -23F, -6.5F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 592
        gunModel[473].setRotationPoint(-57F, -21.5F, -6.5F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 15, 1, 13, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 593
        gunModel[474].setRotationPoint(-57F, -23F, -6.5F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 594
        gunModel[475].setRotationPoint(-51F, -22.75F, 6.5F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
        gunModel[476].setRotationPoint(-51F, -22.75F, -7.5F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 29, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
        gunModel[477].setRotationPoint(-65F, -34F, -8F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 4, 4, 13, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 597
        gunModel[478].setRotationPoint(-74.5F, -34F, -7F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 29, 1, 15, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
        gunModel[479].setRotationPoint(-65F, -35F, -8F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 599
        gunModel[480].setRotationPoint(-74.5F, -35F, -7F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 29, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 600
        gunModel[481].setRotationPoint(-65F, -30F, -8F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 601
        gunModel[482].setRotationPoint(-74.5F, -30F, -7F);

        gunModel[483].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
        gunModel[483].setRotationPoint(-70.5F, -34F, -6.5F);

        gunModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
        gunModel[484].setRotationPoint(-70.5F, -35F, -6.5F);

        gunModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 604
        gunModel[485].setRotationPoint(-70.5F, -30F, -6.5F);

        gunModel[486].addShapeBox(0F, 0F, 0F, 5, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 605
        gunModel[486].setRotationPoint(-36F, -34F, -8F);

        gunModel[487].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 606
        gunModel[487].setRotationPoint(-36F, -35F, -8F);

        gunModel[488].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 607
        gunModel[488].setRotationPoint(-36F, -30F, -8F);

        gunModel[489].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 608
        gunModel[489].setRotationPoint(-70F, -30F, -8F);

        gunModel[490].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F); // Box 609
        gunModel[490].setRotationPoint(-70F, -34F, -8F);

        gunModel[491].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 610
        gunModel[491].setRotationPoint(-70F, -35F, -8F);

        gunModel[492].addShapeBox(0F, 0F, 0F, 25, 2, 18, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 611
        gunModel[492].setRotationPoint(-64F, -33F, -9.5F);

        gunModel[493].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F); // Box 612
        gunModel[493].setRotationPoint(-39F, -33F, -9.5F);

        gunModel[494].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F); // Box 613
        gunModel[494].setRotationPoint(-65F, -33F, -9.5F);

        gunModel[495].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 614
        gunModel[495].setRotationPoint(-69F, -33F, -8.5F);

        gunModel[496].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 615
        gunModel[496].setRotationPoint(-70F, -31F, -8F);

        gunModel[497].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 616
        gunModel[497].setRotationPoint(-70F, -32.5F, -7.5F);

        gunModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 617
        gunModel[498].setRotationPoint(-73.5F, -32.5F, -7F);

        gunModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 618
        gunModel[499].setRotationPoint(-73.5F, -33.5F, -7F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 619
        gunModel[501] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Box 583
        gunModel[502] = new ModelRendererTurbo(this, 681, 177, textureX, textureY); // Box 584
        gunModel[503] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 585
        gunModel[504] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 586
        gunModel[505] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 587
        gunModel[506] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 588
        gunModel[507] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 589
        gunModel[508] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 590
        gunModel[509] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 591
        gunModel[510] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 592
        gunModel[511] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 593
        gunModel[512] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 594
        gunModel[513] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 595
        gunModel[514] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 596
        gunModel[515] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 597
        gunModel[516] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 598
        gunModel[517] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 613
        gunModel[518] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 614
        gunModel[519] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 626
        gunModel[520] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 627
        gunModel[521] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 628
        gunModel[522] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 629
        gunModel[523] = new ModelRendererTurbo(this, 561, 193, textureX, textureY); // Box 630
        gunModel[524] = new ModelRendererTurbo(this, 689, 193, textureX, textureY); // Box 631
        gunModel[525] = new ModelRendererTurbo(this, 721, 193, textureX, textureY); // Box 632
        gunModel[526] = new ModelRendererTurbo(this, 753, 193, textureX, textureY); // Box 633
        gunModel[527] = new ModelRendererTurbo(this, 865, 193, textureX, textureY); // Box 636
        gunModel[528] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 638
        gunModel[529] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 639
        gunModel[530] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 640
        gunModel[531] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 641
        gunModel[532] = new ModelRendererTurbo(this, 785, 193, textureX, textureY); // Box 644
        gunModel[533] = new ModelRendererTurbo(this, 809, 201, textureX, textureY); // Box 645
        gunModel[534] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 646
        gunModel[535] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 647
        gunModel[536] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 648
        gunModel[537] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 651
        gunModel[538] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 652
        gunModel[539] = new ModelRendererTurbo(this, 601, 209, textureX, textureY); // Box 653
        gunModel[540] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Box 654
        gunModel[541] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 655
        gunModel[542] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 656
        gunModel[543] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 659
        gunModel[544] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 660
        gunModel[545] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 661
        gunModel[546] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 662
        gunModel[547] = new ModelRendererTurbo(this, 921, 201, textureX, textureY); // Box 664
        gunModel[548] = new ModelRendererTurbo(this, 953, 201, textureX, textureY); // Box 665
        gunModel[549] = new ModelRendererTurbo(this, 985, 201, textureX, textureY); // Box 666
        gunModel[550] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 667
        gunModel[551] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 668
        gunModel[552] = new ModelRendererTurbo(this, 785, 209, textureX, textureY); // Box 669
        gunModel[553] = new ModelRendererTurbo(this, 817, 209, textureX, textureY); // Box 670
        gunModel[554] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 671
        gunModel[555] = new ModelRendererTurbo(this, 849, 209, textureX, textureY); // Box 672
        gunModel[556] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box 673
        gunModel[557] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 674
        gunModel[558] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 675
        gunModel[559] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 676
        gunModel[560] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 677
        gunModel[561] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 678
        gunModel[562] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 679
        gunModel[563] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 680
        gunModel[564] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 681
        gunModel[565] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 683
        gunModel[566] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 685
        gunModel[567] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 686
        gunModel[568] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 687
        gunModel[569] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 688
        gunModel[570] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 689
        gunModel[571] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Box 690
        gunModel[572] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 691
        gunModel[573] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 693
        gunModel[574] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 694
        gunModel[575] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 695
        gunModel[576] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 696
        gunModel[577] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 700
        gunModel[578] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 701
        gunModel[579] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 702
        gunModel[580] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 703
        gunModel[581] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 704
        gunModel[582] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 705
        gunModel[583] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 706
        gunModel[584] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 707
        gunModel[585] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 708
        gunModel[586] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 712
        gunModel[587] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 713
        gunModel[588] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 714
        gunModel[589] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 715
        gunModel[590] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 716
        gunModel[591] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 717
        gunModel[592] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 718
        gunModel[593] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 719
        gunModel[594] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 720
        gunModel[595] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 721
        gunModel[596] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 722
        gunModel[597] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 723
        gunModel[598] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 724
        gunModel[599] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 725
        gunModel[600] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 726
        gunModel[601] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 727
        gunModel[602] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 728
        gunModel[603] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 729
        gunModel[604] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 731
        gunModel[605] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 732
        gunModel[606] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 736
        gunModel[607] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 737
        gunModel[608] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 738
        gunModel[609] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 739
        gunModel[610] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 740
        gunModel[611] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 741
        gunModel[612] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 742
        gunModel[613] = new ModelRendererTurbo(this, 521, 49, textureX, textureY); // Box 743
        gunModel[614] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 744
        gunModel[615] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 745
        gunModel[616] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 746
        gunModel[617] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 747
        gunModel[618] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 748
        gunModel[619] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 749
        gunModel[620] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 750
        gunModel[621] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 751
        gunModel[622] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 752
        gunModel[623] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 753
        gunModel[624] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 754
        gunModel[625] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 755
        gunModel[626] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 756
        gunModel[627] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 757
        gunModel[628] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 758
        gunModel[629] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 759
        gunModel[630] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 760
        gunModel[631] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 761
        gunModel[632] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 762
        gunModel[633] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 763
        gunModel[634] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 764
        gunModel[635] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 765
        gunModel[636] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 766
        gunModel[637] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 767
        gunModel[638] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 768
        gunModel[639] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 769
        gunModel[640] = new ModelRendererTurbo(this, 561, 217, textureX, textureY); // Box 771
        gunModel[641] = new ModelRendererTurbo(this, 601, 217, textureX, textureY); // Box 772
        gunModel[642] = new ModelRendererTurbo(this, 641, 217, textureX, textureY); // Box 773
        gunModel[643] = new ModelRendererTurbo(this, 681, 217, textureX, textureY); // Box 774
        gunModel[644] = new ModelRendererTurbo(this, 937, 217, textureX, textureY); // Box 776
        gunModel[645] = new ModelRendererTurbo(this, 977, 217, textureX, textureY); // Box 778
        gunModel[646] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 779
        gunModel[647] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 780
        gunModel[648] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 781
        gunModel[649] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 782
        gunModel[650] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 783
        gunModel[651] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 784
        gunModel[652] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 785
        gunModel[653] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 789
        gunModel[654] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 790
        gunModel[655] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 791
        gunModel[656] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 792
        gunModel[657] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 793
        gunModel[658] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 794
        gunModel[659] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 795
        gunModel[660] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 796
        gunModel[661] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 797
        gunModel[662] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 798
        gunModel[663] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 799
        gunModel[664] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 800
        gunModel[665] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 801
        gunModel[666] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 802
        gunModel[667] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 805
        gunModel[668] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 806
        gunModel[669] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 807
        gunModel[670] = new ModelRendererTurbo(this, 585, 217, textureX, textureY); // Box 808
        gunModel[671] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 809
        gunModel[672] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 810
        gunModel[673] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 811
        gunModel[674] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 812
        gunModel[675] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 813
        gunModel[676] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 814
        gunModel[677] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 815
        gunModel[678] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 899
        gunModel[679] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 900
        gunModel[680] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 901
        gunModel[681] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 902
        gunModel[682] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Box 903
        gunModel[683] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 904
        gunModel[684] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 905
        gunModel[685] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 906
        gunModel[686] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 907
        gunModel[687] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 908
        gunModel[688] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 909
        gunModel[689] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 910
        gunModel[690] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 911
        gunModel[691] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 912
        gunModel[692] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 913
        gunModel[693] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 914
        gunModel[694] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 915
        gunModel[695] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 916
        gunModel[696] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 917
        gunModel[697] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 918
        gunModel[698] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 919
        gunModel[699] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 920
        gunModel[700] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 921
        gunModel[701] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 922
        gunModel[702] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 923
        gunModel[703] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 924
        gunModel[704] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 925
        gunModel[705] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 926
        gunModel[706] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 927
        gunModel[707] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 928
        gunModel[708] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 929
        gunModel[709] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 930
        gunModel[710] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 931
        gunModel[711] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 932
        gunModel[712] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 933
        gunModel[713] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 934
        gunModel[714] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 935
        gunModel[715] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 936
        gunModel[716] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 937
        gunModel[717] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 938
        gunModel[718] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 939
        gunModel[719] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 642
        gunModel[720] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 643
        gunModel[721] = new ModelRendererTurbo(this, 625, 217, textureX, textureY); // Box 786
        gunModel[722] = new ModelRendererTurbo(this, 665, 217, textureX, textureY); // Box 787
        gunModel[723] = new ModelRendererTurbo(this, 961, 217, textureX, textureY); // Box 788
        gunModel[724] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Box 599
        gunModel[725] = new ModelRendererTurbo(this, 705, 225, textureX, textureY); // Box 600
        gunModel[726] = new ModelRendererTurbo(this, 745, 225, textureX, textureY); // Box 602
        gunModel[727] = new ModelRendererTurbo(this, 785, 225, textureX, textureY); // Box 603
        gunModel[728] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 604
        gunModel[729] = new ModelRendererTurbo(this, 873, 217, textureX, textureY); // Box 605
        gunModel[730] = new ModelRendererTurbo(this, 825, 225, textureX, textureY); // Box 606
        gunModel[731] = new ModelRendererTurbo(this, 1001, 217, textureX, textureY); // Box 607
        gunModel[732] = new ModelRendererTurbo(this, 849, 225, textureX, textureY); // Box 608
        gunModel[733] = new ModelRendererTurbo(this, 889, 225, textureX, textureY); // Box 609
        gunModel[734] = new ModelRendererTurbo(this, 921, 225, textureX, textureY); // Box 610
        gunModel[735] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 611
        gunModel[736] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 612
        gunModel[737] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 615
        gunModel[738] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 616
        gunModel[739] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 617
        gunModel[740] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Box 618
        gunModel[741] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 619
        gunModel[742] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 620
        gunModel[743] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 621
        gunModel[744] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 622
        gunModel[745] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 623
        gunModel[746] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 624
        gunModel[747] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 54
        gunModel[748] = new ModelRendererTurbo(this, 553, 241, textureX, textureY); // Box 55
        gunModel[749] = new ModelRendererTurbo(this, 665, 241, textureX, textureY); // Box 57
        gunModel[750] = new ModelRendererTurbo(this, 705, 241, textureX, textureY); // Box 58
        gunModel[751] = new ModelRendererTurbo(this, 825, 241, textureX, textureY); // Box 59
        gunModel[752] = new ModelRendererTurbo(this, 937, 241, textureX, textureY); // Box 60
        gunModel[753] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Box 62
        gunModel[754] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 64
        gunModel[755] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 65
        gunModel[756] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 66
        gunModel[757] = new ModelRendererTurbo(this, 905, 225, textureX, textureY); // Box 67
        gunModel[758] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Box 68
        gunModel[759] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 69
        gunModel[760] = new ModelRendererTurbo(this, 865, 241, textureX, textureY); // Box 70
        gunModel[761] = new ModelRendererTurbo(this, 977, 241, textureX, textureY); // Box 71
        gunModel[762] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 72
        gunModel[763] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 73
        gunModel[764] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 74
        gunModel[765] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 75
        gunModel[766] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 76
        gunModel[767] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 77
        gunModel[768] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 78
        gunModel[769] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 79
        gunModel[770] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 80
        gunModel[771] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 81
        gunModel[772] = new ModelRendererTurbo(this, 849, 105, textureX, textureY); // Box 82
        gunModel[773] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 83
        gunModel[774] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 84
        gunModel[775] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 85
        gunModel[776] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 86
        gunModel[777] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 87
        gunModel[778] = new ModelRendererTurbo(this, 561, 249, textureX, textureY); // Box 88
        gunModel[779] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Box 89
        gunModel[780] = new ModelRendererTurbo(this, 745, 249, textureX, textureY); // Box 90
        gunModel[781] = new ModelRendererTurbo(this, 785, 249, textureX, textureY); // Box 91
        gunModel[782] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 92
        gunModel[783] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 93
        gunModel[784] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 94
        gunModel[785] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 99
        gunModel[786] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 100
        gunModel[787] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 102
        gunModel[788] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 103
        gunModel[789] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 104
        gunModel[790] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 105
        gunModel[791] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 106
        gunModel[792] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 107
        gunModel[793] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 108
        gunModel[794] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 109
        gunModel[795] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 123
        gunModel[796] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 124

        gunModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F); // Box 619
        gunModel[500].setRotationPoint(-73.5F, -31.5F, -7F);

        gunModel[501].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
        gunModel[501].setRotationPoint(22F, -18F, -4.5F);

        gunModel[502].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 584
        gunModel[502].setRotationPoint(22F, -14F, -4.5F);

        gunModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 585
        gunModel[503].setRotationPoint(21.5F, -18F, -4.5F);

        gunModel[504].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 586
        gunModel[504].setRotationPoint(12F, -9F, -4.5F);

        gunModel[505].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 587
        gunModel[505].setRotationPoint(21F, -10F, -4.5F);

        gunModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
        gunModel[506].setRotationPoint(11F, -9F, -4.5F);

        gunModel[507].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 589
        gunModel[507].setRotationPoint(5F, -11F, -4.5F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
        gunModel[508].setRotationPoint(5F, -18F, -4.5F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
        gunModel[509].setRotationPoint(5F, -12F, -4.5F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
        gunModel[510].setRotationPoint(12F, -18F, -2F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
        gunModel[511].setRotationPoint(12F, -15F, -2F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1F, 0F, 0F); // Box 594
        gunModel[512].setRotationPoint(12F, -13F, -2F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
        gunModel[513].setRotationPoint(10F, -15F, -1F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 596
        gunModel[514].setRotationPoint(10F, -18F, -1F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, -1F, 0F); // Box 597
        gunModel[515].setRotationPoint(10F, -13F, -1F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 598
        gunModel[516].setRotationPoint(-3F, -18F, -1.5F);

        gunModel[517].addShapeBox(0F, 0F, 0F, 29, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 613
        gunModel[517].setRotationPoint(-3F, -18F, -5.5F);

        gunModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -1.25F, -0.5F); // Box 614
        gunModel[518].setRotationPoint(-5F, -18F, -5.5F);

        gunModel[519].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F); // Box 626
        gunModel[519].setRotationPoint(33F, -41F, -6F);

        gunModel[520].addShapeBox(0F, 0F, 0F, 51, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
        gunModel[520].setRotationPoint(30F, -33F, -6F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 628
        gunModel[521].setRotationPoint(21F, -34.5F, -6F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
        gunModel[522].setRotationPoint(19F, -34.5F, -6F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
        gunModel[523].setRotationPoint(19F, -32.5F, -6F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 631
        gunModel[524].setRotationPoint(19F, -31.5F, -6F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.49F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.49F, -0.5F, 0F); // Box 632
        gunModel[525].setRotationPoint(20F, -29.5F, -6F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 633
        gunModel[526].setRotationPoint(21F, -30.5F, -6F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 51, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
        gunModel[527].setRotationPoint(30F, -33F, 5F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 638
        gunModel[528].setRotationPoint(38F, -43F, -2F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
        gunModel[529].setRotationPoint(38F, -44F, -2F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 640
        gunModel[530].setRotationPoint(38F, -44F, -2F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
        gunModel[531].setRotationPoint(38F, -42F, -3F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F, 0F, -2.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.49F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 644
        gunModel[532].setRotationPoint(28F, -37F, -6F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 57, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
        gunModel[533].setRotationPoint(21F, -30F, -6F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F); // Box 646
        gunModel[534].setRotationPoint(21F, -28F, -6F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Box 647
        gunModel[535].setRotationPoint(21F, -27F, -5F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 57, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 648
        gunModel[536].setRotationPoint(21F, -30F, 5F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 60, 1, 5, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[537].setRotationPoint(21F, -27F, -2.5F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 652
        gunModel[538].setRotationPoint(21F, -28F, 5F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 57, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 653
        gunModel[539].setRotationPoint(21F, -27F, 4F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 22, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 0F, -4.99F, -0.5F, 0F, -4.99F, 0F, -5F, 0F, 0F); // Box 654
        gunModel[540].setRotationPoint(20.5F, -28F, -6F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, -5F, -1.5F, 0F, -5F, 1F, -1F, 0F, 1F); // Box 655
        gunModel[541].setRotationPoint(25.5F, -23F, -6F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -5F, -2.5F, 0F, -5F, 2F, 0F, 0F, 2F); // Box 656
        gunModel[542].setRotationPoint(26.5F, -22F, -5F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 659
        gunModel[543].setRotationPoint(26.5F, -22F, -2.5F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 22, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, 0F, 0F, -4.99F, 0F, 0F, -4.99F, -0.5F, -5F, 0F, -0.5F); // Box 660
        gunModel[544].setRotationPoint(20.5F, -28F, 5F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 1F, 0F, -5F, 1F, 0F, -5F, -1.5F, -1F, 0F, -1.5F); // Box 661
        gunModel[545].setRotationPoint(25.5F, -23F, 5F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -5F, 2F, 0F, -5F, -2.5F, 0F, 0F, -2.5F); // Box 662
        gunModel[546].setRotationPoint(26.5F, -22F, 4F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4.25F, -0.75F, 0F, 4.25F, -0.75F, 0F, -5F, 0F, 0F); // Box 664
        gunModel[547].setRotationPoint(20.49F, -28F, -6F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0.25F, -1.75F, -1F, 0.25F, -1.75F, -1F, -1F, -1F, -1F); // Box 665
        gunModel[548].setRotationPoint(25.49F, -23F, -6F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, 0F, 0F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, 0.25F, -1.75F, -2F, 0.25F, -1.75F, -2F, -1F, -1F, -2F); // Box 666
        gunModel[549].setRotationPoint(26.49F, -22F, -5F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 667
        gunModel[550].setRotationPoint(33F, -30F, -6F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F); // Box 668
        gunModel[551].setRotationPoint(34F, -29F, -6F);

        gunModel[552].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 669
        gunModel[552].setRotationPoint(35F, -28F, -6F);

        gunModel[553].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, -0.75F, 0F, -1F); // Box 670
        gunModel[553].setRotationPoint(36.5F, -26F, -6F);

        gunModel[554].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2F, 0.25F, -0.5F, -2F, 0.25F, -0.5F, -2F, -0.75F, 0F, -2F); // Box 671
        gunModel[554].setRotationPoint(37.25F, -25F, -5F);

        gunModel[555].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 672
        gunModel[555].setRotationPoint(46F, -30F, -6F);

        gunModel[556].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -0.75F, 0F, -1F); // Box 673
        gunModel[556].setRotationPoint(48F, -28F, -6F);

        gunModel[557].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 674
        gunModel[557].setRotationPoint(47F, -29F, -6F);

        gunModel[558].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, -0.75F, 0.25F, -2.25F); // Box 675
        gunModel[558].setRotationPoint(48.75F, -27F, -5F);

        gunModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, -0.75F, 0.25F, -2.25F); // Box 676
        gunModel[559].setRotationPoint(61.75F, -27F, -5F);

        gunModel[560].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -0.75F, 0F, -1F); // Box 677
        gunModel[560].setRotationPoint(61F, -28F, -6F);

        gunModel[561].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 678
        gunModel[561].setRotationPoint(60F, -29F, -6F);

        gunModel[562].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 679
        gunModel[562].setRotationPoint(59F, -30F, -6F);

        gunModel[563].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, -0.75F, 0.25F, -2.25F); // Box 680
        gunModel[563].setRotationPoint(74.75F, -27F, -5F);

        gunModel[564].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.75F, 0F, 1F); // Box 681
        gunModel[564].setRotationPoint(74F, -28F, -6F);

        gunModel[565].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 683
        gunModel[565].setRotationPoint(72F, -30F, -6F);

        gunModel[566].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 685
        gunModel[566].setRotationPoint(72F, -30F, 5F);

        gunModel[567].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -0.75F, 0F, -1F); // Box 686
        gunModel[567].setRotationPoint(74F, -28F, 5F);

        gunModel[568].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.5F, -0.99F, 0F, -0.5F, -0.99F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
        gunModel[568].setRotationPoint(74F, -28F, 3.5F);

        gunModel[569].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.99F, 0F, -0.5F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
        gunModel[569].setRotationPoint(74F, -28F, -4.5F);

        gunModel[570].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 689
        gunModel[570].setRotationPoint(78F, -35F, -6F);

        gunModel[571].addShapeBox(0F, 0F, 0F, 48, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 690
        gunModel[571].setRotationPoint(30F, -37F, -6F);

        gunModel[572].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
        gunModel[572].setRotationPoint(67F, -34.5F, -6F);

        gunModel[573].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 693
        gunModel[573].setRotationPoint(67F, -35F, -6F);

        gunModel[574].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 694
        gunModel[574].setRotationPoint(67F, -34F, -6F);

        gunModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 695
        gunModel[575].setRotationPoint(78F, -34F, -6F);

        gunModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 696
        gunModel[576].setRotationPoint(78F, -35F, -6F);

        gunModel[577].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
        gunModel[577].setRotationPoint(56F, -34.5F, -6F);

        gunModel[578].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 701
        gunModel[578].setRotationPoint(56F, -35F, -6F);

        gunModel[579].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 702
        gunModel[579].setRotationPoint(56F, -34F, -6F);

        gunModel[580].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 703
        gunModel[580].setRotationPoint(56F, -34F, -6F);

        gunModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
        gunModel[581].setRotationPoint(56F, -34.5F, -6F);

        gunModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 705
        gunModel[582].setRotationPoint(56F, -35F, -6F);

        gunModel[583].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
        gunModel[583].setRotationPoint(45F, -34.5F, -6F);

        gunModel[584].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 707
        gunModel[584].setRotationPoint(45F, -35F, -6F);

        gunModel[585].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 708
        gunModel[585].setRotationPoint(45F, -34F, -6F);

        gunModel[586].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
        gunModel[586].setRotationPoint(30F, -35F, -6F);

        gunModel[587].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F); // Box 713
        gunModel[587].setRotationPoint(73F, -41F, -6F);

        gunModel[588].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F); // Box 714
        gunModel[588].setRotationPoint(40.5F, -41F, -6F);

        gunModel[589].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F); // Box 715
        gunModel[589].setRotationPoint(40.5F, -38F, -8.25F);

        gunModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 716
        gunModel[590].setRotationPoint(65F, -39F, -5.25F);

        gunModel[591].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 717
        gunModel[591].setRotationPoint(65F, -40F, -5.25F);

        gunModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
        gunModel[592].setRotationPoint(65.5F, -39F, -5.25F);

        gunModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.125F, -0.5F, -0.5F, 1.125F); // Box 719
        gunModel[593].setRotationPoint(64.5F, -40F, -5.25F);

        gunModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.125F, -0.5F, -0.5F, 1.125F); // Box 720
        gunModel[594].setRotationPoint(73F, -40F, -5.25F);

        gunModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.99F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -0.99F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
        gunModel[595].setRotationPoint(72.5F, -39F, -5.25F);

        gunModel[596].addShapeBox(-8.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 722
        gunModel[596].setRotationPoint(65F, -39F, -5.25F);

        gunModel[597].addShapeBox(-8.5F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
        gunModel[597].setRotationPoint(65.5F, -39F, -5.25F);

        gunModel[598].addShapeBox(-8.5F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 724
        gunModel[598].setRotationPoint(65F, -40F, -5.25F);

        gunModel[599].addShapeBox(-8.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.125F, -0.5F, -0.5F, 1.125F); // Box 725
        gunModel[599].setRotationPoint(64.5F, -40F, -5.25F);

        gunModel[600].addShapeBox(-16.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 726
        gunModel[600].setRotationPoint(64.5F, -39F, -5.25F);

        gunModel[601].addShapeBox(-16.5F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
        gunModel[601].setRotationPoint(65F, -39F, -5.25F);

        gunModel[602].addShapeBox(-16.5F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 728
        gunModel[602].setRotationPoint(64.5F, -40F, -5.25F);

        gunModel[603].addShapeBox(-16.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, -0.5F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 1.125F, -0.5F, -0.5F, 1.125F); // Box 729
        gunModel[603].setRotationPoint(64F, -40F, -5.25F);

        gunModel[604].addShapeBox(-24F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
        gunModel[604].setRotationPoint(64F, -39F, -5.25F);

        gunModel[605].addShapeBox(-24F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 732
        gunModel[605].setRotationPoint(63.5F, -40F, -5.25F);

        gunModel[606].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F); // Box 736
        gunModel[606].setRotationPoint(33F, -41F, 5F);

        gunModel[607].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 737
        gunModel[607].setRotationPoint(78F, -35F, 5F);

        gunModel[608].addShapeBox(0F, 0F, 0F, 48, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 738
        gunModel[608].setRotationPoint(30F, -37F, 5F);

        gunModel[609].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
        gunModel[609].setRotationPoint(67F, -34.5F, 5F);

        gunModel[610].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 740
        gunModel[610].setRotationPoint(67F, -35F, 5F);

        gunModel[611].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 741
        gunModel[611].setRotationPoint(67F, -34F, 5F);

        gunModel[612].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 742
        gunModel[612].setRotationPoint(78F, -34F, 5F);

        gunModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 743
        gunModel[613].setRotationPoint(78F, -35F, 5F);

        gunModel[614].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
        gunModel[614].setRotationPoint(56F, -34.5F, 5F);

        gunModel[615].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 745
        gunModel[615].setRotationPoint(56F, -35F, 5F);

        gunModel[616].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 746
        gunModel[616].setRotationPoint(56F, -34F, 5F);

        gunModel[617].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
        gunModel[617].setRotationPoint(45F, -34.5F, 5F);

        gunModel[618].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 748
        gunModel[618].setRotationPoint(45F, -35F, 5F);

        gunModel[619].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 749
        gunModel[619].setRotationPoint(45F, -34F, 5F);

        gunModel[620].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
        gunModel[620].setRotationPoint(30F, -35F, 5F);

        gunModel[621].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F); // Box 751
        gunModel[621].setRotationPoint(73F, -41F, 5F);

        gunModel[622].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 752
        gunModel[622].setRotationPoint(40.5F, -41F, 5F);

        gunModel[623].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 753
        gunModel[623].setRotationPoint(40.5F, -38F, 7.25F);

        gunModel[624].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 754
        gunModel[624].setRotationPoint(65F, -39F, 4.25F);

        gunModel[625].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 755
        gunModel[625].setRotationPoint(65F, -40F, 4.25F);

        gunModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
        gunModel[626].setRotationPoint(65.5F, -39F, 4.25F);

        gunModel[627].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -0.5F, 1.125F, 0F, -0.5F, 1.125F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Box 757
        gunModel[627].setRotationPoint(64.5F, -40F, 4.25F);

        gunModel[628].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -0.5F, 1.125F, 0F, -0.5F, 1.125F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Box 758
        gunModel[628].setRotationPoint(73F, -40F, 4.25F);

        gunModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.99F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.99F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
        gunModel[629].setRotationPoint(72.5F, -39F, 4.25F);

        gunModel[630].addShapeBox(-8.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 760
        gunModel[630].setRotationPoint(65F, -39F, 4.25F);

        gunModel[631].addShapeBox(-8.5F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
        gunModel[631].setRotationPoint(65.5F, -39F, 4.25F);

        gunModel[632].addShapeBox(-8.5F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 762
        gunModel[632].setRotationPoint(65F, -40F, 4.25F);

        gunModel[633].addShapeBox(-8.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -0.5F, 1.125F, 0F, -0.5F, 1.125F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Box 763
        gunModel[633].setRotationPoint(64.5F, -40F, 4.25F);

        gunModel[634].addShapeBox(-16.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 764
        gunModel[634].setRotationPoint(64.5F, -39F, 4.25F);

        gunModel[635].addShapeBox(-16.5F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
        gunModel[635].setRotationPoint(65F, -39F, 4.25F);

        gunModel[636].addShapeBox(-16.5F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 766
        gunModel[636].setRotationPoint(64.5F, -40F, 4.25F);

        gunModel[637].addShapeBox(-16.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -0.5F, 1.125F, 0F, -0.5F, 1.125F, 0F, -0.5F, -1.125F, -0.5F, -0.5F, -1.125F); // Box 767
        gunModel[637].setRotationPoint(64F, -40F, 4.25F);

        gunModel[638].addShapeBox(-24F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.375F, -0.5F, -0.5F, 0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
        gunModel[638].setRotationPoint(64F, -39F, 4.25F);

        gunModel[639].addShapeBox(-24F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 769
        gunModel[639].setRotationPoint(63.5F, -40F, 4.25F);

        gunModel[640].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 771
        gunModel[640].setRotationPoint(33.5F, -32.5F, -7.5F);

        gunModel[641].addShapeBox(0F, 0F, 0F, 4, 4, 15, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F); // Box 772
        gunModel[641].setRotationPoint(34.5F, -34F, -7.5F);

        gunModel[642].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
        gunModel[642].setRotationPoint(31.5F, -32.5F, -7.5F);

        gunModel[643].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 774
        gunModel[643].setRotationPoint(33.5F, -33.75F, -7.5F);

        gunModel[644].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 776
        gunModel[644].setRotationPoint(31.5F, -34F, -7.5F);

        gunModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 778
        gunModel[645].setRotationPoint(33.5F, -31.25F, -7.5F);

        gunModel[646].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
        gunModel[646].setRotationPoint(31.5F, -31F, -7.5F);

        gunModel[647].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
        gunModel[647].setRotationPoint(31.5F, -33.5F, -7.5F);

        gunModel[648].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 781
        gunModel[648].setRotationPoint(31.5F, -31.5F, -7.5F);

        gunModel[649].addShapeBox(0F, 0F, 0F, 8, 3, 13, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 782
        gunModel[649].setRotationPoint(25.5F, -33.5F, -6.5F);

        gunModel[650].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F); // Box 783
        gunModel[650].setRotationPoint(23.5F, -33.5F, -6.5F);

        gunModel[651].addShapeBox(0F, 0F, 0F, 7, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
        gunModel[651].setRotationPoint(26.5F, -33.5F, -7F);

        gunModel[652].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F); // Box 785
        gunModel[652].setRotationPoint(23.51F, -33.5F, -7F);

        gunModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 789
        gunModel[653].setRotationPoint(40F, -44F, -2F);

        gunModel[654].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 790
        gunModel[654].setRotationPoint(42F, -44F, -2F);

        gunModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 791
        gunModel[655].setRotationPoint(44F, -44F, -2F);

        gunModel[656].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 792
        gunModel[656].setRotationPoint(46F, -44F, -2F);

        gunModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 793
        gunModel[657].setRotationPoint(56F, -44F, -2F);

        gunModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 794
        gunModel[658].setRotationPoint(54F, -44F, -2F);

        gunModel[659].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 795
        gunModel[659].setRotationPoint(52F, -44F, -2F);

        gunModel[660].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 796
        gunModel[660].setRotationPoint(50F, -44F, -2F);

        gunModel[661].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 797
        gunModel[661].setRotationPoint(48F, -44F, -2F);

        gunModel[662].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 798
        gunModel[662].setRotationPoint(66F, -44F, -2F);

        gunModel[663].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 799
        gunModel[663].setRotationPoint(64F, -44F, -2F);

        gunModel[664].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 800
        gunModel[664].setRotationPoint(62F, -44F, -2F);

        gunModel[665].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 801
        gunModel[665].setRotationPoint(60F, -44F, -2F);

        gunModel[666].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 802
        gunModel[666].setRotationPoint(58F, -44F, -2F);

        gunModel[667].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 805
        gunModel[667].setRotationPoint(72F, -44F, -2F);

        gunModel[668].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 806
        gunModel[668].setRotationPoint(70F, -44F, -2F);

        gunModel[669].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 807
        gunModel[669].setRotationPoint(68F, -44F, -2F);

        gunModel[670].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 808
        gunModel[670].setRotationPoint(76.75F, -27F, -5F);

        gunModel[671].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 809
        gunModel[671].setRotationPoint(77.75F, -24.5F, -3F);

        gunModel[672].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 810
        gunModel[672].setRotationPoint(77.75F, -23.5F, -3F);

        gunModel[673].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
        gunModel[673].setRotationPoint(77.75F, -24.5F, 2F);

        gunModel[674].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 812
        gunModel[674].setRotationPoint(77.75F, -23.5F, 2F);

        gunModel[675].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
        gunModel[675].setRotationPoint(77.75F, -23.5F, -2F);

        gunModel[676].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
        gunModel[676].setRotationPoint(77.75F, -25.5F, 2F);

        gunModel[677].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
        gunModel[677].setRotationPoint(77.75F, -25.5F, -3F);

        gunModel[678].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 899
        gunModel[678].setRotationPoint(44F, -25F, -2F);

        gunModel[679].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 900
        gunModel[679].setRotationPoint(44F, -25F, -2F);

        gunModel[680].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 901
        gunModel[680].setRotationPoint(65F, -25F, -2F);

        gunModel[681].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
        gunModel[681].setRotationPoint(47F, -25F, -2F);

        gunModel[682].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
        gunModel[682].setRotationPoint(49F, -25F, -2F);

        gunModel[683].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
        gunModel[683].setRotationPoint(53F, -25F, -2F);

        gunModel[684].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
        gunModel[684].setRotationPoint(51F, -25F, -2F);

        gunModel[685].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
        gunModel[685].setRotationPoint(57F, -25F, -2F);

        gunModel[686].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
        gunModel[686].setRotationPoint(55F, -25F, -2F);

        gunModel[687].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
        gunModel[687].setRotationPoint(61F, -25F, -2F);

        gunModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
        gunModel[688].setRotationPoint(59F, -25F, -2F);

        gunModel[689].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
        gunModel[689].setRotationPoint(63F, -25F, -2F);

        gunModel[690].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
        gunModel[690].setRotationPoint(44F, -26F, -2F);

        gunModel[691].addShapeBox(-10F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
        gunModel[691].setRotationPoint(76F, -36F, 6F);

        gunModel[692].addShapeBox(-10F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 913
        gunModel[692].setRotationPoint(76F, -36F, 7F);

        gunModel[693].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 914
        gunModel[693].setRotationPoint(75F, -36F, 7F);

        gunModel[694].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
        gunModel[694].setRotationPoint(76F, -36F, 7F);

        gunModel[695].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 916
        gunModel[695].setRotationPoint(75F, -36F, 7F);

        gunModel[696].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 917
        gunModel[696].setRotationPoint(75F, -36F, 6F);

        gunModel[697].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 918
        gunModel[697].setRotationPoint(88F, -36F, 6F);

        gunModel[698].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 919
        gunModel[698].setRotationPoint(88F, -36F, 7F);

        gunModel[699].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 920
        gunModel[699].setRotationPoint(88F, -36F, 7F);

        gunModel[700].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
        gunModel[700].setRotationPoint(78F, -36F, 7F);

        gunModel[701].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
        gunModel[701].setRotationPoint(82F, -36F, 7F);

        gunModel[702].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
        gunModel[702].setRotationPoint(80F, -36F, 7F);

        gunModel[703].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
        gunModel[703].setRotationPoint(86F, -36F, 7F);

        gunModel[704].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
        gunModel[704].setRotationPoint(84F, -36F, 7F);

        gunModel[705].addShapeBox(-10F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
        gunModel[705].setRotationPoint(76F, -36F, -7F);

        gunModel[706].addShapeBox(-10F, 0F, 0F, 12, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
        gunModel[706].setRotationPoint(76F, -36F, -8F);

        gunModel[707].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 928
        gunModel[707].setRotationPoint(75F, -36F, -8F);

        gunModel[708].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 929
        gunModel[708].setRotationPoint(76F, -36F, -8F);

        gunModel[709].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 930
        gunModel[709].setRotationPoint(75F, -36F, -8F);

        gunModel[710].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 931
        gunModel[710].setRotationPoint(75F, -36F, -7F);

        gunModel[711].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 932
        gunModel[711].setRotationPoint(88F, -36F, -7F);

        gunModel[712].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 933
        gunModel[712].setRotationPoint(88F, -36F, -8F);

        gunModel[713].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 934
        gunModel[713].setRotationPoint(88F, -36F, -8F);

        gunModel[714].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 935
        gunModel[714].setRotationPoint(78F, -36F, -8F);

        gunModel[715].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 936
        gunModel[715].setRotationPoint(82F, -36F, -8F);

        gunModel[716].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 937
        gunModel[716].setRotationPoint(80F, -36F, -8F);

        gunModel[717].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 938
        gunModel[717].setRotationPoint(86F, -36F, -8F);

        gunModel[718].addShapeBox(-10F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 939
        gunModel[718].setRotationPoint(84F, -36F, -8F);

        gunModel[719].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
        gunModel[719].setRotationPoint(33F, -42F, 2F);

        gunModel[720].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
        gunModel[720].setRotationPoint(33F, -42F, -3F);

        gunModel[721].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
        gunModel[721].setRotationPoint(26F, -25F, -6.5F);

        gunModel[722].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
        gunModel[722].setRotationPoint(26F, -26F, -6.5F);

        gunModel[723].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 788
        gunModel[723].setRotationPoint(26F, -24F, -6.5F);

        gunModel[724].addShapeBox(0F, 0F, 0F, 7, 6, 11, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 599
        gunModel[724].setRotationPoint(-3F, -17.5F, -5.5F);

        gunModel[725].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2.5F, 0F, 0F); // Box 600
        gunModel[725].setRotationPoint(-3F, -11.5F, -5.5F);

        gunModel[726].addShapeBox(0F, 0F, 0F, 8, 8, 11, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3F, 6F, 0F, -3F, 6F, 0F, 3F, 0F, 0F); // Box 602
        gunModel[726].setRotationPoint(-5F, -7.5F, -5.5F);

        gunModel[727].addShapeBox(0F, 0F, 0F, 8, 8, 11, 0F, 0F, 0F, 0F, 0F, -5.99F, 0F, 0F, -5.99F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1.5F, 0F, 0F); // Box 603
        gunModel[727].setRotationPoint(-8F, 0.5F, -5.5F);

        gunModel[728].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 604
        gunModel[728].setRotationPoint(0F, 6.5F, -5.5F);

        gunModel[729].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 605
        gunModel[729].setRotationPoint(-5F, -17.5F, -5.5F);

        gunModel[730].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 606
        gunModel[730].setRotationPoint(-5.5F, -17.5F, -4.5F);

        gunModel[731].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2.5F, 0F, -2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -2F); // Box 607
        gunModel[731].setRotationPoint(-5.5F, -11.5F, -4.5F);

        gunModel[732].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 2F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, -1F); // Box 608
        gunModel[732].setRotationPoint(-5F, -11.5F, -5.5F);

        gunModel[733].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 2F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, -1F); // Box 609
        gunModel[733].setRotationPoint(-7.5F, -7.5F, -5.5F);

        gunModel[734].addShapeBox(0F, 0F, 0F, 1, 8, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2.5F, 0F, -2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -2F); // Box 610
        gunModel[734].setRotationPoint(-8F, -7.5F, -4.5F);

        gunModel[735].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 1F, -0.5F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, -1F); // Box 611
        gunModel[735].setRotationPoint(-10F, 0.5F, -5.5F);

        gunModel[736].addShapeBox(0F, 0F, 0F, 1, 8, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, -1F, -2F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -1F, -2F); // Box 612
        gunModel[736].setRotationPoint(-10.5F, 0.5F, -4.5F);

        gunModel[737].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F, 2F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, -1F, -0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1F); // Box 615
        gunModel[737].setRotationPoint(-5F, -19.5F, -5.5F);

        gunModel[738].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 2.5F, -0.25F, -2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, -0.25F, -2F, 0F, 1F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -2F); // Box 616
        gunModel[738].setRotationPoint(-5.5F, -19.5F, -4.5F);

        gunModel[739].addShapeBox(0F, 0F, 0F, 2, 24, 10, 0F, -6F, 0F, 0F, 5.5F, 0F, -1F, 5.5F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 617
        gunModel[739].setRotationPoint(0F, -17.5F, -5F);

        gunModel[740].addShapeBox(0F, 0F, 0F, 1, 24, 8, 0F, -6F, 0F, 0F, 5.75F, 0F, -2F, 5.75F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F); // Box 618
        gunModel[740].setRotationPoint(1.5F, -17.5F, -4F);

        gunModel[741].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 619
        gunModel[741].setRotationPoint(1.5F, 9F, -5.5F);

        gunModel[742].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F); // Box 620
        gunModel[742].setRotationPoint(3F, 9F, -4.5F);

        gunModel[743].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1.5F, 0F, 0F); // Box 621
        gunModel[743].setRotationPoint(0F, 6.5F, -5.5F);

        gunModel[744].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -2F, 1.5F, 0F, -2F, -1.5F, 0F, 0F); // Box 622
        gunModel[744].setRotationPoint(1.5F, 6.5F, -4.5F);

        gunModel[745].addShapeBox(0F, 0F, 0F, 2, 15, 11, 0F, -4F, 1F, 0F, 3.25F, 0F, -1F, 3.25F, 0F, -1F, -4F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 623
        gunModel[745].setRotationPoint(0F, -8.5F, -5.5F);

        gunModel[746].addShapeBox(0F, 0F, 0F, 1, 15, 9, 0F, -3.75F, 0F, 0F, 3.75F, 0F, -2F, 3.75F, 0F, -2F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 624
        gunModel[746].setRotationPoint(1.5F, -8.5F, -4.5F);

        gunModel[747].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 54
        gunModel[747].setRotationPoint(26.5F, -33F, -3F);

        gunModel[748].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 55
        gunModel[748].setRotationPoint(39.5F, -32.5F, -2.5F);

        gunModel[749].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 57
        gunModel[749].setRotationPoint(26.5F, -34.5F, -3F);

        gunModel[750].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 58
        gunModel[750].setRotationPoint(26.5F, -35.5F, -3F);

        gunModel[751].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 59
        gunModel[751].setRotationPoint(26.5F, -31.5F, -3F);

        gunModel[752].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F); // Box 60
        gunModel[752].setRotationPoint(26.5F, -30.5F, -3F);

        gunModel[753].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F, 0F, 0.125F, -0.625F, 0F, 0.125F, -0.625F, 0F, 0.125F, -0.625F, 0F, 0.125F, -0.625F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 62
        gunModel[753].setRotationPoint(39.5F, -33.75F, -2.5F);

        gunModel[754].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F); // Box 64
        gunModel[754].setRotationPoint(39.5F, -34.75F, -2.5F);

        gunModel[755].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F, 0F, -0.25F, -1.875F); // Box 65
        gunModel[755].setRotationPoint(39.5F, -30.25F, -2.5F);

        gunModel[756].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.625F, 0F, 0.125F, -0.625F, 0F, 0.125F, -0.625F, 0F, 0.125F, -0.625F); // Box 66
        gunModel[756].setRotationPoint(39.5F, -31.25F, -2.5F);

        gunModel[757].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
        gunModel[757].setRotationPoint(77.5F, -33F, -3F);

        gunModel[758].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 68
        gunModel[758].setRotationPoint(77.5F, -34.5F, -3F);

        gunModel[759].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 69
        gunModel[759].setRotationPoint(77.5F, -35.5F, -3F);

        gunModel[760].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 70
        gunModel[760].setRotationPoint(77.5F, -31.5F, -3F);

        gunModel[761].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F); // Box 71
        gunModel[761].setRotationPoint(77.5F, -30.5F, -3F);

        gunModel[762].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.375F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, -0.5F); // Box 72
        gunModel[762].setRotationPoint(76.5F, -33F, -3F);

        gunModel[763].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.625F, -1.125F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.625F, -1.125F, 0F, -0.125F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, -0.5F); // Box 73
        gunModel[763].setRotationPoint(76.5F, -34.5F, -3F);

        gunModel[764].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -1F, -2.375F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -1F, -2.375F, 0F, -0.375F, -1.125F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.375F, -1.125F); // Box 74
        gunModel[764].setRotationPoint(76.5F, -35.5F, -3F);

        gunModel[765].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.375F, -1.125F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.375F, -1.125F, 0F, -1F, -2.375F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -1F, -2.375F); // Box 75
        gunModel[765].setRotationPoint(76.5F, -30.5F, -3F);

        gunModel[766].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.125F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, -0.5F, 0F, -0.625F, -1.125F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.625F, -1.125F); // Box 76
        gunModel[766].setRotationPoint(76.5F, -31.5F, -3F);

        gunModel[767].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 77
        gunModel[767].setRotationPoint(36.49F, -35.5F, -2F);

        gunModel[768].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[768].setRotationPoint(36.49F, -36.5F, -1.5F);

        gunModel[769].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        gunModel[769].setRotationPoint(38.49F, -36.5F, -1.5F);

        gunModel[770].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 80
        gunModel[770].setRotationPoint(36.99F, -36.5F, -1.5F);

        gunModel[771].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 81
        gunModel[771].setRotationPoint(37.99F, -36.5F, -1.5F);

        gunModel[772].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        gunModel[772].setRotationPoint(37.5F, -38.5F, -2F);

        gunModel[773].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[773].setRotationPoint(37.5F, -39.5F, -2F);

        gunModel[774].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        gunModel[774].setRotationPoint(37.5F, -40.5F, -1.5F);

        gunModel[775].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 85
        gunModel[775].setRotationPoint(37.5F, -36.5F, -1.5F);

        gunModel[776].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
        gunModel[776].setRotationPoint(37.5F, -37.5F, -2F);

        gunModel[777].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 87
        gunModel[777].setRotationPoint(24.5F, -38.5F, -1.5F);

        gunModel[778].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 88
        gunModel[778].setRotationPoint(24.5F, -39.5F, -1.5F);

        gunModel[779].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 89
        gunModel[779].setRotationPoint(24.5F, -40.5F, -1.5F);

        gunModel[780].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F); // Box 90
        gunModel[780].setRotationPoint(24.5F, -36.5F, -1.5F);

        gunModel[781].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 91
        gunModel[781].setRotationPoint(24.5F, -37.5F, -1.5F);

        gunModel[782].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        gunModel[782].setRotationPoint(21.5F, -38.5F, -1F);

        gunModel[783].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        gunModel[783].setRotationPoint(21.5F, -39.5F, -1F);

        gunModel[784].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 94
        gunModel[784].setRotationPoint(21.5F, -37.5F, -1F);

        gunModel[785].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 99
        gunModel[785].setRotationPoint(38.5F, -39.5F, -1F);

        gunModel[786].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.499F, 0F, -0.5F, -0.499F, 0F, 0F, -0.5F, 0F); // Box 100
        gunModel[786].setRotationPoint(40.5F, -39.5F, -1F);

        gunModel[787].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        gunModel[787].setRotationPoint(38.5F, -37.5F, -1F);

        gunModel[788].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 103
        gunModel[788].setRotationPoint(38.5F, -39F, -1F);

        gunModel[789].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 104
        gunModel[789].setRotationPoint(38.5F, -38F, -1F);

        gunModel[790].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 105
        gunModel[790].setRotationPoint(38.5F, -38.5F, -1F);

        gunModel[791].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.499F, 0F, -0.5F, -0.499F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 106
        gunModel[791].setRotationPoint(40.5F, -37.5F, -1F);

        gunModel[792].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 107
        gunModel[792].setRotationPoint(40F, -39F, -1F);

        gunModel[793].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 108
        gunModel[793].setRotationPoint(40F, -38.5F, -1F);

        gunModel[794].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 109
        gunModel[794].setRotationPoint(40F, -38F, -1F);

        gunModel[795].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 123
        gunModel[795].setRotationPoint(37.5F, -38.5F, -2F);

        gunModel[796].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 124
        gunModel[796].setRotationPoint(36.49F, -31F, -2.5F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 817
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 889, 249, textureX, textureY); // Box 820
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 821
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 822
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 823
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 824
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 825
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Box 826
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 827
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 828
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 829
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 830
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 831
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 832
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 833
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 834
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 457, 257, textureX, textureY); // Box 835
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 836
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 837
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 838
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 839
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 841
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 842
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 843

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 817
        defaultBarrelModel[0].setRotationPoint(83.5F, -33F, -3F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
        defaultBarrelModel[1].setRotationPoint(83.5F, -34.5F, -3F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 821
        defaultBarrelModel[2].setRotationPoint(83.5F, -35.5F, -3F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F); // Box 822
        defaultBarrelModel[3].setRotationPoint(82.5F, -33F, -3F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F); // Box 823
        defaultBarrelModel[4].setRotationPoint(82.5F, -34.5F, -3F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, -0.75F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F, -0.75F, -1F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -1F); // Box 824
        defaultBarrelModel[5].setRotationPoint(82.5F, -35.5F, -3F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -1F); // Box 825
        defaultBarrelModel[6].setRotationPoint(82.5F, -31.5F, -3F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, -0.75F, -1F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, -0.5F, -0.75F, -2.25F); // Box 826
        defaultBarrelModel[7].setRotationPoint(82.5F, -30.5F, -3F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 827
        defaultBarrelModel[8].setRotationPoint(83.5F, -35F, -1F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 828
        defaultBarrelModel[9].setRotationPoint(83.5F, -33F, 2F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 829
        defaultBarrelModel[10].setRotationPoint(83.5F, -34.5F, 2F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 830
        defaultBarrelModel[11].setRotationPoint(83.5F, -35.5F, 2F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 831
        defaultBarrelModel[12].setRotationPoint(83.5F, -31.5F, 2F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F); // Box 832
        defaultBarrelModel[13].setRotationPoint(83.5F, -30.5F, 2F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 833
        defaultBarrelModel[14].setRotationPoint(83.5F, -31.5F, -3F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F); // Box 834
        defaultBarrelModel[15].setRotationPoint(83.5F, -30.5F, -3F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 835
        defaultBarrelModel[16].setRotationPoint(83.5F, -30F, -1F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F); // Box 836
        defaultBarrelModel[17].setRotationPoint(98.5F, -34.5F, 2F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, -1F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.75F, -0.75F); // Box 837
        defaultBarrelModel[18].setRotationPoint(98.5F, -35.5F, 2F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -1.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
        defaultBarrelModel[19].setRotationPoint(98.5F, -34.5F, -3F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -2.25F, 0F, -1F, -2.25F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, -0.75F, -0.75F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 839
        defaultBarrelModel[20].setRotationPoint(98.5F, -35.5F, -3F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -2.25F, 0F, -1F, -2.25F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F); // Box 841
        defaultBarrelModel[21].setRotationPoint(98.5F, -30.5F, -3F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F); // Box 842
        defaultBarrelModel[22].setRotationPoint(98.5F, -30F, -1F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.75F, -0.75F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, -1F, -2.25F, 0F, -0.5F, -2.25F); // Box 843
        defaultBarrelModel[23].setRotationPoint(98.5F, -30.5F, 2F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 307, textureX, textureY); // Box 279
        defaultScopeModel[1] = new ModelRendererTurbo(this, 9, 307, textureX, textureY); // Box 276
        defaultScopeModel[2] = new ModelRendererTurbo(this, 33, 307, textureX, textureY); // Box 277
        defaultScopeModel[3] = new ModelRendererTurbo(this, 49, 307, textureX, textureY); // Box 278
        defaultScopeModel[4] = new ModelRendererTurbo(this, 57, 307, textureX, textureY); // Box 284
        defaultScopeModel[5] = new ModelRendererTurbo(this, 9, 307, textureX, textureY); // Box 289
        defaultScopeModel[6] = new ModelRendererTurbo(this, 81, 307, textureX, textureY); // Box 648
        defaultScopeModel[7] = new ModelRendererTurbo(this, 97, 307, textureX, textureY); // Box 649
        defaultScopeModel[8] = new ModelRendererTurbo(this, 113, 307, textureX, textureY); // Box 650
        defaultScopeModel[9] = new ModelRendererTurbo(this, 129, 307, textureX, textureY); // Box 651
        defaultScopeModel[10] = new ModelRendererTurbo(this, 145, 307, textureX, textureY); // Box 652
        defaultScopeModel[11] = new ModelRendererTurbo(this, 169, 307, textureX, textureY); // Box 653
        defaultScopeModel[12] = new ModelRendererTurbo(this, 193, 307, textureX, textureY); // Box 656
        defaultScopeModel[13] = new ModelRendererTurbo(this, 217, 307, textureX, textureY); // Box 657
        defaultScopeModel[14] = new ModelRendererTurbo(this, 161, 307, textureX, textureY); // Box 658
        defaultScopeModel[15] = new ModelRendererTurbo(this, 41, 307, textureX, textureY); // Box 659
        defaultScopeModel[16] = new ModelRendererTurbo(this, 185, 307, textureX, textureY); // Box 660
        defaultScopeModel[17] = new ModelRendererTurbo(this, 137, 307, textureX, textureY); // Box 661
        defaultScopeModel[18] = new ModelRendererTurbo(this, 89, 307, textureX, textureY); // Box 178
        defaultScopeModel[19] = new ModelRendererTurbo(this, 57, 307, textureX, textureY); // Box 186
        defaultScopeModel[20] = new ModelRendererTurbo(this, 105, 307, textureX, textureY); // Box 187
        defaultScopeModel[21] = new ModelRendererTurbo(this, 121, 307, textureX, textureY); // Box 188
        defaultScopeModel[22] = new ModelRendererTurbo(this, 129, 307, textureX, textureY); // Box 269
        defaultScopeModel[23] = new ModelRendererTurbo(this, 145, 307, textureX, textureY); // Box 680
        defaultScopeModel[24] = new ModelRendererTurbo(this, 169, 307, textureX, textureY); // Box 681
        defaultScopeModel[25] = new ModelRendererTurbo(this, 193, 307, textureX, textureY); // Box 682
        defaultScopeModel[26] = new ModelRendererTurbo(this, 241, 307, textureX, textureY); // Box 683
        defaultScopeModel[27] = new ModelRendererTurbo(this, 273, 307, textureX, textureY); // Box 684
        defaultScopeModel[28] = new ModelRendererTurbo(this, 297, 307, textureX, textureY); // Box 685
        defaultScopeModel[29] = new ModelRendererTurbo(this, 321, 307, textureX, textureY); // Box 686
        defaultScopeModel[30] = new ModelRendererTurbo(this, 345, 307, textureX, textureY); // Box 687
        defaultScopeModel[31] = new ModelRendererTurbo(this, 209, 307, textureX, textureY); // Box 688
        defaultScopeModel[32] = new ModelRendererTurbo(this, 233, 307, textureX, textureY); // Box 689
        defaultScopeModel[33] = new ModelRendererTurbo(this, 265, 307, textureX, textureY); // Box 690
        defaultScopeModel[34] = new ModelRendererTurbo(this, 369, 307, textureX, textureY); // Box 691
        defaultScopeModel[35] = new ModelRendererTurbo(this, 289, 307, textureX, textureY); // Box 692
        defaultScopeModel[36] = new ModelRendererTurbo(this, 313, 307, textureX, textureY); // Box 693
        defaultScopeModel[37] = new ModelRendererTurbo(this, 337, 307, textureX, textureY); // Box 694
        defaultScopeModel[38] = new ModelRendererTurbo(this, 217, 307, textureX, textureY); // Box 695
        defaultScopeModel[39] = new ModelRendererTurbo(this, 297, 307, textureX, textureY); // Box 696
        defaultScopeModel[40] = new ModelRendererTurbo(this, 345, 307, textureX, textureY); // Box 697
        defaultScopeModel[41] = new ModelRendererTurbo(this, 401, 307, textureX, textureY); // Box 698
        defaultScopeModel[42] = new ModelRendererTurbo(this, 417, 307, textureX, textureY); // Box 700
        defaultScopeModel[43] = new ModelRendererTurbo(this, 433, 307, textureX, textureY); // Box 701
        defaultScopeModel[44] = new ModelRendererTurbo(this, 449, 307, textureX, textureY); // Box 702

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
        defaultScopeModel[0].setRotationPoint(61F, -53F, 1F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 276
        defaultScopeModel[1].setRotationPoint(61F, -44F, -3F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        defaultScopeModel[2].setRotationPoint(62F, -48F, -2F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        defaultScopeModel[3].setRotationPoint(61F, -52F, 1F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
        defaultScopeModel[4].setRotationPoint(61F, -46F, -3F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 289
        defaultScopeModel[5].setRotationPoint(61.5F, -52F, -0.5F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 648
        defaultScopeModel[6].setRotationPoint(62F, -47F, -2F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 649
        defaultScopeModel[7].setRotationPoint(61F, -48F, -2F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
        defaultScopeModel[8].setRotationPoint(61F, -47F, -2F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        defaultScopeModel[9].setRotationPoint(61F, -47.5F, -2.5F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 652
        defaultScopeModel[10].setRotationPoint(65.5F, -45F, -3F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 653
        defaultScopeModel[11].setRotationPoint(65.5F, -44.25F, -3.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 656
        defaultScopeModel[12].setRotationPoint(65.5F, -44.75F, -3.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 657
        defaultScopeModel[13].setRotationPoint(65.5F, -43.75F, -3.5F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 658
        defaultScopeModel[14].setRotationPoint(61F, -52F, -2F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 659
        defaultScopeModel[15].setRotationPoint(61F, -53F, -2F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 660
        defaultScopeModel[16].setRotationPoint(61F, -50F, -1.5F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.125F, -1F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.5F, -0.125F, -1F); // Box 661
        defaultScopeModel[17].setRotationPoint(60.25F, -49.5F, -1.5F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178
        defaultScopeModel[18].setRotationPoint(-24F, -53.5F, -1F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 186
        defaultScopeModel[19].setRotationPoint(-24F, -52.5F, -1F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 187
        defaultScopeModel[20].setRotationPoint(-24F, -53.5F, -1F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 188
        defaultScopeModel[21].setRotationPoint(-24F, -51.5F, -1F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 269
        defaultScopeModel[22].setRotationPoint(-24F, -51.5F, -1F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
        defaultScopeModel[23].setRotationPoint(-24F, -52.5F, 0F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
        defaultScopeModel[24].setRotationPoint(-24F, -53.5F, 0F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 682
        defaultScopeModel[25].setRotationPoint(-24F, -51.5F, 0F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 683
        defaultScopeModel[26].setRotationPoint(-24.5F, -44F, -3F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 684
        defaultScopeModel[27].setRotationPoint(-20F, -45F, -3F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 685
        defaultScopeModel[28].setRotationPoint(-20F, -44.75F, -3.5F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 686
        defaultScopeModel[29].setRotationPoint(-20F, -43.75F, -3.5F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 687
        defaultScopeModel[30].setRotationPoint(-20F, -44.25F, -3.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 688
        defaultScopeModel[31].setRotationPoint(-23.5F, -47F, -2F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
        defaultScopeModel[32].setRotationPoint(-23.5F, -48F, -2F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 690
        defaultScopeModel[33].setRotationPoint(-24.5F, -48F, -2F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
        defaultScopeModel[34].setRotationPoint(-24.5F, -46F, -3F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
        defaultScopeModel[35].setRotationPoint(-24.5F, -47F, -2F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
        defaultScopeModel[36].setRotationPoint(-24.5F, -47.5F, -2.5F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
        defaultScopeModel[37].setRotationPoint(-24.5F, -52F, 1F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
        defaultScopeModel[38].setRotationPoint(-24.5F, -53F, 1F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 696
        defaultScopeModel[39].setRotationPoint(-24.5F, -53F, -2F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 697
        defaultScopeModel[40].setRotationPoint(-24.5F, -52F, -2F);

        defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 698
        defaultScopeModel[41].setRotationPoint(-24.5F, -51F, -1.5F);

        defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 700
        defaultScopeModel[42].setRotationPoint(-24F, -50.5F, -2.5F);

        defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 701
        defaultScopeModel[43].setRotationPoint(-24F, -51F, -2.5F);

        defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 702
        defaultScopeModel[44].setRotationPoint(-24F, -50F, -2.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 844
        ammoModel[1] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Box 846
        ammoModel[2] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 847
        ammoModel[3] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 848
        ammoModel[4] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 849
        ammoModel[5] = new ModelRendererTurbo(this, 625, 249, textureX, textureY); // Box 850
        ammoModel[6] = new ModelRendererTurbo(this, 769, 249, textureX, textureY); // Box 851
        ammoModel[7] = new ModelRendererTurbo(this, 641, 257, textureX, textureY); // Box 852
        ammoModel[8] = new ModelRendererTurbo(this, 809, 249, textureX, textureY); // Box 853
        ammoModel[9] = new ModelRendererTurbo(this, 913, 249, textureX, textureY); // Box 854
        ammoModel[10] = new ModelRendererTurbo(this, 697, 257, textureX, textureY); // Box 855
        ammoModel[11] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Box 856
        ammoModel[12] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Box 857
        ammoModel[13] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 858
        ammoModel[14] = new ModelRendererTurbo(this, 825, 257, textureX, textureY); // Box 859
        ammoModel[15] = new ModelRendererTurbo(this, 649, 241, textureX, textureY); // Box 860
        ammoModel[16] = new ModelRendererTurbo(this, 73, 257, textureX, textureY); // Box 861
        ammoModel[17] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 862
        ammoModel[18] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 863
        ammoModel[19] = new ModelRendererTurbo(this, 601, 257, textureX, textureY); // Box 864
        ammoModel[20] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Box 865
        ammoModel[21] = new ModelRendererTurbo(this, 785, 257, textureX, textureY); // Box 866
        ammoModel[22] = new ModelRendererTurbo(this, 889, 257, textureX, textureY); // Box 867
        ammoModel[23] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Box 868
        ammoModel[24] = new ModelRendererTurbo(this, 961, 257, textureX, textureY); // Box 869
        ammoModel[25] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 870
        ammoModel[26] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Box 871
        ammoModel[27] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Box 872
        ammoModel[28] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 873
        ammoModel[29] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 874
        ammoModel[30] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Box 875
        ammoModel[31] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 876
        ammoModel[32] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 877
        ammoModel[33] = new ModelRendererTurbo(this, 617, 265, textureX, textureY); // Box 878
        ammoModel[34] = new ModelRendererTurbo(this, 545, 273, textureX, textureY); // Box 879
        ammoModel[35] = new ModelRendererTurbo(this, 769, 265, textureX, textureY); // Box 880
        ammoModel[36] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 881
        ammoModel[37] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 882
        ammoModel[38] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 883
        ammoModel[39] = new ModelRendererTurbo(this, 993, 265, textureX, textureY); // Box 884
        ammoModel[40] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 885
        ammoModel[41] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 886
        ammoModel[42] = new ModelRendererTurbo(this, 649, 273, textureX, textureY); // Box 887
        ammoModel[43] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 888
        ammoModel[44] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 889
        ammoModel[45] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 892
        ammoModel[46] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 893
        ammoModel[47] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 894
        ammoModel[48] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 895
        ammoModel[49] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 896
        ammoModel[50] = new ModelRendererTurbo(this, 801, 265, textureX, textureY); // Box 897
        ammoModel[51] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 898
        ammoModel[52] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 885
        ammoModel[53] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 886

        ammoModel[0].addShapeBox(1F, 0F, 0F, 17, 18, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
        ammoModel[0].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[0].rotateAngleZ = 0.08726646F;

        ammoModel[1].addShapeBox(18F, 0F, 0F, 2, 18, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 846
        ammoModel[1].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[1].rotateAngleZ = 0.08726646F;

        ammoModel[2].addShapeBox(-1F, 0F, 0F, 2, 18, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 847
        ammoModel[2].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[2].rotateAngleZ = 0.08726646F;

        ammoModel[3].addShapeBox(-1F, 9F, 0F, 2, 2, 10, 0F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F); // Box 848
        ammoModel[3].setRotationPoint(-50F, -11F, -5F);
        ammoModel[3].rotateAngleZ = 0.08726646F;

        ammoModel[4].addShapeBox(1F, 9F, 0F, 17, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
        ammoModel[4].setRotationPoint(-50F, -11F, -5F);
        ammoModel[4].rotateAngleZ = 0.08726646F;

        ammoModel[5].addShapeBox(18F, 9F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 850
        ammoModel[5].setRotationPoint(-50F, -11F, -5F);
        ammoModel[5].rotateAngleZ = 0.08726646F;

        ammoModel[6].addShapeBox(-1F, 16F, 0F, 2, 2, 10, 0F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F); // Box 851
        ammoModel[6].setRotationPoint(-50F, -11F, -5F);
        ammoModel[6].rotateAngleZ = 0.08726646F;

        ammoModel[7].addShapeBox(1F, 16F, 0F, 17, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
        ammoModel[7].setRotationPoint(-50F, -11F, -5F);
        ammoModel[7].rotateAngleZ = 0.08726646F;

        ammoModel[8].addShapeBox(18F, 16F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 853
        ammoModel[8].setRotationPoint(-50F, -11F, -5F);
        ammoModel[8].rotateAngleZ = 0.08726646F;

        ammoModel[9].addShapeBox(-1F, 2F, 0F, 2, 2, 10, 0F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F); // Box 854
        ammoModel[9].setRotationPoint(-50F, -11F, -5F);
        ammoModel[9].rotateAngleZ = 0.08726646F;

        ammoModel[10].addShapeBox(1F, 2F, 0F, 17, 2, 10, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 855
        ammoModel[10].setRotationPoint(-50F, -11F, -5F);
        ammoModel[10].rotateAngleZ = 0.08726646F;

        ammoModel[11].addShapeBox(18F, 0F, 0F, 2, 4, 10, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 856
        ammoModel[11].setRotationPoint(-50F, -11F, -5F);
        ammoModel[11].rotateAngleZ = 0.08726646F;

        ammoModel[12].addShapeBox(4F, 4F, 0F, 2, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 857
        ammoModel[12].setRotationPoint(-50F, -11F, -5F);
        ammoModel[12].rotateAngleZ = 0.08726646F;

        ammoModel[13].addShapeBox(13F, 4F, 0F, 2, 14, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 858
        ammoModel[13].setRotationPoint(-50F, -11F, -5F);
        ammoModel[13].rotateAngleZ = 0.08726646F;

        ammoModel[14].addShapeBox(0.5F, 25F, -1F, 19, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 859
        ammoModel[14].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[14].rotateAngleZ = 0.08726646F;

        ammoModel[15].addShapeBox(19.5F, 25F, -1F, 2, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, -0.25F, 0F, 0F); // Box 860
        ammoModel[15].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[15].rotateAngleZ = 0.08726646F;

        ammoModel[16].addShapeBox(-1.5F, 25F, -1F, 2, 2, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -2F); // Box 861
        ammoModel[16].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[16].rotateAngleZ = 0.08726646F;

        ammoModel[17].addShapeBox(13F, 4F, 0F, 2, 1, 10, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
        ammoModel[17].setRotationPoint(-50F, -11F, -5F);
        ammoModel[17].rotateAngleZ = 0.08726646F;

        ammoModel[18].addShapeBox(4F, 4F, 0F, 2, 1, 10, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
        ammoModel[18].setRotationPoint(-50F, -11F, -5F);
        ammoModel[18].rotateAngleZ = 0.08726646F;

        ammoModel[19].addShapeBox(4F, 11F, 0F, 2, 1, 10, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
        ammoModel[19].setRotationPoint(-50F, -11F, -5F);
        ammoModel[19].rotateAngleZ = 0.08726646F;

        ammoModel[20].addShapeBox(13F, 11F, 0F, 2, 1, 10, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 865
        ammoModel[20].setRotationPoint(-50F, -11F, -5F);
        ammoModel[20].rotateAngleZ = 0.08726646F;

        ammoModel[21].addShapeBox(4F, 8F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 866
        ammoModel[21].setRotationPoint(-50F, -11F, -5F);
        ammoModel[21].rotateAngleZ = 0.08726646F;

        ammoModel[22].addShapeBox(13F, 8F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 867
        ammoModel[22].setRotationPoint(-50F, -11F, -5F);
        ammoModel[22].rotateAngleZ = 0.08726646F;

        ammoModel[23].addShapeBox(4F, 15F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 868
        ammoModel[23].setRotationPoint(-50F, -11F, -5F);
        ammoModel[23].rotateAngleZ = 0.08726646F;

        ammoModel[24].addShapeBox(13F, 15F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 869
        ammoModel[24].setRotationPoint(-50F, -11F, -5F);
        ammoModel[24].rotateAngleZ = 0.08726646F;

        ammoModel[25].addShapeBox(13F, 18F, 0F, 2, 1, 10, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
        ammoModel[25].setRotationPoint(-50F, -11F, -5F);
        ammoModel[25].rotateAngleZ = 0.08726646F;

        ammoModel[26].addShapeBox(18F, 18F, 0F, 2, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, 0F); // Box 871
        ammoModel[26].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[26].rotateAngleZ = 0.08726646F;

        ammoModel[27].addShapeBox(-1F, 18F, 0F, 2, 6, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -2F); // Box 872
        ammoModel[27].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[27].rotateAngleZ = 0.08726646F;

        ammoModel[28].addShapeBox(13F, 18F, 0F, 2, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
        ammoModel[28].setRotationPoint(-50F, -11F, -5F);
        ammoModel[28].rotateAngleZ = 0.08726646F;

        ammoModel[29].addShapeBox(1F, 18F, 0F, 17, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 874
        ammoModel[29].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[29].rotateAngleZ = 0.08726646F;

        ammoModel[30].addShapeBox(0.5F, 24F, -1F, 19, 1, 11, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
        ammoModel[30].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[30].rotateAngleZ = 0.08726646F;

        ammoModel[31].addShapeBox(19.5F, 24F, -1F, 2, 1, 11, 0F, 1F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 876
        ammoModel[31].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[31].rotateAngleZ = 0.08726646F;

        ammoModel[32].addShapeBox(-1.5F, 24F, -1F, 2, 1, 11, 0F, -1F, 0F, -3F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 877
        ammoModel[32].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[32].rotateAngleZ = 0.08726646F;

        ammoModel[33].addShapeBox(-1.25F, 27F, -1F, 2, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -3F); // Box 878
        ammoModel[33].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[33].rotateAngleZ = 0.08726646F;

        ammoModel[34].addShapeBox(0.5F, 27F, -1F, 19, 1, 11, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -1.25F, 0F, -1F); // Box 879
        ammoModel[34].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[34].rotateAngleZ = 0.08726646F;

        ammoModel[35].addShapeBox(19.75F, 27F, -1F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, -1F); // Box 880
        ammoModel[35].setRotationPoint(-50F, -11F, -4.5F);
        ammoModel[35].rotateAngleZ = 0.08726646F;

        ammoModel[36].addShapeBox(1F, 0F, 0F, 17, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 881
        ammoModel[36].setRotationPoint(-50F, -26F, -4.5F);

        ammoModel[37].addShapeBox(1F, 0F, 0F, 2, 13, 9, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 882
        ammoModel[37].setRotationPoint(-33F, -24F, -4.5F);

        ammoModel[38].addShapeBox(1F, 0F, 0F, 1, 14, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 883
        ammoModel[38].setRotationPoint(-51F, -25F, -4.5F);

        ammoModel[39].addShapeBox(1F, 0F, 0F, 1, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
        ammoModel[39].setRotationPoint(-52F, -25F, -1.5F);

        ammoModel[40].addShapeBox(1F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 885
        ammoModel[40].setRotationPoint(-50F, -27F, 3.5F);

        ammoModel[41].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 886
        ammoModel[41].setRotationPoint(-51F, -27F, 2.5F);

        ammoModel[42].addShapeBox(1F, 0F, 0F, 17, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 887
        ammoModel[42].setRotationPoint(-50F, -26F, 3.5F);

        ammoModel[43].addShapeBox(1F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 888
        ammoModel[43].setRotationPoint(-51F, -26F, 1.5F);

        ammoModel[44].addShapeBox(1F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
        ammoModel[44].setRotationPoint(-51F, -26F, -4.5F);

        ammoModel[45].addShapeBox(1F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 892
        ammoModel[45].setRotationPoint(-33F, -25F, -4.5F);

        ammoModel[46].addShapeBox(1F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 893
        ammoModel[46].setRotationPoint(-33F, -25F, 0.5F);

        ammoModel[47].addShapeBox(1F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 894
        ammoModel[47].setRotationPoint(-33F, -26F, 1.5F);

        ammoModel[48].addShapeBox(1F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 895
        ammoModel[48].setRotationPoint(-33F, -26F, -4.5F);

        ammoModel[49].addShapeBox(1F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 896
        ammoModel[49].setRotationPoint(-33.01F, -24F, -4.5F);

        ammoModel[50].addShapeBox(1F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 897
        ammoModel[50].setRotationPoint(-33.01F, -17F, -4.5F);

        ammoModel[51].addShapeBox(1F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
        ammoModel[51].setRotationPoint(-48F, -18F, 4F);

        ammoModel[52].addShapeBox(1F, 0F, 0F, 11, 1, 1, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Box 885
        ammoModel[52].setRotationPoint(-50F, -27F, -4.5F);

        ammoModel[53].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 886
        ammoModel[53].setRotationPoint(-51F, -27F, -4.5F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 20
        slideModel[1] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 21
        slideModel[2] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 558
        slideModel[3] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 559
        slideModel[4] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 560
        slideModel[5] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 561
        slideModel[6] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 563
        slideModel[7] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 564
        slideModel[8] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 565
        slideModel[9] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 566
        slideModel[10] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 567
        slideModel[11] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 568
        slideModel[12] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 569
        slideModel[13] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 570
        slideModel[14] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 571
        slideModel[15] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 572
        slideModel[16] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 566
        slideModel[17] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 572
        slideModel[18] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 566
        slideModel[19] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 572

        slideModel[0].addShapeBox(0F, 0F, 0F, 37, 2, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
        slideModel[0].setRotationPoint(-14F, -38F, -4F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 37, 1, 8, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
        slideModel[1].setRotationPoint(-14F, -38F, -4F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
        slideModel[2].setRotationPoint(21F, -38F, -6.5F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 559
        slideModel[3].setRotationPoint(23F, -38F, -6.5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
        slideModel[4].setRotationPoint(27F, -38F, -8.5F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 561
        slideModel[5].setRotationPoint(27F, -38F, -7.5F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 563
        slideModel[6].setRotationPoint(21F, -37F, -5F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, -0.875F, 0F, -0.625F, -0.875F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.875F, 0F, -0.625F, -0.875F, 0F, -0.125F, 0F, 0F, 0F); // Box 564
        slideModel[7].setRotationPoint(28F, -38F, -8.5F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.25F, 0F); // Box 565
        slideModel[8].setRotationPoint(20F, -38F, -6.5F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
        slideModel[9].setRotationPoint(21F, -38F, 5.5F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 1.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 1.5F, 0.5F, 0F, -0.5F); // Box 567
        slideModel[10].setRotationPoint(23F, -38F, 5.5F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 568
        slideModel[11].setRotationPoint(27F, -38F, 7.5F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 569
        slideModel[12].setRotationPoint(27F, -38F, 5.5F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 570
        slideModel[13].setRotationPoint(21F, -37F, 4F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.875F, 0F, -0.125F, -0.875F, 0F, -0.625F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0F, -0.125F, -0.875F, 0F, -0.625F, 0F, 0F, -0.5F); // Box 571
        slideModel[14].setRotationPoint(28F, -38F, 7.5F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 572
        slideModel[15].setRotationPoint(20F, -38F, 5.5F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 3.5F, 0F, 0F, 4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
        slideModel[16].setRotationPoint(21F, -38F, 5F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.5F); // Box 572
        slideModel[17].setRotationPoint(20F, -38F, 5F);

        slideModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 3.5F, 0F, 0F, 0F, 0F, 0F); // Box 566
        slideModel[18].setRotationPoint(21F, -38F, -6F);

        slideModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.25F, 0F); // Box 572
        slideModel[19].setRotationPoint(20F, -38F, -6F);
    }
}