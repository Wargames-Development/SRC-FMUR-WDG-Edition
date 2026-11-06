package com.flansmod.client;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.lang.reflect.Method;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

/** Optional waypoint replay using the scope's world matrices and framebuffer. */
@SideOnly(Side.CLIENT)
final class WGMapScopeCompat {
    private static boolean checked;
    private static Method renderWaypoints;

    private WGMapScopeCompat() { }

    static void renderWaypoints(float partialTicks) {
        if (!checked) {
            checked = true;
            if (!Loader.isModLoaded("wgmap")) return;
            try {
                Class<?> hook = Class.forName("com.wdg.wgmap.waypoint.client.render.WaypointEntityOcclusion",
                        false, WGMapScopeCompat.class.getClassLoader());
                renderWaypoints = hook.getMethod("drawAfterRenderLast", float.class);
            } catch (ReflectiveOperationException | RuntimeException | LinkageError failure) {
                disable(failure);
            }
        }
        if (renderWaypoints == null) return;

        int program = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix();
        try {
            GL20.glUseProgram(0);
            // Waypoint HUD colors are unlit, including the color PiP feed.
            GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDepthMask(false);
            // The lightweight camera does not dispatch RenderWorldLast or WGMap's
            // late EntityRenderer hook. Reuse that draw entry exactly once here;
            // its controller retains ownership of visibility, labels and settings.
            renderWaypoints.invoke(null, partialTicks);
        } catch (ReflectiveOperationException | RuntimeException | LinkageError failure) {
            disable(failure);
        } finally {
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix();
            GL11.glMatrixMode(matrixMode);
            GL11.glPopAttrib();
            GL13.glActiveTexture(activeTexture);
            GL20.glUseProgram(program);
        }
    }

    private static void disable(Throwable failure) {
        renderWaypoints = null;
        FlansMod.logger.warn("WGMap scope waypoint rendering unavailable; retaining normal waypoint rendering.", failure);
    }
}
