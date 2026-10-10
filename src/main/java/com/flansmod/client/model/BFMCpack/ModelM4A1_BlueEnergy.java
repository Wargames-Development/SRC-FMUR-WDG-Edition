package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.common.vector.Vector3f;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/** Blue-energy conversion. ModelM4A1 supplies the existing animation settings, not the active meshes.
 * Shared polygon data already includes all constructor flips and translations.
 * The gun, battery and emissive surfaces use one content-pack skin.
 */
public class ModelM4A1_BlueEnergy extends ModelM4A1 {
    public final String[] energyObjectNames;

    public ModelM4A1_BlueEnergy() {
        super();
        List<List<ModelRendererTurbo>> roles = new ArrayList<List<ModelRendererTurbo>>();
        for (int i = 0; i < 5; i++) roles.add(new ArrayList<ModelRendererTurbo>());
        List<String> names = new ArrayList<String>();
        InputStream resource = getClass().getResourceAsStream("/assets/flansmod/models/m4a1_blue_energy.bin");
        if (resource == null) throw new IllegalStateException("Missing m4a1_blue_energy.bin");
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(resource))) {
            if (in.readInt() != 0x4D424531 || in.readInt() != 1) throw new IOException("Invalid rifle mesh header");
            int count = in.readInt();
            if (count < 1 || count > 4096) throw new IOException("Invalid rifle object count");
            for (int i = 0; i < count; i++) {
                String name = in.readUTF();
                int role = in.readUnsignedByte();
                if (role > 4) throw new IOException("Invalid model role");
                boolean glowing = in.readBoolean();
                int polygons = in.readInt();
                if (polygons < 0 || polygons > 100000) throw new IOException("Invalid polygon count");
                ModelRendererTurbo part = new ModelRendererTurbo(this, 0, 0, 2048, 2048);
                part.glow = glowing;
                for (int j = 0; j < polygons; j++) {
                    int corners = in.readUnsignedByte();
                    if (corners != 3 && corners != 4) throw new IOException("Invalid polygon size");
                    PositionTextureVertex[] vertices = new PositionTextureVertex[corners];
                    for (int k = 0; k < corners; k++) {
                        vertices[k] = new PositionTextureVertex(in.readFloat(), in.readFloat(), in.readFloat(), in.readFloat(), in.readFloat());
                    }
                    part.addPolygon(vertices);
                }
                roles.get(role).add(part);
                names.add(name);
            }
            if (in.read() != -1) throw new IOException("Trailing rifle mesh data");
        } catch (IOException e) {
            throw new IllegalStateException("Cannot load M4A1 energy geometry", e);
        }
        gunModel = roles.get(0).toArray(new ModelRendererTurbo[roles.get(0).size()]);
        ammoModel = roles.get(1).toArray(new ModelRendererTurbo[roles.get(1).size()]);
        defaultStockModel = roles.get(2).toArray(new ModelRendererTurbo[roles.get(2).size()]);
        defaultScopeModel = roles.get(3).toArray(new ModelRendererTurbo[roles.get(3).size()]);
        defaultGripModel = new ModelRendererTurbo[0];
        slideModel = roles.get(4).toArray(new ModelRendererTurbo[roles.get(4).size()]);
        hasFlash = true;
        flashScale = 1F;
        muzzleFlashPoint = new Vector3f(11.8F / 16F, 4.55F / 16F, 0F);
        gripIsOnPump = false;
        gripAttachPoint = new Vector3f(7.67F / 16F, 3.55F / 16F, 0F);
        barrelAttachPoint = new Vector3f(11.80F / 16F, 4.55F / 16F, 0F);
        energyObjectNames = names.toArray(new String[names.size()]);
    }
}
