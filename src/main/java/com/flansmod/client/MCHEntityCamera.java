package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.hook.EnumMCHEntityType;
import com.flansmod.common.hook.MCHeliUtil;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.EnumMap;

public class MCHEntityCamera extends EntityLivingBase {

	public Entity entity;

	public EnumMCHEntityType type;

	public static EnumMap<EnumMCHEntityType, Vector3f> cameraPositions = new EnumMap<>(EnumMCHEntityType.class);

	static {
		cameraPositions.put(EnumMCHEntityType.TANK, new Vector3f(0, 4, 0));
		cameraPositions.put(EnumMCHEntityType.VEHICLE, new Vector3f(0, 2, 0));
		cameraPositions.put(EnumMCHEntityType.PLANE, new Vector3f(0, 10, 0));
		cameraPositions.put(EnumMCHEntityType.HELI, new Vector3f(0, 5, 0));
		cameraPositions.put(EnumMCHEntityType.OTHER, new Vector3f(0, 0, 0));
	}

	public static float lerpAmount = 0.3F;

	public MCHEntityCamera(World world) {
		super(world);
		setSize(0F, 0F);
	}

	public MCHEntityCamera(World world, Entity d) {
		this(world);
		entity = d;
		type = MCHeliUtil.getEntityType(d);
		setPosition(d.posX, d.posY, d.posZ);
	}
	
	@Override
	public void onUpdate() {
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;

		Vector3f cameraPosition = cameraPositions.get(type);

		double p = entity.rotationPitch * 3.1415926D / 180;
		double r = entity.rotationYaw * 3.1415926D / 180;

		double dx1 = cameraPosition.y * Math.sin(p) * -Math.sin(r);
		double dy1 = cameraPosition.y * Math.cos(p);
		double dz1 = cameraPosition.y * Math.sin(p) * Math.cos(r);

		double dX = entity.posX + dx1 - posX;
		double dY = entity.posY + dy1 - posY;
		double dZ = entity.posZ + dz1 - posZ;

		setPosition(posX + dX * lerpAmount, posY + dY * lerpAmount, posZ + dZ * lerpAmount);

		Entity player = FlansMod.proxy.getThePlayer();
		if(player != null) {
			rotationYaw	= player.rotationYaw;
			rotationPitch = player.rotationPitch;
		}

		//FlansMod.log(entity.rotationPitch + " " + entity.rotationYaw +  " " + dx1 + " " + dy1 + " " + dz1);
	}

	@Override
	public ItemStack getHeldItem() 
	{
		return null;
	}

	@Override
	public ItemStack getEquipmentInSlot(int p_71124_1_) 
	{
		return null;
	}

	@Override
	public void setCurrentItemOrArmor(int p_70062_1_, ItemStack p_70062_2_) {}

	@Override
	public ItemStack[] getLastActiveItems() 
	{
		return null;
	}

}
