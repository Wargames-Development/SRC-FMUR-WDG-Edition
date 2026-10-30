package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

/** The regular FMUR gun tracer, exposed without changing its line/point appearance. */
@SideOnly(Side.CLIENT)
public final class TracerRenderApi {
    public static final int API_VERSION = 1;
	private static final float NIGHT_VISION_BRIGHTNESS_MULTIPLIER = 1.35F;
	private static final ResourceLocation RED_TRACER_TEXTURE =
			new ResourceLocation("flansmod", "particle/FMTracerRed.png");
	private static final ResourceLocation GREEN_TRACER_TEXTURE =
			new ResourceLocation("flansmod", "particle/FMTracerGreen.png");
	private static final ResourceLocation BLUE_TRACER_TEXTURE =
			new ResourceLocation("flansmod", "particle/FMTracerBlue.png");
    private TracerRenderApi() { }
    /** Caller translates to the interpolated round position, as FMUR's bullet renderer does. */
    public static boolean render(Entity bullet, float partialTicks, double travelX, double travelY,
                                 double travelZ, float scale, boolean green, boolean blue) {
        if (!Float.isFinite(scale) || scale <= 0 || !Double.isFinite(travelX)
            || !Double.isFinite(travelY) || !Double.isFinite(travelZ)) return false;
		double speed = Math.sqrt(travelX * travelX
				+ travelY * travelY
				+ travelZ * travelZ);
		if(speed < 0.001D)
			return false;

		double directionX = travelX / speed;
		double directionY = travelY / speed;
		double directionZ = travelZ / speed;
		float tracerScale = scale;
		double length = Math.max(0.45D, Math.min(3.25D, speed * 1.35D)) * tracerScale;
		Minecraft minecraft = Minecraft.getMinecraft();
		float nightVisionBrightness = minecraft.thePlayer != null
				&& minecraft.thePlayer.isPotionActive(Potion.nightVision)
				? NIGHT_VISION_BRIGHTNESS_MULTIPLIER : 1F;
		if(minecraft.gameSettings.thirdPersonView == 0 && minecraft.thePlayer != null)
		{
			double bulletX = bullet.lastTickPosX + (bullet.posX - bullet.lastTickPosX) * partialTicks;
			double bulletY = bullet.lastTickPosY + (bullet.posY - bullet.lastTickPosY) * partialTicks;
			double bulletZ = bullet.lastTickPosZ + (bullet.posZ - bullet.lastTickPosZ) * partialTicks;
			double eyeX = minecraft.thePlayer.lastTickPosX
					+ (minecraft.thePlayer.posX - minecraft.thePlayer.lastTickPosX) * partialTicks;
			double eyeY = minecraft.thePlayer.lastTickPosY
					+ (minecraft.thePlayer.posY - minecraft.thePlayer.lastTickPosY) * partialTicks
					+ minecraft.thePlayer.getEyeHeight();
			double eyeZ = minecraft.thePlayer.lastTickPosZ
					+ (minecraft.thePlayer.posZ - minecraft.thePlayer.lastTickPosZ) * partialTicks;
			double distanceToEye = Math.sqrt((bulletX - eyeX) * (bulletX - eyeX)
					+ (bulletY - eyeY) * (bulletY - eyeY)
					+ (bulletZ - eyeZ) * (bulletZ - eyeZ));
			length = Math.min(length, Math.max(0D, distanceToEye - 0.35D));
		}

		double tailX = -directionX * length;
		double tailY = -directionY * length;
		double tailZ = -directionZ * length;
		boolean greenTracer = green;
		boolean blueTracer = blue;
		float glowRed = blueTracer || greenTracer ? 0F : 1F;
		float glowGreen = blueTracer ? 0.35F : (greenTracer ? 1F : 0F);
		float glowBlue = blueTracer ? 1F : 0F;
		float accentRed = blueTracer ? 0.08F : (greenTracer ? 0.04F : 1F);
		float coreGreen = blueTracer ? 0.72F : (greenTracer ? 1F : 0.04F);
		float coreBlue = blueTracer ? 1F : 0.01F;

		int active = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
		float lightX = OpenGlHelper.lastBrightnessX, lightY = OpenGlHelper.lastBrightnessY;
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
		try
		{
			OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240, 240);
			// Shader packs still run their entity program here. Keep texturing enabled and
			// submit complete vertex data instead of raw untextured immediate-mode lines.
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			GL11.glDisable(GL11.GL_CULL_FACE);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(false);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
			GL11.glEnable(GL11.GL_LINE_SMOOTH);
			GL11.glHint(GL11.GL_LINE_SMOOTH_HINT, GL11.GL_NICEST);
			minecraft.renderEngine.bindTexture(blueTracer ? BLUE_TRACER_TEXTURE
					: (greenTracer ? GREEN_TRACER_TEXTURE : RED_TRACER_TEXTURE));

			if(length > 0.05D)
			{
				drawTracerLine(tailX, tailY, tailZ, 11F * tracerScale,
						glowRed, glowGreen, glowBlue, scaledAlpha(0.10F, nightVisionBrightness));
				drawTracerLine(tailX, tailY, tailZ, 6F * tracerScale,
						blueTracer ? 0.02F : (greenTracer ? 0.015F : 1F),
						blueTracer ? 0.55F : (greenTracer ? 1F : 0.015F), glowBlue,
						scaledAlpha(0.24F, nightVisionBrightness));
				drawTracerLine(tailX, tailY, tailZ, 2.25F * tracerScale,
						accentRed, coreGreen, coreBlue, 1F);
			}

			GL11.glEnable(GL11.GL_POINT_SMOOTH);
			GL11.glHint(GL11.GL_POINT_SMOOTH_HINT, GL11.GL_NICEST);
			drawTracerPoint(9F * tracerScale, glowRed, glowGreen, glowBlue,
					scaledAlpha(0.16F, nightVisionBrightness));
			drawTracerPoint(3.5F * tracerScale, accentRed, coreGreen, coreBlue, 1F);
			return true;
		}
		finally
		{
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightX, lightY);
			GL11.glPopAttrib();
			OpenGlHelper.setActiveTexture(active);
		}
	}

	private static float scaledAlpha(float alpha, float multiplier)
	{
		return Math.min(1F, alpha * multiplier);
	}

	private static void drawTracerLine(double tailX, double tailY, double tailZ,
			float width, float red, float green, float blue, float alpha)
	{
		Tessellator tessellator = Tessellator.instance;
		GL11.glLineWidth(width);
		tessellator.startDrawing(GL11.GL_LINES);
		tessellator.setBrightness(15728880);
		tessellator.setColorRGBA_F(red, green, blue, alpha);
		tessellator.setNormal(0F, 1F, 0F);
		tessellator.addVertexWithUV(tailX, tailY, tailZ, 0.5D, 0.5D);
		tessellator.addVertexWithUV(0D, 0D, 0D, 0.5D, 0.5D);
		tessellator.draw();
	}

	private static void drawTracerPoint(float size, float red, float green, float blue, float alpha)
	{
		Tessellator tessellator = Tessellator.instance;
		GL11.glPointSize(size);
		tessellator.startDrawing(GL11.GL_POINTS);
		tessellator.setBrightness(15728880);
		tessellator.setColorRGBA_F(red, green, blue, alpha);
		tessellator.setNormal(0F, 1F, 0F);
		tessellator.addVertexWithUV(0D, 0D, 0D, 0.5D, 0.5D);
		tessellator.draw();
	}

}
