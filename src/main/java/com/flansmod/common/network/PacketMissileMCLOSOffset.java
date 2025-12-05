package com.flansmod.common.network;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityBullet;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketMissileMCLOSOffset extends PacketBase {

    private float yawOffset;   // 水平偏航（右-左）
    private float pitchOffset; // 垂直偏航（上-下）

    public PacketMissileMCLOSOffset(float yawOffset, float pitchOffset) {
        this.yawOffset = yawOffset;
        this.pitchOffset = pitchOffset;
    }

    public PacketMissileMCLOSOffset() {}

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeFloat(yawOffset);  // 写入水平偏航
        data.writeFloat(pitchOffset); // 写入垂直偏航
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        yawOffset = data.readFloat();  // 读取水平偏航
        pitchOffset = data.readFloat(); // 读取垂直偏航
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        PlayerData data = PlayerHandler.getPlayerData(playerEntity, Side.SERVER);
        data.playerControlledBullets.removeIf(bullet -> bullet.isDead);
        for (EntityBullet bullet : data.playerControlledBullets) {
            bullet.pitchOffsetMCLOS += pitchOffset;
            bullet.yawOffsetMCLOS += yawOffset;
            //FlansMod.log("垂直偏航" + bullet.pitchOffsetMCLOS + " 水平偏航" + bullet.yawOffsetMCLOS);
        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {

    }
}
