package com.flansmod.common.mob;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityTracker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemCorpseSpawner extends Item {

    @SideOnly(Side.CLIENT)
    public IIcon icon;

    public ItemCorpseSpawner() {
        maxStackSize = 1;
        setCreativeTab(FlansMod.tabFlanTeams); // 设置为某个创造模式标签
        GameRegistry.registerItem(this, "corpsespawner", FlansMod.MODID); // 注册物品
    }

    /**
     * 生成尸体的方法
     */
    public static void spawnCorpse(World world, double x, double y, double z, EntityPlayer player) {
        EntityCorpse corpse = new EntityCorpse(world, player);
        corpse.setPosition(x + 0.5, y + 1, z + 0.5); // 设置尸体位置
        world.spawnEntityInWorld(corpse); // 添加尸体到世界
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
        // 射线检测逻辑
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
        double length = 5D; // 射线长度
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, true);

        // 检查射线的碰撞结果
        if (movingobjectposition == null) {
            return itemstack;
        }

        // 如果射线击中了方块
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && movingobjectposition.sideHit == 1) {
            int x = movingobjectposition.blockX;
            int y = movingobjectposition.blockY;
            int z = movingobjectposition.blockZ;
            if (!world.isRemote) {
                spawnCorpse(world, x, y, z, entityplayer); // 生成尸体
            }
            // 如果玩家不在创造模式，则减少物品数量
            if (!entityplayer.capabilities.isCreativeMode) {
                itemstack.stackSize--;
            }
        }

        return itemstack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("FlansMod:CorpseSpawner"); // 注册物品图标
    }
}
