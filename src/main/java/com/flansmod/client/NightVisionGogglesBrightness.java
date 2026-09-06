package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ItemNightVisionGoggles;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/** Client-only NVG gain, independent of nearby lights and the saved video gamma. */
@SideOnly(Side.CLIENT)
public final class NightVisionGogglesBrightness {
    private static boolean gammaAppliedThisFrame;
    private static boolean activeLastFrame;
    private static boolean reflectionWarningLogged;
    private static float gammaBeforeFrame;
    private static float nightVisionGamma = -1F;
    private static float lastAppliedGamma = -1F;

    private NightVisionGogglesBrightness() {
    }

    public static float getGamma() {
        if (nightVisionGamma < 0F) {
            setGamma((float)FlansMod.configFile.get("Night Vision Settings", "Gamma", 12D,
                    "Client night vision gain (1 to 16); does not change normal video brightness.").getDouble(12D));
        }
        return nightVisionGamma;
    }

    public static void setGamma(float gamma) {
        nightVisionGamma = Float.isNaN(gamma) || Float.isInfinite(gamma)
                ? 12F : MathHelper.clamp_float(gamma, 1F, 16F);
    }

    public static void saveGamma() {
        FlansMod.configFile.get("Night Vision Settings", "Gamma", 12D).set((double)getGamma());
        FlansMod.configFile.save();
    }

    public static void beginFrame(Minecraft minecraft) {
        // Recover safely if a previous render frame ended unexpectedly.
        restoreGamma(minecraft);
        // Enforce the fixed video limit before applying the separate NVG gain.
        TickHandlerClient.enforceGammaLimit(minecraft);
        boolean active = isActive(minecraft);
        if (active != activeLastFrame || active && getGamma() != lastAppliedGamma) {
            markLightmapForUpdate(minecraft);
        }
        activeLastFrame = active;
        if (active) {
            gammaBeforeFrame = minecraft.gameSettings.gammaSetting;
            lastAppliedGamma = getGamma();
            minecraft.gameSettings.gammaSetting = lastAppliedGamma;
            gammaAppliedThisFrame = true;
        }
    }

    public static void endFrame(Minecraft minecraft) {
        restoreGamma(minecraft);
    }

    private static boolean isActive(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.theWorld == null) {
            return false;
        }
        ItemStack goggles = PlayerEquipmentInventory.getStack(minecraft.thePlayer,
                PlayerEquipmentInventory.NIGHT_VISION_SLOT);
        return ItemNightVisionGoggles.isLowered(goggles)
                && NightVisionGogglesAnimation.getLoweredProgress(
                minecraft.thePlayer, 1F) >= 0.999F;
    }

    private static void restoreGamma(Minecraft minecraft) {
        if (!gammaAppliedThisFrame) {
            return;
        }
        minecraft.gameSettings.gammaSetting = gammaBeforeFrame;
        gammaAppliedThisFrame = false;
    }

    private static void markLightmapForUpdate(Minecraft minecraft) {
        if (minecraft.entityRenderer == null) {
            return;
        }
        try {
            ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class,
                    minecraft.entityRenderer, true,
                    "lightmapUpdateNeeded", "ak", "field_78536_aa");
        } catch (Throwable throwable) {
            if (!reflectionWarningLogged) {
                reflectionWarningLogged = true;
                FlansMod.logger.warn("Could not immediately refresh the GPNVG lightmap; it will refresh on the next normal lighting update.", throwable);
            }
        }
    }
}
