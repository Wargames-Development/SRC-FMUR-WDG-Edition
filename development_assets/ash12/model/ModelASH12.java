// Generated from the user-supplied ASH12.mtb by tools/build_ash12.py.
// Source author/license were not supplied; original archive is preserved.
package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelASH12 extends ModelGun {
    public ModelASH12() {
        initGunModel();
        initDefaultScopeModel();
        initDefaultBarrelModel();
        initSlideModel();
        initAmmoModel();
        barrelAttachPoint = new Vector3f(31.25F / 16F, 12F / 16F, 0F);
        scopeAttachPoint = new Vector3f(7F / 16F, 20.3F / 16F, 0F);
        gripAttachPoint = new Vector3f(20F / 16F, 7.277778F / 16F, 0F);
        gadgetAttachPoint = new Vector3f(23F / 16F, 12F / 16F, -2F / 16F);
        leftArmPos = new Vector3f(0F, -0.4F, 0F);
        leftArmRot = new Vector3f(80F, 50F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.95F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85F);
        rightArmReloadPos = new Vector3f(0.25F, -0.54F, 0.05F);
        rightArmReloadRot = new Vector3f(0.0F, 20.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
        gunSlideDistance = 0.15F;

        fancyStance = true;
        stanceTranslate = new Vector3f(0.2D, 0.0D, 0.2D);
        stanceRotate = new Vector3f(20.0F, -20.0F, 0.0F);
        animationType = EnumAnimationType.CUSTOM;
        rotateGunHorizontal = 15.0F;
        tiltGun = 30.0F;
        translateGun = new Vector3f(0.0F, -0.0625F, -0.1875F);
        translateClip = new Vector3f(0.0F, -0.625F, 0.0F);
        hasFlash = true;
        hasArms = true;
        rightHandAmmo = false;
        leftHandAmmo = true;
        crouchZoom = -0.05F;
        zoomOffset = 0.17F;
        zoomOffsetY = -0.07F;
        ShakeDistance = 0.8F;
        gunOffset = -0.808F;
        gunOffsetX = -3F;
        translateAll(4F, -1.5F, -1F);
        flashScale = 10F;
        // Calibrated rear aperture and front blade; applies only to bare ADS.
        ironSightOffset = new Vector3f(0F, -0.01140609F, 0.00085109F);
        ironSightPitch = 0.48093978F;
        ironSightYaw = -0.01892998F;
        muzzleFlashPoint = new Vector3f(31.25F / (16F * flashScale),
                12F / (16F * flashScale), 0F);
        defaultBarrelFlashPoint = new Vector3f(5F / (16F * flashScale), 0F, 0F);
        flipAll();
        // The optic sits on the carry handle; retain the same assembly
        // in the renderer's mutually exclusive attached-scope path.
        // Alias after transforms so its parts are transformed only once.
        attachmentScopeModel = defaultScopeModel;
    }

    private void initGunModel() {
        gunModel = new ModelRendererTurbo[197];
        // Source Box 0
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, 512, 512);
        gunModel[0].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F);
        gunModel[0].setRotationPoint(-7F, -11F, -1F);
        // Source Box 1
        gunModel[1] = new ModelRendererTurbo(this, 41, 1, 512, 512);
        gunModel[1].addShapeBox(0F, 0F, 0F, 19, 3, 4, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F);
        gunModel[1].setRotationPoint(-33F, -10F, -1F);
        // Source Box 3
        gunModel[2] = new ModelRendererTurbo(this, 89, 1, 512, 512);
        gunModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0.5F, 0F, -0.1F, 2.2F, 0F, -0.1F, 2.2F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.2F, 2.2F, 0F, -0.2F, 2.2F, 0F, -0.2F, 0.5F, 0F, -0.2F);
        gunModel[2].setRotationPoint(-33F, -7F, -1F);
        // Source Box 5
        gunModel[3] = new ModelRendererTurbo(this, 113, 1, 512, 512);
        gunModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0.5F, 0F, -0.2F, 2.2F, 0F, -0.2F, 2.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F);
        gunModel[3].setRotationPoint(-33F, -5F, -1F);
        // Source Box 6
        gunModel[4] = new ModelRendererTurbo(this, 137, 1, 512, 512);
        gunModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.2F, -0.7F, -1F, -0.2F, -0.7F, -1F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F);
        gunModel[4].setRotationPoint(-33F, -3F, -1F);
        // Source Box 8
        gunModel[5] = new ModelRendererTurbo(this, 161, 1, 512, 512);
        gunModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, -0.2F, 0F, -0.1F, 3F, 0F, -0.1F, 3F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.3F, -0.15F, 3F, 0.3F, -0.1F, 3F, 0.3F, -0.1F, -0.2F, 0.3F, -0.15F);
        gunModel[5].setRotationPoint(-26F, -7F, -1F);
        // Source Box 9
        gunModel[6] = new ModelRendererTurbo(this, 185, 1, 512, 512);
        gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, -0.3F, -0.15F, 2.2F, -0.3F, -0.2F, 2.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.15F, -0.2F, 0F, -0.2F, 2.2F, -0.7F, -0.2F, 2.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F);
        gunModel[6].setRotationPoint(-26F, -6F, -1F);
        // Source Box 10
        gunModel[7] = new ModelRendererTurbo(this, 201, 1, 512, 512);
        gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.4F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, -0.5F, -0.4F, -0.2F);
        gunModel[7].setRotationPoint(-8F, -11F, -1F);
        // Source Box 12
        gunModel[8] = new ModelRendererTurbo(this, 217, 1, 512, 512);
        gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 3F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, 3F, 0F, -0.1F, 3F, 0.3F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 3F, 0.3F, -0.1F);
        gunModel[8].setRotationPoint(-14F, -7F, -1F);
        // Source Box 13
        gunModel[9] = new ModelRendererTurbo(this, 233, 1, 512, 512);
        gunModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.3F, -0.1F, 1F, -0.3F, -0.1F, 1F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0F, 0F, -0.1F);
        gunModel[9].setRotationPoint(-14F, -8F, -1F);
        // Source Box 15
        gunModel[10] = new ModelRendererTurbo(this, 257, 1, 512, 512);
        gunModel[10].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.1F, 0.5F, -0.7F, -0.1F, 0.5F, -0.7F, -0.1F, 0F, -0.7F, -0.1F);
        gunModel[10].setRotationPoint(-14F, -8F, -1F);
        // Source Box 16
        gunModel[11] = new ModelRendererTurbo(this, 313, 1, 512, 512);
        gunModel[11].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0.5F, -1F, -0.1F);
        gunModel[11].setRotationPoint(-35F, -7F, -1F);
        // Source Box 17
        gunModel[12] = new ModelRendererTurbo(this, 33, 1, 512, 512);
        gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F);
        gunModel[12].setRotationPoint(3.8F, -9.5F, 3F);
        // Source Box 18
        gunModel[13] = new ModelRendererTurbo(this, 105, 1, 512, 512);
        gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0.2F, -0.6F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F);
        gunModel[13].setRotationPoint(2.8F, -9.5F, 3F);
        // Source Box 19
        gunModel[14] = new ModelRendererTurbo(this, 129, 1, 512, 512);
        gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F);
        gunModel[14].setRotationPoint(3.8F, -9.5F, -2F);
        // Source Box 20
        gunModel[15] = new ModelRendererTurbo(this, 153, 1, 512, 512);
        gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.8F, 0F);
        gunModel[15].setRotationPoint(2.8F, -9.5F, -2F);
        // Source Box 21
        gunModel[16] = new ModelRendererTurbo(this, 369, 1, 512, 512);
        gunModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F);
        gunModel[16].setRotationPoint(7F, -11F, -1F);
        // Source Box 22
        gunModel[17] = new ModelRendererTurbo(this, 385, 1, 512, 512);
        gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, 0.7F, 0.4F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0.4F, 0.5F, 0.7F, 0.4F, -0.2F, -1F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.2F, -1F, -0.6F);
        gunModel[17].setRotationPoint(8F, -7F, -1F);
        // Source Box 18
        gunModel[18] = new ModelRendererTurbo(this, 401, 1, 512, 512);
        gunModel[18].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0.7F, 0.4F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.7F, 0.4F, 0F, -0.5F, -0.6F, 0.5F, -0.7F, -0.8F, 0.5F, -0.7F, -0.8F, 0F, -0.5F, -0.6F);
        gunModel[18].setRotationPoint(9F, -7F, -1F);
        // Source Box 19
        gunModel[19] = new ModelRendererTurbo(this, 449, 1, 512, 512);
        gunModel[19].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.7F, 0.4F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.7F, 0.4F);
        gunModel[19].setRotationPoint(9F, -8F, -1F);
        // Source Box 20
        gunModel[20] = new ModelRendererTurbo(this, 497, 1, 512, 512);
        gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.2F, 0.4F, 1.2F, 0.2F, 0.4F, 1.2F, 0.2F, 0.4F, 0F, 0.2F, 0.4F);
        gunModel[20].setRotationPoint(9F, -9F, -1F);
        // Source Box 22
        gunModel[21] = new ModelRendererTurbo(this, 1, 9, 512, 512);
        gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.4F, -0.5F, -1F, 0.4F, -0.5F, -1F, 0.4F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, 0F, 0F, 0.4F);
        gunModel[21].setRotationPoint(9F, -10F, -1F);
        // Source Box 22
        gunModel[22] = new ModelRendererTurbo(this, 17, 9, 512, 512);
        gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.3F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F);
        gunModel[22].setRotationPoint(12.5F, -9F, -1F);
        // Source Box 23
        gunModel[23] = new ModelRendererTurbo(this, 33, 9, 512, 512);
        gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F);
        gunModel[23].setRotationPoint(13.5F, -9F, -1F);
        // Source Box 24
        gunModel[24] = new ModelRendererTurbo(this, 49, 9, 512, 512);
        gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F);
        gunModel[24].setRotationPoint(15.8F, -9F, -1F);
        // Source Box 25
        gunModel[25] = new ModelRendererTurbo(this, 65, 9, 512, 512);
        gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.3F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F);
        gunModel[25].setRotationPoint(14.8F, -9F, -1F);
        // Source Box 26
        gunModel[26] = new ModelRendererTurbo(this, 81, 9, 512, 512);
        gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F);
        gunModel[26].setRotationPoint(18.1F, -9F, -1F);
        // Source Box 27
        gunModel[27] = new ModelRendererTurbo(this, 97, 9, 512, 512);
        gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.3F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F);
        gunModel[27].setRotationPoint(17.1F, -9F, -1F);
        // Source Box 28
        gunModel[28] = new ModelRendererTurbo(this, 113, 9, 512, 512);
        gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F);
        gunModel[28].setRotationPoint(20.5F, -9F, -1F);
        // Source Box 29
        gunModel[29] = new ModelRendererTurbo(this, 129, 9, 512, 512);
        gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.3F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F);
        gunModel[29].setRotationPoint(19.5F, -9F, -1F);
        // Source Box 30
        gunModel[30] = new ModelRendererTurbo(this, 145, 9, 512, 512);
        gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1.1F, -1.2F, 0.4F, 0.3F, -1F, 0.4F, 0.3F, -1F, 0.4F, -1.1F, -1.2F, 0.4F, -1.1F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, -1.1F, 0.2F, 0.4F);
        gunModel[30].setRotationPoint(16.1F, -9F, -1F);
        // Source Box 31
        gunModel[31] = new ModelRendererTurbo(this, 161, 9, 512, 512);
        gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1.1F, -1.2F, 0.4F, 0.3F, -1F, 0.4F, 0.3F, -1F, 0.4F, -1.1F, -1.2F, 0.4F, -1.1F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, -1.1F, 0.2F, 0.4F);
        gunModel[31].setRotationPoint(18.5F, -9F, -1F);
        // Source Box 32
        gunModel[32] = new ModelRendererTurbo(this, 177, 9, 512, 512);
        gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1.1F, -1.2F, 0.4F, 0.3F, -1F, 0.4F, 0.3F, -1F, 0.4F, -1.1F, -1.2F, 0.4F, -1.1F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, -1.1F, 0.2F, 0.4F);
        gunModel[32].setRotationPoint(13.8F, -9F, -1F);
        // Source Box 33
        gunModel[33] = new ModelRendererTurbo(this, 193, 9, 512, 512);
        gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1.1F, -1.2F, 0.4F, 0.3F, -1F, 0.4F, 0.3F, -1F, 0.4F, -1.1F, -1.2F, 0.4F, -1.1F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, -1.1F, 0.2F, 0.4F);
        gunModel[33].setRotationPoint(11.5F, -9F, -1F);
        // Source Box 34
        gunModel[34] = new ModelRendererTurbo(this, 209, 9, 512, 512);
        gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.4F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F);
        gunModel[34].setRotationPoint(22.5F, -9F, -1F);
        // Source Box 35
        gunModel[35] = new ModelRendererTurbo(this, 225, 9, 512, 512);
        gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1.1F, -1.2F, 0.4F, 0.3F, -1F, 0.4F, 0.3F, -1F, 0.4F, -1.1F, -1.2F, 0.4F, -1.1F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, -1.1F, 0.2F, 0.4F);
        gunModel[35].setRotationPoint(20.8F, -9F, -1F);
        // Source Box 36
        gunModel[36] = new ModelRendererTurbo(this, 241, 9, 512, 512);
        gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, -1F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, -0.6F, -1F, 0.4F);
        gunModel[36].setRotationPoint(11.5F, -9F, -1F);
        // Source Box 37
        gunModel[37] = new ModelRendererTurbo(this, 257, 9, 512, 512);
        gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, -1F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, -0.6F, -1F, 0.4F);
        gunModel[37].setRotationPoint(13.8F, -9F, -1F);
        // Source Box 38
        gunModel[38] = new ModelRendererTurbo(this, 273, 9, 512, 512);
        gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, -1F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, -0.6F, -1F, 0.4F);
        gunModel[38].setRotationPoint(16.1F, -9F, -1F);
        // Source Box 39
        gunModel[39] = new ModelRendererTurbo(this, 289, 9, 512, 512);
        gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, -1F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, -0.6F, -1F, 0.4F);
        gunModel[39].setRotationPoint(18.5F, -9F, -1F);
        // Source Box 40
        gunModel[40] = new ModelRendererTurbo(this, 305, 9, 512, 512);
        gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, -1F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, -0.6F, -1F, 0.4F);
        gunModel[40].setRotationPoint(20.8F, -9F, -1F);
        // Source Box 41
        gunModel[41] = new ModelRendererTurbo(this, 313, 9, 512, 512);
        gunModel[41].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0.4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0.4F, 0.2F, 1F);
        gunModel[41].setRotationPoint(11.5F, -9F, 0F);
        // Source Box 42
        gunModel[42] = new ModelRendererTurbo(this, 337, 9, 512, 512);
        gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.7F, 1F, 0.4F, 0F, 1F, 0.1F, 0F, 1F, 0.1F, 0.7F, 1F, 0.4F, 0.7F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.7F, 0F, 0.4F);
        gunModel[42].setRotationPoint(25.5F, -10F, -1F);
        // Source Box 43
        gunModel[43] = new ModelRendererTurbo(this, 353, 9, 512, 512);
        gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1.8F, -0.5F, 0.4F, 0.8F, -0.5F, 0.4F, 0.8F, -0.5F, 0.4F, -1.8F, -0.5F, 0.4F, -1.4F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, -1.4F, 0F, 0.4F);
        gunModel[43].setRotationPoint(23F, -10F, -1F);
        // Source Box 44
        gunModel[44] = new ModelRendererTurbo(this, 369, 9, 512, 512);
        gunModel[44].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F);
        gunModel[44].setRotationPoint(9F, -11F, -1F);
        // Source Box 45
        gunModel[45] = new ModelRendererTurbo(this, 193, 1, 512, 512);
        gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F);
        gunModel[45].setRotationPoint(-18.8F, -5.7F, 0.5F);
        // Source Box 46
        gunModel[46] = new ModelRendererTurbo(this, 209, 1, 512, 512);
        gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F);
        gunModel[46].setRotationPoint(-18.8F, -4.7F, 0.5F);
        // Source Box 47
        gunModel[47] = new ModelRendererTurbo(this, 409, 9, 512, 512);
        gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F);
        gunModel[47].setRotationPoint(-8F, -11F, -1F);
        // Source Box 49
        gunModel[48] = new ModelRendererTurbo(this, 417, 9, 512, 512);
        gunModel[48].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, -0.5F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F);
        gunModel[48].setRotationPoint(9.5F, -7F, 0.5F);
        // Source Box 50
        gunModel[49] = new ModelRendererTurbo(this, 457, 9, 512, 512);
        gunModel[49].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F);
        gunModel[49].setRotationPoint(9.5F, -7F, 0F);
        // Source Box 51
        gunModel[50] = new ModelRendererTurbo(this, 249, 1, 512, 512);
        gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F);
        gunModel[50].setRotationPoint(10F, -6F, 0F);
        // Source Box 52
        gunModel[51] = new ModelRendererTurbo(this, 305, 1, 512, 512);
        gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[51].setRotationPoint(11F, -6F, 0F);
        // Source Box 53
        gunModel[52] = new ModelRendererTurbo(this, 361, 1, 512, 512);
        gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[52].setRotationPoint(12F, -6F, 0F);
        // Source Box 54
        gunModel[53] = new ModelRendererTurbo(this, 393, 1, 512, 512);
        gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[53].setRotationPoint(13F, -6F, 0F);
        // Source Box 55
        gunModel[54] = new ModelRendererTurbo(this, 441, 1, 512, 512);
        gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[54].setRotationPoint(14F, -6F, 0F);
        // Source Box 56
        gunModel[55] = new ModelRendererTurbo(this, 489, 1, 512, 512);
        gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[55].setRotationPoint(16F, -6F, 0F);
        // Source Box 57
        gunModel[56] = new ModelRendererTurbo(this, 9, 9, 512, 512);
        gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[56].setRotationPoint(15F, -6F, 0F);
        // Source Box 58
        gunModel[57] = new ModelRendererTurbo(this, 25, 9, 512, 512);
        gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[57].setRotationPoint(17F, -6F, 0F);
        // Source Box 59
        gunModel[58] = new ModelRendererTurbo(this, 41, 9, 512, 512);
        gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[58].setRotationPoint(18F, -6F, 0F);
        // Source Box 60
        gunModel[59] = new ModelRendererTurbo(this, 57, 9, 512, 512);
        gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[59].setRotationPoint(19F, -6F, 0F);
        // Source Box 61
        gunModel[60] = new ModelRendererTurbo(this, 73, 9, 512, 512);
        gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[60].setRotationPoint(20F, -6F, 0F);
        // Source Box 62
        gunModel[61] = new ModelRendererTurbo(this, 89, 9, 512, 512);
        gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[61].setRotationPoint(21F, -6F, 0F);
        // Source Box 63
        gunModel[62] = new ModelRendererTurbo(this, 105, 9, 512, 512);
        gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[62].setRotationPoint(22F, -6F, 0F);
        // Source Box 64
        gunModel[63] = new ModelRendererTurbo(this, 121, 9, 512, 512);
        gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[63].setRotationPoint(23F, -6F, 0F);
        // Source Box 65
        gunModel[64] = new ModelRendererTurbo(this, 137, 9, 512, 512);
        gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[64].setRotationPoint(24F, -6F, 0F);
        // Source Box 66
        gunModel[65] = new ModelRendererTurbo(this, 153, 9, 512, 512);
        gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F);
        gunModel[65].setRotationPoint(25F, -6F, 0F);
        // Source Box 67
        gunModel[66] = new ModelRendererTurbo(this, 497, 9, 512, 512);
        gunModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F);
        gunModel[66].setRotationPoint(-8F, -14F, -1F);
        // Source Box 68
        gunModel[67] = new ModelRendererTurbo(this, 1, 17, 512, 512);
        gunModel[67].addShapeBox(0F, 0F, 0F, 42, 1, 4, 0F, 1F, -0.2F, -0.5F, 1.5F, -0.2F, -0.5F, 1.5F, -0.2F, -0.5F, 1F, -0.2F, -0.5F, 1F, -0.5F, -0.2F, 1.5F, -0.5F, -0.2F, 1.5F, -0.5F, -0.2F, 1F, -0.5F, -0.2F);
        gunModel[67].setRotationPoint(-31F, -14F, -1F);
        // Source Box 69
        gunModel[68] = new ModelRendererTurbo(this, 97, 17, 512, 512);
        gunModel[68].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F);
        gunModel[68].setRotationPoint(-33F, -13F, -1F);
        // Source Box 70
        gunModel[69] = new ModelRendererTurbo(this, 145, 17, 512, 512);
        gunModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.8F, 0.7F, -0.2F, 0.5F, 0.7F, -0.2F, 0.5F, 0.7F, -0.2F, 0.8F, 0.7F, -0.2F, 0.6F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.6F, -0.4F, -0.2F);
        gunModel[69].setRotationPoint(-35F, -13F, -1F);
        // Source Box 71
        gunModel[70] = new ModelRendererTurbo(this, 161, 17, 512, 512);
        gunModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.6F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F);
        gunModel[70].setRotationPoint(-35F, -10F, -1F);
        // Source Box 72
        gunModel[71] = new ModelRendererTurbo(this, 177, 17, 512, 512);
        gunModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.3F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.3F, 0F, -0.2F);
        gunModel[71].setRotationPoint(-35F, -7F, -1F);
        // Source Box 73
        gunModel[72] = new ModelRendererTurbo(this, 193, 17, 512, 512);
        gunModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1.3F, 0F, -0.2F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F);
        gunModel[72].setRotationPoint(-34F, -5F, -1F);
        // Source Box 74
        gunModel[73] = new ModelRendererTurbo(this, 209, 17, 512, 512);
        gunModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.7F, 0.5F, -0.2F, -0.7F, 0.5F, -0.2F, -0.7F, -0.2F, 0F, -0.7F);
        gunModel[73].setRotationPoint(-35F, -3F, -1F);
        // Source Box 75
        gunModel[74] = new ModelRendererTurbo(this, 225, 17, 512, 512);
        gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.8F, 0F, -0.3F, 0.8F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0.8F, -0.7F, 0.1F);
        gunModel[74].setRotationPoint(-35F, -14F, -1F);
        // Source Box 76
        gunModel[75] = new ModelRendererTurbo(this, 169, 9, 512, 512);
        gunModel[75].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.2F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, -0.8F, -0.4F, 0.5F, -0.8F, -0.4F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F);
        gunModel[75].setRotationPoint(-36F, -13.5F, 2F);
        // Source Box 77
        gunModel[76] = new ModelRendererTurbo(this, 185, 9, 512, 512);
        gunModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.2F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F);
        gunModel[76].setRotationPoint(-36F, -13.5F, -1F);
        // Source Box 78
        gunModel[77] = new ModelRendererTurbo(this, 201, 9, 512, 512);
        gunModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0.5F, -0.8F, -0.4F, 0.5F, -0.8F, -0.4F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -1.2F, -0.8F, -1F, -1.2F, -0.8F, -1F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F);
        gunModel[77].setRotationPoint(-34F, -10.5F, 2F);
        // Source Box 79
        gunModel[78] = new ModelRendererTurbo(this, 233, 9, 512, 512);
        gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0.5F, 0.1F, -0.4F, 0.5F, 0.1F, -0.4F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1.2F, 0.1F, -1F, -1.2F, 0.1F, -1F, -1.2F, -0.8F, -0.2F, -1.2F, -0.8F);
        gunModel[78].setRotationPoint(-34F, -10.5F, -1F);
        // Source Box 80
        gunModel[79] = new ModelRendererTurbo(this, 241, 17, 512, 512);
        gunModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 1F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 1F, 0.5F, -0.2F);
        gunModel[79].setRotationPoint(10F, -14F, 1F);
        // Source Box 81
        gunModel[80] = new ModelRendererTurbo(this, 249, 9, 512, 512);
        gunModel[80].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F, 0.5F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F);
        gunModel[80].setRotationPoint(13F, -13F, -1F);
        // Source Box 82
        gunModel[81] = new ModelRendererTurbo(this, 257, 17, 512, 512);
        gunModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.8F, 0.9F, -0.2F, 0.2F, 1F, -0.2F, 0.2F, 1F, -0.2F, 0.8F, 0.9F, -0.2F, 0.8F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, 0.8F, -0.4F, -0.2F);
        gunModel[81].setRotationPoint(-37F, -13F, -1F);
        // Source Box 83
        gunModel[82] = new ModelRendererTurbo(this, 273, 17, 512, 512);
        gunModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, -1F, 0.7F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, -1F, 0.7F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F);
        gunModel[82].setRotationPoint(-39F, -13F, -1F);
        // Source Box 84
        gunModel[83] = new ModelRendererTurbo(this, 289, 17, 512, 512);
        gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.2F, 0.3F, -0.2F, -1F, 0.7F, -0.2F, -1F, 0.7F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F);
        gunModel[83].setRotationPoint(-38F, -13F, -1F);
        // Source Box 85
        gunModel[84] = new ModelRendererTurbo(this, 305, 17, 512, 512);
        gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.2F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F, 0.2F, 0F, -0.2F);
        gunModel[84].setRotationPoint(-38F, -12.8F, -1F);
        // Source Box 86
        gunModel[85] = new ModelRendererTurbo(this, 321, 17, 512, 512);
        gunModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.8F, 0.4F, -0.2F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.8F, 0.4F, -0.2F, 0.8F, -0.3F, -0.2F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.8F, -0.3F, -0.2F);
        gunModel[85].setRotationPoint(-37F, -10F, -1F);
        // Source Box 87
        gunModel[86] = new ModelRendererTurbo(this, 337, 17, 512, 512);
        gunModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.3F, 0.3F, -0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.3F, 0.3F, -0.2F, 0.3F, -1F, -0.2F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0.3F, -1F, -0.2F);
        gunModel[86].setRotationPoint(-37.5F, -7F, -1F);
        // Source Box 88
        gunModel[87] = new ModelRendererTurbo(this, 353, 17, 512, 512);
        gunModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0.8F, 0F, -0.2F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.8F, 0F, -0.2F, 1F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0.7F, 0F, -0.2F, 1F, 0F, -0.2F);
        gunModel[87].setRotationPoint(-37F, -7F, -1F);
        // Source Box 89
        gunModel[88] = new ModelRendererTurbo(this, 369, 17, 512, 512);
        gunModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1.3F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 1.3F, 0F, -0.2F, 1.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, 1.7F, 0F, -0.3F);
        gunModel[88].setRotationPoint(-36.7F, -5F, -1F);
        // Source Box 90
        gunModel[89] = new ModelRendererTurbo(this, 385, 17, 512, 512);
        gunModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -0.3F, 1.4F, 0F, -0.3F, 1.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.7F, 1.6F, 0F, -0.7F, 1.6F, 0F, -0.7F, 0.5F, 0F, -0.7F);
        gunModel[89].setRotationPoint(-38.4F, -3F, -1F);
        // Source Box 91
        gunModel[90] = new ModelRendererTurbo(this, 401, 17, 512, 512);
        gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.8F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, -0.8F, 1F, -0.2F);
        gunModel[90].setRotationPoint(-39F, -7F, -1F);
        // Source Box 92
        gunModel[91] = new ModelRendererTurbo(this, 417, 17, 512, 512);
        gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.8F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, -0.8F, 1F, -0.2F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F);
        gunModel[91].setRotationPoint(-39F, -4F, -1F);
        // Source Box 93
        gunModel[92] = new ModelRendererTurbo(this, 433, 17, 512, 512);
        gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0.1F, 1F, -0.7F, -0.9F, 1F, -0.7F, -0.9F, 1F, -0.7F, 0.1F, 1F, -0.7F);
        gunModel[92].setRotationPoint(-39F, -3F, -1F);
        // Source Box 94
        gunModel[93] = new ModelRendererTurbo(this, 449, 17, 512, 512);
        gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.5F, 0F, -0.7F, 1.6F, 0F, -0.7F, 1.6F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.4F, -0.1F, -1.2F, -1.4F, -0.1F, -1.2F, -1.4F, -0.1F, -1.2F, 0.4F, -0.1F, -1.2F);
        gunModel[93].setRotationPoint(-38.4F, -1F, -1F);
        // Source Box 95
        gunModel[94] = new ModelRendererTurbo(this, 465, 17, 512, 512);
        gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.1F, 1F, -0.7F, -0.9F, 1F, -0.7F, -0.9F, 1F, -0.7F, 0.1F, 1F, -0.7F, 0F, -1.1F, -1.2F, -0.8F, -1.1F, -1.2F, -0.8F, -1.1F, -1.2F, 0F, -1.1F, -1.2F);
        gunModel[94].setRotationPoint(-39F, 0F, -1F);
        // Source Box 95
        gunModel[95] = new ModelRendererTurbo(this, 481, 17, 512, 512);
        gunModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 1F, 0F, -0.8F, 1F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 1F, 0.5F, -0.2F);
        gunModel[95].setRotationPoint(18F, -13F, -1F);
        // Source Box 96
        gunModel[96] = new ModelRendererTurbo(this, 497, 17, 512, 512);
        gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F);
        gunModel[96].setRotationPoint(25.5F, -12F, -1F);
        // Source Box 97
        gunModel[97] = new ModelRendererTurbo(this, 1, 25, 512, 512);
        gunModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.3F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.3F, 0F, 0.4F, -0.3F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F);
        gunModel[97].setRotationPoint(24.5F, -9F, -1F);
        // Source Box 99
        gunModel[98] = new ModelRendererTurbo(this, 17, 25, 512, 512);
        gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F);
        gunModel[98].setRotationPoint(25.5F, -13F, -1F);
        // Source Box 100
        gunModel[99] = new ModelRendererTurbo(this, 33, 25, 512, 512);
        gunModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F);
        gunModel[99].setRotationPoint(13F, -14F, -1F);
        // Source Box 101
        gunModel[100] = new ModelRendererTurbo(this, 57, 25, 512, 512);
        gunModel[100].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F);
        gunModel[100].setRotationPoint(16F, -14F, -1F);
        // Source Box 102
        gunModel[101] = new ModelRendererTurbo(this, 81, 25, 512, 512);
        gunModel[101].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 1F, 0F, -0.8F, 1F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 1F, 0F, 0.2F, 1F);
        gunModel[101].setRotationPoint(16F, -15F, 0F);
        // Source Box 102
        gunModel[102] = new ModelRendererTurbo(this, 265, 9, 512, 512);
        gunModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 1F, 0.5F, -0.8F, 1F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0.5F, 0.2F, 1.5F);
        gunModel[102].setRotationPoint(13F, -15F, 0F);
        // Source Box 103
        gunModel[103] = new ModelRendererTurbo(this, 105, 25, 512, 512);
        gunModel[103].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 1F, 0F, -0.8F, 1F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 1.5F, 0F, 0.2F, 1.5F);
        gunModel[103].setRotationPoint(-8F, -15F, 0F);
        // Source Box 104
        gunModel[104] = new ModelRendererTurbo(this, 145, 25, 512, 512);
        gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, 0.25F, 0.5F, -0.2F);
        gunModel[104].setRotationPoint(22F, -13F, -1F);
        // Source Box 106
        gunModel[105] = new ModelRendererTurbo(this, 161, 25, 512, 512);
        gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0.5F, -0.2F);
        gunModel[105].setRotationPoint(25F, -13F, -1F);
        // Source Box 107
        gunModel[106] = new ModelRendererTurbo(this, 177, 25, 512, 512);
        gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F);
        gunModel[106].setRotationPoint(24.5F, -12F, -1F);
        // Source Box 107
        gunModel[107] = new ModelRendererTurbo(this, 193, 25, 512, 512);
        gunModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.8F, -0.475F, -0.25F, -0.8F, -0.475F, -0.25F, -0.8F, -0.475F, 0F, -0.8F, -0.475F, 0F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, 0F, 0.5F, -0.2F);
        gunModel[107].setRotationPoint(20F, -13F, -1F);
        // Source Box 108
        gunModel[108] = new ModelRendererTurbo(this, 209, 25, 512, 512);
        gunModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.75F, -0.8F, -0.475F, 0.5F, -0.8F, -0.475F, 0.5F, -0.8F, -0.475F, -0.75F, -0.8F, -0.475F, -0.75F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, -0.75F, 0.5F, -0.2F);
        gunModel[108].setRotationPoint(22F, -13F, -1F);
        // Source Box 109
        gunModel[109] = new ModelRendererTurbo(this, 225, 25, 512, 512);
        gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, 0F, -0.8F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -0.8F);
        gunModel[109].setRotationPoint(26F, -14F, -1F);
        // Source Box 110
        gunModel[110] = new ModelRendererTurbo(this, 281, 9, 512, 512);
        gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, 1.25F, 0F, -0.8F, 1.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 1.25F, 0F, 0.2F, 1.25F);
        gunModel[110].setRotationPoint(25.5F, -15F, 0F);
        // Source Box 111
        gunModel[111] = new ModelRendererTurbo(this, 297, 9, 512, 512);
        gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, 0.5F, 0.1F, 1F, 0.5F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, 0.5F, -0.7F, 1.25F);
        gunModel[111].setRotationPoint(25.5F, -14.5F, 0F);
        // Source Box 112
        gunModel[112] = new ModelRendererTurbo(this, 345, 9, 512, 512);
        gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[112].setRotationPoint(23.5F, -14.5F, 0F);
        // Source Box 113
        gunModel[113] = new ModelRendererTurbo(this, 361, 9, 512, 512);
        gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[113].setRotationPoint(22F, -14.5F, 0F);
        // Source Box 149
        gunModel[114] = new ModelRendererTurbo(this, 441, 17, 512, 512);
        gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[114].setRotationPoint(20.5F, -14.5F, 0F);
        // Source Box 150
        gunModel[115] = new ModelRendererTurbo(this, 473, 17, 512, 512);
        gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[115].setRotationPoint(19F, -14.5F, 0F);
        // Source Box 151
        gunModel[116] = new ModelRendererTurbo(this, 505, 17, 512, 512);
        gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[116].setRotationPoint(17.5F, -14.5F, 0F);
        // Source Box 152
        gunModel[117] = new ModelRendererTurbo(this, 25, 25, 512, 512);
        gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[117].setRotationPoint(16F, -14.5F, 0F);
        // Source Box 153
        gunModel[118] = new ModelRendererTurbo(this, 49, 25, 512, 512);
        gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[118].setRotationPoint(14.5F, -14.5F, 0F);
        // Source Box 154
        gunModel[119] = new ModelRendererTurbo(this, 153, 25, 512, 512);
        gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[119].setRotationPoint(13F, -14.5F, 0F);
        // Source Box 155
        gunModel[120] = new ModelRendererTurbo(this, 169, 25, 512, 512);
        gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[120].setRotationPoint(11.5F, -14.5F, 0F);
        // Source Box 156
        gunModel[121] = new ModelRendererTurbo(this, 185, 25, 512, 512);
        gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[121].setRotationPoint(10F, -14.5F, 0F);
        // Source Box 158
        gunModel[122] = new ModelRendererTurbo(this, 233, 25, 512, 512);
        gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[122].setRotationPoint(7F, -14.5F, 0F);
        // Source Box 159
        gunModel[123] = new ModelRendererTurbo(this, 257, 25, 512, 512);
        gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[123].setRotationPoint(5.5F, -14.5F, 0F);
        // Source Box 160
        gunModel[124] = new ModelRendererTurbo(this, 265, 25, 512, 512);
        gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[124].setRotationPoint(4F, -14.5F, 0F);
        // Source Box 161
        gunModel[125] = new ModelRendererTurbo(this, 289, 25, 512, 512);
        gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[125].setRotationPoint(2.5F, -14.5F, 0F);
        // Source Box 162
        gunModel[126] = new ModelRendererTurbo(this, 297, 25, 512, 512);
        gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[126].setRotationPoint(1F, -14.5F, 0F);
        // Source Box 163
        gunModel[127] = new ModelRendererTurbo(this, 305, 25, 512, 512);
        gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[127].setRotationPoint(-0.5F, -14.5F, 0F);
        // Source Box 164
        gunModel[128] = new ModelRendererTurbo(this, 313, 25, 512, 512);
        gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[128].setRotationPoint(-2F, -14.5F, 0F);
        // Source Box 165
        gunModel[129] = new ModelRendererTurbo(this, 321, 25, 512, 512);
        gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.25F, 0.1F, 1F, -0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 1.25F, -0.25F, -0.7F, 1.25F);
        gunModel[129].setRotationPoint(-3.5F, -14.5F, 0F);
        // Source Box 189
        gunModel[130] = new ModelRendererTurbo(this, 169, 33, 512, 512);
        gunModel[130].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F);
        gunModel[130].setRotationPoint(17F, -12F, -1F);
        // Source Box 190
        gunModel[131] = new ModelRendererTurbo(this, 281, 25, 512, 512);
        gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F);
        gunModel[131].setRotationPoint(11.5F, -12F, -1F);
        // Source Box 191
        gunModel[132] = new ModelRendererTurbo(this, 337, 25, 512, 512);
        gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F);
        gunModel[132].setRotationPoint(14.25F, -12F, -1F);
        // Source Box 192
        gunModel[133] = new ModelRendererTurbo(this, 425, 25, 512, 512);
        gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F);
        gunModel[133].setRotationPoint(15.25F, -12F, -1F);
        // Source Box 194
        gunModel[134] = new ModelRendererTurbo(this, 441, 25, 512, 512);
        gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F);
        gunModel[134].setRotationPoint(9.75F, -12F, -1F);
        // Source Box 195
        gunModel[135] = new ModelRendererTurbo(this, 457, 25, 512, 512);
        gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F);
        gunModel[135].setRotationPoint(12.5F, -12F, -1F);
        // Source Box 196
        gunModel[136] = new ModelRendererTurbo(this, 473, 25, 512, 512);
        gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.5F, -0.5F, -0.2F, -1.25F, -0.5F, -0.2F, -1.25F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, -1.25F, 0F, -0.2F, -1.25F, 0F, -0.2F, 0.5F, 0F, -0.2F);
        gunModel[136].setRotationPoint(9.5F, -12F, -1F);
        // Source Box 197
        gunModel[137] = new ModelRendererTurbo(this, 193, 33, 512, 512);
        gunModel[137].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F);
        gunModel[137].setRotationPoint(18F, -12F, 3F);
        // Source Box 198
        gunModel[138] = new ModelRendererTurbo(this, 209, 33, 512, 512);
        gunModel[138].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F);
        gunModel[138].setRotationPoint(18F, -12F, -2F);
        // Source Box 199
        gunModel[139] = new ModelRendererTurbo(this, 225, 33, 512, 512);
        gunModel[139].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0.5F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, 1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, 1F, -0.25F, -0.75F, 1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[139].setRotationPoint(18F, -12F, 2.5F);
        // Source Box 200
        gunModel[140] = new ModelRendererTurbo(this, 241, 33, 512, 512);
        gunModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[140].setRotationPoint(18F, -12F, 3.5F);
        // Source Box 201
        gunModel[141] = new ModelRendererTurbo(this, 249, 33, 512, 512);
        gunModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[141].setRotationPoint(19F, -12F, 3.5F);
        // Source Box 202
        gunModel[142] = new ModelRendererTurbo(this, 257, 33, 512, 512);
        gunModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[142].setRotationPoint(20F, -12F, 3.5F);
        // Source Box 203
        gunModel[143] = new ModelRendererTurbo(this, 265, 33, 512, 512);
        gunModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[143].setRotationPoint(21F, -12F, 3.5F);
        // Source Box 204
        gunModel[144] = new ModelRendererTurbo(this, 273, 33, 512, 512);
        gunModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[144].setRotationPoint(22F, -12F, 3.5F);
        // Source Box 205
        gunModel[145] = new ModelRendererTurbo(this, 281, 33, 512, 512);
        gunModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[145].setRotationPoint(23F, -12F, 3.5F);
        // Source Box 206
        gunModel[146] = new ModelRendererTurbo(this, 289, 33, 512, 512);
        gunModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[146].setRotationPoint(24F, -12F, 3.5F);
        // Source Box 207
        gunModel[147] = new ModelRendererTurbo(this, 297, 33, 512, 512);
        gunModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[147].setRotationPoint(25F, -12F, 3.5F);
        // Source Box 208
        gunModel[148] = new ModelRendererTurbo(this, 305, 33, 512, 512);
        gunModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[148].setRotationPoint(25F, -12F, -2.5F);
        // Source Box 209
        gunModel[149] = new ModelRendererTurbo(this, 313, 33, 512, 512);
        gunModel[149].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F);
        gunModel[149].setRotationPoint(18F, -12F, -1.5F);
        // Source Box 210
        gunModel[150] = new ModelRendererTurbo(this, 329, 33, 512, 512);
        gunModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[150].setRotationPoint(24F, -12F, -2.5F);
        // Source Box 211
        gunModel[151] = new ModelRendererTurbo(this, 337, 33, 512, 512);
        gunModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[151].setRotationPoint(23F, -12F, -2.5F);
        // Source Box 212
        gunModel[152] = new ModelRendererTurbo(this, 345, 33, 512, 512);
        gunModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[152].setRotationPoint(22F, -12F, -2.5F);
        // Source Box 213
        gunModel[153] = new ModelRendererTurbo(this, 353, 33, 512, 512);
        gunModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[153].setRotationPoint(21F, -12F, -2.5F);
        // Source Box 214
        gunModel[154] = new ModelRendererTurbo(this, 361, 33, 512, 512);
        gunModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[154].setRotationPoint(20F, -12F, -2.5F);
        // Source Box 215
        gunModel[155] = new ModelRendererTurbo(this, 369, 33, 512, 512);
        gunModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[155].setRotationPoint(19F, -12F, -2.5F);
        // Source Box 216
        gunModel[156] = new ModelRendererTurbo(this, 377, 33, 512, 512);
        gunModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F);
        gunModel[156].setRotationPoint(18F, -12F, -2.5F);
        // Source Box 228
        gunModel[157] = new ModelRendererTurbo(this, 473, 33, 512, 512);
        gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F);
        gunModel[157].setRotationPoint(26.5F, -11F, 0.5F);
        // Source Box 229
        gunModel[158] = new ModelRendererTurbo(this, 481, 33, 512, 512);
        gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F);
        gunModel[158].setRotationPoint(26.5F, -12F, 0.5F);
        // Source Box 230
        gunModel[159] = new ModelRendererTurbo(this, 489, 33, 512, 512);
        gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F);
        gunModel[159].setRotationPoint(26.5F, -10F, 0.5F);
        // Source Box 247
        gunModel[160] = new ModelRendererTurbo(this, 241, 41, 512, 512);
        gunModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 0F, -0.5F, -0.2F);
        gunModel[160].setRotationPoint(14F, -13F, -1F);
        // Source Box 248
        gunModel[161] = new ModelRendererTurbo(this, 257, 41, 512, 512);
        gunModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F);
        gunModel[161].setRotationPoint(12F, -13F, 1F);
        // Source Box 249
        gunModel[162] = new ModelRendererTurbo(this, 265, 41, 512, 512);
        gunModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F, 0.5F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0.5F, 0F, -0.2F);
        gunModel[162].setRotationPoint(13F, -12.5F, -1F);
        // Source Box 250
        gunModel[163] = new ModelRendererTurbo(this, 273, 41, 512, 512);
        gunModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 1F, 0.5F, -0.2F);
        gunModel[163].setRotationPoint(10F, -14F, -1F);
        // Source Box 251
        gunModel[164] = new ModelRendererTurbo(this, 289, 41, 512, 512);
        gunModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 1F, 0F, -0.2F);
        gunModel[164].setRotationPoint(10F, -12.5F, -1F);
        // Source Box 252
        gunModel[165] = new ModelRendererTurbo(this, 305, 41, 512, 512);
        gunModel[165].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F);
        gunModel[165].setRotationPoint(-7F, -14F, 1F);
        // Source Box 253
        gunModel[166] = new ModelRendererTurbo(this, 345, 41, 512, 512);
        gunModel[166].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F);
        gunModel[166].setRotationPoint(-4F, -14F, -1F);
        // Source Box 254
        gunModel[167] = new ModelRendererTurbo(this, 377, 41, 512, 512);
        gunModel[167].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F);
        gunModel[167].setRotationPoint(-4F, -11.5F, -1F);
        // Source Box 255
        gunModel[168] = new ModelRendererTurbo(this, 409, 41, 512, 512);
        gunModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F);
        gunModel[168].setRotationPoint(-7F, -14F, -1F);
        // Source Box 256
        gunModel[169] = new ModelRendererTurbo(this, 425, 41, 512, 512);
        gunModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F);
        gunModel[169].setRotationPoint(-7F, -11.5F, -1F);
        // Source Box 257
        gunModel[170] = new ModelRendererTurbo(this, 433, 41, 512, 512);
        gunModel[170].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F);
        gunModel[170].setRotationPoint(-14F, -10F, -1F);
        // Source Box 258
        gunModel[171] = new ModelRendererTurbo(this, 457, 41, 512, 512);
        gunModel[171].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F);
        gunModel[171].setRotationPoint(-16F, -14F, 1F);
        // Source Box 259
        gunModel[172] = new ModelRendererTurbo(this, 481, 41, 512, 512);
        gunModel[172].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F);
        gunModel[172].setRotationPoint(-10F, -14F, -1F);
        // Source Box 260
        gunModel[173] = new ModelRendererTurbo(this, 497, 41, 512, 512);
        gunModel[173].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F);
        gunModel[173].setRotationPoint(-16F, -14F, -1F);
        // Source Box 262
        gunModel[174] = new ModelRendererTurbo(this, 17, 49, 512, 512);
        gunModel[174].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.5F, -0.1F, -0.75F, 0.5F, -0.1F, -0.75F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.25F, 0.5F, 0.1F, -0.25F);
        gunModel[174].setRotationPoint(-16F, -10.5F, -2F);
        // Source Box 263
        gunModel[175] = new ModelRendererTurbo(this, 33, 49, 512, 512);
        gunModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, 0.25F, -0.35F, 0F, 0.25F, -0.35F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F);
        gunModel[175].setRotationPoint(-7F, -13F, -1F);
        // Source Box 273
        gunModel[176] = new ModelRendererTurbo(this, 161, 49, 512, 512);
        gunModel[176].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F);
        gunModel[176].setRotationPoint(-1F, -8F, 0F);
        // Source Box 274
        gunModel[177] = new ModelRendererTurbo(this, 177, 49, 512, 512);
        gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F);
        gunModel[177].setRotationPoint(-2F, -8F, 0F);
        // Source Box 275
        gunModel[178] = new ModelRendererTurbo(this, 185, 49, 512, 512);
        gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F);
        gunModel[178].setRotationPoint(-3F, -8F, 0F);
        // Source Box 276
        gunModel[179] = new ModelRendererTurbo(this, 193, 49, 512, 512);
        gunModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.25F);
        gunModel[179].setRotationPoint(-2F, -7F, 0F);
        // Source Box 277
        gunModel[180] = new ModelRendererTurbo(this, 201, 49, 512, 512);
        gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F);
        gunModel[180].setRotationPoint(-3F, -7F, 0F);
        // Source Box 278
        gunModel[181] = new ModelRendererTurbo(this, 209, 49, 512, 512);
        gunModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F);
        gunModel[181].setRotationPoint(3F, -8F, 0F);
        // Source Box 279
        gunModel[182] = new ModelRendererTurbo(this, 217, 49, 512, 512);
        gunModel[182].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F);
        gunModel[182].setRotationPoint(-1F, -4F, 0F);
        // Source Box 280
        gunModel[183] = new ModelRendererTurbo(this, 233, 49, 512, 512);
        gunModel[183].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -0.75F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F);
        gunModel[183].setRotationPoint(-3F, -4F, 0F);
        // Source Box 281
        gunModel[184] = new ModelRendererTurbo(this, 241, 49, 512, 512);
        gunModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 1F, 0F, 0F);
        gunModel[184].setRotationPoint(-1F, 0F, 0F);
        // Source Box 282
        gunModel[185] = new ModelRendererTurbo(this, 257, 49, 512, 512);
        gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -0.25F);
        gunModel[185].setRotationPoint(-4F, 0F, 0F);
        // Source Box 283
        gunModel[186] = new ModelRendererTurbo(this, 265, 49, 512, 512);
        gunModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, -0.5F, -0.25F);
        gunModel[186].setRotationPoint(-2F, 1F, 0F);
        // Source Box 284
        gunModel[187] = new ModelRendererTurbo(this, 281, 49, 512, 512);
        gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.25F);
        gunModel[187].setRotationPoint(-3F, 1F, 0F);
        // Source Box 285
        gunModel[188] = new ModelRendererTurbo(this, 289, 49, 512, 512);
        gunModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, 0F);
        gunModel[188].setRotationPoint(3F, -4F, 0F);
        // Source Box 286
        gunModel[189] = new ModelRendererTurbo(this, 297, 49, 512, 512);
        gunModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 1F, 0F, 0F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, 0F, 1.5F, 0.5F, 0F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, 1.5F, 0.5F, 0F);
        gunModel[189].setRotationPoint(3F, 0F, 0F);
        // Source Box 287
        gunModel[190] = new ModelRendererTurbo(this, 305, 49, 512, 512);
        gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 1.5F, 0.5F, 0F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, 1.5F, 0.5F, 0F, 1.5F, -1F, -0.25F, -2F, -1.5F, -0.25F, -2F, -1.5F, -0.25F, 1.5F, -1F, -0.25F);
        gunModel[190].setRotationPoint(3F, 3F, 0F);
        // Source Box 288
        gunModel[191] = new ModelRendererTurbo(this, 313, 49, 512, 512);
        gunModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.75F, -0.75F, 0F);
        gunModel[191].setRotationPoint(4F, -4F, 0.5F);
        // Source Box 289
        gunModel[192] = new ModelRendererTurbo(this, 329, 49, 512, 512);
        gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.75F, 0F);
        gunModel[192].setRotationPoint(7F, -4F, 0.5F);
        // Source Box 290
        gunModel[193] = new ModelRendererTurbo(this, 337, 49, 512, 512);
        gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1.25F, 1F, 0F);
        gunModel[193].setRotationPoint(7F, -7F, 0.5F);
        // Source Box 291
        gunModel[194] = new ModelRendererTurbo(this, 345, 49, 512, 512);
        gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0.8F, -0.25F, 1F, 0.8F, -0.25F, 1F, 0.8F, -0.25F, -1F, 0.8F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F);
        gunModel[194].setRotationPoint(4F, -7F, 0.5F);
        // Source Box 292
        gunModel[195] = new ModelRendererTurbo(this, 353, 49, 512, 512);
        gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F);
        gunModel[195].setRotationPoint(4F, -6F, 0.5F);
        // Source Box 293
        gunModel[196] = new ModelRendererTurbo(this, 361, 49, 512, 512);
        gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0.75F, -0.6F, -0.25F, 0.75F, -0.6F, -0.25F, -1.75F, -0.25F, -0.25F);
        gunModel[196].setRotationPoint(4F, -5F, 0.5F);
    }

    private void initDefaultScopeModel() {
        defaultScopeModel = new ModelRendererTurbo[72];
        // Source Box 131
        defaultScopeModel[0] = new ModelRendererTurbo(this, 241, 25, 512, 512);
        defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0.1F, 1F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 1F, 0F, -0.7F, 1F);
        defaultScopeModel[0].setRotationPoint(-8F, -16.5F, 0F);
        // Source Box 132
        defaultScopeModel[1] = new ModelRendererTurbo(this, 505, 9, 512, 512);
        defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F);
        defaultScopeModel[1].setRotationPoint(25F, -16.5F, 0F);
        // Source Box 133
        defaultScopeModel[2] = new ModelRendererTurbo(this, 137, 17, 512, 512);
        defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F);
        defaultScopeModel[2].setRotationPoint(25F, -16.5F, 1F);
        // Source Box 134
        defaultScopeModel[3] = new ModelRendererTurbo(this, 153, 17, 512, 512);
        defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F);
        defaultScopeModel[3].setRotationPoint(25F, -16.5F, 0F);
        // Source Box 135
        defaultScopeModel[4] = new ModelRendererTurbo(this, 169, 17, 512, 512);
        defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F);
        defaultScopeModel[4].setRotationPoint(25F, -17.5F, 0F);
        // Source Box 136
        defaultScopeModel[5] = new ModelRendererTurbo(this, 185, 17, 512, 512);
        defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F);
        defaultScopeModel[5].setRotationPoint(25F, -18.5F, 0F);
        // Source Box 137
        defaultScopeModel[6] = new ModelRendererTurbo(this, 201, 17, 512, 512);
        defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F);
        defaultScopeModel[6].setRotationPoint(25F, -19.5F, 0F);
        // Source Box 138
        defaultScopeModel[7] = new ModelRendererTurbo(this, 265, 17, 512, 512);
        defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F);
        defaultScopeModel[7].setRotationPoint(25F, -19.5F, 0F);
        // Source Box 139
        defaultScopeModel[8] = new ModelRendererTurbo(this, 281, 17, 512, 512);
        defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F);
        defaultScopeModel[8].setRotationPoint(25F, -19.5F, 1F);
        // Source Box 140
        defaultScopeModel[9] = new ModelRendererTurbo(this, 297, 17, 512, 512);
        defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0.25F, -0.9F, -0.5F, 0.25F, -0.9F, -0.5F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F);
        defaultScopeModel[9].setRotationPoint(25F, -20.5F, 0F);
        // Source Box 141
        defaultScopeModel[10] = new ModelRendererTurbo(this, 313, 17, 512, 512);
        defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.55F, -0.5F, 0F, 0.55F, -0.5F);
        defaultScopeModel[10].setRotationPoint(25F, -20.5F, 1F);
        // Source Box 142
        defaultScopeModel[11] = new ModelRendererTurbo(this, 329, 17, 512, 512);
        defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F, 0F, 0.55F, -0.5F, 0F, 0.55F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F);
        defaultScopeModel[11].setRotationPoint(25F, -20.5F, 0F);
        // Source Box 145
        defaultScopeModel[12] = new ModelRendererTurbo(this, 361, 17, 512, 512);
        defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F);
        defaultScopeModel[12].setRotationPoint(25F, -20.5F, 1F);
        // Source Box 146
        defaultScopeModel[13] = new ModelRendererTurbo(this, 377, 17, 512, 512);
        defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, -0.9F, 0F, -0.75F, -0.9F);
        defaultScopeModel[13].setRotationPoint(25F, -20.5F, 0F);
        // Source Box 147
        defaultScopeModel[14] = new ModelRendererTurbo(this, 409, 17, 512, 512);
        defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F);
        defaultScopeModel[14].setRotationPoint(25F, -20.5F, 0F);
        // Source Box 148
        defaultScopeModel[15] = new ModelRendererTurbo(this, 425, 17, 512, 512);
        defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F);
        defaultScopeModel[15].setRotationPoint(25F, -20.5F, 1F);
        // Source Box 166
        defaultScopeModel[16] = new ModelRendererTurbo(this, 329, 25, 512, 512);
        defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 1F, 0F, -0.1F, 1F);
        defaultScopeModel[16].setRotationPoint(-8F, -17.5F, 0F);
        // Source Box 167
        defaultScopeModel[17] = new ModelRendererTurbo(this, 345, 25, 512, 512);
        defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, 0.25F, 1F);
        defaultScopeModel[17].setRotationPoint(-5F, -17.5F, 0F);
        // Source Box 168
        defaultScopeModel[18] = new ModelRendererTurbo(this, 353, 25, 512, 512);
        defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[18].setRotationPoint(-4F, -17.5F, 0F);
        // Source Box 169
        defaultScopeModel[19] = new ModelRendererTurbo(this, 361, 25, 512, 512);
        defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[19].setRotationPoint(-3F, -17.5F, 0F);
        // Source Box 170
        defaultScopeModel[20] = new ModelRendererTurbo(this, 369, 25, 512, 512);
        defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 1F);
        defaultScopeModel[20].setRotationPoint(-3F, -18.5F, 0F);
        // Source Box 152
        defaultScopeModel[21] = new ModelRendererTurbo(this, 377, 25, 512, 512);
        defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.55F, 0F, -0.5F, 0.55F, 0F, -0.5F, 0.55F, 1F, -0.5F, 0.55F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[21].setRotationPoint(-2F, -17.5F, 0F);
        // Source Box 153
        defaultScopeModel[22] = new ModelRendererTurbo(this, 385, 25, 512, 512);
        defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.55F, 0F, -0.5F, 0.55F, 0F, -0.5F, 0.55F, 1F, -0.5F, 0.55F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[22].setRotationPoint(1F, -17.5F, 0F);
        // Source Box 154
        defaultScopeModel[23] = new ModelRendererTurbo(this, 393, 25, 512, 512);
        defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.55F, 0F, -0.5F, 0.55F, 0F, -0.5F, 0.55F, 1F, -0.5F, 0.55F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[23].setRotationPoint(4F, -17.5F, 0F);
        // Source Box 155
        defaultScopeModel[24] = new ModelRendererTurbo(this, 401, 25, 512, 512);
        defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.55F, 0F, -1F, 0.55F, 0F, -1F, 0.55F, 1F, -0.5F, 0.55F, 1F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[24].setRotationPoint(7F, -17.5F, 0F);
        // Source Box 156
        defaultScopeModel[25] = new ModelRendererTurbo(this, 409, 25, 512, 512);
        defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0.55F, 0F, -0.75F, 0.55F, 0F, -0.75F, 0.55F, 1F, 0F, 0.55F, 1F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 1F, 0F, 0.3F, 1F);
        defaultScopeModel[25].setRotationPoint(8F, -17.5F, 0F);
        // Source Box 157
        defaultScopeModel[26] = new ModelRendererTurbo(this, 417, 25, 512, 512);
        defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 1F, -0.5F, -0.15F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[26].setRotationPoint(5F, -17.5F, 0F);
        // Source Box 158
        defaultScopeModel[27] = new ModelRendererTurbo(this, 433, 25, 512, 512);
        defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F);
        defaultScopeModel[27].setRotationPoint(5F, -18.5F, 0F);
        // Source Box 159
        defaultScopeModel[28] = new ModelRendererTurbo(this, 449, 25, 512, 512);
        defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 1F, -0.5F, -0.15F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[28].setRotationPoint(2F, -17.5F, 0F);
        // Source Box 160
        defaultScopeModel[29] = new ModelRendererTurbo(this, 465, 25, 512, 512);
        defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F);
        defaultScopeModel[29].setRotationPoint(2F, -18.5F, 0F);
        // Source Box 161
        defaultScopeModel[30] = new ModelRendererTurbo(this, 481, 25, 512, 512);
        defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 1F, -0.5F, -0.15F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F);
        defaultScopeModel[30].setRotationPoint(-1F, -17.5F, 0F);
        // Source Box 162
        defaultScopeModel[31] = new ModelRendererTurbo(this, 497, 25, 512, 512);
        defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F);
        defaultScopeModel[31].setRotationPoint(-1F, -18.5F, 0F);
        // Source Box 163
        defaultScopeModel[32] = new ModelRendererTurbo(this, 1, 33, 512, 512);
        defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, -0.5F, 0.05F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[32].setRotationPoint(-2F, -18.25F, 0F);
        // Source Box 164
        defaultScopeModel[33] = new ModelRendererTurbo(this, 33, 33, 512, 512);
        defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, -0.5F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F, -0.5F, 0.05F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F);
        defaultScopeModel[33].setRotationPoint(-2F, -19.35F, 0F);
        // Source Box 171
        defaultScopeModel[34] = new ModelRendererTurbo(this, 65, 33, 512, 512);
        defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, 0F, 0.25F, -0.8F, 0F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[34].setRotationPoint(8F, -18.75F, 0F);
        // Source Box 176
        defaultScopeModel[35] = new ModelRendererTurbo(this, 73, 33, 512, 512);
        defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, -1.5F, 0.25F, 0.05F, -1.5F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, -1.5F, 0.25F, -0.8F, -1.5F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[35].setRotationPoint(0.5F, -18.75F, 0F);
        // Source Box 178
        defaultScopeModel[36] = new ModelRendererTurbo(this, 81, 33, 512, 512);
        defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, 0.75F, 0.25F, 0.05F, 0.75F, 0.25F, 0.05F, -1.5F, -0.5F, 0.05F, -1.5F, -0.5F, -0.8F, 1F, 0.25F, -0.8F, 1F, 0.25F, -0.8F, -1.5F, -0.5F, -0.8F, -1.5F);
        defaultScopeModel[36].setRotationPoint(0.5F, -18.75F, 1F);
        // Source Box 179
        defaultScopeModel[37] = new ModelRendererTurbo(this, 89, 33, 512, 512);
        defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, -1.5F, 0.25F, 0.05F, -1.5F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, -1.5F, 0.25F, -0.8F, -1.5F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[37].setRotationPoint(2F, -18.75F, 0F);
        // Source Box 180
        defaultScopeModel[38] = new ModelRendererTurbo(this, 97, 33, 512, 512);
        defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, 0.75F, 0.25F, 0.05F, 0.75F, 0.25F, 0.05F, -1.5F, -0.5F, 0.05F, -1.5F, -0.5F, -0.8F, 1F, 0.25F, -0.8F, 1F, 0.25F, -0.8F, -1.5F, -0.5F, -0.8F, -1.5F);
        defaultScopeModel[38].setRotationPoint(2F, -18.75F, 1F);
        // Source Box 181
        defaultScopeModel[39] = new ModelRendererTurbo(this, 105, 33, 512, 512);
        defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, -1.5F, 0.25F, 0.05F, -1.5F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, -1.5F, 0.25F, -0.8F, -1.5F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[39].setRotationPoint(5F, -18.75F, 0F);
        // Source Box 182
        defaultScopeModel[40] = new ModelRendererTurbo(this, 113, 33, 512, 512);
        defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, 0.75F, 0.25F, 0.05F, 0.75F, 0.25F, 0.05F, -1.5F, -0.5F, 0.05F, -1.5F, -0.5F, -0.8F, 1F, 0.25F, -0.8F, 1F, 0.25F, -0.8F, -1.5F, -0.5F, -0.8F, -1.5F);
        defaultScopeModel[40].setRotationPoint(5F, -18.75F, 1F);
        // Source Box 183
        defaultScopeModel[41] = new ModelRendererTurbo(this, 121, 33, 512, 512);
        defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, -1.5F, 0.25F, 0.05F, -1.5F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, -1.5F, 0.25F, -0.8F, -1.5F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[41].setRotationPoint(3.5F, -18.75F, 0F);
        // Source Box 184
        defaultScopeModel[42] = new ModelRendererTurbo(this, 129, 33, 512, 512);
        defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, 0.75F, 0.25F, 0.05F, 0.75F, 0.25F, 0.05F, -1.5F, -0.5F, 0.05F, -1.5F, -0.5F, -0.8F, 1F, 0.25F, -0.8F, 1F, 0.25F, -0.8F, -1.5F, -0.5F, -0.8F, -1.5F);
        defaultScopeModel[42].setRotationPoint(3.5F, -18.75F, 1F);
        // Source Box 185
        defaultScopeModel[43] = new ModelRendererTurbo(this, 137, 33, 512, 512);
        defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, -1.5F, 0.25F, 0.05F, -1.5F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, -1.5F, 0.25F, -0.8F, -1.5F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[43].setRotationPoint(6.5F, -18.75F, 0F);
        // Source Box 186
        defaultScopeModel[44] = new ModelRendererTurbo(this, 145, 33, 512, 512);
        defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0.05F, 0.75F, 0.25F, 0.05F, 0.75F, 0.25F, 0.05F, -1.5F, -0.5F, 0.05F, -1.5F, -0.5F, -0.8F, 1F, 0.25F, -0.8F, 1F, 0.25F, -0.8F, -1.5F, -0.5F, -0.8F, -1.5F);
        defaultScopeModel[44].setRotationPoint(6.5F, -18.75F, 1F);
        // Source Box 187
        defaultScopeModel[45] = new ModelRendererTurbo(this, 153, 33, 512, 512);
        defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.05F, -1.5F, 0.25F, 0.05F, -1.5F, 0.25F, 0.05F, 0.75F, -0.5F, 0.05F, 0.75F, -0.5F, -0.8F, -1.5F, 0.25F, -0.8F, -1.5F, 0.25F, -0.8F, 1F, -0.5F, -0.8F, 1F);
        defaultScopeModel[45].setRotationPoint(-2F, -18.75F, 0F);
        // Source Box 188
        defaultScopeModel[46] = new ModelRendererTurbo(this, 161, 33, 512, 512);
        defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.05F, 0.75F, 0.25F, 0.05F, 0.75F, 0.25F, 0.05F, -1.5F, -0.5F, 0.05F, -1.5F, -0.5F, -0.8F, 1F, 0.25F, -0.8F, 1F, 0.25F, -0.8F, -1.5F, -0.5F, -0.8F, -1.5F);
        defaultScopeModel[46].setRotationPoint(-2F, -18.75F, 1F);
        // Source Box 217
        defaultScopeModel[47] = new ModelRendererTurbo(this, 385, 33, 512, 512);
        defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, 0.75F, -0.5F, 0.2F, 0.75F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F);
        defaultScopeModel[47].setRotationPoint(-6F, -18.25F, 0F);
        // Source Box 218
        defaultScopeModel[48] = new ModelRendererTurbo(this, 401, 33, 512, 512);
        defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.35F, 0.25F, 0F, 0.35F, 0.25F, 0F, 0.35F, 1.25F, -0.2F, 0.35F, 1.25F, -0.2F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -0.6F, 1.25F, -0.2F, -0.6F, 1.25F);
        defaultScopeModel[48].setRotationPoint(-6.5F, -18.25F, 0F);
        // Source Box 219
        defaultScopeModel[49] = new ModelRendererTurbo(this, 409, 33, 512, 512);
        defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -0.75F, 0F, 1F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F);
        defaultScopeModel[49].setRotationPoint(-8F, -19F, 0F);
        // Source Box 220
        defaultScopeModel[50] = new ModelRendererTurbo(this, 417, 33, 512, 512);
        defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F);
        defaultScopeModel[50].setRotationPoint(-8F, -20F, 0F);
        // Source Box 221
        defaultScopeModel[51] = new ModelRendererTurbo(this, 425, 33, 512, 512);
        defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, 0F);
        defaultScopeModel[51].setRotationPoint(-8F, -20F, 1F);
        // Source Box 227
        defaultScopeModel[52] = new ModelRendererTurbo(this, 465, 33, 512, 512);
        defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.35F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0.35F, 0.75F, -0.2F, 0.35F, 0.75F, -0.2F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, 0.75F, -0.2F, -0.6F, 0.75F);
        defaultScopeModel[52].setRotationPoint(-8F, -18.25F, 0F);
        // Source Square rear plate with round hole 0
        defaultScopeModel[53] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 19.7F, -1F, -7.75F, 19.7F, -1F, -7.75F, 19.731672F, 0.13416408F, 7F, 19.731672F, 0.13416408F, 7F, -20F, -1F, -7.75F, -20F, -1F, -7.75F, -20F, 0.5F, 7F, -20F, 0.5F);
        defaultScopeModel[53].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 1
        defaultScopeModel[54] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 19.731672F, -1.1341641F, -7.75F, 19.731672F, -1.1341641F, -7.75F, 19.787868F, 0.21213203F, 7F, 19.787868F, 0.21213203F, 7F, -20F, -1.5F, -7.75F, -20F, -1.5F, -7.75F, -20.5F, 0.5F, 7F, -20.5F, 0.5F);
        defaultScopeModel[54].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 2
        defaultScopeModel[55] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 19.787868F, -1.212132F, -7.75F, 19.787868F, -1.212132F, -7.75F, 19.885195F, 0.27716386F, 7F, 19.885195F, 0.27716386F, 7F, -20.5F, -1.5F, -7.75F, -20.5F, -1.5F, -7.75F, -20.792893F, 0.5F, 7F, -20.792893F, 0.5F);
        defaultScopeModel[55].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 3
        defaultScopeModel[56] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 19.885195F, -1.2771639F, -7.75F, 19.885195F, -1.2771639F, -7.75F, 20F, 0.3F, 7F, 20F, 0.3F, 7F, -20.792893F, -1.5F, -7.75F, -20.792893F, -1.5F, -7.75F, -21F, 0.5F, 7F, -21F, 0.5F);
        defaultScopeModel[56].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 4
        defaultScopeModel[57] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20F, -1.3F, -7.75F, 20F, -1.3F, -7.75F, 20.114805F, 0.27716386F, 7F, 20.114805F, 0.27716386F, 7F, -21F, -1.5F, -7.75F, -21F, -1.5F, -7.75F, -21.207107F, 0.5F, 7F, -21.207107F, 0.5F);
        defaultScopeModel[57].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 5
        defaultScopeModel[58] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20.114805F, -1.2771639F, -7.75F, 20.114805F, -1.2771639F, -7.75F, 20.212132F, 0.21213203F, 7F, 20.212132F, 0.21213203F, 7F, -21.207107F, -1.5F, -7.75F, -21.207107F, -1.5F, -7.75F, -21.5F, 0.5F, 7F, -21.5F, 0.5F);
        defaultScopeModel[58].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 6
        defaultScopeModel[59] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20.212132F, -1.212132F, -7.75F, 20.212132F, -1.212132F, -7.75F, 20.277164F, 0.11480503F, 7F, 20.277164F, 0.11480503F, 7F, -21.5F, -1.5F, -7.75F, -21.5F, -1.5F, -7.75F, -21.5F, 0.20710678F, 7F, -21.5F, 0.20710678F);
        defaultScopeModel[59].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 7
        defaultScopeModel[60] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20.277164F, -1.114805F, -7.75F, 20.277164F, -1.114805F, -7.75F, 20.3F, 0F, 7F, 20.3F, 0F, 7F, -21.5F, -1.2071068F, -7.75F, -21.5F, -1.2071068F, -7.75F, -21.5F, 0F, 7F, -21.5F, 0F);
        defaultScopeModel[60].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 8
        defaultScopeModel[61] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20.3F, -1F, -7.75F, 20.3F, -1F, -7.75F, 20.277164F, -0.11480503F, 7F, 20.277164F, -0.11480503F, 7F, -21.5F, -1F, -7.75F, -21.5F, -1F, -7.75F, -21.5F, -0.20710678F, 7F, -21.5F, -0.20710678F);
        defaultScopeModel[61].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 9
        defaultScopeModel[62] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20.277164F, -0.88519497F, -7.75F, 20.277164F, -0.88519497F, -7.75F, 20.212132F, -0.21213203F, 7F, 20.212132F, -0.21213203F, 7F, -21.5F, -0.79289322F, -7.75F, -21.5F, -0.79289322F, -7.75F, -21.5F, -0.5F, 7F, -21.5F, -0.5F);
        defaultScopeModel[62].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 10
        defaultScopeModel[63] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20.212132F, -0.78786797F, -7.75F, 20.212132F, -0.78786797F, -7.75F, 20.114805F, -0.27716386F, 7F, 20.114805F, -0.27716386F, 7F, -21.5F, -0.5F, -7.75F, -21.5F, -0.5F, -7.75F, -21.207107F, -0.5F, 7F, -21.207107F, -0.5F);
        defaultScopeModel[63].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 11
        defaultScopeModel[64] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20.114805F, -0.72283614F, -7.75F, 20.114805F, -0.72283614F, -7.75F, 20F, -0.3F, 7F, 20F, -0.3F, 7F, -21.207107F, -0.5F, -7.75F, -21.207107F, -0.5F, -7.75F, -21F, -0.5F, 7F, -21F, -0.5F);
        defaultScopeModel[64].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 12
        defaultScopeModel[65] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 20F, -0.7F, -7.75F, 20F, -0.7F, -7.75F, 19.885195F, -0.27716386F, 7F, 19.885195F, -0.27716386F, 7F, -21F, -0.5F, -7.75F, -21F, -0.5F, -7.75F, -20.792893F, -0.5F, 7F, -20.792893F, -0.5F);
        defaultScopeModel[65].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 13
        defaultScopeModel[66] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 19.885195F, -0.72283614F, -7.75F, 19.885195F, -0.72283614F, -7.75F, 19.787868F, -0.21213203F, 7F, 19.787868F, -0.21213203F, 7F, -20.792893F, -0.5F, -7.75F, -20.792893F, -0.5F, -7.75F, -20.5F, -0.5F, 7F, -20.5F, -0.5F);
        defaultScopeModel[66].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 14
        defaultScopeModel[67] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 19.787868F, -0.78786797F, -7.75F, 19.787868F, -0.78786797F, -7.75F, 19.731672F, -0.13416408F, 7F, 19.731672F, -0.13416408F, 7F, -20.5F, -0.5F, -7.75F, -20.5F, -0.5F, -7.75F, -20F, -0.5F, 7F, -20F, -0.5F);
        defaultScopeModel[67].setRotationPoint(0F, 0F, 0F);
        // Source Square rear plate with round hole 15
        defaultScopeModel[68] = new ModelRendererTurbo(this, 488, 500, 512, 512);
        defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7F, 19.731672F, -0.86583592F, -7.75F, 19.731672F, -0.86583592F, -7.75F, 19.7F, -1.110223e-16F, 7F, 19.7F, -1.110223e-16F, 7F, -20F, -0.5F, -7.75F, -20F, -0.5F, -7.75F, -20F, -2.220446e-16F, 7F, -20F, -2.220446e-16F);
        defaultScopeModel[68].setRotationPoint(0F, 0F, 0F);
        // Source Left rear white mark
        defaultScopeModel[69] = new ModelRendererTurbo(this, 500, 500, 512, 512);
        defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7.002F, 20.07F, -0.51F, -8.001F, 20.07F, -0.51F, -8.001F, 20.07F, -0.39F, 7.002F, 20.07F, -0.39F, 7.002F, -20.93F, -0.51F, -8.001F, -20.93F, -0.51F, -8.001F, -20.93F, -0.39F, 7.002F, -20.93F, -0.39F);
        defaultScopeModel[69].setRotationPoint(0F, 0F, 0F);
        // Source Right rear white mark
        defaultScopeModel[70] = new ModelRendererTurbo(this, 500, 500, 512, 512);
        defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 7.002F, 20.07F, -1.39F, -8.001F, 20.07F, -1.39F, -8.001F, 20.07F, 0.49F, 7.002F, 20.07F, 0.49F, 7.002F, -20.93F, -1.39F, -8.001F, -20.93F, -1.39F, -8.001F, -20.93F, 0.49F, 7.002F, -20.93F, 0.49F);
        defaultScopeModel[70].setRotationPoint(0F, 0F, 0F);
        // Source Front blade white mark
        defaultScopeModel[71] = new ModelRendererTurbo(this, 500, 500, 512, 512);
        defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -25.248F, 19.995F, -0.905F, 24.249F, 19.995F, -0.905F, 24.249F, 19.995F, 0.095F, -25.248F, 19.995F, 0.095F, -25.248F, -20.255F, -0.905F, 24.249F, -20.255F, -0.905F, 24.249F, -20.255F, 0.095F, -25.248F, -20.255F, 0.095F);
        defaultScopeModel[71].setRotationPoint(0F, 0F, 0F);
    }

    private void initDefaultBarrelModel() {
        defaultBarrelModel = new ModelRendererTurbo[29];
        // Source Box 231
        defaultBarrelModel[0] = new ModelRendererTurbo(this, 497, 33, 512, 512);
        defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 1F, -0.75F, -0.25F, 1.25F, -0.75F, -0.25F, 1.25F, 0F, 0F, 1F);
        defaultBarrelModel[0].setRotationPoint(27.5F, -12F, 0.5F);
        // Source Box 233
        defaultBarrelModel[1] = new ModelRendererTurbo(this, 505, 33, 512, 512);
        defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, -0.75F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.75F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, 0F, 0F, 1F);
        defaultBarrelModel[1].setRotationPoint(27.5F, -11F, 0.5F);
        // Source Box 234
        defaultBarrelModel[2] = new ModelRendererTurbo(this, 1, 41, 512, 512);
        defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F);
        defaultBarrelModel[2].setRotationPoint(27F, -11F, 0.5F);
        // Source Box 235
        defaultBarrelModel[3] = new ModelRendererTurbo(this, 9, 41, 512, 512);
        defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, -0.75F, -0.25F, 1.25F);
        defaultBarrelModel[3].setRotationPoint(27F, -12F, 0.5F);
        // Source Box 236
        defaultBarrelModel[4] = new ModelRendererTurbo(this, 17, 41, 512, 512);
        defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, -0.75F, -0.25F, 1.25F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F);
        defaultBarrelModel[4].setRotationPoint(27F, -10F, 0.5F);
        // Source Box 237
        defaultBarrelModel[5] = new ModelRendererTurbo(this, 25, 41, 512, 512);
        defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, -0.75F, -0.25F, 1.25F, -0.75F, -0.25F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0F, 0F);
        defaultBarrelModel[5].setRotationPoint(27.5F, -10F, 0.5F);
        // Source Box 244
        defaultBarrelModel[6] = new ModelRendererTurbo(this, 33, 41, 512, 512);
        defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.75F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.75F, -1F, 0F);
        defaultBarrelModel[6].setRotationPoint(27.25F, -12F, 0.5F);
        // Source Box 246
        defaultBarrelModel[7] = new ModelRendererTurbo(this, 49, 41, 512, 512);
        defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F);
        defaultBarrelModel[7].setRotationPoint(27.25F, -10F, 0.5F);
        // Source Box 247
        defaultBarrelModel[8] = new ModelRendererTurbo(this, 65, 41, 512, 512);
        defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, -0.25F, 1.25F, -0.75F, -0.25F, 1.25F, -0.75F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F);
        defaultBarrelModel[8].setRotationPoint(27.25F, -10F, 0.5F);
        // Source Box 254
        defaultBarrelModel[9] = new ModelRendererTurbo(this, 73, 41, 512, 512);
        defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.25F, 1.25F, 0.5F, -0.25F, 1.25F, 0.5F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0F, -1F, -0.75F, 0F, -1F);
        defaultBarrelModel[9].setRotationPoint(27.25F, -10F, 0.5F);
        // Source Box 262
        defaultBarrelModel[10] = new ModelRendererTurbo(this, 81, 41, 512, 512);
        defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, 0.5F, -0.25F, 1.25F);
        defaultBarrelModel[10].setRotationPoint(32.25F, -12F, 0.5F);
        // Source Box 263
        defaultBarrelModel[11] = new ModelRendererTurbo(this, 89, 41, 512, 512);
        defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, 0.5F, -0.25F, 1.25F, 0.5F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F);
        defaultBarrelModel[11].setRotationPoint(32.25F, -10F, 0.5F);
        // Source Box 264
        defaultBarrelModel[12] = new ModelRendererTurbo(this, 97, 41, 512, 512);
        defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, -0.75F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F);
        defaultBarrelModel[12].setRotationPoint(31F, -11F, 0.5F);
        // Source Box 265
        defaultBarrelModel[13] = new ModelRendererTurbo(this, 105, 41, 512, 512);
        defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.25F, -0.75F, 0.25F, -1.25F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.25F, -0.75F, 0.25F, -1.25F);
        defaultBarrelModel[13].setRotationPoint(31F, -11F, 0.5F);
        // Source Box 266
        defaultBarrelModel[14] = new ModelRendererTurbo(this, 113, 41, 512, 512);
        defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, -0.75F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F);
        defaultBarrelModel[14].setRotationPoint(29F, -11F, 0.5F);
        // Source Box 267
        defaultBarrelModel[15] = new ModelRendererTurbo(this, 121, 41, 512, 512);
        defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, 0.5F, -0.25F, 1.25F, 0.5F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F);
        defaultBarrelModel[15].setRotationPoint(30.25F, -10F, 0.5F);
        // Source Box 268
        defaultBarrelModel[16] = new ModelRendererTurbo(this, 129, 41, 512, 512);
        defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, 0.5F, -0.25F, 1.25F);
        defaultBarrelModel[16].setRotationPoint(30.25F, -12F, 0.5F);
        // Source Box 269
        defaultBarrelModel[17] = new ModelRendererTurbo(this, 137, 41, 512, 512);
        defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.25F, -0.75F, 0.25F, -1.25F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.25F, -0.75F, 0.25F, -1.25F);
        defaultBarrelModel[17].setRotationPoint(29F, -11F, 0.5F);
        // Source Box 271
        defaultBarrelModel[18] = new ModelRendererTurbo(this, 145, 41, 512, 512);
        defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -1F, 0F, -1F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -1F, 0.25F, 0.25F);
        defaultBarrelModel[18].setRotationPoint(29.25F, -10F, 0.5F);
        // Source Box 273
        defaultBarrelModel[19] = new ModelRendererTurbo(this, 161, 41, 512, 512);
        defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.25F, 0.25F, -1F, 0.25F, 0.25F);
        defaultBarrelModel[19].setRotationPoint(29.25F, -10F, 0.5F);
        // Source Box 274
        defaultBarrelModel[20] = new ModelRendererTurbo(this, 169, 41, 512, 512);
        defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.25F, 1.25F, 0.5F, -0.25F, 1.25F, 0.5F, 0F, -2F, -1F, 0F, -2F, -1F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0F, -1F, -1F, 0F, -1F);
        defaultBarrelModel[20].setRotationPoint(29.25F, -10F, 0.5F);
        // Source Box 275
        defaultBarrelModel[21] = new ModelRendererTurbo(this, 177, 41, 512, 512);
        defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.75F, -0.75F, 0.25F, -1.75F, -0.75F, -0.75F, 1.25F, 0.25F, -0.75F, 1.25F, 0.25F, -0.75F, -2.25F, -0.75F, -0.75F, -2.25F);
        defaultBarrelModel[21].setRotationPoint(31F, -11F, 1.5F);
        // Source Box 276
        defaultBarrelModel[22] = new ModelRendererTurbo(this, 185, 41, 512, 512);
        defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, -1.75F, 0.25F, 0.25F, -1.75F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, -0.75F, -0.75F, -2.25F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 1.25F, -0.75F, -0.75F, 1.25F);
        defaultBarrelModel[22].setRotationPoint(31F, -11F, -0.5F);
        // Source Box 277
        defaultBarrelModel[23] = new ModelRendererTurbo(this, 193, 41, 512, 512);
        defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, -2.25F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 1.25F, -0.75F, -0.75F, 1.25F, -0.75F, 0.25F, -1.75F, 0.25F, 0.25F, -1.75F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F);
        defaultBarrelModel[23].setRotationPoint(31F, -11F, -0.5F);
        // Source Box 278
        defaultBarrelModel[24] = new ModelRendererTurbo(this, 201, 41, 512, 512);
        defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, 1.25F, 0.25F, -0.75F, 1.25F, 0.25F, -0.75F, -2.25F, -0.75F, -0.75F, -2.25F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.75F, -0.75F, 0.25F, -1.75F);
        defaultBarrelModel[24].setRotationPoint(31F, -11F, 1.5F);
        // Source Box 279
        defaultBarrelModel[25] = new ModelRendererTurbo(this, 209, 41, 512, 512);
        defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, -2.25F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 1.25F, -0.75F, -0.75F, 1.25F, -0.75F, 0.25F, -1.75F, 0.25F, 0.25F, -1.75F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F);
        defaultBarrelModel[25].setRotationPoint(29F, -11F, -0.5F);
        // Source Box 280
        defaultBarrelModel[26] = new ModelRendererTurbo(this, 217, 41, 512, 512);
        defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, 1.25F, 0.25F, -0.75F, 1.25F, 0.25F, -0.75F, -2.25F, -0.75F, -0.75F, -2.25F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.75F, -0.75F, 0.25F, -1.75F);
        defaultBarrelModel[26].setRotationPoint(29F, -11F, 1.5F);
        // Source Box 281
        defaultBarrelModel[27] = new ModelRendererTurbo(this, 225, 41, 512, 512);
        defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, -1.75F, -0.75F, 0.25F, -1.75F, -0.75F, -0.75F, 1.25F, 0.25F, -0.75F, 1.25F, 0.25F, -0.75F, -2.25F, -0.75F, -0.75F, -2.25F);
        defaultBarrelModel[27].setRotationPoint(29F, -11F, 1.5F);
        // Source Box 282
        defaultBarrelModel[28] = new ModelRendererTurbo(this, 233, 41, 512, 512);
        defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0.25F, -1.75F, 0.25F, 0.25F, -1.75F, 0.25F, 0.25F, 1.25F, -0.75F, 0.25F, 1.25F, -0.75F, -0.75F, -2.25F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 1.25F, -0.75F, -0.75F, 1.25F);
        defaultBarrelModel[28].setRotationPoint(29F, -11F, -0.5F);
    }

    private void initSlideModel() {
        slideModel = new ModelRendererTurbo[10];
        // Source Box 261
        slideModel[0] = new ModelRendererTurbo(this, 1, 49, 512, 512);
        slideModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0.5F, -0.5F, -0.35F, 0.5F, -0.5F, -0.35F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0.6F, -0.35F, 0.5F, 0.6F, -0.35F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F);
        slideModel[0].setRotationPoint(-16F, -13F, -1F);
        // Source Box 264
        slideModel[1] = new ModelRendererTurbo(this, 49, 49, 512, 512);
        slideModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F);
        slideModel[1].setRotationPoint(-4F, -12.5F, -1F);
        // Source Box 265
        slideModel[2] = new ModelRendererTurbo(this, 97, 49, 512, 512);
        slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.65F, 0F, 0F, -0.65F);
        slideModel[2].setRotationPoint(12F, -13F, -1F);
        // Source Box 266
        slideModel[3] = new ModelRendererTurbo(this, 105, 49, 512, 512);
        slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.65F, -0.75F, -0.5F, -0.65F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.65F, -0.75F, 0F, -0.65F);
        slideModel[3].setRotationPoint(13F, -13F, -1F);
        // Source Box 267
        slideModel[4] = new ModelRendererTurbo(this, 113, 49, 512, 512);
        slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, 0.45F, 0.75F, -0.5F, 0.45F, 0.75F, -0.5F, -0.9F, -0.25F, -0.5F, -0.9F, -0.25F, 0F, 0.45F, 0.75F, 0F, 0.45F, 0.75F, 0F, -0.9F, -0.25F, 0F, -0.9F);
        slideModel[4].setRotationPoint(12F, -13F, -1F);
        // Source Box 268
        slideModel[5] = new ModelRendererTurbo(this, 121, 49, 512, 512);
        slideModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0F, 0.45F, -0.2F, 0F, 0.45F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, 0F, -0.5F, 0.45F, 0F, -0.5F, 0.45F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F);
        slideModel[5].setRotationPoint(12F, -13F, -1F);
        // Source Box 269
        slideModel[6] = new ModelRendererTurbo(this, 129, 49, 512, 512);
        slideModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.5F, 0.45F, -0.2F, -0.5F, 0.45F, -0.2F, -0.5F, -0.9F, -0.45F, -0.5F, -0.9F, -0.2F, 0F, 0.45F, -0.2F, 0F, 0.45F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F);
        slideModel[6].setRotationPoint(12F, -14F, -1F);
        // Source Box 270
        slideModel[7] = new ModelRendererTurbo(this, 137, 49, 512, 512);
        slideModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.9F, -0.75F, 0F, -0.9F, -0.45F, -0.5F, 0.45F, -0.2F, -0.5F, 0.45F, -0.2F, -0.5F, -0.9F, -0.45F, -0.5F, -0.9F);
        slideModel[7].setRotationPoint(12F, -14F, -1F);
        // Source Box 271
        slideModel[8] = new ModelRendererTurbo(this, 145, 49, 512, 512);
        slideModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.2F, -0.5F, 0.45F, 0.3F, -0.5F, 0.45F, 0.3F, -0.5F, -0.9F, -1.2F, -0.5F, -0.9F, -0.75F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.9F, -0.75F, 0F, -0.9F);
        slideModel[8].setRotationPoint(12F, -15F, -1F);
        // Source Box 272
        slideModel[9] = new ModelRendererTurbo(this, 153, 49, 512, 512);
        slideModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.75F, 0F, 0.45F, 0.65F, 0F, 0.45F, 0.65F, 0F, -0.9F, -1.75F, 0F, -0.9F, -1.2F, -0.5F, 0.45F, 0.3F, -0.5F, 0.45F, 0.3F, -0.5F, -0.9F, -1.2F, -0.5F, -0.9F);
        slideModel[9].setRotationPoint(12F, -15F, -1F);
    }

    private void initAmmoModel() {
        ammoModel = new ModelRendererTurbo[55];
        // Source Box 294
        ammoModel[0] = new ModelRendererTurbo(this, 369, 49, 512, 512);
        ammoModel[0].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F);
        ammoModel[0].setRotationPoint(-18.5F, -3.5F, -0.5F);
        // Source Box 295
        ammoModel[1] = new ModelRendererTurbo(this, 393, 49, 512, 512);
        ammoModel[1].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F);
        ammoModel[1].setRotationPoint(-18.5F, 0.5F, -0.5F);
        // Source Box 296
        ammoModel[2] = new ModelRendererTurbo(this, 417, 49, 512, 512);
        ammoModel[2].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F);
        ammoModel[2].setRotationPoint(-18.5F, 4.5F, -0.5F);
        // Source Box 297
        ammoModel[3] = new ModelRendererTurbo(this, 441, 49, 512, 512);
        ammoModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F, -3.25F, 1.75F, 0F, 3F, -0.75F, 0F, 3F, -0.75F, 0F, -3.25F, 1.75F, 0F);
        ammoModel[3].setRotationPoint(-18.5F, 8.5F, -0.5F);
        // Source Box 299
        ammoModel[4] = new ModelRendererTurbo(this, 489, 25, 512, 512);
        ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, -1.5F, 0F, 0F);
        ammoModel[4].setRotationPoint(-10.5F, 4.5F, -0.5F);
        // Source Box 300
        ammoModel[5] = new ModelRendererTurbo(this, 25, 33, 512, 512);
        ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 0F, 0F);
        ammoModel[5].setRotationPoint(-10.5F, 0.5F, -0.5F);
        // Source Box 301
        ammoModel[6] = new ModelRendererTurbo(this, 57, 33, 512, 512);
        ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F);
        ammoModel[6].setRotationPoint(-10.5F, -3.5F, -0.5F);
        // Source Box 302
        ammoModel[7] = new ModelRendererTurbo(this, 465, 49, 512, 512);
        ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 1F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 1F, 0F, 0F);
        ammoModel[7].setRotationPoint(-10.5F, -7.5F, 1.5F);
        // Source Box 303
        ammoModel[8] = new ModelRendererTurbo(this, 473, 49, 512, 512);
        ammoModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 1F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F);
        ammoModel[8].setRotationPoint(-18.5F, -7.5F, 1.5F);
        // Source Box 304
        ammoModel[9] = new ModelRendererTurbo(this, 489, 49, 512, 512);
        ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 1F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 1F, 0F, -0.75F);
        ammoModel[9].setRotationPoint(-10.5F, -7.5F, -0.5F);
        // Source Box 305
        ammoModel[10] = new ModelRendererTurbo(this, 41, 41, 512, 512);
        ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, -0.25F, 0F, -0.45F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.45F);
        ammoModel[10].setRotationPoint(-10.5F, -7.5F, -0.5F);
        // Source Box 306
        ammoModel[11] = new ModelRendererTurbo(this, 321, 49, 512, 512);
        ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F);
        ammoModel[11].setRotationPoint(-18.5F, -8.5F, -0.5F);
        // Source Box 307
        ammoModel[12] = new ModelRendererTurbo(this, 497, 49, 512, 512);
        ammoModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F);
        ammoModel[12].setRotationPoint(-14.5F, -7.5F, 1.5F);
        // Source Box 308
        ammoModel[13] = new ModelRendererTurbo(this, 1, 57, 512, 512);
        ammoModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F);
        ammoModel[13].setRotationPoint(-14.5F, -7.5F, -0.5F);
        // Source Box 309
        ammoModel[14] = new ModelRendererTurbo(this, 17, 57, 512, 512);
        ammoModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F);
        ammoModel[14].setRotationPoint(-18.5F, -7.5F, -0.5F);
        // Source Box 310
        ammoModel[15] = new ModelRendererTurbo(this, 57, 41, 512, 512);
        ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1.5F, 0F, 0F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, -1.5F, 0F, 0F, -2F, 0.25F, 0F, 2.5F, -0.25F, -0.25F, 2.5F, -0.25F, -0.25F, -2F, 0.25F, 0F);
        ammoModel[15].setRotationPoint(-10.5F, 8.5F, -0.5F);
        // Source Box 312
        ammoModel[16] = new ModelRendererTurbo(this, 33, 57, 512, 512);
        ammoModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, -0.25F, -0.75F, 0.5F, 0F, 1.75F, 0.5F, 0F, 1.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, -0.5F, 0.5F, 0.5F);
        ammoModel[16].setRotationPoint(-15.5F, 11.5F, -0.5F);
        // Source Box 313
        ammoModel[17] = new ModelRendererTurbo(this, 153, 41, 512, 512);
        ammoModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 1.75F, 0.5F, -0.5F, 2.25F, 0.5F, -0.5F, 2.25F, 0.5F, 0F, 1.75F, 0.5F, 0F, -1.75F, 0.5F, -0.5F, -2.25F, 0.5F, -0.5F, -2.25F, 0.5F, 0F, -1.75F, 0.5F);
        ammoModel[17].setRotationPoint(-8.5F, 11.5F, -0.5F);
        // Source Box 314
        ammoModel[18] = new ModelRendererTurbo(this, 57, 57, 512, 512);
        ammoModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, 2.25F, 0.5F, -1F, 2.4F, 0F, -1F, 2.4F, 0F, -0.5F, 2.25F, 0.5F, -0.5F, -2.25F, 0.5F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -0.5F, -2.25F, 0.5F);
        ammoModel[18].setRotationPoint(-7.5F, 11.5F, -0.5F);
        // Source Box 317
        ammoModel[19] = new ModelRendererTurbo(this, 65, 57, 512, 512);
        ammoModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F);
        ammoModel[19].setRotationPoint(-17.5F, -8.5F, 0F);
        // Source Box 319
        ammoModel[20] = new ModelRendererTurbo(this, 81, 57, 512, 512);
        ammoModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F);
        ammoModel[20].setRotationPoint(-17.5F, -7.5F, 0F);
        // Source Box 320
        ammoModel[21] = new ModelRendererTurbo(this, 97, 57, 512, 512);
        ammoModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F);
        ammoModel[21].setRotationPoint(-17.5F, -7F, 0F);
        // Source Box 321
        ammoModel[22] = new ModelRendererTurbo(this, 113, 57, 512, 512);
        ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F);
        ammoModel[22].setRotationPoint(-12F, -8.5F, 0F);
        // Source Box 322
        ammoModel[23] = new ModelRendererTurbo(this, 121, 57, 512, 512);
        ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.5F, -0.25F);
        ammoModel[23].setRotationPoint(-12F, -7F, 0F);
        // Source Box 323
        ammoModel[24] = new ModelRendererTurbo(this, 129, 57, 512, 512);
        ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.25F);
        ammoModel[24].setRotationPoint(-12F, -7.5F, 0F);
        // Source Box 324
        ammoModel[25] = new ModelRendererTurbo(this, 137, 57, 512, 512);
        ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F);
        ammoModel[25].setRotationPoint(-18.5F, -8.5F, 0F);
        // Source Box 325
        ammoModel[26] = new ModelRendererTurbo(this, 145, 57, 512, 512);
        ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F);
        ammoModel[26].setRotationPoint(-18.5F, -7.5F, 0F);
        // Source Box 326
        ammoModel[27] = new ModelRendererTurbo(this, 153, 57, 512, 512);
        ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
        ammoModel[27].setRotationPoint(-18.5F, -7F, 0F);
        // Source Box 327
        ammoModel[28] = new ModelRendererTurbo(this, 161, 57, 512, 512);
        ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, 0.1F);
        ammoModel[28].setRotationPoint(-11F, -7.5F, 0F);
        // Source Box 328
        ammoModel[29] = new ModelRendererTurbo(this, 169, 57, 512, 512);
        ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.65F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F);
        ammoModel[29].setRotationPoint(-11F, -8.5F, 0F);
        // Source Box 323
        ammoModel[30] = new ModelRendererTurbo(this, 177, 57, 512, 512);
        ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F, 0F, -0.65F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.65F, -0.25F);
        ammoModel[30].setRotationPoint(-11F, -7F, 0F);
        // Source Box 324
        ammoModel[31] = new ModelRendererTurbo(this, 185, 57, 512, 512);
        ammoModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F);
        ammoModel[31].setRotationPoint(-17.5F, -6F, 1F);
        // Source Box 325
        ammoModel[32] = new ModelRendererTurbo(this, 201, 57, 512, 512);
        ammoModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F);
        ammoModel[32].setRotationPoint(-17.5F, -6.5F, 1F);
        // Source Box 326
        ammoModel[33] = new ModelRendererTurbo(this, 217, 57, 512, 512);
        ammoModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F);
        ammoModel[33].setRotationPoint(-17.5F, -7.5F, 1F);
        // Source Box 327
        ammoModel[34] = new ModelRendererTurbo(this, 233, 57, 512, 512);
        ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F);
        ammoModel[34].setRotationPoint(-18.5F, -7.5F, 1F);
        // Source Box 328
        ammoModel[35] = new ModelRendererTurbo(this, 241, 57, 512, 512);
        ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F);
        ammoModel[35].setRotationPoint(-18.5F, -6.5F, 1F);
        // Source Box 329
        ammoModel[36] = new ModelRendererTurbo(this, 249, 57, 512, 512);
        ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
        ammoModel[36].setRotationPoint(-18.5F, -6F, 1F);
        // Source Box 330
        ammoModel[37] = new ModelRendererTurbo(this, 257, 57, 512, 512);
        ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F);
        ammoModel[37].setRotationPoint(-12F, -7.5F, 1F);
        // Source Box 331
        ammoModel[38] = new ModelRendererTurbo(this, 265, 57, 512, 512);
        ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.25F);
        ammoModel[38].setRotationPoint(-12F, -6.5F, 1F);
        // Source Box 332
        ammoModel[39] = new ModelRendererTurbo(this, 273, 57, 512, 512);
        ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.5F, -0.25F);
        ammoModel[39].setRotationPoint(-12F, -6F, 1F);
        // Source Box 333
        ammoModel[40] = new ModelRendererTurbo(this, 281, 57, 512, 512);
        ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F, 0F, -0.65F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.65F, -0.25F);
        ammoModel[40].setRotationPoint(-11F, -6F, 1F);
        // Source Box 334
        ammoModel[41] = new ModelRendererTurbo(this, 289, 57, 512, 512);
        ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, 0.1F);
        ammoModel[41].setRotationPoint(-11F, -6.5F, 1F);
        // Source Box 335
        ammoModel[42] = new ModelRendererTurbo(this, 297, 57, 512, 512);
        ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.65F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F);
        ammoModel[42].setRotationPoint(-11F, -7.5F, 1F);
        // Source Box 336
        ammoModel[43] = new ModelRendererTurbo(this, 305, 57, 512, 512);
        ammoModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F);
        ammoModel[43].setRotationPoint(-17.5F, -5.1F, 0F);
        // Source Box 337
        ammoModel[44] = new ModelRendererTurbo(this, 329, 57, 512, 512);
        ammoModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F);
        ammoModel[44].setRotationPoint(-17.5F, -5.6F, 0F);
        // Source Box 338
        ammoModel[45] = new ModelRendererTurbo(this, 345, 57, 512, 512);
        ammoModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F);
        ammoModel[45].setRotationPoint(-17.5F, -6.6F, 0F);
        // Source Box 339
        ammoModel[46] = new ModelRendererTurbo(this, 361, 57, 512, 512);
        ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F);
        ammoModel[46].setRotationPoint(-18.5F, -6.6F, 0F);
        // Source Box 340
        ammoModel[47] = new ModelRendererTurbo(this, 369, 57, 512, 512);
        ammoModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F);
        ammoModel[47].setRotationPoint(-18.5F, -5.6F, 0F);
        // Source Box 341
        ammoModel[48] = new ModelRendererTurbo(this, 377, 57, 512, 512);
        ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
        ammoModel[48].setRotationPoint(-18.5F, -5.1F, 0F);
        // Source Box 342
        ammoModel[49] = new ModelRendererTurbo(this, 385, 57, 512, 512);
        ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F);
        ammoModel[49].setRotationPoint(-12F, -6.6F, 0F);
        // Source Box 343
        ammoModel[50] = new ModelRendererTurbo(this, 393, 57, 512, 512);
        ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.25F);
        ammoModel[50].setRotationPoint(-12F, -5.6F, 0F);
        // Source Box 344
        ammoModel[51] = new ModelRendererTurbo(this, 401, 57, 512, 512);
        ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.5F, -0.25F);
        ammoModel[51].setRotationPoint(-12F, -5.1F, 0F);
        // Source Box 345
        ammoModel[52] = new ModelRendererTurbo(this, 409, 57, 512, 512);
        ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F, 0F, -0.65F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.65F, -0.25F);
        ammoModel[52].setRotationPoint(-11F, -5.1F, 0F);
        // Source Box 346
        ammoModel[53] = new ModelRendererTurbo(this, 417, 57, 512, 512);
        ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, 0.1F);
        ammoModel[53].setRotationPoint(-11F, -5.6F, 0F);
        // Source Box 347
        ammoModel[54] = new ModelRendererTurbo(this, 425, 57, 512, 512);
        ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.65F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.1F);
        ammoModel[54].setRotationPoint(-11F, -6.6F, 0F);
    }
}
