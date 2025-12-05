//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CruiseMissile
// Model Creator:
// Created on:03.12.2022 - 02:02:03
// Last changed on: 03.12.2022 - 02:02:03

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelCruiseMissile extends ModelBase {
    public ModelRendererTurbo cruisemissileModel[];
    int textureX = 256;
    int textureY = 128;

    public ModelCruiseMissile() {
        cruisemissileModel = new ModelRendererTurbo[11];
        cruisemissileModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        cruisemissileModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import
        cruisemissileModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import
        cruisemissileModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import
        cruisemissileModel[4] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import
        cruisemissileModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import
        cruisemissileModel[6] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import
        cruisemissileModel[7] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import
        cruisemissileModel[8] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import
        cruisemissileModel[9] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import
        cruisemissileModel[10] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import

        cruisemissileModel[0].addShapeBox(-8F, -12F, 0F, 16, 40, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[0].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[1].addShapeBox(-8F, -20F, -2F, 16, 48, 2, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[1].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[2].addShapeBox(-38F, 12F, -1F, 30, 8, 1, 0F, 0.0F, 15.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F); // Import
        cruisemissileModel[2].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[3].addShapeBox(8F, 12F, -1F, 30, 8, 1, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[3].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[4].addShapeBox(-8F, -20F, 0F, 16, 8, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[4].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[5].addShapeBox(-8F, -22F, -2F, 16, 2, 2, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[5].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[6].addShapeBox(-8F, 28F, 0F, 16, 4, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[6].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[7].addShapeBox(-8F, 28F, -2F, 16, 4, 2, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[7].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[8].addShapeBox(-6F, 32F, 0F, 12, 6, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, -6.0F, -6.0F, 0.0F, -6.0F); // Import
        cruisemissileModel[8].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[9].addShapeBox(-6F, 32F, -2F, 12, 6, 2, 0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, -2.0F, -6.0F, 0.0F, -2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F); // Import
        cruisemissileModel[9].setRotationPoint(0F, 0F, 0F);

        cruisemissileModel[10].addShapeBox(-1F, -20F, -0.5F, 1, 8, 16, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F); // Import
        cruisemissileModel[10].setRotationPoint(0F, 0F, 0F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 11; i++) {
            cruisemissileModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}