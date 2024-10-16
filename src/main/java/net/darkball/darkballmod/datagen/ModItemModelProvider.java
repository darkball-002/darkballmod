package net.darkball.darkballmod.datagen;

import net.darkball.darkballmod.darkballmod;
import net.darkball.darkballmod.MainClass.item.*;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, darkballmod.MOD_ID, existingFileHelper);
		
	}

	@Override
	protected void registerModels() {
		
		simpleItem(ModItems.RAW_WHITE);
		simpleItem(ModItems.RAW_DARK);
		
		simpleItem(ModItems.SAPPHIRE_GEM);
		simpleItem(ModItems.WHITE_STEEL);
		simpleItem(ModItems.DARK_STEEL);
		simpleItem(ModItems.DARK_WHITE_UPGRADE_SMITHING_TEMPLATE);
		simpleItem(ModItems.IRON_STICK);
		
		ToolItem(ModItems.SAPPHIRE_SWORD);
		ToolItem(ModItems.DARK_SWORD);
		ToolItem(ModItems.WHITE_SWORD);
		ToolItem(ModItems.DARK_WHITE_SWORD);
		
		ToolItem(ModItems.SAPPHIRE_PICKAXE);
		ToolItem(ModItems.DARK_PICKAXE);
		ToolItem(ModItems.WHITE_PICKAXE);
		ToolItem(ModItems.DARK_WHITE_PICKAXE);
		
		ToolItem(ModItems.SAPPHIRE_AXE);
		ToolItem(ModItems.WHITE_AXE);
		ToolItem(ModItems.DARK_AXE);
		ToolItem(ModItems.DARK_WHITE_AXE);
		
		ToolItem(ModItems.SAPPHIRE_SHOVEL);
		ToolItem(ModItems.WHITE_SHOVEL);
		ToolItem(ModItems.DARK_SHOVEL);
		ToolItem(ModItems.DARK_WHITE_SHOVEL);
		
		
		ToolItem(ModItems.SAPPHIRE_HOE);
		ToolItem(ModItems.WHITE_HOE);
		ToolItem(ModItems.DARK_HOE);
		ToolItem(ModItems.DARK_WHITE_HOE);
		
		
		ToolItem(ModItems.SICKLE);
		ToolItem(ModItems.VOID_SICKLE);
			
	}
	
	
		
	
	private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
		return withExistingParent(item.getId().getPath(),
				new ResourceLocation("item/generated")).texture("layer0",
			    new ResourceLocation(darkballmod.MOD_ID,"item/" + item.getId().getPath()));
	}
	private ItemModelBuilder ToolItem(RegistryObject<Item> item) {
		return withExistingParent(item.getId().getPath(),
				new ResourceLocation("item/handheld")).texture("layer0",
			    new ResourceLocation(darkballmod.MOD_ID,"item/" + item.getId().getPath()));
	}
}