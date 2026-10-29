package com.flansmod.client;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/** One camera's matrices and culling, independent of RenderGlobal's visibility flags. */
public final class CameraView {
    public final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    public final FloatBuffer modelView = BufferUtils.createFloatBuffer(16);
    public double x, y, z;
    public int width, height;
    public float partialTicks;
    private final float[] clip = new float[16];

    void capture(double x, double y, double z, float partialTicks) {
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, projection);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, modelView);
        this.x = x; this.y = y; this.z = z; this.partialTicks = partialTicks;
    }

    void set(CameraView source, int width, int height, float magnification, float primaryAspect, float displayAspect) {
        for (int i = 0; i < 16; i++) {
            projection.put(i, source.projection.get(i));
            modelView.put(i, source.modelView.get(i));
        }
        projection.put(0, projection.get(0) * primaryAspect / displayAspect * magnification);
        projection.put(5, projection.get(5) * magnification);
        x = source.x; y = source.y; z = source.z; partialTicks = source.partialTicks;
        this.width = width; this.height = height;
        for (int column = 0; column < 4; column++) for (int row = 0; row < 4; row++) {
            float value = 0;
            for (int i = 0; i < 4; i++) value += projection.get(i * 4 + row) * modelView.get(column * 4 + i);
            clip[column * 4 + row] = value;
        }
    }

    public boolean visible(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        return visible(minX, minY, minZ, maxX, maxY, maxZ, false);
    }

    boolean visible(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, boolean distant) {
        minX -= x; maxX -= x; minY -= y; maxY -= y; minZ -= z; maxZ -= z;
        for (int axis = 0; axis < 3; axis++) for (int sign = -1; sign <= 1; sign += 2) {
            if (distant && axis == 2 && sign == -1) continue;
            float a = clip[3] + sign * clip[axis];
            float b = clip[7] + sign * clip[4 + axis];
            float c = clip[11] + sign * clip[8 + axis];
            float d = clip[15] + sign * clip[12 + axis];
            if (a * (a >= 0 ? maxX : minX) + b * (b >= 0 ? maxY : minY)
                    + c * (c >= 0 ? maxZ : minZ) + d < 0) return false;
        }
        return true;
    }
}
