package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Optional isolation for renderers that cannot safely render a second camera. */
@SideOnly(Side.CLIENT)
final class ScopeRenderCompatibility {
    private static boolean irisChecked;
    private static Method irisGetInstance;
    private static Method irisShaderPackInUse;
    private static Method irisGetPipelineManager;
    private static Method irisGetCurrentDimensionName;
    private static Method irisGetCloudSetting;
    private static Constructor<?> fixedPipelineConstructor;
    private static Field pipelineField;
    private static Field pipelinesPerDimensionField;
    private static Field lastPreparedDimensionField;
    private static Object blockRenderingSettings;
    private static Field[] blockRenderingSettingFields;
    private static Object renderingState;
    private static Method renderingStateGetProjectionBuffer;
    private static Method renderingStateGetModelViewBuffer;
    private static Method renderingStateGetProjectionMatrix;
    private static Method renderingStateGetModelViewMatrix;
    private static Method renderingStateGetFov;
    private static Method renderingStateSetProjectionMatrix;
    private static Method renderingStateSetModelViewMatrix;
    private static Method renderingStateSetFov;
    private static Method angelicaSetProjectionMatrix;
    private static Method angelicaSetModelViewMatrix;
    private static Object systemFrameCounter;
    private static Object systemTimer;
    private static Field systemFrameCounterCountField;
    private static Field systemTimerFrameTimeCounterField;
    private static Field systemTimerLastFrameTimeField;
    private static Field systemTimerLastStartTimeField;

    // Optional Angelica temporal-history isolation for shader-aware PiP.
    private static Field shaderPipelineParityStateField;
    private static Field shaderPipelineRenderTargetsField;
    private static Field parityOddField;
    private static Method parityBuffersMethod;
    private static Method renderTargetsGetMethod;
    private static Method renderTargetGetMainTextureMethod;
    private static Method renderTargetGetAltTextureMethod;
    private static final Map<Integer, TemporalTextureBackup> shaderTemporalBackups =
            new HashMap<Integer, TemporalTextureBackup>();
    private static Object shaderTemporalBackupPipeline;
    private static int shaderTemporalFramebuffer = -1;

    private static boolean celeritasChecked;
    private static Method celeritasGetInstanceOrNull;
    private static Field celeritasCurrentViewportField;
    private static Field celeritasLastCameraStateField;
    private static Field celeritasRenderSectionManagerField;
    private static Field celeritasRenderListManagerField;
    private static Field celeritasShadowRenderListManagerField;
    private static Field celeritasShadowPassRanThisFrameField;
    private static Field celeritasNeedsUpdateField;
    private static Method celeritasFinishAllGraphUpdates;
    private static Method celeritasIsTerrainRenderComplete;
    private static Method celeritasRebuildListsIsEmpty;
    private static Field celeritasRenderListsField;
    private static Field celeritasRebuildListsField;
    private static Field celeritasLastUpdatedFrameField;
    private static Field celeritasVisibilitySnapshotField;
    private static Field celeritasBuildResultsField;
    private static Field celeritasAsyncSubmittedTasksField;
    private static Field celeritasSectionsRequestingUpdateField;
    private static Field celeritasLastCameraPositionField;
    private static Field celeritasCameraPositionField;

    private static boolean distantHorizonsChecked;
    private static Field distantHorizonsModelViewField;
    private static Field distantHorizonsProjectionField;
    private static Object distantHorizonsRenderState;
    private static Field distantHorizonsRenderStateModelViewField;
    private static Field distantHorizonsRenderStateProjectionField;
    private static Field distantHorizonsRenderStateLevelField;
    private static Object distantHorizonsClientApi;
    private static Field distantHorizonsShadersEnabledField;
    private static Object distantHorizonsRenderProxy;
    private static Field distantHorizonsDeferTransparentField;
    private ScopeRenderCompatibility() {
    }

    /**
     * Capture the shared renderer state around a second camera while deliberately
     * leaving the configured Iris/Angelica pipeline active. Color PiP uses this
     * path so the scope receives the same shader-pack lighting and post process as
     * the main camera.
     */
    static RenderState beginShaderAwareSecondaryRender() {
        RenderState state = captureSecondaryState(true);
        prepareShaderTemporalIsolation(state);
        return state;
    }

    /**
     * Prevent a nested thermal/helper pass from re-entering the active shader
     * pipeline. Distant Horizons remains enabled so its LOD terrain can render
     * through the temporary fixed-function pipeline.
     */
    static RenderState beginSecondaryRender() {
        RenderState state = captureSecondaryState(false);
        boolean shaderPackInUse = isShaderPackInUse();
        if (!shaderPackInUse) {
            return state;
        }

        try {
            Object manager = irisGetPipelineManager.invoke(null);
            String dimension = (String)irisGetCurrentDimensionName.invoke(null);
            @SuppressWarnings("unchecked")
            Map<Object, Object> pipelines =
                    (Map<Object, Object>)pipelinesPerDimensionField.get(manager);

            state.irisManager = manager;
            state.irisDimension = dimension;
            state.irisPipeline = pipelineField.get(manager);
            state.disableClouds = "OFF".equals(String.valueOf(
                    irisGetCloudSetting.invoke(state.irisPipeline)));
            state.irisLastPreparedDimension = lastPreparedDimensionField.get(manager);
            state.irisHadDimensionPipeline = pipelines.containsKey(dimension);
            state.irisDimensionPipeline = pipelines.get(dimension);
            state.irisIsolated = true;
            state.fixedPipeline = fixedPipelineConstructor.newInstance();

            pipelines.put(dimension, state.fixedPipeline);
            pipelineField.set(manager, state.fixedPipeline);
            lastPreparedDimensionField.set(manager, dimension);
            if (state.distantHorizonsStateCaptured) {
                // This is a temporary camera, not a user shader toggle. DH would
                // otherwise clear its terrain cache on both sides of every scope pass.
                distantHorizonsShadersEnabledField.setBoolean(distantHorizonsClientApi, false);
                distantHorizonsDeferTransparentField.setBoolean(distantHorizonsRenderProxy, false);
            }
        } catch (ReflectiveOperationException ignored) {
            restoreIris(state);
            state.secondaryRenderAllowed = false;
        } catch (LinkageError ignored) {
            restoreIris(state);
            state.secondaryRenderAllowed = false;
        }
        return state;
    }

