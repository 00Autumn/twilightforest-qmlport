package net.quiltmc.users.autumn.twilightforest.init.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.HayBlock;
import net.minecraft.client.item.TooltipConfig;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ArcticFurBlock extends HayBlock {
	public ArcticFurBlock(Settings settings) {
		super(settings);
	}

	@Override
	public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
		entity.handleFallDamage(fallDistance, 0.1F, world.getDamageSources().fall());
	}

	@Override
	public void appendTooltip(ItemStack stack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipConfig options) {
		tooltip.add(Text.translatable("tooltip.twilightforest.arctic_fur_block.tooltip").setColor(15269631));
		super.appendTooltip(stack, tooltipContext, tooltip, options);
	}
}
