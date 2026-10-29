package com.flansmod.client;

/** Geometry adapters borrow uploaded meshes and never run chunk builds or world events. */
public interface CameraTerrain {
    boolean begin(CameraView view);
    void draw(int pass);
    void close();
    default void destroy() { close(); }
}
