package com.flansmod.common.guns;

import com.flansmod.common.wgc.Integrations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.blocks.IBreakableBlock;
import com.flansmod.common.driveables.*;
import com.flansmod.common.hook.MCHeliUtil;
import com.flansmod.common.network.PacketExplosion;
import com.flansmod.common.network.PacketHitMarker;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.types.InfoType;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.*;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.*;

public class FlansModExplosion extends Explosion
{
	private final static int boomRadius = 16;
    private static final Random explosionRNG = new Random();
    private HashMap<EntityPlayer, Vec3> playerLocations = new HashMap<EntityPlayer, Vec3>();
    private World worldObj;
    public InfoType type;
    public EntityPlayer player;
	private float radius;
	private float power;
    private final float damageVsLiving;
    private final float damageVsPlayer;
    private final float damageVsPlane;
    private final float damageVsVehicle;
	//是否破坏常规方块
    public boolean breakBlocks;
	//是否破坏可破坏方块
	public boolean breakBreakableBlocks;
    public boolean canceled = false;

//	public FlansModExplosion(World w, Entity e, EntityPlayer p, InfoType t,
//							 double x, double y, double z, float explosionRadius, float explosionPower, boolean breakBlocks, boolean breakBreakableBlocks,
//							 float damageLiving, float damagePlayer, float damagePlane, float damageVehicle, int smokeCount, int debrisCount){
//		this(w, e,p,t, x, y, z, explosionRadius,explosionPower,breakBlocks,breakBreakableBlocks,damageLiving,damagePlayer,damagePlane,damageVehicle,smokeCount,debrisCount,null);
//	}

	public FlansModExplosion(World w, Entity e, EntityPlayer p, InfoType t,
			double x, double y, double z, float explosionRadius, float explosionPower, boolean breakBlocks, boolean breakBreakableBlocks,
			 float damageLiving, float damagePlayer, float damagePlane, float damageVehicle, int smokeCount, int debrisCount)
	{
		super(w, e, x, y, z, explosionRadius);
		this.radius = explosionRadius;
		power = explosionPower;
		worldObj = w;
		type = t;
		player = p;
        isFlaming = false;
        isSmoking = true;
        this.breakBlocks = FlansMod.explosionBlockDestructionEnabled && breakBlocks;
		this.breakBreakableBlocks = FlansMod.explosionBlockDestructionEnabled && breakBreakableBlocks;
        damageVsPlayer = damagePlayer;
        damageVsLiving  = damageLiving;
        damageVsPlane   = damagePlane;
        damageVsVehicle = damageVehicle;
        canceled = net.minecraftforge.event.ForgeEventFactory.onExplosionStart(worldObj, this);
        if (canceled) return;
        doExplosionA();
        doExplosionB(true);
        spawnParticle(smokeCount, debrisCount);

        
        if(!worldObj.isRemote)
        {
			PacketPlaySound.sendDistantExplosionSound(x, y, z, worldObj.provider.dimensionId,
					explosionRadius, FlansMod.soundRange);
            for (Object playerEntity : worldObj.playerEntities) {
            	if(playerEntity instanceof EntityPlayerMP)
            	{
            		EntityPlayerMP entityplayer = (EntityPlayerMP)playerEntity;
					if (entityplayer.getDistanceSq(x, y, z)
							< PacketParticle.EXPLOSION_EFFECT_RANGE * PacketParticle.EXPLOSION_EFFECT_RANGE)
            		{
						FlansMod.getPacketHandler().sendTo(new PacketExplosion(x, y, z, explosionRadius,
								this.breakBlocks, this.breakBreakableBlocks), entityplayer);
            		}
            	}
            }
        }
	}

	private Entity getWGCoreActingEntity() {
		return Integrations.resolveActingEntity(this.player, this.exploder);
	}

	private String getWGCoreExplosionTypeId() {
		return "fmur:explosion";
	}

