package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.item.ItemShootable;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

//When the client receives one, it "reloads". Basically to stop client side recoil effects when the gun should be in a reload animation
//When the server receives one, it is interpreted as a forced reload
public class PacketReload extends PacketBase {

    /**
     * 是否为左手换弹
     */
    public boolean left;
    /**
     * 换弹数量
     */
    public Integer amount = 0;
    /**
     * 换弹所需时间
     */
    public Integer reloadTime = 0;
    /**
     * 是否为单发换弹
     */
    public Boolean singlesReload = false;
    /**
     * 是否自动合并弹匣
     */
    public boolean combineAmmo;
    /**
     * 弹匣是否自动放于最高物品栏
     */
    public boolean ammoToUpperInventory;

    public boolean tacticalReload;

    /** Server-selected weapon identity for reliable client animation setup. */
    private int gunSlot = -1;
    private String gunTypeShortName = "";

    public PacketReload() {
    }

    /**
     * 构造函数 , 包括是否为左手换弹 , 是否合并弹匣 , 是否置于最高处 , 用于R键换弹逻辑
     *
     * @param l
     * @param combineAmmo
     * @param ammoToUpperInventory
     */
    public PacketReload(boolean l, boolean combineAmmo, boolean ammoToUpperInventory) {
        left = l;
        this.combineAmmo = combineAmmo;
        this.ammoToUpperInventory = ammoToUpperInventory;

    }

    /**
     * 换弹构造函数
     *
     * @param l
     * @param count
     * @param reloadTime
     * @param single
     * @param combineAmmo
     * @param ammoToUpperInventory
     */
    public PacketReload(boolean l, int count, int reloadTime, boolean single, boolean combineAmmo, boolean ammoToUpperInventory) {

        this.left = l;
        /*
        换弹数量
         */
        this.amount = count;
        /*
        装弹操作的时间或持续时间
         */
        this.reloadTime = reloadTime;
        /*
        单发装弹操作
         */
        this.singlesReload = single;
        /*
        是否自动合并弹匣
         */
        this.combineAmmo = combineAmmo;
        /*
        是否自动把弹匣放到最高层
         */
        this.ammoToUpperInventory = ammoToUpperInventory;
    }

    public PacketReload(boolean l, int count, int reloadTime, boolean single, boolean combineAmmo,
            boolean ammoToUpperInventory, int gunSlot, String gunTypeShortName, boolean tacticalReload) {
        this(l, count, reloadTime, single, combineAmmo, ammoToUpperInventory);
        this.gunSlot = gunSlot;
        this.gunTypeShortName = gunTypeShortName == null ? "" : gunTypeShortName;
        this.tacticalReload = tacticalReload;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(left);
        data.writeInt(amount);
        data.writeInt(reloadTime);
        data.writeBoolean(singlesReload);
        data.writeBoolean(combineAmmo);
        data.writeBoolean(ammoToUpperInventory);
        data.writeInt(gunSlot);
        writeUTF(data, gunTypeShortName);
        data.writeBoolean(tacticalReload);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        left = data.readBoolean();
        amount = data.readInt();
        reloadTime = data.readInt();
        singlesReload = data.readBoolean();
        combineAmmo = data.readBoolean();
        ammoToUpperInventory = data.readBoolean();
        // These fields were appended so older reload-intent packets remain valid.
        if (data.readableBytes() >= 6) {
            gunSlot = data.readInt();
            gunTypeShortName = readUTF(data);
            tacticalReload = data.readBoolean();
        }
    }

    //服务端处理逻辑
    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

        PlayerData data = PlayerHandler.getPlayerData(playerEntity); //获取玩家data
        ItemStack gunStack = playerEntity.getCurrentEquippedItem(); // 获取玩家目前手持物品的物品堆

        if (left && data.offHandGunSlot != 0) { // 如果为左手换弹且有左手 , 执行左手换弹逻辑
            gunStack = playerEntity.inventory.getStackInSlot(data.offHandGunSlot - 1); // 获取副手枪械stack
        }

