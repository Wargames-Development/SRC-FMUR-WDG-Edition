package com.flansmod.common.guns.raytracing;

public class SoldierBulletHit extends BulletHit{
    public SoldierHitBox hitbox;
    public SoldierBulletHit(SoldierHitBox hitbox, float f) {
        super(f);
        this.hitbox = hitbox;
    }
}
