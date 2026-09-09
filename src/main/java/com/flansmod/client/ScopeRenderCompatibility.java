package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Map;

/** Optional isolation for renderers that cannot safely render a second camera. */
@SideOnly(Side.CLIENT)
final class ScopeRenderCompatibility {
    private static boolean irisChecked;
    private static Method irisGetInstance;
    private static Method irisShaderPackInUse;
    private static Method irisGetPipelineManager;
    private static Method irisGetCurrentDimensionName;
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

    private static boolean celeritasChecked;
    private static Method celeritasGetInstanceOrNull;
    private static Field celeritasCurrentViewportField;
    private static Field celeritasLastCameraStateField;
    private static Field celeritasRenderSectionManagerField;
    private static Field celeritasRenderListManagerField;
    private static Field celeritasRenderListsField;
    private static Field celeritasRebuildListsField;
    private static Field celeritasOcclusionFutureField;
    private static Field celeritasNeedsUpdateField;
    private static Field celeritasLastUpdatedFrameField;
    private static Field celeritasPendingUpdatedFrameField;

    private static boolean distantHorizonsChecked;
    private static Field distantHorizonsModelViewField;
    private static Field distantHorizonsProjectionField;
    private static Object distantHorizonsRenderState;
    private static Field distantHorizonsRenderStateModelViewField;
    private static Field distantHorizonsRenderStateProjectionField;
    private static Field distantHorizonsRenderStateLevelField;
    private ScopeRenderCompatibility() {
    }

