package com.flansmod.client;

import java.nio.FloatBuffer;
import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;

/** Native sky and cloud rendering into the colour scope. */
final class CameraSky {
    private final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    private final FloatBuffer rotation = BufferUtils.createFloatBuffer(16);
    private boolean failed;
    private boolean cloudsFailed;
    private boolean distantCloudsChecked;
    private Method distantCloudFarPlane, distantCloudRender;

    void reset() { failed = false; cloudsFailed = false; distantCloudsChecked = false; }

    boolean prepareDistantClouds(Minecraft mc, CameraView view) {
        if (ScopeRenderCompatibility.isShaderPackInUse()) return false;
        try {
            if (!distantCloudsChecked) {
                distantCloudsChecked = true;
                Class<?> api = Class.forName("com.seibel.distanthorizons.forge17.effects.ScopeCloudApi");
                distantCloudRender = api.getMethod("render", Object.class, FloatBuffer.class, FloatBuffer.class,
                    double.class, double.class, double.class, float.class);
                distantCloudFarPlane = api.getMethod("farPlane", Object.class);
            }
            if (distantCloudFarPlane == null) return false;
            float far = (Float)distantCloudFarPlane.invoke(null, mc.theWorld);
            if (!(far > 0 && Float.isFinite(far))) return false;
            // Keep native terrain, DH terrain, actors and clouds in the same depth space.
            view.extendFarPlane(far);
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException absent) {
            return false;
        } catch (ReflectiveOperationException | RuntimeException | LinkageError problem) {
            disableDistantClouds(problem);
            return false;
        }
    }

    void renderDistantClouds(Minecraft mc, CameraView view) {
        try {
            renderClouds(view, () -> {
                try {
                    distantCloudRender.invoke(null, mc.theWorld, view.projection, view.modelView,
                        view.x, view.y, view.z, view.partialTicks);
                } catch (ReflectiveOperationException problem) {
                    throw new IllegalStateException(problem);
                }
            });
        } catch (RuntimeException | LinkageError problem) {
            disableDistantClouds(problem);
        }
    }

    private void disableDistantClouds(Throwable problem) {
        distantCloudFarPlane = null;
        org.apache.logging.log4j.LogManager.getLogger("FMUR").warn("[Camera] Scope DH clouds unavailable until reload", problem);
    }

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
        render(view, sky, false);
    }

    void renderClouds(Minecraft mc, CameraView view) {
        if (cloudsFailed || !mc.gameSettings.shouldRenderClouds()
                || ScopeRenderCompatibility.isShaderPackInUse()) return;
        try {
            renderClouds(view, () -> mc.renderGlobal.renderClouds(view.partialTicks));
        } catch (RuntimeException | LinkageError problem) {
            cloudsFailed = true;
            org.apache.logging.log4j.LogManager.getLogger("FMUR").warn("[Camera] Scope clouds unavailable until reload", problem);
        }
    }

    void renderClouds(CameraView view, Runnable clouds) {
        render(view, clouds, true);
    }

    private void render(CameraView view, Runnable drawGeometry, boolean clouds) {
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
            if (!clouds) {
                // The sky sits at infinity. Clouds use the terrain projection and depth.
                float near = .05F, far = 16384;
                projection.put(10, -(far + near) / (far - near)); projection.put(14, -2 * far * near / (far - near));
                projection.put(11, -1); projection.put(15, 0);
                rotation.put(12, 0); rotation.put(13, 0); rotation.put(14, 0);
            }
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadMatrix(projection);
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadMatrix(rotation);
            GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_SCISSOR_TEST); GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(clouds);
            if (clouds) {
                GL11.glDepthRange(0, 1);
                GL11.glEnable(GL11.GL_DEPTH_TEST);
                GL11.glDepthFunc(GL11.GL_LEQUAL);
                GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glColor4f(1, 1, 1, 1);
            } else GL11.glDepthRange(1, 1);
            drawGeometry.run();
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
