package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSnipexAlligator extends ModelGun {

    public ModelSnipexAlligator() {
        int textureX = 64;
        int textureY = 64;

        gunModel = new ModelRendererTurbo[1];
        ammoModel = new ModelRendererTurbo[1];
        pumpModel = new ModelRendererTurbo[1];

        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        gunModel[0].addObj("/BFMCpack/SnipexAlligator.obj");
        gunModel[0].setRotationPoint(0.75F, 0.15F, 0F);

        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        ammoModel[0].addObj("/BFMCpack/SnipexAlligator_Magazine.obj");
        ammoModel[0].setRotationPoint(0.75F, 0.15F, 0F);

        pumpModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        pumpModel[0].addObj("/BFMCpack/SnipexAlligator_Bolt.obj");
        pumpModel[0].setRotationPoint(0.75F, 0.15F, 0F);

        // Blender exports height on OBJ Y, while the legacy TMT OBJ loader expects OBJ Z.
        gunModel[0].rotateAngleX = 1.5707964F;
        ammoModel[0].rotateAngleX = 1.5707964F;
        pumpModel[0].rotateAngleX = 1.5707964F;

        // Attachment points use rendered model coordinates (OBJ units divided by 16).
        barrelAttachPoint = new Vector3f(1.84F / 16F, 0.20F / 16F, 0F);
        scopeAttachPoint = new Vector3f(0.35F / 16F, 0.255F / 16F, 0F);

        pumpDelayAfterReload = 60;
        pumpDelay = 10;
        pumpTime = 18;
        pumpHandleDistance = 0.5F;

        rightHandAmmo = false;
        leftHandAmmo = true;
        rightHandBolt = true;

        leftArmPos = new Vector3f(0.17F, -0.5F, 0F);
        leftArmRot = new Vector3f(80F, 55F, 10F);
        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0F);
        leftArmScale = new Vector3f(0.75D, 1.5D, 0.75D);

        rightArmPos = new Vector3f(0.17F, -0.52F, 0F);
        rightArmRot = new Vector3f(0F, 0F, -85F);
        rightArmReloadPos = new Vector3f(0.17F, -0.52F, 0F);
        rightArmReloadRot = new Vector3f(0F, 0F, -85F);
        rightArmChargePos = new Vector3f(0F, -0.5F, 0.13F);
        rightArmChargeRot = new Vector3f(0F, 0F, -70F);
        rightArmScale = new Vector3f(0.75D, 1F, 0.75D);

        chargeHandleDistance = 0.5F;
        chargeDelay = 10;
        chargeDelayAfterReload = 80;
        chargeTime = 20;
        chargeModifier = new Vector3f(16F, 8F, 4F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0D, 0.2D);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        hasArms = true;
        hasFlash = true;
        animationType = EnumAnimationType.CUSTOM;

        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0F, -0.625F, 0F);

        zoomOffsetY = -0.1F;
        zoomOffset = 0.2F;
        crouchZoom = -0.05F;
    }
}
