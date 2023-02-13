package net.mcnetheritemod.util;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.mcnetheritemod.init.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler {
    public static void registerCustomMeshesAndStates() {
        for(Block fluidBlock : Blocks.fluids) {
            ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(fluidBlock), new ItemMeshDefinition() {
                public ModelResourceLocation getModelLocation(ItemStack stack) {
                    //这里是你的modid:流体名称
                    return new ModelResourceLocation(fluidBlock.getRegistryName().toString(), "fluid");
                }
            });

            ModelLoader.setCustomStateMapper(fluidBlock, new StateMapperBase() {
                protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                    //这里是你的modid:流体名称
                    return new ModelResourceLocation(fluidBlock.getRegistryName().toString(), "fluid");
                }
            });
        }
    }
}
