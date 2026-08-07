package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ItemTeamArmour;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;

/** First-person view through the TaP Altyn face shield. */
@SideOnly(Side.CLIENT)
public final class AltynHelmetOverlay {
    private static final String VERTEX_SHADER =
            "#version 120\n" +
            "varying vec2 textureCoordinate;\n" +
            "void main() {\n" +
            "    gl_Position = ftransform();\n" +
            "    textureCoordinate = gl_MultiTexCoord0.xy;\n" +
            "}\n";

    private static final String FRAGMENT_SHADER =
            "#version 120\n" +
            "varying vec2 textureCoordinate;\n" +
            "void main() {\n" +
            "    vec2 point = textureCoordinate - vec2(0.5, 0.51);\n" +
            "    float horizontal = abs(point.x) / 0.485;\n" +
            "    float vertical = abs(point.y) / 0.345;\n" +
            "    float visorShape = pow(horizontal, 6.0) + pow(vertical, 6.0);\n" +
            "    float housing = smoothstep(0.70, 1.12, visorShape);\n" +
            "    float edgeShade = smoothstep(0.24, 0.90, visorShape) * 0.075;\n" +
            "    float glassShade = 0.025 + edgeShade;\n" +
            "    float alpha = mix(glassShade, 0.99, housing);\n" +
            "    gl_FragColor = vec4(0.002, 0.004, 0.003, alpha);\n" +
            "}\n";

    private static int shaderProgram = -1;
    private static boolean shaderUnavailable;

    private AltynHelmetOverlay() {
    }

    public static boolean shouldRender(Minecraft minecraft) {
        if (minecraft.thePlayer == null || minecraft.gameSettings.thirdPersonView != 0) {
            return false;
        }
        if (FlansModClient.currentScope != null
                && FlansModClient.currentScope.hasZoomOverlay()
                && minecraft.currentScreen == null
                && FlansModClient.zoomProgress > 0.9F) {
            return false;
        }
        ItemStack helmet = minecraft.thePlayer.inventory.armorInventory[3];
        if (helmet == null || !(helmet.getItem() instanceof ItemTeamArmour)) {
            return false;
        }
        ItemTeamArmour armour = (ItemTeamArmour)helmet.getItem();
        return armour.type != null && "altyn".equalsIgnoreCase(armour.type.shortName);
    }

    public static void render(Minecraft minecraft) {
        if (!shouldRender(minecraft)) {
            return;
        }

        ScaledResolution scaled = new ScaledResolution(minecraft,
                minecraft.displayWidth, minecraft.displayHeight);
        int width = scaled.getScaledWidth();
        int height = scaled.getScaledHeight();

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            minecraft.entityRenderer.setupOverlayRendering();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(1F, 1F, 1F, 1F);

            if (ensureShader()) {
                GL20.glUseProgram(shaderProgram);
                drawQuad(width, height);
                GL20.glUseProgram(0);
            } else {
                renderFallback(width, height);
            }
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
            GL20.glDetachShader(shaderProgram, vertexShader);
            GL20.glDetachShader(shaderProgram, fragmentShader);
            GL20.glDeleteShader(vertexShader);
            GL20.glDeleteShader(fragmentShader);
            return true;
        } catch (Throwable throwable) {
            shaderUnavailable = true;
            shaderProgram = -1;
            FlansMod.logger.error("Failed to initialise the Altyn visor shader. Using fallback mask.", throwable);
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

    private static void drawQuad(int width, int height) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0D, height, -90D, 0D, 0D);
        tessellator.addVertexWithUV(width, height, -90D, 1D, 0D);
        tessellator.addVertexWithUV(width, 0D, -90D, 1D, 1D);
        tessellator.addVertexWithUV(0D, 0D, -90D, 0D, 1D);
        tessellator.draw();
    }

    private static void renderFallback(int width, int height) {
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glColor4f(0F, 0F, 0F, 0.96F);
        drawSolidQuad(0, 0, width, height * 0.17F);
        drawSolidQuad(0, height * 0.84F, width, height);
        drawSolidQuad(0, height * 0.17F, width * 0.045F, height * 0.84F);
        drawSolidQuad(width * 0.955F, height * 0.17F, width, height * 0.84F);
    }

    private static void drawSolidQuad(float left, float top, float right, float bottom) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertex(left, bottom, -90D);
        tessellator.addVertex(right, bottom, -90D);
        tessellator.addVertex(right, top, -90D);
        tessellator.addVertex(left, top, -90D);
        tessellator.draw();
    }
}
