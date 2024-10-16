package net.darkball.darkballmod.MainClass.item;


import net.darkball.darkballmod.darkballmod;
import net.darkball.darkballmod.datagen.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
	
 //挖掘等級,耐久度,速度,攻擊力加成,附魔值,
 // 1 ,1 ,1f ,1f ,1,
	
    public static final Tier SAPPHIRE_TOOL = TierSortingRegistry.registerTier(new ForgeTier(4, 1500, 5f, 4f, 25,ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () ->
    		Ingredient.of(ModItems.SAPPHIRE_GEM.get())),new ResourceLocation(darkballmod.MOD_ID, "sapphire_tool"), List.of(Tiers.DIAMOND), List.of());
    public static final Tier SAPPHIRE_WEAPON = TierSortingRegistry.registerTier(new ForgeTier(2, 1500, 5f, 4f, 2 ,ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () ->
    		Ingredient.of(ModItems.SAPPHIRE_GEM.get())),new ResourceLocation(darkballmod.MOD_ID, "sapphire"), List.of(Tiers.DIAMOND), List.of());
    
    public static final Tier WHITE_TOOL = TierSortingRegistry.registerTier(new ForgeTier(5, 750, 5f, 4f, 25,ModTags.Blocks.NEEDS_WHITE_TOOL, () -> 
    		Ingredient.of(ModItems.WHITE_STEEL.get())),new ResourceLocation(darkballmod.MOD_ID, "white_tool"), List.of(Tiers.DIAMOND), List.of());
    
    public static final Tier WHITE_WEAPON = TierSortingRegistry.registerTier(new ForgeTier(2, 1500, 5f, 4f, 2 ,ModTags.Blocks.NEEDS_WHITE_TOOL, () ->
			Ingredient.of(ModItems.SAPPHIRE_GEM.get())),new ResourceLocation(darkballmod.MOD_ID, "white_weapon"), List.of(Tiers.DIAMOND), List.of());
    
    public static final Tier DARK_TOOL = TierSortingRegistry.registerTier(new ForgeTier(6, 750, 5f, 5f, 25,ModTags.Blocks.NEEDS_DARK_TOOL, () -> 
    		Ingredient.of(ModItems.DARK_STEEL.get())),new ResourceLocation(darkballmod.MOD_ID, "dark_tool"), List.of(Tiers.NETHERITE), List.of());
    
    public static final Tier DARK_WEAPON = TierSortingRegistry.registerTier(new ForgeTier(2, 750, 5f, 5f, 25, ModTags.Blocks.NEEDS_DARK_TOOL, () -> 
            Ingredient.of(ModItems.DARK_STEEL.get())),new ResourceLocation(darkballmod.MOD_ID, "dark_weapon"), List.of(Tiers.NETHERITE), List.of());
    
    public static final Tier DARK_WHITE_TOOL = TierSortingRegistry.registerTier(new ForgeTier(7, 750, 5f, 6f, 25,ModTags.Blocks.NEEDS_DARK_WHITE_TOOL, () -> 
            Ingredient.of(ModItems.DARK_STEEL.get())),new ResourceLocation(darkballmod.MOD_ID, "dark_white_tool"), List.of(Tiers.NETHERITE), List.of());
    
    public static final Tier DARK_WHITE_WEAPON = TierSortingRegistry.registerTier(new ForgeTier(2, 1500, 5f, 6f, 25,ModTags.Blocks.NEEDS_DARK_WHITE_TOOL, () -> 
            Ingredient.of(ModItems.DARK_STEEL.get())), new ResourceLocation(darkballmod.MOD_ID, "dark_white_weapon"), List.of(Tiers.NETHERITE), List.of());
    
    public static final Tier STONE = TierSortingRegistry.registerTier( new ForgeTier(8, 100, 5f, 11f, 100,ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> 
			Ingredient.of(Items.STONE)), new ResourceLocation(darkballmod.MOD_ID, "stone"), List.of(Tiers.NETHERITE), List.of());
    
    public static final Tier VOID = TierSortingRegistry.registerTier( new ForgeTier(8, 90000, 5f, 11f, 100,ModTags.Blocks.NEEDS_DARK_WHITE_TOOL, () -> 
    		Ingredient.of(ModItems.DARK_STEEL.get())), new ResourceLocation(darkballmod.MOD_ID, "void"), List.of(Tiers.NETHERITE), List.of());

}