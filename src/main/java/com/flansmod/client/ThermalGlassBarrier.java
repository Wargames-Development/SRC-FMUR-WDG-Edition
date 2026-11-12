package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

/** Glass blocks thermal acquisition; only nonempty, visible client sections are inspected. */
@SideOnly(Side.CLIENT)
final class ThermalGlassBarrier {
    private final RenderBlocks blocks = new RenderBlocks();

    void render(Minecraft minecraft, CameraView view) {
        int radius = Math.max(1, Math.min(32, minecraft.gameSettings.renderDistanceChunks)) + 1;
        int centerX = net.minecraft.util.MathHelper.floor_double(view.x) >> 4;
        int centerZ = net.minecraft.util.MathHelper.floor_double(view.z) >> 4;
        int program = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int active = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        blocks.blockAccess = minecraft.theWorld;
        Tessellator tessellator = Tessellator.instance;
        try {
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            minecraft.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_BLEND);
            // Clear pixels in glass textures are still a physical infrared barrier.
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(true);
            GL11.glColorMask(true, true, true, true);
            tessellator.setTranslation(-view.x, -view.y, -view.z);
            tessellator.startDrawingQuads();
            try {
                for (int cz = centerZ - radius; cz <= centerZ + radius; cz++) {
                    for (int cx = centerX - radius; cx <= centerX + radius; cx++) {
                        if (!view.visible(cx * 16D, 0, cz * 16D, cx * 16D + 16, 256, cz * 16D + 16)) continue;
                        // WorldClient's provider returns an empty placeholder for absent
                        // chunks. This never requests or generates world/chunk data.
                        Chunk chunk = minecraft.theWorld.getChunkFromChunkCoords(cx, cz);
                        if (chunk == null || chunk.isEmpty()) continue;
                        ExtendedBlockStorage[] sections = chunk.getBlockStorageArray();
                        for (int section = 0; section < sections.length; section++) {
                            ExtendedBlockStorage storage = sections[section];
                            int baseY = section * 16;
                            if (storage == null || storage.isEmpty()
                                    || !view.visible(cx * 16D, baseY, cz * 16D,
                                    cx * 16D + 16, baseY + 16, cz * 16D + 16)) continue;
                            byte[] ids = storage.getBlockLSBArray();
                            boolean extendedIds = storage.getBlockMSBArray() != null;
                            for (int index = 0; index < 4096; index++) {
                                if (ids[index] == 0 && !extendedIds) continue;
                                int x = index & 15, y = index >> 8, z = (index >> 4) & 15;
                                Block block = storage.getBlockByExtId(x, y, z);
                                if (block != null && block.getMaterial() == Material.glass)
                                    blocks.renderBlockByRenderType(block, cx * 16 + x, baseY + y, cz * 16 + z);
                            }
                        }
                    }
                }
            } finally { tessellator.draw(); }
        } finally {
            tessellator.setTranslation(0, 0, 0);
            blocks.blockAccess = null;
            GL11.glPopAttrib();
            GL13.glActiveTexture(active);
            GL20.glUseProgram(program);
        }
    }
}
