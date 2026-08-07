package com.flansmod.client;

import com.flansmod.common.teams.ItemNightVisionGoggles;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.Map;
import java.util.WeakHashMap;

/** Client interpolation state shared by the armor renderer for all visible players. */
@SideOnly(Side.CLIENT)
public final class NightVisionGogglesAnimation {
    private static final float STEP_PER_TICK = 0.2F;
    private static final Map<EntityLivingBase, State> STATES = new WeakHashMap<>();

    private NightVisionGogglesAnimation() {
    }

    public static void tick(Minecraft minecraft) {
        if (minecraft.theWorld == null) {
            STATES.clear();
            return;
        }

        for (Object object : minecraft.theWorld.playerEntities) {
            EntityPlayer player = (EntityPlayer) object;
            boolean lowered = isWearingLoweredGoggles(player);
            State state = STATES.get(player);
            if (state == null) {
                STATES.put(player, new State(lowered ? 1F : 0F));
                continue;
            }

            state.previous = state.current;
            float target = lowered ? 1F : 0F;
            if (state.current < target) {
                state.current = Math.min(target, state.current + STEP_PER_TICK);
            } else if (state.current > target) {
                state.current = Math.max(target, state.current - STEP_PER_TICK);
            }
        }
    }

    public static float getLoweredProgress(EntityLivingBase entity, float partialTicks) {
        State state = STATES.get(entity);
        if (state == null) {
            state = new State(isWearingLoweredGoggles(entity) ? 1F : 0F);
            STATES.put(entity, state);
        }
        float partial = Math.max(0F, Math.min(1F, partialTicks));
        return state.previous + (state.current - state.previous) * partial;
    }

    private static boolean isWearingLoweredGoggles(EntityLivingBase entity) {
        ItemStack boots = entity.getEquipmentInSlot(1);
        return ItemNightVisionGoggles.isLowered(boots);
    }

    private static final class State {
        private float previous;
        private float current;

        private State(float initial) {
            previous = initial;
            current = initial;
        }
    }
}
