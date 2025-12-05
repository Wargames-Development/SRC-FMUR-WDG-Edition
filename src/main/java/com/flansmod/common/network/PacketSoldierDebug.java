package com.flansmod.common.network;

import com.flansmod.common.mob.EntitySoldier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketSoldierDebug extends PacketBase {

    public int entityID;
    double posX;
    double posY;
    double posZ;

    public PacketSoldierDebug() {
    }

    public PacketSoldierDebug(int entityID, double posX, double posY, double posZ) {
        this.entityID = entityID;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityID);
        data.writeDouble(posX);
        data.writeDouble(posY);
        data.writeDouble(posZ);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityID = data.readInt();
        posX = data.readDouble();
        posY = data.readDouble();
        posZ = data.readDouble();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        EntitySoldier soldier = (EntitySoldier) playerEntity.worldObj.getEntityByID(entityID);
        soldier.moveHelper.setMoveTo(posX, posY, posZ, true);
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
//        EntitySoldier soldier = (EntitySoldier) clientPlayer.worldObj.getEntityByID(entityID);
//        soldier.moveHelper.setMoveTo(posX, posY, posZ, true);
//        System.out.println("PacketSoldierDebug Client");
    }
}
