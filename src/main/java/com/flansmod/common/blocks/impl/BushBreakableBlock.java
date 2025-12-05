package com.flansmod.common.blocks.impl;

import com.flansmod.common.FlansMod;
import com.flansmod.common.blocks.BlockType;
import com.flansmod.common.blocks.IBreakableBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class BushBreakableBlock extends BlockBush implements IBreakableBlock {

    public BlockType blockType;

    public BushBreakableBlock(BlockType type) throws Exception {
        super(type.material);
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

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(FlansMod.MODID + ":" + blockType.texturePath);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        if(blockType.dropThis) {
            ret.add(new ItemStack(this, 1, 0));
        }
        return ret;
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

}
