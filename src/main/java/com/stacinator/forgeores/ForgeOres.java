package com.stacinator.forgeores;

import com.stacinator.forgeores.configuration.ConfigurationHandler;
import com.stacinator.forgeores.proxy.IProxy;
import com.stacinator.forgeores.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION)
public class ForgeOres
{
    @Mod.Instance(Reference.MOD_ID)
    public static ForgeOres instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //items, blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //GUI, tile entities, crafting,
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
