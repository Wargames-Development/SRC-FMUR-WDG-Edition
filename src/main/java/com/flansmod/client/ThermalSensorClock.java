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
        return tryAcquire(device, maxFramesPerSecond, now, false);
    }

    boolean tryAcquireVehicle(Object device, int maxFramesPerSecond, long now) {
        return tryAcquire(device, maxFramesPerSecond, now, true);
    }

    private boolean tryAcquire(Object device, int maxFramesPerSecond, long now, boolean vehicle) {
        if (device == null || maxFramesPerSecond < 1 || maxFramesPerSecond > 240) return false;
        Sample sample = samples.get(device);
        long interval = vehicle ? 1000000000L / maxFramesPerSecond
                : (1000000000L + maxFramesPerSecond - 1L) / maxFramesPerSecond;
        long phaseCorrection = 0;
        if (sample != null) {
            if (vehicle && sample.vehicleRate == maxFramesPerSecond) {
                long lateness = now - sample.nextAt;
                if (lateness < 0 || now - sample.startedAt < interval / 2) return false;
                // Preserve the schedule across normal frame jitter. Drop missed slots after a stall.
                if (lateness < interval) phaseCorrection = Math.min(lateness, interval / 2);
            } else if (now - sample.startedAt < interval) return false;
        }
        if (sample == null) {
            sample = new Sample();
            samples.put(device, sample);
        }
        // Reserve before GPU work, including failed attempts.
        sample.startedAt = now;
        sample.vehicleRate = vehicle ? maxFramesPerSecond : 0;
        sample.nextAt = now + interval - phaseCorrection;
        return true;
    }

    private static final class Sample {
        private long startedAt;
        private long nextAt;
        private int vehicleRate;
    }
}
