package com.hlswan.jetly.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RotatedPillarBlock;

public class ModRotatedPillarBlock extends RotatedPillarBlock {


    public ModRotatedPillarBlock(Properties p_55926_) {
        super(p_55926_);
        this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
    }



}
