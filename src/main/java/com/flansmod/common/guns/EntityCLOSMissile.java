package com.flansmod.common.guns;

import com.flansmod.common.guns.type.BulletType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityCLOSMissile extends EntityBullet {
    public EntityCLOSMissile(World world) {
        super(world);
    }

    public EntityCLOSMissile(World world, EntityLivingBase shooter, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom, float pitchSpread, float yawSpread) {
        super(world, shooter, gunDamage, type1, speed, shot, shotFrom, pitchSpread, yawSpread);
    }

    public EntityCLOSMissile(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, InfoType shotFrom) {
        super(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, shotFrom);
    }

    public EntityCLOSMissile(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float gunDamage, BulletType type1, float speed, InfoType shotFrom, float pitchSpread, float yawSpread) {
        super(world, origin, yaw, pitch, shooter, gunDamage, type1, speed, shotFrom, pitchSpread, yawSpread);
    }

    public EntityCLOSMissile(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom) {
        super(world, origin, direction, shooter, spread, gunDamage, type1, speed, shotFrom);
    }

    public EntityCLOSMissile(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLivingBase shooter, float gunDamage, BulletType type1, InfoType shotFrom) {
        super(world, origin, yaw, pitch, motX, motY, motZ, shooter, gunDamage, type1, shotFrom);
    }
}
