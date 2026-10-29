package com.flansmod.client;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.guns.ThermalProfile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.culling.Frustrum;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;

/** One render-thread sensor shared by FMUR optics, binoculars and MCHR cameras. */
@SideOnly(Side.CLIENT)
final class ThermalCamera {
    static final ThermalCamera INSTANCE = new ThermalCamera();
    static final String VERTEX_SHADER = "#version 120\n"
            + "varying vec2 textureCoordinate;\n"
            + "void main(){ gl_Position=ftransform(); textureCoordinate=gl_MultiTexCoord0.xy; }\n";
    private static final String FRAGMENT_SHADER = "#version 120\n"
            + "uniform sampler2D sceneTexture, heatMask, sceneDepth, particles;\n"
            + "uniform float particlesValid;\n"
            + "uniform vec2 resolution; uniform vec3 sun;\n"
            + "uniform float flirEnabled, binocularDisplay, modelDisplay, vehicleDisplay, thermalDisplay;\n"
            + "uniform float sourceAspect, modelMagnification;\n"
            + "uniform float grain, contrast, sensitivity, bloomStrength, sensorGamma, sampleSeed, palette;\n"
            + "varying vec2 textureCoordinate;\n"
            + "void main(){\n"
            + " vec2 uv=textureCoordinate; vec2 sampleUv=uv;\n"
            + " sampleUv.x=0.5+(uv.x-0.5)/(max(sourceAspect,1.0)*max(modelMagnification,1.0));\n"
            + " sampleUv.y=0.5+(uv.y-0.5)/max(modelMagnification,1.0);\n"
            + " sampleUv=mix(uv,sampleUv,modelDisplay);\n"
            + " vec3 scene=texture2D(sceneTexture,sampleUv).rgb;\n"
            + " float hot=step(0.01,texture2D(heatMask,sampleUv).a);\n"
            + " vec2 cover=mix(vec2(1.0),texture2D(particles,sampleUv).rg,particlesValid);\n"
            + " float gray=dot(scene,vec3(0.2126,0.7152,0.0722));\n"
            + " vec2 delta=(sampleUv-sun.xy)*vec2(max(sourceAspect,1.0),1.0);\n"
            + " float sky=step(0.999999,texture2D(sceneDepth,clamp(sun.xy,0.0,1.0)).r);\n"
            + " float bloom=exp(-dot(delta,delta)*90.0)*sun.z*sky*cover.g;\n"
            + " float background=clamp(pow(gray,sensorGamma)*0.68+bloom*bloomStrength,0.0,0.96);\n"
            + " background=max(background,max(0.0,cover.r-cover.g));\n"
            + " float screenedHot=mix(cover.r,background,step(cover.g,0.02));\n"
            + " float level=mix(background,screenedHot,hot);\n"
            // Only visible emissive particles write blue. Smoke heat retains occlusion in RG.
            + " vec2 px=1.0/max(resolution,vec2(1.0)); float burst=texture2D(particles,sampleUv).b*0.16;\n"
            + " for(int i=0;i<4;i++){vec2 axis=vec2(0.0);"
            + " if(i==0)axis=vec2(1,0);if(i==1)axis=vec2(-1,0);if(i==2)axis=vec2(0,1);if(i==3)axis=vec2(0,-1);"
            + " burst+=texture2D(particles,sampleUv+axis*px*3.0).b*0.12;"
            + " burst+=texture2D(particles,sampleUv+axis*px*7.0).b*0.07;}\n"
            + " level+=burst*particlesValid*bloomStrength;\n"
            + " float noise=fract(sin(dot(floor(sampleUv*resolution),vec2(12.9898,78.233))+sampleSeed)*43758.5453)-0.5;\n"
            + " level=clamp((level*sensitivity-0.5)*contrast+0.5+noise*grain,0.0,1.0);\n"
            + " vec3 thermal=vec3(level);\n"
            + " if(palette>0.5 && palette<1.5) thermal=vec3(1.0-level);\n"
            + " if(palette>1.5 && palette<2.5) thermal=clamp(vec3(level*3.0,level*3.0-1.0,level*3.0-2.0),0.0,1.0);\n"
            + " if(palette>2.5) thermal=vec3(level*0.15,level,level*0.25);\n"
            + " vec3 sensor=mix(scene,thermal,flirEnabled*thermalDisplay);\n"
            + " vec2 centered=abs(uv-0.5); vec2 lens=(uv-0.5)*resolution;\n"
            + " float window=step(length(lens),resolution.y*0.405)*step(centered.y,0.16);\n"
            + " window=mix(window,step(centered.x,0.419)*step(centered.y,0.355),binocularDisplay);\n"
            + " window=mix(window,1.0,max(binocularDisplay,max(modelDisplay,vehicleDisplay)));\n"
            + " gl_FragColor=vec4(mix(scene,sensor,window),1.0);\n"
            + "}\n";
    private static final String PARTICLE_VERTEX = "#version 120\n"
            + "varying vec2 uv; varying vec4 color; varying float emissive,temperature,glow;\n"
            // Block-light 240 is the native emissive value used by explosion
            // sprites (including vanilla's packed brightness 240). Sky light alone
            // must not turn outdoor smoke into a heat source.
            + "void main(){gl_Position=ftransform();uv=gl_MultiTexCoord0.xy;color=gl_Color;"
            + "emissive=step(239.0,gl_MultiTexCoord1.x);float smoke=step(240.5,gl_MultiTexCoord1.x);"
            + "temperature=mix(1.0,clamp((gl_MultiTexCoord1.x-241.0)/14.0,0.0,1.0),smoke);"
            + "glow=emissive*(1.0-smoke);}\n";
    private static final String PARTICLE_FRAGMENT = "#version 120\n"
            + "uniform sampler2D particleTexture; varying vec2 uv; varying vec4 color; varying float emissive,temperature,glow;\n"
            + "void main(){vec4 p=texture2D(particleTexture,uv)*color;"
            // R blends the particle over white-hot; G multiplies exact transmittance.
            // Both straight-alpha and premultiplied particle blending preserve G.
            + "float heat=mix(dot(p.rgb,vec3(0.2126,0.7152,0.0722))*0.68,temperature*p.a,emissive);"
            + "gl_FragColor=vec4(heat,0.0,glow*p.a,p.a);}\n";

