package com.flansmod.common;

import net.minecraft.item.Item;

import java.lang.reflect.Method;

public class ItemCompat {
    public static <T extends Item> T setUnlocalizedName(T item, String name) {
        invokeItemStringMethod(item, "setUnlocalizedName", "func_77655_b", name);
        return item;
    }

    public static <T extends Item> T setTextureName(T item, String textureName) {
        invokeItemStringMethod(item, "setTextureName", "func_111206_d", textureName);
        return item;
    }

    private static void invokeItemStringMethod(Item item, String mcpName, String srgName, String value) {
        if (invoke(item, mcpName, value)) {
            return;
        }
        if (invoke(item, srgName, value)) {
            return;
        }
        throw new IllegalStateException("Unable to call Item." + mcpName + " on " + item.getClass().getName());
    }

    private static boolean invoke(Item item, String methodName, String value) {
        try {
            Method method = Item.class.getMethod(methodName, String.class);
            method.invoke(item, value);
            return true;
        } catch (NoSuchMethodException ignored) {
            return false;
        } catch (Exception e) {
            throw new RuntimeException("Failed to call Item." + methodName + " on " + item.getClass().getName(), e);
        }
    }
}
