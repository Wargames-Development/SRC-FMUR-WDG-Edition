package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;


public class ModelBlowTorch
        extends ModelGun {
    int textureX = 256;
    int textureY = 256;


    public ModelBlowTorch() {
        gunModel = new ModelRendererTurbo[29];
        gunModel[0] = new ModelRendererTurbo((ModelBase) this, 1, 1, textureX, textureY);
        gunModel[1] = new ModelRendererTurbo((ModelBase) this, 49, 1, textureX, textureY);
        gunModel[2] = new ModelRendererTurbo((ModelBase) this, 97, 1, textureX, textureY);
        gunModel[3] = new ModelRendererTurbo((ModelBase) this, 145, 1, textureX, textureY);
        gunModel[4] = new ModelRendererTurbo((ModelBase) this, 193, 1, textureX, textureY);
        gunModel[5] = new ModelRendererTurbo((ModelBase) this, 1, 57, textureX, textureY);
        gunModel[6] = new ModelRendererTurbo((ModelBase) this, 49, 57, textureX, textureY);
        gunModel[7] = new ModelRendererTurbo((ModelBase) this, 97, 57, textureX, textureY);
        gunModel[8] = new ModelRendererTurbo((ModelBase) this, 145, 57, textureX, textureY);
        gunModel[9] = new ModelRendererTurbo((ModelBase) this, 193, 57, textureX, textureY);
        gunModel[10] = new ModelRendererTurbo((ModelBase) this, 241, 1, textureX, textureY);
        gunModel[11] = new ModelRendererTurbo((ModelBase) this, 241, 17, textureX, textureY);
        gunModel[12] = new ModelRendererTurbo((ModelBase) this, 241, 33, textureX, textureY);
        gunModel[13] = new ModelRendererTurbo((ModelBase) this, 241, 49, textureX, textureY);
        gunModel[14] = new ModelRendererTurbo((ModelBase) this, 1, 65, textureX, textureY);
        gunModel[15] = new ModelRendererTurbo((ModelBase) this, 17, 65, textureX, textureY);
        gunModel[16] = new ModelRendererTurbo((ModelBase) this, 33, 65, textureX, textureY);
        gunModel[17] = new ModelRendererTurbo((ModelBase) this, 49, 65, textureX, textureY);
        gunModel[18] = new ModelRendererTurbo((ModelBase) this, 65, 65, textureX, textureY);
        gunModel[19] = new ModelRendererTurbo((ModelBase) this, 81, 65, textureX, textureY);
        gunModel[20] = new ModelRendererTurbo((ModelBase) this, 97, 65, textureX, textureY);
        gunModel[21] = new ModelRendererTurbo((ModelBase) this, 113, 65, textureX, textureY);
        gunModel[22] = new ModelRendererTurbo((ModelBase) this, 41, 1, textureX, textureY);
        gunModel[23] = new ModelRendererTurbo((ModelBase) this, 1, 1, textureX, textureY);
        gunModel[24] = new ModelRendererTurbo((ModelBase) this, 89, 1, textureX, textureY);
        gunModel[25] = new ModelRendererTurbo((ModelBase) this, 97, 1, textureX, textureY);
        gunModel[26] = new ModelRendererTurbo((ModelBase) this, 137, 1, textureX, textureY);
        gunModel[27] = new ModelRendererTurbo((ModelBase) this, 145, 1, textureX, textureY);
        gunModel[28] = new ModelRendererTurbo((ModelBase) this, 185, 1, textureX, textureY);

        gunModel[0].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 50, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[0].setRotationPoint(20.0F, -62.0F, 0.0F);

        gunModel[1].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 50, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[1].setRotationPoint(20.0F, -62.0F, 0.0F);
        gunModel[1].rotateAngleY = -0.62831855F;

        gunModel[2].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 50, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[2].setRotationPoint(20.0F, -62.0F, 0.0F);
        gunModel[2].rotateAngleY = -1.2566371F;

        gunModel[3].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 50, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[3].setRotationPoint(20.0F, -62.0F, 0.0F);
        gunModel[3].rotateAngleY = 0.62831855F;

        gunModel[4].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 50, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[4].setRotationPoint(20.0F, -62.0F, 0.0F);
        gunModel[4].rotateAngleY = 1.2566371F;

        gunModel[5].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 2, 5, 0.0F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.775F, -3.0F, 0.0F, -0.775F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[5].setRotationPoint(20.0F, -64.0F, 0.0F);

        gunModel[6].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 2, 5, 0.0F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.775F, -3.0F, 0.0F, -0.775F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[6].setRotationPoint(20.0F, -64.0F, 0.0F);
        gunModel[6].rotateAngleY = -0.62831855F;

        gunModel[7].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 2, 5, 0.0F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.775F, -3.0F, 0.0F, -0.775F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[7].setRotationPoint(20.0F, -64.0F, 0.0F);
        gunModel[7].rotateAngleY = -1.2566371F;

        gunModel[8].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 2, 5, 0.0F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.775F, -3.0F, 0.0F, -0.775F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[8].setRotationPoint(20.0F, -64.0F, 0.0F);
        gunModel[8].rotateAngleY = 0.62831855F;

        gunModel[9].addShapeBox(-8.0F, 0.0F, -2.6F, 16, 2, 5, 0.0F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.975F, -3.0F, 0.0F, -0.775F, -3.0F, 0.0F, -0.775F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
        gunModel[9].setRotationPoint(20.0F, -64.0F, 0.0F);
        gunModel[9].rotateAngleY = 1.2566371F;

        gunModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[10].setRotationPoint(18.5F, -82.0F, -0.5F);

        gunModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        gunModel[11].setRotationPoint(18.5F, -82.0F, 0.5F);

        gunModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[12].setRotationPoint(18.5F, -82.0F, -1.5F);

        gunModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 5, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F);
        gunModel[13].setRotationPoint(17.5F, -72.0F, -0.83F);

        gunModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 5, 8, 1, 0.0F, -1.67F, 0.0F, 0.0F, -1.67F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F, -1.67F, 0.0F, 0.0F, -1.67F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F);
        gunModel[14].setRotationPoint(17.5F, -72.0F, -2.49F);

        gunModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 5, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.67F, 0.0F, 0.66F, -1.67F, 0.0F, 0.66F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.67F, 0.0F, 0.66F, -1.67F, 0.0F, 0.66F);
        gunModel[15].setRotationPoint(17.5F, -72.0F, 0.83F);

        gunModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, -10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[16].setRotationPoint(18.5F, -92.0F, -0.5F);

        gunModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, -10.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        gunModel[17].setRotationPoint(18.5F, -92.0F, 0.5F);

        gunModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, -11.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[18].setRotationPoint(18.5F, -92.0F, -1.5F);

        gunModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 5, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F);
        gunModel[19].setRotationPoint(40.5F, -106.0F, -0.83F);
        gunModel[19].rotateAngleZ = -0.7853982F;

        gunModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 5, 20, 1, 0.0F, -1.67F, 0.0F, 0.0F, -1.67F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F, -1.67F, 0.0F, 0.0F, -1.67F, 0.0F, 0.0F, 0.0F, 0.0F, 0.66F, 0.0F, 0.0F, 0.66F);
        gunModel[20].setRotationPoint(40.5F, -106.0F, -2.49F);
        gunModel[20].rotateAngleZ = -0.7853982F;

        gunModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 5, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.67F, 0.0F, 0.66F, -1.67F, 0.0F, 0.66F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.67F, 0.0F, 0.66F, -1.67F, 0.0F, 0.66F);
        gunModel[21].setRotationPoint(40.5F, -106.0F, 0.83F);
        gunModel[21].rotateAngleZ = -0.7853982F;

        gunModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[22].setRotationPoint(18.5F, -69.0F, 2.51F);

        gunModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[23].setRotationPoint(19.5F, -70.0F, 2.51F);

        gunModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[24].setRotationPoint(19.5F, -68.0F, 2.51F);

        gunModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
        gunModel[25].setRotationPoint(20.5F, -68.0F, 2.51F);

        gunModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        gunModel[26].setRotationPoint(20.5F, -70.0F, 2.51F);

        gunModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
        gunModel[27].setRotationPoint(18.5F, -70.0F, 2.51F);

        gunModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
        gunModel[28].setRotationPoint(18.5F, -68.0F, 2.51F);


        translateAll(0.0F, 0.0F, 0.0F);
        hasArms = true;
        leftArmPos = new Vector3f(-5.15F, -0.42F, 0.15F);
        leftArmRot = new Vector3f(78.0F, 30.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-5.15F, -0.42F, 0.15F);
        leftArmReloadRot = new Vector3f(70.0F, 40.0F, 0.0F);
        leftArmScale = new Vector3f(0.0D, 0.0D, 0.0D);

        rightArmPos = new Vector3f(0.1F, -0.56F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.1F, -0.56F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmScale = new Vector3f(0.75D, 1.0D, 0.75D);

        flipAll();
    }
}


