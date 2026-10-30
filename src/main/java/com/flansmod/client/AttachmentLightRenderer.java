package com.flansmod.client;

import com.flansmod.common.guns.FlashlightState;
import com.flansmod.common.guns.item.ItemGun;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.client.model.ModelAttachment;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Map;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;
import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

/** Cosmetic surface projections. The existing held-stack toggle remains server-owned. */
@SideOnly(Side.CLIENT)
public final class AttachmentLightRenderer {
    private static final int GRID = 9;
    private static final int[] NX = {0, 0, 0, 0, -1, 1};
    private static final int[] NY = {-1, 1, 0, 0, 0, 0};
    private static final int[] NZ = {0, 0, -1, 1, 0, 0};
    private static final MovingObjectPosition[] HITS = new MovingObjectPosition[GRID * GRID];
    private static final float[] ALPHA = new float[GRID * GRID];
    private static final float[] DEPTHS = new float[GRID * GRID];
    private static final FloatBuffer MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final IntBuffer VIEWPORT_BUFFER = BufferUtils.createIntBuffer(16);
    private static final Matrix4f WORLD_CLIP = new Matrix4f();
    private static final Matrix4f WORLD_PROJECTION = new Matrix4f();
    private static final Map<AttachmentType, Vec3> HAND_ORIGINS = new IdentityHashMap<>();
    private static final Map<EntityPlayer, Emitter> EMITTERS = new WeakHashMap<>();
    private static Vec3 cameraPosition;
    private static World renderedWorld;
    private static boolean projectionPrepared;
    private static float renderPartial;

    private AttachmentLightRenderer() {
    }

    public static void render(RenderWorldLastEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        EntityLivingBase camera = mc.renderViewEntity;
        if (mc.theWorld == null || mc.thePlayer == null || camera == null) return;
        if (renderedWorld != mc.theWorld) { EMITTERS.clear(); renderedWorld = mc.theWorld; }
        HAND_ORIGINS.clear();
        renderPartial = event.partialTicks;
        projectionPrepared = false;
        cameraPosition = Vec3.createVectorHelper(
                camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * event.partialTicks,
                camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * event.partialTicks,
                camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * event.partialTicks);
        Matrix4f view = matrix(GL11.GL_MODELVIEW_MATRIX);
        WORLD_PROJECTION.load(matrix(GL11.GL_PROJECTION_MATRIX));
        Matrix4f.mul(WORLD_PROJECTION, view, WORLD_CLIP);
        boolean nightVision = NightVisionGogglesEffect.getIntensity(mc, event.partialTicks) > 0.99F
                || mc.thePlayer.isPotionActive(Potion.nightVision)
                || FlansModClient.currentScope != null && hasNightVisionScope(mc.thePlayer);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        try {
            GL11.glTranslated(-(camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * event.partialTicks),
                    -(camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * event.partialTicks),
                    -(camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * event.partialTicks));
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            GL11.glShadeModel(GL11.GL_SMOOTH);
            GL11.glEnable(GL11.GL_POLYGON_OFFSET_FILL);
            GL11.glPolygonOffset(-1F, -1F);
            // Local attachments get priority. Bound expensive cone traces independently of lasers.
            int lights = 4 - renderPlayer(mc.thePlayer, event.partialTicks, nightVision, 4);
            int players = 1;
            for (Object object : mc.theWorld.playerEntities) {
                EntityPlayer player = (EntityPlayer) object;
                if (player == mc.thePlayer || player.getDistanceSqToEntity(camera) > 64D * 64D) continue;
                if (players++ >= 16) break;
                lights -= renderPlayer(player, event.partialTicks, nightVision, lights);
            }
        } finally {
            GL11.glPopMatrix();
            GL11.glPopAttrib();
        }
    }

