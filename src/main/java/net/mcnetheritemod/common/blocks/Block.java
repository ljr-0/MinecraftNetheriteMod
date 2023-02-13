package net.mcnetheritemod.common.blocks;

import net.mcnetheritemod.init.*;
import net.mcnetheritemod.init.Items;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Block extends net.minecraft.block.Block {
    public Item item;
    public Block(String name, CreativeTabs tab, Material mat){
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        this.item = new ItemBlock(this).setRegistryName(this.getRegistryName());
        Blocks.blocks.add(this);
        Items.items.add(this.item);
    }
}
