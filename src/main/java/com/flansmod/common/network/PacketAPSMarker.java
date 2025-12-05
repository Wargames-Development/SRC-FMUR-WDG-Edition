package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketAPSMarker extends PacketBase{

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {

    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {

    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansModClient.apsMarker = true;
        //TickHandlerClient.apsMarkerTime = 10;
    }
}
