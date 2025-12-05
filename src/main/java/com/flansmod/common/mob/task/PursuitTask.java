package com.flansmod.common.mob.task;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumWeaponState;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;

public class PursuitTask extends AITask {

    public boolean isPursuit = false;
    public int stopPursuitTime = 10;

    public PursuitTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {

        if(entity.target == null && entity.lastTarget != null && (entity.lastTarget instanceof EntitySoldier || entity.lastTarget instanceof EntityPlayer)){
            EntityLivingBase target = (EntityLivingBase) entity.lastTarget;
            if(FlansModRaytracer.hasBlock(
                            entity.worldObj,
                    Vec3.createVectorHelper(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ),
                    Vec3.createVectorHelper(target.posX, target.posY + target.getEyeHeight(), target.posZ))
            ){
                if(entity.ticksExisted % 80 == 0){
                    entity.moveHelper.setMoveTo(target.posX, target.posY, target.posZ, true);
                    if(FlansMod.DEBUG) FlansMod.log("PursuitTask: 更新追击目标");
                }
                isPursuit = true;
                if(FlansMod.DEBUG) FlansMod.log("PursuitTask: 开始追击");
            } else {
                if(FlansMod.DEBUG) FlansMod.log("PursuitTask: 发现敌军 距离停止追击" + stopPursuitTime);
                stopPursuitTime --;
                if(stopPursuitTime <= 0){
                    isPursuit = false;
                    entity.moveHelper.stopMoving();
                    stopPursuitTime = 20;
                    if(FlansMod.DEBUG) FlansMod.log("PursuitTask: 停止追击");
                }

            }

        }

        return TaskState.SUCCESS;
    }
}
