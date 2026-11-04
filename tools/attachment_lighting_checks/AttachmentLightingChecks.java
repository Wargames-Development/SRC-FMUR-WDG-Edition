package com.flansmod.client;

import java.lang.reflect.Field;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.chunk.IChunkProvider;
import sun.misc.Unsafe;

/** Real vanilla block traversal, without a game window, chunk loading or a new test dependency. */
public final class AttachmentLightingChecks {
    public static void main(String[] args) throws Exception {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        // Skip World construction: this fixture serves only air and an infinite stone wall.
        WallWorld world = (WallWorld) ((Unsafe) field.get(null)).allocateInstance(WallWorld.class);
        world.wallZ = 12;
        Vec3 origin = Vec3.createVectorHelper(0.37D, 64.43D, 0.61D);
        Vec3 rawOrigin = Vec3.createVectorHelper(origin.xCoord, origin.yCoord, origin.zCoord);
        world.func_147447_a(rawOrigin, origin.addVector(0D, 0D, 32D), false, true, false);
        check(rawOrigin.zCoord != origin.zCoord, "Fixture must reproduce vanilla's start-vector mutation");

        int hits = 0;
        for (int y = -4; y <= 4; y++) {
            for (int x = -4; x <= 4; x++) {
                if (x * x + y * y > 16) continue;
                Vec3 direction = Vec3.createVectorHelper(x * 0.325D / 4D, y * 0.325D / 4D, 1D).normalize();
                Vec3 end = origin.addVector(direction.xCoord * 32D, direction.yCoord * 32D, direction.zCoord * 32D);
                MovingObjectPosition hit = AttachmentLightRenderer.traceBetween(world, origin, end);
                check(hit != null && hit.sideHit == 2 && Math.abs(hit.hitVec.zCoord - 12D) < 0.00001D,
                        "Cone sample " + x + "," + y + " missed front wall: "
                                + (hit == null ? "null" : "side=" + hit.sideHit + " hit=" + hit.hitVec));
                unchanged(origin, 0.37D, 64.43D, 0.61D);
                unchanged(end, 0.37D + direction.xCoord * 32D, 64.43D + direction.yCoord * 32D,
                        0.61D + direction.zCoord * 32D);
                check(origin.distanceTo(hit.hitVec) >= 11.39D - 0.00001D, "Falloff must use distance from the shooter");
                hits++;
            }
        }
        check(hits == 49, "All 49 circular cone samples must be tested");
        Vec3 muzzle = origin.addVector(0.22D, -0.20D, 0.45D);
        Vec3 target = origin.addVector(0D, 0D, 11.39D);
        AttachmentLightRenderer.traceBetween(world, origin, muzzle);
        AttachmentLightRenderer.traceBetween(world, muzzle, target);
        unchanged(origin, 0.37D, 64.43D, 0.61D);
        unchanged(muzzle, 0.59D, 64.23D, 1.06D);
        unchanged(target, 0.37D, 64.43D, 12D);
        world.wallZ = 1000;
        check(AttachmentLightRenderer.traceBetween(world, origin, origin.addVector(0D, 0D, 32D)) == null,
                "Open-sky rays must remain misses");
        unchanged(origin, 0.37D, 64.43D, 0.61D);
        checkLaserPose(world);
        checkEntityLasers(world, (Unsafe) field.get(null));
        checkCorpseArmour(world, (Unsafe) field.get(null));
        checkCorpseDamage(world, (Unsafe) field.get(null));
        checkTinnitus((Unsafe) field.get(null));
        checkHandheldFlashlight((Unsafe) field.get(null));
        checkGammaLimit((Unsafe) field.get(null));
        checkGrenadeRelease((Unsafe) field.get(null));
        System.out.println("PASS: cone rays, preserved origins, zeroing/pose, entity occlusion/interpolation, tri-beam spacing, corpse armor synchronization, corpse damage feedback/persistence, non-overlapping tinnitus, handheld light state and vanilla brightness range");
    }

