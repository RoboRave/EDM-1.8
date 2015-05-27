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


/*
 * addOre(mods.roborave.edm.init.Blocks.getBlock("Black_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 64, 5, 7, 20);
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
	//@formatter:on

	public CurrentGenerator() {

		this.Black_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.BD.getDefaultState(),20);
		this.Blue_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.BLD.getDefaultState(),18);
		this.Gray_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.GD.getDefaultState(),16);
		this.Green_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.GRD.getDefaultState(),14);
		this.Orange_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.OD.getDefaultState(),12);
		this.Pink_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.PD.getDefaultState(),10);
		this.Purple_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.PUD.getDefaultState(),8);
		this.Red_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.RD.getDefaultState(),6);
		this.White_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.WD.getDefaultState(),4);
		this.Yellow_diamond = new WorldGenMinable(mods.roborave.edm.init.Blocks.YD.getDefaultState(),2);

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: // Overworld
			this.runGenerator(this.gen_tutorial_ore, world, random, chunkX, chunkZ, 20, 0, 64);
			this.runGenerator(this.gen_multi_ore, world, random, chunkX, chunkZ, 10, 0, 16);
			break;
		case -1: // Nether

			break;
		case 1: // End
			this.runGenerator(this.gen_cobblestone, world, random, chunkX, chunkZ, 10, 0, 80);
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
