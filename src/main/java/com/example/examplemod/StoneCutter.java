package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILockableContainer;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class StoneCutter extends BlockContainer {

    public StoneCutter(Material materialIn,String name) {
        super(materialIn);
        setCreativeTab(CreativeTabs.DECORATIONS);
        setRegistryName(name);
        setUnlocalizedName(name);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileStoneCutter();
    }

    public boolean onBlockActivated(World worldIn,
                                    BlockPos pos,
                                    IBlockState state,
                                    EntityPlayer playerIn,
                                    EnumHand hand,
                                    @Nullable ItemStack heldItem,
                                    EnumFacing side,
                                    float hitX,
                                    float hitY,
                                    float hitZ) {
        if (worldIn.isRemote) { Blocks.FURNACE
            return true;
        } else {
            ILockableContainer ilockablecontainer = this.getLockableContainer(worldIn, pos);

            if (ilockablecontainer != null) {
                playerIn.displayGUIChest(ilockablecontainer);

                if (this.chestType == BlockChest.Type.BASIC) {
                    playerIn.addStat(StatList.CHEST_OPENED);
                } else if (this.chestType == BlockChest.Type.TRAP) {
                    playerIn.addStat(StatList.TRAPPED_CHEST_TRIGGERED);
                }
            }

            return true;
        }
    }
}
