package net.quiltmc.users.autumn.twilightforest.component;

import net.minecraft.component.DataComponentType;

import net.minecraft.component.type.NbtComponent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quiltmc.users.autumn.twilightforest.Twilightforest;

import java.util.function.UnaryOperator;

public class TFDataComponentTypes {
	public static final DataComponentType<NbtComponent> SOULBOUND =
		registerDataComponentType("soulbound", nbtComponentBuilder -> nbtComponentBuilder.codec(NbtComponent.CODEC));

	private static <T>DataComponentType<T> registerDataComponentType(String name, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
		return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(Twilightforest.MOD_ID,  name), builderOperator.apply(DataComponentType.builder()).build());
	}

	public static void registerDataComponentTypes() {
		Twilightforest.LOGGER.info("Registering data component types for " + Twilightforest.MOD_ID);
	}
}
