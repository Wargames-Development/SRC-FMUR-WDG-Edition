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

/** G36 rifle conversion of the bundled MG36. */
public class ModelMG36 extends ModelGun {
    public ModelMG36() {
        loadGeometry();
        scopeAttachPoint = new Vector3f(3.2F / 16F, 6.41F / 16F, 0F);
        gripAttachPoint = new Vector3f(11.5F / 16F, 3.4F / 16F, 0F);
        barrelAttachPoint = new Vector3f(16.3F / 16F, 4.5F / 16F, 0F);
        gadgetAttachPoint = new Vector3f(12F / 16F, 4.25F / 16F, -1.39F / 16F);
        accessoryAttachPoint = new Vector3f(10.8F / 16F, 4.25F / 16F, -1.39F / 16F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, 0F, -0.1875F);
        translateClip = new Vector3f(0F, -0.63F, 0F);
        gunSlideDistance = 0.15F;
        hasFlash = true;
        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(17.85F / 16F, 4.5F / 16F, 0F);
        hasArms = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0D, 0.2D);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        // This definition uses legacy arm transforms, not GLTF pixel offsets.
        // Extend the pack's conventional support-hand pose toward the fore-end.
        leftArmPos = new Vector3f(0.16F, -0.27F, -0.02F);
        leftArmRot = new Vector3f(78F, 48F, 0F);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        leftArmReloadPos = new Vector3f(0.05F, -0.55F, 0.05F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0F);
        rightArmRot = new Vector3f(0F, 0F, -85F);
        rightArmScale = new Vector3f(0.75D, 1D, 0.75D);
        rightArmReloadPos = new Vector3f(0.25F, -0.52F, 0F);
        rightArmReloadRot = new Vector3f(0F, 0F, -85F);
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;
        casingAttachPoint = new Vector3f(3F / 16F, 4.6F / 16F, 0.86F / 16F);
        casingAnimDistance = new Vector3f(0F, 3F, 7.75F);
        casingAnimSpread = new Vector3f(3F, 5F, 3F);
        casingAnimTime = 5;
        casingRotateVector = new Vector3f(0.1F, 0F, 0.1F);
        caseScale = 0.2F;
        thirdPersonOffset = new Vector3f(-0.05F, -0.04F, 0F);
        // A reflected third-person model would reverse the receiver lettering.
        mirrorThirdPerson = false;
        zoomOffsetY = -0.052F;
        zoomOffset = 0.2F;
        // RenderGun scales flash space before translating its anchor.
        muzzleFlashPoint.scale(1F / flashScale);
    }

    private void loadGeometry() {
        List<List<ModelRendererTurbo>> groups = new ArrayList<List<ModelRendererTurbo>>();
        for (int i = 0; i < 5; i++) groups.add(new ArrayList<ModelRendererTurbo>());
        InputStream resource = getClass().getResourceAsStream("/assets/flansmod/models/mg36_custom.bin");
        if (resource == null) throw new IllegalStateException("Missing mg36_custom.bin");
        // As with the pack's M4A1 energy mesh, these are final TMT coordinates.
        // No OBJ axis swaps, normal transforms, or constructor flips are needed.
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(resource))) {
            if (in.readInt() != 0x4D473336 || in.readInt() != 1)
                throw new IOException("Invalid MG36 mesh header");
            int count = in.readInt();
            if (count < 1 || count > 128) throw new IOException("Invalid MG36 part count");
            for (int i = 0; i < count; i++) {
                in.readUTF();
                int group = in.readUnsignedByte();
                int polygons = in.readInt();
                if (group >= groups.size() || polygons < 1 || polygons > 20000)
                    throw new IOException("Invalid MG36 part");
                ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, 1024, 1024);
                for (int j = 0; j < polygons; j++) {
                    int corners = in.readUnsignedByte();
                    if (corners != 3) throw new IOException("Invalid MG36 triangle");
                    PositionTextureVertex[] vertices = new PositionTextureVertex[corners];
                    for (int k = 0; k < corners; k++)
                        vertices[k] = new PositionTextureVertex(in.readFloat(), in.readFloat(),
                                in.readFloat(), in.readFloat(), in.readFloat());
                    part.addPolygon(vertices);
                }
                groups.get(group).add(part);
            }
            if (in.read() != -1) throw new IOException("Trailing MG36 mesh data");
        } catch (IOException e) {
            throw new IllegalStateException("Cannot load MG36 geometry", e);
        }
        gunModel = groups.get(0).toArray(new ModelRendererTurbo[groups.get(0).size()]);
        ammoModel = groups.get(1).toArray(new ModelRendererTurbo[groups.get(1).size()]);
        slideModel = groups.get(2).toArray(new ModelRendererTurbo[groups.get(2).size()]);
        defaultBarrelModel = groups.get(3).toArray(new ModelRendererTurbo[groups.get(3).size()]);
        defaultScopeModel = groups.get(4).toArray(new ModelRendererTurbo[groups.get(4).size()]);
    }
}