    private static RenderState captureSecondaryState(boolean reusePrimaryTerrain) {
        // Initialise Iris reflection first so RenderingState/SystemTime handles are
        // available when shaders are installed, even if the pack is currently off.
        isShaderPackInUse();
        RenderState state = new RenderState();
        captureRenderingState(state);
        captureSystemTime(state);
        captureDistantHorizonsState(state);
        captureCeleritasState(state, reusePrimaryTerrain);
        if (blockRenderingSettings != null && blockRenderingSettingFields != null) {
            try {
                state.blockRenderingSettings = blockRenderingSettings;
                state.blockRenderingSettingValues = captureBlockRenderingSettings();
            } catch (IllegalAccessException ignored) {
                state.blockRenderingSettings = null;
                state.blockRenderingSettingValues = null;
            }
        }
        return state;
    }

    static void endSecondaryRender(RenderState state) {
        if (state == null) {
            return;
        }
        restoreShaderTemporalIsolation(state);
        restoreIris(state);
        restoreBlockRenderingSettings(state);
        restoreRenderingState(state);
        restoreSystemTime(state);
        restoreDistantHorizonsState(state);
        restoreCeleritasState(state);
    }

    /**
     * A second camera is safe only while Celeritas has no primary-camera terrain
     * work waiting to be scheduled, built, uploaded, or published. Rendering while
     * those queues are active lets the nested pass consume work that the next real
     * camera frame expects, which can expose empty sections for a single frame.
     */
    static boolean shouldDeferColorPictureInPictureRender() {
        initialiseCeleritasReflection();
        if (celeritasGetInstanceOrNull == null) {
            return false;
        }
        try {
            Object renderer = celeritasGetInstanceOrNull.invoke(null);
            if (renderer == null) {
                return false;
            }
            Object sectionManager = celeritasRenderSectionManagerField.get(renderer);
            if (sectionManager == null) {
                return false;
            }
            Object listManager = celeritasRenderListManagerField.get(sectionManager);

            if (celeritasIsTerrainRenderComplete != null
                    && !Boolean.TRUE.equals(
                            celeritasIsTerrainRenderComplete.invoke(renderer))) {
                return true;
            }
            if (hasPendingCollection(celeritasBuildResultsField, sectionManager)
                    || hasPendingCollection(celeritasAsyncSubmittedTasksField, sectionManager)
                    || hasPendingCollection(
                            celeritasSectionsRequestingUpdateField, sectionManager)) {
                return true;
            }
            if (listManager != null && hasPendingRebuilds(listManager)) {
                return true;
            }
        } catch (ReflectiveOperationException ignored) {
            // Compatibility probing must fail open; the existing snapshot/restore
            // path remains the fallback on older Celeritas revisions.
        } catch (LinkageError ignored) {
            // Optional compatibility only.
        }
        return false;
    }

    private static boolean hasPendingCollection(Field field, Object owner)
            throws IllegalAccessException {
        if (field == null || owner == null) {
            return false;
        }
        Object value = field.get(owner);
        return value instanceof Collection && !((Collection<?>)value).isEmpty();
    }

    private static boolean hasPendingRebuilds(Object listManager)
            throws ReflectiveOperationException {
        if (listManager == null || celeritasRebuildListsField == null
                || celeritasRebuildListsIsEmpty == null) {
            return false;
        }
        Object rebuildLists = celeritasRebuildListsField.get(listManager);
        return rebuildLists != null && !Boolean.TRUE.equals(
                celeritasRebuildListsIsEmpty.invoke(rebuildLists));
    }

    static boolean isShaderPackInUse() {
        initialiseIrisReflection();
        if (irisGetInstance == null || irisShaderPackInUse == null) {
            return false;
        }
        try {
            Object api = irisGetInstance.invoke(null);
            return Boolean.TRUE.equals(irisShaderPackInUse.invoke(api));
        } catch (ReflectiveOperationException ignored) {
            return false;
        } catch (LinkageError ignored) {
            return false;
        }
    }

