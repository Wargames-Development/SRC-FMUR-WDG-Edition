package com.flansmod.common;

import com.flansmod.common.tileentity.TileEntityCinematicEmitter;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCinematicEmitter extends Block implements ITileEntityProvider {
    public final String particleName;
    public final int particlesPerTick;

    public BlockCinematicEmitter() {
        this("oilFire", "coal_block", "flansmod.oilfire", 3);
    }

    public BlockCinematicEmitter(String name, String texture, String particleName, int particlesPerTick) {
        super(Material.iron);
        this.particleName = particleName;
        this.particlesPerTick = particlesPerTick;
        setBlockName(name);
        setBlockTextureName(texture);
        setCreativeTab(FlansMod.tabFlanBlocks);
        setHardness(3F);
        setResistance(10F);
        setStepSound(soundTypeMetal);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityCinematicEmitter();
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        refreshPower(world, x, y, z);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {
        refreshPower(world, x, y, z);
    }

    public void refreshPower(World world, int x, int y, int z) {
        if (!world.isRemote) {
            int powered = world.isBlockIndirectlyGettingPowered(x, y, z) ? 1 : 0;
            // Vanilla chunk metadata supplies the same server-owned state to late joiners.
            if (world.getBlockMetadata(x, y, z) != powered)
                world.setBlockMetadataWithNotify(x, y, z, powered, 2);
        }
    }
}
