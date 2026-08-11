package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.FlashlightState;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

/** Synchronises a held gun's flashlight state to every client in the dimension. */
public class PacketToggleFlashlight extends PacketBase {
    private int playerEntityId = -1;
    private boolean enabled;

    public PacketToggleFlashlight() {
    }

    /** Client-to-server request. */
    public PacketToggleFlashlight(boolean enabled) {
        this.enabled = enabled;
    }

    /** Server-to-client authoritative state. */
    private PacketToggleFlashlight(int playerEntityId, boolean enabled) {
        this.playerEntityId = playerEntityId;
        this.enabled = enabled;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(playerEntityId);
        data.writeBoolean(enabled);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        playerEntityId = data.readInt();
        enabled = data.readBoolean();
    }

    @Override
    public void handleServerSide(EntityPlayerMP player) {
        ItemStack heldGun = player.getCurrentEquippedItem();
        if (!FlashlightState.hasFlashlight(heldGun))
            return;

        boolean authoritativeState = enabled;
        if (FlashlightState.isEnabled(heldGun) == authoritativeState)
            return;

        FlashlightState.setEnabled(heldGun, authoritativeState);
        player.inventory.markDirty();
        player.inventoryContainer.detectAndSendChanges();
        FlansMod.getPacketHandler().sendToDimension(
                new PacketToggleFlashlight(player.getEntityId(), authoritativeState),
                player.dimension);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        Entity entity = clientPlayer.worldObj.getEntityByID(playerEntityId);
        if (entity instanceof EntityPlayer) {
            ItemStack heldGun = ((EntityPlayer)entity).getCurrentEquippedItem();
            if (heldGun != null) {
                FlashlightState.setEnabled(heldGun, enabled);
            }
        }
        if (playerEntityId == clientPlayer.getEntityId()) {
            FlansModClient.isFlashLight = enabled;
        }
    }
}
