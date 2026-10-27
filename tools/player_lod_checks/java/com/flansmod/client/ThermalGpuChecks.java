package com.flansmod.client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.file.Paths;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

/** Real compatibility-profile GPU checks; capability modes do not claim macOS/Linux execution. */
public final class ThermalGpuChecks {
    private static final int SIZE = 128;
    private static int checks;

    public static void main(String[] args) throws Exception {
        Pbuffer context = new Pbuffer(SIZE,SIZE,new PixelFormat().withDepthBits(24),null,null);
        try {
            context.makeCurrent();
            net.minecraft.client.renderer.OpenGlHelper.defaultTexUnit=GL13.GL_TEXTURE0;
            net.minecraft.client.renderer.OpenGlHelper.lightmapTexUnit=GL13.GL_TEXTURE1;
            for (int backend = 0; backend < 3; backend++)
                for (int format : new int[] {GL14.GL_DEPTH_COMPONENT24, GL30.GL_DEPTH24_STENCIL8, GL30.GL_DEPTH_COMPONENT32F})
                    copyDepth(backend,format);
            cameraIntegration();
            binocularCoverage();
            lateLensComposition();
            particleOcclusion();
            entityReplayIsolation();
            precisionReplay(false,null);
            if (args.length > 0) try (URLClassLoader mchr = new URLClassLoader(
                    new java.net.URL[] {Paths.get(args[0]).toUri().toURL()},ThermalGpuChecks.class.getClassLoader())) {
                Class<?> bridge = mchr.loadClass("mcheli.render.MCH_FMURThermal");
                field(bridge,"heatPass").set(null,ThermalRenderApi.class.getMethod("isHeatPass"));
                field(bridge,"particlePass").set(null,ThermalRenderApi.class.getMethod("isParticlePass"));
                ThermalRenderApi.renderParticles(() -> {
                    try { check(Boolean.TRUE.equals(bridge.getMethod("isParticlePass").invoke(null)),"MCHR direct particle replay flag"); }
                    catch (ReflectiveOperationException failure) { throw new AssertionError(failure); }
                });
                ThermalRenderApi.renderHeat(0,() -> {
                    try { check(Boolean.TRUE.equals(bridge.getMethod("isHeatPass").invoke(null)),"MCHR public bridge heat flag"); }
                    catch (ReflectiveOperationException failure) { throw new AssertionError(failure); }
                });
                precisionReplay(true,mchr);
                cannonParticle(mchr,bridge);
            }
            ThermalRenderApi.registerVehicleRenderer(() -> true,partial -> { throw new IllegalStateException("fixture"); });
            try { ThermalRenderApi.renderHeat(0,() -> {}); throw new AssertionError("Expected provider failure"); }
            catch (IllegalStateException expected) { check(!ThermalRenderApi.isHeatPass(),"Heat flag reset after provider failure"); }
            ThermalRenderApi.registerVehicleRenderer(() -> false,partial -> {});
            check(GL11.glGetError() == GL11.GL_NO_ERROR,"No GL errors");
            System.out.println("PASS: " + checks + " thermal framebuffer, full sensor/model capture, sun/cover, player/MCHR precision replay and state-cleanup checks.");
        } finally { context.destroy(); }
    }

