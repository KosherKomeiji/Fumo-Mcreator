package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.ChenEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class ChenRenderer extends MobRenderer<ChenEntity, ModelFumo<ChenEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/chen.png");

	public ChenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<ChenEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(ChenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(ChenEntity entity) {
		return entityTexture;
	}
}