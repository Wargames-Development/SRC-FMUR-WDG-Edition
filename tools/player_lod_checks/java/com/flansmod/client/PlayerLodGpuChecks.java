package com.flansmod.client;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

/** Native offscreen depth/composite check. Does not claim a Minecraft gameplay test. */
public final class PlayerLodGpuChecks {
    private static final int SIZE = 128;
    private static final PlayerLodDepthLayer layer = new PlayerLodDepthLayer();
    private static final FloatBuffer modelview = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    public static void main(String[] args) throws Exception {
        Pbuffer context = new Pbuffer(SIZE, SIZE, new PixelFormat().withDepthBits(24).withAlphaBits(8), null, null);
        try {
            context.makeCurrent();
            check(GLContext.getCapabilities().OpenGL30, "GL 3.0");
            verifyLighting();
            verifyActorBrightness();
            for (float fov : new float[] {70, 10, 3.5F}) for (double distance : new double[] {112.01, 113, 114, 128, 256, 512, 1024}) {
                verify(fov, distance, false, 112);
                verify(fov, distance, true, 112);
            }
            for (boolean cover : new boolean[] {false, true}) {
                verify(10, 512, cover, 496);
                verify(10, 1024, cover, 496);
            }
            check(GL11.glGetError() == GL11.GL_NO_ERROR, "GL error state");
            System.out.println("PASS: LOD daylight/darkness/block-light, shader-residue and scaled-normal lighting checks;"
                    + " 46 transition-boundary, normal/scoped projection, partial-cover, self-depth and GL restoration scenarios.");
        } finally { context.destroy(); }
    }

