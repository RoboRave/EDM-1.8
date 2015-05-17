package mods.roborave.edm.helper.ore.generate;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class RetroGenerationManager implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}

	}
	
	     /**
	     *
	     * This method adds our block to the world.
	     * It randomizes the coordinates, and does that as many times, as defined in spawnChance.
	     * Then it gives all the params to WorldGenMinable, which handles the replacing of the ores for us.
	     *
	     * @param block The block you want to spawn
	     * @param world The world
	     * @param random The Random
	     * @param blockXPos the blockXpos of a chunk
	     * @param blockZPos the blockZpos of a chunk
	     * @param minVeinSize min vein
	     * @param maxVeinSize max vein
	     * @param chancesToSpawn the chance to spawn. Usually around 2
	     * @param minY lowest point to spawn
	     * @param maxY highest point to spawn
	     */
	 /*
	    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
	    {
	    	BlockPos blockpos1 = new BlockPos(posX, posY, j2);

            if (world.getBlockState(blockpos1).getBlock().isReplaceableOreGen(world, blockpos1, this.field_175919_c))
            {
                world.setBlockState(blockpos1, block.getDefaultState(), 2);
	        WorldGenMinable minable = new WorldGenMinable(block.getDefaultState(), (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)));
	        for(int i = 0; i < chancesToSpawn; i++)
	        {
	            int posX = blockXPos + random.nextInt(16);
	            int posY = minY + random.nextInt(maxY - minY);
	            int posZ = blockZPos + random.nextInt(16);
	            minable.generate(world, random,new BlockPos(posX, posY, posZ));
	        }
	    }
	    */
    private void generateEnd(Random random, int chunkX, int chunkZ, World world) 
	{
		
	}

	private void generateSurface(Random random, int chunkX, int chunkZ, World world) 
	{
		/*
		addOre(mods.roborave.edm.init.Blocks.getBlock("Black_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 64, 5, 7, 20);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Blue_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 60, 5, 7, 18);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Gray_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 56, 5, 7, 16);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Green_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 54, 5, 7,14);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Orange_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 52, 5, 7,12);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Pink_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 50, 5, 7, 10);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Purple_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 48, 5, 7,8);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Red_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 46, 5, 7,6);
		addOre(mods.roborave.edm.init.Blocks.getBlock("White_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 44, 5, 7,4);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Yellow_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 42, 5, 7,2);
	*/
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) 
	{
		
	}

}