	@Override
	public void doExplosionA()
	{
		Integrations.prepareExplosionWGC(this, radius * power, breakBlocks || breakBreakableBlocks);
		float f = explosionSize;
		HashSet hashset = new HashSet();
		double d0;
		double d1;
		double d2;

		float largeRadius = radius * 2;

		for(int i = 0; i < largeRadius; ++i)
		{
			for(int j = 0; j < largeRadius; ++j)
			{
				for(int k = 0; k < largeRadius; ++k)
				{
					if(i == 0 || i == largeRadius - 1 || j == 0 || j == largeRadius - 1 || k == 0 || k == largeRadius - 1)
					{
						double d3 = (i / (largeRadius - 1.0F) * 2.0F - 1.0F);
						double d4 = (j / (largeRadius - 1.0F) * 2.0F - 1.0F);
						double d5 = (k / (largeRadius - 1.0F) * 2.0F - 1.0F);
						double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
						d3 /= d6;
						d4 /= d6;
						d5 /= d6;
						float f1 = power * radius * (0.7F + worldObj.rand.nextFloat() * 0.6F);
						d0 = explosionX;
						d1 = explosionY;
						d2 = explosionZ;

						for (float f2 = 0.3F; f1 > 0.0F; f1 -= f2 * 0.75F)
						{
							int l = MathHelper.floor_double(d0);
							int i1 = MathHelper.floor_double(d1);
							int j1 = MathHelper.floor_double(d2);
							Block block = worldObj.getBlock(l, i1, j1);
							float incomingPower = f1;

							float f3 = exploder != null ? exploder.func_145772_a(this, worldObj, l, i1, j1, block) : block.getExplosionResistance(exploder, worldObj, l, i1, j1, explosionX, explosionY, explosionZ);
							double distFactor = Math.sqrt(Math.pow(d0 - explosionX, 2) + Math.pow(d1 - explosionY, 2) + Math.pow(d2 - explosionZ, 2));
							if (distFactor + 0.5 < radius) {
								f1 -= ((f3 + 0.3F) * f2);
							} else {
								f1 -= (f3 + 0.3F) * f2 * Math.pow((distFactor - radius + 2), 3) * 20;
							}

							if (f1 <= 0F && incomingPower > 0F && Integrations.isWGCoreIntegrationEnabled()
									&& block.getMaterial() != net.minecraft.block.material.Material.air
									&& (breakBlocks && breakBreakableBlocks || !breakBlocks && breakBreakableBlocks
									&& block instanceof IBreakableBlock && ((IBreakableBlock)block).canBreakableByExplosion())
									&& (exploder == null || exploder.func_145774_a(this,worldObj,l,i1,j1,block,incomingPower))) {
								hashset.add(new ChunkPosition(l,i1,j1));
							}
							if (f1 > 0.0F && (exploder == null || exploder.func_145774_a(this, worldObj, l, i1, j1, block, f1)))
							{
								if(breakBlocks && breakBreakableBlocks) {
									hashset.add(new ChunkPosition(l, i1, j1));
								}
								else if(!breakBlocks && breakBreakableBlocks) {
									if(block instanceof IBreakableBlock && ((IBreakableBlock) block).canBreakableByExplosion()) {
										hashset.add(new ChunkPosition(l, i1, j1));
									}
								}
							}

							d0 += d3 * f2;
							d1 += d4 * f2;
							d2 += d5 * f2;
						}
					}
				}
			}
		}

		Integrations.ExplosionResult wgcoreExplosionDecision = Integrations.evaluateExplosionWGC(
				this.worldObj,
				getWGCoreActingEntity(),
				this,
				this.explosionX,
				this.explosionY,
				this.explosionZ,
				getWGCoreExplosionTypeId(),
				new ArrayList<ChunkPosition>(hashset)
		);

		if(!canceled) {
			affectedBlockPositions.addAll(hashset);
		}

		final boolean allowExplosionEntityDamage = wgcoreExplosionDecision != null
				&& wgcoreExplosionDecision.isExplosionAllowed()
				&& wgcoreExplosionDecision.isEntityDamageAllowed();

		if (wgcoreExplosionDecision == null || !wgcoreExplosionDecision.isExplosionAllowed()) {
			affectedBlockPositions.clear();
		} else if (!wgcoreExplosionDecision.isBlockDamageAllowed()) {
			affectedBlockPositions.clear();
		} else if (wgcoreExplosionDecision.isFiltered()) {
			affectedBlockPositions.clear();
			affectedBlockPositions.addAll(wgcoreExplosionDecision.getFilteredAffectedBlocks());
		}

		explosionSize *= 2.0F;
		int i = MathHelper.floor_double(explosionX - explosionSize - 1.0D);
		int j = MathHelper.floor_double(explosionX + explosionSize + 1.0D);
		int k = MathHelper.floor_double(explosionY - explosionSize - 1.0D);
		int l1 = MathHelper.floor_double(explosionY + explosionSize + 1.0D);
		int i2 = MathHelper.floor_double(explosionZ - explosionSize - 1.0D);
		int j2 = MathHelper.floor_double(explosionZ + explosionSize + 1.0D);
		List<Entity> list = worldObj.getEntitiesWithinAABBExcludingEntity(exploder, AxisAlignedBB.getBoundingBox(i, k, i2, j, l1, j2));
		Entity actingEntity = getWGCoreActingEntity();
		boolean checkPlayerCombat = player != null && type != null && !list.isEmpty()
				&& Integrations.isWGCoreIntegrationEnabled() && wgcoreExplosionDecision != null
				&& Integrations.isExplosionDamageAllowedAtWGC(worldObj, actingEntity,
						explosionX, explosionY, explosionZ, getWGCoreExplosionTypeId());
		Set<Entity> playerCombatTargets = checkPlayerCombat ? new LinkedHashSet<>() : Collections.emptySet();
		if (checkPlayerCombat) {
			for (Iterator<Entity> it = list.iterator(); it.hasNext();) {
				Entity entity = it.next();
				if (entity instanceof EntityPlayer && entity.getDistance(explosionX, explosionY, explosionZ) <= explosionSize
						&& Integrations.canHarmPlayerWGC(actingEntity, entity, worldObj)) {
					playerCombatTargets.add(entity);
					it.remove();
				}
			}
		}
		// WGCore's detonation listener applies block-explosion rules to players.
		// Resolve approved player splash through the PvP damage events instead.
		net.minecraftforge.event.ForgeEventFactory.onExplosionDetonate(this.worldObj, this, list, this.explosionSize);
		list.addAll(playerCombatTargets);
		Vec3 vec3 = Vec3.createVectorHelper(explosionX, explosionY, explosionZ);

		DamageSource blastDamage = player == null || type == null ? DamageSource.setExplosionSource(this)
				: new EntityDamageSourceFlans(type.shortName, exploder, player, type, false, false, true);

		for (Entity entity : list) {
			double d7 = entity.getDistance(explosionX, explosionY, explosionZ) / explosionSize;

			if (d7 <= 1.0D) {
				boolean playerCombat = playerCombatTargets.contains(entity);
				if (!playerCombat && (!allowExplosionEntityDamage
						|| !Integrations.canHarmPlayerWGC(actingEntity, entity, worldObj))) {
					continue;
				}

				d0 = entity.posX - explosionX;
				d1 = entity.posY + entity.getEyeHeight() - explosionY;
				d2 = entity.posZ - explosionZ;
				// A charge can be attached at the exact vehicle origin and still deal damage.
				double d8 = Math.max(1.0E-7D, MathHelper.sqrt_double(d0 * d0 + d1 * d1 + d2 * d2));

				if (d8 != 0.0D) {
					d0 /= d8;
					d1 /= d8;
					d2 /= d8;
					double d9 = getBlockDensity(vec3, entity.boundingBox);
					double d10 = (1.0D - d7) * d9;

					EntityDriveable entityDriveable = null;
					float damage = (float)((d10 * d10 + d10) / 2.0D * 8.0D * explosionSize + 1.0D);
					if(entity instanceof EntityPlayer)      damage *= damageVsPlayer;
					else if(entity instanceof EntityLivingBase) damage *= damageVsLiving;
					else if(entity instanceof EntityPlane)      damage *= damageVsPlane;
					else if(entity instanceof EntityVehicle || MCHeliUtil.isMCHeliAircraft(entity))    damage *= damageVsVehicle;
					else if(entity instanceof EntityWheel)
					{
						entityDriveable = ((EntityWheel) entity).vehicle;
					}
					else if(entity instanceof EntitySeat)
					{
						entityDriveable = ((EntitySeat) entity).driveable;
					}

					if(entityDriveable instanceof EntityPlane)      damage *= damageVsPlane;
					if(entityDriveable instanceof EntityVehicle)    damage *= damageVsVehicle;

					if( damage > 0.5F)
					{
						boolean selfBlast = entity == player && type != null && !player.canAttackPlayer(player);
						DamageSource source = playerCombat || selfBlast
								? EntityDamageSourceFlans.playerBlast(exploder, player, type, playerCombat, selfBlast)
								: blastDamage;
						boolean damaged = entity.attackEntityFrom(source, damage);
						if (damaged && !worldObj.isRemote && player instanceof EntityPlayerMP)
						{
							FlansMod.getPacketHandler().sendTo(new PacketHitMarker(false, 1F, true), (EntityPlayerMP) player);
						}
						double d11 = EnchantmentProtection.func_92092_a(entity, d10);
						entity.motionX += d0 * d11;
						entity.motionY += d1 * d11;
						entity.motionZ += d2 * d11;
						if (d11 > 0D)
							entity.velocityChanged = true;
						if (entity instanceof EntityPlayer)
							playerLocations.put((EntityPlayer) entity, Vec3.createVectorHelper(d0 * d10, d1 * d10, d2 * d10));
					}
				}
			}
		}
		explosionSize = f;
	}

