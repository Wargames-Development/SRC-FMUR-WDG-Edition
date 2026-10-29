import com.flansmod.client.model.ModelGun;
import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.client.tmt.TexturedPolygon;
import com.flansmod.common.vector.Vector3f;
import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

/** Exports the actual TMT geometry without starting an OpenGL renderer. */
public final class VHS2GeometryCheck {
    public static void main(String[] args) throws Exception {
        File output = new File(args[0]);
        output.mkdirs();
        Field polygons = ModelRendererTurbo.class.getDeclaredField("faces");
        polygons.setAccessible(true);
        for (String name : new String[]{"M4A1", "FAMAS", "HK416", "VHS2"}) {
            ModelGun model = (ModelGun) Class.forName(
                    "com.flansmod.client.model.BFMCpack.Model" + name).newInstance();
            if (name.equals("VHS2") && (model.ammoModel.length == 0 || model.slideModel.length == 0
                    || model.defaultBarrelModel.length == 0 || model.defaultScopeModel.length == 0))
                throw new IllegalStateException("VHS-2 is missing an animated or replaceable part");
            int count = 0;
            double[] low = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
            double[] high = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
            try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(new File(output, name + ".mesh")), StandardCharsets.UTF_8))) {
                writer.println("model\t" + name);
                for (Field field : ModelGun.class.getFields()) {
                    if (field.getType() != ModelRendererTurbo[].class) continue;
                    ModelRendererTurbo[] parts = (ModelRendererTurbo[]) field.get(model);
                    if (parts == null) continue;
                    for (int partIndex = 0; partIndex < parts.length; partIndex++) {
                        ModelRendererTurbo part = parts[partIndex];
                        for (TexturedPolygon polygon : (TexturedPolygon[]) polygons.get(part)) {
                            if (name.equals("VHS2")) {
                                PositionTextureVertex[] v = polygon.vertexPositions;
                                double ax=v[1].vector3D.xCoord-v[0].vector3D.xCoord;
                                double ay=v[1].vector3D.yCoord-v[0].vector3D.yCoord;
                                double az=v[1].vector3D.zCoord-v[0].vector3D.zCoord;
                                double bx=v[2].vector3D.xCoord-v[0].vector3D.xCoord;
                                double by=v[2].vector3D.yCoord-v[0].vector3D.yCoord;
                                double bz=v[2].vector3D.zCoord-v[0].vector3D.zCoord;
                                double cx=ay*bz-az*by, cy=az*bx-ax*bz, cz=ax*by-ay*bx;
                                if (cx*cx+cy*cy+cz*cz < 1e-18)
                                    throw new IllegalStateException("Degenerate VHS-2 triangle");
                            }
                            writer.print(field.getName() + (name.equals("HK416") ? "#" + partIndex : ""));
                            for (PositionTextureVertex vertex : polygon.vertexPositions) {
                                if (name.equals("VHS2") && (!Float.isFinite(vertex.texturePositionX)
                                        || !Float.isFinite(vertex.texturePositionY)
                                        || vertex.texturePositionX < 0 || vertex.texturePositionX > 1
                                        || vertex.texturePositionY < 0 || vertex.texturePositionY > 1))
                                    throw new IllegalStateException("Invalid VHS-2 UV");
                                double x = vertex.vector3D.xCoord, y = vertex.vector3D.yCoord, z = vertex.vector3D.zCoord;
                                double yy = y * Math.cos(part.rotateAngleX) - z * Math.sin(part.rotateAngleX);
                                z = y * Math.sin(part.rotateAngleX) + z * Math.cos(part.rotateAngleX); y = yy;
                                double xx = x * Math.cos(part.rotateAngleY) + z * Math.sin(part.rotateAngleY);
                                z = -x * Math.sin(part.rotateAngleY) + z * Math.cos(part.rotateAngleY); x = xx;
                                xx = x * Math.cos(part.rotateAngleZ) - y * Math.sin(part.rotateAngleZ);
                                y = x * Math.sin(part.rotateAngleZ) + y * Math.cos(part.rotateAngleZ); x = xx;
                                double[] p = {x + part.rotationPointX, y + part.rotationPointY, z + part.rotationPointZ};
                                for (int i = 0; i < 3; i++) {
                                    if (!Double.isFinite(p[i])) throw new IllegalStateException("Invalid vertex");
                                    low[i] = Math.min(low[i], p[i]); high[i] = Math.max(high[i], p[i]);
                                }
                                writer.print("\t" + p[0] + "," + p[1] + "," + p[2] + ","
                                        + vertex.texturePositionX + "," + vertex.texturePositionY);
                            }
                            writer.println();
                            count++;
                        }
                    }
                }
            }
            System.out.printf("%s: %d polygons; bounds (%.3f, %.3f, %.3f) to (%.3f, %.3f, %.3f)%n",
                    name, count, low[0], low[1], low[2], high[0], high[1], high[2]);
            if (name.equals("VHS2")) {
                if (Math.abs(high[0]-low[0]-22.8) > 0.001 || count > 12000)
                    throw new IllegalStateException("VHS-2 scale or triangle budget changed");
                if (Math.abs(low[0] + 8.3) > 0.001 || Math.abs(high[0] - 14.5) > 0.001
                        || Math.abs(model.barrelAttachPoint.x * 16 - 11.98) > 0.001)
                    throw new IllegalStateException("VHS-2 forward offset or muzzle mount changed");
                if (high[2]-low[2] < 2.35 || high[2]-low[2] > 2.4
                        || Math.abs(model.gadgetAttachPoint.z * 16 + 1.134) > 0.0001
                        || Math.abs(model.accessoryAttachPoint.z * 16 + 1.134) > 0.0001)
                    throw new IllegalStateException("VHS-2 body width or side rail mount changed");
                Vector3f flashOffset = model.defaultBarrelFlashPoint;
                double flashX = (model.muzzleFlashPoint.x + (flashOffset == null ? 0 : flashOffset.x)) * model.flashScale * 16;
                double flashY = (model.muzzleFlashPoint.y + (flashOffset == null ? 0 : flashOffset.y)) * model.flashScale * 16;
                double flashZ = (model.muzzleFlashPoint.z + (flashOffset == null ? 0 : flashOffset.z)) * model.flashScale * 16;
                if (Math.abs(flashX-high[0]) > 0.001 || Math.abs(flashY-4.5) > 0.001 || Math.abs(flashZ) > 0.001)
                    throw new IllegalStateException("VHS-2 scaled flash anchor misses the muzzle tip");
                System.out.println("VHS-2: scaled muzzle flash anchor matches the muzzle tip at (14.5, 4.5, 0)");
                checkIronMarks(model, polygons);
                attachment(output, polygons, "HOLO", 0.12F, model.scopeAttachPoint);
                attachment(output, polygons, "VerticalGrip", 0.1F, model.gripAttachPoint);
                attachment(output, polygons, "5MWLaser", 0.1F, model.gadgetAttachPoint);
            }
        }
    }

    private static void checkIronMarks(ModelGun model, Field polygons) throws Exception {
        int marks = 0;
        double rearLeftX = 0, rearRightX = 0, frontX = 0;
        double halfWidth = 0;
        double rearMinX = Double.POSITIVE_INFINITY;
        for (ModelRendererTurbo part : model.defaultScopeModel) {
            TexturedPolygon[] faces = (TexturedPolygon[]) polygons.get(part);
            for (TexturedPolygon face : faces) for (PositionTextureVertex v : face.vertexPositions) {
                halfWidth = Math.max(halfWidth, Math.abs(v.vector3D.zCoord + part.rotationPointZ));
                double x = v.vector3D.xCoord + part.rotationPointX;
                if (x < 5) rearMinX = Math.min(rearMinX, x);
            }
            float u = faces[0].vertexPositions[0].texturePositionX;
            if (u < 0.125F || u > 0.15625F) continue;
            double[] low = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
            double[] high = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
            for (TexturedPolygon face : faces) for (PositionTextureVertex v : face.vertexPositions) {
                double[] p = {v.vector3D.xCoord + part.rotationPointX,
                        v.vector3D.yCoord + part.rotationPointY, v.vector3D.zCoord + part.rotationPointZ};
                for (int i = 0; i < 3; i++) { low[i] = Math.min(low[i], p[i]); high[i] = Math.max(high[i], p[i]); }
            }
            double x = (low[0]+high[0])/2, y = (low[1]+high[1])/2, z = (low[2]+high[2])/2;
            if (Math.abs(y - 7.33) > 0.0001 || Math.abs(Math.abs(z) - 0.15) > 0.0001 && Math.abs(z) > 0.0001)
                throw new IllegalStateException("VHS-2 white sight marks are misaligned");
            if (z < -0.01) rearLeftX = x;
            else if (z > 0.01) rearRightX = x;
            else frontX = x;
            marks++;
        }
        if (marks != 3 || Math.abs(rearLeftX-rearRightX) > 0.0001 || frontX <= rearLeftX)
            throw new IllegalStateException("VHS-2 requires two aligned rear marks and one centered front mark");
        if (halfWidth < 0.599 || halfWidth > 0.6002)
            throw new IllegalStateException("VHS-2 iron sights exceed the Picatinny rail width");
        if (rearMinX < -1.6 || Math.abs(rearLeftX + 0.98) > 0.0001)
            throw new IllegalStateException("VHS-2 rear sight does not sit forward on the rail");
        System.out.println("VHS-2: lowered HK sights, rear rail seating, white mark alignment and mounts verified");
    }

    private static void attachment(File output, Field polygons, String name,
                                   float scale, Vector3f anchor) throws Exception {
        ModelAttachment model = (ModelAttachment) Class.forName(
                "com.flansmod.client.model.BFMCpack.Model" + name).newInstance();
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(new File(output, name + ".mesh")), StandardCharsets.UTF_8))) {
            writer.println("attachment\t" + name);
            for (ModelRendererTurbo part : model.attachmentModel) {
                for (TexturedPolygon polygon : (TexturedPolygon[]) polygons.get(part)) {
                    writer.print("attachmentModel");
                    for (PositionTextureVertex v : polygon.vertexPositions) {
                        double x = v.vector3D.xCoord, y = v.vector3D.yCoord, z = v.vector3D.zCoord;
                        double yy = y * Math.cos(part.rotateAngleX) - z * Math.sin(part.rotateAngleX);
                        z = y * Math.sin(part.rotateAngleX) + z * Math.cos(part.rotateAngleX); y = yy;
                        double xx = x * Math.cos(part.rotateAngleY) + z * Math.sin(part.rotateAngleY);
                        z = -x * Math.sin(part.rotateAngleY) + z * Math.cos(part.rotateAngleY); x = xx;
                        xx = x * Math.cos(part.rotateAngleZ) - y * Math.sin(part.rotateAngleZ);
                        y = x * Math.sin(part.rotateAngleZ) + y * Math.cos(part.rotateAngleZ); x = xx;
                        writer.print("\t" + ((x + part.rotationPointX) * scale + anchor.x * 16)
                                + "," + ((y + part.rotationPointY) * scale + anchor.y * 16)
                                + "," + ((z + part.rotationPointZ) * scale + anchor.z * 16)
                                + "," + v.texturePositionX + "," + v.texturePositionY);
                    }
                    writer.println();
                }
            }
        }
    }
}
