package net.mcnetheritemod.common.world;

import net.mcnetheritemod.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
            case 0:
            case 1:
                break;
            case -1:
                generateAncentDebris(Blocks.ANCIENT_DEBRIS.getDefaultState(), world, random, chunkX*16, chunkZ*16, 8, 119, random.nextInt(3), 5);
        }
    }
    public void generateAncentDebris(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){
        int deltaY = maxY - minY;
        for (int i = 0; i < chances; i++)
        {
            BlockPos pos = new BlockPos(x+random.nextInt(16), minY+random.nextInt(deltaY), z+random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate (world, random, pos);
        }
    }
}
