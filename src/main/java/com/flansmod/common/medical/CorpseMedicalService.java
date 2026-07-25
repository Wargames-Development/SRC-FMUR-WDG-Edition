package com.flansmod.common.medical;

import com.flansmod.common.FlansMod;
import com.flansmod.common.mob.EntityCorpse;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Tracks visual player corpses and the inventory they temporarily hold.
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
        corpse.captureInventory(player);
        corpse.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, 0.0F);
        corpse.motionX = 0.0D;
        corpse.motionY = 0.0D;
        corpse.motionZ = 0.0D;

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
                        ((EntityCorpse) entity).expireAndDropInventory();
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
                    corpse.expireAndDropInventory();
                }
            }
        }
    }

    public static void captureDeathDrops(PlayerDropsEvent event) {
        if (event == null || event.entityPlayer == null || event.entityPlayer.worldObj.isRemote || !FlansMod.playerCorpsesEnabled) {
            return;
        }

        EntityCorpse corpse = findCorpse(event.entityPlayer.getUniqueID(), event.entityPlayer.getCommandSenderName());
        if (corpse != null) {
            // The corpse already captured the inventory with its original slot
            // positions during LivingDeathEvent. Cancel at highest priority so
            // TeamsManager and vanilla cannot transform or spawn these drops.
            event.drops.clear();
            event.setCanceled(true);
        }
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

    private static EntityCorpse findCorpse(UUID playerUuid, String playerName) {
        MinecraftServer server = MinecraftServer.getServer();
        if (server == null || server.worldServers == null) {
            return null;
        }

        for (World world : server.worldServers) {
            if (world == null || world.isRemote) {
                continue;
            }
            for (Object object : world.loadedEntityList) {
                if (object instanceof EntityCorpse && corpseMatches((EntityCorpse) object, playerUuid, playerName)) {
                    return (EntityCorpse) object;
                }
            }
        }
        return null;
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
