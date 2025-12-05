package com.flansmod.common.mob;

import com.flansmod.common.FlansMod;
import com.flansmod.common.eventhandlers.SoldierDeathEvent;
import com.flansmod.common.guns.raytracing.SoldierSnapshot;
import com.flansmod.common.mob.ai.*;
import com.flansmod.common.mob.api.SoldierAPI;
import com.flansmod.common.mob.helper.EscapeHelper;
import com.flansmod.common.mob.helper.FireHelper;
import com.flansmod.common.mob.helper.MoveHelper;
import com.flansmod.common.mob.helper.TargetHelper;
import com.flansmod.common.mob.navi.PathFinder;
import com.flansmod.common.mob.task.*;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class EntitySoldier extends EntityLiving implements IEntityAdditionalSpawnData, ICommandSender {
    public String name;
    public EntityPlayer owner;
    public Team team;
    public Entity target;
    public Entity lastTarget;
    public SoldierType type;
    public EnumFaction faction;
    public EnumWeaponState weaponState = EnumWeaponState.NO_AMMO;

    @Deprecated
    public EnumSoldierState state = EnumSoldierState.IDLE;
    public EnumTactic tactic = EnumTactic.MOVE_SHOOT_ESCAPE;
    public ItemStack currentWeapon;
    public ItemStack gunStack;
    public ItemStack grenadeStack;
    public ItemStack bulletStack;
    public ItemStack armourStack;
    public SoldierSnapshot[] snapshots = new SoldierSnapshot[FlansMod.numPlayerSnapshots];
    public TargetHelper targetHelper;
    public MoveHelper moveHelper;
    public EscapeHelper escapeHelper;
    public FireHelper fireHelper;
    public PathFinder pathFinder;
    public boolean aiming = false;
    public int lockOnTimeCount = 0;
    public int reloadingTimeCount = 0;
    public AITaskEntry task;
    public int targetStrategy = 0;

    public EntitySoldier(World p_i1594_1_) {
        super(p_i1594_1_);
        //initType();
    }

    public EntitySoldier(World world, double x, double y, double z, EntityPlayer owner, Team team,  EnumFaction faction, SoldierType type
            , ItemStack gunStack, ItemStack grenadeStack, ItemStack armourStack, String name) {
        this(world);
        ignoreFrustumCheck = true;
        renderDistanceWeight = 20000D;
        stepHeight = 0.0F;
        yOffset = 0.0F;
        this.name = name.endsWith("[AI]") ? name : name + "[AI]";
        this.owner = owner;
        this.team = team;
        this.faction = faction;
        this.type = type;
        this.currentWeapon = gunStack;
        this.grenadeStack = grenadeStack;
        this.armourStack = armourStack;
        setPosition(x, y, z);
        if(owner != null) {
            setRotation(owner.rotationYaw, owner.rotationPitch);
        }
        setHealth(20);
        setAIMoveSpeed(0F);
        setCustomNameTag(this.name);
        initType();
    }

    public void initType() {
        targetHelper = new TargetHelper(this);
        moveHelper = new MoveHelper(this);
        escapeHelper = new EscapeHelper(this);
        fireHelper = new FireHelper(this);
        pathFinder = new PathFinder(this);
        weaponState = EnumWeaponState.NO_AMMO;
        tactic = EnumTactic.MOVE_SHOOT_ESCAPE;
        initTask();
    }


    public void initTask() { // 初始化行为树

        /*

                                                          parallel
                                    /                                                  \
                                   /                                                    \
                                  /                                                       \
                                 /                                                         \
                               sel                                                         sel
                           /         \                          /         |           \           \           \       \
                          /           \                        /          |            \           \           \       \
                         seq            seq                   seq     checkCanShoot   pursuit   checkTarget   fire   tactic
                       /     \        /     \             /      \
                      /       \      /       \           /        \
                checkJump   jump checkNavi  navi     reserve  reloadAndEscape
                                                        |
                                                        |
                                                  checkAmmo


         */
        //根节点(1)
        AITask parent = new ParallelNode("PARENT", null);

        //移动和跳跃(2)
        AITask moveTask = new SelectorNode("MOVE", parent);
        AITask jumpNode = new SequenceNode("JUMP", moveTask);
        new CheckCanJumpTask(this, "checkCanJump", jumpNode);
        new JumpTask(this, "jump", jumpNode);
        AITask naviNode = new SequenceNode("NAVI", moveTask);
        new CheckCanMoveTask(this, "checkCanNAVI", naviNode);
        new MoveTask(this, "navi", naviNode);
        new WanderTask(this, "wander", moveTask);

        //射击换弹(2)
        AITask fireTask = new SelectorNode("FIRE", parent);

        //换弹(3)
        AITask reloadNode = new SequenceNode("RELOAD", fireTask);
        AITask rev1 = new ReverseNode("REV1", reloadNode);
        new CheckAmmoTask(this, "checkAmmo", rev1);

        //换弹与逃跑(4)
        AITask reloadAndEscapeTask = new SelectorNode("reloadAndEscape", reloadNode);
        new ReloadTask(this, "reload", reloadAndEscapeTask);

        //射击(3)
        AITask shootNode = new SequenceNode("SHOOT", fireTask);
        new CheckAmmoTask(this, "checkCanShoot", shootNode);
        new PursuitTask(this, "pursuit", shootNode);
        new CheckTargetTask(this, "checkTarget", shootNode);
        new FireTask(this, "fire", shootNode);
        new TacticTask(this, "doTactical", shootNode);

        //逃跑(5)
        AITask escapeNode = new SequenceNode("ESCAPE", reloadAndEscapeTask);
        new CheckEscapeTask(this, "checkEscape", escapeNode);
        new EscapeTask(this, "escape", escapeNode);

        this.task = AITaskEntry.createAITask(parent);

    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        setCurrentItemOrArmor(0, currentWeapon);
        setCurrentItemOrArmor(2, armourStack);

        if (getHealth() > 0 && getHealth() <= 20 && ticksExisted % 60 == 0) {
            setHealth(getHealth() + 1);
        }

        if (type != null && ticksExisted > type.maxExistingTick) {
            attackEntityFrom(DamageSource.outOfWorld, 10000);
        }

        onUpdateAI();

//        if (!worldObj.isRemote)
//            FlansMod.log(weaponState.toString() + "  "
//                    + (target == null ? target : target.getCommandSenderName()) + "  "
//                    + (currentWeapon != null && currentWeapon.getItem() instanceof ItemGun ? ((ItemGun) currentWeapon.getItem()).type.shortName : "null") + " "
//                    + escapeHelper.isEscaping
//            );

        System.arraycopy(snapshots, 0, snapshots, 1, snapshots.length - 2 + 1);
        snapshots[0] = new SoldierSnapshot(this);
    }

    public void onUpdateAI() {
        if (type == null || getHealth() <= 0) return;
        //if(!worldObj.isRemote)
        if (task != null) {
            task.onUpdate();
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
        if (p_70097_1_.getEntity() != null && p_70097_1_.getEntity() instanceof EntityLivingBase) {
            EntityLivingBase entity = (EntityLivingBase) p_70097_1_.getEntity();
            if (entity.getTeam() != null && entity.getTeam().isSameTeam(this.getTeam())) {
                return false;
            }
        }
        target = p_70097_1_.getEntity();
        return super.attackEntityFrom(p_70097_1_, p_70097_2_);
    }

    @Override
    public Team getTeam() {
        if (this.team == null) {
            return this.owner == null ? super.getTeam() : this.owner.getTeam();
        }
        return team;
    }

    @Override
    public boolean canBeCollidedWith() {
        return !isDead;
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        NBTTagCompound tag = new NBTTagCompound();

        if(gunStack != null){
            tag.setTag("gunStack", gunStack.writeToNBT(new NBTTagCompound()));
        }
        if(bulletStack != null){
            tag.setTag("bulletStack", bulletStack.writeToNBT(new NBTTagCompound()));
        }
        if(grenadeStack != null){
            tag.setTag("grenadeStack", grenadeStack.writeToNBT(new NBTTagCompound()));
        }
        if(armourStack != null){
            tag.setTag("armourStack", armourStack.writeToNBT(new NBTTagCompound()));
        }
        if(currentWeapon != null){
            tag.setTag("currentWeapon", currentWeapon.writeToNBT(new NBTTagCompound()));
        }
        tag.setString("teamName", this.team != null ? this.team.getRegisteredName() : "");
        tag.setInteger("ownerId", this.owner != null ? this.owner.getEntityId() : -1);
        ByteBufUtils.writeTag(buffer, tag);
    }


    @Override
    public void readSpawnData(ByteBuf additionalData) {
        NBTTagCompound tag = ByteBufUtils.readTag(additionalData);
        gunStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("gunStack"));
        bulletStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("bulletStack"));
        grenadeStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("grenadeStack"));
        armourStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("armourStack"));
        currentWeapon = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("currentWeapon"));
        String teamName = tag.getString("teamName");
        if (teamName != null && !teamName.isEmpty()) {
            this.team = this.worldObj.getScoreboard().getTeam(teamName);
        }
        int ownerId = tag.getInteger("ownerId");
        if (ownerId >= 0) {
            Entity e = this.worldObj.getEntityByID(ownerId);
            if (e instanceof EntityPlayer) this.owner = (EntityPlayer)e;
        }
    }


    //请勿修改
    @Override
    public void updateEntityActionState() {
    }

    //请勿修改
    @Override
    public ItemStack getHeldItem() {
        return currentWeapon == null ? null : currentWeapon;
    }


    //请勿修改
    @Override
    protected boolean isAIEnabled() {
        return false;
    }

    //请勿修改
    @Override
    protected float func_110146_f(float p_110146_1_, float p_110146_2_) {
        return super.func_110146_f(p_110146_1_, p_110146_2_);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        if (type == null) {
            FlansMod.log("EntitySoldier.writeEntityToNBT() Error: SoliderType is null (" + this + ")");
            setDead();
            return;
        }
        tag.setString("Type", type.uuid.toString());
        if (currentWeapon != null) {
            tag.setTag("currentWeapon", currentWeapon.writeToNBT(new NBTTagCompound()));
        }
        if (grenadeStack != null) {
            tag.setTag("grenadeStack", grenadeStack.writeToNBT(new NBTTagCompound()));
        }
        if (armourStack != null) {
            tag.setTag("armourStack", armourStack.writeToNBT(new NBTTagCompound()));
        }
        tag.setString("name", name);
        tag.setString("Team", team == null ? "" : team.getRegisteredName());
        tag.setString("faction", faction.name());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        type = SoldierType.soldierTypeMap.get(tag.getString("Type"));
        if (type == null) {
            FlansMod.log("EntitySoldier.readEntityFromNBT() Error: SoliderType is null (" + this + ")");
            setDead();
            return;
        }
        currentWeapon = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("currentWeapon"));
        grenadeStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("grenadeStack"));
        armourStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("armourStack"));
        name = tag.getString("name");
        team = worldObj.getScoreboard().getTeam(tag.getString("Team"));
        faction = EnumFaction.valueOf(tag.getString("faction"));
        initType();
    }

    //请勿修改
    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        damageSource.func_151519_b(this);
        SoldierDeathEvent event = new SoldierDeathEvent(this, damageSource, damageSource == DamageSource.outOfWorld, false);
        MinecraftForge.EVENT_BUS.post(event);
    }


    @Override
    public void addChatMessage(IChatComponent p_145747_1_) {

    }

    @Override
    public boolean canCommandSenderUseCommand(int p_70003_1_, String p_70003_2_) {
        return false;
    }

    @Override
    public ChunkCoordinates getPlayerCoordinates() {
        return new ChunkCoordinates((int) posX, (int) posY, (int) posZ);
    }

    @Override
    public World getEntityWorld() {
        return this.worldObj;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100D);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
//        dataWatcher.addObject(20, 0);
//        dataWatcher.addObject(21, 0);
    }

    @Override
    public void setDead() {
        super.setDead();
        if (type != null && type.uuid != null) {
            SoldierType.soldierTypeMap.remove(type.uuid.toString());
        }
        SoldierAPI.soldierMap.remove(getEntityId());
    }
}
