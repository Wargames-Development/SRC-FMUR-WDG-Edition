package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelG84 extends ModelGun {
    public ModelG84() {

        int textureX = 512;
        int textureY = 512;

        this.gunModel = new ModelRendererTurbo[1];
        this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.gunModel[0].addObj("/BFMCpack/G84/G84_gun.obj");
        this.gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ammoModel = new ModelRendererTurbo[1];
        this.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.ammoModel[0].addObj("/BFMCpack/G84/G84_ammo.obj");
        this.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thirdPersonOffset = new Vector3f(0.0F, 0.09375F, 0.0F);
        this.hasFlash = false;
        this.hasArms = true;
        this.enableNewArm = true;
        this.leftArmPos = new Vector3f(6.0F, 0.1F, -9.5F);
        this.leftArmRot = new Vector3f(-80.0F, -45.0F, 0.0F);
        this.leftArmReloadPos = new Vector3f(-0.4F, -0.45F, -0.1F);
        this.leftArmReloadRot = new Vector3f(60.0F, 20.0F, 0.0F);
        this.rightArmPos = new Vector3f(0.2F, -0.78F, 0.05F);
        this.rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        this.rightArmReloadPos = new Vector3f(0.2F, -0.78F, 0.05F);
        this.rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        this.rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        this.leftArmScale = new Vector3f(0.75F, 1.25F, 0.75F);
        this.rightHandAmmo = false;
        this.leftHandAmmo = false;
        this.fancyStance = true;
        this.stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        this.stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        this.animationType = EnumAnimationType.BACK_LOADED;
        translateAll(-30.0F, 25.0F, 0.0F);
        this.zoomOffsetY = -0.143F;
        this.zoomOffsetZ = 0.162F;
        this.zoomOffset = 0.5F;
    }
}
