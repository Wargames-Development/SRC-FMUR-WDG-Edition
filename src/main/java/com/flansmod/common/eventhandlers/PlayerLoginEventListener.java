package com.flansmod.common.eventhandlers;


import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketModConfig;
import com.flansmod.common.network.PacketRequestScreenshot;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;


public class PlayerLoginEventListener {

	public PlayerLoginEventListener() {
		FMLCommonHandler.instance().bus().register(this);
	}

	@EventHandler
	@SubscribeEvent
	public void OnPlayerLogin(PlayerLoggedInEvent event) {
        event.player.addChatComponentMessage(new ChatComponentText("§6§lFlan's Mod Ultimate Reforged§r，开源地址 §ehttps://gitee.com/TV90/FMUR§r，制作者§aTV90§r，§bMareep§r，加§cQ3449023732§r了解更多。本mod§4禁止战圈大佐使用§r。"));
		if(!FlansMod.enableScreenShot) {
			return;
		}
		FlansMod.packetHandler.sendTo(new PacketModConfig(), (EntityPlayerMP) event.player);
		//	new BanSomeKey();

		new Thread(() -> {
			try {
				Thread.sleep(30000); // 延迟30 秒
				FlansMod.packetHandler.sendTo(new PacketRequestScreenshot(), (EntityPlayerMP) event.player);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}).start();

	}
}
