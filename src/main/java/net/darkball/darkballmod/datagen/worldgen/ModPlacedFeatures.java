package net.darkball.darkballmod.datagen.worldgen;


import java.util.List;
import net.darkball.darkballmod.darkballmod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class ModPlacedFeatures {
	public static final ResourceKey<PlacedFeature> SAPPHIER_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
	
	
	public static void bootstrap(BootstapContext<PlacedFeature> context) {
		HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
		
		register(context, SAPPHIER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
				  ModOrePlacement.commonOrePlacement(8,
						  HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

	}
	
	

	public static ResourceKey<PlacedFeature> registerKey(String name) {
		return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(darkballmod.MOD_ID, name));
	} 
	
	public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> Key, Holder<ConfiguredFeature<?, ?>>configuration,
			                    List<PlacementModifier>modifiers) {
		context.register(Key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}
	
	
	
}
