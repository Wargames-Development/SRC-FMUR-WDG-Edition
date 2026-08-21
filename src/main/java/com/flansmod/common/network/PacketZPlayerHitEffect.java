package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/** Server confirmation that the receiving player was damaged by a bullet. */
public class PacketZPlayerHitEffect extends PacketBase {
    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        FlansMod.log("Received unexpected PacketZPlayerHitEffect on server.");
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        // Retained as a no-op so removing the hit overlay does not change packet registration order.
    }
}
