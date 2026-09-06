package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ItemNightVisionGoggles;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

import java.nio.ByteBuffer;

/** Phosphor tint, quad-tube mask and glow from explicitly registered emitters. */
@SideOnly(Side.CLIENT)
public final class NightVisionGogglesEffect {
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
            "uniform vec2 resolution;\n" +
            "uniform float elapsedTime;\n" +
            "uniform float intensity;\n" +
            "uniform float blackLevel;\n" +
            "uniform int glowCount;\n" +
            "uniform vec4 glowSources[32];\n" +
            "uniform float whitePhosphor;\n" +
            "uniform int renderPass;\n" +
            "varying vec2 textureCoordinate;\n" +
            "float luminance(vec3 color) {\n" +
            "    return dot(color, vec3(0.2126, 0.7152, 0.0722));\n" +
            "}\n" +
            "float temporalNoise(vec3 coordinate) {\n" +
            "    coordinate = fract(coordinate * 0.1031);\n" +
            "    coordinate += dot(coordinate, coordinate.yzx + 33.33);\n" +
            "    return fract((coordinate.x + coordinate.y) * coordinate.z);\n" +
            "}\n" +
            "float tubeDistance(vec2 uv, float aspect) {\n" +
            "    vec2 point = uv - vec2(0.5);\n" +
            "    point.x *= aspect;\n" +
            "    float distanceToTube = length(point - vec2(-0.52, 0.0));\n" +
            "    distanceToTube = min(distanceToTube, length(point - vec2(-0.10, 0.0)));\n" +
            "    distanceToTube = min(distanceToTube, length(point - vec2(0.10, 0.0)));\n" +
            "    distanceToTube = min(distanceToTube, length(point - vec2(0.52, 0.0)));\n" +
            "    return distanceToTube;\n" +
            "}\n" +
            "void main() {\n" +
            "    vec2 uv = textureCoordinate;\n" +
            "    float aspect = resolution.x / max(resolution.y, 1.0);\n" +
            "    if (renderPass == 1) {\n" +
            "        float distanceToTube = tubeDistance(uv, aspect);\n" +
            "        float field = 1.0 - smoothstep(0.32, 0.405, distanceToTube);\n" +
            "        gl_FragColor = vec4(0.0, 0.0, 0.0, (1.0 - field) * intensity);\n" +
            "        return;\n" +
            "    }\n" +
            "    vec3 scene = texture2D(sceneTexture, uv).rgb;\n" +
            "    float light = luminance(scene);\n" +
            "    float intensified = pow(clamp(light, 0.0, 1.0), 0.65);\n" +
            "    intensified = blackLevel + (1.0 - blackLevel) * intensified;\n" +
            "    float whiteProfile = clamp(whitePhosphor, 0.0, 1.0);\n" +
            "    float whiteContrast = smoothstep(0.035, 0.90, intensified);\n" +
            "    intensified = mix(intensified, whiteContrast, whiteProfile * 0.42);\n" +
            "    float animationFrame = floor(elapsedTime * 24.0);\n" +
            "    vec2 fineCell = floor(gl_FragCoord.xy);\n" +
            "    float fineGrain = temporalNoise(vec3(fineCell, animationFrame));\n" +
            "    fineGrain += temporalNoise(vec3(fineCell.yx + vec2(19.0, 73.0), animationFrame + 47.0));\n" +
            "    fineGrain -= 1.0;\n" +
            "    float coarseGrain = temporalNoise(vec3(floor(gl_FragCoord.xy / 2.0), animationFrame + 93.0)) - 0.5;\n" +
            "    float grainStrength = mix(0.0675, 0.0225, smoothstep(0.04, 0.70, light));\n" +
            "    intensified += fineGrain * grainStrength + coarseGrain * 0.018;\n" +
            "    float distanceToTube = tubeDistance(uv, aspect);\n" +
            "    float lensFalloff = 1.0 - 0.43 * smoothstep(0.05, 0.39, distanceToTube);\n" +
            "    vec3 phosphorColor = mix(vec3(0.13, 0.57, 0.245), vec3(0.56, 0.76, 0.86), whiteProfile);\n" +
            "    vec3 phosphor = intensified * phosphorColor;\n" +
            "    float glow = 0.0;\n" +
            "    for (int i = 0; i < 32; ++i) {\n" +
            "        if (i >= glowCount) break;\n" +
            "        vec2 delta = (gl_FragCoord.xy - glowSources[i].xy) / (glowSources[i].z * 0.4);\n" +
            "        glow = max(glow, exp(-dot(delta, delta) * 2.0) * glowSources[i].w);\n" +
            "    }\n" +
            "    vec3 glowColor = mix(vec3(0.78, 1.0, 0.80), vec3(0.86, 0.96, 1.0), whiteProfile);\n" +
            // Keep target contrast even where several tracer/muzzle halos overlap.
            "    phosphor = mix(phosphor, glowColor, clamp(glow, 0.0, 1.0) * 0.25);\n" +
            "    phosphor *= lensFalloff;\n" +
            "    gl_FragColor = vec4(mix(scene, clamp(phosphor, 0.0, 1.0), intensity), 1.0);\n" +
            "}\n";

