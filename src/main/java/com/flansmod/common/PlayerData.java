package com.flansmod.common;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.guns.type.GunType;
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
	/** Stops player shooting immediately after swapping weapons */
	public int shootClickDelay;
	/** True if this player is shooting */
	public boolean isShootingRight, isShootingLeft;
	/** Server-owned player state used to select hip-fire or ADS spread. */
	public boolean isScoped;
	/** Latest finite client camera aim accepted by the server for gunfire. */
	public float shotYaw, shotPitch;
	public boolean hasShotAim;
	/** The speed of the minigun the player is using */
	public float minigunSpeed = 0F;
	/** Server-side limiter for the two legitimate hand updates accepted each tick. */
	public long minigunPacketTick = Long.MIN_VALUE;
	public int minigunPacketsThisTick;
	/** Reloading booleans */
	public boolean reloadingRight, reloadingLeft;
	/** Reload state is attached to the gun stack and the hand that started it. */
	private ReloadState reloadRight, reloadLeft;
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
	public boolean reloadedAfterRespawn = false;

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

		ItemStack rightGun = player.getCurrentEquippedItem();
		ItemStack leftGun = null;
		boolean offHandActive = rightGun != null
				&& rightGun.getItem() instanceof ItemGun
				&& ((ItemGun) rightGun.getItem()).type.getOneHanded();
		if (offHandActive && offHandGunSlot > 0 && offHandGunSlot <= player.inventory.getSizeInventory())
			leftGun = player.inventory.getStackInSlot(offHandGunSlot - 1);

		tickReload(player, rightGun, false);
		if (leftGun != rightGun)
			tickReload(player, leftGun, true);

		reloadingRight = isReloading(rightGun, false);
		reloadingLeft = isReloading(leftGun, true);

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

	public void startReload(ItemStack gunStack, float reloadTime, boolean left) {
		if (gunStack == null || reloadTime <= 0F)
			return;
		if (!gunStack.hasTagCompound())
			gunStack.setTagCompound(new NBTTagCompound());
		String reloadId = UUID.randomUUID().toString();
		gunStack.getTagCompound().setString(RELOAD_ID_TAG, reloadId);
		if (left)
			reloadLeft = new ReloadState(gunStack, reloadId, reloadTime);
		else
			reloadRight = new ReloadState(gunStack, reloadId, reloadTime);
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
		if (isReloading(reloadRight, gunStack))
			return reloadRight.timeLeft;
		if (isReloading(reloadLeft, gunStack))
			return reloadLeft.timeLeft;
		return 0F;
	}

	private void tickReload(EntityPlayer player, ItemStack gunStack, boolean left) {
		ReloadState reloadState = getReloadState(left);
		ItemStack inventoryStack = gunStack;
		if (!player.worldObj.isRemote) {
			// Unequipped reloads pause, but a gun that left server inventory must not reserve the hand forever.
			inventoryStack = findReloadStack(player, reloadState);
			if (reloadState != null && inventoryStack == null) {
				clearReload(reloadState, null, left);
				if (player instanceof EntityPlayerMP)
					FlansMod.getPacketHandler().sendTo(new PacketReload(left, 0, 0, false, false, false),
							(EntityPlayerMP) player);
				return;
			}
		}
		if (!isReloading(reloadState, gunStack))
			return;

		reloadState.timeLeft--;
		if (reloadState.timeLeft <= 0F)
			clearReload(reloadState, inventoryStack, left);
	}

	private ReloadState getReloadState(boolean left) {
		return left ? reloadLeft : reloadRight;
	}

	private boolean isReloading(ReloadState reloadState, ItemStack gunStack) {
		return reloadState != null
				&& gunStack != null
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

	private static class ReloadState {
		private final ItemStack gunStack;
		private final String reloadId;
		private float timeLeft;

		private ReloadState(ItemStack gunStack, String reloadId, float timeLeft) {
			this.gunStack = gunStack;
			this.reloadId = reloadId;
			this.timeLeft = timeLeft;
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
		mountingGun = null;
		isShootingRight = isShootingLeft = false;
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
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
