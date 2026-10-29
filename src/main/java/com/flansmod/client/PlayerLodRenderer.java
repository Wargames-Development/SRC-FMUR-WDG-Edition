package com.flansmod.client;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.playerlod.PlayerLodSnapshot;
import com.flansmod.common.teams.PlayerEquipmentInventory;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;

/** One presentation stream/model on both sides of the terrain boundary. Actors never join WorldClient. */
@SideOnly(Side.CLIENT)
public final class PlayerLodRenderer {
    private static final ArrayBlockingQueue<Delivery> pending = new ArrayBlockingQueue<Delivery>(64);
    private static PlayerLodRenderer instance;
    private final Map<UUID, Contact> contacts = new HashMap<UUID, Contact>();
    private final FloatBuffer modelview = BufferUtils.createFloatBuffer(16);
    private final FloatBuffer projection = BufferUtils.createFloatBuffer(16);
    private final PlayerLodDepthLayer layer = new PlayerLodDepthLayer();
    private final double[] targets = new double[PlayerLodSnapshot.MAX_PLAYERS * 3];
    private final double[] radii = new double[PlayerLodSnapshot.MAX_PLAYERS];
    private final Contact[] candidates = new Contact[PlayerLodSnapshot.MAX_PLAYERS];
    private World world;
    private Object connection;
    private long sequence = Long.MIN_VALUE, lastReceived;
    private int range, serverViewDistance = 8;
    private boolean rendering;

    public static void register() {
        if (instance != null) return;
        instance = new PlayerLodRenderer();
        MinecraftForge.EVENT_BUS.register(instance);
        FMLCommonHandler.instance().bus().register(instance);
    }

    public static void enqueue(PlayerLodSnapshot snapshot) {
        // Packet callbacks only publish immutable data. All entity/GL work happens on client ticks.
        Minecraft mc = Minecraft.getMinecraft();
        Delivery delivery = new Delivery(snapshot, mc.getNetHandler(), mc.theWorld);
        if (!pending.offer(delivery)) {
            // Bound a stalled client's memory. Missing appearance revisions are withheld
            // until the next repair snapshot rather than reusing unrelated equipment.
            pending.clear(); pending.offer(delivery);
        }
    }

