package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.BFMCpack.ModelASH12;
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

/** Isolated presentation probe: creates its own creative world and exits. */
public final class ASH12Probe {
    private static boolean launched;
    private static int ticks;
    private static ItemStack weapon;
    private static GunType gun;
    private static boolean measured;
    private static float[] baseMatrix;

    private static float[] matrix(int state) {
        java.nio.FloatBuffer buffer = org.lwjgl.BufferUtils.createFloatBuffer(16);
        org.lwjgl.opengl.GL11.glGetFloat(state, buffer);
        float[] result = new float[16]; buffer.get(result); return result;
    }

    public static void base(ModelGun model) {
        if (model instanceof ModelASH12 && ticks >= 135 && !measured)
            baseMatrix = matrix(org.lwjgl.opengl.GL11.GL_MODELVIEW_MATRIX);
    }

    public static void measure(ModelGun model) {
        if (!(model instanceof ModelASH12) || baseMatrix == null || measured) return;
        measured = true;
        System.out.println("ASH12 BASE " + java.util.Arrays.toString(baseMatrix));
        System.out.println("ASH12 VIEW " + java.util.Arrays.toString(matrix(org.lwjgl.opengl.GL11.GL_MODELVIEW_MATRIX)));
        System.out.println("ASH12 PROJ " + java.util.Arrays.toString(matrix(org.lwjgl.opengl.GL11.GL_PROJECTION_MATRIX)));
    }

    public static void tick(Minecraft mc) {
        if (!launched && mc.currentScreen instanceof GuiMainMenu) {
            launched = true;
            mc.gameSettings.pauseOnLostFocus = false;
            mc.gameSettings.showInventoryAchievementHint = false;
            mc.gameSettings.renderDistanceChunks = 4;
            mc.launchIntegratedServer("ASH12 Presentation", "ASH12 Presentation", new WorldSettings(717L,
                    WorldSettings.GameType.CREATIVE, false, false, WorldType.FLAT).enableCommands());
        }
        if (mc.thePlayer == null || mc.theWorld == null || mc.currentScreen != null) return;
        if (++ticks < 80) return;
        if (weapon == null) {
            gun = GunType.getGun("ash12");
            if (gun == null || !(gun.model instanceof ModelASH12)) throw new AssertionError("ASH12 binding");
            if (gun.model.attachmentScopeModel != gun.model.defaultScopeModel)
                throw new AssertionError("ASH12 carry handle missing in attached-scope path");
            weapon = new ItemStack(gun.item); gun.checkForTags(weapon);
            ShootableType ammo = ShootableType.getShootableType("127x5520rdmag");
            if (ammo == null || !gun.isAmmo(ammo)) throw new AssertionError("ASH12 ammunition");
            ((ItemGun)gun.item).setBulletItemStack(weapon, new ItemStack(ammo.item), 0);
        }
        mc.thePlayer.inventory.setInventorySlotContents(mc.thePlayer.inventory.currentItem, weapon);
        mc.gameSettings.viewBobbing = false;
        mc.thePlayer.rotationYaw = mc.thePlayer.prevRotationYaw = 0;
        mc.thePlayer.rotationPitch = mc.thePlayer.prevRotationPitch = 0;
        mc.thePlayer.prevRenderArmPitch = mc.thePlayer.renderArmPitch = 0;
        mc.thePlayer.prevRenderArmYaw = mc.thePlayer.renderArmYaw = 0;
        mc.ingameGUI.getChatGUI().clearChatMessages();
        FlansModClient.lastMouseOffsetX = FlansModClient.mouseOffsetX = 0;
        FlansModClient.lastMouseOffsetY = FlansModClient.mouseOffsetY = 0;
        boolean ads = (ticks >= 121 && ticks < 151) || ticks >= 240;
        FlansModClient.currentScope = ads ? gun.getCurrentScope(weapon) : null;
        FlansModClient.lastZoomProgress = FlansModClient.zoomProgress = ads ? 1 : 0;
        GunAnimations a = FlansModClient.getGunAnimations(mc.thePlayer, false);
        if (ticks >= 105 && ticks <= 115) a.lastGunSlide = a.gunSlide = 1F;
        if (ticks == 116) a.lastGunSlide = a.gunSlide = 0F;
        switch (ticks) {
            case 110: save(mc, "bolt-open"); break;
            case 120: save(mc, "hip"); break;
            case 140: save(mc, "bare-ads"); break;
            case 145: attach("scope", "holo"); attach("grip", "verticalgrip"); break;
            case 150: save(mc, "holo-grip-ads"); break;
            case 153: FlansModClient.currentScope = null;
                FlansModClient.lastZoomProgress = FlansModClient.zoomProgress = 0;
                save(mc, "holo-grip-hip"); break;
            case 155: a.doReload(weapon, mc.thePlayer.inventory.currentItem, 70, 0, 0, 0, 0, 1, false, false, gun.reloadSound, false); break;
            case 180: save(mc, "reload"); break;
            case 225: mc.gameSettings.thirdPersonView = 2; break;
            case 230: save(mc, "third"); break;
            case 235: mc.gameSettings.thirdPersonView = 0; attach("scope", "reflex"); break;
            case 250: save(mc, "reflex-ads"); break;
            case 260: mc.shutdown(); break;
        }
    }

    private static void attach(String slot, String name) {
        AttachmentType type = AttachmentType.getAttachment(name);
        if (type == null || !gun.isAttachmentCompatible(type))
            throw new AssertionError("ASH12 incompatible " + name);
        NBTTagCompound tag = new NBTTagCompound(); new ItemStack(type.item).writeToNBT(tag);
        weapon.stackTagCompound.getCompoundTag("attachments").setTag(slot, tag);
    }

    private static void save(Minecraft mc, String label) {
        System.out.println("ASH12 capture " + label + " " + ScreenShotHelper.saveScreenshot(mc.mcDataDir,
                "ash12-" + label + ".png", mc.displayWidth, mc.displayHeight, mc.getFramebuffer()));
    }
}
