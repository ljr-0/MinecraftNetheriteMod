package net.mcnetheritemod.common.items.tools;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class NetheriteHoe extends ItemHoe {
    public NetheriteHoe(){
        super(Materials.NETHERITE);
        setUnlocalizedName("netherite_hoe");
        setRegistryName("netherite_hoe");
        Items.items.add(this);
    }
}
