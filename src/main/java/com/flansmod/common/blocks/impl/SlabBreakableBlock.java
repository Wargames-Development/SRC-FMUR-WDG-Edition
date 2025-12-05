package com.flansmod.common.blocks.impl;

import com.flansmod.common.FlansMod;
import com.flansmod.common.blocks.BlockType;
import com.flansmod.common.blocks.IBreakableBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;

import static net.minecraft.block.BlockStoneSlab.field_150006_b;

public class SlabBreakableBlock extends BlockSlab implements IBreakableBlock {

    public BlockType blockType;

    public SlabBreakableBlock(boolean bl , BlockType type) throws Exception {
        super(bl, type.material);
        setCreativeTab(FlansMod.tabFlanBlocks);
        blockType = type;
        setHardness(type.hardness);
        setResistance(type.resistance);
        setBlockName(type.shortName);
        Block block = Block.getBlockFromName(FlansMod.MODID + ":block." + type.shortName);
        if (block != null) {
            throw new Exception("Caught an exception during block registration");
        }
        GameRegistry.registerBlock(this, "block." + type.shortName);
        type.item = Item.getItemFromBlock(this);
    }

    @Override
    public boolean canBreakableByPlayer() {
        return blockType.breakableByPlayer;
    }

    @Override
    public boolean canBreakableByExplosion() {
        return blockType.breakableByExplosion;
    }

    public String func_150002_b(int p_150002_1_)
    {
        if (p_150002_1_ < 0 || p_150002_1_ >= field_150006_b.length)
        {
            p_150002_1_ = 0;
        }

        return super.getUnlocalizedName() + "." + field_150006_b[p_150002_1_];
    }
}
