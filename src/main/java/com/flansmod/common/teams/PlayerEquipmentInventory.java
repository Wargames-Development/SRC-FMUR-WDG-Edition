package com.flansmod.common.teams;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketZPlayerEquipmentSync;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

/** Server-owned, persistent equipment slots that do not replace vanilla armour. */
public final class PlayerEquipmentInventory extends InventoryBasic implements IExtendedEntityProperties {
    public static final String PROPERTY_KEY = "FlansEquipment";
    public static final int NIGHT_VISION_SLOT = 0;
    public static final int FACE_SLOT = 1;
    private static final int SLOT_COUNT = 2;
    private static final int FIRST_CONTAINER_SLOT = 45;

    private EntityPlayer player;
    private boolean suppressSync;
    private final ItemStack[] lastSynced = new ItemStack[SLOT_COUNT];

    private PlayerEquipmentInventory(EntityPlayer player) {
        super("container.flansEquipment", false, SLOT_COUNT);
        this.player = player;
    }

    public static PlayerEquipmentInventory get(EntityPlayer player) {
        if (player == null) {
            return null;
        }
        return (PlayerEquipmentInventory)player.getExtendedProperties(PROPERTY_KEY);
    }

    public static ItemStack getStack(EntityPlayer player, int slot) {
        PlayerEquipmentInventory equipment = get(player);
        return equipment == null ? null : equipment.getStackInSlot(slot);
    }

    public static boolean isValidForSlot(ItemStack stack, int slot) {
        if (stack == null) {
            return false;
        }
        if (slot == NIGHT_VISION_SLOT) {
            return stack.getItem() instanceof ItemNightVisionGoggles;
        }
        if (slot == FACE_SLOT && stack.getItem() instanceof ItemTeamArmour) {
            return ((ItemTeamArmour)stack.getItem()).type.faceSlot;
        }
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return isValidForSlot(stack, slot);
    }

    @Override
    public void markDirty() {
        super.markDirty();
        if (suppressSync || player == null || player.worldObj == null || player.worldObj.isRemote) {
            return;
        }
        if (!contentsChanged()) {
            return;
        }
        rememberContents();
        FlansMod.getPacketHandler().sendToDimension(new PacketZPlayerEquipmentSync(player), player.dimension);
    }

    public void setSyncedContents(ItemStack nightVision, ItemStack face) {
        suppressSync = true;
        setInventorySlotContents(NIGHT_VISION_SLOT, nightVision);
        setInventorySlotContents(FACE_SLOT, face);
        rememberContents();
        suppressSync = false;
    }

    public void setServerContents(ItemStack nightVision, ItemStack face) {
        suppressSync = true;
        setInventorySlotContents(NIGHT_VISION_SLOT, copy(nightVision));
        setInventorySlotContents(FACE_SLOT, copy(face));
        suppressSync = false;
        markDirty();
    }

    public void clear() {
        suppressSync = true;
        setInventorySlotContents(NIGHT_VISION_SLOT, null);
        setInventorySlotContents(FACE_SLOT, null);
        suppressSync = false;
        markDirty();
    }

    public void copyFrom(PlayerEquipmentInventory original) {
        if (original != null) {
            setSyncedContents(copy(original.getStackInSlot(NIGHT_VISION_SLOT)),
                    copy(original.getStackInSlot(FACE_SLOT)));
        }
    }

