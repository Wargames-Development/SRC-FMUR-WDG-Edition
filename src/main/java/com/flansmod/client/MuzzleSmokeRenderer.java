package com.flansmod.client;

import com.flansmod.client.model.ShaderRenderCompat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Renders gun muzzle smoke after Minecraft's translucent block pass.
 *
 * Vanilla 1.7.10 renders ordinary particles before water. Shader packs that
 * keep separate translucent/DH buffers can therefore interpret a close smoke
 * quad as part of the world translucency data and corrupt water or distant LOD
 * composition behind it. Keeping only gun muzzle smoke in RenderWorldLast
 * preserves the normal EntitySmokeFX appearance while drawing it after water.
 */
public final class MuzzleSmokeRenderer {
    private static final int SMOKE_DIRECTIONS = 4;
    private static final int MAX_SMOKE_PARTICLES = 384;
    private static final ResourceLocation PARTICLE_TEXTURE =
            new ResourceLocation("textures/particle/particles.png");
    private static final List<EntitySmokeFX> SMOKE = new ArrayList<EntitySmokeFX>();
    private static final List<EntitySmokeFX> FIRST_PERSON_SMOKE = new ArrayList<EntitySmokeFX>();
    private static final FloatBuffer WORLD_MODELVIEW = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer WORLD_PROJECTION = BufferUtils.createFloatBuffer(16);
    private static World currentWorld;
    private static boolean worldMatricesAvailable;

    private MuzzleSmokeRenderer() {
    }

