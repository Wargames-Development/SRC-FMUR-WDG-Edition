package com.flansmod.common.network;

import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EnumFireMode;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketMinigunStart extends PacketBase {

    boolean isStart = false;

    public PacketMinigunStart(boolean isStart) {
        this.isStart = isStart;
    }

    public PacketMinigunStart() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(isStart);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        isStart = data.readBoolean();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        ItemStack heldStack = playerEntity.getCurrentEquippedItem();
        if(heldStack != null && heldStack.getItem() instanceof ItemGun) {
            PlayerData data = PlayerHandler.getPlayerData(playerEntity);
            if (data == null)
                return;

            float maxStartSpeed = -1F;
            ItemGun heldGun = (ItemGun) heldStack.getItem();
            if (heldGun.type.getFireMode(heldStack) == EnumFireMode.MINIGUN || heldGun.type.useLoopingSounds)
                maxStartSpeed = heldGun.type.minigunStartSpeed;

            if (data.offHandGunSlot > 0 && data.offHandGunSlot <= 9) {
                ItemStack offHandStack = playerEntity.inventory.getStackInSlot(data.offHandGunSlot - 1);
                if (offHandStack != null && offHandStack.getItem() instanceof ItemGun) {
                    ItemGun offHandGun = (ItemGun) offHandStack.getItem();
                    if (offHandGun.type.getFireMode(offHandStack) == EnumFireMode.MINIGUN || offHandGun.type.useLoopingSounds)
                        maxStartSpeed = Math.max(maxStartSpeed, offHandGun.type.minigunStartSpeed);
                }
            }
            if (maxStartSpeed < 0F)
                return;

            long currentTick = playerEntity.worldObj.getTotalWorldTime();
            if (data.minigunPacketTick != currentTick) {
                data.minigunPacketTick = currentTick;
                data.minigunPacketsThisTick = 0;
            }
            if (data.minigunPacketsThisTick >= 2)
                return;
            data.minigunPacketsThisTick++;

            data.minigunSpeed += 2F;
            if(data.minigunSpeed > maxStartSpeed) {
                data.minigunSpeed = maxStartSpeed + 2;
            }
        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
