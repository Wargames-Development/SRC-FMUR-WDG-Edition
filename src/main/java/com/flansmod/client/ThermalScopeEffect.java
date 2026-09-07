package com.flansmod.client;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

import java.nio.ByteBuffer;

/** Client-only white-hot display for thermal scope attachments. */
@SideOnly(Side.CLIENT)
public final class ThermalScopeEffect {
    private static final String VERTEX_SHADER =
            "#version 120\n" +
            "varying vec2 textureCoordinate;\n" +
            "void main() {\n" +
            "    gl_Position = ftransform();\n" +
            "    textureCoordinate = gl_MultiTexCoord0.xy;\n" +
            "}\n";

    private static final String FRAGMENT_SHADER =
            "#version 120\n" +
            "uniform sampler2D sceneTexture;\n" +
            "uniform sampler2D heatMask;\n" +
            "uniform vec2 resolution;\n" +
            "uniform float elapsedTime;\n" +
            "uniform float flirEnabled;\n" +
            "uniform float binocularDisplay;\n" +
            "varying vec2 textureCoordinate;\n" +
            "float luminance(vec3 color) {\n" +
            "    return dot(color, vec3(0.2126, 0.7152, 0.0722));\n" +
            "}\n" +
            "float noise(vec2 point) {\n" +
            "    return fract(sin(dot(point, vec2(12.9898, 78.233))) * 43758.5453);\n" +
            "}\n" +
            "void main() {\n" +
            "    vec2 uv = textureCoordinate;\n" +
            "    float frame = floor(elapsedTime * 9.0);\n" +
            "    float sensorFrame = frame * (1.0 - binocularDisplay);\n" +
            "    float horizontalJitter = (noise(vec2(sensorFrame, 17.0)) - 0.5) * 2.5 / max(resolution.x, 1.0) * (1.0 - binocularDisplay);\n" +
            "    vec2 sensorUv = uv + vec2(horizontalJitter, 0.0);\n" +
            "    vec3 scene = texture2D(sceneTexture, uv).rgb;\n" +
            "    vec3 sensorScene = texture2D(sceneTexture, sensorUv).rgb;\n" +
            "    float gray = luminance(sensorScene);\n" +
            "    vec2 centered = abs(uv - vec2(0.5));\n" +
            "    vec2 lensPosition = (uv - vec2(0.5)) * resolution;\n" +
            "    float lensMask = step(length(lensPosition), resolution.y * 0.405);\n" +
            "    float scopeWindow = lensMask * step(centered.y, 0.16);\n" +
            "    float binocularWindow = step(centered.x, 0.419) * step(centered.y, 0.355);\n" +
            "    float thermalWindow = mix(scopeWindow, binocularWindow, binocularDisplay);\n" +
            "    float entityHeat = step(0.01, texture2D(heatMask, sensorUv).a);\n" +
            "    float warmColor = max(0.0, sensorScene.r - sensorScene.b) + max(0.0, sensorScene.g - sensorScene.b) * 0.35;\n" +
            "    float worldHeat = smoothstep(0.35, 0.72, warmColor) * smoothstep(0.55, 0.88, gray);\n" +
            "    float heat = max(entityHeat, worldHeat);\n" +
            "    float sensorNoise = noise(floor(gl_FragCoord.xy / 2.0) + sensorFrame * 31.0) - 0.5;\n" +
            "    float gainFlicker = mix(0.88 + noise(vec2(frame, 53.0)) * 0.14, 1.0, binocularDisplay);\n" +
            "    float scanline = 0.035 * sin(gl_FragCoord.y * 1.15 + frame);\n" +
            "    float rollingBand = 0.035 * sin(gl_FragCoord.y * 0.045 - frame * 2.4);\n" +
            "    float dropoutFrame = floor(elapsedTime * 30.0);\n" +
            "    float projectorDrop = step(0.975, noise(vec2(dropoutFrame, 137.0)));\n" +
            "    float projectorLevel = mix(mix(1.0, 0.08, projectorDrop), 1.0, binocularDisplay);\n" +
            "    float thermalGray = clamp(pow(gray, 0.82) * 0.76 + sensorNoise * 0.085 + scanline + rollingBand, 0.0, 1.0);\n" +
            "    vec3 thermal = mix(vec3(thermalGray), vec3(1.0), heat * 0.94) * gainFlicker;\n" +
            "    vec3 colorVideo = clamp(sensorScene * gainFlicker + vec3(sensorNoise * 0.055 + scanline + rollingBand), 0.0, 1.0);\n" +
            "    vec3 sensor = mix(colorVideo, clamp(thermal, 0.0, 1.0), flirEnabled) * projectorLevel;\n" +
            "    gl_FragColor = vec4(mix(scene, sensor, thermalWindow), 1.0);\n" +
            "}\n";

