package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.YoumuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class YoumuRenderer extends MobRenderer<YoumuEntity, ModelFumo<YoumuEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/youmu.png");

	public YoumuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<YoumuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(YoumuEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(YoumuEntity entity) {
		return entityTexture;
	}
}