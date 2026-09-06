package com.flansmod.client.gui;

import com.flansmod.client.NightVisionGogglesBrightness;
import cpw.mods.fml.client.config.GuiSlider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

@SideOnly(Side.CLIENT)
public class GuiNightVisionSettings extends GuiScreen {
    private GuiSlider gammaSlider;

    @Override
    public void initGui() {
        buttonList.clear();
        gammaSlider = new GuiSlider(0, width / 2 - 100, height / 2 - 10,
                200, 20, "Night Vision Gamma: ", "", 1D, 16D,
                NightVisionGogglesBrightness.getGamma(), true, true);
        buttonList.add(gammaSlider);
        buttonList.add(new GuiButton(1, width / 2 - 100, height / 2 + 30, "Done"));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawCenteredString(fontRendererObj, "Night Vision Settings", width / 2,
                height / 2 - 50, 0xFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
        NightVisionGogglesBrightness.setGamma((float)gammaSlider.getValue());
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            mc.displayGuiScreen(null);
        }
    }

    @Override
    public void onGuiClosed() {
        NightVisionGogglesBrightness.setGamma((float)gammaSlider.getValue());
        NightVisionGogglesBrightness.saveGamma();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
