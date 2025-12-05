package com.flansmod.common.guns;

import com.flansmod.common.FlansMod;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.IChatComponent;

public class EntityDamageSourceFlans extends EntityDamageSourceIndirect {

    public InfoType weapon;
    public EntityLivingBase shooter;
    public boolean headshot;
    public boolean melee;

    public EntityDamageSourceFlans(String s, Entity entity, EntityLivingBase player, InfoType wep, boolean head, boolean isMelee) {
        super(s, entity, player);
        weapon = wep;
        shooter = player;
        headshot = head;
        melee = isMelee;
    }

    public Entity getDamageSourceEntity() {
        return this.damageSourceEntity;
    }

    @Override
    public IChatComponent func_151519_b(EntityLivingBase living) {
        if (shooter == null) {
            return super.func_151519_b(living);
        }

        //FlansMod.log("victim: " + living.getCommandSenderName() + " killer: " + shooter.getCommandSenderName());

        if(living instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) living;
            float dist = player.getDistanceToEntity(shooter);

            //FlansMod.log("Player Death" + living.dimension);

            FlansMod.getPacketHandler().sendToDimension(
                    new PacketKillMessage(
                            headshot,
                            weapon,
                            shooter.getHeldItem() != null ? shooter.getHeldItem().getItemDamage() : 0,
                            ("f" + player.getCommandSenderName()),
                            ("f" + shooter.getCommandSenderName()),
                            dist
                    ),
                    living.dimension);
        } else if (living instanceof EntitySoldier){
            EntitySoldier soldier = (EntitySoldier) living;
            float dist = soldier.getDistanceToEntity(shooter);

            //FlansMod.log("AI Death" + living.dimension);

            FlansMod.getPacketHandler().sendToDimension(
                    new PacketKillMessage(
                            headshot,
                            weapon,
                            shooter.getHeldItem() != null ? shooter.getHeldItem().getItemDamage() : 0,
                            ("f" + soldier.getCommandSenderName()),
                            ("f" + shooter.getCommandSenderName()),
                            dist
                    ),
                    living.dimension);
        }

        return new ChatComponentText("");
    }
}
