package net.quiltmc.users.autumn.twilightforest.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.HolderLookup;
import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;
import net.quiltmc.users.autumn.twilightforest.init.item.TFItems;

import java.util.concurrent.CompletableFuture;

public class TFLootTableProvider extends FabricBlockLootTableProvider {
	public TFLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generate() {
		addDrop(TFBlocks.ROOT_BLOCK);
		addDrop(TFBlocks.LIVEROOT_BLOCK, TFItems.LIVEROOT);

		addDrop(TFBlocks.MAZE_SLIME_BLOCK);
		addDrop(TFBlocks.IRONWOOD_BLOCK);
		addDrop(TFBlocks.STEELEAF_BLOCK);
		addDrop(TFBlocks.KNIGHTMETAL_BLOCK);
		addDrop(TFBlocks.FIERY_METAL_BLOCK);
		addDrop(TFBlocks.ARCTIC_FUR_BLOCK);

		addDrop(TFBlocks.MAZESTONE);
		addDrop(TFBlocks.MAZESTONE_BRICK);
		addDrop(TFBlocks.MAZESTONE_LARGE_BRICK);
		addDrop(TFBlocks.CHISELED_MAZESTONE);
		addDrop(TFBlocks.CUT_MAZESTONE);
		addDrop(TFBlocks.DECORATIVE_MAZESTONE);
		addDrop(TFBlocks.CRACKED_MAZESTONE);
		addDrop(TFBlocks.MOSSY_MAZESTONE);
		addDrop(TFBlocks.MAZESTONE_MOSAIC);
		addDrop(TFBlocks.MAZESTONE_BORDER);

		addDrop(TFBlocks.UNDERBRICK);
		addDrop(TFBlocks.CRACKED_UNDERBRICK);
		addDrop(TFBlocks.MOSSY_UNDERBRICK);
		addDrop(TFBlocks.UNDERBRICK_FLOOR);

		addDrop(TFBlocks.TOWERWOOD);
		addDrop(TFBlocks.ENCASED_TOWERWOOD);
		addDrop(TFBlocks.CRACKED_TOWERWOOD);
		addDrop(TFBlocks.MOSSY_TOWERWOOD);
		addDropWithSilkTouch(TFBlocks.INFESTED_TOWERWOOD, TFBlocks.TOWERWOOD);

		addDrop(TFBlocks.HEDGE);
		addDrop(TFBlocks.HEDGE_ROSE, TFBlocks.HEDGE);
	}
}
