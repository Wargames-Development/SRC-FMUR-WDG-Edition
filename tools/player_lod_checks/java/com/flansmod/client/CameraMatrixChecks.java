package com.flansmod.client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;

/** Runs the production isolation boundary against independent scene and live GL matrices. */
public final class CameraMatrixChecks {
    private static int checks;
    public static void main(String[] args) throws Exception {
        Pbuffer context = new Pbuffer(32, 32, new PixelFormat(), null, null);
        Map<Field, Object> saved = new LinkedHashMap<>();
        try {
            context.makeCurrent();
            Scene scene = new Scene();
            bind(saved, "renderingState", scene);
            for (String name : new String[]{"Projection", "ModelView"}) {
                bind(saved, "renderingStateGet" + name + "Buffer", Scene.class.getMethod("get" + name + "Buffer"));
                bind(saved, "renderingStateSet" + name + "Matrix", Scene.class.getMethod("set" + name + "Matrix", FloatBuffer.class));
                // The old implementation incorrectly writes the scene snapshot into the live stack.
                bindIfPresent(saved, "renderingStateGet" + name + "Matrix", Scene.class.getMethod("get" + name + "Buffer"));
                bindIfPresent(saved, "angelicaSet" + name + "Matrix", CameraMatrixChecks.class.getMethod("set" + name + "Matrix", FloatBuffer.class));
            }
            bind(saved, "renderingStateGetFov", Scene.class.getMethod("getFov"));
            bind(saved, "renderingStateSetFov", Scene.class.getMethod("setFov", float.class));
            Method capture = ScopeRenderCompatibility.class.getDeclaredMethod("captureRenderingState", ScopeRenderCompatibility.RenderState.class);
            Method restore = ScopeRenderCompatibility.class.getDeclaredMethod("restoreRenderingState", ScopeRenderCompatibility.RenderState.class);
            capture.setAccessible(true); restore.setAccessible(true);
            for (int frame = 0; frame < 40; frame++) {
                // Change world position, local model transform and projection every frame.
                scene.p = matrix(1 + frame); scene.m = matrix(50 + frame); scene.fov = 70;
                FloatBuffer p = matrix(100 + frame), m = matrix(200 + frame);
                setProjectionMatrix(p); setModelViewMatrix(m);
                GL11.glMatrixMode(GL11.GL_TEXTURE);
                ScopeRenderCompatibility.RenderState outer = new ScopeRenderCompatibility.RenderState();
                capture.invoke(null, outer);
                pushMatrices();
                scene.p = matrix(300); scene.m = matrix(400); scene.fov = 12;
                FloatBuffer nestedP = matrix(500), nestedM = matrix(600);
                setProjectionMatrix(nestedP); setModelViewMatrix(nestedM);
                ScopeRenderCompatibility.RenderState inner = new ScopeRenderCompatibility.RenderState();
                capture.invoke(null, inner);
                pushMatrices();
                try {
                    scene.p = matrix(700); scene.m = matrix(800);
                    setProjectionMatrix(matrix(900)); setModelViewMatrix(matrix(1000));
                    throw new IllegalStateException("renderer failure");
                } catch (IllegalStateException expected) {
                    popMatrices();
                    restore.invoke(null, inner);
                }
                equal(nestedP, read(GL11.GL_PROJECTION_MATRIX), "nested live projection");
                equal(nestedM, read(GL11.GL_MODELVIEW_MATRIX), "nested live model view");
                equal(matrix(300), scene.p, "nested scene projection");
                popMatrices();
                GL11.glMatrixMode(GL11.GL_TEXTURE);
                restore.invoke(null, outer);
                equal(p, read(GL11.GL_PROJECTION_MATRIX), "caller live projection");
                equal(m, read(GL11.GL_MODELVIEW_MATRIX), "caller live model view");
                equal(matrix(1 + frame), scene.p, "caller scene projection");
                equal(matrix(50 + frame), scene.m, "caller scene model view");
                if (scene.fov != 70 || GL11.glGetInteger(GL11.GL_MATRIX_MODE) != GL11.GL_TEXTURE)
                    throw new AssertionError("FOV or selected matrix stack changed");
                checks++;
            }
            if (GL11.glGetError() != GL11.GL_NO_ERROR) throw new AssertionError("GL error");
            System.out.println("PASS " + checks + " scene/live matrix isolation checks");
        } finally {
            for (Map.Entry<Field, Object> entry : saved.entrySet()) entry.getKey().set(null, entry.getValue());
            context.destroy();
        }
    }
    private static void bind(Map<Field,Object> saved, String name, Object value) throws Exception {
        Field field = ScopeRenderCompatibility.class.getDeclaredField(name); field.setAccessible(true);
        saved.put(field, field.get(null)); field.set(null, value);
    }
    private static void bindIfPresent(Map<Field,Object> saved, String name, Object value) throws Exception {
        try { bind(saved, name, value); } catch (NoSuchFieldException removedLegacyBridge) { }
    }
    private static FloatBuffer matrix(float translation) {
        FloatBuffer buffer = BufferUtils.createFloatBuffer(16);
        buffer.put(0, 1); buffer.put(5, 2); buffer.put(10, 3); buffer.put(15, 1);
        buffer.put(12, translation); buffer.put(13, -translation); return buffer;
    }
    private static FloatBuffer read(int parameter) {
        FloatBuffer value = BufferUtils.createFloatBuffer(16); GL11.glGetFloat(parameter, value); return value;
    }
    private static void equal(FloatBuffer expected, FloatBuffer actual, String label) {
        for (int i = 0; i < 16; i++) if (expected.get(i) != actual.get(i))
            throw new AssertionError(label + " differs at " + i + ": expected " + expected.get(i) + " got " + actual.get(i));
        checks++;
    }
    public static void setProjectionMatrix(FloatBuffer value) { load(GL11.GL_PROJECTION, value); }
    public static void setModelViewMatrix(FloatBuffer value) { load(GL11.GL_MODELVIEW, value); }
    private static void load(int mode, FloatBuffer value) {
        int previous = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glMatrixMode(mode); GL11.glLoadMatrix(value); GL11.glMatrixMode(previous);
    }
    private static void pushMatrices() {
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix();
    }
    private static void popMatrices() {
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPopMatrix();
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix();
    }
    public static final class Scene {
        FloatBuffer p, m; float fov;
        public FloatBuffer getProjectionBuffer() { return p; }
        public FloatBuffer getModelViewBuffer() { return m; }
        public void setProjectionMatrix(FloatBuffer value) { p = value; }
        public void setModelViewMatrix(FloatBuffer value) { m = value; }
        public float getFov() { return fov; }
        public void setFov(float value) { fov = value; }
    }
}
