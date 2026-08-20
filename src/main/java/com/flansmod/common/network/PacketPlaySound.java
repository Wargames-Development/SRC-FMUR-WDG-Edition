package com.flansmod.common.network;

import com.flansmod.client.AmbientWarSoundManager;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.type.BulletType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.guns.type.ShootableType;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.Random;

public class PacketPlaySound extends PacketBase 
{
	public static Random rand = new Random();
	public float posX, posY, posZ;
	public String sound;
	public boolean distort, silenced;
	public float pitch = 1F;
	public float volume = -1F;
	public boolean stopSound;
	private static final String DEFAULT_DISTANT_GUN_SOUND = "standardshotdistant";
	private static final String DISTANT_EXPLOSION_SOUND = "distantexplosion";
	private static final String AMBIENT_WAR_SOUND = "ambientdistantgunfire";
	public static final float AMBIENT_WAR_SOUND_RADIUS = 300F;
	private static final float DEFAULT_DISTANT_GUN_RANGE = 160F;
	private static final long EXPLOSION_DEDUPLICATION_NANOS = 100000000L;
	private static long lastExplosionSoundNanos = Long.MIN_VALUE;
	private static float lastExplosionSoundX;
	private static float lastExplosionSoundY;
	private static float lastExplosionSoundZ;

	public PacketPlaySound() {}

	public static void sendSoundPacket(double x, double y, double z, double range, int dimension, String s, boolean distort)
	{	
		sendSoundPacket(x, y, z, range, dimension, s, distort, false);
	}
	
