package com.flansmod.client;

import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.*;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.item.ItemGrenade;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unused", "WeakerAccess"})
public class TickHandlerClient {
    public static final ResourceLocation offHand = new ResourceLocation("flansmod", "gui/offHand.png");
    public static final ResourceLocation aps = new ResourceLocation("flansmod", "gui/aps.png");
    public static final ResourceLocation tvm = new ResourceLocation("flansmod", "gui/TVM.png");
    private static final RenderItem itemRenderer = new RenderItem();
    private static final List<KillMessage> killMessages = new ArrayList<>();
    public static ArrayList<Vector3i> blockLightOverrides = new ArrayList<>();
    public static ArrayList<Vector3i> vehicleLightOverrides = new ArrayList<>();
    public static int lightOverrideRefreshRate = 5;
    public static int vehicleLightOverrideRefreshRate = 1;
    public static boolean enableDefaultCrossHair = true;
    public static boolean enableSprintCrossHair = true;
    public static boolean showVehicleCrossHair = false;
    public static boolean showKillMessages = true;
    public static float crosshairR = 1.0F;
    public static float crosshairG = 1.0F;
    public static float crosshairB = 1.0F;
    public static float crosshairA = 1.0F;
    public static float dotR = 1.0F;
    public static float dotG = 0.0F;
    public static float dotB = 0.0F;
    public static float dotA = 1.0F;
    public static boolean blackFlash = false;
    static ResourceLocation sprintCross = new ResourceLocation("flansmod", "textures/items/cross2.png");
    static ResourceLocation genericCross = new ResourceLocation("flansmod", "textures/items/cross.png");
    static ResourceLocation circleCross = new ResourceLocation("flansmod", "textures/items/cross3.png");
    static ResourceLocation grenadeCross = new ResourceLocation("flansmod", "textures/items/cross4.png");
    static ResourceLocation vehicleCross = new ResourceLocation("flansmod", "textures/items/cross5.png");
    static ResourceLocation flash = new ResourceLocation("flansmod", "gui/flash.png");
    static ResourceLocation flashBlack = new ResourceLocation("flansmod", "gui/flash2.png");
    private static GuiScreen guiDriveableController = null;
    int tickCount = 0;
    int tickCountFlash = 0;
    int tickCountWounded = 0;
    EntityPlayer entityPlayerFlash;
    private boolean isInFlash;
    private int flashTime;
    public static int apsMarkerTime;


    public TickHandlerClient() {
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * 禁用着色器
     */
    public static void deactivateShader() {
        Minecraft.getMinecraft().getFramebuffer().unbindFramebuffer();
    }

    public static void addKillMessage(boolean headshot, InfoType infoType, int itmDmg, String killer, String killed) {
        for (KillMessage killMessage : killMessages) {
            killMessage.line++;
            if (killMessage.line > 10)
                killMessage.timer = 0;
        }
        killMessages.add(new KillMessage(headshot, infoType, itmDmg, killer, killed));
    }

    @SubscribeEvent
    public void eventHandler(MouseEvent event) {
        EntityPlayer player = Minecraft.getMinecraft().thePlayer;
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
            if (((ItemGun) player.getCurrentEquippedItem().getItem()).type.oneHanded && Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()) && Math.abs(event.dwheel) > 0)
                event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void eventHandler(RenderGameOverlayEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        //If main config is set to false, blanket disable crosshairs (client synced)
        if (!FlansMod.crosshairEnable && event.type == ElementType.CROSSHAIRS && mc.thePlayer != null && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemGun) {
            event.setCanceled(true);
            return;
        }
        //Otherwise, fall back to weapon config settings (default false)
        else {
            //Remove crosshairs if looking down the sights of a gun
            if (event.type == ElementType.CROSSHAIRS && mc.thePlayer != null && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemGun) {
                if (!((ItemGun) mc.thePlayer.getHeldItem().getItem()).type.showCrosshair || FlansModClient.currentScope != null) {
                    event.setCanceled(true);
                    return;
                }
            }
        }

        ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
        int i = scaledresolution.getScaledWidth();
        int j = scaledresolution.getScaledHeight();

        Tessellator tessellator = Tessellator.instance;

        //TODO
        if (!event.isCancelable() && event.type == ElementType.HELMET) {
            //Scopes and helmet overlays
            String overlayTexture = null;
            if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.9F) {
                overlayTexture = FlansModClient.currentScope.getZoomOverlay();
            } else if (mc.thePlayer != null) {
                ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
                if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                    overlayTexture = ((ItemTeamArmour) stack.getItem()).type.overlay;
                }
            }

            String dotTexture = null;
            if (FlansModClient.currentScope != null && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.95F) {
                dotTexture = FlansModClient.currentScope.getDotOverlayTexture();
            }

            //绘制瞄具贴图
            if (overlayTexture != null) {
                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                GL11.glEnable(3042 /* GL_BLEND */);
                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(1F, 1F, 1F, 1.0F);
                GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));

                float shakeOffsetX = (float) (Math.abs(Math.sin(FlansModClient.playerRecoilPitch * 3)) * 20.0F);
                float shakeOffsetY = shakeOffsetX / 2.0F;

                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV((i / 2D - 2 * j) - shakeOffsetX, j + shakeOffsetY, -90D, 0.0D, 1.0D);
                tessellator.addVertexWithUV((i / 2D + 2 * j) + shakeOffsetX, j + shakeOffsetY, -90D, 1.0D, 1.0D);
                tessellator.addVertexWithUV((i / 2D + 2 * j) + shakeOffsetX, 0 - shakeOffsetY, -90D, 1.0D, 0.0D);
                tessellator.addVertexWithUV((i / 2D - 2 * j) - shakeOffsetX, 0 - shakeOffsetY, -90D, 0.0D, 0.0D);
                tessellator.draw();
                GL11.glDepthMask(true);
                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                GL11.glEnable(3008 /* GL_ALPHA_TEST */);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

