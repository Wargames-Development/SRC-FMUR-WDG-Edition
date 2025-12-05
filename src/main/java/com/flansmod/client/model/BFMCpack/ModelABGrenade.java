//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M-83 Smoke Bomb
// Model Creator:
// Created on:07.10.2019 - 17:58:10
// Last changed on: 07.10.2019 - 17:58:10

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelABGrenade extends ModelBase {
    public ModelRendererTurbo abgrenadeModel[];
    int textureX = 512;
    int textureY = 256;

    public ModelABGrenade() {
        abgrenadeModel = new ModelRendererTurbo[67];
        abgrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
        abgrenadeModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 137
        abgrenadeModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 139
        abgrenadeModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 140
        abgrenadeModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 141
        abgrenadeModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 142
        abgrenadeModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 143
        abgrenadeModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 144
        abgrenadeModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 145
        abgrenadeModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 160
        abgrenadeModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 161
        abgrenadeModel[11] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 162
        abgrenadeModel[12] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 163
        abgrenadeModel[13] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 176
        abgrenadeModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 177
        abgrenadeModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 185
        abgrenadeModel[16] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 184
        abgrenadeModel[17] = new ModelRendererTurbo(this, 16, 131, textureX, textureY); // Box 8
        abgrenadeModel[18] = new ModelRendererTurbo(this, 16, 131, textureX, textureY); // Box 8
        abgrenadeModel[19] = new ModelRendererTurbo(this, 80, 131, textureX, textureY); // Box 8
        abgrenadeModel[20] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
        abgrenadeModel[21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
        abgrenadeModel[22] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 8
        abgrenadeModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 8
        abgrenadeModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 8
        abgrenadeModel[25] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 8
        abgrenadeModel[26] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 8
        abgrenadeModel[27] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 8
        abgrenadeModel[28] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 141
        abgrenadeModel[29] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 142
        abgrenadeModel[30] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 144
        abgrenadeModel[31] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 8
        abgrenadeModel[32] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 8
        abgrenadeModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 147
        abgrenadeModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 164
        abgrenadeModel[35] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 167
        abgrenadeModel[36] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 178
        abgrenadeModel[37] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 179
        abgrenadeModel[38] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 180
        abgrenadeModel[39] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 146
        abgrenadeModel[40] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 148
        abgrenadeModel[41] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 149
        abgrenadeModel[42] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 150
        abgrenadeModel[43] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 151
        abgrenadeModel[44] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 152
        abgrenadeModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 153
        abgrenadeModel[46] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 154
        abgrenadeModel[47] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 165
        abgrenadeModel[48] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 166
        abgrenadeModel[49] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 168
        abgrenadeModel[50] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 169
        abgrenadeModel[51] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 170
        abgrenadeModel[52] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 171
        abgrenadeModel[53] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 172
        abgrenadeModel[54] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 173
        abgrenadeModel[55] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 174
        abgrenadeModel[56] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 175
        abgrenadeModel[57] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 194
        abgrenadeModel[58] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 148
        abgrenadeModel[59] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 151
        abgrenadeModel[60] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 152
        abgrenadeModel[61] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 153
        abgrenadeModel[62] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 154
        abgrenadeModel[63] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 165
        abgrenadeModel[64] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 165
        abgrenadeModel[65] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 194
        abgrenadeModel[66] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 194

        abgrenadeModel[0].addShapeBox(0F, 0F, 0F, 6, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        abgrenadeModel[0].setRotationPoint(-3F, 25F, -8F);

        abgrenadeModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 137
        abgrenadeModel[1].setRotationPoint(3F, 25F, -8F);

        abgrenadeModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 139
        abgrenadeModel[2].setRotationPoint(-8F, 25F, -8F);

        abgrenadeModel[3].addShapeBox(0F, 0F, 0F, 13, 12, 14, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        abgrenadeModel[3].setRotationPoint(-10F, 35F, -7F);

        abgrenadeModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
        abgrenadeModel[4].setRotationPoint(-3F, 28F, -8F);

        abgrenadeModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F); // Box 142
        abgrenadeModel[5].setRotationPoint(3F, 28F, -8F);

        abgrenadeModel[6].addShapeBox(0F, 0F, 0F, 4, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 143
        abgrenadeModel[6].setRotationPoint(3F, 33F, -7F);

        abgrenadeModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F); // Box 144
        abgrenadeModel[7].setRotationPoint(-8F, 28F, -8F);

        abgrenadeModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        abgrenadeModel[8].setRotationPoint(7F, 44F, -2.5F);

        abgrenadeModel[9].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        abgrenadeModel[9].setRotationPoint(-9F, 46F, -8F);

        abgrenadeModel[10].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        abgrenadeModel[10].setRotationPoint(-9F, 45F, -8F);

        abgrenadeModel[11].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
        abgrenadeModel[11].setRotationPoint(-9F, 45F, 7F);

        abgrenadeModel[12].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        abgrenadeModel[12].setRotationPoint(-9F, 46F, 7F);

        abgrenadeModel[13].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 176
        abgrenadeModel[13].setRotationPoint(-16F, 33F, -7F);

        abgrenadeModel[14].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
        abgrenadeModel[14].setRotationPoint(-17F, 34F, -7F);

        abgrenadeModel[15].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        abgrenadeModel[15].setRotationPoint(3F, 41F, -7F);

        abgrenadeModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 46, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F); // Box 184
        abgrenadeModel[16].setRotationPoint(-4.5F, -29F, -23F);

        abgrenadeModel[17].addShapeBox(0F, 0F, 0F, 9, 10, 9, 0F, 3.5F, 21F, 16.5F, 0F, 21F, 4F, 0F, 21F, 4F, 3.5F, 21F, 16.5F, 3.5F, 20F, 16.5F, 0F, 20F, 4F, 0F, 20F, 4F, 3.5F, 20F, 16.5F); // Box 8
        abgrenadeModel[17].setRotationPoint(12F, -5F, -4.5F);

        abgrenadeModel[18].addShapeBox(0F, 0F, 0F, 9, 10, 42, 0F, 4F, 21F, 0F, 4F, 21F, 0F, 4F, 21F, 0F, 4F, 21F, 0F, 4F, 20F, 0F, 4F, 20F, 0F, 4F, 20F, 0F, 4F, 20F, 0F); // Box 8
        abgrenadeModel[18].setRotationPoint(-4.5F, -5F, -21F);

        abgrenadeModel[19].addShapeBox(0F, 0F, 0F, 9, 10, 9, 0F, 0F, 21F, 4F, 3.5F, 21F, 16.5F, 3.5F, 21F, 16.5F, 0F, 21F, 4F, 0F, 20F, 4F, 3.5F, 20F, 16.5F, 3.5F, 20F, 16.5F, 0F, 20F, 4F); // Box 8
        abgrenadeModel[19].setRotationPoint(-21F, -5F, -4.5F);

        abgrenadeModel[20].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 3F, 1F, 3F, 3F, 1F, 3F, 5F, 1F, 0F, 5F, 1F, 0F, 3F, 1F, 3F, 3F, 1F, 3F, 5F, 1F, 0F, 5F, 1F, 0F); // Box 8
        abgrenadeModel[20].setRotationPoint(-4.5F, 26F, 19F);

        abgrenadeModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 3F, 1F, 3F, 0F, 1F, 5F, 0F, 1F, 5F, 3F, 1F, 3F, 3F, 1F, 3F, 0F, 1F, 5F, 0F, 1F, 5F, 3F, 1F, 3F); // Box 8
        abgrenadeModel[21].setRotationPoint(19F, 26F, -4.5F);

        abgrenadeModel[22].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 3F, 1F, 0F, -3.5F, 1F, 8.5F, 3.5F, 1F, -10.5F, 1F, 1F, 3F, 3F, 1F, 0F, -3.5F, 1F, 8.5F, 3.5F, 1F, -10.5F, 1F, 1F, 3F); // Box 8
        abgrenadeModel[22].setRotationPoint(10.5F, 26F, 16F);

        abgrenadeModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 1F, 5F, 3F, 1F, 3F, 3F, 1F, 3F, 0F, 1F, 5F, 0F, 1F, 5F, 3F, 1F, 3F, 3F, 1F, 3F, 0F, 1F, 5F); // Box 8
        abgrenadeModel[23].setRotationPoint(-23F, 26F, -4.5F);

        abgrenadeModel[24].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, -3.5F, 1F, 8.5F, 3F, 1F, 0F, 1F, 1F, 3F, 3.5F, 1F, -10.5F, -3.5F, 1F, 8.5F, 3F, 1F, 0F, 1F, 1F, 3F, 3.5F, 1F, -10.5F); // Box 8
        abgrenadeModel[24].setRotationPoint(-19.5F, 26F, 16F);

        abgrenadeModel[25].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 3F, 1F, 3F, 3F, 1F, 3F, 5F, 1F, 0F, 5F, 1F, 0F, 3F, 1F, 3F, 3F, 1F, 3F); // Box 8
        abgrenadeModel[25].setRotationPoint(-4.5F, 26F, -23F);

        abgrenadeModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 1F, 1F, 3F, 3.5F, 1F, -10.5F, -3.5F, 1F, 8.5F, 3F, 1F, 0F, 1F, 1F, 3F, 3.5F, 1F, -10.5F, -3.5F, 1F, 8.5F, 3F, 1F, 0F); // Box 8
        abgrenadeModel[26].setRotationPoint(10.5F, 26F, -20F);

        abgrenadeModel[27].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 3.5F, 1F, -10.5F, 1F, 1F, 3F, 3F, 1F, 0F, -3.5F, 1F, 8.5F, 3.5F, 1F, -10.5F, 1F, 1F, 3F, 3F, 1F, 0F, -3.5F, 1F, 8.5F); // Box 8
        abgrenadeModel[27].setRotationPoint(-19.5F, 26F, -20F);

        abgrenadeModel[28].addShapeBox(0F, 0F, 0F, 6, 3, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
        abgrenadeModel[28].setRotationPoint(-3F, 30F, -8F);

        abgrenadeModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F); // Box 142
        abgrenadeModel[29].setRotationPoint(3F, 30F, -8F);

        abgrenadeModel[30].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F); // Box 144
        abgrenadeModel[30].setRotationPoint(-8F, 30F, -8F);

        abgrenadeModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F, 2F, 1F, 5F, 2.5F, 1F, 18.5F, 2.5F, 1F, 18.5F, 2F, 1F, 5F, 2F, 1F, 5F, 2.5F, 1F, 18.5F, 2.5F, 1F, 18.5F, 2F, 1F, 5F); // Box 8
        abgrenadeModel[31].setRotationPoint(-21F, -29F, -4.5F);

        abgrenadeModel[32].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F, 2.5F, 1F, 18.5F, 2F, 1F, 5F, 2F, 1F, 5F, 2.5F, 1F, 18.5F, 2.5F, 1F, 18.5F, 2F, 1F, 5F, 2F, 1F, 5F, 2.5F, 1F, 18.5F); // Box 8
        abgrenadeModel[32].setRotationPoint(12F, -29F, -4.5F);

        abgrenadeModel[33].addShapeBox(0F, 0F, 0F, 17, 1, 16, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        abgrenadeModel[33].setRotationPoint(-10F, 47F, -8F);

        abgrenadeModel[34].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 164
        abgrenadeModel[34].setRotationPoint(-11F, 40F, 7F);

        abgrenadeModel[35].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 6F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 167
        abgrenadeModel[35].setRotationPoint(-11F, 40F, -8F);

        abgrenadeModel[36].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 178
        abgrenadeModel[36].setRotationPoint(-18F, 36F, -8F);

        abgrenadeModel[37].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, -7F, 0F, 0F); // Box 179
        abgrenadeModel[37].setRotationPoint(-25F, 30F, -8F);

        abgrenadeModel[38].addShapeBox(0F, 0F, 0F, 2, 51, 10, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 180
        abgrenadeModel[38].setRotationPoint(-25F, -21F, -5F);

        abgrenadeModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        abgrenadeModel[39].setRotationPoint(9F, 45F, -6F);

        abgrenadeModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        abgrenadeModel[40].setRotationPoint(10F, 43F, -7F);

        abgrenadeModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
        abgrenadeModel[41].setRotationPoint(9F, 44F, -6F);

        abgrenadeModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 150
        abgrenadeModel[42].setRotationPoint(9F, 46F, -6F);

        abgrenadeModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, 0.75F, -1.5F, 0F, 0.75F, -1.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
        abgrenadeModel[43].setRotationPoint(11F, 43F, -7F);

        abgrenadeModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 152
        abgrenadeModel[44].setRotationPoint(9F, 43F, -7F);

        abgrenadeModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 153
        abgrenadeModel[45].setRotationPoint(7F, 45F, -7F);

        abgrenadeModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        abgrenadeModel[46].setRotationPoint(7F, 47F, -7F);

        abgrenadeModel[47].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F); // Box 165
        abgrenadeModel[47].setRotationPoint(-10.5F, 41.5F, 10F);
        abgrenadeModel[47].rotateAngleZ = 0.17453293F;

        abgrenadeModel[48].addShapeBox(-0.5F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
        abgrenadeModel[48].setRotationPoint(-10.5F, 41.5F, -12F);
        abgrenadeModel[48].rotateAngleZ = -0.17453293F;

        abgrenadeModel[49].addShapeBox(-4F, -0.5F, -0.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 168
        abgrenadeModel[49].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[49].rotateAngleX = -2.37364778F;
        abgrenadeModel[49].rotateAngleZ = -0.17453293F;

        abgrenadeModel[50].addShapeBox(4F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0.5F, -5.75F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.5F, -5.75F, 0F); // Box 169
        abgrenadeModel[50].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[50].rotateAngleX = -2.37364778F;
        abgrenadeModel[50].rotateAngleZ = -0.17453293F;

        abgrenadeModel[51].addShapeBox(-11F, -0.5F, -0.5F, 7, 7, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1.25F, 0.5F, 0F, 0.5F, -5.75F, 0F, 0.5F, -5.75F, 0F, -1.25F, 0.5F, 0F); // Box 170
        abgrenadeModel[51].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[51].rotateAngleX = -2.37364778F;
        abgrenadeModel[51].rotateAngleZ = -0.17453293F;

        abgrenadeModel[52].addShapeBox(-11F, 6.5F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 171
        abgrenadeModel[52].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[52].rotateAngleX = -2.37364778F;
        abgrenadeModel[52].rotateAngleZ = -0.17453293F;

        abgrenadeModel[53].addShapeBox(10F, 6.5F, -0.5F, 1, 7, 1, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F); // Box 172
        abgrenadeModel[53].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[53].rotateAngleX = -2.37364778F;
        abgrenadeModel[53].rotateAngleZ = -0.17453293F;

        abgrenadeModel[54].addShapeBox(4F, 13.5F, -0.5F, 7, 7, 1, 0F, 0.5F, -5.75F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.5F, -5.75F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 173
        abgrenadeModel[54].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[54].rotateAngleX = -2.37364778F;
        abgrenadeModel[54].rotateAngleZ = -0.17453293F;

        abgrenadeModel[55].addShapeBox(-11F, 13.5F, -0.5F, 7, 7, 1, 0F, -1.25F, 0.5F, 0F, 0.5F, -5.75F, 0F, 0.5F, -5.75F, 0F, -1.25F, 0.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 174
        abgrenadeModel[55].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[55].rotateAngleX = -2.37364778F;
        abgrenadeModel[55].rotateAngleZ = -0.17453293F;

        abgrenadeModel[56].addShapeBox(-4F, 19.5F, -0.5F, 8, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        abgrenadeModel[56].setRotationPoint(-10.5F, 41.5F, -11F);
        abgrenadeModel[56].rotateAngleX = -2.37364778F;
        abgrenadeModel[56].rotateAngleZ = -0.17453293F;

        abgrenadeModel[57].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 20, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 194
        abgrenadeModel[57].setRotationPoint(-10.5F, 41.5F, -10F);
        abgrenadeModel[57].rotateAngleZ = 0.17453293F;

        abgrenadeModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        abgrenadeModel[58].setRotationPoint(10F, 43F, 3F);

        abgrenadeModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, 0.75F, -1.5F, 0F, 0.75F, -1.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
        abgrenadeModel[59].setRotationPoint(11F, 43F, 3F);

        abgrenadeModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 152
        abgrenadeModel[60].setRotationPoint(9F, 43F, 3F);

        abgrenadeModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 153
        abgrenadeModel[61].setRotationPoint(7F, 45F, 3F);

        abgrenadeModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        abgrenadeModel[62].setRotationPoint(7F, 47F, 3F);

        abgrenadeModel[63].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 165
        abgrenadeModel[63].setRotationPoint(-10.5F, 41.5F, 10F);
        abgrenadeModel[63].rotateAngleZ = 0.17453293F;

        abgrenadeModel[64].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 165
        abgrenadeModel[64].setRotationPoint(-10.5F, 41.5F, 10F);
        abgrenadeModel[64].rotateAngleZ = 0.17453293F;

        abgrenadeModel[65].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 20, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 194
        abgrenadeModel[65].setRotationPoint(-10.5F, 41.5F, -10F);
        abgrenadeModel[65].rotateAngleZ = 0.17453293F;

        abgrenadeModel[66].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 20, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 194
        abgrenadeModel[66].setRotationPoint(-10.5F, 41.5F, -10F);
        abgrenadeModel[66].rotateAngleZ = 0.17453293F;


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glScalef(0.1F, 0.1F, 0.1F);
        for (int i = 0; i < 67; i++) {
            abgrenadeModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}