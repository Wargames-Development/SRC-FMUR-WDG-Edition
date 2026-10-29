package com.flansmod.common.guns;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** Content-owned sensor limits; contains no client or graphics dependencies. */
public final class ThermalProfile {
    public static final ThermalProfile DEFAULT = new ThermalProfile(Collections.<String, String>emptyMap());
    public final int maxFramesPerSecond;
    public final int width, height, palette;
    public final float grain, contrast, sensitivity, bloom, gamma;
    private final Map<String, String> values;

    public ThermalProfile(int maxFramesPerSecond) {
        this(Collections.singletonMap("ThermalMaxFPS", Integer.toString(maxFramesPerSecond)));
    }

    public ThermalProfile(Map<String, String> values) {
        this.values = Collections.unmodifiableMap(new HashMap<>(values));
        maxFramesPerSecond = integer(value("ThermalMaxFPS", "30"), 1, 240);
        String[] resolution = value("ThermalResolution", "640 512").trim().split("[ ,]+", -1);
        if (resolution.length != 2) throw new IllegalArgumentException("ThermalResolution requires width and height");
        width = integer(resolution[0], 64, 2048);
        height = integer(resolution[1], 64, 2048);
        grain = number("ThermalGrain", 0F, 0F, 1F);
        contrast = number("ThermalContrast", 1F, 0.1F, 4F);
        sensitivity = number("ThermalSensitivity", 1F, 0.1F, 4F);
        bloom = number("ThermalBloom", 1F, 0F, 4F);
        gamma = number("ThermalGamma", 0.82F, 0.1F, 4F);
        String name = value("ThermalPalette", "WHITE_HOT");
        if ("WHITE_HOT".equalsIgnoreCase(name)) palette = 0;
        else if ("BLACK_HOT".equalsIgnoreCase(name)) palette = 1;
        else if ("IRONBOW".equalsIgnoreCase(name)) palette = 2;
        else if ("GREEN".equalsIgnoreCase(name)) palette = 3;
        else throw new IllegalArgumentException("Unknown thermal palette: " + name);
        for (String key : values.keySet()) {
            if (!isField(key)) throw new IllegalArgumentException("Unknown thermal profile field: " + key);
        }
    }

    public ThermalProfile with(String key, String value) {
        Map<String, String> updated = new HashMap<>(values);
        updated.put(key, value);
        return new ThermalProfile(updated);
    }

    public static boolean isField(String key) {
        return "ThermalMaxFPS".equals(key) || "ThermalResolution".equals(key)
                || "ThermalGrain".equals(key) || "ThermalContrast".equals(key)
                || "ThermalSensitivity".equals(key) || "ThermalBloom".equals(key)
                || "ThermalGamma".equals(key) || "ThermalPalette".equals(key);
    }

    private String value(String key, String fallback) {
        String value = values.get(key);
        return value == null ? fallback : value;
    }

    private float number(String key, float fallback, float min, float max) {
        float value = Float.parseFloat(value(key, Float.toString(fallback)));
        if (!Float.isFinite(value) || value < min || value > max)
            throw new IllegalArgumentException(key + " must be finite and between " + min + " and " + max);
        return value;
    }

    private static int integer(String text, int min, int max) {
        int value = Integer.parseInt(text);
        if (value < min || value > max) throw new IllegalArgumentException("Thermal integer must be between " + min + " and " + max);
        return value;
    }
}
