package net.darkball.darkballmod.datagen.models;

import net.darkball.darkballmod.darkballmod;
import net.darkball.darkballmod.MainClass.block.*;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, darkballmod.MOD_ID, exFileHelper);

	}

	@Override
	protected void registerStatesAndModels() {
		blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
		
		
		blockWithItem(ModBlocks.SAPPHIRE_ORE);
		blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
		blockWithItem(ModBlocks.BEDROCK_SAPPHIRE_ORE);
		
		simpleBlockWithItem(ModBlocks.GEM_POLISHING_STATION.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/gem_polishing_station")));
	}
	private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
