package com.flansmod.client;

import com.flansmod.common.guns.ThermalProfile;

/** Deterministic sensor timing checks; deliberately independent of the game/GL clock. */
public final class ThermalSensorChecks {
    private static int checks;

    public static void main(String[] args) {
        for (int gameFps : new int[] {20, 30, 60, 144, 240}) {
            for (int sensorFps : new int[] {1, 15, 30, 60, 240}) {
                ThermalSensorClock clock = new ThermalSensorClock();
                Object device = new Object();
                int samples = 0;
                long previous = Long.MIN_VALUE;
                long interval = (1000000000L + sensorFps - 1) / sensorFps;
                for (int frame = 0; frame < gameFps * 10; frame++) {
                    long now = frame * 1000000000L / gameFps;
                    if (clock.tryAcquire(device, sensorFps, now)) {
                        if (samples > 0) check(now - previous >= interval, "Sensor sampled too soon");
                        previous = now;
                        samples++;
                        check(!clock.tryAcquire(device, sensorFps, now), "Duplicate camera callback sampled again");
                    }
                }
                check(samples <= sensorFps * 10 && samples <= gameFps * 10, "Sensor/game FPS ceiling");
                check(samples > 0, "Sensor made progress");
            }
        }
        ThermalSensorClock clock = new ThermalSensorClock();
        Object world = new Object(), first = new Object(), second = new Object();
        check(clock.setWorld(world), "World starts a new sensor session");
        check(clock.tryAcquire(first, 10, 0), "Initial sample");
        check(clock.tryAcquire(second, 60, 1), "Different device has independent timing");
        check(!clock.setWorld(world), "Same world does not reset timing");
        check(!clock.tryAcquire(first, 10, 99999999L), "Switching away/back cannot reset the cap");
        check(clock.tryAcquire(first, 10, 100000000L), "Exact deadline samples");
        check(clock.tryAcquire(first, 10, 9000000000L), "Slow frame samples once");
        check(!clock.tryAcquire(first, 10, 9000000001L), "No catch-up burst");
        check(!clock.tryAcquire(first, 0, 9100000000L), "Invalid provider rate fails closed");
        check(!clock.tryAcquire(first, 241, 9100000000L), "Excessive provider rate fails closed");
        check(clock.setWorld(new Object()) && clock.tryAcquire(first, 10, 0), "World unload releases deadlines");
        clock = new ThermalSensorClock();
        check(clock.tryAcquire(first, 10, Long.MAX_VALUE - 50000000L), "Clock near wrap");
        check(clock.tryAcquire(first, 10, Long.MIN_VALUE + 50000000L), "nanoTime wrap uses elapsed time");
        for (int[] rates : new int[][] {{30, 30}, {60, 30}, {144, 60}, {60, 20}, {60, 15}}) {
            for (boolean jitter : new boolean[] {false, true}) {
                int gameFps = rates[0], vehicleFps = rates[1], samples = 0;
                clock = new ThermalSensorClock();
                for (int frame = 0; frame < gameFps * 10; frame++) {
                    long now = frame * 1000000000L / gameFps;
                    if (jitter) now += frame % 3 * 500000L;
                    if (clock.tryAcquireVehicle(first, vehicleFps, now)) samples++;
                    check(!clock.tryAcquireVehicle(first, vehicleFps, now), "Vehicle samples at most once per display frame");
                }
                if (gameFps == vehicleFps && jitter) {
                    // Varying frame time can delay the scheduled sample by a frame.
                    check(samples >= vehicleFps * 10 - 1 && samples <= vehicleFps * 10, "Vehicle cadence across equal-rate jitter");
                } else {
                    check(samples == vehicleFps * 10, "Vehicle cadence at " + gameFps + " FPS, " + vehicleFps + " Hz, jitter=" + jitter);
                }
            }
        }
        clock = new ThermalSensorClock();
        check(clock.tryAcquireVehicle(first, 10, 0), "Initial vehicle sample");
        check(!clock.tryAcquireVehicle(first, 10, 99999999L), "Re-entering the same vehicle view preserves its deadline");
        check(clock.tryAcquireVehicle(second, 10, 99999999L), "Vehicle devices keep independent deadlines");
        check(clock.tryAcquireVehicle(first, 10, 5400000000L), "Vehicle admits one sample after a stall");
        check(!clock.tryAcquireVehicle(first, 10, 5499999999L), "Vehicle drops missed slots after a stall");
        check(clock.tryAcquireVehicle(first, 10, 5500000000L), "Vehicle resumes on its next deadline");
        check(ThermalProfile.DEFAULT.maxFramesPerSecond == 30, "Legacy definitions use 30 FPS");
        ThermalProfile profile = ThermalProfile.DEFAULT.with("ThermalResolution", "320 256")
                .with("ThermalMaxFPS", "15").with("ThermalPalette", "IRONBOW")
                .with("ThermalGrain", "0.15").with("ThermalContrast", "1.5")
                .with("ThermalSensitivity", "0.75").with("ThermalBloom", "0");
        check(profile.width == 320 && profile.height == 256 && profile.maxFramesPerSecond == 15, "Native sensor dimensions and FPS");
        check(profile.palette == 2 && profile.grain == 0.15F && profile.bloom == 0, "Content-owned palette/noise/bloom");
        check(ThermalProfile.DEFAULT.width == 640 && ThermalProfile.DEFAULT.grain == 0, "Profile edits do not mutate defaults");
        for (String[] invalid : new String[][] {{"ThermalResolution", "0 256"}, {"ThermalResolution", "4096 256"},
                {"ThermalResolution", "256"}, {"ThermalGrain", "NaN"}, {"ThermalSensitivity", "Infinity"},
                {"ThermalGamma", "0"}, {"ThermalPalette", "INVALID"}, {"ThermalBloom", "-1"}, {"ThermalContrast", "8"}}) {
            try { profile.with(invalid[0], invalid[1]); throw new AssertionError("Invalid profile accepted"); }
            catch (IllegalArgumentException expected) { checks++; }
        }
        for (int fps : new int[] {Integer.MIN_VALUE, -1, 0, 241, Integer.MAX_VALUE}) {
            try {
                new ThermalProfile(fps);
                throw new AssertionError("Accepted invalid content rate " + fps);
            } catch (IllegalArgumentException expected) { checks++; }
        }
        System.out.println("PASS: " + checks + " thermal profile/admission checks.");
    }

    private static void check(boolean condition, String message) {
        checks++;
        if (!condition) throw new AssertionError(message);
    }
}
