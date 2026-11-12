package com.flansmod.client.model;

import com.flansmod.common.guns.InventoryGunModTable;
import com.flansmod.common.guns.SlotGun;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/** Runs against registered content in the isolated Forge fixture. */
public final class DefaultScopeCheck {
    public static void verify(String name, String fallbackName) {
        GunType gun = GunType.getGun(name);
        AttachmentType fallback = AttachmentType.getAttachment(fallbackName);
        AttachmentType other = AttachmentType.getAttachment("acogta01");
        require(gun != null && fallback != null && other != null, "Content bindings");
        require(fallbackName.equals(gun.defaultScopeName) && gun.fixedScopeName == null, "Definition parser");
        require(gun.allowScopeAttachments, "Scope slot enabled");
        ItemStack stack = new ItemStack(gun.item);
        gun.checkForTags(stack);
        stack.stackTagCompound.setTag("ammo", new NBTTagList());
        NBTTagCompound before = (NBTTagCompound) stack.stackTagCompound.copy();
        expect(gun, stack, fallback);
        require(before.equals(stack.stackTagCompound), "Fallback must not write an item into NBT");
        require(gun.getAttachmentItemStack(stack, "scope") == null, "No removable default item");
        int count = 0;
        for (AttachmentType attachment : gun.getCurrentAttachments(stack))
            if (attachment == fallback) count++;
        require(count == 1, "Default counted once in active attachments");

        InventoryGunModTable table = new InventoryGunModTable();
        table.setInventorySlotContents(0, stack);
        require(table.getStackInSlot(2) == null, "Gunsmith cannot extract a free default optic");
        SlotGun gunSlot = new SlotGun(table, 0, 0, 0, null);
        SlotGun scopeSlot = new SlotGun(table, 2, 0, 0, gunSlot);
        if (name.equals("sketchDragunovSVD")) {
            SlotGun gripSlot = new SlotGun(table, 4, 0, 0, gunSlot);
            require(!gun.allowAllAttachments && !gripSlot.isItemValid(
                    new ItemStack(AttachmentType.getAttachment("verticalgrip").item)),
                    "Dragunov only opens optic compatibility");
        }
        ItemStack replacement = new ItemStack(other.item);
        replacement.stackTagCompound = new NBTTagCompound();
        replacement.stackTagCompound.setInteger("defaultScopeTest", 17);
        require(scopeSlot.isItemValid(replacement), "Gunsmith accepts another optic");
        table.setInventorySlotContents(2, replacement);
        expect(gun, stack, other);
        require(gun.getScopeItemStack(stack).stackTagCompound.getInteger("defaultScopeTest") == 17,
                "Preserve fitted scope metadata");
        ItemStack saved = ItemStack.loadItemStackFromNBT(stack.writeToNBT(new NBTTagCompound()));
        expect(gun, saved, other);
        table.setInventorySlotContents(2, null);
        expect(gun, stack, fallback);
        require(table.getStackInSlot(2) == null && gun.getAttachmentItemStack(stack, "scope") == null,
                "Removing replacement restores virtual default only");
        expect(gun, ItemStack.loadItemStackFromNBT(stack.writeToNBT(new NBTTagCompound())), fallback);

        String defaultName = gun.defaultScopeName;
        try {
            gun.defaultScopeName = "missing_default_scope_test";
            require(gun.getScope(stack) == null && gun.getCurrentScope(stack) == gun
                    && gun.getScopeItemStack(stack) == null, "Missing default falls back to gun sights");
            gun.defaultScopeName = "silencer";
            require(gun.getScope(stack) == null, "Non-optic default rejected");
            gun.defaultScopeName = null;
            require(gun.getScope(stack) == null, "Unconfigured legacy gun stays bare");
            gun.fixedScopeName = fallbackName;
            table.setInventorySlotContents(2, replacement);
            expect(gun, stack, fallback);
            require(gun.getAttachmentItemStack(stack, "scope").getItem() == other.item,
                    "FixedScope still overrides without replacing saved attachment");
        } finally {
            gun.defaultScopeName = defaultName;
            gun.fixedScopeName = null;
        }
        System.out.println("PASS DefaultScope: " + name + " default / override / removal / NBT / gunsmith / legacy");
    }

    private static void expect(GunType gun, ItemStack stack, AttachmentType scope) {
        require(gun.getScope(stack) == scope && gun.getCurrentScope(stack) == scope, "Effective scope");
        require(gun.getScopeItemStack(stack) != null && gun.getScopeItemStack(stack).getItem() == scope.item,
                "Rendered scope item matches effective optic");
    }

    private static void require(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
}
