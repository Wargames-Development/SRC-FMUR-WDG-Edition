package com.flansmod.api;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.FlansModExplosion;
import com.flansmod.common.network.PacketAPSMarker;
import com.flansmod.common.network.PacketPlaySound;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class FMUR_API {

    public static boolean bulletDestructedByAPS(Entity entity, EntityLivingBase user) {
        if (entity instanceof EntityBullet && ((EntityBullet) entity).type.canBeDestructByAPS) {
            EntityBullet bullet = (EntityBullet) entity;
            if (bullet.owner instanceof EntityPlayer && !((EntityPlayer) bullet.owner).isOnSameTeam(user)) {
                bullet.setDead();
                sendAPSMarker((EntityPlayerMP) bullet.owner);
                return true;
            }
        }
        return false;
    }

    public static boolean grenadeDestructedByAPS(Entity entity, EntityLivingBase user) {
        if (entity instanceof EntityGrenade && ((EntityGrenade) entity).type.canBeDestructByAPS) {
            EntityGrenade bullet = (EntityGrenade) entity;
            if (bullet.thrower instanceof EntityPlayer && !bullet.thrower.isOnSameTeam(user)) {
                bullet.setDead();
                sendAPSMarker((EntityPlayerMP) bullet.thrower);
                return true;
            }
        }
        return false;
    }


    public static void sendAPSMarker(EntityPlayerMP e) {
        FlansMod.getPacketHandler().sendTo(new PacketAPSMarker(), e);
    }


}
