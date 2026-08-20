package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.FMLOutboundHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.Packet;
import net.minecraft.server.MinecraftServer;

import java.util.*;

/**
 * Flan's Mod packet handler class. Directs packet data to packet classes.
 *
 * @author Flan
 * With much inspiration from http://www.minecraftforge.net/wiki/Netty_Packet_Handling
 */
@ChannelHandler.Sharable
public class PacketHandler extends MessageToMessageCodec<FMLProxyPacket, PacketBase> {
    //Map of channels for each side
    private EnumMap<Side, FMLEmbeddedChannel> channels;
    //The list of registered packets. Should contain no more than 256 packets.
    private LinkedList<Class<? extends PacketBase>> packets = new LinkedList<>();
    //The physical side allowed to receive each packet class.
    private Map<Class<? extends PacketBase>, EnumSet<Side>> packetReceivers = new HashMap<>();
    //Whether or not Flan's Mod has initialised yet. Once true, no more packets may be registered.
    private boolean modInitialised = false;

    /**
     * Registers a packet with the handler
     */
    public boolean registerPacket(Class<? extends PacketBase> cl) {
        return registerPacket(cl, EnumSet.allOf(Side.class));
    }

    private boolean registerClientPacket(Class<? extends PacketBase> cl) {
        return registerPacket(cl, EnumSet.of(Side.CLIENT));
    }

    private boolean registerServerPacket(Class<? extends PacketBase> cl) {
        return registerPacket(cl, EnumSet.of(Side.SERVER));
    }

    private boolean registerBidirectionalPacket(Class<? extends PacketBase> cl) {
        return registerPacket(cl, EnumSet.allOf(Side.class));
    }

    private boolean registerDisabledPacket(Class<? extends PacketBase> cl) {
        return registerPacket(cl, EnumSet.noneOf(Side.class));
    }

    private boolean registerPacket(Class<? extends PacketBase> cl, EnumSet<Side> receivingSides) {
        if (packets.size() >= 256) {
            FlansMod.log("Packet limit exceeded in Flan's Mod packet handler by packet " + cl.getCanonicalName() + ".");
            return false;
        }
        if (packets.contains(cl)) {
            FlansMod.log("Tried to register " + cl.getCanonicalName() + " packet class twice.");
            return false;
        }
        if (modInitialised) {
            FlansMod.log("Tried to register packet " + cl.getCanonicalName() + " after mod initialisation.");
            return false;
        }

        packets.add(cl);
        packetReceivers.put(cl, EnumSet.copyOf(receivingSides));
        return true;
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, PacketBase msg, List<Object> out) throws Exception {
        //Define a new buffer to store our data upon encoding
        ByteBuf encodedData = Unpooled.buffer();
        //Get the packet class
        Class<? extends PacketBase> cl = msg.getClass();

        //If this packet has not been registered by our handler, reject it
        if (!packets.contains(cl))
            throw new NullPointerException("Packet not registered : " + cl.getCanonicalName());

        //Like a packet ID. Stored as the first entry in the packet code for recognition
        byte discriminator = (byte) packets.indexOf(cl);
        encodedData.writeByte(discriminator);
        //Get the packet class to encode our packet
        msg.encodeInto(ctx, encodedData);
        //Convert our packet into a Forge packet to get it through the Netty system
        FMLProxyPacket proxyPacket = new FMLProxyPacket(encodedData.copy(), ctx.channel().attr(NetworkRegistry.FML_CHANNEL).get());
        //Add our packet to the outgoing packet queue
        out.add(proxyPacket);
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, FMLProxyPacket msg, List<Object> out) throws Exception {
        //Get the encoded data from the incoming packet
        ByteBuf encodedData = msg.payload();
        //Get the class for interpreting this packet
        if (!encodedData.isReadable())
            throw new IllegalArgumentException("Received an empty Flan's Mod packet");

        int discriminator = encodedData.readUnsignedByte();
        if (discriminator >= packets.size())
            throw new NullPointerException("Packet not registered for discriminator : " + discriminator);

        Class<? extends PacketBase> cl = packets.get(discriminator);
        Side receivingSide = msg.getTarget();
        if (receivingSide == null)
            receivingSide = FMLCommonHandler.instance().getEffectiveSide();
        EnumSet<Side> receivers = packetReceivers.get(cl);
        if (receivers == null || !receivers.contains(receivingSide))
            throw new SecurityException("Packet " + cl.getCanonicalName() + " is not accepted on side " + receivingSide);

        //Create an empty packet and decode our packet data into it
        PacketBase packet = cl.newInstance();
        packet.decodeInto(ctx, encodedData.slice());
        //Check the side and handle our packet accordingly
        switch (receivingSide) {
            case CLIENT: {
                packet.handleClientSide(getClientPlayer());
                break;
            }
            case SERVER: {
                INetHandler netHandler = ctx.channel().attr(NetworkRegistry.NET_HANDLER).get();
                packet.handleServerSide(((NetHandlerPlayServer) netHandler).playerEntity);
                break;
            }
        }
    }

