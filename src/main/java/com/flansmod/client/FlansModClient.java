package com.flansmod.client;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.particle.EntityCloudFX2;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.hook.MCHeliUtil;
import com.flansmod.common.network.PacketMissileMCLOSOffset;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Property;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.util.Objects;
import java.util.Random;


@SuppressWarnings("unused")
public class FlansModClient extends FlansMod {

    /**
     * 模型调试模式
     */
    public static boolean modelDebugMode = false;

    /**
     * 是否为手电筒和战术灯
     */
    public static boolean isFlashLight = false;
    public static boolean isTacticalLight = false;
    //飞机 / 地面载具控制
    /**
     * 玩家是否收到了车辆教程文本(第一次上载具会给聊天框打教程)
     */
    public static boolean doneTutorial = false;
    /**
     * 玩家是否处于弹匣自动合并模式
     */
    // TODO : BUG
    public static boolean combineAmmoOnReload = true;
    /**
     * 玩家是否在鼠标操控模式
     */
    public static boolean controlModeMouse = true;

    /* 是否启用子弹追踪模式  */
    public static boolean enabledCameraFollowBullet = false;

    /*  子弹追踪是否正在工作     */
    public static boolean isBulletTrackingActive = false;
    public static boolean enableMCHEntityCamera = true;

    /**
     * 是否禁用步兵第三人称
     */
    public static boolean disableThirdPerson = true;
    /**
     * 鼠标控制开关上的延时器(操控模式间切换有延时)
     */
    public static int controlModeSwitchTimer = 20;

    /**
     * 射击和装填之间的延时
     */
    public static float shootTimeLeft, shootTimeRight;

    //后坐力变量
    /**
     * 通过射击作用于玩家视野的后坐力
     */
    public static float playerRecoilPitch;
    public static float playerRecoilYaw;
    /**
     * 为使后坐力恢复正常，对后坐力施加的补偿量
     */
    public static float antiRecoilPitch;
    public static float antiRecoilYaw;

    public static int lastBulletReload = 0;
    public static int shotState = -1;

    //Scope variables
    /**
     * 防止Toggle开镜模式下长按重复开镜动作问题，设置一段时间后自动收镜/开镜
     */
    public static int scopeTime;
    /**
     * 当前所采用的瞄具（接口类型）
     */
    public static IScope currentScope = null;
    /**
     * 开镜过程 0 = 完全收镜状态，1 = 完全处于开镜状态
     */
    public static float zoomProgress = 0F, lastZoomProgress = 0F;
    public static float stanceProgress = 0F, lastStanceProgress = 0F;
    public static float springProgress = 0F, lastSpringProgress = 0F;
    public static float stableSightProgress = 1F, stableSightHoldTime = 0F;

    /**
     * 持枪下蹲过程 0 = 完全处于站立状态，1 = 完全处于下蹲状态
     */
    public static float crouchProgress = 0F, lastCrouchProgress = 0F;
    /**
     * The zoom level of the last scope used, for transitioning out of being scoped, even after the scope is forgotten
     */
    public static float lastZoomLevel = 1F, lastFOVZoomLevel = 1F;

    //Variables to hold the state of some settings so that after being hacked for scopes, they may be restored
    /**
     * 玩家最初的鼠标灵敏度
     */
    public static float originalMouseSensitivity = 0.5F;
    public static float MouseSenNedToChange = 0.0F;
    /**
     * 游戏中的鼠标灵敏度
     */
    public static float gamingMouseSensitivity = 0.5F;
    /**
     * 玩家最初的FOV
     */
    public static float originalFOV = 81F;
    /**
     * 是否允许视角摇晃
     */
    public static boolean originalViewBobbing = true;

    /**
     * Whether the player is in a plane or not
     */
    public static boolean inPlane = false;
    /**
     * 玩家是否在冲刺状态
     */
    public static boolean isSprinting = false;

    /**
     * 鼠标偏移量
     */
    public static float mouseOffsetX = 0F, mouseOffsetY = 0F;

    /**
     * 鼠标偏移量
     */
    public static float lastMouseOffsetX = 0F, lastMouseOffsetY = 0F;

    /**
     * 储存玩家当前手持物品
     */
    public static Item currentItemInHand = null;
    /**
     * 玩家是否发生了切枪动作
     */
    public static boolean isWeaponChange = false;

    /**
     * 闪光弹生效时间
     */
    public static int tickCountFlash = 0;
    public static float flashProgress = 0F;

    /**
     * Packet containing teams mod information from the server
     */
    public static PacketTeamInfo teamInfo;

    /**
     * When a round ends, the teams score GUI is locked for this length of time
     */
    public static int teamsScoreGUILock = 0;

