package com.flansmod.client.gui;

import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import static com.flansmod.client.gui.GunPreviewStyle.*;

@SideOnly(Side.CLIENT)
public class GuiInspectGun extends GuiScreen {
    private final ItemStack gunStack;
    private final GunType gunType;
    private final GunPreviewRenderer preview = new GunPreviewRenderer(180F);

    public GuiInspectGun(ItemStack stack) {
        gunStack = stack.copy();
        gunType = ((ItemGun) stack.getItem()).type;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        int inset = Math.max(8, width / 12);
        GL11.glPushAttrib(GL11.GL_SCISSOR_BIT | GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
        try {
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            drawDefaultBackground();
            panel(inset, 8, width - inset, height - 8, PANEL, BORDER);
            panel(inset + 5, 29, width - inset - 5, height - 27, GRID, BORDER);
            title(fontRendererObj, gunStack.getDisplayName(), width / 2, 14, width - 2 * inset - 12);
            drawCenteredString(fontRendererObj, "Drag to rotate  /  Scroll to zoom  /  Esc to close",
                    width / 2, height - 21, MUTED);

            int scale = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight).getScaleFactor();
            GL11.glScissor((inset + 6) * scale, mc.displayHeight - (height - 28) * scale,
                    (width - 2 * inset - 12) * scale, (height - 58) * scale);
            GL11.glEnable(GL11.GL_SCISSOR_TEST);
            preview.render(gunStack, gunType, width / 2F, (height + 2) / 2F, width - 2 * inset - 12, height - 58);
        } finally {
            GL11.glPopAttrib();
        }
    }

    @Override
    protected void mouseClicked(int x, int y, int button) {
        super.mouseClicked(x, y, button);
        if (button == 0) preview.beginDrag(x, y);
    }

    @Override
    protected void mouseClickMove(int x, int y, int button, long elapsed) {
        if (button == 0 && preview.isDragging()) preview.drag(x, y);
    }

    @Override
    protected void mouseMovedOrUp(int x, int y, int button) {
        super.mouseMovedOrUp(x, y, button);
        if (button == 0) preview.endDrag();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        int wheel = Mouse.getEventDWheel();
        if (wheel != 0) {
            preview.zoom(wheel);
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
