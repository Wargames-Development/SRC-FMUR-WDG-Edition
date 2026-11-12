package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.BFMCpack.ModelC25;
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
public final class C25Probe {
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
        if (model instanceof ModelC25 && ticks >= 242 && !measured)
            baseMatrix = matrix(org.lwjgl.opengl.GL11.GL_MODELVIEW_MATRIX);
    }

    public static void measure(ModelGun model) {
        if (!(model instanceof ModelC25) || baseMatrix == null || measured) return;
        measured = true;
        System.out.println("C25 BASE " + java.util.Arrays.toString(baseMatrix));
        System.out.println("C25 VIEW " + java.util.Arrays.toString(matrix(org.lwjgl.opengl.GL11.GL_MODELVIEW_MATRIX)));
        System.out.println("C25 PROJ " + java.util.Arrays.toString(matrix(org.lwjgl.opengl.GL11.GL_PROJECTION_MATRIX)));
    }

    public static void tick(Minecraft mc) {
        if (!launched && mc.currentScreen instanceof GuiMainMenu) {
            launched = true;
            mc.gameSettings.pauseOnLostFocus = false;
            mc.gameSettings.showInventoryAchievementHint = false;
            mc.gameSettings.renderDistanceChunks = 4;
            mc.launchIntegratedServer("C25 Presentation", "C25 Presentation", new WorldSettings(717L,
                    WorldSettings.GameType.CREATIVE, false, false, WorldType.FLAT).enableCommands());
        }
        if (mc.thePlayer == null || mc.theWorld == null || mc.currentScreen != null) return;
        if (++ticks < 80) return;
        if (weapon == null) {
            gun = GunType.getGun("c25");
            if (gun == null || !(gun.model instanceof ModelC25) || !gun.pictureInPicture || Math.abs(gun.magnification - 1F) > .001F) throw new AssertionError("C25 binding");
            AttachmentType c25scope = AttachmentType.getAttachment("c25scope");
            if (c25scope == null || !c25scope.pictureInPicture || Math.abs(c25scope.magnification - 1F) > .001F)
                throw new AssertionError("C25Scope PiP binding");
            com.flansmod.common.FlansMod.switchedFOV = false;
            if (gun.getZoomFactor() != 1F || c25scope.getZoomFactor() != 1F)
                throw new AssertionError("VMR low magnification");
            com.flansmod.common.FlansMod.switchedFOV = true;
            if (gun.getZoomFactor() != 6F || c25scope.getZoomFactor() != 6F)
                throw new AssertionError("VMR high magnification");
            com.flansmod.common.FlansMod.switchedFOV = false;
            weapon = new ItemStack(gun.item); gun.checkForTags(weapon);
            if (gun.getScope(weapon) != null || gun.getCurrentScope(weapon) != gun)
                throw new AssertionError("Fresh C25 must use its factory scope without an attachment");
            NBTTagCompound scope = new NBTTagCompound(); new ItemStack(c25scope.item).writeToNBT(scope);
            weapon.stackTagCompound.getCompoundTag("attachments").setTag("scope", scope);
            if (!gun.allowAllAttachments || !gun.allowBarrelAttachments || !gun.allowGripAttachments
                    || !gun.allowGadgetAttachments || !gun.allowLaserPointerAttachments)
                throw new AssertionError("C25 attachment slots");
            attach("grip", "verticalgrip");
            attach("gadget", "1mwlaser");
            attach("barrel", "silencer");
            if (gun.getGrip(weapon) == null || gun.getGadget(weapon) == null || gun.getBarrel(weapon) == null)
                throw new AssertionError("C25 saved attachment lookup");
            ShootableType ammo = ShootableType.getShootableType("556x4530rdmag");
            if (ammo == null || !gun.isAmmo(ammo)) throw new AssertionError("C25 ammunition");
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
        boolean ads = ticks >= 121 && ticks < 155;
        FlansModClient.currentScope = ads ? gun.getCurrentScope(weapon) : null;
        FlansModClient.lastZoomProgress = FlansModClient.zoomProgress = ads ? Math.min((ticks-121)/15F, 1) : 0;
        GunAnimations a = FlansModClient.getGunAnimations(mc.thePlayer, false);
        switch (ticks) {
            case 120: save(mc, "hip"); break;
            case 129: save(mc, "blend"); break;
            case 140: save(mc, "vmr-attached-1x"); break;
            case 141: com.flansmod.common.FlansMod.switchedFOV = true; break;
            case 150: save(mc, "vmr-attached-6x"); break;
            case 151: com.flansmod.common.FlansMod.switchedFOV = false; break;
            case 155: a.doReload(weapon, mc.thePlayer.inventory.currentItem, 60, 0, 0, 0, 0, 1, false, false, gun.reloadSound, false); break;
            case 180: save(mc, "reload"); break;
            case 220: mc.gameSettings.thirdPersonView = 2; break;
            case 225: save(mc, "third"); break;
            case 230: mc.gameSettings.thirdPersonView = 0;
                weapon.stackTagCompound.getCompoundTag("attachments").removeTag("scope"); break;
            case 240: FlansModClient.currentScope = gun; break;
            case 245: save(mc, "vmr-factory-1x"); break;
            case 246: com.flansmod.common.FlansMod.switchedFOV = true; break;
            case 250:
                weapon.stackTagCompound.getCompoundTag("attachments").removeTag("barrel");
                weapon.stackTagCompound.getCompoundTag("attachments").removeTag("grip");
                weapon.stackTagCompound.getCompoundTag("attachments").removeTag("gadget");
                break;
            case 260: save(mc, "vmr-factory-6x"); break;
            case 265: mc.shutdown(); break;
        }
        if (ticks >= 240) {
            FlansModClient.currentScope = gun;
            FlansModClient.lastZoomProgress = FlansModClient.zoomProgress = 1;
        }
    }

    private static void attach(String slot, String name) {
        AttachmentType type = AttachmentType.getAttachment(name);
        if (type == null || !gun.isAttachmentCompatible(type))
            throw new AssertionError("C25 incompatible " + name);
        NBTTagCompound tag = new NBTTagCompound(); new ItemStack(type.item).writeToNBT(tag);
        weapon.stackTagCompound.getCompoundTag("attachments").setTag(slot, tag);
    }

    private static void save(Minecraft mc, String label) {
        System.out.println("C25 capture " + label + " " + ScreenShotHelper.saveScreenshot(mc.mcDataDir,
                "c25-" + label + ".png", mc.displayWidth, mc.displayHeight, mc.getFramebuffer()));
    }
}
