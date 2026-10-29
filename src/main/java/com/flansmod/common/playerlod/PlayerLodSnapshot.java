package com.flansmod.common.playerlod;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/** Immutable after publication. Contains presentation data only, never client hitboxes. */
public final class PlayerLodSnapshot {
    public static final int MAX_PLAYERS = 256;
    public final long sequence;
    public final int dimension, range, serverViewDistance;
    public final UUID viewer;
    public final List<Entry> entries;

    public PlayerLodSnapshot(long sequence, int dimension, int range, int serverViewDistance, UUID viewer, List<Entry> entries) {
        this.sequence = sequence;
        this.dimension = dimension;
        this.range = range;
        this.serverViewDistance = serverViewDistance;
        this.viewer = viewer;
        this.entries = entries;
    }

    public void write(ByteBuf out) {
        out.writeLong(sequence);
        out.writeInt(dimension);
        out.writeShort(range);
        out.writeByte(serverViewDistance);
        uuid(out, viewer);
        out.writeShort(entries.size());
        for (Entry entry : entries) entry.write(out);
    }

    public static PlayerLodSnapshot read(ByteBuf in) {
        long sequence = in.readLong();
        int dimension = in.readInt(), range = in.readUnsignedShort(), viewDistance = in.readUnsignedByte();
        UUID viewer = uuid(in);
        int count = in.readUnsignedShort();
        if (range > 1024 || viewDistance < 1 || viewDistance > 64 || count > MAX_PLAYERS)
            throw new IllegalArgumentException("Invalid player LOD bounds");
        List<Entry> entries = new ArrayList<Entry>(count);
        java.util.HashSet<UUID> identities = new java.util.HashSet<UUID>();
        for (int i = 0; i < count; i++) {
            Entry entry = new Entry(in);
            if (!identities.add(entry.uuid) || entry.uuid.equals(viewer))
                throw new IllegalArgumentException("Duplicate/self player LOD");
            entries.add(entry);
        }
        if (in.isReadable()) throw new IllegalArgumentException("Trailing player LOD bytes");
        return new PlayerLodSnapshot(sequence, dimension, range, viewDistance, viewer, entries);
    }

    private static void uuid(ByteBuf out, UUID uuid) {
        out.writeLong(uuid.getMostSignificantBits()); out.writeLong(uuid.getLeastSignificantBits());
    }
    private static UUID uuid(ByteBuf in) { return new UUID(in.readLong(), in.readLong()); }

    public static final class Entry {
        public final UUID uuid;
        public final int id, revision, brightness, flags, ticks;
        public final double x, y, z;
        public final float yaw, pitch, headYaw, bodyYaw, limb, limbAmount, swing, bedYaw;
        public final Appearance appearance;

        public Entry(EntityPlayerMP player, int revision, Appearance appearance) {
            uuid = player.getUniqueID(); id = player.getEntityId(); this.revision = revision;
            this.appearance = appearance;
            x = player.posX; y = player.posY; z = player.posZ;
            yaw = player.rotationYaw; pitch = player.rotationPitch;
            headYaw = player.rotationYawHead; bodyYaw = player.renderYawOffset;
            limb = player.limbSwing; limbAmount = player.limbSwingAmount;
            swing = player.swingProgress; bedYaw = bedYaw(player);
            flags = (player.isSneaking() ? 1 : 0) | (player.isSprinting() ? 2 : 0)
                    | (player.isInvisible() ? 4 : 0) | (player.isBurning() ? 8 : 0)
                    | (player.isRiding() ? 16 : 0) | (player.isPlayerSleeping() ? 32 : 0)
                    | (player.isUsingItem() ? 64 : 0);
            ticks = player.ticksExisted;
            int bx = net.minecraft.util.MathHelper.floor_double(x), bz = net.minecraft.util.MathHelper.floor_double(z);
            int by = net.minecraft.util.MathHelper.floor_double(y + player.height * 0.66D);
            int sky = player.worldObj.getSavedLightValue(net.minecraft.world.EnumSkyBlock.Sky, bx, by, bz);
            int block = player.worldObj.getSavedLightValue(net.minecraft.world.EnumSkyBlock.Block, bx, by, bz);
            brightness = (sky << 20) | (block << 4);
        }

        private Entry(ByteBuf in) {
            uuid = uuid(in); id = in.readInt(); revision = in.readInt();
            x = in.readDouble(); y = in.readDouble(); z = in.readDouble();
            yaw = number(in); pitch = number(in); headYaw = number(in); bodyYaw = number(in);
            limb = number(in); limbAmount = number(in); swing = number(in); bedYaw = number(in);
            flags = in.readUnsignedByte(); ticks = in.readInt(); brightness = in.readInt();
            if (!Double.isFinite(x) || !Double.isFinite(y) || !Double.isFinite(z)
                    || Math.abs(x) > 30000000 || Math.abs(z) > 30000000 || Math.abs(y) > 65536
                    || id < 0 || revision < 0 || flags > 127)
                throw new IllegalArgumentException("Invalid player LOD pose");
            appearance = in.readBoolean() ? new Appearance(in, uuid) : null;
        }

