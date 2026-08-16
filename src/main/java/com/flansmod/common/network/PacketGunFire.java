package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.item.ItemGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketGunFire extends PacketBase {
    private static final double MAX_SHOT_CONTEXT_POSITION_DELTA = 16.0D;

    public boolean held;
    public boolean left;
    public float yaw;
    public float pitch;
    public int intentSequence;
    public int clientTick;
    public double clientPosX;
    public double clientPosY;
    public double clientPosZ;

    @SuppressWarnings("unused")
    public PacketGunFire() {
    }

    public PacketGunFire(boolean left, boolean held, float yaw, float pitch) {
        this(left, held, yaw, pitch, 0, 0, 0D, 0D, 0D);
    }

    public PacketGunFire(boolean left, boolean held, float yaw, float pitch,
            int intentSequence, int clientTick, double clientPosX, double clientPosY, double clientPosZ) {
        this.left = left;
        this.held = held;
        this.yaw = yaw;
        this.pitch = pitch;
        this.intentSequence = intentSequence;
        this.clientTick = clientTick;
        this.clientPosX = clientPosX;
        this.clientPosY = clientPosY;
        this.clientPosZ = clientPosZ;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(held);
        data.writeBoolean(left);
        data.writeFloat(yaw);
        data.writeFloat(pitch);
        data.writeInt(intentSequence);
        data.writeInt(clientTick);
        data.writeDouble(clientPosX);
        data.writeDouble(clientPosY);
        data.writeDouble(clientPosZ);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        held = data.readBoolean();
        left = data.readBoolean();
        yaw = data.readFloat();
        pitch = data.readFloat();
        intentSequence = data.readInt();
        clientTick = data.readInt();
        clientPosX = data.readDouble();
        clientPosY = data.readDouble();
        clientPosZ = data.readDouble();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        if (Float.isNaN(yaw) || Float.isInfinite(yaw) || Float.isNaN(pitch) || Float.isInfinite(pitch)
                || pitch < -90F || pitch > 90F)
            return;

        ItemStack currentItem = playerEntity.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
            PlayerData data = PlayerHandler.getPlayerData(playerEntity);
            if (data != null) {
                data.shotYaw = yaw;
                data.shotPitch = pitch;
                data.hasShotAim = true;

                // Position sent by the client is intent context only. Keep the server's
                // receipt position alongside it and reject implausible coordinates before
                // preserving the context for later historical-origin reconstruction.
                double deltaX = clientPosX - playerEntity.posX;
                double deltaY = clientPosY - playerEntity.posY;
                double deltaZ = clientPosZ - playerEntity.posZ;
                double maxDeltaSq = MAX_SHOT_CONTEXT_POSITION_DELTA * MAX_SHOT_CONTEXT_POSITION_DELTA;
                if (isFinite(clientPosX) && isFinite(clientPosY) && isFinite(clientPosZ)
                        && deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ <= maxDeltaSq) {
                    data.shotIntentSequence = intentSequence;
                    data.shotClientTick = clientTick;
                    data.shotClientPosX = clientPosX;
                    data.shotClientPosY = clientPosY;
                    data.shotClientPosZ = clientPosZ;
                    data.shotIntentReceivedNanos = System.nanoTime();
                    data.shotIntentServerPosX = playerEntity.posX;
                    data.shotIntentServerPosY = playerEntity.posY;
                    data.shotIntentServerPosZ = playerEntity.posZ;
                    data.shotIntentLeft = left;
                    data.shotIntentHeld = held;
                    // Capture the server-validated ADS state with the same aim intent.
                    // Full-auto shots may be emitted later in the tick, so reading
                    // data.isScoped at shot time can otherwise use a different state.
                    data.shotIntentServerScoped = data.isScoped;
                    data.hasShotContext = true;
                } else {
                    data.hasShotContext = false;
                }
            }
            ((ItemGun) currentItem.getItem()).onMouseHeld(currentItem, playerEntity.worldObj, playerEntity, left, held);
        }
    }

    private static boolean isFinite(double value) {
        return !Double.isNaN(value) && !Double.isInfinite(value);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received gun button packet on client. Skipping.");
    }
}
