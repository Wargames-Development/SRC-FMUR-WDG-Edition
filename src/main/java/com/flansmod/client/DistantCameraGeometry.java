package com.flansmod.client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.locks.StampedLock;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.*;

/** Read-only DH buffer borrowing. No DH render events, target swaps, rebuilds or shader callbacks. */
final class DistantCameraGeometry {
    private static final String DEPTH = PlayerLodDepthLayer.DEPTH_FUNCTION
            + "float cameraDepth(float d){float depth=physicalDepth(d);"
            + "if(d>4096.0)depth=transitionDepth+(1.0-transitionDepth)*(0.85+0.15*(1.0-4096.0/d));return depth;}\n";
    private static final String VERTEX = "#version 120\n"
            + "attribute vec4 cameraPosition, cameraColor;uniform vec3 cameraOffset;"
            + "varying vec4 tint;varying vec2 light;varying float eyeDistance;varying float radius;\n"
            + DEPTH
            + "void main(){vec3 p=cameraPosition.xyz+cameraOffset;float micro=floor(cameraPosition.w/256.0);"
            + "p.x+=mod(micro,2.0)*(1.0-2.0*mod(floor(micro/2.0),2.0))*0.01;"
            + "p.z+=mod(floor(micro/16.0),2.0)*(1.0-2.0*mod(floor(micro/32.0),2.0))*0.01;"
            + "vec4 eye=gl_ModelViewMatrix*vec4(p,1.0);eyeDistance=eyeOrigin-eye.z;radius=length(p.xz);"
            + "gl_Position=gl_ProjectionMatrix*eye;"
            + "if(eyeDistance>transitionStart)gl_Position.z=(2.0*cameraDepth(eyeDistance)-1.0)*gl_Position.w;"
            + "tint=cameraColor;float lights=mod(cameraPosition.w,256.0);"
            // DH packs sky first, block second; Minecraft's lightmap is indexed block X, sky Y.
            + "light=(vec2(floor(lights/16.0),mod(lights,16.0))+0.5)/16.0;}\n";
    private static final String FRAGMENT = "#version 120\n"
            + "uniform sampler2D lightMap;uniform float clipDistance;"
            + "varying vec4 tint;varying vec2 light;varying float eyeDistance;varying float radius;\n"
            + DEPTH
            + "void main(){if(radius<clipDistance||tint.a<0.01)discard;"
            + "gl_FragColor=vec4(tint.rgb*texture2D(lightMap,light).rgb,tint.a);"
            + "gl_FragDepth=clamp(cameraDepth(eyeDistance),0.0,1.0);}\n";

    private boolean checked, present;
    private String failure = "";
    private CameraView primary;
    private Object buffers;
    private int count, maxHeight;
    private Method worldGetter, levelGetter, handlerGetter, buffersGetter, sizeGetter, itemGetter;
    private Method blockX, blockY, blockZ, blockWidth, nearClip;
    private Method unwrap, maximumHeight;
    private Method isRendering;
    private Field renderState, stateLevel, containerCorner, containerPosition, uploaded, opaque, transparent;
    private Field bufferLock;
    private Method bufferId, vertexCount, indexBuffer, indexId, indexType;
    private Field indexLock;
    private int program, vao, oldVao, oldArray, oldProgram;
    private int offsetUniform;
    private boolean drawing;

    String failure() { return failure; }
    void capture(CameraView source) { primary = source; }

