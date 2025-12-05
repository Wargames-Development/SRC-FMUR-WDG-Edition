package com.flansmod.common.guns.raytracing;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

public class SoldierHitBox {
    /**
     *
     */
    public EntitySoldier soldier;
    /**
     * The angles of this box
     */
    public RotatedAxes axes;
    /**
     * The origin of rotation for this box
     */
    public Vector3f rP;
    /**
     * The lower left corner of this box
     */
    public Vector3f o;
    /**
     * The dimensions of this box
     */
    public Vector3f d;

    /**
     * The velocity of this box, in world axes.
     */
    public Vector3f vel;

    /**
     * The type of hitbox
     */
    public EnumHitboxType type;

    public SoldierHitBox(EntitySoldier player, RotatedAxes axes, Vector3f rotationPoint, Vector3f origin, Vector3f dimensions, EnumHitboxType type) {
        this.soldier = player;
        this.axes = axes;
        this.o = origin;
        this.d = dimensions;
        this.type = type;
        this.rP = rotationPoint;
    }

    public SoldierBulletHit raytrace(Vector3f origin, Vector3f motion) {
        origin = Vector3f.sub(origin, this.rP, null);
        origin = this.axes.findGlobalVectorLocally(origin);
        motion = this.axes.findGlobalVectorLocally(motion);
        float intersectTime;
        float intersectX;
        float intersectZ;
        if (motion.x != 0.0F) {
            if (origin.x < this.o.x) {
                intersectTime = (this.o.x - origin.x) / motion.x;
                intersectX = origin.y + motion.y * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.y && intersectX <= this.o.y + this.d.y && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new SoldierBulletHit(this, intersectTime);
                }
            } else if (origin.x > this.o.x + this.d.x) {
                intersectTime = (this.o.x + this.d.x - origin.x) / motion.x;
                intersectX = origin.y + motion.y * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.y && intersectX <= this.o.y + this.d.y && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new SoldierBulletHit(this, intersectTime);
                }
            }
        }

        if (motion.z != 0.0F) {
            if (origin.z < this.o.z) {
                intersectTime = (this.o.z - origin.z) / motion.z;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.y + motion.y * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.y && intersectZ <= this.o.y + this.d.y) {
                    return new SoldierBulletHit(this, intersectTime);
                }
            } else if (origin.z > this.o.z + this.d.z) {
                intersectTime = (this.o.z + this.d.z - origin.z) / motion.z;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.y + motion.y * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.y && intersectZ <= this.o.y + this.d.y) {
                    return new SoldierBulletHit(this, intersectTime);
                }
            }
        }

        if (motion.y != 0.0F) {
            if (origin.y < this.o.y) {
                intersectTime = (this.o.y - origin.y) / motion.y;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new SoldierBulletHit(this, intersectTime);
                }
            } else if (origin.y > this.o.y + this.d.y) {
                intersectTime = (this.o.y + this.d.y - origin.y) / motion.y;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new SoldierBulletHit(this, intersectTime);
                }
            }
        }

        return null;
    }

    public float hitByBullet(EntityBullet bullet, float penetratingPower, double distanceDamageModifier) {
        if (bullet.type.setEntitiesOnFire)
            soldier.setFire(bullet.type.setEntitiesOnFireTime);
        for (PotionEffect effect : bullet.type.hitEffects) {
            soldier.addPotionEffect(new PotionEffect(effect));
        }

        //穿甲系统 暂时禁用
//        float headPenRes = (player.getCurrentArmor(3)) == null || !(player.getCurrentArmor(3).getItem()
//                instanceof ItemTeamArmour)) ? 1F : ((ItemTeamArmour) player.getCurrentArmor(3).getItem())
//                .type.penetrationResistance;
//        float chestPenRes = (player.getCurrentArmor(2) == null || !(player.getCurrentArmor(2).getItem()
//                instanceof ItemTeamArmour)) ? 1F : ((ItemTeamArmour) player.getCurrentArmor(2).getItem())
//                .type.penetrationResistance;
//        float legsPenRes = (player.getCurrentArmor(1) == null || !(player.getCurrentArmor(1).getItem()
//                instanceof ItemTeamArmour)) ? 0.65F : ((ItemTeamArmour) player.getCurrentArmor(1).getItem())
//                .type.penetrationResistance;
//        float feetPenRes = (player.getCurrentArmor(0) == null || !(player.getCurrentArmor(0).getItem()
//                instanceof ItemTeamArmour)) ? 0.35F : ((ItemTeamArmour) player.getCurrentArmor(0).getItem())
//                .type.penetrationResistance;

//        float totalPenetrationResistance = 0;
//
//        if (type == EnumHitboxType.HEAD) {
//            totalPenetrationResistance = headPenRes;
//        } else if(type == EnumHitboxType.LEGS){
//            totalPenetrationResistance = legsPenRes + feetPenRes;
//        } else {
//            totalPenetrationResistance = chestPenRes;
//        }
//

        float damageModifier = 1;

//        if (penetratingPower <= 0.7F * totalPenetrationResistance && FlansMod.useNewPenetrationSystem) {
//            damageModifier = (float) Math.pow(penetratingPower / (0.7F * totalPenetrationResistance), 2.5);
//        } else if (!FlansMod.useNewPenetrationSystem) {
//            damageModifier = bullet.type.penetratingPower < 0.1F ? penetratingPower / bullet.type.penetratingPower : 1;
//        }

//        bullet.lastHitPenAmount = Math.max(bullet.lastHitPenAmount, damageModifier);

        damageModifier *= distanceDamageModifier;

        switch (type) {
            case HEAD:
                damageModifier *= bullet.type.shootHeadMultiplier;
                //bullet.lastHitHeadshot = true;
                break;
            case LEGS:
                damageModifier *= bullet.type.shootLegMultiplier;
                break;
            case LEFTARM:
                damageModifier *= bullet.type.shootArmMultiplier;
                break;
            case RIGHTARM:
                damageModifier *= bullet.type.shootArmMultiplier;
                break;
        }

        switch (type) {
            case LEGS:
            case BODY:
            case HEAD:
            case LEFTARM:
            case RIGHTARM: {
                //Calculate the hit damage
                float hitDamage = bullet.damage * bullet.type.damageVsPlayer * damageModifier;
                //Create a damage source object
                DamageSource damagesource = bullet.owner == null ? DamageSource.generic : bullet.getBulletDamage(type == EnumHitboxType.HEAD);
                //When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here

                Vector3f motBefore = new Vector3f(soldier.motionX, soldier.motionY, soldier.motionZ);
                //Attack the entity!
                if (soldier.attackEntityFrom(damagesource, hitDamage)) {
                    //If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
                    soldier.arrowHitTimer++;
                    soldier.hurtResistantTime = soldier.maxHurtResistantTime / 2;
                    //Yuck.
                    //PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
                }

                // Handle knockback by finding entity motion before and after, and reapplying to negate effect of vanilla code.
                Vector3f motAfter = new Vector3f(soldier.motionX, soldier.motionY, soldier.motionZ);
                Vector3f deltav = new Vector3f();
                Vector3f.sub(motAfter, motBefore, deltav);
                deltav.scale(1-bullet.type.knockbackModifier);
                if (bullet.type.knockbackModifier > 2) {
                    deltav.y = (float) Math.sqrt(deltav.y);
                }
                soldier.motionX -= deltav.x;
                soldier.motionY -= deltav.y;
                soldier.motionZ -= deltav.z;

//                if (FlansMod.useNewPenetrationSystem) {
//                    return penetratingPower - totalPenetrationResistance;
//                } else {
//                    return penetratingPower - 1;
//                }
            }
            case RIGHTITEM: {
//                ItemStack currentStack = player.getCurrentEquippedItem();
//                if (currentStack != null && currentStack.getItem() instanceof ItemGun) {
//                    GunType gunType = ((ItemGun) currentStack.getItem()).type;
//                    //
//                    return penetratingPower - gunType.shieldDamageAbsorption;
//                } else return penetratingPower;
            }
            case LEFTITEM: {
//                PlayerData data = PlayerHandler.getPlayerData(player);
//                if (data.offHandGunSlot != 0) {
//                    ItemStack leftHandStack = null;
//                    if (player.worldObj.isRemote && !FlansMod.proxy.isThePlayer(player))
//                        leftHandStack = data.offHandGunStack;
//                    else leftHandStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
//
//                    if (leftHandStack != null && leftHandStack.getItem() instanceof ItemGun) {
//                        GunType leftGunType = ((ItemGun) leftHandStack.getItem()).type;
//                        //e
//                        return penetratingPower - leftGunType.shieldDamageAbsorption;
//                    }
//                }
            }
            default:
                return penetratingPower;
        }
    }
}
