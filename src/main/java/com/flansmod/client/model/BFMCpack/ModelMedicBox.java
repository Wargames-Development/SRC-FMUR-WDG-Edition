//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MedicBox
// Model Creator:
// Created on:29.04.2022 - 21:45:37
// Last changed on: 29.04.2022 - 21:45:37

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelMedicBox extends ModelBase {
    public ModelRendererTurbo medicboxModel[];
    int textureX = 128;
    int textureY = 128;

    public ModelMedicBox() {
        medicboxModel = new ModelRendererTurbo[41];
        medicboxModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        medicboxModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
        medicboxModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
        medicboxModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
        medicboxModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
        medicboxModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
        medicboxModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 0
        medicboxModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 0
        medicboxModel[8] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 0
        medicboxModel[9] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
        medicboxModel[10] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 0
        medicboxModel[11] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 0
        medicboxModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
        medicboxModel[13] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
        medicboxModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
        medicboxModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
        medicboxModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
        medicboxModel[17] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 15
        medicboxModel[18] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 15
        medicboxModel[19] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 15
        medicboxModel[20] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
        medicboxModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
        medicboxModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
        medicboxModel[23] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 15
        medicboxModel[24] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 15
        medicboxModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
        medicboxModel[26] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 15
        medicboxModel[27] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 27
        medicboxModel[28] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 27
        medicboxModel[29] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 27
        medicboxModel[30] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 27
        medicboxModel[31] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 27
        medicboxModel[32] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 27
        medicboxModel[33] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 27
        medicboxModel[34] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 34
        medicboxModel[35] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 34
        medicboxModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 34
        medicboxModel[37] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 34
        medicboxModel[38] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 34
        medicboxModel[39] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 34
        medicboxModel[40] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 40

        medicboxModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, -0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        medicboxModel[0].setRotationPoint(0F, 0F, -3F);

        medicboxModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, -0.5F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        medicboxModel[1].setRotationPoint(-7F, 0F, -3F);

        medicboxModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        medicboxModel[2].setRotationPoint(-7F, 1F, -3F);

        medicboxModel[3].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        medicboxModel[3].setRotationPoint(-7F, 5F, -3F);

        medicboxModel[4].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 0
        medicboxModel[4].setRotationPoint(-6F, 6F, -3F);

        medicboxModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.8F); // Box 0
        medicboxModel[5].setRotationPoint(-8F, 1F, -3F);

        medicboxModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F); // Box 0
        medicboxModel[6].setRotationPoint(-8F, 5F, -3F);

        medicboxModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F); // Box 0
        medicboxModel[7].setRotationPoint(-7F, 6F, -3F);

        medicboxModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -1F, -0.8F); // Box 0
        medicboxModel[8].setRotationPoint(-8F, 6F, -3F);

        medicboxModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.8F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
        medicboxModel[9].setRotationPoint(-8F, 0F, -3F);

        medicboxModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, 0F, 0F, 0F); // Box 0
        medicboxModel[10].setRotationPoint(7F, 1F, -3F);

        medicboxModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, 0F, 0F, 0F); // Box 0
        medicboxModel[11].setRotationPoint(7F, 5F, -3F);

        medicboxModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F); // Box 0
        medicboxModel[12].setRotationPoint(6F, 6F, -3F);

        medicboxModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, 0F, -0.2F, -0.4F); // Box 0
        medicboxModel[13].setRotationPoint(7F, 6F, -3F);

        medicboxModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0F, -0.5F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0F, 0F, 0F); // Box 0
        medicboxModel[14].setRotationPoint(7F, 0F, -3F);

        medicboxModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 15
        medicboxModel[15].setRotationPoint(4F, 5.5F, 3F);

        medicboxModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
        medicboxModel[16].setRotationPoint(4F, 3.5F, 3F);

        medicboxModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
        medicboxModel[17].setRotationPoint(4F, 1.5F, 3F);

        medicboxModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 15
        medicboxModel[18].setRotationPoint(-5F, 5.5F, 3F);

        medicboxModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
        medicboxModel[19].setRotationPoint(-5F, 3.5F, 3F);

        medicboxModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
        medicboxModel[20].setRotationPoint(-5F, 1.5F, 3F);

        medicboxModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
        medicboxModel[21].setRotationPoint(4F, 5.5F, -4F);

        medicboxModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        medicboxModel[22].setRotationPoint(4F, 3.5F, -4F);

        medicboxModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        medicboxModel[23].setRotationPoint(4F, 1.5F, -4F);

        medicboxModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
        medicboxModel[24].setRotationPoint(-5F, 5.5F, -4F);

        medicboxModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        medicboxModel[25].setRotationPoint(-5F, 3.5F, -4F);

        medicboxModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        medicboxModel[26].setRotationPoint(-5F, 1.5F, -4F);

        medicboxModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F); // Box 27
        medicboxModel[27].setRotationPoint(-0.5F, 6F, 2.5F);

        medicboxModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 27
        medicboxModel[28].setRotationPoint(-0.5F, 5F, 2.5F);

        medicboxModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F); // Box 27
        medicboxModel[29].setRotationPoint(-0.5F, 7F, 2.5F);

        medicboxModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F); // Box 27
        medicboxModel[30].setRotationPoint(-0.5F, 7F, -2.9F);

        medicboxModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 27
        medicboxModel[31].setRotationPoint(-0.5F, 6F, -3.5F);

        medicboxModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        medicboxModel[32].setRotationPoint(-0.5F, 5F, -3.5F);

        medicboxModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 27
        medicboxModel[33].setRotationPoint(-0.5F, 7F, -3.5F);

        medicboxModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, -0.3F, 1F, -0.3F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, -0.3F, -1F, -0.3F); // Box 34
        medicboxModel[34].setRotationPoint(-10F, 3F, 2F);

        medicboxModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, -0.3F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, -1F, -0.4F); // Box 34
        medicboxModel[35].setRotationPoint(-10F, 3F, -3F);

        medicboxModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 1F, 0F, -0.7F, 0.9F, 0F, -0.7F, 0.9F, -0.2F, 0F, 1F, -0.2F, 0F, -1F, 0F, -0.7F, -0.9F, 0F, -0.7F, -0.9F, -0.2F, 0F, -1F, -0.2F); // Box 34
        medicboxModel[36].setRotationPoint(-10F, 3F, -2.4F);

        medicboxModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, -0.3F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, -0.3F, -1F, -0.3F, 0F, 0F, -0.3F); // Box 34
        medicboxModel[37].setRotationPoint(7F, 3F, 2F);

        medicboxModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.3F, -0.3F, 1F, -0.3F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, -0.3F, -1F, -0.3F, 0F, -1F, -0.4F, 0F, 0F, -0.4F); // Box 34
        medicboxModel[38].setRotationPoint(7F, 3F, -3F);

        medicboxModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.7F, 0.9F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, -0.7F, 0.9F, -0.2F, -0.7F, -0.9F, 0F, 0F, -1F, 0F, 0F, -1F, -0.2F, -0.7F, -0.9F, -0.2F); // Box 34
        medicboxModel[39].setRotationPoint(9F, 3F, -2.4F);

        medicboxModel[40].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, -0.99F, -2F, -2F, -0.99F, -2F, -2F, -0.99F, -2F, -2F, -0.99F, -2F); // Box 40
        medicboxModel[40].setRotationPoint(0F, 7F, -4.3F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.7F, 0.7F, 0.7F);

        for (int i = 0; i < 41; i++) {
            medicboxModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}