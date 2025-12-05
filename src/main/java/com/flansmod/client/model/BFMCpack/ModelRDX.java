//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RDX
// Model Creator:
// Created on:21.10.2023 - 15:20:00
// Last changed on: 21.10.2023 - 15:20:00

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelRDX extends ModelBase {
    public ModelRendererTurbo rdxModel[];
    int textureX = 64;
    int textureY = 64;

    public ModelRDX() {
        rdxModel = new ModelRendererTurbo[17];
        rdxModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import
        rdxModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import
        rdxModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import
        rdxModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import
        rdxModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import
        rdxModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import
        rdxModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import
        rdxModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import
        rdxModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import
        rdxModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import
        rdxModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import
        rdxModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import
        rdxModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import
        rdxModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import
        rdxModel[14] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import
        rdxModel[15] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import
        rdxModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import

        rdxModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F); // Import
        rdxModel[0].setRotationPoint(-5F, 0.5F, 0.25F);

        rdxModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        rdxModel[1].setRotationPoint(-5F, 0F, 0.25F);

        rdxModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F, 0.0F, -0.75F, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); // Import
        rdxModel[2].setRotationPoint(-1F, 2.35F, -0.5F);

        rdxModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.35F, 0.25F, 0.0F, 0.35F, 0.25F, 0.0F, 0.1F, -1F, 0.0F, 0.1F, -1F); // Import
        rdxModel[3].setRotationPoint(-1F, 1F, -0.5F);

        rdxModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F); // Import
        rdxModel[4].setRotationPoint(-1F, 0F, -1F);

        rdxModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F); // Import
        rdxModel[5].setRotationPoint(-1F, 0F, 1F);

        rdxModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); // Import
        rdxModel[6].setRotationPoint(-1F, 0.5F, 1F);

        rdxModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        rdxModel[7].setRotationPoint(-1F, 0F, -2F);

        rdxModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F); // Import
        rdxModel[8].setRotationPoint(-1F, 0.5F, -2F);

        rdxModel[9].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import
        rdxModel[9].setRotationPoint(-5F, 1F, 0.25F);

        rdxModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F); // Import
        rdxModel[10].setRotationPoint(-5F, 0.5F, -1.25F);

        rdxModel[11].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        rdxModel[11].setRotationPoint(-5F, 0F, -1.25F);

        rdxModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import
        rdxModel[12].setRotationPoint(-5F, 1F, -1.25F);

        rdxModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F, 0.0F, 0F, 0.25F); // Import
        rdxModel[13].setRotationPoint(-5.25F, 1.9F, -0.5F);

        rdxModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.25F, 0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F); // Import
        rdxModel[14].setRotationPoint(-5.25F, 1.4F, -0.5F);

        rdxModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import
        rdxModel[15].setRotationPoint(-5.25F, 2.4F, -0.5F);

        rdxModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.35F, 0.25F, 0F, 0.35F, 0.25F); // Import
        rdxModel[16].setRotationPoint(-1F, 1F, -0.5F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 17; i++) {
            rdxModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}