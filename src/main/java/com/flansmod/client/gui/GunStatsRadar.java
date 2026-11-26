package com.flansmod.client.gui;

import com.flansmod.common.guns.type.GunType;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static com.flansmod.client.gui.GunPreviewStyle.MUTED;
import static com.flansmod.client.gui.GunPreviewStyle.TEXT;

final class GunStatsRadar {
    private static final String[] LABELS = {"Damage", "Accuracy", "Fire rate", "Reload", "Control", "Stability"};
    private static final float[] X = {0F, 0.866F, 0.866F, 0F, -0.866F, -0.866F};
    private static final float[] Y = {-1F, -0.5F, 0.5F, 1F, 0.5F, -0.5F};
    private final float[] rating = new float[6];
    private int controlX, controlY, controlWidth;

    void draw(FontRenderer font, GunType gun, ItemStack stack, int left, int top, int right, int bottom) {
        float damage = gun.getDamage(stack);
        float spread = gun.getSpread(stack, false, false);
        float delay = gun.getShootDelay(stack);
        float rpm = delay > 0F ? 1200F / delay : 0F;
        float reload = gun.getReloadTime(stack) / 20F;
        float control = 1F - gun.getRecoilControl(stack, false, false);
        float recoil = gun.getRecoilDisplay(stack);

        // Fixed half-scale benchmarks make the shape comparable across guns.
        rating[0] = ratio(damage, 8F);
        rating[1] = 1F - ratio(spread, 4F);
        rating[2] = ratio(rpm, 600F);
        rating[3] = 1F - ratio(reload, 2.5F);
        rating[4] = control;
        rating[5] = 1F - ratio(recoil, 2F);

        int cx = (left + right) / 2, cy = (top + bottom) / 2;
        int radius = Math.max(8, Math.min((bottom - top - 40) / 2, (right - left) / 4));
        drawShape(cx, cy, radius);

        label(font, 0, decimal(damage), cx, cy, radius);
        label(font, 1, decimal(spread) + " spread", cx, cy, radius);
        label(font, 2, Math.round(rpm) + " RPM", cx, cy, radius);
        label(font, 3, decimal(reload) + " s", cx, cy, radius);
        label(font, 4, percent(control), cx, cy, radius);
        label(font, 5, decimal(recoil) + " recoil", cx, cy, radius);
        controlX = cx + Math.round(X[4] * (radius + 10));
        controlY = cy + Math.round(Y[4] * radius) - 8;
        controlWidth = Math.max(font.getStringWidth(LABELS[4]), font.getStringWidth(percent(control)));
    }

    boolean hoversControl(int x, int y) {
        return x >= controlX - controlWidth && x <= controlX && y >= controlY && y < controlY + 18;
    }

    List<String> controlDetails(GunType gun, ItemStack stack) {
        return Arrays.asList("Run " + percent(1F - gun.getRecoilControl(stack, true, false)),
                "Stand " + percent(1F - gun.getRecoilControl(stack, false, false)),
                "Sneak " + percent(1F - gun.getRecoilControl(stack, false, true)));
    }

    private void drawShape(int cx, int cy, int radius) {
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT | GL11.GL_COLOR_BUFFER_BIT);
        try {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glColor3f(0.30F, 0.35F, 0.40F);
            for (int ring = 1; ring <= 4; ring++) {
                GL11.glBegin(GL11.GL_LINE_LOOP);
                for (int i = 0; i < X.length; i++) vertex(cx, cy, radius * ring / 4F, i);
                GL11.glEnd();
            }
            GL11.glBegin(GL11.GL_LINES);
            for (int i = 0; i < X.length; i++) {
                GL11.glVertex2i(cx, cy);
                vertex(cx, cy, radius, i);
            }
            GL11.glEnd();

            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(0.21F, 0.88F, 0.36F, 0.26F);
            GL11.glBegin(GL11.GL_TRIANGLE_FAN);
            GL11.glVertex2i(cx, cy);
            for (int i = 0; i <= X.length; i++) vertex(cx, cy, radius * rating[i % X.length], i % X.length);
            GL11.glEnd();
            GL11.glColor4f(0.21F, 0.88F, 0.36F, 1F);
            GL11.glBegin(GL11.GL_LINE_LOOP);
            for (int i = 0; i < X.length; i++) vertex(cx, cy, radius * rating[i], i);
            GL11.glEnd();
        } finally {
            GL11.glPopAttrib();
        }
    }

    private static void vertex(int cx, int cy, float radius, int axis) {
        GL11.glVertex2f(cx + radius * X[axis], cy + radius * Y[axis]);
    }

    private static void label(FontRenderer font, int axis, String value, int cx, int cy, int radius) {
        int x = cx + Math.round(X[axis] * (radius + 10));
        int y = cy + Math.round(Y[axis] * radius) + (axis == 0 ? -19 : axis == 3 ? 4 : -8);
        font.drawStringWithShadow(LABELS[axis], align(font, LABELS[axis], x, axis), y, TEXT);
        font.drawStringWithShadow(value, align(font, value, x, axis), y + 9, MUTED);
    }

    private static int align(FontRenderer font, String text, int x, int axis) {
        if (X[axis] > 0F) return x;
        return x - font.getStringWidth(text) / (X[axis] == 0F ? 2 : 1);
    }

    private static float ratio(float value, float benchmark) {
        if (Float.isNaN(value) || value <= 0F) return 0F;
        return 1F - benchmark / (value + benchmark);
    }

    private static String decimal(float value) {
        return String.format(Locale.ROOT, "%.2f", value);
    }

    private static String percent(float value) {
        return Math.round(value * 100F) + "%";
    }
}
