package com.flansmod.utils;

import net.minecraft.item.Item;

public class ItemUtils {

    public static Item getItemByName(String nm) {
        return (Item)Item.itemRegistry.getObject(nm);
    }

}
