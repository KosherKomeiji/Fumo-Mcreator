package io.github.projectfumo.fumo.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import io.github.projectfumo.fumo.procedures.MeilingSpawnProcedure;

public class MeilingItemItem extends Item {
	public MeilingItemItem() {
		super(new Item.Properties().stacksTo(1));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MeilingSpawnProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}