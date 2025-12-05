package com.flansmod.common.mob.task;

import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.ai.AITask;
import com.flansmod.common.mob.ai.TaskState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WanderTask extends AITask {

    public WanderTask(EntitySoldier entity, String name, AITask parent) {
        super(entity, name, parent);
    }

    @Override
    public TaskState onUpdate() {
        if(entity.target == null && entity.ticksExisted % (40 + ThreadLocalRandom.current().nextInt(100)) == 0) {
            //检测实体周围30格内的玩家或AI士兵
            List entityList = entity.worldObj.getEntitiesWithinAABBExcludingEntity(entity, entity.boundingBox.expand(30D, 30D, 30D));
            if(!entityList.isEmpty()) {
                List entityList1 = new ArrayList<>();
                for (Object o1 : entityList) {
                    if (o1 instanceof EntitySoldier || o1 instanceof EntityPlayer && !((EntityPlayer) o1).isOnSameTeam(entity)) {
                        entityList1.add(o1);
                    }
                }
                if (!entityList1.isEmpty()) {
                    EntityLivingBase o = (EntityLivingBase) entityList1.get(ThreadLocalRandom.current().nextInt(entityList1.size()));
                    entity.moveHelper.setMoveTo(o.posX, o.posY, o.posZ , true);
                }
                else {
                    //随机移动到周围的方块
                    Random rand = ThreadLocalRandom.current();
                    entity.moveHelper.setMoveTo(entity.posX + (rand.nextDouble() - 0.5D) * 10D, entity.posY, entity.posZ + (rand.nextDouble() - 0.5D) * 10D, true);
                }
                return TaskState.SUCCESS;
            }
        }
        return TaskState.FAILURE;
    }
}