    private static Framebuffer heatFramebuffer;
    private static int sceneTexture = -1;
    private static int sceneWidth = -1;
    private static int sceneHeight = -1;
    private static int shaderProgram = -1;
    private static int sceneTextureUniform = -1;
    private static int heatMaskUniform = -1;
    private static int resolutionUniform = -1;
    private static int elapsedTimeUniform = -1;
    private static int flirEnabledUniform = -1;
    private static int binocularDisplayUniform = -1;
    private static boolean heatMaskValid;
    private static boolean shaderUnavailable;
    private static boolean flirEnabled = true;
    private static final long START_TIME = System.nanoTime();

    private ThermalScopeEffect() {
    }

    public static void captureHeatMask(float partialTicks) {
        heatMaskValid = false;
        Minecraft mc = Minecraft.getMinecraft();
        if (!isActive(mc) || mc.renderViewEntity == null || mc.theWorld == null
                || !GLContext.getCapabilities().OpenGL20
                || !OpenGlHelper.isFramebufferEnabled()) {
            return;
        }

        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        boolean advancedOpenGl = mc.gameSettings.advancedOpengl;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        try {
            ensureHeatFramebuffer(mc);
            GL20.glUseProgram(0);
            heatFramebuffer.bindFramebuffer(true);
            GL11.glClearColor(0F, 0F, 0F, 0F);
            GL11.glClearDepth(1D);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(true);
            GL11.glColorMask(false, false, false, false);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glEnable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
            mc.gameSettings.advancedOpengl = false;
            mc.renderGlobal.sortAndRender(mc.renderViewEntity, 0, partialTicks);

            GL11.glColorMask(false, false, false, true);
            RenderHelper.enableStandardItemLighting();
            try {
                for (Object object : mc.theWorld.loadedEntityList) {
                    if (!(object instanceof EntityLivingBase) && !(object instanceof EntityDriveable)) {
                        continue;
                    }
                    Entity entity = (Entity)object;
                    if (entity == mc.renderViewEntity && mc.gameSettings.thirdPersonView == 0) {
                        continue;
                    }
                    RenderManager.instance.renderEntitySimple(entity, partialTicks);
                }
            } finally {
                RenderHelper.disableStandardItemLighting();
            }
            heatMaskValid = true;
        } finally {
            mc.gameSettings.advancedOpengl = advancedOpenGl;
            GL11.glColorMask(true, true, true, true);
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopMatrix();
            GL20.glUseProgram(previousProgram);
            GL11.glPopAttrib();
        }
    }

