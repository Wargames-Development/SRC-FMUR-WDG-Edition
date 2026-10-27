package com.flansmod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import org.lwjgl.opengl.*;

/** Matches the context's FBO entry points; EXT blit is not a requirement for thermal scopes. */
@SideOnly(Side.CLIENT)
final class ThermalFramebuffers {
    private static int depthTexture;
    private static int depthWidth, depthHeight;
    private static String lastFailure = "";
    private ThermalFramebuffers() { }
    static String lastFailure() { return lastFailure; }
    static int depthTexture() { return depthTexture; }

    static int create() {
        ContextCapabilities caps = GLContext.getCapabilities();
        return caps.OpenGL30 ? GL30.glGenFramebuffers() : caps.GL_ARB_framebuffer_object
                ? ARBFramebufferObject.glGenFramebuffers() : EXTFramebufferObject.glGenFramebuffersEXT();
    }

    static void delete(int framebuffer) {
        ContextCapabilities caps = GLContext.getCapabilities();
        if (caps.OpenGL30) GL30.glDeleteFramebuffers(framebuffer);
        else if (caps.GL_ARB_framebuffer_object) ARBFramebufferObject.glDeleteFramebuffers(framebuffer);
        else EXTFramebufferObject.glDeleteFramebuffersEXT(framebuffer);
    }

    static void attach(int attachment, int texture) {
        ContextCapabilities caps = GLContext.getCapabilities();
        if (caps.OpenGL30) GL30.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER, attachment, GL11.GL_TEXTURE_2D, texture, 0);
        else if (caps.GL_ARB_framebuffer_object) ARBFramebufferObject.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER, attachment, GL11.GL_TEXTURE_2D, texture, 0);
        else EXTFramebufferObject.glFramebufferTexture2DEXT(GL30.GL_FRAMEBUFFER, attachment, GL11.GL_TEXTURE_2D, texture, 0);
    }

    static boolean isAvailable() {
        ContextCapabilities caps = GLContext.getCapabilities();
        return caps.OpenGL30 || caps.GL_ARB_framebuffer_object || caps.GL_EXT_framebuffer_object;
    }

    static boolean canBlit() {
        ContextCapabilities caps = GLContext.getCapabilities();
        return caps.OpenGL30 || caps.GL_ARB_framebuffer_object
                || caps.GL_EXT_framebuffer_object && caps.GL_EXT_framebuffer_blit;
    }

    static void bind(int target, int framebuffer) {
        ContextCapabilities caps = GLContext.getCapabilities();
        if (caps.OpenGL30) GL30.glBindFramebuffer(target, framebuffer);
        else if (caps.GL_ARB_framebuffer_object) ARBFramebufferObject.glBindFramebuffer(target, framebuffer);
        else EXTFramebufferObject.glBindFramebufferEXT(target, framebuffer);
    }

    static void blit(int x0, int y0, int x1, int y1, int dx0, int dy0, int dx1, int dy1, int mask, int filter) {
        ContextCapabilities caps = GLContext.getCapabilities();
        if (caps.OpenGL30) GL30.glBlitFramebuffer(x0,y0,x1,y1,dx0,dy0,dx1,dy1,mask,filter);
        else if (caps.GL_ARB_framebuffer_object) ARBFramebufferObject.glBlitFramebuffer(x0,y0,x1,y1,dx0,dy0,dx1,dy1,mask,filter);
        else EXTFramebufferBlit.glBlitFramebufferEXT(x0,y0,x1,y1,dx0,dy0,dx1,dy1,mask,filter);
    }

    /** GPU-only depth copy also works on EXT FBO contexts without any blit extension.
     * Copying to a texture avoids blit's identical-depth-format requirement with
     * packed depth/stencil or floating-point scene attachments. One mask owns this texture. */
    static boolean copyDepth(int source, int target, int width, int height) {
        if (!isAvailable() || source == target || width < 1 || height < 1) {
            lastFailure = "unsupported framebuffer or invalid depth-copy target";
            return false;
        }
        boolean separate = canBlit();
        int oldDraw = GL11.glGetInteger(GL30.GL_DRAW_FRAMEBUFFER_BINDING);
        int oldRead = separate ? GL11.glGetInteger(GL30.GL_READ_FRAMEBUFFER_BINDING) : oldDraw;
        int oldActive = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        int oldTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        try {
            bind(GL30.GL_FRAMEBUFFER, source);
            if (source == 0 ? GL11.glGetInteger(GL11.GL_DEPTH_BITS) == 0 : depthAttachmentType() == GL11.GL_NONE) {
                lastFailure = "scene framebuffer has no depth attachment";
                return false;
            }
            if (GL11.glGetInteger(GL13.GL_SAMPLES) > 0) {
                lastFailure = "multisampled scene depth requires a resolved framebuffer";
                return false;
            }
            if (depthTexture == 0) depthTexture = GL11.glGenTextures();
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, depthTexture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
            if (depthWidth != width || depthHeight != height) {
                GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL14.GL_DEPTH_COMPONENT24, width, height,
                        0, GL11.GL_DEPTH_COMPONENT, GL11.GL_UNSIGNED_INT, (java.nio.ByteBuffer)null);
                depthWidth = width; depthHeight = height;
            }
            GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0, 0, 0, width, height);
            bind(GL30.GL_FRAMEBUFFER, target);
            // Forge/Angelica may allocate packed depth/stencil on vanilla FBOs.
            // A new depth image must not coexist with that old stencil image.
            attach(GL30.GL_STENCIL_ATTACHMENT, 0);
            attach(GL30.GL_DEPTH_ATTACHMENT, depthTexture);
            int status = status();
            boolean valid = status == GL30.GL_FRAMEBUFFER_COMPLETE;
            lastFailure = valid ? "" : "heat framebuffer status 0x" + Integer.toHexString(status);
            return valid;
        } finally {
            if (separate) {
                bind(GL30.GL_READ_FRAMEBUFFER, oldRead);
                bind(GL30.GL_DRAW_FRAMEBUFFER, oldDraw);
            } else bind(GL30.GL_FRAMEBUFFER, oldDraw);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, oldTexture);
            GL13.glActiveTexture(oldActive);
        }
    }

    private static int depthAttachmentType() {
        ContextCapabilities caps = GLContext.getCapabilities();
        int target = GL30.GL_FRAMEBUFFER, attachment = GL30.GL_DEPTH_ATTACHMENT,
                parameter = GL30.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE;
        if (caps.OpenGL30) return GL30.glGetFramebufferAttachmentParameteri(target, attachment, parameter);
        if (caps.GL_ARB_framebuffer_object) return ARBFramebufferObject.glGetFramebufferAttachmentParameteri(target, attachment, parameter);
        return EXTFramebufferObject.glGetFramebufferAttachmentParameteriEXT(target, attachment, parameter);
    }

    static int status() {
        ContextCapabilities caps = GLContext.getCapabilities();
        return caps.OpenGL30 ? GL30.glCheckFramebufferStatus(GL30.GL_FRAMEBUFFER)
                : caps.GL_ARB_framebuffer_object ? ARBFramebufferObject.glCheckFramebufferStatus(GL30.GL_FRAMEBUFFER)
                : EXTFramebufferObject.glCheckFramebufferStatusEXT(GL30.GL_FRAMEBUFFER);
    }
}
