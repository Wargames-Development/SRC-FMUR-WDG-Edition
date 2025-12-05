package com.flansmod.common.mob.api;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityDamageSourceFlans;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ItemCorpseSpawner;
import com.flansmod.common.mob.ItemSoldierSpawner;
import com.flansmod.common.network.PacketMissileMCLOSAccelerate;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * AI功能与服务端通信接口
 */
public class SoldierAPI {

    public static Map<Integer, EntitySoldier> soldierMap = new ConcurrentHashMap<>();


    public static String getVehicleName(Object player) {
        if(player instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) player;
            if(p.ridingEntity instanceof EntitySeat) {
                EntitySeat s = (EntitySeat) p.ridingEntity;
                if(s.driveable != null) {
                    return s.driveable.getDriveableType().name;
                }
            };
        }
        return null;
    }

    public static String getVehicleShortName(Object player) {
        if(player instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) player;
            if(p.ridingEntity instanceof EntitySeat) {
                EntitySeat s = (EntitySeat) p.ridingEntity;
                if(s.driveable != null) {
                    return s.driveable.getDriveableType().shortName;
                }
            };
        }
        return null;
    }

    public static boolean isFlanVehicle(Object player) {
        if(player instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) player;
            if(p.ridingEntity instanceof EntitySeat) {
                EntitySeat s = (EntitySeat) p.ridingEntity;
                return s.driveable != null;
            };
        }
        return false;
    }


    public static Object getSoldier(int entityId){
        return soldierMap.get(entityId);
    }

    public static List<Integer> getNearByAiId(Object world, double x, double y, double z, double distance){
        if(world instanceof World){
            List<Integer> idList = new ArrayList<>();
            AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(x - distance, y - distance, z - distance, x + distance, y + distance, z + distance);
            List list = ((World) world).getEntitiesWithinAABB(EntitySoldier.class, aabb);
            for (Object obj : list) {
                idList.add(((EntitySoldier) obj).getEntityId());
            }
            return idList;
        }
        return null;
    }

    public static void setMoveTo(Object obj, double x, double y, double z, boolean sprinting){
        if(obj instanceof EntitySoldier){
            ((EntitySoldier) obj).moveHelper.setMoveTo(x, y, z, sprinting);
        }
    }

    /**
     * 获取AI的兵种
     * @param obj AI
     * @return 兵种 ASS REC SUP ENG
     */
    public static String getSoldierFaction(Object obj){
        if(obj instanceof EntitySoldier){
            return ((EntitySoldier) obj).faction.name();
        }
        return null;
    }

    public static Object getVehicle(Object e){
        if(e instanceof Entity){
            return ((Entity) e).ridingEntity;
        }
        return null;
    }

    /**
     * 获取AI队伍名
     * @param obj AI
     * @return 计分板队伍名
     */
    public static String getSoldierTeamName(Object obj){
        if(obj instanceof EntitySoldier){
            if(((EntitySoldier) obj).team == null){
                return null;
            } else return ((EntitySoldier) obj).team.getRegisteredName();
        }
        return null;
    }

    /**
     * 获取AI名称
     * @param obj AI
     * @return 名称
     */
    public static String getSoldierName(Object obj){
        if(obj instanceof EntitySoldier){
            return ((EntitySoldier) obj).name;
        }
        return null;
    }

    public static int getEntityId(Object obj){
        if(obj instanceof Entity){
            return ((Entity) obj).getEntityId();
        }
        return 0;
    }

    public static int getHealth(Object obj){
        if(obj instanceof EntityLivingBase){
            return (int) ((EntityLivingBase) obj).getHealth();
        }
        return 0;
    }

    public static Object getHeldItem(Object obj){
        if(obj instanceof EntityLivingBase){
            return ((EntityLivingBase) obj).getHeldItem();
        }
        return null;
    }

    public static short getHeldGunAttachmentId(Object obj, String nbtTag){
        if(obj instanceof EntitySoldier){
            ItemStack stack = ((EntitySoldier) obj).getHeldItem();
            if(stack != null && stack.stackTagCompound != null && stack.getItem() instanceof ItemGun){
                NBTTagCompound tagCompound = stack.stackTagCompound.getCompoundTag("attachments");
                return tagCompound.getCompoundTag(nbtTag).getShort("id");
            }
            return 0;
        }
        return 0;
    }

    public static double getPosX(Object obj){
        if(obj instanceof Entity){
            return ((Entity) obj).posX;
        }
        return 0;
    }

    public static double getPosY(Object obj){
        if(obj instanceof Entity){
            return ((Entity) obj).posY;
        }
        return 0;
    }

    public static double getPosZ(Object obj){
        if(obj instanceof Entity){
            return ((Entity) obj).posZ;
        }
        return 0;
    }

    public static String getWorldObjName(Object obj){
        if(obj instanceof Entity){
            return ((Entity) obj).worldObj.getWorldInfo().getWorldName();
        }
        return null;
    }

    /**
     * 实体是否为AI
     * @param obj 实体
     * @return
     */
    public static boolean isSoldier(Object obj){
        return obj instanceof EntitySoldier;
    }

    /**
     * 获取AI的Team
     * @param obj 实体
     * @return Team
     */
    public static Team getSoldierTeam(Object obj){
        if(obj instanceof EntitySoldier) {
            EntitySoldier s = (EntitySoldier) obj;
            return s.getTeam();
        }
        return null;
    }

    /**
     * 获取AI手持物品的短名称
     * @param obj
     * @return 形如 item.m4a1
     */
    public static String getHeldItemUnlocalizedName(Object obj){
        if(obj instanceof EntityLiving){
            return ((EntityLiving) obj).getHeldItem().getItem().getUnlocalizedName();
        }
        return null;
    }

    /**
     * 实体是否为玩家
     * @param obj 实体
     * @return
     */
    public static boolean isPlayer(Object obj){
        return obj instanceof EntityPlayer;
    }

    /**
     * 生成AI
     * @param world 世界
     * @param x x
     * @param y y
     * @param z z
     * @param player AI的主人
     */
    public static void spawnAI(Object world , int x, int y, int z, Object player){
        if(world instanceof World && player instanceof EntityPlayer){
            ItemSoldierSpawner.spawnAISolider((World) world, x, y, z, (EntityPlayer) player);
        }
    }

    public static void spawnAI(Object world , int x, int y, int z, String teamName){
        if(world instanceof World){
            ItemSoldierSpawner.spawnAISolider((World) world, x, y, z, teamName);
        }
    }

    /**
     * 销毁一个世界的所有AI
     * @param w 世界
     */
    public static void destroyAllAI(Object w){
        if(w instanceof World){
            World world = (World) w;
            for (Object entity : world.loadedEntityList) {
                if (entity instanceof EntitySoldier) {
                    ((EntitySoldier) entity).setDead();
                }
            }
            soldierMap.clear();
        }
    }

    /**
     * 生成玩家尸体
     * @param world 世界
     * @param x x
     * @param y y
     * @param z z
     * @param player 玩家
     */
    public static void spawnCorpse(Object world , double x, double y, double z, Object player){
        if(world instanceof World && player instanceof EntityPlayer){
            ItemCorpseSpawner.spawnCorpse((World) world, x, y, z, (EntityPlayer) player);
        }
    }


    public static Object getLivingDeathEventDamageSource(LivingDeathEvent e){
        return e.source;
    }

    public static Object getLivingDeathEventVictim(LivingDeathEvent e){
        return e.entity;
    }

    public static Object getLivingDeathEventKiller(LivingDeathEvent e){
        return e.source.getEntity();
    }

    public static Object getDamageSourceEntity(Object source){
        if(source instanceof DamageSource){
            return ((DamageSource)source).getEntity();
        }
        return null;
    }

    public static Object getLivingDeathEventEntity(LivingDeathEvent e){
        return e.entity;
    }

    public static boolean getDamageSourceFlanHeadShot(Object source){
        if(source instanceof EntityDamageSourceFlans){
            return ((EntityDamageSourceFlans) source).headshot;
        }
        return false;
    }

    public static InfoType getDamageSourceFlanInfoType(Object source){
        if(source instanceof EntityDamageSourceFlans){
            return ((EntityDamageSourceFlans) source).weapon;
        }
        return null;
    }

    public static Object getDamageSourceFlanShooter(Object source){
        if(source instanceof EntityDamageSourceFlans){
            return ((EntityDamageSourceFlans) source).shooter;
        }
        return null;
    }

}
