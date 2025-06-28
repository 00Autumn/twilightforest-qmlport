package net.quiltmc.users.autumn.twilightforest.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.quiltmc.users.autumn.twilightforest.Twilightforest;

public class TFTags {
	public static class blocks {
		public static TagKey<Block> MAZEBREAKER_TOOL_ACCELERATED = createTag("mazebreaker_tool_accelerated");

		public static TagKey<Block> NEEDS_IRONWOOD_TOOL = createTag("needs_ironwood_tool");
		public static TagKey<Block> NEEDS_STEELEAF_TOOL = createTag("needs_steeleaf_tool");
		public static TagKey<Block> NEEDS_KNIGHTMETAL_TOOL = createTag("needs_knightmetal_tool");
		public static TagKey<Block> NEEDS_FIERY_TOOL = createTag("needs_fiery_tool");
		public static TagKey<Block> INCORRECT_FOR_IRONWOOD_TOOL = createTag("incorrect_for_ironwood_tool");
		public static TagKey<Block> INCORRECT_FOR_STEELEAF_TOOL = createTag("incorrect_for_steeleaf_tool");
		public static TagKey<Block> INCORRECT_FOR_KNIGHTMETAL_TOOL = createTag("incorrect_for_knightmetal_tool");
		public static TagKey<Block> INCORRECT_FOR_FIERY_TOOL = createTag("incorrect_for_fiery_tool");

		private static TagKey<Block> createTag(String name) {
			return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Twilightforest.MOD_ID, name));
		}
	}

	public static class items {
		public static final TagKey<Item> MAZEBREAKER_ITEM = createTag("mazebreaker_item");

		public static final TagKey<Item> KEPT_ON_DEATH = createTag("kept_on_death");

		public static final TagKey<Item> IS_FIERY_VIAL = createTag("is_fiery_vial");

		public static final TagKey<Item> IRONWOOD_INGOTS = createTag("ironwood_ingots");
		public static final TagKey<Item> STEELEAF_INGOTS = createTag("steeleaf_ingots");
		public static final TagKey<Item> KNIGHTMETAL_INGOTS = createTag("knightmetal_ingots");
		public static final TagKey<Item> FIERY_INGOTS = createTag("fiery_ingots");

		public static final TagKey<Item> REPAIRS_IRONWOOD_TOOLS = createTag("repairs_ironwood_tools");
		public static final TagKey<Item> REPAIRS_STEELEAF_TOOLS = createTag("repairs_steeleaf_tools");
		public static final TagKey<Item> REPAIRS_KNIGHTMETAL_TOOLS = createTag("repairs_knightmetal_tools");
		public static final TagKey<Item> REPAIRS_FIERY_TOOLS = createTag("repairs_fiery_tools");

		private static TagKey<Item> createTag(String name) {
			return TagKey.of(RegistryKeys.ITEM, Identifier.of(Twilightforest.MOD_ID, name));
		}
	}
}
