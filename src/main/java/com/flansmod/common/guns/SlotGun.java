package com.flansmod.common.guns;

import com.flansmod.common.guns.item.ItemAttachment;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotGun extends Slot 
{
	private int slotID;
	private SlotGun gunSlot;
	
	public SlotGun(IInventory inventory, int i, int x, int y, SlotGun s) 
	{
		super(inventory, i, x, y);
		slotID = i;
		gunSlot = s;
	}

    public boolean isItemValid(ItemStack stack)
    {
        if (stack == null) return true;
        if (slotID == 0)
            return stack.getItem() instanceof ItemGun && !((ItemGun) stack.getItem()).type.deployable;
        if (!canAttachToCurrentGun(stack)) return false;

        GunType gunType = ((ItemGun) gunSlot.getStack().getItem()).type;
        EnumAttachmentType type = ((ItemAttachment) stack.getItem()).type.type;
        switch (slotID)
        {
            case 1: return gunType.allowBarrelAttachments && type == EnumAttachmentType.barrel;
            case 2: return gunType.allowScopeAttachments && type == EnumAttachmentType.sights;
            case 3: return gunType.allowStockAttachments && type == EnumAttachmentType.stock;
            case 4: return gunType.allowGripAttachments && type == EnumAttachmentType.grip;
            case 5: return gunType.allowGadgetAttachments && type == EnumAttachmentType.gadget;
            case 6: return gunType.allowSlideAttachments && type == EnumAttachmentType.slide;
            case 7: return gunType.allowPumpAttachments && type == EnumAttachmentType.pump;
            case 8: return gunType.allowAccessoryAttachments && type == EnumAttachmentType.accessory;
            default: return slotID - 9 + ((InventoryGunModTable) inventory).genericScroll * 4
                    < gunType.numGenericAttachmentSlots && type == EnumAttachmentType.generic;
        }
    }

    @Override
    public int getSlotStackLimit()
    {
        return 1;
    }
    
    public boolean canAttachToCurrentGun(ItemStack stack)
    {
    	if(stack == null || !(stack.getItem() instanceof ItemAttachment) || !gunSlot.getHasStack() || !(gunSlot.getStack().getItem() instanceof ItemGun))
    		return false;
		AttachmentType attachmentType = ((ItemAttachment)stack.getItem()).type;
		GunType gunType = ((ItemGun)gunSlot.getStack().getItem()).type;
		if (!gunType.isAttachmentCompatible(attachmentType))
			return false;
		if(attachmentType.type == EnumAttachmentType.sights && !gunType.allowedScopeAttachments.isEmpty())
			return gunType.allowedScopeAttachments.contains(attachmentType);
		return gunType.allowAllAttachments || gunType.allowedAttachments.contains(attachmentType);
    }
}
