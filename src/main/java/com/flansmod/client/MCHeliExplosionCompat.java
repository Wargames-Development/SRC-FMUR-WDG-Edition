package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketParticle;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.common.network.simpleimpl.SimpleIndexedCodec;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/** Optional client bridge for MCHeli's custom explosion-effect packet. */
public final class MCHeliExplosionCompat {
    private static final int MCHELI_EXPLOSION_PACKET_ID = 268437520;
    private static final String HANDLER_NAME = "flansmod_mcheli_explosion_tap";
    private static final Queue<ExplosionPosition> PENDING_EXPLOSIONS =
            new ConcurrentLinkedQueue<>();
    private static boolean installationAttempted;
    private static boolean installed;

    private MCHeliExplosionCompat() {
    }

    public static void clientTick() {
        installIfAvailable();

        ExplosionPosition explosion;
        while ((explosion = PENDING_EXPLOSIONS.poll()) != null) {
            TickHandlerClient.triggerMCHeliExplosionScreenShake(
                    explosion.x, explosion.y, explosion.z);
            PacketPlaySound.playDistantExplosionClient(
                    explosion.x, explosion.y, explosion.z, explosion.size,
                    PacketParticle.EXPLOSION_EFFECT_RANGE);
        }
    }

    private static void installIfAvailable() {
        if (installed || installationAttempted || !Loader.isModLoaded("mcheli")) {
            return;
        }
        installationAttempted = true;

        try {
            Class<?> networkClass = Class.forName("mcheli.wrapper.W_Network");
            Object network = networkClass.getField("INSTANCE").get(null);
            if (!(network instanceof SimpleNetworkWrapper)) {
                throw new IllegalStateException("Unexpected MCHeli network wrapper");
            }

            Field channelsField = SimpleNetworkWrapper.class.getDeclaredField("channels");
            channelsField.setAccessible(true);
            @SuppressWarnings("unchecked")
            EnumMap<Side, FMLEmbeddedChannel> channels =
                    (EnumMap<Side, FMLEmbeddedChannel>)channelsField.get(network);
            FMLEmbeddedChannel clientChannel = channels.get(Side.CLIENT);
            String codecName = clientChannel.findChannelHandlerNameForType(SimpleIndexedCodec.class);

            if (clientChannel.pipeline().get(HANDLER_NAME) == null) {
                clientChannel.pipeline().addBefore(codecName, HANDLER_NAME,
                        new ExplosionPacketTap());
            }
            installed = true;
            FlansMod.log("MCHeli explosion effects compatibility loaded");
        } catch (Exception exception) {
            FlansMod.log("Unable to load MCHeli explosion effects compatibility: "
                    + exception.getClass().getSimpleName());
        }
    }

    private static final class ExplosionPacketTap extends ChannelInboundHandlerAdapter {
        @Override
        public void channelRead(ChannelHandlerContext context, Object message) throws Exception {
            if (message instanceof FMLProxyPacket) {
                inspectPacket((FMLProxyPacket)message);
            }
            context.fireChannelRead(message);
        }

        private void inspectPacket(FMLProxyPacket packet) {
            ByteBuf payload = packet.payload().duplicate();
            if (payload.readableBytes() < 33) {
                return;
            }

            payload.readByte(); // SimpleNetworkWrapper discriminator.
            if (payload.readInt() != MCHELI_EXPLOSION_PACKET_ID) {
                return;
            }

            double x = payload.readDouble();
            double y = payload.readDouble();
            double z = payload.readDouble();
            float size = payload.readFloat();
            if (Double.isNaN(x) || Double.isInfinite(x)
                    || Double.isNaN(y) || Double.isInfinite(y)
                    || Double.isNaN(z) || Double.isInfinite(z)) {
                return;
            }
            if (Float.isNaN(size) || Float.isInfinite(size) || size <= 0F) {
                return;
            }
            PENDING_EXPLOSIONS.add(new ExplosionPosition(x, y, z, size));
        }
    }

    private static final class ExplosionPosition {
        private final double x;
        private final double y;
        private final double z;
        private final float size;

        private ExplosionPosition(double x, double y, double z, float size) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.size = size;
        }
    }
}
