package net.quiltmc.users.autumn.twilightforest.init.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.quiltmc.users.autumn.twilightforest.Twilightforest;
import net.quiltmc.users.autumn.twilightforest.init.block.custom.ArcticFurBlock;
import net.quiltmc.users.autumn.twilightforest.init.block.custom.FieryMetalBlock;
import net.quiltmc.users.autumn.twilightforest.init.block.custom.HedgeBlock;
import net.quiltmc.users.autumn.twilightforest.init.block.custom.KnightmetalBlock;

public class TFBlocks {

	//NATURAL BLOCKS
	public static final Block ROOT_BLOCK = registerBlock("root_block",
		new Block(AbstractBlock.Settings.create().lavaIgnitable().mapColor(MapColor.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0F, 3.0F)));
	public static final Block LIVEROOT_BLOCK = registerBlock("liveroot_block",
		new Block(AbstractBlock.Settings.create().lavaIgnitable().mapColor(MapColor.GREEN).sounds(BlockSoundGroup.WOOD).strength(2.0F, 3.0F)));

	//STORAGE BLOCKS
	public static final Block MAZE_SLIME_BLOCK = registerBlock("maze_slime_block",
		new SlimeBlock(AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK).mapColor(MapColor.STONE)));
	public static final Block IRONWOOD_BLOCK = registerBlock("ironwood_block",
		new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.EMERALD).sounds(BlockSoundGroup.METAL)));
	public static final Block STEELEAF_BLOCK = registerBlock("steeleaf_block",
		new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.GREEN).sounds(BlockSoundGroup.METAL)));
	public static final Block KNIGHTMETAL_BLOCK = registerBlock("knightmetal_block",
		new KnightmetalBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.ANVIL)));
	public static final Block FIERY_METAL_BLOCK = registerBlock("fiery_metal_block",
		new FieryMetalBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.RED_TERRACOTTA).sounds(BlockSoundGroup.METAL)));
	public static final Block ARCTIC_FUR_BLOCK = registerBlock("arctic_fur_block",
		new ArcticFurBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

	//LABYRINTH BLOCKS
	public static final Block MAZESTONE = registerBlock("mazestone",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block MAZESTONE_BRICK = registerBlock("mazestone_brick",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block MAZESTONE_LARGE_BRICK = registerBlock("mazestone_large_brick",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block CHISELED_MAZESTONE = registerBlock("chiseled_mazestone",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block CUT_MAZESTONE = registerBlock("cut_mazestone",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block DECORATIVE_MAZESTONE = registerBlock("decorative_mazestone",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block CRACKED_MAZESTONE = registerBlock("cracked_mazestone",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block MOSSY_MAZESTONE = registerBlock("mossy_mazestone",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block MAZESTONE_MOSAIC = registerBlock("mazestone_mosaic",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));
	public static final Block MAZESTONE_BORDER = registerBlock("mazestone_border",
		new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).toolRequired().sounds(BlockSoundGroup.STONE).strength(100.0F, 5.0F)));

	//STRONGHOLD BLOCKS
	public static final Block STRONGHOLD_SHIELD = registerBlock("stronghold_shield",
		new Block(AbstractBlock.Settings.create().dropsNothing().mapColor(MapColor.STONE).pistonBehavior(PistonBehavior.BLOCK).toolRequired().sounds(BlockSoundGroup.METAL).strength(-1.0F, 6000000.0F)));
	public static final Block UNDERBRICK = registerBlock("underbrick",
		new Block(AbstractBlock.Settings.create().mapColor(MapColor.WOOD).toolRequired().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(1.5F, 6.0F)));
	public static final Block MOSSY_UNDERBRICK = registerBlock("mossy_underbrick",
		new Block(AbstractBlock.Settings.create().mapColor(MapColor.WOOD).toolRequired().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(1.5F, 6.0F)));
	public static final Block CRACKED_UNDERBRICK = registerBlock("cracked_underbrick",
		new Block(AbstractBlock.Settings.create().mapColor(MapColor.WOOD).toolRequired().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(1.5F, 6.0F)));
	public static final Block UNDERBRICK_FLOOR = registerBlock("underbrick_floor",
		new Block(AbstractBlock.Settings.create().mapColor(MapColor.WOOD).toolRequired().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(1.5F, 6.0F)));

	//DARK TOWER BLOCKS
	public static final Block TOWERWOOD = registerBlock("towerwood",
		new Block(AbstractBlock.Settings.create().lavaIgnitable().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.WOOD).strength(40.0F, 6.0F)));
	public static final Block ENCASED_TOWERWOOD = registerBlock("encased_towerwood",
		new Block(AbstractBlock.Settings.create().lavaIgnitable().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.YELLOW_TERRACOTTA).sounds(BlockSoundGroup.WOOD).strength(40.0F, 6.0F)));
	public static final Block CRACKED_TOWERWOOD = registerBlock("cracked_towerwood",
		new Block(AbstractBlock.Settings.create().lavaIgnitable().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.WOOD).strength(40.0F, 6.0F)));
	public static final Block MOSSY_TOWERWOOD = registerBlock("mossy_towerwood",
		new Block(AbstractBlock.Settings.create().lavaIgnitable().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.WOOD).strength(40.0F, 6.0F)));
	public static final InfestedBlock INFESTED_TOWERWOOD = (InfestedBlock) registerBlock("infested_towerwood",
		new InfestedBlock(TFBlocks.TOWERWOOD, AbstractBlock.Settings.create().dropsNothing().lavaIgnitable().instrument(NoteBlockInstrument.FLUTE).mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.WOOD).strength(2.0F, 6.0F)));
	public static final Block ANTIBUILT_BLOCK = registerBlock("antibuilt_block",
		new Block(AbstractBlock.Settings.create().dropsNothing().nonOpaque().pistonBehavior(PistonBehavior.BLOCK).sounds(BlockSoundGroup.WOOD).strength(0.3F, 2000.0F)));
	public static final Block FAKE_GOLD = registerBlock("fake_gold",
		new Block(AbstractBlock.Settings.create().dropsNothing().pistonBehavior(PistonBehavior.BLOCK).sounds(BlockSoundGroup.METAL).strength(50.0F, 2000.0F)));
	public static final Block FAKE_DIAMOND = registerBlock("fake_diamond",
		new Block(AbstractBlock.Settings.create().dropsNothing().pistonBehavior(PistonBehavior.BLOCK).sounds(BlockSoundGroup.METAL).strength(50.0F, 2000.0F)));

	//MISC BLOCKS
	public static final Block HEDGE = registerBlock("hedge",
		new HedgeBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.GRASS).strength(2.0F, 6.0F)));
	public static final Block HEDGE_ROSE = registerBlock("hedge_rose",
		new HedgeBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.GRASS).strength(2.0F, 6.0F)));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Twilightforest.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(Twilightforest.MOD_ID, name),
			new BlockItem(block, new Item.Settings()));
	}

	public static void registerBlocks() {
		Twilightforest.LOGGER.info("Registering blocks for " + Twilightforest.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(entries -> {
			entries.addItem(ROOT_BLOCK);
			entries.addItem(LIVEROOT_BLOCK);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addItem(IRONWOOD_BLOCK);
			entries.addItem(STEELEAF_BLOCK);
			entries.addItem(KNIGHTMETAL_BLOCK);
			entries.addItem(FIERY_METAL_BLOCK);
			entries.addItem(ARCTIC_FUR_BLOCK);

			entries.addItem(MAZESTONE);
			entries.addItem(MAZESTONE_BRICK);
			entries.addItem(MAZESTONE_LARGE_BRICK);
			entries.addItem(CHISELED_MAZESTONE);
			entries.addItem(CUT_MAZESTONE);
			entries.addItem(DECORATIVE_MAZESTONE);
			entries.addItem(CRACKED_MAZESTONE);
			entries.addItem(MOSSY_MAZESTONE);
			entries.addItem(MAZESTONE_MOSAIC);
			entries.addItem(MAZESTONE_BORDER);

			entries.addItem(UNDERBRICK);
			entries.addItem(MOSSY_UNDERBRICK);
			entries.addItem(CRACKED_UNDERBRICK);
			entries.addItem(UNDERBRICK_FLOOR);

			entries.addItem(TOWERWOOD);
			entries.addItem(ENCASED_TOWERWOOD);
			entries.addItem(CRACKED_TOWERWOOD);

			entries.addItem(HEDGE);
			entries.addItem(HEDGE_ROSE);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL_BLOCKS).register(entries -> {
			entries.addItem(STRONGHOLD_SHIELD);

			entries.addItem(INFESTED_TOWERWOOD);
			entries.addItem(ANTIBUILT_BLOCK);
			entries.addItem(FAKE_GOLD);
			entries.addItem(FAKE_DIAMOND);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE_BLOCKS).register(entries -> {
			entries.addItem(MAZE_SLIME_BLOCK);

		});
	}
}