    private static void checkGrenadeRelease(Unsafe allocator) throws Exception {
        WallWorld world = (WallWorld) allocator.allocateInstance(WallWorld.class);
        Field provider = World.class.getDeclaredField("provider"); provider.setAccessible(true);
        provider.set(world, new net.minecraft.world.WorldProviderSurface());
        GrenadePlayer player = (GrenadePlayer) allocator.allocateInstance(GrenadePlayer.class);
        player.worldObj = world;
        player.capabilities = new net.minecraft.entity.player.PlayerCapabilities();
        player.inventory = new net.minecraft.entity.player.InventoryPlayer(player);
        Field watcher = Entity.class.getDeclaredField("dataWatcher"); watcher.setAccessible(true);
        DataWatcher state = new DataWatcher(player); state.addObject(0, (byte)0); state.addObject(6, 20F); watcher.set(player, state);
        com.flansmod.common.PlayerData data = (com.flansmod.common.PlayerData) allocator.allocateInstance(com.flansmod.common.PlayerData.class);
        com.flansmod.common.PlayerHandler.serverSideData.put(player.getCommandSenderName(), data);
        com.flansmod.common.guns.type.GrenadeType type = (com.flansmod.common.guns.type.GrenadeType)
                allocator.allocateInstance(com.flansmod.common.guns.type.GrenadeType.class);
        type.canThrow = true; type.hitBoxSize = 0.25F; type.throwSpeed = 1.5F; type.shortName = "grenade-release-check";
        player.setEntityId(17);
        com.flansmod.common.guns.item.ItemGrenade item = (com.flansmod.common.guns.item.ItemGrenade)
                allocator.allocateInstance(com.flansmod.common.guns.item.ItemGrenade.class);
        item.type = type;
        net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(item, 3);
        Field delegate = stack.getClass().getDeclaredField("delegate"); delegate.setAccessible(true);
        delegate.set(stack, new cpw.mods.fml.common.registry.RegistryDelegate.Delegate<net.minecraft.item.Item>(item, net.minecraft.item.Item.class));
        Field itemDelegate = net.minecraft.item.Item.class.getDeclaredField("delegate"); itemDelegate.setAccessible(true);
        itemDelegate.set(item, delegate.get(stack));
        player.inventory.mainInventory[0] = stack;
        java.lang.reflect.Method tick = data.getClass().getDeclaredMethod("tickGrenadeThrow", net.minecraft.entity.player.EntityPlayer.class);
        tick.setAccessible(true);
        try {
            data.startGrenadeThrow(player, stack);
            // NetHandlerPlayServer replaces the held stack with a copy after every use packet.
            net.minecraft.item.ItemStack original = stack;
            stack = stack.copy(); player.inventory.mainInventory[0] = stack;
            for (int i = 0; i < 3; i++) tick.invoke(data, player);
            check(world.grenadeSounds == null, "Pin-pull sound must wait until the hand reaches the pin");
            tick.invoke(data, player);
            check(Arrays.asList("flansmod:grenade_pinpull").equals(world.grenadeSounds),
                    "Pin-pull sound must play exactly once at tick 4");
            for (int i = 4; i < 19; i++) tick.invoke(data, player);
            check(world.grenades == 0 && stack.stackSize == 3, "Pin pull must not spawn or consume a grenade early");
            tick.invoke(data, player); tick.invoke(data, player);
            check(world.grenades == 1 && stack.stackSize == 2, "Overhand release must spawn and consume exactly once at tick 20");
            check(original.stackSize == 3, "Release must consume the live inventory stack, not its pre-packet copy");
            checkGrenadeSpawn(world.lastGrenade, player, allocator);
            check(world.grenadeSounds.equals(Arrays.asList("flansmod:grenade_pinpull", "flansmod:grenade_throw")),
                    "Throw sound must play once at release, without repeating pin pull");
            data.startGrenadeThrow(player, stack); player.inventory.currentItem = 1;
            for (int i = 0; i < 21; i++) tick.invoke(data, player);
            check(world.grenades == 1 && stack.stackSize == 2, "Switching slots during preparation must cancel without consuming");
            player.inventory.currentItem = 0; data.startGrenadeThrow(player, stack); player.isDead = true;
            for (int i = 0; i < 21; i++) tick.invoke(data, player);
            check(world.grenades == 1 && stack.stackSize == 2, "Dead players must not release a pending grenade");
            check(world.grenadeSounds.size() == 2, "Canceled throws must not play grenade sounds");
        } finally { com.flansmod.common.PlayerHandler.serverSideData.remove(player.getCommandSenderName()); }
    }

