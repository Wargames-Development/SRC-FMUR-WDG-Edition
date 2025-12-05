package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;


public class ModelMPAPS
        extends ModelAAGun {
    int textureX = 64;
    int textureY = 128;


    public ModelMPAPS() {
        baseModel = new ModelRendererTurbo[18];
        baseModel[0] = new ModelRendererTurbo((ModelBase) this, 1, 1, textureX, textureY);
        baseModel[1] = new ModelRendererTurbo((ModelBase) this, 9, 1, textureX, textureY);
        baseModel[2] = new ModelRendererTurbo((ModelBase) this, 17, 1, textureX, textureY);
        baseModel[3] = new ModelRendererTurbo((ModelBase) this, 25, 1, textureX, textureY);
        baseModel[4] = new ModelRendererTurbo((ModelBase) this, 33, 1, textureX, textureY);
        baseModel[5] = new ModelRendererTurbo((ModelBase) this, 41, 1, textureX, textureY);
        baseModel[6] = new ModelRendererTurbo((ModelBase) this, 41, 9, textureX, textureY);
        baseModel[7] = new ModelRendererTurbo((ModelBase) this, 1, 17, textureX, textureY);
        baseModel[8] = new ModelRendererTurbo((ModelBase) this, 41, 17, textureX, textureY);
        baseModel[9] = new ModelRendererTurbo((ModelBase) this, 1, 25, textureX, textureY);
        baseModel[10] = new ModelRendererTurbo((ModelBase) this, 17, 25, textureX, textureY);
        baseModel[11] = new ModelRendererTurbo((ModelBase) this, 33, 25, textureX, textureY);
        baseModel[12] = new ModelRendererTurbo((ModelBase) this, 49, 25, textureX, textureY);
        baseModel[13] = new ModelRendererTurbo((ModelBase) this, 1, 33, textureX, textureY);
        baseModel[14] = new ModelRendererTurbo((ModelBase) this, 17, 33, textureX, textureY);
        baseModel[15] = new ModelRendererTurbo((ModelBase) this, 33, 33, textureX, textureY);
        baseModel[16] = new ModelRendererTurbo((ModelBase) this, 49, 33, textureX, textureY);
        baseModel[17] = new ModelRendererTurbo((ModelBase) this, 1, 41, textureX, textureY);

        baseModel[0].addShapeBox(-0.5F, -24.5F, -0.5F, 1, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
        baseModel[0].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[1].addShapeBox(4.25F, -16.0F, 4.25F, 1, 16, 1, 0.0F, 4.0F, 0.0F, 4.0F, -4.0F, 0.0F, 4.0F, -4.0F, 0.0F, -4.0F, 4.0F, 0.0F, -4.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F);
        baseModel[1].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[2].addShapeBox(4.25F, -16.0F, -5.25F, 1, 16, 1, 0.0F, 4.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, 4.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F);
        baseModel[2].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[3].addShapeBox(-5.25F, -16.0F, -5.25F, 1, 16, 1, 0.0F, -4.0F, 0.0F, -4.0F, 4.0F, 0.0F, -4.0F, 4.0F, 0.0F, 4.0F, -4.0F, 0.0F, 4.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F);
        baseModel[3].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[4].addShapeBox(-5.25F, -16.0F, 4.25F, 1, 16, 1, 0.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, 4.0F, 4.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F);
        baseModel[4].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[5].addShapeBox(5.75F, 0.0F, 5.75F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        baseModel[5].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[6].addShapeBox(-7.75F, 0.0F, 5.75F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        baseModel[6].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[7].addShapeBox(-7.75F, 0.0F, -7.75F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        baseModel[7].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[8].addShapeBox(5.75F, 0.0F, -7.75F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        baseModel[8].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[9].addShapeBox(-2.0F, -17.0F, -1.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
        baseModel[9].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[10].addShapeBox(-2.0F, -17.0F, -2.0F, 4, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
        baseModel[10].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[11].addShapeBox(-2.0F, -17.0F, 1.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F);
        baseModel[11].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[12].addShapeBox(-2.0F, -18.0F, -2.0F, 4, 1, 1, 0.0F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        baseModel[12].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[13].addShapeBox(-2.0F, -18.0F, -1.0F, 4, 1, 2, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        baseModel[13].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[14].addShapeBox(-2.0F, -18.0F, 1.0F, 4, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        baseModel[14].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[15].addShapeBox(-1.5F, -21.0F, -0.5F, 3, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
        baseModel[15].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[16].addShapeBox(-1.5F, -21.0F, -1.5F, 3, 4, 1, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
        baseModel[16].setRotationPoint(0.0F, -1.0F, 0.0F);

        baseModel[17].addShapeBox(-1.5F, -21.0F, 0.5F, 3, 4, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
        baseModel[17].setRotationPoint(0.0F, -1.0F, 0.0F);


        seatModel = new ModelRendererTurbo[22];
        seatModel[0] = new ModelRendererTurbo((ModelBase) this, 57, 1, textureX, textureY);
        seatModel[1] = new ModelRendererTurbo((ModelBase) this, 1, 9, textureX, textureY);
        seatModel[2] = new ModelRendererTurbo((ModelBase) this, 57, 9, textureX, textureY);
        seatModel[3] = new ModelRendererTurbo((ModelBase) this, 57, 17, textureX, textureY);
        seatModel[4] = new ModelRendererTurbo((ModelBase) this, 17, 41, textureX, textureY);
        seatModel[5] = new ModelRendererTurbo((ModelBase) this, 25, 41, textureX, textureY);
        seatModel[6] = new ModelRendererTurbo((ModelBase) this, 33, 41, textureX, textureY);
        seatModel[7] = new ModelRendererTurbo((ModelBase) this, 41, 41, textureX, textureY);
        seatModel[8] = new ModelRendererTurbo((ModelBase) this, 1, 49, textureX, textureY);
        seatModel[9] = new ModelRendererTurbo((ModelBase) this, 9, 49, textureX, textureY);
        seatModel[10] = new ModelRendererTurbo((ModelBase) this, 17, 49, textureX, textureY);
        seatModel[11] = new ModelRendererTurbo((ModelBase) this, 25, 49, textureX, textureY);
        seatModel[12] = new ModelRendererTurbo((ModelBase) this, 1, 57, textureX, textureY);
        seatModel[13] = new ModelRendererTurbo((ModelBase) this, 25, 57, textureX, textureY);
        seatModel[14] = new ModelRendererTurbo((ModelBase) this, 1, 65, textureX, textureY);
        seatModel[15] = new ModelRendererTurbo((ModelBase) this, 49, 49, textureX, textureY);
        seatModel[16] = new ModelRendererTurbo((ModelBase) this, 49, 57, textureX, textureY);
        seatModel[17] = new ModelRendererTurbo((ModelBase) this, 25, 65, textureX, textureY);
        seatModel[18] = new ModelRendererTurbo((ModelBase) this, 57, 41, textureX, textureY);
        seatModel[19] = new ModelRendererTurbo((ModelBase) this, 41, 25, textureX, textureY);
        seatModel[20] = new ModelRendererTurbo((ModelBase) this, 41, 65, textureX, textureY);
        seatModel[21] = new ModelRendererTurbo((ModelBase) this, 25, 25, textureX, textureY);

        seatModel[0].addShapeBox(-0.5F, -24.5F, -0.5F, 1, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
        seatModel[0].setRotationPoint(0.0F, -1.0F, 0.0F);

        seatModel[1].addShapeBox(-0.5F, -25.0F, -1.5F, 1, 1, 1, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
        seatModel[1].setRotationPoint(0.0F, -1.0F, 0.0F);

        seatModel[2].addShapeBox(-0.5F, -25.0F, 0.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        seatModel[2].setRotationPoint(0.0F, -1.0F, 0.0F);

        seatModel[3].addShapeBox(-0.5F, -23.5F, 0.5F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
        seatModel[3].setRotationPoint(0.0F, -1.0F, 0.0F);

        seatModel[4].addShapeBox(-0.5F, -23.5F, -1.5F, 1, 2, 1, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
        seatModel[4].setRotationPoint(0.0F, -1.0F, 0.0F);

        seatModel[5].addShapeBox(-0.5F, -21.5F, -0.5F, 1, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
        seatModel[5].setRotationPoint(0.0F, -1.0F, 0.0F);

        seatModel[6].addShapeBox(-0.5F, -23.5F, -0.5F, 1, 1, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
        seatModel[6].setRotationPoint(0.0F, -1.0F, 0.0F);

        seatModel[7].addShapeBox(-4.0F, -26.5F, -4.5F, 5, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F);
        seatModel[7].setRotationPoint(2.5F, -1.0F, 3.0F);

        seatModel[8].addShapeBox(1.0F, -26.75F, -3.5F, 1, 3, 1, 0.0F, 0.0F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, 0.0F, -0.75F, -0.2F, 0.0F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, 0.0F, -0.75F, -0.2F);
        seatModel[8].setRotationPoint(2.5F, -3.0F, 3.0F);

        seatModel[9].addShapeBox(1.0F, -26.75F, -2.7F, 1, 3, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.25F, -0.55F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.25F, -0.55F, 0.0F, -1.25F, -0.55F);
        seatModel[9].setRotationPoint(2.5F, -3.0F, 3.0F);

        seatModel[10].addShapeBox(1.0F, -26.75F, -4.3F, 1, 3, 1, 0.0F, 0.0F, -1.25F, -0.55F, -0.5F, -1.25F, -0.55F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, -0.55F, -0.5F, -1.25F, -0.55F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
        seatModel[10].setRotationPoint(2.5F, -3.0F, 3.0F);

        seatModel[11].addShapeBox(-4.0F, -26.5F, -4.5F, 5, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F);
        seatModel[11].setRotationPoint(2.5F, -1.0F, -1.0F);

        seatModel[12].addShapeBox(-4.0F, -26.5F, -4.5F, 5, 2, 3, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
        seatModel[12].setRotationPoint(2.5F, -1.0F, 7.0F);

        seatModel[13].addShapeBox(-4.0F, -26.5F, -4.5F, 5, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
        seatModel[13].setRotationPoint(2.5F, -4.0F, 3.0F);

        seatModel[14].addShapeBox(-4.0F, -26.5F, -4.5F, 5, 2, 3, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        seatModel[14].setRotationPoint(-2.5F, -1.0F, 3.0F);

        seatModel[15].addShapeBox(-1.5F, -21.0F, -0.5F, 3, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
        seatModel[15].setRotationPoint(-4.5F, -10.0F, 0.0F);

        seatModel[16].addShapeBox(-1.5F, -21.0F, -1.5F, 3, 5, 1, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
        seatModel[16].setRotationPoint(-4.5F, -10.0F, 0.0F);

        seatModel[17].addShapeBox(-1.5F, -21.0F, 0.5F, 3, 5, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
        seatModel[17].setRotationPoint(-4.5F, -10.0F, 0.0F);

        seatModel[18].addShapeBox(-1.5F, -21.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        seatModel[18].setRotationPoint(-3.5F, -11.0F, 0.0F);

        seatModel[19].addShapeBox(-1.5F, -21.0F, -0.5F, 1, 5, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
        seatModel[19].setRotationPoint(-3.5F, -16.0F, -1.0F);

        seatModel[20].addShapeBox(-1.5F, -21.0F, -0.5F, 1, 2, 1, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
        seatModel[20].setRotationPoint(-3.5F, -15.0F, 0.0F);

        seatModel[21].addShapeBox(-1.5F, -21.0F, -0.5F, 1, 1, 3, 0.0F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F);
        seatModel[21].setRotationPoint(-3.5F, -12.0F, -1.0F);


        barrelX = 0;
        barrelY = 26;
        barrelZ = 0;


        flipAll();
    }
}


