package net.mcnetheritemod.common.items.tools;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class NetheriteAxe extends ItemAxe {
    public NetheriteAxe(){
        super(Materials.NETHERITE,9.0f,-3.0f);
        setUnlocalizedName("netherite_axe");
        setRegistryName("netherite_axe");
        Items.items.add(this);
    }
}