	public void spawnParticle(int numSmoke, int numDebris)
	{
        float mod = radius*0.1F;

		for(int smoke = 0; smoke < numSmoke; smoke++)
		{
			float smokeRand = (float)Math.random();

			if(smokeRand < 0.25)
			{
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare",explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			} else if (smokeRand > 0.25 && smokeRand < 0.5){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			} else if (smokeRand > 0.5 && smokeRand < 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			} else if (smokeRand > 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			}

		}

		for(int debris = 0; debris < numDebris; debris++)
		{

			float smokeRand = (float)Math.random();

			if(smokeRand < 0.25)
			{
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			} else if (smokeRand > 0.25 && smokeRand < 0.5){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			} else if (smokeRand > 0.5 && smokeRand < 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			} else if (smokeRand > 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			}
    	}
	}

	public float getBlockDensity(Vec3 p_72842_1_, AxisAlignedBB p_72842_2_)
	{
		double d0 = 1.0D / ((p_72842_2_.maxX - p_72842_2_.minX) * 2.0D + 1.0D);
		double d1 = 1.0D / ((p_72842_2_.maxY - p_72842_2_.minY) * 2.0D + 1.0D);
		double d2 = 1.0D / ((p_72842_2_.maxZ - p_72842_2_.minZ) * 2.0D + 1.0D);

		if(d0 >= 0.0D && d1 >= 0.0D && d2 >= 0.0D)
		{
			int i = 0;
			int j = 0;

			for (float f = 0.0F; f <= 1.0F; f = (float) ((double) f + d0))
			{
				for (float f1 = 0.0F; f1 <= 1.0F; f1 = (float) ((double) f1 + d1))
				{
					for (float f2 = 0.0F; f2 <= 1.0F; f2 = (float) ((double) f2 + d2))
					{
						double d3 = p_72842_2_.minX + (p_72842_2_.maxX - p_72842_2_.minX) * (double) f;
						double d4 = p_72842_2_.minY + (p_72842_2_.maxY - p_72842_2_.minY) * (double) f1;
						double d5 = p_72842_2_.minZ + (p_72842_2_.maxZ - p_72842_2_.minZ) * (double) f2;

						if(this.worldObj.func_147447_a(Vec3.createVectorHelper(d3, d4, d5), p_72842_1_, false, true, false) == null)
						{
							++i;
						}

						++j;
					}
				}
			}

			return (float) i / (float) j;
		}
		else
		{
			return 0.0F;
		}
	}

	// [IMPORTANT] To get cauldron to fire the bukkit explosion events for plugins like worldguard, this cannot be overridden - it will negate
	// the effects of the patch cauldron uses to add the bukkit events.

    /**
     * Does the second part of the explosion (sound, particles, drop spawn)
     */
    // @Override
	// public void doExplosionB(boolean par1)
    // {
    //     worldObj.playSoundEffect(explosionX, explosionY, explosionZ, "random.explode", 4.0F, (1.0F + (worldObj.rand.nextFloat() - worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

    //     Iterator iterator;
    //     ChunkPosition chunkposition;
    //     int i;
    //     int j;
    //     int k;
    //     Block block;

    //     if (!worldObj.isRemote && breakBlocks && !canceled)
    //     {
    //         iterator = affectedBlockPositions.iterator();

    //         while (iterator.hasNext())
    //         {
    //             chunkposition = (ChunkPosition)iterator.next();
    //             i = chunkposition.chunkPosX;
    //             j = chunkposition.chunkPosY;
    //             k = chunkposition.chunkPosZ;
    //             block = worldObj.getBlock(i, j, k);

    //             if (block.getMaterial() != Material.air)
    //             {
    //                 if (block.canDropFromExplosion(this))
    //                 {
    //                     block.dropBlockAsItemWithChance(worldObj, i, j, k, worldObj.getBlockMetadata(i, j, k), 1.0F / explosionSize, 0);
    //                 }

    //                 block.onBlockExploded(worldObj, i, j, k, this);
    //             }
    //         }
    //     }

    //     if (!worldObj.isRemote && isFlaming)
    //     {
    //         iterator = affectedBlockPositions.iterator();

    //         while (iterator.hasNext())
    //         {
    //             chunkposition = (ChunkPosition)iterator.next();
    //             i = chunkposition.chunkPosX;
    //             j = chunkposition.chunkPosY;
    //             k = chunkposition.chunkPosZ;
    //             block = worldObj.getBlock(i, j, k);
    //             Block blockBelow = worldObj.getBlock(i, j - 1, k);

    //             if (block == null && blockBelow.isOpaqueCube() && explosionRNG.nextInt(3) == 0)
    //             {
    //                 worldObj.setBlock(i, j, k, Blocks.fire);
    //             }
    //         }
    //     }
    // }

    @Override
	public Map func_77277_b()
    {
        return playerLocations;
    }

    @Override
    public EntityLivingBase getExplosivePlacedBy()
    {
        return player == null ? super.getExplosivePlacedBy() : player;
    }

	public static void clientExplosion(World worldObj, float explosionSize,
			double explosionX, double explosionY, double explosionZ, boolean breakBlocks, boolean breakBreakableBlocks)
	{
		List affectedBlockPositions = new ArrayList();
		if(explosionSize < 2)
		{
			explosionX += explosionRNG.nextFloat() - 0.5F;
			explosionZ += explosionRNG.nextFloat() - 0.5F;
		}

		boolean isSmoking = true;

		//	doExplosionA
		{
			HashSet hashset = new HashSet();
			int i;
			int j;
			int k;
			double d5;
			double d6;
			double d7;

			for (i = 0; i < boomRadius; ++i)
			{
				for (j = 0; j < boomRadius; ++j)
				{
					for (k = 0; k < boomRadius; ++k)
					{
						if (i == 0 || i == boomRadius - 1 || j == 0 || j == boomRadius - 1 || k == 0 || k == boomRadius - 1)
						{
							double d0 = (double)((float)i / ((float)boomRadius - 1.0F) * 2.0F - 1.0F);
							double d1 = (double)((float)j / ((float)boomRadius - 1.0F) * 2.0F - 1.0F);
							double d2 = (double)((float)k / ((float)boomRadius - 1.0F) * 2.0F - 1.0F);
							double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
							d0 /= d3;
							d1 /= d3;
							d2 /= d3;
							float f1 = explosionSize * (0.7F + worldObj.rand.nextFloat() * 0.6F);
							d5 = explosionX;
							d6 = explosionY;
							d7 = explosionZ;

							for (float f2 = 0.3F; f1 > 0.0F; f1 -= f2 * 0.75F)
							{
								int j1 = MathHelper.floor_double(d5);
								int k1 = MathHelper.floor_double(d6);
								int l1 = MathHelper.floor_double(d7);
								Block block = worldObj.getBlock(j1, k1, l1);

//								if (block.getMaterial() != Material.air)
								{
									f1 -= 0.3F * f2;
								}

								if (f1 > 0.0F)
								{

									if(breakBlocks && breakBreakableBlocks) {
										hashset.add(new ChunkPosition(j1, k1, l1));
									} else if(!breakBlocks && breakBreakableBlocks) {
										if(block instanceof IBreakableBlock && ((IBreakableBlock) block).canBreakableByExplosion()) {
											hashset.add(new ChunkPosition(j1, k1, l1));
										}
									}

								}

								d5 += d0 * (double)f2;
								d6 += d1 * (double)f2;
								d7 += d2 * (double)f2;
							}
						}
					}
				}
			}

			affectedBlockPositions.addAll(hashset);
		}
		//	doExplosionB
		{
//			worldObj.playSoundEffect(explosionX, explosionY, explosionZ, "random.explode", 4.0F, (1.0F + (worldObj.rand.nextFloat() - worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

			if (explosionSize >= 2.0F && isSmoking)
			{
				worldObj.spawnParticle("hugeexplosion", explosionX, explosionY, explosionZ, 1.0D, 0.0D, 0.0D);
			}
			else
			{
				worldObj.spawnParticle("largeexplode", explosionX, explosionY, explosionZ, 1.0D, 0.0D, 0.0D);
			}

			Iterator iterator = affectedBlockPositions.iterator();

			int cnt = 0;
			while (iterator.hasNext())
			{
				cnt++;

				ChunkPosition chunkposition = (ChunkPosition)iterator.next();
				int i = chunkposition.chunkPosX;
				int j = chunkposition.chunkPosY;
				int k = chunkposition.chunkPosZ;
				Block block = worldObj.getBlock(i, j, k);

				double d0 = (double)((float)i + worldObj.rand.nextFloat());
				double d1 = (double)((float)j + worldObj.rand.nextFloat());
				double d2 = (double)((float)k + worldObj.rand.nextFloat());
				double d3 = d0 - explosionX;
				double d4 = d1 - explosionY;
				double d5 = d2 - explosionZ;
				double d6 = (double)MathHelper.sqrt_double(d3 * d3 + d4 * d4 + d5 * d5);
				d3 /= d6;
				d4 /= d6;
				d5 /= d6;
				double d7 = 0.5D / (d6 / (double)explosionSize + 0.1D);
				d7 *= (double)(worldObj.rand.nextFloat() * worldObj.rand.nextFloat() + 0.3F);
				d3 *= d7;
				d4 *= d7;
				d5 *= d7;

				/*
				if(false)
				{
					FlansMod.proxy.spawnParticle("explode", (d0 + explosionX * 1.0D) / 2.0D, (d1 + explosionY * 1.0D) / 2.0D, (d2 + explosionZ * 1.0D) / 2.0D, d3, d4, d5);
					FlansMod.proxy.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);
				}
				else
				*/
				{
					if((explosionSize<=1 && cnt % 4==0) || explosionSize>1)
					{
						FlansMod.proxy.spawnParticle("explode", (d0 + explosionX * 1.0D) / 2.0D, (d1 + explosionY * 1.0D) / 2.0D, (d2 + explosionZ * 1.0D) / 2.0D, d3, d4, d5);
					}
	//				FlansMod.proxy.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);


					block = Blocks.air;
					if(explosionSize <= 2)
					{
						if(cnt % 8==0)
						{
							block = getNearBlock(worldObj, i, j, k);
						}
					}
					else
					{
						block = getNearBlock(worldObj, i, j, k);
					}

					if(block != Blocks.air)
					{
						float m = explosionSize;
						if(m <= 1)
						{
							m *= 2;
						}
						else
						{
							m *= 0.5F;
						}
						final String pname = "blockdust_" + Block.getIdFromBlock(block) + "_" + worldObj.getBlockMetadata(i, j, k);
						FlansMod.proxy.spawnParticle(pname,
								(d0 + explosionX * 1.0D) / 2.0D,
								(d1 + explosionY * 1.5D) / 2.0D,
								(d2 + explosionZ * 1.0D) / 2.0D,
								d3 * m,
								d4 * m,
								d5 * m);
					}
				}
			}
		}
	}
	public static Block getNearBlock(World w, int x, int y, int z)
	{
		final int[][] offset = new int[][]
		{
				{ 0,-1, 0},
				{ 1, 0, 0},
				{-1, 0, 0},
				{ 0, 0, 1},
				{ 0, 0,-1},
		};
		for(int i=0; i<offset.length; i++)
		{
			if(y > 1 || offset[i][1]==0)
			{
				Block block = w.getBlock(x + offset[i][0], y + offset[i][1], z + offset[i][2]);
				if(block != Blocks.air)
				{
					return block;
				}
			}
		}
		return Blocks.air;
	}
}
