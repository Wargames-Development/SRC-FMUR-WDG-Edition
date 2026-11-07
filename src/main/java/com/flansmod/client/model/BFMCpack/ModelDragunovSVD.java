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

public class ModelDragunovSVD extends ModelGun {
    private static final float MODEL_SCALE = 1.35F;
    private static final float PIXEL = 1F / (16F * MODEL_SCALE);

    public ModelDragunovSVD() {
        loadGeometry();
        // Bring the grip forward to the firing hand, including the moving groups and anchors.
        float forward = 4F;
        translateAll(forward / MODEL_SCALE, 0F, 0F);
        scopeAttachPoint = new Vector3f((forward - 1.35F) * PIXEL, 6.23F * PIXEL, 0F);
        barrelAttachPoint = new Vector3f((forward + 18.05F) * PIXEL, 5.86F * PIXEL, 0F);
        flashScale = 0.4F;
        muzzleFlashPoint = new Vector3f(barrelAttachPoint);
        muzzleFlashPoint.scale(1F / flashScale);
        hasFlash = true;
        gunSlideDistance = 0.055F;
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15F;
        tiltGun = 30F;
        translateGun = new Vector3f(0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0F, -0.625F, 0F);

        hasArms = true;
        fancyStance = true;
        stanceTranslate = new Vector3f(0.2F, 0F, 0.2F);
        stanceRotate = new Vector3f(20F, -20F, 0F);
        leftArmPos = new Vector3f(0.101F, -0.472F, -0.245F);
        leftArmRot = new Vector3f(80F, 35F, 0F);
        leftArmScale = new Vector3f(0.75F, 1.1F, 0.75F);
        leftArmReloadPos = new Vector3f(-0.096F, -0.521F, -0.194F);
        leftArmReloadRot = new Vector3f(80F, 50F, 0F);
        rightArmPos = new Vector3f(0.095F, -0.636F, 0.029F);
        rightArmRot = new Vector3f(0F, 0F, -85F);
        rightArmScale = new Vector3f(0.75F, 1F, 0.75F);
        rightArmReloadPos = new Vector3f(rightArmPos);
        rightArmReloadRot = new Vector3f(rightArmRot);
        leftHandAmmo = true;
        leftHandAmmoReloadOnly = true;
        thirdPersonOffset = new Vector3f(0F, -0.12F, 0F);
        // Keep the PSO-1 on the left and the charging handle on the right.
        mirrorThirdPerson = false;
        // Keep the scope at the same eye relief when the player aims down sights.
        zoomOffset = -0.08F + forward / 16F;
        zoomOffsetY = -0.0775F;
    }

    private void loadGeometry() {
        InputStream mesh = getClass().getResourceAsStream("/assets/flansmod/models/dragunov_custom.bin");
        if (mesh == null) throw new IllegalStateException("Missing dragunov_custom.bin");
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(mesh))) {
            if (in.readInt() != 0x53564431 || in.readInt() != 1)
                throw new IOException("Invalid Dragunov mesh header");
            gunModel = readGroup(in);
            ammoModel = readGroup(in);
            slideModel = readGroup(in);
            defaultScopeModel = readGroup(in);
            if (in.read() != -1) throw new IOException("Trailing Dragunov mesh data");
        } catch (IOException e) {
            throw new IllegalStateException("Cannot load Dragunov geometry", e);
        }
    }

    private ModelRendererTurbo[] readGroup(DataInputStream in) throws IOException {
        int triangles = in.readInt();
        if (triangles < 1 || triangles > 12000) throw new IOException("Invalid Dragunov triangle count");
        ModelRendererTurbo group = new ModelRendererTurbo(this, 0, 0, 512, 512);
        for (int i = 0; i < triangles; i++) {
            PositionTextureVertex[] vertices = new PositionTextureVertex[3];
            for (int j = 0; j < vertices.length; j++) {
                vertices[j] = new PositionTextureVertex(in.readFloat(), in.readFloat(),
                        in.readFloat(), in.readFloat(), in.readFloat());
            }
            group.addPolygon(vertices);
        }
        return new ModelRendererTurbo[]{group};
    }
}
