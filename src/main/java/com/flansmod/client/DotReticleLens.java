package com.flansmod.client;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.type.AttachmentType;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

import java.nio.FloatBuffer;

/** Projects the first-person sight aperture and clips its HUD reticle in screen space. */
public final class DotReticleLens {
    private static final int MAX_EDGES = 16;
    private static final FloatBuffer MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final Matrix4f MODEL_VIEW = new Matrix4f();
    private static final Matrix4f PROJECTION = new Matrix4f();
    private static final Vector4f POINT = new Vector4f();
    private static final double[] NDC = new double[2 * MAX_EDGES];
    private static final double[] OUTLINE = new double[2 * MAX_EDGES];
    // Each lens edge can add at most one vertex to the reticle quad.
    private static final double[] CLIP_A = new double[2 * (MAX_EDGES + 4)];
    private static final double[] CLIP_B = new double[2 * (MAX_EDGES + 4)];
    private static double[] clipped;
    private static IScope capturedScope;
    private static int edges, vertexCount;
    private static double left, top, size;

    private DotReticleLens() {}

    public static void beginFrame() {
        capturedScope = null;
    }

    public static void capture(AttachmentType scope, ModelAttachment model, float scale) {
        float[] outline = model.reticleLensOutline;
        if (outline == null || outline.length < 6 || outline.length > NDC.length) return;
        capturedScope = null;

        MATRIX_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MATRIX_BUFFER);
        MODEL_VIEW.load(MATRIX_BUFFER);
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, MATRIX_BUFFER);
        PROJECTION.load(MATRIX_BUFFER);

        for (int i = 0; i < outline.length; i += 2) {
            POINT.set(model.reticleLensX * scale, outline[i] * scale, outline[i + 1] * scale, 1F);
            Matrix4f.transform(MODEL_VIEW, POINT, POINT);
            Matrix4f.transform(PROJECTION, POINT, POINT);
            if (POINT.w <= 0F || POINT.z < -POINT.w) return;
            NDC[i] = POINT.x / POINT.w;
            NDC[i + 1] = POINT.y / POINT.w;
        }
        capturedScope = scope;
        edges = outline.length / 2;
    }

    static boolean prepare(IScope scope, int width, int height, double x, double y, double overlaySize) {
        ModelAttachment model = scope instanceof AttachmentType ? ((AttachmentType)scope).model : null;
        size = overlaySize;
        if (!(size > 0D)) return false;
        setQuad(x, y);
        if (model == null || model.reticleLensOutline == null) {
            clipped = CLIP_A;
            vertexCount = 4;
            return true;
        }
        if (capturedScope != scope) return false;

        double area = 0D;
        int coordinates = 2 * edges;
        for (int i = 0; i < coordinates; i += 2) {
            OUTLINE[i] = (1D + NDC[i]) * width * 0.5D;
            OUTLINE[i + 1] = (1D - NDC[i + 1]) * height * 0.5D;
        }
        for (int i = 0; i < coordinates; i += 2) {
            int next = (i + 2) % coordinates;
            area += OUTLINE[i] * OUTLINE[next + 1] - OUTLINE[i + 1] * OUTLINE[next];
        }
        if (Math.abs(area) < 0.001D) return false;

        vertexCount = clipQuad(coordinates, Math.copySign(1D, area));
        return vertexCount >= 3;
    }

    private static void setQuad(double x, double y) {
        left = x - size * 0.5D;
        top = y - size * 0.5D;
        CLIP_A[0] = CLIP_A[6] = left;
        CLIP_A[2] = CLIP_A[4] = left + size;
        CLIP_A[1] = CLIP_A[3] = top + size;
        CLIP_A[5] = CLIP_A[7] = top;
    }

    // Clip the reticle at its swayed position. UVs still refer to the original quad.
    private static int clipQuad(int coordinates, double winding) {
        double[] input = CLIP_A, output = CLIP_B;
        int count = 4;
        for (int edge = 0; edge < coordinates && count > 0; edge += 2) {
            int next = (edge + 2) % coordinates;
            double ax = OUTLINE[edge], ay = OUTLINE[edge + 1];
            double nx = (ay - OUTLINE[next + 1]) * winding;
            double ny = (OUTLINE[next] - ax) * winding;
            int end = (count - 1) * 2, out = 0;
            double px = input[end], py = input[end + 1], prior = nx * (px - ax) + ny * (py - ay);
            for (int i = 0; i < 2 * count; i += 2) {
                double x = input[i], y = input[i + 1], current = nx * (x - ax) + ny * (y - ay);
                if ((prior < 0D && current > 0D) || (prior > 0D && current < 0D)) {
                    double t = prior / (prior - current);
                    output[out++] = px + t * (x - px);
                    output[out++] = py + t * (y - py);
                }
                if (current >= 0D) {
                    output[out++] = x;
                    output[out++] = y;
                }
                px = x;
                py = y;
                prior = current;
            }
            count = out / 2;
            double[] swap = input;
            input = output;
            output = swap;
        }
        clipped = input;
        return count;
    }

    static void draw(Tessellator tessellator) {
        tessellator.startDrawing(GL11.GL_TRIANGLE_FAN);
        for (int i = 0; i < 2 * vertexCount; i += 2) {
            double x = clipped[i], y = clipped[i + 1];
            tessellator.addVertexWithUV(x, y, -90D, (x - left) / size, (y - top) / size);
        }
        tessellator.draw();
    }
}
