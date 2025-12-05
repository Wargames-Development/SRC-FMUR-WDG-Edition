package com.flansmod.common.guns.raytracing;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;

public class SoldierSnapshot {
    public EntitySoldier player;
    public Vector3f pos;
    public ArrayList<SoldierHitBox> hitboxes;
    public long time;

    public SoldierSnapshot(EntitySoldier p) {
        this.player = p;
        this.pos = new Vector3f(p.posX, p.posY, p.posZ);

        this.hitboxes = new ArrayList<>();
        RotatedAxes bodyAxes = new RotatedAxes(p.rotationYaw, 0.0F, 0.0F);
        RotatedAxes headAxes = new RotatedAxes(p.rotationYawHead - p.rotationYaw, 0.0F, -p.rotationPitch);
        this.hitboxes.add(new SoldierHitBox(this.player, bodyAxes, new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(-0.25F, 0.0F, -0.15F), new Vector3f(0.5F, 1.4F, 0.3F), EnumHitboxType.BODY));
        this.hitboxes.add(new SoldierHitBox(this.player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0F, 1.4F, 0.0F), new Vector3f(-0.25F, 0.0F, -0.25F), new Vector3f(0.5F, 0.5F, 0.5F), EnumHitboxType.HEAD));
        float yHead = (p.rotationYawHead - p.rotationYaw) / 57.295776F;
        float xHead = p.rotationPitch / 57.295776F;
        float zRight = 0.0F;
        float zLeft = 0.0F;
        float yRight = -0.1F + yHead - 1.5707964F;
        float yLeft = 0.1F + yHead + 0.4F - 1.5707964F;
        float xRight = -1.5707964F + xHead;
        float xLeft = -1.5707964F + xHead;
        zRight += MathHelper.cos((float)p.ticksExisted * 0.09F) * 0.05F + 0.05F;
        zLeft -= MathHelper.cos((float)p.ticksExisted * 0.09F) * 0.05F + 0.05F;
        xRight += MathHelper.sin((float)p.ticksExisted * 0.067F) * 0.05F;
        xLeft -= MathHelper.sin((float)p.ticksExisted * 0.067F) * 0.05F;
        RotatedAxes leftArmAxes = (new RotatedAxes()).rotateGlobalPitchInRads(xLeft).rotateGlobalYawInRads(3.1415927F + yLeft).rotateGlobalRollInRads(-zLeft);
        RotatedAxes rightArmAxes = (new RotatedAxes()).rotateGlobalPitchInRads(xRight).rotateGlobalYawInRads(3.1415927F + yRight).rotateGlobalRollInRads(-zRight);
        float originZRight = MathHelper.sin(-p.rotationYaw * 3.1415927F / 180.0F) * 5.0F / 16.0F;
        float originXRight = -MathHelper.cos(-p.rotationYaw * 3.1415927F / 180.0F) * 5.0F / 16.0F;
        float originZLeft = -MathHelper.sin(-p.rotationYaw * 3.1415927F / 180.0F) * 5.0F / 16.0F;
        float originXLeft = MathHelper.cos(-p.rotationYaw * 3.1415927F / 180.0F) * 5.0F / 16.0F;
        this.hitboxes.add(new SoldierHitBox(this.player, bodyAxes.findLocalAxesGlobally(leftArmAxes), new Vector3f(originXLeft, 1.3F, originZLeft), new Vector3f(-0.125F, -0.6F, -0.125F), new Vector3f(0.25F, 0.7F, 0.25F), EnumHitboxType.LEFTARM));
        this.hitboxes.add(new SoldierHitBox(this.player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3F, originZRight), new Vector3f(-0.125F, -0.6F, -0.125F), new Vector3f(0.25F, 0.7F, 0.25F), EnumHitboxType.RIGHTARM));
        ItemStack playerRightHandStack = this.player.getHeldItem();
        if (playerRightHandStack != null && playerRightHandStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun)playerRightHandStack.getItem()).type;
            if (gunType.shield) {
                this.hitboxes.add(new SoldierHitBox(this.player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3F, originZRight), new Vector3f(gunType.shieldOrigin.y, -1.05F + gunType.shieldOrigin.x, -0.0625F + gunType.shieldOrigin.z), new Vector3f(gunType.shieldDimensions.y, gunType.shieldDimensions.x, gunType.shieldDimensions.z), EnumHitboxType.RIGHTITEM));
            }
        }

    }

    public ArrayList<BulletHit> raytrace(Vector3f origin, Vector3f motion) {
        Vector3f localOrigin = Vector3f.sub(origin, this.pos, null);
        ArrayList<BulletHit> hits = new ArrayList();
        for (SoldierHitBox hitbox : this.hitboxes) {
            SoldierBulletHit hit = hitbox.raytrace(localOrigin, motion);
            if (hit != null && hit.intersectTime >= 0.0F && hit.intersectTime <= 1.0F) {
                hits.add(hit);
            }
        }
        return hits;
    }

}
