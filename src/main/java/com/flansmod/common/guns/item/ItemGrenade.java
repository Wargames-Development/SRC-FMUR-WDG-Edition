package com.flansmod.common.guns.item;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.type.GrenadeType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ItemGrenade extends ItemShootable implements IFlanItem
{
	public GrenadeType type;
	
	public ItemGrenade(GrenadeType t) 
	{
		super(t);
		type = t;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanGuns);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b) {
		if (FlansMod.showItemDescriptions) {
			KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;

			if (!type.packName.isEmpty()) {
				lines.add("\u00a7o" + type.packName);
			}
			if (type.description != null) {
				Collections.addAll(lines, type.description.split("_"));
			}
			//Reveal all the bullet stats when holding down the sneak key
			if (!GameSettings.isKeyDown(shift)) {
				lines.add("按住 \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode())
						+ "\u00a7r\u00a77 查看更多数据");
			} else {
				lines.add("");
				lines.add("\u00a79基础伤害倍率" + "\u00a77: " + roundFloat(type.damageVsLiving, 2));
				lines.add("\u00a79近战伤害" + "\u00a77: " + roundFloat(type.meleeDamage, 2));
				if(type.fuse > 0) {
					lines.add("\u00a79引信延时" + "\u00a77: " + type.fuse / 20 + "s");
				}
				lines.add("\u00a79弹性系数" + "\u00a77: " + roundFloat(type.bounciness, 2));
				if (type.explosionRadius > 0) {
					lines.add("\u00a79爆炸范围" + "\u00a77: " + roundFloat(type.explosionRadius, 2) + "m");
					lines.add("\u00a79方块破坏力" + "\u00a77: " + roundFloat(type.explosionPower, 2));
				}
				if(type.canBeDestructByAPS) {
					lines.add("\u00a7c被主动防御识别");
				}
				if(type.sticky) {
					lines.add("\u00a7c粘性炸弹");
				}
				if(type.remote) {
					lines.add("\u00a7c远程引爆");
				}
				if(type.motionSensor) {
					lines.add("\u00a7c传感器");
					lines.add("\u00a79传感范围" + "\u00a77: " + roundFloat(type.motionSensorRange, 2) + "m");
					lines.add("\u00a79传感间隔" + "\u00a77: " + type.motionSensorDelay / 20 + "s");
				}
				if(type.flashBang && type.flashDamage > 0) {
					lines.add("\u00a7c震爆弹");
					lines.add("\u00a79震爆范围" + "\u00a77: " + roundFloat(type.flashRange, 2) + "m");
					lines.add("\u00a79震爆时间" + "\u00a77: " + type.flashTime / 20 + "s");
				}
				if(type.isMedicBag) {
					lines.add("\u00a7c医疗箱");
					lines.add("\u00a79医疗范围" + "\u00a77: " + roundFloat(type.medicBagRadius, 2) + "m");
				}
				if(type.isAmmoBag) {
					lines.add("\u00a7c补给箱");
					lines.add("\u00a79补给范围" + "\u00a77: " + roundFloat(type.ammoBagRadius, 2) + "m");
					lines.add("\u00a79补给数量" + "\u00a77: " + type.ammoBagUseNum + "*" + type.ammoBagSupplyAmount);
				}
				lines.add("");
			}
		} else {
			if (!type.packName.isEmpty()) {
				lines.add(type.packName);
			}
			if (type.description != null) {
				Collections.addAll(lines, type.description.split("_"));
			}
		}

	}
	
	@Override
    public Multimap getAttributeModifiers(ItemStack stack)
    {
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", type.meleeDamage, 0));
        return multimap;
    }

	@Override
	public boolean isFull3D()
	{
		return true;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		return type.meleeDamage == 0;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		if(player.ridingEntity != null) {
			return stack;
		}
		PlayerData data = PlayerHandler.getPlayerData(player, world.isRemote ? Side.CLIENT : Side.SERVER);
		//If can throw grenade
		if(type.canThrow && data != null && data.shootTimeRight <= 0 && data.shootTimeLeft <= 0)
		{
			//Delay the next throw / weapon fire / whatnot
			data.shootTimeRight = type.throwDelay;
			//Create a new grenade entity
			EntityGrenade grenade = new EntityGrenade(world, type, player);
			//Spawn the entity server side
			if(!world.isRemote)
				world.spawnEntityInWorld(grenade);
			//If this can be remotely detonated, add it to the players detonate list
			if(type.remote)
				data.remoteExplosives.add(grenade);
			//Consume an item
			if(!player.capabilities.isCreativeMode)
				stack.stackSize--;
			//Drop an item upon throwing if necessary
			if(type.dropItemOnThrow != null)
			{
				String itemName = type.dropItemOnDetonate;
				int damage = 0;
				if (itemName.contains("."))
				{
					damage = Integer.parseInt(itemName.split("\\.")[1]);
					itemName = itemName.split("\\.")[0];
				}
				ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
				world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, dropStack));
			}
		}
		return stack;
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
	@Override
	public InfoType getInfoType() 
	{
		return type;
	}

	@Override
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
                                     float pitch, double motionX, double motionY, double motionZ,
                                     EntityLivingBase shooter, float gunDamage, int itemDamage,
                                     InfoType shotFrom) {

		return null;
	}

	@Override
	public EntityShootable getEntity(World worldObj, Vector3f origin,
			Vector3f direction, EntityLivingBase thrower, float spread,
			float damage, float speed, int itemDamage, InfoType shotFrom)
	{
		return getGrenade(worldObj, thrower);
	}

	@Override
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
			float pitch, EntityLivingBase shooter, float spread, float damage, float speed,
			int itemDamage, InfoType shotFrom) {

		return null;
	}

	@Override
	public EntityShootable getEntity(World worldObj, EntityLivingBase player,
			 float damage, float bulletSpeed, boolean b,
			int itemDamage, InfoType shotFrom , float pitchSpread, float yawSpread)
	{
		return getGrenade(worldObj, player);
	}
	
	public EntityGrenade getGrenade(World world, EntityLivingBase thrower)
	{
		//Create a new grenade entity
		EntityGrenade grenade = new EntityGrenade(world, type, thrower);
		//If this can be remotely detonated, add it to the players detonate list
		if(type.remote && thrower instanceof EntityPlayer)
			PlayerHandler.getPlayerData((EntityPlayer)thrower).remoteExplosives.add(grenade);
		return grenade;
	}

	public float roundFloat(float value, int points) {
		int pow = 10;
		for (int i = 1; i < points; i++)
			pow *= 10;
		float result = value * pow;

		return (float) (int) ((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
	}
}
