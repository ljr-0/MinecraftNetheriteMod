package net.mcnetheritemod.common.items.armors;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class NetheriteHelmet extends ItemArmor {
    public NetheriteHelmet(){
        super(Materials.NETHERITE_ARMOR,1, EntityEquipmentSlot.HEAD);
        setUnlocalizedName("netherite_helmet");
        setRegistryName("netherite_helmet");
        Items.items.add(this);
    }
}