    public static void render(Minecraft mc, float partialTicks) {
        if (!isActive(mc) || !heatMaskValid || !ensureShader()) {
            return;
        }
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        try {
            ensureSceneTexture(mc.displayWidth, mc.displayHeight);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, sceneTexture);
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0,
                    0, 0, mc.displayWidth, mc.displayHeight);

            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, heatFramebuffer.framebufferTexture);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            mc.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL20.glUseProgram(shaderProgram);
            GL20.glUniform1i(sceneTextureUniform, 0);
            GL20.glUniform1i(heatMaskUniform, 1);
            GL20.glUniform2f(resolutionUniform, mc.displayWidth, mc.displayHeight);
            GL20.glUniform1f(elapsedTimeUniform,
                    (System.nanoTime() - START_TIME) / 1_000_000_000F);
            GL20.glUniform1f(flirEnabledUniform, flirEnabled ? 1F : 0F);
            GL20.glUniform1f(binocularDisplayUniform, isBinocularDisplay() ? 1F : 0F);
            ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
            drawFullscreenQuad(scaled.getScaledWidth(), scaled.getScaledHeight());
        } finally {
            GL20.glUseProgram(previousProgram);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glPopAttrib();
        }
    }

    private static boolean isActive(Minecraft mc) {
        return mc.thePlayer != null && mc.currentScreen == null
                && FlansModClient.zoomProgress > 0.9F
                && hasThermalVision();
    }

    private static boolean hasThermalVision() {
        if (FlansModClient.currentScope instanceof AttachmentType) {
            return ((AttachmentType)FlansModClient.currentScope).hasThermalVision;
        }
        return FlansModClient.currentScope instanceof GunType
                && ((GunType)FlansModClient.currentScope).hasThermalVision;
    }

    private static boolean isBinocularDisplay() {
        return FlansModClient.currentScope instanceof GunType
                && ((GunType)FlansModClient.currentScope).hasThermalVision;
    }

    public static boolean isFlirEnabled() {
        return flirEnabled;
    }

    public static boolean toggleFlir() {
        flirEnabled = !flirEnabled;
        return flirEnabled;
    }

    public static boolean isThermalScopeActive(Minecraft mc) {
        return isActive(mc);
    }

    public static void renderStatus(Minecraft mc) {
        if (!isActive(mc)) {
            return;
        }
        ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        String key = GameSettings.getKeyDisplayString(KeyInputHandler.thermalScopeKey.getKeyCode());
        String text = (flirEnabled ? "FLIR ON" : "FLIR OFF") + " [" + key + "]";
        int x = (scaled.getScaledWidth() - mc.fontRenderer.getStringWidth(text)) / 2;
        float displayTop = isBinocularDisplay() ? 0.145F : 0.3535F;
        int y = Math.max(2, Math.round(scaled.getScaledHeight() * displayTop) - 12);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            mc.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            mc.fontRenderer.drawStringWithShadow(text, x, y,
                    flirEnabled ? 0xFFF4D0 : 0xC9C9C9);
        } finally {
            GL11.glPopAttrib();
        }
    }

    private static void ensureHeatFramebuffer(Minecraft mc) {
        if (heatFramebuffer == null) {
            heatFramebuffer = new Framebuffer(mc.displayWidth, mc.displayHeight, true);
            heatFramebuffer.setFramebufferFilter(GL11.GL_NEAREST);
        } else if (heatFramebuffer.framebufferWidth != mc.displayWidth
                || heatFramebuffer.framebufferHeight != mc.displayHeight) {
            heatFramebuffer.createBindFramebuffer(mc.displayWidth, mc.displayHeight);
            heatFramebuffer.setFramebufferFilter(GL11.GL_NEAREST);
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, heatFramebuffer.framebufferTexture);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
    }

    private static void ensureSceneTexture(int width, int height) {
        if (sceneTexture < 0) {
            sceneTexture = GL11.glGenTextures();
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, sceneTexture);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        if (sceneWidth != width || sceneHeight != height) {
            sceneWidth = width;
            sceneHeight = height;
            GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8,
                    width, height, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer)null);
        }
    }

    private static boolean ensureShader() {
        if (shaderProgram >= 0) {
            return true;
        }
        if (shaderUnavailable || !GLContext.getCapabilities().OpenGL20) {
            return false;
        }
        int vertex = compileShader(GL20.GL_VERTEX_SHADER, VERTEX_SHADER);
        int fragment = compileShader(GL20.GL_FRAGMENT_SHADER, FRAGMENT_SHADER);
        if (vertex < 0 || fragment < 0) {
            shaderUnavailable = true;
            return false;
        }
        shaderProgram = GL20.glCreateProgram();
        GL20.glAttachShader(shaderProgram, vertex);
        GL20.glAttachShader(shaderProgram, fragment);
        GL20.glLinkProgram(shaderProgram);
        GL20.glDeleteShader(vertex);
        GL20.glDeleteShader(fragment);
        if (GL20.glGetProgrami(shaderProgram, GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
            shaderUnavailable = true;
            GL20.glDeleteProgram(shaderProgram);
            shaderProgram = -1;
            return false;
        }
        sceneTextureUniform = GL20.glGetUniformLocation(shaderProgram, "sceneTexture");
        heatMaskUniform = GL20.glGetUniformLocation(shaderProgram, "heatMask");
        resolutionUniform = GL20.glGetUniformLocation(shaderProgram, "resolution");
        elapsedTimeUniform = GL20.glGetUniformLocation(shaderProgram, "elapsedTime");
        flirEnabledUniform = GL20.glGetUniformLocation(shaderProgram, "flirEnabled");
        binocularDisplayUniform = GL20.glGetUniformLocation(shaderProgram, "binocularDisplay");
        return true;
    }

    private static int compileShader(int type, String source) {
        int shader = GL20.glCreateShader(type);
        GL20.glShaderSource(shader, source);
        GL20.glCompileShader(shader);
        if (GL20.glGetShaderi(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
            GL20.glDeleteShader(shader);
            return -1;
        }
        return shader;
    }

    private static void drawFullscreenQuad(int width, int height) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0D, height, -90D, 0D, 0D);
        tessellator.addVertexWithUV(width, height, -90D, 1D, 0D);
        tessellator.addVertexWithUV(width, 0D, -90D, 1D, 1D);
        tessellator.addVertexWithUV(0D, 0D, -90D, 0D, 1D);
        tessellator.draw();
    }
}
