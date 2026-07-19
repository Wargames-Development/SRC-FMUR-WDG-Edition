package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.eventhandler.Event;

import java.util.UUID;

public class PlayerReviveEvent extends Event {

    private final String reviverName;
    private final UUID reviverId;
    private final String revivedName;
    private final UUID revivedId;
    private final String weapon;
    private final double posX;
    private final double posY;
    private final double posZ;

    public PlayerReviveEvent(String reviverName, String revivedName, String weapon, double posX, double posY, double posZ) {
        this(reviverName, null, revivedName, null, weapon, posX, posY, posZ);
    }

    public PlayerReviveEvent(String reviverName, UUID reviverId, String revivedName, UUID revivedId, String weapon, double posX, double posY, double posZ) {
        this.reviverName = reviverName;
        this.reviverId = reviverId;
        this.revivedName = revivedName;
        this.revivedId = revivedId;
        this.weapon = weapon;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public String getReviverName() {
        return reviverName;
    }

    public UUID getReviverId() {
        return reviverId;
    }

    public String getRevivedName() {
        return revivedName;
    }

    public UUID getRevivedId() {
        return revivedId;
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
