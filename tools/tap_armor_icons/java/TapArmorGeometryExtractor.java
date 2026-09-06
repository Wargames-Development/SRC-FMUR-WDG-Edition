import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.client.tmt.PositionTransformVertex;
import com.flansmod.client.tmt.TexturedPolygon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/** Dumps TaP's compiled TurboModelThingy armor geometry for the offline icon renderer. */
public final class TapArmorGeometryExtractor {
    private static final String[] GROUPS = {
            "headModel", "bodyModel", "leftArmModel", "rightArmModel",
            "leftLegModel", "rightLegModel", "skirtFrontModel", "skirtRearModel"
    };

    private TapArmorGeometryExtractor() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("Expected <TaP pack directory> <mesh output directory>");
        }

        File pack = new File(args[0]).getCanonicalFile();
        File armourFiles = new File(pack, "armorFiles");
        File output = new File(args[1]).getCanonicalFile();
        if (!pack.getName().equals("TaP-Escalation") || !armourFiles.isDirectory()) {
            throw new IllegalArgumentException("Refusing to process a directory other than TaP-Escalation: " + pack);
        }
        Files.createDirectories(output.toPath());

        Set<String> models = findModels(armourFiles);
        Field facesField = ModelRendererTurbo.class.getDeclaredField("faces");
        facesField.setAccessible(true);
        ClassLoader modelLoader = new RemappingModelClassLoader(pack.toURI().toURL(),
                TapArmorGeometryExtractor.class.getClassLoader());

        int totalFaces = 0;
        List<String> manifest = new ArrayList<String>();
        for (String modelName : models) {
            String className = toClassName(modelName);
            ModelCustomArmour model = (ModelCustomArmour) Class.forName(className, true, modelLoader)
                    .getConstructor().newInstance();
            File meshFile = new File(output, modelName.replace('.', '_') + ".mesh");
            int faceCount = dumpModel(model, modelName, meshFile, facesField);
            totalFaces += faceCount;
            manifest.add(modelName + "\t" + meshFile.getName() + "\t" + faceCount);
        }

        writeLines(new File(output, "manifest.tsv"), manifest);
        System.out.println("Extracted " + models.size() + " TaP armor models with " + totalFaces + " faces.");
    }

    private static Set<String> findModels(File armourFiles) throws Exception {
        File[] files = armourFiles.listFiles();
        if (files == null) {
            throw new IllegalStateException("Unable to list " + armourFiles);
        }
        List<File> sorted = new ArrayList<File>();
        Collections.addAll(sorted, files);
        Collections.sort(sorted);
        Set<String> result = new LinkedHashSet<String>();
        for (File file : sorted) {
            if (!file.isFile() || !file.getName().toLowerCase().endsWith(".txt")) {
                continue;
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), StandardCharsets.UTF_8));
            try {
                String line;
                while ((line = reader.readLine()) != null) {
                    String trimmed = line.trim();
                    if (trimmed.startsWith("Model ")) {
                        result.add(trimmed.substring("Model ".length()).trim());
                        break;
                    }
                }
            } finally {
                reader.close();
            }
        }
        return result;
    }

    private static String toClassName(String modelName) {
        String[] split = modelName.split("\\.");
        if (split.length == 1) {
            return "com.flansmod.client.model.Model" + modelName;
        }
        StringBuilder result = new StringBuilder("com.flansmod.client.model.");
        for (int i = 0; i < split.length - 1; i++) {
            result.append(split[i]).append('.');
        }
        return result.append("Model").append(split[split.length - 1]).toString();
    }

    private static int dumpModel(ModelCustomArmour model, String modelName, File output,
                                 Field facesField) throws Exception {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(output), StandardCharsets.UTF_8));
        int count = 0;
        try {
            writer.write("model\t" + modelName);
            writer.newLine();
            for (String groupName : GROUPS) {
                Field groupField = ModelCustomArmour.class.getField(groupName);
                ModelRendererTurbo[] parts = (ModelRendererTurbo[]) groupField.get(model);
                if (parts == null) {
                    continue;
                }
                for (ModelRendererTurbo part : parts) {
                    if (part == null) {
                        continue;
                    }
                    TexturedPolygon[] faces = (TexturedPolygon[]) facesField.get(part);
                    if (faces == null) {
                        continue;
                    }
                    for (TexturedPolygon face : faces) {
                        if (face == null || face.vertexPositions == null || face.vertexPositions.length < 3) {
                            continue;
                        }
                        writer.write(groupName);
                        for (PositionTextureVertex vertex : face.vertexPositions) {
                            if (vertex instanceof PositionTransformVertex) {
                                ((PositionTransformVertex) vertex).setTransformation();
                            }
                            writer.write('\t');
                            writer.write(Double.toString(vertex.vector3D.xCoord));
                            writer.write(',');
                            writer.write(Double.toString(vertex.vector3D.yCoord));
                            writer.write(',');
                            writer.write(Double.toString(vertex.vector3D.zCoord));
                            writer.write(',');
                            writer.write(Float.toString(vertex.texturePositionX));
                            writer.write(',');
                            writer.write(Float.toString(vertex.texturePositionY));
                            writer.write(',');
                            writer.write(Float.toString(vertex.texturePositionW));
                        }
                        writer.newLine();
                        count++;
                    }
                }
            }
        } finally {
            writer.close();
        }
        return count;
    }

    private static void writeLines(File output, List<String> lines) throws Exception {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(output), StandardCharsets.UTF_8));
        try {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } finally {
            writer.close();
        }
    }

    /** Applies the same SRG-to-development names that Forge's launch class loader applies in-game. */
    private static final class RemappingModelClassLoader extends URLClassLoader {
        private RemappingModelClassLoader(URL packRoot, ClassLoader parent) {
            super(new URL[]{packRoot}, parent);
        }

        @Override
        protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
            if (!name.startsWith("com.flansmod.client.model.NewArmor.")
                    && !name.startsWith("com.flansmod.client.model.NewAge.")) {
                return super.loadClass(name, resolve);
            }
            synchronized (getClassLoadingLock(name)) {
                Class<?> loaded = findLoadedClass(name);
                if (loaded == null) {
                    loaded = findClass(name);
                }
                if (resolve) {
                    resolveClass(loaded);
                }
                return loaded;
            }
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            String resourceName = name.replace('.', '/') + ".class";
            InputStream stream = getResourceAsStream(resourceName);
            if (stream == null) {
                throw new ClassNotFoundException(name);
            }
            try {
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                byte[] buffer = new byte[8192];
                int count;
                while ((count = stream.read(buffer)) >= 0) {
                    bytes.write(buffer, 0, count);
                }
                byte[] remapped = remap(bytes.toByteArray());
                return defineClass(name, remapped, 0, remapped.length);
            } catch (Exception error) {
                throw new ClassNotFoundException(name, error);
            } finally {
                try {
                    stream.close();
                } catch (Exception ignored) {
                }
            }
        }

        private byte[] remap(byte[] input) {
            ClassReader reader = new ClassReader(input);
            ClassWriter writer = new ClassWriter(reader, 0);
            ClassVisitor visitor = new ClassVisitor(Opcodes.ASM5, writer) {
                @Override
                public FieldVisitor visitField(int access, String name, String descriptor,
                                               String signature, Object value) {
                    return super.visitField(access, remapField(name), descriptor, signature, value);
                }

                @Override
                public MethodVisitor visitMethod(int access, String name, String descriptor,
                                                 String signature, String[] exceptions) {
                    MethodVisitor delegate = super.visitMethod(access, remapMethod(name), descriptor,
                            signature, exceptions);
                    return new MethodVisitor(Opcodes.ASM5, delegate) {
                        @Override
                        public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                            super.visitFieldInsn(opcode, owner, remapField(name), descriptor);
                        }

                        @Override
                        public void visitMethodInsn(int opcode, String owner, String name,
                                                    String descriptor, boolean isInterface) {
                            super.visitMethodInsn(opcode, owner, remapMethod(name), descriptor, isInterface);
                        }
                    };
                }
            };
            reader.accept(visitor, 0);
            return writer.toByteArray();
        }

        private static String remapField(String name) {
            if (name.equals("field_78795_f")) return "rotateAngleX";
            if (name.equals("field_78796_g")) return "rotateAngleY";
            if (name.equals("field_78808_h")) return "rotateAngleZ";
            return name;
        }

        private static String remapMethod(String name) {
            if (name.equals("func_78793_a")) return "setRotationPoint";
            if (name.equals("func_78790_a")) return "addBox";
            if (name.equals("func_78785_a")) return "render";
            if (name.equals("func_78088_a")) return "render";
            return name;
        }
    }
}
