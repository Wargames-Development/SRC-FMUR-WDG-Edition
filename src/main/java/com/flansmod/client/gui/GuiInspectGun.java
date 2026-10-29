package com.flansmod.client.gui;

import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiInspectGun extends GuiScreen {
    private final ItemStack gunStack;
    private final GunType gunType;
    private float yaw;
    private float pitch = 160F;
    private float zoom = 1F;
    private int lastMouseX;
    private int lastMouseY;
    private boolean dragging;

    public GuiInspectGun(ItemStack stack) {
        gunStack = stack.copy();
        gunType = ((ItemGun) stack.getItem()).type;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        if (Mouse.isButtonDown(0)) {
            if (dragging) {
                yaw += (mouseX - lastMouseX) * 0.6F;
                pitch = Math.max(20F, Math.min(340F, pitch + (mouseY - lastMouseY) * 0.6F));
            }
            dragging = true;
        } else {
            dragging = false;
        }
        lastMouseX = mouseX;
        lastMouseY = mouseY;

        drawCenteredString(fontRendererObj, gunStack.getDisplayName(), width / 2, 16, 0xFFFFFF);
        drawCenteredString(fontRendererObj, "Drag to rotate  |  Scroll to zoom  |  Esc to close",
                width / 2, height - 18, 0xCCCCCC);

        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
        GunPreviewRenderer.render(gunStack, gunType, width / 2F, height / 2F,
                width * 0.65F, height * 0.55F, yaw, pitch, zoom);
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        int wheel = Mouse.getEventDWheel();
        if (wheel != 0) {
            zoom = Math.max(0.5F, Math.min(2.5F, zoom * (wheel > 0 ? 1.1F : 0.9F)));
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
