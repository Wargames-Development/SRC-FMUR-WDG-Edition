package com.flansmod.common.network;

import com.flansmod.common.mob.EntitySoldier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;

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
        if (!MinecraftServer.getServer().getConfigurationManager().func_152596_g(playerEntity.getGameProfile())
                || Double.isNaN(posX) || Double.isInfinite(posX)
                || Double.isNaN(posY) || Double.isInfinite(posY)
                || Double.isNaN(posZ) || Double.isInfinite(posZ)
                || playerEntity.getDistanceSq(posX, posY, posZ) > 90000D)
            return;

        Entity entity = playerEntity.worldObj.getEntityByID(entityID);
        if (!(entity instanceof EntitySoldier) || playerEntity.getDistanceSqToEntity(entity) > 90000D)
            return;

        EntitySoldier soldier = (EntitySoldier) entity;
        soldier.moveHelper.setMoveTo(posX, posY, posZ, true);
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
//        EntitySoldier soldier = (EntitySoldier) clientPlayer.worldObj.getEntityByID(entityID);
//        soldier.moveHelper.setMoveTo(posX, posY, posZ, true);
//        System.out.println("PacketSoldierDebug Client");
    }
}
