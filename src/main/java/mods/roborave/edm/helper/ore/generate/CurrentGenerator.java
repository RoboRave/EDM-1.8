package mods.roborave.edm.helper.ore.generate;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CurrentGenerator implements IWorldGenerator {
	//@formatter:off

	private WorldGenerator gen_tutorial_ore; 	// Generates Tutorial Ore (used in Overworld)
	private WorldGenerator gen_multi_ore;		// Generates Multi Ore (used in Overworld)
	private WorldGenerator gen_cobblestone;		// Generates Cobblestone (used in End)
	private WorldGenerator Black_diamond;
	private WorldGenerator Blue_diamond;
	private WorldGenerator Gray_diamond;
	private WorldGenerator Green_diamond;
	private WorldGenerator Orange_diamond;
	private WorldGenerator Pink_diamond;
	private WorldGenerator Purple_diamond;
	private WorldGenerator Red_diamond;
	private WorldGenerator White_diamond;
	private WorldGenerator Yellow_diamond;

	public CurrentGenerator() {

		this.Black_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.BLDO.getDefaultState(),5);
		this.Blue_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.BLDO.getDefaultState(),5);
		this.Gray_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.GDO.getDefaultState(),5);
		this.Green_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.GRDO.getDefaultState(),5);
		this.Orange_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.ODO.getDefaultState(),4);
		this.Pink_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.PDO.getDefaultState(),4);
		this.Purple_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.PUDO.getDefaultState(),4);
		this.Red_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.RDO.getDefaultState(),2);
		this.White_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.WDO.getDefaultState(),2);
		this.Yellow_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.YDO.getDefaultState(),2);

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: // Overworld
			this.runGenerator(this.Black_diamond, world, random, chunkX, chunkZ, 20, 15, 64);
			this.runGenerator(this.Blue_diamond, world, random, chunkX, chunkZ, 18, 15, 60);
			this.runGenerator(this.Gray_diamond, world, random, chunkX, chunkZ, 16, 15, 56);
			this.runGenerator(this.Green_diamond, world, random, chunkX, chunkZ, 14, 15, 54);
			this.runGenerator(this.Orange_diamond, world, random, chunkX, chunkZ, 12, 15,52);
			this.runGenerator(this.Pink_diamond, world, random, chunkX, chunkZ, 10, 15, 50);
			this.runGenerator(this.Purple_diamond, world, random, chunkX, chunkZ, 8, 15, 46);
			this.runGenerator(this.Red_diamond, world, random, chunkX, chunkZ, 6, 15, 44);
			this.runGenerator(this.White_diamond, world, random, chunkX, chunkZ, 4, 15, 42);
			this.runGenerator(this.Yellow_diamond, world, random, chunkX, chunkZ, 2, 15, 40);
			/*
			 * addOre(mods.roborave.edm.init.Blocks.getBlock("Yellow_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 42, 5, 7,2);
			 */
			break;
		case -1: // Nether

			break;
		case 1: // End
			//this.runGenerator(this.gen_cobblestone, world, random, chunkX, chunkZ, 10, 0, 80);
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
