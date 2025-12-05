package com.flansmod.common.mob.helper;

import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.mob.EntitySoldier;
import com.flansmod.common.mob.EnumSoldierState;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EscapeHelper {

    public EntitySoldier entity;
    public double escapePosX;
    public double escapePosY;
    public double escapePosZ;
    public boolean isEscaping = false;
    public int depth = 1;
    public int yDepth = 1;

    /** 遍历最大深度 */
    public int maxDepth = 8;

    /** y轴遍历最大深度 */
    public int maxYDepth = 3;

    public Set<Vec3> escapePointsCache = new HashSet<>();

    public EscapeHelper(EntitySoldier entity) {
        this.entity = entity;
    }

    /**
     * 逃跑
     * @return 是否逃跑
     */
    public boolean onUpdateEscape() {

        if(entity.worldObj.isRemote) return false;

        Entity escapeTarget = entity.lastTarget == null ? entity.target : entity.lastTarget ;

        if (escapeTarget != null && !isEscaping) {


            //遍历缓存的逃跑点
            for(Vec3 v : escapePointsCache){
                boolean canMove = !FlansModRaytracer.hasBlock(entity.worldObj,
                        Vec3.createVectorHelper(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ),
                        Vec3.createVectorHelper(v.xCoord, v.yCoord + entity.getEyeHeight(), v.zCoord));
                boolean canHide = FlansModRaytracer.hasBlock(entity.worldObj,
                        Vec3.createVectorHelper(escapeTarget.posX, escapeTarget.posY + escapeTarget.getEyeHeight(), escapeTarget.posZ),
                        Vec3.createVectorHelper(v.xCoord, v.yCoord + escapeTarget.getEyeHeight(), v.zCoord));

                Block block = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord), (int) Math.floor(v.zCoord));
                Block block1 = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord - 1), (int) Math.floor(v.zCoord));
                Block block2 = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord + 1), (int) Math.floor(v.zCoord));
                Block block3 = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord + 2), (int) Math.floor(v.zCoord));

                boolean canStay = block.getMaterial() == Material.air && block1.getMaterial() != Material.air && block2.getMaterial() == Material.air && block3.getMaterial() == Material.air;
                if(canMove && canHide && canStay) {
                    escapePosX = v.xCoord;
                    escapePosY = v.yCoord;
                    escapePosZ = v.zCoord;
                    isEscaping = true;
                    //entity.moveHelper.setMoveTo(escapePosX, escapePosY, escapePosZ, true);
                    if (FlansMod.DEBUG){
                        entity.worldObj.spawnEntityInWorld(new EntityDebugDot(entity.worldObj, new Vector3f(v.xCoord, v.yCoord, v.zCoord), 1000, 1F, 0F, 0F));
                        FlansMod.log("(缓存)逃跑点：(" + escapePosX + "," + escapePosY + "," + escapePosZ + ") 缓存大小：" + escapePointsCache.size());
                    }
                    depth = 1;
                    yDepth = 1;
                    return isEscaping;
                }
            }

            //遍历一次逃跑点
            int findNum = 1;
            List<Vec3> list = getOuterRingAroundVec_3D(((int)entity.posX) + 0.5, (int)entity.posY, ((int)entity.posZ) + 0.5, depth, yDepth);
            for(Vec3 v : list){


                boolean canMove = !FlansModRaytracer.hasBlock(entity.worldObj,
                        Vec3.createVectorHelper(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ),
                        Vec3.createVectorHelper(v.xCoord, v.yCoord + entity.getEyeHeight(), v.zCoord));
                boolean canHide = FlansModRaytracer.hasBlock(entity.worldObj,
                        Vec3.createVectorHelper(escapeTarget.posX, escapeTarget.posY + escapeTarget.getEyeHeight(), escapeTarget.posZ),
                        Vec3.createVectorHelper(v.xCoord, v.yCoord + escapeTarget.getEyeHeight(), v.zCoord));
                Block block = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord), (int) Math.floor(v.zCoord));
                Block block1 = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord - 1), (int) Math.floor(v.zCoord));
                Block block2 = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord + 1), (int) Math.floor(v.zCoord));
                Block block3 = entity.worldObj.getBlock((int) Math.floor(v.xCoord), (int) Math.floor(v.yCoord + 2), (int) Math.floor(v.zCoord));

                boolean canStay = block.getMaterial() == Material.air && block1.getMaterial() != Material.air && block2.getMaterial() == Material.air && block3.getMaterial() == Material.air;

                if(FlansMod.DEBUG) FlansMod.log("第" + findNum + "次寻找(" + v.xCoord + "," + v.yCoord + "," + v.zCoord + ") 移动 " + canMove + " 躲藏 " + canHide + " 站立 " + canStay);

                //如果可以移动并且可以躲藏,则设置逃跑点
                if(canMove && canHide && canStay) {
                    escapePosX = v.xCoord;
                    escapePosY = v.yCoord;
                    escapePosZ = v.zCoord;
                    isEscaping = true;
                    //entity.moveHelper.setMoveTo(escapePosX, escapePosY, escapePosZ, true);
                    if (FlansMod.DEBUG){
                        entity.worldObj.spawnEntityInWorld(new EntityDebugDot(entity.worldObj, new Vector3f(v.xCoord, v.yCoord, v.zCoord), 1000, 1F, 0F, 0F));
                        FlansMod.log("逃跑点：(" + escapePosX + "," + escapePosY + "," + escapePosZ + ") 遍历层数：" + depth);
                    }
                    escapePointsCache.add(v);
                    depth = 1;
                    yDepth = 1;
                    break;
                }
                else {
                    findNum++;
                    if(findNum > list.size()) {
                        if(FlansMod.DEBUG) FlansMod.log("第" + depth + "层遍历，无法找到逃跑点");
                        depth++;
                        yDepth ++;
                        findNum = 1;
                        if (depth > maxDepth) {
                            depth = 1;
                            return false;
                        }
                        if (yDepth > maxYDepth) yDepth = 1;
                    }
                }

            }


        }

        return isEscaping;
    }

    public List<Vec3> getNxNAroundVec(double x, double y, double z, int depth){
        List<Vec3> list = new ArrayList<>();
        for (double i = -depth; i <= depth; i ++) {
            for (double j = -depth; j <= depth; j ++) {
                Vec3 v = Vec3.createVectorHelper(x + i, y, z + j);
                list.add(v);
            }
        }
        return list;
    }


    public List<Vec3> getOuterRingAroundVec(double x, double y, double z, int depth) {
        List<Vec3> list = new ArrayList<>();
        if (depth < 1) {
            return list;
        }

        for (int i = -depth; i <= depth; i++) {
            list.add(Vec3.createVectorHelper(x + i, y, z - depth));
            list.add(Vec3.createVectorHelper(x + i, y, z + depth));
        }

        for (int i = -depth + 1; i < depth; i++) {
            list.add(Vec3.createVectorHelper(x - depth, y, z + i));
            list.add(Vec3.createVectorHelper(x + depth, y, z + i));
        }
        if(FlansMod.DEBUG) FlansMod.log("尝试遍历" + depth + "层" + list.size() + "方块");
        return list;
    }

    public List<Vec3> getOuterRingAroundVec_3D(double x, double y, double z, int depth, int yDepth) {
        List<Vec3> list = new ArrayList<>();
        if (depth < 1) {
            return list;
        }

        for (int i = -depth; i <= depth; i++) {
            for(int j = -yDepth; j <= yDepth; j++){
                list.add(Vec3.createVectorHelper(x + i, y + yDepth, z - depth));
                list.add(Vec3.createVectorHelper(x + i, y + yDepth, z + depth));
            }
        }

        for (int i = -depth + 1; i < depth; i++) {
            for(int j = -yDepth; j <= yDepth; j++){
                list.add(Vec3.createVectorHelper(x - depth, y + yDepth, z + i));
                list.add(Vec3.createVectorHelper(x + depth, y + yDepth, z + i));
            }
        }

        if(FlansMod.DEBUG) FlansMod.log("尝试遍历" + depth + "层" + list.size() + "方块");
        return list;
    }

}
