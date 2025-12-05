package com.flansmod.common.mob.ai;

/**
 * 序列节点，子节点可返回 SUCCESS 或 FAILURE
 *
 * 要求比较高：期望所有子节点都成功
 *
 * 若某一子节点返回 FAILURE，则停止执行其他子节点，并返回 FAILURE
 * 全部子节点返回 SUCCESS，则该节点返回 SUCCESS
 */
public class SequenceNode extends AITask {

    public SequenceNode(String name, AITask parent) {
        super(name, parent);
    }

    @Override
    public TaskState onUpdate() {
        for(AITask task : children){
            TaskState state = task.onUpdate();
            if(state == null){
                throw new NullPointerException(task.getClass().getName() + " TaskState is null");
            } else if(state == TaskState.FAILURE){
                return TaskState.FAILURE;
            }
        }
        return TaskState.SUCCESS;
    }

}
