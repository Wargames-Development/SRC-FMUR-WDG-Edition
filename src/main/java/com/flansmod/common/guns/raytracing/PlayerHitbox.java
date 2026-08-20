package com.flansmod.common.guns.raytracing;

import com.flansmod.common.wgc.Integrations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.network.PacketZPlayerHitEffect;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class PlayerHitbox {
    private static final float RAY_EPSILON = 1.0E-7F;

    /**
     *
     */
    public EntityPlayer player;
    /**
     * The angles of this box
     */
    public RotatedAxes axes;
    /**
     * The origin of rotation for this box
     */
    public Vector3f rP;
    /**
     * The lower left corner of this box
     */
    public Vector3f o;
    /**
     * The dimensions of this box
     */
    public Vector3f d;

    /**
     * The velocity of this box, in world axes.
     */
    public Vector3f vel;

    /**
     * The type of hitbox
     */
    public EnumHitboxType type;

    public PlayerHitbox(EntityPlayer player, RotatedAxes axes, Vector3f rotationPoint, Vector3f origin, Vector3f dimensions, EnumHitboxType type) {
        this.player = player;
        this.axes = axes;
        this.o = origin;
        this.d = dimensions;
        this.type = type;
        this.rP = rotationPoint;
    }

    @SideOnly(Side.CLIENT)
    public void renderHitbox(World world, Vector3f pos) {

        //Vector3f boxOrigin = new Vector3f(pos.x + rP.x, pos.y + rP.y, pos.z + rP.z);
        //world.spawnEntityInWorld(new EntityDebugAABB(world, boxOrigin, d, 2, 1F, 1F, 0F, axes.getYaw(), axes.getPitch(), axes.getRoll(), o));
		/*    public PlayerHitbox(EntityPlayer player, RotatedAxes axes, Vector3f rotationPoint, Vector3f origin, Vector3f dimensions, EnumHitboxType type) {
        this.player = player;
        this.axes = axes;
        this.o = origin;
        this.d = dimensions;
        this.type = type;
        this.rP = rotationPoint;
    }
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				for(int k = 0; k < 3; k++)
				{
					Vector3f point = new Vector3f(o.x + d.x * i / 2, o.y + d.y * j / 2, o.z + d.z * k / 2);
					point = axes.findLocalVectorGlobally(point);
					world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(pos.x + rP.x + point.x, pos.y + rP.y + point.y, pos.z + rP.z + point.z), 1, 0F, 1F, 0F));
				}
		*/
    }

    public PlayerBulletHit raytrace(Vector3f origin, Vector3f motion) {
        return raytrace(origin, motion, 0.0F);
    }

    /**
     * Intersect a swept point / sphere with this oriented box. The previous
     * face-by-face implementation had no result when the ray began inside the
     * box, which made overlapping point-blank shots deterministic misses.
     */
    public PlayerBulletHit raytrace(Vector3f origin, Vector3f motion, float padding) {
        return raytrace(origin, motion, this.axes, this.rP, this.o, this.d, padding);
    }

    public PlayerBulletHit raytraceInterpolated(PlayerHitbox older, Vector3f origin, Vector3f motion,
                                                 float interpolation, float padding) {
        if (older == null || older.type != this.type) {
            return raytrace(origin, motion, padding);
        }

        float alpha = Math.max(0.0F, Math.min(1.0F, interpolation));
        RotatedAxes interpolatedAxes = new RotatedAxes(
                interpolateAngle(older.axes.getYaw(), this.axes.getYaw(), alpha),
                interpolateAngle(older.axes.getPitch(), this.axes.getPitch(), alpha),
                interpolateAngle(older.axes.getRoll(), this.axes.getRoll(), alpha));
        Vector3f interpolatedRotationPoint = interpolate(older.rP, this.rP, alpha);
        Vector3f interpolatedOrigin = interpolate(older.o, this.o, alpha);
        Vector3f interpolatedDimensions = interpolate(older.d, this.d, alpha);
        return raytrace(origin, motion, interpolatedAxes, interpolatedRotationPoint,
                interpolatedOrigin, interpolatedDimensions, padding);
    }

    private PlayerBulletHit raytrace(Vector3f origin, Vector3f motion, RotatedAxes boxAxes,
                                     Vector3f rotationPoint, Vector3f boxOrigin,
                                     Vector3f boxDimensions, float padding) {
        Vector3f localOrigin = boxAxes.findGlobalVectorLocally(Vector3f.sub(origin, rotationPoint, null));
        Vector3f localMotion = boxAxes.findGlobalVectorLocally(motion);
        float expansion = Math.max(0.0F, padding);

        float minX = Math.min(boxOrigin.x, boxOrigin.x + boxDimensions.x) - expansion;
        float maxX = Math.max(boxOrigin.x, boxOrigin.x + boxDimensions.x) + expansion;
        float minY = Math.min(boxOrigin.y, boxOrigin.y + boxDimensions.y) - expansion;
        float maxY = Math.max(boxOrigin.y, boxOrigin.y + boxDimensions.y) + expansion;
        float minZ = Math.min(boxOrigin.z, boxOrigin.z + boxDimensions.z) - expansion;
        float maxZ = Math.max(boxOrigin.z, boxOrigin.z + boxDimensions.z) + expansion;

        float entryTime = 0.0F;
        float exitTime = 1.0F;

        if (Math.abs(localMotion.x) <= RAY_EPSILON) {
            if (localOrigin.x < minX || localOrigin.x > maxX) return null;
        } else {
            float first = (minX - localOrigin.x) / localMotion.x;
            float second = (maxX - localOrigin.x) / localMotion.x;
            if (first > second) {
                float swap = first;
                first = second;
                second = swap;
            }
            entryTime = Math.max(entryTime, first);
            exitTime = Math.min(exitTime, second);
            if (entryTime > exitTime) return null;
        }

        if (Math.abs(localMotion.y) <= RAY_EPSILON) {
            if (localOrigin.y < minY || localOrigin.y > maxY) return null;
        } else {
            float first = (minY - localOrigin.y) / localMotion.y;
            float second = (maxY - localOrigin.y) / localMotion.y;
            if (first > second) {
                float swap = first;
                first = second;
                second = swap;
            }
            entryTime = Math.max(entryTime, first);
            exitTime = Math.min(exitTime, second);
            if (entryTime > exitTime) return null;
        }

        if (Math.abs(localMotion.z) <= RAY_EPSILON) {
            if (localOrigin.z < minZ || localOrigin.z > maxZ) return null;
        } else {
            float first = (minZ - localOrigin.z) / localMotion.z;
            float second = (maxZ - localOrigin.z) / localMotion.z;
            if (first > second) {
                float swap = first;
                first = second;
                second = swap;
            }
            entryTime = Math.max(entryTime, first);
            exitTime = Math.min(exitTime, second);
            if (entryTime > exitTime) return null;
        }

        return new PlayerBulletHit(this, entryTime);
    }

    private static Vector3f interpolate(Vector3f older, Vector3f newer, float alpha) {
        return new Vector3f(
                older.x + (newer.x - older.x) * alpha,
                older.y + (newer.y - older.y) * alpha,
                older.z + (newer.z - older.z) * alpha);
    }

    private static float interpolateAngle(float older, float newer, float alpha) {
        return older + MathHelper.wrapAngleTo180_float(newer - older) * alpha;
    }

    public float hitByBullet(EntityBullet bullet, float penetratingPower, double distanceDamageModifier) {
        if (bullet.type.setEntitiesOnFire)
            player.setFire(bullet.type.setEntitiesOnFireTime);
        for (PotionEffect effect : bullet.type.hitEffects) {
            player.addPotionEffect(new PotionEffect(effect));
        }

        float headPenRes = (player.getCurrentArmor(3) == null || !(player.getCurrentArmor(3).getItem()
                instanceof ItemTeamArmour)) ? 1F : ((ItemTeamArmour) player.getCurrentArmor(3).getItem())
                .type.penetrationResistance;
        float chestPenRes = (player.getCurrentArmor(2) == null || !(player.getCurrentArmor(2).getItem()
                instanceof ItemTeamArmour)) ? 1F : ((ItemTeamArmour) player.getCurrentArmor(2).getItem())
                .type.penetrationResistance;
        float legsPenRes = (player.getCurrentArmor(1) == null || !(player.getCurrentArmor(1).getItem()
                instanceof ItemTeamArmour)) ? 0.65F : ((ItemTeamArmour) player.getCurrentArmor(1).getItem())
                .type.penetrationResistance;
        float feetPenRes = (player.getCurrentArmor(0) == null || !(player.getCurrentArmor(0).getItem()
                instanceof ItemTeamArmour)) ? 0.35F : ((ItemTeamArmour) player.getCurrentArmor(0).getItem())
                .type.penetrationResistance;

        float totalPenetrationResistance = 0;

        if (type == EnumHitboxType.HEAD) {
            totalPenetrationResistance = headPenRes;
        } else if(type == EnumHitboxType.LEGS){
            totalPenetrationResistance = legsPenRes + feetPenRes;
        } else {
            totalPenetrationResistance = chestPenRes;
        }

        float damageModifier = 1;
        if (penetratingPower <= 0.7F * totalPenetrationResistance && FlansMod.useNewPenetrationSystem) {
            damageModifier = (float) Math.pow(penetratingPower / (0.7F * totalPenetrationResistance), 2.5);
        } else if (!FlansMod.useNewPenetrationSystem) {
            damageModifier = bullet.type.penetratingPower < 0.1F ? penetratingPower / bullet.type.penetratingPower : 1;
        }

        damageModifier *= distanceDamageModifier;

        bullet.lastHitPenAmount = Math.max(bullet.lastHitPenAmount, damageModifier);

        switch (type) {
            case HEAD:
                damageModifier *= bullet.type.shootHeadMultiplier;
                //bullet.lastHitHeadshot = true;
                break;
            case LEGS:
                damageModifier *= bullet.type.shootLegMultiplier;
                break;
            case LEFTARM:
                damageModifier *= bullet.type.shootArmMultiplier;
                break;
            case RIGHTARM:
                damageModifier *= bullet.type.shootArmMultiplier;
                break;
        }

        switch (type) {
            case LEGS:
            case BODY:
            case HEAD:
            case LEFTARM:
            case RIGHTARM: {
                //Calculate the hit damage
                float hitDamage = bullet.damage * bullet.type.damageVsPlayer * damageModifier;
                DamageSource damagesource = bullet.owner == null ? DamageSource.generic : bullet.getBulletDamage(type == EnumHitboxType.HEAD);
                boolean allowDamage = Integrations.canHarmPlayerWGC(bullet.owner, player, player.worldObj);

                if (allowDamage) {
                    if (!player.worldObj.isRemote && hitDamage == 0 && TeamsManager.getInstance().currentRound != null)
                        TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP) player, damagesource);

                    Vector3f motBefore = new Vector3f(player.motionX, player.motionY, player.motionZ);

                    if (player.attackEntityFrom(damagesource, hitDamage)) {
                        player.arrowHitTimer++;
                        player.hurtResistantTime = player.maxHurtResistantTime / 2;
                        if (!player.worldObj.isRemote && player instanceof EntityPlayerMP) {
                            FlansMod.getPacketHandler().sendTo(
                                    new PacketZPlayerHitEffect(), (EntityPlayerMP)player);
                        }
                    }

                    Vector3f motAfter = new Vector3f(player.motionX, player.motionY, player.motionZ);
                    Vector3f deltav = new Vector3f();
                    Vector3f.sub(motAfter, motBefore, deltav);
                    deltav.scale(1-bullet.type.knockbackModifier);
                    if (bullet.type.knockbackModifier > 2) {
                        deltav.y = (float) Math.sqrt(deltav.y);
                    }
                    player.motionX -= deltav.x;
                    player.motionY -= deltav.y;
                    player.motionZ -= deltav.z;
                }

                if (FlansMod.useNewPenetrationSystem) {
                    return penetratingPower - totalPenetrationResistance;
                } else {
                    return penetratingPower - 1;
                }
            }
            case RIGHTITEM: {
                ItemStack currentStack = player.getCurrentEquippedItem();
                if (currentStack != null && currentStack.getItem() instanceof ItemGun) {
                    GunType gunType = ((ItemGun) currentStack.getItem()).type;
                    //
                    return penetratingPower - gunType.shieldDamageAbsorption;
                } else return penetratingPower;
            }
            case LEFTITEM: {
                PlayerData data = PlayerHandler.getPlayerData(player);
                if (data.offHandGunSlot != 0) {
                    ItemStack leftHandStack = null;
                    if (player.worldObj.isRemote && !FlansMod.proxy.isThePlayer(player))
                        leftHandStack = data.offHandGunStack;
                    else leftHandStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);

                    if (leftHandStack != null && leftHandStack.getItem() instanceof ItemGun) {
                        GunType leftGunType = ((ItemGun) leftHandStack.getItem()).type;
                        //e
                        return penetratingPower - leftGunType.shieldDamageAbsorption;
                    }
                }
            }
            default:
                return penetratingPower;
        }
    }
}