    private static boolean hasNightVisionScope(EntityPlayer player) {
        ItemStack stack = player.getCurrentEquippedItem();
        if (stack == null || !(stack.getItem() instanceof ItemGun)) return false;
        ItemGun gun = (ItemGun) stack.getItem();
        AttachmentType scope = gun.type.getScope(stack);
        return gun.type.allowNightVision || scope != null && scope.hasNightVision;
    }

    private static int renderPlayer(EntityPlayer player, float partial, boolean nightVision, int budget) {
        ItemStack stack = player.getCurrentEquippedItem();
        if (player.isDead || !FlashlightState.isEnabled(stack)) return 0;
        // Forge 1.7.10 uses different default eye heights for local, remote and server players.
        // Convert client positions to the server's feet + 1.62 eye origin, preserving pose offsets.
        Vec3 origin = Vec3.createVectorHelper(player.lastTickPosX + (player.posX - player.lastTickPosX) * partial,
                player.lastTickPosY + (player.posY - player.lastTickPosY) * partial
                        + 1.62D - player.yOffset + player.getEyeHeight() - player.getDefaultEyeHeight(),
                player.lastTickPosZ + (player.posZ - player.lastTickPosZ) * partial);
        Vec3 forward = player.getLook(partial);
        double yaw = (player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * partial) * Math.PI / 180D;
        Vec3 right = Vec3.createVectorHelper(Math.cos(yaw), 0D, Math.sin(yaw));
        Vec3 up = forward.crossProduct(right).normalize();
        int lights = 0;
        for (AttachmentType attachment : ((ItemGun) stack.getItem()).type.getCurrentAttachments(stack)) {
            if (attachment == null || attachment.infrared && !nightVision) continue;
            if (attachment.isLaserPointer) {
                int beams = attachment.laserBeams == 3 ? 3 : 1;
                for (int beam = 0; beam < beams; beam++) {
                    Vec3 beamOrigin = beams == 1 ? origin : triangleOrigin(origin, right, up, beam,
                            bounded(attachment.laserSpacing, 0.08F, 0.02F, 0.25F));
                    drawLaser(player, attachment, beamOrigin, forward, right);
                }
            }
            if (attachment.flashlight && lights < budget) {
                drawFlashlight(player, attachment, origin, forward, right, up);
                lights++;
            }
        }
        return lights;
    }

    private static MovingObjectPosition trace(EntityPlayer player, Vec3 origin, Vec3 direction, double range) {
        return traceBetween(player.worldObj, origin, origin.addVector(direction.xCoord * range,
                direction.yCoord * range, direction.zCoord * range));
    }

    static MovingObjectPosition traceBetween(World world, Vec3 start, Vec3 end) {
        // Forge 1.7.10 advances the supplied start vector while walking through blocks.
        // Preserve shared cone/laser origins for every subsequent ray and distance calculation.
        return world.func_147447_a(Vec3.createVectorHelper(start.xCoord, start.yCoord, start.zCoord),
                end, false, true, false);
    }

    static Vec3 triangleOrigin(Vec3 origin, Vec3 right, Vec3 up, int index, float spacing) {
        double x = index == 0 ? 0D : index == 1 ? -spacing * 0.5D : spacing * 0.5D;
        double y = spacing * (index == 0 ? 0.577350269D : -0.288675135D);
        return origin.addVector(right.xCoord * x + up.xCoord * y, right.yCoord * x + up.yCoord * y,
                right.zCoord * x + up.zCoord * y);
    }

    static AxisAlignedBB entityBounds(Entity entity, float partial) {
        return entity.boundingBox.getOffsetBoundingBox(
                (entity.lastTickPosX - entity.posX) * (1F - partial),
                (entity.lastTickPosY - entity.posY) * (1F - partial),
                (entity.lastTickPosZ - entity.posZ) * (1F - partial));
    }

