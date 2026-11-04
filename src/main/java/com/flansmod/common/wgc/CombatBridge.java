package com.flansmod.common.wgc;

import java.lang.reflect.Method;
import net.minecraft.entity.Entity;

/** Optional server fire provenance; WGQOL is never a required dependency. */
public final class CombatBridge {
    private static Method ignite, tracking;
    private static boolean checked;
    private CombatBridge() { }
    private static void discover() {
        if (!checked) {
            checked = true;
            try {
                Class<?> service = Class.forName("com.wdg.wgqol.stats.CombatService");
                ignite = service.getMethod("ignite", Entity.class, Entity.class, int.class);
                tracking = service.getMethod("isTracking");
            }
            catch (ReflectiveOperationException | LinkageError absent) { }
        }
    }
    public static boolean ownsTracking() {
        discover();
        if (tracking != null) try { return Boolean.TRUE.equals(tracking.invoke(null)); }
        catch (ReflectiveOperationException ignored) { }
        return false;
    }
    public static void ignite(Entity victim, Entity projectile, int seconds) {
        if (victim.worldObj.isRemote) return;
        discover();
        if (ignite != null) try { ignite.invoke(null, victim, projectile, seconds); }
        catch (ReflectiveOperationException error) { org.apache.logging.log4j.LogManager.getLogger("WGQOL").warn("Cannot record weapon fire provenance", error); }
    }
}
