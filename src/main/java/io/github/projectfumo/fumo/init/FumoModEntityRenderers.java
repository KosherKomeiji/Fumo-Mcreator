/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.projectfumo.fumo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.projectfumo.fumo.client.renderer.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FumoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FumoModEntities.REIMU.get(), ReimuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.MARISA.get(), MarisaRenderer::new);
		event.registerEntityRenderer(FumoModEntities.MARISA_HAT.get(), MarisaHatRenderer::new);
		event.registerEntityRenderer(FumoModEntities.EIKI.get(), EikiRenderer::new);
		event.registerEntityRenderer(FumoModEntities.CIRNO.get(), CirnoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.TAN_CIRNO.get(), TanCirnoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.DEBUG_FUMO.get(), DebugFumoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.CHEN.get(), ChenRenderer::new);
		event.registerEntityRenderer(FumoModEntities.NEW_REIMU.get(), NewReimuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.BLUE_REIMU.get(), BlueReimuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.KOISHI.get(), KoishiRenderer::new);
		event.registerEntityRenderer(FumoModEntities.FLANDRE.get(), FlandreRenderer::new);
		event.registerEntityRenderer(FumoModEntities.MEILING.get(), MeilingRenderer::new);
		event.registerEntityRenderer(FumoModEntities.YOUMU.get(), YoumuRenderer::new);
		event.registerEntityRenderer(FumoModEntities.YUYUKO.get(), YuyukoRenderer::new);
		event.registerEntityRenderer(FumoModEntities.PATCHOULI.get(), PatchouliRenderer::new);
		event.registerEntityRenderer(FumoModEntities.NITORI.get(), NitoriRenderer::new);
		event.registerEntityRenderer(FumoModEntities.TEWI.get(), TewiRenderer::new);
		event.registerEntityRenderer(FumoModEntities.NAZRIN.get(), NazrinRenderer::new);
		event.registerEntityRenderer(FumoModEntities.SUNNY_MILK.get(), SunnyMilkRenderer::new);
		event.registerEntityRenderer(FumoModEntities.ALICE.get(), AliceRenderer::new);
		event.registerEntityRenderer(FumoModEntities.REMILIA.get(), RemiliaRenderer::new);
	}
}