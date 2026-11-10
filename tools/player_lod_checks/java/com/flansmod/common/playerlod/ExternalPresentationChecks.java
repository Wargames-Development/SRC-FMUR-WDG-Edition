package com.flansmod.common.playerlod;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import sun.misc.Unsafe;

/** Scope/ownership checks without creating Minecraft worlds or gameplay players. */
public final class ExternalPresentationChecks {
    private static int checks;
    private static void check(boolean value,String reason) { if(!value) throw new AssertionError(reason);checks++; }
    public static void main(String[] args) throws Exception {
        check(!ExternalPlayerPresentation.ownsClient(),"no client provider preserves legacy rendering");
        check(!ExternalPlayerPresentation.ownsServerViewer(null),"no server provider preserves legacy delivery");
        ExternalPlayerPresentation.setClientOwner(()->true);
        check(ExternalPlayerPresentation.ownsClient(),"explicit client ownership");
        ExternalPlayerPresentation.setClientOwner(()->false);
        check(!ExternalPlayerPresentation.ownsClient(),"client can relinquish ownership");
        ExternalPlayerPresentation.setClientOwner(null);
        ExternalPlayerPresentation.setServerOwner(viewer->true);
        check(ExternalPlayerPresentation.ownsServerViewer(null),"explicit server ownership");
        ExternalPlayerPresentation.setServerOwner(null);
        Field field=Unsafe.class.getDeclaredField("theUnsafe");field.setAccessible(true);Unsafe unsafe=(Unsafe)field.get(null);
        // PlayerData's normal constructor allocates gameplay snapshot buffers; presentation scopes do not need them here.
        PlayerData first=(PlayerData)unsafe.allocateInstance(PlayerData.class),second=(PlayerData)unsafe.allocateInstance(PlayerData.class);
        ExternalPlayerPresentation.VisualScope outer=ExternalPlayerPresentation.beginVisual("Fixture",first);
        try {
            check(ExternalPlayerPresentation.visualData("Fixture")==first,"isolated visual data active");
            check(ExternalPlayerPresentation.visualData("Other")==null,"scope cannot replace another player's data");
            check(PlayerHandler.getPlayerData("Fixture",Side.CLIENT)==first,"normal rendering lookup uses scoped visual data");
            AtomicBoolean isolated=new AtomicBoolean();Thread thread=new Thread(()->isolated.set(ExternalPlayerPresentation.visualData("Fixture")==null));
            thread.start();thread.join();check(isolated.get(),"render scope cannot leak into another thread");
            ExternalPlayerPresentation.VisualScope inner=ExternalPlayerPresentation.beginVisual("Fixture",second);
            check(PlayerHandler.getPlayerData("Fixture",Side.CLIENT)==second,"nested scope active");
            try { outer.close();throw new AssertionError("out of order close accepted"); }
            catch(IllegalStateException expected) { checks++; }
            inner.close();check(ExternalPlayerPresentation.visualData("Fixture")==first,"nested scope restores parent");
        } finally { outer.close(); }
        check(ExternalPlayerPresentation.visualData("Fixture")==null,"scope cleanup leaves live player maps untouched");
        outer.close();check(ExternalPlayerPresentation.visualData("Fixture")==null,"repeated cleanup is harmless");
        System.out.println("PASS "+checks+" external player presentation checks");
    }
}
