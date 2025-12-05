package com.flansmod.common.mob.helper;

import com.flansmod.common.guns.item.ItemBullet;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.BulletType;
import com.flansmod.common.guns.type.GrenadeType;
import com.flansmod.common.guns.type.ShootableType;
import com.flansmod.common.mob.*;
import com.flansmod.common.network.PacketPlaySound;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FireHelper {

    public EntitySoldier entity;

    public float shootDelay = 0;
    public int restTimeCount = 0;
    private int shootTimeCount = 0;


    public FireHelper(EntitySoldier soldier) {
        this.entity = soldier;
    }

    public static float randomShootDelay(float x) {
        Random rand = ThreadLocalRandom.current();
        float y = x * 2;
        int range = (int) (y - x);
        if (range <= 0) {
            return x;
        }
        float randomNumber = rand.nextInt(range) + x;
        return Math.max(x, randomNumber);
    }

    public EnumWeaponState onUpdateShoot() {

        SoldierType type = entity.type;
        ItemStack bulletStack = entity.bulletStack;
        ItemStack currentWeapon = entity.currentWeapon;

        if (entity.currentWeapon == null) {
            entity.weaponState = EnumWeaponState.IDLE;
            return EnumWeaponState.IDLE;
        }

//        if (entity.target != null && this.entity.getDistanceToEntity(entity.target) > type.distToSneak) {
//            entity.setSneaking(true);
//        } else {
//            entity.setSneaking(false);
//        }

        if (bulletStack == null) {
            entity.weaponState = EnumWeaponState.NO_AMMO;
            return EnumWeaponState.NO_AMMO;
        }
        else if (bulletStack.getItemDamage() >= bulletStack.getMaxDamage()) {
            entity.bulletStack = null;
            entity.weaponState = EnumWeaponState.NO_AMMO;
            return EnumWeaponState.NO_AMMO;
        }

        if (shootDelay > 0)
            shootDelay--;

        if (restTimeCount > 0)
            restTimeCount--;


        if (!entity.worldObj.isRemote && entity.target != null && restTimeCount == 0 && entity.lockOnTimeCount >= type.shootStartTick && currentWeapon.getItem() instanceof ItemGun) {

            ItemGun gun = (ItemGun) currentWeapon.getItem();
            if (shootDelay <= 0) {
                shootDelay = randomShootDelay(gun.type.getShootDelay());
                entity.state = EnumSoldierState.SHOOTING;

                ShootableType bullet;
                if (gun.type.ammo.size() > 0) {
                    bullet = gun.type.ammo.get(0);
                    if (bullet.getClass() == GrenadeType.class) {
                        entity.weaponState = EnumWeaponState.IDLE;
                        return EnumWeaponState.IDLE;
                    }
                } else {
                    entity.weaponState = EnumWeaponState.IDLE;
                    return EnumWeaponState.IDLE;
                }

                if (bulletStack.getItem() != null && bulletStack.getItem() instanceof ItemBullet) {
                    ItemBullet itemBullet = (ItemBullet) bulletStack.getItem();

                    int numBullets = -1;
                    float spread = this.entity.getDistanceToEntity(entity.target) > type.distToADS
                            ? gun.type.getADSSpread(currentWeapon, entity.isSneaking(), entity.isSprinting())
                            : gun.type.getSpread(currentWeapon, entity.isSneaking(), entity.isSprinting());

                    if (bullet instanceof BulletType) {
                        if (gun.type.allowNumBulletsByBulletType) {
                            numBullets = ((BulletType) bullet).numBullets;
                        }
                        if (gun.type.allowSpreadByBullet) {
                            spread = ((BulletType) bullet).bulletSpread;
                        }
                    }

                    spread *= type.spreadMultiplier;

                    if (numBullets <= 0) {
                        numBullets = gun.type.getNumBullets(currentWeapon);
                    }

                    for (int k = 0; k < numBullets; k++) {
                        entity.worldObj.spawnEntityInWorld(itemBullet.getEntity(
                                entity.worldObj,
                                Vec3.createVectorHelper(this.entity.posX, this.entity.posY + this.entity.getEyeHeight(), this.entity.posZ),
                                entity.rotationYaw,
                                entity.rotationPitch,
                                entity,
                                spread,
                                gun.type.getDamage(currentWeapon) / 2,
                                gun.type.getBulletSpeed(currentWeapon, bulletStack),
                                bulletStack.getItemDamage(),
                                gun.type));
                    }

                    bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);

                    int countRest = Math.min(type.countRestAfterShoot, itemBullet.type.roundsPerItem - bulletStack.getItemDamage());

                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, gun.type.gunSoundRange, entity.dimension, gun.type.shootSound, gun.type.distortSound);

                    if (shootTimeCount >= countRest && !entity.worldObj.isRemote) {
                        shootTimeCount = 0;
                        restTimeCount = countRest < SoldierType.randomInt(5, 10) ? 0 : type.restTime;
                    }
                    shootTimeCount++;
                } else {
                    entity.weaponState = EnumWeaponState.IDLE;
                    return EnumWeaponState.IDLE;
                }

            }
        } else {
            //if(state == EnumSoldierState.SHOOTING) state = EnumSoldierState.LOCKING;
            entity.weaponState = EnumWeaponState.IDLE;
            return EnumWeaponState.IDLE;
        }

        entity.weaponState = EnumWeaponState.SHOOTING;
        return EnumWeaponState.SHOOTING;
    }


    public EnumWeaponState onUpdateReload() {

        if (entity.currentWeapon == null) {
            entity.weaponState = EnumWeaponState.IDLE;
            return EnumWeaponState.IDLE;
        }
        if (!(entity.currentWeapon.getItem() instanceof ItemGun)) {
            entity.weaponState = EnumWeaponState.IDLE;
            return EnumWeaponState.IDLE;
        }

        ItemGun gun = (ItemGun) entity.currentWeapon.getItem();
        ShootableType bullet;
        if (gun.type.ammo.size() > 0) {
            bullet = gun.type.ammo.get(0);
            if (entity.bulletStack == null) {
                entity.reloadingTimeCount++;

                if (entity.reloadingTimeCount == 1)
                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, gun.type.reloadSoundRange, entity.dimension, gun.type.reloadSound, false);
                if (entity.reloadingTimeCount >= gun.type.reloadTime) {
                    entity.bulletStack = new ItemStack(bullet.item);
                    entity.reloadingTimeCount = 0;
                    entity.state = EnumSoldierState.IDLE;
                    entity.escapeHelper.isEscaping = false;
                    entity.weaponState = EnumWeaponState.FULL_AMMO;
                    return EnumWeaponState.FULL_AMMO;
                } else {
                    entity.weaponState = EnumWeaponState.RELOADING;
                    return EnumWeaponState.RELOADING;
                }
            } else {
                entity.reloadingTimeCount = 0;
            }
        }
        entity.weaponState = EnumWeaponState.IDLE;
        return EnumWeaponState.IDLE;
    }

}
