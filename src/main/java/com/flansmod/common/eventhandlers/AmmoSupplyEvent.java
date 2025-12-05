package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.eventhandler.Event;

public class AmmoSupplyEvent extends Event {
    private final String supplierName;
    private final String suppliedName;
    private final int clips;

    public AmmoSupplyEvent(String supplierName, String suppliedName, int clips) {
        this.supplierName = supplierName;
        this.suppliedName = suppliedName;
        this.clips = clips;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSuppliedName() {
        return suppliedName;
    }

    public int getClips() {
        return clips;
    }
}
