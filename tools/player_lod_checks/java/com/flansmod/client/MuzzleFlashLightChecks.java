package com.flansmod.client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

/** Use the real Forge light flood-fill with an in-memory block-light store. */
public final class MuzzleFlashLightChecks {
    private static final Block AIR = new BlockAir() {};
    private static int checks;

    public static void main(String[] args) throws Exception {
        sun.misc.Unsafe allocator = (sun.misc.Unsafe) field(sun.misc.Unsafe.class, "theUnsafe").get(null);
        Minecraft mc = (Minecraft) allocator.allocateInstance(Minecraft.class);
        field(Minecraft.class, "theMinecraft").set(null, mc);
        field(Minecraft.class, "field_152352_aC").set(mc, Thread.currentThread());
        LightWorld world = (LightWorld) allocator.allocateInstance(LightWorld.class);
        world.lights = new HashMap<>();
        world.shooters = new HashMap<>();
        world.loaded = true;
        field(World.class, "theProfiler").set(world, new Profiler());
        field(World.class, "lightUpdateBlockList").set(world, new int[32768]);
        mc.theWorld = world;
        mc.thePlayer = shooter(allocator, world, 1);
        EntityClientPlayerMP second = shooter(allocator, world, 2);
        int y = MathHelper.floor_double(mc.thePlayer.posY + mc.thePlayer.getEyeHeight());
        Method update = TickHandlerClient.class.getDeclaredMethod("updateMuzzleFlashLights", Minecraft.class);
        update.setAccessible(true);

        TickHandlerClient.triggerMuzzleFlashLight(1, world);
        TickHandlerClient.triggerMuzzleFlashLight(2, world);
        require(TickHandlerClient.getLocalMuzzleFlashExposure() == 1F, "local exposure begins on receipt");
        update.invoke(null, mc);
        require(world.level(0, y, 0) == 6 && world.level(3, y, 0) == 3, "vanilla falloff");
        require(world.relights == 6, "same-block shooters use one set of seeds");
        int before = world.relights;
        update.invoke(null, mc);
        require(world.relights == before && TickHandlerClient.getLocalMuzzleFlashExposure() == 2F / 3F,
                "steady origins skip propagation and keep the tick envelope");
        require(TickHandlerClient.getLocalMuzzleFlashBaseLightExposure(1F) == 0F, "base exposure excludes its flash");

        second.posX = 2;
        update.invoke(null, mc);
        require(world.level(0, y, 0) == 6 && world.level(2, y, 0) == 6 && world.level(1, y, 0) == 5,
                "moving shooter and retained source light the shared area");
        update.invoke(null, mc);
        require(world.lights.isEmpty() && TickHandlerClient.getLocalMuzzleFlashExposure() == 0F,
                "overlapping origins and their halos expire together");

        world.loaded = false;
        TickHandlerClient.triggerMuzzleFlashLight(1, world);
        update.invoke(null, mc);
        require(world.level(1, y, 0) == 0, "vanilla guards an unloaded neighborhood");
        world.loaded = true;
        update.invoke(null, mc);
        require(world.level(1, y, 0) == 5, "flash propagation retries when chunks become available");
        mc.theWorld = null;
        before = world.relights;
        update.invoke(null, mc);
        TickHandlerClient.triggerMuzzleFlashLight(1, world);
        require(world.relights == before && TickHandlerClient.getLocalMuzzleFlashExposure() == 0F,
                "world change drops old light state and stale packet intents");
        System.out.println("PASS: " + checks + " muzzle flash lighting checks.");
    }

    private static Field field(Class<?> owner, String name) throws Exception {
        Field field = owner.getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }

    private static EntityClientPlayerMP shooter(sun.misc.Unsafe allocator, LightWorld world, int id) throws Exception {
        EntityClientPlayerMP player = (EntityClientPlayerMP) allocator.allocateInstance(EntityClientPlayerMP.class);
        player.setEntityId(id);
        player.posY = 64;
        world.shooters.put(id, player);
        return player;
    }

    private static void require(boolean condition, String description) {
        checks++;
        if (!condition) throw new AssertionError(description);
    }

    private static final class LightWorld extends WorldClient {
        Map<ChunkPosition, Integer> lights;
        Map<Integer, Entity> shooters;
        boolean loaded;
        int relights;

        private LightWorld() { super(null, null, 0, null, null); }

        int level(int x, int y, int z) { return getSavedLightValue(EnumSkyBlock.Block, x, y, z); }

        @Override public Entity getEntityByID(int id) { return shooters.get(id); }
        @Override public Block getBlock(int x, int y, int z) { return AIR; }
        @Override public boolean doChunksNearChunkExist(int x, int y, int z, int distance) { return loaded; }
        @Override public int getSavedLightValue(EnumSkyBlock type, int x, int y, int z) {
            return lights.getOrDefault(new ChunkPosition(x, y, z), 0);
        }
        @Override public void setLightValue(EnumSkyBlock type, int x, int y, int z, int level) {
            ChunkPosition position = new ChunkPosition(x, y, z);
            if (level == 0) lights.remove(position);
            else lights.put(position, level);
        }
        @Override public boolean updateLightByType(EnumSkyBlock type, int x, int y, int z) {
            relights++;
            return super.updateLightByType(type, x, y, z);
        }
    }
}
