package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelTripleActionThunder extends ModelGun {
    public ModelTripleActionThunder() {
        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, 2048, 1024);
        gunModel[0].addObj("/BFMCpack/TripleActionThunder.obj");
        // The OBJ stores height on Y; the legacy OBJ loader expects height on Z.
        gunModel[0].rotateAngleX = 1.5707964F;

        muzzleFlashPoint = new Vector3f(9.0287F / 16F, 5.7F / 16F, 0F);
        barrelAttachPoint = new Vector3f(muzzleFlashPoint);
        scopeAttachPoint = new Vector3f(-1.2F / 16F, 6.25F / 16F, 0F);
        mirrorThirdPerson = false;
        // Fit the rear notch and front blade to the measured stationary camera ray.
        ironSightOffset = new Vector3f(0.058673F, -0.007814F, 0.000943F);
        ironSightPitch = 0.480940F;
        ironSightYaw = -0.018930F;

        animationType = EnumAnimationType.PISTOL_CLIP;
        hasArms = true;
        leftArmPos = new Vector3f(-0.3244F, -0.7374F, -0.2198F);
        leftArmRot = new Vector3f(80F, 35F, 0F);
        leftArmReloadPos = new Vector3f(-0.27F, -0.57F, -0.15F);
        leftArmReloadRot = new Vector3f(70F, 40F, 0F);
        leftArmScale = new Vector3f(0.75D, 1D, 0.75D);
        rightArmPos = new Vector3f(0.095F, -0.769F, 0.097F);
        rightArmRot = new Vector3f(0F, 0F, -90F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(0F, 0F, -90F);
        rightArmScale = new Vector3f(0.75D, 1D, 0.75D);
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0F, 0F, 45F);
        thirdPersonOffset = new Vector3f(-0.0375F, -0.4475F, 0F);
    }
}
