package net.mcnetheritemod.common.items.tools;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class NetheriteShovel extends ItemSpade {
    public NetheriteShovel(){
        super(Materials.NETHERITE);
        setUnlocalizedName("netherite_shovel");
        setRegistryName("netherite_shovel");
        Items.items.add(this);
    }
}
