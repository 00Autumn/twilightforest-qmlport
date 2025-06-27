package net.quiltmc.users.autumn.twilightforest.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterionTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonFactory;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeCategory;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.tag.ItemTags;
import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;
import net.quiltmc.users.autumn.twilightforest.init.item.TFItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TFRecipeProvider extends FabricRecipeProvider {
	public TFRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	public void generateRecipes(RecipeExporter exporter) {
		//NAGA SET

		//IRONWOOD SET
		List<ItemConvertible> IRONWOOD_SMELTABLES = List.of(TFItems.RAW_IRONWOOD);
		offerSmelting(exporter, IRONWOOD_SMELTABLES, RecipeCategory.MISC, TFItems.IRONWOOD_INGOT, 0.25f, 200, "ironwood");
		offerBlasting(exporter, IRONWOOD_SMELTABLES, RecipeCategory.MISC, TFItems.IRONWOOD_INGOT, 0.25f, 100, "ironwood");
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, TFItems.IRONWOOD_INGOT, RecipeCategory.DECORATIONS, TFBlocks.IRONWOOD_BLOCK);
		ShapelessRecipeJsonFactory.create(RecipeCategory.MISC, TFItems.RAW_IRONWOOD, 2)
			.ingredient(TFItems.LIVEROOT)
			.ingredient(Items.RAW_IRON)
			.ingredient(Items.GOLD_NUGGET)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFItems.LIVEROOT))
			.offerTo(exporter);

		//STEELEAF SET
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, TFItems.STEELEAF_INGOT, RecipeCategory.DECORATIONS, TFBlocks.STEELEAF_BLOCK);

		//KNIGHTMETAL SET
		List<ItemConvertible> KNIGHTMETAL_SMELTABLES = List.of(TFItems.ARMOR_SHARD_CLUSTER);
		offerSmelting(exporter, KNIGHTMETAL_SMELTABLES, RecipeCategory.MISC, TFItems.KNIGHTMETAL_INGOT, 0.25f, 200, "knightmetal");
		offerBlasting(exporter, KNIGHTMETAL_SMELTABLES, RecipeCategory.MISC, TFItems.KNIGHTMETAL_INGOT, 0.25f, 100, "knightmetal");
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, TFItems.KNIGHTMETAL_INGOT, RecipeCategory.DECORATIONS, TFBlocks.KNIGHTMETAL_BLOCK);
		offerShapelessRecipe(exporter, TFItems.ARMOR_SHARD_CLUSTER, TFItems.ARMOR_SHARD, "knightmetal");

		//FIERY SET
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, TFItems.FIERY_INGOT, RecipeCategory.DECORATIONS, TFBlocks.FIERY_METAL_BLOCK);

		//ARCTIC FUR SET
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, TFItems.ARCTIC_FUR, RecipeCategory.DECORATIONS, TFBlocks.ARCTIC_FUR_BLOCK);

		//YETI SET

		//MOSSY VARIANTS
		ShapelessRecipeJsonFactory.create(RecipeCategory.BUILDING_BLOCKS, TFBlocks.MOSSY_MAZESTONE, 1)
			.ingredient(TFBlocks.MAZESTONE_BRICK)
			.ingredient(Blocks.MOSS_BLOCK)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFBlocks.MAZESTONE_BRICK))
			.offerTo(exporter);
		ShapelessRecipeJsonFactory.create(RecipeCategory.BUILDING_BLOCKS, TFBlocks.MOSSY_UNDERBRICK, 1)
			.ingredient(TFBlocks.UNDERBRICK)
			.ingredient(Blocks.MOSS_BLOCK)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFBlocks.UNDERBRICK))
			.offerTo(exporter);
		ShapelessRecipeJsonFactory.create(RecipeCategory.BUILDING_BLOCKS, TFBlocks.MOSSY_TOWERWOOD, 1)
			.ingredient(TFBlocks.TOWERWOOD)
			.ingredient(Blocks.MOSS_BLOCK)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFBlocks.TOWERWOOD))
			.offerTo(exporter);

		//CRACKED VARIANTS
		List<ItemConvertible> MAZESTONE_SMELTABLES = List.of(TFBlocks.MAZESTONE_BRICK);
		offerSmelting(exporter, MAZESTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, TFBlocks.CRACKED_MAZESTONE, 0.25f, 200, "mazestone");
		List<ItemConvertible> UNDERBRICK_SMELTABLES = List.of(TFBlocks.UNDERBRICK);
		offerSmelting(exporter, UNDERBRICK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, TFBlocks.CRACKED_UNDERBRICK, 0.25f, 200, "underbrick");
		List<ItemConvertible> TOWERWOOD_SMELTABLES = List.of(TFBlocks.TOWERWOOD);
		offerSmelting(exporter, TOWERWOOD_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, TFBlocks.CRACKED_TOWERWOOD, 0.25f, 200, "towerwood");

		//CARMINITE
		ShapelessRecipeJsonFactory.create(RecipeCategory.MISC, TFItems.CARMINITE)
			.ingredient(TFItems.BORER_ESSENCE)
			.ingredient(Items.REDSTONE)
			.ingredient(TFItems.BORER_ESSENCE)
			.ingredient(Items.REDSTONE)
			.ingredient(Items.GHAST_TEAR)
			.ingredient(Items.REDSTONE)
			.ingredient(TFItems.BORER_ESSENCE)
			.ingredient(Items.REDSTONE)
			.ingredient(TFItems.BORER_ESSENCE)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFItems.BORER_ESSENCE))
			.offerTo(exporter);

		//CHARMS
		ShapelessRecipeJsonFactory.create(RecipeCategory.MISC, TFItems.CHARM_OF_LIFE_II)
			.ingredient(TFItems.CHARM_OF_LIFE_I)
			.ingredient(TFItems.CHARM_OF_LIFE_I)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFItems.CHARM_OF_LIFE_I, TFItems.CHARM_OF_LIFE_II))
			.offerTo(exporter);
		ShapelessRecipeJsonFactory.create(RecipeCategory.MISC, TFItems.CHARM_OF_KEEPING_II)
			.ingredient(TFItems.CHARM_OF_KEEPING_I)
			.ingredient(TFItems.CHARM_OF_KEEPING_I)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFItems.CHARM_OF_KEEPING_I, TFItems.CHARM_OF_KEEPING_II, TFItems.CHARM_OF_KEEPING_III))
			.offerTo(exporter);
		ShapelessRecipeJsonFactory.create(RecipeCategory.MISC, TFItems.CHARM_OF_KEEPING_III)
			.ingredient(TFItems.CHARM_OF_KEEPING_II)
			.ingredient(TFItems.CHARM_OF_KEEPING_II)
			.criterion("has_item", InventoryChangedCriterionTrigger.Conditions.create(TFItems.CHARM_OF_KEEPING_I, TFItems.CHARM_OF_KEEPING_II, TFItems.CHARM_OF_KEEPING_III))
			.offerTo(exporter);

	}
}
