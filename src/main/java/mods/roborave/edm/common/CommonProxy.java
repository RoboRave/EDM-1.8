package mods.roborave.edm.common;

import mods.roborave.edm.init.Armor;
import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.init.Items;
import mods.roborave.edm.init.Recipes;
import mods.roborave.edm.interfaces.IProxy;
import mods.roborave.edm.tick.VersionTicker;
import mods.roborave.edm.tweaker.Tweaker;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class CommonProxy implements IProxy
{

	@Override
	public void PreInit() 
	{
		//WIP doesn't work
		//TODO make work
		//AbilityHandler.init();
	}
	
	@Override
	public void Init() 
	{
		//EDMWorld.init();
		Blocks.init();
		Items.init();
		Armor.init();
		Recipes.init();
		
		try{
			Tweaker.load();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public World getClientWorld() 
	{
		return null;
	}

	public void registerTickers() 
	{
		FMLCommonHandler.instance().bus().register(new VersionTicker());
	}
}
