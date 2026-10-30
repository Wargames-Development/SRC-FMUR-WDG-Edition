package com.flansmod.client;

import com.flansmod.common.FlansMod;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.util.Vec3;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

/** Reconstruct visible surfaces from depth; no mesh gaps at block-face transitions. */
final class FlashlightProjection {
    private static final String VERTEX = "#version 120\nvoid main(){gl_Position=gl_Vertex;}";
    private static final String FRAGMENT = "#version 120\n"
            + "uniform sampler2D depthMap, shadowMap; uniform mat4 inverseView;\n"
            + "uniform vec4 viewport; uniform vec3 origin, forward, right, up;\n"
            + "uniform float spread, range, strength, checkShadow;\n"
            + "uniform float laser, spotRadius, brightness; uniform vec3 boundsMin, boundsMax, laserColor;\n"
            + "void main(){ vec2 uv=(gl_FragCoord.xy-viewport.xy)/viewport.zw;\n"
            + " float depth=texture2D(depthMap,uv).r; if(depth>=0.999999) discard;\n"
            + " vec4 p=inverseView*vec4(uv*2.0-1.0,depth*2.0-1.0,1.0);\n"
            + " vec3 delta=p.xyz/p.w-origin; float along=dot(delta,forward);\n"
            + " if(laser>0.5){ vec3 surface=p.xyz/p.w;\n"
            + "  if(any(lessThan(surface,boundsMin)) || any(greaterThan(surface,boundsMax)) || along<0.0) discard;\n"
            + "  float r=length(delta-forward*along)/spotRadius; if(r>=1.0) discard;\n"
            + "  float halo=pow(1.0-r,2.0)*min(0.7,brightness*0.16);\n"
            + "  float middle=pow(max(0.0,1.0-r/0.55556),2.0)*min(1.0,brightness*0.4);\n"
            + "  float core=pow(max(0.0,1.0-r/0.25),2.0);\n"
            + "  gl_FragColor=vec4(laserColor*(halo+middle)+min(vec3(1.0),laserColor+vec3(0.4))*core,1.0); return; }\n"
            + " float distance=length(delta); if(along<=0.0 || distance>=range) discard;\n"
            + " vec2 cone=vec2(dot(delta,right),dot(delta,up))/(along*spread);\n"
            + " float radius=dot(cone,cone); if(radius>=1.0) discard;\n"
            + " float shadow=1.0; if(checkShadow>0.5){\n"
            + "  float limit=texture2D(shadowMap,(cone*0.5+0.5)*(8.0/9.0)+vec2(0.5/9.0)).r*range;\n"
            + "  shadow=1.0-smoothstep(limit+0.10,limit+0.55,distance); }\n"
            + " float falloff=(1.0-radius)*(1.0-radius);\n"
            + " float fade=clamp((range-distance)/(range*0.2),0.0,1.0);\n"
            + " float light=falloff*fade/(1.0+distance*distance/225.0)*strength*shadow;\n"
            + " gl_FragColor=vec4(vec3(1.0,0.96,0.85),light); }\n";
    private static final IntBuffer VIEWPORT = BufferUtils.createIntBuffer(16);
    private static final FloatBuffer MATRIX = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer SHADOW = BufferUtils.createFloatBuffer(81);
    private static int program, depthTexture, shadowTexture, width, height;
    private static boolean failed, ready;

