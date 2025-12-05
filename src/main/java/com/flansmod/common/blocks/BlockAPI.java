package com.flansmod.common.blocks;

public class BlockAPI {

    public static boolean isBreakableBlock(Object block) {
        return block instanceof IBreakableBlock;
    }

    public static boolean canBeBrokenByExplosion(Object block) {
        if (block instanceof IBreakableBlock) {
            return ((IBreakableBlock) block).canBreakableByExplosion();
        }
        return false;
    }

    public static boolean canBeBrokenByPlayer(Object block) {
        if (block instanceof IBreakableBlock) {
            return ((IBreakableBlock) block).canBreakableByPlayer();
        }
        return false;
    }

}