    static MovingObjectPosition traceLaser(World world, Entity shooter, Vec3 start, Vec3 end, float partial) {
        MovingObjectPosition nearest = traceBetween(world, start, end);
        double distance = nearest == null ? start.distanceTo(end) : start.distanceTo(nearest.hitVec);
        Vec3 limit = nearest == null ? end : nearest.hitVec;
        AxisAlignedBB search = AxisAlignedBB.getBoundingBox(Math.min(start.xCoord, limit.xCoord),
                Math.min(start.yCoord, limit.yCoord), Math.min(start.zCoord, limit.zCoord),
                Math.max(start.xCoord, limit.xCoord), Math.max(start.yCoord, limit.yCoord),
                Math.max(start.zCoord, limit.zCoord)).expand(2D, 2D, 2D);
        // This uses loaded chunks along the bounded ray, not a world-wide entity scan.
        List entities = world.getEntitiesWithinAABBExcludingEntity(shooter, search);
        for (Object object : entities) {
            Entity entity = (Entity) object;
            if (!(entity instanceof EntityLivingBase) || entity == shooter || entity.isDead
                    || entity.isInvisible() || !entity.canBeCollidedWith()) continue;
            MovingObjectPosition hit = entityBounds(entity, partial).calculateIntercept(start, end);
            if (hit != null && start.distanceTo(hit.hitVec) < distance) {
                distance = start.distanceTo(hit.hitVec);
                nearest = new MovingObjectPosition(entity, hit.hitVec);
                nearest.sideHit = hit.sideHit;
            }
        }
        return nearest;
    }

    private static void prepareProjection() {
        if (!projectionPrepared) { FlashlightProjection.begin(WORLD_CLIP); projectionPrepared = true; }
    }

    private static void drawLaser(EntityPlayer player, AttachmentType light, Vec3 origin, Vec3 forward, Vec3 right) {
        float range = bounded(light.laserRange, 128F, 1F, 128F);
        float r = bounded(light.laserRed, 1F, 0F, 1F);
        float g = bounded(light.laserGreen, 0F, 0F, 1F);
        float b = bounded(light.laserBlue, 0F, 0F, 1F);
        boolean socket = light.infrared && light.model != null && light.model.laserEmitter != null;
        Minecraft mc = Minecraft.getMinecraft();
        if (socket && player == mc.thePlayer && mc.gameSettings.thirdPersonView == 0) {
            HAND_ORIGINS.put(light, origin);
            prepareProjection(); // Preserve world/entity depth before the first-person gun draws.
            return;
        }
        Vec3 muzzle = origin.addVector(forward.xCoord * 0.45D + right.xCoord * 0.22D,
                forward.yCoord * 0.45D - 0.20D, forward.zCoord * 0.45D + right.zCoord * 0.22D);
        Vec3 direction = forward;
        if (socket) {
            Emitter emitter = EMITTERS.get(player);
            if (emitter == null || emitter.attachment != light || emitter.stack != player.getHeldItem()
                    || System.nanoTime() - emitter.time > 200000000L) return;
            Matrix4f inverse = Matrix4f.invert(WORLD_CLIP, null);
            if (inverse == null) return;
            muzzle = unproject(inverse, emitter.clip);
            Vec3 tip = unproject(inverse, emitter.forwardClip);
            if (muzzle == null || tip == null) return;
            direction = laserDirection(muzzle, origin, forward, directionBetween(muzzle, tip), emitter.pose);
        }
        if (light.infrared && traceBetween(player.worldObj, origin, muzzle) != null) return;
        Vec3 rayOrigin = socket ? muzzle : origin;
        MovingObjectPosition hit = traceLaser(player.worldObj, player, rayOrigin,
                rayOrigin.addVector(direction.xCoord * range, direction.yCoord * range, direction.zCoord * range), renderPartial);
        drawSpot(light, hit, rayOrigin, direction, r, g, b);
        if (light.infrared) {
            // Let scene depth stop the beam on actual skin, including gaps between animated limbs.
            Vec3 end = rayOrigin.addVector(direction.xCoord * range, direction.yCoord * range, direction.zCoord * range);
            MovingObjectPosition obstruction = traceBetween(player.worldObj, muzzle, end);
            if (obstruction != null) end = obstruction.hitVec;
            drawBeam(muzzle, end, r, g, b, 0.024D, 0.30F);
            drawBeam(muzzle, end, Math.min(1F, r + 0.3F), Math.min(1F, g + 0.3F),
                    Math.min(1F, b + 0.3F), 0.008D, 0.90F);
        }
    }

