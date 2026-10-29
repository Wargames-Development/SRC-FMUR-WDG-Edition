package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.vector.Vector3f;

public class ModelM240 extends ModelSketchfabGun {
    public ModelM240() {
        super("M240", 128, 64, false, true, 1.5F);
        setCustomReload(-0.0625F, -0.625F);
        leftArmReloadPos = new Vector3f(-0.13F, -0.6F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 60F, 0F);
        setGunPose(1.5F, 3.25F, 0F);
        ammoModel[0].rotationPointZ += 0.9F;
        zoomOffsetY = -0.015F;
        sightedZoomOffsetY = -0.015F;
        scopeAttachPoint = new Vector3f(-2F / 16F, 5.2F / 16F, 0F);
        barrelAttachPoint = new Vector3f(9F / 16F, 4.5F / 16F, 0F);
        gripAttachPoint = new Vector3f(3F / 16F, 3.2F / 16F, 0F);
        gadgetAttachPoint = new Vector3f(2F / 16F, 4.1F / 16F, 0.3F);
        accessoryAttachPoint = new Vector3f(2F / 16F, 4.1F / 16F, -0.3F);
        leftHandAmmo = true;
    }
}
