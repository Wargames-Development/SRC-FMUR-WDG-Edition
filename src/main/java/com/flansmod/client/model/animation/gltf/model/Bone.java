package com.flansmod.client.model.animation.gltf.model;

import com.flansmod.common.vector.Vector3f;

import java.util.Map;

public class Bone {
    private Map<Float, Vector3f> rotation;
    private Map<Float, Vector3f> position;

    public Bone(Map<Float, Vector3f> rotation, Map<Float, Vector3f> position) {
        this.rotation = rotation;
        this.position = position;
    }

    public Bone() {
    }

    public Map<Float, Vector3f> getRotation() {
        return rotation;
    }

    public void setRotation(Map<Float, Vector3f> rotation) {
        this.rotation = rotation;
    }

    public Map<Float, Vector3f> getPosition() {
        return position;
    }

    public void setPosition(Map<Float, Vector3f> position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Bone{" +
                "rotation=" + rotation +
                ", position=" + position +
                '}';
    }
}