    boolean begin(CameraView view) {
        if (!checked) resolve();
        if (!present) return failure.isEmpty();
        if (!failure.isEmpty() || primary == null || !canBorrow(primary, view)) return false;
        try {
            Object world = worldGetter.invoke(null);
            Object state = renderState.get(null);
            Object wrapper = stateLevel.get(state);
            if (world == null || wrapper == null) { buffers = null; count = 0; return true; }
            if (unwrap.invoke(wrapper) != Minecraft.getMinecraft().theWorld) return false;
            Object level = levelGetter.invoke(world, wrapper);
            if (level != null && !Boolean.TRUE.equals(isRendering.invoke(level))) { buffers = null; count = 0; return true; }
            Object handler = level == null ? null : handlerGetter.invoke(level);
            buffers = handler == null ? null : buffersGetter.invoke(handler);
            count = buffers == null ? 0 : ((Number)sizeGetter.invoke(buffers)).intValue();
            maxHeight = ((Number)maximumHeight.invoke(wrapper)).intValue();
            return true;
        } catch (ReflectiveOperationException | RuntimeException | LinkageError problem) {
            failure = problem.toString(); return false;
        }
    }

    static boolean canBorrow(CameraView primary, CameraView secondary) {
        if (primary.x != secondary.x || primary.y != secondary.y || primary.z != secondary.z) return false;
        for (int i = 0; i < 16; i++) if (primary.modelView.get(i) != secondary.modelView.get(i)) return false;
        return secondary.projection.get(0) >= primary.projection.get(0) * 0.99999F
                && secondary.projection.get(5) >= primary.projection.get(5) * 0.99999F
                && secondary.projection.get(8) == primary.projection.get(8)
                && secondary.projection.get(9) == primary.projection.get(9);
    }

    boolean draw(CameraView view, int pass) {
        if (!present || buffers == null || count == 0) return true;
        try {
            if (!beginDraw(view, Math.max(0, ((Number)nearClip.invoke(null)).floatValue()))) return false;
            for (int n = 0; n < count; n++) {
                Object container = itemGetter.invoke(buffers, pass == 0 ? n : count - 1 - n);
                Object corner = containerCorner.get(container);
                double x = ((Number)blockX.invoke(corner)).doubleValue();
                double y = ((Number)blockY.invoke(corner)).doubleValue();
                double z = ((Number)blockZ.invoke(corner)).doubleValue();
                int width = ((Number)blockWidth.invoke(null, containerPosition.getLong(container))).intValue();
                if (!view.visible(x, y, z, x + width, maxHeight, z + width, true)) continue;
                if (!uploaded.getBoolean(container)) return false;
                Object[] meshes = (Object[])(pass == 0 ? opaque : transparent).get(container);
                GL20.glUniform3f(offsetUniform, (float)(x - view.x), (float)(y - view.y), (float)(z - view.z));
                for (Object mesh : meshes) if (mesh != null && !drawMesh(mesh)) return false;
            }
            return true;
        } catch (ReflectiveOperationException | RuntimeException | LinkageError problem) {
            failure = problem.toString(); return false;
        } finally { endDraw(); }
    }

    private void resolve() {
        resolve(getClass().getClassLoader());
    }

