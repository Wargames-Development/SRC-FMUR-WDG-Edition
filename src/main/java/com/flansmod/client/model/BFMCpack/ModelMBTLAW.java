//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MBTLAW
// Model Creator: 
// Created on: 14.03.2022 - 21:33:43
// Last changed on: 14.03.2022 - 21:33:43

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMBTLAW extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ModelMBTLAW() //Same as Filename
    {
        ammoModel = new ModelRendererTurbo[75];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        ammoModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 0
        ammoModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
        ammoModel[3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 0
        ammoModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
        ammoModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
        ammoModel[6] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 0
        ammoModel[7] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 0
        ammoModel[8] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 0
        ammoModel[9] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 0
        ammoModel[10] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 0
        ammoModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
        ammoModel[12] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 0
        ammoModel[13] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 0
        ammoModel[14] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 0
        ammoModel[15] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 0
        ammoModel[16] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 0
        ammoModel[17] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 0
        ammoModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
        ammoModel[19] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 0
        ammoModel[20] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 0
        ammoModel[21] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 0
        ammoModel[22] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
        ammoModel[23] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 0
        ammoModel[24] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 50
        ammoModel[25] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 50
        ammoModel[26] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 50
        ammoModel[27] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 50
        ammoModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
        ammoModel[29] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 50
        ammoModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 50
        ammoModel[31] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 0
        ammoModel[32] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 0
        ammoModel[33] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 61
        ammoModel[34] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 61
        ammoModel[35] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 61
        ammoModel[36] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 61
        ammoModel[37] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 61
        ammoModel[38] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 61
        ammoModel[39] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 61
        ammoModel[40] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 0
        ammoModel[41] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 0
        ammoModel[42] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 0
        ammoModel[43] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 0
        ammoModel[44] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 0
        ammoModel[45] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 0
        ammoModel[46] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 0
        ammoModel[47] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 61
        ammoModel[48] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 61
        ammoModel[49] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 61
        ammoModel[50] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 61
        ammoModel[51] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 61
        ammoModel[52] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 0
        ammoModel[53] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 0
        ammoModel[54] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 61
        ammoModel[55] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 61
        ammoModel[56] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 61
        ammoModel[57] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
        ammoModel[58] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
        ammoModel[59] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 0
        ammoModel[60] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
        ammoModel[61] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 0
        ammoModel[62] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 0
        ammoModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
        ammoModel[64] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 0
        ammoModel[65] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 0
        ammoModel[66] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 101
        ammoModel[67] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 101
        ammoModel[68] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 101
        ammoModel[69] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 101
        ammoModel[70] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 101
        ammoModel[71] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 101
        ammoModel[72] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 101
        ammoModel[73] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 101
        ammoModel[74] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 61

        ammoModel[0].addShapeBox(-22.5F, -0.5F, -5F, 38, 1, 10, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F); // Box 0
        ammoModel[0].setRotationPoint(-13F, -9F, 0F);

        ammoModel[1].addShapeBox(-22.5F, -0.5F, -5F, 38, 1, 10, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F); // Box 0
        ammoModel[1].setRotationPoint(-13F, -9F, 0F);
        ammoModel[1].rotateAngleX = 0.62831853F;

        ammoModel[2].addShapeBox(-22.5F, -0.5F, -5F, 38, 1, 10, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F); // Box 0
        ammoModel[2].setRotationPoint(-13F, -9F, 0F);
        ammoModel[2].rotateAngleX = 1.25663706F;

        ammoModel[3].addShapeBox(-22.5F, -0.5F, -5F, 38, 1, 10, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F); // Box 0
        ammoModel[3].setRotationPoint(-13F, -9F, 0F);
        ammoModel[3].rotateAngleX = -0.62831853F;

        ammoModel[4].addShapeBox(-22.5F, -0.5F, -5F, 38, 1, 10, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F); // Box 0
        ammoModel[4].setRotationPoint(-13F, -9F, 0F);
        ammoModel[4].rotateAngleX = -1.25663706F;

        ammoModel[5].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[5].setRotationPoint(-44F, -9F, 0F);

        ammoModel[6].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[6].setRotationPoint(-44F, -9F, 0F);
        ammoModel[6].rotateAngleX = -1.25663706F;

        ammoModel[7].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[7].setRotationPoint(-44F, -9F, 0F);
        ammoModel[7].rotateAngleX = -1.88495559F;

        ammoModel[8].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[8].setRotationPoint(-51F, -9F, 0F);

        ammoModel[9].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[9].setRotationPoint(-51F, -9F, 0F);
        ammoModel[9].rotateAngleX = 0.62831853F;

        ammoModel[10].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[10].setRotationPoint(-51F, -9F, 0F);
        ammoModel[10].rotateAngleX = -0.62831853F;

        ammoModel[11].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[11].setRotationPoint(-51F, -9F, 0F);
        ammoModel[11].rotateAngleX = 1.25663706F;

        ammoModel[12].addShapeBox(1.5F, -0.5F, -5F, 7, 1, 10, 0F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F, 0F, 1.925F, 2.5F); // Box 0
        ammoModel[12].setRotationPoint(-51F, -9F, 0F);
        ammoModel[12].rotateAngleX = -1.25663706F;

        ammoModel[13].addShapeBox(-4.5F, -0.5F, -5F, 4, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[13].setRotationPoint(7F, -9F, 0F);

        ammoModel[14].addShapeBox(-4.5F, -0.5F, -5F, 4, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[14].setRotationPoint(7F, -9F, 0F);
        ammoModel[14].rotateAngleX = 0.62831853F;

        ammoModel[15].addShapeBox(-4.5F, -0.5F, -5F, 4, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[15].setRotationPoint(7F, -9F, 0F);
        ammoModel[15].rotateAngleX = 1.25663706F;

        ammoModel[16].addShapeBox(-4.5F, -0.5F, -5F, 4, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[16].setRotationPoint(7F, -9F, 0F);
        ammoModel[16].rotateAngleX = -0.62831853F;

        ammoModel[17].addShapeBox(-4.5F, -0.5F, -5F, 4, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[17].setRotationPoint(7F, -9F, 0F);
        ammoModel[17].rotateAngleX = -1.25663706F;

        ammoModel[18].addShapeBox(-4.5F, -0.5F, -5F, 36, 1, 10, 0F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F); // Box 0
        ammoModel[18].setRotationPoint(11F, -9F, 0F);

        ammoModel[19].addShapeBox(-4.5F, -0.5F, -5F, 36, 1, 10, 0F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F); // Box 0
        ammoModel[19].setRotationPoint(11F, -9F, 0F);
        ammoModel[19].rotateAngleX = 0.62831853F;

        ammoModel[20].addShapeBox(-4.5F, -0.5F, -5F, 36, 1, 10, 0F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F); // Box 0
        ammoModel[20].setRotationPoint(11F, -9F, 0F);
        ammoModel[20].rotateAngleX = 1.25663706F;

        ammoModel[21].addShapeBox(-4.5F, -0.5F, -5F, 36, 1, 10, 0F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F); // Box 0
        ammoModel[21].setRotationPoint(11F, -9F, 0F);
        ammoModel[21].rotateAngleX = -0.62831853F;

        ammoModel[22].addShapeBox(-4.5F, -0.5F, -5F, 36, 1, 10, 0F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F, 0F, 1.45F, 1F); // Box 0
        ammoModel[22].setRotationPoint(11F, -9F, 0F);
        ammoModel[22].rotateAngleX = -1.25663706F;

        ammoModel[23].addShapeBox(1.5F, -0.5F, -5F, 1, 1, 10, 0F, -0.5F, 1.425F, 2F, 0F, 1.425F, 2F, 0F, 1.425F, 2F, -0.5F, 1.425F, 2F, -0.5F, 1.425F, 2F, 0F, 1.425F, 2F, 0F, 1.425F, 2F, -0.5F, 1.425F, 2F); // Box 0
        ammoModel[23].setRotationPoint(-52F, -9F, 0F);
        ammoModel[23].rotateAngleX = 0.62831853F;

        ammoModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 50
        ammoModel[24].setRotationPoint(17F, -4F, -2F);

        ammoModel[25].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        ammoModel[25].setRotationPoint(19F, -2F, -1F);

        ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 50
        ammoModel[26].setRotationPoint(21F, -2F, -1F);

        ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 50
        ammoModel[27].setRotationPoint(18F, -2F, -1F);

        ammoModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 50
        ammoModel[28].setRotationPoint(19F, 6F, -1F);

        ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.75F); // Box 50
        ammoModel[29].setRotationPoint(18F, 6F, -1F);

        ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.5F); // Box 50
        ammoModel[30].setRotationPoint(21F, 6F, -1F);

        ammoModel[31].addShapeBox(-22.5F, -0.5F, -5F, 11, 1, 9, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 0
        ammoModel[31].setRotationPoint(30F, -14.8F, -1F);

        ammoModel[32].addShapeBox(-22.5F, -0.5F, -5F, 11, 1, 4, 0F, 0F, 1.125F, -1.5F, 0F, 1.125F, -1.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -1.875F, 0F, 0F, -1.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 0
        ammoModel[32].setRotationPoint(30F, -14.8F, -5F);

        ammoModel[33].addShapeBox(0F, -1F, -3F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[33].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[33].rotateAngleX = 0.39269908F;

        ammoModel[34].addShapeBox(0F, 1F, -3F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
        ammoModel[34].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[34].rotateAngleX = 0.39269908F;

        ammoModel[35].addShapeBox(0F, -3F, -3F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[35].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[35].rotateAngleX = 0.39269908F;

        ammoModel[36].addShapeBox(22F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[36].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[36].rotateAngleX = 0.39269908F;

        ammoModel[37].addShapeBox(22F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
        ammoModel[37].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[37].rotateAngleX = 0.39269908F;

        ammoModel[38].addShapeBox(22F, -3F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[38].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[38].rotateAngleX = 0.39269908F;

        ammoModel[39].addShapeBox(2F, -1F, -2.5F, 20, 2, 5, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 61
        ammoModel[39].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[39].rotateAngleX = 0.39269908F;

        ammoModel[40].addShapeBox(-4.5F, -0.5F, -5F, 12, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[40].setRotationPoint(-24F, -9F, 0F);

        ammoModel[41].addShapeBox(-4.5F, -0.5F, -5F, 12, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[41].setRotationPoint(-24F, -9F, 0F);
        ammoModel[41].rotateAngleX = 0.62831853F;

        ammoModel[42].addShapeBox(-4.5F, -0.5F, -5F, 12, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[42].setRotationPoint(-24F, -9F, 0F);
        ammoModel[42].rotateAngleX = 1.25663706F;

        ammoModel[43].addShapeBox(-4.5F, -0.5F, -5F, 12, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[43].setRotationPoint(-24F, -9F, 0F);
        ammoModel[43].rotateAngleX = -0.62831853F;

        ammoModel[44].addShapeBox(-4.5F, -0.5F, -5F, 12, 1, 10, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[44].setRotationPoint(-24F, -9F, 0F);
        ammoModel[44].rotateAngleX = -1.25663706F;

        ammoModel[45].addShapeBox(-4.5F, -0.5F, -5F, 5, 3, 10, 0F, 0F, 2F, 4.7F, 0F, 2F, 4.7F, 0F, 2F, 4.7F, 0F, 2F, 4.7F, 0F, 1.93F, 4.7F, 0F, 1.93F, 4.7F, 0F, 1.93F, 4.7F, 0F, 1.93F, 4.7F); // Box 0
        ammoModel[45].setRotationPoint(38F, -10F, 0F);

        ammoModel[46].addShapeBox(-4.5F, -0.5F, -5F, 5, 2, 10, 0F, 0F, 1.938F, 4.7F, 0F, 1.938F, 4.7F, 0F, 1.938F, 4.7F, 0F, 1.938F, 4.7F, 0F, 1.938F, 0.5F, 0F, 1.938F, 0.5F, 0F, 1.938F, 0.5F, 0F, 1.938F, 0.5F); // Box 0
        ammoModel[46].setRotationPoint(38F, -3.13F, 0F);

        ammoModel[47].addShapeBox(2F, -2.6F, -2.5F, 20, 2, 5, 0F, 0F, -0.2F, -1.667F, 0F, -0.2F, -1.667F, 0F, -0.2F, -1.667F, 0F, -0.2F, -1.667F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 61
        ammoModel[47].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[47].rotateAngleX = 0.39269908F;

        ammoModel[48].addShapeBox(2F, 0.6F, -2.5F, 20, 2, 5, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.667F, 0F, -0.2F, -1.667F, 0F, -0.2F, -1.667F, 0F, -0.2F, -1.667F); // Box 61
        ammoModel[48].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[48].rotateAngleX = 0.39269908F;

        ammoModel[49].addShapeBox(20F, -1F, -2.5F, 2, 2, 5, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0F); // Box 61
        ammoModel[49].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[49].rotateAngleX = 0.39269908F;

        ammoModel[50].addShapeBox(20F, -2.6F, -2.5F, 2, 2, 5, 0F, 0F, -0.2F, -1.667F, 0F, 0.4F, -1.517F, 0F, 0.4F, -1.517F, 0F, -0.2F, -1.667F, 0F, -0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0F); // Box 61
        ammoModel[50].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[50].rotateAngleX = 0.39269908F;

        ammoModel[51].addShapeBox(20F, 0.6F, -2.5F, 2, 2, 5, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1.667F, 0F, 0.4F, -1.517F, 0F, 0.4F, -1.517F, 0F, -0.2F, -1.667F); // Box 61
        ammoModel[51].setRotationPoint(7F, -16.25F, 8.6F);
        ammoModel[51].rotateAngleX = 0.39269908F;

        ammoModel[52].addShapeBox(-4.5F, -0.5F, -5F, 8, 5, 1, 0F, 0F, 2F, 3.2F, 0F, 2F, 3.2F, 0F, 2F, 3.2F, 0F, 2F, 3.2F, 0F, 1.93F, 4F, 0F, 1.93F, 4F, 0F, 1.93F, 4F, 0F, 1.93F, 4F); // Box 0
        ammoModel[52].setRotationPoint(30F, -19F, 4.5F);

        ammoModel[53].addShapeBox(-4.5F, -0.5F, -5F, 8, 5, 1, 0F, 0F, -3F, 3.2F, 0F, 2F, 3.2F, 0F, 2F, 3.2F, 0F, -3F, 3.2F, 0F, 1.93F, 4F, 0F, 1.93F, 4F, 0F, 1.93F, 4F, 0F, 1.93F, 4F); // Box 0
        ammoModel[53].setRotationPoint(22F, -19F, 4.5F);

        ammoModel[54].addShapeBox(-3F, -1F, -2F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[54].setRotationPoint(-29F, -9F, 5.6F);
        ammoModel[54].rotateAngleZ = 0.78539816F;

        ammoModel[55].addShapeBox(-3F, 1F, -2F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 61
        ammoModel[55].setRotationPoint(-29F, -9F, 5.6F);
        ammoModel[55].rotateAngleZ = 0.78539816F;

        ammoModel[56].addShapeBox(-3F, -3F, -2F, 6, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[56].setRotationPoint(-29F, -9F, 5.6F);
        ammoModel[56].rotateAngleZ = 0.78539816F;

        ammoModel[57].addShapeBox(-4.5F, -0.5F, -5F, 3, 1, 1, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[57].setRotationPoint(-31F, -9F, 0F);
        ammoModel[57].rotateAngleX = 2.19911486F;

        ammoModel[58].addShapeBox(-4.5F, -0.5F, -5F, 3, 1, 1, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[58].setRotationPoint(-31F, -9F, 0F);
        ammoModel[58].rotateAngleX = 2.82743339F;

        ammoModel[59].addShapeBox(-4.5F, -0.5F, -5F, 3, 1, 1, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[59].setRotationPoint(-31F, -9F, 0F);
        ammoModel[59].rotateAngleX = 0.9424778F;

        ammoModel[60].addShapeBox(-4.5F, -0.5F, -5F, 3, 1, 1, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[60].setRotationPoint(-31F, -9F, 0F);
        ammoModel[60].rotateAngleX = 0.31415927F;

        ammoModel[61].addShapeBox(-4.5F, -0.5F, -5F, 3, 1, 1, 0F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F, 0F, 1.283F, 0.5F); // Box 0
        ammoModel[61].setRotationPoint(-31F, -9F, 0F);
        ammoModel[61].rotateAngleX = 1.57079633F;

        ammoModel[62].addShapeBox(-4.5F, -0.5F, -5F, 4, 4, 1, 0F, 0F, 1.93F, 2.7F, 0F, 1.93F, 2.7F, 0F, 1.93F, 2.7F, 0F, 1.93F, 2.7F, 0F, -3F, 2.7F, 0F, -1F, 2.7F, 0F, -1F, 2.7F, 0F, -3F, 2.7F); // Box 0
        ammoModel[62].setRotationPoint(31F, -2F, 4.5F);

        ammoModel[63].addShapeBox(-4.5F, -0.5F, -5F, 3, 4, 1, 0F, 0F, 1.93F, 2.7F, 0F, 1.93F, 2.7F, 0F, 1.93F, 2.7F, 0F, 1.93F, 2.7F, 0F, -1F, 2.7F, 0F, -1F, 2.7F, 0F, -1F, 2.7F, 0F, -1F, 2.7F); // Box 0
        ammoModel[63].setRotationPoint(35F, -2F, 4.5F);

        ammoModel[64].addShapeBox(-4.5F, -0.5F, -5F, 4, 5, 3, 0F, 0F, 1.93F, 2.7F, -1F, 1.93F, 2.7F, -1F, 1.93F, 2.7F, 0F, 1.93F, 2.7F, 0F, -2F, 2.7F, -1F, -3F, 2.7F, -1F, -3F, 2.7F, 0F, -2F, 2.7F); // Box 0
        ammoModel[64].setRotationPoint(42F, -2.35F, 3.5F);

        ammoModel[65].addShapeBox(-4.5F, -0.5F, -5F, 5, 5, 1, 0F, 0F, 2F, 3.2F, 0F, -1F, 3.2F, 0F, -1F, 3.2F, 0F, 2F, 3.2F, 0F, 1.93F, 4F, 0F, 1.93F, 4F, 0F, 1.93F, 4F, 0F, 1.93F, 4F); // Box 0
        ammoModel[65].setRotationPoint(38F, -19F, 4.5F);

        ammoModel[66].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        ammoModel[66].setRotationPoint(13F, -14.75F, 8F);

        ammoModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 101
        ammoModel[67].setRotationPoint(12.5F, -13.5F, 8.5F);

        ammoModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 101
        ammoModel[68].setRotationPoint(12.5F, -13F, 8.5F);

        ammoModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F); // Box 101
        ammoModel[69].setRotationPoint(12.5F, -10.5F, 7.5F);

        ammoModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 101
        ammoModel[70].setRotationPoint(12F, -10.5F, 5.5F);

        ammoModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 101
        ammoModel[71].setRotationPoint(18.5F, -13F, 8.5F);

        ammoModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F); // Box 101
        ammoModel[72].setRotationPoint(18.5F, -10.5F, 7.5F);

        ammoModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 101
        ammoModel[73].setRotationPoint(18F, -10.5F, 5.5F);

        ammoModel[74].addShapeBox(-3F, -1F, -2F, 6, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        ammoModel[74].setRotationPoint(26F, -10F, 5.6F);
        ammoModel[74].rotateAngleZ = 0.78539816F;
        thirdPersonOffset = new Vector3f(0 / 16F, 1.5F / 16F, 0F / 16F);
        hasFlash = true;
        hasArms = true;
        leftArmPos = new Vector3f(-0.1F, -0.4F, 0.0F);
        leftArmRot = new Vector3f(80.0F, 40.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.4F, 0.0F);
        leftArmReloadRot = new Vector3f(80.0F, 40.0F, 0.0F);
        rightArmPos = new Vector3f(0.17F, -0.6F, 0.05F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -70.0F);
        rightArmReloadPos = new Vector3f(0.17F, -0.6F, 0.05F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -70.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        rightHandAmmo = true;
        leftHandAmmo = false;
        fancyStance = true;
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        stanceTranslate = new Vector3f(0.0F, 0.0F, 0.0F);
        animationType = EnumAnimationType.RIFLE_TOP;
        translateAll(-20F, -11.5F, -5F);
        zoomOffsetY = -0.08F;
        flipAll();
    }
}