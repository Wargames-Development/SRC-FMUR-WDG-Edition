package com.flansmod.common.mob;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.concurrent.ThreadLocalRandom;

public class EntityCorpse extends Entity implements IEntityAdditionalSpawnData {

    private final long spawnTime; // 生成时间
    private EntityPlayer owner; // 玩家对象
    private String name;

    // 身体部位的旋转角度
    private float headRotationX;

    private float headRotationY;

    private float leftArmRotationX, leftArmRotationY, leftArmRotationZ;

    private float rightArmRotationX, rightArmRotationY, rightArmRotationZ;

    private float bodyRotationX, bodyRotationY;

    private float leftLegRotationX, leftLegRotationY, leftLegRotationZ;

    private float rightLegRotationX, rightLegRotationY, rightLegRotationZ;

    private boolean isDown;

    public EntityCorpse(World world) {
        super(world);
        this.spawnTime = System.currentTimeMillis(); // 获取当前时间
        renderDistanceWeight = 100D;
        ignoreFrustumCheck = true;
    }

    public EntityCorpse(World world, EntityPlayer player) {
        this(world);
        this.owner = player; // 保存死亡玩家信息
        this.name = player.getDisplayName();

        this.headRotationX = (float) (Math.random() * 30 - 15); // 随机上下转动
        this.headRotationY = (float) (Math.random() * 360 - 180); // 随机左右转动
        this.leftArmRotationX = (float) (Math.random() * 60 - 30);
        this.leftArmRotationY = (float) (Math.random() * 60 - 30);
        this.leftArmRotationZ = (float) (Math.random() * 180 - 90); // 新增 Z 轴旋转
        this.rightArmRotationX = (float) (Math.random() * 60 - 30);
        this.rightArmRotationY = (float) (Math.random() * 60 - 30);
        this.rightArmRotationZ = (float) (Math.random() * 180 - 90); // 新增 Z 轴旋转
        this.bodyRotationX = (float) (Math.random() * 10 - 5);
        this.bodyRotationY = player.rotationYaw + (float) (Math.random() * 20 - 10);
        this.leftLegRotationX = (float) (Math.random() * 90 - 45);
        this.leftLegRotationY = (float) (Math.random() * 90 - 45);
        this.leftLegRotationZ = (float) (Math.random() * 90 - 45); // 新增 Z 轴旋转
        this.rightLegRotationX = (float) (Math.random() * 90 - 45);
        this.rightLegRotationY = (float) (Math.random() * 90 - 45);
        this.rightLegRotationZ = (float) (Math.random() * 90 - 45); // 新增 Z 轴旋转
        this.isDown = ThreadLocalRandom.current().nextBoolean();
    }

    @Override
    protected void entityInit() {
        dataWatcher.addObject(2, (byte) 0);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        // 检查尸体是否存在超过15秒
        if (System.currentTimeMillis() - spawnTime > 15000) {
            this.setDead(); // 超时后移除尸体
        }
        // update motion
        motionY -= 9.81D / 400D;
        motionX *= 0.5;
        motionZ *= 0.5;
        moveEntity(motionX, motionY, motionZ);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbt) {
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbt) {
    }

    @Override
    public boolean canBeCollidedWith() {
        return false; // 取消碰撞箱
    }

    @Override
    public boolean isInvisible() {
        return false; // 显示实体模型
    }

    public EntityPlayer getOwner() {
        return owner;
    }

    @Override
    public float getShadowSize() {
        return 0.5F;
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        ByteBufUtils.writeUTF8String(buffer, owner == null ? "尸体" : owner.getDisplayName());
        // 写入旋转角度
        buffer.writeFloat(headRotationX);
        buffer.writeFloat(headRotationY);

        buffer.writeFloat(leftArmRotationX);
        buffer.writeFloat(leftArmRotationY);
        buffer.writeFloat(leftArmRotationZ);

        buffer.writeFloat(rightArmRotationX);
        buffer.writeFloat(rightArmRotationY);
        buffer.writeFloat(rightArmRotationZ);

        buffer.writeFloat(bodyRotationX);
        buffer.writeFloat(bodyRotationY);

        buffer.writeFloat(leftLegRotationX);
        buffer.writeFloat(leftLegRotationY);
        buffer.writeFloat(leftLegRotationZ);

        buffer.writeFloat(rightLegRotationX);
        buffer.writeFloat(rightLegRotationY);
        buffer.writeFloat(rightLegRotationZ);

        buffer.writeBoolean(isDown); // 写入是否为趴着状态
    }

    @Override
    public void readSpawnData(ByteBuf additionalData) {
        name = ByteBufUtils.readUTF8String(additionalData);
        // 读取旋转角度
        headRotationX = additionalData.readFloat();
        headRotationY = additionalData.readFloat();

        leftArmRotationX = additionalData.readFloat();
        leftArmRotationY = additionalData.readFloat();
        leftArmRotationZ = additionalData.readFloat();

        rightArmRotationX = additionalData.readFloat();
        rightArmRotationY = additionalData.readFloat();
        rightArmRotationZ = additionalData.readFloat();

        bodyRotationX = additionalData.readFloat();
        bodyRotationY = additionalData.readFloat();

        leftLegRotationX = additionalData.readFloat();
        leftLegRotationY = additionalData.readFloat();
        leftLegRotationZ = additionalData.readFloat();

        rightLegRotationX = additionalData.readFloat();
        rightLegRotationY = additionalData.readFloat();
        rightLegRotationZ = additionalData.readFloat();

        isDown = additionalData.readBoolean(); // 读取是否为趴着状态
    }

    public String getPlayerName() {
        return name;
    }

    // Getter 方法

    public float getHeadRotationX() {
        return headRotationX;
    }

    public float getHeadRotationY() {
        return headRotationY;
    }

    public float getLeftArmRotationX() {
        return leftArmRotationX;
    }

    public float getLeftArmRotationY() {
        return leftArmRotationY;
    }

    public float getLeftArmRotationZ() {
        return leftArmRotationZ;
    } // 新增

    public float getRightArmRotationX() {
        return rightArmRotationX;
    }

    public float getRightArmRotationY() {
        return rightArmRotationY;
    }

    public float getRightArmRotationZ() {
        return rightArmRotationZ;
    } // 新增

    public float getBodyRotationX() {
        return bodyRotationX;
    }

    public float getBodyRotationY() {
        return bodyRotationY;
    }

    public float getLeftLegRotationX() {
        return leftLegRotationX;
    }

    public float getLeftLegRotationY() {
        return leftLegRotationY;
    }

    public float getLeftLegRotationZ() {
        return leftLegRotationZ;
    } // 新增

    public float getRightLegRotationX() {
        return rightLegRotationX;
    }

    public float getRightLegRotationY() {
        return rightLegRotationY;
    }

    public float getRightLegRotationZ() {
        return rightLegRotationZ;
    } // 新增

    public boolean isDown() {
        return isDown;
    } // 新增

    public EntityPlayer getPlayer() {
        return owner;
    }
}
