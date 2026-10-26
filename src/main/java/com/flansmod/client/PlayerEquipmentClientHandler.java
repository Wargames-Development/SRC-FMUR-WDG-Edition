package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketZPlayerEquipmentSync;
import com.flansmod.common.teams.ItemNightVisionGoggles;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;

/** Client presentation for the custom player equipment slots. */
@SideOnly(Side.CLIENT)
public final class PlayerEquipmentClientHandler {
    // Match the vanilla creative layout without replacing its screen class. NEI,
    // MouseTweaks and InventoryTweaks use exact-class checks for creative handling.
    private static final int CREATIVE_WIDTH = 195;
    private static final int CREATIVE_HEIGHT = 136;
    private static final int EQUIPMENT_X = 117;
    private static final int NIGHT_VISION_Y = 6;
    private static final int FACE_Y = 33;
    private GuiContainerCreative creativeScreen;
    private ItemStack lastNightVision;
    private ItemStack lastFace;

    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {
        if (event.gui instanceof GuiInventory && !(event.gui instanceof EquipmentGuiInventory)) {
            event.gui = new EquipmentGuiInventory(net.minecraft.client.Minecraft.getMinecraft().thePlayer);
        }
        creativeScreen = event.gui != null && event.gui.getClass() == GuiContainerCreative.class
                ? (GuiContainerCreative)event.gui : null;
        rememberEquipment(net.minecraft.client.Minecraft.getMinecraft().thePlayer);
    }

    @SubscribeEvent
    public void prepareCreativeEquipment(GuiScreenEvent.DrawScreenEvent.Pre event) {
        if (event.gui != creativeScreen || creativeScreen == null) {
            return;
        }
        int found = 0;
        for (Object object : creativeScreen.inventorySlots.inventorySlots) {
            net.minecraft.inventory.Slot slot = (net.minecraft.inventory.Slot)object;
            if (slot.inventory instanceof PlayerEquipmentInventory) {
                slot.xDisplayPosition = EQUIPMENT_X;
                slot.yDisplayPosition = found == 0 ? NIGHT_VISION_Y : FACE_Y;
                found++;
            }
        }
        syncCreativeEquipment(net.minecraft.client.Minecraft.getMinecraft().thePlayer);
    }

    @SubscribeEvent
    public void drawCreativeEquipment(GuiScreenEvent.DrawScreenEvent.Post event) {
        if (event.gui != creativeScreen || creativeScreen == null) {
            return;
        }
        int left = (creativeScreen.width - CREATIVE_WIDTH) / 2;
        int top = (creativeScreen.height - CREATIVE_HEIGHT) / 2;
        for (Object object : creativeScreen.inventorySlots.inventorySlots) {
            net.minecraft.inventory.Slot slot = (net.minecraft.inventory.Slot)object;
            if (slot.inventory instanceof PlayerEquipmentInventory) {
                drawCreativeSlotBorder(left + slot.xDisplayPosition - 1, top + slot.yDisplayPosition - 1);
            }
        }
    }

    private static void drawCreativeSlotBorder(int x, int y) {
        // This event runs after items/tooltips. Draw only the one-pixel outer rim,
        // never fill over an equipment item or its empty-slot background icon.
        net.minecraft.client.gui.Gui.drawRect(x, y, x + 18, y + 1, 0xFF373737);
        net.minecraft.client.gui.Gui.drawRect(x, y + 1, x + 1, y + 18, 0xFF373737);
        net.minecraft.client.gui.Gui.drawRect(x + 17, y + 1, x + 18, y + 18, 0xFFFFFFFF);
        net.minecraft.client.gui.Gui.drawRect(x + 1, y + 17, x + 17, y + 18, 0xFFFFFFFF);
    }

    private void syncCreativeEquipment(EntityPlayer player) {
        PlayerEquipmentInventory equipment = player == null ? null : PlayerEquipmentInventory.get(player);
        if (equipment == null) {
            return;
        }
        ItemStack nightVision = equipment.getStackInSlot(PlayerEquipmentInventory.NIGHT_VISION_SLOT);
        ItemStack face = equipment.getStackInSlot(PlayerEquipmentInventory.FACE_SLOT);
        if (!ItemStack.areItemStacksEqual(nightVision, lastNightVision)
                || !ItemStack.areItemStacksEqual(face, lastFace)) {
            FlansMod.getPacketHandler().sendToServer(new PacketZPlayerEquipmentSync(player));
            rememberEquipment(player);
        }
    }

