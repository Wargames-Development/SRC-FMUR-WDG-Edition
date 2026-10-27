package com.flansmod.client;

import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.EXTFramebufferBlit;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

import java.lang.reflect.Field;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/** Client-only white-hot display for thermal scope attachments. */
@SideOnly(Side.CLIENT)
public final class ThermalScopeEffect {
    /** Full-ADS physical PiP lens diameter as a fraction of display height. */
    public static final float MODEL_SCOPE_LENS_DIAMETER_FRACTION = 0.48F;

    private static final ThermalCamera CAMERA = ThermalCamera.INSTANCE;
    private static final String VERTEX_SHADER = ThermalCamera.VERTEX_SHADER;

    /** Color PiP resolves to this sample when thermalDisplay is zero. */
    private static final String COLOR_LENS_FRAGMENT_SHADER =
            "#version 120\n" +
            "uniform sampler2D sceneTexture;\n" +
            "uniform float sourceAspect;\n" +
            "uniform float modelMagnification;\n" +
            "varying vec2 textureCoordinate;\n" +
            "void main() {\n" +
            "    vec2 sourceUv = textureCoordinate;\n" +
            "    sourceUv.x = 0.5 + (sourceUv.x - 0.5) / (max(sourceAspect, 1.0) * max(modelMagnification, 1.0));\n" +
            "    sourceUv.y = 0.5 + (sourceUv.y - 0.5) / max(modelMagnification, 1.0);\n" +
            "    gl_FragColor = vec4(texture2D(sceneTexture, sourceUv).rgb, 1.0);\n" +
            "}\n";

    private static final int MODEL_LENS_SIZE = 1024;
    private static final int POST_COMPOSITE_LENS_SEGMENTS = 32;
    /** Keep the post-composite image just inside the physical model aperture. */
    private static final float POST_COMPOSITE_LENS_INSET = 0.97F;
    /** Thermal-only fallback for models that draw their own lens geometry. */
    private static final float POST_COMPOSITE_THERMAL_RADIUS_FRACTION = 0.23F;
    private static Framebuffer modelLensFramebuffer;
    private static Framebuffer scopedSceneFramebuffer;
    private static Framebuffer primarySceneRestoreFramebuffer;
    private static int colorLensShaderProgram = -1;
    private static boolean colorLensShaderUnavailable;
    private static int colorLensSceneTextureUniform = -1;
    private static int colorLensSourceAspectUniform = -1;
    private static int colorLensModelMagnificationUniform = -1;












    private static boolean sceneCaptured;
    private static boolean modelLensValid;
    private static boolean scopedSceneCaptured;
    private static boolean primaryColorPending;
    private static boolean renderingScopedWorld;
    private static boolean colorPictureInPictureActiveLastFrame;
    private static int colorPictureInPictureFrame;
    private static boolean thermalPictureInPictureActiveLastFrame;
    private static int thermalPictureInPictureFrame;
    private static final FloatBuffer postCompositeLensProjection = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer postCompositeLensModelView = BufferUtils.createFloatBuffer(16);
    private static final float[] postCompositeLensNdcX =
            new float[POST_COMPOSITE_LENS_SEGMENTS + 2];
    private static final float[] postCompositeLensNdcY =
            new float[POST_COMPOSITE_LENS_SEGMENTS + 2];
    private static boolean postCompositeLensGeometryValid;
    private static boolean flirEnabled = true;

    private ThermalScopeEffect() {
    }

    public static void prepareModelLensFrame(Minecraft mc, float partialTicks) {
        // Thermal model scopes use the same post-primary second-camera boundary as
        // normal color PiP. Rendering this camera at RenderTick START lets its narrow
        // frustum consume/publish terrain visibility before the real camera renders.
        if (isColorPictureInPictureDisplay()) {
            thermalPictureInPictureActiveLastFrame = false;
            thermalPictureInPictureFrame = 0;
            return;
        }

        if (!isActive(mc) || !isModelLensDisplay() || mc.theWorld == null
                || mc.renderViewEntity == null || !GLContext.getCapabilities().OpenGL20
                || !OpenGlHelper.isFramebufferEnabled()) {
            modelLensValid = false;
            thermalPictureInPictureActiveLastFrame = false;
            thermalPictureInPictureFrame = 0;
            return;
        }

        boolean sourceSizeChanged = CAMERA.width() != mc.displayWidth
                || CAMERA.height() != mc.displayHeight;
        boolean renderThisFrame = !thermalPictureInPictureActiveLastFrame
                || !modelLensValid || sourceSizeChanged
                || (thermalPictureInPictureFrame & 1) == 0;
        thermalPictureInPictureActiveLastFrame = true;
        thermalPictureInPictureFrame++;
        if (!renderThisFrame) {
            return;
        }

        // Hold the last good thermal frame while the primary camera has chunk work
        // in flight. The thermal pass must not steal a build/upload just because its
        // second camera happens to run after a muzzle flash or camera movement.
        if (modelLensValid
                && ScopeRenderCompatibility.shouldDeferColorPictureInPictureRender()) {
            thermalPictureInPictureFrame--;
            return;
        }

        sceneCaptured = false;
        scopedSceneCaptured = false;
        renderScopedWorld(mc, partialTicks);
        renderCapturedScene(mc, partialTicks);
    }

    /**
     * Prepare a normal-color PiP frame only after the primary camera has finished.
     * The narrower scope view can safely reuse the primary camera's terrain set, and
     * the completed primary image can be restored after a shader-aware second pass.
     */
    public static void prepareColorPictureInPictureFrame(Minecraft mc, float partialTicks) {
        if (!isColorPictureInPictureDisplay()) {
            colorPictureInPictureActiveLastFrame = false;
            colorPictureInPictureFrame = 0;
            return;
        }
        if (!isActive(mc) || !isModelLensDisplay() || mc.theWorld == null
                || mc.renderViewEntity == null || !GLContext.getCapabilities().OpenGL20
                || !OpenGlHelper.isFramebufferEnabled()) {
            modelLensValid = false;
            colorPictureInPictureActiveLastFrame = false;
            colorPictureInPictureFrame = 0;
            return;
        }

        // A complete second world/shader pass is the dominant PiP cost. Update the
        // scope camera every other display frame and reuse the previous lens texture
        // in between. The first ADS frame and a display-size change update at once.
        boolean sourceSizeChanged = CAMERA.width() != mc.displayWidth
                || CAMERA.height() != mc.displayHeight;
        boolean renderThisFrame = !colorPictureInPictureActiveLastFrame
                || !modelLensValid || sourceSizeChanged
                || (colorPictureInPictureFrame & 1) == 0;
        colorPictureInPictureActiveLastFrame = true;
        colorPictureInPictureFrame++;
        if (!renderThisFrame) {
            return;
        }

        // A nested world render must not drain/publish chunk rebuild work belonging
        // to the primary camera. Reuse the last known-good lens for this frame and
        // retry next frame once Celeritas is quiescent. This is especially important
        // for muzzle-flash/dynamic-light rebuilds triggered while firing.
        if (modelLensValid
                && ScopeRenderCompatibility.shouldDeferColorPictureInPictureRender()) {
            colorPictureInPictureFrame--;
            return;
        }

        sceneCaptured = false;
        scopedSceneCaptured = false;
        renderScopedWorld(mc, partialTicks);
        renderCapturedScene(mc, partialTicks);
    }

