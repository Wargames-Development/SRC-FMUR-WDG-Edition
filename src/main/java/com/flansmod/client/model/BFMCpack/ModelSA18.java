//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 9K34
// Model Creator: 
// Created on: 30.07.2022 - 22:23:34
// Last changed on: 30.07.2022 - 22:23:34

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSA18 extends ModelGun //Same as Filename
{
    int textureX = 128;
    int textureY = 128;

    public ModelSA18() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[13];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        gunModel[1] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import
        gunModel[2] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import
        gunModel[3] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import
        gunModel[4] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import
        gunModel[5] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Import
        gunModel[6] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Import
        gunModel[7] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import
        gunModel[8] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import
        gunModel[9] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import
        gunModel[10] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import
        gunModel[11] = new ModelRendererTurbo(this, 1, 94, textureX, textureY); // Import
        gunModel[12] = new ModelRendererTurbo(this, 25, 93, textureX, textureY); // Import

        gunModel[0].addShapeBox(-4.4F, -1F, -0.5F, 2, 1, 1, 0F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F); // Import
        gunModel[0].setRotationPoint(2.5F, -1F, 0F);

        gunModel[1].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F, 0.0F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.0F, -0.2F, -0.15F, 0.4F, 0.3F, -0.15F, 0.0F, 0.3F, -0.15F, 0.0F, 0.3F, -0.15F, 0.4F, 0.3F, -0.15F); // Import
        gunModel[1].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[2].addShapeBox(0F, -0.4F, -0.5F, 1, 1, 1, 0F, 0.4F, -0.1F, -0.15F, 0.3F, -0.1F, -0.15F, 0.3F, -0.1F, -0.15F, 0.4F, -0.1F, -0.15F, 0.0F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.0F, -0.4F, -0.15F); // Import
        gunModel[2].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[3].addShapeBox(0F, -1.4F, -0.5F, 1, 1, 1, 0F, 0.4F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, -0.15F, 0.4F, -0.4F, -0.15F, 0.4F, 0.1F, -0.15F, 0.3F, 0.1F, -0.15F, 0.3F, 0.1F, -0.15F, 0.4F, 0.1F, -0.15F); // Import
        gunModel[3].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[4].addShapeBox(-6F, -2F, -0.5F, 4, 3, 1, 0F, -0.2F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.2F, 0.0F, -0.1F, -0.2F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F); // Import
        gunModel[4].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[5].addShapeBox(-2.4F, -1F, -0.5F, 1, 2, 1, 0F, 0.0F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.2F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.0F, 0.2F, -0.1F); // Import
        gunModel[5].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[6].addShapeBox(-9.8F, -0.8F, -0.5F, 1, 2, 1, 0F, -0.2F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -0.2F, 0.0F, -0.1F, -0.8F, -0.2F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -0.8F, -0.2F, -0.1F); // Import
        gunModel[6].setRotationPoint(2.5F, -1F, 0F);

        gunModel[7].addShapeBox(-10.8F, -2F, -0.5F, 2, 1, 1, 0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -1.2F, 0.2F, -0.1F, 0.0F, 0.2F, -0.1F, 0.0F, 0.2F, -0.1F, -1.2F, 0.2F, -0.1F); // Import
        gunModel[7].setRotationPoint(2.5F, -1F, 0F);

        gunModel[8].addShapeBox(-2.7F, -2F, -0.5F, 4, 1, 1, 0F, -0.3F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, -0.3F, 0.0F, -0.05F, -0.3F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, -0.3F, 0.0F, -0.05F); // Import
        gunModel[8].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[9].addShapeBox(1F, -0.4F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.4F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F, -0.35F, 0.0F, -0.4F, -0.35F); // Import
        gunModel[9].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[10].addShapeBox(1F, 0F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.2F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F, -0.35F, 0.0F, -0.2F, -0.35F, -0.6F, -0.7F, -0.35F, 0.0F, -0.8F, -0.35F, 0.0F, -0.8F, -0.35F, -0.6F, -0.7F, -0.35F); // Import
        gunModel[10].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[11].addShapeBox(-6.7F, -2F, -0.5F, 8, 1, 1, 0F, -0.3F, 0.05F, -0.2F, 0.05F, 0.05F, -0.2F, 0.05F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.55F, -0.2F, 0.05F, 0.55F, -0.2F, 0.05F, 0.55F, -0.2F, -0.3F, 0.55F, -0.2F); // Import
        gunModel[11].setRotationPoint(-0.5F, -1F, 0F);

        gunModel[12].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F, -0.1F, -0.2F, -0.125F, 0.2F, -0.2F, -0.125F, 0.2F, -0.2F, -0.125F, -0.1F, -0.2F, -0.125F, 0.3F, 0.2F, -0.125F, -0.1F, 0.2F, -0.125F, -0.1F, 0.2F, -0.125F, 0.3F, 0.2F, -0.125F); // Import
        gunModel[12].setRotationPoint(-0.5F, -1F, 0F);


        ammoModel = new ModelRendererTurbo[95];
        ammoModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import
        ammoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import
        ammoModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import
        ammoModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        ammoModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import
        ammoModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import
        ammoModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import
        ammoModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import
        ammoModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import
        ammoModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import
        ammoModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import
        ammoModel[11] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import
        ammoModel[12] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import
        ammoModel[13] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import
        ammoModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import
        ammoModel[15] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import
        ammoModel[16] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import
        ammoModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import
        ammoModel[18] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import
        ammoModel[19] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import
        ammoModel[20] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import
        ammoModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        ammoModel[22] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import
        ammoModel[23] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import
        ammoModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        ammoModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        ammoModel[26] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        ammoModel[27] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import
        ammoModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import
        ammoModel[29] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import
        ammoModel[30] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import
        ammoModel[31] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import
        ammoModel[32] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import
        ammoModel[33] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import
        ammoModel[34] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import
        ammoModel[35] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import
        ammoModel[36] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import
        ammoModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        ammoModel[38] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Import
        ammoModel[39] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import
        ammoModel[40] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import
        ammoModel[41] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import
        ammoModel[42] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import
        ammoModel[43] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import
        ammoModel[44] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import
        ammoModel[45] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import
        ammoModel[46] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import
        ammoModel[47] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import
        ammoModel[48] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import
        ammoModel[49] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import
        ammoModel[50] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import
        ammoModel[51] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import
        ammoModel[52] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        ammoModel[53] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Import
        ammoModel[54] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import
        ammoModel[55] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import
        ammoModel[56] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import
        ammoModel[57] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import
        ammoModel[58] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import
        ammoModel[59] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import
        ammoModel[60] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import
        ammoModel[61] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import
        ammoModel[62] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import
        ammoModel[63] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import
        ammoModel[64] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import
        ammoModel[65] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import
        ammoModel[66] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import
        ammoModel[67] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import
        ammoModel[68] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import
        ammoModel[69] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import
        ammoModel[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import
        ammoModel[71] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import
        ammoModel[72] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import
        ammoModel[73] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import
        ammoModel[74] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import
        ammoModel[75] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        ammoModel[76] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import
        ammoModel[77] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import
        ammoModel[78] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import
        ammoModel[79] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import
        ammoModel[80] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import
        ammoModel[81] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import
        ammoModel[82] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import
        ammoModel[83] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import
        ammoModel[84] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import
        ammoModel[85] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import
        ammoModel[86] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import
        ammoModel[87] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import
        ammoModel[88] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import
        ammoModel[89] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import
        ammoModel[90] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import
        ammoModel[91] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import
        ammoModel[92] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Import
        ammoModel[93] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Import
        ammoModel[94] = new ModelRendererTurbo(this, 20, 94, textureX, textureY); // Import

        ammoModel[0].addShapeBox(1.7F, -2F, -0.5F, 4, 1, 1, 0F, 0.4F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.4F, 0.0F, -0.2F, 0.4F, 0.6F, -0.2F, 0.0F, 0.6F, -0.2F, 0.0F, 0.6F, -0.2F, 0.4F, 0.6F, -0.2F); // Import
        ammoModel[0].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[1].addShapeBox(5F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F); // Import
        ammoModel[1].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[2].addShapeBox(4F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        ammoModel[2].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[3].addShapeBox(5F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F); // Import
        ammoModel[3].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[4].addShapeBox(5F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F); // Import
        ammoModel[4].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[5].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F); // Import
        ammoModel[5].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[6].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F); // Import
        ammoModel[6].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[7].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, -0.6F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F); // Import
        ammoModel[7].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[8].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, 0.0F, -0.6F, -0.6F, -1.4F, -0.6F, 0.0F, -1.4F, -0.6F, 0.0F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, -1.4F, -0.6F, 0.0F, -1.4F, -0.6F, 0.0F, 0.0F, -0.6F, -0.6F); // Import
        ammoModel[8].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[9].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, -1.4F, -0.6F, 0.0F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, -1.4F, -0.6F, 0.0F, -1.4F, -0.6F, 0.0F, 0.0F, -0.6F, -0.6F, 0.0F, -0.6F, -0.6F, -1.4F, -0.6F, 0.0F); // Import
        ammoModel[9].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[10].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, 0.0F, -0.6F, -0.65F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F, -0.6F, 0.0F, -0.6F, -0.65F, 0.0F, -1.4F, -0.6F, -1.4F, -1.4F, 0.0F, -1.4F, -1.4F, 0.0F, 0.0F, -1.4F, -0.6F); // Import
        ammoModel[10].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[11].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, 0.0F, -1.4F, -0.6F, -1.4F, -1.4F, 0.0F, -1.4F, -1.4F, 0.0F, 0.0F, -1.4F, -0.6F, 0.0F, -0.6F, -0.65F, -1.4F, 0.0F, -0.6F, -1.4F, 0.0F, -0.6F, 0.0F, -0.6F, -0.65F); // Import
        ammoModel[11].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[12].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, -1.4F, 0.0F, -0.6F, 0.0F, -0.6F, -0.65F, 0.0F, -0.6F, -0.65F, -1.4F, 0.0F, -0.6F, -1.4F, -1.4F, 0.0F, 0.0F, -1.4F, -0.6F, 0.0F, -1.4F, -0.6F, -1.4F, -1.4F, 0.0F); // Import
        ammoModel[12].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[13].addShapeBox(6F, -1.3F, -1F, 2, 2, 2, 0F, -1.4F, -1.4F, 0.0F, 0.0F, -1.4F, -0.6F, 0.0F, -1.4F, -0.6F, -1.4F, -1.4F, 0.0F, -1.4F, 0.0F, -0.6F, 0.0F, -0.6F, -0.65F, 0.0F, -0.6F, -0.65F, -1.4F, 0.0F, -0.6F); // Import
        ammoModel[13].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[14].addShapeBox(8F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F); // Import
        ammoModel[14].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[15].addShapeBox(8F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F); // Import
        ammoModel[15].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[16].addShapeBox(8F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F); // Import
        ammoModel[16].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[17].addShapeBox(7F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F); // Import
        ammoModel[17].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[18].addShapeBox(7F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F); // Import
        ammoModel[18].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[19].addShapeBox(7F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F); // Import
        ammoModel[19].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[20].addShapeBox(6F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F); // Import
        ammoModel[20].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[21].addShapeBox(6F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F); // Import
        ammoModel[21].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[22].addShapeBox(6F, -0.8F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F); // Import
        ammoModel[22].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[23].addShapeBox(-18.5F, -3.8F, -1F, 27, 2, 2, 0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Import
        ammoModel[23].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[24].addShapeBox(-18.5F, -3.8F, -1F, 27, 2, 2, 0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import
        ammoModel[24].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[25].addShapeBox(-18.5F, -3.8F, -1F, 27, 2, 2, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F); // Import
        ammoModel[25].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[26].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F); // Import
        ammoModel[26].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[27].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import
        ammoModel[27].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[28].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, -1.8F); // Import
        ammoModel[28].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[29].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Import
        ammoModel[29].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[30].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, -0.2F, -1.4F, 0.0F, -0.2F, -1.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.4F, -1.8F, 0.0F, -1.4F, -1.8F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F); // Import
        ammoModel[30].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[31].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -1.4F, 0.0F, -0.2F, -1.4F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, -1.8F, 0.0F, -1.4F, -1.8F); // Import
        ammoModel[31].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[32].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, -1.4F, -1.8F, 0.0F, -1.4F, -1.8F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -0.2F, -1.4F, 0.0F, -0.2F, -1.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import
        ammoModel[32].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[33].addShapeBox(-23.5F, -3.8F, -1F, 5, 2, 2, 0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, -1.8F, 0.0F, -1.4F, -1.8F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.2F, -1.4F, 0.0F, -0.2F, -1.4F); // Import
        ammoModel[33].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[34].addShapeBox(-10.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F); // Import
        ammoModel[34].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[35].addShapeBox(-10.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F); // Import
        ammoModel[35].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[36].addShapeBox(-10.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F); // Import
        ammoModel[36].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[37].addShapeBox(-7.25F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F); // Import
        ammoModel[37].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[38].addShapeBox(-7.25F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F); // Import
        ammoModel[38].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[39].addShapeBox(-7.25F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F); // Import
        ammoModel[39].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[40].addShapeBox(0.25F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F); // Import
        ammoModel[40].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[41].addShapeBox(0.25F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F); // Import
        ammoModel[41].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[42].addShapeBox(0.25F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F); // Import
        ammoModel[42].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[43].addShapeBox(5F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F); // Import
        ammoModel[43].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[44].addShapeBox(5F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F); // Import
        ammoModel[44].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[45].addShapeBox(5F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F); // Import
        ammoModel[45].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[46].addShapeBox(7F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F); // Import
        ammoModel[46].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[47].addShapeBox(7F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F, -0.25F, 0.1F, -0.6F); // Import
        ammoModel[47].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[48].addShapeBox(7F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F, -0.25F, 0.1F, -1.4F, -0.25F, 0.1F, -1.4F, -0.25F, -0.6F, 0.1F, -0.25F, -0.6F, 0.1F); // Import
        ammoModel[48].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[49].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.55F, -1.9F, 0.0F, -0.55F, -1.9F, 0.0F, -0.55F, 0.25F, 0.0F, -0.55F, 0.25F, 0.0F, -0.55F, -1.9F, 0.0F, -0.55F, -1.9F, 0.0F, -0.55F, 0.25F, 0.0F, -0.55F, 0.25F); // Import
        ammoModel[49].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[50].addShapeBox(7.5F, -3.8F, -1F, 1, 2, 2, 0F, -0.7F, 0.0F, -0.6F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, -0.7F, 0.0F, -0.6F, -0.7F, 0.0F, -0.6F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, -0.7F, 0.0F, -0.6F); // Import
        ammoModel[50].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[51].addShapeBox(7.5F, -3.8F, -1F, 1, 2, 2, 0F, -0.7F, 0.0F, -1.4F, 0.0F, 0.25F, -1.45F, 0.0F, -0.55F, 0.25F, -0.7F, -0.6F, 0.0F, -0.7F, 0.0F, -1.4F, 0.0F, 0.25F, -1.45F, 0.0F, -0.55F, 0.25F, -0.7F, -0.6F, 0.0F); // Import
        ammoModel[51].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[52].addShapeBox(7.5F, -3.8F, -1F, 1, 2, 2, 0F, -0.7F, -0.6F, 0.0F, 0.0F, -0.55F, 0.25F, 0.0F, 0.25F, -1.45F, -0.7F, 0.0F, -1.4F, -0.7F, -0.6F, 0.0F, 0.0F, -0.55F, 0.25F, 0.0F, 0.25F, -1.45F, -0.7F, 0.0F, -1.4F); // Import
        ammoModel[52].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[53].addShapeBox(0.2F, -2.5F, -0.5F, 1, 2, 1, 0F, 0.0F, 0.0F, -0.4F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.9F, 0.0F, -0.4F, -0.9F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Import
        ammoModel[53].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[53].rotateAngleX = -0.7853982F;

        ammoModel[54].addShapeBox(0.2F, -2.6F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Import
        ammoModel[54].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[54].rotateAngleX = -0.7853982F;

        ammoModel[55].addShapeBox(0.2F, -3.1F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.3F, -0.8F, 0.0F, -0.3F, -0.8F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, -0.8F, -0.9F, -0.3F, 0.0F, -0.9F, -0.3F); // Import
        ammoModel[55].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[55].rotateAngleX = -0.7853982F;

        ammoModel[56].addShapeBox(0.2F, -3.1F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.7F, -0.8F, 0.0F, -0.7F, -0.8F, -0.1F, -0.2F, 0.0F, -0.1F, -0.2F, 0.0F, -0.4F, -0.7F, -0.8F, -0.4F, -0.7F, -0.8F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F); // Import
        ammoModel[56].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[56].rotateAngleX = -0.7853982F;

        ammoModel[57].addShapeBox(0.2F, -3.1F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.1F, -0.2F, -0.8F, -0.1F, -0.2F, -0.8F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, -0.2F, -0.8F, -0.5F, -0.2F, -0.8F, -0.4F, -0.7F, 0.0F, -0.4F, -0.7F); // Import
        ammoModel[57].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[57].rotateAngleX = -0.7853982F;

        ammoModel[58].addShapeBox(0.25F, -2.8F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.49F, -0.95F, 0.0F, -0.49F, -0.95F, 0.0F, -0.49F, 0.0F, 0.0F, -0.49F, 0.0F, -0.8F, -0.47F, -0.95F, -0.8F, -0.47F, -0.95F, -0.8F, -0.47F, 0.0F, -0.8F, -0.47F); // Import
        ammoModel[58].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[58].rotateAngleX = -0.7853982F;

        ammoModel[59].addShapeBox(-6.5F, -2.55F, -0.5F, 1, 2, 1, 0F, 0.0F, 0.0F, -0.4F, -0.95F, 0.0F, -0.4F, -0.95F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.95F, 0.0F, -0.4F, -0.95F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Import
        ammoModel[59].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[59].rotateAngleX = -0.7853982F;

        ammoModel[60].addShapeBox(-6.5F, -2.65F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.9F, -0.35F, -0.8F, -0.9F, -0.35F, -0.8F, -0.9F, -0.35F, 0.0F, -0.9F, -0.35F); // Import
        ammoModel[60].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[60].rotateAngleX = -0.7853982F;

        ammoModel[61].addShapeBox(-6.5F, -3.05F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -0.9F, -0.35F, -0.8F, -0.9F, -0.35F, -0.8F, -0.9F, -0.35F, 0.0F, -0.9F, -0.35F); // Import
        ammoModel[61].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[61].rotateAngleX = -0.7853982F;

        ammoModel[62].addShapeBox(-6.5F, -3.1F, -0.45F, 1, 1, 1, 0F, 0.0F, -0.15F, -0.2F, -0.8F, -0.15F, -0.2F, -0.8F, -0.05F, -0.7F, 0.0F, -0.05F, -0.7F, 0.0F, -0.55F, -0.2F, -0.8F, -0.55F, -0.2F, -0.8F, -0.45F, -0.7F, 0.0F, -0.45F, -0.7F); // Import
        ammoModel[62].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[62].rotateAngleX = -0.7853982F;

        ammoModel[63].addShapeBox(-6.5F, -3.1F, -0.55F, 1, 1, 1, 0F, 0.0F, -0.05F, -0.7F, -0.8F, -0.05F, -0.7F, -0.8F, -0.15F, -0.2F, 0.0F, -0.15F, -0.2F, 0.0F, -0.45F, -0.7F, -0.8F, -0.45F, -0.7F, -0.8F, -0.55F, -0.2F, 0.0F, -0.55F, -0.2F); // Import
        ammoModel[63].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[63].rotateAngleX = -0.7853982F;

        ammoModel[64].addShapeBox(-6.5F, -4.05F, -0.5F, 1, 1, 1, 0F, 0.0F, -0.9F, -0.4F, -0.95F, -0.9F, -0.4F, -0.95F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, 0.0F, -0.4F, -0.95F, 0.0F, -0.4F, -0.95F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F); // Import
        ammoModel[64].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[64].rotateAngleX = -0.7853982F;

        ammoModel[65].addShapeBox(-6.5F, -2.55F, -0.5F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.35F, -0.9F, -0.4F, -0.35F, -0.9F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, -0.9F, -0.4F, -0.35F, -0.9F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F); // Import
        ammoModel[65].setRotationPoint(6.5F, -3.8F, 0F);
        ammoModel[65].rotateAngleX = -0.7853982F;

        ammoModel[66].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, -1.9F, -0.55F, 0.0F, -1.9F, -0.55F, 0.0F, -1.9F, -0.55F, 0.0F, -1.8F, -0.55F); // Import
        ammoModel[66].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[67].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.9F, -0.55F, 0.0F, -1.9F, -0.55F, 0.0F, -1.9F, -0.55F, 0.0F, -1.9F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F); // Import
        ammoModel[67].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[68].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.55F, 0.25F, 0.0F, -0.55F, 0.25F, 0.0F, -0.55F, -1.9F, 0.0F, -0.55F, -1.9F, 0.0F, -0.55F, 0.25F, 0.0F, -0.55F, 0.25F, 0.0F, -0.55F, -1.9F, 0.0F, -0.55F, -1.9F); // Import
        ammoModel[68].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[69].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.1F, -1.45F, 0.0F, -0.1F, -1.45F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, -1.45F, -1.9F, 0.0F, -1.45F, -1.9F, 0.0F, -1.45F, 0.25F, 0.0F, -1.45F, 0.25F); // Import
        ammoModel[69].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[70].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.45F, -1.9F, 0.0F, -1.45F, -1.9F, 0.0F, -1.45F, 0.25F, 0.0F, -1.45F, 0.25F, 0.0F, -0.1F, -1.45F, 0.0F, -0.1F, -1.45F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F); // Import
        ammoModel[70].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[71].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, -0.1F, -1.45F, 0.0F, -0.1F, -1.45F, 0.0F, -1.45F, 0.25F, 0.0F, -1.45F, 0.25F, 0.0F, -1.45F, -1.9F, 0.0F, -1.45F, -1.9F); // Import
        ammoModel[71].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[72].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.45F, 0.25F, 0.0F, -1.45F, 0.25F, 0.0F, -1.45F, -1.9F, 0.0F, -1.45F, -1.9F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, -0.1F, -1.45F, 0.0F, -0.1F, -1.45F); // Import
        ammoModel[72].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[73].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, 0.0F, -0.6F, 0.2F, 0.0F, -0.6F, 0.2F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.8F, -0.6F, 0.2F, -1.8F, -0.6F, 0.2F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F); // Import
        ammoModel[73].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[74].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.2F, -1.4F, 0.2F, -0.2F, -1.4F, 0.2F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -1.4F, -1.8F, 0.2F, -1.4F, -1.8F, 0.2F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F); // Import
        ammoModel[74].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[75].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.6F, -1.8F, 0.2F, -0.6F, -1.8F, 0.2F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -1.8F, 0.2F, -0.6F, -1.8F, 0.2F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F); // Import
        ammoModel[75].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[76].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.4F, -1.8F, 0.2F, -1.4F, -1.8F, 0.2F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -0.2F, -1.4F, 0.2F, -0.2F, -1.4F, 0.2F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import
        ammoModel[76].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[77].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.8F, -0.6F, 0.2F, -1.8F, -0.6F, 0.2F, -1.8F, -0.6F, 0.0F, -1.8F, -0.6F, 0.0F, 0.0F, -0.6F, 0.2F, 0.0F, -0.6F, 0.2F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F); // Import
        ammoModel[77].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[78].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -1.4F, 0.0F, 0.2F, -1.4F, 0.0F, 0.2F, -1.4F, -1.8F, 0.0F, -1.4F, -1.8F, 0.0F, 0.0F, -0.6F, 0.2F, 0.0F, -0.6F, 0.2F, -0.2F, -1.4F, 0.0F, -0.2F, -1.4F); // Import
        ammoModel[78].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[79].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, -1.8F, 0.0F, -0.6F, -1.8F, 0.0F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, -1.8F, 0.0F, -0.6F, -1.8F); // Import
        ammoModel[79].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[80].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, 0.0F, -0.6F, 0.2F, 0.0F, -0.6F, 0.2F, -0.2F, -1.4F, 0.0F, -0.2F, -1.4F, 0.0F, -1.4F, 0.0F, 0.2F, -1.4F, 0.0F, 0.2F, -1.4F, -1.8F, 0.0F, -1.4F, -1.8F); // Import
        ammoModel[80].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[81].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.2F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, 0.0F, -0.2F, -0.6F, 0.0F, -0.2F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, 0.0F, -0.2F, -0.6F); // Import
        ammoModel[81].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[82].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -1.4F, 0.0F, -0.2F, -1.4F, 0.0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -1.4F, 0.0F, -0.2F, -1.4F); // Import
        ammoModel[82].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[83].addShapeBox(8.5F, -3.8F, -1F, 2, 2, 2, 0F, 0.0F, -0.2F, -1.4F, -0.5F, -0.6F, -1.4F, -0.5F, -0.6F, -0.6F, 0.0F, -0.6F, -0.2F, 0.0F, -0.2F, -1.4F, -0.5F, -0.6F, -1.4F, -0.5F, -0.6F, -0.6F, 0.0F, -0.6F, -0.2F); // Import
        ammoModel[83].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[84].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, -1.9F, -0.55F, -0.25F, -1.9F, -0.55F, -0.25F, -1.9F, -0.55F, -0.25F, -1.8F, -0.55F); // Import
        ammoModel[84].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[85].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, -0.1F, -1.45F, -0.25F, -0.1F, -1.45F, -0.25F, -1.45F, 0.1F, -0.25F, -1.45F, 0.1F, -0.25F, -1.45F, -1.9F, -0.25F, -1.45F, -1.9F); // Import
        ammoModel[85].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[86].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.1F, -1.45F, -0.25F, -0.1F, -1.45F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, -1.45F, -1.9F, -0.25F, -1.45F, -1.9F, -0.25F, -1.45F, 0.1F, -0.25F, -1.45F, 0.1F); // Import
        ammoModel[86].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[87].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.55F, 0.1F, -0.25F, -0.55F, 0.1F, -0.25F, -0.55F, -1.9F, -0.25F, -0.55F, -1.9F, -0.25F, -0.55F, 0.1F, -0.25F, -0.55F, 0.1F, -0.25F, -0.55F, -1.9F, -0.25F, -0.55F, -1.9F); // Import
        ammoModel[87].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[88].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -1.45F, 0.1F, -0.25F, -1.45F, 0.1F, -0.25F, -1.45F, -1.9F, -0.25F, -1.45F, -1.9F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, -0.1F, -1.45F, -0.25F, -0.1F, -1.45F); // Import
        ammoModel[88].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[89].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -1.9F, -0.55F, -0.25F, -1.9F, -0.55F, -0.25F, -1.9F, -0.55F, -0.25F, -1.9F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F); // Import
        ammoModel[89].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[90].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -1.45F, -1.9F, -0.25F, -1.45F, -1.9F, -0.25F, -1.45F, 0.1F, -0.25F, -1.45F, 0.1F, -0.25F, -0.1F, -1.45F, -0.25F, -0.1F, -1.45F, -0.25F, 0.1F, -0.55F, -0.25F, 0.1F, -0.55F); // Import
        ammoModel[90].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[91].addShapeBox(-23.75F, -3.8F, -1F, 1, 2, 2, 0F, -0.25F, -0.55F, -1.9F, -0.25F, -0.55F, -1.9F, -0.25F, -0.55F, 0.1F, -0.25F, -0.55F, 0.1F, -0.25F, -0.55F, -1.9F, -0.25F, -0.55F, -1.9F, -0.25F, -0.55F, 0.1F, -0.25F, -0.55F, 0.1F); // Import
        ammoModel[91].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[92].addShapeBox(4F, -2F, -0.7F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, -0.8F, 0.0F, -0.4F, -0.8F); // Import
        ammoModel[92].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[93].addShapeBox(4F, -0.4F, -0.7F, 2, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, -0.5F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F); // Import
        ammoModel[93].setRotationPoint(-0.5F, -1F, 0F);

        ammoModel[94].addShapeBox(0.3F, -2F, -0.5F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.19F, 0.0F, 0.0F, -0.19F, 0.0F, 0.0F, -0.19F, 0.0F, 0.0F, -0.19F, 0.0F, 0.3F, -0.19F, 0.0F, 0.6F, -0.19F, 0.0F, 0.6F, -0.19F, 0.0F, 0.3F, -0.19F); // Import
        ammoModel[94].setRotationPoint(-0.5F, -1F, 0F);

        gunSlideDistance = 0.0F;
        animationType = EnumAnimationType.P90;
        translateAll(1.0F, -1.63F, -2.0F);
        thirdPersonOffset = new Vector3f(0.0F, 0.0F, -0.1F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(-0.12F, -0.15F, 0.15F);
        leftArmRot = new Vector3f(60.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.4F, -0.45F, -0.1F);
        leftArmReloadRot = new Vector3f(60.0F, 20.0F, 0.0F);
        rightArmPos = new Vector3f(0.225F, -0.6F, 0.2F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(-0.4F, -0.25F, -0.6F);
        rightArmReloadRot = new Vector3f(-60.0F, 50.0F, -40.0F);
        rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        rightHandAmmo = true;
        leftHandAmmo = false;
        fancyStance = true;
        stanceRotate = new Vector3f(20.0F, 0.0F, -70.0F);
        stanceTranslate = new Vector3f(0.0F, 0.0F, 0.0F);
        zoomOffsetY = -0.295F;
        zoomOffset = 0.2F;
        crouchZoom = -0.05F;
        flipAll();
    }
}