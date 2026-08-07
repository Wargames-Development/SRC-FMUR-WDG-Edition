package com.flansmod.common.guns.item;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityChemLight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/** A non-explosive, grenade-style throwable chemlight. */
public class ItemChemLight extends Item {
    private static final int THROW_DELAY_TICKS = 10;

    public enum Color {
        RED("red"),
        BLUE("blue"),
        GREEN("green");

        private final String resourceName;

        Color(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getResourceName() {
            return resourceName;
        }

        public static Color fromOrdinal(int ordinal) {
            Color[] values = values();
            return ordinal >= 0 && ordinal < values.length ? values[ordinal] : GREEN;
        }
    }

    private final Color color;

    public ItemChemLight(Color color) {
        this.color = color;
        setUnlocalizedName("chemLight" + capitalize(color.getResourceName()));
        setTextureName(FlansMod.MODID + ":chemlight_" + color.getResourceName());
        setCreativeTab(FlansMod.tabFlanGuns);
        setMaxStackSize(16);
    }

    public Color getChemLightColor() {
        return color;
    }

    public ResourceLocation getModelTexture() {
        return new ResourceLocation(FlansMod.MODID,
                "textures/models/chemlight/chemlight_" + color.getResourceName() + ".png");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (player.ridingEntity != null) {
            return stack;
        }

        PlayerData data = PlayerHandler.getPlayerData(player,
                world.isRemote ? Side.CLIENT : Side.SERVER);
        if (data == null || data.shootTimeRight > 0 || data.shootTimeLeft > 0) {
            return stack;
        }

        data.shootTimeRight = THROW_DELAY_TICKS;
        world.playSoundAtEntity(player, "random.bow", 0.45F,
                0.85F + world.rand.nextFloat() * 0.1F);
        if (!world.isRemote) {
            world.spawnEntityInWorld(new EntityChemLight(world, player, color));
        }
        if (!player.capabilities.isCreativeMode) {
            stack.stackSize--;
        }
        return stack;
    }

    @Override
    public boolean isFull3D() {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icons) {
        itemIcon = icons.registerIcon(FlansMod.MODID + ":chemlight_" + color.getResourceName());
    }

    private static String capitalize(String value) {
        return Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }
}
