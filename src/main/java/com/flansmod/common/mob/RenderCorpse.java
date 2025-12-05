package com.flansmod.common.mob;

import com.flansmod.utils.RenderUtils;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderCorpse extends Render {

    private static final ModelBiped modelBiped = new CustomModelBiped(); // 玩家模型
    private static final ResourceLocation DEFAULT_SKIN = new ResourceLocation("flansmod", "skins/corpse.png"); // 默认皮肤

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
        // 获取玩家的皮肤
        ResourceLocation skin = getPlayerSkin(entity.getOwner());
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

        modelBiped.bipedHead.rotateAngleX = (float) Math.toRadians(entity.getHeadRotationX());
        modelBiped.bipedHead.rotateAngleY = (float) Math.toRadians(entity.getHeadRotationY());
        modelBiped.bipedHeadwear.rotateAngleX = modelBiped.bipedHead.rotateAngleX; // 同步头饰
        modelBiped.bipedHeadwear.rotateAngleY = modelBiped.bipedHead.rotateAngleY;

        // 设置左臂旋转
        modelBiped.bipedLeftArm.rotateAngleX = (float) Math.toRadians(entity.getLeftArmRotationX());
        modelBiped.bipedLeftArm.rotateAngleY = (float) Math.toRadians(entity.getLeftArmRotationY());
        modelBiped.bipedLeftArm.rotateAngleZ = (float) Math.toRadians(entity.getLeftArmRotationZ()); // 新增 Z 轴旋转

        // 设置右臂旋转
        modelBiped.bipedRightArm.rotateAngleX = (float) Math.toRadians(entity.getRightArmRotationX());
        modelBiped.bipedRightArm.rotateAngleY = (float) Math.toRadians(entity.getRightArmRotationY());
        modelBiped.bipedRightArm.rotateAngleZ = (float) Math.toRadians(entity.getRightArmRotationZ()); // 新增 Z 轴旋转

        // 设置身体旋转
        modelBiped.bipedBody.rotateAngleX = (float) Math.toRadians(entity.getBodyRotationX());
        modelBiped.bipedBody.rotateAngleY = (float) Math.toRadians(entity.getBodyRotationY());

        // 设置左腿旋转
        modelBiped.bipedLeftLeg.rotateAngleX = (float) Math.toRadians(entity.getLeftLegRotationX());
        modelBiped.bipedLeftLeg.rotateAngleY = (float) Math.toRadians(entity.getLeftLegRotationY());
        modelBiped.bipedLeftLeg.rotateAngleZ = (float) Math.toRadians(entity.getLeftLegRotationZ()); // 新增 Z 轴旋转

        // 设置右腿旋转
        modelBiped.bipedRightLeg.rotateAngleX = (float) Math.toRadians(entity.getRightLegRotationX());
        modelBiped.bipedRightLeg.rotateAngleY = (float) Math.toRadians(entity.getRightLegRotationY());
        modelBiped.bipedRightLeg.rotateAngleZ = (float) Math.toRadians(entity.getRightLegRotationZ()); // 新增 Z 轴旋转

        // 渲染模型
        modelBiped.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

        GL11.glPopMatrix();

        if (entity.getPlayerName() != null) {
            RenderUtils.renderNameTag(entity, x, y - 1.5 , z,entity.getPlayerName() + "[倒地]", 16, this.renderManager);
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return DEFAULT_SKIN;
    }

    /**
     * 获取玩家皮肤，如果玩家为 null 或无皮肤，则返回默认皮肤。
     */
    private ResourceLocation getPlayerSkin(EntityPlayer player) {
        return DEFAULT_SKIN;
    }


}
