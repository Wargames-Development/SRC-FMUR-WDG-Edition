package com.flansmod.client;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;

/** Optional MCHR HUD markers in FMUR's secondary camera and vision overlays. */
@SideOnly(Side.CLIENT)
final class MCHeliScopeMarkerCompat {
    private static boolean checked;
    private static boolean available;
    private static boolean warningLogged;
    private static Field positionsField;
    private static Field markedIdsField;
    private static Field tickHandlerField;
    private static Field markerGuiField;
    private static Field scaleFactorField;
    private static Method drawGui;
    private static Object primaryPositions;
    private static Object primaryMarkedIds;
    private static final ArrayList<Object> SCOPED_POSITIONS = new ArrayList<Object>();
    private static final HashSet<Integer> SCOPED_MARKED_IDS = new HashSet<Integer>();

    private MCHeliScopeMarkerCompat() {
    }

    private static boolean isAvailable() {
        if (checked) {
            return available;
        }
        checked = true;
        if (!Loader.isModLoaded("mcheli")) {
            return false;
        }
        try {
            ClassLoader loader = MCHeliScopeMarkerCompat.class.getClassLoader();
            Class<?> markers = Class.forName("mcheli.multiplay.MCH_GuiTargetMarker", false, loader);
            Class<?> tickHandler = Class.forName("mcheli.MCH_ClientCommonTickHandler", false, loader);
            Class<?> gui = Class.forName("mcheli.gui.MCH_Gui", false, loader);
            positionsField = markers.getDeclaredField("entityPos");
            markedIdsField = markers.getDeclaredField("markedEntityIds");
            if (!positionsField.getType().isAssignableFrom(ArrayList.class)
                    || !markedIdsField.getType().isAssignableFrom(HashSet.class)) {
                throw new ReflectiveOperationException("Unsupported MCHR marker collections");
            }
            positionsField.setAccessible(true);
            markedIdsField.setAccessible(true);
            tickHandlerField = tickHandler.getField("instance");
            markerGuiField = tickHandler.getField("gui_EMarker");
            scaleFactorField = gui.getField("scaleFactor");
            drawGui = markers.getMethod("drawGui", EntityPlayer.class, boolean.class);
            available = true;
        } catch (ReflectiveOperationException | LinkageError exception) {
            disable(exception);
        }
        return available;
    }

    static void beginScopedMarkers() {
        if (!isAvailable() || primaryPositions != null) {
            return;
        }
        try {
            // MCHR deduplicates by entity ID. A second camera needs its own
            // projections without discarding or appending to the primary HUD list.
            Object positions = positionsField.get(null);
            Object markedIds = markedIdsField.get(null);
            if (positions == null || markedIds == null) {
                return;
            }
            primaryPositions = positions;
            primaryMarkedIds = markedIds;
            SCOPED_POSITIONS.clear();
            SCOPED_MARKED_IDS.clear();
            positionsField.set(null, SCOPED_POSITIONS);
            markedIdsField.set(null, SCOPED_MARKED_IDS);
        } catch (ReflectiveOperationException | LinkageError exception) {
            endScopedMarkers();
            disable(exception);
        }
    }

    static void endScopedMarkers() {
        if (primaryPositions == null) {
            return;
        }
        try {
            positionsField.set(null, primaryPositions);
            markedIdsField.set(null, primaryMarkedIds);
        } catch (ReflectiveOperationException | LinkageError exception) {
            disable(exception);
        } finally {
            primaryPositions = null;
            primaryMarkedIds = null;
            SCOPED_POSITIONS.clear();
            SCOPED_MARKED_IDS.clear();
        }
    }

    static void renderMarkers(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.theWorld == null || !isAvailable()) {
            return;
        }
        if (minecraft.currentScreen != null && !(minecraft.currentScreen instanceof GuiChat)
                && !minecraft.currentScreen.getClass().getName().contains("GuiDriveableController")) {
            return;
        }
        Object markerGui;
        int previousScale;
        try {
            Object handler = tickHandlerField.get(null);
            markerGui = handler == null ? null : markerGuiField.get(handler);
            if (markerGui == null) {
                return;
            }
            previousScale = scaleFactorField.getInt(null);
        } catch (ReflectiveOperationException | LinkageError exception) {
            disable(exception);
            return;
        }

        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        boolean shadersSupported = GLContext.getCapabilities().OpenGL20;
        int previousProgram = shadersSupported ? GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM) : 0;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        try {
            ScaledResolution scaled = new ScaledResolution(minecraft,
                    minecraft.displayWidth, minecraft.displayHeight);
            scaleFactorField.setInt(null, scaled.getScaleFactor());
            minecraft.entityRenderer.setupOverlayRendering();
            if (shadersSupported) {
                GL20.glUseProgram(0);
            }
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glColorMask(true, true, true, true);
            // drawScreen suppresses the HUD during PiP. Draw only the existing
            // marker GUI, using the projections collected by that camera.
            drawGui.invoke(markerGui, minecraft.thePlayer, minecraft.gameSettings.thirdPersonView != 0);
        } catch (ReflectiveOperationException | LinkageError exception) {
            disable(exception);
        } finally {
            try {
                scaleFactorField.setInt(null, previousScale);
            } catch (ReflectiveOperationException | LinkageError exception) {
                disable(exception);
            }
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            if (shadersSupported) {
                GL20.glUseProgram(previousProgram);
            }
            GL11.glPopAttrib();
            GL13.glActiveTexture(previousActiveTexture);
            GL11.glMatrixMode(previousMatrixMode);
        }
    }

    private static void disable(Throwable exception) {
        available = false;
        if (!warningLogged) {
            warningLogged = true;
            FlansMod.logger.warn("MCHR scope marker compatibility unavailable; retaining normal marker rendering.", exception);
        }
    }
}
