package net.quiltmc.users.autumn.twilightforest.init.item.custom;

import net.minecraft.client.item.TooltipConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class RabbitPocketWatchItem extends Item {
	public RabbitPocketWatchItem(Settings settings) {
		super(settings);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if(entity instanceof LivingEntity living) {
			if((slot >= 0 && slot <= 8) || slot == PlayerInventory.OFF_HAND_SLOT) {
				living.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED));
				living.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST));
			}
			if(living.isHolding(this)) {
				living.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE));
			}
		}
	}

	@Override
	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipConfig config) {
		tooltip.add(Text.translatable("tooltip.twilightforest.rabbit_pocket_watch.tooltip").setColor(16773271));
		super.appendTooltip(stack, context, tooltip, config);
	}
}
