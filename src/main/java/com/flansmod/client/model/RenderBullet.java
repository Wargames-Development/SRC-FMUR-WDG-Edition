package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.EntityBullet;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.Map;
import java.util.WeakHashMap;

public class RenderBullet extends Render
{
	private static final double MAX_HANDHELD_VISUAL_CORRECTION = 3D;
	private final Map<EntityBullet, VisualOriginCorrection> visualOriginCorrections =
			new WeakHashMap<EntityBullet, VisualOriginCorrection>();

	public RenderBullet()
	{
		shadowSize = 0;
	}

	public void render(EntityBullet bullet, double d, double d1, double d2, float f, float f1)
	{
		if(bullet.owner == Minecraft.getMinecraft().thePlayer && bullet.ticksExisted < 1)
			return;
		VisualOriginCorrection correction = getVisualOriginCorrection(bullet, f1);
		bindEntityTexture(bullet);
		GL11.glPushMatrix();
		GL11.glTranslated(d + correction.x, d1 + correction.y, d2 + correction.z);
		renderTracerGlow(bullet, f1);
		GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(90F -bullet.prevRotationPitch - (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
		ModelBase model = bullet.type.model;
		if(model != null)
			model.render(bullet, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	/**
	 * Rebase only the rendered trajectory of handheld player bullets onto the
	 * shooter's visible firing line. The authoritative entity can arrive at the
	 * client from an older server-side player position, which makes the whole
	 * projectile path appear on the opposite side of a strafe. Projecting the
	 * eye/barrel anchor onto the horizontal path gives one constant lateral
	 * offset. Y is deliberately preserved so looking up or down cannot lift the
	 * synchronized tracer away from the model-anchored muzzle tracer.
	 */
	private VisualOriginCorrection getVisualOriginCorrection(EntityBullet bullet, float partialTicks)
	{
		VisualOriginCorrection existing = visualOriginCorrections.get(bullet);
		if(existing != null)
			return existing;

		if(!(bullet.owner instanceof EntityPlayer) || bullet.type == null
				|| bullet.owner.ridingEntity != null)
			return VisualOriginCorrection.NONE;

		double horizontalSpeedSquared = bullet.motionX * bullet.motionX
				+ bullet.motionZ * bullet.motionZ;
		if(horizontalSpeedSquared < 0.000001D)
			return VisualOriginCorrection.NONE;

		EntityPlayer shooter = (EntityPlayer)bullet.owner;
		double bulletX = interpolate(bullet.lastTickPosX, bullet.posX, partialTicks);
		double bulletZ = interpolate(bullet.lastTickPosZ, bullet.posZ, partialTicks);
		double muzzleX = interpolate(shooter.lastTickPosX, shooter.posX, partialTicks);
		double muzzleZ = interpolate(shooter.lastTickPosZ, shooter.posZ, partialTicks);

		double toMuzzleX = muzzleX - bulletX;
		double toMuzzleZ = muzzleZ - bulletZ;
		double alongTrajectory = (toMuzzleX * bullet.motionX
				+ toMuzzleZ * bullet.motionZ) / horizontalSpeedSquared;
		double correctionX = toMuzzleX - bullet.motionX * alongTrajectory;
		double correctionZ = toMuzzleZ - bullet.motionZ * alongTrajectory;
		double correctionSquared = correctionX * correctionX
				+ correctionZ * correctionZ;

		// Do not pull unrelated or discontinuity-sized projectiles onto a player.
		if(correctionSquared > MAX_HANDHELD_VISUAL_CORRECTION * MAX_HANDHELD_VISUAL_CORRECTION)
			return VisualOriginCorrection.NONE;

		VisualOriginCorrection correction = new VisualOriginCorrection(
				correctionX, 0D, correctionZ);
		visualOriginCorrections.put(bullet, correction);
		return correction;
	}

	private double interpolate(double previous, double current, float partialTicks)
	{
		return previous + (current - previous) * partialTicks;
	}

	private static final class VisualOriginCorrection
	{
		private static final VisualOriginCorrection NONE = new VisualOriginCorrection(0D, 0D, 0D);
		private final double x;
		private final double y;
		private final double z;

		private VisualOriginCorrection(double x, double y, double z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	/** Draw the synchronized bullet with the same client-only API used by vehicle tracers. */
	private void renderTracerGlow(EntityBullet bullet, float partialTicks)
	{
		if(!bullet.type.tracer || !bullet.hasTracerReachedVisibleDistance())
			return;
		com.flansmod.client.TracerRenderApi.render(bullet, partialTicks,
				bullet.motionX, bullet.motionY, bullet.motionZ, bullet.type.tracerScale,
				bullet.type.greenTracer, bullet.type.blueTracer);
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityBullet) entity, d, d1, d2, f, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityBullet)entity).type);
	}
}
