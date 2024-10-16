package net.darkball.darkballmod.datagen.util;

import net.darkball.darkballmod.darkballmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
	public static class Blocks {
		
		//TIERS
		public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("need_sapphire_tool");
		public static final TagKey<Block> NEEDS_DARK_TOOL = tag("need_dark_tool");
		public static final TagKey<Block> NEEDS_WHITE_TOOL = tag("need_white_tool");
		public static final TagKey<Block> NEEDS_DARK_WHITE_TOOL = tag("need_dark_white_tool");
		
		//BLOCK
		public static final TagKey<Block> SAPPHIRE_BLOCK = tag("sapphire_block");
		
		
		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(darkballmod.MOD_ID, name));
		}
	}
	
	public static class Items {
		
		
		public static final TagKey<Item> DARK_SWORD = tag("dark_steel_sword");
		
		
		private static TagKey<Item> tag(String name) {
			return ItemTags.create(new ResourceLocation(darkballmod.MOD_ID, name));
		}
	}
	
	
	
}
