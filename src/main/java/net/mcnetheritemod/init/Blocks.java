package net.mcnetheritemod.init;


import net.mcnetheritemod.common.blocks.FluidBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class Blocks {
    public static List<Block> blocks = new ArrayList<>();
    public static List<Block> fluids = new ArrayList<>();
    public static final Block MOLTEN_NETHERITE = new FluidBlock("molten_netherite",Fluids.MOLTEN_NETHERITE,new Material(MapColor.OBSIDIAN));
    public static final Block ANCIENT_DEBRIS = new net.mcnetheritemod.common.blocks.Block("ancient_debris", CreativeTabs.BUILDING_BLOCKS,new Material(MapColor.OBSIDIAN)).setHardness(30.0f);
    public static final Block NETHERITE_BLOCK = new net.mcnetheritemod.common.blocks.Block("netherite_block",CreativeTabs.BUILDING_BLOCKS,new Material(MapColor.OBSIDIAN)).setHardness(30.0f);
    public static void init(){
        ANCIENT_DEBRIS.setHarvestLevel("pickaxe",3);
        NETHERITE_BLOCK.setHarvestLevel("pickaxe",3);
        fluids.add(NETHERITE_BLOCK);
    }
}
