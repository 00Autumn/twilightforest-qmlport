package net.quiltmc.users.autumn.twilightforest.init.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.quiltmc.users.autumn.twilightforest.Twilightforest;
import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;

public class TFItemGroups {

	public static final ItemGroup TWILIGHT_FOREST_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
		Identifier.of(Twilightforest.MOD_ID, "twilight_forest_items"),
		FabricItemGroup.builder().icon(() -> new ItemStack(TFItems.STEELEAF_INGOT))
			.name(Text.translatable("itemgroup.twilightforest.twilight_forest_items"))
			.entries((displayParameters, entries) -> {
				entries.addItem(TFItems.NAGA_SCALE);
				entries.addItem(TFItems.LIVEROOT);
				entries.addItem(TFItems.RAW_IRONWOOD);
				entries.addItem(TFItems.IRONWOOD_INGOT);
				entries.addItem(TFItems.STEELEAF_INGOT);
				entries.addItem(TFItems.ARMOR_SHARD);
				entries.addItem(TFItems.ARMOR_SHARD_CLUSTER);
				entries.addItem(TFItems.KNIGHTMETAL_INGOT);
				entries.addItem(TFItems.FIERY_BLOOD);
				entries.addItem(TFItems.FIERY_TEARS);
				entries.addItem(TFItems.FIERY_INGOT);
				entries.addItem(TFItems.ARCTIC_FUR);
				entries.addItem(TFItems.ALPHA_YETI_FUR);

				entries.addItem(TFItems.RAVEN_FEATHER);
				entries.addItem(TFItems.MAGIC_MAP_FOCUS);
				entries.addItem(TFItems.MAZE_MAP_FOCUS);
				entries.addItem(TFItems.CHARM_OF_LIFE_I);
				entries.addItem(TFItems.CHARM_OF_LIFE_II);
				entries.addItem(TFItems.CHARM_OF_KEEPING_I);
				entries.addItem(TFItems.CHARM_OF_KEEPING_II);
				entries.addItem(TFItems.CHARM_OF_KEEPING_III);
				entries.addItem(TFItems.BORER_ESSENCE);
				entries.addItem(TFItems.CARMINITE);
				entries.addItem(TFItems.EMPERORS_CLOTH);
				entries.addItem(TFItems.CROWN_SPLINTER);

				entries.addItem(TFItems.TOWER_KEY);

				entries.addItem(TFItems.RAW_VENISON);
				entries.addItem(TFItems.COOKED_VENISON);
				entries.addItem(TFItems.RAW_MEEF);
				entries.addItem(TFItems.COOKED_MEEF);
				entries.addItem(TFItems.MEEF_STROGANOFF);
				entries.addItem(TFItems.HYDRA_CHOP);
				entries.addItem(TFItems.TORCHBERRIES);
				entries.addItem(TFItems.EXPERIMENT_115);
				entries.addItem(TFItems.MAZE_WAFER);

			})
			.build());

	public static final ItemGroup TWILIGHT_FOREST_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
		Identifier.of(Twilightforest.MOD_ID, "twilight_forest_blocks"),
		FabricItemGroup.builder().icon(() -> new ItemStack(TFBlocks.MOSSY_UNDERBRICK))
			.name(Text.translatable("itemgroup.twilightforest.twilight_forest_blocks"))
			.entries((displayParameters, entries) -> {
				entries.addItem(TFBlocks.ROOT_BLOCK);
				entries.addItem(TFBlocks.LIVEROOT_BLOCK);

				entries.addItem(TFBlocks.IRONWOOD_BLOCK);
				entries.addItem(TFBlocks.STEELEAF_BLOCK);
				entries.addItem(TFBlocks.KNIGHTMETAL_BLOCK);
				entries.addItem(TFBlocks.FIERY_METAL_BLOCK);
				entries.addItem(TFBlocks.ARCTIC_FUR_BLOCK);

				entries.addItem(TFBlocks.MAZESTONE);
				entries.addItem(TFBlocks.MAZESTONE_BRICK);
				entries.addItem(TFBlocks.MAZESTONE_LARGE_BRICK);
				entries.addItem(TFBlocks.CHISELED_MAZESTONE);
				entries.addItem(TFBlocks.CUT_MAZESTONE);
				entries.addItem(TFBlocks.DECORATIVE_MAZESTONE);
				entries.addItem(TFBlocks.CRACKED_MAZESTONE);
				entries.addItem(TFBlocks.MOSSY_MAZESTONE);
				entries.addItem(TFBlocks.MAZESTONE_MOSAIC);
				entries.addItem(TFBlocks.MAZESTONE_BORDER);

				entries.addItem(TFBlocks.UNDERBRICK);
				entries.addItem(TFBlocks.MOSSY_UNDERBRICK);
				entries.addItem(TFBlocks.CRACKED_UNDERBRICK);
				entries.addItem(TFBlocks.UNDERBRICK_FLOOR);

				entries.addItem(TFBlocks.TOWERWOOD);
				entries.addItem(TFBlocks.ENCASED_TOWERWOOD);
				entries.addItem(TFBlocks.CRACKED_TOWERWOOD);

				entries.addItem(TFBlocks.HEDGE);
				entries.addItem(TFBlocks.HEDGE_ROSE);

				entries.addItem(TFBlocks.STRONGHOLD_SHIELD);

				entries.addItem(TFBlocks.INFESTED_TOWERWOOD);
				entries.addItem(TFBlocks.ANTIBUILT_BLOCK);
				entries.addItem(TFBlocks.FAKE_GOLD);
				entries.addItem(TFBlocks.FAKE_DIAMOND);

				entries.addItem(TFBlocks.MAZE_SLIME_BLOCK);

			})
			.build());

	public static final ItemGroup TWILIGHT_FOREST_EQUIPMENT_GROUP = Registry.register(Registries.ITEM_GROUP,
		Identifier.of(Twilightforest.MOD_ID, "twilight_forest_equipment"),
		FabricItemGroup.builder().icon(() -> new ItemStack(TFItems.CHARM_OF_KEEPING_III))
			.name(Text.translatable("itemgroup.twilightforest.twilight_forest_equipment"))
			.entries((displayParameters, entries) -> {
				entries.addItem(TFItems.RABBIT_POCKET_WATCH);
				entries.addItem(TFItems.IRONWOOD_SWORD);
				entries.addItem(TFItems.IRONWOOD_PICKAXE);
				entries.addItem(TFItems.IRONWOOD_SHOVEL);
				entries.addItem(TFItems.IRONWOOD_AXE);
				entries.addItem(TFItems.IRONWOOD_HOE);
				entries.addItem(TFItems.STEELEAF_SWORD);
				entries.addItem(TFItems.STEELEAF_PICKAXE);
				entries.addItem(TFItems.STEELEAF_SHOVEL);
				entries.addItem(TFItems.STEELEAF_AXE);
				entries.addItem(TFItems.STEELEAF_HOE);
				entries.addItem(TFItems.KNIGHTMETAL_SWORD);
				entries.addItem(TFItems.KNIGHTMETAL_PICKAXE);
				entries.addItem(TFItems.KNIGHTMETAL_AXE);
				entries.addItem(TFItems.FIERY_SWORD);
				entries.addItem(TFItems.FIERY_PICKAXE);
				entries.addItem(TFItems.GOLD_MINOTAUR_AXE);
				entries.addItem(TFItems.DIAMOND_MINOTAUR_AXE);
				entries.addItem(TFItems.MAZEBREAKER_PICKAXE);

			})
			.build());

	public static void registerItemGroups() {
		Twilightforest.LOGGER.info("Registering item groups for " + Twilightforest.MOD_ID);
	}
}