        if (data != null && gunStack != null && gunStack.getItem() instanceof ItemGun) { // 如果data不为空 gunstack不为空 且 gunstack确实为枪械
            GunType type = ((ItemGun) gunStack.getItem()).type; // 获取枪械类型
            //检查枪械是否为空仓
            if (data.isReloading(gunStack) || data.hasReloadInHand(left))
                return;
            boolean empty = true;
            for (int i = 0; i < type.getNumAmmoItemsInGun(gunStack); i++) { // 遍历枪械的所有弹药槽
                ItemStack bulletStack = ((ItemGun) gunStack.getItem()).getBulletItemStack(gunStack, i); // 获取该弹药槽
                if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
                    // 若某个bulletstack不为空 , 且 其item不为空 , 且其耐久不为负耐久 , 则该枪内有子弹
                    empty = false;
                    break;
                }
            }

            int maxAmmo = type.getNumAmmoItemsInGun(gunStack); // 最大弹药槽数量
            boolean singlesReload = maxAmmo > 1; // 如果弹药槽数量大于1 , 则启用单发装弹
            int reloadCount; // 定义装弹数量

            if (singlesReload) { // 若为单发装弹
                reloadCount = 0; // 初始化装弹数量为 0
                for (int i = 0; i < type.getNumAmmoItemsInGun(gunStack); i++) { // 遍历
                    ItemStack oldBulletStack = ((ItemGun) gunStack.getItem()).getBulletItemStack(gunStack, i); // 遍历到的gun中原有的弹药槽
                    if (oldBulletStack == null
                            || oldBulletStack.getMaxDamage() - oldBulletStack.getItemDamage() == 0
                            || type.canForceReload) {
                        // Manual reload replaces this slot, so include it in the animation duration.
                        reloadCount += 1;
                    }
                }
            } else {
                reloadCount = 1;
                // 如果不为单发换弹 , 则只需要一次换弹 , 直接赋值为1
            }

