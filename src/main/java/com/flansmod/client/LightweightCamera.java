package com.flansmod.client;

import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.util.ResourceLocation;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.BufferUtils;
import java.nio.ByteBuffer;

/** A dedicated small world pass. Never calls EntityRenderer.renderWorld. */
final class LightweightCamera {
    private static final ResourceLocation SUN = new ResourceLocation("textures/environment/sun.png");
    private final FloatBuffer skyModelView = BufferUtils.createFloatBuffer(16);
    private Framebuffer target;
    private CameraTerrain terrain;
    private boolean checked;
    private Method angelicaInstance;
    private String failure = "";
    private boolean failed;
    private int sensorLightmap;
    private final DistantCameraGeometry distant = new DistantCameraGeometry();

    String failure() { return failure; }
    void capture(CameraView source) { distant.capture(source); }

    Framebuffer render(Minecraft mc, CameraView view, boolean thermal) {
        if (failed) return null;
        int draw = GL11.glGetInteger(org.lwjgl.opengl.GL30.GL_DRAW_FRAMEBUFFER_BINDING);
        int read = ThermalFramebuffers.canBlit() ? GL11.glGetInteger(org.lwjgl.opengl.GL30.GL_READ_FRAMEBUFFER_BINDING) : draw;
        int program = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushClientAttrib(GL11.GL_CLIENT_VERTEX_ARRAY_BIT | GL11.GL_CLIENT_PIXEL_STORE_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix();
        try {
            if (!selectTerrain()) return null;
            if (target == null || target.framebufferWidth != view.width || target.framebufferHeight != view.height) {
                if (target != null) target.deleteFramebuffer();
                target = new Framebuffer(view.width, view.height, true);
            }
            target.bindFramebuffer(true);
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadMatrix(view.projection);
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadMatrix(view.modelView);
            GL11.glDisable(GL11.GL_SCISSOR_TEST); GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glColorMask(true, true, true, true); GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDisable(GL11.GL_BLEND); GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
            GL11.glEnable(GL11.GL_TEXTURE_2D); GL11.glEnable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_ALPHA_TEST); GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
            Vec3 sky = mc.theWorld.getSkyColor(mc.renderViewEntity, view.partialTicks);
            GL11.glClearColor((float)sky.xCoord, (float)sky.yCoord, (float)sky.zCoord, 1);
            GL11.glClearDepth(1); GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            if (!mc.theWorld.provider.hasNoSky) {
                mc.getTextureManager().bindTexture(SUN);
                drawSun(view, mc.theWorld.getCelestialAngle(view.partialTicks), 1 - mc.theWorld.getRainStrength(view.partialTicks));
            }
            if (!terrain.begin(view)) return null;
            if (!distant.begin(view)) { failure = "DH camera: " + distant.failure(); return null; }
            mc.entityRenderer.enableLightmap(view.partialTicks);
            if (thermal) bindSensorLightmap();
            if (!distant.draw(view, 0)) { failure = "DH geometry unavailable: " + distant.failure(); return null; }
            mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
            GL11.glColor4f(1, 1, 1, 1);
            terrain.draw(0);
            GL20.glUseProgram(0);
            RenderHelper.enableStandardItemLighting();
            for (Object object : mc.theWorld.loadedEntityList) {
                Entity entity = (Entity)object;
                if (entity.isDead || entity == mc.renderViewEntity && mc.gameSettings.thirdPersonView == 0) continue;
                AxisAlignedBB box = entity.boundingBox;
                if (box == null || !view.visible(box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ)) continue;
                Render renderer = RenderManager.instance.getEntityRenderObject(entity);
                if (renderer == null) continue;
                double x = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * view.partialTicks;
                double y = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * view.partialTicks;
                double z = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * view.partialTicks;
                renderer.doRender(entity, x - RenderManager.renderPosX, y - RenderManager.renderPosY,
                        z - RenderManager.renderPosZ, entity.prevRotationYaw
                        + (entity.rotationYaw - entity.prevRotationYaw) * view.partialTicks, view.partialTicks);
            }
            for (Object object : mc.theWorld.loadedTileEntityList) {
                TileEntity tile = (TileEntity)object;
                AxisAlignedBB box = tile.getRenderBoundingBox();
                if (box != null && view.visible(box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ))
                    TileEntityRendererDispatcher.instance.renderTileEntity(tile, view.partialTicks);
            }
            ThermalRenderApi.renderCameraGeometry(view.partialTicks);
            RenderHelper.disableStandardItemLighting();
            mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
            GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            if (thermal) bindSensorLightmap();
            if (!distant.draw(view, 1)) { failure = "DH geometry unavailable: " + distant.failure(); return null; }
            terrain.draw(1);
            GL20.glUseProgram(0);
            ThermalRenderApi.renderParticles(new Runnable() {
                @Override public void run() {
                    mc.effectRenderer.renderLitParticles(mc.renderViewEntity, view.partialTicks);
                    mc.effectRenderer.renderParticles(mc.renderViewEntity, view.partialTicks);
                }
            });
            mc.entityRenderer.enableLightmap(view.partialTicks);
            if (thermal) bindSensorLightmap();
            CameraWeather.render(mc, view);
            failure = "";
            return target;
        } catch (ReflectiveOperationException | RuntimeException | LinkageError problem) {
            failure = problem.toString();
            failed = true;
            return null;
        } finally {
            try {
                if (terrain != null) terrain.close();
            } catch (RuntimeException | LinkageError problem) {
                failure = problem.toString();
                failed = true;
            } finally {
                mc.entityRenderer.disableLightmap(view.partialTicks);
                GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPopMatrix();
                GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix(); GL11.glMatrixMode(matrixMode);
                GL20.glUseProgram(program);
                if (ThermalFramebuffers.canBlit()) {
                    ThermalFramebuffers.bind(org.lwjgl.opengl.GL30.GL_READ_FRAMEBUFFER, read);
                    ThermalFramebuffers.bind(org.lwjgl.opengl.GL30.GL_DRAW_FRAMEBUFFER, draw);
                } else ThermalFramebuffers.bind(org.lwjgl.opengl.GL30.GL_FRAMEBUFFER, draw);
                GL11.glPopClientAttrib(); GL11.glPopAttrib();
            }
        }
    }

