package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAK308 extends ModelGun {
    private static final float PACK_UNIT = 1F / (16F * 1.15F);

    public ModelAK308() {
        gunModel = loadPart("");
        ammoModel = loadPart("_magazine");
        slideModel = loadPart("_bolt");
        defaultBarrelModel = loadPart("_brake");
        defaultScopeModel = loadPart("_rear");
        defaultStockModel = loadPart("_stock");
        gunSlideDistance = 0.061F;

        scopeAttachPoint = point(0.48F, 6.836F, 0F);
        barrelAttachPoint = point(12.116F, 5.664F, 0F);
        stockAttachPoint = point(-4.97F, 5.15F, 0F);
        gripAttachPoint = point(4.76F, 4.75F, 0F);
        gadgetAttachPoint = point(5.19F, 5.79F, 0.93F);
        accessoryAttachPoint = point(5.19F, 5.79F, -0.93F);
        muzzleFlashPoint = new Vector3f(barrelAttachPoint);
        defaultBarrelFlashPoint = point(14.43F - 12.116F, 0F, 0F);

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2F, 0F, 0.2F);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        mirrorThirdPerson = false;
        thirdPersonOffset = new Vector3f(0F, -0.12F, 0F);

        hasArms = true;
        rightArmPos = new Vector3f(0.020F, -0.664F, -0.042F);
        rightArmRot = new Vector3f(-3F, 23F, -69F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(rightArmRot);
        rightArmScale = new Vector3f(0.67F, 0.72F, 0.70F);
        leftArmPos = new Vector3f(-0.055F, -0.409F, -0.191F);
        leftArmRot = new Vector3f(73F, 60F, -2F);
        leftArmScale = new Vector3f(0.75F, 1.05F, 0.75F);

        firstPersonOffset = new Vector3f(-0.02F, -0.075F, 0F);
        zoomOffset = -0.235F;
        // Pull the bare sights closer along the calibrated view ray.
        ironSightOffset = new Vector3f(-0.209336F, 0.031723F, 0.000924F);
        ironSightPitch = 1.120344F;
        ironSightYaw = -0.018931F;
        closeBareAdsProjection = true;
    }

    private static Vector3f point(float x, float y, float z) {
        return new Vector3f(x * PACK_UNIT, y * PACK_UNIT, z * PACK_UNIT);
    }

    private ModelRendererTurbo[] loadPart(String suffix) {
        ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, 256, 256);
        part.addObj("/BFMCpack/AK308" + suffix + ".obj");
        // Undo the legacy OBJ loader's rotation of the authored Y-up geometry.
        part.rotateAngleX = (float) (Math.PI / 2);
        return new ModelRendererTurbo[] {part};
    }
}