    public static AimType aimType;
    public static FlanMouseButton fireButton;
    public static FlanMouseButton aimButton;
    //TODO : bug
    public static boolean ammoToUpperInventoryOnReload = false;
    public static float fov;

    public static boolean hitMarker = false;
    public static boolean hitMarkerHeadshot = false;
    public static float hitMarkerPenAmount = 1F;
    public static boolean hitMarkerExplosion = false;
    public static boolean reloadStart = false;

    public static Random random = new Random();

    @SideOnly(Side.CLIENT)
    public static EntityLivingBase camera;
    public static boolean apsMarker;
    public static float dpsDisplay;
    public static int dpsDisplayCountdown;
    public static Minecraft minecraft = FMLClientHandler.instance().getClient();

    //private static final ResourceLocation zombieSkin = new ResourceLocation("flansmod", "skins/zombie.png");
    public static void setAmmoToUpperInventoryOnReload(boolean ammoToUpperInventoryOnReload) {
        if (ammoToUpperInventoryOnReload) {
            minecraft.thePlayer.addChatMessage(new ChatComponentText("§a弹药自动置顶已开启"));
        } else {
            minecraft.thePlayer.addChatMessage(new ChatComponentText("§c弹药自动置顶已关闭"));
        }

        FlansModClient.ammoToUpperInventoryOnReload = ammoToUpperInventoryOnReload;
    }

    public static void setCombineAmmoOnReload(boolean combineAmmoOnReload) {
        if (combineAmmoOnReload) {
            minecraft.thePlayer.addChatMessage(new ChatComponentText("§a弹匣自动合并已开启"));
        } else {
            minecraft.thePlayer.addChatMessage(new ChatComponentText("§c弹匣自动合并已关闭"));
        }
        FlansModClient.combineAmmoOnReload = combineAmmoOnReload;
    }

    public static float shootTime(boolean left) {
        return left ? shootTimeLeft : shootTimeRight;
    }

