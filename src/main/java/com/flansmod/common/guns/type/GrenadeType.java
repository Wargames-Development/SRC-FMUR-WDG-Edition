package com.flansmod.common.guns.type;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;
import net.minecraft.client.model.ModelBase;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;

public class GrenadeType extends ShootableType
{
	public static ArrayList<GrenadeType> grenades = new ArrayList<>();

	//Misc
	/** The damage imparted by smacking someone over the head with this grenade */
	public int meleeDamage = 1;

	//Throwing
	/** The delay between subsequent grenade throws */
	public int throwDelay = 0;
	/** The sound to play upon throwing this grenade */
	public String throwSound = "";
	/** The name of the item to drop (if any) when throwing the grenade */
	public String dropItemOnThrow = null;
	/** Whether you can throw this grenade by right clicking */
	public boolean canThrow = true;

	//Physics

	/** Whether this grenade may pass through entities or blocks */
	public boolean penetratesEntities = false, penetratesBlocks = false;
	/** The sound to play upon bouncing off a surface */
	public String bounceSound = "";
	/** Whether the grenade should stick to surfaces */
	public boolean sticky = false;
	/** If true, then the grenade will stick to the player that threw it. Used to make delayed self destruct weapons */
	public boolean stickToThrower = false;

	public boolean stickToEntity = false;
	public boolean stickToDriveable = false;
	public boolean stickToEntityAfter = false;
	public boolean allowStickSound = false;
	public int stickSoundRange = 10;
	public String stickSound;

	public boolean flashBang = false;
	public int flashTime = 80;
	public int flashRange = 8;

	public boolean flashSoundEnable = false;
	public int flashSoundRange = 16;
	public String flashSound;

	public boolean flashDamageEnable = false;
	public float flashDamage;

	public boolean flashEffects = false;
	public int flashEffectsID;
	public int flashEffectsDuration;
	public int flashEffectsLevel;

	/** 是否为运动传感器（需要配合MCH模组，否则失效） */
	public boolean motionSensor = false;

	/** 运动传感器工作距离 */
	public float motionSensorRange = 10.0F;

	/** 运动传感器每次标记的时间，单位秒 */
	public int motionSensorTime = 5;

	/** 运动传感器每次标记的时间间隔，单位tick */
	public int motionSensorDelay = 80;

	/** 运动传感器自动发出的声音 */
	public String motionSound;

	/** 运动传感器自动发出声音的距离 */
	public float motionSoundRange = 10.0F;

	/** 运动传感器自动发出声音的间隔，单位tick */
	public int motionSoundTime = 40;

	/** 是否为诱饵（需要配合MCH模组，否则失效） */
	public boolean isDecoy = false;

	/** 诱饵声音 */
	public String decoySound;

	/** 诱饵声音播放间隔 单位tick */
	public int decoySoundDelay = 80;

	/** 诱饵声音播放距离 */
	public float decoySoundRange = 20.0F;

	/** 是否为医疗箱 */
	public boolean isMedicBag = false;

	/** 医疗箱治疗半径 */
	public float medicBagRadius = 3.0F;

	/** 医疗箱单次治疗量 */
	public float medicBagHealAmount = 1.0F;

	/** 医疗包单次治疗间隔 */
	public float medicBagHealDelay = 10.0F;

	/** 医疗包使用次数，用后消失，-1不会消失 */
	public int medicBagUseNum = -1;

	/** 是否为弹药箱 */
	public boolean isAmmoBag = false;

	/** 弹药箱补给半径 */
	public float ammoBagRadius = 2.0F;

	/** 弹药箱单次补给量 */
	public int ammoBagSupplyAmount = 1;

	/** 弹药包单次补给间隔 */
	public float ammoBagSupplyDelay = 20.0F;

	/** 弹药包使用次数，用后消失，-1不会消失 */
	public int ammoBagUseNum = -1;

	public boolean bounceMine = false;
	public int bounceDelay = -1;
	public boolean bounceAfterTrigger = false;

