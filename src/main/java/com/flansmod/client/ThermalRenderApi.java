package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GLContext;

/** Optional client/render-thread contract shared by FMUR scopes and MCHR cameras. */
@SideOnly(Side.CLIENT)
public final class ThermalRenderApi {
    public static final int API_VERSION = 1;
    private static BooleanSupplier vehicleCamera;
    private static Consumer<Float> vehicleRenderer;
    private static boolean heatPass;
    private static boolean particlePass;
    private ThermalRenderApi() { }

    public static void registerVehicleRenderer(BooleanSupplier activeCamera, Consumer<Float> renderer) {
        if (activeCamera == null || renderer == null) throw new IllegalArgumentException("Thermal provider is required");
        vehicleCamera = activeCamera;
        vehicleRenderer = renderer;
    }

    public static boolean isSupported() {
        return GLContext.getCapabilities().OpenGL20 && OpenGlHelper.isFramebufferEnabled()
                && ThermalFramebuffers.isAvailable()
                && ThermalCamera.ensureShader();
    }

    public static boolean isHeatPass() { return heatPass; }
    /** Native particle replay must not enqueue deferred particles a second time. */
    public static boolean isParticlePass() { return particlePass; }

    static void renderParticles(Runnable particles) {
        if (particlePass) throw new IllegalStateException("Recursive thermal particles");
        particlePass = true;
        try { particles.run(); }
        finally { particlePass = false; }
    }
    static boolean isVehicleCameraActive() { return vehicleCamera != null && vehicleCamera.getAsBoolean(); }

    static void renderHeat(float partialTicks, Runnable ordinaryTargets) {
        if (heatPass) throw new IllegalStateException("Recursive thermal mask");
        heatPass = true;
        try {
            ordinaryTargets.run();
            PlayerLodRenderer.renderHeat(partialTicks);
            if (vehicleRenderer != null) vehicleRenderer.accept(partialTicks);
        } finally { heatPass = false; }
    }
}
