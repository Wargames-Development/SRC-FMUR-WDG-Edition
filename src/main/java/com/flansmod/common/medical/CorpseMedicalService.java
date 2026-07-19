package com.flansmod.common.medical;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.eventhandlers.PlayerReviveEvent;
import com.flansmod.common.mob.EntityCorpse;
import com.flansmod.common.teams.Team;
import com.flansmod.common.wgc.Integrations;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Local FMUR corpse / AED revive bridge.
 *
 * The WDG edition previously exposed corpse revive events for an external server
 * layer.  That made the AED flow dependent on code outside this mod.  This
 * service keeps the same event emission but owns the minimal revive behaviour
 * inside FMUR so corpses, AEDs, normal respawns, and WGCore faction play stay in
 * sync.
 */
public final class CorpseMedicalService {

    private static final Map<UUID, CorpseRef> ACTIVE_CORPSES = new HashMap<UUID, CorpseRef>();

    private CorpseMedicalService() {
    }

    public static EntityCorpse spawnCorpseForPlayer(EntityPlayer player) {
        if (player == null || player.worldObj == null || player.worldObj.isRemote || !FlansMod.playerCorpsesEnabled) {
            return null;
        }

        clearCorpseForPlayer(player);

        EntityCorpse corpse = new EntityCorpse(player.worldObj, player);
        corpse.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, 0.0F);
        corpse.motionX = player.motionX * FlansMod.corpseKnockbackMultiplier;
        corpse.motionY = Math.max(0.02D, player.motionY * FlansMod.corpseKnockbackMultiplier);
        corpse.motionZ = player.motionZ * FlansMod.corpseKnockbackMultiplier;

        if (player.worldObj.spawnEntityInWorld(corpse)) {
            registerCorpse(corpse);
            return corpse;
        }

