package com.flansmod.common.network;

import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

/** Synchronizes the two server-owned equipment slots to observing clients. */
public class PacketZPlayerEquipmentSync extends PacketBase {
    private int entityId;
    private ItemStack nightVision;
    private ItemStack face;

    public PacketZPlayerEquipmentSync() {
    }

    public PacketZPlayerEquipmentSync(EntityPlayer player) {
        entityId = player.getEntityId();
        PlayerEquipmentInventory equipment = PlayerEquipmentInventory.get(player);
        if (equipment != null) {
            nightVision = copy(equipment.getStackInSlot(PlayerEquipmentInventory.NIGHT_VISION_SLOT));
            face = copy(equipment.getStackInSlot(PlayerEquipmentInventory.FACE_SLOT));
        }
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityId);
        ByteBufUtils.writeItemStack(data, nightVision);
        ByteBufUtils.writeItemStack(data, face);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityId = data.readInt();
        nightVision = ByteBufUtils.readItemStack(data);
        face = ByteBufUtils.readItemStack(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP player) {
        PlayerEquipmentInventory equipment = PlayerEquipmentInventory.get(player);
        boolean valid = player.capabilities.isCreativeMode && equipment != null
                && (nightVision == null || PlayerEquipmentInventory.isValidForSlot(nightVision,
                PlayerEquipmentInventory.NIGHT_VISION_SLOT))
                && (face == null || PlayerEquipmentInventory.isValidForSlot(face,
                PlayerEquipmentInventory.FACE_SLOT));
        if (!valid) {
            com.flansmod.common.FlansMod.getPacketHandler().sendTo(
                    new PacketZPlayerEquipmentSync(player), player);
            return;
        }
        if (nightVision != null) {
            nightVision.stackSize = 1;
        }
        if (face != null) {
            face.stackSize = 1;
        }
        equipment.setServerContents(nightVision, face);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        Entity entity = clientPlayer.worldObj.getEntityByID(entityId);
        if (entity instanceof EntityPlayer) {
            PlayerEquipmentInventory equipment = PlayerEquipmentInventory.get((EntityPlayer)entity);
            if (equipment != null) {
                equipment.setSyncedContents(nightVision, face);
            }
        }
    }

    private static ItemStack copy(ItemStack stack) {
        return stack == null ? null : stack.copy();
    }
}
