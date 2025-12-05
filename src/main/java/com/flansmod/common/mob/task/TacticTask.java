package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumTactic;
import com.flansmod.common.mob.SoldierType;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;
import net.minecraft.entity.Entity;

public class TacticTask extends AITask {
    public TacticTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        if(entity.tactic == EnumTactic.NORMAL_SHOOT) {
//                    Vec3 randomPos = entity.targetHelper.randomEntityPos(entity.target, entity.type.targetType);
//                    entity.targetHelper.faceLocation(randomPos.xCoord, randomPos.yCoord, randomPos.zCoord, 20, 20);
            entity.targetHelper.faceLocation(
                    entity.target.posX + SoldierType.randomFloat(-0.25F, 0.25F),
                    entity.target.posY + SoldierType.randomFloat(-0.25F, 0.25F),
                    entity.target.posZ + SoldierType.randomFloat(-0.25F, 0.25F),
                    20, 20);
            entity.setAIMoveSpeed(0);
        }

        else if(entity.tactic == EnumTactic.MOVE_SHOOT){
            entity.targetHelper.faceLocation(
                    entity.target.posX + SoldierType.randomFloat(-0.25F, 0.25F),
                    entity.target.posY + SoldierType.randomFloat(-0.25F, 0.25F),
                    entity.target.posZ + SoldierType.randomFloat(-0.25F, 0.25F),
                    20, 20);
            double rYaw = Math.toRadians(entity.rotationYaw);

            float f = (float) (Math.sin(System.currentTimeMillis()) / (entity.getDistanceToEntity(entity.target) > 5 ? 10F : 8F));
            if(entity.onGround) {
                entity.motionX += Math.cos(rYaw) * f;
                entity.motionZ += Math.sin(rYaw) * f;
            }
            entity.setAIMoveSpeed(0);
        }

        else if(entity.tactic == EnumTactic.MOVE_SHOOT_ESCAPE){
            if(entity.getHealth() > 10){
                entity.targetHelper.faceLocation(
                        entity.target.posX + SoldierType.randomFloat(-0.25F, 0.25F),
                        entity.target.posY + SoldierType.randomFloat(-0.25F, 0.25F),
                        entity.target.posZ + SoldierType.randomFloat(-0.25F, 0.25F),
                        20, 20);
                double rYaw = Math.toRadians(entity.rotationYaw);

                float f = (float) (Math.sin(System.currentTimeMillis()) / (entity.getDistanceToEntity(entity.target) > 5 ? 8F : 10F));

                if(entity.onGround) {
                    entity.motionX += Math.cos(rYaw) * f;
                    entity.motionZ += Math.sin(rYaw) * f;
                }
                entity.setAIMoveSpeed(0);
            } else {
                Entity teammate = entity.targetHelper.getNearestTeammate(entity.worldObj, entity, 10);
                if(teammate != null){
                    entity.moveHelper.setMoveTo(teammate.posX, teammate.posY, teammate.posZ, true);
                } else {
                    float f = (float) (Math.sin(System.currentTimeMillis()) / 5F);
                    if(entity.onGround) {
                        entity.motionX += f * (SoldierType.rand.nextBoolean() ? 1 : -1);
                        entity.motionZ += f * (SoldierType.rand.nextBoolean() ? 1 : -1);
                        entity.moveHelper.jump();
                    }
                    return TaskState.FAILURE;
                }
            }
        }

        return TaskState.SUCCESS;
    }
}
