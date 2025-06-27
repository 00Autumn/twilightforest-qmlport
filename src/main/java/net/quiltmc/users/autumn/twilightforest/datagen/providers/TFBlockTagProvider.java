package net.quiltmc.users.autumn.twilightforest.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.tag.BlockTags;
import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;
import net.quiltmc.users.autumn.twilightforest.util.TFTags;

import java.util.concurrent.CompletableFuture;

public class TFBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public TFBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider provider) {
		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
			.add(TFBlocks.IRONWOOD_BLOCK)
			.add(TFBlocks.STEELEAF_BLOCK)
			.add(TFBlocks.KNIGHTMETAL_BLOCK)
			.add(TFBlocks.FIERY_METAL_BLOCK)

			.add(TFBlocks.MAZESTONE)
			.add(TFBlocks.MAZESTONE_BRICK)
			.add(TFBlocks.MAZESTONE_LARGE_BRICK)
			.add(TFBlocks.CHISELED_MAZESTONE)
			.add(TFBlocks.CUT_MAZESTONE)
			.add(TFBlocks.DECORATIVE_MAZESTONE)
			.add(TFBlocks.CRACKED_MAZESTONE)
			.add(TFBlocks.MAZESTONE_MOSAIC)
			.add(TFBlocks.MAZESTONE_BORDER)

			.add(TFBlocks.UNDERBRICK)
			.add(TFBlocks.MOSSY_UNDERBRICK)
			.add(TFBlocks.CRACKED_UNDERBRICK)
			.add(TFBlocks.UNDERBRICK_FLOOR);

		getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
			.add(TFBlocks.ROOT_BLOCK)
			.add(TFBlocks.LIVEROOT_BLOCK)
			.add(TFBlocks.HEDGE)
			.add(TFBlocks.HEDGE_ROSE);

		getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
			.add(TFBlocks.ARCTIC_FUR_BLOCK);

		getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
			.add(TFBlocks.IRONWOOD_BLOCK)
			.add(TFBlocks.UNDERBRICK)
			.add(TFBlocks.CRACKED_UNDERBRICK)
			.add(TFBlocks.MOSSY_UNDERBRICK)
			.add(TFBlocks.UNDERBRICK_FLOOR);

		getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
			.add(TFBlocks.KNIGHTMETAL_BLOCK)
			.add(TFBlocks.FIERY_METAL_BLOCK);

		getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
			.add(TFBlocks.MAZESTONE)
			.add(TFBlocks.MAZESTONE_BRICK)
			.add(TFBlocks.MAZESTONE_LARGE_BRICK)
			.add(TFBlocks.CHISELED_MAZESTONE)
			.add(TFBlocks.CUT_MAZESTONE)
			.add(TFBlocks.DECORATIVE_MAZESTONE)
			.add(TFBlocks.CRACKED_MAZESTONE)
			.add(TFBlocks.MAZESTONE_MOSAIC)
			.add(TFBlocks.MAZESTONE_BORDER);

		//getOrCreateTagBuilder(TFTags.blocks.INCORRECT_FOR_IRONWOOD_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
		//getOrCreateTagBuilder(TFTags.blocks.INCORRECT_FOR_STEELEAF_TOOL).addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
		//getOrCreateTagBuilder(TFTags.blocks.INCORRECT_FOR_KNIGHTMETAL_TOOL).addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
		//getOrCreateTagBuilder(TFTags.blocks.INCORRECT_FOR_FIERY_TOOL).addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

		getOrCreateTagBuilder(TFTags.blocks.MAZEBREAKER_TOOL_ACCELERATED)
			.add(TFBlocks.MAZESTONE)
			.add(TFBlocks.MAZESTONE_BRICK)
			.add(TFBlocks.MAZESTONE_LARGE_BRICK)
			.add(TFBlocks.CHISELED_MAZESTONE)
			.add(TFBlocks.CUT_MAZESTONE)
			.add(TFBlocks.DECORATIVE_MAZESTONE)
			.add(TFBlocks.CRACKED_MAZESTONE)
			.add(TFBlocks.MAZESTONE_MOSAIC)
			.add(TFBlocks.MAZESTONE_BORDER);

		getOrCreateTagBuilder(BlockTags.STRIDER_WARM_BLOCKS)
			.add(TFBlocks.FIERY_METAL_BLOCK);
	}
}