    private void resolve(ClassLoader loader) {
        checked = true;
        try { Class.forName("com.seibel.distanthorizons.api.DhApi", false, loader); }
        catch (ClassNotFoundException absent) { return; }
        present = true;
        try {
            Class<?> api = Class.forName("com.seibel.distanthorizons.core.api.internal.SharedApi", false, loader);
            Class<?> client = Class.forName("com.seibel.distanthorizons.core.api.internal.ClientApi", false, loader);
            Class<?> world = Class.forName("com.seibel.distanthorizons.core.world.IDhClientWorld", false, loader);
            Class<?> wrapper = Class.forName("com.seibel.distanthorizons.core.wrapperInterfaces.world.ILevelWrapper", false, loader);
            Class<?> level = Class.forName("com.seibel.distanthorizons.core.level.IDhLevel", false, loader);
            Class<?> handler = Class.forName("com.seibel.distanthorizons.core.render.RenderBufferHandler", false, loader);
            Class<?> container = Class.forName("com.seibel.distanthorizons.core.dataObjects.render.bufferBuilding.LodBufferContainer", false, loader);
            Class<?> set = Class.forName("com.seibel.distanthorizons.core.util.objects.SortedArraySet", false, loader);
            worldGetter = api.getMethod("tryGetDhClientWorld");
            unwrap = wrapper.getMethod("getWrappedMcObject"); maximumHeight = wrapper.getMethod("getMaxHeight");
            levelGetter = world.getMethod("getClientLevel", wrapper);
            isRendering = levelGetter.getReturnType().getMethod("isRendering");
            handlerGetter = level.getMethod("getRenderBufferHandler");
            buffersGetter = handler.getMethod("getColumnRenderBuffers");
            sizeGetter = set.getMethod("size"); itemGetter = set.getMethod("get", int.class);
            renderState = client.getField("RENDER_STATE");
            stateLevel = renderState.getType().getField("clientLevelWrapper");
            containerCorner = container.getField("minCornerBlockPos"); containerPosition = container.getField("pos");
            uploaded = container.getField("buffersUploaded");
            opaque = container.getField("vboOpaqueWrappers"); transparent = container.getField("vboTransparentWrappers");
            blockX = containerCorner.getType().getMethod("getX");
            blockY = containerCorner.getType().getMethod("getY"); blockZ = containerCorner.getType().getMethod("getZ");
            blockWidth = Class.forName("com.seibel.distanthorizons.core.pos.DhSectionPos", false, loader).getMethod("getBlockWidth", long.class);
            nearClip = Class.forName("com.seibel.distanthorizons.core.util.RenderUtil", false, loader).getMethod("getNearClipPlaneInBlocks");
            Class<?> format = Class.forName("com.seibel.distanthorizons.common.render.openGl.util.vertexFormat.GlLodVertexFormat", true, loader);
            Object layout = format.getField("DH_VERTEX_FORMAT").get(null);
            if (((Number)format.getMethod("getByteSize").invoke(layout)).intValue() != 16
                    || ((Number)format.getMethod("getOffset", int.class).invoke(layout, 3)).intValue() != 8)
                throw new IllegalStateException("Unsupported DH vertex layout");
            bindBufferType(Class.forName("com.seibel.distanthorizons.common.render.openGl.glObject.buffer.GLVertexBuffer", false, loader));
        } catch (ReflectiveOperationException | RuntimeException | LinkageError problem) { failure = problem.toString(); }
    }

    void bindBufferType(Class<?> type) throws ReflectiveOperationException {
        bufferLock = type.getField("renderStampLock"); bufferId = type.getMethod("getId");
        vertexCount = type.getMethod("getVertexCount"); indexBuffer = type.getMethod("getQuadIBO");
        Class<?> indices = indexBuffer.getReturnType();
        indexLock = indices.getField("renderStampLock"); indexId = indices.getMethod("getId");
        indexType = indices.getMethod("getGlType");
    }

    boolean beginDraw(CameraView view, float clipDistance) {
        if (!GLContext.getCapabilities().OpenGL30 && !GLContext.getCapabilities().GL_ARB_vertex_array_object) return false;
        double start = Math.max(16, Minecraft.getMinecraft().gameSettings.renderDistanceChunks * 16.0 - 16);
        return beginDraw(view, clipDistance, start);
    }

    boolean beginDraw(CameraView view, float clipDistance, double start) {
        if (!Double.isFinite(PlayerLodProjection.projected(start + 1, start))) return false;
        if (program == 0) {
            program = createProgram();
            offsetUniform = GL20.glGetUniformLocation(program, "cameraOffset");
            vao = GLContext.getCapabilities().OpenGL30 ? GL30.glGenVertexArrays() : ARBVertexArrayObject.glGenVertexArrays();
        }
        oldVao = GL11.glGetInteger(GL30.GL_VERTEX_ARRAY_BINDING);
        oldArray = GL11.glGetInteger(GL15.GL_ARRAY_BUFFER_BINDING);
        oldProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        drawing = true;
        bindVao(vao); GL20.glUseProgram(program);
        float origin = view.modelView.get(14), worldZ = view.projection.get(10), worldOffset = view.projection.get(14);
        float eye = origin - (float)start;
        uniform("worldZ", worldZ); uniform("worldOffset", worldOffset); uniform("eyeOrigin", origin);
        uniform("transitionStart", (float)start); uniform("transitionDepth", 0.5F * ((worldZ * eye + worldOffset) / -eye + 1));
        uniform("clipDistance", clipDistance); GL20.glUniform1i(GL20.glGetUniformLocation(program, "lightMap"), 1);
        GL20.glEnableVertexAttribArray(0); GL20.glEnableVertexAttribArray(1);
        return true;
    }