            //TVM
            if (FlansModClient.enabledCameraFollowBullet && FlansModClient.isBulletTrackingActive) {
                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                GL11.glEnable(3042 /* GL_BLEND */);
                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(1F, 1F, 1F, 1.0F);
                GL11.glDisable(3008 /* GL_ALPHA_TEST */);
                mc.renderEngine.bindTexture(tvm);
                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV((i / 2D - 2 * j), j, -90D, 0.0D, 1.0D);
                tessellator.addVertexWithUV((i / 2D + 2 * j), j, -90D, 1.0D, 1.0D);
                tessellator.addVertexWithUV((i / 2D + 2 * j), 0, -90D, 1.0D, 0.0D);
                tessellator.addVertexWithUV((i / 2D - 2 * j), 0, -90D, 0.0D, 0.0D);
                tessellator.draw();
                GL11.glDepthMask(true);
                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                GL11.glEnable(3008 /* GL_ALPHA_TEST */);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

            //瞄具准心
            if (dotTexture != null) {

                MouseHelper mouse = Minecraft.getMinecraft().mouseHelper;
                int mx = mouse.deltaX;
                int my = mouse.deltaY;
                if(mx * mx + my * my < 1000) {
                    FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                    GL11.glEnable(3042 /* GL_BLEND */);
                    GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                    GL11.glDepthMask(false);
                    GL11.glBlendFunc(770, 771);
                    GL11.glColor4f(dotR, dotG, dotB, dotA);
                    GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                    double w = 10;
                    double h = 10;

                    w *= FlansModClient.currentScope.getDotOverlayTextureScale();
                    h *= FlansModClient.currentScope.getDotOverlayTextureScale();

                    mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(dotTexture));

                    double x = (i - w) / 2D;
                    double y = (j - h) / 2D;

                    tessellator.startDrawingQuads();
                    tessellator.addVertexWithUV(x, y + h, -90D, 0.0D, 1.0D);
                    tessellator.addVertexWithUV(x + w, y + h, -90D, 1.0D, 1.0D);
                    tessellator.addVertexWithUV(x + w, y, -90D, 1.0D, 0.0D);
                    tessellator.addVertexWithUV(x, y, -90D, 0.0D, 0.0D);
                    tessellator.draw();
                    GL11.glDepthMask(true);
                    GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                    GL11.glEnable(3008 /* GL_ALPHA_TEST */);
                    GL11.glColor4f(1F, 1F, 1F, 1.0F);
                }

            }

