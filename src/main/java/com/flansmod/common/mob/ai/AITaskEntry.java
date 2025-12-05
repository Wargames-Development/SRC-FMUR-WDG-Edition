package com.flansmod.common.mob.ai;

public class AITaskEntry {

    public AITask root;

    public AITaskEntry(AITask root) {
        this.root = root;
    }

    public void onUpdate() {
        root.onUpdate();
    }

    public static AITaskEntry createAITask(AITask root) {
        return new AITaskEntry(root);
    }
}
