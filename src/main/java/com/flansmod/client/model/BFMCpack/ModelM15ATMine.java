//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LandMine
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelM15ATMine extends ModelBase {
    public ModelRendererTurbo m15atmineModel[];
    int textureX = 64;
    int textureY = 64;

    public ModelM15ATMine() {
        m15atmineModel = new ModelRendererTurbo[13];
        m15atmineModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        m15atmineModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        m15atmineModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        m15atmineModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        m15atmineModel[4] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import
        m15atmineModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        m15atmineModel[6] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import
        m15atmineModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import
        m15atmineModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import
        m15atmineModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import
        m15atmineModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import
        m15atmineModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import
        m15atmineModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import

        m15atmineModel[0].addShapeBox(-7F, 0F, -4F, 14, 2, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        m15atmineModel[0].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[0].rotateAngleZ = 3.1415927F;

        m15atmineModel[1].addShapeBox(-7F, 0F, -7F, 14, 2, 3, 0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        m15atmineModel[1].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[1].rotateAngleZ = 3.1415927F;

        m15atmineModel[2].addShapeBox(-7F, 0F, 4F, 14, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F); // Import
        m15atmineModel[2].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[2].rotateAngleZ = 3.1415927F;

        m15atmineModel[3].addShapeBox(-6F, -0.5F, -3F, 12, 1, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        m15atmineModel[3].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[3].rotateAngleZ = 3.1415927F;

        m15atmineModel[4].addShapeBox(-6F, -0.5F, 3F, 12, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F); // Import
        m15atmineModel[4].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[4].rotateAngleZ = 3.1415927F;

        m15atmineModel[5].addShapeBox(-5F, -1F, -2F, 10, 1, 4, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        m15atmineModel[5].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[5].rotateAngleZ = 3.1415927F;

        m15atmineModel[6].addShapeBox(-5F, -1F, -5F, 10, 1, 3, 0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        m15atmineModel[6].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[6].rotateAngleZ = 3.1415927F;

        m15atmineModel[7].addShapeBox(-5F, -1F, 2F, 10, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F); // Import
        m15atmineModel[7].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[7].rotateAngleZ = 3.1415927F;

        m15atmineModel[8].addShapeBox(-6F, -0.5F, -6F, 12, 1, 3, 0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        m15atmineModel[8].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[8].rotateAngleZ = 3.1415927F;

        m15atmineModel[9].addShapeBox(-9.5F, 0.5F, -5F, 4, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        m15atmineModel[9].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[9].rotateAngleZ = 3.1415927F;

        m15atmineModel[10].addShapeBox(-9.5F, 0.5F, 4F, 4, 1, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import
        m15atmineModel[10].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[10].rotateAngleZ = 3.1415927F;

        m15atmineModel[11].addShapeBox(-10.5F, -0.5F, -5F, 1, 1, 10, 0F, 0.0F, 0.3F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, -1.0F); // Import
        m15atmineModel[11].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[11].rotateAngleZ = 3.1415927F;

        m15atmineModel[12].addShapeBox(-1F, -2.25F, -1F, 2, 2, 2, 0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        m15atmineModel[12].setRotationPoint(0F, 2F, 0F);
        m15atmineModel[12].rotateAngleZ = 3.1415927F;


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 13; i++) {
            m15atmineModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}