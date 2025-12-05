package com.flansmod.common.guns;

import com.flansmod.api.IEntityBullet;
import com.flansmod.client.BulletEntityCamera;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.*;
import com.flansmod.common.blocks.impl.TargetBreakableBlock;
import com.flansmod.common.driveables.*;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.eventhandlers.BulletHitEvent;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.item.ItemShootable;
import com.flansmod.common.guns.raytracing.*;
import com.flansmod.common.guns.type.BulletType;
import com.flansmod.common.guns.type.ShootableType;
import com.flansmod.common.hook.MCHeliUtil;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.network.PacketBlockHit;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketMissileMCLOSAccelerate;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.EntityConnectingLine;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EntityBullet extends EntityShootable implements IEntityAdditionalSpawnData, IEntityBullet, ILockable {

    private static final int DEFAULT_BULLET_LIFE = 3 * 20; //Kill bullets after 3 seconds
    @SideOnly(Side.CLIENT)
    public EntityLivingBase bulletFollowCamera;

    public Entity owner;
    public BulletType type;
    /**
     * What type of weapon did this come from? For death messages
     */
    public InfoType firedFrom;
    /**
     * The amount of damage the gun imparted upon the bullet. Multiplied by the bullet damage to get total damage
     */
    public float damage;
    public float originDamage;
    public boolean shotgun = false;
    /**
     * If this is non-zero, then the player raytrace code will look back in time to when the player thinks their bullet should have hit
     */
    public int pingOfShooter = 0;
    /**
     * Stop repeat detonations
     */
    public boolean detonated = false;
    /**
     * For homing missiles
     */
    public Entity lockedOnTo;
    public double prevDistanceToEntity = 0;
    public boolean toggleLock = false;
    public int closeCount = 0;
    public int soundTime = 0;

    //Used to store speed for submunitions
    public float speedA;
    public float initialSpeed;

    public int impactX;
    public int impactY;
    public int impactZ;

    public boolean isFirstPositionSetting = false;
    public boolean isPositionUpper = true;

    // Hitmarker information on the server side.
    public boolean lastHitHeadshot = false;
    public float lastHitPenAmount = 1F;
    public float penetratingPower;

    /*
     * When the bullet loses penetration, the cause and amount is saved to this list
     */
    public ArrayList<PenetrationLoss> penetrationLosses = new ArrayList<>();

    public int submunitionDelay = 20;
    public boolean hasSetSubDelay = false;
    public boolean hasSetVLSDelay = false;
    public int VLSDelay = 0;
    public Vector3f lookVector;
    public Vector3f initialPos;
    public boolean hasSetLook = false;
    public int distanceTravelled = 0;
    public int penetrationBlockCount = 0;
    private int ticksInAir;
    private double getPrevDistanceToTarget;
    private boolean spawnLine = true;
    public float pitchOffsetMCLOS = 0.0f; // 垂直偏航（俯仰）
    public float yawOffsetMCLOS = 0.0f;  // 水平偏航（偏航）
    public boolean isAccelerating = false; //导弹正在加力
    public boolean canAccelerate = false; //导弹是否可以加力


    public EntityBullet(World world) {
        super(world);
        ticksInAir = 0;
        setSize(0.5F, 0.5F);
    }


    /**
     * 私有构造方法 , 所有的构造方法都会调用这个方法
     */
    private EntityBullet(World world, EntityLivingBase shooter, float gunDamage, BulletType bulletType, InfoType shotFrom) {
        this(world);
        owner = shooter;
        if (shooter instanceof EntityPlayerMP)
            pingOfShooter = ((EntityPlayerMP) shooter).ping;
        type = bulletType;
        firedFrom = shotFrom;
        damage = gunDamage;
        originDamage = gunDamage;
        penetratingPower = type.penetratingPower;
        setSize(bulletType.hitBoxSize, bulletType.hitBoxSize);
    }

    /**
     * 被ItemGun创造的子弹的构造方法
     */
    public EntityBullet(World world, EntityLivingBase shooter, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom, float pitchSpread, float yawSpread) {
        this(world, Vec3.createVectorHelper(shooter.posX, shooter.posY + shooter.getEyeHeight(), shooter.posZ), shooter.rotationYaw, shooter.rotationPitch, shooter, gunDamage, type1, speed, shotFrom, pitchSpread, yawSpread);
        initialSpeed = speed;
        shotgun = shot;
    }

    /**
     * Machinegun / AAGun bullet constructor
     */
    public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, InfoType shotFrom) {
        this(world, origin, yaw, pitch, shooter, gunDamage, type1, 3.0F, shotFrom, spread, spread);
    }

    /**
     * More generalised bullet constructor
     * 被ItemGun创造的子弹的构造方法
     */
    public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float gunDamage, BulletType type1, float speed, InfoType shotFrom, float pitchSpread, float yawSpread) {
        this(world, shooter, gunDamage, type1, shotFrom);
        setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
        setPosition(posX, posY, posZ);
        yOffset = 0.0F;
        initialSpeed = speed;
        motionX = -MathHelper.sin((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
        motionZ = MathHelper.cos((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
        motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
        setArrowHeading(motionX, motionY, motionZ, pitchSpread / 2F, yawSpread / 2F, speed);
    }

    /**
     * More generalised bullet constructor
     * 被AAGun和MachineGun创造的子弹的构造方法
     */
    public EntityBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom) {
        this(world, shooter, gunDamage, type1, shotFrom);
        damage = gunDamage;
        originDamage = gunDamage;
        initialSpeed = speed;
        setPosition(origin.x, origin.y, origin.z);
        motionX = direction.x;
        motionY = direction.y;
        motionZ = direction.z;
        setArrowHeading(motionX, motionY, motionZ, spread, spread, speed);
    }

    /**
     * Bomb constructor. Inherits the motion and rotation of the plane
     */
    public EntityBullet(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLivingBase shooter, float gunDamage, BulletType type1, InfoType shotFrom) {
        this(world, shooter, gunDamage, type1, shotFrom);
        setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
        setPosition(posX, posY, posZ);
        yOffset = 0.0F;
        motionX = motX;
        motionY = motY;
        motionZ = motZ;
    }

    private static MovingObjectPosition getSpottedPoint(EntityLivingBase entity_base, float fasc, double dist, boolean interact) {
        Vec3 vec3 = Vec3.createVectorHelper(entity_base.posX, entity_base.posY + entity_base.getEyeHeight(), entity_base.posZ);
        Vec3 vec31 = entity_base.getLook(fasc);
        Vec3 vec32 = vec3.addVector(vec31.xCoord * dist, vec31.yCoord * dist, vec31.zCoord * dist);
        return entity_base.worldObj.rayTraceBlocks(vec3, vec32, interact);
    }

    public ShootableType getType() {
        return type;
    }

    @Override
    protected void entityInit() {
    }

    public void setArrowHeading(double dx, double dy, double dz, float spread, float yawSpread, float speed) {
        float f2 = MathHelper.sqrt_double(dx * dx + dy * dy + dz * dz);
        dx /= f2;
        dy /= f2;
        dz /= f2;
        dx *= speed;
        dy *= speed;
        dz *= speed;
        dx += rand.nextGaussian() * 0.005D * yawSpread * speed;
        dy += rand.nextGaussian() * 0.005D * spread * speed;
        dz += rand.nextGaussian() * 0.005D * yawSpread * speed;
        motionX = dx;
        motionY = dy;
        motionZ = dz;
        float f3 = MathHelper.sqrt_double(dx * dx + dz * dz);
        prevRotationYaw = rotationYaw = (float) ((Math.atan2(dx, dz) * 180D) / 3.1415927410125732D);
        prevRotationPitch = rotationPitch = (float) ((Math.atan2(dy, f3) * 180D) / 3.1415927410125732D);

        getLockOnTarget();
    }

    /**
     * Find the entity nearest to the missile's trajectory, anglewise
     */
    private void getLockOnTarget() {
        if (type.lockOnToPlanes || type.lockOnToVehicles || type.lockOnToMechas || type.lockOnToLivings || type.lockOnToPlayers) {
            Vector3f motionVec = new Vector3f(motionX, motionY, motionZ);
            Entity closestEntity = null;
            float closestAngle = type.maxLockOnAngle * 3.14159265F / 180F;

            for (Object obj : worldObj.loadedEntityList) {
                Entity entity = (Entity) obj;
                if ((type.lockOnToMechas && entity instanceof EntityMecha) ||
                        (type.lockOnToVehicles && isVehicle(entity)) ||
                        (type.lockOnToPlanes && (isPlane(entity))) ||
                        (type.lockOnToPlayers && entity instanceof EntityPlayer) ||
                        (type.lockOnToLivings && entity instanceof EntityLivingBase)) {
                    if (FlansModRaytracer.hasBlock(worldObj, Vec3.createVectorHelper(posX, posY + 1.5F, posZ), Vec3.createVectorHelper(entity.posX, entity.posY + 1, entity.posZ)))
                        continue;
                    if (entity instanceof EntityPlayer) {
                        if (owner instanceof EntityPlayer && ((EntityLivingBase) entity).isOnSameTeam((EntityLivingBase) owner))
                            continue;
                    }
                    Vector3f relPosVec;
                    if(entity instanceof EntityPlayer || entity instanceof EntitySoldier) {
                        relPosVec = new Vector3f(entity.posX - posX, entity.posY + 1.5F - posY, entity.posZ - posZ);
                    } else {
                        relPosVec = new Vector3f(entity.posX - posX, entity.posY - posY, entity.posZ - posZ);
                    }
                    float angle = Math.abs(Vector3f.angle(motionVec, relPosVec));
                    if (angle < closestAngle) {
                        closestEntity = entity;
                        closestAngle = angle;
                    }
                }
            }

            if (closestEntity != null)
                lockedOnTo = closestEntity;
        }
    }

    @Override
    public void setVelocity(double d, double d1, double d2) {
        motionX = d;
        motionY = d1;
        motionZ = d2;
        if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F) {
            float f = MathHelper.sqrt_double(d * d + d2 * d2);
            prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
            prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f) * 180D) / 3.1415927410125732D);
            setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
        }
    }

    @SideOnly(Side.CLIENT)
    public void SpawnBlockPar(MovingObjectPosition raytraceResult, int xTile, int yTile, int zTile, Block block) {
        int num = type.flakParticlesCrack + rand.nextInt(3);
        float scale = 1.0F;
        for (int i = 0; i < num; i++) {
            EntityDiggingFX fx = (new EntityDiggingFX(this.worldObj,
                    raytraceResult.hitVec.xCoord + (rand.nextFloat() - 0.5D) * width,
                    raytraceResult.hitVec.yCoord + 0.1D,
                    raytraceResult.hitVec.zCoord + (rand.nextFloat() - 0.5D) * width,
                    0, 0, 0, block,
                    this.worldObj.getBlockMetadata(xTile, yTile, zTile))).applyRenderColor(this.worldObj.getBlockMetadata(xTile, yTile, zTile));
            fx.motionX += type.flakParticlesDiff / 2 * rand.nextGaussian();
            fx.motionZ += type.flakParticlesDiff / 2 * rand.nextGaussian();
            fx.motionY += type.flakParticlesDiff * Math.abs(rand.nextGaussian());
            fx.multipleParticleScaleBy(scale);
            Minecraft.getMinecraft().effectRenderer.addEffect(fx);
            FlansMod.proxy.spawnParticle("explode", raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord, 0, 0, 0);
        }
    }

    public void calculateDps(float damage, EntityPlayer p) {
        FlansMod.packetHandler.sendTo(new PacketBlockHit(damage), (EntityPlayerMP) p);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();


        // Update the ping for hit detection
        if (!worldObj.isRemote && owner instanceof EntityPlayerMP) {
            pingOfShooter = ((EntityPlayerMP) owner).ping;
        }

        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        if (type == null) {
            FlansMod.log("EntityBullet.onUpdate() Error: BulletType is null (" + this + ")");
            setDead();
            return;
        }

        //子弹跟随视角
        if (worldObj.isRemote) {
            if (type.enableCameraFollow) {
                if (FlansModClient.enabledCameraFollowBullet
                        && owner instanceof EntityClientPlayerMP && owner == Minecraft.getMinecraft().thePlayer
                        && (bulletFollowCamera == null || bulletFollowCamera.isDead)) {
                    bulletFollowCamera = new BulletEntityCamera(worldObj, this);
                    FlansModClient.isBulletTrackingActive = true;
                    worldObj.spawnEntityInWorld(bulletFollowCamera);
                    Minecraft.getMinecraft().renderViewEntity = bulletFollowCamera;
                }
            }
        }

        if (type.hasLine && owner instanceof EntityPlayer && spawnLine) {
            EntityConnectingLine hook = new EntityConnectingLine(worldObj, (EntityPlayer) owner, this);
            worldObj.spawnEntityInWorld(hook);
            spawnLine = false;
        }

        /* 召唤炮击 */
        if (!worldObj.isRemote && type.enableCallArtillery && canCallArtillery && ticksExisted > type.artilleryStartTime) {
            ItemShootable itemShootable = (ItemShootable) GameRegistry.findItem(FlansMod.MODID, type.artilleryType);
            this.callArtillery(itemShootable);
            artilleryCalled = true;
        }

        if (type.despawnTime > 0 && ticksExisted > type.despawnTime) {
            detonated = true;
            setDead();
            return;
        }

        if (!hasSetSubDelay && type.hasSubmunitions) {
            setSubmunitionDelay();
        } else if (type.hasSubmunitions) {
            submunitionDelay--;
        }

        if (!hasSetVLSDelay && type.VLS) {
            VLSDelay = type.VLSTime;
            hasSetVLSDelay = true;
        }

        if (VLSDelay > 0)
            VLSDelay--;

        if (!hasSetLook && owner != null) {
            lookVector = new Vector3f((float) owner.getLookVec().xCoord, (float) owner.getLookVec().yCoord, (float) owner.getLookVec().zCoord);
            initialPos = new Vector3f(owner.posX, owner.posY, owner.posZ);
            hasSetLook = true;
        }


        if (soundTime > 0)
            soundTime--;

        if (owner != null) {
            double rangeX = owner.posX - this.posX;
            double rangeY = owner.posY - this.posY;
            double rangeZ = owner.posZ - this.posZ;
            distanceTravelled = (int) Math.sqrt((rangeX * rangeX) + (rangeY * rangeY) + (rangeZ * rangeZ));

            if (type.maxRange != -1 && type.maxRange < distanceTravelled) {
                if (ticksExisted > type.fuse && type.fuse > 0)
                    detonate();
                setDead();
            }
        } else {
            this.setDead();
        }

        //Check the fuse to see if the bullet should explode
        ticksInAir++;
        if (ticksInAir > type.fuse && type.fuse > 0 && !isDead) {
            setDead();
        }

        if (type.fuse == 0 && ticksExisted > DEFAULT_BULLET_LIFE) {
            setDead();
        }

        if (bounceNum >= type.bounceLimit) {
            setPosition(posX, posY, posZ);
            setVelocity(0, 0, 0);
            if (type.detonateOnBouncinessLimit) {
                setDead();
            }
            return;
        }

        if (isDead)
            return;

        //Detonation conditions
        if (!worldObj.isRemote) {
            if (ticksExisted > type.fuse && type.fuse > 0)
                detonate();
            //If this grenade has a proximity trigger, check for living entities within it's range
            if (type.livingProximityTrigger > 0 || type.driveableProximityTrigger > 0 || type.airburstRange > 0) {
                float checkRadius = Math.max(Math.max(type.livingProximityTrigger, type.driveableProximityTrigger), type.airburstRange);
                List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(checkRadius, checkRadius, checkRadius));
                for (Object obj : list) {

                    //空爆
                    if (obj instanceof EntityLivingBase && owner instanceof EntityLivingBase
                            && obj != owner
                            && !((EntityLivingBase)obj).isOnSameTeam((EntityLivingBase) owner) ) {
                        if (type.enableAirburst) {
                            if (getDistanceToEntity((Entity) obj) <= type.airburstRange) {
                                List damageList = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(type.airburstDamageRange, type.airburstDamageRange, type.airburstDamageRange));
                                for (Object o : damageList) {
                                    if (o instanceof EntityLivingBase) {
                                        EntityLivingBase o1 = (EntityLivingBase) o;
                                        if (type.airburstDamage > 0
                                                && !FlansModRaytracer.hasBlock(worldObj,
                                                Vec3.createVectorHelper(posX, posY, posZ),
                                                Vec3.createVectorHelper(o1.posX, o1.posY + 1.5F, o1.posZ))) {
                                            ((EntityLivingBase) obj).attackEntityFrom(getBulletDamage(false), type.airburstDamage);
                                        }
                                    }
                                }
                                if (type.deploySubmunitionOnAirburst) {
                                    if (!this.deploySubmunitions()) {
                                        return;
                                    }
                                    this.submunitionDelay = 9001;
                                } else {
                                    setDead();
                                    return;
                                }
                                break;
                            }
                        }
                    }

                    if (obj == owner && ticksExisted < 10)
                        continue;
                    if (obj instanceof EntityLivingBase && getDistanceToEntity((Entity) obj) < type.livingProximityTrigger) {
                        if (type.damageToTriggerer > 0)
                            ((EntityLivingBase) obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
                        FlansMod.proxy.spawnParticle("redstone", posX, posY, posZ, 0, 0, 0);

                        detonate();
                        break;
                    }
                    if (obj instanceof EntityDriveable && getDistanceToEntity((Entity) obj) < type.driveableProximityTrigger) {
                        /**
                         if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && ((EntityDriveable)obj).seats[0].riddenByEntity instanceof EntityPlayerMP && owner instanceof EntityPlayer)
                         {
                         EntityPlayerMP player = (EntityPlayerMP)((EntityDriveable)obj).seats[0].riddenByEntity;
                         if(!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceFlans(type.shortName, this, (EntityPlayer)owner, type, false)))
                         continue;
                         }
                         */
                        if (type.damageToTriggerer > 0)
                            ((EntityDriveable) obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
                        detonate();
                        break;
                    }
                }
            }
        }

        //建立列表处理子弹撞击
        ArrayList<BulletHit> hits = new ArrayList();
        Vector3f origin = new Vector3f(this.posX, this.posY, this.posZ);
        Vector3f motion = new Vector3f(this.motionX, this.motionY, this.motionZ);
        float hitBoxSize = Math.max(this.type.hitBoxSize, 0.0F);

        float speed = motion.length();
        this.speedA = speed;
        if (this.type.hasSubmunitions && this.submunitionDelay < 0) {
            if (!this.deploySubmunitions()) return;
            this.submunitionDelay = 9001;
        }

        Vector3f lookVec;
        float d;
        int snapshotToTry;
        float x;
        Vector3f origin2;

        //遍历世界实体
        for (int i = 0; i < this.worldObj.loadedEntityList.size(); ++i) {
            Object obj = this.worldObj.loadedEntityList.get(i);

            //将载具射击添加到列表中
            if (obj instanceof EntityDriveable) {
                EntityDriveable driveable = (EntityDriveable) obj;
                if (!driveable.isDead() && !driveable.isPartOfThis(this.owner) && this.getDistanceToEntity(driveable) <= driveable.getDriveableType().bulletDetectionRadius + speed) {
                    ArrayList<BulletHit> driveableHits = driveable.attackFromBullet(origin, motion);
                    hits.addAll(driveableHits);
                }
            }

            //将玩家射击添加到列表中
            else if (obj instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) obj;
                PlayerData data = PlayerHandler.getPlayerData(player);
                boolean shouldDoNormalHitDetect = false;
                if (data != null) {

                    if (player.isDead) {
                        continue;
                    }
                    if (player == owner && ticksInAir < 20)
                        continue;

                    snapshotToTry = TeamsManager.bulletSnapshotMin;
                    if (TeamsManager.bulletSnapshotDivisor > 0) {
                        snapshotToTry += this.pingOfShooter / TeamsManager.bulletSnapshotDivisor;
                    }

                    if (snapshotToTry >= data.snapshots.length) {
                        snapshotToTry = data.snapshots.length - 1;
                    }

                    PlayerSnapshot snapshot;
                    if (data.snapshots[snapshotToTry] != null) {
                        snapshot = data.snapshots[snapshotToTry];
                    } else {
                        snapshot = data.snapshots[0];
                    }

                    if (snapshot == null) {
                        shouldDoNormalHitDetect = true;
                    } else {
                        ArrayList<BulletHit> playerHits = snapshot.raytrace(origin, motion);
                        hits.addAll(playerHits);
                    }
                }

                if (data == null || shouldDoNormalHitDetect) {
                    MovingObjectPosition mop = player.boundingBox.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ));
                    if (mop != null) {
                        origin2 = new Vector3f(mop.hitVec.xCoord - this.posX, mop.hitVec.yCoord - this.posY, mop.hitVec.zCoord - this.posZ);
                        x = 1.0F;
                        if (motion.x != 0.0F) {
                            x = origin2.x / motion.x;
                        } else if (motion.y != 0.0F) {
                            x = origin2.y / motion.y;
                        } else if (motion.z != 0.0F) {
                            x = origin2.z / motion.z;
                        }

                        if (x < 0.0F) {
                            x = -x;
                        }

                        hits.add(new PlayerBulletHit(new PlayerHitbox(player, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), x));
                    }
                }
            }

            //将AI士兵射击添加到列表中
            else if (obj instanceof EntitySoldier) {
                EntitySoldier soldier = (EntitySoldier) obj;
                boolean shouldDoNormalHitDetect = false;

                if (soldier.getHealth() <= 0) {
                    continue;
                }
                if (soldier.getEntityId() == owner.getEntityId())
                    continue;

                snapshotToTry = TeamsManager.bulletSnapshotMin;
                if (TeamsManager.bulletSnapshotDivisor > 0) {
                    snapshotToTry += this.pingOfShooter / TeamsManager.bulletSnapshotDivisor;
                }

                if (snapshotToTry >= soldier.snapshots.length) {
                    snapshotToTry = soldier.snapshots.length - 1;
                }

                SoldierSnapshot snapshot;
                if (soldier.snapshots[snapshotToTry] != null) {
                    snapshot = soldier.snapshots[snapshotToTry];
                } else {
                    snapshot = soldier.snapshots[0];
                }

                if (snapshot == null) {
                    shouldDoNormalHitDetect = true;
                } else {
                    ArrayList<BulletHit> soldierHits = snapshot.raytrace(origin, motion);
                    hits.addAll(soldierHits);
                }


                if (shouldDoNormalHitDetect) {
                    MovingObjectPosition mop = soldier.boundingBox.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ));
                    if (mop != null) {
                        origin2 = new Vector3f(mop.hitVec.xCoord - this.posX, mop.hitVec.yCoord - this.posY, mop.hitVec.zCoord - this.posZ);
                        x = 1.0F;
                        if (motion.x != 0.0F) {
                            x = origin2.x / motion.x;
                        } else if (motion.y != 0.0F) {
                            x = origin2.y / motion.y;
                        } else if (motion.z != 0.0F) {
                            x = origin2.z / motion.z;
                        }

                        if (x < 0.0F) {
                            x = -x;
                        }

                        hits.add(new SoldierBulletHit(new SoldierHitBox(soldier, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), x));
                    }
                }
            }

            //将实体射击添加到列表中
            else {
                Entity entity = (Entity) obj;
                if (entity != this && entity != this.owner && !entity.isDead
                        && !(entity instanceof EntityItem) && !(entity instanceof EntityXPOrb) && !(entity instanceof EntityArrow)
                        && (entity.getClass().toString().indexOf("flansmod.") < 0
                        || entity instanceof EntityAAGun || entity instanceof EntityGrenade)) {
                    AxisAlignedBB bb = HitboxHelper.getFixedBoundingBox(entity);
                    //AxisAlignedBB bb = entity.boundingBox.expand(-(entity.posX - entity.prevPosX) * 2.0D, -(entity.posY - entity.prevPosY) * 2.0D, -(entity.posZ - entity.prevPosZ) * 2.0D);
                    MovingObjectPosition mop = bb.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ));
                    if (mop != null) {
                        lookVec = new Vector3f(mop.hitVec.xCoord - this.posX, mop.hitVec.yCoord - this.posY, mop.hitVec.zCoord - this.posZ);
                        d = 1.0F;
                        if (motion.x != 0.0F) {
                            d = lookVec.x / motion.x;
                        } else if (motion.y != 0.0F) {
                            d = lookVec.y / motion.y;
                        } else if (motion.z != 0.0F) {
                            d = lookVec.z / motion.z;
                        }

                        if (d < 0.0F) {
                            d = -d;
                        }

                        hits.add(new EntityHit(entity, d));
                    }
                }
            }
        }

