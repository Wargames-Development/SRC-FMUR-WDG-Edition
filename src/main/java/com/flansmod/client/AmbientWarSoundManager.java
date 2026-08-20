package com.flansmod.client;

import com.flansmod.common.network.PacketPlaySound;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

/** Owns one refreshable looping sound per ambience block on the client. */
@SideOnly(Side.CLIENT)
public final class AmbientWarSoundManager {
    private static final float AUDIBLE_RADIUS = PacketPlaySound.AMBIENT_WAR_SOUND_RADIUS;
    private static final int REFRESH_TIMEOUT_TICKS = 80;
    private static final Map<SourceKey, AmbientWarSound> ACTIVE_SOUNDS =
            new HashMap<>();
    private static World currentWorld;

    private AmbientWarSoundManager() {
    }

    public static void setActive(int x, int y, int z, boolean active) {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.theWorld != currentWorld) {
            stopAll();
            currentWorld = minecraft.theWorld;
        }
        if (currentWorld == null)
            return;

        SourceKey key = new SourceKey(currentWorld.provider.dimensionId, x, y, z);
        AmbientWarSound sound = ACTIVE_SOUNDS.get(key);
        if (!active) {
            if (sound != null)
                sound.stop();
            return;
        }
        if (minecraft.thePlayer == null
                || minecraft.thePlayer.getDistanceSq(x + 0.5D, y + 0.5D, z + 0.5D)
                >= AUDIBLE_RADIUS * AUDIBLE_RADIUS)
            return;

        if (sound != null) {
            sound.refresh();
            return;
        }

        sound = new AmbientWarSound(key,
                FlansModResourceHandler.getSound("ambientdistantgunfire"));
        ACTIVE_SOUNDS.put(key, sound);
        minecraft.getSoundHandler().playSound(sound);
    }

    private static void stopAll() {
        for (AmbientWarSound sound : ACTIVE_SOUNDS.values())
            sound.markStopped();
        ACTIVE_SOUNDS.clear();
    }

    private static final class AmbientWarSound extends MovingSound {
        private final SourceKey key;
        private int refreshTicks = REFRESH_TIMEOUT_TICKS;

        private AmbientWarSound(SourceKey key, ResourceLocation resource) {
            super(resource);
            this.key = key;
            repeat = true;
            field_147665_h = 0;
            volume = 1F;
            xPosF = key.x + 0.5F;
            yPosF = key.y + 0.5F;
            zPosF = key.z + 0.5F;
        }

        private void refresh() {
            refreshTicks = REFRESH_TIMEOUT_TICKS;
        }

        private void stop() {
            donePlaying = true;
            ACTIVE_SOUNDS.remove(key);
        }

        private void markStopped() {
            donePlaying = true;
        }

        @Override
        public ISound.AttenuationType getAttenuationType() {
            // This stereo track is environmental ambience; range is enforced explicitly.
            return ISound.AttenuationType.NONE;
        }

        @Override
        public void update() {
            Minecraft minecraft = Minecraft.getMinecraft();
            if (--refreshTicks <= 0 || minecraft.theWorld != currentWorld
                    || minecraft.thePlayer == null
                    || minecraft.thePlayer.getDistanceSq(xPosF, yPosF, zPosF)
                    >= AUDIBLE_RADIUS * AUDIBLE_RADIUS) {
                stop();
            }
        }
    }

    private static final class SourceKey {
        private final int dimension;
        private final int x;
        private final int y;
        private final int z;

        private SourceKey(int dimension, int x, int y, int z) {
            this.dimension = dimension;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object)
                return true;
            if (!(object instanceof SourceKey))
                return false;
            SourceKey other = (SourceKey)object;
            return dimension == other.dimension && x == other.x
                    && y == other.y && z == other.z;
        }

        @Override
        public int hashCode() {
            int result = dimension;
            result = 31 * result + x;
            result = 31 * result + y;
            return 31 * result + z;
        }
    }
}