    private static void checkGrenadeSpawn(com.flansmod.common.guns.EntityGrenade grenade, Entity player, Unsafe allocator) throws Exception {
        check(grenade instanceof cpw.mods.fml.common.registry.IThrowableEntity,
                "Forge must recognize grenades as thrown entities to send initial velocity");
        check(grenade.motionX * grenade.motionX + grenade.motionY * grenade.motionY + grenade.motionZ * grenade.motionZ > 0.5D,
                "Released grenade must have launch velocity");
        // Exercise Forge's real spawn codec, rather than only the mod's extra fields.
        Class<?> messageClass = cpw.mods.fml.common.network.internal.FMLMessage.EntitySpawnMessage.class;
        Object outgoing = messageClass.newInstance();
        Field entity = messageClass.getSuperclass().getDeclaredField("entity"); entity.setAccessible(true); entity.set(outgoing, grenade);
        Field modId = messageClass.getDeclaredField("modId"); modId.setAccessible(true); modId.set(outgoing, "flansmod");
        java.lang.reflect.Method encode = messageClass.getDeclaredMethod("toBytes", io.netty.buffer.ByteBuf.class); encode.setAccessible(true);
        java.lang.reflect.Method decode = messageClass.getDeclaredMethod("fromBytes", io.netty.buffer.ByteBuf.class); decode.setAccessible(true);
        io.netty.buffer.ByteBuf payload = io.netty.buffer.Unpooled.buffer();
        try {
            encode.invoke(outgoing, payload);
            Object incoming = messageClass.newInstance(); decode.invoke(incoming, payload);
            for (String axis : new String[] {"X", "Y", "Z"}) {
                Field speed = messageClass.getDeclaredField("speedScaled" + axis); speed.setAccessible(true);
                double expected = axis.equals("X") ? grenade.motionX : axis.equals("Y") ? grenade.motionY : grenade.motionZ;
                check(Math.abs(speed.getDouble(incoming) - expected) < 0.0002D, "Forge lost grenade velocity on axis " + axis);
            }
        } finally { payload.release(); }
        WallWorld clientWorld = (WallWorld) allocator.allocateInstance(WallWorld.class);
        Field provider = World.class.getDeclaredField("provider"); provider.setAccessible(true); provider.set(clientWorld, new net.minecraft.world.WorldProviderSurface());
        com.flansmod.common.guns.EntityGrenade client = new com.flansmod.common.guns.EntityGrenade(clientWorld);
        com.flansmod.common.guns.type.GrenadeType.grenades.add(grenade.type);
        io.netty.buffer.ByteBuf extra = io.netty.buffer.Unpooled.buffer();
        try {
            client.setThrower(player); // Forge resolves the local player before readSpawnData.
            grenade.writeSpawnData(extra); client.readSpawnData(extra);
            check(client.type == grenade.type && client.getThrower() == player && client.width == grenade.type.hitBoxSize,
                    "Extra spawn data must preserve Forge's resolved thrower, model type and hitbox");
            extra.clear(); client.setThrower(null); grenade.writeSpawnData(extra); client.readSpawnData(extra);
            check(!client.isDead && client.type == grenade.type, "An untracked thrower must not delete the client grenade");
        } finally { extra.release(); com.flansmod.common.guns.type.GrenadeType.grenades.remove(grenade.type); }
    }

    private static final class GrenadePlayer extends net.minecraft.entity.player.EntityPlayer {
        private GrenadePlayer() { super(null, null); }
        @Override public String getCommandSenderName() { return "grenade-release-check"; }
        @Override public boolean canCommandSenderUseCommand(int level, String command) { return false; }
        @Override public void addChatMessage(net.minecraft.util.IChatComponent message) { }
        @Override public net.minecraft.util.ChunkCoordinates getPlayerCoordinates() { return new net.minecraft.util.ChunkCoordinates(0, 0, 0); }
    }

