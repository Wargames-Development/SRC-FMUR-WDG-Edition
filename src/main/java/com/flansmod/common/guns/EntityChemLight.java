package com.flansmod.common.guns;

import com.flansmod.common.guns.item.ItemChemLight;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

/** A bouncing, non-damaging chemlight that burns for fifteen loaded minutes. */
public class EntityChemLight extends Entity implements IEntityAdditionalSpawnData {
    public static final int LIFETIME_TICKS = 15 * 60 * 20;
    public static final int LIGHT_LEVEL = 7;

    private ItemChemLight.Color color = ItemChemLight.Color.GREEN;
    private int remainingLife = LIFETIME_TICKS;

    public EntityChemLight(World world) {
        super(world);
        setSize(0.14F, 0.14F);
    }

    public EntityChemLight(World world, EntityLivingBase thrower, ItemChemLight.Color color) {
        this(world);
        this.color = color;
        setLocationAndAngles(thrower.posX,
                thrower.posY + thrower.getEyeHeight() - 0.15D,
                thrower.posZ, thrower.rotationYaw, thrower.rotationPitch);

        Vec3 look = thrower.getLookVec();
        double speed = 0.85D;
        motionX = look.xCoord * speed;
        motionY = look.yCoord * speed + 0.12D;
        motionZ = look.zCoord * speed;
        rotationYaw = thrower.rotationYaw;
        rotationPitch = thrower.rotationPitch;
    }

    public ItemChemLight.Color getChemLightColor() {
        return color;
    }

    public int getRemainingLife() {
        return remainingLife;
    }

    @Override
    protected void entityInit() {
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        prevRotationYaw = rotationYaw;
        prevRotationPitch = rotationPitch;

        if (--remainingLife <= 0) {
            setDead();
            return;
        }

        if (!onGround) {
            motionY -= 0.035D;
        }

        moveEntity(motionX, motionY, motionZ);

        if (isCollidedHorizontally) {
            motionX *= -0.35D;
            motionZ *= -0.35D;
        }
        if (onGround) {
            motionX *= 0.70D;
            motionZ *= 0.70D;
            if (Math.abs(motionY) > 0.04D) {
                motionY *= -0.28D;
            } else {
                motionY = 0D;
            }
            if (motionX * motionX + motionZ * motionZ < 0.0004D) {
                motionX = motionZ = 0D;
            }
        } else if (isCollidedVertically) {
            motionY *= -0.28D;
        }

        motionX *= 0.99D;
        motionY *= 0.99D;
        motionZ *= 0.99D;

        float horizontalSpeed = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
        if (!onGround || horizontalSpeed > 0.02F) {
            rotationPitch += horizontalSpeed * 55F + (float)Math.abs(motionY) * 30F;
        }
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound tags) {
        color = ItemChemLight.Color.fromOrdinal(tags.getInteger("Color"));
        remainingLife = tags.hasKey("RemainingLife")
                ? tags.getInteger("RemainingLife") : LIFETIME_TICKS;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound tags) {
        tags.setInteger("Color", color.ordinal());
        tags.setInteger("RemainingLife", remainingLife);
    }

    @Override
    public void writeSpawnData(ByteBuf data) {
        data.writeByte(color.ordinal());
        data.writeInt(remainingLife);
    }

    @Override
    public void readSpawnData(ByteBuf data) {
        color = ItemChemLight.Color.fromOrdinal(data.readUnsignedByte());
        remainingLife = data.readInt();
    }
}
