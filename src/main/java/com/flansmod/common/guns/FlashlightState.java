package com.flansmod.common.guns;

import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/** Server-owned, per-gun flashlight/laser state shared through the gun ItemStack NBT. */
public final class FlashlightState {
    private static final String ENABLED_TAG = "FMURFlashlightOn";

    private FlashlightState() {
    }

    public static boolean hasFlashlight(ItemStack stack) {
        if (stack == null || !(stack.getItem() instanceof ItemGun)) {
            return false;
        }
        GunType gunType = ((ItemGun)stack.getItem()).type;
        for (AttachmentType attachment : gunType.getCurrentAttachments(stack)) {
            if (attachment != null && (attachment.flashlight || attachment.isLaserPointer)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnabled(ItemStack stack) {
        // Old and newly assembled guns default on; preserve an explicit player toggle.
        return hasFlashlight(stack) && (!stack.hasTagCompound()
                || !stack.getTagCompound().hasKey(ENABLED_TAG)
                || stack.getTagCompound().getBoolean(ENABLED_TAG));
    }

    public static boolean hasEnabledLaser(ItemStack stack) {
        if (!isEnabled(stack)) return false;
        GunType gunType = ((ItemGun) stack.getItem()).type;
        for (AttachmentType attachment : gunType.getCurrentAttachments(stack)) {
            if (attachment != null && attachment.isLaserPointer) return true;
        }
        return false;
    }

    public static void setEnabled(ItemStack stack, boolean enabled) {
        if (stack == null) {
            return;
        }
        if (!stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
        }
        stack.getTagCompound().setBoolean(ENABLED_TAG, enabled && hasFlashlight(stack));
    }
}
