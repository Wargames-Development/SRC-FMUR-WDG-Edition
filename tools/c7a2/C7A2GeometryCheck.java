import com.flansmod.client.model.ModelGun;
import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.client.tmt.TexturedPolygon;
import java.io.*;
import java.nio.file.*;
import java.lang.reflect.Field;
import java.net.URLClassLoader;
import java.util.*;
import cpw.mods.fml.common.Loader;
import net.minecraft.launchwrapper.LaunchClassLoader;

public final class C7A2GeometryCheck {
    public static void main(String[] args) throws Exception {
        LaunchClassLoader launch = new LaunchClassLoader(((URLClassLoader) ClassLoader.getSystemClassLoader()).getURLs());
        Class.forName("C7A2GeometryCheck", true, launch).getMethod("verify", String[].class).invoke(null, (Object) args);
    }

    public static void verify(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        File instance = new File("eclipse").getCanonicalFile();
        Loader.injectData("7", "99", "40", "1614", "1.7.10", "9.05", instance, Collections.emptyList());
        Field config = Loader.class.getDeclaredField("canonicalConfigDir");
        config.setAccessible(true); config.set(Loader.instance(), new File(instance, "config"));
        Field side = cpw.mods.fml.relauncher.FMLRelaunchLog.class.getDeclaredField("side");
        side.setAccessible(true); side.set(null, cpw.mods.fml.relauncher.Side.SERVER);
        Field home = cpw.mods.fml.relauncher.FMLRelaunchLog.class.getDeclaredField("minecraftHome");
        home.setAccessible(true); home.set(null, new File(args[0]));
        cpw.mods.fml.server.FMLServerHandler.instance();
        net.minecraft.launchwrapper.Launch.blackboard = new HashMap<String, Object>();
        net.minecraft.launchwrapper.Launch.blackboard.put("fml.deobfuscatedEnvironment", true);
        Path output = Paths.get(args[0]); Files.createDirectories(output);
        Field faces = ModelRendererTurbo.class.getDeclaredField("faces"); faces.setAccessible(true);
        for (String name : new String[] {"M16A4", "M4A1", "C7A2"}) {
            ModelGun model = (ModelGun) Class.forName("com.flansmod.client.model.BFMCpack.Model" + name).newInstance();
            try (PrintWriter out = new PrintWriter(output.resolve(name + ".mesh").toFile())) {
                for (String group : new String[] {"gunModel", "ammoModel", "slideModel", "defaultScopeModel", "defaultBarrelModel", "defaultStockModel"})
                    write(out, faces, (ModelRendererTurbo[]) ModelGun.class.getField(group).get(model), 1.15, group);
            }
            if (name.equals("C7A2") && (model.mirrorThirdPerson || Math.abs(model.barrelAttachPoint.x * 16 * 1.15 - 19.4) > .001))
                throw new AssertionError("C7A2 handedness or muzzle socket changed");
        }
        ModelAttachment optic = (ModelAttachment) Class.forName("com.flansmod.client.model.BFMCpack.ModelC79").newInstance();
        try (PrintWriter out = new PrintWriter(output.resolve("C79.mesh").toFile())) {
            write(out, faces, optic.attachmentModel, 1, "attachmentModel");
        }
    }

    private static void write(PrintWriter out, Field faces, ModelRendererTurbo[] parts, double scale, String group) throws Exception {
        for (int i = 0; i < parts.length; i++) {
            ModelRendererTurbo part = parts[i];
            TexturedPolygon[] polygons = (TexturedPolygon[]) faces.get(part);
            if (polygons.length == 0) throw new AssertionError("Empty loaded mesh: " + group);
            for (TexturedPolygon face : polygons) {
                out.print(group + "#" + i);
                for (PositionTextureVertex v : face.vertexPositions) {
                    if (!Float.isFinite(v.texturePositionX) || !Float.isFinite(v.texturePositionY)
                            || v.texturePositionX < 0 || v.texturePositionX > 1 || v.texturePositionY < 0 || v.texturePositionY > 1)
                        throw new AssertionError("Invalid UV in " + group);
                    double x = v.vector3D.xCoord, y = v.vector3D.yCoord, z = v.vector3D.zCoord;
                    double yy = y * Math.cos(part.rotateAngleX) - z * Math.sin(part.rotateAngleX);
                    z = y * Math.sin(part.rotateAngleX) + z * Math.cos(part.rotateAngleX); y = yy;
                    double xx = x * Math.cos(part.rotateAngleZ) - y * Math.sin(part.rotateAngleZ);
                    y = x * Math.sin(part.rotateAngleZ) + y * Math.cos(part.rotateAngleZ); x = xx;
                    xx = x * Math.cos(part.rotateAngleY) + z * Math.sin(part.rotateAngleY);
                    z = -x * Math.sin(part.rotateAngleY) + z * Math.cos(part.rotateAngleY); x = xx;
                    out.printf("\t%.7f,%.7f,%.7f,%.7f,%.7f", (x+part.rotationPointX)*scale,
                            (y+part.rotationPointY)*scale, (z+part.rotationPointZ)*scale,
                            v.texturePositionX, v.texturePositionY);
                }
                out.println();
            }
        }
    }
}
