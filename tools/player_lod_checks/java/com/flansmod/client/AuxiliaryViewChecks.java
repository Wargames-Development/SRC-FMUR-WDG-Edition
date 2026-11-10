package com.flansmod.client;

public final class AuxiliaryViewChecks {
    private static int checks;
    private static void check(boolean value,String message) { if(!value) throw new AssertionError(message);checks++; }
    public static void main(String[] args) throws Exception {
        check(!ThermalRenderApi.isAuxiliaryView(),"main view starts unclaimed");
        ThermalRenderApi.CameraPass outer=ThermalRenderApi.beginCameraPass();
        try {
            check(ThermalRenderApi.isAuxiliaryView(),"private camera is marked for its whole geometry pass");
            java.util.concurrent.atomic.AtomicBoolean leaked=new java.util.concurrent.atomic.AtomicBoolean();
            Thread thread=new Thread(()->leaked.set(ThermalRenderApi.isAuxiliaryView()));thread.start();thread.join();check(!leaked.get(),"camera state does not leak into another thread");
            ThermalRenderApi.CameraPass inner=ThermalRenderApi.beginCameraPass();
            try { outer.close();throw new AssertionError("out of order cleanup accepted"); }catch(IllegalStateException expected) { checks++; }
            inner.close();check(ThermalRenderApi.isAuxiliaryView(),"nested camera restores parent view");
        } finally { outer.close(); }
        check(!ThermalRenderApi.isAuxiliaryView(),"camera cleanup restores primary view");outer.close();
        try { try(ThermalRenderApi.CameraPass ignored=ThermalRenderApi.beginCameraPass()) { throw new IllegalArgumentException("renderer failure"); } }
        catch(IllegalArgumentException expected) { checks++; }
        check(!ThermalRenderApi.isAuxiliaryView(),"renderer failure cannot leak camera ownership");
        ThermalRenderApi.renderHeat(0,()->check(ThermalRenderApi.isAuxiliaryView(),"ordinary heat geometry is an auxiliary pass"));
        check(!ThermalRenderApi.isAuxiliaryView(),"heat cleanup restores primary view");
        System.out.println("PASS "+checks+" auxiliary view ownership checks");
    }
}
