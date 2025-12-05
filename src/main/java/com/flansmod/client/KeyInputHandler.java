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
    public static KeyBinding debugKey = new KeyBinding("Debug", Keyboard.KEY_F10, "FMUR 通用");
    public static KeyBinding reloadModelsKey = new KeyBinding("重载模型", Keyboard.KEY_F9, "FMUR 通用");
    public static KeyBinding optionsKey = new KeyBinding("模组设置", Keyboard.KEY_SEMICOLON, "FMUR 通用");
    public static KeyBinding modelDebugKey = new KeyBinding("启用模型调试模式", Keyboard.KEY_I, "FMUR 通用");
    //=============================================================================================================================================

    public static KeyBinding downKey = new KeyBinding("俯冲", Keyboard.KEY_LCONTROL, "FMUR 载具");
    //public static KeyBinding exitKey = new KeyBinding("Exit Key", Keyboard.KEY_LSHIFT, "FMUR");
    public static KeyBinding inventoryKey = new KeyBinding("打开载具面板", Keyboard.KEY_R, "FMUR 载具");
    public static KeyBinding bombKey = new KeyBinding("投弹", Keyboard.KEY_L, "FMUR 载具");
    public static KeyBinding gunKey = new KeyBinding("Gun Key", Keyboard.KEY_B, "FMUR 载具");
    public static KeyBinding controlSwitchKey = new KeyBinding("Control Switch key", Keyboard.KEY_O, "FMUR 载具");
    public static KeyBinding leftRollKey = new KeyBinding("向左翻滚", Keyboard.KEY_Z, "FMUR 载具");
    public static KeyBinding rightRollKey = new KeyBinding("向右翻滚", Keyboard.KEY_X, "FMUR 载具");
    public static KeyBinding gearKey = new KeyBinding("收放起落架", Keyboard.KEY_EQUALS, "FMUR 载具");
    public static KeyBinding doorKey = new KeyBinding("开关门", Keyboard.KEY_K, "FMUR 载具");
    public static KeyBinding modeKey = new KeyBinding("Mode Switch Key", Keyboard.KEY_J, "FMUR 载具");
    public static KeyBinding flareKey = new KeyBinding("发射热焰弹", Keyboard.KEY_V, "FMUR 载具");
    //=============================================================================================================================================
    public static KeyBinding reloadKey = new KeyBinding("换弹", Keyboard.KEY_R, "FMUR 枪械");
    public static KeyBinding selectPreferredAmmo = new KeyBinding("选择弹药装填优先级", Keyboard.KEY_P, "FMUR 枪械");
    public static KeyBinding gunModeKey = new KeyBinding("切换枪械射击模式", Keyboard.KEY_V, "FMUR 枪械");
    //public static KeyBinding stableSightKey = new KeyBinding("稳定瞄具", Keyboard.KEY_LSHIFT, "FMUR 枪械");
    public static KeyBinding secondaryKey = new KeyBinding("切换下挂武器", Keyboard.KEY_T, "FMUR 枪械");
    public static KeyBinding lightSwitchKey = new KeyBinding("开关手电/镭射", Keyboard.KEY_T, "FMUR 枪械");
    public static KeyBinding zoomSwitchKey = new KeyBinding("切换瞄具倍率", Keyboard.KEY_Z, "FMUR 枪械");
    public static KeyBinding coSightSwitchKey = new KeyBinding("切换组合镜", Keyboard.KEY_C, "FMUR 枪械");
    public static KeyBinding missileUpKey = new KeyBinding("导弹向上瞄准线指令", Keyboard.KEY_UP, "FMUR 枪械");
    public static KeyBinding missileDownKey = new KeyBinding("导弹向下瞄准线指令", Keyboard.KEY_DOWN, "FMUR 枪械");
    public static KeyBinding missileLeftKey = new KeyBinding("导弹向左瞄准线指令", Keyboard.KEY_LEFT, "FMUR 枪械");
    public static KeyBinding missileRightKey = new KeyBinding("导弹向右瞄准线指令", Keyboard.KEY_RIGHT, "FMUR 枪械");
    public static KeyBinding missileAccelerateKey = new KeyBinding("导弹加力瞄准线指令", Keyboard.KEY_RCONTROL, "FMUR 枪械");
    public static KeyBinding cameraFollowBullet = new KeyBinding("影像弹药跟踪视角[长按]", Keyboard.KEY_O, "FMUR 载具");
    //=============================================================================================================================================
    public static KeyBinding menuKey = new KeyBinding("BFMC主菜单", Keyboard.KEY_F12, "BFMC");
    public static KeyBinding f10Key = new KeyBinding("嘲讽(通用)", Keyboard.KEY_F10, "BFMC");
    public static KeyBinding tauntKey = new KeyBinding("嘲讽(阵营)", Keyboard.KEY_F11, "BFMC");

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
            mc.thePlayer.addChatComponentMessage(new ChatComponentText("模型调试模式已" + (FlansModClient.modelDebugMode ? "开启" : "关闭")));
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
