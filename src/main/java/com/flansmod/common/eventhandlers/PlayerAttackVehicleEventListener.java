package com.flansmod.common.eventhandlers;

import net.minecraftforge.common.MinecraftForge;

public class PlayerAttackVehicleEventListener {

    public PlayerAttackVehicleEventListener() {
        MinecraftForge.EVENT_BUS.register(this);
    }

}
