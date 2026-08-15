package com.flansmod.client.particle;

import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;

import java.util.Random;

/** A short, layered muzzle flame assembled from particles instead of a flash PNG. */
public class EntityFMMuzzleFlash extends EntityFX {
    private static final int SMOKE_DIRECTIONS = 4;

    private final float initialScale;

    private EntityFMMuzzleFlash(World world, double x, double y, double z,
                                double motionX, double motionY, double motionZ,
                                float scale, float red, float green, float blue,
                                int maxAge) {
        super(world, x, y, z, motionX, motionY, motionZ);
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        this.initialScale = scale;
        this.particleScale = scale;
        this.particleMaxAge = maxAge;
        this.particleGravity = 0F;
        this.noClip = true;
        setParticleTextureIndex(7);
        setRBGColorF(red, green, blue);
    }

    public static void spawnBurst(World world, EffectRenderer renderer,
                                  double x, double y, double z,
                                  double directionX, double directionY, double directionZ,
                                  float requestedScale) {
        if (world == null || renderer == null) {
            return;
        }

        double directionLength = length(directionX, directionY, directionZ);
        if (directionLength < 0.0001D) {
            directionX = 1D;
            directionY = 0D;
            directionZ = 0D;
        } else {
            directionX /= directionLength;
            directionY /= directionLength;
            directionZ /= directionLength;
        }

        // Build a stable barrel-local right/up basis. Looking straight up or down
        // uses a fixed right axis so all four smoke ports remain distinct.
        double rightX = -directionZ;
        double rightY = 0D;
        double rightZ = directionX;
        double rightLength = length(rightX, rightY, rightZ);
        if (rightLength < 0.0001D) {
            rightX = 1D;
            rightY = 0D;
            rightZ = 0D;
        } else {
            rightX /= rightLength;
            rightZ /= rightLength;
        }
        double upX = rightY * directionZ - rightZ * directionY;
        double upY = rightZ * directionX - rightX * directionZ;
        double upZ = rightX * directionY - rightY * directionX;

        Random random = world.rand;
        double burstRotation = random.nextDouble() * Math.PI * 2D;
        double rotationCos = Math.cos(burstRotation);
        double rotationSin = Math.sin(burstRotation);
        double rotatedRightX = rightX * rotationCos + upX * rotationSin;
        double rotatedRightY = rightY * rotationCos + upY * rotationSin;
        double rotatedRightZ = rightZ * rotationCos + upZ * rotationSin;
        upX = upX * rotationCos - rightX * rotationSin;
        upY = upY * rotationCos - rightY * rotationSin;
        upZ = upZ * rotationCos - rightZ * rotationSin;
        rightX = rotatedRightX;
        rightY = rotatedRightY;
        rightZ = rotatedRightZ;

        float scale = Math.max(0.25F, requestedScale);
        float nonSmokeScale = scale * 0.25F;
        int flameParticleCount = 14 + random.nextInt(9);
        int coreParticleCount = 4 + random.nextInt(4);
        int middleParticleCount = 6 + random.nextInt(5);
        int sparkRayCount = 4 + random.nextInt(5);

        if (random.nextFloat() < 0.70F) {
            for (int i = 0; i < flameParticleCount; i++) {
                double angle = random.nextDouble() * Math.PI * 2D;
                double radialX = rightX * Math.cos(angle) + upX * Math.sin(angle);
                double radialY = rightY * Math.cos(angle) + upY * Math.sin(angle);
                double radialZ = rightZ * Math.cos(angle) + upZ * Math.sin(angle);
                double axialOffset = nonSmokeScale * (0.04D + random.nextDouble() * 0.48D);
                boolean core = i < coreParticleCount;
                boolean middle = i >= coreParticleCount
                        && i < coreParticleCount + middleParticleCount;
                double radialOffset = nonSmokeScale * random.nextDouble() * (core ? 0.06D : 0.18D);
                double forwardSpeed = nonSmokeScale * (0.035D + random.nextDouble() * 0.08D);
                double radialSpeed = nonSmokeScale * (random.nextDouble() - 0.35D) * 0.035D;

                float red = 1F;
                float green = core ? 1F : (middle ? 0.92F : 0.79F);
                float blue = core ? 0.86F : (middle ? 0.46F : 0.22F);
                float flameScale = nonSmokeScale * (2.4F + random.nextFloat() * 2.0F);
                renderer.addEffect(new EntityFMMuzzleFlash(world,
                        x + directionX * axialOffset + radialX * radialOffset,
                        y + directionY * axialOffset + radialY * radialOffset,
                        z + directionZ * axialOffset + radialZ * radialOffset,
                        directionX * forwardSpeed + radialX * radialSpeed,
                        directionY * forwardSpeed + radialY * radialSpeed,
                        directionZ * forwardSpeed + radialZ * radialSpeed,
                        flameScale, red, green, blue, 3 + random.nextInt(3)));
            }
        }

        for (int ray = 0; ray < sparkRayCount; ray++) {
            double angle = random.nextDouble() * Math.PI * 2D;
            double radialX = rightX * Math.cos(angle) + upX * Math.sin(angle);
            double radialY = rightY * Math.cos(angle) + upY * Math.sin(angle);
            double radialZ = rightZ * Math.cos(angle) + upZ * Math.sin(angle);
            double forwardSpeed = nonSmokeScale * (0.22D + random.nextDouble() * 0.24D);
            double radialSpeed = nonSmokeScale * (random.nextDouble() - 0.25D) * 0.18D;
            double sparkMotionX = directionX * forwardSpeed + radialX * radialSpeed;
            double sparkMotionY = directionY * forwardSpeed + radialY * radialSpeed;
            double sparkMotionZ = directionZ * forwardSpeed + radialZ * radialSpeed;

            // Two particles along each ray read as a short incandescent streak.
            for (int segment = 0; segment < 2; segment++) {
                double segmentOffset = segment * nonSmokeScale * 0.075D;
                renderer.addEffect(new MuzzleSparkParticle(world,
                        x + directionX * segmentOffset,
                        y + directionY * segmentOffset,
                        z + directionZ * segmentOffset,
                        sparkMotionX, sparkMotionY, sparkMotionZ,
                        nonSmokeScale * (0.44F + random.nextFloat() * 0.28F)));
            }
        }

        double[][] smokeDirections = {
                {upX, upY, upZ},
                {-upX, -upY, -upZ},
                {rightX, rightY, rightZ},
                {-rightX, -rightY, -rightZ}
        };
        for (int direction = 0; direction < SMOKE_DIRECTIONS; direction++) {
            int smokeCount = 1 + random.nextInt(3);
            for (int i = 0; i < smokeCount; i++) {
                double smokeSpeed = scale * (0.035D + random.nextDouble() * 0.025D);
                double smokeForward = scale * (0.012D + random.nextDouble() * 0.018D);
                double smokeX = smokeDirections[direction][0];
                double smokeY = smokeDirections[direction][1];
                double smokeZ = smokeDirections[direction][2];
                EntitySmokeFX smoke = new EntitySmokeFX(world,
                        x + smokeX * scale * 0.035D,
                        y + smokeY * scale * 0.035D,
                        z + smokeZ * scale * 0.035D,
                        smokeX * smokeSpeed + directionX * smokeForward,
                        smokeY * smokeSpeed + directionY * smokeForward,
                        smokeZ * smokeSpeed + directionZ * smokeForward,
                        scale * (0.9F + random.nextFloat() * 0.4F));
                smoke.setRBGColorF(0.48F, 0.46F, 0.42F);
                smoke.setAlphaF(0.42F);
                renderer.addEffect(smoke);
            }
        }
    }

