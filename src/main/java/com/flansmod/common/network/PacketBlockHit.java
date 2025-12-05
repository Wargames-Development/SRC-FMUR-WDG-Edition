package com.flansmod.common.network;

import com.flansmod.client.Dps;
import com.flansmod.client.FlansModClient;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketBlockHit extends PacketBase{

    float damage;

    public PacketBlockHit(float damage) {
        this.damage = damage;
    }

    public PacketBlockHit() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeFloat(damage);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        damage = data.readFloat();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        Dps.addDamage(damage);
        FlansModClient.dpsDisplayCountdown = 20;
    }
}
