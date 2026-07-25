package com.flansmod.common.mob;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.medical.CorpseMedicalService;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EntityCorpse extends Entity implements IEntityAdditionalSpawnData {

    private EntityPlayer owner;
    private String playerName;
    private String playerDisplayName;
    private UUID playerUuid;
    private String scoreboardTeamName;

    private float headRotationX;
    private float headRotationY;
    private float leftArmRotationX, leftArmRotationY, leftArmRotationZ;
    private float rightArmRotationX, rightArmRotationY, rightArmRotationZ;
    private float bodyRotationX, bodyRotationY;
    private float leftLegRotationX, leftLegRotationY, leftLegRotationZ;
    private float rightLegRotationX, rightLegRotationY, rightLegRotationZ;
    private boolean isDown;
    private final List<StoredItem> storedInventory = new ArrayList<StoredItem>();
    private boolean inventoryReleased;

    public EntityCorpse(World world) {
        super(world);
        renderDistanceWeight = 100D;
        ignoreFrustumCheck = true;
        setSize(0.6F, 0.3F);
    }

    public EntityCorpse(World world, EntityPlayer player) {
        this(world);
        this.owner = player;
        this.playerName = player.getCommandSenderName();
        this.playerDisplayName = player.getDisplayName();
        this.playerUuid = player.getUniqueID();
        this.scoreboardTeamName = player.getTeam() != null ? player.getTeam().getRegisteredName() : "";

        this.headRotationX = (float) (Math.random() * 30 - 15);
        this.headRotationY = (float) (Math.random() * 360 - 180);
        this.leftArmRotationX = (float) (Math.random() * 60 - 30);
        this.leftArmRotationY = (float) (Math.random() * 60 - 30);
        this.leftArmRotationZ = (float) (Math.random() * 180 - 90);
        this.rightArmRotationX = (float) (Math.random() * 60 - 30);
        this.rightArmRotationY = (float) (Math.random() * 60 - 30);
        this.rightArmRotationZ = (float) (Math.random() * 180 - 90);
        this.bodyRotationX = (float) (Math.random() * 10 - 5);
        this.bodyRotationY = player.rotationYaw + (float) (Math.random() * 20 - 10);
        this.leftLegRotationX = (float) (Math.random() * 90 - 45);
        this.leftLegRotationY = (float) (Math.random() * 90 - 45);
        this.leftLegRotationZ = (float) (Math.random() * 90 - 45);
        this.rightLegRotationX = (float) (Math.random() * 90 - 45);
        this.rightLegRotationY = (float) (Math.random() * 90 - 45);
        this.rightLegRotationZ = (float) (Math.random() * 90 - 45);
        this.isDown = ThreadLocalRandom.current().nextBoolean();
    }

    @Override
    protected void entityInit() {
        dataWatcher.addObject(2, (byte) 0);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        int lifetimeTicks = Math.max(1, FlansMod.corpseLifetimeSeconds) * 20;
        if (!worldObj.isRemote && ticksExisted > lifetimeTicks) {
            expireAndDropInventory();
            return;
        }

        motionY -= 9.81D / 400D;
        motionX *= 0.5D;
        motionZ *= 0.5D;
        moveEntity(motionX, motionY, motionZ);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbt) {
        playerName = nbt.getString("PlayerName");
        playerDisplayName = nbt.getString("PlayerDisplayName");
        String uuidString = nbt.getString("PlayerUUID");
        if (uuidString != null && !uuidString.isEmpty()) {
            try {
                playerUuid = UUID.fromString(uuidString);
            } catch (IllegalArgumentException ignored) {
                playerUuid = null;
            }
        }
        scoreboardTeamName = nbt.getString("ScoreboardTeam");

        storedInventory.clear();
        NBTTagList inventoryTags = nbt.getTagList("StoredInventory", 10);
        for (int index = 0; index < inventoryTags.tagCount(); index++) {
            NBTTagCompound itemTag = inventoryTags.getCompoundTagAt(index);
            ItemStack stack = ItemStack.loadItemStackFromNBT(itemTag);
            if (stack != null) {
                storedInventory.add(new StoredItem(itemTag.getInteger("CorpseSlot"), stack));
            }
        }
        inventoryReleased = nbt.getBoolean("InventoryReleased");

        headRotationX = nbt.getFloat("HeadRotationX");
        headRotationY = nbt.getFloat("HeadRotationY");
        leftArmRotationX = nbt.getFloat("LeftArmRotationX");
        leftArmRotationY = nbt.getFloat("LeftArmRotationY");
        leftArmRotationZ = nbt.getFloat("LeftArmRotationZ");
        rightArmRotationX = nbt.getFloat("RightArmRotationX");
        rightArmRotationY = nbt.getFloat("RightArmRotationY");
        rightArmRotationZ = nbt.getFloat("RightArmRotationZ");
        bodyRotationX = nbt.getFloat("BodyRotationX");
        bodyRotationY = nbt.getFloat("BodyRotationY");
        leftLegRotationX = nbt.getFloat("LeftLegRotationX");
        leftLegRotationY = nbt.getFloat("LeftLegRotationY");
        leftLegRotationZ = nbt.getFloat("LeftLegRotationZ");
        rightLegRotationX = nbt.getFloat("RightLegRotationX");
        rightLegRotationY = nbt.getFloat("RightLegRotationY");
        rightLegRotationZ = nbt.getFloat("RightLegRotationZ");
        isDown = nbt.getBoolean("IsDown");
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbt) {
        nbt.setString("PlayerName", safe(playerName));
        nbt.setString("PlayerDisplayName", safe(playerDisplayName));
        nbt.setString("PlayerUUID", playerUuid != null ? playerUuid.toString() : "");
        nbt.setString("ScoreboardTeam", safe(scoreboardTeamName));

        NBTTagList inventoryTags = new NBTTagList();
        for (StoredItem storedItem : storedInventory) {
            if (storedItem.stack == null) {
                continue;
            }
            NBTTagCompound itemTag = new NBTTagCompound();
            storedItem.stack.writeToNBT(itemTag);
            itemTag.setInteger("CorpseSlot", storedItem.slot);
            inventoryTags.appendTag(itemTag);
        }
        nbt.setTag("StoredInventory", inventoryTags);
        nbt.setBoolean("InventoryReleased", inventoryReleased);

        nbt.setFloat("HeadRotationX", headRotationX);
        nbt.setFloat("HeadRotationY", headRotationY);
        nbt.setFloat("LeftArmRotationX", leftArmRotationX);
        nbt.setFloat("LeftArmRotationY", leftArmRotationY);
        nbt.setFloat("LeftArmRotationZ", leftArmRotationZ);
        nbt.setFloat("RightArmRotationX", rightArmRotationX);
        nbt.setFloat("RightArmRotationY", rightArmRotationY);
        nbt.setFloat("RightArmRotationZ", rightArmRotationZ);
        nbt.setFloat("BodyRotationX", bodyRotationX);
        nbt.setFloat("BodyRotationY", bodyRotationY);
        nbt.setFloat("LeftLegRotationX", leftLegRotationX);
        nbt.setFloat("LeftLegRotationY", leftLegRotationY);
        nbt.setFloat("LeftLegRotationZ", leftLegRotationZ);
        nbt.setFloat("RightLegRotationX", rightLegRotationX);
        nbt.setFloat("RightLegRotationY", rightLegRotationY);
        nbt.setFloat("RightLegRotationZ", rightLegRotationZ);
        nbt.setBoolean("IsDown", isDown);
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Override
    public boolean isInvisible() {
        return false;
    }

    @Override
    public float getShadowSize() {
        return 0.5F;
    }

    @Override
    public void setDead() {
        super.setDead();
        if (worldObj != null && !worldObj.isRemote) {
            CorpseMedicalService.unregisterCorpse(this);
        }
    }

    public void captureInventory(EntityPlayer player) {
        storedInventory.clear();
        inventoryReleased = false;
        if (player == null || player.inventory == null) {
            return;
        }
        if (player.worldObj.getGameRules().getGameRuleBooleanValue("keepInventory")) {
            return;
        }

        for (int slot = 0; slot < player.inventory.getSizeInventory(); slot++) {
            ItemStack stack = player.inventory.getStackInSlot(slot);
            if (stack != null) {
                storedInventory.add(new StoredItem(slot, stack.copy()));
            }
        }
    }

    public void expireAndDropInventory() {
        if (worldObj != null && !worldObj.isRemote && !inventoryReleased) {
            for (StoredItem storedItem : storedInventory) {
                ItemStack stack = storedItem.stack;
                InfoType type = stack != null ? InfoType.getType(stack) : null;
                if (stack != null && (type == null || type.canDrop)) {
                    entityDropItem(stack.copy(), 0.0F);
                }
            }
            storedInventory.clear();
            inventoryReleased = true;
        }
        setDead();
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        ByteBufUtils.writeUTF8String(buffer, safe(playerName));
        ByteBufUtils.writeUTF8String(buffer, safe(playerDisplayName));
        ByteBufUtils.writeUTF8String(buffer, playerUuid != null ? playerUuid.toString() : "");
        ByteBufUtils.writeUTF8String(buffer, safe(scoreboardTeamName));

        buffer.writeFloat(headRotationX);
        buffer.writeFloat(headRotationY);
        buffer.writeFloat(leftArmRotationX);
        buffer.writeFloat(leftArmRotationY);
        buffer.writeFloat(leftArmRotationZ);
        buffer.writeFloat(rightArmRotationX);
        buffer.writeFloat(rightArmRotationY);
        buffer.writeFloat(rightArmRotationZ);
        buffer.writeFloat(bodyRotationX);
        buffer.writeFloat(bodyRotationY);
        buffer.writeFloat(leftLegRotationX);
        buffer.writeFloat(leftLegRotationY);
        buffer.writeFloat(leftLegRotationZ);
        buffer.writeFloat(rightLegRotationX);
        buffer.writeFloat(rightLegRotationY);
        buffer.writeFloat(rightLegRotationZ);
        buffer.writeBoolean(isDown);
    }

    @Override
    public void readSpawnData(ByteBuf additionalData) {
        playerName = ByteBufUtils.readUTF8String(additionalData);
        playerDisplayName = ByteBufUtils.readUTF8String(additionalData);
        String uuidString = ByteBufUtils.readUTF8String(additionalData);
        try {
            playerUuid = uuidString == null || uuidString.isEmpty() ? null : UUID.fromString(uuidString);
        } catch (IllegalArgumentException ignored) {
            playerUuid = null;
        }
        scoreboardTeamName = ByteBufUtils.readUTF8String(additionalData);

        headRotationX = additionalData.readFloat();
        headRotationY = additionalData.readFloat();
        leftArmRotationX = additionalData.readFloat();
        leftArmRotationY = additionalData.readFloat();
        leftArmRotationZ = additionalData.readFloat();
        rightArmRotationX = additionalData.readFloat();
        rightArmRotationY = additionalData.readFloat();
        rightArmRotationZ = additionalData.readFloat();
        bodyRotationX = additionalData.readFloat();
        bodyRotationY = additionalData.readFloat();
        leftLegRotationX = additionalData.readFloat();
        leftLegRotationY = additionalData.readFloat();
        leftLegRotationZ = additionalData.readFloat();
        rightLegRotationX = additionalData.readFloat();
        rightLegRotationY = additionalData.readFloat();
        rightLegRotationZ = additionalData.readFloat();
        isDown = additionalData.readBoolean();
    }

    public EntityPlayer getOwner() {
        return owner;
    }

    public EntityPlayer getPlayer() {
        if (owner != null) {
            return owner;
        }
        if (worldObj != null && !worldObj.isRemote && playerName != null && MinecraftServer.getServer() != null) {
            EntityPlayerMP player = MinecraftServer.getServer().getConfigurationManager().func_152612_a(playerName);
            if (player != null) {
                owner = player;
            }
        }
        return owner;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerDisplayName() {
        return playerDisplayName != null && !playerDisplayName.isEmpty() ? playerDisplayName : playerName;
    }

    public UUID getPlayerUuid() {
        return playerUuid;
    }

    public String getScoreboardTeamName() {
        return scoreboardTeamName;
    }

    public float getHeadRotationX() {
        return headRotationX;
    }

    public float getHeadRotationY() {
        return headRotationY;
    }

    public float getLeftArmRotationX() {
        return leftArmRotationX;
    }

    public float getLeftArmRotationY() {
        return leftArmRotationY;
    }

    public float getLeftArmRotationZ() {
        return leftArmRotationZ;
    }

    public float getRightArmRotationX() {
        return rightArmRotationX;
    }

    public float getRightArmRotationY() {
        return rightArmRotationY;
    }

    public float getRightArmRotationZ() {
        return rightArmRotationZ;
    }

    public float getBodyRotationX() {
        return bodyRotationX;
    }

    public float getBodyRotationY() {
        return bodyRotationY;
    }

    public float getLeftLegRotationX() {
        return leftLegRotationX;
    }

    public float getLeftLegRotationY() {
        return leftLegRotationY;
    }

    public float getLeftLegRotationZ() {
        return leftLegRotationZ;
    }

    public float getRightLegRotationX() {
        return rightLegRotationX;
    }

    public float getRightLegRotationY() {
        return rightLegRotationY;
    }

    public float getRightLegRotationZ() {
        return rightLegRotationZ;
    }

    public boolean isDown() {
        return isDown;
    }

    private static String safe(String value) {
        return value == null ? "" : value;
    }

    private static final class StoredItem {
        private final int slot;
        private final ItemStack stack;

        private StoredItem(int slot, ItemStack stack) {
            this.slot = slot;
            this.stack = stack;
        }
    }
}
