package com.flansmod.client.gui;

import com.flansmod.client.AimType;
import com.flansmod.client.FlanMouseButton;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.item.ItemGun;
import cpw.mods.fml.client.config.GuiSlider;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiModOptions extends GuiScreen {

    @Override
    public void initGui() {
        addButtons();
    }

    @Override
    public void drawScreen(int var1, int var2, float var3) {
        this.drawWorldBackground(0);

        FontRenderer fontRenderer = mc.fontRenderer;
        fontRenderer.drawStringWithShadow("FMUR Mod Settings", this.width / 2 - (fontRenderer.getStringWidth("FMUR Mod Settings") / 2), 10, 16777215);

        super.drawScreen(var1, var2, var3);
    }

    @SuppressWarnings("unchecked")
    private void addButtons() {
        int buttonWidth = 132;
        this.buttonList.add(new GuiButton(1, (this.width / 2) - (buttonWidth * 3 / 2), 60, buttonWidth, 20, "Fire: " + FlansModClient.fireButton.getName()));

        this.buttonList.add(new GuiButton(2, (this.width / 2) - (buttonWidth * 3 / 2), 90, buttonWidth, 20, "Aim: " + FlansModClient.aimButton.getName()));

        this.buttonList.add(new GuiButton(0, (this.width / 2) - (buttonWidth * 3 / 2), 30, buttonWidth, 20, "Aim Mode: " + FlansModClient.aimType.getName()));

        this.buttonList.add(new GuiButton(3, (this.width / 2) - (buttonWidth * 3 / 2), 120, buttonWidth, 20, "Auto-Merge Magazines: " + (FlansModClient.combineAmmoOnReload ? "ON" : "OFF")));
        this.buttonList.add(new GuiButton(4, (this.width / 2) - (buttonWidth * 3 / 2), 150, buttonWidth, 20, "Place Reloaded Ammo on Top: " + (FlansModClient.ammoToUpperInventoryOnReload ? "ON" : "OFF")));
        this.buttonList.add(new GuiButton(5, (this.width / 2) - (buttonWidth * 3 / 2), 180, buttonWidth, 20, "Enable Hipfire Crosshair: " + (TickHandlerClient.enableDefaultCrossHair ? "ON" : "OFF")));
        this.buttonList.add(new GuiButton(6, (this.width / 2) - (buttonWidth * 3 / 2), 210, buttonWidth, 20, "Enable Sprint Crosshair: " + (TickHandlerClient.enableSprintCrossHair ? "ON" : "OFF")));
        this.buttonList.add(new GuiSlider(7, (this.width / 2) - (buttonWidth * 3 / 2), 240, buttonWidth, 20, "Crosshair Red: ", "", 0, 255, TickHandlerClient.crosshairR * 255, false, true));
        this.buttonList.add(new GuiSlider(8, (this.width / 2) - (buttonWidth * 3 / 2), 270, buttonWidth, 20, "Crosshair Green: ", "", 0, 255, TickHandlerClient.crosshairG * 255, false, true));
        this.buttonList.add(new GuiSlider(9, (this.width / 2) - (buttonWidth * 3 / 2), 300, buttonWidth, 20, "Crosshair Blue: ", "", 0, 255, TickHandlerClient.crosshairB * 255, false, true));
        this.buttonList.add(new GuiSlider(10, (this.width / 2) - (buttonWidth * 3 / 2), 330, buttonWidth, 20, "Crosshair Opacity: ", "", 0, 100, TickHandlerClient.crosshairA * 100, false, true));
        this.buttonList.add(new GuiButton(11, (this.width / 2) - (buttonWidth * 3 / 2), 360, buttonWidth, 20, "Flashbang Color: " + (TickHandlerClient.blackFlash ? "Black" : "White")));
        this.buttonList.add(new GuiButton(12, (this.width / 2) - (buttonWidth * 3 / 2), 390, buttonWidth, 20, "New Vehicle Third-Person Camera: " + (FlansModClient.enableMCHEntityCamera ? "ON" : "OFF")));

        this.buttonList.add(new GuiSlider(13, (this.width / 2) + (buttonWidth / 2), 30, buttonWidth, 20, "Sight Reticle Red: ", "", 0, 255, TickHandlerClient.dotR * 255, false, true));
        this.buttonList.add(new GuiSlider(14, (this.width / 2) + (buttonWidth / 2), 60, buttonWidth, 20, "Sight Reticle Green: ", "", 0, 255, TickHandlerClient.dotG * 255, false, true));
        this.buttonList.add(new GuiSlider(15, (this.width / 2) + (buttonWidth / 2), 90, buttonWidth, 20, "Sight Reticle Blue: ", "", 0, 255, TickHandlerClient.dotB * 255, false, true));
        this.buttonList.add(new GuiSlider(16, (this.width / 2) + (buttonWidth / 2), 120, buttonWidth, 20, "Sight Reticle Opacity: ", "", 0, 100, TickHandlerClient.dotA * 100, false, true));
        this.buttonList.add(new GuiButton(17, (this.width / 2) + (buttonWidth / 2), 150, buttonWidth, 20, "Kill Messages: " + (TickHandlerClient.showKillMessages ? "Show" : "Hide")));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            if (FlansModClient.aimType == AimType.HOLD) {
                FlansModClient.setAimType(AimType.TOGGLE);
            } else {
                FlansModClient.setAimType(AimType.HOLD);
            }
            this.buttonList.clear();
            addButtons();
        }

        if (button.id == 1) {
            if (FlansModClient.fireButton == FlanMouseButton.LEFT) {
                FlansModClient.setFireButton(FlanMouseButton.RIGHT);
            } else {
                FlansModClient.setFireButton(FlanMouseButton.LEFT);
            }
            this.buttonList.clear();
            addButtons();
        }

        if (button.id == 2) {
            if (FlansModClient.aimButton == FlanMouseButton.LEFT) {
                FlansModClient.setAimButton(FlanMouseButton.RIGHT);
            } else {
                FlansModClient.setAimButton(FlanMouseButton.LEFT);
            }
            this.buttonList.clear();
            addButtons();
        }
        // TODO: BUG
        if (button.id == 3) {
            FlansModClient.setCombineAmmoOnReload(!FlansModClient.combineAmmoOnReload); // 现有数值取反
            this.buttonList.clear();
            addButtons();
        }
        if (button.id == 4) {
            FlansModClient.setAmmoToUpperInventoryOnReload(!FlansModClient.ammoToUpperInventoryOnReload);
            this.buttonList.clear();
            addButtons();
        }
        if (button.id == 5) {
            TickHandlerClient.enableDefaultCrossHair = !TickHandlerClient.enableDefaultCrossHair;
            this.buttonList.clear();
            addButtons();
        }
        if (button.id == 6) {
            TickHandlerClient.enableSprintCrossHair = !TickHandlerClient.enableSprintCrossHair;
            this.buttonList.clear();
            addButtons();
        }

        if (button.id == 7) {
            TickHandlerClient.crosshairR = (float) (((GuiSlider) button).getValue() / 255F);
        }
        if (button.id == 8) {
            TickHandlerClient.crosshairG = (float) (((GuiSlider) button).getValue() / 255F);
        }
        if (button.id == 9) {
            TickHandlerClient.crosshairB = (float) (((GuiSlider) button).getValue() / 255F);
        }
        if(button.id == 10) {
            TickHandlerClient.crosshairA = (float) (((GuiSlider) button).getValue() / 100F);
        }

        if (button.id == 11) {
            TickHandlerClient.blackFlash = !TickHandlerClient.blackFlash;
            this.buttonList.clear();
            addButtons();
        }

        if (button.id == 12) {
            FlansModClient.enableMCHEntityCamera = !FlansModClient.enableMCHEntityCamera;
            this.buttonList.clear();
            addButtons();
        }

        if (button.id == 13) {
            TickHandlerClient.dotR = (float) (((GuiSlider) button).getValue() / 255F);
        }
        if (button.id == 14) {
            TickHandlerClient.dotG = (float) (((GuiSlider) button).getValue() / 255F);
        }
        if (button.id == 15) {
            TickHandlerClient.dotB = (float) (((GuiSlider) button).getValue() / 255F);
        }
        if(button.id == 16) {
            TickHandlerClient.dotA = (float) (((GuiSlider) button).getValue() / 100F);
        }

        if (button.id == 17) {
            TickHandlerClient.showKillMessages = !TickHandlerClient.showKillMessages;
            this.buttonList.clear();
            addButtons();
        }

    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}