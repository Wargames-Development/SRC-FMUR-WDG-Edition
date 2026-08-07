package com.flansmod.common.teams;

import com.flansmod.client.model.ModelNightVisionGoggles;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

/**
 * Self-contained GPNVG test item. It deliberately occupies the boots slot so it
 * can be worn alongside content-pack helmets without changing their definitions.
 */
public class ItemNightVisionGoggles extends ItemArmor {
    public static final String TAG_LOWERED = "GPNVGLowered";
    public static final String TAG_LAST_TOGGLE_TICK = "GPNVGLastToggleTick";
    public static final long TOGGLE_COOLDOWN_TICKS = 40L;

    @SideOnly(Side.CLIENT)
    private ModelBiped armorModel;

    public ItemNightVisionGoggles() {
        super(ItemTeamArmour.armorMat, 0, 3);
        setUnlocalizedName("gpnvg");
        setTextureName(FlansMod.MODID + ":gpnvg");
        setCreativeTab(FlansMod.tabFlanTeams);
        setMaxStackSize(1);
    }

    public static boolean isLowered(ItemStack stack) {
        return stack != null
                && stack.getItem() instanceof ItemNightVisionGoggles
                && stack.hasTagCompound()
                && stack.getTagCompound().getBoolean(TAG_LOWERED);
    }

    public static void setLowered(ItemStack stack, boolean lowered) {
        if (stack == null || !(stack.getItem() instanceof ItemNightVisionGoggles)) {
            return;
        }
        if (!stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
        }
        stack.getTagCompound().setBoolean(TAG_LOWERED, lowered);
    }

    public static boolean canToggle(ItemStack stack, long worldTime) {
        if (stack == null || !stack.hasTagCompound()
                || !stack.getTagCompound().hasKey(TAG_LAST_TOGGLE_TICK)) {
            return true;
        }
        long lastToggle = stack.getTagCompound().getLong(TAG_LAST_TOGGLE_TICK);
        return worldTime < lastToggle || worldTime - lastToggle >= TOGGLE_COOLDOWN_TICKS;
    }

    public static void markToggled(ItemStack stack, long worldTime) {
        if (!stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
        }
        stack.getTagCompound().setLong(TAG_LAST_TOGGLE_TICK, worldTime);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
        return FlansMod.MODID + ":armor/GPNVG_1.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entity, ItemStack stack, int armorSlot) {
        if (armorModel == null) {
            armorModel = new ModelNightVisionGoggles();
        }
        return armorModel;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(FlansMod.MODID + ":gpnvg");
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advanced) {
        lines.add(EnumChatFormatting.DARK_GREEN + "Quad-tube night vision");
        lines.add(EnumChatFormatting.DARK_GRAY + "Use N to lower NVG");
    }
}
