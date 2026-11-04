package com.flansmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

/** Skin-textured Minecraft arms placed by their wrist, shared by held utility items. */
public final class FirstPersonHands {
    private static final ModelBiped MODEL = new ModelBiped(0F);

    private FirstPersonHands() { }

    /** Vanilla 1.7.10 bob, reapplied after utility items reset the item-pose matrix. */
    public static void applyViewBobbing(EntityPlayer player, float partial) {
        if (player == null || !Minecraft.getMinecraft().gameSettings.viewBobbing) return;
        float distance = -(player.distanceWalkedModified
                + (player.distanceWalkedModified - player.prevDistanceWalkedModified) * partial);
        float yaw = player.prevCameraYaw + (player.cameraYaw - player.prevCameraYaw) * partial;
        float pitch = player.prevCameraPitch + (player.cameraPitch - player.prevCameraPitch) * partial;
        GL11.glTranslatef(MathHelper.sin(distance * (float)Math.PI) * yaw * 0.5F,
                -Math.abs(MathHelper.cos(distance * (float)Math.PI) * yaw), 0F);
        GL11.glRotatef(MathHelper.sin(distance * (float)Math.PI) * yaw * 3F, 0F, 0F, 1F);
        GL11.glRotatef(Math.abs(MathHelper.cos(distance * (float)Math.PI - 0.2F) * yaw) * 5F, 1F, 0F, 0F);
        GL11.glRotatef(pitch, 1F, 0F, 0F);
    }

    public static void render(EntityPlayer player, boolean right, float x, float y, float z, float pitch, float roll) {
        if (!(player instanceof AbstractClientPlayer) || player.isInvisible()) return;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        try {
            Minecraft.getMinecraft().getTextureManager().bindTexture(((AbstractClientPlayer) player).getLocationSkin());
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glColor4f(1F, 1F, 1F, 1F);
            GL11.glTranslatef(x, y, z);
            GL11.glRotatef(roll, 0F, 0F, 1F);
            GL11.glRotatef(pitch, 1F, 0F, 0F);
            // Turn the skin around the forearm axis without moving the wrist:
            // Minecraft's arm faces the opposite way in this camera-space pose.
            GL11.glRotatef(180F, 0F, 1F, 0F);
            // ModelBiped pivots at the shoulder; the wrist is at (+/-1, 10, 0)
            // model pixels. Move it to the grip before applying the arm pose.
            GL11.glTranslatef(right ? 0.0625F : -0.0625F, -0.625F, 0F);
            ModelRenderer arm = right ? MODEL.bipedRightArm : MODEL.bipedLeftArm;
            arm.rotationPointX = arm.rotationPointY = arm.rotationPointZ = 0F;
            arm.rotateAngleX = arm.rotateAngleY = arm.rotateAngleZ = 0F;
            arm.render(0.0625F);
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }
}