    @Override
    public void saveNBTData(NBTTagCompound compound) {
        NBTTagList items = new NBTTagList();
        for (int slot = 0; slot < SLOT_COUNT; slot++) {
            ItemStack stack = getStackInSlot(slot);
            if (stack != null) {
                NBTTagCompound itemTag = new NBTTagCompound();
                itemTag.setByte("Slot", (byte)slot);
                stack.writeToNBT(itemTag);
                items.appendTag(itemTag);
            }
        }
        NBTTagCompound equipmentTag = new NBTTagCompound();
        equipmentTag.setTag("Items", items);
        compound.setTag(PROPERTY_KEY, equipmentTag);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {
        ItemStack[] loaded = new ItemStack[SLOT_COUNT];
        if (compound.hasKey(PROPERTY_KEY, 10)) {
            NBTTagList items = compound.getCompoundTag(PROPERTY_KEY).getTagList("Items", 10);
            for (int index = 0; index < items.tagCount(); index++) {
                NBTTagCompound itemTag = items.getCompoundTagAt(index);
                int slot = itemTag.getByte("Slot") & 255;
                if (slot < SLOT_COUNT) {
                    loaded[slot] = ItemStack.loadItemStackFromNBT(itemTag);
                }
            }
        }
        setSyncedContents(loaded[NIGHT_VISION_SLOT], loaded[FACE_SLOT]);
    }

    @Override
    public void init(Entity entity, World world) {
        if (entity instanceof EntityPlayer) {
            player = (EntityPlayer)entity;
        }
    }

    private boolean contentsChanged() {
        for (int slot = 0; slot < SLOT_COUNT; slot++) {
            if (!ItemStack.areItemStacksEqual(getStackInSlot(slot), lastSynced[slot])) {
                return true;
            }
        }
        return false;
    }

    private void rememberContents() {
        for (int slot = 0; slot < SLOT_COUNT; slot++) {
            lastSynced[slot] = copy(getStackInSlot(slot));
        }
    }

    private static ItemStack copy(ItemStack stack) {
        return stack == null ? null : stack.copy();
    }

    private static void installContainer(EntityPlayer player) {
        if (player.inventoryContainer instanceof EquipmentContainerPlayer) {
            return;
        }
        Container oldContainer = player.inventoryContainer;
        EquipmentContainerPlayer newContainer = new EquipmentContainerPlayer(player);
        newContainer.windowId = oldContainer == null ? 0 : oldContainer.windowId;
        player.inventoryContainer = newContainer;
        if (player.openContainer == oldContainer) {
            player.openContainer = newContainer;
        }
    }

    private static void migrateInvalidBoots(EntityPlayer player) {
        if (player.worldObj.isRemote) {
            return;
        }
        ItemStack boots = player.inventory.armorInventory[0];
        int target = validEquipmentSlot(boots);
        if (target < 0) {
            return;
        }
        PlayerEquipmentInventory equipment = get(player);
        player.inventory.armorInventory[0] = null;
        if (equipment.getStackInSlot(target) == null) {
            equipment.setInventorySlotContents(target, boots);
        } else if (!player.inventory.addItemStackToInventory(boots)) {
            player.dropPlayerItemWithRandomChoice(boots, false);
        }
        player.inventory.markDirty();
    }

    private static int validEquipmentSlot(ItemStack stack) {
        for (int slot = 0; slot < SLOT_COUNT; slot++) {
            if (isValidForSlot(stack, slot)) {
                return slot;
            }
        }
        return -1;
    }

    public static final class Events {
        public Events() {
            MinecraftForge.EVENT_BUS.register(this);
            FMLCommonHandler.instance().bus().register(this);
        }

        @SubscribeEvent
        public void onEntityConstructing(EntityConstructing event) {
            if (event.entity instanceof EntityPlayer
                    && event.entity.getExtendedProperties(PROPERTY_KEY) == null) {
                EntityPlayer player = (EntityPlayer)event.entity;
                player.registerExtendedProperties(PROPERTY_KEY, new PlayerEquipmentInventory(player));
            }
        }

        @SubscribeEvent
        public void onEntityJoinWorld(EntityJoinWorldEvent event) {
            if (event.entity instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer)event.entity;
                installContainer(player);
                migrateInvalidBoots(player);
            }
        }

        @SubscribeEvent
        public void onClone(PlayerEvent.Clone event) {
            if (!event.wasDeath
                    || event.entityPlayer.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory")) {
                get(event.entityPlayer).copyFrom(get(event.original));
            }
        }

        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public void onPlayerDrops(PlayerDropsEvent event) {
            if (event.entityPlayer.worldObj.isRemote
                    || event.entityPlayer.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory")) {
                return;
            }
            PlayerEquipmentInventory equipment = get(event.entityPlayer);
            for (int slot = 0; slot < SLOT_COUNT; slot++) {
                ItemStack stack = equipment.getStackInSlot(slot);
                if (stack != null) {
                    event.drops.add(new EntityItem(event.entityPlayer.worldObj, event.entityPlayer.posX,
                            event.entityPlayer.posY, event.entityPlayer.posZ, stack.copy()));
                }
            }
            equipment.setSyncedContents(null, null);
        }

        @SubscribeEvent
        public void onStartTracking(PlayerEvent.StartTracking event) {
            if (event.entityPlayer instanceof EntityPlayerMP && event.target instanceof EntityPlayer) {
                FlansMod.getPacketHandler().sendTo(new PacketZPlayerEquipmentSync((EntityPlayer)event.target),
                        (EntityPlayerMP)event.entityPlayer);
            }
        }

        @SubscribeEvent
        public void onLogin(PlayerLoggedInEvent event) {
            syncToSelf(event.player);
        }

        @SubscribeEvent
        public void onRespawn(PlayerRespawnEvent event) {
            syncToSelf(event.player);
        }

        @SubscribeEvent
        public void onChangedDimension(PlayerChangedDimensionEvent event) {
            syncToSelf(event.player);
        }

        @SubscribeEvent
        public void onPlayerTick(TickEvent.PlayerTickEvent event) {
            if (event.phase == TickEvent.Phase.END && !event.player.worldObj.isRemote) {
                migrateInvalidBoots(event.player);
            }
        }

        private void syncToSelf(EntityPlayer player) {
            if (player instanceof EntityPlayerMP) {
                FlansMod.getPacketHandler().sendTo(new PacketZPlayerEquipmentSync(player), (EntityPlayerMP)player);
            }
        }
    }

