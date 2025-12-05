package com.flansmod.client;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiModOptions;
import com.flansmod.client.gui.GuiSelectAmmo;
import com.flansmod.common.FlansMod;
import com.flansmod.common.eventhandlers.EnumBFMCKeyType;
import com.flansmod.common.network.*;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;

@SideOnly(value = Side.CLIENT)
public class KeyInputHandler {
    static Minecraft mc;
    //public static KeyBinding accelerateKey = new KeyBinding("Accelerate Key", Keyboard.KEY_W, "FMUR");
    //public static KeyBinding decelerateKey = new KeyBinding("Decelerate Key", Keyboard.KEY_S, "FMUR");
    //public static KeyBinding leftKey = new KeyBinding("Left Key", Keyboard.KEY_A, "FMUR");
    //public static KeyBinding rightKey = new KeyBinding("Right Key", Keyboard.KEY_D, "FMUR");
    //public static KeyBinding upKey = new KeyBinding("Up Key", Keyboard.KEY_SPACE, "FMUR");
    //=============================================================================================================================================
    public static KeyBinding debugKey = new KeyBinding("Debug", Keyboard.KEY_F10, "FMUR General");
    public static KeyBinding reloadModelsKey = new KeyBinding("Reload Models", Keyboard.KEY_F9, "FMUR General");
    public static KeyBinding optionsKey = new KeyBinding("Mod Settings", Keyboard.KEY_SEMICOLON, "FMUR General");
    public static KeyBinding modelDebugKey = new KeyBinding("Toggle Model Debug Mode", Keyboard.KEY_I, "FMUR General");
    //=============================================================================================================================================

    public static KeyBinding downKey = new KeyBinding("Dive", Keyboard.KEY_LCONTROL, "FMUR Vehicle");
    //public static KeyBinding exitKey = new KeyBinding("Exit Vehicle", Keyboard.KEY_LSHIFT, "FMUR");
    public static KeyBinding inventoryKey = new KeyBinding("Open Vehicle Panel", Keyboard.KEY_R, "FMUR Vehicle");
    public static KeyBinding bombKey = new KeyBinding("Drop Bomb", Keyboard.KEY_L, "FMUR Vehicle");
    public static KeyBinding gunKey = new KeyBinding("Fire Gun", Keyboard.KEY_B, "FMUR Vehicle");
    public static KeyBinding controlSwitchKey = new KeyBinding("Control Switch", Keyboard.KEY_O, "FMUR Vehicle");
    public static KeyBinding leftRollKey = new KeyBinding("Roll Left", Keyboard.KEY_Z, "FMUR Vehicle");
    public static KeyBinding rightRollKey = new KeyBinding("Roll Right", Keyboard.KEY_X, "FMUR Vehicle");
    public static KeyBinding gearKey = new KeyBinding("Toggle Landing Gear", Keyboard.KEY_EQUALS, "FMUR Vehicle");
    public static KeyBinding doorKey = new KeyBinding("Toggle Doors", Keyboard.KEY_K, "FMUR Vehicle");
    public static KeyBinding modeKey = new KeyBinding("Switch Mode", Keyboard.KEY_J, "FMUR Vehicle");
    public static KeyBinding flareKey = new KeyBinding("Launch Flare", Keyboard.KEY_V, "FMUR Vehicle");
    //=============================================================================================================================================
    public static KeyBinding reloadKey = new KeyBinding("Reload", Keyboard.KEY_R, "FMUR Guns");
    public static KeyBinding selectPreferredAmmo = new KeyBinding("Select Ammo Load Priority", Keyboard.KEY_P, "FMUR Guns");
    public static KeyBinding gunModeKey = new KeyBinding("Toggle Fire Mode", Keyboard.KEY_V, "FMUR Guns");
    //public static KeyBinding stableSightKey = new KeyBinding("Stabilize Sight", Keyboard.KEY_LSHIFT, "FMUR 枪械");
    public static KeyBinding secondaryKey = new KeyBinding("Switch Underbarrel Weapon", Keyboard.KEY_T, "FMUR Guns");
    public static KeyBinding lightSwitchKey = new KeyBinding("Toggle Flashlight/Laser", Keyboard.KEY_T, "FMUR Guns");
    public static KeyBinding zoomSwitchKey = new KeyBinding("Switch Scope Magnification", Keyboard.KEY_Z, "FMUR Guns");
    public static KeyBinding coSightSwitchKey = new KeyBinding("Toggle Co-Sight", Keyboard.KEY_C, "FMUR Guns");
    public static KeyBinding missileUpKey = new KeyBinding("Missile Aim Up", Keyboard.KEY_UP, "FMUR Guns");
    public static KeyBinding missileDownKey = new KeyBinding("Missile Aim Down", Keyboard.KEY_DOWN, "FMUR Guns");
    public static KeyBinding missileLeftKey = new KeyBinding("Missile Aim Left", Keyboard.KEY_LEFT, "FMUR Guns");
    public static KeyBinding missileRightKey = new KeyBinding("Missile Aim Right", Keyboard.KEY_RIGHT, "FMUR Guns");
    public static KeyBinding missileAccelerateKey = new KeyBinding("Missile Acceleration", Keyboard.KEY_RCONTROL, "FMUR Guns");
    public static KeyBinding cameraFollowBullet = new KeyBinding("Camera-follow projectile view [Hold]", Keyboard.KEY_O, "FMUR Guns");
    //=============================================================================================================================================
    public static KeyBinding menuKey = new KeyBinding("BFMC Main Menu", Keyboard.KEY_F12, "BFMC");
    public static KeyBinding f10Key = new KeyBinding("Taunt (Global)", Keyboard.KEY_F10, "BFMC");
    public static KeyBinding tauntKey = new KeyBinding("Taunt (Faction)", Keyboard.KEY_F11, "BFMC");

