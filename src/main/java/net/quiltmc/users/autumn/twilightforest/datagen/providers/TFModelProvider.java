package net.quiltmc.users.autumn.twilightforest.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Model;
import net.minecraft.data.client.model.Models;
import net.minecraft.util.Identifier;
import net.quiltmc.users.autumn.twilightforest.Twilightforest;
import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;
import net.quiltmc.users.autumn.twilightforest.init.item.TFItems;

import java.util.Map;
import java.util.Optional;

public class TFModelProvider extends FabricModelProvider {
	public TFModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.ROOT_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.LIVEROOT_BLOCK);

		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MAZE_SLIME_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.IRONWOOD_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.STEELEAF_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.KNIGHTMETAL_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.FIERY_METAL_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.ARCTIC_FUR_BLOCK);

		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MAZESTONE);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MAZESTONE_BRICK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MAZESTONE_LARGE_BRICK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.CHISELED_MAZESTONE);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.CUT_MAZESTONE);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.DECORATIVE_MAZESTONE);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.CRACKED_MAZESTONE);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MOSSY_MAZESTONE);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MAZESTONE_MOSAIC);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MAZESTONE_BORDER);

		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.STRONGHOLD_SHIELD);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.UNDERBRICK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.CRACKED_UNDERBRICK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MOSSY_UNDERBRICK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.UNDERBRICK_FLOOR);

		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.TOWERWOOD);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.ENCASED_TOWERWOOD);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.CRACKED_TOWERWOOD);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.MOSSY_TOWERWOOD);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.INFESTED_TOWERWOOD);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.ANTIBUILT_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.FAKE_GOLD);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.FAKE_DIAMOND);

		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.HEDGE);
		blockStateModelGenerator.registerSimpleCubeAll(TFBlocks.HEDGE_ROSE);

	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {

		itemModelGenerator.register(TFItems.NAGA_SCALE, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.LIVEROOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.RAW_IRONWOOD, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.IRONWOOD_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.STEELEAF_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.ARMOR_SHARD, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.ARMOR_SHARD_CLUSTER, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.KNIGHTMETAL_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.FIERY_BLOOD, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.FIERY_TEARS, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.FIERY_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.ARCTIC_FUR, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.ALPHA_YETI_FUR, Models.SINGLE_LAYER_ITEM);

		itemModelGenerator.register(TFItems.RAVEN_FEATHER, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.MAGIC_MAP_FOCUS, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.MAZE_MAP_FOCUS, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.CHARM_OF_LIFE_I, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.CHARM_OF_LIFE_II, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.CHARM_OF_KEEPING_I, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.CHARM_OF_KEEPING_II, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.CHARM_OF_KEEPING_III, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.BORER_ESSENCE, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.CARMINITE, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.EMPERORS_CLOTH, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.CROWN_SPLINTER, Models.SINGLE_LAYER_ITEM);

		itemModelGenerator.register(TFItems.TOWER_KEY, Models.SINGLE_LAYER_ITEM);

		itemModelGenerator.register(TFItems.RAW_VENISON, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.COOKED_VENISON, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.RAW_MEEF, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.COOKED_MEEF, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.MEEF_STROGANOFF, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.HYDRA_CHOP, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.TORCHBERRIES, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.EXPERIMENT_115, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(TFItems.MAZE_WAFER, Models.SINGLE_LAYER_ITEM);

		itemModelGenerator.register(TFItems.RABBIT_POCKET_WATCH, Models.SINGLE_LAYER_ITEM);

	}
}
