package com.flansmod.client.model.animation.gltf;

import com.flansmod.client.model.animation.gltf.model.Animation;
import com.flansmod.client.model.animation.gltf.model.Bone;
import com.flansmod.client.model.animation.gltf.model.EnumAnimationPart;
import com.flansmod.common.vector.Vector3f;
import org.lwjgl.opengl.GL11;

import java.util.Map;

import static com.flansmod.client.model.animation.gltf.AnimationResourceHandler.animations;

public class GLTFAnimationController {

    public static float rArmOffset = 0.3F;

    public static float lArmOffset = -0.3F;

    public static void playAnimation(float animationProgress, EnumAnimationPart animationPart, String animationKey, String animationName) {
        playAnimation(animationProgress, animationPart, animationKey, animationName, true, 1.0f);
    }

    public static void playAnimation(float animationProgress, EnumAnimationPart animationPart, String animationKey, String animationName, boolean normalize, float scale) {
        playAnimation(animationProgress, animationPart, animationKey, animationName, normalize, scale, null);
    }

    /**
     * 播放动画
     * @param animationProgress 动画进度
     * @param animationPart 动画部位
     * @param animationKey 动画资源标识
     * @param animationName 动画名称
     * @param normalize 是否将平移向量归一化
     * @param scale 缩放比例
     * @param rotationOffset 旋转枢轴点
     */
    public static void playAnimation(float animationProgress, EnumAnimationPart animationPart, String animationKey, String animationName, boolean normalize, float scale, Vector3f rotationOffset) {

        Animation animation = animations.get(animationKey).getAnimations().get(animationName);
        if(animation == null) return;

        float length = (float) animation.getAnimationLength();
        Bone bone = animation.getBones().get(animationPart.shortname);
        if(bone == null) return;

        Map<Float, Vector3f> positionKeyFrames = bone.getPosition();
        Map<Float, Vector3f> rotationKeyFrames = bone.getRotation();

        float currentTime = animationProgress * length;
        float prevPositionKeyFrameTime = 0.0f;
        float nextPositionKeyFrameTime = length;
        float prevRotationKeyFrameTime = 0.0f;
        float nextRotationKeyFrameTime = length;
        Vector3f prevPosition = new Vector3f(0, 0, 0);
        Vector3f nextPosition = new Vector3f(0, 0, 0);
        Vector3f prevRotation = new Vector3f(0, 0, 0);
        Vector3f nextRotation = new Vector3f(0, 0, 0);
        Vector3f translate = new Vector3f(0, 0, 0);
        Vector3f rotate = new Vector3f(0, 0, 0);

        //处理平移
        if(positionKeyFrames != null && positionKeyFrames.size() > 0) {
            for (Map.Entry<Float, Vector3f> entry : positionKeyFrames.entrySet()) {
                float keyFrameTime = entry.getKey();
                Vector3f keyFramePosition = entry.getValue();

                if (keyFrameTime <= currentTime && keyFrameTime >= prevPositionKeyFrameTime) {
                    prevPositionKeyFrameTime = keyFrameTime;
                    prevPosition.set(keyFramePosition);
                }

                if (keyFrameTime >= currentTime && keyFrameTime <= nextPositionKeyFrameTime) {
                    nextPositionKeyFrameTime = keyFrameTime;
                    nextPosition.set(keyFramePosition);
                }
            }
            float positionInterpolationFactor = (nextPositionKeyFrameTime != prevPositionKeyFrameTime) ?
                    (currentTime - prevPositionKeyFrameTime) / (nextPositionKeyFrameTime - prevPositionKeyFrameTime) : 0.0f;
            Vector3f.lerp(prevPosition, nextPosition, positionInterpolationFactor, translate);
        }

        //处理旋转
        if(rotationKeyFrames != null && rotationKeyFrames.size() > 0) {
            for (Map.Entry<Float, Vector3f> entry : rotationKeyFrames.entrySet()) {
                float keyFrameTime = entry.getKey();
                Vector3f keyFrameRotation = entry.getValue();

                if (keyFrameTime <= currentTime && keyFrameTime >= prevRotationKeyFrameTime) {
                    prevRotationKeyFrameTime = keyFrameTime;
                    prevRotation.set(keyFrameRotation);
                }

                if (keyFrameTime >= currentTime && keyFrameTime <= nextRotationKeyFrameTime) {
                    nextRotationKeyFrameTime = keyFrameTime;
                    nextRotation.set(keyFrameRotation);
                }
            }
            float rotationInterpolationFactor = (nextRotationKeyFrameTime != prevRotationKeyFrameTime) ?
                    (currentTime - prevRotationKeyFrameTime) / (nextRotationKeyFrameTime - prevRotationKeyFrameTime) : 0.0f;
            Vector3f.lerp(prevRotation, nextRotation, rotationInterpolationFactor, rotate);
        }

        if(normalize) {
            GL11.glTranslatef(-translate.x / 16, translate.y / 16, translate.z / 16);
        } else {
            float normalizeFactor = 16.0f * scale;
            GL11.glTranslatef(-translate.x / normalizeFactor, translate.y / normalizeFactor, translate.z / normalizeFactor);
        }
        if(rotationOffset != null) {
            GL11.glTranslatef(rotationOffset.x, rotationOffset.y, rotationOffset.z);
            GL11.glRotatef(rotate.z, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-rotate.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-rotate.x, 1.0f, 0.0f, 0.0f);
            GL11.glTranslatef(-rotationOffset.x, -rotationOffset.y, -rotationOffset.z);
        } else {
            GL11.glRotatef(rotate.z, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-rotate.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-rotate.x, 1.0f, 0.0f, 0.0f);
        }
    }