	public static void sendSoundPacket(double x, double y, double z, double range, int dimension, String s, boolean distort, boolean silenced)
	{
		if(s!=null && !s.isEmpty())
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(x, y, z, s, distort, silenced), x, y, z, (float)range, dimension);
		}
	}

	public static void sendAmbientWarSound(int x, int y, int z, int dimension,
			boolean active)
	{
		FlansMod.getPacketHandler().sendToAllAround(
				new PacketPlaySound(x, y, z, AMBIENT_WAR_SOUND, false, false,
						1F, 1F, !active),
				x + 0.5D, y + 0.5D, z + 0.5D,
				AMBIENT_WAR_SOUND_RADIUS, dimension);
	}

	public static void sendDistantGunSound(double x, double y, double z, int dimension,
			GunType gunType, ShootableType ammunition, boolean suppressed)
	{
		if(gunType == null || !(ammunition instanceof BulletType))
			return;

		boolean hasCustomSound = gunType.distantShootSound != null
				&& !gunType.distantShootSound.isEmpty();
		if(suppressed && !hasCustomSound)
			return;

		BulletType bulletType = (BulletType)ammunition;
		float minRange = Math.max(0F, gunType.gunSoundRange);
		float distantVolume = hasCustomSound ? 10F : bulletType.getDistantSoundVolume();
		float maxRange = hasCustomSound ? gunType.distantSoundRange
				: Math.max(gunType.distantSoundRange,
				Math.max(DEFAULT_DISTANT_GUN_RANGE, distantVolume * 16F));
		if(maxRange <= minRange)
			return;

		String distantSound = hasCustomSound
				? gunType.distantShootSound : DEFAULT_DISTANT_GUN_SOUND;
		float distantPitch = hasCustomSound
				? 1F : bulletType.getDistantSoundPitch();
		FlansMod.getPacketHandler().sendToDonut(
				new PacketPlaySound(x, y, z, distantSound, false, false,
						distantPitch, distantVolume),
				x, y, z, minRange, maxRange, dimension);
	}

	public static void sendDistantBallisticSound(double x, double y, double z,
			int dimension, float nearRange, BulletType ammunition)
	{
		if(ammunition == null)
			return;
		float volume = ammunition.getDistantSoundVolume();
		float maxRange = Math.max(DEFAULT_DISTANT_GUN_RANGE, volume * 16F);
		FlansMod.getPacketHandler().sendToDonut(
				new PacketPlaySound(x, y, z, DEFAULT_DISTANT_GUN_SOUND, false, false,
						ammunition.getDistantSoundPitch(), volume),
				x, y, z, Math.max(0F, nearRange), maxRange, dimension);
	}

	public static void sendDistantExplosionSound(double x, double y, double z,
			int dimension, float explosionSize, float nearRange)
	{
		if(explosionSize <= 0F || Float.isNaN(explosionSize) || Float.isInfinite(explosionSize))
			return;
		float volume = getDistantExplosionVolume(explosionSize);
		float maxRange = volume * 16F;
		FlansMod.getPacketHandler().sendToDonut(
				new PacketPlaySound(x, y, z, DISTANT_EXPLOSION_SOUND, false, false,
						getDistantExplosionPitch(explosionSize), volume),
				x, y, z, Math.max(0F, nearRange), maxRange, dimension);
	}

	@SideOnly(Side.CLIENT)
	public static void playDistantExplosionClient(double x, double y, double z,
			float explosionSize, float nearRange)
	{
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		if(player == null || explosionSize <= 0F)
			return;
		float volume = getDistantExplosionVolume(explosionSize);
		double distanceSq = player.getDistanceSq(x, y, z);
		if(distanceSq <= nearRange * nearRange || distanceSq >= volume * volume * 256F
				|| !acceptExplosionSound((float)x, (float)y, (float)z))
			return;
		FMLClientHandler.instance().getClient().getSoundHandler().playSound(
				new PositionedSoundRecord(FlansModResourceHandler.getSound(DISTANT_EXPLOSION_SOUND),
						volume, getDistantExplosionPitch(explosionSize),
						(float)x, (float)y, (float)z));
	}

	private static float getDistantExplosionVolume(float explosionSize) {
		return Math.max(14F, Math.min(24F, 14F + explosionSize * 1.25F));
	}

	private static float getDistantExplosionPitch(float explosionSize) {
		return Math.max(0.76F, Math.min(1.08F, 1.06F - explosionSize * 0.015F));
	}

	@SideOnly(Side.CLIENT)
	private static synchronized boolean acceptExplosionSound(float x, float y, float z) {
		long now = System.nanoTime();
		float deltaX = x - lastExplosionSoundX;
		float deltaY = y - lastExplosionSoundY;
		float deltaZ = z - lastExplosionSoundZ;
		if(lastExplosionSoundNanos != Long.MIN_VALUE
				&& now - lastExplosionSoundNanos < EXPLOSION_DEDUPLICATION_NANOS
				&& deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ < 4F)
			return false;
		lastExplosionSoundNanos = now;
		lastExplosionSoundX = x;
		lastExplosionSoundY = y;
		lastExplosionSoundZ = z;
		return true;
	}

	private static float clampPitch(float value) {
		return Float.isNaN(value) || Float.isInfinite(value)
				? 1F : Math.max(0.5F, Math.min(2F, value));
	}

	private static float clampVolume(float value) {
		return Float.isNaN(value) || Float.isInfinite(value) || value <= 0F
				? -1F : Math.max(0.05F, Math.min(32F, value));
	}

	public PacketPlaySound(double x, double y, double z, String s)
	{
		this(x, y, z, s, false);
	}

	public PacketPlaySound(double x, double y, double z, String s, boolean distort)
	{	
		this(x, y, z, s, distort, false);
	}
	
	public PacketPlaySound(double x, double y, double z, String s, boolean distort, boolean silenced)
	{
		this(x, y, z, s, distort, silenced, 1F);
	}

	public PacketPlaySound(double x, double y, double z, String s, boolean distort,
			boolean silenced, float pitch)
	{
		this(x, y, z, s, distort, silenced, pitch, -1F);
	}

	public PacketPlaySound(double x, double y, double z, String s, boolean distort,
			boolean silenced, float pitch, float volume)
	{
		this(x, y, z, s, distort, silenced, pitch, volume, false);
	}

	public PacketPlaySound(double x, double y, double z, String s, boolean distort,
			boolean silenced, float pitch, float volume, boolean stopSound)
	{
		posX = (float)x; posY = (float)y; posZ = (float)z;
		sound = s;
		this.distort = distort;
		this.silenced = silenced;
		this.pitch = clampPitch(pitch);
		this.volume = clampVolume(volume);
		this.stopSound = stopSound;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeFloat(posX);
    	data.writeFloat(posY);
    	data.writeFloat(posZ);
    	writeUTF(data, sound);
    	data.writeBoolean(distort);
		data.writeBoolean(silenced);
		data.writeFloat(pitch);
		data.writeFloat(volume);
		data.writeBoolean(stopSound);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		posX = data.readFloat();
		posY = data.readFloat();
		posZ = data.readFloat();
		sound = readUTF(data);
		distort = data.readBoolean();
		silenced = data.readBoolean();
		pitch = data.readableBytes() >= 4 ? clampPitch(data.readFloat()) : 1F;
		volume = data.readableBytes() >= 4 ? clampVolume(data.readFloat()) : -1F;
		stopSound = data.isReadable() && data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received play sound packet on server. Skipping.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		if(AMBIENT_WAR_SOUND.equals(sound)) {
			AmbientWarSoundManager.setActive((int)posX, (int)posY, (int)posZ,
					!stopSound);
			return;
		}
		if(DISTANT_EXPLOSION_SOUND.equals(sound)
				&& !acceptExplosionSound(posX, posY, posZ))
			return;
		float playbackVolume = volume > 0F ? volume : silenced ? 5F : 10F;
		FMLClientHandler.instance().getClient().getSoundHandler().playSound(new PositionedSoundRecord(FlansModResourceHandler.getSound(sound), playbackVolume, pitch * (distort ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1.0F) * (silenced ? 2F : 1F), posX, posY, posZ));
	}

}