    boolean drawMesh(Object mesh) throws ReflectiveOperationException {
        StampedLock vertices = (StampedLock)bufferLock.get(mesh);
        long vertexStamp = vertices.tryReadLock();
        if (vertexStamp == 0) return false;
        try {
            Object indices = indexBuffer.invoke(mesh);
            StampedLock index = (StampedLock)indexLock.get(indices);
            long indexStamp = index.tryReadLock();
            if (indexStamp == 0) return false;
            try {
                int count = ((Number)vertexCount.invoke(mesh)).intValue();
                int vbo = ((Number)bufferId.invoke(mesh)).intValue(), ibo = ((Number)indexId.invoke(indices)).intValue();
                if (count == 0) return true;
                if (vbo <= 0 || ibo <= 0 || count < 0 || count % 4 != 0 || count / 4 > Integer.MAX_VALUE / 6) return false;
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo); GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, ibo);
                GL20.glVertexAttribPointer(0, 4, GL11.GL_UNSIGNED_SHORT, false, 16, 0L);
                GL20.glVertexAttribPointer(1, 4, GL11.GL_UNSIGNED_BYTE, true, 16, 8L);
                GL11.glDrawElements(GL11.GL_TRIANGLES, count / 4 * 6, ((Number)indexType.invoke(indices)).intValue(), 0L);
                return true;
            } finally { index.unlockRead(indexStamp); }
        } finally { vertices.unlockRead(vertexStamp); }
    }

    void offset(float x, float y, float z) { GL20.glUniform3f(offsetUniform, x, y, z); }
    void endDraw() {
        if (!drawing) return;
        bindVao(oldVao); GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, oldArray); GL20.glUseProgram(oldProgram);
        drawing = false;
    }
    private void uniform(String name, float value) { GL20.glUniform1f(GL20.glGetUniformLocation(program, name), value); }
    private static void bindVao(int value) {
        if (GLContext.getCapabilities().OpenGL30) GL30.glBindVertexArray(value);
        else ARBVertexArrayObject.glBindVertexArray(value);
    }
    private static int createProgram() {
        int vertex = 0, fragment = 0, result = 0;
        try {
            vertex = compile(GL20.GL_VERTEX_SHADER, VERTEX); fragment = compile(GL20.GL_FRAGMENT_SHADER, FRAGMENT);
            result = GL20.glCreateProgram();
            GL20.glAttachShader(result, vertex); GL20.glAttachShader(result, fragment);
            GL20.glBindAttribLocation(result, 0, "cameraPosition"); GL20.glBindAttribLocation(result, 1, "cameraColor");
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
            String message = GL20.glGetShaderInfoLog(shader, 4096); GL20.glDeleteShader(shader); throw new IllegalStateException(message);
        }
        return shader;
    }
    void destroy() {
        if (program != 0) GL20.glDeleteProgram(program);
        if (vao != 0) {
            if (GLContext.getCapabilities().OpenGL30) GL30.glDeleteVertexArrays(vao);
            else ARBVertexArrayObject.glDeleteVertexArrays(vao);
        }
        program = 0; vao = 0; buffers = null; count = 0; failure = ""; checked = false; present = false; primary = null;
    }
}
