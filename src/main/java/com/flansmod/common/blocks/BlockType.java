package com.flansmod.common.blocks;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.IIcon;

public class BlockType extends InfoType {

    //用于普通方块
    public String topTexturePath;
    public String sideTexturePath;
    public String bottomTexturePath;

    //用于其他
    public String texturePath;

    public IIcon top;
    public IIcon side;
    public IIcon bottom;
    public Material material;
    public int hardness = 2;
    public int resistance = 5;
    public boolean breakableByExplosion = true;
    public boolean breakableByPlayer = false;

    public boolean dropThis = true;
    public EnumBlockType enumBlockType = EnumBlockType.general;

    public BlockType(TypeFile file) {
        super(file);
    }

    @Override
    protected void preRead(TypeFile file) {

    }

    @Override
    protected void postRead(TypeFile file) {

    }

    @Override
    protected void read(String[] split, TypeFile file) {
        super.read(split, file);
        try {
            switch (split[0]) {
                case "TopTexture":
                    topTexturePath = split[1];
                    break;
                case "SideTexture":
                    sideTexturePath = split[1];
                    break;
                case "BottomTexture":
                    bottomTexturePath = split[1];
                    break;
                case "Texture":
                    texturePath = split[1];
                    break;
                case "Material":
                    material = getMaterial(split[1]);
                    break;
                case "Hardness":
                    hardness = Integer.parseInt(split[1]);
                    break;
                case "Resistance":
                    resistance = Integer.parseInt(split[1]);
                    break;
                case "BreakableByExplosion" :
                    breakableByExplosion = Boolean.parseBoolean(split[1]);
                    break;
                case "BreakableByPlayer" :
                    breakableByPlayer = Boolean.parseBoolean(split[1]);
                    break;
                case "BlockType" :
                    enumBlockType = EnumBlockType.valueOf(split[1]);
                    break;
                case "DropThis" :
                    dropThis = Boolean.parseBoolean(split[1]);
                    break;
            }
        } catch (Exception e) {
            FlansMod.log("Reading file failed : " + shortName);
            e.printStackTrace();
        }
    }

    @Override
    public float GetRecommendedScale() {
        return 0;
    }

    @Override
    public ModelBase GetModel() {
        return null;
    }

    public static Material getMaterial(String value) {
        switch (value) {
            case "iron":
                return Material.iron;
            case "wood":
                return Material.wood;
            case "anvil":
                return Material.anvil;
            case "grass":
                return Material.grass;
            case "ground":
                return Material.ground;
            case "water":
                return Material.water;
            case "lava":
                return Material.lava;
            case "leaves":
                return Material.leaves;
            case "plants":
                return Material.plants;
            case "vine":
                return Material.vine;
            case "sponge":
                return Material.sponge;
            case "cloth":
                return Material.cloth;
            case "fire":
                return Material.fire;
            case "sand":
                return Material.sand;
            case "circuits":
                return Material.circuits;
            case "glass":
                return Material.glass;
            case "redstoneLight":
                return Material.redstoneLight;
            case "tnt":
                return Material.tnt;
            case "coral":
                return Material.coral;
            case "ice":
                return Material.ice;
            case "packedIce":
                return Material.packedIce;
            case "snow":
                return Material.snow;
            case "craftedSnow":
                return Material.craftedSnow;
            case "cactus":
                return Material.cactus;
            case "clay":
                return Material.clay;
            case "gourd":
                return Material.gourd;
            case "dragonEgg":
                return Material.dragonEgg;
            case "portal":
                return Material.portal;
            case "cake":
                return Material.cake;
            case "web":
                return Material.web;
            case "piston":
                return Material.piston;
            case "rock":
            default:
                return Material.rock;
        }
    }
}
