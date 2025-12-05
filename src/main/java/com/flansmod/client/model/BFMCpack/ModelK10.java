//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KRISS Vector
// Model Creator: 
// Created on: 29.09.2019 - 18:59:49
// Last changed on: 29.09.2019 - 18:59:49

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelK10 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelK10() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[544];
        defaultScopeModel = new ModelRendererTurbo[36];
        defaultStockModel = new ModelRendererTurbo[47];
        ammoModel = new ModelRendererTurbo[12];
        slideModel = new ModelRendererTurbo[33];

        initgunModel_1();
        initgunModel_2();
        initdefaultScopeModel_1();
        initdefaultStockModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(105F / 16F, 31.5F / 16F, 0F / 16F);
        scopeAttachPoint = new Vector3f(25F / 16F, 47F / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(84 / 16F, 25F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(81F / 16F, 31F / 16F, -6F / 16F);

        animationType = EnumAnimationType.CUSTOM;

        rotateGunHorizontal = 20F;
        tiltGun = 30F;
        translateGun = new Vector3f(0.0F, 0.0F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.63F, 0.0F);

        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = false;
        leftArmPos = new Vector3f(0.07F, -0.3F, -0.02F);
        leftArmRot = new Vector3f(80.0F, 60.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.5F, 0.0F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.21F, -0.55F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.21F, -0.55F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        gunOffset = 0.5F;
        crouchZoom = -0.05F;
        zoomOffset = 0.25F;
        zoomOffsetY = -0.08F;

        translateAll(0F, 0F, 0F);


        flipAll();

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 13
        gunModel[14] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 14
        gunModel[15] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 15
        gunModel[16] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 16
        gunModel[17] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 17
        gunModel[18] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 18
        gunModel[19] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 19
        gunModel[20] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 20
        gunModel[21] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 21
        gunModel[22] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 22
        gunModel[23] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 23
        gunModel[24] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 24
        gunModel[25] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 25
        gunModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
        gunModel[27] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 27
        gunModel[28] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 28
        gunModel[29] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 30
        gunModel[30] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 31
        gunModel[31] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 32
        gunModel[32] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 33
        gunModel[33] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 34
        gunModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 35
        gunModel[35] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 36
        gunModel[36] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 37
        gunModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 38
        gunModel[38] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 39
        gunModel[39] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 42
        gunModel[40] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 43
        gunModel[41] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 44
        gunModel[42] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 45
        gunModel[43] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 46
        gunModel[44] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 47
        gunModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
        gunModel[46] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 49
        gunModel[47] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 50
        gunModel[48] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 52
        gunModel[49] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 53
        gunModel[50] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 54
        gunModel[51] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 55
        gunModel[52] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 56
        gunModel[53] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 57
        gunModel[54] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 58
        gunModel[55] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 59
        gunModel[56] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 60
        gunModel[57] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 61
        gunModel[58] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 62
        gunModel[59] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 63
        gunModel[60] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 64
        gunModel[61] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 65
        gunModel[62] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 66
        gunModel[63] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 67
        gunModel[64] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 68
        gunModel[65] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 69
        gunModel[66] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 70
        gunModel[67] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 71
        gunModel[68] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 72
        gunModel[69] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 73
        gunModel[70] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 74
        gunModel[71] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 75
        gunModel[72] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 76
        gunModel[73] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 77
        gunModel[74] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 78
        gunModel[75] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 79
        gunModel[76] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 80
        gunModel[77] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 81
        gunModel[78] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 82
        gunModel[79] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 83
        gunModel[80] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 84
        gunModel[81] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 85
        gunModel[82] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 87
        gunModel[83] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 88
        gunModel[84] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 89
        gunModel[85] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 90
        gunModel[86] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 91
        gunModel[87] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 92
        gunModel[88] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 94
        gunModel[89] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 95
        gunModel[90] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 96
        gunModel[91] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 97
        gunModel[92] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 98
        gunModel[93] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 99
        gunModel[94] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 101
        gunModel[95] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 102
        gunModel[96] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 103
        gunModel[97] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 104
        gunModel[98] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 105
        gunModel[99] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 106
        gunModel[100] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 107
        gunModel[101] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 108
        gunModel[102] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 109
        gunModel[103] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 112
        gunModel[104] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 115
        gunModel[105] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 116
        gunModel[106] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 119
        gunModel[107] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 120
        gunModel[108] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 121
        gunModel[109] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 122
        gunModel[110] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 123
        gunModel[111] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 124
        gunModel[112] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 125
        gunModel[113] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 126
        gunModel[114] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 127
        gunModel[115] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 128
        gunModel[116] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 129
        gunModel[117] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 130
        gunModel[118] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 131
        gunModel[119] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 132
        gunModel[120] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 133
        gunModel[121] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 134
        gunModel[122] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 135
        gunModel[123] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 136
        gunModel[124] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 137
        gunModel[125] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 138
        gunModel[126] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 139
        gunModel[127] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 140
        gunModel[128] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 141
        gunModel[129] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 142
        gunModel[130] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 143
        gunModel[131] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 144
        gunModel[132] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 145
        gunModel[133] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 147
        gunModel[134] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 148
        gunModel[135] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 149
        gunModel[136] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 153
        gunModel[137] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 155
        gunModel[138] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 156
        gunModel[139] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 157
        gunModel[140] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 158
        gunModel[141] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 159
        gunModel[142] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 160
        gunModel[143] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 161
        gunModel[144] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 162
        gunModel[145] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 163
        gunModel[146] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 164
        gunModel[147] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 165
        gunModel[148] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 166
        gunModel[149] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 167
        gunModel[150] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 168
        gunModel[151] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 169
        gunModel[152] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 170
        gunModel[153] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 171
        gunModel[154] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 172
        gunModel[155] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 173
        gunModel[156] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 174
        gunModel[157] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 175
        gunModel[158] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 176
        gunModel[159] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 177
        gunModel[160] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 178
        gunModel[161] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 179
        gunModel[162] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 181
        gunModel[163] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 182
        gunModel[164] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 183
        gunModel[165] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 184
        gunModel[166] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 185
        gunModel[167] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 186
        gunModel[168] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 187
        gunModel[169] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 189
        gunModel[170] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 190
        gunModel[171] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 199
        gunModel[172] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 200
        gunModel[173] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 207
        gunModel[174] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 208
        gunModel[175] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 212
        gunModel[176] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 213
        gunModel[177] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 214
        gunModel[178] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 215
        gunModel[179] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 216
        gunModel[180] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 217
        gunModel[181] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 218
        gunModel[182] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 219
        gunModel[183] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 220
        gunModel[184] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 221
        gunModel[185] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 222
        gunModel[186] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 223
        gunModel[187] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 224
        gunModel[188] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 225
        gunModel[189] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 226
        gunModel[190] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 227
        gunModel[191] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 241
        gunModel[192] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 274
        gunModel[193] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 275
        gunModel[194] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 276
        gunModel[195] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 277
        gunModel[196] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 278
        gunModel[197] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 279
        gunModel[198] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 280
        gunModel[199] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 281
        gunModel[200] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 282
        gunModel[201] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 283
        gunModel[202] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 284
        gunModel[203] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 285
        gunModel[204] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 286
        gunModel[205] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 287
        gunModel[206] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 288
        gunModel[207] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 289
        gunModel[208] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 290
        gunModel[209] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 291
        gunModel[210] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 292
        gunModel[211] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 293
        gunModel[212] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 294
        gunModel[213] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 296
        gunModel[214] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 297
        gunModel[215] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 298
        gunModel[216] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 299
        gunModel[217] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 301
        gunModel[218] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 302
        gunModel[219] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 303
        gunModel[220] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 305
        gunModel[221] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 307
        gunModel[222] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 308
        gunModel[223] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 309
        gunModel[224] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 314
        gunModel[225] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 315
        gunModel[226] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 316
        gunModel[227] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 317
        gunModel[228] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 353
        gunModel[229] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 354
        gunModel[230] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 355
        gunModel[231] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 356
        gunModel[232] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 357
        gunModel[233] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 358
        gunModel[234] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 362
        gunModel[235] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 363
        gunModel[236] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 364
        gunModel[237] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 365
        gunModel[238] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 366
        gunModel[239] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 367
        gunModel[240] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 368
        gunModel[241] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 369
        gunModel[242] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 370
        gunModel[243] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 371
        gunModel[244] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 363
        gunModel[245] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 364
        gunModel[246] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 365
        gunModel[247] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 366
        gunModel[248] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 367
        gunModel[249] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 368
        gunModel[250] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 369
        gunModel[251] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 370
        gunModel[252] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 371
        gunModel[253] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 372
        gunModel[254] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 373
        gunModel[255] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 374
        gunModel[256] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 375
        gunModel[257] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 391
        gunModel[258] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 392
        gunModel[259] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 393
        gunModel[260] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 395
        gunModel[261] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 396
        gunModel[262] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 400
        gunModel[263] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 402
        gunModel[264] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 403
        gunModel[265] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 404
        gunModel[266] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 399
        gunModel[267] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 467
        gunModel[268] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 469
        gunModel[269] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 470
        gunModel[270] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 471
        gunModel[271] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 472
        gunModel[272] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 474
        gunModel[273] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 474
        gunModel[274] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 397
        gunModel[275] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 400
        gunModel[276] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 484
        gunModel[277] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 485
        gunModel[278] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 486
        gunModel[279] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 489
        gunModel[280] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 490
        gunModel[281] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 497
        gunModel[282] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 498
        gunModel[283] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 499
        gunModel[284] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 500
        gunModel[285] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 298
        gunModel[286] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 35
        gunModel[287] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 42
        gunModel[288] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 4
        gunModel[289] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 293
        gunModel[290] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 293
        gunModel[291] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 298
        gunModel[292] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 357
        gunModel[293] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 44
        gunModel[294] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 299
        gunModel[295] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 298
        gunModel[296] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 298
        gunModel[297] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 298
        gunModel[298] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 298
        gunModel[299] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 298
        gunModel[300] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 298
        gunModel[301] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 298
        gunModel[302] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 298
        gunModel[303] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 289
        gunModel[304] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 298
        gunModel[305] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 298
        gunModel[306] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 298
        gunModel[307] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 298
        gunModel[308] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 298
        gunModel[309] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 298
        gunModel[310] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 298
        gunModel[311] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 298
        gunModel[312] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 92
        gunModel[313] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 92
        gunModel[314] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 54
        gunModel[315] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 140
        gunModel[316] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 160
        gunModel[317] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 140
        gunModel[318] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 160
        gunModel[319] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 160
        gunModel[320] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 160
        gunModel[321] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 160
        gunModel[322] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 160
        gunModel[323] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 160
        gunModel[324] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 162
        gunModel[325] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 29
        gunModel[326] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 30
        gunModel[327] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 298
        gunModel[328] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 298
        gunModel[329] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 298
        gunModel[330] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 298
        gunModel[331] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 298
        gunModel[332] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 298
        gunModel[333] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 298
        gunModel[334] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 298
        gunModel[335] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 298
        gunModel[336] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 298
        gunModel[337] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 298
        gunModel[338] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 298
        gunModel[339] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 298
        gunModel[340] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 298
        gunModel[341] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 298
        gunModel[342] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 298
        gunModel[343] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 298
        gunModel[344] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 298
        gunModel[345] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 298
        gunModel[346] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 298
        gunModel[347] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 298
        gunModel[348] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 298
        gunModel[349] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 298
        gunModel[350] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 298
        gunModel[351] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 298
        gunModel[352] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 298
        gunModel[353] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 298
        gunModel[354] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 298
        gunModel[355] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 298
        gunModel[356] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 298
        gunModel[357] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 298
        gunModel[358] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 298
        gunModel[359] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 298
        gunModel[360] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 298
        gunModel[361] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 298
        gunModel[362] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 298
        gunModel[363] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 298
        gunModel[364] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 298
        gunModel[365] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 298
        gunModel[366] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 298
        gunModel[367] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 298
        gunModel[368] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 298
        gunModel[369] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 298
        gunModel[370] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 298
        gunModel[371] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 298
        gunModel[372] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 298
        gunModel[373] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 298
        gunModel[374] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 298
        gunModel[375] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 298
        gunModel[376] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 298
        gunModel[377] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 298
        gunModel[378] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 298
        gunModel[379] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 298
        gunModel[380] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 298
        gunModel[381] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 298
        gunModel[382] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 298
        gunModel[383] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 298
        gunModel[384] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 298
        gunModel[385] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 298
        gunModel[386] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 298
        gunModel[387] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 298
        gunModel[388] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 298
        gunModel[389] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 298
        gunModel[390] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 298
        gunModel[391] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 298
        gunModel[392] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 298
        gunModel[393] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 298
        gunModel[394] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 298
        gunModel[395] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 298
        gunModel[396] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 298
        gunModel[397] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 298
        gunModel[398] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 298
        gunModel[399] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 298
        gunModel[400] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 298
        gunModel[401] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 298
        gunModel[402] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 298
        gunModel[403] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 298
        gunModel[404] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 298
        gunModel[405] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 298
        gunModel[406] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 298
        gunModel[407] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 298
        gunModel[408] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 298
        gunModel[409] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 298
        gunModel[410] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 298
        gunModel[411] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 298
        gunModel[412] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 298
        gunModel[413] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 298
        gunModel[414] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 298
        gunModel[415] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 298
        gunModel[416] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 298
        gunModel[417] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 298
        gunModel[418] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 298
        gunModel[419] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 298
        gunModel[420] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 298
        gunModel[421] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 298
        gunModel[422] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 298
        gunModel[423] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 298
        gunModel[424] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 298
        gunModel[425] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 298
        gunModel[426] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 298
        gunModel[427] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 298
        gunModel[428] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 298
        gunModel[429] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 298
        gunModel[430] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 298
        gunModel[431] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 298
        gunModel[432] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Box 298
        gunModel[433] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 298
        gunModel[434] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 298
        gunModel[435] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Box 298
        gunModel[436] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 298
        gunModel[437] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 298
        gunModel[438] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 298
        gunModel[439] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 298
        gunModel[440] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 298
        gunModel[441] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 298
        gunModel[442] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 298
        gunModel[443] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 298
        gunModel[444] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 298
        gunModel[445] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 298
        gunModel[446] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 298
        gunModel[447] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 298
        gunModel[448] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 298
        gunModel[449] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 298
        gunModel[450] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 298
        gunModel[451] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 298
        gunModel[452] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 298
        gunModel[453] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 298
        gunModel[454] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 298
        gunModel[455] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 298
        gunModel[456] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 298
        gunModel[457] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 298
        gunModel[458] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 298
        gunModel[459] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 298
        gunModel[460] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 298
        gunModel[461] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 298
        gunModel[462] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 298
        gunModel[463] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 298
        gunModel[464] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 298
        gunModel[465] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 298
        gunModel[466] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 298
        gunModel[467] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 298
        gunModel[468] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 298
        gunModel[469] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 298
        gunModel[470] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 298
        gunModel[471] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 298
        gunModel[472] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 298
        gunModel[473] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 298
        gunModel[474] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 298
        gunModel[475] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 294
        gunModel[476] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 294
        gunModel[477] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 294
        gunModel[478] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 292
        gunModel[479] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 292
        gunModel[480] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 292
        gunModel[481] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 292
        gunModel[482] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 292
        gunModel[483] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 225
        gunModel[484] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 226
        gunModel[485] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 92
        gunModel[486] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 92
        gunModel[487] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 92
        gunModel[488] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 92
        gunModel[489] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 314
        gunModel[490] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 314
        gunModel[491] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 314
        gunModel[492] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 365
        gunModel[493] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 365
        gunModel[494] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 365
        gunModel[495] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 365
        gunModel[496] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 521
        gunModel[497] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 521
        gunModel[498] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 521
        gunModel[499] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 521

        gunModel[0].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
        gunModel[0].setRotationPoint(68F, -34F, -1F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        gunModel[1].setRotationPoint(68F, -30F, -1F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
        gunModel[2].setRotationPoint(68F, -32.5F, -2.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[3].setRotationPoint(68F, -32.5F, 1.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 95, 1, 6, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
        gunModel[4].setRotationPoint(-1F, -47F, -3F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
        gunModel[5].setRotationPoint(-1F, -48F, -3F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 6
        gunModel[6].setRotationPoint(6F, -48F, -3F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 7
        gunModel[7].setRotationPoint(10F, -48F, -3F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 8
        gunModel[8].setRotationPoint(14F, -48F, -3F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 9
        gunModel[9].setRotationPoint(26F, -48F, -3F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 10
        gunModel[10].setRotationPoint(22F, -48F, -3F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 11
        gunModel[11].setRotationPoint(18F, -48F, -3F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 12
        gunModel[12].setRotationPoint(50F, -48F, -3F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 13
        gunModel[13].setRotationPoint(46F, -48F, -3F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 14
        gunModel[14].setRotationPoint(42F, -48F, -3F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 15
        gunModel[15].setRotationPoint(38F, -48F, -3F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 16
        gunModel[16].setRotationPoint(34F, -48F, -3F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 17
        gunModel[17].setRotationPoint(30F, -48F, -3F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 18
        gunModel[18].setRotationPoint(90F, -48F, -3F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
        gunModel[19].setRotationPoint(86F, -48F, -3F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 20
        gunModel[20].setRotationPoint(82F, -48F, -3F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 21
        gunModel[21].setRotationPoint(78F, -48F, -3F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 22
        gunModel[22].setRotationPoint(74F, -48F, -3F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 23
        gunModel[23].setRotationPoint(70F, -48F, -3F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 24
        gunModel[24].setRotationPoint(66F, -48F, -3F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 25
        gunModel[25].setRotationPoint(62F, -48F, -3F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 26
        gunModel[26].setRotationPoint(58F, -48F, -3F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 27
        gunModel[27].setRotationPoint(54F, -48F, -3F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 63, 1, 3, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
        gunModel[28].setRotationPoint(4F, -45F, -5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 30
        gunModel[29].setRotationPoint(95F, -44F, -5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, -0.0625F, 0F, 0F, -0.0625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        gunModel[30].setRotationPoint(94F, -45F, -4F);

        gunModel[31].addShapeBox(-0.5F, 0F, 0.5F, 12, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        gunModel[31].setRotationPoint(84.5F, -45F, -4.5F);

        gunModel[32].addShapeBox(-0.5F, 0F, 0.5F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        gunModel[32].setRotationPoint(84.5F, -43F, -4.5F);

        gunModel[33].addShapeBox(-0.5F, 0F, 0.5F, 12, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 34
        gunModel[33].setRotationPoint(84.5F, -39F, -4.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 1F, 0F, 0.5F, -0.0625F, 0F, 0.5F, -0.0625F, 0F, -1F, 1F, 0F, -1F, 0.5F, -0.5F, 0F, -0.03125F, -0.5F, 0F, -0.03125F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 35
        gunModel[34].setRotationPoint(78F, -45F, 2F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 36
        gunModel[35].setRotationPoint(66F, -44F, -5F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 49, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        gunModel[36].setRotationPoint(4F, -43F, -5F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 38
        gunModel[37].setRotationPoint(78F, -44F, -5F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        gunModel[38].setRotationPoint(13F, -38F, -5F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.5F, 0F, 0.5F, -0.03125F, 0F, 0.5F, -0.03125F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 42
        gunModel[39].setRotationPoint(78F, -44.5F, 4F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
        gunModel[40].setRotationPoint(77F, -28F, -4F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 19, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 44
        gunModel[41].setRotationPoint(77F, -27F, -3F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 45
        gunModel[42].setRotationPoint(72F, -25F, -3F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        gunModel[43].setRotationPoint(77F, -25F, -3F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        gunModel[44].setRotationPoint(81F, -25F, -3F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        gunModel[45].setRotationPoint(85F, -25F, -3F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        gunModel[46].setRotationPoint(89F, -25F, -3F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        gunModel[47].setRotationPoint(93F, -25F, -3F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 15, 24, 1, 0F, -3F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -3F, 0F, 0F, 5.5F, 0F, 0F, -5F, 7F, 0F, -5F, 7F, 0F, 5.5F, 0F, 0F); // Box 52
        gunModel[48].setRotationPoint(33F, -32F, -4F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, 0.5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0.5F, 0F, 0F, 2F, 4F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 2F, 4F, 0F); // Box 53
        gunModel[49].setRotationPoint(28F, -8F, -4F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 15, 4, 8, 0F, -1.5F, 5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[50].setRotationPoint(26F, -3F, -4F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F, 0F, 3.3269F, 0.25F, 1.5F, 8F, 1.5F, 1.5F, 8F, 1.5F, 0F, 3.3269F, 0.25F, 0.5F, -3.0288F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, -3.0288F, 0.25F); // Box 55
        gunModel[51].setRotationPoint(14F, 0F, -3.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, -1.99F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 56
        gunModel[52].setRotationPoint(4F, -37F, -4F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[53].setRotationPoint(15.5F, -29F, -1.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        gunModel[54].setRotationPoint(21.5F, -27F, -1.5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, -1F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 59
        gunModel[55].setRotationPoint(27.5F, -28F, -1.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -0.5F, 0F); // Box 60
        gunModel[56].setRotationPoint(14.5F, -30F, -1.5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 2F, 1F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F); // Box 61
        gunModel[57].setRotationPoint(5F, -37F, -3.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, -2F, 6.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -2F, 6.5F, 0F, 0F, -0.2981F, 0F, 0.5F, 3.1346F, 0F, 0.5F, 3.1346F, 0F, 0F, -0.2981F, 0F); // Box 62
        gunModel[58].setRotationPoint(-4.5F, -11.5F, -3.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F); // Box 63
        gunModel[59].setRotationPoint(5F, -36F, -3.5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -3F, 0.5F, 0F, 3.5F, 0.5F, -2F, 3.5F, 0.5F, -2F, -3F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, -2F, 1.5F, 0F, -2F, 0F, 0F, 0F); // Box 64
        gunModel[60].setRotationPoint(13F, -36F, -3.5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 8, 26, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 8F, -3F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 8F, -3F, 0F); // Box 65
        gunModel[61].setRotationPoint(5F, -34F, -3.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 6, 9, 7, 0F, 0F, 0F, 0F, -2F, 7F, 0F, -2F, 7F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3F, 10F, 0F, -3F, 10F, 0F, 3.5F, 0F, 0F); // Box 66
        gunModel[62].setRotationPoint(1F, -27F, -3.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 26, 1, 7, 0F, -0.5F, 0.2981F, 0F, 0F, -10F, 0.5F, 0F, -10F, 0.5F, -0.5F, 0.2981F, 0F, 0F, 0F, 0F, 0F, 10.5F, 0.5F, 0F, 10.5F, 0.5F, 0F, 0F, 0F); // Box 67
        gunModel[63].setRotationPoint(-5F, -10.5F, -3.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 2, 24, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 9F, 0F, 0F, -8.5F, 0F, -2F, -8.5F, 0F, -2F, 9F, 0F, 0F); // Box 68
        gunModel[64].setRotationPoint(13F, -32F, -3.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        gunModel[65].setRotationPoint(19.5F, -35F, -1F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -2F, 0.5F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, -2F); // Box 70
        gunModel[66].setRotationPoint(3F, -36F, -3.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F, 0.5F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, -2F, 3.5F, 0.5F, -2F, -4F, 1F, 0F, -4F, 1F, 0F, 3.5F, 0.5F, -2F); // Box 71
        gunModel[67].setRotationPoint(3F, -33F, -3.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 2, 9, 7, 0F, -0.5F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -2F, 3F, -0.5F, -2F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -0.5F, -2F); // Box 72
        gunModel[68].setRotationPoint(-1F, -27F, -3.5F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, -1F, 0.5F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, -2F, 0.5F, -0.5F, -2F, -1.5F, 0.2019F, 0F, -1.5F, 0.2019F, 0F, 0.5F, -0.5F, -2F); // Box 73
        gunModel[69].setRotationPoint(-5F, -18F, -3.5F);

        gunModel[70].addShapeBox(-1.5F, 1F, 0F, 3, 1, 1, 0F, 3F, 5F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 3F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        gunModel[70].setRotationPoint(59F, -27F, 3F);
        gunModel[70].rotateAngleZ = -0.39269908F;

        gunModel[71].addShapeBox(-2.5F, 1F, 0F, 1, 1, 1, 0F, 3F, -3F, 0F, -3F, 5F, 0F, -3F, 5F, 0F, 3F, -3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 2F, 0F); // Box 75
        gunModel[71].setRotationPoint(59F, -27F, 3F);
        gunModel[71].rotateAngleZ = -0.39269908F;

        gunModel[72].addShapeBox(3.5F, 4F, 0F, 1, 14, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 76
        gunModel[72].setRotationPoint(59F, -27F, 3F);
        gunModel[72].rotateAngleZ = -0.39269908F;

        gunModel[73].addShapeBox(-4.5F, 4F, 0F, 1, 14, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 77
        gunModel[73].setRotationPoint(59F, -27F, 3F);
        gunModel[73].rotateAngleZ = -0.39269908F;

        gunModel[74].addShapeBox(1.5F, 1F, 0F, 1, 1, 1, 0F, 0F, 7.5F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 7.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F); // Box 78
        gunModel[74].setRotationPoint(59F, -27F, 3F);
        gunModel[74].rotateAngleZ = -0.39269908F;

        gunModel[75].addShapeBox(-2.5F, 20.5F, 0F, 1, 1, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F); // Box 79
        gunModel[75].setRotationPoint(59F, -27F, 3F);
        gunModel[75].rotateAngleZ = -0.39269908F;

        gunModel[76].addShapeBox(-1.5F, 20.5F, 0F, 3, 1, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 80
        gunModel[76].setRotationPoint(59F, -27F, 3F);
        gunModel[76].rotateAngleZ = -0.39269908F;

        gunModel[77].addShapeBox(1.5F, 20.5F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F); // Box 81
        gunModel[77].setRotationPoint(59F, -27F, 3F);
        gunModel[77].rotateAngleZ = -0.39269908F;

        gunModel[78].addShapeBox(-1.5F, 22F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        gunModel[78].setRotationPoint(59F, -27F, 3F);
        gunModel[78].rotateAngleZ = -0.36651914F;

        gunModel[79].addShapeBox(0.5F, 22F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 83
        gunModel[79].setRotationPoint(59F, -27F, 3F);
        gunModel[79].rotateAngleZ = -0.36651914F;

        gunModel[80].addShapeBox(-3.5F, 22F, 0F, 2, 1, 1, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 84
        gunModel[80].setRotationPoint(59F, -27F, 3F);
        gunModel[80].rotateAngleZ = -0.36651914F;

        gunModel[81].addShapeBox(2.5F, 25F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 85
        gunModel[81].setRotationPoint(59F, -27F, 3F);
        gunModel[81].rotateAngleZ = -0.36651914F;

        gunModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 87
        gunModel[82].setRotationPoint(69F, -26F, -4F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 1F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, -1.5F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 88
        gunModel[83].setRotationPoint(67F, -26F, -4F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 2, 20, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 9.5F, 0F, 0F, -9.5F, 0F, -2F, -9.5F, 0F, 0F, 9.5F, 0F, -2F); // Box 89
        gunModel[84].setRotationPoint(64F, -22F, -4F);

        gunModel[85].addShapeBox(-4.5F, 25F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.6F, 0F); // Box 90
        gunModel[85].setRotationPoint(59F, -27F, 3F);
        gunModel[85].rotateAngleZ = -0.36651914F;

        gunModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, -1F, 1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 1.5F, 0F, 0F, -2.5F, 0F, -1F, -1F, -2F, -1F, -1F, -2F, 0F, -2.5F, 0F); // Box 91
        gunModel[86].setRotationPoint(65F, -23F, -4F);

        gunModel[87].addShapeBox(0F, 0.5F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        gunModel[87].setRotationPoint(62.5F, -21.5F, 2F);
        gunModel[87].rotateAngleZ = -0.39269908F;

        gunModel[88].addShapeBox(0F, -1.5F, 2F, 1, 1, 2, 0F, 0.5F, 0F, 0F, 2.04F, 0F, 0F, 0.54F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 1.98F, 0F, 0F, 0.48F, 0F, 0.5F, 1.5F, 0F, 0.5F); // Box 94
        gunModel[88].setRotationPoint(62.5F, -21.5F, 0F);
        gunModel[88].rotateAngleZ = -0.39269908F;

        gunModel[89].addShapeBox(0F, 4.5F, 0F, 1, 1, 2, 0F, 1.5F, 0F, 0F, 1.73F, 0F, 0F, 0.23F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0.5F, 0F, 0F, 1.68F, 0F, 0F, 0.18F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 95
        gunModel[89].setRotationPoint(62.5F, -21.5F, 2F);
        gunModel[89].rotateAngleZ = -0.39269908F;

        gunModel[90].addShapeBox(-1.5F, -0.5F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 96
        gunModel[90].setRotationPoint(62.5F, -21.5F, 2F);
        gunModel[90].rotateAngleZ = -0.39269908F;

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 14, 3, 0F, -6.8875F, 0.5F, -2F, 6.65F, 0F, 0F, 6.65F, 0F, -2F, -6.8875F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 97
        gunModel[91].setRotationPoint(54.5F, -16F, 1F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 98
        gunModel[92].setRotationPoint(54F, -2F, -4F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, 0F); // Box 99
        gunModel[93].setRotationPoint(65F, -22F, -2F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 101
        gunModel[94].setRotationPoint(54F, -2F, 2.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 102
        gunModel[95].setRotationPoint(56F, -2F, -2.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -1F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 2F, 0F, -1F, 2F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, 0F, -1F, 2F); // Box 103
        gunModel[96].setRotationPoint(64F, -22F, -2F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
        gunModel[97].setRotationPoint(70.5F, -27F, -4F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
        gunModel[98].setRotationPoint(77F, -32F, -4F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        gunModel[99].setRotationPoint(71.5F, -32F, -5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 107
        gunModel[100].setRotationPoint(68.5F, -32F, -4F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 108
        gunModel[101].setRotationPoint(66F, -32F, -4F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 109
        gunModel[102].setRotationPoint(65F, -32F, -4F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3.5F, 0F); // Box 112
        gunModel[103].setRotationPoint(63F, -32F, -4F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 115
        gunModel[104].setRotationPoint(61.5F, -32F, 3F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, -9F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        gunModel[105].setRotationPoint(52.5F, -22F, -4F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 119
        gunModel[106].setRotationPoint(52F, -1.5F, -4F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 0F, 3F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0F, 3F, 0F); // Box 120
        gunModel[107].setRotationPoint(45.8F, -12F, -4F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 121
        gunModel[108].setRotationPoint(51.5F, -7F, 3F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 122
        gunModel[109].setRotationPoint(43.8F, -5F, -4F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 11, 24, 1, 0F, -12F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        gunModel[110].setRotationPoint(42F, -27F, 2.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        gunModel[111].setRotationPoint(42F, -3F, 2.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
        gunModel[112].setRotationPoint(51.5F, -3F, 2.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 126
        gunModel[113].setRotationPoint(52.5F, -2F, 2.5F);

        gunModel[114].addShapeBox(3.5F, 4F, 0F, 1, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 127
        gunModel[114].setRotationPoint(59F, -27F, -4F);
        gunModel[114].rotateAngleZ = -0.39269908F;

        gunModel[115].addShapeBox(1.5F, 1F, 0F, 1, 1, 1, 0F, -0.5F, 7.5F, 0F, 3.5F, -3F, 0F, 3.5F, -3F, 0F, -0.5F, 7.5F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 128
        gunModel[115].setRotationPoint(59F, -27F, -4F);
        gunModel[115].rotateAngleZ = -0.39269908F;

        gunModel[116].addShapeBox(-1.5F, 1F, 0F, 3, 1, 1, 0F, 3F, 5F, 0F, 0.5F, 7.5F, 0F, 0.5F, 7.5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
        gunModel[116].setRotationPoint(59F, -27F, -4F);
        gunModel[116].rotateAngleZ = -0.39269908F;

        gunModel[117].addShapeBox(-2.5F, 1F, 0F, 1, 1, 1, 0F, 3F, -3F, 0F, -3F, 5F, 0F, -3F, 5F, 0F, 3F, -3F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 130
        gunModel[117].setRotationPoint(59F, -27F, -4F);
        gunModel[117].rotateAngleZ = -0.39269908F;

        gunModel[118].addShapeBox(-4.5F, 4F, 0F, 1, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 131
        gunModel[118].setRotationPoint(59F, -27F, -4F);
        gunModel[118].rotateAngleZ = -0.39269908F;

        gunModel[119].addShapeBox(-2.5F, 20.5F, 0F, 1, 1, 1, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F); // Box 132
        gunModel[119].setRotationPoint(59F, -27F, -4F);
        gunModel[119].rotateAngleZ = -0.39269908F;

        gunModel[120].addShapeBox(-1.5F, 20.5F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 133
        gunModel[120].setRotationPoint(59F, -27F, -4F);
        gunModel[120].rotateAngleZ = -0.39269908F;

        gunModel[121].addShapeBox(1.5F, 20.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F); // Box 134
        gunModel[121].setRotationPoint(59F, -27F, -4F);
        gunModel[121].rotateAngleZ = -0.39269908F;

        gunModel[122].addShapeBox(2.5F, 25F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F); // Box 135
        gunModel[122].setRotationPoint(59F, -27F, -4F);
        gunModel[122].rotateAngleZ = -0.36651914F;

        gunModel[123].addShapeBox(0.5F, 22F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 1F, 0F); // Box 136
        gunModel[123].setRotationPoint(59F, -27F, -4F);
        gunModel[123].rotateAngleZ = -0.36651914F;

        gunModel[124].addShapeBox(-1.5F, 22F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 137
        gunModel[124].setRotationPoint(59F, -27F, -4F);
        gunModel[124].rotateAngleZ = -0.36651914F;

        gunModel[125].addShapeBox(-3.5F, 22F, 0F, 2, 1, 1, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F); // Box 138
        gunModel[125].setRotationPoint(59F, -27F, -4F);
        gunModel[125].rotateAngleZ = -0.36651914F;

        gunModel[126].addShapeBox(-4.5F, 25F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, -0.5F, 0F, 0.6F, -0.5F); // Box 139
        gunModel[126].setRotationPoint(59F, -27F, -4F);
        gunModel[126].rotateAngleZ = -0.36651914F;

        gunModel[127].addShapeBox(0F, 0F, 0F, 15, 24, 1, 0F, -3F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -3F, 0F, 0F, 5.5F, 0F, 0F, -5F, 7F, 0F, -5F, 7F, 0F, 5.5F, 0F, 0F); // Box 140
        gunModel[127].setRotationPoint(33F, -32F, 3F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, 0.5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0.5F, 0F, 0F, 2F, 4F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 2F, 4F, 0F); // Box 141
        gunModel[128].setRotationPoint(28F, -8F, 3F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 0F, 3F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0F, 3F, 0F); // Box 142
        gunModel[129].setRotationPoint(45.8F, -12F, 3F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 2F); // Box 143
        gunModel[130].setRotationPoint(4F, -9.5F, -1.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 144
        gunModel[131].setRotationPoint(43.8F, -5F, 3F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 145
        gunModel[132].setRotationPoint(51.5F, -7F, -4F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F, -7.125F, 0F, 0F, 6.8875F, -0.5F, 0F, 6.8875F, -0.5F, 0F, -7.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        gunModel[133].setRotationPoint(52.5F, -17F, 3F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        gunModel[134].setRotationPoint(52F, -1.5F, 3F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, -2F); // Box 149
        gunModel[135].setRotationPoint(0F, -38F, -3.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Box 153
        gunModel[136].setRotationPoint(64F, -32F, 3F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 155
        gunModel[137].setRotationPoint(65F, -32F, 3F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 156
        gunModel[138].setRotationPoint(66F, -32F, 3F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 157
        gunModel[139].setRotationPoint(68.5F, -32F, 2F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        gunModel[140].setRotationPoint(71.5F, -32F, 2F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 159
        gunModel[141].setRotationPoint(77F, -32F, 3F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 59, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[142].setRotationPoint(36F, -33F, 3F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 161
        gunModel[143].setRotationPoint(78F, -44.5F, 4F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 162
        gunModel[144].setRotationPoint(29F, -37F, 4F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 9F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        gunModel[145].setRotationPoint(13F, -38F, 4F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
        gunModel[146].setRotationPoint(11F, -39F, 4.01F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 11, 24, 1, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
        gunModel[147].setRotationPoint(42F, -27F, -3.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
        gunModel[148].setRotationPoint(42F, -3F, -3.5F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
        gunModel[149].setRotationPoint(51.5F, -3F, -3.5F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 168
        gunModel[150].setRotationPoint(52.5F, -2F, -3.5F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 3F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 3F, -2F, 1.5F); // Box 169
        gunModel[151].setRotationPoint(62F, -23F, 1F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 1, 24, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, 8.5F, 0F, 0F); // Box 170
        gunModel[152].setRotationPoint(31F, -32F, -4F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 17, 1, 8, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
        gunModel[153].setRotationPoint(13F, -37F, -4F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
        gunModel[154].setRotationPoint(20F, -37F, -1F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 173
        gunModel[155].setRotationPoint(20F, -32F, -1F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 174
        gunModel[156].setRotationPoint(14F, -32F, -1F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F); // Box 175
        gunModel[157].setRotationPoint(19F, -31F, -1F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 176
        gunModel[158].setRotationPoint(16.5F, -33F, -1F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 177
        gunModel[159].setRotationPoint(15.5F, -34F, -1F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        gunModel[160].setRotationPoint(31F, -35F, -4F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 2F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        gunModel[161].setRotationPoint(31F, -37F, -4F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
        gunModel[162].setRotationPoint(13F, -36.5F, -3.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 2.5F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 182
        gunModel[163].setRotationPoint(15F, -36.5F, -1.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F); // Box 183
        gunModel[164].setRotationPoint(4F, -36.5F, -3.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2.5F, 0.5F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0.5F, -2F); // Box 184
        gunModel[165].setRotationPoint(0F, -38F, -3.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        gunModel[166].setRotationPoint(-1F, -45F, -4F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 29, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        gunModel[167].setRotationPoint(66F, -43F, -5F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 187
        gunModel[168].setRotationPoint(78F, -44F, 4F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 68, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 189
        gunModel[169].setRotationPoint(-1F, -44F, 4F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 68, 1, 3, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 190
        gunModel[170].setRotationPoint(-1F, -45F, 2F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        gunModel[171].setRotationPoint(51F, -38.5F, 4F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
        gunModel[172].setRotationPoint(51F, -35.5F, 4F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
        gunModel[173].setRotationPoint(74F, -38F, 4F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
        gunModel[174].setRotationPoint(74F, -38F, 4F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 212
        gunModel[175].setRotationPoint(1F, -50F, -1.5F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 213
        gunModel[176].setRotationPoint(3F, -50F, -1.5F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        gunModel[177].setRotationPoint(2F, -50F, -1.5F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 215
        gunModel[178].setRotationPoint(2F, -49.5F, -3.5F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 216
        gunModel[179].setRotationPoint(2F, -49.5F, -5.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F); // Box 217
        gunModel[180].setRotationPoint(2F, -49.5F, 3.5F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -1F, -2F, 0F, 0F); // Box 218
        gunModel[181].setRotationPoint(-3F, -49.5F, 3.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
        gunModel[182].setRotationPoint(-3F, -49.5F, -5.5F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 220
        gunModel[183].setRotationPoint(-3F, -49.5F, -3.5F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 221
        gunModel[184].setRotationPoint(-1F, -49.5F, -5.5F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
        gunModel[185].setRotationPoint(-1F, -49.5F, 4.5F);

        gunModel[186].addShapeBox(-6.5F, 0F, 3.5F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F); // Box 223
        gunModel[186].setRotationPoint(1.5F, -48F, -6.5F);

        gunModel[187].addShapeBox(-11.5F, 0F, 1.5F, 9, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
        gunModel[187].setRotationPoint(1.5F, -45F, -6.5F);

        gunModel[188].addShapeBox(-11.5F, 0F, 10.5F, 8, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 225
        gunModel[188].setRotationPoint(1.5F, -44F, -6.5F);

        gunModel[189].addShapeBox(-11.5F, 0F, 10.5F, 8, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[189].setRotationPoint(1.5F, -40F, -6.5F);

        gunModel[190].addShapeBox(-11.5F, 0F, 1.5F, 5, 1, 10, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
        gunModel[190].setRotationPoint(1.5F, -38F, -6.5F);

        gunModel[191].addShapeBox(-11.5F, 0F, 1.5F, 3, 1, 10, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 241
        gunModel[191].setRotationPoint(1.5F, -37.5F, -6.5F);

        gunModel[192].addShapeBox(-11.5F, 0F, 2.5F, 9, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
        gunModel[192].setRotationPoint(1.5F, -44F, -6.5F);

        gunModel[193].addShapeBox(-11.5F, 0F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 275
        gunModel[193].setRotationPoint(1.5F, -44F, -6.5F);

        gunModel[194].addShapeBox(-6.5F, 0F, 1.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 276
        gunModel[194].setRotationPoint(1.5F, -39F, -6.5F);

        gunModel[195].addShapeBox(-6.5F, 0F, 1.5F, 4, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        gunModel[195].setRotationPoint(1.5F, -41F, -6.5F);

        gunModel[196].addShapeBox(-4.5F, 0F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 278
        gunModel[196].setRotationPoint(1.5F, -44F, -6.5F);

        gunModel[197].addShapeBox(-11.5F, 0F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
        gunModel[197].setRotationPoint(1.5F, -39F, -6.5F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 280
        gunModel[198].setRotationPoint(51F, -35F, 4F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
        gunModel[199].setRotationPoint(51F, -34F, 4F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        gunModel[200].setRotationPoint(64.5F, -34F, 4F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
        gunModel[201].setRotationPoint(64.5F, -33F, 4F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
        gunModel[202].setRotationPoint(64.5F, -31F, 4F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
        gunModel[203].setRotationPoint(64.5F, -29F, 4F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        gunModel[204].setRotationPoint(64.5F, -27F, 4F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[205].setRotationPoint(51F, -33F, 4F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
        gunModel[206].setRotationPoint(51F, -31F, 4F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
        gunModel[207].setRotationPoint(55.75F, -34F, 3.5F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
        gunModel[208].setRotationPoint(58F, -32.5F, 4F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 291
        gunModel[209].setRotationPoint(57F, -33F, 4F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 292
        gunModel[210].setRotationPoint(53F, -33F, 4F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 293
        gunModel[211].setRotationPoint(61F, -32.5F, 4F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 294
        gunModel[212].setRotationPoint(61.5F, -33.5F, 4F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 296
        gunModel[213].setRotationPoint(58.5F, -30.5F, 3.75F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 297
        gunModel[214].setRotationPoint(58.5F, -31F, 3.75F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 298
        gunModel[215].setRotationPoint(56F, -29F, 3.75F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 299
        gunModel[216].setRotationPoint(62F, -29.5F, 3.75F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 49, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        gunModel[217].setRotationPoint(4F, -44F, -5F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 4F); // Box 302
        gunModel[218].setRotationPoint(64F, -44F, -5F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 3F, 0F, 4F); // Box 303
        gunModel[219].setRotationPoint(58F, -44F, -5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 305
        gunModel[220].setRotationPoint(55F, -41F, -1F);

        gunModel[221].addShapeBox(-5.5F, 0.5F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 307
        gunModel[221].setRotationPoint(14F, -42.5F, 5F);

        gunModel[222].addShapeBox(-3.5F, -0.5F, 0F, 5, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
        gunModel[222].setRotationPoint(14F, -42.5F, 5F);

        gunModel[223].addShapeBox(-5.5F, 0.5F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 309
        gunModel[223].setRotationPoint(14F, -42.5F, 6F);

        gunModel[224].addShapeBox(-9.5F, 0F, 11.5F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
        gunModel[224].setRotationPoint(1.5F, -42.5F, -6.5F);

        gunModel[225].addShapeBox(-9.5F, 0F, 11.5F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
        gunModel[225].setRotationPoint(1.5F, -43.5F, -6.5F);

        gunModel[226].addShapeBox(-9.5F, 0F, 11.5F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 316
        gunModel[226].setRotationPoint(1.5F, -39.5F, -6.5F);

        gunModel[227].addShapeBox(-11.5F, 0F, 10.5F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
        gunModel[227].setRotationPoint(1.5F, -42F, -6.5F);

        gunModel[228].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
        gunModel[228].setRotationPoint(68F, -34F, -6F);

        gunModel[229].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 354
        gunModel[229].setRotationPoint(68F, -34F, -7F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 355
        gunModel[230].setRotationPoint(74F, -34F, -7F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 356
        gunModel[231].setRotationPoint(78F, -34F, -7F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 357
        gunModel[232].setRotationPoint(82F, -34F, -7F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 358
        gunModel[233].setRotationPoint(90F, -34F, -7F);

        gunModel[234].addShapeBox(-6.5F, 0F, -1.5F, 4, 2, 5, 0F, -4F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
        gunModel[234].setRotationPoint(1.5F, -48F, -6.5F);

        gunModel[235].addShapeBox(-2.5F, 0F, -1.5F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.4F, 0F, 0F); // Box 363
        gunModel[235].setRotationPoint(1.5F, -40F, -6.5F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 2F, -2F, 1.5F, 2F, -2F, 0F, -0.5F, 0F); // Box 364
        gunModel[236].setRotationPoint(4F, -7.5F, -3.5F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 96, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
        gunModel[237].setRotationPoint(-1F, -43F, 4F);

        gunModel[238].addShapeBox(-3.5F, -1.5F, 0F, 5, 2, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 366
        gunModel[238].setRotationPoint(14F, -42.5F, 5F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        gunModel[239].setRotationPoint(40F, -43F, 4.01F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
        gunModel[240].setRotationPoint(41.5F, -40F, 4.01F);

        gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
        gunModel[241].setRotationPoint(44F, -37F, 4.01F);

        gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
        gunModel[242].setRotationPoint(40F, -40F, 4.01F);

        gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
        gunModel[243].setRotationPoint(9F, -41F, 4.01F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, -0.2019F, 2F, 0F, -0.2019F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 2F, -0.5F, 0.5F, 2F, 0F, 0F, 0F); // Box 363
        gunModel[244].setRotationPoint(-5.5F, -11F, -1.5F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 34, 2, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 364
        gunModel[245].setRotationPoint(68F, -34F, -2.5F);

        gunModel[246].addShapeBox(0F, 0F, 0F, 34, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 365
        gunModel[246].setRotationPoint(68F, -34F, 0.5F);

        gunModel[247].addShapeBox(0F, 0F, 0F, 34, 2, 2, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 366
        gunModel[247].setRotationPoint(68F, -31F, -2.5F);

        gunModel[248].addShapeBox(0F, 0F, 0F, 34, 2, 2, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 367
        gunModel[248].setRotationPoint(68F, -31F, 0.5F);

        gunModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 368
        gunModel[249].setRotationPoint(102F, -33.5F, -1F);

        gunModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 369
        gunModel[250].setRotationPoint(102F, -30F, -1F);

        gunModel[251].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 370
        gunModel[251].setRotationPoint(102F, -32.5F, -2F);

        gunModel[252].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 371
        gunModel[252].setRotationPoint(102F, -32.5F, 1.5F);

        gunModel[253].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 372
        gunModel[253].setRotationPoint(102F, -33.5F, 1F);

        gunModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 373
        gunModel[254].setRotationPoint(102F, -33.5F, -2F);

        gunModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
        gunModel[255].setRotationPoint(102F, -30.5F, -2F);

        gunModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 375
        gunModel[256].setRotationPoint(102F, -30.5F, 1F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
        gunModel[257].setRotationPoint(-1F, -46F, -9F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        gunModel[258].setRotationPoint(-1F, -46F, -8F);

        gunModel[259].addShapeBox(-2.5F, 0F, -2.5F, 5, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
        gunModel[259].setRotationPoint(1.5F, -40F, -6.5F);

        gunModel[260].addShapeBox(-3.5F, 0F, 1.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
        gunModel[260].setRotationPoint(1.5F, -43F, -6.5F);

        gunModel[261].addShapeBox(-6.5F, 0F, 1.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
        gunModel[261].setRotationPoint(1.5F, -40F, -6.5F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
        gunModel[262].setRotationPoint(4F, -40F, -5F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
        gunModel[263].setRotationPoint(-1F, -46F, -6F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
        gunModel[264].setRotationPoint(-1F, -46F, -7F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
        gunModel[265].setRotationPoint(2F, -46F, -7F);

        gunModel[266].addShapeBox(-2.5F, 0F, 1.5F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 399
        gunModel[266].setRotationPoint(1.5F, -40F, -6.5F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 467
        gunModel[267].setRotationPoint(78F, -44.5F, -5F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 469
        gunModel[268].setRotationPoint(66F, -44F, -5F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 63, 1, 1, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 470
        gunModel[269].setRotationPoint(4F, -45F, -5F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 68, 1, 1, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 471
        gunModel[270].setRotationPoint(-1F, -45F, 4F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 68, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 472
        gunModel[271].setRotationPoint(-1F, -44F, 4F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 95, 1, 8, 0F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0.9375F, 0F, 0F, 0.9375F, 0F, 0F, 0F, 0F, 0F); // Box 474
        gunModel[272].setRotationPoint(-1F, -46F, -4F);

        gunModel[273].addShapeBox(-11.5F, 0F, 2.5F, 9, 1, 8, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
        gunModel[273].setRotationPoint(1.5F, -46F, -6.5F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 397
        gunModel[274].setRotationPoint(74F, -35.5F, 4F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
        gunModel[275].setRotationPoint(54F, -33.5F, -3F);

        gunModel[276].addShapeBox(-2.5F, 0F, -2.5F, 5, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
        gunModel[276].setRotationPoint(1.5F, -48F, -6.5F);

        gunModel[277].addShapeBox(-2.5F, 0F, -1.5F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
        gunModel[277].setRotationPoint(1.5F, -48F, -6.5F);

        gunModel[278].addShapeBox(-2.5F, 0F, 1.5F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 486
        gunModel[278].setRotationPoint(1.5F, -48F, -6.5F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
        gunModel[279].setRotationPoint(45.5F, -37F, 4.01F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
        gunModel[280].setRotationPoint(47F, -37F, 4.01F);

        gunModel[281].addShapeBox(-5.5F, 0.5F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 497
        gunModel[281].setRotationPoint(46F, -43F, 6F);

        gunModel[282].addShapeBox(-5.5F, 0.5F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 498
        gunModel[282].setRotationPoint(46F, -43F, 5F);

        gunModel[283].addShapeBox(-3.5F, -0.5F, 0F, 5, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
        gunModel[283].setRotationPoint(46F, -43F, 5F);

        gunModel[284].addShapeBox(-3.5F, -1.5F, 0F, 5, 2, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 500
        gunModel[284].setRotationPoint(46F, -43F, 5F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[285].setRotationPoint(61F, -29F, 3.75F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 1F, 0F, -1F, -0.0625F, 0F, -1F, -0.0625F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, -0.5F, -0.5F, -0.03125F, -0.5F, -0.5F, -0.03125F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 35
        gunModel[286].setRotationPoint(78F, -45F, -5F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0.5F, 0F, -0.5F, -0.03125F, 0F, -0.5F, -0.03125F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 42
        gunModel[287].setRotationPoint(78F, -44.5F, -5F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 95, 1, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
        gunModel[288].setRotationPoint(-1F, -46F, -3F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 293
        gunModel[289].setRotationPoint(63F, -32.5F, 4F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 293
        gunModel[290].setRotationPoint(52.5F, -32F, 4F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 298
        gunModel[291].setRotationPoint(54.5F, -29F, 3.75F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 357
        gunModel[292].setRotationPoint(86F, -34F, -7F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 24, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F); // Box 44
        gunModel[293].setRotationPoint(72F, -26F, -3F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299
        gunModel[294].setRotationPoint(63F, -29.5F, 4F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[295].setRotationPoint(60.25F, -28.75F, 4F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[296].setRotationPoint(59.25F, -28.75F, 4F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[297].setRotationPoint(59.75F, -28.25F, 4F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[298].setRotationPoint(59.75F, -29.25F, 4F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[299].setRotationPoint(57.25F, -28.75F, 4F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[300].setRotationPoint(56.25F, -28.75F, 4F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[301].setRotationPoint(56.75F, -28.25F, 4F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[302].setRotationPoint(56.75F, -29.25F, 4F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
        gunModel[303].setRotationPoint(55.75F, -33F, 3.5F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[304].setRotationPoint(60F, -33.75F, 3.75F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[305].setRotationPoint(59F, -33.75F, 3.75F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[306].setRotationPoint(59.5F, -33.25F, 3.75F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[307].setRotationPoint(59.5F, -34.25F, 3.75F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[308].setRotationPoint(57.5F, -33.75F, 3.75F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[309].setRotationPoint(56.5F, -33.75F, 3.75F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[310].setRotationPoint(57F, -33.25F, 3.75F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[311].setRotationPoint(57F, -34.25F, 3.75F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
        gunModel[312].setRotationPoint(62.5F, -21.5F, 2F);
        gunModel[312].rotateAngleZ = -0.39269908F;

        gunModel[313].addShapeBox(0F, 3F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 92
        gunModel[313].setRotationPoint(62.5F, -21.5F, 2F);
        gunModel[313].rotateAngleZ = -0.39269908F;

        gunModel[314].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F, -1.5F, 5F, 0F, 1.5F, 5F, 0F, 1.5F, 5F, 0F, -1.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        gunModel[314].setRotationPoint(21F, -3F, -5F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, 8.5F, 0F, 0F); // Box 140
        gunModel[315].setRotationPoint(31F, -32F, 4F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[316].setRotationPoint(31F, -33F, 4F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, 8.5F, 0F, 0F); // Box 140
        gunModel[317].setRotationPoint(31F, -32F, -5F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 58, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[318].setRotationPoint(37F, -35F, 3F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[319].setRotationPoint(31F, -35F, 4F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 59, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[320].setRotationPoint(36F, -33F, -4F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[321].setRotationPoint(31F, -33F, -5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 58, 2, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[322].setRotationPoint(37F, -35F, -4F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        gunModel[323].setRotationPoint(31F, -35F, -5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 24, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 162
        gunModel[324].setRotationPoint(29F, -37F, -5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        gunModel[325].setRotationPoint(95F, -35F, 2F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        gunModel[326].setRotationPoint(95F, -35F, -4F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[327].setRotationPoint(76.25F, -31.75F, 4.25F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[328].setRotationPoint(75.25F, -31.75F, 4.25F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[329].setRotationPoint(75.75F, -31.25F, 4.25F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[330].setRotationPoint(75.75F, -32.25F, 4.25F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[331].setRotationPoint(91.25F, -31.75F, 4.2F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[332].setRotationPoint(90.25F, -31.75F, 4.2F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[333].setRotationPoint(90.75F, -31.25F, 4.2F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[334].setRotationPoint(90.75F, -32.25F, 4.2F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[335].setRotationPoint(74.25F, -31.75F, 4F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[336].setRotationPoint(74.25F, -33.25F, 4F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 298
        gunModel[337].setRotationPoint(74.25F, -30.25F, 4F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[338].setRotationPoint(76.25F, -31.75F, 4F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[339].setRotationPoint(89.25F, -31.75F, 4F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[340].setRotationPoint(89.25F, -33.25F, 4F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 298
        gunModel[341].setRotationPoint(89.25F, -30.25F, 4F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[342].setRotationPoint(91.25F, -31.75F, 4F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[343].setRotationPoint(63.25F, -43.75F, 4.5F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, 0F, 1F, -1.25F, 0F, 1F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[344].setRotationPoint(63.25F, -45.25F, 4.5F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 298
        gunModel[345].setRotationPoint(63.25F, -42.25F, 4.5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[346].setRotationPoint(65.25F, -43.75F, 4.5F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[347].setRotationPoint(65.25F, -43.75F, 4.75F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[348].setRotationPoint(64.25F, -43.75F, 4.75F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 298
        gunModel[349].setRotationPoint(64.75F, -44.25F, 4.75F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[350].setRotationPoint(64.75F, -43.25F, 4.75F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[351].setRotationPoint(64.75F, -43.25F, 4.75F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[352].setRotationPoint(64.75F, -44.25F, 4.75F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[353].setRotationPoint(64.75F, -43.25F, 4.75F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[354].setRotationPoint(64.75F, -44.25F, 4.75F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 298
        gunModel[355].setRotationPoint(52.25F, -39.25F, 4.5F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[356].setRotationPoint(54.25F, -40.75F, 4.5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[357].setRotationPoint(54.25F, -40.75F, 4.75F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[358].setRotationPoint(53.25F, -40.75F, 4.75F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 298
        gunModel[359].setRotationPoint(53.75F, -41.25F, 4.75F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[360].setRotationPoint(53.75F, -40.25F, 4.75F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[361].setRotationPoint(53.75F, -40.25F, 4.75F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[362].setRotationPoint(53.75F, -41.25F, 4.75F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[363].setRotationPoint(53.75F, -40.25F, 4.75F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[364].setRotationPoint(53.75F, -41.25F, 4.75F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[365].setRotationPoint(52.25F, -40.75F, 4.5F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[366].setRotationPoint(52.25F, -42.25F, 4.5F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 298
        gunModel[367].setRotationPoint(46.25F, -19.25F, 3.5F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[368].setRotationPoint(48.25F, -20.75F, 3.5F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[369].setRotationPoint(48.25F, -20.75F, 3.75F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[370].setRotationPoint(47.25F, -20.75F, 3.75F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 298
        gunModel[371].setRotationPoint(47.75F, -21.25F, 3.75F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[372].setRotationPoint(47.75F, -20.25F, 3.75F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[373].setRotationPoint(47.75F, -20.25F, 3.75F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[374].setRotationPoint(47.75F, -21.25F, 3.75F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[375].setRotationPoint(47.75F, -20.25F, 3.75F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[376].setRotationPoint(47.75F, -21.25F, 3.75F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[377].setRotationPoint(46.25F, -20.75F, 3.5F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[378].setRotationPoint(46.25F, -22.25F, 3.5F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 298
        gunModel[379].setRotationPoint(41.25F, -6.25F, 3.5F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[380].setRotationPoint(43.25F, -7.75F, 3.5F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[381].setRotationPoint(43.25F, -7.75F, 3.75F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[382].setRotationPoint(42.25F, -7.75F, 3.75F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 298
        gunModel[383].setRotationPoint(42.75F, -8.25F, 3.75F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[384].setRotationPoint(42.75F, -7.25F, 3.75F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[385].setRotationPoint(42.75F, -7.25F, 3.75F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[386].setRotationPoint(42.75F, -8.25F, 3.75F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[387].setRotationPoint(42.75F, -7.25F, 3.75F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[388].setRotationPoint(42.75F, -8.25F, 3.75F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 298
        gunModel[389].setRotationPoint(41.25F, -7.75F, 3.5F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[390].setRotationPoint(41.25F, -9.25F, 3.5F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 298
        gunModel[391].setRotationPoint(73.25F, -42.75F, 5F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[392].setRotationPoint(75.5F, -41F, 5F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[393].setRotationPoint(73F, -41F, 5F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 298
        gunModel[394].setRotationPoint(73.25F, -39.25F, 5F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[395].setRotationPoint(75.5F, -41F, 5.25F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[396].setRotationPoint(74F, -41F, 5.25F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 298
        gunModel[397].setRotationPoint(74.75F, -41.75F, 5.25F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 298
        gunModel[398].setRotationPoint(74.75F, -40.25F, 5.25F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[399].setRotationPoint(74.5F, -40.25F, 5.25F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[400].setRotationPoint(74.5F, -41.75F, 5.25F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[401].setRotationPoint(75F, -40.25F, 5.25F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[402].setRotationPoint(75F, -41.75F, 5.25F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 298
        gunModel[403].setRotationPoint(32.25F, -43F, 5F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[404].setRotationPoint(34.5F, -41.25F, 5F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[405].setRotationPoint(32F, -41.25F, 5F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 298
        gunModel[406].setRotationPoint(32.25F, -39.5F, 5F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[407].setRotationPoint(34.5F, -41.25F, 5.25F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[408].setRotationPoint(33F, -41.25F, 5.25F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 298
        gunModel[409].setRotationPoint(33.75F, -42F, 5.25F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 298
        gunModel[410].setRotationPoint(33.75F, -40.5F, 5.25F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[411].setRotationPoint(33.5F, -40.5F, 5.25F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[412].setRotationPoint(33.5F, -42F, 5.25F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[413].setRotationPoint(34F, -40.5F, 5.25F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[414].setRotationPoint(34F, -42F, 5.25F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 298
        gunModel[415].setRotationPoint(35.25F, -4.75F, 4F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[416].setRotationPoint(37.5F, -3F, 4F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[417].setRotationPoint(35F, -3F, 4F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 298
        gunModel[418].setRotationPoint(35.25F, -1.25F, 4F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[419].setRotationPoint(37.5F, -3F, 4.25F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[420].setRotationPoint(36F, -3F, 4.25F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 298
        gunModel[421].setRotationPoint(36.75F, -3.75F, 4.25F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 298
        gunModel[422].setRotationPoint(36.75F, -2.25F, 4.25F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[423].setRotationPoint(36.5F, -2.25F, 4.25F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[424].setRotationPoint(36.5F, -3.75F, 4.25F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[425].setRotationPoint(37F, -2.25F, 4.25F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[426].setRotationPoint(37F, -3.75F, 4.25F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 298
        gunModel[427].setRotationPoint(20.25F, -4.75F, 4.7F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[428].setRotationPoint(22.5F, -3F, 4.7F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[429].setRotationPoint(20F, -3F, 4.7F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 298
        gunModel[430].setRotationPoint(20.25F, -1.25F, 4.7F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[431].setRotationPoint(22.5F, -3F, 4.95F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[432].setRotationPoint(21F, -3F, 4.95F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 298
        gunModel[433].setRotationPoint(21.75F, -3.75F, 4.95F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 298
        gunModel[434].setRotationPoint(21.75F, -2.25F, 4.95F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[435].setRotationPoint(21.5F, -2.25F, 4.95F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[436].setRotationPoint(21.5F, -3.75F, 4.95F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[437].setRotationPoint(22F, -2.25F, 4.95F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[438].setRotationPoint(22F, -3.75F, 4.95F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 298
        gunModel[439].setRotationPoint(73.25F, -42.75F, -6F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[440].setRotationPoint(75.5F, -41F, -6F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 298
        gunModel[441].setRotationPoint(73F, -41F, -6F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 298
        gunModel[442].setRotationPoint(73.25F, -39.25F, -6F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[443].setRotationPoint(75.5F, -41F, -6.25F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[444].setRotationPoint(74F, -41F, -6.25F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 298
        gunModel[445].setRotationPoint(74.75F, -41.75F, -6.25F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 298
        gunModel[446].setRotationPoint(74.75F, -40.25F, -6.25F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[447].setRotationPoint(74.5F, -40.25F, -6.25F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[448].setRotationPoint(74.5F, -41.75F, -6.25F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[449].setRotationPoint(75F, -40.25F, -6.25F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[450].setRotationPoint(75F, -41.75F, -6.25F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 298
        gunModel[451].setRotationPoint(32.25F, -43F, -6F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[452].setRotationPoint(34.5F, -41.25F, -6F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 298
        gunModel[453].setRotationPoint(32F, -41.25F, -6F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 298
        gunModel[454].setRotationPoint(32.25F, -39.5F, -6F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[455].setRotationPoint(34.5F, -41.25F, -6.25F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[456].setRotationPoint(33F, -41.25F, -6.25F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 298
        gunModel[457].setRotationPoint(33.75F, -42F, -6.25F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 298
        gunModel[458].setRotationPoint(33.75F, -40.5F, -6.25F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[459].setRotationPoint(33.5F, -40.5F, -6.25F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[460].setRotationPoint(33.5F, -42F, -6.25F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[461].setRotationPoint(34F, -40.5F, -6.25F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[462].setRotationPoint(34F, -42F, -6.25F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 298
        gunModel[463].setRotationPoint(20.25F, -4.75F, -5.7F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 298
        gunModel[464].setRotationPoint(22.5F, -3F, -5.7F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 298
        gunModel[465].setRotationPoint(20F, -3F, -5.7F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 298
        gunModel[466].setRotationPoint(20.25F, -1.25F, -5.7F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[467].setRotationPoint(22.5F, -3F, -5.95F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[468].setRotationPoint(21F, -3F, -5.95F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 298
        gunModel[469].setRotationPoint(21.75F, -3.75F, -5.95F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 298
        gunModel[470].setRotationPoint(21.75F, -2.25F, -5.95F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
        gunModel[471].setRotationPoint(21.5F, -2.25F, -5.95F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[472].setRotationPoint(21.5F, -3.75F, -5.95F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 298
        gunModel[473].setRotationPoint(22F, -2.25F, -5.95F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 298
        gunModel[474].setRotationPoint(22F, -3.75F, -5.95F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 294
        gunModel[475].setRotationPoint(61.5F, -33.5F, 5F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 294
        gunModel[476].setRotationPoint(62.5F, -33.5F, 5F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.9F, 0F, -0.5F, -0.9F); // Box 294
        gunModel[477].setRotationPoint(63.5F, -33.5F, 5F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        gunModel[478].setRotationPoint(53F, -33F, 5F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        gunModel[479].setRotationPoint(54F, -33F, 5F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        gunModel[480].setRotationPoint(55F, -33F, 5F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        gunModel[481].setRotationPoint(56F, -33F, 5F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.9F, 0F, -0.5F, -0.9F); // Box 292
        gunModel[482].setRotationPoint(57F, -33F, 5F);

        gunModel[483].addShapeBox(-3F, 0F, 10.5F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 225
        gunModel[483].setRotationPoint(1.5F, -44F, -6.5F);

        gunModel[484].addShapeBox(-3F, 0F, 10.5F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 226
        gunModel[484].setRotationPoint(1.5F, -40F, -6.5F);

        gunModel[485].addShapeBox(0F, 0.5F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 92
        gunModel[485].setRotationPoint(62.5F, -21.5F, 4F);
        gunModel[485].rotateAngleZ = -0.39269908F;

        gunModel[486].addShapeBox(0F, 1.5F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 92
        gunModel[486].setRotationPoint(62.5F, -21.5F, 4F);
        gunModel[486].rotateAngleZ = -0.39269908F;

        gunModel[487].addShapeBox(0F, 2.5F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 92
        gunModel[487].setRotationPoint(62.5F, -21.5F, 4F);
        gunModel[487].rotateAngleZ = -0.39269908F;

        gunModel[488].addShapeBox(0F, 3.5F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F); // Box 92
        gunModel[488].setRotationPoint(62.5F, -21.5F, 4F);
        gunModel[488].rotateAngleZ = -0.39269908F;

        gunModel[489].addShapeBox(-9.5F, 0F, 12.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.9F, 0F, 0F, -0.9F); // Box 314
        gunModel[489].setRotationPoint(1.5F, -42.5F, -6.5F);

        gunModel[490].addShapeBox(-7.5F, 0F, 12.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 314
        gunModel[490].setRotationPoint(1.5F, -43.5F, -6.5F);

        gunModel[491].addShapeBox(-5.5F, 0F, 12.5F, 1, 3, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 1F, -0.9F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 1F, -0.9F); // Box 314
        gunModel[491].setRotationPoint(1.5F, -42.5F, -6.5F);

        gunModel[492].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 365
        gunModel[492].setRotationPoint(41F, -45F, 4F);

        gunModel[493].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 365
        gunModel[493].setRotationPoint(9F, -45F, 4F);

        gunModel[494].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 365
        gunModel[494].setRotationPoint(41F, -45F, -5F);

        gunModel[495].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 365
        gunModel[495].setRotationPoint(9F, -45F, -5F);

        gunModel[496].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 521
        gunModel[496].setRotationPoint(47.5F, -43F, 5F);

        gunModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 521
        gunModel[497].setRotationPoint(43.5F, -44.25F, 5F);
        gunModel[497].rotateAngleZ = -0.97738438F;

        gunModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 521
        gunModel[498].setRotationPoint(15.5F, -43F, 5F);

        gunModel[499].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 521
        gunModel[499].setRotationPoint(11.5F, -44.25F, 5F);
        gunModel[499].rotateAngleZ = -0.97738438F;
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 298
        gunModel[501] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box 298
        gunModel[502] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 298
        gunModel[503] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 298
        gunModel[504] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 298
        gunModel[505] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 298
        gunModel[506] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 298
        gunModel[507] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 298
        gunModel[508] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 302
        gunModel[509] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[510] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[511] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[512] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[513] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[514] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[515] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[516] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[517] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[518] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[519] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[520] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 298
        gunModel[521] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 298
        gunModel[522] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 298
        gunModel[523] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 298
        gunModel[524] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 298
        gunModel[525] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 298
        gunModel[526] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 298
        gunModel[527] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 298
        gunModel[528] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 298
        gunModel[529] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 298
        gunModel[530] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 298
        gunModel[531] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 298
        gunModel[532] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 298
        gunModel[533] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 298
        gunModel[534] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 298
        gunModel[535] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 298
        gunModel[536] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 298
        gunModel[537] = new ModelRendererTurbo(this, 58, 272, textureX, textureY); // Box 353
        gunModel[538] = new ModelRendererTurbo(this, 33, 272, textureX, textureY); // Box 354
        gunModel[539] = new ModelRendererTurbo(this, 1, 272, textureX, textureY); // Box 355
        gunModel[540] = new ModelRendererTurbo(this, 49, 272, textureX, textureY); // Box 356
        gunModel[541] = new ModelRendererTurbo(this, 11, 272, textureX, textureY); // Box 357
        gunModel[542] = new ModelRendererTurbo(this, 33, 282, textureX, textureY); // Box 358
        gunModel[543] = new ModelRendererTurbo(this, 1, 282, textureX, textureY); // Box 357

        gunModel[500].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[500].setRotationPoint(46F, -43F, 5.25F);

        gunModel[501].addShapeBox(-1F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[501].setRotationPoint(46F, -43F, 5.25F);

        gunModel[502].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[502].setRotationPoint(46F, -43F, 5.25F);

        gunModel[503].addShapeBox(-0.5F, -1F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[503].setRotationPoint(46F, -43F, 5.25F);

        gunModel[504].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[504].setRotationPoint(14F, -42.5F, 5.25F);

        gunModel[505].addShapeBox(-1F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[505].setRotationPoint(14F, -42.5F, 5.25F);

        gunModel[506].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[506].setRotationPoint(14F, -42.5F, 5.25F);

        gunModel[507].addShapeBox(-0.5F, -1F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[507].setRotationPoint(14F, -42.5F, 5.25F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 4F, 0F, 0F, 0F); // Box 302
        gunModel[508].setRotationPoint(53F, -44F, -5F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[509].setRotationPoint(74.25F, -41.5F, 4.75F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[510].setRotationPoint(64.25F, -44.25F, 4.25F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[511].setRotationPoint(53.25F, -41.25F, 4.25F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[512].setRotationPoint(53.25F, -41.25F, 4.25F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[513].setRotationPoint(33.25F, -41.75F, 4.25F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[514].setRotationPoint(47.25F, -21.25F, 3.25F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[515].setRotationPoint(42.25F, -8.25F, 3.25F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[516].setRotationPoint(36.25F, -3.5F, 3.25F);

        gunModel[517].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[517].setRotationPoint(21.25F, -3.5F, 4.25F);

        gunModel[518].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[518].setRotationPoint(74.25F, -41.5F, -5.75F);

        gunModel[519].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[519].setRotationPoint(33.25F, -41.75F, -5.25F);

        gunModel[520].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        gunModel[520].setRotationPoint(21.25F, -3.5F, -5.25F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[521].setRotationPoint(76.25F, -31.75F, -5.25F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[522].setRotationPoint(75.25F, -31.75F, -5.25F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[523].setRotationPoint(75.75F, -31.25F, -5.25F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[524].setRotationPoint(75.75F, -32.25F, -5.25F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[525].setRotationPoint(91.25F, -31.75F, -5.3F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[526].setRotationPoint(90.25F, -31.75F, -5.3F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 298
        gunModel[527].setRotationPoint(90.75F, -31.25F, -5.3F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F); // Box 298
        gunModel[528].setRotationPoint(90.75F, -32.25F, -5.3F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[529].setRotationPoint(74.25F, -33.25F, -5F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 298
        gunModel[530].setRotationPoint(74.25F, -30.25F, -5F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[531].setRotationPoint(76.25F, -31.75F, -5F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[532].setRotationPoint(89.25F, -33.25F, -5F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 298
        gunModel[533].setRotationPoint(89.25F, -30.25F, -5F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 298
        gunModel[534].setRotationPoint(91.25F, -31.75F, -5F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[535].setRotationPoint(74.25F, -31.75F, -5F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
        gunModel[536].setRotationPoint(89.25F, -31.75F, -5F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 353
        gunModel[537].setRotationPoint(68F, -34F, 5F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
        gunModel[538].setRotationPoint(68F, -34F, 6F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
        gunModel[539].setRotationPoint(74F, -34F, 6F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        gunModel[540].setRotationPoint(78F, -34F, 6F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
        gunModel[541].setRotationPoint(82F, -34F, 6F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
        gunModel[542].setRotationPoint(90F, -34F, 6F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
        gunModel[543].setRotationPoint(86F, -34F, 6F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 170, 270, textureX, textureY); // Import
        defaultScopeModel[1] = new ModelRendererTurbo(this, 220, 270, textureX, textureY); // Import
        defaultScopeModel[2] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import
        defaultScopeModel[3] = new ModelRendererTurbo(this, 150, 270, textureX, textureY); // Import
        defaultScopeModel[4] = new ModelRendererTurbo(this, 130, 270, textureX, textureY); // Import
        defaultScopeModel[5] = new ModelRendererTurbo(this, 260, 270, textureX, textureY); // Import
        defaultScopeModel[6] = new ModelRendererTurbo(this, 240, 270, textureX, textureY); // Import
        defaultScopeModel[7] = new ModelRendererTurbo(this, 280, 270, textureX, textureY); // Import
        defaultScopeModel[8] = new ModelRendererTurbo(this, 160, 240, textureX, textureY); // Import
        defaultScopeModel[9] = new ModelRendererTurbo(this, 460, 330, textureX, textureY); // Import
        defaultScopeModel[10] = new ModelRendererTurbo(this, 300, 270, textureX, textureY); // Import
        defaultScopeModel[11] = new ModelRendererTurbo(this, 460, 270, textureX, textureY); // Import
        defaultScopeModel[12] = new ModelRendererTurbo(this, 440, 270, textureX, textureY); // Import
        defaultScopeModel[13] = new ModelRendererTurbo(this, 320, 270, textureX, textureY); // Import
        defaultScopeModel[14] = new ModelRendererTurbo(this, 370, 240, textureX, textureY); // Import
        defaultScopeModel[15] = new ModelRendererTurbo(this, 300, 240, textureX, textureY); // Import
        defaultScopeModel[16] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Import
        defaultScopeModel[17] = new ModelRendererTurbo(this, 80, 240, textureX, textureY); // Import
        defaultScopeModel[18] = new ModelRendererTurbo(this, 340, 240, textureX, textureY); // Import
        defaultScopeModel[19] = new ModelRendererTurbo(this, 120, 240, textureX, textureY); // Import
        defaultScopeModel[20] = new ModelRendererTurbo(this, 180, 240, textureX, textureY); // Import
        defaultScopeModel[21] = new ModelRendererTurbo(this, 220, 240, textureX, textureY); // Import
        defaultScopeModel[22] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import
        defaultScopeModel[23] = new ModelRendererTurbo(this, 140, 240, textureX, textureY); // Import
        defaultScopeModel[24] = new ModelRendererTurbo(this, 340, 270, textureX, textureY); // Import
        defaultScopeModel[25] = new ModelRendererTurbo(this, 360, 270, textureX, textureY); // Import
        defaultScopeModel[26] = new ModelRendererTurbo(this, 380, 270, textureX, textureY); // Import
        defaultScopeModel[27] = new ModelRendererTurbo(this, 280, 240, textureX, textureY); // Import
        defaultScopeModel[28] = new ModelRendererTurbo(this, 260, 240, textureX, textureY); // Import
        defaultScopeModel[29] = new ModelRendererTurbo(this, 240, 240, textureX, textureY); // Import
        defaultScopeModel[30] = new ModelRendererTurbo(this, 480, 310, textureX, textureY); // Import
        defaultScopeModel[31] = new ModelRendererTurbo(this, 480, 290, textureX, textureY); // Import
        defaultScopeModel[32] = new ModelRendererTurbo(this, 400, 270, textureX, textureY); // Import
        defaultScopeModel[33] = new ModelRendererTurbo(this, 420, 270, textureX, textureY); // Import
        defaultScopeModel[34] = new ModelRendererTurbo(this, 480, 330, textureX, textureY); // Import
        defaultScopeModel[35] = new ModelRendererTurbo(this, 480, 350, textureX, textureY); // Import

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[0].setRotationPoint(4F, -49F, -4F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[1].setRotationPoint(4F, -48F, -4F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[2].setRotationPoint(4F, -48F, 3F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import
        defaultScopeModel[3].setRotationPoint(4F, -51F, -4F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[4].setRotationPoint(4F, -51F, 2F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[5].setRotationPoint(4F, -51F, -2.5F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[6].setRotationPoint(4F, -50F, -2.5F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[7].setRotationPoint(4F, -52F, -2.5F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[8].setRotationPoint(84.5F, -58F, -0.5F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[9].setRotationPoint(5F, -60.5F, -0.5F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[10].setRotationPoint(4F, -56F, -2.5F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[11].setRotationPoint(5F, -58.5F, -2.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[12].setRotationPoint(5F, -58.5F, 1.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[13].setRotationPoint(4F, -56.5F, -2.5F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[14].setRotationPoint(83F, -48F, -4F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[15].setRotationPoint(83F, -49F, -4F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[16].setRotationPoint(83F, -51F, -4F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[17].setRotationPoint(83F, -51F, 2F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[18].setRotationPoint(83F, -48F, 3F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[19].setRotationPoint(83F, -55F, -2F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[20].setRotationPoint(83F, -52F, -2F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[21].setRotationPoint(83F, -50F, -2F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[22].setRotationPoint(83F, -51F, -2F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[23].setRotationPoint(83F, -56F, -2F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[24].setRotationPoint(6.5F, -49F, -7F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[25].setRotationPoint(6.5F, -48F, -6.5F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[26].setRotationPoint(6.5F, -47F, -7F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[27].setRotationPoint(85.5F, -47F, -7F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[28].setRotationPoint(85.5F, -48F, -6.5F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[29].setRotationPoint(85.5F, -49F, -7F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        defaultScopeModel[30].setRotationPoint(5F, -60.5F, -2.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); // Import
        defaultScopeModel[31].setRotationPoint(5F, -60.5F, 0.5F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        defaultScopeModel[32].setRotationPoint(5F, -57.5F, 1.5F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); // Import
        defaultScopeModel[33].setRotationPoint(5F, -57.5F, -2.5F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[34].setRotationPoint(4.99F, -58.5F, 1.6F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F); // Import
        defaultScopeModel[35].setRotationPoint(4.99F, -58.5F, -2.4F);
    }

    private void initdefaultStockModel_1() {
        defaultStockModel[0] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 93
        defaultStockModel[1] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 114
        defaultStockModel[2] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 151
        defaultStockModel[3] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 152
        defaultStockModel[4] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 228
        defaultStockModel[5] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 230
        defaultStockModel[6] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 231
        defaultStockModel[7] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 232
        defaultStockModel[8] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 233
        defaultStockModel[9] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 234
        defaultStockModel[10] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 236
        defaultStockModel[11] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 237
        defaultStockModel[12] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 238
        defaultStockModel[13] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 239
        defaultStockModel[14] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 240
        defaultStockModel[15] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 242
        defaultStockModel[16] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 244
        defaultStockModel[17] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 245
        defaultStockModel[18] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 246
        defaultStockModel[19] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 247
        defaultStockModel[20] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 248
        defaultStockModel[21] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 249
        defaultStockModel[22] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 250
        defaultStockModel[23] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 251
        defaultStockModel[24] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 252
        defaultStockModel[25] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 253
        defaultStockModel[26] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 254
        defaultStockModel[27] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 255
        defaultStockModel[28] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 257
        defaultStockModel[29] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 258
        defaultStockModel[30] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 259
        defaultStockModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 260
        defaultStockModel[32] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 261
        defaultStockModel[33] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 262
        defaultStockModel[34] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 263
        defaultStockModel[35] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 264
        defaultStockModel[36] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 265
        defaultStockModel[37] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 266
        defaultStockModel[38] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 267
        defaultStockModel[39] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 268
        defaultStockModel[40] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 269
        defaultStockModel[41] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 270
        defaultStockModel[42] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 271
        defaultStockModel[43] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 272
        defaultStockModel[44] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 273
        defaultStockModel[45] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 390
        defaultStockModel[46] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 466

        defaultStockModel[0].addShapeBox(-13.5F, 0F, 3.5F, 2, 1, 6, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F); // Box 93
        defaultStockModel[0].setRotationPoint(1.5F, -45.5F, -6.5F);

        defaultStockModel[1].addShapeBox(-13.5F, 0F, 2F, 2, 5, 9, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Box 114
        defaultStockModel[1].setRotationPoint(1.5F, -43F, -6.5F);

        defaultStockModel[2].addShapeBox(-13.5F, 1.5F, 2F, 2, 1, 9, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 151
        defaultStockModel[2].setRotationPoint(1.5F, -46F, -6.5F);

        defaultStockModel[3].addShapeBox(-13.5F, 0F, 3F, 2, 1, 7, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 152
        defaultStockModel[3].setRotationPoint(1.5F, -37.5F, -6.5F);

        defaultStockModel[4].addShapeBox(-41.5F, 0F, 3F, 26, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 228
        defaultStockModel[4].setRotationPoint(1.5F, -37.5F, -6.5F);

        defaultStockModel[5].addShapeBox(-42.5F, 0F, 3F, 2, 4, 7, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 3F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 3F, 0F); // Box 230
        defaultStockModel[5].setRotationPoint(1.5F, -42F, -6.5F);

        defaultStockModel[6].addShapeBox(-40.5F, 0F, 3F, 25, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
        defaultStockModel[6].setRotationPoint(1.5F, -42F, -6.5F);

        defaultStockModel[7].addShapeBox(-46F, 0F, 3F, 1, 6, 7, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F); // Box 232
        defaultStockModel[7].setRotationPoint(1.5F, -41F, -6.5F);

        defaultStockModel[8].addShapeBox(-48F, 0F, 3F, 6, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7857F, 0F, 0F, -1.7857F, 0F, 0F, -1.7857F, 0F, 0F, 1.7857F, 0F, 0F); // Box 233
        defaultStockModel[8].setRotationPoint(1.5F, -35F, -6.5F);

        defaultStockModel[9].addShapeBox(-44.5F, 0F, 3F, 29, 1, 7, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        defaultStockModel[9].setRotationPoint(1.5F, -43F, -6.5F);

        defaultStockModel[10].addShapeBox(-47F, 0F, 3F, 1, 6, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 236
        defaultStockModel[10].setRotationPoint(1.5F, -41F, -6.5F);

        defaultStockModel[11].addShapeBox(-49F, 0F, 3F, 1, 5, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.7857F, 0F, -1F, -1.7857F, 0F, 0F, -1.7857F, 0F, 0F, 1.7857F, 0F, -1F); // Box 237
        defaultStockModel[11].setRotationPoint(1.5F, -35F, -6.5F);

        defaultStockModel[12].addShapeBox(-60.5F, 0F, 5F, 16, 7, 3, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
        defaultStockModel[12].setRotationPoint(1.5F, -35F, -6.5F);

        defaultStockModel[13].addShapeBox(-15.5F, 0F, 3F, 2, 4, 7, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 239
        defaultStockModel[13].setRotationPoint(1.5F, -42F, -6.5F);

        defaultStockModel[14].addShapeBox(-15.5F, 0F, 4.5F, 2, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, 2.5F, 0F, -1.5F, 2.5F, 0F, 0F, 1.5F); // Box 240
        defaultStockModel[14].setRotationPoint(1.5F, -43F, -6.5F);

        defaultStockModel[15].addShapeBox(-15.5F, 0F, 3.5F, 2, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 242
        defaultStockModel[15].setRotationPoint(1.5F, -37.5F, -6.5F);

        defaultStockModel[16].addShapeBox(-60.5F, 0F, 3F, 16, 7, 2, 0F, 0F, -2F, 0F, 1.7857F, -2F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.7143F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        defaultStockModel[16].setRotationPoint(1.5F, -35F, -6.5F);

        defaultStockModel[17].addShapeBox(-60.5F, 0F, 8F, 16, 7, 2, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 1.7857F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7143F, -2F, 0F, 0F, -2F, 0F); // Box 245
        defaultStockModel[17].setRotationPoint(1.5F, -35F, -6.5F);

        defaultStockModel[18].addShapeBox(-60F, 0F, 8F, 8, 7, 2, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 1.7857F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7143F, -2F, 0F, 0F, -2F, 0F); // Box 246
        defaultStockModel[18].setRotationPoint(1.5F, -14F, -6.5F);

        defaultStockModel[19].addShapeBox(-60F, 0F, 3F, 8, 7, 2, 0F, 0F, -2F, 0F, 1.7857F, -2F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.7143F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
        defaultStockModel[19].setRotationPoint(1.5F, -14F, -6.5F);

        defaultStockModel[20].addShapeBox(-60F, 0F, 5F, 8, 7, 3, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
        defaultStockModel[20].setRotationPoint(1.5F, -14F, -6.5F);

        defaultStockModel[21].addShapeBox(-51F, 7F, 5F, 6, 14, 3, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 5F, 0F, 0F); // Box 249
        defaultStockModel[21].setRotationPoint(1.5F, -35F, -6.5F);

        defaultStockModel[22].addShapeBox(-57.5F, 0F, 5F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 250
        defaultStockModel[22].setRotationPoint(1.5F, -28F, -6.5F);

        defaultStockModel[23].addShapeBox(-53.5F, 0F, 5F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 251
        defaultStockModel[23].setRotationPoint(1.5F, -26F, -6.5F);

        defaultStockModel[24].addShapeBox(-57F, 0F, 5F, 3, 2, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
        defaultStockModel[24].setRotationPoint(1.5F, -16F, -6.5F);

        defaultStockModel[25].addShapeBox(-53F, 0F, 5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 253
        defaultStockModel[25].setRotationPoint(1.5F, -7F, -6.5F);

        defaultStockModel[26].addShapeBox(-60F, 0F, 5F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 254
        defaultStockModel[26].setRotationPoint(1.5F, -2F, -6.5F);

        defaultStockModel[27].addShapeBox(-60F, 0F, 5F, 6, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 255
        defaultStockModel[27].setRotationPoint(1.5F, -7F, -6.5F);

        defaultStockModel[28].addShapeBox(-54F, 0F, 5F, 1, 3, 3, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
        defaultStockModel[28].setRotationPoint(1.5F, -7.5F, -6.5F);

        defaultStockModel[29].addShapeBox(-60.5F, 0F, 5F, 2, 2, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
        defaultStockModel[29].setRotationPoint(1.5F, -5.25F, -6.5F);

        defaultStockModel[30].addShapeBox(-60.5F, 0F, 5F, 3, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 259
        defaultStockModel[30].setRotationPoint(1.5F, -3.25F, -6.5F);

        defaultStockModel[31].addShapeBox(-44F, 0F, 4.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 1.0714F, 0F, 0F, 1.4286F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.3571F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 260
        defaultStockModel[31].setRotationPoint(1.5F, -32.5F, -6.5F);

        defaultStockModel[32].addShapeBox(-44F, 0F, 5.5F, 1, 4, 2, 0F, 0F, 0F, 0F, 1.4286F, 0F, 0F, 1.4286F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        defaultStockModel[32].setRotationPoint(1.5F, -33.5F, -6.5F);

        defaultStockModel[33].addShapeBox(-44F, 0F, 7.5F, 1, 2, 1, 0F, 0F, 1F, 0F, 1.4286F, 1F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.3571F, 0F, 0F, 0F, 0F, 0F); // Box 262
        defaultStockModel[33].setRotationPoint(1.5F, -32.5F, -6.5F);

        defaultStockModel[34].addShapeBox(-51.5F, 0F, 7.5F, 1, 2, 1, 0F, 0F, 1F, 0F, 1.4286F, 1F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.3571F, 0F, 0F, 0F, 0F, 0F); // Box 263
        defaultStockModel[34].setRotationPoint(1.5F, -11.5F, -6.5F);

        defaultStockModel[35].addShapeBox(-51.5F, 0F, 5.5F, 1, 4, 2, 0F, 0F, 0F, 0F, 1.4286F, 0F, 0F, 1.4286F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
        defaultStockModel[35].setRotationPoint(1.5F, -12.5F, -6.5F);

        defaultStockModel[36].addShapeBox(-51.5F, 0F, 4.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 1.0714F, 0F, 0F, 1.4286F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.3571F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 265
        defaultStockModel[36].setRotationPoint(1.5F, -11.5F, -6.5F);

        defaultStockModel[37].addShapeBox(-62F, 0F, 4.5F, 2, 37, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 266
        defaultStockModel[37].setRotationPoint(1.5F, -36.5F, -6.5F);

        defaultStockModel[38].addShapeBox(-62F, 0F, 8.5F, 2, 37, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 267
        defaultStockModel[38].setRotationPoint(1.5F, -36.5F, -6.5F);

        defaultStockModel[39].addShapeBox(-62F, 0F, 1.5F, 2, 37, 3, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 268
        defaultStockModel[39].setRotationPoint(1.5F, -36.5F, -6.5F);

        defaultStockModel[40].addShapeBox(-68F, 0F, 4.5F, 6, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 2F); // Box 269
        defaultStockModel[40].setRotationPoint(1.5F, -35.5F, -6.5F);

        defaultStockModel[41].addShapeBox(-68F, 0F, 1.5F, 6, 8, 10, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 270
        defaultStockModel[41].setRotationPoint(1.5F, -33.5F, -6.5F);

        defaultStockModel[42].addShapeBox(-68F, 0F, 2.5F, 6, 1, 8, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F); // Box 271
        defaultStockModel[42].setRotationPoint(1.5F, -34.5F, -6.5F);

        defaultStockModel[43].addShapeBox(-68F, 0F, 1.5F, 6, 14, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
        defaultStockModel[43].setRotationPoint(1.5F, -16.5F, -6.5F);

        defaultStockModel[44].addShapeBox(-68F, 0F, 1.5F, 6, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 273
        defaultStockModel[44].setRotationPoint(1.5F, -2.5F, -6.5F);

        defaultStockModel[45].addShapeBox(-67F, 0F, 1.5F, 5, 9, 10, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 390
        defaultStockModel[45].setRotationPoint(1.5F, -25.5F, -6.5F);

        defaultStockModel[46].addShapeBox(-45.5F, 0F, 4.5F, 1, 1, 4, 0F, 1.5F, -2F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, -2F, 0.5F, 0.5F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 1F, 1.5F); // Box 466
        defaultStockModel[46].setRotationPoint(1.5F, -43F, -6.5F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 397
        slideModel[1] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 398
        slideModel[2] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 399
        slideModel[3] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 401
        slideModel[4] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 402
        slideModel[5] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 403
        slideModel[6] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 404
        slideModel[7] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 409
        slideModel[8] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 410
        slideModel[9] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 391
        slideModel[10] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 392
        slideModel[11] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 393
        slideModel[12] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 394
        slideModel[13] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 395
        slideModel[14] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 396
        slideModel[15] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 397
        slideModel[16] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 398
        slideModel[17] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 400
        slideModel[18] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 401
        slideModel[19] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 402
        slideModel[20] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 403
        slideModel[21] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 404
        slideModel[22] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 406
        slideModel[23] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 407
        slideModel[24] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 408
        slideModel[25] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 409
        slideModel[26] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 410
        slideModel[27] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 411
        slideModel[28] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 412
        slideModel[29] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 413
        slideModel[30] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 212
        slideModel[31] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 213
        slideModel[32] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 214

        slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
        slideModel[0].setRotationPoint(64F, -37.5F, 0.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
        slideModel[1].setRotationPoint(54F, -36.5F, -2.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 399
        slideModel[2].setRotationPoint(54F, -35.5F, -2.5F);

        slideModel[3].addShapeBox(-2F, 0F, -1F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
        slideModel[3].setRotationPoint(69F, -36.5F, 3.5F);

        slideModel[4].addShapeBox(-1F, 0F, 1F, 6, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
        slideModel[4].setRotationPoint(69F, -36.5F, 3.5F);

        slideModel[5].addShapeBox(3F, 0F, 2F, 4, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
        slideModel[5].setRotationPoint(68F, -36.5F, 4F);

        slideModel[6].addShapeBox(4F, 0F, 3F, 3, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
        slideModel[6].setRotationPoint(68F, -36.5F, 4F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 409
        slideModel[7].setRotationPoint(65F, -38.5F, 0.5F);

        slideModel[8].addShapeBox(-1F, 0F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 410
        slideModel[8].setRotationPoint(69F, -36.5F, 3.5F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 391
        slideModel[9].setRotationPoint(73.5F, -38.5F, 7F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        slideModel[10].setRotationPoint(73.5F, -38.5F, 6F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
        slideModel[11].setRotationPoint(73.5F, -38.5F, 5F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
        slideModel[12].setRotationPoint(75.5F, -38.5F, 5F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
        slideModel[13].setRotationPoint(75.5F, -38.5F, 7F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
        slideModel[14].setRotationPoint(80.5F, -38.5F, 6F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
        slideModel[15].setRotationPoint(81.5F, -38.5F, 7F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
        slideModel[16].setRotationPoint(81.5F, -38.5F, 5F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 400
        slideModel[17].setRotationPoint(86.5F, -38.5F, 6F);

        slideModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 401
        slideModel[18].setRotationPoint(85.5F, -38.5F, 8F);

        slideModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.5F, -0.25F, 0.5F, -2F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.5F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 402
        slideModel[19].setRotationPoint(87.5F, -38.5F, 6F);

        slideModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
        slideModel[20].setRotationPoint(86.5F, -38.5F, 8.5F);

        slideModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F); // Box 404
        slideModel[21].setRotationPoint(89.5F, -38.5F, 8.5F);

        slideModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0.1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 406
        slideModel[22].setRotationPoint(75.5F, -38.5F, 6.5F);

        slideModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0.1F, 0F, -0.5F); // Box 407
        slideModel[23].setRotationPoint(75.5F, -38.5F, 6F);

        slideModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 408
        slideModel[24].setRotationPoint(79.5F, -38.5F, 6.5F);

        slideModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 409
        slideModel[25].setRotationPoint(79.5F, -38.5F, 6F);

        slideModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 410
        slideModel[26].setRotationPoint(85.5F, -38.5F, 6.5F);

        slideModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 411
        slideModel[27].setRotationPoint(85.5F, -38.5F, 6F);

        slideModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0.1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 412
        slideModel[28].setRotationPoint(81.5F, -38.5F, 6.5F);

        slideModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0.1F, 0F, -0.5F); // Box 413
        slideModel[29].setRotationPoint(81.5F, -38.5F, 6F);

        slideModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 212
        slideModel[30].setRotationPoint(67.5F, -37F, 2F);

        slideModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 213
        slideModel[31].setRotationPoint(69.5F, -37F, 2F);

        slideModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
        slideModel[32].setRotationPoint(68.5F, -37F, 2F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Box 210
        ammoModel[1] = new ModelRendererTurbo(this, 1, 400, textureX, textureY); // Box 211
        ammoModel[2] = new ModelRendererTurbo(this, 80, 300, textureX, textureY); // Box 484
        ammoModel[3] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 489
        ammoModel[4] = new ModelRendererTurbo(this, 100, 300, textureX, textureY); // Box 490
        ammoModel[5] = new ModelRendererTurbo(this, 300, 300, textureX, textureY); // Box 491
        ammoModel[6] = new ModelRendererTurbo(this, 140, 300, textureX, textureY); // Box 492
        ammoModel[7] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Box 493
        ammoModel[8] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Box 494
        ammoModel[9] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 495
        ammoModel[10] = new ModelRendererTurbo(this, 150, 400, textureX, textureY); // Box 496
        ammoModel[11] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Box 497

        ammoModel[0].addShapeBox(0F, 0F, 0F, 12, 27, 7, 0F, -12F, 0F, -0.1F, 11F, -2F, -0.1F, 11F, -2F, -0.1F, -12F, 0F, -0.1F, -1F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, -1F, 0F, -0.1F); // Box 210
        ammoModel[0].setRotationPoint(41F, -27F, -3.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 13, 29, 9, 0F, -14F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -14F, 0F, 0F, -3F, 0.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, -3F, 0.5F, 0F); // Box 211
        ammoModel[1].setRotationPoint(27.5F, 0F, -4.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 33, 7, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 13F, 0.5F, 1F, -13F, 0.5F, 0F, -13F, 0.5F, 0F, 13F, 0.5F, 1F); // Box 484
        ammoModel[2].setRotationPoint(53.5F, 0F, -3.62F);

        ammoModel[3].addShapeBox(0F, -9F, 0F, 12, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
        ammoModel[3].setRotationPoint(30.5F, 29.5F, -5.5F);
        ammoModel[3].rotateAngleZ = -0.34906585F;

        ammoModel[4].addShapeBox(0F, -9F, 0F, 12, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
        ammoModel[4].setRotationPoint(30.5F, 29.5F, 4.5F);
        ammoModel[4].rotateAngleZ = -0.34906585F;

        ammoModel[5].addShapeBox(-1F, -9F, 0F, 1, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 491
        ammoModel[5].setRotationPoint(30.5F, 29.5F, -4.5F);
        ammoModel[5].rotateAngleZ = -0.34906585F;

        ammoModel[6].addShapeBox(12F, -9F, 0F, 1, 9, 9, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 492
        ammoModel[6].setRotationPoint(30.5F, 29.5F, -4.5F);
        ammoModel[6].rotateAngleZ = -0.34906585F;

        ammoModel[7].addShapeBox(3F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
        ammoModel[7].setRotationPoint(30.5F, 29.5F, 4.5F);
        ammoModel[7].rotateAngleZ = -0.34906585F;

        ammoModel[8].addShapeBox(4F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 494
        ammoModel[8].setRotationPoint(30.5F, 29.5F, 4.5F);
        ammoModel[8].rotateAngleZ = -0.34906585F;

        ammoModel[9].addShapeBox(4F, 7F, 0F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 495
        ammoModel[9].setRotationPoint(30.5F, 29.5F, -5.5F);
        ammoModel[9].rotateAngleZ = -0.34906585F;

        ammoModel[10].addShapeBox(3F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
        ammoModel[10].setRotationPoint(30.5F, 29.5F, -5.5F);
        ammoModel[10].rotateAngleZ = -0.34906585F;

        ammoModel[11].addShapeBox(4F, 9F, 0F, 4, 1, 7, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
        ammoModel[11].setRotationPoint(30.5F, 29.5F, -3.5F);
        ammoModel[11].rotateAngleZ = -0.34906585F;
    }
}