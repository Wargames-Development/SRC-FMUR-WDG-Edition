package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBarrettSSRS extends ModelGun {
    // The first- and third-person definitions both use a 1.15 model scale.
    private static final float PACK_UNIT = 1F / (16F * 1.15F);

    public ModelBarrettSSRS() {
        gunModel = loadPart("");
        ammoModel = loadPart("_magazine");
        scopeAttachPoint = point(8.40F, 6.80F, 0F);
        barrelAttachPoint = point(19.20F, 5.284F, 0F);
        muzzleFlashPoint = new Vector3f(barrelAttachPoint);
        gadgetAttachPoint = point(14.10F, 4.93F, 1.025F);
        accessoryAttachPoint = point(14.10F, 4.93F, -1.025F);
        mirrorThirdPerson = false;
        thirdPersonOffset = new Vector3f(-0.39F, -0.06F, 0F);
        itemFrameOffset = new Vector3f(-0.45F, 0F, 0F);

        hasArms = true;
        rightArmPos = new Vector3f(0.152F, -0.456F, 0.066F);
        rightArmRot = new Vector3f(0F, 14F, -84F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(rightArmRot);
        rightArmScale = new Vector3f(0.75F, 1F, 0.75F);
        leftArmPos = new Vector3f(0.128F, -0.107F, -0.073F);
        leftArmRot = new Vector3f(73F, 60F, -2F);
        leftArmReloadPos = new Vector3f(0.113F, -0.329F, -0.031F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0F);
        leftArmScale = new Vector3f(0.75F, 1.05F, 0.75F);
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;

        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 12F;
        tiltGun = 24F;
        translateGun = new Vector3f(0F, -0.025F, -0.1875F);
        translateClip = new Vector3f(0F, -0.40F, 0F);
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2F, 0F, 0.2F);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        firstPersonOffset = new Vector3f(-0.245F, -0.175F, 0.115F);
        // Recover the optic alignment at full ADS.
        zoomOffset = -0.34F;
        zoomOffsetY = 0.18F;
        zoomOffsetZ = -0.115F;
        // Shorten eye relief along the calibrated bare sight line to keep it centered.
        ironSightOffset = new Vector3f(-0.077368F, -0.029773F, 0.001527F);
        ironSightPitch = 0.475391F;
        ironSightYaw = -0.084065F;
        closeBareAdsProjection = true;
    }

    private static Vector3f point(float x, float y, float z) {
        return new Vector3f(x * PACK_UNIT, y * PACK_UNIT, z * PACK_UNIT);
    }

    private ModelRendererTurbo[] loadPart(String suffix) {
        ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, 512, 512);
        part.addObj("/BFMCpack/BarrettSSRS" + suffix + ".obj");
        // Undo the legacy OBJ loader's rotation of the authored Y-up geometry.
        part.rotateAngleX = (float) (Math.PI / 2);
        return new ModelRendererTurbo[] {part};
    }
}
