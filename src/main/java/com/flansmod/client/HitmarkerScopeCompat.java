package com.flansmod.client;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

/** Optional replay for HitmarkerPlus versions that draw before the late PiP lens. */
@SideOnly(Side.CLIENT)
final class HitmarkerScopeCompat {
    private static boolean checked;
    private static Object overlay;
    private static Method renderOverlay;
    private static Field lastTrigger;
    private static long duration;
    private static int markerRadius;

    private HitmarkerScopeCompat() { }

    private static boolean isAvailable() {
        if (!checked) {
            checked = true;
            if (!Loader.isModLoaded("hitmarkerplus")) return false;
            try {
                Class<?> type = Class.forName("com.hitmarkerplus.client.HitmarkerOverlay",
                        false, HitmarkerScopeCompat.class.getClassLoader());
                try {
                    // Newer releases already draw once after FMUR at LOWEST priority.
                    type.getMethod("onRenderTick", TickEvent.RenderTickEvent.class);
                    return false;
                } catch (NoSuchMethodException legacyOverlay) { }
                lastTrigger = field(type, "lastTriggerMs");
                duration = field(type, "DURATION_MS").getLong(null);
                int size = Math.max(field(type, "DRAW_SIZE_RAW").getInt(null),
                        field(type, "HEADSHOT_DRAW_SIZE_RAW").getInt(null));
                // Match the renderer's size clamp, including its fallback X accents.
                markerRadius = Math.max(4, Math.min(128, size)) / 2 + 4;
                overlay = type.getConstructor().newInstance();
                renderOverlay = type.getMethod("onRenderOverlay", RenderGameOverlayEvent.Post.class);
            } catch (ReflectiveOperationException | RuntimeException | LinkageError failure) {
                disable(failure);
            }
        }
        return renderOverlay != null;
    }

    private static Field field(Class<?> type, String name) throws ReflectiveOperationException {
        Field field = type.getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }

    /** Called with the final framebuffer and GUI projection still bound by the lens pass. */
    static void renderAfterLens(Minecraft minecraft) {
        if (minecraft == null || minecraft.thePlayer == null || minecraft.theWorld == null
                || minecraft.currentScreen != null || minecraft.gameSettings.hideGUI
                || !isAvailable()) return;
        try {
            long elapsed = System.currentTimeMillis() - lastTrigger.getLong(null);
            if (elapsed < 0L || elapsed > duration) return;

            ScaledResolution scaled = new ScaledResolution(minecraft,
                    minecraft.displayWidth, minecraft.displayHeight);
            int scale = scaled.getScaleFactor();
            int x = (scaled.getScaledWidth() / 2 - markerRadius) * scale;
            int y = minecraft.displayHeight
                    - (scaled.getScaledHeight() / 2 + markerRadius) * scale;
            int diameter = markerRadius * 2 * scale;
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            try {
                GL20.glUseProgram(0);
                for (int unit = 1; unit <= 3; unit++) {
                    GL13.glActiveTexture(GL13.GL_TEXTURE0 + unit);
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                }
                GL13.glActiveTexture(GL13.GL_TEXTURE0);
                GL11.glEnable(GL11.GL_TEXTURE_2D);
                // Replay only the center glyph; the kill-distance HUD was not covered.
                GL11.glEnable(GL11.GL_SCISSOR_TEST);
                GL11.glScissor(x, y, diameter, diameter);
                RenderGameOverlayEvent parent = new RenderGameOverlayEvent(0F, scaled, 0, 0);
                renderOverlay.invoke(overlay, new RenderGameOverlayEvent.Post(parent,
                        RenderGameOverlayEvent.ElementType.ALL));
            } finally {
                GL11.glPopAttrib();
            }
        } catch (ReflectiveOperationException | RuntimeException | LinkageError failure) {
            disable(failure);
        }
    }

    private static void disable(Throwable failure) {
        renderOverlay = null;
        FlansMod.logger.warn("HitmarkerPlus scope compatibility unavailable; retaining normal HUD rendering.", failure);
    }
}
