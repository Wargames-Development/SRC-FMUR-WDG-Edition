//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M2SLAM
// Model Creator:
// Created on:30.04.2022 - 11:00:12
// Last changed on: 30.04.2022 - 11:00:12

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelM2SLAM extends ModelBase {
    public ModelRendererTurbo m2slamModel[];
    int textureX = 256;
    int textureY = 256;

    public ModelM2SLAM() {
        m2slamModel = new ModelRendererTurbo[39];
        m2slamModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
        m2slamModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 116
        m2slamModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 116
        m2slamModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 116
        m2slamModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 116
        m2slamModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 116
        m2slamModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 116
        m2slamModel[7] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 116
        m2slamModel[8] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 116
        m2slamModel[9] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 116
        m2slamModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 116
        m2slamModel[11] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 116
        m2slamModel[12] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 116
        m2slamModel[13] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 116
        m2slamModel[14] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 116
        m2slamModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
        m2slamModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 139
        m2slamModel[17] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 139
        m2slamModel[18] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 116
        m2slamModel[19] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 116
        m2slamModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 116
        m2slamModel[21] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 145
        m2slamModel[22] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 146
        m2slamModel[23] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 146
        m2slamModel[24] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 146
        m2slamModel[25] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 146
        m2slamModel[26] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 146
        m2slamModel[27] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 146
        m2slamModel[28] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 146
        m2slamModel[29] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 146
        m2slamModel[30] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 146
        m2slamModel[31] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 146
        m2slamModel[32] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 116
        m2slamModel[33] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 116
        m2slamModel[34] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 116
        m2slamModel[35] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 116
        m2slamModel[36] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 116
        m2slamModel[37] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 37
        m2slamModel[38] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 37

        m2slamModel[0].addShapeBox(0F, 0F, 0F, 2, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[0].setRotationPoint(-11F, -8F, -8F);

        m2slamModel[1].addShapeBox(0F, 0F, 0F, 1, 14, 16, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 116
        m2slamModel[1].setRotationPoint(-12F, -8F, -8F);

        m2slamModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[2].setRotationPoint(-11F, 2F, -8F);

        m2slamModel[3].addShapeBox(0F, 0F, 0F, 1, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[3].setRotationPoint(-5F, -8F, -8F);

        m2slamModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F, 0.2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 116
        m2slamModel[4].setRotationPoint(-6F, 3F, -8F);

        m2slamModel[5].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[5].setRotationPoint(-4F, -8F, -8F);

        m2slamModel[6].addShapeBox(0F, 0F, 0F, 4, 10, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[6].setRotationPoint(-9F, -7F, -7.5F);

        m2slamModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 116
        m2slamModel[7].setRotationPoint(-9F, 3F, -7.5F);

        m2slamModel[8].addShapeBox(0F, 0F, 0F, 6, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
        m2slamModel[8].setRotationPoint(-4F, -4F, -8F);

        m2slamModel[9].addShapeBox(0F, 0F, 0F, 2, 10, 16, 0F, 0F, 0F, -5.528F, 0.906F, 0F, -1.528F, 0.906F, 0F, -1.528F, 0F, 0F, -5.528F, 0F, 0F, -5.528F, 0.906F, 0F, -1.528F, 0.906F, 0F, -1.528F, 0F, 0F, -5.528F); // Box 116
        m2slamModel[9].setRotationPoint(-4F, -4F, -8F);

        m2slamModel[10].addShapeBox(0F, 0F, 0F, 4, 10, 16, 0F, 0.094F, 0F, -1.528F, 0.608F, 0F, 0F, 0.608F, 0F, 0F, 0.094F, 0F, -1.528F, 0.094F, 0F, -1.528F, 0.608F, 0F, 0F, 0.608F, 0F, 0F, 0.094F, 0F, -1.528F); // Box 116
        m2slamModel[10].setRotationPoint(-1F, -4F, -8F);

        m2slamModel[11].addShapeBox(0F, 0F, 0F, 2, 10, 16, 0F, 0.906F, 0F, -1.528F, 0F, 0F, -5.528F, 0F, 0F, -5.528F, 0.906F, 0F, -1.528F, 0.906F, 0F, -1.528F, 0F, 0F, -5.528F, 0F, 0F, -5.528F, 0.906F, 0F, -1.528F); // Box 116
        m2slamModel[11].setRotationPoint(9.22F, -4F, -8F);

        m2slamModel[12].addShapeBox(0F, 0F, 0F, 4, 10, 16, 0F, 0.608F, 0F, 0F, 0.094F, 0F, -1.528F, 0.094F, 0F, -1.528F, 0.608F, 0F, 0F, 0.608F, 0F, 0F, 0.094F, 0F, -1.528F, 0.094F, 0F, -1.528F, 0.608F, 0F, 0F); // Box 116
        m2slamModel[12].setRotationPoint(4.22F, -4F, -8F);

        m2slamModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0.906F, 0F, -1.528F, 0F, 0F, -5.528F, 0F, 0F, -5.528F, 0.906F, 0F, -1.528F, 0.906F, 0F, -1.528F, 0F, 0F, -5.528F, 0F, 0F, -5.528F, 0.906F, 0F, -1.528F); // Box 116
        m2slamModel[13].setRotationPoint(9.22F, -8F, -8F);

        m2slamModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 16, 0F, 0.608F, 0F, 0F, 0.094F, 0F, -1.528F, 0.094F, 0F, -1.528F, 0.608F, 0F, 0F, 0.608F, 0F, 0F, 0.094F, 0F, -1.528F, 0.094F, 0F, -1.528F, 0.608F, 0F, 0F); // Box 116
        m2slamModel[14].setRotationPoint(4.22F, -8F, -8F);

        m2slamModel[15].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 116
        m2slamModel[15].setRotationPoint(10F, -4F, -3F);

        m2slamModel[16].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, 0F); // Box 139
        m2slamModel[16].setRotationPoint(12F, -4F, -0.399999999999999F);

        m2slamModel[17].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.6F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.7F, -0.4F, -0.2F, -0.1F, 0F, -0.2F, 0F); // Box 139
        m2slamModel[17].setRotationPoint(12F, -4F, -1.1F);

        m2slamModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[18].setRotationPoint(-9F, -8F, -8F);

        m2slamModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[19].setRotationPoint(-5F, 2F, -8F);

        m2slamModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[20].setRotationPoint(-9F, 3F, -8F);

        m2slamModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 145
        m2slamModel[21].setRotationPoint(-6F, 6F, -1.5F);

        m2slamModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        m2slamModel[22].setRotationPoint(-8.5F, -7F, -8F);

        m2slamModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 146
        m2slamModel[23].setRotationPoint(-8.5F, -5F, -8F);

        m2slamModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        m2slamModel[24].setRotationPoint(-6.5F, -6F, -8F);

        m2slamModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        m2slamModel[25].setRotationPoint(-8.5F, -6F, -8F);

        m2slamModel[26].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 146
        m2slamModel[26].setRotationPoint(-6.5F, -4.5F, -8F);

        m2slamModel[27].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 146
        m2slamModel[27].setRotationPoint(-8.5F, -4.5F, -8F);

        m2slamModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        m2slamModel[28].setRotationPoint(-7.5F, 1.5F, -8F);

        m2slamModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.7F, -0.9F, 0F); // Box 146
        m2slamModel[29].setRotationPoint(-7.5F, 2.5F, -8F);

        m2slamModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.7F, -0.9F, 0F); // Box 146
        m2slamModel[30].setRotationPoint(-8.2F, 2.5F, -8F);

        m2slamModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 146
        m2slamModel[31].setRotationPoint(-7.85F, 4.5F, -8F);

        m2slamModel[32].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 116
        m2slamModel[32].setRotationPoint(10F, -4F, 1F);

        m2slamModel[33].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 116
        m2slamModel[33].setRotationPoint(10F, -4F, -1F);

        m2slamModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[34].setRotationPoint(-9F, 3F, 5F);

        m2slamModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0.2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 116
        m2slamModel[35].setRotationPoint(-6F, 3F, 5F);

        m2slamModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        m2slamModel[36].setRotationPoint(-5F, 2F, 5F);

        m2slamModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 37
        m2slamModel[37].setRotationPoint(-8.5F, 5F, -6F);

        m2slamModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 37
        m2slamModel[38].setRotationPoint(-8.5F, 5F, 5.2F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.3F, 0.3F, 0.3F);

        for (int i = 0; i < 39; i++) {
            m2slamModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}