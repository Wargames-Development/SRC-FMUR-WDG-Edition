package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.List;

/**
 * A factory for creating bullet decay objects.
 */
public class BulletDecayFactory {

    /**
     * Creates a bullet decay object based on the type and arguments.
     * @param type The type of bullet decay.
     * @param args The arguments for the bullet decay.
     * @return The bullet decay object.
     */
    public static BulletDecay createBulletDecay(String type, String[] args) {
        switch (type) {
            case "Segmented":{
                //Segmented 50 0.8 100 0.6 200 0.5
                List<SegmentedBulletDecay.DecaySegment> segments = new ArrayList<>();
                for (int i = 0; i < args.length; i += 2) {
                    float startDistance = Float.parseFloat(args[i]);
                    float decayFactor = Float.parseFloat(args[i + 1]);
                    SegmentedBulletDecay.DecaySegment segment = new SegmentedBulletDecay.DecaySegment(startDistance, decayFactor);
                    segments.add(segment);
                }
                return new SegmentedBulletDecay(segments);
            }
            default:
                throw new IllegalArgumentException("Invalid bullet decay type: " + type);
        }
    }
}
