package net.darkball.darkballmod.datagen.recipe;

import java.util.List;
import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;

import net.darkball.darkballmod.darkballmod;
import net.darkball.darkballmod.MainClass.block.*;
import net.darkball.darkballmod.MainClass.item.*;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder{
	
	private static final List<ItemLike> WHITE_STEEL_SMELTABLES = List.of(ModItems.RAW_WHITE.get());
	private static final List<ItemLike> RAW_WHITE_SMELTABLES = List.of(Items.IRON_INGOT);
	

	
	public ModRecipeProvider(PackOutput pOutput) {
		super(pOutput);
	}
	
	
	
	
	
	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
	
		    
				oreSmelting(pWriter, WHITE_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.WHITE_STEEL.get(), 0.50F, 200, "white_steel");
				oreSmelting(pWriter, RAW_WHITE_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_WHITE.get(), 0.25F, 500, "unfinished_white_steel");
		
		
				oreBlasting(pWriter, WHITE_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.WHITE_STEEL.get(), 0.25F, 100, "white_steel");
				oreBlasting(pWriter, RAW_WHITE_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_WHITE.get(), 0.25F, 300, "unfinished_white_steel");
	
		//DARK_WHITE_SWORD
				addSmithingRecipe(pWriter, ModItems.DARK_SWORD.get(), ModItems.WHITE_SWORD.get(), ModItems.DARK_WHITE_SWORD.get());

		//DARK_WHITE_AXE
				//addSmithingRecipe(pWriter, ModItems.DARK_AXE.get(), ModItems.WHITE_AXE.get(), ModItems.DARK_WHITE_AXE.get());
				
		//DARK_WHITE_PICKAXE
				//addSmithingRecipe(pWriter, ModItems.DARK_PICKAXE.get(), ModItems.WHITE_PICKAXE.get(), ModItems.DARK_WHITE_PICKAXE.get());

		//DARK_WHITE_SHOVEL
				//addSmithingRecipe(pWriter, ModItems.DARK_SHOVEL.get(), ModItems.WHITE_SHOVEL.get(), ModItems.DARK_WHITE_SHOVEL.get());

		//DARK_WHITE_HOE
				//addSmithingRecipe(pWriter, ModItems.DARK_HOE.get(), ModItems.WHITE_HOE.get(), ModItems.DARK_WHITE_HOE.get());
	
        //RAW_DARK
				ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_WHITE.get(), 1)
						.requires(Items.WHITE_DYE)
						.requires(Items.IRON_INGOT)
						.unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
						.save(pWriter);
				
		//RAW_DARK
				ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_DARK.get(), 1)
						.requires(Items.BLACK_DYE)
						.requires(Items.IRON_INGOT)
						.unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
						.save(pWriter);
		// SAPPHIRE
				ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE_GEM.get(), 9)
						.requires(ModBlocks.SAPPHIRE_BLOCK.get())
						.unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
						.save(pWriter);
		
		
		// SAPPHIRE_BLOCK
				addShapedRecipe(pWriter, ModBlocks.SAPPHIRE_BLOCK.get(), RecipeCategory.MISC,
						new String[]{"SSS", "SSS", "SSS"}, 
						new Object[][]{{'S', ModItems.SAPPHIRE_GEM.get()}}, 
						ModItems.SAPPHIRE_GEM.get());

		// IRON_STICK
				addShapedRecipe(pWriter, ModItems.IRON_STICK.get(), RecipeCategory.MISC,
						new String[]{"I", "I"}, 
						new Object[][]{{'I', Items.IRON_INGOT}}, 
						Items.IRON_INGOT);

		// WHITE_SWORD
				addShapedRecipe(pWriter, ModItems.WHITE_SWORD.get(), RecipeCategory.MISC,
					    new String[]{" W ", " W "," I "}, 
					    new Object[][]{{'W',ModItems.WHITE_STEEL.get()},{'I',ModItems.IRON_STICK.get()}},
					    ModItems.IRON_STICK.get());
				
		// WHITE_AXE
				addShapedRecipe(pWriter, ModItems.WHITE_AXE.get(), RecipeCategory.MISC,
						new String[]{"WW ", "WI "," I "}, 
						new Object[][]{{'W',ModItems.WHITE_STEEL.get()},{'I',ModItems.IRON_STICK.get()}},
						ModItems.IRON_STICK.get());
		
		// WHITE_PICKAXE
				addShapedRecipe(pWriter, ModItems.WHITE_PICKAXE.get(), RecipeCategory.MISC,
						new String[]{"WWW", " I "," I "}, 
						new Object[][]{{'W',ModItems.WHITE_STEEL.get()},{'I',ModItems.IRON_STICK.get()}},
						ModItems.IRON_STICK.get());
				
		// WHITE_SHOVEL
				addShapedRecipe(pWriter, ModItems.WHITE_SHOVEL.get(), RecipeCategory.MISC,
						new String[]{" W ", " I "," I "}, 
						new Object[][]{{'W',ModItems.WHITE_STEEL.get()},{'I',ModItems.IRON_STICK.get()}},
						ModItems.IRON_STICK.get());

		// WHITE_HOE
				addShapedRecipe(pWriter, ModItems.WHITE_HOE.get(), RecipeCategory.MISC,
						new String[]{"WW ", " I "," I "}, 
						new Object[][]{{'W',ModItems.WHITE_STEEL.get()},{'I',ModItems.IRON_STICK.get()}},
						ModItems.IRON_STICK.get());
		
		// DARK_SWORD
				addShapedRecipe(pWriter, ModItems.DARK_SWORD.get(), RecipeCategory.MISC,
						new String[]{" D ", " D "," I "}, 
						new Object[][]{{'D',ModItems.DARK_STEEL.get()},{'I',ModItems.IRON_STICK.get()}}, 
						ModItems.IRON_STICK.get());		
				
		// DARK_AXE
				addShapedRecipe(pWriter, ModItems.DARK_AXE.get(), RecipeCategory.MISC,
						new String[]{"DD ", "DI "," I "}, 
						new Object[][]{{'D',ModItems.DARK_STEEL.get()},{'I',ModItems.IRON_STICK.get()}},
						ModItems.IRON_STICK.get());
		
		// DARK_PICKAXE
				addShapedRecipe(pWriter, ModItems.DARK_PICKAXE.get(), RecipeCategory.MISC,
						new String[]{"DDD", " I "," I "}, 
						new Object[][]{{'D',ModItems.DARK_STEEL.get()},{'I',ModItems.IRON_STICK.get()}}, 
						ModItems.IRON_STICK.get());
				
		// DARK_SHOVEL
				addShapedRecipe(pWriter, ModItems.DARK_SHOVEL.get(), RecipeCategory.MISC,
						new String[]{" D ", " I "," I "}, 
						new Object[][]{{'D',ModItems.DARK_STEEL.get()},{'I',ModItems.IRON_STICK.get()}}, 
						ModItems.IRON_STICK.get());
				
		// DARK_HOE
				addShapedRecipe(pWriter, ModItems.DARK_HOE.get(), RecipeCategory.MISC,
						new String[]{"DD ", " I "," I "}, 
						new Object[][]{{'D',ModItems.DARK_STEEL.get()},{'I',ModItems.IRON_STICK.get()}}, 
						ModItems.IRON_STICK.get());					
	}
	private void addSmithingRecipe(Consumer<FinishedRecipe> pWriter, @NotNull Item item, @NotNull Item item2,
			@NotNull Item item3) {

		
	}





	private void addShapedRecipe(Consumer<FinishedRecipe> writer, ItemLike result, RecipeCategory category, String[] patterns, Object[][] ingredients, ItemLike unlockItem) {
		ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(category, result);	
		 // 添加配方模式
	    for (String pattern : patterns) {
	        builder.pattern(pattern);
	    }

	    // 添加定义材料
	    for (Object[] ingredient : ingredients) {
	        builder.define((Character) ingredient[0], (ItemLike) ingredient[1]);
	    }

	    // 解锁条件
	    builder.unlockedBy(getHasName(unlockItem), has(unlockItem))
	           .save(writer);
	}
	
	
	
	
	
	
	protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory,ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
			oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE,pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
	}
	protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory,ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
		    oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE,pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
}
	
	 protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,  float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
		 for (ItemLike itemlike : pIngredients) {	
			 SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory,pResult,
			 pExperience,pCookingTime,pCookingSerializer)
			 .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
			 .save(pFinishedRecipeConsumer, darkballmod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
}

		}
	

}
