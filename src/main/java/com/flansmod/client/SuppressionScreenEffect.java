package com.flansmod.client;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

import java.nio.ByteBuffer;
import java.util.Random;

/** Short-lived post-process used for nearby hostile rounds and confirmed bullet hits. */
@SideOnly(Side.CLIENT)
public final class SuppressionScreenEffect {
    private static final int NEAR_MISS_DURATION_TICKS = 40;
    private static final int HIT_DURATION_TICKS = 60;
    private static final long START_TIME = System.nanoTime();
    private static final Random SOUND_RANDOM = new Random();
    private static final String[] NEAR_MISS_SOUNDS = {
            "bulletwhiz1", "bulletwhiz2", "bulletwhiz3"
    };

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
            "uniform float suppression;\n" +
            "uniform float nearMissIntensity;\n" +
            "uniform float hitIntensity;\n" +
            "uniform float redEdges;\n" +
            "varying vec2 textureCoordinate;\n" +
            "float luminance(vec3 color) {\n" +
            "    return dot(color, vec3(0.2126, 0.7152, 0.0722));\n" +
            "}\n" +
            "float noise(vec3 point) {\n" +
            "    point = fract(point * 0.1031);\n" +
            "    point += dot(point, point.yzx + 33.33);\n" +
            "    return fract((point.x + point.y) * point.z);\n" +
            "}\n" +
            "void main() {\n" +
            "    vec2 uv = textureCoordinate;\n" +
            "    vec2 center = uv - vec2(0.5);\n" +
            "    float radius = length(center);\n" +
            "    vec2 direction = center / max(radius, 0.001);\n" +
            "    float chromaPixels = suppression * (1.2 + hitIntensity * 4.8)\n" +
            "            * (0.28 + radius * 1.35);\n" +
            "    vec2 chromaOffset = direction * chromaPixels / resolution;\n" +
            "    vec3 color = vec3(\n" +
            "            texture2D(sceneTexture, uv + chromaOffset).r,\n" +
            "            texture2D(sceneTexture, uv).g,\n" +
            "            texture2D(sceneTexture, uv - chromaOffset).b);\n" +
            "    vec2 pixel = 1.45 / resolution;\n" +
            "    float baseLight = luminance(texture2D(sceneTexture, uv).rgb);\n" +
            "    float edge = abs(baseLight - luminance(texture2D(sceneTexture, uv + vec2(pixel.x, 0.0)).rgb));\n" +
            "    edge = max(edge, abs(baseLight - luminance(texture2D(sceneTexture, uv - vec2(pixel.x, 0.0)).rgb)));\n" +
            "    edge = max(edge, abs(baseLight - luminance(texture2D(sceneTexture, uv + vec2(0.0, pixel.y)).rgb)));\n" +
            "    edge = max(edge, abs(baseLight - luminance(texture2D(sceneTexture, uv - vec2(0.0, pixel.y)).rgb)));\n" +
            "    float outline = smoothstep(0.025, 0.18, edge);\n" +
            "    outline *= suppression * (0.42 + hitIntensity * 0.58);\n" +
            "    float gray = luminance(color);\n" +
            "    color = mix(color, vec3(gray), suppression * (0.18 + hitIntensity * 0.24));\n" +
            "    color = (color - 0.5) * (1.0 + suppression * 0.28) + 0.5;\n" +
            "    color += vec3(outline * (0.44 + hitIntensity * 0.40));\n" +
            "    float frame = floor(elapsedTime * 24.0);\n" +
            "    float fineGrain = noise(vec3(floor(gl_FragCoord.xy), frame)) - 0.5;\n" +
            "    float coarseGrain = noise(vec3(floor(gl_FragCoord.xy / 3.0), frame + 41.0)) - 0.5;\n" +
            "    color += vec3((fineGrain + coarseGrain * 0.55)\n" +
            "            * suppression * (0.105 + hitIntensity * 0.12));\n" +
            "    float edgeDistance = max(abs(center.x) * 2.0, abs(center.y) * 2.0);\n" +
            "    float vignette = smoothstep(0.48, 1.0, edgeDistance);\n" +
            "    float nearVignette = smoothstep(0.0, 0.35, nearMissIntensity);\n" +
            "    color = mix(color, vec3(0.018, 0.015, 0.013),\n" +
            "            vignette * nearVignette * 0.64);\n" +
            "    color += vec3(vignette * suppression * (0.08 + hitIntensity * 0.10));\n" +
            "    float red = vignette * hitIntensity * redEdges;\n" +
            "    color = mix(color, vec3(0.72, 0.015, 0.008), red * 0.68);\n" +
            "    gl_FragColor = vec4(clamp(color, 0.0, 1.0), 1.0);\n" +
            "}\n";

