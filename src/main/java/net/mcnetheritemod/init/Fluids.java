package net.mcnetheritemod.init;

import net.mcnetheritemod.NetheriteMod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class Fluids {
    public static final net.mcnetheritemod.common.fluids.Fluid MOLTEN_NETHERITE = new net.mcnetheritemod.common.fluids.Fluid("molten_netherite",new ResourceLocation(NetheriteMod.MOD_ID+":blocks/molten_netherite_still"),new ResourceLocation(NetheriteMod.MOD_ID+":blocks/molten_netherite_flow"));
    public static void registerFluids() {
        registerFluid(MOLTEN_NETHERITE);
    }

    public static void registerFluid(Fluid fluid) {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }
}