    /**
     * Initialisation method called from FMLInitializationEvent in FlansMod
     */
    public void initialise() {
        channels = NetworkRegistry.INSTANCE.newChannel("FlansMod", this);
        registerClientPacket(PacketAPSMarker.class);
        registerServerPacket(PacketBFMCKeyInput.class);
        registerClientPacket(PacketBlockHit.class);
        //registerPacket(PacketSoldierSlot.class);
        registerServerPacket(PacketMinigunStart.class);
        registerClientPacket(PacketSoldierAim.class);
        registerClientPacket(PacketSoldierName.class);
        registerServerPacket(PacketSoldierDebug.class);
        registerClientPacket(PacketRequestScreenshot.class);
        registerClientPacket(PacketAAGunAngles.class);
        registerBidirectionalPacket(PacketBaseEdit.class);
        registerClientPacket(PacketBreakSound.class);
        registerServerPacket(PacketBuyArmour.class);
        registerServerPacket(PacketBuyWeapon.class);
        registerDisabledPacket(PacketClientExplosion.class);
        registerServerPacket(PacketCraftDriveable.class);
        registerBidirectionalPacket(PacketDriveableControl.class);
        registerClientPacket(PacketDriveableDamage.class);
        registerServerPacket(PacketDriveableGUI.class);
        registerServerPacket(PacketDriveableKey.class);
        registerServerPacket(PacketDriveableKeyHeld.class);
        registerClientPacket(PacketFlak.class);
        registerClientPacket(PacketExplosion.class);
        registerServerPacket(PacketGunFire.class);
        registerBidirectionalPacket(PacketGunMode.class);
        registerServerPacket(PacketGunPaint.class);
        registerServerPacket(PacketGunSpread.class);
        registerClientPacket(PacketKillMessage.class);
        registerBidirectionalPacket(PacketMechaControl.class);
        registerServerPacket(PacketMGFire.class);
        registerClientPacket(PacketMGMount.class);
        registerClientPacket(PacketOffHandGunInfo.class);
        registerClientPacket(PacketParticle.class);
        registerBidirectionalPacket(PacketPlaneControl.class);
        registerClientPacket(PacketPlaySound.class);
        registerBidirectionalPacket(PacketReload.class);
        registerServerPacket(PacketRepairDriveable.class);
        registerClientPacket(PacketRoundFinished.class);
        registerBidirectionalPacket(PacketSeatUpdates.class);
        registerBidirectionalPacket(PacketSeatCheck.class);
        registerServerPacket(PacketSelectOffHandGun.class);
        registerClientPacket(PacketTeamInfo.class);
        registerBidirectionalPacket(PacketTeamSelect.class);
        registerBidirectionalPacket(PacketVehicleControl.class);
        registerServerPacket(PacketVoteCast.class);
        registerClientPacket(PacketVoting.class);
        registerBidirectionalPacket(PacketRequestDebug.class);
        registerClientPacket(PacketFlashBang.class);
        registerDisabledPacket(PacketImpactPoint.class);
        registerServerPacket(PacketMissileMCLOSOffset.class);
        registerBidirectionalPacket(PacketMissileMCLOSAccelerate.class);
        registerClientPacket(PacketModConfig.class);
        registerClientPacket(PacketGunRecoil.class);
        registerServerPacket(PacketGunState.class);
        registerBidirectionalPacket(PacketToggleFlashlight.class);
        registerServerPacket(PacketToggleNightVisionGoggles.class);
        // Keep new custom packets at the lexical tail so existing sorted packet IDs stay stable.
        registerBidirectionalPacket(PacketZPlayerEquipmentSync.class);
        // This name sorts after every existing packet, preserving all established IDs.
        registerClientPacket(PacketZPlayerHitEffect.class);
        registerBidirectionalPacket(PacketHashSend.class);
        registerClientPacket(PacketMuzzleFlash.class);
        registerClientPacket(PacketHitMarker.class);
        registerServerPacket(PacketSetPreferredAmmo.class);
        registerServerPacket(PacketGetPlayerClasses.class);
        registerClientPacket(PacketSendPlayerClasses.class);
    }

    /**
     * Post-Initialisation method called from FMLPostInitializationEvent in FlansMod
     * Logically sorts the packets client and server side to ensure a matching ordering
     */
    public void postInitialise() {
        if (modInitialised)
            return;

        modInitialised = true;
        //Define our comparator on the fly and apply it to our list
        Collections.sort(packets,
            new Comparator<Class<? extends PacketBase>>() {
                @Override
                public int compare(Class<? extends PacketBase> c1, Class<? extends PacketBase> c2) {
                    int com = String.CASE_INSENSITIVE_ORDER.compare(c1.getCanonicalName(), c2.getCanonicalName());
                    if (com == 0)
                        com = c1.getCanonicalName().compareTo(c2.getCanonicalName());
                    return com;
                }
            }
        );
    }

