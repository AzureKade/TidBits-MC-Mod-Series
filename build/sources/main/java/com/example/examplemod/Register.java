package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "examplemod")
public class Register {

    static Block LIMESTONE_BLOCK;
    static Block SLATE_BLOCK;
    static Block MARBLE_BLOCK;
    static Block GABBRO_BLOCK;
    static Block RHYOLITE_BLOCK;
    static Block BASALIT_BLOCK;
    static Block DOLOMITE_BLOCK;


    public static void init() {
        LIMESTONE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(.8f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("limestone_block")
                .setRegistryName("limestone_block");
        MARBLE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("marble_block")
                .setRegistryName("marble_block");
        SLATE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(.8f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("slate_block")
                .setRegistryName("slate_block");
        GABBRO_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("gabbro_block")
                .setRegistryName("gabbro_block");
        BASALIT_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("basalit_block")
                .setRegistryName("basalit_block");
        RHYOLITE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("rhyolite_block")
                .setRegistryName("rhyolite_block");
        DOLOMITE_BLOCK = new Block(Material.ROCK)
                .setResistance(30)
                .setHardness(1.5f)
                .setLightLevel(0)
                .setLightOpacity(0)
                .setUnlocalizedName("dolomite_block")
                .setRegistryName("dolomite_block");
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(LIMESTONE_BLOCK, MARBLE_BLOCK, SLATE_BLOCK, GABBRO_BLOCK, BASALIT_BLOCK, RHYOLITE_BLOCK, DOLOMITE_BLOCK);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new ItemBlock(LIMESTONE_BLOCK).setRegistryName(LIMESTONE_BLOCK.getRegistryName()),
                new ItemBlock(MARBLE_BLOCK).setRegistryName(MARBLE_BLOCK.getRegistryName()),
                new ItemBlock(SLATE_BLOCK).setRegistryName(SLATE_BLOCK.getRegistryName()),
                new ItemBlock(RHYOLITE_BLOCK).setRegistryName(RHYOLITE_BLOCK.getRegistryName()),
                new ItemBlock(BASALIT_BLOCK).setRegistryName(BASALIT_BLOCK.getRegistryName()),
                new ItemBlock(DOLOMITE_BLOCK).setRegistryName(DOLOMITE_BLOCK.getRegistryName()),
                new ItemBlock(GABBRO_BLOCK).setRegistryName(GABBRO_BLOCK.getRegistryName())
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
        registerRender(Item.getItemFromBlock(BASALIT_BLOCK));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
