package com.flansmod.common.network;

import com.flansmod.common.mob.EntitySoldier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketSoldierAim extends PacketBase {

    public int entityID;
    public float aimYaw;
    public float aimPitch;
    public boolean isAiming;

    public PacketSoldierAim(int entityID, float aimYaw, float aimPitch, boolean isAiming) {
        this.entityID = entityID;
        this.aimYaw = aimYaw;
        this.aimPitch = aimPitch;
        this.isAiming = isAiming;
    }

    public PacketSoldierAim() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityID);
        data.writeFloat(aimYaw);
        data.writeFloat(aimPitch);
        data.writeBoolean(isAiming);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityID = data.readInt();
        aimYaw = data.readFloat();
        aimPitch = data.readFloat();
        isAiming = data.readBoolean();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        EntitySoldier soldier = (EntitySoldier) clientPlayer.worldObj.getEntityByID(entityID);
        if(soldier != null){
            soldier.rotationYaw = aimYaw;
            soldier.rotationPitch = aimPitch;
            soldier.aiming = isAiming;
        }
    }
}
