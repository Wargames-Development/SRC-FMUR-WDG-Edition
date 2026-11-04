package com.flansmod.common.mob;

import com.flansmod.utils.RenderUtils;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ItemTeamArmour;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.entity.RenderBiped;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderCorpse extends Render {

    private static final ModelBiped modelBiped = new CustomModelBiped(); // 玩家模型
    private static final ResourceLocation DEFAULT_SKIN = new ResourceLocation("flansmod", "skins/corpse.png"); // 默认皮肤
    private final Map<EntityCorpse, CorpseSkin> skins = new WeakHashMap<>();
    private final ModelBiped armourOuter = new ModelBiped(1F);
    private final ModelBiped armourLeggings = new ModelBiped(0.5F);

    private static final class CorpseSkin implements SkinManager.SkinAvailableCallback {
        volatile ResourceLocation texture = DEFAULT_SKIN;
        boolean requested;

        @Override
        public void func_152121_a(MinecraftProfileTexture.Type type, ResourceLocation location) {
            if (type == MinecraftProfileTexture.Type.SKIN) texture = location;
        }
    }

    public RenderCorpse() {
        modelBiped.isChild = false;
    }

    @Override
    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
        render((EntityCorpse) entity, d, d1, d2, f, f1);
    }

    public void render(EntityCorpse entity, double x, double y, double z, float f, float f1) {
        if(entity.ticksExisted < 20) {
            return;
        }
        ResourceLocation skin = getPlayerSkin(entity);
        this.bindTexture(skin);

        // 开始渲染
        GL11.glPushMatrix();

        // 平移到尸体的实际位置
        GL11.glTranslated(x, y, z);

        // 模拟尸体倒地（旋转）
        GL11.glRotatef(entity.getBodyRotationY(), 0.0F, 1.0F, 0.0F); // 随机旋转在 Y 轴方向

        // 根据 isDown() 决定渲染逻辑（躺着还是趴着）
        if (entity.isDown()) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F); // 躺着的渲染逻辑
        } else {
            GL11.glRotatef(270.0F, 1.0F, 0.0F, 0.0F); // 趴着的渲染逻辑
        }

        applyPose(modelBiped, entity);

        // 渲染模型
        modelBiped.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        renderArmour(entity, false);
        if (entity.hurtTime > 0) {
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            try {
                GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_LIGHTING);
                GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                GL11.glDepthFunc(GL11.GL_EQUAL); GL11.glDepthMask(false);
                GL11.glColor4f(1F, 0F, 0F, 0.4F);
                modelBiped.render(entity, 0F, 0F, 0F, 0F, 0F, 0.0625F);
                renderArmour(entity, true);
            } finally { GL11.glPopAttrib(); }
        }

        GL11.glPopMatrix();

        if (entity.getPlayerDisplayName() != null) {
            RenderUtils.renderNameTag(entity, x, y - 1.5 , z, entity.getPlayerDisplayName(), 16, this.renderManager);
        }

    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return DEFAULT_SKIN;
    }

    private void renderArmour(EntityCorpse corpse, boolean hurtOverlay) {
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            for (int slot = 0; slot < 4; slot++) {
                ItemStack stack = corpse.getCorpseArmour(slot);
                if (stack == null || !(stack.getItem() instanceof ItemArmor)) continue;
                ItemArmor item = (ItemArmor) stack.getItem();
                if (item.armorType != 3 - slot) continue;
                if (!hurtOverlay) {
                    bindTexture(RenderBiped.getArmorResource(corpse, stack, item.armorType, null));
                    GL11.glColor4f(1F, 1F, 1F, 1F);
                }
                if (item instanceof ItemTeamArmour && ((ItemTeamArmour) item).type.model != null) {
                    ((ItemTeamArmour) item).type.model.render(corpse, 0F, 0F, 0F, 0F, 0F, 0.0625F);
                } else {
                    ModelBiped model = slot == 1 ? armourLeggings : armourOuter;
                    applyPose(model, corpse);
                    int color = item.getColor(stack);
                    if (!hurtOverlay && color != -1) GL11.glColor4f((color >> 16 & 255) / 255F,
                            (color >> 8 & 255) / 255F, (color & 255) / 255F, 1F);
                    renderArmourParts(model, slot);
                    if (!hurtOverlay && color != -1) {
                        bindTexture(RenderBiped.getArmorResource(corpse, stack, item.armorType, "overlay"));
                        GL11.glColor4f(1F, 1F, 1F, 1F);
                        renderArmourParts(model, slot);
                    }
                }
            }
        } finally { GL11.glPopAttrib(); }
    }

    private void renderArmourParts(ModelBiped model, int slot) {
        if (slot == 3) model.bipedHead.render(0.0625F);
        if (slot == 2 || slot == 1) model.bipedBody.render(0.0625F);
        if (slot == 2) {
            model.bipedLeftArm.render(0.0625F);
            model.bipedRightArm.render(0.0625F);
        }
        if (slot <= 1) {
            model.bipedLeftLeg.render(0.0625F);
            model.bipedRightLeg.render(0.0625F);
        }
    }

    public static void applyPose(ModelBiped model, EntityCorpse entity) {
        model.bipedHead.rotateAngleX = (float) Math.toRadians(entity.getHeadRotationX());
        model.bipedHead.rotateAngleY = (float) Math.toRadians(entity.getHeadRotationY());
        model.bipedHeadwear.rotateAngleX = model.bipedHead.rotateAngleX; // 同步头饰
        model.bipedHeadwear.rotateAngleY = model.bipedHead.rotateAngleY;

        // 设置左臂旋转
        model.bipedLeftArm.rotateAngleX = (float) Math.toRadians(entity.getLeftArmRotationX());
        model.bipedLeftArm.rotateAngleY = (float) Math.toRadians(entity.getLeftArmRotationY());
        model.bipedLeftArm.rotateAngleZ = (float) Math.toRadians(entity.getLeftArmRotationZ()); // 新增 Z 轴旋转

        // 设置右臂旋转
        model.bipedRightArm.rotateAngleX = (float) Math.toRadians(entity.getRightArmRotationX());
        model.bipedRightArm.rotateAngleY = (float) Math.toRadians(entity.getRightArmRotationY());
        model.bipedRightArm.rotateAngleZ = (float) Math.toRadians(entity.getRightArmRotationZ()); // 新增 Z 轴旋转

        // 设置身体旋转
        model.bipedBody.rotateAngleX = (float) Math.toRadians(entity.getBodyRotationX());
        // The outer corpse transform already owns body yaw.
        model.bipedBody.rotateAngleY = 0F;

        // 设置左腿旋转
        model.bipedLeftLeg.rotateAngleX = (float) Math.toRadians(entity.getLeftLegRotationX());
        model.bipedLeftLeg.rotateAngleY = (float) Math.toRadians(entity.getLeftLegRotationY());
        model.bipedLeftLeg.rotateAngleZ = (float) Math.toRadians(entity.getLeftLegRotationZ()); // 新增 Z 轴旋转

        // 设置右腿旋转
        model.bipedRightLeg.rotateAngleX = (float) Math.toRadians(entity.getRightLegRotationX());
        model.bipedRightLeg.rotateAngleY = (float) Math.toRadians(entity.getRightLegRotationY());
        model.bipedRightLeg.rotateAngleZ = (float) Math.toRadians(entity.getRightLegRotationZ()); // 新增 Z 轴旋转

    }

    private ResourceLocation getPlayerSkin(EntityCorpse entity) {
        CorpseSkin skin = skins.get(entity);
        if (skin == null) {
            skin = new CorpseSkin();
            skins.put(entity, skin);
        }
        EntityPlayer player = entity.getOwner();
        if (!(player instanceof AbstractClientPlayer) && entity.getPlayerName() != null) {
            player = entity.worldObj.getPlayerEntityByName(entity.getPlayerName());
            if (player != null && entity.getPlayerUuid() != null
                    && !entity.getPlayerUuid().equals(player.getUniqueID())) player = null;
        }
        if (player instanceof AbstractClientPlayer) {
            AbstractClientPlayer clientPlayer = (AbstractClientPlayer) player;
            if (clientPlayer.func_152123_o()) {
                skin.texture = clientPlayer.getLocationSkin();
            }
            return skin.texture;
        }

        if (!skin.requested && skin.texture == DEFAULT_SKIN && entity.getPlayerUuid() != null) {
            skin.requested = true;
            final CorpseSkin target = skin;
            final GameProfile profile = new GameProfile(entity.getPlayerUuid(), entity.getPlayerName());
            final Minecraft minecraft = Minecraft.getMinecraft();
            // A late observer may never have seen the player. Resolve the UUID off
            // the render thread; the username downloader uses a retired skin URL.
            CompletableFuture.runAsync(() -> {
                try {
                    final GameProfile resolved = minecraft.func_152347_ac().fillProfileProperties(profile, true);
                    minecraft.func_152344_a(() -> minecraft.func_152342_ad().func_152790_a(resolved, target, true));
                } catch (RuntimeException failure) {
                    FlansMod.logger.debug("Unable to resolve corpse skin for " + profile.getId(), failure);
                }
            });
        }

        return skin.texture;
    }


}
