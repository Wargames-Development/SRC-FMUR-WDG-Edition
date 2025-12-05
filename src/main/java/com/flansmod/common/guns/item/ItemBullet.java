package com.flansmod.common.guns.item;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityCLOSMissile;
import com.flansmod.common.guns.type.BulletType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.IGunboxDescriptionable;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Implemented from old source.
 */
public class ItemBullet extends ItemShootable implements IFlanItem, IGunboxDescriptionable {
    public BulletType type;

    public String originGunbox = "";
    
    public String getOriginGunBox() { return originGunbox; }
    public void setOriginGunBox(String e) { originGunbox = e; }

    public ItemBullet(BulletType infoType) {
        super(infoType);
        type = infoType;
        setMaxStackSize(type.maxStackSize);
        setHasSubtypes(true);
        type.item = this;
        switch (type.weaponType) {
            case SHELL:
            case BOMB:
            case MINE:
            case MISSILE:
                setCreativeTab(FlansMod.tabFlanDriveables);
                break;
            default:
                setCreativeTab(FlansMod.tabFlanGuns);
        }
    }

    public boolean isRepairable() {
        return canRepair;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return type.colour;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b) {
        if (type.fancyDescription && FlansMod.showItemDescriptions) {
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
                if (!Objects.equals(originGunbox, "")) {
                    lines.add("\u00a79Box" + "\u00a77: " + originGunbox);
                }
                if(type.roundsPerItem > 1) {
                    lines.add("\u00a79子弹数量" + "\u00a77: " + type.roundsPerItem);
                }
                if (type.numBullets > -1) {
                    lines.add("\u00a79弹丸数量" + "\u00a77: " + type.numBullets);
                }
                lines.add("\u00a79基础伤害倍率" + "\u00a77: " + roundFloat(type.damageVsLiving, 2));
                lines.add("\u00a79击中头部倍率" + "\u00a77: " + roundFloat(type.shootHeadMultiplier, 2));
                lines.add("\u00a79击中手臂倍率" + "\u00a77: " + roundFloat(type.shootArmMultiplier, 2));
                lines.add("\u00a79下坠速度" + "\u00a77: " + roundFloat(type.fallSpeed * 20, 2) + "m/s");
                lines.add("\u00a79空气阻力" + "\u00a77: " + roundFloat(type.dragInAir, 2));
                if (type.enableBulletDecay) {
                    lines.add("\u00a79伤害衰减" + "\u00a77: " + type.bulletDecays.toString());
                } else {
                    lines.add("\u00a79伤害衰减" + "\u00a77: 无");
                }
                if (type.explosionRadius > 0) {
                    lines.add("\u00a79爆炸范围" + "\u00a77: " + roundFloat(type.explosionRadius, 2) + "m");
                    lines.add("\u00a79方块破坏力" + "\u00a77: " + roundFloat(type.explosionPower, 2));
                }
                lines.add("\u00a79穿透能力" + "\u00a77: " + type.penetratingBlockMaxNum);
                if(type.penetratingBlockMaxNum > 0) {
                    lines.add("\u00a79穿透衰减" + "\u00a77: " + type.penetratingDamageLoss);
                }
                if (type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) {
                    if (type.enableSACLOS) {
                        lines.add("\u00a79制导方式" + "\u00a77: " + "半主动制导");
                    } else {
                        lines.add("\u00a79制导方式" + "\u00a77: " + "主动制导");
                    }
                    lines.add("\u00a79导引启动时间" + "\u00a77: " + roundFloat(type.tickStartHoming / 20f, 2) + "s");
                    if(type.tickEndHoming > 0) {
                        lines.add("\u00a79最大导引时长" + "\u00a77: " + roundFloat(type.tickEndHoming / 20f, 2) + "s");
                    }
                } else if (type.enableMCLOS && !type.manualGuidance) {
                    if(type.enableCameraFollow) {
                        lines.add("\u00a79制导方式" + "\u00a77: " + "影像瞄准线指令制导[MCLOS]");
                    } else {
                        lines.add("\u00a79制导方式" + "\u00a77: " + "手动瞄准线指令制导[MCLOS]");
                    }
                    if(type.tickEndHoming > 0) {
                        lines.add("\u00a79最大导引时长" + "\u00a77: " + roundFloat(type.tickEndHoming / 20f, 2) + "s");
                    }
                } else if (type.manualGuidance) {
                    if(type.enableCameraFollow) {
                        lines.add("\u00a79制导方式" + "\u00a77: " + "影像制导[SACLOS]");
                    } else {
                        if(type.hasLine) {
                            lines.add("\u00a79制导方式" + "\u00a77: " + "有线制导[SACLOS]");
                        } else {
                            lines.add("\u00a79制导方式" + "\u00a77: " + "驾束制导[SACLOS]");
                        }
                    }
                    if(type.tickEndHoming > 0) {
                        lines.add("\u00a79最大导引时长" + "\u00a77: " + roundFloat(type.tickEndHoming / 20f, 2) + "s");
                    }
                }

                if(type.enableAirburst) {
                    lines.add("\u00a79空爆范围" + "\u00a77: " + roundFloat(type.airburstDamageRange, 2) + "m");
                    lines.add("\u00a79空爆伤害" + "\u00a77: " + roundFloat(type.airburstDamage, 2));
                }
                lines.add("\u00a79补给数量上限" + "\u00a77: " + type.maxSupplyClips);
                if(type.canBeDestructByAPS) {
                    lines.add("\u00a7c被主动防御识别");
                }
                if(type.setEntitiesOnFire || type.fireRadius > 0F) {
                    lines.add("\u00a7c燃烧弹");
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

    //Can be overriden to allow new types of bullets to be created, for planes
    @Override
    public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
                                     float pitch, double motionX, double motionY, double motionZ,
                                     EntityLivingBase shooter, float gunDamage, int itemDamage, InfoType shotFrom) {
        EntityBullet e;
        if(type.enableMCLOS && shooter instanceof EntityPlayer) {
            e = new EntityCLOSMissile(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom);
            PlayerHandler.getPlayerData((EntityPlayer) shooter).playerControlledBullets.add(e);
        } else {
            e = new EntityBullet(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom);
        }
        return e;
    }

    //Can be overriden to allow new types of bullets to be created, vector constructor
    @Override
    public EntityShootable getEntity(World worldObj, Vector3f origin, Vector3f direction,
                                     EntityLivingBase shooter, float spread,  float damage, float speed, int itemDamage, InfoType shotFrom) {
        EntityBullet e;
        if(type.enableMCLOS && shooter instanceof EntityPlayer) {
            e = new EntityCLOSMissile(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom);
            PlayerHandler.getPlayerData((EntityPlayer) shooter).playerControlledBullets.add(e);
        } else {
            e = new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom);
        }
        return e;
    }

    //Can be overriden to allow new types of bullets to be created, AA/MG constructor
    @Override
    public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
                                     float pitch, EntityLivingBase shooter, float spread, float damage, float speed,
                                     int itemDamage, InfoType shotFrom) {
        EntityBullet e = new EntityBullet(worldObj, origin, yaw, pitch, shooter, damage, this.type, speed, shotFrom, spread, spread);
        if (shooter instanceof EntityPlayer && type.enableMCLOS) {
            PlayerHandler.getPlayerData((EntityPlayer) shooter).playerControlledBullets.add(e);
        }
        return e;
    }


    //Can be overriden to allow new types of bullets to be created, Handheld constructor
    @Override
    public EntityShootable getEntity(World worldObj, EntityLivingBase player,
                                      float damage, float bulletSpeed, boolean b,
                                     int itemDamage, InfoType shotFrom, float pitchSpread, float yawSpread) {
        EntityBullet e;
        if(type.enableMCLOS && player instanceof EntityPlayer) {
            e = new EntityCLOSMissile(worldObj, player,  damage, this.type, bulletSpeed, b, shotFrom, pitchSpread, yawSpread);
            PlayerHandler.getPlayerData((EntityPlayer) player).playerControlledBullets.add(e);
        } else {
            e = new EntityBullet(worldObj, player,  damage, this.type, bulletSpeed, b, shotFrom, pitchSpread, yawSpread);
        }
        return e;
    }

    @Override
    public InfoType getInfoType() {
        return type;
    }
    
    public float roundFloat(float value, int points) {
        int pow = 10;
        for (int i = 1; i < points; i++)
            pow *= 10;
        float result = value * pow;

        return (float) (int) ((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
    }
}