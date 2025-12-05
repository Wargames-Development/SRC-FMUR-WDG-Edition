package com.flansmod.common.guns;

import java.util.List;

/**
 * A bullet decay that decays in segments.
 * The decay factor is constant until the distance traveled is greater than the start distance of the segment.
 * The decay factor then becomes the decay factor of the segment.
 * The decay factor is 1.0f if the distance traveled is less than the start distance of the first segment.
 * The decay factor is the decay factor of the last segment if the distance traveled is greater than the start distance of the last segment.
 */
public class SegmentedBulletDecay implements BulletDecay {

    private List<DecaySegment> segments;

    public SegmentedBulletDecay(List<DecaySegment> segments) {
        this.segments = segments;
    }

    @Override
    public float calculateDecayFactor(float distanceTraveled) {
        float decayFactor = 1.0f;
        for(DecaySegment segment : segments){
            if(distanceTraveled > segment.startDistance){
                decayFactor = segment.damageMultiplier;
            }
        }
        return decayFactor;
    }

    @Override
    public float calculateDamage(float initialDamage, float distanceTraveled) {
        return initialDamage * calculateDecayFactor(distanceTraveled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("线性 ");
        for (DecaySegment segment : segments) {
            sb.append(segment.toString());
        }
        return sb.toString();
    }

    public static class DecaySegment{
        float startDistance;
        float damageMultiplier;

        public DecaySegment(float startDistance, float damageMultiplier) {
            this.startDistance = startDistance;
            this.damageMultiplier = damageMultiplier;
        }

        @Override
        public String toString() {
            return "| >" + startDistance + "m-x" + damageMultiplier + " ";
        }
    }
}
