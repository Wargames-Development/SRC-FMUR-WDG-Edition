package com.flansmod.common.guns.type;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.guns.BulletDecay;
import com.flansmod.common.guns.BulletDecayFactory;
import com.flansmod.common.types.TypeFile;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;


public class BulletType extends ShootableType {
    /**
     * The static bullets list
     */

    public static List<BulletType> bullets = new ArrayList<>();
    //新增:是否显示炮弹弹着点
    public boolean printExplodePoint = false;
    //新增:子弹命中时掉落物品(用于米粉战车
    public boolean dropItemOnHitBlocks = false;
    public int dropItemIdOnHitBlocks = 0;
    public int dropItemNumOnHitBlocks = 0;
    /**
     * 爆头，击中手臂和腿部的伤害倍率
     */
    public float shootHeadMultiplier = 2.0F;
    public float shootArmMultiplier = 0.6F;
    public float shootLegMultiplier = 0.8F;
    public float speedMultiplier = 1F;
    /**
     * 生成的白色烟雾粒子（或其他粒子数量）
     */
    public int flak = 0;
    /**
     * 生成的方块破碎粒子数量
     */
    public int flakParticlesCrack = 5;
    /**
     * 生成的方块破碎粒子扩散，推荐值0.1(步枪子弹) ~ 0.6(反坦克步枪)
     */
    public float flakParticlesDiff = 0.2F;
    /**
     * The type of flak particles to spawn
     */
    public String flakParticles = "largesmoke";
    /**
     * If true then this bullet will burn entites it hits
     */
    public boolean setEntitiesOnFire = false;
    /**
     * 实体燃烧时间
     */
    public int setEntitiesOnFireTime = 8;

    /**
     * If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade
     */
    public float livingProximityTrigger = -1F;
    /**
     * How much damage to deal to the entity that triggered it
     */
    public float damageToTriggerer = 0F;
    /**
     * Detonation will not occur until after this time
     */
    public int primeDelay = 0;
    /**
     * Particles given off in the detonation
     */
    public int explodeParticles = 0;
    public String explodeParticleType = "largesmoke";

    /**
     * Exclusively for driveable usage. Replaces old isBomb and isShell booleans with something more flexible
     */
    public EnumWeaponType weaponType = EnumWeaponType.NONE;
    public float minDamageDistanceToPlane = 0;
    public float maxDamageDistanceToPlane = 0;

    /**
     * 0：第一人称视角
     * 1：第三人称后视角
     * 2：第三人称前视角
     */
    public int whichViewLocked = 1;
    public boolean canLoadChunkWithBullet = false;

    /**
     * 是否可以排爆（射击榴弹不会将其引爆，而是让其直接消失）
     */
    public boolean isEOD = false;

    public int maxdamagetoself = 0;
    public String hitSound;
    public String hitSoundIron = "hit_metal";
    public float hitSoundRange;
    public boolean hitSoundEnable = false;
    public boolean entityHitSoundEnable = false;


    // Knocback modifier. less gives less kb, more gives more kb, 1 = normal kb.
    public float knockbackModifier;

    /**
     * If > 0 this will act like a mine and explode when a driveable comes within this radius of the grenade
     */
    public float driveableProximityTrigger = -1F;

    public ArrayList<PotionEffect> hitEffects = new ArrayList<>();
    /**
     * Number of bullets to fire per shot if allowNumBulletsByBulletType = true
     */
    public int numBullets = -1;
    /**
     * Ammo based spread setting if allowSpreadByBullet = true
     */
    public float bulletSpread = -1;
    public float dragInAir = 0.99F;
    public float dragInWater = 0.80F;
    public boolean canSpotEntityDriveable = false;
    public int maxRange = -1;

    /**
     * Time to remain after detonation
     */
    public int smokeTime = 0;
    /**
     * Particles given off after detonation
     */

    public String smokeParticleType = "explode";
    /**
     * The effects to be given to people coming too close
     */

    public ArrayList<PotionEffect> smokeEffects = new ArrayList<>();
    /**
     * The radius for smoke effects to take place in
     */

    public float smokeRadius = 5F;


    public boolean torpedo = false;
    public boolean fancyDescription = true;

    /** 子弹伤害衰减 */
    public boolean enableBulletDecay = false;
    public List<BulletDecay> bulletDecays = new ArrayList<>();
    public boolean enableBounciness = false;

