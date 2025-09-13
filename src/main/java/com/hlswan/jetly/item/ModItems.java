package com.hlswan.jetly.item;

import com.hlswan.jetly.Jetly;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Jetly.MODID);

    public static final DeferredItem<Item> SHARP_STICK = ITEMS.register("sharp_stick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOOSE_ROCK = ITEMS.register("loose_rock",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRANCH = ITEMS.register("branch",
            () -> new Item(new Item.Properties()));

}
