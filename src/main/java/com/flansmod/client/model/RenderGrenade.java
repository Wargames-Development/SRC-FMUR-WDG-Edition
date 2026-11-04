package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.type.GrenadeType;
import com.flansmod.common.guns.item.ItemGrenade;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;

public class RenderGrenade extends Render implements IItemRenderer {
    private static final long THROW_DURATION_NANOS = ItemGrenade.THROW_ANIMATION_TICKS * 50000000L;
    private long throwStarted;
    private EntityPlayer throwingPlayer;
    private World throwingWorld;
    private ItemStack thrownStack;
    private int throwingSlot;
    private final FloatBuffer idleProjection = BufferUtils.createFloatBuffer(16);
    private EntityPlayer idleProjectionPlayer;

    public void startThrow(EntityPlayer player, ItemStack stack) {
        throwingPlayer = player;
        throwingWorld = player.worldObj;
        thrownStack = stack.copy();
        thrownStack.stackSize = 1;
        throwingSlot = player.inventory.currentItem;
        throwStarted = System.nanoTime();
    }

    public void tick(Minecraft mc) {
        throwProgress(mc);
        if (mc.thePlayer != idleProjectionPlayer) idleProjectionPlayer = null;
    }

    private float throwProgress(Minecraft mc) {
        if (throwStarted == 0L) return -1F;
        float progress = (System.nanoTime() - throwStarted) / (float) THROW_DURATION_NANOS;
        ItemStack held = mc.thePlayer == null ? null : mc.thePlayer.getHeldItem();
        if (progress >= 1F || mc.thePlayer != throwingPlayer || mc.theWorld != throwingWorld
                || !throwingPlayer.isEntityAlive() || throwingPlayer.inventory.currentItem != throwingSlot
                || throwingPlayer.ridingEntity != null
                || held != null && held.getItem() != thrownStack.getItem()) {
            throwStarted = 0L;
            throwingPlayer = null;
            throwingWorld = null;
            thrownStack = null;
            return -1F;
        }
        return progress;
    }

