package com.flansmod.common.network;

import com.flansmod.client.gui.GuiTeamSelect;
import com.flansmod.common.teams.PlayerClass;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketSendPlayerClasses extends PacketBase {
    public PlayerClass[] classes;

    @SuppressWarnings("unused")
    public PacketSendPlayerClasses() {
    }

    public PacketSendPlayerClasses(PlayerClass[] classes) {
        this.classes = classes;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {

        data.writeByte(classes.length);
        for (PlayerClass playerClass : classes) {
            writeUTF(data, playerClass.shortName);
        }
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        byte numClasses = data.readByte();
        classes = new PlayerClass[numClasses];
        for(int i = 0; i < numClasses; i++)
        {
            classes[i] = PlayerClass.getClass(readUTF(data));
        }
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        Minecraft.getMinecraft().displayGuiScreen(new GuiTeamSelect(classes));
    }
}

