package net.darkball.darkballmod.datagen.worldgen;

import java.util.List;

import net.darkball.darkballmod.darkballmod;
import net.darkball.darkballmod.MainClass.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
	public static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
	
	

	public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>>context) {
		RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		RuleTest bedrockReplaceable = new BlockMatchTest(Blocks.BEDROCK);
	
		
		
		List<OreConfiguration.TargetBlockState> overworldsapphireOres = List.of(
				OreConfiguration.target(stoneReplaceable, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
				OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()),
				OreConfiguration.target(bedrockReplaceable, ModBlocks.BEDROCK_SAPPHIRE_ORE.get().defaultBlockState()));

		
		
		register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldsapphireOres, 8));
    }
	
	
	
	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(darkballmod.MOD_ID,name));
	}
	
	
	
	private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
			                                                                              ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
	    context.register(key, new ConfiguredFeature<>(feature, configuration));
	}  
    
	
}