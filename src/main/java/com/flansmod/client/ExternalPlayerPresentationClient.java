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
    public static final int API_VERSION=3;
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
        public void pose(byte[] firstBytes,byte[] lastBytes,float fraction,float age) {
            if(!extensions || firstBytes.length==0) return;
            com.flansmod.common.playerlod.PlayerVisualPose first=com.flansmod.common.playerlod.PlayerVisualPose.decode(firstBytes);
            com.flansmod.common.playerlod.PlayerVisualPose last=lastBytes.length==0?first:com.flansmod.common.playerlod.PlayerVisualPose.decode(lastBytes);
            com.flansmod.common.playerlod.PlayerVisualPose current=fraction>=1?last:first;
            data.isScoped=current.scoped;data.minigunSpeed=first.minigun+(last.minigun-first.minigun)*fraction;
            apply(actor.getHeldItem(),false,first,last,current,fraction,age);
            apply(data.offHandGunStack,true,first,last,current,fraction,age);
        }
        private void apply(ItemStack stack,boolean left,com.flansmod.common.playerlod.PlayerVisualPose first,
                com.flansmod.common.playerlod.PlayerVisualPose last,com.flansmod.common.playerlod.PlayerVisualPose current,float fraction,float age) {
            if(stack==null || !(stack.getItem() instanceof com.flansmod.common.guns.item.ItemGun)) return;
            com.flansmod.client.model.GunAnimations animation=FlansModClient.getGunAnimations(actor,left);
            float total=left?current.leftTotal:current.rightTotal;
            float remaining=com.flansmod.common.playerlod.PlayerVisualPose.remaining(left?first.leftTotal:first.rightTotal,
                left?first.leftRemaining:first.rightRemaining,left?last.leftTotal:last.rightTotal,left?last.leftRemaining:last.rightRemaining,fraction);
            animation.reloading=total>0 && remaining>0;animation.reloadAnimationTime=total;
            animation.reloadTimeLeft=(int)Math.ceil(remaining);animation.reloadAmmoCount=Math.max(1,left?current.leftCount:current.rightCount);
            animation.lastReloadAnimationProgress=animation.reloadAnimationProgress=total>0?Math.max(0,Math.min(1,1-remaining/total)):0;
            int shot=left?current.leftShotAge:current.rightShotAge;
            // A later snapshot may describe a shot whose exact tick is already on this interpolated timeline.
            int later=left?last.leftShotAge:last.rightShotAge;
            if(later!=Integer.MIN_VALUE && later<=age && later>shot) shot=later;
            double elapsed=shot==Integer.MIN_VALUE?Double.POSITIVE_INFINITY:age-shot;
            boolean shotVisible=elapsed>=0 && elapsed<40;
            animation.lastGunRecoil=animation.gunRecoil=shotVisible?(float)(animation.recoilAmount*Math.pow(.7,elapsed)):0;
            animation.lastGunSlide=animation.gunSlide=shotVisible?(float)(elapsed<1?1-elapsed*.1:.9*Math.pow(.5,elapsed-1)):0;
            animation.muzzleFlashTime=shotVisible && elapsed<2?2:0;
            animation.flashInt=shot;animation.muzzleFlashRotation=(shot & 255)*360F/256;animation.showMuzzleFireball=true;
            com.flansmod.client.model.ModelGun model=((com.flansmod.common.guns.item.ItemGun)stack.getItem()).type.model;
            if(model!=null) {
                double pump=elapsed-model.pumpDelay;
                animation.lastPumped=animation.pumped=shotVisible && pump>=0 && pump<Math.max(1,model.pumpTime)
                    ?(float)(-1+2*pump/Math.max(1,model.pumpTime)):-1;
                animation.hammerRotation=model.hammerAngle;animation.althammerRotation=model.althammerAngle;
            }
            // Never call doShoot/doReload/update: those own sounds, local recoil and action effects.
            animation.actionSoundPending=false;animation.localPlayerReload=false;
            animation.minigunBarrelRotation=(float)((age*data.minigunSpeed)%360);
        }
        public AutoCloseable begin() { return ExternalPlayerPresentation.beginVisual(actor.getCommandSenderName(),data,extensions); }
        public void close() { FlansMod.gunAnimationsLeft.remove(actor);FlansMod.gunAnimationsRight.remove(actor); }
        private static ItemStack read(NBTTagCompound tag,String key) { return tag.hasKey(key,10)?ItemStack.loadItemStackFromNBT(tag.getCompoundTag(key)):null; }
    }
}