            ItemGun gunItem = (ItemGun) gunStack.getItem();
            if (gunItem.canReload(gunStack, type, playerEntity.inventory, true)) {
                // 若成功装弹
                float reloadTime;
                if(empty){
                    reloadTime = singlesReload ? (type.getEmptyReloadTime(gunStack) / maxAmmo) * reloadCount : type.getEmptyReloadTime(gunStack);
                } else {
                    reloadTime = type.getTacticalReloadTime(gunStack) / maxAmmo * reloadCount;
                }

                int reloadTicks = Math.max(1, (int) Math.ceil(reloadTime));
                data.startReload(gunStack, reloadTicks, left, true, combineAmmo, ammoToUpperInventory);
                //Set the reload delay
                if (left)
                    data.reloadingLeft = true;
                else data.reloadingRight = true;
                //Send reload packet to induce reload effects client side

                int reloadSlot = left ? data.offHandGunSlot - 1 : playerEntity.inventory.currentItem;
                FlansMod.getPacketHandler().sendTo(new PacketReload(left, reloadCount, reloadTicks,
                        singlesReload, combineAmmo, ammoToUpperInventory, reloadSlot, type.shortName, !empty),
                        playerEntity);

                //Play reload sound, empty variant if not null
                String soundToPlay = null;
                AttachmentType grip = type.getGrip(gunStack);

                if (type.getSecondaryFire(gunStack) && grip != null && grip.secondaryReloadSound != null)
                    soundToPlay = grip.secondaryReloadSound;
                else if (empty && type.reloadSoundOnEmpty != null)
                    soundToPlay = type.reloadSoundOnEmpty;
                else if (type.reloadSound != null)
                    soundToPlay = type.reloadSound;

                if (soundToPlay != null && reloadTicks > 0)
                    FlansMod.getPacketHandler().sendToAllExcept(
                            new PacketPlaySound(playerEntity.posX, playerEntity.posY, playerEntity.posZ, soundToPlay),
                            playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.reloadSoundRange, playerEntity, playerEntity.dimension);
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        if (reloadTime <= 0) {
            GunAnimations animations = left ? FlansModClient.gunAnimationsLeft.get(clientPlayer)
                    : FlansModClient.gunAnimationsRight.get(clientPlayer);
            if (animations != null)
                animations.cancelReload();
            return;
        }

        PlayerData data = PlayerHandler.getPlayerData(clientPlayer, Side.CLIENT);
        int animationSlot = gunSlot;
        if (animationSlot < 0)
            animationSlot = left ? data.offHandGunSlot - 1 : clientPlayer.inventory.currentItem;
        ItemStack stack = animationSlot >= 0 && animationSlot < clientPlayer.inventory.getSizeInventory()
                ? clientPlayer.inventory.getStackInSlot(animationSlot) : null;
        if (left) {
            data.burstRoundsRemainingLeft = 0;
        } else {
            data.burstRoundsRemainingRight = 0;
        }

        GunType type = gunTypeShortName.isEmpty() ? null : GunType.getGun(gunTypeShortName);
        if (type == null && stack != null && stack.getItem() instanceof ItemGun)
            type = ((ItemGun) stack.getItem()).type;

        if (type != null && type.item instanceof ItemGun) {
            if (stack == null || stack.getItem() != type.item)
                stack = new ItemStack(type.item);

            boolean empty = !tacticalReload;
            if (gunTypeShortName.isEmpty()) {
                empty = true;
                for (int i = 0; i < type.getNumAmmoItemsInGun(stack); i++) {
                    ItemStack bulletStack = ((ItemGun) stack.getItem()).getBulletItemStack(stack, i);
                    if (bulletStack != null && bulletStack.getItem() != null
                            && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
                        empty = false;
                        break;
                    }
                }
            }

            int animationReloadTime = Math.max(0, reloadTime);

            //Apply animations
            GunAnimations animations = null;
            if (left) {
                if (FlansModClient.gunAnimationsLeft.containsKey(clientPlayer))
                    animations = FlansModClient.gunAnimationsLeft.get(clientPlayer);
                else {
                    animations = new GunAnimations();
                    FlansModClient.gunAnimationsLeft.put(clientPlayer, animations);
                }
            } else {
                if (FlansModClient.gunAnimationsRight.containsKey(clientPlayer))
                    animations = FlansModClient.gunAnimationsRight.get(clientPlayer);
                else {
                    animations = new GunAnimations();
                    FlansModClient.gunAnimationsRight.put(clientPlayer, animations);
                }
            }
            int pumpDelay = type.model == null ? 0 : type.model.pumpDelayAfterReload;
            int pumpTime = type.model == null ? 1 : type.model.pumpTime;
            int chargeDelay = type.model == null ? 0 : type.model.chargeDelayAfterReload;
            int chargeTime = type.model == null ? 1 : type.model.chargeTime;
            String soundToPlay = null;
            AttachmentType grip = type.getGrip(stack);
            if (type.getSecondaryFire(stack) && grip != null && grip.secondaryReloadSound != null)
                soundToPlay = grip.secondaryReloadSound;
            else if (empty && type.reloadSoundOnEmpty != null)
                soundToPlay = type.reloadSoundOnEmpty;
            else if (type.reloadSound != null)
                soundToPlay = type.reloadSound;
            animations.doReload(stack, animationSlot, animationReloadTime, pumpDelay, pumpTime, chargeDelay, chargeTime,
                    amount, singlesReload, !empty, soundToPlay);

            //Iterate over all inventory slots and find the magazine / bullet item with the most bullets
            int bestSlot = -1;
            int bulletsInBestSlot = 0;
            for (int j = 0; j < clientPlayer.inventory.getSizeInventory(); j++) {
                ItemStack item = clientPlayer.inventory.getStackInSlot(j);
                if (item != null && item.getItem() instanceof ItemShootable && type.isAmmo(((ItemShootable) (item.getItem())).type, stack)) {
                    int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
                    if (bulletsInThisSlot > bulletsInBestSlot) {
                        bestSlot = j;
                        bulletsInBestSlot = bulletsInThisSlot;
                    }
                }
            }

        }
    }
}
