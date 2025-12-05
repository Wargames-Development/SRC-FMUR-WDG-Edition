package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.eventhandler.Event;

public class PlayerReviveEvent extends Event {

    private final String reviverName;
    private final String revivedName;
    private final String weapon;
    private final double posX;
    private final double posY;
    private final double posZ;

    public PlayerReviveEvent(String reviverName, String revivedName, String weapon, double posX, double posY, double posZ) {
        this.reviverName = reviverName;
        this.revivedName = revivedName;
        this.weapon = weapon;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public String getReviverName() {
        return reviverName;
    }

    public String getRevivedName() {
        return revivedName;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getPosZ() {
        return posZ;
    }

    public String getWeapon() {
        return weapon;
    }
}
