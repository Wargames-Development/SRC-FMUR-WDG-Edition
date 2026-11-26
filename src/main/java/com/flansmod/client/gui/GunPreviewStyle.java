package com.flansmod.client.gui;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

final class GunPreviewStyle {
    // Match the WGHangars control panel and its storage grid.
    static final int PANEL = 0xEE171B20;
    static final int BORDER = 0xFF59616A;
    static final int GRID = 0xFF0D1014;
    static final int CARD = 0xFF20262D;
    static final int SELECTED = 0xFF35E05D;
    static final int TEXT = 0xFFF1F4F7;
    static final int MUTED = 0xFFA9B1BA;

    private GunPreviewStyle() {}

    static void panel(int left, int top, int right, int bottom, int fill, int outline) {
        Gui.drawRect(left, top, right, bottom, fill);
        Gui.drawRect(left, top, right, top + 1, outline);
        Gui.drawRect(left, bottom - 1, right, bottom, outline);
        Gui.drawRect(left, top + 1, left + 1, bottom - 1, outline);
        Gui.drawRect(right - 1, top + 1, right, bottom - 1, outline);
    }

    static void title(FontRenderer font, String name, int x, int y, int width) {
        float scale = 1.3F;
        String title = font.trimStringToWidth(name, (int) (width / scale));
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, 0);
        GL11.glScalef(scale, scale, 1);
        font.drawStringWithShadow(title, -font.getStringWidth(title) / 2, 0, TEXT);
        GL11.glPopMatrix();
    }
}
