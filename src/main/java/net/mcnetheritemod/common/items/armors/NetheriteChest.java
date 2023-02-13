package net.mcnetheritemod.common.items.armors;

import net.mcnetheritemod.init.Items;
import net.mcnetheritemod.init.Materials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class NetheriteChest extends ItemArmor {
    public NetheriteChest(){
        super(Materials.NETHERITE_ARMOR,1, EntityEquipmentSlot.CHEST);
        setUnlocalizedName("netherite_chestplate");
        setRegistryName("netherite_chestplate");
        Items.items.add(this);
    }
}
