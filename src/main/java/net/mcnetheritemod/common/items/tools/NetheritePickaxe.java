package net.mcnetheritemod.common.items.tools;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.item.ItemPickaxe;

public class NetheritePickaxe extends ItemPickaxe {
    public NetheritePickaxe(){
        super(Materials.NETHERITE);
        setUnlocalizedName("netherite_pickaxe");
        setRegistryName("netherite_pickaxe");
        Items.items.add(this);
    }
}
