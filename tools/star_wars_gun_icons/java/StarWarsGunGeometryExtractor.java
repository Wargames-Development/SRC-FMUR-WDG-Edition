import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.client.tmt.TexturedPolygon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/** Dumps the runtime TMT geometry used to render Star Wars inventory icons. */
public final class StarWarsGunGeometryExtractor {
    private static final String[][] MODELS = {
            {"A280Blaster", "com.flansmod.client.model.BFMCpack.ModelA280Blaster"},
            {"DC15A", "com.flansmod.client.model.BFMCpack.ModelDC15A"},
            {"DC15SCarbine", "com.flansmod.client.model.BFMCpack.ModelDC15SCarbine"},
            {"E11", "com.flansmod.client.model.BFMCpack.ModelE11"},
            {"T21", "com.flansmod.client.model.BFMCpack.ModelT21"}
    };

    private StarWarsGunGeometryExtractor() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1)
            throw new IllegalArgumentException("Expected <mesh output directory>");
        File output = new File(args[0]).getCanonicalFile();
        Files.createDirectories(output.toPath());
        Field facesField = ModelRendererTurbo.class.getDeclaredField("faces");
        facesField.setAccessible(true);

        for (String[] entry : MODELS) {
            ModelGun model = (ModelGun)Class.forName(entry[1]).getConstructor().newInstance();
            dump(model.gunModel, new File(output, entry[0] + ".mesh"), facesField);
        }
        System.out.println("Extracted " + MODELS.length + " Star Wars gun meshes.");
    }

    private static void dump(ModelRendererTurbo[] parts, File output, Field facesField) throws Exception {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(output), StandardCharsets.UTF_8));
        try {
            writer.write("part\tx,y,z,u,v,w...");
            writer.newLine();
            for (int partIndex = 0; partIndex < parts.length; partIndex++) {
                ModelRendererTurbo part = parts[partIndex];
                TexturedPolygon[] faces = (TexturedPolygon[])facesField.get(part);
                for (TexturedPolygon face : faces) {
                    writer.write(Integer.toString(partIndex));
                    for (PositionTextureVertex vertex : face.vertexPositions) {
                        double[] point = transform(part, vertex.vector3D.xCoord,
                                vertex.vector3D.yCoord, vertex.vector3D.zCoord);
                        writer.write('\t');
                        writer.write(Double.toString(point[0]));
                        writer.write(',');
                        writer.write(Double.toString(point[1]));
                        writer.write(',');
                        writer.write(Double.toString(point[2]));
                        writer.write(',');
                        writer.write(Float.toString(vertex.texturePositionX));
                        writer.write(',');
                        writer.write(Float.toString(vertex.texturePositionY));
                        writer.write(',');
                        writer.write(Float.toString(vertex.texturePositionW));
                    }
                    writer.newLine();
                }
            }
        } finally {
            writer.close();
        }
    }

    private static double[] transform(ModelRendererTurbo part, double x, double y, double z) {
        double sinX = Math.sin(part.rotateAngleX), cosX = Math.cos(part.rotateAngleX);
        double sinY = Math.sin(part.rotateAngleY), cosY = Math.cos(part.rotateAngleY);
        double sinZ = Math.sin(part.rotateAngleZ), cosZ = Math.cos(part.rotateAngleZ);
        double rotatedY = y * cosX - z * sinX;
        double rotatedZ = y * sinX + z * cosX;
        double rotatedX = x * cosZ - rotatedY * sinZ;
        rotatedY = x * sinZ + rotatedY * cosZ;
        x = rotatedX * cosY + rotatedZ * sinY;
        z = -rotatedX * sinY + rotatedZ * cosY;
        return new double[]{x + part.rotationPointX, rotatedY + part.rotationPointY,
                z + part.rotationPointZ};
    }
}