    private static int shaderProgram = -1;
    private static int sceneTextureUniform = -1;
    private static int resolutionUniform = -1;
    private static int elapsedTimeUniform = -1;
    private static int intensityUniform = -1;
    private static int blackLevelUniform = -1;
    private static int glowCountUniform = -1;
    private static int glowSourcesUniform = -1;
    private static int whitePhosphorUniform = -1;
    private static int renderPassUniform = -1;
    private static int captureTexture = -1;
    private static int captureWidth = -1;
    private static int captureHeight = -1;
    private static boolean shaderUnavailable;
    private static final long START_TIME = System.nanoTime();

    private NightVisionGogglesEffect() {
    }

    public static float getIntensity(Minecraft minecraft, float partialTicks) {
        if (minecraft.thePlayer == null) {
            return 0F;
        }
        ItemStack goggles = PlayerEquipmentInventory.getStack(minecraft.thePlayer,
                PlayerEquipmentInventory.NIGHT_VISION_SLOT);
        if (!ItemNightVisionGoggles.isLowered(goggles)) {
            return 0F;
        }
        return NightVisionGogglesAnimation.getLoweredProgress(
                minecraft.thePlayer, partialTicks) >= 0.999F ? 1F : 0F;
    }

    public static void renderBeforeHud(Minecraft minecraft, float intensity) {
        if (intensity <= 0.001F) {
            return;
        }
        if (!ensureShader()) {
            renderFallbackTint(minecraft, intensity);
            return;
        }

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            updateCaptureTexture(minecraft.displayWidth, minecraft.displayHeight);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, captureTexture);
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0,
                    0, 0, minecraft.displayWidth, minecraft.displayHeight);

            minecraft.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glColor4f(1F, 1F, 1F, 1F);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, captureTexture);

            ScaledResolution scaled = new ScaledResolution(minecraft,
                    minecraft.displayWidth, minecraft.displayHeight);
            useShader(minecraft, intensity, 0);
            drawFullscreenQuad(scaled.getScaledWidth(), scaled.getScaledHeight());
            GL20.glUseProgram(0);
        } finally {
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glPopAttrib();
        }
    }

    public static void renderAfterHud(Minecraft minecraft, float intensity) {
        if (intensity <= 0.001F || !ensureShader()) {
            return;
        }

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            minecraft.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(1F, 1F, 1F, 1F);

            useShader(minecraft, intensity, 1);
            ScaledResolution scaled = new ScaledResolution(minecraft,
                    minecraft.displayWidth, minecraft.displayHeight);
            drawFullscreenQuad(scaled.getScaledWidth(), scaled.getScaledHeight());
            GL20.glUseProgram(0);
        } finally {
            GL20.glUseProgram(0);
            GL11.glPopAttrib();
        }
    }

    private static boolean ensureShader() {
        if (shaderProgram > 0) {
            return true;
        }
        if (shaderUnavailable || !GLContext.getCapabilities().OpenGL20) {
            shaderUnavailable = true;
            return false;
        }

        try {
            int vertexShader = compileShader(GL20.GL_VERTEX_SHADER, VERTEX_SHADER);
            int fragmentShader = compileShader(GL20.GL_FRAGMENT_SHADER, FRAGMENT_SHADER);
            shaderProgram = GL20.glCreateProgram();
            GL20.glAttachShader(shaderProgram, vertexShader);
            GL20.glAttachShader(shaderProgram, fragmentShader);
            GL20.glLinkProgram(shaderProgram);
            if (GL20.glGetProgrami(shaderProgram, GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
                throw new IllegalStateException(GL20.glGetProgramInfoLog(shaderProgram, 4096));
            }
            cacheUniformLocations();
            GL20.glDetachShader(shaderProgram, vertexShader);
            GL20.glDetachShader(shaderProgram, fragmentShader);
            GL20.glDeleteShader(vertexShader);
            GL20.glDeleteShader(fragmentShader);
            return true;
        } catch (Throwable throwable) {
            shaderUnavailable = true;
            shaderProgram = -1;
            FlansMod.logger.error("Failed to initialise the GPNVG night vision shader. Using fallback tint.", throwable);
            return false;
        }
    }

    private static int compileShader(int type, String source) {
        int shader = GL20.glCreateShader(type);
        GL20.glShaderSource(shader, source);
        GL20.glCompileShader(shader);
        if (GL20.glGetShaderi(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
            String log = GL20.glGetShaderInfoLog(shader, 4096);
            GL20.glDeleteShader(shader);
            throw new IllegalStateException(log);
        }
        return shader;
    }

    private static void cacheUniformLocations() {
        sceneTextureUniform = GL20.glGetUniformLocation(shaderProgram, "sceneTexture");
        resolutionUniform = GL20.glGetUniformLocation(shaderProgram, "resolution");
        elapsedTimeUniform = GL20.glGetUniformLocation(shaderProgram, "elapsedTime");
        intensityUniform = GL20.glGetUniformLocation(shaderProgram, "intensity");
        blackLevelUniform = GL20.glGetUniformLocation(shaderProgram, "blackLevel");
        glowCountUniform = GL20.glGetUniformLocation(shaderProgram, "glowCount");
        glowSourcesUniform = GL20.glGetUniformLocation(shaderProgram, "glowSources[0]");
        whitePhosphorUniform = GL20.glGetUniformLocation(shaderProgram, "whitePhosphor");
        renderPassUniform = GL20.glGetUniformLocation(shaderProgram, "renderPass");
    }

    private static void updateCaptureTexture(int width, int height) {
        if (captureTexture < 0) {
            captureTexture = GL11.glGenTextures();
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, captureTexture);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        if (captureWidth != width || captureHeight != height) {
            captureWidth = width;
            captureHeight = height;
            GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, width, height,
                    0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer) null);
        }
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, captureTexture);
    }

    private static void useShader(Minecraft minecraft, float intensity, int renderPass) {
        GL20.glUseProgram(shaderProgram);
        GL20.glUniform1i(sceneTextureUniform, 0);
        GL20.glUniform2f(resolutionUniform,
                minecraft.displayWidth, minecraft.displayHeight);
        GL20.glUniform1f(elapsedTimeUniform,
                (System.nanoTime() - START_TIME) / 1_000_000_000F);
        GL20.glUniform1f(intensityUniform, intensity);
        NightVisionGlow.upload(glowCountUniform, glowSourcesUniform);
        // Sky pixels bypass Minecraft's lightmap. Lift the black level as well
        // as world lighting, preserving texture contrast without light-source glare.
        GL20.glUniform1f(blackLevelUniform,
                0.45F * (float)Math.sqrt(NightVisionGogglesBrightness.getGamma() / 12F));
        ItemStack goggles = minecraft.thePlayer == null ? null
                : PlayerEquipmentInventory.getStack(minecraft.thePlayer,
                PlayerEquipmentInventory.NIGHT_VISION_SLOT);
        GL20.glUniform1f(whitePhosphorUniform,
                ItemNightVisionGoggles.isWhitePhosphor(goggles) ? 1F : 0F);
        GL20.glUniform1i(renderPassUniform, renderPass);
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

    private static void renderFallbackTint(Minecraft minecraft, float intensity) {
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            minecraft.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_ZERO, GL11.GL_SRC_COLOR);
            ItemStack goggles = minecraft.thePlayer == null ? null
                    : PlayerEquipmentInventory.getStack(minecraft.thePlayer,
                    PlayerEquipmentInventory.NIGHT_VISION_SLOT);
            if (ItemNightVisionGoggles.isWhitePhosphor(goggles)) {
                GL11.glColor4f(1F - 0.44F * intensity,
                        1F - 0.24F * intensity, 1F, 1F);
            } else {
                GL11.glColor4f(1F - 0.88F * intensity,
                        1F, 1F - 0.84F * intensity, 1F);
            }
            ScaledResolution scaled = new ScaledResolution(minecraft,
                    minecraft.displayWidth, minecraft.displayHeight);
            int width = scaled.getScaledWidth();
            int height = scaled.getScaledHeight();
            Tessellator tessellator = Tessellator.instance;
            tessellator.startDrawingQuads();
            tessellator.addVertex(0D, height, -90D);
            tessellator.addVertex(width, height, -90D);
            tessellator.addVertex(width, 0D, -90D);
            tessellator.addVertex(0D, 0D, -90D);
            tessellator.draw();
        } finally {
            GL11.glPopAttrib();
        }
    }
}