    public static void captureHeatMask(float partialTicks) {
        Minecraft mc = Minecraft.getMinecraft();
        if (isColorPictureInPictureDisplay()) {
            if (!renderingScopedWorld && !modelLensValid && !ScopeRenderCompatibility.isShaderPackInUse()) {
                capturePrimaryScene(mc);
                renderCapturedScene(mc, partialTicks);
            }
            return;
        }
        if (!isActive(mc) || mc.theWorld == null || mc.renderViewEntity == null
                || !GLContext.getCapabilities().OpenGL20 || !OpenGlHelper.isFramebufferEnabled()) return;
        if (isModelLensDisplay() && !renderingScopedWorld) return;
        sceneCaptured = false;
        if (!renderingScopedWorld) scopedSceneCaptured = false;
        int source = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        if (!CAMERA.prepareDepth(source, mc.displayWidth, mc.displayHeight)) return;
        CAMERA.updateSun(mc, partialTicks);
        // PiP retains its camera depth/matrices until the shader final pass ends.
        if (renderingScopedWorld && isModelLensDisplay()) return;
        // Capture color after every world-last effect and the shader final pass.
        primaryColorPending = true;
        renderCameraHeat(partialTicks);
    }

    private static void renderCameraHeat(float partialTicks) {
        ScopeRenderCompatibility.RenderState state = ScopeRenderCompatibility.beginEntityReplay();
        try {
            if (state.isSecondaryRenderAllowed()) CAMERA.renderHeat(partialTicks);
        } finally { ScopeRenderCompatibility.endSecondaryRender(state); }
    }

