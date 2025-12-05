package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumWeaponState;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.ConditionalNode;
import com.flansmod.common.mob.ai.TaskState;

public class CheckEscapeTask extends ConditionalNode {

    int maxEscapeTime = 100;
    int escapeTime = 0;

    public CheckEscapeTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        if(entity.reloadingTimeCount <= entity.type.escapeOnReloadTime)
            return TaskState.FAILURE;
        else {
            escapeTime++;
            if(escapeTime > maxEscapeTime)
                return TaskState.FAILURE;
        }

        if(entity.weaponState == EnumWeaponState.SHOOTING)
            return TaskState.FAILURE;

        if(entity.escapeHelper.onUpdateEscape()) {
            escapeTime = 0;
            return TaskState.SUCCESS;
        }
        else return TaskState.FAILURE;
    }
}
