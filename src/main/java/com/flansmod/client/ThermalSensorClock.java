package com.flansmod.client;

import java.util.IdentityHashMap;
import java.util.Map;

/** Render-thread admission control. Switching displays must not reset a sensor. */
final class ThermalSensorClock {
    private static final long NANOS_PER_SECOND = 1000000000L;
    private static final int MAX_SENSOR_FPS = 240;
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
        if (device == null || maxFramesPerSecond < 1 || maxFramesPerSecond > MAX_SENSOR_FPS) return false;
        Sample sample = samples.get(device);
        long interval = vehicle ? NANOS_PER_SECOND / maxFramesPerSecond
                : (NANOS_PER_SECOND + maxFramesPerSecond - 1L) / maxFramesPerSecond;
        long phaseCorrection = 0;
        if (sample != null) {
            if (sample.rate == maxFramesPerSecond && sample.vehicle == vehicle) {
                long lateness = now - sample.nextAt;
                if (lateness < 0 || now - sample.startedAt < interval / 2) return false;
                // Keep sub-frame lateness from accumulating and drop missed slots after a stall.
                if (lateness < interval) phaseCorrection = Math.min(lateness, interval / 2);
            } else if (now - sample.startedAt < interval) return false;
        }
        if (sample == null) {
            sample = new Sample();
            samples.put(device, sample);
        }
        // Reserve before GPU work, including failed attempts.
        if (!vehicle && !sample.reserveOpticSlot(maxFramesPerSecond, now)) return false;
        sample.startedAt = now;
        sample.rate = maxFramesPerSecond;
        sample.vehicle = vehicle;
        sample.nextAt = now + interval - phaseCorrection;
        return true;
    }

    private static final class Sample {
        private long startedAt;
        private long nextAt;
        private int rate;
        private boolean vehicle;
        private long[] opticStarts;
        private int opticCursor;
        private int opticCount;

        private boolean reserveOpticSlot(int limit, long now) {
            if (opticStarts == null) opticStarts = new long[MAX_SENSOR_FPS];
            // Phase correction can bunch samples near a window boundary. Enforce the cap over the last second.
            int oldest = (opticCursor + MAX_SENSOR_FPS - limit) % MAX_SENSOR_FPS;
            if (opticCount >= limit && now - opticStarts[oldest] < NANOS_PER_SECOND) return false;

            opticStarts[opticCursor] = now;
            opticCursor = (opticCursor + 1) % MAX_SENSOR_FPS;
            if (opticCount < MAX_SENSOR_FPS) opticCount++;
            return true;
        }
    }
}
