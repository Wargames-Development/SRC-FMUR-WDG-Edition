package com.flansmod.common.network;

import com.flansmod.common.mob.EntitySoldier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

import static cpw.mods.fml.common.network.ByteBufUtils.readItemStack;
import static cpw.mods.fml.common.network.ByteBufUtils.writeItemStack;

public class PacketSoldierName extends PacketBase{

    public int entityID;
    public String name;
    public String teamName;

    public PacketSoldierName(int entityID, String name, String teamName) {
        this.entityID = entityID;
        this.name = name;
        this.teamName = teamName;
    }

    public PacketSoldierName() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityID);
        writeUTF(data, name);
        writeUTF(data, teamName);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityID = data.readInt();
        name = readUTF(data);
        teamName = readUTF(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        EntitySoldier soldier = (EntitySoldier) clientPlayer.worldObj.getEntityByID(entityID);
        if(soldier != null){
            soldier.name = name;
            soldier.setCustomNameTag(name);
            if (teamName != null && !teamName.isEmpty()) {
                soldier.team = soldier.worldObj.getScoreboard().getTeam(teamName);
            }
        }
    }
}
