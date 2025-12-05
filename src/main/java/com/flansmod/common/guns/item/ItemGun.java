package com.flansmod.common.guns.item;

import com.flansmod.client.AimType;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.eventhandlers.GunFiredEvent;
import com.flansmod.common.eventhandlers.GunReloadEvent;
import com.flansmod.common.eventhandlers.PlayerReviveEvent;
import com.flansmod.common.guns.*;
import com.flansmod.common.guns.raytracing.*;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.BulletType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.guns.type.ShootableType;
import com.flansmod.common.mob.EntityCorpse;
import com.flansmod.common.network.*;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.teams.*;
import com.flansmod.common.types.IGunboxDescriptionable;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.google.common.collect.Multimap;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.*;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.world.BlockEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.flansmod.client.FlansModClient.*;


public class ItemGun extends Item implements IPaintableItem, IGunboxDescriptionable, ILockable {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(2);
    public static boolean crouching = false;
    public static boolean sprinting = false;
    public static boolean shooting = false;
    private static boolean rightMouseHeld;
    private static boolean leftMouseHeld;
    private static boolean lastLeftMouseHeld;
    private static boolean lastRightMouseHeld;

    public GunType type;
    public String originGunbox = "";
    // This is a bodge - the server needs to hold state that is held on the client.
    public boolean isScoped = false;
    public int soundDelay;
    public int lockOnSoundDelay;
    public int impactX = 0;
    public int impactY = 0;
    public int impactZ = 0;
    public IIcon[] icons;
    public double currentSpread;
    public boolean emptyAmmo = false;
    private boolean canClick = true;
    private boolean lastIsShooting = false;
    private IIcon defaultIcon;
    public float minigunSpeed = 0F;
    public int railgunSpeed = 0;

    public ItemGun(GunType gun) {
        maxStackSize = 1;
        type = gun;
        type.item = this;
        setHasSubtypes(true);
        setCreativeTab(FlansMod.tabFlanGuns);
        GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
    }

    /**
     * Method for dropping items on reload and on shoot
     */
    public static void dropItem(World world, Entity entity, String itemName) {
        if (itemName != null) {
            int damage = 0;
            if (itemName.contains(".")) {
                damage = Integer.parseInt(itemName.split("\\.")[1]);
                itemName = itemName.split("\\.")[0];
            }
            ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
            entity.entityDropItem(dropStack, 0.5F);
        }
    }

