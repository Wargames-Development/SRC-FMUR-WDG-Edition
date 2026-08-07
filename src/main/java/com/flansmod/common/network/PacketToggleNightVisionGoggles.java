package com.flansmod.common.network;

import com.flansmod.common.teams.ItemNightVisionGoggles;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

/** Client request to toggle the GPNVG currently equipped in the boots slot. */
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
        ItemStack goggles = player.getEquipmentInSlot(1);
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
        player.inventory.markDirty();
        player.inventoryContainer.detectAndSendChanges();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
