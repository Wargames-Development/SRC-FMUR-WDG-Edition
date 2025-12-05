package com.flansmod.common.eventhandlers;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.mob.EntityCorpse;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ItemCorpseSpawner;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.scoreboard.Team;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

@SuppressWarnings("unused")
public class PlayerDeathEventListener {

    public PlayerDeathEventListener() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
	@SubscribeEvent
	public void PlayerDied(LivingDeathEvent DamageEvent) {

		Entity sourceEntity = DamageEvent.source.getSourceOfDamage();


//		//AI击杀AI，玩家击杀AI
//		if(!DamageEvent.entityLiving.worldObj.isRemote && DamageEvent.entityLiving instanceof EntitySoldier){
//
//			// EntityBullet   EntityPlayerMP  EntitySoldier  EntitySoldier  (Server)
//			FlansMod.log(souceEntity + "  " + DamageEvent.source.getEntity() + " " + DamageEvent.entityLiving + " " + DamageEvent.entity);
//
//			if(souceEntity instanceof EntityBullet || souceEntity instanceof EntityGrenade){
//				InfoType info;
//				EntityLivingBase killer;
//				EntityLivingBase killed = DamageEvent.entityLiving;
//
//				if(souceEntity instanceof EntityGrenade) {
//					killer = ((EntityGrenade) souceEntity).thrower;
//					info = ((EntityGrenade) souceEntity).type;
//					FlansMod.getPacketHandler().sendToDimension(
//							new PacketKillMessage(false,
//									info,
//									killer.getHeldItem() != null ? killer.getHeldItem().getItemDamage() : 0,
//									"f" + killed.getCommandSenderName(),
//									"f" + killer.getCommandSenderName(),
//									killed.getDistanceToEntity(killer)),
//							DamageEvent.entityLiving.dimension);
//				}
//				else {
//					killer = (EntityLivingBase) ((EntityBullet) souceEntity).owner;
//					info = ((EntityBullet) souceEntity).firedFrom;
//					FlansMod.getPacketHandler().sendToDimension(
//							new PacketKillMessage(((EntityBullet) souceEntity).lastHitHeadshot,
//									info,
//									killer.getHeldItem() != null ? killer.getHeldItem().getItemDamage() : 0,
//									"f" + killed.getCommandSenderName(),
//									"f" + killer.getCommandSenderName(),
//									killed.getDistanceToEntity(killer)),
//							DamageEvent.entityLiving.dimension);
//				}
//
//
//			}
//
//		}


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
