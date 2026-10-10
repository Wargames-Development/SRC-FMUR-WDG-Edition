package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/** Revision 4. ModelM4A1 supplies the existing animation settings, not the active meshes.
 * Shared polygon data already includes all constructor flips and translations.
 * The gun, battery and emissive surfaces use one content-pack skin.
 */
public class ModelM4A1_Energy extends ModelM4A1 {
    private static final ResourceLocation CARRY_HANDLE_TEXTURE =
            new ResourceLocation("flansmod", "skins/M4A1_CarryHandle.png");
    private static final ResourceLocation GUN_TEXTURE =
            new ResourceLocation("flansmod", "skins/M4A1_Energy_Atlas.png");
    public final String[] energyObjectNames;

    public ModelM4A1_Energy() {
        super();
        List<ModelRendererTurbo> body = new ArrayList<ModelRendererTurbo>();
        List<ModelRendererTurbo> battery = new ArrayList<ModelRendererTurbo>();
        List<String> names = new ArrayList<String>();
        InputStream resource = getClass().getResourceAsStream("/assets/flansmod/models/m4a1_energy_r4.bin");
        if (resource == null) throw new IllegalStateException("Missing m4a1_energy_r4.bin");
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(resource))) {
            if (in.readInt() != 0x4D454734 || in.readInt() != 1) throw new IOException("Invalid rifle mesh header");
            int count = in.readInt();
            if (count < 1 || count > 4096) throw new IOException("Invalid rifle object count");
            for (int i = 0; i < count; i++) {
                String name = in.readUTF();
                boolean movingBattery = in.readBoolean();
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
                (movingBattery ? battery : body).add(part);
                names.add(name);
            }
            if (in.read() != -1) throw new IOException("Trailing rifle mesh data");
        } catch (IOException e) {
            throw new IllegalStateException("Cannot load M4A1 energy geometry", e);
        }
        gunModel = body.toArray(new ModelRendererTurbo[body.size()]);
        ammoModel = battery.toArray(new ModelRendererTurbo[battery.size()]);
        // Keep ModelM4A1's original carry handle from super().
        defaultStockModel = new ModelRendererTurbo[0];
        defaultGripModel = new ModelRendererTurbo[0];
        slideModel = new ModelRendererTurbo[0];
        hasFlash = true;
        flashScale = 1F;
        muzzleFlashPoint = new Vector3f(14.9F / 16F, 4.5F / 16F, 0F);
        gripIsOnPump = false;
        gripAttachPoint = new Vector3f(7.23F / 16F, 2.82F / 16F, 0F);
        energyObjectNames = names.toArray(new String[names.size()]);
    }

    @Override
    public void renderDefaultScope(float f) {
        Minecraft.getMinecraft().renderEngine.bindTexture(CARRY_HANDLE_TEXTURE);
        super.renderDefaultScope(f);
        Minecraft.getMinecraft().renderEngine.bindTexture(GUN_TEXTURE);
    }
}