    private static void copyDepth(int backend,int format) throws Exception {
        int source=fbo(), target=fbo(), depth=GL30.glGenRenderbuffers();
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
        GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,format,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,format == GL30.GL_DEPTH24_STENCIL8
                ? GL30.GL_DEPTH_STENCIL_ATTACHMENT : GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        GL11.glDepthMask(true); GL11.glClearDepth(0.25D); GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,target);
        int oldPacked=GL30.glGenRenderbuffers();GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,oldPacked);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL30.GL_DEPTH24_STENCIL8,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_STENCIL_ATTACHMENT,GL30.GL_RENDERBUFFER,oldPacked);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
        ContextCapabilities caps=GLContext.getCapabilities();
        Field core=field(ContextCapabilities.class,"OpenGL30"), arb=field(ContextCapabilities.class,"GL_ARB_framebuffer_object"),
                extBlit=field(ContextCapabilities.class,"GL_EXT_framebuffer_blit");
        boolean oldCore=core.getBoolean(caps),oldArb=arb.getBoolean(caps),oldBlit=extBlit.getBoolean(caps);
        try {
            core.setBoolean(caps,backend == 0); arb.setBoolean(caps,backend == 1); extBlit.setBoolean(caps,false);
            check(ThermalFramebuffers.isAvailable(),"FBO support without EXT blit");
            check(ThermalFramebuffers.copyDepth(source,target,SIZE,SIZE),"Depth copy backend="+backend+" format="+format);
            check(GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING) == source,"FBO binding restored");
        } finally { core.setBoolean(caps,oldCore); arb.setBoolean(caps,oldArb);extBlit.setBoolean(caps,oldBlit); }
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,target);
        FloatBuffer sampled=BufferUtils.createFloatBuffer(1);
        GL11.glReadPixels(64,64,1,1,GL11.GL_DEPTH_COMPONENT,GL11.GL_FLOAT,sampled);
        check(Math.abs(sampled.get(0)-0.25F)<0.00001F,"Copied depth value");
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);
        GL30.glDeleteFramebuffers(source); GL30.glDeleteFramebuffers(target); GL30.glDeleteRenderbuffers(depth);GL30.glDeleteRenderbuffers(oldPacked);
    }

    private static void cameraIntegration() throws Exception {
        check(ThermalCamera.ensureShader(),"Shared sensor shader compiles");
        ThermalCamera camera=ThermalCamera.INSTANCE;
        ContextCapabilities caps=GLContext.getCapabilities();
        Field core=field(ContextCapabilities.class,"OpenGL30"),arb=field(ContextCapabilities.class,"GL_ARB_framebuffer_object"),
                extBlit=field(ContextCapabilities.class,"GL_EXT_framebuffer_blit");
        boolean oldCore=core.getBoolean(caps),oldArb=arb.getBoolean(caps),oldBlit=extBlit.getBoolean(caps);
        // Real vanilla mob/player model geometry through the complete sensor, not prefilled hot pixels.
        net.minecraft.client.model.ModelBase[] models={new net.minecraft.client.model.ModelVillager(0),new net.minecraft.client.model.ModelBiped()};
        int white=texture(255,255,255,255);
        try {
            for(int backend=0;backend<3;backend++) for(net.minecraft.client.model.ModelBase model:models) {
                core.setBoolean(caps,backend==0);arb.setBoolean(caps,backend==1);extBlit.setBoolean(caps,false);
                int source=fboCompat(),packed=GL30.glGenRenderbuffers();
                GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,packed);
                GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL30.GL_DEPTH24_STENCIL8,SIZE,SIZE);
                // Mirrors Forge's stencil-enabled scene FBO. Keep this source intact throughout.
                if(backend==0) GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_STENCIL_ATTACHMENT,GL30.GL_RENDERBUFFER,packed);
                else if(backend==1) ARBFramebufferObject.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_STENCIL_ATTACHMENT,GL30.GL_RENDERBUFFER,packed);
                else {
                    EXTFramebufferObject.glFramebufferRenderbufferEXT(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,packed);
                    EXTFramebufferObject.glFramebufferRenderbufferEXT(GL30.GL_FRAMEBUFFER,GL30.GL_STENCIL_ATTACHMENT,GL30.GL_RENDERBUFFER,packed);
                }
                GL11.glViewport(0,0,SIZE,SIZE);
                GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glColorMask(true,true,true,true);GL11.glDepthMask(true);
                GL11.glClearColor(0.12F,0.12F,0.12F,1);GL11.glClearDepth(1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
                GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-2,2,-2,2,-10,10);
                GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
                // Inherited stencil/scissor/color masks must not prevent sensor capture.
                GL11.glEnable(GL11.GL_SCISSOR_TEST);GL11.glScissor(0,0,1,1);
                GL11.glEnable(GL11.GL_STENCIL_TEST);GL11.glStencilFunc(GL11.GL_NEVER,0,255);
                GL11.glColorMask(false,false,false,false);
                check(camera.prepareDepth(source,SIZE,SIZE),"Packed scene prepares backend="+backend);
                check(GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING)==source,"Prepare restores source FBO");
                check(GL11.glIsEnabled(GL11.GL_SCISSOR_TEST),"Prepare restores inherited scissor");
                check(camera.captureColor(source,SIZE,SIZE),"Scene color captured");
                camera.projectSun(0,0,-1,0);
                camera.renderHeat(() -> ThermalRenderApi.renderHeat(0,() -> {
                    GL11.glEnable(GL11.GL_TEXTURE_2D);GL11.glBindTexture(GL11.GL_TEXTURE_2D,white);
                    GL11.glPushMatrix();GL11.glTranslatef(0,0.5F,0);GL11.glScalef(1,-1,1);
                    model.render(null,0,0,0,0,0,0.0625F);GL11.glPopMatrix();
                }));
                check(camera.heatValid(),"Model heat capture valid");
                check(GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING)==source,"Heat restores source FBO");
                check(GL11.glIsEnabled(GL11.GL_STENCIL_TEST),"Heat restores inherited stencil");
                display(camera,true);
                check((pixel(64,64).get(0)&255)==255,"Actual "+model.getClass().getSimpleName()+" is white-hot backend="+backend);
                check((pixel(4,4).get(0)&255)<180,"Background stays cold");
                display(camera,false);
                check(Math.abs((pixel(64,64).get(0)&255)-31)<=2,"Color view preserved");
                ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,source);
                check(ThermalFramebuffers.status()==GL30.GL_FRAMEBUFFER_COMPLETE,"Original packed scene stays complete");
                ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,0);ThermalFramebuffers.delete(source);GL30.glDeleteRenderbuffers(packed);
            }
        } finally {core.setBoolean(caps,oldCore);arb.setBoolean(caps,oldArb);extBlit.setBoolean(caps,oldBlit);}
        GL11.glDeleteTextures(white);
        // Sky bloom must disappear behind opaque scene geometry.
        int source=fbo(),depth=GL30.glGenRenderbuffers();
        GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        for(boolean covered:new boolean[]{false,true}) {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);GL11.glColorMask(true,true,true,true);GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glDepthMask(true);GL11.glClearColor(0.12F,0.12F,0.12F,1);GL11.glClearDepth(covered ? 0.5 : 1);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,256);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            check(camera.prepareDepth(source,SIZE,SIZE),"Sun depth capture");camera.captureColor(source,SIZE,SIZE);
            camera.projectSun(0,0,-1,1);camera.renderHeat(() -> {});display(camera,true);
            int brightness=pixel(64,64).get(0)&255;
            check(covered ? brightness<100 : brightness>230,"Sun bloom respects solid cover");
        }
        // Copied scene depth must hide a target; equal/self depth is checked by the LOD fixtures.
        for(boolean covered:new boolean[]{false,true}) {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);GL11.glDepthMask(true);
            GL11.glClearDepth(covered ? 0.25 : 1);GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            check(camera.prepareDepth(source,SIZE,SIZE),"Target occlusion depth capture");
            camera.captureColor(source,SIZE,SIZE);camera.projectSun(0,0,-1,0);
            camera.renderHeat(() -> { GL11.glDisable(GL11.GL_TEXTURE_2D);GL11.glColor4f(1,1,1,1);quad(1,0); });
            display(camera,true);
            int brightness=pixel(64,64).get(0)&255;
            check(covered ? brightness<100 : brightness==255,"Opaque scene occludes target heat");
        }
        for(int size:new int[]{64,128,96}) {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
            check(camera.prepareDepth(source,size,size),"Camera resize depth capture");
            camera.captureColor(source,size,size);camera.renderHeat(() -> {});
            check(camera.width()==size && camera.height()==size,"Camera attachments follow resize");
        }
        GL30.glDeleteFramebuffers(source);GL30.glDeleteRenderbuffers(depth);
        // Default framebuffer has GL_FRONT/BACK draw state, unlike a texture FBO.
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL11.glColorMask(true,true,true,true);GL11.glDepthMask(true);
        GL11.glClearDepth(1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
        check(camera.prepareDepth(0,SIZE,SIZE),"Default framebuffer depth capture");
        camera.renderHeat(() -> {});
        check(GL11.glGetError()==GL11.GL_NO_ERROR,"Default framebuffer draw-state restoration");
        GL20.glUseProgram(0);GL13.glActiveTexture(GL13.GL_TEXTURE0);
    }

    private static int fboCompat() {
        int f=ThermalFramebuffers.create();ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,f);
        int t=texture(30,30,30,255);GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,SIZE,SIZE,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,(ByteBuffer)null);
        ThermalFramebuffers.attach(GL30.GL_COLOR_ATTACHMENT0,t);return f;
    }

    private static void binocularCoverage() {
        ThermalCamera camera=ThermalCamera.INSTANCE;
        int source=fbo(),depth=GL30.glGenRenderbuffers();
        GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        GL11.glColorMask(true,true,true,true);GL11.glDepthMask(true);GL11.glClearDepth(1);
        GL11.glClearColor(0.15F,0.45F,0.85F,1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
        check(camera.prepareDepth(source,SIZE,SIZE),"Binocular scene prepares");camera.captureColor(source,SIZE,SIZE);
        camera.projectSun(0,0,-1,0);camera.renderHeat(() -> {});
        for(int height:new int[]{SIZE,96,72}) {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL11.glViewport(0,0,SIZE,height);
            GL11.glDisable(GL11.GL_DEPTH_TEST);GL11.glDisable(GL11.GL_BLEND);GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            camera.bindDisplay(SIZE,height,false,true,false,true,true,(float)SIZE/height,1);quad(1,0);
            for(int[] point:new int[][]{{1,1},{SIZE-2,1},{1,height-2},{SIZE-2,height-2},{SIZE/2,height/2}}) {
                ByteBuffer p=pixel(point[0],point[1]);
                check(Math.abs((p.get(0)&255)-(p.get(1)&255))<=1 && Math.abs((p.get(1)&255)-(p.get(2)&255))<=1,
                        "Standalone binocular thermal covers every edge at viewport height="+height);
            }
        }
        GL20.glUseProgram(0);GL30.glDeleteFramebuffers(source);GL30.glDeleteRenderbuffers(depth);
    }

    private static void lateLensComposition() throws Exception {
        int output=fbo(),lens=texture(64,128,192,255),black=texture(0,0,0,255);
        float[] x=(float[])field(ThermalScopeEffect.class,"postCompositeLensNdcX").get(null);
        float[] y=(float[])field(ThermalScopeEffect.class,"postCompositeLensNdcY").get(null);
        try {
            for(int frame=0;frame<6;frame++) {
                GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);GL11.glColorMask(true,true,true,true);
                GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glClearColor(0,0,0,0);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
                x[0]=0;y[0]=0;
                for(int i=0;i<=32;i++){x[i+1]=(float)Math.cos(i*Math.PI/16)*0.7F;y[i+1]=(float)Math.sin(i*Math.PI/16)*0.7F;}
                field(ThermalScopeEffect.class,"postCompositeLensGeometryValid").setBoolean(null,true);
                GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);
                GL20.glUseProgram(0);
                // Reproduce shader residue: a black secondary sampler, fog, clipping, write masks.
                for(int unit=1;unit<=3;unit++){GL13.glActiveTexture(GL13.GL_TEXTURE0+unit);GL11.glEnable(GL11.GL_TEXTURE_2D);GL11.glBindTexture(GL11.GL_TEXTURE_2D,black);}
                GL11.glEnable(GL11.GL_FOG);GL11.glEnable(GL11.GL_SCISSOR_TEST);GL11.glScissor(0,0,1,1);
                GL11.glEnable(GL11.GL_STENCIL_TEST);GL11.glStencilFunc(GL11.GL_NEVER,0,255);
                GL11.glColorMask(false,false,false,false);
                ThermalScopeEffect.renderLensImage(output,SIZE,SIZE,SIZE,SIZE,lens,true);
                check(GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING)==0,"Late compositor restores window framebuffer");
                check(GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE)==GL13.GL_TEXTURE3,"Late compositor restores active sampler");
                check(GL11.glIsEnabled(GL11.GL_FOG) && GL11.glIsEnabled(GL11.GL_SCISSOR_TEST),"Late compositor restores caller state");
                GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);ByteBuffer p=pixel(64,64);
                check((p.get(0)&255)==64 && (p.get(1)&255)==128 && (p.get(2)&255)==192,"Actual late lens stays visible despite shader residue, frame="+frame);
                check((pixel(4,4).get(0)&255)==0,"Late lens stays inside the projected aperture");
                check(GL11.glGetError()==GL11.GL_NO_ERROR,"Late lens draw-buffer restoration is valid");
            }
        } finally {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL20.glUseProgram(0);GL11.glDisable(GL11.GL_FOG);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glDisable(GL11.GL_STENCIL_TEST);GL11.glColorMask(true,true,true,true);
            for(int unit=1;unit<=3;unit++){GL13.glActiveTexture(GL13.GL_TEXTURE0+unit);GL11.glDisable(GL11.GL_TEXTURE_2D);}
            GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glDeleteTextures(lens);GL11.glDeleteTextures(black);GL30.glDeleteFramebuffers(output);
        }
    }

    private static void particleOcclusion() throws Exception {
        ThermalCamera camera=ThermalCamera.INSTANCE;
        int source=fbo(), depth=GL30.glGenRenderbuffers();
        GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        for(final boolean premultiplied:new boolean[]{false,true})
            for(final boolean behind:new boolean[]{false,true})
                for(final int alpha:new int[]{0,128,255}) {
                    GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
                    GL11.glColorMask(true,true,true,true);GL11.glDepthMask(true);GL11.glClearDepth(0.5);
                    GL11.glClearColor(0.12F,0.12F,0.12F,1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
                    GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
                    GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
                    check(camera.prepareDepth(source,SIZE,SIZE),"Particle scene depth capture");
                    camera.captureColor(source,SIZE,SIZE);camera.projectSun(0,0,-1,0);
                    camera.renderHeat(() -> {GL11.glDisable(GL11.GL_TEXTURE_2D);GL11.glColor4f(1,1,1,1);quad(1,0);});
                    final int tex=particleSprite(alpha,premultiplied);
                    camera.renderParticles(() -> {
                        check(ThermalRenderApi.isParticlePass(),"Particle flag active during native replay");
                        GL11.glBindTexture(GL11.GL_TEXTURE_2D,tex);
                        // Exercise both vanilla straight alpha and FMUR layer-3 premultiplied blending.
                        GL11.glBlendFunc(premultiplied ? GL11.GL_ONE : GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);
                        GL11.glColor4f(1,1,1,1);quad(1,behind ? -0.5 : 0.5);
                    });
                    check(!ThermalRenderApi.isParticlePass(),"Particle flag restored");
                    display(camera,true);
                    int center=pixel(64,64).get(0)&255,corner=pixel(4,4).get(0)&255;
                    check(corner==255,"Transparent sprite corner leaves heat unchanged; no black quad");
                    if(behind || alpha==0) check(center==255,"Particles behind target or alpha zero do not hide heat");
                    else if(alpha==255) check(center<100,"Opaque foreground smoke removes hot silhouette");
                    else check(center>120 && center<180,"Translucent smoke attenuates heat with native alpha");
                    display(camera,false);
                    check(Math.abs((pixel(64,64).get(0)&255)-31)<=2,"Particle mask does not alter color/FLIR-off mode");
                    GL11.glDeleteTextures(tex);
                }
        // Many faint layers must become an opaque screen, not leave a bright/dark target outline.
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
        GL11.glDepthMask(true);GL11.glClearDepth(0.5);GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
        check(camera.prepareDepth(source,SIZE,SIZE),"Dense smoke preparation");camera.captureColor(source,SIZE,SIZE);
        camera.renderHeat(() -> {GL11.glDisable(GL11.GL_TEXTURE_2D);GL11.glColor4f(1,1,1,1);quad(1,0);});
        final int dense=particleSprite(64,false);
        camera.renderParticles(() -> {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D,dense);GL11.glColor4f(1,1,1,1);
            for(int i=0;i<40;i++)quad(1,0.5);
        });
        display(camera,true);check((pixel(64,64).get(0)&255)<100,"Dense translucent smoke removes target silhouette");
        check((pixel(4,4).get(0)&255)==255,"Dense smoke still respects transparent sprite edges");
        GL11.glDeleteTextures(dense);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
        check(camera.prepareDepth(source,SIZE,SIZE),"Cold-scene flash preparation");camera.captureColor(source,SIZE,SIZE);
        camera.renderHeat(() -> {});
        final int flash=texture(255,255,255,255);
        camera.renderParticles(() -> {GL11.glBindTexture(GL11.GL_TEXTURE_2D,flash);GL11.glColor4f(1,1,1,1);quad(1,0.5);});
        display(camera,true);check((pixel(64,64).get(0)&255)>160,"Cannon/flash particles remain visible without a heat target");
        GL11.glDeleteTextures(flash);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
        check(camera.prepareDepth(source,SIZE,SIZE),"Particle failure preparation");camera.renderHeat(() -> {});
        int savedFbo=GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING);
        try {camera.renderParticles(() -> {throw new IllegalStateException("particle fixture");});throw new AssertionError("Expected particle failure");}
        catch(IllegalStateException expected) {check(!ThermalRenderApi.isParticlePass(),"Particle flag reset after failure");}
        check(GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING)==savedFbo,"Particle failure restores FBO");
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL30.glDeleteFramebuffers(source);GL30.glDeleteRenderbuffers(depth);
    }

    private static int particleSprite(int alpha,boolean premultiplied) {
        int tex=GL11.glGenTextures();GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,tex);
        ByteBuffer data=BufferUtils.createByteBuffer(16*16*4);
        for(int y=0;y<16;y++) for(int x=0;x<16;x++) {
            int a=(x-7.5)*(x-7.5)+(y-7.5)*(y-7.5)<30 ? alpha : 0;
            int shade=premultiplied ? 51*a/255 : 51;
            data.put((byte)shade).put((byte)shade).put((byte)shade).put((byte)a);
        }
        data.flip();GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,16,16,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,data);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
        return tex;
    }

    private static void entityReplayIsolation() throws Exception {
        Class<?> compat=ScopeRenderCompatibility.class;
        java.util.Map<Field,Object> saved=new java.util.HashMap<Field,Object>();
        String[] names={"irisChecked","irisGetInstance","irisShaderPackInUse","irisGetPipelineManager",
                "irisGetCurrentDimensionName","irisGetCloudSetting","fixedPipelineConstructor","pipelineField",
                "pipelinesPerDimensionField","lastPreparedDimensionField","distantHorizonsChecked","celeritasChecked"};
        for(String name:names){Field f=field(compat,name);saved.put(f,f.get(null));}
        try {
            FakeIris.manager=new FakeManager();Object primary=FakeIris.manager.pipeline;
            field(compat,"irisChecked").setBoolean(null,true);
            field(compat,"irisGetInstance").set(null,FakeIris.class.getMethod("getInstance"));
            field(compat,"irisShaderPackInUse").set(null,FakeIris.class.getMethod("isShaderPackInUse"));
            field(compat,"irisGetPipelineManager").set(null,FakeIris.class.getMethod("getPipelineManager"));
            field(compat,"irisGetCurrentDimensionName").set(null,FakeIris.class.getMethod("getCurrentDimensionName"));
            field(compat,"irisGetCloudSetting").set(null,FakePipeline.class.getMethod("getCloudSetting"));
            field(compat,"fixedPipelineConstructor").set(null,FakePipeline.class.getConstructor());
            field(compat,"pipelineField").set(null,FakeManager.class.getField("pipeline"));
            field(compat,"pipelinesPerDimensionField").set(null,FakeManager.class.getField("pipelines"));
            field(compat,"lastPreparedDimensionField").set(null,FakeManager.class.getField("dimension"));
            field(compat,"distantHorizonsChecked").setBoolean(null,false);
            field(compat,"celeritasChecked").setBoolean(null,false);
            ScopeRenderCompatibility.RenderState state=ScopeRenderCompatibility.beginEntityReplay();
            try {
                check(state.isSecondaryRenderAllowed(),"Entity replay permitted under shader pipeline");
                check(FakeIris.manager.pipeline!=primary,"Entity replay isolates native entity/particle drawing");
                check(!field(compat,"distantHorizonsChecked").getBoolean(null),"Entity replay never probes/switches DH mode");
                check(!field(compat,"celeritasChecked").getBoolean(null),"Entity replay never probes/changes terrain lists");
            } finally {ScopeRenderCompatibility.endSecondaryRender(state);}
            check(FakeIris.manager.pipeline==primary,"Primary shader pipeline restored");
            check(FakeIris.manager.pipelines.get("test")==primary,"Primary dimension pipeline restored");
            check("test".equals(FakeIris.manager.dimension),"Prepared dimension restored");
        } finally {for(java.util.Map.Entry<Field,Object> entry:saved.entrySet())entry.getKey().set(null,entry.getValue());}
    }

    public static final class FakePipeline {
        public FakePipeline() { }
        public String getCloudSetting(){return "OFF";}
    }
    public static final class FakeManager {
        public Object pipeline=new FakePipeline();
        public java.util.Map<Object,Object> pipelines=new java.util.HashMap<Object,Object>();
        public String dimension="test";
        public FakeManager(){pipelines.put("test",pipeline);}
    }
    public static final class FakeIris {
        static FakeManager manager;
        public static FakeIris getInstance(){return new FakeIris();}
        public boolean isShaderPackInUse(){return true;}
        public static Object getPipelineManager(){return manager;}
        public static String getCurrentDimensionName(){return "test";}
    }

    public static boolean availableFixture(){return true;}
    private static void cannonParticle(ClassLoader loader,Class<?> bridge) throws Exception {
        check(GL11.glGetError()==GL11.GL_NO_ERROR,"Clean GL state before native cannon test");
        field(bridge,"supported").set(null,ThermalGpuChecks.class.getMethod("availableFixture"));
        Class<?> camera=loader.loadClass("mcheli.MCH_Camera");
        Field mode=camera.getField("currentCameraMode");int oldMode=mode.getInt(null);mode.setInt(null,2);
        Class<?> type=loader.loadClass("mcheli.particles.MCH_EntityParticleExplode");
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
        Object effect=allocator.allocateInstance(type);
        int texture=GL11.glGenTextures();GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
        ByteBuffer atlas=BufferUtils.createByteBuffer(64*64*4);
        for(int y=0;y<64;y++)for(int x=0;x<64;x++) {
            int alpha=x<16 && y<16 && (x-7.5)*(x-7.5)+(y-7.5)*(y-7.5)<30 ? 255 : 0;
            atlas.put((byte)255).put((byte)255).put((byte)255).put((byte)alpha);
        }
        atlas.flip();GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,64,64,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,atlas);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
        ParticleTextures textures=new ParticleTextures(texture);
        field(type,"theRenderEngine").set(effect,textures);field(type,"endCount").setInt(effect,16);field(type,"size").setFloat(effect,0.5F);
        for(String name:new String[]{"particleRed","particleGreen","particleBlue","particleAlpha"})
            field(net.minecraft.client.particle.EntityFX.class,name).setFloat(effect,1);
        Method render=type.getMethod("renderParticle",net.minecraft.client.renderer.Tessellator.class,float.class,float.class,float.class,float.class,float.class,float.class);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL11.glViewport(0,0,SIZE,SIZE);GL20.glUseProgram(0);
        GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
        GL11.glEnable(GL11.GL_DEPTH_TEST);GL11.glDepthMask(true);GL11.glColorMask(true,true,true,true);
        GL11.glEnable(GL11.GL_TEXTURE_2D);GL11.glEnable(GL11.GL_ALPHA_TEST);GL11.glAlphaFunc(GL11.GL_GREATER,1F/255F);
        GL11.glClearColor(0,0,0,0);GL11.glClearDepth(1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
        try {
            render.invoke(effect,net.minecraft.client.renderer.Tessellator.instance,0F,1F,1F,0F,0F,0F);
            FloatBuffer sampled=BufferUtils.createFloatBuffer(1);GL11.glReadPixels(64,64,1,1,GL11.GL_DEPTH_COMPONENT,GL11.GL_FLOAT,sampled);
            check(sampled.get(0)==1,"Actual MCHR explosion never writes billboard depth");
            check(GL11.glGetBoolean(GL11.GL_DEPTH_WRITEMASK),"Actual MCHR explosion restores caller depth-write flag");
            check((pixel(64,64).get(0)&255)>180,"Actual cannon sprite center renders");
            check((pixel(4,4).get(0)&255)<20,"Actual cannon sprite corners stay transparent");
            check(textures.last!=null && textures.last.getResourcePath().equals("textures/entity/explosion.png"),"Shared thermals retain explosion texture alpha");
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Native cannon renderer has no GL errors");
        } finally {mode.setInt(null,oldMode);GL11.glDeleteTextures(texture);}
    }
    private static final class ParticleTextures extends net.minecraft.client.renderer.texture.TextureManager {
        final int texture;net.minecraft.util.ResourceLocation last;
        ParticleTextures(int texture){super(null);this.texture=texture;}
        @Override public void bindTexture(net.minecraft.util.ResourceLocation location){last=location;GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);}
    }
    private static void display(ThermalCamera camera,boolean thermal) {
        ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,0);GL11.glViewport(0,0,SIZE,SIZE);
        GL11.glColorMask(true,true,true,true);GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glDisable(GL11.GL_STENCIL_TEST);
        GL11.glDisable(GL11.GL_DEPTH_TEST);GL11.glDisable(GL11.GL_BLEND);GL11.glDisable(GL11.GL_ALPHA_TEST);GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
        camera.bindDisplay(SIZE,SIZE,false,true,true,true,thermal,1,1);quad(1,0);GL20.glUseProgram(0);
    }

    private static void precisionReplay(boolean vehicle,ClassLoader loader) throws Exception {
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL11.glViewport(0,0,SIZE,SIZE);
        GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(10,1,0.05F,256);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
        GL11.glEnable(GL11.GL_DEPTH_TEST);GL11.glDepthMask(true);GL11.glDepthRange(0,1);
        GL11.glClearDepth(1);GL11.glClearColor(0,0,0,0);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
        FloatBuffer model=BufferUtils.createFloatBuffer(16),projection=BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX,model);GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX,projection);
        double distance=512,start=112,scale=PlayerLodProjection.projected(distance,start)/distance;
        double a=depth(projection,-(distance-8)*scale),b=depth(projection,-(distance+8)*scale);
        double slope=(mapped(projection,distance+8,start)-mapped(projection,distance-8,start))/(b-a);
        double near=mapped(projection,distance-8,start)-slope*a,far=near+slope;
        Object layer;
        Object info=null;Method begin=null,finish=null;
        if (vehicle) {
            Class<?> type=loader.loadClass("mcheli.render.MCH_FarVehicleDepthLayer");
            java.lang.reflect.Constructor<?> ctor=type.getDeclaredConstructor();ctor.setAccessible(true);layer=ctor.newInstance();
            Class<?> infoType=loader.loadClass("mcheli.helicopter.MCH_HeliInfo");
            sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
            info=allocator.allocateInstance(infoType);
            begin=type.getDeclaredMethod("begin",double.class,double.class,double.class,
                    loader.loadClass("mcheli.aircraft.MCH_AircraftInfo"),double.class,double.class,double.class,double.class,FloatBuffer.class,FloatBuffer.class);
            finish=type.getDeclaredMethod("finish",boolean.class,double.class,double.class,float.class,float.class);
            begin.setAccessible(true);finish.setAccessible(true);
        } else layer=new PlayerLodDepthLayer();
        final Object target=layer,definition=info;final Method beginVehicle=begin,finishVehicle=finish;
        Runnable draw=() -> {
            try {
                boolean started=vehicle ? (Boolean)beginVehicle.invoke(target,0D,0D,-distance,definition,0D,0D,0D,start,model,projection)
                        : ((PlayerLodDepthLayer)target).begin(0,0,-distance,0,0,0,start,model,projection);
                check(started,"Precision heat replay begins");
                GL11.glDisable(GL11.GL_TEXTURE_2D);GL11.glDisable(GL11.GL_LIGHTING);GL11.glDisable(GL11.GL_BLEND);
                GL11.glPushMatrix();GL11.glTranslated(0,0,-distance*scale);GL11.glScaled(scale,scale,scale);
                GL11.glColor4f(1,1,1,1);quad(3,0);GL11.glPopMatrix();
                if(vehicle) finishVehicle.invoke(target,true,near,far,projection.get(10),projection.get(14));
                else ((PlayerLodDepthLayer)target).finish(true,near,far,projection.get(10),projection.get(14));
            }catch(ReflectiveOperationException failure){throw new AssertionError(failure);}
        };
        draw.run();check((pixel(64,64).get(3)&255)>250,"Primary model coverage");
        GL11.glClearColor(0,0,0,0);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT); // Keep the same model depth.
        ThermalRenderApi.renderHeat(0,draw);
        check((pixel(64,64).get(3)&255)>250,(vehicle?"MCHR":"Player LOD")+" writes heat at equal scene depth");
        check(!ThermalRenderApi.isHeatPass(),"Heat pass restored");
    }

    private static int fbo(){int f=GL30.glGenFramebuffers();GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,f);
        int t=GL11.glGenTextures();GL11.glBindTexture(GL11.GL_TEXTURE_2D,t);GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,SIZE,SIZE,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,(ByteBuffer)null);
        GL30.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER,GL30.GL_COLOR_ATTACHMENT0,GL11.GL_TEXTURE_2D,t,0);return f;}
    private static int texture(int r,int g,int b,int a){int t=GL11.glGenTextures();GL11.glBindTexture(GL11.GL_TEXTURE_2D,t);
        ByteBuffer pixel=BufferUtils.createByteBuffer(4);pixel.put(new byte[]{(byte)r,(byte)g,(byte)b,(byte)a}).flip();
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,1,1,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixel);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);return t;}
    private static void quad(double size,double z){GL11.glBegin(GL11.GL_QUADS);GL11.glTexCoord2f(0,0);GL11.glVertex3d(-size,-size,z);GL11.glTexCoord2f(1,0);GL11.glVertex3d(size,-size,z);
        GL11.glTexCoord2f(1,1);GL11.glVertex3d(size,size,z);GL11.glTexCoord2f(0,1);GL11.glVertex3d(-size,size,z);GL11.glEnd();}
    private static ByteBuffer pixel(int x,int y){ByteBuffer b=BufferUtils.createByteBuffer(4);GL11.glReadPixels(x,y,1,1,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,b);return b;}
    private static double depth(FloatBuffer p,double z){return ((p.get(10)*z+p.get(14))/(p.get(11)*z+p.get(15))+1)*0.5;}
    private static double mapped(FloatBuffer p,double d,double s){double base=depth(p,-s);return d<=s?depth(p,-d):base+(1-base)*PlayerLodProjection.depthFraction(d,s);}
    private static Field field(Class<?> type,String name)throws Exception{Field f=type.getDeclaredField(name);f.setAccessible(true);return f;}
    private static void uniform(int p,String n,int v){GL20.glUniform1i(GL20.glGetUniformLocation(p,n),v);}
    private static void value(int p,String n,float v){GL20.glUniform1f(GL20.glGetUniformLocation(p,n),v);}
    private static void check(boolean condition,String label){checks++;if(!condition)throw new AssertionError(label);}
}
