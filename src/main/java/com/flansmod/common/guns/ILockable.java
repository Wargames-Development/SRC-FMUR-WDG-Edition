package com.flansmod.common.guns;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.hook.MCHeliUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Team;

public interface ILockable {

    default boolean isPlane(Entity target) {
        if (target == null)
            return false;
        return target instanceof EntityPlane || MCHeliUtil.isMCHeliAirVehicle(target);
    }

    default boolean isVehicle(Entity target) {
        if (target == null)
            return false;
        return target instanceof EntityVehicle || MCHeliUtil.isMCHeliGroundVehicle(target);
    }

    default boolean isEnemyPlane(Entity target, EntityPlayer placer) {
        if (!isPlane(target)) return false;
        if(MCHeliUtil.isEnemyUAV(target, placer)) return true;
        else if (target.riddenByEntity instanceof EntityPlayer) {
            EntityPlayer rider = (EntityPlayer) target.riddenByEntity;
            return !rider.isOnSameTeam(placer);
        }
        return false;
    }

    default boolean isEnemyDriveable(Entity target, EntityPlayer placer) {
        if (!isDriveable(target)) return false;
        else if (target.riddenByEntity instanceof EntityPlayer) {
            EntityPlayer rider = (EntityPlayer) target.riddenByEntity;
            return !rider.isOnSameTeam(placer);
        }
        return false;
    }

    default boolean isEnemyVehicle(Entity target, EntityPlayer placer) {
        if (!isVehicle(target)) return false;
        else if (target.riddenByEntity instanceof EntityPlayer) {
            EntityPlayer rider = (EntityPlayer) target.riddenByEntity;
            return !rider.isOnSameTeam(placer);
        }
        return false;
    }

    default boolean isEnemyAAGun(Entity target, EntityLivingBase placer){
        if(target instanceof EntityAAGun){
            EntityAAGun aaGun = (EntityAAGun) target;
            return aaGun.placer != null && !aaGun.placer.isOnSameTeam(placer);
        }
        return false;
    }

    default boolean isEnemyPlane(Entity target, Team team) {
        if (!isPlane(target)) return false;
        if(isEnemyUAV(target, team)) return true;
        else if (target.riddenByEntity instanceof EntityPlayer) {
            EntityPlayer rider = (EntityPlayer) target.riddenByEntity;
            return !rider.isOnTeam(team);
        }
        return false;
    }

    default boolean isEnemyDriveable(Entity target, Team team) {
        if (!isDriveable(target)) return false;
        else if (target.riddenByEntity instanceof EntityPlayer) {
            EntityPlayer rider = (EntityPlayer) target.riddenByEntity;
            return !rider.isOnTeam(team);
        }
        return false;
    }

    default boolean isEnemyVehicle(Entity target, Team team) {
        if (!isVehicle(target)) return false;
        else if (target.riddenByEntity instanceof EntityPlayer) {
            EntityPlayer rider = (EntityPlayer) target.riddenByEntity;
            return !rider.isOnTeam(team);
        }
        return false;
    }

    default boolean isEnemyAAGun(Entity target, Team team){
        if(target instanceof EntityAAGun){
            EntityAAGun aaGun = (EntityAAGun) target;
            return aaGun.placer != null && !aaGun.placer.isOnTeam(team);
        }
        return false;
    }

    default boolean isEnemyUAV(Entity target, Team team) {
        if (MCHeliUtil.isMCHeliUAV(target)) {
            for (Object e : target.worldObj.loadedEntityList) {
                if (e instanceof EntityPlayer
                        && !((EntityPlayer) e).isOnTeam(team)
                        && MCHeliUtil.isMCHeliUavStation(((EntityPlayer) e).ridingEntity)
                ) {
                    Entity uav = (Entity) MCHeliUtil.getUavLastControlAircraft(((EntityPlayer) e).ridingEntity);
                    if (uav != null && uav.getEntityId() == target.getEntityId()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    default boolean isDriveable(Entity target) {
        if (target == null)
            return false;
        return target instanceof EntityDriveable || MCHeliUtil.isMCHeliAircraft(target);
    }
}
