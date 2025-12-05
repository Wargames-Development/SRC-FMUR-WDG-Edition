package com.flansmod.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import cpw.mods.fml.common.Mod;

public class HitboxHelperListener {

    @Mod.EventHandler
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (!HitboxHelper.SERVER_HITBOX_LATENCY_FIX) {
            return;
        }
        if (event.side.isServer() && event.phase == TickEvent.Phase.END) {
            HitboxHelper.onPlayerTick(event.player);
        }
    }

    @Mod.EventHandler
    @SubscribeEvent
    public void onPlayerLoggedOut(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
        //HitboxHelper.onPlayerLoggedOut(event.handler);
    }

}
