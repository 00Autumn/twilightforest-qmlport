package net.quiltmc.users.autumn.twilightforest.init.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.MagmaBlock;
import net.minecraft.client.item.TooltipConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class FieryMetalBlock extends MagmaBlock {
	public FieryMetalBlock(Settings settings) {
		super(settings);
	}

	@Override
	public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
		if(this.shouldDamage(entity)) {
			entity.setOnFireFor(3);
		}
	}

	@Override
	public void appendTooltip(ItemStack stack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipConfig options) {
		tooltip.add(Text.translatable("tooltip.twilightforest.fiery_metal_block.tooltip").setColor(8524820));
		super.appendTooltip(stack, tooltipContext, tooltip, options);
	}

	private boolean shouldDamage(Entity entity) {
		return !(entity instanceof ItemEntity || entity.isSpectator() || entity.isSneaking() || entity.isFireImmune());
	}
}
