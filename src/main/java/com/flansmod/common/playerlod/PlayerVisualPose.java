package com.flansmod.common.playerlod;

import java.nio.ByteBuffer;

/** Fixed-size read-only presentation state. Contains no inventory, aim intent or gameplay authority. */
public final class PlayerVisualPose {
    public static final int BYTES=38;
    public final int rightShotAge,leftShotAge,rightCount,leftCount;
    public final float rightTotal,rightRemaining,leftTotal,leftRemaining,minigun;
    public final boolean scoped;
    public PlayerVisualPose(int rightShotAge,int leftShotAge,float rightTotal,float rightRemaining,int rightCount,
                            float leftTotal,float leftRemaining,int leftCount,float minigun,boolean scoped) {
        if(!valid(rightTotal,rightRemaining,rightCount) || !valid(leftTotal,leftRemaining,leftCount)
                || !Float.isFinite(minigun) || minigun<0 || minigun>1000000) throw new IllegalArgumentException("Invalid gun presentation state");
        this.rightShotAge=rightShotAge;this.leftShotAge=leftShotAge;this.rightTotal=rightTotal;this.rightRemaining=rightRemaining;this.rightCount=rightCount;
        this.leftTotal=leftTotal;this.leftRemaining=leftRemaining;this.leftCount=leftCount;this.minigun=minigun;this.scoped=scoped;
    }
    private static boolean valid(float total,float remaining,int count) {
        return Float.isFinite(total) && Float.isFinite(remaining) && total>=0 && total<=1000000 && remaining>=0 && remaining<=total && count>=0 && count<=4096;
    }
    public byte[] encode() {
        return ByteBuffer.allocate(BYTES).put((byte)1).put((byte)(scoped?1:0)).putInt(rightShotAge).putInt(leftShotAge)
            .putFloat(rightTotal).putFloat(rightRemaining).putShort((short)rightCount)
            .putFloat(leftTotal).putFloat(leftRemaining).putShort((short)leftCount).putFloat(minigun).putInt(0).array();
    }
    public static PlayerVisualPose decode(byte[] bytes) {
        if(bytes==null || bytes.length!=BYTES) throw new IllegalArgumentException("Invalid gun presentation envelope");
        ByteBuffer b=ByteBuffer.wrap(bytes);int version=b.get()&255,flags=b.get()&255;
        if(version!=1 || flags>1) throw new IllegalArgumentException("Unsupported gun presentation envelope");
        PlayerVisualPose pose=new PlayerVisualPose(b.getInt(),b.getInt(),b.getFloat(),b.getFloat(),b.getShort()&65535,
            b.getFloat(),b.getFloat(),b.getShort()&65535,b.getFloat(),flags!=0);
        if(b.getInt()!=0) throw new IllegalArgumentException("Reserved gun presentation flags");return pose;
    }
    /** Interpolate only a continuous reload. A later start/cancel is withheld until its sample time. */
    public static float remaining(float firstTotal,float first,float lastTotal,float last,float fraction) {
        if(!Float.isFinite(fraction) || fraction<0 || fraction>1) throw new IllegalArgumentException("Invalid sample fraction");
        return firstTotal>0 && firstTotal==lastTotal && last<=first ? first+(last-first)*fraction : fraction>=1?last:first;
    }
}
