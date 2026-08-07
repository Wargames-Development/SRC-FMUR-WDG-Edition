package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityChemLight;
import com.flansmod.common.guns.FlashlightState;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.teams.ItemNightVisionGoggles;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumSkyBlock;

/**
 * Supplies adaptive NVG illumination without a potion effect. Open skylight
 * raises gamma toward Minecraft's bright setting, while enclosed spaces retain
 * their real darkness. The player's saved setting is never changed.
 */
@SideOnly(Side.CLIENT)
public final class NightVisionGogglesBrightness {
    private static final float MAX_SKYLIGHT_GAMMA = 1F;
    private static final float CHEMLIGHT_NVG_RADIUS = 10F;

    private static boolean gammaAppliedThisFrame;
    private static boolean activeLastFrame;
    private static boolean reflectionWarningLogged;
    private static float gammaBeforeFrame;
    private static float lastAmplifiedExposure = -1F;

    private NightVisionGogglesBrightness() {
    }

    public static void beginFrame(Minecraft minecraft) {
        // Recover safely if a previous render frame ended unexpectedly.
        restoreGamma(minecraft);

        boolean active = isActive(minecraft);
        if (active != activeLastFrame) {
            markLightmapForUpdate(minecraft);
            activeLastFrame = active;
        }

        if (active) {
            gammaBeforeFrame = minecraft.gameSettings.gammaSetting;
            float skyExposure = getSkyExposure(minecraft);
            float chemLightExposure = getChemLightExposure(minecraft);
            float amplifiedExposure = Math.max(skyExposure, chemLightExposure);
            if (Math.abs(amplifiedExposure - lastAmplifiedExposure) > 0.01F) {
                markLightmapForUpdate(minecraft);
                lastAmplifiedExposure = amplifiedExposure;
            }
            minecraft.gameSettings.gammaSetting = gammaBeforeFrame
                    + Math.max(0F, MAX_SKYLIGHT_GAMMA - gammaBeforeFrame) * amplifiedExposure;
            gammaAppliedThisFrame = true;
        } else {
            lastAmplifiedExposure = -1F;
        }
    }

    public static void endFrame(Minecraft minecraft) {
        restoreGamma(minecraft);
    }

