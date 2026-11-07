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
public final class MG36GeometryCheck {
    public static void main(String[] args) throws Exception {
        File output = new File(args[0]);
        output.mkdirs();
        Field polygons = ModelRendererTurbo.class.getDeclaredField("faces");
        polygons.setAccessible(true);
        for (String name : new String[]{"M4A1", "HK416", "FAMAS", "MG36"}) {
            ModelGun model = (ModelGun) Class.forName(
                    "com.flansmod.client.model.BFMCpack.Model" + name).newInstance();
            if (name.equals("MG36") && (model.ammoModel.length == 0 || model.slideModel.length == 0
                    || model.defaultBarrelModel.length == 0 || model.defaultScopeModel.length == 0))
                throw new IllegalStateException("MG36 is missing an animated or replaceable part");
            int count = 0;
            int markingTriangles = 0;
            double[] low = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
            double[] high = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
            try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(new File(output, name + ".mesh")), StandardCharsets.UTF_8))) {
                writer.println("model\t" + name);
                for (Field field : ModelGun.class.getFields()) {
                    if (field.getType() != ModelRendererTurbo[].class) continue;
                    ModelRendererTurbo[] parts = (ModelRendererTurbo[]) field.get(model);
                    if (parts == null) continue;
                    boolean irons = field.getName().equals("defaultScopeModel");
                    double signedVolume = 0;
                    for (int partIndex = 0; partIndex < parts.length; partIndex++) {
                        ModelRendererTurbo part = parts[partIndex];
                        for (TexturedPolygon polygon : (TexturedPolygon[]) polygons.get(part)) {
                            if (name.equals("MG36")) {
                                PositionTextureVertex[] v = polygon.vertexPositions;
                                double ax=v[1].vector3D.xCoord-v[0].vector3D.xCoord;
                                double ay=v[1].vector3D.yCoord-v[0].vector3D.yCoord;
                                double az=v[1].vector3D.zCoord-v[0].vector3D.zCoord;
                                double bx=v[2].vector3D.xCoord-v[0].vector3D.xCoord;
                                double by=v[2].vector3D.yCoord-v[0].vector3D.yCoord;
                                double bz=v[2].vector3D.zCoord-v[0].vector3D.zCoord;
                                double cx=ay*bz-az*by, cy=az*bx-ax*bz, cz=ax*by-ay*bx;
                                if (cx*cx+cy*cy+cz*cz < 1e-18)
                                    throw new IllegalStateException("Degenerate MG36 triangle");
                                // Clipping shared faces leaves internal seams open. Measure the
                                // irons relative to their rail seat instead of the distant origin.
                                double y = v[0].vector3D.yCoord - (irons ? model.scopeAttachPoint.y*16 : 0);
                                signedVolume += v[0].vector3D.xCoord*cx + y*cy + v[0].vector3D.zCoord*cz;
                                if (v[0].texturePositionX >= 712F/1024F
                                        && v[0].texturePositionY >= 728F/1024F
                                        && v[0].texturePositionY <= 776F/1024F) {
                                    if (cz <= 0 || model.mirrorThirdPerson)
                                        throw new IllegalStateException("G36 marking faces the wrong way");
                                    for (PositionTextureVertex vertex : v) {
                                        double expectedU = (712 + 288*(vertex.vector3D.xCoord+.12)/2.44)/1024;
                                        if (Math.abs(vertex.vector3D.zCoord-.851) > .001
                                                || Math.abs(vertex.texturePositionX-expectedU) > .001)
                                            throw new IllegalStateException("G36 marking is mirrored or on the wrong side");
                                    }
                                    markingTriangles++;
                                }
                            }
                            writer.print(field.getName() + (name.equals("HK416") ? "#" + partIndex : ""));
                            for (PositionTextureVertex vertex : polygon.vertexPositions) {
                                if (name.equals("MG36") && (!Float.isFinite(vertex.texturePositionX)
                                        || !Float.isFinite(vertex.texturePositionY)
                                        || vertex.texturePositionX < 0 || vertex.texturePositionX > 1
                                        || vertex.texturePositionY < 0 || vertex.texturePositionY > 1))
                                    throw new IllegalStateException("Invalid MG36 UV");
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
                    if (name.equals("MG36") && parts.length > 0 && !(signedVolume > 0))
                        throw new IllegalStateException("Inward MG36 winding in " + field.getName());
                }
            }
            System.out.printf("%s: %d polygons; bounds (%.3f, %.3f, %.3f) to (%.3f, %.3f, %.3f)%n",
                    name, count, low[0], low[1], low[2], high[0], high[1], high[2]);
            if (name.equals("MG36")) {
                if (markingTriangles != 2 || high[2]-low[2] > 4 || low[1] > -1)
                    throw new IllegalStateException("Missing G36 receiver marking or rifle magazine profile");
                if (Math.abs(high[0]-low[0]-26.9) > 0.001 || high[2]-low[2] > 3.05 || count > 20000)
                    throw new IllegalStateException("MG36 length or triangle budget changed");
                Vector3f flash = model.muzzleFlashPoint;
                if (Math.abs(flash.x*model.flashScale*16-high[0]) > .001
                        || Math.abs(flash.y*model.flashScale*16-4.5) > .001 || Math.abs(flash.z) > .001)
                    throw new IllegalStateException("MG36 effective flash misses muzzle");
                checkIronMarks(model, polygons);
                checkPicatinny(model, polygons);
                attachment(output, polygons, "HOLO", 0.12F, model.scopeAttachPoint);
                attachment(output, polygons, "VerticalGrip", 0.1F, model.gripAttachPoint);
                attachment(output, polygons, "5MWLaser", 0.1F, model.gadgetAttachPoint);
                attachment(output, polygons, "KXFlashHider", 1F, model.barrelAttachPoint);
            }
        }
    }

    private static void checkPicatinny(ModelGun model, Field polygons) throws Exception {
        java.util.TreeSet<Integer> lugEdges = new java.util.TreeSet<>();
        double shoulderHalfWidth = 0;
        for (ModelRendererTurbo part : model.gunModel) {
            for (TexturedPolygon face : (TexturedPolygon[]) polygons.get(part)) {
                for (PositionTextureVertex vertex : face.vertexPositions) {
                    double y = vertex.vector3D.yCoord;
                    if (Math.abs(y - 6.41) < .0001)
                        lugEdges.add((int) Math.round(vertex.vector3D.xCoord * 10000));
                    if (Math.abs(y - 6.342) < .0001)
                        shoulderHalfWidth = Math.max(shoulderHalfWidth, Math.abs(vertex.vector3D.zCoord));
                }
            }
        }
        if (lugEdges.size() != 56 || Math.abs(shoulderHalfWidth - .60) > .0001)
            throw new IllegalStateException("G36 Picatinny clamp shoulders or slots changed");
    }

    private static void checkIronMarks(ModelGun model, Field polygons) throws Exception {
        double[][] low = new double[3][3], high = new double[3][3];
        for (int i=0;i<3;i++) for (int j=0;j<3;j++) {low[i][j]=Double.POSITIVE_INFINITY;high[i][j]=Double.NEGATIVE_INFINITY;}
        double[] base = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
        double halfWidth = 0;
        for (ModelRendererTurbo part : model.defaultScopeModel)
            for (TexturedPolygon face : (TexturedPolygon[]) polygons.get(part))
                for (PositionTextureVertex v : face.vertexPositions) {
                    double x=v.vector3D.xCoord+part.rotationPointX;
                    double y=v.vector3D.yCoord+part.rotationPointY;
                    double z=v.vector3D.zCoord+part.rotationPointZ;
                    int sight = x > 5 ? 1 : 0;
                    base[sight] = Math.min(base[sight], y);
                    halfWidth = Math.max(halfWidth, Math.abs(z));
                    if (x < -.84 || x > 8.54)
                        throw new IllegalStateException("HK416 iron sight overhangs the G36 rail");
                    if (v.texturePositionX < .69 || v.texturePositionX > .78) {
                        if (v.texturePositionX < 320F/1024F || v.texturePositionX > 576F/1024F
                                || v.texturePositionY < 504F/1024F || v.texturePositionY > 520F/1024F)
                            throw new IllegalStateException("HK416 iron sight UV escaped its texture strip");
                        continue;
                    }
                    int mark = x > 5 ? 2 : z < 0 ? 0 : 1;
                    double[] p={x,y,z};
                    for(int j=0;j<3;j++){low[mark][j]=Math.min(low[mark][j],p[j]);high[mark][j]=Math.max(high[mark][j],p[j]);}
                }
        for(int i=0;i<3;i++) {
            if (!Double.isFinite(low[i][0]) || Math.abs((low[i][1]+high[i][1])/2-7.12) > .0001)
                throw new IllegalStateException("MG36 witness marks are not level");
            double z=(low[i][2]+high[i][2])/2;
            if(Math.abs(z-(i==2?0:i==0?-.15:.15))>.0001)
                throw new IllegalStateException("MG36 witness marks are off center");
        }
        if(Math.abs(base[0]-6.41)>.0001 || Math.abs(base[1]-6.41)>.0001
                || Math.abs(halfWidth-.6)>.001 || Math.abs(model.scopeAttachPoint.y*16-6.41)>.0001)
            throw new IllegalStateException("MG36 sights or optic mount do not seat on 1.2-unit rail");
        System.out.println("MG36: three level sight marks, seated bases and compensated flash verified");
    }
    private static void attachment(File output, Field polygons, String name,
                                   float scale, Vector3f anchor) throws Exception {
        ModelAttachment model;
        if (name.equals("KXFlashHider")) {
            // Content-pack classes use SRG names; map only this offline copy
            // to the development mappings. Never mutate the installed class.
            final String className = "com.flansmod.client.model.DarkZone.ModelKXFlashHider";
            byte[] bytes = java.nio.file.Files.readAllBytes(new File(
                    "eclipse/Flan/BFMC Gun Pack/" + className.replace('.', '/') + ".class").toPath());
            String data = new String(bytes, java.nio.charset.StandardCharsets.ISO_8859_1);
            String[][] names = {{"func_78793_a", "setRotationPoint"},
                    {"field_78795_f", "rotateAngleX"}, {"field_78796_g", "rotateAngleY"},
                    {"field_78808_h", "rotateAngleZ"}};
            for (String[] pair : names)
                data = data.replace("\u0000" + (char) pair[0].length() + pair[0],
                        "\u0000" + (char) pair[1].length() + pair[1]);
            final byte[] mapped = data.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
            model = (ModelAttachment) new ClassLoader(MG36GeometryCheck.class.getClassLoader()) {
                Class<?> loadMapped() { return defineClass(className, mapped, 0, mapped.length); }
            }.loadMapped().newInstance();
        } else {
            model = (ModelAttachment) Class.forName(
                    "com.flansmod.client.model.BFMCpack.Model" + name).newInstance();
        }
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

