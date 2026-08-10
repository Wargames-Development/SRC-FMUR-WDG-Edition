package com.flansmod.common.network;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.item.ItemGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;


//Packets must be registered in .network.PacketHandler!
public class PacketGunState extends PacketBase 
{
	
	boolean isScoped;
	public PacketGunState()
	{

	}
	
	public PacketGunState(boolean isScoped)
	{
		this.isScoped = isScoped;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(isScoped);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		isScoped = data.readBoolean();
	}

	@Override
	public void handleServerSide(final EntityPlayerMP player)
	{
		final boolean scoped = isScoped;
		PacketHandler.enqueueServerTask(new Runnable() {
			@Override
			public void run() {
				boolean holdingGun = player.getCurrentEquippedItem() != null
						&& player.getCurrentEquippedItem().getItem() instanceof ItemGun;
				PlayerData data = PlayerHandler.getPlayerData(player);
				if (data != null)
					data.isScoped = scoped && holdingGun;

				if(holdingGun)
				{
					ItemGun itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
					ItemStack itemstack = player.getCurrentEquippedItem();
					AttachmentType scope = itemGun.type.getScope(itemstack);
					boolean hasNightVision = itemGun.type.allowNightVision || scope != null && scope.hasNightVision;

					if(hasNightVision && scoped)
					{
						player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1200, 0));
						if (!ServerTickEvent.nightVisionPlayers.contains(player))
							ServerTickEvent.nightVisionPlayers.add(player);
					}
					else if(hasNightVision)
					{
						player.removePotionEffect(Potion.nightVision.id);
						ServerTickEvent.nightVisionPlayers.remove(player);
					}
				}
			}
		});
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{

	}
}