    void drawSun(CameraView view, float angle, float visibility) {
        int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix();
        try {
            for (int i = 0; i < 16; i++) skyModelView.put(i, view.modelView.get(i));
            // Celestial directions are at infinity; camera bob/eye translation must not move them.
            skyModelView.put(12, 0); skyModelView.put(13, 0); skyModelView.put(14, 0);
            GL11.glLoadMatrix(skyModelView);
            GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL13.glActiveTexture(GL13.GL_TEXTURE0); GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_MODE, GL11.GL_MODULATE);
            GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST); GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            GL11.glColor4f(1, 1, 1, visibility);
            GL11.glScalef(0.01F, 0.01F, 0.01F);
            GL11.glRotatef(-90, 0, 1, 0); GL11.glRotatef(angle * 360, 1, 0, 0);
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glTexCoord2f(0, 0); GL11.glVertex3f(-30, 100, -30);
            GL11.glTexCoord2f(1, 0); GL11.glVertex3f(30, 100, -30);
            GL11.glTexCoord2f(1, 1); GL11.glVertex3f(30, 100, 30);
            GL11.glTexCoord2f(0, 1); GL11.glVertex3f(-30, 100, 30);
            GL11.glEnd();
        } finally {
            GL11.glPopMatrix(); GL11.glMatrixMode(matrixMode); GL11.glPopAttrib();
            GL13.glActiveTexture(activeTexture);
        }
    }

    private void bindSensorLightmap() {
        // Device gain must not be replaced by the player's gamma-adjusted vanilla lightmap.
        GL13.glActiveTexture(GL13.GL_TEXTURE1);
        if (sensorLightmap == 0) {
            sensorLightmap = GL11.glGenTextures();
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, sensorLightmap);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, org.lwjgl.opengl.GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, org.lwjgl.opengl.GL12.GL_CLAMP_TO_EDGE);
            ByteBuffer pixel = BufferUtils.createByteBuffer(4);
            pixel.put((byte)160).put((byte)160).put((byte)160).put((byte)255).flip();
            GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, 1, 1, 0,
                    GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, pixel);
        } else GL11.glBindTexture(GL11.GL_TEXTURE_2D, sensorLightmap);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
    }

    private boolean selectTerrain() throws ReflectiveOperationException {
        if (!checked) {
            checked = true;
            try {
                Class<?> renderer = Class.forName("com.gtnewhorizons.angelica.rendering.celeritas.CeleritasWorldRenderer");
                angelicaInstance = renderer.getMethod("getInstanceOrNull");
            } catch (ClassNotFoundException absent) { angelicaInstance = null; }
        }
        boolean angelica = angelicaInstance != null && angelicaInstance.invoke(null) != null;
        if (angelica && (terrain == null || terrain instanceof VanillaCameraTerrain)) {
            if (terrain != null) terrain.destroy();
            terrain = (CameraTerrain)Class.forName("com.flansmod.client.compat.AngelicaCameraTerrain").newInstance();
        } else if (!angelica && !(terrain instanceof VanillaCameraTerrain)) {
            if (terrain != null) terrain.destroy();
            terrain = new VanillaCameraTerrain();
        }
        return terrain != null;
    }

    void destroy() {
        distant.destroy();
        if (terrain != null) terrain.destroy();
        terrain = null;
        if (target != null) target.deleteFramebuffer();
        target = null;
        if (sensorLightmap != 0) GL11.glDeleteTextures(sensorLightmap);
        sensorLightmap = 0;
        failed = false;
    }
}
