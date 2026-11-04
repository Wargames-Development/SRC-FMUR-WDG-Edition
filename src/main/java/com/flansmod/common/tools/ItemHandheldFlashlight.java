package com.flansmod.common.tools;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.FlashlightState;
import com.flansmod.common.network.PacketToggleFlashlight;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHandheldFlashlight extends Item {
    public ItemHandheldFlashlight() {
        setUnlocalizedName("handheldFlashlight");
        setTextureName(FlansMod.MODID + ":handheld_flashlight");
        setCreativeTab(FlansMod.tabFlanTeams);
        setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (world.isRemote)
            FlansMod.getPacketHandler().sendToServer(new PacketToggleFlashlight(!FlashlightState.isEnabled(stack)));
        return stack;
    }
}
