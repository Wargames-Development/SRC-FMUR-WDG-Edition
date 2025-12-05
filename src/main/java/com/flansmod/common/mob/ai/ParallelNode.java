package com.flansmod.common.mob.ai;

/**
 * 并行节点，永远循环执行所有子任务，不管返回成功与否
 * 永远返回 SUCCESS
 */
public class ParallelNode extends AITask{
    public ParallelNode(String name, AITask parent) {
        super(name, parent);
    }

    @Override
    public TaskState onUpdate() {
        for(AITask task : children){
            TaskState state = task.onUpdate();
            if(state == null){
                throw new NullPointerException(task.getClass().getName() + " TaskState is null");
            }
        }
        return TaskState.SUCCESS;
    }

}
