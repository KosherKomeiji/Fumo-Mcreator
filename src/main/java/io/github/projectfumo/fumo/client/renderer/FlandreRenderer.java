package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.FlandreEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class FlandreRenderer extends MobRenderer<FlandreEntity, ModelFumo<FlandreEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/flandre.png");

	public FlandreRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<FlandreEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(FlandreEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(FlandreEntity entity) {
		return entityTexture;
	}
}