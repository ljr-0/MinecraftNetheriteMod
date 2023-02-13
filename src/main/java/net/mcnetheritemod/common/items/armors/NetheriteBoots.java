package net.mcnetheritemod.common.items.armors;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class NetheriteBoots extends ItemArmor {
    public NetheriteBoots(){
        super(Materials.NETHERITE_ARMOR,1, EntityEquipmentSlot.FEET);
        setUnlocalizedName("netherite_boots");
        setRegistryName("netherite_boots");
        Items.items.add(this);
    }
}
