package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;

public class JumpTask extends AITask {

    public JumpTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        entity.moveHelper.jump();
        return TaskState.SUCCESS;
    }
}
