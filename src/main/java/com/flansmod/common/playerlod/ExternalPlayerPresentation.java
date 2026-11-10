package com.flansmod.common.playerlod;

import com.flansmod.common.PlayerData;
import com.flansmod.common.FlansMod;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import net.minecraft.entity.player.EntityPlayerMP;

/** Optional presentation ownership. No dependency on DH and no gameplay-state ownership. */
public final class ExternalPlayerPresentation {
    public static final int API_VERSION=1;
    private static volatile Predicate<EntityPlayerMP> serverOwner;
    private static volatile BooleanSupplier clientOwner;
    private static volatile boolean serverFailed,clientFailed;
    private static final ThreadLocal<VisualScope> visual=new ThreadLocal<VisualScope>();
    private ExternalPlayerPresentation() { }

    public static void setServerOwner(Predicate<EntityPlayerMP> owner) { serverOwner=owner;serverFailed=false; }
    public static void setClientOwner(BooleanSupplier owner) { clientOwner=owner;clientFailed=false; }
    public static boolean ownsServerViewer(EntityPlayerMP viewer) {
        Predicate<EntityPlayerMP> owner=serverOwner;
        if(owner==null) return false;
        if(serverFailed) return true;
        try { return owner.test(viewer); }
        catch(RuntimeException | LinkageError error) { serverFailed=true;FlansMod.log("External player LOD ownership failed; legacy delivery withheld: "+error);return true; }
    }
    public static boolean ownsClient() {
        BooleanSupplier owner=clientOwner;
        if(owner==null) return false;
        if(clientFailed) return true;
        try { return owner.getAsBoolean(); }
        catch(RuntimeException | LinkageError error) { clientFailed=true;FlansMod.log("External player LOD ownership failed; legacy drawing withheld: "+error);return true; }
    }
    /** A visual actor gets its own PlayerData while native player maps remain untouched. */
    public static VisualScope beginVisual(String username,PlayerData data) {
        if(username==null || data==null) throw new IllegalArgumentException("Missing visual player data");
        VisualScope scope=new VisualScope(username,data,visual.get());visual.set(scope);return scope;
    }
    public static PlayerData visualData(String username) {
        VisualScope scope=visual.get();return scope!=null && scope.username.equals(username)?scope.data:null;
    }
    public static final class VisualScope implements AutoCloseable {
        private final String username;
        private final PlayerData data;
        private final VisualScope previous;
        private final Thread thread=Thread.currentThread();
        private boolean closed;
        private VisualScope(String username,PlayerData data,VisualScope previous) { this.username=username;this.data=data;this.previous=previous; }
        public void close() {
            if(closed) return;
            if(Thread.currentThread()!=thread || visual.get()!=this) throw new IllegalStateException("Visual scopes must close in stack order on their render thread");
            if(previous==null) visual.remove();else visual.set(previous);closed=true;
        }
    }
}
