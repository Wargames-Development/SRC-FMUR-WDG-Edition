package com.flansmod.common.mob.ai;

/**
 * 翻转节点
 * 子节点返回 SUCCESS，则该节点返回 FAILURE
 * 子节点返回 FAILURE，则该节点返回 SUCCESS
 */
public class ReverseNode extends AITask{

    public ReverseNode(String name, AITask parent) {
        super(name, parent);
    }

    @Override
    public TaskState onUpdate() {

        if(children.size() != 1){
            throw new RuntimeException("ReverseAITask can only have one child");
        }

        TaskState state = children.get(0).onUpdate();
        if(state == null){
            throw new NullPointerException(children.get(0).getClass().getName() + " TaskState is null");
        } else if(state == TaskState.SUCCESS){
            return TaskState.FAILURE;
        } else if(state == TaskState.FAILURE){
            return TaskState.SUCCESS;
        }
        return TaskState.RUNNING;
    }
}
