package com.flansmod.common.hook;

import com.flansmod.common.FlansMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MCHeliUtil {

    public static boolean isMCHeliInstalled;
    public static Class<?> mchMutiplayClass;
    public static Class<?> mchEntityAircraftClass;
    public static Class<?> mchEntityTankClass;
    public static Class<?> mchEntityPlaneClass;
    public static Class<?> mchEntityHeliClass;
    public static Class<?> mchEntityVehicleClass;
    public static Class<?> mchEntityUavStation;
    public static Class<?> mchEntityBulletBase;
    public static Class<?> mchEntityBullet;
    public static Class<?> mchEntityRocket;
    public static Class<?> mchEntityAAMissile;
    public static Class<?> mchEntityATMissile;
    public static Class<?> mchEntityASMissile;
    public static Class<?> mchEntityTVMissile;
    public static Class<?> mchEntityBomb;
    public static Class<?> mchWeaponSet;
    public static Class<?> mchWeaponBase;

    static {
        try {
            mchMutiplayClass = Class.forName("mcheli.multiplay.MCH_Multiplay");
            mchEntityAircraftClass = Class.forName("mcheli.aircraft.MCH_EntityAircraft");
            mchEntityTankClass = Class.forName("mcheli.tank.MCH_EntityTank");
            mchEntityPlaneClass = Class.forName("mcheli.plane.MCP_EntityPlane");
            mchEntityHeliClass = Class.forName("mcheli.helicopter.MCH_EntityHeli");
            mchEntityVehicleClass = Class.forName("mcheli.vehicle.MCH_EntityVehicle");
            mchEntityUavStation = Class.forName("mcheli.uav.MCH_EntityUavStation");
            mchEntityBulletBase = Class.forName("mcheli.weapon.MCH_EntityBaseBullet");
            mchEntityBullet = Class.forName("mcheli.weapon.MCH_EntityBullet");
            mchEntityRocket = Class.forName("mcheli.weapon.MCH_EntityRocket");
            mchEntityAAMissile = Class.forName("mcheli.weapon.MCH_EntityAAMissile");
            mchEntityATMissile = Class.forName("mcheli.weapon.MCH_EntityATMissile");
            mchEntityASMissile = Class.forName("mcheli.weapon.MCH_EntityASMissile");
            mchEntityTVMissile = Class.forName("mcheli.weapon.MCH_EntityTvMissile");
            mchEntityBomb = Class.forName("mcheli.weapon.MCH_EntityBomb");
            mchWeaponSet = Class.forName("mcheli.weapon.MCH_WeaponSet");
            mchWeaponBase = Class.forName("mcheli.weapon.MCH_WeaponBase");
            FlansMod.log("MCH_Hook loaded");
            isMCHeliInstalled = true;
        } catch (ClassNotFoundException e) {
            isMCHeliInstalled = false;
            e.printStackTrace();
            FlansMod.log("MCHeli Mod not found，MCHeliUtil will not work");
        }
    }

    public static boolean isMCHeliInstalled() {
        return isMCHeliInstalled;
    }

    public static boolean isMCHeliAircraft(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return mchEntityAircraftClass.isInstance(entity);
    }

    public static boolean isMCHeliTank(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return mchEntityTankClass.isInstance(entity);
    }

    public static boolean isMCHeliPlane(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return mchEntityPlaneClass.isInstance(entity);
    }

    public static boolean isMCHeliHeli(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return mchEntityHeliClass.isInstance(entity);
    }

    public static boolean isMCHeliVehicle(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return mchEntityVehicleClass.isInstance(entity);
    }

    public static boolean isMCHeliAirVehicle(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return isMCHeliPlane(entity) || isMCHeliHeli(entity);
    }

    public static boolean isMCHeliGroundVehicle(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return isMCHeliTank(entity) || isMCHeliVehicle(entity);
    }

    public static boolean isMCHeliUavStation(Object entity) {
        if (!isMCHeliInstalled()) {
            return false;
        }
        return mchEntityUavStation.isInstance(entity);
    }

    public static boolean isMCHeliUAV(Object entity) {
        if (!isMCHeliAircraft(entity)) {
            return false;
        }
        try {
            Object uavInfo = mchEntityAircraftClass.getMethod("getAcInfo").invoke(entity);
            return (boolean) uavInfo.getClass().getField("isUAV").get(uavInfo)
                    || (boolean) uavInfo.getClass().getField("isSmallUAV").get(uavInfo)
                    || (boolean) uavInfo.getClass().getField("isTargetDrone").get(uavInfo);
        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isEnemyUAV(Object entity, Object placer) {
        if (MCHeliUtil.isMCHeliUAV(entity)) {
            Entity target = (Entity) entity;
            for (Object e : target.worldObj.loadedEntityList) {
                if (e instanceof EntityPlayer
                        && !((EntityPlayer) e).isOnSameTeam((EntityLivingBase) placer)
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

    @Deprecated
    //bug
    public static boolean isOnlineUAV(Object entity) {
        if (MCHeliUtil.isMCHeliUAV(entity)) {
            Entity target = (Entity) entity;
            for (Object e : target.worldObj.loadedEntityList) {
                if (e instanceof EntityPlayer && MCHeliUtil.isMCHeliUavStation(((EntityPlayer) e).ridingEntity)
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

    public static Object getUavLastControlAircraft(Object uavStation) {
        if (!isMCHeliUavStation(uavStation)) {
            return null;
        }
        try {
            return mchEntityUavStation.getMethod("getLastControlAircraft").invoke(uavStation);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object getMCHDriveableLastRiddenByEntity(Object entity) {
        if (!isMCHeliAircraft(entity)) {
            return null;
        }
        try {
            Field field = mchEntityAircraftClass.getField("lastRiddenByEntity");
            field.setAccessible(true);
            return field.get(entity);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    public static void markEntity(EntityPlayer sender, Class<? extends Entity> entityType, int time, float angle, float dist) {
        if (!isMCHeliInstalled()) {
            return;
        }
        Vec3 vec3 = sender.getLookVec();
        List<Entity> list = sender.worldObj.getEntitiesWithinAABB(entityType,
                sender.boundingBox.expand(dist, dist, dist));
        if (list.isEmpty()) {
            return;
        }
        List<Entity> sentList = new ArrayList<>();
        for (Entity entity : list) {
            if (entity == sender) {
                continue;
            }
            //计算实体与玩家距离向量跟玩家视线向量的夹角
            Vec3 vec3Entity = Vec3.createVectorHelper(entity.posX - sender.posX, entity.posY - sender.posY, entity.posZ - sender.posZ);
            float angleBetween = (float) (vec3Entity.normalize().dotProduct(vec3.normalize()));
            if (angleBetween < angle) {
                sentList.add(entity);
            }
        }

        sendSpotedEntityListToSameTeam(sender, time, sentList.stream().mapToInt(Entity::getEntityId).toArray());
    }

    public static void sendSpotedEntityListToSameTeam(Object sender, int time, int[] sentEntityIds) {
        try {
            if (isMCHeliInstalled() && sender instanceof EntityLivingBase) {
                mchMutiplayClass.getMethod("sendSpotedEntityListToSameTeam", EntityLivingBase.class, int.class, int[].class)
                        .invoke(null, sender, time, sentEntityIds);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendMarkPointToSameTeam(Object sender, int posX, int posY, int posZ) {
        try {
            if (isMCHeliInstalled() && sender instanceof EntityPlayer) {
                mchMutiplayClass.getMethod("sendMarkPointToSameTeam", EntityPlayer.class, int.class, int.class, int.class)
                        .invoke(null, sender, posX, posY, posZ);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static EnumMCHEntityType getEntityType(Entity d) {
        if (isMCHeliInstalled()) {
            if (mchEntityTankClass.isInstance(d)) {
                return EnumMCHEntityType.TANK;
            } else if (mchEntityPlaneClass.isInstance(d)) {
                return EnumMCHEntityType.PLANE;
            } else if (mchEntityHeliClass.isInstance(d)) {
                return EnumMCHEntityType.HELI;
            } else if (mchEntityVehicleClass.isInstance(d)) {
                return EnumMCHEntityType.VEHICLE;
            } else {
                return EnumMCHEntityType.OTHER;
            }
        } else {
            return null;
        }
    }

    public static boolean isMCHBaseBullet(Object entity) {
        //Validate.isInstanceOf(Entity.class, entity);
        if (!isMCHeliInstalled()) return false;
        return mchEntityBulletBase.isInstance(entity);
    }

    public static boolean isMCHRocket(Object entity) {
        //Validate.isInstanceOf(Entity.class, entity);
        if (!isMCHeliInstalled()) return false;
        return mchEntityRocket.isInstance(entity);
    }

    public static boolean isMCHMissile(Object entity) {
        if (!isMCHeliInstalled()) return false;
        return mchEntityTVMissile.isInstance(entity)
                || mchEntityATMissile.isInstance(entity)
                || mchEntityASMissile.isInstance(entity)
                || mchEntityAAMissile.isInstance(entity);
    }

    /**
     * 获取子弹发射者
     *
     * @param object getBulletShootingEntity
     * @return Entity
     */
    public static Object getBulletShootingEntity(Object object) {
        if (!isMCHeliInstalled()) return null;
        if (isMCHBaseBullet(object)) {
            try {
                return mchEntityBulletBase.getField("shootingEntity").get(object);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 获取子弹发射者 未检查类型, 确保传入的是MCH子弹实体
     *
     * @param object MCH_EntityBaseBullet
     * @return Entity
     */
    public static Object getBulletShootingEntity_Unsafe(Object object) {
        if (!isMCHeliInstalled()) return null;
        try {
            return mchEntityBulletBase.getField("shootingEntity").get(object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void switchNextTextureName(Object entity1) {
        if (!isMCHeliInstalled()) return;
        if (!(entity1 instanceof EntityLivingBase)) return;
        EntityLivingBase entity = (EntityLivingBase) entity1;
        if (entity.ridingEntity != null && isMCHeliAircraft(entity.ridingEntity)) {
            try {
                mchEntityAircraftClass.getMethod("switchNextTextureName").invoke(entity.ridingEntity);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public static void setTextureName(Object entity1, String textureName) {
        if (!isMCHeliInstalled()) return;
        if (!(entity1 instanceof EntityLivingBase)) return;
        EntityLivingBase entity = (EntityLivingBase) entity1;
        if (entity.ridingEntity != null && isMCHeliAircraft(entity.ridingEntity)) {
            try {
                mchEntityAircraftClass.getMethod("setTextureName", String.class).invoke(entity.ridingEntity, textureName);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String[]> getWeapons(Object entity1) {
        if (!isMCHeliInstalled()) return null;
        if (!(entity1 instanceof EntityLivingBase)) return null;
        EntityLivingBase entity = (EntityLivingBase) entity1;
        if (entity.ridingEntity != null && isMCHeliAircraft(entity.ridingEntity)) {
            try {
                Field weapons = mchEntityAircraftClass.getField("weapons");
                weapons.setAccessible(true);
                Object[] weaponArray = (Object[]) weapons.get(entity.ridingEntity);
                List<String[]> list = new ArrayList<>();
                for (Object o : weaponArray) {
                    Field weaponSet = mchWeaponSet.getDeclaredField("weapons");
                    weaponSet.setAccessible(true);
                    Object[] weaponBaseArray = (Object[]) weaponSet.get(o);
                    String[] names = new String[weaponBaseArray.length];
                    for (int j = 0; j < weaponBaseArray.length; j++) {
                        names[j] = getDisplayName(weaponBaseArray[j]);
                    }
                    list.add(names);
                }
                return list;
            } catch (IllegalAccessException | NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

    private static String getDisplayName(Object weaponBase) {
        if (mchWeaponBase.isInstance(weaponBase)) {
            try {
                return (String) mchWeaponBase.getMethod("getName").invoke(weaponBase);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}