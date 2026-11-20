package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.wdg.wgcore.client.territory.TerritoryBorderClientState;
import com.wdg.wgcore.client.territory.TerritoryBorderClientState.BorderColumn;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

/** Draws WGCore's synchronized borders using the PiP camera's matrices and depth. */
@SideOnly(Side.CLIENT)
final class WGCoreScopeCompat {
    private static boolean unavailable;

    private WGCoreScopeCompat() { }

    static void renderBorders(CameraView view) {
        if (unavailable || !Loader.isModLoaded("wgcore")) return;
        try {
            if (!TerritoryBorderClientState.hasColumns()) return;
            List<BorderColumn> columns = TerritoryBorderClientState.getColumnsSnapshot();
            if (!columns.isEmpty()) drawBorders(view, columns);
        } catch (LinkageError failure) {
            unavailable = true;
            FlansMod.logger.warn("WGCore territory borders are unavailable in PiP.", failure);
        }
    }

    private static void drawBorders(CameraView view, List<BorderColumn> columns) {
        int program = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(false);
            GL11.glColorMask(true, true, true, true);
            GL11.glEnable(GL11.GL_BLEND);
            GL14.glBlendEquation(GL14.GL_FUNC_ADD);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glLineWidth(2.0F);

            // WGCore's world-last renderer uses the player position. Use the captured
            // camera origin so the columns align with the PiP scene and its depth buffer.
            GL11.glBegin(GL11.GL_LINES);
            try {
                for (BorderColumn column : columns) {
                    if (column == null) continue;
                    double x = column.getX() - view.x;
                    double y = column.getY() - view.y;
                    double z = column.getZ() - view.z;
                    GL11.glColor4f(column.getRed(), column.getGreen(), column.getBlue(), 0.85F);
                    GL11.glVertex3d(x, y, z);
                    GL11.glVertex3d(x, y + column.getHeight(), z);
                }
            } finally {
                GL11.glEnd();
            }
        } finally {
            GL11.glPopAttrib();
            GL13.glActiveTexture(activeTexture);
            GL20.glUseProgram(program);
        }
    }
}
