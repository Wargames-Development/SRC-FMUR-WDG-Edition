package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.vector.Vector3f;

public class ModelDragunovSVD extends ModelSketchfabGun {
    public ModelDragunovSVD() {
        super("DragunovSVD", 2048, 2048, false, true, 1.5F);
        setCustomReload(-0.0625F, -0.625F);
        setGunAngles(0.5F, 0F);
        zoomOffset = -0.08F;
        zoomOffsetY = -0.035F;
        scopeAttachPoint = new Vector3f(-1.375F / 16F, 4.725F / 16F, 0F);
        barrelAttachPoint = new Vector3f(10F / 16F, 4.4F / 16F, 0F);
        leftArmPos.x = 0F;
        leftArmScale.y = 1.1F;
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;
    }
}
