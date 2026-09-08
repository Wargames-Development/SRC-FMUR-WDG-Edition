package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
    private static Method renderingStateGetFov;
    private static Method renderingStateSetProjectionMatrix;
    private static Method renderingStateSetModelViewMatrix;
    private static Method renderingStateSetFov;
    private static Field angelicaDhPresentField;

    private static boolean distantHorizonsChecked;
    private static Field distantHorizonsRenderingEntry;
    private static Method configEntryGet;
    private static Method configEntryHasVersionOverride;
    private static Method configEntrySetVersionOverride;

    private ScopeRenderCompatibility() {
    }

    /**
     * Prevent a nested scope camera from re-entering the active shader pipeline
     * or drawing Distant Horizons' LOD pass a second time. Both integrations are
     * reflection-only and leave the normal camera's configuration untouched.
     */
    static RenderState beginSecondaryRender() {
        RenderState state = new RenderState();
        suspendDistantHorizons(state);
        if (!isShaderPackInUse()) {
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
            isolateAngelicaDistantHorizons(state);
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
        restoreDistantHorizons(state);
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
            Class<?> angelicaDhCompat = Class.forName(
                    "net.coderbot.iris.compat.dh.DHCompat", false, loader);

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
            renderingStateGetFov = angelicaRenderingState.getMethod("getFov");
            renderingStateSetProjectionMatrix = angelicaRenderingState.getMethod(
                    "setProjectionMatrix", FloatBuffer.class);
            renderingStateSetModelViewMatrix = angelicaRenderingState.getMethod(
                    "setModelViewMatrix", FloatBuffer.class);
            renderingStateSetFov = angelicaRenderingState.getMethod(
                    "setFov", Float.TYPE);
            angelicaDhPresentField = getAccessibleField(
                    angelicaDhCompat, "dhPresent");
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
        renderingStateGetFov = null;
        renderingStateSetProjectionMatrix = null;
        renderingStateSetModelViewMatrix = null;
        renderingStateSetFov = null;
        angelicaDhPresentField = null;
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
            restoreAngelicaDistantHorizons(state);
            state.irisIsolated = false;
        }
    }

    private static void isolateAngelicaDistantHorizons(RenderState state)
            throws IllegalAccessException {
        state.angelicaDhPresent = angelicaDhPresentField.getBoolean(null);
        angelicaDhPresentField.setBoolean(null, false);
        state.angelicaDhIsolated = true;
    }

    private static void restoreAngelicaDistantHorizons(RenderState state) {
        if (!state.angelicaDhIsolated || angelicaDhPresentField == null) {
            return;
        }
        try {
            angelicaDhPresentField.setBoolean(null, state.angelicaDhPresent);
        } catch (IllegalAccessException ignored) {
            // The bridge will detect DH again after Angelica reloads its pipeline.
        } finally {
            state.angelicaDhIsolated = false;
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

    private static void suspendDistantHorizons(RenderState state) {
        initialiseDistantHorizonsReflection();
        if (distantHorizonsRenderingEntry == null) {
            return;
        }
        try {
            Object entry = distantHorizonsRenderingEntry.get(null);
            Object previous = configEntryGet.invoke(entry);
            state.distantHorizonsHadOverride = Boolean.TRUE.equals(
                    configEntryHasVersionOverride.invoke(entry));
            configEntrySetVersionOverride.invoke(entry, Boolean.FALSE);
            state.distantHorizonsEntry = entry;
            state.distantHorizonsPreviousValue = previous;
            state.distantHorizonsSuspended = true;
        } catch (ReflectiveOperationException ignored) {
            state.distantHorizonsSuspended = false;
        } catch (LinkageError ignored) {
            state.distantHorizonsSuspended = false;
        }
    }

    private static void initialiseDistantHorizonsReflection() {
        if (distantHorizonsChecked) {
            return;
        }
        distantHorizonsChecked = true;
        try {
            ClassLoader loader = ScopeRenderCompatibility.class.getClassLoader();
            Class<?> clientConfig = Class.forName(
                    "com.seibel.distanthorizons.core.config.Config$Client", false, loader);
            distantHorizonsRenderingEntry = clientConfig.getField("quickEnableRendering");
            Class<?> entryType = distantHorizonsRenderingEntry.getType();
            configEntryGet = entryType.getMethod("get");
            configEntryHasVersionOverride = entryType.getMethod(
                    "mcVersionOverridePresent");
            configEntrySetVersionOverride = entryType.getMethod(
                    "setMcVersionOverrideValue", Object.class);
        } catch (ReflectiveOperationException ignored) {
            clearDistantHorizonsReflection();
        } catch (LinkageError ignored) {
            clearDistantHorizonsReflection();
        }
    }

    private static void clearDistantHorizonsReflection() {
        distantHorizonsRenderingEntry = null;
        configEntryGet = null;
        configEntryHasVersionOverride = null;
        configEntrySetVersionOverride = null;
    }

    private static void restoreDistantHorizons(RenderState state) {
        if (!state.distantHorizonsSuspended) {
            return;
        }
        try {
            configEntrySetVersionOverride.invoke(state.distantHorizonsEntry,
                    state.distantHorizonsHadOverride
                            ? state.distantHorizonsPreviousValue : null);
        } catch (ReflectiveOperationException ignored) {
            // DH reloads this value from its own config if its entry becomes invalid.
        } finally {
            state.distantHorizonsSuspended = false;
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
        private boolean angelicaDhIsolated;
        private boolean angelicaDhPresent;
        private boolean distantHorizonsSuspended;
        private boolean distantHorizonsHadOverride;
        private Object distantHorizonsEntry;
        private Object distantHorizonsPreviousValue;

        boolean isSecondaryRenderAllowed() {
            return secondaryRenderAllowed;
        }
    }
}
