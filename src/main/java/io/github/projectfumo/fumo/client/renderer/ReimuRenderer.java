package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.ReimuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class ReimuRenderer extends MobRenderer<ReimuEntity, ModelFumo<ReimuEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/reimu.png");

	public ReimuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<ReimuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(ReimuEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(ReimuEntity entity) {
		return entityTexture;
	}
}