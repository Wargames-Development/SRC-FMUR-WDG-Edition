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
                lines.add("Hold \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode())
                        + "\u00a7r\u00a77 to view more stats");
            } else {
                lines.add("");
                if (!Objects.equals(originGunbox, "")) {
                    lines.add("\u00a79Box" + "\u00a77: " + originGunbox);
                }
                if(type.roundsPerItem > 1) {
                    lines.add("\u00a79Rounds per item" + "\u00a77: " + type.roundsPerItem);
                }
                if (type.numBullets > -1) {
                    lines.add("\u00a79Projectiles per shot" + "\u00a77: " + type.numBullets);
                }
                lines.add("\u00a79Base damage multiplier" + "\u00a77: " + roundFloat(type.damageVsLiving, 2));
                lines.add("\u00a79Headshot multiplier" + "\u00a77: " + roundFloat(type.shootHeadMultiplier, 2));
                lines.add("\u00a79Arm hit multiplier" + "\u00a77: " + roundFloat(type.shootArmMultiplier, 2));
                lines.add("\u00a79Drop speed" + "\u00a77: " + roundFloat(type.fallSpeed * 20, 2) + "m/s");
                lines.add("\u00a79Air drag" + "\u00a77: " + roundFloat(type.dragInAir, 2));
                if (type.enableBulletDecay) {
                    lines.add("\u00a79Damage falloff" + "\u00a77: " + type.bulletDecays.toString());
                } else {
                    lines.add("\u00a79Damage falloff" + "\u00a77: None");
                }
                if (type.explosionRadius > 0) {
                    lines.add("\u00a79Explosion radius" + "\u00a77: " + roundFloat(type.explosionRadius, 2) + "m");
                    lines.add("\u00a79Block destruction power" + "\u00a77: " + roundFloat(type.explosionPower, 2));
                }
                lines.add("\u00a79Penetration capability" + "\u00a77: " + type.penetratingBlockMaxNum);
                if(type.penetratingBlockMaxNum > 0) {
                    lines.add("\u00a79Penetration damage loss" + "\u00a77: " + type.penetratingDamageLoss);
                }
                if (type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) {
                    if (type.enableSACLOS) {
                        lines.add("\u00a79Guidance type" + "\u00a77: " + "Semi-active guidance");
                    } else {
                        lines.add("\u00a79Guidance type" + "\u00a77: " + "Active homing");
                    }
                    lines.add("\u00a79Homing start delay" + "\u00a77: " + roundFloat(type.tickStartHoming / 20f, 2) + "s");
                    if(type.tickEndHoming > 0) {
                        lines.add("\u00a79Max homing time" + "\u00a77: " + roundFloat(type.tickEndHoming / 20f, 2) + "s");
                    }
                } else if (type.enableMCLOS && !type.manualGuidance) {
                    if(type.enableCameraFollow) {
                        lines.add("\u00a79Guidance type" + "\u00a77: " + "Camera command guidance [MCLOS]");
                    } else {
                        lines.add("\u00a79Guidance type" + "\u00a77: " + "Manual command guidance [MCLOS]");
                    }
                    if(type.tickEndHoming > 0) {
                        lines.add("\u00a79Max guidance time" + "\u00a77: " + roundFloat(type.tickEndHoming / 20f, 2) + "s");
                    }
                } else if (type.manualGuidance) {
                    if(type.enableCameraFollow) {
                        lines.add("\u00a79Guidance type" + "\u00a77: " + "TV guidance [SACLOS]");
                    } else {
                        if(type.hasLine) {
                            lines.add("\u00a79Guidance type" + "\u00a77: " + "Wire-guided [SACLOS]");
                        } else {
                            lines.add("\u00a79Guidance type" + "\u00a77: " + "Beam-riding [SACLOS]");
                        }
                    }
                    if(type.tickEndHoming > 0) {
                        lines.add("\u00a79Max guidance time" + "\u00a77: " + roundFloat(type.tickEndHoming / 20f, 2) + "s");
                    }
                }

                if(type.enableAirburst) {
                    lines.add("\u00a79Airburst radius" + "\u00a77: " + roundFloat(type.airburstDamageRange, 2) + "m");
                    lines.add("\u00a79Airburst damage" + "\u00a77: " + roundFloat(type.airburstDamage, 2));
                }
                lines.add("\u00a79Max resupply amount" + "\u00a77: " + type.maxSupplyClips);
                if(type.canBeDestructByAPS) {
                    lines.add("\u00a7cDetected by Active Protection System");
                }
                if(type.setEntitiesOnFire || type.fireRadius > 0F) {
                    lines.add("\u00a7cIncendiary");
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