    private static StationaryCorpse corpse(World world, Unsafe allocator) throws Exception {
        StationaryCorpse corpse = (StationaryCorpse) allocator.allocateInstance(StationaryCorpse.class);
        corpse.worldObj = world;
        Field inventory = com.flansmod.common.mob.EntityCorpse.class.getDeclaredField("storedInventory");
        inventory.setAccessible(true); inventory.set(corpse, new net.minecraft.item.ItemStack[54]);
        Field expiry = com.flansmod.common.mob.EntityCorpse.class.getDeclaredField("expiresAtMillis");
        expiry.setAccessible(true); expiry.setLong(corpse, Long.MAX_VALUE);
        Field data = Entity.class.getDeclaredField("dataWatcher"); data.setAccessible(true);
        data.set(corpse, new DataWatcher(corpse)); corpse.entityInit();
        return corpse;
    }

    private static void checkCorpseDamage(World world, Unsafe allocator) throws Exception {
        StationaryCorpse corpse = corpse(world, allocator);
        check(corpse.getHealth() == 20F, "Bodies must start with player-sized health");
        check(!corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, Float.NaN), "Reject nonfinite damage");
        world.isRemote = true;
        check(!corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, 5F), "Clients cannot damage bodies");
        world.isRemote = false;
        check(corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, 2F), "Accept melee/generic damage");
        check(corpse.hurtTime == 10 && corpse.velocityChanged, "Accepted damage must trigger hurt feedback and motion sync");
        check(!corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, 2F), "Reject equal rapid hits like vanilla entities");
        check(corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, 4F) && corpse.getHealth() == 16F,
                "Stronger rapid hits must apply only their damage difference");
        corpse.hurtResistantTime = 0;
        corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, 2F);
        corpse.hurtResistantTime = 0;
        check(corpse.attackEntityFrom(net.minecraft.util.DamageSource.inFire, 3F), "Accept fire damage");
        corpse.hurtResistantTime = 0;
        check(corpse.attackEntityFrom(net.minecraft.util.DamageSource.setExplosionSource(null), 5F), "Accept explosion damage");
        check(corpse.getHealth() == 6F, "Damage must reduce health by its actual amount");
        net.minecraft.nbt.NBTTagCompound saved = new net.minecraft.nbt.NBTTagCompound();
        corpse.writeEntityToNBT(saved);
        StationaryCorpse loaded = corpse(world, allocator);
        loaded.readEntityFromNBT(saved);
        check(loaded.getHealth() == 6F, "Body health must survive a reload");
        saved.removeTag("Health"); saved.setInteger("ShotCount", 2);
        loaded.readEntityFromNBT(saved);
        check(Math.abs(loaded.getHealth() - 20F / 3F) < 0.0001F, "Migrate old shot damage proportionally");
        corpse.setInventorySlotContents(0, new net.minecraft.item.ItemStack(new net.minecraft.item.Item()));
        corpse.hurtResistantTime = 0;
        check(corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, 10F), "Accept lethal damage");
        check(corpse.isDead && corpse.drops == 1 && corpse.getStackInSlot(0) == null, "Destroy body and drop loot once");
        check(!corpse.attackEntityFrom(net.minecraft.util.DamageSource.generic, 10F) && corpse.drops == 1,
                "Repeated lethal hits must not duplicate loot");
        StationaryCorpse pushed = corpse(world, allocator);
        Entity attacker = living(allocator, EntityPig.class, 0D); attacker.posX = -1D;
        pushed.attackEntityFrom(new net.minecraft.util.EntityDamageSource("test", attacker), 1F);
        check(pushed.motionX == 0D && pushed.motionY == 0D && pushed.motionZ == 0D,
                "Damage must not knock a body away from its attacker");
        pushed.addVelocity(2D, 3D, 4D);
        check(pushed.motionX == 0D && pushed.motionY == 0D && pushed.motionZ == 0D,
                "External knockback must not launch corpses");
        pushed.motionX = 2D; pushed.motionY = 3D; pushed.motionZ = 4D;
        pushed.handleHealthUpdate((byte) 2);
        check(pushed.hurtTime == 10, "Clients must animate the hurt entity status");
        pushed.onUpdate();
        check(pushed.motionX == 0D && pushed.motionZ == 0D && pushed.motionY < 0D,
                "Direct explosion impulses must be discarded while gravity remains active");
        check(pushed.hurtTime == 9 && pushed.hurtResistantTime == 19, "Hurt timers must expire");
    }

    private static void checkTinnitus(Unsafe allocator) throws Exception {
        PlaybackHandler handler = (PlaybackHandler) allocator.allocateInstance(PlaybackHandler.class);
        net.minecraft.client.audio.ISound first = net.minecraft.client.audio.PositionedSoundRecord.func_147673_a(
                new net.minecraft.util.ResourceLocation("flansmod", "flash"));
        net.minecraft.client.audio.ISound next = net.minecraft.client.audio.PositionedSoundRecord.func_147673_a(
                new net.minecraft.util.ResourceLocation("flansmod", "flash"));
        TickHandlerClient.playTinnitus(handler, first);
        TickHandlerClient.playTinnitus(handler, next);
        check(handler.starts == 1 && handler.playing == first, "A second blast must not overlap or restart tinnitus");
        handler.playing = null;
        TickHandlerClient.playTinnitus(handler, next);
        check(handler.starts == 2 && handler.playing == next, "Tinnitus must become available when the sound finishes");
    }

    private static void checkHandheldFlashlight(Unsafe allocator) throws Exception {
        net.minecraft.item.Item item = (net.minecraft.item.Item) allocator.allocateInstance(
                com.flansmod.common.tools.ItemHandheldFlashlight.class);
        net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(item);
        Field delegate = net.minecraft.item.ItemStack.class.getDeclaredField("delegate"); delegate.setAccessible(true);
        delegate.set(stack, new cpw.mods.fml.common.registry.RegistryDelegate.Delegate<net.minecraft.item.Item>(item, net.minecraft.item.Item.class));
        check(com.flansmod.common.guns.FlashlightState.hasFlashlight(stack), "Handheld flashlight must support the existing light key");
        check(com.flansmod.common.guns.FlashlightState.isEnabled(stack), "New handheld lights default on");
        com.flansmod.common.guns.FlashlightState.setEnabled(stack, false);
        check(!com.flansmod.common.guns.FlashlightState.isEnabled(stack), "Handheld light must switch off");
        com.flansmod.common.guns.FlashlightState.setEnabled(stack, true);
        check(com.flansmod.common.guns.FlashlightState.isEnabled(stack), "Handheld light must switch on");
        check(!com.flansmod.common.guns.FlashlightState.hasEnabledLaser(stack), "Handheld flashlight must not be cast to a gun/laser");
        io.netty.buffer.ByteBuf packet = io.netty.buffer.Unpooled.buffer();
        new com.flansmod.common.network.PacketToggleFlashlight(false).encodeInto(null, packet);
        check(packet.readableBytes() == 5 && packet.readInt() == -1 && !packet.readBoolean(),
                "Light toggle packet layout must remain compatible");
        packet.release();
    }

    private static void checkGammaLimit(Unsafe allocator) throws Exception {
        net.minecraft.client.Minecraft mc = (net.minecraft.client.Minecraft) allocator.allocateInstance(net.minecraft.client.Minecraft.class);
        TestSettings settings = (TestSettings) allocator.allocateInstance(TestSettings.class);
        mc.gameSettings = settings;
        for (float gamma : new float[] {0F, 0.5F, 0.75F, 1F}) {
            settings.gammaSetting = gamma; TickHandlerClient.enforceGammaLimit(mc);
            check(settings.gammaSetting == gamma && settings.saves == 0, "Preserve the full vanilla brightness slider range");
        }
        settings.gammaSetting = 4F; TickHandlerClient.enforceGammaLimit(mc);
        check(settings.gammaSetting == 1F && settings.saves == 1, "Clamp fullbright values to 1.0");
    }

    private static final class TestSettings extends net.minecraft.client.settings.GameSettings {
        int saves;
        private TestSettings() { super(null, null); }
        @Override public void saveOptions() { saves++; }
    }

    private static final class PlaybackHandler extends net.minecraft.client.audio.SoundHandler {
        net.minecraft.client.audio.ISound playing;
        int starts;
        private PlaybackHandler() { super(null, null); }
        @Override public boolean isSoundPlaying(net.minecraft.client.audio.ISound sound) { return sound == playing; }
        @Override public void playSound(net.minecraft.client.audio.ISound sound) { playing = sound; starts++; }
    }

    private static void checkCorpseArmour(World world, Unsafe allocator) throws Exception {
        StationaryCorpse corpse = corpse(world, allocator);
        net.minecraft.item.ItemArmor helmet = new net.minecraft.item.ItemArmor(net.minecraft.item.ItemArmor.ArmorMaterial.IRON, 2, 0);
        net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(helmet);
        corpse.setInventorySlotContents(39, stack);
        corpse.onUpdate();
        net.minecraft.item.ItemStack watched = corpse.getDataWatcher().getWatchableObjectItemStack(13);
        check(watched != stack && net.minecraft.item.ItemStack.areItemStacksEqual(watched, stack),
                "Corpse armor must synchronize a copy from the actual inventory");
        stack.setItemDamage(5);
        corpse.onUpdate();
        check(corpse.getDataWatcher().getWatchableObjectItemStack(13).getItemDamage() == 5,
                "In-place armor mutations must synchronize");
        corpse.decrStackSize(39, 1);
        corpse.onUpdate();
        check(corpse.getDataWatcher().getWatchableObjectItemStack(13) == null, "Looted armor must disappear");
        corpse.setInventorySlotContents(0, new net.minecraft.item.ItemStack(helmet));
        corpse.onUpdate();
        check(corpse.getCorpseArmour(3) == null, "Loose inventory armor must not become worn armor");
        for (int slot = 0; slot < 4; slot++) {
            corpse.setInventorySlotContents(36 + slot, new net.minecraft.item.ItemStack(helmet));
        }
        corpse.onUpdate();
        for (int slot = 0; slot < 4; slot++)
            check(corpse.getDataWatcher().getWatchableObjectItemStack(10 + slot) != null, "Missing synced armor slot");
        world.isRemote = true;
        check(corpse.getCorpseArmour(3) == corpse.getDataWatcher().getWatchableObjectItemStack(13),
                "Clients must display watched armor rather than unsynchronized inventory");
        world.isRemote = false;
    }

    private static final class StationaryCorpse extends com.flansmod.common.mob.EntityCorpse {
        int drops;
        StationaryCorpse(World world) { super(null); worldObj = world; }
        @Override public void entityInit() { super.entityInit(); }
        @Override public void onEntityUpdate() { }
        @Override public void moveEntity(double x, double y, double z) { }
        @Override public void setDead() { isDead = true; }
        @Override public net.minecraft.entity.item.EntityItem entityDropItem(net.minecraft.item.ItemStack stack, float offset) {
            drops++; return null;
        }
        @Override public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound tag) { super.writeEntityToNBT(tag); }
        @Override public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound tag) { super.readEntityFromNBT(tag); }
    }

    private static void checkEntityLasers(WallWorld world, Unsafe unsafe) throws Exception {
        world.wallZ = 12;
        Entity near = living(unsafe, EntityPig.class, 4D), far = living(unsafe, EntityPig.class, 7D);
        Entity behind = living(unsafe, EntityPig.class, 15D);
        Vec3 start = Vec3.createVectorHelper(0.37D, 64.43D, 0.61D), end = start.addVector(0D, 0D, 32D);
        world.occupants = Arrays.<Entity>asList(far, near);
        MovingObjectPosition hit = AttachmentLightRenderer.traceLaser(world, null, start, end, 1F);
        check(hit != null && hit.entityHit == near, "Nearest mob must receive the spot");
        hit = AttachmentLightRenderer.traceLaser(world, near, start, end, 1F);
        check(hit != null && hit.entityHit == far, "The shooter must not hit its own bounds");
        Entity player = living(unsafe, EntityOtherPlayerMP.class, 5D);
        world.occupants = Arrays.asList(player);
        check(AttachmentLightRenderer.traceLaser(world, null, start, end, 1F).entityHit == player,
                "Player models must be eligible for laser projection");
        player.setInvisible(true);
        check(AttachmentLightRenderer.traceLaser(world, null, start, end, 1F).entityHit == null,
                "Invisible players must not be revealed by the laser");
        world.occupants = Arrays.<Entity>asList(behind);
        hit = AttachmentLightRenderer.traceLaser(world, null, start, end, 1F);
        check(hit != null && hit.entityHit == null && hit.blockZ == 12, "Walls must hide targets behind them");
        near.posX = 2D; near.lastTickPosX = 0D;
        near.boundingBox.offset(2D, 0D, 0D);
        world.occupants = Arrays.<Entity>asList(near);
        check(AttachmentLightRenderer.traceLaser(world, null, start, end, 0F).entityHit == near,
                "Entity selection must follow the interpolated render position");
        check(AttachmentLightRenderer.traceLaser(world, null, start, end, 1F).entityHit == null,
                "A moved target must leave the ray");
        world.occupants = Collections.emptyList();
        Vec3 right = Vec3.createVectorHelper(1D, 0D, 0D), up = Vec3.createVectorHelper(0D, 1D, 0D);
        Vec3[] points = new Vec3[3];
        for (int i = 0; i < 3; i++) points[i] = AttachmentLightRenderer.triangleOrigin(start, right, up, i, 0.08F);
        for (int i = 0; i < 3; i++)
            check(Math.abs(points[i].distanceTo(points[(i + 1) % 3]) - 0.08D) < 0.00001D,
                    "Tri-beam rays must form a small equilateral triangle");
        check(Math.abs((points[0].xCoord + points[1].xCoord + points[2].xCoord) / 3D - start.xCoord) < 0.00001D
                && Math.abs((points[0].yCoord + points[1].yCoord + points[2].yCoord) / 3D - start.yCoord) < 0.00001D,
                "Triangle must remain centered on the original aim ray");
    }

    private static Entity living(Unsafe unsafe, Class<? extends Entity> type, double z) throws Exception {
        Entity pig = (Entity) unsafe.allocateInstance(type);
        Field bounds = Entity.class.getDeclaredField("boundingBox"); bounds.setAccessible(true);
        bounds.set(pig, AxisAlignedBB.getBoundingBox(-0.2D, 63.5D, z, 0.8D, 65D, z + 0.8D));
        Field data = Entity.class.getDeclaredField("dataWatcher"); data.setAccessible(true);
        DataWatcher watcher = new DataWatcher(pig); watcher.addObject(0, Byte.valueOf((byte) 0)); data.set(pig, watcher);
        return pig;
    }

    private static void checkLaserPose(WallWorld world) {
        Vec3 eye = Vec3.createVectorHelper(0D, 0D, 0D);
        Vec3 muzzle = Vec3.createVectorHelper(0.2D, -0.1D, 0.5D);
        Vec3 aim = Vec3.createVectorHelper(0D, 0D, 1D);
        Vec3 posed = Vec3.createVectorHelper(0.6D, 0D, 0.8D);
        Vec3 ready = AttachmentLightRenderer.laserDirection(muzzle, eye, aim, posed, 0F);
        double zero = (50D - muzzle.zCoord) / ready.zCoord;
        check(Math.abs(muzzle.xCoord + ready.xCoord * zero) < 0.00001D
                && Math.abs(muzzle.yCoord + ready.yCoord * zero) < 0.00001D, "Ready laser must converge at 50 blocks");
        double close = (5D - muzzle.zCoord) / ready.zCoord;
        check(muzzle.xCoord + ready.xCoord * close > 0.1D, "Close surfaces must retain parallax");
        Vec3 lowered = AttachmentLightRenderer.laserDirection(muzzle, eye, aim, posed, 1F);
        unchanged(lowered, posed.xCoord, posed.yCoord, posed.zCoord);
        Vec3 previous = ready;
        for (int i = 0; i <= 100; i++) {
            Vec3 direction = AttachmentLightRenderer.laserDirection(muzzle, eye, aim, posed, i / 100F);
            check(Math.abs(direction.lengthVector() - 1D) < 0.00001D, "Pose direction must stay normalized");
            check(previous.distanceTo(direction) < 0.08D, "Pose transition snapped");
            previous = direction;
        }
        world.wallZ = 12;
        Vec3 end = muzzle.addVector(lowered.xCoord * 32D, lowered.yCoord * 32D, lowered.zCoord * 32D);
        MovingObjectPosition hit = AttachmentLightRenderer.traceBetween(world, muzzle, end);
        check(hit != null && hit.hitVec.xCoord > 8D, "Lowered beam must follow the emitter away from the crosshair");
        double dx = hit.hitVec.xCoord - muzzle.xCoord, dz = hit.hitVec.zCoord - muzzle.zCoord;
        check(Math.abs(dx * lowered.zCoord - dz * lowered.xCoord) < 0.00001D,
                "Beam and surface dot must lie on the same straight ray");
        Vec3 invalid = AttachmentLightRenderer.laserDirection(muzzle, eye, aim, posed, Float.NaN);
        unchanged(invalid, ready.xCoord, ready.yCoord, ready.zCoord);
        unchanged(muzzle, 0.2D, -0.1D, 0.5D);
        unchanged(aim, 0D, 0D, 1D);
    }

    private static void unchanged(Vec3 point, double x, double y, double z) {
        check(Math.abs(point.xCoord - x) < 0.00001D && Math.abs(point.yCoord - y) < 0.00001D
                && Math.abs(point.zCoord - z) < 0.00001D, "Ray tracing modified caller-owned coordinates");
    }

    private static void check(boolean valid, String message) {
        if (!valid) throw new AssertionError(message);
    }

    private static final class WallWorld extends World {
        private static final Block WALL = new TestBlock(true);
        private static final Block AIR = new TestBlock(false);
        int wallZ;
        int grenades;
        com.flansmod.common.guns.EntityGrenade lastGrenade;
        List<String> grenadeSounds;
        List<Entity> occupants;
        private WallWorld() { super(null, "unused", (WorldProvider) null, (WorldSettings) null, null); }
        @Override public Block getBlock(int x, int y, int z) { return z >= wallZ ? WALL : AIR; }
        @Override public int getBlockMetadata(int x, int y, int z) { return 0; }
        @Override protected IChunkProvider createChunkProvider() { return null; }
        @Override protected int func_152379_p() { return 0; }
        @Override public Entity getEntityByID(int id) { return null; }
        @Override public void setEntityState(Entity entity, byte state) { }
        @Override public boolean spawnEntityInWorld(Entity entity) {
            grenades++;
            if (entity instanceof com.flansmod.common.guns.EntityGrenade) lastGrenade = (com.flansmod.common.guns.EntityGrenade) entity;
            return true;
        }
        @Override public void playSoundAtEntity(Entity entity, String sound, float volume, float pitch) {
            if (grenadeSounds == null) grenadeSounds = new java.util.ArrayList<String>();
            grenadeSounds.add(sound);
        }
        @Override public List getEntitiesWithinAABBExcludingEntity(Entity entity, AxisAlignedBB bounds) {
            List<Entity> result = new java.util.ArrayList<Entity>();
            if (occupants != null) for (Entity occupant : occupants)
                if (occupant != entity && occupant.boundingBox.intersectsWith(bounds)) result.add(occupant);
            return result;
        }
    }

    private static final class TestBlock extends Block {
        private final boolean solid;
        TestBlock(boolean solid) { super(solid ? Material.rock : Material.air); this.solid = solid; }
        @Override public boolean canCollideCheck(int metadata, boolean liquids) { return solid; }
    }
}
