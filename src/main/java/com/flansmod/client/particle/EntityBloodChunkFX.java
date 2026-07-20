package com.flansmod.client.particle;

import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class EntityBloodChunkFX extends EntityDiggingFX {
    public EntityBloodChunkFX(World world, double x, double y, double z, double mx, double my, double mz) {
        super(world, x, y, z, mx, my, mz, Blocks.redstone_block, 0);
        applyRenderColor(0);
        particleMaxAge += 40;
        particleGravity = 1.65F;
        motionX = mx;
        motionY = my;
        motionZ = mz;
    }

    @Override
    public void onUpdate() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        if (particleAge++ >= particleMaxAge) {
            setDead();
        }

        motionY -= 0.04D * particleGravity;
        moveEntity(motionX, motionY, motionZ);
        motionX *= 0.82D;
        motionY *= 0.78D;
        motionZ *= 0.82D;

        if (onGround) {
            motionX *= 0.55D;
            motionZ *= 0.55D;
        }
    }
}
