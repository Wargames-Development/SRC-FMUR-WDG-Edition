package com.flansmod.client.model.animation.gltf.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Animation {
    private boolean loop;

    @SerializedName("animation_length")
    private double animationLength;

    private Map<String, Bone> bones;

    @SerializedName("particle_effects")
    private Map<String, Object> particleEffects;

    public Animation(boolean loop, double animationLength, Map<String, Bone> bones, Map<String, Object> particleEffects) {
        this.loop = loop;
        this.animationLength = animationLength;
        this.bones = bones;
        this.particleEffects = particleEffects;
    }

    public Animation() {
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public double getAnimationLength() {
        return animationLength;
    }

    public void setAnimationLength(double animationLength) {
        this.animationLength = animationLength;
    }

    public Map<String, Bone> getBones() {
        return bones;
    }

    public void setBones(Map<String, Bone> bones) {
        this.bones = bones;
    }

    public Map<String, Object> getParticleEffects() {
        return particleEffects;
    }

    public void setParticleEffects(Map<String, Object> particleEffects) {
        this.particleEffects = particleEffects;
    }

    @Override
    public String toString() {
        return "Animation{" +
                "loop=" + loop +
                ", animationLength=" + animationLength +
                ", bones=" + bones +
                ", particleEffects=" + particleEffects +
                '}';
    }
}
