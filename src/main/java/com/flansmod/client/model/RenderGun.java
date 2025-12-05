package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.animation.gltf.GLTFAnimationController;
import com.flansmod.client.model.animation.gltf.model.EnumAnimationPart;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.item.ItemShootable;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.Random;

import static com.flansmod.client.FlansModClient.isWeaponChange;
import static com.flansmod.client.FlansModClient.zoomProgress;

public class RenderGun implements IItemRenderer {
    public static float smoothing;
    public static float actualZoomProgress;
    public static float actualStanceProgress;
    public static float actualCrouchProgress;
    public static float actualSpringProgress;
    private static TextureManager renderEngine;
    private float effectiveReloadAnimationProgress;

    public static Random rand = new Random();

    public static float var1 = 0.15F;
    public static float var2 = 0.25F;
    public static float var3 = 0.155F;
    public static float var4 = -0.7F;
    public static float var5 = -0.305F;


    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case ENTITY:
                if (!Minecraft.getMinecraft().gameSettings.fancyGraphics)
                    return false;
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
                /* case INVENTORY : */
                return item != null && item.getItem() instanceof ItemGun
                        && ((ItemGun) item.getItem()).type.model != null;
            default:
                break;
        }
        return false;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        // Avoid any broken cases by returning
        if (!(item.getItem() instanceof ItemGun))
            return;

        RenderBlocks renderBlocks = (RenderBlocks) data[0];

        GunType gunType = ((ItemGun) item.getItem()).type;
        if (gunType == null)
            return;

        ModelGun model = gunType.model;
        if (model == null)
            return;

        // Render main hand gun
        {
            GunAnimations animations = type == ItemRenderType.ENTITY ? new GunAnimations()
                    : FlansModClient.getGunAnimations((EntityLivingBase) data[1], false);
            preRenderGun(type, item, gunType, animations, false, data);
        }

        // Render off-hand gun
        if (gunType.oneHanded && type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            EntityLivingBase entity = (EntityLivingBase) data[1];
            if (entity instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) entity;
                PlayerData playerData = PlayerHandler.getPlayerData(player, Side.CLIENT);
                if (playerData.offHandGunSlot != 0) {
                    GunAnimations animations = FlansModClient.gunAnimationsLeft.get(data[1]);
                    if (animations == null) {
                        animations = new GunAnimations();
                        FlansModClient.gunAnimationsLeft.put((EntityLivingBase) data[1], animations);
                    }
                    ItemStack offHandItem = player.inventory.getStackInSlot(playerData.offHandGunSlot - 1);
                    if (offHandItem == null || !(offHandItem.getItem() instanceof ItemGun))
                        return;
                    GunType offHandGunType = ((ItemGun) offHandItem.getItem()).type;
                    if (!offHandGunType.oneHanded)
                        return;

                    preRenderGun(type, offHandItem, offHandGunType, animations, true, data);
                }

            }
        }
    }

    // Render off-hand gun in 3rd person
    public void renderOffHandGun(EntityPlayer player, ItemStack offHandItemStack) {
        GunAnimations animations = FlansModClient.gunAnimationsLeft.get(player);
        if (animations == null) {
            animations = new GunAnimations();
            FlansModClient.gunAnimationsLeft.put(player, animations);
        }
        GunType offHandGunType = ((ItemGun) offHandItemStack.getItem()).type;
        if (!offHandGunType.oneHanded)
            return;

        preRenderGun(ItemRenderType.EQUIPPED, offHandItemStack, offHandGunType, animations, true, player);
    }

    private void preRenderGun(ItemRenderType type, ItemStack item, GunType gunType, GunAnimations animations, boolean offHand, Object... data) {

        // The model scale
        float f = 1F / 16F;
        ModelGun model = gunType.model;
        ModelGun thirdModel = gunType.thirdPersonModel;
        if (thirdModel == null)
            thirdModel = model;

        int flip = offHand ? -1 : 1;

        GL11.glPushMatrix();
        {
            // Get the reload animation rotation
            float reloadRotate = 0F;

            // Setup transforms based on gun position
            switch (type) {
                case ENTITY: {
                    EntityItem entity = (EntityItem) data[1];
                    GL11.glRotatef(entity.age + (entity.age == 0 ? 0 : smoothing), 0F, 1F, 0F);
                    GL11.glTranslatef(-0.2F + model.itemFrameOffset.x, 0.2F + model.itemFrameOffset.y,
                            0.1F + model.itemFrameOffset.z);
                    break;
                }
                case EQUIPPED: {
                    if (offHand) {
                        GL11.glRotatef(-70F, 1F, 0F, 0F);
                        GL11.glRotatef(48F, 0F, 0F, 1F);
                        GL11.glRotatef(105F, 0F, 1F, 0F);
                        GL11.glTranslatef(-0.1F, -0.22F, -0.15F);
                    } else {
                        GL11.glRotatef(35F, 0F, 0F, 1F);
                        GL11.glRotatef(-5F, 0F, 1F, 0F);
                        GL11.glTranslatef(0.75F, -0.22F, -0.08F);
                        GL11.glScalef(1F, 1F, -1F);
                    }
                    GL11.glTranslatef(thirdModel.thirdPersonOffset.x, thirdModel.thirdPersonOffset.y, thirdModel.thirdPersonOffset.z);
                    renderGun(item, gunType, f, thirdModel, animations, reloadRotate, type);
                    GL11.glPopMatrix();
                    /*
                     * if(animations.meleeAnimationProgress > 0 && animations.meleeAnimationProgress
                     * < gunType.meleePath.size()) { Vector3f meleePos =
                     * gunType.meleePath.get(animations.meleeAnimationProgress); Vector3f
                     * nextMeleePos = animations.meleeAnimationProgress + 1 <
                     * gunType.meleePath.size() ?
                     * gunType.meleePath.get(animations.meleeAnimationProgress + 1) : new
                     * Vector3f(); GL11.glTranslatef(meleePos.x + (nextMeleePos.x - meleePos.x) *
                     * smoothing, meleePos.y + (nextMeleePos.y - meleePos.y) * smoothing, meleePos.z
                     * + (nextMeleePos.z - meleePos.z) * smoothing); }
                     */
                    return;
                }
                case EQUIPPED_FIRST_PERSON: {
                    IScope scope = gunType.getCurrentScope(item);

                    // 如果完全开镜，就停止渲染枪械
                    if (FlansModClient.zoomProgress > 0.9F && scope.hasZoomOverlay() && !model.stillRenderGunWhenScopedOverlay) {
                        GL11.glPopMatrix();
                        return;
                    }

                    //副手枪械
                    if (offHand) {
                        GL11.glTranslatef(0F, 0.03F, -0.76F);
                        GL11.glRotatef(23F, 0F, 0F, 1F);
                        GL11.glRotatef(-4F, 0F, 1F, 0F);
                        GL11.glTranslatef(0.15F, 0.2F, -0.6F);
                    }

                    float mouseOffsetX, mouseOffsetY;
                    mouseOffsetX = FlansModClient.lastMouseOffsetX + (FlansModClient.mouseOffsetX - FlansModClient.lastMouseOffsetX) * smoothing;
                    mouseOffsetY = FlansModClient.lastMouseOffsetY + (FlansModClient.mouseOffsetY - FlansModClient.lastMouseOffsetY) * smoothing;
                    if (FlansModClient.currentScope == null) {
                        mouseOffsetX *= 5.0F;
                        mouseOffsetY *= 5.0F;
                    }

                    actualZoomProgress = FlansModClient.lastZoomProgress + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * (float) Math.sin(smoothing);
                    actualZoomProgress *= model.adsEffectMultiplier;
                    actualStanceProgress = FlansModClient.lastStanceProgress + (FlansModClient.stanceProgress - FlansModClient.lastStanceProgress) * (float) Math.sin(smoothing);
                    actualCrouchProgress = FlansModClient.lastCrouchProgress + (FlansModClient.crouchProgress - FlansModClient.lastCrouchProgress) * (float) Math.sin(smoothing);
                    actualSpringProgress = FlansModClient.lastSpringProgress + (FlansModClient.springProgress - FlansModClient.lastSpringProgress) * smoothing;
                    float rand = (float) Math.sin(System.currentTimeMillis() / 1000.0) * (1 - actualZoomProgress);

                    //收枪旋转
                    GL11.glRotatef(25F - 5F * actualZoomProgress + model.stanceRotate.z * actualStanceProgress, 0F, 0F, 1F);
                    GL11.glRotatef(model.stanceRotate.x * actualStanceProgress, 0F, 1F, 0.0F);
                    GL11.glRotatef(-5F + model.stanceRotate.y * actualStanceProgress, 1F, 0F, 0.0F);
                    GL11.glRotatef(5F, 1F, 0F, 0F);
                    GL11.glRotatef(-5F, 0F, 1F, 0F);

                    //收枪偏移
                    GL11.glTranslatef(model.stanceTranslate.x * actualStanceProgress, -0.03F * actualZoomProgress + model.stanceTranslate.y * actualStanceProgress,
                            model.stanceTranslate.z * actualStanceProgress);

                    //持枪位置
                    GL11.glTranslatef(0.15F, 0.25F + 0.155F * actualZoomProgress, -0.8F - 0.205F * actualZoomProgress);
                    GL11.glRotatef(4.5F * actualZoomProgress, 0F, 0F, 1F);

                    //瞄准偏移
                    GL11.glTranslatef((model.crouchZoom - model.zoomOffset) * actualZoomProgress, (model.zoomOffsetY - 0.03F) * actualZoomProgress, model.zoomOffsetZ * actualZoomProgress);

                    //跳跃偏移
                    GL11.glTranslatef(0, 0.005F * actualSpringProgress, 0F);

                    //狙击枪动态瞄具效果，将视角贴近瞄具
                    if (gunType.hasScopeOverlay && !model.stillRenderGunWhenScopedOverlay) {
                        GL11.glTranslatef(-0.35F * actualZoomProgress, -0.05F * actualZoomProgress, 0F);
                    }

                    //随机抖动
                    GL11.glTranslatef(rand * 0.01F, rand * 0.01F, rand * 0.01F);

                    //应用鼠标偏移
                    GL11.glRotatef(mouseOffsetX, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(mouseOffsetY, 0.0F, 0.0F, 1.0F);

                    if (animations.meleeAnimationProgress > 0 && animations.meleeAnimationProgress < gunType.meleePath.size()) {
                        Vector3f meleePos = gunType.meleePath.get(animations.meleeAnimationProgress);
                        Vector3f nextMeleePos = animations.meleeAnimationProgress + 1 < gunType.meleePath.size() ? gunType.meleePath.get(animations.meleeAnimationProgress + 1) : new Vector3f();
                        GL11.glTranslatef(meleePos.x + (nextMeleePos.x - meleePos.x) * smoothing, meleePos.y + (nextMeleePos.y - meleePos.y) * smoothing, meleePos.z + (nextMeleePos.z - meleePos.z) * smoothing);
                        Vector3f meleeAngles = gunType.meleePathAngles.get(animations.meleeAnimationProgress);
                        Vector3f nextMeleeAngles = animations.meleeAnimationProgress + 1 < gunType.meleePathAngles.size() ? gunType.meleePathAngles.get(animations.meleeAnimationProgress + 1) : new Vector3f();
                        GL11.glRotatef(meleeAngles.y + (nextMeleeAngles.y - meleeAngles.y) * smoothing, 0F, 1F, 0F);
                        GL11.glRotatef(meleeAngles.z + (nextMeleeAngles.z - meleeAngles.z) * smoothing, 0F, 0F, 1F);
                        GL11.glRotatef(meleeAngles.x + (nextMeleeAngles.x - meleeAngles.x) * smoothing, 1F, 0F, 0F);
                    }

                    if (model.spinningCocking) {
                        GL11.glTranslatef(model.spinPoint.x, model.spinPoint.y, model.spinPoint.z);
                        float pumped = (animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing);
                        GL11.glRotatef(pumped * 180F + 180F, 0F, 0F, 1F);
                        GL11.glTranslatef(-model.spinPoint.x, -model.spinPoint.y, -model.spinPoint.z);
                    }

                    float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress
                            + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;

                    //播放GLTF换弹动画
                    if (animations.reloading && gunType.useGLTFAnimation) {
                        if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                            GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.GUN, gunType.tacticalReloadGLTFAnimation, "tacreload");
                        } else GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.GUN, gunType.gLTFAnimation, "reload");
                    }

                    //默认换弹动画
                    if (animations.reloading && !gunType.useGLTFAnimation) {
                        EnumAnimationType anim = model.animationType;
                        if (gunType.getGrip(item) != null && gunType.getSecondaryFire(item))
                            anim = gunType.getGrip(item).model.secondaryAnimType;

                        // Calculate the amount of tilt required for the reloading animation

                        if (isWeaponChange) {
                            animations.reloadAnimationProgress = 1;
                            animations.lastReloadAnimationProgress = 1;
                            GL11.glPopMatrix();
                            return;
                        }

                        reloadRotate = 1F;
                        if (effectiveReloadAnimationProgress < model.tiltGunTime)
                            reloadRotate = effectiveReloadAnimationProgress / model.tiltGunTime;
                        if (effectiveReloadAnimationProgress > model.tiltGunTime + model.unloadClipTime
                                + model.loadClipTime)
                            reloadRotate = 1F - (effectiveReloadAnimationProgress
                                    - (model.tiltGunTime + model.unloadClipTime + model.loadClipTime))
                                    / model.untiltGunTime;

                        // Rotate/translate the GUN dependent on the animation type
                        switch (anim) {
                            case BOTTOM_CLIP:
                            case PISTOL_CLIP:
                            case SHOTGUN:
                            case END_LOADED: {
                                GL11.glRotatef(60F * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(30F * reloadRotate * flip, 1F, 0F, 0F);
                                GL11.glTranslatef(0.25F * reloadRotate, 0F, 0F);
                                break;
                            }
                            case CUSTOMBOTTOM_CLIP:
                            case CUSTOMPISTOL_CLIP:
                            case CUSTOMSHOTGUN:
                            case CUSTOMEND_LOADED: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case BACK_LOADED: {
                                GL11.glRotatef(-75F * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(-30F * reloadRotate * flip, 1F, 0F, 0F);
                                GL11.glTranslatef(0.5F * reloadRotate, 0F, 0F);
                                break;
                            }
                            case CUSTOMBACK_LOADED: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case BULLPUP: {
                                GL11.glRotatef(70F * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(10F * reloadRotate * flip, 1F, 0F, 0F);
                                GL11.glTranslatef(0.5F * reloadRotate, -0.2F * reloadRotate, 0F);
                                break;
                            }
                            case CUSTOMBULLPUP: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case RIFLE: {
                                GL11.glRotatef(30F * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(-30F * reloadRotate * flip, 1F, 0F, 0F);
                                GL11.glTranslatef(0.5F * reloadRotate, 0F, -0.5F * reloadRotate);
                                break;
                            }
                            // CUSTOMRIFLE allows you to customize gun tilt & rotation while maintaining the
                            // specialized reload
                            case CUSTOMRIFLE: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case RIFLE_TOP:
                            case REVOLVER: {
                                GL11.glRotatef(30F * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(10F * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(-10F * reloadRotate * flip, 1F, 0F, 0F);
                                GL11.glTranslatef(0.1F * reloadRotate, -0.2F * reloadRotate, -0.1F * reloadRotate);
                                break;
                            }
                            case CUSTOMRIFLE_TOP:
                            case CUSTOMREVOLVER: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case REVOLVER2: {
                                GL11.glRotatef(20F * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(-10F * reloadRotate * flip, 1F, 0F, 0F);
                                break;
                            }
                            case CUSTOMREVOLVER2: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case ALT_PISTOL_CLIP: {
                                GL11.glRotatef(60F * reloadRotate * flip, 0F, 1F, 0F);
                                GL11.glTranslatef(0.15F * reloadRotate, 0.25F * reloadRotate, 0F);
                                break;
                            }
                            case CUSTOMALT_PISTOL_CLIP: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case STRIKER: {
                                GL11.glRotatef(-35F * reloadRotate * flip, 1F, 0F, 0F);
                                GL11.glTranslatef(0.2F * reloadRotate, 0F, -0.1F * reloadRotate);
                                break;
                            }
                            case CUSTOMSTRIKER: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case GENERIC: {
                                // Gun reloads partly or completely off-screen.
                                GL11.glRotatef(45F * reloadRotate, 0F, 0F, 1F);
                                GL11.glTranslatef(-0.2F * reloadRotate, -0.5F * reloadRotate, 0F);
                                break;
                            }
                            case CUSTOMGENERIC: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            case CUSTOM: {
                                GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0F, 0F, 1F);
                                GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0F, 1F, 0F);
                                GL11.glRotatef(model.tiltGun * reloadRotate, 1F, 0F, 0F);
                                GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate,
                                        model.translateGun.z * reloadRotate);
                                break;
                            }
                            default:
                                break;
                        }
                    }
                    break;
                }
                default:
                    break;
            }

            renderGun(item, gunType, f, model, animations, reloadRotate, type);
        }
        GL11.glPopMatrix();
    }

    /**
     * Gun render method, seperated from transforms so that mecha renderer may also
     * call this
     */
    public void renderGun(ItemStack item, GunType gunType, float f, ModelGun model, GunAnimations animations, float reloadRotate, ItemRenderType rtype) {

        // Make sure we actually have the renderEngine
        if (renderEngine == null)
            renderEngine = Minecraft.getMinecraft().renderEngine;

        float scale = gunType.modelScale;
        if (rtype == ItemRenderType.EQUIPPED) {
            scale = gunType.thirdPersonModelScale;
        }

        // If we have no animation variables, use defaults
        if (animations == null)
            animations = GunAnimations.defaults;

        // Get all the attachments that we may need to render
        AttachmentType scopeAttachment = gunType.getScope(item);
        AttachmentType barrelAttachment = gunType.getBarrel(item);
        AttachmentType stockAttachment = gunType.getStock(item);
        AttachmentType gripAttachment = gunType.getGrip(item);
        AttachmentType gadgetAttachment = gunType.getGadget(item);
        AttachmentType slideAttachment = gunType.getSlide(item);
        AttachmentType pumpAttachment = gunType.getPump(item);
        AttachmentType accessoryAttachment = gunType.getAccessory(item);

        ItemStack scopeItemStack = gunType.getScopeItemStack(item);
        ItemStack barrelItemStack = gunType.getBarrelItemStack(item);
        ItemStack stockItemStack = gunType.getStockItemStack(item);
        ItemStack gripItemStack = gunType.getGripItemStack(item);
        ItemStack gadgetItemStack = gunType.getGadgetItemStack(item);
        ItemStack slideItemStack = gunType.getSlideItemStack(item);
        ItemStack pumpItemStack = gunType.getPumpItemStack(item);
        ItemStack accessoryItemStack = gunType.getAccessoryItemStack(item);

        //枪械后坐力
        {
            animations.recoilAmount = model.recoilAmount;

            GL11.glPushMatrix();
            if (rtype == ItemRenderType.EQUIPPED_FIRST_PERSON) {

                if(gunType.shootAnimation != null) {
                    float effectiveRecoilAnimationProgress = animations.lastRecoilProgress
                            + (animations.recoilProgress - animations.lastRecoilProgress) * smoothing;
                    if(gunType.aimingShootAnimation != null) {
                        if(zoomProgress > 0.5F) {
                            GLTFAnimationController.playAnimation(effectiveRecoilAnimationProgress, EnumAnimationPart.GUN, gunType.shootAnimation, "shoot_aim");
                        } else {
                            GLTFAnimationController.playAnimation(effectiveRecoilAnimationProgress, EnumAnimationPart.GUN, gunType.shootAnimation, "shoot");
                        }
                    } else {
                        GLTFAnimationController.playAnimation(effectiveRecoilAnimationProgress, EnumAnimationPart.GUN, gunType.shootAnimation, "shoot");
                    }
                } else {
                    GL11.glTranslatef(0F, 0, 0);

                    float distanceAiming = getRecoilDistance(gripAttachment, gunType, item) * getRandomFloat(0.8F, 1);
                    float distanceHipFire = getRecoilDistanceHipFire(gunType, item) * getRandomFloat(0.8F, 1);
                    float angle = getRecoilAngle(gripAttachment, gunType, item) * getRandomFloat(0.8F, 1);
                    float shake = getRecoilShakeDistance(gunType, item) * getRandomFloat(-1.5F, 1.5F);

                    if(zoomProgress > 0.7F) {
                        GL11.glTranslatef(-(animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * distanceAiming, 0F, 0F);
                    } else {
                        GL11.glTranslatef(-(animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * distanceHipFire, 0F, 0F);
                    }
                    GL11.glRotatef(-(animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * angle, 0F, 0F, 1F);
                    GL11.glRotatef((-animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * shake * smoothing, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef((-animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * shake * smoothing, 1.0f, 0.0f, 0.0f);

                    // Do not move gun when there's a pump in the reload
                    if (model.animationType == EnumAnimationType.SHOTGUN && !animations.reloading) {
                        GL11.glRotatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * -5F, 0F, 1F, 0F);
                        GL11.glRotatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * 5F, 1F, 0F, 0F);
                    }

                    if (model.isSingleAction) {
                        GL11.glRotatef(-(1 - Math.abs(animations.lastGunPullback + (animations.gunPullback - animations.lastGunPullback) * smoothing)) * -5F, 0F, 0F, 1F);
                        GL11.glRotatef(-(1 - Math.abs(animations.lastGunPullback + (animations.gunPullback - animations.lastGunPullback) * smoothing)) * 2.5F, 1F, 0F, 0F);
                    }
                }

            }
        }

        effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;

        ItemStack[] bulletStacks = new ItemStack[gunType.getNumAmmoItemsInGun(item)];
        boolean empty = true;
        int numRounds = 0;
        for (int i = 0; i < gunType.getNumAmmoItemsInGun(item); i++) {
            bulletStacks[i] = ((ItemGun) item.getItem()).getBulletItemStack(item, i);
            if (bulletStacks[i] != null && bulletStacks[i].getItem() instanceof ItemShootable
                    && bulletStacks[i].getItemDamage() < bulletStacks[i].getMaxDamage()) {
                empty = false;
                numRounds += bulletStacks[i].getMaxDamage() - bulletStacks[i].getItemDamage();
            }
        }

        // Sanity check for empty guns
        if (model.slideLockOnEmpty) {
            if (empty)
                animations.onGunEmpty(true);
            else if (!animations.reloading)
                animations.onGunEmpty(false);
        }

        // Load Arm texture
        if (rtype == ItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms && FlansMod.armsEnable) {
            Minecraft mc = Minecraft.getMinecraft();
            renderFirstPersonArm(mc.thePlayer, model, gunType, animations);
        }


        if (rtype == ItemRenderType.EQUIPPED) {
            renderEngine.bindTexture(FlansModResourceHandler.get3rdTexture(gunType));
        } else {
            renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(gunType.getPaintjob(item.getItemDamage())));
        }

        // This allows you to offset your gun with a sight attached to properly align
        // the aiming reticle
        // Can be adjusted per scope and per gun
        if (scopeAttachment != null && (model.gunOffset != 0.0F || scopeAttachment.model.renderOffset != 0.0F || scopeAttachment.model.coSightRenderOffset != 0.0F))
            if (FlansMod.coSight) {
                GL11.glTranslatef(
                        (model.gunOffsetX + scopeAttachment.model.renderOffsetX) * actualZoomProgress / 16.0F,
                        (-scopeAttachment.model.renderOffset - scopeAttachment.model.coSightRenderOffset + model.gunOffset) * actualZoomProgress / 16.0F,
                        model.gunOffsetZ * actualZoomProgress / 16.0F
                );
            } else {
                GL11.glTranslatef(
                        (model.gunOffsetX + scopeAttachment.model.renderOffsetX) * actualZoomProgress / 16.0F,
                        (-scopeAttachment.model.renderOffset + model.gunOffset) * actualZoomProgress / 16.0F,
                        model.gunOffsetZ * actualZoomProgress / 16.0F
                );
            }
        // Render the gun and default attachment models
        GL11.glPushMatrix();
        {
            GL11.glScalef(scale, scale, scale);

            model.renderGun(f);
            // Render any default attachments
            if (scopeAttachment == null && !model.scopeIsOnSlide && (!model.scopeIsOnBreakAction || !model.defaultScopeIsOnBreakAction))
                model.renderDefaultScope(f);
            if (barrelAttachment == null)
                model.renderDefaultBarrel(f);
            if (stockAttachment == null)
                model.renderDefaultStock(f);
            if (gripAttachment == null && !model.gripIsOnPump)
                model.renderDefaultGrip(f);
            if (gadgetAttachment == null && !model.gadgetIsOnPump)
                model.renderDefaultGadget(f);

            if (scopeAttachment != null && !model.scopeIsOnSlide && (!model.scopeIsOnBreakAction || !model.defaultScopeIsOnBreakAction))
                model.renderAttachmentScope(f);
            if (barrelAttachment != null)
                model.renderAttachmentBarrel(f);
            if (stockAttachment != null)
                model.renderAttachmentStock(f);
            if (gripAttachment != null && !model.gripIsOnPump)
                model.renderAttachmentGrip(f);
            if (gadgetAttachment != null && !model.gadgetIsOnPump)
                model.renderAttachmentGadget(f);

            //Render the bullet counter
            GL11.glPushMatrix();
            {
                if (model.isBulletCounterActive)
                    model.renderBulletCounter(f, numRounds);
            }
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            {
                if (model.isAdvBulletCounterActive)
                    model.renderAdvBulletCounter(f, numRounds, model.countOnRightHandSide);
            }
            GL11.glPopMatrix();

            // Option to offset flash location with a barrel attachment (location + offset =
            // new location)
            boolean isFlashEnabled = barrelAttachment == null || !barrelAttachment.disableMuzzleFlash;

            if (isFlashEnabled && animations.muzzleFlashTime > 0 && gunType.flashModel != null && !gunType.getSecondaryFire(item)) {
                GL11.glPushMatrix();
                ModelFlash flash = gunType.flashModel;
                GL11.glScalef(model.flashScale, model.flashScale, model.flashScale);
                {
                    Vector3f base = model.muzzleFlashPoint == null ? Vector3f.Zero : model.muzzleFlashPoint;
                    if (barrelAttachment != null) {
                        Vector3f barrelOffset = (barrelAttachment.model != null && barrelAttachment.model.attachmentFlashOffset != null) ? barrelAttachment.model.attachmentFlashOffset : Vector3f.Zero;
                        GL11.glTranslatef(base.x + barrelOffset.x,
                                base.y + barrelOffset.y,
                                base.z + barrelOffset.z);
                    } else {
                        Vector3f defaultOffset = model.defaultBarrelFlashPoint == null ? Vector3f.Zero : model.defaultBarrelFlashPoint;

                        GL11.glTranslatef(base.x + defaultOffset.x,
                                base.y + defaultOffset.y,
                                base.z + defaultOffset.z);
                    }

                    renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.flashTexture));
                    ModelGun.glowOn();
                    flash.renderFlash(f, animations.flashInt);
                    ModelGun.glowOff();
                    renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(gunType.getPaintjob(item.getItemDamage())));
                }
                GL11.glPopMatrix();
            }

            // Render various shoot / reload animated parts
            // Render the slide and charge action
            if (slideAttachment == null) {
                GL11.glPushMatrix();
                {
                    if (!gunType.getSecondaryFire(item)) {
                        GL11.glTranslatef(
                                -(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing)
                                        * model.gunSlideDistance,
                                0F, 0F);
                        GL11.glTranslatef(-(1 - Math.abs(
                                animations.lastCharged + (animations.charged - animations.lastCharged) * smoothing))
                                * model.chargeHandleDistance, 0F, 0F);
                    }
                    if (gunType.useGLTFAnimation && animations.reloading) {
                        if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                            GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.SLIDE, gunType.tacticalReloadGLTFAnimation, "tacreload", false, gunType.modelScale);
                        } else GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.SLIDE, gunType.gLTFAnimation, "reload", false, gunType.modelScale);
                    }
                    model.renderSlide(f);
                    if (scopeAttachment == null && model.scopeIsOnSlide)
                        model.renderDefaultScope(f);
                    if (scopeAttachment != null && model.scopeIsOnSlide)
                        model.renderAttachmentScope(f);
                }
                GL11.glPopMatrix();
            }

            // Render the alternate slide
            if (slideAttachment == null) {
                GL11.glPushMatrix();
                {
                    if (!gunType.getSecondaryFire(item)) {
                        GL11.glTranslatef(
                                -(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing)
                                        * model.altgunSlideDistance,
                                0F, 0F);
                        model.renderaltSlide(f);
                    }

                    // if(scopeAttachment == null && model.scopeIsOnSlide)
                    // model.renderDefaultScope(f);
                }
                GL11.glPopMatrix();
            }

            // Render the break action
            GL11.glPushMatrix();
            {
                GL11.glTranslatef(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
                GL11.glRotatef(reloadRotate * -model.breakAngle, 0F, 0F, 1F);
                GL11.glTranslatef(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
                if (gunType.useGLTFAnimation && animations.reloading) {

                    if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                        GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.BREAK_ACTION, gunType.tacticalReloadGLTFAnimation, "tacreload", false, gunType.modelScale, model.barrelBreakPoint);
                    } else GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.BREAK_ACTION, gunType.gLTFAnimation, "reload", false, gunType.modelScale, model.barrelBreakPoint);

                }
                model.renderBreakAction(f);
                if (scopeAttachment == null && model.scopeIsOnBreakAction && model.defaultScopeIsOnBreakAction)
                    model.renderDefaultScope(f);
                if (scopeAttachment != null && model.scopeIsOnBreakAction && model.defaultScopeIsOnBreakAction)
                    model.renderAttachmentScope(f);
            }
            GL11.glPopMatrix();

            // Render the alternate break action
            GL11.glPushMatrix();
            {
                GL11.glTranslatef(model.altbarrelBreakPoint.x, model.altbarrelBreakPoint.y, model.altbarrelBreakPoint.z);
                GL11.glRotatef(reloadRotate * -model.altbreakAngle, 0F, 0F, 1F);
                GL11.glTranslatef(-model.altbarrelBreakPoint.x, -model.altbarrelBreakPoint.y, -model.altbarrelBreakPoint.z);
                model.renderaltBreakAction(f);
                // if(scopeAttachment == null && model.scopeIsOnBreakAction)
                // model.renderDefaultScope(f);
            }
            GL11.glPopMatrix();

            // Render the hammer
            GL11.glPushMatrix();
            {
                GL11.glTranslatef(model.hammerSpinPoint.x, model.hammerSpinPoint.y, model.hammerSpinPoint.z);
                GL11.glRotatef(-animations.hammerRotation, 0F, 0F, 1F);
                GL11.glTranslatef(-model.hammerSpinPoint.x, -model.hammerSpinPoint.y, -model.hammerSpinPoint.z);
                model.renderHammer(f);
            }
            GL11.glPopMatrix();

            // Render the alternate hammer
            GL11.glPushMatrix();
            {
                GL11.glTranslatef(model.althammerSpinPoint.x, model.althammerSpinPoint.y, model.althammerSpinPoint.z);
                GL11.glRotatef(-animations.althammerRotation, 0F, 0F, 1F);
                GL11.glTranslatef(-model.althammerSpinPoint.x, -model.althammerSpinPoint.y, -model.althammerSpinPoint.z);
                model.renderaltHammer(f);
            }
            GL11.glPopMatrix();

            // Render the pump-action handle
            if (pumpAttachment == null) {
                GL11.glPushMatrix();
                {
                    if (gunType.useGLTFAnimation && animations.reloading) {
                        if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                            GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.PUMP, gunType.tacticalReloadGLTFAnimation, "tacreload", false, gunType.modelScale, model.pumpHandlePoint);
                        } else GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.PUMP, gunType.gLTFAnimation, "reload", false, gunType.modelScale, model.pumpHandlePoint);
                    } else {
                        GL11.glTranslatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
                    }
                    model.renderPump(f);
                    if (gripAttachment == null && model.gripIsOnPump)
                        model.renderDefaultGrip(f);
                    if (gadgetAttachment == null && model.gadgetIsOnPump)
                        model.renderDefaultGadget(f);
                    if (gripAttachment != null && model.gripIsOnPump)
                        model.renderAttachmentGrip(f);
                    if (gadgetAttachment != null && model.gadgetIsOnPump)
                        model.renderAttachmentGadget(f);
                    if (FlansModClient.shotState != -1 && -(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance != -0.0) {
                        FlansModClient.shotState = -1;
                        if (gunType.actionSound != null) {
                            Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.func_147673_a(FlansModResourceHandler.getSound(gunType.actionSound)));
                        }
                    }
                }
                GL11.glPopMatrix();
            }

            // Render the alternate pump-action handle
            if (pumpAttachment == null) {
                GL11.glPushMatrix();
                {

                    GL11.glTranslatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
                    float pumped = (animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing);
                    model.renderaltPump(f);
                    if (gripAttachment == null && model.gripIsOnPump)
                        model.renderDefaultGrip(f);
                    if (gadgetAttachment == null && model.gadgetIsOnPump)
                        model.renderDefaultGadget(f);
                    if (gripAttachment != null && model.gripIsOnPump)
                        model.renderAttachmentGrip(f);
                    if (gadgetAttachment != null && model.gadgetIsOnPump)
                        model.renderAttachmentGadget(f);
                }
                GL11.glPopMatrix();
            }

            // Render the charge handle
            if (model.chargeHandleDistance != 0F) {
                GL11.glPushMatrix();
                {
                    GL11.glTranslatef(-(1 - Math.abs(animations.lastCharged + (animations.charged - animations.lastCharged) * smoothing)) * model.chargeHandleDistance, 0F, 0F);
                    model.renderCharge(f);
                }
                GL11.glPopMatrix();
            }

            // Render the minigun barrels
            if (gunType.mode == EnumFireMode.MINIGUN) {
                GL11.glPushMatrix();
                GL11.glTranslatef(model.minigunBarrelOrigin.x, model.minigunBarrelOrigin.y, model.minigunBarrelOrigin.z);
                GL11.glRotatef(animations.minigunBarrelRotation, 1F, 0F, 0F);
                GL11.glTranslatef(-model.minigunBarrelOrigin.x, -model.minigunBarrelOrigin.y, -model.minigunBarrelOrigin.z);
                model.renderMinigunBarrel(f);
                GL11.glPopMatrix();
            }

            // Render the cocking handle

            // Render the revolver barrel
            GL11.glPushMatrix();
            {
                GL11.glTranslatef(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
                GL11.glRotatef(reloadRotate * model.revolverFlipAngle, 1F, 0F, 0F);
                GL11.glTranslatef(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
                if (gunType.useGLTFAnimation && animations.reloading) {
                    if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                        GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.REVOLVER_BARREL, gunType.tacticalReloadGLTFAnimation, "tacreload", false, gunType.modelScale, model.revolverFlipPoint);
                    } else GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.REVOLVER_BARREL, gunType.gLTFAnimation, "reload", false, gunType.modelScale, model.revolverFlipPoint);
                }
                model.renderRevolverBarrel(f);
            }
            GL11.glPopMatrix();

            // Render the revolver2 barrel
            GL11.glPushMatrix();
            {
                GL11.glTranslatef(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
                GL11.glRotatef(reloadRotate * model.revolverFlipAngle, -1F, 0F, 0F);
                GL11.glTranslatef(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
                model.renderRevolver2Barrel(f);
            }
            GL11.glPopMatrix();

            //渲染额外弹匣
            if(gunType.renderExtraAmmo && animations.reloading){
                GL11.glPushMatrix();

                if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                    GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.EXTRA_AMMO, gunType.tacticalReloadGLTFAnimation, "tacreload", false, gunType.modelScale);
                } else GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.EXTRA_AMMO, gunType.gLTFAnimation, "reload", false, gunType.modelScale);

                model.renderExtraAmmo(f);
                GL11.glPopMatrix();
            }


            //----------------------------------------------------------------------------------------------------------渲染弹匣逻辑
            // Render the clip
            GL11.glPushMatrix();
            {
                boolean shouldRender = true;

                EnumAnimationType anim = model.animationType;
                if (gripAttachment != null && gunType.getSecondaryFire(item))
                    anim = gripAttachment.model.secondaryAnimType;

                float tiltGunTime = model.tiltGunTime, unloadClipTime = model.unloadClipTime, loadClipTime = model.loadClipTime;
                if (gripAttachment != null && gunType.getSecondaryFire(item)) {
                    tiltGunTime = gripAttachment.model.tiltGunTime;
                    unloadClipTime = gripAttachment.model.unloadClipTime;
                    loadClipTime = gripAttachment.model.loadClipTime;
                }

                // Check to see if the ammo should be rendered first
                switch (anim) {
                    case END_LOADED:
                    case BACK_LOADED: {
                        if (empty)
                            shouldRender = false;
                        break;
                    }
                    default:
                        break;
                }

                // If it should be rendered, do the transformations required
                if (shouldRender && animations.reloading && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0) {
                    // Calculate the amount of tilt required for the reloading animation

                    float clipPosition = 0F;
                    if (effectiveReloadAnimationProgress > tiltGunTime && effectiveReloadAnimationProgress < tiltGunTime + unloadClipTime)
                        clipPosition = (effectiveReloadAnimationProgress - tiltGunTime) / unloadClipTime;
                    if (effectiveReloadAnimationProgress >= tiltGunTime + unloadClipTime && effectiveReloadAnimationProgress < tiltGunTime + unloadClipTime + loadClipTime)
                        clipPosition = 1F - (effectiveReloadAnimationProgress - (tiltGunTime + unloadClipTime)) / loadClipTime;
                    float loadOnlyClipPosition = Math.max(0F, Math.min(1F, 1F - ((effectiveReloadAnimationProgress - tiltGunTime) / (unloadClipTime + loadClipTime))));

                    // Rotate/translate the AMMO dependent on the animation type

                    //播放GLTF换弹动画
                    if (gunType.useGLTFAnimation) {
                        if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                            GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.AMMO, gunType.tacticalReloadGLTFAnimation, "tacreload", false, gunType.modelScale, model.revolverFlipPoint);
                        } else GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.AMMO, gunType.gLTFAnimation, "reload", false, gunType.modelScale, model.revolverFlipPoint);

                    } else {
                        switch (anim) {
                            case BREAK_ACTION:
                            case CUSTOMBREAK_ACTION: {
                                if (model.ammoIsOnBreakAction) {
                                    GL11.glTranslatef(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
                                    GL11.glRotatef(reloadRotate * -model.breakAngle, 0F, 0F, 1F);
                                    GL11.glTranslatef(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
                                    GL11.glTranslatef(-model.breakActionAmmoDistance * clipPosition * 1 / gunType.modelScale, 0F, 0F);
                                } else {
                                    if (effectiveReloadAnimationProgress < 0.5 && model.stagedReload) {
                                        GL11.glRotatef(model.rotateClipVertical * clipPosition, 0F, 0F, 1F);
                                        GL11.glRotatef(model.rotateClipHorizontal * clipPosition, 0F, 1F, 0F);
                                        GL11.glRotatef(model.tiltClip * clipPosition, 1F, 0F, 0F);
                                        GL11.glTranslatef(model.translateClip.x * clipPosition * 1 / gunType.modelScale, model.translateClip.y * clipPosition * 1 / gunType.modelScale, model.translateClip.z * clipPosition * 1 / gunType.modelScale);
                                        break;
                                    } else if (effectiveReloadAnimationProgress > 0.5 && model.stagedReload) {
                                        GL11.glRotatef(model.stagedrotateClipVertical * clipPosition, 0F, 0F, 1F);
                                        GL11.glRotatef(model.stagedrotateClipHorizontal * clipPosition, 0F, 1F, 0F);
                                        GL11.glRotatef(model.stagedtiltClip * clipPosition, 1F, 0F, 0F);
                                        GL11.glTranslatef(model.stagedtranslateClip.x * clipPosition * 1 / gunType.modelScale, model.stagedtranslateClip.y * clipPosition * 1 / gunType.modelScale, model.stagedtranslateClip.z * clipPosition * 1 / gunType.modelScale);
                                        break;
                                    } else {
                                        GL11.glRotatef(model.rotateClipVertical * clipPosition, 0F, 0F, 1F);
                                        GL11.glRotatef(model.rotateClipHorizontal * clipPosition, 0F, 1F, 0F);
                                        GL11.glRotatef(model.tiltClip * clipPosition, 1F, 0F, 0F);
                                        GL11.glTranslatef(model.translateClip.x * clipPosition * 1 / gunType.modelScale, model.translateClip.y * clipPosition * 1 / gunType.modelScale, model.translateClip.z * clipPosition * 1 / gunType.modelScale);
                                        break;
                                    }
                                }
                                break;
                            }
                            case REVOLVER:
                            case CUSTOMREVOLVER: {
                                GL11.glTranslatef(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
                                GL11.glRotatef(reloadRotate * model.revolverFlipAngle, 1F, 0F, 0F);
                                GL11.glTranslatef(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
                                GL11.glTranslatef(-1F * clipPosition * 1 / gunType.modelScale, 0F, 0F);
                                break;
                            }
                            case REVOLVER2:
                            case CUSTOMREVOLVER2: {
                                GL11.glTranslatef(model.revolver2FlipPoint.x, model.revolver2FlipPoint.y, model.revolver2FlipPoint.z);
                                GL11.glRotatef(reloadRotate * model.revolver2FlipAngle, -1F, 0F, 0F);
                                GL11.glTranslatef(-model.revolver2FlipPoint.x, -model.revolver2FlipPoint.y, -model.revolver2FlipPoint.z);
                                GL11.glTranslatef(-1F * clipPosition * 1 / gunType.modelScale, 0F, 0F);
                                break;
                            }
                            case BOTTOM_CLIP:
                            case CUSTOMBOTTOM_CLIP: {
                                GL11.glRotatef(-180F * clipPosition, 0F, 0F, 1F);
                                GL11.glRotatef(60F * clipPosition, 1F, 0F, 0F);
                                GL11.glTranslatef(0.5F * clipPosition * 1 / gunType.modelScale, 0F, 0F);
                                break;
                            }
                            case PISTOL_CLIP:
                            case CUSTOMPISTOL_CLIP: {
                                GL11.glRotatef(-90F * clipPosition * clipPosition, 0F, 0F, 1F);
                                GL11.glTranslatef(0F, -1F * clipPosition * 1 / gunType.modelScale, 0F);
                                break;
                            }
                            case ALT_PISTOL_CLIP:
                            case CUSTOMALT_PISTOL_CLIP: {
                                GL11.glRotatef(5F * clipPosition, 0F, 0F, 1F);
                                GL11.glTranslatef(0F, -3F * clipPosition * 1 / gunType.modelScale, 0F);
                                break;
                            }
                            case SIDE_CLIP:
                            case CUSTOMSIDE_CLIP: {
                                GL11.glRotatef(180F * clipPosition, 0F, 1F, 0F);
                                GL11.glRotatef(60F * clipPosition, 0F, 1F, 0F);
                                GL11.glTranslatef(0.5F * clipPosition * 1 / gunType.modelScale, 0F, 0F);
                                break;
                            }
                            case BULLPUP:
                            case CUSTOMBULLPUP: {
                                GL11.glRotatef(-150F * clipPosition, 0F, 0F, 1F);
                                GL11.glRotatef(60F * clipPosition, 1F, 0F, 0F);
                                GL11.glTranslatef(1F * clipPosition * 1 / gunType.modelScale,
                                        -0.5F * clipPosition * 1 / gunType.modelScale, 0F);
                                break;
                            }
                            case P90:
                            case CUSTOMP90: {
                                GL11.glRotatef(-15F * reloadRotate * reloadRotate, 0F, 0F, 1F);
                                GL11.glTranslatef(0F, 0.075F * reloadRotate, 0F);
                                GL11.glTranslatef(-2F * clipPosition * 1 / gunType.modelScale, -0.3F * clipPosition * 1 / gunType.modelScale, 0.5F * clipPosition * 1 / gunType.modelScale);
                                break;
                            }
                            case RIFLE: {
                                float ammoPosition = clipPosition * getNumBulletsInReload(animations, gripAttachment, gunType, item);
                                int bulletNum = MathHelper.floor_float(ammoPosition);
                                float bulletProgress = ammoPosition - bulletNum;

                                GL11.glRotatef(bulletProgress * 15F, 0F, 1F, 0F);
                                GL11.glRotatef(bulletProgress * 15F, 0F, 0F, 1F);
                                GL11.glTranslatef(bulletProgress * -1F * 1 / gunType.modelScale, 0F, bulletProgress * 0.5F * 1 / gunType.modelScale);
                                break;
                            }
                            case CUSTOMRIFLE: {
                                float maxBullets = getNumBulletsInReload(animations, gripAttachment, gunType, item);
                                float ammoPosition = clipPosition * maxBullets;
                                int bulletNum = MathHelper.floor_float(ammoPosition);
                                float bulletProgress = ammoPosition - bulletNum;

                                if (gunType.getNumAmmoItemsInGun(item) > 1 && gunType.bulletInsert != null && FlansModClient.lastBulletReload != -2) {
                                    if (maxBullets == 2 && FlansModClient.lastBulletReload != -1) {
                                        int time = (int) (animations.reloadAnimationTime / maxBullets);
                                        Minecraft.getMinecraft().getSoundHandler().playDelayedSound(PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(gunType.bulletInsert), 1.0F), time);
                                        FlansModClient.lastBulletReload = -1;
                                    } else if ((bulletNum == (int) maxBullets || bulletNum == FlansModClient.lastBulletReload - 1)) {
                                        FlansModClient.lastBulletReload = bulletNum;
                                        Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(gunType.bulletInsert), 1.0F));
                                    }

                                    if ((ammoPosition < 0.03 && bulletProgress > 0)) {
                                        FlansModClient.lastBulletReload = -2;
                                        Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(gunType.bulletInsert), 1.0F));
                                    }
                                }

                                GL11.glRotatef(bulletProgress * model.rotateClipVertical, 0F, 1F, 0F);
                                GL11.glRotatef(bulletProgress * model.rotateClipHorizontal, 0F, 0F, 1F);
                                GL11.glRotatef(bulletProgress * model.tiltClip, 1F, 0F, 0F);
                                GL11.glTranslatef(bulletProgress * model.translateClip.x / gunType.modelScale, bulletProgress * model.translateClip.y / gunType.modelScale, bulletProgress * model.translateClip.z / gunType.modelScale);
                                break;
                            }
                            case RIFLE_TOP:
                            case CUSTOMRIFLE_TOP: {
                                float ammoPosition = clipPosition * getNumBulletsInReload(animations, gripAttachment, gunType, item);
                                int bulletNum = MathHelper.floor_float(ammoPosition);
                                float bulletProgress = ammoPosition - bulletNum;

                                GL11.glRotatef(bulletProgress * 55F, 0F, 1F, 0F);
                                GL11.glRotatef(bulletProgress * 95F, 0F, 0F, 1F);
                                GL11.glTranslatef(bulletProgress * -0.1F * 1 / gunType.modelScale, bulletProgress * 1F * 1 / gunType.modelScale, bulletProgress * 0.5F * 1 / gunType.modelScale);

                                break;
                            }

                            case SHOTGUN:
                            case STRIKER:
                            case CUSTOMSHOTGUN:
                            case CUSTOMSTRIKER: {
                                float maxBullets = getNumBulletsInReload(animations, gripAttachment, gunType, item);
                                float ammoPosition = clipPosition * maxBullets;
                                int bulletNum = MathHelper.floor_float(ammoPosition);
                                float bulletProgress = ammoPosition - bulletNum;

                                if (maxBullets > 1) {
                                    if (gunType.getNumAmmoItemsInGun(item) > 1 && gunType.bulletInsert != null && FlansModClient.lastBulletReload != -2) {
                                        if (maxBullets == 2 && FlansModClient.lastBulletReload != -1) {
                                            int time = (int) (animations.reloadAnimationTime / maxBullets);
                                            Minecraft.getMinecraft().getSoundHandler().playDelayedSound(PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(gunType.bulletInsert), 1.0F), time);
                                            FlansModClient.lastBulletReload = -1;
                                        } else if ((bulletNum == (int) maxBullets || bulletNum == FlansModClient.lastBulletReload - 1)) {
                                            FlansModClient.lastBulletReload = bulletNum;
                                            Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord
                                                    .func_147674_a(FlansModResourceHandler.getSound(gunType.bulletInsert), 1.0F));
                                        }

                                        if ((ammoPosition < 0.03 && bulletProgress > 0)) {
                                            FlansModClient.lastBulletReload = -2;
                                            Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord
                                                    .func_147674_a(FlansModResourceHandler.getSound(gunType.bulletInsert), 1.0F));
                                        }
                                    }
                                }


                                GL11.glRotatef(bulletProgress * -30F, 0F, 0F, 1F);
                                GL11.glTranslatef(bulletProgress * -0.5F * 1 / gunType.modelScale, bulletProgress * -1F * 1 / gunType.modelScale, 0F);

                                break;
                            }
                            case CUSTOM: {
                                // Staged reload allows you to change the animation route half way through
                                if (effectiveReloadAnimationProgress < 0.5 && model.stagedReload) {
                                    GL11.glRotatef(model.rotateClipVertical * clipPosition, 0F, 0F, 1F);
                                    GL11.glRotatef(model.rotateClipHorizontal * clipPosition, 0F, 1F, 0F);
                                    GL11.glRotatef(model.tiltClip * clipPosition, 1F, 0F, 0F);
                                    GL11.glTranslatef(model.translateClip.x * clipPosition * 1 / gunType.modelScale, model.translateClip.y * clipPosition * 1 / gunType.modelScale, model.translateClip.z * clipPosition * 1 / gunType.modelScale);
                                    break;
                                } else if (effectiveReloadAnimationProgress > 0.5 && model.stagedReload) {
                                    GL11.glRotatef(model.stagedrotateClipVertical * clipPosition, 0F, 0F, 1F);
                                    GL11.glRotatef(model.stagedrotateClipHorizontal * clipPosition, 0F, 1F, 0F);
                                    GL11.glRotatef(model.stagedtiltClip * clipPosition, 1F, 0F, 0F);
                                    GL11.glTranslatef(model.stagedtranslateClip.x * clipPosition * 1 / gunType.modelScale, model.stagedtranslateClip.y * clipPosition * 1 / gunType.modelScale, model.stagedtranslateClip.z * clipPosition * 1 / gunType.modelScale);
                                    break;
                                } else {
                                    GL11.glRotatef(model.rotateClipVertical * clipPosition, 0F, 0F, 1F);
                                    GL11.glRotatef(model.rotateClipHorizontal * clipPosition, 0F, 1F, 0F);
                                    GL11.glRotatef(model.tiltClip * clipPosition, 1F, 0F, 0F);
                                    GL11.glTranslatef(model.translateClip.x * clipPosition * 1 / gunType.modelScale, model.translateClip.y * clipPosition * 1 / gunType.modelScale, model.translateClip.z * clipPosition * 1 / gunType.modelScale);
                                    break;
                                }
                            }
                            case END_LOADED:
                            case CUSTOMEND_LOADED: {
                                float dYaw = (loadOnlyClipPosition > 0.5F ? loadOnlyClipPosition * 2F - 1F : 0F);

                                GL11.glRotatef(-45F * dYaw, 0F, 0F, 1F);
                                GL11.glTranslatef(-getEndLoadedDistance(gripAttachment, gunType, item) * dYaw, -0.5F * dYaw, 0F);

                                float xDisplacement = (loadOnlyClipPosition < 0.5F ? loadOnlyClipPosition * 2F : 1F);
                                GL11.glTranslatef(getEndLoadedDistance(gripAttachment, gunType, item) * xDisplacement, 0F, 0F);
                                break;
                            }
                            case BACK_LOADED:
                            case CUSTOMBACK_LOADED: {
                                float dYaw = (loadOnlyClipPosition > 0.5F ? loadOnlyClipPosition * 2F - 1F : 0F);
                                // GL11.glRotatef(-45F * dYaw, 0F, 0F, 1F);
                                GL11.glTranslatef(getEndLoadedDistance(gripAttachment, gunType, item) * dYaw, -0.5F * dYaw, 0F);

                                float xDisplacement = (loadOnlyClipPosition < 0.5F ? loadOnlyClipPosition * 2F : 1F);
                                GL11.glTranslatef(-getEndLoadedDistance(gripAttachment, gunType, item) * xDisplacement, 0F, 0F);
                            }

                            default:
                                break;
                        }
                    }
                }

                if (rtype == ItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms && FlansMod.armsEnable) {
                    Minecraft mc = Minecraft.getMinecraft();
                    renderAnimArm(mc.thePlayer, model, gunType, animations);
                }

                if (rtype == ItemRenderType.EQUIPPED) {
                    renderEngine.bindTexture(FlansModResourceHandler.get3rdTexture(gunType));
                } else {
                    renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(gunType.getPaintjob(item.getItemDamage())));
                }

                if (shouldRender) {
                    if (gripAttachment != null && gunType.getSecondaryFire(item))
                        renderAttachmentAmmo(f, gripAttachment, model, gripAttachment.getPaintjob(gripItemStack.getItemDamage()), gunType.getPaintjob(item.getItemDamage()));
                    else
                        model.renderAmmo(f);
                }
                // Renders fullammo model for 2nd half of reload animation
                if (effectiveReloadAnimationProgress > 0.5)
                    model.renderfullAmmo(f);
            }
            GL11.glPopMatrix();

            // Render a static model of the ammo NOT being reloaded
            GL11.glPushMatrix();
            {
                if (gunType.getSecondaryFire(item))
                    model.renderAmmo(f);
                else if (gripAttachment != null && !gunType.getSecondaryFire(item))
                    renderAttachmentAmmo(f, gripAttachment, model, gripAttachment.getPaintjob(gripItemStack.getItemDamage()), gunType.getPaintjob(item.getItemDamage()));
            }
            GL11.glPopMatrix();

            //----------------------------------------------------------------------------------------------------------渲染弹壳
            //Render casing ejection
            if (rtype == ItemRenderType.EQUIPPED_FIRST_PERSON && FlansMod.casingEnable && gunType.casingModel != null && !gunType.getSecondaryFire(item)) {
                ModelCasing casing = gunType.casingModel;
                GL11.glPushMatrix();
                {
                    float casingProg = (animations.lastCasingStage + (animations.casingStage - animations.lastCasingStage) * smoothing) / model.casingAnimTime;
                    if (casingProg >= 1)
                        casingProg = 0;
                    float moveX = model.casingAnimDistance.x + (animations.casingRandom.x * model.casingAnimSpread.x);
                    float moveY = model.casingAnimDistance.y + (animations.casingRandom.y * model.casingAnimSpread.y);
                    float moveZ = model.casingAnimDistance.z + (animations.casingRandom.z * model.casingAnimSpread.z);
                    GL11.glScalef(model.caseScale, model.caseScale, model.caseScale);
                    GL11.glTranslatef(model.casingAttachPoint.x + (casingProg * moveX), model.casingAttachPoint.y + (casingProg * moveY), model.casingAttachPoint.z + (casingProg * moveZ));
                    GL11.glRotatef(casingProg * 180, model.casingRotateVector.x, model.casingRotateVector.y, model.casingRotateVector.z);
                    renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.casingTexture));
                    casing.renderCasing(f);
                    renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(gunType.getPaintjob(item.getItemDamage())));
                }
                GL11.glPopMatrix();
            }
        }
        GL11.glPopMatrix();

        // Render attachment models
        renderAttachments(item, gunType, f, model, animations, reloadRotate, rtype);
        // Release
        GL11.glPopMatrix();
    }

    private void renderAttachments(ItemStack item, GunType gunType, float f, ModelGun model, GunAnimations animations, float reloadRotate, ItemRenderType rtype) {

        // Get all the attachments that we may need to render
        AttachmentType scopeAttachment = gunType.getScope(item);
        AttachmentType barrelAttachment = gunType.getBarrel(item);
        AttachmentType stockAttachment = gunType.getStock(item);
        AttachmentType gripAttachment = gunType.getGrip(item);
        AttachmentType gadgetAttachment = gunType.getGadget(item);
        AttachmentType slideAttachment = gunType.getSlide(item);
        AttachmentType pumpAttachment = gunType.getPump(item);
        AttachmentType accessoryAttachment = gunType.getAccessory(item);

        ItemStack scopeItemStack = gunType.getScopeItemStack(item);
        ItemStack barrelItemStack = gunType.getBarrelItemStack(item);
        ItemStack stockItemStack = gunType.getStockItemStack(item);
        ItemStack gripItemStack = gunType.getGripItemStack(item);
        ItemStack gadgetItemStack = gunType.getGadgetItemStack(item);
        ItemStack slideItemStack = gunType.getSlideItemStack(item);
        ItemStack pumpItemStack = gunType.getPumpItemStack(item);
        ItemStack accessoryItemStack = gunType.getAccessoryItemStack(item);

        // Render static attachments
        // Scope
        if (scopeAttachment != null) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(scopeAttachment, scopeItemStack, model.scopeAttachPoint, gunType, f);

                //TODO
                if (model.scopeIsOnBreakAction && animations.reloading) {
                    if (gunType.useGLTFAnimation) {
                        if(animations.tacticalReload && gunType.useTacticalReloadAnimation){
                            GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.BREAK_ACTION, gunType.tacticalReloadGLTFAnimation,
                                    "tacreload",
                                    false, gunType.modelScale,
                                    new Vector3f(model.barrelBreakPoint.x - model.scopeAttachPoint.x + 2,
                                            model.barrelBreakPoint.y - model.scopeAttachPoint.y,
                                            model.barrelBreakPoint.z - model.scopeAttachPoint.z));
                        } else {
                            GLTFAnimationController.playAnimation(effectiveReloadAnimationProgress, EnumAnimationPart.BREAK_ACTION, gunType.gLTFAnimation,
                                    "reload",
                                    false, gunType.modelScale,
                                    new Vector3f(model.barrelBreakPoint.x - model.scopeAttachPoint.x + 2,
                                            model.barrelBreakPoint.y - model.scopeAttachPoint.y,
                                            model.barrelBreakPoint.z - model.scopeAttachPoint.z));
                        }
                    } else {
                        GL11.glTranslatef(
                                model.barrelBreakPoint.x - model.scopeAttachPoint.x + 2,
                                model.barrelBreakPoint.y - model.scopeAttachPoint.y,
                                model.barrelBreakPoint.z - model.scopeAttachPoint.z
                        );
                        GL11.glRotatef(reloadRotate * -model.breakAngle, 0F, 0F, 1F);
                        GL11.glTranslatef(
                                -model.barrelBreakPoint.x + model.scopeAttachPoint.x - 2,
                                -model.barrelBreakPoint.y + model.scopeAttachPoint.y,
                                -model.barrelBreakPoint.z + model.scopeAttachPoint.z
                        );
                    }
                }
                if (model.scopeIsOnSlide)
                    GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
                postRenderAttachment(scopeAttachment, scopeItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }

        // Grip
        if (gripAttachment != null) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(gripAttachment, gripItemStack, model.gripAttachPoint, gunType, f);
                if (model.gripIsOnPump)
                    GL11.glTranslatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
                postRenderAttachment(gripAttachment, gripItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }

        // Barrel
        if (barrelAttachment != null) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(barrelAttachment, barrelItemStack, model.barrelAttachPoint, gunType, f);
                postRenderAttachment(barrelAttachment, barrelItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }

        // Stock
        if (stockAttachment != null) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(stockAttachment, stockItemStack, model.stockAttachPoint, gunType, f);
                postRenderAttachment(stockAttachment, stockItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }

        // Slide
        if (slideAttachment != null && !gunType.getSecondaryFire(item)) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(slideAttachment, slideItemStack, model.slideAttachPoint, gunType, f);
                GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
                postRenderAttachment(slideAttachment, slideItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }

        // Gadget
        if (gadgetAttachment != null) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(gadgetAttachment, gadgetItemStack, model.gadgetAttachPoint, gunType, f);
                if (model.gadgetIsOnPump)
                    GL11.glTranslatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
                postRenderAttachment(gadgetAttachment, gadgetItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }

        // Accessory
        if (accessoryAttachment != null) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(accessoryAttachment, accessoryItemStack, model.accessoryAttachPoint, gunType, f);
                postRenderAttachment(accessoryAttachment, accessoryItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }

        // Pump
        if (pumpAttachment != null) {
            GL11.glPushMatrix();
            {
                preRenderAttachment(pumpAttachment, pumpItemStack, model.pumpAttachPoint, gunType, f);
                GL11.glTranslatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
                postRenderAttachment(pumpAttachment, pumpItemStack, f, rtype);
            }
            GL11.glPopMatrix();
        }
    }

    /**
     * Clean up some redundant code
     */
    private void preRenderAttachment(AttachmentType attachment, ItemStack stack, Vector3f model, GunType type, float f) {
        Paintjob paintjob = attachment.getPaintjob(stack.getItemDamage());
        renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(paintjob));
        GL11.glTranslatef(model.x * type.modelScale, model.y * type.modelScale, model.z * type.modelScale);
        GL11.glScalef(attachment.modelScale, attachment.modelScale, attachment.modelScale);
    }

    private void postRenderAttachment(AttachmentType attachment, ItemStack stack, float f, ItemRenderType type) {
        if (type == ItemRenderType.EQUIPPED) {
            return;
        }

        Paintjob paintjob = attachment.getPaintjob(stack.getItemDamage());
        ModelAttachment model = attachment.model;
        if (model != null) {
            if(zoomProgress > 0.8F) {
                model.renderZDepthModel(f);
                model.renderAttachment(f);
            } else {
                model.renderAttachment(f);
                model.renderZDepthModel(f);
            }
        }

        renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(paintjob));
    }

    /**
     * Load the attachment ammo model plus its texture
     */
    private void renderAttachmentAmmo(float f, AttachmentType grip, ModelGun model, Paintjob ammo, Paintjob otherAmmo) {
        renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(ammo));
        GL11.glTranslatef(model.gripAttachPoint.x, model.gripAttachPoint.y, model.gripAttachPoint.z);
        grip.model.renderAttachmentAmmo(f);
        renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(otherAmmo));
    }

    /** Load the corresponding casing model and texture */