    private static double length(double x, double y, double z) {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public void renderParticle(Tessellator tessellator, float partialTick,
                               float rotationX, float rotationXZ, float rotationZ,
                               float rotationYZ, float rotationXY) {
        tessellator.setBrightness(15728880);
        super.renderParticle(tessellator, partialTick, rotationX, rotationXZ,
                rotationZ, rotationYZ, rotationXY);
    }

    @Override
    public void onUpdate() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        if (particleAge++ >= particleMaxAge) {
            setDead();
            return;
        }

        float life = 1F - particleAge / (float) particleMaxAge;
        particleAlpha = Math.max(0F, life);
        particleScale = initialScale * (0.82F + particleAge * 0.12F);
        moveEntity(motionX, motionY, motionZ);
        motionX *= 0.68D;
        motionY *= 0.68D;
        motionZ *= 0.68D;
    }

    private static final class MuzzleSparkParticle extends EntityFX {
        private MuzzleSparkParticle(World world, double x, double y, double z,
                                    double motionX, double motionY, double motionZ,
                                    float scale) {
            super(world, x, y, z, motionX, motionY, motionZ);
            this.motionX = motionX;
            this.motionY = motionY;
            this.motionZ = motionZ;
            this.particleScale = scale;
            this.particleMaxAge = 4 + world.rand.nextInt(3);
            this.particleGravity = 0.15F;
            this.noClip = true;
            setParticleTextureIndex(65);
            setRBGColorF(1F, 0.52F + world.rand.nextFloat() * 0.28F, 0.08F);
        }

        @Override
        public void renderParticle(Tessellator tessellator, float partialTick,
                                   float rotationX, float rotationXZ, float rotationZ,
                                   float rotationYZ, float rotationXY) {
            tessellator.setBrightness(15728880);
            super.renderParticle(tessellator, partialTick, rotationX, rotationXZ,
                    rotationZ, rotationYZ, rotationXY);
        }

        @Override
        public void onUpdate() {
            prevPosX = posX;
            prevPosY = posY;
            prevPosZ = posZ;
            if (particleAge++ >= particleMaxAge) {
                setDead();
                return;
            }

            particleAlpha = Math.max(0F, 1F - particleAge / (float) particleMaxAge);
            moveEntity(motionX, motionY, motionZ);
            motionY -= 0.04D * particleGravity;
            motionX *= 0.88D;
            motionY *= 0.88D;
            motionZ *= 0.88D;
        }
    }
}
