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
        for (int mode = 0; mode < 3; mode++) for (int flags = 0; flags < 8; flags++) {
            boolean thermal = (flags & 1) != 0, lens = (flags & 2) != 0, vehicle = (flags & 4) != 0;
            boolean eligible = CameraRenderManager.shaderScopeEligible(thermal, lens, vehicle, mode);
            check(eligible == (!thermal && lens && !vehicle && mode != 1), "shader provider is confined to ordinary Flans lenses");
        }
        check(!ThermalRenderApi.isAuxiliaryView(), "scope selection cannot claim main-view actors");
        checkActorOwnership();
        System.out.println("PASS "+checks+" auxiliary view ownership checks");
    }
    private static int ownerMask;
    private static final java.util.List<String> draws=new java.util.ArrayList<>();
    public static int ownership() { return ownerMask; }
    public static boolean shaderBegin() { return true; }
    public static void distantDraw() { draws.add("flush"); }
    private static java.lang.reflect.Field field(Class<?> type,String name) throws Exception {
        java.lang.reflect.Field field=type.getDeclaredField(name);field.setAccessible(true);return field;
    }
    private static void checkActorOwnership() throws Exception {
        java.util.Map<java.lang.reflect.Field,Object> saved=new java.util.LinkedHashMap<>();
        for(String name:new String[]{"resolved","active","ownedKinds","beginShader","distant","activeKinds"}) {
            java.lang.reflect.Field f=field(DistantActorCamera.class,name);saved.put(f,f.get(null));
        }
        for(String name:new String[]{"resolved","supported"}) {
            java.lang.reflect.Field f=field(DistantVisuals.class,name);saved.put(f,f.get(null));
        }
        java.lang.reflect.Field vehicles=field(ThermalRenderApi.class,"vehicleRenderer");saved.put(vehicles,vehicles.get(null));
        try {
            field(DistantVisuals.class,"resolved").setBoolean(null,true);
            field(DistantVisuals.class,"supported").setBoolean(null,false);
            field(DistantActorCamera.class,"resolved").setBoolean(null,true);
            field(DistantActorCamera.class,"beginShader").set(null,AuxiliaryViewChecks.class.getMethod("shaderBegin"));
            field(DistantActorCamera.class,"ownedKinds").set(null,AuxiliaryViewChecks.class.getMethod("ownership"));
            for(ownerMask=0;ownerMask<4;ownerMask++) {
                check(DistantActorCamera.shaderKinds()==ownerMask,"only actually owned kinds enter the shader stage");
                check(DistantActorCamera.supportsShader()==(ownerMask!=0),"API presence alone does not claim shader ownership");
            }
            field(DistantActorCamera.class,"ownedKinds").set(null,null);
            check(!DistantActorCamera.supportsShader(),"older DH without per-kind ownership retains forward replay");
            field(DistantActorCamera.class,"active").setBoolean(null,true);
            field(DistantActorCamera.class,"distant").set(null,AuxiliaryViewChecks.class.getMethod("distantDraw"));
            vehicles.set(null,(java.util.function.Consumer<Float>)(partial -> draws.add("vehicle")));
            draws.clear();ThermalRenderApi.renderHeat(0,()->draws.add("ordinary"));
            check(draws.equals(java.util.Arrays.asList("ordinary","vehicle","flush")),"thermal submissions precede one DH flush");
            vehicles.set(null,(java.util.function.Consumer<Float>)(partial -> {throw new IllegalArgumentException("fixture");}));
            try { ThermalRenderApi.renderHeat(0,()->{});throw new AssertionError("renderer failure swallowed"); }
            catch(IllegalArgumentException expected) { check(!ThermalRenderApi.isHeatPass(),"failed heat replay clears its scope"); }
        } finally {
            for(java.util.Map.Entry<java.lang.reflect.Field,Object> entry:saved.entrySet()) entry.getKey().set(null,entry.getValue());
            draws.clear();
        }
    }
}
