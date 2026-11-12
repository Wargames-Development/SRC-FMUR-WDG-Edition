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
        first.presentationShotRightAge=101;first.presentationShotLeftAge=99;first.minigunSpeed=2;first.isScoped=true;
        first.nextServerShotId=1000;
        PlayerVisualPose captured=first.presentationPose();
        check(captured.rightShotAge==101 && captured.leftShotAge==99 && captured.scoped && captured.minigun==2,"source animation state is captured without client data");
        check(first.nextServerShotId==1000 && first.presentationShotRightAge==101 && first.isScoped,"capture cannot simulate a shot or mutate source aim");
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
        try(ExternalPlayerPresentation.VisualScope disabled=ExternalPlayerPresentation.beginVisual("Fixture",first,false)) {
            check(!ExternalPlayerPresentation.visualExtensions("Fixture"),"FMUR toggle suppresses only this visual actor's extension layers");
            check(ExternalPlayerPresentation.visualExtensions("Other"),"FMUR toggle cannot suppress native players");
        }
        check(ExternalPlayerPresentation.visualExtensions("Fixture"),"native extension behaviour restored after draw");
        for(int i=0;i<1000;i++) {
            float total=20+i,remaining=i%20;
            PlayerVisualPose pose=new PlayerVisualPose(i,i-1,total,remaining,1,total,remaining,2,i*.1F,(i&1)!=0);
            byte[] bytes=pose.encode();PlayerVisualPose decoded=PlayerVisualPose.decode(bytes);
            check(bytes.length==PlayerVisualPose.BYTES && decoded.rightShotAge==i && decoded.leftShotAge==i-1
                && decoded.rightRemaining==remaining && decoded.scoped==((i&1)!=0),"bounded authoritative animation roundtrip");
            check(PlayerVisualPose.remaining(total,remaining,total,remaining*.5F,.5F)==remaining*.75F,"continuous reload interpolation");
        }
        check(PlayerVisualPose.remaining(20,0,20,20,.5F)==0,"future reload cannot begin before its sample");
        check(PlayerVisualPose.remaining(20,10,0,0,.5F)==10,"reload cancellation waits for its sample");
        check(PlayerVisualPose.remaining(20,10,0,0,1)==0,"reload cancellation applies at sample boundary");
        for(int length:new int[]{0,PlayerVisualPose.BYTES-1,PlayerVisualPose.BYTES+1,1000}) {
            try { PlayerVisualPose.decode(new byte[length]);throw new AssertionError("invalid pose size accepted"); }
            catch(IllegalArgumentException expected) { checks++; }
        }
        byte[] invalid=new PlayerVisualPose(Integer.MIN_VALUE,Integer.MIN_VALUE,0,0,0,0,0,0,0,false).encode();
        invalid[1]=2;try { PlayerVisualPose.decode(invalid);throw new AssertionError("invalid pose flags accepted"); }catch(IllegalArgumentException expected) { checks++; }
        invalid[1]=0;invalid[invalid.length-1]=1;
        try { PlayerVisualPose.decode(invalid);throw new AssertionError("reserved pose bytes accepted"); }catch(IllegalArgumentException expected) { checks++; }
        try { new PlayerVisualPose(0,0,20,21,0,0,0,0,0,false);throw new AssertionError("impossible reload accepted"); }catch(IllegalArgumentException expected) { checks++; }
        try { new PlayerVisualPose(0,0,Float.NaN,0,0,0,0,0,0,false);throw new AssertionError("nonfinite reload accepted"); }catch(IllegalArgumentException expected) { checks++; }
        System.out.println("PASS "+checks+" external player presentation checks");
    }
}
