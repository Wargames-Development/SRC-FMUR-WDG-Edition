//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Type82SMG
// Model Creator: 
// Created on: 16.05.2022 - 19:56:25
// Last changed on: 16.05.2022 - 19:56:25

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelType82SMG extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelType82SMG() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[122];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox24
        gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportBox25
        gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportBox26
        gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox27
        gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox28
        gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox29
        gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox30
        gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox31
        gunModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox32
        gunModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportBox33
        gunModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import ImportBox34
        gunModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox35
        gunModel[12] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import ImportBox36
        gunModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox51
        gunModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox52
        gunModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox53
        gunModel[16] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox55
        gunModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportBox56
        gunModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportBox57
        gunModel[19] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import ImportBox126
        gunModel[20] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import ImportBox137
        gunModel[21] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import ImportBox138
        gunModel[22] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportBox139
        gunModel[23] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportBox140
        gunModel[24] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box152
        gunModel[25] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box166
        gunModel[26] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box167
        gunModel[27] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box168
        gunModel[28] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 161
        gunModel[29] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 161
        gunModel[30] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 161
        gunModel[31] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import ImportBox24
        gunModel[32] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import ImportBox24
        gunModel[33] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import ImportBox24
        gunModel[34] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import ImportBox24
        gunModel[35] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import ImportBox24
        gunModel[36] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import ImportBox24
        gunModel[37] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import ImportBox24
        gunModel[38] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import ImportBox24
        gunModel[39] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import ImportBox24
        gunModel[40] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import ImportBox24
        gunModel[41] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import ImportBox24
        gunModel[42] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import ImportBox24
        gunModel[43] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import ImportBox24
        gunModel[44] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import ImportBox24
        gunModel[45] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import ImportBox24
        gunModel[46] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import ImportBox24
        gunModel[47] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import ImportBox24
        gunModel[48] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import Box152
        gunModel[49] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import Box152
        gunModel[50] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import Box152
        gunModel[51] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox24
        gunModel[52] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox24
        gunModel[53] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import Box152
        gunModel[54] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box152
        gunModel[55] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import Box152
        gunModel[56] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import Box148
        gunModel[57] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import ImportBox69
        gunModel[58] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import ImportBox70
        gunModel[59] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import ImportBox71
        gunModel[60] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import ImportBox72
        gunModel[61] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import ImportBox73
        gunModel[62] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import Box148
        gunModel[63] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 201
        gunModel[64] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 201
        gunModel[65] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 201
        gunModel[66] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import Box152
        gunModel[67] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import Box152
        gunModel[68] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import ImportBox32
        gunModel[69] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import ImportBox35
        gunModel[70] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import ImportBox36
        gunModel[71] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import ImportBox51
        gunModel[72] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import ImportBox56
        gunModel[73] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box152
        gunModel[74] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import Box152
        gunModel[75] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import Box152
        gunModel[76] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import Box152
        gunModel[77] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import Box152
        gunModel[78] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import Box152
        gunModel[79] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import Box152
        gunModel[80] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 201
        gunModel[81] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 201
        gunModel[82] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 201
        gunModel[83] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 201
        gunModel[84] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 201
        gunModel[85] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import ImportBox69
        gunModel[86] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportBox70
        gunModel[87] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import ImportBox71
        gunModel[88] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import ImportBox72
        gunModel[89] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import ImportBox73
        gunModel[90] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import Box152
        gunModel[91] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 143
        gunModel[92] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 143
        gunModel[93] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 143
        gunModel[94] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 143
        gunModel[95] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 143
        gunModel[96] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 143
        gunModel[97] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 143
        gunModel[98] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 143
        gunModel[99] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box148
        gunModel[100] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import Box148
        gunModel[101] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import Box148
        gunModel[102] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import Box148
        gunModel[103] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box148
        gunModel[104] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Import Box148
        gunModel[105] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import Box166
        gunModel[106] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import Box167
        gunModel[107] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import Box168
        gunModel[108] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import Box148
        gunModel[109] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import Box148
        gunModel[110] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import Box148
        gunModel[111] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import Box148
        gunModel[112] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Import Box148
        gunModel[113] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import Box148
        gunModel[114] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import Box148
        gunModel[115] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import Box148
        gunModel[116] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import Box148
        gunModel[117] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box148
        gunModel[118] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 161
        gunModel[119] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 161
        gunModel[120] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 161
        gunModel[121] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 161

        gunModel[0].addShapeBox(0F, 0F, 0F, 7, 20, 5, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Import ImportBox24
        gunModel[0].setRotationPoint(9F, -22.5F, -2.5F);

        gunModel[1].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F); // Import ImportBox25
        gunModel[1].setRotationPoint(7F, -7.5F, -3F);

        gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F); // Import ImportBox26
        gunModel[2].setRotationPoint(7F, -22.5F, -3F);

        gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F); // Import ImportBox27
        gunModel[3].setRotationPoint(7F, -21.5F, -3F);

        gunModel[4].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F); // Import ImportBox28
        gunModel[4].setRotationPoint(8F, -20.5F, -3F);

        gunModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, -1F); // Import ImportBox29
        gunModel[5].setRotationPoint(7F, -7.5F, -3F);

        gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Import ImportBox30
        gunModel[6].setRotationPoint(5F, -4.5F, -3F);

        gunModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1.5F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -2.5F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, -1F); // Import ImportBox31
        gunModel[7].setRotationPoint(4F, -3.5F, -3F);

        gunModel[8].addShapeBox(0F, 0F, 0F, 1, 22, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox32
        gunModel[8].setRotationPoint(16F, -25.5F, -3F);

        gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, -1F); // Import ImportBox33
        gunModel[9].setRotationPoint(6F, -2.5F, -3F);

        gunModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox34
        gunModel[10].setRotationPoint(9F, -2.5F, -3F);

        gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, 0F, -0.5F, 0F); // Import ImportBox35
        gunModel[11].setRotationPoint(16F, -3.5F, -3F);

        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.5F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox36
        gunModel[12].setRotationPoint(16F, -2.5F, -3F);

        gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox51
        gunModel[13].setRotationPoint(17F, -17.5F, -1F);

        gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox52
        gunModel[14].setRotationPoint(24F, -16.5F, -1F);

        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox53
        gunModel[15].setRotationPoint(28F, -18.5F, -1F);

        gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox55
        gunModel[16].setRotationPoint(28F, -19.5F, -1F);

        gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox56
        gunModel[17].setRotationPoint(19.5F, -22.5F, -0.5F);

        gunModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -2.5F, 0F, 0F, 1.75F, -0.25F, 0F, 1.75F, -0.25F, 0F, -2.5F, 0F, 0F); // Import ImportBox57
        gunModel[18].setRotationPoint(20F, -19.5F, -0.5F);

        gunModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import ImportBox126
        gunModel[19].setRotationPoint(45F, -26.5F, -1.5F);

        gunModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Import ImportBox137
        gunModel[20].setRotationPoint(45F, -27F, -1.5F);

        gunModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Import ImportBox138
        gunModel[21].setRotationPoint(45F, -27.5F, -1.5F);

        gunModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Import ImportBox139
        gunModel[22].setRotationPoint(45F, -26F, -1.5F);

        gunModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Import ImportBox140
        gunModel[23].setRotationPoint(45F, -25.5F, -1.5F);

        gunModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[24].setRotationPoint(9F, -25.5F, -4F);

        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        gunModel[25].setRotationPoint(6.5F, -23.5F, -4.5F);

        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        gunModel[26].setRotationPoint(6.5F, -24F, -4.5F);

        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        gunModel[27].setRotationPoint(6.5F, -23F, -4.5F);

        gunModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        gunModel[28].setRotationPoint(5.75F, -4.75F, -3.5F);

        gunModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        gunModel[29].setRotationPoint(5.75F, -5.75F, -3.5F);

        gunModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 161
        gunModel[30].setRotationPoint(5.75F, -3.75F, -3.5F);

        gunModel[31].addShapeBox(0F, 0F, 0F, 7, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        gunModel[31].setRotationPoint(9F, -22.5F, -3F);

        gunModel[32].addShapeBox(0F, 0F, 0F, 2, 14, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        gunModel[32].setRotationPoint(14F, -16.5F, -3F);

        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        gunModel[33].setRotationPoint(9F, -16.5F, -3F);

        gunModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[34].setRotationPoint(10F, -16.5F, -3F);

        gunModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[35].setRotationPoint(10F, -15.5F, -3F);

        gunModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[36].setRotationPoint(10F, -14.5F, -3F);

        gunModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[37].setRotationPoint(10F, -13.5F, -3F);

        gunModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[38].setRotationPoint(10F, -12.5F, -3F);

        gunModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[39].setRotationPoint(10F, -11.5F, -3F);

        gunModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[40].setRotationPoint(10F, -10.5F, -3F);

        gunModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[41].setRotationPoint(10F, -9.5F, -3F);

        gunModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[42].setRotationPoint(10F, -8.5F, -3F);

        gunModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[43].setRotationPoint(10F, -7.5F, -3F);

        gunModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[44].setRotationPoint(10F, -6.5F, -3F);

        gunModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[45].setRotationPoint(10F, -5.5F, -3F);

        gunModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[46].setRotationPoint(10F, -4.5F, -3F);

        gunModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportBox24
        gunModel[47].setRotationPoint(10F, -3.5F, -3F);

        gunModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box152
        gunModel[48].setRotationPoint(9F, -24.5F, -4F);

        gunModel[49].addShapeBox(0F, 0F, 0F, 21, 2, 8, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[49].setRotationPoint(-3F, -27.5F, -4F);

        gunModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[50].setRotationPoint(6F, -23.5F, -4F);

        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Import ImportBox24
        gunModel[51].setRotationPoint(9F, -23.5F, 3F);

        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
        gunModel[52].setRotationPoint(9F, -23.5F, -4F);

        gunModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[53].setRotationPoint(-3F, -25.5F, -4F);

        gunModel[54].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F, 0F, -2.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -2.2F, -0.5F, 0F, 1.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 1.8F, -0.5F); // Import Box152
        gunModel[54].setRotationPoint(-37F, -27.5F, -5F);

        gunModel[55].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F, 0F, -2.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -2.2F, -0.5F, 0F, 1.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 1.8F, -0.5F); // Import Box152
        gunModel[55].setRotationPoint(-37F, -27.5F, 3F);

        gunModel[56].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        gunModel[56].setRotationPoint(-2.5F, -28.5F, -4F);

        gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox69
        gunModel[57].setRotationPoint(-1.5F, -27F, -5F);

        gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox70
        gunModel[58].setRotationPoint(-1.5F, -27.5F, -5F);

        gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox71
        gunModel[59].setRotationPoint(-1.5F, -28F, -5F);

        gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import ImportBox72
        gunModel[60].setRotationPoint(-1.5F, -26F, -5F);

        gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox73
        gunModel[61].setRotationPoint(-1.5F, -26.5F, -5F);

        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.5F, 0F, -0.85F, -0.6F, 0F, -0.85F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, 0F, 0F); // Import Box148
        gunModel[62].setRotationPoint(4.5F, -28.5F, -4F);

        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        gunModel[63].setRotationPoint(-38F, -25.75F, -3F);

        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 1.5F, 0F, -2F); // Box 201
        gunModel[64].setRotationPoint(-38F, -14.75F, -3F);

        gunModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        gunModel[65].setRotationPoint(-38F, -26.75F, -3F);

        gunModel[66].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box152
        gunModel[66].setRotationPoint(20F, -27.5F, -3F);

        gunModel[67].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[67].setRotationPoint(16F, -24.5F, -1F);

        gunModel[68].addShapeBox(0F, 0F, 0F, 1, 22, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox32
        gunModel[68].setRotationPoint(17F, -25.5F, -2F);

        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -1F, -1F, -0.5F, -1F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, -1F, -0.5F, -1F); // Import ImportBox35
        gunModel[69].setRotationPoint(17F, -3.5F, -3F);

        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox36
        gunModel[70].setRotationPoint(18F, -2.5F, -2.5F);

        gunModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox51
        gunModel[71].setRotationPoint(20F, -17.5F, -1F);

        gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Import ImportBox56
        gunModel[72].setRotationPoint(20F, -20.5F, -0.5F);

        gunModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[73].setRotationPoint(16F, -22.5F, -1F);

        gunModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[74].setRotationPoint(16F, -21.5F, -1F);

        gunModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Import Box152
        gunModel[75].setRotationPoint(16F, -19.5F, -1F);

        gunModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, -1F, 0F, -2.333F, -1F, 0F, -2.333F, 2F, 0F, 0F); // Import Box152
        gunModel[76].setRotationPoint(20F, -27.5F, -4F);

        gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 1F, 0F, 0F, 0F, 0F, -2.333F, 0F, 0F, -2.333F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 2F, 0F, 0F); // Import Box152
        gunModel[77].setRotationPoint(19F, -25.5F, -4F);

        gunModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -2.4F, -1F, 0F, -2.4F, 1F, 0F, -1F); // Import Box152
        gunModel[78].setRotationPoint(17F, -24.5F, -4F);

        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 1F, 0F, -1F, -1F, 0F, -2.4F, -1F, 0F, -2.4F, 1F, 0F, -1F, 1F, 0F, -1F, -1.5F, 0F, -2.4F, -1.5F, 0F, -2.4F, 1F, 0F, -1F); // Import Box152
        gunModel[79].setRotationPoint(17F, -22.5F, -4F);

        gunModel[80].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        gunModel[80].setRotationPoint(-37F, -25.75F, -3F);

        gunModel[81].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        gunModel[81].setRotationPoint(-37F, -25.75F, 2F);

        gunModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, -1F, 1F, 0.5F, -1F, 1F); // Box 201
        gunModel[82].setRotationPoint(-37F, -14.75F, -3F);

        gunModel[83].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 1F, 0.5F, -1F, 1F, 0.5F, 0F, -2F, 0.5F, 0F, -2F); // Box 201
        gunModel[83].setRotationPoint(-37F, -14.75F, 2F);

        gunModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
        gunModel[84].setRotationPoint(-37.5F, -12.75F, -1F);

        gunModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox69
        gunModel[85].setRotationPoint(-36.5F, -25F, -5F);

        gunModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox70
        gunModel[86].setRotationPoint(-36.5F, -25.5F, -5F);

        gunModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox71
        gunModel[87].setRotationPoint(-36.5F, -26F, -5F);

        gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import ImportBox72
        gunModel[88].setRotationPoint(-36.5F, -24F, -5F);

        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox73
        gunModel[89].setRotationPoint(-36.5F, -24.5F, -5F);

        gunModel[90].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box152
        gunModel[90].setRotationPoint(-3F, -24.5F, -4F);

        gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 143
        gunModel[91].setRotationPoint(-1.5F, -25F, 4F);

        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.33F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.33F, -0.25F, -0.5F); // Box 143
        gunModel[92].setRotationPoint(-0.5F, -24F, 4F);

        gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.33F, -0.25F, 0F, -0.33F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 143
        gunModel[93].setRotationPoint(-1.5F, -24F, 4F);

        gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 143
        gunModel[94].setRotationPoint(-1.5F, -23.25F, 4F);

        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        gunModel[95].setRotationPoint(-1.5F, -25F, -5F);

        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.33F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.33F, -0.25F, 0F); // Box 143
        gunModel[96].setRotationPoint(-0.5F, -24F, -5F);

        gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.33F, -0.25F, -0.5F, -0.33F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 143
        gunModel[97].setRotationPoint(-1.5F, -24F, -5F);

        gunModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 143
        gunModel[98].setRotationPoint(-1.5F, -23.25F, -5F);

        gunModel[99].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box148
        gunModel[99].setRotationPoint(27F, -27.5F, -3F);

        gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Import Box148
        gunModel[100].setRotationPoint(48F, -23.5F, -3F);

        gunModel[101].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Import Box148
        gunModel[101].setRotationPoint(30F, -23.5F, -2F);

        gunModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box148
        gunModel[102].setRotationPoint(27F, -23.5F, -3F);

        gunModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box148
        gunModel[103].setRotationPoint(27F, -20.5F, -3F);

        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F); // Import Box148
        gunModel[104].setRotationPoint(29F, -23.5F, -3F);

        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        gunModel[105].setRotationPoint(27.5F, -21.5F, -3F);

        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        gunModel[106].setRotationPoint(27.5F, -22F, -3F);

        gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        gunModel[107].setRotationPoint(27.5F, -21F, -3F);

        gunModel[108].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        gunModel[108].setRotationPoint(42.5F, -23.5F, -3F);

        gunModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Import Box148
        gunModel[109].setRotationPoint(42F, -20.5F, -3F);

        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box148
        gunModel[110].setRotationPoint(42.5F, -21.5F, -3F);

        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        gunModel[111].setRotationPoint(46.5F, -21.5F, -3F);

        gunModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Import Box148
        gunModel[112].setRotationPoint(45.75F, -20.5F, -3F);

        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F); // Import Box148
        gunModel[113].setRotationPoint(42.5F, -19.25F, -3F);

        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F); // Import Box148
        gunModel[114].setRotationPoint(46.5F, -19.25F, -3F);

        gunModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box148
        gunModel[115].setRotationPoint(43.5F, -18.25F, -3F);

        gunModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        gunModel[116].setRotationPoint(43F, -21.5F, -2.5F);

        gunModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box148
        gunModel[117].setRotationPoint(43F, -19.5F, -2.5F);

        gunModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 161
        gunModel[118].setRotationPoint(43.5F, -20.5F, -3F);

        gunModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 161
        gunModel[119].setRotationPoint(43.5F, -19.5F, -3F);

        gunModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 161
        gunModel[120].setRotationPoint(43.5F, -21.25F, -3F);

        gunModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 161
        gunModel[121].setRotationPoint(43.5F, -19.75F, -3F);


        ammoModel = new ModelRendererTurbo[15];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox37
        ammoModel[1] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import ImportBox38
        ammoModel[2] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import ImportBox39
        ammoModel[3] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import ImportBox40
        ammoModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportBox104
        ammoModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox105
        ammoModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import ImportBox106
        ammoModel[7] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import ImportBox107
        ammoModel[8] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportBox109
        ammoModel[9] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import ImportBox111
        ammoModel[10] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import ImportBox112
        ammoModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox114
        ammoModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox115
        ammoModel[13] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import ImportBox50
        ammoModel[14] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import ImportBox128

        ammoModel[0].addShapeBox(0F, 0F, 0F, 6, 22, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox37
        ammoModel[0].setRotationPoint(9F, -14.5F, -2.5F);

        ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox38
        ammoModel[1].setRotationPoint(13F, 7.5F, -2.5F);

        ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox39
        ammoModel[2].setRotationPoint(10F, 7.5F, -2.5F);

        ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox40
        ammoModel[3].setRotationPoint(9F, 7.5F, -2.5F);

        ammoModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox104
        ammoModel[4].setRotationPoint(10F, -15.5F, -2.5F);

        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
        ammoModel[5].setRotationPoint(9F, -15.5F, -2.5F);

        ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox106
        ammoModel[6].setRotationPoint(9F, -15.5F, 0.5F);

        ammoModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox107
        ammoModel[7].setRotationPoint(10F, -15.5F, 1.5F);

        ammoModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox109
        ammoModel[8].setRotationPoint(10.5F, -16.5F, -1.5F);

        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.125F); // Import ImportBox111
        ammoModel[9].setRotationPoint(14.5F, -15.5F, -1.5F);

        ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.375F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.375F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.125F); // Import ImportBox112
        ammoModel[10].setRotationPoint(14.5F, -16.5F, -1.5F);

        ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox114
        ammoModel[11].setRotationPoint(10F, -15.5F, 0.5F);

        ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox115
        ammoModel[12].setRotationPoint(10F, -15.5F, -1.5F);

        ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.125F, 0F, -0.375F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.375F, -0.5F); // Import ImportBox50
        ammoModel[13].setRotationPoint(14.5F, -14.5F, -1.5F);

        ammoModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
        ammoModel[14].setRotationPoint(10.5F, -15.5F, -1.5F);


        slideModel = new ModelRendererTurbo[38];
        slideModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportBox90
        slideModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox91
        slideModel[2] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box148
        slideModel[3] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Import ImportBox126
        slideModel[4] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import ImportBox126
        slideModel[5] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import ImportBox126
        slideModel[6] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import ImportBox126
        slideModel[7] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportBox126
        slideModel[8] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Import Box148
        slideModel[9] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box148
        slideModel[10] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box148
        slideModel[11] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Import Box148
        slideModel[12] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box148
        slideModel[13] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Import Box148
        slideModel[14] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Import Box148
        slideModel[15] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import Box148
        slideModel[16] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box148
        slideModel[17] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box148
        slideModel[18] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import Box148
        slideModel[19] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import Box148
        slideModel[20] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import ImportBox126
        slideModel[21] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import ImportBox137
        slideModel[22] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import ImportBox138
        slideModel[23] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import ImportBox139
        slideModel[24] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import ImportBox140
        slideModel[25] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 198
        slideModel[26] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 198
        slideModel[27] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 198
        slideModel[28] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 198
        slideModel[29] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box166
        slideModel[30] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box167
        slideModel[31] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box168
        slideModel[32] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import Box166
        slideModel[33] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import Box167
        slideModel[34] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import Box168
        slideModel[35] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box148
        slideModel[36] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box148
        slideModel[37] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box148

        slideModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
        slideModel[0].setRotationPoint(40F, -33.5F, -0.5F);

        slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, -0.5F, 0.25F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox91
        slideModel[1].setRotationPoint(43F, -34.5F, -0.5F);

        slideModel[2].addShapeBox(0F, 0F, 0F, 48, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        slideModel[2].setRotationPoint(-3F, -29.5F, -3F);

        slideModel[3].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Import ImportBox126
        slideModel[3].setRotationPoint(45F, -28.5F, -0.5F);

        slideModel[4].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.25F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.25F, 0F, -0.375F, 0F); // Import ImportBox126
        slideModel[4].setRotationPoint(45F, -28.5F, 0.25F);

        slideModel[5].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0.25F, 0F, 0F, -1F, 0F, 0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, 0F, -0.625F, -0.75F, 0F, -0.375F, -0.25F); // Import ImportBox126
        slideModel[5].setRotationPoint(45F, -28.75F, 1.25F);

        slideModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import ImportBox126
        slideModel[6].setRotationPoint(45F, -28.5F, -1.25F);

        slideModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0.125F, -0.25F, 0F, 0F, -1F, 0F, -0.375F, 0.25F, 0F, -0.125F, 0F, 0F, -0.375F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0F); // Import ImportBox126
        slideModel[7].setRotationPoint(45F, -28.75F, -2.25F);

        slideModel[8].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        slideModel[8].setRotationPoint(-2F, -31.5F, -3F);

        slideModel[9].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        slideModel[9].setRotationPoint(-2F, -33F, -2F);

        slideModel[10].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box148
        slideModel[10].setRotationPoint(-2F, -32F, -3F);

        slideModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        slideModel[11].setRotationPoint(-3F, -31.5F, -3F);

        slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box148
        slideModel[12].setRotationPoint(-3F, -33F, -2F);

        slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box148
        slideModel[13].setRotationPoint(-3F, -32F, -3F);

        slideModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        slideModel[14].setRotationPoint(16F, -31.5F, -3F);

        slideModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box148
        slideModel[15].setRotationPoint(16F, -33F, -2F);

        slideModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box148
        slideModel[16].setRotationPoint(16F, -32F, -3F);

        slideModel[17].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box148
        slideModel[17].setRotationPoint(20F, -31.5F, -3F);

        slideModel[18].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
        slideModel[18].setRotationPoint(20F, -32.75F, -2F);

        slideModel[19].addShapeBox(0F, 0F, 0F, 25, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box148
        slideModel[19].setRotationPoint(20F, -31.75F, -3F);

        slideModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import ImportBox126
        slideModel[20].setRotationPoint(45F, -30.5F, -1.5F);

        slideModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Import ImportBox137
        slideModel[21].setRotationPoint(45F, -31F, -1.5F);

        slideModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Import ImportBox138
        slideModel[22].setRotationPoint(45F, -31.5F, -1.5F);

        slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Import ImportBox139
        slideModel[23].setRotationPoint(45F, -30F, -1.5F);

        slideModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Import ImportBox140
        slideModel[24].setRotationPoint(45F, -29.5F, -1.5F);

        slideModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
        slideModel[25].setRotationPoint(16F, -33.75F, 1F);

        slideModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
        slideModel[26].setRotationPoint(16.5F, -34.75F, 1F);

        slideModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
        slideModel[27].setRotationPoint(16F, -33.75F, -1.5F);

        slideModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
        slideModel[28].setRotationPoint(16.5F, -34.75F, -1.5F);

        slideModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        slideModel[29].setRotationPoint(17.5F, -34F, -2F);

        slideModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        slideModel[30].setRotationPoint(17.5F, -34.5F, -2F);

        slideModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        slideModel[31].setRotationPoint(17.5F, -33.5F, -2F);

        slideModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box166
        slideModel[32].setRotationPoint(17.5F, -34F, 1F);

        slideModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Import Box167
        slideModel[33].setRotationPoint(17.5F, -34.5F, 1F);

        slideModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F); // Import Box168
        slideModel[34].setRotationPoint(17.5F, -33.5F, 1F);

        slideModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box148
        slideModel[35].setRotationPoint(17.75F, -34F, -1F);

        slideModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box148
        slideModel[36].setRotationPoint(17.75F, -35F, -1F);

        slideModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box148
        slideModel[37].setRotationPoint(17.75F, -35F, 0.25F);


        barrelAttachPoint = new Vector3f(-37F / 16F, -34F / 16F, 0F / 16F);
        gadgetAttachPoint = new Vector3f(42F / 16F, 25F / 16F, -3F / 16F);
        gripAttachPoint = new Vector3f(-39 / 16F, -35F / 16F, 0F / 16F);


        gunSlideDistance = 0.5F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunVertical = 50F;
        rotateGunHorizontal = 0F;
        tiltGun = 40F;
        translateGun = new Vector3f(0 / 16F, 0 / 16F, 0F / 16F);
        translateClip = new Vector3f(-15 / 16F, -15F / 16F, 0F / 16F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(-110F, 0F, 0.05F);
        leftArmRot = new Vector3f(75, 55, 0);
        leftArmReloadPos = new Vector3f(-0.4F, -0.5F, 0F);
        leftArmReloadRot = new Vector3f(80, 60, 0);
        rightArmPos = new Vector3f(0.32F, -0.5F, 0f);
        rightArmRot = new Vector3f(0, 0, -90);
        rightArmReloadPos = new Vector3f(0.32F, -0.5F, 0f);
        rightArmReloadRot = new Vector3f(0, 0, -90);
        rightHandAmmo = false;
        leftHandAmmo = false;

        fancyStance = true;
        stanceRotate = new Vector3f(0F, 0.0F, 45.0F);
        stanceTranslate = new Vector3f(0.2F, 0F, 0F);
        casingAttachPoint = new Vector3f(25F / 16F, 27F / 16F, 0.5F / 16F);
        casingAnimDistance = new Vector3f(0, 0, 8);
        casingAnimSpread = new Vector3f(3, 2, 0);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0F, -40F, 20F);
        caseScale = 0.8F;

        flashScale = 5.5F;
        muzzleFlashPoint = new Vector3f(0.6F, 0.3F, 0.01F);
        crouchZoom = -0.05F;
        zoomOffset = 0.15F;
        zoomOffsetY = -0.02F;
        thirdPersonOffset = new Vector3f(-0.2F, -0.1F, 0F);
        translateAll(0F, 0F, 0F);
        flipAll();
    }
}