    public static void tick() {

        if (minecraft.gameSettings.particleSetting == 0) {
            minecraft.gameSettings.particleSetting = 1;
        }

        if (minecraft.thePlayer == null || minecraft.theWorld == null)
            return;

        if (minecraft.thePlayer.ridingEntity instanceof IControllable && minecraft.currentScreen == null)
            minecraft.displayGuiScreen(new GuiDriveableController((IControllable) minecraft.thePlayer.ridingEntity));

        //禁止步兵切换第三人称
        if (disableThirdPerson) {
            if (minecraft.gameSettings.thirdPersonView != 0 && minecraft.thePlayer.ridingEntity == null && !isBulletTrackingActive) {
                minecraft.thePlayer.addChatComponentMessage(new ChatComponentText("步兵禁止切换第三人称!"));
                minecraft.gameSettings.thirdPersonView = 0;
            }
        }

        //禁止F3+A
        if (Keyboard.isKeyDown(Keyboard.KEY_F3) && Keyboard.isKeyDown(Keyboard.KEY_A)) {
            minecraft.shutdown();
        }

        float yawOffset = 0.0f;
        float pitchOffset = 0.0f;
        if (Keyboard.isKeyDown(KeyInputHandler.missileLeftKey.getKeyCode())) {
            yawOffset -= 0.025f; // 向左
        }
        if (Keyboard.isKeyDown(KeyInputHandler.missileRightKey.getKeyCode())) {
            yawOffset += 0.025f; // 向右
        }
        if (Keyboard.isKeyDown(KeyInputHandler.missileUpKey.getKeyCode())) {
            pitchOffset += 0.025f; // 向上
        }
        if (Keyboard.isKeyDown(KeyInputHandler.missileDownKey.getKeyCode())) {
            pitchOffset -= 0.025f; // 向下
        }
        if (yawOffset != 0.0f || pitchOffset != 0.0f) {
            FlansMod.getPacketHandler().sendToServer(new PacketMissileMCLOSOffset(yawOffset, pitchOffset));
        }

        if (Keyboard.isKeyDown(KeyInputHandler.cameraFollowBullet.getKeyCode())
            && !FMLClientHandler.instance().isGUIOpen(GuiChat.class)
        ) {
            enabledCameraFollowBullet = true;
        } else {
            enabledCameraFollowBullet = false;
        }

        //MCH载具视角
        if (enableMCHEntityCamera) {
            if (minecraft.thePlayer.ridingEntity != null) {
                if (MCHeliUtil.isMCHeliAircraft(minecraft.thePlayer.ridingEntity)) {
                    if (minecraft.gameSettings.thirdPersonView != 0) {
                        if (camera == null) {
                            camera = new MCHEntityCamera(minecraft.theWorld, minecraft.thePlayer.ridingEntity);
                            minecraft.thePlayer.worldObj.spawnEntityInWorld(camera);
                        }
                        minecraft.renderViewEntity = camera;
                        TickHandlerClient.showVehicleCrossHair = true;
                    } else {
                        //minecraft.renderViewEntity = MCHeliUtil.getCamera(minecraft.thePlayer.ridingEntity);
                        if (camera != null) {
                            camera.setDead();
                            camera = null;
                        }
                        TickHandlerClient.showVehicleCrossHair = false;
                    }
                } else {
                    if (minecraft.thePlayer.ridingEntity == null)
                        minecraft.renderViewEntity = minecraft.thePlayer;
                    if (camera != null) {
                        camera.setDead();
                        camera = null;
                    }
                    TickHandlerClient.showVehicleCrossHair = false;
                }
            } else {
                if (camera != null) {
                    camera.setDead();
                    camera = null;
                }
                TickHandlerClient.showVehicleCrossHair = false;
            }
        }

        // 子弹跟踪视角


        //Teams GUI lock at end of rounds
        if (teamsScoreGUILock > 0) {
            teamsScoreGUILock--;
            if (minecraft.currentScreen == null)
                minecraft.displayGuiScreen(new GuiTeamScores());
        }

        // Guns
        if (shootTimeLeft > 0)
            shootTimeLeft--;
        if (shootTimeRight > 0)
            shootTimeRight--;
        if (scopeTime > 0)
            scopeTime--;
        if (playerRecoilPitch > 0) {
            ItemStack itemBeingUsed = minecraft.thePlayer.getCurrentEquippedItem();
            GunType typeHeld = null;
            if (itemBeingUsed != null && itemBeingUsed.getItem() instanceof ItemGun)
                typeHeld = ((ItemGun) itemBeingUsed.getItem()).type;

            if (typeHeld != null) {
                playerRecoilPitch *= typeHeld.getRecoilControl(itemBeingUsed, minecraft.thePlayer.isSprinting(), minecraft.thePlayer.isSneaking());
            } else {
                // idk why this would happen.
                playerRecoilPitch *= 0.8F;
            }
        }

        if (minecraft.thePlayer.getCurrentEquippedItem() == null || !(minecraft.thePlayer.getCurrentEquippedItem().
                getItem() instanceof ItemGun)) {
            playerRecoilPitch = 0.0F;
            playerRecoilYaw = 0.0F;
        }

        minecraft.thePlayer.rotationPitch -= playerRecoilPitch;
        minecraft.thePlayer.rotationYaw -= playerRecoilYaw;
        antiRecoilPitch += playerRecoilPitch;
        antiRecoilYaw += playerRecoilYaw;

        // No anti-recoil if realistic recoil is on,
        // and no anti-recoil if firing and enable sight downward movement is off
        boolean firingGun = Mouse.isButtonDown(fireButton.getButton()) && minecraft.thePlayer.getHeldItem() != null && minecraft.thePlayer.getHeldItem().getItem() instanceof ItemGun;
        if (!FlansMod.realisticRecoil && ((!firingGun) || FlansMod.enableSightDownwardMovement)) {
            minecraft.thePlayer.rotationPitch += antiRecoilPitch * 0.2F;
        }

        minecraft.thePlayer.rotationYaw += antiRecoilYaw * 0.2F;
        antiRecoilPitch *= 0.8F;
        antiRecoilYaw *= 0.8F;

        playerRecoilYaw *= 0.8F;


        //Update gun animations for the gun in hand
        for (
                GunAnimations g : gunAnimationsRight.values()) {
            g.update();
        }
        for (
                GunAnimations g : gunAnimationsLeft.values()) {
            g.update();
        }

        for (
                Object obj : minecraft.theWorld.playerEntities) {
            EntityPlayer player = (EntityPlayer) obj;
            ItemStack currentItem = player.getCurrentEquippedItem();
            if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
                if (player == minecraft.thePlayer && minecraft.gameSettings.thirdPersonView == 0)
                    player.clearItemInUse();
                else {
                    if (currentItem.getItemUseAction() == EnumAction.bow ||
                            currentItem.getItemUseAction() == EnumAction.block) {
                        player.setItemInUse(currentItem, 100);
                    }
                }
            }
        }

        Minecraft mc = Minecraft.getMinecraft();
        if (FlansMod.canChangeSettings) {
            originalMouseSensitivity = minecraft.gameSettings.mouseSensitivity;
        }

        //If the currently held item is not a gun or is the wrong gun, unscope
        Item itemInHand = null;
        ItemStack itemstackInHand = minecraft.thePlayer.inventory.getCurrentItem();
        if (itemstackInHand != null)
            itemInHand = itemstackInHand.getItem();

