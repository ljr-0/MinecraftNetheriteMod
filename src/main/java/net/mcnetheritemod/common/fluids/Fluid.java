package net.mcnetheritemod.common.fluids;

import net.minecraft.util.ResourceLocation;

public class Fluid extends net.minecraftforge.fluids.Fluid {
    public Fluid(String name, ResourceLocation still,ResourceLocation flow){
        super(name,still,flow);
        this.setUnlocalizedName(name);
    }
}
