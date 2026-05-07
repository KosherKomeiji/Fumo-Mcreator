/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.projectfumo.fumo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.projectfumo.fumo.item.*;
import io.github.projectfumo.fumo.FumoMod;

public class FumoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FumoMod.MODID);
	public static final RegistryObject<Item> FUMOITEM;
	public static final RegistryObject<Item> MARISA_HAT_ITEM;
	public static final RegistryObject<Item> EIKI_ITEM;
	public static final RegistryObject<Item> REIMU_ITEM;
	public static final RegistryObject<Item> MARISA_ITEM;
	public static final RegistryObject<Item> CIRNO_ITEM;
	public static final RegistryObject<Item> TAN_CIRNO_ITEM;
	public static final RegistryObject<Item> CHEN_ITEM;
	public static final RegistryObject<Item> NEW_REIMU_ITEM;
	public static final RegistryObject<Item> BLUE_REIMU_ITEM;
	public static final RegistryObject<Item> KOISHI_ITEM;
	public static final RegistryObject<Item> FLANDRE_ITEM;
	public static final RegistryObject<Item> CREATIVE_TAB_ICON;
	public static final RegistryObject<Item> MEILING_ITEM;
	public static final RegistryObject<Item> YOUMU_ITEM;
	public static final RegistryObject<Item> REIMU_ICON;
	public static final RegistryObject<Item> MARISA_ICON;
	public static final RegistryObject<Item> CIRNO_ICON;
	public static final RegistryObject<Item> EIKI_ICON;
	public static final RegistryObject<Item> FLAN_ICON;
	public static final RegistryObject<Item> KOISHI_ICON;
	public static final RegistryObject<Item> MARISA_HAT_ICON;
	public static final RegistryObject<Item> MEILING_ICON;
	public static final RegistryObject<Item> BOOTLEG_REIMU_ICON;
	public static final RegistryObject<Item> TAN_CIRNO_ICON;
	public static final RegistryObject<Item> YOUMU_ICON;
	public static final RegistryObject<Item> CHEN_ICON;
	public static final RegistryObject<Item> BLUE_REIMU_ICON;
	public static final RegistryObject<Item> FUMO_ROTATE_ICON;
	public static final RegistryObject<Item> ITEM_SPIN_ICON;
	public static final RegistryObject<Item> YUYUKO_ITEM;
	public static final RegistryObject<Item> YUYUKO_ICON;
	public static final RegistryObject<Item> PATCHOULI_ITEM;
	public static final RegistryObject<Item> NITORI_ITEM;
	public static final RegistryObject<Item> TEWI_ITEM;
	public static final RegistryObject<Item> NAZRIN_ITEM;
	public static final RegistryObject<Item> SUNNY_MILK_ITEM;
	public static final RegistryObject<Item> ALICE_ITEM;
	public static final RegistryObject<Item> REMILIA_ITEM;
	static {
		FUMOITEM = REGISTRY.register("fumoitem", FumoitemItem::new);
		MARISA_HAT_ITEM = REGISTRY.register("marisa_hat_item", MarisaHatItemItem::new);
		EIKI_ITEM = REGISTRY.register("eiki_item", EikiItemItem::new);
		REIMU_ITEM = REGISTRY.register("reimu_item", ReimuItemItem::new);
		MARISA_ITEM = REGISTRY.register("marisa_item", MarisaItemItem::new);
		CIRNO_ITEM = REGISTRY.register("cirno_item", CirnoItemItem::new);
		TAN_CIRNO_ITEM = REGISTRY.register("tan_cirno_item", TanCirnoItemItem::new);
		CHEN_ITEM = REGISTRY.register("chen_item", ChenItemItem::new);
		NEW_REIMU_ITEM = REGISTRY.register("new_reimu_item", NewReimuItemItem::new);
		BLUE_REIMU_ITEM = REGISTRY.register("blue_reimu_item", BlueReimuItemItem::new);
		KOISHI_ITEM = REGISTRY.register("koishi_item", KoishiItemItem::new);
		FLANDRE_ITEM = REGISTRY.register("flandre_item", FlandreItemItem::new);
		CREATIVE_TAB_ICON = REGISTRY.register("creative_tab_icon", CreativeTabIconItem::new);
		MEILING_ITEM = REGISTRY.register("meiling_item", MeilingItemItem::new);
		YOUMU_ITEM = REGISTRY.register("youmu_item", YoumuItemItem::new);
		REIMU_ICON = REGISTRY.register("reimu_icon", ReimuIconItem::new);
		MARISA_ICON = REGISTRY.register("marisa_icon", MarisaIconItem::new);
		CIRNO_ICON = REGISTRY.register("cirno_icon", CirnoIconItem::new);
		EIKI_ICON = REGISTRY.register("eiki_icon", EikiIconItem::new);
		FLAN_ICON = REGISTRY.register("flan_icon", FlanIconItem::new);
		KOISHI_ICON = REGISTRY.register("koishi_icon", KoishiIconItem::new);
		MARISA_HAT_ICON = REGISTRY.register("marisa_hat_icon", MarisaHatIconItem::new);
		MEILING_ICON = REGISTRY.register("meiling_icon", MeilingIconItem::new);
		BOOTLEG_REIMU_ICON = REGISTRY.register("bootleg_reimu_icon", BootlegReimuIconItem::new);
		TAN_CIRNO_ICON = REGISTRY.register("tan_cirno_icon", TanCirnoIconItem::new);
		YOUMU_ICON = REGISTRY.register("youmu_icon", YoumuIconItem::new);
		CHEN_ICON = REGISTRY.register("chen_icon", ChenIconItem::new);
		BLUE_REIMU_ICON = REGISTRY.register("blue_reimu_icon", BlueReimuIconItem::new);
		FUMO_ROTATE_ICON = REGISTRY.register("fumo_rotate_icon", FumoRotateIconItem::new);
		ITEM_SPIN_ICON = REGISTRY.register("item_spin_icon", ItemSpinIconItem::new);
		YUYUKO_ITEM = REGISTRY.register("yuyuko_item", YuyukoItemItem::new);
		YUYUKO_ICON = REGISTRY.register("yuyuko_icon", YuyukoIconItem::new);
		PATCHOULI_ITEM = REGISTRY.register("patchouli_item", PatchouliItemItem::new);
		NITORI_ITEM = REGISTRY.register("nitori_item", NitoriItemItem::new);
		TEWI_ITEM = REGISTRY.register("tewi_item", TewiItemItem::new);
		NAZRIN_ITEM = REGISTRY.register("nazrin_item", NazrinItemItem::new);
		SUNNY_MILK_ITEM = REGISTRY.register("sunny_milk_item", SunnyMilkItemItem::new);
		ALICE_ITEM = REGISTRY.register("alice_item", AliceItemItem::new);
		REMILIA_ITEM = REGISTRY.register("remilia_item", RemiliaItemItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}