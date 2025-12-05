package com.flansmod.common.guns.type;

import com.flansmod.client.model.*;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.EnumSecondaryFunction;
import com.flansmod.common.guns.IMarkable;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.item.ItemBullet;
import com.flansmod.common.guns.item.ItemGrenade;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class GunType extends PaintableType implements IScope, IMarkable {

    public static final Random rand = new Random();
    /**
     * The static hashmap of all guns by shortName
     */
    public static HashMap<String, GunType> guns = new HashMap<>();
    /**
     * The static list of all guns
     */
    public static ArrayList<GunType> gunList = new ArrayList<>();
    /**
     * Base value for Upwards cursor/view recoil
     */
    public String ResupplyType;
    public float recoilPitch = 0.0F;
    /**
     * Base value for Left/Right cursor/view recoil
     */
    public float recoilYaw = 0.0F;
    /**
     * Modifier for setting the maximum pitch divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range)
     */
    public float rndRecoilPitchRange = 0.5F;
    /**
     * Modifier for setting the maximum yaw divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range)
     */
    public float rndRecoilYawRange = 0.3F;
    /**
     * DEPRECATED DO NOT USE. Subtracts from pitch recoil when crouching.
     */
    public float decreaseRecoilPitch = 0F;
    /**
     * DEPRECATED DO NOT USE. Divisor for yaw recoil when crouching.
     */
    public float decreaseRecoilYaw = 0F;
    /**
     * The alternatives to the above. Simple multipliers for sneaking, sprinting on yaw and pitch respectively. 1F = no change.
     * -1F is to be used to enable backwards compatibility for sneaking (-2F rather than multiplying)
     */
    public float recoilSneakingMultiplier = 1F;
    public float recoilSprintingMultiplier = 2F;

    /* Countering gun recoil can be modelled with angle=n^tick where n is the coefficient here. */
    public float recoilSneakingMultiplierYaw = 1F;
    public float recoilSprintingMultiplierYaw = 1.5F;
    /**
     * HIGHER means less force to center, meaning it takes longer to return.
     */
    public float recoilCounterCoefficient = 0.8F;

    //Ammo & Reload Variables
    /**
     * The above variable but for sprinting.
     */
    public float recoilCounterCoefficientSprinting = 0.9F;
    /**
     * The above variable but for sneaking.
     */
    public float recoilCounterCoefficientSneaking = 0.8F;
    /**
     * The list of bullet types that can be used in this gun
     */
    public List<ShootableType> ammo = new ArrayList<>();
    /**
     * Whether the player can press the reload key (default R) to reload this gun
     */
    public boolean canForceReload = true;
    /**
     * Whether the player can receive ammo for this gun from an ammo mag
     */
    public boolean allowRearm = true;

    //Projectile Mechanic Variables
    /**
     * The time (in ticks) it takes to reload this gun
     */
    public int reloadTime;

    /**
     * 战术换弹时间
     */
    public int tacticalReloadTime = -1;

    /**
     * Number of ammo items that the gun may hold. Most guns will hold one magazine.
     * Some may hold more, such as Nerf pistols, revolvers or shotguns
     */
    public int numPrimaryAmmoItems = 1;
    /**
     * The amount that bullets spread out when fired from this gun
     */
    public float bulletSpread;
    public float sneakSpreadMultiplier = 1.0F;
    public float sprintSpreadMultiplier = 1.0F;
    public float minSpread = 0.0F;
    /**
     * If true, spread determined by loaded ammo type
     */
    public boolean allowSpreadByBullet = false;
    /**
     * Damage inflicted by this gun. Multiplied by the bullet damage.
     */
    public float damage = 0;
    /**
     * The damage inflicted upon punching someone with this gun
     */
    public float meleeDamage = 1;
    // Modifier for melee damage against specifically driveable entities.
    public float meleeDamageDriveableModifier = 1;
    /**
     * The speed of bullets upon leaving this gun
     */
    public float bulletSpeed = 5.0F;
    /**
     * The number of bullet entities created by each shot
     */
    public int numBullets = 1;
    /**
     * Allows you to set how many bullet entities are fired per shot via the ammo used
     */
    public boolean allowNumBulletsByBulletType = false;
    /**
     * The delay between shots in ticks (1/20ths of seconds) OUTDATED, USE RPM
     */
    public float shootDelay = 0;
    /**
     * The fire rate of the gun in RPM, 1200 = MAX
     */
    public float roundsPerMin = 0;
    /**
     * The firing mode of the gun. One of semi-auto, full-auto, minigun or burst
     */
    public EnumFireMode mode = EnumFireMode.FULLAUTO;
    public EnumFireMode[] submode = new EnumFireMode[]{EnumFireMode.FULLAUTO};
    public EnumFireMode defaultmode = mode;

    /**
     * The number of bullets to fire per burst in burst mode
     */
    private int numBurstRounds = 3;
    /**
     * The required speed for minigun mode guns to start firing
     */
    public float minigunStartSpeed = 15F;
    /**
     * Whether this gun can be used underwater
     */
    public boolean canShootUnderwater = true;
    /**
     * The secondary function of this gun. By default, the left mouse button triggers this
     */
    public EnumSecondaryFunction secondaryFunction = EnumSecondaryFunction.ADS_ZOOM;
    public EnumSecondaryFunction secondaryFunctionWhenShoot = null;
    /**
     * If true, then this gun can be dual wielded
     */
    public boolean oneHanded = false;
    /**
     * For one shot items like a panzerfaust
     */
    public boolean consumeGunUponUse = false;
    /**
     * Show the crosshair when holding this weapon
     */
    public boolean showCrosshair = true;
    /**
     * Item to drop on shooting
     */
    public String dropItemOnShoot = null;
    /* Whether the gun can be hipfired while sprinting */
    /**
     * Set these to make guns only usable by a certain type of entity
     */
    public boolean usableByPlayers = true, usableByMechas = true;
    /**
     * Whether Gun makes players to be EnumAction.bow
     */
    public EnumAction itemUseAction = EnumAction.bow;
    /**
     * 0=use flansmod.cfg default, 1=force allow, 2=force deny
     **/
    public int hipFireWhileSprinting = 0;
    //Launcher variables
    public int canLockOnAngle = 5;
    public int lockOnSoundTime = 0;
    public String lockOnSound = "";
    public int maxRangeLockOn = 80;


    //Shields
	/*A shield is actually a gun without any shoot functionality (similar to knives or binoculars)
	and a load of shield code on top. This means that guns can have in built shields (think Nerf Stampede) */
    public boolean canSetPosition = false;
    /**
     * Determines what the launcher can lock on to
     */
    public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;
    /**
     * Whether or not this gun has a shield piece
     */
    public boolean shield = false;

    //Sounds
    /**
     * Shield collision box definition. In model co-ordinates
     */
    public Vector3f shieldOrigin, shieldDimensions;
    /**
     * Percentage of damage blocked between 0.00-1.00 (0.50F = 50%)
     */
    public float shieldDamageAbsorption = 0F;
    /**
     * The sound played upon shooting
     */
    public String shootSound;
    /**
     * Bullet insert reload sound
     */
    public String bulletInsert = "defaultshellinsert";
    /**
     * Pump Sound
     */
    public String actionSound;
    /**
     * The sound to play upon shooting on last round
     */
    public String lastShootSound;
    /**
     * The sound played upon shooting with a suppressor
     */
    public String suppressedShootSound;
    /**
     * The length of the sound for looping sounds
     */
    public int shootSoundLength;
    /**
     * Whether to distort the sound or not. Generally only set to false for looping sounds
     */
    public String reloadSound;
    /**
     * The sound to play upon reloading when empty
     */
    public String reloadSoundOnEmpty;
    /**
     * The sound to play open firing when empty(once)
     */
    public String clickSoundOnEmpty;

    //Sound Modifiers
    /**
     * Sound to play on firing when empty(multiple times)
     */
    public String clickSoundOnEmptyRepeated;
    /**
     * The sound to play while holding the weapon in the hand
     */
    public String idleSound;
    /**
     * Whether to distort the sound or not. Generally only set to false for looping sounds
     */
    public boolean distortSound = true;
    /**
     * The length of the idle sound for looping sounds (miniguns)
     */
    public int idleSoundLength;
    /**
     * The block range for idle sounds (for miniguns etc)
     */
    public int idleSoundRange = 50;
    /**
     * The block range for melee sounds
     */
    public int meleeSoundRange = 50;
    /**
     * The block range for reload sounds
     */
    public int reloadSoundRange = 50;
    /**
     * The block range for gunshots sounds
     */
    public int gunSoundRange = 50;
    public boolean isCanRunningShot = false;

    //Looping sounds
    /**
     * Sound to be played outside of normal range
     */
    public String distantShootSound = "";
    /**
     * Max range for the sound to be played
     */
    public int distantSoundRange = 100;
    /**
     * Whether the looping sounds should be used. Automatically set if the player sets any one of the following sounds
     */
    public boolean useLoopingSounds = false;
    /**
     * Played when the player starts to hold shoot
     */
    public String warmupSound;
    public int warmupSoundLength = 20;
    /**
     * Played in a loop until player stops holding shoot
     */
    public String loopedSound;

    //Custom Melee Stuff
    public int loopedSoundLength = 20;
    /**
     * Played when the player stops holding shoot
     */
    public String cooldownSound;
    /**
     * The sound to play upon weapon swing
     */
    public String meleeSound;
    /**
     * The time delay between custom melee attacks
     */
    public int meleeTime = 1;


    //Deployable Settings
    /**
     * The path the melee weapon takes
     */
    public ArrayList<Vector3f> meleePath = new ArrayList<>(), meleePathAngles = new ArrayList<>();
    /**
     * The points on the melee weapon that damage is actually done from.
     */
    public ArrayList<Vector3f> meleeDamagePoints = new ArrayList<>();
    /**
     * If true, then the bullet does not shoot when right-clicked, but must instead be placed on the ground
     */
    public boolean deployable = false;
    /**
     * The deployable model
     */
    public ModelMG deployableModel;
    public String deployableModelString;

    //Default Scope Settings. Overriden by scope attachments
    //In many cases, this will simply be iron sights
    /**
     * The deployable model's texture
     */
    public String deployableTexture;
    /**
     * Various deployable settings controlling the player view limits and standing position
     */
    public float standBackDist = 1.5F, topViewLimit = -60F, bottomViewLimit = 30F, sideViewLimit = 45F, pivotHeight = 0.375F;
    /**
     * Default scope overlay texture
     */
    public String defaultScopeTexture;
    /**
     * Whether the default scope has an overlay
     */
    public boolean hasScopeOverlay = false;
    /**
     * The zoom level of the default scope
     */
    public float zoomLevel = 1.0F;
    /**
     * The FOV zoom level of the default scope
     */
    public float FOVFactor = 1.5F;
    /**
     * Gives night vision while scoped if true
     */
    public boolean allowNightVision = false;
    @SideOnly(Side.CLIENT)
    public ModelGun model;
    public float modelScale = 1F;
    /**
     * 第三人称模型
     */
    @SideOnly(Side.CLIENT)
    public ModelGun thirdPersonModel;
    /**
     * 第三人称模型贴图
     */
    public String thirdPersonTexture;
    /**
     * 第三人称模型比例
     */
    public float thirdPersonModelScale;
    public ModelCasing casingModel;
    public String casingModelString;
    public ModelFlash flashModel;
    public String flashModelString;
    public String casingTexture;
    public String flashTexture;
    public String hitTexture;
    public String muzzleFlashParticle = "flansmod.muzzleflash";
    public float muzzleFlashParticleSize = 1F;
    public Boolean showMuzzleFlashParticlesFirstPerson = false;
    public Vector3f muzzleFlashParticlesHandOffset = new Vector3f();
    public Vector3f muzzleFlashParticlesShoulderOffset = new Vector3f();

    //Attachment settings
    /**
     * If this is true, then all attachments are allowed. Otherwise, the list is checked.
     */
    public boolean allowAllAttachments = false;
    /**
     * The list of allowed attachments for this gun
     */
    public ArrayList<AttachmentType> allowedAttachments = new ArrayList<>();
    /**
     * Whether each attachment slot is available
     */
    public boolean allowBarrelAttachments = false, allowScopeAttachments = false,
            allowStockAttachments = false, allowGripAttachments = false, allowGadgetAttachments = false,
            allowSlideAttachments = false, allowPumpAttachments = false, allowAccessoryAttachments = false;
    /**
     * The number of generic attachment slots there are on this gun
     */
    public int numGenericAttachmentSlots = 0;

    /**
     * Speeds up or slows down player movement when this item is held
     */
    public float moveSpeedModifier = 1F;

    /**
     * 瞄准时速度倍率
     */
    public float aimingMoveSpeedMultiplier = 0.9F;

    /**
     * Gives knockback resistance to the player
     */
    public float knockbackModifier = 0F;

    //Modifiers
    // Modifier for (usually decreasing) spread when gun is ADS. -1 uses default values from flansmod.cfg
    public float adsSpreadModifier = 1.0F;
    // Modifier for (usually decreasing) spread when gun is ADS. -1 uses default values from flansmod.cfg. For shotguns.
    public float adsSpreadModifierShotgun = 1.0F;
    public float singleShootSpreadModifier = 1.0F;
    /**
     * 瞄准时间
     */
    private float aimTimeConstant = 0.635F;
    /**
     * 枪械是否可以跑射
     */
    public boolean isCanShootWhileRunning = false;

    /**
     * 掏枪动画时间
     */
    public float takeOutTime = 8;
    /**
     * 奔跑收枪动画时间
     */
    public float runPosTime = 6;
    /**
     * 下蹲缩放动画时间
     */
    public float runCrouchTime = 4;
    public float restTime = 12;
    public float unrestTime = 6;
    /**
     * 枪械开火时模型在x轴的位移
     */
    public float recoilDistance = 0.08F;
    public float recoilDistanceHipFire = 0.11F;
    /**
     * 枪械开火时模型上抬角度
     */
    public float recoilAngle = -2.0F;
    /**
     * 枪械开火时模型在z轴的位移
     */
    public float recoilShakeDistance = 0.1F;
    /**
     * 是否开枪后收镜
     */
    public boolean cancelAimingAfterShoot = false;

    /**
     * 是否可以发现实体
     */
    public boolean canSpotEntity = false;
    public boolean isDetector = false;
    public boolean isDuckBill = false;
    public boolean useCircleCrosshair = false;

    public String tacticalReloadGLTFAnimation = "";
    public boolean useTacticalReloadAnimation = false;
    public boolean useLoopReloadAnimation = false;
    public boolean renderExtraAmmo = false;
    public String shootAnimation;
    public String aimingShootAnimation;
    private Boolean useMuzzleFlashDefaults = true;
    private Boolean showMuzzleFlashParticles = true;

    /**
     * Default spread of the gun. Do not modify.
     */
    private float defaultSpread = 0F;
    public boolean canAIUse = true;
    public float cameraShakeModifier = 1;

    public boolean isAED = false;
    public boolean explodeOnEmpty = false;
    public String overlayTexture;
    public double overlayTextureScale = 1.0;

    public GunType(TypeFile file) {
        super(file);
    }

    /**
     * Static String to GunType method
     */
    public static GunType getGun(String s) {
        return guns.get(s);
    }

    @Override
    public void preRead(TypeFile file) {
        super.preRead(file);
    }

    @Override
    public void postRead(TypeFile file) {
        super.postRead(file);

        gunList.add(this);
        guns.put(shortName, this);
    }

    @Override
    protected void read(String[] split, TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("Damage"))
                damage = Float.parseFloat(split[1]);
            else if (split[0].equals("MeleeDamage")) {
                meleeDamage = Float.parseFloat(split[1]);
                if (meleeDamage > 0F)
                    secondaryFunction = EnumSecondaryFunction.MELEE;
            } else if (split[0].equals("MeleeDamageDriveableModifier")) {
                meleeDamageDriveableModifier = Float.parseFloat(split[1]);
            } else if (split[0].equals("CounterRecoilForce"))
                recoilCounterCoefficient = Float.parseFloat(split[1]);
            else if (split[0].equals("CounterRecoilForceSneaking"))
                recoilCounterCoefficientSneaking = Float.parseFloat(split[1]);
            else if (split[0].equals("CounterRecoilForceSprinting"))
                recoilCounterCoefficientSprinting = Float.parseFloat(split[1]);
            else if (split[0].equals("SneakSpreadModifier"))
                sneakSpreadMultiplier = Float.parseFloat(split[1]);
            else if (split[0].equals("SprintSpreadModifier"))
                sprintSpreadMultiplier = Float.parseFloat(split[1]);
            else if (split[0].equals("CanForceReload"))
                canForceReload = Boolean.parseBoolean(split[1].toLowerCase());
            else if (split[0].equals("AllowRearm"))
                allowRearm = Boolean.parseBoolean(split[1].toLowerCase());
            else if (split[0].equals("ReloadTime"))
                reloadTime = Integer.parseInt(split[1]);
            else if (split[0].equals("Recoil"))
                recoilPitch = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilAngle"))
                recoilAngle = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilDistance"))
                recoilDistance = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilDistanceHipFire"))
                recoilDistanceHipFire = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilShakeDistance"))
                recoilShakeDistance = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilYaw"))
                recoilYaw = Float.parseFloat(split[1]) / 10;
            else if (split[0].equals("RandomRecoilRange"))
                rndRecoilPitchRange = Float.parseFloat(split[1]);
            else if (split[0].equals("RandomRecoilYawRange"))
                rndRecoilYawRange = Float.parseFloat(split[1]);
            else if (split[0].equals("DecreaseRecoil"))
                decreaseRecoilPitch = Float.parseFloat(split[1]);
            else if (split[0].equals("DecreaseRecoilYaw"))
                decreaseRecoilYaw = Float.parseFloat(split[1]) > 0 ? Float.parseFloat(split[1]) : 0.5F;
            else if (split[0].equals("RecoilSneakingMultiplier"))
                recoilSneakingMultiplier = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilSprintingMultiplier"))
                recoilSprintingMultiplier = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilSneakingMultiplierYaw"))
                recoilSneakingMultiplierYaw = Float.parseFloat(split[1]);
            else if (split[0].equals("RecoilSprintingMultiplierYaw"))
                recoilSprintingMultiplierYaw = Float.parseFloat(split[1]);
            else if (split[0].equals("Accuracy") || split[0].equals("Spread"))
                defaultSpread = bulletSpread = Float.parseFloat(split[1]);
                /* 读取开镜准度 */
            else if (split[0].equals("ResupplyType"))
                ResupplyType = split[1];
            else if (split[0].equals("ADSSpreadModifier") || split[0].equals("AimingSpreadConstant"))
                adsSpreadModifier = Float.parseFloat(split[1]);
            else if (split[0].equals("ADSSpreadModifierShotgun"))
                adsSpreadModifierShotgun = Float.parseFloat(split[1]);
                /* 读取开镜速度 */
            else if (split[0].equals("AimTimeConstant"))
                aimTimeConstant = Float.parseFloat(split[1]);
                /* 读取单发射击下的准度倍率 */
            else if (split[0].equals("SingleShootSpreadModifier"))
                singleShootSpreadModifier = Float.parseFloat(split[1]);
            else if (split[0].equals("RunPosTime"))
                runPosTime = Float.parseFloat(split[1]);
            else if (split[0].equals("RunCrouchTime"))
                runCrouchTime = Float.parseFloat(split[1]);
            else if (split[0].equals("IsCanShootWhileRunning"))
                isCanShootWhileRunning = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("NumBullets"))
                numBullets = Integer.parseInt(split[1]);
            else if (split[0].equals("AllowNumBulletsByBulletType"))
                allowNumBulletsByBulletType = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowSpreadByBullet"))
                allowSpreadByBullet = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("CanLockAngle"))
                canLockOnAngle = Integer.parseInt(split[1]);
            else if (split[0].equals("LockOnSoundTime"))
                lockOnSoundTime = Integer.parseInt(split[1]);
            else if (split[0].equals("LockOnToDriveables"))
                lockOnToPlanes = lockOnToVehicles = lockOnToMechas = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("LockOnToVehicles"))
                lockOnToVehicles = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("LockOnToPlanes"))
                lockOnToPlanes = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("LockOnToMechas"))
                lockOnToMechas = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("LockOnToPlayers"))
                lockOnToPlayers = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("LockOnToLivings"))
                lockOnToLivings = Boolean.parseBoolean(split[1]);

            else if (split[0].equals("ConsumeGunOnUse"))
                consumeGunUponUse = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("ShowCrosshair"))
                showCrosshair = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("DropItemOnShoot"))
                dropItemOnShoot = split[1];
            else if (split[0].equals("NumBurstRounds"))
                numBurstRounds = Integer.parseInt(split[1]);
            else if (split[0].equals("MinigunStartSpeed"))
                minigunStartSpeed = Float.parseFloat(split[1]);
            else if (split[0].equals("ItemUseAction"))
                itemUseAction = EnumAction.valueOf(split[1]);
            else if (split[0].equals("HipFireWhileSprinting"))
                hipFireWhileSprinting = Boolean.parseBoolean(split[1]) ? 1 : 2;
            else if (split[0].equals("MaxRangeLockOn"))
                maxRangeLockOn = Integer.parseInt(split[1]);


                //Sounds
            else if (split[0].equals("ShootDelay"))
                shootDelay = Float.parseFloat(split[1]);
            else if (split[0].equals("RoundsPerMin") || split[0].equals("RPM"))
                roundsPerMin = Float.parseFloat(split[1]);
            else if (split[0].equals("SoundLength"))
                shootSoundLength = Integer.parseInt(split[1]);
            else if (split[0].equals("DistortSound"))
                distortSound = split[1].equals("True");
            else if (split[0].equals("IdleSoundRange"))
                idleSoundRange = Integer.parseInt(split[1]);
            else if (split[0].equals("MeleeSoundRange"))
                meleeSoundRange = Integer.parseInt(split[1]);
            else if (split[0].equals("ReloadSoundRange"))
                reloadSoundRange = Integer.parseInt(split[1]);
            else if (split[0].equals("GunSoundRange"))
                gunSoundRange = Integer.parseInt(split[1]);
            else if (split[0].equals("ShootSound")) {
                shootSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("BulletInsertSound")) {
                bulletInsert = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("ActionSound")) {
                actionSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("LastShootSound")) {
                lastShootSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("SuppressedShootSound")) {
                suppressedShootSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("ReloadSound")) {
                reloadSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("EmptyReloadSound")) {
                reloadSoundOnEmpty = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("EmptyClickSound")) {
                clickSoundOnEmpty = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("EmptyClickSoundRepeated")) {
                clickSoundOnEmptyRepeated = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("IdleSound")) {
                idleSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("IdleSoundLength"))
                idleSoundLength = Integer.parseInt(split[1]);
            else if (split[0].equals("MeleeSound")) {
                meleeSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            }

            //Looping sounds
            else if (split[0].equals("WarmupSound")) {
                warmupSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("WarmupSoundLength"))
                warmupSoundLength = Integer.parseInt(split[1]);
            else if (split[0].equals("LoopedSound") || split[0].equals("SpinSound")) {
                loopedSound = split[1];
                useLoopingSounds = true;
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("LoopedSoundLength") || split[0].equals("SpinSoundLength"))
                loopedSoundLength = Integer.parseInt(split[1]);
            else if (split[0].equals("CooldownSound")) {
                cooldownSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("LockOnSound")) {
                lockOnSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("DistantSound")) {
                distantShootSound = split[1];
                FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
            } else if (split[0].equals("DistantSoundRange")) {
                distantSoundRange = Integer.parseInt(split[1]);
            }

            //Modes and zoom settings
            else if (split[0].equals("Mode")) {
                mode = EnumFireMode.getFireMode(split[1]);
                defaultmode = mode;
                submode = new EnumFireMode[split.length - 1];
                for (int i = 0; i < submode.length; i++) {
                    submode[i] = EnumFireMode.getFireMode(split[1 + i]);
                }
            } else if (split[0].equals("Scope")) {
                hasScopeOverlay = true;
                if (split[1].equals("None"))
                    hasScopeOverlay = false;
                else defaultScopeTexture = split[1];
            } else if (split[0].equals("AllowNightVision")) {
                allowNightVision = Boolean.parseBoolean(split[1]);
            } else if (split[0].equals("ZoomLevel")) {
                zoomLevel = Float.parseFloat(split[1]);
                if (zoomLevel > 1F)
                    secondaryFunction = EnumSecondaryFunction.ZOOM;
            } else if (split[0].equals("FOVZoomLevel")) {
                FOVFactor = Float.parseFloat(split[1]);
                if (FOVFactor > 1F)
                    secondaryFunction = EnumSecondaryFunction.ADS_ZOOM;
            } else if (split[0].equals("Deployable"))
                deployable = split[1].equals("True");
            else if (FMLCommonHandler.instance().getSide().isClient() && deployable && split[0].equals("DeployedModel")) {
                deployableModel = FlansMod.proxy.loadModel(split[1], shortName, ModelMG.class);
                deployableModelString = split[1];
            } else if (FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("Model"))) {
                model = FlansMod.proxy.loadModel(split[1], shortName, ModelGun.class);
            }
            //TODO
            else if (FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("3rdModel")))
                thirdPersonModel = FlansMod.proxy.loadModel(split[1], shortName, ModelGun.class);
            else if (FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("CasingModel"))) {
                casingModel = FlansMod.proxy.loadModel(split[1], shortName, ModelCasing.class);
                casingModelString = split[1];
            } else if (FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("FlashModel"))) {
                flashModel = FlansMod.proxy.loadModel(split[1], shortName, ModelFlash.class);
                flashModelString = split[1];
            } else if (split[0].equals("CasingTexture"))
                casingTexture = split[1];
            else if (split[0].equals("FlashTexture"))
                flashTexture = split[1];
            else if (split[0].equals("MuzzleFlashParticle"))
                muzzleFlashParticle = split[1];
            else if (split[0].equals("MuzzleFlashParticleSize"))
                muzzleFlashParticleSize = Float.parseFloat(split[1]);
            else if (split[0].equals("ShowMuzzleFlashParticle")) {
                showMuzzleFlashParticles = Boolean.parseBoolean(split[1]);
                useMuzzleFlashDefaults = false;
            } else if (split[0].equals("ShowMuzzleFlashParticleFirstPerson"))
                showMuzzleFlashParticlesFirstPerson = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("MuzzleFlashParticleShoulderOffset"))
                muzzleFlashParticlesShoulderOffset = new Vector3f(split[1], null);
            else if (split[0].equals("MuzzleFlashParticleHandOffset"))
                muzzleFlashParticlesHandOffset = new Vector3f(split[1], null);
            else if (split[0].equals("ModelScale")) {
                modelScale = Float.parseFloat(split[1]);
                thirdPersonModelScale = Float.parseFloat(split[1]);
            } else if (split[0].equals("Texture")) {
                texture = split[1];
                thirdPersonTexture = split[1];
            } else if (split[0].equals("3rdModelScale"))
                thirdPersonModelScale = Float.parseFloat(split[1]);
            else if (split[0].equals("3rdTexture"))
                thirdPersonTexture = split[1];
            else if (split[0].equals("HitTexture"))
                hitTexture = split[1];
            else if (split[0].equals("DeployedTexture"))
                deployableTexture = split[1];
            else if (split[0].equals("StandBackDistance"))
                standBackDist = Float.parseFloat(split[1]);
            else if (split[0].equals("TopViewLimit"))
                topViewLimit = -Float.parseFloat(split[1]);
            else if (split[0].equals("BottomViewLimit"))
                bottomViewLimit = Float.parseFloat(split[1]);
            else if (split[0].equals("SideViewLimit"))
                sideViewLimit = Float.parseFloat(split[1]);
            else if (split[0].equals("PivotHeight"))
                pivotHeight = Float.parseFloat(split[1]);
            else if (split[0].equals("Ammo")) {
                ShootableType type = ShootableType.getShootableType(split[1]);
                if (type != null)
                    ammo.add(type);
            } else if (split[0].equals("NumAmmoSlots") || split[0].equals("NumAmmoItemsInGun") || split[0].equals("LoadIntoGun"))
                numPrimaryAmmoItems = Integer.parseInt(split[1]);
            else if (split[0].equals("BulletSpeed"))
                bulletSpeed = Float.parseFloat(split[1]);
            else if (split[0].equals("CanShootUnderwater"))
                canShootUnderwater = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("CanSetPosition"))
                canSetPosition = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("OneHanded"))
                oneHanded = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("SecondaryFunction"))
                secondaryFunction = EnumSecondaryFunction.get(split[1]);
            else if (split[0].equals("UsableByPlayers"))
                usableByPlayers = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("UsableByMechas"))
                usableByMechas = Boolean.parseBoolean(split[1]);

            else if (split[0].equals("CancelAimingAfterShoot"))
                cancelAimingAfterShoot = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("CanSpotEntity")){
                canSpotEntity = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("UseCircleCrosshair") || split[0].equals("UseCircleCrossHair")){
                useCircleCrosshair = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("TacticalReloadTime")){
                tacticalReloadTime = Integer.parseInt(split[1]);
            }
            else if(split[0].equals("TacticalReloadGLTFAnimation")){
                tacticalReloadGLTFAnimation = split[1];
                useTacticalReloadAnimation = true;
            }
            else if(split[0].equals("ShootAnimation")){
                shootAnimation = split[1];
                FlansMod.proxy.loadAnimation(shootAnimation, shootAnimation);
            }
            else if(split[0].equals("AimingShootAnimation")){
                shootAnimation = split[1];
                FlansMod.proxy.loadAnimation(aimingShootAnimation, aimingShootAnimation);
            }
            else if(split[0].equals("RenderExtraAmmo")){
                renderExtraAmmo = Boolean.parseBoolean(split[1]);
            }
            else if(split[0].equals("MinSpread") || split[0].equals("MinAccuracy")){
                minSpread = Float.parseFloat(split[1]);
            }
            else if(split[0].equals("CanAIUse")){
                canAIUse = Boolean.parseBoolean(split[1]);
            }
            else if(split[0].equals("CameraShakeModifier")){
                cameraShakeModifier = Float.parseFloat(split[1]);
            }
            else if(split[0].equals("AED")){
                isAED = Boolean.parseBoolean(split[1]);
            }
            else if(split[0].equals("ExplodeOnEmpty")){
                explodeOnEmpty = Boolean.parseBoolean(split[1]);
            }

                //Custom Melee Stuff
            else if (split[0].equals("UseCustomMelee") && Boolean.parseBoolean(split[1]))
                secondaryFunction = EnumSecondaryFunction.CUSTOM_MELEE;
            else if (split[0].equals("UseCustomMeleeWhenShoot") && Boolean.parseBoolean(split[1]))
                secondaryFunctionWhenShoot = EnumSecondaryFunction.CUSTOM_MELEE;
            else if (split[0].equals("MeleeTime"))
                meleeTime = Integer.parseInt(split[1]);
            else if (split[0].equals("AddNode")) {
                meleePath.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
                meleePathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
            } else if (split[0].equals("MeleeDamagePoint") || split[0].equals("MeleeDamageOffset")) {
                meleeDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
            }

            //Player modifiers
            else if (split[0].equals("MoveSpeedModifier") || split[0].equals("Slowness"))
                moveSpeedModifier = Float.parseFloat(split[1]);
            else if (split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier"))
                knockbackModifier = Float.parseFloat(split[1]);

                //Attachment settings
            else if (split[0].equals("AllowAllAttachments"))
                allowAllAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowAttachments")) {
                for (int i = 1; i < split.length; i++) {
                    allowedAttachments.add(AttachmentType.getAttachment(split[i]));
                }
            } else if (split[0].equals("AllowBarrelAttachments"))
                allowBarrelAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowScopeAttachments"))
                allowScopeAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowStockAttachments"))
                allowStockAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowGripAttachments"))
                allowGripAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowGadgetAttachments"))
                allowGadgetAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowSlideAttachments"))
                allowSlideAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowPumpAttachments"))
                allowPumpAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("AllowAccessoryAttachments"))
                allowAccessoryAttachments = Boolean.parseBoolean(split[1]);
            else if (split[0].equals("NumGenericAttachmentSlots"))
                numGenericAttachmentSlots = Integer.parseInt(split[1]);


                //Shield settings
            else if (split[0].equalsIgnoreCase("shield")) {
                shield = true;
                shieldDamageAbsorption = Float.parseFloat(split[1]);
                shieldOrigin = new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F);
                shieldDimensions = new Vector3f(Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F, Float.parseFloat(split[7]) / 16F);
            } else if (FMLCommonHandler.instance().getSide().isClient()) {
                processAnimationConfigs(split);
            }

        } catch (Exception e) {
            if (split != null) {
                StringBuilder msg = new StringBuilder(" : ");
                for (String s : split) msg.append(" ").append(s);
                FlansMod.log("Reading gun file failed. " + file.name + msg);
            } else {
                FlansMod.log("Reading gun file failed. " + file.name);
            }
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }

    public void processAnimationConfigs(String[] split) {
        switch (split[0]) {
            case "animMinigunBarrelOrigin":
                model.minigunBarrelOrigin = parseVector3f(split);
                break;
            case "animBarrelAttachPoint":
                model.barrelAttachPoint = parseVector3f(split);
                break;
            case "animScopeAttachPoint":
                model.scopeAttachPoint = parseVector3f(split);
                break;
            case "animStockAttachPoint":
                model.stockAttachPoint = parseVector3f(split);
                break;
            case "animGripAttachPoint":
                model.gripAttachPoint = parseVector3f(split);
                break;
            case "animGadgetAttachPoint":
                model.gadgetAttachPoint = parseVector3f(split);
                break;
            case "animSlideAttachPoint":
                model.slideAttachPoint = parseVector3f(split);
                break;
            case "animPumpAttachPoint":
                model.pumpAttachPoint = parseVector3f(split);
                break;
            case "animAccessoryAttachPoint":
                model.accessoryAttachPoint = parseVector3f(split);
                break;
            case "animDefaultBarrelFlashPoint":
                model.defaultBarrelFlashPoint = parseVector3f(split);
                break;
            case "animMuzzleFlashPoint":
                model.muzzleFlashPoint = parseVector3f(split);
                break;
            case "animHasFlash":
                model.hasFlash = Boolean.parseBoolean(split[1]);
                break;
            case "animHasArms":
                model.hasArms = Boolean.parseBoolean(split[1]);
                break;
            case "animLeftArmPos":
                model.leftArmPos = parseVector3f(split);
                break;
            case "animLeftArmRot":
                model.leftArmRot = parseVector3f(split);
                break;
            case "animLeftArmScale":
                model.leftArmScale = parseVector3f(split);
                break;
            case "animRightArmPos":
                model.rightArmPos = parseVector3f(split);
                break;
            case "animRightArmRot":
                model.rightArmRot = parseVector3f(split);
                break;
            case "animRightArmScale":
                model.rightArmScale = parseVector3f(split);
                break;
            case "animRightArmReloadPos":
                model.rightArmReloadPos = parseVector3f(split);
                break;
            case "animRightArmReloadRot":
                model.rightArmReloadRot = parseVector3f(split);
                break;
            case "animLeftArmReloadPos":
                model.leftArmReloadPos = parseVector3f(split);
                break;
            case "animLeftArmReloadRot":
                model.leftArmReloadRot = parseVector3f(split);
                break;
            case "animRightArmChargePos":
                model.rightArmChargePos = parseVector3f(split);
                break;
            case "animRightArmChargeRot":
                model.rightArmChargeRot = parseVector3f(split);
                break;
            case "animLeftArmChargePos":
                model.leftArmChargePos = parseVector3f(split);
                break;
            case "animLeftArmChargeRot":
                model.leftArmChargeRot = parseVector3f(split);
                break;
            case "animStagedRightArmReloadPos":
                model.stagedrightArmReloadPos = parseVector3f(split);
                break;
            case "animStagedRightArmReloadRot":
                model.stagedrightArmReloadRot = parseVector3f(split);
                break;
            case "animStagedLeftArmReloadPos":
                model.stagedleftArmReloadPos = parseVector3f(split);
                break;
            case "animStagedLeftArmReloadRot":
                model.stagedleftArmReloadRot = parseVector3f(split);
                break;
            case "animRightHandAmmo":
                model.rightHandAmmo = Boolean.parseBoolean(split[1]);
                break;
            case "animLeftHandAmmo":
                model.leftHandAmmo = Boolean.parseBoolean(split[1]);
                break;
            case "animGunSlideDistance":
                model.gunSlideDistance = Float.parseFloat(split[1]);
                break;
            case "animAltGunSlideDistance":
                model.altgunSlideDistance = Float.parseFloat(split[1]);
                break;
            case "animRecoilSlideDistance":
                model.RecoilSlideDistance = Float.parseFloat(split[1]);
                break;
            case "animRotatedSlideDistance":
                model.RotateSlideDistance = Float.parseFloat(split[1]);
                break;
            case "animShakeDistance":
                model.ShakeDistance = Float.parseFloat(split[1]);
                break;
            case "animRecoilAmount":
                model.recoilAmount = Float.parseFloat(split[1]);
                break;
            case "animCasingAnimDistance":
                model.casingAnimDistance = parseVector3f(split);
                break;
            case "animCasingAnimSpread":
                model.casingAnimSpread = parseVector3f(split);
                break;
            case "animCasingAnimTime":
                model.casingAnimTime = Integer.parseInt(split[1]);
                break;
            case "animCasingRotateVector":
                model.casingRotateVector = parseVector3f(split);
                break;
            case "animCasingAttachPoint":
                model.casingAttachPoint = parseVector3f(split);
                break;
            case "animCasingDelay":
                model.casingDelay = Integer.parseInt(split[1]);
                break;
            case "animCasingScale":
                model.caseScale = Float.parseFloat(split[1]);
                break;
            case "animFlashScale":
                model.flashScale = Float.parseFloat(split[1]);
                break;
            case "animChargeHandleDistance":
                model.chargeHandleDistance = Float.parseFloat(split[1]);
                break;
            case "animChargeDelay":
                model.chargeDelay = Integer.parseInt(split[1]);
                break;
            case "animChargeDelayAfterReload":
                model.chargeDelayAfterReload = Integer.parseInt(split[1]);
                break;
            case "animChargeTime":
                model.chargeTime = Integer.parseInt(split[1]);
                break;
            case "animCountOnRightHandSide":
                model.countOnRightHandSide = Boolean.parseBoolean(split[1]);
                break;
            case "animIsBulletCounterActive":
                model.isBulletCounterActive = Boolean.parseBoolean(split[1]);
                break;
            case "animIsAdvBulletCounterActive":
                model.isAdvBulletCounterActive = Boolean.parseBoolean(split[1]);
                break;
            case "animAnimationType":
                switch (split[1]) {
                    case "NONE":
                        model.animationType = EnumAnimationType.NONE;
                        break;
                    case "BOTTOM_CLIP":
                        model.animationType = EnumAnimationType.BOTTOM_CLIP;
                        break;
                    case "CUSTOMBOTTOM_CLIP":
                        model.animationType = EnumAnimationType.CUSTOMBOTTOM_CLIP;
                        break;
                    case "PISTOL_CLIP":
                        model.animationType = EnumAnimationType.PISTOL_CLIP;
                        break;
                    case "CUSTOMPISTOL_CLIP":
                        model.animationType = EnumAnimationType.CUSTOMPISTOL_CLIP;
                        break;
                    case "TOP_CLIP":
                        model.animationType = EnumAnimationType.TOP_CLIP;
                        break;
                    case "CUSTOMTOP_CLIP":
                        model.animationType = EnumAnimationType.CUSTOMTOP_CLIP;
                        break;
                    case "SIDE_CLIP":
                        model.animationType = EnumAnimationType.SIDE_CLIP;
                        break;
                    case "CUSTOMSIDE_CLIP":
                        model.animationType = EnumAnimationType.CUSTOMSIDE_CLIP;
                        break;
                    case "P90":
                        model.animationType = EnumAnimationType.P90;
                        break;
                    case "CUSTOMP90":
                        model.animationType = EnumAnimationType.CUSTOMP90;
                        break;
                    case "SHOTGUN":
                        model.animationType = EnumAnimationType.SHOTGUN;
                        break;
                    case "CUSTOMSHOTGUN":
                        model.animationType = EnumAnimationType.CUSTOMSHOTGUN;
                        break;
                    case "RIFLE":
                        model.animationType = EnumAnimationType.RIFLE;
                        break;
                    case "CUSTOMRIFLE":
                        model.animationType = EnumAnimationType.CUSTOMRIFLE;
                        break;
                    case "REVOLVER":
                        model.animationType = EnumAnimationType.REVOLVER;
                        break;
                    case "CUSTOMREVOLVER":
                        model.animationType = EnumAnimationType.CUSTOMREVOLVER;
                        break;
                    case "REVOLVER2":
                        model.animationType = EnumAnimationType.REVOLVER;
                        break;
                    case "CUSTOMREVOLVER2":
                        model.animationType = EnumAnimationType.CUSTOMREVOLVER;
                        break;
                    case "END_LOADED":
                        model.animationType = EnumAnimationType.END_LOADED;
                        break;
                    case "CUSTOMEND_LOADED":
                        model.animationType = EnumAnimationType.CUSTOMEND_LOADED;
                        break;
                    case "RIFLE_TOP":
                        model.animationType = EnumAnimationType.RIFLE_TOP;
                        break;
                    case "CUSTOMRIFLE_TOP":
                        model.animationType = EnumAnimationType.CUSTOMRIFLE_TOP;
                        break;
                    case "BULLPUP":
                        model.animationType = EnumAnimationType.BULLPUP;
                        break;
                    case "CUSTOMBULLPUP":
                        model.animationType = EnumAnimationType.CUSTOMBULLPUP;
                        break;
                    case "ALT_PISTOL_CLIP":
                        model.animationType = EnumAnimationType.ALT_PISTOL_CLIP;
                        break;
                    case "CUSTOMALT_PISTOL_CLIP":
                        model.animationType = EnumAnimationType.CUSTOMALT_PISTOL_CLIP;
                        break;
                    case "GENERIC":
                        model.animationType = EnumAnimationType.GENERIC;
                        break;
                    case "CUSTOMGENERIC":
                        model.animationType = EnumAnimationType.CUSTOMGENERIC;
                        break;
                    case "BACK_LOADED":
                        model.animationType = EnumAnimationType.BACK_LOADED;
                        break;
                    case "CUSTOMBACK_LOADED":
                        model.animationType = EnumAnimationType.CUSTOMBACK_LOADED;
                        break;
                    case "STRIKER":
                        model.animationType = EnumAnimationType.STRIKER;
                        break;
                    case "CUSTOMSTRIKER":
                        model.animationType = EnumAnimationType.CUSTOMSTRIKER;
                        break;
                    case "BREAK_ACTION":
                        model.animationType = EnumAnimationType.BREAK_ACTION;
                        break;
                    case "CUSTOMBREAK_ACTION":
                        model.animationType = EnumAnimationType.CUSTOMBREAK_ACTION;
                        break;
                    case "CUSTOM":
                        model.animationType = EnumAnimationType.CUSTOM;
                        break;
                }
                break;
            case "animMeleeAnimation":
                switch (split[1]) {
                    case "DEFAULT":
                        model.meleeAnimation = EnumMeleeAnimation.DEFAULT;
                        break;
                    case "NONE":
                        model.meleeAnimation = EnumMeleeAnimation.NONE;
                        break;
                    case "BLUNT_SWING":
                        model.meleeAnimation = EnumMeleeAnimation.BLUNT_SWING;
                        break;
                    case "BLUNT_BASH":
                        model.meleeAnimation = EnumMeleeAnimation.BLUNT_BASH;
                        break;
                    case "STAB_UNDERARM":
                        model.meleeAnimation = EnumMeleeAnimation.STAB_UNDERARM;
                        break;
                    case "STAB_OVERARM":
                        model.meleeAnimation = EnumMeleeAnimation.STAB_OVERARM;
                        break;
                }
                break;
            case "animTiltGunTime":
                model.tiltGunTime = Float.parseFloat(split[1]);
                break;
            case "animUnloadClipTime":
                model.unloadClipTime = Float.parseFloat(split[1]);
                break;
            case "animLoadClipTime":
                model.loadClipTime = Float.parseFloat(split[1]);
                break;
            case "animScopeIsOnSlide":
                model.scopeIsOnSlide = Boolean.parseBoolean(split[1]);
                break;
            case "animScopeIsOnBreakAction":
                model.scopeIsOnBreakAction = Boolean.parseBoolean(split[1]);
                break;
            case "animNumBulletsInReloadAnimation":
                model.numBulletsInReloadAnimation = Float.parseFloat(split[1]);
                break;
            case "animPumpDelay":
                model.pumpDelay = Integer.parseInt(split[1]);
                break;
            case "animPumpDelayAfterReload":
                model.pumpDelayAfterReload = Integer.parseInt(split[1]);
                break;
            case "animPumpTime":
                model.pumpTime = Integer.parseInt(split[1]);
                break;
            case "animHammerDelay":
                model.hammerDelay = Integer.parseInt(split[1]);
                break;
            case "animPumpHandleDistance":
                model.pumpHandleDistance = Float.parseFloat(split[1]);
                break;
            case "animEndLoadedAmmoDistance":
                model.endLoadedAmmoDistance = Float.parseFloat(split[1]);
                break;
            case "animBreakActionAmmoDistance":
                model.breakActionAmmoDistance = Float.parseFloat(split[1]);
                break;
            case "animGripIsOnPump":
                model.gripIsOnPump = Boolean.parseBoolean(split[1]);
                break;
            case "animBarrelBreakPoint":
                model.barrelBreakPoint = parseVector3f(split);
                break;
            case "animAltBarrelBreakPoint":
                model.altbarrelBreakPoint = parseVector3f(split);
                break;
            case "animRevolverFlipAngle":
                model.revolverFlipAngle = Float.parseFloat(split[1]);
                break;
            case "animRevolver2FlipAngle":
                model.revolver2FlipAngle = Float.parseFloat(split[1]);
                break;
            case "animRevolverFlipPoint":
                model.revolverFlipPoint = parseVector3f(split);
                break;
            case "animRevolver2FlipPoint":
                model.revolver2FlipPoint = parseVector3f(split);
                break;
            case "animBreakAngle":
                model.breakAngle = Float.parseFloat(split[1]);
                break;
            case "animAltBreakAngle":
                model.altbreakAngle = Float.parseFloat(split[1]);
                break;
            case "animSpinningCocking":
                model.spinningCocking = Boolean.parseBoolean(split[1]);
                break;
            case "animSpinPoint":
                model.spinPoint = parseVector3f(split);
                break;
            case "animHammerSpinPoint":
                model.hammerSpinPoint = parseVector3f(split);
                break;
            case "animAltHammerSpinPoint":
                model.althammerSpinPoint = parseVector3f(split);
                break;
            case "animHammerAngle":
                model.hammerAngle = Float.parseFloat(split[1]);
                break;
            case "animAltHammerAngle":
                model.althammerAngle = Float.parseFloat(split[1]);
                break;
            case "animIsSingleAction":
                model.isSingleAction = Boolean.parseBoolean(split[1]);
                break;
            case "animSlideLockOnEmpty":
                model.slideLockOnEmpty = Boolean.parseBoolean(split[1]);
                break;
            case "animLeftHandPump":
                model.lefthandPump = Boolean.parseBoolean(split[1]);
                break;
            case "animRightHandPump":
                model.righthandPump = Boolean.parseBoolean(split[1]);
                break;
            case "animLeftHandCharge":
                model.leftHandCharge = Boolean.parseBoolean(split[1]);
                break;
            case "animRightHandCharge":
                model.rightHandCharge = Boolean.parseBoolean(split[1]);
                break;
            case "animLeftHandBolt":
                model.leftHandBolt = Boolean.parseBoolean(split[1]);
                break;
            case "animRightHandBolt":
                model.rightHandBolt = Boolean.parseBoolean(split[1]);
                break;
            case "animPumpModifier":
                model.pumpModifier = Float.parseFloat(split[1]);
                break;
            case "animChargeModifier":
                model.chargeModifier = parseVector3f(split);
                break;
            case "animGunOffset":
                model.gunOffset = Float.parseFloat(split[1]);
                break;
            case "animGunOffsetZ":
                model.gunOffsetZ = Float.parseFloat(split[1]);
                break;
            case "animGunOffsetX":
                model.gunOffsetX = Float.parseFloat(split[1]);
                break;
            case "animCrouchZoom":
                model.crouchZoom = Float.parseFloat(split[1]);
                break;
            case "animFancyStance":
                model.fancyStance = Boolean.parseBoolean(split[1]);
                break;
            case "animStanceTranslate":
                model.stanceTranslate = parseVector3f(split);
                break;
            case "animStanceRotate":
                model.stanceRotate = parseVector3f(split);
                break;
            case "animRotateGunVertical":
                model.rotateGunVertical = Float.parseFloat(split[1]);
                break;
            case "animRotateGunHorizontal":
                model.rotateGunHorizontal = Float.parseFloat(split[1]);
                break;
            case "animTiltGun":
                model.tiltGun = Float.parseFloat(split[1]);
                break;
            case "animTranslateGun":
                model.translateGun = parseVector3f(split);
                break;
            case "animRotateClipVertical":
                model.rotateClipVertical = Float.parseFloat(split[1]);
                break;
            case "animStagedRotateClipVertical":
                model.stagedrotateClipVertical = Float.parseFloat(split[1]);
                break;
            case "animRotateClipHorizontal":
                model.rotateClipVertical = Float.parseFloat(split[1]);
                break;
            case "animStagedRotateClipHorizontal":
                model.stagedrotateClipVertical = Float.parseFloat(split[1]);
                break;
            case "animTiltClip":
                model.tiltClip = Float.parseFloat(split[1]);
                break;
            case "animStagedTiltClip":
                model.stagedtiltClip = Float.parseFloat(split[1]);
                break;
            case "animTranslateClip":
                model.translateClip = parseVector3f(split);
                break;
            case "animStagedTranslateClip":
                model.stagedtranslateClip = parseVector3f(split);
                break;
            case "animStagedReload":
                model.stagedReload = Boolean.parseBoolean(split[1]);
                break;
            case "animThirdPersonOffset":
                model.thirdPersonOffset = parseVector3f(split);
                break;
            case "animItemFrameOffset":
                model.itemFrameOffset = parseVector3f(split);
                break;
            case "animStillRenderGunWhenScopedOverlay":
                model.stillRenderGunWhenScopedOverlay = Boolean.parseBoolean(split[1]);
                break;
            case "animAdsEffectMultiplier":
                model.adsEffectMultiplier = Float.parseFloat(split[1]);
                break;
        }
    }

    /**
     * Used only for driveables
     */
    public boolean isAmmo(ShootableType type) {
        return ammo.contains(type);
    }

    public boolean isAmmo(ShootableType type, ItemStack stack) {
        boolean result = ammo.contains(type);

        if (getGrip(stack) != null && getSecondaryFire(stack)) {
            List<ShootableType> t = new ArrayList<>();
            for (String s : getGrip(stack).secondaryAmmo) {
                ShootableType shoot = ShootableType.getShootableType(s);
                if (type != null)
                    t.add(shoot);
            }
            result = t.contains(type);
        }

        return result;
    }

    public Vector3f parseVector3f(String[] inp) {
        return new Vector3f(Float.parseFloat(inp[1]), Float.parseFloat(inp[2]), Float.parseFloat(inp[3]));
    }

    public boolean isAmmo(ItemStack stack) {
        if (stack == null)
            return false;
        else if (stack.getItem() instanceof ItemBullet) {
            return isAmmo(((ItemBullet) stack.getItem()).type, stack);
        } else if (stack.getItem() instanceof ItemGrenade) {
            return isAmmo(((ItemGrenade) stack.getItem()).type, stack);
        }
        return false;
    }

    /**
     * To be overriden by subtypes for model reloading
     */
    public void reloadModel() {
        model = FlansMod.proxy.loadModel(modelString, shortName, ModelGun.class);
        deployableModel = FlansMod.proxy.loadModel(deployableModelString, shortName, ModelMG.class);
        casingModel = FlansMod.proxy.loadModel(casingModelString, shortName, ModelCasing.class);
        flashModel = FlansMod.proxy.loadModel(flashModelString, shortName, ModelFlash.class);
    }

    @Override
    public float getZoomFactor() {
        return zoomLevel;
    }

    @Override
    public boolean hasZoomOverlay() {
        return hasScopeOverlay;
    }

    @Override
    public String getZoomOverlay() {
        return defaultScopeTexture;
    }

    @Override
    public String getDotOverlayTexture() {
        return overlayTexture;
    }

    @Override
    public double getDotOverlayTextureScale() {
        return overlayTextureScale;
    }

    //ItemStack specific methods

    @Override
    public float getFOVFactor() {
        return FOVFactor;
    }

    /**
     * Return the currently active scope on this gun. Search attachments, and by default, simply give the gun
     */
    public IScope getCurrentScope(ItemStack gunStack) {
        IScope attachedScope = getScope(gunStack);
        return (attachedScope == null) ? this : attachedScope;
    }

    /**
     * Returns all attachments currently attached to the specified gun
     */
    public ArrayList<AttachmentType> getCurrentAttachments(ItemStack gun) {
        checkForTags(gun);
        ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
        NBTTagCompound attachmentTags = gun.stackTagCompound.getCompoundTag("attachments");
        NBTTagList genericsList = attachmentTags.getTagList("generics", (byte) 10);
        for (int i = 0; i < numGenericAttachmentSlots; i++) {
            appendToList(gun, "generic_" + i, attachments);
        }
        appendToList(gun, "barrel", attachments);
        appendToList(gun, "scope", attachments);
        appendToList(gun, "stock", attachments);
        appendToList(gun, "grip", attachments);
        appendToList(gun, "gadget", attachments);
        appendToList(gun, "slide", attachments);
        appendToList(gun, "pump", attachments);
        appendToList(gun, "accessory", attachments);
        return attachments;
    }

    /**
     * Private method for attaching attachments to a list of attachments with a null check
     */
    private void appendToList(ItemStack gun, String name, ArrayList<AttachmentType> attachments) {
        AttachmentType type = getAttachment(gun, name);
        if (type != null) attachments.add(type);
    }

    //Attachment getter methods
    public AttachmentType getBarrel(ItemStack gun) {
        return getAttachment(gun, "barrel");
    }

    public AttachmentType getScope(ItemStack gun) {
        return getAttachment(gun, "scope");
    }

    public AttachmentType getStock(ItemStack gun) {
        return getAttachment(gun, "stock");
    }

    public AttachmentType getGrip(ItemStack gun) {
        return getAttachment(gun, "grip");
    }

    public AttachmentType getGadget(ItemStack gun) {
        return getAttachment(gun, "gadget");
    }

    public AttachmentType getSlide(ItemStack gun) {
        return getAttachment(gun, "slide");
    }

    public AttachmentType getPump(ItemStack gun) {
        return getAttachment(gun, "pump");
    }

    public AttachmentType getAccessory(ItemStack gun) {
        return getAttachment(gun, "accessory");
    }

    public AttachmentType getGeneric(ItemStack gun, int i) {
        return getAttachment(gun, "generic_" + i);
    }

    //Attachment ItemStack getter methods
    public ItemStack getBarrelItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "barrel");
    }

    public ItemStack getScopeItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "scope");
    }

    public ItemStack getStockItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "stock");
    }

    public ItemStack getGripItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "grip");
    }

    public ItemStack getGadgetItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "gadget");
    }

    public ItemStack getSlideItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "slide");
    }

    public ItemStack getPumpItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "pump");
    }

    public ItemStack getAccessoryItemStack(ItemStack gun) {
        return getAttachmentItemStack(gun, "accessory");
    }

    public ItemStack getGenericItemStack(ItemStack gun, int i) {
        return getAttachmentItemStack(gun, "generic_" + i);
    }

    /**
     * Generalised attachment getter method
     */
    public AttachmentType getAttachment(ItemStack gun, String name) {
        if (gun == null || !(gun.getItem() instanceof ItemGun)) {
            return null;
        }
        checkForTags(gun);
        return AttachmentType.getFromNBT(gun.stackTagCompound.getCompoundTag("attachments").getCompoundTag(name));
    }

    /**
     * Generalised attachment ItemStack getter method
     */
    public ItemStack getAttachmentItemStack(ItemStack gun, String name) {
        checkForTags(gun);
        return ItemStack.loadItemStackFromNBT(gun.stackTagCompound.getCompoundTag("attachments").getCompoundTag(name));
    }

    /**
     * Method to check for null tags and assign default empty tags in that case
     */
    public void checkForTags(ItemStack gun) {
        //If the gun has no tags, give it some
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        //If the gun has no attachment tags, give it some
        if (!gun.stackTagCompound.hasKey("attachments")) {
            NBTTagCompound attachmentTags = new NBTTagCompound();
            for (int i = 0; i < numGenericAttachmentSlots; i++)
                attachmentTags.setTag("generic_" + i, new NBTTagCompound());
            attachmentTags.setTag("barrel", new NBTTagCompound());
            attachmentTags.setTag("scope", new NBTTagCompound());
            attachmentTags.setTag("stock", new NBTTagCompound());
            attachmentTags.setTag("grip", new NBTTagCompound());
            attachmentTags.setTag("gadget", new NBTTagCompound());
            attachmentTags.setTag("slide", new NBTTagCompound());
            attachmentTags.setTag("pump", new NBTTagCompound());
            attachmentTags.setTag("accessory", new NBTTagCompound());

            gun.stackTagCompound.setTag("attachments", attachmentTags);
        }
    }

    /**
     * Get the melee damage of a specific gun, taking into account attachments
     */
    public float getMeleeDamage(ItemStack stack, boolean driveable) {
        float stackMeleeDamage = meleeDamage;
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackMeleeDamage *= attachment.meleeDamageMultiplier;
        }
        return stackMeleeDamage * (driveable ? meleeDamageDriveableModifier : 1);
    }

    /**
     * Get the damage of a specific gun, taking into account attachments
     */
    public float getDamage(ItemStack stack) {
        float stackDamage = damage;

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackDamage *= attachment.damageMultiplier;
        }
        //此处进行改动，下挂武器配件的子弹伤害不应该受主武器影响
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackDamage = getGrip(stack).secondaryDamage;

        return stackDamage;
    }

    /**
     * Get the bullet spread of a specific gun, taking into account attachments
     */
    public float getSpread(ItemStack stack, boolean sneaking, boolean sprinting) {
        float stackSpread = bulletSpread;

        if (getFireMode(stack).equals(EnumFireMode.SEMIAUTO)) {
            stackSpread *= singleShootSpreadModifier;
        }

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackSpread *= attachment.spreadMultiplier;
        }

        //此处进行改动，下挂武器配件的子弹散布不应该受主武器影响
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackSpread = getGrip(stack).secondarySpread;

        stackSpread = Math.max(stackSpread, minSpread);

        if (sprinting) {
            stackSpread *= sprintSpreadMultiplier;
        } else if (sneaking) {
            stackSpread *= sneakSpreadMultiplier;
        }

        return stackSpread;
    }

    /**
     * Get the bullet spread of a specific gun, taking into account attachments
     */
    public float getADSSpread(ItemStack stack, boolean sneaking, boolean sprinting) {
        float stackSpread = bulletSpread;

        if (getFireMode(stack).equals(EnumFireMode.SEMIAUTO)) {
            stackSpread *= singleShootSpreadModifier;
        }

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackSpread *= attachment.spreadMultiplier;
        }

        //此处进行改动，下挂武器配件的子弹散布不应该受主武器影响
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackSpread = getGrip(stack).secondarySpread;

        if (sprinting) {
            stackSpread *= sprintSpreadMultiplier;
        } else if (sneaking) {
            stackSpread *= sneakSpreadMultiplier;
        }

        stackSpread *= adsSpreadModifier;

        stackSpread = Math.max(stackSpread, minSpread);

        return stackSpread;
    }

    /**
     * Get the default spread of a specific gun, taking into account attachments
     */
    public float getDefaultSpread(ItemStack stack) {
        float stackSpread = defaultSpread;

        if (getFireMode(stack).equals(EnumFireMode.SEMIAUTO)) {
            stackSpread *= singleShootSpreadModifier;
        }

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackSpread *= attachment.spreadMultiplier;
        }

        //此处进行改动，下挂武器配件的子弹散布不应该受主武器影响
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackSpread = getGrip(stack).secondaryDefaultSpread;

        stackSpread = Math.max(stackSpread, minSpread);

        return stackSpread;
    }

    /**
     * Get the pitch recoil mean, without any randomness but including attachments.
     */
    public float getRecoilDisplay(ItemStack stack) {
        float stackRecoil = this.recoilPitch;
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackRecoil *= attachment.recoilMultiplier;
        }
        return stackRecoil;
    }

    /**
     * Get the pitch recoil of a specific gun, taking into account attachments, randomess and sneak/sprint
     */
    public float getRecoilPitch(ItemStack stack, boolean sneaking, boolean sprinting) {
        float stackRecoil = this.recoilPitch + (rand.nextFloat() * this.rndRecoilPitchRange);
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackRecoil *= attachment.recoilMultiplier;
        }

        if (sneaking) {
            if (decreaseRecoilPitch != 0) {
                // backwards compatibility
                stackRecoil -= decreaseRecoilPitch;
            } else if (recoilSneakingMultiplier == -1) {
                // backwards compatibility 2: simulate decreaseRecoilPitch 2
                stackRecoil = stackRecoil < 0.5F ? 0 : stackRecoil - 0.5F;
            } else {
                stackRecoil *= recoilSneakingMultiplier;
            }
        } else if (sprinting) {
            stackRecoil *= recoilSprintingMultiplier;
        }
        return stackRecoil;
    }

    /**
     * Get the yaw recoil of a specific gun, taking into account attachments, randomess and sneak/sprint
     */
    public float getRecoilYaw(ItemStack stack, boolean sneaking, boolean sprinting) {
        float stackRecoilYaw = this.recoilYaw + ((rand.nextFloat() - 0.5F) * this.rndRecoilYawRange);

        //此处将recoilMultiplier改为recoilYawMultiplier
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackRecoilYaw *= attachment.recoilYawMultiplier;
        }

        if (sneaking) {
            if (decreaseRecoilYaw < 0) {
                stackRecoilYaw /= decreaseRecoilYaw;
            } else {
                stackRecoilYaw *= recoilSneakingMultiplierYaw;
            }
        } else if (sprinting) {
            stackRecoilYaw *= recoilSprintingMultiplierYaw;
        }

        return stackRecoilYaw;
    }


    public float getRecoilYawDisplay(ItemStack stack, boolean sneaking, boolean sprinting) {
        float stackRecoilYaw = this.recoilYaw + this.rndRecoilYawRange;
        //此处将recoilMultiplier改为recoilYawMultiplier
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackRecoilYaw *= attachment.recoilYawMultiplier;
        }
        if (sneaking) {
            if (decreaseRecoilYaw < 0) {
                stackRecoilYaw /= decreaseRecoilYaw;
            } else {
                stackRecoilYaw *= recoilSneakingMultiplierYaw;
            }
        } else if (sprinting) {
            stackRecoilYaw *= recoilSprintingMultiplierYaw;
        }

        return stackRecoilYaw;
    }

    /*** TV90
     * 获取枪械x轴模型位移
     * @param stack
     * @return
     */
    public float getRecoilDistance(ItemStack stack) {
        float stackRecoilDistanceMultiplier = this.recoilDistance;
        for (AttachmentType attachment : getCurrentAttachments(stack))
            stackRecoilDistanceMultiplier *= attachment.recoilDistanceMultiplier;
        return stackRecoilDistanceMultiplier;
    }

    public float getRecoilDistanceHipFire(ItemStack stack) {
        float stackRecoilDistanceMultiplier = this.recoilDistanceHipFire;
        for (AttachmentType attachment : getCurrentAttachments(stack))
            stackRecoilDistanceMultiplier *= attachment.recoilDistanceMultiplier;
        return stackRecoilDistanceMultiplier;
    }

    /*** TV90
     * 获取枪械角度上抬
     * @param stack
     * @return
     */
    public float getRecoilAngle(ItemStack stack) {
        float stackRecoilAngleMultiplier = this.recoilAngle;
        for (AttachmentType attachment : getCurrentAttachments(stack))
            stackRecoilAngleMultiplier *= attachment.recoilAngleMultiplier;
        return stackRecoilAngleMultiplier;
    }

    /*** TV90
     * 获取枪械z轴随机偏移
     * @param stack
     * @return
     */
    public float getShakeDistance(ItemStack stack) {
        float stackShakeDistanceMultiplier = this.recoilShakeDistance;
        for (AttachmentType attachment : getCurrentAttachments(stack))
            stackShakeDistanceMultiplier *= attachment.recoilShakeDistanceMultiplier;
        return stackShakeDistanceMultiplier;
    }

    public boolean getOneHanded() {
        return oneHanded;
    }

    /*** TV90
     * 获取枪械开镜时间
     * @param stack
     * @return
     */
    public float getAimTimeConstant(ItemStack stack) {
        float stackAimTimeConstant = this.aimTimeConstant;
        for (AttachmentType attachment : getCurrentAttachments(stack))
            stackAimTimeConstant *= attachment.aimingTimeMultiplier;
        return Math.min(stackAimTimeConstant, 0.95F);
    }

    /*** TV90
     * 获取枪械收枪时间/跑射延迟
     * @param stack
     * @return
     */
    public float getRunPosTime(ItemStack stack) {
        float stackRunPosTime = this.runPosTime;
        for (AttachmentType attachment : getCurrentAttachments(stack))
            stackRunPosTime *= attachment.runPosTimeMultiplier;
        return stackRunPosTime;
    }

    /*** TV90
     * 获取枪械下蹲时模型缩放所需时间
     * @param stack
     * @return
     */
    public float getRunCrouchTime(ItemStack stack) {
        float stackRunCrouchTime = this.runCrouchTime;
        for (AttachmentType attachment : getCurrentAttachments(stack))
            stackRunCrouchTime *= attachment.runCrouchTimeMultiplier;
        return stackRunCrouchTime;
    }

    /**
     * Get the bullet speed of a specific gun, taking into account attachments
     */
    public float getBulletSpeed(ItemStack stack, ItemStack bulletStack) {
        float stackBulletSpeed;
        if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getItem() instanceof ItemBullet) {
            stackBulletSpeed = bulletSpeed * ((ItemBullet) bulletStack.getItem()).type.speedMultiplier;
        } else {
            stackBulletSpeed = bulletSpeed;
        }

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackBulletSpeed *= attachment.bulletSpeedMultiplier;
        }

        //此处进行改动，下挂武器配件的子弹速度不应该受主武器影响
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackBulletSpeed = getGrip(stack).secondarySpeed;

        return stackBulletSpeed;
    }

    /**
     * Get the bullet speed of a specific gun, taking into account attachments
     */
    public float getBulletSpeed(ItemStack stack) {

        float stackBulletSpeed = bulletSpeed;

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackBulletSpeed *= attachment.bulletSpeedMultiplier;
        }

        //此处进行改动，下挂武器配件的子弹速度不应该受主武器影响
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackBulletSpeed = getGrip(stack).secondarySpeed;

        return stackBulletSpeed;
    }

    /**
     * Get the reload time of a specific gun, taking into account attachments
     */
    public float getReloadTime(ItemStack stack) {
        float stackReloadTime = reloadTime;

        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackReloadTime = getGrip(stack).secondaryReloadTime;

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackReloadTime *= attachment.reloadTimeMultiplier;
        }
        return stackReloadTime;
    }

    /**
     * 获取战术换弹时间
     * @param stack
     * @return
     */
    public float getTacticalReloadTime(ItemStack stack){
        float stackReloadTime = (tacticalReloadTime > 0) ? tacticalReloadTime : reloadTime;
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackReloadTime = getGrip(stack).secondaryReloadTime;

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackReloadTime *= attachment.reloadTimeMultiplier;
        }
        return stackReloadTime;
    }

    /**
     * 获取空仓换弹时间
     * @param stack
     * @return
     */
    public float getEmptyReloadTime(ItemStack stack){
        float stackReloadTime = reloadTime;
        if (getGrip(stack) != null && getSecondaryFire(stack))
            stackReloadTime = getGrip(stack).secondaryReloadTime;

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackReloadTime *= attachment.reloadTimeMultiplier;
        }
        return stackReloadTime;
    }

    public int getNumBurstRounds(ItemStack stack) {
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            if (attachment.numBurstRounds != 0)
                return attachment.numBurstRounds;
        }
        return numBurstRounds;
    }

    /**
     * Get the fire rate of a specific gun
     */
    public float getShootDelay(ItemStack stack) {
        //Legacy system input as direct ticks
        if (shootDelay != 0) {
            float fireRate = shootDelay;
            if (getGrip(stack) != null && getSecondaryFire(stack))
                fireRate = getGrip(stack).secondaryShootDelay;

            for (AttachmentType attachment : getCurrentAttachments(stack)) {
                fireRate /= attachment.roundsPerMinMultiplier;
            }

            return fireRate;
        }
        //New system, input as RPM
        else {
            float fireRate = roundsPerMin;

            for (AttachmentType attachment : getCurrentAttachments(stack)) {
                fireRate *= attachment.roundsPerMinMultiplier;
            }

            if (getGrip(stack) != null && getSecondaryFire(stack))
                fireRate = getGrip(stack).secondaryShootDelay;

            return 1200.0F / fireRate;
        }
    }

    public float getShootDelay() {
        if (shootDelay != 0) {
            return shootDelay;
        } else {
            return 1200.0F / roundsPerMin;
        }
    }

    /**
     * Get the number of bullets fired per shot of a specific gun
     */
    public int getNumBullets(ItemStack stack) {
        int amount = numBullets;

        if (getGrip(stack) != null && getSecondaryFire(stack))
            amount = getGrip(stack).secondaryNumBullets;

        return amount;
    }

    /**
     * Get the movement speed of a specific gun, taking into account attachments
     */
    public float getMovementSpeed(ItemStack stack) {
        float stackMovement = moveSpeedModifier;
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackMovement *= attachment.moveSpeedMultiplier;
        }
        return stackMovement;
    }

    public float getCameraShakeModifier(ItemStack stack) {
        float stackMovement = cameraShakeModifier;
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            stackMovement *= attachment.cameraShakeMultiplier;
        }
        return stackMovement;
    }

    /**
     * 是否自动收镜
     */
    public boolean isCancelAimingAfterShoot(ItemStack stack) {
        boolean cancelAiming = cancelAimingAfterShoot;
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            if (attachment.isDisableCancelAiming) {
                cancelAiming = false;
                break;
            }
        }
        return cancelAiming;
    }

    /**
     * Get the recoil counter coefficient of the gun, taking into account attachments
     */
    public float getRecoilControl(ItemStack stack, boolean isSprinting, boolean isSneaking) {
        float control;
        if (isSprinting) {
            control = recoilCounterCoefficientSprinting;
        } else if (isSneaking) {
            control = recoilCounterCoefficientSneaking;
        } else {
            control = recoilCounterCoefficient;
        }

        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            if (isSprinting) {
                control *= attachment.recoilControlMultiplierSprinting;
            } else if (isSneaking) {
                control *= attachment.recoilControlMultiplierSneaking;
            } else {
                control *= attachment.recoilControlMultiplier;
            }
        }

        // Clamp to [0, 1]
        return Math.max(0, Math.min(1, control));
    }

    /** 是否可以标记敌军 */
    @Override
    public boolean isDetector() {
        return isDetector;
    }

    public boolean isDuckBill() {
        return isDuckBill;
    }

    public void setDetector(ItemStack stack) {
        boolean result = false;
        for(AttachmentType attachment : getCurrentAttachments(stack)) {
            if(attachment.isDetector) {
                result = true;
                break;
            }
        }
        isDetector = result;
    }

    public void setDuckBill(ItemStack stack) {
        boolean result = false;
        for(AttachmentType attachment : getCurrentAttachments(stack)) {
            if(attachment.isDuckBill) {
                result = true;
                break;
            }
        }
        isDuckBill = result;
    }

    public void setFireMode(ItemStack stack, int fireMode) {
        if (!stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
        }

        if (fireMode < EnumFireMode.values().length) {
            stack.getTagCompound().setByte("GunMode", (byte) fireMode);
        } else {
            stack.getTagCompound().setByte("GunMode", (byte) mode.ordinal());
        }
    }

    /**
     * Get the firing mode of a specific gun, taking into account attachments and secondary fire mode
     */
    public EnumFireMode getFireMode(ItemStack stack) {
        //Check for secondary fire mode
        if (getGrip(stack) != null && getSecondaryFire(stack))
            return getGrip(stack).secondaryFireMode;

        //Else check for any mode overrides from attachments
        for (AttachmentType attachment : getCurrentAttachments(stack)) {
            if (attachment.modeOverride != null)
                return attachment.modeOverride;
        }

        //Else set the fire mode from the gun
        if (stack.hasTagCompound() && stack.getTagCompound().hasKey("GunMode")) {
            int gm = stack.getTagCompound().getByte("GunMode");
            if (gm < EnumFireMode.values().length) {
                for (EnumFireMode enumFireMode : submode) {
                    if (gm == enumFireMode.ordinal()) {
                        return EnumFireMode.values()[gm];
                    }
                }
            }
        }

        setFireMode(stack, mode.ordinal());
        return mode;
    }

    /**
     * Set the secondary or primary fire mode
     */
    public void setSecondaryFire(ItemStack stack, boolean mode) {
        if (!stack.hasTagCompound())
            stack.setTagCompound(new NBTTagCompound());

        stack.stackTagCompound.setBoolean("secondaryFire", mode);
    }

    /**
     * Get whether the gun is in secondary or primary fire mode
     */
    public boolean getSecondaryFire(ItemStack stack) {
        if (!stack.hasTagCompound())
            stack.setTagCompound(new NBTTagCompound());

        if (!stack.getTagCompound().hasKey("secondaryFire")) {
            stack.stackTagCompound.setBoolean("secondaryFire", false);
            return stack.getTagCompound().getBoolean("secondaryFire");
        }

        return stack.getTagCompound().getBoolean("secondaryFire");
    }

    /**
     * Get the max size of ammo items depending on what mode the gun is in
     */
    public int getNumAmmoItemsInGun(ItemStack stack) {
        if (getGrip(stack) != null && getSecondaryFire(stack))
            return getGrip(stack).numSecAmmoItems;
        else
            return numPrimaryAmmoItems;
    }

    public Paintjob getPaintjob(String s) {
        for (Paintjob paintjob : paintjobs) {
            if (paintjob.iconName.equals(s))
                return paintjob;
        }
        return defaultPaintjob;
    }

    public boolean getShouldShowMuzzleFlash() {
        return useMuzzleFlashDefaults ? FlansMod.showMuzzleFlashParticlesDefault : showMuzzleFlashParticles;
    }

    @Override
    public float GetRecommendedScale() {
        return 60.0f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBase GetModel() {
        return model;
    }
}