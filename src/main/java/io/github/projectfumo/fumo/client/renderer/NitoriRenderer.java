package io.github.projectfumo.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import io.github.projectfumo.fumo.entity.NitoriEntity;
import io.github.projectfumo.fumo.client.model.ModelNitori;

import com.mojang.blaze3d.vertex.PoseStack;

public class NitoriRenderer extends MobRenderer<NitoriEntity, ModelNitori<NitoriEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("fumo:textures/entities/nitori.png");

	public NitoriRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNitori<NitoriEntity>(context.bakeLayer(ModelNitori.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(NitoriEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(NitoriEntity entity) {
		return entityTexture;
	}
}