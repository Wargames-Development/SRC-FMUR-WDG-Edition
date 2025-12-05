//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:03.08.2022 - 16:36:13
// Last changed on: 03.08.2022 - 16:36:13

package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelM18ClayMore extends ModelBase {
    public ModelRendererTurbo m18claymoreModel[];
    int textureX = 256;
    int textureY = 512;

    public ModelM18ClayMore() {
        m18claymoreModel = new ModelRendererTurbo[26];
        m18claymoreModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        m18claymoreModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        m18claymoreModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
        m18claymoreModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
        m18claymoreModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
        m18claymoreModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 0
        m18claymoreModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
        m18claymoreModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
        m18claymoreModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
        m18claymoreModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
        m18claymoreModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
        m18claymoreModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
        m18claymoreModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 15
        m18claymoreModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
        m18claymoreModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 15
        m18claymoreModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
        m18claymoreModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
        m18claymoreModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 0
        m18claymoreModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
        m18claymoreModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
        m18claymoreModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 25
        m18claymoreModel[21] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 25
        m18claymoreModel[22] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
        m18claymoreModel[23] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 25
        m18claymoreModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
        m18claymoreModel[25] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 29

        m18claymoreModel[0].addBox(0F, 0F, 0F, 4, 10, 18, 0F); // Box 0
        m18claymoreModel[0].setRotationPoint(-2F, 5.5F, -9F);

        m18claymoreModel[1].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
        m18claymoreModel[1].setRotationPoint(-2F, 5.5F, 9F);

        m18claymoreModel[2].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        m18claymoreModel[2].setRotationPoint(-2F, 5.5F, -10F);

        m18claymoreModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -0.2F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, -1F); // Box 0
        m18claymoreModel[3].setRotationPoint(-3F, 14.5F, -9F);

        m18claymoreModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, -0.2F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, -1F, -0.2F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.5F, -0.5F); // Box 0
        m18claymoreModel[4].setRotationPoint(-3F, 5.5F, -9F);

        m18claymoreModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, 0F, 0F, 0F); // Box 0
        m18claymoreModel[5].setRotationPoint(2F, 14.5F, -9F);

        m18claymoreModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, 0F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, 0F, 0.5F, 0F); // Box 0
        m18claymoreModel[6].setRotationPoint(2F, 5.5F, -9F);

        m18claymoreModel[7].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 0
        m18claymoreModel[7].setRotationPoint(-1.5F, 15.5F, -4F);

        m18claymoreModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        m18claymoreModel[8].setRotationPoint(-1.5F, 16.5F, 1F);

        m18claymoreModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
        m18claymoreModel[9].setRotationPoint(-1.5F, 16.5F, -4F);

        m18claymoreModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
        m18claymoreModel[10].setRotationPoint(-0.5F, 17F, 2.75F);

        m18claymoreModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        m18claymoreModel[11].setRotationPoint(-0.5F, 16F, 4.25F);

        m18claymoreModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        m18claymoreModel[12].setRotationPoint(-0.5F, 16F, 2.25F);

        m18claymoreModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
        m18claymoreModel[13].setRotationPoint(-0.5F, 17F, -6.25F);

        m18claymoreModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        m18claymoreModel[14].setRotationPoint(-0.5F, 16F, -4.75F);

        m18claymoreModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        m18claymoreModel[15].setRotationPoint(-0.5F, 16F, -6.75F);

        m18claymoreModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
        m18claymoreModel[16].setRotationPoint(-2.5F, 15.5F, -1F);

        m18claymoreModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
        m18claymoreModel[17].setRotationPoint(1F, 15.5F, -1F);

        m18claymoreModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
        m18claymoreModel[18].setRotationPoint(-2F, 16.5F, 0F);

        m18claymoreModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F); // Box 0
        m18claymoreModel[19].setRotationPoint(-2F, 16.5F, -1F);

        m18claymoreModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        m18claymoreModel[20].setRotationPoint(-1F, -0.5F, 6F);

        m18claymoreModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        m18claymoreModel[21].setRotationPoint(0F, -0.5F, 6F);

        m18claymoreModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        m18claymoreModel[22].setRotationPoint(-1F, -0.5F, -7F);

        m18claymoreModel[23].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        m18claymoreModel[23].setRotationPoint(0F, -0.5F, -7F);

        m18claymoreModel[24].addShapeBox(0F, 0F, 0F, 1, 100, 100, 0F, -0.9F, -42F, -42F, 0F, -42F, -42F, 0F, -42F, -42F, -0.9F, -42F, -42F, -0.9F, -42F, -42F, 0F, -42F, -42F, 0F, -42F, -42F, -0.9F, -42F, -42F); // Box 29
        m18claymoreModel[24].setRotationPoint(-3F, -39.75F, -49F);

        m18claymoreModel[25].addShapeBox(0F, 0F, 0F, 1, 100, 100, 0F, 0F, -42F, -42F, -0.9F, -42F, -42F, -0.9F, -42F, -42F, 0F, -42F, -42F, 0F, -42F, -42F, -0.9F, -42F, -42F, -0.9F, -42F, -42F, 0F, -42F, -42F); // Box 29
        m18claymoreModel[25].setRotationPoint(2F, -40F, -50F);


    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GL11.glScalef(0.4F, 0.4F, 0.4F);

        for (int i = 0; i < 26; i++) {
            m18claymoreModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}