            //载具准心
            if(mc.thePlayer != null && showVehicleCrossHair && enableDefaultCrossHair){
                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                GL11.glEnable(3042 /* GL_BLEND */);
                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(crosshairR, crosshairG, crosshairB, crosshairA);
                GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                mc.renderEngine.bindTexture(vehicleCross);
                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV((i / 2D - 2 * j), j, -90D, 0.0D, 1.0D);
                tessellator.addVertexWithUV((i / 2D + 2 * j), j, -90D, 1.0D, 1.0D);
                tessellator.addVertexWithUV((i / 2D + 2 * j), 0, -90D, 1.0D, 0.0D);
                tessellator.addVertexWithUV((i / 2D - 2 * j), 0, -90D, 0.0D, 0.0D);
                tessellator.draw();

                GL11.glDepthMask(true);
                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                GL11.glEnable(3008);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

            //准心
            if (mc.thePlayer != null && mc.thePlayer.getCurrentEquippedItem() != null && mc.thePlayer.ridingEntity == null) {

                //手雷
                if (mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemGrenade) {
                    ItemGrenade grenade = (ItemGrenade) mc.thePlayer.getCurrentEquippedItem().getItem();
                    if (enableDefaultCrossHair && !grenade.type.hideCrosshair) {

                        FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                        GL11.glEnable(3042 /* GL_BLEND */);
                        GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                        GL11.glDepthMask(false);
                        GL11.glBlendFunc(770, 771);
                        GL11.glColor4f(crosshairR, crosshairG, crosshairB, crosshairA);
                        GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                        mc.renderEngine.bindTexture(grenadeCross);
                        tessellator.startDrawingQuads();
                        tessellator.addVertexWithUV((i / 2D - 2 * j), j, -90D, 0.0D, 1.0D);
                        tessellator.addVertexWithUV((i / 2D + 2 * j), j, -90D, 1.0D, 1.0D);
                        tessellator.addVertexWithUV((i / 2D + 2 * j), 0, -90D, 1.0D, 0.0D);
                        tessellator.addVertexWithUV((i / 2D - 2 * j), 0, -90D, 0.0D, 0.0D);
                        tessellator.draw();

                        GL11.glDepthMask(true);
                        GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                        GL11.glEnable(3008);
                        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    }
                }

                //枪械
                else if (mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                    ItemGun gun = (ItemGun) mc.thePlayer.getCurrentEquippedItem().getItem();
                    //冲刺时准心
                    if (mc.thePlayer.isSprinting()) {
                        if (enableSprintCrossHair && !gun.type.hideCrosshair) {

                            FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                            GL11.glEnable(3042 /* GL_BLEND */);
                            GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                            GL11.glDepthMask(false);
                            GL11.glBlendFunc(770, 771);
                            GL11.glColor4f(crosshairR, crosshairG, crosshairB, crosshairA);
                            GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                            mc.renderEngine.bindTexture(sprintCross);
                            tessellator.startDrawingQuads();
                            tessellator.addVertexWithUV((i / 2D - 2 * j), j, -90D, 0.0D, 1.0D);
                            tessellator.addVertexWithUV((i / 2D + 2 * j), j, -90D, 1.0D, 1.0D);
                            tessellator.addVertexWithUV((i / 2D + 2 * j), 0, -90D, 1.0D, 0.0D);
                            tessellator.addVertexWithUV((i / 2D - 2 * j), 0, -90D, 0.0D, 0.0D);
                            tessellator.draw();

                            GL11.glDepthMask(true);
                            GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                            GL11.glEnable(3008);
                            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                        }
                    }

                    //腰射准心
                    else if (FlansModClient.zoomProgress < 0.3F) {
                        if (enableDefaultCrossHair && !gun.type.hideCrosshair) {

                            FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                            GL11.glEnable(3042 /* GL_BLEND */);
                            GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                            GL11.glDepthMask(false);
                            GL11.glBlendFunc(770, 771);
                            GL11.glColor4f(crosshairR, crosshairG, crosshairB, crosshairA);
                            GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                            double w = 10;
                            double h = 10;

                            //霰弹枪圆准心
                            if (gun.type.useCircleCrosshair) {
                                mc.renderEngine.bindTexture(circleCross);
                                double radius = (gun.currentSpread > 30 ? 30 : gun.currentSpread) * 2;
                                if (!mc.thePlayer.onGround) radius *= 1.5F * FlansModClient.springProgress;

                                w += radius;
                                h += radius;
                                double x = (i - w) / 2D;
                                double y = (j - h) / 2D;

                                tessellator.startDrawingQuads();
                                tessellator.addVertexWithUV(x, y + h, -90D, 0.0D, 1.0D);
                                tessellator.addVertexWithUV(x + w, y + h, -90D, 1.0D, 1.0D);
                                tessellator.addVertexWithUV(x + w, y, -90D, 1.0D, 0.0D);
                                tessellator.addVertexWithUV(x, y, -90D, 0.0D, 0.0D);
                                tessellator.draw();
                            } else {
                                mc.renderEngine.bindTexture(genericCross);
                                double radius = (gun.currentSpread > 40 ? 40 : gun.currentSpread) * 2;
                                radius *= 1.0F - FlansModClient.zoomProgress;
                                if (!mc.thePlayer.onGround) {
                                    radius *= 2F * FlansModClient.springProgress;
                                }

                                double[] x = new double[]{0.0, 0.0, -radius - 5.0D, radius + 5.0D};
                                double[] y = new double[]{-radius - 5.0D, radius + 5.0D, 0.0, 0.0};
                                double[] uv = new double[]{0.5D, 0.5D, 0.0, 0.0};
                                double x1 = (i - w) / 2D;
                                double x2 = (i + w) / 2D;
                                double y1 = (j - h) / 2D;
                                double y2 = (j + h) / 2D;

                                for (int n = 0; n < 4; n++) {
                                    tessellator.startDrawingQuads();
                                    tessellator.addVertexWithUV(x1 + x[n], y2 + y[n], -90D, 0.0, 0.5 + uv[n]);
                                    tessellator.addVertexWithUV(x2 + x[n], y2 + y[n], -90D, 0.5, 0.5 + uv[n]);
                                    tessellator.addVertexWithUV(x2 + x[n], y1 + y[n], -90D, 0.5, uv[n]);
                                    tessellator.addVertexWithUV(x1 + x[n], y1 + y[n], -90D, 0.0, uv[n]);
                                    tessellator.draw();
                                }
                            }
                            GL11.glDepthMask(true);
                            GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                            GL11.glEnable(3008);
                            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                        }
                    }
                }

            }


            //闪光弹
            if (FlansModClient.isInFlash) {
                float progress = FlansModClient.flashProgress;
                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                GL11.glEnable(3042 /* GL_BLEND */);
                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(1F, 1F, 1F, progress);
                GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                if(blackFlash){
                    mc.renderEngine.bindTexture(flashBlack);
                }
                else {
                    mc.renderEngine.bindTexture(flash);
                }

                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV(i / 2D - 2 * j, j, -90D, 0.0D, 1.0D);
                tessellator.addVertexWithUV(i / 2D + 2 * j, j, -90D, 1.0D, 1.0D);
                tessellator.addVertexWithUV(i / 2D + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
                tessellator.addVertexWithUV(i / 2D - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
                tessellator.draw();
                GL11.glDepthMask(true);
                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                GL11.glEnable(3008 /* GL_ALPHA_TEST */);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

        }

        //弹药
        if (!event.isCancelable() && event.type == ElementType.HOTBAR && FlansMod.bulletGuiEnable) {
            //Player ammo overlay
            if (mc.thePlayer != null) {
                ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
                if (stack != null && stack.getItem() instanceof ItemGun) {
                    ItemGun gunItem = (ItemGun) stack.getItem();
                    GunType gunType = gunItem.type;
                    int x = 40;
                    for (int n = 0; n < gunType.getNumAmmoItemsInGun(stack); n++) {
                        ItemStack bulletStack = ((ItemGun) stack.getItem()).getBulletItemStack(stack, n);
                        if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
                            RenderHelper.enableGUIStandardItemLighting();
                            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
                            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
                            drawSlotInventory(mc.fontRenderer, bulletStack, i / 2 + 16 + x, j - 65);
                            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
                            RenderHelper.disableStandardItemLighting();
                            String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
                            if (gunType.submode.length >= 2) {
                                s = s + " [" + gunType.getFireMode(stack) + "]";
                            }
                            if (bulletStack.getMaxDamage() == 1)
                                s = "";
                            mc.fontRenderer.drawString(s, i / 2 + 32 + x, j - 59, 0x000000);
                            mc.fontRenderer.drawString(s, i / 2 + 33 + x, j - 60, 0xffffff);
                            x += 16 + mc.fontRenderer.getStringWidth(s);
                        }
                    }

                    //Render secondary gun
//                    PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);
//                    if (gunType.oneHanded && data.offHandGunSlot != 0) {
//                        ItemStack offHandStack = mc.thePlayer.inventory.getStackInSlot(data.offHandGunSlot - 1);
//                        if (offHandStack != null && offHandStack.getItem() instanceof ItemGun) {
//                            GunType offHandGunType = ((ItemGun) offHandStack.getItem()).type;
//                            x = 0;
//                            for (int n = 0; n < offHandGunType.getNumAmmoItemsInGun(offHandStack); n++) {
//                                ItemStack bulletStack = ((ItemGun) offHandStack.getItem()).getBulletItemStack(offHandStack, n);
//                                if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
//                                    //Find the string we are displaying next to the ammo item
//                                    String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
//                                    if (gunType.submode.length >= 2) {
//                                        s = s + "[" + gunType.getFireMode(offHandStack) + "]";
//                                    }
//                                    if (bulletStack.getMaxDamage() == 1)
//                                        s = "";
//
//                                    //Draw the slot and then move leftwards
//                                    RenderHelper.enableGUIStandardItemLighting();
//                                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//                                    GL11.glEnable(GL12.GL_RESCALE_NORMAL);
//                                    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
//                                    drawSlotInventory(mc.fontRenderer, bulletStack, i / 2 - 32 - x, j - 65);
//                                    x += 16 + mc.fontRenderer.getStringWidth(s);
//
//                                    //Draw the string
//                                    GL11.glDisable(GL12.GL_RESCALE_NORMAL);
//                                    RenderHelper.disableStandardItemLighting();
//                                    mc.fontRenderer.drawString(s, i / 2 - 16 - x, j - 59, 0x000000);
//                                    mc.fontRenderer.drawString(s, i / 2 - 17 - x, j - 60, 0xffffff);
//                                }
//                            }
//                        }
//                    }

                }
            }

//            PacketTeamInfo teamInfo = FlansModClient.teamInfo;
//
//            if (teamInfo != null && FlansModClient.minecraft.thePlayer != null && (PacketTeamInfo.numTeams > 0 || !PacketTeamInfo.sortedByTeam) && PacketTeamInfo.getPlayerScoreData(FlansModClient.minecraft.thePlayer.getCommandSenderName()) != null) {
//                GL11.glEnable(3042 /* GL_BLEND */);
//                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
//                GL11.glDepthMask(false);
//                GL11.glBlendFunc(770, 771);
//                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//                GL11.glDisable(3008 /* GL_ALPHA_TEST */);
//
//                mc.renderEngine.bindTexture(GuiTeamScores.texture);
//
//                tessellator.startDrawingQuads();
//                tessellator.addVertexWithUV(i / 2D - 43, 27, -90D, 85D / 256D, 27D / 256D);
//                tessellator.addVertexWithUV(i / 2D + 43, 27, -90D, 171D / 256D, 27D / 256D);
//                tessellator.addVertexWithUV(i / 2D + 43, 0D, -90D, 171D / 256D, 0D / 256D);
//                tessellator.addVertexWithUV(i / 2D - 43, 0D, -90D, 85D / 256D, 0D / 256D);
//                tessellator.draw();
//
//
//                boolean twoTeamMode = PacketTeamInfo.numTeams == 2 && PacketTeamInfo.sortedByTeam &&
//                        PacketTeamInfo.teamData.length == 2 && PacketTeamInfo.teamData[0] != null && PacketTeamInfo.teamData[1] != null
//                        && PacketTeamInfo.teamData[0].team != null && PacketTeamInfo.teamData[1].team != null;
//                //If we are in a two team gametype, draw the team scores at the top of the screen
//                if (twoTeamMode) {
//                    //Draw team 1 colour bit
//                    int colour = PacketTeamInfo.teamData[0].team.teamColour;
//                    GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
//                    tessellator.startDrawingQuads();
//                    tessellator.addVertexWithUV(i / 2D - 43, 27, -90D, 0D / 256D, 125D / 256D);
//                    tessellator.addVertexWithUV(i / 2D - 19, 27, -90D, 24D / 256D, 125D / 256D);
//                    tessellator.addVertexWithUV(i / 2D - 19, 0D, -90D, 24D / 256D, 98D / 256D);
//                    tessellator.addVertexWithUV(i / 2D - 43, 0D, -90D, 0D / 256D, 98D / 256D);
//                    tessellator.draw();
//                    //Draw team 2 colour bit
//                    colour = PacketTeamInfo.teamData[1].team.teamColour;
//                    GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
//                    tessellator.startDrawingQuads();
//                    tessellator.addVertexWithUV(i / 2D + 19, 27, -90D, 62D / 256D, 125D / 256D);
//                    tessellator.addVertexWithUV(i / 2D + 43, 27, -90D, 86D / 256D, 125D / 256D);
//                    tessellator.addVertexWithUV(i / 2D + 43, 0D, -90D, 86D / 256D, 98D / 256D);
//                    tessellator.addVertexWithUV(i / 2D + 19, 0D, -90D, 62D / 256D, 98D / 256D);
//                    tessellator.draw();
//
//                    GL11.glDepthMask(true);
//                    GL11.glEnable(2929 /* GL_DEPTH_TEST */);
//                    GL11.glEnable(3008 /* GL_ALPHA_TEST */);
//                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//
//                    //Draw the team scores
//                    mc.fontRenderer.drawString(PacketTeamInfo.teamData[0].score + "", i / 2 - 35, 9, 0x000000);
//                    mc.fontRenderer.drawString(PacketTeamInfo.teamData[0].score + "", i / 2 - 36, 8, 0xffffff);
//                    mc.fontRenderer.drawString(PacketTeamInfo.teamData[1].score + "", i / 2 + 35 - mc.fontRenderer.getStringWidth(PacketTeamInfo.teamData[1].score + ""), 9, 0x000000);
//                    mc.fontRenderer.drawString(PacketTeamInfo.teamData[1].score + "", i / 2 + 34 - mc.fontRenderer.getStringWidth(PacketTeamInfo.teamData[1].score + ""), 8, 0xffffff);
//                }
//
//                mc.fontRenderer.drawString(PacketTeamInfo.gametype + "", i / 2 + 48, 9, 0x000000);
//                mc.fontRenderer.drawString(PacketTeamInfo.gametype + "", i / 2 + 47, 8, 0xffffff);
//                mc.fontRenderer.drawString(PacketTeamInfo.map + "", i / 2 - 47 - mc.fontRenderer.getStringWidth(PacketTeamInfo.map + ""), 9, 0x000000);
//                mc.fontRenderer.drawString(PacketTeamInfo.map + "", i / 2 - 48 - mc.fontRenderer.getStringWidth(PacketTeamInfo.map + ""), 8, 0xffffff);
//
//                int secondsLeft = PacketTeamInfo.timeLeft / 20;
//                int minutesLeft = secondsLeft / 60;
//                secondsLeft = secondsLeft % 60;
//                String timeLeft = minutesLeft + ":" + (secondsLeft < 10 ? "0" + secondsLeft : secondsLeft);
//                mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2 - 1, 29, 0x000000);
//                mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2, 30, 0xffffff);
//
//
//                GL11.glDepthMask(true);
//                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
//                GL11.glEnable(3008 /* GL_ALPHA_TEST */);
//                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//                String playerUsername = FlansModClient.minecraft.thePlayer.getCommandSenderName();
//
//
//                PacketTeamInfo.PlayerScoreData pScoreData = PacketTeamInfo.getPlayerScoreData(playerUsername);
//                if (pScoreData != null) {
//                    mc.fontRenderer.drawString(pScoreData.score + "", i / 2 - 7, 1, 0x000000);
//                    mc.fontRenderer.drawString(pScoreData.kills + "", i / 2 - 7, 9, 0x000000);
//                    mc.fontRenderer.drawString(pScoreData.deaths + "", i / 2 - 7, 17, 0x000000);
//                }
//            }

            //击杀信息
            if(showKillMessages) {
                for (KillMessage killMessage : killMessages) {

                    String message = "\u00a7" + killMessage.killerName + (killMessage.headshot ? "          " : "     ") + "\u00a7" + killMessage.killedName;
                    FlansModClient.minecraft.fontRenderer.drawString(message, i - FlansModClient.minecraft.fontRenderer.getStringWidth(message) - 6, j - 32 - killMessage.line * 16, 16777215);

                    RenderHelper.enableGUIStandardItemLighting();
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    GL11.glEnable(GL12.GL_RESCALE_NORMAL);
                    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
                    drawSlotInventory(FlansModClient.minecraft.fontRenderer, new ItemStack(killMessage.weapon.item, 1, killMessage.itemDamage), i - FlansModClient.minecraft.fontRenderer
                            .getStringWidth((killMessage.headshot ? "         " : "     ") + killMessage.killedName), j - 36 - killMessage.line * 16);
                    if (killMessage.headshot)
                        drawSlotInventory(FlansModClient.minecraft.fontRenderer, new ItemStack(FlansMod.crosshairsymbol), i - FlansModClient.minecraft.fontRenderer
                                .getStringWidth("     " + killMessage.killedName), j - 36 - killMessage.line * 16);
                    GL11.glDisable(3042 /*GL_BLEND*/);
                    RenderHelper.disableStandardItemLighting();
                }
            }

            //Off-hand weapon graphics
            mc.renderEngine.bindTexture(offHand);

            ItemStack currentStack = mc.thePlayer.inventory.getCurrentItem();
            PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);

            if (currentStack != null && currentStack.getItem() instanceof ItemGun && ((ItemGun) currentStack.getItem()).type.oneHanded) {
                for (int n = 0; n < 9; n++) {
                    if (data.offHandGunSlot == n + 1) {
                        tessellator.startDrawingQuads();
                        tessellator.addVertexWithUV(i / 2D - 88 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
                        tessellator.addVertexWithUV(i / 2D - 72 + 20 * n, j - 3, -90D, 32D / 64D, 16D / 32D);
                        tessellator.addVertexWithUV(i / 2D - 72 + 20 * n, j - 19, -90D, 32D / 64D, 0D / 32D);
                        tessellator.addVertexWithUV(i / 2D - 88 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
                        tessellator.draw();
                    } else if (data.isValidOffHandWeapon(mc.thePlayer, n + 1)) {
                        tessellator.startDrawingQuads();
                        tessellator.addVertexWithUV(i / 2D - 88 + 20 * n, j - 3, -90D, 0D / 64D, 16D / 32D);
                        tessellator.addVertexWithUV(i / 2D - 72 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
                        tessellator.addVertexWithUV(i / 2D - 72 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
                        tessellator.addVertexWithUV(i / 2D - 88 + 20 * n, j - 19, -90D, 0D / 64D, 0D / 32D);
                        tessellator.draw();
                    }
                }
            }

            if(FlansModClient.dpsDisplay != 0) {
                mc.fontRenderer.drawString(String.format("DPS: %.1f", FlansModClient.dpsDisplay), 450, 200, 0xffffff, true);
            }


            //RenderHitCrossHair
//            if (FlansModClient.hitMarker) {
//                tickCount = 20;
//                FlansModClient.hitMarker = false;
//            }
            if(FlansModClient.apsMarker) {
                apsMarkerTime = 20;
                FlansModClient.apsMarker = false;
            }
//            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
//            ItemStack currentHeldItem = player.getCurrentEquippedItem();
//            if (tickCount > 0 && FlansMod.hitCrossHairEnable) {
//                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
//                GL11.glEnable(3042 /* GL_BLEND */);
//                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
//                GL11.glDepthMask(false);
//                GL11.glBlendFunc(770, 771);
//                // Rendering of fancy crosshair.
//                if (FlansMod.fancyCrosshair) {
//                    if (FlansModClient.hitMarkerExplosion) {
//                        // Headshot - blue.
//                        GL11.glColor4f(
//                                0.95F,
//                                0.85F,
//                                0.3F,
//                                FlansMod.hitCrossHairColor[0] * (float) tickCount / 20
//                        );
//                    } else if (FlansModClient.hitMarkerHeadshot) {
//                        // Headshot - blue.
//                        GL11.glColor4f(
//                                0,
//                                0.5F,
//                                1,
//                                FlansMod.hitCrossHairColor[0] * (float) tickCount / 20
//                        );
//                    } else {
//                        // Two stage transition between red and green, to avoid going into yellow.
//                        // Green = full pen.
//                        // Red = 0 .
//                        if (FlansModClient.hitMarkerPenAmount < 0.5) {
//                            GL11.glColor4f(
//                                    1,
//                                    2 * FlansModClient.hitMarkerPenAmount,
//                                    0,
//                                    FlansMod.hitCrossHairColor[0] * (float) tickCount / 20
//                            );
//                        } else {
//                            GL11.glColor4f(
//                                    2 * (1 - FlansModClient.hitMarkerPenAmount),
//                                    1,
//                                    0,
//                                    FlansMod.hitCrossHairColor[0] * (float) tickCount / 20
//                            );
//                        }
//
//                    }
//                } else {
//                    GL11.glColor4f(
//                            FlansMod.hitCrossHairColor[1],
//                            FlansMod.hitCrossHairColor[2],
//                            FlansMod.hitCrossHairColor[3],
//                            FlansMod.hitCrossHairColor[0] * (float) tickCount / 20);
//                }
//
//                GL11.glDisable(3008 /* GL_ALPHA_TEST */);
//                //Custom hit marker GUI if set in gun config
//
//                ResourceLocation crosshair = null;
//
//                if (currentHeldItem != null && currentHeldItem.getItem() instanceof ItemGun) {
//                    ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
//                    ItemGun gunItem = (ItemGun) stack.getItem();
//                    GunType gunType = gunItem.type;
//                    if (gunType.hitTexture != null) {
//                        crosshair = FlansModResourceHandler.getAuxiliaryTexture(gunType.hitTexture);
//                    }
//                }
//
//                if (crosshair == null) {
//                    crosshair = new ResourceLocation("flansmod", FlansMod.hdHitCrosshair ? "gui/HDCrossHair.png" : "gui/CrossHair.png");
//                }
//
//                mc.renderEngine.bindTexture(crosshair);
//
//                tessellator.startDrawingQuads();
//                tessellator.addVertexWithUV(i / 2D - 2 * j, j, -90D, 0.0D, 1.0D);
//                tessellator.addVertexWithUV(i / 2D + 2 * j, j, -90D, 1.0D, 1.0D);
//                tessellator.addVertexWithUV(i / 2D + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
//                tessellator.addVertexWithUV(i / 2D - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
//                tessellator.draw();
//                GL11.glDepthMask(true);
//                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
//                GL11.glEnable(3008 /* GL_ALPHA_TEST */);
//                GL11.glColor4f(1F, 1F, 1F, 1F);
//            }

            if (apsMarkerTime > 0) {
                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                GL11.glEnable(3042 /* GL_BLEND */);
                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(1F, 1F, 1F, apsMarkerTime / 20F);
                GL11.glDisable(3008 /* GL_ALPHA_TEST */);
                mc.renderEngine.bindTexture(aps);
                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV(i / 2D - 2 * j, j, -90D, 0.0D, 1.0D);
                tessellator.addVertexWithUV(i / 2D + 2 * j, j, -90D, 1.0D, 1.0D);
                tessellator.addVertexWithUV(i / 2D + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
                tessellator.addVertexWithUV(i / 2D - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
                tessellator.draw();
                GL11.glDepthMask(true);
                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                GL11.glEnable(3008 /* GL_ALPHA_TEST */);
                GL11.glColor4f(1F, 1F, 1F, 1F);
            }

            if (mc.thePlayer.hurtTime > 0) {
                tickCountWounded = 40;
            }
            if (tickCountWounded > 0 && FlansMod.showFlashesWhenWounded) {
                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                GL11.glEnable(3042 /* GL_BLEND */);
                GL11.glDisable(2929 /* GL_DEPTH_TEST */);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(
                        FlansMod.hitCrossHairColor[1],
                        FlansMod.hitCrossHairColor[2],
                        FlansMod.hitCrossHairColor[3],
                        FlansMod.hitCrossHairColor[0] * (float) tickCountWounded / 20);
                GL11.glDisable(3008 /* GL_ALPHA_TEST */);

                mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/Blood.png"));

                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV(i / 2D - 2 * j, j, -90D, 0.0D, 1.0D);
                tessellator.addVertexWithUV(i / 2D + 2 * j, j, -90D, 1.0D, 1.0D);
                tessellator.addVertexWithUV(i / 2D + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
                tessellator.addVertexWithUV(i / 2D - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
                tessellator.draw();
                GL11.glDepthMask(true);
                GL11.glEnable(2929 /* GL_DEPTH_TEST */);
                GL11.glEnable(3008 /* GL_ALPHA_TEST */);
                GL11.glColor4f(1F, 1F, 1F, 1F);
            }


            //DEBUG vehicles
            if (mc.thePlayer.ridingEntity instanceof EntitySeat) {
                EntityDriveable driveable = ((EntitySeat) mc.thePlayer.ridingEntity).driveable;
                EntitySeat playerSeat = ((EntitySeat) mc.thePlayer.ridingEntity);
                float dx = (float) (driveable.posX - driveable.lastTickPosX);
                float dy = (float) (driveable.posY - driveable.lastTickPosY);
                float dz = (float) (driveable.posZ - driveable.lastTickPosZ);

                float speed = (float) Math.sqrt(dx * dx + dy * dy + dz * dz) * 20F;

                int healthP = (int) (driveable.getDriveableData().parts.get(EnumDriveablePart.core).health / driveable.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth * 100);
                int healthColor;
                if (healthP > 75) {
                    healthColor = 0xffffff;
                } else if (healthP < 75 && healthP > 50) {
                    healthColor = 0x00ff00;
                } else if (healthP < 50 && healthP > 25) {
                    healthColor = 0xdaa520;
                } else {
                    healthColor = 0xff0000;
                }

                float fuelP = driveable.driveableData.fuelInTank / driveable.getDriveableType().fuelTankSize * 100;
                int fuelColor = 0xffffff;
                if (fuelP < 50)
                    fuelColor = 0xffe100;
                if (fuelP < 15)
                    fuelColor = 0xff9900;
                if (fuelP <= 2)
                    fuelColor = 0xff0000;

                mc.fontRenderer.drawString(String.format("节流阀 : %.0f%%", driveable.throttle * 100), 2, 2, 0xffffff);
//				mc.fontRenderer.drawString("Throttle : " + driveable.throttle, 2, 2, 0xffffff);
                //mc.fontRenderer.drawString("Health : " + driveable.getDriveableData().parts.get(EnumDriveablePart.core).health+ " / " +driveable.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth, 2, 12, 0xffffff);
                mc.fontRenderer.drawString("血量 : " + healthP + "%", 2, 12, healthColor);
                mc.fontRenderer.drawString(String.format("速度 : %.2f 方块/秒", speed), 2, 22, 0xffffff);
                if (driveable instanceof EntityVehicle) {
                    mc.fontRenderer.drawString(String.format("方向机 : %.0f%%", playerSeat.looking.getYaw()), 92, 2,
                            0xffffff);
                    mc.fontRenderer.drawString(String.format("高低机 : %.0f%%", playerSeat.looking.getPitch()), 92, 12,
                            0xffffff);
                } else {
                    mc.fontRenderer.drawString(String.format("偏航角 : %.2f", driveable.prevRotationYaw), 92, 2, 0xffffff);
                    mc.fontRenderer.drawString(String.format("俯仰角 : %.2f", -driveable.prevRotationPitch), 92, 12, 0xffffff);
                }
                mc.fontRenderer.drawString(String.format("燃油量 : %.0f%%", fuelP), 2, 32, fuelColor);
                if (driveable instanceof EntityPlane) {
                    if (driveable.getDriveableType().hasFlare) {
                        if (driveable.ticksFlareUsing <= 0 && driveable.flareDelay <= 0)
                            mc.fontRenderer.drawString("热诱弹 : 已准备", 2, 42, 0x00ff00);

                        if (driveable.ticksFlareUsing > 0)
                            mc.fontRenderer.drawString("热诱弹 : 正在发射", 2, 52, 0xff0000);

                        if (driveable.flareDelay > 0)
                            mc.fontRenderer.drawString("热诱弹 : 正在装填", 2, 62, 0xdaa520);
                    }
                    Vector3f up2 = (Vector3f) driveable.axes.getYAxis().normalise();
                    mc.fontRenderer.drawString(String.format("升力 : %.0f%%", (float) driveable.getSpeedXYZ() * (float) driveable.getSpeedXYZ() * up2.y), 92, 22, 0xffffff);

                }
                if (driveable instanceof EntityVehicle) {
                    if (driveable.getDriveableType().hasFlare) {
                        if (driveable.ticksFlareUsing <= 0 && driveable.flareDelay <= 0)
                            mc.fontRenderer.drawString("烟雾弹 : 已准备", 2, 42, 0x00ff00);

                        if (driveable.ticksFlareUsing > 0)
                            mc.fontRenderer.drawString("烟雾弹 : 正在释放", 2, 52, 0xff0000);

                        if (driveable.flareDelay > 0)
                            mc.fontRenderer.drawString("烟雾弹 : 正在装填", 2, 62, 0xdaa520);
                    }

                    if (((EntityVehicle) driveable).getVehicleType().shootWithOpenDoor) {
                        if (((EntityVehicle) driveable).varDoor) {
                            mc.fontRenderer.drawString("Weapon : READY", 2, 72, 0x00ff00);
                            mc.fontRenderer.drawString("[" + Keyboard.getKeyName(KeyInputHandler.doorKey.getKeyCode()) + " to disable]", 100, 62, 0x00ff00);
                        }

                        if (!((EntityVehicle) driveable).varDoor) {
                            mc.fontRenderer.drawString("Weapon : DISABLED", 2, 62, 0xff0000);
                            mc.fontRenderer.drawString("[" + Keyboard.getKeyName(KeyInputHandler.doorKey.getKeyCode()) + " to activate]", 100, 62, 0xff0000);
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void renderTick(TickEvent.RenderTickEvent event) {
        switch (event.phase) {
            case START:
                RenderGun.smoothing = event.renderTickTime;
                renderTickStart(Minecraft.getMinecraft(), event.renderTickTime);
                break;
            case END:
                renderTickEnd(Minecraft.getMinecraft(), event.renderTickTime);
                break;
        }
    }

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        switch (event.phase) {
            case START:
                clientTickStart(Minecraft.getMinecraft());
                break;
            case END:
                clientTickEnd(Minecraft.getMinecraft());
                break;
        }
    }

    /**
     * Handle flashlight block light override
     */
    public void clientTickStart(Minecraft mc) {
        if (tickCount > 0) {
            tickCount--;
        }
        if (apsMarkerTime > 0) {
            apsMarkerTime--;
        }
        if (tickCountWounded > 0) {
            tickCountWounded--;
        }
        if (FlansMod.ticker % lightOverrideRefreshRate == 0 && mc.theWorld != null) {
            //Check graphics setting and adjust refresh rate
            lightOverrideRefreshRate = mc.gameSettings.fancyGraphics ? 10 : 20;

            //Reset old light values
            for (Vector3i v : blockLightOverrides) {
                mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
            }
            //Clear the list
            blockLightOverrides.clear();

            //Find all flashlights
            for (Object obj : mc.theWorld.playerEntities) {
                EntityPlayer player = (EntityPlayer) obj;
                ItemStack currentHeldItem = player.getCurrentEquippedItem();
                if (currentHeldItem != null && currentHeldItem.getItem() instanceof ItemGun) {
                    GunType type = ((ItemGun) currentHeldItem.getItem()).type;
                    for (AttachmentType attachment : type.getCurrentAttachments(currentHeldItem))
                        if (attachment != null && attachment.flashlight) {
                            for (int i = 0; i < 2; i++) {
                                MovingObjectPosition ray = player.rayTrace(attachment.flashlightRange / 2F * (i + 1), 1F);
                                if (ray != null) {
                                    int x = ray.blockX;
                                    int y = ray.blockY;
                                    int z = ray.blockZ;
                                    int side = ray.sideHit;
                                    switch (side) {
                                        case 0:
                                            y--;
                                            break;
                                        case 1:
                                            y++;
                                            break;
                                        case 2:
                                            z--;
                                            break;
                                        case 3:
                                            z++;
                                            break;
                                        case 4:
                                            x--;
                                            break;
                                        case 5:
                                            x++;
                                            break;
                                    }
                                    blockLightOverrides.add(new Vector3i(x, y, z));
                                    mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 12);
                                    mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
                                    mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
                                    mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
                                    mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
                                    mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
                                    mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
                                }
                            }
                        }
                }
            }

            for (Object obj : mc.theWorld.loadedEntityList) {
                if (obj instanceof EntityShootable) {
                    EntityShootable bullet = (EntityShootable) obj;
                    if (!bullet.isDead && bullet.getType().hasDynamicLight) {
                        int x = (int) bullet.posX;
                        int y = (int) bullet.posY;
                        int z = (int) bullet.posZ;
                        blockLightOverrides.add(new Vector3i(bullet.posX, bullet.posY, bullet.posZ));

                        mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z,
                                Math.max(mc.theWorld.getBlockLightValue(x, y, z), 10));
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y + 1, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
                    }
                } else if (obj instanceof EntityMecha) {
                    EntityMecha mecha = (EntityMecha) obj;
                    int x = MathHelper.floor_double(mecha.posX);
                    int y = MathHelper.floor_double(mecha.posY);
                    int z = MathHelper.floor_double(mecha.posZ);
                    if (mecha.lightLevel() > 0) {
                        blockLightOverrides.add(new Vector3i(x, y, z));
                        mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, Math.max(mc.theWorld.getBlockLightValue(x, y, z), mecha.lightLevel()));
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y + 1, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
                    }
                    if (mecha.forceDark()) {
                        for (int i = -3; i <= 3; i++) {
                            for (int j = -3; j <= 3; j++) {
                                for (int k = -3; k <= 3; k++) {
                                    int xd = i + x;
                                    int yd = j + y;
                                    int zd = k + z;
                                    blockLightOverrides.add(new Vector3i(xd, yd, zd));
                                    mc.theWorld.setLightValue(EnumSkyBlock.Sky, xd, yd, zd, Math.abs(i) + Math.abs(j) + Math.abs(k));
                                }
                            }
                        }
                    }
                }
            }
        }

        if (FlansMod.ticker % vehicleLightOverrideRefreshRate == 0 && mc.theWorld != null) {
            //Check graphics setting and adjust refresh rate
            vehicleLightOverrideRefreshRate = mc.gameSettings.fancyGraphics ? 1 : 2;

            //Reset old light values
            for (Vector3i v : vehicleLightOverrides) {
                mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
            }
            //Clear the list
            vehicleLightOverrides.clear();
        }
    }

    public void clientTickEnd(Minecraft minecraft) { /* Client side only */
        for (int i = 0; i < killMessages.size(); i++) {
            killMessages.get(i).timer--;
            if (killMessages.get(i).timer == 0) {
                killMessages.remove(i);
            }
        }
        RenderFlag.angle += 2F;
        FlansModClient.tick();
    }

    public void renderTickStart(Minecraft mc, float smoothing) {
        // CAPTURE MOUSE INPUT!
        if (mc.currentScreen == null && FlansModClient.controlModeMouse) {
            MouseHelper mouse = mc.mouseHelper;
            Entity ridden = mc.thePlayer.ridingEntity;

            if (ridden instanceof EntityDriveable) {
                EntityDriveable entity = (EntityDriveable) ridden;
                entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
            }
        }
        FlansModClient.renderTick(smoothing);
        if (mc.currentScreen instanceof GuiDriveableController) {
            guiDriveableController = mc.currentScreen;
            mc.currentScreen = null;
        } else {
            guiDriveableController = null;
        }
    }

    public void renderTickEnd(Minecraft mc, float smoothing) {
        if (mc.currentScreen == null && guiDriveableController != null) {
            mc.currentScreen = guiDriveableController;
            guiDriveableController = null;
        }

        Tessellator tessellator = Tessellator.instance;
        ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
        int i = scaledresolution.getScaledWidth();
        int j = scaledresolution.getScaledHeight();

		/*
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();

		String overlayTexture = null;
		if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.8F)
		{
			overlayTexture = FlansModClient.currentScope.getZoomOverlay();
		}
		else if(mc.thePlayer != null)
		{
			ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
			if(stack != null && stack.getItem() instanceof ItemTeamArmour)
			{
				overlayTexture = ((ItemTeamArmour)stack.getItem()).type.overlay;
			}
		}

		if(overlayTexture != null)
		{
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042);
			GL11.glDisable(2929);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, 1.0F);
			GL11.glDisable(3008);

			mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));

			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929);
			GL11.glEnable(3008);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
		*/
    }

    private void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j) {
        if (itemstack == null || itemstack.getItem() == null)
            return;
        itemRenderer.renderItemIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
        itemRenderer.renderItemOverlayIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
    }

    private static class KillMessage {
        public String killerName;
        public String killedName;
        public InfoType weapon;
        public int itemDamage;
        public int timer;
        public int line;
        public boolean headshot;

        public KillMessage(boolean head, InfoType infoType, int itmDmg, String killer, String killed) {
            headshot = head;
            killerName = killer;
            killedName = killed;
            weapon = infoType;
            itemDamage = itmDmg;
            line = 0;
            timer = 200;
        }
    }

}
