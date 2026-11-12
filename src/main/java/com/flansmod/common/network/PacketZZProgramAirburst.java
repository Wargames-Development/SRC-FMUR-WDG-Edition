package com.flansmod.common.network;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketZZProgramAirburst extends PacketBase {
    private int slot;

    public PacketZZProgramAirburst() {
    }

    public PacketZZProgramAirburst(int slot) {
        this.slot = slot;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeByte(slot);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        slot = data.readableBytes() == 1 ? data.readUnsignedByte() : -1;
    }

    @Override
    public void handleServerSide(EntityPlayerMP player) {
        if (slot < 0 || slot > 8 || slot != player.inventory.currentItem || !player.isEntityAlive())
            return;
        PlayerData data = PlayerHandler.getPlayerData(player);
        if (data != null)
            data.requestAirburstProgram(slot);
    }

    @Override
    public void handleClientSide(EntityPlayer player) {
    }
}