    public KeyInputHandler() {
        mc = Minecraft.getMinecraft();
        ClientRegistry.registerKeyBinding(missileLeftKey);
        ClientRegistry.registerKeyBinding(missileRightKey);
        ClientRegistry.registerKeyBinding(missileUpKey);
        ClientRegistry.registerKeyBinding(missileDownKey);
        ClientRegistry.registerKeyBinding(missileAccelerateKey);
        //ClientRegistry.registerKeyBinding(decelerateKey);
        //ClientRegistry.registerKeyBinding(leftKey);
        //ClientRegistry.registerKeyBinding(rightKey);
        //ClientRegistry.registerKeyBinding(upKey);
        ClientRegistry.registerKeyBinding(downKey);
        ClientRegistry.registerKeyBinding(cameraFollowBullet);
        //ClientRegistry.registerKeyBinding(exitKey);
        ClientRegistry.registerKeyBinding(inventoryKey);
        ClientRegistry.registerKeyBinding(bombKey);
        ClientRegistry.registerKeyBinding(gunKey);
        ClientRegistry.registerKeyBinding(controlSwitchKey);
        ClientRegistry.registerKeyBinding(reloadKey);
        ClientRegistry.registerKeyBinding(selectPreferredAmmo);
        ClientRegistry.registerKeyBinding(gunModeKey);
//        ClientRegistry.registerKeyBinding(teamsMenuKey);
//        ClientRegistry.registerKeyBinding(teamsScoresKey);
//        ClientRegistry.registerKeyBinding(teamsSelectClassKey);
        ClientRegistry.registerKeyBinding(leftRollKey);
        ClientRegistry.registerKeyBinding(rightRollKey);
        ClientRegistry.registerKeyBinding(gearKey);
        ClientRegistry.registerKeyBinding(doorKey);
        ClientRegistry.registerKeyBinding(modeKey);
        ClientRegistry.registerKeyBinding(flareKey);
        //ClientRegistry.registerKeyBinding(trimKey);
        ClientRegistry.registerKeyBinding(debugKey);
        ClientRegistry.registerKeyBinding(reloadModelsKey);
        ClientRegistry.registerKeyBinding(optionsKey);
        //ClientRegistry.registerKeyBinding(zoomKey);
        ClientRegistry.registerKeyBinding(secondaryKey);
        ClientRegistry.registerKeyBinding(lightSwitchKey);
        ClientRegistry.registerKeyBinding(zoomSwitchKey);
        ClientRegistry.registerKeyBinding(coSightSwitchKey);
        ClientRegistry.registerKeyBinding(modelDebugKey);
        //ClientRegistry.registerKeyBinding(stableSightKey);
        ClientRegistry.registerKeyBinding(menuKey);
        ClientRegistry.registerKeyBinding(f10Key);
        ClientRegistry.registerKeyBinding(tauntKey);
    }

    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event) {
        if (FMLClientHandler.instance().isGUIOpen(GuiChat.class) || mc.currentScreen != null) {
            return;
        }

        EntityPlayer player = mc.thePlayer; // 玩家
        Entity ridingEntity = player.ridingEntity; // 玩家正在骑乘的载具

        if(missileAccelerateKey.isPressed()) {
            FlansMod.getPacketHandler().sendToServer(new PacketMissileMCLOSAccelerate());
        }

        if(menuKey.isPressed()){
            FlansMod.getPacketHandler().sendToServer(new PacketBFMCKeyInput(EnumBFMCKeyType.menu, player.getDisplayName()));
        }

        if(f10Key.isPressed()){
            FlansMod.getPacketHandler().sendToServer(new PacketBFMCKeyInput(EnumBFMCKeyType.f10, player.getDisplayName()));
        }

        if(tauntKey.isPressed()){
            FlansMod.getPacketHandler().sendToServer(new PacketBFMCKeyInput(EnumBFMCKeyType.taunt, player.getDisplayName()));
        }

        if (modelDebugKey.isPressed()){
            FlansModClient.modelDebugMode = !FlansModClient.modelDebugMode;
            mc.thePlayer.addChatComponentMessage(new ChatComponentText("Model debug mode has been " + (FlansModClient.modelDebugMode ? "enabled" : "disabled")));
        }

        if (mc.gameSettings.keyBindTogglePerspective.isPressed()) {
        }
        //Handle universal keys
//        if (teamsMenuKey.isPressed()) {
//            mc.displayGuiScreen(new GuiTeamSelect());
//            return;
//        }
//        if (teamsScoresKey.isPressed()) {
//            mc.displayGuiScreen(new GuiTeamScores());
//            return;
//        }
//        if (teamsSelectClassKey.isPressed()) {
//            FlansMod.getPacketHandler().sendToServer(new PacketGetPlayerClasses());
//            return;
//        }

        if (reloadKey.isPressed() && FlansModClient.shootTime(false) <= 0) {
            FlansMod.getPacketHandler().sendToServer(new PacketReload(false, FlansModClient.combineAmmoOnReload, FlansModClient.ammoToUpperInventoryOnReload));
            return;
        }
        if (selectPreferredAmmo.isPressed() && FlansModClient.shootTime(false) <= 0) {
            mc.displayGuiScreen(new GuiSelectAmmo());
            return;
        }
        if (gunModeKey.isPressed()) {
            FlansMod.getPacketHandler().sendToServer(new PacketGunMode(1));
        }
        /* 注册按键 切换 */

        if (lightSwitchKey.isPressed()) {
            FlansModClient.isFlashLight = !FlansModClient.isFlashLight;
        }
        if (zoomSwitchKey.isPressed()) {
            FlansMod.switchedFOV = !FlansMod.switchedFOV;
        }
        if (coSightSwitchKey.isPressed()) {
            FlansMod.coSight = !FlansMod.coSight;
        }
        if (secondaryKey.isPressed()) {
            FlansMod.getPacketHandler().sendToServer(new PacketGunMode(2));
        }
        if (debugKey.isPressed()) {
            if (FlansMod.DEBUG)
                FlansMod.DEBUG = false;
            else {
                FlansMod.packetHandler.sendToServer(new PacketRequestDebug());
            }
        }
        if (reloadModelsKey.isPressed()) {
            FlansModClient.reloadModels(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT));
        }

        if (optionsKey.isPressed()) {
            mc.displayGuiScreen(new GuiModOptions());
        }

        //Handle driving keys
        if (ridingEntity instanceof IControllable) {
            IControllable riding = (IControllable) ridingEntity;
            if (mc.gameSettings.keyBindForward.isPressed())//if(accelerateKey.isPressed())
                riding.pressKey(0, player);
            if (mc.gameSettings.keyBindBack.isPressed())//if(decelerateKey.isPressed())
                riding.pressKey(1, player);
            if (mc.gameSettings.keyBindLeft.isPressed())//if(leftKey.isPressed())
                riding.pressKey(2, player);
            if (mc.gameSettings.keyBindRight.isPressed())//if(rightKey.isPressed())
                riding.pressKey(3, player);
            if (mc.gameSettings.keyBindJump.isPressed())//if(upKey.isPressed())
                riding.pressKey(4, player);
            if (downKey.isPressed())
                riding.pressKey(5, player);
            if (mc.gameSettings.keyBindSneak.isPressed())//if(exitKey.isPressed())
                riding.pressKey(6, player);
            if (mc.gameSettings.keyBindInventory.isPressed() || inventoryKey.isPressed())
                riding.pressKey(7, player);
            if (bombKey.isPressed())
                riding.pressKey(8, player);
            if (gunKey.isPressed())
                riding.pressKey(9, player);
            if (controlSwitchKey.isPressed())
                riding.pressKey(10, player);
            if (leftRollKey.isPressed())
                riding.pressKey(11, player);
            if (rightRollKey.isPressed())
                riding.pressKey(12, player);
            if (gearKey.isPressed())
                riding.pressKey(13, player);
            if (doorKey.isPressed())
                riding.pressKey(14, player);
            if (modeKey.isPressed())
                riding.pressKey(15, player);
            //if(trimKey.isPressed())
            //	riding.pressKey(16, player);
            if (flareKey.isPressed())
                riding.pressKey(18, player);
            if (missileAccelerateKey.isPressed()) {
            }
			/*
			for(KeyBinding key : mc.gameSettings.keyBindings )
			{
				if(key.isPressed())
				{
					key.pressed = true;
					key.pressTime = 1;
				}
			}
			*/
        }
    }


}
