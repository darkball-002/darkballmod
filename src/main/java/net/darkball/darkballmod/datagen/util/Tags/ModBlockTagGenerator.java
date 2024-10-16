package net.darkball.darkballmod.datagen.util.Tags;

import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;
import net.darkball.darkballmod.darkballmod;
import net.darkball.darkballmod.MainClass.block.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider{
	public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, darkballmod.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider pProvider) {
		
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
		 		 .add(ModBlocks.SAPPHIRE_ORE.get(),
		 		      ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
		 		      ModBlocks.BEDROCK_SAPPHIRE_ORE.get(),
		 		      ModBlocks.SAPPHIRE_BLOCK.get()); 
		
		this.tag(BlockTags.NEEDS_IRON_TOOL)
        		 .add(ModBlocks.SAPPHIRE_ORE.get());
		
		this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
				 .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
				 	  ModBlocks.SAPPHIRE_BLOCK.get(),
					  ModBlocks.GEM_POLISHING_STATION.get());
		
		this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
				 .add(ModBlocks.BEDROCK_SAPPHIRE_ORE.get());
				 
		     
		
		     
		     
	}

}