    private final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    private final FloatBuffer modelview = BufferUtils.createFloatBuffer(16);
    private int framebuffer, heatTexture, sceneTexture, particleTexture;
    private int width, height;
    private boolean depthPrepared, heatValid, particlesValid, warned;
    private float sunX, sunY, sunStrength;
    private ThermalProfile profile = ThermalProfile.DEFAULT;
    private int sampleSequence;
    private static int program, particleProgram, particleTextureUniform;
    private static final int[] uniforms = new int[21];
    private static boolean shaderFailed;

    private ThermalCamera() { }
    int sceneTexture() { return sceneTexture; }
    int width() { return width; }
    int height() { return height; }
    boolean heatValid() { return heatValid; }

    void beginSample(ThermalProfile nextProfile) {
        profile = nextProfile;
        sampleSequence = (sampleSequence + 1) & 4095;
    }

    boolean captureColor(int source, int w, int h) {
        int draw = GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING);
        int read = ThermalFramebuffers.canBlit() ? GL11.glGetInteger(GL30.GL_READ_FRAMEBUFFER_BINDING) : draw;
        int active = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        int texture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        int readBuffer = GL11.glGetInteger(GL11.GL_READ_BUFFER);
        try {
            ensureSize(w,h);
            ThermalFramebuffers.bind(ThermalFramebuffers.canBlit() ? GL30.GL_READ_FRAMEBUFFER : GL30.GL_FRAMEBUFFER,source);
            GL11.glReadBuffer(source == 0 ? GL11.GL_BACK : GL30.GL_COLOR_ATTACHMENT0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D,sceneTexture);
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D,0,0,0,0,0,w,h);
            return true;
        } finally {
            restoreFramebuffers(draw,read);
            GL11.glReadBuffer(readBuffer);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
            GL13.glActiveTexture(active);
        }
    }

    boolean prepareDepth(int source, int w, int h) {
        depthPrepared = false; heatValid = false; particlesValid = false;
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX,projection);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX,modelview);
        int draw = GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING);
        int read = ThermalFramebuffers.canBlit() ? GL11.glGetInteger(GL30.GL_READ_FRAMEBUFFER_BINDING) : draw;
        int active = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        int texture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            ensureSize(w,h);
            if (!ThermalFramebuffers.copyDepth(source,framebuffer,w,h)) {
                if (!warned) {
                    warned = true;
                    com.flansmod.common.FlansMod.log("[Thermal] " + ThermalFramebuffers.lastFailure());
                }
                return false;
            }
            ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,framebuffer);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glColorMask(true,true,true,true);
            GL11.glClearColor(0,0,0,0);
            // Only clear coverage. The copied scene depth is the occlusion truth.
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            depthPrepared = true;
            return true;
        } finally {
            restoreFramebuffers(draw,read);
            GL11.glPopAttrib();
            GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
            GL13.glActiveTexture(active);
        }
    }

    void renderHeat(final float partialTicks) {
        renderHeat(new Runnable() {
            @Override public void run() {
                ThermalRenderApi.renderHeat(partialTicks,new Runnable() {
                    @Override public void run() { renderLoadedTargets(partialTicks); }
                });
            }
        });
        final Minecraft mc = Minecraft.getMinecraft();
        final Entity viewer = mc.renderViewEntity;
        renderParticles(new Runnable() {
            @Override public void run() {
                double x = EntityFX.interpPosX, y = EntityFX.interpPosY, z = EntityFX.interpPosZ;
                try {
                    EntityFX.interpPosX = viewer.lastTickPosX+(viewer.posX-viewer.lastTickPosX)*partialTicks;
                    EntityFX.interpPosY = viewer.lastTickPosY+(viewer.posY-viewer.lastTickPosY)*partialTicks;
                    EntityFX.interpPosZ = viewer.lastTickPosZ+(viewer.posZ-viewer.lastTickPosZ)*partialTicks;
                    mc.entityRenderer.enableLightmap(partialTicks);
                    mc.effectRenderer.renderLitParticles(viewer,partialTicks);
                    mc.effectRenderer.renderParticles(viewer,partialTicks);
                } finally {
                    mc.entityRenderer.disableLightmap(partialTicks);
                    EntityFX.interpPosX=x; EntityFX.interpPosY=y; EntityFX.interpPosZ=z;
                }
            }
        });
    }

    void renderHeat(Runnable geometry) {
        renderGeometry(geometry,false);
    }

    void renderParticles(final Runnable particles) {
        if (!ensureShader()) return;
        renderGeometry(new Runnable() {
            @Override public void run() { ThermalRenderApi.renderParticles(particles); }
        },true);
    }

    private void renderGeometry(Runnable geometry, boolean particlePass) {
        if (particlePass ? !heatValid : !depthPrepared) return;
        if (particlePass) particlesValid = false;
        int draw = GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING);
        int read = ThermalFramebuffers.canBlit() ? GL11.glGetInteger(GL30.GL_READ_FRAMEBUFFER_BINDING) : draw;
        int oldProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int mode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int active = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        float lightX = OpenGlHelper.lastBrightnessX, lightY = OpenGlHelper.lastBrightnessY;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPushMatrix(); GL11.glLoadMatrix(projection);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPushMatrix(); GL11.glLoadMatrix(modelview);
        try {
            ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,framebuffer);
            ThermalFramebuffers.attach(GL30.GL_COLOR_ATTACHMENT0,particlePass ? particleTexture : heatTexture);
            GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);
            GL11.glViewport(0,0,width,height);
            GL20.glUseProgram(particlePass ? particleProgram : 0);
            if (particlePass) GL20.glUniform1i(particleTextureUniform,0);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glDisable(GL11.GL_SCISSOR_TEST); GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthFunc(GL11.GL_LEQUAL); GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_BLEND); GL11.glColorMask(false,false,false,true);
            GL11.glColor4f(1,1,1,1);
            if (particlePass) {
                // White is an unobscured hot target. Native blending applies each
                // particle's actual texture/vertex alpha without turning its quad into depth.
                GL11.glColorMask(true,true,true,true);
                GL11.glClearColor(1,1,0,0);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
                GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glEnable(GL11.GL_ALPHA_TEST); GL11.glAlphaFunc(GL11.GL_GREATER,1F/255F);
                GL11.glDisable(GL11.GL_LIGHTING); GL11.glDisable(GL11.GL_FOG);
                GL11.glEnable(GL11.GL_BLEND); GL11.glBlendFunc(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);
            } else RenderHelper.enableStandardItemLighting();
            geometry.run();
            if (particlePass) particlesValid = true;
            else heatValid = true;
        } finally {
            if (!particlePass) depthPrepared = false;
            ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,framebuffer);
            ThermalFramebuffers.attach(GL30.GL_COLOR_ATTACHMENT0,heatTexture);
            GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glPopMatrix(); GL11.glMatrixMode(mode);
            GL20.glUseProgram(oldProgram);
            // Restore the FBO before its saved GL_BACK/COLOR_ATTACHMENT draw state.
            restoreFramebuffers(draw,read);
            GL11.glPopAttrib();
            GL13.glActiveTexture(active);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,lightX,lightY);
        }
    }

    private void renderLoadedTargets(float partialTicks) {
        Minecraft mc = Minecraft.getMinecraft();
        RenderManager manager = RenderManager.instance;
        Frustrum frustum = new Frustrum();
        frustum.setPosition(manager.viewerPosX,manager.viewerPosY,manager.viewerPosZ);
        for (Object object : mc.theWorld.loadedEntityList) {
            if (!(object instanceof EntityLivingBase) && !(object instanceof EntityDriveable)) continue;
            Entity entity = (Entity)object;
            if (entity == mc.renderViewEntity && mc.gameSettings.thirdPersonView == 0) continue;
            if (!frustum.isBoundingBoxInFrustum(entity.boundingBox)) continue;
            Render renderer = manager.getEntityRenderObject(entity);
            if (renderer == null) continue;
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            try {
                GL11.glColorMask(false,false,false,true);
                GL11.glDepthFunc(GL11.GL_LEQUAL); GL11.glDepthMask(false);
                GL11.glColor4f(1,1,1,1);
                double x = entity.lastTickPosX+(entity.posX-entity.lastTickPosX)*partialTicks;
                double y = entity.lastTickPosY+(entity.posY-entity.lastTickPosY)*partialTicks;
                double z = entity.lastTickPosZ+(entity.posZ-entity.lastTickPosZ)*partialTicks;
                float yaw = entity.prevRotationYaw+(entity.rotationYaw-entity.prevRotationYaw)*partialTicks;
                // Direct geometry avoids renderEntitySimple's shadows/fire/debug boxes becoming heat.
                renderer.doRender(entity,x-RenderManager.renderPosX,y-RenderManager.renderPosY,
                        z-RenderManager.renderPosZ,yaw,partialTicks);
            } finally { GL11.glPopAttrib(); }
        }
    }

    void updateSun(Minecraft mc, float partialTicks) {
        sunStrength = 0;
        if (mc.theWorld == null || mc.theWorld.provider.hasNoSky) return;
        double angle = mc.theWorld.getCelestialAngle(partialTicks)*Math.PI*2;
        float x = (float)-Math.sin(angle), y = (float)Math.cos(angle);
        if (y <= 0) return;
        projectSun(x,y,0,1-mc.theWorld.getRainStrength(partialTicks));
    }

    void projectSun(float x, float y, float z, float strength) {
        float ex=modelview.get(0)*x+modelview.get(4)*y+modelview.get(8)*z;
        float ey=modelview.get(1)*x+modelview.get(5)*y+modelview.get(9)*z;
        float ez=modelview.get(2)*x+modelview.get(6)*y+modelview.get(10)*z;
        float cw=projection.get(3)*ex+projection.get(7)*ey+projection.get(11)*ez;
        sunStrength=0;
        if (cw <= 0.00001F) return;
        sunX=(projection.get(0)*ex+projection.get(4)*ey+projection.get(8)*ez)/cw*0.5F+0.5F;
        sunY=(projection.get(1)*ex+projection.get(5)*ey+projection.get(9)*ez)/cw*0.5F+0.5F;
        if (sunX > -0.5F && sunX < 1.5F && sunY > -0.5F && sunY < 1.5F) sunStrength=strength;
    }

    private void ensureSize(int w, int h) {
        if (w == width && h == height) return;
        if (framebuffer != 0) ThermalFramebuffers.delete(framebuffer);
        if (heatTexture != 0) GL11.glDeleteTextures(heatTexture);
        if (sceneTexture != 0) GL11.glDeleteTextures(sceneTexture);
        if (particleTexture != 0) GL11.glDeleteTextures(particleTexture);
        width=w; height=h;
        sceneTexture=texture(w,h,GL11.GL_LINEAR);
        heatTexture=texture(w,h,GL11.GL_NEAREST);
        particleTexture=texture(w,h,GL11.GL_LINEAR);
        framebuffer=ThermalFramebuffers.create();
        ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,framebuffer);
        ThermalFramebuffers.attach(GL30.GL_COLOR_ATTACHMENT0,heatTexture);
        GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);
        GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);
        heatValid=false; particlesValid=false;
    }

    void destroy() {
        if (framebuffer != 0) ThermalFramebuffers.delete(framebuffer);
        if (heatTexture != 0) GL11.glDeleteTextures(heatTexture);
        if (sceneTexture != 0) GL11.glDeleteTextures(sceneTexture);
        if (particleTexture != 0) GL11.glDeleteTextures(particleTexture);
        framebuffer = 0; heatTexture = 0; sceneTexture = 0; particleTexture = 0;
        width = 0; height = 0; heatValid = false; depthPrepared = false; particlesValid = false;
        ThermalFramebuffers.destroyDepth();
    }

    private static int texture(int w, int h, int filter) {
        int id=GL11.glGenTextures(); GL11.glBindTexture(GL11.GL_TEXTURE_2D,id);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,filter);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,filter);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_S,GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_T,GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,w,h,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,(ByteBuffer)null);
        return id;
    }

    private static void restoreFramebuffers(int draw, int read) {
        if (ThermalFramebuffers.canBlit()) {
            ThermalFramebuffers.bind(GL30.GL_READ_FRAMEBUFFER,read);
            ThermalFramebuffers.bind(GL30.GL_DRAW_FRAMEBUFFER,draw);
        } else ThermalFramebuffers.bind(GL30.GL_FRAMEBUFFER,draw);
    }

    static boolean ensureShader() {
        if (program != 0 && particleProgram != 0) return true;
        if (shaderFailed) return false;
        int vertex=compile(GL20.GL_VERTEX_SHADER,VERTEX_SHADER), fragment=compile(GL20.GL_FRAGMENT_SHADER,FRAGMENT_SHADER);
        if (vertex != 0 && fragment != 0) {
            program=GL20.glCreateProgram(); GL20.glAttachShader(program,vertex); GL20.glAttachShader(program,fragment);
            GL20.glLinkProgram(program);
            if (GL20.glGetProgrami(program,GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
                com.flansmod.common.FlansMod.log("[Thermal] link: " + GL20.glGetProgramInfoLog(program,4096));
                GL20.glDeleteProgram(program); program=0;
            }
        }
        if (vertex != 0) GL20.glDeleteShader(vertex);
        if (fragment != 0) GL20.glDeleteShader(fragment);
        if (program != 0) {
            String[] names = new String[] {"sceneTexture", "heatMask", "sceneDepth", "resolution", "sun", "flirEnabled", "thermalDisplay", "modelDisplay", "binocularDisplay", "vehicleDisplay", "sourceAspect", "modelMagnification", "particles", "particlesValid", "grain", "contrast", "sensitivity", "bloomStrength", "sensorGamma", "sampleSeed", "palette"};
            for (int i=0; i<names.length; i++) uniforms[i]=GL20.glGetUniformLocation(program,names[i]);
        }
        int pv=compile(GL20.GL_VERTEX_SHADER,PARTICLE_VERTEX), pf=compile(GL20.GL_FRAGMENT_SHADER,PARTICLE_FRAGMENT);
        if (pv != 0 && pf != 0) {
            particleProgram=GL20.glCreateProgram();
            GL20.glAttachShader(particleProgram,pv); GL20.glAttachShader(particleProgram,pf);
            GL20.glLinkProgram(particleProgram);
            if (GL20.glGetProgrami(particleProgram,GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
                com.flansmod.common.FlansMod.log("[Thermal] particle link: " + GL20.glGetProgramInfoLog(particleProgram,4096));
                GL20.glDeleteProgram(particleProgram); particleProgram=0;
            }
        }
        if (pv != 0) GL20.glDeleteShader(pv);
        if (pf != 0) GL20.glDeleteShader(pf);
        if (particleProgram != 0) particleTextureUniform=GL20.glGetUniformLocation(particleProgram,"particleTexture");
        shaderFailed=program == 0 || particleProgram == 0;
        return !shaderFailed;
    }

    private static int compile(int kind, String source) {
        int shader=GL20.glCreateShader(kind); GL20.glShaderSource(shader,source); GL20.glCompileShader(shader);
        if (GL20.glGetShaderi(shader,GL20.GL_COMPILE_STATUS) != GL11.GL_FALSE) return shader;
        com.flansmod.common.FlansMod.log("[Thermal] compile: " + GL20.glGetShaderInfoLog(shader,4096));
        GL20.glDeleteShader(shader); return 0;
    }

    void bindDisplay(int w, int h, boolean model, boolean binocular, boolean vehicle, boolean flir,
            boolean thermal, float aspect, float magnification) {
        GL20.glUseProgram(program);
        GL13.glActiveTexture(GL13.GL_TEXTURE0); GL11.glBindTexture(GL11.GL_TEXTURE_2D,sceneTexture);
        GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glBindTexture(GL11.GL_TEXTURE_2D,heatTexture);
        GL13.glActiveTexture(GL13.GL_TEXTURE2); GL11.glBindTexture(GL11.GL_TEXTURE_2D,ThermalFramebuffers.depthTexture());
        GL13.glActiveTexture(GL13.GL_TEXTURE3); GL11.glBindTexture(GL11.GL_TEXTURE_2D,particleTexture);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL20.glUniform1i(uniforms[0],0); GL20.glUniform1i(uniforms[1],1); GL20.glUniform1i(uniforms[2],2);
        GL20.glUniform2f(uniforms[3],w,h); GL20.glUniform3f(uniforms[4],sunX,sunY,sunStrength);
        GL20.glUniform1f(uniforms[5],flir ? 1 : 0); GL20.glUniform1f(uniforms[6],thermal ? 1 : 0);
        GL20.glUniform1f(uniforms[7],model ? 1 : 0); GL20.glUniform1f(uniforms[8],binocular ? 1 : 0);
        GL20.glUniform1f(uniforms[9],vehicle ? 1 : 0); GL20.glUniform1f(uniforms[10],aspect);
        GL20.glUniform1f(uniforms[11],magnification);
        GL20.glUniform1i(uniforms[12],3); GL20.glUniform1f(uniforms[13],particlesValid ? 1 : 0);
        GL20.glUniform1f(uniforms[14],profile.grain); GL20.glUniform1f(uniforms[15],profile.contrast);
        GL20.glUniform1f(uniforms[16],profile.sensitivity); GL20.glUniform1f(uniforms[17],profile.bloom);
        GL20.glUniform1f(uniforms[18],profile.gamma); GL20.glUniform1f(uniforms[19],sampleSequence);
        GL20.glUniform1f(uniforms[20],profile.palette);
    }
}
