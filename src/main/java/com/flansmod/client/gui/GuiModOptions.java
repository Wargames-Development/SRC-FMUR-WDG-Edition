package com.flansmod.client.gui;

import com.flansmod.client.AimType;
import com.flansmod.client.FlanMouseButton;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.client.config.GuiSlider;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraftforge.common.config.Configuration;

import java.util.ArrayList;
import java.util.List;

public class GuiModOptions extends GuiScreen implements GuiSlider.ISlider {

    private static final int DONE_BUTTON_ID = 200;
    private static final int SCOPE_SENSITIVITY_ID = 18;
    private static final int ROW_HEIGHT = 26;

    private OptionsList optionsList;

    @SuppressWarnings("unchecked")
    @Override
    public void initGui() {
        buttonList.clear();
        optionsList = new OptionsList();
        updateButtonLabels();

        int doneWidth = Math.min(200, width - 20);
        buttonList.add(new GuiButton(DONE_BUTTON_ID, (width - doneWidth) / 2,
                height - 26, doneWidth, 20, "Done"));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawWorldBackground(0);
        optionsList.drawScreen(mouseX, mouseY, partialTicks);
        drawCenteredString(fontRendererObj, "FMUR Mod Settings", width / 2, 10, 0xFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {
        if (!optionsList.func_148179_a(mouseX, mouseY, mouseButton)) {
            super.mouseClicked(mouseX, mouseY, mouseButton);
        }
    }

    @Override
    protected void mouseMovedOrUp(int mouseX, int mouseY, int mouseButton) {
        optionsList.func_148181_b(mouseX, mouseY, mouseButton);
        super.mouseMovedOrUp(mouseX, mouseY, mouseButton);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == DONE_BUTTON_ID) {
            mc.displayGuiScreen(null);
        }
    }

    private void handleOptionButton(GuiButton button) {
        switch (button.id) {
            case 0:
                FlansModClient.setAimType(FlansModClient.aimType == AimType.HOLD
                        ? AimType.TOGGLE : AimType.HOLD);
                break;
            case 1:
                FlansModClient.setFireButton(FlansModClient.fireButton == FlanMouseButton.LEFT
                        ? FlanMouseButton.RIGHT : FlanMouseButton.LEFT);
                break;
            case 2:
                FlansModClient.setAimButton(FlansModClient.aimButton == FlanMouseButton.LEFT
                        ? FlanMouseButton.RIGHT : FlanMouseButton.LEFT);
                break;
            case 3:
                FlansModClient.setCombineAmmoOnReload(!FlansModClient.combineAmmoOnReload);
                break;
            case 4:
                FlansModClient.setAmmoToUpperInventoryOnReload(!FlansModClient.ammoToUpperInventoryOnReload);
                break;
            case 5:
                TickHandlerClient.enableDefaultCrossHair = !TickHandlerClient.enableDefaultCrossHair;
                break;
            case 6:
                TickHandlerClient.enableSprintCrossHair = !TickHandlerClient.enableSprintCrossHair;
                break;
            case 11:
                TickHandlerClient.blackFlash = !TickHandlerClient.blackFlash;
                break;
            case 12:
                FlansModClient.enableMCHEntityCamera = !FlansModClient.enableMCHEntityCamera;
                break;
            case 17:
                TickHandlerClient.showKillMessages = !TickHandlerClient.showKillMessages;
                break;
            default:
                return;
        }

        updateButtonLabels();
    }

    @Override
    public void onChangeSliderValue(GuiSlider slider) {
        switch (slider.id) {
            case 7:
                TickHandlerClient.crosshairR = (float) (slider.getValue() / 255F);
                break;
            case 8:
                TickHandlerClient.crosshairG = (float) (slider.getValue() / 255F);
                break;
            case 9:
                TickHandlerClient.crosshairB = (float) (slider.getValue() / 255F);
                break;
            case 10:
                TickHandlerClient.crosshairA = (float) (slider.getValue() / 100F);
                break;
            case 13:
                TickHandlerClient.dotR = (float) (slider.getValue() / 255F);
                break;
            case 14:
                TickHandlerClient.dotG = (float) (slider.getValue() / 255F);
                break;
            case 15:
                TickHandlerClient.dotB = (float) (slider.getValue() / 255F);
                break;
            case 16:
                TickHandlerClient.dotA = (float) (slider.getValue() / 100F);
                break;
            case SCOPE_SENSITIVITY_ID:
                FlansMod.scopeSensitivityMultiplier = slider.getValueInt() / 100F;
                break;
            default:
                break;
        }
    }

    private void updateButtonLabels() {
        for (OptionEntry entry : optionsList.entries) {
            switch (entry.button.id) {
                case 0:
                    entry.button.displayString = "Aim Mode: " + FlansModClient.aimType.getName();
                    break;
                case 1:
                    entry.button.displayString = "Fire: " + FlansModClient.fireButton.getName();
                    break;
                case 2:
                    entry.button.displayString = "Aim: " + FlansModClient.aimButton.getName();
                    break;
                case 3:
                    entry.button.displayString = "Auto-Merge Magazines: " + onOff(FlansModClient.combineAmmoOnReload);
                    break;
                case 4:
                    entry.button.displayString = "Place Reloaded Ammo on Top: " + onOff(FlansModClient.ammoToUpperInventoryOnReload);
                    break;
                case 5:
                    entry.button.displayString = "Enable Hipfire Crosshair: " + onOff(TickHandlerClient.enableDefaultCrossHair);
                    break;
                case 6:
                    entry.button.displayString = "Enable Sprint Crosshair: " + onOff(TickHandlerClient.enableSprintCrossHair);
                    break;
                case 11:
                    entry.button.displayString = "Flashbang Color: " + (TickHandlerClient.blackFlash ? "Black" : "White");
                    break;
                case 12:
                    entry.button.displayString = "New Vehicle Third-Person Camera: " + onOff(FlansModClient.enableMCHEntityCamera);
                    break;
                case 17:
                    entry.button.displayString = "Kill Messages: " + (TickHandlerClient.showKillMessages ? "Show" : "Hide");
                    break;
                default:
                    break;
            }
        }
    }

    private static String onOff(boolean value) {
        return value ? "ON" : "OFF";
    }

    @Override
    public void onGuiClosed() {
        FlansMod.configFile.get(Configuration.CATEGORY_GENERAL,
                "Scope Sensitivity Multiplier", 1.33D).set(FlansMod.scopeSensitivityMultiplier);
        FlansMod.configFile.save();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    private class OptionsList extends GuiListExtended {
        private final List<OptionEntry> entries = new ArrayList<>();
        private final int buttonWidth;

        private OptionsList() {
            super(GuiModOptions.this.mc, GuiModOptions.this.width, GuiModOptions.this.height,
                    26, GuiModOptions.this.height - 32, ROW_HEIGHT);
            setShowSelectionBox(false);
            buttonWidth = Math.min(300, Math.max(1, GuiModOptions.this.width - 36));

            addButton(new GuiButton(0, 0, 0, buttonWidth, 20, ""));
            addButton(new GuiButton(1, 0, 0, buttonWidth, 20, ""));
            addButton(new GuiButton(2, 0, 0, buttonWidth, 20, ""));
            addSlider(SCOPE_SENSITIVITY_ID, "Scope Sensitivity: ", 10, 400,
                    FlansMod.scopeSensitivityMultiplier * 100, false, "%");
            addButton(new GuiButton(3, 0, 0, buttonWidth, 20, ""));
            addButton(new GuiButton(4, 0, 0, buttonWidth, 20, ""));
            addButton(new GuiButton(5, 0, 0, buttonWidth, 20, ""));
            addButton(new GuiButton(6, 0, 0, buttonWidth, 20, ""));
            addSlider(7, "Crosshair Red: ", 0, 255, TickHandlerClient.crosshairR * 255, false, "");
            addSlider(8, "Crosshair Green: ", 0, 255, TickHandlerClient.crosshairG * 255, false, "");
            addSlider(9, "Crosshair Blue: ", 0, 255, TickHandlerClient.crosshairB * 255, false, "");
            addSlider(10, "Crosshair Opacity: ", 0, 100, TickHandlerClient.crosshairA * 100, false, "%");
            addButton(new GuiButton(11, 0, 0, buttonWidth, 20, ""));
            addButton(new GuiButton(12, 0, 0, buttonWidth, 20, ""));
            addSlider(13, "Sight Reticle Red: ", 0, 255, TickHandlerClient.dotR * 255, false, "");
            addSlider(14, "Sight Reticle Green: ", 0, 255, TickHandlerClient.dotG * 255, false, "");
            addSlider(15, "Sight Reticle Blue: ", 0, 255, TickHandlerClient.dotB * 255, false, "");
            addSlider(16, "Sight Reticle Opacity: ", 0, 100, TickHandlerClient.dotA * 100, false, "%");
            addButton(new GuiButton(17, 0, 0, buttonWidth, 20, ""));
        }

        private void addButton(GuiButton button) {
            entries.add(new OptionEntry(button));
        }

        private void addSlider(int id, String prefix, double min, double max,
                               double value, boolean decimal, String suffix) {
            addButton(new GuiSlider(id, 0, 0, buttonWidth, 20, prefix, suffix,
                    min, max, value, decimal, true, GuiModOptions.this));
        }

        @Override
        public GuiListExtended.IGuiListEntry getListEntry(int index) {
            return entries.get(index);
        }

        @Override
        protected int getSize() {
            return entries.size();
        }

        @Override
        public int getListWidth() {
            return buttonWidth + 12;
        }

        @Override
        protected int getScrollBarX() {
            return Math.min(width - 8, width / 2 + getListWidth() / 2 + 2);
        }
    }

    private class OptionEntry implements GuiListExtended.IGuiListEntry {
        private final GuiButton button;

        private OptionEntry(GuiButton button) {
            this.button = button;
        }

        @Override
        public void drawEntry(int slotIndex, int x, int y, int listWidth, int slotHeight,
                              Tessellator tessellator, int mouseX, int mouseY, boolean selected) {
            button.xPosition = (width - button.width) / 2;
            button.yPosition = y;
            button.visible = y >= optionsList.top && y + button.height <= optionsList.bottom;
            button.drawButton(mc, mouseX, mouseY);
        }

        @Override
        public boolean mousePressed(int slotIndex, int mouseX, int mouseY, int mouseButton,
                                    int relativeX, int relativeY) {
            if (mouseButton == 0 && button.mousePressed(mc, mouseX, mouseY)) {
                button.func_146113_a(mc.getSoundHandler());
                handleOptionButton(button);
                return true;
            }
            return false;
        }

        @Override
        public void mouseReleased(int slotIndex, int mouseX, int mouseY, int mouseButton,
                                  int relativeX, int relativeY) {
            button.mouseReleased(mouseX, mouseY);
        }
    }
}