    public static final class EquipmentContainerPlayer extends ContainerPlayer {
        public EquipmentContainerPlayer(EntityPlayer player) {
            super(player.inventory, !player.worldObj.isRemote, player);
            PlayerEquipmentInventory equipment = get(player);
            addSlotToContainer(new EquipmentSlot(equipment, NIGHT_VISION_SLOT, 26, 44));
            addSlotToContainer(new EquipmentSlot(equipment, FACE_SLOT, 26, 62));
        }

        @Override
        public ItemStack transferStackInSlot(EntityPlayer player, int containerSlot) {
            Slot source = (Slot)inventorySlots.get(containerSlot);
            if (source == null || !source.getHasStack()) {
                return null;
            }
            ItemStack sourceStack = source.getStack();
            int equipmentSlot = validEquipmentSlot(sourceStack);
            if (containerSlot >= FIRST_CONTAINER_SLOT) {
                return transfer(player, source, sourceStack, 9, FIRST_CONTAINER_SLOT, false);
            }
            if (equipmentSlot >= 0) {
                int target = FIRST_CONTAINER_SLOT + equipmentSlot;
                return transfer(player, source, sourceStack, target, target + 1, false);
            }
            return super.transferStackInSlot(player, containerSlot);
        }

        private ItemStack transfer(EntityPlayer player, Slot source, ItemStack sourceStack,
                                   int firstTarget, int lastTarget, boolean reverse) {
            ItemStack original = sourceStack.copy();
            if (!mergeItemStack(sourceStack, firstTarget, lastTarget, reverse)) {
                return null;
            }
            if (sourceStack.stackSize == 0) {
                source.putStack(null);
            } else {
                source.onSlotChanged();
            }
            if (sourceStack.stackSize == original.stackSize) {
                return null;
            }
            source.onPickupFromSlot(player, sourceStack);
            return original;
        }
    }

    private static final class EquipmentSlot extends Slot {
        private final int equipmentSlot;

        private EquipmentSlot(PlayerEquipmentInventory inventory, int equipmentSlot, int x, int y) {
            super(inventory, equipmentSlot, x, y);
            this.equipmentSlot = equipmentSlot;
        }

        @Override
        public int getSlotStackLimit() {
            return 1;
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return isValidForSlot(stack, equipmentSlot);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public IIcon getBackgroundIconIndex() {
            return ItemArmor.func_94602_b(0);
        }
    }
}
