package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBallisticShield extends ModelGun {
    public ModelBallisticShield() {
        int textureX = 64;
        int textureY = 64;
        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addBox(4.0F, -20.0F, -8.0F, 1, 32, 16);
        translateAll(0F, 2F, -6F);
    }
}
