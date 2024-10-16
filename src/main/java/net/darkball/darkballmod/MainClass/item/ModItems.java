package net.darkball.darkballmod.MainClass.item;

import net.darkball.darkballmod.darkballmod;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, darkballmod.MOD_ID);
    
    
    
    //SAPPHIRE
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
   
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE_WEAPON, 7, -2.4F, new Item.Properties().durability(1571)));
    
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE_TOOL, 1, -2.8F, new Item.Properties().durability(1571)));
    
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE_TOOL, 1, -2.8F, new Item.Properties().durability(1571)));
    
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE_TOOL, 1, -2.8F, new Item.Properties().durability(1571)));
    
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE_TOOL, 1, -2.8F, new Item.Properties().durability(1571)));
    
    
    //WHITE_STEEL
    public static final RegistryObject<Item> RAW_WHITE = ITEMS.register("unfinished_white_steel",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_STEEL = ITEMS.register("white_steel",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_SWORD = ITEMS.register("white_steel_sword",
            () -> new SwordItem(ModToolTiers.WHITE_WEAPON, 14, -2.4F, new Item.Properties().durability(750)));
    
    public static final RegistryObject<Item> WHITE_AXE = ITEMS.register("white_steel_axe",
            () -> new AxeItem(ModToolTiers.WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(750)));
    
    public static final RegistryObject<Item> WHITE_PICKAXE = ITEMS.register("white_steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(750)));
    
    public static final RegistryObject<Item> WHITE_SHOVEL = ITEMS.register("white_steel_shovel",
            () -> new ShovelItem(ModToolTiers.WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(750)));
    
    public static final RegistryObject<Item> WHITE_HOE = ITEMS.register("white_steel_hoe",
            () -> new HoeItem(ModToolTiers.WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(750)));
    
    
    //DARK_STEEL
    public static final RegistryObject<Item> RAW_DARK = ITEMS.register("unfinished_dark_steel",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> DARK_STEEL = ITEMS.register("dark_steel",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_steel_sword",
            () -> new SwordItem(ModToolTiers.DARK_WEAPON, 21, -2.4F, new Item.Properties().durability(2041)));
    
    public static final RegistryObject<Item> DARK_AXE = ITEMS.register("dark_steel_axe",
            () -> new AxeItem(ModToolTiers.DARK_TOOL, 1, -2.8F, new Item.Properties().durability(2041)));
    
    public static final RegistryObject<Item> DARK_PICKAXE = ITEMS.register("dark_steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DARK_TOOL, 1, -2.8F, new Item.Properties().durability(2041)));
    
    public static final RegistryObject<Item> DARK_SHOVEL = ITEMS.register("dark_steel_shovel",
            () -> new ShovelItem(ModToolTiers.DARK_TOOL, 1, -2.8F, new Item.Properties().durability(2041)));
    
    public static final RegistryObject<Item> DARK_HOE = ITEMS.register("dark_steel_hoe",
            () -> new HoeItem(ModToolTiers.DARK_TOOL, 1, -2.8F, new Item.Properties().durability(2041)));
    
    
    //DARK_WHITE_TOOL
    public static final RegistryObject<Item> DARK_WHITE_SWORD = ITEMS.register("dark_white_sword",
            () -> new SwordItem(ModToolTiers.DARK_WHITE_WEAPON, 12, -2.4F, new Item.Properties().durability(3000)));
    
    public static final RegistryObject<Item> DARK_WHITE_AXE = ITEMS.register("dark_white_axe",
            () -> new AxeItem(ModToolTiers.DARK_WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(3000)));
    
    public static final RegistryObject<Item> DARK_WHITE_PICKAXE = ITEMS.register("dark_white_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DARK_WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(3000)));
    
    public static final RegistryObject<Item> DARK_WHITE_SHOVEL = ITEMS.register("dark_white_shovel",
            () -> new ShovelItem(ModToolTiers.DARK_WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(3000)));
    
    public static final RegistryObject<Item> DARK_WHITE_HOE = ITEMS.register("dark_white_hoe",
            () -> new HoeItem(ModToolTiers.DARK_WHITE_TOOL, 1, -2.8F, new Item.Properties().durability(3000)));
    
   
    //VOID_TOOL
    public static final RegistryObject<Item> SICKLE = ITEMS.register("sickle",
            () -> new HoeItem(ModToolTiers.STONE, 2, -1.0F, new Item.Properties().durability(400)));
    
    public static final RegistryObject<Item> VOID_SICKLE = ITEMS.register("darkball_sickle",
            () -> new HoeItem(ModToolTiers.VOID, 10, -0.75F, new Item.Properties().durability(10000)));
    
    //UPGRADE_TEPLATE
   
    public static final RegistryObject<Item> DARK_WHITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("dark_white_upgrade_smithing_template",
            () -> new Item (new Item.Properties()));
    
    
    //crafting_item
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick",
            () -> new Item(new Item.Properties()));
  
    
    
    
    
    
    
    
    
    
    
    
    
 
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
    }
  
