package com.flansmod.common.playerlod;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketZPlayerLod;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/** Runs after authoritative player snapshots. Never enumerates or loads terrain chunks. */
public final class PlayerLodServer {
    private static final Map<UUID, AppearanceState> appearances = new HashMap<UUID, AppearanceState>();
    private static final Map<EntityPlayerMP, Map<UUID, Integer>> recipients =
            new HashMap<EntityPlayerMP, Map<UUID, Integer>>();
    private static long sequence;
    private static int appearanceRevision;
    private PlayerLodServer() { }

    public static void tick() {
        MinecraftServer server = MinecraftServer.getServer();
        if (server == null) return;
        ++sequence;
        List<EntityPlayerMP> players = server.getConfigurationManager().playerEntityList;
        recipients.keySet().retainAll(players);
        Set<UUID> live = new HashSet<UUID>();
        for (EntityPlayerMP player : players) {
            live.add(player.getUniqueID());
            PlayerLodSnapshot.Appearance next = new PlayerLodSnapshot.Appearance(player);
            AppearanceState state = appearances.get(player.getUniqueID());
            if (state == null || state.player != player) {
                state = new AppearanceState(player);
                appearances.put(player.getUniqueID(), state);
            }
            if (!next.same(state.appearance)) { state.appearance = next; state.revision = ++appearanceRevision; }
        }
        appearances.keySet().retainAll(live);
        int range = Math.max(0, Math.min(1024, FlansMod.playerLodDistance));
        for (final EntityPlayerMP viewer : players) {
            Map<UUID, Integer> known = recipients.get(viewer);
            if (known == null) { known = new HashMap<UUID, Integer>(); recipients.put(viewer, known); }
            List<EntityPlayerMP> visible = new ArrayList<EntityPlayerMP>();
            if (range > 0) for (EntityPlayerMP target : players) {
                if (target != viewer && target.worldObj == viewer.worldObj && target.isEntityAlive()
                        && target.getDistanceSqToEntity(viewer) <= (double)range * range
                        && isVisibleToViewer(target, viewer)
                        && PlayerHandler.getPlayerData(target).team != FlansMod.spectators)
                    visible.add(target);
            }
            java.util.Collections.sort(visible, new java.util.Comparator<EntityPlayerMP>() {
                @Override public int compare(EntityPlayerMP a, EntityPlayerMP b) {
                    return Double.compare(a.getDistanceSqToEntity(viewer), b.getDistanceSqToEntity(viewer));
                }
            });
            List<PlayerLodSnapshot.Entry> entries = new ArrayList<PlayerLodSnapshot.Entry>();
            Set<UUID> retained = new HashSet<UUID>();
            for (EntityPlayerMP target : visible) {
                if (entries.size() == PlayerLodSnapshot.MAX_PLAYERS) break;
                AppearanceState state = appearances.get(target.getUniqueID());
                Integer previous = known.get(target.getUniqueID());
                // Periodic repair also covers a client world reset while its server player survives.
                boolean sendAppearance = previous == null || previous.intValue() != state.revision || sequence % 20 == 0;
                entries.add(new PlayerLodSnapshot.Entry(target, state.revision, sendAppearance ? state.appearance : null));
                known.put(target.getUniqueID(), state.revision);
                retained.add(target.getUniqueID());
            }
            known.keySet().retainAll(retained);
            FlansMod.getPacketHandler().sendTo(new PacketZPlayerLod(new PlayerLodSnapshot(
                    sequence, viewer.dimension, range, server.getConfigurationManager().getViewDistance(),
                    viewer.getUniqueID(), entries)), viewer);
        }
    }

    static boolean isVisibleToViewer(EntityPlayerMP target, EntityPlayerMP viewer) {
        if (!target.isInvisible()) return true;
        Team team = target.getTeam();
        // EntityPlayer.isInvisibleToPlayer and Team.func_98297_h are client-only.
        // The concrete scoreboard team's getter also supplies server team packets,
        // so it survives side stripping. Unknown team implementations stay hidden.
        return team instanceof ScorePlayerTeam && team == viewer.getTeam()
                && ((ScorePlayerTeam)team).func_98297_h();
    }

    private static final class AppearanceState {
        final EntityPlayerMP player;
        PlayerLodSnapshot.Appearance appearance;
        int revision;
        AppearanceState(EntityPlayerMP player) { this.player = player; }
    }
}
