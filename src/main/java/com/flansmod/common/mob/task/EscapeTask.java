package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;

public class EscapeTask extends AITask {
    public EscapeTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        entity.moveHelper.setMoveTo(entity.escapeHelper.escapePosX, entity.escapeHelper.escapePosY, entity.escapeHelper.escapePosZ, true);
        return TaskState.SUCCESS;
    }
}
