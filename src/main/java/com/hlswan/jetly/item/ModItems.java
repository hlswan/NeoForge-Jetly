package com.hlswan.jetly.item;

import com.hlswan.jetly.Jetly;
import com.hlswan.jetly.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Jetly.MODID);

    public static final DeferredItem<Item> ASH_STICK = ITEMS.registerItem(
            "ash_stick",
            Item::new,
            new Item.Properties()
    );

    public static final DeferredItem<BlockItem> ASH_LOG_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.ASH_LOG);

    public static final DeferredItem<BlockItem> ASH_LEAVES_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.ASH_LEAVES);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
