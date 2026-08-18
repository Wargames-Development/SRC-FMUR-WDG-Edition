package com.flansmod.common.eventhandlers;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.FlansModExplosion;
import com.flansmod.common.network.PacketParticle;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ExplosionEvent;

public class VanillaExplosionEventListener {

    public VanillaExplosionEventListener() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onExplosionDetonate(ExplosionEvent.Detonate event) {
        if(event.world.isRemote || event.explosion instanceof FlansModExplosion)
            return;

        double x = event.explosion.explosionX;
        double y = event.explosion.explosionY;
        double z = event.explosion.explosionZ;
        FlansMod.getPacketHandler().sendToAllAround(
                new PacketParticle(PacketParticle.VANILLA_EXPLOSION_EFFECT, x, y, z, 0D, 0D, 0D),
                x, y, z, PacketParticle.EXPLOSION_EFFECT_RANGE, event.world.provider.dimensionId);
    }
}
