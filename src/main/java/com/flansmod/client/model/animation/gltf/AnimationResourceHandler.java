package com.flansmod.client.model.animation.gltf;

import com.flansmod.client.model.animation.gltf.model.AnimationFile;
import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cpw.mods.fml.common.Loader;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class AnimationResourceHandler {

    public static Map<String, AnimationFile> animations = new HashMap<>();
    public static Gson gson = new GsonBuilder().registerTypeAdapter(Vector3f.class, new Vector3fTypeAdapter()).create();
    private static final String[] resourceDir = new String[]{
            "/resources/animations/",
            "/resources/mod/animations/",
            "/Flan/"
    };

    private static final String[] fileExtensions = new String[]{
            "json"
    };

    public static File checkValidPath(String path) {
        File file = null;
        for(int index = 0; index < fileExtensions.length && (file == null || !file.exists()); index++) {
            String absPath = path;
            if(!path.endsWith("." + fileExtensions[index]))
                absPath+= "." + fileExtensions[index];
            file = new File(absPath);
        }
        if(!file.exists()) return null;
        return file;
    }

    public static void addAnimationFile(String key, String path) {
        try {
            File animationFile = null;
            for (int i = 0; i < resourceDir.length && (animationFile == null || !animationFile.exists()); i++) {
                String absPath = new File(Loader.instance().getConfigDir().getParent(), resourceDir[i]).getAbsolutePath();
                if (!absPath.endsWith("/") || !absPath.endsWith("\\"))
                    absPath += "/";
                animationFile = checkValidPath(absPath + path);
            }
            if (animationFile == null || !animationFile.exists()) {
                FlansMod.log("The animation with the name " + path + " does not exist.");
                return;
            }
            FileReader fileReader = new FileReader(animationFile);
            animations.put(key, gson.fromJson(fileReader, AnimationFile.class));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
