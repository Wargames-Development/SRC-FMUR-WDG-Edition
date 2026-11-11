package com.flansmod.client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.util.function.BooleanSupplier;

import net.minecraft.client.shader.Framebuffer;

/** Optional fork API. Stock Angelica and vanilla keep their existing terrain adapters. */
final class AngelicaCameraBridge implements CameraTerrain {
    private final Method hasTerrain, supportsShaders, render, drawTerrain, beginTranslucents, phase, release;
    private CameraView view;

    static AngelicaCameraBridge find() throws ReflectiveOperationException {
        try {
            return new AngelicaCameraBridge(Class.forName("com.gtnewhorizons.angelica.api.SecondaryCamera"));
        } catch (ClassNotFoundException absent) {
            return null;
        }
    }

    private AngelicaCameraBridge(Class<?> api) throws NoSuchMethodException {
        hasTerrain = api.getMethod("hasTerrain");
        supportsShaders = api.getMethod("supportsShaders");
        render = api.getMethod("render", Framebuffer.class, FloatBuffer.class, FloatBuffer.class,
                float.class, boolean.class, BooleanSupplier.class);
        drawTerrain = api.getMethod("drawTerrain", int.class, double.class, double.class, double.class);
        beginTranslucents = api.getMethod("beginTranslucents");
        phase = api.getMethod("phase", String.class);
        release = api.getMethod("release", Framebuffer.class);
    }

    boolean hasTerrain() { return (Boolean)invoke(hasTerrain); }
    boolean supportsShaders() { return (Boolean)invoke(supportsShaders); }

    boolean render(Framebuffer target, CameraView view, boolean shaders, BooleanSupplier drawScene) {
        return (Boolean)invoke(render, target, view.projection, view.modelView, view.partialTicks, shaders, drawScene);
    }

    void beginTranslucents() { invoke(beginTranslucents); }
    void phase(String name) { invoke(phase, name); }
    void release(Framebuffer target) { invoke(release, target); }

    @Override public boolean begin(CameraView view) { this.view = view; return hasTerrain(); }
    @Override public void draw(int pass) { invoke(drawTerrain, pass, view.x, view.y, view.z); }
    @Override public void close() { view = null; }

    private static Object invoke(Method method, Object... arguments) {
        try {
            return method.invoke(null, arguments);
        } catch (InvocationTargetException failure) {
            Throwable cause = failure.getCause();
            if (cause instanceof RuntimeException) throw (RuntimeException)cause;
            if (cause instanceof Error) throw (Error)cause;
            throw new IllegalStateException(cause);
        } catch (IllegalAccessException failure) {
            throw new IllegalStateException(failure);
        }
    }
}
