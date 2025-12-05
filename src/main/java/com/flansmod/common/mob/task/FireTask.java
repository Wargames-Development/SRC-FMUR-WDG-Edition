package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumWeaponState;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;

public class FireTask extends AITask {
    public FireTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        if(entity.fireHelper.onUpdateShoot() == EnumWeaponState.SHOOTING){
            return TaskState.RUNNING;
        } else return TaskState.FAILURE;
    }


}