	//Conditions for detonation
	/** If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade */
	public float livingProximityTrigger = -1F;
	/** If > 0 this will act like a mine and explode when a driveable comes within this radius of the grenade */
	public float driveableProximityTrigger = -1F;
	/**  If true, then anything attacking this entity will detonate it */
	public boolean detonateWhenShot = false;
	/** If true, then this grenade can be detonated by any remote detonator tool */
	public boolean remote = false;
	/** How much damage to deal to the entity that triggered it */
	public float damageToTriggerer = 0F;

	//Detonation
	/** Detonation will not occur until after this time */
	public int primeDelay = 0;
	//public boolean antiAirMine = true;
	//public int antiAirMineAngle = 10;

	//Aesthetics
	/** Particles given off in the detonation */
	public int explodeParticles = 0;
	public String explodeParticleType = "largesmoke";
	/** Whether the grenade should spin when thrown. Generally false for mines or things that should lie flat */
	public boolean spinWhenThrown = true;

	//Smoke
	/** Time to remain after detonation */
	public int smokeTime = 0;
	/** Particles given off after detonation */
	public String smokeParticleType = "explode";
	/** The effects to be given to people coming too close */
	public ArrayList<PotionEffect> smokeEffects = new ArrayList<>();
	/** The radius for smoke effects to take place in */
	public float smokeRadius = 5F;

	//Deployed bag functionality
	/** If true, then right clicking this "grenade" will give the player health or buffs or ammo as defined below */
	public boolean isDeployableBag = false;
	/** The number of times players can use this bag before it runs out */
	public int numUses = 0;
	/** The amount to heal the player using this bag */
	public float healAmount = 0;
	/** The potion effects to apply to users of this bag */
	public ArrayList<PotionEffect> potionEffects = new ArrayList<>();

	/** The number of clips to give to the player when using this bag
	 * When they right click with a gun, they will get this number of clips for that gun.
	 * They get the first ammo type, as listed in the gun type file
	 * The number of clips they get is multiplied by numBulletsInGun too
	 */
	public int numClips = 0;

	/** 是否为普通一次性主动防御系统 */
    public boolean isActiveDefence = false;

	/** 是否为高级主动防御系统 */
	public boolean isAdvancedActiveDefence = false;

	/** 高级主动防御系统持续时间 单位tick */
	public int advancedActiveDefenceWorkTick = 100;

	/** 高级主动防御系统持续时间内最大拦截数量 */
	public int advancedActiveDefenceShootCount = 10;

	public double targetRange = 6;
	public String shootSound = "";
    public String offlineSound = "";
	public String ammoBagSupplySound = "";

	public int smokeParticleCount2 = 30;
	public int smokeRange = 30;
	public int smokeHeight = 30;

	/**
	 * 开启后，投掷音效加入玩家计分板前缀， 如 USMC_
	 */
	public boolean teamThrowSound = false;
	public boolean isIncendiary = false;


	public GrenadeType(TypeFile file)
	{
		super(file);
		grenades.add(this);
	}
	
