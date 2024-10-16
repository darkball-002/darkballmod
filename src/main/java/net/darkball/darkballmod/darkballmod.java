package net.darkball.darkballmod;

import com.mojang.logging.LogUtils;
import net.darkball.darkballmod.MainClass.block.*;
import net.darkball.darkballmod.MainClass.block.entity.*;
import net.darkball.darkballmod.MainClass.item.*;
import net.darkball.darkballmod.screen.GemPolishingStationScreen;
import net.darkball.darkballmod.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(darkballmod.MOD_ID)
public class darkballmod {
    public static final String MOD_ID = "darkballmod";

    //Directly reference a slf4j logger
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LogUtils.getLogger();


    @SuppressWarnings("removal")
    public darkballmod() {
        
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        
        
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        



        modEventBus.addListener(this::commonSetup);
        
        
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    

	private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SAPPHIRE_GEM);
            event.accept(ModItems.WHITE_STEEL);
        }
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        	MenuScreens.register(ModMenuTypes.GEM_POLISHING_MENU.get(), GemPolishingStationScreen::new);
        }
    }
    
}
