package net.mcnetheritemod.util;

import net.mcnetheritemod.NetheriteMod;
import net.mcnetheritemod.init.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    public static void preInitRegistries(){

        Fluids.registerFluids();
        RenderHandler.registerCustomMeshesAndStates();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(Items.items.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void registerModel(ModelRegistryEvent event){
        for(Item item :Items.items){
            NetheriteMod.proxy.registerModelRenderer(item,0,"inventory");
        }
    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(Blocks.blocks.toArray(new Block[0]));
    }
}
