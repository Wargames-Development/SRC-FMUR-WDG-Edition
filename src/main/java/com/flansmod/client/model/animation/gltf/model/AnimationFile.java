package com.flansmod.client.model.animation.gltf.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class AnimationFile {
    @SerializedName("format_version")
    private String formatVersion;

    private Map<String, Animation> animations;

    public AnimationFile(String formatVersion, Map<String, Animation> animations) {
        this.formatVersion = formatVersion;
        this.animations = animations;
    }

    public AnimationFile() {
    }

    public String getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    public Map<String, Animation> getAnimations() {
        return animations;
    }

    public void setAnimations(Map<String, Animation> animations) {
        this.animations = animations;
    }

    @Override
    public String toString() {
        return "AnimationFile{" +
                "formatVersion='" + formatVersion + '\'' +
                ", animations=" + animations +
                '}';
    }
}