    private static void initialiseIrisReflection() {
        if (irisChecked) {
            return;
        }
        irisChecked = true;
        try {
            ClassLoader loader = ScopeRenderCompatibility.class.getClassLoader();
            Class<?> irisApi = Class.forName(
                    "net.irisshaders.iris.api.v0.IrisApi", false, loader);
            Class<?> iris = Class.forName("net.coderbot.iris.Iris", false, loader);
            Class<?> pipelineManager = Class.forName(
                    "net.coderbot.iris.pipeline.PipelineManager", false, loader);
            Class<?> fixedPipeline = Class.forName(
                    "net.coderbot.iris.pipeline.FixedFunctionWorldRenderingPipeline",
                    false, loader);
            Class<?> blockSettings = Class.forName(
                    "net.coderbot.iris.block_rendering.BlockRenderingSettings",
                    false, loader);
            Class<?> angelicaRenderingState = Class.forName(
                    "com.gtnewhorizons.angelica.rendering.RenderingState",
                    false, loader);
            Class<?> angelicaGlStateManager = Class.forName(
                    "com.gtnewhorizons.angelica.glsm.GLStateManager",
                    false, loader);
            Class<?> matrix4fc = Class.forName("org.joml.Matrix4fc", false, loader);
            Class<?> systemTimeUniforms = Class.forName(
                    "net.coderbot.iris.uniforms.SystemTimeUniforms", false, loader);
            irisGetInstance = irisApi.getMethod("getInstance");
            irisShaderPackInUse = irisApi.getMethod("isShaderPackInUse");
            irisGetPipelineManager = iris.getMethod("getPipelineManager");
            irisGetCurrentDimensionName = iris.getMethod("getCurrentDimensionName");
            irisGetCloudSetting = Class.forName(
                    "net.coderbot.iris.pipeline.WorldRenderingPipeline", false, loader)
                    .getMethod("getCloudSetting");
            fixedPipelineConstructor = fixedPipeline.getConstructor();
            pipelineField = getAccessibleField(pipelineManager, "pipeline");
            pipelinesPerDimensionField = getAccessibleField(
                    pipelineManager, "pipelinesPerDimension");
            lastPreparedDimensionField = getAccessibleField(
                    pipelineManager, "lastPreparedDimension");
            blockRenderingSettings = blockSettings.getField("INSTANCE").get(null);
            blockRenderingSettingFields = new Field[] {
                    getAccessibleField(blockSettings, "disableDirectionalShading"),
                    getAccessibleField(blockSettings, "useSeparateAo"),
                    getAccessibleField(blockSettings, "ambientOcclusionLevel"),
                    getAccessibleField(blockSettings, "useExtendedVertexFormat"),
                    getAccessibleField(blockSettings, "blockTypeIds"),
                    getAccessibleField(blockSettings, "reloadRequired")
            };
            renderingState = angelicaRenderingState.getField("INSTANCE").get(null);
            renderingStateGetProjectionBuffer = angelicaRenderingState.getMethod(
                    "getProjectionBuffer");
            renderingStateGetModelViewBuffer = angelicaRenderingState.getMethod(
                    "getModelViewBuffer");
            renderingStateGetProjectionMatrix = angelicaRenderingState.getMethod(
                    "getProjectionMatrix");
            renderingStateGetModelViewMatrix = angelicaRenderingState.getMethod(
                    "getModelViewMatrix");
            renderingStateGetFov = angelicaRenderingState.getMethod("getFov");
            renderingStateSetProjectionMatrix = angelicaRenderingState.getMethod(
                    "setProjectionMatrix", FloatBuffer.class);
            renderingStateSetModelViewMatrix = angelicaRenderingState.getMethod(
                    "setModelViewMatrix", FloatBuffer.class);
            renderingStateSetFov = angelicaRenderingState.getMethod(
                    "setFov", Float.TYPE);
            angelicaSetProjectionMatrix = angelicaGlStateManager.getMethod(
                    "setProjectionMatrix", matrix4fc);
            angelicaSetModelViewMatrix = angelicaGlStateManager.getMethod(
                    "setModelViewMatrix", matrix4fc);
            systemFrameCounter = systemTimeUniforms.getField("COUNTER").get(null);
            systemTimer = systemTimeUniforms.getField("TIMER").get(null);
            systemFrameCounterCountField = getAccessibleField(
                    systemFrameCounter.getClass(), "count");
            systemTimerFrameTimeCounterField = getAccessibleField(
                    systemTimer.getClass(), "frameTimeCounter");
            systemTimerLastFrameTimeField = getAccessibleField(
                    systemTimer.getClass(), "lastFrameTime");
            systemTimerLastStartTimeField = getAccessibleField(
                    systemTimer.getClass(), "lastStartTime");

            // Optional because older Angelica revisions do not expose parity-backed
            // render targets in exactly this form. Failure here must not disable
            // the already-working shader-aware scope path.
            try {
                Class<?> deferredPipeline = Class.forName(
                        "net.coderbot.iris.pipeline.DeferredWorldRenderingPipeline",
                        false, loader);
                Class<?> parityState = Class.forName(
                        "net.coderbot.iris.rendertarget.ParityFlipState",
                        false, loader);
                Class<?> renderTargets = Class.forName(
                        "net.coderbot.iris.rendertarget.RenderTargets",
                        false, loader);
                Class<?> renderTarget = Class.forName(
                        "net.coderbot.iris.rendertarget.RenderTarget",
                        false, loader);
                shaderPipelineParityStateField = getAccessibleField(
                        deferredPipeline, "parityState");
                shaderPipelineRenderTargetsField = getAccessibleField(
                        deferredPipeline, "renderTargets");
                parityOddField = getAccessibleField(parityState, "odd");
                parityBuffersMethod = parityState.getMethod("parityBuffers");
                renderTargetsGetMethod = renderTargets.getMethod("get", Integer.TYPE);
                renderTargetGetMainTextureMethod = renderTarget.getMethod("getMainTexture");
                renderTargetGetAltTextureMethod = renderTarget.getMethod("getAltTexture");
            } catch (ReflectiveOperationException ignored) {
                clearShaderTemporalReflection();
            } catch (LinkageError ignored) {
                clearShaderTemporalReflection();
            }
        } catch (ReflectiveOperationException ignored) {
            clearIrisReflection();
        } catch (LinkageError ignored) {
            clearIrisReflection();
        }
    }

    private static void clearIrisReflection() {
        irisGetInstance = null;
        irisShaderPackInUse = null;
        irisGetPipelineManager = null;
        irisGetCurrentDimensionName = null;
        irisGetCloudSetting = null;
        fixedPipelineConstructor = null;
        pipelineField = null;
        pipelinesPerDimensionField = null;
        lastPreparedDimensionField = null;
        blockRenderingSettings = null;
        blockRenderingSettingFields = null;
        renderingState = null;
        renderingStateGetProjectionBuffer = null;
        renderingStateGetModelViewBuffer = null;
        renderingStateGetProjectionMatrix = null;
        renderingStateGetModelViewMatrix = null;
        renderingStateGetFov = null;
        renderingStateSetProjectionMatrix = null;
        renderingStateSetModelViewMatrix = null;
        renderingStateSetFov = null;
        angelicaSetProjectionMatrix = null;
        angelicaSetModelViewMatrix = null;
        systemFrameCounter = null;
        systemTimer = null;
        systemFrameCounterCountField = null;
        systemTimerFrameTimeCounterField = null;
        systemTimerLastFrameTimeField = null;
        systemTimerLastStartTimeField = null;
        clearShaderTemporalReflection();
    }

    private static void clearShaderTemporalReflection() {
        shaderPipelineParityStateField = null;
        shaderPipelineRenderTargetsField = null;
        parityOddField = null;
        parityBuffersMethod = null;
        renderTargetsGetMethod = null;
        renderTargetGetMainTextureMethod = null;
        renderTargetGetAltTextureMethod = null;
    }

    private static Field getAccessibleField(Class<?> owner, String name)
            throws NoSuchFieldException {
        Field field = owner.getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }

    /**
     * A shader pack can advance ping-pong parity and overwrite persistent history
     * targets during the nested PiP world render. PiP is still the same display
     * frame, so preserve those primary-camera temporal resources around the scope.
     */
    private static void prepareShaderTemporalIsolation(RenderState state) {
        if (state == null || shaderPipelineParityStateField == null
                || shaderPipelineRenderTargetsField == null || parityOddField == null
                || parityBuffersMethod == null || renderTargetsGetMethod == null
                || renderTargetGetMainTextureMethod == null
                || renderTargetGetAltTextureMethod == null) {
            return;
        }
        try {
            Object manager = irisGetPipelineManager.invoke(null);
            Object pipeline = pipelineField.get(manager);
            if (pipeline == null) {
                return;
            }

            Object parity = shaderPipelineParityStateField.get(pipeline);
            Object renderTargets = shaderPipelineRenderTargetsField.get(pipeline);
            if (parity == null || renderTargets == null) {
                return;
            }

            state.shaderTemporalParity = parity;
            state.shaderTemporalParityOdd = parityOddField.getBoolean(parity);

            @SuppressWarnings("unchecked")
            Iterable<Object> parityBuffers =
                    (Iterable<Object>)parityBuffersMethod.invoke(parity);
            List<Integer> textures = new ArrayList<Integer>();
            for (Object value : parityBuffers) {
                if (!(value instanceof Number)) {
                    continue;
                }
                Object target = renderTargetsGetMethod.invoke(
                        renderTargets, ((Number)value).intValue());
                if (target == null) {
                    continue;
                }
                textures.add((Integer)renderTargetGetMainTextureMethod.invoke(target));
                textures.add((Integer)renderTargetGetAltTextureMethod.invoke(target));
            }

            if (!textures.isEmpty() && captureTemporalTextures(pipeline, textures, state)) {
                state.shaderTemporalStateCaptured = true;
            }
        } catch (ReflectiveOperationException ignored) {
            state.shaderTemporalStateCaptured = false;
        } catch (IllegalArgumentException ignored) {
            state.shaderTemporalStateCaptured = false;
        }
    }

