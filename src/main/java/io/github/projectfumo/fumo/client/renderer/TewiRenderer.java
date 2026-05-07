package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.TewiEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class TewiRenderer extends MobRenderer<TewiEntity, ModelFumo<TewiEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/tewi.png");

	public TewiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<TewiEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(TewiEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(TewiEntity entity) {
		return entityTexture;
	}
}