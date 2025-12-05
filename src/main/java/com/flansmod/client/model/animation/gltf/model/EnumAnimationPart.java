package com.flansmod.client.model.animation.gltf.model;

public enum EnumAnimationPart {

    GUN("gun"),
    AMMO("ammo"),
    EXTRA_AMMO("extra_ammo"),
    REVOLVER_BARREL("revolver_barrel"),
    BREAK_ACTION("break_action"),
    SLIDE("slide"),
    PUMP("pump"),
    LEFT_ARM("left_arm"),
    RIGHT_ARM("right_arm");

    EnumAnimationPart(String shortname) {
        this.shortname = shortname;
    }

    public final String shortname;
}
