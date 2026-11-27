package com.flansmod.client.gui;

import com.flansmod.common.guns.type.GunType;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static com.flansmod.client.gui.GunPreviewStyle.MUTED;
import static com.flansmod.client.gui.GunPreviewStyle.SELECTED;
import static com.flansmod.client.gui.GunPreviewStyle.TEXT;

final class GunStatsRadar {
    private static final String[] LABELS = {"Damage", "Shot spread", "Fire rate", "Reload time", "Kick recovery", "Vertical recoil"};
    private static final String[] AXIS_LABELS = {"Damage", "Spread", "Fire rate", "Reload", "Recovery", "Recoil"};
    private static final int ROW_HEIGHT = 19;
    private static final float[] X = {0F, 0.866F, 0.866F, 0F, -0.866F, -0.866F};
    private static final float[] Y = {-1F, -0.5F, 0.5F, 1F, 0.5F, -0.5F};
    private static final int WORSE = 0xFFFF7376;
    private final float[] current = new float[6], stock = new float[6];
    private final float[] rating = new float[6];
    private ItemStack stockSource;
    private int valuesLeft, valuesTop, cellWidth;

    private void updateStockStats(GunType gun, ItemStack stack) {
        if (stockSource != null && stockSource.getItem() == stack.getItem()
                && ItemStack.areItemStackTagsEqual(stockSource, stack)) return;
        stockSource = stack.copy();
        // Keep the gun's other state, such as heat and its selected fire mode.
        ItemStack bare = stockSource.copy();
        bare.getTagCompound().removeTag("attachments");
        readStats(gun, bare, stock);
    }

    private static void readStats(GunType gun, ItemStack stack, float[] stats) {
        stats[0] = gun.getDamage(stack);
        stats[1] = gun.getSpread(stack, false, false);
        float delay = gun.getShootDelay(stack);
        stats[2] = delay > 0F ? 1200F / delay : 0F;
        stats[3] = gun.getReloadTime(stack) / 20F;
        stats[4] = 1F - gun.getRecoilControl(stack, false, false);
        stats[5] = gun.getRecoilDisplay(stack);
    }

    private static void rate(float[] stats, float[] ratings) {
        // Fixed half-scale benchmarks make the shape comparable across guns.
        ratings[0] = ratio(stats[0], 8F);
        ratings[1] = 1F - ratio(stats[1], 4F);
        ratings[2] = ratio(stats[2], 600F);
        ratings[3] = 1F - ratio(stats[3], 2.5F);
        ratings[4] = stats[4];
        ratings[5] = ratio(stats[5], 2F);
    }

    void draw(FontRenderer font, GunType gun, ItemStack stack, int left, int top, int right, int bottom, boolean stacked) {
        readStats(gun, stack, current);
        updateStockStats(gun, stack);
        rate(current, rating);
        int chartWidth = stacked ? right - left : Math.min(140, (right - left) * 2 / 5);
        valuesLeft = stacked ? left + 5 : left + chartWidth + 5;
        valuesTop = (stacked ? bottom - 62 : top) + 5;
        cellWidth = (right - valuesLeft - 5) / 2;
        for (int i = 0; i < LABELS.length; i++) {
            int x = valuesLeft + i % 2 * cellWidth, y = valuesTop + i / 2 * ROW_HEIGHT;
            int width = Math.max(0, cellWidth - 5);
            font.drawStringWithShadow(font.trimStringToWidth(LABELS[i], width), x, y, TEXT);
            font.drawStringWithShadow(font.trimStringToWidth(formatValue(i), width), x, y + 9, valueColor(i));
        }
        if (stacked) {
            String heading = "Stats";
            font.drawStringWithShadow(heading, left + (chartWidth - font.getStringWidth(heading)) / 2, top + 3, TEXT);
            drawChart(font, left, top + 14, chartWidth, valuesTop - top - 19);
        } else {
            drawChart(font, left, top, chartWidth, bottom - top);
        }
    }

    private void drawChart(FontRenderer font, int left, int top, int width, int height) {
        float scale = Math.min(1F, Math.max(0.75F, width / 140F));
        int sideLabelWidth = 0;
        for (int i = 0; i < AXIS_LABELS.length; i++) {
            if (X[i] != 0F) sideLabelWidth = Math.max(sideLabelWidth, font.getStringWidth(AXIS_LABELS[i]));
        }
        int horizontalRoom = width / 2 - (int)Math.ceil((sideLabelWidth + 4) * scale) - 2;
        int verticalRoom = height / 2 - (int)Math.ceil((font.FONT_HEIGHT + 3) * scale) - 3;
        int radius = Math.max(6, Math.min((int)(horizontalRoom / X[1]), verticalRoom));
        int cx = left + width / 2, cy = top + height / 2;
        drawShape(cx, cy, radius);

        GL11.glPushMatrix();
        try {
            GL11.glTranslatef(cx, cy, 0F);
            GL11.glScalef(scale, scale, 1F);
            for (int i = 0; i < AXIS_LABELS.length; i++) {
                int x = Math.round(radius * X[i] / scale);
                int y = Math.round(radius * Y[i] / scale);
                int labelWidth = font.getStringWidth(AXIS_LABELS[i]);
                if (X[i] == 0F) {
                    x -= labelWidth / 2;
                    y += Y[i] < 0F ? -font.FONT_HEIGHT - 3 : 3;
                } else {
                    x += X[i] < 0F ? -labelWidth - 4 : 4;
                    y -= font.FONT_HEIGHT / 2;
                }
                font.drawStringWithShadow(AXIS_LABELS[i], x, y, MUTED);
            }
        } finally {
            GL11.glPopMatrix();
        }
    }

    List<String> detailsAt(GunType gun, ItemStack stack, int x, int y) {
        int column = x - valuesLeft, row = y - valuesTop;
        if (column < 0 || column >= cellWidth * 2 || row < 0 || row >= ROW_HEIGHT * 3) return Collections.emptyList();
        switch ((row / ROW_HEIGHT) * 2 + column / cellWidth) {
            case 0: return Arrays.asList("Weapon damage before", "ammo and target modifiers.");
            case 1: return Arrays.asList("Shot scatter while standing.", "Lower means tighter grouping.");
            case 2: return Collections.singletonList("Rounds per minute.");
            case 3: return Collections.singletonList("Time for a standard reload.");
            case 4: return Arrays.asList("% of vertical recoil lost each tick.",
                    "Run " + percent(1F - gun.getRecoilControl(stack, true, false)),
                    "Stand " + percent(1F - gun.getRecoilControl(stack, false, false)),
                    "Sneak " + percent(1F - gun.getRecoilControl(stack, false, true)));
            default: return Arrays.asList("Upward kick added per shot.", "Higher means more kick.");
        }
    }

    private void drawShape(int cx, int cy, int radius) {
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT | GL11.GL_COLOR_BUFFER_BIT);
        try {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glColor3f(0.33F, 0.37F, 0.34F);
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

    private String formatValue(int axis) {
        float value = current[axis];
        switch (axis) {
            case 2: return Math.round(value) + " RPM";
            case 3: return decimal(value) + " s";
            case 4: return percent(value);
            default: return decimal(value);
        }
    }

    private int valueColor(int axis) {
        float value = current[axis], base = stock[axis];
        int scale = axis == 2 ? 1 : 100;
        if (!Float.isFinite(value) || !Float.isFinite(base) || Math.round(value * scale) == Math.round(base * scale)) return MUTED;
        boolean lowerIsBetter = axis == 1 || axis == 3 || axis == 5;
        boolean improved = lowerIsBetter ? value < base : value > base;
        return improved ? SELECTED : WORSE;
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
