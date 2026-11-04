package com.flansmod.common.playerlod;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.*;

/** Checks the side annotations that a development compile does not strip. No Minecraft launch. */
public final class PlayerLodServerChecks {
    private static final Map<String, ClassNode> classes = new HashMap<String, ClassNode>();
    public static void main(String[] args) throws Exception {
        // Negative control: inherited client-only calls must actually be detected.
        List<String> control = inspect("com/flansmod/common/playerlod/PlayerLodServerChecks", "clientOnlyControl");
        if (control.size() != 1 || !control.get(0).contains("isInvisibleToPlayer"))
            throw new AssertionError("Side audit did not detect its inherited client-only negative control: " + control);
        List<String> violations = new ArrayList<String>();
        for (String name : new String[] {"PlayerLodServer", "PlayerLodServer$AppearanceState",
                "PlayerLodSnapshot", "PlayerLodSnapshot$Entry", "PlayerLodSnapshot$Appearance"})
            violations.addAll(inspect("com/flansmod/common/playerlod/" + name, null));
        if (!violations.isEmpty()) throw new AssertionError("Dedicated-server LOD references: " + violations);
        visibilityPolicy();
        profileClassLoaderBoundary();
        System.out.println("PASS: all five LOD server/data classes avoid client-only Minecraft members; inherited-call negative control, six visibility-policy scenarios and split-Guava profile copying checked.");
    }

