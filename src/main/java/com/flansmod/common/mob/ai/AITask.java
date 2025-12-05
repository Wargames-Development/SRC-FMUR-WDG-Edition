package com.flansmod.common.mob.ai;

import com.flansmod.common.mob.EntitySoldier;
import net.minecraft.entity.EntityLivingBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作为 n 叉树节点的 AITask 基类
 */
public abstract class AITask {

    public EntitySoldier entity;
    public String name;
    public AITask parent;
    public List<AITask> children = new ArrayList<>();

    public AITask(EntitySoldier entity, String name, AITask parent){
        this(name, parent);
        this.entity = entity;
    }

    public AITask(String name, AITask parent) {
        this.name = name;
        this.parent = parent;
        if(parent != null) parent.children.add(this);
    }

    public abstract TaskState onUpdate();


    public final TaskState onUpdateParent() {
        if (parent != null)
            return parent.onUpdate();
        throw new RuntimeException("Parent task is null");
    }

    public final TaskState onUpdateNext(String name) {
        for (AITask task : children) {
            if (task.name.equals(name)) {
                return task.onUpdate();
            }
        }
        throw new RuntimeException("Next task is null");
    }

}