//        Vector3f posVec = new Vector3f(this.posX, this.posY, this.posZ);
//        Vector3f nextPosVec = new Vector3f(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
//        MovingObjectPosition hit = this.worldObj.func_147447_a(posVec, nextPosVec, false, true, true);

        Vec3 posVec = Vec3.createVectorHelper(posX, posY, posZ);
        Vec3 nextPosVec = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);

        ArrayList<MovingObjectPosition> rayTraceHits = FlansModRaytracer.rayTraceAllBlocks(worldObj, posVec, nextPosVec, false, true, true);
        if (rayTraceHits != null) {
            for (MovingObjectPosition hit : rayTraceHits) {
                //Calculate the lambda value of the intercept
                posVec = Vec3.createVectorHelper(posX, posY, posZ);
                Vec3 hitVec = posVec.subtract(hit.hitVec);
                float lambda = 1;
                //Try each co-ordinate one at a time.
                if (motionX != 0)
                    lambda = (float) (hitVec.xCoord / motionX);
                else if (motionY != 0)
                    lambda = (float) (hitVec.yCoord / motionY);
                else if (motionZ != 0)
                    lambda = (float) (hitVec.zCoord / motionZ);

                if (lambda < 0)
                    lambda = -lambda;

                hits.add(new BlockHit(hit, lambda));
            }
        }

        //We hit something
        if (!hits.isEmpty()) {
            //Sort the hits according to the intercept position
            Collections.sort(hits);

            boolean showCrosshair = false;
            lastHitPenAmount = 0F;
            lastHitHeadshot = false;

            //处理子弹撞击列表
            for (BulletHit bulletHit : hits) {

                BulletHitEvent bulletHitEvent = new BulletHitEvent(this, bulletHit);
                MinecraftForge.EVENT_BUS.post(bulletHitEvent);
                if (bulletHitEvent.isCanceled()) continue;

                if (this.isDead || this.detonated) {
                    break;
                }

                //处理载具撞击
                if (bulletHit instanceof DriveableHit) {
                    if (type.entityHitSoundEnable)
                        PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
                    boolean isFriendly = false;
                    DriveableHit driveableHit = (DriveableHit) bulletHit;
                    driveableHit.driveable.lastAtkEntity = owner;

                    double distanceDamageModifier = 1;
                    double hitX = posX + motionX * driveableHit.intersectTime;
                    double hitY = posY + motionY * driveableHit.intersectTime;
                    double hitZ = posZ + motionZ * driveableHit.intersectTime;
                    int dist = (int) Math.sqrt((hitX - initialPos.x) * (hitX - initialPos.x) + (hitY - initialPos.y) * (hitY - initialPos.y) + (hitZ - initialPos.z) * (hitZ - initialPos.z));
                    if (type.enableBulletDecay) {
                        for (BulletDecay bulletDecay : type.bulletDecays) {
                            distanceDamageModifier = bulletDecay.calculateDecayFactor(dist);
                        }
                    }

                    if (TeamsManager.getInstance().currentRound != null) {
                        for (EntitySeat seat : driveableHit.driveable.seats) {
                            if (seat.riddenByEntity != null && seat.riddenByEntity instanceof EntityPlayerMP) {
                                PlayerData dataDriver = PlayerHandler.getPlayerData((EntityPlayerMP) seat.riddenByEntity);
                                PlayerData dataAttacker = PlayerHandler.getPlayerData((EntityPlayerMP) owner);
                                if (dataDriver.team.shortName.equals(dataAttacker.team.shortName)) {
                                    isFriendly = true;
                                }
                            }
                        }
                    }
                    if (isFriendly) {
                        penetratingPower = 0;
                    } else {
                        penetratingPower = driveableHit.driveable.bulletHit(this, driveableHit, penetratingPower, distanceDamageModifier);
                    }

                    if (type.canSpotEntityDriveable)
                        driveableHit.driveable.setEntityMarker(200);

                    if (FlansMod.DEBUG)
                        worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * driveableHit.intersectTime, posY + motionY * driveableHit.intersectTime, posZ + motionZ * driveableHit.intersectTime), 100, 0F, 0F, 1F));
                    setDead();
                    break;
                }

                //处理玩家撞击
                else if (bulletHit instanceof PlayerBulletHit) {

                    if (type.entityHitSoundEnable)
                        PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);

                    PlayerBulletHit playerHit = (PlayerBulletHit) bulletHit;

                    float prevPenetratingPower = penetratingPower;

                    double distanceDamageModifier = 1;
                    double hitX = posX + motionX * playerHit.intersectTime;
                    double hitY = posY + motionY * playerHit.intersectTime;
                    double hitZ = posZ + motionZ * playerHit.intersectTime;
                    int dist = (int) Math.sqrt((hitX - initialPos.x) * (hitX - initialPos.x) + (hitY - initialPos.y) * (hitY - initialPos.y) + (hitZ - initialPos.z) * (hitZ - initialPos.z));
                    if (type.enableBulletDecay) {
                        for (BulletDecay bulletDecay : type.bulletDecays) {
                            distanceDamageModifier = bulletDecay.calculateDecayFactor(dist);
                        }
                    }

                    penetratingPower = playerHit.hitbox.hitByBullet(this, penetratingPower, distanceDamageModifier);
                    penetrationLosses.add(new PenetrationLoss((prevPenetratingPower - penetratingPower), PenetrationLoss.PenetrationLossType.PLAYER));

                    if (FlansMod.DEBUG)
                        worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(hitX, hitY, hitZ), 100, 1F, 0F, 0F));

                    //探测器击中玩家后标记该玩家
                    if (firedFrom instanceof IMarkable && ((IMarkable) firedFrom).isDetector()) {
                        if (playerHit.hitbox.player != null) {
                            if (owner instanceof EntityPlayer)
                                MCHeliUtil.sendSpotedEntityListToSameTeam(owner, 2, new int[]{playerHit.hitbox.player.getEntityId()});
                            else if (owner instanceof EntityAAGun) {
                                MCHeliUtil.sendSpotedEntityListToSameTeam(((EntityAAGun) owner).placer, 2, new int[]{playerHit.hitbox.player.getEntityId()});
                            }
                        }
                    }

                    setDead();
                    break;
                }

                //处理AI士兵撞击
                else if (bulletHit instanceof SoldierBulletHit) {
                    SoldierBulletHit playerHit = (SoldierBulletHit) bulletHit;
                    double distanceDamageModifier = 1;
                    double hitX = posX + motionX * playerHit.intersectTime;
                    double hitY = posY + motionY * playerHit.intersectTime;
                    double hitZ = posZ + motionZ * playerHit.intersectTime;
                    int dist = (int) Math.sqrt((hitX - initialPos.x) * (hitX - initialPos.x) + (hitY - initialPos.y) * (hitY - initialPos.y) + (hitZ - initialPos.z) * (hitZ - initialPos.z));
                    if (type.enableBulletDecay) {
                        for (BulletDecay bulletDecay : type.bulletDecays) {
                            distanceDamageModifier = bulletDecay.calculateDecayFactor(dist);
                        }
                    }

                    if (type.entityHitSoundEnable)
                        PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
                    if (FlansMod.DEBUG)
                        worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(hitX, hitY, hitZ), 100, 1F, 0F, 0F));
                    float prevPenetratingPower = penetratingPower;
                    penetratingPower = playerHit.hitbox.hitByBullet(this, penetratingPower, distanceDamageModifier);
                    penetrationLosses.add(new PenetrationLoss((prevPenetratingPower - penetratingPower), PenetrationLoss.PenetrationLossType.PLAYER));
                    setDead();
                    break;
                }

                //处理实体撞击
                else if (bulletHit instanceof EntityHit) {

                    if (type.entityHitSoundEnable)
                        PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);

                    if (!worldObj.isRemote) {
                        if (owner instanceof EntityPlayer) {
                            showCrosshair = true;
                            lastHitPenAmount = 1F;
                        }
                    }

                    EntityHit entityHit = (EntityHit) bulletHit;

                    double distanceDamageModifier = 1;
                    double hitX = posX + motionX * entityHit.intersectTime;
                    double hitY = posY + motionY * entityHit.intersectTime;
                    double hitZ = posZ + motionZ * entityHit.intersectTime;
                    int dist = (int) Math.sqrt((hitX - initialPos.x) * (hitX - initialPos.x) + (hitY - initialPos.y) * (hitY - initialPos.y) + (hitZ - initialPos.z) * (hitZ - initialPos.z));
                    if (type.enableBulletDecay) {
                        for (BulletDecay bulletDecay : type.bulletDecays) {
                            distanceDamageModifier = bulletDecay.calculateDecayFactor(dist);
                        }
                    }

                    float d1 = damage;
                    if (entityHit.entity instanceof EntityLivingBase) {
                        d1 *= type.damageVsLiving;
                        if (entityHit.entity != owner)
                            FlansMod.proxy.spawnParticle("reddust", entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 0, 0, 0);

                    } else {
                        d1 *= type.damageVsEntity;
                    }
                    d1 *= distanceDamageModifier;
                    if (entityHit.entity.attackEntityFrom(getBulletDamage(false), d1) && entityHit.entity instanceof EntityLivingBase) {
                        EntityLivingBase living = (EntityLivingBase) entityHit.entity;
                        for (PotionEffect effect : type.hitEffects) {
                            living.addPotionEffect(new PotionEffect(effect));
                        }
                        //If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
                        living.arrowHitTimer++;
                        living.hurtResistantTime = living.maxHurtResistantTime / 2;
                    }
                    if (type.setEntitiesOnFire)
                        entityHit.entity.setFire(type.setEntitiesOnFireTime);

                    penetratingPower -= 1F;
                    penetrationLosses.add(new PenetrationLoss(1F, PenetrationLoss.PenetrationLossType.ENTITY));

                    //探测器击中玩家后标记该玩家
                    if (firedFrom instanceof IMarkable && ((IMarkable) firedFrom).isDetector()) {
                        if (entityHit.entity != null) {
                            if (owner instanceof EntityPlayer)
                                MCHeliUtil.sendSpotedEntityListToSameTeam(owner, 2, new int[]{entityHit.entity.getEntityId()});
                            else if (owner instanceof EntityAAGun) {
                                MCHeliUtil.sendSpotedEntityListToSameTeam(((EntityAAGun) owner).placer, 2, new int[]{entityHit.entity.getEntityId()});
                            }
                        }
                    }

                    if (FlansMod.DEBUG) {
                        worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * entityHit.intersectTime, posY + motionY * entityHit.intersectTime, posZ + motionZ * entityHit.intersectTime), 1000, 1F, 1F, 0F));
                        FlansMod.log(entityHit.entity.toString() + ": d=" + d1 + ": damage=" + damage + ": type.damageVsEntity=" + type.damageVsEntity);
                    }

                    //探测器击中玩家后标记该玩家
                    if (firedFrom instanceof IMarkable && ((IMarkable) firedFrom).isDetector()) {
                        if (entityHit.entity != null && owner instanceof EntityPlayer) {
                            MCHeliUtil.sendSpotedEntityListToSameTeam(owner, 2, new int[]{entityHit.entity.getEntityId()});
                        }
                    }

                    setDead();
                    break;
                }

                //处理方块撞击
                else if (bulletHit instanceof BlockHit) {

                    //播放撞击地点
                    if (type.printExplodePoint && worldObj.isRemote) {
                        EntityPlayer player = null;
                        if (owner instanceof EntityPlayer) {
                            player = (EntityPlayer) owner;
                        } else if (owner instanceof EntityDriveable) {
                            EntityDriveable entityDriveable = (EntityDriveable) owner;
                            player = (EntityPlayer) entityDriveable.seats[0].riddenByEntity;
                            for (EntitySeat entitySeat : entityDriveable.seats) {
                                player = (EntityPlayer) entitySeat.riddenByEntity;
                                player.addChatComponentMessage(new ChatComponentText(Math.round(posX) + "," + Math.round(posY) + "," + Math.round(posZ)));
                            }
                        }
                    }


                    //TODO:可能有BUG
                    if (type.dropItemOnHitBlocks && worldObj.isRemote) {
                        int itemid = type.dropItemIdOnHitBlocks;
                        int dropnum = type.dropItemNumOnHitBlocks;
                        Item item = Item.getItemById(itemid);
                        ItemStack itemStack = new ItemStack(item, dropnum);
                        worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, itemStack));
                    }

                    BlockHit blockHit = (BlockHit) bulletHit;
                    MovingObjectPosition raytraceResult = blockHit.raytraceResult;
                    Vec3 hitVec = raytraceResult.hitVec;

                    double distanceDamageModifier = 1;
                    double hitX = posX + motionX * blockHit.intersectTime;
                    double hitY = posY + motionY * blockHit.intersectTime;
                    double hitZ = posZ + motionZ * blockHit.intersectTime;
                    int dist = (int) Math.sqrt((hitX - initialPos.x) * (hitX - initialPos.x) + (hitY - initialPos.y) * (hitY - initialPos.y) + (hitZ - initialPos.z) * (hitZ - initialPos.z));
                    if (type.enableBulletDecay) {
                        for (BulletDecay bulletDecay : type.bulletDecays) {
                            distanceDamageModifier = bulletDecay.calculateDecayFactor(dist);
                        }
                    }

                    //If the hit wasn't an entity hit, then it must've been a block hit
                    int xTile = raytraceResult.blockX;
                    int yTile = raytraceResult.blockY;
                    int zTile = raytraceResult.blockZ;

                    if (FlansMod.DEBUG)
                        worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord), 100, 0F, 1F, 0F));

                    Block block = worldObj.getBlock(xTile, yTile, zTile);
                    Material mat = block.getMaterial();

                    if (type.hitSoundEnable) {
                        //如果材质是铁质物品
                        if (mat == Material.iron || mat == Material.anvil) {
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSoundIron, true);
                        } else {
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
                        }
                    }

                    if (penetrationBlockCount < type.penetratingBlockMaxNum) {
                        boolean penetrableBlockFound = false;

                        //如果击中可穿透方块
                        if (block == Blocks.iron_bars || mat == Material.glass || mat == Material.leaves) {

                            damage *= type.penetratingDamageLoss;
                            FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block, this.dimension);

                            penetrableBlockFound = true;
                            penetrationBlockCount++;

                        } else {
                            //击中非穿透方块
                        }

                        if (penetrableBlockFound) continue;
                    }


                    //标靶方块
                    if (block instanceof TargetBreakableBlock && owner instanceof EntityPlayer) {
                        if (!worldObj.isRemote) {
                            calculateDps((float) (damage * type.damageVsPlayer * distanceDamageModifier), (EntityPlayer) owner);
                        } else {
                            playTargetSound((EntityPlayer) owner);
                        }
                    }

                    //击碎玻璃
                    if (type.breaksGlass && mat == Material.glass) {
                        if (TeamsManager.canBreakGlass) {
                            worldObj.setBlockToAir(xTile, yTile, zTile);
                            FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block, this.dimension);
                        }
                    }

                    /* 生成粒子效果 */
                    if (worldObj.isRemote) {
                        if (block.getMaterial() != Material.air) {
                            SpawnBlockPar(raytraceResult, xTile, yTile, zTile, block);
                        }
                    }

                    /* 允许召唤炮击 */
                    if (!worldObj.isRemote && type.enableCallArtillery && !artilleryCalled) {
                        canCallArtillery = true;
                    }

                    /* 弹道雷达逻辑 */
                    if (!worldObj.isRemote) {
                        AxisAlignedBB detectionBox = AxisAlignedBB.getBoundingBox(
                                hitVec.xCoord - 5, hitVec.yCoord - 5, hitVec.zCoord - 5,
                                hitVec.xCoord + 5, hitVec.yCoord + 5, hitVec.zCoord + 5
                        );
                        // 获取命中范围内的所有实体
                        List<Entity> nearbyEntities = worldObj.getEntitiesWithinAABB(EntityAAGun.class, detectionBox);
                        // 遍历检测是否有EntityAAGun
                        for (Entity entity : nearbyEntities) {
                            if (entity instanceof EntityAAGun) {
                                EntityAAGun aaGun = (EntityAAGun) entity;
                                if (aaGun.type != null
                                        && aaGun.type.isRadar
                                        && aaGun.placer != null
                                        && (owner instanceof EntityPlayer || owner instanceof EntitySoldier)
                                        && !aaGun.placer.isOnSameTeam((EntityLivingBase) owner)) {
                                    MCHeliUtil.sendSpotedEntityListToSameTeam(aaGun.placer, 2, new int[]{owner.getEntityId()});
                                }
                            }
                        }
                    }

                    //处理子弹反弹
                    if (type.enableBounciness && type.bounciness > 0) {
                        Vector3f hitPos = new Vector3f(hitVec);
                        Vector3f preHitVel = Vector3f.sub(hitPos, origin, null);
                        Vector3f postHitVel = Vector3f.sub(motion, preHitVel, null);

                        Vector3f surfaceNormal;

                        int sideHit = blockHit.raytraceResult.sideHit;
                        switch (sideHit) {
                            case 0:
                                surfaceNormal = new Vector3f(0, -1, 0);
                                break;
                            case 1:
                                surfaceNormal = new Vector3f(0, 1, 0);
                                break;
                            case 2:
                                surfaceNormal = new Vector3f(0, 0, -1);
                                break;
                            case 3:
                                surfaceNormal = new Vector3f(0, 0, 1);
                                break;
                            case 5:
                                surfaceNormal = new Vector3f(1, 0, 0);
                                break;
                            case 4:
                            default:
                                surfaceNormal = new Vector3f(-1, 0, 0);
                                break;
                        }

                        if (motion.lengthSquared() < 0.1F * initialSpeed) {
                            setPosition(hitVec.xCoord, hitVec.yCoord, hitVec.zCoord);
                            setDead();
                        } else {
                            float lambda = postHitVel.length() / motion.length();

                            float normalProjection = Vector3f.dot(surfaceNormal, postHitVel);
                            Vector3f normal = (Vector3f) (new Vector3f(surfaceNormal)).scale(-normalProjection);

                            Vector3f orthog = Vector3f.add(postHitVel, normal, null);

                            normal.scale(type.bounciness / 3);
                            orthog.scale(type.bounciness);

                            postHitVel = Vector3f.add(orthog, normal, null);

                            Vector3f totalVel = Vector3f.add(preHitVel, postHitVel, null);

                            setPosition(posX + totalVel.x,
                                    posY + totalVel.y,
                                    posZ + totalVel.z);
                            setVelocity(postHitVel.x / lambda, postHitVel.y / lambda, postHitVel.z / lambda);
                        }

                        if (bounceNum < type.bounceLimit) {
                            bounceNum++;
                        } else {
                            setPosition(hitVec.xCoord, hitVec.yCoord, hitVec.zCoord);
                            setVelocity(0, 0, 0);
                            if (type.detonateOnBouncinessLimit) {
                                setDead();
                            }
                        }

                    } else {
                        setPosition(hitVec.xCoord, hitVec.yCoord, hitVec.zCoord);
                        setDead();
                    }
                    break;
                }

                if (penetratingPower <= 0F || (type.explodeOnImpact && ticksInAir > 1)) {
                    setPosition(posX + motionX * bulletHit.intersectTime, posY + motionY * bulletHit.intersectTime, posZ + motionZ * bulletHit.intersectTime);
                    setDead();
                    break;
                }

            }

        }

        //Otherwise, do a standard check for uninteresting entities
		/*
		else
		{
			//Iterate over entities close to the bullet to see if any of them have been hit and hit them
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.addCoord(motionX, motionY, motionZ).expand(type.hitBoxSize, type.hitBoxSize, type.hitBoxSize));
			for (int l = 0; l < list.size(); l++)
			{
				Entity checkEntity = (Entity) list.get(l);
				//Driveable collisions are handled earlier
				if(checkEntity instanceof EntityDriveable)
					continue;

				if(checkEntity instanceof EntityPlayer)
					continue;

				//Stop the bullet hitting stuff that can't be collided with or the person shooting immediately after firing it
				if((!checkEntity.canBeCollidedWith() || isPartOfOwner(checkEntity)) && ticksInAir < 20)
				{
					continue;
				}


				//Calculate the hit damage
				float hitDamage = damage * type.damageVsLiving;
				//Create a damage source object
				DamageSource damagesource = owner == null ? DamageSource.generic : getBulletDamage(false);

				//When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
				if(hitDamage == 0 && checkEntity instanceof EntityPlayerMP && TeamsManager.getInstance().currentRound != null)
					TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)checkEntity, damagesource);

				//Attack the entity!
				if(checkEntity.attackEntityFrom(damagesource, hitDamage))
				{
					//If the attack was allowed and the entity is alive, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
					if (checkEntity instanceof EntityLivingBase)
					{
						((EntityLivingBase) checkEntity).arrowHitTimer++;
						((EntityLivingBase) checkEntity).hurtResistantTime = ((EntityLivingBase) checkEntity).maxHurtResistantTime / 2;
					}
					//Yuck.
					//PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
				}
				//Unless the bullet penetrates, kill it
				if(type.penetratingPower > 0)
				{
					setPosition(checkEntity.posX, checkEntity.posY, checkEntity.posZ);
					setDead();
					break;
				}
			}
		}
		*/

        //Movement dampening variables
        float drag = type.dragInAir;
        float gravity1 = 0.02F;
        //If the bullet is in water, spawn particles and increase the drag
        if (isInWater()) {
            for (int i = 0; i < 4; i++) {
                float bubbleMotion = 0.25F;
                worldObj.spawnParticle("bubble", posX - motionX * bubbleMotion, posY - motionY * bubbleMotion, posZ - motionZ * bubbleMotion, motionX, motionY + 0.1F, motionZ);
            }
            drag = type.dragInWater;
        }
        if (!type.torpedo) {
            motionX *= drag;
            motionY *= drag;
            motionZ *= drag;
            motionY -= gravity1 * type.fallSpeed;
        }

        // 导弹锁定逻辑
        if (type.tickEndHoming > 0 && this.ticksExisted > type.tickEndHoming) {
            lockedOnTo = null;
        }
        if (lockedOnTo != null) {
            if (lockedOnTo instanceof EntityDriveable) {
                EntityDriveable entDriveable = (EntityDriveable) lockedOnTo;
                // entPlane.isLockedOn = true;
                if (entDriveable.getDriveableType().lockedOnSound != null && soundTime <= 0 && !this.worldObj.isRemote) {
                    PacketPlaySound.sendSoundPacket(lockedOnTo.posX, lockedOnTo.posY, lockedOnTo.posZ,
                            entDriveable.getDriveableType().lockedOnSoundRange, dimension, entDriveable.getDriveableType().lockedOnSound, false);
                    soundTime = entDriveable.getDriveableType().soundTime;
                }
            } else {
                lockedOnTo.getEntityData().setBoolean("Tracking", true);
            }
            if (this.ticksExisted > type.tickStartHoming) {
                double dX = lockedOnTo.posX - posX;
                double dY;
                if (type.isDoTopAttack && Math.abs(lockedOnTo.posX - this.posX) > 2 && Math.abs(lockedOnTo.posZ - this.posZ) > 2)
                    dY = lockedOnTo.posY + 30 - posY;
                else dY = lockedOnTo.posY - posY;
                double dZ = lockedOnTo.posZ - posZ;
                double dXYZ;
                if (!type.isDoTopAttack)
                    dXYZ = getDistanceToEntity(lockedOnTo);
                else dXYZ = Math.sqrt(dX * dX + dY * dY + dZ * dZ);

                //半主动制导
                if (owner != null && type.enableSACLOS) {
                    double dXp = lockedOnTo.posX - owner.posX;
                    double dYp = lockedOnTo.posY - owner.posY;
                    double dZp = lockedOnTo.posZ - owner.posZ;
                    Vec3 playerVec = owner.getLookVec();
                    Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
                    double angles = Math.abs(Vector3f.angle(playerVec3f, new Vector3f(dXp, dYp, dZp)));
                    //超过某角度脱锁
                    if (angles > Math.toRadians(type.maxDegreeOfSACLOS)) {
                        lockedOnTo = null;
                    }
                }

                if (this.toggleLock) {
                    //prevDistanceToEntity = dXYZ;
                    if (dXYZ > type.maxRangeOfMissile)
                        lockedOnTo = null;
                    toggleLock = false;
                }

                // Vector3f lockedOnToVector = new Vector3f(dX,dY,dZ);

                double dmotion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);

                Vector3f motionVector = new Vector3f(dX * dmotion / dXYZ, dY * dmotion / dXYZ, dZ * dmotion / dXYZ);

                double angle = Math.abs(Vector3f.angle(motion, motionVector));

                if (angle > Math.toRadians(type.maxDegreeOfMissile)) {
                    lockedOnTo = null;
                } else {
                    motionX = motionVector.x;
                    motionY = motionVector.y;
                    motionZ = motionVector.z;
                }

                if (this.ticksExisted > 4 && dXYZ > prevDistanceToEntity) {
                    closeCount++;
                    if (closeCount > 15) {
                        lockedOnTo = null;
                    }
                } else {
                    if (closeCount > 0)
                        closeCount--;
                }
                prevDistanceToEntity = dXYZ;
            }

            if (lockedOnTo instanceof EntityDriveable) {
                EntityDriveable plane = (EntityDriveable) lockedOnTo;

                if (plane.varFlare || plane.ticksFlareUsing > 0)// && !type.enableSACLOS)
                {
                    lockedOnTo = null;
                }
            } else if (lockedOnTo != null && lockedOnTo.getEntityData().getBoolean("FlareUsing")) {
                lockedOnTo = null;
            }
        }


        //标枪导弹逻辑
        if (owner != null && type.shootForSettingPos && !this.isFirstPositionSetting) {
            if (this.owner instanceof EntityPlayer) {
                EntityPlayer entP = (EntityPlayer) this.owner;
                if (entP.getCurrentEquippedItem() != null)
                    if (entP.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                        ItemGun itemGun = (ItemGun) entP.getCurrentEquippedItem().getItem();
                        this.impactX = itemGun.impactX;
                        this.impactY = itemGun.impactY;
                        this.impactZ = itemGun.impactZ;
                    }

            }
            this.isFirstPositionSetting = true;
        }

        //标枪第一阶段向上运动
        if (type.shootForSettingPos && this.isFirstPositionSetting && this.isPositionUpper) {
            double motionXa = this.motionX;
            double motionYa = this.motionY;
            double motionZa = this.motionZ;
            double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
            this.motionX = 0;
            this.motionY = motiona;
            this.motionZ = 0;

            if (this.posY - type.shootForSettingPosHeight > owner.posY) {
                this.isPositionUpper = false;
            }
        }
        //标枪第二阶段向下运动
        if (type.shootForSettingPos && this.isFirstPositionSetting && !this.isPositionUpper) {
            double rootx = this.impactX - this.posX;
            double rootz = this.impactZ - this.posZ;
            double roota = Math.sqrt((rootx * rootx) + (rootz * rootz));
            double motionXa = this.motionX;
            double motionYa = this.motionY;
            double motionZa = this.motionZ;
            double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
            this.motionX = rootx * motiona / roota;
            this.motionZ = rootz * motiona / roota;
            if (Math.abs(this.impactX - this.posX) < 1 && Math.abs(this.impactZ - this.posZ) < 1) {
                double motionXab = this.motionX;
                double motionYab = this.motionY;
                double motionZab = this.motionZ;
                double motionab = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
                this.motionX = 0;
                this.motionY = -motionab;
                this.motionZ = 0;
            }
        }

        //拖线导弹逻辑
        if (owner != null && type.manualGuidance && VLSDelay <= 0 && lockedOnTo == null
                && stillHoming()) {
            this.renderDistanceWeight = 400D;
            /**
             boolean beamRider = true;
             if(!beamRider)
             {
             this.rotationYaw = owner.rotationYaw;
             this.rotationPitch = owner.rotationPitch;
             double dist = MathHelper.sqrt_double( motionX*motionX + motionY*motionY + motionZ*motionZ );
             final float PI = (float) Math.PI;
             motionX = dist * -MathHelper.sin((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
             motionZ = dist *  MathHelper.cos((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
             motionY = dist * -MathHelper.sin((rotationPitch / 180F) * PI)*1.02;
             } else
             */

            Vector3f lookVec1;
            Vector3f origin21;
            lookVec1 = new Vector3f((float) owner.getLookVec().xCoord, (float) owner.getLookVec().yCoord, (float) owner.getLookVec().zCoord);
            origin21 = new Vector3f(owner.posX, owner.posY, owner.posZ);

            if (type.fixedDirection) {
                lookVec = lookVector;
                origin21 = initialPos;
            }
            float x1 = (float) (posX - origin21.x);
            float y = (float) (posY - origin21.y);
            float z = (float) (posZ - origin21.z);

            float d1 = (float) Math.sqrt((x1 * x1) + (y * y) + (z * z));
            d1 = d1 + type.turnRadiusCLOS;

            lookVec1.normalise();

            Vector3f targetPoint = new Vector3f(origin21.x + (lookVec1.x * d1), origin21.y + (lookVec1.y * d1), origin21.z + (lookVec1.z * d1));
            //FlansMod.proxy.spawnParticle("explode", targetPoint.x,targetPoint.y,targetPoint.z, 0,0,0);
            //double dX = owner.posX - this.posX;
            //double dY = owner.posY - this.posY;
            //double dZ = owner.posZ - this.posZ;
            //targetPoint = new Vector3f(owner.posX, owner.posY, owner.posZ);

            Vector3f diff = Vector3f.sub(targetPoint, new Vector3f(posX, posY, posZ), null);

            float speed2 = type.trackPhaseSpeedCLOS;
            float turnSpeed = type.trackPhaseTurnCLOS;
            diff.normalise();
            Vector3f targetSpeed = new Vector3f(diff.x * speed2, diff.y * speed2, diff.z * speed2);

            this.motionX += (targetSpeed.x - motionX) * turnSpeed;
            this.motionY += (targetSpeed.y - motionY) * turnSpeed;
            this.motionZ += (targetSpeed.z - motionZ) * turnSpeed;

            // 限制速度上限，防止导弹速度过快
            double maxSpeed =  type.maxGuidedSpeedMultiplierCLOS; // 最大速度值
            double currentSpeed = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
            if (currentSpeed > maxSpeed) {
                double scale = maxSpeed / currentSpeed;
                this.motionX *= scale;
                this.motionY *= scale;
                this.motionZ *= scale;
            }

            //this.rotationYaw = owner.rotationYaw;
            //this.rotationPitch = owner.rotationPitch;
        }

        //人工瞄准线指令制导 MCLOS
        if (type.enableMCLOS && stillHoming()) {
            // 控制偏航参数范围，限制偏航和俯仰的偏移值在 [-0.5, 0.5] 范围内
            yawOffsetMCLOS = Math.max(-0.5f, Math.min(0.5f, yawOffsetMCLOS));
            pitchOffsetMCLOS = Math.max(-0.5f, Math.min(0.5f, pitchOffsetMCLOS));

            // 当前导弹的运动方向角度
            float currentYaw = (float) Math.atan2(motionZ, motionX); // 当前偏航角
            float currentPitch = (float) Math.atan2(motionY, Math.sqrt(motionX * motionX + motionZ * motionZ)); // 当前俯仰角

            // 计算目标方向的角度（根据玩家的输入调整）
            float targetYaw = currentYaw + yawOffsetMCLOS; // 修正偏航角方向
            float targetPitch = currentPitch + pitchOffsetMCLOS; // 调整俯仰角方向

            // 将目标角度直接转换为运动增量
            double speed1 = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ); // 当前速度大小
            double deltaX = speed1 * Math.cos(targetPitch) * Math.cos(targetYaw); // X 方向的速度增量
            double deltaY = speed1 * Math.sin(targetPitch); // Y 方向的速度增量
            double deltaZ = speed1 * Math.cos(targetPitch) * Math.sin(targetYaw); // Z 方向的速度增量

            // 平滑调整导弹的速度
            this.motionX += (deltaX - motionX) * 0.1;
            this.motionY += (deltaY - motionY) * 0.1;
            this.motionZ += (deltaZ - motionZ) * 0.1;

            // 限制速度上限，防止导弹速度过快
            double maxSpeed = type.maxGuidedSpeedMultiplierCLOS; // 最大速度值
            double currentSpeed = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
            if (currentSpeed > maxSpeed) {
                double scale = maxSpeed / currentSpeed;
                this.motionX *= scale;
                this.motionY *= scale;
                this.motionZ *= scale;
            }

            yawOffsetMCLOS *= 0.8;
            pitchOffsetMCLOS *= 0.8;
        }

        //导弹加力逻辑
        if(type.enableBoost) {
            if (canAccelerate) {
                canAccelerate = false;
                isAccelerating = true;
                FlansMod.getPacketHandler().sendToAll(new PacketMissileMCLOSAccelerate(getEntityId()));
            }
            if (isAccelerating) {
                motionX *= 2;
                motionY *= 2;
                motionZ *= 2;
            }
        }

        if (type.torpedo) {
            if (isInWater()) {
                Vector3f motion2 = new Vector3f(motionX, motionY, motionZ);
                float length = motion.length();
                motion.normalise();
                motionY *= 0.3F;
                motionX = motion.x * 1;
                motionZ = motion.z * 1;
            } else {
                motionY -= gravity1 * type.fallSpeed;
            }
        }


        //Apply motion
        //posX += motionX;
        //posY += motionY;
        //posZ += motionZ;
        setPosition(posX + motionX, posY + motionY, posZ + motionZ);

        //Recalculate the angles from the new motion
        float motionXZ = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
        rotationYaw = (float) ((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
        rotationPitch = (float) ((Math.atan2(motionY, motionXZ) * 180D) / 3.1415927410125732D);
        //Reset the range of the angles
        for (; rotationPitch - prevRotationPitch < -180F; prevRotationPitch -= 360F) {
        }
        for (; rotationPitch - prevRotationPitch >= 180F; prevRotationPitch += 360F) {
        }
        for (; rotationYaw - prevRotationYaw < -180F; prevRotationYaw -= 360F) {
        }
        for (; rotationYaw - prevRotationYaw >= 180F; prevRotationYaw += 360F) {
        }
        rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;
        rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;

        //Particles
        if (type.trailParticles && worldObj.isRemote && ticksInAir > 1) {
            spawnParticles();
        }

        //Temporary fire glitch fix
        if (worldObj.isRemote)
            extinguish();
    }

    private boolean stillHoming() {
        if(type.tickEndHoming < 0) {
            return true;
        }
        return ticksExisted < type.tickEndHoming;
    }

    private void playTargetSound(EntityPlayer owner) {
        owner.playSound("flansmod:target_hit", 1.0f, 1.0f);
    }

    private void applyLaserGuidance(Vector3f targetPos, Vector3f motion) {
        if (this.ticksExisted > type.tickStartHoming) {
            double dX = targetPos.x - posX;
            double dY = targetPos.y - posY;
            double dZ = targetPos.z - posZ;
            double dXYZ;
            float f = (float) (this.posX - targetPos.x);
            float f1 = (float) (this.posY - targetPos.y);
            float f2 = (float) (this.posZ - targetPos.z);
            dXYZ = MathHelper.sqrt_float(f * f + f1 * f1 + f2 * f2);
            if (this.toggleLock) {
                if (dXYZ > type.maxRangeOfMissile)
                    targetPos = null;
                toggleLock = false;
            }
            double dmotion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
            Vector3f motionVector = new Vector3f(dX * dmotion / dXYZ, dY * dmotion / dXYZ, dZ * dmotion / dXYZ);
            double angle = Math.abs(Vector3f.angle(motion, motionVector));
            if (angle > Math.toRadians(type.maxDegreeOfMissile)) {
                targetPos = null;
            } else {
                motionX = motionVector.x;
                motionY = motionVector.y;
                motionZ = motionVector.z;
            }

            if (this.ticksExisted > 4 && dXYZ > getPrevDistanceToTarget) {
                closeCount++;
                if (closeCount > 15) {
                    targetPos = null;
                }
            } else {
                if (closeCount > 0)
                    closeCount--;
            }
            getPrevDistanceToTarget = dXYZ;
        }
    }

    @SideOnly(Side.CLIENT)
    private void spawnParticles() {
        double dX = (posX - prevPosX) / 10;
        double dY = (posY - prevPosY) / 10;
        double dZ = (posZ - prevPosZ) / 10;

        float spread = 0.1F;
        if (VLSDelay > 0 && type.boostPhaseParticleType != null) {
            for (int i = 0; i < 10; i++) {
                FlansMod.proxy.spawnParticle(type.boostPhaseParticleType,
                        prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
                        0, 0, 0);
            }
        } else if (!type.VLS || (VLSDelay <= 0)) {
            for (int i = 0; i < 10; i++) {
                //EntityFX particle = FlansModClient.getParticle("flansmod.rocketexhaust", worldObj, prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread);
                //if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
                //particle.renderDistanceWeight = 100D;
                //worldObj.spawnEntityInWorld(particle);
                FlansMod.proxy.spawnParticle(type.trailParticleType,
                        prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
                        0, 0, 0);
            }

        }
        if (isAccelerating && type.boostPhaseParticleType != null) {
            for (int i = 0; i < 8; i++) {
                FlansMod.proxy.spawnParticle(type.boostPhaseParticleType,
                        prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
                        0, 0, 0);
            }
        }
        //FlansMod.proxy.spawnParticle("explode", prevPosX + dX, prevPosY + dY, prevPosZ + dZ, motionX + (float)Math.random()*1 - 0.5, motionY + (float)Math.random()*1 - 0.5, motionZ +(float)Math.random()*1 - 0.5);

    }


    @SideOnly(Side.CLIENT)
    private void spawnHitParticles(double x, double y, double z) {
        FlansMod.proxy.spawnParticle("explode", x, y, z, 0, 0, 0);
    }

    public DamageSource getBulletDamage(boolean headshot) {
        if (owner instanceof EntityPlayer || owner instanceof EntitySoldier)
            return (new EntityDamageSourceFlans(type.shortName, this, (EntityLivingBase) owner, firedFrom, headshot, false)).setProjectile();
        else return (new EntityDamageSourceIndirect(type.shortName, this, owner)).setProjectile();
    }

    private boolean isPartOfOwner(Entity entity) {
        if (owner == null)
            return false;
        if (entity == owner || entity == owner.riddenByEntity || entity == owner.ridingEntity)
            return true;
        if (owner instanceof EntityPlayer) {
            if (PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER) == null)
                return false;
            EntityMG mg = PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER).mountingGun;
            if (mg != null && mg == entity) {
                return true;
            }
        }
        return owner.ridingEntity instanceof EntitySeat && (((EntitySeat) owner.ridingEntity).driveable == null || ((EntitySeat) owner.ridingEntity).driveable.isPartOfThis(entity));
    }


    @Override
    public void setDead() {

        try {
            if (isDead)
                return;

            super.setDead();

            if (worldObj.isRemote) {
                bulletFollowCamera.setDead();
                return;
            }


//			FlansMod.log("EntityBullet.setDead() "+type.shortName + " : "+this);

            if (owner instanceof EntityPlayerMP) {
                EntityPlayerMP player = (EntityPlayerMP) owner;
                //判断是否为航弹
                if (player.ridingEntity != null && player.ridingEntity instanceof EntityPlane && type.weaponType == EnumWeaponType.BOMB) {
                    EntityPlane plane = (EntityPlane) player.ridingEntity;
                    double distance = Math.sqrt(Math.pow(plane.posX - posX, 2) + Math.pow(plane.posY - posY, 2) + Math.pow(plane.posZ - posZ, 2));
                    //计算伤害
                    double damage = type.maxdamagetoself * calculateDamage(distance);
                    //扣核心血量
                    plane.driveableData.parts.get(EnumDriveablePart.core).health -= damage;
                }

            }
//            if (type.explosionRadius > 0) {
//                if (owner instanceof EntityPlayer) {
//                    new FlansModExplosion(worldObj, this, (EntityPlayer) owner, type, posX, posY, posZ,
//                            type.explosionRadius, type.explosionPower, TeamsManager.explosions, type.explosionBreaksBlocks,
//                            type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
//                } else {
//                    worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions);
//                }
//            }
            detonate();
            //燃烧弹相关
            if (type.fireRadius > 0) {
                for (float i = -type.fireRadius; i < type.fireRadius; i++) {
                    for (float k = -type.fireRadius; k < type.fireRadius; k++) {
                        for (int j = -1; j < 1; j++) {
                            if (worldObj.getBlock((int) (posX + i), (int) (posY + j), (int) (posZ + k)).getMaterial() == Material.air) {
                                worldObj.setBlock((int) (posX + i), (int) (posY + j), (int) (posZ + k), Blocks.fire);
                            }
                        }
                    }
                }
            }
            //Send flak packet
            if (type.flak > 0)
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
            // Drop item on hitting if bullet requires it
            if (type.dropItemOnHit != null) {
                String itemName = type.dropItemOnHit;
                int damage = 0;
                if (itemName.contains(".")) {
                    damage = Integer.parseInt(itemName.split("\\.")[1]);
                    itemName = itemName.split("\\.")[0];
                }
                ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
                entityDropItem(dropStack, 1.0F);

            }
        } catch (Exception e) {
//			FlansMod.log("EntityBullet.setDead() Error ("+this+")");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }

    // 航弹距离衰减算法
    public double calculateDamage(double distance) {
        if (distance <= type.minDamageDistanceToPlane) {
            return 1.0; // 最小距离内，受到全额伤害
        } else if (distance >= type.maxDamageDistanceToPlane) {
            return 0.0; // 最大距离外，不受到伤害
        } else {
            // 在最小距离和最大距离之间，应用衰减计算
            double damageRatio = 1.0 - (distance - type.minDamageDistanceToPlane) / (type.maxDamageDistanceToPlane - type.minDamageDistanceToPlane);
            return damageRatio;
        }
    }

    public float moveToTarget(float current, float target, float speed) {

        float pitchToMove = (float) ((Math.sqrt(target * target)) - Math.sqrt((current * current)));
        for (; pitchToMove > 180F; pitchToMove -= 360F) {
        }
        for (; pitchToMove <= -180F; pitchToMove += 360F) {
        }

        float signDeltaY = 0;
        if (pitchToMove > speed) {
            signDeltaY = 1;
        } else if (pitchToMove < -speed) {
            signDeltaY = -1;
        } else {
            signDeltaY = 0;
            return target;
        }


        if (current > target) {
            current = current - speed;
        } else if (current < target) {
            current = current + speed;
        }


        return current;
    }


    public void detonate() {
        //Do not detonate before grenade is primed
        if (ticksExisted < type.primeDelay)
            return;

		/*if(lockedOnTo != null)
		if(lockedOnTo instanceof EntityDriveable){
			EntityDriveable entPlane = (EntityDriveable)lockedOnTo;
			entPlane.isLockedOn = false;
		}*/

        //Stop repeat detonations
        if (detonated)
            return;
        detonated = true;

        //Play detonate sound
        PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.detonateSound, true);

        //Explode
        if (!worldObj.isRemote && type.explosionRadius > 0.1F) {
            if ((owner instanceof EntityPlayer)) {
                new FlansModExplosion(worldObj, this, (EntityPlayer) owner, type, posX, posY, posZ,
                        type.explosionRadius, type.explosionPower, TeamsManager.explosions, type.explosionBreaksBlocks,
                        type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
                isDead = true;
            } else {
                worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks);
                isDead = true;
            }
        }

        //Make fire
        if (!worldObj.isRemote && type.fireRadius > 0.1F) {
            for (float i = -type.fireRadius; i < type.fireRadius; i++) {
                for (float j = -type.fireRadius; j < type.fireRadius; j++) {
                    for (float k = -type.fireRadius; k < type.fireRadius; k++) {
                        int x = MathHelper.floor_double(i + posX);
                        int y = MathHelper.floor_double(j + posY);
                        int z = MathHelper.floor_double(k + posZ);
                        if (i * i + j * j + k * k <= type.fireRadius * type.fireRadius && worldObj.getBlock(x, y, z) == Blocks.air && rand.nextBoolean()) {
                            worldObj.setBlock(x, y, z, Blocks.fire, 0, 3);
                        }
                    }
                }
            }
        }

        //Make explosion particles
        for (int i = 0; i < type.explodeParticles; i++) {
            worldObj.spawnParticle(type.explodeParticleType, posX, posY, posZ, rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
        }

        //Drop item upon detonation, after explosions and whatnot
        if (!worldObj.isRemote && type.dropItemOnDetonate != null) {
            String itemName = type.dropItemOnDetonate;
            int damage = type.roundsPerItem;
            ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
            entityDropItem(dropStack, 1.0F);
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tag) {
        if (type == null) {
            FlansMod.log("EntityBullet.writeEntityToNBT() Error: BulletType is null (" + this + ")");
            setDead();
            return;
        }
        tag.setString("type", type.shortName);
        if (owner == null)
            tag.setString("owner", "null");
        else
            tag.setString("owner", owner.getCommandSenderName());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag) {
        String typeString = tag.getString("type");
        String ownerName = tag.getString("owner");

        if (typeString != null)
            type = BulletType.getBullet(typeString);

        if (type == null) {
//			FlansMod.log("EntityBullet.readEntityFromNBT() Error: BulletType is null ("+this+")");
            this.isDead = true;
            return;
        }

        if (type.despawnTime <= 0) {
            this.isDead = true;
        }

        if (ownerName != null && !ownerName.equals("null"))
            owner = FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().func_152612_a(ownerName);
    }

    @Override
    public float getShadowSize() {
        return type.hitBoxSize;
    }

    public void setSubmunitionDelay() {
        submunitionDelay = type.subMunitionTimer;
        hasSetSubDelay = true;
    }

    public boolean deploySubmunitions() {
        ItemShootable itemShootable = (ItemShootable) GameRegistry.findItem(FlansMod.MODID, type.submunition);
        ShootableType shootType = itemShootable.type;
        World world = worldObj;
        EntityLivingBase entityplayer = (EntityLivingBase) owner;
        for (int sm = 0; sm < type.numSubmunitions; sm++) {
            world.spawnEntityInWorld(itemShootable.getEntity(
                    world,
                    new Vector3f(this.posX, this.posY, this.posZ),
                    new Vector3f(motionX, motionY, motionZ),
                    entityplayer,
                    type.submunitionSpread,
                    damage,
                    speedA,
                    0,
                    firedFrom));
        }
        if (type.destroyOnDeploySubmunition) {
            setDead();
            return false;
        }
        return true;
    }

    private void callArtillery(ItemShootable itemShootable) {
        World world = worldObj;
        EntityLivingBase entityplayer = (EntityLivingBase) owner;

        if (ticksExisted % type.artilleryDelay == 0 && artilleryCalledNum < type.artilleryNum) {
            float randomX = type.artillerySpread * (-1 + (2 * rand.nextFloat()));
            float randomZ = type.artillerySpread * (-1 + (2 * rand.nextFloat()));
            world.spawnEntityInWorld(itemShootable.getEntity(
                    world,
                    new Vector3f(this.posX + randomX, type.artilleryHeight, this.posZ + randomZ),
                    new Vector3f(0, -1, 0),
                    entityplayer,
                    type.artillerySpread,
                    damage,
                    0,
                    0,
                    firedFrom));
            artilleryCalledNum++;
        }

        if (artilleryCalledNum >= type.artilleryNum) {
            canCallArtillery = false;
        }
    }

    public int getBrightnessForRender(float par1) {
        if (type.hasLight) {
            return 15728880;
        } else {
            int i = MathHelper.floor_double(this.posX);
            int j = MathHelper.floor_double(this.posZ);

            if (this.worldObj.blockExists(i, 0, j)) {
                double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66D;
                int k = MathHelper.floor_double(this.posY - (double) this.yOffset + d0);
                return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
            } else {
                return 0;
            }
        }
    }

    @Override
    public void writeSpawnData(ByteBuf data) {
        data.writeDouble(motionX);
        data.writeDouble(motionY);
        data.writeDouble(motionZ);
        data.writeInt(impactX);
        data.writeInt(impactY);
        data.writeInt(impactZ);
        data.writeInt(lockedOnTo == null ? -1 : lockedOnTo.getEntityId());
        data.writeBoolean(isAccelerating);
        ByteBufUtils.writeUTF8String(data, type.shortName);
        if (owner == null)
            ByteBufUtils.writeUTF8String(data, "null");
        else
            ByteBufUtils.writeUTF8String(data, owner.getCommandSenderName());
    }

    @Override
    public void readSpawnData(ByteBuf data) {
        try {
            motionX = data.readDouble();
            motionY = data.readDouble();
            motionZ = data.readDouble();
            impactX = data.readInt();
            impactY = data.readInt();
            impactZ = data.readInt();
            int lockedOnToID = data.readInt();
            if (lockedOnToID != -1)
                lockedOnTo = worldObj.getEntityByID(lockedOnToID);
            isAccelerating = data.readBoolean();
            type = BulletType.getBullet(ByteBufUtils.readUTF8String(data));
            if (type != null) {
                penetratingPower = type.penetratingPower;
            }
            String name = ByteBufUtils.readUTF8String(data);
            for (Object obj : worldObj.loadedEntityList) {
                if (((Entity) obj).getCommandSenderName().equals(name))
                    owner = (Entity) obj;
            }
        } catch (Exception e) {
            FlansMod.log("Failed to read bullet owner from server.");
            super.setDead();
            e.printStackTrace();
        }
    }

    @Override
    public boolean isBurning() {
        return false;
    }

}
