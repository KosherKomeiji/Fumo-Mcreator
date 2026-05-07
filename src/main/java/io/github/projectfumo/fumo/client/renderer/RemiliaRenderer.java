package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.RemiliaEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class RemiliaRenderer extends MobRenderer<RemiliaEntity, ModelFumo<RemiliaEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/remilia.png");

	public RemiliaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<RemiliaEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(RemiliaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(RemiliaEntity entity) {
		return entityTexture;
	}
}