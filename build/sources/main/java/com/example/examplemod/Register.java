package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TidBitsMasonry.MODID)
public class Register {

    static Block LIMESTONE_BLOCK;
    static Block SLATE_BLOCK;
    static Block MARBLE_BLOCK;
    static Block GABBRO_BLOCK;
    static Block RHYOLITE_BLOCK;
    static Block BASALT_BLOCK;
    static Block DOLOMITE_BLOCK;

    static Block GABBRO_POLISHED;
    static Block RHYOLITE_BRICK;

    static MasonrySlab.Half LIMESTONE_SLAB_HALF;
    static MasonrySlab.Double LIMESTONE_SLAB_DOUBLE;

    static MasonrySlab.Half MARBLE_SLAB_HALF;
    static MasonrySlab.Double MARBLE_SLAB_DOUBLE;

    static MasonrySlab.Half SLATE_SLAB_HALF;
    static MasonrySlab.Double SLATE_SLAB_DOUBLE;

    static MasonrySlab.Half GABBRO_SLAB_HALF;
    static MasonrySlab.Double GABBRO_SLAB_DOUBLE;

    static MasonrySlab.Half RHYOLITE_SLAB_HALF;
    static MasonrySlab.Double RHYOLITE_SLAB_DOUBLE;

    static MasonrySlab.Half BASALT_SLAB_HALF;
    static MasonrySlab.Double BASALT_SLAB_DOUBLE;

    static MasonrySlab.Half DOLOMITE_SLAB_HALF;
    static MasonrySlab.Double DOLOMITE_SLAB_DOUBLE;


