package net.quiltmc.users.autumn.twilightforest;

import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;
import net.quiltmc.users.autumn.twilightforest.init.item.TFFoodComponents;
import net.quiltmc.users.autumn.twilightforest.init.item.TFItemGroups;
import net.quiltmc.users.autumn.twilightforest.init.item.TFItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Twilightforest implements ModInitializer {
	public static final String MOD_ID = "twilightforest";
    public static final Logger LOGGER = LoggerFactory.getLogger("twilightforest");

    @Override
    public void onInitialize(ModContainer mod) {
		TFItems.registerItems();
		TFBlocks.registerBlocks();
		TFItemGroups.registerItemGroups();
		TFFoodComponents.registerFoodComponents();
    }
}
