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
        ThermalSensorChecks.main(new String[0]);
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
            cameraGeometry();
            cameraSun();
            cameraWeather();
            if (System.getProperty("fmur.checks.angelicaRuntime") != null)
                irisTerrainCorrection(System.getProperty("fmur.checks.angelicaRuntime"));
            distantCameraGeometry();
            distantNightLighting();
            sensorLightmap();
            cachedSensorDisplay();
            profileEffects();
            particleOcclusion();
            emissiveParticles();
            primaryApertureIsolation();
            m40LensSize();
            entityReplayIsolation();
            if (System.getProperty("fmur.checks.dhRuntime") != null)
                distantHorizonsIsolation(System.getProperty("fmur.checks.dhRuntime"));
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
                explosionSmoke(mchr);
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

    private static void cachedSensorDisplay() throws Exception {
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
        net.minecraft.client.Minecraft mc=(net.minecraft.client.Minecraft)allocator.allocateInstance(net.minecraft.client.Minecraft.class);
        Field singleton=field(net.minecraft.client.Minecraft.class,"theMinecraft");
        Object previousClient=singleton.get(null);
        net.minecraft.client.shader.Framebuffer source=null;
        try {
            singleton.set(null,mc);
            mc.gameSettings=new net.minecraft.client.settings.GameSettings();
            mc.gameSettings.fboEnable=true;
            field(net.minecraft.client.Minecraft.class,"mcLanguageManager").set(mc,
                    new net.minecraft.client.resources.LanguageManager(null,"en_US"));
            mc.displayWidth=SIZE;mc.displayHeight=SIZE;
            mc.entityRenderer=(OverlayRenderer)allocator.allocateInstance(OverlayRenderer.class);
            net.minecraft.client.renderer.OpenGlHelper.initializeTextures();
            source=fixtureFramebuffer(allocator,true);
            field(ThermalScopeEffect.class,"sensorDisplayFramebuffer").set(null,fixtureFramebuffer(allocator,false));
            field(net.minecraft.client.Minecraft.class,"framebufferMc").set(mc,source);
            source.bindFramebuffer(true);GL11.glColorMask(true,true,true,true);GL11.glDepthMask(true);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glClearDepth(1);GL11.glClearColor(0.15F,0.45F,0.85F,1);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            ThermalCamera camera=ThermalCamera.INSTANCE;
            check(camera.prepareDepth(source.framebufferObject,SIZE,SIZE),"Cached sensor depth prepares");
            camera.projectSun(0,0,-1,0);camera.renderHeat(() -> {});
            camera.captureColor(source.framebufferObject,SIZE,SIZE);
            ThermalScopeEffect.renderCameraDisplay(mc,false,true,true,false,true,true,1);
            ByteBuffer first=pixel(SIZE/2,SIZE/2);int expected=first.get(0)&255;
            check(Math.abs(expected-(first.get(1)&255))<=1,"Sample produces thermal grayscale");
            check(field(ThermalScopeEffect.class,"sensorDisplayValid").getBoolean(null),"Sensor result cached");
            // Mutate both the displayed primary world and sensor input between deadlines.
            GL11.glClearColor(0,1,0,1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            camera.captureColor(source.framebufferObject,SIZE,SIZE);
            ThermalScopeEffect.renderCameraDisplay(mc,false,false,true,false,true,true,1);
            ByteBuffer held=pixel(SIZE/2,SIZE/2);
            check((held.get(0)&255)==expected && (held.get(1)&255)==(first.get(1)&255),"Held frame does not reprocess current sensor input");
            check(GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING)==source.framebufferObject,"Cached compositor restores caller FBO");
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Cached sensor has no GL errors");
        } finally {
            Object cached=field(ThermalScopeEffect.class,"sensorDisplayFramebuffer").get(null);
            if(cached!=null)((net.minecraft.client.shader.Framebuffer)cached).deleteFramebuffer();
            field(ThermalScopeEffect.class,"sensorDisplayFramebuffer").set(null,null);
            field(ThermalScopeEffect.class,"sensorDisplayValid").setBoolean(null,false);
            if(source!=null)source.deleteFramebuffer();
            singleton.set(null,previousClient);
        }
    }

    private static void cameraGeometry() throws Exception {
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
        Field singleton=field(net.minecraft.client.Minecraft.class,"theMinecraft");Object previous=singleton.get(null);
        net.minecraft.client.Minecraft mc=(net.minecraft.client.Minecraft)allocator.allocateInstance(net.minecraft.client.Minecraft.class);
        net.minecraft.client.renderer.RenderGlobal global=(net.minecraft.client.renderer.RenderGlobal)
                allocator.allocateInstance(net.minecraft.client.renderer.RenderGlobal.class);
        net.minecraft.client.renderer.WorldRenderer renderer=(net.minecraft.client.renderer.WorldRenderer)
                allocator.allocateInstance(net.minecraft.client.renderer.WorldRenderer.class);
        renderer.skipRenderPass=new boolean[]{false,true};renderer.posZ=-16;renderer.isWaitingOnOcclusionQuery=true;
        int list=GL11.glGenLists(1),output=fbo();
        field(renderer.getClass(),"glRenderList").setInt(renderer,list);
        field(global.getClass(),"sortedWorldRenderers").set(global,new net.minecraft.client.renderer.WorldRenderer[]{renderer});
        mc.renderGlobal=global;
        VanillaCameraTerrain terrain=new VanillaCameraTerrain();
        try {
            singleton.set(null,mc);
            GL11.glNewList(list,GL11.GL_COMPILE);
            GL11.glColor4f(1,1,1,1);GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex3f(-1,-1,-10);GL11.glVertex3f(1,-1,-10);GL11.glVertex3f(1,1,-10);GL11.glVertex3f(-1,1,-10);
            GL11.glEnd();GL11.glEndList();
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);GL11.glViewport(0,0,SIZE,SIZE);
            GL20.glUseProgram(0);GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glDisable(GL11.GL_TEXTURE_2D);GL11.glDisable(GL11.GL_LIGHTING);GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_DEPTH_TEST);GL11.glDisable(GL11.GL_BLEND);GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glDisable(GL11.GL_STENCIL_TEST);GL11.glColorMask(true,true,true,true);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,256);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            CameraView primary=new CameraView();primary.capture(0,0,0,0);
            CameraView view=new CameraView();int original=0;
            for(int zoom:new int[]{1,4}) {
                view.set(primary,SIZE,SIZE,zoom,1,1);
                check(view.visible(-1,-1,-11,1,1,-9),"Secondary frustum sees centered target");
                check(!view.visible(-1,-1,9,1,1,11),"Secondary frustum rejects targets behind camera");
                GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadMatrix(view.projection);
                GL11.glClearColor(0,0,0,1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
                check(terrain.begin(view),"Borrow uploaded vanilla lists");terrain.draw(0);terrain.close();
                int width=0;for(int x=0;x<SIZE;x++)if((pixel(x,SIZE/2).get(0)&255)>200)width++;
                if(zoom==1)original=width;
                else check(width>=original*3.5 && width<=original*4.5,"4x detail comes from a real narrow projection");
                check(!renderer.isInFrustum && !renderer.isVisible && renderer.isWaitingOnOcclusionQuery,
                        "Secondary draw leaves primary frustum/occlusion flags unchanged");
            }
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Dedicated terrain pass has no GL errors");
        } finally {
            terrain.close();singleton.set(null,previous);GL11.glDeleteLists(list,1);GL30.glDeleteFramebuffers(output);
        }
    }

    private static void cameraSun() throws Exception {
        LightweightCamera camera=new LightweightCamera();
        int output=fbo(),white=texture(255,255,255,255),depth=GL30.glGenRenderbuffers();
        try {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);GL11.glViewport(0,0,SIZE,SIZE);
            GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
            GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
            GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
            GL20.glUseProgram(0);GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,white);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glColorMask(true,true,true,true);
            GL11.glDepthMask(true);GL11.glClearDepth(1);GL11.glClearColor(0,0,0,1);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,64);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();GL11.glRotatef(-90,1,0,0);
            GL11.glTranslatef(10,20,30);
            CameraView primary=new CameraView(),view=new CameraView();primary.capture(0,0,0,0);
            int original=0;
            for(int zoom:new int[]{1,2}) {
                view.set(primary,SIZE,SIZE,zoom,1,1);
                GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadMatrix(view.projection);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
                camera.drawSun(view,0,1);
                int width=0;for(int x=0;x<SIZE;x++)if((pixel(x,SIZE/2).get(0)&255)>200)width++;
                check(width>0,"Secondary sun draws independently of the primary sky renderer");
                if(zoom==1)original=width;else check(width>original*1.8 && width<original*2.2,"Sun uses genuine camera magnification");
            }
            FloatBuffer sampled=BufferUtils.createFloatBuffer(1);
            GL11.glReadPixels(64,64,1,1,GL11.GL_DEPTH_COMPONENT,GL11.GL_FLOAT,sampled);
            check(sampled.get(0)==1,"Celestial rendering leaves sensor sky depth untouched for cover/bloom");
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);camera.drawSun(view,0,0);
            check((pixel(64,64).get(0)&255)==0,"Rain visibility suppresses the sun");
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Sun pass has no GL errors");
        } finally {
            camera.destroy();GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);
            GL30.glDeleteFramebuffers(output);GL30.glDeleteRenderbuffers(depth);GL11.glDeleteTextures(white);
        }
    }

    private static String terrainResource(ClassLoader loader,String name) {
        String path="assets/"+name.replace(":","/shaders/");
        java.io.InputStream stream=loader.getResourceAsStream(path);
        if(stream==null)throw new IllegalArgumentException(path);
        try(java.util.Scanner reader=new java.util.Scanner(stream,"UTF-8")) {
            return reader.useDelimiter("\\A").next();
        }
    }

    private static int terrainProgram(String vertex,String fragment,java.util.Collection<?> attributes) throws Exception {
        int v=GL20.glCreateShader(GL20.GL_VERTEX_SHADER),f=GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER);
        try {
            GL20.glShaderSource(v,vertex);GL20.glCompileShader(v);
            GL20.glShaderSource(f,fragment);GL20.glCompileShader(f);
            check(GL20.glGetShaderi(v,GL20.GL_COMPILE_STATUS)!=0,"Actual installed terrain vertex shader compiles: "+GL20.glGetShaderInfoLog(v,4096));
            check(GL20.glGetShaderi(f,GL20.GL_COMPILE_STATUS)!=0,"Actual installed terrain fragment shader compiles: "+GL20.glGetShaderInfoLog(f,4096));
            int program=GL20.glCreateProgram();GL20.glAttachShader(program,v);GL20.glAttachShader(program,f);
            int location=0;
            for(Object attribute:attributes)GL20.glBindAttribLocation(program,location++,
                    (String)attribute.getClass().getMethod("getName").invoke(attribute));
            GL30.glBindFragDataLocation(program,0,"fragColor");GL20.glLinkProgram(program);
            check(GL20.glGetProgrami(program,GL20.GL_LINK_STATUS)!=0,"Actual terrain material links: "+GL20.glGetProgramInfoLog(program,4096));
            return program;
        } finally {GL20.glDeleteShader(v);GL20.glDeleteShader(f);}
    }

    private static final class WeatherWorld extends net.minecraft.client.multiplayer.WorldClient {
        float rain;
        int surface, biomeReads;
        boolean loaded;
        net.minecraft.world.biome.BiomeGenBase biome;
        private WeatherWorld() { super(null,null,0,null,null); }
        @Override public float getRainStrength(float partial) { return rain; }
        @Override public boolean blockExists(int x,int y,int z) { return loaded && x==0 && z==-3; }
        @Override public net.minecraft.world.biome.BiomeGenBase getBiomeGenForCoords(int x,int z) { biomeReads++;return biome; }
        @Override public int getPrecipitationHeight(int x,int z) { return surface; }
        @Override public int getLightBrightnessForSkyBlocks(int x,int y,int z,int minimum) { return 15728880; }
        @Override public long getTotalWorldTime() { return 100; }
    }

    private static void cameraWeather() throws Exception {
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
        net.minecraft.client.Minecraft mc=(net.minecraft.client.Minecraft)allocator.allocateInstance(net.minecraft.client.Minecraft.class);
        WeatherWorld world=(WeatherWorld)allocator.allocateInstance(WeatherWorld.class);
        field(net.minecraft.world.World.class,"provider").set(world,allocator.allocateInstance(net.minecraft.world.WorldProviderSurface.class));
        world.rain=1;world.surface=60;world.loaded=true;world.biome=net.minecraft.world.biome.BiomeGenBase.plains;
        mc.theWorld=world;mc.gameSettings=new net.minecraft.client.settings.GameSettings();mc.gameSettings.fancyGraphics=false;
        GL13.glActiveTexture(GL13.GL_TEXTURE0);int white=texture(255,255,255,255);
        ParticleTextures textures=new ParticleTextures(white);mc.renderEngine=textures;
        int output=fbo(),depth=GL30.glGenRenderbuffers();GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        int residue=terrainProgram("#version 120\nvoid main(){gl_Position=ftransform();}",
                "#version 120\nvoid main(){gl_FragColor=vec4(1,0,0,1);}",java.util.Collections.emptyList());
        try {
            GL11.glViewport(0,0,SIZE,SIZE);GL11.glDisable(GL11.GL_SCISSOR_TEST);GL11.glColorMask(true,true,true,true);
            GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glDisable(GL11.GL_TEXTURE_2D);GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,256);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();CameraView primary=new CameraView(),view=new CameraView();
            primary.capture(0.5,64,0.5,0.5F);
            int baseWidth=0;
            for(int zoom:new int[]{1,4}) {
                view.set(primary,SIZE,SIZE,zoom,1,1);GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadMatrix(view.projection);
                GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glDepthMask(true);GL11.glClearDepth(1);GL11.glClearColor(0,0,0,1);
                int caller=zoom==1?0:residue;
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);GL20.glUseProgram(caller);
                CameraWeather.render(mc,view);
                check(GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM)==caller,"Weather restores the caller's shader program");
                check(GL11.glGetBoolean(GL11.GL_DEPTH_WRITEMASK),"Weather restores depth-write state");
                check((pixel(64,64).get(1)&255)>100,"Actual secondary precipitation draws despite shader residue");
                check(textures.last.getResourcePath().equals("textures/environment/rain.png"),"Warm wet biome uses vanilla rain texture");
                FloatBuffer sample=BufferUtils.createFloatBuffer(1);GL11.glReadPixels(64,64,1,1,GL11.GL_DEPTH_COMPONENT,GL11.GL_FLOAT,sample);
                check(sample.get(0)==1,"Rain is transparent geometry without billboard depth writes");
                int width=0;for(int x=0;x<SIZE;x++)if((pixel(x,64).get(1)&255)>100)width++;
                if(zoom==1)baseWidth=width;else check(width>baseWidth*3.5,"Rain geometry uses the magnified secondary projection");
            }
            for(int condition=0;condition<6;condition++) {
                world.rain=1;world.loaded=true;world.surface=60;world.biome=net.minecraft.world.biome.BiomeGenBase.plains;
                if(condition==0)world.rain=0;
                if(condition==1)world.biome=net.minecraft.world.biome.BiomeGenBase.desert;
                if(condition==2)world.surface=80;
                if(condition==3)world.loaded=false;
                if(condition==5)world.biome=net.minecraft.world.biome.BiomeGenBase.icePlains;
                GL11.glDepthMask(true);GL11.glClearDepth(condition==4?0.1:1);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);int reads=world.biomeReads;
                CameraWeather.render(mc,view);int level=pixel(64,64).get(1)&255;
                check(condition==5?level>100:level==0,"Weather respects dry sky/biome, roofs, unloaded chunks, cover and snow; case="+condition);
                if(condition==3)check(world.biomeReads==reads,"Unloaded precipitation columns never request biome/chunk data");
                if(condition==5)check(textures.last.getResourcePath().equals("textures/environment/snow.png"),"Cold biome selects snow");
            }
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Camera weather creates no GL errors");
        } finally {
            GL20.glUseProgram(0);GL20.glDeleteProgram(residue);GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);
            GL30.glDeleteFramebuffers(output);GL30.glDeleteRenderbuffers(depth);GL11.glDeleteTextures(white);
        }
    }

    private static void irisTerrainCorrection(String jar) throws Exception {
        java.util.List<java.net.URL> urls=new java.util.ArrayList<>();
        urls.add(CameraView.class.getProtectionDomain().getCodeSource().getLocation());
        java.nio.file.Path binary=Paths.get(jar);urls.add(binary.toUri().toURL());
        try(java.util.stream.Stream<java.nio.file.Path> files=java.nio.file.Files.list(binary.getParent().getParent().resolve("falsepattern"))) {
            files.filter(path -> path.getFileName().toString().matches("(org.joml-joml-|it.unimi.dsi-fastutil-|.*jvmdowngrader-java-api-).*\\.jar"))
                    .filter(path -> !path.getFileName().toString().endsWith("-17.jar"))
                    .forEach(path -> {try {urls.add(path.toUri().toURL());}catch(java.net.MalformedURLException failure){throw new RuntimeException(failure);}});
        }
        try(URLClassLoader loader=new URLClassLoader(urls.toArray(new java.net.URL[0]),ThermalGpuChecks.class.getClassLoader()) {
            @Override protected Class<?> loadClass(String name,boolean resolve) throws ClassNotFoundException {
                if(!name.startsWith("com.flansmod.client.compat."))return super.loadClass(name,resolve);
                Class<?> type=findLoadedClass(name);if(type==null)type=findClass(name);if(resolve)resolveClass(type);return type;
            }
        }) {
            Object format=loader.loadClass("com.gtnewhorizons.angelica.rendering.celeritas.iris.IrisExtendedChunkVertexType")
                    .getField("VERTEX_FORMAT").get(null);
            java.util.Collection<?> attributes=(java.util.Collection<?>)format.getClass().getMethod("getAttributes").invoke(format);
            check(((Number)format.getClass().getMethod("getStride").invoke(format)).intValue()==48,"Actual Iris terrain format has 48-byte vertices");
            boolean correction=false;for(Object attribute:attributes)
                correction|=attribute.getClass().getMethod("getName").invoke(attribute).equals("a_RdhFactor");
            check(!correction,"Installed Iris terrain omits the AO correction attribute");
            Class<?> constants=loader.loadClass("org.embeddedt.embeddium.impl.gl.shader.ShaderConstants");
            Method parse=loader.loadClass("org.embeddedt.embeddium.impl.gl.shader.ShaderParser")
                    .getMethod("parseShader",String.class,java.util.function.Function.class,constants);
            java.util.function.Function<String,String> imports=name -> terrainResource(loader,name);
            Object defines=constants.getField("EMPTY").get(null);
            String vertex=(String)parse.invoke(null,terrainResource(loader,"sodium:blocks/block_layer_opaque.vsh"),imports,defines);
            String fragment=(String)parse.invoke(null,terrainResource(loader,"sodium:blocks/block_layer_opaque.fsh"),imports,defines);
            Method patch=loader.loadClass("com.flansmod.client.compat.AngelicaCameraTerrain").getDeclaredMethod("withoutMissingCorrection",String.class);
            patch.setAccessible(true);String fixed=(String)patch.invoke(null,vertex);
            int oldProgram=terrainProgram(vertex,fragment,attributes),program=terrainProgram(fixed,fragment,attributes);
            Object vanillaFormat=loader.loadClass("org.embeddedt.embeddium.impl.render.chunk.vertex.format.impl.VanillaLikeChunkVertex")
                    .getField("VERTEX_FORMAT").get(null);
            java.util.Collection<?> vanillaAttributes=(java.util.Collection<?>)vanillaFormat.getClass().getMethod("getAttributes").invoke(vanillaFormat);
            int vanillaProgram=terrainProgram(vertex,fragment,vanillaAttributes);
            int output=fbo(),green=texture(64,128,32,255),white=texture(255,255,255,255),night=nightLightmap();
            int vao=GL30.glGenVertexArrays(),vbo=GL15.glGenBuffers();GL30.glBindVertexArray(vao);
            try {
                check(GL20.glGetAttribLocation(oldProgram,"a_RdhFactor")>=0,"Old material reads an attribute absent from the mesh");
                check(GL20.glGetAttribLocation(program,"a_RdhFactor")==-1,"Corrected material eliminates the missing attribute input");
                ByteBuffer vertices=BufferUtils.createByteBuffer(48*4);
                for(float[] p:new float[][]{{-1,-1},{-1,1},{1,1},{1,-1}}) {
                    vertices.putFloat(p[0]).putFloat(p[1]).putFloat(-10).putInt(-1).putFloat(0.5F).putFloat(0.5F);
                    vertices.putInt(0xf0f00000).putShort((short)32768).putShort((short)32768);
                    vertices.putInt(0).putInt(0).putInt(0).putInt(0);
                }
                vertices.flip();GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER,vbo);GL15.glBufferData(GL15.GL_ARRAY_BUFFER,vertices,GL15.GL_STATIC_DRAW);
                for(int i=0;i<5;i++)GL20.glEnableVertexAttribArray(i);
                GL20.glVertexAttribPointer(0,3,GL11.GL_FLOAT,false,48,0L);
                GL20.glVertexAttribPointer(1,4,GL11.GL_UNSIGNED_BYTE,true,48,12L);
                GL20.glVertexAttribPointer(2,2,GL11.GL_FLOAT,false,48,16L);
                GL30.glVertexAttribIPointer(3,1,GL11.GL_UNSIGNED_INT,48,24L);
                GL20.glVertexAttribPointer(4,2,GL11.GL_UNSIGNED_SHORT,false,48,28L);
                GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);GL11.glViewport(0,0,SIZE,SIZE);
                GL11.glDisable(GL11.GL_DEPTH_TEST);GL11.glDisable(GL11.GL_CULL_FACE);GL11.glDisable(GL11.GL_BLEND);
                GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glBindTexture(GL11.GL_TEXTURE_2D,white);
                GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,green);
                GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,256);
                GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
                CameraView view=new CameraView();view.capture(0,0,0,0);
                for(int material:new int[]{oldProgram,program}) {
                    GL20.glUseProgram(material);
                    GL20.glUniformMatrix4(GL20.glGetUniformLocation(material,"u_ProjectionMatrix"),false,view.projection);
                    GL20.glUniformMatrix4(GL20.glGetUniformLocation(material,"u_ModelViewMatrix"),false,view.modelView);
                    GL20.glUniform3f(GL20.glGetUniformLocation(material,"u_RegionOffset"),0,0,0);
                    GL20.glUniform1i(GL20.glGetUniformLocation(material,"u_BlockTex"),0);
                    GL20.glUniform1i(GL20.glGetUniformLocation(material,"u_LightTex"),1);
                    GL11.glClearColor(0,0,0,1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);GL11.glDrawArrays(GL11.GL_TRIANGLE_FAN,0,4);
                    ByteBuffer sample=pixel(64,64);
                    if(material==oldProgram)check((sample.get(0)&255)>240 && (sample.get(1)&255)>240,"Actual old shader reproduces yellow terrain from packed mid-UV input");
                    else check(Math.abs((sample.get(0)&255)-64)<=1 && Math.abs((sample.get(1)&255)-128)<=1
                            && Math.abs((sample.get(2)&255)-32)<=1,"Corrected shader retains terrain texture color");
                }
                GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glBindTexture(GL11.GL_TEXTURE_2D,night);
                GL13.glActiveTexture(GL13.GL_TEXTURE0);
                for(int material:new int[]{program,vanillaProgram}) {
                    GL20.glUseProgram(material);
                    GL20.glUniformMatrix4(GL20.glGetUniformLocation(material,"u_ProjectionMatrix"),false,view.projection);
                    GL20.glUniformMatrix4(GL20.glGetUniformLocation(material,"u_ModelViewMatrix"),false,view.modelView);
                    GL20.glUniform3f(GL20.glGetUniformLocation(material,"u_RegionOffset"),0,0,0);
                    GL20.glUniform1i(GL20.glGetUniformLocation(material,"u_BlockTex"),0);
                    GL20.glUniform1i(GL20.glGetUniformLocation(material,"u_LightTex"),1);
                    if(material==vanillaProgram) GL20.glVertexAttribPointer(4,4,GL11.GL_BYTE,true,48,28L);
                    for(int light:new int[]{0xf0000000,0x00f00000}) {
                        for(int n=0;n<4;n++){vertices.putInt(n*48+24,light);vertices.putInt(n*48+28,0);}
                        GL15.glBufferSubData(GL15.GL_ARRAY_BUFFER,0,vertices);
                        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);GL11.glDrawArrays(GL11.GL_TRIANGLE_FAN,0,4);
                        int value=pixel(64,64).get(1)&255;
                        check(light==0xf0000000 ? value>=18 && value<=20 : value>=127 && value<=129,
                                "Actual Iris/vanilla-like near terrain distinguishes night sky from block lighting");
                    }
                }
                check(GL11.glGetError()==GL11.GL_NO_ERROR,"Installed Iris-format terrain fixture has no GL errors");
            } finally {
                GL20.glUseProgram(0);GL30.glBindVertexArray(0);GL30.glDeleteVertexArrays(vao);GL15.glDeleteBuffers(vbo);
                GL20.glDeleteProgram(oldProgram);GL20.glDeleteProgram(program);GL20.glDeleteProgram(vanillaProgram);GL30.glDeleteFramebuffers(output);
                GL11.glDeleteTextures(green);GL11.glDeleteTextures(white);GL11.glDeleteTextures(night);
            }
        }
    }

    public static final class BorrowedIndices {
        public final java.util.concurrent.locks.StampedLock renderStampLock = new java.util.concurrent.locks.StampedLock();
        final int id = GL15.glGenBuffers();
        public int getId() { return id; }
        public int getGlType() { return GL11.GL_UNSIGNED_SHORT; }
    }
    public static final class BorrowedVertices {
        public final java.util.concurrent.locks.StampedLock renderStampLock = new java.util.concurrent.locks.StampedLock();
        final int id = GL15.glGenBuffers();
        final BorrowedIndices indices = new BorrowedIndices();
        public int getId() { return id; }
        public int getVertexCount() { return 4; }
        public BorrowedIndices getQuadIBO() { return indices; }
        BorrowedVertices(int size) {
            this(size,255);
        }
        BorrowedVertices(int size,int packedLight) {
            ByteBuffer vertices = BufferUtils.createByteBuffer(64);
            for (int[] position : new int[][] {{0,0},{size,0},{size,size},{0,size}}) {
                vertices.putShort((short)position[0]).putShort((short)position[1]).putShort((short)0).putShort((short)packedLight);
                vertices.put((byte)64).put((byte)128).put((byte)192).put((byte)255).putInt(0);
            }
            vertices.flip(); GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER,id);
            GL15.glBufferData(GL15.GL_ARRAY_BUFFER,vertices,GL15.GL_STATIC_DRAW);
            java.nio.ShortBuffer elements = BufferUtils.createShortBuffer(6);
            elements.put(new short[]{0,1,2,0,2,3}).flip();
            GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER,indices.id);
            GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER,elements,GL15.GL_STATIC_DRAW);
        }
        void delete() { GL15.glDeleteBuffers(id); GL15.glDeleteBuffers(indices.id); }
    }

    private static void distantCameraGeometry() throws Exception {
        DistantCameraGeometry terrain=new DistantCameraGeometry();
        int output=fbo(),depth=GL30.glGenRenderbuffers(),white=texture(255,255,255,255);
        int callerVao=GL30.glGenVertexArrays();GL30.glBindVertexArray(callerVao);
        BorrowedVertices near=new BorrowedVertices(2),far=new BorrowedVertices(200);
        try {
            terrain.bindBufferType(BorrowedVertices.class);
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);
            GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
            GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
            GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
            GL11.glViewport(0,0,SIZE,SIZE);GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glBindTexture(GL11.GL_TEXTURE_2D,white);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glDisable(GL11.GL_BLEND);GL11.glDisable(GL11.GL_CULL_FACE);GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glEnable(GL11.GL_DEPTH_TEST);GL11.glDepthFunc(GL11.GL_LESS);GL11.glDepthMask(true);
            GL11.glClearDepth(1);GL11.glClearColor(0,0,0,1);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,256);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            CameraView primary=new CameraView(),view=new CameraView();primary.capture(0,0,0,0);
            view.set(primary,SIZE,SIZE,2,1,1);
            check(DistantCameraGeometry.canBorrow(primary,view),"Narrow secondary view can borrow primary DH candidates");
            view.x=1;check(!DistantCameraGeometry.canBorrow(primary,view),"Displaced camera cannot borrow primary DH candidates");
            view.set(primary,SIZE,SIZE,0.5F,1,1);
            check(!DistantCameraGeometry.canBorrow(primary,view),"Wider view cannot borrow primary DH candidates");
            view.set(primary,SIZE,SIZE,1,1,1);
            check(!view.visible(-100,-100,-1001,100,100,-999),"Vanilla far plane excludes distant terrain");
            check(view.visible(-100,-100,-1001,100,100,-999,true),"DH frustum keeps terrain beyond vanilla far plane");
            for (BorrowedVertices mesh : new BorrowedVertices[]{near,far}) {
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER,near.id);
                check(terrain.beginDraw(view,0,32),"Independent DH material program compiles");
                terrain.offset(mesh==near?-1:-100,mesh==near?-1:-100,mesh==near?-10:-1000);
                check(terrain.drawMesh(mesh),"Borrowed DH vertex and per-mesh index buffers draw");terrain.endDraw();
                ByteBuffer sample=pixel(64,64);
                check(Math.abs((sample.get(0)&255)-64)<=1 && Math.abs((sample.get(1)&255)-128)<=1
                        && Math.abs((sample.get(2)&255)-192)<=1,"DH vertex color survives private camera draw");
                FloatBuffer sampled=BufferUtils.createFloatBuffer(1);
                GL11.glReadPixels(64,64,1,1,GL11.GL_DEPTH_COMPONENT,GL11.GL_FLOAT,sampled);
                float pz=view.projection.get(10),po=view.projection.get(14);
                double transition=0.5*((pz*-32+po)/32+1);
                double expected=mesh==near?0.5*((pz*-10+po)/10+1)
                        :transition+(1-transition)*PlayerLodProjection.depthFraction(1000,32);
                check(Math.abs(sampled.get(0)-expected)<0.000002,"DH depth matches distant actor occlusion law");
                check(GL11.glGetInteger(GL30.GL_VERTEX_ARRAY_BINDING)==callerVao
                        && GL11.glGetInteger(GL15.GL_ARRAY_BUFFER_BINDING)==near.id
                        && GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM)==0,"DH draw restores caller VAO, array buffer and program");
            }
            long lock=near.renderStampLock.writeLock();
            try { check(!terrain.drawMesh(near),"Busy DH vertex upload defers sensor without blocking"); }
            finally { near.renderStampLock.unlockWrite(lock); }
            lock=near.indices.renderStampLock.writeLock();
            try { check(!terrain.drawMesh(near),"Busy per-mesh index upload defers sensor without blocking"); }
            finally { near.indices.renderStampLock.unlockWrite(lock); }
            lock=near.renderStampLock.tryWriteLock();check(lock!=0,"Failed DH draw releases its vertex read lock");
            if(lock!=0)near.renderStampLock.unlockWrite(lock);
            terrain.destroy();
            check(GL15.glIsBuffer(near.id)&&GL15.glIsBuffer(far.id)&&GL15.glIsBuffer(near.indices.id)
                    &&GL15.glIsBuffer(far.indices.id),"Camera destroy retains all borrowed DH GPU buffers");
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Private DH geometry has no GL errors");
        } finally {
            terrain.endDraw();terrain.destroy();GL30.glBindVertexArray(0);GL30.glDeleteVertexArrays(callerVao);
            near.delete();far.delete();GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER,0);
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL30.glDeleteFramebuffers(output);
            GL30.glDeleteRenderbuffers(depth);GL11.glDeleteTextures(white);
        }
    }

    private static int nightLightmap() {
        int id=GL11.glGenTextures();GL11.glBindTexture(GL11.GL_TEXTURE_2D,id);
        ByteBuffer colors=BufferUtils.createByteBuffer(16*16*4);
        for(int sky=0;sky<16;sky++)for(int block=0;block<16;block++) {
            int value=Math.max(8+sky*2,block*17);
            colors.put((byte)value).put((byte)value).put((byte)value).put((byte)255);
        }
        colors.flip();GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,16,16,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,colors);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_S,GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_T,GL12.GL_CLAMP_TO_EDGE);
        return id;
    }

    private static void distantNightLighting() throws Exception {
        DistantCameraGeometry terrain=new DistantCameraGeometry();
        int output=fbo(),depth=GL30.glGenRenderbuffers(),vao=GL30.glGenVertexArrays();
        GL13.glActiveTexture(GL13.GL_TEXTURE1);int lightmap=nightLightmap();
        GL13.glActiveTexture(GL13.GL_TEXTURE0);int foliage=GL11.glGenTextures();GL11.glBindTexture(GL11.GL_TEXTURE_2D,foliage);
        ByteBuffer cutout=BufferUtils.createByteBuffer(16*16*4);
        for(int y=0;y<16;y++)for(int x=0;x<16;x++)cutout.put((byte)255).put((byte)255).put((byte)255).put((byte)((x+y)%2==0?255:0));
        cutout.flip();GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,16,16,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,cutout);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
        // The installed DH builder packs sky in the low nibble and block light in the high nibble.
        BorrowedVertices sky=new BorrowedVertices(200,15),torch=new BorrowedVertices(200,240);
        try {
            terrain.bindBufferType(BorrowedVertices.class);GL30.glBindVertexArray(vao);
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
            GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
            GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
            GL11.glViewport(0,0,SIZE,SIZE);GL20.glUseProgram(0);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,256);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();CameraView primary=new CameraView(),view=new CameraView();
            primary.capture(0,0,0,0);view.set(primary,SIZE,SIZE,4,1,1);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadMatrix(view.projection);
            GL11.glDisable(GL11.GL_BLEND);GL11.glDisable(GL11.GL_CULL_FACE);GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_LIGHTING);GL11.glEnable(GL11.GL_DEPTH_TEST);GL11.glDepthFunc(GL11.GL_LESS);GL11.glDepthMask(true);
            for(BorrowedVertices mesh:new BorrowedVertices[]{sky,torch}) {
                GL11.glClearColor(0,0,0,1);GL11.glClearDepth(1);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
                check(terrain.beginDraw(view,0,32),"Night DH camera material compiles");terrain.offset(-100,-100,-1000);
                check(terrain.drawMesh(mesh),"Night DH mesh submits");terrain.endDraw();int value=pixel(64,64).get(1)&255;
                if(mesh==sky) check(value>=18 && value<=20,"Open-sky DH terrain receives night sky light, not full block light; got "+value);
                else {check(value>=127 && value<=129,"Real DH block light remains bright at night");continue;}
                GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glMatrixMode(GL11.GL_TEXTURE);GL11.glLoadIdentity();GL11.glMatrixMode(GL11.GL_MODELVIEW);
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,GL11.GL_MODULATE);
                GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glEnable(GL11.GL_TEXTURE_2D);GL11.glBindTexture(GL11.GL_TEXTURE_2D,foliage);
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,GL11.GL_MODULATE);
                GL11.glEnable(GL11.GL_ALPHA_TEST);GL11.glAlphaFunc(GL11.GL_GREATER,0.5F);
                GL11.glColor4f(64/255F,128/255F,192/255F,1);GL13.glMultiTexCoord2f(GL13.GL_TEXTURE1,0.5F/16,15.5F/16);
                GL11.glBegin(GL11.GL_QUADS);
                GL11.glTexCoord2f(0,0);GL11.glVertex3f(-1,-1,-10);GL11.glTexCoord2f(1,0);GL11.glVertex3f(1,-1,-10);
                GL11.glTexCoord2f(1,1);GL11.glVertex3f(1,1,-10);GL11.glTexCoord2f(0,1);GL11.glVertex3f(-1,1,-10);GL11.glEnd();
                for(int y=44;y<=84;y+=4)for(int x=44;x<=84;x+=4)
                    check(Math.abs((pixel(x,y).get(1)&255)-value)<=1,"Cutout grass and the DH terrain visible through it share night lighting");
                GL11.glDisable(GL11.GL_ALPHA_TEST);GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glDisable(GL11.GL_TEXTURE_2D);
                GL13.glActiveTexture(GL13.GL_TEXTURE0);
            }
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Night lighting and cutout transition have no GL errors");
        } finally {
            terrain.endDraw();terrain.destroy();sky.delete();torch.delete();GL30.glBindVertexArray(0);GL30.glDeleteVertexArrays(vao);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER,0);
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL30.glDeleteFramebuffers(output);GL30.glDeleteRenderbuffers(depth);
            GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glDisable(GL11.GL_TEXTURE_2D);GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glDeleteTextures(lightmap);GL11.glDeleteTextures(foliage);GL11.glColor4f(1,1,1,1);
        }
    }

    private static void profileEffects() throws Exception {
        ThermalCamera camera=ThermalCamera.INSTANCE;
        int source=fbo(),depth=GL30.glGenRenderbuffers();
        GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        try {
            GL11.glDepthMask(true);GL11.glClearDepth(1);GL11.glClearColor(0.4F,0.4F,0.4F,1);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            check(camera.prepareDepth(source,SIZE,SIZE),"Profile fixture depth prepares");camera.captureColor(source,SIZE,SIZE);
            camera.projectSun(0,0,-1,0);camera.renderHeat(() -> {});
            camera.beginSample(com.flansmod.common.guns.ThermalProfile.DEFAULT);
            display(camera,true);int white=pixel(64,64).get(0)&255;
            camera.beginSample(com.flansmod.common.guns.ThermalProfile.DEFAULT.with("ThermalPalette","BLACK_HOT"));
            display(camera,true);check(Math.abs(white+(pixel(64,64).get(0)&255)-255)<=1,"Black-hot reverses white-hot response");
            camera.beginSample(com.flansmod.common.guns.ThermalProfile.DEFAULT.with("ThermalPalette","GREEN"));
            display(camera,true);ByteBuffer green=pixel(64,64);check((green.get(1)&255)>(green.get(0)&255),"Content palette changes sensor colors");
            camera.beginSample(com.flansmod.common.guns.ThermalProfile.DEFAULT.with("ThermalGrain","0.4"));
            display(camera,true);int first=pixel(64,64).get(0)&255;
            display(camera,true);check((pixel(64,64).get(0)&255)==first,"Grain is locked to the sample, not display FPS");
            camera.beginSample(com.flansmod.common.guns.ThermalProfile.DEFAULT.with("ThermalSensitivity","0.5"));
            display(camera,true);check((pixel(64,64).get(0)&255)<white,"Sensitivity is applied to sensor data");
        } finally {
            camera.beginSample(com.flansmod.common.guns.ThermalProfile.DEFAULT);
            GL30.glDeleteFramebuffers(source);GL30.glDeleteRenderbuffers(depth);
        }
    }

    private static void sensorLightmap() throws Exception {
        LightweightCamera camera=new LightweightCamera();
        Method bind=LightweightCamera.class.getDeclaredMethod("bindSensorLightmap");bind.setAccessible(true);
        int output=fbo(),white=texture(255,255,255,255),dark=texture(0,0,0,255);
        try {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,output);GL11.glViewport(0,0,SIZE,SIZE);GL20.glUseProgram(0);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            GL11.glDisable(GL11.GL_DEPTH_TEST);GL11.glDisable(GL11.GL_BLEND);GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_LIGHTING);GL11.glColor4f(1,1,1,1);
            int first=-1;
            for(int playerLightmap:new int[]{dark,white}) {
                GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,GL11.GL_MODULATE);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D,playerLightmap);
                bind.invoke(camera);
                GL11.glEnable(GL11.GL_TEXTURE_2D);GL11.glBindTexture(GL11.GL_TEXTURE_2D,white);
                GL11.glTexEnvi(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,GL11.GL_MODULATE);quad(1,0);
                int value=pixel(64,64).get(0)&255;
                check(value>=159 && value<=161,"Sensor illumination uses its neutral lightmap");
                if(first>=0)check(value==first,"Player lightmap/gamma cannot change sensor illumination");
                first=value;
            }
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Sensor lightmap has no GL errors");
        } finally {
            camera.destroy();GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glDeleteTextures(white);GL11.glDeleteTextures(dark);
            GL30.glDeleteFramebuffers(output);
        }
    }

    private static net.minecraft.client.shader.Framebuffer fixtureFramebuffer(sun.misc.Unsafe allocator,boolean depth) throws Exception {
        net.minecraft.client.shader.Framebuffer framebuffer=(net.minecraft.client.shader.Framebuffer)
                allocator.allocateInstance(net.minecraft.client.shader.Framebuffer.class);
        framebuffer.framebufferObject=fbo();
        framebuffer.framebufferTexture=GL30.glGetFramebufferAttachmentParameteri(GL30.GL_FRAMEBUFFER,
                GL30.GL_COLOR_ATTACHMENT0,GL30.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME);
        framebuffer.framebufferWidth=SIZE;framebuffer.framebufferHeight=SIZE;
        framebuffer.framebufferTextureWidth=SIZE;framebuffer.framebufferTextureHeight=SIZE;
        framebuffer.depthBuffer=-1;
        if(depth) {
            framebuffer.depthBuffer=GL30.glGenRenderbuffers();
            GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,framebuffer.depthBuffer);
            GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
            GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,framebuffer.depthBuffer);
        }
        return framebuffer;
    }

    private static final class OverlayRenderer extends net.minecraft.client.renderer.EntityRenderer {
        private OverlayRenderer() { super(null,null); }
        @Override public void setupOverlayRendering() {
            GL11.glViewport(0,0,SIZE,SIZE);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(0,SIZE,SIZE,0,-1000,1000);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
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

    private static void emissiveParticles() throws Exception {
        ThermalCamera camera=ThermalCamera.INSTANCE;
        int source=fbo(),depth=GL30.glGenRenderbuffers();
        GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        for(boolean emissive:new boolean[]{false,true})
            for(boolean behind:new boolean[]{false,true})
                for(boolean premultiplied:new boolean[]{false,true}) {
                    GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);
                    GL11.glColorMask(true,true,true,true);GL11.glDepthMask(true);
                    GL11.glClearDepth(0.5);GL11.glClearColor(0.12F,0.12F,0.12F,1);
                    GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
                    GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
                    GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
                    check(camera.prepareDepth(source,SIZE,SIZE),"Emissive sprite depth preparation");
                    camera.captureColor(source,SIZE,SIZE);camera.projectSun(0,0,-1,0);camera.renderHeat(() -> {});
                    int sprite=particleSprite(255,premultiplied);
                    camera.renderParticles(() -> {
                        GL11.glBindTexture(GL11.GL_TEXTURE_2D,sprite);
                        GL11.glBlendFunc(premultiplied ? GL11.GL_ONE : GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);
                        GL13.glMultiTexCoord2f(GL13.GL_TEXTURE1,emissive ? 240 : 0,240);
                        GL11.glColor4f(1,0.3F,0.05F,1);quad(1,behind ? -0.5 : 0.5);
                    });
                    display(camera,true);
                    int center=pixel(64,64).get(0)&255;
                    check(emissive && !behind ? center==255 : center<100,"Only visible emissive sprites become white-hot");
                    check((pixel(4,4).get(0)&255)<100,"White-hot sprites retain transparent edges");
                    display(camera,false);check(Math.abs((pixel(64,64).get(0)&255)-31)<=2,"Emissive mask leaves FLIR-off color unchanged");
                    GL11.glDeleteTextures(sprite);
                }
        GL13.glMultiTexCoord2f(GL13.GL_TEXTURE1,0,0);
        nativeFlanFlash(camera,source);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);GL30.glDeleteFramebuffers(source);GL30.glDeleteRenderbuffers(depth);
    }

    private static void nativeFlanFlash(ThermalCamera camera,int source) throws Exception {
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
        net.minecraft.client.Minecraft mc=(net.minecraft.client.Minecraft)allocator.allocateInstance(net.minecraft.client.Minecraft.class);
        com.flansmod.client.particle.EntityFlash flash=(com.flansmod.client.particle.EntityFlash)
                allocator.allocateInstance(com.flansmod.client.particle.EntityFlash.class);
        for(String name:new String[]{"particleRed","particleGreen","particleBlue"})
            field(net.minecraft.client.particle.EntityFX.class,name).setFloat(flash,1);
        int sprite=particleSprite(255,true);mc.renderEngine=new ParticleTextures(sprite);
        cpw.mods.fml.client.FMLClientHandler handler=cpw.mods.fml.client.FMLClientHandler.instance();
        Field client=field(handler.getClass(),"client");Object previous=client.get(handler);
        try {
            client.set(handler,mc);
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);GL11.glDepthMask(true);
            GL11.glColorMask(true,true,true,true);GL11.glClearDepth(1);GL11.glClearColor(0.12F,0.12F,0.12F,1);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GL11.glOrtho(-1,1,-1,1,-1,1);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();
            check(camera.prepareDepth(source,SIZE,SIZE),"Native FMUR flash depth preparation");
            camera.captureColor(source,SIZE,SIZE);camera.renderHeat(() -> {});
            camera.renderParticles(() -> flash.renderParticle(net.minecraft.client.renderer.Tessellator.instance,0,1,1,0,0,0));
            display(camera,true);
            check((pixel(64,64).get(0)&255)==255,"Native FMUR flash sets emissive brightness after starting its batch");
            check((pixel(4,4).get(0)&255)<100,"Native FMUR flash retains transparent sprite edges");
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Native FMUR flash replay has no GL errors");
        } finally {client.set(handler,previous);GL11.glDeleteTextures(sprite);}
    }

    private static void primaryApertureIsolation() throws Exception {
        Field valid=field(ThermalScopeEffect.class,"postCompositeLensGeometryValid");
        Field nested=field(ThermalScopeEffect.class,"renderingScopedWorld");
        float[] x=(float[])field(ThermalScopeEffect.class,"postCompositeLensNdcX").get(null);
        boolean oldValid=valid.getBoolean(null),oldNested=nested.getBoolean(null);float oldX=x[0];
        try {
            valid.setBoolean(null,true);x[0]=0.125F;nested.setBoolean(null,true);
            ThermalScopeEffect.captureModelLensGeometry(0,0,-1,1,0,0,0,1,0,0.1F);
            check(valid.getBoolean(null) && x[0]==0.125F,"Second world camera preserves primary aperture");
            nested.setBoolean(null,false);
            ThermalRenderApi.renderHeat(0,() -> ThermalScopeEffect.captureModelLensGeometry(0,0,-1,1,0,0,0,1,0,0.1F));
            check(valid.getBoolean(null) && x[0]==0.125F,"Heat target's held optic preserves primary aperture");
        } finally { valid.setBoolean(null,oldValid);nested.setBoolean(null,oldNested);x[0]=oldX; }
    }

    private static void m40LensSize() throws Exception {
        com.flansmod.client.model.ModelGun model=new com.flansmod.client.model.BFMCpack.ModelM40A5();
        check(model.scopedLensScale==2F,"M40 requests twice its previous ADS diameter");
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
        com.flansmod.common.guns.type.GunType gun=(com.flansmod.common.guns.type.GunType)
                allocator.allocateInstance(com.flansmod.common.guns.type.GunType.class);
        gun.pictureInPicture=true;gun.modelScale=0.05F;
        gun.pictureInPictureX=13;gun.pictureInPictureY=173;gun.pictureInPictureZ=0.5F;gun.pictureInPictureRadius=9.75F;
        Method align=com.flansmod.client.model.RenderGun.class.getDeclaredMethod("alignPictureInPictureScope",
                gun.getClass(),com.flansmod.client.model.ModelGun.class,com.flansmod.common.guns.IScope.class,Float.TYPE);
        align.setAccessible(true);Object renderer=new com.flansmod.client.model.RenderGun();
        FloatBuffer matrix=BufferUtils.createFloatBuffer(16);float originalDepth=0;
        for(float scale:new float[]{1,2}) {
            model.scopedLensScale=scale;
            GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(70,1,0.05F,256);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();GL11.glTranslatef(0.3F,-0.2F,-2);
            align.invoke(renderer,gun,model,gun,1F);GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX,matrix);
            float eyeX=gun.pictureInPictureX*gun.modelScale/16+matrix.get(12);
            float eyeY=gun.pictureInPictureY*gun.modelScale/16+matrix.get(13);
            float eyeZ=gun.pictureInPictureZ*gun.modelScale/16+matrix.get(14);
            check(Math.abs(eyeX)<0.00001F && Math.abs(eyeY)<0.00001F,"M40 enlarged aperture stays centered");
            if(scale==1)originalDepth=eyeZ;
            else check(Math.abs(originalDepth/eyeZ-2)<0.00001F,"Actual M40 projection doubles lens diameter");
        }
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
            state=ScopeRenderCompatibility.beginSecondaryRender();
            try {
                check(state.isSecondaryRenderAllowed(),"Isolated thermal world camera permitted");
                check(FakeIris.manager.pipeline!=primary,"Thermal camera does not advance primary shader pipeline");
            } finally {ScopeRenderCompatibility.endSecondaryRender(state);}
            check(FakeIris.manager.pipeline==primary,"Thermal world camera restores primary shader pipeline");
        } finally {for(java.util.Map.Entry<Field,Object> entry:saved.entrySet())entry.getKey().set(null,entry.getValue());}
    }

    private static void distantHorizonsIsolation(String jar) throws Exception {
        Class<?> compat=ScopeRenderCompatibility.class;
        java.util.Map<Field,Object> saved=new java.util.HashMap<Field,Object>();
        for(Field f:compat.getDeclaredFields()) {
            if(f.getName().startsWith("distantHorizons") || f.getName().startsWith("iris")
                    || f.getName().equals("fixedPipelineConstructor") || f.getName().equals("pipelineField")
                    || f.getName().equals("pipelinesPerDimensionField") || f.getName().equals("lastPreparedDimensionField")) {
                f.setAccessible(true);saved.put(f,f.get(null));
            }
        }
        try (URLClassLoader dh=new URLClassLoader(new java.net.URL[]{Paths.get(jar).toUri().toURL()},
                ThermalGpuChecks.class.getClassLoader())) {
            DistantCameraGeometry geometry=new DistantCameraGeometry();
            Method resolveGeometry=DistantCameraGeometry.class.getDeclaredMethod("resolve",ClassLoader.class);
            resolveGeometry.setAccessible(true);resolveGeometry.invoke(geometry,dh);
            check(geometry.failure().isEmpty() && field(DistantCameraGeometry.class,"present").getBoolean(geometry),
                    "Read-only DH camera resolves actual installed buffer interfaces: "+geometry.failure());
            geometry.destroy();
            field(compat,"distantHorizonsChecked").setBoolean(null,false);
            Method resolve=compat.getDeclaredMethod("initialiseDistantHorizonsReflection",ClassLoader.class);
            resolve.setAccessible(true);resolve.invoke(null,dh);
            check(field(compat,"distantHorizonsModelViewField").get(null)!=null,"Installed forge17 DH bridge resolves instead of silently disabling restoration");
            Object api=field(compat,"distantHorizonsClientApi").get(null);
            Object proxy=field(compat,"distantHorizonsRenderProxy").get(null);
            Object renderState=field(compat,"distantHorizonsRenderState").get(null);
            Field shaderMode=(Field)field(compat,"distantHorizonsShadersEnabledField").get(null);
            Field deferred=(Field)field(compat,"distantHorizonsDeferTransparentField").get(null);
            Field helperModel=(Field)field(compat,"distantHorizonsModelViewField").get(null);
            Field helperProjection=(Field)field(compat,"distantHorizonsProjectionField").get(null);
            Field worldModel=field(renderState.getClass(),"mcModelViewMatrix");
            Field worldProjection=field(renderState.getClass(),"mcProjectionMatrix");
            Object primaryModel=dh.loadClass("com.seibel.distanthorizons.core.util.math.DhMat4f").newInstance();
            Object primaryProjection=dh.loadClass("com.seibel.distanthorizons.core.util.math.DhMat4f").newInstance();
            primaryModel.getClass().getMethod("setTranslation",Float.TYPE,Float.TYPE,Float.TYPE)
                    .invoke(primaryModel,128F,72F,-256F);
            helperModel.set(null,primaryModel);helperProjection.set(null,primaryProjection);
            worldModel.set(renderState,primaryModel);worldProjection.set(renderState,primaryProjection);
            shaderMode.setBoolean(api,true);deferred.setBoolean(proxy,true);
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
            for(int frame=0;frame<4;frame++) {
                ScopeRenderCompatibility.RenderState state=ScopeRenderCompatibility.beginSecondaryRender();
                try {
                    check(state.isSecondaryRenderAllowed(),"Thermal camera allowed with actual DH bridge");
                    check(!new FakeIris().isShaderPackInUse(),"Iris reports shaders off for fixed pipeline, matching installed IrisApi");
                    check(shaderMode.getBoolean(api)==new FakeIris().isShaderPackInUse(),"DH shader-toggle cache-clear condition stays false in scope camera");
                    check(!deferred.getBoolean(proxy),"Isolated thermal camera does not defer water into primary shader pass");
                    GL11.glMatrixMode(GL11.GL_PROJECTION);GL11.glLoadIdentity();GLU.gluPerspective(12,1,0.05F,256);
                    FloatBuffer narrow=BufferUtils.createFloatBuffer(16);GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX,narrow);
                    Class<?> helper=helperModel.getDeclaringClass();
                    helper.getMethod("setProjectionMatrixFromBuffer",FloatBuffer.class).invoke(null,narrow);
                    Object scopeProjection=helper.getMethod("getProjectionMatrix").invoke(null);
                    check(scopeProjection.getClass().getField("m11").getFloat(scopeProjection)>9,"Actual DH matrix hook receives narrow scope projection");
                    GL11.glMatrixMode(GL11.GL_MODELVIEW);GL11.glLoadIdentity();GL11.glTranslatef(-128,-72,256);
                    FloatBuffer view=BufferUtils.createFloatBuffer(16);GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX,view);
                    helper.getMethod("setModelViewMatrixFromBuffer",FloatBuffer.class).invoke(null,view);
                    Object scopeModel=helper.getMethod("getModelViewMatrix").invoke(null);
                    check(scopeModel.getClass().getField("m03").getFloat(scopeModel)==-128,"Actual DH matrix hook retains camera translation");
                    worldModel.set(renderState,scopeModel);worldProjection.set(renderState,scopeProjection);
                    if(frame==2)throw new IllegalStateException("DH camera fixture");
                } catch(IllegalStateException expected) {
                    check(frame==2,"Only intentional camera failure is caught");
                } finally {ScopeRenderCompatibility.endSecondaryRender(state);}
                check(FakeIris.manager.pipeline==primary,"Primary shader pipeline restored after DH camera");
                check(shaderMode.getBoolean(api),"DH shader-toggle cache-clear condition stays false on next primary frame");
                check(deferred.getBoolean(proxy),"Primary DH transparency mode restored");
                check(helperModel.get(null)==primaryModel && helperProjection.get(null)==primaryProjection,"DH helper camera matrices restored exactly");
                check(worldModel.get(renderState)==primaryModel && worldProjection.get(renderState)==primaryProjection,"DH render-state camera matrices restored exactly");
            }
            ScopeRenderCompatibility.RenderState color=ScopeRenderCompatibility.beginShaderAwareSecondaryRender();
            try {check(shaderMode.getBoolean(api) && deferred.getBoolean(proxy),"Working shader-aware color camera keeps DH shader mode");}
            finally {ScopeRenderCompatibility.endSecondaryRender(color);}
            FakeIris.manager.pipeline=new FakePipeline();shaderMode.setBoolean(api,false);deferred.setBoolean(proxy,false);
            Object unshaded=FakeIris.manager.pipeline;
            ScopeRenderCompatibility.RenderState vanilla=ScopeRenderCompatibility.beginSecondaryRender();
            try {check(FakeIris.manager.pipeline==unshaded && !shaderMode.getBoolean(api),"No-shader camera keeps its existing pipeline and DH mode");}
            finally {ScopeRenderCompatibility.endSecondaryRender(vanilla);}
            check(!deferred.getBoolean(proxy) && helperModel.get(null)==primaryModel,"No-shader DH state restores unchanged");
        } finally {for(java.util.Map.Entry<Field,Object> e:saved.entrySet())e.getKey().set(null,e.getValue());}
    }

    public static final class FakePipeline {
        final boolean shaders;
        public FakePipeline() { this(false); }
        FakePipeline(boolean shaders) { this.shaders=shaders; }
        public String getCloudSetting(){return "OFF";}
    }
    public static final class FakeManager {
        public Object pipeline=new FakePipeline(true);
        public java.util.Map<Object,Object> pipelines=new java.util.HashMap<Object,Object>();
        public String dimension="test";
        public FakeManager(){pipelines.put("test",pipeline);}
    }
    public static final class FakeIris {
        static FakeManager manager;
        public static FakeIris getInstance(){return new FakeIris();}
        public boolean isShaderPackInUse(){return ((FakePipeline)manager.pipeline).shaders;}
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
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Native cannon primary draw has no GL errors");
            // Match Minecraft's color/depth FBO; the test pbuffer has no GL_BACK.
            int source=fbo(),depthBuffer=GL30.glGenRenderbuffers();
            GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depthBuffer);
            GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
            GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depthBuffer);
            GL11.glClearColor(0,0,0,0);GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
            ThermalCamera sensor=ThermalCamera.INSTANCE;
            check(sensor.prepareDepth(source,SIZE,SIZE),"Actual cannon thermal depth preparation");
            sensor.captureColor(source,SIZE,SIZE);sensor.projectSun(0,0,-1,0);sensor.renderHeat(() -> {});
            sensor.renderParticles(() -> {
                try {render.invoke(effect,net.minecraft.client.renderer.Tessellator.instance,0F,1F,1F,0F,0F,0F);}
                catch(ReflectiveOperationException failure){throw new AssertionError(failure);}
            });
            display(sensor,true);
            check((pixel(64,64).get(0)&255)==255,"Actual MCHR cannon explosion is white-hot through shared thermal sensor");
            check((pixel(4,4).get(0)&255)<100,"Actual MCHR thermal explosion keeps transparent corners");
            check((pixel(110,64).get(0)&255)>8,"Actual MCHR explosion blooms beyond its visible sprite");
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);GL11.glDepthMask(true);GL11.glClearDepth(0.1D);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
            check(sensor.prepareDepth(source,SIZE,SIZE),"Covered explosion depth preparation");
            sensor.captureColor(source,SIZE,SIZE);sensor.renderHeat(() -> {});
            sensor.renderParticles(() -> {
                try {render.invoke(effect,net.minecraft.client.renderer.Tessellator.instance,0F,1F,1F,0F,0F,0F);}
                catch(ReflectiveOperationException failure){throw new AssertionError(failure);}
            });
            display(sensor,true);
            check((pixel(64,64).get(0)&255)<5 && (pixel(110,64).get(0)&255)<5,"Covered explosion emits no thermal bloom through geometry");
            GL30.glDeleteFramebuffers(source);GL30.glDeleteRenderbuffers(depthBuffer);
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Native cannon renderer has no GL errors");
        } finally {mode.setInt(null,oldMode);GL11.glDeleteTextures(texture);}
    }

    private static void explosionSmoke(ClassLoader loader) throws Exception {
        sun.misc.Unsafe allocator=(sun.misc.Unsafe)field(sun.misc.Unsafe.class,"theUnsafe").get(null);
        Class<?> type=loader.loadClass("mcheli.particles.MCH_EntityParticleSmoke");
        Object smoke=allocator.allocateInstance(type);field(type,"thermalHot").setBoolean(smoke,true);
        Class<?> fx=net.minecraft.client.particle.EntityFX.class;
        field(fx,"particleAlpha").setFloat(smoke,1);field(fx,"particleMaxAge").setInt(smoke,100);
        field(fx,"particleScale").setFloat(smoke,3);
        for(String name:new String[]{"particleRed","particleGreen","particleBlue"}) field(fx,name).setFloat(smoke,0.12F);
        int texture=GL11.glGenTextures();GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
        ByteBuffer atlas=BufferUtils.createByteBuffer(64*8*4);
        for(int y=0;y<8;y++)for(int x=0;x<64;x++) {
            int alpha=(x%8-3.5)*(x%8-3.5)+(y-3.5)*(y-3.5)<10 ? 255 : 0;
            atlas.put((byte)255).put((byte)255).put((byte)255).put((byte)alpha);
        }
        atlas.flip();GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,64,8,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,atlas);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
        net.minecraft.client.Minecraft mc=(net.minecraft.client.Minecraft)allocator.allocateInstance(net.minecraft.client.Minecraft.class);
        mc.renderEngine=new ParticleTextures(texture);
        Object handler=cpw.mods.fml.client.FMLClientHandler.instance();Field client=field(handler.getClass(),"client");Object previous=client.get(handler);
        Field singleton=field(net.minecraft.client.Minecraft.class,"theMinecraft");Object oldMinecraft=singleton.get(null);
        Method render=type.getMethod("renderParticle",net.minecraft.client.renderer.Tessellator.class,float.class,float.class,float.class,float.class,float.class,float.class);
        int source=fbo(),depth=GL30.glGenRenderbuffers();GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER,depth);
        GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER,GL14.GL_DEPTH_COMPONENT24,SIZE,SIZE);
        GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER,GL30.GL_DEPTH_ATTACHMENT,GL30.GL_RENDERBUFFER,depth);
        try {
            client.set(handler,mc);singleton.set(null,mc);int fresh=0;
            for(int age:new int[]{0,90}) {
                field(fx,"particleAge").setInt(smoke,age);
                GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,source);GL11.glViewport(0,0,SIZE,SIZE);
                GL11.glDepthMask(true);GL11.glColorMask(true,true,true,true);GL11.glClearDepth(1);GL11.glClearColor(0,0,0,0);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
                ThermalCamera sensor=ThermalCamera.INSTANCE;
                check(sensor.prepareDepth(source,SIZE,SIZE),"Native hot explosion smoke depth");
                sensor.captureColor(source,SIZE,SIZE);sensor.projectSun(0,0,-1,0);sensor.renderHeat(() -> {});
                sensor.renderParticles(() -> {
                    try {render.invoke(smoke,net.minecraft.client.renderer.Tessellator.instance,0F,1F,1F,0F,0F,0F);}
                    catch(ReflectiveOperationException failure){throw new AssertionError(failure);}
                });
                display(sensor,true);int level=pixel(64,64).get(0)&255;
                if(age==0) {fresh=level;check(level>180,"Actual dark explosion smoke is hot despite its visible color");}
                else check(level>70 && level<fresh-30,"Actual explosion smoke cools over its existing lifetime");
                check((pixel(4,4).get(0)&255)<5,"Hot smoke keeps transparent corners and adds no explosion glow");
            }
            check(GL11.glGetError()==GL11.GL_NO_ERROR,"Native hot smoke has no GL errors");
        } finally {
            client.set(handler,previous);singleton.set(null,oldMinecraft);GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER,0);
            GL30.glDeleteFramebuffers(source);GL30.glDeleteRenderbuffers(depth);GL11.glDeleteTextures(texture);
        }
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
