package com.flansmod.client;

import java.nio.FloatBuffer;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;

/** Native/provider sky geometry only, under the colour scope's projection. */
final class CameraSky {
    private final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    private final FloatBuffer rotation = BufferUtils.createFloatBuffer(16);
    private boolean failed;

    void reset() { failed = false; }

    boolean render(Minecraft mc, CameraView view) {
        if (failed) return false;
        try {
            render(view, () -> mc.renderGlobal.renderSky(view.partialTicks));
            return true;
        } catch (RuntimeException | LinkageError problem) {
            failed = true;
            org.apache.logging.log4j.LogManager.getLogger("FMUR").warn("[Camera] World sky renderer unavailable in scope; retaining the legacy sky until reload", problem);
            return false;
        }
    }

    void render(CameraView view, Runnable sky) {
        int active = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE), mode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int program = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int draw = GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING), read = GL11.glGetInteger(GL30.GL_READ_FRAMEBUFFER_BINDING);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix();
        for (int unit = 0; unit < 2; unit++) {
            GL13.glActiveTexture(GL13.GL_TEXTURE0 + unit);
            GL11.glMatrixMode(GL11.GL_TEXTURE); GL11.glPushMatrix();
        }
        try {
            for (int i = 0; i < 16; i++) { projection.put(i, view.projection.get(i)); rotation.put(i, view.modelView.get(i)); }
            // Native sky lists live around radius 100; the terrain far plane can be shorter.
            // Keep XY magnification/off-axis projection, with a sky-only near/far range.
            float near = .05F, far = 16384;
            projection.put(10, -(far + near) / (far - near)); projection.put(14, -2 * far * near / (far - near));
            projection.put(11, -1); projection.put(15, 0);
            rotation.put(12, 0); rotation.put(13, 0); rotation.put(14, 0);
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadMatrix(projection);
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadMatrix(rotation);
            GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_SCISSOR_TEST); GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(false); GL11.glDepthRange(1, 1);
            sky.run();
        } finally {
            ThermalFramebuffers.bind(GL30.GL_READ_FRAMEBUFFER, read);
            ThermalFramebuffers.bind(GL30.GL_DRAW_FRAMEBUFFER, draw);
            for (int unit = 1; unit >= 0; unit--) {
                GL13.glActiveTexture(GL13.GL_TEXTURE0 + unit);
                GL11.glMatrixMode(GL11.GL_TEXTURE); GL11.glPopMatrix();
            }
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix();
            GL20.glUseProgram(program); GL11.glPopAttrib();
            GL13.glActiveTexture(active); GL11.glMatrixMode(mode);
        }
    }
}