    /** 穿透相关设置 */
    public float penetratingPower = 1F;
    public float penetratingDamageLoss = 0.8F;
    public float penetratingSpeedLoss = 0.9F;
    public int penetratingBlockMaxNum = 2;

    public float playerPenetrationEffectOnDamage = 0F;
    public float entityPenetrationEffectOnDamage = 0F;
    public float blockPenetrationEffectOnDamage = 0F;
    public float penetrationDecayEffectOnDamage = 0F;
    public boolean duckBill = false;
    public boolean enableAirburst = false;
    public float airburstRange = 3;
    public float airburstDamageRange = 0;
    public float airburstDamage = 0;
    public boolean deploySubmunitionOnAirburst = false;

    /** 制导相关参数 **/
    public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;
    //发射时锁定目标的最大角度
    public float maxLockOnAngle = 45F;
    //暂时没用
    public float lockOnForce = 1F;
    //弹药导引头最大导引角度
    public int maxDegreeOfMissile = 20;
    //锁定延时
    public int tickStartHoming = 5;
    //脱锁延时，-1为永远锁定
    public int tickEndHoming = -1;
    //启用半主动导引
    public boolean enableSACLOS = false;
    //半主动导引最大角度
    public int maxDegreeOfSACLOS = 5;
    //没用
    public int maxRangeOfMissile = 150;
    //攻顶
    public boolean isDoTopAttack = false;
    //攻顶
    public boolean shootForSettingPos = false;
    //攻顶第一阶段最大高度
    public int shootForSettingPosHeight = 100;
    //粒子
    public boolean VLS = false;
    //粒子
    public int VLSTime = 0;
    public boolean fixedDirection = false;
    //启用指令线制导
    public boolean manualGuidance = false;
    //瞄准线制导参数
    public float turnRadiusCLOS = 3;
    //瞄准线制导参数
    public float trackPhaseSpeedCLOS = 2;
    //瞄准线制导参数
    public float trackPhaseTurnCLOS = 0.1F;
    //瞄准线制导参数
    public float maxGuidedSpeedMultiplierCLOS = 2.0f;
    //适用拖线导弹
    public boolean hasLine = false;
    //启用人工瞄准线制导(键盘导引)
    public boolean enableMCLOS = false;
    //安全引爆距离，-1为不启用
    public int safeDistance = -1;
    //导弹加力粒子
    public String boostPhaseParticleType;
    //允许MCLOS导弹加力
    public boolean enableBoost = false;
    //是否启用炮弹跟随视角
    public boolean enableCameraFollow = false;
    //是否是固定摄像头
    public boolean fixCamera = true;


    public BulletType(TypeFile file) {
        super(file);
        texture = "defaultBullet";
        bullets.add(this);
    }

    public static BulletType getBullet(String s) {
        for (BulletType bullet : bullets) {
            if (bullet.shortName.equals(s))
                return bullet;
        }
        return null;
    }

    public static BulletType getBullet(Item item) {
        for (BulletType bullet : bullets) {
            if (bullet.item == item)
                return bullet;
        }
        return null;
    }

