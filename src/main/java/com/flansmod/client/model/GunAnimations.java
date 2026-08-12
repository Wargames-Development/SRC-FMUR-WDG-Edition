package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketGunState;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class GunAnimations {
    public static GunAnimations defaults = new GunAnimations();

    /**
     * 换弹动画剩余时间 自动减少 0为结束
     */
    public int reloadTimeLeft = 0;

    /**
     * (Purely aesthetic) gun animation variables
     */
    public boolean isGunEmpty;
    /**
     * Recoil
     */
    public float gunRecoil = 0F, lastGunRecoil = 0F, recoilAmount = 0.33F, recoilProgress = 0F, lastRecoilProgress = 0F;
    public boolean startRecoil = false;
    /**
     * Slide
     */
    public float gunSlide = 0F, lastGunSlide = 0F;
    /**
     * Delayed Reload Animations
     */
    public int timeUntilPump = 0, timeToPumpFor = 0;
    /**
     * Delayed Reload Animations : -1, 1 = At rest, 0 = Mid Animation
     */
    public float pumped = -1F, lastPumped = -1F;
    /**
     * Delayed Reload Animations : Doing the delayed animation
     */
    public boolean pumping = false;
    /**
     * Charge handle variables
     */
    public int timeUntilCharge = 0, timeToChargeFor = 0;
    public float charged = -1F, lastCharged = -1F;
    public boolean charging = false;

    public boolean reloading = false;
    private boolean reloadInProgress = false;
    private int reloadingSlot = -1;
    private Item reloadingItem;
    private PositionedSoundRecord reloadSound;
    public float reloadAnimationTime = 0;
    public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
    public int reloadAmmoCount = 1;

    public boolean singlesReload = false;

    public float minigunBarrelRotation = 0F;
    public float minigunBarrelRotationSpeed = 0F;

    public int muzzleFlashTime = 0;
    public int flashInt = 0;

    /**
     * Casing mechanics
     */
    public int timeUntilCasing = 0;
    public int casingStage = 0;
    public int lastCasingStage = 0;

    /* Hammer model mechanics */
    /**
     * If in single action, the model will play a modified animation and delay hammer reset
     */
    public float hammerRotation = 0F;
    public float althammerRotation = 0F;
    public int timeUntilPullback = 0;
    public float gunPullback = -1F, lastGunPullback = -1F;
    public boolean isFired = false;

    public Vector3f casingRandom = new Vector3f(0F, 0F, 0F);

    public boolean tacticalReload = false;

    /**
     * Melee animations
     */
    public int meleeAnimationProgress = 0, meleeAnimationLength = 0;

    public GunAnimations() {

    }

    public int getReloadTimeLeft(int equippedSlot, ItemStack equippedGun) {
        return isReloadEquipped(equippedSlot, equippedGun) ? reloadTimeLeft : 0;
    }

    public void update() {
        update(-1, null);
    }

    public void update(int equippedSlot, ItemStack equippedGun) {

        boolean reloadEquipped = isReloadEquipped(equippedSlot, equippedGun);
        if (reloading && !reloadEquipped)
            stopReloadSound();
        reloading = reloadEquipped;

        if(reloadEquipped && reloadTimeLeft > 0)
            reloadTimeLeft--;

        FlansModClient.reloadStart = reloadEquipped && reloadTimeLeft == 1;

        //Assign values
        lastPumped = pumped;
        lastCharged = charged;
        lastGunPullback = gunPullback;
        lastCasingStage = casingStage;

        //Time until pump-action
        if ((!reloadInProgress || reloadEquipped) && timeUntilPump > 0) {
            timeUntilPump--;
            if (timeUntilPump == 0) {
                //Pump it!
                pumping = true;
                lastPumped = pumped = -1F;
                FlansModClient.shotState = 1;
            }

        }

        //Timer until pulling back the charge handle/bolt
        if ((!reloadInProgress || reloadEquipped) && timeUntilCharge > 0) {
            timeUntilCharge--;
            if (timeUntilCharge == 0) {
                //Pump it!
                charging = true;
                lastCharged = charged = -1F;
            }

        }

        //Time until hammer pullback
        if (timeUntilPullback > 0) {
            timeUntilPullback--;
            if (timeUntilPullback == 0) {
                //Reset the hammer
                isFired = true;
                lastGunPullback = gunPullback = -1F;
            }
        } else {
            //Automatically reset hammer
            hammerRotation *= 0.6F;
            althammerRotation *= 0.6F;
        }

        //Time until bullet casing ejection
        if (timeUntilCasing > 0) {
            timeUntilCasing--;
            if (timeUntilCasing == 0)
                casingStage++;
        } else {
            casingStage++;
        }

        if (muzzleFlashTime > 0)
            muzzleFlashTime--;

        if (pumping) {
            pumped += 2F / timeToPumpFor;
            if (pumped >= 0.999F)
                pumping = false;
        }
        if (charging) {
            charged += 2F / timeToChargeFor;
            if (charged >= 0.999F)
                charging = false;
        }

        if (isFired) {
            gunPullback += 2F / 4;
            if (gunPullback >= 0.999F)
                isFired = false;
        }

        //Recoil model
        lastGunRecoil = gunRecoil;
        if (gunRecoil > 0)
            gunRecoil *= 0.7F;

        lastRecoilProgress = recoilProgress;
        if(startRecoil) {
            recoilProgress += 1F / (20 * 0.56667);
        }
        if(startRecoil && recoilProgress >= 1F) {
            startRecoil = false;
        }

        //Slide model
        lastGunSlide = gunSlide;
        if (isGunEmpty)
            lastGunSlide = gunSlide = 0.5F;
        if (!isGunEmpty && gunSlide > 0.9)    //Add one extra frame to slide
            gunSlide -= 0.1F;
        else if (gunSlide > 0 && !isGunEmpty)
            gunSlide *= 0.5F;

        //Reload
        lastReloadAnimationProgress = reloadAnimationProgress;
        if (reloading)
            reloadAnimationProgress += 1F / reloadAnimationTime;
        if (reloading && reloadAnimationProgress >= 0.9F)    //reset if slide locked
            isGunEmpty = false;
        if (reloading && reloadAnimationProgress >= 1F) {
            reloading = false;
            reloadInProgress = false;
            reloadingSlot = -1;
            reloadingItem = null;
            stopReloadSound();
        }


        minigunBarrelRotation += minigunBarrelRotationSpeed;
        minigunBarrelRotationSpeed *= 0.9F;

        if (meleeAnimationLength > 0) {
            meleeAnimationProgress++;
            //If we are done, reset
            if (meleeAnimationProgress > meleeAnimationLength)
                meleeAnimationProgress = meleeAnimationLength = 0;
        }
    }

    //Not to be used for mechas
    public void onGunEmpty(boolean atLastBullet) {
        isGunEmpty = atLastBullet;
    }

    public void miniGunRotate() {
        minigunBarrelRotationSpeed += 2F;
    }

    public void doShoot(int pumpDelay, int pumpTime, int hammerDelay, float hammerAngle, float althammerAngle, int casingDelay) {
        Random r = new Random();

        //Accumulative recoil function
        lastGunRecoil = gunRecoil += recoilAmount;
        startRecoil = true;
        lastRecoilProgress = recoilProgress = 0F;

        minigunBarrelRotationSpeed += 2F;
        lastGunSlide = gunSlide = 1F;
        timeUntilPump = pumpDelay;
        timeToPumpFor = pumpTime;
        timeUntilPullback = hammerDelay;
        timeUntilCasing = casingDelay;
        hammerRotation = hammerAngle;
        althammerRotation = althammerAngle;
        muzzleFlashTime = 2;

        int Low = -1;
        int High = 3;
        int result = r.nextInt(High - Low) + Low;
        if (result == -1) result = 0;
        if (result == 3) result = 2;
        flashInt = result;

        casingRandom.x = ((r.nextFloat() * 2) - 1);
        casingRandom.y = ((r.nextFloat() * 2) - 1);
        casingRandom.z = ((r.nextFloat() * 2) - 1);
        casingStage = 0;

        if (pumpDelay == 0) {
            FlansModClient.shotState = 1;
        }
    }

    public void doReload(ItemStack gunStack, int gunSlot, int reloadTime, int pumpDelay, int pumpTime, int chargeDelay, int chargeTime, int ammoCount, boolean single, boolean isTactical, String sound) {
        stopReloadSound();
        reloading = true;
        reloadInProgress = true;
        reloadingSlot = gunSlot;
        reloadingItem = gunStack == null ? null : gunStack.getItem();
        lastReloadAnimationProgress = reloadAnimationProgress = 0F;
        reloadAnimationTime = reloadTime;
        timeUntilPump = pumpDelay;
        timeToPumpFor = pumpTime;
        timeUntilCharge = chargeDelay;
        timeToChargeFor = chargeTime;
        reloadAmmoCount = ammoCount;
        singlesReload = single;
        FlansModClient.lastBulletReload = ammoCount - 1;
        FlansModClient.reloadStart = true;
        reloadTimeLeft = reloadTime;
        tacticalReload = isTactical;
        playReloadSound(sound);

        if(FlansModClient.currentScope != null) {
            GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
            FlansModClient.currentScope = null;
            FlansModClient.lastZoomLevel = 0;
            FlansMod.getPacketHandler().sendToServer(new PacketGunState(false));
            FlansModClient.scopeTime = 2;
            gameSettings.viewBobbing = true;
        }

    }

    public void cancelReload() {
        stopReloadSound();
        reloading = false;
        reloadInProgress = false;
        reloadingSlot = -1;
        reloadingItem = null;
        reloadTimeLeft = 0;
        FlansModClient.reloadStart = false;
        reloadAnimationProgress = 0F;
        lastReloadAnimationProgress = 0F;
        timeUntilPump = 0;
        timeUntilCharge = 0;
        pumping = false;
        charging = false;
    }

    private boolean isReloadEquipped(int equippedSlot, ItemStack equippedGun) {
        return reloadInProgress
                && reloadingSlot == equippedSlot
                && equippedGun != null
                && equippedGun.getItem() == reloadingItem;
    }

    private void playReloadSound(String sound) {
        if (sound == null || sound.isEmpty() || reloadTimeLeft <= 0)
            return;
        Minecraft minecraft = Minecraft.getMinecraft();
        reloadSound = new PositionedSoundRecord(FlansModResourceHandler.getSound(sound), 10F, 1F,
                (float) minecraft.thePlayer.posX, (float) minecraft.thePlayer.posY, (float) minecraft.thePlayer.posZ);
        minecraft.getSoundHandler().playSound(reloadSound);
    }

    private void stopReloadSound() {
        if (reloadSound != null) {
            Minecraft.getMinecraft().getSoundHandler().stopSound(reloadSound);
            reloadSound = null;
        }
    }
    public void doMelee(int meleeTime) {
        meleeAnimationLength = meleeTime;
    }
}
