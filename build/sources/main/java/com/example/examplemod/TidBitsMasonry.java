package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TidBitsMasonry.MODID, name = TidBitsMasonry.NAME, version = TidBitsMasonry.VERSION)
public class TidBitsMasonry
{
    public static final String MODID = "tbitsmasonry";
    public static final String NAME = "TidBits Masonry";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Register registryClass = new Register();
        registryClass.init();
        MinecraftForge.EVENT_BUS.register(registryClass);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code

        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


}
