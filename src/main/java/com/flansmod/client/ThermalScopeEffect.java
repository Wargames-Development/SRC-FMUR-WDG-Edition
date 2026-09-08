package com.flansmod.client;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
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
            "uniform float modelDisplay;\n" +
			"uniform float thermalDisplay;\n" +
            "uniform float sourceAspect;\n" +
			"uniform vec2 sourceResolution;\n" +
            "uniform float modelMagnification;\n" +
            "varying vec2 textureCoordinate;\n" +
            "float luminance(vec3 color) {\n" +
            "    return dot(color, vec3(0.2126, 0.7152, 0.0722));\n" +
            "}\n" +
            "float noise(vec2 point) {\n" +
            "    return fract(sin(dot(point, vec2(12.9898, 78.233))) * 43758.5453);\n" +
            "}\n" +
            "void main() {\n" +
            "    vec2 uv = textureCoordinate;\n" +
            "    vec2 sourceUv = uv;\n" +
            "    sourceUv.x = 0.5 + (sourceUv.x - 0.5) / (max(sourceAspect, 1.0) * max(modelMagnification, 1.0));\n" +
            "    sourceUv.y = 0.5 + (sourceUv.y - 0.5) / max(modelMagnification, 1.0);\n" +
            "    sourceUv = mix(uv, sourceUv, modelDisplay);\n" +
            "    float frame = floor(elapsedTime * 9.0);\n" +
            "    float sensorFrame = frame * (1.0 - binocularDisplay);\n" +
			"    float horizontalJitter = (noise(vec2(sensorFrame, 17.0)) - 0.5) * 2.5 / max(resolution.x, 1.0) * (1.0 - binocularDisplay) * thermalDisplay;\n" +
            "    vec2 sensorUv = sourceUv + vec2(horizontalJitter, 0.0);\n" +
            "    vec3 scene = texture2D(sceneTexture, sourceUv).rgb;\n" +
            "    vec3 sensorScene = texture2D(sceneTexture, sensorUv).rgb;\n" +
			"    vec2 texel = 1.0 / max(sourceResolution, vec2(1.0));\n" +
			"    vec3 adjacent = texture2D(sceneTexture, sensorUv + vec2(texel.x, 0.0)).rgb\n" +
			"            + texture2D(sceneTexture, sensorUv - vec2(texel.x, 0.0)).rgb\n" +
			"            + texture2D(sceneTexture, sensorUv + vec2(0.0, texel.y)).rgb\n" +
			"            + texture2D(sceneTexture, sensorUv - vec2(0.0, texel.y)).rgb;\n" +
			"    sensorScene = clamp(sensorScene * 1.65 - adjacent * 0.1625, 0.0, 1.0);\n" +
            "    float gray = luminance(sensorScene);\n" +
            "    vec2 centered = abs(uv - vec2(0.5));\n" +
            "    vec2 lensPosition = (uv - vec2(0.5)) * resolution;\n" +
            "    float lensMask = step(length(lensPosition), resolution.y * 0.405);\n" +
            "    float scopeWindow = lensMask * step(centered.y, 0.16);\n" +
            "    float binocularWindow = step(centered.x, 0.419) * step(centered.y, 0.355);\n" +
            "    float thermalWindow = mix(mix(scopeWindow, binocularWindow, binocularDisplay), 1.0, modelDisplay);\n" +
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
			"    vec3 thermalSensor = mix(colorVideo, clamp(thermal, 0.0, 1.0), flirEnabled) * projectorLevel;\n" +
			"    vec3 sensor = mix(sensorScene, thermalSensor, thermalDisplay);\n" +
            "    vec3 outputColor = mix(scene, sensor, thermalWindow);\n" +
            "    float modelSensorWindow = step(abs(uv.y - 0.5), 0.28);\n" +
            "    vec3 modelLensColor = mix(vec3(0.0), sensor, modelSensorWindow);\n" +
			"    vec3 modelOutput = mix(sensor, modelLensColor, thermalDisplay);\n" +
			"    gl_FragColor = vec4(mix(outputColor, modelOutput, modelDisplay), 1.0);\n" +
            "}\n";

    private static final int MODEL_LENS_SIZE = 1024;
    private static Framebuffer heatFramebuffer;
    private static Framebuffer modelLensFramebuffer;
    private static Framebuffer scopedSceneFramebuffer;
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
    private static int modelDisplayUniform = -1;
	private static int thermalDisplayUniform = -1;
    private static int sourceAspectUniform = -1;
    private static int sourceResolutionUniform = -1;
    private static int modelMagnificationUniform = -1;
    private static boolean heatMaskValid;
    private static boolean sceneCaptured;
    private static boolean modelLensValid;
    private static boolean scopedSceneCaptured;
    private static boolean renderingScopedWorld;
    private static boolean shaderUnavailable;
    private static boolean flirEnabled = true;
    private static final long START_TIME = System.nanoTime();

    private ThermalScopeEffect() {
    }

    public static void captureHeatMask(float partialTicks) {
        boolean nestedScopedCapture = renderingScopedWorld;
        heatMaskValid = false;
        sceneCaptured = false;
        if (!nestedScopedCapture) {
            scopedSceneCaptured = false;
        }
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
            ensureSceneTexture(mc.displayWidth, mc.displayHeight);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, sceneTexture);
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0,
                    0, 0, mc.displayWidth, mc.displayHeight);
            sceneCaptured = true;

            ensureHeatFramebuffer(mc);
            GL20.glUseProgram(0);
            heatFramebuffer.bindFramebuffer(true);
            GL11.glClearColor(0F, 0F, 0F, 0F);
            GL11.glClearDepth(1D);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			if (hasThermalVision()) {
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

				heatFramebuffer.bindFramebuffer(true);
				GL20.glUseProgram(0);
				GL11.glEnable(GL11.GL_DEPTH_TEST);
				GL11.glDepthFunc(GL11.GL_LEQUAL);
				GL11.glDepthMask(true);
				GL11.glDisable(GL11.GL_BLEND);
				GL11.glColorMask(false, false, false, true);
				GL11.glColor4f(1F, 1F, 1F, 1F);
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

        if (!nestedScopedCapture && isModelLensDisplay()) {
            renderScopedWorld(mc, partialTicks);
        } else if (nestedScopedCapture) {
            scopedSceneCaptured = sceneCaptured && heatMaskValid;
        }
    }

    /**
     * Render the world once more at the optic's real magnification. Cropping the
     * normal view cannot reveal distant detail, regardless of lens texture size.
     */
    private static void renderScopedWorld(Minecraft mc, float partialTicks) {
        float magnification = getModelMagnification();
        if (magnification <= 1F) {
            return;
        }
        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        ensureScopedSceneFramebuffer(mc);
        Double previousZoom = ObfuscationReflectionHelper.getPrivateValue(
                EntityRenderer.class, mc.entityRenderer,
                "cameraZoom", "af", "field_78503_V");
        Framebuffer previousMainFramebuffer = ObfuscationReflectionHelper.getPrivateValue(
                Minecraft.class, mc, "framebufferMc", "field_147124_at");
        WorldRenderer[] worldRenderers = ObfuscationReflectionHelper.getPrivateValue(
                RenderGlobal.class, mc.renderGlobal,
                "worldRenderers", "field_72765_l");
        byte[] previousRendererVisibility = captureRendererVisibility(worldRenderers);
        Integer previousFrustumCheckOffset = ObfuscationReflectionHelper.getPrivateValue(
                RenderGlobal.class, mc.renderGlobal,
                "frustumCheckOffset", "field_72757_g");
        boolean previousHideGui = mc.gameSettings.hideGUI;
        boolean previousAdvancedOpenGl = mc.gameSettings.advancedOpengl;
        ScopeRenderCompatibility.RenderState compatibilityState =
                ScopeRenderCompatibility.beginSecondaryRender();
        if (!compatibilityState.isSecondaryRenderAllowed()) {
            ScopeRenderCompatibility.endSecondaryRender(compatibilityState);
            scopedSceneCaptured = false;
            return;
        }
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        try {
            renderingScopedWorld = true;
            mc.gameSettings.hideGUI = true;
            mc.gameSettings.advancedOpengl = false;
            ObfuscationReflectionHelper.setPrivateValue(Minecraft.class, mc,
                    scopedSceneFramebuffer, "framebufferMc", "field_147124_at");
            ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class,
                    mc.entityRenderer, (double)magnification,
                    "cameraZoom", "af", "field_78503_V");
            scopedSceneFramebuffer.bindFramebuffer(true);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            mc.entityRenderer.renderWorld(partialTicks,
                    System.nanoTime() + 16666666L);
        } finally {
            renderingScopedWorld = false;
            mc.gameSettings.hideGUI = previousHideGui;
            mc.gameSettings.advancedOpengl = previousAdvancedOpenGl;
            ObfuscationReflectionHelper.setPrivateValue(Minecraft.class, mc,
                    previousMainFramebuffer, "framebufferMc", "field_147124_at");
            ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class,
                    mc.entityRenderer, previousZoom == null ? 1D : previousZoom,
                    "cameraZoom", "af", "field_78503_V");
            restoreRendererVisibility(worldRenderers, previousRendererVisibility);
            if (previousFrustumCheckOffset != null) {
                ObfuscationReflectionHelper.setPrivateValue(RenderGlobal.class,
                        mc.renderGlobal, previousFrustumCheckOffset,
                        "frustumCheckOffset", "field_72757_g");
            }
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            GL20.glUseProgram(previousProgram);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopAttrib();
            ScopeRenderCompatibility.endSecondaryRender(compatibilityState);
        }
    }

    private static byte[] captureRendererVisibility(WorldRenderer[] renderers) {
        if (renderers == null) {
            return null;
        }
        byte[] visibility = new byte[renderers.length];
        for (int i = 0; i < renderers.length; i++) {
            if (renderers[i] != null) {
                visibility[i] = (byte)((renderers[i].isInFrustum ? 1 : 0)
                        | (renderers[i].isVisible ? 2 : 0)
                        | (renderers[i].isWaitingOnOcclusionQuery ? 4 : 0));
            }
        }
        return visibility;
    }

    private static void restoreRendererVisibility(WorldRenderer[] renderers,
                                                   byte[] visibility) {
        if (renderers == null || visibility == null) {
            return;
        }
        int count = Math.min(renderers.length, visibility.length);
        for (int i = 0; i < count; i++) {
            if (renderers[i] != null) {
                renderers[i].isInFrustum = (visibility[i] & 1) != 0;
                renderers[i].isVisible = (visibility[i] & 2) != 0;
                renderers[i].isWaitingOnOcclusionQuery = (visibility[i] & 4) != 0;
            }
        }
    }

    public static void render(Minecraft mc, float partialTicks) {
        if (!isActive(mc) || !sceneCaptured || !heatMaskValid || !ensureShader()) {
            return;
        }
        boolean modelDisplay = isModelLensDisplay();
        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        boolean modelMatricesPushed = false;
        try {
            if (modelDisplay) {
                ensureModelLensFramebuffer();
            }
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, sceneTexture);
            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, heatFramebuffer.framebufferTexture);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);

            int targetWidth = mc.displayWidth;
            int targetHeight = mc.displayHeight;
            if (modelDisplay) {
                modelLensFramebuffer.bindFramebuffer(true);
                GL11.glClearColor(0F, 0F, 0F, 1F);
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
                targetWidth = MODEL_LENS_SIZE;
                targetHeight = MODEL_LENS_SIZE;
                pushOrthoProjection(targetWidth, targetHeight);
                modelMatricesPushed = true;
            } else {
                mc.entityRenderer.setupOverlayRendering();
            }

            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL20.glUseProgram(shaderProgram);
            GL20.glUniform1i(sceneTextureUniform, 0);
            GL20.glUniform1i(heatMaskUniform, 1);
            GL20.glUniform2f(resolutionUniform, targetWidth, targetHeight);
            GL20.glUniform1f(elapsedTimeUniform,
                    (System.nanoTime() - START_TIME) / 1_000_000_000F);
            GL20.glUniform1f(flirEnabledUniform, flirEnabled ? 1F : 0F);
            GL20.glUniform1f(binocularDisplayUniform, isBinocularDisplay() ? 1F : 0F);
            GL20.glUniform1f(modelDisplayUniform, modelDisplay ? 1F : 0F);
			GL20.glUniform1f(thermalDisplayUniform, hasThermalVision() ? 1F : 0F);
            GL20.glUniform1f(sourceAspectUniform,
                    (float)mc.displayWidth / Math.max(mc.displayHeight, 1));
            GL20.glUniform2f(sourceResolutionUniform, mc.displayWidth, mc.displayHeight);
            float magnification = modelDisplay ? getModelMagnification() : 1F;
            GL20.glUniform1f(modelMagnificationUniform,
                    scopedSceneCaptured ? 1F : Math.max(1F, magnification));
            if (modelDisplay) {
                drawFullscreenQuad(targetWidth, targetHeight);
                GL20.glUseProgram(0);
                drawModelLensHud(mc, targetWidth, targetHeight);
                modelLensValid = true;
            } else {
                ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
                drawFullscreenQuad(scaled.getScaledWidth(), scaled.getScaledHeight());
            }
        } finally {
            if (modelMatricesPushed) {
                popOrthoProjection();
            }
            if (modelDisplay) {
                OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            }
            GL20.glUseProgram(previousProgram);
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glPopAttrib();
        }
    }

    private static boolean isActive(Minecraft mc) {
        return mc.thePlayer != null && mc.currentScreen == null
                && FlansModClient.zoomProgress > 0.9F
                && (hasThermalVision() || usesModelScopeLens(FlansModClient.currentScope));
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

    private static boolean isModelLensDisplay() {
		return usesModelScopeLens(FlansModClient.currentScope);
    }

    private static float getModelMagnification() {
        return FlansModClient.currentScope == null ? 1F
                : Math.max(1F, FlansModClient.lastZoomLevel
                * FlansModClient.currentScope.getFOVFactor() * 2F);
    }

	public static boolean usesModelScopeLens(IScope scope) {
		if (scope instanceof AttachmentType) {
			AttachmentType attachment = (AttachmentType)scope;
			return attachment.thermalOnModel || attachment.pictureInPicture;
		}
		return scope instanceof GunType && ((GunType)scope).pictureInPicture;
    }

    public static boolean isModelLensActive() {
        return isActive(Minecraft.getMinecraft()) && isModelLensDisplay();
    }

    public static boolean isRenderingScopedWorld() {
        return renderingScopedWorld;
    }

    public static int getModelLensTexture() {
        return modelLensValid && modelLensFramebuffer != null
                ? modelLensFramebuffer.framebufferTexture : -1;
    }

    public static boolean isFlirEnabled() {
        return flirEnabled;
    }

    public static boolean toggleFlir() {
        flirEnabled = !flirEnabled;
        return flirEnabled;
    }

    public static boolean isThermalScopeActive(Minecraft mc) {
		return isActive(mc) && hasThermalVision();
    }

    public static void renderStatus(Minecraft mc) {
        if (!isActive(mc) || isModelLensDisplay()) {
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

    private static void ensureModelLensFramebuffer() {
        if (modelLensFramebuffer == null) {
            modelLensFramebuffer = new Framebuffer(MODEL_LENS_SIZE, MODEL_LENS_SIZE, false);
            modelLensFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        } else if (modelLensFramebuffer.framebufferWidth != MODEL_LENS_SIZE
                || modelLensFramebuffer.framebufferHeight != MODEL_LENS_SIZE) {
            modelLensFramebuffer.createBindFramebuffer(MODEL_LENS_SIZE, MODEL_LENS_SIZE);
            modelLensFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, modelLensFramebuffer.framebufferTexture);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
    }

    private static void ensureScopedSceneFramebuffer(Minecraft mc) {
        if (scopedSceneFramebuffer == null) {
            scopedSceneFramebuffer = new Framebuffer(mc.displayWidth, mc.displayHeight, true);
            scopedSceneFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        } else if (scopedSceneFramebuffer.framebufferWidth != mc.displayWidth
                || scopedSceneFramebuffer.framebufferHeight != mc.displayHeight) {
            scopedSceneFramebuffer.createBindFramebuffer(mc.displayWidth, mc.displayHeight);
            scopedSceneFramebuffer.setFramebufferFilter(GL11.GL_LINEAR);
        }
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
        modelDisplayUniform = GL20.glGetUniformLocation(shaderProgram, "modelDisplay");
		thermalDisplayUniform = GL20.glGetUniformLocation(shaderProgram, "thermalDisplay");
        sourceAspectUniform = GL20.glGetUniformLocation(shaderProgram, "sourceAspect");
        sourceResolutionUniform = GL20.glGetUniformLocation(shaderProgram, "sourceResolution");
        modelMagnificationUniform = GL20.glGetUniformLocation(shaderProgram, "modelMagnification");
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

    private static void pushOrthoProjection(int width, int height) {
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho(0D, width, height, 0D, -1000D, 1000D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
    }

    private static void popOrthoProjection() {
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPopMatrix();
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPopMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
    }

    private static void drawModelLensHud(Minecraft mc, int width, int height) {
		if (!hasThermalVision()) {
			drawScopeReticle(mc, width, height);
			return;
		}

        String key = GameSettings.getKeyDisplayString(KeyInputHandler.thermalScopeKey.getKeyCode());
        String text = (flirEnabled ? "FLIR ON" : "FLIR OFF") + " [" + key + "]";

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        float textScale = width / 192F;
        GL11.glPushMatrix();
        GL11.glScalef(textScale, textScale, 1F);
        int scaledWidth = (int)(width / textScale);
        int textX = (scaledWidth - mc.fontRenderer.getStringWidth(text)) / 2;
        int textY = (int)(height * 0.14F / textScale);
        mc.fontRenderer.drawStringWithShadow(text, textX, textY,
                flirEnabled ? 0xFFF4D0 : 0xC9C9C9);
        GL11.glPopMatrix();

        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glColor4f(0.3F, 1F, 0.35F, 1F);
        float reticleScale = width / 768F;
        GL11.glLineWidth(5F);
        int centerX = width / 2;
        int centerY = height / 2;
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex2f(centerX - 112F * reticleScale, centerY);
        GL11.glVertex2f(centerX - 12F * reticleScale, centerY);
        GL11.glVertex2f(centerX + 12F * reticleScale, centerY);
        GL11.glVertex2f(centerX + 112F * reticleScale, centerY);
        GL11.glVertex2f(centerX, centerY + 12F * reticleScale);
        GL11.glVertex2f(centerX, centerY + 112F * reticleScale);
        for (int offset = 32; offset <= 80; offset += 16) {
            float scaledOffset = offset * reticleScale;
            float tick = 5F * reticleScale;
            GL11.glVertex2f(centerX - scaledOffset, centerY - tick);
            GL11.glVertex2f(centerX - scaledOffset, centerY + tick);
            GL11.glVertex2f(centerX + scaledOffset, centerY - tick);
            GL11.glVertex2f(centerX + scaledOffset, centerY + tick);
            GL11.glVertex2f(centerX - tick, centerY + scaledOffset);
            GL11.glVertex2f(centerX + tick, centerY + scaledOffset);
        }
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINE_LOOP);
        for (int index = 0; index < 24; index++) {
            double angle = Math.PI * 2D * index / 24D;
            GL11.glVertex2d(centerX + Math.cos(angle) * 9D * reticleScale,
                    centerY + Math.sin(angle) * 9D * reticleScale);
        }
        GL11.glEnd();
        GL11.glColor4f(1F, 1F, 1F, 1F);
    }

	private static void drawScopeReticle(Minecraft mc, int width, int height) {
		String reticle = getPictureInPictureReticle(FlansModClient.currentScope);
		if (reticle == null) {
			return;
		}

		mc.getTextureManager().bindTexture(FlansModResourceHandler.getScope(reticle));
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1F, 1F, 1F, 1F);
		float reticleScale = getPictureInPictureReticleScale(FlansModClient.currentScope);
		double left = width * (1D - reticleScale) * 0.5D;
		double top = height * (1D - reticleScale) * 0.5D;
		double right = left + width * reticleScale;
		double bottom = top + height * reticleScale;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(left, bottom, -89D, 0D, 1D);
		tessellator.addVertexWithUV(right, bottom, -89D, 1D, 1D);
		tessellator.addVertexWithUV(right, top, -89D, 1D, 0D);
		tessellator.addVertexWithUV(left, top, -89D, 0D, 0D);
		tessellator.draw();
	}

	private static String getPictureInPictureReticle(IScope scope) {
		if (scope instanceof AttachmentType) {
			return ((AttachmentType)scope).pictureInPictureReticle;
		}
		if (scope instanceof GunType) {
			return ((GunType)scope).pictureInPictureReticle;
		}
		return null;
	}

	private static float getPictureInPictureReticleScale(IScope scope) {
		if (scope instanceof AttachmentType) {
			return Math.max(0.1F, ((AttachmentType)scope).pictureInPictureReticleScale);
		}
		if (scope instanceof GunType) {
			return Math.max(0.1F, ((GunType)scope).pictureInPictureReticleScale);
		}
		return 1F;
	}
}