	@Override
	protected void preRead(TypeFile file) 
	{
		super.preRead(file);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			switch (split[0]) {
				case "MeleeDamage":
					meleeDamage = Integer.parseInt(split[1]);
					break;

				//Grenade Throwing
				case "ThrowDelay":
					throwDelay = Integer.parseInt(split[1]);
					break;
				case "ThrowSound":
					throwSound = split[1];
					break;
				case "DropItemOnThrow":
					dropItemOnThrow = split[1];
					break;
				case "CanThrow":
					canThrow = Boolean.parseBoolean(split[1]);
					break;

				//Grenade Physics
				case "PenetratesEntities":
					penetratesEntities = Boolean.parseBoolean(split[1].toLowerCase());
					break;
				case "PenetratesBlocks":
					penetratesBlocks = Boolean.parseBoolean(split[1].toLowerCase());
					break;
				case "BounceSound":
					bounceSound = split[1];
					break;
				case "Sticky":
					sticky = Boolean.parseBoolean(split[1]);
					break;
				case "LivingProximityTrigger":
					livingProximityTrigger = Float.parseFloat(split[1]);
					break;
				case "VehicleProximityTrigger":
					driveableProximityTrigger = Float.parseFloat(split[1]);
					break;
				case "DamageToTriggerer":
					damageToTriggerer = Float.parseFloat(split[1]);
					break;
				case "DetonateWhenShot":
					detonateWhenShot = Boolean.parseBoolean(split[1].toLowerCase());
					break;
				case "PrimeDelay":
				case "TriggerDelay":
					primeDelay = Integer.parseInt(split[1]);
					break;
				case "StickToThrower":
					stickToThrower = Boolean.parseBoolean(split[1]);
					break;
				case "StickToEntity":
					stickToEntity = Boolean.parseBoolean(split[1]);
					break;
				case "StickToDriveable":
					stickToDriveable = Boolean.parseBoolean(split[1]);
					break;
				case "StickToEntityAfter":
					stickToEntityAfter = Boolean.parseBoolean(split[1]);
					break;
				case "AllowStickSound":
					allowStickSound = Boolean.parseBoolean(split[1]);
					break;
				case "StickSoundRange":
					stickSoundRange = Integer.parseInt(split[1]);
					break;
				case "StickSound":
					stickSound = split[1];
					FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
					break;
				case "NumExplodeParticles":
					explodeParticles = Integer.parseInt(split[1]);
					break;
				case "ExplodeParticles":
					explodeParticleType = split[1];
					break;
				case "SmokeTime":
					smokeTime = Integer.parseInt(split[1]);
					break;
				case "SmokeParticles":
					smokeParticleType = split[1];
					break;
				case "SmokeEffect":
					smokeEffects.add(getPotionEffect(split));
					break;
				case "SmokeRadius":
					smokeRadius = Float.parseFloat(split[1]);
					break;
				case "SpinWhenThrown":
					spinWhenThrown = Boolean.parseBoolean(split[1].toLowerCase());
					break;
				case "Remote":
					remote = Boolean.parseBoolean(split[1].toLowerCase());
					break;
				case "FlashBang":
					flashBang = Boolean.parseBoolean(split[1]);
					break;
				case "FlashTime":
					flashTime = Integer.parseInt(split[1]);
					break;
				case "FlashRange":
					flashRange = Integer.parseInt(split[1]);
					break;
				case "FlashSoundEnable":
					flashSoundEnable = Boolean.parseBoolean(split[1]);
					break;
				case "FlashSoundRange":
					flashSoundRange = Integer.parseInt(split[1]);
					break;
				case "FlashSound":
					flashSound = split[1];
					FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
					break;
				case "FlashDamageEnable":
					flashDamageEnable = Boolean.parseBoolean(split[1]);
					break;
				case "FlashDamage":
					flashDamage = Float.parseFloat(split[1]);
					break;
				case "FlashEffects":
					flashEffects = Boolean.parseBoolean(split[1]);
					break;
				case "FlashEffectsID":
					flashEffectsID = Integer.parseInt(split[1]);
					break;
				case "FlashEffectsDuration":
					flashEffectsDuration = Integer.parseInt(split[1]);
					break;
				case "FlashEffectsLevel":
					flashEffectsLevel = Integer.parseInt(split[1]);
					break;
				case "MotionSensor":
					motionSensor = Boolean.parseBoolean(split[1]);
					break;
				case "MotionSensorRange":
					motionSensorRange = Float.parseFloat(split[1]);
					break;
				case "MotionSoundRange":
					motionSoundRange = Float.parseFloat(split[1]);
					break;
				case "MotionSound":
					motionSound = split[1];
					FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
					break;
				case "MotionSensorTime":
					motionSensorTime = Integer.parseInt(split[1]);
					break;
				case "MotionSoundTime":
					motionSoundTime = Integer.parseInt(split[1]);
					break;
				case "MotionSensorDelay":
					motionSensorDelay = Integer.parseInt(split[1]);
					break;

				case "IsDecoy":
					isDecoy = Boolean.parseBoolean(split[1]);
					break;
				case "DecoySound":
					decoySound = split[1];
					FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
					break;
				case "DecoySoundRange":
					decoySoundRange = Integer.parseInt(split[1]);
					break;
				case "DecoySoundDelay":
					decoySoundDelay = Integer.parseInt(split[1]);
					break;

				case "IsMedicBag":
					isMedicBag = Boolean.parseBoolean(split[1]);
					break;
				case "MedicBagRadius":
					medicBagRadius = Float.parseFloat(split[1]);
					break;
				case "MedicBagHealAmount":
					medicBagHealAmount = Float.parseFloat(split[1]);
					break;
				case "MedicBagHealDelay":
					medicBagHealDelay = Float.parseFloat(split[1]);
					break;
				case "MedicBagUseNum":
					medicBagUseNum = Integer.parseInt(split[1]);
					break;

				case "IsAmmoBag":
					isAmmoBag = Boolean.parseBoolean(split[1]);
					break;
				case "AmmoBagRadius":
					ammoBagRadius = Float.parseFloat(split[1]);
					break;
				case "AmmoBagSupplyAmount":
					ammoBagSupplyAmount = Integer.parseInt(split[1]);
					break;
				case "AmmoBagSupplyDelay":
					ammoBagSupplyDelay = Float.parseFloat(split[1]);
					break;
				case "AmmoBagUseNum":
					ammoBagUseNum = Integer.parseInt(split[1]);
					break;
				case "AmmoBagSupplySound":
					ammoBagSupplySound = split[1];
					FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
					break;

				case "BounceMine":
					bounceMine = Boolean.parseBoolean(split[1]);
					break;
				case "BounceDelayAfterOnGround":
					bounceDelay = Integer.parseInt(split[1]);
					break;
				case "BounceAfterTrigger":
					bounceAfterTrigger = Boolean.parseBoolean(split[1]);
					break;

				case "IsActiveDefence" :
					isActiveDefence = Boolean.parseBoolean(split[1]);
					break;
				case "ActiveDefenceRange" :
					targetRange = Double.parseDouble(split[1]);
					break;
				case "IsAdvancedActiveDefence" :
					isAdvancedActiveDefence = Boolean.parseBoolean(split[1]);
					break;
				case "AdvancedActiveDefenceWorkTick" :
					advancedActiveDefenceWorkTick = Integer.parseInt(split[1]);
					break;
				case "AdvancedActiveDefenceShootCount" :
					advancedActiveDefenceShootCount = Integer.parseInt(split[1]);
					break;
				case "ShootSound" :
					shootSound = split[1];
					FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
					break;
				case "OfflineSound" :
					offlineSound = split[1];
					FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
					break;

				//Deployable Bag Stuff
				case "DeployableBag":
					isDeployableBag = true;
					break;
				case "NumUses":
					numUses = Integer.parseInt(split[1]);
					break;
				case "HealAmount":
					healAmount = Float.parseFloat(split[1]);
					break;
				case "AddPotionEffect":
				case "PotionEffect":
					potionEffects.add(getPotionEffect(split));
					break;
				case "NumClips":
					numClips = Integer.parseInt(split[1]);
					break;
				case "SmokeParticleCount" :
					smokeParticleCount2 = Integer.parseInt(split[1]);
					break;
				case "SmokeParticleRadius" :
					smokeRadius = Integer.parseInt(split[1]);
					break;
				case "SmokeParticleHeight" :
					smokeHeight = Integer.parseInt(split[1]);
					break;
				case "TeamThrowSound" :
					teamThrowSound = Boolean.parseBoolean(split[1]);
					break;
				case "IsIncendiary" :
					isIncendiary = Boolean.parseBoolean(split[1]);
					break;
			}
		}
		catch (Exception e)
		{
			FlansMod.log("Reading grenade file failed.");
			e.printStackTrace();
		}
	}

	public static GrenadeType getGrenade(String s)
	{
		for(GrenadeType grenade : grenades)
		{
			if(grenade.shortName.equals(s))
				return grenade;
		}
		return null;
	}

	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelBase.class);
	}
}
