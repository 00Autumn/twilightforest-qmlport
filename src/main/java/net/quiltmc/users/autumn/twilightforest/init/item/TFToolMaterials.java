package net.quiltmc.users.autumn.twilightforest.init.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.quiltmc.users.autumn.twilightforest.util.TFTags;

import java.util.Objects;
import java.util.function.Supplier;

public enum TFToolMaterials implements ToolMaterial {
	IRONWOOD(TFTags.blocks.INCORRECT_FOR_IRONWOOD_TOOL, 512, 6.5F, 2, 25, () -> Ingredient.ofItems(TFItems.IRONWOOD_INGOT)),
	STEELEAF(TFTags.blocks.INCORRECT_FOR_STEELEAF_TOOL, 131, 8.0F, 3, 9, () -> Ingredient.ofItems(TFItems.STEELEAF_INGOT)),
	KNIGHTMETAL(TFTags.blocks.INCORRECT_FOR_KNIGHTMETAL_TOOL, 512, 8.0F, 3, 8, () -> Ingredient.ofItems(TFItems.KNIGHTMETAL_INGOT)),
	FIERY(TFTags.blocks.INCORRECT_FOR_FIERY_TOOL, 1024, 9.0F, 4, 10, () -> Ingredient.ofItems(TFItems.FIERY_INGOT));

	private final TagKey<Block> incorrectForDropsBlocks;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Supplier<Ingredient> repairIngredient;

	private TFToolMaterials(final TagKey<Block> incorrectForDropsBlocks, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> obj) {
		this.incorrectForDropsBlocks = incorrectForDropsBlocks;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		Objects.requireNonNull(obj);
		this.repairIngredient = Suppliers.memoize(obj::get);
	}

	public int getDurability() {
		return this.itemDurability;
	}

	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public TagKey<Block> getIncorrectForDropsBlocks() {
		return this.incorrectForDropsBlocks;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public Ingredient getRepairIngredient() {
		return (Ingredient)this.repairIngredient.get();
	}
}
