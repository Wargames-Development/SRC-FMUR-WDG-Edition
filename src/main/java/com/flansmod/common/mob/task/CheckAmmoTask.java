package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.ConditionalNode;
import com.flansmod.common.mob.ai.TaskState;
import net.minecraft.item.ItemStack;

/**
 * 检查弹药,如果没有弹药则返回失败
 */
public class CheckAmmoTask extends ConditionalNode {
    public CheckAmmoTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        ItemStack bulletStack = entity.bulletStack;
        if (bulletStack == null) return TaskState.FAILURE;
        else if (bulletStack.getItemDamage() >= bulletStack.getMaxDamage()) {
            entity.bulletStack = null;
            return TaskState.FAILURE;
        }
        return TaskState.SUCCESS;
    }
}
