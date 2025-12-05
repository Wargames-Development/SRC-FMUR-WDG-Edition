package com.flansmod.common.guns.raytracing;

import com.flansmod.client.tmt.TmtTessellator;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;

public class BulletHole {
    Vector3f hitPos;
    EnumFacing face;
    int tickExisted;
    final int LIFETIME = 200;
    ResourceLocation texture;
    Block block;
    MovingObjectPosition raytraceResult;

    public BulletHole(Vector3f hitPos, EnumFacing face, int tickExisted, int size, Block block, MovingObjectPosition raytraceResult) {
        this.hitPos = hitPos;
        this.face = face;
        this.tickExisted = tickExisted;
        this.block = block;
        this.raytraceResult = raytraceResult;
        this.texture = new ResourceLocation("flansmod", "skins/bulletHole_" + size + ".png");
    }

    public void render(){
        WorldClient worldClient = Minecraft.getMinecraft().theWorld;
        if(!canBlockRenderHole()){
            return;
        }
        float fadeOut = 100F;
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, Minecraft.getMinecraft().renderEngine.getTexture(texture).getGlTextureId());
        GL11.glEnable(3042 /* GL_BLEND */);
        GL11.glDisable(2929 /* GL_DEPTH_TEST */);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008 /* GL_ALPHA_TEST */);
        GL11.glColor4f(0, 0, 0, (this.tickExisted > this.LIFETIME - fadeOut) ? ((this.LIFETIME - this.tickExisted) / fadeOut) : 1.0F);
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();

        float size = 0.1F;  // Adjust the size of the bullet hole as needed
        float x = hitPos.x;
        float y = hitPos.y;
        float z = hitPos.z;

        tessellator.addVertexWithUV(x - size, y - size, z, 0, 0);
        tessellator.addVertexWithUV(x - size, y + size, z, 0, 1);
        tessellator.addVertexWithUV(x + size, y + size, z, 1, 1);
        tessellator.addVertexWithUV(x + size, y - size, z, 1, 0);

        tessellator.draw();

        GL11.glDepthMask(true);
        GL11.glEnable(2929 /* GL_DEPTH_TEST */);
        GL11.glEnable(3008 /* GL_ALPHA_TEST */);
    }

    public boolean canBlockRenderHole(){
        return block != Blocks.air && block != Blocks.water && block != Blocks.flowing_water && block != Blocks.iron_bars;
    }

    public boolean Update(){
        return (++tickExisted >= LIFETIME);
    }
}
