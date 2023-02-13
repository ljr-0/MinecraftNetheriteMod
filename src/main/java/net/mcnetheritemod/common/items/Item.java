package net.mcnetheritemod.common.items;

import net.mcnetheritemod.init.Items;
import net.minecraft.creativetab.CreativeTabs;

public class Item extends net.minecraft.item.Item {
    public Item(String name, CreativeTabs tab){
        super();
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
        Items.items.add(this);
    }
}
