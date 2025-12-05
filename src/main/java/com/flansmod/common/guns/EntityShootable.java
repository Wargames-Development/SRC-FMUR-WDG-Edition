package com.flansmod.common.guns;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.guns.type.ShootableType;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public abstract class EntityShootable extends Entity {
    public EntityDriveable driveable;

    public boolean canCallArtillery = false;
    public boolean artilleryCalled = false;
    public int artilleryCalledNum = 0;
    public int bounceNum;

    public EntityShootable(World w) {
		super(w);
	}

	public abstract ShootableType getType();

}
