package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;


public class ModelFlag
        extends ModelGun {
    int textureX = 1024;
    int textureY = 256;


    public ModelFlag() {
        gunModel = new ModelRendererTurbo[2];
        gunModel[0] = new ModelRendererTurbo((ModelBase) this, 1, 1, textureX, textureY);
        gunModel[1] = new ModelRendererTurbo((ModelBase) this, 9, 1, textureX, textureY);

        gunModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 60, 1, 0.0F);
        gunModel[0].setRotationPoint(4.5F, -40.0F, -0.5F);
        gunModel[0].rotateAngleZ = -0.13962634F;

        gunModel[1].addShapeBox(-30.0F, 1.0F, 0.0F, 300, 170, 1, 0.0F, 0.0F, 0.0F, -0.45F, -270.0F, 0.0F, -0.45F, -270.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, -153.0F, -0.45F, -270.0F, -153.0F, -0.45F, -270.0F, -153.0F, -0.45F, 0.0F, -153.0F, -0.45F);
        gunModel[1].setRotationPoint(4.5F, -40.0F, -0.5F);
        gunModel[1].rotateAngleZ = -0.13962634F;


        translateAll(0.0F, 0.0F, 0.0F);


        flipAll();
    }
}


