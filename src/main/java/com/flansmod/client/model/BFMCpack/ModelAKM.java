package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAKM extends ModelGun {

    private static final float PART_OFFSET_X = 1.85F;
    private static final float PART_OFFSET_Y = 0.75F;
    private static final float BLENDER_TO_TMT_ROTATION = 1.5707964F;

    public ModelAKM() {
        int textureX = 64;
        int textureY = 64;

        gunModel = new ModelRendererTurbo[1];
        ammoModel = new ModelRendererTurbo[1];
        extraAmmoModel = new ModelRendererTurbo[1];
        slideModel = new ModelRendererTurbo[1];

        gunModel[0] = createPart("/BFMCpack/AKM_Main.obj", textureX, textureY);
        ammoModel[0] = createPart("/BFMCpack/AKM_Magazine.obj", textureX, textureY);
        extraAmmoModel[0] = createPart("/BFMCpack/AKM_Magazine.obj", textureX, textureY);
        slideModel[0] = createPart("/BFMCpack/AKM_Bolt.obj", textureX, textureY);

        // The exported OBJ points along +X. These positions are in OBJ units divided by 16.
        barrelAttachPoint = new Vector3f(6.52F / 16F, 1.45F / 16F, 0F);
        gadgetAttachPoint = new Vector3f(2.80F / 16F, 0.60F / 16F, 0F);
        scopeAttachPoint = new Vector3f(1.35F / 16F, 1.92F / 16F, 0F);
        gripAttachPoint = new Vector3f(2.80F / 16F, 0.60F / 16F, 0F);

        gunOffset = -0.6F;
        gunOffsetX = -2F;
        thirdPersonOffset = new Vector3f(0D, -0.12D, 0D);
        gunSlideDistance = 0.08F;
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

        rightArmPos = new Vector3f(0.25F, -0.52F, 0F);
        rightArmRot = new Vector3f(0F, 0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0F);
        rightArmReloadRot = new Vector3f(0F, 0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1D, 0.75D);

        casingAttachPoint = new Vector3f(1.9F / 16F, 1.5F / 16F, -0.2F / 16F);
        casingAnimDistance = new Vector3f(0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0.1F, 0F, 0.1F);
        caseScale = 0.2F;
        casingDelay = 0;

        crouchZoom = -0.05F;
        zoomOffset = 0.2F;
        zoomOffsetY = -0.01F;
        adsRotateZ = 0.75F;
        ShakeDistance = 0.32F;

        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );
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