    /**
     * Render the world once more at the optic's real magnification. Cropping the
     * normal view cannot reveal distant detail, regardless of lens texture size.
     */
    private static void renderScopedWorld(Minecraft mc, float partialTicks) {
        boolean modelLensDisplay = isModelLensDisplay();
        boolean shaderPackInUse = ScopeRenderCompatibility.isShaderPackInUse();
        // Keep DH, sky and translucent rendering on the pack's actual world pipeline.
        // Only the geometry/particle replay is isolated from that pipeline.
        boolean shaderAwareCamera = modelLensDisplay;
        float magnification = getSecondaryCameraMagnification();
        int previousFramebuffer = GL11.glGetInteger(
                EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        Double previousZoom = readScopeField(ScopeFields.CAMERA_ZOOM, mc.entityRenderer);
        Framebuffer previousMainFramebuffer = readScopeField(ScopeFields.MAIN_FRAMEBUFFER, mc);
        RenderGlobalState renderGlobalState = captureRenderGlobalState(mc.renderGlobal);
        boolean previousHideGui = mc.gameSettings.hideGUI;
        boolean previousAdvancedOpenGl = mc.gameSettings.advancedOpengl;
        boolean previousClouds = mc.gameSettings.clouds;
        ScopeRenderCompatibility.RenderState compatibilityState = shaderAwareCamera
                ? ScopeRenderCompatibility.beginShaderAwareSecondaryRender()
                : ScopeRenderCompatibility.beginSecondaryRender();
        if (!compatibilityState.isSecondaryRenderAllowed()) {
            ScopeRenderCompatibility.endSecondaryRender(compatibilityState);
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            scopedSceneCaptured = false;
            return;
        }

        // Angelica/Iris owns targets tied to Minecraft's real framebuffer, so a
        // shader-aware model scope must render there. Because model PiP runs at
        // RenderTick END, preserve the completed primary frame and put it back after
        // the scope camera is captured. Vanilla PiP can use an isolated FBO.
        boolean renderIntoMainFramebuffer = shaderAwareCamera && shaderPackInUse;
        boolean primaryFrameSaved = false;
        if (renderIntoMainFramebuffer) {
            primaryFrameSaved = capturePrimaryFramebuffer(previousMainFramebuffer,
                    mc.displayWidth, mc.displayHeight);
            if (!primaryFrameSaved) {
                ScopeRenderCompatibility.endSecondaryRender(compatibilityState);
                OpenGlHelper.func_153171_g(
                        OpenGlHelper.field_153198_e, previousFramebuffer);
                return;
            }
        }

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        try {
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            MCHeliScopeMarkerCompat.beginScopedMarkers();
            renderingScopedWorld = true;
            mc.gameSettings.hideGUI = true;
            mc.gameSettings.advancedOpengl = false;
            if (compatibilityState.shouldDisableClouds()) {
                mc.gameSettings.clouds = false;
            }

            if (renderIntoMainFramebuffer) {
                previousMainFramebuffer.bindFramebuffer(true);
            } else {
                ensureScopedSceneFramebuffer(mc);
                writeScopeField(ScopeFields.MAIN_FRAMEBUFFER, mc, scopedSceneFramebuffer);
                scopedSceneFramebuffer.bindFramebuffer(true);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            }

            writeScopeField(ScopeFields.CAMERA_ZOOM, mc.entityRenderer,
                    (double)magnification);
            // The normal camera has already received this frame's chunk-build budget.
            mc.entityRenderer.renderWorld(partialTicks, 0L);

            if (modelLensDisplay) {
                Framebuffer completedScene = renderIntoMainFramebuffer
                        ? previousMainFramebuffer : scopedSceneFramebuffer;
                completedScene.bindFramebuffer(true);
                if (!previousHideGui) {
                    MCHeliScopeMarkerCompat.renderMarkers(mc);
                }
                sceneCaptured = captureFramebufferScene(completedScene,
                        mc.displayWidth, mc.displayHeight);
                if (hasThermalVision()) {
                    renderCameraHeat(partialTicks);
                    scopedSceneCaptured = sceneCaptured && CAMERA.heatValid();
                } else {
                    scopedSceneCaptured = sceneCaptured;
                }
            }
        } finally {
            MCHeliScopeMarkerCompat.endScopedMarkers();
            renderingScopedWorld = false;
            mc.gameSettings.hideGUI = previousHideGui;
            mc.gameSettings.advancedOpengl = previousAdvancedOpenGl;
            mc.gameSettings.clouds = previousClouds;
            writeScopeField(ScopeFields.MAIN_FRAMEBUFFER, mc, previousMainFramebuffer);
            writeScopeField(ScopeFields.CAMERA_ZOOM, mc.entityRenderer,
                    previousZoom == null ? 1D : previousZoom);
            restoreRenderGlobalState(mc.renderGlobal, renderGlobalState);
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            GL20.glUseProgram(previousProgram);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopAttrib();
            ScopeRenderCompatibility.endSecondaryRender(compatibilityState);
            if (primaryFrameSaved) {
                restorePrimaryFramebuffer(previousMainFramebuffer,
                        mc.displayWidth, mc.displayHeight);
            }
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
        }
    }

    private static boolean capturePrimaryFramebuffer(Framebuffer source, int width, int height) {
        if (source == null || !ThermalFramebuffers.canBlit()) {
            return false;
        }

        int previousReadFramebuffer = GL11.glGetInteger(
                EXTFramebufferBlit.GL_READ_FRAMEBUFFER_BINDING_EXT);
        int previousDrawFramebuffer = GL11.glGetInteger(
                EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_BINDING_EXT);
        int previousReadBuffer = GL11.glGetInteger(GL11.GL_READ_BUFFER);
        int previousDrawBuffer = GL11.glGetInteger(GL11.GL_DRAW_BUFFER);
        try {
            ensurePrimarySceneRestoreFramebuffer(width, height);
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, source.framebufferObject);
            GL11.glReadBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT,
                    primarySceneRestoreFramebuffer.framebufferObject);
            GL11.glDrawBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);
            ThermalFramebuffers.blit(
                    0, 0, width, height,
                    0, 0, width, height,
                    GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);
            return true;
        } finally {
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, previousReadFramebuffer);
            GL11.glReadBuffer(previousReadBuffer);
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, previousDrawFramebuffer);
            GL11.glDrawBuffer(previousDrawBuffer);
        }
    }

    private static void restorePrimaryFramebuffer(Framebuffer target, int width, int height) {
        if (target == null || primarySceneRestoreFramebuffer == null
                || !ThermalFramebuffers.canBlit()) {
            return;
        }

        int previousReadFramebuffer = GL11.glGetInteger(
                EXTFramebufferBlit.GL_READ_FRAMEBUFFER_BINDING_EXT);
        int previousDrawFramebuffer = GL11.glGetInteger(
                EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_BINDING_EXT);
        int previousReadBuffer = GL11.glGetInteger(GL11.GL_READ_BUFFER);
        int previousDrawBuffer = GL11.glGetInteger(GL11.GL_DRAW_BUFFER);
        try {
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT,
                    primarySceneRestoreFramebuffer.framebufferObject);
            GL11.glReadBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, target.framebufferObject);
            GL11.glDrawBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);
            ThermalFramebuffers.blit(
                    0, 0, width, height,
                    0, 0, width, height,
                    GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);
        } finally {
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, previousReadFramebuffer);
            GL11.glReadBuffer(previousReadBuffer);
            ThermalFramebuffers.bind(
                    EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, previousDrawFramebuffer);
            GL11.glDrawBuffer(previousDrawBuffer);
        }
    }

    private static void ensurePrimarySceneRestoreFramebuffer(int width, int height) {
        if (primarySceneRestoreFramebuffer == null) {
            primarySceneRestoreFramebuffer = new Framebuffer(width, height, false);
            primarySceneRestoreFramebuffer.setFramebufferFilter(GL11.GL_NEAREST);
        } else if (primarySceneRestoreFramebuffer.framebufferWidth != width
                || primarySceneRestoreFramebuffer.framebufferHeight != height) {
            primarySceneRestoreFramebuffer.createBindFramebuffer(width, height);
            primarySceneRestoreFramebuffer.setFramebufferFilter(GL11.GL_NEAREST);
        }
    }

    /** Vanilla-only fallback when the dedicated PiP camera did not produce a frame. */
    private static void capturePrimaryScene(Minecraft mc) {
        sceneCaptured = false;
        scopedSceneCaptured = false;
        if (!isActive(mc) || mc.theWorld == null || mc.renderViewEntity == null
                || !GLContext.getCapabilities().OpenGL20
                || !OpenGlHelper.isFramebufferEnabled()) {
            return;
        }

        int framebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        sceneCaptured = captureFramebufferScene(framebuffer, mc.displayWidth, mc.displayHeight);
    }

    /** Copy the completed color attachment from a known framebuffer into sceneTexture. */
    private static boolean captureFramebufferScene(Framebuffer source, int width, int height) {
        return source != null && captureFramebufferScene(source.framebufferObject, width, height);
    }

    private static boolean captureFramebufferScene(int sourceFramebuffer, int width, int height) {
        return CAMERA.captureColor(sourceFramebuffer, width, height);
    }

    private static RenderGlobalState captureRenderGlobalState(RenderGlobal renderGlobal) {
        RenderGlobalState state = new RenderGlobalState();
        state.worldRenderers = readScopeField(ScopeFields.WORLD_RENDERERS, renderGlobal);
        state.rendererVisibility = captureRendererVisibility(state.worldRenderers);
        state.sortedWorldRenderers = readScopeField(ScopeFields.SORTED_RENDERERS, renderGlobal);
        if (state.sortedWorldRenderers != null) {
            state.sortedWorldRendererOrder = state.sortedWorldRenderers.clone();
        }
        state.worldRenderersToUpdate = readScopeField(
                ScopeFields.RENDERERS_TO_UPDATE, renderGlobal);
        if (state.worldRenderersToUpdate != null) {
            state.worldRenderersToUpdateContents =
                    new ArrayList<Object>(state.worldRenderersToUpdate);
        }
        state.worldRenderersCheckIndex = readScopeField(
                ScopeFields.RENDERER_CHECK_INDEX, renderGlobal);
        state.prevSortX = readScopeField(ScopeFields.PREV_SORT_X, renderGlobal);
        state.prevSortY = readScopeField(ScopeFields.PREV_SORT_Y, renderGlobal);
        state.prevSortZ = readScopeField(ScopeFields.PREV_SORT_Z, renderGlobal);
        state.frustumCheckOffset = readScopeField(
                ScopeFields.FRUSTUM_CHECK_OFFSET, renderGlobal);
        return state;
    }

    private static void restoreRenderGlobalState(RenderGlobal renderGlobal,
                                                 RenderGlobalState state) {
        if (state == null) {
            return;
        }
        restoreRendererVisibility(state.worldRenderers, state.rendererVisibility);
        if (state.sortedWorldRenderers != null
                && state.sortedWorldRendererOrder != null) {
            System.arraycopy(state.sortedWorldRendererOrder, 0,
                    state.sortedWorldRenderers, 0,
                    Math.min(state.sortedWorldRendererOrder.length,
                            state.sortedWorldRenderers.length));
            writeScopeField(ScopeFields.SORTED_RENDERERS,
                    renderGlobal, state.sortedWorldRenderers);
        }
        if (state.worldRenderersToUpdate != null
                && state.worldRenderersToUpdateContents != null) {
            state.worldRenderersToUpdate.clear();
            state.worldRenderersToUpdate.addAll(state.worldRenderersToUpdateContents);
            writeScopeField(ScopeFields.RENDERERS_TO_UPDATE,
                    renderGlobal, state.worldRenderersToUpdate);
        }
        if (state.worldRenderersCheckIndex != null) {
            writeScopeField(ScopeFields.RENDERER_CHECK_INDEX,
                    renderGlobal, state.worldRenderersCheckIndex);
        }
        if (state.prevSortX != null) {
            writeScopeField(ScopeFields.PREV_SORT_X, renderGlobal, state.prevSortX);
        }
        if (state.prevSortY != null) {
            writeScopeField(ScopeFields.PREV_SORT_Y, renderGlobal, state.prevSortY);
        }
        if (state.prevSortZ != null) {
            writeScopeField(ScopeFields.PREV_SORT_Z, renderGlobal, state.prevSortZ);
        }
        if (state.frustumCheckOffset != null) {
            writeScopeField(ScopeFields.FRUSTUM_CHECK_OFFSET,
                    renderGlobal, state.frustumCheckOffset);
        }
    }

    private static byte[] captureRendererVisibility(WorldRenderer[] renderers) {
        if (renderers == null) {
            return null;
        }
        byte[] visibility = new byte[renderers.length];
        for (int i = 0; i < renderers.length; i++) {
            if (renderers[i] != null) {
                visibility[i] = (byte)((renderers[i].isInFrustum ? 1 : 0)
                        | (renderers[i].isVisible ? 2 : 0)
                        | (renderers[i].isWaitingOnOcclusionQuery ? 4 : 0));
            }
        }
        return visibility;
    }

    private static void restoreRendererVisibility(WorldRenderer[] renderers,
                                                   byte[] visibility) {
        if (renderers == null || visibility == null) {
            return;
        }
        int count = Math.min(renderers.length, visibility.length);
        for (int i = 0; i < count; i++) {
            if (renderers[i] != null) {
                renderers[i].isInFrustum = (visibility[i] & 1) != 0;
                renderers[i].isVisible = (visibility[i] & 2) != 0;
                renderers[i].isWaitingOnOcclusionQuery = (visibility[i] & 4) != 0;
            }
        }
    }

    private static final class RenderGlobalState {
        private WorldRenderer[] worldRenderers;
        private byte[] rendererVisibility;
        private WorldRenderer[] sortedWorldRenderers;
        private WorldRenderer[] sortedWorldRendererOrder;
        private List<Object> worldRenderersToUpdate;
        private List<Object> worldRenderersToUpdateContents;
        private Integer worldRenderersCheckIndex;
        private Double prevSortX;
        private Double prevSortY;
        private Double prevSortZ;
        private Integer frustumCheckOffset;
    }

    /** Forge's named reflection helper remaps and searches on every call. */
    private static final class ScopeFields {
        private static final Field CAMERA_ZOOM = find(EntityRenderer.class,
                "cameraZoom", "af", "field_78503_V");
        private static final Field MAIN_FRAMEBUFFER = find(Minecraft.class,
                "framebufferMc", "field_147124_at");
        private static final Field WORLD_RENDERERS = find(RenderGlobal.class,
                "worldRenderers", "field_72765_l");
        private static final Field SORTED_RENDERERS = find(RenderGlobal.class,
                "sortedWorldRenderers", "field_72768_k");
        private static final Field RENDERERS_TO_UPDATE = find(RenderGlobal.class,
                "worldRenderersToUpdate", "field_72767_j");
        private static final Field RENDERER_CHECK_INDEX = find(RenderGlobal.class,
                "worldRenderersCheckIndex", "field_72752_Q");
        private static final Field PREV_SORT_X = find(RenderGlobal.class,
                "prevSortX", "field_72758_d");
        private static final Field PREV_SORT_Y = find(RenderGlobal.class,
                "prevSortY", "field_72759_e");
        private static final Field PREV_SORT_Z = find(RenderGlobal.class,
                "prevSortZ", "field_72756_f");
        private static final Field FRUSTUM_CHECK_OFFSET = find(RenderGlobal.class,
                "frustumCheckOffset", "field_72757_g");

        private static Field find(Class<?> owner, String... names) {
            return ReflectionHelper.findField(owner,
                    ObfuscationReflectionHelper.remapFieldNames(owner.getName(), names));
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> T readScopeField(Field field, Object owner) {
        try {
            return (T)field.get(owner);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void writeScopeField(Field field, Object owner, Object value) {
        try {
            field.set(owner, value);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void render(Minecraft mc, float partialTicks) {
        if (!isModelLensDisplay()) {
            renderCapturedScene(mc, partialTicks);
        }
    }

    static boolean replacesPrimaryScene(Minecraft mc) {
        return isActive(mc) && !isModelLensDisplay();
    }

    private static void renderCapturedScene(Minecraft mc, float partialTicks) {
        if (primaryColorPending && !isModelLensDisplay()) {
            primaryColorPending = false;
            sceneCaptured = CAMERA.captureColor(mc.getFramebuffer().framebufferObject,
                    mc.displayWidth, mc.displayHeight);
        }
        if (!isActive(mc) || !sceneCaptured
                || (hasThermalVision() && !CAMERA.heatValid()) || !ensureShader()) {
            return;
        }
        boolean modelDisplay = isModelLensDisplay();
        boolean colorLensShader = modelDisplay && !hasThermalVision()
                && ensureColorLensShader();
        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        int previousTexture0 = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        GL13.glActiveTexture(GL13.GL_TEXTURE1);
        int previousTexture1 = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        GL13.glActiveTexture(GL13.GL_TEXTURE2);
        int previousTexture2 = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        GL13.glActiveTexture(GL13.GL_TEXTURE3);
        int previousTexture3 = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        GL13.glActiveTexture(previousActiveTexture);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        boolean modelMatricesPushed = false;
        try {
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            if (modelDisplay) {
                ensureModelLensFramebuffer();
            }
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, CAMERA.sceneTexture());
            int targetWidth = mc.displayWidth;
            int targetHeight = mc.displayHeight;
            if (modelDisplay) {
                modelLensFramebuffer.bindFramebuffer(true);
                GL11.glClearColor(0F, 0F, 0F, 1F);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
                targetWidth = MODEL_LENS_SIZE;
                targetHeight = MODEL_LENS_SIZE;
                pushOrthoProjection(targetWidth, targetHeight);
                modelMatricesPushed = true;
            } else {
                mc.entityRenderer.setupOverlayRendering();
            }

            GL11.glColorMask(true, true, true, true);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            float magnification = modelDisplay ? getModelMagnification() : 1F;
            float sourceAspect = (float)mc.displayWidth / Math.max(mc.displayHeight, 1);
            float sampledMagnification = scopedSceneCaptured
                    ? 1F : Math.max(1F, magnification);
            if (colorLensShader) {
                GL20.glUseProgram(colorLensShaderProgram);
                GL20.glUniform1i(colorLensSceneTextureUniform, 0);
                GL20.glUniform1f(colorLensSourceAspectUniform, sourceAspect);
                GL20.glUniform1f(colorLensModelMagnificationUniform, sampledMagnification);
            } else {
                CAMERA.bindDisplay(targetWidth, targetHeight, modelDisplay, isBinocularDisplay(),
                        isVehicleDisplay(), isVehicleDisplay() || flirEnabled, hasThermalVision(),
                        sourceAspect, sampledMagnification);
            }
            if (modelDisplay) {
                drawFullscreenQuad(targetWidth, targetHeight);
                GL20.glUseProgram(0);
                drawModelLensHud(mc, targetWidth, targetHeight);
                modelLensValid = true;
            } else {
                ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
                drawFullscreenQuad(scaled.getScaledWidth(), scaled.getScaledHeight());
            }
        } finally {
            if (modelMatricesPushed) {
                popOrthoProjection();
            }
            if (modelDisplay) {
                OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            }
            GL20.glUseProgram(previousProgram);
            GL11.glPopAttrib();
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture0);
            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture1);
            GL13.glActiveTexture(GL13.GL_TEXTURE2);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture2);
            GL13.glActiveTexture(GL13.GL_TEXTURE3);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture3);
            GL13.glActiveTexture(previousActiveTexture);
            GL11.glMatrixMode(previousMatrixMode);
        }
    }

    private static boolean isActive(Minecraft mc) {
        return mc.thePlayer != null && mc.currentScreen == null
                && (isVehicleDisplay() || FlansModClient.zoomProgress > 0.9F
                && (hasScopeThermalVision() || usesModelScopeLens(FlansModClient.currentScope)));
    }

    private static boolean hasThermalVision() {
        return isVehicleDisplay() || hasScopeThermalVision();
    }

    private static boolean hasScopeThermalVision() {
        if (FlansModClient.currentScope instanceof AttachmentType) {
            return ((AttachmentType)FlansModClient.currentScope).hasThermalVision;
        }
        return FlansModClient.currentScope instanceof GunType
                && ((GunType)FlansModClient.currentScope).hasThermalVision;
    }

    private static boolean isBinocularDisplay() {
        return isVehicleDisplay() || FlansModClient.currentScope instanceof GunType
                && ((GunType)FlansModClient.currentScope).hasThermalVision;
    }

    private static boolean isModelLensDisplay() {
		return !isVehicleDisplay() && usesModelScopeLens(FlansModClient.currentScope);
    }

    private static boolean isVehicleDisplay() {
        return ThermalRenderApi.isVehicleCameraActive()
                && !(FlansModClient.zoomProgress > 0.9F && (hasScopeThermalVision()
                || usesModelScopeLens(FlansModClient.currentScope)));
    }

    private static float getModelMagnification() {
        return FlansModClient.currentScope == null ? 1F
                : Math.max(1F, FlansModClient.lastZoomLevel
                * FlansModClient.currentScope.getFOVFactor());
    }

    private static float getSecondaryCameraMagnification() {
        float desiredMagnification = getModelMagnification();
        if (!usesExplicitMagnification()) {
            return desiredMagnification;
        }

        // The secondary camera fills the display before being reduced into the
        // physical lens. Compensate for that reduction so `Magnification 4` is
        // visually 4x relative to the 1x world surrounding the optic.
        float lensDiameterFraction = hasThermalVision() && !hasPictureInPictureLensGeometry()
                ? POST_COMPOSITE_THERMAL_RADIUS_FRACTION * 2F : MODEL_SCOPE_LENS_DIAMETER_FRACTION;
        if (ScopeRenderCompatibility.isShaderPackInUse()) lensDiameterFraction *= POST_COMPOSITE_LENS_INSET;
        return desiredMagnification / Math.max(0.1F, lensDiameterFraction);
    }

    private static boolean usesExplicitMagnification() {
        if (FlansModClient.currentScope instanceof AttachmentType) {
            return ((AttachmentType)FlansModClient.currentScope).magnification > 0F;
        }
        return FlansModClient.currentScope instanceof GunType
                && ((GunType)FlansModClient.currentScope).magnification > 0F;
    }

    private static boolean isColorPictureInPictureDisplay() {
        if (isVehicleDisplay()) return false;
        if (hasThermalVision()) {
            return false;
        }
        if (FlansModClient.currentScope instanceof AttachmentType) {
            AttachmentType attachment = (AttachmentType)FlansModClient.currentScope;
            return attachment.pictureInPicture && !attachment.thermalOnModel;
        }
        return FlansModClient.currentScope instanceof GunType
                && ((GunType)FlansModClient.currentScope).pictureInPicture;
    }

	public static boolean usesModelScopeLens(IScope scope) {
		if (scope instanceof AttachmentType) {
			AttachmentType attachment = (AttachmentType)scope;
			return attachment.thermalOnModel || attachment.pictureInPicture;
		}
		return scope instanceof GunType && ((GunType)scope).pictureInPicture;
    }

    public static boolean isModelLensActive() {
        return isActive(Minecraft.getMinecraft()) && isModelLensDisplay();
    }

    public static boolean isRenderingScopedWorld() {
        return renderingScopedWorld;
    }

    public static void beginModelLensFrame() {
        postCompositeLensGeometryValid = false;
        primaryColorPending = false;
    }

    /** Window coordinates use the same bottom-left origin as MCHR projections. */
    static boolean isInsideModelLens(float windowX, float windowY) {
        if (!postCompositeLensGeometryValid || !isModelLensActive()) {
            return false;
        }
        Minecraft mc = Minecraft.getMinecraft();
        float x = windowX * 2F / mc.displayWidth - 1F;
        float y = windowY * 2F / mc.displayHeight - 1F;
        boolean inside = false;
        for (int i = 1, j = POST_COMPOSITE_LENS_SEGMENTS;
                i <= POST_COMPOSITE_LENS_SEGMENTS; j = i++) {
            float xi = postCompositeLensNdcX[i];
            float yi = postCompositeLensNdcY[i];
            float xj = postCompositeLensNdcX[j];
            float yj = postCompositeLensNdcY[j];
            if ((yi > y) != (yj > y)
                    && x < (xj - xi) * (y - yi) / (yj - yi) + xi) {
                inside = !inside;
            }
        }
        return inside;
    }

    public static int getModelLensTexture() {
        return modelLensValid && modelLensFramebuffer != null
                ? modelLensFramebuffer.framebufferTexture : -1;
    }

    /** Thermal images composite late on every backend; color PiP also does so
     * with shader packs to avoid applying their tone mapping a second time. */
    public static boolean usesPostCompositeModelLens() {
        return isModelLensActive() && modelLensValid && (hasThermalVision()
                || hasPictureInPictureLensGeometry() && ScopeRenderCompatibility.isShaderPackInUse());
    }

    /**
     * Capture the projected aperture for primary HUD marker filtering and the
     * late shader PiP pass. The latter cannot use depth to clip the scope housing,
     * so it follows the model-space aperture while ADS alignment is still moving.
     */
    public static void capturePostCompositeModelLensGeometry(float lensX, float lensY,
            float lensZ, float lensRadius, float scale) {
        captureModelLensGeometry(lensX * scale, lensY * scale, lensZ * scale,
                0F, 0F, 1F, 0F, 1F, 0F, lensRadius * scale);
    }

    /** Model-local right/up vectors let custom optics share the exact late aperture. */
    public static void captureModelLensGeometry(float x, float centerY, float centerZ,
            float rightX, float rightY, float rightZ, float upX, float upY, float upZ, float radius) {
        if (!isModelLensActive() || radius <= 0F) {
            postCompositeLensGeometryValid = false;
            return;
        }

        postCompositeLensModelView.clear();
        postCompositeLensProjection.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, postCompositeLensModelView);
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, postCompositeLensProjection);

        radius *= ScopeRenderCompatibility.isShaderPackInUse() ? POST_COMPOSITE_LENS_INSET : 1F;
        if (!projectPostCompositeLensVertex(x, centerY, centerZ, 0)) {
            postCompositeLensGeometryValid = false;
            return;
        }

        for (int index = 0; index <= POST_COMPOSITE_LENS_SEGMENTS; index++) {
            double angle = Math.PI * 2D * index / POST_COMPOSITE_LENS_SEGMENTS;
            float horizontal = (float)Math.cos(angle);
            float vertical = (float)Math.sin(angle);
            if (!projectPostCompositeLensVertex(x + (horizontal * rightX + vertical * upX) * radius,
                    centerY + (horizontal * rightY + vertical * upY) * radius,
                    centerZ + (horizontal * rightZ + vertical * upZ) * radius, index + 1)) {
                postCompositeLensGeometryValid = false;
                return;
            }
        }
        postCompositeLensGeometryValid = true;
    }

    private static boolean projectPostCompositeLensVertex(float x, float y, float z,
            int index) {
        float eyeX = postCompositeLensModelView.get(0) * x
                + postCompositeLensModelView.get(4) * y
                + postCompositeLensModelView.get(8) * z
                + postCompositeLensModelView.get(12);
        float eyeY = postCompositeLensModelView.get(1) * x
                + postCompositeLensModelView.get(5) * y
                + postCompositeLensModelView.get(9) * z
                + postCompositeLensModelView.get(13);
        float eyeZ = postCompositeLensModelView.get(2) * x
                + postCompositeLensModelView.get(6) * y
                + postCompositeLensModelView.get(10) * z
                + postCompositeLensModelView.get(14);
        float eyeW = postCompositeLensModelView.get(3) * x
                + postCompositeLensModelView.get(7) * y
                + postCompositeLensModelView.get(11) * z
                + postCompositeLensModelView.get(15);

        float clipX = postCompositeLensProjection.get(0) * eyeX
                + postCompositeLensProjection.get(4) * eyeY
                + postCompositeLensProjection.get(8) * eyeZ
                + postCompositeLensProjection.get(12) * eyeW;
        float clipY = postCompositeLensProjection.get(1) * eyeX
                + postCompositeLensProjection.get(5) * eyeY
                + postCompositeLensProjection.get(9) * eyeZ
                + postCompositeLensProjection.get(13) * eyeW;
        float clipW = postCompositeLensProjection.get(3) * eyeX
                + postCompositeLensProjection.get(7) * eyeY
                + postCompositeLensProjection.get(11) * eyeZ
                + postCompositeLensProjection.get(15) * eyeW;
        if (clipW <= 0.00001F) {
            return false;
        }

        float ndcX = clipX / clipW;
        float ndcY = clipY / clipW;
        if (Float.isNaN(ndcX) || Float.isInfinite(ndcX)
                || Float.isNaN(ndcY) || Float.isInfinite(ndcY)) {
            return false;
        }
        postCompositeLensNdcX[index] = ndcX;
        postCompositeLensNdcY[index] = ndcY;
        return true;
    }

    private static boolean hasPictureInPictureLensGeometry() {
        if (FlansModClient.currentScope instanceof AttachmentType) {
            return ((AttachmentType)FlansModClient.currentScope).pictureInPicture;
        }
        return FlansModClient.currentScope instanceof GunType
                && ((GunType)FlansModClient.currentScope).pictureInPicture;
    }

    public static void renderPostCompositeModelLens(Minecraft mc) {
        if (!usesPostCompositeModelLens() || mc.currentScreen != null
                || modelLensFramebuffer == null) {
            return;
        }

        // Use the physical aperture, including custom thermal optics. The centered
        // fallback supports older content models that do not report an aperture.
        boolean useProjectedGeometry = postCompositeLensGeometryValid;
        if (!useProjectedGeometry && !hasThermalVision()) {
            return;
        }

        ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        Framebuffer target = mc.getFramebuffer();
        renderLensImage(target.framebufferObject, target.framebufferWidth, target.framebufferHeight,
                scaled.getScaledWidth(), scaled.getScaledHeight(), modelLensFramebuffer.framebufferTexture,
                useProjectedGeometry);
    }

    /** Pure graphics boundary; camera selection and ADS state stay in the caller. */
    static void renderLensImage(int targetFramebuffer, int targetWidth, int targetHeight,
            int width, int height, int texture, boolean useProjectedGeometry) {
        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        int previousTexture0 = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        boolean separateRead = ThermalFramebuffers.canBlit();
        int previousReadFramebuffer = separateRead ? GL11.glGetInteger(
                EXTFramebufferBlit.GL_READ_FRAMEBUFFER_BINDING_EXT) : previousFramebuffer;

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        pushOrthoProjection(width, height);
        try {
            ThermalFramebuffers.bind(EXTFramebufferObject.GL_FRAMEBUFFER_EXT, targetFramebuffer);
            GL11.glViewport(0, 0, targetWidth, targetHeight);
            if (!bindPostCompositeLens(texture)) return;

            GL11.glBegin(GL11.GL_TRIANGLE_FAN);
            GL11.glTexCoord2f(0.5F, 0.5F);
            if (useProjectedGeometry) {
                GL11.glVertex3f(toOverlayX(postCompositeLensNdcX[0], width),
                        toOverlayY(postCompositeLensNdcY[0], height), -90F);
                for (int index = 0; index <= POST_COMPOSITE_LENS_SEGMENTS; index++) {
                    double angle = Math.PI * 2D * index / POST_COMPOSITE_LENS_SEGMENTS;
                    float horizontal = (float)Math.cos(angle);
                    float vertical = (float)Math.sin(angle);
                    GL11.glTexCoord2f(0.5F + horizontal * 0.5F,
                            0.5F + vertical * 0.5F);
                    GL11.glVertex3f(toOverlayX(postCompositeLensNdcX[index + 1], width),
                            toOverlayY(postCompositeLensNdcY[index + 1], height), -90F);
                }
            } else {
                float centerX = width * 0.5F;
                float centerY = height * 0.5F;
                float radius = height * POST_COMPOSITE_THERMAL_RADIUS_FRACTION;
                GL11.glVertex3f(centerX, centerY, -90F);
                for (int index = 0; index <= 64; index++) {
                    double angle = Math.PI * 2D * index / 64D;
                    float horizontal = (float)Math.cos(angle);
                    float vertical = (float)Math.sin(angle);
                    GL11.glTexCoord2f(0.5F + horizontal * 0.5F,
                            0.5F + vertical * 0.5F);
                    GL11.glVertex3f(centerX + horizontal * radius,
                            centerY - vertical * radius, -90F);
                }
            }
            GL11.glEnd();
        } finally {
            postCompositeLensGeometryValid = false;
            popOrthoProjection();
            GL20.glUseProgram(previousProgram);
            // Draw-buffer attributes belong to the caller's FBO (GL_BACK on a window).
            if (separateRead) {
                ThermalFramebuffers.bind(EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, previousReadFramebuffer);
                ThermalFramebuffers.bind(EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, previousFramebuffer);
            } else OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            GL11.glPopAttrib();
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture0);
            GL13.glActiveTexture(previousActiveTexture);
            GL11.glMatrixMode(previousMatrixMode);
        }
    }

    /** Shader packs leave unrelated samplers enabled; fixed-function texturing
     * multiplies those into the lens. An explicit pass samples only this image. */
    static boolean bindPostCompositeLens(int texture) {
        if (!ensureColorLensShader()) return false;
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);
        GL20.glUseProgram(colorLensShaderProgram);
        GL20.glUniform1i(colorLensSceneTextureUniform, 0);
        GL20.glUniform1f(colorLensSourceAspectUniform, 1F);
        GL20.glUniform1f(colorLensModelMagnificationUniform, 1F);
        GL11.glColorMask(true, true, true, true);
        GL11.glDisable(GL11.GL_FOG);
        GL11.glDisable(GL11.GL_SCISSOR_TEST);
        GL11.glDisable(GL11.GL_STENCIL_TEST);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glColor4f(1F, 1F, 1F, 1F);
        return true;
    }

    private static float toOverlayX(float ndcX, int width) {
        return (ndcX * 0.5F + 0.5F) * width;
    }

    private static float toOverlayY(float ndcY, int height) {
        return (0.5F - ndcY * 0.5F) * height;
    }

    public static boolean isFlirEnabled() {
        return flirEnabled;
    }

    public static boolean toggleFlir() {
        flirEnabled = !flirEnabled;
        return flirEnabled;
    }

    public static boolean isThermalScopeActive(Minecraft mc) {
		return isActive(mc) && hasThermalVision();
    }

    public static void renderStatus(Minecraft mc) {
        if (!isActive(mc) || isModelLensDisplay() || isVehicleDisplay()) {
            return;
        }
        ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        String key = GameSettings.getKeyDisplayString(KeyInputHandler.thermalScopeKey.getKeyCode());
        String text = (flirEnabled ? "FLIR ON" : "FLIR OFF") + " [" + key + "]";
        int x = (scaled.getScaledWidth() - mc.fontRenderer.getStringWidth(text)) / 2;
        float displayTop = isBinocularDisplay() ? 0.145F : 0.3535F;
        int y = Math.max(2, Math.round(scaled.getScaledHeight() * displayTop) - 12);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            mc.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            mc.fontRenderer.drawStringWithShadow(text, x, y,
                    flirEnabled ? 0xFFF4D0 : 0xC9C9C9);
        } finally {
            GL11.glPopAttrib();
        }
    }

    private static void ensureModelLensFramebuffer() {
        if (modelLensFramebuffer == null) {
            modelLensFramebuffer = new Framebuffer(MODEL_LENS_SIZE, MODEL_LENS_SIZE, false);
            modelLensFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        } else if (modelLensFramebuffer.framebufferWidth != MODEL_LENS_SIZE
                || modelLensFramebuffer.framebufferHeight != MODEL_LENS_SIZE) {
            modelLensFramebuffer.createBindFramebuffer(MODEL_LENS_SIZE, MODEL_LENS_SIZE);
            modelLensFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, modelLensFramebuffer.framebufferTexture);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
    }

    private static void ensureScopedSceneFramebuffer(Minecraft mc) {
        if (scopedSceneFramebuffer == null) {
            scopedSceneFramebuffer = new Framebuffer(mc.displayWidth, mc.displayHeight, true);
            scopedSceneFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        } else if (scopedSceneFramebuffer.framebufferWidth != mc.displayWidth
                || scopedSceneFramebuffer.framebufferHeight != mc.displayHeight) {
            scopedSceneFramebuffer.createBindFramebuffer(mc.displayWidth, mc.displayHeight);
            scopedSceneFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        }
    }

    static boolean ensureShader() { return ThermalCamera.ensureShader(); }

    private static boolean ensureColorLensShader() {
        if (colorLensShaderProgram >= 0) {
            return true;
        }
        if (colorLensShaderUnavailable) {
            return false;
        }
        int vertex = compileShader(GL20.GL_VERTEX_SHADER, VERTEX_SHADER);
        int fragment = compileShader(GL20.GL_FRAGMENT_SHADER, COLOR_LENS_FRAGMENT_SHADER);
        if (vertex < 0 || fragment < 0) {
            if (vertex >= 0) GL20.glDeleteShader(vertex);
            if (fragment >= 0) GL20.glDeleteShader(fragment);
            colorLensShaderUnavailable = true;
            return false;
        }
        int program = GL20.glCreateProgram();
        GL20.glAttachShader(program, vertex);
        GL20.glAttachShader(program, fragment);
        GL20.glLinkProgram(program);
        GL20.glDeleteShader(vertex);
        GL20.glDeleteShader(fragment);
        if (GL20.glGetProgrami(program, GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
            GL20.glDeleteProgram(program);
            colorLensShaderUnavailable = true;
            return false;
        }
        colorLensShaderProgram = program;
        colorLensSceneTextureUniform = GL20.glGetUniformLocation(program, "sceneTexture");
        colorLensSourceAspectUniform = GL20.glGetUniformLocation(program, "sourceAspect");
        colorLensModelMagnificationUniform = GL20.glGetUniformLocation(program, "modelMagnification");
        return true;
    }

    private static int compileShader(int type, String source) {
        int shader = GL20.glCreateShader(type);
        GL20.glShaderSource(shader, source);
        GL20.glCompileShader(shader);
        if (GL20.glGetShaderi(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
            com.flansmod.common.FlansMod.log("[Thermal] shader compile failed: " + GL20.glGetShaderInfoLog(shader, 4096));
            GL20.glDeleteShader(shader);
            return -1;
        }
        return shader;
    }

    private static void drawFullscreenQuad(int width, int height) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0D, height, -90D, 0D, 0D);
        tessellator.addVertexWithUV(width, height, -90D, 1D, 0D);
        tessellator.addVertexWithUV(width, 0D, -90D, 1D, 1D);
        tessellator.addVertexWithUV(0D, 0D, -90D, 0D, 1D);
        tessellator.draw();
    }

    private static void pushOrthoProjection(int width, int height) {
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho(0D, width, height, 0D, -1000D, 1000D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
    }

    private static void popOrthoProjection() {
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPopMatrix();
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPopMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
    }

    private static void drawModelLensHud(Minecraft mc, int width, int height) {
		if (!hasThermalVision()) {
			drawScopeReticle(mc, width, height);
			return;
		}

        String key = GameSettings.getKeyDisplayString(KeyInputHandler.thermalScopeKey.getKeyCode());
        String text = (flirEnabled ? "FLIR ON" : "FLIR OFF") + " [" + key + "]";

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        float textScale = width / 192F;
        GL11.glPushMatrix();
        GL11.glScalef(textScale, textScale, 1F);
        int scaledWidth = (int)(width / textScale);
        int textX = (scaledWidth - mc.fontRenderer.getStringWidth(text)) / 2;
        int textY = (int)(height * 0.14F / textScale);
        mc.fontRenderer.drawStringWithShadow(text, textX, textY,
                flirEnabled ? 0xFFF4D0 : 0xC9C9C9);
        GL11.glPopMatrix();

        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glColor4f(0.3F, 1F, 0.35F, 1F);
        float reticleScale = width / 768F;
        GL11.glLineWidth(5F);
        int centerX = width / 2;
        int centerY = height / 2;
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex2f(centerX - 112F * reticleScale, centerY);
        GL11.glVertex2f(centerX - 12F * reticleScale, centerY);
        GL11.glVertex2f(centerX + 12F * reticleScale, centerY);
        GL11.glVertex2f(centerX + 112F * reticleScale, centerY);
        GL11.glVertex2f(centerX, centerY + 12F * reticleScale);
        GL11.glVertex2f(centerX, centerY + 112F * reticleScale);
        for (int offset = 32; offset <= 80; offset += 16) {
            float scaledOffset = offset * reticleScale;
            float tick = 5F * reticleScale;
            GL11.glVertex2f(centerX - scaledOffset, centerY - tick);
            GL11.glVertex2f(centerX - scaledOffset, centerY + tick);
            GL11.glVertex2f(centerX + scaledOffset, centerY - tick);
            GL11.glVertex2f(centerX + scaledOffset, centerY + tick);
            GL11.glVertex2f(centerX - tick, centerY + scaledOffset);
            GL11.glVertex2f(centerX + tick, centerY + scaledOffset);
        }
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINE_LOOP);
        for (int index = 0; index < 24; index++) {
            double angle = Math.PI * 2D * index / 24D;
            GL11.glVertex2d(centerX + Math.cos(angle) * 9D * reticleScale,
                    centerY + Math.sin(angle) * 9D * reticleScale);
        }
        GL11.glEnd();
        GL11.glColor4f(1F, 1F, 1F, 1F);
    }

	private static void drawScopeReticle(Minecraft mc, int width, int height) {
		String reticle = getPictureInPictureReticle(FlansModClient.currentScope);
		if (reticle == null) {
			return;
		}

		mc.getTextureManager().bindTexture(FlansModResourceHandler.getScope(reticle));
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1F, 1F, 1F, 1F);
		float reticleScale = getPictureInPictureReticleScale(FlansModClient.currentScope);
		double left = width * (1D - reticleScale) * 0.5D;
		double top = height * (1D - reticleScale) * 0.5D;
		double right = left + width * reticleScale;
		double bottom = top + height * reticleScale;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(left, bottom, -89D, 0D, 1D);
		tessellator.addVertexWithUV(right, bottom, -89D, 1D, 1D);
		tessellator.addVertexWithUV(right, top, -89D, 1D, 0D);
		tessellator.addVertexWithUV(left, top, -89D, 0D, 0D);
		tessellator.draw();
	}

	private static String getPictureInPictureReticle(IScope scope) {
		if (scope instanceof AttachmentType) {
			return ((AttachmentType)scope).pictureInPictureReticle;
		}
		if (scope instanceof GunType) {
			return ((GunType)scope).pictureInPictureReticle;
		}
		return null;
	}

	private static float getPictureInPictureReticleScale(IScope scope) {
		if (scope instanceof AttachmentType) {
			return Math.max(0.1F, ((AttachmentType)scope).pictureInPictureReticleScale);
		}
		if (scope instanceof GunType) {
			return Math.max(0.1F, ((GunType)scope).pictureInPictureReticleScale);
		}
		return 1F;
	}
}
