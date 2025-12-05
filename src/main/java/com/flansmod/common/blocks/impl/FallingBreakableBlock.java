package com.flansmod.common.blocks.impl;

import com.flansmod.common.FlansMod;
import com.flansmod.common.blocks.BlockType;
import com.flansmod.common.blocks.IBreakableBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.ArrayList;

public class FallingBreakableBlock extends BlockFalling implements IBreakableBlock {

    public BlockType blockType;

    public FallingBreakableBlock(BlockType type) throws Exception {
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
    @Override
    public IIcon getIcon(int side, int metadata) {
        if (blockType == null)
            return null;

        if (side == 1) {
            return blockType.top;
        }
        if (side == 0) {
            return blockType.bottom;
        }
        return blockType.side;
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
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata) {
        super.breakBlock(world, x, y, z, block, metadata);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        //for(GunBoxType type : GunBoxType.gunBoxMap.values())
        //{
        blockType.top = register.registerIcon(FlansMod.MODID + ":" + blockType.topTexturePath);
        blockType.side = register.registerIcon(FlansMod.MODID + ":" + blockType.sideTexturePath);
        blockType.bottom = register.registerIcon(FlansMod.MODID + ":" + blockType.bottomTexturePath);
        //}
    }

    @Override
    public boolean canBreakableByPlayer() {
        return blockType.breakableByPlayer;
    }

    @Override
    public boolean canBreakableByExplosion() {
        return blockType.breakableByExplosion;
    }
}
