package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelC25Scope extends ModelAttachment {
    public ModelC25Scope() {
        ModelRendererTurbo mesh = new ModelRendererTurbo(this, 0, 0, 256, 256);
        mesh.addObj("/BFMCpack/C25Scope.obj");
        mesh.rotateAngleX = (float) (Math.PI / 2);
        attachmentModel = new ModelRendererTurbo[] {mesh};
    }
}
