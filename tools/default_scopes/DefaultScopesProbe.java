package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.guns.type.ShootableType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;

public final class DefaultScopesProbe {
    private static boolean launched;
    private static int ticks;
    private static GunType gun;
    private static ItemStack weapon;

    public static void tick(Minecraft mc) {
        if (!launched && mc.currentScreen instanceof GuiMainMenu) {
            launched = true;
            mc.gameSettings.pauseOnLostFocus = false;
            mc.gameSettings.showInventoryAchievementHint = false;
            mc.gameSettings.renderDistanceChunks = 4;
            mc.launchIntegratedServer("Default Scope Check", "Default Scope Check", new WorldSettings(790L,
                    WorldSettings.GameType.CREATIVE, false, false, WorldType.FLAT).enableCommands());
        }
        if (mc.thePlayer == null || mc.theWorld == null || mc.currentScreen != null || ++ticks < 80) return;
        if (weapon == null) {
            DefaultScopeCheck.verify("c7a2", "c79");
            DefaultScopeCheck.verify("sketchDragunovSVD", "pso1");
            equip("c7a2", "556x4530rdmag");
        }
        if (ticks == 200) equip("sketchDragunovSVD", "762x5410rdmag");
        if (ticks == 155 || ticks == 265) {
            NBTTagCompound tag = new NBTTagCompound();
            new ItemStack(AttachmentType.getAttachment("acogta01").item).writeToNBT(tag);
            weapon.stackTagCompound.getCompoundTag("attachments").setTag("scope", tag);
        }
        if (ticks == 175 || ticks == 290)
            weapon.stackTagCompound.getCompoundTag("attachments").removeTag("scope");
        mc.thePlayer.inventory.setInventorySlotContents(mc.thePlayer.inventory.currentItem, weapon);
        mc.gameSettings.viewBobbing = false;
        mc.thePlayer.rotationYaw = mc.thePlayer.prevRotationYaw = 0;
        mc.thePlayer.rotationPitch = mc.thePlayer.prevRotationPitch = 0;
        mc.thePlayer.prevRenderArmPitch = mc.thePlayer.renderArmPitch = 0;
        mc.thePlayer.prevRenderArmYaw = mc.thePlayer.renderArmYaw = 0;
        FlansModClient.lastMouseOffsetX = FlansModClient.mouseOffsetX = 0;
        FlansModClient.lastMouseOffsetY = FlansModClient.mouseOffsetY = 0;
        boolean ads = (ticks >= 121 && ticks < 200) || ticks >= 231;
        FlansModClient.currentScope = ads ? gun.getCurrentScope(weapon) : null;
        FlansModClient.lastZoomProgress = FlansModClient.zoomProgress = ads ? 1 : 0;
        switch (ticks) {
            case 120: save(mc, "c7-hip"); break;
            case 150: save(mc, "c7-default"); break;
            case 170: save(mc, "c7-alternate"); break;
            case 195: save(mc, "c7-restored"); break;
            case 225: save(mc, "svd-hip"); break;
            case 260: save(mc, "svd-default"); break;
            case 285: save(mc, "svd-alternate"); break;
            case 310: save(mc, "svd-restored"); break;
            case 315: mc.shutdown(); break;
        }
    }

    private static void equip(String name, String ammoName) {
        gun = GunType.getGun(name);
        weapon = new ItemStack(gun.item); gun.checkForTags(weapon);
        ShootableType ammo = ShootableType.getShootableType(ammoName);
        if (ammo == null || !gun.isAmmo(ammo)) throw new AssertionError("Ammo " + name);
        ((ItemGun)gun.item).setBulletItemStack(weapon, new ItemStack(ammo.item), 0);
    }

    private static void save(Minecraft mc, String name) {
        System.out.println("Default scope capture " + name + " " + ScreenShotHelper.saveScreenshot(mc.mcDataDir,
                "default-scope-" + name + ".png", mc.displayWidth, mc.displayHeight, mc.getFramebuffer()));
    }
}
