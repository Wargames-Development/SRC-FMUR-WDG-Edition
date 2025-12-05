package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.ConditionalNode;
import com.flansmod.common.mob.ai.TaskState;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;

public class CheckCanJumpTask extends ConditionalNode {

    public CheckCanJumpTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {

        boolean canJump = false;

        if(entity.motionX <= 2.500000277905201E-7D && entity.motionZ <= 2.500000277905201E-7D)
            return TaskState.FAILURE;

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

            //面前方块
            Block block = entity.worldObj.getBlock(blockX, blockY - 1, blockZ);
            //面前方块上一格
            Block block1 = entity.worldObj.getBlock(blockX, blockY, blockZ);
            //面前方块上两格
            Block block2 = entity.worldObj.getBlock(blockX, blockY + 1, blockZ);
            Block block3 = entity.worldObj.getBlock(blockX, blockY - 2, blockZ);

            boolean normalBlock =
                    block.getMaterial() != Material.air && block.getMaterial() != Material.plants && block.getMaterial() != Material.grass
                    && block1.getMaterial() == Material.air
                    && block2.getMaterial() == Material.air;

            boolean fence = (block instanceof BlockFence || block instanceof BlockWall);
            boolean groundFence = (block3 instanceof BlockFence || block3 instanceof BlockWall);

            canJump = (normalBlock || groundFence) && !fence;
        }

        return canJump ? TaskState.SUCCESS : TaskState.FAILURE;
    }
}
