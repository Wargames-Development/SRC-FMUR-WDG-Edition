package com.flansmod.client;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

/** BFMC PiP reticles with switchable illumination on the represented optic. */
final class ScopeReticle {
    private static boolean red;

    private ScopeReticle() {}

    private static boolean supportsColor(String reticle) {
        if (reticle == null) return false;
        switch (FlansModResourceHandler.getScope(reticle).getResourcePath()) {
            case "gui/PIP/ELCAN.png":
            case "gui/PIP/pkas-ring.png":
            case "gui/PIP/PKS07.png":
            case "gui/PIP/PSO1.png":
            case "gui/PIP/pso1-etched.png":
                return true;
            default:
                return false;
        }
    }

    static boolean toggleColor() {
        if (!ThermalScopeEffect.isColorPictureInPictureDisplay()
                || !supportsColor(ThermalScopeEffect.getPictureInPictureReticle(FlansModClient.currentScope))) return false;
        red = !red;
        return true;
    }

    static boolean beginTexture(String reticle) {
        if (!supportsColor(reticle)) {
            GL11.glColor4f(1F, 1F, 1F, 1F);
            return false;
        }

        GL11.glPushAttrib(GL11.GL_TEXTURE_BIT);
        // Replace the ink color while preserving the etched shape and edge transparency.
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_TEXTURE_ENV_MODE, GL13.GL_COMBINE);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_COMBINE_RGB, GL11.GL_REPLACE);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_SOURCE0_RGB, GL13.GL_PRIMARY_COLOR);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_OPERAND0_RGB, GL11.GL_SRC_COLOR);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_RGB_SCALE, 1);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_COMBINE_ALPHA, GL11.GL_MODULATE);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_SOURCE0_ALPHA, GL11.GL_TEXTURE);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_SOURCE1_ALPHA, GL13.GL_PRIMARY_COLOR);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_OPERAND0_ALPHA, GL11.GL_SRC_ALPHA);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL13.GL_OPERAND1_ALPHA, GL11.GL_SRC_ALPHA);
        GL11.glTexEnvi(GL11.GL_TEXTURE_ENV, GL11.GL_ALPHA_SCALE, 1);
        GL11.glColor4f(red ? 1F : 0F, 0F, 0F, 1F);
        return true;
    }
}
