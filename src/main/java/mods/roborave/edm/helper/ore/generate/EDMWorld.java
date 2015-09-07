package mods.roborave.edm.helper.ore.generate;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EDMWorld {
	public static void init()
	{
		initialiseWorldGen();
	}

	public static void initialiseWorldGen()
	{
		try{
		//	registerWorldGen(new RetroGenerationManager(), 1);
			registerWorldGen(new CurrentGenerator(),1);
		}
			catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity)
	{
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
}