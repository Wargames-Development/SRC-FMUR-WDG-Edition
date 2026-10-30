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
        System.out.println("PASS: cone rays, preserved origins, zeroing/pose, entity occlusion/interpolation and tri-beam spacing");
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
        List<Entity> occupants;
        private WallWorld() { super(null, "unused", (WorldProvider) null, (WorldSettings) null, null); }
        @Override public Block getBlock(int x, int y, int z) { return z >= wallZ ? WALL : AIR; }
        @Override public int getBlockMetadata(int x, int y, int z) { return 0; }
        @Override protected IChunkProvider createChunkProvider() { return null; }
        @Override protected int func_152379_p() { return 0; }
        @Override public Entity getEntityByID(int id) { return null; }
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