    /**
     * Prevent a nested scope camera from re-entering the active shader pipeline.
     * Distant Horizons remains enabled so its LOD terrain can render into the
     * scope framebuffer through the temporary fixed-function pipeline.
     */
    static RenderState beginSecondaryRender() {
        RenderState state = new RenderState();
        boolean shaderPackInUse = isShaderPackInUse();
        captureSystemTime(state);
        captureDistantHorizonsState(state);
        captureCeleritasState(state);
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
            state.irisLastPreparedDimension = lastPreparedDimensionField.get(manager);
            state.irisHadDimensionPipeline = pipelines.containsKey(dimension);
            state.irisDimensionPipeline = pipelines.get(dimension);
            state.blockRenderingSettings = blockRenderingSettings;
            state.blockRenderingSettingValues = captureBlockRenderingSettings();
            state.renderingState = renderingState;
            state.renderingProjection = captureRenderingMatrix(
                    renderingStateGetProjectionBuffer);
            state.renderingModelView = captureRenderingMatrix(
                    renderingStateGetModelViewBuffer);
            state.renderingFov = ((Float)renderingStateGetFov.invoke(
                    renderingState)).floatValue();
            state.irisIsolated = true;
            state.fixedPipeline = fixedPipelineConstructor.newInstance();

            pipelines.put(dimension, state.fixedPipeline);
            pipelineField.set(manager, state.fixedPipeline);
            lastPreparedDimensionField.set(manager, dimension);
        } catch (ReflectiveOperationException ignored) {
            restoreIris(state);
            state.secondaryRenderAllowed = false;
        } catch (LinkageError ignored) {
            restoreIris(state);
            state.secondaryRenderAllowed = false;
        }
        return state;
    }

    static void endSecondaryRender(RenderState state) {
        if (state == null) {
            return;
        }
        restoreIris(state);
        restoreSystemTime(state);
        restoreDistantHorizonsState(state);
        restoreCeleritasState(state);
    }

    private static boolean isShaderPackInUse() {
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
    }

    private static Field getAccessibleField(Class<?> owner, String name)
            throws NoSuchFieldException {
        Field field = owner.getDeclaredField(name);
        field.setAccessible(true);
        return field;
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
            restoreBlockRenderingSettings(state);
            restoreRenderingState(state);
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
    }

    private static void restoreDistantHorizonsState(RenderState state) {
        if (!state.distantHorizonsStateCaptured
                || distantHorizonsModelViewField == null) {
            return;
        }
        try {
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

    private static void captureCeleritasState(RenderState state) {
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
            Object listManager = celeritasRenderListManagerField.get(sectionManager);
            if (listManager == null) {
                return;
            }

            state.celeritasRenderer = renderer;
            state.celeritasListManager = listManager;
            state.celeritasCurrentViewport = celeritasCurrentViewportField.get(renderer);
            state.celeritasLastCameraState = celeritasLastCameraStateField.get(renderer);
            state.celeritasRenderLists = celeritasRenderListsField.get(listManager);
            state.celeritasRebuildLists = celeritasRebuildListsField.get(listManager);
            state.celeritasOcclusionFuture = celeritasOcclusionFutureField.get(listManager);
            state.celeritasNeedsUpdate = celeritasNeedsUpdateField.getBoolean(listManager);
            state.celeritasLastUpdatedFrame =
                    celeritasLastUpdatedFrameField.getInt(listManager);
            state.celeritasPendingUpdatedFrame =
                    celeritasPendingUpdatedFrameField.getInt(listManager);
            state.celeritasStateCaptured = true;
            // The scope can reuse the main camera's wider visible-section list.
            // Do not let a pending terrain update rebuild that shared list with
            // the optic's narrow frustum; the main pass receives the dirty flag
            // again when its state is restored below.
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
            celeritasRenderListsField = getAccessibleField(
                    listManagerClass, "renderLists");
            celeritasRebuildListsField = getAccessibleField(
                    listManagerClass, "rebuildLists");
            celeritasOcclusionFutureField = getAccessibleField(
                    listManagerClass, "currentOcclusionFuture");
            celeritasNeedsUpdateField = getAccessibleField(
                    listManagerClass, "needsUpdate");
            celeritasLastUpdatedFrameField = getAccessibleField(
                    listManagerClass, "lastUpdatedFrame");
            celeritasPendingUpdatedFrameField = getAccessibleField(
                    listManagerClass, "pendingLastUpdatedFrame");
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
        celeritasRenderListsField = null;
        celeritasRebuildListsField = null;
        celeritasOcclusionFutureField = null;
        celeritasNeedsUpdateField = null;
        celeritasLastUpdatedFrameField = null;
        celeritasPendingUpdatedFrameField = null;
    }

    private static void restoreCeleritasState(RenderState state) {
        if (!state.celeritasStateCaptured || state.celeritasRenderer == null
                || state.celeritasListManager == null) {
            return;
        }
        try {
            celeritasCurrentViewportField.set(
                    state.celeritasRenderer, state.celeritasCurrentViewport);
            celeritasLastCameraStateField.set(
                    state.celeritasRenderer, state.celeritasLastCameraState);
            celeritasRenderListsField.set(
                    state.celeritasListManager, state.celeritasRenderLists);
            celeritasRebuildListsField.set(
                    state.celeritasListManager, state.celeritasRebuildLists);
            celeritasOcclusionFutureField.set(
                    state.celeritasListManager, state.celeritasOcclusionFuture);
            celeritasNeedsUpdateField.setBoolean(
                    state.celeritasListManager, state.celeritasNeedsUpdate);
            celeritasLastUpdatedFrameField.setInt(
                    state.celeritasListManager, state.celeritasLastUpdatedFrame);
            celeritasPendingUpdatedFrameField.setInt(
                    state.celeritasListManager, state.celeritasPendingUpdatedFrame);
            if (state.celeritasRenderGlobal != null
                    && state.celeritasFrameField != null
                    && state.celeritasLastFovField != null) {
                state.celeritasFrameField.setInt(
                        state.celeritasRenderGlobal, state.celeritasFrame);
                state.celeritasLastFovField.setFloat(
                        state.celeritasRenderGlobal, state.celeritasLastFov);
            }
        } catch (IllegalAccessException ignored) {
            // Celeritas rebuilds this state during the next main camera pass.
        } finally {
            state.celeritasStateCaptured = false;
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


    static final class RenderState {
        private boolean secondaryRenderAllowed = true;
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
        private boolean distantHorizonsStateCaptured;
        private Object distantHorizonsModelView;
        private Object distantHorizonsProjection;
        private Object distantHorizonsRenderStateModelView;
        private Object distantHorizonsRenderStateProjection;
        private Object distantHorizonsRenderStateLevel;
        private boolean celeritasStateCaptured;
        private Object celeritasRenderer;
        private Object celeritasListManager;
        private Object celeritasCurrentViewport;
        private Object celeritasLastCameraState;
        private Object celeritasRenderLists;
        private Object celeritasRebuildLists;
        private Object celeritasOcclusionFuture;
        private boolean celeritasNeedsUpdate;
        private int celeritasLastUpdatedFrame;
        private int celeritasPendingUpdatedFrame;
        private Object celeritasRenderGlobal;
        private Field celeritasFrameField;
        private Field celeritasLastFovField;
        private int celeritasFrame;
        private float celeritasLastFov;
        boolean isSecondaryRenderAllowed() {
            return secondaryRenderAllowed;
        }
    }
}
