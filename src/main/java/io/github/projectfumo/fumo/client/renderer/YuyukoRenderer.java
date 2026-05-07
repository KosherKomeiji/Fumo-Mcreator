package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.YuyukoEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class YuyukoRenderer extends MobRenderer<YuyukoEntity, ModelFumo<YuyukoEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/yuyuko.png");

	public YuyukoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<YuyukoEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(YuyukoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(YuyukoEntity entity) {
		return entityTexture;
	}
}