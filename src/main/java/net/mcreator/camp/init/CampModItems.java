
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.camp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.camp.CampMod;

public class CampModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CampMod.MODID);
	public static final RegistryObject<Item> SLEEPING_BAG_WHITE = block(CampModBlocks.SLEEPING_BAG_WHITE);
	public static final RegistryObject<Item> SLEEPING_BAG = block(CampModBlocks.SLEEPING_BAG);
	public static final RegistryObject<Item> SLEEPING_BAG_LIGHT_GRAY = block(CampModBlocks.SLEEPING_BAG_LIGHT_GRAY);
	public static final RegistryObject<Item> SLEEPING_BAG_GRAY = block(CampModBlocks.SLEEPING_BAG_GRAY);
	public static final RegistryObject<Item> SLEEPING_BAG_BLACK = block(CampModBlocks.SLEEPING_BAG_BLACK);
	public static final RegistryObject<Item> SLEEPING_BAG_BROWN = block(CampModBlocks.SLEEPING_BAG_BROWN);
	public static final RegistryObject<Item> SLEEPING_BAG_YELLOW = block(CampModBlocks.SLEEPING_BAG_YELLOW);
	public static final RegistryObject<Item> SLEEPING_BAG_ORANGE = block(CampModBlocks.SLEEPING_BAG_ORANGE);
	public static final RegistryObject<Item> SLEEPING_BAG_PINK = block(CampModBlocks.SLEEPING_BAG_PINK);
	public static final RegistryObject<Item> SLEEPING_BAG_RED = block(CampModBlocks.SLEEPING_BAG_RED);
	public static final RegistryObject<Item> SLEEPING_BAG_MAGENTA = block(CampModBlocks.SLEEPING_BAG_MAGENTA);
	public static final RegistryObject<Item> SLEEPING_BAG_PURPLE = block(CampModBlocks.SLEEPING_BAG_PURPLE);
	public static final RegistryObject<Item> SLEEPING_BAG_BLUE = block(CampModBlocks.SLEEPING_BAG_BLUE);
	public static final RegistryObject<Item> SLEEPING_BAG_LIGHT_BLUE = block(CampModBlocks.SLEEPING_BAG_LIGHT_BLUE);
	public static final RegistryObject<Item> SLEEPING_BAG_CYAN = block(CampModBlocks.SLEEPING_BAG_CYAN);
	public static final RegistryObject<Item> SLEEPING_BAG_LIME = block(CampModBlocks.SLEEPING_BAG_LIME);
	public static final RegistryObject<Item> SLEEPING_BAG_GREEN = block(CampModBlocks.SLEEPING_BAG_GREEN);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
