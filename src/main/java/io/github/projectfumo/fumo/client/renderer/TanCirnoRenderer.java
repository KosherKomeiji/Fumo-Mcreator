package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.TanCirnoEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class TanCirnoRenderer extends MobRenderer<TanCirnoEntity, ModelFumo<TanCirnoEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/tancirno.png");

	public TanCirnoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<TanCirnoEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(TanCirnoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(TanCirnoEntity entity) {
		return entityTexture;
	}
}