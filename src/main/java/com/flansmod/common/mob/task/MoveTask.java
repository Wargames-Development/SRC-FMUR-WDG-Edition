package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;

public class MoveTask extends AITask {

    public boolean stillMoving = true;
    public final int maxTimeout = 1000;
    public int timeout = maxTimeout;
    public boolean hasSetTarget = false;

    public MoveTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {

        if (stillMoving) {
            timeout--;
            if (timeout <= 0) {
                entity.setAIMoveSpeed(0);
                entity.moveHelper.finalTarget = null;
                stillMoving = false;
                hasSetTarget = false;
                timeout = maxTimeout;
                return TaskState.FAILURE;
            }
            if(entity.isCollidedHorizontally && entity.onGround){
                entity.moveHelper.jump();
            }
        }

        if (entity.moveHelper.finalTarget != null) {
            if(!hasSetTarget){
                if(!entity.pathFinder.trySetPath(entity.pathFinder.getPathToPos(entity.moveHelper.finalTarget), false)){
                    return TaskState.FAILURE;
                }
                hasSetTarget = true;
            }
            entity.pathFinder.onUpdateNavigation();
            stillMoving = true;
            double dist = entity.getDistance(entity.moveHelper.finalTarget.xCoord, entity.moveHelper.finalTarget.yCoord, entity.moveHelper.finalTarget.zCoord);
//            FlansMod.log("dist " + (float)dist + " fTgt (" + (int)entity.moveHelper.finalTarget.xCoord + " " + (int)entity.moveHelper.finalTarget.yCoord + " " + (int)entity.moveHelper.finalTarget.zCoord
//            + ")  ePos (" + (int)entity.posX + " " + (int)entity.posY + " " + (int)entity.posZ + ")" );
            if (dist < 0.5) {
                entity.setAIMoveSpeed(0);
                entity.moveHelper.finalTarget = null;
                stillMoving = false;
                hasSetTarget = false;
                timeout = maxTimeout;
                //FlansMod.log("已经到达目的地");
                return TaskState.SUCCESS;
            }

            return TaskState.SUCCESS;
        }

        entity.setAIMoveSpeed(0);
        stillMoving = false;
        hasSetTarget = false;
        timeout = maxTimeout;
        return TaskState.FAILURE;
    }
}
