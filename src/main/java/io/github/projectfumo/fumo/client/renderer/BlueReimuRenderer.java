package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.BlueReimuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class BlueReimuRenderer extends MobRenderer<BlueReimuEntity, ModelFumo<BlueReimuEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/bluereimu.png");

	public BlueReimuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<BlueReimuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(BlueReimuEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(BlueReimuEntity entity) {
		return entityTexture;
	}
}