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

/** Original image-based NVG bloom, excluding visible light-emitting block surfaces. */
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
            "uniform sampler2D bloomTexture;\n" +
            "uniform vec2 resolution;\n" +
            "uniform vec2 bloomResolution;\n" +
            "uniform float elapsedTime;\n" +
            "uniform float intensity;\n" +
            "uniform float blackLevel;\n" +
            "uniform sampler2D blockLightMask;\n" +
            "uniform float blockLightMaskValid;\n" +
            "uniform float whitePhosphor;\n" +
            "uniform float amberPhosphor;\n" +
            "uniform float singleTube;\n" +
            "uniform int renderPass;\n" +
            "varying vec2 textureCoordinate;\n" +
            "float luminance(vec3 color) {\n" +
            "    return dot(color, vec3(0.2126, 0.7152, 0.0722));\n" +
            "}\n" +
            "float randomNoise(vec2 coordinate) {\n" +
            "    return fract(sin(dot(coordinate, vec2(12.9898, 78.233))) * 43758.5453);\n" +
            "}\n" +
            "float temporalNoise(vec3 coordinate) {\n" +
            "    coordinate = fract(coordinate * 0.1031);\n" +
            "    coordinate += dot(coordinate, coordinate.yzx + 33.33);\n" +
            "    return fract((coordinate.x + coordinate.y) * coordinate.z);\n" +
            "}\n" +
            "float sourceMask(vec2 coordinate) {\n" +
            "    vec3 source = texture2D(sceneTexture, coordinate).rgb;\n" +
            "    float warmEmission = max(0.0, source.r - source.b) * 0.55;\n" +
            "    float brightSource = smoothstep(0.78, 0.96, luminance(source) + warmEmission);\n" +
            "    float redDominance = source.r - max(source.g, source.b);\n" +
            "    float saturatedRed = smoothstep(0.55, 0.85, source.r)\n" +
            "            * smoothstep(0.35, 0.75, redDominance);\n" +
            "    float greenDominance = source.g - max(source.r, source.b);\n" +
            "    float saturatedGreen = smoothstep(0.55, 0.85, source.g)\n" +
            "            * smoothstep(0.35, 0.75, greenDominance);\n" +
            "    vec4 block = texture2D(blockLightMask, coordinate);\n" +
            "    vec3 difference = abs(source - block.rgb);\n" +
            "    float changed = step(0.025, max(difference.r, max(difference.g, difference.b)));\n" +
            "    float allowed = 1.0 - blockLightMaskValid * step(0.001, block.a) * (1.0 - changed);\n" +
            "    return max(brightSource, max(saturatedRed, saturatedGreen) * 0.72) * allowed;\n" +
            "}\n" +
            "float horizontalBloom(vec2 uv, vec2 pixel) {\n" +
            "    float bloom = 0.0;\n" +
            "    float weightSum = 0.0;\n" +
            "    for (int offset = -16; offset <= 16; ++offset) {\n" +
            "        float distance = float(offset);\n" +
            "        float weight = exp(-(distance * distance) / 98.0);\n" +
            "        bloom += sourceMask(uv + vec2(pixel.x * distance * 4.0, 0.0)) * weight;\n" +
            "        weightSum += weight;\n" +
            "    }\n" +
            "    return bloom / weightSum;\n" +
            "}\n" +
            "float verticalBloom(vec2 uv) {\n" +
            "    float bloom = 0.0;\n" +
            "    float weightSum = 0.0;\n" +
            "    vec2 bloomPixel = 1.0 / bloomResolution;\n" +
            "    for (int offset = -16; offset <= 16; ++offset) {\n" +
            "        float distance = float(offset);\n" +
            "        float weight = exp(-(distance * distance) / 98.0);\n" +
            "        bloom += texture2D(bloomTexture, uv + vec2(0.0, bloomPixel.y * distance)).r * weight;\n" +
            "        weightSum += weight;\n" +
            "    }\n" +
            "    return bloom / weightSum;\n" +
            "}\n" +
            "float tubeDistance(vec2 uv, float aspect) {\n" +
            "    vec2 point = uv - vec2(0.5);\n" +
            "    point.x *= aspect;\n" +
            "    if (singleTube > 0.5) return length(point);\n" +
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
            "    vec2 pixel = 1.0 / resolution;\n" +
            "    if (renderPass == 2) {\n" +
            "        float bloom = horizontalBloom(uv, pixel);\n" +
            "        gl_FragColor = vec4(bloom, bloom, bloom, 1.0);\n" +
            "        return;\n" +
            "    }\n" +
            "    vec3 scene = texture2D(sceneTexture, uv).rgb;\n" +
            "    float light = luminance(scene);\n" +
            "    float bloom = verticalBloom(uv);\n" +
            "    float intensified = pow(clamp(light, 0.0, 1.0), 0.65);\n" +
            "    intensified = blackLevel + (1.0 - blackLevel) * intensified;\n" +
            "    float directOverload = sourceMask(uv);\n" +
            "    float bloomBlast = clamp(bloom * 7.2, 0.0, 1.0);\n" +
            "    intensified += directOverload * 0.70 + bloomBlast * 1.45;\n" +
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
            "    phosphorColor = mix(phosphorColor, vec3(1.0, 0.58, 0.12), amberPhosphor);\n" +
            "    vec3 phosphor = intensified * phosphorColor;\n" +
            "    float whiteout = clamp(directOverload * 0.65 + bloom * 8.0, 0.0, 1.0);\n" +
            "    vec3 overloadColor = mix(vec3(0.78, 1.0, 0.80), vec3(0.86, 0.96, 1.0), whiteProfile);\n" +
            "    overloadColor = mix(overloadColor, vec3(1.0, 0.90, 0.62), amberPhosphor);\n" +
            "    phosphor = mix(phosphor, overloadColor, whiteout);\n" +
            "    phosphor *= lensFalloff;\n" +
            "    gl_FragColor = vec4(mix(scene, clamp(phosphor, 0.0, 1.0), intensity), 1.0);\n" +
            "}\n";

    private static int shaderProgram = -1;
    private static int sceneTextureUniform = -1;
    private static int bloomTextureUniform = -1;
    private static int resolutionUniform = -1;
    private static int bloomResolutionUniform = -1;
    private static int elapsedTimeUniform = -1;
    private static int intensityUniform = -1;
    private static int blackLevelUniform = -1;
    private static int blockLightMaskUniform = -1;
    private static int blockLightMaskValidUniform = -1;
    private static int whitePhosphorUniform = -1;
    private static int amberPhosphorUniform = -1;
    private static int singleTubeUniform = -1;
    private static int renderPassUniform = -1;
    private static int captureTexture = -1;
    private static int bloomTexture = -1;
    private static int captureWidth = -1;
    private static int captureHeight = -1;
    private static int bloomWidth = -1;
    private static int bloomHeight = -1;
    private static final int BLOOM_DOWNSAMPLE = 4;
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
            NightVisionBlockLightMask.bind();
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
            int targetBloomWidth = Math.max(1, minecraft.displayWidth / BLOOM_DOWNSAMPLE);
            int targetBloomHeight = Math.max(1, minecraft.displayHeight / BLOOM_DOWNSAMPLE);

            // Downsample while extracting and horizontally spreading bright sources.
            // The dense low-resolution blur produces one smooth glow instead of visible
            // square copies of distant blocks.
            GL11.glViewport(0, 0, targetBloomWidth, targetBloomHeight);
            useShader(minecraft, intensity, 2);
            drawFullscreenQuad(scaled.getScaledWidth(), scaled.getScaledHeight());
            GL20.glUseProgram(0);

            // Capture that intermediate result for the vertical blur/final pass.
            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, bloomTexture);
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0,
                    0, 0, targetBloomWidth, targetBloomHeight);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, captureTexture);

            minecraft.entityRenderer.setupOverlayRendering();
            GL11.glViewport(0, 0, minecraft.displayWidth, minecraft.displayHeight);
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
        if (intensity <= 0.001F) {
            return;
        }
        if (!ensureShader()) {
            ItemStack goggles = minecraft.thePlayer == null ? null
                    : PlayerEquipmentInventory.getStack(minecraft.thePlayer,
                    PlayerEquipmentInventory.NIGHT_VISION_SLOT);
            if (ItemNightVisionGoggles.isSingleTube(goggles)) {
                renderSingleTubeFallback(minecraft, intensity);
            }
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
        bloomTextureUniform = GL20.glGetUniformLocation(shaderProgram, "bloomTexture");
        resolutionUniform = GL20.glGetUniformLocation(shaderProgram, "resolution");
        bloomResolutionUniform = GL20.glGetUniformLocation(shaderProgram, "bloomResolution");
        elapsedTimeUniform = GL20.glGetUniformLocation(shaderProgram, "elapsedTime");
        intensityUniform = GL20.glGetUniformLocation(shaderProgram, "intensity");
        blackLevelUniform = GL20.glGetUniformLocation(shaderProgram, "blackLevel");
        blockLightMaskUniform = GL20.glGetUniformLocation(shaderProgram, "blockLightMask");
        blockLightMaskValidUniform = GL20.glGetUniformLocation(shaderProgram, "blockLightMaskValid");
        whitePhosphorUniform = GL20.glGetUniformLocation(shaderProgram, "whitePhosphor");
        amberPhosphorUniform = GL20.glGetUniformLocation(shaderProgram, "amberPhosphor");
        singleTubeUniform = GL20.glGetUniformLocation(shaderProgram, "singleTube");
        renderPassUniform = GL20.glGetUniformLocation(shaderProgram, "renderPass");
    }

    private static void updateCaptureTexture(int width, int height) {
        int targetBloomWidth = Math.max(1, width / BLOOM_DOWNSAMPLE);
        int targetBloomHeight = Math.max(1, height / BLOOM_DOWNSAMPLE);
        if (captureTexture < 0) {
            captureTexture = GL11.glGenTextures();
        }
        if (bloomTexture < 0) {
            bloomTexture = GL11.glGenTextures();
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

            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, bloomTexture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        }
        if (bloomWidth != targetBloomWidth || bloomHeight != targetBloomHeight) {
            bloomWidth = targetBloomWidth;
            bloomHeight = targetBloomHeight;
            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, bloomTexture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8,
                    targetBloomWidth, targetBloomHeight, 0,
                    GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer) null);
        }
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, captureTexture);
    }

    private static void useShader(Minecraft minecraft, float intensity, int renderPass) {
        GL20.glUseProgram(shaderProgram);
        GL20.glUniform1i(sceneTextureUniform, 0);
        GL20.glUniform1i(bloomTextureUniform, 1);
        GL20.glUniform2f(resolutionUniform,
                minecraft.displayWidth, minecraft.displayHeight);
        GL20.glUniform2f(bloomResolutionUniform,
                Math.max(1, minecraft.displayWidth / BLOOM_DOWNSAMPLE),
                Math.max(1, minecraft.displayHeight / BLOOM_DOWNSAMPLE));
        GL20.glUniform1f(elapsedTimeUniform,
                (System.nanoTime() - START_TIME) / 1_000_000_000F);
        GL20.glUniform1f(intensityUniform, intensity);
        GL20.glUniform1f(blackLevelUniform,
                0.45F * (float)Math.sqrt(NightVisionGogglesBrightness.getGamma() / 12F));
        GL20.glUniform1i(blockLightMaskUniform, 2);
        GL20.glUniform1f(blockLightMaskValidUniform, NightVisionBlockLightMask.isValid() ? 1F : 0F);
        ItemStack goggles = minecraft.thePlayer == null ? null
                : PlayerEquipmentInventory.getStack(minecraft.thePlayer,
                PlayerEquipmentInventory.NIGHT_VISION_SLOT);
        GL20.glUniform1f(whitePhosphorUniform,
                ItemNightVisionGoggles.isWhitePhosphor(goggles) ? 1F : 0F);
        GL20.glUniform1f(amberPhosphorUniform,
                ItemNightVisionGoggles.isAmberPhosphor(goggles) ? 1F : 0F);
        GL20.glUniform1f(singleTubeUniform,
                ItemNightVisionGoggles.isSingleTube(goggles) ? 1F : 0F);
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

    private static void renderSingleTubeFallback(Minecraft minecraft, float intensity) {
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            minecraft.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(0F, 0F, 0F, intensity);
            ScaledResolution scaled = new ScaledResolution(minecraft,
                    minecraft.displayWidth, minecraft.displayHeight);
            double cx = scaled.getScaledWidth() / 2D;
            double cy = scaled.getScaledHeight() / 2D;
            double radius = scaled.getScaledHeight() * 0.405D;
            double outer = Math.hypot(cx, cy) * 2D;
            Tessellator tessellator = Tessellator.instance;
            tessellator.startDrawingQuads();
            for (int i = 0; i < 96; i++) {
                double a = i * Math.PI * 2D / 96D;
                double b = (i + 1) * Math.PI * 2D / 96D;
                tessellator.addVertex(cx + Math.cos(a) * radius, cy + Math.sin(a) * radius, -90D);
                tessellator.addVertex(cx + Math.cos(a) * outer, cy + Math.sin(a) * outer, -90D);
                tessellator.addVertex(cx + Math.cos(b) * outer, cy + Math.sin(b) * outer, -90D);
                tessellator.addVertex(cx + Math.cos(b) * radius, cy + Math.sin(b) * radius, -90D);
            }
            tessellator.draw();
        } finally {
            GL11.glPopAttrib();
        }
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
            if (ItemNightVisionGoggles.isAmberPhosphor(goggles)) {
                GL11.glColor4f(1F, 1F - 0.42F * intensity,
                        1F - 0.88F * intensity, 1F);
            } else if (ItemNightVisionGoggles.isWhitePhosphor(goggles)) {
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