    private static void restoreShaderTemporalIsolation(RenderState state) {
        if (state == null) {
            return;
        }
        try {
            if (state.shaderTemporalStateCaptured) {
                restoreTemporalTextures(state.shaderTemporalTextureIds);
            }
            if (state.shaderTemporalParity != null && parityOddField != null) {
                parityOddField.setBoolean(
                        state.shaderTemporalParity, state.shaderTemporalParityOdd);
            }
        } catch (IllegalAccessException ignored) {
            // The primary pipeline will rebuild its temporal state on a later frame.
        } finally {
            state.shaderTemporalStateCaptured = false;
        }
    }

    private static boolean captureTemporalTextures(Object pipeline,
                                                    List<Integer> textures,
                                                    RenderState state) {
        if (shaderTemporalBackupPipeline != pipeline) {
            releaseTemporalTextureBackups();
            shaderTemporalBackupPipeline = pipeline;
        }
        ensureTemporalFramebuffer();

        int previousFramebuffer = GL11.glGetInteger(
                EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousReadBuffer = GL11.glGetInteger(GL11.GL_READ_BUFFER);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);

        int[] captured = new int[textures.size()];
        int capturedCount = 0;
        try {
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                    shaderTemporalFramebuffer);
            GL11.glReadBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);

            for (Integer sourceObject : textures) {
                if (sourceObject == null || sourceObject.intValue() <= 0) {
                    continue;
                }
                int source = sourceObject.intValue();
                EXTFramebufferObject.glFramebufferTexture2DEXT(
                        EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                        EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT,
                        GL11.GL_TEXTURE_2D, source, 0);
                if (EXTFramebufferObject.glCheckFramebufferStatusEXT(
                        EXTFramebufferObject.GL_FRAMEBUFFER_EXT)
                        != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT) {
                    continue;
                }

                GL11.glBindTexture(GL11.GL_TEXTURE_2D, source);
                int width = GL11.glGetTexLevelParameteri(
                        GL11.GL_TEXTURE_2D, 0, GL11.GL_TEXTURE_WIDTH);
                int height = GL11.glGetTexLevelParameteri(
                        GL11.GL_TEXTURE_2D, 0, GL11.GL_TEXTURE_HEIGHT);
                int internalFormat = GL11.glGetTexLevelParameteri(
                        GL11.GL_TEXTURE_2D, 0, GL11.GL_TEXTURE_INTERNAL_FORMAT);
                if (width <= 0 || height <= 0 || internalFormat == 0) {
                    continue;
                }

                TemporalTextureBackup backup = shaderTemporalBackups.get(source);
                boolean reallocate = backup == null || backup.width != width
                        || backup.height != height
                        || backup.internalFormat != internalFormat;
                if (backup == null) {
                    backup = new TemporalTextureBackup();
                    backup.texture = GL11.glGenTextures();
                    shaderTemporalBackups.put(source, backup);
                    reallocate = true;
                }

                GL11.glBindTexture(GL11.GL_TEXTURE_2D, backup.texture);
                if (reallocate) {
                    GL11.glTexParameteri(GL11.GL_TEXTURE_2D,
                            GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
                    GL11.glTexParameteri(GL11.GL_TEXTURE_2D,
                            GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
                    GL11.glCopyTexImage2D(GL11.GL_TEXTURE_2D, 0, internalFormat,
                            0, 0, width, height, 0);
                    backup.width = width;
                    backup.height = height;
                    backup.internalFormat = internalFormat;
                } else {
                    GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0,
                            0, 0, 0, 0, width, height);
                }
                captured[capturedCount++] = source;
            }
        } finally {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            GL13.glActiveTexture(previousActiveTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
            GL11.glReadBuffer(previousReadBuffer);
        }

        if (capturedCount == 0) {
            return false;
        }
        state.shaderTemporalTextureIds = new int[capturedCount];
        System.arraycopy(captured, 0, state.shaderTemporalTextureIds,
                0, capturedCount);
        return true;
    }

