package com.flansmod.client;

import java.lang.reflect.*;
import java.net.URLClassLoader;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import java.nio.file.Paths;
import java.util.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.GLU;

/** Real compatibility-profile checks of provider sky and the actual optional WGQOL binary. */
public final class CameraEnvironmentChecks {
    private static sun.misc.Unsafe unsafe;
    private static int checks, texture, framebuffer;
    private static int phaseBegins, phaseEnds, phaseDepth;
    private static boolean failTexture;
    public static Optional<Object> currentPack() { return Optional.of(CameraEnvironmentChecks.class); }
    public static int beginParticles() { phaseBegins++; return phaseDepth++; }
    public static void endParticles(int token) { require(token == phaseDepth - 1, "balanced private particle token"); phaseEnds++; phaseDepth--; }
    public static void translucency(Boolean ignored) { }

    public static void main(String[] args) throws Exception {
        unsafe = (sun.misc.Unsafe)field(sun.misc.Unsafe.class, "theUnsafe").get(null);
        Pbuffer context = new Pbuffer(128, 128, new PixelFormat().withDepthBits(24), null, null);
        context.makeCurrent();
        Field singleton = field(Minecraft.class, "theMinecraft"); Object previous = singleton.get(null);
        try {
            framebuffer = GL30.glGenFramebuffers(); GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, framebuffer);
            texture = GL11.glGenTextures(); GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);
            GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, 128, 128, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer)null);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL30.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT0, GL11.GL_TEXTURE_2D, texture, 0);
            int depth = GL30.glGenRenderbuffers(); GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER, depth);
            GL30.glRenderbufferStorage(GL30.GL_RENDERBUFFER, GL14.GL_DEPTH_COMPONENT24, 128, 128);
            GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER, GL30.GL_DEPTH_ATTACHMENT, GL30.GL_RENDERBUFFER, depth);
            require(GL30.glCheckFramebufferStatus(GL30.GL_FRAMEBUFFER) == GL30.GL_FRAMEBUFFER_COMPLETE, "offscreen colour/depth target");
            OpenGlHelper.defaultTexUnit = GL13.GL_TEXTURE0; OpenGlHelper.lightmapTexUnit = GL13.GL_TEXTURE1;
            Minecraft mc = allocate(Minecraft.class); singleton.set(null, mc);
            TestWorld world = allocate(TestWorld.class); field(World.class, "provider").set(world, new Provider());
            mc.theWorld = world; mc.gameSettings = new net.minecraft.client.settings.GameSettings();
            mc.renderViewEntity = allocate(net.minecraft.entity.passive.EntityPig.class);
            mc.renderViewEntity.posX = mc.renderViewEntity.lastTickPosX = .5;
            mc.renderViewEntity.posY = mc.renderViewEntity.lastTickPosY = 64;
            mc.renderViewEntity.posZ = mc.renderViewEntity.lastTickPosZ = .5;
            mc.thePlayer = allocate(net.minecraft.client.entity.EntityClientPlayerMP.class);
            mc.thePlayer.posY = mc.thePlayer.prevPosY = 64;
            mc.renderEngine = new Textures();
            mc.renderGlobal = allocate(RenderGlobal.class);
            field(RenderGlobal.class, "mc").set(mc.renderGlobal, mc);
            field(RenderGlobal.class, "theWorld").set(mc.renderGlobal, world);
            field(RenderGlobal.class, "renderEngine").set(mc.renderGlobal, mc.renderEngine);
            sky(mc, world);
            thermalModes(mc, world);
            if (args.length != 1) throw new IllegalArgumentException("Supply WGQOL development classes or dev jar");
            weather(mc, world, args[0]);
            require(GL11.glGetError() == GL11.GL_NO_ERROR, "environment passes leave no GL errors");
            System.out.println("PASS " + checks + " scope environment OpenGL/companion checks");
        } finally { singleton.set(null, previous); context.destroy(); }
    }

    private static void thermalModes(Minecraft mc, TestWorld world) throws Exception {
        require(!ThermalScopeEffect.thermalCapture(true, false, false), "FLIR-off capable optic acquires a colour scene");
        require(ThermalScopeEffect.thermalCapture(true, false, true), "FLIR-on optic acquires lightweight heat");
        require(!ThermalScopeEffect.thermalCapture(false, false, true), "global FLIR toggle cannot change an ordinary colour optic");
        require(ThermalScopeEffect.thermalCapture(false, true, false), "vehicle sensor remains on its established thermal path");
        boolean before = ThermalScopeEffect.isFlirEnabled();
        String[] flags = {"sceneCaptured", "scopedSceneCaptured", "modelLensValid", "sensorDisplayValid"};
        boolean[] saved = new boolean[flags.length];
        ThermalSensorClock clock = (ThermalSensorClock)field(ThermalScopeEffect.class, "SENSOR_CLOCK").get(null);
        Object device = new Object(); require(clock.tryAcquire(device, 10, 1), "sensor deadline reserved before toggle");
        try {
            for (int i = 0; i < flags.length; i++) { Field f = field(ThermalScopeEffect.class, flags[i]); saved[i] = f.getBoolean(null); f.setBoolean(null, true); }
            ThermalScopeEffect.toggleFlir();
            for (String flag : flags) require(!field(ThermalScopeEffect.class, flag).getBoolean(null), "toggle rejects stale display state: " + flag);
            require(!clock.tryAcquire(device, 10, 2), "toggling cannot bypass the sensor deadline");
        } finally {
            if (ThermalScopeEffect.isFlirEnabled() != before) ThermalScopeEffect.toggleFlir();
            for (int i = 0; i < flags.length; i++) field(ThermalScopeEffect.class, flags[i]).setBoolean(null, saved[i]);
            ((Map<?, ?>)field(ThermalSensorClock.class, "samples").get(clock)).remove(device);
        }
        world.loadedEntityList = new ArrayList();
        mc.gameSettings.fboEnable = true; OpenGlHelper.initializeTextures();
        Constructor<ThermalCamera> constructor = ThermalCamera.class.getDeclaredConstructor(); constructor.setAccessible(true);
        ThermalCamera camera = constructor.newInstance(); require(ThermalCamera.ensureShader(), "thermal display shader compiles");
        Field renderer = field(ThermalRenderApi.class, "vehicleRenderer"); Object previousRenderer = renderer.get(null);
        Field vehicle = field(ThermalRenderApi.class, "vehicleCamera"); Object previousVehicle = vehicle.get(null);
        try {
            final int[] emitted = {0};
            ThermalRenderApi.registerVehicleRenderer(() -> false, p -> {
                GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glDisable(GL11.GL_TEXTURE_2D);
                GL13.glActiveTexture(GL13.GL_TEXTURE0); GL11.glDisable(GL11.GL_TEXTURE_2D);
                GL11.glDisable(GL11.GL_CULL_FACE); GL11.glColor4f(1, 1, 1, 1); quad(.5F, -3);
                emitted[0]++;
            });
            for (boolean covered : new boolean[]{false, true}) {
                view(); clear(covered ? .01 : 1);
                require(camera.prepareDepth(framebuffer, 128, 128), "lightweight thermal scene retains physical depth");
                camera.captureColor(framebuffer, 128, 128);
                // Null particle/lightmap renderers make any accidental cosmetic replay fail.
                camera.renderHeat(.5F, false);
                require(emitted[0] == (covered ? 2 : 1) && camera.heatValid(), "actual heat geometry executes in penetrating capture");
                require(!field(ThermalCamera.class, "particlesValid").getBoolean(camera), "penetrating FLIR creates no smoke/weather attenuation mask");
                GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, framebuffer);
                GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity(); GL11.glOrtho(-1, 1, -1, 1, -1, 1);
                GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity(); GL11.glDisable(GL11.GL_DEPTH_TEST);
                GL11.glDisable(GL11.GL_BLEND); GL11.glColorMask(true, true, true, true);
                camera.bindDisplay(128, 128, false, true, false, true, true, 1, 1); quad(1, 0); GL20.glUseProgram(0);
                int level = pixel(64, 64, 0);
                require(covered ? level < 200 : level > 240, "FLIR highlights exposed entities but opaque depth still hides covered entities: covered=" + covered + " level=" + level);
            }
        } finally {
            camera.destroy(); renderer.set(null, previousRenderer);
            vehicle.set(null, previousVehicle);
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, framebuffer); GL13.glActiveTexture(GL13.GL_TEXTURE0);
        }
    }

    private static void sky(Minecraft mc, TestWorld world) throws Exception {
        CameraSky sky = new CameraSky(); CameraView primary = view(), magnified = new CameraView();
        int[] calls = {0};
        world.provider.setSkyRenderer(new IRenderHandler() {
            @Override public void render(float partial, WorldClient w, Minecraft client) {
                calls[0]++;
                require(w == world && client == mc, "native Forge dispatch reaches the world's custom sky provider");
                FloatBuffer matrix = matrix(GL11.GL_MODELVIEW_MATRIX);
                require(matrix.get(12) == 0 && matrix.get(13) == 0 && matrix.get(14) == 0, "sky removes camera translation");
                GL11.glDisable(GL11.GL_TEXTURE_2D); GL11.glDisable(GL11.GL_CULL_FACE); GL11.glDisable(GL11.GL_BLEND);
                GL11.glColor3f(0, 1, 0); quad(10, -100);
            }
        });
        int base = 0;
        for (int zoom : new int[]{1, 2}) {
            magnified.set(primary, 128, 128, zoom, 1, 1); clear(1);
            sky.render(mc, magnified);
            int width = 0; for (int x = 0; x < 128; x++) if (pixel(x, 64, 1) > 200) width++;
            require(width > 0, "provider sky beyond the terrain far plane remains visible");
            if (zoom == 1) base = width; else require(width > base * 1.8 && width < base * 2.2, "provider sky uses scope magnification");
            require(depth() == 1, "sky leaves scene depth empty");
        }
        require(calls[0] == 2, "one provider sky submission per scope sample");
        FloatBuffer projection = matrix(GL11.GL_PROJECTION_MATRIX), model = matrix(GL11.GL_MODELVIEW_MATRIX);
        GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glMatrixMode(GL11.GL_TEXTURE); GL11.glLoadIdentity(); GL11.glTranslatef(2, 3, 0);
        FloatBuffer textureMatrix = matrix(GL11.GL_TEXTURE_MATRIX);
        try {
            sky.render(primary, () -> {
                GL11.glViewport(1, 2, 3, 4); GL11.glDepthMask(false); GL11.glDepthRange(.2, .3);
                GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity();
                GL13.glActiveTexture(GL13.GL_TEXTURE1); GL11.glMatrixMode(GL11.GL_TEXTURE); GL11.glLoadIdentity();
                ThermalFramebuffers.bind(GL30.GL_READ_FRAMEBUFFER, 0);
                throw new IllegalStateException("injected provider failure");
            });
            throw new AssertionError("provider failure was swallowed");
        } catch (IllegalStateException expected) { require(expected.getMessage().startsWith("injected"), "provider failure propagates"); }
        require(GL11.glGetInteger(GL30.GL_READ_FRAMEBUFFER_BINDING) == framebuffer && GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING) == framebuffer, "sky restores read/draw targets on failure");
        require(GL11.glGetBoolean(GL11.GL_DEPTH_WRITEMASK), "sky restores depth mask");
        require(GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE) == GL13.GL_TEXTURE1 && GL11.glGetInteger(GL11.GL_MATRIX_MODE) == GL11.GL_TEXTURE, "sky restores active texture and matrix mode");
        equal(projection, matrix(GL11.GL_PROJECTION_MATRIX)); equal(model, matrix(GL11.GL_MODELVIEW_MATRIX)); equal(textureMatrix, matrix(GL11.GL_TEXTURE_MATRIX));
        GL11.glLoadIdentity(); GL13.glActiveTexture(GL13.GL_TEXTURE0); GL11.glMatrixMode(GL11.GL_MODELVIEW);

        // Actual vanilla RenderGlobal moon selection and star-list branch, without a game launch.
        world.provider.setSkyRenderer(null);
        int lists = GL11.glGenLists(3);
        for (int i = 0; i < 3; i++) { GL11.glNewList(lists + i, GL11.GL_COMPILE); GL11.glEndList(); }
        GL11.glNewList(lists, GL11.GL_COMPILE);
        GL11.glColor3f(0, 1, 0); GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3f(38, -100, -2); GL11.glVertex3f(42, -100, -2);
        GL11.glVertex3f(42, -100, 2); GL11.glVertex3f(38, -100, 2);
        GL11.glEnd(); GL11.glEndList();
        field(RenderGlobal.class, "starGLCallList").setInt(mc.renderGlobal, lists);
        field(RenderGlobal.class, "glSkyList").setInt(mc.renderGlobal, lists + 1);
        field(RenderGlobal.class, "glSkyList2").setInt(mc.renderGlobal, lists + 2);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity(); GL11.glRotatef(90, 1, 0, 0);
        primary.capture(.5, 64, .5, .5F);
        for (int moon = 0; moon < 8; moon++) {
            world.moon = moon; ((Textures)mc.renderEngine).moon = false; clear(1);
            sky.render(mc, primary);
            require(((Textures)mc.renderEngine).moon && world.phaseReads > moon, "native sky selects the moon atlas and current phase");
            require(Math.abs(pixel(64, 64, 0) - (30 + moon * 25)) <= 1, "native moon displays the correct phase atlas tile");
            boolean star = false;
            for (int y = 15; y < 45; y++) if (pixel(64, y, 1) > 200 && pixel(64, y, 0) == 0) star = true;
            require(star, "native star list is visible through the short-far-plane scope");
        }
        require(world.starReads == 8, "native sky evaluates world star brightness on every sample");
        GL11.glDeleteLists(lists, 3);
        require(world.queries == 0, "sky never requests chunks");
        int[] failures = {0};
        world.provider.setSkyRenderer(new IRenderHandler() {
            public void render(float p, WorldClient w, Minecraft c) { failures[0]++; throw new IllegalStateException("injected unsupported sky"); }
        });
        require(!sky.render(mc, primary) && !sky.render(mc, primary) && failures[0] == 1, "bad custom sky falls back without repeated calls or camera failure");
        world.provider.setSkyRenderer(new IRenderHandler() { public void render(float p, WorldClient w, Minecraft c) { } });
        sky.reset();
        require(sky.render(mc, primary), "reload/world change retries the restored sky provider");
    }

    @SuppressWarnings("unchecked")
    private static void weather(Minecraft mc, TestWorld world, String runtime) throws Exception {
        try (URLClassLoader loader = new URLClassLoader(new java.net.URL[]{Paths.get(runtime).toUri().toURL()}, CameraEnvironmentChecks.class.getClassLoader())) {
            Class<?> effects = loader.loadClass("com.wdg.wgqol.client.WeatherEffects");
            Class<?> config = loader.loadClass("com.wdg.wgqol.client.WeatherConfig");
            Object population = effects.newInstance(); field(effects, "instance").set(null, population);
            field(effects, "owner").set(population, world); field(effects, "installed").setBoolean(population, true);
            field(effects, "lastRender").setLong(population, -1000);
            world.provider.setWeatherRenderer((IRenderHandler)population);
            for (String key : new String[]{"enabled", "rain", "snow", "fog", "sandstorms", "shaderParticles"}) field(config, key).setBoolean(null, true);
            field(config, "radius").setInt(null, 24);
            field(loader.loadClass("com.wdg.wgqol.client.WeatherAltitude"), "ceiling").setDouble(null, 1000);
            Class<?> shaders = loader.loadClass("com.wdg.wgqol.client.WeatherShaders");
            field(shaders, "resolved").setBoolean(null, true);
            field(shaders, "currentPack").set(null, CameraEnvironmentChecks.class.getMethod("currentPack"));
            field(shaders, "begin").set(null, CameraEnvironmentChecks.class.getMethod("beginParticles"));
            field(shaders, "end").set(null, CameraEnvironmentChecks.class.getMethod("endParticles", int.class));
            field(shaders, "translucency").set(null, CameraEnvironmentChecks.class.getMethod("translucency", Boolean.class));
            Method replay = effects.getMethod("renderCameraWeatherV1", float.class, boolean.class);
            field(CameraWeather.class, "checked").setBoolean(null, true); field(CameraWeather.class, "cameraWeather").set(null, replay);
            List<Object> drops = (List<Object>)field(effects, "drops").get(population);
            require(Boolean.TRUE.equals(replay.invoke(null, .5F, false)), "empty WGQOL population still owns scope weather");
            require(field(effects, "lastRender").getLong(population) == -1000, "scope cannot mark native weather as rendered");
            Class<?> drop = loader.loadClass("com.wdg.wgqol.client.WeatherEffects$Drop"); Object mist = allocate(drop);
            field(drop, "type").setInt(mist, 4); field(drop, "age").setInt(mist, 10); field(drop, "life").setInt(mist, 100);
            field(drop, "color").setInt(mist, 0xFFFFFF); field(drop, "light").setInt(mist, 15728880); field(drop, "size").setDouble(mist, .3);
            for (String key : new String[]{"x", "px", "z", "pz"}) field(drop, key).setDouble(mist, key.endsWith("z") ? -2.5 : .5);
            field(drop, "y").setDouble(mist, 64); field(drop, "py").setDouble(mist, 64); drops.add(mist);
            ActiveRenderInfo.rotationX = 1; ActiveRenderInfo.rotationXZ = 1;
            ActiveRenderInfo.rotationZ = ActiveRenderInfo.rotationXY = ActiveRenderInfo.rotationYZ = 0;
            CameraView view = view();
            for (boolean shadered : new boolean[]{false, true}) {
                clear(1); CameraWeather.renderColour(mc, view, shadered);
                require(pixel(64, 64, 1) > 0, "real WGQOL after-rain mist appears in colour scope");
                require(depth() == 1, "WGQOL mist does not write scene depth");
                clear(.01); CameraWeather.renderColour(mc, view, shadered);
                require(pixel(64, 64, 1) == 0, "near cover occludes scope mist");
            }
            require(phaseBegins == 2 && phaseBegins == phaseEnds && phaseDepth == 0, "shader scopes balance particle hooks; lightweight scopes never enter them");
            require(drops.size() == 1 && field(drop, "age").getInt(mist) == 10 && field(effects, "ticks").getLong(population) == 0, "replay never ticks, ages or spawns weather");
            require(world.queries == 0, "weather replay never queries unloaded terrain");
            require(mc.entityRenderer == null, "replay respects caller lightmap without using EntityRenderer");
            field(config, "enabled").setBoolean(null, false);
            require(Boolean.FALSE.equals(replay.invoke(null, .5F, false)), "disabled WGQOL yields to scope fallback");
            field(config, "enabled").setBoolean(null, true);
            world.provider.setWeatherRenderer(new IRenderHandler() { public void render(float p, WorldClient w, Minecraft c) { } });
            require(Boolean.FALSE.equals(replay.invoke(null, .5F, false)), "foreign provider ownership is preserved");
            world.provider.setWeatherRenderer((IRenderHandler)population);
            require(Boolean.FALSE.equals(replay.invoke(null, Float.NaN, false)), "invalid partial tick rejected");
            WorldProvider ordinary = world.provider;
            WorldProvider hbm = hbmProvider(); field(World.class, "provider").set(world, hbm);
            field(effects, "hbmBridge").setBoolean(population, true);
            IRenderHandler immutable = hbm.getWeatherRenderer();
            hbm.setWeatherRenderer((IRenderHandler)population);
            require(hbm.getWeatherRenderer() == immutable, "HBM fixture ignores native weather setter like the real provider");
            require(Boolean.TRUE.equals(replay.invoke(null, .5F, false)), "HBM Earth bridge replays the same existing population");
            require(immutable.getClass().getField("calls").getInt(immutable) == 0, "HBM native precipitation is not also drawn");
            hbm.dimensionId = 1;
            require(Boolean.FALSE.equals(replay.invoke(null, .5F, false)), "HBM weather replay is restricted to the owning Earth dimension");
            field(World.class, "provider").set(world, ordinary); field(effects, "hbmBridge").setBoolean(population, false);
            mc.theWorld = allocate(TestWorld.class);
            require(Boolean.FALSE.equals(replay.invoke(null, .5F, false)) && field(effects, "owner").get(population) == world && drops.size() == 1, "world mismatch does not sync or clear the existing population");
            mc.theWorld = world;
            failTexture = true; clear(1);
            try { require(!CameraWeather.renderColour(mc, view, true), "bridge rejects a partially rendered resource failure without poisoning the camera"); }
            finally { failTexture = false; }
            require(phaseDepth == 0 && phaseBegins == phaseEnds && GL11.glGetBoolean(GL11.GL_DEPTH_WRITEMASK), "weather restores state and shader phase after exceptions");
            require(field(CameraWeather.class, "cameraWeather").get(null) == null, "failed optional replay yields to vanilla on the next sample");
            require(CameraWeather.renderColour(mc, view, false), "next sample succeeds through vanilla fallback");
            CameraWeather.invalidate();
            require(!field(CameraWeather.class, "checked").getBoolean(null), "reload/world change permits optional weather resolution again");
            require(phaseDepth == 0, "absent/older WGQOL retains vanilla fallback");
        } finally { field(CameraWeather.class, "checked").setBoolean(null, false); field(CameraWeather.class, "cameraWeather").set(null, null); }
    }

    private static WorldProvider hbmProvider() throws Exception {
        class Names extends ClassLoader {
            Names() { super(CameraEnvironmentChecks.class.getClassLoader()); }
            Class<?> define(String name, byte[] bytes) { return defineClass(name, bytes, 0, bytes.length); }
        }
        Names names = new Names();
        String renderer = "com/hbm/dim/WeatherProviderCelestial", provider = "com/hbm/dim/WorldProviderEarth";
        org.objectweb.asm.ClassWriter r = new org.objectweb.asm.ClassWriter(0);
        r.visit(52, 1, renderer, null, "net/minecraftforge/client/IRenderHandler", null);
        r.visitField(1, "calls", "I", null, null).visitEnd();
        org.objectweb.asm.MethodVisitor m = r.visitMethod(1, "render", "(FLnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/client/Minecraft;)V", null, null);
        m.visitCode(); m.visitVarInsn(25, 0); m.visitInsn(89); m.visitFieldInsn(180, renderer, "calls", "I"); m.visitInsn(4); m.visitInsn(96); m.visitFieldInsn(181, renderer, "calls", "I"); m.visitInsn(177); m.visitMaxs(3, 4); m.visitEnd(); r.visitEnd();
        Object weather = allocate(names.define(renderer.replace('/', '.'), r.toByteArray()));
        org.objectweb.asm.ClassWriter p = new org.objectweb.asm.ClassWriter(0);
        p.visit(52, 1, provider, null, "net/minecraft/world/WorldProviderSurface", null);
        p.visitField(1, "own", "Lnet/minecraftforge/client/IRenderHandler;", null, null).visitEnd();
        m = p.visitMethod(1, "getWeatherRenderer", "()Lnet/minecraftforge/client/IRenderHandler;", null, null);
        m.visitCode(); m.visitVarInsn(25, 0); m.visitFieldInsn(180, provider, "own", "Lnet/minecraftforge/client/IRenderHandler;"); m.visitInsn(176); m.visitMaxs(1, 1); m.visitEnd(); p.visitEnd();
        Class<?> type = names.define(provider.replace('/', '.'), p.toByteArray());
        WorldProvider world = (WorldProvider)allocate(type); type.getField("own").set(world, weather); return world;
    }

    private static CameraView view() {
        GL11.glMatrixMode(GL11.GL_PROJECTION); GL11.glLoadIdentity(); GLU.gluPerspective(70, 1, .05F, 16);
        GL11.glMatrixMode(GL11.GL_MODELVIEW); GL11.glLoadIdentity();
        CameraView primary = new CameraView(), view = new CameraView(); primary.capture(.5, 64, .5, .5F); view.set(primary, 128, 128, 1, 1, 1); return view;
    }
    private static void clear(double depth) {
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, framebuffer); GL11.glViewport(0, 0, 128, 128);
        GL11.glDisable(GL11.GL_SCISSOR_TEST); GL11.glColorMask(true, true, true, true); GL11.glDepthMask(true);
        GL11.glDepthRange(0, 1); GL11.glClearDepth(depth); GL11.glClearColor(0, 0, 0, 1); GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthFunc(GL11.GL_LEQUAL); GL20.glUseProgram(0);
    }
    private static void quad(float size, float z) {
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0, 0); GL11.glVertex3f(-size, -size, z);
        GL11.glTexCoord2f(1, 0); GL11.glVertex3f(size, -size, z);
        GL11.glTexCoord2f(1, 1); GL11.glVertex3f(size, size, z);
        GL11.glTexCoord2f(0, 1); GL11.glVertex3f(-size, size, z); GL11.glEnd();
    }
    private static int pixel(int x, int y, int channel) { ByteBuffer out = BufferUtils.createByteBuffer(4); GL11.glReadPixels(x, y, 1, 1, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, out); return out.get(channel) & 255; }
    private static float depth() { FloatBuffer out = BufferUtils.createFloatBuffer(1); GL11.glReadPixels(64, 64, 1, 1, GL11.GL_DEPTH_COMPONENT, GL11.GL_FLOAT, out); return out.get(0); }
    private static FloatBuffer matrix(int type) { FloatBuffer out = BufferUtils.createFloatBuffer(16); GL11.glGetFloat(type, out); return out; }
    private static void equal(FloatBuffer a, FloatBuffer b) { for (int i = 0; i < 16; i++) require(a.get(i) == b.get(i), "restored matrix element " + i); }
    private static Field field(Class<?> type, String name) throws Exception { Field result = type.getDeclaredField(name); result.setAccessible(true); return result; }
    @SuppressWarnings("unchecked") private static <T> T allocate(Class<T> type) throws Exception { return (T)unsafe.allocateInstance(type); }
    private static void require(boolean condition, String message) { checks++; if (!condition) throw new AssertionError(message); }
    private static final class Provider extends WorldProviderSurface { @Override public float[] calcSunriseSunsetColors(float a, float p) { return null; } }
    private static final class TestWorld extends WorldClient {
        int queries, moon, phaseReads, starReads;
        private TestWorld() { super(null, null, 0, null, null); }
        @Override public Vec3 getSkyColor(net.minecraft.entity.Entity e, float p) { return Vec3.createVectorHelper(0, 0, 0); }
        @Override public float getCelestialAngle(float p) { return 0; }
        @Override public int getMoonPhase() { phaseReads++; return moon; }
        @Override public float getStarBrightness(float p) { starReads++; return 1; }
        @Override public float getRainStrength(float p) { return 0; }
        @Override public double getHorizon() { return -1000; }
        @Override public boolean blockExists(int x, int y, int z) { queries++; throw new AssertionError("unexpected terrain query"); }
    }
    private static final class Textures extends TextureManager {
        boolean moon;
        private final int white;
        private final int phases;
        Textures() {
            super(null); white = GL11.glGenTextures(); GL11.glBindTexture(GL11.GL_TEXTURE_2D, white);
            ByteBuffer data = BufferUtils.createByteBuffer(4); data.putInt(-1).flip();
            GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, 1, 1, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, data);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            phases = GL11.glGenTextures(); GL11.glBindTexture(GL11.GL_TEXTURE_2D, phases);
            ByteBuffer atlas = BufferUtils.createByteBuffer(4 * 2 * 4);
            for (int phase = 0; phase < 8; phase++) atlas.put((byte)(30 + 25 * phase)).put((byte)0).put((byte)0).put((byte)255);
            atlas.flip(); GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, 4, 2, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, atlas);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        }
        @Override public void bindTexture(ResourceLocation resource) { if (failTexture) throw new IllegalStateException("injected resource failure"); boolean isMoon = resource.getResourcePath().contains("moon"); moon |= isMoon; GL11.glBindTexture(GL11.GL_TEXTURE_2D, isMoon ? phases : white); }
    }
}
