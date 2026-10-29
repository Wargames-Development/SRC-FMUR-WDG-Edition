package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/** Server-provided operator status for the client-only infantry camera rule. */
public class PacketZZOpStatus extends PacketBase {
    private boolean operator;

    public PacketZZOpStatus() {
    }

    public PacketZZOpStatus(boolean operator) {
        this.operator = operator;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(operator);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        operator = data.readBoolean();
    }

    @Override
    public void handleServerSide(EntityPlayerMP player) {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer player) {
        FlansModClient.isOperator = operator;
    }
}