    private static void drawSpot(AttachmentType light, MovingObjectPosition hit, Vec3 origin,
                                 Vec3 direction, float r, float g, float b) {
        float brightness = bounded(light.laserBrightness, 2F, 0.5F, 5F);
        if (hit != null) {
            // Brightness controls intensity, not spot size; cap the small range compensation.
            float size = (float) Math.min(1.5D, 1D + origin.distanceTo(hit.hitVec) * 0.005D)
                    * bounded(light.laserDotScale, 1F, 0.25F, 1F);
            if (hit.entityHit != null) {
                prepareProjection();
                float range = bounded(light.laserRange, 128F, 1F, 128F);
                MovingObjectPosition behind = traceBetween(renderedWorld, origin, origin.addVector(
                        direction.xCoord * range, direction.yCoord * range, direction.zCoord * range));
                if (behind != null) drawSpot(light, behind, origin, direction, r, g, b);
                AxisAlignedBB bounds = entityBounds(hit.entityHit, renderPartial).expand(0.01D, 0.01D, 0.01D);
                Vec3 relative = Vec3.createVectorHelper(origin.xCoord - cameraPosition.xCoord,
                        origin.yCoord - cameraPosition.yCoord, origin.zCoord - cameraPosition.zCoord);
                AxisAlignedBB relativeBounds = bounds.getOffsetBoundingBox(-cameraPosition.xCoord,
                        -cameraPosition.yCoord, -cameraPosition.zCoord);
                if (FlashlightProjection.drawLaserSpot(relative, direction, relativeBounds, WORLD_CLIP,
                        0.036F * size, brightness, r, g, b)) return;
            }
            drawDisc(hit, 0.036F * size, r, g, b, Math.min(0.7F, brightness * 0.16F));
            drawDisc(hit, 0.020F * size, r, g, b, Math.min(1F, brightness * 0.40F));
            drawDisc(hit, 0.009F * size, Math.min(1F, r + 0.40F),
                    Math.min(1F, g + 0.40F), Math.min(1F, b + 0.40F), 1F);
        }
    }

    static Vec3 laserDirection(Vec3 muzzle, Vec3 eye, Vec3 aim, Vec3 posed, float pose) {
        // Fixed 50-block zero: nearby surfaces retain parallax instead of pulling the beam to screen center.
        Vec3 aligned = directionBetween(muzzle, eye.addVector(aim.xCoord * 50D, aim.yCoord * 50D, aim.zCoord * 50D));
        float blend = bounded(pose, 0F, 0F, 1F);
        blend = blend * blend * (3F - 2F * blend);
        Vec3 result = Vec3.createVectorHelper(aligned.xCoord * (1F - blend) + posed.xCoord * blend,
                aligned.yCoord * (1F - blend) + posed.yCoord * blend,
                aligned.zCoord * (1F - blend) + posed.zCoord * blend);
        return result.lengthVector() < 0.00001D ? aligned : result.normalize();
    }

    private static Vec3 directionBetween(Vec3 from, Vec3 to) {
        return Vec3.createVectorHelper(to.xCoord - from.xCoord, to.yCoord - from.yCoord, to.zCoord - from.zCoord).normalize();
    }

    private static Vec3 unproject(Matrix4f inverse, Vector4f point) {
        Vector4f value = Matrix4f.transform(inverse, point, null);
        return Math.abs(value.w) < 0.00001F ? null
                : cameraPosition.addVector(value.x / value.w, value.y / value.w, value.z / value.w);
    }