        if (itemInHand instanceof ItemGun && !FlansMod.canChangeSettings) {
            gamingMouseSensitivity = originalMouseSensitivity * (0.5F + 0.5F * ((ItemGun) itemInHand).type.getMovementSpeed(itemstackInHand));
        } else {
            gamingMouseSensitivity = originalMouseSensitivity;
        }

        if (isSprinting || (currentScope != null && (itemInHand == null || !(itemInHand instanceof ItemGun && ((ItemGun) itemInHand).type.getCurrentScope(itemstackInHand) == currentScope)))) {
            currentScope = null;
            minecraft.gameSettings.fovSetting = originalFOV;
            minecraft.gameSettings.mouseSensitivity = originalMouseSensitivity;
            minecraft.gameSettings.viewBobbing = originalViewBobbing;
        }

        //Calculate new zoom variables
        lastZoomProgress = zoomProgress;


        /**
         * 检测切枪
         */
        Item item = null;
        if (mc.thePlayer != null && mc.thePlayer.getHeldItem() != null) {
            item = mc.thePlayer.getHeldItem().getItem();
        }

        isWeaponChange = !Objects.equals(item, currentItemInHand);
        if (mc.thePlayer != null && mc.thePlayer.getHeldItem() != null) {
            currentItemInHand = mc.thePlayer.getHeldItem().getItem();
        } else currentItemInHand = null;

        /**  涉及开镜时间的改动  */
        if (currentScope == null) {
            if (mc.thePlayer != null && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemGun) {
                zoomProgress *= ((ItemGun) itemInHand).type.getAimTimeConstant(itemstackInHand);
            } else {
                zoomProgress *= 0.66F;
            }
        } else if (mc.thePlayer != null && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().
                getItem() instanceof ItemGun) {
            float constant = ((ItemGun) itemInHand).type.getAimTimeConstant(itemstackInHand);
            zoomProgress = Math.min(zoomProgress + (1 - constant) / 2 , 1);
        } else {
            zoomProgress = 1.0F - (1.0F - zoomProgress) * 0.66F;
        }
        if (currentScope != null) {
            lastFOVZoomLevel = currentScope.getFOVFactor();
            MouseSenNedToChange = gamingMouseSensitivity - gamingMouseSensitivity / currentScope.getFOVFactor() / currentScope.getZoomFactor();
        }

        mc.gameSettings.mouseSensitivity = gamingMouseSensitivity - MouseSenNedToChange * zoomProgress;

        PlayerData playerData = PlayerHandler.getPlayerData(minecraft.getSession().getUsername());


