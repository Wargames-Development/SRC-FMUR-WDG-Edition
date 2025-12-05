//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M5Sentry
// Model Creator: 
// Created on: 23.09.2021 - 23:17:12
// Last changed on: 23.09.2021 - 23:17:12

package com.flansmod.client.model.BFMCpack; //Path where the model is located

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRadar extends ModelAAGun //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelRadar() //Same as Filename
	{
		baseModel = new ModelRendererTurbo[22];
		baseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		baseModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import 
		baseModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 
		baseModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		baseModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		baseModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		baseModel[6] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import 
		baseModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import 
		baseModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import 
		baseModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import 
		baseModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import 
		baseModel[11] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import 
		baseModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import 
		baseModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import 
		baseModel[14] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import 
		baseModel[15] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import 
		baseModel[16] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		baseModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import 
		baseModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		baseModel[19] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 43
		baseModel[20] = new ModelRendererTurbo(this, 27, 83, textureX, textureY); // Box 43
		baseModel[21] = new ModelRendererTurbo(this, 3, 99, textureX, textureY); // Box 43

		baseModel[0].addShapeBox(-0.5F, -24.5F, -0.5F, 1, 1, 1, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import 
		baseModel[0].setRotationPoint(0F, -1F, 0F);

		baseModel[1].addShapeBox(4.25F, -16F, 4.25F, 1, 16, 1, 0F, 4.0F, 0.0F, 4.0F, -4.0F, 0.0F, 4.0F, -4.0F, 0.0F, -4.0F, 4.0F, 0.0F, -4.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F); // Import 
		baseModel[1].setRotationPoint(0F, -1F, 0F);

		baseModel[2].addShapeBox(4.25F, -16F, -5.25F, 1, 16, 1, 0F, 4.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, 4.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F); // Import 
		baseModel[2].setRotationPoint(0F, -1F, 0F);

		baseModel[3].addShapeBox(-5.25F, -16F, -5.25F, 1, 16, 1, 0F, -4.0F, 0.0F, -4.0F, 4.0F, 0.0F, -4.0F, 4.0F, 0.0F, 4.0F, -4.0F, 0.0F, 4.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F); // Import 
		baseModel[3].setRotationPoint(0F, -1F, 0F);

		baseModel[4].addShapeBox(-5.25F, -16F, 4.25F, 1, 16, 1, 0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, 4.0F, 4.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F); // Import 
		baseModel[4].setRotationPoint(0F, -1F, 0F);

		baseModel[5].addShapeBox(5.75F, 0F, 5.75F, 2, 1, 2, 0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		baseModel[5].setRotationPoint(0F, -1F, 0F);

		baseModel[6].addShapeBox(-7.75F, 0F, 5.75F, 2, 1, 2, 0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		baseModel[6].setRotationPoint(0F, -1F, 0F);

		baseModel[7].addShapeBox(-7.75F, 0F, -7.75F, 2, 1, 2, 0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		baseModel[7].setRotationPoint(0F, -1F, 0F);

		baseModel[8].addShapeBox(5.75F, 0F, -7.75F, 2, 1, 2, 0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		baseModel[8].setRotationPoint(0F, -1F, 0F);

		baseModel[9].addShapeBox(-2F, -17F, -1F, 4, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); // Import 
		baseModel[9].setRotationPoint(0F, -1F, 0F);

		baseModel[10].addShapeBox(-2F, -17F, -2F, 4, 1, 1, 0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F); // Import 
		baseModel[10].setRotationPoint(0F, -1F, 0F);

		baseModel[11].addShapeBox(-2F, -17F, 1F, 4, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F); // Import 
		baseModel[11].setRotationPoint(0F, -1F, 0F);

		baseModel[12].addShapeBox(-2F, -18F, -2F, 4, 1, 1, 0F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		baseModel[12].setRotationPoint(0F, -1F, 0F);

		baseModel[13].addShapeBox(-2F, -18F, -1F, 4, 1, 2, 0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		baseModel[13].setRotationPoint(0F, -1F, 0F);

		baseModel[14].addShapeBox(-2F, -18F, 1F, 4, 1, 1, 0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F); // Import 
		baseModel[14].setRotationPoint(0F, -1F, 0F);

		baseModel[15].addShapeBox(-1.5F, -21F, -0.5F, 3, 4, 1, 0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import 
		baseModel[15].setRotationPoint(0F, -1F, 0F);

		baseModel[16].addShapeBox(-1.5F, -21F, -1.5F, 3, 4, 1, 0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F); // Import 
		baseModel[16].setRotationPoint(0F, -1F, 0F);

		baseModel[17].addShapeBox(-1.5F, -21F, 0.5F, 3, 4, 1, 0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F); // Import 
		baseModel[17].setRotationPoint(0F, -1F, 0F);

		baseModel[18].addShapeBox(-0.5F, -24.5F, -0.5F, 1, 1, 1, 0F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F); // Import 
		baseModel[18].setRotationPoint(0F, -7.5F, 0F);

		baseModel[19].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		baseModel[19].setRotationPoint(1F, -5F, -2F);

		baseModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		baseModel[20].setRotationPoint(-5.5F, -1F, -3F);

		baseModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 43
		baseModel[21].setRotationPoint(-1F, -0.5F, -3F);
		baseModel[21].rotateAngleZ = 1.3962634F;


		seatModel = new ModelRendererTurbo[10];
		seatModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 
		seatModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		seatModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import 
		seatModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import 
		seatModel[4] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import 
		seatModel[5] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import 
		seatModel[6] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import 
		seatModel[7] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import 
		seatModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		seatModel[9] = new ModelRendererTurbo(this, 10, 73, textureX, textureY); // Import 

		seatModel[0].addShapeBox(-0.5F, -24.5F, -0.5F, 1, 1, 1, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import 
		seatModel[0].setRotationPoint(0F, -1F, 0F);

		seatModel[1].addShapeBox(-0.5F, -25F, -1.5F, 1, 1, 1, 0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import 
		seatModel[1].setRotationPoint(0F, -1F, 0F);

		seatModel[2].addShapeBox(-0.5F, -25F, 0.5F, 1, 1, 1, 0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		seatModel[2].setRotationPoint(0F, -1F, 0F);

		seatModel[3].addShapeBox(-0.5F, -23.5F, 0.5F, 1, 2, 1, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F); // Import 
		seatModel[3].setRotationPoint(0F, -1F, 0F);

		seatModel[4].addShapeBox(-0.5F, -23.5F, -1.5F, 1, 2, 1, 0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F); // Import 
		seatModel[4].setRotationPoint(0F, -1F, 0F);

		seatModel[5].addShapeBox(-0.5F, -21.5F, -0.5F, 1, 1, 1, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F); // Import 
		seatModel[5].setRotationPoint(0F, -1F, 0F);

		seatModel[6].addShapeBox(-0.5F, -23.5F, -0.5F, 1, 1, 1, 0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F); // Import 
		seatModel[6].setRotationPoint(0F, -1F, 0F);

		seatModel[7].addShapeBox(-4F, -26.5F, -4.5F, 5, 2, 3, 0F, -0.5F, 4F, 3.5F, -2.5F, 4F, 3.5F, -2.5F, 4F, 3.5F, -0.5F, 4F, 3.5F, -0.5F, 0.0F, 3.5F, -2.5F, 0.0F, 3.5F, -2.5F, 0.0F, 3.5F, -0.5F, 0.0F, 3.5F); // Import 
		seatModel[7].setRotationPoint(2.5F, -1F, 3F);

		seatModel[8].addShapeBox(-0.5F, -24.5F, -0.5F, 1, 1, 1, 0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F); // Import 
		seatModel[8].setRotationPoint(0F, -8.5F, 0F);

		seatModel[9].addShapeBox(-4F, -26.5F, -4.5F, 5, 2, 3, 0F, -0.375F, 4F, 3.625F, -2.375F, 4F, 3.625F, -2.375F, 4F, 3.625F, -0.375F, 4F, 3.625F, -0.375F, -5F, 3.625F, -2.375F, -5F, 3.625F, -2.375F, -5F, 3.625F, -0.375F, -5F, 3.625F); // Import 
		seatModel[9].setRotationPoint(2.5F, -1.1F, 3F);



		barrelX = 0;
		barrelY = 26;
		barrelZ = 0;


		flipAll();
	}
}