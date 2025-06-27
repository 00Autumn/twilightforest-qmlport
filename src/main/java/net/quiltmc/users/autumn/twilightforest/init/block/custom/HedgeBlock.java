package net.quiltmc.users.autumn.twilightforest.init.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;

public class HedgeBlock extends Block {
	private static final VoxelShape HEDGE_BB = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 15.0, 15.0); // Full block minus 1 height

	private static final int DAMAGE = 3;

	public HedgeBlock(Settings settings) {
		super(settings);
	}

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
		if (!world.isClient && world.getRandom().nextFloat() < 0.25f) {
			world.setBlockState(pos, TFBlocks.HEDGE_ROSE.getDefaultState());
		}
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return HEDGE_BB;
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return HEDGE_BB;
	}

	@Override
	public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
		if(this.shouldDamage(entity)) {
			entity.damage(world.getDamageSources().cactus(), DAMAGE);
		}
	}

	@Override
	public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
		player.damage(world.getDamageSources().cactus(), DAMAGE);
		super.afterBreak(world, player, pos, state, blockEntity, tool);

	}

	@Override
	public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
		if (!world.isClient && this.shouldDamage(player)) {
			player.damage(world.getDamageSources().cactus(), DAMAGE);
		}
		super.onBlockBreakStart(state, world, pos, player);
	}

	@Override
	protected boolean canPathfindThrough(BlockState state, NavigationType type) {
		return false;
	}

	private boolean shouldDamage(Entity entity) {
		return !(entity instanceof SpiderEntity || entity instanceof ItemEntity || entity.isSpectator() || entity.isSneaking());
	}
}
