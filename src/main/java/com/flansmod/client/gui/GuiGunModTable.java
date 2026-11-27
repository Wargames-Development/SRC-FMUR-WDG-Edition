package com.flansmod.client.gui;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ContainerGunModTable;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.network.PacketGunPaint;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.flansmod.client.gui.GunPreviewStyle.*;

public class GuiGunModTable extends GuiContainer {
    private static final int INSET = 6, BODY_TOP = 28, SIDEBAR_WIDTH = 184;
    private static final int STATS_HEIGHT = 64, INVENTORY_WIDTH = 162;
    private static final int SURFACE = 0xF2181A19, FRAME = 0xFF626754, DIVIDER = 0xFF484C40;
    private static final int PREVIEW_EDGE = 0xFF111312, PREVIEW_CENTER = 0xFF222624;
    private static final int SLOT_FILL = 0xFF222624, SLOT_BORDER = 0xFF525951;
    private static final int PAINT_LEFT = INSET + 5, PAINT_HEIGHT = 36;
    private static final int NONE = -1, HIDDEN = -1000, MOUNT_SLOT_OFFSET = 26;
    private static final int GADGET_MOUNT = 4, OPPOSITE_GADGET_MOUNT = 6;
    private static final String[] MOUNT_NAMES = {"Barrel", "Sight", "Stock", "Grip", "Side rail", "Slide", "Opposite rail"};

    private final InventoryPlayer playerInventory;
    private final GunPreviewRenderer preview = new GunPreviewRenderer(180F);
    private final GunStatsRadar radar = new GunStatsRadar();
    private final float[] projectedMount = new float[2];
    private final int[] mountX = new int[MOUNT_NAMES.length], mountY = new int[MOUNT_NAMES.length];
    private GunType lastGun;
    private int activeMount = NONE, pendingMount = NONE, pressX, pressY;
    private int paintScroll, paintColumns, paintTop, paintRight;
    private int previewRight, previewBottom, statsTop, footerTop, inventoryLeft, guiScale;
    private boolean wideLayout, clickingDetails;

    public GuiGunModTable(InventoryPlayer inventory, World world) {
        super(new ContainerGunModTable(inventory, world));
        playerInventory = inventory;
        Arrays.fill(mountY, HIDDEN);
    }

    @Override
    public void initGui() {
        xSize = Math.min(580, width - 16);
        ySize = Math.min(340, height - 12);
        wideLayout = xSize >= 430 && ySize >= 258;
        footerTop = ySize - 89;
        statsTop = wideLayout ? BODY_TOP + 3 : footerTop - STATS_HEIGHT - 2;
        previewRight = wideLayout ? xSize - SIDEBAR_WIDTH - 1 : xSize - 1;
        paintTop = wideLayout ? ySize - 48 : footerTop + 39;
        previewBottom = wideLayout ? paintTop - 13 : statsTop;
        inventoryLeft = xSize - INSET - INVENTORY_WIDTH - (wideLayout ? 5 : 0);
        int weaponX = (wideLayout ? previewRight : inventoryLeft) - INSET - 30;
        paintRight = weaponX - 12;
        paintColumns = Math.max(1, (paintRight - PAINT_LEFT - 2) / 18);
        guiScale = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight).getScaleFactor();
        super.initGui();

