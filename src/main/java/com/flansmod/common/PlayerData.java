package com.flansmod.common;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.item.ItemGrenade;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.guns.type.GrenadeType;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.network.PacketSelectOffHandGun;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class PlayerData {
	private static final String RELOAD_ID_TAG = "FMURReloadId";
	/**
	 * Their username
	 */
	public String username;

	//Movement related fields
	/**
	 * Roll variables
	 */
	public float prevRotationRoll, rotationRoll;
	/**
	 * Snapshots for bullet hit detection. Array size is set to number of snapshots required. When a new one is taken,
	 * each snapshot is moved along one place and new one is added at the start, so that when the array fills up, the oldest one is lost
	 */
	public PlayerSnapshot[] snapshots;
	public float sprintProgress = 0F, lastSprintProgress = 0F;

	//Gun related fields
	/**
     * 用于存储玩家的副手（off-hand）槽位中的武器物品的槽位编号,为0即为无副手
     */
	public int offHandGunSlot = 0;
	/**
	 * The off hand gun stack. For viewing other player's off hand weapons only (since you don't know what is in their inventory and hence just the ID is insufficient)
	 */
	@SideOnly(Side.CLIENT)
	public ItemStack offHandGunStack;
	/**
	 * The MG this player is using
	 */
	public EntityMG mountingGun;
	/** Tickers to stop shooting too fast */
	public float shootTimeRight, shootTimeLeft;
	private ItemStack pendingGrenade;
	private int grenadeReleaseTicks, grenadeSlot, grenadeDimension;
	/** Stops player shooting immediately after swapping weapons */
	public int shootClickDelay;
	/** True if this player is shooting */
	public boolean isShootingRight, isShootingLeft;
	/** Server-owned player state used to select hip-fire or ADS spread. */
	public boolean isScoped;
	private final AtomicInteger pendingAirburstSlot = new AtomicInteger(-1);
	private int airburstProgramCooldown;
	/** Latest finite client camera aim accepted by the server for gunfire. */
	public float shotYaw, shotPitch;
	public boolean hasShotAim;
	/** Client-side sequence source for gun-fire intent packets. */
	public int nextGunFireIntentSequence;
	/** Latest validated client fire-intent context, retained server-side for the next authoritative shot. */
	public int shotIntentSequence, shotClientTick;
	public double shotClientPosX, shotClientPosY, shotClientPosZ;
	public long shotIntentReceivedNanos;
	public double shotIntentServerPosX, shotIntentServerEyeY, shotIntentServerPosZ;
	public boolean shotIntentLeft, shotIntentHeld, shotIntentServerScoped, hasShotContext;
	/** Server-owned monotonically increasing identifier for authoritative gun shots. */
	public long nextServerShotId;
    /** Cosmetic observation of actual server projectile construction, per hand. */
    public int presentationShotRightAge=Integer.MIN_VALUE,presentationShotLeftAge=Integer.MIN_VALUE;
    public com.flansmod.common.playerlod.PlayerVisualPose presentationPose() {
        ReloadState right=reloadRight,left=reloadLeft;
        boolean r=right!=null && isReloading(right,right.gunStack),l=left!=null && isReloading(left,left.gunStack);
        return new com.flansmod.common.playerlod.PlayerVisualPose(presentationShotRightAge,presentationShotLeftAge,
            r?right.totalTime:0,r?Math.max(0,right.timeLeft):0,r?Math.min(4096,right.shellsToLoad):0,
            l?left.totalTime:0,l?Math.max(0,left.timeLeft):0,l?Math.min(4096,left.shellsToLoad):0,
            Math.max(0,Math.min(1000000,minigunSpeed)),isScoped);
    }
	/** The speed of the minigun the player is using */
	public float minigunSpeed = 0F;
	/** Server-side limiter for the two legitimate hand updates accepted each tick. */
	public long minigunPacketTick = Long.MIN_VALUE;
	public int minigunPacketsThisTick;
	/** Reloading booleans */
	public boolean reloadingRight, reloadingLeft;
	/** Reload state is attached to the gun stack and the hand that started it. */
	private volatile ReloadState reloadRight, reloadLeft;
	private final AtomicReferenceArray<PacketReload> pendingReloads = new AtomicReferenceArray<>(2);
	/** When remote explosives are thrown they are added to this list. When the player uses a remote, the first one from this list detonates */
	public ArrayList<EntityGrenade> remoteExplosives = new ArrayList<>();
	public Set<EntityBullet> playerControlledBullets = new HashSet<>();
	/** Sound delay parameters */
	public int loopedSoundDelay;
	/** Sound delay parameters */
	public boolean shouldPlayCooldownSound, shouldPlayWarmupSound;
	/** Melee weapon custom hit simulation */
	public int meleeProgress, meleeLength;
	/** When the player shoots a burst fire weapon, one shot is fired immediately and this counter keeps track of how many more should be fired */
	public int burstRoundsRemainingLeft = 0, burstRoundsRemainingRight = 0;
	public Vector3f[] lastMeleePositions;

	//Teams related fields
	/** Gametype variables */
	public int score, kills, deaths;
	/** Zombies variables */
	public int zombieScore;
	/** Gametype variable for Nerf */
	public boolean out;
	/** The player's vote for the next round from 1 ~ 5. 0 is not yet voted */
	public int vote;
	/**
	 * The team this player is currently on
	 */
	public Team team;
	/**
	 * The team this player will switch to upon respawning
	 */
	public Team newTeam;
	/**
	 * The class the player is currently using
	 */
	public PlayerClass playerClass;
	/**
	 * The class the player will switch to upon respawning
	 */
	public PlayerClass newPlayerClass;
	/**
	 * Keeps the player out of having to rechose their team each round
	 */
	public boolean builder;
	/**
	 * e.e
	 */
	public boolean playerMovedByAutobalancer = false;
	/**
	 * Save the player's skin here, to replace after having done a swap for a certain class override
	 */
	@SideOnly(Side.CLIENT)
	public ResourceLocation skin;

	public PlayerData(String name) {
		username = name;
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
	}

	public void tick(EntityPlayer player) {
		if (player.worldObj.isRemote)
			clientTick(player);
		if (shootTimeRight > 0)
			shootTimeRight--;

		if (shootTimeLeft > 0)
			shootTimeLeft--;
		if (!player.worldObj.isRemote)
			tickGrenadeThrow(player);

		if (!player.worldObj.isRemote) {
			for (ItemStack inventoryStack : player.inventory.mainInventory)
				ItemGun.tickHeat(inventoryStack, player);
		}

		ItemStack rightGun = player.getCurrentEquippedItem();
		ItemStack leftGun = null;
		boolean offHandActive = rightGun != null
				&& rightGun.getItem() instanceof ItemGun
				&& ((ItemGun) rightGun.getItem()).type.getOneHanded();
		if (offHandActive && offHandGunSlot > 0 && offHandGunSlot <= player.inventory.getSizeInventory())
			leftGun = player.inventory.getStackInSlot(offHandGunSlot - 1);
		if (leftGun == rightGun)
			leftGun = null;

		tickReload(player, rightGun, false);
		tickReload(player, leftGun, true);

		if (player instanceof EntityPlayerMP) {
			// Coalesce repeated input per hand and validate it on the inventory tick.
			for (int hand = 0; hand < 2; hand++) {
				PacketReload request = pendingReloads.getAndSet(hand, null);
				if (request != null)
					request.applyReloadIntent((EntityPlayerMP) player, this);
			}
		}
		reloadingRight = isReloading(rightGun, false);
		reloadingLeft = isReloading(leftGun, true);

		if (!player.worldObj.isRemote)
			tickAirburstProgram(player, rightGun);

		if(shootClickDelay > 0)
			shootClickDelay--;

//		if(isShootingRight && !reloadingRight)
//			minigunSpeed += 2F;
//		minigunSpeed *= 0.9F;
//
		//Handle minigun speed
		if(loopedSoundDelay > 0) {
			loopedSoundDelay--;
			if (loopedSoundDelay == 0 && !isShootingRight)
				shouldPlayCooldownSound = true;
		}

		//Move all snapshots along one place
		System.arraycopy(snapshots, 0, snapshots, 1, snapshots.length - 2 + 1);
		//Take new snapshot
		snapshots[0] = new PlayerSnapshot(player);
	}

	public void requestAirburstProgram(int slot) {
		pendingAirburstSlot.set(slot);
	}

	public void requestReload(PacketReload request) {
		pendingReloads.set(request.left ? 1 : 0, request);
	}

	private void tickAirburstProgram(EntityPlayer player, ItemStack gun) {
		// Consume at most one intent per tick on the server thread.
		int slot = pendingAirburstSlot.getAndSet(-1);
		if (airburstProgramCooldown > 0)
			airburstProgramCooldown--;
		if (slot < 0 || slot != player.inventory.currentItem || airburstProgramCooldown > 0
				|| !player.isEntityAlive() || player.ridingEntity != null || reloadingRight
				|| gun == null || !(gun.getItem() instanceof ItemGun))
			return;
		airburstProgramCooldown = 5;
		((ItemGun) gun.getItem()).programAirburstRange(gun, player, isScoped);
	}

	public void startGrenadeThrow(EntityPlayer player, ItemStack stack) {
		if (player.worldObj.isRemote || pendingGrenade != null) return;
		// Vanilla copies the held stack after processing a use-item packet.
		// Keep a value snapshot and validate against the live inventory at release.
		pendingGrenade = stack.copy();
		grenadeSlot = player.inventory.currentItem;
		grenadeDimension = player.dimension;
		grenadeReleaseTicks = ((ItemGrenade) stack.getItem()).getThrowReleaseTicks();
	}

	private void tickGrenadeThrow(EntityPlayer player) {
		if (pendingGrenade == null) return;
		if (!player.isEntityAlive() || player.ridingEntity != null || player.dimension != grenadeDimension
				|| player.inventory.currentItem != grenadeSlot || !ItemStack.areItemStacksEqual(player.getHeldItem(), pendingGrenade)
				|| pendingGrenade.stackSize <= 0 || !(pendingGrenade.getItem() instanceof ItemGrenade)) {
			pendingGrenade = null;
			return;
		}
		grenadeReleaseTicks--;
		// Broadcast once from the server, at the free hand's preparation gesture.
		if (grenadeReleaseTicks == ItemGrenade.THROW_RELEASE_TICKS - ItemGrenade.THROW_PIN_PULL_TICKS) {
			GrenadeType preparing = ((ItemGrenade) pendingGrenade.getItem()).type;
			if (!"c4cn".equals(preparing.shortName))
				player.worldObj.playSoundAtEntity(player, preparing.isMolotov() ? "fire.ignite" : "flansmod:grenade_pinpull", 1F, 1F);
		}
		if (grenadeReleaseTicks > 0) return;
		ItemStack stack = player.getHeldItem();
		pendingGrenade = null;
		ItemGrenade item = (ItemGrenade) stack.getItem();
		if (item.type.canThrow) {
			item.releaseThrow(stack, player.worldObj, player, this);
			player.worldObj.playSoundAtEntity(player, "flansmod:grenade_throw", 1F, 1F);
			if (stack.stackSize <= 0) player.inventory.setInventorySlotContents(grenadeSlot, null);
			player.inventory.markDirty();
		}
	}

	public void startReload(ItemStack gunStack, float reloadTime, int reloadCount, boolean left, boolean forceReload,
			boolean combineAmmo, boolean ammoToUpperInventory) {
		tryStartReload(gunStack, reloadTime, reloadCount, left, forceReload, combineAmmo, ammoToUpperInventory);
	}

	public synchronized boolean tryStartReload(ItemStack gunStack, float reloadTime, int reloadCount, boolean left, boolean forceReload,
			boolean combineAmmo, boolean ammoToUpperInventory) {
		if (gunStack == null || !(gunStack.getItem() instanceof ItemGun) || reloadTime <= 0F
				|| getReloadState(left) != null || isReloading(gunStack))
			return false;
		if (!gunStack.hasTagCompound())
			gunStack.setTagCompound(new NBTTagCompound());
		String reloadId = UUID.randomUUID().toString();
		gunStack.getTagCompound().setString(RELOAD_ID_TAG, reloadId);
		if (left)
			reloadLeft = new ReloadState(gunStack, reloadId, reloadTime, forceReload,
					combineAmmo, ammoToUpperInventory, reloadCount);
		else
			reloadRight = new ReloadState(gunStack, reloadId, reloadTime, forceReload,
					combineAmmo, ammoToUpperInventory, reloadCount);
		if (getReloadState(left).shellsToLoad > 0) {
			if (left)
				burstRoundsRemainingLeft = 0;
			else
				burstRoundsRemainingRight = 0;
		}
		return true;
	}

	public boolean hasReloadInHand(boolean left) {
		return getReloadState(left) != null;
	}

	public boolean isReloading(ItemStack gunStack) {
		return isReloading(reloadRight, gunStack) || isReloading(reloadLeft, gunStack);
	}

	private boolean isReloading(ItemStack gunStack, boolean left) {
		return isReloading(getReloadState(left), gunStack);
	}

	public float getReloadTime(ItemStack gunStack) {
		ReloadState right = reloadRight;
		ReloadState left = reloadLeft;
		if (isReloading(right, gunStack))
			return right.timeLeft;
		if (isReloading(left, gunStack))
			return left.timeLeft;
		return 0F;
	}

	private synchronized void tickReload(EntityPlayer player, ItemStack gunStack, boolean left) {
		ReloadState reloadState = getReloadState(left);
		if (reloadState == null)
			return;

		if (!isReloading(reloadState, gunStack) || !player.isEntityAlive()
				|| !(gunStack.getItem() instanceof ItemGun)
				|| ((ItemGun) gunStack.getItem()).type.getSecondaryFire(gunStack) != reloadState.secondaryFire) {
			if (!player.worldObj.isRemote)
				cancelReload(player, reloadState, findReloadStack(player, reloadState), left);
			return;
		}

		reloadState.timeLeft--;
		if (!player.worldObj.isRemote && reloadState.shellsToLoad > 0) {
			ItemGun gunItem = (ItemGun) gunStack.getItem();
			int completed = (int) ((reloadState.totalTime - Math.max(0F, reloadState.timeLeft))
					* reloadState.shellsToLoad / reloadState.totalTime);
			while (reloadState.shellsLoaded < completed) {
				if (!gunItem.reloadOne(gunStack, gunItem.type, player.worldObj, player,
						reloadState.forceReload, reloadState.combineAmmo, reloadState.ammoToUpperInventory)) {
					cancelReload(player, reloadState, gunStack, left);
					return;
				}
				reloadState.shellsLoaded++;
			}
		}
		if (reloadState.timeLeft <= 0F) {
			if (!player.worldObj.isRemote && reloadState.shellsToLoad == 0) {
				ItemGun gunItem = (ItemGun) gunStack.getItem();
				gunItem.reload(gunStack, gunItem.type, player.worldObj, player,
						reloadState.forceReload, left, reloadState.combineAmmo,
						reloadState.ammoToUpperInventory);
			}
			clearReload(reloadState, gunStack, left);
		}
	}

	private void cancelReload(EntityPlayer player, ReloadState reloadState, ItemStack inventoryStack, boolean left) {
		clearReload(reloadState, inventoryStack, left);
		if (!player.worldObj.isRemote && player instanceof EntityPlayerMP)
			syncReloadCancellation(player, left);
	}

	public synchronized boolean cancelSingleReload(EntityPlayer player, ItemStack gunStack, boolean left) {
		ReloadState reloadState = getReloadState(left);
		if (reloadState == null || reloadState.shellsToLoad == 0 || !isReloading(reloadState, gunStack))
			return false;
		cancelReload(player, reloadState, gunStack, left);
		return true;
	}

	private ReloadState getReloadState(boolean left) {
		return left ? reloadLeft : reloadRight;
	}

	private boolean isReloading(ReloadState reloadState, ItemStack gunStack) {
		return reloadState != null
				&& gunStack != null
				&& reloadState.gunStack.getItem() == gunStack.getItem()
				&& reloadState.timeLeft > 0F
				&& (reloadState.gunStack == gunStack
				|| reloadState.reloadId.equals(getReloadId(gunStack)));
	}

	private ItemStack findReloadStack(EntityPlayer player, ReloadState reloadState) {
		if (player == null || reloadState == null)
			return null;
		for (int slot = 0; slot < player.inventory.getSizeInventory(); slot++) {
			ItemStack candidate = player.inventory.getStackInSlot(slot);
			if (reloadState.gunStack == candidate || reloadState.reloadId.equals(getReloadId(candidate)))
				return candidate;
		}
		return null;
	}

	private static String getReloadId(ItemStack gunStack) {
		return gunStack != null && gunStack.hasTagCompound()
				? gunStack.getTagCompound().getString(RELOAD_ID_TAG) : "";
	}

	private void clearReload(ReloadState reloadState, ItemStack inventoryStack, boolean left) {
		clearReloadId(inventoryStack, reloadState.reloadId);
		clearReloadId(reloadState.gunStack, reloadState.reloadId);
		if (left)
			reloadLeft = null;
		else
			reloadRight = null;
	}

	private void clearReloadId(ItemStack gunStack, String reloadId) {
		if (gunStack != null && gunStack.hasTagCompound()
				&& reloadId.equals(gunStack.getTagCompound().getString(RELOAD_ID_TAG)))
			gunStack.getTagCompound().removeTag(RELOAD_ID_TAG);
	}

	/** Clear transient weapon state before a server-side loadout replacement. */
	public synchronized void resetWeaponState(EntityPlayer player) {
		pendingGrenade = null;
		pendingAirburstSlot.set(-1);
		pendingReloads.set(0, null);
		pendingReloads.set(1, null);
		if (reloadRight != null)
			clearReload(reloadRight, findReloadStack(player, reloadRight), false);
		if (reloadLeft != null)
			clearReload(reloadLeft, findReloadStack(player, reloadLeft), true);

		offHandGunSlot = 0;
		shootTimeRight = shootTimeLeft = 0F;
		shootClickDelay = 0;
		isShootingRight = isShootingLeft = false;
		isScoped = false;
		minigunSpeed = 0F;
		reloadingRight = reloadingLeft = false;
		loopedSoundDelay = 0;
		shouldPlayCooldownSound = shouldPlayWarmupSound = false;
		burstRoundsRemainingLeft = burstRoundsRemainingRight = 0;

		if (!player.worldObj.isRemote && player instanceof EntityPlayerMP) {
			syncReloadCancellation(player, false);
			syncReloadCancellation(player, true);
		}
	}

	private void syncReloadCancellation(EntityPlayer player, boolean left) {
		PacketReload packet = new PacketReload(left, 0, 0, false, false, false, -1, "", false,
				player.getEntityId());
		FlansMod.getPacketHandler().sendToAllAround(packet, player.posX, player.posY, player.posZ,
				PacketReload.ANIMATION_SYNC_RANGE, player.dimension);
	}

	private static class ReloadState {
		private final ItemStack gunStack;
		private final String reloadId;
		private final boolean forceReload;
		private final boolean combineAmmo;
		private final boolean ammoToUpperInventory;
		private final float totalTime;
		private final int shellsToLoad;
		private final boolean secondaryFire;
		private int shellsLoaded;
		private volatile float timeLeft;

		private ReloadState(ItemStack gunStack, String reloadId, float timeLeft, boolean forceReload,
				boolean combineAmmo, boolean ammoToUpperInventory, int reloadCount) {
			this.gunStack = gunStack;
			this.reloadId = reloadId;
			this.timeLeft = timeLeft;
			this.forceReload = forceReload;
			this.combineAmmo = combineAmmo;
			this.ammoToUpperInventory = ammoToUpperInventory;
			this.totalTime = timeLeft;
			GunType gunType = ((ItemGun) gunStack.getItem()).type;
			this.shellsToLoad = gunType.getNumAmmoItemsInGun(gunStack) > 1 ? reloadCount : 0;
			this.secondaryFire = gunType.getSecondaryFire(gunStack);
		}
	}

	public void clientTick(EntityPlayer player) {
		if (player.getCurrentEquippedItem() == null || !(player.getCurrentEquippedItem().getItem() instanceof ItemGun) || ((ItemGun) player.getCurrentEquippedItem().getItem()).type.getOneHanded() || player.getCurrentEquippedItem() == offHandGunStack) {
			//offHandGunSlot = 0;
			offHandGunStack = null;
		}
	}

	public PlayerClass getPlayerClass() {
		if (playerClass != newPlayerClass)
			playerClass = newPlayerClass;
		return playerClass;
	}

	public void resetScore() {
		score = zombieScore = kills = deaths = 0;
		team = newTeam = null;
		playerClass = newPlayerClass = null;
	}

	public void playerKilled() {
		pendingGrenade = null;
		mountingGun = null;
		stopShooting();
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
	}

	/** Clear transient trigger state when a player can no longer fire. */
	public void stopShooting() {
		isShootingRight = isShootingLeft = false;
		burstRoundsRemainingLeft = burstRoundsRemainingRight = 0;
		minigunSpeed = 0F;
		loopedSoundDelay = 0;
		shouldPlayCooldownSound = shouldPlayWarmupSound = false;
		hasShotAim = false;
		hasShotContext = false;
	}

	public void selectOffHandWeapon(EntityPlayer player, int slot) {
		if (isValidOffHandWeapon(player, slot))
			offHandGunSlot = slot;
	}

	public boolean isValidOffHandWeapon(EntityPlayer player, int slot) {
		if (slot == 0)
			return true;
		if (slot - 1 == player.inventory.currentItem)
			return false;
		ItemStack stackInSlot = player.inventory.getStackInSlot(slot - 1);
		if (stackInSlot == null)
			return false;
		if (stackInSlot.getItem() instanceof ItemGun) {
			ItemGun item = ((ItemGun) stackInSlot.getItem());
			if (item.type.getOneHanded())
				return true;
		}
		return false;
	}

	public void cycleOffHandItem(EntityPlayer player, int dWheel) {
		if (dWheel < 0)
			for (offHandGunSlot = ((offHandGunSlot + 1) % 10); !isValidOffHandWeapon(player, offHandGunSlot); offHandGunSlot = ((offHandGunSlot + 1) % 10))
				;
		else if (dWheel > 0)
			for (offHandGunSlot = ((offHandGunSlot + 9) % 10); !isValidOffHandWeapon(player, offHandGunSlot); offHandGunSlot = ((offHandGunSlot + 9) % 10))
				;

		FlansModClient.currentScope = null;

		FlansMod.getPacketHandler().sendToServer(new PacketSelectOffHandGun(offHandGunSlot));
	}

	public void doMelee(EntityPlayer player, int meleeTime, GunType type) {
		meleeLength = meleeTime;
		lastMeleePositions = new Vector3f[type.meleePath.size()];

		for (int k = 0; k < type.meleeDamagePoints.size(); k++) {
			Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
			//Do a raytrace from the prev pos to the current pos and attack anything in the way
			Vector3f nextPos = type.meleePath.get(0);
			Vector3f nextAngles = type.meleePathAngles.get(0);
			RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);

			Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
			Vector3f.add(nextPos, nextPosInPlayerCoords, nextPosInPlayerCoords);

			if(!FlansMod.proxy.isThePlayer(player))
				nextPosInPlayerCoords.y += 1.6F;

			lastMeleePositions[k] = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
		}
	}

	@Override
	public String toString() {
		return "PlayerData{" +
				"username='" + username + '\'' +
				", shootTimeRight=" + shootTimeRight +
				", minigunSpeed=" + minigunSpeed +
				", loopedSoundDelay=" + loopedSoundDelay +
				", shouldPlayCooldownSound=" + shouldPlayCooldownSound +
				", shouldPlayWarmupSound=" + shouldPlayWarmupSound +
				'}';
	}
}
