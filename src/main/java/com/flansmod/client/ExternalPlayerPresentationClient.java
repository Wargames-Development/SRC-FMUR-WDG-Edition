package com.flansmod.client;

import com.flansmod.common.PlayerData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.playerlod.ExternalPlayerPresentation;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/** Client model context for a detached actor. Never mutates the native player's presentation maps. */
@SideOnly(Side.CLIENT)
public final class ExternalPlayerPresentationClient {
    public static final int API_VERSION=2;
    private ExternalPlayerPresentationClient() { }
    public static Context create(EntityPlayer actor) { return new Context(actor); }
    public static final class Context implements AutoCloseable {
        private final EntityPlayer actor;
        private final PlayerData data;
        private boolean extensions;
        private Context(EntityPlayer actor) { this.actor=actor;data=new PlayerData(actor.getCommandSenderName()); }
        public void appearance(NBTTagCompound tag,boolean extensions) {
            this.extensions=extensions;
            data.offHandGunStack=extensions?read(tag,"offhand"):null;data.offHandGunSlot=data.offHandGunStack==null?0:1;
            PlayerEquipmentInventory equipment=PlayerEquipmentInventory.get(actor);
            if(equipment!=null) equipment.setSyncedContents(extensions?read(tag,"night"):null,extensions?read(tag,"face"):null);
        }
        public AutoCloseable begin() { return ExternalPlayerPresentation.beginVisual(actor.getCommandSenderName(),data,extensions); }
        public void close() { FlansMod.gunAnimationsLeft.remove(actor);FlansMod.gunAnimationsRight.remove(actor); }
        private static ItemStack read(NBTTagCompound tag,String key) { return tag.hasKey(key,10)?ItemStack.loadItemStackFromNBT(tag.getCompoundTag(key)):null; }
    }
}
