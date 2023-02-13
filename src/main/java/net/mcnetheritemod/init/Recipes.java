package net.mcnetheritemod.init;

import net.mcnetheritemod.init.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
    public static void init(){
        GameRegistry.addSmelting(Blocks.NETHERITE_BLOCK,new ItemStack(Items.NETHERITE_SCRAP),2.0f);
    }
}
