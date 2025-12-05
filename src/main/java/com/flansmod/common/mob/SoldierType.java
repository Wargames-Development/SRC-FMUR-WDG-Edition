package com.flansmod.common.mob;

import java.io.Serializable;
import java.util.*;

public class SoldierType implements Serializable {
    public static final String[] customNamePool = {
            "blubluu", "Blood_Bleed", "Xuan", "HAPPY_233", "sheep_207", "fate_sheep", "Diaoye_008", "ORTWWO", "salu_lian", "A_cult_leder",
            "T_Obsession", "Viagar", "ROSE_Animate118", "aaaaaazn", "Fulcrum29", "TOM_cat14", "Hakureimu", "Hornet18", "RaFALe_F1",
            "heluxiaofu", "secfee", "ingen_", "VGBVHH", "554885_F", "Ruthless", "Falck121", "MackayO1", "SA-15TOR", "HarrierFGA", "Z_Viper1",
            "Fishbed_21", "blubluuu" , "YeJinTian", "DongJinXin", "TV9O", "KabOk", "Wheat233", "WO_TM_CALL_110", "WO_CAO_YOU_GUA", "ddd234",
            "VCAGEQz", "1984", "Tao_ti", "MrTwelve", "Black_jinhuayezi", "kvz", "Tao_Fen", "pao_c", "098754", "332bbb", "Big_Yellow_3gg", "Mareep",
            "Speed_Nice"
    };

    public static final String[] genericFirstNamePool = {
            "A", "B", "C", "D", "E", "F", "G", "H", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "W", "Z", "P.K"
    };

    public static final String[] genericLastNamePool = {
            "Tom", "Karlsson", "Edgren" , "Johansson", "Jonsson" ,"Wallberg", "Andersson", "Karlsson", "Bergqvist", "Hornlund",
            "Lopez", "Gothberg", "Hoyles", "Kopparhed", "Cyreus", "Dahl", "Bagge", "Laedre", "Martensson", "Eriksson", "Sundberg", "Goksu",
            "Fegraeus", "Lindblom", "Stenkvist" , "Lord", "Fujita", "Sjovold", "Holmsten", "Ostman", "Soderman", "Wiksten", "Sanick", "Salt",
            "Doran", "Lindgren",  "Sjoberg", "Votypka", "Pajor", "Andersson", "Lindholm", "OShaughnessy", "Stromquist", "Strandberg", "Fritze",
            "Norberg", "Hedberg", "Carlen", "Sirland", "Dawsari", "Gustavsson", "Bergqvist", "Kjellstrom", "Soderlund", "Gonzales",
            "Crabtree", "Tou", "Pigula", "Le", "Pace", "Lee", "Walton", "King", "Morales", "Castillo", "Persson", "Rask", "Dohl", "Kylmamaa",
            "Parkinson", "Newton", "Papasavas", "Josephson", "Decker", "Rudberg", "Hedlund", "Grass", "Aberg", "Smedberg", "Osterblom", "Evans",
            "Abdey", "Aberin", "Belanger", "Biro", "Brassard", "Ceron", "Choy", "Davey", "Douridas", "Elliott", "Evans", "Gimbel", "Hallwood",
            "Hart", "Hoang", "Kerr", "Liliegren", "Linde", "Livesey", "Love", "Marini", "North", "Pinkerton", "Price", "Rickard", "Ross",
            "White", "Yip", "Young", "Yee", "Vifian", "Smith", "Brown", "Flyte", "Barnett", "Cassidy", "Kingston", "Ackworth",
            "VanRooyen", "Hartling", "Hargelid", "Clarke", "Dijkstra", "Kubernetes"
    };

    public static Random rand = new Random();

    public static Map<String, SoldierType> soldierTypeMap = new WeakHashMap<>();

    /**
     * 士兵类型的唯一标识
     */
    public UUID uuid;
    /**
     * 索敌距离
     */
    public float targetRange = 20F;
    /**
     * 索敌间隔
     */
    public float targetAcquireInterval = 10;
    /**
     * 射击次数达到多少时休息
     */
    public int countRestAfterShoot = -1;
    /**
     * 休息时间 单位tick
     */
    public int restTime = 0;
    public String lockOnSound;
    public double topViewLimit;
    public double bottomViewLimit;
    public double yawViewLimit;
    /**
     * 索敌后多少tick开始射击
     */
    public int shootStartTick;
    /**
     * 开镜瞄准距离
     */
    public float distToADS;
    /**
     * 索敌最大时间，超过该时间放弃索敌
     */
    public int maxLockOnTime;
    /**
     * 下蹲开枪距离
     */
    public float distToSneak;
    /**
     * IDLE状态下随机移动间隔
     */
    public int movingUpdateTime;
    /**
     * 随机移动最大时间
     */
    public int movingMaxTime;
    /**
     * 换弹后多少tick后躲避
     */
    public int escapeOnReloadTime;

    /**
     * 射击散布倍率
     */
    public float spreadMultiplier;

    /**
     * 是否锁定飞机
     */
    public boolean lockOnPlane;

    /**
     * 是否锁定AAGun
     */
    public boolean lockOnAAGun;

    /**
     * 最大存在时长
     */
    public int maxExistingTick = 60 * 20;

    public static SoldierType randomType() {
        SoldierType type = new SoldierType();
        type.uuid = UUID.randomUUID();
        type.targetRange = randomInt(20, 80);
        type.targetAcquireInterval = randomInt(15, 30);
        type.countRestAfterShoot = randomInt(10, 20);
        type.restTime = randomInt(10, 50);
        type.lockOnSound = "us_attack";
        type.topViewLimit = randomInt(60, 80);
        type.bottomViewLimit = randomInt(60, 80);
        type.yawViewLimit = randomInt(40, 150);
        type.shootStartTick = randomInt(10, 25);
        type.distToADS = randomInt(10, 30);
        type.maxLockOnTime = randomInt(80, 120);
        type.distToSneak = randomInt(5, 50);
        type.movingMaxTime = 100;
        type.movingUpdateTime = 160;
        type.escapeOnReloadTime = randomInt(2, 8);
        type.spreadMultiplier = randomFloat(1.5F, 3F);
        type.lockOnPlane = randomBoolean(0.3F);
        type.lockOnAAGun = randomBoolean(0.5F);
        type.maxExistingTick = randomInt(40 * 20, 120 * 20);
        soldierTypeMap.put(type.uuid.toString(), type);
        return type;
    }

    /**
     * 随机整数
     * @param min 最小值
     * @param max 最大值
     * @return
     */
    public static int randomInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        return rand.nextInt(max - min + 1) + min;
    }

    /**
     * 随机浮点数
     * @param min 最小值
     * @param max 最大值
     * @return
     */
    public static float randomFloat(float min, float max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        return min + rand.nextFloat() * (max - min);
    }

    /**
     * 随机名字
     * @return
     */
    public static String randomName() {
        float r = 0.2F;
        if (rand.nextFloat() < r) {
            return customNamePool[rand.nextInt(customNamePool.length)];
        } else {
            return genericFirstNamePool[rand.nextInt(genericFirstNamePool.length)] + "." + genericLastNamePool[rand.nextInt(genericLastNamePool.length)];
        }
    }

    /**
     * 随机布尔值
     * @param probability 概率, 0-1
     * @return 随机布尔值
     */
    public static boolean randomBoolean(float probability) {
        return rand.nextFloat() < probability;
    }
}
