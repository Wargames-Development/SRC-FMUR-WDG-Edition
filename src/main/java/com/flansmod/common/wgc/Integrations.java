package com.flansmod.common.wgc;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityAAGun;
import cpw.mods.fml.common.Loader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class Integrations {

    private static final String WGCORE_MOD_ID = "wgcore";
    private static final boolean WGCORE_LOADED = Loader.isModLoaded(WGCORE_MOD_ID);

    private Integrations() {
    }

    public static boolean isWGCoreIntegrationEnabled() {
        return WGCORE_LOADED && FlansMod.enableWGCoreIntegration;
    }

    public static boolean canHarmPlayerWGC(Entity actingEntity, Entity targetEntity, World world) {
        if (!isWGCoreIntegrationEnabled()) {
            return true;
        }

        if (world == null) {
            return false;
        }

        if (!(targetEntity instanceof EntityPlayer)) {
            return true;
        }

        UUID targetPlayerId = targetEntity.getUniqueID();
        UUID actingPlayerId = resolveActingPlayerId(actingEntity);

        if (actingPlayerId == null || targetPlayerId == null) {
            return false;
        }

        return WGCoreCompat.canHarmPlayer(actingPlayerId, targetPlayerId, world);
    }

    public static ExplosionResult evaluateExplosionWGC(World world,
                                                       Entity actingEntity,
                                                       Explosion explosion,
                                                       double originX,
                                                       double originY,
                                                       double originZ,
                                                       String explosionTypeId,
                                                       List<ChunkPosition> affectedBlocks) {
        if (!isWGCoreIntegrationEnabled()) {
            return ExplosionResult.allowAll();
        }

        if (world == null) {
            return null;
        }

        return WGCoreCompat.evaluateExplosion(
                world,
                resolveActingPlayerId(actingEntity),
                explosion,
                originX,
                originY,
                originZ,
                explosionTypeId,
                affectedBlocks
        );
    }

    public static Entity resolveActingEntity(Entity preferredEntity, Entity fallbackEntity) {
        return preferredEntity != null ? preferredEntity : fallbackEntity;
    }

    public static boolean areSameFactionWGC(UUID firstPlayerId, UUID secondPlayerId, World world) {
        if (!isWGCoreIntegrationEnabled()
                || world == null
                || firstPlayerId == null
                || secondPlayerId == null) {
            return false;
        }

        return WGCoreCompat.areSameFaction(firstPlayerId, secondPlayerId, world);
    }

    private static UUID resolveActingPlayerId(Entity actingEntity) {
        if (actingEntity == null) {
            return null;
        }

        if (actingEntity instanceof EntityPlayer) {
            return actingEntity.getUniqueID();
        }

        if (actingEntity instanceof EntityAAGun) {
            EntityPlayer placer = ((EntityAAGun) actingEntity).placer;
            return placer != null ? placer.getUniqueID() : null;
        }

        if (actingEntity instanceof EntitySeat) {
            EntitySeat seat = (EntitySeat) actingEntity;
            if (seat.riddenByEntity instanceof EntityPlayer) {
                return seat.riddenByEntity.getUniqueID();
            }
            if (seat.driveable != null) {
                return resolveActingPlayerId(seat.driveable);
            }
            return null;
        }

        if (actingEntity instanceof EntityDriveable) {
            EntityDriveable driveable = (EntityDriveable) actingEntity;
            if (driveable.seats != null
                    && driveable.seats.length > 0
                    && driveable.seats[0] != null
                    && driveable.seats[0].riddenByEntity instanceof EntityPlayer) {
                return driveable.seats[0].riddenByEntity.getUniqueID();
            }
            return null;
        }

        return null;
    }

    public static final class ExplosionResult {

        private static final ExplosionResult ALLOW_ALL = new ExplosionResult(
                true,
                true,
                true,
                false,
                Collections.<ChunkPosition>emptyList()
        );

        private final boolean explosionAllowed;
        private final boolean entityDamageAllowed;
        private final boolean blockDamageAllowed;
        private final boolean filtered;
        private final List<ChunkPosition> filteredAffectedBlocks;

        ExplosionResult(boolean explosionAllowed,
                        boolean entityDamageAllowed,
                        boolean blockDamageAllowed,
                        boolean filtered,
                        List<ChunkPosition> filteredAffectedBlocks) {
            this.explosionAllowed = explosionAllowed;
            this.entityDamageAllowed = entityDamageAllowed;
            this.blockDamageAllowed = blockDamageAllowed;
            this.filtered = filtered;
            this.filteredAffectedBlocks = filteredAffectedBlocks != null
                    ? filteredAffectedBlocks
                    : Collections.<ChunkPosition>emptyList();
        }

        static ExplosionResult allowAll() {
            return ALLOW_ALL;
        }

        public boolean isExplosionAllowed() {
            return this.explosionAllowed;
        }

        public boolean isEntityDamageAllowed() {
            return this.entityDamageAllowed;
        }

        public boolean isBlockDamageAllowed() {
            return this.blockDamageAllowed;
        }

        public boolean isFiltered() {
            return this.filtered;
        }

        public List<ChunkPosition> getFilteredAffectedBlocks() {
            return this.filteredAffectedBlocks;
        }
    }
}