    @SideOnly(Side.CLIENT)
    private EntityPlayer getClientPlayer() {
        return Minecraft.getMinecraft().thePlayer;
    }

    /**
     * Send a packet to all players
     */
    public void sendToAll(PacketBase packet) {
        channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.ALL);
        channels.get(Side.SERVER).writeAndFlush(packet);
    }

    /**
     * Send a packet to a player
     */
    public void sendTo(PacketBase packet, EntityPlayerMP player) {
        channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.PLAYER);
        channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(player);
        channels.get(Side.SERVER).writeAndFlush(packet);
    }

    /**
     * Send a packet to all around a point
     */
    public void sendToAllAround(PacketBase packet, NetworkRegistry.TargetPoint point) {
        channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.ALLAROUNDPOINT);
        channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(point);
        channels.get(Side.SERVER).writeAndFlush(packet);
    }

    /**
     * Send a packet to all in a dimension
     */
    public void sendToDimension(PacketBase packet, int dimensionID) {
        channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.DIMENSION);
        channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(dimensionID);
        channels.get(Side.SERVER).writeAndFlush(packet);
    }

    /**
     * Send a packet to the server
     */
    public void sendToServer(PacketBase packet) {
        channels.get(Side.CLIENT).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.TOSERVER);
        channels.get(Side.CLIENT).writeAndFlush(packet);
    }

    //Vanilla packets follow

    /**
     * Send a packet to all players
     */
    public void sendToAll(Packet packet) {
        MinecraftServer.getServer().getConfigurationManager().sendPacketToAllPlayers(packet);
    }

    /**
     * Send a packet to a player
     */
    public void sendTo(Packet packet, EntityPlayerMP player) {
        player.playerNetServerHandler.sendPacket(packet);
    }

    /**
     * Send a packet to all around a point
     */
    public void sendToAllAround(Packet packet, NetworkRegistry.TargetPoint point) {
        MinecraftServer.getServer().getConfigurationManager().sendToAllNear(point.x, point.y, point.z, point.range, point.dimension, packet);
    }

    /**
     * Send a packet to all in a dimension
     */
    public void sendToDimension(Packet packet, int dimensionID) {
        MinecraftServer.getServer().getConfigurationManager().sendPacketToAllPlayersInDimension(packet, dimensionID);
    }

    /**
     * Send a packet to the server
     */
    public void sendToServer(Packet packet) {
        Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(packet);
    }

    /**
     * Send a packet to all around a point without having to create one's own TargetPoint
     */
    public void sendToAllAround(PacketBase packet, double x, double y, double z, float range, int dimension) {
        sendToAllAround(packet, new NetworkRegistry.TargetPoint(dimension, x, y, z, range));
    }

    public void sendToDonut(PacketBase packet, double x, double y, double z, float minRange, float maxRange, int dimension) {
        List players;
        if (FMLCommonHandler.instance().getSide().isClient()) {
            players = Minecraft.getMinecraft().theWorld.playerEntities;
        } else {
            players = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        }

        float minRangeSq = minRange * minRange;
        float maxRangeSq = maxRange * maxRange;

        for (Object p : players) {
            if (p instanceof EntityPlayerMP) {
                EntityPlayerMP pl = (EntityPlayerMP) p;
                if (pl.dimension == dimension) {
                    double dist = (pl.posX - x) * (pl.posX - x) + (pl.posY - y) * (pl.posY - y) + (pl.posZ - z) * (pl.posZ - z);
                    if (dist > minRangeSq && dist < maxRangeSq) {
                        sendTo(packet, pl);
                    }
                }
            }
        }
    }

    public void sendToAllExcept(PacketBase packet, double x, double y, double z, float range, EntityPlayer player, int dimension) {
        List players;
        if (FMLCommonHandler.instance().getSide().isClient()) {
            players = Minecraft.getMinecraft().theWorld.playerEntities;
        } else {
            players = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        }

        float rangeSq = range * range;

        for (Object p : players) {
            if (p instanceof EntityPlayerMP) {
                EntityPlayerMP pl = (EntityPlayerMP) p;
                if (pl.dimension == dimension && !pl.getUniqueID().equals(player.getUniqueID())) {
                    double dist = (pl.posX - x) * (pl.posX - x) + (pl.posY - y) * (pl.posY - y) + (pl.posZ - z) * (pl.posZ - z);
                    if (dist < rangeSq) {
                        sendTo(packet, pl);
                    }
                }
            }
        }
    }
}
