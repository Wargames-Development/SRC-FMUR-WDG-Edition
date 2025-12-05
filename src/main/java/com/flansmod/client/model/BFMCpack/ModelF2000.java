package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelF2000 extends ModelGun //Same as Filename
{
    int textureX = 1024;
    int textureY = 1024;

    public ModelF2000() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[562];
        defaultScopeModel = new ModelRendererTurbo[47];
        ammoModel = new ModelRendererTurbo[33];
        slideModel = new ModelRendererTurbo[17];
        barrelAttachPoint = new Vector3f(8.1875F, 3.296875F, 0.0F);
        gadgetAttachPoint = new Vector3f(5.875F, 1.8125F, -0.65F);
        scopeAttachPoint = new Vector3f(0.6875F, 4.5F, 0.0F);
        gripAttachPoint = new Vector3f(5.125F, 1.21875F, 0.0F);
        thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
        gunSlideDistance = 2.5F;
        gunOffset = -0.3F;
        leftArmPos = new Vector3f(0.0F, -0.4F, -0.05F);
        leftArmRot = new Vector3f(80.0F, 50.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.95F, -0.05F);
        leftArmReloadRot = new Vector3f(80.0F, 50.0F, 0.0F);
        rightArmPos = new Vector3f(0.25F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.25F, -0.54F, 0.05F);
        rightArmReloadRot = new Vector3f(0.0F, 20.0F, -85.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);
        leftArmScale = new Vector3f(0.75D, 1.25D, 0.75D);
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
        zoomOffset = 0.1F;
        ShakeDistance = 0.2F;
        initgunModel_1();
        initgunModel_2();
        initdefaultScopeModel_1();
        initammoModel_1();
        initslideModel_1();

        translateAll(0F, -16.75F, -0.65F);

        //修正模型位移
        Vector3f vec3 = new Vector3f(10F, -10F, 0F);
        translateAll(vec3.x, vec3.y, vec3.z);
        vec3.y = -((Vector3f) vec3.scale(1 / 16F)).y;
        barrelAttachPoint = Vector3f.add(barrelAttachPoint, vec3, null);
        gadgetAttachPoint = Vector3f.add(gadgetAttachPoint, vec3, null);
        scopeAttachPoint = Vector3f.add(scopeAttachPoint, vec3, null);
        gripAttachPoint = Vector3f.add(gripAttachPoint, vec3, null);

        zoomOffsetY = -0.05F;
        gunOffsetX = -3F;

        hasFlash = true;
        flashScale = 5F;
        muzzleFlashPoint = new Vector3f(
                barrelAttachPoint.x / flashScale,
                barrelAttachPoint.y / flashScale,
                barrelAttachPoint.z / flashScale
        );

        flipAll();
    }

    private void initgunModel_1() {
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); //
        gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); //
        gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); //
        gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); //
        gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); //
        gunModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); //
        gunModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); //
        gunModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); //
        gunModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); //
        gunModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); //
        gunModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); //
        gunModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); //
        gunModel[12] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); //
        gunModel[13] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); //
        gunModel[14] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); //
        gunModel[15] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); //
        gunModel[16] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); //
        gunModel[17] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); //
        gunModel[18] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); //
        gunModel[19] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); //
        gunModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); //
        gunModel[21] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); //
        gunModel[22] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); //
        gunModel[23] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); //
        gunModel[24] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); //
        gunModel[25] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); //
        gunModel[26] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); //
        gunModel[27] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); //
        gunModel[28] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); //
        gunModel[29] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); //
        gunModel[30] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); //
        gunModel[31] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); //
        gunModel[32] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); //
        gunModel[33] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); //
        gunModel[34] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); //
        gunModel[35] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); //
        gunModel[36] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); //
        gunModel[37] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); //
        gunModel[38] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); //
        gunModel[39] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); //
        gunModel[40] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); //
        gunModel[41] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); //
        gunModel[42] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); //
        gunModel[43] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); //
        gunModel[44] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); //
        gunModel[45] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); //
        gunModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); //
        gunModel[47] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); //
        gunModel[48] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); //
        gunModel[49] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); //
        gunModel[50] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); //
        gunModel[51] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); //
        gunModel[52] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); //
        gunModel[53] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); //
        gunModel[54] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); //
        gunModel[55] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); //
        gunModel[56] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); //
        gunModel[57] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); //
        gunModel[58] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); //
        gunModel[59] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); //
        gunModel[60] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); //
        gunModel[61] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); //
        gunModel[62] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); //
        gunModel[63] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); //
        gunModel[64] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); //
        gunModel[65] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); //
        gunModel[66] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); //
        gunModel[67] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); //
        gunModel[68] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); //
        gunModel[69] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); //
        gunModel[70] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); //
        gunModel[71] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); //
        gunModel[72] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); //
        gunModel[73] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); //
        gunModel[74] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); //
        gunModel[75] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); //
        gunModel[76] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); //
        gunModel[77] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); //
        gunModel[78] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); //
        gunModel[79] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); //
        gunModel[80] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); //
        gunModel[81] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); //
        gunModel[82] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); //
        gunModel[83] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); //
        gunModel[84] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); //
        gunModel[85] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); //
        gunModel[86] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); //
        gunModel[87] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); //
        gunModel[88] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); //
        gunModel[89] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); //
        gunModel[90] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); //
        gunModel[91] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); //
        gunModel[92] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); //
        gunModel[93] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); //
        gunModel[94] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); //
        gunModel[95] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); //
        gunModel[96] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); //
        gunModel[97] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); //
        gunModel[98] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); //
        gunModel[99] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); //
        gunModel[100] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); //
        gunModel[101] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); //
        gunModel[102] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); //
        gunModel[103] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); //
        gunModel[104] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); //
        gunModel[105] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); //
        gunModel[106] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); //
        gunModel[107] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); //
        gunModel[108] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); //
        gunModel[109] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); //
        gunModel[110] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); //
        gunModel[111] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); //
        gunModel[112] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); //
        gunModel[113] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); //
        gunModel[114] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); //
        gunModel[115] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); //
        gunModel[116] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); //
        gunModel[117] = new ModelRendererTurbo(this, 553, 193, textureX, textureY); //
        gunModel[118] = new ModelRendererTurbo(this, 609, 193, textureX, textureY); //
        gunModel[119] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); //
        gunModel[120] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); //
        gunModel[121] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); //
        gunModel[122] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); //
        gunModel[123] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); //
        gunModel[124] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); //
        gunModel[125] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); //
        gunModel[126] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); //
        gunModel[127] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); //
        gunModel[128] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); //
        gunModel[129] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); //
        gunModel[130] = new ModelRendererTurbo(this, 713, 193, textureX, textureY); //
        gunModel[131] = new ModelRendererTurbo(this, 721, 209, textureX, textureY); //
        gunModel[132] = new ModelRendererTurbo(this, 817, 209, textureX, textureY); //
        gunModel[133] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); //
        gunModel[134] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); //
        gunModel[135] = new ModelRendererTurbo(this, 537, 217, textureX, textureY); //
        gunModel[136] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); //
        gunModel[137] = new ModelRendererTurbo(this, 841, 209, textureX, textureY); //
        gunModel[138] = new ModelRendererTurbo(this, 897, 217, textureX, textureY); //
        gunModel[139] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); //
        gunModel[140] = new ModelRendererTurbo(this, 617, 217, textureX, textureY); //
        gunModel[141] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); //
        gunModel[142] = new ModelRendererTurbo(this, 673, 225, textureX, textureY); //
        gunModel[143] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); //
        gunModel[144] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); //
        gunModel[145] = new ModelRendererTurbo(this, 705, 241, textureX, textureY); //
        gunModel[146] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); //
        gunModel[147] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); //
        gunModel[148] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); //
        gunModel[149] = new ModelRendererTurbo(this, 593, 217, textureX, textureY); //
        gunModel[150] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); //
        gunModel[151] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); //
        gunModel[152] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); //
        gunModel[153] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); //
        gunModel[154] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); //
        gunModel[155] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); //
        gunModel[156] = new ModelRendererTurbo(this, 553, 249, textureX, textureY); //
        gunModel[157] = new ModelRendererTurbo(this, 553, 257, textureX, textureY); //
        gunModel[158] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); //
        gunModel[159] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); //
        gunModel[160] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); //
        gunModel[161] = new ModelRendererTurbo(this, 553, 265, textureX, textureY); //
        gunModel[162] = new ModelRendererTurbo(this, 233, 273, textureX, textureY); //
        gunModel[163] = new ModelRendererTurbo(this, 577, 273, textureX, textureY); //
        gunModel[164] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); //
        gunModel[165] = new ModelRendererTurbo(this, 729, 273, textureX, textureY); //
        gunModel[166] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); //
        gunModel[167] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); //
        gunModel[168] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); //
        gunModel[169] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); //
        gunModel[170] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); //
        gunModel[171] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); //
        gunModel[172] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); //
        gunModel[173] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); //
        gunModel[174] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); //
        gunModel[175] = new ModelRendererTurbo(this, 977, 241, textureX, textureY); //
        gunModel[176] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); //
        gunModel[177] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); //
        gunModel[178] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); //
        gunModel[179] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); //
        gunModel[180] = new ModelRendererTurbo(this, 929, 273, textureX, textureY); //
        gunModel[181] = new ModelRendererTurbo(this, 977, 265, textureX, textureY); //
        gunModel[182] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); //
        gunModel[183] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); //
        gunModel[184] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); //
        gunModel[185] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); //
        gunModel[186] = new ModelRendererTurbo(this, 705, 289, textureX, textureY); //
        gunModel[187] = new ModelRendererTurbo(this, 769, 289, textureX, textureY); //
        gunModel[188] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); //
        gunModel[189] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); //
        gunModel[190] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); //
        gunModel[191] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); //
        gunModel[192] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); //
        gunModel[193] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); //
        gunModel[194] = new ModelRendererTurbo(this, 817, 289, textureX, textureY); //
        gunModel[195] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); //
        gunModel[196] = new ModelRendererTurbo(this, 833, 305, textureX, textureY); //
        gunModel[197] = new ModelRendererTurbo(this, 385, 313, textureX, textureY); //
        gunModel[198] = new ModelRendererTurbo(this, 521, 313, textureX, textureY); //
        gunModel[199] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); //
        gunModel[200] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); //
        gunModel[201] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); //
        gunModel[202] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); //
        gunModel[203] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); //
        gunModel[204] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); //
        gunModel[205] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); //
        gunModel[206] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); //
        gunModel[207] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); //
        gunModel[208] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); //
        gunModel[209] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); //
        gunModel[210] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); //
        gunModel[211] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); //
        gunModel[212] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); //
        gunModel[213] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); //
        gunModel[214] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); //
        gunModel[215] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); //
        gunModel[216] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); //
        gunModel[217] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); //
        gunModel[218] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); //
        gunModel[219] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); //
        gunModel[220] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); //
        gunModel[221] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); //
        gunModel[222] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); //
        gunModel[223] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); //
        gunModel[224] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); //
        gunModel[225] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); //
        gunModel[226] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); //
        gunModel[227] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); //
        gunModel[228] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); //
        gunModel[229] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); //
        gunModel[230] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); //
        gunModel[231] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); //
        gunModel[232] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); //
        gunModel[233] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); //
        gunModel[234] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); //
        gunModel[235] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); //
        gunModel[236] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); //
        gunModel[237] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); //
        gunModel[238] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); //
        gunModel[239] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); //
        gunModel[240] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); //
        gunModel[241] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); //
        gunModel[242] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); //
        gunModel[243] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); //
        gunModel[244] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); //
        gunModel[245] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); //
        gunModel[246] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); //
        gunModel[247] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); //
        gunModel[248] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); //
        gunModel[249] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); //
        gunModel[250] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); //
        gunModel[251] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); //
        gunModel[252] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); //
        gunModel[253] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); //
        gunModel[254] = new ModelRendererTurbo(this, 657, 313, textureX, textureY); //
        gunModel[255] = new ModelRendererTurbo(this, 793, 313, textureX, textureY); //
        gunModel[256] = new ModelRendererTurbo(this, 713, 233, textureX, textureY); //
        gunModel[257] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); //
        gunModel[258] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); //
        gunModel[259] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); //
        gunModel[260] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); //
        gunModel[261] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); //
        gunModel[262] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); //
        gunModel[263] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); //
        gunModel[264] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); //
        gunModel[265] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); //
        gunModel[266] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); //
        gunModel[267] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); //
        gunModel[268] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); //
        gunModel[269] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); //
        gunModel[270] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); //
        gunModel[271] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); //
        gunModel[272] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); //
        gunModel[273] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); //
        gunModel[274] = new ModelRendererTurbo(this, 545, 321, textureX, textureY); //
        gunModel[275] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); //
        gunModel[276] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); //
        gunModel[277] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); //
        gunModel[278] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); //
        gunModel[279] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); //
        gunModel[280] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); //
        gunModel[281] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); //
        gunModel[282] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); //
        gunModel[283] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); //
        gunModel[284] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); //
        gunModel[285] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); //
        gunModel[286] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); //
        gunModel[287] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); //
        gunModel[288] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); //
        gunModel[289] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); //
        gunModel[290] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); //
        gunModel[291] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); //
        gunModel[292] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); //
        gunModel[293] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); //
        gunModel[294] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); //
        gunModel[295] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); //
        gunModel[296] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); //
        gunModel[297] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); //
        gunModel[298] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); //
        gunModel[299] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); //
        gunModel[300] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); //
        gunModel[301] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); //
        gunModel[302] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); //
        gunModel[303] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); //
        gunModel[304] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); //
        gunModel[305] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); //
        gunModel[306] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); //
        gunModel[307] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); //
        gunModel[308] = new ModelRendererTurbo(this, 681, 321, textureX, textureY); //
        gunModel[309] = new ModelRendererTurbo(this, 817, 321, textureX, textureY); //
        gunModel[310] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); //
        gunModel[311] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); //
        gunModel[312] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); //
        gunModel[313] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); //
        gunModel[314] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); //
        gunModel[315] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); //
        gunModel[316] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); //
        gunModel[317] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); //
        gunModel[318] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); //
        gunModel[319] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); //
        gunModel[320] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); //
        gunModel[321] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); //
        gunModel[322] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); //
        gunModel[323] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); //
        gunModel[324] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); //
        gunModel[325] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); //
        gunModel[326] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); //
        gunModel[327] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); //
        gunModel[328] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); //
        gunModel[329] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); //
        gunModel[330] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); //
        gunModel[331] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); //
        gunModel[332] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); //
        gunModel[333] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); //
        gunModel[334] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); //
        gunModel[335] = new ModelRendererTurbo(this, 921, 161, textureX, textureY); //
        gunModel[336] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); //
        gunModel[337] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); //
        gunModel[338] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); //
        gunModel[339] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); //
        gunModel[340] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); //
        gunModel[341] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); //
        gunModel[342] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); //
        gunModel[343] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); //
        gunModel[344] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); //
        gunModel[345] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); //
        gunModel[346] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); //
        gunModel[347] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); //
        gunModel[348] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); //
        gunModel[349] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); //
        gunModel[350] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); //
        gunModel[351] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); //
        gunModel[352] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); //
        gunModel[353] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); //
        gunModel[354] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); //
        gunModel[355] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); //
        gunModel[356] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); //
        gunModel[357] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); //
        gunModel[358] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); //
        gunModel[359] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); //
        gunModel[360] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); //
        gunModel[361] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); //
        gunModel[362] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); //
        gunModel[363] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); //
        gunModel[364] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); //
        gunModel[365] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); //
        gunModel[366] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); //
        gunModel[367] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); //
        gunModel[368] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); //
        gunModel[369] = new ModelRendererTurbo(this, 345, 329, textureX, textureY); //
        gunModel[370] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); //
        gunModel[371] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); //
        gunModel[372] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); //
        gunModel[373] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); //
        gunModel[374] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); //
        gunModel[375] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); //
        gunModel[376] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); //
        gunModel[377] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); //
        gunModel[378] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); //
        gunModel[379] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); //
        gunModel[380] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); //
        gunModel[381] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); //
        gunModel[382] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); //
        gunModel[383] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); //
        gunModel[384] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); //
        gunModel[385] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); //
        gunModel[386] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); //
        gunModel[387] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); //
        gunModel[388] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); //
        gunModel[389] = new ModelRendererTurbo(this, 425, 297, textureX, textureY); //
        gunModel[390] = new ModelRendererTurbo(this, 833, 297, textureX, textureY); //
        gunModel[391] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); //
        gunModel[392] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); //
        gunModel[393] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); //
        gunModel[394] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); //
        gunModel[395] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); //
        gunModel[396] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); //
        gunModel[397] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); //
        gunModel[398] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); //
        gunModel[399] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); //
        gunModel[400] = new ModelRendererTurbo(this, 537, 329, textureX, textureY); //
        gunModel[401] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); //
        gunModel[402] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); //
        gunModel[403] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); //
        gunModel[404] = new ModelRendererTurbo(this, 977, 289, textureX, textureY); //
        gunModel[405] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); //
        gunModel[406] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); //
        gunModel[407] = new ModelRendererTurbo(this, 945, 313, textureX, textureY); //
        gunModel[408] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); //
        gunModel[409] = new ModelRendererTurbo(this, 729, 329, textureX, textureY); //
        gunModel[410] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); //
        gunModel[411] = new ModelRendererTurbo(this, 873, 217, textureX, textureY); //
        gunModel[412] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); //
        gunModel[413] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); //
        gunModel[414] = new ModelRendererTurbo(this, 777, 329, textureX, textureY); //
        gunModel[415] = new ModelRendererTurbo(this, 825, 329, textureX, textureY); //
        gunModel[416] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); //
        gunModel[417] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); //
        gunModel[418] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); //
        gunModel[419] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); //
        gunModel[420] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); //
        gunModel[421] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); //
        gunModel[422] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); //
        gunModel[423] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); //
        gunModel[424] = new ModelRendererTurbo(this, 865, 329, textureX, textureY); //
        gunModel[425] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); //
        gunModel[426] = new ModelRendererTurbo(this, 889, 329, textureX, textureY); //
        gunModel[427] = new ModelRendererTurbo(this, 209, 337, textureX, textureY); //
        gunModel[428] = new ModelRendererTurbo(this, 969, 313, textureX, textureY); //
        gunModel[429] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); //
        gunModel[430] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); //
        gunModel[431] = new ModelRendererTurbo(this, 401, 337, textureX, textureY); //
        gunModel[432] = new ModelRendererTurbo(this, 473, 337, textureX, textureY); //
        gunModel[433] = new ModelRendererTurbo(this, 937, 345, textureX, textureY); //
        gunModel[434] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); //
        gunModel[435] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); //
        gunModel[436] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); //
        gunModel[437] = new ModelRendererTurbo(this, 521, 353, textureX, textureY); //
        gunModel[438] = new ModelRendererTurbo(this, 585, 353, textureX, textureY); //
        gunModel[439] = new ModelRendererTurbo(this, 969, 345, textureX, textureY); //
        gunModel[440] = new ModelRendererTurbo(this, 649, 353, textureX, textureY); //
        gunModel[441] = new ModelRendererTurbo(this, 713, 353, textureX, textureY); //
        gunModel[442] = new ModelRendererTurbo(this, 769, 353, textureX, textureY); //
        gunModel[443] = new ModelRendererTurbo(this, 833, 353, textureX, textureY); //
        gunModel[444] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); //
        gunModel[445] = new ModelRendererTurbo(this, 793, 217, textureX, textureY); //
        gunModel[446] = new ModelRendererTurbo(this, 377, 353, textureX, textureY); //
        gunModel[447] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); //
        gunModel[448] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); //
        gunModel[449] = new ModelRendererTurbo(this, 561, 353, textureX, textureY); //
        gunModel[450] = new ModelRendererTurbo(this, 625, 353, textureX, textureY); //
        gunModel[451] = new ModelRendererTurbo(this, 713, 305, textureX, textureY); //
        gunModel[452] = new ModelRendererTurbo(this, 33, 361, textureX, textureY); //
        gunModel[453] = new ModelRendererTurbo(this, 97, 361, textureX, textureY); //
        gunModel[454] = new ModelRendererTurbo(this, 137, 361, textureX, textureY); //
        gunModel[455] = new ModelRendererTurbo(this, 865, 361, textureX, textureY); //
        gunModel[456] = new ModelRendererTurbo(this, 233, 369, textureX, textureY); //
        gunModel[457] = new ModelRendererTurbo(this, 521, 49, textureX, textureY); //
        gunModel[458] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); //
        gunModel[459] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); //
        gunModel[460] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); //
        gunModel[461] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); //
        gunModel[462] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); //
        gunModel[463] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); //
        gunModel[464] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); //
        gunModel[465] = new ModelRendererTurbo(this, 793, 185, textureX, textureY); //
        gunModel[466] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); //
        gunModel[467] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); //
        gunModel[468] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); //
        gunModel[469] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); //
        gunModel[470] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); //
        gunModel[471] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); //
        gunModel[472] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); //
        gunModel[473] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); //
        gunModel[474] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); //
        gunModel[475] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); //
        gunModel[476] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); //
        gunModel[477] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); //
        gunModel[478] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); //
        gunModel[479] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); //
        gunModel[480] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); //
        gunModel[481] = new ModelRendererTurbo(this, 273, 369, textureX, textureY); //
        gunModel[482] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); //
        gunModel[483] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); //
        gunModel[484] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); //
        gunModel[485] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); //
        gunModel[486] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); //
        gunModel[487] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); //
        gunModel[488] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); //
        gunModel[489] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); //
        gunModel[490] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); //
        gunModel[491] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); //
        gunModel[492] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); //
        gunModel[493] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); //
        gunModel[494] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); //
        gunModel[495] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); //
        gunModel[496] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); //
        gunModel[497] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); //
        gunModel[498] = new ModelRendererTurbo(this, 913, 369, textureX, textureY); //
        gunModel[499] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); //

        gunModel[0].addShapeBox(-1F, -11F, -7F, 3, 4, 15, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.5F, 0.0F, -1.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 4.5F, 0.0F, -1.0F); //
        gunModel[0].setRotationPoint(-13.5F, 6F, 0F);

        gunModel[1].addShapeBox(-1F, -11F, -7F, 3, 3, 15, 0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -1.0F); //
        gunModel[1].setRotationPoint(-6F, -2F, 0F);

        gunModel[2].addShapeBox(-1F, -11F, -7F, 3, 5, 15, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.5F, 0.0F, -1.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 4.5F, 0.0F, -1.0F); //
        gunModel[2].setRotationPoint(-9F, 1F, 0F);

        gunModel[3].addShapeBox(-1F, -11F, -7F, 3, 3, 15, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[3].setRotationPoint(-8F, -5F, 0F);

        gunModel[4].addShapeBox(-1F, -11F, -7F, 12, 2, 15, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[4].setRotationPoint(-33F, 13F, 0F);

        gunModel[5].addShapeBox(-1F, -11F, -7F, 3, 2, 15, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[5].setRotationPoint(-21F, 13F, 0F);

        gunModel[6].addShapeBox(-1F, -11F, -7F, 3, 2, 15, 0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[6].setRotationPoint(-18F, 11F, 0F);

        gunModel[7].addShapeBox(-1F, -11F, -7F, 11, 3, 15, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[7].setRotationPoint(-5F, -5F, 0F);

        gunModel[8].addShapeBox(-1F, -11F, -7F, 10, 3, 15, 0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F); //
        gunModel[8].setRotationPoint(-3F, -2F, 0F);

        gunModel[9].addShapeBox(-1F, -11F, -7F, 4, 5, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F); //
        gunModel[9].setRotationPoint(-6F, 1F, 0F);

        gunModel[10].addShapeBox(-1F, -11F, -7F, 4, 4, 15, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F); //
        gunModel[10].setRotationPoint(-11F, 6F, 0F);

        gunModel[11].addShapeBox(-1F, -11F, -7F, 9, 3, 15, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F); //
        gunModel[11].setRotationPoint(-14F, 10F, 0F);

        gunModel[12].addShapeBox(-1F, -11F, -7F, 3, 2, 15, 0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F); //
        gunModel[12].setRotationPoint(-17F, 13F, 0F);

        gunModel[13].addShapeBox(-1F, -11F, -7F, 19, 5, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[13].setRotationPoint(-33F, 15F, 0F);

        gunModel[14].addShapeBox(-1F, -11F, -7F, 34, 5, 15, 0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -5.0F, 0.0F); //
        gunModel[14].setRotationPoint(-69F, 15F, 0F);

        gunModel[15].addShapeBox(-1F, -11F, -7F, 2, 5, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[15].setRotationPoint(-35F, 15F, 0F);

        gunModel[16].addShapeBox(-1F, -11F, -7F, 3, 2, 15, 0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[16].setRotationPoint(-8F, -7F, 0F);

        gunModel[17].addShapeBox(-1F, -11F, -7F, 3, 2, 15, 0F, 3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F); //
        gunModel[17].setRotationPoint(-8.5F, -9F, 0F);

        gunModel[18].addShapeBox(-1F, -11F, -7F, 13, 2, 15, 0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[18].setRotationPoint(-5F, -7F, 0F);

        gunModel[19].addShapeBox(-1F, -11F, -7F, 13, 2, 15, 0F, 3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[19].setRotationPoint(-5.5F, -9F, 0F);

        gunModel[20].addShapeBox(-1F, -11F, -7F, 4, 2, 15, 0F, 0.0F, 3.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 3.5F, -1.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F); //
        gunModel[20].setRotationPoint(-37F, 13F, 0F);

        gunModel[21].addShapeBox(-1F, -11F, -7F, 2, 2, 15, 0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[21].setRotationPoint(-39F, 7.5F, 0F);

        gunModel[22].addShapeBox(-1F, -11F, -7F, 3, 2, 15, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[22].setRotationPoint(-42F, 4.5F, 0F);

        gunModel[23].addShapeBox(-1F, -11F, -7F, 2, 10, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F); //
        gunModel[23].setRotationPoint(-42F, -6F, 0F);

        gunModel[24].addShapeBox(-1F, -11F, -7F, 2, 3, 15, 0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[24].setRotationPoint(-41.5F, -9F, 0F);

        gunModel[25].addShapeBox(-1F, -11F, -7F, 3, 1, 15, 0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F); //
        gunModel[25].setRotationPoint(-41.75F, 6.5F, 0F);

        gunModel[26].addShapeBox(-1F, -11F, -7F, 2, 2, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); //
        gunModel[26].setRotationPoint(-41F, 7.5F, 0F);

        gunModel[27].addShapeBox(-1F, -11F, -7F, 4, 1, 15, 0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[27].setRotationPoint(-37F, 15F, 0F);

        gunModel[28].addShapeBox(-1F, -11F, -7F, 2, 3, 15, 0F, 0.0F, 3.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[28].setRotationPoint(-39F, 13F, 0F);

        gunModel[29].addShapeBox(-1F, -11F, -7F, 2, 5, 15, 0F, 0.0F, 3.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[29].setRotationPoint(-41F, 11F, 0F);

        gunModel[30].addShapeBox(-1F, -11F, -7F, 12, 7, 15, 0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[30].setRotationPoint(-53F, 9F, 0F);

        gunModel[31].addShapeBox(-1F, -11F, -7F, 5, 2, 13, 0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); //
        gunModel[31].setRotationPoint(-22F, 25F, 1F);

        gunModel[32].addShapeBox(-1F, -11F, -7F, 1, 3, 15, 0F, 0.0F, 0.0F, 0.0F, 2.1F, 0.0F, 0.0F, 2.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[32].setRotationPoint(-15F, 22F, 0F);

        gunModel[33].addShapeBox(-1F, -11F, -7F, 5, 2, 13, 0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, -3.5F, 0.0F, -3.0F, -3.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F); //
        gunModel[33].setRotationPoint(-14F, 25F, 1F);

        gunModel[34].addShapeBox(-1F, -11F, -7F, 5, 11, 13, 0F, -10.0F, 0.0F, 0.0F, 7.0F, 0.0F, -3.0F, 7.0F, 0.0F, -3.0F, -10.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, -3.0F, -2.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[34].setRotationPoint(-12F, 14F, 1F);

        gunModel[35].addShapeBox(-1F, -11F, -7F, 6, 8, 15, 0F, -10.0F, 0.0F, 0.0F, 7.0F, 0.0F, -1.0F, 7.0F, 0.0F, -1.0F, -10.0F, 0.0F, 0.0F, -3.1F, 0.0F, 0.0F, 0.1F, 0.0F, -1.0F, 0.1F, 0.0F, -1.0F, -3.1F, 0.0F, 0.0F); //
        gunModel[35].setRotationPoint(-15F, 14F, 0F);

        gunModel[36].addShapeBox(-1F, -11F, -7F, 6, 2, 13, 0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, -3.5F, 0.0F, -3.0F, -3.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F); //
        gunModel[36].setRotationPoint(-17F, 25F, 1F);

        gunModel[37].addShapeBox(-1F, -11F, -7F, 12, 1, 15, 0F, 0.0F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F); //
        gunModel[37].setRotationPoint(-53F, 8F, 0F);

        gunModel[38].addShapeBox(-1F, -11F, -7F, 12, 2, 15, 0F, 0.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F); //
        gunModel[38].setRotationPoint(-53F, 6F, 0F);

        gunModel[39].addShapeBox(-1F, -11F, -7F, 11, 11, 15, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F); //
        gunModel[39].setRotationPoint(-53F, -5F, 0F);

        gunModel[40].addShapeBox(-1F, -11F, -7F, 12, 3, 15, 0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1F, -1.0F, 0.0F, -1F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[40].setRotationPoint(-53F, -8F, 0F);

        gunModel[41].addShapeBox(-1F, -11F, -7F, 9, 8, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.9F, 0.0F, 0.0F, -6.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[41].setRotationPoint(-14F, 14F, 0F);

        gunModel[42].addShapeBox(-1F, -11F, -7F, 16, 23, 15, 0F, -6.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -6.0F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F); //
        gunModel[42].setRotationPoint(-69F, -7F, 0F);

        gunModel[43].addShapeBox(-1F, -11F, -7F, 12, 2, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[43].setRotationPoint(-26F, 20F, 0F);

        gunModel[44].addShapeBox(-1F, -11F, -7F, 4, 3, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); //
        gunModel[44].setRotationPoint(-26F, 22F, 0F);

        gunModel[45].addShapeBox(-1F, -11F, -7F, 4, 2, 15, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F); //
        gunModel[45].setRotationPoint(-26F, 25F, 0F);

        gunModel[46].addShapeBox(-1F, -11F, -7F, 10, 24, 15, 0F, -6.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -6.0F, 2.0F, 2.0F, 1.0F, -1.0F, 2.0F, -6.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, 1.0F, -1.0F, 2.0F); //
        gunModel[46].setRotationPoint(-73F, -7F, 0F);

        gunModel[47].addShapeBox(-1F, -11F, -7F, 7, 3, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[47].setRotationPoint(-22F, 22F, 0F);

        gunModel[48].addShapeBox(-1F, -11F, -7F, 1, 3, 15, 0F, -0.1F, 0.0F, 0.0F, 2.1F, 0.0F, -1.0F, 2.1F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, 2.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 2.5F, 0.0F, -1.0F); //
        gunModel[48].setRotationPoint(-12F, 22F, 0F);

        gunModel[49].addShapeBox(-1F, -11F, -7F, 2, 2, 15, 0F, -0.65F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.65F, 0.0F, -0.25F, -2.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, -2.0F, 0.0F, -2.25F); //
        gunModel[49].setRotationPoint(-28F, 25F, 0F);

        gunModel[50].addShapeBox(-1F, -11F, -7F, 3, 1, 15, 0F, -1.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -1.0F, 0.0F, -0.15F, -1.65F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.65F, 0.0F, -0.25F); //
        gunModel[50].setRotationPoint(-29F, 24F, 0F);

        gunModel[51].addShapeBox(-1F, -11F, -7F, 6, 2, 15, 0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -4.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -4.0F, 0.0F, -0.15F); //
        gunModel[51].setRotationPoint(-32F, 22F, 0F);

        gunModel[52].addShapeBox(-1F, -11F, -7F, 9, 2, 15, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F); //
        gunModel[52].setRotationPoint(-35F, 20F, 0F);

        gunModel[53].addShapeBox(-1F, -11F, -7F, 13, 6, 15, 0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[53].setRotationPoint(-2F, 1F, 0F);

        gunModel[54].addShapeBox(-1F, -11F, -7F, 44, 24, 19, 0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, -7.0F, -1.0F, 0.0F, -7.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[54].setRotationPoint(-111F, -7F, -2F);

        gunModel[55].addShapeBox(-1F, -11F, -7F, 13, 24, 19, 0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[55].setRotationPoint(-124F, -7F, -2F);

        gunModel[56].addShapeBox(-1F, -11F, -7F, 3, 26, 19, 0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.5F, -1.0F, 0.0F); //
        gunModel[56].setRotationPoint(-127F, -7F, -2F);

        gunModel[57].addShapeBox(-1F, -11F, -7F, 11, 1, 15, 0F, -5.75F, 2.0F, 2.0F, -0.75F, 2.0F, 0.0F, -0.75F, 2.0F, 0.0F, -5.75F, 2.0F, 2.0F, -5.5F, -1.0F, 1.0F, -1.5F, -1.0F, -1.0F, -1.5F, -1.0F, -1.0F, -5.5F, -1.0F, 1.0F); //
        gunModel[57].setRotationPoint(-80F, 20F, 0F);

        gunModel[58].addShapeBox(-1F, -11F, -7F, 10, 1, 15, 0F, -5.0F, 2.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -5.0F, 2.0F, 2.0F, -4.75F, -1.0F, 2.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -4.75F, -1.0F, 2.0F); //
        gunModel[58].setRotationPoint(-79F, 18F, 0F);

        gunModel[59].addShapeBox(-1F, -11F, -7F, 10, 1, 15, 0F, -5.5F, 2.0F, 1.0F, -0.5F, 2.0F, -1.0F, -0.5F, 2.0F, -1.0F, -5.5F, 2.0F, 1.0F, -5.0F, -1.0F, -1.0F, -1.5F, -1.0F, -3.0F, -1.5F, -1.0F, -3.0F, -5.0F, -1.0F, -1.0F); //
        gunModel[59].setRotationPoint(-80F, 22F, 0F);

        gunModel[60].addShapeBox(-1F, -11F, -7F, 55, 1, 19, 0F, -5.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -5.0F, 2.0F, 0.0F, -5.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F); //
        gunModel[60].setRotationPoint(-129F, 18F, -2F);

        gunModel[61].addShapeBox(-1F, -11F, -7F, 53, 1, 19, 0F, -5.0F, -4.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -5.0F, -4.0F, 0.0F, -5.0F, 5.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -5.0F, 5.0F, -1.0F); //
        gunModel[61].setRotationPoint(-127F, 20F, -2F);

        gunModel[62].addShapeBox(-1F, -11F, -7F, 53, 1, 17, 0F, -6.0F, -4.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, -6.0F, -4.0F, 0.0F, -6.0F, 5.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, -6.0F, 5.0F, -2.0F); //
        gunModel[62].setRotationPoint(-128F, 22F, -1F);

        gunModel[63].addShapeBox(-1F, -11F, -7F, 47, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, -0.1F, -0.9F, 0.0F, -0.1F, -0.9F, 0.0F, 0.0F, 5.0F, 0.0F); //
        gunModel[63].setRotationPoint(-122F, 18F, -2F);

        gunModel[64].addShapeBox(-1F, -11F, -7F, 164, 2, 23, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.0F, -3.5F, 0.0F, -2.0F, -3.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[64].setRotationPoint(-127F, -11F, -4F);

        gunModel[65].addShapeBox(-1F, -11F, -7F, 174, 2, 23, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -6.0F, 0.0F, -0.75F, -6.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); //
        gunModel[65].setRotationPoint(-127F, -13F, -4F);

        gunModel[66].addShapeBox(-1F, -11F, -7F, 73, 9, 23, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[66].setRotationPoint(-128F, -22F, -4F);

        gunModel[67].addShapeBox(-1F, -11F, -7F, 4, 9, 23, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[67].setRotationPoint(-55F, -22F, -4F);

        gunModel[68].addShapeBox(-1F, -11F, -7F, 107, 3, 22, 0F, 3.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 3.5F, 0.0F, -1.5F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F); //
        gunModel[68].setRotationPoint(-123F, -29F, -3.5F);

        gunModel[69].addShapeBox(-1F, -11F, -7F, 107, 2, 18, 0F, 2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 2.0F, 0.0F, -2.5F, 3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F); //
        gunModel[69].setRotationPoint(-123F, -33F, -1.5F);

        gunModel[70].addShapeBox(-1F, -11F, -7F, 106, 2, 18, 0F, 1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 1.0F, 0.0F, -5.0F, 2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 2.0F, 0.0F, -2.5F); //
        gunModel[70].setRotationPoint(-123F, -35F, -1.5F);

        gunModel[71].addShapeBox(-1F, -11F, -7F, 105, 1, 16, 0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 1.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 1.0F, 0.0F, -4.0F); //
        gunModel[71].setRotationPoint(-123F, -36F, -0.5F);

        gunModel[72].addShapeBox(-1F, -11F, -7F, 45, 9, 23, 0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[72].setRotationPoint(-51F, -22F, -4F);

        gunModel[73].addShapeBox(-1F, -11F, -7F, 51, 9, 23, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[73].setRotationPoint(-5F, -22F, -4F);

        gunModel[74].addShapeBox(-1F, -11F, -7F, 9, 1, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[74].setRotationPoint(-14F, 13F, 0F);

        gunModel[75].addShapeBox(-1F, -11F, -7F, 2, 4, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[75].setRotationPoint(-7F, 6F, 0F);

        gunModel[76].addShapeBox(-1F, -11F, -7F, 3, 4, 15, 0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[76].setRotationPoint(-2F, 9F, 0F);

        gunModel[77].addShapeBox(-1F, -11F, -7F, 3, 2, 15, 0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[77].setRotationPoint(-0.5F, 7F, 0F);

        gunModel[78].addShapeBox(-1F, -11F, -7F, 2, 4, 13, 0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -3.0F, 1.5F, 0.0F, -3.0F, -1.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, -3.0F, 0.0F, 1.5F, -3.0F, 0.0F, 1.0F, 0.0F); //
        gunModel[78].setRotationPoint(1F, 9F, 1F);

        gunModel[79].addShapeBox(-1F, -11F, -7F, 2, 2, 13, 0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -3.0F, 1.5F, 0.0F, -3.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[79].setRotationPoint(2.5F, 7F, 1F);

        gunModel[80].addShapeBox(-1F, -11F, -7F, 3, 4, 15, 0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[80].setRotationPoint(-5F, 9F, 0F);

        gunModel[81].addShapeBox(-1F, -11F, -7F, 5, 2, 15, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[81].setRotationPoint(-5F, 7F, 0F);

        gunModel[82].addShapeBox(-1F, -11F, -7F, 3, 1, 15, 0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[82].setRotationPoint(-5F, 13F, 0F);

        gunModel[83].addShapeBox(-1F, -11F, -7F, 2, 1, 13, 0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, 2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[83].setRotationPoint(-2F, 13F, 1F);

        gunModel[84].addShapeBox(-1F, -11F, -7F, 1, 1, 15, 0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[84].setRotationPoint(-5F, 13F, 0F);

        gunModel[85].addShapeBox(-1F, -11F, -7F, 12, 13, 8, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[85].setRotationPoint(6.5F, -9F, 3.5F);

        gunModel[86].addShapeBox(-1F, -11F, -7F, 3, 4, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, -1.5F, 0.0F, -2.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F); //
        gunModel[86].setRotationPoint(8.5F, 1F, 0F);

        gunModel[87].addShapeBox(-1F, -11F, -7F, 3, 4, 15, 0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F); //
        gunModel[87].setRotationPoint(8.5F, 3F, 0F);

        gunModel[88].addShapeBox(-1F, -11F, -7F, 15, 4, 12, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[88].setRotationPoint(11.5F, 4F, 1.5F);

        gunModel[89].addShapeBox(-1F, -11F, -7F, 7, 4, 15, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 1.5F, 1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -1.5F); //
        gunModel[89].setRotationPoint(26.5F, 4F, 0F);

        gunModel[90].addShapeBox(-1F, -11F, -7F, 6, 5, 17, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[90].setRotationPoint(33.5F, 3F, -1F);

        gunModel[91].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[91].setRotationPoint(47.5F, 9F, -2F);

        gunModel[92].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[92].setRotationPoint(55.5F, 8F, -2F);

        gunModel[93].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[93].setRotationPoint(63.5F, 6.5F, -2F);

        gunModel[94].addShapeBox(-1F, -11F, -7F, 8, 6, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[94].setRotationPoint(47.5F, 3F, -2F);

        gunModel[95].addShapeBox(-1F, -11F, -7F, 8, 6, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[95].setRotationPoint(55.5F, 2F, -2F);

        gunModel[96].addShapeBox(-1F, -11F, -7F, 8, 6, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[96].setRotationPoint(63.5F, 0.5F, -2F);

        gunModel[97].addShapeBox(-1F, -11F, -7F, 8, 2, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[97].setRotationPoint(47.5F, 1F, -2F);

        gunModel[98].addShapeBox(-1F, -11F, -7F, 8, 3, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[98].setRotationPoint(55.5F, -1F, -2F);

        gunModel[99].addShapeBox(-1F, -11F, -7F, 8, 5, 19, 0F, 0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[99].setRotationPoint(63.5F, -4F, -2F);

        gunModel[100].addShapeBox(-1F, -11F, -7F, 8, 5, 19, 0F, -0.1F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F); //
        gunModel[100].setRotationPoint(39.5F, 3F, -2F);

        gunModel[101].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.5F, -2.0F); //
        gunModel[101].setRotationPoint(39.5F, 10F, -2F);

        gunModel[102].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.5F); //
        gunModel[102].setRotationPoint(31.5F, 9.5F, -2F);

        gunModel[103].addShapeBox(-1F, -11F, -7F, 6, 1, 17, 0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -4.0F, 0.0F, -0.5F, -6.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -6.0F); //
        gunModel[103].setRotationPoint(25.5F, 9.5F, -1F);

        gunModel[104].addShapeBox(-1F, -11F, -7F, 4, 1, 11, 0F, 0.0F, 1.5F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.5F, -4.0F, 0.0F, -1.5F, -5.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.5F, -5.0F); //
        gunModel[104].setRotationPoint(21.5F, 9F, 2F);

        gunModel[105].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F); //
        gunModel[105].setRotationPoint(39.5F, 8F, -2F);

        gunModel[106].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F); //
        gunModel[106].setRotationPoint(31.5F, 8F, -2F);

        gunModel[107].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, -0.65F, -1.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F); //
        gunModel[107].setRotationPoint(31.5F, 7F, -2F);

        gunModel[108].addShapeBox(-1F, -11F, -7F, 6, 1, 17, 0F, 0.0F, -0.65F, -3.0F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F); //
        gunModel[108].setRotationPoint(25.5F, 7F, -1F);

        gunModel[109].addShapeBox(-1F, -11F, -7F, 6, 1, 17, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -4.0F); //
        gunModel[109].setRotationPoint(25.5F, 8F, -1F);

        gunModel[110].addShapeBox(-1F, -11F, -7F, 4, 1, 11, 0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F); //
        gunModel[110].setRotationPoint(21.5F, 7F, 2F);

        gunModel[111].addShapeBox(-1F, -11F, -7F, 4, 1, 11, 0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -3.0F, 0.0F, -1.5F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F, -4.0F); //
        gunModel[111].setRotationPoint(21.5F, 8F, 2F);

        gunModel[112].addShapeBox(-1F, -11F, -7F, 1, 1, 19, 0F, -0.9F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.9F, -0.65F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F); //
        gunModel[112].setRotationPoint(38.6F, 7F, -2F);

        gunModel[113].addShapeBox(-1F, -11F, -7F, 8, 2, 19, 0F, 0.0F, -0.5F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F); //
        gunModel[113].setRotationPoint(47.5F, -2.5F, -2F);

        gunModel[114].addShapeBox(-1F, -11F, -7F, 8, 2, 19, 0F, 0.0F, -0.5F, -3.0F, 0.0F, 1.5F, -3.0F, 0.0F, 1.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F); //
        gunModel[114].setRotationPoint(39.5F, -0.5F, -2F);

        gunModel[115].addShapeBox(-1F, -11F, -7F, 8, 2, 19, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 2.5F, -3.0F, 0.0F, 2.5F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F); //
        gunModel[115].setRotationPoint(55.5F, -4.5F, -2F);

        gunModel[116].addShapeBox(-1F, -11F, -7F, 8, 2, 19, 0F, 0.0F, -0.5F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F); //
        gunModel[116].setRotationPoint(63.5F, -7.5F, -2F);

        gunModel[117].addShapeBox(-1F, -11F, -7F, 8, 2, 19, 0F, 0.0F, -1.0F, -3.0F, 0.0F, 1.5F, -3.0F, 0.0F, 1.5F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F); //
        gunModel[117].setRotationPoint(71.5F, -10.5F, -2F);

        gunModel[118].addShapeBox(-1F, -11F, -7F, 12, 2, 19, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[118].setRotationPoint(79.5F, -12F, -2F);

        gunModel[119].addShapeBox(-1F, -11F, -7F, 8, 8, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 3.5F, 0.0F); //
        gunModel[119].setRotationPoint(71.5F, -7F, -2F);

        gunModel[120].addShapeBox(-1F, -11F, -7F, 8, 1, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[120].setRotationPoint(71.5F, 4.5F, -2F);

        gunModel[121].addShapeBox(-1F, -11F, -7F, 11, 2, 19, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[121].setRotationPoint(79.5F, -10F, -2F);

        gunModel[122].addShapeBox(-1F, -11F, -7F, 9, 3, 19, 0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[122].setRotationPoint(79.5F, -8F, -2F);

        gunModel[123].addShapeBox(-1F, -11F, -7F, 7, 5, 19, 0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[123].setRotationPoint(79.5F, -5F, -2F);

        gunModel[124].addShapeBox(-1F, -11F, -7F, 5, 2, 19, 0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[124].setRotationPoint(79.5F, 0F, -2F);

        gunModel[125].addShapeBox(-1F, -11F, -7F, 5, 2, 19, 0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, -5.0F, -0.5F, -2.0F, -5.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F); //
        gunModel[125].setRotationPoint(79.5F, 1F, -2F);

        gunModel[126].addShapeBox(-1F, -11F, -7F, 3, 1, 19, 0F, -3.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, -3.0F, 0.5F, -3.0F, 1.0F, 0.68F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.68F, -0.65F); //
        gunModel[126].setRotationPoint(36.5F, 0.5F, -2F);

        gunModel[127].addShapeBox(-1F, -11F, -7F, 8, 2, 13, 0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F); //
        gunModel[127].setRotationPoint(39.5F, -3.5F, 1F);

        gunModel[128].addShapeBox(-1F, -11F, -7F, 7, 2, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F); //
        gunModel[128].setRotationPoint(40.5F, -5.5F, 1F);

        gunModel[129].addShapeBox(-1F, -11F, -7F, 8, 2, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F); //
        gunModel[129].setRotationPoint(39.5F, -7.5F, 1F);

        gunModel[130].addShapeBox(-1F, -11F, -7F, 8, 2, 13, 0F, 2.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[130].setRotationPoint(39.5F, -9.5F, 1F);

        gunModel[131].addShapeBox(-1F, -11F, -7F, 32, 7, 13, 0F, 0.0F, 1.5F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 2.0F, 0.0F); //
        gunModel[131].setRotationPoint(47.5F, -10.5F, 1F);

        gunModel[132].addShapeBox(-1F, -11F, -7F, 10, 3, 13, 0F, 0.5F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[132].setRotationPoint(37.5F, -12.5F, 1F);

        gunModel[133].addShapeBox(-1F, -11F, -7F, 42, 3, 23, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[133].setRotationPoint(37.5F, -13.5F, -4F);

        gunModel[134].addShapeBox(-1F, -11F, -7F, 42, 3, 23, 0F, 0.0F, -2.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -7.5F, -1.5F, 0.0F, -7.5F, -1.5F, 0.0F, -0.5F, -1.5F); //
        gunModel[134].setRotationPoint(37.5F, -12.5F, -4F);

        gunModel[135].addShapeBox(-1F, -11F, -7F, 14, 1, 23, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[135].setRotationPoint(79.5F, -18.5F, -4F);

        gunModel[136].addShapeBox(-1F, -11F, -7F, 4, 3, 23, 0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, -1.0F); //
        gunModel[136].setRotationPoint(33.5F, -11.5F, -4F);

        gunModel[137].addShapeBox(-1F, -11F, -7F, 4, 3, 23, 0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.5F, -1.5F, 0.0F, -2.5F, -1.5F, 0.0F, -2.5F, -1.5F, 0.0F, -1.5F, -1.5F); //
        gunModel[137].setRotationPoint(33.5F, -10.5F, -4F);

        gunModel[138].addShapeBox(-1F, -11F, -7F, 42, 3, 16, 0F, 0.0F, -2.0F, 2.0F, 0.0F, 5.0F, 2.0F, 0.0F, 5.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, -7.0F, -1.5F, 0.0F, -7.0F, -1.5F, 0.0F, 0.0F, -1.5F); //
        gunModel[138].setRotationPoint(37.5F, -12F, -0.5F);

        gunModel[139].addShapeBox(-1F, -11F, -7F, 4, 3, 23, 0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -1.5F, -5.0F, 0.0F, -2.5F, -5.0F, 0.0F, -2.5F, -5.0F, 0.0F, -1.5F, -5.0F); //
        gunModel[139].setRotationPoint(33.5F, -9.5F, -4F);

        gunModel[140].addShapeBox(-1F, -11F, -7F, 4, 4, 23, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, -1.0F); //
        gunModel[140].setRotationPoint(33.5F, -13F, -4F);

        gunModel[141].addShapeBox(-1F, -11F, -7F, 8, 4, 23, 0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.5F, -3.9F, 0.0F, 0.5F, -3.9F, 0.0F, 0.0F, -2.5F, 0.0F); //
        gunModel[141].setRotationPoint(37.5F, -13F, -4F);

        gunModel[142].addShapeBox(-1F, -11F, -7F, 12, 4, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[142].setRotationPoint(79.5F, -16F, 1F);

        gunModel[143].addShapeBox(-1F, -11F, -7F, 14, 1, 23, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F); //
        gunModel[143].setRotationPoint(79.5F, -17.5F, -4F);

        gunModel[144].addShapeBox(-1F, -11F, -7F, 14, 1, 23, 0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F); //
        gunModel[144].setRotationPoint(79.5F, -16.5F, -4F);

        gunModel[145].addShapeBox(-1F, -11F, -7F, 122, 4, 23, 0F, 0.0F, 0.0F, -0.5F, -2.75F, 0.0F, -0.5F, -2.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[145].setRotationPoint(-128F, -26F, -4F);

        gunModel[146].addShapeBox(-1F, -11F, -7F, 3, 2, 18, 0F, 0.0F, 0.0F, -2.5F, -1.75F, 0.0F, -2.5F, -1.75F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[146].setRotationPoint(-16F, -33F, -1.5F);

        gunModel[147].addShapeBox(-1F, -11F, -7F, 2, 2, 19, 0F, 0.0F, 0.0F, -5.5F, -1.5F, 0.0F, -5.5F, -1.5F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F); //
        gunModel[147].setRotationPoint(-17F, -35F, -2F);

        gunModel[148].addShapeBox(-1F, -11F, -7F, 1, 1, 17, 0F, 0.0F, 0.0F, -7.5F, -0.25F, 0.0F, -7.5F, -0.25F, 0.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, -4.5F, 0.5F, 0.0F, -4.5F, 0.5F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F); //
        gunModel[148].setRotationPoint(-18F, -36F, -1F);

        gunModel[149].addShapeBox(-1F, -11F, -7F, 21, 14, 1, 0F, 0.0F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[149].setRotationPoint(-36F, -47F, 13F);

        gunModel[150].addShapeBox(-1F, -11F, -7F, 21, 14, 1, 0F, 0.0F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[150].setRotationPoint(-36F, -47F, 1F);

        gunModel[151].addShapeBox(-1F, -11F, -7F, 100, 4, 7, 0F, 3.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F); //
        gunModel[151].setRotationPoint(-5F, -26F, -4F);

        gunModel[152].addShapeBox(-1F, -11F, -7F, 34, 9, 23, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -5.5F, 0.0F, -0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[152].setRotationPoint(46F, -22F, -4F);

        gunModel[153].addShapeBox(-1F, -11F, -7F, 48, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.35F, 0.0F, 0.75F, -0.35F, 0.0F, 0.75F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F); //
        gunModel[153].setRotationPoint(-63F, -33F, 14F);

        gunModel[154].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.75F); //
        gunModel[154].setRotationPoint(-69F, -33F, 14F);

        gunModel[155].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.5F); //
        gunModel[155].setRotationPoint(-70F, -32.35F, 14.5F);

        gunModel[156].addShapeBox(-1F, -11F, -7F, 71, 4, 1, 0F, 3.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.65F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[156].setRotationPoint(-14F, -37F, 13F);

        gunModel[157].addShapeBox(-1F, -11F, -7F, 71, 4, 1, 0F, 3.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.65F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[157].setRotationPoint(-14F, -37F, 1F);

        gunModel[158].addShapeBox(-1F, -11F, -7F, 16, 4, 13, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[158].setRotationPoint(57F, -37F, 1F);

        gunModel[159].addShapeBox(-1F, -11F, -7F, 75, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[159].setRotationPoint(-18F, -37F, 4F);

        gunModel[160].addShapeBox(-1F, -11F, -7F, 71, 3, 3, 0F, 2.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.85F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F); //
        gunModel[160].setRotationPoint(-14F, -36F, 2F);

        gunModel[161].addShapeBox(-1F, -11F, -7F, 71, 3, 3, 0F, 2.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.85F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F); //
        gunModel[161].setRotationPoint(-14F, -36F, 10.5F);

        gunModel[162].addShapeBox(-1F, -11F, -7F, 90, 2, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[162].setRotationPoint(-11F, -39F, 4F);

        gunModel[163].addShapeBox(-1F, -11F, -7F, 70, 3, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[163].setRotationPoint(-10F, -42F, 5F);

        gunModel[164].addShapeBox(-1F, -11F, -7F, 4, 1, 8, 0F, -2F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, -2F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[164].setRotationPoint(-13F, -44.25F, 3.5F);

        gunModel[165].addShapeBox(-1F, -11F, -7F, 100, 1, 8, 0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F); //
        gunModel[165].setRotationPoint(-13F, -43.5F, 3.5F);

        gunModel[166].addShapeBox(-1F, -11F, -7F, 5, 2, 12, 0F, 0.5F, 0.0F, 0.5F, 4.0F, 0.0F, 0.5F, 4.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.3F, 0.0F, 2.0F, 4.0F, 0.0F, 2.0F, 4.0F, 0.0F, 2.0F, -1.3F, 0.0F, 2.0F); //
        gunModel[166].setRotationPoint(-14F, -33F, 1.5F);

        gunModel[167].addShapeBox(-1F, -11F, -7F, 82, 7, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[167].setRotationPoint(-9F, -33F, 2F);

        gunModel[168].addShapeBox(-1F, -11F, -7F, 7, 15, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[168].setRotationPoint(73F, -37F, 13F);

        gunModel[169].addShapeBox(-1F, -11F, -7F, 5, 15, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F); //
        gunModel[169].setRotationPoint(80F, -37F, 13F);

        gunModel[170].addShapeBox(-1F, -11F, -7F, 6, 4, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -2.5F, 0.0F, -3.5F, 2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F); //
        gunModel[170].setRotationPoint(89F, -33F, 14.5F);

        gunModel[171].addShapeBox(-1F, -11F, -7F, 6, 8, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 0.0F); //
        gunModel[171].setRotationPoint(89F, -29F, 14.5F);

        gunModel[172].addShapeBox(-1F, -11F, -7F, 4, 13, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F); //
        gunModel[172].setRotationPoint(85F, -35F, 14F);

        gunModel[173].addShapeBox(-1F, -11F, -7F, 3, 14, 1, 0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[173].setRotationPoint(-39F, -47F, 1F);

        gunModel[174].addShapeBox(-1F, -11F, -7F, 3, 14, 1, 0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[174].setRotationPoint(-39F, -47F, 13F);

        gunModel[175].addShapeBox(-1F, -11F, -7F, 2, 9, 13, 0F, 0.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[175].setRotationPoint(-41F, -42F, 1F);

        gunModel[176].addShapeBox(-1F, -11F, -7F, 11, 3, 23, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 2.5F, 0.5F, 0.0F, 2.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F); //
        gunModel[176].setRotationPoint(80F, -22F, -4F);

        gunModel[177].addShapeBox(-1F, -11F, -7F, 1, 3, 2, 0F, 2.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 2.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[177].setRotationPoint(93.5F, -21.75F, 17F);

        gunModel[178].addShapeBox(-1F, -11F, -7F, 78, 7, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[178].setRotationPoint(-5F, -33F, 13F);

        gunModel[179].addShapeBox(-1F, -11F, -7F, 107, 2, 19, 0F, 3.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 3.0F, 0.0F, -1.5F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F); //
        gunModel[179].setRotationPoint(-123F, -31F, -2F);

        gunModel[180].addShapeBox(-1F, -11F, -7F, 3, 3, 22, 0F, 0.0F, 0.0F, -1.5F, 1.7F, 0.0F, -1.5F, 1.7F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[180].setRotationPoint(-16F, -29F, -3.5F);

        gunModel[181].addShapeBox(-1F, -11F, -7F, 4, 2, 19, 0F, 3.7F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 3.7F, 0.0F, -1.5F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F); //
        gunModel[181].setRotationPoint(-9F, -31F, -2F);

        gunModel[182].addShapeBox(-1F, -11F, -7F, 2, 3, 22, 0F, 4.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 4.0F, 0.0F, -1.5F, 1.45F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.45F, 0.0F, 0.0F); //
        gunModel[182].setRotationPoint(-7F, -29F, -3.5F);

        gunModel[183].addShapeBox(-1F, -11F, -7F, 1, 2, 19, 0F, 0.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 3.7F, 0.0F, 0.0F, 3.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[183].setRotationPoint(-16F, -31F, -2F);

        gunModel[184].addShapeBox(-1F, -11F, -7F, 18, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F); //
        gunModel[184].setRotationPoint(71F, -33F, 13.5F);

        gunModel[185].addShapeBox(-1F, -11F, -7F, 17, 2, 5, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.25F, 3.5F, 0.0F, -2.75F, 3.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F); //
        gunModel[185].setRotationPoint(71F, -31F, 13F);

        gunModel[186].addShapeBox(-1F, -11F, -7F, 20, 3, 8, 0F, 0.0F, 0.0F, -4.5F, 0.5F, 0.0F, -4.25F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.25F, 2.5F, 0.0F, -5.5F, 2.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[186].setRotationPoint(71F, -29F, 11.5F);

        gunModel[187].addShapeBox(-1F, -11F, -7F, 17, 9, 11, 0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.25F, 0.0F, 0.0F, 7.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[187].setRotationPoint(-39F, -42F, 2F);

        gunModel[188].addShapeBox(-1F, -11F, -7F, 9, 2, 11, 0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[188].setRotationPoint(-39F, -44F, 2F);

        gunModel[189].addShapeBox(-1F, -11F, -7F, 72, 1, 8, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.75F, 0.0F, -0.5F, -3.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[189].setRotationPoint(-1F, -27F, 11F);

        gunModel[190].addShapeBox(-1F, -11F, -7F, 3, 1, 8, 0F, -0.5F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.75F, -0.5F, 2.0F, -2.0F, 0.0F, -2.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -2.0F); //
        gunModel[190].setRotationPoint(-4F, -27F, 11F);

        gunModel[191].addShapeBox(-1F, -11F, -7F, 7, 2, 3, 0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 2.0F); //
        gunModel[191].setRotationPoint(-4F, -33F, 1.5F);

        gunModel[192].addShapeBox(-1F, -11F, -7F, 4, 2, 10, 0F, 4.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 4.0F, 0.0F, -1.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F); //
        gunModel[192].setRotationPoint(-1F, -31F, -2F);

        gunModel[193].addShapeBox(-1F, -11F, -7F, 4, 3, 13, 0F, 3.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 3.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[193].setRotationPoint(-1F, -29F, -3.5F);

        gunModel[194].addShapeBox(-1F, -11F, -7F, 64, 1, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); //
        gunModel[194].setRotationPoint(3F, -33F, 1.5F);

        gunModel[195].addShapeBox(-1F, -11F, -7F, 64, 2, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[195].setRotationPoint(3F, -28F, -3.5F);

        gunModel[196].addShapeBox(-1F, -11F, -7F, 64, 2, 4, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[196].setRotationPoint(3F, -31F, 0F);

        gunModel[197].addShapeBox(-1F, -11F, -7F, 64, 1, 2, 0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[197].setRotationPoint(3F, -32F, 1F);

        gunModel[198].addShapeBox(-1F, -11F, -7F, 64, 1, 2, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[198].setRotationPoint(3F, -29F, 1F);

        gunModel[199].addShapeBox(-1F, -11F, -7F, 16, 3, 3, 0F, 0.0F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.4F, 0.0F, 0.0F, -8.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[199].setRotationPoint(-31F, -47F, 10F);

        gunModel[200].addShapeBox(-1F, -11F, -7F, 16, 3, 3, 0F, 0.0F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, -10.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.4F, 0.0F, 0.0F, -8.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[200].setRotationPoint(-31F, -47F, 2F);

        gunModel[201].addShapeBox(-1F, -11F, -7F, 3, 3, 3, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); //
        gunModel[201].setRotationPoint(-38F, -47F, 2F);

        gunModel[202].addShapeBox(-1F, -11F, -7F, 3, 3, 3, 0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); //
        gunModel[202].setRotationPoint(-38F, -47F, 10F);

        gunModel[203].addShapeBox(-1F, -11F, -7F, 3, 1, 2, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[203].setRotationPoint(-34.5F, -45F, 3F);

        gunModel[204].addShapeBox(-1F, -11F, -7F, 3, 2, 1, 0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[204].setRotationPoint(-34.5F, -46F, 2F);

        gunModel[205].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[205].setRotationPoint(-35.5F, -46F, 2F);

        gunModel[206].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[206].setRotationPoint(-31.5F, -46F, 2F);

        gunModel[207].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 2.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[207].setRotationPoint(-35.5F, -45F, 3F);

        gunModel[208].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.5F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 2.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[208].setRotationPoint(-31.5F, -45F, 3F);

        gunModel[209].addShapeBox(-1F, -11F, -7F, 3, 1, 2, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[209].setRotationPoint(-34.5F, -45F, 10F);

        gunModel[210].addShapeBox(-1F, -11F, -7F, 3, 2, 1, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[210].setRotationPoint(-34.5F, -46F, 12F);

        gunModel[211].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, -0.5F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[211].setRotationPoint(-35.5F, -46F, 12F);

        gunModel[212].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, -0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[212].setRotationPoint(-31.5F, -46F, 12F);

        gunModel[213].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, -0.5F, 2.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[213].setRotationPoint(-35.5F, -45F, 10F);

        gunModel[214].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, -1.0F, 0.0F, -0.5F, 2.0F, -2.0F, -0.5F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[214].setRotationPoint(-31.5F, -45F, 10F);

        gunModel[215].addShapeBox(-1F, -11F, -7F, 5, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[215].setRotationPoint(-30F, -44F, 2F);

        gunModel[216].addShapeBox(-1F, -11F, -7F, 5, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[216].setRotationPoint(-30F, -44F, 10F);

        gunModel[217].addShapeBox(-1F, -11F, -7F, 5, 1, 5, 0F, 0.0F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[217].setRotationPoint(-30F, -43F, 5F);

        gunModel[218].addShapeBox(-1F, -11F, -7F, 4, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[218].setRotationPoint(-15F, -38F, 4F);

        gunModel[219].addShapeBox(-1F, -11F, -7F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[219].setRotationPoint(-18F, -37F, 11F);

        gunModel[220].addShapeBox(-1F, -11F, -7F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[220].setRotationPoint(-18F, -37F, 2F);

        gunModel[221].addShapeBox(-1F, -11F, -7F, 2, 1, 5, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[221].setRotationPoint(-29F, -44F, 5F);

        gunModel[222].addShapeBox(-1F, -11F, -7F, 2, 1, 5, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F); //
        gunModel[222].setRotationPoint(-29F, -43.5F, 5F);

        gunModel[223].addShapeBox(-1F, -11F, -7F, 2, 1, 5, 0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[223].setRotationPoint(-29F, -44.5F, 5F);

        gunModel[224].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[224].setRotationPoint(-12F, -39F, 4F);

        gunModel[225].addShapeBox(-1F, -11F, -7F, 8, 6, 4, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[225].setRotationPoint(-23F, -43F, 2.5F);

        gunModel[226].addShapeBox(-1F, -11F, -7F, 8, 6, 4, 0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[226].setRotationPoint(-23F, -43F, 8.5F);

        gunModel[227].addShapeBox(-1F, -11F, -7F, 8, 1, 4, 0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); //
        gunModel[227].setRotationPoint(-23F, -44F, 2.5F);

        gunModel[228].addShapeBox(-1F, -11F, -7F, 8, 1, 4, 0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[228].setRotationPoint(-23F, -44F, 8.5F);

        gunModel[229].addShapeBox(-1F, -11F, -7F, 6, 2, 3, 0F, 1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 1.0F, 0.0F, -0.1F, 1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 1.0F, 0.0F, -0.1F); //
        gunModel[229].setRotationPoint(-19F, -44F, 6F);

        gunModel[230].addShapeBox(-1F, -11F, -7F, 2, 1, 3, 0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[230].setRotationPoint(-23F, -44F, 6F);

        gunModel[231].addShapeBox(-1F, -11F, -7F, 2, 6, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[231].setRotationPoint(-23F, -43.5F, 6F);

        gunModel[232].addShapeBox(-1F, -11F, -7F, 1, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[232].setRotationPoint(-11F, -43F, 4F);

        gunModel[233].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[233].setRotationPoint(-10F, -40F, 4F);

        gunModel[234].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[234].setRotationPoint(-10F, -42.5F, 4F);

        gunModel[235].addShapeBox(-1F, -11F, -7F, 5, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[235].setRotationPoint(60F, -43F, 4F);

        gunModel[236].addShapeBox(-1F, -11F, -7F, 1, 2, 3, 0F, 0.5F, 0.0F, -0.6F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.5F, 0.0F, -0.6F); //
        gunModel[236].setRotationPoint(-20F, -44F, 6F);

        gunModel[237].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[237].setRotationPoint(-17.5F, -43F, 11.75F);

        gunModel[238].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F); //
        gunModel[238].setRotationPoint(-17.5F, -42.5F, 11.75F);

        gunModel[239].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[239].setRotationPoint(-17.5F, -43.5F, 11.75F);

        gunModel[240].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[240].setRotationPoint(-14F, -37F, 12F);

        gunModel[241].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[241].setRotationPoint(-14F, -37F, 11F);

        gunModel[242].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[242].setRotationPoint(56F, -37F, 12F);

        gunModel[243].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F); //
        gunModel[243].setRotationPoint(56F, -37F, 11F);

        gunModel[244].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[244].setRotationPoint(-14F, -37F, 3F);

        gunModel[245].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[245].setRotationPoint(-14F, -37F, 2F);

        gunModel[246].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[246].setRotationPoint(56F, -37F, 3F);

        gunModel[247].addShapeBox(-1F, -11F, -7F, 1, 4, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F); //
        gunModel[247].setRotationPoint(56F, -37F, 2F);

        gunModel[248].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[248].setRotationPoint(59F, -40F, 4F);

        gunModel[249].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); //
        gunModel[249].setRotationPoint(59F, -42.5F, 4F);

        gunModel[250].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[250].setRotationPoint(65F, -40F, 4F);

        gunModel[251].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[251].setRotationPoint(65F, -42.5F, 4F);

        gunModel[252].addShapeBox(-1F, -11F, -7F, 22, 3, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[252].setRotationPoint(65F, -42F, 5F);

        gunModel[253].addShapeBox(-1F, -11F, -7F, 2, 2, 4, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[253].setRotationPoint(-1F, -29F, 12.5F);

        gunModel[254].addShapeBox(-1F, -11F, -7F, 63, 1, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F); //
        gunModel[254].setRotationPoint(1F, -33F, 14F);

        gunModel[255].addShapeBox(-1F, -11F, -7F, 66, 1, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[255].setRotationPoint(1F, -28F, 15F);

        gunModel[256].addShapeBox(-1F, -11F, -7F, 46, 1, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.15F, 0.5F, 0.0F, 1.15F); //
        gunModel[256].setRotationPoint(18F, -32F, 14.1F);

        gunModel[257].addShapeBox(-1F, -11F, -7F, 2, 2, 4, 0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); //
        gunModel[257].setRotationPoint(-1F, -33F, 12F);

        gunModel[258].addShapeBox(-1F, -11F, -7F, 2, 2, 4, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F); //
        gunModel[258].setRotationPoint(-1F, -31F, 12.5F);

        gunModel[259].addShapeBox(-1F, -11F, -7F, 2, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[259].setRotationPoint(-1F, -30F, 13F);

        gunModel[260].addShapeBox(-1F, -11F, -7F, 2, 2, 1, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[260].setRotationPoint(-3F, -29F, 15.5F);

        gunModel[261].addShapeBox(-1F, -11F, -7F, 2, 2, 1, 0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F); //
        gunModel[261].setRotationPoint(-3F, -33F, 15F);

        gunModel[262].addShapeBox(-1F, -11F, -7F, 2, 2, 1, 0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F); //
        gunModel[262].setRotationPoint(-3F, -31F, 15.5F);

        gunModel[263].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[263].setRotationPoint(-3F, -30F, 16F);

        gunModel[264].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, -1.5F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.5F, -3.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.75F); //
        gunModel[264].setRotationPoint(-4F, -33F, 15F);

        gunModel[265].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.5F); //
        gunModel[265].setRotationPoint(-4F, -31F, 14.5F);

        gunModel[266].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[266].setRotationPoint(-4F, -30F, 15F);

        gunModel[267].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -1.0F); //
        gunModel[267].setRotationPoint(-4F, -29F, 14.5F);

        gunModel[268].addShapeBox(-1F, -11F, -7F, 4, 1, 9, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 2.0F, -2.0F, -0.5F, 1.75F, -2.0F, -0.5F, 0.65F, 0.0F, -0.5F, 0.9F); //
        gunModel[268].setRotationPoint(-5F, -33F, 4.5F);

        gunModel[269].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.55F, -0.5F, -1.0F, 0.0F); //
        gunModel[269].setRotationPoint(16.5F, -32F, 14.1F);

        gunModel[270].addShapeBox(-1F, -11F, -7F, 63, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[270].setRotationPoint(1F, -30.5F, 12F);

        gunModel[271].addShapeBox(-1F, -11F, -7F, 63, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[271].setRotationPoint(1F, -31.5F, 12F);

        gunModel[272].addShapeBox(-1F, -11F, -7F, 63, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[272].setRotationPoint(1F, -28.5F, 12F);

        gunModel[273].addShapeBox(-1F, -11F, -7F, 63, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[273].setRotationPoint(1F, -27.5F, 12F);

        gunModel[274].addShapeBox(-1F, -11F, -7F, 63, 1, 2, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[274].setRotationPoint(1F, -32.5F, 12F);

        gunModel[275].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[275].setRotationPoint(2F, -27.5F, 12.25F);

        gunModel[276].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[276].setRotationPoint(4F, -27.5F, 12.25F);

        gunModel[277].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[277].setRotationPoint(8F, -27.5F, 12.25F);

        gunModel[278].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[278].setRotationPoint(12F, -27.5F, 12.25F);

        gunModel[279].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[279].setRotationPoint(16F, -27.5F, 12.25F);

        gunModel[280].addShapeBox(-1F, -11F, -7F, 25, 1, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); //
        gunModel[280].setRotationPoint(1F, -27F, 13.25F);

        gunModel[281].addShapeBox(-1F, -11F, -7F, 2, 1, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); //
        gunModel[281].setRotationPoint(-1F, -27F, 13.25F);

        gunModel[282].addShapeBox(-1F, -11F, -7F, 2, 1, 2, 0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F); //
        gunModel[282].setRotationPoint(-3F, -27F, 13.25F);

        gunModel[283].addShapeBox(-1F, -11F, -7F, 4, 2, 9, 0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.9F, 0.0F, -1.0F, 2.0F, -3.0F, -1.0F, 2.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.6F); //
        gunModel[283].setRotationPoint(-5F, -32.5F, 4.5F);

        gunModel[284].addShapeBox(-1F, -11F, -7F, 1, 2, 14, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.5F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 1.5F, -1.0F, 0.0F, 1.5F); //
        gunModel[284].setRotationPoint(-5F, -31F, 1.5F);

        gunModel[285].addShapeBox(-1F, -11F, -7F, 1, 1, 14, 0F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F); //
        gunModel[285].setRotationPoint(-5F, -32F, 1.5F);

        gunModel[286].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[286].setRotationPoint(18F, -27.5F, 12.25F);

        gunModel[287].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[287].setRotationPoint(20F, -27.5F, 12.25F);

        gunModel[288].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[288].setRotationPoint(22F, -27.5F, 12.25F);

        gunModel[289].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[289].setRotationPoint(24F, -27.5F, 12.25F);

        gunModel[290].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[290].setRotationPoint(26F, -27.5F, 12.25F);

        gunModel[291].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[291].setRotationPoint(28F, -27.5F, 12.25F);

        gunModel[292].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[292].setRotationPoint(30F, -27.5F, 12.25F);

        gunModel[293].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[293].setRotationPoint(32F, -27.5F, 12.25F);

        gunModel[294].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[294].setRotationPoint(34F, -27.5F, 12.25F);

        gunModel[295].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[295].setRotationPoint(36F, -27.5F, 12.25F);

        gunModel[296].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[296].setRotationPoint(38F, -27.5F, 12.25F);

        gunModel[297].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[297].setRotationPoint(40F, -27.5F, 12.25F);

        gunModel[298].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[298].setRotationPoint(42F, -27.5F, 12.25F);

        gunModel[299].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[299].setRotationPoint(44F, -27.5F, 12.25F);

        gunModel[300].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[300].setRotationPoint(46F, -27.5F, 12.25F);

        gunModel[301].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[301].setRotationPoint(48F, -27.5F, 12.25F);

        gunModel[302].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[302].setRotationPoint(50F, -27.5F, 12.25F);

        gunModel[303].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[303].setRotationPoint(52F, -27.5F, 12.25F);

        gunModel[304].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[304].setRotationPoint(54F, -27.5F, 12.25F);

        gunModel[305].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[305].setRotationPoint(56F, -27.5F, 12.25F);

        gunModel[306].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[306].setRotationPoint(58F, -27.5F, 12.25F);

        gunModel[307].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[307].setRotationPoint(60F, -27.5F, 12.25F);

        gunModel[308].addShapeBox(-1F, -11F, -7F, 64, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[308].setRotationPoint(0F, -30.5F, 12.25F);

        gunModel[309].addShapeBox(-1F, -11F, -7F, 64, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[309].setRotationPoint(0F, -31.5F, 12.25F);

        gunModel[310].addShapeBox(-1F, -11F, -7F, 64, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[310].setRotationPoint(0F, -28.5F, 12.25F);

        gunModel[311].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F); //
        gunModel[311].setRotationPoint(62F, -27.5F, 12.25F);

        gunModel[312].addShapeBox(-1F, -11F, -7F, 2, 2, 19, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 3.0F, -3.0F, 0.0F, 3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[312].setRotationPoint(91.5F, -12F, -2F);

        gunModel[313].addShapeBox(-1F, -11F, -7F, 1, 2, 4, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -1.75F, 0.0F, 0.0F, -1.0F); //
        gunModel[313].setRotationPoint(69F, -29F, 12.5F);

        gunModel[314].addShapeBox(-1F, -11F, -7F, 1, 2, 4, 0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F); //
        gunModel[314].setRotationPoint(69F, -33F, 12F);

        gunModel[315].addShapeBox(-1F, -11F, -7F, 1, 2, 4, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.5F); //
        gunModel[315].setRotationPoint(69F, -31F, 12.5F);

        gunModel[316].addShapeBox(-1F, -11F, -7F, 1, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F); //
        gunModel[316].setRotationPoint(69F, -30F, 13F);

        gunModel[317].addShapeBox(-1F, -11F, -7F, 2, 2, 4, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[317].setRotationPoint(67F, -29F, 12.5F);

        gunModel[318].addShapeBox(-1F, -11F, -7F, 2, 2, 4, 0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); //
        gunModel[318].setRotationPoint(67F, -33F, 12F);

        gunModel[319].addShapeBox(-1F, -11F, -7F, 2, 2, 4, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F); //
        gunModel[319].setRotationPoint(67F, -31F, 12.5F);

        gunModel[320].addShapeBox(-1F, -11F, -7F, 2, 1, 4, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[320].setRotationPoint(67F, -30F, 13F);

        gunModel[321].addShapeBox(-1F, -11F, -7F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, -0.75F, 0.0F, -0.5F, -0.75F); //
        gunModel[321].setRotationPoint(70F, -29F, 12.5F);

        gunModel[322].addShapeBox(-1F, -11F, -7F, 1, 1, 3, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F); //
        gunModel[322].setRotationPoint(70F, -30F, 13F);

        gunModel[323].addShapeBox(-1F, -11F, -7F, 1, 2, 3, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.75F); //
        gunModel[323].setRotationPoint(70F, -31F, 12.5F);

        gunModel[324].addShapeBox(-1F, -11F, -7F, 1, 2, 4, 0F, 0.0F, -0.5F, 2.0F, 0.0F, -1.5F, 2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[324].setRotationPoint(70F, -33F, 12F);

        gunModel[325].addShapeBox(-1F, -11F, -7F, 6, 2, 0, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F); //
        gunModel[325].setRotationPoint(67F, -33F, 1.5F);

        gunModel[326].addShapeBox(-1F, -11F, -7F, 6, 2, 7, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[326].setRotationPoint(67F, -31F, -2F);

        gunModel[327].addShapeBox(-1F, -11F, -7F, 6, 3, 10, 0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[327].setRotationPoint(67F, -29F, -3.5F);

        gunModel[328].addShapeBox(-1F, -11F, -7F, 1, 6, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[328].setRotationPoint(87F, -43F, 4F);

        gunModel[329].addShapeBox(-1F, -11F, -7F, 48, 1, 2, 0F, 0.0F, -0.35F, 0.0F, 1.35F, -0.35F, 0.0F, 1.35F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 1.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[329].setRotationPoint(-63F, -32F, 14F);

        gunModel[330].addShapeBox(-1F, -11F, -7F, 48, 1, 2, 0F, 0.0F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, -0.25F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, 0.0F, 1.35F, -0.15F, 0.0F, 1.35F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F); //
        gunModel[330].setRotationPoint(-63F, -32.5F, 14F);

        gunModel[331].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.85F, -1.0F); //
        gunModel[331].setRotationPoint(-69F, -31.65F, 14F);

        gunModel[332].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.5F); //
        gunModel[332].setRotationPoint(-69F, -32.5F, 14F);

        gunModel[333].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -0.85F, 0.25F, 0.0F, -0.85F, -1.0F, 0.0F, -1.0F, -1.5F); //
        gunModel[333].setRotationPoint(-70F, -31.65F, 15F);

        gunModel[334].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, -1.0F, 0.25F, 0.0F, -0.85F, 0.25F, 0.0F, -0.85F, -1.0F, 0.0F, -0.95F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F); //
        gunModel[334].setRotationPoint(-70F, -33.35F, 14.5F);

        gunModel[335].addShapeBox(-1F, -11F, -7F, 9, 4, 7, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[335].setRotationPoint(79F, -38F, 4F);

        gunModel[336].addShapeBox(-1F, -11F, -7F, 4, 4, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[336].setRotationPoint(75F, -37F, 4F);

        gunModel[337].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[337].setRotationPoint(86F, -38.5F, 4F);

        gunModel[338].addShapeBox(-1F, -11F, -7F, 1, 1, 7, 0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[338].setRotationPoint(79F, -38.5F, 4F);

        gunModel[339].addShapeBox(-1F, -11F, -7F, 7, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[339].setRotationPoint(62F, -39F, 11F);

        gunModel[340].addShapeBox(-1F, -11F, -7F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[340].setRotationPoint(66F, -40F, 10F);

        gunModel[341].addShapeBox(-1F, -11F, -7F, 3, 1, 3, 0F, -0.75F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[341].setRotationPoint(66F, -41F, 10F);

        gunModel[342].addShapeBox(-1F, -11F, -7F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); //
        gunModel[342].setRotationPoint(62F, -39.75F, 11F);

        gunModel[343].addShapeBox(-1F, -11F, -7F, 7, 2, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[343].setRotationPoint(62F, -39F, 2F);

        gunModel[344].addShapeBox(-1F, -11F, -7F, 3, 1, 3, 0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[344].setRotationPoint(66F, -40F, 2F);

        gunModel[345].addShapeBox(-1F, -11F, -7F, 3, 1, 3, 0F, -0.75F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[345].setRotationPoint(66F, -41F, 2F);

        gunModel[346].addShapeBox(-1F, -11F, -7F, 3, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); //
        gunModel[346].setRotationPoint(62F, -39.75F, 2.5F);

        gunModel[347].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[347].setRotationPoint(66.25F, -40F, 12.25F);

        gunModel[348].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F); //
        gunModel[348].setRotationPoint(66.25F, -39.5F, 12.25F);

        gunModel[349].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[349].setRotationPoint(66.25F, -40.5F, 12.25F);

        gunModel[350].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[350].setRotationPoint(66.25F, -40F, 1.75F);

        gunModel[351].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F); //
        gunModel[351].setRotationPoint(66.25F, -39.5F, 1.75F);

        gunModel[352].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        gunModel[352].setRotationPoint(66.25F, -40.5F, 1.75F);

        gunModel[353].addShapeBox(-1F, -11F, -7F, 5, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, -5.0F, 0.0F, -7.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[353].setRotationPoint(95F, -23F, 12F);

        gunModel[354].addShapeBox(-1F, -11F, -7F, 5, 7, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[354].setRotationPoint(95F, -23F, 12F);

        gunModel[355].addShapeBox(-1F, -11F, -7F, 5, 7, 1, 0F, 0.0F, -3.0F, 0.0F, -2.15F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[355].setRotationPoint(95F, -23F, 11F);

        gunModel[356].addShapeBox(-1F, -11F, -7F, 5, 7, 1, 0F, 0.0F, -4.0F, 0.0F, -2.85F, -4.0F, 0.0F, -2.15F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[356].setRotationPoint(95F, -23F, 10F);

        gunModel[357].addShapeBox(-1F, -11F, -7F, 5, 7, 7, 0F, 0.0F, 0.0F, -0.1F, -5.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F); //
        gunModel[357].setRotationPoint(95F, -23F, -4F);

        gunModel[358].addShapeBox(-1F, -11F, -7F, 5, 7, 7, 0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[358].setRotationPoint(95F, -23F, -4F);

        gunModel[359].addShapeBox(-1F, -11F, -7F, 5, 7, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.15F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[359].setRotationPoint(95F, -23F, 3F);

        gunModel[360].addShapeBox(-1F, -11F, -7F, 5, 7, 1, 0F, 0.0F, -3.0F, 0.0F, -2.15F, -3.0F, 0.0F, -2.85F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[360].setRotationPoint(95F, -23F, 4F);

        gunModel[361].addShapeBox(-1F, -11F, -7F, 5, 7, 5, 0F, 0.0F, -4.0F, 0.0F, -2.85F, -4.0F, 0.0F, -2.85F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[361].setRotationPoint(95F, -23F, 5F);

        gunModel[362].addShapeBox(-1F, -11F, -7F, 2, 7, 2, 0F, 0.0F, -0.5F, 0.0F, -0.55F, -2.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[362].setRotationPoint(95F, -30F, 17F);

        gunModel[363].addShapeBox(-1F, -11F, -7F, 1, 12, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, -1.0F); //
        gunModel[363].setRotationPoint(94F, -28.5F, 17F);

        gunModel[364].addShapeBox(-1F, -11F, -7F, 6, 4, 1, 0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, -2.5F, 0.0F, -3.5F, 2.5F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, -3.5F, -0.25F); //
        gunModel[364].setRotationPoint(89F, -33F, 15.5F);

        gunModel[365].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.1F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.1F, -0.55F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[365].setRotationPoint(94F, -29.5F, 17F);

        gunModel[366].addShapeBox(-1F, -11F, -7F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.25F, 0.0F, -1.0F, -0.25F); //
        gunModel[366].setRotationPoint(85F, -35F, 15F);

        gunModel[367].addShapeBox(-1F, -11F, -7F, 5, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, -1.0F); //
        gunModel[367].setRotationPoint(80F, -37F, 14F);

        gunModel[368].addShapeBox(-1F, -11F, -7F, 3, 2, 2, 0F, 0.5F, -2.0F, 0.0F, -0.6F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[368].setRotationPoint(95.45F, -25F, 15F);

        gunModel[369].addShapeBox(-1F, -11F, -7F, 98, 4, 3, 0F, 3.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 3.5F, 0.0F, -0.5F, 0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F); //
        gunModel[369].setRotationPoint(-5F, -26F, 16F);

        gunModel[370].addShapeBox(-1F, -11F, -7F, 5, 3, 7, 0F, 0.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -5.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[370].setRotationPoint(95F, -26F, -4F);

        gunModel[371].addShapeBox(-1F, -11F, -7F, 6, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[371].setRotationPoint(73F, -37F, 1F);

        gunModel[372].addShapeBox(-1F, -11F, -7F, 13, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.5F, -4.5F, 0.0F, 0.5F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 4.5F, 0.0F, 0.5F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[372].setRotationPoint(79F, -37F, 1F);

        gunModel[373].addShapeBox(-1F, -11F, -7F, 6, 10, 1, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[373].setRotationPoint(73F, -36F, 3F);

        gunModel[374].addShapeBox(-1F, -11F, -7F, 13, 10, 1, 0F, 0.0F, 0.0F, 0.5F, 0.5F, -4.5F, 0.5F, 0.5F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[374].setRotationPoint(79F, -36F, 3F);

        gunModel[375].addShapeBox(-1F, -11F, -7F, 15, 2, 6, 0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[375].setRotationPoint(73F, -28F, -3.5F);

        gunModel[376].addShapeBox(-1F, -11F, -7F, 1, 3, 5, 0F, 2.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.75F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); //
        gunModel[376].setRotationPoint(94F, -21.5F, -4F);

        gunModel[377].addShapeBox(-1F, -11F, -7F, 5, 1, 7, 0F, 0.0F, -1.0F, -0.5F, -5.0F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.5F, 1.5F, -0.5F, 0.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[377].setRotationPoint(95F, -27F, -4F);

        gunModel[378].addShapeBox(-1F, -11F, -7F, 2, 2, 3, 0F, 0.0F, -0.75F, -3.0F, -1.0F, -0.75F, -3.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[378].setRotationPoint(88F, -28F, -3.5F);

        gunModel[379].addShapeBox(-1F, -11F, -7F, 1, 2, 3, 0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[379].setRotationPoint(88F, -28F, -0.5F);

        gunModel[380].addShapeBox(-1F, -11F, -7F, 3, 2, 2, 0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        gunModel[380].setRotationPoint(89F, -28F, -0.5F);

        gunModel[381].addShapeBox(-1F, -11F, -7F, 4, 2, 1, 0F, 0.0F, -0.15F, 0.5F, -0.5F, -0.15F, 0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[381].setRotationPoint(89F, -28F, 1.5F);

        gunModel[382].addShapeBox(-1F, -11F, -7F, 2, 2, 1, 0F, 0.0F, -0.15F, 0.5F, 0.1F, -0.1F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[382].setRotationPoint(92.5F, -28F, 1.5F);

        gunModel[383].addShapeBox(-1F, -11F, -7F, 7, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[383].setRotationPoint(73F, -37F, 10F);

        gunModel[384].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0.0F, -0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[384].setRotationPoint(92.5F, -34F, 1.25F);

        gunModel[385].addShapeBox(-1F, -11F, -7F, 2, 2, 19, 0F, 0.0F, 3.0F, -3.0F, 0.0F, 3.0F, -3.0F, 0.0F, 3.0F, -3.0F, 0.0F, 3.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -4.0F, -3.0F, 0.0F, -4.0F, -3.0F, 0.0F, -1.0F, -3.0F); //
        gunModel[385].setRotationPoint(91.5F, -13F, -2F);

        gunModel[386].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 3.5F, 0.5F); //
        gunModel[386].setRotationPoint(92.5F, -16F, 14F);

        gunModel[387].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.5F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F); //
        gunModel[387].setRotationPoint(92.5F, -16F, -1F);

        gunModel[388].addShapeBox(-1F, -11F, -7F, 23, 2, 5, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); //
        gunModel[388].setRotationPoint(73F, -32F, 8.5F);

        gunModel[389].addShapeBox(-1F, -11F, -7F, 23, 2, 5, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F); //
        gunModel[389].setRotationPoint(73F, -30.5F, 8.5F);

        gunModel[390].addShapeBox(-1F, -11F, -7F, 23, 2, 5, 0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); //
        gunModel[390].setRotationPoint(73F, -33.5F, 8.5F);

        gunModel[391].addShapeBox(-1F, -11F, -7F, 3, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[391].setRotationPoint(91F, -32F, 8F);

        gunModel[392].addShapeBox(-1F, -11F, -7F, 3, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[392].setRotationPoint(91F, -30F, 8F);

        gunModel[393].addShapeBox(-1F, -11F, -7F, 1, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[393].setRotationPoint(91F, -34F, 8F);

        gunModel[394].addShapeBox(-1F, -11F, -7F, 1, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[394].setRotationPoint(93F, -34F, 8F);

        gunModel[395].addShapeBox(-1F, -11F, -7F, 1, 1, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[395].setRotationPoint(92F, -34F, 8F);

        gunModel[396].addShapeBox(-1F, -11F, -7F, 15, 1, 2, 0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); //
        gunModel[396].setRotationPoint(79F, -35F, 10F);

        gunModel[397].addShapeBox(-1F, -11F, -7F, 15, 1, 2, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F); //
        gunModel[397].setRotationPoint(79F, -34F, 10F);

        gunModel[398].addShapeBox(-1F, -11F, -7F, 15, 1, 2, 0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); //
        gunModel[398].setRotationPoint(79F, -35.5F, 10F);

        gunModel[399].addShapeBox(-1F, -11F, -7F, 7, 2, 1, 0F, 0.0F, 0.0F, 0.25F, -0.25F, -4.3F, 0.0F, 0.5F, -4.3F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, 0.25F, -0.25F, 4.5F, 0.0F, 0.5F, 4.5F, 0.0F, 0.0F, 4.0F, 1.0F); //
        gunModel[399].setRotationPoint(92.5F, -32.5F, 2F);

        gunModel[400].addShapeBox(-1F, -11F, -7F, 82, 7, 11, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[400].setRotationPoint(-9F, -29F, 2F);

        gunModel[401].addShapeBox(-1F, -11F, -7F, 1, 3, 5, 0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); //
        gunModel[401].setRotationPoint(94F, -18.5F, -4F);

        gunModel[402].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); //
        gunModel[402].setRotationPoint(93.5F, -18.25F, 17F);

        gunModel[403].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, -0.75F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); //
        gunModel[403].setRotationPoint(93.5F, -17F, 17F);

        gunModel[404].addShapeBox(-1F, -11F, -7F, 2, 8, 14, 0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[404].setRotationPoint(-42F, -41F, 0.5F);

        gunModel[405].addShapeBox(-1F, -11F, -7F, 2, 3, 14, 0F, 0.0F, -1.0F, -0.5F, 0.4F, -1.0F, -0.5F, 0.4F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); //
        gunModel[405].setRotationPoint(-42F, -43F, 0.5F);

        gunModel[406].addShapeBox(-1F, -11F, -7F, 1, 4, 12, 0F, -0.5F, -1.0F, -2.0F, 1.6F, -1.0F, -2.0F, 1.6F, -1.0F, -2.0F, -0.5F, -1.0F, -2.0F, -0.5F, -1.0F, 0.5F, 0.4F, -1.0F, 0.5F, 0.4F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F); //
        gunModel[406].setRotationPoint(-41F, -45F, 1.5F);

        gunModel[407].addShapeBox(-1F, -11F, -7F, 7, 8, 14, 0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); //
        gunModel[407].setRotationPoint(-49F, -41F, 0.5F);

        gunModel[408].addShapeBox(-1F, -11F, -7F, 7, 2, 14, 0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F); //
        gunModel[408].setRotationPoint(-49F, -42.5F, 0.5F);

        gunModel[409].addShapeBox(-1F, -11F, -7F, 7, 2, 14, 0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F); //
        gunModel[409].setRotationPoint(-49F, -44F, 0.5F);

        gunModel[410].addShapeBox(-1F, -11F, -7F, 7, 2, 13, 0F, 0.0F, -1.5F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.5F, -4.0F, 0.0F, 1.5F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -1.5F); //
        gunModel[410].setRotationPoint(-56F, -44F, 1F);

        gunModel[411].addShapeBox(-1F, -11F, -7F, 7, 2, 11, 0F, 0.0F, -2.5F, -3.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.5F, -3.5F, 0.0F, 2.5F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.5F, -2.0F); //
        gunModel[411].setRotationPoint(-63F, -42.5F, 2F);

        gunModel[412].addShapeBox(-1F, -11F, -7F, 7, 2, 13, 0F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.0F, 1.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -1.0F); //
        gunModel[412].setRotationPoint(-56F, -42.5F, 1F);

        gunModel[413].addShapeBox(-1F, -11F, -7F, 7, 2, 11, 0F, 0.0F, -3.0F, -2.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.0F, -2.0F, 0.0F, 2.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, -1.5F); //
        gunModel[413].setRotationPoint(-63F, -41F, 2F);

        gunModel[414].addShapeBox(-1F, -11F, -7F, 7, 7, 13, 0F, 0.0F, -2.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, -1.0F); //
        gunModel[414].setRotationPoint(-56F, -41F, 1F);

        gunModel[415].addShapeBox(-1F, -11F, -7F, 7, 5, 11, 0F, 0.0F, -2.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, -1.5F); //
        gunModel[415].setRotationPoint(-63F, -39F, 2F);

        gunModel[416].addShapeBox(-1F, -11F, -7F, 2, 2, 10, 0F, 0.0F, -2.5F, -4.5F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -2.5F, -4.5F, 0.0F, 2.5F, -3.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 2.5F, -3.0F); //
        gunModel[416].setRotationPoint(-65F, -40.5F, 2.5F);

        gunModel[417].addShapeBox(-1F, -11F, -7F, 2, 2, 10, 0F, 0.0F, -2.5F, -3.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -2.5F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -3.0F); //
        gunModel[417].setRotationPoint(-65F, -38.5F, 2.5F);

        gunModel[418].addShapeBox(-1F, -11F, -7F, 2, 2, 8, 0F, 0.0F, -2.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[418].setRotationPoint(-65F, -37F, 3.5F);

        gunModel[419].addShapeBox(-1F, -11F, -7F, 2, 3, 12, 0F, 0.0F, -1.0F, -2.0F, -0.5F, -1.0F, -2.0F, -0.5F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.5F, -1.37F, -0.5F, -1.5F, -1.37F, -0.5F, -1.5F, -1.37F, 0.0F, -1.5F, -1.37F); //
        gunModel[419].setRotationPoint(-42F, -45F, 1.5F);

        gunModel[420].addShapeBox(-1F, -11F, -7F, 1, 1, 12, 0F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F); //
        gunModel[420].setRotationPoint(-41.5F, -43F, 1.5F);

        gunModel[421].addShapeBox(-1F, -11F, -7F, 1, 1, 12, 0F, 0.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, -1.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); //
        gunModel[421].setRotationPoint(-42F, -43F, 1.5F);

        gunModel[422].addShapeBox(-1F, -11F, -7F, 1, 1, 8, 0F, -0.5F, 0.0F, 0.63F, 0.0F, 0.0F, 0.63F, 0.0F, 0.0F, 0.63F, -0.5F, 0.0F, 0.63F, -1.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, -1.0F, -0.5F, 1.25F); //
        gunModel[422].setRotationPoint(-41.5F, -43.5F, 3.5F);

        gunModel[423].addShapeBox(-1F, -11F, -7F, 1, 1, 8, 0F, 0.0F, 0.0F, 0.63F, -0.5F, 0.0F, 0.63F, -0.5F, 0.0F, 0.63F, 0.0F, 0.0F, 0.63F, 0.0F, -0.5F, 1.25F, -1.0F, -0.5F, 1.25F, -1.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F); //
        gunModel[423].setRotationPoint(-42F, -43.5F, 3.5F);

        gunModel[424].addShapeBox(-1F, -11F, -7F, 11, 8, 9, 0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[424].setRotationPoint(-37F, 19F, 3F);

        gunModel[425].addShapeBox(-1F, -11F, -7F, 96, 1, 19, 0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[425].setRotationPoint(-5F, -23F, -2F);

        gunModel[426].addShapeBox(-1F, -11F, -7F, 7, 5, 24, 0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); //
        gunModel[426].setRotationPoint(-134F, -18F, -4.5F);

        gunModel[427].addShapeBox(-1F, -11F, -7F, 7, 6, 24, 0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[427].setRotationPoint(-134F, -24F, -4.5F);

        gunModel[428].addShapeBox(-1F, -11F, -7F, 3, 5, 24, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F); //
        gunModel[428].setRotationPoint(-136.5F, -18F, -4.5F);

        gunModel[429].addShapeBox(-1F, -11F, -7F, 3, 6, 24, 0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[429].setRotationPoint(-136.5F, -24F, -4.5F);

        gunModel[430].addShapeBox(-1F, -11F, -7F, 8, 3, 24, 0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); //
        gunModel[430].setRotationPoint(-135.5F, -27F, -4.5F);

        gunModel[431].addShapeBox(-1F, -11F, -7F, 9, 3, 24, 0F, 0.75F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); //
        gunModel[431].setRotationPoint(-135.5F, -30F, -4.5F);

        gunModel[432].addShapeBox(-1F, -11F, -7F, 10, 4, 22, 0F, 0.5F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); //
        gunModel[432].setRotationPoint(-135.5F, -34F, -3.5F);

        gunModel[433].addShapeBox(-1F, -11F, -7F, 8, 2, 16, 0F, 0.5F, 0.0F, -4.0F, 2.5F, 0.0F, -4.0F, 2.5F, 0.0F, -4.0F, 0.5F, 0.0F, -4.0F, 2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F); //
        gunModel[433].setRotationPoint(-133.5F, -36F, -0.5F);

        gunModel[434].addShapeBox(-1F, -11F, -7F, 8, 1, 8, 0F, -2.5F, 0.0F, -3.0F, 2.5F, 0.0F, -3.0F, 2.5F, 0.0F, -3.0F, -2.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[434].setRotationPoint(-133.5F, -37F, 3.5F);

        gunModel[435].addShapeBox(-1F, -11F, -7F, 3, 2, 16, 0F, -1.5F, 0.0F, -5.0F, 1.5F, 0.0F, -4.0F, 1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -5.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F); //
        gunModel[435].setRotationPoint(-138.5F, -36F, -0.5F);

        gunModel[436].addShapeBox(-1F, -11F, -7F, 1, 1, 8, 0F, -2.75F, 0.0F, -3.5F, 4.75F, 0.0F, -3.0F, 4.75F, 0.0F, -3.0F, -2.75F, 0.0F, -3.5F, 0.25F, 0.0F, -1.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F); //
        gunModel[436].setRotationPoint(-136.75F, -37F, 3.5F);

        gunModel[437].addShapeBox(-1F, -11F, -7F, 4, 3, 24, 0F, 0.25F, 0.0F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F); //
        gunModel[437].setRotationPoint(-138.5F, -27F, -4.5F);

        gunModel[438].addShapeBox(-1F, -11F, -7F, 4, 3, 24, 0F, 0.75F, 0.0F, -2.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 0.75F, 0.0F, -2.0F, 0.25F, 0.0F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F); //
        gunModel[438].setRotationPoint(-138.5F, -30F, -4.5F);

        gunModel[439].addShapeBox(-1F, -11F, -7F, 3, 4, 22, 0F, -0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[439].setRotationPoint(-139.25F, -34F, -3.5F);

        gunModel[440].addShapeBox(-1F, -11F, -7F, 4, 4, 24, 0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F); //
        gunModel[440].setRotationPoint(-131F, -13F, -4.5F);

        gunModel[441].addShapeBox(-1F, -11F, -7F, 4, 32, 20, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.5F, 0.0F, 0.25F, 3.5F, 0.0F, 0.25F, 3.5F, 0.0F, 0.25F, -3.5F, 0.0F, 0.25F); //
        gunModel[441].setRotationPoint(-131F, -9F, -2.5F);

        gunModel[442].addShapeBox(-1F, -11F, -7F, 4, 4, 24, 0F, 1.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, -0.5F, 0.0F, -2.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -2.75F); //
        gunModel[442].setRotationPoint(-134.5F, -13F, -4.5F);

        gunModel[443].addShapeBox(-1F, -11F, -7F, 4, 32, 20, 0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -3.5F, 0.0F, -0.75F, 2.5F, 0.0F, 0.25F, 2.5F, 0.0F, 0.25F, -3.5F, 0.0F, -0.75F); //
        gunModel[443].setRotationPoint(-134F, -9F, -2.5F);

        gunModel[444].addShapeBox(-1F, -11F, -7F, 1, 2, 17, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F); //
        gunModel[444].setRotationPoint(-123F, 26F, -1F);

        gunModel[445].addShapeBox(-1F, -11F, -7F, 1, 2, 19, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F); //
        gunModel[445].setRotationPoint(-123F, 24F, -2F);

        gunModel[446].addShapeBox(-1F, -11F, -7F, 1, 6, 19, 0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[446].setRotationPoint(-123F, 18F, -2F);

        gunModel[447].addShapeBox(-1F, -11F, -7F, 3, 3, 20, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.25F); //
        gunModel[447].setRotationPoint(-130.5F, 23F, -2.5F);

        gunModel[448].addShapeBox(-1F, -11F, -7F, 4, 3, 20, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F); //
        gunModel[448].setRotationPoint(-127.5F, 23F, -2.5F);

        gunModel[449].addShapeBox(-1F, -11F, -7F, 3, 3, 19, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, -2.25F, 3.0F, 0.0F, -1.25F, 3.0F, 0.0F, -1.25F, -3.0F, 0.0F, -2.25F); //
        gunModel[449].setRotationPoint(-129.5F, 26F, -2F);

        gunModel[450].addShapeBox(-1F, -11F, -7F, 4, 3, 19, 0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, -1.25F, 3.0F, 0.0F, -1.25F, 3.0F, 0.0F, -1.25F, -3.0F, 0.0F, -1.25F); //
        gunModel[450].setRotationPoint(-126.5F, 26F, -2F);

        gunModel[451].addShapeBox(-1F, -11F, -7F, 24, 1, 6, 0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 4.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.0F, 0.5F); //
        gunModel[451].setRotationPoint(-116F, 24F, 4.5F);

        gunModel[452].addShapeBox(-1F, -11F, -7F, 26, 6, 5, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[452].setRotationPoint(69.5F, 1F, 5F);

        gunModel[453].addShapeBox(-1F, -11F, -7F, 22, 8, 7, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[453].setRotationPoint(69.5F, -10F, 4F);

        gunModel[454].addShapeBox(-1F, -11F, -7F, 26, 3, 19, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[454].setRotationPoint(69.5F, -2F, -2F);

        gunModel[455].addShapeBox(-1F, -11F, -7F, 26, 1, 8, 0F, 0.0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[455].setRotationPoint(70F, 7.25F, 3.5F);

        gunModel[456].addShapeBox(-1F, -11F, -7F, 13, 4, 13, 0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[456].setRotationPoint(-124F, -7F, 1F);

        gunModel[457].addShapeBox(-1F, -11F, -7F, 3, 1, 2, 0F, 1.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 1.3F, 0.0F, -1.5F, 0.75F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.25F, 0.75F, -0.35F, -0.25F); //
        gunModel[457].setRotationPoint(-13F, -33F, 14F);

        gunModel[458].addShapeBox(-1F, -11F, -7F, 1, 1, 2, 0F, 2.15F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 2.15F, -0.35F, 0.0F, 1.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 1.65F, 0.0F, -0.5F); //
        gunModel[458].setRotationPoint(-11F, -32F, 14F);

        gunModel[459].addShapeBox(-1F, -11F, -7F, 2, 1, 2, 0F, 1.75F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.25F, 1.75F, -0.15F, -0.25F, 1.15F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 1.15F, -0.15F, 0.0F); //
        gunModel[459].setRotationPoint(-12F, -32.5F, 14F);

        gunModel[460].addShapeBox(-1F, -11F, -7F, 4, 1, 2, 0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -1.0F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, 0.0F); //
        gunModel[460].setRotationPoint(-10F, -32.5F, 14F);

        gunModel[461].addShapeBox(-1F, -11F, -7F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -1.0F, 0.0F, -0.35F, -0.25F); //
        gunModel[461].setRotationPoint(-10F, -33F, 14F);

        gunModel[462].addShapeBox(-1F, -11F, -7F, 4, 1, 2, 0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F); //
        gunModel[462].setRotationPoint(-10F, -32F, 14F);

        gunModel[463].addShapeBox(-1F, -11F, -7F, 80, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); //
        gunModel[463].setRotationPoint(-44F, -22F, 19F);

        gunModel[464].addShapeBox(-1F, -11F, -7F, 15, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F); //
        gunModel[464].setRotationPoint(36.5F, -22F, 19F);

        gunModel[465].addShapeBox(-1F, -11F, -7F, 15, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -1.0F, 0.0F); //
        gunModel[465].setRotationPoint(52F, -22F, 19F);

        gunModel[466].addShapeBox(-1F, -11F, -7F, 22, 3, 1, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F); //
        gunModel[466].setRotationPoint(67.5F, -22F, 19F);

        gunModel[467].addShapeBox(-1F, -11F, -7F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.5F, 0.0F); //
        gunModel[467].setRotationPoint(89.5F, -22F, 19F);

        gunModel[468].addShapeBox(-1F, -11F, -7F, 4, 3, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F); //
        gunModel[468].setRotationPoint(-48.5F, -22F, 19F);

        gunModel[469].addShapeBox(-1F, -11F, -7F, 1, 3, 1, 0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, -1.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, -1.0F); //
        gunModel[469].setRotationPoint(-49.5F, -22F, 19F);

        gunModel[470].addShapeBox(-1F, -11F, -7F, 5, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[470].setRotationPoint(-27F, -18F, 18.4F);

        gunModel[471].addShapeBox(-1F, -11F, -7F, 5, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); //
        gunModel[471].setRotationPoint(-27F, -12F, 18.4F);

        gunModel[472].addShapeBox(-1F, -11F, -7F, 5, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[472].setRotationPoint(-27F, -19F, 18.4F);

        gunModel[473].addShapeBox(-1F, -11F, -7F, 9, 2, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); //
        gunModel[473].setRotationPoint(-41F, -34F, 13.75F);

        gunModel[474].addShapeBox(-1F, -11F, -7F, 9, 1, 1, 0F, 0.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F); //
        gunModel[474].setRotationPoint(-41F, -35F, 13.75F);

        gunModel[475].addShapeBox(-1F, -11F, -7F, 5, 1, 1, 0F, -0.25F, 0.0F, -0.25F, -4.75F, 0.0F, -0.25F, -4.75F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[475].setRotationPoint(-41F, -36F, 13.75F);

        gunModel[476].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); //
        gunModel[476].setRotationPoint(-32F, -34F, 13.75F);

        gunModel[477].addShapeBox(-1F, -11F, -7F, 9, 1, 1, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); //
        gunModel[477].setRotationPoint(-50F, -33F, 13.75F);

        gunModel[478].addShapeBox(-1F, -11F, -7F, 3, 1, 1, 0F, -2.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, -1.5F, 0.0F, 0.75F); //
        gunModel[478].setRotationPoint(-44F, -34F, 13.75F);

        gunModel[479].addShapeBox(-1F, -11F, -7F, 3, 1, 1, 0F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F); //
        gunModel[479].setRotationPoint(-44F, -35F, 13.75F);

        gunModel[480].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F); //
        gunModel[480].setRotationPoint(-51F, -33F, 13.75F);

        gunModel[481].addShapeBox(-1F, -11F, -7F, 48, 1, 2, 0F, 0.0F, 0.0F, -1.5F, 0.2F, 0.0F, -1.5F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, -0.25F, 0.75F, -0.35F, -0.25F, 0.75F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F); //
        gunModel[481].setRotationPoint(-63F, -33F, -1F);

        gunModel[482].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.35F, -0.75F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F); //
        gunModel[482].setRotationPoint(-69F, -33F, -1F);

        gunModel[483].addShapeBox(-1F, -11F, -7F, 48, 1, 2, 0F, 0.0F, -0.35F, 0.0F, 1.35F, -0.35F, 0.0F, 1.35F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.5F, 1.85F, 0.0F, -0.5F, 1.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[483].setRotationPoint(-63F, -32F, -1F);

        gunModel[484].addShapeBox(-1F, -11F, -7F, 48, 1, 2, 0F, 0.0F, -0.15F, -0.25F, 0.75F, -0.15F, -0.25F, 0.75F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 1.35F, -0.15F, 0.0F, 1.35F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F); //
        gunModel[484].setRotationPoint(-63F, -32.5F, -1F);

        gunModel[485].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, -1.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.85F, 0.0F); //
        gunModel[485].setRotationPoint(-69F, -31.65F, -1F);

        gunModel[486].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.25F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F); //
        gunModel[486].setRotationPoint(-69F, -32.5F, -1F);

        gunModel[487].addShapeBox(-1F, -11F, -7F, 9, 2, 1, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); //
        gunModel[487].setRotationPoint(-41F, -34F, 0.25F);

        gunModel[488].addShapeBox(-1F, -11F, -7F, 9, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); //
        gunModel[488].setRotationPoint(-41F, -35F, 0.25F);

        gunModel[489].addShapeBox(-1F, -11F, -7F, 5, 1, 1, 0F, -0.25F, 0.0F, -0.75F, -4.75F, 0.0F, -0.75F, -4.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F); //
        gunModel[489].setRotationPoint(-41F, -36F, 0.25F);

        gunModel[490].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[490].setRotationPoint(-32F, -34F, 0.25F);

        gunModel[491].addShapeBox(-1F, -11F, -7F, 9, 1, 1, 0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); //
        gunModel[491].setRotationPoint(-50F, -33F, 0.25F);

        gunModel[492].addShapeBox(-1F, -11F, -7F, 3, 1, 1, 0F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F, -1.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F); //
        gunModel[492].setRotationPoint(-44F, -34F, 0.25F);

        gunModel[493].addShapeBox(-1F, -11F, -7F, 3, 1, 1, 0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F); //
        gunModel[493].setRotationPoint(-44F, -35F, 0.25F);

        gunModel[494].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F); //
        gunModel[494].setRotationPoint(-51F, -33F, 0.25F);

        gunModel[495].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F); //
        gunModel[495].setRotationPoint(-70F, -32.35F, -0.5F);

        gunModel[496].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -1.5F, 0.0F, -0.85F, -1.0F, 0.0F, -0.85F, 0.25F, 0.0F, -1.0F, 0.25F); //
        gunModel[496].setRotationPoint(-70F, -31.65F, -1F);

        gunModel[497].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, -0.95F, -1.25F, 0.0F, -0.85F, -1.0F, 0.0F, -0.85F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); //
        gunModel[497].setRotationPoint(-70F, -33.35F, -0.5F);

        gunModel[498].addShapeBox(-1F, -11F, -7F, 4, 1, 25, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); //
        gunModel[498].setRotationPoint(-38F, -20F, -5F);

        gunModel[499].addShapeBox(-1F, -11F, -7F, 3, 1, 25, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F); //
        gunModel[499].setRotationPoint(-37.5F, -19F, -5F);
    }

    private void initgunModel_2() {
        gunModel[500] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); //
        gunModel[501] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); //
        gunModel[502] = new ModelRendererTurbo(this, 425, 385, textureX, textureY); //
        gunModel[503] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); //
        gunModel[504] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); //
        gunModel[505] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); //
        gunModel[506] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); //
        gunModel[507] = new ModelRendererTurbo(this, 593, 233, textureX, textureY); //
        gunModel[508] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); //
        gunModel[509] = new ModelRendererTurbo(this, 305, 305, textureX, textureY); //
        gunModel[510] = new ModelRendererTurbo(this, 377, 337, textureX, textureY); //
        gunModel[511] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); //
        gunModel[512] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); //
        gunModel[513] = new ModelRendererTurbo(this, 425, 377, textureX, textureY); //
        gunModel[514] = new ModelRendererTurbo(this, 449, 393, textureX, textureY); //
        gunModel[515] = new ModelRendererTurbo(this, 881, 401, textureX, textureY); //
        gunModel[516] = new ModelRendererTurbo(this, 153, 409, textureX, textureY); //
        gunModel[517] = new ModelRendererTurbo(this, 377, 401, textureX, textureY); //
        gunModel[518] = new ModelRendererTurbo(this, 745, 193, textureX, textureY); //
        gunModel[519] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); //
        gunModel[520] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); //
        gunModel[521] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); //
        gunModel[522] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); //
        gunModel[523] = new ModelRendererTurbo(this, 1001, 241, textureX, textureY); //
        gunModel[524] = new ModelRendererTurbo(this, 705, 249, textureX, textureY); //
        gunModel[525] = new ModelRendererTurbo(this, 961, 273, textureX, textureY); //
        gunModel[526] = new ModelRendererTurbo(this, 1001, 289, textureX, textureY); //
        gunModel[527] = new ModelRendererTurbo(this, 713, 329, textureX, textureY); //
        gunModel[528] = new ModelRendererTurbo(this, 761, 329, textureX, textureY); //
        gunModel[529] = new ModelRendererTurbo(this, 809, 329, textureX, textureY); //
        gunModel[530] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); //
        gunModel[531] = new ModelRendererTurbo(this, 521, 345, textureX, textureY); //
        gunModel[532] = new ModelRendererTurbo(this, 1001, 345, textureX, textureY); //
        gunModel[533] = new ModelRendererTurbo(this, 209, 369, textureX, textureY); //
        gunModel[534] = new ModelRendererTurbo(this, 913, 377, textureX, textureY); //
        gunModel[535] = new ModelRendererTurbo(this, 1001, 377, textureX, textureY); //
        gunModel[536] = new ModelRendererTurbo(this, 217, 385, textureX, textureY); //
        gunModel[537] = new ModelRendererTurbo(this, 665, 385, textureX, textureY); //
        gunModel[538] = new ModelRendererTurbo(this, 233, 393, textureX, textureY); //
        gunModel[539] = new ModelRendererTurbo(this, 401, 401, textureX, textureY); //
        gunModel[540] = new ModelRendererTurbo(this, 425, 401, textureX, textureY); //
        gunModel[541] = new ModelRendererTurbo(this, 609, 401, textureX, textureY); //
        gunModel[542] = new ModelRendererTurbo(this, 633, 401, textureX, textureY); //
        gunModel[543] = new ModelRendererTurbo(this, 49, 409, textureX, textureY); //
        gunModel[544] = new ModelRendererTurbo(this, 73, 409, textureX, textureY); //
        gunModel[545] = new ModelRendererTurbo(this, 289, 409, textureX, textureY); //
        gunModel[546] = new ModelRendererTurbo(this, 313, 409, textureX, textureY); //
        gunModel[547] = new ModelRendererTurbo(this, 337, 409, textureX, textureY); //
        gunModel[548] = new ModelRendererTurbo(this, 457, 409, textureX, textureY); //
        gunModel[549] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); //
        gunModel[550] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); //
        gunModel[551] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); //
        gunModel[552] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); //
        gunModel[553] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); //
        gunModel[554] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); //
        gunModel[555] = new ModelRendererTurbo(this, 505, 409, textureX, textureY); //
        gunModel[556] = new ModelRendererTurbo(this, 833, 161, textureX, textureY); //
        gunModel[557] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); //
        gunModel[558] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); //
        gunModel[559] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); //
        gunModel[560] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); //
        gunModel[561] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); //

        gunModel[500].addShapeBox(-1F, -11F, -7F, 4, 1, 25, 0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[500].setRotationPoint(-38F, -22F, -5F);

        gunModel[501].addShapeBox(-1F, -11F, -7F, 3, 1, 25, 0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[501].setRotationPoint(-37.5F, -23F, -5F);

        gunModel[502].addShapeBox(-1F, -11F, -7F, 80, 3, 1, 0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[502].setRotationPoint(-44F, -22F, -5F);

        gunModel[503].addShapeBox(-1F, -11F, -7F, 4, 3, 1, 0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F); //
        gunModel[503].setRotationPoint(-48.5F, -22F, -5F);

        gunModel[504].addShapeBox(-1F, -11F, -7F, 1, 3, 1, 0F, -0.5F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.5F, 0.0F); //
        gunModel[504].setRotationPoint(-49.5F, -22F, -5F);

        gunModel[505].addShapeBox(-1F, -11F, -7F, 15, 3, 1, 0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F); //
        gunModel[505].setRotationPoint(36.5F, -22F, -5F);

        gunModel[506].addShapeBox(-1F, -11F, -7F, 15, 3, 1, 0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -1.0F, 0.0F); //
        gunModel[506].setRotationPoint(52F, -22F, -5F);

        gunModel[507].addShapeBox(-1F, -11F, -7F, 22, 3, 1, 0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F); //
        gunModel[507].setRotationPoint(67.5F, -22F, -5F);

        gunModel[508].addShapeBox(-1F, -11F, -7F, 1, 3, 1, 0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F); //
        gunModel[508].setRotationPoint(89.5F, -22F, -5F);

        gunModel[509].addShapeBox(-1F, -11F, -7F, 7, 1, 14, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[509].setRotationPoint(-56F, -39F, 0.5F);

        gunModel[510].addShapeBox(-1F, -11F, -7F, 6, 1, 12, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[510].setRotationPoint(-62F, -39F, 1.5F);

        gunModel[511].addShapeBox(-1F, -11F, -7F, 1, 1, 8, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        gunModel[511].setRotationPoint(-63F, -39F, 3.5F);

        gunModel[512].addShapeBox(-1F, -11F, -7F, 3, 1, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); //
        gunModel[512].setRotationPoint(30.5F, -9F, 3.5F);

        gunModel[513].addShapeBox(-1F, -11F, -7F, 25, 1, 2, 0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); //
        gunModel[513].setRotationPoint(26F, -27F, 13.25F);

        gunModel[514].addShapeBox(-1F, -11F, -7F, 60, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[514].setRotationPoint(72F, -26F, 4.5F);

        gunModel[515].addShapeBox(-1F, -11F, -7F, 60, 2, 6, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F); //
        gunModel[515].setRotationPoint(72F, -24F, 4.5F);

        gunModel[516].addShapeBox(-1F, -11F, -7F, 60, 2, 6, 0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[516].setRotationPoint(72F, -28F, 4.5F);

        gunModel[517].addShapeBox(-1F, -11F, -7F, 3, 1, 15, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        gunModel[517].setRotationPoint(-5F, 6F, 0F);

        gunModel[518].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[518].setRotationPoint(-7F, -44.25F, 3.5F);

        gunModel[519].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[519].setRotationPoint(-3F, -44.25F, 3.5F);

        gunModel[520].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[520].setRotationPoint(1F, -44.25F, 3.5F);

        gunModel[521].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[521].setRotationPoint(5F, -44.25F, 3.5F);

        gunModel[522].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[522].setRotationPoint(9F, -44.25F, 3.5F);

        gunModel[523].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[523].setRotationPoint(13F, -44.25F, 3.5F);

        gunModel[524].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[524].setRotationPoint(17F, -44.25F, 3.5F);

        gunModel[525].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[525].setRotationPoint(21F, -44.25F, 3.5F);

        gunModel[526].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[526].setRotationPoint(25F, -44.25F, 3.5F);

        gunModel[527].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[527].setRotationPoint(29F, -44.25F, 3.5F);

        gunModel[528].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[528].setRotationPoint(33F, -44.25F, 3.5F);

        gunModel[529].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[529].setRotationPoint(37F, -44.25F, 3.5F);

        gunModel[530].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[530].setRotationPoint(41F, -44.25F, 3.5F);

        gunModel[531].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[531].setRotationPoint(45F, -44.25F, 3.5F);

        gunModel[532].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[532].setRotationPoint(49F, -44.25F, 3.5F);

        gunModel[533].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[533].setRotationPoint(53F, -44.25F, 3.5F);

        gunModel[534].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[534].setRotationPoint(57F, -44.25F, 3.5F);

        gunModel[535].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[535].setRotationPoint(61F, -44.25F, 3.5F);

        gunModel[536].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[536].setRotationPoint(65F, -44.25F, 3.5F);

        gunModel[537].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[537].setRotationPoint(69F, -44.25F, 3.5F);

        gunModel[538].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[538].setRotationPoint(73F, -44.25F, 3.5F);

        gunModel[539].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[539].setRotationPoint(77F, -44.25F, 3.5F);

        gunModel[540].addShapeBox(-1F, -11F, -7F, 6, 1, 8, 0F, 0F, 0.5F, -1.25F, -3F, 0.5F, -1.25F, -3F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); //
        gunModel[540].setRotationPoint(81F, -44.25F, 3.5F);

        gunModel[541].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); //
        gunModel[541].setRotationPoint(70F, 8F, 3.5F);

        gunModel[542].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); //
        gunModel[542].setRotationPoint(74F, 8F, 3.5F);

        gunModel[543].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); //
        gunModel[543].setRotationPoint(78F, 8F, 3.5F);

        gunModel[544].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); //
        gunModel[544].setRotationPoint(82F, 8F, 3.5F);

        gunModel[545].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); //
        gunModel[545].setRotationPoint(86F, 8F, 3.5F);

        gunModel[546].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); //
        gunModel[546].setRotationPoint(90F, 8F, 3.5F);

        gunModel[547].addShapeBox(-1F, -11F, -7F, 2, 1, 8, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); //
        gunModel[547].setRotationPoint(94F, 8F, 3.5F);

        gunModel[548].addShapeBox(-1F, -11F, -7F, 22, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F); //
        gunModel[548].setRotationPoint(84F, -4.75F, -2.5F);

        gunModel[549].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); //
        gunModel[549].setRotationPoint(84F, -4.75F, -3.25F);

        gunModel[550].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); //
        gunModel[550].setRotationPoint(88F, -4.75F, -3.25F);

        gunModel[551].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); //
        gunModel[551].setRotationPoint(92F, -4.75F, -3.25F);

        gunModel[552].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); //
        gunModel[552].setRotationPoint(96F, -4.75F, -3.25F);

        gunModel[553].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); //
        gunModel[553].setRotationPoint(100F, -4.75F, -3.25F);

        gunModel[554].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); //
        gunModel[554].setRotationPoint(104F, -4.75F, -3.25F);

        gunModel[555].addShapeBox(-1F, -11F, -7F, 22, 8, 1, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); //
        gunModel[555].setRotationPoint(84F, -4.75F, 17F);

        gunModel[556].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F); //
        gunModel[556].setRotationPoint(84F, -4.75F, 17.75F);

        gunModel[557].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F); //
        gunModel[557].setRotationPoint(88F, -4.75F, 17.75F);

        gunModel[558].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F); //
        gunModel[558].setRotationPoint(92F, -4.75F, 17.75F);

        gunModel[559].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F); //
        gunModel[559].setRotationPoint(96F, -4.75F, 17.75F);

        gunModel[560].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F); //
        gunModel[560].setRotationPoint(100F, -4.75F, 17.75F);

        gunModel[561].addShapeBox(-1F, -11F, -7F, 2, 8, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F); //
        gunModel[561].setRotationPoint(104F, -4.75F, 17.75F);
    }

    private void initdefaultScopeModel_1() {
        defaultScopeModel[0] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); //
        defaultScopeModel[1] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); //
        defaultScopeModel[2] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); //
        defaultScopeModel[3] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); //
        defaultScopeModel[4] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); //
        defaultScopeModel[5] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); //
        defaultScopeModel[6] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); //
        defaultScopeModel[7] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); //
        defaultScopeModel[8] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); //
        defaultScopeModel[9] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); //
        defaultScopeModel[10] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); //
        defaultScopeModel[11] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); //
        defaultScopeModel[12] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); //
        defaultScopeModel[13] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); //
        defaultScopeModel[14] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); //
        defaultScopeModel[15] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); //
        defaultScopeModel[16] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); //
        defaultScopeModel[17] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); //
        defaultScopeModel[18] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); //
        defaultScopeModel[19] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); //
        defaultScopeModel[20] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); //
        defaultScopeModel[21] = new ModelRendererTurbo(this, 449, 337, textureX, textureY); //
        defaultScopeModel[22] = new ModelRendererTurbo(this, 537, 193, textureX, textureY); //
        defaultScopeModel[23] = new ModelRendererTurbo(this, 689, 353, textureX, textureY); //
        defaultScopeModel[24] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); //
        defaultScopeModel[25] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); //
        defaultScopeModel[26] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); //
        defaultScopeModel[27] = new ModelRendererTurbo(this, 745, 353, textureX, textureY); //
        defaultScopeModel[28] = new ModelRendererTurbo(this, 809, 353, textureX, textureY); //
        defaultScopeModel[29] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); //
        defaultScopeModel[30] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); //
        defaultScopeModel[31] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); //
        defaultScopeModel[32] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); //
        defaultScopeModel[33] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); //
        defaultScopeModel[34] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); //
        defaultScopeModel[35] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); //
        defaultScopeModel[36] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); //
        defaultScopeModel[37] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); //
        defaultScopeModel[38] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); //
        defaultScopeModel[39] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); //
        defaultScopeModel[40] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); //
        defaultScopeModel[41] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); //
        defaultScopeModel[42] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); //
        defaultScopeModel[43] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); //
        defaultScopeModel[44] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); //
        defaultScopeModel[45] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); //
        defaultScopeModel[46] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); //

        defaultScopeModel[0].addShapeBox(-1F, -11F, -7F, 2, 7, 4, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); //
        defaultScopeModel[0].setRotationPoint(-29F, -49.75F, 5.5F);

        defaultScopeModel[1].addShapeBox(-1F, -11F, -7F, 1, 4, 4, 0F, -0.5F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -1.75F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); //
        defaultScopeModel[1].setRotationPoint(-29.75F, -48F, 5.5F);

        defaultScopeModel[2].addShapeBox(-1F, -11F, -7F, 1, 2, 2, 0F, -0.5F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); //
        defaultScopeModel[2].setRotationPoint(-30.25F, -46F, 6.5F);

        defaultScopeModel[3].addShapeBox(-1F, -11F, -7F, 1, 2, 4, 0F, 0.0F, 1.25F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F); //
        defaultScopeModel[3].setRotationPoint(-27.25F, -46F, 5.5F);

        defaultScopeModel[4].addShapeBox(-1F, -11F, -7F, 2, 3, 1, 0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F); //
        defaultScopeModel[4].setRotationPoint(-29F, -53F, 5.25F);

        defaultScopeModel[5].addShapeBox(-1F, -11F, -7F, 2, 3, 1, 0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F); //
        defaultScopeModel[5].setRotationPoint(-29F, -53F, 9F);

        defaultScopeModel[6].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); //
        defaultScopeModel[6].setRotationPoint(-29F, -54.5F, 9F);

        defaultScopeModel[7].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F); //
        defaultScopeModel[7].setRotationPoint(-29F, -54.5F, 5F);

        defaultScopeModel[8].addShapeBox(-1F, -11F, -7F, 2, 1, 3, 0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); //
        defaultScopeModel[8].setRotationPoint(-29F, -54.5F, 6F);

        defaultScopeModel[9].addShapeBox(-1F, -11F, -7F, 2, 1, 3, 0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); //
        defaultScopeModel[9].setRotationPoint(-29F, -51F, 6F);

        defaultScopeModel[10].addShapeBox(-1F, -11F, -7F, 2, 1, 2, 0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); //
        defaultScopeModel[10].setRotationPoint(-29F, -55F, 7F);

        defaultScopeModel[11].addShapeBox(-1F, -11F, -7F, 2, 1, 2, 0F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F); //
        defaultScopeModel[11].setRotationPoint(-29F, -55F, 6F);

        defaultScopeModel[12].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.9F, 0.0F, -0.25F, -0.9F, 0.0F, -0.25F, -0.9F, -0.5F, -0.25F, -0.9F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F); //
        defaultScopeModel[12].setRotationPoint(-29F, -55F, 7.25F);

        defaultScopeModel[13].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); //
        defaultScopeModel[13].setRotationPoint(-29F, -51F, 8.25F);

        defaultScopeModel[14].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); //
        defaultScopeModel[14].setRotationPoint(-29F, -51F, 5.75F);

        defaultScopeModel[15].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); //
        defaultScopeModel[15].setRotationPoint(-29F, -54F, 8.25F);

        defaultScopeModel[16].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F); //
        defaultScopeModel[16].setRotationPoint(-29F, -54F, 5.75F);

        defaultScopeModel[17].addShapeBox(-1F, -11F, -7F, 8, 4, 2, 0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        defaultScopeModel[17].setRotationPoint(78.5F, -53F, 3F);

        defaultScopeModel[18].addShapeBox(-1F, -11F, -7F, 8, 2, 9, 0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[18].setRotationPoint(78.5F, -49F, 3F);

        defaultScopeModel[19].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        defaultScopeModel[19].setRotationPoint(78.5F, -54F, 3F);

        defaultScopeModel[20].addShapeBox(-1F, -11F, -7F, 5, 1, 2, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        defaultScopeModel[20].setRotationPoint(79F, -54.5F, 3F);

        defaultScopeModel[21].addShapeBox(-1F, -11F, -7F, 9, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F); //
        defaultScopeModel[21].setRotationPoint(78.5F, -47F, 3F);

        defaultScopeModel[22].addShapeBox(-1F, -11F, -7F, 9, 1, 8, 0F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[22].setRotationPoint(78.5F, -46.5F, 3.5F);

        defaultScopeModel[23].addShapeBox(-1F, -11F, -7F, 9, 1, 9, 0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[23].setRotationPoint(78.5F, -45.5F, 3F);

        defaultScopeModel[24].addShapeBox(-1F, -11F, -7F, 8, 4, 2, 0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        defaultScopeModel[24].setRotationPoint(78.5F, -53F, 10.5F);

        defaultScopeModel[25].addShapeBox(-1F, -11F, -7F, 6, 1, 2, 0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        defaultScopeModel[25].setRotationPoint(78.5F, -54F, 10.5F);

        defaultScopeModel[26].addShapeBox(-1F, -11F, -7F, 5, 1, 2, 0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        defaultScopeModel[26].setRotationPoint(79F, -54.5F, 10.5F);

        defaultScopeModel[27].addShapeBox(-1F, -11F, -7F, 9, 1, 9, 0F, 0.0F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); //
        defaultScopeModel[27].setRotationPoint(78.5F, -44.5F, 3F);

        defaultScopeModel[28].addShapeBox(-1F, -11F, -7F, 9, 1, 10, 0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[28].setRotationPoint(78.5F, -45F, 2F);

        defaultScopeModel[29].addShapeBox(-1F, -11F, -7F, 8, 2, 1, 0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[29].setRotationPoint(78.5F, -48F, 2F);

        defaultScopeModel[30].addShapeBox(-1F, -11F, -7F, 8, 1, 2, 0F, 0.0F, 0.0F, -1.5F, 1.25F, 0.0F, -1.5F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[30].setRotationPoint(78.5F, -46F, 1F);

        defaultScopeModel[31].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        defaultScopeModel[31].setRotationPoint(79.5F, -46F, 11F);

        defaultScopeModel[32].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F); //
        defaultScopeModel[32].setRotationPoint(79.5F, -45.5F, 11F);

        defaultScopeModel[33].addShapeBox(-1F, -11F, -7F, 2, 1, 1, 0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); //
        defaultScopeModel[33].setRotationPoint(79.5F, -46.5F, 11F);

        defaultScopeModel[34].addShapeBox(-1F, -11F, -7F, 8, 1, 1, 0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[34].setRotationPoint(78.5F, -50F, 4.5F);

        defaultScopeModel[35].addShapeBox(-1F, -11F, -7F, 8, 1, 1, 0F, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[35].setRotationPoint(78.5F, -50F, 9.5F);

        defaultScopeModel[36].addShapeBox(-1F, -11F, -7F, 9, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[36].setRotationPoint(78.5F, -45.5F, 2F);

        defaultScopeModel[37].addShapeBox(-1F, -11F, -7F, 1, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[37].setRotationPoint(82F, -50F, 6F);

        defaultScopeModel[38].addShapeBox(-1F, -11F, -7F, 2, 1, 2, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F); //
        defaultScopeModel[38].setRotationPoint(81.4F, -51F, 6.5F);

        defaultScopeModel[39].addShapeBox(-1F, -11F, -7F, 1, 1, 3, 0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F); //
        defaultScopeModel[39].setRotationPoint(81F, -50F, 6F);

        defaultScopeModel[40].addShapeBox(-1F, -11F, -7F, 1, 1, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[40].setRotationPoint(83F, -50F, 6F);

        defaultScopeModel[41].addShapeBox(-1F, -11F, -7F, 1, 2, 1, 0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F); //
        defaultScopeModel[41].setRotationPoint(82.15F, -53.5F, 7F);

        defaultScopeModel[42].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); //
        defaultScopeModel[42].setRotationPoint(82.05F, -53.75F, 7F);

        defaultScopeModel[43].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); //
        defaultScopeModel[43].setRotationPoint(-28.85F, -52.5F, 5.1F);

        defaultScopeModel[44].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F); //
        defaultScopeModel[44].setRotationPoint(-28.85F, -52.5F, 8.9F);

        defaultScopeModel[45].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[45].setRotationPoint(86.75F, -47F, 2F);

        defaultScopeModel[46].addShapeBox(-1F, -11F, -7F, 1, 1, 1, 0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        defaultScopeModel[46].setRotationPoint(86.75F, -48F, 2F);
    }

    private void initammoModel_1() {
        ammoModel[0] = new ModelRendererTurbo(this, 601, 177, textureX, textureY); //
        ammoModel[1] = new ModelRendererTurbo(this, 657, 193, textureX, textureY); //
        ammoModel[2] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); //
        ammoModel[3] = new ModelRendererTurbo(this, 305, 377, textureX, textureY); //
        ammoModel[4] = new ModelRendererTurbo(this, 889, 377, textureX, textureY); //
        ammoModel[5] = new ModelRendererTurbo(this, 977, 377, textureX, textureY); //
        ammoModel[6] = new ModelRendererTurbo(this, 161, 385, textureX, textureY); //
        ammoModel[7] = new ModelRendererTurbo(this, 193, 385, textureX, textureY); //
        ammoModel[8] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); //
        ammoModel[9] = new ModelRendererTurbo(this, 585, 385, textureX, textureY); //
        ammoModel[10] = new ModelRendererTurbo(this, 617, 385, textureX, textureY); //
        ammoModel[11] = new ModelRendererTurbo(this, 953, 369, textureX, textureY); //
        ammoModel[12] = new ModelRendererTurbo(this, 329, 385, textureX, textureY); //
        ammoModel[13] = new ModelRendererTurbo(this, 649, 385, textureX, textureY); //
        ammoModel[14] = new ModelRendererTurbo(this, 681, 385, textureX, textureY); //
        ammoModel[15] = new ModelRendererTurbo(this, 769, 385, textureX, textureY); //
        ammoModel[16] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); //
        ammoModel[17] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); //
        ammoModel[18] = new ModelRendererTurbo(this, 1001, 305, textureX, textureY); //
        ammoModel[19] = new ModelRendererTurbo(this, 929, 329, textureX, textureY); //
        ammoModel[20] = new ModelRendererTurbo(this, 801, 385, textureX, textureY); //
        ammoModel[21] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); //
        ammoModel[22] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); //
        ammoModel[23] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); //
        ammoModel[24] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); //
        ammoModel[25] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); //
        ammoModel[26] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); //
        ammoModel[27] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); //
        ammoModel[28] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); //
        ammoModel[29] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); //
        ammoModel[30] = new ModelRendererTurbo(this, 49, 393, textureX, textureY); //
        ammoModel[31] = new ModelRendererTurbo(this, 97, 393, textureX, textureY); //
        ammoModel[32] = new ModelRendererTurbo(this, 129, 393, textureX, textureY); //

        ammoModel[0].addShapeBox(-1F, -11F, -7F, 1, 6, 10, 0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.85F, 0.0F, 1.25F, 0.85F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, -1.0F, 0.0F, 3.25F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F); //
        ammoModel[0].setRotationPoint(-55F, 39F, 2.5F);

        ammoModel[1].addShapeBox(-1F, -11F, -7F, 4, 6, 10, 0F, 1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.25F, 0.61F, 0.0F, 1.25F, -0.7F, 0.0F, 1.25F, -0.7F, 0.0F, -0.25F, 0.61F, 0.0F); //
        ammoModel[1].setRotationPoint(-51F, 31F, 2.5F);

        ammoModel[2].addShapeBox(-1F, -11F, -7F, 4, 6, 10, 0F, 2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); //
        ammoModel[2].setRotationPoint(-52.25F, 25F, 2.5F);

        ammoModel[3].addShapeBox(-1F, -11F, -7F, 4, 6, 10, 0F, 2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); //
        ammoModel[3].setRotationPoint(-53.25F, 19F, 2.5F);

        ammoModel[4].addShapeBox(-1F, -11F, -7F, 4, 6, 10, 0F, 1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); //
        ammoModel[4].setRotationPoint(-54.5F, 13F, 2.5F);

        ammoModel[5].addShapeBox(-1F, -11F, -7F, 5, 11, 10, 0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        ammoModel[5].setRotationPoint(-56F, 2F, 2.5F);

        ammoModel[6].addShapeBox(-1F, -11F, -7F, 3, 6, 10, 0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); //
        ammoModel[6].setRotationPoint(-44.25F, 25F, 2.5F);

        ammoModel[7].addShapeBox(-1F, -11F, -7F, 3, 6, 10, 0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); //
        ammoModel[7].setRotationPoint(-45.25F, 19F, 2.5F);

        ammoModel[8].addShapeBox(-1F, -11F, -7F, 3, 6, 10, 0F, 1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); //
        ammoModel[8].setRotationPoint(-46.5F, 13F, 2.5F);

        ammoModel[9].addShapeBox(-1F, -11F, -7F, 4, 11, 10, 0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        ammoModel[9].setRotationPoint(-48F, 2F, 2.5F);

        ammoModel[10].addShapeBox(-1F, -11F, -7F, 3, 4, 10, 0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 0.35F, 0.0F); //
        ammoModel[10].setRotationPoint(-42.75F, 31F, 2.5F);

        ammoModel[11].addShapeBox(-1F, -11F, -7F, 2, 6, 10, 0F, 2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, -0.85F, 0.0F, 1.25F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F); //
        ammoModel[11].setRotationPoint(-56F, 33F, 2.5F);

        ammoModel[12].addShapeBox(-1F, -11F, -7F, 2, 6, 10, 0F, 2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); //
        ammoModel[12].setRotationPoint(-57.25F, 27F, 2.5F);

        ammoModel[13].addShapeBox(-1F, -11F, -7F, 2, 6, 10, 0F, 2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F); //
        ammoModel[13].setRotationPoint(-58.25F, 21F, 2.5F);

        ammoModel[14].addShapeBox(-1F, -11F, -7F, 2, 6, 10, 0F, 2.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F); //
        ammoModel[14].setRotationPoint(-59.5F, 15F, 2.5F);

        ammoModel[15].addShapeBox(-1F, -11F, -7F, 3, 13, 10, 0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); //
        ammoModel[15].setRotationPoint(-61F, 2F, 2.5F);

        ammoModel[16].addShapeBox(-1F, -11F, -7F, 1, 9, 10, 0F, 1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F); //
        ammoModel[16].setRotationPoint(-61F, 33F, 2.5F);

        ammoModel[17].addShapeBox(-1F, -11F, -7F, 1, 6, 10, 0F, 2.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); //
        ammoModel[17].setRotationPoint(-62.25F, 27F, 2.5F);

        ammoModel[18].addShapeBox(-1F, -11F, -7F, 1, 6, 10, 0F, 2.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); //
        ammoModel[18].setRotationPoint(-63.25F, 21F, 2.5F);

        ammoModel[19].addShapeBox(-1F, -11F, -7F, 1, 6, 10, 0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); //
        ammoModel[19].setRotationPoint(-64.5F, 15F, 2.5F);

        ammoModel[20].addShapeBox(-1F, -11F, -7F, 2, 13, 10, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); //
        ammoModel[20].setRotationPoint(-66F, 2F, 2.5F);

        ammoModel[21].addShapeBox(-1F, -11F, -7F, 1, 3, 10, 0F, 2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.75F, 0.0F); //
        ammoModel[21].setRotationPoint(-57.25F, 42F, 2.5F);

        ammoModel[22].addShapeBox(-1F, -11F, -7F, 1, 9, 5, 0F, 2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); //
        ammoModel[22].setRotationPoint(-63F, 33F, 5F);

        ammoModel[23].addShapeBox(-1F, -11F, -7F, 1, 6, 5, 0F, 2.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F); //
        ammoModel[23].setRotationPoint(-64.25F, 27F, 5F);

        ammoModel[24].addShapeBox(-1F, -11F, -7F, 1, 6, 5, 0F, 2.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F); //
        ammoModel[24].setRotationPoint(-65.25F, 21F, 5F);

        ammoModel[25].addShapeBox(-1F, -11F, -7F, 1, 6, 5, 0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F); //
        ammoModel[25].setRotationPoint(-66.5F, 15F, 5F);

        ammoModel[26].addShapeBox(-1F, -11F, -7F, 2, 13, 5, 0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); //
        ammoModel[26].setRotationPoint(-68F, 2F, 5F);

        ammoModel[27].addShapeBox(-1F, -11F, -7F, 1, 3, 5, 0F, 2.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 1.0F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F); //
        ammoModel[27].setRotationPoint(-59.25F, 42F, 5F);

        ammoModel[28].addShapeBox(-1F, -11F, -7F, 0, 11, 7, 0F, 0.0F, -0.05F, 0.0F, 0.75F, -0.05F, 0.0F, 0.75F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        ammoModel[28].setRotationPoint(-45F, 2F, 4F);

        ammoModel[29].addShapeBox(-1F, -11F, -7F, 15, 32, 8, 0F, 1.0F, -0.05F, 0.0F, 1.0F, -0.05F, 0.0F, 1.0F, -0.05F, 0.0F, 1.0F, -0.05F, 0.0F, -2.0F, 0.05F, 0.0F, 6.25F, 0.05F, 0.0F, 6.25F, 0.05F, 0.0F, -2.0F, 0.05F, 0.0F); //
        ammoModel[29].setRotationPoint(-64F, 2F, 3.5F);

        ammoModel[30].addShapeBox(-1F, -11F, -7F, 15, 7, 8, 0F, -2.0F, -0.05F, 0.0F, 6.25F, -0.05F, 0.0F, 6.25F, -0.05F, 0.0F, -2.0F, -0.05F, 0.0F, -7.0F, 4.5F, 0.0F, 8.25F, 0.5F, 0.0F, 8.25F, 0.5F, 0.0F, -7.0F, 4.5F, 0.0F); //
        ammoModel[30].setRotationPoint(-64F, 34F, 3.5F);

        ammoModel[31].addShapeBox(-1F, -11F, -7F, 4, 6, 10, 0F, 1.3F, -0.6F, 0.0F, -0.25F, 0.65F, 0.0F, -0.25F, 0.65F, 0.0F, 1.3F, -0.6F, 0.0F, -0.75F, 0.61F, 0.0F, 1.75F, -0.7F, 0.0F, 1.75F, -0.7F, 0.0F, -0.75F, 0.61F, 0.0F); //
        ammoModel[31].setRotationPoint(-49.5F, 37F, 2.5F);

        ammoModel[32].addShapeBox(-1F, -11F, -7F, 3, 7, 10, 0F, 0.0F, -0.3F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, -0.3F, 0.0F, -2.5F, -0.4F, 0.0F, 2.75F, -1.25F, 0.0F, 2.75F, -1.25F, 0.0F, -2.5F, -0.4F, 0.0F); //
        ammoModel[32].setRotationPoint(-43.25F, 35F, 2.5F);
    }

    private void initslideModel_1() {
        slideModel[0] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); //
        slideModel[1] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); //
        slideModel[2] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); //
        slideModel[3] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); //
        slideModel[4] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); //
        slideModel[5] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); //
        slideModel[6] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); //
        slideModel[7] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); //
        slideModel[8] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); //
        slideModel[9] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); //
        slideModel[10] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); //
        slideModel[11] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); //
        slideModel[12] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); //
        slideModel[13] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); //
        slideModel[14] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); //
        slideModel[15] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); //
        slideModel[16] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); //

        slideModel[0].addShapeBox(-1F, -11F, -7F, 7, 8, 4, 0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F); //
        slideModel[0].setRotationPoint(65F, -33.5F, 16.25F);

        slideModel[1].addShapeBox(-1F, -11F, -7F, 2, 8, 2, 0F, 0.0F, 0.15F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 1.0F); //
        slideModel[1].setRotationPoint(72F, -33.5F, 18.25F);

        slideModel[2].addShapeBox(-1F, -11F, -7F, 1, 6, 1, 0F, 0.0F, -0.5F, 1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -0.5F, 0.0F, -0.5F, 0.0F); //
        slideModel[2].setRotationPoint(74F, -32.5F, 19.25F);

        slideModel[3].addShapeBox(-1F, -11F, -7F, 1, 8, 3, 0F, -0.25F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 2.0F, 0.5F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 0.5F, -1.0F, 0.0F); //
        slideModel[3].setRotationPoint(64F, -33.5F, 16.25F);

        slideModel[4].addShapeBox(-1F, -11F, -7F, 2, 5, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        slideModel[4].setRotationPoint(61.5F, -32F, 16.25F);

        slideModel[5].addShapeBox(-1F, -11F, -7F, 2, 5, 1, 0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F); //
        slideModel[5].setRotationPoint(59.5F, -32F, 18.25F);

        slideModel[6].addShapeBox(-1F, -11F, -7F, 3, 5, 2, 0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F); //
        slideModel[6].setRotationPoint(56.5F, -32F, 17.5F);

        slideModel[7].addShapeBox(-1F, -11F, -7F, 6, 5, 2, 0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 1.25F, 1.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 1.25F, 1.0F); //
        slideModel[7].setRotationPoint(50.5F, -32F, 18F);

        slideModel[8].addShapeBox(-1F, -11F, -7F, 1, 5, 3, 0F, 0.0F, 1.5F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.5F, 0.5F); //
        slideModel[8].setRotationPoint(50F, -32F, 18F);

        slideModel[9].addShapeBox(-1F, -11F, -7F, 1, 5, 2, 0F, 0.0F, 1.0F, 1.5F, 0.0F, 1.5F, 1.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 1.5F, 0.0F, 1.5F, 1.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, -1.0F); //
        slideModel[9].setRotationPoint(49F, -32F, 19.5F);

        slideModel[10].addShapeBox(-1F, -11F, -7F, 1, 4, 2, 0F, 0.5F, 0.5F, 2.0F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.0F, 0.5F, 0.5F, -2.0F, 0.5F, 0.5F, 2.0F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.0F, 0.5F, 0.5F, -2.0F); //
        slideModel[10].setRotationPoint(48F, -31.5F, 18.5F);

        slideModel[11].addShapeBox(-1F, -11F, -7F, 11, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F); //
        slideModel[11].setRotationPoint(48.5F, -32F, 16.25F);

        slideModel[12].addShapeBox(-1F, -11F, -7F, 1, 5, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F); //
        slideModel[12].setRotationPoint(47.5F, -32F, 16.25F);

        slideModel[13].addShapeBox(-1F, -11F, -7F, 2, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F); //
        slideModel[13].setRotationPoint(59.5F, -32F, 16.25F);

        slideModel[14].addShapeBox(-1F, -11F, -7F, 3, 5, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        slideModel[14].setRotationPoint(63.5F, -32F, 16.25F);

        slideModel[15].addShapeBox(-1F, -11F, -7F, 3, 2, 3, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); //
        slideModel[15].setRotationPoint(63.5F, -32F, 13.25F);

        slideModel[16].addShapeBox(-1F, -11F, -7F, 2, 8, 2, 0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F); //
        slideModel[16].setRotationPoint(72F, -33.5F, 16.25F);
    }
}