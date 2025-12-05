package com.flansmod.common.mob;

import java.util.Random;
/*
 * 用于BFMC击杀信息的显示
 */

public enum EnumFaction {
    ASS,
    REC,
    SUP,
    ENG;

    public static EnumFaction randomFaction(){
        int id = new Random(0).nextInt(4);
        switch (id){
            case 0: return ASS;
            case 1: return REC;
            case 2: return SUP;
            case 3: return ENG;
        }
        return ASS;
    }
}
