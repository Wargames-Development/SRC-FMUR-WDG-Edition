package com.flansmod.client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.util.function.BooleanSupplier;
import java.util.function.BiFunction;
import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.*;

/** Optional Flans scope provider. It is selected only for non-thermal Flans lenses. */
final class AngelicaCameraBridge implements CameraRenderManager.ShaderCamera {
    private final Method supports, render, phase, translucent, release, program;
    private Method distantAvailable, distantBegin, distantOffset, distantEnd;
    private final ShaderScopeScene scene;
    private Framebuffer target;

    static AngelicaCameraBridge find() throws ReflectiveOperationException {
        Class<?> api;
        try { api = Class.forName("com.gtnewhorizons.angelica.api.FlansScope"); }
        catch (ClassNotFoundException absent) { return null; }
        if (api.getField("API_VERSION").getInt(null) != 1) return null;
        return new AngelicaCameraBridge(api);
    }
    private AngelicaCameraBridge(Class<?> api) throws ReflectiveOperationException {
        supports = api.getMethod("supportsShaders");
        render = api.getMethod("render", Framebuffer.class, FloatBuffer.class, FloatBuffer.class, float.class, BooleanSupplier.class, BooleanSupplier.class);
        phase = api.getMethod("phase", String.class); translucent = api.getMethod("beginTranslucents");
        release = api.getMethod("release", Framebuffer.class); program = api.getMethod("terrainProgram", Object.class, Object.class);
        try {
            Method available = api.getMethod("hasDistantTerrain");
            distantBegin = api.getMethod("beginDistantTerrain", int.class, float.class);
            distantOffset = api.getMethod("distantTerrainOffset", float.class, float.class, float.class);
            distantEnd = api.getMethod("endDistantTerrain");
            distantAvailable = available;
        } catch (NoSuchMethodException olderCompanion) { distantAvailable = null; }
        CameraTerrain terrain = (CameraTerrain) Class.forName("com.flansmod.client.compat.AngelicaCameraTerrain")
            .getConstructor(BiFunction.class).newInstance((BiFunction<Object, Object, Object>) (pass, config) -> invoke(program, pass, config));
        scene = new ShaderScopeScene(this, terrain);
    }
    void capture(CameraView primary) { scene.capture(primary); }
    @Override public boolean isSupported() { return (Boolean) invoke(supports); }
    void phase(String value) { invoke(phase, value); }
    void beginTranslucents() { invoke(translucent); }
    boolean hasDistantTerrain() { return distantAvailable != null && (Boolean) invoke(distantAvailable); }
    void beginDistantTerrain(int pass, float partialTicks) { invoke(distantBegin, pass, partialTicks); }
    void distantTerrainOffset(float x, float y, float z) { invoke(distantOffset, x, y, z); }
    void endDistantTerrain() { invoke(distantEnd); }

    @Override public Framebuffer render(CameraView view) {
        int read = GL11.glGetInteger(GL30.GL_READ_FRAMEBUFFER_BINDING), draw = GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try (ThermalRenderApi.CameraPass ignored = ThermalRenderApi.beginCameraPass()) {
            if (target == null || target.framebufferWidth != view.width || target.framebufferHeight != view.height) {
                if (target != null) { invoke(release, target); target.deleteFramebuffer(); }
                target = new Framebuffer(view.width, view.height, true);
            }
            return (Boolean) invoke(render, target, view.projection, view.modelView, view.partialTicks,
                    (BooleanSupplier) () -> scene.draw(Minecraft.getMinecraft(), view),
                    (BooleanSupplier) () -> scene.drawForward(Minecraft.getMinecraft(), view)) ? target : null;
        } finally {
            ThermalFramebuffers.bind(GL30.GL_READ_FRAMEBUFFER, read); ThermalFramebuffers.bind(GL30.GL_DRAW_FRAMEBUFFER, draw);
            GL11.glPopAttrib();
        }
    }
    @Override public void destroy() {
        scene.destroy();
        if (target != null) { invoke(release, target); target.deleteFramebuffer(); target = null; }
    }
    private static Object invoke(Method method, Object... arguments) {
        try { return method.invoke(null, arguments); }
        catch (InvocationTargetException failure) {
            Throwable cause = failure.getCause();
            if (cause instanceof RuntimeException) throw (RuntimeException) cause;
            if (cause instanceof Error) throw (Error) cause;
            throw new IllegalStateException(cause);
        } catch (IllegalAccessException failure) { throw new IllegalStateException(failure); }
    }
}
