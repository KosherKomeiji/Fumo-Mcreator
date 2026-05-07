package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.PatchouliEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class PatchouliRenderer extends MobRenderer<PatchouliEntity, ModelFumo<PatchouliEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/patchouli.png");

	public PatchouliRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<PatchouliEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(PatchouliEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(PatchouliEntity entity) {
		return entityTexture;
	}
}