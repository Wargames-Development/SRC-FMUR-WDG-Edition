package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;


public class ModelDS3Decoy
        extends ModelBase {
    public ModelRendererTurbo[] ds3decoyModel;
    int textureX = 256;
    int textureY = 256;

    public ModelDS3Decoy() {
        ds3decoyModel = new ModelRendererTurbo[90];
        ds3decoyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
        ds3decoyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY);
        ds3decoyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY);
        ds3decoyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY);
        ds3decoyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
        ds3decoyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY);
        ds3decoyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
        ds3decoyModel[7] = new ModelRendererTurbo(this, 209, 17, textureX, textureY);
        ds3decoyModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY);
        ds3decoyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY);
        ds3decoyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY);
        ds3decoyModel[11] = new ModelRendererTurbo(this, 161, 9, textureX, textureY);
        ds3decoyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY);
        ds3decoyModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY);
        ds3decoyModel[14] = new ModelRendererTurbo(this, 25, 9, textureX, textureY);
        ds3decoyModel[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY);
        ds3decoyModel[16] = new ModelRendererTurbo(this, 129, 17, textureX, textureY);
        ds3decoyModel[17] = new ModelRendererTurbo(this, 209, 17, textureX, textureY);
        ds3decoyModel[18] = new ModelRendererTurbo(this, 233, 17, textureX, textureY);
        ds3decoyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY);
        ds3decoyModel[20] = new ModelRendererTurbo(this, 17, 25, textureX, textureY);
        ds3decoyModel[21] = new ModelRendererTurbo(this, 153, 25, textureX, textureY);
        ds3decoyModel[22] = new ModelRendererTurbo(this, 169, 25, textureX, textureY);
        ds3decoyModel[23] = new ModelRendererTurbo(this, 185, 25, textureX, textureY);
        ds3decoyModel[24] = new ModelRendererTurbo(this, 185, 1, textureX, textureY);
        ds3decoyModel[25] = new ModelRendererTurbo(this, 201, 25, textureX, textureY);
        ds3decoyModel[26] = new ModelRendererTurbo(this, 233, 25, textureX, textureY);
        ds3decoyModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
        ds3decoyModel[28] = new ModelRendererTurbo(this, 81, 33, textureX, textureY);
        ds3decoyModel[29] = new ModelRendererTurbo(this, 81, 1, textureX, textureY);
        ds3decoyModel[30] = new ModelRendererTurbo(this, 1, 33, textureX, textureY);
        ds3decoyModel[31] = new ModelRendererTurbo(this, 81, 33, textureX, textureY);
        ds3decoyModel[32] = new ModelRendererTurbo(this, 145, 33, textureX, textureY);
        ds3decoyModel[33] = new ModelRendererTurbo(this, 177, 33, textureX, textureY);
        ds3decoyModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY);
        ds3decoyModel[35] = new ModelRendererTurbo(this, 33, 41, textureX, textureY);
        ds3decoyModel[36] = new ModelRendererTurbo(this, 65, 41, textureX, textureY);
        ds3decoyModel[37] = new ModelRendererTurbo(this, 145, 41, textureX, textureY);
        ds3decoyModel[38] = new ModelRendererTurbo(this, 241, 17, textureX, textureY);
        ds3decoyModel[39] = new ModelRendererTurbo(this, 97, 41, textureX, textureY);
        ds3decoyModel[40] = new ModelRendererTurbo(this, 209, 25, textureX, textureY);
        ds3decoyModel[41] = new ModelRendererTurbo(this, 193, 41, textureX, textureY);
        ds3decoyModel[42] = new ModelRendererTurbo(this, 209, 41, textureX, textureY);
        ds3decoyModel[43] = new ModelRendererTurbo(this, 217, 41, textureX, textureY);
        ds3decoyModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY);
        ds3decoyModel[45] = new ModelRendererTurbo(this, 233, 41, textureX, textureY);
        ds3decoyModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY);
        ds3decoyModel[47] = new ModelRendererTurbo(this, 145, 65, textureX, textureY);
        ds3decoyModel[48] = new ModelRendererTurbo(this, 1, 89, textureX, textureY);
        ds3decoyModel[49] = new ModelRendererTurbo(this, 97, 1, textureX, textureY);
        ds3decoyModel[50] = new ModelRendererTurbo(this, 129, 1, textureX, textureY);
        ds3decoyModel[51] = new ModelRendererTurbo(this, 33, 89, textureX, textureY);
        ds3decoyModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY);
        ds3decoyModel[53] = new ModelRendererTurbo(this, 49, 49, textureX, textureY);
        ds3decoyModel[54] = new ModelRendererTurbo(this, 81, 105, textureX, textureY);
        ds3decoyModel[55] = new ModelRendererTurbo(this, 129, 105, textureX, textureY);
        ds3decoyModel[56] = new ModelRendererTurbo(this, 209, 1, textureX, textureY);
        ds3decoyModel[57] = new ModelRendererTurbo(this, 161, 9, textureX, textureY);
        ds3decoyModel[58] = new ModelRendererTurbo(this, 65, 49, textureX, textureY);
        ds3decoyModel[59] = new ModelRendererTurbo(this, 65, 57, textureX, textureY);
        ds3decoyModel[60] = new ModelRendererTurbo(this, 193, 57, textureX, textureY);
        ds3decoyModel[61] = new ModelRendererTurbo(this, 209, 57, textureX, textureY);
        ds3decoyModel[62] = new ModelRendererTurbo(this, 145, 57, textureX, textureY);
        ds3decoyModel[63] = new ModelRendererTurbo(this, 225, 73, textureX, textureY);
        ds3decoyModel[64] = new ModelRendererTurbo(this, 193, 81, textureX, textureY);
        ds3decoyModel[65] = new ModelRendererTurbo(this, 209, 81, textureX, textureY);
        ds3decoyModel[66] = new ModelRendererTurbo(this, 249, 9, textureX, textureY);
        ds3decoyModel[67] = new ModelRendererTurbo(this, 97, 17, textureX, textureY);
        ds3decoyModel[68] = new ModelRendererTurbo(this, 249, 17, textureX, textureY);
        ds3decoyModel[69] = new ModelRendererTurbo(this, 249, 33, textureX, textureY);
        ds3decoyModel[70] = new ModelRendererTurbo(this, 105, 41, textureX, textureY);
        ds3decoyModel[71] = new ModelRendererTurbo(this, 145, 41, textureX, textureY);
        ds3decoyModel[72] = new ModelRendererTurbo(this, 185, 41, textureX, textureY);
        ds3decoyModel[73] = new ModelRendererTurbo(this, 201, 41, textureX, textureY);
        ds3decoyModel[74] = new ModelRendererTurbo(this, 249, 41, textureX, textureY);
        ds3decoyModel[75] = new ModelRendererTurbo(this, 225, 49, textureX, textureY);
        ds3decoyModel[76] = new ModelRendererTurbo(this, 249, 49, textureX, textureY);
        ds3decoyModel[77] = new ModelRendererTurbo(this, 97, 57, textureX, textureY);
        ds3decoyModel[78] = new ModelRendererTurbo(this, 33, 25, textureX, textureY);
        ds3decoyModel[79] = new ModelRendererTurbo(this, 33, 33, textureX, textureY);
        ds3decoyModel[80] = new ModelRendererTurbo(this, 33, 49, textureX, textureY);
        ds3decoyModel[81] = new ModelRendererTurbo(this, 33, 57, textureX, textureY);
        ds3decoyModel[82] = new ModelRendererTurbo(this, 105, 57, textureX, textureY);
        ds3decoyModel[83] = new ModelRendererTurbo(this, 177, 57, textureX, textureY);
        ds3decoyModel[84] = new ModelRendererTurbo(this, 185, 57, textureX, textureY);
        ds3decoyModel[85] = new ModelRendererTurbo(this, 225, 57, textureX, textureY);
        ds3decoyModel[86] = new ModelRendererTurbo(this, 249, 57, textureX, textureY);
        ds3decoyModel[87] = new ModelRendererTurbo(this, 33, 65, textureX, textureY);
        ds3decoyModel[88] = new ModelRendererTurbo(this, 225, 65, textureX, textureY);
        ds3decoyModel[89] = new ModelRendererTurbo(this, 249, 65, textureX, textureY);

        ds3decoyModel[0].addShapeBox(-1.0F, 1.0F, -17.0F, 18, 2, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[0].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[0].rotateAngleX = -3.1415927F;

        ds3decoyModel[1].addShapeBox(2.0F, -1.0F, -3.0F, 12, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[1].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[1].rotateAngleX = -3.1415927F;

        ds3decoyModel[2].addShapeBox(14.0F, -1.0F, -3.0F, 3, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[2].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[2].rotateAngleX = -3.1415927F;

        ds3decoyModel[3].addShapeBox(-1.0F, -1.0F, -3.0F, 3, 2, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[3].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[3].rotateAngleX = -3.1415927F;

        ds3decoyModel[4].addShapeBox(15.0F, -1.0F, -10.0F, 1, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[4].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[4].rotateAngleX = -3.1415927F;

        ds3decoyModel[5].addShapeBox(2.5F, -2.0F, -2.0F, 11, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[5].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[5].rotateAngleX = -3.1415927F;

        ds3decoyModel[6].addShapeBox(1.5F, -2.0F, -2.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
        ds3decoyModel[6].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[6].rotateAngleX = -3.1415927F;

        ds3decoyModel[7].addShapeBox(13.5F, -2.0F, -2.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[7].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[7].rotateAngleX = -3.1415927F;

        ds3decoyModel[8].addShapeBox(2.5F, -2.0F, 14.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[8].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[8].rotateAngleX = -3.1415927F;

        ds3decoyModel[9].addShapeBox(2.5F, -2.0F, 6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[9].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[9].rotateAngleX = -3.1415927F;

        ds3decoyModel[10].addShapeBox(12.5F, -2.0F, 6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[10].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[10].rotateAngleX = -3.1415927F;

        ds3decoyModel[11].addShapeBox(3.5F, -2.2F, 6.0F, 9, 1, 8, 0.0F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[11].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[11].rotateAngleX = -3.1415927F;

        ds3decoyModel[12].addShapeBox(3.0F, -3.0F, 3.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[12].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[12].rotateAngleX = -3.1415927F;

        ds3decoyModel[13].addShapeBox(3.0F, -3.0F, 1.0F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[13].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[13].rotateAngleX = -3.1415927F;

        ds3decoyModel[14].addShapeBox(3.0F, -3.0F, -1.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[14].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[14].rotateAngleX = -3.1415927F;

        ds3decoyModel[15].addShapeBox(5.5F, -3.0F, 3.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[15].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[15].rotateAngleX = -3.1415927F;

        ds3decoyModel[16].addShapeBox(5.5F, -3.0F, 1.0F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[16].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[16].rotateAngleX = -3.1415927F;

        ds3decoyModel[17].addShapeBox(5.5F, -3.0F, -1.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[17].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[17].rotateAngleX = -3.1415927F;

        ds3decoyModel[18].addShapeBox(8.0F, -3.0F, 3.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[18].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[18].rotateAngleX = -3.1415927F;

        ds3decoyModel[19].addShapeBox(8.0F, -3.0F, 1.0F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[19].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[19].rotateAngleX = -3.1415927F;

        ds3decoyModel[20].addShapeBox(8.0F, -3.0F, -1.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[20].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[20].rotateAngleX = -3.1415927F;

        ds3decoyModel[21].addShapeBox(10.5F, -3.0F, 3.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[21].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[21].rotateAngleX = -3.1415927F;

        ds3decoyModel[22].addShapeBox(10.5F, -3.0F, 1.0F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[22].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[22].rotateAngleX = -3.1415927F;

        ds3decoyModel[23].addShapeBox(10.5F, -3.0F, -1.5F, 2, 1, 2, 0.0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[23].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[23].rotateAngleX = -3.1415927F;

        ds3decoyModel[24].addShapeBox(12.75F, -3.0F, 10.5F, 2, 1, 3, 0.0F, -0.3F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[24].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[24].rotateAngleX = -3.1415927F;

        ds3decoyModel[25].addShapeBox(12.75F, -3.0F, 7.0F, 2, 1, 3, 0.0F, -0.3F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[25].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[25].rotateAngleX = -3.1415927F;

        ds3decoyModel[26].addShapeBox(12.75F, -3.0F, 3.5F, 2, 1, 3, 0.0F, -0.3F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.1F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.6F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
        ds3decoyModel[26].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[26].rotateAngleX = -3.1415927F;

        ds3decoyModel[27].addShapeBox(1.0F, -1.0F, 17.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
        ds3decoyModel[27].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[27].rotateAngleX = -3.1415927F;

        ds3decoyModel[28].addShapeBox(1.0F, 3.0F, -16.0F, 14, 29, 35, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[28].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[28].rotateAngleX = -3.1415927F;

        ds3decoyModel[29].addShapeBox(14.0F, -1.0F, 17.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[29].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[29].rotateAngleX = -3.1415927F;

        ds3decoyModel[30].addShapeBox(1.0F, -2.0F, -6.0F, 13, 2, 1, 0.0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[30].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[30].rotateAngleX = -3.1415927F;

        ds3decoyModel[31].addShapeBox(1.0F, -2.0F, -7.2F, 13, 2, 1, 0.0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[31].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[31].rotateAngleX = -3.1415927F;

        ds3decoyModel[32].addShapeBox(1.0F, -2.0F, -8.4F, 13, 2, 1, 0.0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[32].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[32].rotateAngleX = -3.1415927F;

        ds3decoyModel[33].addShapeBox(1.0F, -2.0F, -9.6F, 13, 2, 1, 0.0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[33].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[33].rotateAngleX = -3.1415927F;

        ds3decoyModel[34].addShapeBox(1.0F, -2.0F, -10.8F, 13, 2, 1, 0.0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[34].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[34].rotateAngleX = -3.1415927F;

        ds3decoyModel[35].addShapeBox(1.0F, -2.0F, -12.0F, 13, 2, 1, 0.0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[35].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[35].rotateAngleX = -3.1415927F;

        ds3decoyModel[36].addShapeBox(1.0F, -2.0F, -13.2F, 13, 2, 1, 0.0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[36].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[36].rotateAngleX = -3.1415927F;

        ds3decoyModel[37].addShapeBox(1.0F, 0.0F, -13.0F, 13, 1, 8, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[37].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[37].rotateAngleX = -3.1415927F;

        ds3decoyModel[38].addShapeBox(3.0F, -6.0F, 15.0F, 1, 5, 4, 0.0F, 0.0F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[38].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[38].rotateAngleX = -3.1415927F;

        ds3decoyModel[39].addShapeBox(11.5F, -6.0F, 15.0F, 1, 5, 4, 0.0F, 0.0F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[39].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[39].rotateAngleX = -3.1415927F;

        ds3decoyModel[40].addShapeBox(4.5F, -6.0F, 17.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
        ds3decoyModel[40].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[40].rotateAngleX = -3.1415927F;

        ds3decoyModel[41].addShapeBox(3.0F, -4.0F, -17.0F, 1, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[41].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[41].rotateAngleX = -3.1415927F;

        ds3decoyModel[42].addShapeBox(11.5F, -4.0F, -17.0F, 1, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[42].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[42].rotateAngleX = -3.1415927F;

        ds3decoyModel[43].addShapeBox(4.5F, -4.0F, -16.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
        ds3decoyModel[43].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[43].rotateAngleX = -3.1415927F;

        ds3decoyModel[44].addShapeBox(-1.0F, 3.0F, -17.0F, 2, 2, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[44].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[44].rotateAngleX = -3.1415927F;

        ds3decoyModel[45].addShapeBox(-1.0F, 5.0F, -11.0F, 2, 20, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[45].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[45].rotateAngleX = -3.1415927F;

        ds3decoyModel[46].addShapeBox(-1.0F, 5.0F, 10.0F, 2, 20, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[46].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[46].rotateAngleX = -3.1415927F;

        ds3decoyModel[47].addShapeBox(-1.0F, 25.0F, -17.0F, 2, 2, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[47].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[47].rotateAngleX = -3.1415927F;

        ds3decoyModel[48].addShapeBox(-1.0F, 27.0F, -14.0F, 2, 3, 31, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[48].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[48].rotateAngleX = -3.1415927F;

        ds3decoyModel[49].addShapeBox(-1.0F, 27.0F, 17.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
        ds3decoyModel[49].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[49].rotateAngleX = -3.1415927F;

        ds3decoyModel[50].addShapeBox(-1.0F, 27.0F, -15.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[50].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[50].rotateAngleX = -3.1415927F;

        ds3decoyModel[51].addShapeBox(15.0F, 3.0F, -17.0F, 2, 2, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        ds3decoyModel[51].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[51].rotateAngleX = -3.1415927F;

        ds3decoyModel[52].addShapeBox(15.0F, 5.0F, -11.0F, 2, 20, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
        ds3decoyModel[52].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[52].rotateAngleX = -3.1415927F;

        ds3decoyModel[53].addShapeBox(15.0F, 5.0F, 10.0F, 2, 20, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
        ds3decoyModel[53].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[53].rotateAngleX = -3.1415927F;

        ds3decoyModel[54].addShapeBox(15.0F, 25.0F, -17.0F, 2, 2, 37, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[54].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[54].rotateAngleX = -3.1415927F;

        ds3decoyModel[55].addShapeBox(15.0F, 27.0F, -14.0F, 2, 3, 31, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        ds3decoyModel[55].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[55].rotateAngleX = -3.1415927F;

        ds3decoyModel[56].addShapeBox(15.0F, 27.0F, 17.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
        ds3decoyModel[56].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[56].rotateAngleX = -3.1415927F;

        ds3decoyModel[57].addShapeBox(15.0F, 27.0F, -15.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[57].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[57].rotateAngleX = -3.1415927F;

        ds3decoyModel[58].addShapeBox(1.0F, 3.0F, -17.0F, 14, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[58].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[58].rotateAngleX = -3.1415927F;

        ds3decoyModel[59].addShapeBox(1.0F, 24.0F, -17.0F, 14, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[59].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[59].rotateAngleX = -3.1415927F;

        ds3decoyModel[60].addShapeBox(1.0F, 7.0F, -17.0F, 3, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[60].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[60].rotateAngleX = -3.1415927F;

        ds3decoyModel[61].addShapeBox(12.0F, 7.0F, -17.0F, 3, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[61].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[61].rotateAngleX = -3.1415927F;

        ds3decoyModel[62].addShapeBox(1.0F, 3.0F, 19.0F, 14, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[62].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[62].rotateAngleX = -3.1415927F;

        ds3decoyModel[63].addShapeBox(1.0F, 24.0F, 19.0F, 14, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
        ds3decoyModel[63].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[63].rotateAngleX = -3.1415927F;

        ds3decoyModel[64].addShapeBox(1.0F, 7.0F, 19.0F, 3, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[64].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[64].rotateAngleX = -3.1415927F;

        ds3decoyModel[65].addShapeBox(12.0F, 7.0F, 19.0F, 3, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[65].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[65].rotateAngleX = -3.1415927F;

        ds3decoyModel[66].addShapeBox(0.0F, 0.0F, 17.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[66].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[66].rotateAngleX = -3.1415927F;

        ds3decoyModel[67].addShapeBox(1.0F, 0.0F, 17.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[67].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[67].rotateAngleX = -3.1415927F;

        ds3decoyModel[68].addShapeBox(-1.0F, 0.0F, 17.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F);
        ds3decoyModel[68].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[68].rotateAngleX = -3.1415927F;

        ds3decoyModel[69].addShapeBox(15.0F, 0.0F, 17.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[69].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[69].rotateAngleX = -3.1415927F;

        ds3decoyModel[70].addShapeBox(16.0F, 0.0F, 17.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[70].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[70].rotateAngleX = -3.1415927F;

        ds3decoyModel[71].addShapeBox(14.0F, 0.0F, 17.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F);
        ds3decoyModel[71].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[71].rotateAngleX = -3.1415927F;

        ds3decoyModel[72].addShapeBox(0.0F, 0.0F, -16.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[72].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[72].rotateAngleX = -3.1415927F;

        ds3decoyModel[73].addShapeBox(1.0F, 0.0F, -16.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[73].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[73].rotateAngleX = -3.1415927F;

        ds3decoyModel[74].addShapeBox(-1.0F, 0.0F, -16.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F);
        ds3decoyModel[74].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[74].rotateAngleX = -3.1415927F;

        ds3decoyModel[75].addShapeBox(15.0F, 0.0F, -16.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[75].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[75].rotateAngleX = -3.1415927F;

        ds3decoyModel[76].addShapeBox(16.0F, 0.0F, -16.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[76].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[76].rotateAngleX = -3.1415927F;

        ds3decoyModel[77].addShapeBox(14.0F, 0.0F, -16.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F);
        ds3decoyModel[77].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[77].rotateAngleX = -3.1415927F;

        ds3decoyModel[78].addShapeBox(0.0F, 28.0F, 18.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[78].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[78].rotateAngleX = -3.1415927F;

        ds3decoyModel[79].addShapeBox(0.0F, 28.0F, 19.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F);
        ds3decoyModel[79].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[79].rotateAngleX = -3.1415927F;

        ds3decoyModel[80].addShapeBox(0.0F, 28.0F, 17.0F, 1, 2, 1, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[80].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[80].rotateAngleX = -3.1415927F;

        ds3decoyModel[81].addShapeBox(0.0F, 28.0F, -16.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[81].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[81].rotateAngleX = -3.1415927F;

        ds3decoyModel[82].addShapeBox(0.0F, 28.0F, -15.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F);
        ds3decoyModel[82].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[82].rotateAngleX = -3.1415927F;

        ds3decoyModel[83].addShapeBox(0.0F, 28.0F, -17.0F, 1, 2, 1, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[83].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[83].rotateAngleX = -3.1415927F;

        ds3decoyModel[84].addShapeBox(15.0F, 28.0F, 18.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[84].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[84].rotateAngleX = -3.1415927F;

        ds3decoyModel[85].addShapeBox(15.0F, 28.0F, 19.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F);
        ds3decoyModel[85].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[85].rotateAngleX = -3.1415927F;

        ds3decoyModel[86].addShapeBox(15.0F, 28.0F, 17.0F, 1, 2, 1, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[86].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[86].rotateAngleX = -3.1415927F;

        ds3decoyModel[87].addShapeBox(15.0F, 28.0F, -16.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[87].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[87].rotateAngleX = -3.1415927F;

        ds3decoyModel[88].addShapeBox(15.0F, 28.0F, -15.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F);
        ds3decoyModel[88].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[88].rotateAngleX = -3.1415927F;

        ds3decoyModel[89].addShapeBox(15.0F, 28.0F, -17.0F, 1, 2, 1, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        ds3decoyModel[89].setRotationPoint(-8.0F, 7.0F, 1.0F);
        ds3decoyModel[89].rotateAngleX = -3.1415927F;
    }


    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glScalef(0.2F, 0.2F, 0.2F);

        for (int i = 0; i < 90; i++) {
            ds3decoyModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    }
}


