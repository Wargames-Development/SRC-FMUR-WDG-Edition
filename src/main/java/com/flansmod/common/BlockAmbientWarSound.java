package com.flansmod.common;

import com.flansmod.common.tileentity.TileEntityAmbientWarSound;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/** Redstone-controlled source for the looping distant-war ambience. */
public class BlockAmbientWarSound extends Block implements ITileEntityProvider {

    public BlockAmbientWarSound() {
        super(Material.iron);
        setBlockName("ambientWarSound");
        setBlockTextureName("iron_block");
        setCreativeTab(FlansMod.tabFlanBlocks);
        setHardness(3F);
        setResistance(10F);
        setStepSound(soundTypeMetal);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityAmbientWarSound();
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        refreshSoundState(world, x, y, z);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z,
            Block neighbor) {
        refreshSoundState(world, x, y, z);
    }

    private void refreshSoundState(World world, int x, int y, int z) {
        if (world.isRemote)
            return;
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileEntityAmbientWarSound)
            ((TileEntityAmbientWarSound)tileEntity).refreshPowerState();
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block,
            int metadata) {
        if (!world.isRemote) {
            TileEntity tileEntity = world.getTileEntity(x, y, z);
            if (tileEntity instanceof TileEntityAmbientWarSound)
                ((TileEntityAmbientWarSound)tileEntity).stopSound();
        }
        super.breakBlock(world, x, y, z, block, metadata);
    }
}
