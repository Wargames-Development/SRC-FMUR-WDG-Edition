package com.flansmod.client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

/** Direct secondary-view particles with the same depth contract as the camera's DH terrain. */
final class CameraParticles {
    private static final String DEPTH = PlayerLodDepthLayer.DEPTH_FUNCTION
            + "float particleDepth(float d){float z=physicalDepth(d);"
            + "if(d>4096.0)z=transitionDepth+(1.0-transitionDepth)*(0.85+0.15*(1.0-4096.0/d));return z;}\n";
    static final String DEPTH_VERTEX = DEPTH
            + "varying float cameraDistance;void cameraPosition(){"
            + "vec4 eye=gl_ModelViewMatrix*gl_Vertex;cameraDistance=eyeOrigin-eye.z;"
            + "gl_Position=gl_ProjectionMatrix*eye;if(cameraDistance>transitionStart)"
            + "gl_Position.z=(2.0*particleDepth(cameraDistance)-1.0)*gl_Position.w;}\n";
    static final String DEPTH_FRAGMENT = DEPTH
            + "varying float cameraDistance;void cameraDepth(){"
            + "gl_FragDepth=cameraDistance>transitionStart?clamp(particleDepth(cameraDistance),0.0,1.0):gl_FragCoord.z;}\n";
    private static final String VERTEX = "#version 120\n" + DEPTH_VERTEX
            + "varying vec2 uv,light;varying vec4 color;void main(){cameraPosition();"
            + "uv=gl_MultiTexCoord0.xy;light=(gl_TextureMatrix[1]*gl_MultiTexCoord1).xy;color=gl_Color;}\n";
    private static final String FRAGMENT = "#version 120\n" + DEPTH_FRAGMENT
            + "uniform sampler2D particleTexture,lightMap;varying vec2 uv,light;varying vec4 color;"
            + "void main(){vec4 p=texture2D(particleTexture,uv)*color;"
            + "if(p.a<=0.00392157)discard;cameraDepth();"
            + "gl_FragColor=vec4(p.rgb*texture2D(lightMap,light).rgb,p.a);}\n";
    private static final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer modelView = BufferUtils.createFloatBuffer(16);
    private static Method distantParticles;
    private static boolean checked;
    private static int program;

    private CameraParticles() { }

    static void render(Runnable particles, boolean thermalMask) {
        int previous = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        try {
            if (!thermalMask && program == 0) program = createProgram();
            int active = thermalMask ? previous : program;
            GL20.glUseProgram(active);
            prepare(active);
            if (!checked) {
                checked = true;
                try {
                    distantParticles = Class.forName("com.seibel.distanthorizons.forge17.effects.DistantSmokeRenderer")
                            .getMethod("renderCameraParticles", Runnable.class, boolean.class);
                } catch (ClassNotFoundException | NoSuchMethodException absent) {
                    // Earlier DH builds retain their existing particle behaviour.
                    distantParticles = null;
                }
            }
            if (distantParticles == null) particles.run();
            else distantParticles.invoke(null, particles, thermalMask);
        } catch (InvocationTargetException failure) {
            Throwable cause = failure.getCause();
            if (cause instanceof RuntimeException) throw (RuntimeException)cause;
            if (cause instanceof Error) throw (Error)cause;
            throw new IllegalStateException("Distant camera particles failed", cause);
        } catch (IllegalAccessException failure) {
            throw new IllegalStateException("Distant camera particle bridge unavailable", failure);
        } finally { GL20.glUseProgram(previous); }
    }

    static void prepare(int active) {
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, projection);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, modelView);
        Minecraft mc = Minecraft.getMinecraft();
        float start = mc == null || mc.gameSettings == null ? 16
                : Math.max(16, mc.gameSettings.renderDistanceChunks * 16 - 16);
        float origin = modelView.get(14), eye = origin - start;
        uniform(active, "worldZ", projection.get(10)); uniform(active, "worldOffset", projection.get(14));
        uniform(active, "eyeOrigin", origin); uniform(active, "transitionStart", start);
        uniform(active, "transitionDepth", 0.5F * ((projection.get(10) * eye + projection.get(14)) / -eye + 1));
        GL20.glUniform1i(GL20.glGetUniformLocation(active, "particleTexture"), 0);
        GL20.glUniform1i(GL20.glGetUniformLocation(active, "lightMap"), 1);
    }

    private static void uniform(int active, String name, float value) {
        GL20.glUniform1f(GL20.glGetUniformLocation(active, name), value);
    }

    private static int createProgram() {
        int vertex = 0, fragment = 0, result = 0;
        try {
            vertex = compile(GL20.GL_VERTEX_SHADER, VERTEX); fragment = compile(GL20.GL_FRAGMENT_SHADER, FRAGMENT);
            result = GL20.glCreateProgram(); GL20.glAttachShader(result, vertex); GL20.glAttachShader(result, fragment);
            GL20.glLinkProgram(result);
            if (GL20.glGetProgrami(result, GL20.GL_LINK_STATUS) == GL11.GL_FALSE)
                throw new IllegalStateException(GL20.glGetProgramInfoLog(result, 4096));
            return result;
        } catch (RuntimeException failure) {
            if (result != 0) GL20.glDeleteProgram(result);
            throw failure;
        } finally {
            if (vertex != 0) GL20.glDeleteShader(vertex);
            if (fragment != 0) GL20.glDeleteShader(fragment);
        }
    }

    private static int compile(int type, String source) {
        int shader = GL20.glCreateShader(type); GL20.glShaderSource(shader, source); GL20.glCompileShader(shader);
        if (GL20.glGetShaderi(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
            String message = GL20.glGetShaderInfoLog(shader, 4096); GL20.glDeleteShader(shader);
            throw new IllegalStateException(message);
        }
        return shader;
    }

    static void destroy() {
        if (program != 0) GL20.glDeleteProgram(program);
        program = 0;
    }
}
