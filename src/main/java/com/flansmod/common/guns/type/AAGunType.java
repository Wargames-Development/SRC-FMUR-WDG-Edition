package com.flansmod.common.guns.type;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.item.ItemBullet;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class AAGunType extends InfoType
{
	/** The ammo types used by this gun */
	public List<BulletType> ammo = new ArrayList<BulletType>();
	public int reloadTime;
	public int recoil = 5;
	public int accuracy;
	public int damage;
	public int shootDelay;
	public int numBarrels;
	public boolean fireAlternately;
	public int health;
	public int gunnerX, gunnerY, gunnerZ;
	public String shootSound;
	public String reloadSound;
	public String offlineSound;
	public String startSound;
	public String lockOnSound;
	public ModelAAGun model;
	public float topViewLimit = 75F;
	public float bottomViewLimit = 0F;
	public int[] barrelX, barrelY, barrelZ;

	/** Sentry mode. If target players is true then it either targets everyone on the other team, or everyone other than the owner when not playing with teams */
	public boolean targetMobs = false, targetPlayers = false, targetVehicles = false, targetPlanes = false, targetMechas = false, targetDriveables = false;
	/** Targeting radius */
	public float targetRange = 20F;

	/**
	 * How often to check for new targets
	 */
	public float targetAcquireInterval = 10;

	/** If true, then all barrels share the same ammo slot */
	public boolean shareAmmo = false;
	
	public boolean canShootHomingMissile = false;

	/** 射击次数达到多少时自爆 */
	public int countExplodeAfterShoot = -1;

	/** 射击次数达到多少时休息 */
	public int countRestAfterShoot = -1;

	/** 休息时间 单位tick */
	public int restTime = 0;

	/** 自动扫描动作 */
	public boolean autoScan = true;

	/** 自动扫描转速 */
	public float autoScanSpeed = 0.5F;

	public boolean isDropThis = true;

	/** 是否为主动防御系统 */
	public boolean isActiveDefence = false;

	/** 主动防御系统距离 */
	public int activeDefenceRange = 5;

	/** 主动防御系统状填时间 单位tick */
	public int activeDefenceReloadTick = 20;

	/** 是否为高级主动防御系统 */
	public boolean isAdvancedActiveDefence = false;

	/** 高级主动防御系统持续时间 单位tick */
	public int advancedActiveDefenceWorkTick = 60;

	/** 高级主动防御系统持续时间内最大拦截数量 */
	public int advancedActiveDefenceShootCount = 5;


	public static List<AAGunType> infoTypes = new ArrayList<>();
	public float minimumTargetRange = 2F;
	public float bulletSpeed = 3F;

	/** 是否为雷达 */
	public boolean isRadar = false;

	/**
	 * 是否为攻顶地雷
	 */
	public boolean isTopAttackMine = false;


	public AAGunType(TypeFile file)
	{
		super(file);
		infoTypes.add(this);
	}

	@Override
	protected void preRead(TypeFile file) 
	{
	}

	@Override
	protected void postRead(TypeFile file) 
	{		
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelAAGun.class);
			}
			else if (split[0].equals("Texture"))
			{
				texture = split[1];
			}
			else if (split[0].equals("Damage"))
			{
				damage = Integer.parseInt(split[1]);
			}
			else if (split[0].equals("ReloadTime"))
			{
				reloadTime = Integer.parseInt(split[1]);
			}
			else if (split[0].equals("Recoil"))
			{
				recoil = Integer.parseInt(split[1]);
			}
			else if (split[0].equals("Accuracy"))
			{
				accuracy = Integer.parseInt(split[1]);
			}
			else if (split[0].equals("ShootDelay"))
			{
				shootDelay = Integer.parseInt(split[1]);
			}
			else if (split[0].equals("ShootSound"))
			{
				shootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", split[1]);
			}
			else if (split[0].equals("ReloadSound"))
			{
				reloadSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", split[1]);
			}
			else if (split[0].equals("StartSound"))
			{
				startSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", split[1]);
			}
			else if (split[0].equals("FireAlternately"))
			{
				fireAlternately = split[1].equals("True");
			}
			else if (split[0].equals("NumBarrels"))
			{
				numBarrels = Integer.parseInt(split[1]);
				barrelX = new int[numBarrels];
				barrelY = new int[numBarrels];
				barrelZ = new int[numBarrels];
			}
			else if(split[0].equals("Barrel"))
			{
				int id = Integer.parseInt(split[1]);
				barrelX[id] = Integer.parseInt(split[2]);
				barrelY[id] = Integer.parseInt(split[3]);
				barrelZ[id] = Integer.parseInt(split[4]);
			}
			else if (split[0].equals("Health"))
			{
				health = Integer.parseInt(split[1]);
			}
			else if (split[0].equals("TopViewLimit"))
			{
				topViewLimit = Float.parseFloat(split[1]);
			}
			else if (split[0].equals("BottomViewLimit"))
			{
				bottomViewLimit = Float.parseFloat(split[1]);
			}
			else if (split[0].equals("Ammo"))
			{
				BulletType type = BulletType.getBullet(split[1]);
				if (type != null)
				{
					ammo.add(type);
				}
			}
			else if (split[0].equals("GunnerPos"))
			{
				gunnerX = Integer.parseInt(split[1]);
				gunnerY = Integer.parseInt(split[2]);
				gunnerZ = Integer.parseInt(split[3]);
			}
			else if(split[0].equals("TargetMobs"))
				targetMobs = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("TargetPlayers"))
				targetPlayers = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("TargetVehicles"))
				targetVehicles = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("TargetPlanes"))
				targetPlanes = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("TargetMechas"))
				targetMechas = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("TargetDriveables"))
				targetMechas = targetPlanes = targetVehicles = targetDriveables = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ShareAmmo"))
				shareAmmo = Boolean.parseBoolean(split[1]);
			else if (split[0].equals("TargetRange"))
				targetRange = Float.parseFloat(split[1]);
			else if (split[0].equals("MinimumTargetRange"))
				minimumTargetRange = Float.parseFloat(split[1]);
			else if(split[0].equals("CanShootHomingMissile"))
				canShootHomingMissile = Boolean.parseBoolean(split[1]);
			else if (split[0].equals("CountExplodeAfterShoot"))
				countExplodeAfterShoot = Integer.parseInt(split[1]);
			else if(split[0].equals("IsDropThis"))
				isDropThis = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("IsActiveDefence"))
				isActiveDefence = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ActiveDefenceRange"))
				activeDefenceRange = Integer.parseInt(split[1]);
			else if(split[0].equals("ActiveDefenceReloadTick"))
				activeDefenceReloadTick = Integer.parseInt(split[1]);
			else if(split[0].equals("IsAdvancedActiveDefence"))
				isAdvancedActiveDefence = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("AdvancedActiveDefenceWorkTick"))
				advancedActiveDefenceWorkTick = Integer.parseInt(split[1]);
			else if(split[0].equals("AdvancedActiveDefenceShootCount"))
				advancedActiveDefenceShootCount = Integer.parseInt(split[1]);
			else if (split[0].equals("OfflineSound"))
			{
				offlineSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", split[1]);
			}
			else if (split[0].equals("BulletSpeed"))
				bulletSpeed = Float.parseFloat(split[1]);
			else if (split[0].equals("RestTime"))
				restTime = Integer.parseInt(split[1]);
			else if (split[0].equals("CountRestAfterShoot"))
				countRestAfterShoot = Integer.parseInt(split[1]);
			else if (split[0].equals("AutoScan"))
				autoScan = Boolean.parseBoolean(split[1]);
			else if (split[0].equals("TargetAcquireInterval"))
				targetAcquireInterval = Float.parseFloat(split[1]);
			else if(split[0].equals("AutoScanSpeed"))
				autoScanSpeed = Float.parseFloat(split[1]);
			else if (split[0].equals("LockOnSound"))
			{
				lockOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", split[1]);
			}
			else if(split[0].equals("IsRadar"))
				isRadar = Boolean.parseBoolean(split[1]);
				
		} catch (Exception e)
		{
			FlansMod.log("Failed to read AA Gun file " + e);
		}
	}

	public boolean isAmmo(BulletType type)
	{
		return ammo.contains(type);
	}

	public boolean isAmmo(ItemStack stack) {
		if (stack == null)
			return false;
		return stack.getItem() instanceof ItemBullet && isAmmo(((ItemBullet) stack.getItem()).type);
	}

	public static AAGunType getAAGun(String s)
	{
		for (AAGunType gun : infoTypes)
		{
			if (gun.shortName.equals(s))
				return gun;
		}
		return null;
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelAAGun.class);
	}

	@Override
	public float GetRecommendedScale() 
	{
		return 50.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return model;
	}
}
