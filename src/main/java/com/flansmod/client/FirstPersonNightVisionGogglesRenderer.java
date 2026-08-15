package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ItemNightVisionGoggles;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

/** Camera-space GPNVG flip assembly shown only while it is moving. */
@SideOnly(Side.CLIENT)
public final class FirstPersonNightVisionGogglesRenderer {
    private static final float PIVOT_X = 5.5F / 16F;
    private static final float PIVOT_Y = 4.88F / 16F;
    private static final float PIVOT_Z = 0F;
    private static final float MODEL_SCALE = 2.25F;
    private static final float RAISED_ANGLE = 110F;
    // Keep the upper bridge clipped by the top of the viewport so the moving
    // assembly reads as attached to a helmet mount instead of floating.
    private static final float FIRST_PERSON_OFFSET_Y = -0.065F;
    private static IModelCustom flipModel;

    private FirstPersonNightVisionGogglesRenderer() {
    }

    public static void render(Minecraft minecraft, float partialTicks) {
        if (minecraft.thePlayer == null || minecraft.gameSettings.thirdPersonView != 0) {
            return;
        }
        ItemStack gogglesStack = PlayerEquipmentInventory.getStack(minecraft.thePlayer,
                PlayerEquipmentInventory.NIGHT_VISION_SLOT);
        if (gogglesStack == null || !(gogglesStack.getItem() instanceof ItemNightVisionGoggles)) {
            return;
        }
        ItemNightVisionGoggles goggles = (ItemNightVisionGoggles)gogglesStack.getItem();

        float progress = NightVisionGogglesAnimation.getLoweredProgress(
                minecraft.thePlayer, partialTicks);
        if (progress <= 0.001F || progress >= 0.999F) {
            return;
        }

        if (flipModel == null) {
            flipModel = AdvancedModelLoader.loadModel(new ResourceLocation(
                    FlansMod.MODID, "models/gpnvg/GPNVG_Flip_runtime.obj"));
        }

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        Project.gluPerspective(minecraft.gameSettings.fovSetting,
                (float)minecraft.displayWidth / (float)minecraft.displayHeight,
                0.05F, 10F);

        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        try {
            // The transition model represents hardware directly in front of the
            // camera, so it must draw over the already-rendered hand and world.
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_CULL_FACE);
            int lightX = MathHelper.floor_double(minecraft.thePlayer.posX);
            int lightY = MathHelper.floor_double(minecraft.thePlayer.posY
                    + minecraft.thePlayer.getEyeHeight());
            int lightZ = MathHelper.floor_double(minecraft.thePlayer.posZ);
            float modelBrightness = 1F;
            if (minecraft.theWorld != null) {
                float blockLight = minecraft.theWorld.getSavedLightValue(
                        EnumSkyBlock.Block, lightX, lightY, lightZ) / 15F;
                float skyLight = minecraft.theWorld.getSavedLightValue(
                        EnumSkyBlock.Sky, lightX, lightY, lightZ) / 15F;
                float daylight = skyLight * minecraft.theWorld.getSunBrightness(partialTicks);
                float environmentLight = Math.max(blockLight, daylight);
                modelBrightness = 0.10F + Math.min(1F, environmentLight) * 0.90F;
            }
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_MODE, GL11.GL_MODULATE);
            GL11.glColor4f(modelBrightness, modelBrightness, modelBrightness, 1F);
            minecraft.renderEngine.bindTexture(new ResourceLocation(
                    FlansMod.MODID, goggles.getModelTexturePath()));

            GL11.glTranslatef(0F, FIRST_PERSON_OFFSET_Y, 0F);
            // Camera space already uses +Y as up. The third-person armour
            // renderer's 180-degree Z correction would invert the model here.
            GL11.glRotatef(90F, 0F, 1F, 0F);

            GL11.glTranslatef(PIVOT_X, PIVOT_Y, PIVOT_Z);
            GL11.glScalef(MODEL_SCALE, MODEL_SCALE, MODEL_SCALE);
            GL11.glRotatef(RAISED_ANGLE * (1F - progress), 0F, 0F, 1F);
            GL11.glTranslatef(-PIVOT_X, -PIVOT_Y, -PIVOT_Z);
            flipModel.renderAll();
        } finally {
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopAttrib();
        }
    }
}
