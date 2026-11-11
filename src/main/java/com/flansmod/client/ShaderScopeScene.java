package com.flansmod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

/** Scene submission only for the optional Flans shader scope; no world events or primary visibility updates. */
final class ShaderScopeScene {
    private final AngelicaCameraBridge scope;
    private final CameraTerrain terrain;
    private final DistantCameraGeometry distant = new DistantCameraGeometry();
    private int nativeCoverage, coverageWidth, coverageHeight;
    ShaderScopeScene(AngelicaCameraBridge scope, CameraTerrain terrain) { this.scope = scope; this.terrain = terrain; }
    void capture(CameraView primary) { distant.capture(primary); }
    boolean draw(Minecraft mc, CameraView view) {
        try {
            if (!terrain.begin(view)) return false;
            mc.entityRenderer.enableLightmap(view.partialTicks);
            mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
            GL11.glColor4f(1, 1, 1, 1); terrain.draw(0);
            scope.phase("ENTITIES");
            try {
                RenderHelper.enableStandardItemLighting();
                for (Object value : mc.theWorld.loadedEntityList) {
                    Entity entity = (Entity) value;
                    if (entity.isDead || entity == mc.renderViewEntity && mc.gameSettings.thirdPersonView == 0) continue;
                    AxisAlignedBB box = entity.boundingBox;
                    if (box == null || !view.visible(box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ)) continue;
                    Render renderer = RenderManager.instance.getEntityRenderObject(entity);
                    if (renderer == null || forwardActor(entity)) continue;
                    double x = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * view.partialTicks;
                    double y = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * view.partialTicks;
                    double z = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * view.partialTicks;
                    RenderManager.instance.renderEntityWithPosYaw(entity, x - view.x, y - view.y, z - view.z,
                        entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * view.partialTicks, view.partialTicks);
                }
                scope.phase("BLOCK_ENTITIES");
                for (Object value : mc.theWorld.loadedTileEntityList) {
                    TileEntity tile = (TileEntity) value;
                    AxisAlignedBB box = tile.getRenderBoundingBox();
                    if (box != null && view.visible(box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ))
                        TileEntityRendererDispatcher.instance.renderTileEntity(tile, view.partialTicks);
                }
            } finally { RenderHelper.disableStandardItemLighting(); }
            scope.beginTranslucents();
            mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
            GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            terrain.draw(1);
            scope.phase("PARTICLES");
            ThermalRenderApi.renderParticles(() -> {
                mc.effectRenderer.renderLitParticles(mc.renderViewEntity, view.partialTicks);
                mc.effectRenderer.renderParticles(mc.renderViewEntity, view.partialTicks);
            });
            scope.phase("RAIN_SNOW"); mc.entityRenderer.enableLightmap(view.partialTicks); CameraWeather.render(mc, view);
            return true;
        } finally { terrain.close(); }
    }
    /** Keep the established actor/DH depth mapping out of shaderpack temporal history. */
    boolean drawForward(Minecraft mc, CameraView view) {
        if (!distant.begin(view)) return false;
        snapshotNativeCoverage(view);
        GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthFunc(GL11.GL_LEQUAL); GL11.glDepthMask(true);
        GL11.glDisable(GL11.GL_BLEND); GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
        GL11.glColorMask(true, true, true, true); GL11.glColor4f(1, 1, 1, 1);
        org.lwjgl.opengl.GL13.glActiveTexture(org.lwjgl.opengl.GL13.GL_TEXTURE0);
        GL11.glEnable(GL11.GL_TEXTURE_2D); GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_ALPHA_TEST); GL11.glAlphaFunc(GL11.GL_GREATER, 0.1f);
        mc.entityRenderer.enableLightmap(view.partialTicks);
        if (!distant.draw(view, 0, nativeCoverage) || !DistantActorCamera.begin(view, false)) return false;
        try {
            RenderHelper.enableStandardItemLighting();
            for (Object value : mc.theWorld.loadedEntityList) {
                Entity entity = (Entity) value;
                if (!forwardActor(entity) || entity.isDead || entity == mc.renderViewEntity && mc.gameSettings.thirdPersonView == 0) continue;
                AxisAlignedBB box = entity.boundingBox;
                if (box == null || !view.visible(box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ)) continue;
                Render renderer = RenderManager.instance.getEntityRenderObject(entity);
                if (renderer == null || DistantActorCamera.renderNative(entity)) continue;
                double x = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * view.partialTicks;
                double y = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * view.partialTicks;
                double z = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * view.partialTicks;
                renderer.doRender(entity, x - view.x, y - view.y, z - view.z,
                    entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * view.partialTicks, view.partialTicks);
            }
            ThermalRenderApi.renderCameraGeometry(view.partialTicks);
        } finally { try { DistantActorCamera.end(); } finally { RenderHelper.disableStandardItemLighting(); } }
        mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        return distant.draw(view, 1, nativeCoverage);
    }
    /** Native geometry owns its pixels. Never compare overlapping LOD surfaces
     * against the shaderpack's jittered native depth using the auxiliary encoding. */
    private void snapshotNativeCoverage(CameraView view) {
        int read = GL11.glGetInteger(org.lwjgl.opengl.GL30.GL_READ_FRAMEBUFFER_BINDING);
        int draw = GL11.glGetInteger(org.lwjgl.opengl.GL30.GL_DRAW_FRAMEBUFFER_BINDING);
        int active = GL11.glGetInteger(org.lwjgl.opengl.GL13.GL_ACTIVE_TEXTURE);
        org.lwjgl.opengl.GL13.glActiveTexture(org.lwjgl.opengl.GL13.GL_TEXTURE3);
        int texture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        try {
            if (nativeCoverage == 0) nativeCoverage = GL11.glGenTextures();
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, nativeCoverage);
            if (coverageWidth != view.width || coverageHeight != view.height) {
                GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
                GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
                GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, org.lwjgl.opengl.GL12.GL_CLAMP_TO_EDGE);
                GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, org.lwjgl.opengl.GL12.GL_CLAMP_TO_EDGE);
                GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, org.lwjgl.opengl.GL14.GL_DEPTH_COMPONENT24,
                    view.width, view.height, 0, GL11.GL_DEPTH_COMPONENT, GL11.GL_UNSIGNED_INT, (java.nio.ByteBuffer) null);
                coverageWidth = view.width; coverageHeight = view.height;
            }
            // Read the private scope output, not whichever read FBO the final pass left bound.
            ThermalFramebuffers.bind(org.lwjgl.opengl.GL30.GL_READ_FRAMEBUFFER, draw);
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0, 0, 0, view.width, view.height);
        } finally {
            ThermalFramebuffers.bind(org.lwjgl.opengl.GL30.GL_READ_FRAMEBUFFER, read);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);
            org.lwjgl.opengl.GL13.glActiveTexture(active);
        }
    }
    private static boolean forwardActor(Entity entity) {
        if (entity instanceof net.minecraft.entity.player.EntityPlayer) return true;
        for (Class<?> type = entity.getClass(); type != null; type = type.getSuperclass())
            if (type.getName().equals("mcheli.aircraft.MCH_EntityAircraft")) return true;
        return false;
    }
    void destroy() {
        terrain.destroy(); distant.destroy();
        if (nativeCoverage != 0) GL11.glDeleteTextures(nativeCoverage);
        nativeCoverage = coverageWidth = coverageHeight = 0;
    }
}
