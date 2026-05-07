package io.github.projectfumo.fumo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.server.TickTask;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

import it.unimi.dsi.fastutil.ints.IntObjectPair;
import it.unimi.dsi.fastutil.ints.IntObjectImmutablePair;

import io.github.projectfumo.fumo.init.FumoModTabs;
import io.github.projectfumo.fumo.init.FumoModItems;
import io.github.projectfumo.fumo.init.FumoModEntities;

@Mod("fumo")
public class FumoMod {
	public static final Logger LOGGER = LogManager.getLogger(FumoMod.class);
	public static final String MODID = "fumo";

	public FumoMod(FMLJavaModLoadingContext context) {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = context.getModEventBus();
		FumoModItems.REGISTRY.register(bus);
		FumoModEntities.REGISTRY.register(bus);
		FumoModTabs.REGISTRY.register(bus);
		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Queue<IntObjectPair<Runnable>> workToBeScheduled = new ConcurrentLinkedQueue<>();
	private static final PriorityQueue<TickTask> workQueue = new PriorityQueue<>(Comparator.comparingInt(TickTask::getTick));

	public static void queueServerWork(int delay, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workToBeScheduled.add(new IntObjectImmutablePair<>(delay, action));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			int currentTick = event.getServer().getTickCount();
			IntObjectPair<Runnable> work;
			while ((work = workToBeScheduled.poll()) != null) {
				workQueue.add(new TickTask(currentTick + work.leftInt(), work.right()));
			}
			while (!workQueue.isEmpty() && currentTick >= workQueue.peek().getTick()) {
				workQueue.poll().run();
			}
		}
	}
}