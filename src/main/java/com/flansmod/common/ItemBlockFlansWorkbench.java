package com.flansmod.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemBlockFlansWorkbench extends ItemBlockManyNames {
    public ItemBlockFlansWorkbench(Block block) {
        super(block);
    }

    @Override
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z,
                                int side, float hitX, float hitY, float hitZ, int metadata) {
        if (metadata != 1) {
            return super.placeBlockAt(stack, player, world, x, y, z, side, hitX, hitY, hitZ, metadata);
        }

        int facing = MathHelper.floor_double(player.rotationYaw * 4F / 360F + 0.5D) & 3;
        int otherX = x + BlockFlansWorkbench.partX(facing);
        int otherZ = z + BlockFlansWorkbench.partZ(facing);
        if (!player.canPlayerEdit(otherX, y, otherZ, side, stack)
                || !world.canPlaceEntityOnSide(field_150939_a, otherX, y, otherZ,
                false, side, player, stack)) {
            return false;
        }

        if (!super.placeBlockAt(stack, player, world, x, y, z, side, hitX, hitY, hitZ,
                1 | facing << 2)) {
            return false;
        }
        if (world.setBlock(otherX, y, otherZ, field_150939_a, 3 | facing << 2, 3)) {
            return true;
        }

        world.setBlockToAir(x, y, z);
        return false;
    }
}
