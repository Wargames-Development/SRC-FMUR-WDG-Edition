package com.flansmod.common.guns;

/**
 * An interface for bullet decay objects.
 */
public interface BulletDecay {

    /***
     * Calculates the decay factor for a bullet based on the distance it has traveled.
     * @param distanceTraveled The distance the bullet has traveled.
     * @return The decay factor.
     */
    float calculateDecayFactor(float distanceTraveled);

    /**
     * Calculates the damage of a bullet based on the initial damage and the decay factor.
     * @param initialDamage The initial damage of the bullet.
     * @param distanceTraveled The distance the bullet has traveled.
     * @return The damage of the bullet.
     */
    float calculateDamage(float initialDamage, float distanceTraveled);
}
