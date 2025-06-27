package net.quiltmc.users.autumn.twilightforest;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.quiltmc.users.autumn.twilightforest.datagen.providers.*;

public class TwilightforestDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TFBlockTagProvider::new);
		pack.addProvider(TFItemTagProvider::new);
		pack.addProvider(TFLootTableProvider::new);
		pack.addProvider(TFModelProvider::new);
		pack.addProvider(TFRecipeProvider::new);

	}
}