        if (itemInHand instanceof ItemGun) {
            ItemGun itemGun = (ItemGun) itemInHand;
            GunType gunType = itemGun.type;
            GunAnimations gunAnimations = gunAnimationsRight.get(minecraft.thePlayer);

            /**  涉及奔跑时间的改动  */
            if(GunAnimations.reloadTimeLeft == 0) {
                playerData.lastSprintProgress = playerData.sprintProgress;
                if (ItemGun.sprinting) {
                    if (playerData.sprintProgress < 1.0F && gunType.getRunPosTime(itemstackInHand) != 0) {
                        playerData.sprintProgress += 1.0F / gunType.getRunPosTime(itemstackInHand);
                        if (playerData.sprintProgress > 1.0F)
                            playerData.sprintProgress = 1.0F;
                    }
                } else if (playerData.sprintProgress > 0.0F) {
                    playerData.sprintProgress -= 1.0F / gunType.getRunPosTime(itemstackInHand);
                    if (playerData.sprintProgress < 0.0F)
                        playerData.sprintProgress = 0.0F;
                }
            }

            if (currentScope != null) {
                lastZoomLevel = currentScope.getZoomFactor();
                lastFOVZoomLevel = currentScope.getFOVFactor();
                if (canChangeSettings) {
                    mc.gameSettings.mouseSensitivity = mc.gameSettings.mouseSensitivity / currentScope.getZoomFactor() / currentScope.getFOVFactor();
                }
            }

            /**  涉及下蹲时间的改动  */
            lastCrouchProgress = crouchProgress;
            if (ItemGun.crouching) {
                if (crouchProgress < 1.0F && gunType.getRunCrouchTime(itemstackInHand) != 0) {
                    crouchProgress += 1.0F / gunType.getRunCrouchTime(itemstackInHand);
                    if (crouchProgress > 1.0F)
                        crouchProgress = 1.0F;
                }
            } else if (crouchProgress > 0.0F) {
                crouchProgress -= 1.0F / gunType.getRunCrouchTime(itemstackInHand);
                if (crouchProgress < 0.0F)
                    crouchProgress = 0.0F;
            }

            /**  涉及跳跃时间的改动  */
            lastSpringProgress = springProgress;
            if (Minecraft.getMinecraft().thePlayer != null && !Minecraft.getMinecraft().thePlayer.onGround) {
                if (springProgress < 1.0F) {
                    springProgress = 1.0F - (1.0F - springProgress) * 0.5F;
                    if (springProgress > 1.0F)
                        springProgress = 1.0F;
                }
            } else if (springProgress > 0.0F) {
                springProgress *= 0.5F;
                if (springProgress < 0.0001F)
                    springProgress = 0.0F;
            }

            /**
             * 鼠标偏移量
             */
            MouseHelper mouse = Minecraft.getMinecraft().mouseHelper;
            lastMouseOffsetX = mouseOffsetX;
            lastMouseOffsetY = mouseOffsetY;
            if (mouse.deltaX > 0) {
                mouseOffsetX = 1.0F - (1.0F - mouseOffsetX) * 0.88F;
            } else if (mouse.deltaX < 0) {
                mouseOffsetX = -1.0F - (-1.0F - mouseOffsetX) * 0.88F;
            } else {
                mouseOffsetX *= 0.85F;
            }
            if (mouse.deltaY > 0) {
                mouseOffsetY = 1.0F - (1.0F - mouseOffsetY) * 0.85F;
            } else if (mouse.deltaY < 0) {
                mouseOffsetY = -1.0F - (-1.0F - mouseOffsetY) * 0.85F;
            } else {
                mouseOffsetY *= 0.85F;
            }

            /** 收枪参数 */
            lastStanceProgress = stanceProgress;
            //收枪
            if (ItemGun.sprinting && !ItemGun.crouching && gunAnimations != null && !gunAnimations.reloading && currentScope == null) {
                if (stanceProgress < 1.0F && gunType.getRunPosTime(itemstackInHand) != 0) {
                    stanceProgress += 1.0F / gunType.getRunPosTime(itemstackInHand);
                    if (stanceProgress > 1.0F)
                        stanceProgress = 1.0F;
                }
            } else if (stanceProgress > 0.0F) {
                float posTime = gunType.getRunPosTime(itemstackInHand);
                float mult = (posTime - 1) / (posTime + 1) * 0.8F;
                stanceProgress *= mult < 0.5 ? 0.5 : mult;
                if (stanceProgress < 0.0001F)
                    stanceProgress = 0.0F;
            }

            /** 屏息 & 抖动参数 **/
            if (gunType.getCameraShakeModifier(itemstackInHand) > 0
                    && currentScope != null
                    && currentScope.getZoomOverlay() != null
                    && currentScope.getZoomFactor() + currentScope.getFOVFactor() > 4) {
                double speed = (1.0 + minecraft.thePlayer.motionZ + minecraft.thePlayer.motionX) * stableSightProgress;
                double amplitude = speed * 0.01 * gunType.getCameraShakeModifier(itemstackInHand);
                minecraft.thePlayer.rotationYaw +=
                        amplitude * Math.sin(minecraft.thePlayer.ticksExisted * 0.05 * speed);
                minecraft.thePlayer.rotationPitch +=
                        amplitude * Math.cos(minecraft.thePlayer.ticksExisted * 0.02 * speed);
            }

            if (stableSightHoldTime < 0.1F) {
                stableSightProgress = 1F;
            } else if (stableSightHoldTime > 0.7F) {
                stableSightProgress = 2F;
            } else {
                stableSightProgress *= (1F - stableSightHoldTime) / 5F;
            }

            if (stableSightHoldTime > 1F) {
                stableSightHoldTime = 0;
            } else if (stableSightHoldTime > 0) {
                stableSightHoldTime -= 0.01F;
            }

            if (minecraft.thePlayer.isSneaking()) {
                stableSightHoldTime += 0.015F;
            }

            RenderManager.debugBoundingBox = gunType.canSpotEntity && zoomProgress > 0.95;
        } else {
            RenderManager.debugBoundingBox = false;
        }


        /** 闪光弹 */
        if (FlansModClient.isInFlash) {
            if (tickCountFlash < flashTime) {
                tickCountFlash++;

                FlansModClient.currentScope = null;
                FlansModClient.scopeTime = 2;

                if (tickCountFlash < flashTime * 0.25) {
                    flashProgress = tickCountFlash / (flashTime * 0.25F);
                } else if (tickCountFlash >= flashTime * 0.25 && tickCountFlash < flashTime * 0.75) {
                    flashProgress = 1;
                } else if (tickCountFlash >= flashTime * 0.75) {
                    flashProgress = 1 - (tickCountFlash - flashTime * 0.75F) / (flashTime * 0.25F);
                }
            } else {
                isInFlash = false;
                flashTime = 0;
                tickCountFlash = 0;
            }
        }

