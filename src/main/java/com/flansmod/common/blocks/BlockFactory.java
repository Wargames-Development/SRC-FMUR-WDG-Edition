package com.flansmod.common.blocks;

import com.flansmod.common.blocks.impl.*;

public class BlockFactory {

    public static IBreakableBlock createBlock(BlockType blockType) throws Exception {
        EnumBlockType enumBlockType = blockType.enumBlockType;
        switch (enumBlockType) {
            case general: {
                BreakableBlock block = new BreakableBlock(blockType);
                block.setBlockName(blockType.shortName);
                return block;
            }
            case falling: {
                FallingBreakableBlock block = new FallingBreakableBlock(blockType);
                block.setBlockName(blockType.shortName);
                return block;
            }
            case bush: {
                BushBreakableBlock block = new BushBreakableBlock(blockType);
                block.setBlockName(blockType.shortName);
                return block;
            }
            case slab: {
                SlabBreakableBlock block = new SlabBreakableBlock(true, blockType);
                block.setBlockName(blockType.shortName);
                return block;
            }
            case fence: {
                FenceBreakableBlock block = new FenceBreakableBlock(blockType);
                block.setBlockName(blockType.shortName);
                return block;
            }
            case door: {
                DoorBreakableBlock block = new DoorBreakableBlock(blockType);
                block.setBlockName(blockType.shortName);
                return block;
            }
            case target: {
                TargetBreakableBlock block = new TargetBreakableBlock(blockType);
                block.setBlockName(blockType.shortName);
                return block;
            }
            default: {
                throw new RuntimeException("Illegal Block Type.");
            }
        }
    }

}
