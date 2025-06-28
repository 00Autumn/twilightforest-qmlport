package net.quiltmc.users.autumn.twilightforest.init.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipConfig;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.EquipmentSlotGroup;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.quiltmc.users.autumn.twilightforest.Twilightforest;
import net.quiltmc.users.autumn.twilightforest.init.item.custom.RabbitPocketWatchItem;

import java.util.List;

public class TFItems {

	//ARMOR & TOOL INGREDIENTS
	public static final Item NAGA_SCALE = registerItem("naga_scale", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item LIVEROOT = registerItem("liveroot", new Item(new Item.Settings()));
	public static final Item RAW_IRONWOOD = registerItem("raw_ironwood", new Item(new Item.Settings()));
	public static final Item IRONWOOD_INGOT = registerItem("ironwood_ingot", new Item(new Item.Settings()));
	public static final Item STEELEAF_INGOT = registerItem("steeleaf_ingot", new Item(new Item.Settings()));
	public static final Item ARMOR_SHARD = registerItem("armor_shard", new Item(new Item.Settings()));
	public static final Item ARMOR_SHARD_CLUSTER = registerItem("armor_shard_cluster", new Item(new Item.Settings()));
	public static final Item KNIGHTMETAL_INGOT = registerItem("knightmetal_ingot", new Item(new Item.Settings()));
	public static final Item FIERY_BLOOD = registerItem("fiery_blood", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item FIERY_TEARS = registerItem("fiery_tears", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item FIERY_INGOT = registerItem("fiery_ingot", new Item(new Item.Settings().fireproof().rarity(Rarity.UNCOMMON)));
	public static final Item ARCTIC_FUR = registerItem("arctic_fur", new Item(new Item.Settings()));
	public static final Item ALPHA_YETI_FUR = registerItem("alpha_yeti_fur", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

	//MISC INGREDIENTS
	public static final Item RAVEN_FEATHER = registerItem("raven_feather", new Item(new Item.Settings()));
	public static final Item MAGIC_MAP_FOCUS = registerItem("magic_map_focus", new Item(new Item.Settings()));
	public static final Item MAZE_MAP_FOCUS = registerItem("maze_map_focus", new Item(new Item.Settings()));
	public static final Item CHARM_OF_LIFE_I = registerItem("charm_of_life_i", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item CHARM_OF_LIFE_II = registerItem("charm_of_life_ii", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item CHARM_OF_KEEPING_I = registerItem("charm_of_keeping_i", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item CHARM_OF_KEEPING_II = registerItem("charm_of_keeping_ii", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item CHARM_OF_KEEPING_III = registerItem("charm_of_keeping_iii", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item BORER_ESSENCE = registerItem("borer_essence", new Item(new Item.Settings()));
	public static final Item CARMINITE = registerItem("carminite", new Item(new Item.Settings()));
	public static final Item EMPERORS_CLOTH = registerItem("emperors_cloth", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
	public static final Item CROWN_SPLINTER = registerItem("crown_splinter", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

	//MISC ITEMS
	public static final Item TOWER_KEY = registerItem("tower_key", new Item(new Item.Settings().fireproof().rarity(Rarity.UNCOMMON)));

	//FOOD ITEMS
	public static final Item RAW_VENISON = registerItem("raw_venison", new Item(new Item.Settings().food(TFFoodComponents.RAW_VENISON)));
	public static final Item COOKED_VENISON = registerItem("cooked_venison", new Item(new Item.Settings().food(TFFoodComponents.COOKED_VENISON)));
	public static final Item RAW_MEEF = registerItem("raw_meef", new Item(new Item.Settings().food(TFFoodComponents.RAW_MEEF)));
	public static final Item COOKED_MEEF = registerItem("cooked_meef", new Item(new Item.Settings().food(TFFoodComponents.COOKED_MEEF)));
	public static final Item MEEF_STROGANOFF = registerItem("meef_stroganoff", new Item(new Item.Settings().maxCount(1).food(TFFoodComponents.MEEF_STROGANOFF)));
	public static final Item HYDRA_CHOP = registerItem("hydra_chop", new Item(new Item.Settings().food(TFFoodComponents.HYDRA_CHOP)));
	public static final Item TORCHBERRIES = registerItem("torchberries", new Item(new Item.Settings().food(TFFoodComponents.TORCHBERRIES)));
	public static final Item EXPERIMENT_115 = registerItem("experiment_115", new Item(new Item.Settings().food(TFFoodComponents.EXPERIMENT_115)) {
		@Override
		public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipConfig config) {
			tooltip.add(Text.translatable("tooltip.twilightforest.experiment_115.tooltip").setColor(16717824));
			super.appendTooltip(stack, context, tooltip, config);
		}
	});
	public static final Item MAZE_WAFER = registerItem("maze_wafer", new Item(new Item.Settings().food(TFFoodComponents.MAZE_WAFER)));

	//EQUIPMENT & TRINKETS
	public static final Item RABBIT_POCKET_WATCH = registerItem("rabbit_pocket_watch", new RabbitPocketWatchItem(new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)));
	public static final Item IRONWOOD_SWORD = registerItem("ironwood_sword",
		new SwordItem(TFToolMaterials.IRONWOOD, createSwordSettings(4.0, -2.4)));
	public static final Item IRONWOOD_PICKAXE = registerItem("ironwood_pickaxe",
		new PickaxeItem(TFToolMaterials.IRONWOOD, createPickaxeSettings(2.0, -2.8)));
	public static final Item IRONWOOD_SHOVEL = registerItem("ironwood_shovel",
		new ShovelItem(TFToolMaterials.IRONWOOD, createShovelSettings(2.5, -3.0)));
	public static final Item IRONWOOD_AXE = registerItem("ironwood_axe",
		new AxeItem(TFToolMaterials.IRONWOOD, createAxeSettings(7.0, -3.1)));
	public static final Item IRONWOOD_HOE = registerItem("ironwood_hoe",
		new HoeItem(TFToolMaterials.IRONWOOD, createAxeSettings(-1.0, -1.0)));
	public static final Item FIERY_SWORD = registerItem("fiery_sword",
		new SwordItem(TFToolMaterials.FIERY, createSwordSettings(4.0, -2.4)));
	public static final Item FIERY_PICKAXE = registerItem("fiery_pickaxe",
		new PickaxeItem(TFToolMaterials.FIERY, createPickaxeSettings(2.0, -2.8)));
	public static final Item STEELEAF_SWORD = registerItem("steeleaf_sword",
		new SwordItem(TFToolMaterials.STEELEAF, createSwordSettings(4.0, -2.4)));
	public static final Item STEELEAF_PICKAXE = registerItem("steeleaf_pickaxe",
		new PickaxeItem(TFToolMaterials.STEELEAF, createPickaxeSettings(2.0, -2.8)));
	public static final Item STEELEAF_SHOVEL = registerItem("steeleaf_shovel",
		new ShovelItem(TFToolMaterials.STEELEAF, createShovelSettings(2.5, -3.0)));
	public static final Item STEELEAF_AXE = registerItem("steeleaf_axe",
		new AxeItem(TFToolMaterials.STEELEAF, createAxeSettings(7.0, -3.0)));
	public static final Item STEELEAF_HOE = registerItem("steeleaf_hoe",
		new HoeItem(TFToolMaterials.STEELEAF, createAxeSettings(-2.0, -0.5)));
	public static final Item KNIGHTMETAL_SWORD = registerItem("knightmetal_sword",
		new SwordItem(TFToolMaterials.KNIGHTMETAL, createSwordSettings(4.0, -2.4)));
	public static final Item KNIGHTMETAL_PICKAXE = registerItem("knightmetal_pickaxe",
		new PickaxeItem(TFToolMaterials.KNIGHTMETAL, createPickaxeSettings(2.0, -2.8)));
	public static final Item KNIGHTMETAL_AXE = registerItem("knightmetal_axe",
		new AxeItem(TFToolMaterials.KNIGHTMETAL, createAxeSettings(7.0, -3.0)));
	public static final Item GOLD_MINOTAUR_AXE = registerItem("gold_minotaur_axe",
		new AxeItem(ToolMaterials.GOLD, createAxeSettings(7.0, -2.8)));
	public static final Item DIAMOND_MINOTAUR_AXE = registerItem("diamond_minotaur_axe",
		new AxeItem(ToolMaterials.GOLD, createAxeSettings(7.0, -3.0)));
	public static final Item MAZEBREAKER_PICKAXE = registerItem("mazebreaker_pickaxe",
		new PickaxeItem(ToolMaterials.DIAMOND, createPickaxeSettings(2.0, -2.8)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Twilightforest.MOD_ID, name), item);
	}

	public static Item.Settings createSwordSettings(double attackDamage, double attackSpeed) {
		return new Item.Settings().component(DataComponentTypes.ATTRIBUTE_MODIFIERS,
			AttributeModifiersComponent.builder()
				.add(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(Identifier.of("twilightforest", "sword_damage"),
						attackDamage, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.add(EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(Identifier.of("twilightforest", "sword_speed"),
						attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.build()
		);
	}
	public static Item.Settings createPickaxeSettings(double attackDamage, double attackSpeed) {
		return new Item.Settings().component(DataComponentTypes.ATTRIBUTE_MODIFIERS,
			AttributeModifiersComponent.builder()
				.add(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(Identifier.of("twilightforest", "pickaxe_damage"),
						attackDamage, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.add(EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(Identifier.of("twilightforest", "pickaxe_speed"),
						attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.build()
		);
	}
	public static Item.Settings createShovelSettings(double attackDamage, double attackSpeed) {
		return new Item.Settings().component(DataComponentTypes.ATTRIBUTE_MODIFIERS,
			AttributeModifiersComponent.builder()
				.add(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(Identifier.of("twilightforest", "shovel_damage"),
						attackDamage, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.add(EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(Identifier.of("twilightforest", "shovel_speed"),
						attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.build()
		);
	}
	public static Item.Settings createAxeSettings(double attackDamage, double attackSpeed) {
		return new Item.Settings().component(DataComponentTypes.ATTRIBUTE_MODIFIERS,
			AttributeModifiersComponent.builder()
				.add(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(Identifier.of("twilightforest", "axe_damage"),
						attackDamage, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.add(EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(Identifier.of("twilightforest", "axe_speed"),
						attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.build()
		);
	}
	public static Item.Settings createHoeSettings(double attackDamage, double attackSpeed) {
		return new Item.Settings().component(DataComponentTypes.ATTRIBUTE_MODIFIERS,
			AttributeModifiersComponent.builder()
				.add(EntityAttributes.GENERIC_ATTACK_DAMAGE,
					new EntityAttributeModifier(Identifier.of("twilightforest", "hoe_damage"),
						attackDamage, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.add(EntityAttributes.GENERIC_ATTACK_SPEED,
					new EntityAttributeModifier(Identifier.of("twilightforest", "hoe_speed"),
						attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
					EquipmentSlotGroup.MAINHAND)
				.build()
		);
	}

	public static void registerItems() {
		Twilightforest.LOGGER.info("registering items for " + Twilightforest.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addItem(NAGA_SCALE);
			entries.addItem(LIVEROOT);
			entries.addItem(RAW_IRONWOOD);
			entries.addItem(IRONWOOD_INGOT);
			entries.addItem(STEELEAF_INGOT);
			entries.addItem(ARMOR_SHARD);
			entries.addItem(ARMOR_SHARD_CLUSTER);
			entries.addItem(KNIGHTMETAL_INGOT);
			entries.addItem(FIERY_BLOOD);
			entries.addItem(FIERY_TEARS);
			entries.addItem(FIERY_INGOT);
			entries.addItem(ARCTIC_FUR);
			entries.addItem(ALPHA_YETI_FUR);

			entries.addItem(RAVEN_FEATHER);
			entries.addItem(MAGIC_MAP_FOCUS);
			entries.addItem(MAZE_MAP_FOCUS);
			entries.addItem(CHARM_OF_LIFE_I);
			entries.addItem(CHARM_OF_LIFE_II);
			entries.addItem(CHARM_OF_KEEPING_I);
			entries.addItem(CHARM_OF_KEEPING_II);
			entries.addItem(CHARM_OF_KEEPING_III);
			entries.addItem(BORER_ESSENCE);
			entries.addItem(CARMINITE);
			entries.addItem(EMPERORS_CLOTH);
			entries.addItem(CROWN_SPLINTER);

			});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(entries -> {
			entries.addItem(TOWER_KEY);

			entries.addItem(RABBIT_POCKET_WATCH);
			entries.addItem(IRONWOOD_SWORD);
			entries.addItem(IRONWOOD_PICKAXE);
			entries.addItem(IRONWOOD_SHOVEL);
			entries.addItem(IRONWOOD_AXE);
			entries.addItem(IRONWOOD_HOE);
			entries.addItem(STEELEAF_SWORD);
			entries.addItem(STEELEAF_PICKAXE);
			entries.addItem(STEELEAF_SHOVEL);
			entries.addItem(STEELEAF_AXE);
			entries.addItem(STEELEAF_HOE);
			entries.addItem(KNIGHTMETAL_SWORD);
			entries.addItem(KNIGHTMETAL_PICKAXE);
			entries.addItem(KNIGHTMETAL_AXE);
			entries.addItem(FIERY_SWORD);
			entries.addItem(FIERY_PICKAXE);
			entries.addItem(GOLD_MINOTAUR_AXE);
			entries.addItem(DIAMOND_MINOTAUR_AXE);
			entries.addItem(MAZEBREAKER_PICKAXE);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINKS).register(entries -> {
			entries.addItem(RAW_VENISON);
			entries.addItem(COOKED_VENISON);
			entries.addItem(RAW_MEEF);
			entries.addItem(COOKED_MEEF);
			entries.addItem(MEEF_STROGANOFF);
			entries.addItem(HYDRA_CHOP);
			entries.addItem(TORCHBERRIES);
			entries.addItem(EXPERIMENT_115);
			entries.addItem(MAZE_WAFER);

		});

	}
}