    private static void drawBeam(Vec3 start, Vec3 end, float r, float g, float b, double width, float alpha) {
        Minecraft mc = Minecraft.getMinecraft();
        EntityLivingBase camera = mc.renderViewEntity;
        Vec3 view = Vec3.createVectorHelper(camera.posX - start.xCoord,
                camera.posY - start.yCoord, camera.posZ - start.zCoord);
        Vec3 along = end.subtract(start);
        Vec3 side = along.crossProduct(view);
        if (side.lengthVector() < 0.00001D) side = along.crossProduct(camera.getLook(1F));
        if (side.lengthVector() < 0.00001D) return;
        side = side.normalize();
        // Camera-facing ribbons work even when drivers clamp OpenGL line width to one pixel.
        double nearWidth = width * (1D + view.lengthVector() * 0.03D);
        double farWidth = width * (1D + camera.getDistance(end.xCoord, end.yCoord, end.zCoord) * 0.03D);
        Tessellator tess = Tessellator.instance;
        tess.startDrawingQuads();
        tess.setBrightness(15728880);
        tess.setColorRGBA_F(r, g, b, alpha);
        tess.addVertex(start.xCoord - side.xCoord * nearWidth, start.yCoord - side.yCoord * nearWidth,
                start.zCoord - side.zCoord * nearWidth);
        tess.addVertex(start.xCoord + side.xCoord * nearWidth, start.yCoord + side.yCoord * nearWidth,
                start.zCoord + side.zCoord * nearWidth);
        tess.addVertex(end.xCoord + side.xCoord * farWidth, end.yCoord + side.yCoord * farWidth,
                end.zCoord + side.zCoord * farWidth);
        tess.addVertex(end.xCoord - side.xCoord * farWidth, end.yCoord - side.yCoord * farWidth,
                end.zCoord - side.zCoord * farWidth);
        tess.draw();
    }

    private static void drawDisc(MovingObjectPosition hit, float radius, float r, float g, float b, float alpha) {
        Tessellator tess = Tessellator.instance;
        tess.startDrawing(GL11.GL_TRIANGLE_FAN);
        tess.setBrightness(15728880);
        tess.setColorRGBA_F(r, g, b, alpha);
        surfaceVertex(tess, hit, 0D, 0D);
        tess.setColorRGBA_F(r, g, b, 0F);
        for (int i = 0; i <= 20; i++) {
            double angle = i * Math.PI / 10D;
            surfaceVertex(tess, hit, Math.cos(angle) * radius, Math.sin(angle) * radius);
        }
        tess.draw();
    }

    private static void surfaceVertex(Tessellator tess, MovingObjectPosition hit, double u, double v) {
        int side = hit.sideHit;
        tess.addVertex(hit.hitVec.xCoord + NX[side] * 0.003D + (side < 4 ? u : 0D),
                hit.hitVec.yCoord + NY[side] * 0.003D + (side >= 2 ? v : 0D),
                hit.hitVec.zCoord + NZ[side] * 0.003D + (side < 2 ? v : side >= 4 ? u : 0D));
    }

