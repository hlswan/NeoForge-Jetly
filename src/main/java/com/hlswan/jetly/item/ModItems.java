package com.hlswan.jetly.item;

import com.hlswan.jetly.Jetly;
import com.hlswan.jetly.block.ModBlocks;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
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


    public static final DeferredItem<Item> WILD_BLUEBERRIES = ITEMS.registerSimpleItem(
            "wild_blueberries",
            new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.1f)
                            .build()
            )
    );

    public static final DeferredItem<Item> MAPLE_SYRUP = ITEMS.registerSimpleItem(
            "maple_syrup",
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

    public static final DeferredItem<BlockItem> ASH_LOG_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.ASH_LOG);

    public static final DeferredItem<BlockItem> ASH_LEAVES_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.ASH_LEAVES);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
