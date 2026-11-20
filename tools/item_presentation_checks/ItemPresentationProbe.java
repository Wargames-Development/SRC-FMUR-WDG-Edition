package com.flansmod.checks;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ContainerGunModTable;
import com.flansmod.common.guns.item.ItemAttachment;
import com.flansmod.common.guns.item.ItemBullet;
import com.flansmod.common.guns.item.ItemGrenade;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.MinecraftForgeClient;

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
        ItemStack flashlight = new ItemStack(FlansMod.handheldFlashlight);
        require(MinecraftForgeClient.getItemRenderer(flashlight, ItemRenderType.INVENTORY) == null,
                "Flashlight's model bypasses its inventory sprite");
        require(MinecraftForgeClient.getItemRenderer(flashlight, ItemRenderType.EQUIPPED_FIRST_PERSON) != null,
                "Flashlight lost its equipped model");
        Item table = Item.getItemFromBlock(FlansMod.workbench);
        CreativeTabs[] tabs = table.getCreativeTabs();
        require(tabs.length == 2 && tabs[0] == FlansMod.tabFlanDriveables && tabs[1] == FlansMod.tabFlanAttachments,
                "Workbench advertised wrong tabs");
        require(FlansMod.tabFlanParts == FlansMod.tabFlanDriveables && FlansMod.tabFlanMechas == FlansMod.tabFlanDriveables,
                "Parts or mechas still have a separate tab");
        checkTable(table, FlansMod.tabFlanDriveables, 0, 2);
        checkTable(table, FlansMod.tabFlanAttachments, 1);
        checkTable(table, FlansMod.tabFlanGuns);
        verifyHiddenBlocks();
        verifyStationTransfer();
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
                + " bullet items, " + launcherRounds + " launcher rounds, " + disabled
                + " disabled items; tabs, hidden blocks and station transfers");
        Minecraft.getMinecraft().shutdown();
    }

    @SuppressWarnings("unchecked")
    private static void checkTable(Item table, CreativeTabs tab, int... metadata) {
        List<ItemStack> stacks = new ArrayList<ItemStack>();
        FlansMod.workbench.getSubBlocks(table, tab, stacks);
        require(stacks.size() == metadata.length, "Wrong number of workbenches in tab");
        for (int i = 0; i < metadata.length; i++)
            require(stacks.get(i).getItemDamage() == metadata[i], "Wrong table metadata in tab");
    }

    @SuppressWarnings("unchecked")
    private static void verifyHiddenBlocks() {
        String[] hidden = {"advancedblindage", "andesite", "blindage", "breakablestone", "copper_block",
                "copper_block_cutted", "diorite", "dirt_path", "elevator_door", "granite", "polished_andesite",
                "polished_diorite", "polished_granite", "smooth_stone", "testblock", "testblock_bush",
                "testblock_fence", "testblock_slab", "white_terracotta_118"};
        List<ItemStack> blocks = new ArrayList<ItemStack>();
        FlansMod.tabFlanBlocks.displayAllReleventItems(blocks);
        for (String name : hidden) {
            Block block = GameRegistry.findBlock("flansmod", "block." + name);
            require(block != null, "Missing registered block: " + name);
            Item item = Item.getItemFromBlock(block);
            require(item != null && item.getCreativeTab() == null, "Hidden block is searchable: " + name);
            for (ItemStack stack : blocks)
                require(stack.getItem() != item, "Hidden block in FMUR Blocks: " + name);
        }
        require(blocks.stream().anyMatch(stack -> stack.getItem() == Item.getItemFromBlock(
                GameRegistry.findBlock("flansmod", "block.sandbag"))), "Sandbag disappeared from FMUR Blocks");
    }

    private static void verifyStationTransfer() {
        InventoryPlayer inventory = new InventoryPlayer(null);
        ContainerGunModTable station = new ContainerGunModTable(inventory, null);
        ItemGun c25 = (ItemGun) GameRegistry.findItem("flansmod", "c25");
        Item holo = GameRegistry.findItem("flansmod", "holo");
        Item stock = GameRegistry.findItem("flansmod", "assaultstock");
        require(c25 != null && holo != null && stock != null, "Missing station test items");
        require(new ItemStack(holo).getDisplayName().contains("EOTECH"), "Holo name did not reach the client");
        inventory.setInventorySlotContents(9, new ItemStack(holo, 2));
        inventory.setInventorySlotContents(10, new ItemStack(c25));
        inventory.setInventorySlotContents(11, new ItemStack(stock));
        inventory.setInventorySlotContents(12, new ItemStack(Items.stick));

        require(station.transferStackInSlot(null, 17) == null, "Accepted an attachment before a gun");
        require(station.transferStackInSlot(null, 18) != null && inventory.getStackInSlot(10) == null,
                "Could not shift-click a fresh gun");
        ItemStack gun = station.getSlot(0).getStack();
        gun.getTagCompound().setString("probeTag", "keep");
        require(station.transferStackInSlot(null, 19) == null && inventory.getStackInSlot(11) != null,
                "Accepted stock in a disabled slot");
        require(station.transferStackInSlot(null, 20) == null, "Accepted an unrelated item");
        require(station.transferStackInSlot(null, 17) != null && inventory.getStackInSlot(9).stackSize == 1,
                "Did not move exactly one optic");
        require(c25.type.getAttachmentItemStack(gun, "scope").getItem() == holo, "Optic not saved to gun NBT");
        require(station.transferStackInSlot(null, 17) == null, "Replaced an installed optic");
        require(station.transferStackInSlot(null, 2) != null && c25.type.getAttachmentItemStack(gun, "scope") == null,
                "Could not remove the installed optic");
        require(station.transferStackInSlot(null, 17) != null && station.transferStackInSlot(null, 0) != null,
                "Could not return a gun with its optic");
        require(station.getSlot(2).getStack() == null, "Optic was left behind when its gun moved");
        for (ItemStack returned : inventory.mainInventory) {
            if (returned != null && returned.getItem() == c25) {
                require("keep".equals(returned.getTagCompound().getString("probeTag")), "Unrelated gun NBT was lost");
                require(c25.type.getAttachmentItemStack(returned, "scope").getItem() == holo,
                        "Returned gun lost its mounted optic");
                return;
            }
        }
        throw new AssertionError("Gun did not return to inventory");
    }
}
