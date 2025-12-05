package com.flansmod.common.mob.ai;

/**
 * 选择器节点，子节点可返回 SUCCESS 或 FAILURE
 *
 * 要求比较低：只要有一个子节点成功就可以了
 *
 * 若某一子节点返回 FAILURE，则继续执行下一个子节点
 * 任一子节点返回 SUCCESS，该节点返回 SUCCESS，并不再执行后续节点。
 * 所有子节点返回 FAILURE，则该节点返回 FAILURE
 */
public class SelectorNode extends AITask{

    public SelectorNode(String name, AITask parent) {
        super(name, parent);
    }

    @Override
    public TaskState onUpdate() {
        for(AITask task : children){
            TaskState state = task.onUpdate();
            if(state == null){
                throw new NullPointerException(task.getClass().getName() + " TaskState is null");
            }
            else if(state == TaskState.FAILURE){
                continue;
            } else if (state == TaskState.SUCCESS){
                return TaskState.SUCCESS;
            }
        }
        return TaskState.FAILURE;
    }

}
