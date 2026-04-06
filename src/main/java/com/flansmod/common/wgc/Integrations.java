package com.flansmod.common.wgc;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityAAGun;
import com.wdg.wgcore.integration.api.WGCoreIntegrationAccess;
import com.wdg.wgcore.integration.model.ActionAttribution;
import com.wdg.wgcore.integration.model.ActionSourceType;
import com.wdg.wgcore.integration.model.ExplosionActionContext;
import com.wdg.wgcore.integration.model.ExplosionDecision;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class Integrations {

    private static final String SOURCE_MOD_ID = "fmur";

    private Integrations() {
    }

    public static boolean canHarmPlayerWGC(Entity actingEntity, Entity targetEntity, World world) {
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

        return WGCoreIntegrationAccess.canHarmPlayer(actingPlayerId, targetPlayerId, world);
    }

    public static ExplosionDecision evaluateExplosionWGC(World world,
                                                         Entity actingEntity,
                                                         Explosion explosion,
                                                         double originX,
                                                         double originY,
                                                         double originZ,
                                                         String explosionTypeId,
                                                         List<ChunkPosition> affectedBlocks) {
        if (world == null) {
            return ExplosionDecision.deny(null);
        }

        UUID actingPlayerId = resolveActingPlayerId(actingEntity);
        ActionAttribution attribution = buildAttribution(world, actingPlayerId, ActionSourceType.EXPLOSIVE);

        ExplosionActionContext context = new ExplosionActionContext(
                world,
                floorToInt(originX),
                floorToInt(originY),
                floorToInt(originZ),
                explosion,
                attribution,
                normaliseExplosionTypeId(explosionTypeId),
                affectedBlocks != null ? affectedBlocks : Collections.<ChunkPosition>emptyList()
        );

        return WGCoreIntegrationAccess.evaluateExplosion(context);
    }

    public static Entity resolveActingEntity(Entity preferredEntity, Entity fallbackEntity) {
        return preferredEntity != null ? preferredEntity : fallbackEntity;
    }

    private static ActionAttribution buildAttribution(World world,
                                                      UUID actingPlayerId,
                                                      ActionSourceType sourceType) {
        if (actingPlayerId == null) {
            return new ActionAttribution(
                    null,
                    null,
                    null,
                    null,
                    SOURCE_MOD_ID,
                    sourceType,
                    true,
                    null
            );
        }

        return ActionAttribution.directPlayer(
                actingPlayerId,
                WGCoreIntegrationAccess.getPlayerFaction(world, actingPlayerId),
                SOURCE_MOD_ID,
                sourceType
        );
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

    private static String normaliseExplosionTypeId(String explosionTypeId) {
        if (explosionTypeId == null) {
            return "fmur:explosion";
        }

        String trimmed = explosionTypeId.trim();
        return trimmed.isEmpty() ? "fmur:explosion" : trimmed;
    }

    private static int floorToInt(double value) {
        return (int) Math.floor(value);
    }
}