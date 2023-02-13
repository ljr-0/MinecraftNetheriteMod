package net.mcnetheritemod;

import net.mcnetheritemod.init.*;
import net.mcnetheritemod.proxy.CommonProxy;
import net.mcnetheritemod.util.RegistryHandler;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NetheriteMod.MOD_ID,name = NetheriteMod.NAME,version = NetheriteMod.VERSION)
public class NetheriteMod {
    public static final String MOD_ID = "netheritemod";
    public static final String NAME = "Netherite Mod";
    public static final String VERSION = "1.0.0";
    @Mod.Instance
    public static NetheriteMod instance;
    @SidedProxy(modId = MOD_ID,serverSide = "net.mcnetheritemod.proxy.ServerProxy",clientSide = "net.mcnetheritemod.proxy.ClientProxy")
    public static CommonProxy proxy;
    @Mod.EventHandler
    public static void onConstruction(FMLConstructionEvent event){
    }
    static { FluidRegistry.enableUniversalBucket(); }
    @Mod.EventHandler
    public static void onPreInit(FMLPreInitializationEvent event){
        RegistryHandler.preInitRegistries();
        Blocks.init();
    }
    @Mod.EventHandler
    public static void onInit(FMLInitializationEvent event){
        OreDicts.init();
        Recipes.init();

    }
}
