package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.eventhandler.Event;

public class HealSupplyEvent extends Event {
    private final String supplierName;
    private final String suppliedName;
    private final float healAmount;

    public HealSupplyEvent(String supplierName, String suppliedName, float healAmount) {
        this.supplierName = supplierName;
        this.suppliedName = suppliedName;
        this.healAmount = healAmount;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSuppliedName() {
        return suppliedName;
    }

    public float getHealAmount() {
        return healAmount;
    }
}
