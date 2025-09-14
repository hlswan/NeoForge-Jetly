package com.hlswan.jetly.block;

import com.hlswan.jetly.Jetly;
import com.hlswan.jetly.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Jetly.MODID);

    public static final DeferredBlock<Block> ASH_LOG = BLOCKS.register(
            "ash_log",
            registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.GRAVEL)
                    .lightLevel(state -> 7)
            ));

    //BLOCKS is a DeferredRegister.Blocks
    public static final DeferredBlock<Block> ASH_LEAVES = BLOCKS.register(
            "ash_leaves",
            registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.GRAVEL)
                    .lightLevel(state -> 7)
            ));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
