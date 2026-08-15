package com.flansmod.common.network;

import com.flansmod.common.teams.ItemNightVisionGoggles;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

/** Client intent to toggle the GPNVG in the dedicated night-vision slot. */
public class PacketToggleNightVisionGoggles extends PacketBase {
    public PacketToggleNightVisionGoggles() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void handleServerSide(EntityPlayerMP player) {
        PlayerEquipmentInventory equipment = PlayerEquipmentInventory.get(player);
        ItemStack goggles = equipment == null ? null
                : equipment.getStackInSlot(PlayerEquipmentInventory.NIGHT_VISION_SLOT);
        if (goggles == null || !(goggles.getItem() instanceof ItemNightVisionGoggles)) {
            return;
        }

        long worldTime = player.worldObj.getTotalWorldTime();
        if (!ItemNightVisionGoggles.canToggle(goggles, worldTime)) {
            return;
        }

        boolean lowered = !ItemNightVisionGoggles.isLowered(goggles);
        ItemNightVisionGoggles.setLowered(goggles, lowered);
        ItemNightVisionGoggles.markToggled(goggles, worldTime);
        if (lowered) {
            player.playSound("flansmod:nvg_on", 0.8F, 1F);
        }
        equipment.markDirty();
        player.inventoryContainer.detectAndSendChanges();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
