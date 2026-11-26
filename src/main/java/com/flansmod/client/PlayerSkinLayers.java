package com.flansmod.client;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@SideOnly(Side.CLIENT)
public final class PlayerSkinLayers {
    private final List<ModelRenderer> hidden = new ArrayList<>(6);

    static void register() {
        PlayerSkinLayers layers = new PlayerSkinLayers();
        MinecraftForge.EVENT_BUS.register(layers);
        FMLCommonHandler.instance().bus().register(layers);
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void beforePlayer(RenderPlayerEvent.Pre event) {
        // The same models are shared by other players and the inventory preview.
        restore();
        EntityPlayer player = event.entityPlayer;
        ModelBiped model = event.renderer.modelBipedMain;
        if (player.getCurrentArmor(3) != null) hide(model.bipedHeadwear);
        if (player.getCurrentArmor(2) != null) {
            hide(read(EtFuturum.JACKET, model));
            hide(read(EtFuturum.LEFT_SLEEVE, model));
            hide(read(EtFuturum.RIGHT_SLEEVE, model));
        }
        if (player.getCurrentArmor(1) != null || player.getCurrentArmor(0) != null) {
            hide(read(EtFuturum.LEFT_PANTS, model));
            hide(read(EtFuturum.RIGHT_PANTS, model));
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void afterPlayer(RenderPlayerEvent.Post event) {
        restore();
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void beforeHand(RenderHandEvent event) {
        restore();
        EntityPlayer player = Minecraft.getMinecraft().thePlayer;
        if (player != null && player.getCurrentArmor(2) != null && EtFuturum.RENDERER != null
                && EtFuturum.RENDERER.isInstance(RenderManager.instance.getEntityRenderObject(player))) {
            // EFR selects the local player's model inside the hand draw, after this event.
            hide(read(EtFuturum.RIGHT_SLEEVE, read(EtFuturum.STEVE, null)));
            hide(read(EtFuturum.RIGHT_SLEEVE, read(EtFuturum.ALEX, null)));
        }
    }

    @SubscribeEvent
    public void afterFrame(TickEvent.RenderTickEvent event) {
        if (event.phase == TickEvent.Phase.END) restore();
    }

    private void hide(ModelRenderer layer) {
        if (layer != null && !layer.isHidden) {
            layer.isHidden = true;
            hidden.add(layer);
        }
    }

    private void restore() {
        for (int i = 0; i < hidden.size(); i++) hidden.get(i).isHidden = false;
        hidden.clear();
    }

    private static final class EtFuturum {
        private static final Class<?> MODEL = findClass("client.model.ModelPlayer");
        private static final Class<?> RENDERER = findClass("client.skins.NewRenderPlayer");
        private static final Field JACKET = findField(MODEL, "bipedBodyWear", ModelRenderer.class);
        private static final Field LEFT_SLEEVE = findField(MODEL, "bipedLeftArmwear", ModelRenderer.class);
        private static final Field RIGHT_SLEEVE = findField(MODEL, "bipedRightArmwear", ModelRenderer.class);
        private static final Field LEFT_PANTS = findField(MODEL, "bipedLeftLegwear", ModelRenderer.class);
        private static final Field RIGHT_PANTS = findField(MODEL, "bipedRightLegwear", ModelRenderer.class);
        private static final Field STEVE = findField(RENDERER, "STEVE", ModelBiped.class);
        private static final Field ALEX = findField(RENDERER, "ALEX", ModelBiped.class);

        private static Class<?> findClass(String name) {
            try {
                return Class.forName("ganymedes01.etfuturum." + name, false, PlayerSkinLayers.class.getClassLoader());
            } catch (ClassNotFoundException | SecurityException | LinkageError unavailable) {
                return null;
            }
        }

        private static Field findField(Class<?> owner, String name, Class<?> type) {
            if (owner == null) return null;
            try {
                Field field = owner.getDeclaredField(name);
                if (!type.isAssignableFrom(field.getType())) return null;
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException | SecurityException unavailable) {
                return null;
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> T read(Field field, Object owner) {
        if (field == null || (owner != null && !field.getDeclaringClass().isInstance(owner))) return null;
        try {
            return (T) field.get(owner);
        } catch (IllegalAccessException unavailable) {
            return null;
        }
    }
}
