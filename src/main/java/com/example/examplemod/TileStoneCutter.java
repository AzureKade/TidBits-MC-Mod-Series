package com.example.examplemod;

import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileStoneCutter extends TileEntity implements IInventory, ITickable {
    public static final int FUEL_SLOTS_COUNT = 4;
    public static final int INPUT_SLOTS_COUNT = 5;
    public static final int OUTPUT_SLOTS_COUNT = 5;
    public static final int TOTAL_SLOTS_COUNT = FUEL_SLOTS_COUNT + INPUT_SLOTS_COUNT + OUTPUT_SLOTS_COUNT;

    public static final int FIRST_FUEL_SLOT = 0;
    public static final int FIRST_INPUT_SLOT = FIRST_FUEL_SLOT + FUEL_SLOTS_COUNT;
    public static final int FIRST_OUTPUT_SLOT = FIRST_INPUT_SLOT + INPUT_SLOTS_COUNT;

    private int [] burnTimeRemaining = new int[FUEL_SLOTS_COUNT];
    private int [] burnTimeInitialValue = new int[FUEL_SLOTS_COUNT];

    private short cookTime;

    private static final short COOK_TIME_FOR_COMPLETION = 200; // vanilla value is 200 = 10 seconds

    private int cachedNumberOfBurningSlots = -1;

    private ItemStack[] itemStacks;

    public TileStoneCutter()
    {
        FurnaceRecipes.instance().
        itemStacks = new ItemStack[TOTAL_SLOTS_COUNT];
        clear();
    }

}
