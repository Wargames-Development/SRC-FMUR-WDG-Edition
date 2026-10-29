package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.Map;
import com.flansmod.common.guns.ThermalProfile;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GLContext;

/** Optional client/render-thread contract shared by FMUR scopes and MCHR cameras. */
@SideOnly(Side.CLIENT)
public final class ThermalRenderApi {
    public static final int API_VERSION = 1;
    private static BooleanSupplier vehicleCamera;
    private static Consumer<Float> vehicleRenderer;
    private static Supplier<Object> vehicleDevice;
    private static IntSupplier vehicleMaxFps;
    private static Supplier<Map<String, String>> vehicleProfile;
    private static Map<String, String> lastVehicleProfile;
    private static ThermalProfile resolvedVehicleProfile = ThermalProfile.DEFAULT;
    private static boolean vehicleProfileFailed;
    private static boolean heatPass;
    private static boolean particlePass;
    private ThermalRenderApi() { }

    public static void registerVehicleRenderer(BooleanSupplier activeCamera, Consumer<Float> renderer) {
        if (activeCamera == null || renderer == null) throw new IllegalArgumentException("Thermal provider is required");
        vehicleCamera = activeCamera;
        vehicleRenderer = renderer;
    }

    /** Optional v1 extension. Suppliers return content identity/limits, never menu settings. */
    public static void registerVehicleSensor(Supplier<Object> device, IntSupplier maxFps) {
        if (device == null || maxFps == null) throw new IllegalArgumentException("Thermal sensor is required");
        vehicleDevice = device;
        vehicleMaxFps = maxFps;
    }

    /** Additive v1 profile extension; immutable maps are cached by definition identity. */
    public static void registerVehicleProfile(Supplier<Map<String, String>> profile) {
        if (profile == null) throw new IllegalArgumentException("Thermal profile is required");
        vehicleProfile = profile;
        lastVehicleProfile = null;
        resolvedVehicleProfile = null;
        vehicleProfileFailed = false;
    }

    static ThermalProfile vehicleSensorProfile() {
        if (vehicleProfile == null) {
            int fps = vehicleSensorMaxFps();
            if (resolvedVehicleProfile == null || resolvedVehicleProfile.maxFramesPerSecond != fps)
                resolvedVehicleProfile = fps >= 1 && fps <= 240 ? new ThermalProfile(fps) : null;
            return resolvedVehicleProfile;
        }
        if (vehicleProfileFailed) return null;
        Map<String, String> values;
        try { values = vehicleProfile.get(); }
        catch (RuntimeException | LinkageError failure) {
            vehicleProfileFailed = true;
            com.flansmod.common.FlansMod.log("[Thermal] vehicle profile provider disabled: " + failure);
            return null;
        }
        if (values != lastVehicleProfile) {
            lastVehicleProfile = values;
            try { resolvedVehicleProfile = values == null ? null : new ThermalProfile(values); }
            catch (IllegalArgumentException failure) {
                resolvedVehicleProfile = null;
                com.flansmod.common.FlansMod.log("[Thermal] rejected vehicle profile: " + failure);
            }
        }
        return resolvedVehicleProfile;
    }

    static void renderCameraGeometry(float partialTicks) {
        PlayerLodRenderer.renderHeat(partialTicks);
        if (vehicleRenderer != null) vehicleRenderer.accept(partialTicks);
    }

    static Object vehicleSensorDevice() {
        Object device = vehicleDevice == null ? null : vehicleDevice.get();
        return device == null ? ThermalRenderApi.class : device;
    }

    static int vehicleSensorMaxFps() {
        return vehicleMaxFps == null ? com.flansmod.common.guns.ThermalProfile.DEFAULT.maxFramesPerSecond
                : vehicleMaxFps.getAsInt();
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