    @Override
    protected void read(String[] split, TypeFile file) {
        super.read(split, file);
        try {
            switch (split[0]) {
                case "FlakParticles":
                    flak = Integer.parseInt(split[1]);
                    break;
                case "canLoadChunkWithBullet":
                    canLoadChunkWithBullet = Boolean.parseBoolean(split[1]);
                    break;
                case "FlakParticleType":
                    flakParticles = split[1];
                    break;
                case "FlakParticlesCrack":
                    flakParticlesCrack = Integer.parseInt(split[1]);
                    break;
                case "FlakParticlesDiff":
                    flakParticlesDiff = Float.parseFloat(split[1]);
                    break;
                case "whichViewLocked":
                    whichViewLocked = Integer.parseInt(split[1]);
                    break;
                case "SetEntitiesOnFire":
                    setEntitiesOnFire = Boolean.parseBoolean(split[1]);
                    break;
                case "SetEntitiesOnFireTime":
                    setEntitiesOnFireTime = Integer.parseInt(split[1]);
                    break;
                case "HitSoundEnable":
                    hitSoundEnable = Boolean.parseBoolean(split[1]);
                    break;
                case "minDamageDistanceToPlane":
                    minDamageDistanceToPlane = Float.parseFloat(split[1]);
                    break;
                case "maxDamageDistanceToPlane":
                    maxDamageDistanceToPlane = Float.parseFloat(split[1]);
                    break;
                case "maxdamagetoself":
                    maxdamagetoself = Integer.parseInt(split[1]);
                    break;
                case "EntityHitSoundEnable":
                    entityHitSoundEnable = Boolean.parseBoolean(split[1]);
                    break;
                case "HitSound":
                    hitSound = split[1];
                    FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
                    break;
                case "HitSoundIron":
                    hitSoundIron = split[1];
                    FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
                    break;
                case "HitSoundRange":
                    hitSoundRange = Float.parseFloat(split[1]);
                    break;
                case "Penetrates":
                    penetratingPower = (Boolean.parseBoolean(split[1].toLowerCase()) ? 1F : 0.7F);
                    break;
                case "Penetration":
                case "PenetratingPower":
                    penetratingPower = Float.parseFloat(split[1]);
                    break;
                case "DragInAir":
                    dragInAir = Float.parseFloat(split[1]);
                    dragInAir = dragInAir < 0 ? 0 : dragInAir > 1 ? 1 : dragInAir;
                    break;
                case "DragInWater":
                    dragInWater = Float.parseFloat(split[1]);
                    dragInWater = dragInWater < 0 ? 0 : dragInWater > 1 ? 1 : dragInWater;
                    break;
                case "NumBullets":
                    numBullets = Integer.parseInt(split[1]);
                    break;
                case "Accuracy":
                case "Spread":
                    bulletSpread = Float.parseFloat(split[1]);
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
                case "PrimeDelay":
                case "TriggerDelay":
                    primeDelay = Integer.parseInt(split[1]);
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
                case "VLS":
                case "HasDeadZone":
                    VLS = Boolean.parseBoolean(split[1]);
                    break;
                case "enableCameraFollow":
                    enableCameraFollow = Boolean.parseBoolean(split[1]);
                    break;
                case "VLSTime":
                case "DeadZoneTime":
                    VLSTime = Integer.parseInt(split[1]);
                    break;
                case "FixedTrackDirection":
                    fixedDirection = Boolean.parseBoolean(split[1]);
                    break;
                case "GuidedTurnRadius":
                    turnRadiusCLOS = Float.parseFloat(split[1]);
                    break;
                case "GuidedPhaseSpeed":
                    trackPhaseSpeedCLOS = Float.parseFloat(split[1]);
                    break;
                case "GuidedPhaseTurnSpeed":
                    trackPhaseTurnCLOS = Float.parseFloat(split[1]);
                    break;
                case "GuidedMaxSpeedMultiplier":
                    maxGuidedSpeedMultiplierCLOS = Float.parseFloat(split[1]);
                    break;
                case "BoostParticleType":
                    boostPhaseParticleType = split[1];
                    break;
                case "Torpedo":
                    torpedo = Boolean.parseBoolean(split[1]);
                    break;
                case "Bomb":
                    weaponType = EnumWeaponType.BOMB;
                    break;
                case "Shell":
                    weaponType = EnumWeaponType.SHELL;
                    break;
                case "Missile":
                    weaponType = EnumWeaponType.MISSILE;
                    break;
                case "WeaponType":
                    weaponType = EnumWeaponType.valueOf(split[1].toUpperCase());
                    break;
                case "LockOnToDriveables":
                    lockOnToPlanes = lockOnToVehicles = lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "LockOnToVehicles":
                    lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "LockOnToPlanes":
                    lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "LockOnToMechas":
                    lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "LockOnToPlayers":
                    lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "LockOnToLivings":
                    lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "MaxLockOnAngle":
                    maxLockOnAngle = Float.parseFloat(split[1]);
                    break;
                case "LockOnForce":
                case "TurningForce":
                    lockOnForce = Float.parseFloat(split[1]);
                    break;
                case "MaxDegreeOfLockOnMissile":
                    maxDegreeOfMissile = Integer.parseInt(split[1]);
                    break;
                case "TickStartHoming":
                    tickStartHoming = Integer.parseInt(split[1]);
                    break;
                case "TickEndHoming":
                    tickEndHoming = Integer.parseInt(split[1]);
                    break;
                case "EnableSACLOS":
                    enableSACLOS = Boolean.parseBoolean(split[1]);
                    break;
                case "MaxDegreeOfSACLOS":
                    maxDegreeOfSACLOS = Integer.parseInt(split[1]);
                    break;
                case "MaxRangeOfMissile":
                    maxRangeOfMissile = Integer.parseInt(split[1]);
                    break;
                case "CanSpotEntityDriveable":
                    canSpotEntityDriveable = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "ShootForSettingPos":
                    shootForSettingPos = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "ShootForSettingPosHeight":
                    shootForSettingPosHeight = Integer.parseInt(split[1]);
                    break;
                case "IsDoTopAttack":
                    isDoTopAttack = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "KnockbackModifier":
                    knockbackModifier = Float.parseFloat(split[1]);
                    break;
                case "PotionEffect":
                    hitEffects.add(getPotionEffect(split));
                    break;
                case "ManualGuidance":
                    manualGuidance = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "MaxRange":
                    maxRange = Integer.parseInt(split[1]);
                    break;
                case "FancyDescription":
                    fancyDescription = Boolean.parseBoolean(split[1]);
                    break;
                case "BulletSpeedMultiplier":
                    speedMultiplier = Float.parseFloat(split[1]);
                    break;
                case "IfPrintTheExplodePoint":
                    printExplodePoint = Boolean.parseBoolean(split[1]);
                    break;
                case "IfDropItemOnHitBlocks":
                    dropItemOnHitBlocks = Boolean.parseBoolean(split[1]);
                    break;
                case "DropItemOnHitBlocks":
                    dropItemIdOnHitBlocks = Integer.parseInt(split[1]);
                    break;
                case "DIOHBnum":
                    dropItemNumOnHitBlocks = Integer.parseInt(split[1]);
                    break;
                case "ShootHeadMultiplier":
                    shootHeadMultiplier = Float.parseFloat(split[1]);
                    break;
                case "ShootArmMultiplier":
                    shootArmMultiplier = Float.parseFloat(split[1]);
                    break;
                case "ShootLegMultiplier":
                    shootLegMultiplier = Float.parseFloat(split[1]);
                    break;
                case "IsEOD":
                    isEOD = Boolean.parseBoolean(split[1]);
                    break;
                case "EnableBulletDecay":
                    enableBulletDecay = Boolean.parseBoolean(split[1]);
                    break;
                case "BulletDecay": {
                    String bulletDecayType = split[1];
                    String[] args = new String[split.length - 2];
                    System.arraycopy(split, 2, args, 0, args.length);
                    bulletDecays.add(BulletDecayFactory.createBulletDecay(bulletDecayType, args));
                    enableBulletDecay = true;
                    break;
                }
                case "EnableBounciness":
                    enableBounciness = Boolean.parseBoolean(split[1].toLowerCase());
                    break;
                case "PenetratingDamageLoss":
                    penetratingDamageLoss = Float.parseFloat(split[1]);
                    break;
                case "PenetratingSpeedLoss":
                    penetratingSpeedLoss = Float.parseFloat(split[1]);
                    break;
                case "PenetratingBlockMaxNum":
                    penetratingBlockMaxNum = Integer.parseInt(split[1]);
                    break;
                case "EnableAirburst":
                    enableAirburst = Boolean.parseBoolean(split[1]);
                    break;
                case "AirburstRange":
                    airburstRange = Float.parseFloat(split[1]);
                    break;
                case "AirburstDamageRange":
                    airburstDamageRange = Float.parseFloat(split[1]);
                    break;
                case "AirburstDamage":
                    airburstDamage = Float.parseFloat(split[1]);
                    break;
                case "DeploySubmunitionOnAirburst":
                    deploySubmunitionOnAirburst = Boolean.parseBoolean(split[1]);
                    break;
                case "HasLine":
                    hasLine = Boolean.parseBoolean(split[1]);
                    break;
                case "EnableMCLOS":
                    enableMCLOS = Boolean.parseBoolean(split[1]);
                    break;
                case "EnableBoost":
                    enableBoost = Boolean.parseBoolean(split[1]);
                    break;
            }
        } catch (Exception e) {
            FlansMod.log("Reading bullet file failed.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }

    /**
     * To be overriden by subtypes for model reloading
     */
    public void reloadModel() {
        model = FlansMod.proxy.loadModel(modelString, shortName, ModelBase.class);
    }
}
