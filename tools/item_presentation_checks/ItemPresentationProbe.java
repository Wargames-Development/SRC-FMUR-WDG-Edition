package com.flansmod.checks;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.item.ItemAttachment;
import com.flansmod.common.guns.item.ItemBullet;
import com.flansmod.common.guns.item.ItemGrenade;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

/** Opt-in development-client check; never packaged into the production mod. */
@Mod(modid = "fmurpresentationcheck", name = "FMUR Presentation Check", version = "1",
        dependencies = "required-after:flansmod")
public final class ItemPresentationProbe {
    private static void require(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    @Mod.EventHandler
    public void verify(FMLPostInitializationEvent event) {
        require(!FlansMod.attachmentItems.isEmpty() && !FlansMod.bulletItems.isEmpty(), "Content packs did not load");
        for (ItemAttachment item : FlansMod.attachmentItems)
            require(item.getCreativeTab() == FlansMod.tabFlanAttachments, "Attachment in wrong tab: " + item.getUnlocalizedName());
        for (ItemBullet item : FlansMod.bulletItems)
            require(item.getCreativeTab() == (item.type.hideFromCreative ? null : FlansMod.tabFlanAmmo),
                    "Ammo in wrong tab: " + item.getUnlocalizedName());
        int disabled = 0;
        for (InfoType type : InfoType.infoTypes) {
            if (!type.createItem) {
                disabled++;
                require(type.item == null && GameRegistry.findItem("flansmod", type.shortName) == null,
                        "Disabled definition still registered: " + type.shortName);
            } else if (type.hideFromCreative && type.item != null) {
                require(type.item.getCreativeTab() == null, "Hidden item still in creative: " + type.shortName);
            }
        }
        require(disabled == 34, "Expected defibrillator plus 33 unused ammo definitions, got " + disabled);
        require(FlansMod.flag.getCreativeTab() == null && FlansMod.spawner.getCreativeTabToDisplayOn() == null
                && FlansMod.soldierSpawner.getCreativeTab() == null && FlansMod.corpseSpawner.getCreativeTab() == null,
                "Administrative items still in creative");
        List<ItemStack> spawners = new ArrayList<ItemStack>();
        FlansMod.spawner.getSubBlocks(Item.getItemFromBlock(FlansMod.spawner), FlansMod.tabFlanTeams, spawners);
        require(spawners.isEmpty(), "Spawner variants still listed");
        int launcherRounds = 0;
        for (ItemGrenade item : FlansMod.grenadeItems) {
            if (item.type.hideFromCreative) continue;
            boolean ammoRound = "Ammo".equals(item.type.inventoryCategory);
            require(item.getCreativeTab() == (ammoRound ? FlansMod.tabFlanAmmo : FlansMod.tabFlanGadgets),
                    "Grenade or launcher round in wrong tab: " + item.type.shortName);
            if (ammoRound) launcherRounds++;
        }
        require(launcherRounds >= 6, "Launcher grenades not moved to ammunition");
        for (GunType gun : GunType.gunList) {
            if (!gun.createItem) continue;
            for (com.flansmod.common.guns.type.ShootableType ammoType : gun.ammo)
                require(ammoType.item != null || ammoType instanceof com.flansmod.common.guns.type.BulletType
                                && ((com.flansmod.common.guns.type.BulletType) ammoType).internalProjectile,
                        "Active gun lost ammo: " + gun.shortName + " -> " + ammoType.shortName);
        }
        List<ItemStack> catalog = new ArrayList<ItemStack>();
        for (CreativeTabs tab : new CreativeTabs[]{FlansMod.tabFlanGuns, FlansMod.tabFlanAmmo,
                FlansMod.tabFlanGadgets, FlansMod.tabFlanTeams})
            tab.displayAllReleventItems(catalog);
        for (ItemStack stack : catalog) {
            Item listed = stack.getItem();
            require(listed != FlansMod.flag && listed != Item.getItemFromBlock(FlansMod.spawner)
                    && listed != FlansMod.soldierSpawner && listed != FlansMod.corpseSpawner,
                    "Administrative item leaked into actual creative catalog");
            if (listed instanceof com.flansmod.common.types.IFlanItem)
                require(!((com.flansmod.common.types.IFlanItem) listed).getInfoType().hideFromCreative,
                        "Hidden pack item leaked into actual creative catalog");
        }
        require(FlansMod.handheldFlashlight.getCreativeTab() == FlansMod.tabFlanGuns, "Flashlight in wrong tab");
        Item table = Item.getItemFromBlock(FlansMod.workbench);
        CreativeTabs[] tabs = table.getCreativeTabs();
        require(tabs.length == 3 && tabs[0] == FlansMod.tabFlanDriveables
                && tabs[1] == FlansMod.tabFlanAttachments && tabs[2] == FlansMod.tabFlanParts,
                "Workbench advertised wrong tabs");
        checkTable(table, FlansMod.tabFlanDriveables, 0);
        checkTable(table, FlansMod.tabFlanAttachments, 1);
        checkTable(table, FlansMod.tabFlanParts, 2);
        checkTable(table, FlansMod.tabFlanGuns, -1);
        require(FlansMod.tabFlanAttachments.getIconItemStack().getItem() != null, "Attachment tab icon missing");
        require(FlansMod.tabFlanAmmo.getIconItemStack().getItem() != null, "Ammo tab icon missing");
        require(FlansMod.tabFlanGadgets.getIconItemStack().getItem() != null, "Gadget tab icon missing");
        List<ItemAttachment> attachments = new ArrayList<ItemAttachment>(FlansMod.attachmentItems);
        List<ItemBullet> ammo = new ArrayList<ItemBullet>(FlansMod.bulletItems);
        try {
            FlansMod.attachmentItems.clear();
            FlansMod.bulletItems.clear();
            require(FlansMod.tabFlanAttachments.getIconItemStack().getItem() != null, "Empty attachment tab icon failed");
            require(FlansMod.tabFlanAmmo.getIconItemStack().getItem() != null, "Empty ammo tab icon failed");
        } finally {
            FlansMod.attachmentItems.addAll(attachments);
            FlansMod.bulletItems.addAll(ammo);
        }
        System.out.println("PRESENTATION_CHECK_PASS: " + attachments.size() + " attachments, " + ammo.size()
                + " bullet items, " + launcherRounds + " launcher rounds, " + disabled + " disabled items; hidden utilities, active ammo, gadgets, tables and fallbacks");
        Minecraft.getMinecraft().shutdown();
    }

    @SuppressWarnings("unchecked")
    private static void checkTable(Item table, CreativeTabs tab, int metadata) {
        List<ItemStack> stacks = new ArrayList<ItemStack>();
        FlansMod.workbench.getSubBlocks(table, tab, stacks);
        require(metadata < 0 ? stacks.isEmpty()
                : stacks.size() == 1 && stacks.get(0).getItemDamage() == metadata, "Wrong table metadata in tab");
    }
}
