package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.common.vector.Vector3f;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/** Native TMT adaptation of the credited VHS-2 reference; coordinates match FAMAS. */
public class ModelVHS2 extends ModelGun {
    public ModelVHS2() {
        loadGeometry();
        scopeAttachPoint = new Vector3f(1.7F / 16F, 6.78F / 16F, 0F);
        gripAttachPoint = new Vector3f(7.1F / 16F, 3.46F / 16F, 0F);
        barrelAttachPoint = new Vector3f(10.48F / 16F, 4.5F / 16F, 0F);
        gadgetAttachPoint = new Vector3f(7F / 16F, 4.36F / 16F, -1.134F / 16F);
        accessoryAttachPoint = new Vector3f(5.7F / 16F, 4.36F / 16F, -1.134F / 16F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, 0F, -0.1875F);
        translateClip = new Vector3f(0F, -0.63F, 0F);
        gunSlideDistance = 0.15F;
        hasFlash = true;
        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(13F / 16F, 4.5F / 16F, 0F);
        hasArms = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0D, 0.2D);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        leftArmPos = new Vector3f(0.04F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(78F, 48F, 0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        leftArmReloadPos = new Vector3f(-0.45F, -1.05F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0F);
        rightArmRot = new Vector3f(0F, 0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1D, 0.75D);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0F);
        rightArmReloadRot = new Vector3f(0F, 0F, -85F);
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;
        casingAttachPoint = new Vector3f(-2.8F / 16F, 4.7F / 16F, 1.0395F / 16F);
        casingAnimDistance = new Vector3f(0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0.1F, 0F, 0.1F);
        caseScale = 0.2F;
        thirdPersonOffset = new Vector3f(-0.05F, -0.04F, 0F);
        zoomOffsetY = -0.065F;
        zoomOffset = 0.2F;
        gunOffset = -0.5F;
        gunOffsetX = -3.5F;
        // Move the rifle forward relative to the established FAMAS hand pose.
        // Attachment, flash and casing anchors start in blocks rather than pixels.
        float forward = 1.5F;
        translateAll(forward, 0F, 0F);
        for (Vector3f point : new Vector3f[]{scopeAttachPoint, gripAttachPoint,
                barrelAttachPoint, gadgetAttachPoint, accessoryAttachPoint,
                muzzleFlashPoint, casingAttachPoint}) {
            point.x += forward / 16F;
        }
        // RenderGun scales flash space before translating its anchor.
        muzzleFlashPoint.scale(1F / flashScale);
    }

    private void loadGeometry() {
        List<List<ModelRendererTurbo>> groups = new ArrayList<List<ModelRendererTurbo>>();
        for (int i = 0; i < 5; i++) groups.add(new ArrayList<ModelRendererTurbo>());
        InputStream resource = getClass().getResourceAsStream("/assets/flansmod/models/vhs2_custom.bin");
        if (resource == null) throw new IllegalStateException("Missing vhs2_custom.bin");
        // As with the pack's M4A1 energy mesh, these are final TMT coordinates.
        // No OBJ axis swaps, normal transforms, or constructor flips are needed.
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(resource))) {
            if (in.readInt() != 0x56485332 || in.readInt() != 1)
                throw new IOException("Invalid VHS-2 mesh header");
            int count = in.readInt();
            if (count < 1 || count > 128) throw new IOException("Invalid VHS-2 part count");
            for (int i = 0; i < count; i++) {
                in.readUTF();
                int group = in.readUnsignedByte();
                int polygons = in.readInt();
                if (group >= groups.size() || polygons < 1 || polygons > 20000)
                    throw new IOException("Invalid VHS-2 part");
                ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, 2048, 2048);
                for (int j = 0; j < polygons; j++) {
                    int corners = in.readUnsignedByte();
                    if (corners != 3) throw new IOException("Invalid VHS-2 triangle");
                    PositionTextureVertex[] vertices = new PositionTextureVertex[corners];
                    for (int k = 0; k < corners; k++)
                        vertices[k] = new PositionTextureVertex(in.readFloat(), in.readFloat(),
                                in.readFloat(), in.readFloat(), in.readFloat());
                    part.addPolygon(vertices);
                }
                groups.get(group).add(part);
            }
            if (in.read() != -1) throw new IOException("Trailing VHS-2 mesh data");
        } catch (IOException e) {
            throw new IllegalStateException("Cannot load VHS-2 geometry", e);
        }
        gunModel = groups.get(0).toArray(new ModelRendererTurbo[groups.get(0).size()]);
        ammoModel = groups.get(1).toArray(new ModelRendererTurbo[groups.get(1).size()]);
        slideModel = groups.get(2).toArray(new ModelRendererTurbo[groups.get(2).size()]);
        defaultBarrelModel = groups.get(3).toArray(new ModelRendererTurbo[groups.get(3).size()]);
        defaultScopeModel = groups.get(4).toArray(new ModelRendererTurbo[groups.get(4).size()]);
    }
}
