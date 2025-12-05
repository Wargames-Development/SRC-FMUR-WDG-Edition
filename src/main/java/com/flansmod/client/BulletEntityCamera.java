package com.flansmod.client;

import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.guns.EntityBullet;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static com.flansmod.client.FlansModClient.isBulletTrackingActive;
import static com.flansmod.client.FlansModClient.minecraft;
//TODO: 适配Flan载具
/*
 * 该类用于子弹跟踪视角中子弹相机实体
 * */
public class BulletEntityCamera extends EntityLivingBase {

    public EntityBullet bullet;

    public BulletEntityCamera(World world) {
        super(world);
        setSize(0F, 0F);
    }

    public BulletEntityCamera(World world, EntityBullet d) {
        this(world);
        bullet = d;
        setPosition(d.posX, d.posY, d.posZ);
    }
    @Override
    public void onUpdate() {
        if(!FlansModClient.enabledCameraFollowBullet) {
            setDead();
        }

        if (bullet.owner.ridingEntity != null && bullet.owner.ridingEntity instanceof EntityDriveable) {
            minecraft.displayGuiScreen(null);
            minecraft.thePlayer.sendChatMessage(minecraft.currentScreen.toString());
        }
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        double dX = bullet.posX - posX;
        double dY = bullet.posY - posY;
        double dZ = bullet.posZ - posZ;

        setPosition(posX + dX, posY + dY, posZ + dZ);

        if(!bullet.type.fixCamera) {
            rotationYaw = minecraft.thePlayer.rotationYaw;
            rotationPitch = minecraft.thePlayer.rotationPitch;
            prevRotationYaw = minecraft.thePlayer.prevRotationYaw;
            prevRotationPitch = minecraft.thePlayer.prevRotationPitch;
        } else {
            rotationYaw = -bullet.rotationYaw;
            rotationPitch = -bullet.rotationPitch;
            prevRotationYaw = -bullet.prevRotationYaw;
            prevRotationPitch = -bullet.prevRotationPitch;
        }

        for(; rotationYaw - prevRotationYaw >= 180F; rotationYaw -= 360F) ;
        for(; rotationYaw - prevRotationYaw < -180F; rotationYaw += 360F) ;
    }

    @Override
    public void setDead() {
        super.setDead();
        if (bullet.owner.ridingEntity != null && bullet.owner.ridingEntity instanceof EntityDriveable) {
            minecraft.thePlayer.sendChatMessage("camera");
            minecraft.displayGuiScreen(new GuiDriveableController((EntityDriveable) bullet.owner.ridingEntity));
        }
        minecraft.renderViewEntity = minecraft.thePlayer;
        isBulletTrackingActive = false;
    }


    @Override
    public ItemStack getHeldItem() {
        return null;
    }

    @Override
    public ItemStack getEquipmentInSlot(int p_71124_1_) {
        return null;
    }

    @Override
    public void setCurrentItemOrArmor(int p_70062_1_, ItemStack p_70062_2_) {
    }

    @Override
    public ItemStack[] getLastActiveItems() {
        return null;
    }
}