    private static void drawFlashlight(EntityPlayer player, AttachmentType light, Vec3 origin,
                                      Vec3 forward, Vec3 right, Vec3 up) {
        float range = bounded(light.flashlightRange, 10F, 1F, 64F);
        double spread = Math.tan(Math.toRadians(bounded(light.flashlightConeAngle, 34F, 3F, 40F)));
        for (int y = 0; y < GRID; y++) {
            for (int x = 0; x < GRID; x++) {
                int index = y * GRID + x;
                double u = x * 2D / (GRID - 1) - 1D, v = y * 2D / (GRID - 1) - 1D;
                double radiusSq = u * u + v * v;
                HITS[index] = null;
                DEPTHS[index] = 1F;
                if (radiusSq > 1.01D) continue;
                Vec3 direction = forward.addVector((right.xCoord * u + up.xCoord * v) * spread,
                        (right.yCoord * u + up.yCoord * v) * spread,
                        (right.zCoord * u + up.zCoord * v) * spread).normalize();
                MovingObjectPosition hit = trace(player, origin, direction, range);
                HITS[index] = hit;
                if (hit != null) {
                    double distance = origin.distanceTo(hit.hitVec);
                    DEPTHS[index] = (float) (distance / range);
                    double incidence = Math.abs(direction.xCoord * NX[hit.sideHit]
                            + direction.yCoord * NY[hit.sideHit] + direction.zCoord * NZ[hit.sideHit]);
                    double rangeFade = Math.min(1D, Math.max(0D, (range - distance) / (range * 0.2D)));
                    ALPHA[index] = (float) ((1D - Math.min(1D, radiusSq)) * (1D - radiusSq)
                            * rangeFade / (1D + distance * distance / 225D) * Math.sqrt(incidence))
                            * Math.max(0, Math.min(15, light.flashlightStrength)) / 15F;
                }
            }
        }
        prepareProjection();
        Minecraft mc = Minecraft.getMinecraft();
        boolean needsShadow = player != mc.thePlayer || mc.gameSettings.thirdPersonView != 0
                || mc.renderViewEntity != mc.thePlayer;
        Vec3 relativeOrigin = Vec3.createVectorHelper(origin.xCoord - cameraPosition.xCoord,
                origin.yCoord - cameraPosition.yCoord, origin.zCoord - cameraPosition.zCoord);
        if (FlashlightProjection.draw(relativeOrigin, forward, right, up, (float) spread, range,
                Math.max(0, Math.min(15, light.flashlightStrength)) / 15F, DEPTHS, needsShadow)) return;
        Tessellator tess = Tessellator.instance;
        tess.startDrawing(GL11.GL_TRIANGLES);
        tess.setBrightness(15728880);
        for (int y = 0; y < GRID - 1; y++) {
            for (int x = 0; x < GRID - 1; x++) {
                int a = y * GRID + x;
                triangle(tess, a, a + 1, a + GRID);
                triangle(tess, a + 1, a + GRID + 1, a + GRID);
            }
        }
        tess.draw();
    }

    private static void triangle(Tessellator tess, int a, int b, int c) {
        MovingObjectPosition first = HITS[a], second = HITS[b], third = HITS[c];
        if (first == null || second == null || third == null) return;
        int side = first.sideHit;
        // Never stretch a projected triangle across a corner or a depth discontinuity.
        if (second.sideHit != side || third.sideHit != side
                || planeDistance(first, second) > 0.01D || planeDistance(first, third) > 0.01D) return;
        tess.setColorRGBA_F(1F, 0.96F, 0.85F, ALPHA[a]);
        surfaceVertex(tess, first, 0D, 0D);
        tess.setColorRGBA_F(1F, 0.96F, 0.85F, ALPHA[b]);
        surfaceVertex(tess, second, 0D, 0D);
        tess.setColorRGBA_F(1F, 0.96F, 0.85F, ALPHA[c]);
        surfaceVertex(tess, third, 0D, 0D);
    }

    private static double planeDistance(MovingObjectPosition a, MovingObjectPosition b) {
        return Math.abs((a.hitVec.xCoord - b.hitVec.xCoord) * NX[a.sideHit]
                + (a.hitVec.yCoord - b.hitVec.yCoord) * NY[a.sideHit]
                + (a.hitVec.zCoord - b.hitVec.zCoord) * NZ[a.sideHit]);
    }

    private static float bounded(float value, float fallback, float min, float max) {
        return Float.isNaN(value) || Float.isInfinite(value) ? fallback : Math.max(min, Math.min(max, value));
    }

    private static Matrix4f matrix(int name) {
        MATRIX_BUFFER.clear(); GL11.glGetFloat(name, MATRIX_BUFFER);
        Matrix4f result = new Matrix4f(); result.load(MATRIX_BUFFER); return result;
    }

