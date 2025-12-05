package com.flansmod.common.mob.helper;

import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumSoldierState;
import com.flansmod.common.network.PacketSoldierDebug;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.ForgeHooks;

public class MoveHelper {

    public EntitySoldier entity;
    public boolean tryMoving = true;
    public Vec3 finalTarget;
    public Vec3 currentTarget;

    public MoveHelper(EntitySoldier entity) {
        this.entity = entity;
    }

    public static void debug(EntityClientPlayerMP player) {
        if(FlansMod.DEBUG)
            player.worldObj.spawnEntityInWorld(new EntityDebugDot(player.worldObj, new Vector3f(player.posX, player.posY, player.posZ), 200, 1F, 0F, 0F));
        EntitySoldier soldier = (EntitySoldier) TargetHelper.getNearestEntity(player.worldObj, EntitySoldier.class, 300, player.posX, player.posY, player.posZ);
        if(soldier == null)
            return;

        FlansMod.getPacketHandler().sendToServer(new PacketSoldierDebug(soldier.getEntityId(), player.posX, player.posY, player.posZ));
        //soldier.moveHelper.setMoveTo(player.posX, player.posY, player.posZ, true);
    }

    public void setMoveTo(double posX, double posY, double posZ, boolean sprinting) {
        currentTarget = finalTarget = Vec3.createVectorHelper(posX, posY, posZ);
        entity.targetHelper.faceLocation(currentTarget.xCoord, currentTarget.yCoord, currentTarget.zCoord, 360, 50);

//        int i = MathHelper.floor_double(this.entity.boundingBox.minY + 0.5D);
//        double d0 = currentTarget.xCoord - this.entity.posX;
//        double d1 = currentTarget.yCoord - this.entity.posZ;
//        double d2 = currentTarget.zCoord - (double)i;
//        double d3 = d0 * d0 + d2 * d2 + d1 * d1;
//
//        if (d3 >= 2.500000277905201E-7D)
//        {
//            if (d2 > 0.0D && d0 * d0 + d1 * d1 < 1.0D)
//            {
//                jump();
//            }
//        }

        if(sprinting){
            entity.setSprinting(true);
            entity.setAIMoveSpeed(10F);
        } else {
            entity.setSprinting(false);
            entity.setAIMoveSpeed(5F);
        }
    }

    public void stopMoving(){
        entity.setAIMoveSpeed(0);
        finalTarget = null;
        entity.state = EnumSoldierState.IDLE;
        tryMoving = false;
    }

    public void jump() {
        this.entity.motionY = 0.41999998688697815D;
        if (this.entity.isPotionActive(Potion.jump)) {
            this.entity.motionY += (float) (this.entity.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1F;
        }
        if (this.entity.isSprinting()) {
            float f = this.entity.rotationYaw * 0.017453292F;
            this.entity.motionX -= MathHelper.sin(f) * 0.2F;
            this.entity.motionZ += MathHelper.cos(f) * 0.2F;
        }
        this.entity.isAirBorne = true;
        ForgeHooks.onLivingJump(entity);
    }

    @Deprecated
    public void onUpdateMoveHelper() {

        if(entity.state != EnumSoldierState.MOVING) {
            tryMoving = false;
        }

        if (finalTarget != null) {
            double dist = entity.getDistance(finalTarget.xCoord, finalTarget.yCoord, finalTarget.zCoord);
            entity.targetHelper.faceLocation(finalTarget.xCoord, finalTarget.yCoord, finalTarget.zCoord, 50, 50);

            if(entity.onGround){
                double posX = entity.posX;
                double posY = entity.posY + 1;
                double posZ = entity.posZ;
                float yaw = entity.rotationYaw;
                double radianYaw = Math.toRadians(yaw);
                double dX = -Math.sin(radianYaw);
                double dZ = Math.cos(radianYaw);
                double nextPosX = posX + dX;
                double nextPosZ = posZ + dZ;
                int blockX = MathHelper.floor_double(nextPosX);
                int blockY = MathHelper.floor_double(posY);
                int blockZ = MathHelper.floor_double(nextPosZ);
                Block block = entity.worldObj.getBlock(blockX, blockY, blockZ);
                Block block1 = entity.worldObj.getBlock(blockX, blockY - 1, blockZ);
                Block block2 = entity.worldObj.getBlock(blockX, blockY + 1, blockZ);

                boolean canJump = block.getMaterial() == Material.air && block1.getMaterial() != Material.air && block2.getMaterial() == Material.air;
                if(canJump) {
                    jump();
                }
            }

            if (dist < 0.5) {
                entity.setAIMoveSpeed(0);
                finalTarget = null;
                entity.state = EnumSoldierState.IDLE;
                tryMoving = false;
            }
        }

    }
}
