package com.flansmod.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderUtils {

    /**
     * 渲染实体名称标签
     *
     * @param entity 实体对象
     * @param x 实体的x坐标
     * @param y 实体的y坐标
     * @param z 实体的z坐标
     * @param displayName 显示的标签名称
     * @param distanceThreshold 显示标签的距离阈值
     */
    public static void renderNameTag(Entity entity, double x, double y, double z, String displayName, float distanceThreshold, RenderManager renderManager) {
        if (entity == null || displayName == null || displayName.isEmpty()) return;

        // 获取当前玩家与实体之间的距离
        double distance = entity.getDistanceSqToEntity(Minecraft.getMinecraft().thePlayer);

        // 如果超出渲染范围，直接返回
        if (distance > (double) (distanceThreshold * distanceThreshold)) {
            return;
        }

        FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
        float scale = 1.6F; // 标签大小
        float scaleFactor = 0.016666668F * scale; // 转换为渲染单位

        // 开始渲染名称标签
        GL11.glPushMatrix();
        // 将渲染位置移动到实体位置
        GL11.glTranslatef((float) x, (float) y + entity.height + 0.5F, (float) z);
        // 调整法线方向
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        // 旋转标签以面对玩家
        GL11.glRotatef(-renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        // 缩放标签
        GL11.glScalef(-scaleFactor, -scaleFactor, scaleFactor);

        // 禁用一些 OpenGL 状态以防止干扰
        GL11.glDisable(GL11.GL_LIGHTING); // 禁用光照
        GL11.glDepthMask(false);         // 禁用深度写入
        GL11.glDisable(GL11.GL_DEPTH_TEST); // 禁用深度测试
        GL11.glEnable(GL11.GL_BLEND);    // 启用混合
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA); // 设置混合模式

        // 渲染背景矩形
        int width = fontRenderer.getStringWidth(displayName) / 2;
        GL11.glDisable(GL11.GL_TEXTURE_2D); // 禁用纹理
        GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL); // 启用多边形偏移填充
        GL11.glPolygonOffset(1.0F, -150.0F); // 偏移设置
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.25F); // 背景颜色
        GL11.glVertex3f((float) (-width - 1), -1.0F, 0.0F);
        GL11.glVertex3f((float) (-width - 1), 8.0F, 0.0F);
        GL11.glVertex3f((float) (width + 1), 8.0F, 0.0F);
        GL11.glVertex3f((float) (width + 1), -1.0F, 0.0F);
        GL11.glEnd();
        GL11.glDisable(GL11.GL_POLYGON_OFFSET_FILL); // 禁用多边形偏移
        GL11.glEnable(GL11.GL_TEXTURE_2D); // 恢复纹理

        // 渲染文字
        fontRenderer.drawString(displayName, -width, 0, 553648127); // 阴影文字
        GL11.glEnable(GL11.GL_DEPTH_TEST); // 恢复深度测试
        GL11.glDepthMask(true);            // 恢复深度写入
        fontRenderer.drawString(displayName, -width, 0, -1); // 正常文字

        // 恢复 OpenGL 状态
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix(); // 恢复矩阵状态
    }




    /**
     * 渲染实体头上方的贴图
     *
     * @param entity 实体对象
     * @param x 实体的x坐标
     * @param y 实体的y坐标
     * @param z 实体的z坐标
     * @param texture 贴图的资源位置
     * @param scale 贴图的大小
     * @param renderManager 渲染管理器
     */
    public static void renderTextureAboveHead(Entity entity, double x, double y, double z, ResourceLocation texture, float scale, RenderManager renderManager) {
        if (entity == null || texture == null) return;

        TextureManager textureManager = Minecraft.getMinecraft().getTextureManager();

        // 开始渲染贴图
        GL11.glPushMatrix();
        // 将渲染位置移动到实体位置（稍微向上偏移）
        GL11.glTranslatef((float) x, (float) y + entity.height + 0.5F, (float) z);

        // 旋转贴图以面对玩家
        GL11.glRotatef(-renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(renderManager.playerViewX, 1.0F, 0.0F, 0.0F);

        // 缩放贴图
        GL11.glScalef(-scale, -scale, scale);

        // 禁用光照，开启混合
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA); // 设置混合模式

        // 渲染贴图
        textureManager.bindTexture(texture);

        // 渲染一个矩形，贴图将会绘制在矩形上
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0, 0); GL11.glVertex3f(-0.5F, 0, 0);
        GL11.glTexCoord2f(1, 0); GL11.glVertex3f(0.5F, 0, 0);
        GL11.glTexCoord2f(1, 1); GL11.glVertex3f(0.5F, 1, 0);
        GL11.glTexCoord2f(0, 1); GL11.glVertex3f(-0.5F, 1, 0);
        GL11.glEnd();

        // 恢复 OpenGL 状态
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_LIGHTING);

        GL11.glPopMatrix(); // 恢复矩阵状态
    }
}
