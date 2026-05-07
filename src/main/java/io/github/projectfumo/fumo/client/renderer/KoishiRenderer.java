package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.KoishiEntity;
import io.github.projectfumo.fumo.client.model.ModelFumo;

import com.mojang.blaze3d.vertex.PoseStack;

public class KoishiRenderer extends MobRenderer<KoishiEntity, ModelFumo<KoishiEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/koishi.png");

	public KoishiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo<KoishiEntity>(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(KoishiEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(KoishiEntity entity) {
		return entityTexture;
	}
}