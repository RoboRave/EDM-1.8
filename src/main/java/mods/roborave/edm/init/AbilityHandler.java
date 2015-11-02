package mods.roborave.edm.init;

import net.minecraft.entity.player.EntityPlayer;
import mods.roborave.edm.common.Ability;
/**
 * 
 * @author Zach
 *WIP 
 *TODO Make WORK
 */
public class AbilityHandler {

	public static Ability Fly;
	public static EntityPlayer player;
	public static void fly()
	{
		 player.capabilities.allowFlying = true;
	}
	public static void init() 
	{
		
		Fly= new Ability("Fly",Fly);
	}
	
}