    public static void playArmAnimation(float animationProgress, EnumAnimationPart animationPart, String animationKey, String animationName) {

        Animation animation = animations.get(animationKey).getAnimations().get(animationName);
        if (animation == null) return;

        float length = (float) animation.getAnimationLength();
        Bone bone = animation.getBones().get(animationPart.shortname);
        if (bone == null) return;

        Map<Float, Vector3f> positionKeyFrames = bone.getPosition();
        Map<Float, Vector3f> rotationKeyFrames = bone.getRotation();

        float currentTime = animationProgress * length;
        float prevPositionKeyFrameTime = 0.0f;
        float nextPositionKeyFrameTime = length;
        float prevRotationKeyFrameTime = 0.0f;
        float nextRotationKeyFrameTime = length;
        Vector3f prevPosition = new Vector3f(0, 0, 0);
        Vector3f nextPosition = new Vector3f(0, 0, 0);
        Vector3f prevRotation = new Vector3f(0, 0, 0);
        Vector3f nextRotation = new Vector3f(0, 0, 0);
        Vector3f translate = new Vector3f(0, 0, 0);
        Vector3f rotate = new Vector3f(0, 0, 0);

        //处理平移
        if (positionKeyFrames != null && positionKeyFrames.size() > 0) {
            for (Map.Entry<Float, Vector3f> entry : positionKeyFrames.entrySet()) {
                float keyFrameTime = entry.getKey();
                Vector3f keyFramePosition = entry.getValue();
                if (keyFrameTime <= currentTime && keyFrameTime >= prevPositionKeyFrameTime) {
                    prevPositionKeyFrameTime = keyFrameTime;
                    prevPosition.set(keyFramePosition);
                }
                if (keyFrameTime >= currentTime && keyFrameTime <= nextPositionKeyFrameTime) {
                    nextPositionKeyFrameTime = keyFrameTime;
                    nextPosition.set(keyFramePosition);
                }
            }
            float positionInterpolationFactor = (nextPositionKeyFrameTime != prevPositionKeyFrameTime) ?
                    (currentTime - prevPositionKeyFrameTime) / (nextPositionKeyFrameTime - prevPositionKeyFrameTime) : 0.0f;

            Vector3f.lerp(prevPosition, nextPosition, positionInterpolationFactor, translate);
        }

        //处理旋转
        if (rotationKeyFrames != null && rotationKeyFrames.size() > 0) {
            for (Map.Entry<Float, Vector3f> entry : rotationKeyFrames.entrySet()) {
                float keyFrameTime = entry.getKey();
                Vector3f keyFrameRotation = entry.getValue();
                if (keyFrameTime <= currentTime && keyFrameTime >= prevRotationKeyFrameTime) {
                    prevRotationKeyFrameTime = keyFrameTime;
                    prevRotation.set(keyFrameRotation);
                }
                if (keyFrameTime >= currentTime && keyFrameTime <= nextRotationKeyFrameTime) {
                    nextRotationKeyFrameTime = keyFrameTime;
                    nextRotation.set(keyFrameRotation);
                }
            }
            float rotationInterpolationFactor = (nextRotationKeyFrameTime != prevRotationKeyFrameTime) ?
                    (currentTime - prevRotationKeyFrameTime) / (nextRotationKeyFrameTime - prevRotationKeyFrameTime) : 0.0f;
            Vector3f.lerp(prevRotation, nextRotation, rotationInterpolationFactor, rotate);
//            if(animationPart == EnumAnimationPart.RIGHT_ARM) {
//                GL11.glRotatef(-interpolatedRotation.y, 1.0f, 0.0f, 0.0f);
//                GL11.glRotatef(interpolatedRotation.x, 0.0f, 1.0f, 0.0f);
//                GL11.glRotatef(interpolatedRotation.z, 0.0f, 0.0f, 1.0f);
//            }
//            else if(animationPart == EnumAnimationPart.LEFT_ARM) {
//                GL11.glRotatef(-interpolatedRotation.x, 1.0f, 0.0f, 0.0f);
//                GL11.glRotatef(interpolatedRotation.z, 0.0f, 1.0f, 0.0f);
//                GL11.glRotatef(interpolatedRotation.y, 0.0f, 0.0f, 1.0f);
//            }
        }

//        if (animationPart == EnumAnimationPart.RIGHT_ARM) {
//            //GL11.glTranslatef(-interpolatedPosition.x / 16, interpolatedPosition.y / 16, interpolatedPosition.z / 16);
//            GL11.glTranslatef(translate.y / 16, -translate.x / 16, -translate.z / 16);
//
//        } else if (animationPart == EnumAnimationPart.LEFT_ARM) {
//            //GL11.glTranslatef(-interpolatedPosition.x / 16, interpolatedPosition.y / 16, interpolatedPosition.z / 16);
//            GL11.glTranslatef(-translate.y / 16, translate.z / 16, -translate.x / 16);
//        }

        GL11.glTranslatef(-translate.x / 16, translate.y / 16, translate.z / 16);
        GL11.glRotatef(rotate.z, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(-rotate.y, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-rotate.x, 1.0f, 0.0f, 0.0f);
        if(animationPart == EnumAnimationPart.RIGHT_ARM){
            GL11.glTranslatef(rArmOffset, -0.0F, 0.0F);
        } else if(animationPart == EnumAnimationPart.LEFT_ARM){
            GL11.glTranslatef(lArmOffset, -0.0F, 0.0F);
        }
    }

}
