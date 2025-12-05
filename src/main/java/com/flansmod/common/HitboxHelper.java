package com.flansmod.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.util.AxisAlignedBB;

import java.util.LinkedList;
import java.util.WeakHashMap;

public final class HitboxHelper {
    // 玩家位置缓存表
    private static final WeakHashMap<EntityPlayer, LinkedList<Vec3>> PLAYER_POSITION = new WeakHashMap<>();
    // 玩家命中箱缓存表
    private static final WeakHashMap<EntityPlayer, LinkedList<AxisAlignedBB>> PLAYER_HITBOXES = new WeakHashMap<>();
    // 玩家速度缓存表
    private static final WeakHashMap<EntityPlayer, LinkedList<Vec3>> PLAYER_VELOCITY = new WeakHashMap<>();
    // 命中箱缓存 Tick 上限

    public static final boolean SERVER_HITBOX_LATENCY_FIX = false;
    public static final float SERVER_HITBOX_LATENCY_MAX_SAVE_MS = 100;
    public static double SERVER_HITBOX_OFFSET = 0;
    private static final int SAVE_TICK = MathHelper.floor_float(SERVER_HITBOX_LATENCY_MAX_SAVE_MS / 1000 * 20 + 0.5f);

    public static void onPlayerTick(EntityPlayer player) {
//        if (player.isSpectator()) {
//            PLAYER_POSITION.remove(player);
//            PLAYER_HITBOXES.remove(player);
//            PLAYER_VELOCITY.remove(player);
//            return;
//        }
        LinkedList<Vec3> positions = PLAYER_POSITION.computeIfAbsent(player, p -> new LinkedList<>());
        LinkedList<AxisAlignedBB> boxes = PLAYER_HITBOXES.computeIfAbsent(player, p -> new LinkedList<>());
        LinkedList<Vec3> velocities = PLAYER_VELOCITY.computeIfAbsent(player, p -> new LinkedList<>());
        positions.addFirst(Vec3.createVectorHelper(player.posX, player.posY, player.posZ));
        boxes.addFirst(player.boundingBox);
        velocities.addFirst(getPlayerVelocity(player));
        // Position 用于速度计算，所以只需要缓存 2 个位置
        if (positions.size() > 2) {
            positions.removeLast();
        }
        // 命中箱和速度缓存数量限制
        if (boxes.size() > SAVE_TICK) {
            boxes.removeLast();
            velocities.removeLast();
        }
    }

    public static void onPlayerLoggedOut(EntityPlayer player) {
        PLAYER_POSITION.remove(player);
        PLAYER_HITBOXES.remove(player);
        PLAYER_VELOCITY.remove(player);
    }

    public static Vec3 getPlayerVelocity(EntityPlayer entity) {
        LinkedList<Vec3> positions = PLAYER_POSITION.computeIfAbsent(entity, player -> new LinkedList<>());
        if (positions.size() > 1) {
            Vec3 currPos = positions.getFirst();
            Vec3 prevPos = positions.getLast();
            return Vec3.createVectorHelper(currPos.xCoord - prevPos.xCoord, currPos.yCoord - prevPos.yCoord, currPos.zCoord - prevPos.zCoord);
        }
        return Vec3.createVectorHelper(0, 0, 0);
    }

    public static AxisAlignedBB getBoundingBox(EntityPlayer entity, int ping) {
        if (PLAYER_HITBOXES.containsKey(entity)) {
            LinkedList<AxisAlignedBB> boxes = PLAYER_HITBOXES.get(entity);
            int index = MathHelper.clamp_int(ping, 0, boxes.size() - 1);
            return boxes.get(index);
        }
        return entity.boundingBox;
    }

    public static Vec3 getVelocity(EntityPlayer entity, int ping) {
        if (PLAYER_VELOCITY.containsKey(entity)) {
            LinkedList<Vec3> velocities = PLAYER_VELOCITY.get(entity);
            int index = MathHelper.clamp_int(ping, 0, velocities.size() - 1);
            return velocities.get(index);
        }
        return getPlayerVelocity(entity);
    }

    public static AxisAlignedBB getFixedBoundingBox(Entity entity) {
        // 原始flan代码
        //return entity.boundingBox.expand(-(entity.posX - entity.prevPosX) * 2.0D, -(entity.posY - entity.prevPosY) * 2.0D, -(entity.posZ - entity.prevPosZ) * 2.0D);

        AxisAlignedBB boundingBox = entity.boundingBox;
        Vec3 velocity = Vec3.createVectorHelper(entity.posX - entity.lastTickPosX, entity.posY - entity.lastTickPosY, entity.posZ - entity.lastTickPosZ);
        // 应用蹲伏导致的 hitbox 变形
//        double expandHeight = entity instanceof EntityPlayer && !entity.isSneaking() ? 0.0625 : 0.0;
//        boundingBox = boundingBox.expand(0, expandHeight, 0);
        // 根据速度一定程度地扩展 hitbox
        boundingBox = boundingBox.expand(velocity.xCoord, velocity.yCoord, velocity.zCoord);
        // 玩家 hitbox 修正，可以通过 Config 调整
        double playerHitboxOffset = SERVER_HITBOX_OFFSET;
        if (entity instanceof EntityPlayer) {
            if (entity.ridingEntity != null) {
                boundingBox = boundingBox.getOffsetBoundingBox(velocity.xCoord * playerHitboxOffset / 2, velocity.yCoord * playerHitboxOffset / 2, velocity.zCoord * playerHitboxOffset / 2);
            }
            boundingBox = boundingBox.getOffsetBoundingBox(velocity.xCoord * playerHitboxOffset, velocity.yCoord * playerHitboxOffset, velocity.zCoord * playerHitboxOffset);
        }
        // 给所有实体统一应用的 Hitbox 偏移，其数值为实验得出的定值。
        if (entity.ridingEntity != null) {
            boundingBox = boundingBox.getOffsetBoundingBox(velocity.xCoord * -2.5, velocity.yCoord * -2.5, velocity.zCoord * -2.5);
        }
        boundingBox = boundingBox.getOffsetBoundingBox(velocity.xCoord * -5, velocity.yCoord * -5, velocity.zCoord * -5);
        return boundingBox;
    }
}
