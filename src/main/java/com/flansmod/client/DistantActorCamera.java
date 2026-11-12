package com.flansmod.client;

import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

/** Optional DH-owned actors in this camera's native/heat depth encoding. */
final class DistantActorCamera {
    private static boolean resolved,active;
    private static Method owned,begin,nativeDraw,distant,end,beginShader;
    private DistantActorCamera() { }
    static boolean begin(CameraView view,boolean heat) {
        if(active) throw new IllegalStateException("Nested isolated actor camera");
        resolve();if(begin==null) return true;
        try {
            if(!Boolean.TRUE.equals(owned.invoke(null))) return true;
            float start=(float)Math.max(16,Minecraft.getMinecraft().gameSettings.renderDistanceChunks*16.0-16);
            active=Boolean.TRUE.equals(begin.invoke(null,Minecraft.getMinecraft().theWorld,view.projection,view.modelView,
                view.x,view.y,view.z,view.width,view.height,view.partialTicks,start,heat));
            return active;
        }catch(ReflectiveOperationException | RuntimeException | LinkageError failure){return false;}
    }
    static boolean supportsShader() { resolve();return beginShader!=null; }
    static boolean beginShader(CameraView view,int[] targets,FloatBuffer projection) {
        if(active) throw new IllegalStateException("Nested isolated actor camera");
        resolve();
        try {
            if(!Boolean.TRUE.equals(owned.invoke(null))) return true;
            active=Boolean.TRUE.equals(beginShader.invoke(null,Minecraft.getMinecraft().theWorld,view.projection,view.modelView,
                view.x,view.y,view.z,view.width,view.height,view.partialTicks,targets,projection));
            return active;
        }catch(ReflectiveOperationException | RuntimeException | LinkageError failure){return false;}
    }
    static boolean renderNative(Entity entity) {
        if(!active) return false;
        try{return Boolean.TRUE.equals(nativeDraw.invoke(null,entity));}
        catch(ReflectiveOperationException failure){throw new IllegalStateException("DH native camera model",failure);}
    }
    static void renderDistant() {
        if(!active) return;
        try{distant.invoke(null);}catch(ReflectiveOperationException failure){throw new IllegalStateException("DH distant camera models",failure);}
    }
    static void end() {
        if(!active) return;
        try{end.invoke(null);}catch(ReflectiveOperationException failure){throw new IllegalStateException("DH actor camera cleanup",failure);}
        finally{active=false;}
    }
    private static void resolve() {
        if(resolved)return;resolved=true;
        try {
            Class<?> api=Class.forName("com.seibel.distanthorizons.forge17.effects.ActorCameraApi",false,DistantActorCamera.class.getClassLoader());
            if(api.getField("API_VERSION").getInt(null)!=1)return;
            owned=api.getMethod("isOwned");nativeDraw=api.getMethod("renderNative",Entity.class);distant=api.getMethod("renderDistant");end=api.getMethod("end");
            begin=api.getMethod("begin",Object.class,FloatBuffer.class,FloatBuffer.class,double.class,double.class,double.class,
                int.class,int.class,float.class,float.class,boolean.class);
            try { beginShader=api.getMethod("beginShader",Object.class,FloatBuffer.class,FloatBuffer.class,double.class,double.class,double.class,
                int.class,int.class,float.class,int[].class,FloatBuffer.class); }
            catch(NoSuchMethodException olderCompanion) { beginShader=null; }
        }catch(ClassNotFoundException absent){ }
        catch(ReflectiveOperationException | LinkageError unsupported){com.flansmod.common.FlansMod.log("[Camera] Optional DH actor API unavailable: "+unsupported);}
    }
}
