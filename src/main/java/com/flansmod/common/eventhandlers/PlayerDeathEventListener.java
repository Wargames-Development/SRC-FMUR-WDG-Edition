package com.flansmod.common.eventhandlers;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.medical.CorpseMedicalService;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.types.InfoType;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;

@SuppressWarnings("unused")
public class PlayerDeathEventListener {

    public PlayerDeathEventListener() {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void PlayerDied(LivingDeathEvent DamageEvent) {
        Entity sourceEntity = DamageEvent.source.getSourceOfDamage();

        if (!DamageEvent.entityLiving.worldObj.isRemote && DamageEvent.entityLiving instanceof EntityPlayer) {
            CorpseMedicalService.spawnCorpseForPlayer((EntityPlayer) DamageEvent.entityLiving);
        }

        if(DamageEvent.source.getDamageType().equalsIgnoreCase("explosion") &&
            (sourceEntity instanceof EntityGrenade || sourceEntity instanceof EntityBullet)
        ) {

            if(DamageEvent.entityLiving instanceof EntityPlayer || DamageEvent.entityLiving instanceof EntitySoldier){
                InfoType info;
                EntityLivingBase killer;
                EntityLivingBase killed = DamageEvent.entityLiving;

                if(sourceEntity instanceof EntityGrenade) {
                    killer = ((EntityGrenade) sourceEntity).thrower;
                    info = ((EntityGrenade) sourceEntity).type;
                }
                else {
                    killer = (EntityPlayer) ((EntityBullet) sourceEntity).owner;
                    info = ((EntityBullet) sourceEntity).type;
                }

                if (killer != null && killer.getHeldItem() != null) {
                    FlansMod.getPacketHandler().sendToDimension(
                            new PacketKillMessage(false,
                                    info,
                                    killer.getHeldItem().getItemDamage(),
                                    "f" + killed.getCommandSenderName(),
                                    "f" + killer.getCommandSenderName(),
                                    killed.getDistanceToEntity(killer)),
                            DamageEvent.entityLiving.dimension);
                }
            }

        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onPlayerDrops(PlayerDropsEvent event) {
        CorpseMedicalService.captureDeathDrops(event);
    }

    @SubscribeEvent
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        if (!CorpseMedicalService.isInternalReviveInProgress(event.player)) {
            CorpseMedicalService.clearCorpseForPlayer(event.player);
        }
    }

    @SubscribeEvent
    public void onPlayerLogout(PlayerLoggedOutEvent event) {
        CorpseMedicalService.clearCorpseForPlayer(event.player);
    }
}
