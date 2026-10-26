package com.flansmod.common;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

/** Render anchor for the gun modification table; it stores no gameplay state. */
public class TileEntityGunsmithStation extends TileEntity {
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        int facing = getBlockMetadata() >> 2;
        int otherX = xCoord + BlockFlansWorkbench.partX(facing);
        int otherZ = zCoord + BlockFlansWorkbench.partZ(facing);
        return AxisAlignedBB.getBoundingBox(Math.min(xCoord, otherX), yCoord,
                Math.min(zCoord, otherZ), Math.max(xCoord, otherX) + 1,
                yCoord + 2, Math.max(zCoord, otherZ) + 1);
    }
}
