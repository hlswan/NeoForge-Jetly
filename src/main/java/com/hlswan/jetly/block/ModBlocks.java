package com.hlswan.jetly.block;

import com.hlswan.jetly.Jetly;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Jetly.MODID);

    public static final DeferredBlock<Block> ASH_LOG = BLOCKS.register(
            "ash_log", registryName -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.of()
                            // The ID must be set on the block
                            .setId(ResourceKey.create(Registries.BLOCK, registryName))
                            .strength(2.0F)
                            .mapColor(MapColor.WOOD)
                            .sound(SoundType.WOOD)
            )
    );

    public static final DeferredBlock<Block> ASH_LEAVES = BLOCKS.registerBlock(
            "ash_leaves",
            Block::new, // The factory that the properties will be passed into.
            BlockBehaviour.Properties.of()
                    .strength(0.2F)
                    .sound(SoundType.GRASS)
                    .randomTicks()
                    .ignitedByLava()
                    .noOcclusion()
                    .isSuffocating((state, level, pos) -> false)
                    .isViewBlocking((state, level, pos) -> false)
                    .isValidSpawn((state, level, pos, type) -> type == EntityType.OCELOT || type == EntityType.PARROT)// The properties to use.
    );

    public static final DeferredBlock<Block> LOAM = BLOCKS.registerBlock("loam",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(0.5F)
                    .sound(SoundType.ROOTS)
                    .mapColor(MapColor.PODZOL)
    );
    public static final DeferredBlock<Block> ASH_LEAF_LITTER = BLOCKS.registerBlock("ash_leaf_litter",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(0.5F)
                    .sound(SoundType.LEAF_LITTER)
                    .mapColor(MapColor.COLOR_BROWN)
    );



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
