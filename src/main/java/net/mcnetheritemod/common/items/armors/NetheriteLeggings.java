package net.mcnetheritemod.common.items.armors;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class NetheriteLeggings extends ItemArmor {
    public NetheriteLeggings(){
        super(Materials.NETHERITE_ARMOR,1, EntityEquipmentSlot.LEGS);
        setUnlocalizedName("netherite_leggings");
        setRegistryName("netherite_leggings");
        Items.items.add(this);
    }
}
