package tutorial.DMAexample;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MyOreGenerator implements IWorldGenerator {
@Override
public void generate(Random random, int chunkX, int chunkZ, World world,
IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
/* runs 'generateNether' or 'generateSurface' depending on which dimension you're loading */
switch(world.provider.dimensionId) {
case -1: generateNether(world, random, chunkX*16, chunkZ*16);
break;
case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
break;
}
}
public void generateSurface(World world, Random random, int x, int z) {

	this.addOreSpawn(MyCode.hardOre, world, random, x, z, 16, 16, 100, 20, 0, 256);
	
	/**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     *
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for setting the maximum size of a vein
     * @param An int for the Number of chances available for the Block to spawn per-chunk
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/

}
public void generateNether(World world, Random random, int x, int z) {
}
public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY ){
for(int i = 0; i < chancesToSpawn; i++){
int posX = blockXPos + random.nextInt(maxX);
int posY = minY + random.nextInt(maxY -minY);
int posZ = blockZPos + random.nextInt(maxZ);
new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
}
}
}