package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSnipexAlligator extends ModelGun {
    // Match the existing BFMC definition's ModelScale and TMT's 1/16 render scale.
    private static final float MODEL_SCALE = 30F;
    private static final float PACK_UNIT = 1F / (16F * MODEL_SCALE);

    public ModelSnipexAlligator() {
        gunModel = loadPart("");
        ammoModel = loadPart("_Magazine");
        pumpModel = loadPart("_Bolt");
        defaultBarrelModel = loadPart("_Brake");

        barrelAttachPoint = new Vector3f(40.790F * PACK_UNIT, 6.038F * PACK_UNIT, 0F);
        scopeAttachPoint = new Vector3f(10.5F * PACK_UNIT, 7.619F * PACK_UNIT, 0F);
        // The tracer length uses a 0.05 divisor floor inside the scaled gun pass.
        flashScale = 0.05F / MODEL_SCALE;
        muzzleFlashPoint = new Vector3f(barrelAttachPoint);
        muzzleFlashPoint.scale(1F / flashScale);
        defaultBarrelFlashPoint = new Vector3f((45.664F - 40.790F) * PACK_UNIT / flashScale, 0F, 0F);
        mirrorThirdPerson = false;

        pumpDelayAfterReload = 60;
        pumpDelay = 10;
        pumpTime = 18;
        pumpHandleDistance = 4.3F * PACK_UNIT;

        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;
        leftArmPos = new Vector3f(0.246F, -0.095F, -0.038F);
        leftArmRot = new Vector3f(79F, 57F, 8F);
        leftArmReloadPos = new Vector3f(0.197F, -0.262F, -0.043F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0F);
        leftArmScale = new Vector3f(0.75F, 1.05F, 0.75F);

        rightArmPos = new Vector3f(0.105F, -0.422F, 0.110F);
        rightArmRot = new Vector3f(0F, 21F, -84F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(rightArmRot);
        rightArmScale = new Vector3f(0.75D, 1F, 0.75D);

        chargeDelay = 10;
        chargeDelayAfterReload = 80;
        chargeTime = 20;

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

        firstPersonOffset = new Vector3f(-0.065F, -0.045F, 0.115F);
        // Keep the stock below the camera in bare ADS. PiP centers the raised lens separately.
        zoomOffsetY = -0.11F;
        zoomOffsetZ = -0.115F;
        zoomOffset = -0.315F;
        crouchZoom = -0.05F;
    }

    private ModelRendererTurbo[] loadPart(String suffix) {
        ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, 512, 512);
        part.addObj("/BFMCpack/SnipexAlligator" + suffix + ".obj");
        part.setRotationPoint(0.75F, 0.15F, 0F);
        // Undo the OBJ loader's height-to-depth rotation for the authored assembly.
        part.rotateAngleX = (float) (Math.PI / 2);
        return new ModelRendererTurbo[] {part};
    }
}
