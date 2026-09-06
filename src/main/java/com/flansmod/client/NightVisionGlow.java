package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.glu.Project;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/** Bounded, frame-local glow sources supplied only by tracer and muzzle renderers. */
@SideOnly(Side.CLIENT)
public final class NightVisionGlow {
    private static final int MAX_SOURCES = 32;
    private static final FloatBuffer SOURCES = BufferUtils.createFloatBuffer(MAX_SOURCES * 4);
    private static final FloatBuffer MODEL = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer PROJECTION = BufferUtils.createFloatBuffer(16);
    private static final IntBuffer VIEWPORT = BufferUtils.createIntBuffer(16);
    private static final FloatBuffer PROJECTED = BufferUtils.createFloatBuffer(3);
    private static final FloatBuffer DEPTH = BufferUtils.createFloatBuffer(1);
    private static final FloatBuffer DEPTH_RANGE = BufferUtils.createFloatBuffer(16);
    private static int count;
    private static int depthChecks;
    private static boolean active;

    private NightVisionGlow() {
    }

    public static void beginFrame(Minecraft minecraft) {
        count = 0;
        depthChecks = 0;
        SOURCES.clear();
        active = NightVisionGogglesEffect.getIntensity(minecraft, 1F) > 0.999F;
    }

    /** Coordinates use the emitting renderer's current model-view matrix. */
    public static void add(double x, double y, double z, float radius) {
        if (!active || count >= MAX_SOURCES || depthChecks >= MAX_SOURCES * 2) {
            return;
        }
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MODEL);
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, PROJECTION);
        GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT);
        if (!Project.gluProject((float)x, (float)y, (float)z,
                MODEL, PROJECTION, VIEWPORT, PROJECTED)) {
            return;
        }
        float screenX = PROJECTED.get(0), screenY = PROJECTED.get(1);
        float depth = PROJECTED.get(2);
        if (depth < 0F || depth >= 1F || screenX < 0F || screenY < 0F
                || screenX >= Minecraft.getMinecraft().displayWidth
                || screenY >= Minecraft.getMinecraft().displayHeight) {
            return;
        }
        // Merge a layered muzzle burst before doing any GPU depth readback.
        for (int i = 0; i < count; i++) {
            float dx = screenX - SOURCES.get(i * 4);
            float dy = screenY - SOURCES.get(i * 4 + 1);
            if (dx * dx + dy * dy < 64F) {
                SOURCES.put(i * 4 + 2, Math.max(radius, SOURCES.get(i * 4 + 2)));
                return;
            }
        }
        // Test while this renderer's world/hand depth buffer is still present.
        // Reading it later at HUD time would lose world occlusion when the hand clears depth.
        GL11.glGetFloat(GL11.GL_DEPTH_RANGE, DEPTH_RANGE);
        depth = DEPTH_RANGE.get(0) + depth * (DEPTH_RANGE.get(1) - DEPTH_RANGE.get(0));
        depthChecks++;
        GL11.glReadPixels((int)screenX, (int)screenY, 1, 1,
                GL11.GL_DEPTH_COMPONENT, GL11.GL_FLOAT, DEPTH);
        if (depth > DEPTH.get(0) + 0.000001F) {
            return;
        }
        SOURCES.put(screenX).put(screenY).put(radius).put(1F);
        count++;
    }

    public static void upload(int countUniform, int sourcesUniform) {
        GL20.glUniform1i(countUniform, count);
        if (count > 0) {
            SOURCES.limit(count * 4).position(0);
            GL20.glUniform4(sourcesUniform, SOURCES);
            SOURCES.limit(SOURCES.capacity()).position(count * 4);
        }
    }
}
