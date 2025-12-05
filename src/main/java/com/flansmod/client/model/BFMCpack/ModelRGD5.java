//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
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

public class ModelRGD5 extends ModelBase {
    public ModelRendererTurbo rgd5Model[];
    int textureX = 512;
    int textureY = 512;

    public ModelRGD5() {
        rgd5Model = new ModelRendererTurbo[82];
        rgd5Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
        rgd5Model[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 61
        rgd5Model[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 62
        rgd5Model[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 63
        rgd5Model[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 64
        rgd5Model[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 65
        rgd5Model[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 66
        rgd5Model[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 67
        rgd5Model[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 68
        rgd5Model[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 72
        rgd5Model[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
        rgd5Model[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 74
        rgd5Model[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 75
        rgd5Model[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 76
        rgd5Model[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 77
        rgd5Model[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 78
        rgd5Model[16] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 79
        rgd5Model[17] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 80
        rgd5Model[18] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 81
        rgd5Model[19] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 82
        rgd5Model[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 83
        rgd5Model[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 84
        rgd5Model[22] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 85
        rgd5Model[23] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 86
        rgd5Model[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 87
        rgd5Model[25] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 88
        rgd5Model[26] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 89
        rgd5Model[27] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 90
        rgd5Model[28] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 91
        rgd5Model[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 92
        rgd5Model[30] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 93
        rgd5Model[31] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 94
        rgd5Model[32] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 95
        rgd5Model[33] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 96
        rgd5Model[34] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 97
        rgd5Model[35] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 98
        rgd5Model[36] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 99
        rgd5Model[37] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 100
        rgd5Model[38] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 101
        rgd5Model[39] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 102
        rgd5Model[40] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
        rgd5Model[41] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 104
        rgd5Model[42] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 105
        rgd5Model[43] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 106
        rgd5Model[44] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 107
        rgd5Model[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 108
        rgd5Model[46] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 109
        rgd5Model[47] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 110
        rgd5Model[48] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 111
        rgd5Model[49] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 112
        rgd5Model[50] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 113
        rgd5Model[51] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 114
        rgd5Model[52] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 115
        rgd5Model[53] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 116
        rgd5Model[54] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 117
        rgd5Model[55] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 118
        rgd5Model[56] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 119
        rgd5Model[57] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
        rgd5Model[58] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 121
        rgd5Model[59] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 122
        rgd5Model[60] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 123
        rgd5Model[61] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 124
        rgd5Model[62] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 125
        rgd5Model[63] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 126
        rgd5Model[64] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 129
        rgd5Model[65] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 130
        rgd5Model[66] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 131
        rgd5Model[67] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 132
        rgd5Model[68] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 133
        rgd5Model[69] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 134
        rgd5Model[70] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 135
        rgd5Model[71] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 136
        rgd5Model[72] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 137
        rgd5Model[73] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 138
        rgd5Model[74] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 139
        rgd5Model[75] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 140
        rgd5Model[76] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 141
        rgd5Model[77] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 142
        rgd5Model[78] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 143
        rgd5Model[79] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 144
        rgd5Model[80] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 145
        rgd5Model[81] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 146

        rgd5Model[0].addShapeBox(0F, 0F, 0F, 4, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        rgd5Model[0].setRotationPoint(-2F, -5F, -7.5F);

        rgd5Model[1].addShapeBox(0F, 0F, 0F, 4, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 61
        rgd5Model[1].setRotationPoint(2F, -5F, -7.5F);

        rgd5Model[2].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 62
        rgd5Model[2].setRotationPoint(6F, -5F, -5.5F);

        rgd5Model[3].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 1F, 0F, -2F, -2F, 0F, -5F, -2F, 0F, -5F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 63
        rgd5Model[3].setRotationPoint(6F, -9F, -5.5F);

        rgd5Model[4].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -2F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 64
        rgd5Model[4].setRotationPoint(2F, -9F, -7.5F);

        rgd5Model[5].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        rgd5Model[5].setRotationPoint(-2F, -9F, -7.5F);

        rgd5Model[6].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 66
        rgd5Model[6].setRotationPoint(2F, -10F, -5.5F);

        rgd5Model[7].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        rgd5Model[7].setRotationPoint(-2F, -10F, -5.5F);

        rgd5Model[8].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 68
        rgd5Model[8].setRotationPoint(5F, -10F, -3.5F);

        rgd5Model[9].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 72
        rgd5Model[9].setRotationPoint(-5F, -10F, -5.5F);

        rgd5Model[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 73
        rgd5Model[10].setRotationPoint(-7F, -10F, -3.5F);

        rgd5Model[11].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, -2F, 0F, -5F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 74
        rgd5Model[11].setRotationPoint(-8F, -9F, -5.5F);

        rgd5Model[12].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 75
        rgd5Model[12].setRotationPoint(-8F, -5F, -5.5F);

        rgd5Model[13].addShapeBox(0F, 0F, 0F, 4, 10, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 76
        rgd5Model[13].setRotationPoint(-6F, -5F, -7.5F);

        rgd5Model[14].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 77
        rgd5Model[14].setRotationPoint(-6F, -9F, -7.5F);

        rgd5Model[15].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -5F, -2F, 0F, -5F, 1F, 0F, -2F); // Box 78
        rgd5Model[15].setRotationPoint(6F, 5F, -5.5F);

        rgd5Model[16].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -2F); // Box 79
        rgd5Model[16].setRotationPoint(2F, 5F, -7.5F);

        rgd5Model[17].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 80
        rgd5Model[17].setRotationPoint(-2F, 5F, -7.5F);

        rgd5Model[18].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -4F); // Box 81
        rgd5Model[18].setRotationPoint(-6F, 5F, -7.5F);

        rgd5Model[19].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -5F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -5F); // Box 82
        rgd5Model[19].setRotationPoint(-8F, 5F, -5.5F);

        rgd5Model[20].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F); // Box 83
        rgd5Model[20].setRotationPoint(-7F, 9F, -3.5F);

        rgd5Model[21].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F); // Box 84
        rgd5Model[21].setRotationPoint(-5F, 9F, -5.5F);

        rgd5Model[22].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 85
        rgd5Model[22].setRotationPoint(-2F, 9F, -5.5F);

        rgd5Model[23].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F); // Box 86
        rgd5Model[23].setRotationPoint(2F, 9F, -5.5F);

        rgd5Model[24].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F); // Box 87
        rgd5Model[24].setRotationPoint(5F, 9F, -3.5F);

        rgd5Model[25].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        rgd5Model[25].setRotationPoint(-2.5F, -0.5F, -8.5F);

        rgd5Model[26].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 89
        rgd5Model[26].setRotationPoint(2.5F, -0.5F, -8.5F);

        rgd5Model[27].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F); // Box 90
        rgd5Model[27].setRotationPoint(6F, -0.5F, -6.5F);

        rgd5Model[28].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        rgd5Model[28].setRotationPoint(-2.5F, -1.5F, -8.5F);

        rgd5Model[29].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -2.5F, 0F, -0.75F, -2.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 92
        rgd5Model[29].setRotationPoint(2.5F, -1.5F, -8.5F);

        rgd5Model[30].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F); // Box 93
        rgd5Model[30].setRotationPoint(6F, -1.5F, -6.5F);

        rgd5Model[31].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -2.5F, 0F, -0.75F, -2.5F, 0F, -0.75F, -0.5F); // Box 94
        rgd5Model[31].setRotationPoint(2.5F, 0.5F, -8.5F);

        rgd5Model[32].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F, -0.5F); // Box 95
        rgd5Model[32].setRotationPoint(6F, 0.5F, -6.5F);

        rgd5Model[33].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 96
        rgd5Model[33].setRotationPoint(-2.5F, 0.5F, -8.5F);

        rgd5Model[34].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.75F, -2.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -2.5F); // Box 97
        rgd5Model[34].setRotationPoint(-6.5F, 0.5F, -8.5F);

        rgd5Model[35].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -4.75F); // Box 98
        rgd5Model[35].setRotationPoint(-9F, 0.5F, -6.5F);

        rgd5Model[36].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, -0.75F, -2.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 99
        rgd5Model[36].setRotationPoint(-6.5F, -1.5F, -8.5F);

        rgd5Model[37].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 100
        rgd5Model[37].setRotationPoint(-6.5F, -0.5F, -8.5F);

        rgd5Model[38].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -4.75F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F); // Box 101
        rgd5Model[38].setRotationPoint(-9F, -1.5F, -6.5F);

        rgd5Model[39].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F); // Box 102
        rgd5Model[39].setRotationPoint(-9F, -0.5F, -6.5F);

        rgd5Model[40].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 103
        rgd5Model[40].setRotationPoint(-0.5F, 10F, -1.5F);

        rgd5Model[41].addShapeBox(0F, 0F, 0F, 1, 17, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 104
        rgd5Model[41].setRotationPoint(0.5F, 10F, -1.5F);

        rgd5Model[42].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 105
        rgd5Model[42].setRotationPoint(1.5F, 10F, -1F);

        rgd5Model[43].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 106
        rgd5Model[43].setRotationPoint(-2.5F, 10F, -1F);

        rgd5Model[44].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 107
        rgd5Model[44].setRotationPoint(-1.5F, 10F, -1.5F);

        rgd5Model[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F); // Box 108
        rgd5Model[45].setRotationPoint(-3F, 10F, -1.5F);

        rgd5Model[46].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 109
        rgd5Model[46].setRotationPoint(-1.75F, 10F, -2F);

        rgd5Model[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 110
        rgd5Model[47].setRotationPoint(-0.5F, 10F, -2F);

        rgd5Model[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F); // Box 111
        rgd5Model[48].setRotationPoint(2F, 10F, -1.5F);

        rgd5Model[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 112
        rgd5Model[49].setRotationPoint(0.75F, 10F, -2F);

        rgd5Model[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 113
        rgd5Model[50].setRotationPoint(-0.5F, 9.5F, -2F);

        rgd5Model[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -0.75F); // Box 114
        rgd5Model[51].setRotationPoint(-1.75F, 9.5F, -2F);

        rgd5Model[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F); // Box 115
        rgd5Model[52].setRotationPoint(-3.25F, 9.5F, -1.5F);

        rgd5Model[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, -0.25F); // Box 116
        rgd5Model[53].setRotationPoint(2.25F, 9.5F, -1.5F);

        rgd5Model[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F); // Box 117
        rgd5Model[54].setRotationPoint(0.75F, 9.5F, -2F);

        rgd5Model[55].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F, -0.375F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.375F, 0F, -0.75F); // Box 118
        rgd5Model[55].setRotationPoint(-2.5F, 13F, -1F);

        rgd5Model[56].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 119
        rgd5Model[56].setRotationPoint(-1.5F, 13F, -1.5F);

        rgd5Model[57].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.375F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.375F, 0F, -0.75F); // Box 120
        rgd5Model[57].setRotationPoint(-2.5F, 23F, -1F);

        rgd5Model[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.375F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.625F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.625F, -0.75F, -0.75F); // Box 121
        rgd5Model[58].setRotationPoint(-2.5F, 25F, -1F);

        rgd5Model[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 122
        rgd5Model[59].setRotationPoint(-0.5F, 13F, -1.5F);

        rgd5Model[60].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 123
        rgd5Model[60].setRotationPoint(0.5F, 13F, -1.5F);

        rgd5Model[61].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 124
        rgd5Model[61].setRotationPoint(-0.5F, 13.5F, -4.5F);

        rgd5Model[62].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
        rgd5Model[62].setRotationPoint(-0.5F, 13F, -4.5F);

        rgd5Model[63].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 126
        rgd5Model[63].setRotationPoint(-0.5F, 14F, -4.5F);

        rgd5Model[64].addShapeBox(-1F, -0.25F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 129
        rgd5Model[64].setRotationPoint(0F, 14F, 3F);
        rgd5Model[64].rotateAngleX = 1.93731547F;
        rgd5Model[64].rotateAngleY = -6.28318531F;
        rgd5Model[64].rotateAngleZ = 1.11701072F;

        rgd5Model[65].addShapeBox(-4F, 2.75F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 130
        rgd5Model[65].setRotationPoint(0F, 14F, 3F);
        rgd5Model[65].rotateAngleX = 1.93731547F;
        rgd5Model[65].rotateAngleY = -6.28318531F;
        rgd5Model[65].rotateAngleZ = 1.11701072F;

        rgd5Model[66].addShapeBox(-4F, 0.75F, -0.5F, 1, 2, 1, 0F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 131
        rgd5Model[66].setRotationPoint(0F, 14F, 3F);
        rgd5Model[66].rotateAngleX = 1.93731547F;
        rgd5Model[66].rotateAngleY = -6.28318531F;
        rgd5Model[66].rotateAngleZ = 1.11701072F;

        rgd5Model[67].addShapeBox(-3F, -0.25F, -0.5F, 1, 1, 1, 0F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 132
        rgd5Model[67].setRotationPoint(0F, 14F, 3F);
        rgd5Model[67].rotateAngleX = 1.93731547F;
        rgd5Model[67].rotateAngleY = -6.28318531F;
        rgd5Model[67].rotateAngleZ = 1.11701072F;

        rgd5Model[68].addShapeBox(2F, -0.25F, -0.5F, 1, 1, 1, 0F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 133
        rgd5Model[68].setRotationPoint(0F, 14F, 3F);
        rgd5Model[68].rotateAngleX = 1.93731547F;
        rgd5Model[68].rotateAngleY = -6.28318531F;
        rgd5Model[68].rotateAngleZ = 1.11701072F;

        rgd5Model[69].addShapeBox(3F, 0.75F, -0.5F, 1, 2, 1, 0F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 134
        rgd5Model[69].setRotationPoint(0F, 14F, 3F);
        rgd5Model[69].rotateAngleX = 1.93731547F;
        rgd5Model[69].rotateAngleY = -6.28318531F;
        rgd5Model[69].rotateAngleZ = 1.11701072F;

        rgd5Model[70].addShapeBox(3F, 2.75F, -0.5F, 1, 2, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 135
        rgd5Model[70].setRotationPoint(0F, 14F, 3F);
        rgd5Model[70].rotateAngleX = 1.93731547F;
        rgd5Model[70].rotateAngleY = -6.28318531F;
        rgd5Model[70].rotateAngleZ = 1.11701072F;

        rgd5Model[71].addShapeBox(3F, 4.75F, -0.5F, 1, 2, 1, 0F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F); // Box 136
        rgd5Model[71].setRotationPoint(0F, 14F, 3F);
        rgd5Model[71].rotateAngleX = 1.93731547F;
        rgd5Model[71].rotateAngleY = -6.28318531F;
        rgd5Model[71].rotateAngleZ = 1.11701072F;

        rgd5Model[72].addShapeBox(2F, 6.75F, -0.5F, 1, 1, 1, 0F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F); // Box 137
        rgd5Model[72].setRotationPoint(0F, 14F, 3F);
        rgd5Model[72].rotateAngleX = 1.93731547F;
        rgd5Model[72].rotateAngleY = -6.28318531F;
        rgd5Model[72].rotateAngleZ = 1.11701072F;

        rgd5Model[73].addShapeBox(-1F, 6.75F, -0.5F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
        rgd5Model[73].setRotationPoint(0F, 14F, 3F);
        rgd5Model[73].rotateAngleX = 1.93731547F;
        rgd5Model[73].rotateAngleY = -6.28318531F;
        rgd5Model[73].rotateAngleZ = 1.11701072F;

        rgd5Model[74].addShapeBox(-3F, 6.75F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F); // Box 139
        rgd5Model[74].setRotationPoint(0F, 14F, 3F);
        rgd5Model[74].rotateAngleX = 1.93731547F;
        rgd5Model[74].rotateAngleY = -6.28318531F;
        rgd5Model[74].rotateAngleZ = 1.11701072F;

        rgd5Model[75].addShapeBox(-4F, 4.75F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F); // Box 140
        rgd5Model[75].setRotationPoint(0F, 14F, 3F);
        rgd5Model[75].rotateAngleX = 1.93731547F;
        rgd5Model[75].rotateAngleY = -6.28318531F;
        rgd5Model[75].rotateAngleZ = 1.11701072F;

        rgd5Model[76].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 141
        rgd5Model[76].setRotationPoint(-3.5F, 13F, -1F);

        rgd5Model[77].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -1F, 3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 3.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 142
        rgd5Model[77].setRotationPoint(-7.5F, 12F, -1F);

        rgd5Model[78].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F); // Box 143
        rgd5Model[78].setRotationPoint(-10.5F, 1F, -1F);

        rgd5Model[79].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 144
        rgd5Model[79].setRotationPoint(-10.5F, -4F, -1F);

        rgd5Model[80].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        rgd5Model[80].setRotationPoint(-10.5F, -6F, -1F);

        rgd5Model[81].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        rgd5Model[81].setRotationPoint(-11F, -7F, -1F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.12F, 0.12F, 0.12F);

        for (int i = 0; i < 82; i++) {
            rgd5Model[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}