    private static void verifyLighting() {
        net.minecraft.client.renderer.OpenGlHelper.defaultTexUnit=GL13.GL_TEXTURE0;
        net.minecraft.client.renderer.OpenGlHelper.lightmapTexUnit=GL13.GL_TEXTURE1;
        int skin=texture(1,1,new byte[]{-1,-1,-1,-1});
        int black=texture(1,1,new byte[]{0,0,0,-1});
        byte[] levels=new byte[16*16*4];
        for(int sky=0;sky<16;sky++)for(int block=0;block<16;block++) {
            int offset=(sky*16+block)*4,level=24+Math.max(sky,block)*15;
            levels[offset]=levels[offset+1]=levels[offset+2]=(byte)level;levels[offset+3]=-1;
        }
        int lightmap=texture(16,16,levels);
        int pack=GL20.glCreateProgram(),fragment=GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER);
        GL20.glShaderSource(fragment,"#version 120\nvoid main(){gl_FragColor=vec4(1.0);}");
        GL20.glCompileShader(fragment);GL20.glAttachShader(pack,fragment);GL20.glLinkProgram(pack);
        check(GL20.glGetProgrami(pack,GL20.GL_LINK_STATUS)!=0,"Shader-residue fixture links");
        int previousProgram=GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glMatrixMode(GL11.GL_TEXTURE);GL11.glPushMatrix();
        GL11.glLoadIdentity();GL11.glScalef(1F/256,1F/256,1);GL11.glTranslatef(8,8,0);
        GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glPushMatrix();GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glPushMatrix();
        try {
            int[] packed={0xF00000,0,0xC0,0x400000};
            for(int lightmapAlpha:new int[]{255,0})for(int brightness:packed) {
                for(int offset=3;offset<levels.length;offset+=4)levels[offset]=(byte)lightmapAlpha;
                ByteBuffer lightmapBytes=BufferUtils.createByteBuffer(levels.length);lightmapBytes.put(levels).flip();
                GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glBindTexture(GL11.GL_TEXTURE_2D,lightmap);
                GL11.glTexSubImage2D(GL11.GL_TEXTURE_2D,0,0,0,16,16,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,lightmapBytes);
                int expected=-1;
                for(boolean residue:new boolean[]{false,true})for(float scale:new float[]{1F,0.25F}) {
                    GL11.glLoadIdentity();GL11.glViewport(0,0,SIZE,SIZE);
                    GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glDisable(GL11.GL_FOG);
                    GL11.glDisable(GL11.GL_BLEND);GL11.glDisable(GL11.GL_DEPTH_TEST);
                    GL11.glEnable(GL11.GL_ALPHA_TEST);GL11.glAlphaFunc(GL11.GL_GREATER,0.1F);
                    GL11.glClearColor(0,0,0,0);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
                    GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,skin);
                    GL11.glTexEnvi(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,residue?GL11.GL_REPLACE:GL11.GL_MODULATE);
                    GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glBindTexture(GL11.GL_TEXTURE_2D,lightmap);
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    for(int unit=2;unit<GL11.glGetInteger(GL13.GL_MAX_TEXTURE_UNITS);unit++) {
                        GL13.glActiveTexture(GL13.GL_TEXTURE0+unit);GL11.glBindTexture(GL11.GL_TEXTURE_2D,black);
                        if(residue)GL11.glEnable(GL11.GL_TEXTURE_2D);else GL11.glDisable(GL11.GL_TEXTURE_2D);
                    }
                    GL20.glUseProgram(residue?pack:0);
                    PlayerLodRenderer.prepareLighting(brightness);
                    check(GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM)==0,"LOD ignores inherited world programs");
                    GL11.glScaled(scale,scale,scale);
                    GL11.glBegin(GL11.GL_QUADS);
                    GL11.glNormal3f(0,1,0);GL11.glTexCoord2f(0.5F,0.5F);
                    GL11.glVertex2f(-1/scale,-1/scale);GL11.glVertex2f(0,-1/scale);
                    GL11.glVertex2f(0,1/scale);GL11.glVertex2f(-1/scale,1/scale);
                    GL11.glNormal3f(0,-1,0);
                    GL11.glVertex2f(0,-1/scale);GL11.glVertex2f(1/scale,-1/scale);
                    GL11.glVertex2f(1/scale,1/scale);GL11.glVertex2f(0,1/scale);GL11.glEnd();
                    int lit=pixel(32,64).get(0)&255,shade=pixel(96,64).get(0)&255;
                    check((pixel(32,64).get(3)&255)==255,"Lightmap alpha must not erase player coverage at the LOD handoff");
                    if(expected<0)expected=lit;
                    check(Math.abs(lit-expected)<=1,"Shader residue and LOD compression preserve brightness");
                    check(lit>shade+8,"Directional shading survives LOD scaling: light="+brightness
                            +", lightmapAlpha="+lightmapAlpha+", residue="+residue+", scale="+scale+", lit="+lit+", shade="+shade);
                    if(brightness==0)check(lit<40,"Unlit LODs do not become fullbright");
                    if(brightness==0xF00000)check(lit>220,"Daylight LODs retain server skylight");
                    if(brightness==0xC0)check(lit>180 && lit<220,"Block light illuminates dark-area LODs");
                }
            }
            GL11.glLoadIdentity();GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,skin);
            ByteBuffer transparent=BufferUtils.createByteBuffer(4);transparent.put(new byte[]{-1,-1,-1,0}).flip();
            GL11.glTexSubImage2D(GL11.GL_TEXTURE_2D,0,0,0,1,1,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,transparent);
            PlayerLodRenderer.prepareLighting(0xF00000);quad(1,0);
            check((pixel(64,64).get(3)&255)==0,"Preserving lightmap coverage still respects transparent skin pixels");
        } finally {
            GL11.glPopMatrix();GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glPopMatrix();
            GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glMatrixMode(GL11.GL_TEXTURE);GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glPopAttrib();GL20.glUseProgram(previousProgram);
            GL11.glDeleteTextures(skin);GL11.glDeleteTextures(black);GL11.glDeleteTextures(lightmap);
            GL20.glDeleteProgram(pack);GL20.glDeleteShader(fragment);
        }
    }

    private static void verifyActorBrightness() throws Exception {
        java.lang.reflect.Field access=sun.misc.Unsafe.class.getDeclaredField("theUnsafe");access.setAccessible(true);
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)access.get(null);
        Class<?> type=Class.forName("com.flansmod.client.PlayerLodRenderer$VisualPlayer");
        net.minecraft.entity.Entity actor=(net.minecraft.entity.Entity)allocator.allocateInstance(type);
        actor.worldObj=(net.minecraft.client.multiplayer.WorldClient)allocator.allocateInstance(net.minecraft.client.multiplayer.WorldClient.class);
        java.lang.reflect.Field provider=net.minecraft.world.World.class.getDeclaredField("provider");provider.setAccessible(true);
        provider.set(actor.worldObj,new net.minecraft.world.WorldProviderSurface());
        for(int i=0;i<16;i++)actor.worldObj.provider.lightBrightnessTable[i]=i/15F;
        java.lang.reflect.Field brightness=type.getDeclaredField("brightness");brightness.setAccessible(true);
        brightness.setInt(actor,0);check(actor.getBrightness(0)==0,"Unloaded actor brightness is not forced to one");
        brightness.setInt(actor,0xF00000);actor.worldObj.skylightSubtracted=11;
        check(Math.abs(actor.getBrightness(0)-4/15F)<0.0001F,"Actor brightness respects night sky subtraction");
        brightness.setInt(actor,0xC0);check(Math.abs(actor.getBrightness(0)-12/15F)<0.0001F,"Actor brightness preserves block light without reading chunks");
    }

    private static int texture(int width,int height,byte[] data) {
        int texture=GL11.glGenTextures();GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
        ByteBuffer bytes=BufferUtils.createByteBuffer(data.length);bytes.put(data).flip();
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,width,height,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,bytes);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);return texture;
    }

    private static void verify(float fov, double distance, boolean cover, double start) {
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
        GL11.glViewport(0, 0, SIZE, SIZE);
        GL11.glDisable(GL11.GL_SCISSOR_TEST); GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(true);
        GL11.glDepthRange(0, 1); GL11.glClearColor(0, 0, 0, 0); GL11.glClearDepth(1);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity(); GLU.gluPerspective(fov, 1, 0.05F, (float)Math.max(256, start * 2 + 32));
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        modelview.clear(); projection.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, modelview); GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, projection);
        double scale = PlayerLodProjection.projected(distance, start) / distance;
        double low = distance - 8, high = distance + 8;
        double slope = (mapped(high, start) - mapped(low, start)) / (depth(-high * scale) - depth(-low * scale));
        double near = mapped(low, start) - slope * depth(-low * scale), far = near + slope;
        check(Double.isFinite(near) && Double.isFinite(far) && near >= 0 && far <= 1 && near < far,
                "renderer accepts transition depth range at " + distance);
        if (cover) {
            // Known terrain occupies the lower half of the player's screen footprint.
            GL11.glDepthRange(0, 1);
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix(); GL11.glLoadIdentity();
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix(); GL11.glLoadIdentity();
            GL11.glColor4f(1, 0, 0, 1);
            double z = 2 * mapped(distance - 10, start) - 1;
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex3d(-1, -1, z); GL11.glVertex3d(1, -1, z);
            GL11.glVertex3d(1, 0, z); GL11.glVertex3d(-1, 0, z); GL11.glEnd();
            GL11.glPopMatrix(); GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
        }
        check(layer.begin(0, 0, -distance, 0, 0, 0, start, modelview, projection), "precision layer begins");
        GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_BLEND);
        GL11.glPushMatrix(); GL11.glTranslated(0, 0, -distance * scale); GL11.glScaled(scale, scale, scale);
        // Large test envelope ensures pixel coverage even at 1024 blocks / wide FOV.
        GL11.glColor4f(0, 1, 0, 1); quad(8, 0.2);
        GL11.glColor4f(0, 0, 1, 1); quad(8, 0); // Rear surface must not overwrite front armour.
        GL11.glPopMatrix();
        layer.finish(true, near, far, projection.get(10), projection.get(14));
        check(GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING) == 0, "framebuffer restored");
        check(GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM) == 0, "program restored");
        ByteBuffer upper = pixel(64, 64), lower = pixel(64, 63);
        check((upper.get(1) & 255) > 240 && (upper.get(2) & 255) < 10, "head visible and front self-depth preserved");
        check((lower.get(cover ? 0 : 1) & 255) > 240, "partial terrain masks body only");
        FloatBuffer restored = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, restored);
        for (int i = 0; i < 16; i++) check(restored.get(i) == projection.get(i), "projection restored");
    }
    private static void quad(double size, double z) {
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3d(-size, -size, z); GL11.glVertex3d(size, -size, z);
        GL11.glVertex3d(size, size, z); GL11.glVertex3d(-size, size, z); GL11.glEnd();
    }
    private static ByteBuffer pixel(int x, int y) {
        ByteBuffer result = BufferUtils.createByteBuffer(4);
        GL11.glReadPixels(x, y, 1, 1, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, result); return result;
    }
    private static double depth(double z) {
        return ((projection.get(10) * z + projection.get(14)) / (projection.get(11) * z + projection.get(15)) + 1) * 0.5;
    }
    private static double mapped(double distance, double start) {
        double base = depth(-start);
        return distance <= start ? depth(-distance) : base + (1 - base) * PlayerLodProjection.depthFraction(distance, start);
    }
    private static void check(boolean condition, String name) { if (!condition) throw new AssertionError(name); }
}
