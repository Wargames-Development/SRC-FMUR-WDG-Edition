package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumWeaponState;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.ConditionalNode;
import com.flansmod.common.mob.ai.TaskState;

public class CheckCanMoveTask extends ConditionalNode {
    public CheckCanMoveTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        if(entity.weaponState == EnumWeaponState.SHOOTING)
            return TaskState.FAILURE;

        return TaskState.SUCCESS;
    }
}
