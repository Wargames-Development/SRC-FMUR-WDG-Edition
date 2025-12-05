package com.flansmod.common.mob.ai;

import com.flansmod.common.mob.EntitySoldier;

/**
 * 条件判定节点
 */
public abstract class ConditionalNode extends AITask{

    public ConditionalNode(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public abstract TaskState onUpdate();

}
