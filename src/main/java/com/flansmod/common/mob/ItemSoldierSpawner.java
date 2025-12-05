package com.flansmod.common.mob;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.mob.api.SoldierAPI;
import com.flansmod.common.network.PacketSoldierName;
import com.flansmod.common.network.PacketSoldierSlot;
import com.flansmod.common.teams.ItemTeamArmour;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ItemSoldierSpawner extends Item {

    public static List<Integer> aiGunIndexList;
    public static Map<String, List<Integer>> aiArmourIndexList;

    @SideOnly(Side.CLIENT)
    public IIcon icon;

    public ItemSoldierSpawner() {
        maxStackSize = 1;
        setCreativeTab(FlansMod.tabFlanTeams);
        GameRegistry.registerItem(this, "soldierspawner", FlansMod.MODID);
    }

    public static void spawnAISolider(World world, int i, int j, int k, String teamName) {
        Team team = world.getScoreboard().getTeam(teamName);
        spawnAISolider(world, i, j, k, team, null);
    }

    public static void spawnAISolider(World world, int i, int j, int k, EntityPlayer entityplayer) {
        Team team = entityplayer.getTeam();
        spawnAISolider(world, i, j, k, team, entityplayer);
    }

    private static void spawnAISolider(World world, int i, int j, int k, Team team, EntityPlayer entityplayer) {
        Random rand = ThreadLocalRandom.current();

        //初始化AI可用枪械和护甲列表
        if (aiGunIndexList == null) {
            aiGunIndexList = new ArrayList<>();
            for (int index = 0; index < FlansMod.gunItems.size(); index++) {
                if (FlansMod.gunItems.get(index).type.canAIUse) {
                    aiGunIndexList.add(index);
                }
            }
        }

        if (aiArmourIndexList == null) {
            aiArmourIndexList = new HashMap<>();
            for (int index = 0; index < FlansMod.armourItems.size(); index++) {
                ItemTeamArmour armour = FlansMod.armourItems.get(index);
                if (armour.type.group != null) {
                    if (aiArmourIndexList.containsKey(armour.type.group)) {
                        aiArmourIndexList.get(armour.type.group).add(index);
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(index);
                        aiArmourIndexList.put(armour.type.group, list);
                    }
                }
            }
        }

        ItemGun item;
        int randomElement = aiGunIndexList.get(rand.nextInt(aiGunIndexList.size()));
        item = FlansMod.gunItems.get(randomElement);

        ItemStack gunStack = new ItemStack(item);
        ItemStack grenadeStack = new ItemStack(FlansMod.grenadeItems.get(rand.nextInt(FlansMod.grenadeItems.size())));
        ItemStack armourStack = null;
        if (team != null) {
            List<Integer> armourIndexList = aiArmourIndexList.get(team.getRegisteredName());
            if (armourIndexList != null) {
                ItemTeamArmour armour = FlansMod.armourItems.get(armourIndexList.get(rand.nextInt(armourIndexList.size())));
                armourStack = new ItemStack(armour);
            }
        }

        String name = SoldierType.randomName();
        EntitySoldier soldier = new EntitySoldier(world, i + 0.5, j + 1, k + 0.5, entityplayer, team, EnumFaction.randomFaction()
                , SoldierType.randomType(), gunStack, grenadeStack, armourStack, name
        );
        world.spawnEntityInWorld(soldier);


        FlansMod.getPacketHandler().sendToAll(new PacketSoldierName(soldier.getEntityId(), name, team == null ? "" : team.getRegisteredName()));
        //FlansMod.getPacketHandler().sendToAll(new PacketSoldierSlot(soldier.getEntityId(), gunStack, grenadeStack, armourStack));

        SoldierAPI.soldierMap.put(soldier.getEntityId(), soldier);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
        //Raytracing
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
        double length = 5D;
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, true);

        //Result check
        if (movingobjectposition == null) {
            return itemstack;
        }
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && movingobjectposition.sideHit == 1) {
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;
            if (!world.isRemote) {
                spawnAISolider(world, i, j, k, entityplayer);
            }
            if (!entityplayer.capabilities.isCreativeMode) {
                itemstack.stackSize--;
            }
        }
        return itemstack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        itemIcon = icon.registerIcon("FlansMod:SoldierSpawner");
    }
}
