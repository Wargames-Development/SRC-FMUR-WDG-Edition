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

    // NEW: flag used by FMUR / explosion checks
    public boolean flansExplosion = false;

    // Original constructor (non-explosive damage)
    public EntityDamageSourceFlans(String s, Entity entity, EntityLivingBase player,
                                   InfoType wep, boolean head, boolean isMelee) {
        super(s, entity, player);
        this.weapon = wep;
        this.shooter = player;
        this.headshot = head;
        this.melee = isMelee;
    }

    // NEW: constructor that allows marking this as an explosion
    public EntityDamageSourceFlans(String s, Entity entity, EntityLivingBase player,
                                   InfoType wep, boolean head, boolean isMelee, boolean explosion) {
        super(s, entity, player);
        this.weapon = wep;
        this.shooter = player;
        this.headshot = head;
        this.melee = isMelee;
        this.flansExplosion = explosion;

        // Optional but sensible: mark the vanilla DamageSource as an explosion too.
        // If you want to stick 100% to the decompiled behavior, you can comment this out.
        if (explosion) {
            this.setExplosion();
        }
    }

    public Entity getDamageSourceEntity() {
        return this.damageSourceEntity;
    }

    @Override
    public IChatComponent func_151519_b(EntityLivingBase living) {
        if (shooter == null) {
            return super.func_151519_b(living);
        }

        if (living instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) living;
            float dist = player.getDistanceToEntity(shooter);

            FlansMod.getPacketHandler().sendToDimension(
                    new PacketKillMessage(
                            headshot,
                            weapon,
                            shooter.getHeldItem() != null ? shooter.getHeldItem().getItemDamage() : 0,
                            "f" + player.getCommandSenderName(),
                            "f" + shooter.getCommandSenderName(),
                            dist
                    ),
                    living.dimension
            );
        } else if (living instanceof EntitySoldier) {
            EntitySoldier soldier = (EntitySoldier) living;
            float dist = soldier.getDistanceToEntity(shooter);

            FlansMod.getPacketHandler().sendToDimension(
                    new PacketKillMessage(
                            headshot,
                            weapon,
                            shooter.getHeldItem() != null ? shooter.getHeldItem().getItemDamage() : 0,
                            "f" + soldier.getCommandSenderName(),
                            "f" + shooter.getCommandSenderName(),
                            dist
                    ),
                    living.dimension
            );
        }

        return new ChatComponentText("");
    }
}
