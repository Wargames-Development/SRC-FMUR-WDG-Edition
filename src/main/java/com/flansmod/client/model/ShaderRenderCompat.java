package com.flansmod.client.model;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

import java.nio.IntBuffer;

/**
 * Keeps small translucent first-person sub-passes from replacing shader-pack
 * G-buffer outputs that still need to describe the world behind them.
 */
public final class ShaderRenderCompat {
    private static IntBuffer savedDrawBuffers;
    private static IntBuffer primaryDrawBuffer;
    private static int drawBufferCapacity;
    private static int savedDrawBufferCount;
    private static boolean colorOnlyPassActive;

    private ShaderRenderCompat() {
    }

    /**
     * When a shader pack has multiple render targets active, temporarily keep
     * only fragment output 0 (the visible color target). Returns true only when
     * the draw-buffer mapping was changed and therefore needs restoring.
     */
    public static boolean beginPrimaryColorOnly() {
        if (!GLContext.getCapabilities().OpenGL20 || colorOnlyPassActive) {
            return false;
        }

        int maxDrawBuffers = GL11.glGetInteger(GL20.GL_MAX_DRAW_BUFFERS);
        if (maxDrawBuffers < 2) {
            return false;
        }
        ensureCapacity(maxDrawBuffers);

        savedDrawBuffers.clear();
        int firstDrawBuffer = GL11.GL_NONE;
        boolean hasAuxiliaryBuffer = false;
        for (int i = 0; i < maxDrawBuffers; i++) {
            int drawBuffer = GL11.glGetInteger(GL20.GL_DRAW_BUFFER0 + i);
            savedDrawBuffers.put(drawBuffer);
            if (i == 0) {
                firstDrawBuffer = drawBuffer;
            } else if (drawBuffer != GL11.GL_NONE) {
                hasAuxiliaryBuffer = true;
            }
        }

        if (firstDrawBuffer == GL11.GL_NONE || !hasAuxiliaryBuffer) {
            savedDrawBuffers.clear();
            return false;
        }
        savedDrawBufferCount = maxDrawBuffers;

        primaryDrawBuffer.clear();
        primaryDrawBuffer.put(firstDrawBuffer);
        primaryDrawBuffer.flip();
        GL20.glDrawBuffers(primaryDrawBuffer);
        colorOnlyPassActive = true;
        return true;
    }

    public static void endPrimaryColorOnly(boolean changed) {
        if (!changed) {
            return;
        }

        savedDrawBuffers.position(0);
        savedDrawBuffers.limit(savedDrawBufferCount);
        GL20.glDrawBuffers(savedDrawBuffers);
        savedDrawBuffers.clear();
        colorOnlyPassActive = false;
    }

    private static void ensureCapacity(int maxDrawBuffers) {
        if (savedDrawBuffers != null && drawBufferCapacity >= maxDrawBuffers) {
            return;
        }

        drawBufferCapacity = maxDrawBuffers;
        savedDrawBuffers = BufferUtils.createIntBuffer(drawBufferCapacity);
        primaryDrawBuffer = BufferUtils.createIntBuffer(1);
    }
}