//	private void renderCasingModel(float f, AttachmentType grip, GunType gun, ItemStack gunStack)
//	{

//	}

    /**
     * Load the corresponding flash model and texture
     */
//	private void renderFlashModel()
//	{
//
//	}
    private void renderArms(EntityPlayer player, ModelGun model, GunType type, GunAnimations anim) {

    }

    private void renderFirstPersonArm(EntityPlayer player, ModelGun model, GunType gunType, GunAnimations anim) {
        Minecraft mc = Minecraft.getMinecraft();
        ModelBiped modelBipedMain = new ModelBiped(0.0F);
        mc.renderEngine.bindTexture(mc.thePlayer.getLocationSkin());

        float f = 1.0F;
        GL11.glColor3f(f, f, f);
        modelBipedMain.onGround = 0.0F;

        //Render right arm
        GL11.glPushMatrix();
        {
            if(anim.reloading && gunType.useRightArmGLTFAnimation){
                if(anim.tacticalReload && gunType.useTacticalReloadAnimation){
                    RenderArms.renderGLTFRightArmReload(model.rightArmPos, model.rightArmRot, effectiveReloadAnimationProgress, gunType.tacticalReloadGLTFAnimation, "tacreload");
                } else RenderArms.renderGLTFRightArmReload(model.rightArmPos, model.rightArmRot, effectiveReloadAnimationProgress, gunType.gLTFAnimation, "reload");
            }
            else if (!anim.reloading && model.righthandPump) {
                RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
            } else if (anim.charged < 0.9 && model.leftHandAmmo && model.rightHandCharge && anim.charged != -1.0F) {
                RenderArms.renderArmCharge(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
            } else if (anim.pumped < 0.9 && model.rightHandBolt && model.leftHandAmmo) {
                RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
            } else if (!anim.reloading && !model.righthandPump) {
                if(gunType.useRightArmGLTFAnimation){
                    RenderArms.renderGLTFRightArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
                } else {
                    RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
                }
            } else {
                RenderArms.renderArmReload(model, anim, smoothing, model.rightArmReloadRot, model.rightArmReloadPos);
            }

            GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
            modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
            modelBipedMain.bipedRightArm.offsetY = 0F;
            if (!model.rightHandAmmo) {
                modelBipedMain.bipedRightArm.render(0.0625F);
            }
        }
        GL11.glPopMatrix();

        //Render left arm
        GL11.glPushMatrix();
        {
            if(anim.reloading && gunType.useLeftArmGLTFAnimation){
                if(anim.tacticalReload && gunType.useTacticalReloadAnimation){
                    RenderArms.renderGLTFLeftArmReload(model.leftArmPos, model.leftArmRot, effectiveReloadAnimationProgress, gunType.tacticalReloadGLTFAnimation, "tacreload");
                } else RenderArms.renderGLTFLeftArmReload(model.leftArmPos, model.leftArmRot, effectiveReloadAnimationProgress, gunType.gLTFAnimation, "reload");
            }
            else if (!anim.reloading && model.lefthandPump) {
                RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
            } else if (anim.charged < 0.9 && model.rightHandCharge && model.leftHandAmmo && anim.charged != -1.0F) {
                RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
            } else if (anim.pumped < 0.9 && model.rightHandBolt && model.leftHandAmmo) {
                RenderArms.renderArmBolt(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
            } else if (!anim.reloading && !model.lefthandPump) {
                if(gunType.useLeftArmGLTFAnimation){
                    RenderArms.renderGLTFLeftArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
                } else {
                    RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
                }
            } else {
                RenderArms.renderArmReload(model, anim, smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
            }

            GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
            modelBipedMain.bipedLeftArm.offsetY = 0F;
            if (!model.leftHandAmmo) {
                modelBipedMain.bipedLeftArm.render(0.0625F);
            }
        }
        GL11.glPopMatrix();
    }

    private void renderAnimArm(EntityPlayer player, ModelGun model, GunType gunType, GunAnimations anim) {
        Minecraft mc = Minecraft.getMinecraft();
        ModelBiped modelBipedMain = new ModelBiped(0.0F);
        mc.renderEngine.bindTexture(mc.thePlayer.getLocationSkin());
        GL11.glPushMatrix();
        GL11.glScalef(1 / gunType.modelScale, 1 / gunType.modelScale, 1 / gunType.modelScale);
        float f = 1.0F;
        GL11.glColor3f(f, f, f);
        modelBipedMain.onGround = 0.0F;
        GL11.glPushMatrix();
        float effectiveReloadAnimationProgress = anim.lastReloadAnimationProgress
                + (anim.reloadAnimationProgress - anim.lastReloadAnimationProgress) * smoothing;

        if(anim.reloading && gunType.useRightArmGLTFAnimation){
            if(anim.tacticalReload && gunType.useTacticalReloadAnimation){
                RenderArms.renderGLTFRightArmReload(model.rightArmPos, model.rightArmRot, effectiveReloadAnimationProgress, gunType.tacticalReloadGLTFAnimation, "tacreload");
            } else RenderArms.renderGLTFRightArmReload(model.rightArmPos, model.rightArmRot, effectiveReloadAnimationProgress, gunType.gLTFAnimation, "reload");
        }
        else if (anim.charged < 0.9 && model.rightHandCharge && model.rightHandAmmo && anim.charged != -1.0F) {
            RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
        } else if (anim.pumped < 0.9 && model.rightHandBolt && model.rightHandAmmo) {
            RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
        } else if (!anim.reloading) {
            if(gunType.useRightArmGLTFAnimation){
                RenderArms.renderGLTFRightArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
            } else {
                RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
            }
        } else {
            RenderArms.renderArmReload(model, anim, smoothing, model.rightArmReloadRot, model.rightArmReloadPos);
        }

        GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
        modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
        modelBipedMain.bipedRightArm.offsetY = 0F;
        if (model.rightHandAmmo) {
            modelBipedMain.bipedRightArm.render(0.0625F);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();

        if(anim.reloading && gunType.useLeftArmGLTFAnimation){
            if(anim.tacticalReload && gunType.useTacticalReloadAnimation){
                RenderArms.renderGLTFLeftArmReload(model.leftArmPos, model.leftArmRot, effectiveReloadAnimationProgress, gunType.tacticalReloadGLTFAnimation, "tacreload");
            } else RenderArms.renderGLTFLeftArmReload(model.leftArmPos, model.leftArmRot, effectiveReloadAnimationProgress, gunType.gLTFAnimation, "reload");
        }
        else if (anim.charged < 0.9 && model.leftHandCharge && model.leftHandAmmo && anim.charged != -1.0F) {
            RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
        } else if (!anim.reloading && model.lefthandPump) {
            RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
        } else if (!anim.reloading) {
            if(gunType.useLeftArmGLTFAnimation){
                RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
            } else {
                RenderArms.renderGLTFLeftArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
            }
        } else if (effectiveReloadAnimationProgress < 0.5 && model.stagedleftArmReloadPos.x != 0) {
            RenderArms.renderArmReload(model, anim, smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
        } else if (effectiveReloadAnimationProgress > 0.5 && model.stagedleftArmReloadPos.x != 0) {
            RenderArms.renderArmReload(model, anim, smoothing, model.stagedleftArmReloadRot, model.stagedleftArmReloadPos);
        } else {
            RenderArms.renderArmReload(model, anim, smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
        }

        GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
        modelBipedMain.bipedLeftArm.offsetY = 0F;
        if (model.leftHandAmmo) {
            modelBipedMain.bipedLeftArm.render(0.0625F);
        }
        GL11.glPopMatrix();

        GL11.glPopMatrix();
    }

    /**
     * Get the end loaded distance, based on ammo type to reload
     */
    private float getEndLoadedDistance(AttachmentType grip, GunType gun, ItemStack gunStack) {
        if (grip != null && gun.getSecondaryFire(gunStack))
            return grip.model.endLoadedAmmoDistance;
        else
            return gun.model.endLoadedAmmoDistance;
    }

    /**
     * Get the number of bullets to reload in animation, based on ammo type to
     * reload
     */

    private float getNumBulletsInReload(GunAnimations animations, AttachmentType grip, GunType gun, ItemStack gunStack) {
        // If this is a singles reload, we want to know the number of bullets already in the gun
        if (animations.singlesReload) {
            return animations.reloadAmmoCount;
        } else {
            return gun.model.numBulletsInReloadAnimation;

        }
		/*if (grip != null && gun.getSecondaryFire(gunStack))
			return grip.model.numBulletsInReloadAnimation;
		else
			return gun.model.numBulletsInReloadAnimation;*/
    }

    /**
     * Get the recoil distance, based on ammo type to reload
     */
    private float getRecoilDistance(AttachmentType grip, GunType gun, ItemStack gunStack) {
        if (grip != null && gun.getSecondaryFire(gunStack))
            return grip.model.recoilDistance;
        else
            return gun.getRecoilDistance(gunStack);
    }

    private float getRecoilDistanceHipFire(GunType gun, ItemStack gunStack) {
        return gun.getRecoilDistanceHipFire(gunStack);
    }

    /**
     * Get the recoil angle, based on ammo type to reload
     */
    private float getRecoilAngle(AttachmentType grip, GunType gun, ItemStack gunStack) {
        if (grip != null && gun.getSecondaryFire(gunStack))
            return grip.model.recoilAngle;
        else
            return gun.getRecoilAngle(gunStack);
    }

    private float getRecoilShakeDistance(GunType gun, ItemStack gunStack) {
        return gun.getShakeDistance(gunStack);
    }

    private float getRandomFloat(float min, float max) {
        return min + rand.nextFloat() * (max - min);
    }
}
