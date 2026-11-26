package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.BFMCpack.ModelNokia;
import com.flansmod.common.tools.ItemTool;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderNokia implements IItemRenderer {
    private static final String NUMBER = "5550148";
    private static final int FIRST_KEY_TICK = 16;
    private static final int KEY_INTERVAL = 8;
    private static final int CALL_KEY_TICK = ItemTool.NOKIA_RING_START - 4;
    private static final float SIZE = 0.26F;

    @Override
    public boolean handleRenderType(ItemStack stack, ItemRenderType type) {
        return stack != null && stack.getItem() instanceof ItemTool
                && ((ItemTool) stack.getItem()).type.model instanceof ModelNokia
                && (type == ItemRenderType.EQUIPPED_FIRST_PERSON || type == ItemRenderType.EQUIPPED);
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack stack, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
        Minecraft mc = Minecraft.getMinecraft();
        ItemTool tool = (ItemTool) stack.getItem();
        ModelNokia model = (ModelNokia) tool.type.model;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        try {
            if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
                renderFirstPerson(mc, stack, tool, model);
            } else {
                GL11.glRotatef(35F, 0F, 0F, 1F);
                GL11.glTranslatef(0.72F, -0.06F, -0.08F);
                GL11.glRotatef(75F, 0F, 1F, 0F);
                mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(tool.type));
                GL11.glColor4f(1F, 1F, 1F, 1F);
                model.renderKeyPress(-1, 0F, SIZE);
            }
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }

    private static void renderFirstPerson(Minecraft mc, ItemStack stack, ItemTool tool, ModelNokia model) {
        EntityPlayer player = mc.thePlayer;
        float elapsed = player.getItemInUse() == stack
                ? player.getItemInUseDuration() + RenderGun.smoothing : 0F;
        float raised = smooth(elapsed / 12F) * smooth((ItemTool.NOKIA_CALL_TICKS - elapsed) / 12F);
        GL11.glLoadIdentity();
        FirstPersonHands.applyViewBobbing(player, RenderGun.smoothing);
        GL11.glTranslatef(0.33F - 0.23F * raised, -0.35F + 0.18F * raised, -1F + 0.20F * raised);
        GL11.glRotatef(-30F + 24F * raised, 0F, 1F, 0F);
        GL11.glRotatef(-17F + 9F * raised, 1F, 0F, 0F);
        FirstPersonHands.render(player, true, 0.10F, -0.065F, -0.135F, -45F, 21F);

        int index = MathHelper.clamp_int(MathHelper.floor_float((elapsed - FIRST_KEY_TICK + 4F) / KEY_INTERVAL),
                0, NUMBER.length() - 1);
        boolean calling = elapsed >= CALL_KEY_TICK - 5F;
        int key = calling ? ModelNokia.CALL_KEY : NUMBER.charAt(index) - '0';
        int previous = NUMBER.charAt(calling ? NUMBER.length() - 1 : Math.max(0, index - 1)) - '0';
        int strikeTick = calling ? CALL_KEY_TICK : FIRST_KEY_TICK + index * KEY_INTERVAL;
        float tap = smooth(1F - Math.abs(elapsed - strikeTick) / 3F);
        float reach = smooth((elapsed - strikeTick + 4F) / 3F);
        float handUp = smooth((elapsed - 5F) / 8F) * smooth((88F - elapsed) / 9F);
        if (handUp > 0F) {
            float x = SIZE * (keyX(previous) + (keyX(key) - keyX(previous)) * reach);
            float y = SIZE * (keyY(previous) + (keyY(key) - keyY(previous)) * reach);
            FirstPersonHands.render(player, false, x - 0.106F - 0.22F * (1F - handUp),
                    y - 0.098F - 0.24F * (1F - handUp), 0.090F - 0.042F * tap, -38F, -30F);
        }

        mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(tool.type));
        GL11.glColor4f(1F, 1F, 1F, 1F);
        GL11.glPushMatrix();
        try {
            GL11.glRotatef(90F, 0F, 1F, 0F);
            model.renderKeyPress(key, tap, SIZE);
        } finally { GL11.glPopMatrix(); }

        int dialed = MathHelper.clamp_int(MathHelper.floor_float((elapsed - FIRST_KEY_TICK) / KEY_INTERVAL) + 1,
                0, NUMBER.length());
        if (dialed > 0) {
            drawScreenLine(mc.fontRenderer, NUMBER.substring(0, dialed), 1.11F);
            if (elapsed >= ItemTool.NOKIA_RING_START)
                drawScreenLine(mc.fontRenderer, "CALL...", 0.99F);
        }
    }

    private static float keyX(int key) {
        if (key == ModelNokia.CALL_KEY) return -0.08F;
        return key == 0 ? 0F : ((key - 1) % 3 - 1) * 0.1875F;
    }

    private static float keyY(int key) {
        if (key == ModelNokia.CALL_KEY) return 0.75F;
        return key == 0 ? 0.09375F : 0.5625F - ((key - 1) / 3) * 0.15625F;
    }

    private static void drawScreenLine(FontRenderer font, String line, float y) {
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glPushMatrix();
        try {
            GL11.glTranslatef(0F, y * SIZE, 0.141F * SIZE);
            GL11.glScalef(0.009F * SIZE, -0.009F * SIZE, SIZE);
            font.drawString(line, -font.getStringWidth(line) / 2, 0, 0x243329);
        } finally { GL11.glPopMatrix(); }
    }

    private static float smooth(float progress) {
        float t = MathHelper.clamp_float(progress, 0F, 1F);
        return t * t * (3F - 2F * t);
    }

    public static void playRingtone(EntityPlayer player, ItemStack stack) {
        Minecraft.getMinecraft().getSoundHandler().playSound(new Ringtone(player, stack));
    }

    private static final class Ringtone extends MovingSound {
        private final EntityPlayer player;
        private final ItemStack stack;

        private Ringtone(EntityPlayer player, ItemStack stack) {
            super(new ResourceLocation("flansmod", "nokia_ringtone"));
            this.player = player;
            this.stack = stack;
            field_147666_i = AttenuationType.NONE;
        }

        @Override
        public void update() {
            Minecraft mc = Minecraft.getMinecraft();
            donePlaying = mc.thePlayer != player || mc.theWorld != player.worldObj || !player.isEntityAlive()
                    || player.ridingEntity != null || player.getHeldItem() != stack || player.getItemInUse() != stack;
        }
    }
}
