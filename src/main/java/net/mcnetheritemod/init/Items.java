package net.mcnetheritemod.init;


import net.mcnetheritemod.common.items.armors.NetheriteBoots;
import net.mcnetheritemod.common.items.armors.NetheriteChest;
import net.mcnetheritemod.common.items.armors.NetheriteHelmet;
import net.mcnetheritemod.common.items.armors.NetheriteLeggings;
import net.mcnetheritemod.common.items.tools.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Items {
    public static List<Item> items = new ArrayList<>();
    public static final Item NETHERITE_INGOT= new net.mcnetheritemod.common.items.Item("netherite_ingot", CreativeTabs.MISC);
    public static final Item NETHERITE_AXE = new NetheriteAxe();
    public static final Item NETHERITE_HOE = new NetheriteHoe();
    public static final Item NETHERITE_PICKAXE = new NetheritePickaxe();
    public static final Item NETHERITE_SHOVEL = new NetheriteShovel();
    public static final Item NETHERITE_SWORD = new NetheriteSword();
    public static final Item NETHERITE_HELMET = new NetheriteHelmet();
    public static final Item NETHERITE_CHEST = new NetheriteChest();
    public static final Item NETHERITE_LEGGINGS = new NetheriteLeggings();
    public static final Item NETHERITE_BOOTS = new NetheriteBoots();
    public static final Item NETHERITE_SCRAP = new net.mcnetheritemod.common.items.Item("netherite_scrap",CreativeTabs.MISC);
    public static final Item NETHERITE_DUST = new net.mcnetheritemod.common.items.Item("netherite_dust",CreativeTabs.MISC);
    public static final Item NETHERITE_PLATE = new net.mcnetheritemod.common.items.Item("netherite_plate",CreativeTabs.MISC);

}