    private static int nearMissTicks;
    private static float nearMissStrength;
    private static int hitTicks;
    private static int shaderProgram = -1;
    private static int captureTexture = -1;
    private static int captureWidth = -1;
    private static int captureHeight = -1;
    private static boolean shaderUnavailable;

    private SuppressionScreenEffect() {
    }

    public static void triggerNearMiss(float strength) {
        nearMissStrength = Math.max(nearMissStrength,
                MathHelper.clamp_float(strength, 0F, 1F));
        nearMissTicks = NEAR_MISS_DURATION_TICKS;
        if (SOUND_RANDOM.nextInt(3) == 0) {
            String sound = NEAR_MISS_SOUNDS[SOUND_RANDOM.nextInt(NEAR_MISS_SOUNDS.length)];
            Minecraft.getMinecraft().getSoundHandler().playSound(
                    PositionedSoundRecord.func_147673_a(FlansModResourceHandler.getSound(sound)));
        }
    }

    public static void triggerHit() {
        hitTicks = HIT_DURATION_TICKS;
    }

    public static void tick(Minecraft minecraft) {
        if (minecraft.theWorld == null || minecraft.thePlayer == null) {
            nearMissTicks = 0;
            nearMissStrength = 0F;
            hitTicks = 0;
            return;
        }
        if (nearMissTicks > 0 && --nearMissTicks == 0) {
            nearMissStrength = 0F;
        }
        if (hitTicks > 0) {
            hitTicks--;
        }
    }

    public static boolean isActive() {
        return nearMissTicks > 0 || hitTicks > 0;
    }

