package com.flansmod.common.playerlod;

import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.type.BulletType;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

/** Actual HitmarkerPlus handler/packet checks without a client target or FML network bootstrap. */
public final class PlayerLodHitmarkerChecks {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) throw new IllegalArgumentException("Supply an MCP-mapped HitmarkerPlus jar");
        Field unsafeField = field(sun.misc.Unsafe.class, "theUnsafe");
        sun.misc.Unsafe allocator = (sun.misc.Unsafe)unsafeField.get(null);
        QueryWorld world = (QueryWorld)allocator.allocateInstance(QueryWorld.class);
        EntityPlayerMP shooter = (EntityPlayerMP)allocator.allocateInstance(EntityPlayerMP.class);
        EntityPlayerMP target = (EntityPlayerMP)allocator.allocateInstance(EntityPlayerMP.class);
        shooter.worldObj = world; target.worldObj = world;
        List<EntityPlayerMP> players = new ArrayList<EntityPlayerMP>();
        players.add(shooter); players.add(target);
        field(World.class, "playerEntities").set(world, players);
        EntityBullet bullet = (EntityBullet)allocator.allocateInstance(EntityBullet.class);
        bullet.worldObj = world; bullet.owner = shooter;
        bullet.type = (BulletType)allocator.allocateInstance(BulletType.class);
        bullet.type.shortName = "lodHitmarkerCheck";
        field(Entity.class, "boundingBox").set(bullet, AxisAlignedBB.getBoundingBox(0, 0, 0, 1, 1, 1));
        Method candidates = EntityBullet.class.getDeclaredMethod("getBulletCollisionCandidates", float.class);
        candidates.setAccessible(true);
        CaptureNetwork network = (CaptureNetwork)allocator.allocateInstance(CaptureNetwork.class);
        try (URLClassLoader loader = new URLClassLoader(new URL[] {Paths.get(args[0]).toUri().toURL()},
                PlayerLodHitmarkerChecks.class.getClassLoader()) {
            @Override protected Class<?> findClass(String name) throws ClassNotFoundException {
                if (!name.equals("com.hitmarkerplus.HitmarkerPlus")) return super.findClass(name);
                // Replace only FML registration with an observable sendTo endpoint.
                // Handler and packet bytecode come unchanged from the supplied mod.
                ClassWriter writer = new ClassWriter(0);
                writer.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, name.replace('.', '/'), null, "java/lang/Object", null);
                writer.visitField(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "NET",
                        "Lcpw/mods/fml/common/network/simpleimpl/SimpleNetworkWrapper;", null, null).visitEnd();
                writer.visitEnd();
                byte[] code = writer.toByteArray();
                return defineClass(name, code, 0, code.length);
            }
        }) {
            loader.loadClass("com.hitmarkerplus.HitmarkerPlus").getField("NET").set(null, network);
            Class<?> handlerType = loader.loadClass("com.hitmarkerplus.HitmarkerHandler");
            Object handler = handlerType.newInstance();
            Method hurt = handlerType.getMethod("onLivingHurt", LivingHurtEvent.class);
            int cases = 0;
            for (int distance : new int[] {32, 256, 512, 1024}) {
                target.posX = distance;
                check(((List<?>)candidates.invoke(bullet, 0F)).contains(target),
                        "Distant player disappeared from server collision candidates at " + distance);
                for (boolean headshot : new boolean[] {false, true}) {
                    network.message = null;
                    hurt.invoke(handler, new LivingHurtEvent(target, bullet.getBulletDamage(headshot), 5F));
                    check(network.recipient == shooter && network.message != null,
                            "Confirmed hit was not sent directly to its shooter at " + distance);
                    ByteBuf bytes = Unpooled.buffer();
                    try {
                        network.message.toBytes(bytes);
                        check(bytes.readableBytes() == 6 && bytes.readBoolean() && bytes.readBoolean() == headshot
                                && bytes.readInt() == -1,
                                "Body/headshot confirmation changed or required a client target at " + distance);
                    } finally { bytes.release(); }
                    ++cases;
                }
            }
            network.message = null;
            hurt.invoke(handler, new LivingHurtEvent(target, DamageSource.generic, 5F));
            check(network.message == null, "Unrelated damage generated an FMUR hitmarker");
            field(World.class, "isRemote").setBoolean(world, true);
            hurt.invoke(handler, new LivingHurtEvent(target, bullet.getBulletDamage(false), 5F));
            check(network.message == null, "Client-side damage generated a confirmation");
            System.out.println("PASS: " + cases + " real HitmarkerPlus body/headshot confirmations at 32/256/512/1024 blocks;"
                    + " server collision fallback, shooter-only delivery, target-independent wire format and negative controls.");
        }
    }

    private static final class QueryWorld extends WorldServer {
        private QueryWorld() { super(null, null, "", 0, null, null); }
        @Override public List getEntitiesWithinAABBExcludingEntity(Entity entity, AxisAlignedBB bounds) {
            return new ArrayList(); // Ordinary spatial/tracking results deliberately contain no target.
        }
    }

    private static final class CaptureNetwork extends SimpleNetworkWrapper {
        IMessage message;
        EntityPlayerMP recipient;
        private CaptureNetwork() { super("lodHitmarkerChecks"); }
        @Override public void sendTo(IMessage packet, EntityPlayerMP player) {
            check(message == null, "Duplicate hit confirmation");
            message = packet; recipient = player;
        }
    }

    private static Field field(Class<?> owner, String name) throws Exception {
        Field result = owner.getDeclaredField(name);
        result.setAccessible(true);
        return result;
    }

    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
}
