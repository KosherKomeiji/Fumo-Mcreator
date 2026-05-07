package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.MarisaHatEntity;
import io.github.projectfumo.fumo.client.model.ModelMarisaHat;

import com.mojang.blaze3d.vertex.PoseStack;

public class MarisaHatRenderer extends MobRenderer<MarisaHatEntity, ModelMarisaHat<MarisaHatEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/marisahat.png");

	public MarisaHatRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMarisaHat<MarisaHatEntity>(context.bakeLayer(ModelMarisaHat.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(MarisaHatEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(MarisaHatEntity entity) {
		return entityTexture;
	}
}