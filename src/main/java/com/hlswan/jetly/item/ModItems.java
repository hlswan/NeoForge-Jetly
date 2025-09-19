package com.hlswan.jetly.item;

import com.hlswan.jetly.Jetly;
import com.hlswan.jetly.block.ModBlocks;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Consumable;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Jetly.MODID);

    public static final DeferredItem<Item> CHUNK_OF_FLINT = ITEMS.registerItem(
            "chunk_of_flint",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> PEBBLE = ITEMS.registerItem(
            "pebble",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> SAWDUST = ITEMS.registerItem(
            "sawdust",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> ASH_STICK = ITEMS.registerItem(
            "ash_stick",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> ASH_HANDLE = ITEMS.registerItem(
            "ash_handle",
            Item::new,
            new Item.Properties());

    public static final DeferredItem<Item> MAPLE_STICK = ITEMS.registerItem(
            "maple_stick",
            Item::new,
            new Item.Properties()
        );

    public static final DeferredItem<Item> MAPLE_HANDLE = ITEMS.registerItem(
            "maple_handle",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> BLUEBERRIES = ITEMS.registerSimpleItem(
            "blueberries",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.1f)
                            .build()
            )
    );

    public static final DeferredItem<Item> BLUEBERRY_SEEDS = ITEMS.registerItem(
            "blueberry_seeds",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> MAPLE_SYRUP_BOTTLE = ITEMS.registerSimpleItem(
            "maple_syrup_bottle",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.3f)
                            .build()
            )
                    .usingConvertsTo(Items.GLASS_BOTTLE)
                    .component(
                            DataComponents.CONSUMABLE,
                            Consumable.builder()
                                    .consumeSeconds(2)
                                    .sound(SoundEvents.HONEY_DRINK)
                                    .build()
                    )
    );

    public static final DeferredItem<Item> CANTEEN = ITEMS.registerItem(
            "canteen",
            Item::new,
            new Item.Properties()
    );


    public static final DeferredItem<Item> FIBER_STRING = ITEMS.registerItem(
            "fiber_string",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> DOGBANE_STALK = ITEMS.registerItem(
            "dogbane_stalk",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<Item> DOGBANE_FIBER = ITEMS.registerItem(
            "dogbane_fiber",
            Item::new,
            new Item.Properties()
    );


    public static final DeferredItem<BlockItem> ASH_LOG_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.ASH_LOG);

    public static final DeferredItem<BlockItem> ASH_LEAVES_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.ASH_LEAVES);

    public static final DeferredItem<BlockItem> LOAM_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.LOAM);

    public static final DeferredItem<BlockItem> MAPLE_LOG_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.MAPLE_LOG);

    public static final DeferredItem<BlockItem> MAPLE_LEAVES_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.MAPLE_LEAVES);

    public static final DeferredItem<BlockItem> MAPLE_PLANKS_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.MAPLE_PLANKS);

    public static final DeferredItem<BlockItem> ASH_PLANKS_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.ASH_PLANKS);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
