package io.github.projectfumo.fumo.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import io.github.projectfumo.fumo.procedures.NitoriSpawnProcedure;

public class NitoriItemItem extends Item {
	public NitoriItemItem() {
		super(new Item.Properties().stacksTo(1));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		NitoriSpawnProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}