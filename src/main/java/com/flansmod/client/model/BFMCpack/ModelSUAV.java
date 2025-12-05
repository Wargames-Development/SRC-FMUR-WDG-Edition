//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:26.06.2023 - 10:30:11
// Last changed on: 26.06.2023 - 10:30:11

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelSUAV extends ModelBase {
    public ModelRendererTurbo suavModel[];
    int textureX = 64;
    int textureY = 64;

    public ModelSUAV() {
        suavModel = new ModelRendererTurbo[18];
        suavModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        suavModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
        suavModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
        suavModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
        suavModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
        suavModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
        suavModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 6
        suavModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 7
        suavModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 8
        suavModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 9
        suavModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
        suavModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 11
        suavModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
        suavModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 13
        suavModel[14] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 13
        suavModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6
        suavModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 6
        suavModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 6

        suavModel[0].addShapeBox(11F, -1F, -0.5F, 14, 1, 1, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F); // Box 0
        suavModel[0].setRotationPoint(0F, 0F, 0F);
        suavModel[0].rotateAngleX = 1.57079633F;
        suavModel[0].rotateAngleZ = -1.57079633F;

        suavModel[1].addShapeBox(23F, -2F, -0.5F, 1, 1, 1, 0F, -0.2F, 2.8F, -0.4F, 1.4F, 2.8F, -0.4F, 1.4F, 2.8F, -0.4F, -0.2F, 2.8F, -0.4F, 1.5F, 0F, -0.25F, 1.4F, 0F, -0.25F, 1.4F, 0F, -0.25F, 1.5F, 0F, -0.25F); // Box 9
        suavModel[1].setRotationPoint(0F, 0F, 0F);
        suavModel[1].rotateAngleX = 1.57079633F;
        suavModel[1].rotateAngleZ = -1.57079633F;

        suavModel[2].addShapeBox(25F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.3F, 7F, 1F, -0.3F, 7F, 1F, -0.3F, 7F, 0F, -0.3F, 7F, 0F, -0.3F, 7F, 1F, -0.3F, 7F, 1F, -0.3F, 7F, 0F, -0.3F, 7F); // Box 10
        suavModel[2].setRotationPoint(0F, 0F, 0F);
        suavModel[2].rotateAngleX = 1.57079633F;
        suavModel[2].rotateAngleZ = -1.57079633F;

        suavModel[3].addShapeBox(27F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.3F, 7F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, -0.5F, 0F, -0.3F, 7F, 0F, -0.3F, 7F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, -0.5F, 0F, -0.3F, 7F); // Box 11
        suavModel[3].setRotationPoint(0F, 0F, 0F);
        suavModel[3].rotateAngleX = 1.57079633F;
        suavModel[3].rotateAngleZ = -1.57079633F;

        suavModel[4].addShapeBox(7.2F, -4F, -0.5F, 4, 4, 1, 0F, 0F, 0F, 0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.7F); // Box 4
        suavModel[4].setRotationPoint(0F, 0F, 0F);
        suavModel[4].rotateAngleX = 1.57079633F;
        suavModel[4].rotateAngleZ = -1.57079633F;

        suavModel[5].addShapeBox(6.2F, -3F, -0.5F, 1, 3, 1, 0F, 0F, 0.1F, 0.85F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0.1F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.85F); // Box 5
        suavModel[5].setRotationPoint(0F, 0F, 0F);
        suavModel[5].rotateAngleX = 1.57079633F;
        suavModel[5].rotateAngleZ = -1.57079633F;

        suavModel[6].addShapeBox(3.2F, -3F, -0.5F, 3, 3, 1, 0F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.85F); // Box 6
        suavModel[6].setRotationPoint(0F, 0F, 0F);
        suavModel[6].rotateAngleX = 1.57079633F;
        suavModel[6].rotateAngleZ = -1.57079633F;

        suavModel[7].addShapeBox(10F, -4F, -0.5F, 1, 2, 1, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, 0F, -0.7F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.7F, 0.5F, 0F); // Box 7
        suavModel[7].setRotationPoint(0F, 0F, 0F);
        suavModel[7].rotateAngleX = 1.57079633F;
        suavModel[7].rotateAngleZ = -1.57079633F;

        suavModel[8].addShapeBox(10F, -1.5F, -0.5F, 1, 1, 1, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, 0F, -0.7F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 8
        suavModel[8].setRotationPoint(0F, 0F, 0F);
        suavModel[8].rotateAngleX = 1.57079633F;
        suavModel[8].rotateAngleZ = -1.57079633F;

        suavModel[9].addShapeBox(7F, -5F, -0.5F, 4, 1, 1, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, -0.5F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 9
        suavModel[9].setRotationPoint(0F, 0F, 0F);
        suavModel[9].rotateAngleX = 1.57079633F;
        suavModel[9].rotateAngleZ = -1.57079633F;

        suavModel[10].addShapeBox(7F, -5F, 8.5F, 4, 1, 13, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2.7F, 0F, 0F, -2.7F, 0F); // Box 11
        suavModel[10].setRotationPoint(0F, 0F, 0F);
        suavModel[10].rotateAngleX = 1.57079633F;
        suavModel[10].rotateAngleZ = -1.57079633F;

        suavModel[11].addShapeBox(7F, -5F, -21.5F, 4, 1, 13, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.7F, 0F, -1.5F, -2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        suavModel[11].setRotationPoint(0F, 0F, 0F);
        suavModel[11].rotateAngleX = 1.57079633F;
        suavModel[11].rotateAngleZ = -1.57079633F;

        suavModel[12].addShapeBox(4F, 0F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
        suavModel[12].setRotationPoint(0F, 0F, 0F);
        suavModel[12].rotateAngleX = 1.57079633F;
        suavModel[12].rotateAngleZ = -1.57079633F;

        suavModel[13].addShapeBox(6F, 0F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 1.7F, 0F, -0.3F, 1.7F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.2F, 1.7F, -1F, -0.2F, 1.7F, -1F, -0.2F, 0F, 0F, -0.2F); // Box 13
        suavModel[13].setRotationPoint(0F, 0F, 0F);
        suavModel[13].rotateAngleX = 1.57079633F;
        suavModel[13].rotateAngleZ = -1.57079633F;

        suavModel[14].addShapeBox(3F, 0F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F); // Box 13
        suavModel[14].setRotationPoint(0F, 0F, 0F);
        suavModel[14].rotateAngleX = 1.57079633F;
        suavModel[14].rotateAngleZ = -1.57079633F;

        suavModel[15].addShapeBox(2.2F, -3F, -0.5F, 1, 3, 1, 0F, 0F, -0.1F, 0.75F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.75F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, -0.1F, 0.75F); // Box 6
        suavModel[15].setRotationPoint(0F, 0F, 0F);
        suavModel[15].rotateAngleX = 1.57079633F;
        suavModel[15].rotateAngleZ = -1.57079633F;

        suavModel[16].addShapeBox(1.2F, -3F, -0.5F, 1, 3, 1, 0F, 0F, -0.6F, 0.5F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.75F, 0F, -0.6F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.75F, 0F, -0.3F, 0.5F); // Box 6
        suavModel[16].setRotationPoint(0F, 0F, 0F);
        suavModel[16].rotateAngleX = 1.57079633F;
        suavModel[16].rotateAngleZ = -1.57079633F;

        suavModel[17].addShapeBox(0.2F, -3F, -0.5F, 1, 3, 1, 0F, 0F, -1.5F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.7F, 0F); // Box 6
        suavModel[17].setRotationPoint(0F, 0F, 0F);
        suavModel[17].rotateAngleX = 1.57079633F;
        suavModel[17].rotateAngleZ = -1.57079633F;


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 18; i++) {
            suavModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}