    public static void render(Minecraft minecraft, float partialTicks) {
        if (!isActive() || minecraft.theWorld == null || minecraft.thePlayer == null) {
            return;
        }

        float nearLife = remainingLife(nearMissTicks, NEAR_MISS_DURATION_TICKS, partialTicks);
        float hitLife = remainingLife(hitTicks, HIT_DURATION_TICKS, partialTicks);
        float nearIntensity = nearMissStrength * smooth(nearLife);
        float hitIntensity = smooth(hitLife);
        float suppression = MathHelper.clamp_float(nearIntensity * 0.72F + hitIntensity, 0F, 1F);
        if (suppression <= 0.002F) {
            return;
        }

        if (!ensureShader()) {
            renderFallback(minecraft, suppression, nearIntensity, hitIntensity);
            return;
        }

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            updateCaptureTexture(minecraft.displayWidth, minecraft.displayHeight);
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

            GL20.glUseProgram(shaderProgram);
            GL20.glUniform1i(GL20.glGetUniformLocation(shaderProgram, "sceneTexture"), 0);
            GL20.glUniform2f(GL20.glGetUniformLocation(shaderProgram, "resolution"),
                    minecraft.displayWidth, minecraft.displayHeight);
            GL20.glUniform1f(GL20.glGetUniformLocation(shaderProgram, "elapsedTime"),
                    (System.nanoTime() - START_TIME) / 1_000_000_000F);
            GL20.glUniform1f(GL20.glGetUniformLocation(shaderProgram, "suppression"), suppression);
            GL20.glUniform1f(GL20.glGetUniformLocation(shaderProgram, "nearMissIntensity"), nearIntensity);
            GL20.glUniform1f(GL20.glGetUniformLocation(shaderProgram, "hitIntensity"), hitIntensity);
            GL20.glUniform1f(GL20.glGetUniformLocation(shaderProgram, "redEdges"),
                    FlansMod.showFlashesWhenWounded ? 1F : 0F);

            ScaledResolution scaled = new ScaledResolution(minecraft,
                    minecraft.displayWidth, minecraft.displayHeight);
            drawQuad(scaled.getScaledWidth(), scaled.getScaledHeight());
        } finally {
            GL20.glUseProgram(0);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glPopAttrib();
            GL11.glColor4f(1F, 1F, 1F, 1F);
        }
    }

    private static float remainingLife(int ticks, int duration, float partialTicks) {
        return MathHelper.clamp_float((ticks + 1F - partialTicks) / duration, 0F, 1F);
    }

    private static float smooth(float value) {
        return value * value * (3F - 2F * value);
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
            GL20.glDetachShader(shaderProgram, vertexShader);
            GL20.glDetachShader(shaderProgram, fragmentShader);
            GL20.glDeleteShader(vertexShader);
            GL20.glDeleteShader(fragmentShader);
            return true;
        } catch (Throwable throwable) {
            shaderUnavailable = true;
            shaderProgram = -1;
            FlansMod.logger.error("Failed to initialise the suppression screen shader. Using fallback vignette.", throwable);
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
                    0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer)null);
        }
    }

    private static void drawQuad(int width, int height) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0D, height, -90D, 0D, 0D);
        tessellator.addVertexWithUV(width, height, -90D, 1D, 0D);
        tessellator.addVertexWithUV(width, 0D, -90D, 1D, 1D);
        tessellator.addVertexWithUV(0D, 0D, -90D, 0D, 1D);
        tessellator.draw();
    }

    private static void renderFallback(Minecraft minecraft, float suppression,
                                       float nearIntensity, float hitIntensity) {
        ScaledResolution scaled = new ScaledResolution(minecraft,
                minecraft.displayWidth, minecraft.displayHeight);
        int width = scaled.getScaledWidth();
        int height = scaled.getScaledHeight();
        float edgeX = Math.max(36F, width * 0.22F);
        float edgeY = Math.max(28F, height * 0.25F);
        float nearAlpha = smooth(MathHelper.clamp_float(nearIntensity / 0.35F, 0F, 1F)) * 0.64F;
        float whiteAlpha = suppression * 0.22F;
        float redAlpha = FlansMod.showFlashesWhenWounded ? hitIntensity * 0.52F : 0F;

        minecraft.entityRenderer.setupOverlayRendering();
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glShadeModel(GL11.GL_SMOOTH);
            if (nearAlpha > 0F) {
                drawVignette(width, height, edgeX, edgeY, 0.018F, 0.015F, 0.013F, nearAlpha);
            }
            drawVignette(width, height, edgeX, edgeY, 1F, 1F, 1F, whiteAlpha);
            if (redAlpha > 0F) {
                drawVignette(width, height, edgeX, edgeY, 0.75F, 0F, 0F, redAlpha);
            }
        } finally {
            GL11.glPopAttrib();
            GL11.glColor4f(1F, 1F, 1F, 1F);
        }
    }

    private static void drawVignette(int width, int height, float edgeX, float edgeY,
                                     float red, float green, float blue, float alpha) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        addVertex(tessellator, 0, 0, red, green, blue, alpha);
        addVertex(tessellator, width, 0, red, green, blue, alpha);
        addVertex(tessellator, width, edgeY, red, green, blue, 0F);
        addVertex(tessellator, 0, edgeY, red, green, blue, 0F);
        addVertex(tessellator, 0, height - edgeY, red, green, blue, 0F);
        addVertex(tessellator, width, height - edgeY, red, green, blue, 0F);
        addVertex(tessellator, width, height, red, green, blue, alpha);
        addVertex(tessellator, 0, height, red, green, blue, alpha);
        addVertex(tessellator, 0, 0, red, green, blue, alpha);
        addVertex(tessellator, edgeX, 0, red, green, blue, 0F);
        addVertex(tessellator, edgeX, height, red, green, blue, 0F);
        addVertex(tessellator, 0, height, red, green, blue, alpha);
        addVertex(tessellator, width - edgeX, 0, red, green, blue, 0F);
        addVertex(tessellator, width, 0, red, green, blue, alpha);
        addVertex(tessellator, width, height, red, green, blue, alpha);
        addVertex(tessellator, width - edgeX, height, red, green, blue, 0F);
        tessellator.draw();
    }

    private static void addVertex(Tessellator tessellator, double x, double y,
                                  float red, float green, float blue, float alpha) {
        tessellator.setColorRGBA_F(red, green, blue, alpha);
        tessellator.addVertex(x, y, -90D);
    }
}