        return null;
    }

    public static void registerCorpse(EntityCorpse corpse) {
        if (corpse == null || corpse.getPlayerUuid() == null) {
            return;
        }
        ACTIVE_CORPSES.put(corpse.getPlayerUuid(), new CorpseRef(corpse.dimension, corpse.getEntityId()));
    }

    public static void unregisterCorpse(EntityCorpse corpse) {
        if (corpse == null || corpse.getPlayerUuid() == null) {
            return;
        }
        CorpseRef registered = ACTIVE_CORPSES.get(corpse.getPlayerUuid());
        if (registered != null && registered.entityId == corpse.getEntityId()) {
            ACTIVE_CORPSES.remove(corpse.getPlayerUuid());
        }
    }

    public static void clearCorpseForPlayer(EntityPlayer player) {
        if (player == null) {
            return;
        }
        clearCorpseForPlayer(player.getUniqueID(), player.getCommandSenderName());
    }

    public static void clearCorpseForPlayer(World world, UUID playerUuid, String playerName) {
        clearCorpseForPlayer(playerUuid, playerName);
    }

    public static void clearCorpseForPlayer(UUID playerUuid, String playerName) {
        MinecraftServer server = MinecraftServer.getServer();
        if (server == null || server.worldServers == null) {
            return;
        }

        if (playerUuid != null) {
            CorpseRef registered = ACTIVE_CORPSES.remove(playerUuid);
            if (registered != null) {
                World registeredWorld = server.worldServerForDimension(registered.dimension);
                if (registeredWorld != null) {
                    Entity entity = registeredWorld.getEntityByID(registered.entityId);
                    if (entity instanceof EntityCorpse) {
                        entity.setDead();
                    }
                }
            }
        }

        for (World world : server.worldServers) {
            if (world == null || world.isRemote) {
                continue;
            }
            for (Object object : world.loadedEntityList) {
                if (!(object instanceof EntityCorpse)) {
                    continue;
                }
                EntityCorpse corpse = (EntityCorpse) object;
                if (corpseMatches(corpse, playerUuid, playerName)) {
                    corpse.setDead();
                }
            }
        }
    }

    public static EntityCorpse findLookedAtReviveCorpse(EntityPlayer reviver, double searchDistance, double minLookDot) {
        if (reviver == null || reviver.worldObj == null) {
            return null;
        }

        Vec3 lookVec = reviver.getLookVec();
        Vec3 eyePos = Vec3.createVectorHelper(reviver.posX, reviver.posY + reviver.getEyeHeight(), reviver.posZ);
        EntityCorpse bestCorpse = null;
        double bestDistanceSq = searchDistance * searchDistance;

        for (Object object : reviver.worldObj.loadedEntityList) {
            if (!(object instanceof EntityCorpse)) {
                continue;
            }

            EntityCorpse corpse = (EntityCorpse) object;
            if (corpse.isDead) {
                continue;
            }

            double dx = corpse.posX - eyePos.xCoord;
            double dy = corpse.posY + 0.6D - eyePos.yCoord;
            double dz = corpse.posZ - eyePos.zCoord;
            double distanceSq = dx * dx + dy * dy + dz * dz;
            if (distanceSq > bestDistanceSq) {
                continue;
            }

            Vec3 toCorpse = Vec3.createVectorHelper(dx, dy, dz);
            if (toCorpse.lengthVector() <= 0.0001D) {
                continue;
            }

            double dot = lookVec.dotProduct(toCorpse.normalize());
            if (dot < minLookDot) {
                continue;
            }

            if (!canRevive(reviver, corpse)) {
                continue;
            }

            bestCorpse = corpse;
            bestDistanceSq = distanceSq;
        }

        return bestCorpse;
    }

    public static boolean reviveCorpse(EntityPlayer reviver, EntityCorpse corpse, String weaponName) {
        if (reviver == null || corpse == null || reviver.worldObj == null || reviver.worldObj.isRemote || corpse.isDead) {
            return false;
        }

        if (!FlansMod.internalAedReviveEnabled) {
            return false;
        }

        EntityPlayerMP target = getOnlinePlayer(corpse.getPlayerName());
        if (target == null) {
            sendMessage(reviver, "Cannot revive: player is not online.");
            return false;
        }

        if (!canRevive(reviver, corpse)) {
            sendMessage(reviver, "Cannot revive: target is not a teammate or faction member.");
            return false;
        }

        if (!target.isDead && target.getHealth() > 0.0F) {
            sendMessage(reviver, "Cannot revive: player has already respawned.");
            clearCorpseForPlayer(target);
            return false;
        }

        double reviveX = corpse.posX;
        double reviveY = corpse.posY;
        double reviveZ = corpse.posZ;
        float reviveYaw = corpse.getBodyRotationY();
        int reviveDimension = corpse.dimension;

        PlayerReviveEvent event = new PlayerReviveEvent(
                reviver.getCommandSenderName(),
                reviver.getUniqueID(),
                corpse.getPlayerName(),
                corpse.getPlayerUuid(),
                weaponName,
                reviveX,
                reviveY,
                reviveZ
        );
        MinecraftForge.EVENT_BUS.post(event);

        EntityPlayerMP revived = MinecraftServer.getServer().getConfigurationManager().respawnPlayer(target, reviveDimension, false);
        if (revived == null) {
            revived = target;
        }

        revived.isDead = false;
        revived.deathTime = 0;
        revived.fallDistance = 0.0F;
        revived.motionX = 0.0D;
        revived.motionY = 0.0D;
        revived.motionZ = 0.0D;
        revived.extinguish();
        revived.setHealth(Math.min(revived.getMaxHealth(), Math.max(1.0F, FlansMod.aedReviveHealth)));
        revived.setPositionAndUpdate(reviveX, reviveY, reviveZ);
        revived.rotationYaw = reviveYaw;

        corpse.setDead();
        clearCorpseForPlayer(corpse.getPlayerUuid(), corpse.getPlayerName());

        sendMessage(reviver, "Revived " + corpse.getPlayerDisplayName() + ".");
        sendMessage(revived, "You were revived by " + reviver.getDisplayName() + ".");
        return true;
    }

    private static boolean canRevive(EntityPlayer reviver, EntityCorpse corpse) {
        if (reviver == null || corpse == null) {
            return false;
        }

        String targetName = corpse.getPlayerName();
        if (targetName == null || targetName.trim().isEmpty()) {
            return false;
        }
        if (reviver.getCommandSenderName().equalsIgnoreCase(targetName)) {
            return false;
        }

        EntityPlayer target = corpse.getPlayer();
        if (target != null && areSameScoreboardTeam(reviver, target)) {
            return true;
        }

        if (target != null && areSameFlansTeam(reviver, target)) {
            return true;
        }

        UUID targetUuid = corpse.getPlayerUuid();
        return targetUuid != null && Integrations.areSameFactionWGC(reviver.getUniqueID(), targetUuid, reviver.worldObj);
    }

    private static boolean areSameScoreboardTeam(EntityPlayer reviver, EntityPlayer target) {
        return reviver.getTeam() != null && target.getTeam() != null && reviver.getTeam().isSameTeam(target.getTeam());
    }

    private static boolean areSameFlansTeam(EntityPlayer reviver, EntityPlayer target) {
        PlayerData reviverData = PlayerHandler.getPlayerData(reviver);
        PlayerData targetData = PlayerHandler.getPlayerData(target);
        if (reviverData == null || targetData == null) {
            return false;
        }
        Team reviverTeam = reviverData.team;
        Team targetTeam = targetData.team;
        return reviverTeam != null && targetTeam != null && reviverTeam == targetTeam && reviverTeam != Team.spectators;
    }

    private static boolean corpseMatches(EntityCorpse corpse, UUID playerUuid, String playerName) {
        if (corpse == null) {
            return false;
        }
        if (playerUuid != null && playerUuid.equals(corpse.getPlayerUuid())) {
            return true;
        }
        return playerName != null && corpse.getPlayerName() != null && playerName.equalsIgnoreCase(corpse.getPlayerName());
    }

    private static EntityPlayerMP getOnlinePlayer(String playerName) {
        if (playerName == null || playerName.trim().isEmpty() || MinecraftServer.getServer() == null) {
            return null;
        }
        return MinecraftServer.getServer().getConfigurationManager().func_152612_a(playerName);
    }

    private static void sendMessage(EntityPlayer player, String message) {
        if (player != null) {
            player.addChatMessage(new ChatComponentText("\u00a7c[FMUR] \u00a77" + message));
        }
    }


    private static final class CorpseRef {
        private final int dimension;
        private final int entityId;

        private CorpseRef(int dimension, int entityId) {
            this.dimension = dimension;
            this.entityId = entityId;
        }
    }
}
