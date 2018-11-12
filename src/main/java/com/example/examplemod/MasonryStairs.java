package com.example.examplemod;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public abstract class MasonryStairs extends BlockStairs
{
    public MasonryStairs(String name, IBlockState modelState)
    {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.useNeighborBrightness = true;
    }

}
