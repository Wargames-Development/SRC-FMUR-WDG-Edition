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
    private static IntBuffer primaryDrawBuffer;
    private static Object cachedCapabilities;
    private static int maxDrawBuffers;
    private static boolean colorOnlyPassActive;

    private ShaderRenderCompat() {
    }

    /**
     * When a shader pack has multiple render targets active, temporarily keep
     * only fragment output 0 (the visible color target). Returns true only when
     * the draw-buffer mapping was changed and therefore needs restoring.
     */
    public static boolean beginPrimaryColorOnly() {
        if (colorOnlyPassActive || !ensureDrawBufferSupport()) {
            return false;
        }

        int firstDrawBuffer = GL11.glGetInteger(GL20.GL_DRAW_BUFFER0);
        if (firstDrawBuffer == GL11.GL_NONE) {
            return false;
        }
        boolean hasAuxiliaryBuffer = GL11.glGetInteger(GL20.GL_DRAW_BUFFER1) != GL11.GL_NONE;
        if (!hasAuxiliaryBuffer && GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM) != 0) {
            // Shader programs may legally use a sparse output mapping. Fixed-function
            // rendering cannot produce those higher fragment outputs, so vanilla can
            // stop after the inexpensive output-1 check.
            for (int i = 2; i < maxDrawBuffers; i++) {
                if (GL11.glGetInteger(GL20.GL_DRAW_BUFFER0 + i) != GL11.GL_NONE) {
                    hasAuxiliaryBuffer = true;
                    break;
                }
            }
        }

        if (!hasAuxiliaryBuffer) {
            return false;
        }

        // DRAW_BUFFERi is color-buffer state, so the attribute stack restores
        // the complete shader-pack mapping without querying every active target.
        GL11.glPushAttrib(GL11.GL_COLOR_BUFFER_BIT);
        try {
            primaryDrawBuffer.clear();
            primaryDrawBuffer.put(firstDrawBuffer);
            primaryDrawBuffer.flip();
            GL20.glDrawBuffers(primaryDrawBuffer);
        } catch (RuntimeException exception) {
            GL11.glPopAttrib();
            throw exception;
        }
        colorOnlyPassActive = true;
        return true;
    }

    public static void endPrimaryColorOnly(boolean changed) {
        if (!changed) {
            return;
        }

        try {
            GL11.glPopAttrib();
        } finally {
            colorOnlyPassActive = false;
        }
    }

    private static boolean ensureDrawBufferSupport() {
        Object capabilities = GLContext.getCapabilities();
        if (cachedCapabilities != capabilities) {
            cachedCapabilities = capabilities;
            colorOnlyPassActive = false;
            if (!GLContext.getCapabilities().OpenGL20) {
                maxDrawBuffers = 0;
                primaryDrawBuffer = null;
                return false;
            }
            maxDrawBuffers = GL11.glGetInteger(GL20.GL_MAX_DRAW_BUFFERS);
            primaryDrawBuffer = maxDrawBuffers >= 2 ? BufferUtils.createIntBuffer(1) : null;
        }
        return maxDrawBuffers >= 2;
    }
}
