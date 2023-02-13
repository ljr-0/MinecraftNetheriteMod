package net.mcnetheritemod.common.items.tools;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class NetheriteSword extends ItemSword {
    public NetheriteSword(){
        super(Materials.NETHERITE);
        setUnlocalizedName("netherite_sword");
        setRegistryName("netherite_sword");
        Items.items.add(this);
    }
}