    private static void restoreTemporalTextures(int[] textures) {
        if (textures == null || textures.length == 0) {
            return;
        }

        int previousFramebuffer = GL11.glGetInteger(
                EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousReadBuffer = GL11.glGetInteger(GL11.GL_READ_BUFFER);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        try {
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                    shaderTemporalFramebuffer);
            GL11.glReadBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);

            for (int destination : textures) {
                TemporalTextureBackup backup = shaderTemporalBackups.get(destination);
                if (backup == null || backup.texture <= 0) {
                    continue;
                }
                EXTFramebufferObject.glFramebufferTexture2DEXT(
                        EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                        EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT,
                        GL11.GL_TEXTURE_2D, backup.texture, 0);
                if (EXTFramebufferObject.glCheckFramebufferStatusEXT(
                        EXTFramebufferObject.GL_FRAMEBUFFER_EXT)
                        != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT) {
                    continue;
                }
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, destination);
                GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0,
                        0, 0, 0, 0, backup.width, backup.height);
            }
        } finally {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            GL13.glActiveTexture(previousActiveTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
            GL11.glReadBuffer(previousReadBuffer);
        }
    }

    private static void ensureTemporalFramebuffer() {
        if (shaderTemporalFramebuffer < 0) {
            shaderTemporalFramebuffer =
                    EXTFramebufferObject.glGenFramebuffersEXT();
        }
    }

    private static void releaseTemporalTextureBackups() {
        for (TemporalTextureBackup backup : shaderTemporalBackups.values()) {
            if (backup.texture > 0) {
                GL11.glDeleteTextures(backup.texture);
            }
        }
        shaderTemporalBackups.clear();
        if (shaderTemporalFramebuffer >= 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(
                    shaderTemporalFramebuffer);
            shaderTemporalFramebuffer = -1;
        }
        shaderTemporalBackupPipeline = null;
    }

    private static void restoreIris(RenderState state) {
        if (!state.irisIsolated || state.irisManager == null) {
            return;
        }
        try {
            @SuppressWarnings("unchecked")
            Map<Object, Object> pipelines =
                    (Map<Object, Object>)pipelinesPerDimensionField.get(state.irisManager);
            if (state.irisHadDimensionPipeline) {
                pipelines.put(state.irisDimension, state.irisDimensionPipeline);
            } else {
                pipelines.remove(state.irisDimension);
            }
            pipelineField.set(state.irisManager, state.irisPipeline);
            lastPreparedDimensionField.set(
                    state.irisManager, state.irisLastPreparedDimension);
        } catch (ReflectiveOperationException ignored) {
            // Angelica can recover its configured pipeline on its next frame.
        } finally {
            state.irisIsolated = false;
        }
    }

    private static void captureSystemTime(RenderState state) {
        if (systemFrameCounter == null || systemTimer == null) {
            return;
        }
        try {
            state.systemFrameCounterCount =
                    systemFrameCounterCountField.getInt(systemFrameCounter);
            state.systemTimerFrameTimeCounter =
                    systemTimerFrameTimeCounterField.getFloat(systemTimer);
            state.systemTimerLastFrameTime =
                    systemTimerLastFrameTimeField.getFloat(systemTimer);
            state.systemTimerLastStartTime =
                    systemTimerLastStartTimeField.get(systemTimer);
            state.systemTimeCaptured = true;
        } catch (IllegalAccessException ignored) {
            state.systemTimeCaptured = false;
        }
    }

    private static void restoreSystemTime(RenderState state) {
        if (!state.systemTimeCaptured || systemFrameCounter == null
                || systemTimer == null) {
            return;
        }
        try {
            systemFrameCounterCountField.setInt(
                    systemFrameCounter, state.systemFrameCounterCount);
            systemTimerFrameTimeCounterField.setFloat(
                    systemTimer, state.systemTimerFrameTimeCounter);
            systemTimerLastFrameTimeField.setFloat(
                    systemTimer, state.systemTimerLastFrameTime);
            systemTimerLastStartTimeField.set(
                    systemTimer, state.systemTimerLastStartTime);
        } catch (IllegalAccessException ignored) {
            // Angelica will advance these values normally on the next main frame.
        } finally {
            state.systemTimeCaptured = false;
        }
    }

    private static void captureDistantHorizonsState(RenderState state) {
        initialiseDistantHorizonsReflection();
        if (distantHorizonsModelViewField == null
                || distantHorizonsProjectionField == null) {
            return;
        }
        try {
            state.distantHorizonsModelView =
                    distantHorizonsModelViewField.get(null);
            state.distantHorizonsProjection =
                    distantHorizonsProjectionField.get(null);
            state.distantHorizonsRenderStateModelView =
                    distantHorizonsRenderStateModelViewField.get(
                            distantHorizonsRenderState);
            state.distantHorizonsRenderStateProjection =
                    distantHorizonsRenderStateProjectionField.get(
                            distantHorizonsRenderState);
            state.distantHorizonsRenderStateLevel =
                    distantHorizonsRenderStateLevelField.get(
                            distantHorizonsRenderState);
            state.distantHorizonsShadersEnabled =
                    distantHorizonsShadersEnabledField.getBoolean(distantHorizonsClientApi);
            state.distantHorizonsDeferTransparent =
                    distantHorizonsDeferTransparentField.getBoolean(distantHorizonsRenderProxy);
            state.distantHorizonsStateCaptured = true;
        } catch (IllegalAccessException ignored) {
            state.distantHorizonsStateCaptured = false;
        }
    }

    private static void initialiseDistantHorizonsReflection() {
        if (distantHorizonsChecked) {
            return;
        }
        distantHorizonsChecked = true;
        try {
            ClassLoader loader = ScopeRenderCompatibility.class.getClassLoader();
            Class<?> renderHelper = Class.forName(
                    "com.seibel.distanthorizons.RenderHelper", false, loader);
            Class<?> clientApi = Class.forName(
                    "com.seibel.distanthorizons.core.api.internal.ClientApi",
                    false, loader);
            distantHorizonsClientApi = clientApi.getField("INSTANCE").get(null);
            distantHorizonsShadersEnabledField = getAccessibleField(
                    clientApi, "irisShadersEnabledLastFrame");
            Class<?> renderProxy = Class.forName(
                    "com.seibel.distanthorizons.core.render.DhApiRenderProxy", false, loader);
            distantHorizonsRenderProxy = renderProxy.getField("INSTANCE").get(null);
            distantHorizonsDeferTransparentField = getAccessibleField(
                    renderProxy, "deferTransparentRendering");
            distantHorizonsModelViewField = getAccessibleField(
                    renderHelper, "modelViewMatrix");
            distantHorizonsProjectionField = getAccessibleField(
                    renderHelper, "projectionMatrix");
            distantHorizonsRenderState = clientApi.getField("RENDER_STATE").get(null);
            Class<?> renderStateClass = distantHorizonsRenderState.getClass();
            distantHorizonsRenderStateModelViewField = getAccessibleField(
                    renderStateClass, "mcModelViewMatrix");
            distantHorizonsRenderStateProjectionField = getAccessibleField(
                    renderStateClass, "mcProjectionMatrix");
            distantHorizonsRenderStateLevelField = getAccessibleField(
                    renderStateClass, "clientLevelWrapper");
        } catch (ReflectiveOperationException ignored) {
            clearDistantHorizonsReflection();
        } catch (LinkageError ignored) {
            clearDistantHorizonsReflection();
        }
    }

    private static void clearDistantHorizonsReflection() {
        distantHorizonsModelViewField = null;
        distantHorizonsProjectionField = null;
        distantHorizonsRenderState = null;
        distantHorizonsRenderStateModelViewField = null;
        distantHorizonsRenderStateProjectionField = null;
        distantHorizonsRenderStateLevelField = null;
        distantHorizonsClientApi = null;
        distantHorizonsShadersEnabledField = null;
        distantHorizonsRenderProxy = null;
        distantHorizonsDeferTransparentField = null;
    }

    private static void restoreDistantHorizonsState(RenderState state) {
        if (!state.distantHorizonsStateCaptured
                || distantHorizonsModelViewField == null) {
            return;
        }
        try {
            distantHorizonsShadersEnabledField.setBoolean(
                    distantHorizonsClientApi, state.distantHorizonsShadersEnabled);
            distantHorizonsDeferTransparentField.setBoolean(
                    distantHorizonsRenderProxy, state.distantHorizonsDeferTransparent);
            distantHorizonsModelViewField.set(
                    null, state.distantHorizonsModelView);
            distantHorizonsProjectionField.set(
                    null, state.distantHorizonsProjection);
            distantHorizonsRenderStateModelViewField.set(
                    distantHorizonsRenderState,
                    state.distantHorizonsRenderStateModelView);
            distantHorizonsRenderStateProjectionField.set(
                    distantHorizonsRenderState,
                    state.distantHorizonsRenderStateProjection);
            distantHorizonsRenderStateLevelField.set(
                    distantHorizonsRenderState,
                    state.distantHorizonsRenderStateLevel);
        } catch (IllegalAccessException ignored) {
            // Distant Horizons refreshes this state on the next normal world pass.
        } finally {
            state.distantHorizonsStateCaptured = false;
        }
    }

    private static void captureCeleritasState(RenderState state,
                                               boolean reusePrimaryTerrain) {
        initialiseCeleritasReflection();
        if (celeritasGetInstanceOrNull == null) {
            return;
        }
        try {
            Object renderer = celeritasGetInstanceOrNull.invoke(null);
            if (renderer == null) {
                return;
            }
            Object sectionManager = celeritasRenderSectionManagerField.get(renderer);
            if (sectionManager == null) {
                return;
            }

            // Color PiP now starts after the primary camera. Publish any async
            // primary-camera search before taking the snapshot so the secondary
            // camera can reuse a complete, wide-frustum terrain list.
            if (reusePrimaryTerrain && celeritasFinishAllGraphUpdates != null) {
                celeritasFinishAllGraphUpdates.invoke(sectionManager);
            }

            Object listManager = celeritasRenderListManagerField.get(sectionManager);
            if (listManager == null) {
                return;
            }

            state.celeritasRenderer = renderer;
            state.celeritasSectionManager = sectionManager;
            state.celeritasListManager = listManager;
            state.celeritasCurrentViewport = celeritasCurrentViewportField.get(renderer);
            state.celeritasLastCameraState = celeritasLastCameraStateField.get(renderer);
            if (celeritasLastCameraPositionField != null) {
                state.celeritasLastCameraPosition =
                        celeritasLastCameraPositionField.get(sectionManager);
            }
            if (celeritasCameraPositionField != null) {
                state.celeritasCameraPosition =
                        celeritasCameraPositionField.get(sectionManager);
            }
            state.celeritasNeedsUpdate = celeritasNeedsUpdateField.getBoolean(listManager);
            state.celeritasReusePrimaryTerrain = reusePrimaryTerrain;
            if (reusePrimaryTerrain) {
                state.celeritasTerrainLists = captureCeleritasListState(listManager);
                if (celeritasShadowRenderListManagerField != null) {
                    Object shadowListManager =
                            celeritasShadowRenderListManagerField.get(sectionManager);
                    state.celeritasShadowLists =
                            captureCeleritasListState(shadowListManager);
                }
                if (celeritasShadowPassRanThisFrameField != null) {
                    state.celeritasShadowPassRanThisFrame =
                            celeritasShadowPassRanThisFrameField.getBoolean(sectionManager);
                    state.celeritasShadowPassStateCaptured = true;
                }
            }
            state.celeritasStateCaptured = true;

            // The scope camera has the same pose as the just-rendered main camera and
            // only a narrower projection. Reuse the primary terrain list instead of
            // scheduling a second asynchronous visibility search.
            celeritasNeedsUpdateField.setBoolean(listManager, false);

            Object renderGlobal = Minecraft.getMinecraft().renderGlobal;
            if (renderGlobal != null) {
                try {
                    state.celeritasFrameField = getAccessibleField(
                            renderGlobal.getClass(), "celeritas$frame");
                    state.celeritasLastFovField = getAccessibleField(
                            renderGlobal.getClass(), "celeritas$lastFov");
                    state.celeritasRenderGlobal = renderGlobal;
                    state.celeritasFrame =
                            state.celeritasFrameField.getInt(renderGlobal);
                    state.celeritasLastFov =
                            state.celeritasLastFovField.getFloat(renderGlobal);
                } catch (ReflectiveOperationException ignored) {
                    state.celeritasRenderGlobal = null;
                }
            }
        } catch (ReflectiveOperationException ignored) {
            state.celeritasStateCaptured = false;
        } catch (LinkageError ignored) {
            state.celeritasStateCaptured = false;
        }
    }

    private static void initialiseCeleritasReflection() {
        if (celeritasChecked) {
            return;
        }
        celeritasChecked = true;
        try {
            ClassLoader loader = ScopeRenderCompatibility.class.getClassLoader();
            Class<?> rendererClass = Class.forName(
                    "com.gtnewhorizons.angelica.rendering.celeritas.CeleritasWorldRenderer",
                    false, loader);
            Class<?> simpleRendererClass = Class.forName(
                    "org.embeddedt.embeddium.impl.render.terrain.SimpleWorldRenderer",
                    false, loader);
            Class<?> sectionManagerClass = Class.forName(
                    "org.embeddedt.embeddium.impl.render.chunk.RenderSectionManager",
                    false, loader);
            Class<?> listManagerClass = Class.forName(
                    "org.embeddedt.embeddium.impl.render.chunk.lists.RenderListManager",
                    false, loader);
            celeritasGetInstanceOrNull = rendererClass.getMethod("getInstanceOrNull");
            celeritasCurrentViewportField = getAccessibleField(
                    simpleRendererClass, "currentViewport");
            celeritasLastCameraStateField = getAccessibleField(
                    simpleRendererClass, "lastCameraState");
            celeritasRenderSectionManagerField = getAccessibleField(
                    simpleRendererClass, "renderSectionManager");
            celeritasRenderListManagerField = getAccessibleField(
                    sectionManagerClass, "renderListManager");
            celeritasNeedsUpdateField = getAccessibleField(
                    listManagerClass, "needsUpdate");
            try {
                celeritasShadowRenderListManagerField = getAccessibleField(
                        sectionManagerClass, "shadowRenderListManager");
                celeritasShadowPassRanThisFrameField = getAccessibleField(
                        sectionManagerClass, "shadowPassRanThisFrame");
            } catch (ReflectiveOperationException ignored) {
                celeritasShadowRenderListManagerField = null;
                celeritasShadowPassRanThisFrameField = null;
            }

            // These are optional across Angelica/Celeritas revisions. The core
            // compatibility path still works if an older build lacks one of them.
            try {
                celeritasFinishAllGraphUpdates =
                        sectionManagerClass.getMethod("finishAllGraphUpdates");
            } catch (NoSuchMethodException ignored) {
                celeritasFinishAllGraphUpdates = null;
            }
            try {
                celeritasIsTerrainRenderComplete =
                        simpleRendererClass.getMethod("isTerrainRenderComplete");
            } catch (NoSuchMethodException ignored) {
                celeritasIsTerrainRenderComplete = null;
            }
            try {
                Class<?> rebuildListsClass = Class.forName(
                        "org.embeddedt.embeddium.impl.render.chunk.lists.ChunkRebuildLists",
                        false, loader);
                celeritasRebuildListsIsEmpty = rebuildListsClass.getMethod("isEmpty");
            } catch (ReflectiveOperationException ignored) {
                celeritasRebuildListsIsEmpty = null;
            }
            try {
                celeritasBuildResultsField =
                        getAccessibleField(sectionManagerClass, "buildResults");
                celeritasAsyncSubmittedTasksField =
                        getAccessibleField(sectionManagerClass, "asyncSubmittedTasks");
                celeritasSectionsRequestingUpdateField =
                        getAccessibleField(sectionManagerClass, "sectionsRequestingUpdate");
                celeritasLastCameraPositionField =
                        getAccessibleField(sectionManagerClass, "lastCameraPosition");
                celeritasCameraPositionField =
                        getAccessibleField(sectionManagerClass, "cameraPosition");
            } catch (ReflectiveOperationException ignored) {
                celeritasBuildResultsField = null;
                celeritasAsyncSubmittedTasksField = null;
                celeritasSectionsRequestingUpdateField = null;
                celeritasLastCameraPositionField = null;
                celeritasCameraPositionField = null;
            }
            try {
                celeritasRenderListsField =
                        getAccessibleField(listManagerClass, "renderLists");
                celeritasRebuildListsField =
                        getAccessibleField(listManagerClass, "rebuildLists");
                celeritasLastUpdatedFrameField =
                        getAccessibleField(listManagerClass, "lastUpdatedFrame");
                celeritasVisibilitySnapshotField =
                        getAccessibleField(listManagerClass, "visibilitySnapshot");
            } catch (ReflectiveOperationException ignored) {
                celeritasRenderListsField = null;
                celeritasRebuildListsField = null;
                celeritasLastUpdatedFrameField = null;
                celeritasVisibilitySnapshotField = null;
            }
        } catch (ReflectiveOperationException ignored) {
            clearCeleritasReflection();
        } catch (LinkageError ignored) {
            clearCeleritasReflection();
        }
    }

    private static void clearCeleritasReflection() {
        celeritasGetInstanceOrNull = null;
        celeritasCurrentViewportField = null;
        celeritasLastCameraStateField = null;
        celeritasRenderSectionManagerField = null;
        celeritasRenderListManagerField = null;
        celeritasShadowRenderListManagerField = null;
        celeritasShadowPassRanThisFrameField = null;
        celeritasNeedsUpdateField = null;
        celeritasFinishAllGraphUpdates = null;
        celeritasIsTerrainRenderComplete = null;
        celeritasRebuildListsIsEmpty = null;
        celeritasRenderListsField = null;
        celeritasRebuildListsField = null;
        celeritasLastUpdatedFrameField = null;
        celeritasVisibilitySnapshotField = null;
        celeritasBuildResultsField = null;
        celeritasAsyncSubmittedTasksField = null;
        celeritasSectionsRequestingUpdateField = null;
        celeritasLastCameraPositionField = null;
        celeritasCameraPositionField = null;
    }

    private static void restoreCeleritasState(RenderState state) {
        if (!state.celeritasStateCaptured || state.celeritasRenderer == null
                || state.celeritasListManager == null) {
            return;
        }
        try {
            if (!state.celeritasReusePrimaryTerrain) {
                boolean terrainCameraChanged = celeritasCurrentViewportField.get(
                        state.celeritasRenderer) != state.celeritasCurrentViewport;
                celeritasCurrentViewportField.set(
                        state.celeritasRenderer, state.celeritasCurrentViewport);
                celeritasLastCameraStateField.set(
                        state.celeritasRenderer, state.celeritasLastCameraState);
                celeritasNeedsUpdateField.setBoolean(
                        state.celeritasListManager, state.celeritasNeedsUpdate
                                || terrainCameraChanged
                                || celeritasNeedsUpdateField.getBoolean(
                                        state.celeritasListManager));
                restoreCeleritasFrameState(state);
                return;
            }

            // A shader pack may run both a terrain and a shadow search during the
            // scope pass. Join those searches before restoring the primary-camera
            // list snapshots so no scope future can publish after we return.
            if (celeritasFinishAllGraphUpdates != null
                    && state.celeritasSectionManager != null) {
                celeritasFinishAllGraphUpdates.invoke(state.celeritasSectionManager);
            }

            restoreCeleritasListState(state.celeritasTerrainLists);
            restoreCeleritasListState(state.celeritasShadowLists);
            if (state.celeritasShadowPassStateCaptured
                    && celeritasShadowPassRanThisFrameField != null) {
                celeritasShadowPassRanThisFrameField.setBoolean(
                        state.celeritasSectionManager,
                        state.celeritasShadowPassRanThisFrame);
            }
            if (celeritasLastCameraPositionField != null) {
                celeritasLastCameraPositionField.set(
                        state.celeritasSectionManager,
                        state.celeritasLastCameraPosition);
            }
            if (celeritasCameraPositionField != null) {
                celeritasCameraPositionField.set(
                        state.celeritasSectionManager,
                        state.celeritasCameraPosition);
            }

            celeritasCurrentViewportField.set(
                    state.celeritasRenderer, state.celeritasCurrentViewport);
            celeritasLastCameraStateField.set(
                    state.celeritasRenderer, state.celeritasLastCameraState);
            restoreCeleritasFrameState(state);

            // Scope FOV/fog changes are not primary-camera dirtiness. Restore the
            // exact state that existed after the main camera instead of forcing a
            // visibility search on the following frame.
            celeritasNeedsUpdateField.setBoolean(
                    state.celeritasListManager, state.celeritasNeedsUpdate);
        } catch (ReflectiveOperationException ignored) {
            // Celeritas will rebuild this state during the next normal camera pass.
        } catch (LinkageError ignored) {
            // Optional compatibility only.
        } finally {
            state.celeritasStateCaptured = false;
        }
    }

    private static CeleritasListState captureCeleritasListState(Object listManager)
            throws IllegalAccessException {
        if (listManager == null || celeritasRenderListsField == null
                || celeritasRebuildListsField == null
                || celeritasLastUpdatedFrameField == null
                || celeritasVisibilitySnapshotField == null) {
            return null;
        }
        CeleritasListState state = new CeleritasListState();
        state.listManager = listManager;
        state.renderLists = celeritasRenderListsField.get(listManager);
        state.rebuildLists = celeritasRebuildListsField.get(listManager);
        state.visibilitySnapshot = celeritasVisibilitySnapshotField.get(listManager);
        state.lastUpdatedFrame = celeritasLastUpdatedFrameField.getInt(listManager);
        state.needsUpdate = celeritasNeedsUpdateField.getBoolean(listManager);
        return state;
    }

    private static void restoreCeleritasListState(CeleritasListState state)
            throws IllegalAccessException {
        if (state == null || state.listManager == null) {
            return;
        }
        celeritasRenderListsField.set(state.listManager, state.renderLists);
        celeritasRebuildListsField.set(state.listManager, state.rebuildLists);
        celeritasVisibilitySnapshotField.set(
                state.listManager, state.visibilitySnapshot);
        celeritasLastUpdatedFrameField.setInt(
                state.listManager, state.lastUpdatedFrame);
        celeritasNeedsUpdateField.setBoolean(
                state.listManager, state.needsUpdate);
    }

    private static void restoreCeleritasFrameState(RenderState state)
            throws IllegalAccessException {
        if (state.celeritasRenderGlobal != null
                && state.celeritasFrameField != null
                && state.celeritasLastFovField != null) {
            state.celeritasFrameField.setInt(
                    state.celeritasRenderGlobal, state.celeritasFrame);
            state.celeritasLastFovField.setFloat(
                    state.celeritasRenderGlobal, state.celeritasLastFov);
        }
    }

    private static float[] captureRenderingMatrix(Method getter)
            throws ReflectiveOperationException {
        FloatBuffer buffer = (FloatBuffer)getter.invoke(renderingState);
        FloatBuffer copy = buffer.duplicate();
        copy.position(0);
        float[] values = new float[16];
        copy.get(values);
        return values;
    }

    private static void captureRenderingState(RenderState state) {
        if (renderingState == null) {
            return;
        }
        try {
            state.renderingState = renderingState;
            state.renderingProjection = captureRenderingMatrix(renderingStateGetProjectionBuffer);
            state.renderingModelView = captureRenderingMatrix(renderingStateGetModelViewBuffer);
            state.renderingFov = ((Float)renderingStateGetFov.invoke(renderingState)).floatValue();
        } catch (ReflectiveOperationException ignored) {
            state.renderingState = null;
        }
    }

    private static void restoreRenderingState(RenderState state) {
        if (state.renderingState == null || state.renderingProjection == null
                || state.renderingModelView == null) {
            return;
        }
        try {
            renderingStateSetProjectionMatrix.invoke(state.renderingState,
                    createDirectMatrixBuffer(state.renderingProjection));
            renderingStateSetModelViewMatrix.invoke(state.renderingState,
                    createDirectMatrixBuffer(state.renderingModelView));
            renderingStateSetFov.invoke(state.renderingState, state.renderingFov);
            // Raw LWJGL matrix pops restore the driver but bypass Angelica's
            // matrix cache. Celeritas builds its next chunk frustum from that
            // cache, so leaving the scope projection there culls the main view.
            angelicaSetProjectionMatrix.invoke(null,
                    renderingStateGetProjectionMatrix.invoke(state.renderingState));
            angelicaSetModelViewMatrix.invoke(null,
                    renderingStateGetModelViewMatrix.invoke(state.renderingState));
        } catch (ReflectiveOperationException ignored) {
            // Angelica refreshes these values from the main camera next frame.
        }
    }

    private static FloatBuffer createDirectMatrixBuffer(float[] values) {
        FloatBuffer buffer = ByteBuffer.allocateDirect(values.length * 4)
                .order(ByteOrder.nativeOrder()).asFloatBuffer();
        buffer.put(values);
        buffer.flip();
        return buffer;
    }

    private static Object[] captureBlockRenderingSettings()
            throws IllegalAccessException {
        Object[] values = new Object[blockRenderingSettingFields.length];
        for (int i = 0; i < blockRenderingSettingFields.length; i++) {
            values[i] = blockRenderingSettingFields[i].get(blockRenderingSettings);
        }
        return values;
    }

    private static void restoreBlockRenderingSettings(RenderState state) {
        if (state.blockRenderingSettings == null
                || state.blockRenderingSettingValues == null
                || blockRenderingSettingFields == null) {
            return;
        }
        try {
            int count = Math.min(blockRenderingSettingFields.length,
                    state.blockRenderingSettingValues.length);
            for (int i = 0; i < count; i++) {
                blockRenderingSettingFields[i].set(state.blockRenderingSettings,
                        state.blockRenderingSettingValues[i]);
            }
        } catch (IllegalAccessException ignored) {
            // A later Angelica pipeline refresh restores its own render settings.
        }
    }


    private static final class TemporalTextureBackup {
        private int texture;
        private int width;
        private int height;
        private int internalFormat;
    }

    private static final class CeleritasListState {
        private Object listManager;
        private Object renderLists;
        private Object rebuildLists;
        private Object visibilitySnapshot;
        private int lastUpdatedFrame;
        private boolean needsUpdate;
    }

    static final class RenderState {
        private boolean secondaryRenderAllowed = true;
        private boolean disableClouds;
        private boolean irisIsolated;
        private Object irisManager;
        private Object irisPipeline;
        private Object irisLastPreparedDimension;
        private String irisDimension;
        private boolean irisHadDimensionPipeline;
        private Object irisDimensionPipeline;
        private Object fixedPipeline;
        private Object blockRenderingSettings;
        private Object[] blockRenderingSettingValues;
        private Object renderingState;
        private float[] renderingProjection;
        private float[] renderingModelView;
        private float renderingFov;
        private boolean systemTimeCaptured;
        private int systemFrameCounterCount;
        private float systemTimerFrameTimeCounter;
        private float systemTimerLastFrameTime;
        private Object systemTimerLastStartTime;
        private boolean shaderTemporalStateCaptured;
        private Object shaderTemporalParity;
        private boolean shaderTemporalParityOdd;
        private int[] shaderTemporalTextureIds;
        private boolean distantHorizonsStateCaptured;
        private boolean distantHorizonsShadersEnabled;
        private boolean distantHorizonsDeferTransparent;
        private Object distantHorizonsModelView;
        private Object distantHorizonsProjection;
        private Object distantHorizonsRenderStateModelView;
        private Object distantHorizonsRenderStateProjection;
        private Object distantHorizonsRenderStateLevel;
        private boolean celeritasStateCaptured;
        private boolean celeritasReusePrimaryTerrain;
        private Object celeritasRenderer;
        private Object celeritasSectionManager;
        private Object celeritasListManager;
        private Object celeritasCurrentViewport;
        private Object celeritasLastCameraState;
        private Object celeritasLastCameraPosition;
        private Object celeritasCameraPosition;
        private boolean celeritasNeedsUpdate;
        private CeleritasListState celeritasTerrainLists;
        private CeleritasListState celeritasShadowLists;
        private boolean celeritasShadowPassStateCaptured;
        private boolean celeritasShadowPassRanThisFrame;
        private Object celeritasRenderGlobal;
        private Field celeritasFrameField;
        private Field celeritasLastFovField;
        private int celeritasFrame;
        private float celeritasLastFov;
        boolean isSecondaryRenderAllowed() {
            return secondaryRenderAllowed;
        }

        boolean shouldDisableClouds() {
            return disableClouds;
        }
    }
}
