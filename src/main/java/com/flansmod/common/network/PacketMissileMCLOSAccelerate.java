package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.mob.EntitySoldier;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketMissileMCLOSAccelerate extends PacketBase {

    int entityId;

    public PacketMissileMCLOSAccelerate() {}

    public PacketMissileMCLOSAccelerate(int entityId) {
        this.entityId = entityId;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityId);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityId = data.readInt();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        PlayerData data = PlayerHandler.getPlayerData(playerEntity, Side.SERVER);
        if (data == null)
            return;
        data.playerControlledBullets.removeIf(bullet -> bullet == null || bullet.isDead);
        for (EntityBullet bullet : data.playerControlledBullets) {
            if(!bullet.isAccelerating) {
                bullet.canAccelerate = true;
            }
        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        Entity entity = clientPlayer.worldObj.getEntityByID(entityId);
        if(entity instanceof EntityBullet) {
            ((EntityBullet) entity).isAccelerating = true;
        }
    }
}
