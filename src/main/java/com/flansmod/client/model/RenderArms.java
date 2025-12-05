package com.flansmod.client.model;

import com.flansmod.client.model.animation.gltf.GLTFAnimationController;
import com.flansmod.client.model.animation.gltf.model.EnumAnimationPart;
import com.flansmod.common.guns.type.GunType;
import com.flansmod.common.network.PacketAPSMarker;
import com.flansmod.common.vector.Vector3f;
import org.lwjgl.opengl.GL11;

public class RenderArms {
	
	// right hand pump action animation
	public static void renderArmPump(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		GL11.glTranslatef(-(armPosition.x
				- Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) / model.pumpModifier),
				armPosition.y, armPosition.z);
		handleRotate(rotationPoint);
	}
	
	// This moves the right hand if leftHandAmmo & handCharge are true (For left
	// hand reload with right hand charge)
	public static void renderArmCharge(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		handleRotate(rotationPoint);
		GL11.glTranslatef(
				-(armPosition.x
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.x),
				(-(armPosition.y
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.y)),
				(-(armPosition.z
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.z)));
	}
	
	// This moves the right hand if leftHandAmmo & handBolt are true (For left hand
	// reload with right hand bolt action)
	public static void renderArmBolt(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		handleRotate(rotationPoint);
		GL11.glTranslatef(
				(armPosition.x + Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing)
						/ model.chargeModifier.x),
				((armPosition.y
						+ Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing)
								/ model.chargeModifier.y)),
				(-(armPosition.z
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.z)));
	}
	
	public static void renderArmDefault(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		handleRotate(rotationPoint);
		GL11.glTranslatef(armPosition.x, armPosition.y, armPosition.z);
	}
	
	public static void renderArmReload(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		handleRotate(rotationPoint);
		GL11.glTranslatef(armPosition.x, armPosition.y, armPosition.z);
	}

	public static void renderGLTFRightArmDefault(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotate, Vector3f translate) {
		if(model.enableNewArm) {
			GL11.glTranslatef(-translate.x / 16, translate.y / 16, translate.z / 16);
			GL11.glRotatef(rotate.z, 0.0f, 0.0f, 1.0f);
			GL11.glRotatef(-rotate.y, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(-rotate.x, 1.0f, 0.0f, 0.0f);
			GL11.glTranslatef(GLTFAnimationController.rArmOffset, -0.0F, 0.0F);
		} else {
			renderArmDefault(model, anim, smoothing, rotate, translate);
		}
	}

	public static void renderGLTFLeftArmDefault(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotate, Vector3f translate) {
		if(model.enableNewArm) {
			GL11.glTranslatef(-translate.x / 16, translate.y / 16, translate.z / 16);
			GL11.glRotatef(rotate.z, 0.0f, 0.0f, 1.0f);
			GL11.glRotatef(-rotate.y, 0.0f, 1.0f, 0.0f);
			GL11.glRotatef(-rotate.x, 1.0f, 0.0f, 0.0f);
			GL11.glTranslatef(GLTFAnimationController.lArmOffset, -0.0F, 0.0F);
		} else {
			renderArmDefault(model, anim, smoothing, rotate, translate);
		}
	}

	public static void renderGLTFRightArmReload(Vector3f rotationPoint, Vector3f armPosition, float reloadProgress, String animationKey, String animationName) {
		GLTFAnimationController.playArmAnimation(reloadProgress, EnumAnimationPart.RIGHT_ARM, animationKey, animationName);
	}

	public static void renderGLTFLeftArmReload(Vector3f rotationPoint, Vector3f armPosition, float reloadProgress, String animationKey, String animationName) {
		//GL11.glTranslatef(armPosition.x, armPosition.y, armPosition.z);
		GLTFAnimationController.playArmAnimation(reloadProgress, EnumAnimationPart.LEFT_ARM, animationKey, animationName);
	}

	
	private static void handleRotate(Vector3f rotationPoint)
	{
		GL11.glRotatef(rotationPoint.y, 0F, 1F, 0F);
		GL11.glRotatef(rotationPoint.z, 0F, 0F, 1F);
		GL11.glRotatef(rotationPoint.x, 1F, 0F, 0F);
	}

}
