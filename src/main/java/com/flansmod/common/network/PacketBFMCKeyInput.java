package com.flansmod.common.network;

import com.flansmod.common.eventhandlers.BFMCKeyInputEvent;
import com.flansmod.common.eventhandlers.EnumBFMCKeyType;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;

public class PacketBFMCKeyInput extends PacketBase {
    private EnumBFMCKeyType keyType;
    private String playerName;

    public PacketBFMCKeyInput() {
    }

    public PacketBFMCKeyInput(EnumBFMCKeyType keyType, String playerName) {
        this.keyType = keyType;
        this.playerName = playerName;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        writeUTF(data, keyType.name());
        writeUTF(data, playerName);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        keyType = EnumBFMCKeyType.valueOf(readUTF(data));
        playerName = readUTF(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        switch (keyType) {
            case menu:
                BFMCKeyInputEvent e = new BFMCKeyInputEvent(EnumBFMCKeyType.menu, playerName);
                MinecraftForge.EVENT_BUS.post(e);
                break;
            case f10:
                BFMCKeyInputEvent e1 = new BFMCKeyInputEvent(EnumBFMCKeyType.f10, playerName);
                MinecraftForge.EVENT_BUS.post(e1);
                break;
            case taunt:
                BFMCKeyInputEvent e2 = new BFMCKeyInputEvent(EnumBFMCKeyType.taunt, playerName);
                MinecraftForge.EVENT_BUS.post(e2);
                break;
        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {

    }
}
