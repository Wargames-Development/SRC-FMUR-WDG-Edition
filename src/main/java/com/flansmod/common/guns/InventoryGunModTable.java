package com.flansmod.common.guns;

import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.GunType;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class InventoryGunModTable extends InventoryBasic
{
	public InventoryGunModTable() 
	{
		super("Gun Modification Table", true, 17);
	}

	public ItemStack lastGunStack;
	public GunType gunType;
	public int genericScroll = 0;
	/** Hacky way to change slots within onInventoryChanged without causing a huge stack overflow */
	private boolean busy = false;
	
	@Override
	public void markDirty() 
	{
		if(busy)
			return;
		ItemStack gunStack = getStackInSlot(0);
		if(gunStack == null || !(gunStack.getItem() instanceof ItemGun))
		{
			if (lastGunStack != null)
			{
				busy = true;
				for (int i = 1; i < getSizeInventory(); i++)
					setInventorySlotContents(i, null);
				busy = false;
				lastGunStack = null;
				gunType = null;
			}
			return;
		}
		
		gunType = ((ItemGun)gunStack.getItem()).type;
		gunType.checkForTags(gunStack);
		NBTTagCompound attachmentTags = gunStack.stackTagCompound.getCompoundTag("attachments");
		String[] tags = {"barrel", "scope", "stock", "grip", "gadget", "slide", "pump", "accessory"};
		
		//If we changed the gun (i.e. a new gun has been placed in the table)
		if(gunStack != lastGunStack)
		{
			busy = true;
			for(int i = 0; i < 8; i++)
				setInventorySlotContents(i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag(tags[i])));

			genericScroll = 0;
			for (int i = 0; i < 8; i++)
				setInventorySlotContents(tags.length + i + 1, i < gunType.numGenericAttachmentSlots
						? ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag("generic_" + i)) : null);
			busy = false;
		}
		//Else we changed an attachment
		else
		{
			// Update only the table's attachment slots in the gun's existing NBT.
			for(int i = 0; i < 8; i++)
				writeAttachmentTags(attachmentTags, getStackInSlot(i + 1), tags[i]);
	
			int start = genericScroll * 4;
			for (int i = start; i < Math.min(gunType.numGenericAttachmentSlots, start + 8); i++)
				writeAttachmentTags(attachmentTags, getStackInSlot(i - start + tags.length + 1), "generic_" + i);
			gunStack.stackTagCompound.setTag("attachments", attachmentTags);
		}
		
		lastGunStack = gunStack;
	}
	
	public void writeAttachmentTags(NBTTagCompound attachmentTags, ItemStack attachmentStack, String attachmentName)
	{
		NBTTagCompound tags = new NBTTagCompound();
		if(attachmentStack != null)
			attachmentStack.writeToNBT(tags);
        attachmentTags.setTag(attachmentName, tags);
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) 
	{
		return false;
	}

}
