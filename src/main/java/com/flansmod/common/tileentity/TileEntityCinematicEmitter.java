package com.flansmod.common.tileentity;

import com.flansmod.common.BlockCinematicEmitter;
import com.flansmod.common.FlansMod;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCinematicEmitter extends TileEntity {
    private int refreshTicks;

    @Override
    public void updateEntity() {
        if (worldObj == null)
            return;
        Block block = getBlockType();
        if (!(block instanceof BlockCinematicEmitter))
            return;
        BlockCinematicEmitter emitter = (BlockCinematicEmitter)block;
        if (!worldObj.isRemote) {
            // Also reconcile saved power on chunk load, without a particle packet stream.
            if (refreshTicks-- <= 0) {
                refreshTicks = 19;
                emitter.refreshPower(worldObj, xCoord, yCoord, zCoord);
            }
            return;
        }
        if (worldObj.getBlockMetadata(xCoord, yCoord, zCoord) != 1)
            return;
        if (emitter.particleName.equals("flansmod.electricalsparks")
                && worldObj.rand.nextInt(12) != 0)
            return;
        for (int i = 0; i < emitter.particlesPerTick; i++) {
            FlansMod.proxy.spawnParticle(emitter.particleName,
                    xCoord + 0.5D, yCoord + 1.05D, zCoord + 0.5D, 0D, 0D, 0D);
        }
    }
}
