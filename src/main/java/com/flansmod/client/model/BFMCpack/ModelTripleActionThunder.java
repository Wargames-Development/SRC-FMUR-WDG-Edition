package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import org.lwjgl.opengl.GL11;

public class ModelTripleActionThunder extends ModelGun {
    public ModelTripleActionThunder() {
        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, 2048, 1024);
        gunModel[0].addObj("/BFMCpack/TripleActionThunder.obj");
        gunModel[0].setRotationPoint(1F, 4.6F, 0F);
        // The OBJ stores height on Y; the legacy OBJ loader expects height on Z.
        gunModel[0].rotateAngleX = 1.5707964F;

        animationType = EnumAnimationType.PISTOL_CLIP;
        hasArms = true;
        leftArmPos = new Vector3f(-0.2F, -0.65F, -0.16F);
        leftArmRot = new Vector3f(80F, 35F, 0F);
        leftArmReloadPos = new Vector3f(-0.27F, -0.57F, -0.15F);
        leftArmReloadRot = new Vector3f(70F, 40F, 0F);
        leftArmScale = new Vector3f(0.75D, 1D, 0.75D);
        rightArmPos = new Vector3f(0.13F, -0.56F, 0F);
        rightArmRot = new Vector3f(0F, 0F, -90F);
        rightArmReloadPos = new Vector3f(0.13F, -0.56F, 0F);
        rightArmReloadRot = new Vector3f(0F, 0F, -90F);
        rightArmScale = new Vector3f(0.75D, 1D, 0.75D);
        leftHandAmmo = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
        stanceRotate = new Vector3f(0F, 0F, 45F);
        thirdPersonOffset = new Vector3f(-0.0375F, -0.4475F, 0F);
    }

    @Override
    public void renderGun(float scale) {
        // Both Sketchfab materials are double-sided; preserve their visible faces.
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        try {
            GL11.glDisable(GL11.GL_CULL_FACE);
            super.renderGun(scale);
        } finally {
            GL11.glPopAttrib();
        }
    }
}