    private static boolean isActive(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.theWorld == null) {
            return false;
        }
        ItemStack boots = minecraft.thePlayer.getEquipmentInSlot(1);
        return ItemNightVisionGoggles.isLowered(boots)
                && NightVisionGogglesAnimation.getLoweredProgress(
                minecraft.thePlayer, 1F) >= 0.999F;
    }

    /** Raw propagated skylight at eye level: 1 outdoors, approaching 0 underground. */
    public static float getSkyExposure(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.theWorld == null) {
            return 0F;
        }
        int x = MathHelper.floor_double(minecraft.thePlayer.posX);
        int y = MathHelper.floor_double(minecraft.thePlayer.posY
                + minecraft.thePlayer.getEyeHeight());
        int z = MathHelper.floor_double(minecraft.thePlayer.posZ);
        int skyLight = minecraft.theWorld.getSavedLightValue(EnumSkyBlock.Sky, x, y, z);
        return Math.max(0F, Math.min(1F, skyLight / 15F));
    }

    /** Propagated artificial/block light at eye level, used for indoor NVG gain. */
    public static float getLocalLightExposure(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.theWorld == null) {
            return 0F;
        }
        int x = MathHelper.floor_double(minecraft.thePlayer.posX);
        int y = MathHelper.floor_double(minecraft.thePlayer.posY
                + minecraft.thePlayer.getEyeHeight());
        int z = MathHelper.floor_double(minecraft.thePlayer.posZ);
        int blockLight = minecraft.theWorld.getSavedLightValue(EnumSkyBlock.Block, x, y, z);
        return Math.max(0F, Math.min(1F, blockLight / 15F));
    }

    /** Nearby chemlight influence used to boost gain without torch-like overload. */
    public static float getChemLightExposure(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.theWorld == null) {
            return 0F;
        }
        Vec3 eyes = Vec3.createVectorHelper(minecraft.thePlayer.posX,
                minecraft.thePlayer.posY + minecraft.thePlayer.getEyeHeight(),
                minecraft.thePlayer.posZ);
        float strongest = 0F;
        for (Object object : minecraft.theWorld.loadedEntityList) {
            if (!(object instanceof EntityChemLight)) {
                continue;
            }
            EntityChemLight chemLight = (EntityChemLight)object;
            if (chemLight.isDead || chemLight.getRemainingLife() <= 0) {
                continue;
            }
            float distance = minecraft.thePlayer.getDistanceToEntity(chemLight);
            if (distance > CHEMLIGHT_NVG_RADIUS) {
                continue;
            }
            Vec3 light = Vec3.createVectorHelper(chemLight.posX,
                    chemLight.posY + 0.10D, chemLight.posZ);
            MovingObjectPosition obstruction = minecraft.theWorld.rayTraceBlocks(eyes, light);
            if (obstruction == null) {
                strongest = 1F;
                break;
            }
        }
        return Math.max(0F, Math.min(1F, strongest));
    }

    /**
     * Direct exposure from another player's synchronised weapon flashlight.
     * Both the beam aim and the victim's view direction matter, and solid blocks
     * stop the effect before it reaches the goggles.
     */
    public static float getFlashlightExposure(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.theWorld == null) {
            return 0F;
        }
        EntityPlayer viewer = minecraft.thePlayer;
        Vec3 viewerEyes = Vec3.createVectorHelper(viewer.posX,
                viewer.posY + viewer.getEyeHeight(), viewer.posZ);
        Vec3 viewerLook = viewer.getLook(1F);
        float strongest = 0F;

        for (Object object : minecraft.theWorld.playerEntities) {
            if (!(object instanceof EntityPlayer) || object == viewer) {
                continue;
            }
            EntityPlayer source = (EntityPlayer)object;
            ItemStack heldGun = source.getCurrentEquippedItem();
            if (!FlashlightState.isEnabled(heldGun)
                    || !(heldGun.getItem() instanceof ItemGun)) {
                continue;
            }

            GunType gunType = ((ItemGun)heldGun.getItem()).type;
            float range = 0F;
            float strength = 0F;
            for (AttachmentType attachment : gunType.getCurrentAttachments(heldGun)) {
                if (attachment != null && attachment.flashlight) {
                    range = Math.max(range, attachment.flashlightRange);
                    strength = Math.max(strength, attachment.flashlightStrength / 15F);
                }
            }
            if (range <= 0F || strength <= 0F) {
                continue;
            }

            Vec3 sourceEyes = Vec3.createVectorHelper(source.posX,
                    source.posY + source.getEyeHeight(), source.posZ);
            Vec3 beamToViewer = viewerEyes.subtract(sourceEyes);
            double distance = beamToViewer.lengthVector();
            if (distance <= 0.001D || distance > range) {
                continue;
            }
            Vec3 beamDirection = beamToViewer.normalize();
            double sourceAim = source.getLook(1F).dotProduct(beamDirection);
            if (sourceAim <= 0.982D) {
                continue;
            }
            Vec3 viewerToSource = sourceEyes.subtract(viewerEyes).normalize();
            double viewerFacing = viewerLook.dotProduct(viewerToSource);
            if (viewerFacing <= 0.10D
                    || minecraft.theWorld.rayTraceBlocks(sourceEyes, viewerEyes) != null) {
                continue;
            }

            float beamCenter = clamp01((float)((sourceAim - 0.982D) / 0.018D));
            float facing = clamp01((float)((viewerFacing - 0.10D) / 0.70D));
            float distanceGain = 1F - 0.35F * (float)(distance / range);
            strongest = Math.max(strongest,
                    beamCenter * facing * distanceGain * strength);
        }
        return clamp01(strongest);
    }

    private static float clamp01(float value) {
        return Math.max(0F, Math.min(1F, value));
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