    //Round values to n number of decimal points
    public static float roundFloat(float value, int points) {
        int pow = 10;
        for (int i = 1; i < points; i++)
            pow *= 10;
        float result = value * pow;

        return (float) (int) ((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
    }

    public String getOriginGunBox() {
        return originGunbox;
    }

    public void setOriginGunBox(String e) {
        originGunbox = e;
    }

    @Override
    public InfoType getInfoType() {
        return type;
    }

    @Override
    public PaintableType GetPaintableType() {
        return type;
    }

    /**
     * Make sure client and server side NBT tags update
     */
    @Override
    public boolean getShareTag() {
        return true;
    }

    /**
     * Get the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets)
     */
    public ItemStack getBulletItemStack(ItemStack gun, int id) {
        //If the gun has no tags, give it some
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
            return null;
        }

        String s;
        if (type.getSecondaryFire(gun))
            s = "secondaryAmmo";
        else
            s = "ammo";

        //If the gun has no ammo tags, give it some
        if (!gun.stackTagCompound.hasKey(s)) {
            NBTTagList ammoTagsList = new NBTTagList();
            for (int i = 0; i < type.getNumAmmoItemsInGun(gun); i++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            gun.stackTagCompound.setTag(s, ammoTagsList);
            return null;
        }
        //Take the list of ammo tags
        NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, Constants.NBT.TAG_COMPOUND);
        //Get the specific ammo tags required
        NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
        return ItemStack.loadItemStackFromNBT(ammoTags);
    }

    /**
     * Set the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets)
     */
    public void setBulletItemStack(ItemStack gun, ItemStack bullet, int id) {
        //If the gun has no tags, give it some
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }

        String s;
        if (type.getSecondaryFire(gun))
            s = "secondaryAmmo";
        else
            s = "ammo";

        //If the gun has no ammo tags, give it some
        if (!gun.stackTagCompound.hasKey(s)) {
            NBTTagList ammoTagsList = new NBTTagList();
            for (int i = 0; i < type.getNumAmmoItemsInGun(gun); i++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            gun.stackTagCompound.setTag(s, ammoTagsList);
        }
        //Take the list of ammo tags
        NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, Constants.NBT.TAG_COMPOUND);
        //Get the specific ammo tags required
        NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
        //Represent empty slots by null types
        if (bullet == null) {
            ammoTags = new NBTTagCompound();
        } else {
            //Set the tags to match the bullet stack
            bullet.writeToNBT(ammoTags);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips) {
        KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;
        String paintName = type.getPaintjob(stack.getItemDamage()).displayName;
        if (!paintName.equals("default") && !paintName.isEmpty())
            lines.add("\u00a7b\u00a7o" + paintName);

        if (!type.packName.isEmpty()) {
            lines.add("\u00a7o" + type.packName);
        }
        if (type.description != null) {
            Collections.addAll(lines, type.description.split("_"));
        }

        if (FlansMod.showItemDescriptions) {
            // Reveal all the gun stats when holding down the sneak key
            if (!GameSettings.isKeyDown(shift)) {
                // Show loaded ammo
                for (int i = 0; i < type.getNumAmmoItemsInGun(stack); i++) {
                    ItemStack bulletStack = getBulletItemStack(stack, i);
                    if (bulletStack != null && bulletStack.getItem() instanceof ItemBullet) {
                        BulletType bulletType = ((ItemBullet) bulletStack.getItem()).type;
                        String line = bulletType.name + " " + (bulletStack.getMaxDamage() - bulletStack.getItemDamage())
                                + "/" + bulletStack.getMaxDamage();
                        lines.add(line);
                    }
                }

                lines.add("按住 \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode())
                        + "\u00a7r\u00a77 查看更多数据");
            } else {
                lines.add("");

                if (originGunbox != "") {
                    lines.add("\u00a79Box" + "\u00a77: " + originGunbox);
                }

                AttachmentType barrel = type.getBarrel(stack);
                if (barrel != null && barrel.silencer)
                    lines.add("\u00a7e[消音]");

                if (type.getSecondaryFire(stack))
                    lines.add("\u00a7e[下挂武器]");

                lines.add("\u00a79子弹威力" + "\u00a77: " + roundFloat(type.getDamage(stack), 2));
                lines.add("\u00a79后坐控制" + "\u00a77: 垂直 " + roundFloat(type.getRecoilDisplay(stack), 2) +
                        " 水平 " + roundFloat(type.getRecoilYawDisplay(stack, false, false), 2));
//                String sprintingControl = String.format("奔跑:%s%s", EnumChatFormatting.RED,
//                        roundFloat(1 - type.getRecoilControl(stack, true, false), 2));
//                String sneakingControl = String.format("下蹲:%s%s", EnumChatFormatting.GREEN,
//                        roundFloat(1 - type.getRecoilControl(stack, false, true), 2));
//                String normalControl = String.format("正常:%s%s", EnumChatFormatting.AQUA,
//                        roundFloat(1 - type.getRecoilControl(stack, false, false), 2));
//                lines.add("\u00a79后坐控制" + "\u00a77: "
//                        + String.format("%s %s %s", sprintingControl, normalControl, sneakingControl));
                lines.add("\u00a79腰射散布" + "\u00a77: " + roundFloat(type.getSpread(stack, false, false), 2));
                lines.add("\u00a79开镜散布" + "\u00a77: " + roundFloat(type.getADSSpread(stack, false, false), 2)
                + " [Min:" + type.minSpread + "]");
                lines.add("\u00a79空仓换弹" + "\u00a77: " + roundFloat(type.getEmptyReloadTime(stack) / 20, 2) + "s");
                lines.add("\u00a79战术换弹" + "\u00a77: " + roundFloat(type.getTacticalReloadTime(stack) / 20, 2) + "s");
                lines.add("\u00a79子弹速度" + "\u00a77: " + (int)(type.getBulletSpeed(stack) * 20) + "m/s");
                lines.add("\u00a79开镜时间" + "\u00a77: " + roundFloat(type.getAimTimeConstant(stack) * 20, 2));
                lines.add("\u00a79跑射延迟" + "\u00a77: " + roundFloat(type.getRunPosTime(stack), 2));

                if (type.shootDelay != 0) {
                    lines.add("\u00a79射速" + "\u00a77: " + 1200 / type.getShootDelay(stack) + "\u00a77RPM ");
                } else
                    lines.add("\u00a79射速" + "\u00a77: " + 1200 / type.getShootDelay(stack) + "\u00a77RPM ");
                lines.add("\u00a79模式" + "\u00a77: \u00a7f" + type.getFireMode(stack).toString().toLowerCase());

                lines.add("");
                lines.add("\u00a7e配件");
                boolean empty = true;
                for (AttachmentType attachment : type.getCurrentAttachments(stack)) {
                    String line = attachment.name;
                    lines.add(line);
                    if (line != null)
                        empty = false;
                }

                if (empty)
                    lines.add("无配件");
            }
        }
    }

    @SideOnly(Side.CLIENT)
    private void onUpdateClient(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (entity instanceof EntityPlayer && ((EntityPlayer) entity).inventory.getCurrentItem() == itemstack) {
            //Get useful objects
            Minecraft mc = Minecraft.getMinecraft();
            EntityPlayer player = (EntityPlayer) entity;
            PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);

            boolean railgunFire = false;
            if(railgunSpeed > 0) {
                railgunSpeed--;
                if(railgunSpeed == 0) {
                    railgunFire = true;
                }
            }

            //Play idle sounds
            if (soundDelay <= 0 && type.idleSound != null) {
                PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, type.idleSoundRange, entity.dimension, type.idleSound, false);
                soundDelay = type.idleSoundLength;
            }

            //If crouching, translate weapon model (zoom)
            crouching = player.isSneaking();
            //If running, reposition the gun
            FlansModClient.isSprinting = sprinting = player.isSprinting();

            //This code is not for deployables
            if (type.deployable)
                return;


            GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
            //If in a GUI
            if (FMLClientHandler.instance().getClient().currentScreen != null) {
                if (FlansModClient.currentScope != null) {
                    FlansModClient.currentScope = null;
                    gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                    gameSettings.fovSetting = FlansModClient.originalFOV;

                    //Send default spread packet to server
                    //getDefaultSpread方法
                    FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
                }
            } else if (mc.objectMouseOver != null && (mc.objectMouseOver.entityHit instanceof EntityFlagpole || mc.objectMouseOver.entityHit instanceof EntityFlag || mc.objectMouseOver.entityHit instanceof EntityGunItem || (mc.objectMouseOver.entityHit instanceof EntityGrenade && ((EntityGrenade) mc.objectMouseOver.entityHit).type.isDeployableBag))) {
                //Do not shoot ammo bags, flags or dropped gun items
            }
            //Else do shoot code
            else {
                //Get whether mice are held
                lastRightMouseHeld = rightMouseHeld;
                lastLeftMouseHeld = leftMouseHeld;
                rightMouseHeld = Mouse.isButtonDown(FlansModClient.fireButton.getButton());
                leftMouseHeld = Mouse.isButtonDown(FlansModClient.aimButton.getButton());
                boolean offHandFull = false;

                //----------------------------- Off hand item ---------------------------------------------------------------------
                if (type.oneHanded) {
                    if (data.offHandGunSlot == player.inventory.currentItem + 1)
                        data.offHandGunSlot = 0;
                    //Cycle selection
                    int dWheel = Mouse.getDWheel();
                    if (Keyboard.isKeyDown(mc.gameSettings.keyBindSneak.getKeyCode()) && dWheel != 0) {
                        data.cycleOffHandItem(player, dWheel);
                    }

                    if (data.offHandGunSlot != 0) {
                        offHandFull = true;
                        ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                        if (offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun) {
                            GunType offHandGunType = ((ItemGun) offHandGunStack.getItem()).type;
                            if (offHandGunType.usableByPlayers) {
                                //If we are using a burst mode gun, and there is burst left to be done, try to do it
                                if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0) {
                                    if (clientSideShoot(player, offHandGunStack, offHandGunType, true))
                                        player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
                                } else {
                                    //Send packet when firing a semi or starting to fire a full
                                    if (leftMouseHeld && !lastLeftMouseHeld && offHandGunType.getFireMode(offHandGunStack) != EnumFireMode.RAILGUN) {
                                        FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, true, player.rotationYaw, player.rotationPitch));
                                        if (clientSideShoot(player, offHandGunStack, offHandGunType, true))
                                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
                                    }
                                    if ((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && !leftMouseHeld && lastLeftMouseHeld) //Full auto. Send released mouse packet
                                    {
                                        FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, false, player.rotationYaw, player.rotationPitch));
                                    }
                                    if(offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.RAILGUN) {
                                        if(railgunFire) {
                                            FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, true, player.rotationYaw, player.rotationPitch));
                                            if (clientSideShoot(player, offHandGunStack, offHandGunType, true)) {
                                                player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
                                            }
                                        } else if(leftMouseHeld) {
                                            railgunSpeed = offHandGunType.warmupSoundLength;
                                            if (player.worldObj.isRemote) {
                                                player.playSound("flansmod:" + type.warmupSound, 1.0F, 1.0F);
                                            }
                                        }
                                    }
                                    if ((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && leftMouseHeld) {
                                        if (clientSideShoot(player, offHandGunStack, offHandGunType, true)) {
                                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
                                        }
                                    }
                                }
                            }
                        } else data.offHandGunSlot = 0;
                    }
                }

                //--------------------------------- Main hand item ---------------------------------------------
                if (type.usableByPlayers) {
                    //If we are using a burst mode gun, and there is burst left to be done, try to do it
                    if (type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0) {
                        if (clientSideShoot(player, itemstack, type, false))
                            player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                    } else {
                        //Send packet when firing a semi or starting to fire a full
                        if (rightMouseHeld && !lastRightMouseHeld && type.getFireMode(itemstack) != EnumFireMode.RAILGUN) {
                            FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, true, player.rotationYaw, player.rotationPitch));
                            if (clientSideShoot(player, itemstack, type, false))
                                player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                        }
                        //Full auto. Send released mouse packet
                        if ((type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && !rightMouseHeld && lastRightMouseHeld) {
                            FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, false, player.rotationYaw, player.rotationPitch));
                        }
                        if(type.getFireMode(itemstack) == EnumFireMode.RAILGUN) {
                            if(railgunFire) {
                                FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, true, player.rotationYaw, player.rotationPitch));
                                if (clientSideShoot(player, itemstack, type, false))
                                    player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                            } else if(rightMouseHeld && !lastRightMouseHeld) {
                                railgunSpeed = type.warmupSoundLength;
                                if (player.worldObj.isRemote) {
                                    player.playSound("flansmod:" + type.warmupSound, 1.0F, 1.0F);
                                }
                            }
                        }
                        if ((type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && rightMouseHeld) {
                            if (clientSideShoot(player, itemstack, type, false))
                                player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                        }
                    }
                }
                IScope currentScope = type.getCurrentScope(itemstack);
                /**
                 * 冲刺时
                 */
                if (isSprinting || offHandFull) {
                    FlansModClient.currentScope = null;
                    FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
                    gameSettings.thirdPersonView = 0;
                    gameSettings.viewBobbing = true;
                    gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                    RenderManager.debugBoundingBox = false;
                    FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
                    FlansMod.getPacketHandler().sendToServer(new PacketGunState(false));
                }
                /**
                 * AimType为Toggle(点击)时的开镜代码
                 */
                else if (FlansModClient.aimType == AimType.TOGGLE) {
                    /**
                     * 右键点击试图开镜的代码,每次开镜执行一次
                     */
                    if ((type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM)
                            && Mouse.isButtonDown(FlansModClient.aimButton.getButton())
                            && FlansModClient.scopeTime <= 0
                            && FMLClientHandler.instance().getClient().currentScreen == null
                    ) {
                        if (FlansModClient.currentScope == null) {
                            FlansModClient.currentScope = currentScope;
                            FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
                            gameSettings.thirdPersonView = 0;
                            if (FlansModClient.canChangeSettings) {
                                gameSettings.mouseSensitivity = gameSettings.mouseSensitivity / currentScope.getZoomFactor() / currentScope.getFOVFactor();
                            }
                            if (Math.abs(zoomProgress - FlansModClient.lastZoomProgress) < 0.0001F) {
                                FlansModClient.originalFOV = gameSettings.fovSetting;
                            }
                            //开镜时视角摇晃设为false
                            gameSettings.viewBobbing = false;
                            FlansModClient.canChangeSettings = false;
                            FlansMod.getPacketHandler().sendToServer(new PacketGunState(true));
                        }
                        /**
                         * 开镜后点击试图收镜的代码
                         */
                        else {
                            FlansModClient.currentScope = null;
                            FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
                            //收镜时视角摇晃设为true
                            gameSettings.viewBobbing = true;
                            //收镜时重置鼠标灵敏度
                            gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                            RenderManager.debugBoundingBox = false;
                            FlansMod.getPacketHandler().sendToServer(new PacketGunState(false));
                        }
                        FlansModClient.scopeTime = 10;
                    }
                }
                /**
                 * AimType为Hold(长按)时的开镜代码
                 */
                else {
                    /**
                     * 开镜状态,每次开镜执行一次
                     */
                    if ((type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM)
                            && Mouse.isButtonDown(FlansModClient.aimButton.getButton())
                            && FlansModClient.scopeTime <= 0
                            && FMLClientHandler.instance().getClient().currentScreen == null
                    ) {
                        if (FlansModClient.currentScope == null) {
                            FlansModClient.currentScope = currentScope;
                            FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
                            FlansModClient.lastFOVZoomLevel = currentScope.getFOVFactor();
                            if (FlansModClient.canChangeSettings) {
                                gameSettings.mouseSensitivity = gameSettings.mouseSensitivity / currentScope.getZoomFactor() / currentScope.getFOVFactor();
                            }
                            FlansModClient.originalViewBobbing = gameSettings.viewBobbing;
                            gameSettings.thirdPersonView = 0;
                            if (Math.abs(zoomProgress - FlansModClient.lastZoomProgress) < 0.0001F) {
                                FlansModClient.originalFOV = gameSettings.fovSetting;
                            }
                            FlansModClient.MouseSenNedToChange = FlansModClient.originalMouseSensitivity - FlansModClient.originalMouseSensitivity / currentScope.getFOVFactor() / currentScope.getZoomFactor();
                            //开镜时视角摇晃设为false
                            gameSettings.viewBobbing = false;
                            FlansModClient.canChangeSettings = false;
                            FlansMod.getPacketHandler().sendToServer(new PacketGunState(true));
                            FlansModClient.scopeTime = 10;
                        }
                    }
                    /**
                     * 收镜状态
                     */
                    else {
                        if (!Mouse.isButtonDown(FlansModClient.aimButton.getButton())) {
                            if (FlansModClient.currentScope != null) {
                                FlansModClient.currentScope = null;
                                FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
                                //收镜时视角摇晃设为true
                                gameSettings.viewBobbing = true;
                                //收镜时重置鼠标灵敏度
                                gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                                RenderManager.debugBoundingBox = false;
                                FlansMod.getPacketHandler().sendToServer(new PacketGunState(false));
                            }
                        }
                    }
                }

                if (zoomProgress > 0.9) {
                    currentSpread = type.getADSSpread(itemstack, player.isSneaking(), player.isSprinting());
                    FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getADSSpread(itemstack, player.isSneaking(), player.isSprinting())));
                } else {
                    currentSpread = type.getDefaultSpread(itemstack);
                    FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
                }
            }
        }
        if (soundDelay > 0) {
            soundDelay--;
        }
    }

    /**
     * Client side shoot method for animations and delayers
     *
     * @return whether to consume the gun item
     */

    public boolean clientSideShoot(EntityPlayer player, ItemStack stack, GunType gunType, boolean left) {
        PlayerData data = PlayerHandler.getPlayerData(player);
        if (gunType.isCancelAimingAfterShoot(stack) && FlansModClient.currentScope != null) {
            GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
            if (FlansModClient.aimType == AimType.TOGGLE) {
                threadPool.submit(() -> {
                    try {
                        Thread.sleep(400);
                        FlansModClient.currentScope = null;
                        FlansModClient.lastZoomLevel = gunType.getCurrentScope(stack).getZoomFactor();
                        FlansMod.getPacketHandler().sendToServer(new PacketGunState(false));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                gameSettings.viewBobbing = true;
                gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                FlansModClient.scopeTime = Math.max((int) type.shootDelay, 20);
            } else {
                threadPool.submit(() -> {
                    try {
                        Thread.sleep(400);
                        FlansModClient.currentScope = null;
                        FlansModClient.lastZoomLevel = gunType.getCurrentScope(stack).getZoomFactor();
                        FlansMod.getPacketHandler().sendToServer(new PacketGunState(false));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                gameSettings.viewBobbing = true;
                gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                FlansModClient.scopeTime = Math.max((int) type.shootDelay, 20);
            }

        }

        FlansMod.getPacketHandler().sendToServer(new PacketMinigunStart());
        minigunSpeed += 2F;
        if(minigunSpeed > type.minigunStartSpeed) {
            minigunSpeed = type.minigunStartSpeed + 2;
        }

        //TODO BUG
        if (player.isSprinting() && !gunType.isCanShootWhileRunning)
            return false;

        if (type.meleeSound != null)
            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeSound, true);
        //Do custom melee code here
        if (type.secondaryFunctionWhenShoot != null) {
            if (type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE) {
                //Do animation
                if (player.worldObj.isRemote) {
                    GunAnimations animations = FlansModClient.getGunAnimations(player, false);
                    animations.doMelee(type.meleeTime);
                }
                //Do custom melee hit detection
                if (data != null) {
                    data.doMelee(player, type.meleeTime, type);
                }
            }
        }

        //TODO: 空仓换弹 & 战术换弹动画逻辑
        // ShootTime <= 0 and player is sprinting zoomed or player is not sprinting, or the player can hipFireWhileSprinting
        boolean canActuallyHipFire = (gunType.hipFireWhileSprinting != 2) && !(gunType.hipFireWhileSprinting == 0 && FlansMod.disableSprintHipFireByDefault);
        if (FlansModClient.shootTime(left) <= 0 && ((sprinting && isScoped) || !sprinting || canActuallyHipFire) && !(player.ridingEntity instanceof EntitySeat)) {
//			boolean onLastBullet = false;
            boolean hasAmmo = false;
            for (int i = 0; i < gunType.getNumAmmoItemsInGun(stack); i++) {
                ItemStack bulletStack = getBulletItemStack(stack, i);
                if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
//					if(bulletStack.getMaxDamage() - bulletStack.getItemDamage() == 1 && gunType.model.slideLockOnEmpty)
//						onLastBullet = true;
                    hasAmmo = true;
                    break;
                }
            }
            if (hasAmmo) {
                GunAnimations animations;
                if (left) {
                    if (FlansModClient.gunAnimationsLeft.containsKey(player))
                        animations = FlansModClient.gunAnimationsLeft.get(player);
                    else {
                        animations = new GunAnimations();
                        FlansModClient.gunAnimationsLeft.put(player, animations);
                    }
                } else {
                    if (FlansModClient.gunAnimationsRight.containsKey(player))
                        animations = FlansModClient.gunAnimationsRight.get(player);
                    else {
                        animations = new GunAnimations();
                        FlansModClient.gunAnimationsRight.put(player, animations);
                    }
                }
                int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelay;
                int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
                int hammerDelay = gunType.model == null ? 0 : gunType.model.hammerDelay;
                int casingDelay = gunType.model == null ? 0 : gunType.model.casingDelay;
                float hammerAngle = gunType.model == null ? 0 : gunType.model.hammerAngle;
                float althammerAngle = gunType.model == null ? 0 : gunType.model.althammerAngle;

//				animations.onGunEmpty(onLastBullet);
                if(gunType.getFireMode(stack) == EnumFireMode.MINIGUN && minigunSpeed < type.minigunStartSpeed) {
                    animations.miniGunRotate();
                } else {
                    animations.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay);
                }

                //Old client side recoil, moved to PacketGunRecoil
                if(FlansModClient.recoilOnClient) {
                    //TODO 加特林无后座
                    if (gunType.getFireMode(stack) == EnumFireMode.MINIGUN && minigunSpeed < type.minigunStartSpeed) {
                    } else {
                        FlansModClient.playerRecoilPitch += gunType.getRecoilPitch(stack, player.isSneaking(), player.isSprinting());
                        FlansModClient.playerRecoilYaw += gunType.getRecoilYaw(stack, player.isSneaking(), player.isSprinting());
                    }
                }
                if (left)
                    FlansModClient.shootTimeLeft += gunType.getShootDelay(stack);
                else FlansModClient.shootTimeRight += gunType.getShootDelay(stack);
                if (gunType.consumeGunUponUse)
                    return true;

            }
            if (gunType.getFireMode(stack) == EnumFireMode.BURST) {
                if (left) {
                    if (data.burstRoundsRemainingLeft > 0)
                        data.burstRoundsRemainingLeft--;
                    else data.burstRoundsRemainingLeft = gunType.getNumBurstRounds(stack);
                } else {
                    if (data.burstRoundsRemainingRight > 0)
                        data.burstRoundsRemainingRight--;
                    else data.burstRoundsRemainingRight = gunType.getNumBurstRounds(stack);
                }
            }
        }

        return false;
    }

    public void onUpdateServer(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (itemstack.getTagCompound() == null || itemstack.getTagCompound().hasNoTags()) {
            GunType gunType = this.type;
            NBTTagCompound tags = new NBTTagCompound();
            tags.setString("Paint", gunType.defaultPaintjob.iconName);
            NBTTagList ammoTagsList = new NBTTagList();
            for (int j = 0; j < gunType.getNumAmmoItemsInGun(itemstack); j++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            tags.setTag("ammo", ammoTagsList);
            itemstack.stackTagCompound = tags;
        }

        // For... NBT issues caused by bukkit.
        if (!itemstack.getTagCompound().hasKey("ammo") || !itemstack.getTagCompound().hasKey("Paint")) {
            NBTTagList ammoTagsList = new NBTTagList();
            for (int j = 0; j < type.getNumAmmoItemsInGun(itemstack); j++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            itemstack.getTagCompound().setTag("ammo", ammoTagsList);

            itemstack.getTagCompound().setString("Paint", type.defaultPaintjob.iconName);

            type.checkForTags(itemstack);
        }

		/*
		//If enabled a speed nerf will be applied for each gun after gunCarryLimt starting at 0.6 and decreasing by 0.1 for each additional
		if(FlansMod.gunCarryLimitEnable && entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;
			int gunCount = 0;
			for (int slot = 0; slot < 9; slot++)
			{
				ItemStack itemInSlot = player.inventory.getStackInSlot(slot);
				ItemStack current = player.inventory.getCurrentItem();
				if(itemInSlot != null && itemInSlot.getItem() instanceof ItemGun)
				{
					gunCount++;
				}
			}
			if(gunCount > FlansMod.gunCarryLimit)
			{
				float movementSpeed = MathUtils.clampf((float) (0.1 - (0.04f + (0.010f * (gunCount - FlansMod.gunCarryLimit)))), 0.01f, 0.1f);
				//player.capabilities.setPlayerWalkSpeed(walkSpeed);
				//player.jumpMovementFactor = 0.002F;
				FlansMod.getPacketHandler().sendTo(new PacketUpdateSpeed(0.01F, 0.002F), (EntityPlayerMP) player);
			}
			else
			{
				//player.capabilities.setPlayerWalkSpeed(0.1F);
				//player.jumpMovementFactor = 0.02F; //(default)
				FlansMod.getPacketHandler().sendTo(new PacketUpdateSpeed(0.1F, 0.02F), (EntityPlayerMP) player);
			}
		}
		*/

        if (entity instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) entity;
            PlayerData data = PlayerHandler.getPlayerData(player);
            if (data == null)
                return;

            if (player.inventory.getCurrentItem() != itemstack) {
                //If the player is no longer holding a gun, emulate a release of the shoot button
                if (player.inventory.getCurrentItem() == null || player.inventory.getCurrentItem().getItem() == null || !(player.inventory.getCurrentItem().getItem() instanceof ItemGun)) {
                    data.isShootingRight = data.isShootingLeft = false;
                    data.offHandGunSlot = 0;
                    isScoped = false;
                    /*                    (new PacketSelectOffHandGun(0)).handleServerSide(player);*/
                }
                return;
            }

            //Right hand gun - main gun
            if (type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0) {
                player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
            }
            if (data.isShootingRight) {
                //Shoot burst and full auto weapons
                if (type.getFireMode(itemstack) == EnumFireMode.FULLAUTO) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
                }
                //Play looping sounds for minigun
                if (type.useLoopingSounds && data.loopedSoundDelay <= 0 && minigunSpeed > 0.1F && !data.reloadingRight) {
                    data.loopedSoundDelay = data.shouldPlayWarmupSound ? type.warmupSoundLength : type.loopedSoundLength;
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? type.warmupSound : type.loopedSound, false);
                    data.shouldPlayWarmupSound = false;
                }
                //Minigun is sufficiently fast to shoot
                if (type.getFireMode(itemstack) == EnumFireMode.MINIGUN && minigunSpeed > type.minigunStartSpeed)
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
            } else {
                if (type.useLoopingSounds && data.shouldPlayCooldownSound) {
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, type.cooldownSound, false);
                    data.shouldPlayCooldownSound = false;
                }
            }

            lastIsShooting = data.isShootingRight;

            //Left hand gun - offhand gun.
            if (type.oneHanded && data.offHandGunSlot != 0) {
                ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                if (offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun) {
                    GunType offHandGunType = ((ItemGun) offHandGunStack.getItem()).type;

                    if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0) {
                        player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                    }
                    if (data.isShootingLeft) {
                        //Shoot full auto weapons
                        if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO) {
                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                        }
                        //Play looping sounds for minigun
                        if (offHandGunType.useLoopingSounds && data.loopedSoundDelay <= 0 && minigunSpeed > 0.1F && !data.reloadingLeft) {
                            data.loopedSoundDelay = data.shouldPlayWarmupSound ? offHandGunType.warmupSoundLength : offHandGunType.loopedSoundLength;
                            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? offHandGunType.warmupSound : offHandGunType.loopedSound, false);
                            data.shouldPlayWarmupSound = false;
                        }
                        //Minigun is sufficiently fast to shoot
                        if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN && minigunSpeed > offHandGunType.minigunStartSpeed)
                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                    } else {
                        if (offHandGunType.useLoopingSounds && data.shouldPlayCooldownSound) {
                            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, offHandGunType.cooldownSound, false);
                            data.shouldPlayCooldownSound = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onUpdate(ItemStack itemstack, World world, Entity pEntity, int i, boolean flag) {

        if(pEntity instanceof EntityPlayer && pEntity.ridingEntity != null) {
            return;
        }

        if (world.isRemote)
            onUpdateClient(itemstack, world, pEntity, i, flag);
        else
            onUpdateServer(itemstack, world, pEntity, i, flag);

        if (!(pEntity instanceof EntityPlayer)) {
            return;
        }

        EntityPlayer player = (EntityPlayer) pEntity;
        PlayerData data = PlayerHandler.getPlayerData(player);
        if (data == null)
            return;

        if (!type.canSetPosition)
            this.impactX = this.impactY = this.impactZ = 0;

        type.setDetector(itemstack);
        type.setDuckBill(itemstack);

        minigunSpeed *= 0.95F;

        if (lockOnSoundDelay > 0)
            lockOnSoundDelay--;

        Entity closestEntity = null;
        if (type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) {
            //double closestAngle;

            for (Object obj : player.worldObj.loadedEntityList) {
                Entity entity = (Entity) obj;
                Vec3 playerVec = player.getLookVec();
                double dXYZ = Math.sqrt((entity.posX - player.posX) * (entity.posX - player.posX) + (entity.posY - player.posY) * (entity.posY - player.posY) + (entity.posZ - player.posZ) * (entity.posZ - player.posZ));
                Vector3f relPosVec = new Vector3f(entity.posX - player.posX, entity.posY - player.posY, entity.posZ - player.posZ);
                Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
                float angle = Math.abs(Vector3f.angle(playerVec3f, relPosVec));
                if (angle < Math.toRadians(type.canLockOnAngle) && dXYZ < type.maxRangeLockOn) {
                    String etype = entity.getEntityData().getString("EntityType");
                    if ((type.lockOnToMechas && entity instanceof EntityMecha) ||
                            (type.lockOnToVehicles && isVehicle(entity)) ||
                            (type.lockOnToPlanes && isPlane(entity)) ||
                            (type.lockOnToPlayers && entity instanceof EntityPlayer) ||
                            (type.lockOnToLivings && entity instanceof EntityLivingBase)) {
                        //if(entity instanceof EntityMecha || entity instanceof EntityVehicle || entity instanceof EntityPlane || entity instanceof EntityPlayer || entity instanceof EntityLivingBase)
                        if (!data.reloadingRight)
                            closestEntity = entity;
                        //closestAngle = angle;
                    }
                }
            }

            if (closestEntity != null) {
                closestEntity.getEntityData().setBoolean("LockOn", true);
            }

            if (closestEntity != null && lockOnSoundDelay <= 0 && !player.worldObj.isRemote && player.getCurrentEquippedItem() != null) {
                if (player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                    ItemGun itemGun;
                    itemGun = (ItemGun) player.getCurrentEquippedItem().getItem();
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 10, player.dimension, itemGun.type.lockOnSound, false);
                    //PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 100, player.dimension, itemGun.type.shootSound, false);
                    lockOnSoundDelay = type.lockOnSoundTime;
                    if (closestEntity instanceof EntityDriveable && ((EntityDriveable) closestEntity).getDriveableType().hasFlare) {
                        EntityDriveable entityDriveable = (EntityDriveable) closestEntity;
                        PacketPlaySound.sendSoundPacket(closestEntity.posX, closestEntity.posY, closestEntity.posZ,
                                entityDriveable.getDriveableType().lockedOnSoundRange,
                                closestEntity.dimension, entityDriveable.getDriveableType().lockingOnSound, false);
                    }
                }
            }
        }
			/*

				//If player is holding gun, apply modifiers below
				if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
				{
					ItemGun itemGun;
					itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
					//Apply night vision while scoped if AllowNightVision = True
					if(itemGun.type.allowNightVision && FlansModClient.currentScope != null)
					{
						player.addPotionEffect(new PotionEffect(Potion.nightVision.id, -1, 0));
					}
					AttachmentType scope = itemGun.type.getScope(itemstack);
					//IScope scope = itemGun.type.getCurrentScope(itemstack);
					//FlansMod.log(scope);
					//Apply night vision while scoped if attachment.hasNightVision = True
					if(scope != null && scope.hasNightVision && FlansModClient.currentScope != null)
					{
						player.addPotionEffect(new PotionEffect(Potion.nightVision.id, -1, 0));
						//FlansMod.log("1");
					}
					//Apply a penalty to jumpMovement equal to the moveSpeed penalty (0.5 moveSpeed = 0.5 jumpDistance)
					if(itemGun.type.moveSpeedModifier != 1F)
					{
						player.jumpMovementFactor = 0.0F;
					}
					else
						player.jumpMovementFactor = 0.02F;
				}
				*/


        //if(data.lastMeleePositions == null || data.lastMeleePositions.length != type.meleeDamagePoints.size())
        //{
        //	data.lastMeleePositions = new Vector3f[type.meleeDamagePoints.size()];
        //	for(int j = 0; j < type.meleeDamagePoints.size(); j++)
        //		data.lastMeleePositions[j] = new Vector3f(player.posX, player.posY, player.posZ);
        //}
        //Melee weapon
        if (data.meleeLength > 0 && type.meleePath.size() > 0 && player.inventory.getCurrentItem() == itemstack) {
            for (int k = 0; k < type.meleeDamagePoints.size(); k++) {
                Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
                //Do a raytrace from the prev pos to the current pos and attack anything in the way
                Vector3f nextPos = type.meleePath.get((data.meleeProgress + 1) % type.meleePath.size());
                Vector3f nextAngles = type.meleePathAngles.get((data.meleeProgress + 1) % type.meleePathAngles.size());
                RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);

                Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
                Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
                Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
                Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);


                if (!FlansMod.proxy.isThePlayer(player))
                    nextPosInPlayerCoords.y += 1.6F;

                Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);

                Vector3f dPos = data.lastMeleePositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleePositions[k], null);

                if (player.worldObj.isRemote && FlansMod.DEBUG && data.lastMeleePositions[k] != null)
                    player.worldObj.spawnEntityInWorld(new EntityDebugVector(player.worldObj, data.lastMeleePositions[k], dPos, 200, 1F, 0F, 0F));

                //Do the raytrace
                {
                    //Create a list for all bullet hits
                    ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

                    //Iterate over all entities
                    for (int j = 0; j < world.loadedEntityList.size(); j++) {
                        Object obj = world.loadedEntityList.get(j);
                        //Get players
                        if (obj != player) {
                            if (obj instanceof EntityPlayer) {
                                EntityPlayer otherPlayer = (EntityPlayer) obj;
                                PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
                                boolean shouldDoNormalHitDetect = false;
                                if (otherData != null) {
                                    if (otherPlayer.isDead || otherData.team == Team.spectators) {
                                        continue;
                                    }
                                    int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP) player).ping / 50 : 0;
                                    if (snapshotToTry >= otherData.snapshots.length)
                                        snapshotToTry = otherData.snapshots.length - 1;

                                    PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
                                    if (snapshot == null)
                                        snapshot = otherData.snapshots[0];

                                    //DEBUG
                                    //snapshot = new PlayerSnapshot(player);

                                    //Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
                                    if (snapshot == null)
                                        shouldDoNormalHitDetect = true;
                                    else {
                                        //Raytrace
                                        ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleePositions[k] == null ? nextPosInWorldCoords : data.lastMeleePositions[k], dPos);
                                        hits.addAll(playerHits);
                                    }
                                }

                                //If we couldn't get a snapshot, use normal entity hitbox calculations
                                if (otherData == null || shouldDoNormalHitDetect) {
                                    MovingObjectPosition mop = data.lastMeleePositions[k] == null ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0F, 0F, 0F)) : player.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
                                        float hitLambda = 1F;
                                        if (dPos.x != 0F)
                                            hitLambda = hitPoint.x / dPos.x;
                                        else if (dPos.y != 0F)
                                            hitLambda = hitPoint.y / dPos.y;
                                        else if (dPos.z != 0F)
                                            hitLambda = hitPoint.z / dPos.z;
                                        if (hitLambda < 0)
                                            hitLambda = -hitLambda;

                                        hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
                                    }
                                }
                            } else {
                                Entity entity = (Entity) obj;
                                if (!entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun) && entity.boundingBox != null && data.lastMeleePositions != null && data.lastMeleePositions[k] != null) {
                                    MovingObjectPosition mop = entity.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
                                        float hitLambda = 1F;
                                        if (dPos.x != 0F)
                                            hitLambda = hitPoint.x / dPos.x;
                                        else if (dPos.y != 0F)
                                            hitLambda = hitPoint.y / dPos.y;
                                        else if (dPos.z != 0F)
                                            hitLambda = hitPoint.z / dPos.z;
                                        if (hitLambda < 0)
                                            hitLambda = -hitLambda;

                                        hits.add(new EntityHit(entity, hitLambda));
                                    }
                                }
                            }
                        }
                    }

                    //We hit something
                    if (!hits.isEmpty()) {
                        //Sort the hits according to the intercept position
                        Collections.sort(hits);

                        float swingDistance = dPos.length();

                        for (BulletHit bulletHit : hits) {
                            if (!DoesHitBlock(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3(), Math.abs(bulletHit.intersectTime), player)) {
                                if (bulletHit instanceof PlayerBulletHit) {
                                    PlayerBulletHit playerHit = (PlayerBulletHit) bulletHit;
                                    float damageMultiplier = 1F;
                                    switch (playerHit.hitbox.type) {
                                        case LEFTITEM:
                                        case RIGHTITEM: //Hit a shield. Stop the swing.
                                        {
                                            data.meleeProgress = data.meleeLength = 0;
                                            return;
                                        }
                                        case HEAD:
                                            damageMultiplier = 2F;
                                            break;
                                        case RIGHTARM:
                                        case LEFTARM:
                                            damageMultiplier = 0.6F;
                                            break;
                                        default:
                                    }

                                    if (playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.getMeleeDamage(itemstack, false))) {
                                        //If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
                                        playerHit.hitbox.player.arrowHitTimer++;
                                        playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
                                    }

                                    if (FlansMod.DEBUG)
                                        world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
                                } else if (bulletHit instanceof EntityHit) {
                                    EntityHit entityHit = (EntityHit) bulletHit;
                                    if (entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.getMeleeDamage(itemstack, ((EntityHit) bulletHit).entity instanceof EntityDriveable)) && entityHit.entity instanceof EntityLivingBase) {
                                        EntityLivingBase living = (EntityLivingBase) entityHit.entity;
                                        //If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
                                        living.arrowHitTimer++;
                                        living.hurtResistantTime = living.maxHurtResistantTime / 2;
                                    }

                                    if (FlansMod.DEBUG)
                                        world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
                                }
                            }
                        }
                    }
                }
                //End raytrace

                data.lastMeleePositions[k] = nextPosInWorldCoords;
            }

            //Increment the progress meter
            data.meleeProgress++;
            //If we are done, reset the counters
            if (data.meleeProgress == data.meleeLength)
                data.meleeProgress = data.meleeLength = 0;
        }
    }

    public boolean DoesHitBlock(Vec3 startPos, Vec3 endPos, float time, EntityPlayer player) {
        Vec3 delta = endPos.subtract(startPos);
        Vec3 hitPos = endPos;

        Vec3 playerPos = Vec3.createVectorHelper(player.posX, player.posY + 1.4 + (player.worldObj.isRemote ? (player.isSneaking() ? -1.4 : -1.6) : 0), player.posZ);
        MovingObjectPosition mop = player.worldObj.rayTraceBlocks(playerPos, hitPos);

        if (mop != null) {
            player.worldObj.spawnEntityInWorld(new EntityDebugDot(player.worldObj, new Vector3f(mop.hitVec.xCoord, mop.hitVec.yCoord, mop.hitVec.zCoord), 20, 0.5F, 1, 0.5F));
            return player.worldObj.getBlock(mop.blockX, mop.blockY, mop.blockZ).getBlockHardness(player.worldObj, mop.blockX, mop.blockY, mop.blockZ) > 0.2;
        }

        return false;
    }

    public DamageSource getMeleeDamage(EntityPlayer attacker) {
        return new EntityDamageSourceFlans(type.shortName, attacker, attacker, type, false, true);
    }

    /**
     * 每当鼠标按下一次会执行一次代码
     */
    public void onMouseHeld(ItemStack stack, World world, EntityPlayerMP player, boolean left, boolean isShooting) {
        PlayerData data = PlayerHandler.getPlayerData(player);
        if (data != null && data.shootClickDelay == 0) {
            //Drivers can't shoot
            if (player.ridingEntity != null)
                return;
            if (left && data.offHandGunSlot != 0) {
                ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                GunType gunType = ((ItemGun) offHandGunStack.getItem()).type;
                data.isShootingLeft = isShooting;
                if ((gunType.getFireMode(offHandGunStack) == EnumFireMode.SEMIAUTO || gunType.getFireMode(stack) == EnumFireMode.RAILGUN) && isShooting) {
                    data.isShootingLeft = false;
                    player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, gunType, world, player, true));
                }
                if (gunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingLeft == 0) {
                    data.isShootingLeft = false;
                    data.burstRoundsRemainingLeft = gunType.getNumBurstRounds(stack);
                    player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, gunType, world, player, true));
                }
            } else {
                data.isShootingRight = isShooting;
                if ((type.getFireMode(stack) == EnumFireMode.SEMIAUTO || type.getFireMode(stack) == EnumFireMode.RAILGUN) && isShooting) {
                    data.isShootingRight = false;
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(stack, type, world, player, false));
                }
                if (type.getFireMode(stack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingRight == 0) {
                    data.isShootingRight = false;
                    data.burstRoundsRemainingRight = type.getNumBurstRounds(stack);
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(stack, type, world, player, false));
                }
            }
            //Play the warmup sound for miniguns immediately
            if (type.useLoopingSounds && isShooting) {
                data.shouldPlayWarmupSound = true;
            }
        }
    }

    public ItemStack tryToShoot(ItemStack gunStack, GunType gunType, World world, EntityPlayerMP entityplayer, boolean left) {
        PlayerData data = PlayerHandler.getPlayerData(entityplayer);
        sprinting = entityplayer.isSprinting();
        if (type.deployable || !type.usableByPlayers)
            return gunStack;

        //Shoot delay ticker is at (or below) 0. Try and shoot the next bullet
        if ((left && data.shootTimeLeft <= 0) || (!left && data.shootTimeRight <= 0)) {
            //Go through the bullet stacks in the gun and see if any of them are not null
            int bulletID = 0;
            ItemStack bulletStack = null;
            for (; bulletID < gunType.getNumAmmoItemsInGun(gunStack); bulletID++) {
                ItemStack checkingStack = getBulletItemStack(gunStack, bulletID);
                if (checkingStack != null && checkingStack.getItem() != null && checkingStack.getItemDamage() < checkingStack.getMaxDamage()) {
                    bulletStack = checkingStack;
                    break;
                }
            }
            boolean canActuallyHipFire = (gunType.hipFireWhileSprinting != 2) && !(gunType.hipFireWhileSprinting == 0 && FlansMod.disableSprintHipFireByDefault);
            //If no bullet stack was found, reload

            if (bulletStack == null && FlansMod.reloadOnRightClick) {
                int maxAmmo = type.getNumAmmoItemsInGun(gunStack);
                boolean singlesReload = maxAmmo > 1;
                int reloadCount;
                boolean empty = true;

                if (singlesReload) {
                    reloadCount = 0;
                    for (int i = 0; i < type.getNumAmmoItemsInGun(gunStack); i++) {
                        ItemStack oldBulletStack = ((ItemGun) gunStack.getItem()).getBulletItemStack(gunStack, i);
                        if (oldBulletStack != null && (oldBulletStack.getMaxDamage() - oldBulletStack.getItemDamage()) == 0) {
                            reloadCount += 1;
                            empty = false;
                        } else if (oldBulletStack == null) {
                            reloadCount += 1;
                        }
                    }
                } else {
                    reloadCount = 1;
                }

                if(empty) {
                    if(type.explodeOnEmpty) {
                        if(!world.isRemote) {
                            world.newExplosion(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, 1.0F, false , false);
                        }
                        return gunStack;
                    }
                }

                /* 奔跑不能射击 */
                if (sprinting && !type.isCanShootWhileRunning)
                    return gunStack;

                if (reload(gunStack, gunType, world, entityplayer, false, left, false, false)) {
                    //Set player shoot delay to be the reload delay
                    //Set both gun delays to avoid reloading two guns at once
                    //data.shootTimeRight = data.shootTimeLeft = (int)gunType.getReloadTime(gunStack);

                    float reloadTime;
                    if(empty){
                        reloadTime = singlesReload ? (type.getEmptyReloadTime(gunStack) / maxAmmo) * reloadCount : type.getEmptyReloadTime(gunStack);
                    } else {
                        reloadTime = type.getTacticalReloadTime(gunStack) / maxAmmo * reloadCount;
                    }

                    data.shootTimeRight += reloadTime;
                    data.shootTimeLeft += reloadTime;
                    if (left) {
                        data.reloadingLeft = true;
                        data.burstRoundsRemainingLeft = 0;
                    } else {
                        data.reloadingRight = true;
                        data.burstRoundsRemainingRight = 0;
                    }
                    //Send reload packet to induce reload effects client side
                    //ItemGun.setReloadCount(gunStack, reloadCount);
                    FlansMod.getPacketHandler().sendTo(new PacketReload(left, reloadCount, (int) reloadTime, singlesReload, false, false), entityplayer);
                    //Play reload sound
                    String soundToPlay = null;
                    AttachmentType grip = gunType.getGrip(gunStack);

                    if (gunType.getSecondaryFire(gunStack) && grip != null && grip.secondaryReloadSound != null)
                        soundToPlay = grip.secondaryReloadSound;
                    else if (gunType.reloadSoundOnEmpty != null)
                        soundToPlay = gunType.reloadSoundOnEmpty;
                    else if (gunType.reloadSound != null)
                        soundToPlay = gunType.reloadSound;

                    if (soundToPlay != null && type.getNumAmmoItemsInGun(gunStack) == 1) {
                        PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ,
                                type.reloadSoundRange, entityplayer.dimension, soundToPlay, false);
                    }
                } else if ((gunType.clickSoundOnEmpty != null) && canClick) {
                    PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSoundRange, entityplayer.dimension, gunType.clickSoundOnEmpty, false);
                    //canClick = false;
                } else if (data.isShootingRight != lastIsShooting) {
                    PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSoundRange, entityplayer.dimension, gunType.clickSoundOnEmptyRepeated, false);
                }

            }
            //A bullet stack was found, so try shooting with it
            else if (bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((sprinting && isScoped) || !sprinting || canActuallyHipFire) && entityplayer.ridingEntity == null) {
                /* 奔跑不能射击 */
                if (sprinting && !type.isCanShootWhileRunning)
                    return gunStack;
                //Shoot
                GunFiredEvent gunFireEvent = new GunFiredEvent(entityplayer);
                MinecraftForge.EVENT_BUS.post(gunFireEvent);
                if (gunFireEvent.isCanceled()) return gunStack;

                shoot(gunStack, gunType, world, bulletStack, entityplayer, left);
                canClick = true;

                //Damage the bullet item
                bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);

                //Update the stack in the gun
                setBulletItemStack(gunStack, bulletStack, bulletID);

                if (gunType.consumeGunUponUse)
                    return null;
            }

            if (gunType.getFireMode(gunStack) == EnumFireMode.BURST) {
                /* 奔跑不能射击 */
                if (sprinting && !type.isCanShootWhileRunning)
                    return gunStack;
                if (left && data.burstRoundsRemainingLeft > 0)
                    data.burstRoundsRemainingLeft--;
                if (!left && data.burstRoundsRemainingRight > 0)
                    data.burstRoundsRemainingRight--;
            }
        } else {
            if(type.explodeOnEmpty) {
                if(!world.isRemote) {
                    world.newExplosion(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, 1.0F, false , false);
                }
                return gunStack;
            }
        }
        return gunStack;
    }

    /**
     * Reload方法简化版 , 简化传参
     */
    public boolean reload(ItemStack gunStack, GunType gunType, World world, EntityPlayer player, boolean forceReload, boolean left, boolean combineAmmoOnReload, boolean ammoToUpperInventory) {
        // 简化传参
        return reload(gunStack, gunType, world, player, player.inventory, player.capabilities.isCreativeMode, forceReload, combineAmmoOnReload, ammoToUpperInventory);
    }

    /**
     * Reload方法 , 换弹逻辑所在 , 检查枪支的弹药槽，寻找可用的弹药并装填到枪支中 , 若返回 true 则换弹成功 反之失败
     */
    public boolean reload(ItemStack gunStack, GunType gunType, World world, Entity entity, IInventory inventory, boolean creative, boolean forceReload, boolean combineAmmoOnReload, boolean ammoToUpperInventory) {

        GunReloadEvent gunReloadEvent = new GunReloadEvent(entity, gunStack);
        MinecraftForge.EVENT_BUS.post(gunReloadEvent);
        if (gunReloadEvent.isCanceled()) return false;

        // 定义是否正常换弹
        boolean reloadedSomething = false;


        //架设性武器不能在物品栏中换弹
        if (gunType.deployable)
            return false;
        //近战武器不能换弹
        if (gunType.ammo.isEmpty())
            return false;
        //如果玩家在弹夹（或弹药槽）还没有完全用尽,且枪械不允许强制换弹,之前尝试进行装弹，那么游戏会拒绝这个装弹操作
        if (forceReload && !gunType.canForceReload)
            return false;
        String preferredAmmoShortname = ((ItemGun) gunStack.getItem()).getPreferredAmmoStack(gunStack); // 需要换的弹药类型的shortname
        for (int i = 0; i < gunType.getNumAmmoItemsInGun(gunStack); i++) { // 遍历枪里每个弹药槽
            ItemStack bulletStack = getBulletItemStack(gunStack, i); // 获取弹药槽stack
            // 如果弹药槽内没有弹匣 , 或弹匣为空 , 或这是一次强制换弹
            if (bulletStack == null || bulletStack.getItemDamage() == bulletStack.getMaxDamage() || forceReload) {
                //遍历玩家的背包（或者其他包含物品槽的地方，如存储箱、容器等），然后查找包含子弹（弹药）的物品栈中哪一个具有最多数量的子弹
                int bestSlot = -1;// 最多子弹的槽的下标
                int bulletsInBestSlot = 0;// 最多子弹的槽里有多少子弹
                boolean bestSlotIsPreferred = false; // 是否找到了一个首选的物品槽
                for (int j = 0; j < inventory.getSizeInventory(); j++) { // 返回物品栏中物品槽的数量
                    ItemStack item = inventory.getStackInSlot(j); // 获取当前遍历到的stack
                    if (item != null && item.getItem() instanceof ItemShootable && gunType.isAmmo(((ItemShootable) (item.getItem())).type, gunStack)) {
                        // 若当前槽有物品 , 且 当前物品为可发射类型 且 为目前该枪可使用的弹药类型
                        int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
                        // 计算目前slot内弹匣的弹药量
                        boolean isPreferred = ((ItemShootable) item.getItem()).type.shortName.equals(preferredAmmoShortname); // 是否为选中弹药
                        if (isPreferred) { // 如果是
                            if (!bestSlotIsPreferred || bulletsInThisSlot > bulletsInBestSlot) {
                                bestSlot = j;
                                bulletsInBestSlot = bulletsInThisSlot;
                                bestSlotIsPreferred = true;
                            }
                        } else if (!bestSlotIsPreferred && bulletsInThisSlot > bulletsInBestSlot) {
                            bestSlot = j;
                            bestSlotIsPreferred = false;
                        }
                    }
                }

                //如果在玩家的背包（或者其他物品存储容器）中找到了一个有效的非空弹匣（或者其他类型的子弹物品），那么就加载它到枪支中
                if (bestSlot != -1) { // 如果找到了最好的slot栏
                    ItemStack newBulletStack = inventory.getStackInSlot(bestSlot); // 获取该栏里bullet的stack
                    ItemStack stackToLoad = newBulletStack.copy(); // 复制该栏里的stack
                    stackToLoad.stackSize = 1; // 设置数量为1
                    //把刚刚装载的弹匣从物品栏移除
                    if (!creative)
                        newBulletStack.stackSize--;
                    if (newBulletStack.stackSize <= 0)
                        newBulletStack = null;
                    inventory.setInventorySlotContents(bestSlot, newBulletStack);
                    //掉落物品 , (如果需要且玩家此时不为创造模式 , 掉落所需物品)
                    if (bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((ItemShootable) bulletStack.getItem()).type.dropItemOnReload != null && !creative && bulletStack.getItemDamage() == bulletStack.getMaxDamage())
                        dropItem(world, entity, ((ItemShootable) bulletStack.getItem()).type.dropItemOnReload);
                    //如果弹匣（或者其他类型的装填物品）还没有完全用尽，那么将它从枪支中取出，并将它返回给玩家，如果无法返回给玩家，就将它掉落在地上。
                    if (bulletStack != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
                        if (!InventoryHelper.addItemStackToInventory(inventory, bulletStack, creative, combineAmmoOnReload, ammoToUpperInventory))
                            entity.entityDropItem(bulletStack, 0.5F);
                    }

                    setBulletItemStack(gunStack, stackToLoad, i);


                    //成功装弹!
                    reloadedSomething = true;
                }
            }
        }

        return reloadedSomething;
    }

    /**
     * Method for shooting to avoid repeated code
     */
    private void shoot(ItemStack stack, GunType gunType, World world, ItemStack bulletStack, EntityPlayer entityPlayer, boolean left) {
        //flash(entityplayer);

        ShootableType bullet = ((ItemShootable) bulletStack.getItem()).type;
        boolean lastBullet = false;
        ItemStack[] bulletStacks = new ItemStack[type.getNumAmmoItemsInGun(stack)];
        for (int i = 0; i < type.getNumAmmoItemsInGun(stack); i++) {
            bulletStacks[i] = ((ItemGun) stack.getItem()).getBulletItemStack(stack, i);
            if (bulletStacks[i] != null && bulletStacks[i].getItem() instanceof ItemBullet && (bulletStacks[i].getMaxDamage() - bulletStacks[i].getItemDamage() == 1))
                lastBullet = true;
        }

        // Play a sound if the previous sound has finished
        if (soundDelay <= 0 && gunType.shootSound != null) {
            AttachmentType barrel = gunType.getBarrel(stack);
            AttachmentType grip = gunType.getGrip(stack);

            boolean silenced = barrel != null && barrel.silencer && !gunType.getSecondaryFire(stack);
            //world.playSoundAtEntity(entityplayer, type.shootSound, 10F, type.distortSound ? 1.0F / (world.rand.nextFloat() * 0.4F + 0.8F) : 1.0F);
            String soundToPlay = null;
            boolean shouldSilence = silenced && gunType.suppressedShootSound == null;
            if (gunType.getSecondaryFire(stack) && grip != null && grip.secondaryShootSound != null)
                soundToPlay = grip.secondaryShootSound;
            else if (lastBullet && gunType.lastShootSound != null)
                soundToPlay = gunType.lastShootSound;
            else if (silenced && gunType.suppressedShootSound != null)
                soundToPlay = gunType.suppressedShootSound;
            else if (gunType.shootSound != null)
                soundToPlay = gunType.shootSound;

            if (soundToPlay != null)
                PacketPlaySound.sendSoundPacket(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, type.gunSoundRange, entityPlayer.dimension, soundToPlay, gunType.distortSound, shouldSilence);
            soundDelay = gunType.shootSoundLength;
            if (type.distantShootSound != null) {
                FlansMod.packetHandler.sendToDonut(new PacketPlaySound(entityPlayer.posX, entityPlayer.posY,
                                entityPlayer.posZ, type.distantShootSound), entityPlayer.posX, entityPlayer.posY,
                        entityPlayer.posZ, type.gunSoundRange, type.distantSoundRange, entityPlayer.dimension);
            }
        }

        AttachmentType barrel = gunType.getBarrel(stack);
        if ((barrel == null || !barrel.disableMuzzleFlash) && type.getShouldShowMuzzleFlash()) {
            PacketMuzzleFlash p = new PacketMuzzleFlash(entityPlayer, type.muzzleFlashParticle, type.muzzleFlashParticleSize, type.flashTexture == null, gunType.shortName);
            FlansMod.packetHandler.sendToAllAround(p, entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, 160, entityPlayer.dimension);
        }

        if (!world.isRemote && bulletStack.getItem() instanceof ItemShootable) {
            // Spawn the bullet entities
            ItemShootable itemShootable = (ItemShootable) bulletStack.getItem();
            ShootableType shootableType = itemShootable.type;
            int numBullets = -1;
            float spread = -1.0F;

            if (shootableType instanceof BulletType) {
                if (gunType.allowNumBulletsByBulletType) {
                    numBullets = ((BulletType) shootableType).numBullets;
                }
                if (gunType.allowSpreadByBullet) {
                    spread = ((BulletType) shootableType).bulletSpread;
                }
            }

            if (numBullets <= 0) {
                numBullets = gunType.getNumBullets(stack);
            }

            if (spread <= 0) {
                spread = gunType.getSpread(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting());
                //spread = (float) currentSpread;
            }

            for (int k = 0; k < numBullets; k++) {
                world.spawnEntityInWorld(itemShootable.getEntity(
                        world,
                        entityPlayer,
                        gunType.getDamage(stack),
                        gunType.getBulletSpeed(stack, bulletStack),
                        numBullets > 1,
                        bulletStack.getItemDamage(),
                        gunType, spread, type.isDuckBill() ? spread * 2.0F : spread));
            }

            if(!FlansMod.recoilOnClient) {
                FlansMod.packetHandler.sendTo(new PacketGunRecoil(gunType.getRecoilPitch(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting()), gunType.getRecoilYaw(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting())), (EntityPlayerMP) entityPlayer);
            }

            // Drop item on shooting if bullet requires it
            if (bullet.dropItemOnShoot != null && !entityPlayer.capabilities.isCreativeMode)
                dropItem(world, entityPlayer, bullet.dropItemOnShoot);
            // Drop item on shooting if gun requires it
            if (gunType.dropItemOnShoot != null)// && !entityplayer.capabilities.isCreativeMode)
                dropItem(world, entityPlayer, gunType.dropItemOnShoot);

            if (gunType.isAED) {
                // 检测玩家正对的方向一定距离内是否有玩家尸体实体
                double searchDistance = 5.0; // 检测距离，可以调整
                EntityCorpse targetCorpse = null;

                // 获取玩家正对的方向向量
                Vec3 lookVec = entityPlayer.getLookVec();

                // 获取玩家的当前位置
                Vec3 playerPos = Vec3.createVectorHelper(entityPlayer.posX, entityPlayer.posY + entityPlayer.getEyeHeight(), entityPlayer.posZ);

                // 遍历当前世界中所有实体
                for (Object entity : entityPlayer.worldObj.loadedEntityList) {
                    if (entity instanceof EntityCorpse) {
                        EntityCorpse corpse = (EntityCorpse) entity;

                        // 检查距离是否在范围内
                        double distance = playerPos.distanceTo(Vec3.createVectorHelper(corpse.posX, corpse.posY, corpse.posZ));
                        if (distance > searchDistance) {
                            continue; // 跳过距离超过范围的尸体
                        }

                        // 检查是否在玩家的视线方向上
                        Vec3 corpseVec = Vec3.createVectorHelper(corpse.posX - playerPos.xCoord, corpse.posY - playerPos.yCoord, corpse.posZ - playerPos.zCoord);
                        double dotProduct = lookVec.dotProduct(corpseVec.normalize()); // 方向向量的点积

                        if (dotProduct < 0.8) { // 视角容差，0.99 表示基本正对，可以调整
                            continue; // 跳过不在视线方向的尸体
                        }

                        // 检查是否属于同一计分板队伍
                        if (entityPlayer.getTeam() != null && entityPlayer.getTeam().isSameTeam(corpse.getPlayer().getTeam())) {
                            targetCorpse = corpse;
                            break; // 找到符合条件的尸体，退出循环
                        }
                    }
                }

                // 如果找到符合条件的尸体实体，则发布事件
                if (targetCorpse != null) {
                    PlayerReviveEvent event = new PlayerReviveEvent(entityPlayer.getDisplayName(), targetCorpse.getPlayerName(), gunType.name, targetCorpse.posX, targetCorpse.posY, targetCorpse.posZ);
                    MinecraftForge.EVENT_BUS.post(event);
                    targetCorpse.setDead();
                }
            }
        }

        if (left)
            PlayerHandler.getPlayerData(entityPlayer).shootTimeLeft += gunType.getShootDelay(stack);
        else PlayerHandler.getPlayerData(entityPlayer).shootTimeRight += gunType.getShootDelay(stack);
    }

    /**
     * Deployable guns only
     */
    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
        if (type.deployable) {
            //Raytracing
            float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
            float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
            float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
            float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
            double length = 5D;
            Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);
            Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
            MovingObjectPosition look = world.rayTraceBlocks(posVec, lookVec, true);

            //Result check
            if (look != null && look.typeOfHit == MovingObjectType.BLOCK) {
                if (look.sideHit == 1) {
                    int playerDir = MathHelper.floor_double(((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
                    int i = look.blockX;
                    int j = look.blockY;
                    int k = look.blockZ;
                    if (!world.isRemote) {
                        if (world.getBlock(i, j, k) == Blocks.snow) {
                            j--;
                        }
                        if (isSolid(world, i, j, k) && (world.getBlock(i, j + 1, k) == Blocks.air || world.getBlock(i, j + 1, k) == Blocks.snow) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air || world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.snow)) {
                            for (EntityMG mg : EntityMG.mgs) {
                                if (mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead)
                                    return itemstack;
                            }
                            if (!world.isRemote) {
                                world.spawnEntityInWorld(new EntityMG(world, i, j + 1, k, playerDir, type));
                            }
                            if (!entityplayer.capabilities.isCreativeMode)
                                itemstack.stackSize = 0;
                        }
                    }
                }
            }
        }
        //Stop the gun bobbing up and down when holding shoot and looking at a block
        if (world.isRemote) {
            for (int i = 0; i < 3; i++)
                Minecraft.getMinecraft().entityRenderer.itemRenderer.updateEquippedItem();
        }
        return itemstack;
    }

    private boolean isSolid(World world, int i, int j, int k) {
        Block block = world.getBlock(i, j, k);
        return block != null && block.getMaterial().isSolid() && block.isOpaqueCube();
    }

    //Stop damage being done to entities when scoping etc.
    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        return type.secondaryFunction != EnumSecondaryFunction.MELEE;
    }

    @Override
    public boolean isFull3D() {
        return true;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
        if (type.meleeSound != null)
            PacketPlaySound.sendSoundPacket(entityLiving.posX, entityLiving.posY, entityLiving.posZ, type.meleeSoundRange, entityLiving.dimension, type.meleeSound, true);
        //Do custom melee code here
        if (type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE) {
            //Do animation
            if (entityLiving.worldObj.isRemote) {
                GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
                animations.doMelee(type.meleeTime);
            }
            //Do custom melee hit detection
            if (entityLiving instanceof EntityPlayer) {
                PlayerData data = PlayerHandler.getPlayerData((EntityPlayer) entityLiving);
                data.doMelee((EntityPlayer) entityLiving, type.meleeTime, type);
            }
        }
        return type.secondaryFunction != EnumSecondaryFunction.MELEE;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player) {
        return true;
    }

    @Override
    public boolean func_150897_b(Block p_150897_1_) {
        return false;
    }

    @SubscribeEvent
    public void onEventBlockBreak(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        if (player != null && player.getHeldItem() != null) {
            if (player.getHeldItem().getItem() instanceof ItemGun) {
                event.setCanceled(true);
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return type.colour;
    }

    // ----------------- Paintjobs -----------------

    public boolean isItemStackDamageable() {
        return true;
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list) {
        PaintableType type = ((IPaintableItem) item).GetPaintableType();
        if (FlansMod.addAllPaintjobsToCreative) {
            for (Paintjob paintjob : type.paintjobs)
                addPaintjobToList(item, type, paintjob, list);
        } else addPaintjobToList(item, type, type.defaultPaintjob, list);
    }

    // ---------------------------------------------

    private void addPaintjobToList(Item item, PaintableType type, Paintjob paintjob, List list) {
        ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
        NBTTagCompound tags = new NBTTagCompound();
        paintableStack.setTagCompound(tags);
        list.add(paintableStack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        icons = new IIcon[type.paintjobs.size()];

        defaultIcon = icon.registerIcon("flansmod:null");
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
        for (int i = 0; i < type.paintjobs.size(); i++) {
            icons[i] = icon.registerIcon("FlansMod:" + type.paintjobs.get(i).iconName);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(ItemStack stack) {
        try {
            if (stack.getItemDamage() < icons.length) {
                return icons[stack.getItemDamage()];
            } else {
                return icons[0];
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 100;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return type != null ? type.itemUseAction : EnumAction.bow;
    }

    @Override
    public Multimap getAttributeModifiers(ItemStack stack) {
        Multimap map = super.getAttributeModifiers(stack);
        map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "KnockbackResist", type.knockbackModifier, 0));
        map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "MovementSpeed", type.getMovementSpeed(stack) - 1F, 2));
        if (type.secondaryFunction == EnumSecondaryFunction.MELEE)
            map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", type.meleeDamage, 0));
        return map;
    }

    public void setPreferredAmmoStack(ItemStack gun, String ammoName) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        String s = "preferredAmmo";
        if (!gun.stackTagCompound.hasKey(s)) {
            gun.stackTagCompound.setString(s, ammoName);
        }
        gun.stackTagCompound.setString(s, ammoName);
    }

    public String getPreferredAmmoStack(ItemStack gun) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        String s = "preferredAmmo";
        if (gun.stackTagCompound.hasKey(s)) {
            return gun.stackTagCompound.getString(s);
        }
        return null;
    }

}
