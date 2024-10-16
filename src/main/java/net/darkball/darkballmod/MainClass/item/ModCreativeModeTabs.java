package net.darkball.darkballmod.MainClass.item;

import net.darkball.darkballmod.MainClass.block.*;
import net.darkball.darkballmod.darkballmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, darkballmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("darkballmod_gem",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE_GEM.get()))
                    .title(Component.translatable("creativetab.normal_item_tab"))
                    .displayItems((pParameters, pOutput) -> {

                    	pOutput.accept(ModItems.SAPPHIRE_GEM.get());
                    	
                        pOutput.accept(ModItems.RAW_WHITE.get());
                        pOutput.accept(ModItems.WHITE_STEEL.get());
                        
                        pOutput.accept(ModItems.RAW_DARK.get());
                        pOutput.accept(ModItems.DARK_STEEL.get());
                          
                        pOutput.accept(ModItems.DARK_WHITE_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.IRON_STICK.get());
                        
                    })
                    .build());
                        
    public static final RegistryObject<CreativeModeTab> SWORD_TAB = CREATIVE_MODE_TABS.register("darkballmod_sword",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE_SWORD.get()))
    	            .title(Component.translatable("creativetab.sword_tab"))
    	            .displayItems((pParameters, pOutput) -> {
    	            	        
    	            	pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
    	            	pOutput.accept(ModItems.SAPPHIRE_AXE.get());
    	            	
    	            	
    	                pOutput.accept(ModItems.WHITE_SWORD.get());
    	                pOutput.accept(ModItems.WHITE_AXE.get());
    	                
    	                
    	                pOutput.accept(ModItems.DARK_SWORD.get());
    	                pOutput.accept(ModItems.DARK_AXE.get());
    	                        
    	                
    	                pOutput.accept(ModItems.DARK_WHITE_SWORD.get());
    	                pOutput.accept(ModItems.DARK_WHITE_AXE.get());
    	                
    	                pOutput.accept(ModItems.SICKLE.get());
    	                
    	                
    	            })
    	            .build());
    
     public static final RegistryObject<CreativeModeTab> TOOL_TAB = CREATIVE_MODE_TABS.register("darkballmod_tool",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE_PICKAXE.get()))
                    .title(Component.translatable("creativetab.tool_tab"))
                    .displayItems((pParameters, pOutput) -> {
                    	
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        
                        pOutput.accept(ModItems.WHITE_AXE.get());
                        pOutput.accept(ModItems.WHITE_PICKAXE.get());
                        pOutput.accept(ModItems.WHITE_SHOVEL.get());
                        pOutput.accept(ModItems.WHITE_HOE.get());
                        
                        pOutput.accept(ModItems.DARK_AXE.get());
                        pOutput.accept(ModItems.DARK_PICKAXE.get());
                        pOutput.accept(ModItems.DARK_SHOVEL.get());
                        pOutput.accept(ModItems.DARK_HOE.get());
                        
                        pOutput.accept(ModItems.DARK_WHITE_AXE.get());
                        pOutput.accept(ModItems.DARK_WHITE_PICKAXE.get());
                        pOutput.accept(ModItems.DARK_WHITE_SHOVEL.get());
                        pOutput.accept(ModItems.DARK_WHITE_HOE.get());
                        
                        pOutput.accept(ModItems.SICKLE.get());
                    })
                    .build());
     
    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("darkballmod_block",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SAPPHIRE_BLOCK.get()))
                    .title(Component.translatable("creativetab.block_tab"))
                    .displayItems((pParameters, pOutput) -> {
                    	
                    	
                    	pOutput.accept(ModBlocks.GEM_POLISHING_STATION.get() );
                    	pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get() );
                    	
                    	
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.BEDROCK_SAPPHIRE_ORE.get());
                        
                        
                    })
                    .build());

    public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
    }

}
