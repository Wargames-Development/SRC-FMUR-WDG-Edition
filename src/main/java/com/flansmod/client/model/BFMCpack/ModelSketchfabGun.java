package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import org.lwjgl.opengl.GL11;

/** Shared OBJ presentation for the six imported Sketchfab guns. */
public abstract class ModelSketchfabGun extends ModelGun {
    public float sightedZoomOffsetY;
    protected ModelSketchfabGun(String name, int textureWidth, int textureHeight,
                                boolean pistol, boolean magazine, float forwardOffset) {
        gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureWidth, textureHeight);
        gunModel[0].addObj("/BFMCpack/" + name + ".obj");
        gunModel[0].setRotationPoint(forwardOffset, pistol ? 4.5F : 3.5F, 0F);
        // The legacy OBJ loader swaps the Y/Z axes of vertex positions.
        gunModel[0].rotateAngleX = 1.5707964F;
        if (magazine) {
            ammoModel = new ModelRendererTurbo[1];
            ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureWidth, textureHeight);
            ammoModel[0].addObj("/BFMCpack/" + name + "_magazine.obj");
            ammoModel[0].setRotationPoint(forwardOffset, pistol ? 4.5F : 3.5F, 0F);
            ammoModel[0].rotateAngleX = 1.5707964F;
        }

        animationType = pistol ? EnumAnimationType.ALT_PISTOL_CLIP
                : name.equals("VHS2") ? EnumAnimationType.BULLPUP : EnumAnimationType.BOTTOM_CLIP;
        hasArms = true;
        fancyStance = true;
        if (pistol) {
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
            stanceTranslate = new Vector3f(0.4D, -0.1D, 0.2D);
            stanceRotate = new Vector3f(0F, 0F, 45F);
            thirdPersonOffset = new Vector3f(-0.0375F, -0.3F, 0F);
        } else {
            leftArmPos = new Vector3f(0.28F, -0.52F, -0.16F);
            leftArmRot = new Vector3f(80F, 35F, 0F);
            leftArmReloadPos = new Vector3f(-0.15F, -0.55F, 0.05F);
            leftArmReloadRot = new Vector3f(80F, 50F, 0F);
            leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
            rightArmPos = new Vector3f(0.24F, -0.6F, 0F);
            rightArmRot = new Vector3f(0F, 0F, -85F);
            rightArmReloadPos = new Vector3f(0.24F, -0.6F, 0F);
            rightArmReloadRot = new Vector3f(0F, 0F, -85F);
            rightArmScale = new Vector3f(0.75D, 1D, 0.75D);
            stanceTranslate = new Vector3f(0.2D, 0D, 0.2D);
            stanceRotate = new Vector3f(20F, -20F, 0F);
            thirdPersonOffset = new Vector3f(0F, -0.12F, 0F);
        }
    }

    protected final void setGunPose(float forward, float height, float yaw) {
        gunModel[0].setRotationPoint(forward, height, 0F);
        gunModel[0].rotateAngleY = yaw;
        if (ammoModel.length != 0) {
            ammoModel[0].setRotationPoint(forward, height, 0F);
            ammoModel[0].rotateAngleY = yaw;
        }
    }

    protected final void shiftGunBody(float sideways, float vertical) {
        gunModel[0].rotationPointY += vertical;
        gunModel[0].rotationPointZ += sideways;
        if (ammoModel.length != 0) {
            ammoModel[0].rotationPointY += vertical;
            ammoModel[0].rotationPointZ += sideways;
        }
    }

    protected final void setGunAngles(float yawDegrees, float pitchDegrees) {
        float yaw = (float) Math.toRadians(yawDegrees);
        float pitch = (float) Math.toRadians(pitchDegrees);
        gunModel[0].rotateAngleY = yaw;
        gunModel[0].rotateAngleZ = pitch;
        if (ammoModel.length != 0) {
            ammoModel[0].rotateAngleY = yaw;
            ammoModel[0].rotateAngleZ = pitch;
        }
    }

    protected final void setCustomReload(float gunDrop, float clipDrop) {
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, gunDrop, -0.1875F);
        translateClip = new Vector3f(0F, clipDrop, 0F);
    }

    @Override
    public void renderGun(float scale) {
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        try {
            GL11.glDisable(GL11.GL_CULL_FACE);
            super.renderGun(scale);
        } finally {
            GL11.glPopAttrib();
        }
    }

    @Override
    public void renderAmmo(float scale) {
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        try {
            GL11.glDisable(GL11.GL_CULL_FACE);
            super.renderAmmo(scale);
        } finally {
            GL11.glPopAttrib();
        }
    }
}
