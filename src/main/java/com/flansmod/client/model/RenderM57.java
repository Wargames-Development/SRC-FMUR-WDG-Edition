package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.tools.ItemTool;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderM57 implements IItemRenderer {
    private long pressedAt;
    private EntityPlayer pressingPlayer;
    private World pressingWorld;
    private int pressingSlot;
    private ItemStack pressingStack;

    public void startPress(EntityPlayer player, ItemStack stack) {
        pressedAt = System.nanoTime();
        pressingPlayer = player;
        pressingWorld = player.worldObj;
        pressingSlot = player.inventory.currentItem;
        pressingStack = stack.copy();
    }

    private float squeeze(EntityPlayer player) {
        if (pressedAt == 0L) return 0F;
        float progress = (System.nanoTime() - pressedAt) / 400000000F;
        if (progress >= 1F || player != pressingPlayer || player.worldObj != pressingWorld
                || !player.isEntityAlive() || player.inventory.currentItem != pressingSlot
                || !ItemStack.areItemStacksEqual(player.getHeldItem(), pressingStack)) {
            pressedAt = 0L;
            pressingPlayer = null;
            pressingWorld = null;
            pressingStack = null;
            return 0F;
        }
        float travel = progress < 0.2F ? progress / 0.2F
                : 1F - Math.max(0F, (progress - 0.45F) / 0.55F);
        return travel * travel * (3F - 2F * travel);
    }

    @Override
    public boolean handleRenderType(ItemStack stack, ItemRenderType type) {
        return stack != null && stack.getItem() instanceof ItemTool
                && ((ItemTool) stack.getItem()).type.model != null
                && (type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON);
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack stack, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
        Minecraft mc = Minecraft.getMinecraft();
        float press = type == ItemRenderType.EQUIPPED_FIRST_PERSON ? squeeze(mc.thePlayer) : 0F;
        ItemTool tool = (ItemTool) stack.getItem();
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        try {
            if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
                GL11.glLoadIdentity();
                FirstPersonHands.applyViewBobbing(mc.thePlayer, RenderGun.smoothing);
                GL11.glTranslatef(0.32F, -0.27F - 0.025F * press, -1F);
                FirstPersonHands.render(mc.thePlayer, true, -0.08F + 0.025F * press, -0.02F, 0.04F,
                        -55F + 6F * press, 15F);
                GL11.glScalef(0.85F, 0.85F, 0.85F);
            } else {
                GL11.glRotatef(35F, 0F, 0F, 1F);
                GL11.glRotatef(-5F, 0F, 1F, 0F);
                GL11.glTranslatef(0.75F, 0.03F, -0.08F);
            }
            mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(tool.type));
            GL11.glColor4f(1F, 1F, 1F, 1F);
            GL11.glRotatef(65F, 0F, 1F, 0F);
            tool.type.model.render(null, 0F, 0F, press, 0F, 0F, 0.0625F);
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }
}
