package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelC25 extends ModelGun {
    private static final float UNIT = 1F / (16F * 1.15F);

    public ModelC25() {
        gunModel = part("");
        ammoModel = part("_magazine");
        slideModel = part("_bolt");
        defaultScopeModel = part("_scope");
        defaultBarrelModel = part("_muzzle");
        scopeAttachPoint = point(1.5F, 6.43F, 0F);
        barrelAttachPoint = point(15.6F, 5.29F, 0F);
        gripAttachPoint = point(9.0F, 3.91F, 0F);
        gadgetAttachPoint = point(9.0F, 4.92F, -0.94F);
        mirrorThirdPerson = false;
        thirdPersonOffset = new Vector3f(-0.1F, -0.05F, 0F);
        animationType = EnumAnimationType.CUSTOM;
        gunSlideDistance = 0.1F;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0F, -0.625F, 0F);
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2F, 0F, 0.2F);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        hasArms = true;
        enableNewArm = true;
        // Existing BFMC M16-family pose and reload convention.
        leftArmPos = new Vector3f(2F, 0.1F, -8.5F);
        leftArmRot = new Vector3f(-80F, -55F, 0F);
        leftArmScale = new Vector3f(0.75F, 1.25F, 0.75F);
        rightArmPos = new Vector3f(0.24F, -0.6F, 0F);
        rightArmRot = new Vector3f(0F, 0F, -85F);
        rightArmScale = new Vector3f(0.75F, 1F, 0.75F);
        leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(rightArmRot);
        zoomOffset = 0.35F;
        zoomOffsetY = -0.0625F;
        ShakeDistance = 0.2F;
        hasFlash = true;
        flashScale = 0.4F;
        // Flash/tracer translation occurs after flashScale in the legacy renderer.
        muzzleFlashPoint = point(15.6F / flashScale, 5.29F / flashScale, 0F);
        defaultBarrelFlashPoint = point(3.3F / flashScale, 0F, 0F);
        caseScale = 0.2F;
        // This pass scales before translating; hide the idle casing inside the port.
        casingAttachPoint = point(2.8F / caseScale, 5.4F / caseScale, 0.3F / caseScale);
        casingAnimDistance = new Vector3f(0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 6;
        casingRotateVector = new Vector3f(0.1F, 0F, 0.1F);
    }

    private static Vector3f point(float x, float y, float z) {
        return new Vector3f(x * UNIT, y * UNIT, z * UNIT);
    }

    private ModelRendererTurbo[] part(String suffix) {
        ModelRendererTurbo mesh = new ModelRendererTurbo(this, 0, 0, 256, 256);
        mesh.addObj("/BFMCpack/C25" + suffix + ".obj");
        mesh.rotateAngleX = (float) (Math.PI / 2);
        return new ModelRendererTurbo[] {mesh};
    }
}
