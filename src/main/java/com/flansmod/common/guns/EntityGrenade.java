package com.flansmod.common.guns;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.eventhandlers.AmmoSupplyEvent;
import com.flansmod.common.eventhandlers.HealSupplyEvent;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.item.ItemShootable;
import com.flansmod.common.guns.type.BulletType;
import com.flansmod.common.guns.type.GrenadeType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.guns.type.ShootableType;
import com.flansmod.common.hook.MCHeliUtil;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.network.PacketAPSMarker;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketFlashBang;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.utils.ItemUtils;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class EntityGrenade extends EntityShootable implements IEntityAdditionalSpawnData, ILockable {

    public GrenadeType type;
    /**
     * The entity that threw them
     */
    public EntityLivingBase thrower;
    /**
     * This is to avoid players grenades teamkilling after they switch team
     */
    public Team teamOfThrower;
    /**
     * Yeah, I want my grenades to have fancy physics
     */
    public RotatedAxes axes = new RotatedAxes();
    public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);
    public float prevRotationRoll = 0F;
    /**
     * Set to the smoke amount when the grenade detonates and decremented every tick after that
     */
    public int smokeTime = 0;
    /**
     * Set to true when smoke grenade detonates
     */
    public boolean smoking = false;
    /**
     * Set to true when a sticky grenade sticks. Impedes further movement
     */
    public boolean stuck = false;
    /**
     * Stores the position of the block this grenade is stuck to. Used to determine when to unstick
     */
    public int stuckToX, stuckToY, stuckToZ;
    /**
     * Stop repeat detonations
     */
    public boolean detonated = false;
    /**
     * For deployable bags
     */
    public int numUsesRemaining = 0;
    public int tickAfterFirstImpact = 0;
    public int tickAfterOnGround = 0;
    public boolean startBounce = false;
    public boolean isThisStick = false;
    public Entity stickedEntity;
    public int motionTime = 0;
    public int adsWorkTick = 0;
    public boolean adsWorking = false;
    public int adsShootNum = 0;

    public EntityGrenade(World w) {
        super(w);
    }


    public EntityGrenade(World w, GrenadeType g, EntityLivingBase t) {
        this(w);
        setPosition(t.posX, t.posY + t.getEyeHeight(), t.posZ);
        type = g;
        numUsesRemaining = type.numUses;
        thrower = t;
        if (thrower instanceof EntityPlayer && PlayerHandler.getPlayerData((EntityPlayer) thrower) != null) {
            teamOfThrower = PlayerHandler.getPlayerData((EntityPlayer) thrower).team;
        }
        setSize(g.hitBoxSize, g.hitBoxSize);
        //Set the grenade to be facing the way the player is looking
        axes.setAngles(t.rotationYaw + 90F, g.spinWhenThrown ? t.rotationPitch : 0F, 0F);
        rotationYaw = prevRotationYaw = g.spinWhenThrown ? t.rotationYaw + 90F : 0F;
        rotationPitch = prevRotationPitch = t.rotationPitch;
        //Give the grenade velocity in the direction the player is looking
        float speed = 0.5F * type.throwSpeed;
        motionX = axes.getXAxis().x * speed;
        motionY = axes.getXAxis().y * speed;
        motionZ = axes.getXAxis().z * speed;
        if (type.spinWhenThrown) {
            angularVelocity = new Vector3f(0F, 0F, 10F);
        }
        if (type.throwSound != null) {
            if(t instanceof EntityPlayer && type.teamThrowSound && t.getTeam() != null) {
                PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, t.getTeam().getRegisteredName().toLowerCase() + "_" + type.throwSound, type.distortSound);
            } else {
                PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.throwSound, type.distortSound);
            }
        }
    }

    public ShootableType getType() {
        return type;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (type == null) {
            FlansMod.log("EntityGrenade.onUpdate() Error: GrenadeType is null (" + this + ")");
            setDead();
            return;
        }
        if (thrower == null) {
            FlansMod.log("EntityGrenade.onUpdate() Error: Grenade thrower is null (" + this + ")");
            setDead();
            return;
        }

        if (motionTime > 0)
            motionTime--;

        /* 医疗相关设置 */
        if (!worldObj.isRemote && type.isMedicBag) {
            float radius = type.medicBagRadius;
            if (ticksExisted % type.medicBagHealDelay == 0) {
                List list = worldObj.getEntitiesWithinAABB(EntityPlayer.class, boundingBox.expand(radius, radius, radius));
                for (Object obj : list) {
                    EntityPlayer player = (EntityPlayer) obj;
                    if ((player.isOnSameTeam(thrower) || player.getTeam() == null) && player.getHealth() < player.getMaxHealth()) {
                        player.heal(type.medicBagHealAmount);
                        FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 1, "heart"), new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 50F));
                        if (thrower instanceof EntityPlayer) {
                            HealSupplyEvent e = new HealSupplyEvent(((EntityPlayer) thrower).getDisplayName(), player.getDisplayName(),
                                    Math.min(type.medicBagHealAmount, player.getMaxHealth() - player.getHealth()));
                            MinecraftForge.EVENT_BUS.post(e);
                        }
                        if (type.medicBagUseNum > 0) {
                            numUsesRemaining++;
                            if (numUsesRemaining >= type.medicBagUseNum) {
                                this.setDead();
                            }
                        }
                    }
                }
            }
        }

        /* 弹药相关设置 */
        if (!worldObj.isRemote && type.isAmmoBag) {
            float radius = type.ammoBagRadius;
            if (ticksExisted % type.ammoBagSupplyDelay == 0) {
                List list = worldObj.getEntitiesWithinAABB(EntityPlayer.class, boundingBox.expand(radius, radius, radius));
                for (Object obj : list) {
                    EntityPlayer player = (EntityPlayer) obj;
                    if (player != null && (player.isOnSameTeam(thrower) || player.getTeam() == null)
                            && type.ammoBagSupplyAmount > 0 && player.getCurrentEquippedItem() != null) {
                        if (player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                            ItemStack isk = player.getCurrentEquippedItem();
                            IInventory inventory = player.inventory;
                            GunType gun = ((ItemGun) isk.getItem()).type;
                            if (gun.ammo.size() > 0 && gun.allowRearm) {
                                int playerClipNum = 0;
                                for (int j = 0; j < inventory.getSizeInventory(); j++) {
                                    ItemStack item = inventory.getStackInSlot(j); // 获取当前遍历到的stack
                                    if (item != null && item.getItem() instanceof ItemShootable && gun.isAmmo(((ItemShootable) (item.getItem())).type, isk)) {
                                        playerClipNum += item.stackSize;
                                    }
                                }
                                //处理玩家手中的物品
                                //TODO player.getItemInUse() java.lang.NoSuchMethodError
//                                ItemStack iskInHand = player.getHeldItem();
//                                if (iskInHand != null && iskInHand.getItem() instanceof ItemShootable && gun.isAmmo(((ItemShootable) (iskInHand.getItem())).type, iskInHand)) {
//                                    playerClipNum += iskInHand.stackSize;
//                                }
                                ShootableType bulletToGive;
                                if (gun.ResupplyType != null) {
                                    bulletToGive = BulletType.getBullet(gun.ResupplyType);
                                } else {
                                    bulletToGive = gun.ammo.get(0);
                                }
                                int maxClipNum = gun.getNumAmmoItemsInGun(isk) * bulletToGive.maxSupplyClips;
                                int numToGive = Math.min(maxClipNum - playerClipNum, Math.min(bulletToGive.maxStackSize, type.ammoBagSupplyAmount * gun.getNumAmmoItemsInGun(isk)));
                                if (player.inventory.addItemStackToInventory(new ItemStack(bulletToGive.item, numToGive))) {
                                    PacketPlaySound.sendSoundPacket(posX, posY, posZ, 6, dimension, type.ammoBagSupplySound, false);
                                    if (thrower instanceof EntityPlayer) {
                                        AmmoSupplyEvent e = new AmmoSupplyEvent(((EntityPlayer) thrower).getDisplayName(), player.getDisplayName(), numToGive);
                                        MinecraftForge.EVENT_BUS.post(e);
                                    }
                                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 5, "happyVillager"), new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 50F));
                                    numUsesRemaining++;
                                }
                            }
                        } else if("item.mcheli:fim92".equals(player.getCurrentEquippedItem().getItem().getUnlocalizedName())) {
                            IInventory inventory = player.inventory;
                            int playerClipNum = 0;
                            for (int j = 0; j < inventory.getSizeInventory(); j++) {
                                ItemStack item = inventory.getStackInSlot(j);
                                if (item != null && "item.mcheli:fim92_bullet".equals(item.getUnlocalizedName())) {
                                    playerClipNum += item.stackSize;
                                }
                            }
                            int numToGive = Math.min(3 - playerClipNum, type.ammoBagSupplyAmount);
                            Item bullet = ItemUtils.getItemByName("mcheli:fim92_bullet");
                            if (bullet != null && player.inventory.addItemStackToInventory(new ItemStack(bullet, numToGive))) {
                                PacketPlaySound.sendSoundPacket(posX, posY, posZ, 6, dimension, type.ammoBagSupplySound, false);
                                if (thrower instanceof EntityPlayer) {
                                    AmmoSupplyEvent e = new AmmoSupplyEvent(((EntityPlayer) thrower).getDisplayName(), player.getDisplayName(), numToGive);
                                    MinecraftForge.EVENT_BUS.post(e);
                                }
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 5, "happyVillager"), new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 50F));
                                numUsesRemaining++;
                            }
                        } else if("item.mcheli:fgm148".equals(player.getCurrentEquippedItem().getItem().getUnlocalizedName())) {
                            IInventory inventory = player.inventory;
                            int playerClipNum = 0;
                            for (int j = 0; j < inventory.getSizeInventory(); j++) {
                                ItemStack item = inventory.getStackInSlot(j);
                                if (item != null && "item.mcheli:fgm148_bullet".equals(item.getUnlocalizedName())) {
                                    playerClipNum += item.stackSize;
                                }
                            }
                            int numToGive = Math.min(4 - playerClipNum, type.ammoBagSupplyAmount);
                            Item bullet = ItemUtils.getItemByName("mcheli:fgm148_bullet");
                            if (bullet != null && player.inventory.addItemStackToInventory(new ItemStack(bullet, numToGive))) {
                                PacketPlaySound.sendSoundPacket(posX, posY, posZ, 6, dimension, type.ammoBagSupplySound, false);
                                if (thrower instanceof EntityPlayer) {
                                    AmmoSupplyEvent e = new AmmoSupplyEvent(((EntityPlayer) thrower).getDisplayName(), player.getDisplayName(), numToGive);
                                    MinecraftForge.EVENT_BUS.post(e);
                                }
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 5, "happyVillager"), new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 50F));
                                numUsesRemaining++;
                            }
                        }
                    }
                    if (type.ammoBagUseNum > 0) {
                        if (numUsesRemaining >= type.ammoBagUseNum) {
                            this.setDead();
                        }
                    }
                }
            }
        }

        /* 运动传感器相关设置 */
        if (!worldObj.isRemote && type.motionSensor) {

            if (ticksExisted % type.motionSensorDelay == 0) {
                float radius = type.motionSensorRange;
                List list = worldObj.getEntitiesWithinAABB(Entity.class, boundingBox.expand(radius, radius, radius));
                MCHeliUtil.sendSpotedEntityListToSameTeam(thrower, type.motionSensorTime, list.stream().mapToInt(e -> ((Entity) e).getEntityId()).toArray());
            }

            if (ticksExisted % type.motionSoundTime == 0) {
                PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.motionSoundRange, dimension, type.motionSound, false);
            }

        }

        /* 诱饵相关设置 */
        if (!worldObj.isRemote && type.isDecoy) {
            if (ticksExisted % type.decoySoundDelay == 0) {
                PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.decoySoundRange, dimension, type.decoySound, false);
            }

            if (ticksExisted % 40 == 0) {
                MCHeliUtil.sendMarkPointToSameTeam(thrower, (int) posX, (int) posY, (int) posZ);
            }

        }

        /* 激光拦截手雷 */
        if (type.isActiveDefence && !type.isAdvancedActiveDefence && adsWorkTick == 0 && ticksExisted > type.primeDelay) {

            if (!worldObj.isRemote) {
                List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(type.targetRange, type.targetRange, type.targetRange));
                for (Object obj : list) {

                    Entity entity = (Entity) obj;
                    if (entity instanceof EntityBullet && ((EntityBullet) entity).type.canBeDestructByAPS) {
                        EntityBullet bullet = (EntityBullet) entity;

                        if (bullet.owner instanceof EntityPlayer && !((EntityPlayer) bullet.owner).isOnSameTeam(this.thrower)) {
                            bullet.setDead();
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 30, dimension, type.shootSound, false);
                            FlansMod.getPacketHandler().sendTo(new PacketAPSMarker(), (EntityPlayerMP) bullet.owner);
                            adsWorkTick = 1;
                        }

                    } else if (entity instanceof EntityGrenade && ((EntityGrenade) entity).type.canBeDestructByAPS) {
                        EntityGrenade bullet = (EntityGrenade) entity;

                        if (bullet.thrower instanceof EntityPlayer && !bullet.thrower.isOnSameTeam(this.thrower)) {
                            bullet.setDead();
                            new FlansModExplosion(worldObj, this, (EntityPlayer) thrower, type, bullet.posX, bullet.posY, bullet.posZ,
                                    2, 1, false, false,
                                    1, 1, 1, 1, 0, 0);
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 30, dimension, type.shootSound, false);
                            FlansMod.getPacketHandler().sendTo(new PacketAPSMarker(), (EntityPlayerMP) bullet.thrower);
                            adsWorkTick = 1;
                        }
                    } else if (MCHeliUtil.isMCHRocket(entity) || MCHeliUtil.isMCHMissile(entity)) {
                        Entity player = (Entity) MCHeliUtil.getBulletShootingEntity_Unsafe(entity);
                        if (player instanceof EntityPlayer && !((EntityPlayer) player).isOnSameTeam(this.thrower)) {
                            entity.setDead();
                            new FlansModExplosion(worldObj, this, (EntityPlayer) thrower, type, entity.posX, entity.posY, entity.posZ,
                                    3, 1, false, false,
                                    1, 1, 1, 1, 0, 0);
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.shootSound, false);
                            FlansMod.getPacketHandler().sendTo(new PacketAPSMarker(), (EntityPlayerMP) player);
                            adsWorkTick = 1;
                        }
                    }
                }
            }
        }

        if (type.isAdvancedActiveDefence && !type.isActiveDefence
                && adsWorkTick < type.advancedActiveDefenceWorkTick
                && adsWorkTick >= 0
                && adsShootNum <= type.advancedActiveDefenceShootCount
                && ticksExisted > type.primeDelay) {

            if (!worldObj.isRemote) {
                List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(type.targetRange, type.targetRange, type.targetRange));
                for (Object obj : list) {

                    Entity entity = (Entity) obj;
                    if (entity instanceof EntityBullet && ((EntityBullet) entity).type.canBeDestructByAPS) {
                        EntityBullet bullet = (EntityBullet) entity;

                        if (bullet.owner instanceof EntityPlayer && !((EntityPlayer) bullet.owner).isOnSameTeam(this.thrower)) {
                            bullet.setDead();
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 30, dimension, type.shootSound, false);
                            FlansMod.getPacketHandler().sendTo(new PacketAPSMarker(), (EntityPlayerMP) bullet.owner);
                            adsWorking = true;
                            adsShootNum++;
                        }

                    } else if (entity instanceof EntityGrenade && ((EntityGrenade) entity).type.canBeDestructByAPS) {
                        EntityGrenade bullet = (EntityGrenade) entity;

                        if (bullet.thrower instanceof EntityPlayer && !bullet.thrower.isOnSameTeam(this.thrower)) {
                            bullet.setDead();
                            new FlansModExplosion(worldObj, this, (EntityPlayer) thrower, type, bullet.posX, bullet.posY, bullet.posZ,
                                    2, 1, false, false,
                                    1, 1, 1, 1, 0, 0);
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 30, dimension, type.shootSound, false);
                            FlansMod.getPacketHandler().sendTo(new PacketAPSMarker(), (EntityPlayerMP) bullet.thrower);
                            adsWorking = true;
                            adsShootNum++;
                        }
                    } else if (MCHeliUtil.isMCHRocket(entity) || MCHeliUtil.isMCHMissile(entity)) {
                        Entity player = (Entity) MCHeliUtil.getBulletShootingEntity_Unsafe(entity);
                        if (player instanceof EntityPlayer && !((EntityPlayer) player).isOnSameTeam(this.thrower)) {
                            entity.setDead();
                            new FlansModExplosion(worldObj, this, (EntityPlayer) thrower, type, entity.posX, entity.posY, entity.posZ,
                                    3, 1, false, false,
                                    1, 1, 1, 1, 0, 0);
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.shootSound, false);
                            FlansMod.getPacketHandler().sendTo(new PacketAPSMarker(), (EntityPlayerMP) player);
                            adsWorking = true;
                            adsShootNum++;
                        }
                    }
                }
            }

            if (adsWorking) {
                adsWorkTick++;
                if (adsWorkTick >= type.advancedActiveDefenceWorkTick) {
                    PacketPlaySound.sendSoundPacket(posX, posY, posZ, 30, dimension, type.offlineSound, false);
                    adsWorkTick = -1;
                    adsWorking = false;
                }
            }
        }


        /** 召唤炮击 */
        if (!worldObj.isRemote && type.enableCallArtillery && canCallArtillery && ticksExisted > type.artilleryStartTime) {
            ItemShootable itemShootable = (ItemShootable) GameRegistry.findItem(FlansMod.MODID, type.artilleryType);
            this.callArtillery(itemShootable);
            artilleryCalled = true;
        }

        //Quiet despawning
        if (type.despawnTime > 0 && ticksExisted > type.despawnTime) {
            detonated = true;
            setDead();
            return;
        }

        //Visuals
        if (worldObj.isRemote) {
            if (type.trailParticles) {
                double dX = (posX - prevPosX) / 10;
                double dY = (posY - prevPosY) / 10;
                double dZ = (posZ - prevPosZ) / 10;
                for (int i = 0; i < 10; i++) {
                    EntityFX particle = FlansModClient.getParticle(type.trailParticleType, worldObj, prevPosX + dX * i, prevPosY + dY * i, prevPosZ + dZ * i);
                    if (particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
                        particle.renderDistanceWeight = 256D;
                    //worldObj.spawnEntityInWorld(particle);
                }
            }


        }

        //Smoke
        if (smoking) {
            //Send flak packet to spawn particles
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.smokeParticleCount2, type.smokeParticleType, type.smokeTime, type.smokeRange, type.smokeHeight), posX, posY, posZ, 256, dimension);
            //
            List list = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, boundingBox.expand(type.smokeRadius, type.smokeRadius, type.smokeRadius));
            for (Object obj : list) {
                EntityLivingBase entity = ((EntityLivingBase) obj);
                if (entity.getDistanceToEntity(this) < type.smokeRadius) {
                    //Do some checks first
                    boolean smokeThem = true;
                    for (int i = 0; i < 5; i++) {
                        //If any currently equipped item has smoke protection (gas masks), stop the effects
                        ItemStack stack = entity.getEquipmentInSlot(i);
                        if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                            if (((ItemTeamArmour) stack.getItem()).type.smokeProtection)
                                smokeThem = false;
                        }
                    }

                    if (smokeThem)
                        for (PotionEffect effect : type.smokeEffects)
                            entity.addPotionEffect(new PotionEffect(effect));
                    if(type.isIncendiary) {
                        entity.setFire(2);
                    }
                }
            }

            smokeTime--;
            if (smokeTime == 0)
                setDead();
        }

        //Detonation conditions
        if (!worldObj.isRemote) {
            if (ticksExisted > type.fuse && type.fuse > 0)
                detonate();
            //If this grenade has a proximity trigger, check for living entities within it's range
            if (type.livingProximityTrigger > 0 || type.driveableProximityTrigger > 0) {
                float checkRadius = Math.max(type.livingProximityTrigger, type.driveableProximityTrigger);
                List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(checkRadius, checkRadius, checkRadius));
                for (Object obj : list) {
                    if (obj == thrower && ticksExisted < 10)
                        continue;

                    if (obj instanceof EntityLivingBase && getDistanceToEntity((Entity) obj) < type.livingProximityTrigger) {
                        //If we are in a gametype and both thrower and triggerer are playing, check for friendly fire
                        if (TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj instanceof EntityPlayerMP && thrower instanceof EntityPlayer) {
                            if (!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP) obj, new EntityDamageSourceFlans(type.shortName, this, thrower, type, false, false)))
                                continue;
                        }
                        if (type.damageToTriggerer > 0) {
                            ((EntityLivingBase) obj).attackEntityFrom(getGrenadeDamage(), type.damageToTriggerer);
                        }
                        if (type.bounceMine && type.bounceAfterTrigger) {
                            motionY += 0.5;
                            motionX += rand.nextGaussian() * 0.01;
                            motionZ += rand.nextGaussian() * 0.01;
                            startBounce = true;
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 8, dimension, type.bounceSound, true);
                        } else {
                            detonate();
                        }
                        break;
                    }
                    if ((obj instanceof EntityDriveable || MCHeliUtil.isMCHeliAircraft(obj)) && getDistanceToEntity((Entity) obj) < type.driveableProximityTrigger) {
                        if (type.damageToTriggerer > 0 && ticksExisted > type.primeDelay) {
                            ((Entity)obj).attackEntityFrom(getGrenadeDamage(), type.damageToTriggerer);
                        }
                        if (type.bounceMine && type.bounceAfterTrigger) {
                            motionY += 0.5;
                            motionX += rand.nextGaussian() * 0.01;
                            motionZ += rand.nextGaussian() * 0.01;
                            startBounce = true;
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 8, dimension, type.bounceSound, true);
                        } else {
                            detonate();
                        }
                        break;
                    }
                }
            }
        }

        //If the block we were stuck to is gone, unstick
        if (stuck && worldObj.isAirBlock(stuckToX, stuckToY, stuckToZ))
            stuck = false;

        //Physics and motion (Don't move if stuck)
        if (!stuck && !type.stickToThrower) {
            prevRotationYaw = axes.getYaw();
            prevRotationPitch = axes.getPitch();
            prevRotationRoll = axes.getRoll();
            if (angularVelocity.lengthSquared() > 0.00000001F)
                axes.rotateLocal(angularVelocity.length(), angularVelocity.normalise(null));

            Vector3f posVec = new Vector3f(posX, posY, posZ);
            Vector3f motVec = new Vector3f(motionX, motionY, motionZ);
            Vector3f nextPosVec = Vector3f.add(posVec, motVec, null);

            //Raytrace the motion of this grenade
            MovingObjectPosition hit = worldObj.rayTraceBlocks(posVec.toVec3(), nextPosVec.toVec3());
            //If we hit block
            if (hit != null && hit.typeOfHit == MovingObjectType.BLOCK && worldObj.getBlock(hit.blockX, hit.blockY, hit.blockZ).getMaterial().blocksMovement()) {
                //Get the blockID and block material
                Block block = worldObj.getBlock(hit.blockX, hit.blockY, hit.blockZ);
                Material mat = block.getMaterial();

                if (tickAfterFirstImpact == 0) tickAfterFirstImpact = 1;
                tickAfterOnGround++;

                //If this grenade detonates on impact, do so
                if (type.explodeOnImpact)
                    detonate();

                /** 允许召唤炮击 */
                if (!worldObj.isRemote && type.enableCallArtillery && !artilleryCalled) {
                    canCallArtillery = true;
                }

                //If we hit glass and can break it, do so
                else if (type.breaksGlass && mat == Material.glass && TeamsManager.canBreakGlass) {
                    worldObj.setBlockToAir(hit.blockX, hit.blockY, hit.blockZ);
                    FlansMod.proxy.playBlockBreakSound(hit.blockX, hit.blockY, hit.blockZ, block, this.dimension);
                }

                //If this grenade does not penetrate blocks, hit the block instead
                //The grenade cannot bounce if it detonated on impact, so hence the "else" condition
                else if (!type.penetratesBlocks) {
                    Vector3f hitVec = new Vector3f(hit.hitVec);
                    //Motion of the grenade pre-hit
                    Vector3f preHitMotVec = Vector3f.sub(hitVec, posVec, null);
                    //Motion of the grenade post-hit
                    Vector3f postHitMotVec = Vector3f.sub(motVec, preHitMotVec, null);

                    //Reflect postHitMotVec based on side hit
                    int sideHit = hit.sideHit;
                    switch (sideHit) {
                        case 0:
                        case 1:
                            postHitMotVec.setY(-postHitMotVec.getY());
                            break;
                        case 4:
                        case 5:
                            postHitMotVec.setX(-postHitMotVec.getX());
                            break;
                        case 2:
                        case 3:
                            postHitMotVec.setZ(-postHitMotVec.getZ());
                            break;
                    }

                    //Calculate the time interval spent post reflection
                    float lambda = Math.abs(motVec.lengthSquared()) < 0.00000001F ? 1F : postHitMotVec.length() / motVec.length();
                    //Scale the post hit motion by the bounciness of the grenade
                    postHitMotVec.scale(type.bounciness / 2);

                    //Move the grenade along the new path including reflection
                    posX += preHitMotVec.x + postHitMotVec.x;
                    posY += preHitMotVec.y + postHitMotVec.y;
                    posZ += preHitMotVec.z + postHitMotVec.z;

                    //Set the motion
                    motionX = postHitMotVec.x / lambda;
                    motionY = postHitMotVec.y / lambda;
                    motionZ = postHitMotVec.z / lambda;

                    //Reset the motion vector
                    motVec = new Vector3f(motionX, motionY, motionZ);

                    //Give it a random spin
                    float randomSpinner = 90F;
                    Vector3f.add(angularVelocity, new Vector3f(rand.nextGaussian() * randomSpinner, rand.nextGaussian() * randomSpinner, rand.nextGaussian() * randomSpinner), angularVelocity);
                    //Slow the spin based on the motion
                    angularVelocity.scale(motVec.lengthSquared());

                    //Play the bounce sound
                    if (motVec.lengthSquared() > 0.01D)
                        //playSound(type.bounceSound, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
                        PacketPlaySound.sendSoundPacket(posX, posY, posZ, 8, dimension, type.bounceSound, true);

                    //If this grenade is sticky, stick it to the block
                    if (type.sticky) {
                        //Move the grenade to the point of contact
                        posX = hitVec.x;
                        posY = hitVec.y;
                        posZ = hitVec.z;
                        //Stop all motion of the grenade
                        motionX = motionY = motionZ = 0;
                        angularVelocity.set(0F, 0F, 0F);

                        float yaw = axes.getYaw();

                        switch (hit.sideHit) {
                            case 0:
                                axes.setAngles(yaw, 180F, 0F);
                                break;
                            case 1:
                                axes.setAngles(yaw, 0F, 0F);
                                break;
                            case 2:
                                axes.setAngles(270F, 90F, 0F);
                                axes.rotateLocalYaw(yaw);
                                break;
                            case 3:
                                axes.setAngles(90F, 90F, 0F);
                                axes.rotateLocalYaw(yaw);
                                break;
                            case 4:
                                axes.setAngles(180F, 90F, 0F);
                                axes.rotateLocalYaw(yaw);
                                break;
                            case 5:
                                axes.setAngles(0F, 90F, 0F);
                                axes.rotateLocalYaw(yaw);
                                break;
                        }

                        //Set the stuck flag on
                        stuck = true;
                        stuckToX = hit.blockX;
                        stuckToY = hit.blockY;
                        stuckToZ = hit.blockZ;
                    }
                }
            }
            //We didn't hit a block, continue as normal
            else {
                posX += motionX;
                posY += motionY;
                posZ += motionZ;
                if (!startBounce) {
                    tickAfterOnGround = 0;
                } else {
                    tickAfterOnGround++;
                }
            }

            //Update the grenade position
            setPosition(posX, posY, posZ);
        }

		/*if(type.antiAirMine){
			Entity closestEntity = null;
			//double closestAngle;

			for(Object obj : worldObj.loadedEntityList)
			{
				Entity entity = (Entity)obj;
				Vector3f relPosVec = new Vector3f(entity.posX - posX, entity.posY - posY, entity.posZ - posZ);
				float angle = Math.abs(Vector3f.angle(new Vector3f(0,1,0), relPosVec));
				if(angle < Math.toRadians(type.antiAirMineAngle))
				{
					closestEntity = entity;
					//closestAngle = angle;
				}
			}
			if(closestEntity != null){
				//FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, true, 0, 90));
				worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(gunVec, new Vector3f((float)posX, (float)posY, (float)posZ), null), lookVector, (EntityLivingBase)seats[0].riddenByEntity, gunType.bulletSpread / 2, gunType.damage, 10.0F,bulletItemStack.getItemDamage(), type));
			}
		}*/

        if (tickAfterFirstImpact > 0) {
            tickAfterFirstImpact++;
        }

        if (type.bounceMine) {
            if (type.tickToExplodeAfterImpact == tickAfterOnGround) {
                detonate();
            }
        } else {
            if (type.tickToExplodeAfterImpact == tickAfterFirstImpact) {
                detonate();
            }
        }


        if (type.bounceMine && !type.bounceAfterTrigger && tickAfterOnGround == type.bounceDelay && !startBounce) {
            motionY += 0.5;
            motionX += rand.nextGaussian() * 0.01;
            motionZ += rand.nextGaussian() * 0.01;
            startBounce = true;
            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 8, dimension, type.bounceSound, true);
        }

        if (type.stickToThrower) {
            if (thrower == null || thrower.isDead)
                setDead();
            else setPosition(thrower.posX, thrower.posY, thrower.posZ);
        }

        if (type.stickToEntity) {
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
            float yaw = axes.getYaw();
            //Entity entity = null;

            if (stickedEntity == null && !stuck) {
                for (Object obj : list) {
                    if (obj instanceof Entity && obj != thrower && !(obj instanceof EntityGrenade)) {
                        //axes.setAngles(180F, 90F, 0F); axes.rotateLocalYaw(yaw);
                        stickedEntity = (Entity) obj;
                        break;
                    }
                }
            }

            if (stickedEntity != null) {
                this.setPosition(stickedEntity.posX, stickedEntity.posY, stickedEntity.posZ);
                if (stickedEntity.isDead)
                    this.setDead();
            }
        }


        if (type.stickToDriveable) {
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
            float yaw = axes.getYaw();
            //Entity entity = null;

            if (stickedEntity == null && !stuck) {
                for (Object obj : list) {
                    if (obj instanceof Entity && obj != thrower && !(obj instanceof EntityGrenade) && obj instanceof EntityDriveable) {
                        //axes.setAngles(180F, 90F, 0F); axes.rotateLocalYaw(yaw);
                        stickedEntity = (Entity) obj;
                        break;
                    }
                }
            }

            if (stickedEntity != null) {
                this.setPosition(stickedEntity.posX, stickedEntity.posY, stickedEntity.posZ);
                if (stickedEntity.isDead)
                    this.setDead();
            }
        }

        if (type.stickToEntityAfter) {
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
            float yaw = axes.getYaw();
            //Entity entity = null;

            if (stickedEntity == null) {
                for (Object obj : list) {
                    if (obj instanceof Entity && !(obj instanceof EntityGrenade) && obj != thrower) {
                        //axes.setAngles(180F, 90F, 0F); axes.rotateLocalYaw(yaw);
                        if (type.allowStickSound)
                            PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.stickSoundRange, dimension, type.stickSound, true);
                        stickedEntity = (Entity) obj;
                        break;
                    }
                }
            }

            if (stickedEntity != null) {
                this.setPosition(stickedEntity.posX, stickedEntity.posY, stickedEntity.posZ);
                if (stickedEntity.isDead)
                    this.setDead();
            }
        }

        //If throwing this grenade at an entity should hurt them, this bit checks for entities in the way and does so
        //(Don't attack entities when stuck to stuff)
        if ((type.damageVsLiving > 0 || type.damageVsPlayer > 0) && !stuck) {
            Vector3f motVec = new Vector3f(motionX, motionY, motionZ);
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
            for (Object obj : list) {
                if (obj == thrower && ticksExisted < 10 || motVec.lengthSquared() < 0.01D)
                    continue;
                if (obj instanceof EntityPlayer) {
                    ((EntityPlayer) obj).attackEntityFrom(getGrenadeDamage(), type.damageVsPlayer * motVec.lengthSquared() * 3);
                } else if (obj instanceof EntityLivingBase) {
                    ((EntityLivingBase) obj).attackEntityFrom(getGrenadeDamage(), type.damageVsLiving * motVec.lengthSquared() * 3);
                }
            }
        }

        //Apply gravity
        motionY -= 9.81D / 400D * type.fallSpeed;

        //Temporary fire glitch fix
        if (worldObj.isRemote)
            extinguish();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float f) {
        if (type.detonateWhenShot) {

            Entity sourceOfDamage = source.getSourceOfDamage();

            if (sourceOfDamage instanceof EntityBullet && ((EntityBullet) sourceOfDamage).type.isEOD) {
                if (!worldObj.isRemote) {
                    this.detonated = true;
                    this.setDead();
                    FlansMod.log("Grenade defused by EOD");
                    return true;
                }
            }

            detonate();
        }
        return type.detonateWhenShot;
    }

    private void callArtillery(ItemShootable itemShootable) {
        World world = worldObj;
        EntityLivingBase entityplayer = thrower;

        if (ticksExisted % type.artilleryDelay == 0 && artilleryCalledNum < type.artilleryNum) {
            float randomX = type.artillerySpread * (-1 + (2 * new Random().nextFloat()));
            float randomZ = type.artillerySpread * (-1 + (2 * new Random().nextFloat()));
            world.spawnEntityInWorld(itemShootable.getEntity(
                    world,
                    new Vector3f(this.posX + randomX, type.artilleryHeight, this.posZ + randomZ),
                    new Vector3f(0, -1, 0),
                    entityplayer,
                    type.artillerySpread,
                    1,
                    0,
                    0,
                    type));
            artilleryCalledNum++;
        }

        if (artilleryCalledNum >= type.artilleryNum) {
            canCallArtillery = false;
        }
    }


    public void detonate() {
        //Do not detonate before grenade is primed
        if (ticksExisted < type.primeDelay)
            return;

        //Stop repeat detonations
        if (detonated)
            return;
        detonated = true;

        //Play detonate sound
        PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.detonateSound, true);

        //Explode
        if (!worldObj.isRemote && type.explosionRadius > 0.1F) {
            if ((thrower instanceof EntityPlayer)) {
                new FlansModExplosion(worldObj, this, (EntityPlayer) thrower, type, posX, posY, posZ,
                        type.explosionRadius, type.explosionPower, TeamsManager.explosions, type.explosionBreaksBlocks,
                        type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);

            } else {
                worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks);
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
            int damage = 0;
            if (itemName.contains(".")) {
                damage = Integer.parseInt(itemName.split("\\.")[1]);
                itemName = itemName.split("\\.")[0];
            }
            ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
            entityDropItem(dropStack, 1.0F);
        }

        //Start smoke counter
        if (type.smokeTime > 0) {
            smoking = true;
            smokeTime = type.smokeTime;
        } else if (!worldObj.isRemote) {
            setDead();
        }

        if (type.flashBang && !this.worldObj.isRemote) {
            List list = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, boundingBox.expand(type.smokeRadius, type.smokeRadius, type.smokeRadius));
            EntityPlayer entityP;
            for (Object obj : list) {
                EntityLivingBase entity = ((EntityLivingBase) obj);
                if (entity.getDistanceToEntity(this) < type.flashRange && type.flashDamageEnable) {
                    if (type.flashEffects)
                        entity.addPotionEffect(new PotionEffect(type.flashEffectsID, type.flashEffectsDuration, type.flashEffectsLevel));
                    entity.attackEntityFrom(this.getGrenadeDamage(), type.flashDamage);
                    //entityP.worldObj.playSoundAtEntity((EntityPlayer)entity, "flansmod:FlashSound",1.0F,1.0F);
                }
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 50, type.smokeParticleType), posX, posY, posZ, 30, dimension);

            if (type.flashSoundEnable)
                PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.flashSoundRange, dimension, type.flashSound, true);
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlashBang(type.flashTime), posX, posY, posZ, type.flashRange, dimension);
            setDead();
        }
    }

    public boolean impactedBlock() {
        return tickAfterFirstImpact > 0;
    }

    @Override
    public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int i) {

    }

    private DamageSource getGrenadeDamage() {
        if (thrower instanceof EntityPlayer || thrower instanceof EntitySoldier)
            return (new EntityDamageSourceFlans(type.shortName, this, thrower, type, false, false)).setProjectile();
        else return (new EntityDamageSourceIndirect(type.shortName, this, thrower)).setProjectile();
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound tags) {
        type = GrenadeType.getGrenade(tags.getString("Type"));
        if (type == null) {
            FlansMod.log("EntityGrenade.readEntityFromNBT() Error: GrenadeType is null (" + this + ")");
            setDead();
            return;
        }

        thrower = worldObj.getPlayerEntityByName(tags.getString("Thrower"));
        rotationYaw = tags.getFloat("RotationYaw");
        rotationPitch = tags.getFloat("RotationPitch");
        axes.setAngles(rotationYaw, rotationPitch, 0F);
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound tags) {
        if (type == null) {
            FlansMod.log("EntityGrenade.writeEntityToNBT() Error: GrenadeType is null (" + this + ")");
            setDead();
            return;
        } else {
            tags.setString("Type", type.shortName);
            if (thrower != null)
                tags.setString("Thrower", thrower.getCommandSenderName());
            tags.setFloat("RotationYaw", axes.getYaw());
            tags.setFloat("RotationPitch", axes.getPitch());
        }
    }

    @Override
    public void writeSpawnData(ByteBuf data) {
        ByteBufUtils.writeUTF8String(data, type.shortName);
        data.writeInt(thrower == null ? 0 : thrower.getEntityId());
        data.writeFloat(axes.getYaw());
        data.writeFloat(axes.getPitch());
    }

    @Override
    public void readSpawnData(ByteBuf data) {
        type = GrenadeType.getGrenade(ByteBufUtils.readUTF8String(data));
        int entityID = data.readInt();
        Entity ent = worldObj.getEntityByID(entityID);
        if (ent instanceof EntityLivingBase) {
            thrower = (EntityLivingBase) ent;
        } else {
            FlansMod.log("Thrower is not an EntityLivingBase!");
            if (FlansMod.DEBUG) {
                FlansMod.log("Entity ID " + entityID);
            }
            thrower = null;
        }

        setRotation(data.readFloat(), data.readFloat());
        prevRotationYaw = rotationYaw;
        prevRotationPitch = rotationPitch;
        axes.setAngles(rotationYaw, rotationPitch, 0F);
        if (type.spinWhenThrown)
            angularVelocity = new Vector3f(0F, 0F, 10F);
    }

    @Override
    public boolean isBurning() {
        return false;
    }

    @Override
    public boolean canBeCollidedWith() {
        return !isDead && type.isDeployableBag;
    }

    @Override
    public boolean interactFirst(EntityPlayer player) {
        // Player right clicked on grenade
        //For deployable bags, give player rewards
        if (type.isDeployableBag && !worldObj.isRemote) {
            boolean used = false;
            //Handle healing
            if (type.healAmount > 0 && player.getHealth() < player.getMaxHealth()) {
                player.heal(type.healAmount);
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 5, "heart"), new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 50F));
                used = true;
            }
            //Handle potion effects
            for (PotionEffect effect : type.potionEffects) {
                player.addPotionEffect(new PotionEffect(effect));
                used = true;
            }
            //Handle ammo
            if (type.numClips > 0 && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                GunType gun = ((ItemGun) player.getCurrentEquippedItem().getItem()).type;
                if (gun.ammo.size() > 0 && gun.allowRearm) {
                    //TODO:傻逼猪仔
                    ShootableType bulletToGive;
                    if (gun.ResupplyType != null) {
                        bulletToGive = BulletType.getBullet(gun.ResupplyType);
                    } else {
                        bulletToGive = gun.ammo.get(0);
                    }
                    int numToGive = Math.min(bulletToGive.maxStackSize, type.numClips * gun.getNumAmmoItemsInGun(player.getCurrentEquippedItem()));
                    if (player.inventory.addItemStackToInventory(new ItemStack(bulletToGive.item, numToGive))) {
                        used = true;
                    }
                }
            }
            //If the bag is all used up, get rid of it
            if (used) {
                numUsesRemaining--;
                if (numUsesRemaining <= 0)
                    setDead();
            }
        }
        return true;
    }
}
