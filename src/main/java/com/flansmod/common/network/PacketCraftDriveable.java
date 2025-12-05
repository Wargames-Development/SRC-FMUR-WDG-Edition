package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketCraftDriveable extends PacketBase { // 制造载具发包
    public String shortName;

    @SuppressWarnings("unused")
    public PacketCraftDriveable() { // 无参构造方法
    }

    public PacketCraftDriveable(String s) {
        shortName = s;
    } // 构造方法

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        writeUTF(data, shortName);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        shortName = readUTF(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        DriveableType type = DriveableType.getDriveable(shortName);
        //Try to craft the driveable
        FlansMod.proxy.craftDriveable(playerEntity, type); // 调用代理类的craftDriveable方法
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received driveable repair packet on client side. Skipping.");
    }
}