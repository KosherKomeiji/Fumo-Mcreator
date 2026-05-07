package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.SunnyMilkEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class SunnyMilkRenderer extends MobRenderer<SunnyMilkEntity, ModelFumo<SunnyMilkEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/sunnymilk.png");

	public SunnyMilkRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<SunnyMilkEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(SunnyMilkEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(SunnyMilkEntity entity) {
		return entityTexture;
	}
}