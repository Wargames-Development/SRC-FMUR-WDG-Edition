//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
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

public class ModelATGrenade extends ModelBase {
    public ModelRendererTurbo atgrenadeModel[];
    int textureX = 256;
    int textureY = 256;

    public ModelATGrenade() {
        atgrenadeModel = new ModelRendererTurbo[47];
        atgrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
        atgrenadeModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 61
        atgrenadeModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 62
        atgrenadeModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 66
        atgrenadeModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 67
        atgrenadeModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 68
        atgrenadeModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 72
        atgrenadeModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
        atgrenadeModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 75
        atgrenadeModel[9] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 76
        atgrenadeModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 124
        atgrenadeModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 125
        atgrenadeModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 126
        atgrenadeModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 129
        atgrenadeModel[14] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 130
        atgrenadeModel[15] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 131
        atgrenadeModel[16] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 132
        atgrenadeModel[17] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 133
        atgrenadeModel[18] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 134
        atgrenadeModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 135
        atgrenadeModel[20] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 136
        atgrenadeModel[21] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 137
        atgrenadeModel[22] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 138
        atgrenadeModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 139
        atgrenadeModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 140
        atgrenadeModel[25] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 67
        atgrenadeModel[26] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 72
        atgrenadeModel[27] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 73
        atgrenadeModel[28] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 72
        atgrenadeModel[29] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 73
        atgrenadeModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 89
        atgrenadeModel[31] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 89
        atgrenadeModel[32] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 89
        atgrenadeModel[33] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 89
        atgrenadeModel[34] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 89
        atgrenadeModel[35] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 89
        atgrenadeModel[36] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 89
        atgrenadeModel[37] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 89
        atgrenadeModel[38] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 89
        atgrenadeModel[39] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 89
        atgrenadeModel[40] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 89
        atgrenadeModel[41] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 89
        atgrenadeModel[42] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 67
        atgrenadeModel[43] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 72
        atgrenadeModel[44] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 73
        atgrenadeModel[45] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 72
        atgrenadeModel[46] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 73

        atgrenadeModel[0].addShapeBox(0F, 0F, 0F, 4, 45, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        atgrenadeModel[0].setRotationPoint(-2F, -10F, -7.5F);

        atgrenadeModel[1].addShapeBox(0F, 0F, 0F, 4, 45, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 61
        atgrenadeModel[1].setRotationPoint(2F, -10F, -7.5F);

        atgrenadeModel[2].addShapeBox(0F, 0F, 0F, 2, 45, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 62
        atgrenadeModel[2].setRotationPoint(6F, -10F, -5.5F);

        atgrenadeModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 66
        atgrenadeModel[3].setRotationPoint(2F, -11F, -5.5F);

        atgrenadeModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        atgrenadeModel[4].setRotationPoint(-2F, -11F, -5.5F);

        atgrenadeModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 68
        atgrenadeModel[5].setRotationPoint(5F, -11F, -3.5F);

        atgrenadeModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 72
        atgrenadeModel[6].setRotationPoint(-5F, -11F, -5.5F);

        atgrenadeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 73
        atgrenadeModel[7].setRotationPoint(-7F, -11F, -3.5F);

        atgrenadeModel[8].addShapeBox(0F, 0F, 0F, 2, 45, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 75
        atgrenadeModel[8].setRotationPoint(-8F, -10F, -5.5F);

        atgrenadeModel[9].addShapeBox(0F, 0F, 0F, 4, 45, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 76
        atgrenadeModel[9].setRotationPoint(-6F, -10F, -7.5F);

        atgrenadeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 124
        atgrenadeModel[10].setRotationPoint(-0.5F, -20.5F, -1F);

        atgrenadeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
        atgrenadeModel[11].setRotationPoint(-0.5F, -21F, -1F);

        atgrenadeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 126
        atgrenadeModel[12].setRotationPoint(-0.5F, -20F, -1F);

        atgrenadeModel[13].addShapeBox(-1F, -0.25F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 129
        atgrenadeModel[13].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[13].rotateAngleX = 2.94960644F;
        atgrenadeModel[13].rotateAngleY = -6.26573201F;

        atgrenadeModel[14].addShapeBox(-4F, 2.75F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 130
        atgrenadeModel[14].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[14].rotateAngleX = 2.94960644F;
        atgrenadeModel[14].rotateAngleY = -6.26573201F;

        atgrenadeModel[15].addShapeBox(-4F, 0.75F, -0.5F, 1, 2, 1, 0F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 131
        atgrenadeModel[15].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[15].rotateAngleX = 2.94960644F;
        atgrenadeModel[15].rotateAngleY = -6.26573201F;

        atgrenadeModel[16].addShapeBox(-3F, -0.25F, -0.5F, 1, 1, 1, 0F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Box 132
        atgrenadeModel[16].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[16].rotateAngleX = 2.94960644F;
        atgrenadeModel[16].rotateAngleY = -6.26573201F;

        atgrenadeModel[17].addShapeBox(2F, -0.25F, -0.5F, 1, 1, 1, 0F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 133
        atgrenadeModel[17].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[17].rotateAngleX = 2.94960644F;
        atgrenadeModel[17].rotateAngleY = -6.26573201F;

        atgrenadeModel[18].addShapeBox(3F, 0.75F, -0.5F, 1, 2, 1, 0F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 134
        atgrenadeModel[18].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[18].rotateAngleX = 2.94960644F;
        atgrenadeModel[18].rotateAngleY = -6.26573201F;

        atgrenadeModel[19].addShapeBox(3F, 2.75F, -0.5F, 1, 2, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 135
        atgrenadeModel[19].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[19].rotateAngleX = 2.94960644F;
        atgrenadeModel[19].rotateAngleY = -6.26573201F;

        atgrenadeModel[20].addShapeBox(3F, 4.75F, -0.5F, 1, 2, 1, 0F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F); // Box 136
        atgrenadeModel[20].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[20].rotateAngleX = 2.94960644F;
        atgrenadeModel[20].rotateAngleY = -6.26573201F;

        atgrenadeModel[21].addShapeBox(2F, 6.75F, -0.5F, 1, 1, 1, 0F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F); // Box 137
        atgrenadeModel[21].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[21].rotateAngleX = 2.94960644F;
        atgrenadeModel[21].rotateAngleY = -6.26573201F;

        atgrenadeModel[22].addShapeBox(-1F, 6.75F, -0.5F, 2, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
        atgrenadeModel[22].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[22].rotateAngleX = 2.94960644F;
        atgrenadeModel[22].rotateAngleY = -6.26573201F;

        atgrenadeModel[23].addShapeBox(-3F, 6.75F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -2F, 0F, -0.25F); // Box 139
        atgrenadeModel[23].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[23].rotateAngleX = 2.94960644F;
        atgrenadeModel[23].rotateAngleY = -6.26573201F;

        atgrenadeModel[24].addShapeBox(-4F, 4.75F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1F, 0F, -0.25F); // Box 140
        atgrenadeModel[24].setRotationPoint(0F, -20F, 6.5F);
        atgrenadeModel[24].rotateAngleX = 2.94960644F;
        atgrenadeModel[24].rotateAngleY = -6.26573201F;

        atgrenadeModel[25].addShapeBox(0F, 0F, 0F, 4, 40, 12, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 67
        atgrenadeModel[25].setRotationPoint(-2F, -51F, -5.5F);

        atgrenadeModel[26].addShapeBox(0F, 0F, 0F, 3, 40, 12, 0F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F); // Box 72
        atgrenadeModel[26].setRotationPoint(-5F, -51F, -5.5F);

        atgrenadeModel[27].addShapeBox(0F, 0F, 0F, 2, 40, 8, 0F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F); // Box 73
        atgrenadeModel[27].setRotationPoint(-7F, -51F, -3.5F);

        atgrenadeModel[28].addShapeBox(0F, 0F, 0F, 3, 40, 12, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F); // Box 72
        atgrenadeModel[28].setRotationPoint(2F, -51F, -5.5F);

        atgrenadeModel[29].addShapeBox(0F, 0F, 0F, 2, 40, 8, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F); // Box 73
        atgrenadeModel[29].setRotationPoint(5F, -51F, -3.5F);

        atgrenadeModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[30].setRotationPoint(-2F, 35F, 7.5F);

        atgrenadeModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[31].setRotationPoint(2F, 35F, -7.5F);

        atgrenadeModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[32].setRotationPoint(7F, 35F, -1.5F);

        atgrenadeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[33].setRotationPoint(7F, 35F, -5.5F);

        atgrenadeModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[34].setRotationPoint(-8F, 35F, -1.5F);

        atgrenadeModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[35].setRotationPoint(-2F, 35F, -7.5F);

        atgrenadeModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 89
        atgrenadeModel[36].setRotationPoint(-6F, 35F, -7.5F);

        atgrenadeModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[37].setRotationPoint(-8F, 35F, -5.5F);

        atgrenadeModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 89
        atgrenadeModel[38].setRotationPoint(2F, 35F, 7.5F);

        atgrenadeModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 89
        atgrenadeModel[39].setRotationPoint(7F, 35F, 2.5F);

        atgrenadeModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 89
        atgrenadeModel[40].setRotationPoint(-6F, 35F, 7.5F);

        atgrenadeModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, 0F); // Box 89
        atgrenadeModel[41].setRotationPoint(-8F, 35F, 2.5F);

        atgrenadeModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 67
        atgrenadeModel[42].setRotationPoint(-2F, -53F, -5.5F);

        atgrenadeModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F); // Box 72
        atgrenadeModel[43].setRotationPoint(-5F, -53F, -5.5F);

        atgrenadeModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F); // Box 73
        atgrenadeModel[44].setRotationPoint(-7F, -53F, -3.5F);

        atgrenadeModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 1F, 0F, -2F); // Box 72
        atgrenadeModel[45].setRotationPoint(2F, -53F, -5.5F);

        atgrenadeModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -1F); // Box 73
        atgrenadeModel[46].setRotationPoint(5F, -53F, -3.5F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.2F, 0.2F, 0.2F);

        for (int i = 0; i < 47; i++) {
            atgrenadeModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}