    public boolean renderThrowHands(Minecraft mc) {
        float progress = throwProgress(mc);
        if (progress < 0F) return false;
        if (mc.gameSettings.thirdPersonView != 0 || mc.thePlayer.isInvisible()) return false;
        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix(); GL11.glLoadIdentity();
        // The vanilla hand projection differs from the configured world FOV.
        // Reuse the equipped grenade's projection so the hands cannot jump at startup.
        if (idleProjectionPlayer == mc.thePlayer) GL11.glLoadMatrix(idleProjection);
        else Project.gluPerspective(70F, (float) mc.displayWidth / mc.displayHeight, 0.05F, 10F);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix(); GL11.glLoadIdentity();
        float brightnessX = OpenGlHelper.lastBrightnessX, brightnessY = OpenGlHelper.lastBrightnessY;
        boolean lightmap = mc.theWorld != null && mc.entityRenderer != null;
        try {
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            FirstPersonHands.applyViewBobbing(mc.thePlayer, RenderGun.smoothing);
            if (lightmap) {
                mc.entityRenderer.enableLightmap(0D);
                int brightness = mc.thePlayer.getBrightnessForRender(0F);
                OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, brightness & 65535, brightness >> 16);
                RenderHelper.enableStandardItemLighting();
            }
            renderThrowPose(mc.thePlayer, progress, thrownStack);
        } finally {
            if (lightmap) mc.entityRenderer.disableLightmap(0D);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, brightnessX, brightnessY);
            GL11.glPopMatrix(); GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix();
            GL11.glPopAttrib(); GL11.glMatrixMode(matrixMode);
        }
        return true;
    }

    static void renderThrowPose(EntityPlayer player, float progress, ItemStack grenade) {
        float lift = smooth((progress - 0.25F) / 0.18F);
        float swing = smooth((progress - 0.43F) / 0.12F);
        float recover = smooth((progress - 0.55F) / 0.45F);
        // Raise beside the head, then travel forward and down through the release.
        float x = 0.32F + 0.18F * lift - 0.3F * swing + 0.12F * recover;
        float y = -0.36F + 0.76F * lift - 0.3F * swing - 0.46F * recover;
        float z = -0.95F + 0.35F * lift - 0.7F * swing + 0.35F * recover;
        float pitch = -55F + 60F * lift - 35F * swing - 25F * recover;
        if (progress < ItemGrenade.THROW_RELEASE_TICKS / (float) ItemGrenade.THROW_ANIMATION_TICKS
                && grenade != null && grenade.getItem() instanceof ItemGrenade) {
            GrenadeType type = ((ItemGrenade) grenade.getItem()).type;
            if (type.model != null) {
                GL11.glPushMatrix();
                try {
                    GL11.glTranslatef(x, y + 0.09F, z - 0.05F);
                    GL11.glRotatef(60F * lift - 35F * swing, 1F, 0F, 0F);
                    GL11.glScalef(0.85F, 0.85F, 0.85F);
                    Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(type));
                    GL11.glColor4f(1F, 1F, 1F, 1F);
                    type.model.render(null, 0F, 0F, 0F, 0F, 0F, 0.0625F);
                } finally { GL11.glPopMatrix(); }
            }
        }
        FirstPersonHands.render(player, true, x, y, z, pitch, 15F);
        // The free hand reaches the top of the grenade, pulls outward, then lowers.
        float reach = smooth(progress / 0.08F);
        float pull = smooth((progress - 0.08F) / 0.17F);
        float lower = smooth((progress - 0.25F) / 0.18F);
        FirstPersonHands.render(player, false, -0.18F + 0.46F * reach - 0.36F * pull - 0.1F * lower,
                -0.45F + 0.24F * reach + 0.06F * pull - 0.3F * lower,
                -0.85F - 0.17F * reach + 0.17F * lower, -55F + 15F * reach - 15F * lower, -20F);
    }

    private static float smooth(float value) {
        float t = Math.max(0F, Math.min(1F, value));
        return t * t * (3F - 2F * t);
    }

    public RenderGrenade() {
        shadowSize = 0.1F;
    }

    public void render(EntityGrenade grenade, double d, double d1, double d2, float f, float f1) {
        bindEntityTexture(grenade);
        GL11.glPushMatrix();
        GL11.glTranslatef((float) d, (float) d1, (float) d2);
        if (grenade.stuck) {
            GL11.glRotatef(180F - grenade.axes.getYaw(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(grenade.axes.getPitch(), 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(grenade.axes.getRoll(), 1.0F, 0.0F, 0.0F);
        } else {
            float dYaw = (grenade.axes.getYaw() - grenade.prevRotationYaw);
            for (; dYaw > 180F; dYaw -= 360F) {
            }
            for (; dYaw <= -180F; dYaw += 360F) {
            }
            float dPitch = (grenade.axes.getPitch() - grenade.prevRotationPitch);
            for (; dPitch > 180F; dPitch -= 360F) {
            }
            for (; dPitch <= -180F; dPitch += 360F) {
            }
            float dRoll = (grenade.axes.getRoll() - grenade.prevRotationRoll);
            for (; dRoll > 180F; dRoll -= 360F) {
            }
            for (; dRoll <= -180F; dRoll += 360F) {
            }
            GL11.glRotatef(180F - grenade.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(grenade.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(grenade.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
        }
        ModelBase model = grenade.type.model;
        if (model != null)
            model.render(grenade, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();

    }

    @Override
    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
        render((EntityGrenade) entity, d, d1, d2, f, f1);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        ResourceLocation texture = FlansModResourceHandler.getTexture(((EntityGrenade) entity).type);
        if (texture == null)
            return FlansModResourceHandler.getIcon(((EntityGrenade) entity).type);
        return texture;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
                return item != null && item.getItem() instanceof ItemGrenade && ((ItemGrenade) item.getItem()).type.model != null;
            default:
                break;
        }
        return false;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        if (item != null && item.getItem() instanceof ItemGrenade) {
            GrenadeType grenadeType = ((ItemGrenade) item.getItem()).type;
            if (grenadeType.model != null) {
                switch (type) {
                    case EQUIPPED: {
                        GL11.glRotatef(35F, 0F, 0F, 1F);
                        GL11.glRotatef(-5F, 0F, 1F, 0F);
                        GL11.glTranslatef(0.75F, -0.22F, -0.08F);
                        GL11.glTranslatef(0F, 0.25F, 0F);
                        break;
                    }
                    case EQUIPPED_FIRST_PERSON: {
                        idleProjection.clear();
                        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, idleProjection);
                        idleProjectionPlayer = Minecraft.getMinecraft().thePlayer;
                        GL11.glLoadIdentity();
                        FirstPersonHands.applyViewBobbing(Minecraft.getMinecraft().thePlayer, RenderGun.smoothing);
                        GL11.glTranslatef(0.32F, -0.27F, -1.0F);
                        FirstPersonHands.render(Minecraft.getMinecraft().thePlayer, true,
                                0F, -0.09F, 0.05F, -55F, 15F);
                        FirstPersonHands.render(Minecraft.getMinecraft().thePlayer, false,
                                -0.5F, -0.18F, 0.15F, -55F, -20F);
                        GL11.glScalef(0.85F, 0.85F, 0.85F);
                        break;
                    }
                    default:
                        break;
                }

                Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(grenadeType));
                ModelBase model = grenadeType.model;
                model.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);
            }
        }
        GL11.glPopMatrix();
    }

}