        private static float number(ByteBuf in) {
            float value = in.readFloat();
            if (!Float.isFinite(value)) throw new IllegalArgumentException("Nonfinite player LOD pose");
            return value;
        }

        private static float bedYaw(EntityPlayerMP player) {
            if (!player.isPlayerSleeping() || player.playerLocation == null) return 0;
            net.minecraft.util.ChunkCoordinates bed = player.playerLocation;
            int direction = player.worldObj.getBlock(bed.posX, bed.posY, bed.posZ)
                    .getBedDirection(player.worldObj, bed.posX, bed.posY, bed.posZ);
            return direction == 0 ? 90 : direction == 2 ? 270 : direction == 3 ? 180 : 0;
        }

        private void write(ByteBuf out) {
            uuid(out, uuid); out.writeInt(id); out.writeInt(revision);
            out.writeDouble(x); out.writeDouble(y); out.writeDouble(z);
            out.writeFloat(yaw); out.writeFloat(pitch); out.writeFloat(headYaw); out.writeFloat(bodyYaw);
            out.writeFloat(limb); out.writeFloat(limbAmount); out.writeFloat(swing); out.writeFloat(bedYaw);
            out.writeByte(flags); out.writeInt(ticks); out.writeInt(brightness);
            out.writeBoolean(appearance != null);
            if (appearance != null) appearance.write(out);
        }
    }

    public static final class Appearance {
        public final GameProfile profile;
        // Main hand, four armour slots, offhand, night vision, face.
        public final ItemStack[] equipment = new ItemStack[8];

        public Appearance(EntityPlayerMP player) {
            profile = new GameProfile(player.getUniqueID(), player.getCommandSenderName());
            profile.getProperties().putAll(player.getGameProfile().getProperties());
            for (int i = 0; i < 5; i++) equipment[i] = copy(player.getEquipmentInSlot(i));
            PlayerData data = PlayerHandler.getPlayerData(player);
            if (data.offHandGunSlot > 0 && data.offHandGunSlot <= player.inventory.getSizeInventory())
                equipment[5] = copy(player.inventory.getStackInSlot(data.offHandGunSlot - 1));
            equipment[6] = copy(PlayerEquipmentInventory.getStack(player, 0));
            equipment[7] = copy(PlayerEquipmentInventory.getStack(player, 1));
        }

        private Appearance(ByteBuf in, UUID uuid) {
            String name = ByteBufUtils.readUTF8String(in);
            if (name.length() < 1 || name.length() > 16) throw new IllegalArgumentException("Invalid profile name");
            profile = new GameProfile(uuid, name);
            int count = in.readUnsignedByte();
            if (count > 16) throw new IllegalArgumentException("Too many profile properties");
            for (int i = 0; i < count; i++) {
                String key = ByteBufUtils.readUTF8String(in), value = ByteBufUtils.readUTF8String(in);
                String signature = in.readBoolean() ? ByteBufUtils.readUTF8String(in) : null;
                if (key.length() > 64 || value.length() > 16384 || signature != null && signature.length() > 4096)
                    throw new IllegalArgumentException("Oversized profile property");
                profile.getProperties().put(key, new Property(key, value, signature));
            }
            for (int i = 0; i < equipment.length; i++) equipment[i] = ByteBufUtils.readItemStack(in);
        }

        private void write(ByteBuf out) {
            ByteBufUtils.writeUTF8String(out, profile.getName());
            if (profile.getProperties().size() > 16) throw new IllegalArgumentException("Too many profile properties");
            out.writeByte(profile.getProperties().size());
            for (Property property : profile.getProperties().values()) {
                ByteBufUtils.writeUTF8String(out, property.getName());
                ByteBufUtils.writeUTF8String(out, property.getValue());
                out.writeBoolean(property.hasSignature());
                if (property.hasSignature()) ByteBufUtils.writeUTF8String(out, property.getSignature());
            }
            for (ItemStack stack : equipment) ByteBufUtils.writeItemStack(out, stack);
        }

        public boolean same(Appearance other) {
            if (other == null || !profile.getName().equals(other.profile.getName())
                    || !profile.getProperties().equals(other.profile.getProperties())) return false;
            for (int i = 0; i < equipment.length; i++)
                if (!ItemStack.areItemStacksEqual(equipment[i], other.equipment[i])) return false;
            return true;
        }
        private static ItemStack copy(ItemStack stack) { return stack == null ? null : stack.copy(); }
    }
}
