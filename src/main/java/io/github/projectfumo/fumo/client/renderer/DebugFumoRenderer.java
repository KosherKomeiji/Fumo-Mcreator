package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.DebugFumoEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class DebugFumoRenderer extends MobRenderer<DebugFumoEntity, ModelFumo<DebugFumoEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/debugfumo.png");

	public DebugFumoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<DebugFumoEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(DebugFumoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(DebugFumoEntity entity) {
		return entityTexture;
	}
}