        Arrays.fill(mountY, HIDDEN);
        moveSlot(0, weaponX, paintTop + 15);
        for (int i = 0; i < 36; i++) {
            moveSlot(17 + i, inventoryLeft + i % 9 * 18, footerTop + (i < 27 ? 13 + i / 9 * 18 : 70));
        }
        updateAttachmentSlots(currentGun());
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GunType gun = currentGun();
        if (gun != lastGun) {
            lastGun = gun;
            activeMount = pendingMount = NONE;
            paintScroll = 0;
        }
        Arrays.fill(mountY, HIDDEN);
        updateAttachmentSlots(gun);
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT | GL11.GL_LINE_BIT);
        GL11.glPushMatrix();
        try {
            GL11.glTranslated(guiLeft, guiTop, 0);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDisable(GL11.GL_LIGHTING);
            panel(0, 0, xSize, ySize, SURFACE, FRAME);
            drawRect(1, BODY_TOP - 1, xSize - 1, BODY_TOP, DIVIDER);
            int previewMid = (BODY_TOP + previewBottom) / 2;
            drawGradientRect(1, BODY_TOP, previewRight, previewMid, PREVIEW_EDGE, PREVIEW_CENTER);
            drawGradientRect(1, previewMid, previewRight, previewBottom, PREVIEW_CENTER, PREVIEW_EDGE);
            if (wideLayout) {
                drawRect(previewRight, BODY_TOP, previewRight + 1, ySize - 1, DIVIDER);
                drawRect(previewRight + 1, footerTop - 2, xSize - 1, footerTop - 1, DIVIDER);
            } else {
                drawRect(1, statsTop, xSize - 1, statsTop + 1, DIVIDER);
                drawRect(1, footerTop - 2, xSize - 1, footerTop - 1, DIVIDER);
            }
            int titleCenter = xSize / 2;
            int titleWidth = xSize - 2 * INSET - 8;
            title(fontRendererObj, StatCollector.translateToLocal("tile.flansWorkbench.1.name"), titleCenter, 4, titleWidth);
            if (gun != null) center(fontRendererObj.trimStringToWidth(weapon().getDisplayName(), titleWidth), titleCenter, 16, MUTED);
            center("Weapon", inventorySlots.getSlot(0).xDisplayPosition + 8, paintTop + 4, TEXT);
            text(StatCollector.translateToLocal("container.inventory"), inventoryLeft, footerTop + 2, TEXT);
            if (gun == null) {
                center("Place a weapon in the table", previewRight / 2, (BODY_TOP + previewBottom) / 2, MUTED);
            } else {
                drawAttachments(gun, mouseX - guiLeft, mouseY - guiTop);
                int statsLeft = wideLayout ? previewRight + 5 : INSET;
                radar.draw(fontRendererObj, gun, weapon(), statsLeft, statsTop, xSize - INSET, footerTop - 3, wideLayout);
                drawPaint(weapon(), gun);
            }
            for (int i = 0; i < inventorySlots.inventorySlots.size(); i++) {
                Slot slot = inventorySlots.getSlot(i);
                if (slot.yDisplayPosition >= 0) drawSlot(slot.xDisplayPosition, slot.yDisplayPosition,
                        activeMount != NONE && i == mountSlot(activeMount));
            }
        } finally {
            GL11.glPopMatrix();
            GL11.glPopAttrib();
        }
    }

    private void drawAttachments(GunType gun, int mouseX, int mouseY) {
        if (gun.model == null) {
            center("3D preview unavailable", previewRight / 2, BODY_TOP + 2, MUTED);
        } else {
            drawPreview(gun);
            int hovered = hitMount(mouseX, mouseY);
            for (int i = 0; i < MOUNT_NAMES.length; i++) {
                if (i != activeMount && mountY[i] != HIDDEN) drawMount(gun, i, hovered == i);
            }
            if (activeMount != NONE && mountY[activeMount] != HIDDEN) drawMount(gun, activeMount, true);
        }
        for (int i = 0; i < OPPOSITE_GADGET_MOUNT; i++) {
            Slot slot = inventorySlots.getSlot(mountSlot(i));
            if (slot.yDisplayPosition >= 0 && (gun.model == null || mountPoint(gun, i) == null)) {
                center(MOUNT_NAMES[i], slot.xDisplayPosition + 8, slot.yDisplayPosition - 10, TEXT);
            }
        }
        if (gun.model != null) {
            if (wideLayout) {
                center("Click a node  |  Drag to rotate  |  Scroll to zoom", previewRight / 2, previewBottom + 2, MUTED);
            } else {
                text("Click a node", PAINT_LEFT, footerTop + 3, MUTED);
                text("Drag to rotate", PAINT_LEFT, footerTop + 14, MUTED);
                text("Scroll to zoom", PAINT_LEFT, footerTop + 25, MUTED);
            }
        }
    }

    private void drawPreview(GunType gun) {
        int left = INSET + 1, right = previewRight - 1, top = BODY_TOP + 1, bottom = previewBottom - 1;
        if (bottom <= top) return;
        GL11.glPushAttrib(GL11.GL_SCISSOR_BIT | GL11.GL_ENABLE_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        try {
            GL11.glScissor((guiLeft + left) * guiScale, mc.displayHeight - (guiTop + bottom) * guiScale,
                    (right - left) * guiScale, (bottom - top) * guiScale);
            GL11.glEnable(GL11.GL_SCISSOR_TEST);
            preview.render(weapon(), gun, (left + right) / 2F, (top + bottom) / 2F, right - left, bottom - top);
            // Native slot items draw later and may sit over the model's depth pixels.
            GL11.glDepthMask(true);
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        } finally {
            GL11.glPopAttrib();
        }
        for (int i = 0; i < MOUNT_NAMES.length; i++) {
            Vector3f mount = mountPoint(gun, i);
            if (!availableMount(gun, i) || mount == null) continue;
            preview.projectMount(mount, projectedMount);
            int x = Math.round(projectedMount[0]), y = Math.round(projectedMount[1]);
            if (!contains(x, y, left + 4, top + 4, right - 3, bottom - 3)) continue;
            mountX[i] = x;
            mountY[i] = y;
        }
        if (activeMount != NONE && mountY[activeMount] != HIDDEN) positionActiveMount();
    }

    private void drawMount(GunType gun, int index, boolean hovered) {
        int x = mountX[index], y = mountY[index];
        boolean open = index == activeMount;
        Slot slot = inventorySlots.getSlot(mountSlot(index));
        boolean installed = slot.getHasStack() && (!isGadgetMount(index)
                || (index == OPPOSITE_GADGET_MOUNT) == gun.isGadgetOnOppositeRail(weapon()));
        int color = open || installed ? SELECTED : hovered ? TEXT : MUTED;
        if (open) {
            GL11.glLineWidth(Math.max(1F, guiScale * 0.6F));
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glColor3f((color >> 16 & 255) / 255F, (color >> 8 & 255) / 255F, (color & 255) / 255F);
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex2i(x, y);
            GL11.glVertex2i(slot.xDisplayPosition + 8, slot.yDisplayPosition + 8);
            GL11.glEnd();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
        }
        int size = hovered || open ? 3 : 2;
        drawRect(x - size - 1, y - size - 1, x + size + 1, y + size + 1, GRID);
        drawRect(x - size, y - size, x + size, y + size, color);
    }

    private int hitMount(int x, int y) {
        int nearest = NONE, best = 37;
        // Prefer the next mount when two points project to the same spot.
        for (int step = 1; step <= MOUNT_NAMES.length; step++) {
            int i = (activeMount + step) % MOUNT_NAMES.length;
            if (mountY[i] == HIDDEN) continue;
            int dx = x - mountX[i], dy = y - mountY[i];
            int distance = dx * dx + dy * dy;
            if (distance < best) {
                nearest = i;
                best = distance;
            }
        }
        return nearest;
    }

    private boolean availableMount(GunType gun, int i) {
        if (i == 2) return gun.canMountStock();
        if (i == OPPOSITE_GADGET_MOUNT) return hasTwoRailMarkers(gun);
        if (inventorySlots.getSlot(mountSlot(i)).getHasStack()) return true;
        switch (i) {
            case 0: return gun.allowBarrelAttachments;
            case 1: return gun.allowScopeAttachments;
            case 3: return gun.allowGripAttachments;
            case 4: return gun.allowGadgetAttachments;
            default: return gun.allowSlideAttachments;
        }
    }

    private void updateAttachmentSlots(GunType gun) {
        for (int i = 1; i < 17; i++) moveSlot(i, 0, HIDDEN);
        if (gun == null) return;
        for (int i = 0; i < MOUNT_NAMES.length; i++) {
            if (availableMount(gun, i)) {
                boolean modelMount = gun.model != null && mountPoint(gun, i) != null;
                if (modelMount && activeMount == i && mountY[i] != HIDDEN) positionActiveMount();
                if (!modelMount) moveSlot(mountSlot(i), INSET + (previewRight - 2 * INSET) * (2 * i + 1) / 12 - 8,
                        Math.max(BODY_TOP + 22, (BODY_TOP + previewBottom) / 2 - 3));
            }
        }
    }

    private static boolean hasTwoRailMarkers(GunType gun) {
        if (!gun.hasOppositeSideRail() || gun.model == null) return false;
        Vector3f primary = gun.model.gadgetAttachPoint, opposite = gun.model.getGadgetAttachPoint(true);
        return primary != null && opposite != null && primary.z != opposite.z;
    }

    private static boolean isGadgetMount(int index) {
        return index == GADGET_MOUNT || index == OPPOSITE_GADGET_MOUNT;
    }

    private static int mountSlot(int index) {
        return index == OPPOSITE_GADGET_MOUNT ? GADGET_MOUNT + 1 : index + 1;
    }

    private static Vector3f mountPoint(GunType gun, int index) {
        if (index == OPPOSITE_GADGET_MOUNT) return gun.model.getGadgetAttachPoint(true);
        return GunPreviewRenderer.mountPoint(gun.model, index);
    }

    private static String mountName(GunType gun, int index) {
        if (!isGadgetMount(index) || !hasTwoRailMarkers(gun)) return MOUNT_NAMES[index];
        boolean primaryIsLeft = gun.model.gadgetAttachPoint.z < gun.model.getGadgetAttachPoint(true).z;
        return primaryIsLeft == (index == GADGET_MOUNT) ? "Left rail" : "Right rail";
    }

    private void positionActiveMount() {
        int x = mountX[activeMount], y = mountY[activeMount];
        int left = INSET + 11, right = previewRight - 11;
        int top = BODY_TOP + 11, bottom = previewBottom - 11;
        if (activeMount == 0 || activeMount == 2 || Math.max(y - top, bottom - y) < 15) {
            x = offsetWithin(x, x < previewRight / 2 ? -MOUNT_SLOT_OFFSET : MOUNT_SLOT_OFFSET, left, right);
        } else {
            int offset = activeMount == 3 || isGadgetMount(activeMount) ? MOUNT_SLOT_OFFSET : -MOUNT_SLOT_OFFSET;
            y = offsetWithin(y, offset, top, bottom);
        }
        moveSlot(mountSlot(activeMount), MathHelper.clamp_int(x, left, right) - 8, MathHelper.clamp_int(y, top, bottom) - 8);
    }

    private static int offsetWithin(int origin, int offset, int min, int max) {
        int destination = MathHelper.clamp_int(origin + offset, min, max);
        if (Math.abs(destination - origin) >= 15) return destination;
        return MathHelper.clamp_int(origin - offset, min, max);
    }

    private void moveSlot(int index, int x, int y) {
        Slot slot = inventorySlots.getSlot(index);
        slot.xDisplayPosition = x;
        slot.yDisplayPosition = y;
    }

    private void drawPaint(ItemStack stack, GunType gun) {
        text("Skins", PAINT_LEFT, paintTop + 4, TEXT);
        int maxScroll = maxPaintScroll(gun);
        paintScroll = Math.min(paintScroll, maxScroll);
        for (int i = 0; i < paintColumns && paintScroll + i < gun.paintjobs.size(); i++) {
            Paintjob paint = gun.paintjobs.get(paintScroll + i);
            int x = PAINT_LEFT + i * 18, y = paintTop + 15;
            drawSlot(x, y, stack.getItemDamage() == paint.ID);
            ItemStack swatch = stack.copy();
            swatch.setItemDamage(paint.ID);
            RenderHelper.enableGUIStandardItemLighting();
            itemRender.renderItemIntoGUI(fontRendererObj, mc.getTextureManager(), swatch, x, y);
            RenderHelper.disableStandardItemLighting();
        }
        if (maxScroll > 0) {
            int track = paintRight - PAINT_LEFT - 5;
            int length = Math.max(5, track * paintColumns / gun.paintjobs.size());
            int offset = (track - length) * paintScroll / maxScroll;
            drawRect(PAINT_LEFT, paintTop + 33, PAINT_LEFT + track, paintTop + 34, GRID);
            drawRect(PAINT_LEFT + offset, paintTop + 33, PAINT_LEFT + offset + length, paintTop + 34, MUTED);
        }
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        int x = mouseX - guiLeft, y = mouseY - guiTop;
        GunType gun = currentGun();
        int hover = hitMount(x, y);
        if (hover != NONE && gun != null && !preview.isDragging()) {
            drawHoveringText(Collections.singletonList(mountName(gun, hover)), x, y, fontRendererObj);
            return;
        }
        if (gun != null) {
            List<String> details = radar.detailsAt(gun, weapon(), x, y);
            if (!details.isEmpty()) {
                int tooltipWidth = 0;
                for (String line : details) tooltipWidth = Math.max(tooltipWidth, fontRendererObj.getStringWidth(line));
                // Hover coordinates are container-local, but vanilla's tooltip bounds are screen-wide.
                int rightmost = width - guiLeft - tooltipWidth - 16;
                int anchor = x <= rightmost ? x : x - tooltipWidth - 28;
                drawHoveringText(details, MathHelper.clamp_int(anchor, -guiLeft - 8, rightmost), y, fontRendererObj);
                return;
            }
        }
        Paintjob paint = paintAt(gun, x, y);
        if (paint == null || playerInventory.getItemStack() != null) return;
        ItemStack swatch = weapon().copy();
        swatch.setItemDamage(paint.ID);
        List<String> lines = new ArrayList<>();
        lines.add(swatch.getDisplayName());
        if (!playerInventory.player.capabilities.isCreativeMode) {
            for (ItemStack dye : paint.dyesNeeded) {
                int count = 0;
                for (ItemStack item : playerInventory.mainInventory) {
                    if (item != null && item.getItem() == Items.dye && item.getItemDamage() == dye.getItemDamage()) {
                        count += item.stackSize;
                    }
                }
                lines.add((count >= dye.stackSize ? EnumChatFormatting.GRAY : EnumChatFormatting.RED).toString()
                        + dye.stackSize + " x " + dye.getDisplayName());
            }
        }
        drawHoveringText(lines, x, y, fontRendererObj);
    }

    private Paintjob paintAt(GunType gun, int x, int y) {
        if (gun == null || !contains(x, y, PAINT_LEFT - 1, paintTop + 14,
                PAINT_LEFT - 1 + 18 * paintColumns, paintTop + 32)) return null;
        int index = Math.min(paintScroll, maxPaintScroll(gun)) + (x - PAINT_LEFT + 1) / 18;
        return index < gun.paintjobs.size() ? gun.paintjobs.get(index) : null;
    }

    private int maxPaintScroll(GunType gun) {
        return Math.max(0, gun.paintjobs.size() - paintColumns);
    }

    @Override
    protected void mouseClicked(int x, int y, int button) {
        int localX = x - guiLeft, localY = y - guiTop;
        GunType gun = currentGun();
        if (button == 0) {
            if (gun != null && !overAttachmentSlot(localX, localY)) {
                int hit = hitMount(localX, localY);
                if (gun.model != null && (hit != NONE
                        || (isPreview(localX, localY) && playerInventory.getItemStack() == null))) {
                    pressX = x;
                    pressY = y;
                    pendingMount = hit;
                    preview.beginDrag(x, y);
                    return;
                }
            }
            Paintjob paint = paintAt(gun, localX, localY);
            if (paint != null && playerInventory.getItemStack() == null) {
                clickingDetails = true;
                FlansMod.getPacketHandler().sendToServer(new PacketGunPaint(paint.ID));
                return;
            }
        }
        super.mouseClicked(x, y, button);
    }

    @Override
    protected void mouseClickMove(int x, int y, int button, long elapsed) {
        if (button == 0 && preview.isDragging()) {
            if (pendingMount != NONE && Math.abs(x - pressX) <= 3 && Math.abs(y - pressY) <= 3) return;
            pendingMount = NONE;
            preview.drag(x, y);
        } else if (button != 0 || !clickingDetails) {
            super.mouseClickMove(x, y, button, elapsed);
        }
    }

    @Override
    protected void mouseMovedOrUp(int x, int y, int button) {
        if (button == 0 && preview.isDragging()) {
            preview.endDrag();
            if (pendingMount != NONE && Math.abs(x - pressX) <= 3 && Math.abs(y - pressY) <= 3) toggleMount(pendingMount);
            pendingMount = NONE;
        } else if (button == 0 && clickingDetails) {
            clickingDetails = false;
        } else {
            super.mouseMovedOrUp(x, y, button);
        }
    }

    private void toggleMount(int mount) {
        activeMount = activeMount == mount ? NONE : mount;
        GunType gun = currentGun();
        if (activeMount != NONE && isGadgetMount(mount) && gun != null && hasTwoRailMarkers(gun)) {
            mc.playerController.sendEnchantPacket(inventorySlots.windowId, mount == OPPOSITE_GADGET_MOUNT
                    ? ContainerGunModTable.SELECT_OPPOSITE_RAIL : ContainerGunModTable.SELECT_PRIMARY_RAIL);
        }
        updateAttachmentSlots(gun);
    }

    private boolean overAttachmentSlot(int x, int y) {
        for (int i = 1; i <= OPPOSITE_GADGET_MOUNT; i++) {
            Slot slot = inventorySlots.getSlot(i);
            int sx = slot.xDisplayPosition, sy = slot.yDisplayPosition;
            if (contains(x, y, sx - 1, sy - 1, sx + 17, sy + 17)) return true;
        }
        return false;
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        int wheel = Mouse.getEventDWheel();
        if (wheel == 0) return;
        int x = Mouse.getEventX() * width / mc.displayWidth - guiLeft;
        int y = height - Mouse.getEventY() * height / mc.displayHeight - 1 - guiTop;
        GunType gun = currentGun();
        if (gun == null) return;
        if (contains(x, y, INSET, paintTop, paintRight, paintTop + PAINT_HEIGHT)) {
            paintScroll = MathHelper.clamp_int(paintScroll + (wheel > 0 ? -1 : 1), 0, maxPaintScroll(gun));
        } else if (gun.model != null && isPreview(x, y)) {
            preview.zoom(wheel);
        }
    }

    private boolean isPreview(int x, int y) {
        return contains(x, y, INSET, BODY_TOP, previewRight, previewBottom);
    }

    private static boolean contains(int x, int y, int left, int top, int right, int bottom) {
        return x >= left && x < right && y >= top && y < bottom;
    }

    private ItemStack weapon() {
        return inventorySlots.getSlot(0).getStack();
    }

    private GunType currentGun() {
        ItemStack stack = weapon();
        return stack != null && stack.getItem() instanceof ItemGun ? ((ItemGun) stack.getItem()).type : null;
    }

    private void drawSlot(int x, int y, boolean selected) {
        panel(x - 1, y - 1, x + 17, y + 17, SLOT_FILL, selected ? SELECTED : SLOT_BORDER);
    }

    private void center(String caption, int x, int y, int color) {
        text(caption, x - fontRendererObj.getStringWidth(caption) / 2, y, color);
    }

    private void text(String caption, int x, int y, int color) {
        fontRendererObj.drawStringWithShadow(caption, x, y, color);
    }
}
