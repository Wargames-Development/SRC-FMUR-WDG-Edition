package com.flansmod.common.network;

import com.flansmod.common.guns.item.ItemGun;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketMinigunStart extends PacketBase {

    boolean isStart = false;

    public PacketMinigunStart(boolean isStart) {
        this.isStart = isStart;
    }

    public PacketMinigunStart() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(isStart);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        isStart = data.readBoolean();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        if(playerEntity != null && playerEntity.getCurrentEquippedItem() != null &&
        playerEntity.getCurrentEquippedItem().getItem() instanceof ItemGun) {
            ItemGun itemGun = (ItemGun) playerEntity.getCurrentEquippedItem().getItem();
            itemGun.minigunSpeed += 2F;
            if(itemGun.minigunSpeed > itemGun.type.minigunStartSpeed) {
                itemGun.minigunSpeed = itemGun.type.minigunStartSpeed + 2;
            }
        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
