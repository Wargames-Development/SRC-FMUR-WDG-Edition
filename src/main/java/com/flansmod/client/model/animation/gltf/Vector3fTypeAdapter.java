package com.flansmod.client.model.animation.gltf;

import com.flansmod.common.vector.Vector3f;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class Vector3fTypeAdapter extends TypeAdapter<Vector3f> {

    @Override
    public void write(JsonWriter out, Vector3f value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.beginArray();
        out.value(value.getX());
        out.value(value.getY());
        out.value(value.getZ());
        out.endArray();
    }

    @Override
    public Vector3f read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        in.beginArray();
        float x = (float) in.nextDouble();
        float y = (float) in.nextDouble();
        float z = (float) in.nextDouble();
        in.endArray();
        return new Vector3f(x, y, z);
    }
}
