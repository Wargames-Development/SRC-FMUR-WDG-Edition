package com.flansmod.common.blocks.impl;

import com.flansmod.common.FlansMod;
import com.flansmod.common.blocks.BlockType;
import com.flansmod.common.blocks.IBreakableBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class FenceBreakableBlock extends BlockFence implements IBreakableBlock {

    public BlockType blockType;

    public FenceBreakableBlock(BlockType type) throws Exception {
        super(type.texturePath, type.material);
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

    @Override
    public String getTextureName() {
        return FlansMod.MODID + ":" + blockType.texturePath;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(FlansMod.MODID + ":" + blockType.texturePath);
    }
}
