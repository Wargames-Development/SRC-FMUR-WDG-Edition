package com.flansmod.common.network;

import com.flansmod.common.guns.item.ItemGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketGunSpread extends PacketBase
{
    private float spread = 0F;

    //Default Constructor
    public PacketGunSpread()
    {}

    public PacketGunSpread(ItemStack stack, float amount)
    {
        if(stack != null && stack.getItem() instanceof ItemGun)
            spread = amount;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        data.writeFloat(spread);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        spread = data.readFloat();
    }
// TODO : 优化
    @Override
    public void handleServerSide(EntityPlayerMP player)
    {
        // Kept as a registered no-op for compatibility with older clients.
        // Gun definition spread must never be overwritten by client input.
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer client)
    {
//        ItemStack stack = client.inventory.getCurrentItem();
//        if(stack != null && stack.getItem() instanceof ItemGun)
//            ((ItemGun)stack.getItem()).type.bulletSpread = spread;
    }
}