    /** Called inside the attachment's complete pose/scale transform, before its housing draws. */
    public static void renderEmitter(AttachmentType attachment, ModelAttachment model, ItemStack gun,
                                     EntityLivingBase owner, float scale, boolean firstPerson, float pose, float partial) {
        if (!(owner instanceof EntityPlayer) || model.laserEmitter == null || !attachment.infrared
                || !attachment.isLaserPointer || !FlashlightState.isEnabled(gun)
                || gun != ((EntityPlayer) owner).getHeldItem()
                || ThermalScopeEffect.isRenderingScopedWorld()) return;
        Matrix4f view = matrix(GL11.GL_MODELVIEW_MATRIX);
        Matrix4f projection = matrix(GL11.GL_PROJECTION_MATRIX);
        Vector4f socket = new Vector4f(model.laserEmitter.x * scale, model.laserEmitter.y * scale,
                model.laserEmitter.z * scale, 1F);
        Vector4f eye = Matrix4f.transform(view, socket, null);
        Vector4f start = Matrix4f.transform(projection, eye, null);
        Vector4f tipEye = Matrix4f.transform(view, new Vector4f(socket.x + scale, socket.y, socket.z, 1F), null);
        if (!firstPerson) {
            EMITTERS.put((EntityPlayer) owner, new Emitter(attachment, gun, start,
                    Matrix4f.transform(projection, tipEye, null), pose));
            return;
        }
        Vec3 eyeOrigin = HAND_ORIGINS.get(attachment);
        if (eyeOrigin == null || cameraPosition == null || renderedWorld != owner.worldObj) return;
        start = handClip(eye, projection);
        Vector4f tip = handClip(tipEye, projection);
        Matrix4f inverse = Matrix4f.invert(WORLD_CLIP, null);
        if (start == null || tip == null || inverse == null || start.w <= 0.05F) return;
        Vec3 muzzle = unproject(inverse, start), tipWorld = unproject(inverse, tip);
        if (muzzle == null || tipWorld == null || traceBetween(owner.worldObj, eyeOrigin, muzzle) != null) return;
        Vec3 direction = laserDirection(muzzle, eyeOrigin, owner.getLook(partial),
                directionBetween(muzzle, tipWorld), pose);
        float range = bounded(attachment.laserRange, 128F, 1F, 128F);
        Vec3 target = muzzle.addVector(direction.xCoord * range, direction.yCoord * range, direction.zCoord * range);
        MovingObjectPosition hit = traceLaser(owner.worldObj, owner, muzzle, target, partial);
        MovingObjectPosition blockHit = traceBetween(owner.worldObj, muzzle, target);
        if (blockHit != null) target = blockHit.hitVec;
        Vector4f end = Matrix4f.transform(WORLD_CLIP, new Vector4f(
                (float) (target.xCoord - cameraPosition.xCoord),
                (float) (target.yCoord - cameraPosition.yCoord),
                (float) (target.zCoord - cameraPosition.zCoord), 1F), null);
        // A lowered/reloading gun can point behind the camera. Clip the straight segment at the near plane.
        if (end.w < 0.05F) {
            float t = (start.w - 0.05F) / (start.w - end.w);
            end = new Vector4f(start.x + (end.x - start.x) * t, start.y + (end.y - start.y) * t,
                    start.z + (end.z - start.z) * t, 0.05F);
        }
        start = new Vector4f(start.x / start.w, start.y / start.w, start.z / start.w, 1F);
        end = new Vector4f(end.x / end.w, end.y / end.w, end.z / end.w, 1F);
        float r = bounded(attachment.laserRed, 1F, 0F, 1F);
        float g = bounded(attachment.laserGreen, 0F, 0F, 1F);
        float b = bounded(attachment.laserBlue, 0F, 0F, 1F);
        drawHandLaser(start, end, r, g, b, attachment, hit, muzzle, direction);
    }

