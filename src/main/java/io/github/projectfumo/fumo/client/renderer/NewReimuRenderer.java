package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.NewReimuEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class NewReimuRenderer extends MobRenderer<NewReimuEntity, ModelFumo<NewReimuEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/newreimu.png");

	public NewReimuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<NewReimuEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(NewReimuEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(NewReimuEntity entity) {
		return entityTexture;
	}
}