package com.flansmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/** Client-only cosmetic streaks created by real ground impacts. */
public final class TracerRicochetRenderer {
    private static final int MAX_RICOCHETS = 96;
    private static final List<Ricochet> RICOCHETS = new ArrayList<Ricochet>();
    private static final ConcurrentLinkedQueue<RicochetSpawn> PENDING = new ConcurrentLinkedQueue<RicochetSpawn>();
    private static World currentWorld;

    private TracerRicochetRenderer() {
    }

    public static void addRicochet(double x, double y, double z,
                                   double incomingX, double incomingY, double incomingZ) {
        PENDING.add(new RicochetSpawn(x, y, z, incomingX, incomingY, incomingZ));
    }

    public static void tick() {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.theWorld != currentWorld) {
            RICOCHETS.clear();
            PENDING.clear();
            currentWorld = minecraft.theWorld;
        }

        RicochetSpawn spawn;
        while ((spawn = PENDING.poll()) != null) {
            if (RICOCHETS.size() >= MAX_RICOCHETS) {
                RICOCHETS.remove(0);
            }
            RICOCHETS.add(new Ricochet(spawn));
        }

        Iterator<Ricochet> iterator = RICOCHETS.iterator();
        while (iterator.hasNext()) {
            Ricochet ricochet = iterator.next();
            ricochet.tick();
            if (ricochet.age >= ricochet.maxAge) {
                iterator.remove();
            }
        }
    }

    public static void render(RenderWorldLastEvent event) {
        if (RICOCHETS.isEmpty()) {
            return;
        }

        Minecraft minecraft = Minecraft.getMinecraft();
        Entity camera = minecraft.renderViewEntity;
        if (minecraft.theWorld == null || camera == null) {
            return;
        }

        double cameraX = camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * event.partialTicks;
        double cameraY = camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * event.partialTicks;
        double cameraZ = camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * event.partialTicks;

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            GL11.glEnable(GL11.GL_LINE_SMOOTH);
            GL11.glHint(GL11.GL_LINE_SMOOTH_HINT, GL11.GL_NICEST);

            for (Ricochet ricochet : RICOCHETS) {
                double x = ricochet.lastX + (ricochet.x - ricochet.lastX) * event.partialTicks - cameraX;
                double y = ricochet.lastY + (ricochet.y - ricochet.lastY) * event.partialTicks - cameraY;
                double z = ricochet.lastZ + (ricochet.z - ricochet.lastZ) * event.partialTicks - cameraZ;
                double speed = Math.sqrt(ricochet.motionX * ricochet.motionX
                        + ricochet.motionY * ricochet.motionY
                        + ricochet.motionZ * ricochet.motionZ);
                if (speed < 0.001D) {
                    continue;
                }

                double length = Math.max(0.8D, Math.min(3.4D, speed * 1.6D));
                double tailX = x - ricochet.motionX / speed * length;
                double tailY = y - ricochet.motionY / speed * length;
                double tailZ = z - ricochet.motionZ / speed * length;
                float life = 1F - ricochet.age / (float) ricochet.maxAge;

                drawLine(tailX, tailY, tailZ, x, y, z, 10F, 1F, 0F, 0F, 0.09F * life);
                drawLine(tailX, tailY, tailZ, x, y, z, 5F, 1F, 0.03F, 0F, 0.25F * life);
                drawLine(tailX, tailY, tailZ, x, y, z, 2F, 1F, 0.24F, 0.08F, 0.92F * life);
            }
        } finally {
            GL11.glPopAttrib();
            GL11.glColor4f(1F, 1F, 1F, 1F);
        }
    }

    private static void drawLine(double tailX, double tailY, double tailZ,
                                 double x, double y, double z, float width,
                                 float red, float green, float blue, float alpha) {
        GL11.glLineWidth(width);
        GL11.glColor4f(red, green, blue, alpha);
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex3d(tailX, tailY, tailZ);
        GL11.glVertex3d(x, y, z);
        GL11.glEnd();
    }

    private static final class RicochetSpawn {
        private final double x;
        private final double y;
        private final double z;
        private final double incomingX;
        private final double incomingY;
        private final double incomingZ;

        private RicochetSpawn(double x, double y, double z,
                              double incomingX, double incomingY, double incomingZ) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.incomingX = incomingX;
            this.incomingY = incomingY;
            this.incomingZ = incomingZ;
        }
    }

    private static final class Ricochet {
        private double x;
        private double y;
        private double z;
        private double lastX;
        private double lastY;
        private double lastZ;
        private double motionX;
        private double motionY;
        private double motionZ;
        private final int maxAge;
        private int age;

        private Ricochet(RicochetSpawn spawn) {
            x = lastX = spawn.x;
            y = lastY = spawn.y;
            z = lastZ = spawn.z;

            long seed = Double.doubleToLongBits(spawn.x)
                    ^ Long.rotateLeft(Double.doubleToLongBits(spawn.z), 21)
                    ^ Long.rotateLeft(Double.doubleToLongBits(spawn.incomingY), 11)
                    ^ Long.rotateLeft(Double.doubleToLongBits(spawn.incomingX + spawn.incomingZ), 42);
            Random random = new Random(seed);
            double horizontalLength = Math.sqrt(spawn.incomingX * spawn.incomingX
                    + spawn.incomingZ * spawn.incomingZ);
            double directionX;
            double directionZ;
            if (horizontalLength > 0.001D) {
                directionX = spawn.incomingX / horizontalLength;
                directionZ = spawn.incomingZ / horizontalLength;
            } else {
                double heading = random.nextDouble() * Math.PI * 2D;
                directionX = Math.cos(heading);
                directionZ = Math.sin(heading);
            }

            double deflection = (random.nextDouble() - 0.5D) * Math.toRadians(50D);
            double deflectedX = directionX * Math.cos(deflection) - directionZ * Math.sin(deflection);
            double deflectedZ = directionX * Math.sin(deflection) + directionZ * Math.cos(deflection);
            double horizontalSpeed = 1.85D + random.nextDouble() * 1.15D;
            motionX = deflectedX * horizontalSpeed;
            motionY = 1.1D + random.nextDouble() * 0.7D;
            motionZ = deflectedZ * horizontalSpeed;
            maxAge = 24 + random.nextInt(11);
        }

        private void tick() {
            lastX = x;
            lastY = y;
            lastZ = z;
            x += motionX;
            y += motionY;
            z += motionZ;
            motionX *= 0.993D;
            motionY = (motionY - 0.018D) * 0.993D;
            motionZ *= 0.993D;
            age++;
        }
    }
}
