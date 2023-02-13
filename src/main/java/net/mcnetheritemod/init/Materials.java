package net.mcnetheritemod.init;

import net.mcnetheritemod.NetheriteMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    public static final Item.ToolMaterial NETHERITE = EnumHelper.addToolMaterial("netherite",4,2031,9.0f,4.0f,15);
    public static final ItemArmor.ArmorMaterial NETHERITE_ARMOR = EnumHelper.addArmorMaterial("netherite", NetheriteMod.MOD_ID+":netherite",37,new int[]{3, 6, 8, 3},15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,3.0f);
}
