package com.flansmod.client.particle;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

/** Batched vanilla smoke sprites, with a hot emissive stage for the oil jet. */
@SideOnly(Side.CLIENT)
public class EntityCinematicSmoke extends EntityFX {
    private final float shade;

    public EntityCinematicSmoke(World world, double x, double y, double z) {
        super(world, x, y, z, 0D, 0D, 0D);
        particleMaxAge = 160 + rand.nextInt(40);
        double angle = rand.nextDouble() * Math.PI * 2D;
        double speed = 0.035D;
        motionX = Math.cos(angle) * speed;
        motionZ = Math.sin(angle) * speed;
        motionY = 0.36D + rand.nextDouble() * 0.12D;
        shade = 0.045F + rand.nextFloat() * 0.045F;
        // Map ambience can spread through scenery; it never collides or changes blocks.
        noClip = true;
        particleScale = 4F;
        particleAlpha = 0F;
        setParticleTextureIndex(7);
    }

    @Override
    public void onUpdate() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        if (++particleAge >= particleMaxAge) {
            setDead();
            return;
        }
        float life = (float)particleAge / particleMaxAge;
        float fade = Math.min(1F, particleAge / 8F)
                * Math.min(1F, (particleMaxAge - particleAge) / 40F);
        // The narrow jet opens into a wind-bent plume as its flame cools to soot.
        float soot = Math.max(0F, Math.min(1F, (particleAge - 22F) / 24F));
        particleRed = 1F + (shade - 1F) * soot;
        particleGreen = 0.55F + (shade - 0.55F) * soot;
        particleBlue = 0.06F + (shade - 0.06F) * soot;
        particleScale = Math.min(65F, 4F + particleAge * 0.36F);
        particleAlpha = fade * 0.9F;
        motionX += 0.0009D;
        motionY *= 0.997D;
        setParticleTextureIndex(7 - Math.min(7, (int)(life * 8F)));
        moveEntity(motionX, motionY, motionZ);
    }

    @Override
    public int getBrightnessForRender(float partialTicks) {
        return particleAge < 46 ? 15728880 : super.getBrightnessForRender(partialTicks);
    }
}