    public static void init() {
        LIMESTONE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(.8f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("limestone_block")
                .setRegistryName("limestone_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        MARBLE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("marble_block")
                .setRegistryName("marble_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        SLATE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(.8f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("slate_block")
                .setRegistryName("slate_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        GABBRO_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("gabbro_block")
                .setRegistryName("gabbro_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        BASALT_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("basalt_block")
                .setRegistryName("basalt_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        RHYOLITE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("rhyolite_block")
                .setRegistryName("rhyolite_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        DOLOMITE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("dolomite_block")
                .setRegistryName("dolomite_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);


        GABBRO_POLISHED = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("gabbro_polished")
                .setRegistryName("gabbro_polished").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        RHYOLITE_BRICK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("rhyolite_brick")
                .setRegistryName("rhyolite_brick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);


        LIMESTONE_SLAB_HALF = new MasonrySlab.Half("limestone_slab",Material.ROCK);
        LIMESTONE_SLAB_HALF.setResistance(30)
                .setHardness(.6f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        LIMESTONE_SLAB_DOUBLE  = new MasonrySlab.Double("double_limestone_slab",Material.ROCK);
        LIMESTONE_SLAB_DOUBLE.setResistance(30)
                .setHardness(.6f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        MARBLE_SLAB_HALF = new MasonrySlab.Half("marble_slab",Material.ROCK);
        MARBLE_SLAB_HALF.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        MARBLE_SLAB_DOUBLE  = new MasonrySlab.Double("double_marble_slab",Material.ROCK);
        MARBLE_SLAB_DOUBLE.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        SLATE_SLAB_HALF = new MasonrySlab.Half("slate_slab",Material.ROCK);
        SLATE_SLAB_HALF.setResistance(30)
                .setHardness(.6f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        SLATE_SLAB_DOUBLE  = new MasonrySlab.Double("double_slate_slab",Material.ROCK);
        SLATE_SLAB_DOUBLE.setResistance(30)
                .setHardness(.6f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BASALT_SLAB_HALF = new MasonrySlab.Half("basalt_slab",Material.ROCK);
        BASALT_SLAB_HALF.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BASALT_SLAB_DOUBLE  = new MasonrySlab.Double("double_basalt_slab",Material.ROCK);
        BASALT_SLAB_DOUBLE.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        GABBRO_SLAB_HALF = new MasonrySlab.Half("gabbro_slab",Material.ROCK);
        GABBRO_SLAB_HALF.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        GABBRO_SLAB_DOUBLE  = new MasonrySlab.Double("double_gabbro_slab",Material.ROCK);
        GABBRO_SLAB_DOUBLE.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        RHYOLITE_SLAB_HALF = new MasonrySlab.Half("rhyolite_slab",Material.ROCK);
        RHYOLITE_SLAB_HALF.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        RHYOLITE_SLAB_DOUBLE  = new MasonrySlab.Double("double_rhyolite_slab",Material.ROCK);
        RHYOLITE_SLAB_DOUBLE.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        DOLOMITE_SLAB_HALF = new MasonrySlab.Half("dolomite_slab",Material.ROCK);
        DOLOMITE_SLAB_HALF.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        DOLOMITE_SLAB_DOUBLE  = new MasonrySlab.Double("double_dolomite_slab",Material.ROCK);
        DOLOMITE_SLAB_DOUBLE.setResistance(30)
                .setHardness(1.3f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                LIMESTONE_BLOCK,
                MARBLE_BLOCK,
                SLATE_BLOCK,
                GABBRO_BLOCK,
                BASALT_BLOCK,
                RHYOLITE_BLOCK,
                DOLOMITE_BLOCK,
                LIMESTONE_SLAB_HALF,
                LIMESTONE_SLAB_DOUBLE,
                MARBLE_SLAB_HALF,
                MARBLE_SLAB_DOUBLE,
                SLATE_SLAB_HALF,
                SLATE_SLAB_DOUBLE,
                RHYOLITE_SLAB_HALF,
                RHYOLITE_SLAB_DOUBLE,
                BASALT_SLAB_HALF,
                BASALT_SLAB_DOUBLE,
                DOLOMITE_SLAB_HALF,
                DOLOMITE_SLAB_DOUBLE,
                GABBRO_SLAB_HALF,
                GABBRO_SLAB_DOUBLE,
                GABBRO_POLISHED,
                RHYOLITE_BRICK);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new ItemBlock(LIMESTONE_BLOCK).setRegistryName(LIMESTONE_BLOCK.getRegistryName()),
                new ItemBlock(MARBLE_BLOCK).setRegistryName(MARBLE_BLOCK.getRegistryName()),
                new ItemBlock(SLATE_BLOCK).setRegistryName(SLATE_BLOCK.getRegistryName()),
                new ItemBlock(RHYOLITE_BLOCK).setRegistryName(RHYOLITE_BLOCK.getRegistryName()),
                new ItemBlock(BASALT_BLOCK).setRegistryName(BASALT_BLOCK.getRegistryName()),
                new ItemBlock(DOLOMITE_BLOCK).setRegistryName(DOLOMITE_BLOCK.getRegistryName()),
                new ItemBlock(GABBRO_BLOCK).setRegistryName(GABBRO_BLOCK.getRegistryName())
        );

        event.getRegistry().registerAll(
                new ItemBlock(GABBRO_POLISHED).setRegistryName(GABBRO_POLISHED.getRegistryName()),
                new ItemBlock(RHYOLITE_BRICK).setRegistryName(RHYOLITE_BRICK.getRegistryName())
        );

        event.getRegistry().registerAll(
                new ItemSlab(LIMESTONE_SLAB_HALF, LIMESTONE_SLAB_HALF, LIMESTONE_SLAB_DOUBLE).setRegistryName(LIMESTONE_SLAB_HALF.getRegistryName()),
                new ItemSlab(MARBLE_SLAB_HALF, MARBLE_SLAB_HALF, MARBLE_SLAB_DOUBLE).setRegistryName(MARBLE_SLAB_HALF.getRegistryName()),
                new ItemSlab(SLATE_SLAB_HALF, SLATE_SLAB_HALF, SLATE_SLAB_DOUBLE).setRegistryName(SLATE_SLAB_HALF.getRegistryName()),
                new ItemSlab(RHYOLITE_SLAB_HALF, RHYOLITE_SLAB_HALF, RHYOLITE_SLAB_DOUBLE).setRegistryName(RHYOLITE_SLAB_HALF.getRegistryName()),
                new ItemSlab(DOLOMITE_SLAB_HALF, DOLOMITE_SLAB_HALF, DOLOMITE_SLAB_DOUBLE).setRegistryName(DOLOMITE_SLAB_HALF.getRegistryName()),
                new ItemSlab(GABBRO_SLAB_HALF, GABBRO_SLAB_HALF, GABBRO_SLAB_DOUBLE).setRegistryName(GABBRO_SLAB_HALF.getRegistryName()),
                new ItemSlab(BASALT_SLAB_HALF, BASALT_SLAB_HALF, BASALT_SLAB_DOUBLE).setRegistryName(BASALT_SLAB_HALF.getRegistryName())
        );
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(LIMESTONE_BLOCK));
        registerRender(Item.getItemFromBlock(SLATE_BLOCK));
        registerRender(Item.getItemFromBlock(MARBLE_BLOCK));
        registerRender(Item.getItemFromBlock(RHYOLITE_BLOCK));
        registerRender(Item.getItemFromBlock(DOLOMITE_BLOCK));
        registerRender(Item.getItemFromBlock(GABBRO_BLOCK));
        registerRender(Item.getItemFromBlock(BASALT_BLOCK));

        registerRender(Item.getItemFromBlock(RHYOLITE_BRICK));
        registerRender(Item.getItemFromBlock(GABBRO_POLISHED));

        registerRender(Item.getItemFromBlock(LIMESTONE_SLAB_HALF));
        registerRender(Item.getItemFromBlock(MARBLE_SLAB_HALF));
        registerRender(Item.getItemFromBlock(SLATE_SLAB_HALF));
        registerRender(Item.getItemFromBlock(RHYOLITE_SLAB_HALF));
        registerRender(Item.getItemFromBlock(DOLOMITE_SLAB_HALF));
        registerRender(Item.getItemFromBlock(GABBRO_SLAB_HALF));
        registerRender(Item.getItemFromBlock(BASALT_SLAB_HALF));



    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
