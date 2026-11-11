package com.flansmod.client;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;

/** Shared render-thread camera service for optics and vehicle sensors. */
@SideOnly(Side.CLIENT)
public final class CameraRenderManager implements IResourceManagerReloadListener {
    public static final CameraRenderManager INSTANCE = new CameraRenderManager();
    private final CameraView primary = new CameraView();
    private final CameraView secondary = new CameraView();
    private final LightweightCamera lightweight = new LightweightCamera();
    private Object world;
    private boolean captured;
    private ShaderCamera shaderCamera;
    private boolean shaderFailed;
    private boolean shaderChecked;
    private String backend = "Lightweight";
    private String reportedFailure;
    private long renders, renderNanos;

    private CameraRenderManager() { }

    /** A renderer must implement an isolated view, with private writable/history state. */
    public interface ShaderCamera {
        /** True only while an active pack supports an isolated secondary view. */
        boolean isSupported();
        Framebuffer render(CameraView view);
        void destroy();
    }

    public void registerShaderCamera(ShaderCamera provider) {
        if (shaderCamera != null && shaderCamera != provider) shaderCamera.destroy();
        shaderCamera = provider;
        shaderFailed = false;
    }

    void beginFrame(Minecraft mc) {
        captured = false;
        if (world != mc.theWorld) {
            lightweight.destroy();
            ThermalScopeEffect.invalidateCameraResources();
            if (shaderCamera != null) shaderCamera.destroy();
            shaderFailed = false;
            world = mc.theWorld;
            reportedFailure = null;
        }
    }

    @Override public void onResourceManagerReload(IResourceManager resources) {
        lightweight.destroy();
        ThermalScopeEffect.invalidateCameraResources();
        if (shaderCamera != null) shaderCamera.destroy();
        shaderFailed = false;
        captured = false;
        reportedFailure = null;
    }

    void capture(float partialTicks) {
        primary.capture(RenderManager.renderPosX, RenderManager.renderPosY, RenderManager.renderPosZ, partialTicks);
        lightweight.capture(primary);
        captured = true;
    }

    CameraView currentView() { return secondary; }

    Framebuffer render(Minecraft mc, int width, int height, float magnification, boolean thermal, boolean modelLens, boolean flir) {
        return render(mc, width, height, magnification, thermal, modelLens, flir, false);
    }

    Framebuffer render(Minecraft mc, int width, int height, float magnification, boolean thermal, boolean modelLens, boolean flir, boolean shaderScope) {
        if (!captured || world != mc.theWorld || mc.theWorld == null || mc.renderViewEntity == null) return null;
        if (width < 1 || height < 1 || !Float.isFinite(magnification) || magnification <= 0) return null;
        float aspect = (float)mc.displayWidth / Math.max(1, mc.displayHeight);
        secondary.set(primary, width, height, magnification, aspect,
                modelLens ? (float)width / height : aspect);
        for (int i = 0; i < 16; i++) {
            if (!Float.isFinite(secondary.projection.get(i)) || !Float.isFinite(secondary.modelView.get(i))) {
                backend = "Unavailable: invalid camera matrices";
                return null;
            }
        }
        long start = System.nanoTime();
        try {
            if (shaderScope && shaderCamera != null && !shaderFailed) {
                try {
                    if (shaderCamera instanceof AngelicaCameraBridge) ((AngelicaCameraBridge) shaderCamera).capture(primary);
                    Framebuffer frame = shaderCamera.render(secondary);
                    if (frame != null && frame.framebufferObject > 0 && frame.framebufferTexture > 0
                            && frame.framebufferWidth == width && frame.framebufferHeight == height) {
                        backend = "Shader-integrated";
                        return frame;
                    }
                    // A scope can be incomplete while DH/native meshes are still arriving.
                    // The API reports permanent incompatibility through isSupported().
                    shaderFailed = !(shaderCamera instanceof AngelicaCameraBridge);
                } catch (RuntimeException | LinkageError failure) {
                    shaderFailed = true;
                    FlansMod.logger.warn("[Camera] Flans shader scope disabled; using the existing camera", failure);
                }
            }
            backend = "Lightweight";
            Framebuffer frame;
            if (shaderScope) {
                // The caller deliberately left the primary shaders available for the provider.
                // A rejected sample must still enter the original lightweight isolation.
                AutoCloseable isolated = ThermalRenderApi.beginIsolatedGeometry();
                try { frame = lightweight.render(mc, secondary, thermal, flir); }
                finally { try { isolated.close(); } catch (Exception failure) { throw new IllegalStateException(failure); } }
            } else frame = lightweight.render(mc, secondary, thermal, flir);
            if (frame == null) {
                backend = "Unavailable: " + lightweight.failure();
                if (!backend.equals(reportedFailure)) {
                    FlansMod.logger.warn("[Camera] " + backend);
                    reportedFailure = backend;
                }
            }
            return frame;
        } finally { renders++; renderNanos += System.nanoTime() - start; }
    }

    boolean supportsShaderScope(boolean thermal, boolean modelLens, boolean vehicleOrFlir) {
        if (!shaderScopeEligible(thermal, modelLens, vehicleOrFlir, FlansMod.pipRenderingMode) || shaderFailed) return false;
        if (!shaderChecked && shaderCamera == null) {
            shaderChecked = true;
            try { registerShaderCamera(AngelicaCameraBridge.find()); }
            catch (ReflectiveOperationException | LinkageError failure) {
                shaderFailed = true;
                FlansMod.logger.warn("[Camera] Optional Flans shader scope unavailable", failure);
            }
        }
        try { return shaderCamera != null && shaderCamera.isSupported(); }
        catch (RuntimeException | LinkageError failure) {
            shaderFailed = true;
            FlansMod.logger.warn("[Camera] Optional Flans shader scope unavailable", failure);
            return false;
        }
    }

    static boolean shaderScopeEligible(boolean thermal, boolean modelLens, boolean vehicleOrFlir, int mode) {
        return !thermal && modelLens && !vehicleOrFlir && mode != 1;
    }

    public String backendDescription() { return backend; }
    public long renderedFrames() { return renders; }
    public long renderCpuNanos() { return renderNanos; }
    public static String modeName() {
        return FlansMod.pipRenderingMode == 1 ? "Performance" : FlansMod.pipRenderingMode == 2 ? "Quality" : "Automatic";
    }
}
