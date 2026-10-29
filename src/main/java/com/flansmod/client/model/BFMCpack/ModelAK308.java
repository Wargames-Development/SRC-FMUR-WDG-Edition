package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.vector.Vector3f;

public class ModelAK308 extends ModelSketchfabGun {
    public ModelAK308() {
        super("AK308", 128, 160, false, true, 0F);
        setCustomReload(0F, -0.63F);
        setGunAngles(1F, 0F);
        shiftGunBody(-0.35F, 0F);
        zoomOffset = -0.385F;
        zoomOffsetY = -0.03F;
        scopeAttachPoint = new Vector3f(-1F / 16F, 5.9F / 16F, 0F);
        gripAttachPoint = new Vector3f(3.5F / 16F, 4.4F / 16F, 0F);
        barrelAttachPoint = new Vector3f(8F / 16F, 5F / 16F, 0F);
        gadgetAttachPoint = new Vector3f(3F / 16F, 4.4F / 16F, 0.3F);
        accessoryAttachPoint = new Vector3f(2F / 16F, 4.4F / 16F, -0.3F);
        stockAttachPoint = new Vector3f(-8F / 16F, 3.4F / 16F, 0F);
        leftArmPos.x = 0F;
        leftArmScale.y = 1.1F;
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;
    }
}
