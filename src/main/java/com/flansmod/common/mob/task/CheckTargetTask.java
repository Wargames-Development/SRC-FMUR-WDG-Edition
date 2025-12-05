package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.ConditionalNode;
import com.flansmod.common.mob.ai.TaskState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;

public class CheckTargetTask extends ConditionalNode {
    public CheckTargetTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {

        if(entity.ticksExisted % 40 == 0) {
            entity.targetStrategy++;
            if(entity.targetStrategy >= 3) entity.targetStrategy = 0;
        }

        //超过最大锁定时间，清空目标
        if (entity.target != null && entity.ticksExisted % entity.type.maxLockOnTime == 0) {
            entity.target = null;
            return TaskState.FAILURE;
        }

        if(entity.lastTarget instanceof EntityLivingBase && ((EntityLivingBase) entity.lastTarget).getHealth() <= 0) {
            entity.lastTarget = null;
        }
        
        //到达索敌间隔，重新索敌
        if (entity.ticksExisted % entity.type.targetAcquireInterval == 0) {
            entity.target = entity.targetHelper.getValidTarget();
            if (entity.target != null && entity.target != entity.lastTarget) {
                //PacketPlaySound.sendSoundPacket(posX, posY, posZ, 30, dimension, type.lockOnSound, false);
            }
            entity.lastTarget = entity.target != null ? entity.target : entity.lastTarget;
        }

        if (entity.target != null && !entity.target.isDead) {
            Vec3 targetPos = entity.targetHelper.getEntityPos(entity.target, entity.targetStrategy);
            entity.targetHelper.faceLocation(targetPos.xCoord, targetPos.yCoord, targetPos.zCoord, 20, 20);
            entity.lockOnTimeCount++;
            return TaskState.SUCCESS;
        } else {
            entity.lockOnTimeCount = 0;
            entity.target = null;
            return TaskState.FAILURE;
        }

    }
}