    @SubscribeEvent public void tick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        Minecraft mc = Minecraft.getMinecraft();
        if (world != mc.theWorld || connection != mc.getNetHandler()) {
            contacts.clear(); sequence = Long.MIN_VALUE; range = 0;
            world = mc.theWorld; connection = mc.getNetHandler();
        }
        if (world == null || mc.thePlayer == null) { contacts.clear(); pending.clear(); return; }
        Delivery delivery;
        while ((delivery = pending.poll()) != null) {
            if (delivery.world == world && delivery.connection == connection
                    && delivery.snapshot.dimension == mc.thePlayer.dimension
                    && delivery.snapshot.viewer.equals(mc.thePlayer.getUniqueID())
                    && delivery.snapshot.sequence > sequence) {
                PlayerLodSnapshot snapshot = delivery.snapshot;
                sequence = snapshot.sequence; range = snapshot.range; lastReceived = System.nanoTime();
                serverViewDistance = snapshot.serverViewDistance;
                Set<UUID> live = new HashSet<UUID>();
                for (PlayerLodSnapshot.Entry entry : snapshot.entries) {
                    live.add(entry.uuid);
                    Contact contact = contacts.get(entry.uuid);
                    if (contact == null || contact.actor.getEntityId() != entry.id) {
                        if (entry.appearance == null) continue;
                        contact = new Contact(world, entry); contacts.put(entry.uuid, contact);
                    }
                    if (entry.appearance != null) contact.appearance(entry);
                    if (contact.revision == entry.revision) contact.observe(entry);
                    else contacts.remove(entry.uuid);
                }
                contacts.keySet().retainAll(live);
            }
        }
        if (System.nanoTime() - lastReceived > 1000000000L) contacts.clear();
        for (Contact contact : contacts.values()) contact.tick();
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void replaceNative(RenderPlayerEvent.Pre event) {
        EntityPlayer player = event.entityPlayer;
        double dx = mix(player.lastTickPosX, player.posX, event.partialRenderTick) - RenderManager.instance.viewerPosX;
        double dy = mix(player.lastTickPosY, player.posY, event.partialRenderTick) - RenderManager.instance.viewerPosY;
        double dz = mix(player.lastTickPosZ, player.posZ, event.partialRenderTick) - RenderManager.instance.viewerPosZ;
        double distanceSq = dx * dx + dy * dy + dz * dz;
        if (!rendering && world == event.entityPlayer.worldObj
                && contacts.containsKey(event.entityPlayer.getUniqueID())
                && distanceSq <= square(range) && distanceSq > square(maskStart())) event.setCanceled(true);
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public void render(RenderWorldLastEvent event) { renderPlayers(event.partialTicks); }

    /** Also used by the scope's heat mask, which deliberately does not dispatch world-last again. */
    public static void renderHeat(float partialTicks) {
        if (instance != null) instance.renderPlayers(partialTicks);
    }

    private void renderPlayers(float partialTicks) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.theWorld != world || mc.thePlayer == null || contacts.isEmpty() || rendering) return;
        double cx = RenderManager.instance.viewerPosX, cy = RenderManager.instance.viewerPosY,
                cz = RenderManager.instance.viewerPosZ;
        // Match MCHR's shared world-depth transition, including scoped cameras.
        double start = transitionStart();
        int count = 0;
        rendering = true;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        float oldLightX = OpenGlHelper.lastBrightnessX, oldLightY = OpenGlHelper.lastBrightnessY;
        try {
            modelview.clear(); projection.clear();
            GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, modelview);
            GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, projection);
            mc.entityRenderer.enableLightmap(partialTicks);
            for (Contact contact : contacts.values()) {
                contact.visual = contact.nativePlayer();
                boolean nativeLoaded = contact.visual != null;
                if (!nativeLoaded) contact.visual = contact.actor;
                contact.x = mix(contact.visual.lastTickPosX, contact.visual.posX, partialTicks);
                contact.y = mix(contact.visual.lastTickPosY, contact.visual.posY, partialTicks);
                contact.z = mix(contact.visual.lastTickPosZ, contact.visual.posZ, partialTicks);
                double distance = Math.sqrt(square(contact.x - cx) + square(contact.y - cy) + square(contact.z - cz));
                if (distance > range || contact.visual.isInvisibleToPlayer(mc.thePlayer)) continue;
                if (distance > maskStart() || !nativeLoaded) {
                    candidates[count] = contact;
                    targets[count * 3] = contact.x; targets[count * 3 + 1] = contact.y; targets[count * 3 + 2] = contact.z;
                    radii[count] = 4.0D; ++count;
                }
            }
            boolean[] ready = count == 0 ? null : PlayerLodTerrain.depth(mc.thePlayer.dimension,
                    cx, cy, cz, start, targets, radii, count);
            for (int i = 0; i < count; i++) {
                Contact contact = candidates[i]; candidates[i] = null;
                if (ready == null || !ready[i]) {
                    // Warm the CPU query corridor, but a few clear sample rays cannot
                    // establish exact pixel visibility of a human behind partial cover.
                    PlayerLodTerrain.warmCorridor(mc.thePlayer.dimension, cx, cy, cz, contact.x, contact.y, contact.z);
                    continue;
                }
                double dx = contact.x - cx, dy = contact.y - cy, dz = contact.z - cz;
                double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
                if (distance <= start) {
                    draw(contact, partialTicks, 1.0D, 0, 1, false);
                    continue;
                }
                double scale = PlayerLodProjection.projected(distance, start) / distance;
                double eye = -(modelview.get(2) * dx + modelview.get(6) * dy + modelview.get(10) * dz);
                if (eye <= 0) continue;
                boolean precision = layer.begin(contact.x, contact.y, contact.z,
                        cx, cy, cz, start, modelview, projection);
                if (!precision) continue; // Never collapse a sniper target's armour/self-depth silently.
                boolean completed = false;
                try { draw(contact, partialTicks, scale, 0, 1, true); completed = true; }
                finally { layer.finish(completed, 0, 1, projection.get(10), projection.get(14)); }
            }
        } finally {
            mc.entityRenderer.disableLightmap(partialTicks);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, oldLightX, oldLightY);
            GL11.glPopAttrib(); rendering = false;
        }
    }

    private void draw(Contact contact, float partialTicks, double scale, double near, double far, boolean precision) {
        Render renderer = RenderManager.instance.getEntityRenderObject(contact.visual);
        if (renderer == null) return;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushMatrix();
        try {
            GL11.glTranslated((contact.x - RenderManager.instance.viewerPosX) * scale,
                    (contact.y - RenderManager.instance.viewerPosY) * scale,
                    (contact.z - RenderManager.instance.viewerPosZ) * scale);
            GL11.glScaled(scale, scale, scale);
            GL11.glDepthRange(near, far);
            GL11.glEnable(GL11.GL_DEPTH_TEST); GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_NORMALIZE);
            if (scale < 1) GL11.glDisable(GL11.GL_FOG);
            RenderHelper.enableStandardItemLighting();
            GL11.glEnable(GL11.GL_BLEND);
            if (precision) GL14.glBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA,
                    GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,
                    contact.latest.brightness & 65535, contact.latest.brightness >>> 16);
            GL11.glColor4f(1, 1, 1, 1);
            renderer.doRender(contact.visual, 0, 0, 0, contact.visual.rotationYaw, partialTicks);
        } finally { GL11.glPopMatrix(); GL11.glPopAttrib(); }
    }

    private static double square(double value) { return value * value; }
    private static double mix(double a, double b, float t) { return a + (b - a) * t; }
    private static double transitionStart() {
        return Math.max(16.0D, Minecraft.getMinecraft().gameSettings.renderDistanceChunks * 16.0D - 16.0D);
    }
    private double maskStart() {
        // Cover native section rebuilds and the terrain/LOD handoff before the
        // visual projection changes. Match the vehicle renderer's overlap.
        return Math.max(16.0D, Math.min(transitionStart(), Math.max(16.0D, (serverViewDistance - 1) * 16.0D)) - 16.0D);
    }

    private static final class Delivery {
        final PlayerLodSnapshot snapshot;
        final Object connection;
        final World world;
        Delivery(PlayerLodSnapshot snapshot, Object connection, World world) {
            this.snapshot = snapshot; this.connection = connection; this.world = world;
        }
    }

    private static final class Contact {
        final VisualPlayer actor;
        EntityPlayer visual;
        PlayerLodSnapshot.Entry latest;
        int revision;
        double x, y, z;

        Contact(World world, PlayerLodSnapshot.Entry entry) {
            actor = new VisualPlayer(world, entry.appearance.profile);
            actor.setEntityId(entry.id);
            actor.setPosition(entry.x, entry.y, entry.z);
            actor.lastTickPosX = entry.x; actor.lastTickPosY = entry.y; actor.lastTickPosZ = entry.z;
            actor.rotationYaw = actor.prevRotationYaw = entry.yaw;
            actor.rotationPitch = actor.prevRotationPitch = entry.pitch;
            appearance(entry);
        }

        void appearance(PlayerLodSnapshot.Entry entry) {
            revision = entry.revision;
            for (int i = 0; i < 5; i++) actor.setCurrentItemOrArmor(i, copy(entry.appearance.equipment[i]));
            PlayerHandler.getPlayerData(actor, Side.CLIENT).offHandGunStack = copy(entry.appearance.equipment[5]);
            PlayerEquipmentInventory equipment = PlayerEquipmentInventory.get(actor);
            if (equipment != null) equipment.setSyncedContents(copy(entry.appearance.equipment[6]), copy(entry.appearance.equipment[7]));
        }

        void observe(PlayerLodSnapshot.Entry entry) {
            latest = entry;
            if (square(actor.posX - entry.x) + square(actor.posY - entry.y) + square(actor.posZ - entry.z) > 4096)
                actor.setPosition(entry.x, entry.y, entry.z);
            actor.setPositionAndRotation2(entry.x, entry.y, entry.z, entry.yaw, entry.pitch, 3);
        }

        void tick() {
            actor.lastTickPosX = actor.prevPosX = actor.posX;
            actor.lastTickPosY = actor.prevPosY = actor.posY;
            actor.lastTickPosZ = actor.prevPosZ = actor.posZ;
            actor.prevRotationYaw = actor.rotationYaw; actor.prevRotationPitch = actor.rotationPitch;
            // EntityOtherPlayerMP's interpolation only; never tick gameplay, collision, sound or chunks.
            actor.onLivingUpdate();
            actor.prevRotationYawHead = actor.rotationYawHead; actor.rotationYawHead = latest.headYaw;
            actor.prevRenderYawOffset = actor.renderYawOffset; actor.renderYawOffset = latest.bodyYaw;
            actor.prevLimbSwingAmount = actor.limbSwingAmount; actor.limbSwingAmount = latest.limbAmount;
            actor.limbSwing = latest.limb;
            actor.prevSwingProgress = actor.swingProgress; actor.swingProgress = latest.swing;
            actor.flags = latest.flags; actor.bedYaw = latest.bedYaw; actor.ticksExisted = latest.ticks;
            actor.setSneaking((latest.flags & 1) != 0); actor.setSprinting((latest.flags & 2) != 0);
            actor.setInvisible((latest.flags & 4) != 0);
            ItemStack held = actor.getHeldItem();
            if ((latest.flags & 64) != 0 && held != null) actor.setItemInUse(held, held.getMaxItemUseDuration());
            else actor.clearItemInUse();
            actor.brightness = latest.brightness;
            EntityPlayer nativePlayer = nativePlayer();
            if (nativePlayer != null) {
                // Seed tracker exit from the same interpolation pose that was just rendered.
                // The server stream remains available while the real entity/chunk disappears.
                actor.setPosition(nativePlayer.posX, nativePlayer.posY, nativePlayer.posZ);
                actor.lastTickPosX = nativePlayer.lastTickPosX;
                actor.lastTickPosY = nativePlayer.lastTickPosY;
                actor.lastTickPosZ = nativePlayer.lastTickPosZ;
                actor.rotationYaw = nativePlayer.rotationYaw; actor.prevRotationYaw = nativePlayer.prevRotationYaw;
                actor.rotationPitch = nativePlayer.rotationPitch; actor.prevRotationPitch = nativePlayer.prevRotationPitch;
                actor.rotationYawHead = nativePlayer.rotationYawHead; actor.prevRotationYawHead = nativePlayer.prevRotationYawHead;
                actor.renderYawOffset = nativePlayer.renderYawOffset; actor.prevRenderYawOffset = nativePlayer.prevRenderYawOffset;
                actor.limbSwing = nativePlayer.limbSwing; actor.limbSwingAmount = nativePlayer.limbSwingAmount;
                actor.prevLimbSwingAmount = nativePlayer.prevLimbSwingAmount;
            }
        }
        EntityPlayer nativePlayer() {
            net.minecraft.entity.Entity entity = actor.worldObj.getEntityByID(actor.getEntityId());
            return entity instanceof EntityPlayer && entity != actor && !entity.isDead
                    && entity.getUniqueID().equals(actor.getUniqueID()) ? (EntityPlayer)entity : null;
        }
        private static ItemStack copy(ItemStack stack) { return stack == null ? null : stack.copy(); }
    }

    private static final class VisualPlayer extends EntityOtherPlayerMP {
        int flags;
        float bedYaw;
        int brightness;
        VisualPlayer(World world, com.mojang.authlib.GameProfile profile) { super(world, profile); }
        @Override public boolean isRiding() { return (flags & 16) != 0; }
        @Override public boolean isPlayerSleeping() { return (flags & 32) != 0; }
        @Override public float getBedOrientationInDegrees() { return bedYaw; }
        @Override public int getBrightnessForRender(float partialTicks) { return brightness; }
        @Override public float getBrightness(float partialTicks) { return 1.0F; }
    }
}