    static void begin(Matrix4f clip) {
        ready = false;
        if (failed || !GLContext.getCapabilities().OpenGL20) return;
        int oldProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            if (program == 0) initialise();
            GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT);
            int w = VIEWPORT.get(2), h = VIEWPORT.get(3);
            Matrix4f inverse = Matrix4f.invert(clip, null);
            if (inverse == null || w <= 0 || h <= 0) return;
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, depthTexture);
            if (width != w || height != h) {
                GL11.glCopyTexImage2D(GL11.GL_TEXTURE_2D, 0, GL14.GL_DEPTH_COMPONENT24,
                        VIEWPORT.get(0), VIEWPORT.get(1), w, h, 0);
                width = w; height = h;
            } else {
                GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0,
                        VIEWPORT.get(0), VIEWPORT.get(1), w, h);
            }
            int error = GL11.glGetError();
            if (error != GL11.GL_NO_ERROR) throw new IllegalStateException("Depth copy GL error " + error);
            GL20.glUseProgram(program);
            MATRIX.clear(); inverse.store(MATRIX); MATRIX.flip();
            GL20.glUniformMatrix4(GL20.glGetUniformLocation(program, "inverseView"), false, MATRIX);
            GL20.glUniform4f(GL20.glGetUniformLocation(program, "viewport"),
                    VIEWPORT.get(0), VIEWPORT.get(1), w, h);
            GL20.glUniform1i(GL20.glGetUniformLocation(program, "depthMap"), 0);
            GL20.glUniform1i(GL20.glGetUniformLocation(program, "shadowMap"), 1);
            ready = true;
        } catch (RuntimeException failure) {
            failed = true;
            FlansMod.logger.error("Flashlight depth projection unavailable; using surface mesh.", failure);
        } finally {
            GL20.glUseProgram(oldProgram);
            GL11.glPopAttrib();
        }
    }

    static boolean draw(Vec3 origin, Vec3 forward, Vec3 right, Vec3 up, float spread,
                        float range, float strength, float[] depths, boolean shadow) {
        if (!ready) return false;
        int previous = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL20.glUseProgram(program);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, depthTexture);
            if (shadow) {
                SHADOW.clear(); SHADOW.put(depths); SHADOW.flip();
                GL13.glActiveTexture(GL13.GL_TEXTURE1);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, shadowTexture);
                GL11.glTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0, 9, 9, GL11.GL_LUMINANCE, GL11.GL_FLOAT, SHADOW);
            }
            vector("origin", origin); vector("forward", forward); vector("right", right); vector("up", up);
            scalar("spread", spread); scalar("range", range); scalar("strength", strength);
            scalar("laser", 0F);
            scalar("checkShadow", shadow ? 1F : 0F);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex2f(-1F, -1F); GL11.glVertex2f(1F, -1F);
            GL11.glVertex2f(1F, 1F); GL11.glVertex2f(-1F, 1F);
            GL11.glEnd();
            return true;
        } finally {
            GL20.glUseProgram(previous);
            GL11.glPopAttrib();
        }
    }

    static boolean drawLaserSpot(Vec3 origin, Vec3 direction, AxisAlignedBB bounds, Matrix4f clip,
                                 float radius, float brightness, float r, float g, float b) {
        if (!ready) return false;
        // Limit the shader to the target's projected bounds instead of adding a fullscreen pass per dot.
        float minX = 1F, minY = 1F, maxX = -1F, maxY = -1F;
        boolean near = false;
        for (int i = 0; i < 8; i++) {
            Vector4f p = Matrix4f.transform(clip, new Vector4f((float) ((i & 1) == 0 ? bounds.minX : bounds.maxX),
                    (float) ((i & 2) == 0 ? bounds.minY : bounds.maxY),
                    (float) ((i & 4) == 0 ? bounds.minZ : bounds.maxZ), 1F), null);
            if (p.w <= 0.05F) { near = true; break; }
            minX = Math.min(minX, p.x / p.w); maxX = Math.max(maxX, p.x / p.w);
            minY = Math.min(minY, p.y / p.w); maxY = Math.max(maxY, p.y / p.w);
        }
        if (near) { minX = minY = -1F; maxX = maxY = 1F; }
        int x = Math.max(0, (int) Math.floor((minX + 1F) * 0.5F * width));
        int y = Math.max(0, (int) Math.floor((minY + 1F) * 0.5F * height));
        int w = Math.min(width, (int) Math.ceil((maxX + 1F) * 0.5F * width)) - x;
        int h = Math.min(height, (int) Math.ceil((maxY + 1F) * 0.5F * height)) - y;
        if (w <= 0 || h <= 0) return true;
        int previous = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL20.glUseProgram(program);
            GL13.glActiveTexture(GL13.GL_TEXTURE0); GL11.glBindTexture(GL11.GL_TEXTURE_2D, depthTexture);
            vector("origin", origin); vector("forward", direction);
            vector("boundsMin", Vec3.createVectorHelper(bounds.minX, bounds.minY, bounds.minZ));
            vector("boundsMax", Vec3.createVectorHelper(bounds.maxX, bounds.maxY, bounds.maxZ));
            GL20.glUniform3f(GL20.glGetUniformLocation(program, "laserColor"), r, g, b);
            scalar("laser", 1F); scalar("spotRadius", radius); scalar("brightness", brightness);
            GL11.glEnable(GL11.GL_SCISSOR_TEST);
            GL11.glScissor(VIEWPORT.get(0) + x, VIEWPORT.get(1) + y, w, h);
            GL11.glDisable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST); GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex2f(-1F, -1F); GL11.glVertex2f(1F, -1F);
            GL11.glVertex2f(1F, 1F); GL11.glVertex2f(-1F, 1F); GL11.glEnd();
            return true;
        } finally {
            GL20.glUseProgram(previous); GL11.glPopAttrib();
        }
    }

    private static void vector(String name, Vec3 value) {
        GL20.glUniform3f(GL20.glGetUniformLocation(program, name),
                (float) value.xCoord, (float) value.yCoord, (float) value.zCoord);
    }

    private static void scalar(String name, float value) {
        GL20.glUniform1f(GL20.glGetUniformLocation(program, name), value);
    }

    private static void initialise() {
        int vertex = compile(GL20.GL_VERTEX_SHADER, VERTEX);
        int fragment = compile(GL20.GL_FRAGMENT_SHADER, FRAGMENT);
        program = GL20.glCreateProgram();
        GL20.glAttachShader(program, vertex); GL20.glAttachShader(program, fragment);
        GL20.glLinkProgram(program);
        GL20.glDeleteShader(vertex); GL20.glDeleteShader(fragment);
        if (GL20.glGetProgrami(program, GL20.GL_LINK_STATUS) == 0)
            throw new IllegalStateException(GL20.glGetProgramInfoLog(program, 4096));
        depthTexture = texture(GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL14.GL_TEXTURE_COMPARE_MODE, GL11.GL_NONE);
        shadowTexture = texture(GL11.GL_LINEAR);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_LUMINANCE, 9, 9, 0,
                GL11.GL_LUMINANCE, GL11.GL_FLOAT, (FloatBuffer) null);
    }

    private static int texture(int filter) {
        int id = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, id);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, filter);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, filter);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        return id;
    }

    private static int compile(int type, String source) {
        int shader = GL20.glCreateShader(type);
        GL20.glShaderSource(shader, source); GL20.glCompileShader(shader);
        if (GL20.glGetShaderi(shader, GL20.GL_COMPILE_STATUS) == 0)
            throw new IllegalStateException(GL20.glGetShaderInfoLog(shader, 4096));
        return shader;
    }
}
