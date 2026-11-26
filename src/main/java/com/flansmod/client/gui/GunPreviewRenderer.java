package com.flansmod.client.gui;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.model.RenderGun;
import com.flansmod.client.model.BFMCpack.ModelSketchfabGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.Map;
import java.util.WeakHashMap;

/** Renders the actual gun and its installed attachments in a bounded preview. */
public final class GunPreviewRenderer {
    private static final Map<ModelGun, float[]> BOUNDS = new WeakHashMap<>();
    private static final Map<ModelAttachment, float[]> ATTACHMENT_BOUNDS = new WeakHashMap<>();
    private static final String[] MOUNTS = {"barrel", "scope", "stock", "grip", "gadget", "slide", "pump", "accessory"};

    private float yaw, pitch = 160F, zoom = 1F;
    private int mouseX, mouseY;
    private boolean dragging;
    private float x, y, scale, modelScale, centerX, centerY, centerZ;
    private float sinYaw, cosYaw, sinPitch, cosPitch;
    private final float[] fittedBounds = new float[6];

    GunPreviewRenderer(float yaw) {
        this.yaw = yaw;
    }

    void beginDrag(int x, int y) {
        mouseX = x;
        mouseY = y;
        dragging = true;
    }

    void drag(int x, int y) {
        yaw = (yaw + (x - mouseX) * 0.6F) % 360F;
        pitch = Math.max(20F, Math.min(340F, pitch + (y - mouseY) * 0.6F));
        mouseX = x;
        mouseY = y;
    }

    boolean isDragging() {
        return dragging;
    }

    void endDrag() {
        dragging = false;
    }

    void zoom(int wheel) {
        zoom = Math.max(0.5F, Math.min(2.5F, zoom * (wheel > 0 ? 1.1F : 0.9F)));
    }

