package com.flansmod.common.teams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityTracker;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.WeightedRandomFishable;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;

public class EntityConnectingLine extends EntityFishHook {
	
	public Object connectedTo;

	public EntityConnectingLine(World world) 
	{
		super(world);
	}

    public EntityConnectingLine(World world, EntityPlayer player, ITeamBase base)
    {
        super(world);
        field_146043_c = this;
        ignoreFrustumCheck = true;
        field_146042_b = player;
        field_146042_b.fishEntity = this;
        setSize(0.25F, 0.25F);
        setPosition(base.getPosX(), base.getPosY(), base.getPosZ());
        yOffset = 0.0F;
        motionX = 0;
        motionZ = 0;
        motionY = 0;
        connectedTo = base;
        renderDistanceWeight = 500D;
    }
	   
	public EntityConnectingLine(World world, EntityPlayer player, ITeamObject object)
    {
        super(world);
        field_146043_c = this; 
        ignoreFrustumCheck = true;
        field_146042_b = player;
        field_146042_b.fishEntity = this;
        setSize(0.25F, 0.25F);
        setPosition(object.getPosX(), object.getPosY(), object.getPosZ());
        yOffset = 0.0F;
        motionX = 0;
        motionZ = 0;
        motionY = 0;
        connectedTo = object;
    }

    public EntityConnectingLine(World world, EntityPlayer player, Entity entity)
    {
        super(world);
        field_146043_c = this;
        ignoreFrustumCheck = true;
        field_146042_b = player;
        field_146042_b.fishEntity = this;
        setSize(0.25F, 0.25F);
        setPosition(entity.posX, entity.posY, entity.posZ);
        yOffset = 0.0F;
        motionX = 0;
        motionZ = 0;
        motionY = 0;
        connectedTo = entity;
    }
	    
    @Override
	public void onUpdate()
    {
        super.onUpdate();
        if(connectedTo instanceof ITeamBase || connectedTo instanceof ITeamObject) {
            ItemStack currentItemstack = field_146042_b.inventory.getCurrentItem();
            if(currentItemstack == null || !(currentItemstack.getItem() instanceof ItemOpStick) || currentItemstack.getItemDamage() != 1)
            {
                setDead();
                field_146042_b.fishEntity = null;
            }
        }

        if(connectedTo instanceof Entity) {
            Entity connectToEntity = (Entity) connectedTo;
            setPosition(connectToEntity.posX, connectToEntity.posY, connectToEntity.posZ);
            if(connectToEntity.isDead) {
                setDead();
            }
        }
    }


}
