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

    Framebuffer render(Minecraft mc, int width, int height, float magnification, boolean thermal, boolean modelLens) {
        if (!captured || world != mc.theWorld || mc.theWorld == null || mc.renderViewEntity == null) return null;
        if (width < 1 || height < 1 || !Float.isFinite(magnification) || magnification <= 0) return null;
        float aspect = (float)mc.displayWidth / Math.max(1, mc.displayHeight);
        secondary.set(primary, width, height, magnification, aspect, modelLens ? 1F : aspect);
        for (int i = 0; i < 16; i++) {
            if (!Float.isFinite(secondary.projection.get(i)) || !Float.isFinite(secondary.modelView.get(i))) {
                backend = "Unavailable: invalid camera matrices";
                return null;
            }
        }
        long start = System.nanoTime();
        try {
            if (!thermal && FlansMod.pipRenderingMode != 1 && !shaderFailed && shaderCamera != null) {
                try {
                    if (shaderCamera.isSupported()) {
                        Framebuffer frame = shaderCamera.render(secondary);
                        if (frame != null && frame.framebufferObject > 0 && frame.framebufferTexture > 0
                                && frame.framebufferWidth == width && frame.framebufferHeight == height) {
                            backend = "Shader-integrated";
                            return frame;
                        }
                        shaderFailed = true;
                    }
                } catch (RuntimeException | LinkageError failure) {
                    shaderFailed = true;
                    FlansMod.log("[Camera] shader camera disabled: " + failure);
                }
            }
            backend = "Lightweight";
            Framebuffer frame = lightweight.render(mc, secondary, thermal);
            if (frame == null) {
                backend = "Unavailable: " + lightweight.failure();
                if (!backend.equals(reportedFailure)) {
                    // This must remain visible with the optional debug-log preference disabled.
                    FlansMod.logger.warn("[Camera] " + backend);
                    reportedFailure = backend;
                }
            }
            return frame;
        } finally { renders++; renderNanos += System.nanoTime() - start; }
    }

    public String backendDescription() { return backend; }
    public long renderedFrames() { return renders; }
    public long renderCpuNanos() { return renderNanos; }
    public static String modeName() {
        return FlansMod.pipRenderingMode == 1 ? "Performance" : FlansMod.pipRenderingMode == 2 ? "Quality" : "Automatic";
    }
}
