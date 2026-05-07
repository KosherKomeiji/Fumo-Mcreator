package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.NazrinEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class NazrinRenderer extends MobRenderer<NazrinEntity, ModelFumo<NazrinEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/nazrin.png");

	public NazrinRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<NazrinEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(NazrinEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(NazrinEntity entity) {
		return entityTexture;
	}
}