package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.EikiEntity;
import io.github.projectfumo.fumo.client.model.ModelEiki;

import com.mojang.blaze3d.vertex.PoseStack;

public class EikiRenderer extends MobRenderer<EikiEntity, ModelEiki<EikiEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/eiki.png");

	public EikiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEiki<EikiEntity>(context.bakeLayer(ModelEiki.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(EikiEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(EikiEntity entity) {
		return entityTexture;
	}
}