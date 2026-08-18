package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.utils.PlayerItemPositionUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.Locale;

public class PacketMuzzleFlash extends PacketBase
{
    public int playerID;
    /** Particle type */
    public String type;
    public float scale;
    public boolean showMuzzleFlashParticlesToShooter;
    public String gunType;

    public PacketMuzzleFlash() {}

    public PacketMuzzleFlash(EntityPlayer p, String particleType, float size, boolean showToShooter, String shortName)
    {
        playerID = p.getEntityId();
        type = particleType;
        scale = size;
        showMuzzleFlashParticlesToShooter = showToShooter;
        gunType = shortName;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        data.writeInt(playerID);
        writeUTF(data, type);
        data.writeFloat(scale);
        data.writeBoolean(showMuzzleFlashParticlesToShooter);
        writeUTF(data, gunType);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        playerID = data.readInt();
        type = readUTF(data);
        scale = data.readFloat();
        showMuzzleFlashParticlesToShooter = data.readBoolean();
        gunType = readUTF(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity)
    {
        FlansMod.log("Received muzzle flash packet on server. Disregarding.");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer)
    {
        if (type == null || type.isEmpty()) {
            return;
        }

        boolean isThisPlayer = playerID == clientPlayer.getEntityId();
        TickHandlerClient.triggerMuzzleFlashLight(playerID);
        GunType g = GunType.getGun(gunType);
        if (g == null || g.model == null) {
            return;
        }

        if (!isThisPlayer || showMuzzleFlashParticlesToShooter) {
            Entity p = clientPlayer.worldObj.getEntityByID(playerID);
            if (p instanceof EntityPlayer) {
                EntityPlayer entityPlayer = (EntityPlayer) p;
                if (!isThisPlayer) {
                    GunAnimations animations = FlansModClient.getGunAnimations(entityPlayer, false);
                    animations.triggerMuzzleFlash(entityPlayer.worldObj.rand);
                }

                // The default effect is rendered on the gun's exact model muzzle point.
                // Only custom content-pack particle names use the legacy world-space path.
                if ("flansmod.muzzleflash".equals(type)) {
                    return;
                }
                if (!FlansMod.showGunFiringSmoke
                        && type.toLowerCase(Locale.ROOT).contains("smoke")) {
                    return;
                }

                boolean firstPerson = isThisPlayer
                        && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0;

                AttachmentType barrelAttachment = g.getBarrel(entityPlayer.getHeldItem());

                RotatedAxes axes = new RotatedAxes(entityPlayer.rotationYawHead+90, entityPlayer.rotationPitch, 0);

                Vector3f shoulderOffset = firstPerson ? new Vector3f(0, -22F/16F, 0) : new Vector3f(0, 0, 0);
                Vector3f handOffset = getMuzzleModelOffset(g, barrelAttachment);

                Vector3f.add(shoulderOffset, g.muzzleFlashParticlesShoulderOffset, shoulderOffset);

                if (firstPerson) {
                    Vector3f.add(handOffset, new Vector3f(-0.7, -0.35, 0.1), handOffset);
                } else {
                    handOffset = transformThirdPersonMuzzleOffset(g, handOffset);
                }

                Vector3f.add(handOffset, g.muzzleFlashParticlesHandOffset, handOffset);

                Vector3f pos = PlayerItemPositionUtils.GetPlayerHandPosition(entityPlayer, shoulderOffset, handOffset, !firstPerson);
                if (!firstPerson) {
                    Vector3f backwardCorrection = new Vector3f(axes.getXAxis());
                    backwardCorrection.scale(2F);
                    Vector3f.sub(pos, backwardCorrection, pos);
                    pos.y -= 1.5F;
                }

                Vector3f v = axes.getXAxis();
                v.scale(0.05F);

                FlansMod.proxy.spawnParticle(type, pos.x, pos.y, pos.z, v.x, v.y, v.z, scale);
            }
        }
    }

    private static Vector3f getMuzzleModelOffset(GunType gun, AttachmentType barrelAttachment) {
        Vector3f offset = gun.model.muzzleFlashPoint == null
                ? new Vector3f(0.5F, 0.22F, 0F)
                : new Vector3f(gun.model.muzzleFlashPoint);
        if (barrelAttachment != null && barrelAttachment.model != null
                && barrelAttachment.model.attachmentFlashOffset != null) {
            Vector3f.add(offset, barrelAttachment.model.attachmentFlashOffset, offset);
        } else if (gun.model.defaultBarrelFlashPoint != null) {
            Vector3f.add(offset, gun.model.defaultBarrelFlashPoint, offset);
        }
        return offset;
    }

    /** Mirrors RenderGun's EQUIPPED transform so model units do not become world blocks. */
    private static Vector3f transformThirdPersonMuzzleOffset(GunType gun, Vector3f modelOffset) {
        float muzzleScale = gun.modelScale * gun.model.flashScale;
        float x = 0.75F + gun.model.thirdPersonOffset.x + modelOffset.x * muzzleScale;
        float y = -0.22F + gun.model.thirdPersonOffset.y + modelOffset.y * muzzleScale;
        float z = -0.08F - gun.model.thirdPersonOffset.z - modelOffset.z * muzzleScale;

        double yawRadians = Math.toRadians(-5D);
        float yawX = (float) (Math.cos(yawRadians) * x + Math.sin(yawRadians) * z);
        float yawZ = (float) (-Math.sin(yawRadians) * x + Math.cos(yawRadians) * z);
        double rollRadians = Math.toRadians(35D);
        return new Vector3f(
                (float) (Math.cos(rollRadians) * yawX - Math.sin(rollRadians) * y),
                (float) (Math.sin(rollRadians) * yawX + Math.cos(rollRadians) * y),
                yawZ);
    }
}
