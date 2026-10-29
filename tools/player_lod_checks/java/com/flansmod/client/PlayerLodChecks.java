package com.flansmod.client;

import com.flansmod.common.playerlod.PlayerLodSnapshot;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.net.URLClassLoader;
import java.nio.file.Paths;
import java.util.UUID;

/** Explicit main instead of introducing a new test framework into this legacy project. */
public final class PlayerLodChecks {
    private static int assertions;
    public static void main(String[] args) throws Exception {
        UUID viewer = new UUID(1, 2), target = new UUID(3, 4);
        ByteBuf packet = header(512, 1);
        entry(packet, target, -513.25D, 64, 256.5D, 179);
        PlayerLodSnapshot decoded = PlayerLodSnapshot.read(packet);
        check(decoded.range == 512 && decoded.viewer.equals(viewer) && decoded.entries.size() == 1, "snapshot header");
        check(decoded.entries.get(0).x == -513.25D && decoded.entries.get(0).uuid.equals(target), "exact coordinates/identity");
        ByteBuf copy = Unpooled.buffer(); decoded.write(copy);
        check(PlayerLodSnapshot.read(copy).entries.get(0).z == 256.5D, "round trip");
        packet.release(); copy.release();
        packet = header(512, 1); entry(packet, target, 0, 64, 0, 0);
        packet.setBoolean(packet.writerIndex() - 1, true);
        cpw.mods.fml.common.network.ByteBufUtils.writeUTF8String(packet, "Sniper");
        packet.writeByte(1);
        cpw.mods.fml.common.network.ByteBufUtils.writeUTF8String(packet, "textures");
        cpw.mods.fml.common.network.ByteBufUtils.writeUTF8String(packet, "profile-texture-data");
        packet.writeBoolean(false);
        for (int i = 0; i < 8; i++) cpw.mods.fml.common.network.ByteBufUtils.writeItemStack(packet, null);
        decoded = PlayerLodSnapshot.read(packet);
        check(decoded.entries.get(0).appearance.profile.getName().equals("Sniper"), "appearance profile name");
        check(decoded.entries.get(0).appearance.profile.getProperties().get("textures").size() == 1, "skin properties");
        copy = Unpooled.buffer(); decoded.write(copy);
        check(PlayerLodSnapshot.read(copy).entries.get(0).appearance.equipment.length == 8, "appearance round trip");
        packet.release(); copy.release();
        rejected(header(1025, 0), "range cap");
        rejected(header(512, 257), "count cap");
        packet = header(512, 1); entry(packet, target, Double.NaN, 64, 0, 0); rejected(packet, "NaN");
        packet = header(512, 1); entry(packet, target, Double.POSITIVE_INFINITY, 64, 0, 0); rejected(packet, "infinity");
        packet = header(512, 1); entry(packet, target, 30000001, 64, 0, 0); rejected(packet, "world bounds");
        packet = header(512, 1); entry(packet, target, 0, 64, 0, Float.NaN); rejected(packet, "nonfinite rotation");
        packet = header(512, 2); entry(packet, target, 0, 64, 0, 0); entry(packet, target, 1, 64, 0, 0);
        rejected(packet, "duplicate identity");
        packet = header(512, 1); entry(packet, viewer, 0, 64, 0, 0); rejected(packet, "self");
        packet = header(512, 0); packet.writeByte(1); rejected(packet, "trailing bytes");
        packet = header(512, 1); rejected(packet, "truncated entry");
        packet = header(0, 0); check(PlayerLodSnapshot.read(packet).entries.isEmpty(), "disabled complete interest set"); packet.release();

        for (double start : new double[] {16, 32, 112, 176, 240, 496}) {
            check(PlayerLodProjection.projected(start, start) == start, "continuous position join");
            double epsilon = 0.0001;
            double slope = (PlayerLodProjection.projected(start + epsilon, start) - start) / epsilon;
            check(Math.abs(slope - 1) < 0.001, "continuous scale derivative");
            double previous = start, previousDepth = 0;
            for (double distance = start + 1; distance <= 4096; distance += 7) {
                double projected = PlayerLodProjection.projected(distance, start);
                double fraction = PlayerLodProjection.depthFraction(distance, start);
                check(projected > previous && projected < start + 8.01, "bounded monotonic projection");
                check(fraction > previousDepth && fraction < 1, "monotonic depth ordering");
                // Scaling both geometry and displacement must preserve angular size and aim.
                double scale = projected / distance;
                check(Math.abs((1.8 * scale) / projected - 1.8 / distance) < 1e-12, "angular size invariant");
                previous = projected; previousDepth = fraction;
            }
        }
        check(Double.isNaN(PlayerLodProjection.projected(512, 0)), "invalid projection contract");
        if (args.length > 0) try (URLClassLoader wgmap = new URLClassLoader(
                new java.net.URL[] {Paths.get(args[0]).toUri().toURL()}, PlayerLodChecks.class.getClassLoader())) {
            Class<?> contract = wgmap.loadClass("com.wdg.wgmap.client.occlusion.CompressedDepthProjection");
            check(contract.getField("VERSION").getInt(null) == PlayerLodProjection.VERSION, "WGMap version");
            for (double start : new double[] {16, 112, 176, 496}) for (double distance = 0; distance <= 4096; distance += 3) {
                double position = (Double)contract.getMethod("projected", double.class, double.class).invoke(null, distance, start);
                double depth = (Double)contract.getMethod("depthFraction", double.class, double.class).invoke(null, distance, start);
                check(Double.doubleToLongBits(position) == Double.doubleToLongBits(PlayerLodProjection.projected(distance, start)), "WGMap exact projection parity");
                check(Double.doubleToLongBits(depth) == Double.doubleToLongBits(PlayerLodProjection.depthFraction(distance, start)), "WGMap exact depth parity");
            }
        }
        System.out.println("PASS: " + assertions + " packet, malformed-input, projection, angular-size and WGMap-contract assertions.");
    }

    private static ByteBuf header(int range, int count) {
        return Unpooled.buffer().writeLong(25).writeInt(0).writeShort(range).writeByte(8).writeLong(1).writeLong(2).writeShort(count);
    }
    private static void entry(ByteBuf out, UUID uuid, double x, double y, double z, float yaw) {
        out.writeLong(uuid.getMostSignificantBits()).writeLong(uuid.getLeastSignificantBits()).writeInt(42).writeInt(1);
        out.writeDouble(x).writeDouble(y).writeDouble(z).writeFloat(yaw);
        for (int i = 0; i < 7; i++) out.writeFloat(0);
        out.writeByte(0).writeInt(100).writeInt(15728880).writeBoolean(false);
    }
    private static void rejected(ByteBuf packet, String name) {
        boolean rejected = false;
        try { PlayerLodSnapshot.read(packet); } catch (IllegalArgumentException | IndexOutOfBoundsException expected) { rejected = true; }
        finally { packet.release(); }
        check(rejected, "reject " + name);
    }
    private static void check(boolean condition, String name) {
        ++assertions;
        if (!condition) throw new AssertionError(name);
    }
}
