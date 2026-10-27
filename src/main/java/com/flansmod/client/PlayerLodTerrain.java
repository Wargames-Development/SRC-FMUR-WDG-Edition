package com.flansmod.client;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.lang.reflect.Method;

/** Only the documented WGMap APIs cross this optional client boundary. */
@SideOnly(Side.CLIENT)
final class PlayerLodTerrain {
    private static boolean resolved;
    private static Method available, prepare, draw, trace;
    private PlayerLodTerrain() { }

    private static void bind() {
        if (resolved) return;
        resolved = true;
        if (!Loader.isModLoaded("wgmap")) return;
        try {
            ClassLoader loader = PlayerLodTerrain.class.getClassLoader();
            Class<?> depth = Class.forName("com.wdg.wgmap.client.occlusion.TerrainDepthApi", false, loader);
            if (depth.getField("API_VERSION").getInt(null) != 1
                    || depth.getField("PROJECTION_VERSION").getInt(null) != PlayerLodProjection.VERSION
                    || depth.getField("GAP_COVERAGE_VERSION").getInt(null) != 1)
                throw new IllegalStateException("WGMap depth/projection version mismatch");
            available = depth.getMethod("isAvailable");
            prepare = depth.getMethod("prepareDepthIncludingUnloadedChunks", int.class, double.class, double.class, double.class,
                    double.class, double[].class, double[].class, int.class);
            if (depth.getField("DRAW_STATUS_VERSION").getInt(null) != 1)
                throw new IllegalStateException("WGMap checked depth draw unavailable");
            draw = depth.getMethod("drawPreparedDepthChecked");
            Class<?> cpu = Class.forName("com.wdg.wgmap.client.occlusion.TerrainOcclusionApi", false, loader);
            if (cpu.getField("API_VERSION").getInt(null) != 1)
                throw new IllegalStateException("WGMap occlusion version mismatch");
            trace = cpu.getMethod("traceSegment", int.class, double.class, double.class, double.class,
                    double.class, double.class, double.class);
        } catch (ReflectiveOperationException | RuntimeException | LinkageError error) { disable(error); }
    }

    static boolean[] depth(int dimension, double cx, double cy, double cz, double start,
            double[] targets, double[] radii, int count) {
        bind();
        if (available == null) return null;
        try {
            if (!Boolean.TRUE.equals(available.invoke(null))) return null;
            boolean[] ready = (boolean[])prepare.invoke(null, dimension, cx, cy, cz, start, targets, radii, count);
            if (ready == null || ready.length != count) return null;
            // Consume immediately on this render thread: no intervening render events or tick work.
            return Boolean.TRUE.equals(draw.invoke(null)) ? ready : null;
        } catch (ReflectiveOperationException | RuntimeException | LinkageError error) {
            disable(error); return null;
        }
    }

    static void warmCorridor(int dimension, double cx, double cy, double cz,
            double x, double y, double z) {
        bind();
        if (trace == null) return;
        try {
            // A RAM-only CPU query records bounded demand. It never authorises rendering:
            // clear rays cannot prove exact partial visibility of a human behind cover.
            trace.invoke(null, dimension, cx, cy, cz, x, y + 1.0D, z);
        } catch (ReflectiveOperationException | RuntimeException | LinkageError error) {
            disable(error);
        }
    }

    private static void disable(Throwable error) {
        available = null; prepare = null; draw = null; trace = null;
        FlansMod.log("[PlayerLOD] WGMap integration disabled: " + error.toString());
    }
}
