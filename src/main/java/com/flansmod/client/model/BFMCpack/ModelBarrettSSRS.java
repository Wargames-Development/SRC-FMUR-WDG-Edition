package com.flansmod.client.model.BFMCpack;

import com.flansmod.common.vector.Vector3f;

public class ModelBarrettSSRS extends ModelSketchfabGun {
    public ModelBarrettSSRS() {
        super("BarrettSSRS", 128, 64, false, true, 0F);
        setCustomReload(-0.0625F, -0.625F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.95F, -0.05F);
        setGunAngles(-1.25F, 3F);
        shiftGunBody(0.35F, -0.25F);
        zoomOffset = 0.185F;
        zoomOffsetY = -0.043F;
        scopeAttachPoint = new Vector3f(0F, 6.2F / 16F, 0F);
        barrelAttachPoint = new Vector3f(8F / 16F, 4.8F / 16F, 0F);
        gadgetAttachPoint = new Vector3f(3F / 16F, 4.5F / 16F, 0.3F);
        accessoryAttachPoint = new Vector3f(2F / 16F, 4.5F / 16F, -0.3F);
        leftArmPos.x = 0F;
        leftArmScale.y = 1.1F;
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;
    }
}
