//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MartiniHenry
// Model Creator: 
// Created on: 02.02.2017 - 13:29:36
// Last changed on: 02.02.2017 - 13:29:36

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMartini extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 128;

    public ModelMartini() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[109];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
        gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
        gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
        gunModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
        gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
        gunModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
        gunModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 14
        gunModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 15
        gunModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 16
        gunModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 17
        gunModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 18
        gunModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 22
        gunModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 23
        gunModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
        gunModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
        gunModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
        gunModel[17] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 27
        gunModel[18] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 28
        gunModel[19] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 29
        gunModel[20] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 30
        gunModel[21] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 31
        gunModel[22] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 32
        gunModel[23] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 33
        gunModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
        gunModel[25] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 35
        gunModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36
        gunModel[27] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 37
        gunModel[28] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 38
        gunModel[29] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 39
        gunModel[30] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 40
        gunModel[31] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 41
        gunModel[32] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 46
        gunModel[33] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 47
        gunModel[34] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 48
        gunModel[35] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 49
        gunModel[36] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 50
        gunModel[37] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 51
        gunModel[38] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 52
        gunModel[39] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 53
        gunModel[40] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 54
        gunModel[41] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 55
        gunModel[42] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 56
        gunModel[43] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 57
        gunModel[44] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 58
        gunModel[45] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 59
        gunModel[46] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 60
        gunModel[47] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 61
        gunModel[48] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 62
        gunModel[49] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 63
        gunModel[50] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 64
        gunModel[51] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 65
        gunModel[52] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 67
        gunModel[53] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 75
        gunModel[54] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 76
        gunModel[55] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 75
        gunModel[56] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 76
        gunModel[57] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 77
        gunModel[58] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 78
        gunModel[59] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 80
        gunModel[60] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 81
        gunModel[61] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 82
        gunModel[62] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 83
        gunModel[63] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 84
        gunModel[64] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 85
        gunModel[65] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 86
        gunModel[66] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 87
        gunModel[67] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 90
        gunModel[68] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 91
        gunModel[69] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 92
        gunModel[70] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 94
        gunModel[71] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 95
        gunModel[72] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 96
        gunModel[73] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 97
        gunModel[74] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 98
        gunModel[75] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 99
        gunModel[76] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 100
        gunModel[77] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 101
        gunModel[78] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 102
        gunModel[79] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 103
        gunModel[80] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 104
        gunModel[81] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 105
        gunModel[82] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 106
        gunModel[83] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 107
        gunModel[84] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 108
        gunModel[85] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 109
        gunModel[86] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 110
        gunModel[87] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 111
        gunModel[88] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 112
        gunModel[89] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 113
        gunModel[90] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 114
        gunModel[91] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 115
        gunModel[92] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 116
        gunModel[93] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 117
        gunModel[94] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 118
        gunModel[95] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 119
        gunModel[96] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 120
        gunModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 121
        gunModel[98] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 122
        gunModel[99] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 123
        gunModel[100] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 124
        gunModel[101] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 125
        gunModel[102] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 126
        gunModel[103] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 127
        gunModel[104] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 128
        gunModel[105] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 129
        gunModel[106] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 130
        gunModel[107] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 131
        gunModel[108] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 132

        gunModel[0].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        gunModel[0].setRotationPoint(1F, -19.25F, -1F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        gunModel[1].setRotationPoint(-7F, -18.25F, -1F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F); // Box 4
        gunModel[2].setRotationPoint(-8F, -18.25F, -1F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        gunModel[3].setRotationPoint(-7F, -19.25F, -1.5F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
        gunModel[4].setRotationPoint(-9F, -19.25F, -1.5F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 11
        gunModel[5].setRotationPoint(-2F, -21.25F, 1F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F); // Box 13
        gunModel[6].setRotationPoint(-9F, -20.25F, -0.5F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 14
        gunModel[7].setRotationPoint(-7F, -20.25F, -0.5F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F); // Box 15
        gunModel[8].setRotationPoint(0F, -21.25F, -1.5F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 16
        gunModel[9].setRotationPoint(1F, -20.25F, -1.5F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 17
        gunModel[10].setRotationPoint(-6.5F, -20.25F, -1F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, 0.6F, 0F, 0F, 0.1F, -0.4F, 0F, -0.75F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 18
        gunModel[11].setRotationPoint(-2.5F, -20.25F, -1F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        gunModel[12].setRotationPoint(24F, -19.25F, -1.5F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, -1.5F, -0.25F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, -1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, -0.25F); // Box 23
        gunModel[13].setRotationPoint(-14.5F, -17.75F, -1.5F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -4F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 24
        gunModel[14].setRotationPoint(-7F, -20.25F, 1F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.25F, 0F, -1.9F, -0.4F, 0F, -1.9F, -0.4F, -0.75F, -1F, -0.25F, -0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, -0.75F); // Box 25
        gunModel[15].setRotationPoint(-7F, -21.25F, 1F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -2F, 0F, -1.25F, 1F, 0F, -1.25F, 1F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0F, 1.5F, 0F); // Box 26
        gunModel[16].setRotationPoint(-14.5F, -18.75F, -0.5F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, -1.5F, -0.25F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, -1.5F, -0.25F, 0F, 1.25F, -1F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0F, 1.25F, -1F); // Box 27
        gunModel[17].setRotationPoint(-14.5F, -15.75F, -1.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 28
        gunModel[18].setRotationPoint(-34.5F, -16.25F, -1.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 29
        gunModel[19].setRotationPoint(-34.5F, -17.25F, -0.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 20, 7, 3, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -7F, -0.25F, 0F, -7F, -0.25F, 0F, 0F, -0.25F); // Box 30
        gunModel[20].setRotationPoint(-34.5F, -14.25F, -1.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 20, 7, 3, 0F, 0F, -6F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -6F, -0.25F, 0F, 0F, -1F, 0F, -7.25F, -1F, 0F, -7.25F, -1F, 0F, 0F, -1F); // Box 31
        gunModel[21].setRotationPoint(-34.5F, -13.25F, -1.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        gunModel[22].setRotationPoint(24F, -20.25F, -1.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.15F, -0.5F); // Box 33
        gunModel[23].setRotationPoint(24F, -17.25F, -1F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        gunModel[24].setRotationPoint(3F, -21F, -0.5F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
        gunModel[25].setRotationPoint(3F, -19F, -1.5F);
        gunModel[25].rotateAngleX = 1.57079633F;

        gunModel[26].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F); // Box 36
        gunModel[26].setRotationPoint(3F, -19F, 0.5F);
        gunModel[26].rotateAngleX = 1.57079633F;

        gunModel[27].addShapeBox(0F, 0F, 0F, 35, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 37
        gunModel[27].setRotationPoint(25F, -20.25F, -1F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
        gunModel[28].setRotationPoint(57F, -19.25F, -1.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 39
        gunModel[29].setRotationPoint(57F, -20.25F, -1.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 40
        gunModel[30].setRotationPoint(57F, -17.25F, -1.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.1F, 0F, 0.2F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.2F, -0.6F); // Box 41
        gunModel[31].setRotationPoint(25F, -17.75F, -1.5F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 46
        gunModel[32].setRotationPoint(60F, -18F, -0.5F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 47
        gunModel[33].setRotationPoint(60F, -19.5F, -0.5F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 48
        gunModel[34].setRotationPoint(-1F, -16.25F, -1F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0.25F, -0.25F, -2F, 0.25F, -0.25F, 1F, 0F, -0.25F); // Box 49
        gunModel[35].setRotationPoint(-1F, -14.25F, -1F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 50
        gunModel[36].setRotationPoint(-4F, -13.25F, -1F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0.25F, -0.25F); // Box 51
        gunModel[37].setRotationPoint(-5F, -14.25F, -1F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0.25F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 52
        gunModel[38].setRotationPoint(-5F, -16.25F, -1F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 53
        gunModel[39].setRotationPoint(-5F, -15.25F, -1F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F); // Box 54
        gunModel[40].setRotationPoint(-4F, -16.25F, -1F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F); // Box 55
        gunModel[41].setRotationPoint(-3F, -16.25F, -0.5F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 56
        gunModel[42].setRotationPoint(-4.5F, -14.75F, -0.5F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.25F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 1.5F, -2.25F, 0F, 1.5F, -2.25F, 0F, 0F, 0F, 0F); // Box 57
        gunModel[43].setRotationPoint(-11F, -15.25F, -1F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, 0.5F, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0.5F, 0F, 0F); // Box 58
        gunModel[44].setRotationPoint(-12F, -14.25F, -1F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F); // Box 59
        gunModel[45].setRotationPoint(-14F, -12.25F, -1F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.75F, 0F); // Box 60
        gunModel[46].setRotationPoint(-15.5F, -12.25F, -1F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 61
        gunModel[47].setRotationPoint(-14.5F, -12.25F, -1F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.25F, 0F); // Box 62
        gunModel[48].setRotationPoint(-15.5F, -13.25F, -1F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        gunModel[49].setRotationPoint(15F, -20.5F, -1F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 64
        gunModel[50].setRotationPoint(16F, -21.25F, -1F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F); // Box 65
        gunModel[51].setRotationPoint(63.5F, -21.5F, -0.5F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 67
        gunModel[52].setRotationPoint(19F, -22F, -1F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F); // Box 75
        gunModel[53].setRotationPoint(-5.5F, -17.75F, -1.5F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F); // Box 76
        gunModel[54].setRotationPoint(-5.5F, -18.5F, -1.5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F); // Box 75
        gunModel[55].setRotationPoint(-5.5F, -18.5F, -1.5F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F); // Box 76
        gunModel[56].setRotationPoint(-5.5F, -17.75F, -1.5F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F); // Box 77
        gunModel[57].setRotationPoint(-0.5F, -17.75F, -1.5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F, -0.4F, -0.25F, 0.1F); // Box 78
        gunModel[58].setRotationPoint(-0.5F, -17.75F, -1.5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 80
        gunModel[59].setRotationPoint(-1F, -21.25F, -1.5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F); // Box 81
        gunModel[60].setRotationPoint(-6F, -21F, 1F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 82
        gunModel[61].setRotationPoint(-6F, -21F, 1F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F); // Box 83
        gunModel[62].setRotationPoint(-6F, -21F, -2F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 84
        gunModel[63].setRotationPoint(-6F, -21F, -2F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F); // Box 85
        gunModel[64].setRotationPoint(24F, -17.25F, 0F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.5F, 0F, 0.15F, -0.5F); // Box 86
        gunModel[65].setRotationPoint(24F, -17.25F, -2F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 87
        gunModel[66].setRotationPoint(24F, -20.75F, -1.5F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.35F, -0.5F, 0.15F, -0.35F, -0.5F, 0.15F, -0.35F, -0.5F, 0.15F, -0.35F, -0.5F, 0.15F, -0.15F, -0.25F, 0.15F, -0.15F, -0.25F, 0.15F, -0.15F, -0.25F, 0.15F, -0.15F, -0.25F, 0.15F); // Box 90
        gunModel[67].setRotationPoint(19F, -21.45F, -1F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.75F, 0.15F, -0.15F, -0.75F, 0.15F, -0.15F, -0.75F, 0.15F, -0.15F, -0.75F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F); // Box 91
        gunModel[68].setRotationPoint(19F, -21.45F, -1F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 92
        gunModel[69].setRotationPoint(60F, -18.5F, -0.5F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.25F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 94
        gunModel[70].setRotationPoint(-7F, -20.25F, 0.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F); // Box 95
        gunModel[71].setRotationPoint(-9F, -20.25F, 0.5F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 96
        gunModel[72].setRotationPoint(-7F, -20.25F, -1.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F); // Box 97
        gunModel[73].setRotationPoint(-9F, -20.25F, -1.5F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0.25F, 0F, -0.5F); // Box 98
        gunModel[74].setRotationPoint(-8F, -18.25F, 1F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 99
        gunModel[75].setRotationPoint(-7F, -18.25F, 1F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -2F, 0F, -1.25F, 1F, 0F, -1.25F, 0.75F, -0.25F, 0F, -2.1F, -0.5F, 0F, 1.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0F, 1.5F, -0.25F); // Box 100
        gunModel[76].setRotationPoint(-14.5F, -18.75F, 0.5F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F); // Box 101
        gunModel[77].setRotationPoint(-34.5F, -17.25F, 0.5F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -2.1F, -0.5F, -1.25F, 0.75F, -0.25F, -1.25F, 1F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0F, 1.5F, 0F); // Box 102
        gunModel[78].setRotationPoint(-14.5F, -18.75F, -1.5F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -1F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 103
        gunModel[79].setRotationPoint(-34.5F, -17.25F, -1.5F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.6F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.6F, 0F, -0.5F, -0.5F); // Box 104
        gunModel[80].setRotationPoint(1F, -19.25F, 1F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        gunModel[81].setRotationPoint(1F, -19.25F, -2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -4F, -0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        gunModel[82].setRotationPoint(-7F, -20.25F, 0.5F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.25F, -0.75F, -1.9F, -0.4F, -0.75F, -1.9F, -0.5F, 0F, -1F, -0.25F, 0F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 1F, 0F); // Box 107
        gunModel[83].setRotationPoint(-7F, -21.25F, 0.5F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, 0F, -1.25F, -0.35F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.1F, 0F); // Box 108
        gunModel[84].setRotationPoint(-2F, -21.25F, 0.5F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        gunModel[85].setRotationPoint(-2F, -21.25F, -2F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        gunModel[86].setRotationPoint(-7F, -20.25F, -2F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.25F, -0.75F, -1.9F, -0.4F, -0.75F, -1.9F, -0.4F, 0F, -1F, -0.25F, 0F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 111
        gunModel[87].setRotationPoint(-7F, -21.25F, -2F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -4F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -4F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 112
        gunModel[88].setRotationPoint(-7F, -20.25F, -1.5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.25F, 0F, -1.9F, -0.5F, 0F, -1.9F, -0.4F, -0.75F, -1F, -0.25F, -0.75F, 0F, 1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 1F, -0.75F); // Box 113
        gunModel[89].setRotationPoint(-7F, -21.25F, -1.5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, -0.35F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.75F, -1.25F, -0.25F, -0.75F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 114
        gunModel[90].setRotationPoint(-2F, -21.25F, -1.5F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        gunModel[91].setRotationPoint(-7F, -18.25F, -2F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0.25F, 0.25F, 0F); // Box 116
        gunModel[92].setRotationPoint(-8F, -18.25F, -2F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 117
        gunModel[93].setRotationPoint(1F, -21.25F, -1F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F); // Box 118
        gunModel[94].setRotationPoint(1F, -21.25F, 0F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 62, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 119
        gunModel[95].setRotationPoint(5F, -20F, -1F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 62, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F); // Box 120
        gunModel[96].setRotationPoint(5F, -21F, -1F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 62, 1, 2, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F); // Box 121
        gunModel[97].setRotationPoint(5F, -19F, -1F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 122
        gunModel[98].setRotationPoint(19F, -22F, -1F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 123
        gunModel[99].setRotationPoint(19F, -22F, 0F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, -0.75F, -0.2F, -0.15F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 124
        gunModel[100].setRotationPoint(15.5F, -21.25F, -1F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 125
        gunModel[101].setRotationPoint(16.5F, -21.25F, -1F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.15F, -0.75F, -0.2F, -0.15F, -0.75F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 126
        gunModel[102].setRotationPoint(15.5F, -21.25F, 0F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.6F); // Box 127
        gunModel[103].setRotationPoint(25F, -20.25F, 1F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 128
        gunModel[104].setRotationPoint(25F, -20.25F, -2F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        gunModel[105].setRotationPoint(-6.5F, -20.25F, -0.5F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        gunModel[106].setRotationPoint(-2.5F, -20.25F, -0.5F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, -0.75F, -0.4F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        gunModel[107].setRotationPoint(-6.5F, -20.25F, 0F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.6F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
        gunModel[108].setRotationPoint(-2.5F, -20.25F, 0F);


        defaultScopeModel = new ModelRendererTurbo[55];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 213
        defaultScopeModel[1] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 215
        defaultScopeModel[2] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 216
        defaultScopeModel[3] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 217
        defaultScopeModel[4] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 218
        defaultScopeModel[5] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 219
        defaultScopeModel[6] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 221
        defaultScopeModel[7] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 222
        defaultScopeModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 223
        defaultScopeModel[9] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 224
        defaultScopeModel[10] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 227
        defaultScopeModel[11] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 228
        defaultScopeModel[12] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 229
        defaultScopeModel[13] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 230
        defaultScopeModel[14] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 234
        defaultScopeModel[15] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 235
        defaultScopeModel[16] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 236
        defaultScopeModel[17] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 237
        defaultScopeModel[18] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 238
        defaultScopeModel[19] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 239
        defaultScopeModel[20] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 240
        defaultScopeModel[21] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 243
        defaultScopeModel[22] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 244
        defaultScopeModel[23] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 245
        defaultScopeModel[24] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 246
        defaultScopeModel[25] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 247
        defaultScopeModel[26] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 248
        defaultScopeModel[27] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 249
        defaultScopeModel[28] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 250
        defaultScopeModel[29] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 251
        defaultScopeModel[30] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 252
        defaultScopeModel[31] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 253
        defaultScopeModel[32] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 254
        defaultScopeModel[33] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 255
        defaultScopeModel[34] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 256
        defaultScopeModel[35] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 257
        defaultScopeModel[36] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 258
        defaultScopeModel[37] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 259
        defaultScopeModel[38] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 260
        defaultScopeModel[39] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 261
        defaultScopeModel[40] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 262
        defaultScopeModel[41] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 263
        defaultScopeModel[42] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 264
        defaultScopeModel[43] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 265
        defaultScopeModel[44] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 266
        defaultScopeModel[45] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 267
        defaultScopeModel[46] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 268
        defaultScopeModel[47] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 269
        defaultScopeModel[48] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 270
        defaultScopeModel[49] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 271
        defaultScopeModel[50] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 272
        defaultScopeModel[51] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 273
        defaultScopeModel[52] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 274
        defaultScopeModel[53] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 275
        defaultScopeModel[54] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 276

        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 213
        defaultScopeModel[0].setRotationPoint(1F, -22.5F, 2.5F);

        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 215
        defaultScopeModel[1].setRotationPoint(1F, -23F, 2.5F);

        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // Box 216
        defaultScopeModel[2].setRotationPoint(1F, -23F, 2.5F);

        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 217
        defaultScopeModel[3].setRotationPoint(1F, -22F, 2.5F);

        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 218
        defaultScopeModel[4].setRotationPoint(1F, -22F, 2.5F);

        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 219
        defaultScopeModel[5].setRotationPoint(14F, -22.5F, 2.5F);

        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 221
        defaultScopeModel[6].setRotationPoint(14F, -23F, 2.5F);

        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 222
        defaultScopeModel[7].setRotationPoint(14F, -23.5F, 2.5F);

        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Box 223
        defaultScopeModel[8].setRotationPoint(14F, -21.5F, 2.5F);

        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 224
        defaultScopeModel[9].setRotationPoint(14F, -22F, 2.5F);

        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F); // Box 227
        defaultScopeModel[10].setRotationPoint(13F, -22.5F, 2.5F);

        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F); // Box 228
        defaultScopeModel[11].setRotationPoint(13F, -23F, 2.5F);

        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.2F, -0.2F); // Box 229
        defaultScopeModel[12].setRotationPoint(13F, -23.5F, 2.5F);

        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 230
        defaultScopeModel[13].setRotationPoint(-5F, -22.5F, 2F);

        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F); // Box 234
        defaultScopeModel[14].setRotationPoint(-5F, -23.5F, 2F);

        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 235
        defaultScopeModel[15].setRotationPoint(-5F, -23.5F, 2F);

        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F); // Box 236
        defaultScopeModel[16].setRotationPoint(-5F, -21.5F, 2F);

        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 237
        defaultScopeModel[17].setRotationPoint(-5F, -21.5F, 2F);

        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.1F, -0.2F); // Box 238
        defaultScopeModel[18].setRotationPoint(-2F, -22.5F, 2F);

        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.5F, -0.5F, 0F, 0.1F, -0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.1F, -0.2F); // Box 239
        defaultScopeModel[19].setRotationPoint(-2F, -23.5F, 2F);

        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.2F, -1.1F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.2F, -1.1F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.5F, -0.5F); // Box 240
        defaultScopeModel[20].setRotationPoint(-2F, -23.5F, 2F);

        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0.1F, -0.2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.1F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.5F, -0.5F); // Box 243
        defaultScopeModel[21].setRotationPoint(-2F, -21.5F, 2F);

        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.5F, -0.5F, 0F, -0.2F, -1.1F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.2F, -1.1F); // Box 244
        defaultScopeModel[22].setRotationPoint(-2F, -21.5F, 2F);

        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.2F); // Box 245
        defaultScopeModel[23].setRotationPoint(13F, -22F, 2.5F);

        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.5F, -0.7F); // Box 246
        defaultScopeModel[24].setRotationPoint(13F, -21.5F, 2.5F);

        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 247
        defaultScopeModel[25].setRotationPoint(2.5F, -22.5F, 2.5F);

        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 248
        defaultScopeModel[26].setRotationPoint(2.5F, -23.5F, 2.5F);

        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 249
        defaultScopeModel[27].setRotationPoint(2.5F, -21.5F, 2.5F);

        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 250
        defaultScopeModel[28].setRotationPoint(6F, -21.5F, 2.5F);

        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 251
        defaultScopeModel[29].setRotationPoint(6F, -22.5F, 2.5F);

        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 252
        defaultScopeModel[30].setRotationPoint(6F, -23.5F, 2.5F);

        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.25F, 0F, 0.15F); // Box 253
        defaultScopeModel[31].setRotationPoint(1.25F, -22.5F, 2.5F);

        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0.25F, -0.35F, -0.5F, 0.25F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.25F, 0F, 0.15F); // Box 254
        defaultScopeModel[32].setRotationPoint(1.25F, -23.5F, 2.5F);

        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.25F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0.25F, -0.35F, -0.5F); // Box 255
        defaultScopeModel[33].setRotationPoint(1.25F, -21.5F, 2.5F);

        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 256
        defaultScopeModel[34].setRotationPoint(7.5F, -23F, 2.5F);

        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 257
        defaultScopeModel[35].setRotationPoint(7.5F, -23.5F, 2.5F);

        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 258
        defaultScopeModel[36].setRotationPoint(7.5F, -22F, 2.5F);

        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 259
        defaultScopeModel[37].setRotationPoint(3F, -22.5F, 1F);

        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 260
        defaultScopeModel[38].setRotationPoint(3F, -22F, 1F);

        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 261
        defaultScopeModel[39].setRotationPoint(3F, -22F, 2F);

        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
        defaultScopeModel[40].setRotationPoint(3F, -21F, 0F);

        defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, -0.8F, -0.8F, -0.2F, -0.8F); // Box 263
        defaultScopeModel[41].setRotationPoint(-6F, -22.5F, 2F);

        defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.8F, -0.8F, -0.1F); // Box 264
        defaultScopeModel[42].setRotationPoint(-6F, -23.5F, 3F);

        defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.6F, -0.5F, -0.8F, -0.6F, -0.5F, -0.8F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, -0.8F, -0.8F, 0.2F, -0.8F); // Box 265
        defaultScopeModel[43].setRotationPoint(-6F, -23.5F, 2F);

        defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F); // Box 266
        defaultScopeModel[44].setRotationPoint(-6F, -23.5F, 2F);

        defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F); // Box 267
        defaultScopeModel[45].setRotationPoint(-6F, -22.5F, 4F);

        defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -0.8F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.1F, 0F, -0.8F, 0.1F, 0F); // Box 268
        defaultScopeModel[46].setRotationPoint(-6F, -23.5F, 4F);

        defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F); // Box 269
        defaultScopeModel[47].setRotationPoint(-6F, -23.5F, 4F);

        defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.8F, -0.8F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 270
        defaultScopeModel[48].setRotationPoint(-6F, -21.5F, 3F);

        defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 271
        defaultScopeModel[49].setRotationPoint(-6F, -21.5F, 2F);

        defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, -0.8F, -0.8F, 0.2F, -0.8F, -0.8F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.6F, -0.5F, -0.8F, -0.6F, -0.5F); // Box 272
        defaultScopeModel[50].setRotationPoint(-6F, -21.5F, 2F);

        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, -0.8F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, -1F, -0.8F, 0F, -1F); // Box 273
        defaultScopeModel[51].setRotationPoint(-6F, -21.5F, 4F);

        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F); // Box 274
        defaultScopeModel[52].setRotationPoint(-6F, -21.5F, 4F);

        defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F); // Box 275
        defaultScopeModel[53].setRotationPoint(10.5F, -24F, 3F);

        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 276
        defaultScopeModel[54].setRotationPoint(10.5F, -24F, 3F);


        ammoModel = new ModelRendererTurbo[15];
        ammoModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 69
        ammoModel[1] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 70
        ammoModel[2] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 72
        ammoModel[3] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 95
        ammoModel[4] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 96
        ammoModel[5] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 97
        ammoModel[6] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 99
        ammoModel[7] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 100
        ammoModel[8] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 133
        ammoModel[9] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 134
        ammoModel[10] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 135
        ammoModel[11] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 136
        ammoModel[12] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 137
        ammoModel[13] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 138
        ammoModel[14] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 139

        ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.15F); // Box 69
        ammoModel[0].setRotationPoint(-1F, -20F, -0.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.15F); // Box 70
        ammoModel[1].setRotationPoint(-1F, -20.5F, -0.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 72
        ammoModel[2].setRotationPoint(2.5F, -20F, -0.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 95
        ammoModel[3].setRotationPoint(2.5F, -19.5F, -0.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.1F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, 0F, -0.25F, -0.1F); // Box 96
        ammoModel[4].setRotationPoint(4.5F, -20F, -0.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 97
        ammoModel[5].setRotationPoint(2.5F, -20.5F, -0.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.25F, -0.65F, -0.65F, -0.35F, -0.65F, -0.65F, -0.35F, 0F, -0.6F, -0.25F, 0F, -0.25F, -0.1F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, 0F, -0.25F, -0.1F); // Box 99
        ammoModel[6].setRotationPoint(4.5F, -20.5F, -0.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.1F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.6F, -0.25F, -0.65F, -0.65F, -0.35F, -0.65F, -0.65F, -0.35F, 0F, -0.6F, -0.25F); // Box 100
        ammoModel[7].setRotationPoint(4.5F, -19.5F, -0.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.2F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.45F, -0.2F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F); // Box 133
        ammoModel[8].setRotationPoint(2F, -20.5F, -0.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F); // Box 134
        ammoModel[9].setRotationPoint(2F, -20F, -0.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.15F, 0F, -0.4F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.4F, -0.2F); // Box 135
        ammoModel[10].setRotationPoint(-1F, -19.5F, -0.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.45F, -0.2F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.45F, -0.2F); // Box 136
        ammoModel[11].setRotationPoint(2F, -19.5F, -0.5F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0F); // Box 137
        ammoModel[12].setRotationPoint(3F, -20F, -0.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, -0.75F, 0F); // Box 138
        ammoModel[13].setRotationPoint(3F, -20F, -0.5F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, -0.75F, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 139
        ammoModel[14].setRotationPoint(3F, -20F, -0.5F);


        muzzleFlashPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        hasFlash = true;
        hasArms = true;

        leftArmPos = new Vector3f(-0.1F, -0.43F, -0.12F);
        leftArmRot = new Vector3f(80.0F, 60.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.43F, -0.12F);
        leftArmReloadRot = new Vector3f(80.0F, 60.0F, 0.0F);
        rightArmPos = new Vector3f(0.1F, -0.83F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -80.0F);
        rightArmReloadPos = new Vector3f(0.0F, -0.9F, 0.2F);
        rightArmReloadRot = new Vector3f(-60.0F, 0.0F, -80.0F);
        rightArmScale = new Vector3f(0.7F, 1.3F, 0.7F);
        leftArmScale = new Vector3f(0.7F, 1.3F, 0.7F);
		
		/*
		leftArmPos = new Vector3f(0.17F, -0.5F, 0.0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0.0F);
        rightArmPos = new Vector3f(0.2F, -0.56F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.2F, -0.56F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);
		*/

        rightHandAmmo = false;
        leftHandAmmo = false;
        crouchZoom = -0.2F;

        animationType = EnumAnimationType.CUSTOM;
        //tiltGunTime = 0.3F;
        //unloadClipTime = 0.0F;
        //loadClipTime = 0.45F;
        //untiltGunTime = 0.25F;
        //pumpDelayAfterReload = 4;
        //pumpTime = 54;
        //pumpDelay = 0;
        //pumpHandleDistance = 0.6F;
        rotateGunVertical = 30.0F;
        tiltGun = -20.0F;
        translateGun = new Vector3f(0.125F, -0.3125F, 0.0F);
        rotateClipVertical = -10.0F;
        translateClip = new Vector3f(-1.25F, 0.3125F, 0.0F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);

        translateAll(5.0F, 1.0F, 0.0F);

        flipAll();
    }
}