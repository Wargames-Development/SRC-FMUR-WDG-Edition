package com.flansmod.common.eventhandlers;

import com.flansmod.common.mob.EntitySoldier;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.util.DamageSource;

public class SoldierDeathEvent extends Event {

    private final Object soldier;

    private final DamageSource source;
    private final boolean isSuicide;
    private final boolean ignoreDeathCheck;

    public SoldierDeathEvent(EntitySoldier soldier, DamageSource source, boolean isSuicide, boolean ignoreDeathCheck) {
        this.soldier = soldier;
        this.source = source;
        this.isSuicide = isSuicide;
        this.ignoreDeathCheck = ignoreDeathCheck;
    }

    public Object getSoldier() {
        return soldier;
    }

    public DamageSource getSource() {
        return source;
    }

    public boolean isSuicide() {
        return isSuicide;
    }

    public boolean isIgnoreDeathCheck() {
        return ignoreDeathCheck;
    }
}
