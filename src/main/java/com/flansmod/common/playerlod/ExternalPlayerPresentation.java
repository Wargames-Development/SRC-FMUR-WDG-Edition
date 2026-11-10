package com.flansmod.common.playerlod;

import com.flansmod.common.PlayerData;
import com.flansmod.common.FlansMod;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import net.minecraft.entity.player.EntityPlayerMP;

/** Optional presentation ownership. No dependency on DH and no gameplay-state ownership. */
public final class ExternalPlayerPresentation {
    public static final int API_VERSION=3;
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
        return beginVisual(username,data,true);
    }
    public static VisualScope beginVisual(String username,PlayerData data,boolean extensions) {
        if(username==null || data==null) throw new IllegalArgumentException("Missing visual player data");
        VisualScope scope=new VisualScope(username,data,extensions,visual.get());visual.set(scope);return scope;
    }
    public static PlayerData visualData(String username) {
        VisualScope scope=visual.get();return scope!=null && scope.username.equals(username)?scope.data:null;
    }
    public static boolean visualExtensions(String username) {
        VisualScope scope=visual.get();return scope==null || !scope.username.equals(username) || scope.extensions;
    }
    /** Read-only server appearance extension; never supplies private inventory slots. */
    public static byte[] capturePose(EntityPlayerMP player) {
        PlayerData data=com.flansmod.common.PlayerHandler.getPlayerData(player);
        return data==null?new byte[0]:data.presentationPose().encode();
    }
    public static net.minecraft.nbt.NBTTagCompound captureAppearance(EntityPlayerMP player) {
        net.minecraft.nbt.NBTTagCompound tag=new net.minecraft.nbt.NBTTagCompound();
        PlayerData data=com.flansmod.common.PlayerHandler.getPlayerData(player);
        if(data.offHandGunSlot>0 && data.offHandGunSlot<=player.inventory.getSizeInventory())
            item(tag,"offhand",player.inventory.getStackInSlot(data.offHandGunSlot-1));
        item(tag,"night",com.flansmod.common.teams.PlayerEquipmentInventory.getStack(player,0));
        item(tag,"face",com.flansmod.common.teams.PlayerEquipmentInventory.getStack(player,1));
        return tag;
    }
    private static void item(net.minecraft.nbt.NBTTagCompound tag,String name,net.minecraft.item.ItemStack stack) {
        if(stack!=null) { net.minecraft.nbt.NBTTagCompound item=new net.minecraft.nbt.NBTTagCompound();stack.writeToNBT(item);tag.setTag(name,item); }
    }
    public static final class VisualScope implements AutoCloseable {
        private final String username;
        private final PlayerData data;
        private final boolean extensions;
        private final VisualScope previous;
        private final Thread thread=Thread.currentThread();
        private boolean closed;
        private VisualScope(String username,PlayerData data,boolean extensions,VisualScope previous) { this.username=username;this.data=data;this.extensions=extensions;this.previous=previous; }
        public void close() {
            if(closed) return;
            if(Thread.currentThread()!=thread || visual.get()!=this) throw new IllegalStateException("Visual scopes must close in stack order on their render thread");
            if(previous==null) visual.remove();else visual.set(previous);closed=true;
        }
    }
}
