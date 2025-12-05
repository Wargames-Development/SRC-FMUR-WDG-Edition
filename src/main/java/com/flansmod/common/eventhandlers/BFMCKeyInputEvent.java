package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.eventhandler.Event;

public class BFMCKeyInputEvent extends Event {
    private final EnumBFMCKeyType keyType;
    private final String playerName;

    public BFMCKeyInputEvent(EnumBFMCKeyType keyType, String playerName) {
        this.keyType = keyType;
        this.playerName = playerName;
    }

    public EnumBFMCKeyType getKeyType() {
        return keyType;
    }

    public String getPlayerName() {
        return playerName;
    }
}
