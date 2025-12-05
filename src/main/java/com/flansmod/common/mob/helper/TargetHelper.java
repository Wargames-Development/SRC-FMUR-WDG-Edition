package com.flansmod.common.mob.helper;

import com.flansmod.common.guns.ILockable;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.SoldierType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 实体索敌工具类
 */
public class TargetHelper implements ILockable {

    public EntitySoldier entity;

    public TargetHelper(EntitySoldier entity) {
        this.entity = entity;
    }

    public void faceLocation(double posX, double posY, double posZ, float p_70625_2_, float p_70625_3_) {
        double d0 = posX - this.entity.posX;
        double d2 = posZ - this.entity.posZ;
        double d1 = posY - this.entity.posY;
        double d3 = MathHelper.sqrt_double(d0 * d0 + d2 * d2);
        float f2 = (float)(Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
        float f3 = (float)(-(Math.atan2(d1, d3) * 180.0D / Math.PI));
        this.entity.rotationPitch = this.updateRotation(this.entity.rotationPitch, f3, p_70625_3_);
        this.entity.rotationYaw = this.updateRotation(this.entity.rotationYaw, f2, p_70625_2_);
        this.entity.rotationYawHead = this.entity.rotationYaw;
        //FlansMod.getPacketHandler().sendToAllAround(new PacketSoldierAim(entity.getEntityId(), entity.rotationYaw, entity.rotationPitch, entity.aiming), entity.posX, entity.posY, entity.posZ, 150, entity.dimension);
    }

    private float updateRotation(float p_70663_1_, float p_70663_2_, float p_70663_3_) {
        float f3 = MathHelper.wrapAngleTo180_float(p_70663_2_ - p_70663_1_);
        if (f3 > p_70663_3_) {
            f3 = p_70663_3_;
        }
        if (f3 < -p_70663_3_) {
            f3 = -p_70663_3_;
        }
        return p_70663_1_ + f3;
    }


    public Entity getValidTarget() {
        if (entity.worldObj.isRemote)
            return null;

        List<Entity> validTargets = new ArrayList<>();

        for (Object obj : this.entity.worldObj.getEntitiesWithinAABBExcludingEntity(this.entity, this.entity.boundingBox.expand(entity.type.targetRange, entity.type.targetRange, entity.type.targetRange))) {
            Entity candidateEntity = (Entity) obj;
            if (candidateEntity instanceof EntityMob
                    || candidateEntity instanceof EntitySoldier
                    || candidateEntity instanceof EntityPlayer
                    || entity.type.lockOnAAGun && isEnemyAAGun(candidateEntity, entity.team)
                    || entity.type.lockOnPlane && isEnemyPlane(candidateEntity, entity.team)
                    || isEnemyVehicle(candidateEntity, entity.team)
                    || isEnemyDriveable(candidateEntity, entity.team)
            ) {
                if (candidateEntity.getDistanceToEntity(this.entity) < entity.type.targetRange) {
                    if (!isTargetInViewLimit(candidateEntity))
                        continue;
                    if (FlansModRaytracer.hasBlock(entity.worldObj,
                            Vec3.createVectorHelper(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ),
                            Vec3.createVectorHelper(candidateEntity.posX, candidateEntity.posY + 1.5F, candidateEntity.posZ)))
                        continue;
                    if (candidateEntity instanceof EntityLivingBase) {
                        if (((EntityLivingBase) candidateEntity).isOnTeam(entity.team))
                            continue;
                    }
                    validTargets.add(candidateEntity);
                }
            }
        }

        if (!validTargets.isEmpty()) {
            validTargets.sort((entity1, entity2) -> {
                double distance1 = entity1.getDistanceToEntity(TargetHelper.this.entity);
                double distance2 = entity2.getDistanceToEntity(TargetHelper.this.entity);
                return Double.compare(distance1, distance2);
            });
            int numTargetsToConsider = Math.min(validTargets.size(), 3);
            return validTargets.get(SoldierType.rand.nextInt(numTargetsToConsider));
        }

        return null;
    }

    public boolean isTargetInViewLimit(Entity target) {
        if (target == null)
            return false;
        double dX = target.posX - entity.posX;
        double dY = target.posY - (entity.posY + 1.5F);
        double dZ = target.posZ - entity.posZ;
        double targetPitch = Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180F / 3.14159F
                * (dY > 0 ? 1 : -1);
        return targetPitch < entity.type.topViewLimit && targetPitch < entity.type.bottomViewLimit;
    }

    public Vec3 getEntityPos(Entity entity, int targetStrategy) {
        Random rand = new Random();
        switch (targetStrategy) {
            case 0:
                return Vec3.createVectorHelper(
                        entity.posX + (rand.nextFloat() - 0.25F) / 2,
                        entity.posY + 0.2,
                        entity.posZ + (rand.nextFloat() - 0.25F) / 2
                );
            case 1:
                return Vec3.createVectorHelper(entity.posX, entity.posY + 0.5, entity.posZ);
            case 2:
                return Vec3.createVectorHelper(
                        entity.posX + (rand.nextFloat() - 0.5F) / 2,
                        entity.posY + entity.getEyeHeight(),
                        entity.posZ + (rand.nextFloat() - 0.5F) / 2
                );
            case 3:
                return Vec3.createVectorHelper(entity.posX, entity.posY, entity.posZ);
        }
        return Vec3.createVectorHelper(entity.posX, entity.posY + 0.5F, entity.posZ);
    }

    public Entity getNearestTeammate(World worldObj, EntitySoldier entity, int maxSearchDist){
        List<Entity> list = worldObj.getEntitiesWithinAABBExcludingEntity(entity, entity.boundingBox.expand(maxSearchDist, maxSearchDist, maxSearchDist));
        Entity closestEntity = null;
        double minDist = Double.MAX_VALUE;
        for(Entity e : list){
            if((e instanceof EntitySoldier || e instanceof EntityPlayer) && ((EntityLivingBase) e).isOnSameTeam(entity)){
                double dist = entity.getDistance(entity.posX, entity.posY, entity.posZ);
                if (dist < minDist) {
                    closestEntity = entity;
                    minDist = dist;
                }
            }
        }
        return closestEntity;
    }

    public static Entity getNearestEntity(World world, Class<? extends Entity> type, int maxSearchDistance, double posX, double posY, double posZ) {
        AxisAlignedBB searchBox = AxisAlignedBB.getBoundingBox(posX - maxSearchDistance, posY - maxSearchDistance, posZ - maxSearchDistance, posX + maxSearchDistance, posY + maxSearchDistance, posZ + maxSearchDistance);
        List<Entity> entities = world.getEntitiesWithinAABB(type, searchBox);
        Entity closestEntity = null;
        double minDist = Double.MAX_VALUE;
        for (Entity entity : entities) {
            double dist = entity.getDistance(posX, posY, posZ);
            if (dist < minDist) {
                closestEntity = entity;
                minDist = dist;
            }
        }
        return closestEntity;
    }
}
