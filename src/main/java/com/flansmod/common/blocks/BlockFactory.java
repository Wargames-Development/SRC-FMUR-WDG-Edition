package com.flansmod.common.blocks;

import com.flansmod.common.blocks.impl.*;
import net.minecraft.block.Block;

public class BlockFactory {

    public static IBreakableBlock createBlock(BlockType blockType) throws Exception {
        Block block;
        switch (blockType.enumBlockType) {
            case general:
                block = new BreakableBlock(blockType);
                break;
            case falling:
                block = new FallingBreakableBlock(blockType);
                break;
            case bush:
                block = new BushBreakableBlock(blockType);
                break;
            case slab:
                block = new SlabBreakableBlock(true, blockType);
                break;
            case fence:
                block = new FenceBreakableBlock(blockType);
                break;
            case door:
                block = new DoorBreakableBlock(blockType);
                break;
            case target:
                block = new TargetBreakableBlock(blockType);
                break;
            default:
                throw new RuntimeException("Illegal Block Type.");
        }
        block.setBlockName(blockType.shortName);
        if (blockType.hideFromCreative)
            block.setCreativeTab(null);
        return (IBreakableBlock) block;
    }

}
