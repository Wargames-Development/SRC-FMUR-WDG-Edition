package com.flansmod.common.network;

import com.flansmod.common.mob.EntitySoldier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

import static cpw.mods.fml.common.network.ByteBufUtils.readItemStack;
import static cpw.mods.fml.common.network.ByteBufUtils.writeItemStack;

public class PacketSoldierSlot extends PacketBase{

    public int entityID;
    public ItemStack gunSlot;
    public ItemStack grenadeSlot;
    public ItemStack armourSlot;

    public PacketSoldierSlot(int entityID, ItemStack gunSlot, ItemStack grenadeSlot, ItemStack armourSlot) {
        this.entityID = entityID;
        this.gunSlot = gunSlot;
        this.grenadeSlot = grenadeSlot;
        this.armourSlot = armourSlot;
    }

    public PacketSoldierSlot() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityID);
        writeItemStack(data, gunSlot);
        writeItemStack(data, grenadeSlot);
        writeItemStack(data, armourSlot);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityID = data.readInt();
        gunSlot = readItemStack(data);
        grenadeSlot = readItemStack(data);
        armourSlot = readItemStack(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        EntitySoldier soldier = (EntitySoldier) playerEntity.worldObj.getEntityByID(entityID);
        if(soldier != null){
            soldier.currentWeapon = soldier.gunStack = gunSlot;
            soldier.grenadeStack = grenadeSlot;
            soldier.armourStack = armourSlot;
        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        EntitySoldier soldier = (EntitySoldier) clientPlayer.worldObj.getEntityByID(entityID);
        if(soldier != null){
            soldier.currentWeapon = soldier.gunStack = gunSlot;
            soldier.grenadeStack = grenadeSlot;
            soldier.armourStack = armourSlot;
        }
    }
}
