package net.quiltmc.users.autumn.twilightforest.init.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.item.TooltipConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class KnightmetalBlock extends Block {
	private static final int DAMAGE = 4;

	private static final VoxelShape KNIGHTMETAL_BLOCK_BB = Block.createCuboidShape(1.0, 1.0, 1.0, 15.0, 15.0, 15.0);

	public KnightmetalBlock(Settings settings) {
		super(settings);
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return KNIGHTMETAL_BLOCK_BB;
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return KNIGHTMETAL_BLOCK_BB;
	}

	@Override
	public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
		if(this.shouldDamage(entity)) {
			entity.damage(world.getDamageSources().cactus(), DAMAGE);
		}
	}

	@Override
	protected boolean canPathfindThrough(BlockState state, NavigationType type) {
		return false;
	}

	@Override
	public void appendTooltip(ItemStack stack, Item.TooltipContext tooltipContext, List<Text> tooltip, TooltipConfig options) {
		tooltip.add(Text.translatable("tooltip.twilightforest.knightmetal_block.tooltip").setColor(16777199));
		super.appendTooltip(stack, tooltipContext, tooltip, options);
	}

	private boolean shouldDamage(Entity entity) {
		return !(entity instanceof ItemEntity || entity.isSpectator() || entity.isSneaking());
	}
}
