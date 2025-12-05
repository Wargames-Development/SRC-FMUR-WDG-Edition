package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCOP357 extends ModelGun {
    int textureX = 128;

    int textureY = 128;

    public ModelCOP357() {

        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/COP357/COP357_gun.obj");
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        breakActionModel = new ModelRendererTurbo[1];
        breakActionModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        breakActionModel[0].addObj("/BFMCpack/COP357/COP357_break_action.obj");
        breakActionModel[0].setRotationPoint(0F, 0F, 0F);

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/COP357/COP357_ammo.obj");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);

        animationType = EnumAnimationType.BREAK_ACTION;
        barrelBreakPoint = new Vector3f(47.89/16f, 41.56/16f, 0.0F);

        translateAll(0.0F, 0.0F, 0.0F);
        hasArms = true;
        rightArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmPos = new Vector3f(-0.2F, -0.65F, -0.16F);
        leftArmRot = new Vector3f(80.0F, 35.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.2F, -0.65F, -0.16F);
        leftArmReloadRot = new Vector3f(80.0F, 35.0F, 0.0F);
        rightArmPos = new Vector3f(0.15F, -0.8F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.15F, -0.8F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightHandAmmo = false;
        leftHandAmmo = true;

        flashScale = 0.3F;
        muzzleFlashPoint = new Vector3f(1.6F, 1.2F, 0.0F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0.0F, 0.0F, 45.0F);
        crouchZoom = -0.1F;
        thirdPersonOffset = new Vector3f(-0.1F, -0.16F, 0.0F);

        zoomOffsetY = 0.025F;
        zoomOffset = -0.1F;
        gunOffset = -1F;
        gunOffsetX = -1F;
    }
}
