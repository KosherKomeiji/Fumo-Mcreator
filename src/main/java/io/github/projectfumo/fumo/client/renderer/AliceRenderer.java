package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.AliceEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class AliceRenderer extends MobRenderer<AliceEntity, ModelFumo<AliceEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/alice.png");

	public AliceRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<AliceEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(AliceEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(AliceEntity entity) {
		return entityTexture;
	}
}