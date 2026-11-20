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

public final class ASH12GeometryCheck {
    public static void main(String[] args) throws Exception {
        LaunchClassLoader launch = new LaunchClassLoader(((URLClassLoader) ClassLoader.getSystemClassLoader()).getURLs());
        Class.forName("ASH12GeometryCheck", true, launch).getMethod("verify", String[].class).invoke(null, (Object) args);
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
        for (String name : new String[] {"ASH12"}) {
            ModelGun model = (ModelGun) Class.forName("com.flansmod.client.model.BFMCpack.Model" + name).newInstance();
            if (model.ammoModel.length != 55 || model.slideModel.length != 10
                    || model.defaultBarrelModel.length != 29 || model.defaultScopeModel.length != 72)
                throw new AssertionError("ASH12 animation/swap groups changed");
            if (model.attachmentScopeModel != model.defaultScopeModel)
                throw new AssertionError("ASH12 carry handle must remain with an optic fitted");
            // The renderer translates by this value before rendering 1/16-unit vertices.
            // .15 therefore gives 2.4 source pixels, rather than the previous 40.
            if (Math.abs(model.gunSlideDistance * 16 - 2.4) > .00001)
                throw new AssertionError("ASH12 bolt stroke changed");
            double flashX = (model.muzzleFlashPoint.x + model.defaultBarrelFlashPoint.x) * 16 * model.flashScale * .36;
            if (Math.abs(flashX - 13.05) > .00001)
                throw new AssertionError("ASH12 flash must meet the factory muzzle tip");
            try (PrintWriter out = new PrintWriter(output.resolve("mounts.json").toFile())) {
                out.printf("{\"scope\":[%.8f,%.8f,%.8f],\"grip\":[%.8f,%.8f,%.8f],\"scopedOffsetY\":%.8f}%n",
                        model.scopeAttachPoint.x*16*.36, model.scopeAttachPoint.y*16*.36, model.scopeAttachPoint.z*16*.36,
                        model.gripAttachPoint.x*16*.36, model.gripAttachPoint.y*16*.36, model.gripAttachPoint.z*16*.36,
                        model.gunOffset);
            }
            try (PrintWriter out = new PrintWriter(output.resolve(name + ".mesh").toFile())) {
                for (String group : new String[] {"gunModel", "ammoModel", "slideModel", "defaultScopeModel", "defaultBarrelModel", "defaultStockModel"})
                    write(out, faces, (ModelRendererTurbo[]) ModelGun.class.getField(group).get(model), 0.36, group);
            }
        }
        String[] devices = {"VerticalGrip", "HOLO", "Reflex"};
        double[] scales = {.1, .12, .12};
        for (int i = 0; i < devices.length; i++) {
            ModelAttachment device = (ModelAttachment) Class.forName(
                    "com.flansmod.client.model.BFMCpack.Model" + devices[i]).newInstance();
            try (PrintWriter out = new PrintWriter(output.resolve(devices[i] + ".mesh").toFile())) {
                write(out, faces, device.attachmentModel, scales[i], "attachmentModel");
            }
        }
        System.out.println("ASH12 loaded geometry and UV checks passed");
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