        /**
         * 计算dps
         */
        if (!Dps.isReset()) {
            dpsDisplay = Dps.calculateDps();
        }
        if (dpsDisplayCountdown > 0) {
            dpsDisplayCountdown--;
            if (dpsDisplayCountdown == 0) {
                dpsDisplay = 0;
                Dps.resetDps();
            }
        }

        if (minecraft.thePlayer.ridingEntity instanceof IControllable) {
            inPlane = true;
            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable) minecraft.thePlayer.ridingEntity).getPlayerRoll(), "camRoll", "R", "field_78495_O");
            } catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
            if (minecraft.thePlayer.ridingEntity instanceof IControllable) {
                try {
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable) minecraft.thePlayer.ridingEntity).getCameraDistance(), "thirdPersonDistance", "E", "field_78490_B");
                } catch (Exception e) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
            }
        } else if (inPlane) {
            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 0F, "camRoll", "R", "field_78495_O");
            } catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 4.0F, "thirdPersonDistance", "E", "field_78490_B");
            } catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
            inPlane = false;
        }
        if (controlModeSwitchTimer > 0)
            controlModeSwitchTimer--;
    }

    public static void renderTick(float smoothing) {
        //If the zoom has changed sufficiently, update it via reflection
        //if (Math.abs(zoomProgress - lastZoomProgress) > 0.0001F) {
        float actualZoomProgress = lastZoomProgress + (zoomProgress - lastZoomProgress) * smoothing;
        float botchedZoomProgress = zoomProgress > 0.92F ? 1F : 0F;
        double zoomLevel = botchedZoomProgress * lastZoomLevel + (1 - botchedZoomProgress);
        float FOVZoomLevel = actualZoomProgress * lastFOVZoomLevel + (1 - actualZoomProgress);
        if (Math.abs(zoomLevel - 1F) < 0.01F)
            zoomLevel = 1.0D;
        try {
            ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, zoomLevel, "cameraZoom", "af", "field_78503_V");
            minecraft.gameSettings.fovSetting = (((originalFOV * 40 + 70) / FOVZoomLevel) - 70) / 40;
        } catch (Exception e) {
            log("I forgot to update obfuscated reflection D:");
            throw new RuntimeException(e);
        }
        //}
    }

    static boolean flipControlMode() {
        if (controlModeSwitchTimer > 0)
            return false;
        controlModeMouse = !controlModeMouse;
        FMLClientHandler.instance().getClient().displayGuiScreen(controlModeMouse ? new GuiDriveableController((IControllable) FMLClientHandler.instance().getClient().thePlayer.ridingEntity) : null);
        controlModeSwitchTimer = 40;
        return true;
    }

    public static void reloadModels(boolean reloadSkins) {
        for (InfoType type : InfoType.infoTypes) {
            type.reloadModel();
        }
        if (reloadSkins)
            proxy.forceReload();
    }

    /**
     * Gets the team class from an ID
     */
    public static Team getTeam(int spawnerTeamID) {
        if (teamInfo == null)
            return null;
        else return teamInfo.getTeam(spawnerTeamID);
    }

    public static boolean isCurrentMap(String map) {
        return !(teamInfo == null || teamInfo.mapShortName == null) && teamInfo.mapShortName.equals(map);
    }

    @SideOnly(Side.CLIENT)
    public static EntityFX getParticle(String s, World w, double x, double y, double z) {
        return getParticle(s, w, x, y, z, 1.0F);
    }

    @SideOnly(Side.CLIENT)
    public static EntityFX getParticle(String s, World w, double x, double y, double z, float age) {
        Minecraft mc = Minecraft.getMinecraft();
        //return mc.renderGlobal.doSpawnParticle(s, x, y, z, 0.01D, 0.01D, 0.01D);
        EntityFX fx = null;
        if (s.equals("hugeexplosion"))
            fx = new EntityHugeExplodeFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("largeexplode"))
            fx = new EntityLargeExplodeFX(mc.renderEngine, w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("fireworksSpark"))
            fx = new EntityFireworkSparkFX(w, x, y, z, 0D, 0D, 0D, mc.effectRenderer);
        else if (s.equals("bubble"))
            fx = new EntityBubbleFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("suspended"))
            fx = new EntitySuspendFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("depthsuspend"))
            fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("townaura"))
            fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("crit"))
            fx = new EntityCritFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("magicCrit")) {
            fx = new EntityCritFX(w, x, y, z, 0D, 0D, 0D);
            fx.setRBGColorF(fx.getRedColorF() * 0.3F, fx.getGreenColorF() * 0.8F, fx.getBlueColorF());
            fx.nextTextureIndexX();
        } else if (s.equals("smoke"))
            fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D, age);
        else if (s.equals("mobSpell")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
            fx.setRBGColorF(0F, 0F, 0F);
        } else if (s.equals("mobSpellAmbient")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
            fx.setAlphaF(0.15F);
            fx.setRBGColorF(0F, 0F, 0F);
        } else if (s.equals("spell"))
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("instantSpell")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
            ((EntitySpellParticleFX) fx).setBaseSpellTextureIndex(144);
        } else if (s.equals("witchMagic")) {
            fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D);
            if (fx instanceof EntitySpellParticleFX) {
                ((EntitySpellParticleFX) fx).setBaseSpellTextureIndex(144);
            }
            float f = w.rand.nextFloat() * 0.5F + 0.35F;
            fx.setRBGColorF(1.0F * f, 0.0F * f, 1.0F * f);
        } else if (s.equals("note"))
            fx = new EntityNoteFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("portal"))
            fx = new EntityPortalFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("enchantmenttable"))
            fx = new EntityEnchantmentTableParticleFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("explode"))
            fx = new EntityExplodeFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("flame"))
            fx = new EntityFlameFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("lava"))
            fx = new EntityLavaFX(w, x, y, z);
        else if (s.equals("footstep"))
            fx = new EntityFootStepFX(mc.renderEngine, w, x, y, z);
        else if (s.equals("splash"))
            fx = new EntitySplashFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("wake"))
            fx = new EntityFishWakeFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("largesmoke"))
            fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D, 2.5F);
        else if (s.equals("cloud"))
            fx = new EntityCloudFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("newcloud"))
            fx = new EntityCloudFX2(w, x, y, z, 0D, 0D, 0D, age);
        else if (s.equals("reddust"))
            fx = new EntityReddustFX(w, x, y, z, 0F, 0F, 0F);
        else if (s.equals("snowballpoof"))
            fx = new EntityBreakingFX(w, x, y, z, Items.snowball);
        else if (s.equals("dripWater"))
            fx = new EntityDropParticleFX(w, x, y, z, Material.water);
        else if (s.equals("dripLava"))
            fx = new EntityDropParticleFX(w, x, y, z, Material.lava);
        else if (s.equals("snowshovel"))
            fx = new EntitySnowShovelFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("slime"))
            fx = new EntityBreakingFX(w, x, y, z, Items.slime_ball);
        else if (s.equals("heart"))
            fx = new EntityHeartFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("angryVillager")) {
            fx = new EntityHeartFX(w, x, y, z, 0D, 0D, 0D);
            fx.setParticleTextureIndex(81);
            fx.setRBGColorF(1.0F, 1.0F, 1.0F);
        } else if (s.equals("happyVillager")) {
            fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
            fx.setParticleTextureIndex(82);
            fx.setRBGColorF(1.0F, 1.0F, 1.0F);
        } else {
            int k;
            String[] astring;

            if (s.startsWith("iconcrack_")) {
                astring = s.split("_", 3);
                int j = Integer.parseInt(astring[1]);

                if (astring.length > 2) {
                    k = Integer.parseInt(astring[2]);
                    fx = new EntityBreakingFX(w, x, y, z, 0D, 0D, 0D, Item.getItemById(j), k);
                } else fx = new EntityBreakingFX(w, x, y, z, 0D, 0D, 0D, Item.getItemById(j), 0);
            } else {
                Block block;

                if (s.startsWith("blockcrack_")) {
                    astring = s.split("_", 3);
                    block = Block.getBlockById(Integer.parseInt(astring[1]));
                    k = Integer.parseInt(astring[2]);
                    fx = (new EntityDiggingFX(w, x, y, z, 0D, 0D, 0D, block, k)).applyRenderColor(k);
                } else if (s.startsWith("blockdust_")) {
                    astring = s.split("_", 3);
                    block = Block.getBlockById(Integer.parseInt(astring[1]));
                    k = Integer.parseInt(astring[2]);
                    fx = (new EntityBlockDustFX(w, x, y, z, 0D, 0D, 0D, block, k)).applyRenderColor(k);
                }
            }
        }

        if (mc.gameSettings.fancyGraphics)
            fx.renderDistanceWeight = 200D;

        if (fx != null)
            mc.effectRenderer.addEffect(fx);
        return fx;
    }

    public static GunAnimations getGunAnimations(EntityLivingBase living, boolean offHand) {
        GunAnimations animations;
        if (offHand) {
            if (FlansModClient.gunAnimationsLeft.containsKey(living))
                animations = FlansModClient.gunAnimationsLeft.get(living);
            else {
                animations = new GunAnimations();
                FlansModClient.gunAnimationsLeft.put(living, animations);
            }
        } else {
            if (FlansModClient.gunAnimationsRight.containsKey(living))
                animations = FlansModClient.gunAnimationsRight.get(living);
            else {
                animations = new GunAnimations();
                FlansModClient.gunAnimationsRight.put(living, animations);
            }
        }
        return animations;
    }

    public static void setAimType(AimType aimInputType) {
        Property cw = FlansMod.configFile.get("Input Settings", "Aim Type", "toggle", "The type of aiming that you want to use 'toggle' or 'hold'");
        cw.set(aimInputType.toString());
        FlansMod.configFile.save();
        aimType = aimInputType;
    }

    public static void setAimButton(FlanMouseButton buttonInput) {
        Property cw = FlansMod.configFile.get("Input Settings", "Aim Button", "left", "The mouse button used to aim a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        aimButton = buttonInput;
    }

    public static void setFireButton(FlanMouseButton buttonInput) {
        Property cw = FlansMod.configFile.get("Input Settings", "Fire Button", "right", "The mouse button used to fire a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        fireButton = buttonInput;
    }

    public void load() {
        log("Loading Flan's mod client side.");
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void renderOffHandGun(RenderPlayerEvent.Specials.Post event) {
        RenderPlayer renderer = event.renderer;
        EntityPlayer player = event.entityPlayer;
        PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);

        ItemStack gunStack;

        //Check current stack is a one handed gun
        if (player instanceof EntityOtherPlayerMP) {
            gunStack = data.offHandGunStack;
        } else {
            ItemStack currentStack = player.getCurrentEquippedItem();
            if (currentStack == null || !(currentStack.getItem() instanceof ItemGun) || !((ItemGun) currentStack.getItem()).type.oneHanded || data.offHandGunSlot == 0)
                return;
            gunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
        }

        if (gunStack == null || !(gunStack.getItem() instanceof ItemGun))
            return;

        //Render!
        GL11.glPushMatrix();
        renderer.modelBipedMain.bipedLeftArm.postRender(0.0625F);
        GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);

        float f2 = 1F;

        GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
        GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(-f2, -f2, f2);

        int k = gunStack.getItem().getColorFromItemStack(gunStack, 0);
        float f11 = (float) (k >> 16 & 255) / 255.0F;
        float f12 = (float) (k >> 8 & 255) / 255.0F;
        float f3 = (float) (k & 255) / 255.0F;
        GL11.glColor4f(f11, f12, f3, 1.0F);
        ClientProxy.gunRenderer.renderOffHandGun(player, gunStack);

        GL11.glPopMatrix();
    }

    //Handle player hiding / name tag removal for teams
    @SubscribeEvent
    public void renderLiving(RenderPlayerEvent.Pre event) {
        PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);

        //Render debug boxes for player snapshots
        if (FlansMod.DEBUG && data != null) {
            if (data.snapshots[0] != null)
                data.snapshots[0].renderSnapshot();
        }

        RendererLivingEntity.NAME_TAG_RANGE = 64F;
        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 32F;
        if (event.entity instanceof EntityPlayer && teamInfo != null && teamInfo.gametype != null && !"No Gametype".equals(teamInfo.gametype)) {
            PlayerScoreData rendering = teamInfo.getPlayerScoreData(event.entity.getCommandSenderName());
            PlayerScoreData thePlayer = teamInfo.getPlayerScoreData(minecraft.thePlayer.getCommandSenderName());

            Team renderingTeam = rendering == null ? Team.spectators : rendering.team.team;
            Team thePlayerTeam = thePlayer == null ? Team.spectators : thePlayer.team.team;

            //Do custom skin overrides
            //If we have no stored skin, try to get it
            if (data.skin == null)
                data.skin = ((AbstractClientPlayer) event.entityPlayer).getLocationSkin();
            //Only once we have the stored skin may we override
            if (data.skin != null) {
                ResourceLocation skin = rendering == null || rendering.playerClass == null ? null : FlansModResourceHandler.getTexture(rendering.playerClass);
                ((AbstractClientPlayer) event.entityPlayer).func_152121_a(Type.SKIN, skin == null ? data.skin : skin);
            }

            //Spectators see all
            if (thePlayerTeam == Team.spectators)
                return;
            //Nobody sees spectators
            if (renderingTeam == Team.spectators) {
                event.setCanceled(true);
                return;
            }
            //If we are on the other team, don't render the name tag
            if (renderingTeam != thePlayerTeam) {
                RendererLivingEntity.NAME_TAG_RANGE = 0F;
                RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
                return;
            }
            //If its DM, don't render the name tag
            if (!teamInfo.sortedByTeam) {
                RendererLivingEntity.NAME_TAG_RANGE = 0F;
                RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
            }
        }


    }

}
