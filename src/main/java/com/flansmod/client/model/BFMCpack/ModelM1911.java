package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.vector.Vector3f;

public class ModelM1911 extends ModelSketchfabGun {
    public ModelM1911() {
        super("M1911", 128, 96, true, true, 0F);
        setGunPose(1.6F, 5.1F, 0F);
        zoomOffsetY = 0.04F;
        barrelAttachPoint = new Vector3f(6.1F / 16F, 6.8F / 16F, 0F);
    }
}
