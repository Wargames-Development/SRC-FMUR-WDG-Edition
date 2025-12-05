//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EMPGrenade
// Model Creator:
// Created on:15.03.2022 - 12:17:15
// Last changed on: 15.03.2022 - 12:17:15

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelEMPGrenade extends ModelBase {
    public ModelRendererTurbo empgrenadeModel[];
    int textureX = 512;
    int textureY = 512;

    public ModelEMPGrenade() {
        empgrenadeModel = new ModelRendererTurbo[63];
        empgrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        empgrenadeModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import
        empgrenadeModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import
        empgrenadeModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import
        empgrenadeModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import
        empgrenadeModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import
        empgrenadeModel[6] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import
        empgrenadeModel[7] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import
        empgrenadeModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        empgrenadeModel[9] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import
        empgrenadeModel[10] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import
        empgrenadeModel[11] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import
        empgrenadeModel[12] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import
        empgrenadeModel[13] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import
        empgrenadeModel[14] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Import
        empgrenadeModel[15] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import
        empgrenadeModel[16] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import
        empgrenadeModel[17] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import
        empgrenadeModel[18] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import
        empgrenadeModel[19] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import
        empgrenadeModel[20] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import
        empgrenadeModel[21] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Import
        empgrenadeModel[22] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import
        empgrenadeModel[23] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import
        empgrenadeModel[24] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import
        empgrenadeModel[25] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import
        empgrenadeModel[26] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import
        empgrenadeModel[27] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import
        empgrenadeModel[28] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Import
        empgrenadeModel[29] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Import
        empgrenadeModel[30] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import
        empgrenadeModel[31] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import
        empgrenadeModel[32] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Import
        empgrenadeModel[33] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import
        empgrenadeModel[34] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import
        empgrenadeModel[35] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Import
        empgrenadeModel[36] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Import
        empgrenadeModel[37] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import
        empgrenadeModel[38] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import
        empgrenadeModel[39] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Import
        empgrenadeModel[40] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import
        empgrenadeModel[41] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Import
        empgrenadeModel[42] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import
        empgrenadeModel[43] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Import
        empgrenadeModel[44] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import
        empgrenadeModel[45] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Import
        empgrenadeModel[46] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Import
        empgrenadeModel[47] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Import
        empgrenadeModel[48] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Import
        empgrenadeModel[49] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Import
        empgrenadeModel[50] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import
        empgrenadeModel[51] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Import
        empgrenadeModel[52] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Import
        empgrenadeModel[53] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import
        empgrenadeModel[54] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Import
        empgrenadeModel[55] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Import
        empgrenadeModel[56] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Import
        empgrenadeModel[57] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import
        empgrenadeModel[58] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Import
        empgrenadeModel[59] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import
        empgrenadeModel[60] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import
        empgrenadeModel[61] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import
        empgrenadeModel[62] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Import

        empgrenadeModel[0].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[0].setRotationPoint(0F, -39F, 0F);

        empgrenadeModel[1].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[1].setRotationPoint(0F, -28F, 0F);

        empgrenadeModel[2].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[2].setRotationPoint(0F, -39F, 0F);
        empgrenadeModel[2].rotateAngleY = -1.0471976F;

        empgrenadeModel[3].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[3].setRotationPoint(0F, -39F, 0F);
        empgrenadeModel[3].rotateAngleY = -2.0943952F;

        empgrenadeModel[4].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[4].setRotationPoint(0F, -39F, 0F);
        empgrenadeModel[4].rotateAngleY = -3.1415927F;

        empgrenadeModel[5].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[5].setRotationPoint(0F, -39F, 0F);
        empgrenadeModel[5].rotateAngleY = -4.1887903F;

        empgrenadeModel[6].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[6].setRotationPoint(0F, -39F, 0F);
        empgrenadeModel[6].rotateAngleY = -5.2359877F;

        empgrenadeModel[7].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[7].setRotationPoint(0F, -17F, 0F);

        empgrenadeModel[8].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[8].setRotationPoint(0F, 5F, 0F);

        empgrenadeModel[9].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[9].setRotationPoint(0F, 19F, 0F);

        empgrenadeModel[10].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[10].setRotationPoint(0F, -28F, 0F);

        empgrenadeModel[11].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[11].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[11].rotateAngleY = 1.0471976F;

        empgrenadeModel[12].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[12].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[12].rotateAngleY = 2.0943952F;

        empgrenadeModel[13].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[13].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[13].rotateAngleY = 3.1415927F;

        empgrenadeModel[14].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[14].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[14].rotateAngleY = 4.1887903F;

        empgrenadeModel[15].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[15].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[15].rotateAngleY = 5.2359877F;

        empgrenadeModel[16].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[16].setRotationPoint(0F, -41F, 0F);
        empgrenadeModel[16].rotateAngleY = 5.2359877F;

        empgrenadeModel[17].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[17].setRotationPoint(0F, -41F, 0F);
        empgrenadeModel[17].rotateAngleY = 4.1887903F;

        empgrenadeModel[18].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[18].setRotationPoint(0F, -41F, 0F);
        empgrenadeModel[18].rotateAngleY = 3.1415927F;

        empgrenadeModel[19].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[19].setRotationPoint(0F, -41F, 0F);
        empgrenadeModel[19].rotateAngleY = 2.0943952F;

        empgrenadeModel[20].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[20].setRotationPoint(0F, -41F, 0F);
        empgrenadeModel[20].rotateAngleY = 1.0471976F;

        empgrenadeModel[21].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[21].setRotationPoint(0F, -41F, 0F);

        empgrenadeModel[22].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[22].setRotationPoint(0F, 30F, 0F);
        empgrenadeModel[22].rotateAngleY = 5.2359877F;

        empgrenadeModel[23].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[23].setRotationPoint(0F, 30F, 0F);
        empgrenadeModel[23].rotateAngleY = 4.1887903F;

        empgrenadeModel[24].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[24].setRotationPoint(0F, 30F, 0F);
        empgrenadeModel[24].rotateAngleY = 3.1415927F;

        empgrenadeModel[25].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[25].setRotationPoint(0F, 30F, 0F);
        empgrenadeModel[25].rotateAngleY = 2.0943952F;

        empgrenadeModel[26].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[26].setRotationPoint(0F, 30F, 0F);
        empgrenadeModel[26].rotateAngleY = 1.0471976F;

        empgrenadeModel[27].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[27].setRotationPoint(0F, 30F, 0F);

        empgrenadeModel[28].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[28].setRotationPoint(0F, 32F, 0F);
        empgrenadeModel[28].rotateAngleY = -5.2359877F;

        empgrenadeModel[29].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[29].setRotationPoint(0F, 32F, 0F);

        empgrenadeModel[30].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[30].setRotationPoint(0F, 32F, 0F);
        empgrenadeModel[30].rotateAngleY = -1.0471976F;

        empgrenadeModel[31].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[31].setRotationPoint(0F, 32F, 0F);
        empgrenadeModel[31].rotateAngleY = -2.0943952F;

        empgrenadeModel[32].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[32].setRotationPoint(0F, 32F, 0F);
        empgrenadeModel[32].rotateAngleY = -3.1415927F;

        empgrenadeModel[33].addShapeBox(0F, -2F, -9.5F, 17, 11, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[33].setRotationPoint(0F, 32F, 0F);
        empgrenadeModel[33].rotateAngleY = -4.1887903F;

        empgrenadeModel[34].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[34].setRotationPoint(0F, 43F, 0F);
        empgrenadeModel[34].rotateAngleY = 2.0943952F;

        empgrenadeModel[35].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[35].setRotationPoint(0F, 43F, 0F);
        empgrenadeModel[35].rotateAngleY = 3.1415927F;

        empgrenadeModel[36].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[36].setRotationPoint(0F, 43F, 0F);
        empgrenadeModel[36].rotateAngleY = 1.0471976F;

        empgrenadeModel[37].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[37].setRotationPoint(0F, 43F, 0F);

        empgrenadeModel[38].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[38].setRotationPoint(0F, 43F, 0F);
        empgrenadeModel[38].rotateAngleY = 5.2359877F;

        empgrenadeModel[39].addShapeBox(0F, -2F, -9.5F, 17, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); // Import
        empgrenadeModel[39].setRotationPoint(0F, 43F, 0F);
        empgrenadeModel[39].rotateAngleY = 4.1887903F;

        empgrenadeModel[40].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[40].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[40].rotateAngleY = 1.0471976F;

        empgrenadeModel[41].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[41].setRotationPoint(0F, -17F, 0F);
        empgrenadeModel[41].rotateAngleY = 1.0471976F;

        empgrenadeModel[42].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[42].setRotationPoint(0F, 5F, 0F);
        empgrenadeModel[42].rotateAngleY = 1.0471976F;

        empgrenadeModel[43].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[43].setRotationPoint(0F, 19F, 0F);
        empgrenadeModel[43].rotateAngleY = 1.0471976F;

        empgrenadeModel[44].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[44].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[44].rotateAngleY = 2.0943952F;

        empgrenadeModel[45].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[45].setRotationPoint(0F, -17F, 0F);
        empgrenadeModel[45].rotateAngleY = 2.0943952F;

        empgrenadeModel[46].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[46].setRotationPoint(0F, 5F, 0F);
        empgrenadeModel[46].rotateAngleY = 2.0943952F;

        empgrenadeModel[47].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[47].setRotationPoint(0F, 19F, 0F);
        empgrenadeModel[47].rotateAngleY = 2.0943952F;

        empgrenadeModel[48].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[48].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[48].rotateAngleY = 3.1415927F;

        empgrenadeModel[49].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[49].setRotationPoint(0F, -17F, 0F);
        empgrenadeModel[49].rotateAngleY = 3.1415927F;

        empgrenadeModel[50].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[50].setRotationPoint(0F, 5F, 0F);
        empgrenadeModel[50].rotateAngleY = 3.1415927F;

        empgrenadeModel[51].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[51].setRotationPoint(0F, 19F, 0F);
        empgrenadeModel[51].rotateAngleY = 3.1415927F;

        empgrenadeModel[52].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[52].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[52].rotateAngleY = 4.1887903F;

        empgrenadeModel[53].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[53].setRotationPoint(0F, -17F, 0F);
        empgrenadeModel[53].rotateAngleY = 4.1887903F;

        empgrenadeModel[54].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[54].setRotationPoint(0F, 5F, 0F);
        empgrenadeModel[54].rotateAngleY = 4.1887903F;

        empgrenadeModel[55].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[55].setRotationPoint(0F, 19F, 0F);
        empgrenadeModel[55].rotateAngleY = 4.1887903F;

        empgrenadeModel[56].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[56].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[56].rotateAngleY = 5.2359877F;

        empgrenadeModel[57].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[57].setRotationPoint(0F, -17F, 0F);
        empgrenadeModel[57].rotateAngleY = 5.2359877F;

        empgrenadeModel[58].addShapeBox(12F, 0F, -7.5F, 1, 12, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[58].setRotationPoint(0F, 5F, 0F);
        empgrenadeModel[58].rotateAngleY = 5.2359877F;

        empgrenadeModel[59].addShapeBox(12F, 0F, -7.5F, 1, 9, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[59].setRotationPoint(0F, 19F, 0F);
        empgrenadeModel[59].rotateAngleY = 5.2359877F;

        empgrenadeModel[60].addShapeBox(-9F, 0F, -5F, 18, 56, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[60].setRotationPoint(0F, -28F, 0F);

        empgrenadeModel[61].addShapeBox(-9F, 0F, -5F, 18, 56, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[61].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[61].rotateAngleY = -1.0471976F;

        empgrenadeModel[62].addShapeBox(-9F, 0F, -5F, 18, 56, 10, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        empgrenadeModel[62].setRotationPoint(0F, -28F, 0F);
        empgrenadeModel[62].rotateAngleY = -2.0943952F;


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.075F, 0.075F, 0.075F);

        for (int i = 0; i < 63; i++) {
            empgrenadeModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}