import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.client.tmt.TexturedPolygon;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.lang.reflect.Field;
import java.net.URLClassLoader;
import cpw.mods.fml.common.Loader;
import net.minecraft.launchwrapper.LaunchClassLoader;

public final class NTW20GeometryCheck {
    private static final String[] GROUPS = {
        "gunModel", "defaultScopeModel", "defaultBarrelModel", "defaultStockModel",
        "defaultGripModel", "defaultGadgetModel", "ammoModel", "extraAmmoModel", "slideModel",
        "pumpModel", "chargeModel", "leverActionModel", "breakActionModel", "hammerModel"
    };
    public static void main(String[] args) throws Exception {
        LaunchClassLoader launch = new LaunchClassLoader(((URLClassLoader) ClassLoader.getSystemClassLoader()).getURLs());
        Class.forName("NTW20GeometryCheck", true, launch).getMethod("verify", String[].class).invoke(null, (Object) args);
    }

    public static void verify(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        File instance = new File("eclipse").getCanonicalFile();
        Loader.injectData("7", "99", "40", "1614", "1.7.10", "9.05", instance, Collections.emptyList());
        Field config = Loader.class.getDeclaredField("canonicalConfigDir");
        config.setAccessible(true);
        config.set(Loader.instance(), new File(instance, "config"));
        Field side = cpw.mods.fml.relauncher.FMLRelaunchLog.class.getDeclaredField("side");
        side.setAccessible(true);
        side.set(null, cpw.mods.fml.relauncher.Side.SERVER);
        Field home = cpw.mods.fml.relauncher.FMLRelaunchLog.class.getDeclaredField("minecraftHome");
        home.setAccessible(true);
        home.set(null, new File("build/ntw20-check").getCanonicalFile());
        cpw.mods.fml.server.FMLServerHandler.instance();
        net.minecraft.launchwrapper.Launch.blackboard = new HashMap<String, Object>();
        net.minecraft.launchwrapper.Launch.blackboard.put("fml.deobfuscatedEnvironment", true);

        Field faces = ModelRendererTurbo.class.getDeclaredField("faces");
        faces.setAccessible(true);
        Path pack = Paths.get(args[0]), output = Paths.get(args[1]);
        Files.createDirectories(output);
        String[] definitions = {
            "CUSTOM_SR_NTW20", "US_SR_M82A3"
        };
        for (String definition : definitions) {
            Map<String, String> fields = new HashMap<>();
            for (String line : Files.readAllLines(pack.resolve("guns").resolve(definition + ".txt"),
                    java.nio.charset.StandardCharsets.ISO_8859_1)) {
                String[] tokens = line.trim().split("\\s+", 2);
                if (tokens.length == 2) fields.put(tokens[0], tokens[1]);
            }
            String name = fields.get("Model");
            Class<?> type = Class.forName("com.flansmod.client.model.BFMCpack.Model" + name.split("\\.")[1]);
            ModelGun model = (ModelGun) type.newInstance();
            double scale = Double.parseDouble(fields.get("ModelScale"));
            try (PrintWriter out = new PrintWriter(output.resolve(definition + ".mesh").toFile())) {
                out.println(fields.get("Texture"));
                for (String group : GROUPS) {
                    write(out, faces, (ModelRendererTurbo[]) ModelGun.class.getField(group).get(model),
                            scale, 0, 0, 0, group);
                }
                if (definition.equals("CUSTOM_SR_NTW20")) {
                    for (String group : new String[]{"gunModel", "ammoModel", "defaultScopeModel", "defaultBarrelModel"}) {
                        ModelRendererTurbo[] parts = (ModelRendererTurbo[]) ModelGun.class.getField(group).get(model);
                        if (parts.length != 1 || ((TexturedPolygon[]) faces.get(parts[0])).length == 0)
                            throw new AssertionError("Missing loaded NTW20 group: " + group);
                    }
                    if (Math.abs(model.muzzleFlashPoint.x * 16 * scale - 36.575) > .001)
                        throw new AssertionError("NTW20 flash anchor changed");
                    if (model.mirrorThirdPerson || !"ntw20".equals(fields.get("ShortName")))
                        throw new AssertionError("NTW20 handedness or item identity changed");
                }
            }
        }
    }

    private static void write(PrintWriter out, Field faces, ModelRendererTurbo[] parts, double scale,
            double ox, double oy, double oz, String texture) throws Exception {
        for (ModelRendererTurbo part : parts) {
            if (part == null || !part.showModel) continue;
            for (TexturedPolygon face : (TexturedPolygon[]) faces.get(part)) {
                if (face.nVertices < 3) throw new AssertionError("Invalid loaded polygon");
                out.print(texture);
                for (PositionTextureVertex v : face.vertexPositions) {
                    if (!Float.isFinite(v.texturePositionX) || !Float.isFinite(v.texturePositionY)
                            || v.texturePositionX < 0 || v.texturePositionX > 1
                            || v.texturePositionY < 0 || v.texturePositionY > 1)
                        throw new AssertionError("Invalid loaded UV");
                    double x = v.vector3D.xCoord, y = v.vector3D.yCoord, z = v.vector3D.zCoord;
                    double yy = y * Math.cos(part.rotateAngleX) - z * Math.sin(part.rotateAngleX);
                    z = y * Math.sin(part.rotateAngleX) + z * Math.cos(part.rotateAngleX); y = yy;
                    double xx = x * Math.cos(part.rotateAngleZ) - y * Math.sin(part.rotateAngleZ);
                    y = x * Math.sin(part.rotateAngleZ) + y * Math.cos(part.rotateAngleZ); x = xx;
                    xx = x * Math.cos(part.rotateAngleY) + z * Math.sin(part.rotateAngleY);
                    z = -x * Math.sin(part.rotateAngleY) + z * Math.cos(part.rotateAngleY); x = xx;
                    out.printf("\t%.7f,%.7f,%.7f,%.7f,%.7f",
                            (x + part.rotationPointX) * scale + ox,
                            (y + part.rotationPointY) * scale + oy,
                            (z + part.rotationPointZ) * scale + oz,
                            v.texturePositionX, v.texturePositionY);
                }
                out.println();
            }
        }
    }
}





