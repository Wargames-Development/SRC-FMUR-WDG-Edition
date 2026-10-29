package com.flansmod.client;

import java.util.IdentityHashMap;
import java.util.Map;

/** Render-thread admission control. Switching displays must not reset a sensor. */
final class ThermalSensorClock {
    private final Map<Object, Sample> samples = new IdentityHashMap<>();
    private Object world;

    boolean setWorld(Object nextWorld) {
        if (world == nextWorld) return false;
        samples.clear();
        world = nextWorld;
        return true;
    }

    boolean tryAcquire(Object device, int maxFramesPerSecond, long now) {
        if (device == null || maxFramesPerSecond < 1 || maxFramesPerSecond > 240) return false;
        Sample sample = samples.get(device);
        long interval = (1000000000L + maxFramesPerSecond - 1L) / maxFramesPerSecond;
        if (sample != null && now - sample.startedAt < interval) return false;
        if (sample == null) {
            sample = new Sample();
            samples.put(device, sample);
        }
        // Reserve before GPU work, including failed attempts. Never catch up in a burst.
        sample.startedAt = now;
        return true;
    }

    private static final class Sample {
        private long startedAt;
    }
}
