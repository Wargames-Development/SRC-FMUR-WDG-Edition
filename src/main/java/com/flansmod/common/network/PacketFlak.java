package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

import java.util.Random;

public class PacketFlak extends PacketBase 
{
	public static Random rand = new Random();
	
	/** Position of this flak */
	public double x, y, z;
	/** Num particles */
	public int numParticles;
	/** Particle type */
	public String particleType;
	public float age = 1.0F;
	public int range = 30;
	public int height = 20;

	public PacketFlak() {}

	public PacketFlak(double x1, double y1, double z1, int n, String s)
	{
		x = x1; y = y1; z = z1;
		numParticles = n;
		particleType = s;
	}

	public PacketFlak(double x1, double y1, double z1, int n, String s, float age, int range, int height)
	{
		x = x1; y = y1; z = z1;
		numParticles = n;
		particleType = s;
		this.age = age;
		this.range = range;
		this.height = height;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeDouble(x);
    	data.writeDouble(y);
    	data.writeDouble(z);
		data.writeFloat(age);
		data.writeInt(range);
		data.writeInt(height);
    	data.writeInt(numParticles);
    	writeUTF(data, particleType);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		x = data.readDouble();
		y = data.readDouble();
		z = data.readDouble();
		age = data.readFloat();
		range = data.readInt();
		height = data.readInt();
		numParticles = data.readInt();
		particleType = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received flak packet on server. Disregarding.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		World world = clientPlayer.worldObj;
		for (int i = 0; i < numParticles; i++)
		{
			EntityFX obj = FlansModClient.getParticle(particleType, world,
					x + rand.nextGaussian() * range / 20,
					y + rand.nextGaussian() * height / 20,
					z + rand.nextGaussian() * range / 20, age);
			if(obj != null)
			{
				obj.motionX = rand.nextGaussian() / 200;
				obj.motionY = rand.nextGaussian() / 200;
				obj.motionZ = rand.nextGaussian() / 200;
				obj.renderDistanceWeight = 250D;
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(obj);
			}
		}		
	}
}