    private static Vector4f handClip(Vector4f eye, Matrix4f projection) {
        Vector4f screen = Matrix4f.transform(projection, eye, null);
        Vector4f depth = Matrix4f.transform(WORLD_PROJECTION, eye, null);
        if (Math.abs(screen.w) < 0.00001F || Math.abs(depth.w) < 0.00001F) return null;
        return new Vector4f(screen.x / screen.w * depth.w, screen.y / screen.w * depth.w, depth.z, depth.w);
    }

    static void drawHandBeam(Vector4f start, Vector4f end, float r, float g, float b) {
        drawHandLaser(start, end, r, g, b, null, null, null, null);
    }

    private static void drawHandLaser(Vector4f start, Vector4f end, float r, float g, float b,
                                      AttachmentType attachment, MovingObjectPosition hit, Vec3 muzzle, Vec3 direction) {
        GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT_BUFFER);
        boolean shaders = GLContext.getCapabilities().OpenGL20;
        int previousProgram = shaders ? GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM) : 0;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix(); GL11.glLoadIdentity();
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix(); GL11.glLoadIdentity();
        try {
            if (shaders) GL20.glUseProgram(0);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit); GL11.glDisable(GL11.GL_TEXTURE_2D);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit); GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_ALPHA_TEST); GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(false); GL11.glDepthRange(0D, 1D);
            GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            if (hit != null) {
                MATRIX_BUFFER.clear(); WORLD_CLIP.store(MATRIX_BUFFER); MATRIX_BUFFER.flip();
                GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadMatrix(MATRIX_BUFFER);
                GL11.glMatrixMode(GL11.GL_MODELVIEW);
                GL11.glTranslated(-cameraPosition.xCoord, -cameraPosition.yCoord, -cameraPosition.zCoord);
                drawSpot(attachment, hit, muzzle, direction, r, g, b);
                GL11.glLoadIdentity(); GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
                GL11.glMatrixMode(GL11.GL_MODELVIEW);
            }
            clipRibbon(start, end, 3F, r, g, b, 0.25F);
            clipRibbon(start, end, 0.9F, Math.min(1F, r + 0.3F), Math.min(1F, g + 0.3F),
                    Math.min(1F, b + 0.3F), 0.9F);
        } finally {
            if (shaders) GL20.glUseProgram(previousProgram);
            GL11.glPopMatrix(); GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix();
            GL11.glPopAttrib();
        }
    }

    private static void clipRibbon(Vector4f start, Vector4f end, float width,
                                   float r, float g, float b, float alpha) {
        float w = VIEWPORT_BUFFER.get(2), h = VIEWPORT_BUFFER.get(3);
        double dx = (end.x - start.x) * w, dy = (end.y - start.y) * h;
        double length = Math.sqrt(dx * dx + dy * dy);
        if (length < 0.001D || w <= 0 || h <= 0) return;
        double sx = -dy / length * width * 2D / w, sy = dx / length * width * 2D / h;
        Tessellator tess = Tessellator.instance;
        tess.startDrawingQuads(); tess.setBrightness(15728880); tess.setColorRGBA_F(r, g, b, alpha);
        tess.addVertex(start.x - sx, start.y - sy, start.z);
        tess.addVertex(start.x + sx, start.y + sy, start.z);
        tess.addVertex(end.x + sx, end.y + sy, end.z);
        tess.addVertex(end.x - sx, end.y - sy, end.z);
        tess.draw();
    }

    private static final class Emitter {
        final AttachmentType attachment;
        final ItemStack stack;
        final Vector4f clip;
        final Vector4f forwardClip;
        final float pose;
        final long time = System.nanoTime();
        Emitter(AttachmentType attachment, ItemStack stack, Vector4f clip, Vector4f forwardClip, float pose) {
            this.attachment = attachment; this.stack = stack; this.clip = clip;
            this.forwardClip = forwardClip; this.pose = pose;
        }
    }
}
