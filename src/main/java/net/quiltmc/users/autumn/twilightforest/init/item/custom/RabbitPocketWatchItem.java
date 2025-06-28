package net.quiltmc.users.autumn.twilightforest.init.item.custom;

import net.minecraft.client.item.TooltipConfig;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.quiltmc.users.autumn.twilightforest.component.TFDataComponentTypes;

import java.util.List;
import java.util.UUID;

public class RabbitPocketWatchItem extends Item {
	public RabbitPocketWatchItem(Settings settings) {
		super(settings);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if (!(entity instanceof PlayerEntity player)) return; //Only players can be owners
		UUID ownerUUID = RabbitPocketWatchItem.getOwnerUUID(stack);
		if (ownerUUID == null || !ownerUUID.equals(player.getUuid())) {
			//Not the owner, do nothing
			return;
		}
		if ((slot >= 0 && slot <= 8) || slot == PlayerInventory.OFF_HAND_SLOT) {
			player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED));
			player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST));
		}
		if (player.isHolding(this)) {
			player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE));
		}
	}

	@Override
	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipConfig config) {
		tooltip.add(Text.translatable("tooltip.twilightforest.rabbit_pocket_watch.tooltip").setColor(16773271));
		super.appendTooltip(stack, context, tooltip, config);
	}

	@Override
	public void onCraftByPlayer(ItemStack stack, World world, PlayerEntity player) {
		if (!isSoulbound(stack)) {
			bindToPlayer(stack, player);
		}
		if (stack.get(DataComponentTypes.CUSTOM_NAME) == null) {
			stack.set(DataComponentTypes.CUSTOM_NAME, Text.literal(player.getName().getString() + "'s Pocket Watch"));
		}
	}

	//Writing data
	public static void bindToPlayer(ItemStack stack, PlayerEntity player) {
		NbtCompound nbt = new NbtCompound();
		nbt.putUuid("OwnerUUID", player.getUuid());
		nbt.putString("OwnerName", player.getName().getString());

		NbtComponent component = NbtComponent.of(nbt); //Wrap vanilla compound

		stack.set(TFDataComponentTypes.SOULBOUND, component);
	}

	//Reading data
	@SuppressWarnings("deprecation")
	public static UUID getOwnerUUID(ItemStack stack) {
		NbtComponent component = stack.get(TFDataComponentTypes.SOULBOUND);
		if (component == null) return null;

		NbtCompound nbt = component.getNbt();  //Deprecated, but safe for now
		return nbt.getUuid("OwnerUUID");
	}

	//Helper
	public static boolean isSoulbound(ItemStack stack) {
		return stack.get(TFDataComponentTypes.SOULBOUND) != null;
	}

}
