package net.darkball.darkballmod.datagen.loot;

import java.util.Set;

import net.darkball.darkballmod.MainClass.item.*;
import net.darkball.darkballmod.MainClass.block.*;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;



public class ModBlockLootTables extends BlockLootSubProvider {

	public ModBlockLootTables() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
		
	}

	@Override
	protected void generate() {
		this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
		
		
		this.add(ModBlocks.SAPPHIRE_ORE.get(),
				block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE_GEM.get()));
		this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
				block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE_GEM.get()));
		this.add(ModBlocks.BEDROCK_SAPPHIRE_ORE.get(),
				block -> createCopperLikeOreDrops(ModBlocks.BEDROCK_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE_GEM.get()));
				
		this.dropSelf(ModBlocks.GEM_POLISHING_STATION.get());
		
	}
	
	protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
		return createSilkTouchDispatchTable(pBlock,
				this.applyExplosionDecay(pBlock,
						LootItem.lootTableItem(item)
								.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
								.apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}