    private void rememberEquipment(EntityPlayer player) {
        PlayerEquipmentInventory equipment = player == null ? null : PlayerEquipmentInventory.get(player);
        lastNightVision = equipment == null ? null : ItemStack.copyItemStack(equipment.getStackInSlot(
                PlayerEquipmentInventory.NIGHT_VISION_SLOT));
        lastFace = equipment == null ? null : ItemStack.copyItemStack(equipment.getStackInSlot(
                PlayerEquipmentInventory.FACE_SLOT));
    }

    @SubscribeEvent
    public void renderEquipment(RenderPlayerEvent.Specials.Post event) {
        PlayerEquipmentInventory equipment = PlayerEquipmentInventory.get(event.entityPlayer);
        if (equipment == null) {
            return;
        }
        renderStack(event, equipment.getStackInSlot(PlayerEquipmentInventory.FACE_SLOT));
        renderStack(event, equipment.getStackInSlot(PlayerEquipmentInventory.NIGHT_VISION_SLOT));
    }

    private void renderStack(RenderPlayerEvent.Specials.Post event, ItemStack stack) {
        if (stack == null) {
            return;
        }

        Item item = stack.getItem();
        ModelBiped model;
        ResourceLocation texture;
        if (item instanceof ItemTeamArmour) {
            ItemTeamArmour armour = (ItemTeamArmour)item;
            model = armour.getArmorModel(event.entityPlayer, stack, 0);
            texture = armour.getArmorTextureLocation();
        } else if (item instanceof ItemNightVisionGoggles) {
            ItemNightVisionGoggles goggles = (ItemNightVisionGoggles)item;
            model = goggles.getArmorModel(event.entityPlayer, stack, 0);
            texture = goggles.getArmorTextureLocation();
        } else {
            return;
        }
        if (model == null || texture == null) {
            return;
        }

        EntityPlayer player = event.entityPlayer;
        RenderPlayer renderer = event.renderer;
        float partial = event.partialRenderTick;
        float limbSwingAmount = player.prevLimbSwingAmount
                + (player.limbSwingAmount - player.prevLimbSwingAmount) * partial;
        float limbSwing = player.limbSwing - player.limbSwingAmount * (1F - partial);
        float headYaw = interpolate(player.prevRotationYawHead, player.rotationYawHead, partial)
                - interpolate(player.prevRenderYawOffset, player.renderYawOffset, partial);
        float headPitch = player.prevRotationPitch
                + (player.rotationPitch - player.prevRotationPitch) * partial;

        model.onGround = renderer.modelBipedMain.onGround;
        model.isRiding = renderer.modelBipedMain.isRiding;
        model.isChild = renderer.modelBipedMain.isChild;
        net.minecraft.client.Minecraft.getMinecraft().getTextureManager()
                .bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glColor4f(1F, 1F, 1F, 1F);
        model.render(player, limbSwing, limbSwingAmount, player.ticksExisted + partial,
                headYaw, headPitch, 0.0625F);
        GL11.glPopMatrix();
    }

    private static float interpolate(float previous, float current, float partial) {
        float difference = current - previous;
        while (difference < -180F) {
            difference += 360F;
        }
        while (difference >= 180F) {
            difference -= 360F;
        }
        return previous + partial * difference;
    }

    private static final class EquipmentGuiInventory extends GuiInventory {
        private EquipmentGuiInventory(EntityPlayer player) {
            super(player);
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float partial, int mouseX, int mouseY) {
            super.drawGuiContainerBackgroundLayer(partial, mouseX, mouseY);
            drawSlotBorder(guiLeft + 25, guiTop + 43);
            drawSlotBorder(guiLeft + 25, guiTop + 61);
        }

        private void drawSlotBorder(int x, int y) {
            drawRect(x, y, x + 18, y + 18, 0xFF373737);
            drawRect(x + 1, y + 1, x + 17, y + 17, 0xFF8B8B8B);
            drawRect(x + 2, y + 2, x + 17, y + 17, 0xFF373737);
        }
    }

}
