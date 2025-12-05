//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RGD5
// Model Creator:
// Created on:29.07.2020 - 21:00:31
// Last changed on: 29.07.2020 - 21:00:31

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelRGO extends ModelBase {
    public ModelRendererTurbo rgoModel[];
    int textureX = 512;
    int textureY = 512;

    public ModelRGO() {
        rgoModel = new ModelRendererTurbo[67];
        rgoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
        rgoModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 61
        rgoModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 62
        rgoModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 63
        rgoModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 64
        rgoModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 65
        rgoModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 66
        rgoModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 67
        rgoModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 68
        rgoModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 72
        rgoModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
        rgoModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 74
        rgoModel[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 75
        rgoModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 76
        rgoModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 77
        rgoModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 78
        rgoModel[16] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 79
        rgoModel[17] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 80
        rgoModel[18] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 81
        rgoModel[19] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 82
        rgoModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 83
        rgoModel[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 84
        rgoModel[22] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 85
        rgoModel[23] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 86
        rgoModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 87
        rgoModel[25] = new ModelRendererTurbo(this, 11, 86, textureX, textureY); // Box 108
        rgoModel[26] = new ModelRendererTurbo(this, 27, 86, textureX, textureY); // Box 109
        rgoModel[27] = new ModelRendererTurbo(this, 43, 86, textureX, textureY); // Box 110
        rgoModel[28] = new ModelRendererTurbo(this, 67, 86, textureX, textureY); // Box 111
        rgoModel[29] = new ModelRendererTurbo(this, 83, 86, textureX, textureY); // Box 112
        rgoModel[30] = new ModelRendererTurbo(this, 99, 86, textureX, textureY); // Box 113
        rgoModel[31] = new ModelRendererTurbo(this, 123, 86, textureX, textureY); // Box 114
        rgoModel[32] = new ModelRendererTurbo(this, 139, 86, textureX, textureY); // Box 115
        rgoModel[33] = new ModelRendererTurbo(this, 155, 86, textureX, textureY); // Box 116
        rgoModel[34] = new ModelRendererTurbo(this, 171, 86, textureX, textureY); // Box 117
        rgoModel[35] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 122
        rgoModel[36] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 123
        rgoModel[37] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 124
        rgoModel[38] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 125
        rgoModel[39] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 126
        rgoModel[40] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 129
        rgoModel[41] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 130
        rgoModel[42] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 131
        rgoModel[43] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 132
        rgoModel[44] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 133
        rgoModel[45] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 134
        rgoModel[46] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 135
        rgoModel[47] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 136
        rgoModel[48] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 137
        rgoModel[49] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 138
        rgoModel[50] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 139
        rgoModel[51] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 140
        rgoModel[52] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 141
        rgoModel[53] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 142
        rgoModel[54] = new ModelRendererTurbo(this, 12, 116, textureX, textureY); // Box 143
        rgoModel[55] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 144
        rgoModel[56] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 146
        rgoModel[57] = new ModelRendererTurbo(this, 179, 86, textureX, textureY); // Box 83
        rgoModel[58] = new ModelRendererTurbo(this, 203, 86, textureX, textureY); // Box 84
        rgoModel[59] = new ModelRendererTurbo(this, 235, 86, textureX, textureY); // Box 85
        rgoModel[60] = new ModelRendererTurbo(this, 275, 86, textureX, textureY); // Box 86
        rgoModel[61] = new ModelRendererTurbo(this, 307, 86, textureX, textureY); // Box 87
        rgoModel[62] = new ModelRendererTurbo(this, 259, 86, textureX, textureY); // Box 83
        rgoModel[63] = new ModelRendererTurbo(this, 331, 86, textureX, textureY); // Box 84
        rgoModel[64] = new ModelRendererTurbo(this, 363, 86, textureX, textureY); // Box 85
        rgoModel[65] = new ModelRendererTurbo(this, 403, 86, textureX, textureY); // Box 86
        rgoModel[66] = new ModelRendererTurbo(this, 387, 86, textureX, textureY); // Box 87

        rgoModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        rgoModel[0].setRotationPoint(-2F, -2F, -7.5F);

        rgoModel[1].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 61
        rgoModel[1].setRotationPoint(2F, -2F, -7.5F);

        rgoModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 62
        rgoModel[2].setRotationPoint(6F, -2F, -5.5F);

        rgoModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 1F, 0F, -2F, -2F, 0F, -5F, -2F, 0F, -5F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 63
        rgoModel[3].setRotationPoint(6F, -6F, -5.5F);

        rgoModel[4].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -2F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 64
        rgoModel[4].setRotationPoint(2F, -6F, -7.5F);

        rgoModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        rgoModel[5].setRotationPoint(-2F, -6F, -7.5F);

        rgoModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 66
        rgoModel[6].setRotationPoint(2F, -7F, -5.5F);

        rgoModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        rgoModel[7].setRotationPoint(-2F, -7F, -5.5F);

        rgoModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 68
        rgoModel[8].setRotationPoint(5F, -7F, -3.5F);

        rgoModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 72
        rgoModel[9].setRotationPoint(-5F, -7F, -5.5F);

        rgoModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 73
        rgoModel[10].setRotationPoint(-7F, -7F, -3.5F);

        rgoModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, -2F, 0F, -5F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 74
        rgoModel[11].setRotationPoint(-8F, -6F, -5.5F);

        rgoModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 75
        rgoModel[12].setRotationPoint(-8F, -2F, -5.5F);

        rgoModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 76
        rgoModel[13].setRotationPoint(-6F, -2F, -7.5F);

        rgoModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 77
        rgoModel[14].setRotationPoint(-6F, -6F, -7.5F);

        rgoModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -5F, -2F, 0F, -5F, 1F, 0F, -2F); // Box 78
        rgoModel[15].setRotationPoint(6F, 2F, -5.5F);

        rgoModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -2F); // Box 79
        rgoModel[16].setRotationPoint(2F, 2F, -7.5F);

        rgoModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 80
        rgoModel[17].setRotationPoint(-2F, 2F, -7.5F);

        rgoModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -4F); // Box 81
        rgoModel[18].setRotationPoint(-6F, 2F, -7.5F);

        rgoModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -5F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -5F); // Box 82
        rgoModel[19].setRotationPoint(-8F, 2F, -5.5F);

        rgoModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F); // Box 83
        rgoModel[20].setRotationPoint(-7F, 6F, -3.5F);

        rgoModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F); // Box 84
        rgoModel[21].setRotationPoint(-5F, 6F, -5.5F);

        rgoModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 85
        rgoModel[22].setRotationPoint(-2F, 6F, -5.5F);

        rgoModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F); // Box 86
        rgoModel[23].setRotationPoint(2F, 6F, -5.5F);

        rgoModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F); // Box 87
        rgoModel[24].setRotationPoint(5F, 6F, -3.5F);

        rgoModel[25].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, -0.5F, -0.25F, -0.25F); // Box 108
        rgoModel[25].setRotationPoint(-7F, 10.5F, -1.5F);

        rgoModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.75F, -0.25F); // Box 109
        rgoModel[26].setRotationPoint(-4.75F, 10.5F, -2F);

        rgoModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 3F, 0F, 0.25F, 1.75F, 0F, 0.25F, 1.75F, 0F, 0.25F, 3F, 0F); // Box 110
        rgoModel[27].setRotationPoint(-2.5F, 14.5F, -2F);

        rgoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 1F, -0.25F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.25F, 1F, -0.25F); // Box 111
        rgoModel[28].setRotationPoint(2F, 14.5F, -1.5F);

        rgoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, 1.75F, 0F); // Box 112
        rgoModel[29].setRotationPoint(0.75F, 14.5F, -2F);

        rgoModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 113
        rgoModel[30].setRotationPoint(-2.5F, 13F, -2F);

        rgoModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0F); // Box 114
        rgoModel[31].setRotationPoint(-4.75F, 10F, -2F);

        rgoModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 115
        rgoModel[32].setRotationPoint(-7.25F, 10F, -1.5F);

        rgoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F); // Box 116
        rgoModel[33].setRotationPoint(2.25F, 14F, -1.5F);

        rgoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F); // Box 117
        rgoModel[34].setRotationPoint(0.75F, 14F, -2F);

        rgoModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 122
        rgoModel[35].setRotationPoint(-5.5F, 11F, 0F);

        rgoModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 123
        rgoModel[36].setRotationPoint(-4.5F, 11F, 0F);

        rgoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 124
        rgoModel[37].setRotationPoint(-5.5F, 11.5F, -3F);

        rgoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
        rgoModel[38].setRotationPoint(-5.5F, 11F, -3F);

        rgoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 126
        rgoModel[39].setRotationPoint(-5.5F, 12F, -3F);

        rgoModel[40].addShapeBox(-1F, -0.25F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 129
        rgoModel[40].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[40].rotateAngleX = 1.93731547F;
        rgoModel[40].rotateAngleY = -6.28318531F;
        rgoModel[40].rotateAngleZ = 1.11701072F;

        rgoModel[41].addShapeBox(-4F, 2.75F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 130
        rgoModel[41].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[41].rotateAngleX = 1.93731547F;
        rgoModel[41].rotateAngleY = -6.28318531F;
        rgoModel[41].rotateAngleZ = 1.11701072F;

        rgoModel[42].addShapeBox(-4F, 0.75F, -0.5F, 1, 2, 1, 0F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 131
        rgoModel[42].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[42].rotateAngleX = 1.93731547F;
        rgoModel[42].rotateAngleY = -6.28318531F;
        rgoModel[42].rotateAngleZ = 1.11701072F;

        rgoModel[43].addShapeBox(-3F, -0.25F, -0.5F, 1, 1, 1, 0F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 132
        rgoModel[43].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[43].rotateAngleX = 1.93731547F;
        rgoModel[43].rotateAngleY = -6.28318531F;
        rgoModel[43].rotateAngleZ = 1.11701072F;

        rgoModel[44].addShapeBox(2F, -0.25F, -0.5F, 1, 1, 1, 0F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 133
        rgoModel[44].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[44].rotateAngleX = 1.93731547F;
        rgoModel[44].rotateAngleY = -6.28318531F;
        rgoModel[44].rotateAngleZ = 1.11701072F;

        rgoModel[45].addShapeBox(3F, 0.75F, -0.5F, 1, 2, 1, 0F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 134
        rgoModel[45].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[45].rotateAngleX = 1.93731547F;
        rgoModel[45].rotateAngleY = -6.28318531F;
        rgoModel[45].rotateAngleZ = 1.11701072F;

        rgoModel[46].addShapeBox(3F, 2.75F, -0.5F, 1, 2, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 135
        rgoModel[46].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[46].rotateAngleX = 1.93731547F;
        rgoModel[46].rotateAngleY = -6.28318531F;
        rgoModel[46].rotateAngleZ = 1.11701072F;

        rgoModel[47].addShapeBox(3F, 4.75F, -0.5F, 1, 2, 1, 0F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F); // Box 136
        rgoModel[47].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[47].rotateAngleX = 1.93731547F;
        rgoModel[47].rotateAngleY = -6.28318531F;
        rgoModel[47].rotateAngleZ = 1.11701072F;

        rgoModel[48].addShapeBox(2F, 6.75F, -0.5F, 1, 1, 1, 0F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F); // Box 137
        rgoModel[48].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[48].rotateAngleX = 1.93731547F;
        rgoModel[48].rotateAngleY = -6.28318531F;
        rgoModel[48].rotateAngleZ = 1.11701072F;

        rgoModel[49].addShapeBox(-1F, 6.75F, -0.5F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
        rgoModel[49].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[49].rotateAngleX = 1.93731547F;
        rgoModel[49].rotateAngleY = -6.28318531F;
        rgoModel[49].rotateAngleZ = 1.11701072F;

        rgoModel[50].addShapeBox(-3F, 6.75F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F); // Box 139
        rgoModel[50].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[50].rotateAngleX = 1.93731547F;
        rgoModel[50].rotateAngleY = -6.28318531F;
        rgoModel[50].rotateAngleZ = 1.11701072F;

        rgoModel[51].addShapeBox(-4F, 4.75F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F); // Box 140
        rgoModel[51].setRotationPoint(-5F, 12F, 4.5F);
        rgoModel[51].rotateAngleX = 1.93731547F;
        rgoModel[51].rotateAngleY = -6.28318531F;
        rgoModel[51].rotateAngleZ = 1.11701072F;

        rgoModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0F, 2F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, -1F, 0F); // Box 141
        rgoModel[52].setRotationPoint(-5.5F, 17F, -1F);

        rgoModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -2.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 1.5F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F); // Box 142
        rgoModel[53].setRotationPoint(-11.5F, 16F, -1F);

        rgoModel[54].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, -3F, -3F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F); // Box 143
        rgoModel[54].setRotationPoint(-13F, 1F, -1F);

        rgoModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F); // Box 144
        rgoModel[55].setRotationPoint(-10F, 1F, -1F);

        rgoModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        rgoModel[56].setRotationPoint(-9.5F, 0F, -1F);

        rgoModel[57].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F); // Box 83
        rgoModel[57].setRotationPoint(-7F, 7F, -3.5F);

        rgoModel[58].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F); // Box 84
        rgoModel[58].setRotationPoint(-5F, 7F, -5.5F);

        rgoModel[59].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 85
        rgoModel[59].setRotationPoint(-2F, 7F, -5.5F);

        rgoModel[60].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F); // Box 86
        rgoModel[60].setRotationPoint(2F, 7F, -5.5F);

        rgoModel[61].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F); // Box 87
        rgoModel[61].setRotationPoint(5F, 7F, -3.5F);

        rgoModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -4.25F, 0F, -3.5F, 3F, 0F, -2.25F, 3F, 0F, -2.25F, -4.25F, 0F, -3.5F); // Box 83
        rgoModel[62].setRotationPoint(-7F, 13F, -3.5F);

        rgoModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, -3F, 0F, -4.25F, 1.25F, 0F, -3.25F, 1.25F, 0F, -3.25F, -3F, 0F, -4.25F); // Box 84
        rgoModel[63].setRotationPoint(-5F, 13F, -5.5F);

        rgoModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1.25F, 0F, -3.25F, -1.25F, 0F, -3.25F, -1.25F, 0F, -3.25F, -1.25F, 0F, -3.25F); // Box 85
        rgoModel[64].setRotationPoint(-2F, 13F, -5.5F);

        rgoModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 1.25F, 0F, -3.25F, -3F, 0F, -4.25F, -3F, 0F, -4.25F, 1.25F, 0F, -3.25F); // Box 86
        rgoModel[65].setRotationPoint(2F, 13F, -5.5F);

        rgoModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 3F, 0F, -2.25F, -4.25F, 0F, -3.5F, -4.25F, 0F, -3.5F, 3F, 0F, -2.25F); // Box 87
        rgoModel[66].setRotationPoint(5F, 13F, -3.5F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glScalef(0.2F, 0.2F, 0.2F);
        for (int i = 0; i < 67; i++) {
            rgoModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}