package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumWeaponState;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;

public class ReloadTask extends AITask {
    public ReloadTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        if(entity.fireHelper.onUpdateReload() == EnumWeaponState.RELOADING){
            return TaskState.RUNNING;
        } else if(entity.fireHelper.onUpdateReload() == EnumWeaponState.FULL_AMMO){
            return TaskState.SUCCESS;
        } else return TaskState.FAILURE;
    }
}