    void render(ItemStack stack, GunType type, float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        modelScale = type.modelScale;
        sinYaw = (float) Math.sin(Math.toRadians(yaw));
        cosYaw = (float) Math.cos(Math.toRadians(yaw));
        sinPitch = (float) Math.sin(Math.toRadians(pitch));
        cosPitch = (float) Math.cos(Math.toRadians(pitch));
        fit(stack, type, width, height);

        float lightX = OpenGlHelper.lastBrightnessX, lightY = OpenGlHelper.lastBrightnessY;
        float adsProgress = RenderGun.actualZoomProgress;
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_DEPTH_BUFFER_BIT | GL11.GL_LIGHTING_BIT | GL11.GL_CURRENT_BIT);
        GL11.glPushMatrix();
        try {
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(true);
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
            RenderHelper.enableStandardItemLighting();
            GL11.glColor4f(1F, 1F, 1F, 1F);
            GL11.glTranslatef(x, y, 100F);
            GL11.glRotatef(pitch, 1F, 0F, 0F);
            GL11.glRotatef(yaw, 0F, 1F, 0F);
            GL11.glScalef(-scale, scale, scale);
            GL11.glTranslatef(-centerX, -centerY, -centerZ);
            RenderGun.actualZoomProgress = 0F;
            ClientProxy.gunRenderer.renderGun(stack, type, 1F / 16F, type.model,
                    GunAnimations.defaults, 0F, IItemRenderer.ItemRenderType.ENTITY);
        } finally {
            RenderGun.actualZoomProgress = adsProgress;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightX, lightY);
            GL11.glPopMatrix();
            GL11.glPopAttrib();
        }
    }

    private void fit(ItemStack stack, GunType type, float width, float height) {
        System.arraycopy(bounds(type.model), 0, fittedBounds, 0, fittedBounds.length);
        for (int i = 0; i < MOUNTS.length; i++) {
            boolean opposite = i == 4 && type.isGadgetOnOppositeRail(stack);
            Vector3f mount = opposite ? type.model.getGadgetAttachPoint(true) : mountPoint(type.model, i);
            if (mount == null) continue;
            AttachmentType attachment = type.getAttachment(stack, MOUNTS[i]);
            if (attachment == null || attachment.model == null) continue;
            float[] bounds = ATTACHMENT_BOUNDS.get(attachment.model);
            if (bounds == null) {
                bounds = partBounds(attachment.model.attachmentModel, attachment.model.ammoModel);
                ATTACHMENT_BOUNDS.put(attachment.model, bounds);
            }
            float factor = attachment.modelScale / modelScale;
            if (i == 1 && type.model instanceof ModelSketchfabGun) factor *= 0.65F;
            extend(0, mount.x * 16F, bounds, factor);
            extend(2, mount.y * 16F, bounds, factor);
            extend(4, mount.z * 16F, bounds, opposite ? -factor : factor);
        }
        centerX = (fittedBounds[0] + fittedBounds[1]) * modelScale / 32F;
        centerY = (fittedBounds[2] + fittedBounds[3]) * modelScale / 32F;
        centerZ = (fittedBounds[4] + fittedBounds[5]) * modelScale / 32F;
        float unit = Math.abs(modelScale) / 16F;
        float length = Math.max(1F, fittedBounds[1] - fittedBounds[0]) * unit;
        float tall = Math.max(1F, fittedBounds[3] - fittedBounds[2]) * unit;
        float deep = Math.max(1F, fittedBounds[5] - fittedBounds[4]) * unit;
        // Use the neutral side view for scale so other poses can extend past the scissor.
        scale = Math.min(0.77F * width / length, 0.75F * height / Math.max(tall, deep)) * zoom;
    }

    private void extend(int axis, float origin, float[] bounds, float factor) {
        float first = origin + bounds[axis] * factor;
        float second = origin + bounds[axis + 1] * factor;
        fittedBounds[axis] = Math.min(fittedBounds[axis], Math.min(first, second));
        fittedBounds[axis + 1] = Math.max(fittedBounds[axis + 1], Math.max(first, second));
    }

    void projectMount(Vector3f mount, float[] point) {
        // Apply the same model scaling, mirroring and rotation used for the preview.
        float mx = -(mount.x * modelScale - centerX) * scale;
        float my = (mount.y * modelScale - centerY) * scale;
        float mz = (mount.z * modelScale - centerZ) * scale;
        point[0] = x + cosYaw * mx + sinYaw * mz;
        point[1] = y + cosPitch * my - sinPitch * (-sinYaw * mx + cosYaw * mz);
    }

    static Vector3f mountPoint(ModelGun model, int index) {
        switch (index) {
            case 0: return model.barrelAttachPoint;
            case 1: return model.scopeAttachPoint;
            case 2: return model.stockAttachPoint;
            case 3: return model.gripAttachPoint;
            case 4: return model.gadgetAttachPoint;
            case 5: return model.slideAttachPoint;
            case 6: return model.pumpAttachPoint;
            default: return model.accessoryAttachPoint;
        }
    }

    private static float[] bounds(ModelGun model) {
        float[] result = BOUNDS.get(model);
        if (result != null) return result;
        result = partBounds(model.gunModel, model.defaultBarrelModel, model.defaultStockModel,
                model.defaultScopeModel, model.defaultGripModel, model.defaultGadgetModel, model.ammoModel,
                model.slideModel, model.pumpModel, model.attachmentScopeModel, model.attachmentGripModel,
                model.attachmentBarrelModel, model.attachmentStockModel, model.attachmentGadgetModel);
        BOUNDS.put(model, result);
        return result;
    }

    private static float[] partBounds(ModelRendererTurbo[]... parts) {
        float[] result = {Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY,
                Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY,
                Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY};
        for (ModelRendererTurbo[] group : parts) {
            if (group == null) continue;
            for (ModelRendererTurbo part : group) {
                if (part != null) part.includeVertexBounds(result);
            }
        }
        if (result[0] == Float.POSITIVE_INFINITY) {
            result = new float[]{-8F, 8F, -8F, 8F, -8F, 8F};
        }
        return result;
    }
}
