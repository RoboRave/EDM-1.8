package mods.roborave.edm.common;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
/*
 * WIP
 */
public class Ability {
	
	private static String name;
	private static Object ability;
	private static ItemArmor armor;

	public static HashMap<String,Ability> AbilityList = new HashMap<String, Ability>();

	public Ability(String par1String, Object player)
	{
		Ability.name=par1String;
		ability=player;
	}

	

	public Object getAbility() 
	{
		return Ability.ability;
	}
}
