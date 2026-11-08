package com.flansmod.client.model.BFMCpack;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSnipexSuppressor extends ModelAttachment {
    public ModelSnipexSuppressor() {
        ModelRendererTurbo body = new ModelRendererTurbo(this, 0, 0, 512, 512);
        body.addObj("/BFMCpack/SnipexSuppressor.obj");
        body.rotateAngleX = (float) (Math.PI / 2);
        attachmentModel = new ModelRendererTurbo[] {body};

        // The Alligator's flash/tracer pass scales by 0.05 after its gun scale.
        attachmentFlashOffset = new Vector3f(18.45F / (16F * 0.05F), 0F, 0F);
    }
}
