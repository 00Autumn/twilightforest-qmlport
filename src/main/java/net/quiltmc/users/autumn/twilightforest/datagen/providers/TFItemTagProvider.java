package net.quiltmc.users.autumn.twilightforest.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.tag.ItemTags;
import net.quiltmc.users.autumn.twilightforest.init.item.TFItems;
import net.quiltmc.users.autumn.twilightforest.util.TFTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TFItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public TFItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider provider) {
		getOrCreateTagBuilder(ItemTags.WOLF_FOOD)
			.add(TFItems.RAW_VENISON)
			.add(TFItems.COOKED_VENISON)
			.add(TFItems.RAW_MEEF)
			.add(TFItems.COOKED_MEEF)
			.add(TFItems.HYDRA_CHOP);

		getOrCreateTagBuilder(ItemTags.MEAT)
			.add(TFItems.RAW_VENISON)
			.add(TFItems.COOKED_VENISON)
			.add(TFItems.RAW_MEEF)
			.add(TFItems.COOKED_MEEF)
			.add(TFItems.HYDRA_CHOP);;

		//getOrCreateTagBuilder(ItemTags.FREEZE_IMMUNE_WEARABLES);

		//getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED);

		//getOrCreateTagBuilder(TFTags.items.MAZEBREAKER_ITEM);

		getOrCreateTagBuilder(TFTags.items.IS_FIERY_VIAL)
			.add(TFItems.FIERY_BLOOD)
			.add(TFItems.FIERY_TEARS);

		getOrCreateTagBuilder(TFTags.items.IRONWOOD_INGOTS)
			.add(TFItems.IRONWOOD_INGOT);
		getOrCreateTagBuilder(TFTags.items.STEELEAF_INGOTS)
			.add(TFItems.STEELEAF_INGOT);
		getOrCreateTagBuilder(TFTags.items.KNIGHTMETAL_INGOTS)
			.add(TFItems.KNIGHTMETAL_INGOT);
		getOrCreateTagBuilder(TFTags.items.FIERY_INGOTS)
			.add(TFItems.FIERY_INGOT);

		getOrCreateTagBuilder(TFTags.items.REPAIRS_IRONWOOD_TOOLS).addTag(TFTags.items.IRONWOOD_INGOTS);
		getOrCreateTagBuilder(TFTags.items.REPAIRS_STEELEAF_TOOLS).addTag(TFTags.items.STEELEAF_INGOTS);
		getOrCreateTagBuilder(TFTags.items.REPAIRS_KNIGHTMETAL_TOOLS).addTag(TFTags.items.KNIGHTMETAL_INGOTS);
		getOrCreateTagBuilder(TFTags.items.REPAIRS_FIERY_TOOLS).addTag(TFTags.items.FIERY_INGOTS);

		//getOrCreateTagBuilder(TFTags.items.KEPT_ON_DEATH);
	}
}
