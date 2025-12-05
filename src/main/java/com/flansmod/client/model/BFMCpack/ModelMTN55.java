//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MTN55
// Model Creator:
// Created on:30.04.2022 - 11:00:12
// Last changed on: 30.04.2022 - 11:00:12

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelMTN55 extends ModelBase {
    public ModelRendererTurbo mtn55Model[];
    int textureX = 128;
    int textureY = 128;

    public ModelMTN55() {
        mtn55Model = new ModelRendererTurbo[9];
        mtn55Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
        mtn55Model[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 116
        mtn55Model[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 116
        mtn55Model[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 116
        mtn55Model[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 116
        mtn55Model[5] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 116
        mtn55Model[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 116
        mtn55Model[7] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 116
        mtn55Model[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 116

        mtn55Model[0].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        mtn55Model[0].setRotationPoint(-9F, -3F, -3F);

        mtn55Model[1].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        mtn55Model[1].setRotationPoint(-9F, -9F, -3F);

        mtn55Model[2].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 116
        mtn55Model[2].setRotationPoint(-9F, 3F, -3F);

        mtn55Model[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 116
        mtn55Model[3].setRotationPoint(-9F, -3F, 3F);

        mtn55Model[4].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        mtn55Model[4].setRotationPoint(-9F, -3F, -9F);

        mtn55Model[5].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, -6F, 0F, -5.99F, -6F, 0F, -5.99F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        mtn55Model[5].setRotationPoint(-9F, -9F, -9F);

        mtn55Model[6].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5.99F, -6F, 0F, -5.99F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 116
        mtn55Model[6].setRotationPoint(-9F, -9F, 3F);

        mtn55Model[7].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5.99F, -6F, 0F, -5.99F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 116
        mtn55Model[7].setRotationPoint(-9F, 3F, -9F);

        mtn55Model[8].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5.99F, -6F, 0F, -5.99F); // Box 116
        mtn55Model[8].setRotationPoint(-9F, 3F, 3F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.25F, 0.25F, 0.25F);

        for (int i = 0; i < 9; i++) {
            mtn55Model[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}