    private static void profileClassLoaderBoundary() throws Exception {
        ClassLoader split = new ClassLoader(PlayerLodServerChecks.class.getClassLoader()) {
            @Override protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                if (!name.equals("com.google.common.collect.Multimap")
                        && !name.equals("com.flansmod.common.playerlod.PlayerLodSnapshot$Appearance")
                        && !name.equals(ProfileCopyControl.class.getName())) return super.loadClass(name, resolve);
                Class<?> result = findLoadedClass(name);
                if (result == null) {
                    try (InputStream in = getParent().getResourceAsStream(name.replace('.', '/') + ".class")) {
                        if (in == null) throw new ClassNotFoundException(name);
                        java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int count;
                        while ((count = in.read(buffer)) != -1) bytes.write(buffer, 0, count);
                        byte[] code = bytes.toByteArray();
                        result = defineClass(name, code, 0, code.length);
                    } catch (java.io.IOException failure) { throw new ClassNotFoundException(name, failure); }
                }
                if (resolve) resolveClass(result);
                return result;
            }
        };
        split.loadClass("com.google.common.collect.Multimap");
        com.mojang.authlib.GameProfile source = new com.mojang.authlib.GameProfile(java.util.UUID.randomUUID(), "Source");
        com.mojang.authlib.GameProfile target = new com.mojang.authlib.GameProfile(source.getId(), "Target");
        source.getProperties().put("textures", new com.mojang.authlib.properties.Property("textures", "signed", "signature"));
        source.getProperties().put("textures", new com.mojang.authlib.properties.Property("textures", "unsigned"));
        boolean reproduced = false;
        try {
            split.loadClass(ProfileCopyControl.class.getName()).getMethod("copy",
                    source.getClass(), target.getClass()).invoke(null, source, target);
        } catch (java.lang.reflect.InvocationTargetException failure) {
            if (!(failure.getCause() instanceof LinkageError)) throw failure;
            reproduced = true;
        }
        if (!reproduced) throw new AssertionError("Split-Guava negative control did not reproduce the login crash");
        java.lang.reflect.Method copy = split.loadClass("com.flansmod.common.playerlod.PlayerLodSnapshot$Appearance")
                .getDeclaredMethod("copyProfileProperties", source.getClass(), target.getClass());
        copy.setAccessible(true);
        copy.invoke(null, source, target);
        if (target.getProperties().size() != 2 || !target.getProperties().equals(source.getProperties()))
            throw new AssertionError("Profile properties/signatures changed across class loaders");
        target.getProperties().clear();
        if (source.getProperties().size() != 2) throw new AssertionError("Copied profile shares mutable membership");
    }

    public static final class ProfileCopyControl {
        public static void copy(com.mojang.authlib.GameProfile source, com.mojang.authlib.GameProfile target) {
            target.getProperties().putAll(source.getProperties());
        }
    }

    private static void visibilityPolicy() throws Exception {
        java.lang.reflect.Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe"); field.setAccessible(true);
        sun.misc.Unsafe allocator = (sun.misc.Unsafe)field.get(null);
        StubPlayer target = (StubPlayer)allocator.allocateInstance(StubPlayer.class);
        StubPlayer viewer = (StubPlayer)allocator.allocateInstance(StubPlayer.class);
        ScorePlayerTeam team = new ScorePlayerTeam(new Scoreboard(), "allies");
        expect(target, viewer, true, "visible player");
        target.invisible = true;
        expect(target, viewer, false, "invisible without a team");
        target.team = team;
        expect(target, viewer, false, "invisible with a teamless viewer");
        viewer.team = new ScorePlayerTeam(new Scoreboard(), "enemy");
        expect(target, viewer, false, "invisible enemy");
        viewer.team = team; team.setSeeFriendlyInvisiblesEnabled(true);
        expect(target, viewer, true, "friendly invisibility enabled");
        team.setSeeFriendlyInvisiblesEnabled(false);
        expect(target, viewer, false, "friendly invisibility disabled");
    }

    private static void expect(StubPlayer target, StubPlayer viewer, boolean visible, String name) {
        if (PlayerLodServer.isVisibleToViewer(target, viewer) != visible) throw new AssertionError(name);
    }

    // Constructors are bypassed to test the policy without a world, server or client.
    private static final class StubPlayer extends EntityPlayerMP {
        boolean invisible;
        Team team;
        private StubPlayer() { super(null, null, null, null); }
        @Override public boolean isInvisible() { return invisible; }
        @Override public Team getTeam() { return team; }
    }

    private static boolean clientOnlyControl(EntityPlayerMP target, EntityPlayerMP viewer) {
        return target.isInvisibleToPlayer(viewer); // Deliberately inspected, never executed.
    }

    private static List<String> inspect(String name, String onlyMethod) throws Exception {
        List<String> violations = new ArrayList<String>();
        for (Object value : type(name).methods) {
            MethodNode method = (MethodNode)value;
            if (onlyMethod != null && !onlyMethod.equals(method.name)) continue;
            for (AbstractInsnNode insn = method.instructions.getFirst(); insn != null; insn = insn.getNext()) {
                if (insn instanceof MethodInsnNode) {
                    MethodInsnNode call = (MethodInsnNode)insn;
                    if (call.owner.startsWith("net/minecraft/") && stripped(call.owner, call.name, call.desc, false))
                        violations.add(name + "." + method.name + " -> " + call.owner + "." + call.name);
                } else if (insn instanceof FieldInsnNode) {
                    FieldInsnNode field = (FieldInsnNode)insn;
                    if (field.owner.startsWith("net/minecraft/") && stripped(field.owner, field.name, field.desc, true))
                        violations.add(name + "." + method.name + " -> " + field.owner + "." + field.name);
                }
            }
        }
        return violations;
    }

    private static boolean stripped(String owner, String name, String descriptor, boolean field) throws Exception {
        if (owner == null || owner.equals("java/lang/Object")) return false;
        ClassNode node = type(owner);
        if (clientOnly(node.visibleAnnotations) || clientOnly(node.invisibleAnnotations)) return true;
        if (field) {
            for (Object value : node.fields) {
                FieldNode member = (FieldNode)value;
                if (member.name.equals(name) && member.desc.equals(descriptor))
                    return clientOnly(member.visibleAnnotations) || clientOnly(member.invisibleAnnotations);
            }
        } else {
            for (Object value : node.methods) {
                MethodNode member = (MethodNode)value;
                if (member.name.equals(name) && member.desc.equals(descriptor))
                    return clientOnly(member.visibleAnnotations) || clientOnly(member.invisibleAnnotations);
            }
        }
        return stripped(node.superName, name, descriptor, field);
    }

    private static boolean clientOnly(List<?> annotations) {
        if (annotations == null) return false;
        for (Object value : annotations) {
            AnnotationNode annotation = (AnnotationNode)value;
            if (!"Lcpw/mods/fml/relauncher/SideOnly;".equals(annotation.desc) || annotation.values == null) continue;
            for (int i = 0; i < annotation.values.size(); i += 2) {
                Object side = annotation.values.get(i + 1);
                if (side instanceof String[] && "CLIENT".equals(((String[])side)[1])) return true;
            }
        }
        return false;
    }

    private static ClassNode type(String name) throws Exception {
        ClassNode result = classes.get(name);
        if (result == null) {
            try (InputStream in = PlayerLodServerChecks.class.getClassLoader().getResourceAsStream(name + ".class")) {
                if (in == null) throw new AssertionError("Missing class for server audit: " + name);
                result = new ClassNode(); new ClassReader(in).accept(result, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
            }
            classes.put(name, result);
        }
        return result;
    }
}
