package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAKM extends ModelGun {

    private static final float PART_OFFSET_X = 1.85F;
    private static final float PART_OFFSET_Y = 0.75F;
    private static final float BLENDER_TO_TMT_ROTATION = 1.5707964F;
    private static final float PACK_PIXEL = 1F / (16F * 3.25F);

    public ModelAKM() {
        int textureX = 512;
        int textureY = 512;

        gunModel = new ModelRendererTurbo[1];
        ammoModel = new ModelRendererTurbo[1];
        extraAmmoModel = new ModelRendererTurbo[1];
        slideModel = new ModelRendererTurbo[1];
        defaultBarrelModel = new ModelRendererTurbo[1];

        gunModel[0] = createPart("/BFMCpack/AKM_Main.obj", textureX, textureY);
        ammoModel[0] = createPart("/BFMCpack/AKM_Magazine.obj", textureX, textureY);
        extraAmmoModel[0] = createPart("/BFMCpack/AKM_Magazine.obj", textureX, textureY);
        slideModel[0] = createPart("/BFMCpack/AKM_Bolt.obj", textureX, textureY);
        defaultBarrelModel[0] = createPart("/BFMCpack/AKM_Brake.obj", textureX, textureY);

        // These attachment points follow the AK74M-based geometry at the existing pack scale.
        barrelAttachPoint = new Vector3f(19.79F * PACK_PIXEL, 4.68F * PACK_PIXEL, 0F);
        gadgetAttachPoint = new Vector3f(10.4F * PACK_PIXEL, 4.56F * PACK_PIXEL, -0.84F * PACK_PIXEL);
        scopeAttachPoint = new Vector3f(4.388F * PACK_PIXEL, 6.36F * PACK_PIXEL, 0F);
        gripAttachPoint = new Vector3f(gadgetAttachPoint);

        gunOffset = -0.6F;
        gunOffsetX = -2F;
        thirdPersonOffset = new Vector3f(0D, -0.12D, 0D);
        mirrorThirdPerson = false;
        gunSlideDistance = 0.0554F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, 0F, -0.1875F);
        translateClip = new Vector3f(0F, -0.63F, 0F);

        hasFlash = true;
        hasArms = true;
        enableNewArm = true;
        rightHandAmmo = false;
        leftHandAmmo = false;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0D, 0.2D);
        stanceRotate = new Vector3f(20F, -20F, 0F);

        leftArmPos = new Vector3f(2F, 0.1F, -8.5F);
        leftArmRot = new Vector3f(-80F, -55F, 0F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);

        rightArmPos = new Vector3f(0.221F, -0.637F, 0.045F);
        rightArmRot = new Vector3f(0F, 18F, -80F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(rightArmRot);
        rightArmScale = new Vector3f(0.75D, 1D, 0.75D);

        caseScale = 0.2F;
        // Both scales apply. Keep the casing inside the receiver at zero progress.
        float casingPixel = PACK_PIXEL / caseScale;
        casingAttachPoint = new Vector3f(6.25F * casingPixel, 5.24F * casingPixel, 0.12F * casingPixel);
        casingAnimDistance = new Vector3f(0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0.1F, 0F, 0.1F);
        casingDelay = 0;

        crouchZoom = -0.05F;
        zoomOffset = 0.2F;
        zoomOffsetY = -0.01F;
        adsRotateZ = 0.75F;
        // Align the center of the rear notch and the front post tip with the first-person view.
        ironSightOffset = new Vector3f(0.000006F, 0.001288F, 0.000842F);
        ironSightPitch = -0.554126F;
        ironSightYaw = -0.018930F;
        ShakeDistance = 0.32F;

        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
        defaultBarrelFlashPoint = new Vector3f((19.94F - 19.79F) * PACK_PIXEL / flashScale, 0F, 0F);
    }

    private ModelRendererTurbo createPart(String modelPath, int textureX, int textureY) {
        ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        part.addObj(modelPath);
        part.setRotationPoint(PART_OFFSET_X, PART_OFFSET_Y, 0F);
        // Blender exports height on OBJ Y, while the legacy TMT OBJ loader expects OBJ Z.
        part.rotateAngleX = BLENDER_TO_TMT_ROTATION;
        return part;
    }
}
