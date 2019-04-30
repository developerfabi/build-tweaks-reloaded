package com.developerfabi.buildtweaks;

import com.developerfabi.util.BuildTweaksCT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BuildTweaks.MODID, name = BuildTweaks.NAME, version = BuildTweaks.VERSION)
public class BuildTweaks
{
    public static final String MODID = "buildtweaks";
    public static final String NAME = "BuildTweaks";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static final CreativeTabs BUILDTWEAKS = new BuildTweaksCT();

    @Mod.Instance(MODID)
    public static BuildTweaks instance;

    @SidedProxy(clientSide = "com.developerfabi.buildtweaks.ClientProxy", serverSide = "com.developerfabi.buildtweaks.CommonProxy")
    public static CommonProxy proxy;
    public static ClientProxy clientProxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
