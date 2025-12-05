//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SR338
// Model Creator: 
// Created on: 16.04.2021 - 15:19:58
// Last changed on: 16.04.2021 - 15:19:58

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSR338 extends ModelGun //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelSR338() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[660];
        defaultBarrelModel = new ModelRendererTurbo[80];
        defaultStockModel = new ModelRendererTurbo[57];
        ammoModel = new ModelRendererTurbo[33];
        slideModel = new ModelRendererTurbo[35];

        initgunModel_1();
        initgunModel_2();
        initdefaultBarrelModel_1();
        initdefaultStockModel_1();
        initammoModel_1();
        initslideModel_1();

        barrelAttachPoint = new Vector3f(158F / 16F, (33F - 5F) / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(108F / 16F, (33F - 5F) / 16F, -3.75F / 16F);
        scopeAttachPoint = new Vector3f(21F / 16F, (39F - 5F) / 16F, 0F / 16F);
        gripAttachPoint = new Vector3f(90 / 16F, (28.5F - 5F) / 16F, 0F / 16F);

        gunSlideDistance = 2F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        translateAll(0.0F, 0.0F, 0.0F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(0.05F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.235F, -0.53F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.235F, -0.53F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = false;
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0.0F);
        flipAll();
        gunOffset = -0.82F;
        gunOffsetX = -2F;
        crouchZoom = -0.05F;
        zoomOffset = 0.3F;

        translateAll(0, -5, 0);

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 156
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 157
        gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 158
        gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 159
        gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 160
        gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 161
        gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 162
        gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 163
        gunModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 164
        gunModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 165
        gunModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 166
        gunModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 167
        gunModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 168
        gunModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 169
        gunModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 170
        gunModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 171
        gunModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 172
        gunModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 173
        gunModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 174
        gunModel[19] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 175
        gunModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 176
        gunModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 177
        gunModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 178
        gunModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 179
        gunModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 183
        gunModel[25] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 193
        gunModel[26] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 198
        gunModel[27] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 199
        gunModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 200
        gunModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 201
        gunModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 202
        gunModel[31] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 203
        gunModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 204
        gunModel[33] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 205
        gunModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 206
        gunModel[35] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 207
        gunModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 208
        gunModel[37] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 209
        gunModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 210
        gunModel[39] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 211
        gunModel[40] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 212
        gunModel[41] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 213
        gunModel[42] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 214
        gunModel[43] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 215
        gunModel[44] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 216
        gunModel[45] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 217
        gunModel[46] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 218
        gunModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 219
        gunModel[48] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 220
        gunModel[49] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 221
        gunModel[50] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 222
        gunModel[51] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 224
        gunModel[52] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 225
        gunModel[53] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 226
        gunModel[54] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 227
        gunModel[55] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 228
        gunModel[56] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 229
        gunModel[57] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 230
        gunModel[58] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 231
        gunModel[59] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 232
        gunModel[60] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 233
        gunModel[61] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 234
        gunModel[62] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 235
        gunModel[63] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 236
        gunModel[64] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 237
        gunModel[65] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 238
        gunModel[66] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 239
        gunModel[67] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 240
        gunModel[68] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 241
        gunModel[69] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 242
        gunModel[70] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 243
        gunModel[71] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 244
        gunModel[72] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 245
        gunModel[73] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 246
        gunModel[74] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 247
        gunModel[75] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 248
        gunModel[76] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 249
        gunModel[77] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 250
        gunModel[78] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 251
        gunModel[79] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 252
        gunModel[80] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 253
        gunModel[81] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 254
        gunModel[82] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 255
        gunModel[83] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 256
        gunModel[84] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 257
        gunModel[85] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 258
        gunModel[86] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 259
        gunModel[87] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 260
        gunModel[88] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 261
        gunModel[89] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 262
        gunModel[90] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 263
        gunModel[91] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 264
        gunModel[92] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 265
        gunModel[93] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 266
        gunModel[94] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 267
        gunModel[95] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 268
        gunModel[96] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 269
        gunModel[97] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 270
        gunModel[98] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 271
        gunModel[99] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 272
        gunModel[100] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 273
        gunModel[101] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 274
        gunModel[102] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 275
        gunModel[103] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 276
        gunModel[104] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 280
        gunModel[105] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 281
        gunModel[106] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 282
        gunModel[107] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 283
        gunModel[108] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 284
        gunModel[109] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 285
        gunModel[110] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 286
        gunModel[111] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 287
        gunModel[112] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 288
        gunModel[113] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 289
        gunModel[114] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 290
        gunModel[115] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 291
        gunModel[116] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 159
        gunModel[117] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 160
        gunModel[118] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 161
        gunModel[119] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 162
        gunModel[120] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 163
        gunModel[121] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 164
        gunModel[122] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 167
        gunModel[123] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 168
        gunModel[124] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 362
        gunModel[125] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 363
        gunModel[126] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 364
        gunModel[127] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 365
        gunModel[128] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 366
        gunModel[129] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 367
        gunModel[130] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 368
        gunModel[131] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 369
        gunModel[132] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 370
        gunModel[133] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 371
        gunModel[134] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 372
        gunModel[135] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 373
        gunModel[136] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 374
        gunModel[137] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 375
        gunModel[138] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 376
        gunModel[139] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 377
        gunModel[140] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 378
        gunModel[141] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 379
        gunModel[142] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 380
        gunModel[143] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 381
        gunModel[144] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 382
        gunModel[145] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 383
        gunModel[146] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 384
        gunModel[147] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 385
        gunModel[148] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 782
        gunModel[149] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 783
        gunModel[150] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 784
        gunModel[151] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 785
        gunModel[152] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 786
        gunModel[153] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 787
        gunModel[154] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 316
        gunModel[155] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 317
        gunModel[156] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 320
        gunModel[157] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 321
        gunModel[158] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 324
        gunModel[159] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 319
        gunModel[160] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 120
        gunModel[161] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 795
        gunModel[162] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 292
        gunModel[163] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 117
        gunModel[164] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 118
        gunModel[165] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 119
        gunModel[166] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 121
        gunModel[167] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 122
        gunModel[168] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 123
        gunModel[169] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 124
        gunModel[170] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 125
        gunModel[171] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 126
        gunModel[172] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 127
        gunModel[173] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 129
        gunModel[174] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 130
        gunModel[175] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 131
        gunModel[176] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 132
        gunModel[177] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 134
        gunModel[178] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 135
        gunModel[179] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 136
        gunModel[180] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 137
        gunModel[181] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 165
        gunModel[182] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 166
        gunModel[183] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 169
        gunModel[184] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 170
        gunModel[185] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 171
        gunModel[186] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 172
        gunModel[187] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 173
        gunModel[188] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 174
        gunModel[189] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 175
        gunModel[190] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 176
        gunModel[191] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 177
        gunModel[192] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 178
        gunModel[193] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 179
        gunModel[194] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 180
        gunModel[195] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 181
        gunModel[196] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 182
        gunModel[197] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 183
        gunModel[198] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 184
        gunModel[199] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 185
        gunModel[200] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 186
        gunModel[201] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 187
        gunModel[202] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 188
        gunModel[203] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 189
        gunModel[204] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 318
        gunModel[205] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 322
        gunModel[206] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 325
        gunModel[207] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 386
        gunModel[208] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 387
        gunModel[209] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 388
        gunModel[210] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 389
        gunModel[211] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 390
        gunModel[212] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 391
        gunModel[213] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 648
        gunModel[214] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 649
        gunModel[215] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 650
        gunModel[216] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 652
        gunModel[217] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 651
        gunModel[218] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 666
        gunModel[219] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 667
        gunModel[220] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 676
        gunModel[221] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 677
        gunModel[222] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 678
        gunModel[223] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 679
        gunModel[224] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 680
        gunModel[225] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 681
        gunModel[226] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 682
        gunModel[227] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 683
        gunModel[228] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 684
        gunModel[229] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 326
        gunModel[230] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 327
        gunModel[231] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 328
        gunModel[232] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 329
        gunModel[233] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 330
        gunModel[234] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 331
        gunModel[235] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 332
        gunModel[236] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 333
        gunModel[237] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 334
        gunModel[238] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 335
        gunModel[239] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 336
        gunModel[240] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 337
        gunModel[241] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 338
        gunModel[242] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 339
        gunModel[243] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 340
        gunModel[244] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 341
        gunModel[245] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 342
        gunModel[246] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 343
        gunModel[247] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 344
        gunModel[248] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 345
        gunModel[249] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 346
        gunModel[250] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 347
        gunModel[251] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 348
        gunModel[252] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 349
        gunModel[253] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 350
        gunModel[254] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 351
        gunModel[255] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 352
        gunModel[256] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 353
        gunModel[257] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 354
        gunModel[258] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 355
        gunModel[259] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 356
        gunModel[260] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 357
        gunModel[261] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 358
        gunModel[262] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 359
        gunModel[263] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 360
        gunModel[264] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 194
        gunModel[265] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 195
        gunModel[266] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 196
        gunModel[267] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 197
        gunModel[268] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 198
        gunModel[269] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 199
        gunModel[270] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 200
        gunModel[271] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 201
        gunModel[272] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 202
        gunModel[273] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 203
        gunModel[274] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 204
        gunModel[275] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 205
        gunModel[276] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 206
        gunModel[277] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 207
        gunModel[278] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 208
        gunModel[279] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 209
        gunModel[280] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 210
        gunModel[281] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 211
        gunModel[282] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 212
        gunModel[283] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 213
        gunModel[284] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 214
        gunModel[285] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 215
        gunModel[286] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 216
        gunModel[287] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 217
        gunModel[288] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 218
        gunModel[289] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 219
        gunModel[290] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 220
        gunModel[291] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 221
        gunModel[292] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 222
        gunModel[293] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 223
        gunModel[294] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 224
        gunModel[295] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 225
        gunModel[296] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 226
        gunModel[297] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 227
        gunModel[298] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 228
        gunModel[299] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 229
        gunModel[300] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 230
        gunModel[301] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 231
        gunModel[302] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 232
        gunModel[303] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 234
        gunModel[304] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 235
        gunModel[305] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 236
        gunModel[306] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 237
        gunModel[307] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 436
        gunModel[308] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 437
        gunModel[309] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 438
        gunModel[310] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 440
        gunModel[311] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 441
        gunModel[312] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 442
        gunModel[313] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 443
        gunModel[314] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 444
        gunModel[315] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 445
        gunModel[316] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 446
        gunModel[317] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 447
        gunModel[318] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 448
        gunModel[319] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 449
        gunModel[320] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 450
        gunModel[321] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 451
        gunModel[322] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 453
        gunModel[323] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 454
        gunModel[324] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 455
        gunModel[325] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 456
        gunModel[326] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 457
        gunModel[327] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 458
        gunModel[328] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 459
        gunModel[329] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 460
        gunModel[330] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 461
        gunModel[331] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 462
        gunModel[332] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 463
        gunModel[333] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 464
        gunModel[334] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 465
        gunModel[335] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 466
        gunModel[336] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 467
        gunModel[337] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 468
        gunModel[338] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 469
        gunModel[339] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 470
        gunModel[340] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 471
        gunModel[341] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 472
        gunModel[342] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 473
        gunModel[343] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 474
        gunModel[344] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 475
        gunModel[345] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 476
        gunModel[346] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 477
        gunModel[347] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 478
        gunModel[348] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 479
        gunModel[349] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 480
        gunModel[350] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 481
        gunModel[351] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 482
        gunModel[352] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 483
        gunModel[353] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 484
        gunModel[354] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 485
        gunModel[355] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 486
        gunModel[356] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 487
        gunModel[357] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 488
        gunModel[358] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 489
        gunModel[359] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 490
        gunModel[360] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 491
        gunModel[361] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 492
        gunModel[362] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 493
        gunModel[363] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 494
        gunModel[364] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 495
        gunModel[365] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 496
        gunModel[366] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 497
        gunModel[367] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 498
        gunModel[368] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 499
        gunModel[369] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 500
        gunModel[370] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 501
        gunModel[371] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 502
        gunModel[372] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 503
        gunModel[373] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 504
        gunModel[374] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 505
        gunModel[375] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 506
        gunModel[376] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 507
        gunModel[377] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 508
        gunModel[378] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 509
        gunModel[379] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 510
        gunModel[380] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 511
        gunModel[381] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 512
        gunModel[382] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 513
        gunModel[383] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 514
        gunModel[384] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 515
        gunModel[385] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 516
        gunModel[386] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 517
        gunModel[387] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 518
        gunModel[388] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 519
        gunModel[389] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 520
        gunModel[390] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 521
        gunModel[391] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 522
        gunModel[392] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 523
        gunModel[393] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 524
        gunModel[394] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 525
        gunModel[395] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 526
        gunModel[396] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 527
        gunModel[397] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 528
        gunModel[398] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 529
        gunModel[399] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 530
        gunModel[400] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 531
        gunModel[401] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 532
        gunModel[402] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 533
        gunModel[403] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 534
        gunModel[404] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 535
        gunModel[405] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 536
        gunModel[406] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 537
        gunModel[407] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 538
        gunModel[408] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 539
        gunModel[409] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 540
        gunModel[410] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 541
        gunModel[411] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 542
        gunModel[412] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 543
        gunModel[413] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 544
        gunModel[414] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 545
        gunModel[415] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 546
        gunModel[416] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 547
        gunModel[417] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 548
        gunModel[418] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 549
        gunModel[419] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 550
        gunModel[420] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 551
        gunModel[421] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 552
        gunModel[422] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 553
        gunModel[423] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 554
        gunModel[424] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 555
        gunModel[425] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 556
        gunModel[426] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 557
        gunModel[427] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 558
        gunModel[428] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 559
        gunModel[429] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 560
        gunModel[430] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 561
        gunModel[431] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 562
        gunModel[432] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 563
        gunModel[433] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 564
        gunModel[434] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 565
        gunModel[435] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 566
        gunModel[436] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 567
        gunModel[437] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 568
        gunModel[438] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 569
        gunModel[439] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 570
        gunModel[440] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 571
        gunModel[441] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 572
        gunModel[442] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 573
        gunModel[443] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 574
        gunModel[444] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 575
        gunModel[445] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 576
        gunModel[446] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 577
        gunModel[447] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 578
        gunModel[448] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 579
        gunModel[449] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 580
        gunModel[450] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 583
        gunModel[451] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 584
        gunModel[452] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 585
        gunModel[453] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 586
        gunModel[454] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 587
        gunModel[455] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 588
        gunModel[456] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 589
        gunModel[457] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 590
        gunModel[458] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 591
        gunModel[459] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 592
        gunModel[460] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 593
        gunModel[461] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 594
        gunModel[462] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 596
        gunModel[463] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 597
        gunModel[464] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 598
        gunModel[465] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 599
        gunModel[466] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 600
        gunModel[467] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 601
        gunModel[468] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 602
        gunModel[469] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 603
        gunModel[470] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 604
        gunModel[471] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 605
        gunModel[472] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 606
        gunModel[473] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 607
        gunModel[474] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 608
        gunModel[475] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 609
        gunModel[476] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 610
        gunModel[477] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 611
        gunModel[478] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 612
        gunModel[479] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 613
        gunModel[480] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 614
        gunModel[481] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 615
        gunModel[482] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 616
        gunModel[483] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 617
        gunModel[484] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 618
        gunModel[485] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 619
        gunModel[486] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 620
        gunModel[487] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 621
        gunModel[488] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 622
        gunModel[489] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 623
        gunModel[490] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 624
        gunModel[491] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 625
        gunModel[492] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 626
        gunModel[493] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 627
        gunModel[494] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 628
        gunModel[495] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 629
        gunModel[496] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 630
        gunModel[497] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 631
        gunModel[498] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 632
        gunModel[499] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 633

        gunModel[0].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 156
        gunModel[0].setRotationPoint(7F, -29.5F, -2.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 157
        gunModel[1].setRotationPoint(13.5F, -29.5F, -2.5F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 158
        gunModel[2].setRotationPoint(14.5F, -29.5F, -2.5F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 159
        gunModel[3].setRotationPoint(16F, -29.5F, -2.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 160
        gunModel[4].setRotationPoint(17F, -29.5F, -3.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 161
        gunModel[5].setRotationPoint(19F, -29.5F, -3.5F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, -0.5F, 0F, 0.5F, -0.5F); // Box 162
        gunModel[6].setRotationPoint(21F, -29.5F, -3.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, -3F, 0.25F, 0.5F, -3F, -0.5F, 0F, 0F, -0.5F); // Box 163
        gunModel[7].setRotationPoint(22F, -29.5F, -3.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 164
        gunModel[8].setRotationPoint(40.5F, -29.5F, -3.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.99F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.99F, 0F, 0.25F); // Box 165
        gunModel[9].setRotationPoint(5.5F, -26.5F, -2.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 166
        gunModel[10].setRotationPoint(5.5F, -27.5F, -2.5F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 1.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 167
        gunModel[11].setRotationPoint(4.5F, -28.5F, -2.5F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F); // Box 168
        gunModel[12].setRotationPoint(-1.5F, -29.5F, -2.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0.25F); // Box 169
        gunModel[13].setRotationPoint(40.5F, -29.5F, -3.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F); // Box 170
        gunModel[14].setRotationPoint(41.5F, -29.5F, -3.5F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 171
        gunModel[15].setRotationPoint(42.5F, -29.5F, -3.5F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, -0.5F, 1F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, 1F, -0.25F); // Box 172
        gunModel[16].setRotationPoint(40.5F, -26.5F, -3.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 173
        gunModel[17].setRotationPoint(41.5F, -27.5F, -3.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 174
        gunModel[18].setRotationPoint(42.5F, -27.5F, -3.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, 0.25F); // Box 175
        gunModel[19].setRotationPoint(42.5F, -29F, -3.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.99F, 0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.99F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F); // Box 176
        gunModel[20].setRotationPoint(42.5F, -30.5F, -3.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 177
        gunModel[21].setRotationPoint(41.5F, -29F, -4F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 178
        gunModel[22].setRotationPoint(41.5F, -28.5F, -4F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 179
        gunModel[23].setRotationPoint(41.5F, -29.5F, -4F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 183
        gunModel[24].setRotationPoint(17F, -29.5F, -4.75F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 193
        gunModel[25].setRotationPoint(18.5F, -27F, -4.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F); // Box 198
        gunModel[26].setRotationPoint(23.5F, -29.5F, 3.75F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F); // Box 199
        gunModel[27].setRotationPoint(19F, -28.5F, 3.75F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 200
        gunModel[28].setRotationPoint(19F, -25.25F, 3.75F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 201
        gunModel[29].setRotationPoint(17F, -28.5F, 3.75F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 202
        gunModel[30].setRotationPoint(17F, -24.25F, 3.75F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 203
        gunModel[31].setRotationPoint(19F, -27.5F, 3.75F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
        gunModel[32].setRotationPoint(19F, -25.5F, 3.75F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 205
        gunModel[33].setRotationPoint(19F, -26.5F, 3.75F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 206
        gunModel[34].setRotationPoint(23.5F, -25.5F, 3.75F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0F, 0.25F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 207
        gunModel[35].setRotationPoint(25.5F, -26.5F, 3.75F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 208
        gunModel[36].setRotationPoint(25F, -26.75F, 3.75F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
        gunModel[37].setRotationPoint(25F, -26F, 3.75F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.25F); // Box 210
        gunModel[38].setRotationPoint(19F, -26.5F, 3.75F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 211
        gunModel[39].setRotationPoint(17F, -26.5F, 3.75F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 212
        gunModel[40].setRotationPoint(17F, -27.5F, 3.75F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 213
        gunModel[41].setRotationPoint(17F, -25.25F, 3.75F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1.24F, 0F, 0F, -1.24F, 0F, 0F, -1.24F, 0F, 0F, -1.24F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F); // Box 214
        gunModel[42].setRotationPoint(23F, -25.25F, 3.75F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.5F, 0.25F, 0F); // Box 215
        gunModel[43].setRotationPoint(24.5F, -26.5F, 3.75F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.5F, -3F, 1F, 0.5F, -3F, -1F, 0F, 0F, -1F); // Box 216
        gunModel[44].setRotationPoint(22F, -20F, -3.75F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 217
        gunModel[45].setRotationPoint(22F, -19F, -4.75F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0.25F); // Box 218
        gunModel[46].setRotationPoint(40.5F, -22F, -4.5F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 1.25F); // Box 219
        gunModel[47].setRotationPoint(40.5F, -23F, -3.5F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, 0.5F); // Box 220
        gunModel[48].setRotationPoint(21F, -20F, -3.5F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, -0.5F); // Box 221
        gunModel[49].setRotationPoint(21F, -19F, -4.5F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F); // Box 222
        gunModel[50].setRotationPoint(21F, -22.5F, -3.5F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 224
        gunModel[51].setRotationPoint(19F, -23.5F, -3.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0.25F, 0F, -0.25F); // Box 225
        gunModel[52].setRotationPoint(21F, -23.5F, -3.5F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 226
        gunModel[53].setRotationPoint(17F, -23.5F, -3.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F); // Box 227
        gunModel[54].setRotationPoint(16F, -24.5F, -3.5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 228
        gunModel[55].setRotationPoint(14F, -24.5F, -2.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0.5F, -0.25F); // Box 229
        gunModel[56].setRotationPoint(14F, -24.5F, -2.5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 230
        gunModel[57].setRotationPoint(6F, -24F, -2.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0.5F, -3F, -0.5F, 0.5F, -3F, 0.25F, 0F, 0F, 0.25F); // Box 231
        gunModel[58].setRotationPoint(22F, -29.5F, 2.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, -1F, 0.5F, 3F, -1F, 0.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -3F, -1F, 0.5F, -3F, 1F, 0F, 0F, 1F); // Box 232
        gunModel[59].setRotationPoint(22F, -20F, 1.75F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 233
        gunModel[60].setRotationPoint(22F, -19F, 2.75F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 234
        gunModel[61].setRotationPoint(7F, -29.5F, 1.5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F); // Box 235
        gunModel[62].setRotationPoint(13.5F, -29.5F, 1.5F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 236
        gunModel[63].setRotationPoint(14.5F, -29.5F, 1.5F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0.25F); // Box 237
        gunModel[64].setRotationPoint(16F, -29.5F, 1.5F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 238
        gunModel[65].setRotationPoint(17F, -29.5F, 1.5F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 239
        gunModel[66].setRotationPoint(19F, -29.5F, 1.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.25F, 0F, 0.5F, 0.25F); // Box 240
        gunModel[67].setRotationPoint(21F, -29.5F, 1.5F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 241
        gunModel[68].setRotationPoint(6F, -29.5F, -2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
        gunModel[69].setRotationPoint(11F, -24F, -2.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 243
        gunModel[70].setRotationPoint(11F, -20F, -2.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 244
        gunModel[71].setRotationPoint(13F, -19F, -2.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 245
        gunModel[72].setRotationPoint(17F, -19F, -2.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Box 246
        gunModel[73].setRotationPoint(18.5F, -19.5F, -2.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
        gunModel[74].setRotationPoint(18.5F, -21F, -2.5F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 248
        gunModel[75].setRotationPoint(19.5F, -23F, -2.5F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 249
        gunModel[76].setRotationPoint(11F, -19F, -2.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 250
        gunModel[77].setRotationPoint(16F, -26F, -0.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 251
        gunModel[78].setRotationPoint(16F, -24F, -0.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.75F, -0.5F, 0.25F); // Box 252
        gunModel[79].setRotationPoint(16F, -20F, -0.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 253
        gunModel[80].setRotationPoint(17F, -23.5F, -4.75F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 254
        gunModel[81].setRotationPoint(22F, -28.5F, -4.75F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F); // Box 255
        gunModel[82].setRotationPoint(41.5F, -29.5F, 2.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.99F, 0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.99F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F); // Box 256
        gunModel[83].setRotationPoint(42.5F, -30.5F, 2.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, 0.25F); // Box 257
        gunModel[84].setRotationPoint(42.5F, -29F, 2.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 258
        gunModel[85].setRotationPoint(42.5F, -29.5F, 2.5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 259
        gunModel[86].setRotationPoint(42.5F, -27.5F, 2.5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 260
        gunModel[87].setRotationPoint(41.5F, -27.5F, 2.5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, -0.5F, 1F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, 1F, -0.25F); // Box 261
        gunModel[88].setRotationPoint(40.5F, -26.5F, 2.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0.25F); // Box 262
        gunModel[89].setRotationPoint(40.5F, -29.5F, 2.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 263
        gunModel[90].setRotationPoint(20F, -29.5F, -2F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 264
        gunModel[91].setRotationPoint(21F, -29.5F, -2F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 265
        gunModel[92].setRotationPoint(20.5F, -29.5F, -3F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 266
        gunModel[93].setRotationPoint(20.5F, -29.5F, 2F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
        gunModel[94].setRotationPoint(20.5F, -29.5F, -1.5F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 268
        gunModel[95].setRotationPoint(6F, -29F, -3.5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 269
        gunModel[96].setRotationPoint(6F, -28.5F, -3.5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 270
        gunModel[97].setRotationPoint(6F, -29.5F, -3.5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F); // Box 271
        gunModel[98].setRotationPoint(14F, -26F, -3.5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F); // Box 272
        gunModel[99].setRotationPoint(14F, -25.75F, -3.5F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F, -0.25F, -0.375F, -0.625F); // Box 273
        gunModel[100].setRotationPoint(14F, -26.25F, -3.5F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 274
        gunModel[101].setRotationPoint(6F, -29F, 2.5F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 275
        gunModel[102].setRotationPoint(6F, -28.5F, 2.5F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 276
        gunModel[103].setRotationPoint(6F, -29.5F, 2.5F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 280
        gunModel[104].setRotationPoint(6.25F, -29.5F, -2F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
        gunModel[105].setRotationPoint(6.25F, -29.5F, 1F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 282
        gunModel[106].setRotationPoint(19.75F, -29.5F, 1F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 283
        gunModel[107].setRotationPoint(19.75F, -29.5F, -2F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 284
        gunModel[108].setRotationPoint(21.25F, -29.5F, 2F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 285
        gunModel[109].setRotationPoint(21.25F, -29.5F, -3F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 286
        gunModel[110].setRotationPoint(12F, -30F, -0.5F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        gunModel[111].setRotationPoint(12F, -31F, -0.5F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 288
        gunModel[112].setRotationPoint(12F, -28F, -0.5F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 289
        gunModel[113].setRotationPoint(13F, -26F, -0.5F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
        gunModel[114].setRotationPoint(15F, -26F, -0.5F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F); // Box 291
        gunModel[115].setRotationPoint(16F, -30F, -0.5F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 159
        gunModel[116].setRotationPoint(18.5F, -28F, -4.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 160
        gunModel[117].setRotationPoint(18.5F, -25F, -4.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 161
        gunModel[118].setRotationPoint(17F, -24.5F, -3.75F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 162
        gunModel[119].setRotationPoint(21F, -28.75F, -4.75F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        gunModel[120].setRotationPoint(21F, -25.25F, -4.75F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 164
        gunModel[121].setRotationPoint(23F, -28.75F, -4.75F);

        gunModel[122].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 167
        gunModel[122].setRotationPoint(7F, -24F, -1F);

        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 168
        gunModel[123].setRotationPoint(10.5F, -24.5F, -2.5F);

        gunModel[124].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F); // Box 362
        gunModel[124].setRotationPoint(-1.5F, -28F, -2.5F);

        gunModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 1F, 0F, -0.75F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 1F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.5F, -0.75F); // Box 363
        gunModel[125].setRotationPoint(3.5F, -27.5F, -2.5F);

        gunModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 1.5F, -0.5F, -0.75F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, 1.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F); // Box 364
        gunModel[126].setRotationPoint(2.5F, -28.5F, -2.5F);

        gunModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0.5F, -0.5F, -0.75F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, -0.75F); // Box 365
        gunModel[127].setRotationPoint(4.5F, -26.5F, -2.5F);

        gunModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, -0.75F); // Box 366
        gunModel[128].setRotationPoint(4.5F, -24.5F, -2.5F);

        gunModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0.25F, 0F, 1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F); // Box 367
        gunModel[129].setRotationPoint(23.5F, -21.25F, 3.75F);

        gunModel[130].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F); // Box 368
        gunModel[130].setRotationPoint(19F, -20F, -2.5F);

        gunModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F); // Box 369
        gunModel[131].setRotationPoint(19F, -19F, -3.5F);

        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, 2.5F, 0.25F, -0.5F, 2.5F, 0.25F, -0.5F, 2.5F, 0.25F, -0.5F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F); // Box 370
        gunModel[132].setRotationPoint(7F, -27.5F, -0.5F);

        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, 2.5F, 0F, -0.375F, 2.5F, 0F, -0.375F, 2.5F, 0F, -0.375F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F); // Box 371
        gunModel[133].setRotationPoint(7F, -27.75F, -0.5F);

        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, 2.5F, 0F, -0.375F, 2.5F, 0F, -0.375F, 2.5F, 0F, -0.375F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F); // Box 372
        gunModel[134].setRotationPoint(11F, -27.75F, -0.5F);

        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, 2.5F, 0.25F, -0.5F, 2.5F, 0.25F, -0.5F, 2.5F, 0.25F, -0.5F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F, 0.25F, -0.25F, 2.5F); // Box 373
        gunModel[135].setRotationPoint(11F, -27.5F, -0.5F);

        gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
        gunModel[136].setRotationPoint(8.5F, -26.5F, 2F);

        gunModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
        gunModel[137].setRotationPoint(8.5F, -27.5F, 2F);

        gunModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 376
        gunModel[138].setRotationPoint(8.5F, -25.5F, 2F);

        gunModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
        gunModel[139].setRotationPoint(9F, -25.5F, 2.5F);

        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F); // Box 378
        gunModel[140].setRotationPoint(9F, -23.5F, 2.5F);

        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
        gunModel[141].setRotationPoint(9F, -26.5F, 2.5F);

        gunModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
        gunModel[142].setRotationPoint(8.5F, -26.5F, -3F);

        gunModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
        gunModel[143].setRotationPoint(8.5F, -27.5F, -3F);

        gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 382
        gunModel[144].setRotationPoint(8.5F, -25.5F, -3F);

        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
        gunModel[145].setRotationPoint(9F, -25.5F, -3.5F);

        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F); // Box 384
        gunModel[146].setRotationPoint(9F, -23.5F, -3.5F);

        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
        gunModel[147].setRotationPoint(9F, -26.5F, -3.5F);

        gunModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -1.4F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.4F, -0.75F, 0F, -1.4F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.4F, -0.75F, 0F); // Box 782
        gunModel[148].setRotationPoint(-3.5F, -34F, -3F);

        gunModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -1.4F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -1.4F, -0.75F, -0.75F, -1.4F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.4F, -0.75F, 0F); // Box 783
        gunModel[149].setRotationPoint(-3.5F, -35.5F, -3F);

        gunModel[150].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -1.4F, -1F, -2.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2.25F, -1.4F, -1F, -2.25F, -1.4F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, -1.4F, -1.25F, -0.75F); // Box 784
        gunModel[150].setRotationPoint(-3.5F, -36.5F, -3F);

        gunModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -1.4F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, -1.4F, -1.25F, -0.75F, -1.4F, -1F, -2.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2.25F, -1.4F, -1F, -2.25F); // Box 785
        gunModel[151].setRotationPoint(-3.5F, -29.5F, -3F);

        gunModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -1.4F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.4F, -0.75F, 0F, -1.4F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -1.4F, -0.75F, -0.75F); // Box 786
        gunModel[152].setRotationPoint(-3.5F, -32.5F, -3F);

        gunModel[153].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -1.4F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -1.4F, -0.25F, -0.75F, -1.4F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -1.4F, -0.75F, -0.75F); // Box 787
        gunModel[153].setRotationPoint(-3.5F, -30.5F, -3F);

        gunModel[154].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 316
        gunModel[154].setRotationPoint(-2F, -33.5F, -3F);

        gunModel[155].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 317
        gunModel[155].setRotationPoint(-2F, -35.25F, -3F);

        gunModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 320
        gunModel[156].setRotationPoint(-2F, -32F, -3F);

        gunModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 321
        gunModel[157].setRotationPoint(-2F, -36F, -3F);

        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.99F, 0.25F, 0.125F, 0F, 0.25F, 0.125F, 0F, 0.25F, 0.125F, -0.99F, 0.25F, 0.125F, 2F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 2F, 0F, 0.125F); // Box 324
        gunModel[158].setRotationPoint(0F, -37.5F, -2F);

        gunModel[159].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -2.25F, 3F, -0.25F, -2.25F, 3F, -0.25F, -2.25F, 0F, -0.25F, -2.25F); // Box 319
        gunModel[159].setRotationPoint(-2F, -31F, -3F);

        gunModel[160].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.8F, 0.5F, 0F, -4.8F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4.8F, 0.5F, 0F, -4.8F); // Box 120
        gunModel[160].setRotationPoint(-1.5F, -30.5F, -2.5F);

        gunModel[161].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F, 0.5F, 0F, -4.8F, 0F, 0F, -4.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.8F, 2F, 0F, -4.8F, 2F, 0F, 0F, 0.5F, 0F, 0F); // Box 795
        gunModel[161].setRotationPoint(-1.5F, -30.5F, -2.5F);

        gunModel[162].addShapeBox(0F, 0F, 0F, 26, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 292
        gunModel[162].setRotationPoint(17F, -30.5F, -3.5F);

        gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 117
        gunModel[163].setRotationPoint(16F, -30.5F, -3.5F);

        gunModel[164].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 118
        gunModel[164].setRotationPoint(17F, -31.5F, -3.5F);

        gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1F); // Box 119
        gunModel[165].setRotationPoint(16F, -31.5F, -3.5F);

        gunModel[166].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 121
        gunModel[166].setRotationPoint(41F, -30.5F, -2F);

        gunModel[167].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
        gunModel[167].setRotationPoint(9F, -32.5F, -4F);

        gunModel[168].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 123
        gunModel[168].setRotationPoint(9F, -35.5F, 2.5F);

        gunModel[169].addShapeBox(0F, 0F, 0F, 34, 1, 6, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        gunModel[169].setRotationPoint(9F, -36.5F, -3F);

        gunModel[170].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 125
        gunModel[170].setRotationPoint(9F, -31.5F, -4F);

        gunModel[171].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 126
        gunModel[171].setRotationPoint(1F, -31.5F, -3F);

        gunModel[172].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        gunModel[172].setRotationPoint(1F, -33F, -3F);

        gunModel[173].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
        gunModel[173].setRotationPoint(1F, -35F, -3F);

        gunModel[174].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        gunModel[174].setRotationPoint(1F, -36F, -2.5F);

        gunModel[175].addShapeBox(0F, 0F, 0F, 34, 1, 7, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 131
        gunModel[175].setRotationPoint(9F, -36F, -3.5F);

        gunModel[176].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Box 132
        gunModel[176].setRotationPoint(1F, -32F, -3F);

        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0F); // Box 134
        gunModel[177].setRotationPoint(8F, -35F, -3F);

        gunModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 135
        gunModel[178].setRotationPoint(9F, -35F, -3F);

        gunModel[179].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.75F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F); // Box 136
        gunModel[179].setRotationPoint(9F, -35F, 2.5F);

        gunModel[180].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, 0.125F, -0.625F, 0F, 0.125F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        gunModel[180].setRotationPoint(9F, -33.75F, 3F);

        gunModel[181].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 165
        gunModel[181].setRotationPoint(9F, -35.5F, -3.5F);

        gunModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 166
        gunModel[182].setRotationPoint(41F, -35F, 2.5F);

        gunModel[183].addShapeBox(0F, 0F, 0F, 41, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        gunModel[183].setRotationPoint(2F, -38.5F, -2F);

        gunModel[184].addShapeBox(0F, 0F, 0F, 39, 1, 4, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        gunModel[184].setRotationPoint(4F, -39.5F, -2F);

        gunModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 171
        gunModel[185].setRotationPoint(4F, -39.5F, -2F);

        gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 172
        gunModel[186].setRotationPoint(8F, -39.5F, -2F);

        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 173
        gunModel[187].setRotationPoint(10F, -39.5F, -2F);

        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 174
        gunModel[188].setRotationPoint(14F, -39.5F, -2F);

        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 175
        gunModel[189].setRotationPoint(12F, -39.5F, -2F);

        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 176
        gunModel[190].setRotationPoint(22F, -39.5F, -2F);

        gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 177
        gunModel[191].setRotationPoint(20F, -39.5F, -2F);

        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 178
        gunModel[192].setRotationPoint(18F, -39.5F, -2F);

        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 179
        gunModel[193].setRotationPoint(16F, -39.5F, -2F);

        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 180
        gunModel[194].setRotationPoint(32F, -39.5F, -2F);

        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 181
        gunModel[195].setRotationPoint(30F, -39.5F, -2F);

        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 182
        gunModel[196].setRotationPoint(28F, -39.5F, -2F);

        gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 183
        gunModel[197].setRotationPoint(26F, -39.5F, -2F);

        gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 184
        gunModel[198].setRotationPoint(24F, -39.5F, -2F);

        gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 185
        gunModel[199].setRotationPoint(42F, -39.5F, -2F);

        gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 186
        gunModel[200].setRotationPoint(40F, -39.5F, -2F);

        gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 187
        gunModel[201].setRotationPoint(38F, -39.5F, -2F);

        gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 188
        gunModel[202].setRotationPoint(36F, -39.5F, -2F);

        gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 189
        gunModel[203].setRotationPoint(34F, -39.5F, -2F);

        gunModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, -1.375F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, -1.375F, -0.5F, -2.25F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F); // Box 318
        gunModel[204].setRotationPoint(-2F, -37F, -3F);

        gunModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        gunModel[205].setRotationPoint(2F, -39.5F, -2F);

        gunModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        gunModel[206].setRotationPoint(1F, -38.5F, -2F);

        gunModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 386
        gunModel[207].setRotationPoint(41F, -27.5F, -2F);

        gunModel[208].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 387
        gunModel[208].setRotationPoint(41F, -33.5F, -3F);

        gunModel[209].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 388
        gunModel[209].setRotationPoint(41F, -35F, -3F);

        gunModel[210].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 389
        gunModel[210].setRotationPoint(41F, -36F, -3F);

        gunModel[211].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 390
        gunModel[211].setRotationPoint(41F, -31F, -3F);

        gunModel[212].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 391
        gunModel[212].setRotationPoint(41F, -32F, -3F);

        gunModel[213].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 648
        gunModel[213].setRotationPoint(40F, -35.5F, -3.5F);

        gunModel[214].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F); // Box 649
        gunModel[214].setRotationPoint(9F, -35.5F, -3.5F);

        gunModel[215].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
        gunModel[215].setRotationPoint(9F, -32.5F, 3F);

        gunModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F); // Box 652
        gunModel[216].setRotationPoint(40F, -35.5F, -3.5F);

        gunModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
        gunModel[217].setRotationPoint(40F, -32.5F, -4F);

        gunModel[218].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, 0F, -1.5F); // Box 666
        gunModel[218].setRotationPoint(9F, -31.5F, 2F);

        gunModel[219].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 667
        gunModel[219].setRotationPoint(17F, -31.5F, 2.5F);

        gunModel[220].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 676
        gunModel[220].setRotationPoint(5.25F, -34F, -3.75F);

        gunModel[221].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, -1F, 0.125F, 0F, 0F, 0.125F, -1.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, 0F, 0.125F, -1.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 677
        gunModel[221].setRotationPoint(1.25F, -34F, -5.25F);

        gunModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 678
        gunModel[222].setRotationPoint(0.25F, -34F, -5.25F);

        gunModel[223].addShapeBox(-1.5F, 0F, -1.75F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
        gunModel[223].setRotationPoint(0.75F, -33F, -3F);
        gunModel[223].rotateAngleY = 0.38397244F;

        gunModel[224].addShapeBox(-1.5F, -1F, -1.75F, 2, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
        gunModel[224].setRotationPoint(0.75F, -33F, -3F);
        gunModel[224].rotateAngleY = 0.38397244F;

        gunModel[225].addShapeBox(-1.5F, 1F, -1.75F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 681
        gunModel[225].setRotationPoint(0.75F, -33F, -3F);
        gunModel[225].rotateAngleY = 0.38397244F;

        gunModel[226].addShapeBox(-2.5F, -1F, -1.75F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 682
        gunModel[226].setRotationPoint(0.75F, -33F, -3F);
        gunModel[226].rotateAngleY = 0.38397244F;

        gunModel[227].addShapeBox(-2.5F, 0F, -1.75F, 1, 1, 2, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 683
        gunModel[227].setRotationPoint(0.75F, -33F, -3F);
        gunModel[227].rotateAngleY = 0.38397244F;

        gunModel[228].addShapeBox(-2.5F, 1F, -1.75F, 1, 1, 2, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 684
        gunModel[228].setRotationPoint(0.75F, -33F, -3F);
        gunModel[228].rotateAngleY = 0.38397244F;

        gunModel[229].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 326
        gunModel[229].setRotationPoint(6.5F, -23.5F, -3F);

        gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
        gunModel[230].setRotationPoint(10.5F, -23.5F, -3F);

        gunModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        gunModel[231].setRotationPoint(10.5F, -22.5F, -3F);

        gunModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F); // Box 329
        gunModel[232].setRotationPoint(6.5F, -18.5F, -3F);

        gunModel[233].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F); // Box 330
        gunModel[233].setRotationPoint(4.5F, -17.5F, -3F);

        gunModel[234].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F); // Box 331
        gunModel[234].setRotationPoint(2.5F, -15.5F, -3F);

        gunModel[235].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1.5F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1.5F, 0F, 0F); // Box 332
        gunModel[235].setRotationPoint(-0.5F, -10.5F, -3F);

        gunModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 333
        gunModel[236].setRotationPoint(4.5F, -23.5F, -3F);

        gunModel[237].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 334
        gunModel[237].setRotationPoint(4.5F, -21.5F, -3F);

        gunModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 335
        gunModel[238].setRotationPoint(2.5F, -18.5F, -3F);

        gunModel[239].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F); // Box 336
        gunModel[239].setRotationPoint(0.5F, -16.5F, -3F);

        gunModel[240].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.25F, -0.5F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.5F, -1F); // Box 337
        gunModel[240].setRotationPoint(-2.5F, -11.5F, -3F);

        gunModel[241].addShapeBox(-0.25F, -1F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
        gunModel[241].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[241].rotateAngleZ = -0.48869219F;

        gunModel[242].addShapeBox(1.75F, -1F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F); // Box 339
        gunModel[242].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[242].rotateAngleZ = -0.48869219F;

        gunModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F); // Box 340
        gunModel[243].setRotationPoint(8.5F, -17.5F, -3F);

        gunModel[244].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F); // Box 341
        gunModel[244].setRotationPoint(7.5F, -15.5F, -3F);

        gunModel[245].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -1.75F, -0.125F, -1F, -1.75F, -0.125F, -1F, 1.5F, -0.5F, 0F); // Box 342
        gunModel[245].setRotationPoint(4.5F, -10.5F, -3F);

        gunModel[246].addShapeBox(-0.25F, -2F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
        gunModel[246].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[246].rotateAngleZ = -0.48869219F;

        gunModel[247].addShapeBox(1.75F, -2F, 0F, 1, 1, 6, 0F, 0F, 0F, -1F, 0F, -1.24F, -2F, 0F, -1.24F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F); // Box 344
        gunModel[247].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[247].rotateAngleZ = -0.48869219F;

        gunModel[248].addShapeBox(1.75F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.24F, -2F, 0F, -1.24F, -2F, 0F, 0F, -1F); // Box 345
        gunModel[248].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[248].rotateAngleZ = -0.48869219F;

        gunModel[249].addShapeBox(-0.25F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 346
        gunModel[249].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[249].rotateAngleZ = -0.48869219F;

        gunModel[250].addShapeBox(1.25F, 4F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F); // Box 347
        gunModel[250].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[250].rotateAngleZ = -0.41887902F;

        gunModel[251].addShapeBox(1.25F, 5F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.24F, -2F, 0F, -1.24F, -2F, 0F, 0F, -1F); // Box 348
        gunModel[251].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[251].rotateAngleZ = -0.41887902F;

        gunModel[252].addShapeBox(-0.75F, 4F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
        gunModel[252].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[252].rotateAngleZ = -0.41887902F;

        gunModel[253].addShapeBox(1.25F, 3F, 0F, 1, 1, 6, 0F, 0F, 0F, -1F, 0F, -1.24F, -2F, 0F, -1.24F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F); // Box 350
        gunModel[253].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[253].rotateAngleZ = -0.41887902F;

        gunModel[254].addShapeBox(-0.75F, 3F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
        gunModel[254].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[254].rotateAngleZ = -0.41887902F;

        gunModel[255].addShapeBox(-0.75F, 5F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 352
        gunModel[255].setRotationPoint(7.5F, -15.5F, -3F);
        gunModel[255].rotateAngleZ = -0.41887902F;

        gunModel[256].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
        gunModel[256].setRotationPoint(9.5F, -23.5F, -3F);

        gunModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 354
        gunModel[257].setRotationPoint(9.5F, -18.5F, -3F);

        gunModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F); // Box 355
        gunModel[258].setRotationPoint(9.5F, -18.5F, -3F);

        gunModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 356
        gunModel[259].setRotationPoint(3F, -8F, -3F);

        gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F); // Box 357
        gunModel[260].setRotationPoint(5F, -7.5F, -3F);

        gunModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, -2.24F, -2F, 0F, -2.24F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F); // Box 358
        gunModel[261].setRotationPoint(5F, -9.5F, -3F);

        gunModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 359
        gunModel[262].setRotationPoint(3F, -10F, -3F);

        gunModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.75F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0.125F, -2F, -0.5F, 0.125F, -2F, 0F, 0F, 0F); // Box 360
        gunModel[263].setRotationPoint(5F, -7.5F, -3F);

        gunModel[264].addShapeBox(0F, 0F, 0F, 83, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 194
        gunModel[264].setRotationPoint(43F, -38.5F, -2F);

        gunModel[265].addShapeBox(0F, 0F, 0F, 82, 1, 4, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
        gunModel[265].setRotationPoint(43F, -39.5F, -2F);

        gunModel[266].addShapeBox(0F, 0F, 0F, 63, 1, 4, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
        gunModel[266].setRotationPoint(43F, -37.5F, -2F);

        gunModel[267].addShapeBox(0F, 0F, 0F, 83, 1, 4, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 197
        gunModel[267].setRotationPoint(43F, -38.5F, -2F);

        gunModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 198
        gunModel[268].setRotationPoint(43F, -39.5F, -2F);

        gunModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 199
        gunModel[269].setRotationPoint(45F, -39.5F, -2F);

        gunModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 200
        gunModel[270].setRotationPoint(47F, -39.5F, -2F);

        gunModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 201
        gunModel[271].setRotationPoint(49F, -39.5F, -2F);

        gunModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 202
        gunModel[272].setRotationPoint(51F, -39.5F, -2F);

        gunModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 203
        gunModel[273].setRotationPoint(61F, -39.5F, -2F);

        gunModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 204
        gunModel[274].setRotationPoint(59F, -39.5F, -2F);

        gunModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 205
        gunModel[275].setRotationPoint(57F, -39.5F, -2F);

        gunModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 206
        gunModel[276].setRotationPoint(55F, -39.5F, -2F);

        gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 207
        gunModel[277].setRotationPoint(53F, -39.5F, -2F);

        gunModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 208
        gunModel[278].setRotationPoint(71F, -39.5F, -2F);

        gunModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 209
        gunModel[279].setRotationPoint(69F, -39.5F, -2F);

        gunModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 210
        gunModel[280].setRotationPoint(67F, -39.5F, -2F);

        gunModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 211
        gunModel[281].setRotationPoint(65F, -39.5F, -2F);

        gunModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 212
        gunModel[282].setRotationPoint(63F, -39.5F, -2F);

        gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 213
        gunModel[283].setRotationPoint(81F, -39.5F, -2F);

        gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 214
        gunModel[284].setRotationPoint(79F, -39.5F, -2F);

        gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 215
        gunModel[285].setRotationPoint(77F, -39.5F, -2F);

        gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 216
        gunModel[286].setRotationPoint(75F, -39.5F, -2F);

        gunModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 217
        gunModel[287].setRotationPoint(73F, -39.5F, -2F);

        gunModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 218
        gunModel[288].setRotationPoint(91F, -39.5F, -2F);

        gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 219
        gunModel[289].setRotationPoint(89F, -39.5F, -2F);

        gunModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 220
        gunModel[290].setRotationPoint(87F, -39.5F, -2F);

        gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 221
        gunModel[291].setRotationPoint(85F, -39.5F, -2F);

        gunModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 222
        gunModel[292].setRotationPoint(83F, -39.5F, -2F);

        gunModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 223
        gunModel[293].setRotationPoint(101F, -39.5F, -2F);

        gunModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 224
        gunModel[294].setRotationPoint(99F, -39.5F, -2F);

        gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 225
        gunModel[295].setRotationPoint(97F, -39.5F, -2F);

        gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 226
        gunModel[296].setRotationPoint(95F, -39.5F, -2F);

        gunModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 227
        gunModel[297].setRotationPoint(93F, -39.5F, -2F);

        gunModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 228
        gunModel[298].setRotationPoint(111F, -39.5F, -2F);

        gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 229
        gunModel[299].setRotationPoint(109F, -39.5F, -2F);

        gunModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 230
        gunModel[300].setRotationPoint(107F, -39.5F, -2F);

        gunModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 231
        gunModel[301].setRotationPoint(105F, -39.5F, -2F);

        gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 232
        gunModel[302].setRotationPoint(103F, -39.5F, -2F);

        gunModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 234
        gunModel[303].setRotationPoint(119F, -39.5F, -2F);

        gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 235
        gunModel[304].setRotationPoint(117F, -39.5F, -2F);

        gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 236
        gunModel[305].setRotationPoint(115F, -39.5F, -2F);

        gunModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 237
        gunModel[306].setRotationPoint(113F, -39.5F, -2F);

        gunModel[307].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 436
        gunModel[307].setRotationPoint(43F, -35F, 2.5F);

        gunModel[308].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 437
        gunModel[308].setRotationPoint(43F, -34.5F, 2.5F);

        gunModel[309].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 438
        gunModel[309].setRotationPoint(43F, -36.5F, -3.5F);

        gunModel[310].addShapeBox(0F, 0F, 0F, 77, 1, 3, 0F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
        gunModel[310].setRotationPoint(43F, -30.5F, -1.5F);

        gunModel[311].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 441
        gunModel[311].setRotationPoint(54F, -29.5F, -2F);

        gunModel[312].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 442
        gunModel[312].setRotationPoint(54F, -29.5F, -2F);

        gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443
        gunModel[313].setRotationPoint(54F, -28.5F, -2F);

        gunModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 444
        gunModel[314].setRotationPoint(64F, -36.5F, -3.5F);

        gunModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 445
        gunModel[315].setRotationPoint(66F, -36.5F, -3.5F);

        gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 446
        gunModel[316].setRotationPoint(65F, -36.5F, -2.5F);

        gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 447
        gunModel[317].setRotationPoint(66F, -35.5F, -3.5F);

        gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F); // Box 448
        gunModel[318].setRotationPoint(63.5F, -36.5F, -2.5F);

        gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 449
        gunModel[319].setRotationPoint(64.5F, -35.5F, -3.5F);

        gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 450
        gunModel[320].setRotationPoint(56.5F, -35.5F, -3.5F);

        gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 451
        gunModel[321].setRotationPoint(55.5F, -36.5F, -2.5F);

        gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 453
        gunModel[322].setRotationPoint(66.5F, -36.5F, -2.5F);

        gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
        gunModel[323].setRotationPoint(67.5F, -35.5F, -3.5F);

        gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F); // Box 455
        gunModel[324].setRotationPoint(76.5F, -36.5F, -2.5F);

        gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
        gunModel[325].setRotationPoint(77.5F, -35.5F, -3.5F);

        gunModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 457
        gunModel[326].setRotationPoint(77F, -36.5F, -3.5F);

        gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 458
        gunModel[327].setRotationPoint(78F, -36.5F, -2.5F);

        gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 459
        gunModel[328].setRotationPoint(79F, -35.5F, -3.5F);

        gunModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 460
        gunModel[329].setRotationPoint(79F, -36.5F, -3.5F);

        gunModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 461
        gunModel[330].setRotationPoint(92F, -36.5F, -3.5F);

        gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 462
        gunModel[331].setRotationPoint(91F, -36.5F, -2.5F);

        gunModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 463
        gunModel[332].setRotationPoint(90F, -36.5F, -3.5F);

        gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F); // Box 464
        gunModel[333].setRotationPoint(89.5F, -36.5F, -2.5F);

        gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 465
        gunModel[334].setRotationPoint(90.5F, -35.5F, -3.5F);

        gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 466
        gunModel[335].setRotationPoint(92F, -35.5F, -3.5F);

        gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 467
        gunModel[336].setRotationPoint(79.5F, -36.5F, -2.5F);

        gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 468
        gunModel[337].setRotationPoint(80.5F, -35.5F, -3.5F);

        gunModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 469
        gunModel[338].setRotationPoint(105F, -36.5F, -3.5F);

        gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 470
        gunModel[339].setRotationPoint(104F, -36.5F, -2.5F);

        gunModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 471
        gunModel[340].setRotationPoint(103F, -36.5F, -3.5F);

        gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F); // Box 472
        gunModel[341].setRotationPoint(102.5F, -36.5F, -2.5F);

        gunModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 473
        gunModel[342].setRotationPoint(103.5F, -35.5F, -3.5F);

        gunModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 474
        gunModel[343].setRotationPoint(105F, -35.5F, -3.5F);

        gunModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 475
        gunModel[344].setRotationPoint(92.5F, -36.5F, -2.5F);

        gunModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 476
        gunModel[345].setRotationPoint(93.5F, -35.5F, -3.5F);

        gunModel[346].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 477
        gunModel[346].setRotationPoint(43F, -36.5F, 2.5F);

        gunModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 478
        gunModel[347].setRotationPoint(64F, -36.5F, 2.5F);

        gunModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 479
        gunModel[348].setRotationPoint(66F, -36.5F, 2.5F);

        gunModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 480
        gunModel[349].setRotationPoint(65F, -36.5F, 1.5F);

        gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
        gunModel[350].setRotationPoint(66F, -35.5F, 2.5F);

        gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F); // Box 482
        gunModel[351].setRotationPoint(63.5F, -36.5F, 1.5F);

        gunModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
        gunModel[352].setRotationPoint(64.5F, -35.5F, 2.5F);

        gunModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
        gunModel[353].setRotationPoint(56.5F, -35.5F, 2.5F);

        gunModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 485
        gunModel[354].setRotationPoint(55.5F, -36.5F, 1.5F);

        gunModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 486
        gunModel[355].setRotationPoint(66.5F, -36.5F, 1.5F);

        gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
        gunModel[356].setRotationPoint(67.5F, -35.5F, 2.5F);

        gunModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F); // Box 488
        gunModel[357].setRotationPoint(76.5F, -36.5F, 1.5F);

        gunModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
        gunModel[358].setRotationPoint(77.5F, -35.5F, 2.5F);

        gunModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 490
        gunModel[359].setRotationPoint(77F, -36.5F, 2.5F);

        gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 491
        gunModel[360].setRotationPoint(78F, -36.5F, 1.5F);

        gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
        gunModel[361].setRotationPoint(79F, -35.5F, 2.5F);

        gunModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 493
        gunModel[362].setRotationPoint(79F, -36.5F, 2.5F);

        gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 494
        gunModel[363].setRotationPoint(79.5F, -36.5F, 1.5F);

        gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
        gunModel[364].setRotationPoint(80.5F, -35.5F, 2.5F);

        gunModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 496
        gunModel[365].setRotationPoint(105F, -36.5F, 2.5F);

        gunModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 497
        gunModel[366].setRotationPoint(104F, -36.5F, 1.5F);

        gunModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 498
        gunModel[367].setRotationPoint(103F, -36.5F, 2.5F);

        gunModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F); // Box 499
        gunModel[368].setRotationPoint(102.5F, -36.5F, 1.5F);

        gunModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
        gunModel[369].setRotationPoint(103.5F, -35.5F, 2.5F);

        gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
        gunModel[370].setRotationPoint(105F, -35.5F, 2.5F);

        gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 502
        gunModel[371].setRotationPoint(92.5F, -36.5F, 1.5F);

        gunModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
        gunModel[372].setRotationPoint(93.5F, -35.5F, 2.5F);

        gunModel[373].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 504
        gunModel[373].setRotationPoint(43F, -31.5F, 2.5F);

        gunModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 505
        gunModel[374].setRotationPoint(55.5F, -30.5F, 1.5F);

        gunModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 506
        gunModel[375].setRotationPoint(56.5F, -31.5F, 2.5F);

        gunModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 507
        gunModel[376].setRotationPoint(62F, -31.5F, 2.5F);

        gunModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 508
        gunModel[377].setRotationPoint(61.5F, -30.5F, 1.5F);

        gunModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 509
        gunModel[378].setRotationPoint(62.5F, -31.5F, 2.5F);

        gunModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 510
        gunModel[379].setRotationPoint(63F, -30.5F, 1.5F);

        gunModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F); // Box 511
        gunModel[380].setRotationPoint(64F, -31.5F, 2.5F);

        gunModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 512
        gunModel[381].setRotationPoint(64F, -31.5F, 2.5F);

        gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 513
        gunModel[382].setRotationPoint(65.5F, -31.5F, 2.5F);

        gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
        gunModel[383].setRotationPoint(64.5F, -30.5F, 1.5F);

        gunModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 515
        gunModel[384].setRotationPoint(76.5F, -31.5F, 2.5F);

        gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 516
        gunModel[385].setRotationPoint(75.5F, -30.5F, 1.5F);

        gunModel[386].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 517
        gunModel[386].setRotationPoint(43F, -31.5F, -3.5F);

        gunModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
        gunModel[387].setRotationPoint(55.5F, -30.5F, -2.5F);

        gunModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 519
        gunModel[388].setRotationPoint(56.5F, -31.5F, -3.5F);

        gunModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 520
        gunModel[389].setRotationPoint(62F, -31.5F, -3.5F);

        gunModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
        gunModel[390].setRotationPoint(61.5F, -30.5F, -2.5F);

        gunModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 522
        gunModel[391].setRotationPoint(62.5F, -31.5F, -3.5F);

        gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
        gunModel[392].setRotationPoint(63F, -30.5F, -2.5F);

        gunModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F); // Box 524
        gunModel[393].setRotationPoint(64F, -31.5F, -3.5F);

        gunModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 525
        gunModel[394].setRotationPoint(64F, -31.5F, -3.5F);

        gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 526
        gunModel[395].setRotationPoint(65.5F, -31.5F, -3.5F);

        gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
        gunModel[396].setRotationPoint(64.5F, -30.5F, -2.5F);

        gunModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 528
        gunModel[397].setRotationPoint(76.5F, -31.5F, -3.5F);

        gunModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
        gunModel[398].setRotationPoint(75.5F, -30.5F, -2.5F);

        gunModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 530
        gunModel[399].setRotationPoint(90.5F, -31.5F, 2.5F);

        gunModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 531
        gunModel[400].setRotationPoint(89.5F, -30.5F, 1.5F);

        gunModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F); // Box 532
        gunModel[401].setRotationPoint(78F, -31.5F, 2.5F);

        gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 533
        gunModel[402].setRotationPoint(79.5F, -31.5F, 2.5F);

        gunModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 534
        gunModel[403].setRotationPoint(78F, -31.5F, 2.5F);

        gunModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 535
        gunModel[404].setRotationPoint(78.5F, -30.5F, 1.5F);

        gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 536
        gunModel[405].setRotationPoint(77F, -30.5F, 1.5F);

        gunModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 537
        gunModel[406].setRotationPoint(76F, -31.5F, 2.5F);

        gunModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
        gunModel[407].setRotationPoint(89.5F, -30.5F, -2.5F);

        gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 539
        gunModel[408].setRotationPoint(90.5F, -31.5F, -3.5F);

        gunModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 540
        gunModel[409].setRotationPoint(78F, -31.5F, -3.5F);

        gunModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 541
        gunModel[410].setRotationPoint(79.5F, -31.5F, -3.5F);

        gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
        gunModel[411].setRotationPoint(78.5F, -30.5F, -2.5F);

        gunModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
        gunModel[412].setRotationPoint(77F, -30.5F, -2.5F);

        gunModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 544
        gunModel[413].setRotationPoint(76F, -31.5F, -3.5F);

        gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F); // Box 545
        gunModel[414].setRotationPoint(78F, -31.5F, -3.5F);

        gunModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 546
        gunModel[415].setRotationPoint(104.5F, -31.5F, 2.5F);

        gunModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 547
        gunModel[416].setRotationPoint(103.5F, -30.5F, 1.5F);

        gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F); // Box 548
        gunModel[417].setRotationPoint(92F, -31.5F, 2.5F);

        gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 549
        gunModel[418].setRotationPoint(93.5F, -31.5F, 2.5F);

        gunModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 550
        gunModel[419].setRotationPoint(92F, -31.5F, 2.5F);

        gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 551
        gunModel[420].setRotationPoint(92.5F, -30.5F, 1.5F);

        gunModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 552
        gunModel[421].setRotationPoint(91F, -30.5F, 1.5F);

        gunModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 553
        gunModel[422].setRotationPoint(90F, -31.5F, 2.5F);

        gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
        gunModel[423].setRotationPoint(103.5F, -30.5F, -2.5F);

        gunModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 555
        gunModel[424].setRotationPoint(104.5F, -31.5F, -3.5F);

        gunModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 556
        gunModel[425].setRotationPoint(92F, -31.5F, -3.5F);

        gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 557
        gunModel[426].setRotationPoint(93.5F, -31.5F, -3.5F);

        gunModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
        gunModel[427].setRotationPoint(92.5F, -30.5F, -2.5F);

        gunModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
        gunModel[428].setRotationPoint(91F, -30.5F, -2.5F);

        gunModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 560
        gunModel[429].setRotationPoint(90F, -31.5F, -3.5F);

        gunModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F); // Box 561
        gunModel[430].setRotationPoint(92F, -31.5F, -3.5F);

        gunModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F); // Box 562
        gunModel[431].setRotationPoint(117.5F, -31.5F, 2.5F);

        gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 563
        gunModel[432].setRotationPoint(116.5F, -30.5F, 1.5F);

        gunModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F); // Box 564
        gunModel[433].setRotationPoint(106F, -31.5F, 2.5F);

        gunModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 565
        gunModel[434].setRotationPoint(107.5F, -31.5F, 2.5F);

        gunModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 566
        gunModel[435].setRotationPoint(106F, -31.5F, 2.5F);

        gunModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 567
        gunModel[436].setRotationPoint(106.5F, -30.5F, 1.5F);

        gunModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 568
        gunModel[437].setRotationPoint(105F, -30.5F, 1.5F);

        gunModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 569
        gunModel[438].setRotationPoint(104F, -31.5F, 2.5F);

        gunModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
        gunModel[439].setRotationPoint(116.5F, -30.5F, -2.5F);

        gunModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 571
        gunModel[440].setRotationPoint(117.5F, -31.5F, -3.5F);

        gunModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 572
        gunModel[441].setRotationPoint(106F, -31.5F, -3.5F);

        gunModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 573
        gunModel[442].setRotationPoint(107.5F, -31.5F, -3.5F);

        gunModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
        gunModel[443].setRotationPoint(106.5F, -30.5F, -2.5F);

        gunModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
        gunModel[444].setRotationPoint(105F, -30.5F, -2.5F);

        gunModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 576
        gunModel[445].setRotationPoint(104F, -31.5F, -3.5F);

        gunModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F); // Box 577
        gunModel[446].setRotationPoint(106F, -31.5F, -3.5F);

        gunModel[447].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 578
        gunModel[447].setRotationPoint(118.5F, -36.5F, -3.5F);

        gunModel[448].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 579
        gunModel[448].setRotationPoint(122F, -34.5F, -3.5F);

        gunModel[449].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 580
        gunModel[449].setRotationPoint(122F, -35F, -3.5F);

        gunModel[450].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 583
        gunModel[450].setRotationPoint(118.5F, -36.5F, 2.5F);

        gunModel[451].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 584
        gunModel[451].setRotationPoint(122F, -34.5F, 2.5F);

        gunModel[452].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 585
        gunModel[452].setRotationPoint(122F, -35F, 2.5F);

        gunModel[453].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 586
        gunModel[453].setRotationPoint(117F, -31.5F, 2.5F);

        gunModel[454].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 587
        gunModel[454].setRotationPoint(117F, -31.5F, -3.5F);

        gunModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 588
        gunModel[455].setRotationPoint(48F, -29.5F, -3.5F);

        gunModel[456].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F); // Box 589
        gunModel[456].setRotationPoint(46F, -31.5F, -3.5F);

        gunModel[457].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 590
        gunModel[457].setRotationPoint(52F, -31.5F, -3.5F);

        gunModel[458].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 591
        gunModel[458].setRotationPoint(43F, -28.51F, -1.5F);

        gunModel[459].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 592
        gunModel[459].setRotationPoint(43F, -29.51F, -1.5F);

        gunModel[460].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 593
        gunModel[460].setRotationPoint(43F, -29.51F, -1.5F);

        gunModel[461].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
        gunModel[461].setRotationPoint(47F, -31.5F, -3.5F);

        gunModel[462].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
        gunModel[462].setRotationPoint(47F, -29F, -3.5F);

        gunModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 597
        gunModel[463].setRotationPoint(47F, -29F, -3.5F);

        gunModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 598
        gunModel[464].setRotationPoint(47F, -29F, -3.5F);

        gunModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 599
        gunModel[465].setRotationPoint(47F, -30F, -3.5F);

        gunModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 600
        gunModel[466].setRotationPoint(47F, -30F, -3.5F);

        gunModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F); // Box 601
        gunModel[467].setRotationPoint(51F, -30F, -3.5F);

        gunModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 602
        gunModel[468].setRotationPoint(51F, -30F, -3.5F);

        gunModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 603
        gunModel[469].setRotationPoint(51F, -29F, -3.5F);

        gunModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 604
        gunModel[470].setRotationPoint(51F, -29F, -3.5F);

        gunModel[471].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
        gunModel[471].setRotationPoint(47F, -29.5F, -3F);

        gunModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 606
        gunModel[472].setRotationPoint(50F, -29.5F, -3.5F);

        gunModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 607
        gunModel[473].setRotationPoint(49F, -29.75F, -3.5F);

        gunModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.25F, -0.375F, 0F); // Box 608
        gunModel[474].setRotationPoint(49F, -29.5F, -3.5F);

        gunModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.625F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.5F, 0F); // Box 609
        gunModel[475].setRotationPoint(49F, -29.5F, -3.5F);

        gunModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.625F, -0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 610
        gunModel[476].setRotationPoint(49F, -29F, -3.5F);

        gunModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.25F, -0.375F, 0F); // Box 611
        gunModel[477].setRotationPoint(49F, -29F, -3.5F);

        gunModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 612
        gunModel[478].setRotationPoint(56F, -28.5F, -2F);

        gunModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 613
        gunModel[479].setRotationPoint(60F, -28.5F, -2F);

        gunModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 614
        gunModel[480].setRotationPoint(62F, -28.5F, -2F);

        gunModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 615
        gunModel[481].setRotationPoint(58F, -28.5F, -2F);

        gunModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 616
        gunModel[482].setRotationPoint(68F, -28.5F, -2F);

        gunModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 617
        gunModel[483].setRotationPoint(66F, -28.5F, -2F);

        gunModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 618
        gunModel[484].setRotationPoint(64F, -28.5F, -2F);

        gunModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 619
        gunModel[485].setRotationPoint(70F, -28.5F, -2F);

        gunModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 620
        gunModel[486].setRotationPoint(72F, -28.5F, -2F);

        gunModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
        gunModel[487].setRotationPoint(88F, -28.5F, -2F);

        gunModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 622
        gunModel[488].setRotationPoint(86F, -28.5F, -2F);

        gunModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 623
        gunModel[489].setRotationPoint(84F, -28.5F, -2F);

        gunModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 624
        gunModel[490].setRotationPoint(90F, -28.5F, -2F);

        gunModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 625
        gunModel[491].setRotationPoint(92F, -28.5F, -2F);

        gunModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 626
        gunModel[492].setRotationPoint(98F, -28.5F, -2F);

        gunModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 627
        gunModel[493].setRotationPoint(96F, -28.5F, -2F);

        gunModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 628
        gunModel[494].setRotationPoint(94F, -28.5F, -2F);

        gunModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 629
        gunModel[495].setRotationPoint(100F, -28.5F, -2F);

        gunModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
        gunModel[496].setRotationPoint(102F, -28.5F, -2F);

        gunModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 631
        gunModel[497].setRotationPoint(108F, -28.5F, -2F);

        gunModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 632
        gunModel[498].setRotationPoint(106F, -28.5F, -2F);

        gunModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 633
        gunModel[499].setRotationPoint(104F, -28.5F, -2F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 634
        gunModel[501] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 635
        gunModel[502] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 636
        gunModel[503] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 637
        gunModel[504] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 638
        gunModel[505] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 647
        gunModel[506] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 685
        gunModel[507] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 686
        gunModel[508] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 687
        gunModel[509] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 688
        gunModel[510] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 689
        gunModel[511] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 690
        gunModel[512] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 691
        gunModel[513] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 692
        gunModel[514] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 693
        gunModel[515] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 694
        gunModel[516] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 695
        gunModel[517] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 696
        gunModel[518] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 697
        gunModel[519] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 698
        gunModel[520] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 699
        gunModel[521] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 700
        gunModel[522] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 701
        gunModel[523] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 702
        gunModel[524] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 703
        gunModel[525] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 704
        gunModel[526] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 705
        gunModel[527] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 706
        gunModel[528] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 707
        gunModel[529] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 708
        gunModel[530] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 709
        gunModel[531] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 710
        gunModel[532] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 711
        gunModel[533] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 712
        gunModel[534] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 713
        gunModel[535] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 714
        gunModel[536] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 715
        gunModel[537] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 716
        gunModel[538] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 717
        gunModel[539] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 718
        gunModel[540] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 719
        gunModel[541] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 720
        gunModel[542] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 721
        gunModel[543] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 722
        gunModel[544] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 723
        gunModel[545] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 724
        gunModel[546] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 725
        gunModel[547] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 726
        gunModel[548] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 727
        gunModel[549] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 728
        gunModel[550] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 729
        gunModel[551] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 730
        gunModel[552] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 731
        gunModel[553] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 732
        gunModel[554] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 733
        gunModel[555] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 734
        gunModel[556] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 735
        gunModel[557] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 736
        gunModel[558] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 737
        gunModel[559] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 738
        gunModel[560] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 739
        gunModel[561] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 740
        gunModel[562] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 741
        gunModel[563] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 742
        gunModel[564] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 743
        gunModel[565] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 744
        gunModel[566] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 745
        gunModel[567] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 746
        gunModel[568] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 747
        gunModel[569] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 748
        gunModel[570] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 749
        gunModel[571] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 750
        gunModel[572] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 751
        gunModel[573] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 752
        gunModel[574] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 753
        gunModel[575] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 754
        gunModel[576] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 755
        gunModel[577] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 756
        gunModel[578] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 758
        gunModel[579] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 759
        gunModel[580] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 761
        gunModel[581] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 243
        gunModel[582] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 244
        gunModel[583] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 245
        gunModel[584] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 392
        gunModel[585] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 393
        gunModel[586] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 394
        gunModel[587] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 395
        gunModel[588] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 396
        gunModel[589] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 397
        gunModel[590] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 398
        gunModel[591] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 421
        gunModel[592] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 422
        gunModel[593] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 423
        gunModel[594] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 424
        gunModel[595] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 425
        gunModel[596] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 426
        gunModel[597] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 427
        gunModel[598] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 428
        gunModel[599] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 429
        gunModel[600] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 430
        gunModel[601] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 431
        gunModel[602] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 432
        gunModel[603] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 433
        gunModel[604] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 434
        gunModel[605] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 435
        gunModel[606] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 402
        gunModel[607] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 403
        gunModel[608] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 404
        gunModel[609] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 405
        gunModel[610] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 406
        gunModel[611] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 408
        gunModel[612] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 409
        gunModel[613] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 410
        gunModel[614] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 411
        gunModel[615] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 412
        gunModel[616] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 413
        gunModel[617] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 414
        gunModel[618] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 415
        gunModel[619] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 416
        gunModel[620] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 417
        gunModel[621] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 418
        gunModel[622] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 419
        gunModel[623] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 420
        gunModel[624] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 496
        gunModel[625] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 635
        gunModel[626] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 639
        gunModel[627] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 640
        gunModel[628] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 644
        gunModel[629] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 645
        gunModel[630] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 646
        gunModel[631] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 647
        gunModel[632] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 638
        gunModel[633] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 656
        gunModel[634] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Box 657
        gunModel[635] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 658
        gunModel[636] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 659
        gunModel[637] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 660
        gunModel[638] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 661
        gunModel[639] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 662
        gunModel[640] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 663
        gunModel[641] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 664
        gunModel[642] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 665
        gunModel[643] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 666
        gunModel[644] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Box 667
        gunModel[645] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 659
        gunModel[646] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 656
        gunModel[647] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 659
        gunModel[648] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Box 660
        gunModel[649] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 660
        gunModel[650] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 660
        gunModel[651] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 660
        gunModel[652] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 661
        gunModel[653] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 661
        gunModel[654] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Box 661
        gunModel[655] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 661
        gunModel[656] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Box 661
        gunModel[657] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Box 496
        gunModel[658] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 1305
        gunModel[659] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 1305

        gunModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 634
        gunModel[500].setRotationPoint(110F, -28.5F, -2F);

        gunModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 635
        gunModel[501].setRotationPoint(112F, -28.5F, -2F);

        gunModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 636
        gunModel[502].setRotationPoint(118F, -28.5F, -2F);

        gunModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 637
        gunModel[503].setRotationPoint(116F, -28.5F, -2F);

        gunModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 638
        gunModel[504].setRotationPoint(114F, -28.5F, -2F);

        gunModel[505].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 647
        gunModel[505].setRotationPoint(121F, -39.5F, -2F);

        gunModel[506].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 685
        gunModel[506].setRotationPoint(115F, -37.5F, -2F);

        gunModel[507].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 686
        gunModel[507].setRotationPoint(115F, -37.5F, 1F);

        gunModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
        gunModel[508].setRotationPoint(119F, -35.5F, 2.5F);

        gunModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F); // Box 688
        gunModel[509].setRotationPoint(118F, -36.5F, 1.5F);

        gunModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F); // Box 689
        gunModel[510].setRotationPoint(118F, -36.5F, -2.5F);

        gunModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 690
        gunModel[511].setRotationPoint(119F, -35.5F, -3.5F);

        gunModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 691
        gunModel[512].setRotationPoint(92F, -36.5F, 2.5F);

        gunModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Box 692
        gunModel[513].setRotationPoint(91F, -36.5F, 1.5F);

        gunModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
        gunModel[514].setRotationPoint(92F, -35.5F, 2.5F);

        gunModel[515].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 694
        gunModel[515].setRotationPoint(90F, -36.5F, 2.5F);

        gunModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
        gunModel[516].setRotationPoint(90.5F, -35.5F, 2.5F);

        gunModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F); // Box 696
        gunModel[517].setRotationPoint(89.5F, -36.5F, 1.5F);

        gunModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 697
        gunModel[518].setRotationPoint(82F, -28.5F, -2F);

        gunModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 698
        gunModel[519].setRotationPoint(80F, -28.5F, -2F);

        gunModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 699
        gunModel[520].setRotationPoint(78F, -28.5F, -2F);

        gunModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 700
        gunModel[521].setRotationPoint(76F, -28.5F, -2F);

        gunModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 701
        gunModel[522].setRotationPoint(74F, -28.5F, -2F);

        gunModel[523].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 702
        gunModel[523].setRotationPoint(43F, -32F, 2.5F);

        gunModel[524].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 703
        gunModel[524].setRotationPoint(43F, -32.5F, 2.5F);

        gunModel[525].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 704
        gunModel[525].setRotationPoint(43F, -33.5F, 2.5F);

        gunModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 705
        gunModel[526].setRotationPoint(66F, -33.5F, 2.5F);

        gunModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 706
        gunModel[527].setRotationPoint(66F, -34F, 2.5F);

        gunModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 707
        gunModel[528].setRotationPoint(66F, -33F, 2.5F);

        gunModel[529].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 708
        gunModel[529].setRotationPoint(43F, -34F, 2.5F);

        gunModel[530].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 709
        gunModel[530].setRotationPoint(43F, -33F, 2.5F);

        gunModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 710
        gunModel[531].setRotationPoint(74F, -33F, 2.5F);

        gunModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 711
        gunModel[532].setRotationPoint(74F, -34F, 2.5F);

        gunModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 712
        gunModel[533].setRotationPoint(74F, -33.5F, 2.5F);

        gunModel[534].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 713
        gunModel[534].setRotationPoint(43F, -33.5F, -3.5F);

        gunModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 714
        gunModel[535].setRotationPoint(66F, -33.5F, -3.5F);

        gunModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 715
        gunModel[536].setRotationPoint(66F, -34F, -3.5F);

        gunModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 716
        gunModel[537].setRotationPoint(66F, -33F, -3.5F);

        gunModel[538].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 717
        gunModel[538].setRotationPoint(43F, -34F, -3.5F);

        gunModel[539].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 718
        gunModel[539].setRotationPoint(43F, -33F, -3.5F);

        gunModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 719
        gunModel[540].setRotationPoint(74F, -33F, -3.5F);

        gunModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 720
        gunModel[541].setRotationPoint(74F, -34F, -3.5F);

        gunModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 721
        gunModel[542].setRotationPoint(74F, -33.5F, -3.5F);

        gunModel[543].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 722
        gunModel[543].setRotationPoint(43F, -35F, -3.5F);

        gunModel[544].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 723
        gunModel[544].setRotationPoint(43F, -32F, -3.5F);

        gunModel[545].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 724
        gunModel[545].setRotationPoint(43F, -34.5F, -3.5F);

        gunModel[546].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 725
        gunModel[546].setRotationPoint(43F, -32.5F, -3.5F);

        gunModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 726
        gunModel[547].setRotationPoint(82F, -34F, -3.5F);

        gunModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 727
        gunModel[548].setRotationPoint(82F, -33.5F, -3.5F);

        gunModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 728
        gunModel[549].setRotationPoint(82F, -33F, -3.5F);

        gunModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 729
        gunModel[550].setRotationPoint(82F, -34F, 2.5F);

        gunModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 730
        gunModel[551].setRotationPoint(82F, -33.5F, 2.5F);

        gunModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 731
        gunModel[552].setRotationPoint(82F, -33F, 2.5F);

        gunModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 732
        gunModel[553].setRotationPoint(90F, -34F, -3.5F);

        gunModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 733
        gunModel[554].setRotationPoint(90F, -33.5F, -3.5F);

        gunModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 734
        gunModel[555].setRotationPoint(90F, -33F, -3.5F);

        gunModel[556].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 735
        gunModel[556].setRotationPoint(90F, -34F, 2.5F);

        gunModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 736
        gunModel[557].setRotationPoint(90F, -33.5F, 2.5F);

        gunModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 737
        gunModel[558].setRotationPoint(90F, -33F, 2.5F);

        gunModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 738
        gunModel[559].setRotationPoint(98F, -34F, -3.5F);

        gunModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 739
        gunModel[560].setRotationPoint(98F, -33.5F, -3.5F);

        gunModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 740
        gunModel[561].setRotationPoint(98F, -33F, -3.5F);

        gunModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 741
        gunModel[562].setRotationPoint(98F, -34F, 2.5F);

        gunModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 742
        gunModel[563].setRotationPoint(98F, -33.5F, 2.5F);

        gunModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 743
        gunModel[564].setRotationPoint(98F, -33F, 2.5F);

        gunModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 744
        gunModel[565].setRotationPoint(106F, -34F, -3.5F);

        gunModel[566].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 745
        gunModel[566].setRotationPoint(106F, -33.5F, -3.5F);

        gunModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 746
        gunModel[567].setRotationPoint(106F, -33F, -3.5F);

        gunModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 747
        gunModel[568].setRotationPoint(106F, -34F, 2.5F);

        gunModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 748
        gunModel[569].setRotationPoint(106F, -33.5F, 2.5F);

        gunModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 749
        gunModel[570].setRotationPoint(106F, -33F, 2.5F);

        gunModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 750
        gunModel[571].setRotationPoint(114F, -34F, -3.5F);

        gunModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 751
        gunModel[572].setRotationPoint(114F, -33.5F, -3.5F);

        gunModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 752
        gunModel[573].setRotationPoint(114F, -33F, -3.5F);

        gunModel[574].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 753
        gunModel[574].setRotationPoint(114F, -34F, 2.5F);

        gunModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 754
        gunModel[575].setRotationPoint(114F, -33.5F, 2.5F);

        gunModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 755
        gunModel[576].setRotationPoint(114F, -33F, 2.5F);

        gunModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 756
        gunModel[577].setRotationPoint(122F, -34F, -3.5F);

        gunModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 758
        gunModel[578].setRotationPoint(122F, -33F, -3.5F);

        gunModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 759
        gunModel[579].setRotationPoint(122F, -34F, 2.5F);

        gunModel[580].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 761
        gunModel[580].setRotationPoint(122F, -33F, 2.5F);

        gunModel[581].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F); // Box 243
        gunModel[581].setRotationPoint(46F, -33.5F, -2F);

        gunModel[582].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F); // Box 244
        gunModel[582].setRotationPoint(46F, -34.5F, -2F);

        gunModel[583].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F, 0F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F); // Box 245
        gunModel[583].setRotationPoint(46F, -35.5F, -1.5F);

        gunModel[584].addShapeBox(0F, 0F, 0F, 62, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        gunModel[584].setRotationPoint(96F, -33.5F, -2F);

        gunModel[585].addShapeBox(0F, 0F, 0F, 62, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
        gunModel[585].setRotationPoint(96F, -34.5F, -2F);

        gunModel[586].addShapeBox(0F, 0F, 0F, 62, 1, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
        gunModel[586].setRotationPoint(96F, -35.5F, -1.5F);

        gunModel[587].addShapeBox(0F, 0F, 0F, 62, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 395
        gunModel[587].setRotationPoint(96F, -32.5F, -2F);

        gunModel[588].addShapeBox(0F, 0F, 0F, 62, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 396
        gunModel[588].setRotationPoint(96F, -31.5F, -1.5F);

        gunModel[589].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 397
        gunModel[589].setRotationPoint(46F, -32.5F, -2F);

        gunModel[590].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -1F); // Box 398
        gunModel[590].setRotationPoint(46F, -31.5F, -1.5F);

        gunModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F); // Box 421
        gunModel[591].setRotationPoint(154F, -33.5F, -2F);

        gunModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F); // Box 422
        gunModel[592].setRotationPoint(154F, -34.5F, -2F);

        gunModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F); // Box 423
        gunModel[593].setRotationPoint(154F, -35.5F, -1.5F);

        gunModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 424
        gunModel[594].setRotationPoint(153F, -35.5F, -1.5F);

        gunModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 425
        gunModel[595].setRotationPoint(153F, -34.5F, -2F);

        gunModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 426
        gunModel[596].setRotationPoint(153F, -33.5F, -2F);

        gunModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 427
        gunModel[597].setRotationPoint(153F, -31.5F, -1.5F);

        gunModel[598].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 428
        gunModel[598].setRotationPoint(153F, -32.5F, -2F);

        gunModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0.25F, -1F); // Box 429
        gunModel[599].setRotationPoint(154F, -31.5F, -1.5F);

        gunModel[600].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 430
        gunModel[600].setRotationPoint(154F, -32.5F, -2F);

        gunModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, -0.5F, -1F); // Box 431
        gunModel[601].setRotationPoint(152F, -31.5F, -1.5F);

        gunModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F); // Box 432
        gunModel[602].setRotationPoint(152F, -32.5F, -2F);

        gunModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0F); // Box 433
        gunModel[603].setRotationPoint(152F, -33.5F, -2F);

        gunModel[604].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0F); // Box 434
        gunModel[604].setRotationPoint(152F, -34.5F, -2F);

        gunModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.5F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F); // Box 435
        gunModel[605].setRotationPoint(152F, -35.5F, -1.5F);

        gunModel[606].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
        gunModel[606].setRotationPoint(107F, -34F, -2.5F);

        gunModel[607].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F); // Box 403
        gunModel[607].setRotationPoint(107F, -30.5F, -2.5F);

        gunModel[608].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
        gunModel[608].setRotationPoint(107F, -35F, -2.5F);

        gunModel[609].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
        gunModel[609].setRotationPoint(107F, -37F, -1.5F);

        gunModel[610].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 406
        gunModel[610].setRotationPoint(107F, -37.75F, -1.5F);

        gunModel[611].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 408
        gunModel[611].setRotationPoint(113.5F, -37F, -1.5F);

        gunModel[612].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 409
        gunModel[612].setRotationPoint(112.5F, -37F, -1.5F);

        gunModel[613].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 410
        gunModel[613].setRotationPoint(108F, -37F, -1.5F);

        gunModel[614].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
        gunModel[614].setRotationPoint(107F, -32.5F, -2.5F);

        gunModel[615].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
        gunModel[615].setRotationPoint(107F, -34.5F, -2.5F);

        gunModel[616].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 413
        gunModel[616].setRotationPoint(113F, -33.5F, -2.5F);

        gunModel[617].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 414
        gunModel[617].setRotationPoint(108F, -34F, -2.5F);

        gunModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 415
        gunModel[618].setRotationPoint(108F, -31.5F, -2.5F);

        gunModel[619].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 416
        gunModel[619].setRotationPoint(108F, -32F, -2.5F);

        gunModel[620].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 417
        gunModel[620].setRotationPoint(108F, -31F, -2.5F);

        gunModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Box 418
        gunModel[621].setRotationPoint(112F, -31F, -2.5F);

        gunModel[622].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 419
        gunModel[622].setRotationPoint(112F, -31.5F, -2.5F);

        gunModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 420
        gunModel[623].setRotationPoint(112F, -32F, -2.5F);

        gunModel[624].addShapeBox(-2.5F, 0F, 0F, 1, 6, 4, 0F, 0F, -1.4F, -1F, 0F, -1.4F, -0.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, 1F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 496
        gunModel[624].setRotationPoint(18.5F, -38F, -5.5F);
        gunModel[624].rotateAngleX = -0.17453293F;

        gunModel[625].addShapeBox(0F, 1F, -0.7F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
        gunModel[625].setRotationPoint(18F, -36.5F, -3F);

        gunModel[626].addShapeBox(0F, 1F, -0.7F, 22, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 639
        gunModel[626].setRotationPoint(18F, -38.5F, -2.2F);

        gunModel[627].addShapeBox(0F, 1F, -0.7F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
        gunModel[627].setRotationPoint(39F, -36.5F, -3F);

        gunModel[628].addShapeBox(0F, 1F, -0.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0F, 0F, -1F, 0F); // Box 644
        gunModel[628].setRotationPoint(38F, -36.5F, -3F);

        gunModel[629].addShapeBox(0F, 1F, -0.7F, 1, 1, 2, 0F, 0F, -1F, 0.5F, 0F, 0.55F, 0.3F, 0F, 0.55F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
        gunModel[629].setRotationPoint(38F, -33.5F, -3F);

        gunModel[630].addShapeBox(0F, 1F, -0.7F, 1, 1, 2, 0F, 0F, 0.55F, 0.3F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
        gunModel[630].setRotationPoint(20F, -33.5F, -3F);

        gunModel[631].addShapeBox(0F, 1F, -0.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0F); // Box 647
        gunModel[631].setRotationPoint(20F, -36.5F, -3F);

        gunModel[632].addShapeBox(0F, 1F, -0.7F, 22, 2, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
        gunModel[632].setRotationPoint(18F, -32.5F, -3F);

        gunModel[633].addShapeBox(7F, 0F, -0.7F, 1, 3, 1, 0F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F); // Box 656
        gunModel[633].setRotationPoint(32F, -31.5F, -4.2F);
        gunModel[633].rotateAngleX = -0.19198622F;

        gunModel[634].addShapeBox(-9.5F, 0F, -0.7F, 20, 4, 1, 0F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 657
        gunModel[634].setRotationPoint(29F, -31.5F, -4.2F);
        gunModel[634].rotateAngleX = -0.19198622F;

        gunModel[635].addShapeBox(-9F, 4F, -0.7F, 21, 1, 1, 0F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.95F, -0.35F, -0.25F, -0.95F, -0.35F, -0.25F, -0.95F, -0.35F, -0.25F, -0.95F, -0.35F, -0.25F); // Box 658
        gunModel[635].setRotationPoint(28F, -31.5F, -4.2F);
        gunModel[635].rotateAngleX = -0.19198622F;

        gunModel[636].addShapeBox(-1.5F, 3F, -0.7F, 4, 1, 1, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, 0F, -0.25F, 0.55F, 0F, -0.25F, 0.55F, 0F, -0.25F, 0.55F, 0F, -0.25F); // Box 659
        gunModel[636].setRotationPoint(31F, -31.5F, -4.2F);
        gunModel[636].rotateAngleX = -0.19198622F;

        gunModel[637].addShapeBox(-1.5F, 0F, -0.7F, 4, 3, 1, 0F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F); // Box 660
        gunModel[637].setRotationPoint(31F, -31.5F, -4.2F);
        gunModel[637].rotateAngleX = -0.19198622F;

        gunModel[638].addShapeBox(0F, -0.5F, -0.7F, 4, 1, 1, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 661
        gunModel[638].setRotationPoint(29.5F, -31.5F, -4.2F);
        gunModel[638].rotateAngleX = -0.19198622F;

        gunModel[639].addShapeBox(-1.5F, 1F, -1.2F, 2, 3, 1, 0F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 662
        gunModel[639].setRotationPoint(32F, -31.5F, -4.2F);
        gunModel[639].rotateAngleX = -0.19198622F;

        gunModel[640].addShapeBox(-1.5F, 4F, -1.2F, 2, 1, 1, 0F, -0.85F, 0F, -0.4F, -0.85F, 0F, -0.4F, -0.65F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.85F, -0.6F, -0.4F, -0.85F, -0.6F, -0.4F, -0.65F, -0.6F, -0.25F, -0.65F, -0.6F, -0.25F); // Box 663
        gunModel[640].setRotationPoint(32F, -31.5F, -4.2F);
        gunModel[640].rotateAngleX = -0.19198622F;

        gunModel[641].addShapeBox(0F, 1F, -0.7F, 1, 2, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 664
        gunModel[641].setRotationPoint(18.5F, -33.5F, -4F);

        gunModel[642].addShapeBox(0F, 1F, -0.7F, 1, 1, 2, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 665
        gunModel[642].setRotationPoint(40F, -33F, -4F);

        gunModel[643].addShapeBox(0F, 1F, -0.7F, 24, 1, 1, 0F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 666
        gunModel[643].setRotationPoint(18F, -33F, -4.2F);

        gunModel[644].addShapeBox(0F, 1F, -0.7F, 24, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 667
        gunModel[644].setRotationPoint(18F, -33F, -4.2F);

        gunModel[645].addShapeBox(-1.5F, 3F, -0.7F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0.55F, 0F, -0.25F); // Box 659
        gunModel[645].setRotationPoint(40.5F, -31.5F, -4.2F);
        gunModel[645].rotateAngleX = -0.19198622F;

        gunModel[646].addShapeBox(-9F, 0F, -0.7F, 1, 3, 1, 0F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F); // Box 656
        gunModel[646].setRotationPoint(28F, -31.5F, -4.2F);
        gunModel[646].rotateAngleX = -0.19198622F;

        gunModel[647].addShapeBox(-1.5F, 3F, -0.7F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, 0F, -0.25F, 0.55F, 0F, -0.25F, 0.55F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 659
        gunModel[647].setRotationPoint(20.5F, -31.5F, -4.2F);
        gunModel[647].rotateAngleX = -0.19198622F;

        gunModel[648].addShapeBox(-1.5F, 0F, -0.7F, 9, 3, 1, 0F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, 0.125F, -0.25F, 0.05F, 0.125F, -0.25F, 0.05F, 0.125F, -0.25F, 0.05F, 0.125F, -0.25F); // Box 660
        gunModel[648].setRotationPoint(21.75F, -31.5F, -4.2F);
        gunModel[648].rotateAngleX = -0.19198622F;

        gunModel[649].addShapeBox(-1.5F, 2.5F, -0.7F, 9, 1, 1, 0F, 0.05F, -0.625F, -0.25F, 0.05F, -0.625F, -0.25F, 0.05F, -0.625F, -0.25F, 0.05F, -0.625F, -0.25F, -0.45F, 0.125F, -0.25F, -0.45F, 0.125F, -0.25F, -0.45F, 0.125F, -0.25F, -0.45F, 0.125F, -0.25F); // Box 660
        gunModel[649].setRotationPoint(21.75F, -31.5F, -4.2F);
        gunModel[649].rotateAngleX = -0.19198622F;

        gunModel[650].addShapeBox(-1.5F, 0F, -0.7F, 5, 3, 1, 0F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, -0.5F, -0.25F, 0.05F, 0.125F, -0.25F, 0.05F, 0.125F, -0.25F, 0.05F, 0.125F, -0.25F, 0.05F, 0.125F, -0.25F); // Box 660
        gunModel[650].setRotationPoint(35.25F, -31.5F, -4.2F);
        gunModel[650].rotateAngleX = -0.19198622F;

        gunModel[651].addShapeBox(-1.5F, 2.5F, -0.7F, 5, 1, 1, 0F, 0.05F, -0.625F, -0.25F, 0.05F, -0.625F, -0.25F, 0.05F, -0.625F, -0.25F, 0.05F, -0.625F, -0.25F, -0.45F, 0.125F, -0.25F, -0.45F, 0.125F, -0.25F, -0.45F, 0.125F, -0.25F, -0.45F, 0.125F, -0.25F); // Box 660
        gunModel[651].setRotationPoint(35.25F, -31.5F, -4.2F);
        gunModel[651].rotateAngleX = -0.19198622F;

        gunModel[652].addShapeBox(0F, -0.5F, -0.7F, 11, 1, 1, 0F, -0.7F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, -0.25F, -0.7F, -0.6F, -0.25F, -0.7F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.7F, 0F, -0.25F); // Box 661
        gunModel[652].setRotationPoint(18.5F, -31.5F, -4.2F);
        gunModel[652].rotateAngleX = -0.19198622F;

        gunModel[653].addShapeBox(0F, -0.5F, -0.7F, 7, 1, 1, 0F, -0.2F, -0.6F, 0F, -0.7F, -0.6F, 0F, -0.7F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 661
        gunModel[653].setRotationPoint(33.5F, -31.5F, -4.2F);
        gunModel[653].rotateAngleX = -0.19198622F;

        gunModel[654].addShapeBox(0F, -0.3F, -0.7F, 4, 1, 1, 0F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F); // Box 661
        gunModel[654].setRotationPoint(29.5F, -31.5F, -4.2F);
        gunModel[654].rotateAngleX = -0.19198622F;

        gunModel[655].addShapeBox(0F, -0.3F, -0.7F, 11, 1, 1, 0F, -0.7F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, -0.25F, -0.7F, -0.6F, -0.25F); // Box 661
        gunModel[655].setRotationPoint(18.5F, -31.5F, -4.2F);
        gunModel[655].rotateAngleX = -0.19198622F;

        gunModel[656].addShapeBox(0F, -0.3F, -0.7F, 7, 1, 1, 0F, -0.2F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -0.6F, 0F, -0.7F, -0.6F, 0F, -0.7F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F); // Box 661
        gunModel[656].setRotationPoint(33.5F, -31.5F, -4.2F);
        gunModel[656].rotateAngleX = -0.19198622F;

        gunModel[657].addShapeBox(-2.5F, 0F, 0F, 4, 6, 4, 0F, 0F, -2.4F, -2.75F, 0F, -1.4F, -1F, 0F, 0F, 0F, 1F, -1.5F, 0F, 0F, -2F, -2.5F, 0F, -2F, -0.75F, 0F, 0F, 0F, 1F, -0.5F, 0F); // Box 496
        gunModel[657].setRotationPoint(14.5F, -38F, -5.5F);
        gunModel[657].rotateAngleX = -0.17453293F;

        gunModel[658].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F); // Box 1305
        gunModel[658].setRotationPoint(4.5F, -28.5F, -0.5F);

        gunModel[659].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F, -6.5F, -2F, 2.3F); // Box 1305
        gunModel[659].setRotationPoint(-0.5F, -28.5F, -0.5F);
    }

    private void initdefaultBarrelModel_1() {
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 399
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 400
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 401
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 795
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 796
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 797
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 798
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 799
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 801
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 805
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 806
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 807
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 808
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 809
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 810
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 811
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 812
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 813
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 814
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 822
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 824
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 825
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 826
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 827
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 828
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Box 829
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 830
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 831
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 801
        defaultBarrelModel[29] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 821
        defaultBarrelModel[30] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 801
        defaultBarrelModel[31] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 801
        defaultBarrelModel[32] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 821
        defaultBarrelModel[33] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 801
        defaultBarrelModel[34] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 822
        defaultBarrelModel[35] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 821
        defaultBarrelModel[36] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 801
        defaultBarrelModel[37] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 821
        defaultBarrelModel[38] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 801
        defaultBarrelModel[39] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 801
        defaultBarrelModel[40] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 801
        defaultBarrelModel[41] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 801
        defaultBarrelModel[42] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Box 801
        defaultBarrelModel[43] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 801
        defaultBarrelModel[44] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 801
        defaultBarrelModel[45] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 801
        defaultBarrelModel[46] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 801
        defaultBarrelModel[47] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 801
        defaultBarrelModel[48] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 801
        defaultBarrelModel[49] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 801
        defaultBarrelModel[50] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 801
        defaultBarrelModel[51] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 801
        defaultBarrelModel[52] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 801
        defaultBarrelModel[53] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 801
        defaultBarrelModel[54] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 822
        defaultBarrelModel[55] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 821
        defaultBarrelModel[56] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 821
        defaultBarrelModel[57] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 822
        defaultBarrelModel[58] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 821
        defaultBarrelModel[59] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 821
        defaultBarrelModel[60] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 822
        defaultBarrelModel[61] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 821
        defaultBarrelModel[62] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 821
        defaultBarrelModel[63] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 822
        defaultBarrelModel[64] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 821
        defaultBarrelModel[65] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 821
        defaultBarrelModel[66] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Box 822
        defaultBarrelModel[67] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 821
        defaultBarrelModel[68] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Box 821
        defaultBarrelModel[69] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 822
        defaultBarrelModel[70] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 821
        defaultBarrelModel[71] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 821
        defaultBarrelModel[72] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 801
        defaultBarrelModel[73] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 801
        defaultBarrelModel[74] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 801
        defaultBarrelModel[75] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 801
        defaultBarrelModel[76] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 801
        defaultBarrelModel[77] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Box 801
        defaultBarrelModel[78] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Box 801
        defaultBarrelModel[79] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 801

        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 399
        defaultBarrelModel[0].setRotationPoint(46F, -37.5F, -0.5F);

        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 400
        defaultBarrelModel[1].setRotationPoint(46F, -38F, -0.5F);

        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 401
        defaultBarrelModel[2].setRotationPoint(46F, -37F, -0.5F);

        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 795
        defaultBarrelModel[3].setRotationPoint(158F, -33.5F, -2F);

        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 796
        defaultBarrelModel[4].setRotationPoint(158F, -34.5F, -2F);

        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 797
        defaultBarrelModel[5].setRotationPoint(158F, -35.5F, -1.5F);

        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 798
        defaultBarrelModel[6].setRotationPoint(158F, -32.5F, -2F);

        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 799
        defaultBarrelModel[7].setRotationPoint(158F, -31.5F, -1.5F);

        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 801
        defaultBarrelModel[8].setRotationPoint(166F, -35.5F, -1.5F);

        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 805
        defaultBarrelModel[9].setRotationPoint(159F, -33.5F, -2F);

        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 806
        defaultBarrelModel[10].setRotationPoint(159F, -34.5F, -2F);

        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 807
        defaultBarrelModel[11].setRotationPoint(159F, -35.25F, -1.5F);

        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 808
        defaultBarrelModel[12].setRotationPoint(159F, -31.75F, -1.5F);

        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 809
        defaultBarrelModel[13].setRotationPoint(159F, -32.5F, -2F);

        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 810
        defaultBarrelModel[14].setRotationPoint(161F, -33.5F, -2F);

        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 811
        defaultBarrelModel[15].setRotationPoint(161F, -34.5F, -2F);

        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, -0.75F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, 0.25F, -0.75F, 0F, -0.5F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0.5F); // Box 812
        defaultBarrelModel[16].setRotationPoint(161F, -35.25F, -1.5F);

        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, -0.75F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, 0.25F, -0.75F); // Box 813
        defaultBarrelModel[17].setRotationPoint(161F, -31.75F, -1.5F);

        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, 0F); // Box 814
        defaultBarrelModel[18].setRotationPoint(161F, -32.5F, -2F);

        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 822
        defaultBarrelModel[19].setRotationPoint(167F, -33.5F, -2F);

        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Box 824
        defaultBarrelModel[20].setRotationPoint(163F, -34.5F, -2F);

        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Box 825
        defaultBarrelModel[21].setRotationPoint(161.25F, -34.5F, -2F);

        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Box 826
        defaultBarrelModel[22].setRotationPoint(165F, -34.5F, -2F);

        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F); // Box 827
        defaultBarrelModel[23].setRotationPoint(166.75F, -34.5F, -2F);

        defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 828
        defaultBarrelModel[24].setRotationPoint(166.75F, -32.5F, -2F);

        defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 829
        defaultBarrelModel[25].setRotationPoint(165F, -32.5F, -2F);

        defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 830
        defaultBarrelModel[26].setRotationPoint(163F, -32.5F, -2F);

        defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 831
        defaultBarrelModel[27].setRotationPoint(161.25F, -32.5F, -2F);

        defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 801
        defaultBarrelModel[28].setRotationPoint(167F, -35F, -0.5F);

        defaultBarrelModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 821
        defaultBarrelModel[29].setRotationPoint(167F, -34.5F, -2F);

        defaultBarrelModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F); // Box 801
        defaultBarrelModel[30].setRotationPoint(167F, -35.5F, -1.5F);

        defaultBarrelModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
        defaultBarrelModel[31].setRotationPoint(167F, -32F, -0.5F);

        defaultBarrelModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 821
        defaultBarrelModel[32].setRotationPoint(167F, -32.5F, -2F);

        defaultBarrelModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 801
        defaultBarrelModel[33].setRotationPoint(167F, -31.5F, -1.5F);

        defaultBarrelModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
        defaultBarrelModel[34].setRotationPoint(167F, -33.5F, 1F);

        defaultBarrelModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
        defaultBarrelModel[35].setRotationPoint(167F, -34.5F, 1F);

        defaultBarrelModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F); // Box 801
        defaultBarrelModel[36].setRotationPoint(167F, -35.5F, 0.5F);

        defaultBarrelModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 821
        defaultBarrelModel[37].setRotationPoint(167F, -32.5F, 1F);

        defaultBarrelModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 801
        defaultBarrelModel[38].setRotationPoint(167F, -31.5F, 0.5F);

        defaultBarrelModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 801
        defaultBarrelModel[39].setRotationPoint(165F, -35F, -0.5F);

        defaultBarrelModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F); // Box 801
        defaultBarrelModel[40].setRotationPoint(165F, -35.5F, -1.5F);

        defaultBarrelModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F); // Box 801
        defaultBarrelModel[41].setRotationPoint(165F, -35.5F, 0.5F);

        defaultBarrelModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 801
        defaultBarrelModel[42].setRotationPoint(164F, -35.5F, -1.5F);

        defaultBarrelModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 801
        defaultBarrelModel[43].setRotationPoint(163F, -35F, -0.5F);

        defaultBarrelModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F); // Box 801
        defaultBarrelModel[44].setRotationPoint(163F, -35.5F, -1.5F);

        defaultBarrelModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F); // Box 801
        defaultBarrelModel[45].setRotationPoint(163F, -35.5F, 0.5F);

        defaultBarrelModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F); // Box 801
        defaultBarrelModel[46].setRotationPoint(166F, -31.5F, -1.5F);

        defaultBarrelModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 801
        defaultBarrelModel[47].setRotationPoint(165F, -32F, -0.5F);

        defaultBarrelModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 801
        defaultBarrelModel[48].setRotationPoint(165F, -31.5F, -1.5F);

        defaultBarrelModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 801
        defaultBarrelModel[49].setRotationPoint(165F, -31.5F, 0.5F);

        defaultBarrelModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F); // Box 801
        defaultBarrelModel[50].setRotationPoint(164F, -31.5F, -1.5F);

        defaultBarrelModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 801
        defaultBarrelModel[51].setRotationPoint(163F, -32F, -0.5F);

        defaultBarrelModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 801
        defaultBarrelModel[52].setRotationPoint(163F, -31.5F, -1.5F);

        defaultBarrelModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.5F, 0.125F, -0.25F, 0.5F, 0.125F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 801
        defaultBarrelModel[53].setRotationPoint(163F, -31.5F, 0.5F);

        defaultBarrelModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 822
        defaultBarrelModel[54].setRotationPoint(165F, -33.5F, 1F);

        defaultBarrelModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 821
        defaultBarrelModel[55].setRotationPoint(165F, -34.5F, 1F);

        defaultBarrelModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 821
        defaultBarrelModel[56].setRotationPoint(165F, -32.5F, 1F);

        defaultBarrelModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F); // Box 822
        defaultBarrelModel[57].setRotationPoint(165F, -33.5F, -2F);

        defaultBarrelModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F); // Box 821
        defaultBarrelModel[58].setRotationPoint(165F, -34.5F, -2F);

        defaultBarrelModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F); // Box 821
        defaultBarrelModel[59].setRotationPoint(165F, -32.5F, -2F);

        defaultBarrelModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 822
        defaultBarrelModel[60].setRotationPoint(163F, -33.5F, 1F);

        defaultBarrelModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 821
        defaultBarrelModel[61].setRotationPoint(163F, -34.5F, 1F);

        defaultBarrelModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 821
        defaultBarrelModel[62].setRotationPoint(163F, -32.5F, 1F);

        defaultBarrelModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F); // Box 822
        defaultBarrelModel[63].setRotationPoint(163F, -33.5F, -2F);

        defaultBarrelModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F); // Box 821
        defaultBarrelModel[64].setRotationPoint(163F, -34.5F, -2F);

        defaultBarrelModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F); // Box 821
        defaultBarrelModel[65].setRotationPoint(163F, -32.5F, -2F);

        defaultBarrelModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 822
        defaultBarrelModel[66].setRotationPoint(161F, -33.5F, -2F);

        defaultBarrelModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 821
        defaultBarrelModel[67].setRotationPoint(161F, -34.5F, -2F);

        defaultBarrelModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 821
        defaultBarrelModel[68].setRotationPoint(161F, -32.5F, -2F);

        defaultBarrelModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
        defaultBarrelModel[69].setRotationPoint(161F, -33.5F, 1F);

        defaultBarrelModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
        defaultBarrelModel[70].setRotationPoint(161F, -34.5F, 1F);

        defaultBarrelModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 821
        defaultBarrelModel[71].setRotationPoint(161F, -32.5F, 1F);

        defaultBarrelModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 801
        defaultBarrelModel[72].setRotationPoint(162F, -35.5F, -1.5F);

        defaultBarrelModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 801
        defaultBarrelModel[73].setRotationPoint(161F, -35F, -0.5F);

        defaultBarrelModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F); // Box 801
        defaultBarrelModel[74].setRotationPoint(161F, -35.5F, -1.5F);

        defaultBarrelModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
        defaultBarrelModel[75].setRotationPoint(161F, -32F, -0.5F);

        defaultBarrelModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 801
        defaultBarrelModel[76].setRotationPoint(161F, -31.5F, -1.5F);

        defaultBarrelModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F); // Box 801
        defaultBarrelModel[77].setRotationPoint(161F, -35.5F, 0.5F);

        defaultBarrelModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0.125F, 0F, 0.5F, 0.125F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 801
        defaultBarrelModel[78].setRotationPoint(161F, -31.5F, 0.5F);

        defaultBarrelModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 801
        defaultBarrelModel[79].setRotationPoint(162F, -31.5F, -1.5F);
    }

    private void initdefaultStockModel_1() {
        defaultStockModel[0] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 259
        defaultStockModel[1] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 260
        defaultStockModel[2] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 261
        defaultStockModel[3] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 262
        defaultStockModel[4] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 263
        defaultStockModel[5] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 264
        defaultStockModel[6] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 265
        defaultStockModel[7] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 266
        defaultStockModel[8] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 267
        defaultStockModel[9] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 268
        defaultStockModel[10] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 269
        defaultStockModel[11] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 270
        defaultStockModel[12] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 271
        defaultStockModel[13] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 272
        defaultStockModel[14] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 273
        defaultStockModel[15] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 274
        defaultStockModel[16] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 275
        defaultStockModel[17] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 276
        defaultStockModel[18] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 277
        defaultStockModel[19] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 278
        defaultStockModel[20] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 279
        defaultStockModel[21] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 280
        defaultStockModel[22] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 281
        defaultStockModel[23] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 282
        defaultStockModel[24] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 283
        defaultStockModel[25] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 284
        defaultStockModel[26] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 285
        defaultStockModel[27] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 286
        defaultStockModel[28] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 287
        defaultStockModel[29] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 288
        defaultStockModel[30] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 289
        defaultStockModel[31] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 290
        defaultStockModel[32] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 291
        defaultStockModel[33] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 292
        defaultStockModel[34] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 293
        defaultStockModel[35] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 294
        defaultStockModel[36] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 295
        defaultStockModel[37] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 296
        defaultStockModel[38] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 297
        defaultStockModel[39] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 298
        defaultStockModel[40] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 299
        defaultStockModel[41] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 300
        defaultStockModel[42] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 301
        defaultStockModel[43] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 302
        defaultStockModel[44] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 303
        defaultStockModel[45] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 304
        defaultStockModel[46] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 305
        defaultStockModel[47] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 306
        defaultStockModel[48] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 307
        defaultStockModel[49] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 308
        defaultStockModel[50] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 309
        defaultStockModel[51] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 310
        defaultStockModel[52] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 311
        defaultStockModel[53] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 312
        defaultStockModel[54] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 313
        defaultStockModel[55] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 314
        defaultStockModel[56] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 315

        defaultStockModel[0].addShapeBox(0F, 0F, 0F, 36, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 1F, -2F, 0F, 1F); // Box 259
        defaultStockModel[0].setRotationPoint(-38F, -34F, -3.5F);

        defaultStockModel[1].addShapeBox(0F, 0F, 0F, 36, 2, 7, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        defaultStockModel[1].setRotationPoint(-38F, -36F, -3.5F);

        defaultStockModel[2].addShapeBox(0F, 0F, 0F, 29, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        defaultStockModel[2].setRotationPoint(-36F, -31F, -4.5F);

        defaultStockModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, -4.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 262
        defaultStockModel[3].setRotationPoint(-7F, -34F, -3.5F);

        defaultStockModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 263
        defaultStockModel[4].setRotationPoint(-7F, -31F, -4.5F);

        defaultStockModel[5].addShapeBox(0F, 0F, 0F, 29, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 264
        defaultStockModel[5].setRotationPoint(-36F, -30F, -4.5F);

        defaultStockModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F); // Box 265
        defaultStockModel[6].setRotationPoint(-7F, -30F, -4.5F);

        defaultStockModel[7].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
        defaultStockModel[7].setRotationPoint(-31F, -29F, -3F);

        defaultStockModel[8].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 267
        defaultStockModel[8].setRotationPoint(-31F, -23F, -3F);

        defaultStockModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 268
        defaultStockModel[9].setRotationPoint(-7F, -28F, -3F);

        defaultStockModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        defaultStockModel[10].setRotationPoint(-7F, -29F, -3F);

        defaultStockModel[11].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 270
        defaultStockModel[11].setRotationPoint(-37F, -19F, -3F);

        defaultStockModel[12].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 271
        defaultStockModel[12].setRotationPoint(-37F, -18F, -2.5F);

        defaultStockModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F); // Box 272
        defaultStockModel[13].setRotationPoint(-17F, -19F, -3F);

        defaultStockModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -1.5F); // Box 273
        defaultStockModel[14].setRotationPoint(-17F, -18F, -2.5F);

        defaultStockModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 274
        defaultStockModel[15].setRotationPoint(-14F, -23F, -3F);

        defaultStockModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 275
        defaultStockModel[16].setRotationPoint(-14F, -22F, -2.5F);

        defaultStockModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 276
        defaultStockModel[17].setRotationPoint(-7F, -23F, -3F);

        defaultStockModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F); // Box 277
        defaultStockModel[18].setRotationPoint(-7F, -22F, -2.5F);

        defaultStockModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, -0.5F, 0F, 0F, -0.5F, 4.5F, 0F, -0.5F, 4.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, -4.5F, -1.5F, -0.5F, -4.5F, -1.5F, -1F, 0F, -1.5F); // Box 278
        defaultStockModel[19].setRotationPoint(-5.5F, -22.5F, -2.5F);

        defaultStockModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 4.5F, 0F, -0.5F, 4.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, -4.5F, -0.5F, 0.5F, -4.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 279
        defaultStockModel[20].setRotationPoint(-5.5F, -23.5F, -3F);

        defaultStockModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F); // Box 280
        defaultStockModel[21].setRotationPoint(-3F, -29F, -3F);

        defaultStockModel[22].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 281
        defaultStockModel[22].setRotationPoint(-35F, -34.5F, -4F);

        defaultStockModel[23].addShapeBox(0F, 0F, 0F, 20, 2, 8, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
        defaultStockModel[23].setRotationPoint(-35F, -36.5F, -4F);

        defaultStockModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, -1.99F, 0F, 0F, -1.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 283
        defaultStockModel[24].setRotationPoint(-38F, -34F, -3.5F);

        defaultStockModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 284
        defaultStockModel[25].setRotationPoint(-38F, -31F, -4.5F);

        defaultStockModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 285
        defaultStockModel[26].setRotationPoint(-38F, -30F, -4.5F);

        defaultStockModel[27].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        defaultStockModel[27].setRotationPoint(-37F, -29F, -3F);

        defaultStockModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        defaultStockModel[28].setRotationPoint(-33F, -21F, -3F);

        defaultStockModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 288
        defaultStockModel[29].setRotationPoint(-33F, -21.5F, -3F);

        defaultStockModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 289
        defaultStockModel[30].setRotationPoint(-32F, -21.5F, -3F);

        defaultStockModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 290
        defaultStockModel[31].setRotationPoint(-32F, -29.5F, -3F);

        defaultStockModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 291
        defaultStockModel[32].setRotationPoint(-33F, -29.5F, -3F);

        defaultStockModel[33].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
        defaultStockModel[33].setRotationPoint(-35F, -29F, -3F);

        defaultStockModel[34].addShapeBox(0F, 0F, 0F, 3, 11, 7, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
        defaultStockModel[34].setRotationPoint(-40F, -29.5F, -3.5F);

        defaultStockModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 294
        defaultStockModel[35].setRotationPoint(-40F, -18.5F, -3.5F);

        defaultStockModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 295
        defaultStockModel[36].setRotationPoint(-40F, -17.5F, -3F);

        defaultStockModel[37].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
        defaultStockModel[37].setRotationPoint(-41F, -34.5F, -3.5F);

        defaultStockModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        defaultStockModel[38].setRotationPoint(-41F, -36.5F, -3.5F);

        defaultStockModel[39].addShapeBox(0F, 0F, 0F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        defaultStockModel[39].setRotationPoint(-19F, -29F, -3F);

        defaultStockModel[40].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
        defaultStockModel[40].setRotationPoint(-26F, -30F, -4F);

        defaultStockModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 300
        defaultStockModel[41].setRotationPoint(-27F, -30F, -4F);

        defaultStockModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 301
        defaultStockModel[42].setRotationPoint(-20F, -30F, -4F);

        defaultStockModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 302
        defaultStockModel[43].setRotationPoint(-26F, -26F, -4F);

        defaultStockModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
        defaultStockModel[44].setRotationPoint(-24F, -25F, -4F);

        defaultStockModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 304
        defaultStockModel[45].setRotationPoint(-22F, -25F, -4F);

        defaultStockModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 305
        defaultStockModel[46].setRotationPoint(-20F, -25F, -3F);

        defaultStockModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 306
        defaultStockModel[47].setRotationPoint(-27F, -25F, -3F);

        defaultStockModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 307
        defaultStockModel[48].setRotationPoint(-26F, -25F, -4F);

        defaultStockModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
        defaultStockModel[49].setRotationPoint(-31F, -20F, -3.5F);

        defaultStockModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
        defaultStockModel[50].setRotationPoint(-31F, -21F, -3.5F);

        defaultStockModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 310
        defaultStockModel[51].setRotationPoint(-31F, -19F, -3.5F);

        defaultStockModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 311
        defaultStockModel[52].setRotationPoint(-12F, -22.5F, -3.5F);

        defaultStockModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 312
        defaultStockModel[53].setRotationPoint(-8F, -25.5F, -3.5F);

        defaultStockModel[54].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
        defaultStockModel[54].setRotationPoint(-12F, -25.5F, -3.5F);

        defaultStockModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 314
        defaultStockModel[55].setRotationPoint(-13F, -25.5F, -3.5F);

        defaultStockModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
        defaultStockModel[56].setRotationPoint(-12F, -26.5F, -3.5F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 762
        ammoModel[1] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 763
        ammoModel[2] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 764
        ammoModel[3] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 765
        ammoModel[4] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 766
        ammoModel[5] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 767
        ammoModel[6] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 768
        ammoModel[7] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 769
        ammoModel[8] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 770
        ammoModel[9] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 771
        ammoModel[10] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 772
        ammoModel[11] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 773
        ammoModel[12] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 774
        ammoModel[13] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 775
        ammoModel[14] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 776
        ammoModel[15] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 777
        ammoModel[16] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 778
        ammoModel[17] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 779
        ammoModel[18] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 780
        ammoModel[19] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 781
        ammoModel[20] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 782
        ammoModel[21] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 783
        ammoModel[22] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 784
        ammoModel[23] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 785
        ammoModel[24] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 786
        ammoModel[25] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 787
        ammoModel[26] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 788
        ammoModel[27] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 789
        ammoModel[28] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 790
        ammoModel[29] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 791
        ammoModel[30] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 792
        ammoModel[31] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 793
        ammoModel[32] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 794

        ammoModel[0].addShapeBox(1F, 0F, 0F, 16, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
        ammoModel[0].setRotationPoint(22F, -29F, -3F);

        ammoModel[1].addShapeBox(2F, 0F, 0F, 14, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
        ammoModel[1].setRotationPoint(22F, -20F, -2.5F);
        ammoModel[1].rotateAngleZ = 0.19198622F;

        ammoModel[2].addShapeBox(1F, 0F, 0F, 16, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
        ammoModel[2].setRotationPoint(22F, -20F, -3F);
        ammoModel[2].rotateAngleZ = 0.19198622F;

        ammoModel[3].addShapeBox(1F, 12F, 0F, 16, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
        ammoModel[3].setRotationPoint(22F, -20F, -3F);
        ammoModel[3].rotateAngleZ = 0.19198622F;

        ammoModel[4].addShapeBox(2.5F, 6F, 0F, 13, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
        ammoModel[4].setRotationPoint(22F, -20F, -3F);
        ammoModel[4].rotateAngleZ = 0.19198622F;

        ammoModel[5].addShapeBox(2.5F, 9F, 0F, 13, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
        ammoModel[5].setRotationPoint(22F, -20F, -3F);
        ammoModel[5].rotateAngleZ = 0.19198622F;

        ammoModel[6].addShapeBox(1F, 4F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
        ammoModel[6].setRotationPoint(22F, -20F, -3F);
        ammoModel[6].rotateAngleZ = 0.19198622F;

        ammoModel[7].addShapeBox(16F, 4F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
        ammoModel[7].setRotationPoint(22F, -20F, -3F);
        ammoModel[7].rotateAngleZ = 0.19198622F;

        ammoModel[8].addShapeBox(1F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 770
        ammoModel[8].setRotationPoint(21F, -28F, -3F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 771
        ammoModel[9].setRotationPoint(22F, -20F, -3F);
        ammoModel[9].rotateAngleZ = 0.19198622F;

        ammoModel[10].addShapeBox(17F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 772
        ammoModel[10].setRotationPoint(22F, -20F, -3F);
        ammoModel[10].rotateAngleZ = 0.19198622F;

        ammoModel[11].addShapeBox(18F, 0F, 0F, 1, 8, 6, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 773
        ammoModel[11].setRotationPoint(21F, -28F, -3F);

        ammoModel[12].addShapeBox(2F, 6F, 0F, 1, 1, 6, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 774
        ammoModel[12].setRotationPoint(22F, -20F, -3F);
        ammoModel[12].rotateAngleZ = 0.19198622F;

        ammoModel[13].addShapeBox(2F, 9F, 0F, 1, 1, 6, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 775
        ammoModel[13].setRotationPoint(22F, -20F, -3F);
        ammoModel[13].rotateAngleZ = 0.19198622F;

        ammoModel[14].addShapeBox(15F, 9F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 776
        ammoModel[14].setRotationPoint(22F, -20F, -3F);
        ammoModel[14].rotateAngleZ = 0.19198622F;

        ammoModel[15].addShapeBox(15F, 6F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 777
        ammoModel[15].setRotationPoint(22F, -20F, -3F);
        ammoModel[15].rotateAngleZ = 0.19198622F;

        ammoModel[16].addShapeBox(15F, 3F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 778
        ammoModel[16].setRotationPoint(22F, -20F, -3F);
        ammoModel[16].rotateAngleZ = 0.19198622F;

        ammoModel[17].addShapeBox(2F, 3F, 0F, 1, 1, 6, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 779
        ammoModel[17].setRotationPoint(22F, -20F, -3F);
        ammoModel[17].rotateAngleZ = 0.19198622F;

        ammoModel[18].addShapeBox(15F, 12F, 0F, 1, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 780
        ammoModel[18].setRotationPoint(22F, -20F, -3F);
        ammoModel[18].rotateAngleZ = 0.19198622F;

        ammoModel[19].addShapeBox(2F, 12F, 0F, 1, 1, 6, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 781
        ammoModel[19].setRotationPoint(22F, -20F, -3F);
        ammoModel[19].rotateAngleZ = 0.19198622F;

        ammoModel[20].addShapeBox(0.5F, 14.25F, -0.5F, 16, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
        ammoModel[20].setRotationPoint(22F, -20F, -3F);
        ammoModel[20].rotateAngleZ = 0.19198622F;

        ammoModel[21].addShapeBox(-0.5F, 14.25F, -0.5F, 1, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 783
        ammoModel[21].setRotationPoint(22F, -20F, -3F);
        ammoModel[21].rotateAngleZ = 0.19198622F;

        ammoModel[22].addShapeBox(16.5F, 14.25F, -0.5F, 1, 1, 7, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 784
        ammoModel[22].setRotationPoint(22F, -20F, -3F);
        ammoModel[22].rotateAngleZ = 0.19198622F;

        ammoModel[23].addShapeBox(17.01F, 14.25F, -0.5F, 1, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 785
        ammoModel[23].setRotationPoint(22F, -20F, -3F);
        ammoModel[23].rotateAngleZ = 0.19198622F;

        ammoModel[24].addShapeBox(1F, 0F, 0F, 16, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
        ammoModel[24].setRotationPoint(22F, -29F, 2F);

        ammoModel[25].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 787
        ammoModel[25].setRotationPoint(21F, -29F, -3F);

        ammoModel[26].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 788
        ammoModel[26].setRotationPoint(21F, -29F, 1F);

        ammoModel[27].addShapeBox(1F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0.75F, -2F, -0.5F, 0.75F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
        ammoModel[27].setRotationPoint(22F, -30F, 2F);

        ammoModel[28].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 790
        ammoModel[28].setRotationPoint(21F, -30F, 1F);

        ammoModel[29].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, -0.25F, -0.25F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
        ammoModel[29].setRotationPoint(21F, -30F, -3F);

        ammoModel[30].addShapeBox(1F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 792
        ammoModel[30].setRotationPoint(22F, -30F, -3F);

        ammoModel[31].addShapeBox(18F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 793
        ammoModel[31].setRotationPoint(21F, -29F, -3F);

        ammoModel[32].addShapeBox(18F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 794
        ammoModel[32].setRotationPoint(21F, -29F, 1F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 138
        slideModel[1] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 141
        slideModel[2] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 142
        slideModel[3] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 143
        slideModel[4] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 144
        slideModel[5] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 145
        slideModel[6] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 146
        slideModel[7] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 147
        slideModel[8] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 148
        slideModel[9] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 149
        slideModel[10] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 150
        slideModel[11] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 151
        slideModel[12] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 152
        slideModel[13] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 153
        slideModel[14] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 154
        slideModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 155
        slideModel[16] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 156
        slideModel[17] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 157
        slideModel[18] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 158
        slideModel[19] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 657
        slideModel[20] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 658
        slideModel[21] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 659
        slideModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 660
        slideModel[23] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 661
        slideModel[24] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 662
        slideModel[25] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 663
        slideModel[26] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 665
        slideModel[27] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 668
        slideModel[28] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 657
        slideModel[29] = new ModelRendererTurbo(this, 209, 273, textureX, textureY); // Box 657
        slideModel[30] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 658
        slideModel[31] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 657
        slideModel[32] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 657
        slideModel[33] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 659
        slideModel[34] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 662

        slideModel[0].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 138
        slideModel[0].setRotationPoint(13F, -34.5F, 2.5F);
        slideModel[0].rotateAngleX = 0.26179939F;

        slideModel[1].addShapeBox(0F, -0.25F, 0F, 22, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 141
        slideModel[1].setRotationPoint(13F, -34.5F, 2.5F);
        slideModel[1].rotateAngleX = 0.26179939F;

        slideModel[2].addShapeBox(0F, 1F, 0F, 22, 1, 1, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 142
        slideModel[2].setRotationPoint(13F, -34.5F, 2.5F);
        slideModel[2].rotateAngleX = 0.26179939F;

        slideModel[3].addShapeBox(0F, 1F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1F, 0F, -0.25F, -0.25F); // Box 143
        slideModel[3].setRotationPoint(35F, -34.5F, 2.5F);
        slideModel[3].rotateAngleX = 0.26179939F;

        slideModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0F); // Box 144
        slideModel[4].setRotationPoint(35F, -34.5F, 2.5F);
        slideModel[4].rotateAngleX = 0.26179939F;

        slideModel[5].addShapeBox(0F, -0.25F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1F, 0F, -0.25F, -0.25F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0F); // Box 145
        slideModel[5].setRotationPoint(35F, -34.5F, 2.5F);
        slideModel[5].rotateAngleX = 0.26179939F;

        slideModel[6].addShapeBox(0F, -0.25F, 0F, 2, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 146
        slideModel[6].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[6].rotateAngleX = 0.26179939F;

        slideModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 147
        slideModel[7].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[7].rotateAngleX = 0.26179939F;

        slideModel[8].addShapeBox(0F, 1F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 148
        slideModel[8].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[8].rotateAngleX = 0.26179939F;

        slideModel[9].addShapeBox(0.5F, 0F, 1F, 1, 2, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 149
        slideModel[9].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[9].rotateAngleX = 0.26179939F;

        slideModel[10].addShapeBox(1F, 0F, 1F, 1, 2, 1, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Box 150
        slideModel[10].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[10].rotateAngleX = 0.26179939F;

        slideModel[11].addShapeBox(0F, 0F, 1F, 1, 2, 1, 0F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Box 151
        slideModel[11].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[11].rotateAngleX = 0.26179939F;

        slideModel[12].addShapeBox(0.75F, -2.25F, 1F, 1, 2, 1, 0F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 152
        slideModel[12].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[12].rotateAngleX = 0.26179939F;

        slideModel[13].addShapeBox(0.75F, 2F, 1F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 153
        slideModel[13].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[13].rotateAngleX = 0.26179939F;

        slideModel[14].addShapeBox(2.25F, -2.25F, 1F, 4, 5, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, -2.5F, -0.25F, 0.25F, -2.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 154
        slideModel[14].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[14].rotateAngleX = 0.26179939F;

        slideModel[15].addShapeBox(4.25F, -2.25F, 1F, 4, 2, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 155
        slideModel[15].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[15].rotateAngleX = 0.26179939F;

        slideModel[16].addShapeBox(-0.25F, -2.25F, 1F, 1, 2, 1, 0F, -0.5F, -0.375F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F); // Box 156
        slideModel[16].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[16].rotateAngleX = 0.26179939F;

        slideModel[17].addShapeBox(-0.25F, 2F, 1F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F); // Box 157
        slideModel[17].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[17].rotateAngleX = 0.26179939F;

        slideModel[18].addShapeBox(8.25F, -2.25F, 1F, 2, 2, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0.25F); // Box 158
        slideModel[18].setRotationPoint(37F, -34.5F, 2.5F);
        slideModel[18].rotateAngleX = 0.26179939F;

        slideModel[19].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 657
        slideModel[19].setRotationPoint(24F, -33.5F, -1.25F);

        slideModel[20].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 658
        slideModel[20].setRotationPoint(24F, -32F, -1.25F);

        slideModel[21].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 659
        slideModel[21].setRotationPoint(24F, -35F, -1.25F);

        slideModel[22].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 660
        slideModel[22].setRotationPoint(24F, -36F, -1.25F);

        slideModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
        slideModel[23].setRotationPoint(16F, -33.5F, -1.25F);

        slideModel[24].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
        slideModel[24].setRotationPoint(16F, -34.5F, -1.25F);

        slideModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
        slideModel[25].setRotationPoint(16F, -35.5F, -1.75F);

        slideModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 665
        slideModel[26].setRotationPoint(16F, -32.5F, -2.25F);

        slideModel[27].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F); // Box 668
        slideModel[27].setRotationPoint(16F, -31.5F, -1.75F);

        slideModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F); // Box 657
        slideModel[28].setRotationPoint(24F, -34.5F, -3.25F);

        slideModel[29].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 657
        slideModel[29].setRotationPoint(24F, -34.5F, -2.75F);

        slideModel[30].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 658
        slideModel[30].setRotationPoint(24F, -32F, -3.25F);

        slideModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.75F, -0.75F, 0.5F, 0.75F, -0.75F); // Box 657
        slideModel[31].setRotationPoint(33F, -34.5F, -3.25F);

        slideModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -0.75F, 0.25F, 0.75F, -0.75F); // Box 657
        slideModel[32].setRotationPoint(38F, -34.5F, -3.25F);

        slideModel[33].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.825F, 0F, -0.5F, -0.825F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 659
        slideModel[33].setRotationPoint(24F, -35F, -2.75F);

        slideModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
        slideModel[34].setRotationPoint(16F, -34.5F, -2.25F);
    }
}