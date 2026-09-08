package com.flansmod.client.particle;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

/** Cosmetic sprites share the vanilla particle batch and never spawn child particles. */
@SideOnly(Side.CLIENT)
public class EntityEnvironmentalFX extends EntityFX {
    private final boolean building;
    private final boolean signal;
    private final boolean plume;
    private final boolean electrical;
    private final boolean ember;
    private final double sourceY;
    private final double directionX;
    private final double directionZ;
    private final float shade;

    public EntityEnvironmentalFX(World world, double x, double y, double z, String effect) {
        super(world, x, y, z, 0D, 0D, 0D);
        building = effect.equals("flansmod.buildingfire");
        signal = effect.equals("flansmod.signalsmoke");
        plume = effect.equals("flansmod.explosionremnant");
        electrical = effect.equals("flansmod.electricalsparks");
        ember = !electrical && !signal && !plume && rand.nextInt(5) == 0;
        sourceY = y;
        double angle = rand.nextDouble() * Math.PI * 2D;
        directionX = Math.cos(angle);
        directionZ = Math.sin(angle);
        shade = 0.08F + rand.nextFloat() * 0.08F;
        noClip = true;
        particleAlpha = 0F;
        particleScale = 3F;
        setParticleTextureIndex(7);

        double spread = building ? 2.5D : (signal || electrical ? 0.2D : 1D);
        setPosition(x + (rand.nextDouble() - 0.5D) * spread, y,
                z + (rand.nextDouble() - 0.5D) * spread);
        motionX = directionX * 0.025D;
        motionZ = directionZ * 0.025D;
        motionY = building ? 0.18D : 0.09D;
        particleMaxAge = (building ? 140 : 100) + rand.nextInt(30);
        if (signal) {
            motionY = 0.14D;
            particleMaxAge = 160 + rand.nextInt(30);
        } else if (plume) {
            motionY = 0.32D + rand.nextDouble() * 0.06D;
            particleMaxAge = 260 + rand.nextInt(40);
        } else if (electrical || ember) {
            motionX = directionX * (electrical ? 0.28D : 0.07D);
            motionZ = directionZ * (electrical ? 0.28D : 0.07D);
            motionY = 0.1D + rand.nextDouble() * 0.2D;
            particleMaxAge = (electrical ? 12 : 30) + rand.nextInt(12);
            particleScale = electrical ? 0.65F : 0.9F;
            setParticleTextureIndex(0);
        }
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
        float fade = Math.min(1F, particleAge / 5F) * Math.min(1F, (1F - life) * 4F);
        particleAlpha = fade * 0.85F;
        if (electrical || ember) {
            particleRed = 1F;
            particleGreen = electrical ? 0.9F : 0.45F;
            particleBlue = electrical ? 0.65F : 0.05F;
            motionY -= electrical ? 0.025D : 0.004D;
            motionX *= 0.96D;
            motionZ *= 0.96D;
        } else {
            setParticleTextureIndex(7 - Math.min(7, (int)(life * 8F)));
            if (signal) {
                particleRed = 0.85F;
                particleGreen = 0.06F;
                particleBlue = 0.04F;
                particleScale = 4F + life * 20F;
                motionX += 0.0003D;
            } else if (plume) {
                particleRed = shade + 0.10F;
                particleGreen = shade + 0.08F;
                particleBlue = shade + 0.06F;
                // Rise as a stem, then spread radially into a slowly lifting cap.
                // Height, rather than age, keeps the cap coherent across varying rise speeds.
                if (posY - sourceY > 28D) {
                    motionY = Math.max(0.025D, motionY * 0.93D);
                    motionX = directionX * 0.13D;
                    motionZ = directionZ * 0.13D;
                    particleScale = Math.min(85F, particleScale + 0.5F);
                } else {
                    particleScale = 7F + (float)(posY - sourceY) * 0.6F;
                }
            } else {
                float soot = Math.max(0F, Math.min(1F,
                        (particleAge - (building ? 25F : 12F)) / 20F));
                particleRed = 1F + (shade - 1F) * soot;
                particleGreen = 0.5F + (shade - 0.5F) * soot;
                particleBlue = 0.04F + (shade - 0.04F) * soot;
                particleScale = (building ? 5F : 3F) + particleAge * (building ? 0.23F : 0.16F);
                motionX += 0.0004D;
                motionY *= 0.997D;
            }
        }
        moveEntity(motionX, motionY, motionZ);
    }

    @Override
    public int getBrightnessForRender(float partialTicks) {
        boolean hot = electrical || ember || (!signal && !plume && particleAge < (building ? 45 : 32));
        return hot ? 15728880 : super.getBrightnessForRender(partialTicks);
    }
}
