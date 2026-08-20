package com.flansmod.common.tileentity;

import com.flansmod.common.network.PacketPlaySound;
import net.minecraft.tileentity.TileEntity;

/** Keeps nearby clients synchronized with the block's redstone state. */
public class TileEntityAmbientWarSound extends TileEntity {
    private static final int REFRESH_INTERVAL_TICKS = 40;
    private int ticksUntilRefresh;
    private boolean soundActive;

    @Override
    public void updateEntity() {
        if (worldObj == null || worldObj.isRemote)
            return;
        if (ticksUntilRefresh-- <= 0) {
            ticksUntilRefresh = REFRESH_INTERVAL_TICKS;
            refreshPowerState();
        }
    }

    public void refreshPowerState() {
        if (worldObj == null || worldObj.isRemote)
            return;

        boolean powered = worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord);
        if (powered) {
            PacketPlaySound.sendAmbientWarSound(xCoord, yCoord, zCoord,
                    worldObj.provider.dimensionId, true);
        } else if (soundActive) {
            PacketPlaySound.sendAmbientWarSound(xCoord, yCoord, zCoord,
                    worldObj.provider.dimensionId, false);
        }
        soundActive = powered;
    }

    public void stopSound() {
        if (worldObj != null && !worldObj.isRemote) {
            PacketPlaySound.sendAmbientWarSound(xCoord, yCoord, zCoord,
                    worldObj.provider.dimensionId, false);
        }
        soundActive = false;
    }
}
