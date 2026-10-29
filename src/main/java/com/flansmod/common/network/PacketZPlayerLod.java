package com.flansmod.common.network;

import com.flansmod.client.PlayerLodRenderer;
import com.flansmod.common.playerlod.PlayerLodSnapshot;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/** Client-bound complete interest set. Its lexical name preserves existing packet IDs. */
public final class PacketZPlayerLod extends PacketBase {
    private PlayerLodSnapshot snapshot;

    public PacketZPlayerLod() { }
    public PacketZPlayerLod(PlayerLodSnapshot snapshot) { this.snapshot = snapshot; }

    @Override public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) { snapshot.write(data); }
    @Override public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) { snapshot = PlayerLodSnapshot.read(data); }
    @Override public void handleServerSide(EntityPlayerMP player) {
        throw new SecurityException("Player LOD snapshots are server-owned.");
    }
    @Override @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer player) {
        PlayerLodRenderer.enqueue(snapshot);
    }
}
