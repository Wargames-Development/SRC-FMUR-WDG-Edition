package com.flansmod.client;

import java.awt.Color;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL20;

/** Read-only DH fog snapshot for colour fallback terrain; never changes DH overrides. */
final class CameraDhFog {
    // These are DH's far/height fog equations, evaluated at the actual relative
    // world position rather than attempting to invert our compressed actor depth.
    static final String SHADER =
        "uniform bool dhFogEnabled;uniform vec3 dhFogColor;uniform vec4 dhFarFog,dhHeightFog;"
        + "uniform vec4 dhFogShape;uniform vec4 dhHeightShape;uniform vec4 dhHeightDirection;"
        + "varying vec3 fogPosition;"
        + "float fogThickness(float d,vec4 p,float density,float falloff){"
        + "float x=max((d-p.x)/max(p.y,0.000001),0.0);"
        + "if(falloff<0.5)return p.z+p.w*clamp(x,0.0,1.0);"
        + "x*=density;if(falloff>1.5)x*=x;return p.z+p.w*(1.0-exp(-x));}"
        + "vec3 applyDhFog(vec3 colour){if(!dhFogEnabled)return colour;"
        + "float mode=dhFogShape.w;float d=(mode<0.5?length(fogPosition):length(fogPosition.xz))*dhFogShape.x;"
        + "float f=fogThickness(d,dhFarFog,dhFogShape.y,dhFogShape.z);float h=0.0;"
        + "if(mode>1.5){float y=fogPosition.y;"
        + "if(dhHeightDirection.x<0.5)y-=dhHeightShape.x;"
        + "if(dhHeightDirection.y>0.5&&dhHeightDirection.z>0.5)y=abs(y);"
        + "else if(dhHeightDirection.y>0.5)y=-y;else if(dhHeightDirection.z<0.5)y=0.0;"
        + "h=fogThickness(y*dhHeightShape.y,dhHeightFog,dhHeightShape.z,dhHeightShape.w);"
        + "if(mode<2.5)f=max(f,h);else if(mode<3.5)f+=h;else if(mode<4.5)f*=h;"
        + "else if(mode<5.5)f=1.0-(1.0-f)*(1.0-h);else if(mode<6.5)f+=max(f,h);"
        + "else if(mode<7.5)f+=f*h;else if(mode<8.5)f+=1.0-(1.0-f)*(1.0-h);else f=(f+h)*0.5;}"
        + "return mix(colour,dhFogColor,clamp(f,0.0,1.0));}\n";

    private final Map<String, Method> methods = new HashMap<>();
    private Object graphics, fog, far, height, renderWrapper;
    private Method fogColour, skyColour, specialFog;
    private boolean checked, failed;

    void apply(int program, CameraView view, int maxHeight) {
        GL20.glUniform1i(GL20.glGetUniformLocation(program, "dhFogEnabled"), 0);
        if (failed) return;
        try {
            if (!checked) resolve();
            if (fog == null || !Boolean.TRUE.equals(value(fog, "enableDhFog"))) return;
            boolean special = (Boolean) specialFog.invoke(renderWrapper);
            boolean sky = value(fog, "color").toString().equals("USE_SKY_COLOR") && !special;
            Color colour = (Color) (sky ? skyColour.invoke(renderWrapper) : fogColour.invoke(renderWrapper, view.partialTicks));
            float start = number(far, "farFogStartDistance"), end = number(far, "farFogEndDistance");
            float min = number(far, "farFogMinThickness"), max = number(far, "farFogMaxThickness");
            float density = number(far, "farFogDensity");
            if (special) { start = 0; end = 1; min = max = density = 1; }
            vector(program, "dhFarFog", start, end - start, min, max - min);
            int mode = enumValue(value(height, "heightFogMixMode"));
            vector(program, "dhFogShape", 1.0f / Math.max(16, number(graphics, "chunkRenderDistance") * 16),
                density, enumValue(value(far, "farFogFalloff")), mode);
            // Match the current DH renderer's height uniform uploads, including
            // its use of the far minimum/range/density for the height component.
            float hs = number(height, "heightFogStartingHeightPercent");
            vector(program, "dhHeightFog", hs, number(height, "heightFogEndingHeightPercent") - hs, min, max - min);
            vector(program, "dhHeightShape", number(height, "heightFogBaseHeight") - (float)view.y,
                1.0f / Math.max(1, maxHeight), density, enumValue(value(height, "heightFogFalloff")));
            Object direction = value(height, "heightFogDirection");
            vector(program, "dhHeightDirection", flag(direction, "basedOnCamera"), flag(direction, "fogAppliesDown"),
                flag(direction, "fogAppliesUp"), 0);
            GL20.glUniform3f(GL20.glGetUniformLocation(program, "dhFogColor"),
                colour.getRed() / 255f, colour.getGreen() / 255f, colour.getBlue() / 255f);
            GL20.glUniform1i(GL20.glGetUniformLocation(program, "dhFogEnabled"), 1);
        } catch (ReflectiveOperationException | RuntimeException | LinkageError failure) {
            failed = true;
            org.apache.logging.log4j.LogManager.getLogger("FMUR").warn("Optional DH colour-camera fog unavailable", failure);
        }
    }

    private void resolve() throws ReflectiveOperationException {
        resolve(getClass().getClassLoader());
    }

    private void resolve(ClassLoader loader) throws ReflectiveOperationException {
        checked = true;
        Object configs = Class.forName("com.seibel.distanthorizons.api.DhApi$Delayed", true, loader).getField("configs").get(null);
        if (configs == null) { checked = false; return; }
        graphics = call(configs, "graphics"); fog = call(graphics, "fog");
        far = call(fog, "farFog"); height = call(fog, "heightFog");
        Class<?> wrapper = Class.forName("com.seibel.distanthorizons.core.wrapperInterfaces.minecraft.IMinecraftRenderWrapper", true, loader);
        Class<?> injector = Class.forName("com.seibel.distanthorizons.core.dependencyInjection.SingletonInjector", true, loader);
        renderWrapper = injector.getMethod("get", Class.class).invoke(injector.getField("INSTANCE").get(null), wrapper);
        fogColour = wrapper.getMethod("getFogColor", float.class);
        skyColour = wrapper.getMethod("getSkyColor"); specialFog = wrapper.getMethod("isFogStateSpecial");
    }

    private Object call(Object owner, String name) throws ReflectiveOperationException {
        String key = owner.getClass().getName() + ":" + name;
        Method method = methods.get(key);
        if (method == null) { method = owner.getClass().getMethod(name); methods.put(key, method); }
        return method.invoke(owner);
    }
    private Object value(Object owner, String name) throws ReflectiveOperationException { return call(call(owner, name), "getValue"); }
    private float number(Object owner, String name) throws ReflectiveOperationException { return ((Number)value(owner, name)).floatValue(); }
    private static int enumValue(Object value) throws ReflectiveOperationException { return value.getClass().getField("value").getInt(value); }
    private static float flag(Object value, String field) throws ReflectiveOperationException { return value.getClass().getField(field).getBoolean(value) ? 1 : 0; }
    private static void vector(int program, String name, float x, float y, float z, float w) {
        GL20.glUniform4f(GL20.glGetUniformLocation(program, name), x, y, z, w);
    }
}
