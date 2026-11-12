package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM240 extends ModelGun {
    private static final float PACK_UNIT = 1F / (16F * 1.2F);

    public ModelM240() {
        gunModel = loadPart("");
        ammoModel = loadPart("_magazine");
        defaultBarrelModel = loadPart("_muzzle");

        scopeAttachPoint = point(-0.35F, 7.93F, 0F);
        barrelAttachPoint = point(16.974F, 6.7075F, 0F);
        gripAttachPoint = point(9.3F, 4.99F, 0F);
        gadgetAttachPoint = point(9.65F, 5.91F, 0.58F);
        accessoryAttachPoint = point(9.65F, 5.91F, -0.58F);
        muzzleFlashPoint = new Vector3f(barrelAttachPoint);
        defaultBarrelFlashPoint = point(18.025F - 16.974F, 0F, 0F);

        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0F, -0.625F, -0.05F);
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;

        hasArms = true;
        rightArmPos = new Vector3f(0.0385F, -0.6536F, 0.0766F);
        rightArmRot = new Vector3f(6F, 12F, -72F);
        rightArmScale = new Vector3f(0.67F, 0.72F, 0.70F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(rightArmRot);
        leftArmPos = new Vector3f(-0.013F, -0.257F, -0.170F);
        leftArmRot = new Vector3f(73F, 60F, -2F);
        leftArmScale = new Vector3f(0.75F, 1.05F, 0.75F);
        leftArmReloadPos = new Vector3f(-0.105F, -0.717F, -0.227F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2F, 0F, 0.2F);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        thirdPersonOffset = new Vector3f(0F, -0.12F, 0F);
        mirrorThirdPerson = false;
        firstPersonOffset = new Vector3f(0.14F, -0.04F, 0F);
        zoomOffset = -0.135F;
        zoomOffsetY = -0.11F;
        // Pull the bare sights closer along the calibrated view ray.
        ironSightOffset = new Vector3f(-0.281839F, 0.053143F, 0.000921F);
        ironSightPitch = 0.476025F;
        ironSightYaw = -0.018931F;
        closeBareAdsProjection = true;
    }

    private static Vector3f point(float x, float y, float z) {
        return new Vector3f(x * PACK_UNIT, y * PACK_UNIT, z * PACK_UNIT);
    }

    private ModelRendererTurbo[] loadPart(String suffix) {
        ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, 128, 128);
        part.addObj("/BFMCpack/M240" + suffix + ".obj");
        // Restore the Y-up coordinates used by the exporter.
        part.rotateAngleX = (float) (Math.PI / 2);
        return new ModelRendererTurbo[] {part};
    }
}
