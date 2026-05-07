package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.MarisaEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class MarisaRenderer extends MobRenderer<MarisaEntity, ModelFumo<MarisaEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/marisa.png");

	public MarisaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<MarisaEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(MarisaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(MarisaEntity entity) {
		return entityTexture;
	}
}