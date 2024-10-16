package net.darkball.darkballmod.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import net.darkball.darkballmod.darkballmod;
import net.darkball.darkballmod.datagen.worldgen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
   public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
		   .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
		   .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
		   .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
   
   
   
   public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
       super(output, registries, BUILDER, Set.of(darkballmod.MOD_ID));
       
   }
}
