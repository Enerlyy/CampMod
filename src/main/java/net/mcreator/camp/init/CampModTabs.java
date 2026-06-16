
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.camp.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.camp.CampMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CampModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CampMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(CampModBlocks.SLEEPING_BAG_WHITE.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_LIGHT_GRAY.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_GRAY.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_BLACK.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_BROWN.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_YELLOW.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_ORANGE.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_PINK.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_RED.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_MAGENTA.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_PURPLE.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_BLUE.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_LIGHT_BLUE.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_CYAN.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_LIME.get().asItem());
			tabData.accept(CampModBlocks.SLEEPING_BAG_GREEN.get().asItem());
		}
	}
}
