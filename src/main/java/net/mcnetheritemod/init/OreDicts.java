package net.mcnetheritemod.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDicts {
    public static void init(){
        OreDictionary.registerOre("ingotNetherite", Items.NETHERITE_INGOT);
        OreDictionary.registerOre("oreNetherite",Blocks.ANCIENT_DEBRIS);
        OreDictionary.registerOre("oreAncientDebris",Blocks.ANCIENT_DEBRIS);
        OreDictionary.registerOre("oreAncientdebris",Blocks.ANCIENT_DEBRIS);
        OreDictionary.registerOre("oreDebris",Blocks.ANCIENT_DEBRIS);
        OreDictionary.registerOre("AncientDebris",Blocks.ANCIENT_DEBRIS);
        OreDictionary.registerOre("ancientDebris",Blocks.ANCIENT_DEBRIS);
        OreDictionary.registerOre("blockNetherite",Blocks.NETHERITE_BLOCK);
        OreDictionary.registerOre("moltenNetherite",Blocks.MOLTEN_NETHERITE);
        OreDictionary.registerOre("fluidNetherite",Blocks.MOLTEN_NETHERITE);
        OreDictionary.registerOre("scrapNetherite",Items.NETHERITE_SCRAP);
    }
}