    public static void addBurst(World world,
                                double x, double y, double z,
                                double directionX, double directionY, double directionZ,
                                float requestedScale, boolean firstPerson) {
        if (world == null) {
            return;
        }
        if (world != currentWorld) {
            clearSmoke();
            currentWorld = world;
        }

        DirectionBasis basis = createDirectionBasis(world, directionX, directionY, directionZ);
        Random random = world.rand;
        float scale = Math.max(0.25F, requestedScale);
        double[][] smokeDirections = {
                {basis.upX, basis.upY, basis.upZ},
                {-basis.upX, -basis.upY, -basis.upZ},
                {basis.rightX, basis.rightY, basis.rightZ},
                {-basis.rightX, -basis.rightY, -basis.rightZ}
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
                        smokeX * smokeSpeed + basis.directionX * smokeForward,
                        smokeY * smokeSpeed + basis.directionY * smokeForward,
                        smokeZ * smokeSpeed + basis.directionZ * smokeForward,
                        scale * (0.9F + random.nextFloat() * 0.4F));
                smoke.setRBGColorF(0.48F, 0.46F, 0.42F);
                smoke.setAlphaF(0.21F);
                addSmoke(smoke, firstPerson);
            }
        }
    }

    public static void tick() {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.theWorld != currentWorld) {
            clearSmoke();
            currentWorld = minecraft.theWorld;
        }

        tickSmoke(SMOKE);
        tickSmoke(FIRST_PERSON_SMOKE);
    }

    private static void tickSmoke(List<EntitySmokeFX> particles) {
        Iterator<EntitySmokeFX> iterator = particles.iterator();
        while (iterator.hasNext()) {
            EntitySmokeFX smoke = iterator.next();
            smoke.onUpdate();
            if (smoke.isDead) {
                iterator.remove();
            }
        }
    }

    public static void render(RenderWorldLastEvent event) {
        if (SMOKE.isEmpty() && FIRST_PERSON_SMOKE.isEmpty()) {
            return;
        }

        Minecraft minecraft = Minecraft.getMinecraft();
        Entity camera = minecraft.renderViewEntity;
        if (minecraft.theWorld == null || camera == null) {
            return;
        }

        if (!FIRST_PERSON_SMOKE.isEmpty()) {
            captureWorldMatrices();
        }
        renderSmoke(SMOKE, event.partialTicks, true);
    }

    /**
     * Draws local muzzle smoke after DH/Angelica have composed the world frame.
     * First-person smoke never needs world-depth occlusion, and rendering here
     * keeps its translucent quads out of DH's water and LOD framebuffers.
     */
    public static void renderFirstPerson(float partialTicks) {
        if (FIRST_PERSON_SMOKE.isEmpty() || !worldMatricesAvailable) {
            return;
        }

        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadMatrix(WORLD_PROJECTION);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadMatrix(WORLD_MODELVIEW);
        try {
            renderSmoke(FIRST_PERSON_SMOKE, partialTicks, false);
        } finally {
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(previousMatrixMode);
        }
    }

    private static void captureWorldMatrices() {
        WORLD_MODELVIEW.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, WORLD_MODELVIEW);
        WORLD_MODELVIEW.position(0);
        WORLD_MODELVIEW.limit(16);

        WORLD_PROJECTION.clear();
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, WORLD_PROJECTION);
        WORLD_PROJECTION.position(0);
        WORLD_PROJECTION.limit(16);
        worldMatricesAvailable = true;
    }

    private static void renderSmoke(List<EntitySmokeFX> particles,
                                    float partialTicks, boolean useWorldDepth) {
        if (particles.isEmpty()) {
            return;
        }

        Minecraft minecraft = Minecraft.getMinecraft();
        Entity camera = minecraft.renderViewEntity;
        if (minecraft.theWorld == null || camera == null) {
            return;
        }

        double cameraX = camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * partialTicks;
        double cameraY = camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * partialTicks;
        double cameraZ = camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * partialTicks;

        // EntityFX normally receives these from EffectRenderer. Set them here
        // because muzzle smoke deliberately bypasses that pre-water renderer.
        EntityFX.interpPosX = cameraX;
        EntityFX.interpPosY = cameraY;
        EntityFX.interpPosZ = cameraZ;

        // RenderWorldLast can still be inside an MRT shader pass. The HUD-phase
        // first-person path is already on the final composed framebuffer.
        boolean primaryColorOnly = useWorldDepth && ShaderRenderCompat.beginPrimaryColorOnly();
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_CULL_FACE);
            if (useWorldDepth) {
                GL11.glEnable(GL11.GL_DEPTH_TEST);
            } else {
                GL11.glDisable(GL11.GL_DEPTH_TEST);
            }
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            // The scene framebuffer alpha is composition data for several
            // shader/OptiFine paths. A translucent smoke quad must blend RGB
            // without replacing that data for every pixel in its bounding box.
            GL11.glColorMask(true, true, true, false);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);
            minecraft.renderEngine.bindTexture(PARTICLE_TEXTURE);

            Tessellator tessellator = Tessellator.instance;
            tessellator.startDrawingQuads();
            tessellator.setNormal(0F, 0F, 1F);
            for (EntitySmokeFX smoke : particles) {
                tessellator.setBrightness(smoke.getBrightnessForRender(partialTicks));
                smoke.renderParticle(tessellator, partialTicks,
                        ActiveRenderInfo.rotationX, ActiveRenderInfo.rotationXZ,
                        ActiveRenderInfo.rotationZ, ActiveRenderInfo.rotationYZ,
                        ActiveRenderInfo.rotationXY);
            }
            tessellator.draw();
        } finally {
            GL11.glPopAttrib();
            ShaderRenderCompat.endPrimaryColorOnly(primaryColorOnly);
            GL11.glColor4f(1F, 1F, 1F, 1F);
        }
    }

    private static void addSmoke(EntitySmokeFX smoke, boolean firstPerson) {
        List<EntitySmokeFX> target = firstPerson ? FIRST_PERSON_SMOKE : SMOKE;
        while (SMOKE.size() + FIRST_PERSON_SMOKE.size() >= MAX_SMOKE_PARTICLES) {
            if (!target.isEmpty()) {
                target.remove(0);
            } else {
                (firstPerson ? SMOKE : FIRST_PERSON_SMOKE).remove(0);
            }
        }
        target.add(smoke);
    }

    private static void clearSmoke() {
        SMOKE.clear();
        FIRST_PERSON_SMOKE.clear();
        worldMatricesAvailable = false;
    }

    private static DirectionBasis createDirectionBasis(World world,
                                                       double directionX, double directionY, double directionZ) {
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

        double burstRotation = world.rand.nextDouble() * Math.PI * 2D;
        double rotationCos = Math.cos(burstRotation);
        double rotationSin = Math.sin(burstRotation);
        double rotatedRightX = rightX * rotationCos + upX * rotationSin;
        double rotatedRightY = rightY * rotationCos + upY * rotationSin;
        double rotatedRightZ = rightZ * rotationCos + upZ * rotationSin;
        upX = upX * rotationCos - rightX * rotationSin;
        upY = upY * rotationCos - rightY * rotationSin;
        upZ = upZ * rotationCos - rightZ * rotationSin;

        return new DirectionBasis(directionX, directionY, directionZ,
                rotatedRightX, rotatedRightY, rotatedRightZ,
                upX, upY, upZ);
    }

    private static double length(double x, double y, double z) {
        return Math.sqrt(x * x + y * y + z * z);
    }

    private static final class DirectionBasis {
        private final double directionX;
        private final double directionY;
        private final double directionZ;
        private final double rightX;
        private final double rightY;
        private final double rightZ;
        private final double upX;
        private final double upY;
        private final double upZ;

        private DirectionBasis(double directionX, double directionY, double directionZ,
                               double rightX, double rightY, double rightZ,
                               double upX, double upY, double upZ) {
            this.directionX = directionX;
            this.directionY = directionY;
            this.directionZ = directionZ;
            this.rightX = rightX;
            this.rightY = rightY;
            this.rightZ = rightZ;
            this.upX = upX;
            this.upY = upY;
            this.upZ = upZ;
        }
    }
}
