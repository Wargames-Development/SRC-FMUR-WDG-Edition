package com.flansmod.client;

public class Dps {
    public static float damageFirstBullet;
    public static long timeFirstBullet;
    public static float damageSecondBullet;
    public static long timeSecondBullet;

    //50为每0.05秒更新一次，1tick
    public static final int INTERVAL_MAGNIFIER = 50;

    public static float calculateDps() {
        if(hasSecond()) {
            return (damageFirstBullet + damageSecondBullet) * 0.5F / (timeSecondBullet - timeFirstBullet) * (1000F / INTERVAL_MAGNIFIER);
        }
        //第一次射击
        else {
            return damageFirstBullet;
        }
    }

    public static void addDamage(float damage) {
        long time = System.currentTimeMillis() / INTERVAL_MAGNIFIER;
        addDamage(damage, time);
    }

    private static void addDamage(float damage, long time) {
        if(hasFirst()) {
            //1,2都有,替换
            if(hasSecond()) {
                if(timeSecondBullet == time) {
                    damageSecondBullet += damage;
                } else {
                    damageFirstBullet = damageSecondBullet;
                    timeFirstBullet = timeSecondBullet;
                    damageSecondBullet = damage;
                    timeSecondBullet = time;
                }
            }
            //1有2没有，直接添加2
            else {
                if(timeFirstBullet == time) {
                    damageFirstBullet += damage;
                } else {
                    damageSecondBullet = damage;
                    timeSecondBullet = time;
                }
            }
        }
        //第一次射击，直接添加1
        else {
            damageFirstBullet = damage;
            timeFirstBullet = time;
        }
    }

    public static void resetDps() {
        timeFirstBullet = 0;
        damageFirstBullet = 0;
        damageSecondBullet = 0;
        timeSecondBullet = 0;
    }

    public static boolean isReset() {
        return timeFirstBullet == 0;
    }

    public static String debug() {
        return timeFirstBullet + " " + damageFirstBullet + " | " + timeSecondBullet + " " + damageSecondBullet + " | " + calculateDps();
    }

    private static boolean hasFirst() {
        return timeFirstBullet != 0;
    }

    private static boolean hasSecond() {
        return timeSecondBullet != 0;
    }
}
