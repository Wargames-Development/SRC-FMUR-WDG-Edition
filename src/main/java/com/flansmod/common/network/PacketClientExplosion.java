package com.flansmod.common.network;

import com.flansmod.common.guns.FlansModExplosion;
import com.flansmod.common.teams.TeamsManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketClientExplosion extends PacketBase {

    public double posX, posY, posZ;

    public PacketClientExplosion(double posX, double posY, double posZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public PacketClientExplosion() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeDouble(posX);
        data.writeDouble(posY);
        data.writeDouble(posZ);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        posX = data.readDouble();
        posY = data.readDouble();
        posZ = data.readDouble();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        new FlansModExplosion(playerEntity.worldObj, null, null, null, posX, posY, posZ,
                2, 1, TeamsManager.explosions , true,
                1, 1, 1, 1, 0, 0);
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {

    }
}
